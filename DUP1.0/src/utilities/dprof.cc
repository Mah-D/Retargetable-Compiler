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
 * @file utilities/dprof.cc
 * @author Nathan Evans
 * @brief Entry point for profiling and smart dup configurator,
 * mainly handles config file mangling.
 *
 * dprof is meant to be the first program run when analyzing the
 * performance of a DUP System.  Given a dup configuration, dprof
 * can do a number of things.  In the most basic case, dprof -c
 * CONFIG will pretty print a dup configuration.  With the -R flag
 * all host:port information will be removed from the config file
 * and the resulting host agnostic config will be printed on
 * stdout.  Given the -W FILE option the host:port information
 * will be appended to FILE.  Given the -A FILE option reverses,
 * host:port information will attempt to be read from FILE and
 * integrated into the configuration.  If more lines exist in the
 * config than are present in FILE, they will be looped through.
 * This can be useful for specifying an initial configuration and
 * hosts separately and ''evenly'' spreading the work between
 * multiple hosts/processes.
 *
 * When the -R option is used host:port information will be
 * replaced with localhost:8888 by default, a different host and
 * port can be given with the -H HOST -p PORT options.
 *
 * The -T DIR and -t options concern capturing all data that is sent
 * between nodes in a dup config. "Teeing" a config means splitting
 * the edge of nodes and sending data not only as specified in the
 * dup config but also to a file for later analysis or playback.
 * By default the -t option will create a single "teed" config and
 * write it to /tmp/tee-0.conf, given the -T DIR option the teed
 * config is written to DIR/tee-0.conf.  Specifying the -n NUM
 * option will write NUM teed configs instead of just one (numbered
 * from 0 to NUM - 1). dprof also will attempt to create directories
 * base_tee_data-0 to base_tee_data-{NUM - 1} to store the data that
 * is generated when the tee-X.conf configs are run.  When teeing
 * the config, if the HOST:PORT for a given line do not
 * match the default (localhost:8888 by default or as specified by
 * -H -p) then the teed configs are created such that data will be
 * streamed back to a dupd running on HOST:PORT (Note that if the
 * -R option is given HOST:PORT always match the default).
 *
 * Specifying the -P option creates dup configs to drive each
 * filter in the original dup config in isolation to derive timing,
 * processor usage, system calls, etc. This option should typically
 * only be used when the -T or -t option is also used, as the
 * configs created rely on data generated from running the teed
 * configs.  Two new configs are created in the base_tee_data
 * directories for _each_ node specified in the original config,
 * one for 'time' data and one for 'strace' data.
 *
 */

#include "../dup/process.h"
#include "../dup/dupparse.h"
#include <getopt.h>
#include <vector>
#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <algorithm>

#define BIO_HACK 0

using namespace std;

extern vector<Process *> session_processes;
extern int yydebug;
extern "C"
{
  extern int
  yyparse();
}

struct host_info
{
  char *hostname;
  unsigned int port;
};

uint64_t session_number;

/**
 * Actual FD of stdin (in case we dup'ed away the old
 * one for parsing).
 */
static int real_stdin;
static const char *localhost;
static int default_port = 55555;
static int num_tees = -1;
static bool remove_hosts;
static bool add_hosts;
static bool write_hosts;
static bool have_dir;
static bool do_tee;
static bool do_timing;
static bool do_monitor;
static bool old_dup_style;
static bool do_network;
static bool do_cpu;
static bool wait_on_dupd;
static bool optimize_fanouts;
static bool poll_hosts_replaced;
static bool dont_save;
static FILE *outfile;
static FILE *infile;

static char *output_dir = NULL;
static char *tee_dir = NULL;
static char *config_file = NULL;

static int
parse_options(int argc, char **argv)
{
  localhost = "localhost";
  struct stat stat_buf;
  int temp_size;
  static struct option options[] =
    {
      { "add-hosts", 0, NULL, 'A' },
      { "cpu-info", 0, NULL, 'C' },
      { "dont-save", 0, NULL, 'D' },
      { "hostname", 0, NULL, 'H' },
      { "network-info", 0, NULL, 'N' },
      { "old-dup", 0, NULL, 'O' },
      { "process-info", 0, NULL, 'P' },
      { "remove-hosts", 0, NULL, 'R' },
      { "tee-dir", 0, NULL, 'T' },
      { "write-hosts", 0, NULL, 'W' },
      { "config", 1, NULL, 'c' },
      { "output-dir", 0, NULL, 'd' },
      { "help", 0, NULL, 'h' },
      { "optimize-fanouts", 0, NULL, 'f' },
      { "monitor", 0, NULL, 'm' },
      { "num-tees", 0, NULL, 'n' },
      { "port", 0, NULL, 'p' },
      { "poll-replaced", 0, NULL, 'r' },
      { "tee", 0, NULL, 't' },
      { "version", 0, NULL, 'v' },
      { "wait-on-dupd", 0, NULL, 'w' },
      { NULL, 0, NULL, 0 } };
  int c;
  int fd;

  while (-1 != (c = getopt_long(argc, argv, "ONCmDPp:c:H:A:W:T:n:d:hvfwtRr",
      options, NULL)))
    {
      switch (c)
        {
      case 'c':
        if (-1 == (fd = open(optarg, O_RDONLY)))
          {
            fprintf(stderr, "Could not open file `%s': %s\n", optarg, strerror(
                errno));
            return -1;
          }
        if ((-1 == (real_stdin = dup(0))) || (0 != close(0)) || (-1 == (dup2(
            fd, 0))) || (0 != close(fd)))
          {
            fprintf(stderr, "Error dup'ing streams: %s\n", strerror(errno));
            return -1;
          }
        config_file = optarg;
        break;
      case 'A':
        infile = fopen(optarg, "r");
        if (infile == NULL)
          {
            fprintf(stderr, "Could not open file `%s': %s\n", optarg, strerror(
                errno));
            return -1;
          }
        add_hosts = true;
        remove_hosts = true;
        break;
      case 'W':
        outfile = fopen(optarg, "a");
        if (outfile == NULL)
          {
            fprintf(stderr, "Could not open file `%s': %s\n", optarg, strerror(
                errno));
            return -1;
          }
        write_hosts = true;
        remove_hosts = true;
        break;
      case 'w':
        wait_on_dupd = true;
        break;
      case 'f':
        optimize_fanouts = true;
        break;
      case 'r':
        poll_hosts_replaced = true;
        break;
      case 'd':
        output_dir = strdup(optarg);
        have_dir = true;
        break;
      case 'D':
        dont_save = true;
        break;
      case 'T':
        output_dir = strdup(optarg);
        temp_size = snprintf(NULL, 0, "%s/base_tee_data/", output_dir);
        tee_dir = (char *) malloc(temp_size + 1);
        snprintf(tee_dir, temp_size + 1, "%s/base_tee_data/", output_dir);

        if ((stat(output_dir, &stat_buf) == -1) && (mkdir(output_dir, (S_IRWXU
            | S_IRWXG | S_IRWXO)) == -1))
          {
            fprintf(stderr, "Could not open/create directory `%s': %s\n",
                output_dir, strerror(errno));
            return -1;
          }

        do_tee = 1;
        have_dir = 1;
        if (num_tees == -1)
          num_tees = 1;
        break;
      case 'H':
        localhost = optarg;
        break;
      case 't':
        tee_dir = strdup("/tmp/");
        have_dir = true;
        do_tee = true;
        if (num_tees == -1)
          num_tees = 1;
        break;
      case 'm':
        do_monitor = true;
        break;
      case 'P':
        do_timing = true;
        break;
      case 'O':
        old_dup_style = true;
        break;
      case 'N':
        do_network = true;
        break;
      case 'C':
        do_cpu = true;
        break;
      case 'n':
        num_tees = atoi(optarg);
        if (num_tees < 1)
          {
            fprintf(stderr, "Got bad number for --num-tees (-n) `%d': %s\n",
                num_tees, strerror(errno));
            return -1;
          }
        break;
      case 'p':
        default_port = atoi(optarg);
        if (default_port < 1)
          {
            fprintf(stderr, "Got bad number for --port (-p) `%d': %s\n",
                default_port, strerror(errno));
            return -1;
          }
        else
          {
            fprintf(stderr, "setting default port to %d\n", default_port);
          }
        break;
      case 'R':
        remove_hosts = true;
        break;
      case 'h':
        printf(
            "dprof [OPTIONS]\n"
              "Mangles DUP configs.\n"
              "  -c, --config=FILENAME use config from FILENAME\n"
              "  -R, --remove-hosts remove hosts from config\n"
              "  -A, --add-hosts=FILENAME add hosts to config from FILENAME\n"
              "  -W, --write-hosts=FILENAME write hosts from config to FILENAME\n"
              "  -T, --tee-prepare=DIR augment config with tee's to prepare for data gathering in DIR\n"
              "  -t, --tee augment config with tee's for data gathering and print to stdout\n"
              "  -D, --dont-save when teeing, don't actually save data"
              "  -n, --num-tees number of tee configs to output (for non-deterministic data)\n"
              "  -H, --host specify hostname to use instead of default (localhost)\n"
              "  -p, --port specify port to use instead of default port\n"
              "  -O, --old-dup create configurations for the old python version of dup\n"
              "  -P, --process-info also collect process info via time and strace\n"
              "  -m, --monitor monitor processes for real time cpu and memory information\n"
              "  -N, --network-info output configs for retrieving send/receive rates between nodes\n"
              "  -C, gather processor information from each host used"
              "  -h, --help           print this help\n"
              "Report bugs to %s\n"
              "DUP home page: http://www.dupsystem.org/\n", PACKAGE_BUGREPORT);
        return -1;
      case 'v':
        printf("dupc %s\n", PACKAGE_VERSION);
        return -1;
      case '?':
        return -1;
        }
    }

  if (add_hosts && write_hosts)
    {
      fprintf(
          stderr,
          "Adding hosts and writing at the same time is not supported! (Can't use -A and -W concurrently)\n");
      return -1;
    }
  return 0;
}

