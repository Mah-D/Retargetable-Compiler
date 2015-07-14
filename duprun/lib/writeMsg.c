/*
 * WriteMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "../inc/writemsg.h"
#include "../inc/errormsg.h"
// returns the mutex lock for writes

int32_t init_comm_channel(){
	init_process_msg();
}


int32_t WriteMsg(place_t placeToWriteMsg, int32_t msgType, uint64_t sizeOfBlob, void * blob) {
	
	//writeDebug("started writing msg");
  //fprintf(stderr, "%d:blob iuuubefore %d make sure msg is correct \n", _here(), (int)blob);
	int32_t success = ProcessMsg(placeToWriteMsg, msgType, sizeOfBlob, blob);
	//writeDebugExtraPlace("Finished writing msg to place ",placeToWriteMsg);

	
	if (success == EXIT_SUCCESS) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}


