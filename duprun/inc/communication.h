

#ifndef COMMUNICATION_H_
#define COMMUNICATION_H_
#include "config.h"
#include "place.h"
#include "message.h"
int32_t WriteMsg(place_t placeToWriteMsg, int32_t msgType, uint64_t sizeOfBlob, void * blob);
int32_t init_comm_channel();
int32_t ReadMsg(struct Msg* messageStruct, place_t _rec_from);
int32_t dispatcher();
void initconstants();
int32_t _init_config();
#endif
