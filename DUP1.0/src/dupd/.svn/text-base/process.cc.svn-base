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
 * @file dupd/process.cc
 * @brief representation of a process
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "process.h"
#include "listen_stream.h"

DUPDProcess::DUPDProcess (uint32_t fd_cnt, uint32_t arg_cnt)
{
  fd_count = fd_cnt;
  fd_pos = 0;
  if (fd_cnt > 0)
    fd_array =
      (DUPDIODescriptor **) malloc (sizeof (DUPDIODescriptor *) * fd_cnt);
  else
    fd_array = NULL;
  arg_count = arg_cnt;
  arg_pos = 0;
  args = (char **) malloc (sizeof (char *) * (arg_cnt + 1));
  args[arg_cnt] = NULL;
  ready_level = PRL_NONE;
}

DUPDProcess::~DUPDProcess ()
{
  for (uint32_t i = 0; i < fd_pos; i++)
    {
      if (fd_array[i] != NULL)
	delete fd_array[i];
    }
  if (fd_array != NULL)
    free (fd_array);
  for (uint32_t i = 0; i < arg_pos; i++)
    free (args[i]);
  free (args);
}

void
DUPDProcess::add_argument (const char *arg)
{
  if (have_all_arguments ())
    THROW_FATAL ("Internal logic error");
  args[arg_pos++] = strdup (arg);
}

/**
 * Log an error message to stderr and also return it
 * as a string.
 */
static char *
dupd_error (const char *format, ...)
{
  int ret;
  char *s;
  va_list ap;

  va_start (ap, format);
  vfprintf (stderr, format, ap);
  va_end (ap);
  va_start (ap, format);
  ret = vsnprintf (NULL, 0, format, ap);
  va_end (ap);
  s = (char *) malloc (ret + 1);
  va_start (ap, format);
  vsprintf (s, format, ap);
  va_end (ap);
  s[ret] = '\0';
  return s;
}


enum DUPD_ErrorCode
DUPDProcess::add_iod (DUPDIODescriptor * iod, char **emsg)
{
  if (have_all_iods ())
    THROW_FATAL ("Internal logic error");
  if (NULL != fd_map[iod->get_target_fd ()])
    {
      *emsg =
        dupd_error ("Received two entries for descriptor %d.  Rejecting.\n",
                    iod->get_target_fd ());
      return DUPD_EC_DUP_CTL_PROTOCOL_VIOLATION;
    }
  fd_array[fd_pos++] = iod;
  fd_map[iod->get_target_fd ()] = iod;
  return DUPD_EC_SUCCESS;
}

/**
 * Test if "fn" is executable.  More specifically,
 * this function will use the PATH environment variable
 * (in the same way execvp does it) to find a file
 * with the specified name and then checks if that file
 * is executable.
 *
 * @return DUPD_EC_SUCCESS if the file exists and is executable
 */
static enum DUPD_ErrorCode
test_executable (const char *fn, char **emsg)
{
  const char *cpath;
  const char *tok;
  char *path;
  char *an;
  enum DUPD_ErrorCode ret;
  int en;

  if (fn[0] == '/')
    {
      if (0 == access (fn, X_OK))
        return DUPD_EC_SUCCESS;
      en = errno;
      *emsg = dupd_error ("Failed to access file `%s': %s\n",
                          fn, strerror (errno));
      if (en == EACCES)
        return DUPD_EC_ACCESS_DENIED;
      return DUPD_EC_EXEC_OPEN_FAILURE;
    }
  cpath = getenv ("PATH");
  if (cpath == NULL)
    cpath = ":/bin:/usr/bin";   // default path
  path = strdup (cpath);
  tok = strtok (path, ":");
  while (NULL != tok)
    {
      an = (char *) malloc (strlen (tok) + strlen (fn) + 2);
      sprintf (an, "%s/%s", tok, fn);
      if (0 == access (an, F_OK))
        {
          if (0 == access (an, X_OK))
            ret = DUPD_EC_SUCCESS;
          else
            {
              en = errno;
              *emsg = dupd_error ("Failed to access file `%s': %s\n",
                                  fn, strerror (errno));
              if (en == EACCES)
                ret = DUPD_EC_ACCESS_DENIED;
              else
                ret = DUPD_EC_EXEC_OPEN_FAILURE;
            }
          free (an);
          free (path);
          return ret;
        }
      free (an);
      tok = strtok (NULL, ":");
    }
  free (path);
  *emsg = dupd_error ("Failed to find binary `%s' in path `%s'\n", fn, cpath);
  return DUPD_EC_EXEC_OPEN_FAILURE;
}

