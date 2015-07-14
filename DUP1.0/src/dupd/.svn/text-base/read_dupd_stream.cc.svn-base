/*
     This file is part of DUP.
     (C) 2008, 2009, 2010 The DUP team

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
 * @file dupd/read_dupd_stream.cc
 * @brief representation of session information stream
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "read_dupd_stream.h"
#include "session.h"

DUPDReadDupdStream::DUPDReadDupdStream (DUPDFileDescriptor * fd):DUPDStream (fd,
            sizeof (DupdToDupdDataInfo) -
            sizeof (uint32_t))
{
  memset (&di, 0, sizeof (struct DupdToDupdDataInfo));
  ready = 0;
  fd->shut (SHUT_WR);
}

DUPDReadDupdStream::~DUPDReadDupdStream ()
{
  DEBUG ("dup data read stream destructing!!!");
  dupd_connection_wait_list.remove (this);
}

void
DUPDReadDupdStream::get_select_set (fd_set * rs,
                                    fd_set * ws,
                                    int &maxfd, struct timeval *tv)
{
  update_timeout (tv);
  if (ready)
    return;
  DEBUG ("waiting for data from other dupd");
  if (!fd->get_select_set (rs, ws, maxfd, 1))
    tv->tv_sec = tv->tv_usec = 0;
}

int
DUPDReadDupdStream::run (fd_set * rs, fd_set * ws)
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
  ret = read_buffer (sizeof (DupdToDupdDataInfo) - sizeof (uint32_t));
  if (ret == 1)
    return 1;
  if (ret == -1)
    return 0;                   // incomplete input, simply kill
  ready = 1;
  DEBUG ("data stream ready");
  memcpy (&di.version1, buffer,
          sizeof (DupdToDupdDataInfo) - sizeof (uint32_t));
#if PRINT_INFO
  fprintf (stderr, "New read dupd stream\n");
#endif
  if ((dupd_session == NULL) || 
      (NULL == dupd_session->get_process (ntohl (di.process_num))))
    {
#if PRINT_INFO
      fprintf (stderr, "Storing stream in wait table\n");
#endif
      dupd_connection_wait_list.push_back (this);
    }
  else
    {
      DEBUG ("Attaching stream to existing session");
      do_attach (dupd_session);
    }
  return 1;
}


void
DUPDReadDupdStream::do_attach (DUPDSession * s)
{
  DUPDProcess *p;

  if (!ready)
    THROW_FATAL ("Internal logic error");
  p = s->get_process (ntohl (di.process_num));
  if (p == NULL)
    THROW_FATAL ("Internal logic error");
#if PRINT_INFO
  fprintf (stderr, "Notifying that input %d is ready\n", ntohl (di.local_fd));
#endif
  p->notify_ready (ntohl (di.local_fd), 
		   di.stream_id, fd);
  fd = NULL;
}
