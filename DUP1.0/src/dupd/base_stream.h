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
 * @file dupd/base_stream.h
 * @brief base class for all streams
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_BASE_STREAM_H
#define DUPD_BASE_STREAM_H

#include "globals.h"
#include "file_descriptor.h"

class DUPDStream
{
public:
  DUPDStream (DUPDFileDescriptor * fd, size_t max_buffer);

  virtual ~ DUPDStream ();

  /**
   * Update the arguments to select for this stream.
   */
  virtual void get_select_set (fd_set * rs,
                               fd_set * ws,
                               int &maxfd, struct timeval *t) = 0;

  /**
   * @return 0 if we are done with this stream
   *         (select loop can delete this object),
   *         non-zero means to keep us!
   */
  virtual int run (fd_set * rs, fd_set * ws) = 0;

  /**
   * Read "want" bytes from our socket into the buffer.
   * @return 0 if we are done reading, -1 on fatal errors, 1
   *         to go back to selecting
   */
  int read_buffer (size_t want);

  /**
   * Write "want" bytes from our buffer to the socket.
   * @return 0 if we are done writing, -1 on fatal errors
   */
  int write_buffer (size_t want);

  /**
   * If this is a stream waiting for a session,
   * this function will be called by the session
   * once it is ready to attach all of its
   * waiting streams.  The stream should then
   * give the respective session's process its
   * file descriptor.
   */
  virtual void do_attach (DUPDSession * s)
  {
    throw "Internal logic error";
  }

protected:

  /**
   * Update the timeout counter giving this
   * connection an additional s seconds of life.
   */
  void set_timeout (unsigned int s)
  {
    my_timeout = s + time (NULL);
  }

  /**
   * Test if this connection has timed out.
   * @return 0 if not, 1 if we have timed out
   */
  int test_timeout ();

  /**
   * Update the select timer based on our timeout.
   */
  void update_timeout (struct timeval *t);

  /**
   * Descriptor for this stream.
   */
  DUPDFileDescriptor *fd;

  /**
   * I/O buffer.
   */
  char *buffer;

private:
  /**
   * Position in the buffer for reading or writing.
   */
  size_t buffer_pos;

  /**
   * Amount of memory allocated for buffer
   * (only used for error checking).
   */
  size_t buffer_size;

  /**
   * Time when we currently should time out.
   */
  time_t my_timeout;
};

#endif
