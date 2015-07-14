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
 * @file dup/dup_control_connection.cc
 * @brief representation of a controlconnection to DUPD
 * @author Christian Grothoff
 */

#include "control_connection.h"
#include <sys/types.h>
#include <sys/socket.h>
#include <string.h>
#include <arpa/inet.h>
#include <errno.h>



ControlConnection::ControlConnection (Process * p):Connection ()
{
  uint32_t gi;
  const char *hn = p->host_address;
  const char *cmd;
  int inpipe[2];
  int outpipe[2];

  state = CC_CS_HEADER;
  process_list.push_back (p);
  p->set_index (process_list.size ());
  ready_expect = READY_SUCCESS_SIZE;
  gi = htonl (0);
  memcpy (gomsg, &gi, sizeof (gi));
  memset (reply, 0, sizeof (reply));
  ready_received = 0;
  memset (header, 0, sizeof (header));
  go_bytes_sent = 0;
  processes_sent = 0;
  header_bytes_sent = 0;
  outbuf_wpos = 0;
  outbuf_end = 0;
  port = p->portnum;
  hostname = hn;
  data_ready++;
  if ((0 != pipe (inpipe)) ||
      (0 != pipe (outpipe)) )
    {
      fprintf (stderr, "pipe failed: %s\n", strerror (errno));
      throw "pipe error";
    }
  ssh_pid = fork ();
  if (ssh_pid == -1)
    {
      fprintf (stderr, "fork failed: %s\n", strerror (errno));
      throw "fork error";
    }
  if (ssh_pid == 0)
    {
      const char * argv[16];
      int argnum;
      close (inpipe[1]);
      close (0);
      dup2 (inpipe[0], 0);
      close (inpipe[0]);
      close (outpipe[0]);
      close (1);
      dup2 (outpipe[1], 1);
      close (outpipe[1]);
      argnum = 0;
      if (0 != strcmp ("localhost",
		       hn))
	{
	  cmd = "ssh";
	  argv[argnum++] = "ssh";
	  argv[argnum++] = "-q"; /* quiet */
	  argv[argnum++] = "-T"; /* no pty */
	  argv[argnum++] = "-x"; /* no X forwarding */
	  if (NULL != getenv ("DUP_SSH_PORT"))
	    {
	      argv[argnum++] = "-p";
	      argv[argnum++] = getenv ("DUP_SSH_PORT");
	    }
	  if (NULL != getenv ("DUP_SSH_USER"))
	    {
	      argv[argnum++] = "-l";
	      argv[argnum++] = getenv ("DUP_SSH_USER");
	    }
	  argv[argnum++] = hn;
	}
      else
	{
	  if (NULL != getenv ("DUP_DUPD_COMMAND"))
	    cmd = getenv ("DUP_DUPD_COMMAND");
	  else
	    cmd = "dupd";
	}
      if (NULL != getenv ("DUP_DUPD_COMMAND"))
	argv[argnum++] = getenv ("DUP_DUPD_COMMAND");
      else
	argv[argnum++] = "dupd";
      argv[argnum] = NULL;
      execvp (cmd,
	      (char *const*) argv);
      fprintf (stderr,
	       "exec failed: %s\n", strerror (errno));
      _exit (0);
    }
  close (inpipe[0]);
  close (outpipe[1]);
  ssh_stdin = inpipe[1];
  ssh_stdout = outpipe[0];  
}

ControlConnection::~ControlConnection ()
{
  if (ssh_stdout != -1)
    close (ssh_stdout);
  if (ssh_stdin != -1)
    close (ssh_stdin);
}

void
ControlConnection::get_fd_set (int *maxfd,
                               fd_set * readfds, fd_set * writefds)
{
  switch (state)
    {
    case CC_CS_HEADER:
    case CC_CS_PROCESSINFO:
    case CC_CS_GO:
      if (ssh_stdin > *maxfd)
        *maxfd = ssh_stdin;
      if (ssh_stdout > *maxfd)
        *maxfd = ssh_stdout;
      FD_SET (ssh_stdout, readfds);
      FD_SET (ssh_stdin, writefds);
      return;
    case CC_CS_PORT_ACK:
    case CC_CS_WAITING_PORT:
    case CC_CS_READY_ACK:
    case CC_CS_WAITING_READY:
    case CC_CS_FIN:      
      if (ssh_stdout > *maxfd)
        *maxfd = ssh_stdout;
      FD_SET (ssh_stdout, readfds);
      return;
    case CC_CS_DONE:      
      /* totally finished */
      return;
    }
}

