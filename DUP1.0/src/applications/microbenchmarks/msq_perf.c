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

#include "msq_perf.h"
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

#include "helper_lib.h"

#define ACK_STR "received!\0"
//to generate a unique key, an already existing file has to be used
#define KEY_STR "."
//to distinguish normal data messages and acknowledgment messages
static const long ack_msg_type = 11;
static const long raw_data_type = 1;

//parent process
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

//overhead consideration???
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

uint64_t msq_perf_interface(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state)
{
	assert(blocksize >= sizeof(long));

	if(blocksize > 8192)
		return 0;
	pid_t childpid;
	uint64_t start, stop;

	char *data_buffer1 = calloc(blocksize, sizeof(size_t));
	char *data_buffer2 = calloc(blocksize, sizeof(size_t));

	memcpy(data_buffer1, &raw_data_type, sizeof(long));
	memcpy(data_buffer2, &ack_msg_type, sizeof(long));
	//for debugging only, memory pattern
	unsigned int index = 0;
	while(index < (blocksize - sizeof(long)))
	{
		*(data_buffer1 + sizeof(long)) = 'm';
		*(data_buffer2 + sizeof(long)) = 'k';
		index++;
	}

	int msqid;
	key_t key;
	if ((key = ftok(KEY_STR, 'B')) == -1) {
	            perror("ftok");
	            exit(1);
	}

	if ((msqid = msgget(key, 0666 | IPC_CREAT)) == -1) {
		perror("msgget");
		exit(1);
	}

	if (-1 == (childpid = fork()))
	{
		perror("can't fork");
	}
	else if(childpid != 0) 	/* parent */
	{
		start = get_time();
		transfer_data_to_msq(blocksize, iter, msqid, data_buffer1, data_buffer2);
		stop = get_time();

		waitpid (childpid, NULL, 0);
		//remove message queue
		if (msgctl(msqid, IPC_RMID, NULL) == -1) {
			perror("msgctl");
			exit(1);
		}
		free(data_buffer1);
		free(data_buffer2);
		return (stop-start);
	}
	else	/*child*/
	{
		//compose ack message: it has to use a different msg type from normal data
		char ack_array[strlen(ACK_STR)+sizeof(long)];
		memcpy(ack_array, &ack_msg_type, sizeof(long));
		memcpy(ack_array+sizeof(long), ACK_STR, strlen(ACK_STR));
		msq_cooperation(blocksize, iter, msqid, data_buffer1, data_buffer2, ack_array);

		free(data_buffer1);
		free(data_buffer2);
		exit(0);
	}
	//something wrong if code reaches here!
	abort ();
}
