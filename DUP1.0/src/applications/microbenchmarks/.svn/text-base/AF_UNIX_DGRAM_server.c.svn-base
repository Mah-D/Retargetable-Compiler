/*
 * AF_UNIX_DGRAM_server.c
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 *      Description: ported from HP website
 *      http://docs.hp.com/en/B2355-90136/ch07s06.html?btnNext=next%A0%BB
 *
 *  This is a simple datagram server - echoes back packet to client who sent it
 */

#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/un.h>
#include <stdio.h>
#include <signal.h>
#include <netdb.h>
#include <stdlib.h>
#include <unistd.h>

#include "AF_UNIX_DGRAM_common.h"
#include "common.h"

#include <signal.h>

static int sock;

static void sig_terminate() {

	/*      Use unlink to remove the file (inode) so that the
	 *       name will be available for the next run.
	 */
	unlink(SOCKET_PATH);
	close(sock);
	printf("Unix Domain Socket Datagram server done\n");
	exit(0);
}

int af_unix_dgram_server_main() {
	char sdata[DGRAM_BUFF_SIZE];
	size_t slen, rlen;
	struct sockaddr_un servaddr; /* address of server */
	struct sockaddr_un from;
	socklen_t fromlen;
	struct DgramMeta meta;
	unsigned int i;
	//install signal handler - parent process wants to clean up
	signal(SIGTERM, sig_terminate);

	unlink(SOCKET_PATH);

	/*      Create a UNIX datagram socket for server        */
	if ((sock = socket(AF_UNIX, SOCK_DGRAM, 0)) < 0) {
		perror("server: socket");
		exit(1);
	}
	/*      Set up address structure for server socket      */

	bzero(&servaddr, sizeof(servaddr));

	servaddr.sun_family = AF_UNIX;
	strcpy(servaddr.sun_path, SOCKET_PATH);

	if (bind(sock, (struct sockaddr *) &servaddr, sizeof(servaddr)) < 0) {
		perror("server: bind");
		close(sock);
		exit(2);
	}

	/*      Receive data from anyone, echo back data to the sender
	 *      Note that fromlen is passed as pointer so recvfrom
	 *      call can return the size of the returned address.
	 */
	//server enters into an endless loop
	while (1) {
		rlen = recvfrom(sock, &meta, sizeof(meta), 0,
				(struct sockaddr *) &from, &fromlen);
		for (i = 0; i < meta.iter; i++) {
			fromlen = sizeof(from);
			rlen = recvfrom(sock, sdata, DGRAM_BUFF_SIZE, 0,
					(struct sockaddr *) &from, &fromlen);
			if (rlen == -1) {
				perror("server: recv\n");
				exit(3);
			}
			if (rlen != meta.size)
				abort();
			if (bidirectional) {
				slen = sendto(sock, sdata, rlen, 0, (struct sockaddr *) &from,
						fromlen);
				if (slen < 0) {
					perror("server: sendto\n");
					exit(4);
				}
			}
		}
		if (!bidirectional) {
			slen = sendto(sock, ACK_STRING, strlen(ACK_STRING), 0,
					(struct sockaddr *) &from, fromlen);
		}
	}

	return 0;
}
