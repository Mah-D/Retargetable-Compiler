#include <pthread.h>
#include "../inc/place.h"
pthread_mutex_t getMutexLock();
int DecodeMsg(struct Msg* messageStruct, place_t _rec_from);
int ProcessMsg(tpl_node **tn, int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int WriteMsg(place_t placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int ReadMsg(struct Msg* messageStruct, place_t _rec_from);
int dispatcher();

