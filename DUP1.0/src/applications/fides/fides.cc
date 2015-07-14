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
extern "C" {
#include <dup/dup_filter_lib.h>
}
#include <assert.h>
#include <stdexcept>
#include <iostream>
#include <sstream>
#include <set>
#include "fides.h"


using namespace std;
using namespace fides;

string partial_line_holder;

void Event::addValue(const string & name, const string & value) {
	pair<map<string, string>::iterator, bool> ret = m_values.insert(make_pair(
			name, value));
	if (!ret.second) {
		FIDES_THROW (invalid_argument, name << " already exists in event");
	}
}

const string &
Event::getValue(const string & name) const {
	map<string, string>::const_iterator itr = m_values.find(name);
	if (itr != m_values.end()) {
		return (*itr).second;
	} else {
		FIDES_THROW (invalid_argument, name << " is not found in event");
	}
}

ostream & fides::operator<<(ostream & o, const Event & event) {
	o << "[Event(" << event.m_eventName << "):";
	map<string, string>::const_iterator citr;
	for (citr = event.begin(); citr != event.end(); citr++) {
		o << " " << citr->first << " = " << citr->second;
	}
	return o << "]";
}

ostream & fides::operator<<(ostream & o, const EventRecord & eventRecord) {
	return o << "[EventRecord: time=" << eventRecord. time << ", event="
			<< eventRecord.event << "]";
}

unsigned long Process::advanceTime(unsigned long delta) {
	m_time += delta;
	return m_time;
}

unsigned int Process::processEvents() {
  unsigned ret = 0;
  while (!m_eventQueue.empty() && m_eventQueue.top().time <= m_time) {
    if (m_eventQueue.top().time == m_time) {
      processEvent(m_eventQueue.top().event);
      ret++;
    } else {
      FIDES_WARNING ("process was busy during event arrival: " <<
		     m_eventQueue.top ().event);
    }
    m_eventQueue.pop();
  }
  return ret;
}

void Process::event(const string & processName, unsigned int deliveryTime,
		const Event & event) {
	if (processName == m_processName) {
		FIDES_DEBUG (m_processName << " scheduling event at " << deliveryTime <<
				":" << event);
		m_eventQueue.push(EventRecord(deliveryTime, event));
	}
}

unsigned int Process::vtime(unsigned int vtime) {
  if (vtime >= m_time) {
    m_time = vtime;
    
    unsigned int vtack = 0;
    if (m_time == 0 && !m_initialized) {
      m_initialized = true;
      init();
      vtack = 1;
    }
    
    if(processEvents () > 0){
      vtack = 1;
    }

    return vtack;
  }
  else
    {
      FIDES_THROW (logic_error,
                   m_processName << " received historical VTIME message");
    }
}

void tokenize(istream & is, vector<string> &tokens) {
	string tmp;

	while (is >> tmp) {
		tokens.push_back(tmp);
	}
}

fides::ParallelEngine::ParallelEngine()
{
  m_runner = NULL;
}

fides::FIDESRunner::OutputElement::OutputElement(const string& output)
  : size(output.size()), data(NULL), pos(0)
{
  data = new char [ size ];
  assert(data);
  strncpy(data, output.c_str(), size);
}

fides::FIDESRunner::OutputElement::~OutputElement()
{
  if(data){
    delete [] data;
  }
}

void
fides::FIDESRunner::buffer_output(const string& output)
{
  m_outputElements.push(new OutputElement(output));
}

void
fides::FIDESRunner::run (FIDESListener & il)
{
  fd_set writeset;
  fd_set readset;
  size_t buf_size = 256;
  size_t s_val = 0;
  size_t position = 0;
  char* buffer = new char [ buf_size ];
  m_keepReading = true;
  m_inputListener = &il;

  while(m_keepReading || !m_outputElements.empty()){
    FD_ZERO(&readset);
    // only read more input if we are still running
    if(m_keepReading){
      FD_SET(0, &readset);
    }

    FD_ZERO(&writeset);
    // only need to select for writing if there are output elements to
    // be written
    if(!m_outputElements.empty()){
      FD_SET(1, &writeset);
    }
    
    // DUP_select handles errors internally
    DUP_select(2, &readset, &writeset, NULL);
    
    if (FD_ISSET(1, &writeset)) {
      OutputElement* ol = m_outputElements.front();
      ssize_t out_size = DUP_write(1, &ol->data[ol->pos], (ol->size - ol->pos));
      if (out_size == 0) {
	// looks like output has closed!
	FIDES_THROW(logic_error, "DUP_write returned zero for out_size");
      }
      ol->pos += out_size;
      if (ol->pos == ol->size) {
	delete ol;
	m_outputElements.pop();
      }
    }
    if (FD_ISSET(0, &readset)) {
      if (DUP_try_read_line(0, &buffer, &buf_size, &s_val, &position,
			    &fides::FIDESRunner_process_line, this) <= 0) {
	m_keepReading = false;
	// continue because we may still need to write.
	continue;
      }
    }
  }
  delete[] buffer;
}

