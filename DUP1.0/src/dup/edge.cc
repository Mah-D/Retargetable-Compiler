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
 * @file dup/dup_edge.cc
 * @brief representation of a stream between two
 *        processes or a process and a file
 * @author Krista Grothoff
 * @author Christian Grothoff
 */
#include "edge.h"
#include "globals.h"
#include "process.h"
#include "dup_string.h"
#include "control_connection.h"
#include <string.h>
#include <errno.h>
#include <arpa/inet.h>



/**
 * Generate a good random stream number.
 * (first tries /dev/random* and then reverts
 * to rand() if /dev/random* failed).
 */
static uint64_t 
generate_stream_number ()
{
  uint64_t snum;
  int fd;
  int pos;
  size_t bpos;
  ssize_t ret;
  char buffer[sizeof (uint64_t)];
  static const char *paths[] = {
    "/dev/urandom",
    "/dev/random",
    "/dev/srandom",
    NULL
  };
  bpos = 0;
  pos = 0;
  while (paths[pos] != NULL)
    {
      fd = open (paths[pos++], O_RDONLY);
      if (fd == -1)
        continue;
      ret = read (fd, &buffer[bpos], sizeof (buffer) - bpos);
      if (ret <= 0)
        {
          close (fd);
          continue;
        }
      bpos += ret;
      close (fd);
      if (bpos == sizeof (buffer))
        break;
    }
  if (bpos < sizeof (buffer))
    srand (time (NULL));
  while (bpos < sizeof (buffer))
    buffer[bpos++] = rand ();
  memcpy (&snum, buffer, sizeof (uint64_t));
  return snum;
}


Edge::Edge ()
{
  left = NULL;
  right = NULL;
  rest = NULL;
  memset (header, 0, sizeof (header));
  bytes_header_sent = 0;
  op = DUP_INVALID;
  stream_id = generate_stream_number ();
}


Edge::Edge (uint64_t sid)
{
  left = NULL;
  right = NULL;
  rest = NULL;
  memset (header, 0, sizeof (header));
  bytes_header_sent = 0;
  op = DUP_INVALID;
  stream_id = sid;
}

Edge::Edge (const Edge & e)
{
  if (e.left != NULL)
    {
      left = new EdgeNode (*e.left);
    }
  else
    left = NULL;
  if (e.right != NULL)
    {
      right = new EdgeNode (*e.right);
    }
  else
    right = NULL;
  rest = NULL;
  memset (header, 0, sizeof (header));
  bytes_header_sent = 0;
  op = e.op;
  stream_id = e.stream_id;
}


Edge::Edge (OperatorType myOp, EdgeNode * myLeft, EdgeNode * myRight)
{
  left = myLeft;
  right = myRight;
  rest = NULL;
  memset (header, 0, sizeof (header));
  bytes_header_sent = 0;
  op = myOp;
  if (op == DUP_PIPE)
    stream_id = generate_stream_number ();
  else
    stream_id = 0;
}

Edge::~Edge ()
{
  delete left;
  delete right;
  if (rest != NULL)
    delete rest;
}

Edge *
Edge::inverse (Process * pl, Process * pr)
{
  if (op != DUP_PIPE)
    THROW_FATAL ("internal logic error");
  Edge *r = new Edge (stream_id);
  r->op = DUP_PIPE;
  r->left = new EdgeNode (pl->process_id, left->descriptor_number);
  r->right = new EdgeNode (NULL, right->descriptor_number);
  r->left->set_process (pl);
  r->right->set_process (pr);
  return r;
}

/**
 * Compute the structure that we'll have to transmit for this edge.
 */
