SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_PROGRAMS = \
 dupd

dupd_SOURCES = \
 base_stream.cc base_stream.h \
 dupd.cc globals.h \
 file_descriptor.cc file_descriptor.h \
 io_descriptor.cc io_descriptor.h \
 listen_stream.cc listen_stream.h \
 process.cc process.h \
 read_dup_stream.cc read_dup_stream.h \
 read_dupd_stream.cc read_dupd_stream.h \
 read_pipe_stream.cc read_pipe_stream.h \
 session.cc session.h \
 session_stream.cc session_stream.h \
 unknown_stream.cc unknown_stream.h \
 write_dup_stream.cc write_dup_stream.h \
 write_dupd_stream.cc write_dupd_stream.h \
 write_pipe_stream.cc write_pipe_stream.h 

#tests
#check_PROGRAMS = \
# testex

#TESTS = $(check_PROGRAMS)

#testex_SOURCES = \
# testex.c 
