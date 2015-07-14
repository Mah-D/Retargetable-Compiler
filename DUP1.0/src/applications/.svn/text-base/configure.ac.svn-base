# This file is part of DUP
# (C) 2008, 2009, 2010 The DUP team
#
# DUP is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published
# by the Free Software Foundation; either version 2, or (at your
# option) any later version.
#
# DUP is distributed in the hope that it will be useful, but
# WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with DUP; see the file COPYING.  If not, write to the
# Free Software Foundation, Inc., 59 Temple Place - Suite 330,
# Boston, MA 02111-1307, USA.
#
#
# Process this file with autoconf to produce a configure script.
#
#
AC_PREREQ(2.57)
AC_INIT([dup-applications], [0.1.0],[dup@lists.cs.du.edu])
AM_INIT_AUTOMAKE([dup-applications], [0.1.0])
AM_CONFIG_HEADER([DUP_config.h])
AH_TOP([#define _GNU_SOURCE  1])
# Checks for programs.
AC_PROG_AWK
AC_PROG_CC
AM_PROG_CC_C_O
AC_PROG_CPP
AC_PROG_INSTALL
AC_PROG_LN_S
AC_PROG_MAKE_SET
AC_CANONICAL_HOST
AC_PROG_CXX
AM_PROG_LEX
AC_PROG_YACC
AC_PROG_LIBTOOL
AC_PROG_MKDIR_P
AC_CONFIG_MACRO_DIR([m4])
AC_CHECK_FUNCS([strnlen strndup])

CFLAGS="-Wall -Werror $CFLAGS"
# use '-fno-strict-aliasing', but only if the compiler can take it
if gcc -fno-strict-aliasing -S -o /dev/null -xc /dev/null >/dev/null 2>&1; 
then
 CFLAGS="-fno-strict-aliasing $CFLAGS"
fi

# Check system type
case "$host_os" in
*darwin* | *rhapsody* | *macosx*)
     AC_DEFINE_UNQUOTED(OSX,1,[This is an OS X system])
     CFLAGS="-no-cpp-precomp $CFLAGS"
     LDFLAGS="-flat_namespace -undefined suppress $LDFLAGS"
     ;;
linux*)
     AC_DEFINE_UNQUOTED(LINUX,1,[This is a Linux system])
     ;;
freebsd*)
     AC_DEFINE_UNQUOTED(SOMEBSD,1,[This is a BSD system])
     AC_DEFINE_UNQUOTED(FREEBSD,1,[This is a FreeBSD system])
     ;;
openbsd*)
     AC_DEFINE_UNQUOTED(SOMEBSD,1,[This is a BSD system])
     AC_DEFINE_UNQUOTED(OPENBSD,1,[This is an OpenBSD system])
     ;;
netbsd*)
     AC_DEFINE_UNQUOTED(SOMEBSD,1,[This is a BSD system])
     AC_DEFINE_UNQUOTED(NETBSD,1,[This is a NetBSD system])
     ;;
*solaris*)
     AC_DEFINE_UNQUOTED(SOLARIS,1,[This is a Solaris system])
     ;;
*arm-linux*)
     AC_DEFINE_UNQUOTED(LINUX,1,[This is a Linux system])
     CFLAGS="-D_REENTRANT -fPIC -pipe $CFLAGS"
     ;;
*)
     AC_MSG_RESULT(Unrecognised OS $host_os)
     AC_DEFINE_UNQUOTED(OTHEROS,1,[Some strange OS])
;;
esac

# Checks that are for things we need but that we don't act on
# are commented out...
# Checks for standard header files.
AC_HEADER_STDC
AC_HEADER_STAT
AC_CHECK_HEADERS([fcntl.h netinet/in.h limits.h])

# Checks for standard typedefs, structures, and compiler characteristics.
AC_TYPE_SIZE_T
AC_TYPE_PID_T

AC_SUBST(CPPFLAGS)
AC_SUBST(LIBS)
AC_SUBST(LDFLAGS)
AC_SUBST(EXT_LIB_PATH)
AC_SUBST(EXT_LIBS)

# gcov compilation
use_gcov=no
AC_ARG_ENABLE([coverage], AS_HELP_STRING([--enable-coverage],
                                        [Compile the library with code coverage support (default is NO)]),
                                        [use_gcov=yes], [use_gcov=no])
AM_CONDITIONAL([USE_COVERAGE], [test "x$use_gcov" = "xyes"])

# test for libgmp
gmp=0
AC_MSG_CHECKING(for libgmp)
AC_ARG_WITH(gmp,
   [  --with-gmp=PFX          base of libgmp installation],
   [AC_MSG_RESULT([$with_gmp])
    case $with_gmp in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(gmp.h,
          AC_CHECK_LIB([gmp], [__gmpz_add],
            gmp=1))
        ;;
      *)
        LDFLAGS="-L$with_gmp/lib $LDFLAGS"
        CPPFLAGS="-I$with_gmp/include $CPPFLAGS"
        AC_CHECK_HEADERS(gmp.h,
          AC_CHECK_LIB([gmp], [__gmpz_add],
            EXT_LIB_PATH="-L$with_gmp/lib $EXT_LIB_PATH"
            gmp=1))
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-gmp not specified])
    AC_CHECK_HEADERS(gmp.h,
     AC_CHECK_LIB([gmp], [__gmpz_add],
      gmp=1))])
