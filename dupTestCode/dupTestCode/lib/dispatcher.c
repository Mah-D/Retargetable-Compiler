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
	init_comm_channel();
	}

int main(void) {
	
	fprintf(stderr, "Starting Dispatcher\n");
	
	fprintf(stderr, "Started Dispatcher waiting input\n");
	
	_place_init();
	
	writeDebug("Read the  config file");
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
	struct Msg* msgStruct = (struct Msg*)malloc(sizeof(struct Msg));
	if (_isfirst(_here())) {
		writeDebugExtraPlace("Dispatcher waiting for", _max_places());
	
		int max_places = _max_places();
		int i;
		for(i = 1; i < max_places; i++) {
			int success = ReadMsg(msgStruct, _toplace(i));
			writeDebugExtraPlace("TEST", (int)msgStruct);

			if (success == EXIT_SUCCESS && msgStruct->msgType == READY) {
								writeDebug("Dispatcher received Msgs from a place");
			} else {
				writeErrorExtraPlace("Dispatcher Failed receiving a Msgs at a place", msgStruct->placeFrom);
				return EXIT_FAILURE;
			}	
			
			
			
		}
		writeDebug("Dispatcher received all N-1 Msgs");
		_create_main_thread();
	} else{
		const char * mychar = "READ";
		writeDebug("Dispatcher sending ready Msg");
		
		int success = WriteMsg(_place_first(), READY,
							   5, "READ");
		if (!success) {
			return EXIT_FAILURE;
		}
	} 
	
	
	int exit = 1 ;
	
	
	//Starts the Read Loops
	writeDebug("Dispatcher waiting for normal msgs");
	struct Msg* msgStructRead = (struct Msg*)malloc(sizeof(struct Msg));
	while (exit && !_isfirst(_here()) )  {
		int success = ReadMsg(msgStructRead, _here());
		if (!success) {
			return EXIT_FAILURE;
		}
			writeDebug("Read one msg");
		switch (msgStruct->msgType) {
			case ASYNC: // async
				_create_async(msgStruct);
				break;
			case ASYNC_ACK: // async completion
				_ack_async(msgStruct);
				break;
			case TERMINATE:
				exit = 0;
				writeDebug("Dispatcher Terminating");
				break;
			default:
				exit = 0;
				writeDebug("Dispatcher Terminating");
				return EXIT_FAILURE;
				break;
		}
		
	}
	//_deallocate_msg(msgStruct);
	//_deallocate_msg(msgStructRead);
	if(_isfirst(_here())){
		int i;
		int success;
		for (i = _max_places()-1; i >= 0 ; --i) {
			success = WriteMsg(i, TERMINATE, 5, "hell");
			if (success != EXIT_SUCCESS) {
				writeError("ERROR: Failed thread _terminate_all_places at place");
				return EXIT_FAILURE;
			}
		}
		writeDebug("Waiting to join");
		
	_join_main_thread();
		
		writeDebug("Finished waiting!!!");
	}
	writeDebug("Finished successfully at place");
	return EXIT_SUCCESS;
}










