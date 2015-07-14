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
 * @file filters/cbuffer.h
 * @brief typical circular buffer implementation
 * @author Chris GauthierDickey
 */

#include "cbuffer.h"


/** If _DEBUG is defined, we'll check your reads and writes with
 consumes and commits to make sure you only do one at a time,
 though the checking is NOT race free, clearly.*/

/* teh circular buffer */
struct cbuffer
{
  char *buf;
  size_t size;
  size_t head;
  size_t tail;
  size_t left;

#ifdef _DEBUG
  int write_count;
  int read_count;
#endif
};



/**
 * Creates a cbuffer of a given size and initializes it properly.
 */
struct cbuffer *
cbuf_make (size_t init_size)
{
  struct cbuffer *buf;
  /* malloc the struct */
  if (NULL == (buf = (struct cbuffer *) malloc (sizeof (struct cbuffer))))
    {
      fprintf (stderr, "malloc failure on cbuffer");
      exit (1);
    }

  /* malloc the buffer */
  if (NULL == (buf->buf = (char *) malloc (init_size)))
    {
      fprintf (stderr, "malloc failure on cbuffer's buf");
      exit (1);
    }

  buf->left = 0;
  buf->size = init_size;
  buf->head = 0;
  buf->tail = 0;

#ifdef _DEBUG
  buf->write_count = 0;
  buf->read_count = 0;
#endif
  return buf;
}

/**
 * Gets a pointer into our buffer and returns it with the size.
 *
 */
char *
cbuf_reserve_write (struct cbuffer *buf, size_t * size)
{
  size_t right;

#ifdef _DEBUG
  if (buf->write_count++ != 0)
    {
      fprintf (stderr, "write_count != 0 in reserve_write\n");
      exit (1);
    }
#endif

  /* decide where to get the buffer based on the left indicator,
     if it's greater than 0, then we write from the left on, otherwise
     we write from the head */
  if (buf->left > 0)
    {
      *size = buf->tail - buf->left;
      if (*size == 0)
        {
#ifdef _DEBUG
          buf->write_count--;
#endif
          return NULL;
        }
      else
        return (buf->buf + buf->left);
    }
  else
    {
      right = buf->size - buf->head;
      if (buf->tail > right)
        {
          *size = buf->tail;
          if (*size == 0)
            {
#ifdef _DEBUG
              buf->write_count--;
#endif
              return NULL;
            }
          else
            return buf->buf;
        }
      else
        {
          *size = right;
          if (*size == 0)
            {
#ifdef _DEBUG
              buf->write_count--;
#endif
              return NULL;
            }
          else
            return (buf->buf + buf->head);
        }
    }
}


/**
 * Reserves k bytes after having received a buffer from cbuf_reserve_write.
 */
void
cbuf_commit (struct cbuffer *buf, size_t bytes)
{
  size_t right;

#ifdef _DEBUG
  if (buf->write_count-- != 1)
    {
      fprintf (stderr, "write_count != 1 in commit\n");
      exit (1);
    }
#endif

  /* we're already wrapping, so commit from the left onwards towards the tail */
  if (buf->left > 0)
    {
      buf->left += bytes;
      if (buf->left > buf->tail)
        {
          fprintf (stderr,
                   "cbuffer overflow (1): tried to commit too many bytes (%u total)\n",
                   (unsigned int) bytes);
          exit (1);
        }
    }
  else
    {

      right = buf->size - buf->head;
      if (buf->tail > right)
        {
          buf->left += bytes;
          if (buf->left > buf->tail)
            {
              fprintf (stderr,
                       "cbuffer overflow (2): tried to commit too many bytes (%u total)\n",
                       (unsigned int) bytes);
              exit (1);
            }
        }
      else
        {
          buf->head += bytes;
          if (buf->head > buf->size)
            {
              fprintf (stderr,
                       "cbuffer overflow (3): tried to commit too many bytes (%u total)\n",
                       (unsigned int) bytes);
            }
        }
    }

}


/**
 * Returns a buffer from the cbuffer that we can read from and
 * sets the length in size.
 */
char *
cbuf_reserve_read (struct cbuffer *buf, size_t * size)
{
#ifdef _DEBUG
  if (buf->read_count != 0)
    {
      fprintf (stderr, "read_count != 0 in reserve_read\n");
      exit (1);
    }
  buf->read_count++;

  if (buf->head < buf->tail)
    {
      fprintf (stderr, "programming error, buf->head < buf->tail");
      exit (1);
    }
#endif

  /* always read from the tail */
  *size = buf->head - buf->tail;
  return buf->buf + buf->tail;
}






/**
 * Commit k bytes, indicating they've been read
 * and processed from the buffer. Wrapping is handled.
 *
 */
