/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/decodemsg.h"
#include "gc.h"


int32_t DecodeMsg(struct Msg* messageStruct, place_t _rec_from) {
	int32_t fdToReadFrom =  _get_read_fd(_rec_from);
	tpl_node * tn;
	tpl_bin tb;

	//struct MsgRead* msgStruct =  (struct MsgRead*)GC_MALLOC(sizeof(struct MsgRead));
	tn = tpl_map("S(iiiU)B", messageStruct, &tb);
	//writeDebug("MSG Mapped");
	
	int32_t validity = (fcntl(fdToReadFrom, F_GETFL) != -1);

		if (validity) {
			//writeDebugExtraPlace("File descriptor is accessible",
					//fdToReadFrom);
		} else {
			writeErrorExtraPlace("File descriptor is not accessible",
					fdToReadFrom);
		}

	//writeDebug("started trying to load msg");
	int32_t success = tpl_load(tn, TPL_FD, fdToReadFrom);
	//writeDebug("Finished loading");


		if (success == 0) {
			//writeDebugExtraPlace("msg read on file descriptor",
					//fdToReadFrom);
		} else {
			writeErrorExtraPlace("msg failed to read on file descriptor",
					fdToReadFrom);
			return EXIT_FAILURE;
		}

	//writeDebug("unpacking reading msg");
	tpl_unpack(tn, 0);
	//writeDebug("msg unpacked succesfully");
	//messageStruct->msgType = msgStruct->msgType;
	//messageStruct->placeFrom = msgStruct->placeFrom;
	//messageStruct->size = msgStruct->size;
	//messageStruct->placeTo = msgStruct->placeTo;
	messageStruct->tb.addr = tb.addr;
	messageStruct->tb.sz = tb.sz;
//	uint64_t temp2 = getMicroTime();
//	int64_t temp = (temp2-(messageStruct->time));
//	fprintf(stderr, "%d GOING TO %d TOTAL TIME THIS MESSAGE TOOK TIME: %lld, %llu, %llu \n", messageStruct->placeFrom, messageStruct->placeTo, temp, temp2, messageStruct->time);	
//	writeDebugMsg(messageStruct);
		
  //fprintf(stderr, "%d:blob READ iuuubefore %s make sure msg is correct \n", _here(), (char *)tb.addr);
	//writeDebug("tpl will be freed");

	tpl_free(tn);
	return EXIT_SUCCESS;	
//writeDebug("tpl freed");
}
