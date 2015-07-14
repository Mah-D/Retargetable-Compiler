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
 * @file dupd/write_dupd_stream.cc
 * @brief representation a stream writing to another dupd
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "write_dupd_stream.h"
#include "dup_network.h"
#include "session.h"

DUPDWriteDupdStream::DUPDWriteDupdStream (DUPDFileDescriptor * fd, 
					  uint64_t s_id, 
					  uint32_t process_num,
					  uint32_t local_fd, 
					  uint32_t remote_fd, 
					  uint32_t r_proc_num):DUPDStream (fd,
									   sizeof
									   (DupdToDupdDataInfo))
{
  struct DupdToDupdDataInfo di;

  stream_id = s_id;
  process = process_num;
  fd_num = local_fd;
  di.magic = htonl (DUPD_READ_FROM_OTHER_DUPD_MAGIC);
  di.version1 = htonl (1);
  di.stream_id = stream_id;
  di.process_num = htonl (r_proc_num);
  di.local_fd = htonl (remote_fd);
  memcpy (buffer, &di, sizeof (struct DupdToDupdDataInfo));
  ready = 0;
}

void
DUPDWriteDupdStream::get_select_set (fd_set * rs,
                                     fd_set * ws,
                                     int &maxfd, struct timeval *tv)
{
  if (-1 == ready)
    return;
  update_timeout (tv);
  if (NULL == dupd_session)
    return;
  if (!fd->get_select_set (rs, ws, maxfd, 0))
    {
      tv->tv_sec = tv->tv_usec = 0;
      if (ready == 1)
        ready = 2;
    }
}

int
DUPDWriteDupdStream::run (fd_set * rs, fd_set * ws)
{
  int ret;
  int fret;

  DEBUG ("write dupd stream running");
  if (fd == NULL)
    return 0;                   // done!  
  if (test_timeout ())
    {
      if (dupd_session != NULL)
        dupd_session->notify_fatal_error (DUPD_EC_TRANSMISSION_TIMEOUT);
      DEBUG ("write data stream failed to get ready (timeout)!");
      ready = -1;
      return 0;
    }
  switch (ready)
    {
    case 0:
      ret = write_buffer (sizeof (DupdToDupdDataInfo));
      if (ret == -1)
        {
          dupd_session->notify_fatal_error (DUPD_EC_TRANSMISSION_ERROR);
          DEBUG ("write data stream failed to get ready (write error)!");
          ready = -1;
          return 0;
        }
      ready = 1;
      return 1;
    case 1:
      fret = fd->run (rs, ws);
      if (fret == -1)
        {
	  fprintf (stderr,
		   "Failed to establish D2D data stream (write error): %s\n",
		   strerror (errno));
	  /* FIXME: error signalling here is not sufficient */
          ready = -1;
          return 0;             /* fatal error */
        }
      return 1;
    case 2:
      DEBUG ("write data stream ready");
      fd->shut (SHUT_RD);
      if (dupd_session == NULL)
        {
          DEBUG ("write data stream failed, session died!");
          ready = -1;
          return 0;
        }
      do_attach (dupd_session);
      return 0;
    default:
      abort ();
    }
}

void
DUPDWriteDupdStream::do_attach (DUPDSession * s)
{
  DUPDProcess *p;

  p = s->get_process (process);
  if (p == NULL)
    THROW_FATAL ("Internal logic error");
  p->notify_ready (fd_num, 
		   stream_id,
		   fd);
  fd = NULL;
}
