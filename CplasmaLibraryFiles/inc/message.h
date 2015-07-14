#include "tpl.h"
enum {
	ASYNC, TERMINATE, ASYNC_ERR, ASYNC_ACK, READY
};
struct Msg;
typedef struct Msg{
	int placeFrom;
	int msgType;
	long unsigned size;
	tpl_bin tb; //set to null for writing out msgs
}Msg;
