/*
 * WriteMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "../inc/writemsg.h"
#include "../inc/errormsg.h"
// returns the mutex lock for writes

int init_comm_channel(){
	init_process_msg();
}


int WriteMsg(place_t placeToWriteMsg, int msgType, uint64_t sizeOfBlob, void * blob) {
	
	writeDebug("started writing msg");
	int success = ProcessMsg(placeToWriteMsg, msgType, sizeOfBlob, blob);
	writeDebugExtraPlace("Finished writing msg to place ",placeToWriteMsg);

	
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}


