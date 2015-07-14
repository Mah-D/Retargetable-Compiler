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
 * @file filters/fanout.c
 * @brief filter that reads from stdin and writes to all
 *        open output desciptors.  Line or record based.
 * @author Christian Grothoff
 * @author Matt Rutherford
 * @author Min Qi
 */


#include "dup_filter_lib.h"

static fd_set writeset;

static int maxfd;

static int numfd;

/**
 * Write the content of the given buffer to
 * all file descriptors set in writeset.
 * If writes fail, update the set and
 * maxfd/numfd accordingly.
 *
 * @param unused not used
 * @param start start of the data
 * @param end newline indicating end of data
 * @return -1 on serious errors,
 *          0 if we are done processing (with success)
 *          1 to continue processing
 */
static int
process_input (void *unused, char *start, char *end)
{
  size_t size;
  int outfd;
  int ret;

  size = 1 + end - start;
  for (outfd = 1; outfd < maxfd + 1; outfd++)
    if (FD_ISSET (outfd, &writeset))
      {
        ret = DUP_write_all (outfd, start, size);
        if (ret == 0)
          {
            FD_CLR (outfd, &writeset);
            while ((!FD_ISSET (maxfd, &writeset)) && (maxfd > 0))
              maxfd--;
            numfd--;
          }
      }
  return 1;
}


int
main (int argc, char *argv[])
{
  struct rlimit rl;
  size_t buf_size;
  size_t position;
  size_t vpos;
  char *buffer;
  int newline;
  int outfd;
  int ret;

  newline = DUP_parse_record_size_arguments (argc, argv, &buf_size);
  if (newline < 0)
    return 1;
  DUP_ignore_sigpipe ();

  /* determine open file descriptors */
  getrlimit (RLIMIT_NOFILE, &rl);
  FD_ZERO (&writeset);
  maxfd = 0;
  numfd = 0;
  for (outfd = 1; outfd < rl.rlim_cur; outfd++)
    {
      if (outfd == 2)
        continue;
      if (DUP_get_fd (outfd))
        {
	  int flags = fcntl (outfd, F_GETFL);
	  if (O_RDONLY != (O_ACCMODE & flags)) 
	    {
	      /* on some systems, additional read-only FDs may be
		 open; ignoring those! */
	      FD_SET (outfd, &writeset);
	      maxfd = outfd;
	      numfd++;
	    }
        }
    }
  if (maxfd < 1)
    return 0;

  buffer = malloc (buf_size);
  position = 0;
  vpos = 0;
  while (numfd > 0)
    {
      if (newline)
        ret = DUP_try_read_line (0,
                                 &buffer,
                                 &buf_size, &vpos, &position, &process_input, NULL);
      else
        ret = DUP_try_read_block (0,
                                  buffer,
                                  buf_size, &position, &process_input, NULL);
      if (ret <= 0)
        break;
    }
  free (buffer);
  return 0;
}
