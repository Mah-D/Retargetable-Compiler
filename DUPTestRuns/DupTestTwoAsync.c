/*
 ============================================================================
 Name        : DupTestTwoAsync.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>



int main(void) {
	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */

	int fd = 6;
	int BUF_SIZE = 1024;
	int buf[BUF_SIZE]; /* Input buffer */

	/* Input buffer */
	FILE *fp;
	 fp = fdopen(fd, "r"); /* Make fd into FILE* for reading */
	fgets(buf, BUF_SIZE, fp); /* Read a line of max size
	BUF_SIZE bytes into the buffer */
	 	 if (!fp) {
	 		 printf("%d\n", "00000");
	 		 return 1;
	 	 }
	 	 int i = 0;
	       while (fscanf(fp, "%d", &(buf[i])) > 0)
	       {

	               printf("%d\n", buf[i]);
	               i++;
	       }


	 printf("%d\n", i);
	 puts ("END");
	 fclose(fp);
	return EXIT_SUCCESS;




}
