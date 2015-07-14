
#include <pthread.h>
int calculatePlaceToWriteTo(int placeToWriteTo);
int calculatePlaceToReadTo(int myPlace);
pthread_mutex_t getMutexLock();
int DecodeMsg(struct Msg* messageStruct);
int ProcessMsg(tpl_node **tn, int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int WriteMsg(int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int ReadMsg(struct Msg* messageStruct);
int dispatcher();
