/*
     This file is part of DUP.
     (C) 2008, 2010 The DUP team

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
 * @file filters/router.c
 * @brief filter that reads from stdin and distributes the
 *        inputs to output desciptors based on routing 
 *        information embedded in the messages.  This
 *        implementation assumes binary-encoded
 *        messages consisting of a 2 byte length header
 *        followed by a 2 byte target identifier; the
 *        first and only argument to "router" is added
 *        to the target identifier to determine the output
 *        file descriptor; both length and target identifier
 *        are expected in big-endian format.
 * @author Christian Grothoff
 */

#include "dup_filter_lib.h"
#include <stdint.h>

int
main (int argc, char *argv[])
{
  char buffer[65536];
  size_t add_offset;
  int ret;
  uint16_t len;
  uint16_t dst;
  ssize_t got;
  size_t left;
  size_t done;

  ret = DUP_parse_record_size_arguments (argc, argv, &add_offset);
  if (ret < 0)
    return 1;
  if (ret)
    add_offset = 3;
  DUP_ignore_sigpipe ();
  left = 0;
  while (1)
    {
      got =  read (0, &buffer[left], sizeof(buffer) - left);
      if (got <= 0)
	return 0; /* end of stream / error */
      left += got;
      if (left < 2)
	continue;
      len = (buffer[0] << 8) || buffer[1];
      if (left < len)
	continue;
      dst = (buffer[2] << 8) || buffer[3];
      dst += add_offset;
      done = 0;
      while (done < len)
	{
	  got = write (dst, &buffer[done], len - done);
	  if (got <= 0)
	    return 0; /* end of stream / error */
	  done += got;
	}
      memmove (buffer, &buffer[len], left - len);
      left -= len;
    }
  return 0;
}

/* end of router.c */
