/*
 * AF_UNIX_DGRAM_perf.c
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 *
 *  - Implementation methodology
 *  Using Unix Domain Socket with datagram option,
 *  send packet to a server process which will echo back the same packet
 *  If the same packet is received, we're sure that packet is successfully transferred.
 *
 *  - Assumption
 *    Relying on basis that we'll NOT lose packet using datagram.
 *
 *  - Inaccuracy
 *  Measurement overhead includes additional time
 *  taken by server echoing back the same packet.
 */

#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/un.h>
#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <netdb.h>
#include <unistd.h>
#include <assert.h>
#include <signal.h>
#include <sys/wait.h>

#include "common.h"
#include "helper_lib.h"
#include "AF_UNIX_DGRAM_common.h"

static struct  sockaddr_un servaddr;/* address of server */
static char *sdata, *rdata;
static int sock;

//note that type can either be SOCK_DGRAM or SOCK_STREAM
static int setup_unix_domain_dgram_socket(char *server_sock_path)
{
        struct  sockaddr_un clntaddr;/* address of client */

        /* Create a UNIX datagram socket for client */
	unlink(SOCKET_PATHCLNT);

        if ((sock = socket(AF_UNIX, SOCK_DGRAM, 0)) < 0) {
                perror("client: socket");
                exit(2);
        }
	bzero(&servaddr, sizeof(servaddr));

	servaddr.sun_family = AF_UNIX;
	strcpy(servaddr.sun_path, SOCKET_PATHCLNT);

	if (bind(sock, (struct sockaddr *)&servaddr, sizeof(servaddr)) < 0) {
		perror("server: bind");
		close(sock);
		exit(2);
	}
        /*      Client will bind to an address so the server will
        *       get an address in its recvfrom call and use it to
        *       send data back to the client.
        */
        bzero(&clntaddr, sizeof(clntaddr));
        clntaddr.sun_family = AF_UNIX;
        strcpy(clntaddr.sun_path, SOCKET_PATH);

        if (connect(sock, (struct sockaddr *)&clntaddr, sizeof(clntaddr)) < 0) {
                perror("client: connect");
                close(sock);
                exit(3);
        }
        return 0;
}


static uint64_t AF_UNIX_DGRAM_perf(size_t blocksize, unsigned int iter)
{
	assert(blocksize <= DGRAM_BUFF_SIZE);

	size_t nbytes;
	uint64_t elapsedTime = 0;
	unsigned int i;
	sdata = malloc(blocksize);
	memset(sdata, 'a', blocksize);
	rdata = malloc(blocksize);
	char ack_array[strlen(ACK_STRING)+1]; //large enough to hold ACK_STR
	memset(ack_array, 0, strlen(ACK_STRING)+1);
	struct DgramMeta meta;

	meta.size = blocksize;
	meta.iter = iter;
	nbytes = send (sock,
		       &meta, sizeof (meta), 0);
	if (nbytes != sizeof (meta)) abort ();
	uint64_t start = get_time();
	for(i = 0; i < iter; i++)
	{
		//take care of partial send case
		nbytes = send (sock,
			       sdata, blocksize, 0);
		if (nbytes != blocksize) abort();
		if(bidirectional)
		{
			nbytes = recv(sock, rdata, blocksize, 0);
			if (nbytes != blocksize) abort();
		}
	}
	if(!bidirectional)
	{
		nbytes = recv(sock, ack_array, strlen(ACK_STRING), 0);
		if (nbytes != strlen(ACK_STRING)) abort();
	}

	elapsedTime = (get_time () - start);
	free(rdata);
	free(sdata);

	return elapsedTime;
}


int af_unix_dgram_server_main();

uint64_t AF_UNIX_DGRAM_perf_interface(size_t blocksize, unsigned int iter,
		MEASUREMENT_STATE state) {
	static pid_t pid;
	switch (state) {
	case START_UP:
		/* Fork the server process to receive data from client */

		//printf("Forking AF_UNIX_DGRAM server\n");
		if ((pid = fork()) == 0) {
		  af_unix_dgram_server_main ();
		  _exit(0);
		}
		sleep(1);
		//parent process continues
		return setup_unix_domain_dgram_socket(SOCKET_PATH);
		break;
	case MAIN_BODY:
		//temporarily don't go beyond this 64K
		//otherwise we have to split the packet
		if (blocksize > DGRAM_BUFF_SIZE) {
			return 0;
		}
		return AF_UNIX_DGRAM_perf(blocksize, iter);
		break;
	case CLEAN_UP:
		/*      Use unlink to remove the file (inode) so that the
		 *       name will be available for the next run.
		 */
		//kill unix domain socket datagram server
		kill(pid, SIGTERM);
		//sleep(1);
		waitpid(pid, NULL, 0);
		pid = 0;
		unlink(SOCKET_PATHCLNT);
		close(sock);
		return 0;
		break;
	default:
		perror("unknown state");
		exit(1);
	}
}
