/*
     This file is part of DUP.
     (C) 2009 The DUP team

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
#include <iostream>
#include <map>
#include <sstream>
#include <stdexcept>
#include "cansim.h"

using namespace std;
using namespace cansim;
using namespace fides;

int
main (int argc, char **argv)
{
  const Bit & d (Bit::DOMINANT);
  const Bit & r (Bit::RECESSIVE);
  try
  {
    FIDES_ERROR ("Dominant is: " << d.str ());
    FIDES_ERROR ("Recessive is: " << r.str ());
    return 0;
  }
  catch (exception & e)
  {
    FIDES_ERROR (e.what ());
  }
  catch (...)
  {
    FIDES_ERROR ("unknown exception caught");
  }
  return 1;
}
