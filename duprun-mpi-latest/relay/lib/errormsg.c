/*
 * errormsg.c
 *
 *  Created on: Dec 6, 2010
 *      Author: Oren Freiberg and Riyaz Haque
 */
#include "../inc/errormsg.h"

void writeDebug(char * msg){
	if(OUTPUT_DEBUG){
	fprintf(stderr, "%d:%s\n", 	(_here()+100), msg);
	}
}
void writeDebugExtraPlace(char * msg, place_t pl){
	if(OUTPUT_DEBUG){
	fprintf(stderr, "%d:%s%d\n", 	(_here()+100), msg, pl);
	}
}

void writeError(char * msg){
	if(OUTPUT_ERROR){
	fprintf(stderr, "%d:%s\n", 	(_here()+100), msg);
	}
}

void writeErrorExtraPlace(char * msg, place_t pl){
	if(OUTPUT_ERROR){
	fprintf(stderr, "%d:%s%d\n", (_here()+100), msg, pl);
	}
}


void writeErrorMsg(struct Msg * msg){
	if(OUTPUT_ERROR){
		fprintf(stderr, "%d:My Type = %d my Msg = %s from place %d\n", _here(),
				msg->msgType, (char *) (msg->tb.addr),
				msg->placeFrom);

	}
}

//todo(char *) (msg->tb.addr)
void writeDebugMsg(struct Msg * msg){
	if(OUTPUT_DEBUG){
		fprintf(stderr, "%d:My Type = %d my Msg = %s from place %d\n", _here(),
				msg->msgType, (char *)msg->tb.addr ,
				msg->placeFrom);

	}
}
