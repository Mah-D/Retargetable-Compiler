/**************************************************************************************
 * dupplay.c
 *
 * January 20, 2009
 **************************************************************************************/


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <SDL/SDL.h>
#include <sys/select.h>
#include <sys/time.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>
#include <stdarg.h>

#include "siva.h"
#include "jpg.h"
#include "dupio.h"
#include <unistd.h>

#define MAX_JPG_SIZE (1024*200)
static void sdlShowRgb(SDL_Surface *screen, unsigned char *rgb, int width, int height);
static void sdlShowJpg(SDL_Surface *screen, unsigned char *jpg, int jpgLen);


//int main(int argc, char **argv){
int main(){
sleep(3);
	unsigned int framecount;
	unsigned long long temporary;
  struct JpgBuff jbuf;
  SDL_Surface *screen;
  struct timeval start;

  jbuf.buf = (char *) malloc(MAX_JPG_SIZE);
  if(jbuf.buf == NULL){
    fprintf(stderr, "memory error: Could not allocate space for displayJpg");
    exit(1);
  }
  jbuf.bufflength = MAX_JPG_SIZE;
  jbuf.offset = 0;
  jbuf.complete = 0;

  if (SDL_Init(SDL_INIT_VIDEO) == -1) {
      fprintf(stderr, "SDL Init error: %s\n", SDL_GetError());
      exit(1);
  }
  atexit(SDL_Quit);
  screen = SDL_SetVideoMode(640,480,24,SDL_SWSURFACE);
  if (!screen) {
      fprintf(stderr, "Can't set the video mode: %s\n", SDL_GetError());
      exit(1);
  }

  framecount = 0;
  while(1){
    //Read jpg
    read_jpg(0, &jbuf, 1);

    if(jbuf.complete > 0){
//    write_all(displayJpg, displayJpgLen);
    //Update Screen
    	if(gettimeofday(&start, NULL) == -1){
			  fprintf(stderr, "gettimeofday error: %s\n", strerror(errno));
			  exit(1);
    	}
		  temporary = ((unsigned long long)start.tv_sec) * 1000000 + ((unsigned long long)start.tv_usec);
      fprintf(stderr, "%u\t%llu\n", framecount, temporary);
      framecount++;
      sdlShowJpg(screen, (unsigned char *) jbuf.jpg, jbuf.jpglength);
      free(jbuf.jpg);
      jbuf.complete = 0;
    }
    if(jbuf.complete < 0)
    	{
				fprintf(stderr, "received jbuf.complete (%d): exiting!", jbuf.complete);
				exit(0);
    	}
  }
  free(jbuf.buf);
  return(0);
}

static void sdlShowRgb(SDL_Surface *screen, unsigned char *rgb, int width, int height){
    int y, x;
    unsigned char *s = screen->pixels;
    unsigned char *frame = rgb;
    int xoff, yoff;

    xoff = ((640/2)-(width/2))*3;
    yoff = ((480/2)-(height/2))*3;
    s += yoff*640;
    for (y = 0; y < height; y++) {
        s += xoff;
        for (x = 0; x < width; x++) {
            s[0] = frame[2];
            s[1] = frame[1];
            s[2] = frame[0];
            frame += 3;
            s += 3;
        }
        s += xoff;
    }
    SDL_UpdateRect(screen, 0, 0, 639, 479);
}

static void sdlShowJpg(SDL_Surface *screen, unsigned char *jpg, int jpgLen){
    unsigned char *rgb;
    int rgbWidth, rgbHeight, rgbLen;

    rgb = decompressJpeg(jpg, jpgLen, &rgbWidth,
            &rgbHeight, &rgbLen);
    if (rgb == NULL) return;
    sdlShowRgb(screen, rgb, rgbWidth, rgbHeight);
    free(rgb);
}
