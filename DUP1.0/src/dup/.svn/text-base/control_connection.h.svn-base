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
 * @file dup/dup_control_connection.h
 * @brief representation of control a connection to DUPD
 * @author Christian Grothoff
 */

#ifndef DUP_CONTROL_CONNECTION_H
#define DUP_CONTROL_CONNECTION_H

#include "connection.h"
#include "process.h"
#include "dup_network.h"

using namespace std;

enum ControlState
  {
    CC_CS_HEADER,
    CC_CS_PORT_ACK,
    CC_CS_WAITING_PORT,
    CC_CS_PROCESSINFO,
    CC_CS_READY_ACK,
    CC_CS_WAITING_READY,
    CC_CS_GO,
    CC_CS_FIN,
    CC_CS_DONE
  };

/**
 * Size of the output-buffer that we use for each control connection.
 */
#define SEND_BUFFER_SIZE 65536

class ControlConnection:public Connection
{
public:

  /**
   * Create a control connection for the given
   * process (and possibly other processes to
   * be added later).
   */
  ControlConnection (Process * p);

  virtual ~ ControlConnection ();

  /**
   * Try to add the given process to this connection.
   * @return 1 if we succeeded; 0 if the process does
   *         not belong with the dupd this connection
   *         is used for.
   */
  int add_process (Process * p);


  /**
   * Pre-select data gathering.  This method only updates
   * maxfd; subtypes should override and only call the
   * parent method if this is desired.
   */
  virtual void get_fd_set (int *maxfd, fd_set * readfds, fd_set * writefds);

  /**
   * Post-select activity.
   */
  virtual void act_fd_set (fd_set * readfds, fd_set * writefds);

  /**
   * Are we ready? (for data connections, did we send
   * all we need to send? for control connections,
   * did our dupd report that it is ready?)
   */
  virtual int is_ready (void);

  /**
   * Ready to rumble.  Fork cat (for data connections)
   * or send go (for control connections).
   *
   * @param fork_count increment by one for each child spawned
   */
  virtual void go (unsigned int &fork_count);

  virtual void port_ready (void);

  /**
   * Transmit size bytes to our socket.
   *
   * @param data the data to transmit
   * @param size number of bytes in data
   * @return -1 on error, number of bytes copied to
   *            transmit buffer otherwise
   */
  ssize_t transmit (const void *data,
		    size_t size)
  {
    size_t min = SEND_BUFFER_SIZE - outbuf_end;
    if (SEND_BUFFER_SIZE < outbuf_end)
      {
	errno = (int) outbuf_wpos;
	return -1; /* previous transmission error */
      }
    if (size < min)
      min = size;
    memcpy (&outbuf[outbuf_end], data, min);
    outbuf_end += min;
    return min;
  }

  enum ControlState state;

protected:

  /**
   * Processes started by the dupd that we talk to.
   */
  vector < Process * >process_list;


private:

  /**
   * Process ID for SSH.
   */
  pid_t ssh_pid;
  
  /**
   * Stdout for SSH
   */
  int ssh_stdout;

  /**
   * Stdin for SSH
   */
  int ssh_stdin;

  uint16_t port;

  const char *hostname;

  /**
   * How many bytes of the session header have we sent?
   */
  size_t header_bytes_sent;

  /**
   * How many processes have we sent?
   */
  unsigned int processes_sent;

  static const unsigned int HEADER_SIZE =
    sizeof (struct DupToDupdControlInfo);

  /**
   * Header to transmit.
   */
  char header[HEADER_SIZE];

  /**
   * Size of the successful ready message.
   */
  static const size_t READY_SUCCESS_SIZE = sizeof (uint32_t);

  /**
   * How many bytes of "ready" have been received?
   */
  size_t ready_received;

  /**
   * How many bytes of "ready" do we expect to get?
   * (for now always equal to READY_SUCCESS_SIZE)
   */
  size_t ready_expect;

  /**
   * Buffer for reading the response.
   */
  char reply[READY_SUCCESS_SIZE];

  /**
   * Size of the "go" message.
   */
  static const size_t GO_SIZE = sizeof (uint32_t);

  /**
   * The go message.
   */
  char gomsg[GO_SIZE];

  /**
   * How may bytes of the go message have we sent?
   */
  size_t go_bytes_sent;

  /**
   * How many bytes of outbuf have already been sent?
   */
  size_t outbuf_wpos;

  /**
   * Current append-offset in outbuf.
   */
  size_t outbuf_end;

  /**
   * Buffer for our outgoing data.
   */
  char outbuf[SEND_BUFFER_SIZE];


  

};

#endif
