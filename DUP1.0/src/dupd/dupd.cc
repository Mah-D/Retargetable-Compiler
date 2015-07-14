/**
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
 * @file dupd/dupd.cc
 * @brief main function for dupd
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "globals.h"
#include "dup_network.h"
#include "listen_stream.h"
#include "file_descriptor.h"
#include "session_stream.h"
#include <signal.h>
#include <getopt.h>

/**
 * How long can zombies exist at most (in seconds)
 */
#define MAX_ZOMBIE_LIFETIME 5

/**
 * Connections awaiting session info 
 */
list <DUPDStream *>dupd_connection_wait_list;

/**
 * Session handle.
 */
DUPDSession *dupd_session;

/**
 * Map of hostnames to DNS lookup results.  Note that we
 * never call 'freeaddrinfo' at this point (the cache only
 * grows, no entry is ever expired).  This should be fine
 * except when DNS names change (in which case a very
 * long-running dupd may use stale IP addresses).
 */
map < const string, struct addrinfo *> dnscache;

/**
 * List of actors for select loop
 */
list < DUPDStream * >stream_list;

/**
 * flag set to 1 if the next select should run without timeout
 */
int instant_retry;

uint32_t num_procs;

/**
 * The listen socket / stream object for IPv4.
 */
DUPDListenStream *listen_stream4;

/**
 * The listen socket / stream object for IPv6.
 */
DUPDListenStream *listen_stream6;

/**
 * Port we will actually listen on.
 * Changed based on session information.
 */
static unsigned short port;

/**
 * Did we receive a shutdown signal (CTRL-C, etc.)?
 */
static int do_shutdown;


/**
 * Signal handler (for termination signals).
 */
static void
sigterm_handler (int signal)
{
  if (do_shutdown == 0)
    {
      do_shutdown = 1;
      /* pass signal to our entire process group! */
      kill (0, signal);
    }
}


/**
 * Install a signal handler that will cause us to shutdown nicely.
 */
static void
install_sigterm_handler ()
{
  struct sigaction sig;

  sig.sa_handler = &sigterm_handler;
  sigemptyset (&sig.sa_mask);
#ifdef SA_INTERRUPT
  sig.sa_flags = SA_INTERRUPT;  /* SunOS */
#else
  sig.sa_flags = SA_RESTART;
#endif
  if ((0 != sigaction (SIGTERM, &sig, NULL)) ||
      (0 != sigaction (SIGINT, &sig, NULL)) ||
      (0 != sigaction (SIGQUIT, &sig, NULL)) ||
      (0 != sigaction (SIGHUP, &sig, NULL)))
    fprintf (stderr,
             "Failed to install signal handler: %s\n", strerror (errno));
}


static int
read_all (int fd,
	  void *buf,
	  size_t len)
{
  char *cbuf = (char*) buf;
  size_t pos = 0;

  while (pos < len)
    {
      ssize_t ret = read(fd, &cbuf[pos], len - pos);
      if (ret <= 0)
	return 1;
      pos += ret;
    }
  return 0;
}


static int
write_all (int fd,
	   const void *buf,
	   size_t len)
{
  const char *cbuf = (const char*) buf;
  size_t pos = 0;

  while (pos < len)
    {
      ssize_t ret = write(fd, &cbuf[pos], len - pos);
      if (ret <= 0)
	return 1;
      pos += ret;
    }
  return 0;
}


static int
open_listen_socket4 (unsigned short port)
{
  const int on = 1;
  int s;
  struct sockaddr_in server_addr;

  s = socket (PF_INET, SOCK_STREAM, 0);
  if (s == -1)
    {
      fprintf (stderr,
               "Failed to open listen socket: %s\n", strerror (errno));
      THROW_FATAL ("Failed to create listen socket");
    }
  setsockopt (s, SOL_SOCKET, SO_REUSEADDR, &on, sizeof (on));
  memset (&server_addr, 0, sizeof (server_addr));
  server_addr.sin_family = AF_INET;
  server_addr.sin_port = htons (port);

  if (0 != bind (s, (struct sockaddr *) &server_addr, sizeof (server_addr)))
    {
#if 0
      fprintf (stderr,
               "Failed to bind to port %u: %s\n", port, strerror (errno));
#endif
      THROW_FATAL ("Failed to bind to port");
    }
  listen (s, 128);
  return s;
}

