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
 * @file dupd/file_descriptor.h
 * @brief wrapper around file descriptor or socket
 * @author Christian Grothoff
 * @author Krista Grothoff
 */

#ifndef DUPD_FILE_DESCRIPTOR_H
#define DUPD_FILE_DESCRIPTOR_H

#include "globals.h"

/**
 * Set this to 1 to perform some extra sanity checks on file-descriptors
 * before they are given to select (can cost performance!).
 */
#define EXTRA_CHECKS 0

class DUPDFileDescriptor
{
public:
  /**
   * Create a wrapper around a file descriptor.
   */
  DUPDFileDescriptor (int fd_num);

  /**
   * Destroy the wrapper (closes the descriptor!).
   */
   ~DUPDFileDescriptor ();

  /**
   * Update maxfd for select to include this FD.
   */
  void update_max (int &maxfd)
  {
    if (my_num > maxfd)
      maxfd = my_num;
  }

  /**
   * Shutdown for reading or writing.
   */
  int shut (int how)
  {
    if ((how != SHUT_RD) && (how != SHUT_WR))
      THROW_FATAL ("illegal call to shut");
    if (0 != shutdown (my_num, how))
      {
        fprintf (stderr,
                 "Failed to shutdown socket for %s: %s\n",
                 how == SHUT_RD ? "reading" : "writing", strerror (errno));
        return -1;
      }
    return 0;
  }

  /**
   * Test if this file descriptor is in the set.
   */
  int test (fd_set * s)
  {
    return FD_ISSET (my_num, s);
  }

  /**
   * Increase the size of our read buffer.
   */
  void grow_read_buffer (size_t nsize)
  {
    char *tmp;
    
    if (nsize < read_valid)
      abort ();
    tmp = (char*) malloc (nsize);
    memcpy (tmp, read_buffer, read_valid);
    free (read_buffer);
    read_buffer = tmp;
    read_buffer_size = nsize;
  }

  /**
   * Add this file descriptor to the set.
   */
  void set (fd_set * s)
  {
#if EXTRA_CHECKS
    if ((-1 == fcntl (my_num, F_GETFD)) && (errno == EBADF))
      THROW_FATAL ("refusing to set invalid FD!");
#endif
    FD_SET (my_num, s);
  }

  /**
   * Accept on the socket (only works if this
   * is a listen socket...).
   */
  DUPDFileDescriptor *do_accept ();

  /**
   * Change this file descriptor to have the desired value.
   * @return 0 on success, -1 on error
   */
  int dup_to (int fd);

  /**
   * Receive bytes from our read buffer.
   * @return number of bytes copied to the 
   *         buffer, 0 if we need to do more selecting, 
   *         -1 on fatal errors
   */
  ssize_t receive (char *dst, size_t want);

  /**
   * Copy "want" bytes from our buffer to the write buffer.
   *
   * @return number of bytes copied from the 
   *         buffer, 0 if we need to do more selecting first,
   *         -1 on fatal errors
   */
  ssize_t transmit (const char *src, size_t want);

  /**
   * Select notified us that we were ready, perform the
   * respective operations on the buffers.
   *
   * @return 0 if our write buffer is empty, 1 if not
   */
  int run (fd_set * rs, fd_set * ws);


  /**
   * Update the arguments to select for this FD based on
   * the state of our read and write buffers.
   *
   * @param want_read set to 1 if the goal is to fill our
   *        read buffer with at least some data
   * @return 1 if we added an FD for reading of writing
   *         to the sets, 0 if not
   */
  int get_select_set (fd_set * rs, fd_set * ws, int &maxfd, int want_read);


private:

  /**
   * The current number of our descriptor.
   */
  int my_num;

  /**
   * This FD has a number that is desired by some other entity;
   * dup it to something else.
   * @return 0 on success, -1 on error
   */
  int dup_away ();

  /**
   * Buffer for reading.
   */
  char *read_buffer;

  /**
   * Number of bytes in read_buffer.
   */
  size_t read_buffer_size;

  /**
   * Number of bytes in the read_buffer.
   */
  size_t read_valid;

  /**
   * Number of bytes from the current buffer that were already
   * handed out to clients.
   */
  size_t read_pos;

  /**
   * Buffer for writing.  Should be a bit larger than the biggest
   * structs that we typically transmit (not the error messages).  Note that we often have lots of file descriptor
   * objects active, so keeping each of these objects small
   * matters for memory usage by dupd.
   */
  char write_buffer[32];

  /**
   * Number of bytes in the write_buffer.
   */
  size_t write_valid;

  /**
   * Number of bytes from the current write buffer that were already
   * transmitted.
   */
  size_t write_pos;

};

#endif