static int
writeConfig(vector<Process *> v, char *filepath)
{
  ofstream outfile;
  outfile.open(filepath, ios::out);

  if (outfile.is_open())
    {
      for (vector<Process *>::const_iterator iter = v.begin(); iter != v.end(); ++iter)
        {
          if (old_dup_style)
            (*iter)->pretty_print_old_dup(outfile);
          else
            (*iter)->pretty_print(outfile);
        }
      outfile.close();
      return 1;
    }
  else
    {
      return 0;
    }
}

#if 0
static int
printConfig (vector < Process * >v, std::ostream & stream, bool old_dup)
  {

    for (vector < Process * >::const_iterator iter = v.begin ();
        iter != v.end (); ++iter)
      {
        if (old_dup)
        (*iter)->pretty_print_old_dup (stream);
        else
        (*iter)->pretty_print (stream);
      }
    return 1;
  }
#endif

static int
readHosts(FILE * infile, vector<host_info *>*host_list)
{
  struct host_info *temphost;
  int bufsize = 125;
  char buf[bufsize];
  char *loc;

  while (NULL != fgets(buf, bufsize, infile))
    {
      loc = strstr(buf, ":");
      if (loc != NULL)
        loc[0] = '\0';
      else
        {
          fprintf(stderr, "Could not read input file, error was %s\n",
              strerror(errno));
          fclose(infile);
          if (outfile != NULL)
            {
              fclose(outfile);
            }
          return -1;
        }

      temphost = (host_info *) malloc(sizeof(struct host_info));
      temphost->hostname = (char *) malloc(loc - buf + 1);
      strncpy(temphost->hostname, buf, loc - buf + 1);
      temphost->port = atoi(loc + 1);
      host_list->push_back(temphost);
    }
  return 1;

}

static int
removeHosts(vector<Process *> starting_list, vector<Process *>*return_list,
    vector<host_info *> host_list, const char *hostname, int port)
{
  int temp_size;
  Process *temp_process;
  host_info *temp_host_info;
  unsigned int list_pos = 0;
  for (vector<Process *>::const_iterator iter = starting_list.begin(); iter
      != starting_list.end(); ++iter)
    {
      temp_process = new Process(**iter);
      if ((add_hosts) && (host_list.size() > 0) && (strncmp(
          temp_process->process_id, "L", 1) != 0))
        {
          temp_process->host_address = strdup(host_list[list_pos]->hostname);
          temp_process->portnum = host_list[list_pos]->port;

          list_pos++;
          if (list_pos >= host_list.size())
            {
              list_pos = 0;
            }
        }
      else
        {
          if (strncmp(temp_process->process_id, "L", 1) != 0)
            {
              temp_host_info = (struct host_info *) malloc(
                  sizeof(struct host_info));
              temp_host_info->hostname = temp_process->host_address;
              temp_host_info->port = temp_process->portnum;
              host_list.push_back(temp_host_info);
            }
          temp_size = snprintf(NULL, 0, "%s", hostname) + 1;
          temp_process->host_address = (char *) malloc(temp_size);
          snprintf(temp_process->host_address, temp_size, "%s", hostname);
          temp_process->portnum = port;
        }

      return_list->push_back(temp_process);
    }
  return 1;
}

static int
teeTimeConfig(vector<Process *> starting_list, char *path, int num)
{
  Process *new_strace_process;
  Process *new_time_process;
  vector<char *>*new_cmd;
  char *temp_tee_dir;
  char *temp_buf;
  string temp;
  int temp_size;
  vector<Edge *> new_edge_list;
  Edge *temp_edge;
  ofstream outfile;

  temp_size = snprintf(NULL, 0, "%s/base_tee_data-%d/", path, num) + 1;
  temp_tee_dir = (char *) malloc(temp_size);
  snprintf(temp_tee_dir, temp_size, "%s/base_tee_data-%d/", path, num);

  for (vector<Process *>::const_iterator original_iter = starting_list.begin(); original_iter
      != starting_list.end(); ++original_iter)
    {
      new_strace_process = new Process(**original_iter);

      new_cmd = new vector<char *> ();
      new_cmd->push_back(strdup("strace"));
      new_cmd->push_back(strdup("-o"));
      temp_size = snprintf(NULL, 0, "\"%s%s.strace\"", temp_tee_dir,
          new_strace_process->process_id) + 1;
      temp_buf = (char *) malloc(temp_size);
      snprintf(temp_buf, temp_size, "\"%s%s.strace\"", temp_tee_dir,
          new_strace_process->process_id);
      new_cmd->push_back(temp_buf);
      new_cmd->push_back(strdup("-c"));

      for (unsigned int i = 0; i < (*original_iter)->command_args.size(); ++i)
        {
          new_cmd->push_back((*original_iter)->command_args[i]);
        }

      new_strace_process->command_args = *new_cmd;

      new_time_process = new Process(**original_iter);

      new_cmd = new vector<char *> ();
      new_cmd->push_back(strdup("/usr/bin/time"));
      new_cmd->push_back(strdup("-o"));
      temp_size = snprintf(NULL, 0, "\"%s%s.time\"", temp_tee_dir,
          new_time_process->process_id) + 1;
      temp_buf = (char *) malloc(temp_size);
      snprintf(temp_buf, temp_size, "\"%s%s.time\"", temp_tee_dir,
          new_time_process->process_id);
      new_cmd->push_back(temp_buf);
      new_cmd->push_back(strdup("-f"));
      new_cmd->push_back(strdup("%U %S %e %P %M %t %K %W %w %O %I %s %r"));
      for (unsigned int i = 0; i < (*original_iter)->command_args.size(); ++i)
        {
          new_cmd->push_back((*original_iter)->command_args[i]);
        }

      new_time_process->command_args = *new_cmd;

      for (vector<Edge *>::const_iterator new_edge_iter =
          new_strace_process->edge_list.begin(); new_edge_iter
          != new_strace_process->edge_list.end(); ++new_edge_iter)
        {
          switch ((*new_edge_iter)->op)
            {
          case DUP_WRITE:
          case DUP_APPEND:
          case DUP_PIPE:
            temp_edge = new Edge(DUP_PIPE, new EdgeNode(
                (*new_edge_iter)->left-> descriptor_number), new EdgeNode(
                (char *) "DUP", 1));
            break;
          case DUP_READ:
            temp_size = snprintf(NULL, 0, "%sFILE_%s-%d.data", temp_tee_dir,
                (*original_iter)->process_id,
                (*new_edge_iter)->left->descriptor_number);
            temp_buf = (char *) malloc(temp_size + 1);
            snprintf(temp_buf, temp_size + 1, "%sFILE_%s-%d.data",
                temp_tee_dir, (*original_iter)->process_id,
                (*new_edge_iter)->left->descriptor_number);
            temp_edge = new Edge(DUP_READ, new EdgeNode(
                (*new_edge_iter)->left-> descriptor_number), new EdgeNode(
                temp_buf));
            free(temp_buf);
            break;
          default:
            break;
            }
          if (temp_edge != NULL)
            new_edge_list.push_back(temp_edge);
        }
      for (vector<Edge *>::const_iterator new_edge_iter =
          new_strace_process->edge_list.begin(); new_edge_iter
          != new_strace_process->edge_list.end(); ++new_edge_iter)
        {
          delete (*new_edge_iter);
        }

      for (vector<Edge *>::const_iterator new_edge_iter =
          new_time_process->edge_list.begin(); new_edge_iter
          != new_time_process->edge_list.end(); ++new_edge_iter)
        {
          delete (*new_edge_iter);
        }
      new_strace_process->edge_list.clear();
      new_time_process->edge_list.clear();

      for (vector<Edge *>::const_iterator new_edge_iter = new_edge_list.begin(); new_edge_iter
          != new_edge_list.end(); ++new_edge_iter)
        {
          new_strace_process->edge_list.push_back((*new_edge_iter));
          new_time_process->edge_list. push_back(new Edge((*new_edge_iter)->op,
              (*new_edge_iter)->left, (*new_edge_iter)->right));
        }
      new_edge_list.clear();

      for (vector<Process *>::const_iterator second_iter =
          starting_list.begin(); second_iter != starting_list.end(); ++second_iter)
        {
          for (vector<Edge *>::const_iterator second_edge_iter =
              (*second_iter)->edge_list.begin(); second_edge_iter
              != (*second_iter)->edge_list.end(); ++second_edge_iter)
            {
              if (((*second_edge_iter)->op == DUP_PIPE) && (strcmp(
                  (*original_iter)->process_id,
                  (*second_edge_iter)->right->name) == 0))
                {
                  temp_size = snprintf(NULL, 0, "%s%s-%d_%s-%d.data",
                      temp_tee_dir, (*second_iter)->process_id,
                      (*second_edge_iter)->left->descriptor_number,
                      (*original_iter)->process_id,
                      (*second_edge_iter)->right->descriptor_number);
                  temp_buf = (char *) malloc(temp_size + 1);
                  snprintf(temp_buf, temp_size + 1, "%s%s-%d_%s-%d.data",
                      temp_tee_dir, (*second_iter)->process_id,
                      (*second_edge_iter)->left->descriptor_number,
                      (*original_iter)->process_id,
                      (*second_edge_iter)->right->descriptor_number);
                  temp_edge = new Edge(DUP_READ, new EdgeNode(
                      (*second_edge_iter)->right-> descriptor_number),
                      new EdgeNode(temp_buf));
                  free(temp_buf);
                  new_strace_process->edge_list.push_back(temp_edge);
                  new_time_process->edge_list. push_back(new Edge(
                      temp_edge->op, temp_edge->left, temp_edge->right));
                }
            }
        }

      temp_size = snprintf(NULL, 0, "%steetime-%s-strace.conf", temp_tee_dir,
          new_strace_process->process_id) + 1;
      temp_buf = (char *) malloc(temp_size);
      snprintf(temp_buf, temp_size, "%steetime-%s-strace.conf", temp_tee_dir,
          new_strace_process->process_id);
      outfile.open(temp_buf, ios::out);
      free(temp_buf);
      // FIXME: this looks strange, should these not
      // be deleted within the destructor of the respective
      // process objects?

      // No, because only the char * host address is getting
      // replaced (via strdup on the following lines).
      // If we don't free the current address first we'll
      // leak the memory I think.
      free(new_strace_process->host_address);
      free(new_time_process->host_address);
      new_strace_process->host_address = strdup(localhost);
      new_time_process->host_address = strdup(localhost);
      new_strace_process->portnum = default_port;
      new_time_process->portnum = default_port;

      if (outfile.is_open())
        {
          new_strace_process->pretty_print(outfile);
          outfile.close();
        }
      else
        {
          free(temp_tee_dir);
          return -1;
        }

      temp_size = snprintf(NULL, 0, "%steetime-%s-time.conf", temp_tee_dir,
          new_time_process->process_id) + 1;
      temp_buf = (char *) malloc(temp_size);
      snprintf(temp_buf, temp_size, "%steetime-%s-time.conf", temp_tee_dir,
          new_time_process->process_id);
      outfile.open(temp_buf, ios::out);
      free(temp_buf);
      if (outfile.is_open())
        {
          new_time_process->pretty_print(outfile);
          outfile.close();
        }
      else
        {
          free(temp_tee_dir);

          return -1;
        }

    }
  if (temp_tee_dir != NULL)
    free(temp_tee_dir);
  return 1;
}

