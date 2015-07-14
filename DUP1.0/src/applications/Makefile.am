if WITH_PCAP
  PCAP = tcpsplit
endif

if WITH_JPEG
  JPEG = video
endif

if WITH_SSL
if WITH_GMP
  PRIMEGEN = primeGen
endif
endif

SUBDIRS = fides microbenchmarks $(JPEG) $(PCAP) $(PRIMEGEN) .
ACLOCAL_AMFLAGS = -I m4
if USE_COVERAGE
  AM_CFLAGS = --coverage
endif
