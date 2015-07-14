/*
 * unix_domain_stream_client.c
 *
 *  Created on: Nov 10, 2009
 *      Author: liangxue
 *
 *  Description: This is a Unix Domain version of STREAM socket,
 *  Structurally it's similar to TCP socket file.
 */

#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>

#include "helper_lib.h"
#include "client_server_common.h"
#include "AF_UNIX_STREAM_perf.h"

static int sock_fd;
static pid_t pid;

static int setup_socket_to_server() {
	int len;
	struct sockaddr_un remote;

	if ((sock_fd = socket(AF_UNIX,SOCK_STREAM, 0)) == -1) {
		perror("socket");
		exit(1);
	}

	remote.sun_family = AF_UNIX;
	strcpy(remote.sun_path, SOCK_PATH);
	len = strlen(remote.sun_path) + sizeof(remote.sun_family);
	if (connect(sock_fd, (struct sockaddr *) &remote, len) == -1) {
		perror("connect");
		exit(1);
	}

	return 0;
}

static int clean_up() {
	//Lastly - tell server to close socket
	if (sendall(sock_fd, OK_TO_CLOSE_SOCKET, strlen(OK_TO_CLOSE_SOCKET), 0)
			== -1) {
		printf("error occurred when telling server closing socket\n");
		exit(1);
	}
	close(sock_fd);

	//asynchronously kill server process
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
static uint64_t domain_socket_perf(size_t blocksize, unsigned int iter) {
	uint64_t elapsedTime = 0;

	char *sendall_buf = malloc(blocksize);
	memset(sendall_buf, 'a', blocksize);

	elapsedTime = transfer_data_to_socket(sock_fd, sendall_buf, blocksize, iter);

	free(sendall_buf);

	return elapsedTime;
}


int AF_UNIX_STREAM_main();

uint64_t unix_domain_stream_interface(size_t blocksize, unsigned int iter,
		MEASUREMENT_STATE state) {

	switch (state) {
	case START_UP:
		if ((pid = fork()) == 0) {
		  AF_UNIX_STREAM_main ();
		  _exit (0);
		}
		sleep(1);
		return setup_socket_to_server();
		break;
	case MAIN_BODY:
		return domain_socket_perf(blocksize, iter);
		break;
	case CLEAN_UP:
		return clean_up();
		break;
	default:
		exit(1);
	}
}
