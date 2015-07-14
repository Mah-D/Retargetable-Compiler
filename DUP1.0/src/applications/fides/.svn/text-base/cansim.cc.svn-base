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
#include "cansim.h"
#include "assert.h"

using namespace cansim;
using namespace fides;
using namespace std;

const Bit &
cansim::Bit::DOMINANT (new Bit (false));
const
  Bit &
cansim::Bit::RECESSIVE (new Bit (true));

const
  Bit &
Bit::getBit (bool value)
{
  if (value)
    {
      return Bit::RECESSIVE;
    }
  else
    {
      return Bit::DOMINANT;
    }
}

const Bit &
Bit::getBit (const Event & event)
{
  if (event.getEventName () != "Bit")
    {
      FIDES_THROW (logic_error,
                   "attempt to construct a Bit from a non-Bit event: " <<
                   event.getEventName ());
    }
  if (event.getValue ("value") == "0")
    {
      return Bit::DOMINANT;
    }
  else
    {
      return Bit::RECESSIVE;
    }
}

Bit::Bit (bool value):m_value (value)
{
}

Bit::Bit (const Bit & that):m_value (that.m_value)
{
  // no copies allowed!
  assert (0);
}

string
Bit::str () const
{
  ostringstream oss;
  oss << "[Bit: value=" << m_value << "]";
  return oss.str ();
}

Event
Bit::event () const
{
  ostringstream oss;
  oss << m_value;
  Event event ("Bit");
  event.addValue ("value", oss.str ());
  return event;
}
