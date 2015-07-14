#include <pthread.h>
#include <semaphore.h>

#ifndef __DUP_RESIZE_H__
#define __DUP_RESIZE_H__
struct workBox {
	char *oldImage;
	char *newImage;
//	int num; //debugging coolness
	int oldHeight;
	int oldWidth;
	int newHeight;
	int newWidth;
	pthread_t thread;
	sem_t newRead;
	sem_t newWrite;
	sem_t oldRead;
	sem_t oldWrite;
};
typedef struct workBox workBox;

struct resizeThread {
	struct workBox *info;
	struct resizeThread *next;
	pthread_t thread;
};

#endif