void
cbuf_consume (struct cbuffer *buf, size_t bytes)
{
  size_t chunk;

#ifdef _DEBUG
  if (buf->read_count != 1)
    {
      fprintf (stderr, "read_count != 1 in consume\n");
      exit (1);
    }
  buf->read_count -= 1;


  if (buf->head < buf->tail)
    {
      fprintf (stderr, "programming error, buf->head < buf->tail");
      exit (1);
    }
#endif

  /* how much we have left on the right */
  chunk = (buf->head - buf->tail);

  if (chunk + buf->left >= bytes)
    {
      if (chunk >= bytes)
        {
          /* plenty of room, so commit by moving the tail */
          buf->tail += bytes;

          /* reset the head and tail if necessary */
          if (buf->tail == buf->head)
            {
              buf->tail = 0;
              buf->head = buf->left;
              buf->left = 0;
            }
        }
      else
        {
          buf->tail = bytes - chunk;
          buf->head = buf->left;
          buf->left = 0;
        }
    }
  else
    {
      /* this means we're trying to consume too much! */
      fprintf (stderr,
               "cbuffer underflow: trying to consume more (%u bytes total) than reserved\n",
               (unsigned int) bytes);
      exit (1);
    }
}



/**
 * Returns the biggest chunk we can reserve
 */
size_t
cbuf_has_free (struct cbuffer *buf)
{
  size_t right_len, left_len = buf->tail - buf->left;
  if (buf->left > 0)
    return left_len;
  else
    {
      right_len = buf->size - buf->head;
      if (right_len > left_len)
        return right_len;
      else
        return left_len;
    }
}


/**
 *  Returns the amount of space actually committed so far.
 */
size_t
cbuf_length (struct cbuffer * buf)
{
  return (buf->head - buf->tail) + buf->left;
}




/**
 * Adds space to the cbuffer by allocating and copying new memory. All pointers handed
 * out prior to this call are most likely invalid. 
 */
void
cbuf_resize (struct cbuffer *buf, size_t newsize)
{
  char *newbuf;
  size_t len;

  if (newsize < cbuf_length (buf))
    {
      fprintf (stderr,
               "Unable to shrink the buffer to %u since it has %u bytes committed\n",
               (unsigned int) newsize, (unsigned int) cbuf_length (buf));
      exit (1);
    }

  /* I suppose if we thought about the corner cases we could optimize and
     use realloc instead, but we'd have to ensure that the left free space was
     larger than the right free space to keep our invariant */
  newbuf = malloc (newsize);

  /* copy the main chunk */
  len = buf->head - buf->tail;
  memcpy (newbuf, buf->buf + buf->tail, buf->head - buf->tail);

  /* copy the left side if needed */
  if (buf->left > 0)
    memcpy (newbuf + len, buf->buf, buf->left);

  /* now, update our tail and such */
  buf->tail = 0;
  buf->head += buf->left;
  buf->left = 0;
  buf->size = newsize;
  free (buf->buf);
  buf->buf = newbuf;            // hahah, yeah thanks ;)
}


/**
 * Returns the total size of the cbuffer.
 */
size_t
cbuf_size (struct cbuffer *buf)
{
  return buf->size;
}


/**
 * Deallocates memory allocated to the cbuf.
 */
void
cbuf_free (struct cbuffer *buf)
{
  free (buf->buf);
  free (buf);
}



/** 
 * Finds a line in the cbuffer, returns the start of the line and returns
 * the end of it in end. Note that if we can't find a line, both values will be
 * NULL. In addition, because it's a cbuffer, it's possible the line may wrap
 * around the buffer, so end may preceed the returned start location, meaning you'll
 * need 2 calls to reserve_read and consume before you get the whole line.
 */
char *
cbuf_find_line (struct cbuffer *buf, char **str2, size_t * len1,
                size_t * len2)
{
  char *end;

  *len1 = 0;
  *len2 = 0;
  end = memchr (buf->buf + buf->tail, '\n', buf->head - buf->tail);
  if (end == NULL)
    {
      if (buf->left > 0)
        {
          end = memchr (buf->buf, '\n', buf->left);

          if (end == NULL)
            return NULL;

          *len1 = buf->head - buf->tail;
          *len2 = (end - buf->buf) + 1;
          *str2 = buf->buf;
        }
      else
        {
          return NULL;
        }
    }
  else
    {
      *len1 = (end - (buf->buf + buf->tail)) + 1;
      *str2 = NULL;
    }

  return (buf->buf + buf->tail);
}


char *
cbuf_find_record (struct cbuffer *buf, size_t len, char **rec2, size_t * len1,
                  size_t * len2)
{
  size_t chunk = buf->head - buf->tail;

  if (chunk + buf->left < len)
    {
      *len1 = 0;
      *len2 = 0;
      *rec2 = NULL;
      return NULL;
    }

  /* it all fits between the tail and the head */
  if (len <= chunk)
    {
      *len1 = len;
      *len2 = 0;
      *rec2 = NULL;
    }
  else
    {
      /* break it up into two parts */
      *rec2 = buf->buf;
      *len1 = chunk;
      *len2 = len - chunk;
    }

  return (buf->buf + buf->tail);
}


void
cbuf_bufcpy (struct cbuffer *cbuf, const char *buf, size_t len)
{
  char *mybuf;
  size_t mylen;

  mybuf = cbuf_reserve_write (cbuf, &mylen);

  /* resize if necessary */
  while (mylen < len)
    {
      cbuf_commit (cbuf, 0);    /* put the buffer back... */
      cbuf_resize (cbuf, cbuf_size (cbuf) * 2);
      mybuf = cbuf_reserve_write (cbuf, &mylen);
    }

  /* just in case someone grabbed the buf from this cbuf! */
  memmove (mybuf, buf, len);

  /* commit it */
  cbuf_commit (cbuf, len);
}
