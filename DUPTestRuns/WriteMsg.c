/*
 * WriteMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include "Config.h"
#include<stdio.h>
#include<stdlib.h>
#include "tpl.h"
int WriteMsg (char * ptr_msg, int place){

	fprintf(stderr, "%d:started writing msg\n",  FILE_DESCRIPTOR_DUP);
	tpl_node *tn;
	ProcessMsg(ptr_msg, tn, place);
	fprintf(stderr, "Dumping to file Descriptor %d\n", FILE_DESCRIPTOR_DUP);
	int success = tpl_dump(tn, TPL_FD, FILE_DESCRIPTOR_DUP);
	if(success == 0)
	{	fprintf(stderr, "msg dumped on file descriptor %d \n", FILE_DESCRIPTOR_DUP);
	}else{
		fprintf(stderr, "msg dumped on file descriptor %d FAILED\n", FILE_DESCRIPTOR_DUP);
	}
	tpl_free(tn);
	free(&ptr_msg);
	return EXIT_SUCCESS;
}
