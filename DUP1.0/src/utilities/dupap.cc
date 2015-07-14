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
 * @file utilities/dupap.cc
 * @brief DUP Analysis Preprocessor, takes a directory assumed to be
 * holding results from runs of dupc generated configs.
 *
 * This program reads information generated from running DUP on
 * a set of configurations assumed to be created from the dprof
 * utility, which gathers all kinds of information about running
 * processes in a DUP system.  This information is aggregated and
 * written out to xml files which can then be viewed directly or
 * further processed with the dup_analysis_grapher utility for
 * graphing the data.
 *
 * @author Nathan Evans
 */

#include "../dup/process.h"
#include "../dup/dupparse.h"
#include <getopt.h>
#include <vector>
#include <iostream>
#include <fstream>
#include <dirent.h>

using namespace std;

extern vector < Process * >session_processes;
extern int yydebug;
extern "C"
{
  extern int yyparse ();
}

struct host_info
{
  char *hostname;
  unsigned int port;
};

uint64_t session_number;

#define VERBOSE 0

static char *analysis_dir;
static char *output_dir = NULL;
static FILE *outfile;
static char *config_file;
static int
parse_options (int argc, char **argv)
{
  struct stat stat_buf;
  int temp_size;
  static struct option options[] = {
    {"help", 0, NULL, 'h'},
    {"version", 0, NULL, 'v'},
    {"directory", 0, NULL, 'd'},
    {"config", 0, NULL, 'c'},
    {NULL, 0, NULL, 0}
  };
  int c;
  char *buf;

  while (-1 != (c = getopt_long (argc, argv, "c:d:hv", options, NULL)))
    {
      switch (c)
        {
				case 'c':
					config_file = optarg;
					break;
        case 'd':
          analysis_dir = optarg;
          if (stat (analysis_dir, &stat_buf) == -1)
            {
              fprintf (stderr,
                       "Could not open analysis directory `%s': %s\n",
                       output_dir, strerror (errno));
              return -1;
            }
          temp_size = snprintf (NULL, 0, "%s/data", analysis_dir) + 1;
          output_dir = (char *) malloc (temp_size);
          snprintf (output_dir, temp_size, "%s/data", analysis_dir);
          if ((stat (output_dir, &stat_buf) == -1)
              && (mkdir (output_dir, (S_IRWXU | S_IRWXG | S_IRWXO)) == -1))
            {
              fprintf (stderr,
                       "Could not open/create directory `%s': %s\n",
                       output_dir, strerror (errno));
              free (output_dir);
              return -1;
            }
          temp_size =
            snprintf (NULL, 0, "%s/data/data.xml", analysis_dir) + 1;
          buf = (char *) malloc (temp_size);
          snprintf (buf, temp_size, "%s/data/data.xml", analysis_dir);
          outfile = fopen (buf, "w");
          if (outfile == NULL)
            {
              fprintf (stderr,
                       "Could not open file `%s' for writing: %s\n",
                       optarg, strerror (errno));
              free (buf);
              return -1;
            }
          free (buf);
          break;
        case 'h':
          printf ("dupap [OPTIONS]\n"
                  "DUP Analysis Preprocessor.\n"
                  "  -d, --directory=DIR analysis directory DIR\n"
                  "  -v, --version print version\n"
									"  -c, --config=FILE config file (in base directory!) to use\n"
                  "  -h, --help           print this help\n"
                  "Report bugs to %s\n"
                  "DUP home page: http://www.dupsystem.org/\n",
                  PACKAGE_BUGREPORT);
          return -1;
        case 'v':
          printf ("dupap %s\n", PACKAGE_VERSION);
          return -1;
        case '?':
          return -1;
        }
    }
  if (output_dir == NULL)
    {
      fprintf (stderr,
               "dupap requires a valid starting directory (-d option!)\n");
      return -1;
    }
  return 0;
}


