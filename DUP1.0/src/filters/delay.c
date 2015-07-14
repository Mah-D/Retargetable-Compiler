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
 * @file filters/delay.c
 * @brief filter that begins to forward from
 *        stdin to stdout with some delay
 * @author Christian Grothoff
 * @author Nathan Evans
 */

#include "dup_filter_lib.h"

int
main (int argc, char *argv[])
{
  unsigned long long lat;
  struct timeval tv;

  if ((argc != 2) || (1 != sscanf (argv[1], "%llu", &lat)))
    {
      fprintf (stderr, "Invoke delay with the desired latency.\n");
      return 1;
    }
  tv.tv_sec = lat / 1000;
  tv.tv_usec = 1000 * (lat % 1000);
  select (0, NULL, NULL, NULL, &tv);
  execlp ("cat", "delay", "-", NULL);
  fprintf (stderr, "delay: Error executiong `cat': %s\n", strerror (errno));
  return 1;
}
