if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_SCRIPTS = eat 


bin_PROGRAMS = \
 cmd \
 complete \
 copyargs \
 buffer-dup \
 deal \
 delay \
 duplicate \
 eof \
 faninany \
 fanout \
 gate \
 gather \
 holmerge \
 lookup \
 router \
 mgrep \
 nodelay \
 drop \
 append \
 count

noinst_PROGRAMS = \
 exec_no_stdin \
 exec_no_stdout \
 jointime \
 mstime 

EXTRA_DIST = \
 eat \
 perf_buffer_dup.sh \
 perf_cat.sh \
 perf_deal.sh \
 perf_faninany.sh \
 perf_fanout.sh \
 perf_gate.sh \
 perf_gather.sh \
 perf_grep.sh \
 perf_head.sh \
 perf_holmerge.sh \
 perf_lookup.sh \
 perf_mgrep.sh \
 perf_tail.sh \
 test_deal_input.txt \
 $(check_SCRIPTS)


lib_LTLIBRARIES = \
  libdupfilters.la
libdupfilters_la_SOURCES = \
  common.c

dupincludedir = \
  $(includedir)/dup
dupinclude_HEADERS = \
  dup_filter_lib.h

append_SOURCES = \
 append.c
append_LDADD =\
 libdupfilters.la

buffer_dup_SOURCES = \
 buffer-dup.c
buffer_dup_LDADD = \
 libdupfilters.la

router_SOURCES = \
 router.c
router_LDADD = \
 libdupfilters.la

cmd_SOURCES = \
 cmd.c
cmd_LDADD = \
 libdupfilters.la

complete_SOURCES = \
 complete.c
complete_LDADD = \
 libdupfilters.la

copyargs_SOURCES = \
 copyargs.c

deal_SOURCES = \
 deal.c
deal_LDADD = \
 libdupfilters.la

delay_SOURCES = \
 delay.c

drop_SOURCES = \
 drop.c cbuffer.c cbuffer.h
drop_LDADD = \
 libdupfilters.la

duplicate_SOURCES = \
 duplicate.c
duplicate_LDADD = \
 libdupfilters.la

eof_SOURCES = \
 eof.c

exec_no_stdin_SOURCES = \
 exec_no_stdin.c

exec_no_stdout_SOURCES = \
 exec_no_stdout.c

faninany_SOURCES = \
 faninany.c
faninany_LDADD = \
 libdupfilters.la

fanout_SOURCES = \
 fanout.c
fanout_LDADD = \
 libdupfilters.la

nodelay_SOURCES = \
 nodelay.c

count_SOURCES = \
 count.c
count_LDADD = \
 libdupfilters.la

gate_SOURCES = \
 gate.c
gate_LDADD = \
 libdupfilters.la

gather_SOURCES = \
 gather.c
gather_LDADD = \
 libdupfilters.la

lookup_SOURCES = \
 lookup.c
lookup_LDADD = \
 libdupfilters.la

holmerge_SOURCES = \
 holmerge.c
holmerge_LDADD = \
 libdupfilters.la

mgrep_SOURCES = \
 mgrep.c
mgrep_LDADD = \
 libdupfilters.la

mstime_SOURCES = \
 mstime.c

jointime_SOURCES = \
 jointime.c

#tests
# check_PROGRAMS = \
#  test_faninany_eof
check_SCRIPTS = \
 test_cmd.sh \
 test_deal.sh \
 test_delay.sh \
 test_duplicate.sh \
 test_eof.sh \
 test_gather.sh \
 test_faninany.sh \
 test_fanout.sh \
 test_gate.sh \
 test_holmerge.sh \
 test_lookup.sh \
 test_mgrep.sh \
 test_no_stdxx.sh 


TESTS = $(check_PROGRAMS) $(check_SCRIPTS)

# test_faninany_eof_SOURCES = \
#  test_faninany_eof.c 
