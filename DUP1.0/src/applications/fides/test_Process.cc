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
#include <sstream>
#include "fides.h"

using namespace fides;
using namespace std;

class DummyProcess:public Process
{
public:
  DummyProcess (SimulationEngine& engine, const string & name):Process (engine, name)
  {
  }

  void processEvent (const Event & event)
  {
    processedEvents.push_back (make_pair (getTime (), event));

    if (event.getEventName () == "AdvanceTime")
      {
        unsigned int delta =
          strtoul (event.getValue ("delta").c_str (), NULL, 10);
        advanceTime (delta);
      }
    else if (event.getEventName () == "ScheduleEvent")
      {
        string destination = event.getValue ("destination");
        Event newEvent (event.getValue ("eventName"));

        unsigned int delay = 0;
        if (event.hasValue ("delay"))
          {
            delay = strtoul (event.getValue ("delay").c_str (), NULL, 10);
          }
        if (destination != getProcessName ())
          {
            scheduleEvent (destination, delay, newEvent);
          }
        else
          {
            if (delay > 0)
              {
                scheduleEvent (delay, newEvent);
              }
            else
              {
                scheduleEvent (newEvent);
              }
          }
      }
  }

  vector < pair < unsigned int, Event > >processedEvents;

};

ostream & operator<< (ostream & out, vector < pair < unsigned int,
                      Event > >&op)
{
  out << "[";
  string sep = "";
  vector < pair < unsigned int, Event > >::const_iterator itr;
  for (itr = op.begin (); itr != op.end (); itr++)
    {
      out << sep << "(" << itr->first << "," << itr->second << ")";
      sep = ", ";
    }
  return out << "]";
}

