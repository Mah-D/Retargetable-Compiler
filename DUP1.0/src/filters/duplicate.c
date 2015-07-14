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
 * @file filters/duplicate.c
 * @brief filter that reads from stdin and writes
 *        out each record n times.  Line or record based.
 * @author Christian Grothoff
 */


#include "dup_filter_lib.h"

/**
 * How often should we duplicate?
 */
static unsigned int n;

/**
 * Should we duplicate the first line forever?
 */
static int forever;

/**
 * Write the content of the given buffer
 * the specified number of times to
 * stdout.
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
  unsigned int i;

  size = 1 + end - start;
  if (forever)
    {
      while (0 != DUP_write_all (1, start, size));
      exit (0);
    }
  else
    {
      for (i = 0; i < n; i++)
        if (0 == DUP_write_all (1, start, size))
          exit (0);
    }
  return 1;
}


int
main (int argc, char *argv[])
{
  size_t buf_size = DEFAULT_BUF_SIZE;
  size_t position;
  size_t vpos;
  char *buffer;
  int ret;
  int newline;

  if (!DUP_get_fd (1))
    return 0;
  newline = 1;
  switch (argc)
    {
    case 1:
      newline = 1;
      n = 2;
      break;
    case 3:
      newline = DUP_parse_record_size_arguments (argc - 1,
                                                 &argv[1], &buf_size);
      /* fall through! */
    case 2:
      if (0 == strcmp ("*", argv[1]))
        forever = 1;
      else if (1 != sscanf (argv[1], "%u", &n))
        {
          fprintf (stderr,
                   "Illegal argument `%s' (must be number or `*')\n",
                   argv[1]);
          exit (1);
        }
      break;
    default:
      fprintf (stderr, "Illegal number of arguments\n");
      exit (1);
    }
  if (newline < 0)
    return 1;
  DUP_ignore_sigpipe ();
  buffer = malloc (buf_size);
  position = 0;
  vpos = 0;
  while (1)
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
