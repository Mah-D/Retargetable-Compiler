

#ifndef ASYNC_H_
#define ASYNC_H_

#include <string.h>
#include "config.h"
#include "place.h"
#include "message.h"

typedef uint32_t method_t;

typedef struct _struct_task {
	//struct _struc_task* parent;
	//unsigned parent_place;
	uint32_t up_count; // lock free
	uint32_t down_count;
	pthread_mutex_t down_mutex;
	pthread_cond_t down_cv;
	struct _struct_task* prev;
	uint64_t total_memory;
} _task;

typedef struct _struct_async {
	method_t method;
	uint64_t size;
	void* params;
} _async;

int32_t  runmain( );
int32_t task_dispatch(_async, place_t);
void task_start_finish();
void task_end_finish();
void task_deregister(_task* parent);
void task_deregister_send(_task* parent, place_t remote_place);
int32_t dispatcher_terminate(place_t);
int32_t _terminate_all_places();
void _ack_async(struct Msg*);
void _create_async(struct Msg*);
void _create_async_local(struct Msg*);
void _create_main_thread();
void* _thread_getspecific();
void _thread_setspecific(void* val);

void _thread_sethere(place_t val);
void _thread_mutex_init(pthread_mutex_t* down_mutex);
void _thread_cond_init(pthread_cond_t* down_cv);
void _thread_mutex_lock(pthread_mutex_t* down_mutex);
void _thread_mutex_unlock(pthread_mutex_t* down_mutex);
void _thread_cond_signal(pthread_cond_t* down_cv);
void _thread_cond_wait(pthread_cond_t* down_cv, pthread_mutex_t* down_mutex);
void _thread_exit(void* status);
void _join_main_thread();
void * _pack_ASYNC(uint64_t * bufSize, uint32_t headerSize,_async child);
int32_t WriteMsg(place_t placeToWriteMsg, int32_t msgType, uint64_t sizeOfBlob, void * blob);
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
void task_init();
#endif
