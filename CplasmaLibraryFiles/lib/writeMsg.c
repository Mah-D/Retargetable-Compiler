/*
 * WriteMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "../inc/config.h"
pthread_mutex_t mp = PTHREAD_MUTEX_INITIALIZER;

// returns the mutex lock for writes
pthread_mutex_t getMutexLock() {
	return mp;
}


int WriteMsg(place_t placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob) {

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:started writing msg\n", _here());
	tpl_node* tn;
	ProcessMsg(&tn, placeToWriteMsg, msgType, sizeOfBlob, blob);
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Dumping to file Descriptor %d\n", _here(),
				placeToWriteMsg);

	int pthreadRet1;
	int pthreadRet2;
	pthread_mutex_t writeLock = getMutexLock();
	pthreadRet1 = pthread_mutex_lock(&writeLock);
	int success = tpl_dump(tn, TPL_FD, placeToWriteMsg);
	pthreadRet2 = pthread_mutex_unlock(&writeLock);

	if(pthreadRet1==EXIT_FAILURE){
		fprintf(stderr, "%d:Thread locked unsuccessful msg\n", _here());
	}else if(pthreadRet2==EXIT_FAILURE){
		fprintf(stderr, "%d:Thread unlocked unsuccessful\n", _here());
	}else{
		fprintf(stderr, "%d:thread locked and unlocked successful\n", _here());
	}

	if (OUTPUT_ERROR) {
		if (success == 0) {
			fprintf(stderr, "%d:msg read on file descriptor %d\n", _here(),
					placeToWriteMsg);
		} else {
			fprintf(stderr, "%d:msg read on file descriptor %d FAILED\n",
					_here(), placeToWriteMsg);
			return EXIT_FAILURE;
		}
	}
	tpl_free(tn);

	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}


