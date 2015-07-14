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
 * @file dupd/write_dupd_stream.h
 * @brief representation of a stream writing to another dupd
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_WRITE_DUPD_STREAM_H
#define DUPD_WRITE_DUPD_STREAM_H

#include "base_stream.h"

class DUPDWriteDupdStream:public DUPDStream
{
public:
  DUPDWriteDupdStream (DUPDFileDescriptor * fd,
                       uint64_t stream_id,
                       uint32_t process_num,
                       uint32_t local_fd,
                       uint32_t remote_fd, uint32_t r_proc_num);

  virtual void get_select_set (fd_set * rs,
                               fd_set * ws, int &maxfd, struct timeval *t);

  virtual int run (fd_set * rs, fd_set * ws);

  virtual void do_attach (DUPDSession * s);

private:
  uint32_t process;
  uint64_t stream_id;
  uint32_t fd_num;

  /**
   * 0: we still have to call write_buffer to queue our header.
   * 1: the buffer still needs to be flushed to the network
   * 2: we are done, close FD for reading, pass FD to
   *    our process and remove this stream from the select queue
   * -1: fatal error
   */
  int ready;
};

#endif
