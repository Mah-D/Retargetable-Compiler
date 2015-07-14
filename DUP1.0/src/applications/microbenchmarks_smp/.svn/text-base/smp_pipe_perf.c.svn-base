/*
 * bidirectional_piple.c
 *
 *  Created on: Jan 13, 2010
 *      Author: liangxue
 */

/*
 * SMP version implementation
 */
#include "smp_pipe_perf.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <pthread.h>


#include "helper_lib.h"

#define ACK_STR "received!\0"

//wrapper function to handle partial send problem
static int pipe_write_all(int pipe_fd, char *buf, int len)
{
    int total = 0;        // how many bytes we've sent
    int bytesleft = len; // how many we have left to send
    int n;

    while(total < len) {
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

    while(total < len) {
        n = read(pipe_fd, buf+total, bytesleft);
        if (n == -1) { break; }
        total += n;
        bytesleft -= n;
    }
    return (n==-1)?-1:total;
}

typedef struct
{
	size_t blocksize;
	unsigned int iter;
	unsigned int core_id;
	unsigned int run_on_core;
	int pipe_rd;
	int pipe_wr;
} THREAD_DATA_STRUCT;

void thread_pipe_snd( void *ptr )
{

    THREAD_DATA_STRUCT my_data;
    my_data = *((THREAD_DATA_STRUCT *) ptr);

    thread_bind_to_core(pthread_self(), my_data.run_on_core);

    char *private_buffer = calloc(my_data.blocksize, 1);
    char *private_buffer_bidir = calloc(my_data.blocksize, 1);
    char *ack_str = calloc(strlen(ACK_STR), 1);

    unsigned int i = 0;
    //cooperating thread
	for(i = 0; i < my_data.iter; i++)
	{
		if(pipe_write_all(my_data.pipe_wr, private_buffer, my_data.blocksize) != my_data.blocksize)
		{
			printf("Error reading pipe\n");
			exit(1);
		}
		if(bidirectional)
		{
			if(pipe_read_all(my_data.pipe_rd, private_buffer_bidir, my_data.blocksize) == -1)
			{
						fprintf(stderr, "error reading pipe\n");
						exit(1);
			}
		}
	}
	if(!bidirectional)
	{
		if(pipe_read_all(my_data.pipe_rd, ack_str, strlen(ACK_STR)) != strlen(ACK_STR))
		{
				printf("Error writing to pipe\n");
				exit(1);
		}
		if(strncmp(ack_str, ACK_STR, strlen(ACK_STR)) != 0)
		{
			printf("Error receving acknowledgment!\n");
			exit(1);
		}
	}
	free(ack_str);
	free(private_buffer_bidir);
	free(private_buffer);
    //this helper thread is ready to exit, mission completed!
    free(ptr);

    pthread_exit(0); /* exit thread */
}

void thread_pipe_rcv(void *ptr) {

	THREAD_DATA_STRUCT my_data;
	my_data = *((THREAD_DATA_STRUCT *) ptr);

	thread_bind_to_core(pthread_self(), my_data.run_on_core);

	char *private_buffer = calloc(my_data.blocksize, 1);
	unsigned int i = 0;
	//cooperating thread
	for (i = 0; i < my_data.iter; i++) {
		if (pipe_read_all(my_data.pipe_rd, private_buffer, my_data.blocksize)
				!= my_data.blocksize) {
			printf("Error reading pipe\n");
			exit(1);
		}
	}

	if (pipe_write_all(my_data.pipe_wr, ACK_STR, strlen(ACK_STR)) != strlen(
			ACK_STR)) {
		printf("Error writing to pipe\n");
		exit(1);
	}
	free(private_buffer);
	//this helper thread is ready to exit, mission completed!
	free(ptr);

	pthread_exit(0); /* exit thread */
}

uint64_t smp_pipe_perf_interface(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state)
{
	//unsigned int num_of_cores = sysconf(_SC_NPROCESSORS_ONLN);
	unsigned int num_of_cores = conf_num_of_thread_pairs;
	int pipe1[num_of_cores][2], pipe2[num_of_cores][2];
	uint64_t start, stop;

	void *res;
	int i = 0;
	for(i = 0; i < num_of_cores; i++)
	{
		if(pipe(pipe1[i]) < 0 || pipe(pipe2[i]) < 0)
		{
			perror("can't create pipe");
		}
	}

	pthread_t thread_pair[num_of_cores][2];

	start = get_time();
	//now create a communication pattern and bind threads to specified cores
	for(i = 0; i < num_of_cores; i++)
	{
		THREAD_DATA_STRUCT *my_data_1 = (THREAD_DATA_STRUCT *)malloc(sizeof(THREAD_DATA_STRUCT));
		my_data_1->blocksize = blocksize;
		my_data_1->iter = iter;
		//this attribute is not of use at the moment
		my_data_1->core_id = i;
		my_data_1->pipe_wr = pipe1[i][1];
		my_data_1->pipe_rd = pipe2[i][0];
		//thread_client_on_core is obtained from config file
		my_data_1->run_on_core = thread_client_on_core[i];
		if(pthread_create (&thread_pair[i][0], NULL, (void *) &thread_pipe_snd, (void *) my_data_1) != 0)
		{
			perror("pthread_create");
		}

		THREAD_DATA_STRUCT *my_data_2 = (THREAD_DATA_STRUCT *)malloc(sizeof(THREAD_DATA_STRUCT));
		my_data_2->blocksize = blocksize;
		my_data_2->iter = iter;
		my_data_2->core_id = i;
		my_data_2->pipe_rd = pipe1[i][0];
		my_data_2->pipe_wr = pipe2[i][1];
		my_data_2->run_on_core = thread_server_on_core[i];
		if(pthread_create (&thread_pair[i][1], NULL, (void *) &thread_pipe_rcv, (void *) my_data_2) != 0)
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

	for(i = 0; i < num_of_cores; i++)
	{
		close(pipe1[i][0]);
		close(pipe1[i][1]);
		close(pipe2[i][0]);
		close(pipe2[i][1]);
	}
	return stop - start;
}


