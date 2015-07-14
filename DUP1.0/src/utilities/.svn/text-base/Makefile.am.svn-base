SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include -I$(top_srcdir)/src/dup

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_SCRIPTS = \
  poll.sh \
  dup_analysis_grapher.py \
  dprof_wrapper.sh \
  fix_psdata_files.pl

EXTRA_DIST = $(bin_SCRIPTS) dup_analysis_grapher.py

bin_PROGRAMS = \
  dprof \
  dupap \
  dup_dot_printer \
  execvother

lib_LTLIBRARIES = \
  libdupfilters.la
libdupfilters_la_SOURCES = \
  ../filters/common.c

dupincludedir = \
 $(includedir)/dup
dupinclude_HEADERS = \
 ../filters/dup_filter_lib.h 

execvother_SOURCES = execvother.cc

dprof_SOURCES = \
 ../dup/dup_string.cc ../dup/dup_string.h \
 ../dup/edge.cc ../dup/edge.h \
 ../dup/process.cc ../dup/process.h \
 dprof.cc ../dup/globals.h \
 ../dup/dupparse.yy \
 ../dup/duplex.l

dup_dot_printer_SOURCES = \
 ../dup/dup_string.cc ../dup/dup_string.h \
 ../dup/strnfuncs.c ../dup/strnfuncs.h \
 ../dup/edge.cc ../dup/edge.h \
 ../dup/process.cc ../dup/process.h \
 dup_dot_printer.cc ../dup/globals.h \
 ../dup/dupparse.yy \
 ../dup/duplex.l

dupap_SOURCES = \
 ../dup/dup_string.cc ../dup/dup_string.h \
 ../dup/edge.cc ../dup/edge.h \
 ../dup/process.cc ../dup/process.h \
 dupap.cc ../dup/globals.h \
 ../dup/dupparse.yy \
 ../dup/duplex.l

# test_faninany_eof_SOURCES = \
#  test_faninany_eof.c 
