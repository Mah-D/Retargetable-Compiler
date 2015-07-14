SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include

if USE_COVERAGE
  AM_CFLAGS = --coverage
  AM_CXXFLAGS = --coverage
endif

BUILT_SOURCES = dupparse.h
AM_YFLAGS = -d
AM_LFLAGS = 

noinst_PROGRAMS = \
 parser

bin_PROGRAMS = \
 dup

dup_SOURCES = \
 dup_string.cc dup_string.h \
 strnfuncs.c strnfuncs.h \
 edge.cc edge.h \
 process.cc process.h \
 connection.h \
 data_connection.cc data_connection.h \
 control_connection.cc control_connection.h \
 dup.cc globals.h \
 dupparse.yy \
 duplex.l

parser_SOURCES = \
 dup_string.cc dup_string.h \
 strnfuncs.c strnfuncs.h \
 edge.cc edge.h \
 process.cc process.h \
 parser.cc globals.h \
 dupparse.yy \
 duplex.l

check_PROGRAMS = 

#testex_SOURCES = \
# testex.c 

check_SCRIPTS = \
 test_openfd.sh \
 test_parser.sh  \
 test_simple_dup.sh \
 test_nested_dup.sh \
 test_multisystem_dup.sh \
 test_duplicate_fd.sh \
 test_option_c.sh

EXTRA_DIST = $(check_SCRIPTS) cycle_filter.sh

TESTS = $(check_PROGRAMS) $(check_SCRIPTS)
