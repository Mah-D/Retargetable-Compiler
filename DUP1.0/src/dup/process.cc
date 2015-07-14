/*
     This file is part of DUP.
     (C) 2008, 2009 The DUP team

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
 * @file dup/dup_process.cc
 * @brief representation of a process
 * @author Krista Grothoff
 */
#include "process.h"
#include "control_connection.h"
#include <arpa/inet.h>
#include <errno.h>
#include <string.h>

#define BIO_HACK 1


/**
 * Which of dup's file descriptors are in use?
 */
static int dup_fd_map[FD_SETSIZE];


Process::Process ()
{
  portnum = DUP_DEFAULT_PORTNUM;
  process_id = NULL;
  host_address = NULL;
  my_index = 0;
  commands_sent = 0;
  edges_sent = 0;
  header_bytes_sent = 0;
  my_index = 0;
  currentArg = NULL;
  memset (header, 0, sizeof (header));
}

Process::~Process ()
{
  if (process_id != NULL)
    free (process_id);
  if (host_address != NULL)
    free (host_address);
  if (currentArg != NULL)
    delete currentArg;
  for (vector < Edge * >::const_iterator ii = edge_list.begin ();
       ii != edge_list.end (); ii++)
    {
      delete *ii;
    }

  edge_list.clear ();

  for (vector < char *>::const_iterator jj = command_args.begin ();
       jj != command_args.end (); jj++)
    {
      free (*jj);
    }

  command_args.clear ();
}

Process::Process (const Process & p)
{
  Edge *temp_edge;

  commands_sent = p.commands_sent;
  edges_sent = p.edges_sent;
  currentArg = NULL;
  portnum = p.portnum;
  if (p.process_id != NULL)
    process_id = strdup (p.process_id);
  else
    process_id = NULL;

  if (p.host_address != NULL)
    host_address = strdup (p.host_address);
  else
    host_address = NULL;

  for (vector < Edge * >::const_iterator ii = p.edge_list.begin ();
       ii != p.edge_list.end (); ii++)
    {
      temp_edge = new Edge (**ii);
      edge_list.push_back (temp_edge);
    }

  for (vector < char *>::const_iterator jj = p.command_args.begin ();
       jj != p.command_args.end (); jj++)
    {
      command_args.push_back (strdup (*jj));
    }
}

/**
 * Transmit information about this process to
 * the given socket (one write call at a time).
 * @return 0 if we have more to send, 1 if we are done
 */
int
Process::transmit (ControlConnection *s)
{
#if 0
  fprintf (stderr,
	   "PID: `%s' at %u is number %u\n",
	   process_id,
	   portnum,
	   my_index);
#endif
  if (header_bytes_sent == 0)
    {
      // first call, build header!
      struct DupToDupdProcessInfo pi;
      pi.total_fds = htonl (edge_list.size ());
      pi.total_args = htonl (command_args.size ());
      memcpy (header, &pi, sizeof (pi));
    }
  if (header_bytes_sent < sizeof (DupToDupdProcessInfo))
    {
      ssize_t ret = s->transmit (&header[header_bytes_sent],
				 sizeof (DupToDupdProcessInfo) - header_bytes_sent);
      if (ret == -1)
        {
          fprintf (stderr, "write failed: %s\n", strerror (errno));
          throw "Write error";
        }
      header_bytes_sent += ret;
      return 0;
    }
  if ((commands_sent < command_args.size ()) && (currentArg == NULL))
    currentArg = new DupString (command_args[commands_sent++]);
  if (currentArg != NULL)
    {
      if (0 == currentArg->transmit (s))
        return 0;
      delete currentArg;
      currentArg = NULL;
      return 0;
    }
  if (edges_sent < edge_list.size ())
    {
      if (0 == edge_list[edges_sent]->transmit (this, s))
        return 0;
      edges_sent++;
      if (edges_sent < edge_list.size ())
        return 0;
    }
  return 1;
}

void
Process::add_edge (Edge * e)
{
  EdgeNode *me = (e->left->name != NULL) ? e->right : e->left;
  edge_list.push_back (e);
#if PRINT_INFO
  fprintf (stderr,
           "Adding edge %d to %s\n", me->descriptor_number, this->process_id);
#endif
  if (edge_map[me->descriptor_number] != NULL)
    {
      fprintf (stderr,
               "Error: descriptor %u is specified twice for process %s\n",
               me->descriptor_number, this->process_id);
      throw "Semantic error";
    }
  edge_map[me->descriptor_number] = e;
  if ((e->right->name == NULL) && (e->left->name == NULL))
    {
      // twice the same process! Add to edge map twice!
      me = e->left;
      if (edge_map[me->descriptor_number] != NULL)
        {
          fprintf (stderr,
                   "Error: descriptor %u is specified twice for process %s\n",
                   me->descriptor_number, this->process_id);
          throw "Semantic error";
        }
      edge_map[me->descriptor_number] = e;
    }
}

