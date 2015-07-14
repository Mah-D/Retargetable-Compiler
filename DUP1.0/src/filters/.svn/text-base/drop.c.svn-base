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
 * @file filters/drop.c
 * @brief filter that drops a number of records from the
 *        beginning or the end of a stream. Dropped records
 *        are sent to stderr. * can be used to indicate that
 *        all records are dropped.
 * @author Chris GauthierDickey
 */
#include "dup_filter_lib.h"
#include "cbuffer.h"

#define USAGE "Usage: drop [first [last [ record_size ]]], where first and last are\n    the number of lines or records to drop and record_size indicates the\n    size of the records, or 0 for lines instead.\n"

int drop_filter (long long int first, long long int last, size_t records);

int parse_args (int argc, char *argv[],
                long long int *first, long long int *last,
                unsigned long *record_size);

int drop_head_lines (long long int drop_total, struct cbuffer *cbuf);

int drop_head_records (long long int drop_total, size_t record_size,
                       struct cbuffer *cbuf);

int drop_tail_lines (long long int drop_total, struct cbuffer *cbuf);

int drop_tail_records (long long int drop_total, size_t record_size,
                       struct cbuffer *cbuf);


/* passed to the processors */
struct procargs
{
  int fd;
  long long int drop_count;
  long long int drop_total;
};



int
main (int argc, char *argv[])
{
  /* by default, DROP will drop 1 record counting from the start */
  long long int first = 1;
  long long int last = 0;
  unsigned long record_size = 0;

  /* ignore SIGPIPE */
  DUP_ignore_sigpipe ();

  /* parse arguments, return 1 if they weren't parsed correctly */
  if (parse_args (argc, argv, &first, &last, &record_size) != 0)
    {
      return 1;
    }

  return drop_filter (first, last, (size_t) record_size);
}

int
drop_filter (long long int first, long long int last, size_t record_size)
{
  struct cbuffer *cbuf = NULL;

  /* we pretty much need to read from standard in and write to 
     standard out, though standard error is optional */
  if (!DUP_get_fd (0) || !DUP_get_fd (1))
    {
      fprintf (stderr,
               "Error: need to have stdin and stdout open for reading and writing records.\n");
      exit (1);
    }

  if (record_size == 0)
    {
      if (first > 0)
        {
          if (last > 0)
            {
              cbuf = cbuf_make (last * 120);
            }

          if (0 != (drop_head_lines (first, cbuf)))
            {
              fprintf (stderr,
                       "drop: failure in dropping lines from the head of the buffer\n");
              exit (1);
            }
        }

      if (last > 0)
        {
          if (first == 0)
            {
              cbuf = cbuf_make (last * 120);
            }
          if (0 != (drop_tail_lines (last, cbuf)))
            {
              fprintf (stderr,
                       "drop: failure in dropping lines from the tail of the buffer\n");
              exit (1);
            }
        }
    }
  else
    {
      if (first > 0)
        {
          if (last > 0)
            {
              cbuf = cbuf_make ((last + 1) * record_size);
            }

          if (0 != (drop_head_records (first, record_size, cbuf)))
            {
              fprintf (stderr,
                       "drop: failure in dropping lines from the tail of the buffer\n");
              exit (1);
            }
        }

      if (last > 0)
        {
          if (first == 0)
            {
              //cbuf = cbuf_make ((last + 1)* record_size);
              cbuf = cbuf_make (last * (record_size + 1));
            }

          if (0 != (drop_tail_records (last, record_size, cbuf)))
            {
              fprintf (stderr,
                       "drop: failure in dropping lines from the tail of the buffer\n");
              exit (1);
            }
        }
    }

  /* for the off chance that someone does drop 0 0 */
  if (first == 0 && last == 0)
    drop_head_lines (0, NULL);

  return 0;
}



