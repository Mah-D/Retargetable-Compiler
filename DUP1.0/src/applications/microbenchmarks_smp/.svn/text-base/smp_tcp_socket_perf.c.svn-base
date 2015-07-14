/*
 * socket_perf.c
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */

/*
 ** client.c -- a stream socket client demo
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <netinet/tcp.h>
#include <signal.h>
#include <pthread.h>
#include <semaphore.h>
#include <sys/shm.h>
#include <sys/stat.h>

#include "helper_lib.h"
#include "common.h"
#include "client_server_common.h"
#include "smp_tcp_socket_perf.h"


typedef struct
{
	size_t block_size;
	unsigned int iter;
} SHM_DATA_STRUCT;

static sem_t sem_1[NUM_OF_CORES];
static sem_t sem_2[NUM_OF_CORES];
static int segment_id;
static char *shared_memory;

// get sockaddr, IPv4 or IPv6:
static void *get_in_addr(struct sockaddr *sa) {
	if (sa->sa_family == AF_INET) {
		return &(((struct sockaddr_in*) sa)->sin_addr);
	}

	return &(((struct sockaddr_in6*) sa)->sin6_addr);
}

static int setup_socket_to_server(char *server_ip, char *my_port) {

	struct addrinfo hints, *servinfo, *p;
	int rv;
	char s[INET6_ADDRSTRLEN];
	int sock_fd;

	memset(&hints, 0, sizeof hints);
	hints.ai_family = AF_UNSPEC;
	hints.ai_socktype = SOCK_STREAM;

	if ((rv = getaddrinfo(server_ip, my_port, &hints, &servinfo)) != 0) {
		fprintf(stderr, "getaddrinfo: %s\n", gai_strerror(rv));
		return 1;
	}

	// loop through all the results and connect to the first we can
	for (p = servinfo; p != NULL; p = p->ai_next) {
		if ((sock_fd = socket(p->ai_family, p->ai_socktype, p->ai_protocol))
				== -1) {
			perror("client: socket");
			continue;
		}

		if (connect(sock_fd, p->ai_addr, p->ai_addrlen) == -1) {
			close(sock_fd);
			perror("client: connect");
			continue;
		}

		break;
	}

	if (p == NULL) {
		fprintf(stderr, "client: failed to connect\n");
		return 2;
	}

	inet_ntop(p->ai_family, get_in_addr((struct sockaddr *) p->ai_addr), s,
			sizeof s);
	//printf("client: connecting to %s\n", s);

	freeaddrinfo(servinfo); // all done with this structure

	//return socket descriptor
	return sock_fd;
}

/*
 * Measure socket performance EXCLUDING socket setup/close overhead
 * - first establish tcp connection with server
 * - then measure the time spent for transferring raw data
 * - close connection
 */
//Question - how will the measured result be affected by server's performance?
static int tcp_socket_perf(int sock_fd, size_t blocksize, unsigned int iter) {

	char *sendall_buf = malloc(blocksize);
	memset(sendall_buf, 'a', blocksize);
	/*
	 * this snd/recv buffer size may possibly to fine-tuned
	 * but to change the default socket buffer size,
	 * we have to change that in Linux kernel side too
	 */
	transfer_data_to_socket(sock_fd, sendall_buf, blocksize, iter);

	free(sendall_buf);
	return 0;
}

void tcp_loopback_client_cleanup(void *ptr) {
	//printf("Destroying client %d \n", ((THREAD_DATA_STRUCT *)ptr)->core_id);
	if (sendall(((THREAD_DATA_STRUCT *) ptr)->sock_fd, OK_TO_CLOSE_SOCKET,
			strlen(OK_TO_CLOSE_SOCKET), 0) == -1) {
		printf("error occurred when telling server closing socket\n");
		exit(1);
	}
	close(((THREAD_DATA_STRUCT *) ptr)->sock_fd);

	free(ptr);
}

void thread_tcp_loopback_client(void *ptr) {
	int sock_fd;
	SHM_DATA_STRUCT shm_data;
	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);

	//thread_bind_to_core(pthread_self(), my_data.core_id);
	char my_port[256] = {0};
	sprintf(my_port, "%d", TCP_LOOPBACK_PORT_NUM + my_data.core_id);
	sock_fd = setup_socket_to_server("127.0.0.1", my_port);

	//copy into thread data storage for cleanup use!
	((THREAD_DATA_STRUCT *) ptr)->sock_fd = sock_fd;
	//pass argument to cleanup handler, close socket before thread exit
	pthread_cleanup_push(tcp_loopback_client_cleanup, ptr);

	while (1) {
		//wait from command from master thread
		sem_wait(&sem_1[my_data.core_id]);
		//get current block size and iteration from shared memory
		memcpy(&shm_data, shared_memory, sizeof(SHM_DATA_STRUCT));
		//start one round of data communication
		tcp_socket_perf(sock_fd, shm_data.block_size, shm_data.iter);
		//signal master thread that I'm done
		sem_post(&sem_2[my_data.core_id]);
	}

	//this helper thread is ready to exit, mission completed!
	pthread_cleanup_pop(1);

}

