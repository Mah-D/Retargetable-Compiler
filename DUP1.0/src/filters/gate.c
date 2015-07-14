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
 * @file filters/gate.c
 * @brief filter that reads from FD 3 writes to stdout until
 *        input arrives at stdin
 * @author Christian Grothoff
 */

#include "dup_filter_lib.h"

/**
 * Try running "cat" instead of this process
 * (we assume that cat would be simpler / faster).
 * This can be done once we know that stdin is
 * closed for good.
 */
static void
try_cat ()
{
  if (-1 != dup2 (3, 0))

    {
      execlp ("cat", "gate", "-", NULL);
      close (0);
    }
}

int
main (int argc, char *argv[])
{
  fd_set readset;
  fd_set writeset;
  char buf[DEFAULT_BUF_SIZE];
  ssize_t rret;
  ssize_t wret;
  size_t pos;
  int stdin_open;
  if (argc != 1)

    {
      fprintf (stderr, "gate takes no arguments\n");
      return 1;
    }
  DUP_ignore_sigpipe ();
  stdin_open = 1;
  if (DUP_get_fd (3) != 1)
    return 0;
  if (DUP_get_fd (0) != 1)

    {
      stdin_open = 0;
      try_cat ();
    }
  rret = 0;
  pos = 0;
  while (1)

    {
      FD_ZERO (&readset);
      FD_ZERO (&writeset);
      if (stdin_open)
        FD_SET (0, &readset);
      if (rret == 0)
        FD_SET (3, &readset);
      else
        FD_SET (1, &writeset);
      DUP_select (4, &readset, &writeset, NULL);
      if (FD_ISSET (0, &readset))
        break;
      if (FD_ISSET (3, &readset))

        {
          rret = DUP_read (3, buf, sizeof (buf));
          if (rret == 0)
            break;
        }
      if (FD_ISSET (1, &writeset))

        {
          wret = DUP_write (1, &buf[pos], rret - pos);
          if (wret == 0)
            break;
          pos += wret;
          if (pos == rret)

            {
              rret = 0;
              pos = 0;
            }
        }
    }
  return 0;
}
