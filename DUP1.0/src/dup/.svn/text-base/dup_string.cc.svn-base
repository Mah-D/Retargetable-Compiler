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
 * @file dup/dup_string.cc
 * @brief
 * @author Christian Grothoff
 */
#include "globals.h"
#include "dup_string.h"
#include "control_connection.h"
#include <string.h>
#include <arpa/inet.h>
#include <errno.h>


DupString::DupString (const char *v)
{
  uint16_t n;
  size_t l = strlen (v);
  if (l >= 65535)
    throw "Illegal string, longer than 64k characters!";
  n = htons (l);
  slen = l + 1 + sizeof (n);
  val = (char *) malloc (slen);
  memcpy (&val[2], v, l + 1);
  memcpy (val, &n, sizeof (n));
  bytes_sent = 0;
}

DupString::~DupString ()
{
  free (val);
}

int
DupString::transmit (ControlConnection * s)
{
  ssize_t ret;

  ret = s->transmit (&val[bytes_sent], slen - bytes_sent);
  if (ret == -1)
    {
      fprintf (stderr, "write failed: %s\n", strerror (errno));
      throw "Write error";
    }
  bytes_sent += ret;
  if (bytes_sent == slen)
    return 1;
  return 0;
}
