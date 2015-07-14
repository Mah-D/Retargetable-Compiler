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

  assert (e1.getEventName () == string ("this is my event"));

  /*
   * Test the copy constructor.
   */
  Event e2 (e1);

  assert (e1.getEventName () == e2.getEventName ());
  assert (e1.getEventName () == string ("this is my event"));
  assert (e2.getEventName () == string ("this is my event"));

  assert (e1 == e2);
  assert (e2 == e1);
  assert (!(e1 != e2));
  assert (!(e2 != e1));

  /*
   * Test basic addValue.
   */
  e1.addValue ("name1", "this is value 1");
  e1.addValue ("name2", "this is value 2");

  assert (e1.getValue ("name1") == string ("this is value 1"));
  assert (e1.getValue ("name2") == string ("this is value 2"));

  assert (!(e1 == e2));
  assert (!(e2 == e1));
  assert (e1 != e2);
  assert (e2 != e1);

  /*
   * Test addValue() with a duplicate (should throw an exception)
   */
  try
  {
    e1.addValue ("name1", "this is another value 1");
    assert (0);
  }
  catch (invalid_argument & ia)
  {
    // eat it
  }
  catch (...)
  {
    assert (0);
  }
  assert (e1.getValue ("name1") == string ("this is value 1"));


  /*
   * Test getValue() with an unknown name, thou
   */
  try
  {
    e1.getValue ("name3");
    assert (0);
  }
  catch (invalid_argument & ia)
  {
    // eat the exception
  }
  catch (...)
  {
    assert (0);
  }

  /*
   * test the iterator methods
   */
  map < string, string >::const_iterator citr = e1.begin ();
  assert (citr->first == "name1");
  assert (citr->second == "this is value 1");
  citr++;

  assert (citr->first == "name2");
  assert (citr->second == "this is value 2");
  citr++;

  assert (citr == e1.end ());
}
