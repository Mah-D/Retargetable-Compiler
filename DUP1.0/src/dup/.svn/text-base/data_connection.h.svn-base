/*
     This file is part of DUP.
     (C) 2008 The DUP team

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
 * @file dup/dup_data_connection.h
 * @brief representation of control a connection to DUPD
 * @author Christian Grothoff
 */

#ifndef DUP_DATA_CONNECTION_H
#define DUP_DATA_CONNECTION_H

#include "connection.h"
#include "process.h"
#include "edge.h"
#include "dup_network.h"

using namespace std;

class DataConnection:public Connection
{
public:

  /**
   * Create a control connection for the given
   * process (and possibly other processes to
   * be added later).
   */
  DataConnection (Process * p, Edge * e);

  virtual ~ DataConnection ();

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

protected:

  /**
   * Socket.
   */
  int s;

  /**
   * Hostname we're talking to.
   */
  char *hostname;

  /**
   * Port we're talking to (multiple dupds maybe on the
   * same host, especially for testing...).
   */
  uint16_t port;

private:

  /**
   * Process info.
   */
    Process * process;

  /**
   * What edge is this for?
   */
  Edge *edge;

  /**
   * How many bytes have we sent?
   */
  size_t info_bytes_sent;

  /**
   * How many bytes do we have to send? FIXME: get right number!
   */
  static const size_t INFO_SIZE = sizeof (DupToDupdDataInfo);

  /**
   * What are we sending?
   */
  char info[INFO_SIZE];

};

#endif
