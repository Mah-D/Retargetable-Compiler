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
 * @file filters/holmerge.c
 * @brief filter that merges any number of input streams
 *        (that are presumably identical) and always writes
 *        the one that has so far produced the most data
 *        to stdout (head-of-line merge).
 * @author Christian Grothoff
 */

#include "dup_filter_lib.h"
int
main (int argc, char *argv[])
{
  int ret;
  int infd;
  int maxfd;
  fd_set readset;
  size_t *ib_pos;
  int *is_valid;
  char buf[DEFAULT_BUF_SIZE];
  struct rlimit rl;
  size_t hol;
  size_t max_read;
  ssize_t read_ret;
  if (argc != 1)

    {
      fprintf (stderr, "Error: holmerge takes no arguments.\n");
      return 1;
    }
  DUP_ignore_sigpipe ();

  /* determine open file descriptors */
  FD_ZERO (&readset);
  maxfd = 0;
  getrlimit (RLIMIT_NOFILE, &rl);
  for (infd = 0; infd < rl.rlim_cur; infd++)
    if (DUP_get_fd (infd) == 1)
      {
	int flags = fcntl (infd, F_GETFL);
	if (O_WRONLY != (O_ACCMODE & flags))
	  {
	      /* on some systems, additional write-only FDs may be
		 open; ignoring those! */
	    maxfd = infd;
	    FD_SET (infd, &readset);
	  }
      }
  rl.rlim_cur = maxfd + 1;
  ib_pos = calloc (rl.rlim_cur, sizeof (size_t));
  is_valid = calloc (rl.rlim_cur, sizeof (int *));
  for (infd = 0; infd < rl.rlim_cur; infd++)
    if (FD_ISSET (infd, &readset))
      is_valid[infd] = 1;
  hol = 0;
  while (1)

    {
      maxfd = -1;
      FD_ZERO (&readset);
      for (infd = 0; infd < rl.rlim_cur; infd++)

        {
          if ((infd == 1) || (infd == 2))
            continue;
          if (!is_valid[infd])
            continue;
          FD_SET (infd, &readset);
          maxfd = infd;
        }
      if (maxfd == -1)

        {

          /* no file descriptors available, terminate! */
          break;
        }
      DUP_select (maxfd + 1, &readset, NULL, NULL);
      for (infd = 0; infd < (maxfd + 1); infd++)

        {
          if (!FD_ISSET (infd, &readset))
            continue;
          if ((hol > ib_pos[infd]) && (hol - ib_pos[infd] < sizeof (buf)))
            max_read = hol - ib_pos[infd];

          else
            max_read = sizeof (buf);
          read_ret = DUP_read (infd, buf, max_read);
          if (read_ret == 0)

            {
              close (infd);
              is_valid[infd] = 0;
              continue;
            }
          ib_pos[infd] += read_ret;
          if (hol < ib_pos[infd])

            {
              ret = DUP_write_all (1, buf, ib_pos[infd] - hol);
              if (ret == 0)
                return 0;
              hol = ib_pos[infd];
            }
        }
    }
  free (ib_pos);
  free (is_valid);
  return 0;
}
