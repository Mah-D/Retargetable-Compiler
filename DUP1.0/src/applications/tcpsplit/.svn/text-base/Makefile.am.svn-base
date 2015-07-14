SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include -I$(top_srcdir)/src/dup

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_PROGRAMS = \
  tcpsplit

lib_LTLIBRARIES = \
  libdupfilters.la
libdupfilters_la_SOURCES = \
  ../../filters/common.c

dupincludedir = \
 $(includedir)/dup/filters
dupinclude_HEADERS = \
 $(includedir)/dup/dup_filter_lib.h 

tcpsplit_SOURCES = \
 tcpsplit_fds.c \
 balancer.c \
 ipa_db.c
tcpsplit_LDADD =\
 libdupfilters.la \
 -lpcap
 

TESTS = $(check_PROGRAMS) $(check_SCRIPTS)
