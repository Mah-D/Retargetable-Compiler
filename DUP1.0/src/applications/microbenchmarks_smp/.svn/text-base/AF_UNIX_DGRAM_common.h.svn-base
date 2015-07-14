/*
 * AF_UNIX_common.h
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 */

#ifndef AF_UNIX_COMMON_H_
#define AF_UNIX_COMMON_H_

#include <string.h>

typedef struct
{
	unsigned int core_id;
	int sock_fd;
	int run_on_core;
} THREAD_DATA_STRUCT;

typedef struct
{
	unsigned int core_id;
	int connection_sock_fd;
	int run_on_core;
	char *buffer_to_be_freed;

} SERVER_THREAD_DATA_STRUCT;

#define DGRAM_SOCKET_PATH     "my_af_unix_dgram_server"
#define DGRAM_SOCKET_PATHCLNT "my_af_unix_dgram_client"
#define ACK_STRING	"Finished!\0"

#define bzero(ptr, len)  memset((ptr), 0, (len))

#endif /* AF_UNIX_COMMON_H_ */