void fides::ParallelEngine::sendVtack(unsigned int vtackCount)
{
  assert(m_runner != NULL);
  ostringstream out;
  out << "VTACK " << vtackCount << endl;
  m_runner->buffer_output(out.str());
}

void fides::ParallelEngine::scheduleEvent(const std::string & destinationProcessName, unsigned int deliveryTime, const Event & event)
{
    ostringstream out;
    out << "EVENT " << event.getEventName () << " " << destinationProcessName << " " << deliveryTime;

    map < string, string >::const_iterator citr;
    for (citr = event.begin (); citr != event.end (); citr++)
      {
	out << " " << citr->first << " = " << citr->second;
      }
    out << endl;
    assert(m_runner != NULL);
    m_runner->buffer_output(out.str());
}

int
fides::FIDESRunner_process_line(void *proc_cls, char *start, char *end)
{
  return ((FIDESRunner*)proc_cls)->process_line(start, end);
}

int
fides::FIDESRunner::process_line(char *start, char *end)
{
  size_t size = 1 + end - start;
  string line(start, size);

	if (strncmp("\n", end, 1) == 0) {
		if (partial_line_holder.length() > 0)
		{
			partial_line_holder.append(line.c_str());
			line.clear();
			line.append(partial_line_holder.c_str());
			partial_line_holder.clear();
		}
	}
	else
	{
		partial_line_holder.clear();
		partial_line_holder.append(line.c_str());
		FIDES_DEBUG("endline NOT FOUND line, " << line);
		return 1;
	}

	trim(line);
	//if (line.length())
	if (line == "" || line[0] == '#') {
		return 1;
	}

	// use a stringstream to parse within the line
	istringstream ss(line);
	string token;
	vector<string> tokens;

	ss >> token;

	trim(token);

	// line was all whitespace
	if (token.empty()) {
		return 1;
	}

	if (token == "VTIME") {
	  tokenize(ss, tokens);
	  
	  if (tokens.size() != 1) {
	    FIDES_THROW (invalid_argument,
			 "Invalid VTIME line: '" << line << "'");
	  }
	  
	  unsigned long tmp_time = strtoul(tokens.at(0).c_str(), NULL, 10);
	  m_inputListener->vtime(tmp_time);
	} else if (token == "EVENT") {
	  // it is a regular event:
	  // EVENT <eventType> <processName> <deliveryTime> [<name> = <value>]*
	  tokenize(ss, tokens);
	  
	  if (tokens.size() < 3) {
	    FIDES_THROW (invalid_argument,
			 "invalid EVENT line: '" << line << "'");
	  }
	  
	  vector<string>::const_iterator itr = tokens.begin();
	  
	  Event event(*itr++);
	  
	  string processName(*itr++), name, equals, value;
	  
	  // delivery time
	  token = *itr++;
	  unsigned long deliveryTime = strtoul(token.c_str(), NULL, 10);
	  
	  while (itr != tokens.end()) {
	    name = *itr++;
	    if (itr == tokens.end()) {
	      FIDES_THROW (invalid_argument,
			   "invalid EVENT line: '" << line << "'");
	    }
	    
	    equals = *itr++;
	    if (equals != "=" || itr == tokens.end()) {
	      FIDES_THROW (invalid_argument,
			   "invalid EVENT line: '" << line << "'");
	    }
	    
	    value = *itr++;
	    
	    event.addValue(name, value);
	  }
	  
	  m_inputListener->event(processName, deliveryTime, event);
	} else if (token == "STATE") {
	  // it is a state record
	  string processType, processName, name, value;
	  
	  ss >> processType >> processName >> token >> name >> value;
	  if (trim(processType).length() > 0 && trim(processName).length() > 0
	      && trim(token).length() > 0 && trim(name).length() > 0
	      && trim(value).length() > 0) {
	    unsigned long vtime = strtoul(token.c_str(), NULL, 10);
	    m_inputListener->state(processType, processName, vtime, name, value);
	  } else {
	    FIDES_ERROR ("processType = '" << processType << "'");
	    FIDES_ERROR ("processName = '" << processName << "'");
	    FIDES_ERROR ("token = '" << token << "'");
	    FIDES_ERROR ("name = '" << name << "'");
	    FIDES_ERROR ("value = '" << value << "'");
	    FIDES_THROW (invalid_argument,
			 "invalid STATE line: '" << line << "'");
	  }
	} else if (token == "VTACK") {
	  tokenize(ss, tokens);
	  
	  if (tokens.size() != 1) {
	    FIDES_THROW (invalid_argument,
			 "Invalid VTACK line: '" << line << "'");
	  }
	  
	  unsigned long tmp_vtackCount = strtoul(tokens.at(0).c_str(), NULL, 10);
	  m_inputListener->vtack(tmp_vtackCount);
	} else if (token == "END") {
		m_keepReading = false;
	} else {
		FIDES_THROW (logic_error, "received unexpected command: " << token);
	}
	return 1;
}

