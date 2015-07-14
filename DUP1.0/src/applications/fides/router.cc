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

static map<string, int> pidMap;
static bool m_keepReading = true;
static string partial_line_holder;

#if 0
static int send_to_all(string line)
{
  map<string, int>::const_iterator iter;
  for (iter = pidMap.begin(); iter != pidMap.end(); ++iter)
  {
    DUP_write_all(iter->second, line.c_str(), line.size());
  }
}
#endif

static int send_to_process(string line, string processID)
{
  if (pidMap.find(processID) != pidMap.end())
  {
    FIDES_DEBUG("Found process id of " << processID << ", sending to it on fd" << pidMap[processID]);
    line.append("\n");
    DUP_write_all(pidMap[processID], line.c_str(), line.size());
    //DUP_write_all(1, line.c_str(), line.size());
    return 0;
  }
  else
  {
    return 1;
    FIDES_DEBUG("DID NOT find process id of " << processID);
  }
}

void tokenize(istream & is, vector<string> &tokens) {
  string tmp;

  while (is >> tmp) {
    tokens.push_back(tmp);
  }
}

static int
router_process_line(void *proc_cls, char *start, char *end)
{
  size_t size = 1 + end - start;
  string line(start, size);
  int ret;

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
  if (line == "" || line[0] == '#')
  {
    return 1;
  }

  FIDES_DEBUG("RECEIVED LINE: " << line);
  // use a stringstream to parse within the line
  istringstream ss(line);
  string token;
  vector<string> tokens;

  ss >> token;

  trim(token);

  // line was all whitespace
  if (token.empty())
  {
    return 1;
  }

  if (token == "VTIME")
  {
    tokenize(ss, tokens);

    if (tokens.size() != 1)
    {
      FIDES_THROW (invalid_argument,
       "Invalid VTIME line: '" << line << "'");
    }

    FIDES_DEBUG("Received VTIME, no need to send on");
    // Send to none
    //line.append("\n");
    //ret = send_to_all(line);

  }
  else if (token == "EVENT")
  {
    // it is a regular event:
    // EVENT <eventType> <processName> <deliveryTime> [<name> = <value>]*
    // Send to processName (if we know that process)

    tokenize(ss, tokens);

    if (tokens.size() < 3)
    {
      FIDES_THROW (invalid_argument,
       "invalid EVENT line: '" << line << "'");
    }

    vector<string>::const_iterator itr = tokens.begin();

    Event event(*itr++);
    string processName(*itr++);
    ret = send_to_process(line, processName);
    // Send to processName process, provided we know them!

  }
  else if (token == "STATE")
  {
    // State not yet implemented, but send to all
  }
  else if (token == "VTACK")
  {
    FIDES_DEBUG("Received VTACK, sending to stdout (should be timekeeper!)");
    // Send to timekeeper
    line.append("\n");
    DUP_write_all(1, line.c_str(), line.size());
    //ret = send_to_all(line);
  }
  else if (token == "END")
  {
    m_keepReading = false;
    // Send to none
    FIDES_DEBUG("Received END, no need to send on");
  } else
  {
    FIDES_THROW (logic_error, "received unexpected command: " << token);
  }

  return 1;
}


int
main (int argc, char **argv)
{
  bool read_from_file = false;
  char * filename;

  /*
   * check command line arguments.
   */
  if (argc < 2)
    {
      FIDES_ERROR
        ("usage: router [-f filename] processID:fd,processID:fd,...");
      return 1;
    }

  if (strcmp(argv[1], "-f") == 0)
  {
    read_from_file = true;
    if (argc == 3)
      filename = argv[2];
    else
    {
      FIDES_ERROR ("usage: router -f filename");
      return 1;
    }
  }

  if (!read_from_file)
  {
    vector < string > tokens;
    if (strstr(argv[1], ",") != NULL)
    {
      split (string(argv[1]), tokens, ",");
      for (vector < string >::const_iterator itr = tokens.begin ();
                       itr != tokens.end (); itr++)
      {
        vector <string> pairs;
        split ((*itr), pairs, ":");
        pidMap[pairs[0]] = atoi(pairs[1].c_str());
      }
    }
    else
    {
      vector <string> pairs;
      split (string(argv[1]), pairs, ":");
      FIDES_DEBUG("processID " << pairs[0] << ", fd " << pairs[1]);
      pidMap[pairs[0]] = atoi(pairs[1].c_str());
    }
  }

  fd_set writeset;
  fd_set readset;
  size_t buf_size = 256;
  size_t s_val = 0;
  size_t position = 0;
  char* buffer = new char [ buf_size ];


  while(m_keepReading){
    FD_ZERO(&readset);
    // only read more input if we are still running
    if(m_keepReading)
    {
      FD_SET(0, &readset);
    }

    FD_ZERO(&writeset);

    // DUP_select handles errors internally
    DUP_select (2, &readset, &writeset, NULL);

    if (FD_ISSET(0, &readset))
    {
      if (DUP_try_read_line(0, &buffer, &buf_size, &s_val, &position,
          &router_process_line, NULL) <= 0)
      {
        m_keepReading = false;
        // continue because we may still need to write.
        continue;
      }
    }
  }

}

