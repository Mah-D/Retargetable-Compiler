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
#include "gc.h"

/*********************************************/
/* Async management creation library methods */
/*********************************************/

void dump_memory(int32_t x, void* data, unsigned long len) {
	//unsigned long i;
	//if(x) fprintf(stderr, "Receiving: Data in [%p..%p): ",data,data+len);
	//else fprintf(stderr, "Sending: Data in [%p..%p): ",data,data+len);
	//for (i=0;i<len;i++) fprintf(stderr, "%x ", ((unsigned char*)data)[i]);
	//printf("\n");
	if(x) fprintf(stderr, "Receiving: %lu bytes\n", len);
	else fprintf(stderr, "Sending: %lu bytes\n", len);
}

void task_register(_task* parent) {
	parent -> up_count++; // register with parent
}

int32_t task_dispatch(_async child, place_t remote_place) {
	_task* self = (_task*)_thread_getspecific();
	//fprintf(stderr, "%lu: THIS IS TASK DISPATCH %x:%u:%u\n", _here(), self, self->up_count, self->down_count);
	task_register(self);
	uint64_t bufsize;
	//fprintf(stderr, "\n%lu RUNNING TO THIS PLACE\n", child.method);
	if(_placetodispatcher(remote_place) == _placetodispatcher(_here())) {	
		bufsize = child.size;
		bufsize += sizeof(method_t);
		bufsize += sizeof(_task*);
		void* buf = (void*) malloc(bufsize);
		self -> total_memory += bufsize;	
		_task** parent = (_task**)buf;
		*parent = self;
	
		method_t* method = (method_t*)(buf+sizeof(_task*));
		*method = child.method;

		void* params = (void*) (buf + sizeof(method_t) + sizeof(_task*));
		memcpy(params, child.params, child.size);
	
		struct Msg* msg = (struct Msg*) malloc(sizeof(struct Msg));
		msg -> placeTo = remote_place;
		msg -> placeFrom = _here();
		msg -> msgType = ASYNC;
		msg -> size = bufsize;
		msg -> tb.addr = buf;
		msg -> tb.sz = bufsize;
		_create_async_local(msg);
	}
	else {
		void* buf = _pack_ASYNC(&bufsize, sizeof(method_t) + sizeof(_task*), child);
		//fprintf(stderr, "%d,\nEXITED PACK ASYNC FFFFFFF: %x, %lu\n", _here(), buf, bufsize);
		_task** parent = (_task**)buf;
		//fprintf(stderr, "%d, GOT TO LINE 75 NO CRASH YET\n",_here());
		*parent = self;
		//fprintf(stderr, "%d ABOUT TO DO POINTER ASSIGNMENT===\n", _here());
		method_t* method = (method_t*)(buf+sizeof(_task*));
		*method = child.method;
		//fprintf(stderr, "%d about to write MSG\n", _here());		
		WriteMsg(remote_place, ASYNC, (uint64_t)bufsize, (void*)buf);
	
		//may not be needed
		///GC_FREE(buf);
		free(buf);
	}
}

void task_deregister_send(_task* parent, place_t remote_place) {
	//fprintf(stderr, "%d->%d: THIS IS TASK DEREGISTER SEND %x\n", _here(),remote_place,  parent);
	if(_placetodispatcher(remote_place) == _placetodispatcher(_here())) {
	// if(remote_place == _here()) {
		task_deregister(parent);
	}
	else {
		volatile _task* temp = parent;
		void * buf = (void*) &temp;
		uint64_t bufsize = sizeof(_task*);
		WriteMsg(remote_place, ASYNC_ACK, (uint64_t)bufsize, (void*)buf);
	}
}

void task_deregister(_task* parent) {
	//fprintf(stderr, "%d: THIS IS TASK DEREGISTER %x:%u:%u\n", _here(), parent, parent->up_count, parent->down_count);
	_thread_mutex_lock(&parent -> down_mutex);
	parent -> down_count++;
	if(!(parent -> up_count - parent -> down_count)) _thread_cond_signal(&parent->down_cv);
	_thread_mutex_unlock(&parent -> down_mutex);
}

