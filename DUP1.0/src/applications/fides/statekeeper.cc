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
#include <stdexcept>
#include <set>
#include <string>
#include "fides.h"

using namespace std;
using namespace fides;

class StateKeeper:public FIDESListener
{
public:

  virtual bool handlesState () const
  {
    return true;
  }

  virtual void state (const std::string & processType,
                      const std::string & processName, unsigned int vtime,
                      const std::string & name, const std::string & value)
  {
    cout << vtime << "\t" << processType << "\t" << processName << "\t" <<
      name << "\t" << value << endl;
  }
};

int
main (int argc, char **argv)
{
  /*
   * check command line arguments.
   */
  if (argc != 1)
    {
      FIDES_ERROR ("usage: statekeeper");
      return 1;
    }
  try
  {
    StateKeeper sk;
    FIDESRunner runner;
    runner.run (sk);
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
