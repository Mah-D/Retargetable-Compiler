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
 * @file dupd/unknown_stream.h
 * @brief representation of a stream of unknown type
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_UNKNOWN_STREAM_H
#define DUPD_UNKNOWN_STREAM_H

#include "base_stream.h"

class DUPDUnknownStream:public DUPDStream
{
public:
  DUPDUnknownStream (DUPDFileDescriptor * fd);

  virtual void get_select_set (fd_set * rs,
                               fd_set * ws, int &maxfd, struct timeval *t);

  virtual int run (fd_set * rs, fd_set * ws);

};

#endif
