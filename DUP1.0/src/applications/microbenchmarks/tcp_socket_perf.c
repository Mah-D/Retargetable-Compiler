/*
 * socket_perf.c
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */

/*
 ** client.c -- a stream socket client demo
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <netinet/tcp.h>
#include <signal.h>
#include <sys/wait.h>

#include "helper_lib.h"
#include "common.h"
#include "client_server_common.h"
#include "tcp_socket_perf.h"

#define PORT "3490" // the port client will be connecting to
#define MAXDATASIZE 100 // max number of bytes we can get at once
static int sock_fd;
static pid_t pid;

// get sockaddr, IPv4 or IPv6:
static void *get_in_addr(struct sockaddr *sa) {
	if (sa->sa_family == AF_INET) {
		return &(((struct sockaddr_in*) sa)->sin_addr);
	}

	return &(((struct sockaddr_in6*) sa)->sin6_addr);
}

static int setup_socket_to_server(char *server_ip) {
	int flag = 1;
	int result;

	struct addrinfo hints, *servinfo, *p;
	int rv;
	char s[INET6_ADDRSTRLEN];

	memset(&hints, 0, sizeof hints);
	hints.ai_family = AF_UNSPEC;
	hints.ai_socktype = SOCK_STREAM;

	if ((rv = getaddrinfo(server_ip, PORT, &hints, &servinfo)) != 0) {
		fprintf(stderr, "getaddrinfo: %s\n", gai_strerror(rv));
		return 1;
	}

	// loop through all the results and connect to the first we can
	for (p = servinfo; p != NULL; p = p->ai_next) {
		if ((sock_fd = socket(p->ai_family, p->ai_socktype, p->ai_protocol))
				== -1) {
			perror("client: socket");
			continue;
		}
		//TCP_NODELAY option
		result = setsockopt(sock_fd, /* socket affected */
		IPPROTO_TCP, /* set option at TCP level */
		TCP_NODELAY, /* name of option */
		(char *) &flag, /* the cast is historical cruft */
		sizeof(int)); /* length of option value */
		if (result < 0) {
			perror("client: socket TCP_NODELAY");
			continue;
		}
		if (connect(sock_fd, p->ai_addr, p->ai_addrlen) == -1) {
			close(sock_fd);
			perror("client: connect");
			continue;
		}

		break;
	}

	if (p == NULL) {
		fprintf(stderr, "client: failed to connect\n");
		return 2;
	}

	inet_ntop(p->ai_family, get_in_addr((struct sockaddr *) p->ai_addr), s,
			sizeof s);
	//printf("client: connecting to %s\n", s);

	freeaddrinfo(servinfo); // all done with this structure

	return 0;
}

static int cleanup_tcp_server() {
	//Lastly - tell server to close socket
	if (sendall(sock_fd, OK_TO_CLOSE_SOCKET, strlen(OK_TO_CLOSE_SOCKET), 0)
			== -1) {
		printf("error occurred when telling server closing socket\n");
		exit(1);
	}

	close(sock_fd);
	//kill tcp loopback server
	kill(pid, SIGTERM);
	//sleep(1);
	waitpid(pid, NULL, 0);

	return 0;

}

/*
 * Measure socket performance EXCLUDING socket setup/close overhead
 * - first establish tcp connection with server
 * - then measure the time spent for transferring raw data
 * - close connection
 */
//Question - how will the measured result be affected by server's performance?
static uint64_t tcp_socket_perf(size_t blocksize, unsigned int iter) {
	uint64_t elapsedTime = 0;

	char *sendall_buf = malloc(blocksize);
	memset(sendall_buf, 'a', blocksize);
	/*
	 * this snd/recv buffer size may possibly to fine-tuned
	 * but to change the default socket buffer size,
	 * we have to change that in Linux kernel side too
	 */

	elapsedTime = transfer_data_to_socket(sock_fd, sendall_buf, blocksize, iter);

	free(sendall_buf);

	return elapsedTime;
}

int tcp_simple_sever_main();

uint64_t tcp_loopback_interface(size_t blocksize, unsigned int iter,
		MEASUREMENT_STATE state) {
	switch (state) {
	case START_UP:
		/* Fork the server process to receive data from client */

		if ((pid = fork()) == 0) {
		  
		  tcp_simple_sever_main();
		  _exit (0);
		}
		sleep(1);
		//parent process continues
		return setup_socket_to_server("127.0.0.1");
		break;
	case MAIN_BODY:
		return tcp_socket_perf(blocksize, iter);
		break;
	case CLEAN_UP:
		return cleanup_tcp_server();
		break;
	default:
		exit(1);
	}
}