static int
createCPUConfigs(vector<Process *> process_list, char *path)
{
  vector<Process *>*cpucheck_process_list;
  char *temp_cpu_dir;
  char *temp_file_path;
  int temp_size;
  struct stat stat_buf;
  Process *temp_process;

  temp_size = snprintf(NULL, 0, "%s/cpu_data/", path) + 1;
  temp_cpu_dir = (char *) malloc(temp_size);
  snprintf(temp_cpu_dir, temp_size, "%s/cpu_data/", path);

  if ((stat(temp_cpu_dir, &stat_buf) == -1) && (mkdir(temp_cpu_dir, (S_IRWXU
      | S_IRWXG | S_IRWXO)) == -1))
    {
      fprintf(stderr, "Could not open/create directory `%s': %s\n",
          temp_cpu_dir, strerror(errno));
      free(temp_cpu_dir);
      return -1;
    }

  temp_file_path = NULL;
  for (vector<Process *>::const_iterator iter = process_list.begin(); iter
      != process_list.end(); ++iter)
    {
      cpucheck_process_list = new vector<Process *> ();
      temp_process = new Process(**iter);
      temp_process->edge_list.clear();
      free(temp_process->process_id);
      temp_process->process_id = strdup("nodecpu");
      temp_process->command_args.clear();
      temp_process->command_args.push_back(strdup("cat /proc/cpuinfo"));
      temp_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(1),
          new EdgeNode((char *) "localnode", 0)));
      cpucheck_process_list->push_back(temp_process);

      temp_process = new Process();
      temp_process->host_address = strdup(localhost);
      temp_process->portnum = default_port;
      temp_process->process_id = strdup("localnode");
      temp_process->command_args.push_back(strdup("cat -"));
      temp_size = snprintf(NULL, 0, "%s%s_cpuinfo.data", temp_cpu_dir,
          (*iter)->host_address) + 1;
      temp_file_path = (char *) malloc(temp_size);
      snprintf(temp_file_path, temp_size, "%s%s_cpuinfo.data", temp_cpu_dir,
          (*iter)->host_address);
      temp_process->edge_list. push_back(new Edge(DUP_WRITE, new EdgeNode(1),
          new EdgeNode(temp_file_path)));
      free(temp_file_path);
      cpucheck_process_list->push_back(temp_process);

      temp_size = snprintf(NULL, 0, "%s%s_cpuinfo.conf", temp_cpu_dir,
          (*iter)->host_address) + 1;
      temp_file_path = (char *) malloc(temp_size);
      snprintf(temp_file_path, temp_size, "%s%s_cpuinfo.conf", temp_cpu_dir,
          (*iter)->host_address);

      writeConfig(*cpucheck_process_list, temp_file_path);
      free(temp_file_path);
    }
  free(temp_cpu_dir);
  return 1;
}

static int
findNextAvailableOutFD(Process * process)
{
  int curr_fd = 27;
  bool is_used;
  do
    {
      curr_fd++;
      is_used = false;
      for (vector<Edge *>::iterator edge_iter = process->edge_list.begin(); edge_iter
          != process->edge_list.end(); ++edge_iter)
        if ((*edge_iter)->left->descriptor_number == curr_fd)
          is_used = true;
    }
  while (is_used == true);

  return curr_fd;
}