static int
write_xml_from_config ()
{
  unsigned int pos;
  fprintf (outfile, "\t<base_config>\n");
  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    {
      fprintf (outfile, "\t\t<node>\n");
      fprintf (outfile, "\t\t\t<nodename>%s</nodename>\n",
               (*iter)->process_id);
      fprintf (outfile, "\t\t\t<command>");
      for (pos = 0; pos < (*iter)->command_args.size (); pos++)
        {
          fprintf (outfile, "%s ", (*iter)->command_args[pos]);
        }
      fprintf (outfile, "</command>\n");
      fprintf (outfile,
               "\t\t\t<host_info>\n\t\t\t\t<hostname>%s</hostname>\n\t\t\t\t<port>%d</port>\n\t\t\t</host_info>\n",
               (*iter)->host_address, (*iter)->portnum);
      fprintf (outfile, "\t\t\t<edges>\n");
      fprintf (outfile, "\t\t\t\t<out_edges>\n");
      for (vector < Edge * >::iterator edge_iter =
           (*iter)->edge_list.begin ();
           edge_iter != (*iter)->edge_list.end (); ++edge_iter)
        {
          if ((*edge_iter)->op == DUP_READ)
            continue;

          fprintf (outfile, "\t\t\t\t\t<edge>\n");
          fprintf (outfile, "\t\t\t\t\t\t<to_node>%s</to_node>\n",
                   (*edge_iter)->right->name);

          switch ((*edge_iter)->op)
            {
            case DUP_PIPE:
              fprintf (outfile, "\t\t\t\t\t\t<file_name>");
              fprintf (outfile, "%s-%d_%s-%d.data", (*iter)->process_id,
                       (*edge_iter)->left->descriptor_number,
                       (*edge_iter)->right->name,
                       (*edge_iter)->right->descriptor_number);
              fprintf (outfile, "</file_name>\n");

              fprintf (outfile, "\t\t\t\t\t\t<fd>");
							fprintf (outfile, "%d", (*edge_iter)->left->descriptor_number);
							fprintf (outfile, "</fd>\n");
              break;
            case DUP_WRITE:
            case DUP_APPEND:
              fprintf (outfile, "\t\t\t\t\t\t<file_name>");
              fprintf (outfile, "%s-%d_FILE.data", (*iter)->process_id,
                       (*edge_iter)->left->descriptor_number);
              fprintf (outfile, "</file_name>\n");

              fprintf (outfile, "\t\t\t\t\t\t<fd>");
              fprintf (outfile, "%d", (*edge_iter)->left->descriptor_number);
              fprintf (outfile, "</fd>\n");
              break;
            default:
              break;
            }

          fprintf (outfile, "\t\t\t\t\t</edge>\n");
        }
      fprintf (outfile, "\t\t\t\t</out_edges>\n");

      fprintf (outfile, "\t\t\t\t<in_edges>\n");
      for (vector < Process * >::const_iterator second_iter =
           session_processes.begin ();
           second_iter != session_processes.end (); ++second_iter)
        {
          for (vector < Edge * >::iterator second_edge_iter =
               (*second_iter)->edge_list.begin ();
               second_edge_iter != (*second_iter)->edge_list.end ();
               ++second_edge_iter)
            {
              switch ((*second_edge_iter)->op)
                {
                case DUP_PIPE:
                  if (strcmp
                      ((*second_edge_iter)->right->name,
                       (*iter)->process_id) == 0)
                    {
                      fprintf (outfile,
                               "\t\t\t\t\t<edge>\n\t\t\t\t\t\t<file_name>");
                      fprintf (outfile, "%s-%d_%s-%d.data",
                               (*second_iter)->process_id,
                               (*second_edge_iter)->left->descriptor_number,
                               (*second_edge_iter)->right->name,
                               (*second_edge_iter)->right->descriptor_number);
                      fprintf (outfile, "</file_name>\n\t\t\t\t\t</edge>\n");
                    }
                  break;
                case DUP_READ:
                  if (strcmp ((*second_iter)->process_id, (*iter)->process_id)
                      == 0)
                    {
                      fprintf (outfile,
                               "\t\t\t\t\t<edge>\n\t\t\t\t\t\t<file_name>");
                      fprintf (outfile, "FILE_%s-%d.data",
                               (*iter)->process_id,
                               (*second_edge_iter)->left->descriptor_number);
                      fprintf (outfile, "</file_name>\n\t\t\t\t\t</edge>\n");
                    }
                  break;
                default:
                  break;
                }

            }
        }
      fprintf (outfile, "\t\t\t\t</in_edges>\n");
      fprintf (outfile, "\t\t\t</edges>\n");

      fprintf (outfile, "\t\t</node>\n");
    }
  fprintf (outfile, "\t</base_config>\n");
  return 1;
}


