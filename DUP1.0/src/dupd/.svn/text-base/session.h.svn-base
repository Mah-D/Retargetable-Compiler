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
 * @file dupd/session.h
 * @brief representation of a session
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_SESSION_H
#define DUPD_SESSION_H

#include "process.h"

class DUPDSession
{
public:
  DUPDSession (uint32_t s_proc_cnt);

  virtual ~ DUPDSession ();

  void add_process (DUPDProcess * p);

  enum DUPD_ErrorCode is_ready (char **emsg);

  /**
   * @return 0 on success, error code otherwise
   */
  enum DUPD_ErrorCode start ();

  int have_all_processes ()
  {
    return session_process_count == session_process_off;
  }

  uint32_t get_current_process_number ()
  {
    return session_process_off;
  }

  /**
   * Notify this session object about a fatal error.
   */
  void notify_fatal_error (enum DUPD_ErrorCode err)
  {
    if ((err_code == DUPD_EC_SUCCESS) || (err_code == DUPD_EC_STILL_WAITING))
      err_code = err;
  }

  DUPDProcess *get_process (unsigned int pidx)
  {
    if (pidx == 0)
      abort ();                 // that's for DUP!
    return (pidx <=
            session_process_off) ? session_process_array[pidx - 1] : NULL;
  }

  enum DUPD_ErrorCode err_code;

  char *my_emsg;


private:
  uint32_t session_process_count;

  uint32_t session_process_off;

  DUPDProcess **session_process_array;

};

#endif
