

#ifndef ASYNC_H_
#define ASYNC_H_

#include <string.h>
#include "config.h"
#include "place.h"
#include "message.h"


typedef struct _struct_task {
	//struct _struc_task* parent;
	//unsigned parent_place;
	unsigned up_count; // lock free
	unsigned down_count;
	pthread_mutex_t down_mutex;
	pthread_cond_t down_cv;
	struct _struct_task* prev;
} _task;

typedef struct _struct_async {
	unsigned long method;
	size_t size;
	void* params;
} _async;


int task_dispatch(_async, place_t);
void task_create();
void task_destroy();
int dispatcher_terminate(place_t);
int _terminate_all_places();
void _ack_async(struct Msg*);
void _create_async(struct Msg*);
void _create_main_thread();
#endif
