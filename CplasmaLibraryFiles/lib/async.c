#include "../inc/async.h"
static pthread_key_t key;

void task_init() {
	pthread_key_create(&key, NULL);
}

/*********************************************/
/* Async management creation library methods */
/*********************************************/

void task_register(_task* parent) {
	parent -> up_count++; // register with parent
}

int task_dispatch(_task* parent, _async child, place_t remote_place) {
	task_register(parent);
	unsigned long long bufsize = child.size;
	bufsize += sizeof(unsigned long);
	bufsize += sizeof(_task*);
	void* buf = (void*) malloc(bufsize);

	unsigned long* method = (unsigned long*)buf;
	*method = child.method;
	
	_task** p = (_task**) (buf+sizeof(unsigned long));
	*p = parent;

	void* params = (void*) (buf + sizeof(unsigned long) + sizeof(_task*));
	memcpy(params, child.params, child.size);
	WriteMsg(remote_place, ASYNC, bufsize, buf);
	free(buf);
}

int task_deregister_send(_task* parent, place_t this_place, place_t remote_place) {
	volatile _task* temp = parent;
	void * buf = (void*) &temp;
	unsigned long long bufsize = sizeof(_task*);
	WriteMsg(remote_place, ASYNC_ACK, bufsize, buf);
	free(buf);
}

int task_deregister(_task* parent) {
	pthread_mutex_lock(&parent -> down_mutex);
	parent -> down_count++;
	if(!(parent -> up_count - parent -> down_count)) pthread_cond_signal(&parent->down_cv);
	pthread_mutex_unlock(&parent -> down_mutex);
}

_task* task_create() {
	_task* task = (_task*) malloc(sizeof(_task));
	task -> up_count = 1;
	task -> down_count = 0;
	pthread_mutex_init(&task -> down_mutex, NULL);
	pthread_cond_init(&task -> down_cv, NULL);
	return task;
}

void task_destroy(_task* self) {
	pthread_mutex_lock(&self -> down_mutex);
	self -> down_count++;
	if(self -> up_count - self -> down_count) pthread_cond_wait(&self->down_cv, &self->down_mutex);
	pthread_mutex_unlock(&self -> down_mutex);
	free(self);
}

int dispatcher_terminate(place_t remote_place) {
	return WriteMsg(remote_place, TERMINATE, sizeof("EXIT"), "EXIT");
}


int _terminate_all_places(){
	int success = -1;
	//tell everyone else to exit
		int i;
		for (i = _max_places(); i >= PLACEZERO ; ++i) {
			success = dispatcher_terminate(_toplace(i));
			if (!success) {
				return EXIT_FAILURE;
			}
		}
	return success;
}


/***********************************/
/* Thread creation library methods */
/***********************************/

void *_ack_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	task_deregister(NULL);
	free(msg);
	pthread_exit(NULL);
}

void _ack_async(struct Msg* msg) {
	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int rc = pthread_create(&t, &attr, _ack_thread_start, (void *)msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}

void *_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	_task* curr_thread = task_create();
	//_thread_run(curr_thread, msg);
	task_destroy(curr_thread); // change NULL to parent
	//task_deregister_send(parent, this_place, remote_place); TODO FIX PARENT
	free(msg);
	pthread_exit(NULL);
}

void _create_async(struct Msg* msg) {
	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int rc = pthread_create(&t, &attr, _thread_start, (void *)msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}

void* _main_thread_start() {
	//_run_main();
	_terminate_all_places();
}

void _create_main_thread() {
	pthread_t t;
	int rc = pthread_create(&t, NULL, _main_thread_start, NULL);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
}
