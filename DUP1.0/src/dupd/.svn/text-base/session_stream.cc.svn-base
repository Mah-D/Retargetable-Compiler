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
 * @file dupd/session_stream.cc
 * @brief representation of session information stream
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "session_stream.h"
#include "dup_network.h"


DUPDSessionStream::DUPDSessionStream (DUPDFileDescriptor * fd):DUPDStream (fd,
									   65536)
{
  state = SV_PROCESS_HEADER;
  slen = 0;
  error_message = NULL;
  current_process = NULL;
  current_iod = NULL;
  fd->grow_read_buffer (65536);
}

DUPDSessionStream::~DUPDSessionStream ()
{
  if (current_process != NULL)
    delete current_process;
  if (current_iod != NULL)
    delete current_iod;
  if (error_message != NULL)
    free (error_message);
}


void
DUPDSessionStream::get_select_set (fd_set * rs,
                                   fd_set * ws,
                                   int &maxfd, struct timeval *tv)
{
  update_timeout (tv);
  switch (state)
    {
    case SV_PROCESS_HEADER:
    case SV_ARG_STRING_HEADER:
    case SV_ARG_STRING_DATA:
    case SV_IO_HEADER:
    case SV_IO_STRING_HEADER:
    case SV_IO_STRING_DATA:
      if (!fd->get_select_set (rs, ws, maxfd, 1))
        tv->tv_sec = tv->tv_usec = 0;
      break;
    case SV_SEND_READY:
    case SV_SEND_ABORT:
      break;
    case SV_WAITING:
      /* we don't "really" want to read, but we want to know
	 if/when dup closes the stream which would signal
	 us an abort; the only way to notice that is to
	 try if a read might "succeed" */
      fd->get_select_set (rs, ws, maxfd, 1);
      break;
    default:
      abort ();
    }
}


/**
 * Read the specified number of bytes into our buffer.
 * Abort session on read error (return 0), return to
 * select if not enough data is there (return 1).
 */
#define READ_HEADER(size) do {    \
    ret = read_buffer((size));	  \
    if (ret == -1) return 0;      \
    if (ret !=  0) return 1;      \
  } while (0)

