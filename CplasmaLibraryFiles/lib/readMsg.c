/*
 * ReadMsg.c
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/config.h"
int ReadMsg(struct Msg* messageStruct, place_t _rec_from) {
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My started readmsg\n", _here());

	char * message = NULL;

	//struct Msg messageStruct;
	int success = DecodeMsg(messageStruct, _rec_from);

	message = (char *)messageStruct->tb.addr;

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My Type %d my Msg = %s from %d\n", _here(),
				messageStruct->msgType, message, messageStruct->placeFrom);

	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}

}

