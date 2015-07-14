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
 * @file utilities/dup_dot_printer.cc
 * @author Nathan Evans
 * @brief Outputs dot compatible graph files for viewing dup configs
 *
 */

#include "../dup/process.h"
#include "../dup/dupparse.h"
#include "../dup/strnfuncs.h"
#include <getopt.h>
#include <vector>
#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

extern vector < Process * >session_processes;
extern int yydebug;
extern "C"
{
  extern int yyparse ();
}

uint64_t session_number;
static char *config_file = NULL;
static char *outfile_name;
static FILE *outfile;
static bool run_dot;
static int real_stdin;
static bool show_args = true;
static bool nolabel = false;

static int
parse_options (int argc, char **argv)
{
  static struct option options[] = {
    {"config", 1, NULL, 'c'},
    {"help", 0, NULL, 'h'},
    {"version", 0, NULL, 'v'},
    {"outfile", 1, NULL, 'o'},
    {"rundot", 0, NULL, 'r'},
    {"hideargs", 0, NULL, 'a'},
    {"nolabel", 0, NULL, 'n'},
    {NULL, 0, NULL, 0}
  };
  int c;
  int fd;

  while (-1 != (c = getopt_long (argc, argv, "o:c:hvran", options, NULL)))
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
                       "Error dup'ing streams: %s\n", strerror (errno));
              return -1;
            }
          config_file = optarg;
          break;
        case 'o':
          outfile_name = optarg;
          outfile = fopen (optarg, "w");
          if (outfile == NULL)
            {
              fprintf (stderr,
                       "Could not open file `%s': %s\n",
                       optarg, strerror (errno));
              return -1;
            }
          break;
        case 'r':
          run_dot = true;
          break;
        case 'n':
          nolabel = true;
          break;
        case 'h':
          fprintf (stdout,
                   "usage: dup_dot_printer [-c <dup file>|--config=<dup file>] [-o <out file>|--outfile=<out file>] [-r|--rundot] [-a|--hideargs] [-a|--nolabel] [-v] [-h]\n");
          return -1;
        case 'v':
          printf ("dup_dot_printer %s\n", PACKAGE_VERSION);
          return -1;
        case 'a':
          show_args = false;
          break;
        case '?':
          return -1;
        }
    }
  return 0;
}


int
main (int argc, char **argv)
{
  string graph_output;
  int ret;

  ret = parse_options (argc, argv);
  if (ret != 0)
    return ret;

  try
  {
    if (yyparse () != 0)
      return 1;
  }
  catch (const char *ex)
  {
    fprintf (stderr, "Caught exception `%s'\n", ex);
    return 1;
  }

  graph_output += strdup ("digraph G {\n");
  for (vector < Process * >::const_iterator ii = session_processes.begin ();
       ii != session_processes.end (); ii++)
    {
      graph_output += "\t\"";
      graph_output += (*ii)->process_id;
      graph_output += "\" [label=\"";
      if (!nolabel)
        graph_output += (*ii)->process_id;
      if ((show_args) && (!nolabel))
        {
          graph_output += ":";
          for (unsigned int i = 0; i < (*ii)->command_args.size (); ++i)
            {
              graph_output += " ";
              graph_output += (*ii)->command_args[i];
            }
        }
      graph_output += "\"];\n";

      for (vector < Edge * >::const_iterator new_edge_iter =
           (*ii)->edge_list.begin ();
           new_edge_iter != (*ii)->edge_list.end (); ++new_edge_iter)
        {
          switch ((*new_edge_iter)->op)
            {
            case DUP_WRITE:
            case DUP_APPEND:
            case DUP_PIPE:
              if ((*new_edge_iter)->left->is_dup ())
                {
                  // special case for the DUP process
                  graph_output += "\t\"";
                  graph_output += (*new_edge_iter)->left->name;
                  stringstream ss;
                  ss << ":" << (*new_edge_iter)->left->descriptor_number;
                  graph_output += ss.str ();
                  graph_output += "\" -> \"";
                  graph_output += (*ii)->process_id;
                  graph_output += "\";\n";
                  if (nolabel)
                    {
                      graph_output += "\t\"";
                      graph_output += ss.str ();
                      graph_output += "\" [label=\"\"];\n";
                      graph_output += "\t\"";
                      graph_output += (*ii)->process_id;
                      graph_output += "\" [label=\"\"];\n";
                    }
                }
              else
                {
                  graph_output += "\t\"";
                  graph_output += (*ii)->process_id;
                  graph_output += "\" -> \"";
                  stringstream ss;
                  ss << (*new_edge_iter)->right->name;
                  if ((*new_edge_iter)->right->is_dup ())
                    ss << ":" << (*new_edge_iter)->right->descriptor_number;
                  graph_output += ss.str ();
                  graph_output += "\";\n";
                  if (nolabel)
                    {
                      graph_output += "\t\"";
                      graph_output += ss.str ();
                      graph_output += "\" [label=\"\"];\n";
                      graph_output += "\t\"";
                      graph_output += (*ii)->process_id;
                      graph_output += "\" [label=\"\"];\n";
                    }
                }
              break;
            case DUP_READ:
              graph_output += "\t\"";
              if ((*new_edge_iter)->right->name != NULL)
              	graph_output += (*new_edge_iter)->right->name;
              graph_output += "\" -> \"";
              graph_output += (*ii)->process_id;
              graph_output += "\";\n";
              if (nolabel)
                {
                  graph_output += "\t\"";
                  graph_output += (*ii)->process_id;
                  graph_output += "\" [label=\"\"];\n";
                  graph_output += "\t\"";
                  graph_output += (*new_edge_iter)->right->name;
                  graph_output += "\" [label=\"\"];\n";
                }
              break;
            default:
              break;
            }
        }
    }
  graph_output += strdup ("}");
  if (outfile != NULL)
    {
      fprintf (outfile, "%s\n", graph_output.data ());
      fclose (outfile);
      if (run_dot == true)
        {
          fprintf (stdout, "Running dot!\n");
          stringstream ss;
          ss << "dot -Tpng " << outfile_name << " -o " << outfile_name <<
            ".png";
          ret = system (ss.str ().c_str ());
        }
    }
  else
    {
      fprintf (stdout, "%s\n", graph_output.data ());
    }
  return ret;
}
