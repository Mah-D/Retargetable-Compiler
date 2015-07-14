/*
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */

/*
 ** server.c -- a TCP stream socket server
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <string.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>
#include <arpa/inet.h>
#include <sys/wait.h>
#include <signal.h>
#include "client_server_common.h"

#define BACKLOG 10	 // how many pending connections queue will hold

//never use global/static variables, wrap them into local variable scope to avoid threading shit problems
void tcp_loopback_server_cleanup(void *ptr)
{
	close(((SERVER_THREAD_DATA_STRUCT *)ptr)->connection_sock_fd);
	free(((SERVER_THREAD_DATA_STRUCT *)ptr)->buffer_to_be_freed);
	printf("Destroying tcp server %d \n", ((SERVER_THREAD_DATA_STRUCT *)ptr)->core_id);
	free(ptr);
}

//getsockaddr, IPv4 or IPv6:
void* get_in_addr(struct sockaddr *sa) {
	if (sa->sa_family == AF_INET) {
		return &(((struct sockaddr_in*) sa)->sin_addr);
	}
	return &(((struct sockaddr_in6*) sa)->sin6_addr);
}

int tcp_simple_sever_main(void *ptr) {

	SERVER_THREAD_DATA_STRUCT *my_data = (SERVER_THREAD_DATA_STRUCT *)ptr;
	char my_port[256] = {0};
	sprintf(my_port, "%d", TCP_LOOPBACK_PORT_NUM + my_data->core_id);
	my_data->buffer_to_be_freed = malloc(MAX_BUFF_SIZE);

	int sockfd, new_fd; // listen on sock_fd, new connection on new_fd
	struct addrinfo hints, *servinfo, *p;
	struct sockaddr_storage their_addr; // connector's address information
	socklen_t sin_size;
	int yes = 1;
	char s[INET6_ADDRSTRLEN];
	int rv;

	memset(&hints, 0, sizeof hints);
	hints.ai_family = AF_UNSPEC;
	hints.ai_socktype = SOCK_STREAM;
	hints.ai_flags = AI_PASSIVE; // use my IP

	if ((rv = getaddrinfo(NULL, my_port, &hints, &servinfo)) != 0) {
		fprintf(stderr, "getaddrinfo: %s\n", gai_strerror(rv));
		return 1;
	}

	// loop through all the results and bind to the first we can
			for(p = servinfo; p != NULL; p = p->ai_next) {
				if ((sockfd = socket(p->ai_family, p->ai_socktype,
										p->ai_protocol)) == -1) {
					perror("server: socket");
					continue;
				}

				if (setsockopt(sockfd, SOL_SOCKET, SO_REUSEADDR, &yes,
								sizeof(int)) == -1) {
					perror("setsockopt");
					exit(1);
				}

				if (bind(sockfd, p->ai_addr, p->ai_addrlen) == -1) {
					close(sockfd);
					perror("server: bind");
					continue;
				}

				break;
			}

			//copy into somewhere, for cleanup handler
			my_data->connection_sock_fd = sockfd;

			if (p == NULL) {
				fprintf(stderr, "server: failed to bind\n");
				return 2;
			}

			freeaddrinfo(servinfo); // all done with this structure

			if (listen(sockfd, BACKLOG) == -1) {
				perror("listen");
				exit(1);
			}

			//printf("server: waiting for connections...\n");

			while(1) { // main accept() loop
				sin_size = sizeof their_addr;
				new_fd = accept(sockfd, (struct sockaddr *)&their_addr, &sin_size);
				if (new_fd == -1) {
					perror("accept");
					continue;
				}

				inet_ntop(their_addr.ss_family,
						get_in_addr((struct sockaddr *)&their_addr),
						s, sizeof s);
				//printf("server: got connection from %s\n", s);

				//handle client 1-by-1
				handle_single_client(new_fd, my_data->buffer_to_be_freed);
				close(new_fd); // parent doesn't need this
			}

			return 0;
		}
