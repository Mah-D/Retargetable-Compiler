/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "Config.h"
#include <unistd.h>
#include <fcntl.h>
int DecodeMsg(int place, struct Msg* messageStruct) {
	tpl_node * tn;

	tn = tpl_map("S(iiU)B", messageStruct, &(messageStruct->tb));
	if (OUTPUT_ERROR)
		fprintf(stderr, "MSG Mapped\n");

	fprintf(stderr, "%d:started reading msg\n", place);

	int validity = (fcntl(FILE_DESCRIPTOR_DUP_READ, F_GETFL) != -1);
	if (OUTPUT_ERROR) {
		if (validity) {
			fprintf(stderr, "%d:File descriptor %d is accessible\n", place,
					FILE_DESCRIPTOR_DUP_READ);
		} else {
			fprintf(stderr, "%d:File descriptor %d is not accessible\n", place,
					FILE_DESCRIPTOR_DUP_READ);
		}
	}

	int success = tpl_load(tn, TPL_FD, FILE_DESCRIPTOR_DUP_READ);
	if (OUTPUT_ERROR)

		fprintf(stderr, "%d:Finished Decoding Mapping\n", place);

	if (OUTPUT_ERROR) {
		if (success == 0) {
			fprintf(stderr, "%d:msg read on file descriptor %d\n", place,
					FILE_DESCRIPTOR_DUP_READ);
		} else {
			fprintf(stderr, "%d:msg read on file descriptor %d FAILED\n",
					place, FILE_DESCRIPTOR_DUP_READ);
			return EXIT_FAILURE;
		}
	}
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:unpacking reading msg\n", place);
	tpl_unpack(tn, 0);

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My Type%d my Msg = %s from %d\n", place,
				messageStruct->msgType, (char *) (messageStruct->tb.addr),
				messageStruct->placeFrom);
	tpl_free(tn);
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}
