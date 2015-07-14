/*
 * RunTest.c
 *
 *  Created on: Oct 27, 2010
 *      Author: Oren Freiberg
 */
#include <stdio.h>
#include <stdlib.h>
int RunTest(){
	int place = 0;
	int BUF_SIZE = 80;
	char buf[BUF_SIZE]; /* Input buffer */
	const int fd = 4;
	fputs ("Started Dispatcher waiting input\n", stderr);
	FILE *fp;
	fp = fopen("/Users/dupper/Desktop/dupTestCode/in.txt", "rt"); /* Make fd into FILE* for reading */
		 fputs("Found the file descriptor\n", stderr);
	if (fp == NULL) {
				fprintf(stderr,"BAD FILE DESCRIPTOR %d TO CONFIG\n", fd);
		 		return EXIT_FAILURE;
	 }
	while(fgets(buf, 80, fp) != NULL)
	 {
		fprintf(stderr, "READING FILE\n");
		 /* get a line, up to 80 chars from fr.  done if NULL */
		 sscanf (buf, "%d", &place);
		 fprintf(stderr,"%d:Convert place number from string to int\n", place);
		 /* convert the string to a long int */
		 fprintf (stderr, "%d,%d\n", place,place);
	 }



	fprintf(stderr,"%d:Read config file\n", place);
	fclose(fp);
	int resultWrite =-1;
	int resultRead =-1;
	if(place==1){
		resultWrite =WriteMsg("Hello world\n", place);
	}else{
		resultRead = ReadMsg(place);
	}
if((resultRead == -1 && resultWrite== EXIT_SUCCESS) || (resultWrite == -1 && resultRead== EXIT_SUCCESS)){
	fprintf(stderr,"%d:Success\n", place);
	return EXIT_SUCCESS;
}else{
	fprintf(stderr,"%d:Failure\n", place);
	return EXIT_FAILURE;
}


}
