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
 * @file filters/buffer-dup.c
 * @brief filter that reads from 1 input and writes the same data to 1 output,
 *        buffering in the middle if needed
 * @author Christian Grothoff
 */

#include "dup_filter_lib.h"

#define MIN(a,b) ((a) < (b) ? (a):(b)) 

int
main (int argc, char *argv[])
{
  char *buf;
  char *nbuf;
  size_t have;
  size_t roff;
  size_t woff;
  size_t buf_size;
  ssize_t ret;
  fd_set rs;
  fd_set ws;
  unsigned int bs;
  int in_active;
  int var_size;
  
  var_size = 0;
  buf_size = 512 * 1024 * 4;
  if (argc == 2)
    {
      if (1 != sscanf (argv[1], "%u", &bs))
	{
	  fprintf (stderr, "First argument must be buffer size\n");
	  return 1;
	}
      if (bs == 0)
	var_size = 1;
      else
	buf_size = bs;
    }
  buf = malloc (buf_size);
  if (buf == NULL)
    {
      fprintf (stderr,
	       "Could not allocate %u bytes\n",
	       (unsigned int) buf_size);
      return 1;
    }
  DUP_ignore_sigpipe ();
  have = 0;
  roff = 0;
  woff = 0;
  in_active = 1;
  FD_ZERO (&rs);
  FD_ZERO (&ws);
  while ( (in_active) || (have > 0) )
    {
      FD_CLR (1, &ws); /* presumably cheaper to clear just 1 bit */
      if (have > 0)
	{
	  /* only do select if 'have > 0', since otherwise we don't need it! */
	  FD_CLR (0, &rs); /* presumably cheaper to clear just 1 bit */
	  if (in_active)
	    {
	      if ( (var_size && (buf_size * 2 > buf_size)) && (have == buf_size) )
		{
		  if (roff != woff) abort ();
		  /* try to grow buffer */		  
		  nbuf = realloc (buf, buf_size * 2);
		  if (nbuf != NULL)
		    {
		      /* success */
		      buf = nbuf;
		      memcpy (&buf[woff + buf_size],
			      &buf[woff],
			      buf_size - woff);
		      woff += buf_size;
		      buf_size *= 2;		     
		    }
		}
	      if (have < buf_size) 
		FD_SET (0, &rs);
	    }
	  if (have > 0)
	    FD_SET (1, &ws);
	  if (0 == DUP_select (2, &rs, &ws, NULL))
	    abort ();
	}
      if ( (have == 0) ||
	   (FD_ISSET (0, &rs)) )
	{
	  ret = read (0, 
		      &buf[roff], 
		      MIN (buf_size - roff, buf_size - have));
	  if (-1 == ret)
	    {
	      perror ("read");
	      in_active = 0;	      
	    }
	  else if (0 == ret)
	    in_active = 0;
	  else
	    {
	      have += ret;
	      roff += ret;
	      if (roff == buf_size)
		roff = 0;
	    }
	}
      if ( ( (have == buf_size) && (0 == var_size) ) ||
	   (FD_ISSET (1, &ws)) )
	{
	  /* even if we did not do select (or if we did and write was
	     not ready), it is safe to do a blocking write IF 
	     'have == buf_size' */
	  ret = write (1, &buf[woff], MIN (buf_size - woff, have));
	  if (-1 == ret)
	    {
	      perror ("write");
	      free (buf);
	      return 1;
	    }
	  if (0 == ret)
	    {
	      free (buf);
	      return 0;
	    }
	  have -= ret;
	  woff += ret;
	  if (woff == buf_size)
	    woff = 0;
	  if (have == 0)
	    roff = woff = 0;
	}
    }
  free (buf);
  return 0;
}
