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
 * @file dupd/io_descriptor.cc
 * @brief representation of a io_descriptor
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "dup_network.h"
#include "io_descriptor.h"
#include "write_dupd_stream.h"
#include "read_pipe_stream.h"
#include "write_pipe_stream.h"
#include "arpa/inet.h"

/**
 * Mac doesn't define AI_NUMERICSERV
 */
#ifndef AI_NUMERICSERV
#define AI_NUMERICSERV 0
#endif



DUPDIODescriptor::DUPDIODescriptor (uint64_t stream_id,
                                    uint32_t local_proc_num,
                                    uint16_t flag,
                                    uint16_t port,
                                    uint32_t local_desc,
                                    uint32_t remote_desc,
                                    uint32_t remote_proc_num)
{
  iod_flag = flag;
  iod_port = port;
  iod_local_desc = local_desc;
  iod_remote_desc = remote_desc;
  iod_local_proc_num = local_proc_num;
  iod_remote_proc_num = remote_proc_num;
  iod_stream_id = stream_id;
  iod_string = NULL;
  fd = NULL;
  my_emsg = NULL;
  am_ready = DUPD_EC_STILL_WAITING;
#if 0
  fprintf (stderr,
	   "IOD: flag=%u local=%u/%u remote=%u/%u port=%u SID %llu\n",
	   (unsigned int) flag,
	   (unsigned int) local_proc_num,
	   (unsigned int) local_desc,
	   (unsigned int) remote_proc_num,
	   (unsigned int) remote_desc,
	   (unsigned int) port,
	   (unsigned long long) stream_id);
#endif
}

DUPDIODescriptor::~DUPDIODescriptor ()
{
  if (iod_string != NULL)
    free (iod_string);
  if (fd != NULL)
    delete fd;
  if (my_emsg != NULL)
    free (my_emsg);
}

void
DUPDIODescriptor::add_argument (const char *s)
{
  if (iod_string != NULL)
    THROW_FATAL ("Internal logic error");
  iod_string = strdup (s);
}

int
DUPDIODescriptor::notify_ready (uint64_t sid,
				DUPDFileDescriptor * f)
{
  if (fd != NULL)
    return 1;
  if (sid != iod_stream_id)
    {
      fprintf (stderr,
	       "Stream ID mismatch: got %llu, wanted %llu\n",
	       (unsigned long long) sid,
	       (unsigned long long) iod_stream_id);
      return 1;
    }
  switch (iod_flag)
    {
    case DUPD_IO_FLAG_TRANSMIT_TO_DUPD:
    case DUPD_IO_FLAG_RECEIVE_FROM_DUPD:
    case DUPD_IO_FLAG_TRANSMIT_TO_DUP:
    case DUPD_IO_FLAG_RECEIVE_FROM_DUP:
    case DUPD_IO_FLAG_USE_PIPE:
      fd = f;
      am_ready = DUPD_EC_SUCCESS;
      break;
    default:
      return 2;
    }
  return 0;
}


/**
 * Log an error message to stderr and also return it
 * as a string.
 */
static char *
dupd_error (const char *format, ...)
{
  int ret;
  char *s;
  va_list ap;

  va_start (ap, format);
  vfprintf (stderr, format, ap);
  va_end (ap);
  va_start (ap, format);
  ret = vsnprintf (NULL, 0, format, ap);
  va_end (ap);
  s = (char *) malloc (ret + 1);
  va_start (ap, format);
  vsprintf (s, format, ap);
  va_end (ap);
  return s;
}


/**
 * Create a connection to the specified hostname and port.
 * Note that the DNS lookup is blocking, which is not good
 * but the only thing we can do with standard APIs.
 */