void
Process::scheduleEvent (const std::string & destinationProcessName,
                        unsigned int delay, const Event & event)
{
  // even if it is a self scheduled event, always write out the event
  // line so the timekeeper can figure out what is going on
  unsigned long deliveryTime = m_time + delay;

  // only need to send out the event if it is for another process, or
  // it is in the future.  Zero-delay events on this process do not
  // need to be be broadcast.
  if(delay > 0 || destinationProcessName != m_processName){
    assert(m_engine != NULL);
    m_engine->scheduleEvent(destinationProcessName, deliveryTime, event);
  }

  if (destinationProcessName == m_processName) {
    // don't need to process events since this method
    // should only be called during a processEvent call
    // inside the loop.
    m_eventQueue.push(EventRecord(deliveryTime, event));
  }
}

void ParallelEngine::event(const string & processName,
			   unsigned int deliveryTime, const Event & event) {
  vector<Process*>::iterator itr;
  for (itr = m_processes.begin(); itr != m_processes.end(); itr++) {
    (*itr)->event(processName, deliveryTime, event);
  }
}

void ParallelEngine::state(const string & processType,
			   const string & processName, unsigned int vtime, const string & name,
			   const string & value) {
  vector<Process *>::iterator itr;
  for (itr = m_processes.begin(); itr != m_processes.end(); itr++) {
		(*itr)->state(processType, processName, vtime, name, value);
	}
}

void ParallelEngine::vtime(unsigned int vtime) {
	unsigned int vtackCount = 0;
	vector<Process *>::iterator itr;
	for (itr = m_processes.begin(); itr != m_processes.end(); itr++) {
		vtackCount += (*itr)->vtime(vtime);
	}
	if(vtackCount){
	  this->sendVtack(vtackCount);
	}
}

void fides::ParallelEngine::run()
{
  FIDESRunner runner;
  m_runner = &runner;

  runner.run(*this);

  m_runner = NULL;
}

fides::MonolithicEngine::MonolithicEngine()
{
}

void fides::MonolithicEngine::run()
{
  // initialize the vtime array
  assert(m_vtimeSet.size() == 0);
  m_vtimeSet.insert(0);

  // initialize the processes
  for(map<string,Process*>::iterator itr = m_processes.begin(); itr != m_processes.end(); ++itr){
    itr->second->init();
  }
  unsigned int vtime = 0;
  while(m_vtimeSet.size() > 0){
    set < unsigned int >::iterator first = m_vtimeSet.begin ();
    assert(first != m_vtimeSet.end());
    FIDES_DEBUG("vtime = " << vtime << ", first = " << (*first));
    assert((*first) >= vtime);
    m_vtimeSet.erase(first);

    vtime = (*first);

    // loop across the processes, inside the call to vtime, events may
    // be scheduled
    for(map<string,Process*>::iterator itr = m_processes.begin(); itr != m_processes.end(); ++itr){
      itr->second->vtime(vtime);
    }
  }
}

void fides::MonolithicEngine::scheduleEvent(const std::string & destinationProcessName, unsigned int deliveryTime, const Event & event)
{
  assert(m_processes.find(destinationProcessName) != m_processes.end());
  FIDES_DEBUG("MonolithicEngine::scheduleEvent: destination = " << destinationProcessName << ", at = " << deliveryTime << ":" << event);
  m_vtimeSet.insert(deliveryTime);
  m_processes[destinationProcessName]->event(destinationProcessName, deliveryTime, event);
}

// [MJR 1/7/09]: Adapted the following from the implementation found
// at:
//
//      http://sarathc.wordpress.com/2007/01/31/how-to-trim-leading-or-trailing-spaces-of-string-in-c/
//
// Did not find a license mentioned here, assuming it is public
// domain.
string & fides::trim(string & str) {
	// trim both leading and trailing spaces
	size_t startpos = str.find_first_not_of(" \t\n"); // Find the first character position after excluding leading blank spaces
	size_t endpos = str.find_last_not_of(" \t\n"); // Find the first character position from reverse af

	// if all spaces or empty, return an empty string
	if ((string::npos == startpos) || (string::npos == endpos)) {
		str = "";
	} else {
		str = str.substr(startpos, endpos - startpos + 1);
	}
	return str;
}

// [MJR 2/20/09]: Adapted the following from the example found at:
//
//      http://oopweb.com/CPP/Documents/CPPHOWTO/Volume/C++Programming-HOWTO-7.html
//
// Did not find any license / copyright mentioned here, assuming it is
// public domain

void fides::split(const string & str, vector<string> &tokens,
		const string & delimiters) {
	// Skip delimiters at beginning.
	string::size_type lastPos = str.find_first_not_of(delimiters, 0);
	// Find first "non-delimiter".
	string::size_type pos = str.find_first_of(delimiters, lastPos);

	while (string::npos != pos || string::npos != lastPos) {
		// Found a token, add it to the vector.
		tokens.push_back(str.substr(lastPos, pos - lastPos));
		// Skip delimiters.  Note the "not_of"
		lastPos = str.find_first_not_of(delimiters, pos);
		// Find next "non-delimiter"
		pos = str.find_first_of(delimiters, lastPos);
	}
}
