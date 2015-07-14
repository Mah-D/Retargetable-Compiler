SUBDIRS = .

if WITH_SDL
 SDL = dupplay
endif

if USE_COVERAGE
  AM_CFLAGS = --coverage
endif

bin_PROGRAMS = \
  dupcam \
  camdelay \
  dupvids $(SDL)

camdelay_SOURCES = \
 camdelay.c dupio.c

dupcam_SOURCES = \
 dupcam.c siva.c siva.h jpg.c jpg.h dupio.c dupio.h
dupcam_LDADD = \
 -ljpeg
 
dupplay_SOURCES = \
 play.c siva.c siva.h dupio.c jpg.c
dupplay_LDADD = \
 -ljpeg -lSDL
 
dupvids_SOURCES = \
 dupvids.c jpg.c jpg.h dupio.c dupio.h
dupvids_LDADD = \
 -lm -ljpeg

TESTS = $(check_PROGRAMS) $(check_SCRIPTS)