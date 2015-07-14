/*
 * client_server_common.c
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 */

#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/socket.h>
#include <stdint.h>
#include "client_server_common.h"
#include "helper_lib.h"
#include "common.h"

/*
 * Note that:
 * There are still some overhead here:
 * - a short string "hello..." message is sent to server
 * - before sendalling real data, it has to tell server the size of data
 * - receive acknowledgment string from server
 */
uint64_t transfer_data_to_socket(int sock_fd, char *sendall_buf,
		unsigned int blocksize, unsigned int iter) {
	char last_ack_bytes[100];
	memset(last_ack_bytes, 0, 100);
	int index = 0;
	//printf("send %s to server\n", HELLO_STR);

	//1st - init data transfer with "Hello"
	if (sendall(sock_fd, HELLO_STR, strlen(HELLO_STR), 0) == -1) {
		printf("Error sendall %s\n", HELLO_STR);
		exit(1);
	}

	//2nd - tell server how many bytes would be transferred
	//by sending block size and iteration number
	if (sendall(sock_fd, (char *) (&blocksize), sizeof(blocksize), 0) == -1) {
		perror("sendall");
		exit(1);
	}

	if (sendall(sock_fd, (char *) (&iter), sizeof(iter), 0) == -1) {
		perror("sendall");
		exit(1);
	}

	//starts timing measurement!
	uint64_t start = get_time();
	//3rd - start sending
	for (index = 0; index < iter; index++) {
		if (sendall(sock_fd, sendall_buf, blocksize, 0) == -1) {
			perror("sendall");
			exit(1);
		}
		if(bidirectional)
		{
			if (-1 == recvall(sock_fd, sendall_buf, blocksize, 0))
			  {
				perror("recvall");
				exit(1);
			  }
		}
	}
	//printf("finished sendalling %u bytes\n", total_bytes_sent);

	if(!bidirectional)
	{
		//4th - waiting for ackownlodgement
		if (recv(sock_fd, last_ack_bytes, strlen(ACK_STRING), 0) == -1) {
			perror("recv");
			exit(1);
		}
		if (strncmp(last_ack_bytes, ACK_STRING, strlen(ACK_STRING)) != 0) {
			printf("Failed receiving acknowledgment from server\n");
			exit(1);
		}
	}
	//printf("recived ack %s\n", last_ack_bytes);
	return get_time() - start;
}

int handle_single_client(int new_fd, char *data_buffer) {

	unsigned int block_size = 0;
	unsigned int iter_no = 0;
	unsigned int rlen = 0;
	char headerMsg[strlen(HELLO_STR)+1];
	char *safe_buffer = data_buffer;
	int flag_malloc = 0;

	ServerStateEnums myState = HELLO_OR_TERMINATE;
	int close_socket_flag = 0;

	while (!close_socket_flag) {
		switch (myState) {
		//client side will inform if more data are to be sent or it's ok to close the socket
		case HELLO_OR_TERMINATE:
			memset(headerMsg, 0, strlen(HELLO_STR)+1);
			//printf("In stage: waiting for hello or terminate\n");
			if (recvall(new_fd, headerMsg, strlen(HELLO_STR), 0) == -1) {
				printf("Error receiving hello/close_socket\n");
			}
			//printf("received %s\n", headerMsg);
			myState = RECEIVING_DATA_HEADER;

			if (strncmp(headerMsg, HELLO_STR, strlen(HELLO_STR)) == 0)
				myState = RECEIVING_DATA_HEADER;
			else if (strncmp(headerMsg, OK_TO_CLOSE_SOCKET, strlen(
					OK_TO_CLOSE_SOCKET)) == 0)
				myState = TERMINATE_SESSION;
			else
			  {
			    fprintf(stderr,
				    "ERORR: received `%s', expected HELLO!\n",
				    headerMsg);
			    myState = ERROR_OCCURRED;
			  }
			break;

		case RECEIVING_DATA_HEADER:
			if (recvall(new_fd, (char *)&block_size,
					sizeof(block_size), 0) == -1) {
				printf("error receiving block size\n");
				exit(1);
			}
			if (recvall(new_fd, (char *)&iter_no,
								sizeof(iter_no), 0) == -1) {
					printf("error receiving iter num\n");
					exit(1);
			}
			if(block_size > MAX_BUFF_SIZE)
			{
				safe_buffer = malloc(block_size);
				flag_malloc = 1;
			}
			myState = RECEIVING_DATA_BODY;

			break;

		case RECEIVING_DATA_BODY:
		    while (0 < iter_no--)
			{
				rlen = recvall(new_fd, safe_buffer, block_size, 0);
				if(rlen == -1)
				{
					perror("recvall");
					exit(1);
				}
				if(bidirectional)
				{
					if(sendall(new_fd, safe_buffer, block_size, 0) == -1)
					{
						fprintf(stderr, "error send to socket\n");
						exit(1);
					}
				}
			}
			myState = ACKNOWLEDGE;
			break;

		case ACKNOWLEDGE:
			if(!bidirectional)
			if (sendall(new_fd, ACK_STRING, strlen(ACK_STRING), 0) == -1) {
				perror("sendall");
			}
			myState = HELLO_OR_TERMINATE;
			break;
		case TERMINATE_SESSION: //now get out of this state machine, bye!
			//printf("will be closing this socket!\n");
			close_socket_flag = 1;
			//we've a previous malloc function call
			if(flag_malloc)
				free(safe_buffer);
			break;
		case ERROR_OCCURRED:
			printf("Error occurred!\n");
			exit(1);
			break;
		default:
			printf("Unknown state\n");

		}
	}
	return 0;
}

//wrapper function to handle partial send problem
int sendall(int s, char *buf, int len, int flag)
{
    int total = 0;        // how many bytes we've sent
    int bytesleft = len; // how many we have left to send
    int n;

    n = 0;
    while(total < len) {
        n = send(s, buf+total, bytesleft, flag);
        if (n == -1) { break; }
        total += n;
        bytesleft -= n;
    }

    return (n==-1)?-1:total; // return -1 on failure, 0 on success
}

//wrapper function to handle partial send/recv problem
int recvall(int s, char *buf, int len, int flag)
{
    int total = 0;        // how many bytes we've sent
    int bytesleft = len; // how many we have left to send
    int n;

    n = 0;
    while(total < len) {
        n = recv(s, buf+total, bytesleft, flag);
        if (n == -1) { break; }
        total += n;
        bytesleft -= n;
    }
    return (n==-1)?-1:total; // return -1 on failure, 0 on success
}
