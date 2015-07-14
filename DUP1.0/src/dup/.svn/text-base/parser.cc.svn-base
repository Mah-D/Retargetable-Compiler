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
 * @file dup/parser.cc
 * @brief main method for a standalone DUP
 *        parser.  The resulting binary will
 *        simply pretty-print the input.
 * @author Christian Grothoff
 */

#include "process.h"
#include "dupparse.h"
#include <vector>

using namespace std;

extern vector < Process * >session_processes;
extern int yydebug;
extern "C"
{
  extern int yyparse ();
}

uint64_t session_number;

int
main ()
{
  try
  {
    if (yyparse () != 0)
      return 1;
  }
  catch (const char *ex)
  {
    fprintf (stderr, "Caught exception `%s'\n", ex);
    return 1;
  }
#ifdef DUP_PARSE_DEBUG
  for (vector < Process * >::const_iterator ii = session_processes.begin ();
       ii != session_processes.end (); ii++)
    {
      (*ii)->print ();
    }
#endif
  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    (*iter)->pretty_print (cout);

  for (vector < Process * >::const_iterator iter = session_processes.begin ();
       iter != session_processes.end (); ++iter)
    delete *iter;
  return 0;
}
