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
 * @file filters/mgrep.c
 * @brief filter that matches lines against a regular
 *        expression and writes matching lines to stdout
 *        and non-matching lines to FD 3.  If either
 *        FD 1 or FD 3 is still availalbe, locate will
 *        continue to process.
 * @author Christian Grothoff
 * @author Jasmine Garoot
 */

#include "dup_filter_lib.h"
#include <sys/types.h>
#include <regex.h>

/**
 * Which file descriptors are already closed?
 * Bitmask with values 0 for none, (1<<1) for
 * FD 1 and (1<<3) for FD 3.
 */
static int closed;

/**
 * Match the given buffer against the regular expression
 * and take the appropriate action.
 *
 * @param regex pointer to regex, the regular expression
 * @param start start of the data; will contain
 *        data until end, which may or may not include
 *        a newline; buf will extend at least one byte
 *        beyond end, so end[1] can be modified
 *        (but must be restored).
 * @param end newline indicating end of data
 * @return -1 on serious errors,
 *          0 if we are done processing (with success)
 *          1 to continue processing
 */
static int
process_input (void *regex, char *buf, char *end)
{
  regex_t *rs = regex;
  size_t blen;
  int ret;
  int wret;
  int fd;
  char old;

  blen = 1 + (end - buf);
  old = buf[blen];
  buf[blen] = '\0';
  ret = regexec (rs, buf, 0, NULL, 0);
  buf[blen] = old;
  fd = (ret == REG_NOMATCH) ? 3 : 1;
  if (0 != (closed & (1 << fd)))
    return 1;
  wret = DUP_write_all (fd, buf, blen);
  if (wret == 0)
    {
      closed |= (1 << fd);
      if (closed == ((1 << 1) | (1 << 3)))
        return 0;
    }
  return 1;
}

int
main (int argc, char *argv[])
{
  char err_msg[256];
  regex_t regstr;
  int retval;
  char *buf;
  size_t buf_size;
  size_t position;
  size_t vpos;
  int ret;

  if (argc < 2)
    {
      fprintf (stderr, "Usage: mgrep REGEXP\n");
      exit (1);
    }
  if (0 != (retval = regcomp (&regstr, argv[1], REG_EXTENDED)))
    {
      regerror (retval, &regstr, err_msg, sizeof (err_msg));
      fprintf (stderr,
               "Error analyzing regular expression `%s': %s\n",
               argv[1], err_msg);
      exit (1);
    }
  DUP_ignore_sigpipe ();
  if (!DUP_get_fd (1))
    closed |= (1 << 1);
  if (!DUP_get_fd (3))
    closed |= (1 << 3);
  buf_size = DEFAULT_BUF_SIZE;
  buf = malloc (buf_size + 1);
  position = 0;
  vpos = 0;
  while (1 == (ret = DUP_try_read_line (0,
                                        &buf,
                                        &buf_size,
					&vpos,
                                        &position, &process_input, &regstr)));
  free (buf);
  regfree (&regstr);
  return 0;
}
