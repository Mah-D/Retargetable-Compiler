/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "mpi.h"
#include "../inc/decodemsg.h"

int32_t DecodeMsg(struct Msg* messageStruct, place_t _rec_from) {
	int32_t fdToReadFrom =  _get_read_fd(_rec_from);
	tpl_node * tn;
	tpl_bin tb;
	//struct MsgRead* msgStruct =  (struct MsgRead*)GC_MALLOC(sizeof(struct MsgRead));
	tn = tpl_map("S(iiiU)B", messageStruct, &tb);
	MPI_Status status;
	int32_t count=0;
	//writeDebug("started trying to load msg");
	//int32_t success = tpl_load(tn, TPL_FD, fdToReadFrom);
  	//fprintf(stderr, "%d:Waiting for probe message\n", _here());
	int32_t ierr = MPI_Probe(MPI_ANY_SOURCE, MPI_ANY_TAG, MPI_COMM_WORLD, &status);
  	//fprintf(stderr, "MPI ERROR %d, MPI_SOURCE %di IERR %d \n", status.MPI_ERROR, status.MPI_SOURCE, ierr);
	//fprintf(stderr, "%d:Waiting for get count message\n", _here());
	ierr = MPI_Get_count(&status, MPI_BYTE, &count);
  	//fprintf(stderr, "%d:Count message is %d\n and error = %d\n", _here(), count, ierr);
	//int32_t success = status -> ;
	void * temp = malloc(count);
  	//fprintf(stderr, "MPI_SOURCE = %d\n", status.MPI_SOURCE);
  	//fprintf(stderr, "%d:Waiting for recv message\n", _here());
	int32_t src = status.MPI_SOURCE;
	MPI_Recv(temp, count, MPI_BYTE, src, 1, MPI_COMM_WORLD, &status);
	//fprintf(stderr, "%d:Msg received \n", _here());
	tpl_load(tn, TPL_MEM|TPL_UFREE, temp, count);
	tpl_unpack(tn, 0);
  	//fprintf(stderr, "%d:Unpack successful\n", _here());
	//writeDebug("msg unpacked succesfully");
	//messageStruct->msgType = msgStruct->msgType;
	//messageStruct->placeFrom = msgStruct->placeFrom;
	//messageStruct->size = msgStruct->size;
	//messageStruct->placeTo = msgStruct->placeTo;
	messageStruct->tb.addr = tb.addr;
	messageStruct->tb.sz = tb.sz;
//	uint64_t temp2 = getMicroTime();
//	int64_t temp = (temp2-(messageStruct->time));
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
