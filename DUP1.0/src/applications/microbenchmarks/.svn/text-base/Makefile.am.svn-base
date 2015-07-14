SUBDIRS = .

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_PROGRAMS = \
 profile 

profile_SOURCES = \
  AF_UNIX_DGRAM_common.h  \
  AF_UNIX_DGRAM_perf.h \
  AF_UNIX_STREAM_perf.c \
  AF_UNIX_STREAM_server.c \
  calibrate_driver.h\
  client_server_common.h \
  helper_lib.c \
  memcpy_perf.c \
  msq_perf.c \
  pipe_perf.c \
  tcp_socket_perf.h \
  AF_UNIX_DGRAM_perf.c \
  AF_UNIX_DGRAM_server.c \
  AF_UNIX_STREAM_perf.h \
  calibrate_driver.c \
  client_server_common.c \
  common.h  \
  helper_lib.h \
  memcpy_perf.h \
  msq_perf.h \
  pipe_perf.h \
  tcp_simple_server.c\
  tcp_socket_perf.c

profile_LDADD = -lm
