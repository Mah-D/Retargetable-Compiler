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


void af_unix_dgram_server_cleanup(void *ptr)
{
	char sock_path_buffer[256] = {0};
	sprintf(sock_path_buffer, "%s-%d", DGRAM_SOCKET_PATH, ((SERVER_THREAD_DATA_STRUCT *)ptr)->core_id);
	unlink(sock_path_buffer);
	close(((SERVER_THREAD_DATA_STRUCT *)ptr)->connection_sock_fd);

	printf("Destroying af_unix_dgram_server %d \n", ((SERVER_THREAD_DATA_STRUCT *)ptr)->core_id);

	free(ptr);
}

int af_unix_dgram_server_main(void *ptr) {
	SERVER_THREAD_DATA_STRUCT *my_data = (SERVER_THREAD_DATA_STRUCT *)ptr;
	int core_num = my_data->core_id;
	int sock;
	char sdata[DGRAM_BUFF_SIZE];
	size_t slen, rlen;
	struct sockaddr_un servaddr; /* address of server */
	struct sockaddr_un from;
	socklen_t fromlen;
	struct DgramMeta meta;
	unsigned int i;

	char socket_path_buffer[256] = {0};
	sprintf(socket_path_buffer, "%s-%d", DGRAM_SOCKET_PATH, core_num);
	unlink(socket_path_buffer);

	/*      Create a UNIX datagram socket for server        */
	if ((sock = socket(AF_UNIX, SOCK_DGRAM, 0)) < 0) {
		perror("server: socket");
		exit(1);
	}
	//copy to here for future release
	my_data->connection_sock_fd = sock;

	/*      Set up address structure for server socket      */

	bzero(&servaddr, sizeof(servaddr));

	servaddr.sun_family = AF_UNIX;
	strcpy(servaddr.sun_path, socket_path_buffer);

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