int
DUPDSessionStream::run (fd_set * rs, fd_set * ws)
{
  int ret;
  int fret;
  struct DupToDupdProcessInfo *pi;
  struct DupToDupdEdgeInfo *ei;
  enum DUPD_ErrorCode ec;
  char *emsg;

  emsg = NULL;
  fret = fd->run (rs, ws);
  if (fret == 1)
    return 1;                   /* try to complete write first */
  if (fret == -1)
    return 0;                   /* fatal error */   
  if (test_timeout ())
    {
      if ((state == SV_SEND_ABORT) ||
          (state == SV_SEND_READY) )
        return 0;               // nothing can be done...
      signal_error (DUPD_EC_SESSION_TIMEOUT, "");
      return 1;
    }
  while (1)
    {
      switch (state)
        {
        case SV_PROCESS_HEADER:
          READ_HEADER (sizeof (struct DupToDupdProcessInfo));
          pi = (struct DupToDupdProcessInfo *) buffer;
          current_process = new DUPDProcess (ntohl (pi->total_fds),
                                             ntohl (pi->total_args));
          dupd_session->add_process (current_process);
          progress_process ();
          break;
        case SV_ARG_STRING_HEADER:
          READ_HEADER (sizeof (uint16_t));
          slen = ntohs (*(uint16_t *) buffer);
          state = SV_ARG_STRING_DATA;
          break;
        case SV_ARG_STRING_DATA:
          READ_HEADER (slen + 1);
          if (buffer[slen] != '\0')
            {
              signal_error (DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION,
                            "Expected 0-terminator in SV_ARG_STRING_DATA at %s:%d",
                            __FILE__, __LINE__);
              return 1;
            }
          current_process->add_argument (buffer);
          progress_process ();
          break;
        case SV_IO_HEADER:
          READ_HEADER (sizeof (struct DupToDupdEdgeInfo));
          ei = (struct DupToDupdEdgeInfo *) buffer;
          current_iod = new DUPDIODescriptor (ei->stream_id,
                                              dupd_session->
                                              get_current_process_number (),
                                              ntohs (ei->flags),
                                              ntohs (ei->remote_port),
                                              ntohl (ei->local_fd),
                                              ntohl (ei->remote_fd),
                                              ntohl (ei->remote_pidx));
          ec = current_process->add_iod (current_iod, &emsg);
          if (ec != DUPD_EC_SUCCESS)
            {
              signal_error (ec, "%s\n", emsg);
              free (emsg);
              return 1;
            }
          state = SV_IO_STRING_HEADER;
          break;
        case SV_IO_STRING_HEADER:
          READ_HEADER (sizeof (uint16_t));
          slen = ntohs (*(uint16_t *) buffer);
          state = SV_IO_STRING_DATA;
          break;
        case SV_IO_STRING_DATA:
          READ_HEADER (slen + 1);
          if (buffer[slen] != '\0')
            {
              signal_error (DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION,
                            "Expected 0-terminator in SV_IO_STRING_DATA at %s:%d",
                            __FILE__, __LINE__);
              return 1;
            }
          current_iod->add_argument (buffer);
          ec = current_iod->action (&emsg);
          if (ec != DUPD_EC_SUCCESS)
            {
              signal_error (ec, "%s\n", emsg);
              free (emsg);
              return 1;
            }
          current_iod = NULL;
          progress_process ();
          break;
        case SV_WAITING:
          DEBUG ("In waiting, checking for ready...");
          ec = dupd_session->is_ready (&emsg);
          if (ec == DUPD_EC_SUCCESS)
            state = SV_SEND_READY;
          else if (ec != DUPD_EC_STILL_WAITING)
            {
              signal_error (ec, "%s\n", emsg);
              free (emsg);
            }
          return 1;
        case SV_SEND_READY:
        case SV_SEND_ABORT:
	  /* break master select loop, close listen socket, etc. */
	  return 0;
        }
    }
  return 1;
}

#undef READ_HEADER


void
DUPDSessionStream::signal_error (enum DUPD_ErrorCode e, const char *fmt, ...)
{
  va_list va;
  int s;

  if (error_message != NULL)
    abort ();
  va_start (va, fmt);
  s = vsnprintf (NULL, 0, fmt, va);
  va_end (va);
  error_message = (char *) malloc (s + 1);
  va_start (va, fmt);
  s = vsprintf (error_message, fmt, va);
  va_end (va);
  ec = e;
  state = SV_SEND_ABORT;
  /* FIXME: this does not properly cause the error message to be signalled ! */
}

void
DUPDSessionStream::progress_process ()
{
  enum DUPD_ErrorCode e;
  char *emsg = NULL;

  if (!current_process->have_all_arguments ())
    {
      state = SV_ARG_STRING_HEADER;
      return;
    }
  if (!current_process->have_all_iods ())
    {
      state = SV_IO_HEADER;
      return;
    }
  current_process = NULL;
  if (!dupd_session->have_all_processes ())
    {
      state = SV_PROCESS_HEADER;
      return;
    }
  // session fully read, install in session table!
  DEBUG ("Session fully read!");

  // Check map for connections awaiting session info...
#if PRINT_INFO
  fprintf (stderr,
           "Consulting waiting connections\n");
#endif
  for (list <DUPDStream * >::iterator it = dupd_connection_wait_list.begin();
       it != dupd_connection_wait_list.end(); ++it)
    {
      DUPDStream *s = *it;
      DEBUG ("Attaching waiting connection");
      s->do_attach (dupd_session);
    }
  // Check if we go into wait state or just run...
  e = dupd_session->is_ready (&emsg);
  if (e == DUPD_EC_STILL_WAITING)
    {
      state = SV_WAITING;
      return;
    }
  if (e != DUPD_EC_SUCCESS)
    {
      signal_error (e, emsg);
      free (emsg);
      return;
    }
  state = SV_SEND_READY;
}
