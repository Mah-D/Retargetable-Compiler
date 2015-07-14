/*
     This file is part of DUP.
     (C) 2008, 2009, 2010 The DUP team

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
 * @file dup/dup_edge.h
 * @brief representation of a stream between two
 *        processes or a process and a file
 * @author Krista Grothoff
 */
#ifndef DUP_EDGE_H
#define DUP_EDGE_H

#include "globals.h"
#include "dup_string.h"
#include <iostream>

using namespace std;

class Process;

class ControlConnection;

class EdgeNode
{
public:
  char *name;
  int descriptor_number;

    EdgeNode ();
    EdgeNode (int desc_num);
    EdgeNode (const char *path);
    EdgeNode (const char *id, int desc_num);
    EdgeNode (const EdgeNode & en);
   ~EdgeNode ();

  void print ();
  void pretty_print (std::ostream & stream = std::cout);

  /**
   * Does this edge represent a connection to the
   * dup process?
   */
  int is_dup (void);

  /**
   * Set the process that this edge belongs to.
   */
  void set_process (Process * p)
  {
    process = p;
  }

  Process *get_process ()
  {
    return process;
  }

  /**
   * Return 1 if p is running on the same host as we are.
   */
  int is_local (const Process * p);

  /**
   * What is the pidx (at the remote machine) of the
   * process that this edge belongs to?
   */
  uint32_t get_pidx (void);

  /**
   * Get the port of the DUPD that will start this
   * process.
   */
  uint16_t get_port (void);

private:

  /**
   * Either NULL or a pointer to our process
   */
  Process * process;

  /**
   * DupString variant of "name".
   */
  DupString *ds_name;

};

class Edge
{
public:
  EdgeNode * left;
  OperatorType op;
  EdgeNode *right;
  uint64_t stream_id;

    Edge ();
    Edge (uint64_t sid);
    Edge (OperatorType myOp, EdgeNode * myLeft, EdgeNode * myRight);
    Edge (const Edge & e);
   ~Edge ();

  /**
   * Transmit information about this edge to
   * the given socket (one write call at a time).
   *
   * @param p process that this edge belongs to
   * @return 0 if we have more to send, 1 if we are done
   */
  int transmit (const Process * const p, 
		ControlConnection* s);

  /**
   * Get the inverse edge of this edge.  Only works
   * if this edge is for a PIPE.
   *
   * @param pl identify of the original
   *        "left" process (currently unnamed)
   * @param pr identify of the original
   *        "right" process (possibly named)
   */
  Edge *inverse (Process * pl, Process * pr);

  /**
   * Check that this edge is valid in terms of
   * syntactic input.  Specifically, we check
   * that the left node either has no label
   * or that it is "DUP".
   *
   * We also check that if IO-redirection is used,
   * the right contains a filename and not
   * a descriptor.
   */
  void check_valid_input (Process * p);

  void print ();
  void pretty_print (std::ostream & stream = std::cout);
  static void print_operator (OperatorType op, std::ostream & stream =
                              std::cout);

private:
  char header[sizeof (DupToDupdEdgeInfo)];

  size_t bytes_header_sent;

  DupString *rest;

  void prepare_transmit (const Process * p);

};
#endif
