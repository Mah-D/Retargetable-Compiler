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
#include <iostream>
#include <stdexcept>
#include <map>
#include <set>
#include <string>
#include <sstream>
#include "fides.h"

using namespace std;
using namespace fides;

class VTimeKeeper:public FIDESListener
{
public:
  VTimeKeeper (FIDESRunner& runner, unsigned int n):m_n (n)
  {
    m_vtime = 0;
    m_pending = m_n;
    m_runner = &runner;
    m_runner->buffer_output("VTIME 0\n");
  }

  virtual bool handlesVtack () const
  {
    return true;
  }

  virtual void vtack (unsigned int vtackCount)
  {
    FIDES_DEBUG("Received VTACK");
    m_pending -= vtackCount;
    if (m_pending == 0)
      {
        map < unsigned int, set<string> >::iterator itr = m_vtimes.begin();
        if (itr != m_vtimes.end ())
          {
            assert (itr->first >= m_vtime);
            m_vtime = itr->first;
            m_pending = itr->second.size();

            FIDES_DEBUG("waiting for " << m_pending << " for time " << m_vtime);

            m_vtimes.erase (itr);
            ostringstream oss;
            oss << "VTIME " << m_vtime << endl;

            m_runner->buffer_output(oss.str());
            if (m_vtime % 10 == 0)
            {
              cerr << oss.str();
              cerr.flush();
            }
          }
        else
          {
            m_runner->buffer_output("END\n");
            cerr << "END" << endl;
            cerr.flush();
          }
      }
    else
      {
        FIDES_DEBUG("Waiting for " << m_pending << " more VTACKs");
      }
  }

  virtual bool handlesEvent () const
  {
    return true;
  }
  virtual void event (const std::string & processName,
                      unsigned int deliveryTime, const Event & event)
  {
    assert(deliveryTime >= m_vtime);
    FIDES_DEBUG ("recording a vtime record at " << deliveryTime << " for processName");
    map<unsigned int, set<string> >::iterator itr = m_vtimes.find(deliveryTime);
    if(itr == m_vtimes.end()){
      set<string> tmp;
      tmp.insert(processName);
      m_vtimes.insert (make_pair(deliveryTime, tmp));
    }
    else {
      itr->second.insert(processName);
    }
  }

private:
  const unsigned int m_n;
  unsigned int m_vtime;
  unsigned int m_pending;
  map < unsigned int, set<string> > m_vtimes;
  FIDESRunner* m_runner;
};

int
main (int argc, char **argv)
{
  /*
   * check command line arguments.
   */
  if (argc != 2)
    {
      FIDES_ERROR ("usage: vtimekeeper <process count>");
      return 1;
    }
  try
    {
      FIDESRunner runner;
      VTimeKeeper vtk (runner, strtoul (argv[1], NULL, 10));
      runner.run (vtk);
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
