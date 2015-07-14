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
 * @file dup/dup.cc
 * @brief main function for the DUP program
 * @author Christian Grothoff
 * @author Krista Grothoff
 */

#include "globals.h"
#include "process.h"
#include "connection.h"
#include "data_connection.h"
#include "control_connection.h"
#include "dupparse.h"
#include <getopt.h>
#include <vector>
#include <map>
#include <signal.h>


#define DUP_PARSE_DEBUG

using namespace std;

extern vector < Process * >session_processes;

extern "C"
{
  extern int yyparse ();
  extern int yylex_destroy ();
}


/**
 * List of our TCP streams to dupds.
 */
static vector < Connection * >cons;

/**
 * Are we ready for data connections? (0 if yes).
 */
int data_ready;

/**
 * Actual FD of stdin (in case we dup'ed away the old
 * one for parsing).
 */
static int real_stdin;

/**
 * Resolve labels in edges (find the respective process).
 * Die if a label does not resolve.
 */
static void
prepare ()
{
  map < const string, Process * >pmap;

  for (vector < Process * >::const_iterator pi = session_processes.begin ();
       pi != session_processes.end (); pi++)
    {
      Process *p = *pi;

      if (NULL != pmap[p->process_id])
	{
	  fprintf (stderr,
		   "Process label `%s' used more than once!\n",
		   p->process_id);
	  throw "Label defined twice";
	}
      pmap[p->process_id] = p;
      for (vector < Edge * >::const_iterator ei = p->edge_list.begin ();
           ei != p->edge_list.end (); ei++)
        {
          Edge *e = *ei;
          e->check_valid_input (p);
        }
    }

  for (vector < Process * >::const_iterator pi = session_processes.begin ();
       pi != session_processes.end (); pi++)
    {
      Process *p = *pi;
      p->connect_pipes (pmap);
    }

  for (vector < Process * >::const_iterator pi = session_processes.begin ();
       pi != session_processes.end (); pi++)
    {
      Process *p = *pi;

      for (vector < Edge * >::const_iterator ei = p->edge_list.begin ();
           ei != p->edge_list.end (); ei++)
        {
          Edge *e = *ei;
          if (e->op != DUP_PIPE)
            continue;
          if ((!e->left->is_dup ()) && (e->left->name != NULL))
            {
              Process *r = pmap[e->left->name];
              if (r == NULL)
                {
                  fprintf (stderr,
                           "Failed to resolve edge label `%s'\n",
                           e->left->name);
                  throw "Label resolution failure";
                }
              e->left->set_process (r);
            }
          if ((!e->right->is_dup ()) && (e->right->name != NULL))
            {
              Process *r = pmap[e->right->name];
              if (r == NULL)
                {
                  fprintf (stderr,
                           "Failed to resolve edge label `%s'\n",
                           e->right->name);
                  throw "Label resolution failure";
                }
              e->right->set_process (r);
            }
        }
    }

}

/**
 * Main method that does the actual work.
 */
static void
work_main ()
{
  /**
   * How many child processes have we forked?
   */
  unsigned int num_children = 0;

  /**
   * are we still sending/receiving data?
   */
  int working = 1;

  /**
   * have we reached "go" yet?
   */
  int nogoyet = 1;
  int data_added = 0;
  time_t end;
  time_t now;
  unsigned int num_dupds;

  /* first, create all control connections */
  for (vector < Process * >::const_iterator pi = session_processes.begin ();
       pi != session_processes.end (); pi++)
    {
      Process *p = *pi;
      int added = 0;
      for (vector < Connection * >::const_iterator ci = cons.begin ();
           ci != cons.end (); ci++)
        {
          ControlConnection *cc = (ControlConnection *) * ci;
          if (1 == cc->add_process (p))
            {
              added = 1;
              break;
            }
        }
      if (added)
        continue;
      cons.push_back (new ControlConnection (p));
    }
  end = time (NULL) + DUPD_FRESH_CONNECTION_TIMEOUT;
  num_dupds = cons.size ();
  /* now the main select loop */
  while (working)
    {
      fd_set rs;
      fd_set ws;
      int max = -1;
      struct timeval tv;

      if ( (data_ready == 0) &&
	   (data_added == 0) )
	{
	  for (vector < Connection * >::const_iterator ci = cons.begin ();
	       ci != cons.end (); ci++)
	    (*ci)->port_ready ();

	  data_added = 1;
	  /* then, create all data connections */
	  for (vector < Process * >::const_iterator pi = session_processes.begin ();
	       pi != session_processes.end (); pi++)
	    {
	      Process *p = *pi;
	      
	      for (vector < Edge * >::const_iterator ei = p->edge_list.begin ();
		   ei != p->edge_list.end (); ei++)
		{
		  if ((DUP_PIPE == (*ei)->op) &&
		      (((*ei)->left->is_dup ()) || ((*ei)->right->is_dup ())))
		    cons.push_back (new DataConnection (p, *ei));
		}
	    }
	  end = time (NULL) + DUPD_FRESH_CONNECTION_TIMEOUT;
	}
      working = 0;      
      if (data_added == 0)
	working = 1;

      FD_ZERO (&rs);
      FD_ZERO (&ws);
      for (vector < Connection * >::const_iterator ci = cons.begin ();
           ci != cons.end (); ci++)
        (*ci)->get_fd_set (&max, &rs, &ws);
      now = time (NULL);
      if (end <= now)
        {
          fprintf (stderr, "Error: connection timeout.\n");
          break;
        }
      tv.tv_sec = end - now;
      tv.tv_usec = 0;
      int ret = select (max + 1, &rs, &ws, NULL, &tv);
      if (ret == -1)
        {
          fprintf (stderr, "select failed: %s\n", strerror (errno));
          throw "Internal error on select";
        }      
      for (vector < Connection * >::const_iterator ci = cons.begin ();
           ci != cons.end (); ci++)
        {
          (*ci)->act_fd_set (&rs, &ws);
	  if (0 != (*ci)->is_ready ())
	    working = 1;	
        }          
      if ((working == 0) && (nogoyet == 1))
	{
          /* got ready from everyone, send go! */
          nogoyet = 0;
          working = 1;
          end = time (NULL) + DUPD_FRESH_CONNECTION_TIMEOUT;
          for (vector < Connection * >::const_iterator ci = cons.begin ();
               ci != cons.end (); ci++)
            (*ci)->go (num_children);
        }
    }
  /* wait for forked cat & ssh processes */
  num_children += num_dupds;
  while (num_children > 0)
    {
      int status;
      if (-1 == waitpid (-1, &status, 0))
        {
          if (errno == EINTR)
            continue;
          fprintf (stderr, "waitpid failed: %s\n", strerror (errno));
          throw "Error on waitpid";
        }
      num_children--;
    }

  /* close connections */
  vector < Connection * >::iterator ci = cons.begin ();
  while (ci != cons.end ())
    {
      Connection *c = *ci;
      delete c;
      ci = cons.erase (ci);
    }
  cons.clear ();


}



