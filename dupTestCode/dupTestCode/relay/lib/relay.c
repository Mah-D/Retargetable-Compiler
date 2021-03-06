#include "../inc/relay.h"
int main(void) {

		int max_places = _max_places();
        pthread_t streams[max_places];
        _init_relay();
        int i = 0;
        int pl = 0;
        for(i=0; i<max_places; i++){
				pl = i+10;
               pthread_create(&streams[i], NULL, _faninany_start, (void *)pl);
        }
        for(i=0; i<max_places; i++){
               pthread_join(&streams[i], NULL);
        }
}
int _init_relay(){
	int ret;
	//ret = pthread_mutex_init(&mp, NULL);
	if (ret == EXIT_FAILURE) {
		writeError("Creating pthread writing mutex failed");
	}
	return ret;
}
static pthread_mutex_t mp;
pthread_mutex_t getMutexLock() {
	return mp;
}

int _faninany_start(int _rec_from) {

	int exit = 1;
	while (exit) {
		struct Msg* msgStruct = (struct Msg*) malloc(sizeof(struct Msg));
		int fdToReadFrom = _rec_from;
		tpl_node * tn;
		tpl_bin tb;
		tn = tpl_map("S(iiU)B", msgStruct, &tb);
		writeDebug("MSG Mapped");
		int validity = (fcntl(fdToReadFrom, F_GETFL) != -1);
		if (validity) {
			writeDebugExtraPlace("File descriptor is accessible", fdToReadFrom);
		} else {
			writeErrorExtraPlace("File descriptor is not accessible",
					fdToReadFrom);
		}
		writeDebug("started trying to load msg");
		int success = tpl_load(tn, TPL_FD, fdToReadFrom);
		writeDebug("Finished loading");
		if (success == 0) {
			writeDebugExtraPlace("msg read on file descriptor", fdToReadFrom);
		} else {
			writeErrorExtraPlace("msg failed to read on file descriptor",
					fdToReadFrom);
			return EXIT_FAILURE;
		}
		int fdToWrite = 99;//_get_write_fd(_write_to);
		writeDebug("unpacking reading msg");
		int pthreadRet1;
		int pthreadRet2;
		pthread_mutex_t writeLock = getMutexLock();
		pthreadRet1 = pthread_mutex_lock(&writeLock);
		success = tpl_dump(tn, TPL_FD, fdToWrite);
		pthreadRet2 = pthread_mutex_unlock(&writeLock);
		if (pthreadRet1 == EXIT_FAILURE) {
			writeError("Thread locked unsuccessful msg");
		} else if (pthreadRet2 == EXIT_FAILURE) {
			writeError("Thread unlocked unsuccessful");
		} else {
			writeDebug("thread locked and unlocked successful");
		}
		writeDebug("tpl will be freed");
		tpl_free(tn);

		writeDebug("tpl freed");
		if (success == 0) {
					writeDebugExtraPlace("msg written on file descriptor", fdToReadFrom);
				} else {
					writeErrorExtraPlace("msg failed to read on file descriptor",
							fdToReadFrom);
					return EXIT_FAILURE;
		}
	}


}
