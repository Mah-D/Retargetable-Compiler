/*
 * bidirectional_piple.c
 *
 *  Created on: Nov 2, 2009
 *      Author: liangxue
 */

/*
 * Good thing about pipe with fork is that:
 * both parent and child already have the information about
 * data size, iteration number.
 * So we don't have to communicate this again, like what was done in socket file
 */
#include "pipe_perf.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include "helper_lib.h"


#define ACK_STR "received!\0"

//wrapper function to handle partial send problem
static int pipe_write_all(int pipe_fd, char *buf, int len)
{
    int total = 0;        // how many bytes we've sent
    int bytesleft = len; // how many we have left to send
    int n;

    n = 0;
    while (total < len) {
        n = write(pipe_fd, buf+total, bytesleft);
        if (n == -1) { break; }
        total += n;
        bytesleft -= n;
    }

    return (n==-1)?-1:total; // return -1 on failure, 0 on success
}

static int pipe_read_all(int pipe_fd, char *buf, int len)
{
    int total = 0;
    int bytesleft = len;
    int n;

    n = 0;
    while(total < len) {
        n = read(pipe_fd, buf+total, bytesleft);
        if (n == -1) { break; }
        total += n;
        bytesleft -= n;
    }
    return (n==-1)?-1:total;
}

//parent process
//previously it was implemented that an ACK handshake is associated with every iteration of communication
//wait for one ACK when data of that block size is transfered number of times...
static void transfer_data_to_pipe(size_t blocksize, unsigned int iter, int pipe_rd, int pipe_wr, char *buffer_parent)
{

	unsigned int i;

	char ack_array[strlen(ACK_STR)+1]; //large enough to hold ACK_STR
	memset(ack_array, 0, strlen(ACK_STR)+1);


	for(i = 0; i < iter; i++)
	{
		//write
		if(pipe_write_all(pipe_wr, buffer_parent, blocksize) == -1)
		{
			printf("error writing to pipe\n");
			exit(1);
		}
		if(bidirectional)
		{
			if(pipe_read_all(pipe_rd, buffer_parent, blocksize) == -1)
			{
				fprintf(stderr, "error reading pipe\n");
				exit(1);
			}
		}
	}
	if(!bidirectional)
	{
		//if ACK_STR is received, we're certain that all data were sent through pipe
		if(pipe_read_all(pipe_rd, ack_array, strlen(ACK_STR)) != strlen(ACK_STR))
		{
			printf("error reading ACK %s\n", ACK_STR);
			exit(1);
		}

		if(strncmp(ack_array, ACK_STR, strlen(ACK_STR)) != 0)
		{
			printf("Error receving acknowledgment!\n");
			exit(1);
		}
	}
}

//Child processs, simply cooperating so that parent process knows it has successfully transfered
//all data, this includes some overhead like sending an acknowledgement back with raw data
static void do_pipe_cooperation(size_t blocksize, unsigned int iter, int pipe_rd, int pipe_wr, char *buffer_child)
{
	unsigned int i;


	for(i = 0; i < iter; i++)
	{
		if(pipe_read_all(pipe_rd, buffer_child, blocksize) != blocksize)
		{
			printf("Error reading pipe\n");
			exit(1);
		}
		if(bidirectional)
		{
			if(pipe_write_all(pipe_wr, buffer_child, blocksize) != blocksize)
			{
				printf("Error reading pipe\n");
				exit(1);
			}
		}
	}

	if(!bidirectional)
	{
		if(pipe_write_all(pipe_wr, ACK_STR, strlen(ACK_STR)) != strlen(ACK_STR))
		{
			printf("Error writing to pipe\n");
			exit(1);
		}
	}

}

uint64_t pipe_perf_interface(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state)
{
        pid_t childpid;
	  int pipe1[2], pipe2[2];
	uint64_t start, stop;
	//Should this be freed twice, explicitly in child code and in parent code???
	char *data_buffer = calloc(blocksize, sizeof(size_t));

	if(pipe(pipe1) < 0 || pipe(pipe2) < 0)
	{
		perror("can't create pipe");
	}

	if (-1 == (childpid = fork()))
	{
		perror("can't fork");
	}
	else if(childpid != 0) 	/* parent */
	{
		close(pipe1[0]);
		close(pipe2[1]);

		start = get_time();
		transfer_data_to_pipe(blocksize, iter, pipe2[0], pipe1[1], data_buffer);
		stop = get_time();

		waitpid (childpid, NULL, 0);

		close(pipe1[1]);
		close(pipe2[0]);

		free(data_buffer);
		//return (stop-start)/iter;
		return (stop-start);
	}
	else	/*child*/
	{
		close(pipe1[1]);
		close(pipe2[0]);

		do_pipe_cooperation(blocksize, iter, pipe1[0], pipe2[1], data_buffer);

		close(pipe1[0]);
		close(pipe2[1]);

		free(data_buffer);
		exit(0);
	}
	//something wrong if code reaches here!
	abort ();
}
