/*
     This file is part of DUP.
     (C) 2010 The DUP team

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
 * @file filters/complete.c
 * @brief start a process,
 *        wait for it to complete, copy filenames specified in arguments to the target system
 *        and then print a '.\n' to signal completion
 * @author Christian Grothoff
 */
#include "DUP_config.h"
#include "dup_filter_lib.h"
#include <sys/wait.h>
#include <sys/stat.h>

#define MAX_LINE 65536

#define MAX_ARGS 1024

static void
scp (const char *hostname,
     const char *filename)
{
  char cmd[MAX_LINE];

  snprintf (cmd,
	    MAX_LINE,
	    "scp %s %s:%s",
	    filename,
	    hostname,
	    filename);
  if (0 != system (cmd))
    {
      fprintf (stderr, 
	       "system call `%s' failed: %s\n",
	       cmd,
	       strerror (errno));
      exit (1);
    }
}


int
main (int argc, char *argv[])
{
  struct stat sbuf[argc];
  unsigned int arg;
  pid_t pid;
  int status;
  int fd;

  if (argc <= 4) 
    {
      fprintf (stderr, "Invoke complete with target hostname and command.\n");
      return 1;
    }
  if ((argc != 2) || (1 != sscanf (argv[1], "%d", &fd)))
    {
      fprintf (stderr, "First argument must be file descriptor for signalling completion\n");
      return 1;
    }

  /* check for existing files */
  for (arg=4;arg<argc;arg++)
    {
      if (0 != stat (argv[arg], &sbuf[arg]))
	memset (&sbuf[arg], 0, sizeof (struct stat));
    }
  /* run command */
  pid = fork ();
  if (-1 == pid)
    {
      fprintf (stderr,
	       "fork failed: %s\n",
	       strerror (errno));
      exit (1);
    }
  if (0 == pid)
    {
      execvp (argv[3], &argv[3]);
      fprintf (stderr,
	       "execvp `%s' failed: %s\n",
	       argv[3],
	       strerror (errno));
      _exit (1);
    }
  /* wait for termination */
  while (0 != waitpid (pid, &status, 0))
    {
      if (errno != EINTR)
	{
	  fprintf (stderr, 
		   "waitpid failed: %s\n",
		   strerror (errno));
	  exit (1);
	}
    }
  if (WIFSIGNALED (status))
    {      
      fprintf (stderr,
	       "process `%s' got killed by signal %d\n",
	       argv[3],
	       WTERMSIG (status));
      exit (1);
    }
  if (!WIFEXITED (status))
    {
      fprintf (stderr, 
	       "Internal logic error.\n");
      exit (2);
    }
  /* copy files back */
  for (arg=4;arg<argc;arg++)
    {
      if ( (0 == stat (argv[arg], &sbuf[0])) &&
	   (sbuf[0].st_mtime != sbuf[arg].st_mtime) )
	scp (argv[2], argv[arg]);
    }
  /* signal completion by printing */
  if (-1 == DUP_write_all (fd, ".\n", 2))
    {
      fprintf (stderr, 
	       "Failed to signal completion.\n");
      return 1;
    }
  return WEXITSTATUS (status);
}

/* end of complete.c */
