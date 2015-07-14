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
 * @file dupd/write_dup_stream.cc
 * @brief representation of session information stream
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "write_dup_stream.h"
#include "session.h"

DUPDWriteDupStream::DUPDWriteDupStream (DUPDFileDescriptor * fd):DUPDStream (fd,
            sizeof
            (DupToDupdDataInfo))
{
  memset (&di, 0, sizeof (struct DupToDupdDataInfo));
  ready = 0;
}

DUPDWriteDupStream::~DUPDWriteDupStream ()
{
  dupd_connection_wait_list.remove (this);
}

void
DUPDWriteDupStream::get_select_set (fd_set * rs,
                                    fd_set * ws,
                                    int &maxfd, struct timeval *tv)
{
  update_timeout (tv);
  if (ready)
    return;
  if (!fd->get_select_set (rs, ws, maxfd, 1))
    tv->tv_sec = tv->tv_usec = 0;
}

int
DUPDWriteDupStream::run (fd_set * rs, fd_set * ws)
{
  int ret;
  int fret;

  if (test_timeout () || (fd == NULL))
    return 0;
  if (ready)
    return 1;
  fret = fd->run (rs, ws);
  if (fret == 1)
    return 1;                   /* try to complete write first */
  if (fret == -1)
    return 0;                   /* fatal error */
  ret = read_buffer (sizeof (DupToDupdDataInfo) - sizeof (uint32_t));
  if (ret == 1)
    return 1;
  if (ret == -1)
    return 0;                   // incomplete input, simply kill
  ready = 1;
  fd->shut (SHUT_RD);
  memcpy (&di.version1, buffer,
          sizeof (DupToDupdDataInfo) - sizeof (uint32_t));
  if (NULL == dupd_session->get_process (ntohl (di.remote_pidx)))
    dupd_connection_wait_list.push_back (this);
  else
    do_attach (dupd_session);
  return 1;
}

void
DUPDWriteDupStream::do_attach (DUPDSession * s)
{
  DUPDProcess *p;

  if (!ready)
    THROW_FATAL ("Internal logic error");
  p = s->get_process (ntohl (di.remote_pidx));
  if (p == NULL)
    THROW_FATAL ("Internal logic error");
  p->notify_ready (ntohl (di.remote_fd), 
		   di.stream_id,
		   fd);
  fd = NULL;
}
