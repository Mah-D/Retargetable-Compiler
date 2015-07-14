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
 * @file dupd/write_pipe_stream.cc
 * @brief representation of session information stream
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "write_pipe_stream.h"
#include "dup_network.h"
#include "session.h"

DUPDWritePipeStream::DUPDWritePipeStream (DUPDFileDescriptor * fd, int64_t s_id, int32_t remote_pidx, int32_t remote_fd):DUPDStream (fd,
            0)
{
  r_pidx = remote_pidx;
  r_fd = remote_fd;
  sid = s_id;
}

void
DUPDWritePipeStream::do_attach (DUPDSession * s)
{
  DUPDProcess *p;

  p = s->get_process (r_pidx);
  if (p == NULL)
    THROW_FATAL ("Internal logic error");
  p->notify_ready (r_fd, 0, fd);
  fd = NULL;
}
