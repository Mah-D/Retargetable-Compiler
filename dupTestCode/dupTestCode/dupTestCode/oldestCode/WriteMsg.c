/*
 * WriteMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "Config.h"

int WriteMsg(int place, int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob) {

	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:started writing msg\n", place);
	tpl_node* tn;
	ProcessMsg(&tn, place, placeToWriteMsg, msgType, sizeOfBlob, blob);
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Dumping to file Descriptor %d\n", place,
				placeToWriteMsg);

	int pthreadRet1;
	int pthreadRet2;
	pthread_mutex_t writeLock = getMutexLock();
	pthreadRet1 = pthread_mutex_lock(&writeLock);
	int success = tpl_dump(tn, TPL_FD, placeToWriteMsg);
	pthreadRet2 = pthread_mutex_unlock(&writeLock);

	if(pthreadRet1==EXIT_FAILURE){
		fprintf(stderr, "%d:Thread locked unsuccessful msg\n", place);
	}else if(pthreadRet2==EXIT_FAILURE){
		fprintf(stderr, "%d:Thread unlocked unsuccessful\n", place);
	}else{
		fprintf(stderr, "%d:thread locked and unlocked successful\n", place);
	}

	if (OUTPUT_ERROR) {
		if (success == 0) {
			fprintf(stderr, "%d:msg read on file descriptor %d\n", place,
					placeToWriteMsg);
		} else {
			fprintf(stderr, "%d:msg read on file descriptor %d FAILED\n",
					place, placeToWriteMsg);
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
