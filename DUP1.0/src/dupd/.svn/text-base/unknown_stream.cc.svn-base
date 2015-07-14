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
 * @file dupd/unknown_stream.cc
 * @brief representation of a connection of unknown type
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "dup_network.h"
#include "unknown_stream.h"
#include "session_stream.h"
#include "read_dup_stream.h"
#include "write_dup_stream.h"
#include "read_dupd_stream.h"


DUPDUnknownStream::DUPDUnknownStream (DUPDFileDescriptor * fd):DUPDStream (fd,
            sizeof (uint32_t))
{
}

void
DUPDUnknownStream::get_select_set (fd_set * rs,
                                   fd_set * ws,
                                   int &maxfd, struct timeval *tv)
{
  if (fd == NULL)
    return;
  DEBUG ("Unknown stream waiting for input...");
  fd->get_select_set (rs, ws, maxfd, 1);
  update_timeout (tv);
}

int
DUPDUnknownStream::run (fd_set * rs, fd_set * ws)
{
  int fret;
  int ret;

  if (fd == NULL)
    return 0;
  fret = fd->run (rs, ws);
  if (fret == 1)
    return 1;                   /* try to complete write first */
  if (fret == -1)
    return 0;                   /* fatal error */
  ret = this->read_buffer (sizeof (uint32_t));
  if (ret == -1)
    return 0;                   // die
  if (test_timeout ())
    return 0;
  if (ret != 0)
    return 1;                   // keep reading more
  DEBUG ("Unknown stream got magic...");
  unsigned int magic = ntohl (*(unsigned int *) buffer);
  switch (magic)
    {
    case DUPD_WRITE_OUTPUT_TO_DUP_MAGIC:
      DEBUG ("Receiving dup output data stream info...");
      stream_list.push_back (new DUPDWriteDupStream (fd));
      break;
    case DUPD_READ_INPUT_FROM_DUP_MAGIC:
      DEBUG ("Receiving dup input data stream info...");
      stream_list.push_back (new DUPDReadDupStream (fd));
      break;
    case DUPD_READ_FROM_OTHER_DUPD_MAGIC:
      DEBUG ("Receiving dupd data stream info...");
      stream_list.push_back (new DUPDReadDupdStream (fd));
      break;
    default:
      fprintf (stderr, "Received unknown magic number %u\n", magic);
      return 0;
    }
  fd = NULL;
  return 0;                     // die
}