static int
write_xml_from_tee_data (char *dir, int trial)
{
  unsigned int pos;
  struct stat stat_buf;
  int temp_size;
  char *temp_char;
  char *temp_throughput_char;
  ifstream infile;
  string line;

  fprintf (outfile, "\t<tee_data>\n");
  fprintf (outfile, "\t\t<trial>%d</trial>\n", trial);
  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    {
      fprintf (outfile, "\t\t<node>\n");
      fprintf (outfile, "\t\t\t<nodename>%s</nodename>\n",
               (*iter)->process_id);
      fprintf (outfile, "\t\t\t<command>");
      for (pos = 0; pos < (*iter)->command_args.size (); pos++)
        {
          fprintf (outfile, "%s ", (*iter)->command_args[pos]);
        }
      fprintf (outfile, "</command>\n");

      fprintf (outfile, "\t\t\t<edges>\n");
      fprintf (outfile, "\t\t\t\t<out_edges>\n");
      for (vector < Edge * >::iterator edge_iter =
           (*iter)->edge_list.begin ();
           edge_iter != (*iter)->edge_list.end (); ++edge_iter)
        {
          if ((*edge_iter)->op != DUP_READ)
            {
              int temp_fd = 0;
              fprintf (outfile, "\t\t\t\t\t<edge>\n");

              temp_char = NULL;
              temp_throughput_char = NULL;
              switch ((*edge_iter)->op)
                {
                case DUP_PIPE:
                  fprintf (outfile, "\t\t\t\t\t\t<to_node>%s</to_node>\n",
                           (*edge_iter)->right->name);
                  fprintf (outfile, "\t\t\t\t\t\t<file_name>");
                  temp_fd = (*edge_iter)->left->descriptor_number;
                  temp_size =
                    snprintf (NULL, 0, "%s/%s/%s-%d_%s-%d.data", analysis_dir,
                              dir, (*iter)->process_id,
                              (*edge_iter)->left->descriptor_number,
                              (*edge_iter)->right->name,
                              (*edge_iter)->right->descriptor_number) + 1;
                  temp_char = (char *) malloc (temp_size);
                  snprintf (temp_char, temp_size, "%s/%s/%s-%d_%s-%d.data",
                            analysis_dir, dir, (*iter)->process_id,
                            (*edge_iter)->left->descriptor_number,
                            (*edge_iter)->right->name,
                            (*edge_iter)->right->descriptor_number);

                  temp_size =
                  snprintf (NULL, 0, "%s/%s/%s-%d_%s-%d_throughput.data", analysis_dir,
                            dir, (*iter)->process_id,
                            (*edge_iter)->left->descriptor_number,
                            (*edge_iter)->right->name,
                            (*edge_iter)->right->descriptor_number) + 1;
                  temp_throughput_char = (char *) malloc (temp_size);
                  snprintf (temp_throughput_char, temp_size, "%s/%s/%s-%d_%s-%d_throughput.data",
                            analysis_dir, dir, (*iter)->process_id,
                            (*edge_iter)->left->descriptor_number,
                            (*edge_iter)->right->name,
                            (*edge_iter)->right->descriptor_number);

                  fprintf (outfile, "%s-%d_%s-%d.data", (*iter)->process_id,
                           (*edge_iter)->left->descriptor_number,
                           (*edge_iter)->right->name,
                           (*edge_iter)->right->descriptor_number);
                  break;
                case DUP_WRITE:
                case DUP_APPEND:
                  fprintf (outfile, "\t\t\t\t\t\t<to_node>FILE</to_node>\n");
                  fprintf (outfile, "\t\t\t\t\t\t<file_name>");
                  temp_fd = (*edge_iter)->left->descriptor_number;
                  temp_size =
                    snprintf (NULL, 0, "%s/%s/%s-%d_FILE.data", analysis_dir,
                              dir, (*iter)->process_id,
                              (*edge_iter)->left->descriptor_number) + 1;
                  temp_char = (char *) malloc (temp_size);
                  snprintf (temp_char, temp_size, "%s/%s/%s-%d_FILE.data",
                            analysis_dir, dir, (*iter)->process_id,
                            (*edge_iter)->left->descriptor_number);
                  fprintf (outfile, "%s-%d_FILE.data", (*iter)->process_id,
                           (*edge_iter)->left->descriptor_number);

                  temp_size =
                    snprintf (NULL, 0, "%s/%s/%s-%d_FILE_throughput.data", analysis_dir,
                              dir, (*iter)->process_id,
                              (*edge_iter)->left->descriptor_number) + 1;
                  temp_throughput_char = (char *) malloc (temp_size);
                  snprintf (temp_throughput_char, temp_size, "%s/%s/%s-%d_FILE_throughput.data",
                            analysis_dir, dir, (*iter)->process_id,
                            (*edge_iter)->left->descriptor_number);
                  fprintf (outfile, "%s-%d_FILE.data", (*iter)->process_id,
                           (*edge_iter)->left->descriptor_number);
                  break;
                default:
                  break;
                }
              fprintf (outfile, "</file_name>\n");
              fprintf (outfile, "\t\t\t\t\t\t<fd>");
							fprintf (outfile, "%d", temp_fd);
							fprintf (outfile, "</fd>\n");
              if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
                {
#if VERBOSE
                  fprintf (stderr, "Couldn't open file %s\n", temp_char);
#endif
                  free (temp_char);
                }
              else if (temp_char != NULL)
                {
                  fprintf (outfile,
                           "\t\t\t\t\t\t<file_size>%llu</file_size>\n",
                           (unsigned long long) stat_buf.st_size);
                  free (temp_char);
                }

              if ((temp_throughput_char != NULL) && (stat (temp_throughput_char, &stat_buf) == -1))
                {
#if VERBOSE
                  fprintf (stderr, "Couldn't open file %s\n", temp_throughput_char);
#endif
                  free (temp_throughput_char);
                }
              else
                {
                  fprintf (outfile,
                           "\t\t\t\t\t\t<throughput_data>\n");
                  infile.open(temp_throughput_char);
                  unsigned long long second;
                  unsigned long long bytes;
                  if (infile.is_open())
                  {
                    while (!infile.eof ())
                      {
                        getline (infile, line);
                        //fprintf(stdout, "line is: %s\n", line.c_str());
                        if (sscanf
                            (line.data (), "%llu%llu", &second, &bytes) == 2)
                          {
                            fprintf (outfile,
                                     "\t\t\t\t\t\t\t<datum>\n\t\t\t\t\t\t\t\t<second>%llu</second>\n\t\t\t\t\t\t\t\t<bytes>%llu</bytes>\n\t\t\t\t\t\t\t</datum>\n",
                                     second, bytes);
                          }
                      }
                    infile.close();
                  }
                  fprintf (outfile,
                           "\t\t\t\t\t\t</throughput_data>\n");
                  free (temp_throughput_char);
                }
              fprintf (outfile, "\t\t\t\t\t</edge>\n");
            }
        }
      fprintf (outfile, "\t\t\t\t</out_edges>\n");
      fprintf (outfile, "\t\t\t\t<in_edges>\n");
      for (vector < Process * >::const_iterator second_iter =
           session_processes.begin ();
           second_iter != session_processes.end (); ++second_iter)
        {
          for (vector < Edge * >::iterator second_edge_iter =
               (*second_iter)->edge_list.begin ();
               second_edge_iter != (*second_iter)->edge_list.end ();
               ++second_edge_iter)
            {
              temp_char = NULL;
              switch ((*second_edge_iter)->op)
                {
                case DUP_PIPE:
                  if (strcmp
                      ((*second_edge_iter)->right->name,
                       (*iter)->process_id) == 0)
                    {
                      fprintf (outfile,
                               "\t\t\t\t\t<edge>\n\t\t\t\t\t\t<file_name>");
                      fprintf (outfile, "%s-%d_%s-%d.data",
                               (*second_iter)->process_id,
                               (*second_edge_iter)->left->descriptor_number,
                               (*second_edge_iter)->right->name,
                               (*second_edge_iter)->right->descriptor_number);
                      fprintf (outfile, "</file_name>\n");
                      temp_size =
                        snprintf (NULL, 0, "%s/%s/%s-%d_%s-%d.data",
                                  analysis_dir, dir,
                                  (*second_iter)->process_id,
                                  (*second_edge_iter)->
                                  left->descriptor_number,
                                  (*second_edge_iter)->right->name,
                                  (*second_edge_iter)->
                                  right->descriptor_number) + 1;
                      temp_char = (char *) malloc (temp_size);
                      snprintf (temp_char, temp_size,
                                "%s/%s/%s-%d_%s-%d.data", analysis_dir, dir,
                                (*second_iter)->process_id,
                                (*second_edge_iter)->left->descriptor_number,
                                (*second_edge_iter)->right->name,
                                (*second_edge_iter)->
                                right->descriptor_number);
                    }
                  break;
                case DUP_READ:
                  break;
                  /* FIXME: Why is there a break before this code? */
                  /*
                  if (strcmp ((*second_iter)->process_id, (*iter)->process_id)
                      == 0)
                    {
                      fprintf (outfile,
                               "\t\t\t\t\t<edge>\n\t\t\t\t\t\t<file_name>");
                      fprintf (outfile, "FILE_%s-%d.data",
                               (*iter)->process_id,
                               (*second_edge_iter)->left->descriptor_number);
                      fprintf (outfile, "</file_name>\n");
                      temp_size =
                        snprintf (NULL, 0, "%s/%s/FILE_%s-%d.data",
                                  analysis_dir, dir,
                                  (*second_edge_iter)->right->name,
                                  (*second_edge_iter)->
                                  right->descriptor_number) + 1;
                      temp_char = (char *) malloc (temp_size);
                      snprintf (temp_char, temp_size, "%s/%s/FILE_%s-%d.data",
                                analysis_dir, dir,
                                (*second_edge_iter)->right->name,
                                (*second_edge_iter)->
                                right->descriptor_number);
                    }
                  break;
                  */
                default:
                  break;
                }
              if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
                {
#if VERBOSE
                  fprintf (stderr, "Couldn't open file %s\n", temp_char);
#endif
                  free (temp_char);
                }
              else if (temp_char != NULL)
                {
                  fprintf (outfile,
                           "\t\t\t\t\t\t<file_size>%llu</file_size>\n",
                           (unsigned long long) stat_buf.st_size);

                  free (temp_char);
                }
              if (temp_char != NULL)
                fprintf (outfile, "\t\t\t\t\t</edge>\n");
            }
        }
      fprintf (outfile, "\t\t\t\t</in_edges>\n");
      fprintf (outfile, "\t\t\t</edges>\n");

      /* Read from strace file */
      temp_size =
        snprintf (NULL, 0, "%s/%s/%s.strace", analysis_dir, dir,
                  (*iter)->process_id) + 1;
      temp_char = (char *) malloc (temp_size);
      snprintf (temp_char, temp_size, "%s/%s/%s.strace", analysis_dir, dir,
                (*iter)->process_id);
      if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
        {
#if VERBOSE
          fprintf (stderr,
                   "Couldn't open file %s\n, will not write strace info\n",
                   temp_char);
#endif
        }
      else if ((unsigned long long) stat_buf.st_size > 0)
        {
          infile.open (temp_char);
          float percent_time;
          float seconds;
          int msecs;
          int calls;
          int errors;
          char syscall[100];

          if (infile.is_open ())
            {
              fprintf (outfile, "\t\t\t<syscalls>\n");
              while (!infile.eof ())
                {
                  getline (infile, line);
                  //fprintf(stdout, "line is: %s\n", line.c_str());
                  if (sscanf
                      (line.data (), "%f%f%d%d%d%s", &percent_time, &seconds,
                       &msecs, &calls, &errors, syscall) == 6)
                    {

                      //fprintf(stderr, "percent_time: %f secs: %f msecs: %d calls: %d errors: %d syscall: %s\n", percent_time, seconds, msecs, calls, errors, syscall);
                      fprintf (outfile,
                               "\t\t\t\t<syscall>\n\t\t\t\t\t<seconds>%f</seconds>\n\t\t\t\t\t<call>%s</call>\n\t\t\t\t\t<numcalls>%d</numcalls>\n\t\t\t\t\t<percent_time>%f</percent_time>\n",
                               seconds, syscall, calls, percent_time);
                      fprintf (outfile, "\t\t\t\t</syscall>\n");
                    }
                  else
                    if (sscanf
                        (line.c_str (), "%f%f%d%d%s", &percent_time, &seconds,
                         &msecs, &calls, syscall) == 5)
                    {
                      //fprintf(stderr, "percent_time: %f secs: %f musecs: %d calls: %d call: %s\n", percent_time, seconds, msecs, calls, syscall);
                      fprintf (outfile,
                               "\t\t\t\t<syscall>\n\t\t\t\t\t<seconds>%f</seconds>\n\t\t\t\t\t<call>%s</call>\n\t\t\t\t\t<numcalls>%d</numcalls>\n\t\t\t\t\t<percent_time>%f</percent_time>\n",
                               seconds, syscall, calls, percent_time);
                      fprintf (outfile, "\t\t\t\t</syscall>\n");
                    }

                }
              fprintf (outfile, "\t\t\t</syscalls>\n");
              infile.close ();
            }
        }
      free (temp_char);

      /* Read from time file */
      temp_size =
        snprintf (NULL, 0, "%s/%s/%s.time", analysis_dir, dir,
                  (*iter)->process_id) + 1;
      temp_char = (char *) malloc (temp_size);
      snprintf (temp_char, temp_size, "%s/%s/%s.time", analysis_dir, dir,
                (*iter)->process_id);
      if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
        {
#if VERBOSE
          fprintf (stderr,
                   "Couldn't open file %s, will not write time info\n",
                   temp_char);
#endif
        }
      else if ((unsigned long long) stat_buf.st_size > 0)
        {
          float User, System;
          char Elapsed[100];
          float PercentageCPU, ResMMax, ResMAvg, MAvg;
          int NumSwaps, Waits, FileOuts, FileIns, SockOuts, SockIns;
          infile.open (temp_char);
          if (infile.is_open ())
            {
              fprintf (outfile, "\t\t\t<timing_info>\n");
              while (!infile.eof ())
                {
                  getline (infile, line);
                  if (line.find ('%') != line.npos)
                    line.replace (line.find ('%'), 1, " ");
                  if (sscanf
                      (line.c_str (), "%f%f%s%f%f%f%f%d%d%d%d%d%d", &User,
                       &System, Elapsed, &PercentageCPU, &ResMMax, &ResMAvg,
                       &MAvg, &NumSwaps, &Waits, &FileOuts, &FileIns,
                       &SockOuts, &SockIns) > 1)
                    {
                      fprintf (outfile,
                               "\t\t\t\t<usertime>%f</usertime>\n\t\t\t\t<systime>%f</systime>\n\t\t\t\t<elapsed>%s</elapsed>\n\t\t\t\t<percentcpu>%f</percentcpu>\n\t\t\t\t<numswaps>%d</numswaps>\n",
                               User, System, Elapsed, PercentageCPU,
                               NumSwaps);
                    }
                }
              infile.close ();
              fprintf (outfile, "\t\t\t</timing_info>\n");
            }
        }
      free (temp_char);

      /* Read from tee poll files */
      temp_size =
        snprintf (NULL, 0, "%s/%s/%s.newpsdata", analysis_dir, dir,
                  (*iter)->process_id) + 1;
      temp_char = (char *) malloc (temp_size);
      snprintf (temp_char, temp_size, "%s/%s/%s.newpsdata", analysis_dir, dir,
                (*iter)->process_id);
      if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
        {
#if VERBOSE
          fprintf (stderr,
                   "Couldn't open file %s, will not write time info\n",
                   temp_char);
#endif
        }
      else if ((unsigned long long) stat_buf.st_size > 0)
        {
          vector < string > temp_string;

          infile.open (temp_char);
          if (infile.is_open ())
            {
              fprintf (outfile, "\t\t\t<poll_info>\n");
              getline (infile, line);

              while (!infile.eof ())
                {
                  temp_string.clear ();
                  getline (infile, line);
                  if (((int) line.find ("defunct", 0) < 0) && (line.length() > 0))
                    {
                      int prev_pos = 0;
                      int pos = line.find (' ', 0);
                      while ((pos > 0))
                        {
                          if (line.compare (prev_pos, 1, " ") == 0)
                            temp_string.push_back (line.
                                                   substr (prev_pos + 1,
                                                           pos - (prev_pos +
                                                                  1)));
                          else
                            temp_string.push_back (line.
                                                   substr (prev_pos,
                                                           pos - prev_pos));
                          prev_pos = pos;
                          pos = line.find (' ', pos + 1);
                          while ((pos > 0) && (pos == prev_pos + 1))
                            {
                              prev_pos = pos;
                              pos = pos + 1;
                              pos = line.find (' ', pos);
                            }
                        }
                      if ((int) line.length () > 0)
                        temp_string.push_back (line.substr (prev_pos + 1));
                      fprintf (outfile,
                               "\t\t\t\t<info>\n\t\t\t\t\t<date>%s</date>\n\t\t\t\t\t<time>%s</time>\n\t\t\t\t\t<percent_cpu>%s</percent_cpu>\n\t\t\t\t\t<percent_mem>%s</percent_mem>\n\t\t\t\t\t<cpu_time>%s</cpu_time>\n\t\t\t\t\t<elapsed_time>%s</elapsed_time>\n\t\t\t\t\t<mem_resident>%s</mem_resident>\n\t\t\t\t\t<mem_core>%s</mem_core>\n\t\t\t\t\t<mem_virtual>%s</mem_virtual>\n\t\t\t\t</info>\n",
                               temp_string[0].c_str (),
                               temp_string[1].c_str (),
                               temp_string[3].c_str (),
                               temp_string[4].c_str (),
                               temp_string[5].c_str (),
                               temp_string[6].c_str (),
                               temp_string[7].c_str (),
                               temp_string[8].c_str (),
                               temp_string[9].c_str ());
                    }
                }
              infile.close ();
              fprintf (outfile, "\t\t\t</poll_info>\n");
            }
        }
      free (temp_char);


      /* Read from tee poll files */
      temp_size =
        snprintf (NULL, 0, "%s/%s/%s_hosts_replaced.newpsdata", analysis_dir, dir,
                  (*iter)->process_id) + 1;
      temp_char = (char *) malloc (temp_size);
      snprintf (temp_char, temp_size, "%s/%s/%s_hosts_replaced.newpsdata", analysis_dir, dir,
                (*iter)->process_id);
      if ((temp_char != NULL) && (stat (temp_char, &stat_buf) == -1))
        {
#if VERBOSE
          fprintf (stderr,
                   "Couldn't open file %s, will not write time info\n",
                   temp_char);
#endif
        }
      else if ((unsigned long long) stat_buf.st_size > 0)
        {
          vector < string > temp_string;

          infile.open (temp_char);
          if (infile.is_open ())
            {
              fprintf (outfile, "\t\t\t<hosts_replaced_poll_info>\n");
              getline (infile, line);

              while (!infile.eof ())
                {
                  temp_string.clear ();
                  getline (infile, line);
                  if (((int) line.find ("defunct", 0) < 0) && (line.length() > 0))
                    {
                      int prev_pos = 0;
                      int pos = line.find (' ', 0);
                      while ((pos > 0))
                        {
                          if (line.compare (prev_pos, 1, " ") == 0)
                            temp_string.push_back (line.
                                                   substr (prev_pos + 1,
                                                           pos - (prev_pos +
                                                                  1)));
                          else
                            temp_string.push_back (line.
                                                   substr (prev_pos,
                                                           pos - prev_pos));
                          prev_pos = pos;
                          pos = line.find (' ', pos + 1);
                          while ((pos > 0) && (pos == prev_pos + 1))
                            {
                              prev_pos = pos;
                              pos = pos + 1;
                              pos = line.find (' ', pos);
                            }
                        }
                      if ((int) line.length () > 0)
                        temp_string.push_back (line.substr (prev_pos + 1));
                      fprintf (outfile,
                               "\t\t\t\t<info>\n\t\t\t\t\t<date>%s</date>\n\t\t\t\t\t<time>%s</time>\n\t\t\t\t\t<percent_cpu>%s</percent_cpu>\n\t\t\t\t\t<percent_mem>%s</percent_mem>\n\t\t\t\t\t<cpu_time>%s</cpu_time>\n\t\t\t\t\t<elapsed_time>%s</elapsed_time>\n\t\t\t\t\t<mem_resident>%s</mem_resident>\n\t\t\t\t\t<mem_core>%s</mem_core>\n\t\t\t\t\t<mem_virtual>%s</mem_virtual>\n\t\t\t\t</info>\n",
                               temp_string[0].c_str (),
                               temp_string[1].c_str (),
                               temp_string[3].c_str (),
                               temp_string[4].c_str (),
                               temp_string[5].c_str (),
                               temp_string[6].c_str (),
                               temp_string[7].c_str (),
                               temp_string[8].c_str (),
                               temp_string[9].c_str ());
                    }
                }
              infile.close ();
              fprintf (outfile, "\t\t\t</hosts_replaced_poll_info>\n");
            }
        }
      free (temp_char);
      fprintf (outfile, "\t\t</node>\n");

    }
  fprintf (outfile, "\t</tee_data>\n");

  return 1;
}