/* the line processor just writes to a given fd */
int
drop_newline_processor (void *cls, char *line, char *end_char)
{
  /* we expect cls to point to an int which is the fd we want to write to */
  int ret;
  struct procargs *args = (struct procargs *) cls;

  /* if the write was successful, keep trying to process the line */
  if ((args->fd == -1)
      || (1 == (ret = DUP_write_all (args->fd, line, end_char - line + 1))))
    {
      if (args->drop_total > 0)
        if (++args->drop_count < args->drop_total)
          return 1;
        else
          return 0;
      else
        return 1;
    }
  else
    return 0;
}



/* drop lines from the head of the file of lines */
int
drop_head_lines (long long int drop_total, struct cbuffer *cbuf)
{
  char *buf;
  size_t buf_size = 128;
  size_t v_start = 0;
  size_t position = 0;
  int ret, i;
  struct procargs args;
  args.drop_count = 0;
  args.drop_total = drop_total;

  if (DUP_get_fd (2) == 1)
    args.fd = 2;
  else
    args.fd = -1;

  buf = malloc (buf_size);
  for (i = 0; i < drop_total; i = args.drop_count)
    {
      /* read a line (and continue reading them), exit if there's problems */
      if (1 != (ret = DUP_try_read_line (0, &buf, &buf_size, &v_start, &position,
                                         drop_newline_processor,
                                         (void *) (&args))))
        {
          if (ret == -2)        /* EOF */
            break;

          if (ret != 0)
            {
              fprintf (stderr, "drop: general DUP read line error\n");
              exit (1);
            }
        }
    }

  /* output the rest of the lines if there's nothing to drop from the tail */
  if (cbuf == NULL)
    {
      /* send the rest to stdout. also, by setting drop_total to -1, we'll
         just continue processing the line till we're done */
      args.fd = 1;
      args.drop_total = -1;
      while (1 == (DUP_try_read_line (0, &buf, &buf_size, &v_start, &position,
                                      drop_newline_processor,
                                      (void *) (&args)))) ;

      free (buf);
    }
  else
    {
      cbuf_bufcpy (cbuf, buf, position);
      free (buf);
    }


  return 0;
}


/* the line processor just writes to a given fd */
int
drop_block_processor (void *cls, char *line, char *end_char)
{
  /* we expect cls to point to an int which is the fd we want to write to */
  int ret;
  struct procargs *args = (struct procargs *) cls;

  /* if the write was successful, keep trying to process the line */
  if ((args->fd == -1)
      || (1 == (ret = DUP_write_all (args->fd, line, end_char - line + 1))))
    {
      if (args->drop_total > 0)
        {
          if (++args->drop_count < args->drop_total)
            {
              return 1;
            }
          else
            {
              return 0;
            }
        }
      else
        {
          return 1;
        }
    }
  else
    return 0;
}




int
drop_head_records (long long int drop_total, size_t record_size,
                   struct cbuffer *cbuf)
{
  char *buf;
  size_t position = 0;
  struct procargs args;
  int i, ret;
  args.drop_count = 0;
  args.drop_total = drop_total;

  if (DUP_get_fd (2) == 1)
    args.fd = 2;
  else
    args.fd = -1;

  buf = (char *) malloc (record_size);

  for (i = 0; i < drop_total; i = args.drop_count)
    {
      if (1 !=
          (ret =
           DUP_try_read_block (0, buf, record_size, &position,
                               drop_block_processor, (void *) (&args))))
        {
          if (ret == -2)        /* EOF */
            break;
          if (ret != 0)
            {
              fprintf (stderr, "drop: general DUP read block error\n");
              exit (1);
            }
        }
    }

  /* now send the rest to stdout */
  if (cbuf == NULL)
    {
      args.fd = 1;
      args.drop_total = -1;
      while (1 == (DUP_try_read_block (0, buf, record_size, &position,
                                       drop_block_processor,
                                       (void *) (&args))))
        ;

      free (buf);
    }
  else
    {
      cbuf_bufcpy (cbuf, buf, position);
      free (buf);
    }

