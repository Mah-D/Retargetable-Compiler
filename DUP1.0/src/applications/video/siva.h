/* Header file for siva.c
 * Copyright (C) 2006 Salvatore Sanfilippo <antirez@invece.org>
 */

#ifndef __SIVA_H__
#define __SIVA_H__

#include <sys/types.h>
#include <linux/types.h>
#include <linux/videodev.h>

#define SIVA_OK 0
#define SIVA_ERR 1
#define SIVA_MAX_ERR 1024

/* ------------------------------ data structures --------------------------- */
struct sivaSource {
    int fd;         /* v4l device fd */
    int width;      /* current width in pixels */
    int height;     /* current height in pixels */
    int bpp;        /* bit per pixel */
    struct video_capability vcap;
    struct video_picture vpic;
    struct video_window vwin;
    char *err;
    unsigned char *fb; /* the frame buffer, always in 24bit rgb */
    unsigned char *raw; /* the raw image, as read from the v4l device.
                           note that the 'raw' pointer may just be null
                           of the v4l device already outputs 24bit rgb
                           images, so the lib users should never access
                           this field directly (nor any other filed of
                           the structure). */
};

/* ------------------------ exported functions prototypes  ------------------ */
int sivaOpen(struct sivaSource *s, char *dev);
int sivaSetRes(struct sivaSource *s, unsigned int width, unsigned int height);
char *sivaGetError(struct sivaSource *source);
void sivaPrintDeviceInfo(struct sivaSource *s);
void sivaClose(struct sivaSource *s);
int sivaCapture(struct sivaSource *s);
void sivaApplyFilterGrayScale(struct sivaSource *s);
int sivaSetBrightness(struct sivaSource *s, int brightness);
int sivaSizeInfo(char *name, int *widthPtr, int *heightPtr);
int sivaGetFd(struct sivaSource *s);

#endif /* __SIVA_H__ */
