

#ifndef COMMUNICATION_H_
#define COMMUNICATION_H_
#include "config.h"
#include "place.h"
#include "message.h"
int WriteMsg(place_t placeToWriteMsg, int msgType, uint64_t sizeOfBlob, void * blob);
int init_comm_channel();
int ReadMsg(struct Msg* messageStruct, place_t _rec_from);
int dispatcher();
#endif
