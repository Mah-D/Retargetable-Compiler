/**************************************************************************************
 * resize.c
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
#include <math.h>
#include <assert.h>
#include <sys/resource.h>

#include "dupio.h"
#include "jpg.h"
#include <pthread.h>
#include <semaphore.h>
#include "resize.h"


#define MAX_JPG_SIZE (1024*200)
#define MAX_RESIZE_THREADS (8)

workBox boxes[MAX_RESIZE_THREADS];

void imgResize(char *image, int height, int width, char *newImg, int newHeight, int newWidth){
	float heightFactor = (float) newHeight / ((float) height);
	float widthFactor = (float) newWidth / ((float) width);
	//fprintf(stderr, "h: %f w: %f\n", heightFactor, widthFactor);
	float value, a, b, t, u, xc, yc;
	int x, y, z, m, n, ox, oy, nx, ny;
	
	for(y = 0; y < newHeight; y++){
		for(x = 0; x < newWidth; x++){
			for(z = 0; z < 3; z++){
				value = 0;
				a = x/widthFactor;
				b = y/heightFactor;
				if(!((a <= width || a >= 0) && (b <= heightFactor || b >= 0))){
					fprintf(stderr, "width: %d %f\n height: %d %f\n", width, a, height, b);
					//exit(1);
				}
				ox = (int)a;
				oy = (int)b;
				for(m = -1; m < 3; m++){
					for(n = -1; n < 3; n++){
						nx = ox + m;
						ny = oy + n;
						t = fabs(nx - a);
						u = fabs(ny - b);
						xc = t<1 ? (1 - 2*powf(t, 2) + powf(t, 3)) : (4 - 8*t + 5*powf(t,2) - powf(t,3));
						yc = u<1 ? (1 - 2*powf(u, 2) + powf(u, 3)) : (4 - 8*u + 5*powf(u,2) - powf(u,3));
						if(ny < 0) ny = 0;
						if(nx < 0) nx = 0;
						if(ny > height) ny = height;
						if(nx > width) nx = width;
						value += xc*yc*image[ny*width*3 + nx*3 + z];
					}
				}
				newImg[y*newWidth*3 + x*3 + z] = ((int)value);
			}
		}
	}
}

void * slow_threading(void *argv){
	struct workBox *arg = (struct workBox *)argv;

	while(1){
		sem_wait(&arg->oldRead);
		sem_wait(&arg->newWrite);
		//pthread_setcancelstate(PTHREAD_CANCEL_DISABLE, NULL);

		pthread_setcancelstate(PTHREAD_CANCEL_DISABLE, NULL);

	
		imgResize(arg->oldImage, arg->oldHeight, arg->oldWidth,
							arg->newImage, arg->newHeight, arg->newWidth);

		pthread_setcancelstate(PTHREAD_CANCEL_ENABLE, NULL);
		sem_post(&arg->oldWrite);
		sem_post(&arg->newRead);
		//pthread_setcancelstate(PTHREAD_CANCEL_ENABLE, NULL);
	} //end of while
}

int get_cpu_time () {
 struct rusage time_buf;
 getrusage(RUSAGE_SELF, &time_buf);

 return (time_buf.ru_utime.tv_sec * 1000L + time_buf.ru_utime.tv_usec / 1000L);
}

void * write_thread(){
	int i = 0;
	int piclength;
	while(1){
		pthread_testcancel();
		sem_wait(&boxes[i].newRead);
		pthread_setcancelstate(PTHREAD_CANCEL_DISABLE, NULL);
		char *jpgBuff = (char *) compressJpeg(100, boxes[i].newWidth, boxes[i].newHeight, (unsigned char *) boxes[i].newImage, &piclength);
		sem_post(&boxes[i].newWrite);
		write_all(1, jpgBuff, piclength);
		free(jpgBuff);
		pthread_setcancelstate(PTHREAD_CANCEL_ENABLE, NULL);
		i = (i+1) % MAX_RESIZE_THREADS;
	}
}

void init_boxes(workBox *boxes, int num, int newWidth, int newHeight, int oldWidth, int oldHeight){
	int i;
	for(i = 0; i < num; i++){
		boxes[i].oldHeight = oldHeight;
		boxes[i].oldWidth = oldWidth;
		boxes[i].newHeight = newHeight;
		boxes[i].newWidth = newWidth;

		boxes[i].oldImage = (char *)malloc(oldHeight*oldWidth*3);

		boxes[i].newImage = (char *)malloc(newHeight*newWidth*3);

		sem_init(&boxes[i].newRead, 0, 0);
		sem_init(&boxes[i].oldRead, 0, 0);
		sem_init(&boxes[i].newWrite, 0, 1);
		sem_init(&boxes[i].oldWrite, 0, 1);

		if(pthread_create(&boxes[i].thread, NULL, slow_threading, &boxes[i]) != 0){
			fprintf(stderr, "pthread_create %d failed.", i);
			exit(1);
		}
	}
}

void destroy_boxes(workBox *boxes, int num){
	int i;
	for(i = 0; i < num; i++){
		pthread_cancel(boxes[i].thread);
		pthread_join(boxes[i].thread, NULL);

		free(boxes[i].newImage);
		free(boxes[i].oldImage);

		sem_destroy(&boxes[i].newRead);
		sem_destroy(&boxes[i].newWrite);
		sem_destroy(&boxes[i].oldRead);
		sem_destroy(&boxes[i].oldWrite);
	}
}

int main(int argc, char **argv){
	if(argc != 3){
		fprintf(stderr, "Usage: resize <width in pixels> <height in pixels>\n");
		exit(0);
	}

	int newWidth = atoi(argv[1]);
	int newHeight = atoi(argv[2]);
	init_boxes(boxes, MAX_RESIZE_THREADS, newWidth, newHeight, 320, 240);

	pthread_t wpthread;
	assert(pthread_create(&wpthread, NULL, write_thread, NULL) == 0);

	struct JpgBuff jbuf;

	jbuf.buf = (char *) malloc(MAX_JPG_SIZE);
	int piclenght;
	if(jbuf.buf == NULL){
		fprintf(stderr, "memory error: Could not allocate space for displayJpg");
		exit(1);
	}
	jbuf.bufflength = MAX_JPG_SIZE;
	jbuf.offset = 0;
	jbuf.complete = 0;

	int done = 0;
//	while(!done){
	while(1){
		//Read jpg
		read_jpg(0, &jbuf, 0);
		if(jbuf.complete > 0){
			sem_wait(&boxes[done % MAX_RESIZE_THREADS].oldWrite);
			sdup_decompressJpeg((unsigned char *)jbuf.jpg, jbuf.jpglength,
					&(boxes[done % MAX_RESIZE_THREADS].oldWidth),
					&(boxes[done % MAX_RESIZE_THREADS].oldHeight), &piclenght,
					&boxes[done % MAX_RESIZE_THREADS]);
			sem_post(&boxes[done % MAX_RESIZE_THREADS].oldRead);

			jbuf.complete = 0;
			done++;
//			fprintf(stderr, "%d\n", done);
		}
		if(jbuf.complete < 0){
			//sleep(1); //there has to be a better way...
			pthread_cancel(wpthread);
			pthread_join(wpthread, NULL);
			destroy_boxes(boxes, MAX_RESIZE_THREADS);
			//sleep(1); //there has to be a better way...
			free(jbuf.buf);
			free(jbuf.jpg);
			exit(0);
		}
	}
	//destroy_boxes(boxes, MAX_RESIZE_THREADS);
	free(jbuf.buf);
	free(jbuf.jpg);
	return(0);
}
