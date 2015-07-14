/* Header file for jpg.c
 * Copyright (C) 2005 Salvatore Sanfilippo <antirez@invece.org>
 */
#include "resize.h"

#ifndef __JPG_H__
#define __JPG_H__

void writeJpegFile(char *filename, int quality,
        int width, int height, unsigned char *image);
unsigned char *compressJpeg (int quality, int width, int height,
        unsigned char *image, int *lenPtr);
unsigned char *decompressJpeg(unsigned char *jpg, int jpgLen,
        int *widthPtr, int *heightPtr, int *lenPtr);
int sdup_decompressJpeg(unsigned char *jpg, int jpgLen,
        int *widthPtr, int *heightPtr, int *lenPtr,
				workBox *box);


#endif /* __JPG_H__ */
