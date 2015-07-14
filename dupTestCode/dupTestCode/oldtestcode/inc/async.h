#include <stdio.h>
#include "place.h"
#include <string.h>
#include <stdlib.h>
#include <pthread.h>
//#include "dupTestCode/WriteMsg.c"
//#include "dupTestCode/ReadMsg.c"
//#include "dupTestCode/ProcessMsg.c"

enum {
	ASYNC, TERMINATE, ASYNC_ERR, ASYNC_ACK, READY
};

typedef struct _struct_task {
	//struct _struc_task* parent;
	//unsigned parent_place;
	unsigned up_count; // lock free
	unsigned down_count;
	pthread_mutex_t down_mutex;
	pthread_cond_t down_cv;
} _task;

typedef struct _struct_async {
	unsigned long method;
	size_t size;
	void* params;
} _async;

//typedef uint32_t place_t;

struct Msg {
};

int task_register(_task*, _async, place_t, place_t);
int task_deregister_send(_task*, place_t, place_t);
int task_deregister(_task*);
_task* task_create();
void task_destroy(_task*);
void dispatcher_terminate(place_t, place_t);

void _ack_async(struct Msg*);
void _create_async(struct Msg*);
void _create_main_thread();
