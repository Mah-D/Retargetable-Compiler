/*
 * ProcessMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "mpi.h"
#include "../inc/processmsg.h"
#include <pthread.h>
#include <fcntl.h>
// #include <sys/time.h>
static pthread_mutex_t mp;

/*const double getTIMEPROC(){
	uint64_t microsecs;
	struct timeval tv; 
	gettimeofday(&tv, NULL);
	microsecs = ((uint64_t)tv.tv_sec * 1000000);
	microsecs += tv.tv_usec;
	const double temp = (const double)microsecs;
	const double temp2 = temp/1000;
	return temp2; 
}*/
int32_t init_process_msg(){
	int32_t ret;
	ret = pthread_mutex_init(&mp, NULL);
	//tpl_hook.malloc = GC_MALLOC;
	//tpl_hook.free = GC_FREE;
	if (ret == EXIT_FAILURE) {
		writeError("Creating pthread writing mutex failed");
	}
	return ret;		
}
pthread_mutex_t getMutexLock() {
	return mp;
}
int32_t ProcessMsg(place_t placeToWriteMsg, int32_t msgType, uint64_t sizeOfBlob, void * blob) {
	tpl_node* tn;
	tpl_bin tb;
	int32_t fdToWrite = _get_write_fd(placeToWriteMsg);
	int32_t numberHere = (int32_t)_here();
	//struct Msg* msgStruct =  (struct Msg*)GC_MALLOC(sizeof(struct Msg));
	struct Msg* msgStruct =  (struct Msg*)malloc(sizeof(struct Msg));

	msgStruct->placeFrom = numberHere;
	msgStruct->placeTo = placeToWriteMsg;
	msgStruct->msgType = msgType; 
	msgStruct->size = sizeOfBlob;
	tn = tpl_map("S(iiiU)B", msgStruct, &tb );
	tb.sz = sizeOfBlob;
	tb.addr = blob;
	tpl_pack(tn, 0);
			
	//writeDebug("MSG Packed");
	//int32_t validity = (fcntl(fdToWrite, F_GETFL) != -1);
	//if (validity) {
		//writeDebugExtraPlace("File descriptor is accessible",
					//fdToWrite);
		
	//} else {
	//	writeErrorExtraPlace("File descriptor is not accessible\n", fdToWrite);
	//	return EXIT_FAILURE;
	//}

	int32_t pthreadRet1;
	int32_t pthreadRet2;
	//pthread_mutex_t writeLock = getMutexLock();
	//pthreadRet1 = pthread_mutex_lock(&writeLock);
	//int32_t success = tpl_dump(tn, TPL_FD, fdToWrite);
	volatile void *temp=0;
	size_t len=0;
	tpl_dump(tn, TPL_MEM, &temp, &len);
	MPI_Request request;
	MPI_Status status;
	
	// Non-blocking Send
	//int32_t success = MPI_Isend(temp, len, MPI_BYTE, fdToWrite, 1, MPI_COMM_WORLD, &request);
	//tpl_free(tn);
	//_deallocate_msg_only(msgStruct);

	// Blocking send
	// double start_time = getTIMEPROC();
	// int32_t success = MPI_Send(temp, len, MPI_BYTE, fdToWrite, 1, MPI_COMM_WORLD);
	int32_t success = MPI_Bsend(temp, len, MPI_BYTE, fdToWrite, 1, MPI_COMM_WORLD);
	// start_time = getTIMEPROC() - start_time;
	// fprintf(stderr, "Time for send %4.9f\n", start_time);
	free(temp);
	tpl_free(tn);
	_deallocate_msg_only(msgStruct);
	
	// Buffered Send
	//int32_t success = MPI_Bsend(temp, len, MPI_BYTE, fdToWrite, 1, MPI_COMM_WORLD);
	//free(temp);
	//tpl_free(tn);
	//_deallocate_msg_only(msgStruct);
	
	if(success == 0 ){
		//fprintf(stderr, "Message SUCCESS SENT FROM %d\n", _here());
	}else{
		fprintf(stderr, "MESSAGE FAILED TO SEND\n");
		return EXIT_FAILURE;
	}
	//pthreadRet2 = pthread_mutex_unlock(&writeLock);
	
	/*if(pthreadRet1==EXIT_FAILURE){
		writeError("Thread locked unsuccessful msg");
	}else if(pthreadRet2==EXIT_FAILURE){
		writeError("Thread unlocked unsuccessful");
	}else{
		//writeDebug("thread locked and unlocked successful");
	}*/
	
	return EXIT_SUCCESS;
}
