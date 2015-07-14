/*
     This file is part of DUP.
     (C) 2008, 2010 The DUP team

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
 * @file dup/dup_connection.h
 * @brief representation of a connection to DUPD
 * @author Christian Grothoff
 */

#ifndef DUP_CONNECTION_H
#define DUP_CONNECTION_H

#include "globals.h"
#include "edge.h"
#include <vector>
#include <iostream>
#include <sys/select.h>
#include <sys/time.h>
#include <sys/types.h>
#include <unistd.h>

using namespace std;

/**
 * Abstract base-class for our control and data connections.
 */
class Connection
{
public:

  /**
   * Create a connection to the given host and port.
   */
  Connection () {}

  /**
   * Close the socket.
   */
  virtual ~ Connection () {}

  /**
   * Pre-select data gathering.  This method only updates
   * maxfd; subtypes should override and only call the
   * parent method if this is desired.
   */
  virtual void get_fd_set (int *maxfd,
                           fd_set * readfds, fd_set * writefds) = 0;

  /**
   * Post-select activity.
   */
  virtual void act_fd_set (fd_set * readfds, fd_set * writefds) = 0;

  /**
   * Are we ready? (for data connections, did we send
   * all we need to send? for control connections,
   * did our dupd report that it is ready?)
   */
  virtual int is_ready (void) = 0;

  /**
   * Ready to rumble.  Fork cat (for data connections)
   * or send go (for control connections).
   *
   * @param fork_count increment by one for each child spawned
   */
  virtual void go (unsigned int &fork_count) = 0;

  /**
   * Ready to transmit full data (all dupd are now listening).
   */
  virtual void port_ready (void) {}
};

#endif
