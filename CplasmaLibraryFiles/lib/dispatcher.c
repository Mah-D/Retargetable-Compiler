/*
 ============================================================================
 Name        : dispatcher.c
 Author      : Oren Freiberg and Riyaz Haque
 Version     : 1
 Copyright   :
 Description : A Dispatcher for  in C, Ansi-style
 ============================================================================
 */

#include "../inc/config.h"
int main(void) {

	fprintf(stderr, "Starting Dispatcher\n");
	if (OUTPUT_ERROR)
		fputs("Started Dispatcher waiting input\n", stderr);
	_place_init();
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Read config file\n", _here());
	
	//Starts the dispatcher
	int success = dispatcher();
	if (OUTPUT_ERROR)
		fprintf(stderr, "Dispatcher Exited at place %d\n", _here());
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
	    if (OUTPUT_ERROR)
			fprintf(stderr, "Dispatcher waiting for %d Msgs\n", _max_places());
		
		
		struct Msg* msgStruct;
		int max_places = _max_places();
		int i;
		for(i = 1; i < max_places; i++) {
			int success = ReadMsg(msgStruct);
			if (success == EXIT_SUCCESS && msgStruct->msgType == READY) {
				if (OUTPUT_ERROR)
					fprintf(stderr,
							"%d:Dispatcher received Msgs from a place\n",
							_here());
			} else {
				if (OUTPUT_ERROR)
					fprintf(
							stderr,
							"%d:Dispatcher Failed receiving a Msgs at a place = %d\n",
							_here(), msgStruct->placeFrom);
				return EXIT_FAILURE;
				}	
			
			
		//TODO Deallocate msg
		}
			_create_main_thread();
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher received all N-1 Msgs\n", _here());

	} else{
		char * mychar = "READY";
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher sending ready Msg\n", _here());

		int success = WriteMsg(_place_first(), READY,
				sizeof(&mychar) + 1, mychar);
		if (!success) {
			return EXIT_FAILURE;
		}
	} 

	
	int exit = 1;
	struct Msg* msgStruct;

	//Starts the Read Loops
	while (exit) {
		int success = ReadMsg(msgStruct, _here());
		if (!success) {
			return EXIT_FAILURE;
		}

		switch (msgStruct->msgType) {
		case ASYNC: // async
			//_create_async(mesg);
			break;
		case ASYNC_ACK: // async completion
				//_ack_async(mesg);
				break;
		case TERMINATE:
			exit = -1;
			break;
		default:
			exit = -1;
			return EXIT_FAILURE;
			break;
		}

	}
	if (OUTPUT_ERROR)
		fprintf(stderr, "Finished successfully at place %d\n", _here());
	return EXIT_SUCCESS;
}



int _init_config(){
	int ret;
	//ret = pthread_mutex_init(&mp, NULL);
	if (ret == EXIT_FAILURE) {
		fprintf(stderr, "%d:Creating pthread writing mutex failed\n", 	_here());
	}
	return ret;
}








