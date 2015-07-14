/*
 * processmsg.h
 *
 *  Created on: Dec 6, 2010
 *      Author: Oren Freiberg and Riyaz Haque
 */

#ifndef PROCESSMSG_H_
#define PROCESSMSG_H_
#include "config.h"
#include "tpl.h"
extern tpl_hook_t tpl_hook;
#include "../inc/errormsg.h"
int32_t ProcessMsg(place_t placeToWriteMsg, int32_t msgType, uint64_t  sizeOfBlob, void * blob);
int32_t init_process_msg();
#endif /* PROCESSMSG_H_ */
