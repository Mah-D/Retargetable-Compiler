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
 * @file filters/dup_filter_lib.h
 * @brief routines shared by many filters
 * @author Christian Grothoff
 * @author Matt Rutherford
 * @author Jasmine Garoot
 */

#ifndef DUP_FILTER_LIB
#define DUP_FILTER_LIB

#if LINUX
/**
 * From LKML (http://lkml.indiana.edu/hypermail/linux/kernel/0112.1/1401.html):
 * Cannot increase FD_SETSIZE on Linux, but we can increase __FD_SETSIZE
 * with glibc 2.2 (or later? remains to be seen). We do this by including
 * bits/types.h which defines __FD_SETSIZE first, then we redefine
 * __FD_SETSIZE. Of course a user program may NEVER include bits/whatever.h
 * directly, so this is a dirty hack!
 */
#include <features.h>
#if (__GLIBC__ > 2) || (__GLIBC__ == 2 && __GLIBC_MINOR__ >= 2)
# include <bits/types.h>
# undef __FD_SETSIZE
# define __FD_SETSIZE 8192
#endif
#else
#define FD_SETSIZE 65536
#endif

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <signal.h>
#include <sys/select.h>
#include <sys/types.h>
#include <errno.h>
#include <sys/resource.h>
#include <assert.h>
#include <string.h>


/**
 * Standard buffer size.
 */
#define DEFAULT_BUF_SIZE (32768)

/**
 * Check if the given file descriptor is valid.
 *
 * @param fd file descriptor to check
 * @return 0 if not, 1 if it is valid
 */
int DUP_get_fd (int fd);

/**
 * Write the specified number of bytes to the given
 * file descriptor (may block).
 *
 * @param fd descriptor to write to
 * @param buf data to write
 * @param size number of bytes to write
 * @return 1 on success,
 *         0 if fd was closed by other side;
 *        -1 on error writing (other than closed by other side)
 */
int DUP_write_all (int fd, const char *buf, size_t size);

/**
 * Install a signal handler to ignore SIGPIPE.
 */
void DUP_ignore_sigpipe (void);

/**
 * Parse the record size argument.
 *
 * @param argc number of arguments
 * @param argv command line arguments
 * @param buf_size set to desired buffer size
 * @return -1 on error, 0 if record-based, 1 if newline-based
 */
int
DUP_parse_record_size_arguments (int argc, char **argv, size_t * buf_size);

/**
 * Prototype of a function to process a line or block of input.  When
 * processing lines, the function may be called twice if the line is
 * not available as a contiguous block of memory.  In this case,
 * 'end_char' will not point to the '\n' for the first call.  If
 * the function returns anything but '1', the second call will not
 * happen in this case.
 *
 * @param cls user-defined argument
 * @param line the line of input to process (NOT 0-terminated!)
 * @param end_char last valid character in line or block
 * @return 1 to continue processing,
 *         0 to abort with success,
 *        -1 to abort with error
 */
typedef int (*DUP_LineProcessor) (void *cls, char *line, char *end_char);


/**
 * If the given buffer contains an entire line,
 * process it and update the buffer.  Only processes
 * a single line, even if the buffer contains
 * more than one.
 *
 * @param buffer the buffer to check for a line
 * @param sidx number of bytes from the beginning of the buffer that
 *             do not need to be searched anymore (by reference)
 * @param val_start offset in the buffer where valid data starts;
 *         note that valid data can wrap around (by reference)
 * @param val_count number of valid bytes in the buffer (by reference)
 * @param buffer_size total size of the buffer
 * @param proc function to call on each line
 * @param proc_cls extra argument to proc
 * @return -1 if proc returned -1
 *          0 if proc returned 0
 *          1 if proc returned 1
 *          2 if buffer contained no
 *            newline between index and position.
 */
int
DUP_try_process_line (char *buffer,
		      size_t *sidx,
		      size_t *val_start,
                      size_t *val_count,
                      size_t buffer_size,
                      DUP_LineProcessor proc, void *proc_cls);


/**
 * Read from fd using "*buffer" for buffer management.  When called,
 * "*buffer" already has "*position" valid bytes in it.  If a new line
 * ('\n') is found, call the proc function on it.  If the last
 * character read is not a new line, leave the remaining characters in
 * "*buffer" for future reference and update "*position" accordingly.
 * This function may grow "*buffer" if "*position" is already
 * "*buf_size".  This function will print an error message and
 * call exit(1) if read returns -1.
 *
 * @param fd descriptor to read from
 * @param buffer where to read to (by reference)
 * @param buf_size size of the buffer (by reference)
 * @param val_start offset in the buffer where valid data starts;
 *         note that valid data can wrap around (by reference)
 * @param val_count number of valid bytes already in buffer (by reference)
  * @param proc function to call on each line read
 * @param proc_cls cls argument to the proc function
 * @return 1 to continue processing (success)
 *         0 to abort processing with success
 *           (successful return code from proc)
 *        -1 abort with error returned by proc
 *        -2 got EOF reading
 */
int
DUP_try_read_line (int fd,
                   char **buffer,
                   size_t *buf_size,
		   size_t *val_start,
                   size_t *val_count, DUP_LineProcessor proc, void *proc_cls);

/**
 * Read from fd using "buffer" for buffer management.  When called,
 * "buffer" already has "*position" valid bytes in it.  If a block
 * of the given block size is complete, call the proc function on it.
 * If the block is incomplete, leave the remaining characters in
 * "buffer" for future reference and update "*position" accordingly.
 * This function will print an error message and call exit(1) if
 * read returns -1.
 *
 * @param fd descriptor to read from
 * @param buffer where to read to
 * @param buf_size size of each block
 * @param position bytes already in buffer (by reference)
 * @param proc function to call on each block read
 * @param proc_cls cls argument to the proc function
 * @return 1 to continue processing (success)
 *         0 to abort processing with success
 *           (successful return code from proc)
 *        -1 abort with error returned by proc
 *        -2 got EOF reading
 */
int
DUP_try_read_block (int fd,
                    char *buffer,
                    size_t buf_size,
                    size_t * position,
                    DUP_LineProcessor proc, void *proc_cls);


/**
 * Do a read call and check for errors.
 * If read returns -1, print an error
 * message and abort. Otherwise
 * behave just like read.
 *
 * @param fd file descriptor to read from
 * @param buf buffer to read to
 * @param size number of bytes to read at most
 * @return number of bytes read (0 or more)
 */
ssize_t DUP_read (int fd, char *buf, size_t size);


/**
 * Do a write call and check for errors.
 * If write returns -1 (and it is not
 * SIGPIPE), print an error
 * message and abort. Otherwise
 * behave just like write.
 *
 * @param fd file descriptor to write to
 * @param buf buffer to write from
 * @param size number of bytes to write at most
 * @return number of bytes written (0 or more)
 */
ssize_t DUP_write (int fd, const char *buf, size_t size);

/**
 * Do a select call and check for errors.
 * If select returns -1 or 0, print an error
 * message and abort. Otherwise
 * behave just like select (with no timeout).
 *
 * @param maxfd max fd
 * @param rs read set
 * @param ws write set
 * @param es error set
 * @return number of fds ready (will be positive)
 */
int DUP_select (int maxfd, fd_set * rs, fd_set * ws, fd_set * es);

#endif