static bool
in_vector (vector < string > to_search, string to_find)
{
  for (vector < string >::const_iterator iter = to_search.begin ();
       iter != to_search.end (); ++iter)
    {
      if (to_find.compare (*iter) == 0)
        return true;
    }
  return false;
}

static int
write_xml_from_cpu_data (char *dir)
{
  struct stat stat_buf;
  string temp_string;
  ifstream infile;
  string line;

  vector < string > seen_list;

  fprintf (outfile, "\t<cpu_data>\n");
  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    {
      for (vector < Process * >::const_iterator second_iter =
           session_processes.begin ();
           second_iter != session_processes.end (); ++second_iter)
        {
          temp_string.clear ();
          temp_string += dir;
          temp_string += "/cpu_data/";
          temp_string += (*iter)->host_address;
          temp_string += "_cpuinfo.data";
          char label[100];
          char label2[100];
          bool processor = false;
          int value;
          if (!in_vector (seen_list, temp_string)
              && (stat (temp_string.c_str (), &stat_buf) != -1))
            {
              infile.open (temp_string.c_str ());
              if (infile.is_open ())
                {
                  fprintf (outfile, "\t\t<cpuinfo>\n");
                  fprintf (outfile, "\t\t\t<host>%s</host>\n",
                           (*iter)->host_address);
                  getline (infile, line);

                  while (!infile.eof ())
                    {
                      if (sscanf (line.c_str (), "%s : %d", label, &value) ==
                          2)
                        {
                          if ((strcmp (label, "processor") == 0)
                              && (processor == false))
                            {
                              fprintf (outfile, "\t\t\t<cpu>\n");
                              processor = true;
                            }
                          else if ((strcmp (label, "processor") == 0)
                                   && (processor))
                            {
                              fprintf (outfile,
                                       "\t\t\t</cpu>\n\t\t\t<cpu>\n");
                            }
                          fprintf (outfile, "\t\t\t\t<%s>%d</%s>\n", label,
                                   value, label);
                        }
                      else
                        if (sscanf
                            (line.c_str (), "%s %s : %d", label, label2,
                             &value) == 3)
                        {
                          fprintf (outfile, "\t\t\t\t<%s_%s>%d</%s_%s>\n",
                                   label, label2, value, label, label2);
                        }
                      getline (infile, line);
                    }
                  fprintf (outfile, "\t\t\t</cpu>\n\t\t</cpuinfo>\n");
                }
              infile.close ();
              seen_list.push_back (temp_string);
            }
        }
    }
  fprintf (outfile, "\t</cpu_data>\n");

  return 1;
}

