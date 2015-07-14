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
 * @file filters/fanin.c
 * @brief filter that processes all input
 *        file descriptors in round-robin fashion and
 *        writes the inputs to stdout.  If one of the
 *        input streams dies, merging will continue
 *        with the others.  Lines not terminated with
 *        a newline and incomplete blocks will be discarded.
 * @author Christian Grothoff
 * @author Min Qi
 */

#include "dup_filter_lib.h"

/**
 * @brief Information per input stream for fanin.
 */
struct InputBuffer
{
  size_t size;
  size_t v_start;
  size_t v_count;
  size_t sidx;
  char *buf;
};

/**
 * Are we operating in newline mode?
 */
static int newline;

/**
 * Output the given line.
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
  int ret;

  ret = DUP_write_all (1, start, 1 + (end - start));
  if (ret == 0)
    exit (0);
  return 0;                     /* one line at a time! */
}

/**
 * The given fd is no longer ready for
 * reading.  Close it and update ib
 * accordingly.
 *
 * @param fd file descriptor to close
 * @param ib buffers to update
 */
static void
close_entry (int fd, struct InputBuffer *ib)
{
  close (fd);
  if (newline)
    free (ib->buf);
  ib->buf = NULL;
  ib->size = 0;
  ib->v_start = 0;
  ib->v_count = 0;
  ib->sidx = 0;
}

int
main (int argc, char *argv[])
{
  char *sbuf = NULL;
  fd_set readset;
  size_t buf_size;
  int ret;
  int infd;
  int maxfd;
  unsigned int numfd;
  struct InputBuffer *ibs;
  struct InputBuffer *ib;
  struct rlimit rl;

  newline = DUP_parse_record_size_arguments (argc, argv, &buf_size);
  if (newline < 0)
    return 1;
  if (!newline)
    sbuf = malloc (buf_size);   /* one big shared buffer */
  DUP_ignore_sigpipe ();

  /* determine open file descriptors */
  FD_ZERO (&readset);
  maxfd = 0;
  numfd = 0;
  getrlimit (RLIMIT_NOFILE, &rl);
  for (infd = 0; infd < rl.rlim_cur; infd++)
    {
      if ((infd == 1) || (infd == 2))
        continue;
      if (DUP_get_fd (infd) == 1)
        {
          maxfd = infd;
          FD_SET (infd, &readset);
          numfd++;
        }
    }
  rl.rlim_cur = maxfd + 1;

  /* allocate buffers for each of the input files */
  ibs = calloc (rl.rlim_cur, sizeof (struct InputBuffer));
  while (1)
    {
      for (infd = 0; infd < (maxfd + 1); infd++)
        {
          if (!FD_ISSET (infd, &readset))
            continue;
          ib = &ibs[infd];
          if (ib->buf == NULL)
            {
              if (newline)
                ib->buf = malloc (buf_size);
              else
                ib->buf = sbuf; /* can share */
              ib->size = buf_size;
            }
          if ( (newline) && (ib->v_count > ib->sidx))
            {
              ret =
                DUP_try_process_line (ib->buf,
                                      &ib->sidx,
                                      &ib->v_start,
				      &ib->v_count,
                                      ib->size,
				      &process_input, NULL);
              if (ret == 0)
                continue;       /* line processed */
            }

          /* not newline mode or ret == 2, which means
             no newline in buf; in both cases, read more! */
          while (1)
            {	      
              if (newline)
                ret =
                  DUP_try_read_line (infd, 
				     &ib->buf, &ib->size,
                                     &ib->v_start, &ib->v_count,
				     &process_input, NULL);
              else
                ret =
                  DUP_try_read_block (infd, ib->buf, ib->size,
                                      &ib->v_count, &process_input,
                                      NULL);
	      if (ret == 1)
		{
		  /* no new-line found, don't match this part again */
		  ib->sidx = ib->v_count;
		}
              if (ret == 0)
                {
                  /* record processed */
                  break;
                }
              if (ret < 0)
                {
                  /* EOF */
                  close_entry (infd, ib);
                  FD_CLR (infd, &readset);
                  while ((!FD_ISSET (maxfd, &readset)) && (maxfd > 0))
                    maxfd--;
                  numfd--;
                  if (numfd == 0)
                    exit (0);
                  break;
                }
            }
        }
    }
  if (!newline)
    free (sbuf);
  free (ibs);
  return 0;
}
