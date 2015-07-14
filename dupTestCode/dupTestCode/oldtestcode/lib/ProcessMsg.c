/*
 * ProcessMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "../inc/Config.h"
#include <unistd.h>
#include <fcntl.h>
int ProcessMsg(tpl_node **tn, int placeToWriteMsg, int msgType, unsigned long long  sizeOfBlob, void * blob) {

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Processing MSG\n", _here());
	tpl_bin tb;
	struct Msg msgStruct = { _here(), msgType, sizeOfBlob};
	*tn = tpl_map("S(iiU)B", &msgStruct, &tb);
	tb.sz = sizeOfBlob;
	tb.addr = blob;
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:MSG Mapped\n", _here());
	tpl_pack(*tn, 0);
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:MSG Packed\n", _here());
	int validity = (fcntl(placeToWriteMsg, F_GETFL) != -1);
	if (validity) {
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:File descriptor %d is accessible\n", _here(),
					placeToWriteMsg);
		return EXIT_SUCCESS;
	} else {
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:File descriptor %d is accessible\n", _here(),
					placeToWriteMsg);
		return EXIT_FAILURE;
	}
}
