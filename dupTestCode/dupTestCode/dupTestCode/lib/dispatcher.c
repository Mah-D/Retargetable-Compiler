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
int _init_config(){
	task_init();
	return init_comm_channel();
	}

int main(void) {
	
	fprintf(stderr, "Starting Dispatcher\n");
	
//	fprintf(stderr, "Started Dispatcher waiting input\n");
	
	_place_init();
	
	//writeDebug("Read the  config file");
	//Starts the dispatcher
	int success = dispatcher();
	writeDebug("Dispatcher Exited at place");
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}

int dispatcher() {
	//Starts Sending and Reading Ready Msgs
	
	_init_config();
	if (_isfirst(_here())) {
		//writeDebugExtraPlace("Dispatcher waiting for", _max_places());
		int max_places = _max_places();
		int i;
		for(i = 1; i < max_places; i++) {
		struct Msg* msgStruct = (struct Msg*)malloc(sizeof(struct Msg));
			writeDebug("Dispatcher waiting for msg");
			int success = ReadMsg(msgStruct, _toplace(i));
			//writeDebugExtraPlace("TEST", (int)msgStruct);

			if (success == EXIT_SUCCESS && msgStruct->msgType == READY) {
								writeDebug("Dispatcher received Msgs from a place");
			} else {
				writeErrorExtraPlace("Dispatcher Failed receiving a Msgs at a place", msgStruct->placeFrom);
				return EXIT_FAILURE;
			}	
			
			
		_deallocate_msg(msgStruct);
			
		}
		writeDebug("Dispatcher received all N-1 Msgs");
		_create_main_thread();
	} else{
		const char * mychar = "READY";
		writeDebug("Dispatcher sending ready Msg");
		int success = WriteMsg(_place_first(), READY, (uint64_t)(sizeof(char)*6), (void *)mychar);
		if (success==EXIT_FAILURE) {
			return EXIT_FAILURE;
		}
	} 
	int exit = 1;
	
	
	//Starts the Read Loops
	writeDebug("Dispatcher waiting for normal msgs");
	int counter =0;
	while (exit)  {
		writeDebugExtraPlace("Dispatcher Starting to loop read a msg",counter);
		counter++;
		struct Msg* msgStructRead = (struct Msg*)malloc(sizeof(struct Msg));
		int success = ReadMsg(msgStructRead, _here());
		if (success == EXIT_FAILURE) {
			return EXIT_FAILURE;
		}
		writeDebug("Read one msg");
		switch (msgStructRead->msgType) {
			case ASYNC: // async
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
	if(_isfirst(_here())){
		writeDebug("Waiting to join");
		_join_main_thread();
		writeDebug("Finished waiting!!!");
	}
	writeDebug("Finished successfully at place");
	return EXIT_SUCCESS;
}