static int
write_xml_from_net_data (char *dir)
{
  struct stat stat_buf;
  string temp_string;
  ifstream infile;
  string line;
  int check;
  unsigned int bytes;
  float seconds;

  vector < string > seen_list;

  fprintf (outfile, "\t<network_data>\n");
  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    {
      for (vector < Process * >::const_iterator second_iter =
           session_processes.begin ();
           second_iter != session_processes.end (); ++second_iter)
        {
          temp_string.clear ();
          temp_string += dir;
          temp_string += "/network_data/";
          temp_string += (*iter)->host_address;
          temp_string += "-";
          temp_string += (*second_iter)->host_address;
          temp_string += ".data";

          if ((!in_vector (seen_list, temp_string))
              && (stat (temp_string.c_str (), &stat_buf) != -1))
            {
              infile.open (temp_string.c_str ());
              if (infile.is_open ())
                {
                  getline (infile, line);
                  while (!infile.eof ())
                    {
                      check = 0;
                      check = sscanf (line.c_str (), "%u bytes", &bytes);
                      line.erase (0, line.find_first_of (',', 0) + 2);
                      check += sscanf (line.c_str (), "%f seconds", &seconds);
                      if (check > 0)
                        {
                          fprintf (outfile,
                                   "\t\t<datum>\n\t\t\t<from_host>%s</from_host>\n\t\t\t<to_host>%s</to_host>\n\t\t\t<bytes>%u</bytes>\n\t\t\t<seconds>%f</seconds>\n\t\t</datum>\n",
                                   (*iter)->host_address,
                                   (*second_iter)->host_address, bytes,
                                   seconds);
                        }
                      getline (infile, line);
                    }
                }
              infile.close ();
              seen_list.push_back (temp_string);
            }
        }
    }
  fprintf (outfile, "\t</network_data>\n");

  return 1;
}

