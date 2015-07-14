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
 * @file filters/cbuffer.h
 * @brief typical circular buffer implementation
 * @author Chris GauthierDickey
 */

#include "dup_filter_lib.h"


#define _DEBUG

/**
 * One of many possible circular buffer implementations. Usage involves
 * creating a buffer using make_cbuffer, getting a buffer for writing by
 * calling reserve_write, commit the amount actually written with reserve,
 * getting a read buffer using reserve_read, and consuming the actual amount
 * read with consume. hasFree will check to see how much you can allocate in
 * a single pass, length will tell you how much data has been committed, and
 * resize will resize the cbuf to a new size (which must be greater than the
 * length.
 *
 * Note that reserves and commits are required because we want to be able
 * to pass buffers generically to any C call that takes a char * as a buffer
 * while preventing unnecessary copying.
 *
 * In this implementation, we read from the tail and write to the head, with
 * the minor alteration from a typical circular buffer being that we only
 * continue writing to the head (ie, with a call to getWriteBuf) if the
 * space after the head is larger than the space in front of the tail.
 *
 * If you're reading and writing records, obviously you want your cbuffer
 * to be some multiple the record size so you can fully use it.
 */
struct cbuffer;

/**
 * Create a cbuffer for reading and writing to. Size should be some
 * multiple of record sizes or cache line sizes.
 *
 * @param init_size The initial size of the buffer to create.
 * @return pointer to a cbuffer struct that's been malloc'd and init'd
 */
struct cbuffer *cbuf_make (size_t init_size);



/**
 * Get a pointer to a buffer inside our cbuffer that you can write to.
 *
 * @param buf cbuffer that we're grabbing a write buffer from
 * @param size Returns the size of the write buffer taken from the cbuffer (by reference). Possibly 0.
 * @return a pointer to a write buffer with the given size, or NULL if the cbuffer is full.
 */
char *cbuf_reserve_write (struct cbuffer *buf, size_t * size);



/**
 * Commits data used by the buffer returned from reserve_write.
 *
 * @param buf cbuffer that's being used
 * @param bytes the number of bytes to commit
 */
void cbuf_commit (struct cbuffer *buf, size_t bytes);


/**
 * Gets a pointer to a buffer inside the cbuffer that you can read from.
 *
 * @param buf cbuffer that's being used
 * @param size returns the size of the read buffer being returned (possibly 0)
 * @return a pointer to a read buffer with the given size
 */
char *cbuf_reserve_read (struct cbuffer *buf, size_t * size);


/**
 * Consumes data read by the buffer from reserve_read. This in essence
 * moves the tail of the buffer forward.
 *
 * @param buf cbuffer that's being used
 * @param bytes the number of bytes to consume
 */
void cbuf_consume (struct cbuffer *buf, size_t bytes);


/**
 * Returns the number of free bytes in the largest writeable space in
 * the cbuffer.
 *
 * @param buf cbuffer that's being used
 * @return the number of free bytes in the biggest writeable space
 */
size_t cbuf_has_free (struct cbuffer *buf);


/**
 * Returns the length of the cbuffer
 *
 * @param buf cbuffer that's being used
 * @return the number of bytes being used by the cbuffer
 */
size_t cbuf_length (struct cbuffer *buf);


/**
 * Resizes the cbuffer to a new size. The new size must be >= length
 * of the cbuffer (ie, all bytes actually used by the cbuffer)
 *
 * @param buf cbuffer that's being used
 * @param newsize the new size to make this cbuffer
 */
void cbuf_resize (struct cbuffer *buf, size_t newsize);


/**
 * Returns the maximum size of the buffer
 *
 * @param buf cbuffer that's being used
 */
size_t cbuf_size (struct cbuffer *buf);


/**
 * Frees all memory used by the cbuffer.
 *
 * @param buf cbuffer that's being used
 */
void cbuf_free (struct cbuffer *buf);


/**
 * Finds a line (which is terminated by a newline) at the start of the buffer. Values are
 * set to NULL or 0 as appropriate if they don't exist.
 *
 * @param buf cbuffer that's being used
 * @param str2 a by-ref char * to the second part of a line, if it exists (NULL otherwise)
 * @param len1 a by-ref value indicating the length of the first part of the line
 * @param len2 a by-ref value indicating the length of the second part of the line
 * @return a pointer to the start of the first part of the line
 */
char *cbuf_find_line (struct cbuffer *buf, char **str2, size_t * len1,
                      size_t * len2);

/**
 * Finds a line (which is terminated by a newline) at the start of the buffer. Values are
 * set to NULL or 0 as appropriate if they don't exist.
 *
 * @param buf cbuffer that's being used
 * @param str2 a by-ref char * to the second part of a line, if it exists (NULL otherwise)
 * @param len1 a by-ref value indicating the length of the first part of the line
 * @param len2 a by-ref value indicating the length of the second part of the line
 * @return a pointer to the start of the first part of the line
 */
char *cbuf_find_record (struct cbuffer *buf, size_t len, char **rec2,
                        size_t * len1, size_t * len2);


/**
 * Copies a char * buffer into this cbuffer, resizing if necessary.
 *
 * @param cbuf the cbuffer that's being used
 * @param buf a char * buffer that we're copying from
 * @param len length of the char * buffer
 */
void cbuf_bufcpy (struct cbuffer *cbuf, const char *buf, size_t len);
