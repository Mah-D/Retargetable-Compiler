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
#ifndef CANSIM_H
#define CANSIM_H

#include <sstream>
#include "fides.h"
#include "assert.h"

namespace cansim
{
  //
  // domain-specific events for the CANsim simulation system
  //
  class Bit
  {
  public:
    static const Bit & DOMINANT;
    static const Bit & RECESSIVE;

    static const Bit & getBit (bool value);
    static const Bit & getBit (const fides::Event & event);

      Bit (bool value);
      Bit (const Bit & that);

    bool getValue () const
    {
      return m_value;
    }
    bool isDominant () const
    {
      return !m_value;
    }
    bool isRecessive () const
    {
      return m_value;
    }

    std::string str () const;
      fides::Event event () const;

  private:
    const bool m_value;
  };
};

#endif
