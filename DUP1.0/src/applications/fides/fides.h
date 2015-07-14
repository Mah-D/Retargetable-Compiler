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
 * @file applications/fides/fides.h
 * @brief Base class for Filter-based Discrete Event Simulation (FIDES)
 *      processes
 *	(not to be confused with operating system processes).
 *	This class handles I/O and interfaces with its derived classes
 *      via callbacks to virtual methods.
 *
 * @author Matthew J. Rutherford
 */
#ifndef FIDES_H
#define FIDES_H

#include <iostream>
#include <map>
#include <queue>
#include <set>
#include <string>
#include <stdexcept>
#include <stdlib.h>
#ifdef FIDES_H
#define FIDES_DEBUG(something)
#else
#define FIDES_DEBUG(something) if(1){std::cerr << "DEBUG(" << __FILE__ << ":" << __LINE__ << "): " << something << std::endl;}
#endif
#define FIDES_INFO(something) std::cerr << "INFO: " << something << std::endl
#define FIDES_WARNING(something) std::cerr << "WARNING: " << something << std::endl
#define FIDES_ERROR(something) std::cerr << "ERROR: " << something << std::endl
#define FIDES_THROW(etype, something) {std::ostringstream __oss__;__oss__ << "EXCEPTION(" << __FILE__ << ":" << __LINE__ << "):" << something; throw etype(__oss__.str());}

namespace fides
{
  class Event
  {
  public:
    Event (const std::string & eventName):m_eventName (eventName)
    {
    }
    Event (const Event & de):m_eventName (de.m_eventName),
      m_values (de.m_values)
    {
    }

    void addValue (const std::string & name, const std::string & value);
    std::map < std::string, std::string >::const_iterator begin ()const
    {
      return m_values.begin ();
    }
    std::map < std::string, std::string >::const_iterator end () const
    {
      return m_values.end ();
    }
    const std::string & getEventName () const
    {
      return m_eventName;
    }
    const std::string & getValue (const std::string & name) const;
    bool hasValue (const std::string & name) const
    {
      return (m_values.find (name) != m_values.end ());
    }

    friend std::ostream & operator<< (std::ostream & o, const Event & event);
    friend bool fides::operator== (const Event & e1, const Event & e2)
    {
      return (e1.m_eventName == e2.m_eventName && e1.m_values == e2.m_values);
    }
    friend bool fides::operator!= (const Event & e1, const Event & e2)
    {
      return (e1.m_eventName != e2.m_eventName || e1.m_values != e2.m_values);
    }

  private:
    std::string m_eventName;
    std::map < std::string, std::string > m_values;
  };

  class FIDESListener
  {
  public:
    virtual ~ FIDESListener ()
    {
    };

    /*
     * callback methods for all of the known commands.
     */
    virtual void event (const std::string & processName,
                        unsigned int deliveryTime, const Event & event)
    {
    }
    virtual void state (const std::string & processType,
                        const std::string & processName, unsigned int vtime,
                        const std::string & name, const std::string & value)
    {
    }
    virtual void vtack (unsigned int vtackCount)
    {
    }
    virtual void vtime (unsigned int vtime)
    {
    }
  };


  class EventRecord
  {
  public:
    EventRecord (unsigned long pTime, const Event & pEvent):time (pTime),
      event (pEvent)
    {
    }

    EventRecord (const EventRecord & er):time (er.time), event (er.event)
    {
    }

    bool operator< (const EventRecord & that) const
    {
      return time < that.time;
    }

    bool operator> (const EventRecord & that) const
    {
      return time > that.time;
    }

    friend std::ostream & operator<< (std::ostream & o,
                                      const EventRecord & eventRecord);

    unsigned long time;

    Event event;
  };

  class Process;

  class SimulationEngine
  {
  public:
    virtual ~SimulationEngine() {}

    virtual void addProcess(Process& process) { m_processes.push_back(&process); }

    virtual void sendVtack(unsigned int) = 0;