void
Process::connect_pipes (map < const string, Process * >pmap)
{
  for (vector < Edge * >::const_iterator ei = this->edge_list.begin ();
       ei != this->edge_list.end (); ei++)
    {
      Edge *e = *ei;
      if (e->right->is_dup ())
	{
	  if (0 != dup_fd_map[e->right->descriptor_number]++)
	    {
	      fprintf (stderr,
		       "Error: can not connect to DUP descriptor %d more than once!\n",
		       e->right->descriptor_number);
	      throw "Semantic error in input specification";
	    }
	}
      if (e->left->is_dup ())
	{
	  if (0 != dup_fd_map[e->left->descriptor_number]++)
	    {
	      fprintf (stderr,
		       "Error: can not connect to DUP descriptor %d more than once!\n",
		       e->left->descriptor_number);
	      throw "Semantic error in input specification";
	    }
	}
      if (e->op != DUP_PIPE)
        continue;
      if ((e->right->name == NULL) || (e->right->is_dup ()))
        continue;               // inverse edge or loopback to self-edge
      Process *p = (e->right->name != NULL) ? pmap[e->right->name] : this;
#if PRINT_INFO
      fprintf (stderr,
               "Adding inverse edge from %s:%d to %s:%d\n",
               this->process_id,
               e->left->descriptor_number,
               p->process_id, e->right->descriptor_number);
#endif
      if (p == NULL)
        {
          fprintf (stderr,
                   "Error: can not connect output %d of process `%s' to `%s:%d': no such process!\n",
                   e->left->descriptor_number,
                   this->process_id,
                   e->right->name, e->right->descriptor_number);
          throw "Semantic error in input specification";
        }
      p->add_edge (e->inverse (this, p));
      if (p == this)
	{
	  /* concurrent modification to "this->edge_list" might
	     invalidate our iterator, re-initialize it */
	  ei = this->edge_list.begin ();
	  while (*ei != e)
	    ei++;
	}
    }
}


void
Process::print ()
{
  cout << "Process ID: " << process_id << "\n";
  cout << "Host address: " << host_address << "\n";
  cout << "Host port: " << portnum;
  if (portnum == DUP_DEFAULT_PORTNUM)
    cout << " (default)";
  cout << "\n";
  cout << "Edges:\n";

  int count = 1;

  for (vector < Edge * >::const_iterator ii = edge_list.begin ();
       ii != edge_list.end (); ii++, count++)
    {
      cout << "\nEdge number " << count << ":\n";
      (*ii)->print ();
      cout << "\n";
    }

  cout << "Parsed commands/arguments:\n";

  count = 0;

  for (vector < char *>::const_iterator jj = command_args.begin ();
       jj != command_args.end (); jj++, count++)
    {
      cout << "\nArg number " << count << ":\n";
      cout << *jj << "\n";
    }
}

void
Process::pretty_print (std::ostream & stream)
{
  using namespace std;

  typedef vector < Edge * >::const_iterator EdgeIter;
  typedef vector < char *>::const_iterator CharIter;

  string token;
  string::size_type s;
  static const char *white_space = " \t\n\r";

  stream << this->process_id << "@" << this->host_address
    << ":" << this->portnum << "[";


  for (EdgeIter iter = this->edge_list.begin ();
       iter != this->edge_list.end (); ++iter)
    {
      (*iter)->pretty_print (stream);
      if (iter != this->edge_list.end () - 1)
        {
          stream << ", ";
        }
    }

  stream << "]$";

  stream << (*this->command_args.begin ()) << " ";
  for (CharIter iter = this->command_args.begin () + 1;
       iter != this->command_args.end (); ++iter)
    {
      token = (*iter);

      if ((s = token.find_first_of (white_space)) == string::npos)
        {
          //white space not found in the string.
          stream << token << " ";
        }
      else
        {
#if BIO_HACK
          stream << token << " ";
#else
          //white space found.  Wrap in quotes
          stream << "\"" << token << "\" ";
#endif
        }
    }

  stream << ";\n";
}

void
Process::pretty_print_old_dup (std::ostream & stream)
{
  using namespace std;

  typedef vector < Edge * >::const_iterator EdgeIter;
  typedef vector < char *>::const_iterator CharIter;

  string token;
  string::size_type s;
  static const char *white_space = " \t\n\r";

  stream << this->process_id << "@" << this->host_address
    << ":" << this->portnum << "[";


  for (EdgeIter iter = this->edge_list.begin ();
       iter != this->edge_list.end (); ++iter)
    {
      (*iter)->pretty_print (stream);
      if (iter != this->edge_list.end () - 1)
        {
          stream << ", ";
        }
    }

  stream << "]$\"";

  stream << (*this->command_args.begin ());
  for (CharIter iter = this->command_args.begin () + 1;
       iter != this->command_args.end (); ++iter)
    {
      token = (*iter);

      if ((s = token.find_first_of (white_space)) == string::npos)
        {
          //white space not found in the string.
          stream << " " << token;
        }
      else
        {
          //white space found.  Wrap in quotes
          stream << "\'" << token << "\' ";
        }
    }

  stream << "\";\n";
}
