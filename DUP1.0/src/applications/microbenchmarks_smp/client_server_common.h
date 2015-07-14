/*
 * client_server_common.h
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */

#ifndef CLIENT_SERVER_COMMON_H_
#define CLIENT_SERVER_COMMON_H_
#include <stdint.h>

#define TCP_LOOPBACK_PORT_NUM 3490 // the port client will be connecting to

#define ACK_STRING "Finished!\0"

//note that these 2 string are of the same length
#define HELLO_STR "hello socket!\0"
#define OK_TO_CLOSE_SOCKET "close socket!\0"

#define SOCK_PATH "AF_UNIX_STREAM_SOCK"

#define MAX_BUFF_SIZE 8*1024*1024

typedef enum {
	HELLO_OR_TERMINATE = 0,
	RECEIVING_DATA_HEADER, //this is total number of bytes by client
	RECEIVING_DATA_BODY,
	ACKNOWLEDGE,
	TERMINATE_SESSION,
	ERROR_OCCURRED
} ServerStateEnums;

typedef struct
{
	unsigned int core_id;
	int run_on_core;
	int sock_fd;
} THREAD_DATA_STRUCT;

//this is the structure used for server thread,
//structure is designed here for cleanup purpose,
//cleanup handler needs to access those data
typedef struct
{
	unsigned int core_id;
	int connection_sock_fd;
	int run_on_core;
	char *buffer_to_be_freed;

} SERVER_THREAD_DATA_STRUCT;

int sendall(int s, char *buf, int len, int flag);
int recvall(int s, char *buf, int len, int flag);
int handle_single_client(int new_fd, char *data_buffer);
uint64_t transfer_data_to_socket(int sock_fd, char *sendall_buf,
		unsigned int blocksize, unsigned int iter);
#endif /* CLIENT_SERVER_COMMON_H_ */
