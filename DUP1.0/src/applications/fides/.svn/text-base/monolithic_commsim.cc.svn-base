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
#include <iostream>
#include <map>
#include <sstream>
#include <fstream>
#include <stdexcept>
#include "commsim.h"
#include "string.h"

using namespace std;
using namespace commsim;
using namespace fides;

int
main (int argc, char **argv)
{
  try {
    MonolithicEngine engine;
    Manufacturer m1(engine, "m1");
    m1.addItem("productA", 10);
    m1.addItem("productB", 20);
    m1.addItem("productC", 30);

    Retailer r1(engine, "r1");
    r1.addItem("productA", "m1", 1);
    r1.addItem("productB", "m1", 5);

    Retailer r2(engine, "r2");
    r2.addItem("productC", "m1", 10);

    Consumer c1(engine, "c1");
    c1.addItem("r1", "productB", 2, 10);
    c1.addItem("r2", "productC", 11, 30);
    c1.addItem("r1", "productA", 100, 30);

    engine.run();

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
