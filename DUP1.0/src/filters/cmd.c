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
 * @file filters/cp.c
 * @brief filter that reads commands from FD 1,
 *        runs them and writes the stdout output
 *        from those commands to stdout and the
 *        stderr output from the commands to
 *        stderr and the status codes to FD 3
 *        (one per line).  cp only terminates
 *        if stdin is closed.
 * @author Christian Grothoff
 */

#include "dup_filter_lib.h"
#include <sys/wait.h>

/**
 * Is FD 3 open?
 */
static int fd_3_open;

/**
 * Run the given command.  Wait for its completion
 * and print the exit code to FD 3.
 */
static void
run_command (char **argv)
{
  pid_t pid;
  int status;
  char buf[64];
  pid = fork ();
  if (pid == 0)
    {
      execvp (argv[0], argv);
      fprintf (stderr, "exec failed: %s\n", strerror (errno));
      exit (1);
    }
  if (pid != waitpid (pid, &status, 0))
    {
      fprintf (stderr, "waitpid failed: %s\n", strerror (errno));
      return;
    }
  sprintf (buf, "%d %d %d\n", WEXITSTATUS (status),
           WIFSIGNALED (status) ? WTERMSIG (status) : 0,
           WIFSIGNALED (status) ? WCOREDUMP (status) : 0);
  if ((fd_3_open) && (1 != DUP_write_all (3, buf, strlen (buf))))
    fd_3_open = 0;
}


/**
 * States for the parser state machine.
 */
enum PState
{ P_INIT, P_DQUOTE, P_EDQUOTE, P_SQUOTE, P_CHAR, P_ECHAR,
};

/**
 * Process the given command line.
 */
static int
process_line (void *unused, char *line, char *end_char)
{
  size_t len;
  char *spos;
  char *wpos;
  char *pos;
  char **argv;
  unsigned int argp;
  enum PState state;
  len = end_char - line;
  argv = malloc (sizeof (char *) * (len + 1));  /* large over-estimate... */
  spos = line;
  wpos = line;
  pos = line;
  argp = 0;
  state = P_INIT;
  while (pos != end_char)
    {
      switch (state)
        {
        case P_INIT:
          switch (*pos)
            {
            case '\t':
            case ' ':
              pos++;
              break;
            case '\\':
              state = P_ECHAR;
              pos++;
              break;
            case '"':
              state = P_DQUOTE;
              pos++;
              break;
            case '\'':
              state = P_SQUOTE;
              pos++;
              break;
            default:
              state = P_CHAR;
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          break;
        case P_DQUOTE:
          switch (*pos)
            {
            case '"':
              state = P_CHAR;
              pos++;
              break;
            case '\\':
              pos++;
              state = P_EDQUOTE;
              break;
            default:
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          break;
        case P_EDQUOTE:
          switch (*pos)
            {
            case 't':
              *wpos = '\\';
              wpos++;
              *wpos = 't';
              wpos++;
              pos++;
              break;
            case 'n':
              *wpos = '\\';
              wpos++;
              *wpos = 'n';
              wpos++;
              pos++;
              break;
            default:
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          state = P_DQUOTE;
          break;
        case P_SQUOTE:
          switch (*pos)
            {
            case '\'':
              state = P_CHAR;
              pos++;
              break;
            default:
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          break;
        case P_CHAR:
          switch (*pos)
            {
            case '\t':
            case ' ':
              *wpos = '\0';
              argv[argp++] = spos;
              pos++;
              state = P_INIT;
              spos = pos;
              wpos = pos;
              break;
            case '\\':
              state = P_ECHAR;
              pos++;
              break;
            case '"':
              state = P_DQUOTE;
              pos++;
              break;
            case '\'':
              state = P_SQUOTE;
              pos++;
              break;
            default:
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          break;
        case P_ECHAR:
          switch (*pos)
            {
            case 't':
              *wpos = 't';
              wpos++;
              pos++;
              break;
            case 'n':
              *wpos = 'n';
              wpos++;
              pos++;
              break;
            default:
              *wpos = *pos;
              wpos++;
              pos++;
              break;
            }
          state = P_CHAR;
          break;
        }
    }
  switch (state)
    {
    case P_CHAR:
      *wpos = '\0';
      argv[argp++] = spos;
      break;
    case P_INIT:
      break;
    default:
      /* yes, len could go negative with the typecast, fprint will just
         ignore it then, or so it appears */
      fprintf (stderr, "command `%.*s' has unbalanced quotes, skipped!\n",
               (int) len, line);
      free (argv);
      return 1;
    }
  argv[argp] = NULL;
  run_command (argv);
  free (argv);
  return 1;
}

int
main (int argc, char *argv[])
{
  char *buf;
  size_t buf_size;
  size_t pos;  
  size_t vpos;
  DUP_ignore_sigpipe ();
  fd_3_open = DUP_get_fd (3);
  if (argc > 1)
    run_command (&argv[1]);
  if (DUP_get_fd (0) != 1)
    return 0;
  pos = 0;
  vpos = 0;
  buf_size = DEFAULT_BUF_SIZE;
  buf = malloc (buf_size + 1);
  while (1 ==
         DUP_try_read_line (0, &buf, &buf_size, &vpos, &pos, &process_line, NULL));
  free (buf);
  return 0;
}
