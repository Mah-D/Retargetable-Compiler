/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/decodemsg.h"


int DecodeMsg(struct Msg* messageStruct, place_t _rec_from) {
	int fdToReadFrom =  _get_read_fd(_rec_from);
	tpl_node * tn;
	tpl_bin tb;

	struct MsgRead* msgStruct =  (struct MsgRead*)malloc(sizeof(struct MsgRead));
	tn = tpl_map("S(iiU)B", msgStruct, &tb);
	writeDebug("MSG Mapped");
	
	int validity = (fcntl(fdToReadFrom, F_GETFL) != -1);

		if (validity) {
			writeDebugExtraPlace("File descriptor is accessible",
					fdToReadFrom);
		} else {
			writeErrorExtraPlace("File descriptor is not accessible",
					fdToReadFrom);
		}

	writeDebug("started trying to load msg");
	int success = tpl_load(tn, TPL_FD, fdToReadFrom);
	writeDebug("Finished loading");


		if (success == 0) {
			writeDebugExtraPlace("msg read on file descriptor",
					fdToReadFrom);
		} else {
			writeErrorExtraPlace("msg failed to read on file descriptor",
					fdToReadFrom);
			return EXIT_FAILURE;
		}

	writeDebug("unpacking reading msg");
	tpl_unpack(tn, 0);
	writeDebug("msg unpacked succesfully");
	messageStruct->msgType = msgStruct->msgType;
	messageStruct->placeFrom = msgStruct->placeFrom;
	messageStruct->size = msgStruct->size;
	messageStruct->tb.addr = tb.addr;
	messageStruct->tb.sz = tb.sz;
	
	writeDebugMsg(messageStruct);
	
	writeDebug("tpl will be freed");

	tpl_free(tn);
		writeDebug("tpl freed");
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}
