/*
 * ReadMsg.c
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */

#include <stdio.h>
#include <stdlib.h>
#include "Message.h"
#include "Config.h"
#include <unistd.h>
#include <fcntl.h>

int ReadMsg(int place) {
	fprintf(stderr, "%d:My started readmsg\n", place);
	tpl_node * tn;
	char * msg;
	fprintf(stderr, "MSG Mapped\n");
	tn = tpl_map("s", &msg);
	fprintf(stderr, "%d:Finished Decoding Mapping\n", place);
	fprintf(stderr, "%d:started reading msg\n", place);

	int validity = (fcntl(FILE_DESCRIPTOR_DUP, F_GETFL) != -1);
	if (validity) {
		fprintf(stderr, "%d:File descriptor %d is accessible\n", place,
				FILE_DESCRIPTOR_DUP);
	} else {
		fprintf(stderr, "%d:File descriptor %d is not accessible\n", place,
				FILE_DESCRIPTOR_DUP);
	}

	int success = tpl_load(tn, TPL_FD, FILE_DESCRIPTOR_DUP);

	if (success == 0) {
		fprintf(stderr, "%d:msg read on file descriptor %d\n", place,
				FILE_DESCRIPTOR_DUP);

	} else {
		fprintf(stderr, "%d:msg read on file descriptor %d FAILED\n", place,
				FILE_DESCRIPTOR_DUP);
	}
	fprintf(stderr, "%d:unpacking reading msg\n", place);
	tpl_unpack(tn, 0);
	fprintf(stderr, "%d:message reading unpacked\n", place);
	fprintf(stderr, "%d:My Msg = %s\n", place, msg);
	tpl_free(tn);


	return EXIT_SUCCESS;

}

