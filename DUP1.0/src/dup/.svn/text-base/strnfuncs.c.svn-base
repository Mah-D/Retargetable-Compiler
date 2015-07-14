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
 * @file dup/strnfuncs.c
 * @brief replacement functions for strnlen and strndup on systems (e.g. BSD) that don't have them.
 * @author Chris GauthierDickey
 */

#include "strnfuncs.h"

#ifndef HAVE_STRNLEN
size_t
strnlen (const char *s, size_t maxlen)
{
  char *end = (char *) memchr (s, '\0', maxlen);
  return (end ? s - end : maxlen);
}
#endif


#ifndef HAVE_STRNDUP
char *
strndup (const char *s, size_t n)
{
  char *str = (char *) memchr (s, '\0', n);

  if (str)
    return strdup (s);
  else
    {
      str = (char *) malloc (n + 1);
      strncpy (str, s, n);
      str[n] = '\0';
      return str;
    }
}
#endif
