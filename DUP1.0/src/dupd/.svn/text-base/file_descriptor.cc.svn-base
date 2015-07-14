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
 * @file dupd/file_descriptor.c
 * @brief wrapper around file descriptor or socket
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#include "file_descriptor.h"
#include <unistd.h>
#include <fcntl.h>


/**
 * File descriptor map (int->fd)
 */
static map < int, DUPDFileDescriptor * >dupd_fd_map;


DUPDFileDescriptor::DUPDFileDescriptor (int fd_num)
{
  my_num = fd_num;
  dupd_fd_map[my_num] = this;
  // initially, set close on exec for ALL file descriptors!
  fcntl (my_num, F_SETFD, fcntl (my_num, F_GETFD) | FD_CLOEXEC);
  read_pos = 0;
  read_valid = 0;
  write_pos = 0;
  write_valid = 0;
  read_buffer_size = 32; 
  /* keep this small by default since we'll have tons of these
     objects; for control connections where we read a lot of data, the
     size will be increased. */
  read_buffer = (char*) malloc (read_buffer_size);
}

DUPDFileDescriptor::~DUPDFileDescriptor ()
{
  dupd_fd_map.erase (dupd_fd_map.find (my_num));
  if (0 != close (my_num))
    fprintf (stderr, "Error closing file descriptor: %s\n", strerror (errno));
  my_num = -1;
  free (read_buffer);
  read_buffer = NULL;
  read_buffer_size = 0;
  read_pos = 0;
  read_valid = 0;
  write_pos = 0;
  write_valid = 0;
}

DUPDFileDescriptor *
DUPDFileDescriptor::do_accept ()
{
  struct sockaddr so;
  socklen_t sl;

  sl = sizeof (struct sockaddr);
  int s = accept (my_num, &so, &sl);
  if (s == -1)
    {
      fprintf (stderr, "Failure in accept: %s\n", strerror (errno));
      return NULL;
    }
  if (s >= FD_SETSIZE)
    {
      fprintf (stderr, 
	       "File descriptor or equal to `%s' (%u), can not use it!\n",
	       "FD_SETSIZE",
	       s);
      close (s);
      return NULL;
    }
  return new DUPDFileDescriptor (s);
}

int
DUPDFileDescriptor::dup_away ()
{
  int d = dup (my_num);
  // restore close on exec!
  fcntl (d, F_SETFD, fcntl (d, F_GETFD) | FD_CLOEXEC);
#if PRINT_INFO
  fprintf (stderr, "PID %u duped away %d to %d\n", getpid (), my_num, d);
#endif
  if (d == -1)
    {
      fprintf (stderr, "dup failed: %s\n", strerror (errno));
      return -1;
    }
  close (my_num);
  dupd_fd_map.erase (dupd_fd_map.find (my_num));
  my_num = d;
  dupd_fd_map[my_num] = this;
  return 0;
}

int
DUPDFileDescriptor::dup_to (int fd)
{
  DUPDFileDescriptor *old;

#if PRINT_INFO
  fprintf (stderr, "PID %u Duping %d to %d\n", getpid (), my_num, fd);
#endif
  old = dupd_fd_map.find (fd)->second;
  if ((old != NULL) && (0 != old->dup_away ()))
    {
      fprintf (stderr, "Failed to dup away old FD!\n");
      return -1;
    }
  /* in case FD was open when dupd started... */
  if (-1 != fcntl (fd, F_GETFD))
    close (fd);
  if (-1 == dup2 (my_num, fd))
    {
      fprintf (stderr, "dup2 failed: %s\n", strerror (errno));
      return -1;
    }
  close (my_num);
  dupd_fd_map.erase (dupd_fd_map.find (my_num));
  my_num = fd;
  dupd_fd_map[my_num] = this;
  return 0;
}

ssize_t
DUPDFileDescriptor::receive (char *dst, size_t want)
{
  if (read_pos < read_valid)
    {
      size_t max = read_valid - read_pos;
      if (want < max)
        max = want;
      memcpy (dst, &read_buffer[read_pos], max);
      read_pos += max;
      return max;
    }
  if (-1 == my_num)
    return -1;
  read_pos = 0;
  read_valid = 0;
  return 0;
}

/**
 * Copy "want" bytes from our buffer to the write buffer.
 *
 * @return number of bytes copied from the 
 *         buffer, 0 if we need to do more selecting first,
 *         -1 on fatal errors
 */
ssize_t
DUPDFileDescriptor::transmit (const char *src, size_t want)
{
  size_t have;

  if (-1 == my_num)
    return -1;
  if (want > sizeof (write_buffer))
    want = sizeof (write_buffer);
  have = write_valid - write_pos;
  if ((sizeof (write_buffer) - have < want) &&
      (want <= sizeof (write_buffer)))
    return 0;
  if (sizeof (write_buffer) - write_valid < want)
    {
      memmove (write_buffer, &write_buffer[write_pos], have);
      write_valid -= write_pos;
      write_pos = 0;
    }
  memcpy (&write_buffer[write_valid], src, want);
  write_valid += want;
  return want;
}

/**
 * Select notified us that we were ready, perform the
 * respective operations on the buffers.
 *
 * @return 0 if our write buffer is empty, 1 if not, -1 on fatal error
 */
int
DUPDFileDescriptor::run (fd_set * rs, fd_set * ws)
{
  ssize_t ret;

  if (my_num == -1)
    return -1;                  // error
  if ( (FD_ISSET (my_num, rs)) && 
       (read_valid < read_buffer_size))
    {
      ret = read (my_num,
                  &read_buffer[read_valid],
                  read_buffer_size - read_valid);
      FD_CLR (my_num, rs);
      if (ret == -1)
        {
          if (errno == EINTR)
            return 1;
          return -1;
        }
      if (ret == 0)
        return -1;              // other end closed connection prematurely
      read_valid += ret;
    }
  if ((FD_ISSET (my_num, ws)) && (write_pos < write_valid))
    {
      ret = write (my_num, &write_buffer[write_pos], write_valid - write_pos);
      FD_CLR (my_num, ws);
      if (ret == -1)
        {
          if (errno == EINTR)
            return 1;
          return -1;
        }
      write_pos += ret;
      if (write_pos == write_valid)
        {
          write_pos = 0;
          write_valid = 0;
        }
    }
  if (write_pos == write_valid)
    return 0;
  return 1;
}


/**
 * Update the arguments to select for this FD based on
 * the state of our read and write buffers.
 *
 * @param want_read set to 1 if the goal is to fill our
 *        read buffer with at least some data
 * @return 1 if we added an FD for reading of writing
 *         to the sets, 0 if not
 */
int
DUPDFileDescriptor::get_select_set (fd_set * rs,
                                    fd_set * ws, int &maxfd, int want_read)
{
  int ret;

  ret = 0;
  if ((want_read) && (read_valid == read_pos))
    {
      set (rs);
      update_max (maxfd);
      ret = 1;
    }
  if (write_pos < write_valid)
    {
      set (ws);
      update_max (maxfd);
      ret = 1;
    }
  return ret;
}
