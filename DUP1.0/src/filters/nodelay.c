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
 * @file filters/nodelay.c
 * @brief filter that disables Nagle's algorith for a particular socket
 *        (and then runs another filter to do the actual work)
 */

#include <stdio.h>
#include <string.h>
#include <errno.h>
#include <unistd.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netinet/tcp.h>

int
main (int argc,
      char **argv)
{
  static int on = 1;
  int sock;

  if (argc < 3)
    {
      fprintf (stderr,
	       "Need at least three arguments\n");
      return 1;
    }
  if (1 != sscanf (argv[1],
		   "%d",
		   &sock))
    {
      fprintf (stderr,
	       "First argument must be a socket number\n");
      return 1;
    }
  if (0 != setsockopt (sock,
		       IPPROTO_TCP,
		       TCP_NODELAY,
		       (char*) &on,
		       sizeof(on)))
    {
      fprintf (stderr,
	       "Error disabling Nagle's algorithm: %s\n",
	       strerror(errno));
      /* keep going anyway */
    }
  execvp (argv[2], &argv[2]);
  fprintf (stderr,
	   "Error running `%s': %s\n",
	   argv[2],
	   strerror (errno));
  return 1;
}
