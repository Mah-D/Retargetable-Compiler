/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "mpi.h"
#include "../inc/decodemsg.h"
#include "gc.h"


int32_t DecodeMsg(struct Msg* messageStruct, place_t _rec_from) {
	int32_t fdToReadFrom =  _get_read_fd(_rec_from);
	tpl_node * tn;
	tpl_bin tb;

	//struct MsgRead* msgStruct =  (struct MsgRead*)GC_MALLOC(sizeof(struct MsgRead));
	tn = tpl_map("S(iiiU)B", messageStruct, &tb);
	//writeDebug("MSG Mapped");
	
	/*int32_t validity = (fcntl(fdToReadFrom, F_GETFL) != -1);

		if (validity) {
			//writeDebugExtraPlace("File descriptor is accessible",
					//fdToReadFrom);
		} else {
			writeErrorExtraPlace("File descriptor is not accessible",
					fdToReadFrom);
		}
	*/
	MPI_Status status;
	int32_t count=0;
	//writeDebug("started trying to load msg");
	//int32_t success = tpl_load(tn, TPL_FD, fdToReadFrom);
  	fprintf(stderr, "%d:Waiting for probe message\n", _here());
	MPI_Probe(MPI_ANY_SOURCE, MPI_ANY_TAG, MPI_COMM_WORLD, &status);
  	fprintf(stderr, "%d:Waiting for get count message\n", _here());
	MPI_Get_count(&status, MPI_BYTE, &count);
  	fprintf(stderr, "%d:Count message is %d\n", _here(), count);
	//int32_t success = status -> ;
	void * temp = malloc(count);
  	fprintf(stderr, "%d:Waiting for recv message\n", _here());
	MPI_Recv(temp, count, MPI_BYTE, status.MPI_SOURCE, 1, MPI_COMM_WORLD, &status);
  	fprintf(stderr, "%d:Msg received \n", _here());
	tpl_load(tn, TPL_MEM|TPL_UFREE, temp, count);
	//writeDebug("Finished loading");


	//	if (success == 0) {
			//writeDebugExtraPlace("msg read on file descriptor",
					//fdToReadFrom);
	//	} else {
	//		writeErrorExtraPlace("msg failed to read on file descriptor",
	//				fdToReadFrom);
	//		return EXIT_FAILURE;
	//	}

	//writeDebug("unpacking reading msg");
	tpl_unpack(tn, 0);
  	fprintf(stderr, "%d:Unpack successful\n", _here());
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
	//free(temp);
	//writeDebug("tpl freed");
	//if (success) {
	return EXIT_SUCCESS;
	//} else {
	//	return EXIT_FAILURE;
	//}
}
