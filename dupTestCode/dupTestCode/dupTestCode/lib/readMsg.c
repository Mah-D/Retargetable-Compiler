/*
 * ReadMsg.c
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/errormsg.h"
#include "../inc/readmsg.h"
int ReadMsg(struct Msg* messageStruct, place_t _rec_from) {
	writeDebug("Read Msg started reading messages");
	//struct Msg messageStruct;
	int success = DecodeMsg(messageStruct, _rec_from);

		if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}

}

