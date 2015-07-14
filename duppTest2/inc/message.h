#include "tpl.h"
#ifndef MESSAGE_H_
#define MESSAGE_H_

#define size_t unsigned long long
enum {
	ASYNC, TERMINATE, ASYNC_ERR, ASYNC_ACK, READY
};
struct Msg;
typedef struct Msg{
	int placeFrom;
	int msgType;
	uint64_t size;
	tpl_bin tb; //set to null for writing out msgs
}Msg;

struct MsgRead;
typedef struct MsgRead{
	int placeFrom;
	int msgType;
	uint64_t size;
	tpl_bin* tb; //set to null for writing out msgs
}MsgRead;
int _deallocate_msg(struct Msg* msgStruct);
int _allocate_msg(struct Msg* msgStruct);
#endif
