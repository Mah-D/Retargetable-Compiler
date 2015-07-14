/*
 * Message.C
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/message.h"
#include <stdlib.h>
int32_t _allocate_msg(struct Msg* msgStruct){
		return EXIT_SUCCESS;
}

int32_t _deallocate_msg(struct Msg* msgStruct){
	 free(msgStruct->tb.addr);
	 free(msgStruct);
	return EXIT_SUCCESS;
}
int32_t _deallocate_msg_only(struct Msg* msgStruct){
	free(msgStruct);
	return EXIT_SUCCESS;
}


