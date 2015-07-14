/***********************************************************************************
 * dupio.c
 * All the functions that are used for reading and writing 
 * in Craig Ritzdorf's videa confrencing filters for dup.
 *
 * January 29, 2009
 ***********************************************************************************/

#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <sys/resource.h>
#include <sys/select.h>
#include <fcntl.h>
#include <errno.h>
#include <stdlib.h>
#include <unistd.h>
#include "dupio.h"

static int get_cpu_time (){
 struct rusage time_buf;
 getrusage(RUSAGE_SELF, &time_buf);
 return (time_buf.ru_utime.tv_sec * 1000L + time_buf.ru_utime.tv_usec / 1000L);
}

int write_all(int fd, const char* buf, size_t size){
  //fprintf(stderr, "writing %d bytes\n", size);
  int start = get_cpu_time();
  size_t pos = 0;
  ssize_t out_size;

  while (pos < size)
    {
      out_size = write(fd, &buf[pos], size-pos);  
      if (out_size < 0)
	{
	  fprintf(stderr, "write error (%s)\n", strerror(errno));
	  exit(1);
	}
      else if (out_size == 0){
	//if (sole) output stream  is closed, we're done 
	exit(0);
      }
      pos += out_size;
    }
  return get_cpu_time()-start;
}

int read_all(int fd, char* buf, size_t size){
  int start = get_cpu_time();
  size_t pos = 0;
  ssize_t in_size;

  while(pos < size){
    in_size = read(fd, &buf[pos], size-pos);
    if(in_size < 0){
      fprintf(stderr, "read error (%s) \n", strerror(errno));
      exit(1);
    }
    else if(in_size == 0){
      fprintf(stderr, "EOF\n");
      exit(0);
    }
    pos += in_size;
  }
  return get_cpu_time()-start;
}


void read_jpg(int fd, struct JpgBuff *jbuf, short recent){
  if(jbuf->offset == jbuf->bufflength){
    fprintf(stderr, "read error: JpgBuff is full!\n");
    exit(1);
  }
  char jpgStart[2], jpgEnd[2];
  jpgStart[0] = jpgEnd[0] = 0xff;
  jpgStart[1] = 0xd8;
  jpgEnd[1] = 0xd9;
  char *next = jbuf->buf;

  int in_size = read(fd, jbuf->buf+jbuf->offset, jbuf->bufflength - jbuf->offset);
  if(in_size == 0){
    jbuf->complete = -1;
    return;
  }
  jbuf->offset += in_size;
  //Look for the jpgEnd word.

  while(in_size > 0){
    next = memchr(next, jpgEnd[0], in_size);
    if(next == NULL || next - jbuf->buf == jbuf->bufflength-1) return;
    if(memcmp(next, &jpgEnd, 2)==0){
      if(jbuf->complete > 0) free(jbuf->jpg);
      next = next+2;
      jbuf->jpglength = next-jbuf->buf;
      jbuf->jpg = (char *) malloc(jbuf->jpglength);
      memcpy(jbuf->jpg, jbuf->buf, jbuf->jpglength);
      if(memcmp(jbuf->jpg, &jpgStart, 2)){
        fprintf(stderr, "read error: This ant no jpg! %x %x\n", jpgStart[0], jpgStart[1]);
        exit(1);
      }
      jbuf->offset -= jbuf->jpglength;
      memmove(jbuf->buf, next, jbuf->offset);
      jbuf->complete += 1;
      if(recent == 0){
//fprintf(stderr, "not skipping...");
        return;
      }
//fprintf(stderr, "could be skipping...\n");
      next = jbuf->buf;
      in_size = jbuf->offset;
      continue;
    }
    next++;
    in_size = jbuf->offset-(next-jbuf->buf);
  }
}

int get_fd(int fd) {
  int flags;

  errno = 0;
  flags = fcntl(fd, F_GETFD);
  if (flags == -1 && errno) {
      if (errno != EBADF) {
          perror("fcntl(F_GETFD)");
          fprintf(stdout,"Error something!\n");
          return -1;
      }
  }
  if (flags & FD_CLOEXEC) {
      return 0;
  }
  else
    return 1;
}

int get_fd_list(int lowfd, int *list, fd_set *fds) {
	struct rlimit rl;
	unsigned int i;
	int count = 0;

	getrlimit(RLIMIT_NOFILE, &rl);
//fprintf(stdout,"Low fd is: %u\nCur fd max (soft limit) is %u\nMax fd is:%u\n",lowfd,rl.rlim_cur,rl.rlim_max);
	for (i = lowfd; i < rl.rlim_cur; i++) {
		if (get_fd(i) == 1) {
			list[count] = i;
			count++;
			if(fds != NULL) FD_SET(i, fds);
		//fprintf(stdout,"%d is a valid open file descriptor (i think!)\n",i);
		}
	}
	return count;
}
