/*
 * errormsg.h
 *
 *  Created on: Dec 6, 2010
 *      Author: Oren Freiberg and Riyaz Haque
 */

#ifndef ERRORMSG_H_
#define ERRORMSG_H_
#include "place.h"
#include "message.h"
#include "config.h"
void writeDebug(char * msg);
void writeDebugExtraPlace(char * msg, place_t pl);
void writeError(char * msg);
void writeErrorExtraPlace(char * msg, place_t pl);
void writeErrorMsg(struct Msg * msg);
void writeDebugMsg(struct Msg * msg);
#define OUTPUT_ERROR 1
#define OUTPUT_DEBUG 1
#endif /* ERRORMSG_H_ */
