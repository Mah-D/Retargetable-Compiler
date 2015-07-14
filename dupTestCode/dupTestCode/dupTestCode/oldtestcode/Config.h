#include "Message.h"
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#define FILE_DESCRIPTOR_DUP 4
#define FILE_DESCRIPTOR_DUP_WRITE 4
#define FILE_DESCRIPTOR_DUP_READ 4
#define OUTPUT_ERROR 1
int calculatePlaceToWriteTo(int placeToWriteTo);
pthread_mutex_t getMutexLock();
int DecodeMsg(int place, struct Msg* messageStruct);
int ProcessMsg(tpl_node **tn, int place, int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int WriteMsg(int place, int placeToWriteMsg, int msgType, unsigned long long sizeOfBlob, void * blob);
int ReadMsg(int place);
int dispatcher(int place, int totalPlaces, int fileDescriptor);

