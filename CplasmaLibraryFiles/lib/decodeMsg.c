/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/config.h"
#include <unistd.h>
#include <fcntl.h>
int DecodeMsg(struct Msg* messageStruct, place_t _rec_from) {
	int fdToReadFrom =  _get_read_fd(_rec_from);
	tpl_node * tn;

	tn = tpl_map("S(iiU)B", messageStruct, &(messageStruct->tb));
	if (OUTPUT_ERROR)
		fprintf(stderr, "MSG Mapped\n");

	fprintf(stderr, "%d:started reading msg\n", _here());

	int validity = (fcntl(fdToReadFrom, F_GETFL) != -1);
	if (OUTPUT_ERROR) {
		if (validity) {
			fprintf(stderr, "%d:File descriptor %d is accessible\n", _here(),
					fdToReadFrom);
		} else {
			fprintf(stderr, "%d:File descriptor %d is not accessible\n", _here(),
					fdToReadFrom);
		}
	}

	int success = tpl_load(tn, TPL_FD, fdToReadFrom);
	if (OUTPUT_ERROR)

		fprintf(stderr, "%d:Finished Decoding Mapping\n", _here());

	if (OUTPUT_ERROR) {
		if (success == 0) {
			fprintf(stderr, "%d:msg read on file descriptor %d\n", _here(),
					fdToReadFrom);
		} else {
			fprintf(stderr, "%d:msg read on file descriptor %d FAILED\n",
					_here(), fdToReadFrom);
			return EXIT_FAILURE;
		}
	}
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:unpacking reading msg\n", _here());
	tpl_unpack(tn, 0);

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:My Type%d my Msg = %s from %d\n", _here(),
				messageStruct->msgType, (char *) (messageStruct->tb.addr),
				messageStruct->placeFrom);
	tpl_free(tn);
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}