void task_create() {
	_task* prev = (_task*)_thread_getspecific();
	//_task* t = (_task*) GC_MALLOC(sizeof(_task));
	_task* t = (_task*)malloc(sizeof(_task));
	t -> total_memory = 0;
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
	uint32_t temp = ((self -> up_count) - (self -> down_count));
	//fprintf(stderr, "%d: THIS IS THE WAIT CONDITIONAL VALUE %x::%u:%u\n", _here() , self, self->up_count, self->down_count);
	if(self -> up_count - self -> down_count) _thread_cond_wait(&self->down_cv, &self->down_mutex);
	//fprintf(stderr, "%d: THIS IS THE WAIT CONDITIONAL VALUE xxxxx %x::%u:%u\n", _here() , self, self->up_count, self->down_count);
	_thread_mutex_unlock(&self -> down_mutex);
	
	_thread_setspecific((void*)self -> prev);
	//may not be needed
	//GC_FREE(self);
	//fprintf(stderr, "%d: THIS IS THE WAIT CONDITIONAL VALUE yyyyy %x::%u:%u\n", _here() , self, self->up_count, self->down_count);
	free(self);
	//fprintf(stderr, "%d: THIS IS THE WAIT CONDITIONAL VALUE zzzzz %x::%u:%u\n", _here() , self, self->up_count, self->down_count);
	self = NULL;
}

void task_start_finish() {
	task_create();
}

void task_end_finish() {
	task_destroy();
}

void *_main_thread_start(void* dummmy) {
	//_run_main();
	_thread_sethere(_place_first());
	_task * t = (_task*)malloc(sizeof(_task));
        t -> total_memory = 0;
	_thread_setspecific((void*)t);
	runmain();
	      fprintf(stderr, "MAIN TOTAL MEMORY USED =%lu=\n", (((_task*) _thread_getspecific()) -> total_memory));
	int32_t success = _terminate_all_places();
	if(success== EXIT_SUCCESS){
		writeDebug("Wrote all termination messages");
	}else{
		writeError("termination messages Failed");
	}
}

void *_ack_thread_start (void* arg) {
	struct Msg* msg = (struct Msg*) arg;
	_task* parent = *((_task**)msg->tb.addr);
	//fprintf(stderr, "Message place is: %d\n", msg->placeTo);
	_thread_sethere(msg->placeTo);
	task_deregister(parent);
	_deallocate_msg(msg);
	_thread_exit(NULL);
}

/*void* _thread_start_local (void* arg) {
	place_t p = *((place_t*)(arg+sizeof(_async)+sizeof(_task*)+sizeof(place_t)));
	_thread_sethere(p);
	//writeDebug("In _thread_start_local *************");
	//fprintf(stderr, "THIS IS THE PLACE VALUE LOCAL %u::%u\n", p, _here());
	_async* a = (_async*) (arg);
	task_create();
	//writeDebug("In _thread_start_local 162 *************");
	method_t method = a -> method;
	void* params = a -> params;
	writeDebug("passed this point32_t local 165 ************");
	_thread_run_local(method, params);
	writeDebug("passed this point32_t local 167 ************");
	task_destroy();
	//writeDebug("passed this point32_t local 168 ************");
	volatile _task* parent = *((_task**)(arg+sizeof(_async)));
	//fprintf(stderr, "THIS IS PARENT TASK START %x\n", parent);
	volatile place_t parent_place = *((place_t*)(arg+sizeof(_async)+sizeof(_task*)));
	//fprintf(stderr, "THIS IS PPLACE TASK START %x\n", parent);
	task_deregister_send((void*)parent, parent_place);
	//fprintf(stderr, "THIS IS DREG TASK START %x\n", parent);
	//writeDebug("passed this point32_t local 179 ================");
	//_deallocate_msg(msg);
	_thread_exit(NULL);
}*/

void *_thread_start (void* arg) {
	//writeDebug("In _thread_start *************");
	struct Msg* msg = (struct Msg*) arg;
	//fprintf(stderr, "Message place is: %d\n", msg->placeTo);
	_thread_sethere(msg->placeTo);
	// dump_memory(1, msg->tb.addr, msg->tb.sz);
	task_create();
	method_t method = *((method_t*)(msg->tb.addr+sizeof(_task*)));
	void* params = (void*)(msg->tb.addr+sizeof(_task*)+sizeof(method_t));
	//writeDebug("passed this point32_t ************");
	//fprintf(stderr, "CREATE ASYNC PASSGED BEFORE: %u\n", method);
	_thread_run(method, params);
	uint64_t value =  (((_task*) _thread_getspecific()) -> total_memory);
        if(value != 0){
        fprintf(stderr, "TOTAL MEMORY USED =%lu=\n", value);
        }
	//fprintf(stderr, "CREATE ASYNC PASSGED AFTER: %u\n", method);
	task_destroy();
	volatile _task* parent = *((_task**)msg->tb.addr);
	//fprintf(stderr, "THIS IS TASK START %x\n", parent);
	volatile place_t parent_place = msg->placeFrom;
	task_deregister_send((void*)parent, parent_place);
	//writeDebug("passed this point32_t ================");
	//free(tb.addr);
	//_deallocate_msg(msg);
	_thread_exit(NULL);
}

