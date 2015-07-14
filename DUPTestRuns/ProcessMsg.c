/*
 * ProcessMsg.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */

#include<stdio.h>
#include "tpl.h"
#include<stdlib.h>
tpl_node* ProcessMsg(char *msg, tpl_node *tn)
{
	 fprintf(stderr,"Processing MSG\n");
	 tn = tpl_map("s", &msg);
	 fprintf(stderr,"MSG Mapped\n");
	 tpl_pack(tn,0);
	 fprintf(stderr,"MSG Packed\n");
	 return tn;
}
