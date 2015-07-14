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
 * @file dupd/session.cc
 * @brief representation of a session
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "session.h"

DUPDSession::DUPDSession (uint32_t s_proc_cnt)
{
  err_code = DUPD_EC_STILL_WAITING;
  session_process_off = 0;
  session_process_count = s_proc_cnt;
  if (s_proc_cnt > 0)
    session_process_array =
      (DUPDProcess **) malloc (sizeof (DUPDProcess *) * s_proc_cnt);
  else
    session_process_array = NULL;
  my_emsg = NULL;
}

DUPDSession::~DUPDSession ()
{
  while (session_process_off > 0)
    delete session_process_array[--session_process_off];
  if (session_process_array != NULL)
    free (session_process_array);
  if (my_emsg != NULL)
    free (my_emsg);
}

void
DUPDSession::add_process (DUPDProcess * p)
{
  if (have_all_processes ())
    THROW_FATAL ("Internal logic error");
  session_process_array[session_process_off++] = p;
}

enum DUPD_ErrorCode
DUPDSession::is_ready (char **emsg)
{
  enum DUPD_ErrorCode ec;
  enum DUPD_ErrorCode e;

  if ((err_code != DUPD_EC_SUCCESS) && (err_code != DUPD_EC_STILL_WAITING))
    {
      *emsg = strdup (my_emsg);
      return err_code;
    }
  DEBUG ("Session ready questioned...");
  if (!have_all_processes ())
    return DUPD_EC_STILL_WAITING;
  ec = DUPD_EC_SUCCESS;
  for (unsigned int i = 0; i < session_process_count; i++)
    {
      e = session_process_array[i]->is_ready (&my_emsg);
      if (e == DUPD_EC_SUCCESS)
        continue;
      ec = e;
      if (e != DUPD_EC_STILL_WAITING)
        break;
    }
  DEBUG (ec == DUPD_EC_SUCCESS ? "Ready!" : "Not yet...");
  if ((ec != DUPD_EC_SUCCESS) && (ec != DUPD_EC_STILL_WAITING))
    {
      err_code = ec;
      *emsg = strdup (my_emsg);
    }
  return ec;
}

enum DUPD_ErrorCode
DUPDSession::start ()
{
  enum DUPD_ErrorCode ret;
  char *emsg;

  if (DUPD_EC_SUCCESS != is_ready (&emsg))
    {
      free (emsg);
      THROW_FATAL ("Internal logic error");
    }
  for (unsigned int i = 0; i < session_process_count; i++)
    if (DUPD_EC_SUCCESS != (ret = session_process_array[i]->start ()))
      return ret;
  return DUPD_EC_SUCCESS;
}