static int
parse_options (int argc, char **argv)
{
  static struct option options[] = {
    {"code", 1, NULL, 'c'},
    {"help", 0, NULL, 'h'},
    {"version", 0, NULL, 'v'},
    {NULL, 0, NULL, 0}
  };
  int c;
  int fd;
  while (-1 != (c = getopt_long (argc, argv, "c:hv", options, NULL)))
    {
      switch (c)
        {
        case 'c':
          if (-1 == (fd = open (optarg, O_RDONLY)))
            {
              fprintf (stderr,
                       "Could not open file `%s': %s\n",
                       optarg, strerror (errno));
              return -1;
            }
          if ((-1 == (real_stdin = dup (0))) ||
              (0 != close (0)) || (-1 == (dup2 (fd, 0))) || (0 != close (fd)))
            {
              fprintf (stderr,
                       "Error initializing parser: %s\n", strerror (errno));
              return -1;
            }
          break;
        case 'h':
          printf ("dup [OPTIONS]\n"
                  "Interprets DUP code.\n"
                  "  -c, --code=FILENAME  use code from FILENAME\n"
                  "  -h, --help           print this help\n"
                  "Report bugs to %s\n"
                  "DUP home page: http://dupsystem.org/\n",
                  PACKAGE_BUGREPORT);
          return -1;
        case 'v':
          printf ("dup %s\n", PACKAGE_VERSION);
          return -1;
        }
    }
  return 0;
}


static void
catcher (int sig)
{
}

/**
 * Install a signal handler to ignore SIGPIPE.
 */
static void
DUP_ignore_sigpipe ()
{
  struct sigaction oldsig;
  struct sigaction sig;

  sig.sa_handler = &catcher;
  sigemptyset (&sig.sa_mask);
#ifdef SA_INTERRUPT
  sig.sa_flags = SA_INTERRUPT;  /* SunOS */
#else
  sig.sa_flags = SA_RESTART;
#endif
  if (0 != sigaction (SIGPIPE, &sig, &oldsig))
    fprintf (stderr,
             "Failed to install SIGPIPE handler: %s\n", strerror (errno));
}


/**
 * Actual main method.  Just a wrapper to catch
 * and report exceptions.
 */
int
main (int argc, char **argv)
{
  int ret = 0;
  DUP_ignore_sigpipe ();
  ret = parse_options (argc, argv);
  if (ret != 0)
    return ret;
  try
  {
    ret = yyparse ();
    yylex_destroy ();
    if (ret != 0)
      return 1;
    if ((0 != real_stdin) &&
        ((0 != close (0)) ||
         (-1 == dup2 (real_stdin, 0)) || (0 != close (real_stdin))))
      {
        fprintf (stderr,
                 "Failed to restore stdin after parsing: %s\n",
                 strerror (errno));
        return 1;
      }
    prepare ();
    work_main ();
  }
  catch (const char *ex)
  {
    /* for debugging only, we hopefully printed a
       NICE error message already... */
    if (strlen (ex) > 0)
      fprintf (stderr, "Caught exception `%s'\n", ex);
    ret = 1;
  }
  // free memory
  for (vector < Connection * >::const_iterator ci = cons.begin ();
       ci != cons.end (); ci++)
    delete *ci;
  for (vector < Process * >::const_iterator iter =
       session_processes.begin (); iter != session_processes.end (); ++iter)
    delete *iter;
  return ret;
}
