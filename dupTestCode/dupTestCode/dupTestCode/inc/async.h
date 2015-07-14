

#ifndef ASYNC_H_
#define ASYNC_H_

#include <string.h>
#include "config.h"
#include "place.h"
#include "message.h"


typedef struct _struct_task {
	//struct _struc_task* parent;
	//unsigned parent_place;
	unsigned int up_count; // lock free
	unsigned int down_count;
	pthread_mutex_t down_mutex;
	pthread_cond_t down_cv;
	struct _struct_task* prev;
} _task;

typedef struct _struct_async {
	unsigned long method;
	uint64_t size;
	void* params;
} _async;


int task_dispatch(_async, place_t);
void task_start_finish();
void task_end_finish();
int dispatcher_terminate(place_t);
int _terminate_all_places();
void _ack_async(struct Msg*);
void _create_async(struct Msg*);
void _create_main_thread();
void* _thread_getspecific();
void _thread_setspecific(void* val);

void _thread_mutex_init(pthread_mutex_t* down_mutex);
void _thread_cond_init(pthread_cond_t* down_cv);
void _thread_mutex_lock(pthread_mutex_t* down_mutex);
void _thread_mutex_unlock(pthread_mutex_t* down_mutex);
void _thread_cond_signal(pthread_cond_t* down_cv);
void _thread_cond_wait(pthread_cond_t* down_cv, pthread_mutex_t* down_mutex);
void _thread_exit(void* status);
#endif