static int
open_listen_socket6 (unsigned short port)
{
  const int on = 1;
  int s;
  struct sockaddr_in6 server_addr;

  s = socket (PF_INET6, SOCK_STREAM, 0);
  if (s == -1)
    {
      THROW_FATAL ("Failed to create listen socket");
    }
  setsockopt (s, SOL_SOCKET, SO_REUSEADDR, &on, sizeof (on));
  setsockopt (s, IPPROTO_IPV6, IPV6_V6ONLY, &on, sizeof (on));
  memset (&server_addr, 0, sizeof (server_addr));
  server_addr.sin6_family = AF_INET6;
  server_addr.sin6_port = htons (port);

  if (0 != bind (s, (struct sockaddr *) &server_addr, sizeof (server_addr)))
    {
      THROW_FATAL ("Failed to bind to port");
    }
  listen (s, 128);
  return s;
}

static int
real_main (int argc, char **argv)
{
  fd_set readset;
  fd_set writeset;
  int maxfd;
  struct timeval tv;
  list < DUPDStream * >::iterator ii;
  struct DupToDupdControlInfo ci;
  int eno;
  uint32_t status;
  DUPDSessionStream *dss;
  int pstatus;
  uint32_t gomsg;

  install_sigterm_handler ();
  if (0 != read_all (0, &ci, sizeof(struct DupToDupdControlInfo)))
    {
      fprintf (stderr,
	       "Failed to read control information\n");
      return -1;
    }
  if (DUPD_NEW_SESSION_INFO_MAGIC != ntohl (ci.magic))
    {
      fprintf (stderr,
	       "Invalid magic number received\n");
      return -1;
    }
  if (1 != ntohs (ci.version1))
    {
      fprintf (stderr,
	       "Unsupported DUP protocol version %u\n",
	       ntohs (ci.version1));
      return -1;
    }
  port = ntohs (ci.port);  
  num_procs = ntohl (ci.proc_count);
  try
    {
      listen_stream6 = new DUPDListenStream (new
					     DUPDFileDescriptor
					     (open_listen_socket6 (port)));
    }
  catch (const char *err)
    {
      /* we'll try v4 before giving up... */
    }
  if (listen_stream6 != NULL)
    stream_list.push_front (listen_stream6);
  try
    {
      listen_stream4 = new DUPDListenStream (new
					     DUPDFileDescriptor
					     (open_listen_socket4 (port)));
    }
  catch (const char *err)
    {
      if (listen_stream6 == NULL)
	{
	  eno = errno;
	  status = htonl (DUPD_EC_PORT_BIND_FAILURE);
	  if (0 != write_all (1, &status, sizeof (uint32_t)))
	    {
	      fprintf (stderr,
		       "Failed to report port bind failure\n");
	      return 1;
	    }
	  printf ("Failed to create listen socket on port %u: %s\n",
		  port,
		  strerror (eno));
	  return 1;
	}
    }
  status = htonl (DUPD_EC_SUCCESS);
  if (0 != write_all (1, &status, sizeof (uint32_t)))
    {
      fprintf (stderr,
	       "Failed to report success\n");
      return 1;
    }
  if (listen_stream4 != NULL)
    stream_list.push_front (listen_stream4);
  dupd_session = new DUPDSession (num_procs);
  dss = new DUPDSessionStream (new DUPDFileDescriptor (0));
  stream_list.push_front (dss);
  while ( (!do_shutdown) &&
	  (dss->state <= SV_WAITING) )
    { 
      maxfd = 0;
      FD_ZERO (&readset);
      FD_ZERO (&writeset);
      tv.tv_sec = DUPD_FRESH_CONNECTION_TIMEOUT;
      tv.tv_usec = 0;
      ii = stream_list.begin ();
      while (ii != stream_list.end ())
        {
          (*ii)->get_select_set (&readset, &writeset, maxfd, &tv);
          ii++;
        }
      if (instant_retry)
        {
          instant_retry = 0;
          tv.tv_sec = 0;
          tv.tv_usec = 0;
        }
      if (-1 == select (maxfd + 1, &readset, &writeset, NULL, &tv))
        {
          if (errno == EINTR)
            continue;
          fprintf (stderr, 
		   "select failed: %s\n", 
		   strerror (errno));
          THROW_FATAL ("select failed");
        }
      ii = stream_list.begin ();
      while (ii != stream_list.end ())
        {
          DUPDStream *s = *ii;
          if (0 == s->run (&readset, &writeset))
            {
	      if (s != dss)
		{
		  ii = stream_list.erase (ii);
		  delete s;
		}
	      else
		ii++;
            }
          else
            ii++;
        }
    }
  ii = stream_list.begin ();
  while (ii != stream_list.end ())
    {
      DUPDStream *s = *ii;
      ii = stream_list.erase (ii);
      if (s != dss)
	delete s;
    }
  listen_stream4 = NULL;
  listen_stream6 = NULL;
  status = htonl (DUPD_EC_SUCCESS);
  if (0 != write_all (1, &status, sizeof (uint32_t)))
    {
      fprintf (stderr,
	       "Failed to report success\n");
      delete dss;
      return 1;
    }
  if (0 != read_all (0, &gomsg, sizeof(uint32_t)))
    {
      fprintf (stderr,
	       "Failed to read go information\n");
      delete dss;
      return 1;
    }
  if (ntohl (gomsg) != 0)
    {
      fprintf (stderr,
	       "Received abort instead of go\n");
      delete dss;
      return 1;
    }
  switch (dss->state)
    {
    case SV_SEND_READY:
      /* send ready, wait go, then run! */
      status = htonl (DUPD_EC_SUCCESS);
      if (0 != write_all (1, &status, sizeof (uint32_t)))
	{
	  fprintf (stderr,
		   "Failed to report success\n");
	  delete dss;
	  return 1;
	}
      status = dupd_session->start ();
      if (status != DUPD_EC_SUCCESS)
	{
	  /* kill all children now! */
	  kill (0, SIGHUP);
	  status = htonl (status);
	  if (0 != write_all (1, &status, sizeof (uint32_t)))
	    {
	      fprintf (stderr,
		       "Failed to report success\n");
	      return 1;
	    }      
	  printf ("%s", dupd_session->my_emsg);
	  delete dss;
	  return 1;
	}
      /* wait for children to die */
      while (num_procs > 0)
	{
	  if (-1 != waitpid (0, &pstatus, 0))
	    num_procs--;	  
	}
      status = htonl (status);
      if (0 != write_all (1, &status, sizeof (uint32_t)))
	{
	  fprintf (stderr,
		   "Failed to report success\n");
	  delete dss;
	  return 1;
	}            
      break;
    case SV_SEND_ABORT:
      status = htonl (dupd_session->err_code);
      if (0 != write_all (1, &status, sizeof (uint32_t)))
	{
	  fprintf (stderr,
		   "Failed to report success\n");
	  delete dss;
	  return 1;
	}      
      printf ("%s", dupd_session->my_emsg);
      delete dss;
      return 1;
    default:
      fprintf (stderr,
	       "Received shutdown signal, cleaning up\n");
      break;
    }
  delete dss;
  return 0;
}

