/*
 * unix_domain_stream_server.c
 *
 *  Created on: Jan 19, 2010
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

//never use global/static variables, wrap them into local variable scope to avoid threading shit problems
void af_unix_stream_server_cleanup(void *ptr)
{
	char sock_path_buffer[256] = {0};
	sprintf(sock_path_buffer, "%s-%d", SOCK_PATH, ((SERVER_THREAD_DATA_STRUCT *)ptr)->core_id);
	unlink(sock_path_buffer);
	close(((SERVER_THREAD_DATA_STRUCT *)ptr)->connection_sock_fd);
	free(((SERVER_THREAD_DATA_STRUCT *)ptr)->buffer_to_be_freed);
	printf("Destroying server %d \n", ((SERVER_THREAD_DATA_STRUCT *)ptr)->core_id);

	free(ptr);
}

int AF_UNIX_STREAM_main(void *ptr) {

	SERVER_THREAD_DATA_STRUCT *my_data = (SERVER_THREAD_DATA_STRUCT *)ptr;

	int core_num = my_data->core_id;
	int s, s2, t, len;
	struct sockaddr_un local, remote;

	//char *data_buffer = malloc(MAX_BUFF_SIZE);	//potential memory leak when running in threaded smp version
	//copy into somewhere, for cleanup handler
	my_data->buffer_to_be_freed = malloc(MAX_BUFF_SIZE);

	if ((s = socket(AF_UNIX,SOCK_STREAM, 0)) == -1) {
		perror("socket");
		exit(1);
	}
	//copy into somewhere, for cleanup handler
	my_data->connection_sock_fd = s;

	local.sun_family = AF_UNIX;
	//strcpy(local.sun_path, SOCK_PATH);
	sprintf(local.sun_path, "%s-%d", SOCK_PATH, core_num);
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

		handle_single_client(s2, my_data->buffer_to_be_freed);

		close(s2);
	}


	return 0;
}
