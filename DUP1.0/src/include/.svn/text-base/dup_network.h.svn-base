/*
     This file is part of DUP.
     (C) 2008, 2009 The DUP team

     DUP is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published
     by the Free Software Foundation; either version 2, or (at your
     option) any later version.

     DUP is distributed in the hope that it will be useful, but
     WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
     General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with DUP; see the file COPYING.  If not, write to the
     Free Software Foundation, Inc., 59 Temple Place - Suite 330,
     Boston, MA 02111-1307, USA.
*/

/**
 * @file include/dup_network.h
 * @brief structs defining the network protocol
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUP_NETWORK_H
#define DUP_NETWORK_H

#include <stdint.h>

/**
 * Default port for DUPD (placeholder)
 */
#define DUP_DEFAULT_PORTNUM 55555

/**
 * Timeout for connections in seconds.
 */
#define DUPD_FRESH_CONNECTION_TIMEOUT 120

// see protocol description
enum DUPD_IO_descriptor_flag
{
  DUPD_IO_FLAG_TRANSMIT_TO_DUPD = 0,
  DUPD_IO_FLAG_RECEIVE_FROM_DUPD = 1,
  DUPD_IO_FLAG_TRANSMIT_TO_DUP = 2,
  DUPD_IO_FLAG_RECEIVE_FROM_DUP = 3,
  DUPD_IO_FLAG_READ_FROM_FILE = 4,
  DUPD_IO_FLAG_WRITE_TO_FILE = 5,
  DUPD_IO_FLAG_APPEND_TO_FILE = 6,
  DUPD_IO_FLAG_USE_PIPE = 7
};

enum DUPD_ErrorCode
{
  DUPD_EC_SUCCESS = 0,
  DUPD_EC_OUT_OF_MEMORY = 1,
  DUPD_EC_OUT_OF_SOCKETS = 2,
  DUPD_EC_ACCESS_DENIED = 3,
  DUPD_EC_DNS_RESOLUTION_FAILURE = 4,
  DUPD_EC_PROTO_NOT_SUPPORTED = 5,
  DUPD_EC_TCP_CONNECT_FAILURE = 6,
  DUPD_EC_READ_OPEN_FAILURE = 7,
  DUPD_EC_WRITE_OPEN_FAILURE = 8,
  DUPD_EC_APPEND_OPEN_FAILURE = 9,
  DUPD_EC_TRANSMISSION_ERROR = 10,
  DUPD_EC_TRANSMISSION_TIMEOUT = 11,
  DUPD_EC_SESSION_TIMEOUT = 12,
  DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION = 13,
  DUPD_EC_DUPD_PROTOCOL_VIOLATION = 14,
  DUPD_EC_DUP_DATA_PROTOCOL_VIOLATION = 15,
  DUPD_EC_FAILED_TO_FORK = 16,
  DUPD_EC_DUPLICATE_SESSION_NUMBER = 17,
  DUPD_EC_UNSUPPORTED_VERSION = 18,
  DUPD_EC_EXEC_OPEN_FAILURE = 19,
  DUPD_EC_PORT_BIND_FAILURE = 20,
  DUPD_EC_INTERNAL_ERROR = 98,
  DUPD_EC_UNKNOWN_ERROR = 99,
  DUPD_EC_STILL_WAITING = -1
};


// Magic number for connection from DUP establishing new session
#define DUPD_NEW_SESSION_INFO_MAGIC     0xDDFF8600
// Magic number for connection from DUP for reading process output from dupd
#define DUPD_WRITE_OUTPUT_TO_DUP_MAGIC  0xEEFF8600
// Magic number for connection from DUP for writing process input to dupd
#define DUPD_READ_INPUT_FROM_DUP_MAGIC  0xFEFF8600
// Magic number for connection from another DUPD writing to this one
#define DUPD_READ_FROM_OTHER_DUPD_MAGIC 0xEFFF8600


/**
 * gcc-ism to get packed structs.
 */
#if __GNUC__
#define PACKED __attribute__((packed))
#else
#define PACKED
#endif

/**
 * Format of protocol messages from Dup to Dupd
 * for data streams.
 */
struct DupToDupdDataInfo
{
  uint32_t magic PACKED;
  uint32_t version1 PACKED;
  uint64_t stream_id PACKED;
  uint32_t remote_pidx PACKED;
  uint32_t remote_fd PACKED;
};

/**
 * Format of protocol messages from Dupd to Dupd
 * for data streams.
 */
struct DupdToDupdDataInfo
{
  uint32_t magic PACKED;
  uint32_t version1 PACKED;
  uint64_t stream_id PACKED;
  uint32_t process_num PACKED;
  uint32_t local_fd PACKED;
};

/**
 * Header transmitted for each session.
 */
struct DupToDupdControlInfo
{
  uint32_t magic PACKED;
  uint16_t version1 PACKED;
  uint16_t port PACKED;
  uint32_t proc_count PACKED;
};

/**
 * Response from dupd to dup (transmitted
 * twice for each session, once after port
 * binding and then again after connection
 * establishment).
 */
struct DupToDupdStatusInfo
{
  uint32_t status PACKED;
};

/**
 * Header transmitted for each process.
 */
struct DupToDupdProcessInfo
{
  uint32_t total_fds PACKED;
  uint32_t total_args PACKED;
};

/**
 * Header transmitted for each edge.
 */
struct DupToDupdEdgeInfo
{
  uint16_t flags PACKED;
  uint16_t remote_port PACKED;
  uint32_t local_fd PACKED;
  uint32_t remote_fd PACKED;
  uint32_t remote_pidx PACKED;
  uint64_t stream_id PACKED;
};


#undef PACKED

#endif