int
main (int argc, char **argv)
{
  vector < Process * >original_session_processes;
  int ret;
  int temp_num;
  int num_dirs;
  int i;
  char *temp_char;
  struct dirent **namelist;
  int temp_size;
  int fd;
  char *buf;
  config_file = strdup("original.conf");
  ret = parse_options (argc, argv);

  temp_size =
    snprintf (NULL, 0, "%s/%s", analysis_dir, config_file) + 1;
  buf = (char *) malloc (temp_size);
  snprintf (buf, temp_size, "%s/%s", analysis_dir, config_file);
  if (-1 == (fd = open (buf, O_RDONLY)))
    {
      fprintf (stderr,
               "Could not open file `%s': %s\n",
               buf, strerror (errno));
      free (buf);
      return -1;
    }
  if ((0 != close (0)) || (-1 == (dup2 (fd, 0))) || (0 != close (fd)))
    {
      fprintf (stderr,
               "Error dup'ing streams: %s\n", strerror (errno));
      free (buf);
      return -1;
    }

  free (buf);

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

  fprintf (outfile, "<dup_analysis>\n");
  write_xml_from_config ();

  num_dirs = scandir (analysis_dir, &namelist, 0, alphasort);

  for (i = 0; i < num_dirs; i++)
    {
      if (namelist[i]->d_type == 4)
        {
          if (strstr (namelist[i]->d_name, "base_tee_data"))
            {
              temp_char = strstr (namelist[i]->d_name, "-");
              temp_num = atoi (&temp_char[1]);
              write_xml_from_tee_data (namelist[i]->d_name, temp_num);
              //fprintf(stderr, "%s num: %s as num: %d\n", namelist[i]->d_name, temp_char, temp_num);
            }
        }
    }

  temp_size =
    snprintf (NULL, 0, "%s/%s", analysis_dir, "tee-0.conf") + 1;
  buf = (char *) malloc (temp_size);
  snprintf (buf, temp_size, "%s/%s", analysis_dir, "tee-0.conf");
  if (-1 == (fd = open (buf, O_RDONLY)))
    {
      fprintf (stderr,
               "Could not open file `%s': %s\n",
               buf, strerror (errno));
      free (buf);
      return -1;
    }
  if ((0 != close (0)) || (-1 == (dup2 (fd, 0))) || (0 != close (fd)))
    {
      fprintf (stderr,
               "Error dup'ing streams: %s\n", strerror (errno));
      free (buf);
      return -1;
    }

  free (buf);

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

  write_xml_from_net_data (analysis_dir);
  write_xml_from_cpu_data (analysis_dir);
  fprintf (outfile, "</dup_analysis>\n");

  fclose (outfile);
  return 0;
}