  return 0;
}

/*
 * Drop lines from the end of the stream.
 */
int
drop_tail_lines (long long int drop_total, struct cbuffer *cbuf)
{
  size_t buf_size, len1, len2, read_size;
  ssize_t r;
  char *buf, *start, *str2, *newline;
  size_t line_count = 0;

  int err_avail = DUP_get_fd (2) ? 1 : 0;

  /* reserve a chunk to write to */
  buf = cbuf_reserve_write (cbuf, &buf_size);

  /* resize if necessary */
  if (buf_size == 0)
    {
      cbuf_reserve_write (cbuf, 0);
      cbuf_resize (cbuf, cbuf_size (cbuf) * 2);
      buf = cbuf_reserve_write (cbuf, &buf_size);
    }

  /* now read into the buffer */
  r = DUP_read (0, buf, buf_size);
  cbuf_commit (cbuf, r);

  /* adjust it on the first pass, in case anything was already in there */
  buf = cbuf_reserve_read (cbuf, &read_size);
  cbuf_consume (cbuf, 0);

  /* look for a line */
  while (read_size > 0)
    {
      /* search for newlines in the read */
      newline = memchr (buf, '\n', read_size);
      while (newline != NULL)
        {
          line_count++;

          /* we found a new line, so decide what to do, if we've stored the number we need
             to drop already, then we can just remove one line and keep this one */
          if (line_count > drop_total)
            {
              start = cbuf_find_line (cbuf, &str2, &len1, &len2);

              /* first, output the line */
              DUP_write_all (1, start, len1);   /* ignore the other side closing */
              cbuf_reserve_read (cbuf, &buf_size);
              cbuf_consume (cbuf, len1);

              /* if the string had two parts, write the other part */
              if (len2 > 0)
                {
                  DUP_write_all (1, str2, len2);
                  cbuf_reserve_read (cbuf, &buf_size);
                  cbuf_consume (cbuf, len2);
                }

              line_count--;
            }


          /* shift over and adjust the amount left to check */
          read_size = read_size - ((newline - buf) + 1);
          buf = newline + 1;
          newline = memchr (buf, '\n', read_size);
        }

      /* reserve a chunk to write to */
      buf = cbuf_reserve_write (cbuf, &buf_size);

      /* resize if necessary */
      if (buf_size == 0)
        {
          cbuf_resize (cbuf, cbuf_size (cbuf) * 2);
          buf = cbuf_reserve_write (cbuf, &buf_size);
        }

      /* now read into the buffer */
      r = DUP_read (0, buf, buf_size);
      cbuf_commit (cbuf, r);
    }


  /* at this point, we spit everything left to stderr that's a line */
  while (cbuf_length (cbuf) > 0)
    {
      buf = cbuf_reserve_read (cbuf, &buf_size);
      if (err_avail)
        DUP_write_all (2, buf, buf_size);
      cbuf_consume (cbuf, buf_size);
      line_count--;
    }

  return 0;
}


/*
 * Drop records, instead of lines, from the end of the stream
 */
int
drop_tail_records (long long int drop_total, size_t record_size,
                   struct cbuffer *cbuf)
{
  size_t buf_size, len1, len2;
  ssize_t read_size;
  char *buf, *start, *rec2;
  size_t rec_count = 0;

  int err_avail = DUP_get_fd (2) ? 1 : 0;

  /* reserve a chunk to write to */
  buf = cbuf_reserve_write (cbuf, &buf_size);

  /* resize if necessary */
  if (buf_size == 0)
    {
      cbuf_commit (cbuf, 0);
      cbuf_resize (cbuf, cbuf_size (cbuf) * 2);
      buf = cbuf_reserve_write (cbuf, &buf_size);
    }

