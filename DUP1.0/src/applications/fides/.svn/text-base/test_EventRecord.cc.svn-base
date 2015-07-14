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
#include <assert.h>
#include <stdexcept>
#include "fides.h"

using namespace fides;
using namespace std;

int
main (int argc, char **argv)
{
  /*
   * Test the constructor.
   */
  Event e1 ("this is my event");

  EventRecord er (10, e1);

  assert (er.time == 10);
  assert (er.event == e1);

  /*
   * Test the copy constructor.
   */
  EventRecord er2 (er);

  assert (er.time == er2.time);
  assert (er.event == er2.event);

  /*
   * Test greater-than and less-than operators -- should only look at
   * the time.
   */
  EventRecord er3 (11, e1);

  assert (er3 > er2);
  assert (er2 < er3);

  return 0;
}
