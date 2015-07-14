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
 * @file dupd/session_stream.h
 * @brief representation of a stream of session type
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_SESSION_STREAM_H
#define DUPD_SESSION_STREAM_H

#include "base_stream.h"
#include "session.h"
#include "process.h"
#include "io_descriptor.h"
#include "dup_network.h"

/**
 * Type for the states of the session stream.
 */
enum DUPD_state_value
{
  SV_PROCESS_HEADER,
  SV_ARG_STRING_HEADER,
  SV_ARG_STRING_DATA,
  SV_IO_HEADER,
  SV_IO_STRING_HEADER,
  SV_IO_STRING_DATA,
  SV_WAITING,
  SV_SEND_READY,
  SV_SEND_ABORT
};


/**
 * Class representing a TCP connection on which
 * we are receiving session information (and
 * ready/go signalling).
 */
class DUPDSessionStream:public DUPDStream
{
public:
  DUPDSessionStream (DUPDFileDescriptor * fd);

  ~DUPDSessionStream ();

  virtual void get_select_set (fd_set * rs,
                               fd_set * ws, int &maxfd, struct timeval *t);

  virtual int run (fd_set * rs, fd_set * ws);

  using DUPDStream::do_attach;

  /**
   * FSM for this session stream.
   */
  enum DUPD_state_value state;

  /**
   * Error message to be transmitted (NULL if no error).
   */
  char *error_message;

  /**
   * Error code (if any).
   */
  enum DUPD_ErrorCode ec;

private:

  /**
   * Process object currently under construction.
   */
  DUPDProcess *current_process;

  /**
   * IO descriptor object currently under construction.
   */
  DUPDIODescriptor *current_iod;

  /**
   * Length of the current string.
   */
  unsigned short slen;

  /**
   * Create a string of length "slen".
   * @return NULL on error
   */
  char *create_string ();

  /**
   * Check how far we are in processing the
   * current process and update our state
   * accordingly.
   */
  void progress_process ();

  /**
   * Change state to signal the specified error to DUPD.
   */
  void signal_error (enum DUPD_ErrorCode ec, const char *fmt, ...);

};

#endif
