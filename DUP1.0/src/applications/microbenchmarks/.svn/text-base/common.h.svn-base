/*
 * common.h
 *
 *  Created on: Oct 8, 2009
 *      Author: liangxue
 */

#ifndef COMMON_H_
#define COMMON_H_

//This is the maximum data size we can do with sendto() using AF_UNIX_DGRAM
#define DGRAM_BUFF_SIZE 64*1024

// production runs: 10
#define NUM_ITER_PER_SAMPLE 10

#define MEMCPY_DESCR "memcpy"
#define TCP_LOOPBACK_DESCR "tcp_loopback"
#define SHARED_MEMORY_DESCR "shared_memory"
#define PIPE_DESCR "pipe"
#define MSQ_DESCR "message_queue"
#define AF_UNIX_STREAM_DESCR "unix_domain_socket_stream"
#define AF_UNIX_DGRAM_DESCR "unix_domain_socket_datagram"

#define STR_BIDIRECTION "bidirection"
#define STR_UNIDIRECTION "unidirection"
#define STR_MULTICORE "multicore"
#define STR_UNICORE "unicore"

typedef enum
{
	START_UP = 0,
	MAIN_BODY,
	CLEAN_UP,
	NOT_APPLICABLE
} MEASUREMENT_STATE;

struct DgramMeta
{
  unsigned int iter;
  size_t size;
};

extern int bidirectional;

#endif /* COMMON_H_ */
