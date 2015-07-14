/*
 * ProcessMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include "gc.h"
#include "../inc/processmsg.h"
#include <pthread.h>
#include <fcntl.h>
static pthread_mutex_t mp;
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
	//int32_t pthreadRet1;
	//int32_t pthreadRet2;
	//pthread_mutex_t writeLock = getMutexLock();
	//pthreadRet1 = pthread_mutex_lock(&writeLock);
	//writeDebug("Processing MSG");


   	tpl_node* tn;
	tpl_bin tb;
	int32_t fdToWrite = _get_write_fd(placeToWriteMsg);
	int32_t numberHere = (int)_here();
	//struct Msg* msgStruct =  (struct Msg*)GC_MALLOC(sizeof(struct Msg));
	struct Msg* msgStruct =  (struct Msg*)malloc(sizeof(struct Msg));

	msgStruct->placeFrom = numberHere;
	msgStruct->placeTo = placeToWriteMsg;
    msgStruct->msgType = msgType; 
	msgStruct->size = sizeOfBlob;
//    msgStruct->time = getMicroTime();
	tn = tpl_map("S(iiiU)B", msgStruct, &tb );
//	fprintf(stderr, "%d:blob WRITE ibefore for message type %d with value %s make sure msg is correct \n", _here(), msgType, (char *)blob);
	tb.sz = sizeOfBlob;
	tb.addr = blob;
//	writeDebugExtraPlace("MSG being sent to place ", placeToWriteMsg);
//	fprintf(stderr,"%d: MY TYPE OF MSG %d\n", _here(), msgType);
	tpl_pack(tn, 0);
			
	//writeDebug("MSG Packed");
	int32_t validity = (fcntl(fdToWrite, F_GETFL) != -1);
	if (validity) {
		//writeDebugExtraPlace("File descriptor is accessible",
					//fdToWrite);
		
	} else {
		writeErrorExtraPlace("File descriptor is not accessible\n", fdToWrite);
		return EXIT_FAILURE;
	}


	int32_t pthreadRet1;
	int32_t pthreadRet2;
	pthread_mutex_t writeLock = getMutexLock();
	pthreadRet1 = pthread_mutex_lock(&writeLock);

	int32_t success = tpl_dump(tn, TPL_FD, fdToWrite);
	tpl_free(tn);
	_deallocate_msg_only(msgStruct);
	//sleep(2);
	pthreadRet2 = pthread_mutex_unlock(&writeLock);
	
	if(pthreadRet1==EXIT_FAILURE){
		writeError("Thread locked unsuccessful msg");
	}else if(pthreadRet2==EXIT_FAILURE){
		writeError("Thread unlocked unsuccessful");
	}else{
		//writeDebug("thread locked and unlocked successful");
	}
	
	
	if (success == 0) {
		//writeDebugExtraPlace("msg written on file descriptor",
							 //fdToWrite);
	} else {
		writeErrorExtraPlace("msg FAILED to be written on file descriptor",
							 fdToWrite);
		//pthreadRet2 = pthread_mutex_unlock(&writeLock);
		return EXIT_FAILURE;
	}
	
	//tpl_free(tn);
	//_deallocate_msg_only(msgStruct);
	//pthreadRet2 = pthread_mutex_unlock(&writeLock);
	return EXIT_SUCCESS;	
}
