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
 * @file dup/dup_data_connection.cc
 * @brief representation of a dataconnection to DUPD
 * @author Christian Grothoff
 */

#include "data_connection.h"
#include <sys/types.h>
#include <sys/socket.h>
#include <errno.h>
#include <string.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <unistd.h>
#include <fcntl.h>


DataConnection::DataConnection (Process * p, Edge * e):Connection ()
{
  struct DupToDupdDataInfo is;
  const char *hn = p->host_address;
  struct addrinfo *res;
  struct addrinfo hints;
  char ps[6];

#if PRINT_INFO
  fprintf (stderr, "Creating data connection\n");
#endif
  sprintf (ps, "%u", p->portnum);
  memset (&hints, 0, sizeof (hints));
  int ret = getaddrinfo (hn, ps, &hints, &res);
  if ((ret != 0) || (res == NULL))
    {
      fprintf (stderr,
               "Could not resolve `%s': %s\n", hn, gai_strerror (ret));
      throw "Resolution error";
    }
  s = socket (res->ai_family, SOCK_STREAM, 0);
  if (s == -1)
    {
      fprintf (stderr, "Could not open new socket: %s\n", strerror (errno));
      throw "Socket creation error";
    }
  if (s >= FD_SETSIZE)
    {
      fprintf (stderr, 
	       "File descriptor or equal to `%s' (%u), can not use it!\n",
	       "FD_SETSIZE",
	       s);
      close (s);
      throw "Socket creation error";
    }
  int flags = fcntl (s, F_GETFL);
  int nflags = flags | O_NONBLOCK;
  fcntl (s, F_SETFL, nflags);
  ret = connect (s, res->ai_addr, res->ai_addrlen);
  if ((ret == -1) && (errno != EINPROGRESS))
    {
      fprintf (stderr,
               "Could not connect to `%s:%u': %s\n", 
	       hn, p->portnum, strerror (errno));
      close (s);
      throw "Connect error";
    }

  /* restore mode! */
  fcntl (s, F_SETFL, flags);
  freeaddrinfo (res);
  hostname = strdup (hn);
  port = p->portnum;
  process = p;
  edge = e;
  info_bytes_sent = 0;
  if (edge->left->is_dup ())
    {
      is.magic = htonl (DUPD_READ_INPUT_FROM_DUP_MAGIC);
      is.remote_fd = htonl (edge->right->descriptor_number);
    }
  else
    {
      is.magic = htonl (DUPD_WRITE_OUTPUT_TO_DUP_MAGIC);
      is.remote_fd = htonl (edge->left->descriptor_number);
    }
  is.version1 = htonl (1);
  is.stream_id = e->stream_id;
  is.remote_pidx = htonl (process->get_index ());
  memcpy (info, &is, INFO_SIZE);
}

DataConnection::~DataConnection ()
{
  if (s != -1)
    close (s);
  free (hostname);
}

void
DataConnection::get_fd_set (int *maxfd, fd_set * readfds, fd_set * writefds)
{
  if (info_bytes_sent < INFO_SIZE)
    {
#if PRINT_INFO
      fprintf (stderr, "Adding data connection to select set\n");
#endif
      if (s > *maxfd)
        *maxfd = s;
      FD_SET (s, writefds);
    }
}

void
DataConnection::act_fd_set (fd_set * readfds, fd_set * writefds)
{
  if (s == -1)
    return;
  if ((FD_ISSET (s, writefds)) && (info_bytes_sent < INFO_SIZE))
    {
      ssize_t ret =
        write (s, &info[info_bytes_sent], INFO_SIZE - info_bytes_sent);
      if (ret == -1)
        {
          fprintf (stderr,
                   "Failed to write data connection info: %s\n",
                   strerror (errno));
          throw "Data connection write error";
        }
      info_bytes_sent += ret;
    }
}

/**
 * Are we ready? (for data connections, did we send
 * all we need to send? for data connections,
 * did our dupd report that it is ready?)
 */
int
DataConnection::is_ready ()
{
  if (info_bytes_sent < INFO_SIZE)
    return 1;
  return 0;                     /* finished */
}

/**
 * See paper.  FIXME: check return codes...
 */
static void
bond (int i, int o)
{
  struct rlimit rl;
  int fd;
  int flags;

  if (0 != fork ())
    {
      close (i);
      close (o);
      return;
    }
  if (0 != chdir ("/"))
    fprintf (stderr, "chdir failed: %s\n", strerror (errno));
  if (i != 0)
    close (0);
  if (o != 1)
    close (1);
  if (((i != 0) && (0 > dup2 (i, 0))) || ((o != 1) && (0 > dup2 (o, 1))))
    {
      fprintf (stderr, "dup2 failed: %s\n", strerror (errno));
      exit (1);
    }
  // close ALL file descriptors (other than 0, 1, 2)
  // (note: close on exec maybe unset for redirected IO!)
  if (0 != getrlimit (RLIMIT_NOFILE, &rl))
    {
      fprintf (stderr, "getrlimit failed: %s\n", strerror (errno));
      rl.rlim_cur = 1 << 16;    // "big enough"
    }
  for (fd = 3; fd < (int) rl.rlim_cur; fd++)
    {
      errno = 0;
      flags = fcntl (fd, F_GETFD);
      if ((flags == -1) && (errno == EBADF))
        continue;
      close (fd);
    }
  execlp ("buffer-dup", "buffer-dup", NULL);
  fprintf (stderr, "Failed to run `%s': %s\n", "cat", strerror (errno));
}

/**
 * Ready to rumble.  Fork cat (for data connections)
 * or start sending go (for data connections).
 *
 * @param fork_count increment by one for each child spawned
 */
void
DataConnection::go (unsigned int &fork_count)
{
  fork_count++;
  if (edge->left->is_dup ())
    {
      shutdown (s, SHUT_RD);
      bond (edge->left->descriptor_number, s);
      s = -1;
      edge->left->descriptor_number = -1;
    }
  else if (edge->right->is_dup ())
    {
      shutdown (s, SHUT_WR);
      bond (s, edge->right->descriptor_number);
      s = -1;
      edge->right->descriptor_number = -1;
    }
  else
    {
      throw
        "Internal assertion error: DataConnection created for non-DUP edge";
    }
}
