/*
 ============================================================================
 Name        : DispatcherCode.c
 Author      : Oren Freiberg and Riyaz Haque
 Version     : 1
 Copyright   :
 Description : A Dispatcher for  in C, Ansi-style
 ============================================================================
 */

#include "Config.h"
#include "DispatcherCode.h"
int main(void) {
	fprintf(stderr, "Starting Dispatcher\n");

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
	if (OUTPUT_ERROR)
		fprintf(stderr, "%d:Read config file\n", place);
	int ret;


	ret = pthread_mutex_init(&mp, NULL);

	if(ret = EXIT_FAILURE){
		fprintf(stderr, "%d:Creating pthread mutex failed\n", place);
	}
	int success = dispatcher(place, totalPlaces, 6);

	fclose(fp);
	if (OUTPUT_ERROR)
		fprintf(stderr, "Dispatcher Exited\n");
	if(success){
			return EXIT_SUCCESS;
			}else{
			return	EXIT_FAILURE;
			}
}

int dispatcher(int place, int totalPlaces, int fileDescriptor) {
	if (place == 0) {
		fileDescriptor = 0;
		if (OUTPUT_ERROR)
			fprintf(stderr, "Dispatcher waiting for %d Msgs\n", totalPlaces);
		int counter = 0;
		//RECIVE N-1 RDYS

		int failed = 0;
		while (counter != totalPlaces && failed != totalPlaces) {

			int success = ReadMsg(place);
			if (success == EXIT_SUCCESS) {
				counter++;
				if (OUTPUT_ERROR)
					fprintf(stderr,
							"%d:Dispatcher received Msgs from a place\n", place);
			} else {
				failed++;
				if (OUTPUT_ERROR)
					fprintf(
							stderr,
							"%d:Dispatcher Failed receiving a Msgs at a place\n",
							place);

			}
		}
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher received all N-1 Msgs\n", place);

	} else if (place > 0) {
		char * mychar = "READY";
		if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Dispatcher sending ready Msgs%d\n", place, sizeof(&mychar)+1);


		int success = WriteMsg(place, calculatePlaceToWriteTo(0), 1, sizeof(&mychar)+1, mychar);
		if (!success) {

			return EXIT_FAILURE;
		}
	} else {
		fprintf(stderr, "BAD PLACE\n");
		return EXIT_FAILURE;
	}

	if (OUTPUT_ERROR)
		fprintf(stderr, "Finished successfully at place %d\n", place);
	return EXIT_SUCCESS;
}


int calculatePlaceToWriteTo(int placeToWriteTo){
	return placeToWriteTo+4+1;

}

pthread_mutex_t getMutexLock(){
	return mp;
}

