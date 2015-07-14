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
 * @file filters/faninany.c
 * @brief filter that reads from n inputs and writes to 1 output
 * @author Christian Grothoff
 * @author Matt Rutherford
 * @author Jasmine Garoot
 */

#include "dup_filter_lib.h"

/**
 * @brief Information per input stream for faninany.
 */
struct InputBuffer
{
  size_t width;
  size_t position;
  size_t vpos;
  int valid;
  char *buf;
};

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
  return DUP_write_all (1, start, 1 + (end - start));
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
  free (ib->buf);
  ib->buf = NULL;
  ib->position = 0;
  ib->width = 0;
  ib->valid = 0;
}


/**
 * Read from fd using "*buffer" for buffer management.  When called,
 * "*buffer" already has "*position" valid bytes in it.  Each block is
 * prefixed with a 2-byte big-endian number giving the length of the
 * block (including the 2-byte prefix).  Once a block is complete,
 * call the proc function on it.  If a block is incomplete, leave the
 * remaining characters in "*buffer" for future reference and update
 * "*position" accordingly.
 *
 * @param fd descriptor to read from
 * @param buffer where to read to, big enough for the 16-bit size
 * @param buf_size size of the buffer 
 * @param val_start offset in the buffer where valid data starts; 
 *         note that valid data can wrap around (by reference)
 * @param val_count number of valid bytes already in buffer (by reference)
 * @param proc function to call on each line read
 * @param proc_cls cls argument to the proc function
 * @return 1 to continue processing (success)
 *         0 to abort processing with success
 *           (successful return code from proc)
 *        -1 abort with error (unexpected read error
 *           or abort with error returned by proc)
 *        -2 got EOF reading
 */
static int
try_read_lblock (int fd,
		 char *buffer,
		 size_t buf_size,
		 size_t *val_start,
		 size_t *val_count,
		 DUP_LineProcessor proc,
		 void *proc_cls)
{
  size_t want;
  int ret;
  size_t read_max;
  char *read_start;
  ssize_t read_size;
  
  if ( (*val_start) + (*val_count) < buf_size)
    {
      read_max = buf_size - ( (*val_start) + (*val_count) );
      read_start = &buffer[(*val_start) + (*val_count)];
    }
  else
    {
      read_max = buf_size - (*val_count);
      read_start = &buffer[(*val_start) + (*val_count) - buf_size];
    }
  read_size = DUP_read (fd, read_start, read_max);
  if (read_size <= 0)
    {
#if WARN_SHORT_RECORDS
      if (*val_count > 0)
	fprintf (stderr,
		 "Last record incomplete!\n");
#endif
      return -2;
    }
  *val_count += read_size;
  while ( (*val_count) > 2)
    {
      want = (((unsigned char*)buffer)[*val_start] << 8) + (((unsigned char*)buffer)[((*val_start) + 1) % buf_size]); 
      if ( (*val_count) < want)
	return 1; /* need more data */
      if (buf_size >= (*val_start) + want)
	{
	  /* single block */
	  ret = proc (proc_cls, 
		      &buffer[*val_start], 
		      &buffer[(*val_start) + want - 1]);
	  if (ret != 1)
	    return -1;
	  *val_count -= want;
	  *val_start += want;
	}
      else
	{
	  /* two blocks */
	  ret = proc (proc_cls,
		      &buffer[*val_start],
		      &buffer[buf_size - 1]);
	  if (ret != 1)
	    {
	      /* outch, let's hope we don't get called again (this would
		 always be unclean!) */
	      *val_count = 0;
	      *val_start = 0;
	      return ret;
	    }
	  ret = proc (proc_cls,
		      buffer,
		      &buffer[want + (*val_start) - buf_size - 1]);
	  *val_count -= want;
	  *val_start = (*val_start + want) % buf_size;
	  if (ret != 1)
	    return -1;
	}
    }
  return 1; /* need more data */
}


int
main (int argc, char *argv[])
{
  size_t buf_size;
  int ret;
  int infd;
  int maxfd;
  fd_set readset;
  struct InputBuffer *ibs;
  struct InputBuffer *ib;
  struct rlimit rl;
  int newline = 0;
  int length_prefix;

  if ( (argc == 2) &&
       (0 == strcmp ("S", argv[1])) )
    {
      length_prefix = 1;      
      buf_size = 65536;
    }       
  else
    {
      length_prefix = 0;
      newline = DUP_parse_record_size_arguments (argc, argv, &buf_size);
      if (newline < 0)
	return 1;
    }
  DUP_ignore_sigpipe ();

  /* determine open file descriptors */
  FD_ZERO (&readset);
  maxfd = 0;
  getrlimit (RLIMIT_NOFILE, &rl);
  for (infd = 0; infd < rl.rlim_cur; infd++)
    if ( (infd != 1) && (infd != 2) && (DUP_get_fd (infd) == 1) )
      {
	int flags = fcntl (infd, F_GETFL);
	if (O_WRONLY != (O_ACCMODE & flags))
	  {
	    /* on some systems, additional write-only FDs may be
	       open; ignoring those! */
	    maxfd = infd;
	    FD_SET (infd, &readset);
	  }
	else
	  {
	    fprintf (stderr, "invalid: %d\n", infd);
	  }
      }
  rl.rlim_cur = maxfd + 1;

  /* allocate buffers for each of the input files */
  ibs = calloc (rl.rlim_cur, sizeof (struct InputBuffer));
  for (infd = 0; infd < rl.rlim_cur; infd++)
    if (FD_ISSET (infd, &readset))
      ibs[infd].valid = 1;
  while (1)
    {
      maxfd = -1;
      FD_ZERO (&readset);
      for (infd = 0; infd < rl.rlim_cur; infd++)
        {
          if (!ibs[infd].valid)
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
          ib = &ibs[infd];
          if (ib->buf == NULL)
            {
              ib->buf = malloc (sizeof (char) * buf_size);
              ib->width = buf_size;
            }

	  if (length_prefix)
	    {
	      ret = 
		try_read_lblock (infd, ib->buf, 
				 ib->width, &ib->vpos, &ib->position,
				 &process_input, NULL);
	    }
	  else
	    {
	      if (newline)
		ret =
		  DUP_try_read_line (infd, &ib->buf, &ib->width, &ib->vpos, &ib->position,
				     &process_input, NULL);
	      else
		ret =
		  DUP_try_read_block (infd, ib->buf, ib->width, &ib->position,
				      &process_input, NULL);
	    }
          if (ret <= 0)
            close_entry (infd, ib);
        }
    }
  free (ibs);
  return 0;
}