    virtual void scheduleEvent(const std::string & destinationProcessName, unsigned int deliveryTime, const Event & event) = 0;
  protected:
    std::vector<Process*> m_processes;

  };

  class Process
  {
  public:
    Process (SimulationEngine& engine, const std::string & processName)
      : m_initialized(false), m_processName (processName), m_time (0), m_engine(&engine)
    {
      engine.addProcess(*this);
    }

    virtual ~Process() {}

    unsigned long advanceTime (unsigned long delta);

    const std::string & getProcessName () const
    {
      return m_processName;
    }

    unsigned long getTime () const
    {
      return m_time;
    }

    virtual void init ()
    {
    }

    virtual void processEvent (const Event & event) = 0;

    void scheduleEvent (const std::string & destinationProcessName,
                        unsigned int delay, const Event & event);

    void scheduleEvent (unsigned int delay, const Event & event)
    {
      scheduleEvent (m_processName, delay, event);
    }

    void scheduleEvent (const Event & event)
    {
      scheduleEvent (m_processName, 0, event);
    }

    virtual void event (const std::string & processName,
                        unsigned int deliveryTime, const Event & event);

    virtual void state (const std::string & processType,
                        const std::string & processName, unsigned int vtime,
                        const std::string & name, const std::string & value)
    {
    }
    virtual unsigned int vtime (unsigned int vtime);

  private:
    Process (const Process & dp)
    {
      throw std::logic_error ("what are you doing copying a Process!?!");
    }

    unsigned int processEvents ();

    bool m_initialized;
    std::string m_processName;
    std::priority_queue < EventRecord, std::vector < EventRecord >,
      std::greater < EventRecord > >m_eventQueue;
    unsigned long m_time;
    SimulationEngine* m_engine;
  };

  int FIDESRunner_process_line(void *proc_cls, char *start, char *end);

  class FIDESRunner
  {
  public:
    void buffer_output(const std::string& output);
    
    int process_line(char *start, char *end);

    void run (FIDESListener & il);
  private:
    struct OutputElement {
      const int size;
      char* data;
      int pos;

      OutputElement(const std::string&);

      virtual ~OutputElement();
    };

    std::queue<OutputElement*> m_outputElements;
    FIDESListener* m_inputListener;
    bool m_keepReading;
  };

  class ParallelEngine : public SimulationEngine, public FIDESListener
  {
  public:

    ParallelEngine();

    virtual ~ParallelEngine() {}

    /*
     * callback methods for all of the FIDESListner metods
     */
    virtual void event (const std::string & processName,
                        unsigned int deliveryTime, const Event & event);
    virtual void state (const std::string & processType,
                        const std::string & processName, unsigned int vtime,
                        const std::string & name, const std::string & value);
    virtual void vtime (unsigned int vtime);

    // method to parse input commands, canonicalize the parameters, and
    // call the appropriate method in the input listener
    void run();

    virtual void sendVtack(unsigned int vtackCount);
    virtual void scheduleEvent(const std::string & destinationProcessName, unsigned int deliveryTime, const Event & event);
  private:
    FIDESRunner* m_runner;
  };

  class MonolithicEngine : public SimulationEngine
  {
  public:
    MonolithicEngine();

    virtual ~MonolithicEngine() {}

    void addProcess(Process& process)
    {
      SimulationEngine::addProcess(process);
      m_processes.insert(make_pair(process.getProcessName(), &process));
    }

    void run();

    virtual void sendVtack(unsigned int) {} // no vtacks needed in Monolithic -- the method just returns
    virtual void scheduleEvent(const std::string & destinationProcessName, unsigned int deliveryTime, const Event & event);

  private:
    std::map<std::string,Process*> m_processes;
    std::set<unsigned int> m_vtimeSet;
  };

  // splits the first argument by the delimiters an adds them to the
  // end of 'tokens'
  void split (const std::string & str, std::vector < std::string > &tokens,
              const std::string & delimiters = " ");

  // modifies the argument by stripping leading and trailing whitespace
  // (space and tabs)
  std::string & trim (std::string & str);
};

#endif
