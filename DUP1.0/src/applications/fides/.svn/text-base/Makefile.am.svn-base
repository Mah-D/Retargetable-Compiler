SUBDIRS = .

INCLUDES = -I$(top_srcdir)/src/include -I $(top_srcdir)/src/filters

if USE_COVERAGE
  AM_CFLAGS = --coverage
  AM_CXXFLAGS = --coverage
endif

EXTRA_CXXFLAGS = -DFD_SETSIZE=65536

bin_PROGRAMS = \
 statekeeper \
 vtimekeeper \
 manufacturer \
 consumer \
 retailer \
 router \
 monolithic_commsim

noinst_PROGRAMS = \
 canbus

lib_LTLIBRARIES = \
 libfides.la \
 libcommsim.la \
 libcansim.la 

libcommsim_la_SOURCES = \
  commsim.cc

libcansim_la_SOURCES = \
  cansim.cc

libfides_la_SOURCES = \
 fides.cc
libfides_la_LIBADD = -ldupfilters

vtimekeeper_SOURCES = \
 vtimekeeper.cc
vtimekeeper_LDADD = \
 libfides.la

statekeeper_SOURCES = \
 statekeeper.cc
statekeeper_LDADD = \
 libfides.la

consumer_SOURCES = \
 consumer.cc
consumer_LDADD = \
 libfides.la \
 libcommsim.la

manufacturer_SOURCES = \
 manufacturer.cc
manufacturer_LDADD = \
 libfides.la \
 libcommsim.la

retailer_SOURCES = \
 retailer.cc
retailer_LDADD = \
 libfides.la \
 libcommsim.la
 
router_SOURCES = \
 router.cc
router_LDADD = \
 libfides.la \
 libcommsim.la

monolithic_commsim_SOURCES = \
 monolithic_commsim.cc
monolithic_commsim_LDADD =\
 libfides.la \
 libcommsim.la

canbus_SOURCES = \
  canbus.cc
canbus_LDADD = \
  libfides.la \
  libcansim.la

#tests

check_PROGRAMS = \
 test_Event \
 test_EventRecord \
 test_Process \
 test_commsim

check_SCRIPTS = \
 test_manufacturer.sh \
 test_statekeeper.sh \
 test_vtimekeeper.sh \
 test_retailer.sh \
 test_router.sh \
 test_consumer.sh

TESTS = $(check_PROGRAMS) $(check_SCRIPTS)

test_Event_SOURCES = \
 test_Event.cc
test_Event_LDADD = \
 libfides.la

test_EventRecord_SOURCES = \
 test_EventRecord.cc
test_EventRecord_LDADD = \
 libfides.la

test_Process_SOURCES = \
 test_Process.cc
test_Process_LDADD = \
 libfides.la

test_commsim_SOURCES = \
 test_commsim.cc
test_commsim_LDADD = \
 libfides.la \
 libcommsim.la

%.dup: commsim2dup.xsl %.xml
	xsltproc --output $@ $^

dups:
	for i in *.xml;do xsltproc --maxdepth 50000 -o $$(basename $$i .xml).dup --param manufacturers 2 --param consumers 2 --param retailers 2 commsim2dup2.xsl $$i;done	

ssims:
	for i in *.xml;do xsltproc -o $$(basename $$i .xml).ssim commsim2ssim.xsl $$i;done	

start_dupd:
	PATH=$(PWD):$(PWD)/../../filters:$(PATH) ../../dupd/dupd&

EXTRA_DIST = fides.h