int
main (int argc, char **argv)
{
  // MJR 2009-10-12: disabling (and failing) for now.  The issue is
  // that the Process schedule event is tightly coupled with the
  // ParallelEngine so we would need to abstract the Engine
  // implementation before these can really be tested.
  return 1;
  /*
  // Test the constructor.
  DummyProcess dp1 ("the DES process");

  assert (dp1.getProcessName () == string ("the DES process"));
  assert (dp1.getTime () == 0);

  // Test advanceTime
  ostringstream oss;
  assert (dp1.advanceTime (101) == 101);

  assert (dp1.getTime () == 101);
  assert (oss.str () == "");

  // check whitespace handling: empty lines, lines with only
  // whitespace, partial final line
  {
    DummyProcess dp1 ("dp1");

    istringstream iss ("\n	\n   ");
    ostringstream oss;

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 0);
    assert (oss.str () == "");
  }

  {
    // check invalid VTIME line.
    DummyProcess dp1 ("dp1");

    istringstream iss ("VTIME");
    ostringstream oss;

    try
    {
      ParallelEngine pe;
      //pe.run("dp1", dp1);
      assert (0);
    }
    catch (invalid_argument & e)
    {
      // eat it
    }
  }
  {
    // check valid VTIME line.
    DummyProcess dp1 ("dp1");

    istringstream iss ("VTIME 101");
    ostringstream oss;

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 101);
    assert (oss.str () == "VTACK\n");
  }

  {
    // check valid VTIME line followed by historical time
    DummyProcess dp1 ("dp1");

    istringstream iss ("VTIME 101\nVTIME 100");
    ostringstream oss;

    try
    {
      ParallelEngine pe;
      //pe.run("dp1", dp1);
      assert (false);
    }
    catch (logic_error & e)
    {
      // eat it
    }
  }

  {
    // check multiple valid VTIME lines
    DummyProcess dp1 ("dp1");

    istringstream iss ("VTIME 101\nVTIME 1000");
    ostringstream oss;

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\nVTACK\n");
  }

  {
    // event scheduled in the future
    DummyProcess dp1 ("dp1");

    istringstream iss ("EVENT Event1 dp1 1000 name1 = value1 name2 = value2");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;    // expected to be empty because the
    // delivery time is in the future

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 0);
    assert (oss.str () == "");
    assert (dp1.processedEvents == expected);
  }

  {
    // event scheduled in the future and the subsequent time value
    DummyProcess dp1 ("dp1");

    istringstream
      iss ("EVENT Event1 dp1 1000 name1 = value1 name2 = value2\nVTIME 1000");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;
    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");

    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // time value and then scheduled event
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("VTIME 1000\nEVENT Event1 dp1 1000 name1 = value1 name2 = value2\nVTIME 1000\n");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;
    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");

    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\nVTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events scheduled then time advanced once
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1000 name1 = value1 name2 = value2\nEVENT Event2 dp1 1001 name1 = value1 name2 = value2\nVTIME 1000");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;
    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");

    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events scheduled out of order then time advanced once
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1001 name1 = value1 name2 = value2\nEVENT Event2 dp1 1000 name1 = value1 name2 = value2\nVTIME 1000");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;
    Event evt1 ("Event2");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");

    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events scheduled out of order then time advanced past
    // the first one
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1001 name1 = value1 name2 = value2\nEVENT Event2 dp1 1000 name1 = value1 name2 = value2\nVTIME 1001");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;
    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");

    expected.push_back (make_pair (1001, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1001);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events at the same virtual time
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1001 name1 = value1 name2 = value2\nEVENT Event2 dp1 1001 name1 = value1 name2 = value2\nVTIME 1001");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");
    expected.push_back (make_pair (1001, evt1));

    Event evt2 ("Event2");
    evt2.addValue ("name1", "value1");
    evt2.addValue ("name2", "value2");
    expected.push_back (make_pair (1001, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1001);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events with a non-process event interleaved
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1001 name1 = value1 name2 = value2\nEVENT Event3 dp2 1001 name1 = value1 name2 = value2\nEVENT Event2 dp1 1001 name1 = value1 name2 = value2\nVTIME 1001");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");
    expected.push_back (make_pair (1001, evt1));

    Event evt2 ("Event2");
    evt2.addValue ("name1", "value1");
    evt2.addValue ("name2", "value2");
    expected.push_back (make_pair (1001, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1001);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // multiple events with a time advance after their arrival
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1000 name1 = value1 name2 = value2\nEVENT Event2 dp1 1001 name1 = value1 name2 = value2\nVTIME 1000\nVTIME 1001");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("Event1");
    evt1.addValue ("name1", "value1");
    evt1.addValue ("name2", "value2");
    expected.push_back (make_pair (1000, evt1));

    Event evt2 ("Event2");
    evt2.addValue ("name1", "value1");
    evt2.addValue ("name2", "value2");
    expected.push_back (make_pair (1001, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1001);
    assert (oss.str () == "VTACK\nVTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // event in the future, and an advance time event
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT Event1 dp1 1000 name1 = value1 name2 = value2\nEVENT AdvanceTime dp1 0 delta = 1000\nVTIME 0");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("AdvanceTime");
    evt1.addValue ("delta", "1000");
    expected.push_back (make_pair (0, evt1));

    Event evt2 ("Event1");
    evt2.addValue ("name1", "value1");
    evt2.addValue ("name2", "value2");
    expected.push_back (make_pair (1000, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "VTACK\n");
    assert (dp1.processedEvents == expected);
  }
  {
    // self schedule an event without a delay
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT ScheduleEvent dp1 1000 eventName = 2ndEvent destination = dp1\nVTIME 1000");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("ScheduleEvent");
    evt1.addValue ("destination", "dp1");
    evt1.addValue ("eventName", "2ndEvent");
    expected.push_back (make_pair (1000, evt1));

    Event evt2 ("2ndEvent");
    expected.push_back (make_pair (1000, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "EVENT 2ndEvent dp1 1000\nVTACK\n");

    assert (dp1.processedEvents == expected);
  }
  {
    // self schedule an event with a delay, no time advance
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT ScheduleEvent dp1 1000 eventName = 2ndEvent destination = dp1 delay = 100\nVTIME 1000");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("ScheduleEvent");
    evt1.addValue ("destination", "dp1");
    evt1.addValue ("delay", "100");
    evt1.addValue ("eventName", "2ndEvent");
    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1000);
    assert (oss.str () == "EVENT 2ndEvent dp1 1100\nVTACK\n");

    assert (dp1.processedEvents == expected);
  }
  {
    // self schedule an event with a delay, advance time after
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT ScheduleEvent dp1 1000 eventName = 2ndEvent destination = dp1 delay = 100\nVTIME 1000\nVTIME 1100");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("ScheduleEvent");
    evt1.addValue ("destination", "dp1");
    evt1.addValue ("delay", "100");
    evt1.addValue ("eventName", "2ndEvent");
    expected.push_back (make_pair (1000, evt1));

    Event evt2 ("2ndEvent");
    expected.push_back (make_pair (1100, evt2));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1100);
    assert (oss.str () == "EVENT 2ndEvent dp1 1100\nVTACK\nVTACK\n");

    assert (dp1.processedEvents == expected);
  }
  {
    // other schedule an event with a delay
    DummyProcess dp1 ("dp1");

    istringstream
      iss
      ("EVENT ScheduleEvent dp1 1000 eventName = 2ndEvent destination = dp2 delay = 100\nVTIME 1000\nVTIME 1100");
    ostringstream oss;

    vector < pair < unsigned int, Event > >expected;

    Event evt1 ("ScheduleEvent");
    evt1.addValue ("destination", "dp2");
    evt1.addValue ("delay", "100");
    evt1.addValue ("eventName", "2ndEvent");
    expected.push_back (make_pair (1000, evt1));

    ParallelEngine pe;
    //pe.run("dp1", dp1);

    assert (dp1.getTime () == 1100);
    assert (oss.str () == "EVENT 2ndEvent dp2 1100\nVTACK\nVTACK\n");

    assert (dp1.processedEvents == expected);
  }
  */
}
