/*
 * decodemsg.h
 *
 *  Created on: Dec 6, 2010
 *      Author: Oren Freiberg and Riyaz Haque
 */

#ifndef DECODEMSG_H_
#define DECODEMSG_H_
#include "message.h"
#include "errormsg.h"
#include <fcntl.h>
int32_t DecodeMsg(struct Msg* messageStruct, place_t _rec_from);
#endif /* DECODEMSG_H_ */