enum DUPD_ErrorCode
DUPDProcess::is_ready (char **emsg)
{
  enum DUPD_ErrorCode ec;
  enum DUPD_ErrorCode e;

  switch (ready_level)
    {
    case PRL_NONE:
      if (!have_all_arguments ())
        return DUPD_EC_STILL_WAITING;
      ready_level = PRL_ARGS;
    case PRL_ARGS:
      if (DUPD_EC_SUCCESS != (e = test_executable (args[0], emsg)))
        return e;
      ready_level = PRL_EXEC;
    case PRL_EXEC:
      if (!have_all_iods ())
        return DUPD_EC_STILL_WAITING;
      ready_level = PRL_IODS;
    case PRL_IODS:
      e = DUPD_EC_SUCCESS;
      for (uint32_t i = 0; i < fd_count; i++)
        {
          ec = fd_array[i]->is_ready (emsg);
          if (ec == DUPD_EC_SUCCESS)
            continue;
          e = ec;
          if (e != DUPD_EC_STILL_WAITING)
            return e;
        }
      if (e != DUPD_EC_SUCCESS)
        return e;
      ready_level = PRL_READY;
    case PRL_READY:
      return DUPD_EC_SUCCESS;
    default:
      return DUPD_EC_INTERNAL_ERROR;
    }
}

void
DUPDProcess::notify_ready (uint32_t fd_num, 
			   uint64_t stream_id,
			   DUPDFileDescriptor * fd)
{
  int ret;
  DUPDIODescriptor *iod = fd_map[fd_num];

  if (iod == NULL)
    {
      fprintf (stderr,
	       "Unexpected input FD %u for process `%s'. Rejecting (0).\n",
	       (unsigned int) fd_num,
	       this->args[0]);
      delete fd;
      return;
    }
  if (0 != (ret = iod->notify_ready (stream_id, fd)))
    {
      fprintf (stderr,
               "Unexpected input FD %u for process `%s'.  Rejecting (%d).\n",
	       (unsigned int) fd_num,
	       this->args[0],
	       ret);
      delete fd;
      return;
    }
  instant_retry = 1;
}

enum DUPD_ErrorCode
DUPDProcess::start ()
{
  char *emsg;
  if (DUPD_EC_SUCCESS != is_ready (&emsg))
    {
      free (emsg);
      THROW_FATAL ("Internal logic error");
    }
#if PRINT_INFO
  fprintf (stderr, "About to fork %s\n", args[0]);
#endif
  pid_t pid = fork ();
  if (pid == -1)
    {
      fprintf (stderr, "Failed to fork: %s\n", strerror (errno));
      return DUPD_EC_FAILED_TO_FORK;
    }
  if (pid != 0)
    {
      for (uint32_t i = 0; i < fd_count; i++)
	{
	  delete fd_array[i];
	  fd_array[i] = NULL;
	}      
      return DUPD_EC_SUCCESS;
    }
  // close listen socket => will have at least
  // one free socket for duping!
  if (listen_stream4 != NULL)
    delete listen_stream4;
  listen_stream4 = NULL;
  if (listen_stream6 != NULL)
    delete listen_stream6;
  listen_stream6 = NULL;

  for (uint32_t i = 0; i < fd_count; i++)
    if (0 != fd_array[i]->dup_me ())
      {
        fprintf (stderr, "Internal error: failed to dup FDs!\n");
        exit (1);               // could not start!?
      }
  execvp (args[0], args);
  fprintf (stderr, "Failed to exec: %s\n", strerror (errno));
  exit (1);                     // exec failed
}
