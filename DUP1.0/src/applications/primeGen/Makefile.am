SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include -I$(top_srcdir)/src/dup

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

if WITH_SSL
if WITH_GMP
    DEVRANDOM = devrandom_gen_random
    GMP_GEN = gmp_gen_random
    MILLERRABIN = millerrabin
endif
endif

EXTRA_DIST = $(bin_SCRIPTS) $(check_SCRIPTS)  pow.py

bin_PROGRAMS = \
  $(MILLERRABIN) \
  $(DEVRANDOM) \
  $(GMP_GEN)

dupincludedir = \
 $(includedir)/dup
dupinclude_HEADERS = \
 $(includedir)/dup/dup_filter_lib.h

devrandom_gen_random_SOURCES = \
 devrandom_gen_random.c
devrandom_gen_random_LDADD = \
 -lgmp -lssl

gmp_gen_random_SOURCES = \
 gmp_gen_random.c
gmp_gen_random_LDADD = \
 -lgmp -lssl

millerrabin_SOURCES = \
 millerrabin.c
millerrabin_LDADD = \
 -ldupfilters -lgmp -lssl

if WITH_SSL
if WITH_GMP

check_SCRIPTS = \
 test_gmp_gen_random.sh \
 test_devrandom_gen_random.sh
endif
endif

TESTS = $(check_PROGRAMS) $(check_SCRIPTS)