static const char *
ec_to_string (enum DUPD_ErrorCode ec)
{
  switch (ec)
    {
    case DUPD_EC_SUCCESS:
      return "success";
    case DUPD_EC_OUT_OF_MEMORY:
      return "out of memory";
    case DUPD_EC_OUT_OF_SOCKETS:
      return "out of sockets";
    case DUPD_EC_ACCESS_DENIED:
      return "access denied";
    case DUPD_EC_DNS_RESOLUTION_FAILURE:
      return "DNS resolution failure";
    case DUPD_EC_PROTO_NOT_SUPPORTED:
      return "protocol not supported";
    case DUPD_EC_TCP_CONNECT_FAILURE:
      return "TCP connect failure";
    case DUPD_EC_READ_OPEN_FAILURE:
      return "failed to open file for reading";
    case DUPD_EC_WRITE_OPEN_FAILURE:
      return "failed to open file for writing";
    case DUPD_EC_APPEND_OPEN_FAILURE:
      return "failed to open file for appending";
    case DUPD_EC_TRANSMISSION_ERROR:
      return "failed to transmit data";
    case DUPD_EC_TRANSMISSION_TIMEOUT:
      return "transmission timed out";
    case DUPD_EC_SESSION_TIMEOUT:
      return "session timed out";
    case DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION:
      return "control protocol violation by dup";
    case DUPD_EC_DUPD_PROTOCOL_VIOLATION:
      return "protocol violation by dupd";
    case DUPD_EC_DUP_DATA_PROTOCOL_VIOLATION:
      return "data protocol violation by dup";
    case DUPD_EC_FAILED_TO_FORK:
      return "failed to fork";
    case DUPD_EC_DUPLICATE_SESSION_NUMBER:
      return "duplicate session number";
    case DUPD_EC_UNSUPPORTED_VERSION:
      return "unsupported version";
    case DUPD_EC_EXEC_OPEN_FAILURE:
      return "failure to open for exec";
    case DUPD_EC_PORT_BIND_FAILURE:
      return "failure to bind to port";
    case DUPD_EC_INTERNAL_ERROR:
      return "internal error";
    case DUPD_EC_UNKNOWN_ERROR:
      return "unknown error";
    case DUPD_EC_STILL_WAITING:
      return "still waiting to make progress";
    }
  return "unknown error code";
}

void
ControlConnection::act_fd_set (fd_set * readfds, fd_set * writefds)
{
  if (state == CC_CS_DONE)
    return; 
  if (FD_ISSET (ssh_stdout, readfds))
    {
      if (ready_received >= ready_expect) 
	throw "internal error: act_fd_set called for reading but read buffer full";
      ssize_t ret = read (ssh_stdout, 
			  &reply[ready_received],
                          ready_expect - ready_received);
      if (ret == 0)
        {
          fprintf (stderr,
                   "dupd closed connection unexpectedly. Aborting.\n");
          throw "dupd died";
        }
      if (ret == -1)
        {
          fprintf (stderr,
		   "read failed: %s\n",
		   strerror (errno));
          throw "Read error";
        }
      ready_received += ret;
      if (ready_received == READY_SUCCESS_SIZE)
        {
          unsigned int rval;
          enum DUPD_ErrorCode ec;
          memcpy (&rval, reply, sizeof (rval));
          ec = (enum DUPD_ErrorCode) ntohl (rval);
          if (ec != DUPD_EC_SUCCESS)
            {
	      pid_t cpid;

              fprintf (stderr,
                       "dupd `%s:%u' signaled error %s:\n",
                       hostname, port, ec_to_string (ec));
              if (0 == (cpid = fork ()))
                {
                  /* print rest of stream to stderr */
                  close (0);
                  dup2 (ssh_stdout, 0);
                  close (1);
                  dup2 (2, 1);
		  close (2); // ignore stderr from cat
                  execlp ("buffer-dup", "buffer-dup", NULL);
                  exit (1);
                }
	      if (-1 == cpid)
		fprintf (stderr,
			 "failed to fork process to report dupd error: %s\n",
			 strerror (errno));
	      else
		waitpid (cpid, NULL, 0);
              throw "";
            }
	  switch (state)
	    {
	    case CC_CS_HEADER:
	      throw "protocol violation: got PORT-ACK before header transmission was complete";
	    case CC_CS_PORT_ACK:
	      ready_received = 0;
	      data_ready--;
	      state = CC_CS_WAITING_PORT;
	      break;
	    case CC_CS_WAITING_PORT:
	      throw "protocol violation: got ACK while waiting for global port ack";
	    case CC_CS_PROCESSINFO:
	      throw "protocol violation: got ACK before processinfo transmission was complete";
	    case CC_CS_READY_ACK:
	      ready_received = 0;
	      state = CC_CS_WAITING_READY;
	      break;
	    case CC_CS_WAITING_READY:
	      throw "protocol violation: got ACK while waiting for ready";
	    case CC_CS_GO:
	      throw "protocol violation: got FIN-ACK while sending go";
	    case CC_CS_FIN:
	      ready_received = 0;
	      state = CC_CS_DONE;
	      break;
	    case CC_CS_DONE:
	      throw "state machine error: reading in state CC_CS_DONE";
	    }
        }
      return;
    }

  if (!FD_ISSET (ssh_stdin, writefds))  
    return;

  if ( (FD_ISSET (ssh_stdin, writefds)) && (outbuf_end > outbuf_wpos) )
    {
      ssize_t ret = write (ssh_stdin, 
                           &outbuf[outbuf_wpos], 
                           outbuf_end - outbuf_wpos);
      if (ret == -1)
        {
          outbuf_wpos = errno;
          outbuf_end = SEND_BUFFER_SIZE + 1;      
        }
      else
        {
          outbuf_wpos += ret;
        }
    }
  if (outbuf_wpos == outbuf_end)
    outbuf_wpos = outbuf_end = 0; 
  if (outbuf_wpos == SEND_BUFFER_SIZE)
    return; // nothing more to do here, buffer full!

  switch (state)
    {
    case CC_CS_HEADER:
      if (header_bytes_sent == 0)
	{
	  // first call, build header!
	  struct DupToDupdControlInfo ci;
	  ci.magic = htonl (0xDDFF8600);
	  ci.version1 = htons (1);
	  ci.port = htons (port);
	  ci.proc_count = htonl (process_list.size ());
	  memcpy (header, &ci, sizeof (ci));
	}
      if (header_bytes_sent < HEADER_SIZE)
	{
	  ssize_t ret = transmit (&header[header_bytes_sent],
				  HEADER_SIZE - header_bytes_sent);
	  if (ret == -1)
	    {
	      fprintf (stderr, "write failed: %s\n", strerror (errno));
	      throw "Write error";
	    }
	  header_bytes_sent += ret;
	  if (ret == 0)
	    return;
	}
      if (outbuf_end > 0)
	return;
      if (header_bytes_sent == HEADER_SIZE)
	state = CC_CS_PORT_ACK;
      return;
    case CC_CS_PORT_ACK:
      throw "internal error: act_fd_set called in state CC_CS_PORT_ACK for writing";
    case CC_CS_WAITING_PORT:
      throw "internal error: act_fd_set called in state CC_CS_WAITING_PORT for writing";
    case CC_CS_PROCESSINFO:
      if (outbuf_wpos == SEND_BUFFER_SIZE)
	return; // nothing more to do here, buffer full!
      while (processes_sent < process_list.size ())
	{
	  while (outbuf_wpos < SEND_BUFFER_SIZE)
	    {
	      if (1 == process_list[processes_sent]->transmit (this))
		{
		  processes_sent++;      
		  break;
		}
	    }
	  if (outbuf_wpos == SEND_BUFFER_SIZE)
	    return;
	}
      if (outbuf_end > 0)
	return;
      state = CC_CS_READY_ACK;
      return;
    case CC_CS_READY_ACK:
      throw "internal error: act_fd_set called in state CC_CS_READY_ACK for writing";
    case CC_CS_WAITING_READY:
      throw "internal error: act_fd_set called in state CC_CS_WAITING_READY for writing";
    case CC_CS_GO:
      if (go_bytes_sent < GO_SIZE)
	{
	  ssize_t ret = transmit (&gomsg[go_bytes_sent],
				  GO_SIZE - go_bytes_sent);
	  if (ret == -1)
	    {
	      outbuf_wpos = errno;
	      throw "Write error";
	    }
	  go_bytes_sent += ret;
	}
      if (go_bytes_sent < GO_SIZE)
	return;
      if (outbuf_end > 0)
	return;
      state = CC_CS_FIN;
      return;
    case CC_CS_FIN:
      throw "internal error: act_fd_set called in state CC_CS_FIN for writing";
    case CC_CS_DONE:
      throw "internal error: act_fd_set called in state CC_CS_DONE";
    }
}


