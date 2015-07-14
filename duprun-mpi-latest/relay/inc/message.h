#include "tpl.h"
#ifndef MESSAGE_H_
#define MESSAGE_H_

#define size_t unsigned long long
enum {
	ASYNC, TERMINATE, ASYNC_ERR, ASYNC_ACK, READY
};
struct Msg;
typedef struct Msg{
	int32_t placeFrom;
	int32_t placeTo;
	int32_t msgType;
	uint64_t size;
//	uint64_t time;
	tpl_bin tb; //set to null for writing out msgs
}Msg;

/*struct MsgRead;
typedef struct MsgRead{
	int32_t placeFrom;
	int32_t msgType;
	int32_t placeTo;
	uint64_t size;
	tpl_bin* tb; //set to null for writing out msgs
}MsgRead;*/
int32_t _deallocate_msg(struct Msg* msgStruct);
int32_t _deallocate_msg_only(struct Msg* msgStruct);
int32_t _allocate_msg(struct Msg* msgStruct);
#endif
