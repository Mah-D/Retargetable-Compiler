#include "../inc/async.h"
#include "../inc/errormsg.h"
#include  <pthread.h>
static pthread_key_t key;
static pthread_t main_thread;

void task_init() {
	pthread_key_create(&key, NULL);
}

/*********************************************/
/* Async management creation library methods */
/*********************************************/

void task_register(_task* parent) {
	parent -> up_count++; // register with parent
}

int task_dispatch(_async child, place_t remote_place) {
	_task* self = (_task*)pthread_getspecific(key);
	task_register(self);
	unsigned long long bufsize = child.size;
	bufsize += sizeof(unsigned long);
	bufsize += sizeof(_task*);
	void* buf = (void*) malloc(bufsize);

	_task** parent = (_task**)buf;
	*parent = self;
	
	unsigned long* method = (unsigned long*)(buf+sizeof(_task*));
	*method = child.method;
	

	void* params = (void*) (buf + sizeof(unsigned long) + sizeof(_task*));
	memcpy(params, child.params, child.size);
	WriteMsg(remote_place, ASYNC, bufsize, buf);
	free(buf);
}

int task_deregister_send(_task* parent, place_t remote_place) {
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

void task_create() {
	_task* prev = (_task*)pthread_getspecific(key);
	_task* task = (_task*) malloc(sizeof(_task));
	pthread_setspecific(key, (void*)task);
	task -> up_count = 1;
	task -> down_count = 0;
	pthread_mutex_init(&task -> down_mutex, NULL);
	pthread_cond_init(&task -> down_cv, NULL);
	task -> prev = prev;
}

void task_destroy() {
	_task* self = (_task*)pthread_getspecific(key);
	pthread_mutex_lock(&self -> down_mutex);
	self -> down_count++;
	if(self -> up_count - self -> down_count) pthread_cond_wait(&self->down_cv, &self->down_mutex);
	pthread_mutex_unlock(&self -> down_mutex);
	pthread_setspecific(key, (void*)self -> prev);
	free(self);
}

_task* task_start_finish() {
	_task* curr = (_task*)pthread_getspecific(key);
	task_create();
	return curr;
}

void task_end_finish(_task* prev) {
	task_destroy();
	pthread_setspecific(key, (void*)prev);
}

void *_main_thread_start(void* dummmy) {
	//_run_main();
	
	int success = _terminate_all_places();
	if(success== EXIT_SUCCESS){
		writeDebug("Wrote all termination messages");
	}else{
		writeError("termination messages Failed");
	}
	
}

void *_ack_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	_task* parent = (_task*)msg->tb.addr;
	task_deregister(parent);
	pthread_exit(NULL);
}

void *_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	task_create();
	unsigned long method = *((unsigned long*)(msg->tb.addr+sizeof(_task*)));
	void* params = (void*)(msg->tb.addr+sizeof(_task*)+sizeof(unsigned long));
	//_thread_run(method, params);
	task_destroy();
	_task* parent = (_task*)msg->tb.addr;
	task_deregister_send(parent, msg -> placeFrom);
	pthread_exit(NULL);
}

int dispatcher_terminate(place_t remote_place) {
	int succ = WriteMsg(remote_place, TERMINATE, 5, "DIEDS");
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
	//pthread_t m;
	int rc = pthread_create(&main_thread, NULL, _main_thread_start, NULL);
	//writeErrorExtraPlace("ERROR: return code from pthread_create()", rc);
	if (rc) {
		writeErrorExtraPlace("ERROR: return code from pthread_create()", rc);
		
	}
}

void _join_main_thread() {
	pthread_join(main_thread, NULL);
	
}