static int
parse_options (int argc, char **argv)
{
  static struct option options[] = {
    {"help", 0, NULL, 'h'},
    {"version", 0, NULL, 'v'},
    {NULL, 0, NULL, 0}
  };
  int c;
  while (-1 != (c = getopt_long (argc, argv, "hv", options, NULL)))
    {
      switch (c)
        {
        case 'h':
          printf ("dupd [OPTIONS]\n"
                  "Starts the dupd daemon.\n"
                  "  -h, --help         print this help\n"
                  "  -v, --version      display current version\n"
                  "Report bugs to %s\n"
                  "DUP home page: http://dupsystem.org/\n",
                  PACKAGE_BUGREPORT);
          return -1;
        case 'v':
          printf ("dupd %s\n", PACKAGE_VERSION);
          return -1;
        }
    }
  return 0;
}


/**
 * Actual main function.
 */
int
main (int argc, char **argv)
{
  unsigned int infd;
  struct rlimit rl;
  int flags;

  getrlimit (RLIMIT_NOFILE, &rl);
  for (infd = 0; infd < rl.rlim_cur; infd++)
    {
      errno = 0;
      flags = fcntl (infd, F_GETFD);
      if ((flags == -1) && (errno == EBADF))
        continue;
      flags |= FD_CLOEXEC;
      fcntl (infd, F_SETFD, flags);
    }
  try
  {
    if (0 != parse_options (argc, argv))
      return 1;
    real_main (argc, argv);
  }
  catch (const char *ex)
  {
    fprintf (stderr, "dupd died with error: %s\n", ex);
    return 1;
  }
  for (map<const string, struct addrinfo*>::iterator it = dnscache.begin();
       it != dnscache.end(); it++)
    freeaddrinfo (it->second);    
  return 0;
}
