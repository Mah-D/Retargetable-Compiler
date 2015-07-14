/**************************************************************************************
 * dupplay.c
 *
 * January 20, 2009
 **************************************************************************************/


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <sys/select.h>
#include <sys/time.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>
#include <stdarg.h>

#include "dupio.h"

#define MAX_JPG_SIZE (1024*200)

//int main(int argc, char **argv){
int main(){
  struct JpgBuff jbuf;

  jbuf.buf = (char *) malloc(MAX_JPG_SIZE);
  if(jbuf.buf == NULL){
    fprintf(stderr, "memory error: Could not allocate space for displayJpg");
    exit(1);
  }
  jbuf.bufflength = MAX_JPG_SIZE;
  jbuf.offset = 0;
  jbuf.complete = 0;
  struct timeval t;

  while(1){
    t.tv_sec = 0;
    t.tv_usec = 100000;
    //Read jpg
    read_jpg(0, &jbuf, 0);
    if(jbuf.complete > 0){
      select(0, NULL, NULL, NULL, &t); 
      write_all(1, jbuf.jpg, jbuf.jpglength);
      free(jbuf.jpg);
      jbuf.complete = 0;
    }
    if(jbuf.complete < 0) exit(0);
  }
  free(jbuf.buf);
  return(0);
}
