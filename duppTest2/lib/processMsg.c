/*
 * ProcessMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "../inc/processmsg.h"
#include <pthread.h>
#include <fcntl.h>
static pthread_mutex_t mp;
int init_process_msg(){
	int ret;
	ret = pthread_mutex_init(&mp, NULL);
	if (ret == EXIT_FAILURE) {
		writeError("Creating pthread writing mutex failed");
	}
	return ret;		
}
pthread_mutex_t getMutexLock() {
	return mp;
}
int ProcessMsg(place_t placeToWriteMsg, int msgType, uint64_t sizeOfBlob, void * blob) {
	writeDebug("Processing MSG");
    tpl_node* tn;
	tpl_bin tb;
	int fdToWrite = _get_write_fd(placeToWriteMsg);
	int numberHere = (int)_here();
	struct MsgRead* msgStruct =  (struct MsgRead*)malloc(sizeof(struct MsgRead));
	msgStruct->placeFrom = numberHere;
    msgStruct->msgType = msgType; 
	msgStruct->size = sizeOfBlob;

	tn = tpl_map("S(iiU)B", msgStruct, &tb );
	tb.sz = sizeOfBlob;
	tb.addr = blob;
	fprintf(stderr, "BAD blob %s TO CONFIG\n", (char *)blob);
	writeDebugExtraPlace("MSG Mapped", tb.sz);
	tpl_pack(tn, 0);
			
	writeDebug("MSG Packed");
	int validity = (fcntl(fdToWrite, F_GETFL) != -1);
	if (validity) {
		writeDebugExtraPlace("File descriptor is accessible\n",
					fdToWrite);
		
	} else {
		writeErrorExtraPlace("File descriptor is not accessible\n", fdToWrite);
		return EXIT_FAILURE;
	}
	int pthreadRet1;
	int pthreadRet2;
	pthread_mutex_t writeLock = getMutexLock();
	pthreadRet1 = pthread_mutex_lock(&writeLock);
	int success = tpl_dump(tn, TPL_FD, fdToWrite);
	pthreadRet2 = pthread_mutex_unlock(&writeLock);
	
	if(pthreadRet1==EXIT_FAILURE){
		writeError("Thread locked unsuccessful msg");
	}else if(pthreadRet2==EXIT_FAILURE){
		writeError("Thread unlocked unsuccessful");
	}else{
		writeDebug("thread locked and unlocked successful");
	}
	
	
	if (success == 0) {
		writeDebugExtraPlace("msg written on file descriptor",
							 fdToWrite);
	} else {
		writeErrorExtraPlace("msg FAILED to be written on file descriptor",
							 fdToWrite);
		return EXIT_FAILURE;
	}
	
	tpl_free(tn);
	//todo figure out late _deallocate_msg(msgStruct);
	return EXIT_SUCCESS;	
}