static DUPDFileDescriptor *
create_connection (const char *hostname,
                   uint16_t port, enum DUPD_ErrorCode *ec, char **emsg)
{
  int ret;
  int s;
  int flags;
  struct addrinfo hint;
  struct addrinfo *res;
  struct addrinfo *rp;
  char pstr[6];
  string hn(hostname);
  char addrbuf[sizeof (struct sockaddr_in6)];
  struct sockaddr *sa;

  sprintf (pstr, "%u", port);
  memset (&hint, 0, sizeof (struct addrinfo));
  hint.ai_family = AF_UNSPEC;
  hint.ai_socktype = SOCK_STREAM;
  hint.ai_flags = AI_NUMERICSERV;

  res = dnscache[hn];
  if (NULL == res)
    {
      ret = getaddrinfo (hostname, pstr, &hint, &res);
      if (ret != 0)
	{
	  *emsg = dupd_error ("Failed to resolve hostname `%s': %s\n",
			      hostname, gai_strerror (ret));
	  *ec = DUPD_EC_DNS_RESOLUTION_FAILURE;
	  return NULL;
	}
      dnscache[hn] = res;
    }
  for (rp = res; rp != NULL; rp = rp->ai_next)
    {
      if (rp->ai_socktype != SOCK_STREAM)
        continue;
      s = socket (rp->ai_family, SOCK_STREAM, rp->ai_protocol);
      if (s == -1)
        {
          fprintf (stderr, "Failed to create socket: %s\n", strerror (errno));
          switch (errno)
            {
            case ENFILE:
            case EMFILE:
              *ec = DUPD_EC_OUT_OF_SOCKETS;
              break;
            case ENOBUFS:
            case ENOMEM:
              *ec = DUPD_EC_OUT_OF_MEMORY;
              break;
            case EACCES:
              *ec = DUPD_EC_ACCESS_DENIED;
              break;
            case EAFNOSUPPORT:
            case EPROTONOSUPPORT:
              *ec = DUPD_EC_PROTO_NOT_SUPPORTED;
              break;
            default:
              *ec = DUPD_EC_UNKNOWN_ERROR;
              break;
            }
          continue;
        }
      flags = fcntl (s, F_GETFL);
      flags |= O_NONBLOCK;
      fcntl (s, F_SETFL, flags);
      memcpy (addrbuf, rp->ai_addr, rp->ai_addrlen);
      sa = (struct sockaddr*) addrbuf;
      switch (rp->ai_family)
	{
	case AF_INET:			  
	  ((struct sockaddr_in*) sa)->sin_port = htons (port);
	  break;
	case AF_INET6:				
	  ((struct sockaddr_in6*) sa)->sin6_port = htons (port);
	  break;
	default:
	  abort ();
	  break;
	}
      ret = connect (s, sa, rp->ai_addrlen);

      if ((ret == 0) || ((ret == -1) && (errno == EINPROGRESS)))
        {
          flags &= ~O_NONBLOCK;
          fcntl (s, F_SETFL, flags);
          return new DUPDFileDescriptor (s);
        }
      *emsg = dupd_error ("Failed to connect: %s\n", strerror (errno));
      *ec = DUPD_EC_TCP_CONNECT_FAILURE;
      close (s);
    }
  return NULL;
}

