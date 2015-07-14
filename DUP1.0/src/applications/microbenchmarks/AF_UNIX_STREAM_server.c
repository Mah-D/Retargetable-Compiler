/*
 * unix_domain_stream_server.c
 *
 *  Created on: Nov 10, 2009
 *      Author: liangxue
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

#include "client_server_common.h"

static char *data_buffer;
static int s;

static void sig_terminate()
{

	free(data_buffer);
	unlink(SOCK_PATH);
	close(s);
	printf("Unix Domain Socket STREAM server done\n");

	exit(0);
}

int AF_UNIX_STREAM_main() {

	signal(SIGTERM, sig_terminate);

	int s2, t, len;
	struct sockaddr_un local, remote;

	data_buffer = malloc(MAX_BUFF_SIZE);

	if ((s = socket(AF_UNIX,SOCK_STREAM, 0)) == -1) {
		perror("socket");
		exit(1);
	}

	local.sun_family = AF_UNIX;
	strcpy(local.sun_path, SOCK_PATH);
	unlink(local.sun_path);

	len = strlen(local.sun_path) + sizeof(local.sun_family);

	if (bind(s, (struct sockaddr *) &local, len) == -1) {
		perror("bind");
		exit(1);
	}

	if (listen(s, 5) == -1) {
		perror("listen");
		exit(1);
	}

	while (1) {

		//printf("Waiting for a connection...\n");
		t = sizeof(remote);
		if ((s2 = accept(s, (struct sockaddr *) &remote, (socklen_t *)&t)) == -1) {
			perror("accept");
			exit(1);
		}
		//printf("Connected.\n");

		handle_single_client(s2, data_buffer);

		close(s2);
	}


	return 0;
}
