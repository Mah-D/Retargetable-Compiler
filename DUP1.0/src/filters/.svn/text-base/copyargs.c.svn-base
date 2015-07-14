/*
     This file is part of DUP.
     (C) 2010 The DUP team

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
 * @file filters/copyargs.c
 * @brief copy all arguments to the target system and then copy
 *        line from stdin to stdout
 * @author Christian Grothoff
 */
#include "DUP_config.h"
#include "dup_filter_lib.h"
#include <sys/stat.h>

#define MAX_LINE 65536


static void
scp (const char *hostname,
     const char *filename)
{
  char cmd[MAX_LINE];

  snprintf (cmd,
	    MAX_LINE,
	    "scp %s %s:%s",
	    filename,
	    hostname,
	    filename);
  if (0 != system (cmd))
    {
      fprintf (stderr, 
	       "system call `%s' failed: %s\n",
	       cmd,
	       strerror (errno));
      exit (1);
    }
}


int
main (int argc, char *argv[])
{
  char buffer[MAX_LINE];
  char cpy[MAX_LINE];
  const char *tok;
  struct stat sbuf;

  if (argc != 2) 
    {
      fprintf (stderr, "Invoke copyargs with target hostname.\n");
      return 1;
    }
  while (NULL != fgets (buffer, MAX_LINE, stdin))
    {
      memcpy (cpy, buffer, MAX_LINE);
      tok = strtok (cpy, " =");
      do
	{
	  if (0 == stat (tok, &sbuf))
	    scp (argv[1], tok);	    
	}
      while (NULL != (tok = strtok (cpy, " =")));
      fprintf (stdout, "%s", buffer);
      fflush (stdout);
    }
  return 0;
}

/* end of copyargs.c */
