#include "../inc/config.h";
#include <string.h>



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


int task_dispatch(_task*, _async, place_t);
_task* task_create();
void task_destroy(_task*);
int dispatcher_terminate(place_t);
int _terminate_all_places();
void _ack_async(struct Msg*);
void _create_async(struct Msg*);
void _create_main_thread();
