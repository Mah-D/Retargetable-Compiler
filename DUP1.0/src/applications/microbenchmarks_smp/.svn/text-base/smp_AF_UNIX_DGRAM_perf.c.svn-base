/*
 * AF_UNIX_DGRAM_perf.c
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 *
 *  - Implementation methodology
 *  Using Unix Domain Socket with datagram option,
 *  send packet to a server process which will echo back the same packet
 *  If the same packet is received, we're sure that packet is successfully transferred.
 *
 *  - Assumption
 *    Relying on basis that we'll NOT lose packet using datagram.
 *
 *  - Inaccuracy
 *  Measurement overhead includes additional time
 *  taken by server echoing back the same packet.
 */

#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/un.h>
#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <netdb.h>
#include <unistd.h>
#include <assert.h>

#include <pthread.h>
#include <semaphore.h>
#include <sys/shm.h>
#include <sys/stat.h>

#include "common.h"
#include "helper_lib.h"
#include "AF_UNIX_DGRAM_common.h"

typedef struct
{
	size_t block_size;
	unsigned int iter;
} SHM_DATA_STRUCT;

static sem_t sem_1[NUM_OF_CORES];
static sem_t sem_2[NUM_OF_CORES];
static int segment_id;
static char *shared_memory;

//note that type can either be SOCK_DGRAM or SOCK_STREAM
static int setup_unix_domain_dgram_socket(int core_num) {
	int sock;
	struct sockaddr_un servaddr;/* address of server */
	struct sockaddr_un clntaddr;/* address of client */
	char socket_path_client[256];
	sprintf(socket_path_client, "%s-%d", DGRAM_SOCKET_PATHCLNT, core_num);
	/* Create a UNIX datagram socket for client */
	unlink(socket_path_client);

	if ((sock = socket(AF_UNIX, SOCK_DGRAM, 0)) < 0) {
		perror("client: socket");
		exit(2);
	}
	bzero(&servaddr, sizeof(servaddr));

	servaddr.sun_family = AF_UNIX;
	strcpy(servaddr.sun_path, socket_path_client);

	if (bind(sock, (struct sockaddr *) &servaddr, sizeof(servaddr)) < 0) {
		perror("server: bind");
		close(sock);
		exit(2);
	}
	/*      Client will bind to an address so the server will
	 *       get an address in its recvfrom call and use it to
	 *       send data back to the client.
	 */
	bzero(&clntaddr, sizeof(clntaddr));
	clntaddr.sun_family = AF_UNIX;
	//strcpy(clntaddr.sun_path, SOCKET_PATH);
	sprintf(clntaddr.sun_path, "%s-%d", DGRAM_SOCKET_PATH, core_num);

	if (connect(sock, (struct sockaddr *) &clntaddr, sizeof(clntaddr)) < 0) {
		perror("client: connect");
		close(sock);
		exit(3);
	}
	return sock;
}


static uint64_t AF_UNIX_DGRAM_perf(int sock, size_t blocksize, unsigned int iter)
{
	assert(blocksize <= DGRAM_BUFF_SIZE);

	size_t nbytes;

	unsigned int i;
	char *sdata = malloc(blocksize);
	memset(sdata, 'a', blocksize);
	char *rdata = malloc(blocksize);
	char ack_array[strlen(ACK_STRING)+1]; //large enough to hold ACK_STR
	memset(ack_array, 0, strlen(ACK_STRING)+1);
	struct DgramMeta meta;

	meta.size = blocksize;
	meta.iter = iter;
	nbytes = send (sock,
		       &meta, sizeof (meta), 0);
	if (nbytes != sizeof (meta)) abort ();

	for(i = 0; i < iter; i++)
	{
		//take care of partial send case
		nbytes = send (sock,
			       sdata, blocksize, 0);
		if (nbytes != blocksize) abort();
		if(bidirectional)
		{
			nbytes = recv(sock, rdata, blocksize, 0);
			if (nbytes != blocksize) abort();
		}
	}
	if(!bidirectional)
	{
		nbytes = recv(sock, ack_array, strlen(ACK_STRING), 0);
		if (nbytes != strlen(ACK_STRING)) abort();
	}
	free(rdata);
	free(sdata);

	return 0;
}

void af_unix_dgram_client_cleanup(void *ptr) {
	char socket_client_path[256];
	sprintf(socket_client_path, "%s-%d", DGRAM_SOCKET_PATHCLNT, ((THREAD_DATA_STRUCT *) ptr)->core_id);
	unlink(socket_client_path);
	close(((THREAD_DATA_STRUCT *) ptr)->sock_fd);

	free(ptr);
}

void thread_af_unix_dgram_client(void *ptr) {
	int sock_fd;
	SHM_DATA_STRUCT shm_data;
	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);

	sock_fd = setup_unix_domain_dgram_socket(my_data.core_id);
	((THREAD_DATA_STRUCT *) ptr)->sock_fd = sock_fd;
	//pass argument to cleanup handler, close socket before thread exit
	pthread_cleanup_push(af_unix_dgram_client_cleanup, ptr);

	while (1) {
		//wait from command from master thread
		sem_wait(&sem_1[my_data.core_id]);
		//get current block size and iteration from shared memory
		memcpy(&shm_data, shared_memory, sizeof(SHM_DATA_STRUCT));
		//start one round of data communication
		AF_UNIX_DGRAM_perf(sock_fd, shm_data.block_size, shm_data.iter);
		//signal master thread that I'm done
		sem_post(&sem_2[my_data.core_id]);
	}

	//this helper thread is ready to exit, mission completed!
	pthread_cleanup_pop(1);

}

int af_unix_dgram_server_main(void *ptr);
void af_unix_dgram_server_cleanup(void *ptr);

void thread_af_unix_dgram_server(void *ptr) {

	pthread_cleanup_push(af_unix_dgram_server_cleanup, ptr);

	thread_bind_to_core(pthread_self(), ((SERVER_THREAD_DATA_STRUCT *)ptr)->run_on_core);

	af_unix_dgram_server_main(ptr);

	pthread_cleanup_pop(1);

}

static pthread_t thread_server[NUM_OF_CORES];
static pthread_t thread_client[NUM_OF_CORES];

uint64_t smp_unix_domain_dgram_interface(size_t blocksize, unsigned int iter,
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
					(void *) &thread_af_unix_dgram_server, (void *) my_data)
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
					(void *) &thread_af_unix_dgram_client, (void *) my_data)
					!= 0) {
				perror("pthread_create");
			}
		}
		return 0;
		break;

	case MAIN_BODY:
		if (blocksize > DGRAM_BUFF_SIZE) {
				return 0;
		}

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
		//destroy semaphores
		for (i = 0; i < num_of_cores; i++) {
			sem_destroy(&sem_1[i]);
			sem_destroy(&sem_2[i]);
		}
		//destroy threads
		for (i = 0; i < num_of_cores; i++) {
			pthread_cancel(thread_client[i]);
		}
		sleep(2);
		for (i = 0; i < num_of_cores; i++) {
			pthread_cancel(thread_server[i]);
		}
		//ready to join and only 1 master thread exists now!
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

