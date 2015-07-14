/* TCPCam - a Single-Tcp-Port/Jpeg/Speex Based video-chat program for Linux.
 * Copyright (C) 2006 Salvatore Sanfilippo <antirez@invece.org>
 *
 * This software is released under the terms of the GPL license version 2.
 * See the COPYING file for more information. */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <sys/select.h>
#include <sys/time.h>
#include <sys/types.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>
//#include <stdarg.h>

#include "siva.h"
#include "jpg.h"
#include "dupio.h"


static int max(int a, int b) {
    return (a > b) ? a : b;
}

/* Subtract the `struct timeval' values X and Y,
   storing the result in RESULT.
   Return 1 if the difference is negative, otherwise 0.  */

static int timeval_subtract (struct timeval *result, struct timeval *x, struct timeval *y){
  /* Perform the carry for the later subtraction by updating y. */
  if (x->tv_usec < y->tv_usec) {
    int nsec = (y->tv_usec - x->tv_usec) / 1000000 + 1;
    y->tv_usec -= 1000000 * nsec;
    y->tv_sec += nsec;
  }
  if (x->tv_usec - y->tv_usec > 1000000) {
    int nsec = (y->tv_usec - x->tv_usec) / 1000000;
    y->tv_usec += 1000000 * nsec;
    y->tv_sec -= nsec;
  }

  /* Compute the time remaining to wait.
     tv_usec is certainly positive. */
  result->tv_sec = x->tv_sec - y->tv_sec;
  result->tv_usec = x->tv_usec - y->tv_usec;

  /* Return 1 if result is negative. */
  return x->tv_sec < y->tv_sec;
}


//int main(int argc, char **argv)
int main(){

    /* Default configuration */
    int debug = 0;
    char *v4lDevice = "/dev/video0";
    int bw = 0;
    int jpgCompr = 50;
    int brightness = 32768;
    int width, height, localJpgLen;
    sivaSizeInfo("sif", &width, &height);
    /* Other state that need initialization. */
    unsigned char *localJpg = NULL;
    int jpgSent = 1;
    struct sivaSource s;

    /* Open and configure the specified v4l device */
    if (debug) fprintf(stderr, "Opening camera...\n");
    if (sivaOpen(&s, v4lDevice) != SIVA_OK) {
        fprintf(stderr, "Opening v4l device '%s': %s\n", v4lDevice,
                sivaGetError(&s));
        exit(1);
    }
    if (debug)
        sivaPrintDeviceInfo(&s);
    if (sivaSetRes(&s, width, height) != SIVA_OK) {
        fprintf(stderr, "Setting v4l source resolution: %s\n",
                sivaGetError(&s));
        exit(1);
    }
    sivaSetBrightness(&s, brightness);

    /* Finally enter the main loop, where cam,net,keyboard are monitored. */
    int camfd = sivaGetFd(&s);
    unsigned int framecount;
    struct timeval start;
    struct timeval end;
    struct timeval diff;
    unsigned long long temporary;
    diff.tv_usec = 0;
    diff.tv_sec = 0;
    start.tv_usec = 0;
    start.tv_sec = 0;
    end.tv_usec = 0;
    end.tv_sec = 0;
    framecount = 0;
    while(1){
        fd_set rfds, wfds;
        struct timeval tv;
        int retval, maxfd = 0;

        FD_ZERO(&rfds);
        FD_ZERO(&wfds);

        FD_SET(STDOUT_FILENO, &wfds);
        if (camfd != -1) {
            FD_SET(camfd, &rfds);
            maxfd = max(maxfd, camfd);
        }

        tv.tv_sec = 0;
        tv.tv_usec = 10000;

        retval = select(maxfd+1, &rfds, &wfds, NULL, &tv);
        if (retval == -1 && errno != EINTR) {
            fprintf(stderr, "select(2) error: %s\n", strerror(errno));
            exit(1);
        }
        if (retval == 0)
            continue;

        /* Get input from the webcam. */
//	fprintf(stderr, "Getting frame...\n");
        if (camfd != -1 && FD_ISSET(camfd, &rfds)) {
            if (sivaCapture(&s) == SIVA_ERR) {
                fprintf(stderr, "Capture: %s\n", sivaGetError(&s));
            }
            if (bw) sivaApplyFilterGrayScale(&s);

            free(localJpg);
            localJpg = compressJpeg(jpgCompr, width,
                    height, s.fb, &localJpgLen);
            jpgSent = 0;
            if (debug)
                fprintf(stderr, "Jpeg compressed, size: %d\n",
                        localJpgLen);
        }

//	fprintf(stderr, "Sending frame...\n");
         if(FD_ISSET(STDOUT_FILENO, &wfds) && !jpgSent){
             if(gettimeofday(&start, NULL) == -1){
                 fprintf(stderr, "gettimeofday error: %s\n", strerror(errno));
                 exit(1);
             }

						 temporary = ((unsigned long long)start.tv_sec) * 1000000 + ((unsigned long long)start.tv_usec);
             fprintf(stderr, "%u\t%llu\n", framecount, temporary);
             write_all(1, (char *)localJpg, localJpgLen);

             framecount++;
             if(gettimeofday(&end, NULL) == -1){
                 fprintf(stderr, "gettimeofday error: %s\n", strerror(errno));
                 exit(1);
             }
             if(timeval_subtract(&diff, &end, &start)){
            	 fprintf(stderr, "time_subtract is negative!\n");
                //exit(1);
             }
             //fprintf(stderr, "sec: %d\n", jpgCompr);
             if(diff.tv_usec > 50000 || diff.tv_sec > 0) jpgCompr /= 2;
             if(diff.tv_usec < 20000 && diff.tv_sec == 0 && jpgCompr < 100) jpgCompr++;
             jpgSent = 1;
         }
    }
    sivaClose(&s);
    /* Free allocated memory. Not needed in theory because we
     * are exiting the program, but in pratice makes simpler to
     * use 'valgrind' to check for memory leaks. */
    free(localJpg);
    return 0;
}

