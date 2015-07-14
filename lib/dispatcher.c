/*
 ============================================================================
 Name        : dispatcher.c
 Author      : Oren Freiberg and Riyaz Haque
 Version     : 1
 Copyright   :
 Description : A Dispatcher for  in C, Ansi-style
 ============================================================================
 */


#include "../inc/communication.h"
#include "../inc/errormsg.h"
#include "../inc/async.h"
int32_t _init_config() {
	task_init();
	return init_comm_channel();
}

int32_t main(int argc, char *argv[]) {
	
	writeDebug("Starting Dispatcher\n");
	
	//	writeDebug("Started Dispatcher waiting input\n");
	//GC_INIT();	
	
	_place_init(argc, argv);
	
	//fprintf(stderr, "PLACE SETINGS %d:%d\n", _max_places(), _here());

	//writeDebug("Read the  config file");
	//Starts the dispatcher
	
	int32_t success = dispatcher();
	writeDebug("Dispatcher Exited at place");
	if (success == EXIT_SUCCESS) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}

int32_t dispatcher() {
	
	_init_config();
	//Starts Sending and Reading Ready Msgs
 	_task * t = (_task*)malloc(sizeof(_task));
       /*       t -> total_memory = 0; 
        t -> total_memory_string=0;
        t -> total_memory_value_class=0;
        t -> total_memory_value_array=0;
        t -> total_memory_class=0;
        t -> total_memory_update_array=0;*/
	_thread_setspecific((void *)t);
	

	if(_max_dispatchers() > 1)
	{
		if(_isdispatcherzero(_dispatcher_rank())) {
		// if (_isfirst(_here())) {
			//writeDebugExtraPlace("Dispatcher waiting for", _max_places());
			int32_t max_places = _max_places();
			int32_t i;
			for(i = 1; i < max_places; i++) {
				//struct Msg* msgStruct = (struct Msg*)GC_MALLOC(sizeof(struct Msg));
				struct Msg* msgStruct = (struct Msg*)malloc(sizeof(struct Msg));
				//writeDebug("Dispatcher waiting for msg");
				int32_t success = ReadMsg(msgStruct, _toplace(i));
				//writeDebugExtraPlace("TEST", (int)msgStruct);

				if (success == EXIT_SUCCESS && msgStruct->msgType == READY) {
				//	writeDebug("Dispatcher received Msgs from a place");
				} else {
					writeErrorExtraPlace("Dispatcher Failed receiving a Msgs at a place", msgStruct->placeFrom);
					return EXIT_FAILURE;
				}	
				_deallocate_msg(msgStruct);
			}
			writeDebug("Dispatcher received all N-1 Msgs");
			_create_main_thread();
		} else {
			const char * mychar = "READY";
			writeDebug("Dispatcher sending ready Msg");
			
			initconstants();
			//end of added code
			//print_memory(t);
			//t -> total_memory = 0;
			int32_t success = WriteMsg(_place_first(), READY, (uint64_t)(sizeof(char)*6), (void *)mychar);
			if (success==EXIT_FAILURE) {
				return EXIT_FAILURE;
			}
		}
	}
	else {
		_create_main_thread();
	}

	int32_t exit = 1;
	//Starts the Read Loops
	writeDebug("Dispatcher waiting for normal msgs");
	uint32_t counter =0;
	uint32_t counterAsync =0;
	while (exit)  {
		//writeDebugExtraPlace("Dispatcher Starting to loop read a msg",counter);
		counter++;
		//struct Msg* msgStructRead = (struct Msg*)GC_MALLOC(sizeof(struct Msg));
		struct Msg* msgStructRead = (struct Msg*)malloc(sizeof(struct Msg));
		
		int32_t success = ReadMsg(msgStructRead, 0);
		if (success == EXIT_FAILURE) {
			writeDebug("DISPATCHER EXITED WITH FAIL ERROR ERROR error \n");	
			return EXIT_FAILURE;
		}
		//writeDebugExtraPlace("Read one msg GOT HERE\n", 0);
		//writeDebugExtraPlace("Read one msg", msgStructRead->msgType);
		//fprintf(stdout, "GOT HERE MAYBE MSG TYPE IS NULL %d ???\n", _here());
		switch (msgStructRead->msgType) {
			case ASYNC: // async
				counterAsync++;
				_create_async(msgStructRead);
				break;
			case ASYNC_ACK: // async completion
				_ack_async(msgStructRead);
				break;
			case TERMINATE:
				exit = 0;
				writeDebug("Dispatcher Terminating");			
				_deallocate_msg(msgStructRead);
				break;
			default:
				exit = 0;
				writeDebug("Dispatcher Terminating by Default case");
				return EXIT_FAILURE;
		}
	}
	writeDebugExtraPlace("Dispatcher read number of msgs", counter);
	writeDebugExtraPlace("Dispatcher create this number of asyncs", counterAsync);
	if(_isdispatcherzero(_dispatcher_rank())) {
	// if(_isfirst(_here())){
		writeDebug("Waiting to join");
		_join_main_thread();
		writeDebug("Finished waiting!!!");
	}
	writeDebug("Finished successfully at place");
	MPI_Finalize();
	return EXIT_SUCCESS;
}