static int
createNetworkConfigs(vector<Process *> process_list, char *path)
{
  vector<Process *>*netcheck_process_list;
  char *temp_net_dir;
  char *temp_file_path;
  int temp_size;
  struct stat stat_buf;
  char *temp_buf;
  Process *dd_process;
  Process *cat_process;
  Process *drop_process;
  vector<string *> distinct_hosts;

  temp_file_path = NULL;
  temp_size = snprintf(NULL, 0, "%s/network_data/", path) + 1;
  temp_net_dir = (char *) malloc(temp_size);
  snprintf(temp_net_dir, temp_size, "%s/network_data/", path);

  if ((stat(temp_net_dir, &stat_buf) == -1) && (mkdir(temp_net_dir, (S_IRWXU
      | S_IRWXG | S_IRWXO)) == -1))
    {
      fprintf(stderr, "Could not open/create directory `%s': %s\n",
          temp_net_dir, strerror(errno));
      free(temp_net_dir);
      return -1;
    }

  dd_process = new Process();
  dd_process->process_id = strdup("node1");
  dd_process->portnum = default_port;
  dd_process->command_args.clear();
  dd_process->command_args. push_back(strdup("dd if=/dev/zero count=1000K"));
  dd_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(1),
      new EdgeNode((char *) "node2", 0)));
  dd_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(2),
      new EdgeNode((char *) "nodedrop", 0)));

  cat_process = new Process();
  cat_process->edge_list.clear();
  cat_process->portnum = default_port;
  cat_process->process_id = strdup("node2");
  cat_process->command_args.clear();
  cat_process->command_args.push_back(strdup("cat"));
  temp_buf = strdup("/dev/null");
  cat_process->edge_list. push_back(new Edge(DUP_WRITE, new EdgeNode(1),
      new EdgeNode(temp_buf)));
  free(temp_buf);

  drop_process = new Process();
  drop_process->host_address = strdup(localhost);
  drop_process->portnum = default_port;
  drop_process->process_id = strdup("nodedrop");
  drop_process->command_args.push_back(strdup("drop 2"));
  drop_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(2),
      new EdgeNode((char *) "DUP", 1)));

  for (vector<Process *>::const_iterator iter = process_list.begin(); iter
      != process_list.end(); ++iter)
    {
      bool is_in = false;
      for (vector<string *>::const_iterator host_iter = distinct_hosts.begin(); host_iter
          != distinct_hosts.end(); ++host_iter)
        if ((**host_iter).compare((**iter).host_address) == 0)
          is_in = true;

      if (!is_in)
        distinct_hosts.push_back(new string((**iter).host_address));
    }

  for (vector<string *>::const_iterator iter = distinct_hosts.begin(); iter
      != distinct_hosts.end(); ++iter)
    {
      for (vector<string *>::const_iterator second_iter =
          distinct_hosts.begin(); second_iter != distinct_hosts.end(); ++second_iter)
        {
          netcheck_process_list = new vector<Process *> ();
          dd_process->host_address = strdup((*iter)->c_str());
          netcheck_process_list->push_back(dd_process);
          cat_process->host_address = strdup((*second_iter)->c_str());
          netcheck_process_list->push_back(cat_process);

          temp_size = snprintf(NULL, 0, "%s%s-%s.data", temp_net_dir,
              (*iter)->c_str(), (*second_iter)->c_str()) + 1;
          temp_file_path = (char *) malloc(temp_size);
          snprintf(temp_file_path, temp_size, "%s%s-%s.data", temp_net_dir,
              (*iter)->c_str(), (*second_iter)->c_str());
          if (drop_process->edge_list.size() > 1)
            {
              Edge *tempedge = drop_process->edge_list.back();
              drop_process->edge_list.pop_back();
              if (tempedge != NULL)
                delete tempedge;
            }

          drop_process->edge_list. push_back(new Edge(DUP_WRITE,
              new EdgeNode(1), new EdgeNode(temp_file_path)));

          netcheck_process_list->push_back(drop_process);

          temp_size = snprintf(NULL, 0, "%s%s-%s.conf", temp_net_dir,
              (*iter)->c_str(), (*second_iter)->c_str()) + 1;
          if (temp_file_path != NULL)
            free(temp_file_path);
          temp_file_path = (char *) malloc(temp_size);
          snprintf(temp_file_path, temp_size, "%s%s-%s.conf", temp_net_dir,
              (*iter)->c_str(), (*second_iter)->c_str());

          writeConfig(*netcheck_process_list, temp_file_path);
          free(temp_file_path);
        }
    }
  free(temp_net_dir);
  return 1;
}

static Process *
findProcess(vector<Process *> starting_list, char * process_id)
{
  Process *ret;
  ret = NULL;
  for (vector<Process *>::const_iterator iter = starting_list.begin(); iter
      != starting_list.end(); ++iter)
    {
      if (strcmp((*iter)->process_id, process_id) == 0)
        {
          ret = (*iter);
        }
    }
  return ret;
}

static void
optimizeFanouts(vector<Process *> starting_list, vector<Process *>*return_list)
{
  vector<struct host_info *> fanout_hosts;

  Process * temp_process;
  Process * temp_fanin_process;
  Edge *temp_edge;
  vector<Process *> remote_fanout_list;
  vector<Edge *> add_to_iter;

  char porttmp[10];

  for (vector<Process *>::const_iterator iter = starting_list.begin(); iter
      != starting_list.end(); ++iter)
    {
      if (strcmp((*iter)->command_args[0], "fanout") == 0)
        {
          for (vector<Edge *>::iterator edge_iter = (*iter)->edge_list.begin(); edge_iter
              != (*iter)->edge_list.end(); ++edge_iter)
            {
              if (((*edge_iter)->op == DUP_PIPE) && (strcmp(findProcess(
                  starting_list, (*edge_iter)->right->name)->host_address,
                  localhost) != 0))
                {
                  temp_process = NULL;
                  for (vector<Process *>::const_iterator fanout_iter =
                      remote_fanout_list.begin(); fanout_iter
                      != remote_fanout_list.end(); ++fanout_iter)
                    {
                      if ((strcmp(
                          (*fanout_iter)->host_address,
                          findProcess(starting_list, (*edge_iter)->right->name)->host_address)
                          == 0) && ((*fanout_iter)->portnum == findProcess(
                          starting_list, (*edge_iter)->right->name)->portnum))
                        {
                          temp_process = (*fanout_iter);
                        }
                    }
                  temp_edge = (*edge_iter);
                  (*iter)->edge_list.erase(edge_iter);
                  edge_iter--;
                  string *temp_process_id = new string("fanin_");
                  temp_process_id->append(findProcess(starting_list,
                      temp_edge->right->name)->host_address);

                  sprintf(porttmp, "%d", findProcess(starting_list,
                      temp_edge->right->name)->portnum);
                  temp_process_id->append(porttmp);
                  string *temp_fanout_process_id = new string("fanout_");
                  temp_fanout_process_id->append(findProcess(starting_list,
                      temp_edge->right->name)->host_address);
                  temp_fanout_process_id->append(porttmp);

                  replace(temp_fanout_process_id->begin(),
                      temp_fanout_process_id->end(), '.', '_');

                  replace(temp_process_id->begin(), temp_process_id->end(),
                      '.', '_');
                  if (temp_process == NULL)
                    {
                      temp_process = new Process();
                      temp_process->host_address = strdup(findProcess(
                          starting_list, temp_edge->right->name)->host_address);
                      temp_process->portnum = findProcess(starting_list,
                          temp_edge->right->name)->portnum;
                      temp_process->command_args.push_back(strdup("fanout"));
                      temp_process->process_id = strdup(
                          temp_fanout_process_id->c_str());
                      remote_fanout_list.push_back(temp_process);

                      temp_fanin_process = new Process();
                      temp_fanin_process->host_address = strdup(
                          (*iter)->host_address);
                      temp_fanin_process->portnum = (*iter)->portnum;
                      temp_fanin_process->command_args.push_back(strdup(
                          "faninany"));
                      temp_fanin_process->add_edge(new Edge(DUP_PIPE,
                          new EdgeNode(1), new EdgeNode(temp_fanout_process_id->c_str(), 0)));
                      temp_fanin_process->process_id = strdup(
                          temp_process_id->c_str());
                      remote_fanout_list.push_back(temp_fanin_process);
                      add_to_iter.push_back(new Edge(DUP_PIPE, new EdgeNode(
                          temp_edge->left->descriptor_number), new EdgeNode(
                          temp_process_id->c_str(),
                          temp_edge->right->descriptor_number)));
                    }
                  free(temp_process_id);
                  free(temp_fanout_process_id);
                  temp_process->add_edge(new Edge(DUP_PIPE, new EdgeNode(
                      temp_edge->left->descriptor_number), new EdgeNode(
                      temp_edge->right->name,
                      temp_edge->right->descriptor_number)));

                }
            }
        }

      for (size_t i = 0; i < add_to_iter.size(); i++)
        {
          (*iter)->add_edge(add_to_iter[i]);
        }

      add_to_iter.clear();
      return_list->push_back((*iter));
    }

  for (vector<Process *>::const_iterator iter = remote_fanout_list.begin(); iter
      != remote_fanout_list.end(); ++iter)
    {
      return_list->push_back((*iter));
    }

}

