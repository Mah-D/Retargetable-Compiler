/*
 * ReadMsg.c
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "Config.h"
int ReadMsg(int place) {
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My started readmsg\n", place);

	char * message = NULL;

	struct Msg messageStruct;
	int success = DecodeMsg(place, &messageStruct);

	message = (char *)messageStruct.tb.addr;

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My Type %d my Msg = %s from %d\n", place,
				messageStruct.msgType, message, messageStruct.placeFrom);

	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}

}

