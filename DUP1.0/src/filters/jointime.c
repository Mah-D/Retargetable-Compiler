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
 * @file filters/jointime.c
 * @brief print time in milliseconds to stderr after forked process terminates
 */
#include <stdio.h>
#include <sys/time.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <signal.h>
#include <unistd.h>
#include <stdlib.h>

int
main (int argc, char **argv)
{
  struct timeval tv;
  pid_t p;
  int status;

  p = vfork ();
  if (-1 == p)
    {
      perror ("fork");
      return 1;
    }
  if (0 == p)
    {
      execvp (argv[1], &argv[1]);
      exit (1);
    }
  if (p != waitpid (p, &status, 0))
    {
      perror ("waitpid");
      return 1;
    }
  gettimeofday (&tv, NULL);
  fprintf (stderr,
	   "%llu\n",
	   ((unsigned long long) tv.tv_sec) * 1000 + tv.tv_usec / 1000);
  if (WIFSIGNALED(status))
    {
      kill (getpid(), WTERMSIG (status));
      return 1; /* should we survive the signal */
    }
  return WEXITSTATUS (status);
}
