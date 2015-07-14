/*
 * message_queue_perf.c
 *
 *  Created on: Dec 13, 2009
 *      Author: liangxue
 *  Beta Release
 *  Description: Message Queue - code structure is similar to that of pipe.
 *  For each message passing through message queue, the first few bytes (4 or 8 bytes)
 *  will be forcibly set to a long integer to simulate message type. Read documentation.
 *
 *  Note that this may not work if message queue id already exists
 *  In that case, run "iprcm -q msqid" to remove suspicious existing message queues
 *
 *  Consideration:
 *  1. Will send process overflowed the message queue buffer? if there is no synchronization as in the case of unidirectional!
 *  2. http://linux.die.net/man/2/msgsnd
 *  msgmni: The number of IPC message queue resources allowed (by default, 16).
 *	msgmnb: The size of each message (by default, 8,192 bytes).
 *	msgmax: The maximum total size of the messages in a queue (by default, 16,384 bytes).
 *  3.
 */

#include "smp_msq_perf.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>

#include <sys/wait.h>
#include <errno.h>
#include <assert.h>
#include <pthread.h>

#include "helper_lib.h"

#define ACK_STR "received!\0"
//to generate a unique key, an already existing file has to be used
#define KEY_STR "."
//global variable - threaded problem!
/********************************************/
//to distinguish normal data messages and acknowledgment messages
static const long ack_msg_type = 11;
static const long raw_data_type = 1;
/********************************************/
typedef struct
{
	size_t blocksize;
	unsigned int iter;
	unsigned int core_id;
	int run_on_core;
	int msq_id;
} THREAD_DATA_STRUCT;

//global variable bidirectional shared by multithreads...!
//place data into message queue's internal buffer
static void transfer_data_to_msq(size_t blocksize, unsigned int iter, int msq_id, char *buffer_parent_1, char *buffer_parent_2)
{
	unsigned int i;
	//msg queue is bidirectional, distinguish messages by type
	char ack_array[strlen(ACK_STR)+sizeof(long)]; //large enough to hold ACK_STR
	memset(ack_array, 0, strlen(ACK_STR)+sizeof(long));

	for(i = 0; i < iter; i++)
	{
		//write
		if(msgsnd(msq_id, buffer_parent_1, blocksize, 0) == -1)
		{
			fprintf(stderr, "error sending to message queue: %s\n", strerror(errno));
			exit(1);
		}
		//expecting message to be echoed back
		if(bidirectional)
		{
			if(msgrcv(msq_id, buffer_parent_2, blocksize, ack_msg_type, 0) == -1)
			{
				fprintf(stderr, "error receiving from message queue: %s\n", strerror(errno));
				exit(1);
			}
		}
	}
	//unidirection measurement - a single ACK when all messages are sent
	if(!bidirectional)
	{
		//check for ACK, and this is a blocking call
		if (msgrcv(msq_id, ack_array, strlen(ACK_STR)+sizeof(long), ack_msg_type, 0) == -1)
		{
			fprintf(stderr, "error receiving ACK\n");
			exit(1);
		}
		if(strncmp(ack_array+sizeof(long), ACK_STR, strlen(ACK_STR)) != 0)
		{
			printf("Error receving acknowledgment!\n");
			exit(1);
		}
	}

}

static void msq_cooperation(size_t blocksize, unsigned int iter, int msq_id, char *buffer_child_1, char *buffer_child_2, char *buffer_ack)
{
	unsigned int i;

	for(i = 0; i < iter; i++)
	{
		if (msgrcv(msq_id, buffer_child_1, blocksize, raw_data_type, 0) == -1)
		{
			printf("Error receiving from message queue\n");
			exit(1);
		}
		if(bidirectional)
		{
			if(msgsnd(msq_id, buffer_child_2, blocksize, 0) == -1)
			{
				fprintf(stderr, "error sending to message queue: %s\n", strerror(errno));
				exit(1);
			}
		}
	}

	if(!bidirectional)
	{
		if(msgsnd(msq_id, buffer_ack, strlen(ACK_STR)+sizeof(long), 0) == -1)
		{
			fprintf(stderr, "error sending ACK\n");
			exit(1);
		}
	}
}