void
Edge::prepare_transmit (const Process * p)
{
  struct DupToDupdEdgeInfo ei;
  unsigned short flags;
  unsigned short rport;
  unsigned int lfd;
  unsigned int rfd;
  unsigned int rpidx;

  switch (op)
    {
    case DUP_PIPE:
      if ((right->is_local (p)) && (left->name == NULL))
        {
          flags = DUPD_IO_FLAG_USE_PIPE;
          rest = new DupString ("");
          rport = 1;            // we are sending
          lfd = left->descriptor_number;
          rfd = right->descriptor_number;
          rpidx = right->get_pidx ();
	  stream_id = 0;
        }
      else if ((left->is_local (p)) && (right->name == NULL))
        {
          flags = DUPD_IO_FLAG_USE_PIPE;
          rest = new DupString ("");
          rport = 0;            // we are receiving
          rfd = left->descriptor_number;
          lfd = right->descriptor_number;
          rpidx = left->get_pidx ();	
	  stream_id = 0;
        }
      else if ((left->is_dup () && (right->name == NULL)))
        {
          flags = DUPD_IO_FLAG_RECEIVE_FROM_DUP;
          rest = new DupString ("");
          rport = 0;
          lfd = right->descriptor_number;
          rfd = left->descriptor_number;
          rpidx = 0;
        }
      else if (right->is_dup () && (left->name == NULL))
        {
          flags = DUPD_IO_FLAG_TRANSMIT_TO_DUP;
          rest = new DupString ("");
          rport = 0;
          lfd = left->descriptor_number;
          rfd = right->descriptor_number;
          rpidx = 0;
        }
      else if ((left->name == NULL) && (right->name != NULL)
               && (!right->is_dup ()))
        {
          flags = DUPD_IO_FLAG_TRANSMIT_TO_DUPD;
          rest = new DupString (right->get_process ()->host_address);
          lfd = left->descriptor_number;
          rfd = right->descriptor_number;
          rpidx = right->get_pidx ();
          rport = right->get_port ();
        }
      else if ((right->name == NULL) && (left->name != NULL)
               && (!left->is_dup ()))
        {
          flags = DUPD_IO_FLAG_RECEIVE_FROM_DUPD;
          rest = new DupString ("");
          lfd = right->descriptor_number;
          rfd = left->descriptor_number;
          rpidx = left->get_pidx ();
          rport = 0;
        }
      else
        throw "Invalid pipeline specification";
      break;
    case DUP_READ:
      stream_id = 0;
      if ((left->name == NULL) && (right->name != NULL))
        {
          flags = DUPD_IO_FLAG_READ_FROM_FILE;
          rest = new DupString (right->name);
          rpidx = 0;
          rport = 0;
          rfd = 0;
          lfd = left->descriptor_number;	  
        }
      else
        throw "Invalid file read specification";
      break;
    case DUP_WRITE:
      stream_id = 0;
      if ((right->name != NULL) && (left->name == NULL))
        {
          flags = DUPD_IO_FLAG_WRITE_TO_FILE;
          rest = new DupString (right->name);
          rpidx = 0;
          rport = 0;
          rfd = 0;
          lfd = left->descriptor_number;
        }
      else
        throw "Invalid file write specification";
      break;
    case DUP_APPEND:
      stream_id = 0;
      if ((right->name != NULL) && (left->name == NULL))
        {
          flags = DUPD_IO_FLAG_APPEND_TO_FILE;
          rest = new DupString (right->name);
          rpidx = 0;
          rport = 0;
          rfd = 0;
          lfd = left->descriptor_number;
        }
      else
        throw "Invalid file append specification";
      break;
    default:
      throw "Internal error";
    }
  ei.flags = htons (flags);
  ei.remote_port = htons (rport);
  ei.local_fd = htonl (lfd);
  ei.remote_fd = htonl (rfd);
  ei.remote_pidx = htonl (rpidx);
  ei.stream_id = stream_id;
  memcpy (header, &ei, sizeof (ei));
#if 0
  fprintf (stderr,
	   "IOD: flag=%u local=%u/%u remote=%u/%u port=%u -- sid %llu\n",
	   flags,
	   p->get_index (),
	   lfd,
	   rpidx,
	   rfd,
	   rport,
	   (unsigned long long) stream_id);
#endif
}

/**
 * Transmit information about this edge to
 * the given socket (one write call at a time).
 *
 * @return 0 if we have more to send, 1 if we are done
 */
int
Edge::transmit (const Process * const p,
		ControlConnection * s)
{
  if (rest == NULL)
    prepare_transmit (p);
  if (bytes_header_sent < sizeof (DupToDupdEdgeInfo))
    {
      ssize_t ret = s->transmit (&header[bytes_header_sent],
				 sizeof (DupToDupdEdgeInfo) - bytes_header_sent);
      if (ret == -1)
        {
          fprintf (stderr, "write failed: %s\n", strerror (errno));
          throw "Write error";
        }
      bytes_header_sent += ret;
      return 0;
    }
  return rest->transmit (s);
}

/**
 * Check that this edge is valid in terms of syntactic input.
 * Specifically, we check that the left node either has no label or
 * that it is "DUP".
 *
 * We also check that if IO-redirection is used, the right contains a
 * filename and not a descriptor.
 */
void
Edge::check_valid_input (Process * p)
{
  if ((left->name != NULL) && (!left->is_dup ()))
    {
      fprintf (stderr,
               "Invalid left node label `%s' for process `%s'!\n"
               "The label on the left must either be `%s' or empty!\n",
               left->name, p->process_id, "DUP");
      throw "Illegal DUP code";
    }
  if ((op != DUP_PIPE) &&
      ((right->name == NULL) || (right->descriptor_number != -1)))
    {
      fprintf (stderr,
               "Invalid or missing right node label for process `%s'!\n"
               "When using IO redirection, the label on the right must be just a filename!\n",
               p->process_id);
      throw "Illegal DUP code";
    }
  if ((op != DUP_PIPE) && ((left->name != NULL)))
    {
      fprintf (stderr,
               "Invalid left node label `%s' for process `%s'!\n"
               "When using IO redirection, the label on the left must be just a file descriptor number!\n",
               left->name, p->process_id);
      throw "Illegal DUP code";
    }
}