static void
add_monitor_processes(vector<Process *> starting_list,
    vector<Process *>*return_list, char *path)
{
  vector<char *>*temp_cmd;

  char *temp_buf;
  char *temp_path;

  char *temp_tee_dir;
  int temp_size;
  int count = 0;

  Process *local_temp_process;
  Process *temp_original_process;
  Edge *monitor_edge;
  map<string, int> hostcounts;
  map<string, int> hostports;
  map<string, string> cleanhostnames;

  fprintf(stderr, "add monitor processes\n");
  temp_size = snprintf(NULL, 0, "%s/base_tee_data-0/", path) + 1;
  temp_tee_dir = (char *) malloc(temp_size);
  snprintf(temp_tee_dir, temp_size, "%s/base_tee_data-0/", path);

  for (vector<Process *>::const_iterator iter = starting_list.begin(); iter
      != starting_list.end(); ++iter)
    {
      temp_original_process = new Process(**iter);

      cleanhostnames[temp_original_process->host_address] = string(
          temp_original_process->host_address);
      replace(cleanhostnames[temp_original_process->host_address]. begin(),
          cleanhostnames[temp_original_process->host_address].end(), '.', '_');

      ++hostcounts[temp_original_process->host_address];
      hostports[temp_original_process->host_address]
          = temp_original_process->portnum;

      temp_size = snprintf(NULL, 0, "%d", findNextAvailableOutFD(
          temp_original_process));
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "%d", findNextAvailableOutFD(
          temp_original_process));
      temp_original_process->command_args.insert(
          temp_original_process-> command_args.begin(), strdup(temp_buf));
      free(temp_buf);
      temp_original_process->command_args.insert(
          temp_original_process-> command_args.begin(), strdup("execvother"));
      if (strrchr(temp_original_process->command_args[2], '/') == NULL)
        {
          temp_size = snprintf(NULL, 0, "%s%d",
              temp_original_process->command_args[2], count) + 1;
          temp_buf = (char *) malloc(temp_size);
          snprintf(temp_buf, temp_size, "%s%d",
              temp_original_process->command_args[2], count);
          temp_original_process->command_args. insert(
              temp_original_process->command_args.begin() + 3, strdup(temp_buf));
          temp_original_process->command_args. insert(
              temp_original_process->command_args.begin() + 4, strdup(
                  temp_original_process->process_id));
        }
      else
        {
          temp_size = snprintf(NULL, 0, "%s%d", strrchr(
              temp_original_process->command_args[2], '/') + 1, count) + 1;
          temp_buf = (char *) malloc(temp_size);
          snprintf(temp_buf, temp_size, "%s%d", strrchr(
              temp_original_process->command_args[2], '/') + 1, count);
          temp_original_process->command_args. insert(
              temp_original_process->command_args.begin() + 4, strdup(
                  temp_original_process->process_id));
        }
      free(temp_buf);
      temp_size = snprintf(NULL, 0, "gather_%s",
          cleanhostnames[temp_original_process->host_address]. c_str());
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "gather_%s",
          cleanhostnames[temp_original_process->host_address]. c_str());
      monitor_edge = new Edge(DUP_PIPE, new EdgeNode(findNextAvailableOutFD(
          temp_original_process)), new EdgeNode(temp_buf,
          hostcounts[temp_original_process-> host_address] + 3));
      free(temp_buf);
      ++count;

      temp_original_process->edge_list.push_back(monitor_edge);
      return_list->push_back(temp_original_process);
    }

  for (map<string, int>::const_iterator it = hostcounts.begin(); it
      != hostcounts.end(); ++it)
    {
      local_temp_process = new Process();
      local_temp_process->host_address = strdup((*it).first.c_str());
      local_temp_process->portnum = hostports[(*it).first.c_str()];

      temp_size = snprintf(NULL, 0, "gather_%s",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->process_id = (char *) malloc(temp_size + 1);
      snprintf(local_temp_process->process_id, temp_size + 1, "gather_%s",
          cleanhostnames[(*it).first].c_str());
      temp_cmd = new vector<char *> ();
      temp_cmd->push_back(strdup("gather"));
      local_temp_process->command_args = *temp_cmd;

      temp_size = snprintf(NULL, 0, "poll_%s",
          cleanhostnames[(*it).first].c_str());
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "poll_%s",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(
          1), new EdgeNode(temp_buf, 0)));
      free(temp_buf);
      return_list->push_back(local_temp_process);
      local_temp_process->pretty_print(std::cout);
#if BIO_HACK
      local_temp_process = new Process();
      local_temp_process->host_address = strdup((*it).first.c_str());
      local_temp_process->portnum = hostports[(*it).first.c_str()];

      temp_size = snprintf(NULL, 0, "find_arb_pid_%s",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->process_id = (char *) malloc(temp_size + 1);
      snprintf(local_temp_process->process_id, temp_size + 1,
          "find_arb_pid_%s", cleanhostnames[(*it).first].c_str());

      temp_cmd = new vector<char *> ();
      temp_cmd->push_back(strdup("ps"));
      temp_cmd->push_back(strdup("-C"));
      temp_cmd->push_back(strdup("arb_pt_server"));
      temp_cmd->push_back(strdup("-o"));
      temp_cmd->push_back(strdup("pid="));
      local_temp_process->command_args = *temp_cmd;

      temp_size = snprintf(NULL, 0, "arb_awk_%s",
          cleanhostnames[(*it).first].c_str());
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "arb_awk_%s",
          cleanhostnames[(*it).first].c_str());

      local_temp_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(
          1), new EdgeNode(temp_buf, 0)));
      free(temp_buf);

      local_temp_process->pretty_print(std::cout);
      return_list->push_back(local_temp_process);

      local_temp_process = new Process();
      local_temp_process->host_address = strdup((*it).first.c_str());
      local_temp_process->portnum = hostports[(*it).first.c_str()];

      temp_size = snprintf(NULL, 0, "find_arb_pid_%s",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->process_id = (char *) malloc(temp_size + 1);
      snprintf(local_temp_process->process_id, temp_size + 1,
          "find_arb_pid_%s", cleanhostnames[(*it).first].c_str());

      temp_cmd = new vector<char *> ();
      temp_cmd->push_back(strdup("awk"));
      temp_cmd->push_back(strdup("'{print $1 \" arb_pt_server\"}'"));
      local_temp_process->command_args = *temp_cmd;

      temp_size = snprintf(NULL, 0, "gather_%s",
          cleanhostnames[(*it).first].c_str());
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "gather_%s",
          cleanhostnames[(*it).first].c_str());

      local_temp_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(
          1), new EdgeNode(temp_buf, 151)));
      free(temp_buf);
      local_temp_process->pretty_print(std::cout);
      return_list->push_back(local_temp_process);

#endif

      local_temp_process = new Process();
      local_temp_process->host_address = strdup((*it).first.c_str());
      local_temp_process->portnum = hostports[(*it).first.c_str()];

      temp_size = snprintf(NULL, 0, "poll_%s",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->process_id = (char *) malloc(temp_size + 1);
      snprintf(local_temp_process->process_id, temp_size + 1, "poll_%s",
          cleanhostnames[(*it).first].c_str());

      temp_cmd = new vector<char *> ();
      temp_cmd->push_back(strdup("poll.sh"));
      temp_size = snprintf(NULL, 0, "%d", it->second);
      temp_buf = (char *) malloc(temp_size + 1);
#if BIO_HACK
      snprintf(temp_buf, temp_size + 1, "%d", it->second + 1);
#else
      snprintf (temp_buf, temp_size + 1, "%d", it->second);
#endif
      temp_cmd->push_back(strdup(temp_buf));
      local_temp_process->command_args = *temp_cmd;
      free(temp_buf);

      temp_size = snprintf(NULL, 0, "poll_%s_localhost",
          cleanhostnames[(*it).first].c_str());
      temp_buf = (char *) malloc(temp_size + 1);
      snprintf(temp_buf, temp_size + 1, "poll_%s_localhost",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->edge_list. push_back(new Edge(DUP_PIPE, new EdgeNode(
          1), new EdgeNode(temp_buf, 0)));
      free(temp_buf);
      return_list->push_back(local_temp_process);

      local_temp_process = new Process();
      local_temp_process->host_address = strdup(localhost);
      local_temp_process->portnum = default_port;
      temp_size = snprintf(NULL, 0, "poll_%s_localhost",
          cleanhostnames[(*it).first].c_str());
      local_temp_process->process_id = (char *) malloc(temp_size + 1);
      snprintf(local_temp_process->process_id, temp_size + 1,
          "poll_%s_localhost", cleanhostnames[(*it).first].c_str());
      temp_cmd = new vector<char *> ();
      temp_cmd->push_back(strdup("cat"));
      local_temp_process->command_args = *temp_cmd;
      temp_size = snprintf(NULL, 0, "%s%s-hosts_replaced.psdata", temp_tee_dir,
          (*it).first.c_str()) + 1;
      temp_path = (char *) malloc(temp_size);
      snprintf(temp_path, temp_size, "%s%s-hosts_replaced.psdata",
          temp_tee_dir, (*it).first.c_str());
      local_temp_process->edge_list. push_back(new Edge(DUP_WRITE,
          new EdgeNode(1), new EdgeNode(temp_path)));
      free(temp_path);
      return_list->push_back(local_temp_process);
    }

  free(temp_tee_dir);
}