enum DUPD_ErrorCode
DUPDIODescriptor::action (char **emsg)
{
  int n;
  DUPDFileDescriptor *f;
  int p[2];
  enum DUPD_ErrorCode ret;
  DUPDReadPipeStream *rps;
  DUPDWritePipeStream *wps;

  switch (iod_flag)
    {
    case DUPD_IO_FLAG_TRANSMIT_TO_DUPD:
      f = create_connection (iod_string, iod_port, &ret, emsg);
      if (f == NULL)
        return ret;
      DEBUG ("Creating dupd write stream");
      stream_list.push_back (new DUPDWriteDupdStream (f,
                                                      iod_stream_id,
                                                      iod_local_proc_num,
                                                      iod_local_desc,
                                                      iod_remote_desc,
                                                      iod_remote_proc_num));
      break;
    case DUPD_IO_FLAG_RECEIVE_FROM_DUPD:
    case DUPD_IO_FLAG_TRANSMIT_TO_DUP:
    case DUPD_IO_FLAG_RECEIVE_FROM_DUP:
      // nothing here...
      break;
    case DUPD_IO_FLAG_READ_FROM_FILE:
      n = open (iod_string, O_RDONLY);
      if (n == -1)
        {
          my_emsg = dupd_error ("Failed to open file `%s': %s\n",
                                iod_string, strerror (errno));
          *emsg = strdup (my_emsg);
          am_ready = DUPD_EC_READ_OPEN_FAILURE;
          return DUPD_EC_READ_OPEN_FAILURE;
        }
#if PRINT_INFO
      fprintf (stderr, "Opened `%s' as %d\n", iod_string, n);
#endif
      fd = new DUPDFileDescriptor (n);
      am_ready = DUPD_EC_SUCCESS;
      break;
    case DUPD_IO_FLAG_WRITE_TO_FILE:
      n = open (iod_string, O_WRONLY | O_CREAT | O_TRUNC, S_IRUSR | S_IWUSR);
      if (n == -1)
        {
          *emsg = dupd_error ("Failed to open file `%s': %s\n",
                              iod_string, strerror (errno));
          am_ready = DUPD_EC_WRITE_OPEN_FAILURE;
          return DUPD_EC_WRITE_OPEN_FAILURE;
        }
#if PRINT_INFO
      fprintf (stderr, "Opened `%s' as %d\n", iod_string, n);
#endif
      fd = new DUPDFileDescriptor (n);
      am_ready = DUPD_EC_SUCCESS;
      break;
    case DUPD_IO_FLAG_APPEND_TO_FILE:
      n = open (iod_string, O_WRONLY | O_CREAT | O_APPEND, S_IRUSR | S_IWUSR);
      if (n == -1)
        {
          my_emsg = dupd_error ("Failed to open file `%s': %s\n",
                                iod_string, strerror (errno));
          *emsg = strdup (my_emsg);
          am_ready = DUPD_EC_APPEND_OPEN_FAILURE;
          return DUPD_EC_APPEND_OPEN_FAILURE;
        }
#if PRINT_INFO
      fprintf (stderr, "Opened `%s' as %d\n", iod_string, n);
#endif
      fd = new DUPDFileDescriptor (n);
      am_ready = DUPD_EC_SUCCESS;
      break;
    case DUPD_IO_FLAG_USE_PIPE:
      if (iod_port == 0)
        break;                  // we are receiving (and hence not initiating)...
      n = pipe (p);
      if (n != 0)
        {
          my_emsg =
            dupd_error ("Failed to create pipe: %s\n", strerror (errno));
          *emsg = strdup (my_emsg);
          am_ready = DUPD_EC_OUT_OF_SOCKETS;
          return DUPD_EC_OUT_OF_SOCKETS;
        }
#if PRINT_INFO
      fprintf (stderr,
               "Created pipe [%d,%d] between PID %u:%u (writing) and PID %u:%u (reading)\n",
               p[0],
               p[1],
               iod_local_proc_num,
               iod_local_desc, iod_remote_proc_num, iod_remote_desc);
#endif
      rps = new DUPDReadPipeStream (new
                                    DUPDFileDescriptor
                                    (p
                                     [0]), iod_stream_id,
                                    iod_remote_proc_num, iod_remote_desc);
      stream_list.push_back (rps);
      dupd_connection_wait_list.push_back (rps);
      wps = new DUPDWritePipeStream (new
                                     DUPDFileDescriptor
                                     (p
                                      [1]), iod_stream_id,
                                     iod_local_proc_num, iod_local_desc);
      stream_list.push_back (wps);
      dupd_connection_wait_list.push_back (wps);
      break;
    default:
      my_emsg = dupd_error ("Invalid value for IO type %u\n", iod_flag);
      *emsg = strdup (my_emsg);
      am_ready = DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION;
      return DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION;
    }
  return DUPD_EC_SUCCESS;
}