void *_thread_start_local (void* arg) {
	//writeDebug("In _thread_start *************");
	struct Msg* msg = (struct Msg*) arg;
	//fprintf(stderr, "Message place is: %d\n", msg->placeTo);
	_thread_sethere(msg->placeTo);
	// dump_memory(1, msg->tb.addr, msg->tb.sz);
	task_create();
	method_t method = *((method_t*)(msg->tb.addr+sizeof(_task*)));
	void* params = (void*)(msg->tb.addr+sizeof(_task*)+sizeof(method_t));
	//writeDebug("passed this point32_t ************");
	//if(method == 31) fprintf(stderr, "CREATE ASYNC PASSGED BEFORE: %u\n", method);
	_thread_run_local(method, params);
  	uint64_t value =  (((_task*) _thread_getspecific()) -> total_memory);
	if(value != 0){
	fprintf(stderr, "TOTAL MEMORY USED =%lu=\n", value);
	}
	//if(method == 31) fprintf(stderr, "CREATE ASYNC PASSGED AFTER: %u\n", method);
	task_destroy();
	volatile _task* parent = *((_task**)msg->tb.addr);
	//fprintf(stderr, "THIS IS TASK START %x\n", parent);
	volatile place_t parent_place = msg->placeFrom;
	task_deregister_send((void*)parent, parent_place);
	//writeDebug("passed this point32_t ================");
	//free(tb.addr);
	// _deallocate_msg(msg);
	_thread_exit(NULL);
}

int32_t dispatcher_terminate(place_t remote_place) {
	char* mymsg = "DIES";
	volatile int32_t y = 10;
	int32_t succ = WriteMsg(remote_place, TERMINATE, (uint64_t)(sizeof(char)*5), (void *)mymsg);
	return succ;
}

int32_t _terminate_all_places(){
	int32_t success = -1;
	//tell everyone else to exit
	int32_t i;
	//writeDebug("Starting thread _terminate_all_places at place");
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
static pthread_key_t herekey;
static pthread_t main_thread;

void task_init() {
	pthread_key_create(&key, NULL);
	pthread_key_create(&herekey, NULL);
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

void _thread_setspecific(void * val) {
	pthread_setspecific(key, val);
}

place_t _thread_gethere() {
	// place_t* temp = (place_t*)pthread_getspecific(herekey);
	// return *temp;
	place_t temp = (place_t)pthread_getspecific(herekey);
	return temp;
}

void _thread_sethere(place_t val) {
	// place_t* temp = (place_t*) malloc(sizeof(place_t));
	// *temp = val;
	// pthread_setspecific(herekey, (void*)temp);
	pthread_setspecific(herekey, (void*)val);
}


void _ack_async(struct Msg* msg) {
	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int32_t rc = pthread_create(&t, &attr, _ack_thread_start, (void *)msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}

/*void _create_async_local(_async child, place_t remote_place) {
	_task* self = (_task*)_thread_getspecific();
	//fprintf(stderr, "%d: THIS IS TASK DISPATCH %x:%u:%u\n", _here(), self, self->up_count, self->down_count);
	task_register(self);
	void* msg = malloc(sizeof(_async) + sizeof(_task*) + sizeof(place_t) + sizeof(place_t));
	_async* a = (_async*) msg;
	a -> method = child.method;
	a -> size = child.size;
	a -> params = child.params;
	*((_task**)(msg + sizeof(_async))) = self;
	*((place_t *)(msg+sizeof(_async)+sizeof(_task*))) = _here(); 
	*((place_t *)(msg+sizeof(_async)+sizeof(_task*)+sizeof(place_t))) = remote_place; 

	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int32_t rc = pthread_create(&t, &attr, _thread_start_local, msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}
*/
void _create_async(struct Msg* msg) {
	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int32_t rc = pthread_create(&t, &attr, _thread_start, (void *)msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}

void _create_async_local(struct Msg* msg) {
	pthread_t t;
	pthread_attr_t attr;
	pthread_attr_init(&attr);
	pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
	int32_t rc = pthread_create(&t, &attr, _thread_start_local, msg);
	if (rc) {
		printf("ERROR: return code from pthread_create() is %d\n", rc);
		exit(-1);
	}
	pthread_attr_destroy(&attr);
}

void _create_main_thread() {
	// writeDebug("Starting the termination of the dispatcher at place");
	int32_t rc = pthread_create(&main_thread, NULL, _main_thread_start, NULL);
	if (rc) {
		writeErrorExtraPlace("ERROR: return code from pthread_create()", rc);
		
	}
}

void _join_main_thread() {
	pthread_join(main_thread, NULL);
}
