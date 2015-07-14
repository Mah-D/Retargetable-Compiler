/*
 * common.h
 *
 *  Created on: Oct 8, 2009
 *      Author: liangxue
 */

#ifndef COMMON_H_
#define COMMON_H_

#define NUM_OF_CORES 16

//This is the maximum data size we can do with sendto() using AF_UNIX_DGRAM
#define DGRAM_BUFF_SIZE 64*1024

#define SMP_CONF "thread_core_mapping.conf"

// production runs: 10
#define NUM_ITER_PER_SAMPLE 10

#define MEMCPY_DESCR "memcpy"
#define TCP_LOOPBACK_DESCR "tcp_loopback"
#define SHARED_MEMORY_DESCR "shared_memory"
#define PIPE_DESCR "pipe"
#define MSQ_DESCR "message_queue"
#define AF_UNIX_STREAM_DESCR "unix_domain_socket_stream"
#define AF_UNIX_DGRAM_DESCR "unix_domain_socket_datagram"

#define SMP_TCP_LOOPBACK_DESCR "tcp_loopback_smp"
#define SMP_PIPE_DESCR "pipe_smp"
#define SMP_MSQ_DESCR "message_queue_smp"
#define SMP_AF_UNIX_STREAM_DESCR "unix_domain_socket_stream_smp"
#define SMP_AF_UNIX_DGRAM_DESCR "unix_domain_socket_datagram_smp"

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
extern int conf_num_of_thread_pairs;
extern int thread_client_on_core[NUM_OF_CORES];
extern int thread_server_on_core[NUM_OF_CORES];

#endif /* COMMON_H_ */