void tcp_loopback_server_cleanup(void *ptr);

int tcp_simple_sever_main(void *ptr);

void thread_tcp_loopback_server(void *ptr) {

	pthread_cleanup_push(tcp_loopback_server_cleanup, ptr);

	//set affinity of current thread
	thread_bind_to_core(pthread_self(), ((SERVER_THREAD_DATA_STRUCT *)ptr)->run_on_core);


	tcp_simple_sever_main(ptr);
	pthread_cleanup_pop(1);

}

static pthread_t thread_server[NUM_OF_CORES];
static pthread_t thread_client[NUM_OF_CORES];

uint64_t smp_tcp_loopback_interface(size_t blocksize, unsigned int iter,
		MEASUREMENT_STATE state) {

	//unsigned int num_of_cores = sysconf(_SC_NPROCESSORS_ONLN);
	unsigned int num_of_cores = conf_num_of_thread_pairs;

	int i = 0;
	uint64_t start, stop;

	switch (state) {
	case START_UP:
		//shared memory setup overhead
		segment_id = shmget(IPC_PRIVATE, sizeof(SHM_DATA_STRUCT), IPC_CREAT | IPC_EXCL
				| S_IRUSR | S_IWUSR);

		if (segment_id == -1) {
			perror("shmget");
			exit(1);
		}
		/* Attach the shared memory segment. */
		if ((shared_memory = (char*) shmat(segment_id, 0, 0)) == NULL) {
			perror("shmat");
			exit(1);
		}

		for (i = 0; i < num_of_cores; i++) {
			if (sem_init(&sem_1[i], 0, 0) < 0) {
				perror("sem_init");
				exit(1);
			}
			if (sem_init(&sem_2[i], 0, 0) < 0) {
				perror("sem_init");
				exit(1);
			}
		}

		for (i = 0; i < num_of_cores; i++) {
			SERVER_THREAD_DATA_STRUCT *my_data =
					(SERVER_THREAD_DATA_STRUCT *) malloc(
							sizeof(THREAD_DATA_STRUCT));
			my_data->core_id = i;
			my_data->run_on_core = thread_server_on_core[i];
			if (pthread_create(&thread_server[i], NULL,
					(void *) &thread_tcp_loopback_server, (void *) my_data)
					!= 0) {
				perror("pthread_create");
			}
		}
		sleep(3);
		for (i = 0; i < num_of_cores; i++) {
			THREAD_DATA_STRUCT *my_data = (THREAD_DATA_STRUCT *) malloc(
					sizeof(THREAD_DATA_STRUCT));
			my_data->core_id = i;
			my_data->run_on_core = thread_client_on_core[i];
			if (pthread_create(&thread_client[i], NULL,
					(void *) &thread_tcp_loopback_client, (void *) my_data)
					!= 0) {
				perror("pthread_create");
			}
		}
		return 0;
		break;

	case MAIN_BODY:
		start = get_time();
		SHM_DATA_STRUCT shm_data;
		shm_data.block_size = blocksize;
		shm_data.iter = iter;
		memcpy(shared_memory, &shm_data, sizeof(SHM_DATA_STRUCT));
		for (i = 0; i < num_of_cores; i++) {
			sem_post(&sem_1[i]);
		}
		for (i = 0; i < num_of_cores; i++) {
			sem_wait(&sem_2[i]);
		}
		stop = get_time();
		sleep(1);
		return stop - start;
		break;

	case CLEAN_UP:
		/* Detach the shared memory segment. */
		shmdt(shared_memory);
		/* Deallocate the shared memory segment.  */
		shmctl(segment_id, IPC_RMID, 0);
		for (i = 0; i < num_of_cores; i++) {
			sem_destroy(&sem_1[i]);
			sem_destroy(&sem_2[i]);
		}
		for (i = 0; i < num_of_cores; i++) {
			pthread_cancel(thread_client[i]);
		}
		sleep(2);
		for (i = 0; i < num_of_cores; i++) {
			pthread_cancel(thread_server[i]);
		}
		for (i = 0; i < num_of_cores; i++) {
			if (pthread_join(thread_client[i], NULL) != 0) {
				perror("pthread_join");
			}

			if (pthread_join(thread_server[i], NULL) != 0) {
				perror("pthread_join");
			}
		}
		return 0;
		break;
	default:
		exit(1);
	}
}