  /* read into the buffer */
  read_size = DUP_read (0, buf, buf_size);
  cbuf_commit (cbuf, read_size);

  /* adjust in case we had stuff already in our buffer */
  buf = cbuf_reserve_read (cbuf, &buf_size);
  cbuf_consume (cbuf, 0);

  /* look for a line */
  while (read_size > 0)
    {
      rec_count = cbuf_length (cbuf) / record_size;
      if (rec_count > drop_total)
        {
          start =
            cbuf_find_record (cbuf,
                              (rec_count - drop_total) * record_size,
                              &rec2, &len1, &len2);

          DUP_write_all (1, start, len1);
          cbuf_reserve_read (cbuf, &buf_size);
          cbuf_consume (cbuf, len1);

          if (len2 > 0)
            {
              DUP_write_all (1, rec2, len2);
              cbuf_reserve_read (cbuf, &buf_size);
              cbuf_consume (cbuf, len2);
            }
        }

      /* reserve a chunk to write to */
      buf = cbuf_reserve_write (cbuf, &buf_size);

      /* resize if necessary */
      if (buf_size == 0)
        {
          cbuf_resize (cbuf, cbuf_size (cbuf) * 2);
          buf = cbuf_reserve_write (cbuf, &buf_size);
        }

      /* now read into the buffer */
      read_size = DUP_read (0, buf, buf_size);
      cbuf_commit (cbuf, read_size);
    }

  /* at this point, we spit everything left that's a complete record */
  rec_count = cbuf_length (cbuf) / record_size;
  start =
    cbuf_find_record (cbuf, rec_count * record_size, &rec2, &len1, &len2);

  if (err_avail)
    DUP_write_all (2, start, len1);
  cbuf_reserve_read (cbuf, &buf_size);
  cbuf_consume (cbuf, len1);

  if (len2 > 0)
    {
      if (err_avail)
        DUP_write_all (2, rec2, len2);
      cbuf_reserve_read (cbuf, &buf_size);
      cbuf_consume (cbuf, len2);
    }

#ifdef WARN_SHORT_RECORDS
  fprintf (stderr, "Last record incomplete: %u out of %u bytes!\n",
           cbuf_length (cbuf), record_size);
#endif

  return 0;

}

/*
 * Parse the command line arguments, return the vals in drop_total, first,
 * and record_size. If record_size = -1, then it means read line by line.
 */
int
parse_args (int argc, char *argv[],
            long long int *first, long long int *last,
            unsigned long *record_size)
{
  if (argc < 2)
    {
      /* no args for DROP, since argc == 1, therefore we don't change anything */
      *first = 1;
      *last = 0;
      *record_size = 0;
    }
  else if (argc < 3)
    {
      /* 1 arg for DROP, which must be the first number of records to drop */
      if (1 != sscanf (argv[1], "%lli", first))
        {
          fprintf (stderr, USAGE);
          return 1;
        }
      *last = 0;
      *record_size = 0;
    }
  else if (argc < 4)
    {
      /* 2 args for DROP, which must be first and last */
      if (1 != sscanf (argv[1], "%lli", first))
        {
          fprintf (stderr, USAGE);
          return 1;
        }

      if (1 != sscanf (argv[2], "%lli", last))
        {
          fprintf (stderr, USAGE);
          return 1;
        }

      *record_size = 0;
    }
  else if (argc < 5)
    {
      /* 3 args for DROP, which must be first, last, and record_size */
      if (1 != sscanf (argv[1], "%lli", first))
        {
          fprintf (stderr, USAGE);
          return 1;
        }

      if (1 != sscanf (argv[2], "%lli", last))
        {
          fprintf (stderr, USAGE);
          return 1;
        }

      if (1 != sscanf (argv[3], "%lu", record_size))
        {
          fprintf (stderr, USAGE);
          return 1;
        }

    }
  else
    {
      fprintf (stderr, USAGE);
      return 1;
    }

  return 0;
}
