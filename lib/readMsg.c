/*
 * ReadMsg.c
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/errormsg.h"
#include "../inc/readmsg.h"
int32_t ReadMsg(struct Msg* messageStruct, place_t _rec_from) {
	//writeDebug("Read Msg started reading messages");
	//struct Msg messageStruct;
	int32_t success = DecodeMsg(messageStruct, _rec_from);
	return success;

}

