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
 * @file filters/deal.c
 * @brief filter that reads from stdin and distributes the
 *        inputs to the open output desciptors.  The order
 *        can be determined by giving it on FD 3; if FD 3
 *        is not connected, deal distributes the inputs
 *        in a round-robin fashion
 *        Line or record based.
 * @author Christian Grothoff
 */


#include "dup_filter_lib.h"

/**
 * Which descriptors are still open for writing?
 */
static fd_set writeset;

/**
 * What is the largest descriptor open for writing?
 */
static int maxfd;

/**
 * How many descriptors are open for writing?
 */
static int numfd;

/**
 * To which descriptor will we write next?
 * (if this one is closed, we will write to
 * the next higher descriptor that is open).
 */
static int nextout;

/**
 * Are we looking for newlines?
 */
static int newline;


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
process_input_rr (void *unused, char *start, char *end)
{
  size_t size;
  int ret;

  size = 1 + end - start;
  ret = 0;
  while (ret == 0)
    {
      while (!FD_ISSET (nextout, &writeset))
        nextout++;
      ret = DUP_write_all (nextout, start, size);
      if (ret == 0)
        {
          FD_CLR (nextout, &writeset);
          while ((!FD_ISSET (maxfd, &writeset)) && (maxfd > 0))
            maxfd--;
          numfd--;
          if (numfd == 0)
	    exit (0);	    
        }
      nextout++;
      if (nextout == maxfd + 1)
        nextout = 0;
    }
  if ( newline && (*end != '\n')) 
    {
      if (nextout > 0)
	nextout--; /* do 2nd half to same FD! */
      else
	nextout = maxfd;
    }
  return 1;
}

/**
 * Write the content of the given buffer to
 * the file descriptor specified by the last
 * read from the deal stream.  If that FD is
 * closed, skip the line.
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
process_input_ds (void *unused, char *start, char *end)
{
  size_t size;
  int ret;

  size = 1 + end - start;
  if (!FD_ISSET (nextout, &writeset))
    {
      nextout = -1;
      return 0;                 /* skip! done! */
    }
  ret = DUP_write_all (nextout, start, size);
  if (ret == 0)
    {
      FD_CLR (nextout, &writeset);
      numfd--;
      if (numfd == 0)
	exit (0);		
    }
  if ( (ret == 1) &&
       newline && 
       (*end != '\n'))
    return 1; /* do 2nd half to same FD! */
  nextout = -1;
  return 0;
}


/**
 * Determine the desired file descriptor
 * from the input.  Abort if that descriptor
 * is no longer open for writing, otherwise
 * set "nextout".
 *
 * @param unused not used
 * @param start start of the data
 * @param end newline indicating end of data
 * @return -1 on serious errors,
 *          0 if we are done processing (with success)
 *          1 to continue processing
 */
static int
parse_next (void *unused, char *start, char *end)
{
  char old = *end;

  if ('\n' != *end)
    abort ();
  *end = '\0';
  if (1 != sscanf (start, "%d", &nextout))
    {
      fprintf (stderr, "Error: `%s' is not a valid number\n", start);
      exit (1);
    }
  *end = old;
  return 0;                     /* done for now! */
}


int
main (int argc, char *argv[])
{
  struct rlimit rl;
  char *buffer;
  size_t buf_size;
  size_t sidx;
  size_t v_start;
  size_t v_count;
  char *fd3_buf;
  size_t fd3_buf_size;
  size_t fd3_v_start;
  size_t fd3_v_count;
  size_t fd3_sidx;
  int outfd;
  int ret;
  int have_fd_3;
  DUP_LineProcessor proc;

  newline = DUP_parse_record_size_arguments (argc, argv, &buf_size);
  if (newline < 0)
    return 1;
  DUP_ignore_sigpipe ();
  have_fd_3 = DUP_get_fd (3);
  proc = have_fd_3 ? &process_input_ds : &process_input_rr;
  fd3_buf_size = 8;
  fd3_v_start = 0;
  fd3_v_count = 0;
  fd3_sidx = 0;
  fd3_buf = malloc (fd3_buf_size + 1);
  /* determine open file descriptors */
  getrlimit (RLIMIT_NOFILE, &rl);
  FD_ZERO (&writeset);
  maxfd = 0;
  numfd = 0;
  for (outfd = 1; outfd < rl.rlim_cur; outfd++)
    {
      if ((outfd == 2) || (outfd == 3))
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
    {
      free (fd3_buf);
      return 0;
    }

  buffer = malloc (buf_size);
  v_start = 0;
  v_count = 0;
  sidx = 0;
  
  if (have_fd_3)
    nextout = -1;
  else
    while (!FD_ISSET (nextout, &writeset))
      nextout++;
  while (numfd > 0)
    {
      if (have_fd_3)
        {
          ret = DUP_try_process_line (fd3_buf,
                                      &fd3_sidx,
                                      &fd3_v_start,
				      &fd3_v_count,
                                      fd3_buf_size,
                                      &parse_next, NULL);
          if (ret == 2)
            {
	      /* make sure our buffer never spans lines since
		 our 'parse_next' cannot handle this */
              memmove (fd3_buf,
                       fd3_buf + fd3_v_start,
		       fd3_v_count);
	      fd3_v_start = 0;
              while ((nextout == -1) && (ret >= 0))
                ret = DUP_try_read_line (3,
                                         &fd3_buf,
                                         &fd3_buf_size, 
					 &fd3_v_start,
					 &fd3_v_count,
                                         &parse_next, NULL);
            }
          if (ret < 0)
            break;
        }
      if (newline)
        {
          ret = DUP_try_process_line (buffer,
                                      &sidx,
                                      &v_start,
				      &v_count,
                                      buf_size, proc, NULL);
          if (ret == 2)
            {
              do
                {
                  ret = DUP_try_read_line (0,
                                           &buffer,
                                           &buf_size,
					   &v_start,
                                           &v_count, proc, NULL);
                }
              while ((nextout >= 0) && (ret >= 0));
            }
        }
      else
        {
          do
            {
              ret = DUP_try_read_block (0,
                                        buffer,
                                        buf_size, &v_count, proc, NULL);
            }
          while ((nextout >= 0) && (ret >= 0));
        }
      if (ret < 0)
        break;
    }
  free (buffer);
  free (fd3_buf);
  return 0;
}
