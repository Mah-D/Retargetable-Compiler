/*
     This file is part of DUP.
     (C) 2008, 2010 The DUP team

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
 * @file dupd/process.h
 * @brief representation of a process
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_PROCESS_H
#define DUPD_PROCESS_H

#include "io_descriptor.h"
#include "dup_network.h"

enum ProcessReadyLevel
{
  PRL_NONE,
  PRL_ARGS,
  PRL_EXEC,
  PRL_IODS,
  PRL_READY
};

class DUPDProcess
{
public:
  DUPDProcess (uint32_t fd_cnt, uint32_t arg_cnt);

  virtual ~ DUPDProcess ();

  /**
   * @return EC_SUCCESS if we are ready, EC_STILL_WAITING
   *  if we are still waiting for connections
   *  to be ready; otherwise we have had a fatal problem
   */
  enum DUPD_ErrorCode is_ready (char **emsg);

  /**
   * Fork and exec. Must only be called after "is_ready"
   * returned 1.
   * @return 0 on success, error code otherwise
   */
  enum DUPD_ErrorCode start ();

  void add_argument (const char *arg);

  enum DUPD_ErrorCode add_iod (DUPDIODescriptor * iod, char **emsg);

  /**
   * @return 0 if we need more arguments
   */
  int have_all_arguments ()
  {
    return arg_count == arg_pos;
  }

  /**
   * @return 0 if we need more iods
   */
  int have_all_iods ()
  {
    return fd_count == fd_pos;
  }

  void notify_ready (uint32_t fd_num, 
		     uint64_t stream_id,
		     DUPDFileDescriptor * fd);

private:

  enum ProcessReadyLevel ready_level;

  /**
   * Size of fd_array.
   */
  uint32_t fd_count;

  /**
   * Current read-position in fd_array.
   */
  uint32_t fd_pos;

  /**
   * Compact array of FDs in order received from the network.
   */
  DUPDIODescriptor **fd_array;

  /**
   * Map of file-descriptor numbers to IODs.  Mirrors
   * fd_array but is ordered by the FDs that we will use.
   */
  map < uint32_t, DUPDIODescriptor * >fd_map;

  /**
   * Size of the args array.
   */
  uint32_t arg_count;

  /**
   * Current read-position in args.
   */
  uint32_t arg_pos;

  /**
   * Command line for the process to run.
   */
  char **args;

};

#endif
