####################################################################
#                                                                  #
#             Makefile for Hiwi stuff                  #
#                                                                #
####################################################################
#
# to - be - modified

INC     =       

CC     =       gcc
CCFLAGS  =     -D_GNU_SOURCE -g -Wall 
#CCFLAGS  =       -g -Wall -DBIDIRECTIONAL_MEASUREMENT

LIBS	=   -lm -lpthread

all: perf_testing 

perf_testing: memcpy_perf.o smp_pipe_perf.o smp_msq_perf.o client_server_common.o smp_tcp_socket_perf.o tcp_simple_server.o AF_UNIX_STREAM_server.o AF_UNIX_DGRAM_server.o smp_AF_UNIX_STREAM_perf.o smp_AF_UNIX_DGRAM_perf.o calibrate_driver.o helper_lib.o $(INC)
	$(CC) $(CCFLAGS) -o perf_testing calibrate_driver.o memcpy_perf.o smp_pipe_perf.o smp_msq_perf.o client_server_common.o tcp_simple_server.o AF_UNIX_STREAM_server.o AF_UNIX_DGRAM_server.o smp_AF_UNIX_STREAM_perf.o smp_AF_UNIX_DGRAM_perf.o smp_tcp_socket_perf.o helper_lib.o $(LIBS) $(IDIR)

#tcp_simple_server: client_server_common.h common.h client_server_common.o tcp_simple_server.o
#	$(CC) $(CCFLAGS) -o tcp_simple_server client_server_common.o tcp_simple_server.o $(LIBS) $(IDIR)

#AF_UNIX_STREAM_server: AF_UNIX_STREAM_server.c client_server_common.c 
#	$(CC) $(CCFLAGS) -o AF_UNIX_STREAM_server client_server_common.o AF_UNIX_STREAM_server.c $(LIBS) $(IDIR)

#AF_UNIX_DGRAM_server: AF_UNIX_DGRAM_server.c
#	$(CC) $(CCFLAGS) -o AF_UNIX_DGRAM_server AF_UNIX_DGRAM_server.c $(LIBS) $(IDIR)
	 		
############################################################
	
calibrate_driver.o: common.h memcpy_perf.h smp_tcp_socket_perf.h smp_pipe_perf.h smp_msq_perf.h smp_AF_UNIX_STREAM_perf.h smp_AF_UNIX_DGRAM_perf.h calibrate_driver.c $(INC)
	$(CC) $(CCFLAGS) -c calibrate_driver.c

helper_lib.o: helper_lib.h helper_lib.c $(INC)
	$(CC) $(CCFLAGS) -c helper_lib.c
	
memcpy_perf.o: memcpy_perf.h helper_lib.h memcpy_perf.c $(INC)
	$(CC) $(CCFLAGS) -c memcpy_perf.c

smp_pipe_perf.o: helper_lib.h smp_pipe_perf.h smp_pipe_perf.c $(INC)
	$(CC) $(CCFLAGS) -c smp_pipe_perf.c

smp_msq_perf.o: helper_lib.h smp_msq_perf.h smp_msq_perf.c $(INC)
	$(CC) $(CCFLAGS) -c smp_msq_perf.c
		
client_server_common.o: common.h client_server_common.h client_server_common.c $(INC)
	$(CC) $(CCFLAGS) -c client_server_common.c
 	
smp_tcp_socket_perf.o: common.h helper_lib.h client_server_common.h smp_tcp_socket_perf.h smp_tcp_socket_perf.c $(INC)
	$(CC) $(CCFLAGS) -c smp_tcp_socket_perf.c

tcp_simple_server.o: client_server_common.h tcp_simple_server.c 
	$(CC) $(CCFLAGS) -c tcp_simple_server.c
	 
AF_UNIX_STREAM_server.o: common.h helper_lib.h AF_UNIX_STREAM_server.c $(INC)
	$(CC) $(CCFLAGS) -c AF_UNIX_STREAM_server.c

AF_UNIX_DGRAM_server.o: common.h AF_UNIX_DGRAM_common.h AF_UNIX_DGRAM_server.c $(INC)
	$(CC) $(CCFLAGS) -c AF_UNIX_DGRAM_server.c
	 
smp_AF_UNIX_DGRAM_perf.o: common.h helper_lib.h AF_UNIX_DGRAM_common.h smp_AF_UNIX_DGRAM_perf.h smp_AF_UNIX_DGRAM_perf.c AF_UNIX_DGRAM_server.c $(INC)
	$(CC) $(CCFLAGS) -c smp_AF_UNIX_DGRAM_perf.c
	
smp_AF_UNIX_STREAM_perf.o: helper_lib.h client_server_common.h smp_AF_UNIX_STREAM_perf.h smp_AF_UNIX_STREAM_perf.c AF_UNIX_STREAM_server.c $(INC)
	$(CC) $(CCFLAGS) -c smp_AF_UNIX_STREAM_perf.c
	
clean:
	rm -rf *.o perf_testing tcp_simple_server AF_UNIX_STREAM_server AF_UNIX_DGRAM_server my_af_unix_dgram_server my_af_unix_dgram_client AF_UNIX_STREAM_SOCK