void
Edge::print ()
{
  if (left != NULL)
    {
      cout << "\t Left edge node:\t";
      left->print ();
    }
  else
    cout << "\tLeft edge node is NULL.\n";

  switch (op)
    {
    case DUP_PIPE:
      cout << "\tOperator is DUP_PIPE.\n";
      break;
    case DUP_READ:
      cout << "\tOperator is DUP_READ (read from file).\n";
      break;
    case DUP_WRITE:
      cout << "\tOperator is DUP_WRITE (write to file).\n";
      break;
    case DUP_APPEND:
      cout << "\tOperator is DUP_APPEND (append to file).\n";
      break;
    default:
      cout << "\tERROR: Operator is undefined!\n";
      break;
    }

  if (right != NULL)
    {
      cout << "\t Right edge node:\t";
      right->print ();
    }
  else
    cout << "\tRight edge node is NULL.\n";
}

void
Edge::pretty_print (std::ostream & stream)
{
  this->left->pretty_print (stream);
  Edge::print_operator (this->op, stream);
  this->right->pretty_print (stream);
}

void
Edge::print_operator (OperatorType op, std::ostream & stream)
{
  switch (op)
    {
    case DUP_PIPE:
      stream << "|";
      break;
    case DUP_READ:
      stream << "<";
      break;
    case DUP_WRITE:
      stream << ">";
      break;
    case DUP_APPEND:
      stream << ">>";
      break;
    default:
      stream << "UNKNOWN OP: " << ((int) op);
    };
}

EdgeNode::EdgeNode ()
{
  name = NULL;
  descriptor_number = -1;
  process = NULL;
  ds_name = NULL;
}

EdgeNode::EdgeNode (const EdgeNode & en)
{
  if (en.name != NULL)
    name = strdup (en.name);
  else
    name = NULL;
  descriptor_number = en.descriptor_number;
  process = NULL;
  ds_name = NULL;
}

EdgeNode::EdgeNode (int desc_num)
{
  name = NULL;
  descriptor_number = desc_num;
  process = NULL;
  ds_name = NULL;
}

EdgeNode::EdgeNode (const char *path)
{
  if (path != NULL)
    name = strdup(path);
  else
    name = NULL;
  descriptor_number = -1;
  ds_name = (name != NULL) ? new DupString (name) : NULL;
  process = NULL;
}

EdgeNode::EdgeNode (const char *id, int desc_num)
{
  if (id != NULL)
    name = strdup(id);
  else
    name = NULL;

  descriptor_number = desc_num;
  ds_name = (name != NULL) ? new DupString (name) : NULL;
  process = NULL;
}

int
EdgeNode::is_local (const Process * p)
{
  if (process == NULL)
    return 0;
  return process->same_host (p);
}

uint32_t
EdgeNode::get_pidx ()
{
  if (is_dup ())
    return 0;
  if (process == NULL)
    abort ();
  return process->get_index ();
}

uint16_t
EdgeNode::get_port ()
{
  if (is_dup ())
    return 0;
  if (process == NULL)
    abort ();
  return process->portnum;
}

EdgeNode::~EdgeNode ()
{
  if (name != NULL)
    free (name);
  if (ds_name != NULL)
    delete ds_name;
}

int
EdgeNode::is_dup ()
{
  if (name == NULL)
    return 0;
  return 0 == strcmp ("DUP", name);
}

void
EdgeNode::print ()
{
  if (name == NULL)
    {
      cout << "*Local descriptor number* " << descriptor_number << "\n";
    }
  else
    {
      if (descriptor_number == -1)
        {
          cout << "*File path* " << name << "\n";
        }
      else
        {
          cout << "*Process id / descriptor number* " << name << " / "
            << descriptor_number << "\n";
        }
    }
}

void
EdgeNode::pretty_print (std::ostream & stream)
{
  if (name == NULL)
    {
      //cout << "*Local descriptor number* " << descriptor_number << "\n";
      stream << this->descriptor_number;
    }
  else
    {
      if (descriptor_number == -1)
        {
          //cout << "*File path* " << name << "\n";
          stream << this->name;
        }
      else
        {
          /*cout << "*Process id / descriptor number* " << name << " / "
             << descriptor_number << "\n"; */
          stream << this->name << ":" << this->descriptor_number;
        }
    }
}
