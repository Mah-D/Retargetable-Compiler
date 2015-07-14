/*
 * SMP_AF_UNIX_STREAM_perf.c
 *
 *  Created on: Jan 14, 2010
 *      Author: liangxue
 */

/*
 * unix_domain_stream_client.c
 *
 *  Created on: Nov 10, 2009
 *      Author: liangxue
 *
 *  Description: This is a Unix Domain version of STREAM socket,
 *  Structurally it's similar to TCP socket file.
 */

#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <unistd.h>
#include <signal.h>

#include <pthread.h>
#include <semaphore.h>
#include <sys/shm.h>
#include <sys/stat.h>

#include "helper_lib.h"
#include "client_server_common.h"
#include "smp_AF_UNIX_STREAM_perf.h"

typedef struct
{
	size_t block_size;
	unsigned int iter;
} SHM_DATA_STRUCT;

static sem_t sem_1[NUM_OF_CORES];
static sem_t sem_2[NUM_OF_CORES];
static int segment_id;
static char *shared_memory;

static int setup_socket_to_server(int core_num) {
	int len;
	struct sockaddr_un remote;
	int sock_fd;
	if ((sock_fd = socket(AF_UNIX, SOCK_STREAM, 0)) == -1) {
		perror("socket");
		exit(1);
	}

	remote.sun_family = AF_UNIX;
	//strcpy(remote.sun_path, SOCK_PATH);
	sprintf(remote.sun_path, "%s-%d", SOCK_PATH, core_num);
	len = strlen(remote.sun_path) + sizeof(remote.sun_family);
	if (connect(sock_fd, (struct sockaddr *) &remote, len) == -1) {
		perror("connect");
		exit(1);
	}

	return sock_fd;
}

static int domain_socket_perf(int sock_fd, size_t blocksize, unsigned int iter) {
	char *sendall_buf = malloc(blocksize);
	memset(sendall_buf, 'a', blocksize);
	transfer_data_to_socket(sock_fd, sendall_buf, blocksize, iter);
	free(sendall_buf);
	return 0;
}

void af_unix_stream_client_cleanup(void *ptr) {
	//printf("Destroying client %d \n", ((THREAD_DATA_STRUCT *)ptr)->core_id);
	if (sendall(((THREAD_DATA_STRUCT *) ptr)->sock_fd, OK_TO_CLOSE_SOCKET,
			strlen(OK_TO_CLOSE_SOCKET), 0) == -1) {
		printf("error occurred when telling server closing socket\n");
		exit(1);
	}
	close(((THREAD_DATA_STRUCT *) ptr)->sock_fd);

	free(ptr);
}

void thread_af_unix_stream_client(void *ptr) {
	int sock_fd;
	SHM_DATA_STRUCT shm_data;
	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);


	sock_fd = setup_socket_to_server(my_data.core_id);
	((THREAD_DATA_STRUCT *) ptr)->sock_fd = sock_fd;
	//pass argument to cleanup handler, close socket before thread exit
	pthread_cleanup_push(af_unix_stream_client_cleanup, ptr);

	while (1) {
		//wait from command from master thread
		sem_wait(&sem_1[my_data.core_id]);
		//get current block size and iteration from shared memory
		memcpy(&shm_data, shared_memory, sizeof(SHM_DATA_STRUCT));
		//start one round of data communication
		domain_socket_perf(sock_fd, shm_data.block_size, shm_data.iter);
		//signal master thread that I'm done
		sem_post(&sem_2[my_data.core_id]);
	}

	//this helper thread is ready to exit, mission completed!
	pthread_cleanup_pop(1);

}

int AF_UNIX_STREAM_main(void *ptr);

void af_unix_stream_server_cleanup(void *ptr);

void thread_af_unix_stream_server(void *ptr) {

	pthread_cleanup_push(af_unix_stream_server_cleanup, ptr);

	thread_bind_to_core(pthread_self(), ((SERVER_THREAD_DATA_STRUCT *)ptr)->run_on_core);

	AF_UNIX_STREAM_main(ptr);
	pthread_cleanup_pop(1);

}

static pthread_t thread_server[NUM_OF_CORES];
static pthread_t thread_client[NUM_OF_CORES];

uint64_t smp_unix_domain_stream_interface(size_t blocksize, unsigned int iter,
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
					(void *) &thread_af_unix_stream_server, (void *) my_data)
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
					(void *) &thread_af_unix_stream_client, (void *) my_data)
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

			}

			if (pthread_join(thread_server[i], NULL) != 0) {

			}
		}
		return 0;
		break;
	default:
		exit(1);
	}
}
