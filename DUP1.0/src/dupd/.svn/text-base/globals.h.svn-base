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
 * @file dupd/globals.h
 * @brief global state for dupd
 * @author Christian Grothoff
 * @author Krista Grothoff
 */
#ifndef DUPD_GLOBALS_H
#define DUPD_GLOBALS_H

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

#include <errno.h>
#include <stdint.h>
#include <sys/select.h>
#include <sys/time.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <unistd.h>
#include <stdio.h>
#include <stdarg.h>
#include <string.h>
#include <stdlib.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/stat.h>
#include <netdb.h>
#include <fcntl.h>
#include <time.h>
#include <map>
#include <list>
#include <string>
#include "DUP_config.h"

/**
 * Our own throw macro.  For debugging, exceptions
 * should use abort instead of throw.
 */
#define THROW_FATAL(msg) throw msg

#define PRINT_INFO 0

#if PRINT_INFO
#define DEBUG(msg) fprintf(stderr, "%12u %s:%u: %s\n", (unsigned int) time(NULL), __FILE__, __LINE__, msg);
#else
#define DEBUG(m) do {} while (0)
#endif

class DUPDStream;

class DUPDSession;

class DUPDFileDescriptor;

class DUPDListenStream;

using namespace std;

/**
 * List of connections awaiting session info 
 */
extern list < DUPDStream * >dupd_connection_wait_list;

/**
 * Map of session numbers to session objects
 */
extern map < uint64_t, DUPDSession * >dupd_session_map;

/**
 * Map of hostnames to DNS lookup results.
 */
extern map < const string, struct addrinfo *> dnscache;

/**
 * List of actors for select loop
 */
extern list < DUPDStream * >stream_list;

/**
 * flag set to 1 if the next select should run without timeout
 */
extern int instant_retry;

/**
 * The listen socket / stream object for IPv4.
 */
extern DUPDListenStream *listen_stream4;

/**
 * The listen socket / stream object for IPv6.
 */
extern DUPDListenStream *listen_stream6;

/**
 * Session handle.
 */
extern DUPDSession *dupd_session;

#endif
