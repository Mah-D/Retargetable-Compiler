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
 * @file dupd/io_descriptor.h
 * @brief representation of a io_descriptor
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_IO_DESCRIPTOR_H
#define DUPD_IO_DESCRIPTOR_H

#include "file_descriptor.h"
#include "dup_network.h"

class DUPDIODescriptor
{
public:
  DUPDIODescriptor (uint64_t stream_id,
                    uint32_t local_proc_num,
                    uint16_t flag,
                    uint16_t port,
                    uint32_t locald, uint32_t remoted, uint32_t remote_pidx);

  virtual ~ DUPDIODescriptor ();

  /**
   * Add the string argument for this IOD.
   */
  void add_argument (const char *s);

  /**
   * Are we ready to run?
   * @return -1 for not yet, 0 for ready, positive error code otherwise
   */
  enum DUPD_ErrorCode is_ready (char **emsg)
  {
    if (my_emsg != NULL)
      *emsg = strdup (my_emsg);
    return am_ready;
  }

  /**
   * We have a file descriptor ready for this IOD.
   * Note that this function must only be called if
   * this IOD actually expects to receive a network
   * connection (should never be called for files!).
   *
   * The file descriptor will be either deleted or
   * taken over by the IO descriptor by this method.
   *
   * @return 0 on success
   */
  int notify_ready (uint64_t sid,
		    DUPDFileDescriptor * f);

  /**
   * DUP our FileDescriptor to the correct value.
   */
  int dup_me ()
  {
    return fd->dup_to (iod_local_desc);
  }

  /**
   * Perform any action we might want to do
   * after being fully initialized (such as
   * connecting to another dupd or opening a file).
   *
   * @return non-zero error code if the action failed
   *         fatally, 0 on success
   */
  enum DUPD_ErrorCode action (char **emsg);

  /**
   * What is the file descriptor that this IOD will
   * eventually become?
   */
  uint32_t get_target_fd ()
  {
    return iod_local_desc;
  }

  uint64_t iod_stream_id;


private:
  uint16_t iod_flag;
  uint16_t iod_port;
  uint32_t iod_local_desc;
  uint32_t iod_remote_desc;
  uint32_t iod_remote_proc_num;
  uint32_t iod_local_proc_num;
  char *iod_string;

  DUPDFileDescriptor *fd;

  enum DUPD_ErrorCode am_ready;

  char *my_emsg;

};

#endif