/**
 * Are we ready? (for data connections, did we send
 * all we need to send? for control connections,
 * did our dupd report that it is ready?)
 */
int
ControlConnection::is_ready ()
{
  switch (state)
    {
    case CC_CS_HEADER:
    case CC_CS_PORT_ACK:
    case CC_CS_PROCESSINFO:
    case CC_CS_READY_ACK:
      return 1;
    case CC_CS_WAITING_PORT:
    case CC_CS_WAITING_READY:
      return 0;                  /* we are ready to go! */
    case CC_CS_GO:
      return 1;
    case CC_CS_FIN:
      return 1;
    case CC_CS_DONE:
      return 0;     
    default:
      throw "internal error: is_ready called with unknown state";
    }
}

/**
 * Ready to transmit full data (all dupd are now listening).
 */
void
ControlConnection::port_ready ()
{
  if (state != CC_CS_WAITING_PORT)
    throw "internal error: wrong state for calling 'ControlConnection::go'";
  state = CC_CS_PROCESSINFO;
}


/**
 * Ready to rumble.  Fork cat (for data connections)
 * or start sending go (for control connections).
 *
 * @param fork_count increment by one for each child spawned
 */
void
ControlConnection::go (unsigned int &fork_count)
{
  if (state != CC_CS_WAITING_READY)
    throw "internal error: wrong state for calling 'ControlConnection::go'";
  state = CC_CS_GO;
}


/**
 * Try to add the given process to this connection.
 * @return 1 if we succeeded; 0 if the process does
 *         not belong with the dupd this connection
 *         is used for.
 */
int
ControlConnection::add_process (Process * p)
{
  if ((0 == strcmp (p->host_address, hostname)) && (p->portnum == port))
    {
      process_list.push_back (p);
      p->set_index (process_list.size ());
      return 1;
    }
  return 0;
}