AM_CONDITIONAL([WITH_GMP], [test "$gmp" == 1])
if test "$gmp" != 1
then
 AC_MSG_RESULT([libgmp not found])
fi


# test for libpcap
pcap=0
AC_MSG_CHECKING(for pcap lib)
AC_ARG_WITH(pcap,
   [  --with-pcap=PFX          base of libpcap installation],
   [AC_MSG_RESULT([$with_pcap])
    case $with_pcap in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(pcap.h, pcap=true)
        ;;
      *)
        LDFLAGS="-L$with_pcap/lib $LDFLAGS"
        CPPFLAGS="-I$with_pcap/include $CPPFLAGS"
        AC_CHECK_HEADERS(pcap.h, pcap=1)
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-pcap not specified])
    AC_CHECK_HEADERS(pcap.h, pcap=1)])
AM_CONDITIONAL([WITH_PCAP], [test "$pcap" == 1])
if test "$pcap" != 1
then
 AC_MSG_RESULT([pcap libraries not found])
fi


# test for dupfilterlib
duplib=0
AC_MSG_CHECKING(for dup filter lib)
AC_ARG_WITH(dup,
   [  --with-dup=PFX          base of DUP installation],
   [AC_MSG_RESULT([$with_dup])
    case $with_dup in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(dup/dup_filter_lib.h, duplib=1)
        ;;
      *)
        LDFLAGS="-L$with_dup/lib $LDFLAGS"
        CPPFLAGS="-I$with_dup/include $CPPFLAGS"
        AC_CHECK_HEADERS(dup/dup_filter_lib.h, duplib=1)
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-dup not specified])
    AC_CHECK_HEADERS(dup/dup_filter_lib.h, duplib=1)])
AM_CONDITIONAL([WITH_DUPLIB], [test "$duplib" == 1])
if test "$duplib" != 1
then
 AC_MSG_ERROR([DUP libraries not found])
fi


# test for SDL
sdl=0
AC_MSG_CHECKING(for SDL)
AC_ARG_WITH(sdl,
   [  --with-sdl=PFX          base of sdl installation],
   [AC_MSG_RESULT([$with_sdl])
    case $with_sdl in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(SDL.h, sdl=true)
        ;;
      *)
        LDFLAGS="-L$with_sdl/lib $LDFLAGS"
        CPPFLAGS="-I$with_sdl/include $CPPFLAGS"
        AC_CHECK_HEADERS(SDL/SDL.h, sdl=1)
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-sdl not specified])
    AC_CHECK_HEADERS(SDL/SDL.h, sdl=1)])
AM_CONDITIONAL([WITH_SDL], [test "$sdl" == 1])
if test "$sdl" != 1
then
 AC_MSG_RESULT([SDL libraries not found])
fi

# test for jpeg
jpeg=0
AC_MSG_CHECKING(for jpeg libs)
AC_ARG_WITH(jpeg,
   [  --with-jpeg=PFX          base of jpeg installation],
   [AC_MSG_RESULT([$with_jpeg])
    case $with_jpeg in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(jpeg.h, jpeg=true)
        ;;
      *)
        LDFLAGS="-L$with_jpeg/lib $LDFLAGS"
        CPPFLAGS="-I$with_jpeg/include $CPPFLAGS"
        AC_CHECK_HEADERS(jpeglib.h, jpeg=1)
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-jpeg not specified])
    AC_CHECK_HEADERS(jpeglib.h, jpeg=1)])
AM_CONDITIONAL([WITH_JPEG], [test "$jpeg" == 1])
if test "$jpeg" != 1
then
 AC_MSG_RESULT([jpeg libraries not found])
fi

# test for ssl
ssl=0
AC_MSG_CHECKING(for openssl lib)
AC_ARG_WITH(ssl,
   [  --with-ssl=PFX          base of openssl installation],
   [AC_MSG_RESULT([$with_ssl])
    case $with_ssl in
      no)
        ;;
      yes)
        AC_CHECK_HEADERS(openssl/rand.h, ssl=true)
        ;;
      *)
        LDFLAGS="-L$with_ssl/lib $LDFLAGS"
        CPPFLAGS="-I$with_ssl/include $CPPFLAGS"
        AC_CHECK_HEADERS(openssl/rand.h, ssl=1)
        ;;
    esac
   ],
   [AC_MSG_RESULT([--with-ssl not specified])
    AC_CHECK_HEADERS(openssl/rand.h, ssl=1)])
AM_CONDITIONAL([WITH_SSL], [test "$ssl" == 1])
if test "$ssl" != 1
then
 AC_MSG_RESULT([openssl libraries not found])
fi

AC_CONFIG_FILES([ 
Makefile
primeGen/Makefile
tcpsplit/Makefile
fides/Makefile
microbenchmarks/Makefile
video/Makefile])
AC_OUTPUT
