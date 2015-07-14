/*
 *	async.c - Handles the async/finish mechanism
 *	Any valid implementation of async/finish should define the following interface:
 *	For the source code:
 *		void task_dispatch(_async, place); - This implements the async mechanism
 *		void task_start_finish(); - Implement the finish
 *		void task_end_finish();	 - mechanism
 *	For the dispatcher:
 *		void _create_async(struct Msg* msg);
 *		void _ack_async(struct Msg* msg);
 *		void _create_main_thread();
 *		void _join_main_thread();
 *
 *	Created by: Riyaz Haque & Oren Freiberg
 *	Created On: 12/11/2010
 */

#include "../inc/async.h"
#include "../inc/errormsg.h"
#include  <pthread.h>

/*********************************************/
/* Async management creation library methods */
/*********************************************/

void task_register(_task* parent) {
	parent -> up_count++; // register with parent
}

int task_dispatch(_async child, place_t remote_place) {
	_task* self = (_task*)_thread_getspecific();
	fprintf(stderr, "%d: THIS IS TASK DISPATCH %x:%u:%u\n", _here(), self, self->up_count, self->down_count);
	
	task_register(self);
	uint64_t bufsize = child.size;
	bufsize += sizeof(unsigned long);
	bufsize += sizeof(_task*);
	void* buf = (void*) malloc(bufsize);

	_task** parent = (_task**)buf;
	*parent = self;
	
	unsigned long* method = (unsigned long*)(buf+sizeof(_task*));
	*method = child.method;

	void* params = (void*) (buf + sizeof(unsigned long) + sizeof(_task*));
	memcpy(params, child.params, child.size);
	WriteMsg(remote_place, ASYNC, (uint64_t)bufsize, (void*)buf);
	free(buf);
}

int task_deregister_send(_task* parent, place_t remote_place) {
	fprintf(stderr, "%d->%d: THIS IS TASK DEREGISTER SEND %x\n", _here(),remote_place,  parent);
	if(remote_place == _here()) {
		task_deregister(parent);
	}
	else {
		volatile _task* temp = parent;
		void * buf = (void*) &temp;
		uint64_t bufsize = sizeof(_task*);
		WriteMsg(remote_place, ASYNC_ACK, (uint64_t)bufsize, (void*)buf);
	}
}

int task_deregister(_task* parent) {
	fprintf(stderr, "%d: THIS IS TASK DEREGISTER %x:%u:%u\n", _here(), parent, parent->up_count, parent->down_count);
	_thread_mutex_lock(&parent -> down_mutex);
	parent -> down_count++;
	if(!(parent -> up_count - parent -> down_count)) _thread_cond_signal(&parent->down_cv);
	_thread_mutex_unlock(&parent -> down_mutex);
}

void task_create() {
	_task* prev = (_task*)_thread_getspecific();
	_task* t = (_task*) malloc(sizeof(_task));
	t -> up_count = 1;
	t -> down_count = 0;
	_thread_mutex_init(&t -> down_mutex);
	_thread_cond_init(&t -> down_cv);
	t -> prev = prev;
	_thread_setspecific((void*)t);
}

void task_destroy() {
	_task* self = (_task*)_thread_getspecific();
	_thread_mutex_lock(&self -> down_mutex);
	self -> down_count++;
	unsigned int temp = ((self -> up_count) - (self -> down_count));
	fprintf(stderr, "%d: THIS IS THE WAIT CONDITIONAL VALUE %x::%u:%u\n", _here() , self, self->up_count, self->down_count);
	if(self -> up_count - self -> down_count) _thread_cond_wait(&self->down_cv, &self->down_mutex);
	_thread_mutex_unlock(&self -> down_mutex);
	_thread_setspecific((void*)self -> prev);
	free(self);
	self = NULL;
}

void task_start_finish() {
	task_create();
}

void task_end_finish() {
	task_destroy();
}

void *_main_thread_start(void* dummmy) {
	_run_main();
	
	int success = _terminate_all_places();
	if(success== EXIT_SUCCESS){
		writeDebug("Wrote all termination messages");
	}else{
		writeError("termination messages Failed");
	}
}

void *_ack_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	_task* parent = *((_task**)msg->tb.addr);
	task_deregister(parent);
	_deallocate_msg(msg);
	_thread_exit(NULL);
}

void *_thread_start (void* arg) {
	writeDebug("In _thread_start *************");
	struct Msg* msg = (struct Msg*) arg;
	task_create();
	unsigned long method = *((unsigned long*)(msg->tb.addr+sizeof(_task*)));
	void* params = (void*)(msg->tb.addr+sizeof(_task*)+sizeof(unsigned long));
	writeDebug("passed this point ************");
	_thread_run(method, params);
	task_destroy();
	volatile _task* parent = *((_task**)msg->tb.addr);
	fprintf(stderr, "THIS IS TASK START %x\n", parent);
	volatile place_t parent_place = msg->placeFrom;
	task_deregister_send((void*)parent, parent_place);
	writeDebug("passed this point ================");
	_deallocate_msg(msg);
	_thread_exit(NULL);
}

int dispatcher_terminate(place_t remote_place) {
	char* mymsg = "DIES";
	volatile int y = 10;
	int succ = WriteMsg(remote_place, TERMINATE, (uint64_t)(sizeof(char)*5), (void *)mymsg);
	return succ;
}

int _terminate_all_places(){
	int success = -1;
	//tell everyone else to exit
	int i;
	writeDebug("Starting thread _terminate_all_places at place");
	for (i = _max_places()-1; i >= 0 ; --i) {
		success = dispatcher_terminate(_toplace(i));
		if (success != EXIT_SUCCESS) {
			writeError("ERROR: Failed thread _terminate_all_places at place");
			return EXIT_FAILURE;
		}
	}
	writeDebug("Finished thread _terminate_all_places at place");
	return success;
}

/***********************************/
/* Thread creation library methods */
/***********************************/

static pthread_key_t key;
static pthread_t main_thread;

void task_init() {
	pthread_key_create(&key, NULL);
}

void _thread_exit(void *status) {
	pthread_exit(status);
}

void _thread_mutex_init(pthread_mutex_t* down_mutex) {
	pthread_mutex_init(down_mutex, NULL);
}

void _thread_cond_init(pthread_cond_t* down_cv) {
	pthread_cond_init(down_cv, NULL);
}

void _thread_mutex_lock(pthread_mutex_t* down_mutex) {
	pthread_mutex_lock(down_mutex);
}

void _thread_mutex_unlock(pthread_mutex_t* down_mutex) {
	pthread_mutex_unlock(down_mutex);
}

void _thread_cond_signal(pthread_cond_t* down_cv) {
	pthread_cond_signal(down_cv);
}

void _thread_cond_wait(pthread_cond_t* down_cv, pthread_mutex_t* down_mutex) {
	pthread_cond_wait(down_cv, down_mutex);
}

void* _thread_getspecific() {
	void* temp = pthread_getspecific(key);
	return temp;
}

void _thread_setspecific(void* val) {
	pthread_setspecific(key, val);
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

void _create_main_thread() {
	writeDebug("Starting the termination of the dispatcher at place");
	int rc = pthread_create(&main_thread, NULL, _main_thread_start, NULL);
	if (rc) {
		writeErrorExtraPlace("ERROR: return code from pthread_create()", rc);
		
	}
}

void _join_main_thread() {
	pthread_join(main_thread, NULL);
}
