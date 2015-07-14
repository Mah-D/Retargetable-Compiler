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
 * @file dupd/base_stream.cc
 * @brief base class for all streams
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "dup_network.h"
#include "base_stream.h"

DUPDStream::DUPDStream (DUPDFileDescriptor * fd, size_t mb)
{
  this->fd = fd;
  this->buffer = mb > 0 ? (char *) malloc (mb) : NULL;
  this->buffer_pos = 0;
  this->buffer_size = mb;
  this->my_timeout = 0;
  set_timeout (DUPD_FRESH_CONNECTION_TIMEOUT);
}

DUPDStream::~DUPDStream ()
{
  if (this->fd != NULL)
    delete this->fd;
  if (this->buffer != NULL)
    free (this->buffer);
}

int
DUPDStream::read_buffer (size_t want)
{
  if (want > buffer_size)
    THROW_FATAL ("Cannot read more than initial buffer size");
  if (want == buffer_pos)
    {
      buffer_pos = 0;
      return 0;                 // already done
    }
  ssize_t ret = fd->receive (&buffer[buffer_pos],
                             want - buffer_pos);
  if (ret == -1)
    return -1;
  buffer_pos += ret;
  if (buffer_pos < want)
    return 1;                   // need more
  buffer_pos = 0;
  return 0;                     // done!
}


int
DUPDStream::write_buffer (size_t want)
{
  if (want > buffer_size)
    THROW_FATAL ("Cannot write more than initial buffer size");
  if (want == buffer_pos)
    {
      buffer_pos = 0;
      return 0;                 // already done
    }
  ssize_t ret = fd->transmit (&buffer[buffer_pos],
                              want - buffer_pos);
  if (ret < 0)
    return -1;
  buffer_pos += ret;
  if (buffer_pos < want)
    return 1;                   // need more
  buffer_pos = 0;
  return 0;                     // done!
}


int
DUPDStream::test_timeout ()
{
  time_t n = time (NULL);
  return n >= my_timeout;
}

void
DUPDStream::update_timeout (struct timeval *t)
{
  time_t n = time (NULL);
  if (n > my_timeout)
    {
      t->tv_sec = 0;
      t->tv_usec = 0;
    }
  else if (my_timeout - n < t->tv_sec)
    {
      t->tv_sec = my_timeout - n;
      t->tv_usec = 0;
    }
}
