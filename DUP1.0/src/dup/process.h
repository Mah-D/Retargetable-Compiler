/*
     This file is part of DUP.
     (C) 2008, 2009 The DUP team

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
 * @file dup/dup_process.h
 * @brief representation of a process
 * @author Krista Grothoff
 */

#ifndef DUP_PROCESS_H
#define DUP_PROCESS_H

#include "globals.h"
#include "edge.h"
#include "dup_network.h"
#include <vector>
#include <iostream>
#include <map>

using namespace std;

class ControlConnection;

class Process
{
public:
  char *process_id;
  char *host_address;
  uint16_t portnum;
  vector < char *>command_args;
  vector < Edge * >edge_list;
  map < int, Edge * >edge_map;

  Process ();
  ~Process ();
  Process (const Process & p);
  
  /**
   * Are we running on the same host as the given other process?
   */
  int same_host (const Process * other)
  {
    return (portnum == other->portnum) &&
      (0 == strcmp (host_address, other->host_address));
  }

  void print ();

  void pretty_print (std::ostream & stream = std::cout);

  void pretty_print_old_dup (std::ostream & stream = std::cout);

  /**
   * For all pipes where this is the writing process,
   * add a corresponding edge to the reading process.
   */
  void connect_pipes (map < const string, Process * >pmap);

  /**
   * Get the index that this process will have
   * in the list processes that the DUPD has for
   * this session. Note that the indices start with 1,
   * not with zero (zero is reserved!).  The returned
   * value is only valid after set_index was called.
   */
  uint32_t get_index () const
  {
    return my_index;
  }

  /**
   * Set the index that this process will have on the DUPD side.
   */
  void set_index (uint32_t idx)
  {
    my_index = idx;
  }

  /**
   * Transmit information about this process to
   * the given socket (one write call at a time).
   * @return 0 if we have more to send, 1 if we are done
   */
  int transmit (ControlConnection *s);

  void add_edge (Edge * e);

private:

  /**
   * Index that this process will have in the list processes that the
   * DUPD has for this session. Note that the indices start with 1,
   * not with zero (zero is reserved!).
   */
  uint32_t my_index;

  size_t header_bytes_sent;

  unsigned int edges_sent;

  unsigned int commands_sent;

  DupString *currentArg;

  char header[sizeof (DupToDupdProcessInfo)];

};

#endif
