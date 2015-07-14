/*
 * DecodeMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include <stdio.h>
#include "Message.h"
struct MsgString DecodeMsg(int place){
	tpl_node * tn;
	char * msg;
	fprintf(stderr,"%d:Decoding MSG\n", place);
	tpl_map("s", &msg);
	fprintf(stderr,"%d:Message mapped\n", place);
	struct MsgString msgString = {msg, tn};
	return msgString;
}
