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

/*
 * @author Nathan Evans
 * @brief start command with a funky name
 */
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int
main (int argc, char **argv)
{
  int pid;
  int size;
  int ret;
  int fd;
  char *buf;

  if (argc < 4)
    {
      fprintf (stderr,
               "%s FD CMD NEWCMDNAME PROCESSID where:\n\tFD is FD to write pid to\n\tCMD is the command to be run\n\tNEWCMDNAME is the name to call CMD\n\tPROCESSID is the DUP process identifier\n\tARGS are any other arguments to CMD\n",
               argv[0]);
      return -1;
    }
  fd = atoi (argv[1]);
  pid = getpid ();
  size = snprintf (NULL, 0, "%d %s\n", pid, argv[4]) + 1;
  buf = (char *) malloc (size);
  snprintf (buf, size, "%d %s\n", pid, argv[4]);
  ret = write (fd, buf, size);
  free (buf);
  close (fd);
  return execvp (argv[2], &argv[4]);
}

/* end of execvother.cc */
