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
 * @file dup/dup_string.h
 * @brief helper object to transmit strings
 * @author Christian Grothoff
 */
#ifndef DUP_STRING_H
#define DUP_STRING_H

#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>

using namespace std;

class ControlConnection;

class DupString
{
public:
  DupString (const char *s);

   ~DupString ();

  /**
   * Transmit information about this process to
   * the given socket (one write call at a time).
   * @return 0 if we have more to send, 1 if we are done
   */
  int transmit (ControlConnection * s);

private:

  /**
   * Bytes already transmitted, including header.
   */
  size_t bytes_sent;

  /**
   * strlen(val) + 3
   */
  size_t slen;

  /**
   * Value to transmit.
   */
  char *val;

};
#endif
