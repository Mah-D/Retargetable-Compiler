/*
 * Message.C
 *
 *  Created on: Oct 26, 2010
 *      Author: Oren Freiberg
 */
#include "../inc/message.h"
#include <stdlib.h>
#include "gc.h"
#include <sys/time.h>
int32_t _allocate_msg(struct Msg* msgStruct){
		return EXIT_SUCCESS;
}

int32_t _deallocate_msg(struct Msg* msgStruct){
	 //GC_FREE(msgStruct->tb.addr);
	 //GC_FREE(msgStruct);
	
	
	 free(msgStruct->tb.addr);
	 free(msgStruct);
	 return EXIT_SUCCESS;
}
int32_t  _deallocate_msg_only(struct Msg* msgStruct){
	//GC_FREE(msgStruct);
	free(msgStruct);
	return EXIT_SUCCESS;
}

/*uint64_t getMicroTime(){
		      uint64_t microsecs;
		       struct timeval tv;
		        gettimeofday(&tv, NULL);
		         microsecs = ((uint64_t)tv.tv_sec * 1000000);
			      microsecs += tv.tv_usec;
			       return microsecs;
}
*/