void thread_msq_snd(void *ptr) {

	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);

	size_t blocksize = my_data.blocksize;

	char *data_buffer1 = calloc(blocksize, sizeof(size_t));
	char *data_buffer2 = calloc(blocksize, sizeof(size_t));
	memcpy(data_buffer1, &raw_data_type, sizeof(long));
	memcpy(data_buffer2, &ack_msg_type, sizeof(long));
	//for debugging only, memory pattern
	unsigned int index = 0;
	while (index < (blocksize - sizeof(long))) {
		*(data_buffer1 + sizeof(long)) = 'm';
		*(data_buffer2 + sizeof(long)) = 'k';
		index++;
	}

	transfer_data_to_msq(my_data.blocksize, my_data.iter, my_data.msq_id,
			data_buffer1, data_buffer2);

	free(data_buffer2);
	free(data_buffer1);
	//this helper thread is ready to exit, mission completed!
	free(ptr);
	pthread_exit(0); /* exit thread */
}

void thread_msq_rcv(void *ptr) {

	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);

	size_t blocksize = my_data.blocksize;

	char *data_buffer1 = calloc(blocksize, sizeof(size_t));
	char *data_buffer2 = calloc(blocksize, sizeof(size_t));
	memcpy(data_buffer1, &raw_data_type, sizeof(long));
	memcpy(data_buffer2, &ack_msg_type, sizeof(long));
	//for debugging only, memory pattern
	unsigned int index = 0;
	while (index < (blocksize - sizeof(long))) {
		*(data_buffer1 + sizeof(long)) = 'm';
		*(data_buffer2 + sizeof(long)) = 'k';
		index++;
	}
	//compose ack message: it has to use a different msg type from normal data
	char ack_array[strlen(ACK_STR)+sizeof(long)];
	memcpy(ack_array, &ack_msg_type, sizeof(long));
	memcpy(ack_array+sizeof(long), ACK_STR, strlen(ACK_STR));

	msq_cooperation(my_data.blocksize, my_data.iter, my_data.msq_id, data_buffer1, data_buffer2, ack_array);

	free(data_buffer2);
	free(data_buffer1);
	//this helper thread is ready to exit, mission completed!
	free(ptr);
	pthread_exit(0); /* exit thread */
}

uint64_t smp_msq_perf_interface(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state)
{
	assert(blocksize >= sizeof(long));

	if(blocksize > 8192)
		return 0;

	//unsigned int num_of_cores = sysconf(_SC_NPROCESSORS_ONLN);
	unsigned int num_of_cores = conf_num_of_thread_pairs;

	int msqid[NUM_OF_CORES];
	uint64_t start, stop;
	void *res;

	//generate a number of message queue ids
	key_t key;
	int i = 0;
	for(i = 0; i < num_of_cores; i++)
	{
		if ((key = ftok(KEY_STR, 'B'+i)) == -1) {
					perror("ftok");
					exit(1);
		}

		if ((msqid[i] = msgget(key, 0666 | IPC_CREAT)) == -1) {
			perror("msgget");
			exit(1);
		}
	}
	pthread_t thread_pair[NUM_OF_CORES][2];

	start = get_time();
	//now create a communication pattern and bind threads to specified cores
	for(i = 0; i < num_of_cores; i++)
	{
		THREAD_DATA_STRUCT *my_data_1 = (THREAD_DATA_STRUCT *)malloc(sizeof(THREAD_DATA_STRUCT));
		my_data_1->blocksize = blocksize;
		my_data_1->iter = iter;
		my_data_1->core_id = i;
		my_data_1->msq_id = msqid[i];
		my_data_1->run_on_core = thread_client_on_core[i];
		/*
		 * set affinity of newly created thread
		 * is done in thread running function
		 */

		/**************************************/
		if(pthread_create (&thread_pair[i][0], NULL, (void *) &thread_msq_snd, (void *) my_data_1) != 0)
		{
			perror("pthread_create");
		}

		THREAD_DATA_STRUCT *my_data_2 = (THREAD_DATA_STRUCT *)malloc(sizeof(THREAD_DATA_STRUCT));
		my_data_2->blocksize = blocksize;
		my_data_2->iter = iter;
		my_data_2->core_id = i;
		my_data_2->msq_id = msqid[i];
		my_data_2->run_on_core = thread_server_on_core[i];
		/*********************************/

		/*********************************/
		if(pthread_create (&thread_pair[i][1], NULL, (void *) &thread_msq_rcv, (void *) my_data_2) != 0)
		{
			perror("pthread_create");
		}
	}

	for(i = 0; i < num_of_cores; i++)
	{
		if(pthread_join(thread_pair[i][0], &res) != 0)
		{
			perror("pthread_join");
		}
		if(pthread_join(thread_pair[i][1], &res) != 0)
		{
			perror("pthread_join");
		}
	}
	stop = get_time();

	//remove message queue
	for(i = 0; i < num_of_cores; i++)
	{
		//remove message queue
		if (msgctl(msqid[i], IPC_RMID, NULL) == -1) {
			perror("msgctl");
			exit(1);
		}
	}
	/*****************************************************/
	return (stop-start);
}
