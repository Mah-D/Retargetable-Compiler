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
#include "../inc/errormsg.h"
int ProcessMsg(place_t placeToWriteMsg, int msgType, uint64_t  sizeOfBlob, void * blob);
int init_process_msg();
#endif /* PROCESSMSG_H_ */
