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
 * @file dup/dup_defines.h
 * @brief macros and other stuff needed for DUP
 * @author Krista Grothoff
 */
#ifndef DUP_DEFINES_H
#define DUP_DEFINES_H

#include "DUP_config.h"
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

#define DUP_PARSER_ERROR 1
#include <string.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <fcntl.h>
#include "dup_network.h"

#define PRINT_INFO 0

/**
 * Size of max length of flex token buffer.
 * FIXME: get from flex!
 */
#define MAX_COMMAND_BUFFER_LENGTH 8192

/* enum AddrType {IPV6, DOT}; */

#define PRINT_INFO 0

#if PRINT_INFO
#define DEBUG(msg) fprintf(stderr, "%s:%u: %s\n", __FILE__, __LINE__, msg);
#else
#define DEBUG(msg)
#endif

#define THROW_FATAL(msg) abort()

/**
 * Are we ready for data connections? (0 if yes).
 */
extern int data_ready;

/**
 * What operator is used for this edge?
 * FIXME: the various enum values do not
 * have good names...
 */
enum OperatorType
{
  /**
   * Illegal.
   */
  DUP_INVALID,

  /**
   * We have a simple pipe (|).
   */
  DUP_PIPE,

  /**
   * We are reading from a file ("<").
   */
  DUP_READ,

  /**
   * We are writing to a file (">").
   */
  DUP_WRITE,

  /**
   * We are appending to a file (">>").
   */
  DUP_APPEND
};



#endif
