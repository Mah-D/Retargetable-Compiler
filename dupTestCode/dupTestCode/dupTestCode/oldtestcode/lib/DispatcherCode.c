/*
 ============================================================================
 Name        : DispatcherCode.c
 Author      : Oren Freiberg and Riyaz Haque
 Version     : 1
 Copyright   :
 Description : A Dispatcher for  in C, Ansi-style
 ============================================================================
 */

#include "../inc/Config.h"
#include "../inc/DispatcherCode.h"
int main(void) {
	fprintf(stderr, "Starting Dispatcher\n");

	//READS CONFIG FILE
	int BUF_SIZE = 80;
	char buf[BUF_SIZE]; /* Input buffer */
	const int fd = 4;
	if (OUTPUT_ERROR)
		fputs("Started Dispatcher waiting input\n", stderr);
	FILE *fp;
	fp = fopen("/Users/dupper/Desktop/dupTestCode/in.txt", "rt"); /* Make fd into FILE* for reading */
	fputs("Found the file descriptor\n", stderr);

	if (fp == NULL) {
		fprintf(stderr, "BAD FILE DESCRIPTOR %d TO CONFIG\n", fd);
		return EXIT_FAILURE;
	}

	int totalPlaces = -1;
	int place = -1;
	while (fgets(buf, 80, fp) != NULL) {
		if (OUTPUT_ERROR)
			fprintf(stderr, "READING FILE\n");
		/* get a line, up to 80 chars from fr.  done if NULL */
		sscanf(buf, "%d %d", &place, &totalPlaces);
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Convert place number from string to int\n",
					place);
		/* convert the string to a long int */
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d,%d\n", place, totalPlaces);
	}

	_place_init(place, totalPlaces);
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Read config file\n", place);
	int ret;

	ret = pthread_mutex_init(&mp, NULL);

	if (ret == EXIT_FAILURE) {
		fprintf(stderr, "%d:Creating pthread mutex failed\n", place);
	}
	//Starts the dispatcher
	int success = dispatcher();

	fclose(fp);
	if (OUTPUT_ERROR)
		fprintf(stderr, "Dispatcher Exited\n");
	if (success) {
		return EXIT_SUCCESS;
	} else {
		return EXIT_FAILURE;
	}
}

int dispatcher() {
	//Starts Sending and Reading Ready Msgs
	if (_here() == PLACEZERO) {
		//fileDescriptor = 0;
		if (OUTPUT_ERROR)
			fprintf(stderr, "Dispatcher waiting for %d Msgs\n", _max_places());
		int counter = 0;
		//RECIVE N-1 RDYS

		int failed = 0;
		struct Msg msgStruct;
		while (counter != _max_places() && failed != _max_places()) {

			int success = ReadMsg(&msgStruct);
			if (success == EXIT_SUCCESS && msgStruct.msgType == 1) {
				counter++;
				if (OUTPUT_ERROR)
					fprintf(stderr,
							"%d:Dispatcher received Msgs from a place\n", _here());
			} else {
				failed++;
				if (OUTPUT_ERROR)
					fprintf(
							stderr,
							"%d:Dispatcher Failed receiving a Msgs at a place\n",
							_here());

			}
		}
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher received all N-1 Msgs\n", _here());

	} else if (_here() > 0) {
		char * mychar = "READY";
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher sending ready Msg\n", _here());

		int success = WriteMsg(calculatePlaceToWriteTo(0), 1,
				sizeof(&mychar) + 1, mychar);
		if (!success) {

			return EXIT_FAILURE;
		}
	} else {
		fprintf(stderr, "BAD PLACE\n");
		return EXIT_FAILURE;
	}

	//Starts Main in X10 Program
	if (_here() == PLACEZERO) {
		//CALL MAIN PTHREAD
		//at the end of Main set exit to 1;
	}
	int exit = 1;
	struct Msg msgStruct;

	//Starts the Read Loops
	while (exit) {
		int success = ReadMsg(&msgStruct);
		if (!success) {

			return EXIT_FAILURE;
		}

		switch (msgStruct.msgType) {

		case 0:
			exit = -1;

			break;
			//Ready Msg
		case 1:
			break;
			// async msg
		case 2:
			break;

		case 3:
			break;
		default:
			exit = -1;
			return EXIT_FAILURE;
			break;
		}

	}
	int success=-1;
	//tell everyone else to exit
	if (_here() == 0) {
		int i;
		for (i = 1; i < _max_places(); ++i) {
			success = WriteMsg(calculatePlaceToWriteTo(i),
					0, sizeof("EXIT MAIN FINISHED") + 1,
					"EXIT MAIN FINISHED");
			if (!success) {
				return EXIT_FAILURE;
			}
		}
	}

	if (OUTPUT_ERROR)
		fprintf(stderr, "Finished successfully at place %d\n", _here());
	return EXIT_SUCCESS;
}

//returns the file descriptor of at where a place should write.
int calculatePlaceToWriteTo(int placeToWriteTo) {
	return placeToWriteTo + 4 + 1;

}
//returns the fd at which a place should read
int calculatePlaceToReadTo(int myPlace) {
	return FILE_DESCRIPTOR_DUP_READ;
}

// returns the mutex lock for writes
pthread_mutex_t getMutexLock() {
	return mp;
}