static int
teeConfig(vector<Process *> starting_list, vector<Process *>*return_list,
    char *path, int num, bool monitor_info)
{
  vector<char *>*temp_cmd;

  char *temp_buf;
  char *temp_pid;
  char *temp_path;
  char *temp_node;
  char *temp_tee_dir;
  bool remote_process;
  bool del_last;
  int temp_fd;
  int fanout_fd;
  int temp_size;
  int count = 0;

  Process *local_temp_process;
  Process *temp_process;
  Process *temp_original_process;
  Process *temp_local_count_process;
  Edge *temp_edge;
  Edge *monitor_edge;
  map<string, int> hostcounts;
  map<string, int> hostports;
  map<string, string> cleanhostnames;

  temp_size = snprintf(NULL, 0, "%s/base_tee_data-%d/", path, num) + 1;
  temp_tee_dir = (char *) malloc(temp_size);
  snprintf(temp_tee_dir, temp_size, "%s/base_tee_data-%d/", path, num);

  for (vector<Process *>::const_iterator iter = starting_list.begin(); iter
      != starting_list.end(); ++iter)
    {
      remote_process = false;
      temp_original_process = new Process(**iter);
      if (strcmp(temp_original_process->host_address, localhost) != 0)
        {
          remote_process = true;
        }

      if (monitor_info)
        {
          cleanhostnames[temp_original_process->host_address] = string(
              temp_original_process->host_address);
          replace(cleanhostnames[temp_original_process->host_address]. begin(),
              cleanhostnames[temp_original_process->host_address].end(), '.',
              '_');

          ++hostcounts[temp_original_process->host_address];
          hostports[temp_original_process->host_address]
              = temp_original_process->portnum;

          temp_size = snprintf(NULL, 0, "%d", findNextAvailableOutFD(
              temp_original_process));
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "%d", findNextAvailableOutFD(
              temp_original_process));
          temp_original_process->command_args.insert(
              temp_original_process-> command_args.begin(), strdup(temp_buf));
          free(temp_buf);
          temp_original_process->command_args.insert(
              temp_original_process-> command_args.begin(),
              strdup("execvother"));
          if (strrchr(temp_original_process->command_args[2], '/') == NULL)
            {
              temp_size = snprintf(NULL, 0, "%s%d",
                  temp_original_process->command_args[2], count) + 1;
              temp_buf = (char *) malloc(temp_size);
              snprintf(temp_buf, temp_size, "%s%d",
                  temp_original_process->command_args[2], count);
              temp_original_process->command_args. insert(
                  temp_original_process->command_args.begin() + 3, strdup(
                      temp_buf));
              temp_original_process->command_args. insert(
                  temp_original_process->command_args.begin() + 4, strdup(
                      temp_original_process->process_id));
            }
          else
            {
              temp_size = snprintf(NULL, 0, "%s%d", strrchr(
                  temp_original_process->command_args[2], '/') + 1, count) + 1;
              temp_buf = (char *) malloc(temp_size);
              snprintf(temp_buf, temp_size, "%s%d", strrchr(
                  temp_original_process->command_args[2], '/') + 1, count);
              temp_original_process->command_args. insert(
                  temp_original_process->command_args.begin() + 4, strdup(
                      temp_original_process->process_id));
            }
          free(temp_buf);
          temp_size = snprintf(NULL, 0, "gather_%s",
              cleanhostnames[temp_original_process->host_address]. c_str());
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "gather_%s",
              cleanhostnames[temp_original_process->host_address]. c_str());
          monitor_edge = new Edge(DUP_PIPE, new EdgeNode(
              findNextAvailableOutFD(temp_original_process)), new EdgeNode(
              temp_buf, hostcounts[temp_original_process-> host_address] + 3));
          free(temp_buf);
          ++count;
        }

      for (vector<Edge *>::iterator edge_iter =
          temp_original_process->edge_list.begin(); edge_iter
          != temp_original_process->edge_list.end(); ++edge_iter)
        {
          del_last = false;

          if (remote_process)
            {
              temp_cmd = new vector<char *> ();
              temp_buf = (char *) malloc(4);
              snprintf(temp_buf, 4, "cat");
              temp_cmd->push_back(temp_buf);

              temp_node = (*edge_iter)->right->name;
              temp_fd = (*edge_iter)->right->descriptor_number;

              local_temp_process = new Process();
              local_temp_process->command_args = *temp_cmd;
              local_temp_process->host_address = (char *) malloc(strlen(
                  localhost) + 1);
              strncpy(local_temp_process->host_address, localhost, strlen(
                  localhost) + 1);
              local_temp_process->portnum = default_port;
              temp_size = snprintf(NULL, 0, "%sT%d_localhost",
                  (*iter)->process_id, (*edge_iter)->left->descriptor_number);
              local_temp_process->process_id = (char *) malloc(temp_size + 1);
              snprintf(local_temp_process->process_id, temp_size + 1,
                  "%sT%d_localhost", (*iter)->process_id,
                  (*edge_iter)->left->descriptor_number);
            }

          temp_cmd = new vector<char *> ();
          temp_buf = (char *) malloc(6);
          snprintf(temp_buf, 6, "count");
          temp_cmd->push_back(temp_buf);

          temp_node = (*edge_iter)->right->name;
          temp_fd = (*edge_iter)->right->descriptor_number;

          temp_size = snprintf(NULL, 0, "%s", (*iter)->process_id);
          temp_pid = (char *) malloc(temp_size + 1);
          temp_size = snprintf(temp_pid, temp_size + 1, "%s",
              (*iter)->process_id);
          temp_process = new Process();
          temp_process->command_args = *temp_cmd;
          temp_process->host_address = (char *) malloc(strlen(
              (*iter)->host_address) + 1);
          strncpy(temp_process->host_address, (*iter)->host_address, strlen(
              (*iter)->host_address) + 1);
          temp_process->portnum = (*iter)->portnum;
          temp_size = snprintf(NULL, 0, "%sT%d", (*iter)->process_id,
              (*edge_iter)->left->descriptor_number);
          temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(temp_process->process_id, temp_size + 1, "%sT%d",
              (*iter)->process_id, (*edge_iter)->left->descriptor_number);

          (*edge_iter)->right->name = (char *) malloc(temp_size + 1);
          snprintf((*edge_iter)->right->name, temp_size + 1, "%sT%d",
              (*iter)->process_id, (*edge_iter)->left->descriptor_number);

          switch ((*edge_iter)->op)
            {
          case DUP_PIPE:
            temp_edge = new Edge(DUP_PIPE, new EdgeNode(1), new EdgeNode(
                temp_node, temp_fd));
            break;
          case DUP_READ:
            del_last = true;
            temp_edge = new Edge(DUP_PIPE, new EdgeNode(1), new EdgeNode(
                temp_pid, (*edge_iter)-> left->descriptor_number));

            temp_process->add_edge(temp_edge);

            temp_size = snprintf(NULL, 0, "%sFILE_%s-%d.data", temp_tee_dir,
                (*iter)->process_id, (*edge_iter)->left->descriptor_number);
            temp_path = (char *) malloc(temp_size + 1);
            snprintf(temp_path, temp_size + 1, "%sFILE_%s-%d.data",
                temp_tee_dir, (*iter)->process_id,
                (*edge_iter)->left->descriptor_number);

            temp_edge = new Edge(DUP_WRITE, new EdgeNode(3), new EdgeNode(
                temp_path));
            if (!dont_save)
              temp_process->add_edge(temp_edge);
            else
              delete temp_edge;

            temp_edge = new Edge(DUP_READ, new EdgeNode(0), new EdgeNode(
                temp_node));
            free(temp_path);
            break;
          case DUP_WRITE:
            temp_edge = new Edge(DUP_WRITE, new EdgeNode(1), new EdgeNode(
                temp_node));
            break;
          case DUP_APPEND:
            temp_edge = new Edge(DUP_APPEND, new EdgeNode(1), new EdgeNode(
                temp_node));
            break;
          default:
            temp_edge = NULL;
            break;
            }
          free(temp_pid);

          if (temp_edge != NULL)
            temp_process->add_edge(temp_edge);
          temp_edge = NULL;
          temp_buf = (char *) malloc(snprintf(NULL, 0, "%s_%s", "count",
              temp_process->process_id) + 1);
          sprintf(temp_buf, "%s_%s", "count", temp_process->process_id);
          temp_edge = new Edge(DUP_PIPE, new EdgeNode(2), new EdgeNode(
              temp_buf, 0));
          temp_process->add_edge(temp_edge);
          temp_edge = NULL;
          temp_local_count_process = new Process();
          temp_local_count_process->process_id = strdup(temp_buf);
          free(temp_buf);
          temp_local_count_process->host_address = strdup(localhost);
          temp_local_count_process->portnum = default_port;
          temp_local_count_process->command_args.push_back(strdup("cat"));

          if (have_dir)
            {
              switch ((*edge_iter)->op)
                {
              case DUP_PIPE:

                temp_size = snprintf(NULL, 0, "%s%s-%d_%s-%d_throughput.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number, temp_node, temp_fd);
                temp_path = (char *) malloc(temp_size + 1);
                snprintf(temp_path, temp_size + 1,
                    "%s%s-%d_%s-%d_throughput.data", temp_tee_dir,
                    (*iter)->process_id, (*edge_iter)->left->descriptor_number,
                    temp_node, temp_fd);

                temp_local_count_process->add_edge(new Edge(DUP_WRITE,
                    new EdgeNode(1), new EdgeNode(temp_path)));
                return_list->push_back(temp_local_count_process);

                free(temp_path);

                temp_size = snprintf(NULL, 0, "%s%s-%d_%s-%d.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number, temp_node, temp_fd);
                temp_path = (char *) malloc(temp_size + 1);
                snprintf(temp_path, temp_size + 1, "%s%s-%d_%s-%d.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number, temp_node, temp_fd);

                if (remote_process)
                  temp_edge = new Edge(DUP_WRITE, new EdgeNode(1),
                      new EdgeNode(temp_path));
                else
                  temp_edge = new Edge(DUP_WRITE, new EdgeNode(3),
                      new EdgeNode(temp_path));

                free(temp_path);
                break;
              case DUP_WRITE:
              case DUP_APPEND:
              case DUP_READ:

                temp_size = snprintf(NULL, 0, "%s/%s-%d_FILE_throughput.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number);
                temp_path = (char *) malloc(temp_size + 1);
                snprintf(temp_path, temp_size + 1,
                    "%s/%s-%d_FILE_throughput.data", temp_tee_dir,
                    (*iter)->process_id, (*edge_iter)->left->descriptor_number);

                temp_local_count_process->add_edge(new Edge(DUP_WRITE,
                    new EdgeNode(1), new EdgeNode(temp_path)));
                return_list->push_back(temp_local_count_process);
                free(temp_path);

                temp_size = snprintf(NULL, 0, "%s/%s-%d_FILE.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number);
                temp_path = (char *) malloc(temp_size + 1);
                snprintf(temp_path, temp_size + 1, "%s/%s-%d_FILE.data",
                    temp_tee_dir, (*iter)->process_id,
                    (*edge_iter)->left->descriptor_number);
                if ((*edge_iter)->op != DUP_READ)
                  {
                    if (remote_process)
                      temp_edge = new Edge(DUP_WRITE, new EdgeNode(1),
                          new EdgeNode(temp_path));
                    else
                      temp_edge = new Edge(DUP_WRITE, new EdgeNode(3),
                          new EdgeNode(temp_path));
                  }
                free(temp_path);
                break;
              default:
                break;
                }
            }

          (*edge_iter)->op = DUP_PIPE;
          (*edge_iter)->right->descriptor_number = 0;
          if (temp_edge != NULL)
            {
              if ((remote_process) && (!dont_save))
                {
                  local_temp_process->add_edge(temp_edge);
                  temp_size = snprintf(NULL, 0, "%sT%d_localhost",
                      (*iter)->process_id,
                      (*edge_iter)->left->descriptor_number);
                  temp_buf = (char *) malloc(temp_size + 1);
                  snprintf(temp_buf, temp_size + 1, "%sT%d_localhost",
                      (*iter)->process_id,
                      (*edge_iter)->left->descriptor_number);
                  temp_edge = new Edge(DUP_PIPE, new EdgeNode(3), new EdgeNode(
                      temp_buf, 0));
                  free(temp_buf);
                  return_list->push_back(local_temp_process);
                }
              if (!dont_save)
                temp_process->add_edge(temp_edge);
              else
                delete temp_edge;
            }

          if (wait_on_dupd)
            {
              fanout_fd = findNextAvailableOutFD(temp_process);
              temp_process->edge_list. push_back(new Edge(DUP_PIPE,
                  new EdgeNode(fanout_fd), new EdgeNode((char *) "DUP", 2)));
            }

          return_list->push_back(temp_process);
          if (del_last)
            {
              temp_original_process->edge_list.erase(edge_iter);
              edge_iter--;
            }

        }
      if (monitor_info)
        {
          temp_original_process->edge_list.push_back(monitor_edge);
        }
      return_list->push_back(temp_original_process);
    }

  /* If monitor_info is true, create gatherer and poll process per host */
  if (monitor_info)
    {
      for (map<string, int>::const_iterator it = hostcounts.begin(); it
          != hostcounts.end(); ++it)
        {
          local_temp_process = new Process();
          local_temp_process->host_address = strdup((*it).first.c_str());
          local_temp_process->portnum = hostports[(*it).first.c_str()];

          temp_size = snprintf(NULL, 0, "gather_%s",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(local_temp_process->process_id, temp_size + 1, "gather_%s",
              cleanhostnames[(*it).first].c_str());
          temp_cmd = new vector<char *> ();
          temp_cmd->push_back(strdup("gather"));
          local_temp_process->command_args = *temp_cmd;

          temp_size = snprintf(NULL, 0, "poll_%s",
              cleanhostnames[(*it).first].c_str());
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "poll_%s",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->edge_list. push_back(new Edge(DUP_PIPE,
              new EdgeNode(1), new EdgeNode(temp_buf, 0)));
          free(temp_buf);
          return_list->push_back(local_temp_process);

#if BIO_HACK
          local_temp_process = new Process();
          local_temp_process->host_address = strdup((*it).first.c_str());
          local_temp_process->portnum = hostports[(*it).first.c_str()];

          temp_size = snprintf(NULL, 0, "find_arb_pid_%s",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(local_temp_process->process_id, temp_size + 1,
              "find_arb_pid_%s", cleanhostnames[(*it).first].c_str());

          temp_cmd = new vector<char *> ();
          temp_cmd->push_back(strdup("ps"));
          temp_cmd->push_back(strdup("-C"));
          temp_cmd->push_back(strdup("arb_pt_server"));
          temp_cmd->push_back(strdup("-o"));
          temp_cmd->push_back(strdup("pid="));
          local_temp_process->command_args = *temp_cmd;

          temp_size = snprintf(NULL, 0, "arb_awk_%s",
              cleanhostnames[(*it).first].c_str());
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "arb_awk_%s",
              cleanhostnames[(*it).first].c_str());

          local_temp_process->edge_list. push_back(new Edge(DUP_PIPE,
              new EdgeNode(1), new EdgeNode(temp_buf, 0)));
          free(temp_buf);
          local_temp_process->pretty_print(std::cout);
          return_list->push_back(local_temp_process);

          local_temp_process = new Process();
          local_temp_process->host_address = strdup((*it).first.c_str());
          local_temp_process->portnum = hostports[(*it).first.c_str()];

          temp_size = snprintf(NULL, 0, "arb_awk_%s",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(local_temp_process->process_id, temp_size + 1, "arb_awk_%s",
              cleanhostnames[(*it).first].c_str());

          temp_cmd = new vector<char *> ();
          temp_cmd->push_back(strdup("awk"));
          temp_cmd->push_back(strdup("'{print $1 \" arb_pt_server\"}'"));
          local_temp_process->command_args = *temp_cmd;

          temp_size = snprintf(NULL, 0, "gather_%s",
              cleanhostnames[(*it).first].c_str());
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "gather_%s",
              cleanhostnames[(*it).first].c_str());

          local_temp_process->edge_list. push_back(new Edge(DUP_PIPE,
              new EdgeNode(1), new EdgeNode(temp_buf, 151)));
          free(temp_buf);
          local_temp_process->pretty_print(std::cout);
          return_list->push_back(local_temp_process);

#endif
          local_temp_process = new Process();
          local_temp_process->host_address = strdup((*it).first.c_str());
          local_temp_process->portnum = hostports[(*it).first.c_str()];

          temp_size = snprintf(NULL, 0, "poll_%s",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(local_temp_process->process_id, temp_size + 1, "poll_%s",
              cleanhostnames[(*it).first].c_str());

          temp_cmd = new vector<char *> ();
          temp_cmd->push_back(strdup("poll.sh"));
          temp_size = snprintf(NULL, 0, "%d", it->second);
          temp_buf = (char *) malloc(temp_size + 1);
#if BIO_HACK
          snprintf(temp_buf, temp_size + 1, "%d", it->second + 1);
#else
          snprintf (temp_buf, temp_size + 1, "%d", it->second);
#endif
          temp_cmd->push_back(strdup(temp_buf));
          local_temp_process->command_args = *temp_cmd;
          free(temp_buf);

          temp_size = snprintf(NULL, 0, "poll_%s_localhost",
              cleanhostnames[(*it).first].c_str());
          temp_buf = (char *) malloc(temp_size + 1);
          snprintf(temp_buf, temp_size + 1, "poll_%s_localhost",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->edge_list. push_back(new Edge(DUP_PIPE,
              new EdgeNode(1), new EdgeNode(temp_buf, 0)));
          free(temp_buf);
          return_list->push_back(local_temp_process);

          local_temp_process = new Process();
          local_temp_process->host_address = strdup(localhost);
          local_temp_process->portnum = default_port;
          temp_size = snprintf(NULL, 0, "poll_%s_localhost",
              cleanhostnames[(*it).first].c_str());
          local_temp_process->process_id = (char *) malloc(temp_size + 1);
          snprintf(local_temp_process->process_id, temp_size + 1,
              "poll_%s_localhost", cleanhostnames[(*it).first].c_str());
          temp_cmd = new vector<char *> ();
          temp_cmd->push_back(strdup("cat"));
          local_temp_process->command_args = *temp_cmd;
          temp_size = snprintf(NULL, 0, "%s%s.psdata", temp_tee_dir,
              (*it).first.c_str()) + 1;
          temp_path = (char *) malloc(temp_size);
          snprintf(temp_path, temp_size, "%s%s.psdata", temp_tee_dir,
              (*it).first.c_str());
          local_temp_process->edge_list. push_back(new Edge(DUP_WRITE,
              new EdgeNode(1), new EdgeNode(temp_path)));
          free(temp_path);
          return_list->push_back(local_temp_process);
        }
    }
  free(temp_tee_dir);
  return 1;
}

static void
deallocateVector(vector<Process *> v)
{
  for (vector<Process *>::const_iterator iter = v.begin(); iter != v.end(); ++iter)
    {
      delete *iter;
    }

  return;
}

int
main(int argc, char **argv)
{
  string temp;
  vector<Process *> original_session_processes;
  vector<Process *> localhost_process_list;
  vector<host_info *> host_list;
  char *temp_tee_dir;
  char *teeoutfilepath;
  ofstream teeoutfile;
  int temp_size;
  int ret;
  unsigned int list_pos;
  struct stat stat_buf;
  Process *temp_process;
  vector<Process *> new_process_list;
  vector<Process *> replaced_hosts_list;
  vector<Process *> poll_replaced_hosts_list;
  vector<Process *> optimized_fanout_list;
  vector<Process *> teed_process_list_original;
  vector<Process *> teed_process_list_hosts_removed;
  vector<Process *> teed_process_list_original_temp;

  ret = parse_options(argc, argv);
  if (ret != 0)
    return ret;

  if (output_dir == NULL)
    {
      output_dir = strdup("/tmp/");
    }

  if (add_hosts && infile != NULL)
    {
      if (-1 == readHosts(infile, &host_list))
        return -1;
    }

  try
    {
      if (yyparse() != 0)
        return 1;
    }
  catch (const char *ex)
    {
      fprintf(stderr, "Caught exception `%s'\n", ex);
      return 1;
    }

  temp_process = NULL;

  list_pos = 0;

  for (vector<Process *>::const_iterator ii = session_processes.begin(); ii
      != session_processes.end(); ii++)
    {
      temp_process = new Process(**ii);
      original_session_processes.push_back(temp_process);
    }

  if (remove_hosts)
    {
      if (!removeHosts(original_session_processes, &replaced_hosts_list,
          host_list, localhost, default_port))
        {
          return -1;
        }
    }

  if (do_tee)
    {
      teeConfig(original_session_processes, &teed_process_list_original,
          output_dir, -1, do_monitor);
      for (int i = 0; i < num_tees; ++i)
        {
          temp_size = snprintf(NULL, 0, "%s/base_tee_data-%d", output_dir, i)
              + 1;
          temp_tee_dir = (char *) malloc(temp_size);
          snprintf(temp_tee_dir, temp_size, "%s/base_tee_data-%d", output_dir,
              i);

          if ((stat(temp_tee_dir, &stat_buf) == -1) && (mkdir(temp_tee_dir,
              (S_IRWXU | S_IRWXG | S_IRWXO)) == -1))
            {
              fprintf(stderr, "Could not open/create directory `%s': %s\n",
                  tee_dir, strerror(errno));
              free(temp_tee_dir);
              return -1;
            }
          free(temp_tee_dir);

          temp_size = snprintf(NULL, 0, "%s/tee-%d.conf", output_dir, i);
          teeoutfilepath = (char *) malloc(temp_size + 1);
          snprintf(teeoutfilepath, temp_size + 1, "%s/tee-%d.conf", output_dir,
              i);
          if (remove_hosts)
            {
              teeConfig(replaced_hosts_list, &teed_process_list_hosts_removed,
                  output_dir, i, do_monitor);
              if (do_timing)
                teeTimeConfig(replaced_hosts_list, output_dir, i);
              if (!writeConfig(teed_process_list_hosts_removed, teeoutfilepath))
                {
                  fprintf(stderr, "Error writing tee output file! `%s': %s\n",
                      teeoutfilepath, strerror(errno));
                }
              else
                {
                  fprintf(stderr, "Wrote tee output file! `%s'\n",
                      teeoutfilepath);
                }
              deallocateVector(teed_process_list_hosts_removed);
              teed_process_list_hosts_removed.clear();
            }
          else
            {
              teeConfig(original_session_processes,
                  &teed_process_list_original_temp, output_dir, i, do_monitor);
              if (do_timing)
                teeTimeConfig(original_session_processes, output_dir, i);
              if (!writeConfig(teed_process_list_original_temp, teeoutfilepath))
                {
                  fprintf(stderr, "Error writing tee output file! `%s': %s\n",
                      teeoutfilepath, strerror(errno));
                }
              deallocateVector(teed_process_list_original_temp);
              teed_process_list_original_temp.clear();
            }
          free(teeoutfilepath);
        }

      temp_size = snprintf(NULL, 0, "%s/original.conf", output_dir);
      teeoutfilepath = (char *) malloc(temp_size + 1);
      snprintf(teeoutfilepath, temp_size + 1, "%s/original.conf", output_dir);

      if (!writeConfig(original_session_processes, teeoutfilepath))
        {
          fprintf(stderr, "Error writing to output file! `%s': %s\n",
              teeoutfilepath, strerror(errno));
        }
      free(teeoutfilepath);
    }

  if (remove_hosts)
    {
      temp_size = snprintf(NULL, 0, "%s/hosts_replaced.conf", output_dir);
      teeoutfilepath = (char *) malloc(temp_size + 1);
      snprintf(teeoutfilepath, temp_size + 1, "%s/hosts_replaced.conf",
          output_dir);

      if (optimize_fanouts)
        {
          optimizeFanouts(replaced_hosts_list, &optimized_fanout_list);
          if (!writeConfig(optimized_fanout_list, teeoutfilepath))
            {
              fprintf(stderr, "Error writing to output file! `%s': %s\n",
                  teeoutfilepath, strerror(errno));
            }
        }
      else if (poll_hosts_replaced)
        {
          add_monitor_processes(replaced_hosts_list, &poll_replaced_hosts_list,
              output_dir);
          if (!writeConfig(poll_replaced_hosts_list, teeoutfilepath))
            {
              fprintf(stderr, "Error writing to output file! `%s': %s\n",
                  teeoutfilepath, strerror(errno));
            }
        }
      else
        {
          if (!writeConfig(replaced_hosts_list, teeoutfilepath))
            {
              fprintf(stderr, "Error writing to output file! `%s': %s\n",
                  teeoutfilepath, strerror(errno));
            }
        }
      free(teeoutfilepath);
    }

  if (do_network)
    {
      if (remove_hosts)
        createNetworkConfigs(replaced_hosts_list, output_dir);
      else
        createNetworkConfigs(original_session_processes, output_dir);
    }

  if (do_cpu)
    {
      if (remove_hosts)
        createCPUConfigs(replaced_hosts_list, output_dir);
      else
        createCPUConfigs(original_session_processes, output_dir);
    }

  if (write_hosts && outfile != NULL)
    {
      for (vector<struct host_info *>::iterator iter = host_list.begin(); iter
          != host_list.end(); ++iter)
        {
          fprintf(outfile, "%s:%u\n", (*iter)->hostname, (*iter)->port);
        }
      fclose(outfile);
    }

  if (add_hosts || write_hosts || remove_hosts)
    {
      for (vector<struct host_info *>::iterator iter = host_list.begin(); iter
          != host_list.end(); ++iter)
        {
          if ((*iter)->hostname != NULL)
            {
              free((*iter)->hostname);
            }
          free((*iter));
        }
    }
  deallocateVector(session_processes);
  deallocateVector(original_session_processes);
  deallocateVector(new_process_list);
  deallocateVector(replaced_hosts_list);
  deallocateVector(teed_process_list_original);
  deallocateVector(teed_process_list_hosts_removed);
  deallocateVector(teed_process_list_original_temp);

  return 0;
}
