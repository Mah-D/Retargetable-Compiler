/*
 * shm_perf.c
 *
 *  Created on: Oct 26, 2009
 *      Author: liangxue
 *  Simple prototype:
 *  fork() version is still not functioning, thus pthread is used to create another
 *  cooperating thread to access the shared memory
 *  shared memory, semaphore are initialized once, we're only interested in timing of
 *  semaphore related context switch when access that shared memory
 */

#include "shm_perf.h"

#include <sys/shm.h>
#include <semaphore.h>  /* Semaphore */
#include <sys/ipc.h>
#include <sys/stat.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <pthread.h>
#include "helper_lib.h"

/*
 * variables of file scope only
 */
static sem_t shm_mutex_1, shm_mutex_2;

static int segment_id;
static char *shared_memory;
static pthread_t helper_thread;
static char *test_buffer;

typedef struct
{
	size_t block_size;
	unsigned int iter;
} THREAD_DATA_STRUCT;

/*
 * a helper thread which simulate access to shared memory
 */
void handler ( void *ptr )
{

    THREAD_DATA_STRUCT my_data;
    my_data = *((THREAD_DATA_STRUCT *) ptr);
    unsigned int i = 0;
    //cooperating thread
    for(i = 0; i < (my_data.iter)*NUM_ITER_PER_SAMPLE; i++)
    {
    	sem_wait(&shm_mutex_2);       /* down semaphore */
		//printf("memset blocksize - %u\n", block_size);
		sem_post(&shm_mutex_1);       /* up semaphore */
    }

    //this helper thread is ready to exit, mission completed!
    free(ptr);
    pthread_exit(0); /* exit thread */
}

/*
 * a shared memory segment of blocksize will be created
 * and perform a memory copy from test_buffer to shared memory
 */
static int pre_setup(size_t blocksize, unsigned int iter) {

	test_buffer = malloc(blocksize);
	// testing-debugging only
	memset(test_buffer, 'x', blocksize);

	//shared memory setup overhead
	segment_id = shmget(IPC_PRIVATE, blocksize, IPC_CREAT| IPC_EXCL | S_IRUSR
			| S_IWUSR);

	if (segment_id == -1) {
		perror("shmget");
		exit(1);
	}
	/* Attach the shared memory segment. */
	if( (shared_memory = (char*) shmat(segment_id, 0, 0)) == NULL)
	{
		perror("shmat");
		exit(1);
	}

	if(sem_init(&shm_mutex_1, 0, 1) < 0)
	{
			perror("sem_init");
			exit(1);
	}
	if (sem_init(&shm_mutex_2, 0, 0) < 0)
	{
		perror("sem_init");
		exit(1);
	}
	//due to a bug appeared in another linux machine, it's suspected
	//pass data to thread is not safe, use another way as proposed in
	//https://computing.llnl.gov/tutorials/pthreads/samples/hello_arg1.c
	THREAD_DATA_STRUCT *my_data = (THREAD_DATA_STRUCT *)malloc(sizeof(THREAD_DATA_STRUCT));
	my_data->block_size = blocksize;
	my_data->iter = iter;
	pthread_create (&helper_thread, NULL, (void *) &handler, (void *) my_data);

	return 0;
}

/*
 * Error handling
 */
static void shm_perf(size_t blocksize)
{
	sem_wait(&shm_mutex_1);
	//perform a simple memory copy
	memcpy(shared_memory, test_buffer, blocksize);
	sem_post(&shm_mutex_2);
}

/*
 * Error handling
 */
static void post_cleaning()
{
	//pthread_join(helper_thread, NULL);
	sem_destroy(&shm_mutex_1);
	sem_destroy(&shm_mutex_2);
	/* Detach the shared memory segment. */
	shmdt(shared_memory);
	/* Deallocate the shared memory segment.  */
	shmctl(segment_id, IPC_RMID, 0);
	free(test_buffer);
}

uint64_t shm_perf_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state) {

	unsigned int i;

	if(state == START_UP)
	{
		pre_setup(blocksize, iter);
		return 0;
	}
	else if(state == CLEAN_UP)
	{
		post_cleaning();
		return 0;
	}
	else if(state == MAIN_BODY)
	{
		uint64_t start = get_time();
		for(i = 0; i < iter; i++)
			shm_perf(blocksize);
		uint64_t stop = get_time();

		return (stop - start)/iter;
	}
	else
	{
		printf("unrecognized state\n");
		exit(1);
	}

}

