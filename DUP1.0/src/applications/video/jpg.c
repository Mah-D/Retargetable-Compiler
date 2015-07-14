/* jpg.c - Jpeg in-memory compression/decompression utility.
 * Copyright (C) 2006 Salvatore Sanfilippo <antirez@invece.org>
 *
 * This file implements rgb->jpeg and jpeg->rgb conversion.
 * All the conversion happens in memory without to write jpeg impages
 * into files. In order to do so some simple memory-based
 * source and destination modules for the libjpeg are implemented.
 *
 * This part of tcpcam can be reused for many other purposes, and
 * is released under the terms of the GPL license version 2. */

#include <stdio.h>
#include <stdlib.h>
#include <setjmp.h>
#include <jpeglib.h>
#include <jerror.h>
#include <string.h>
#include "resize.h"
#include "curesize.h"

struct jpegDestBuf {
    unsigned char *buf;
    int len;
    int used;
};

typedef struct {
    struct jpeg_destination_mgr pub; /* public fields */
    struct jpegDestBuf *destBuf;
} mem_destination_mgr;

#define OUTPUT_BUF_SIZE 4096

METHODDEF(void)
init_destination(j_compress_ptr cinfo)
{
    mem_destination_mgr *dest = (mem_destination_mgr*) cinfo->dest;
    /* Allocate the initial buffer size */
    dest->destBuf->buf = malloc(OUTPUT_BUF_SIZE);
    if (dest->destBuf->buf == NULL) {
        ERREXIT(cinfo, JERR_FILE_WRITE);
    }
    dest->destBuf->len = OUTPUT_BUF_SIZE;
    dest->pub.next_output_byte = dest->destBuf->buf;
    dest->pub.free_in_buffer = OUTPUT_BUF_SIZE;
}

METHODDEF(boolean)
empty_output_buffer(j_compress_ptr cinfo)
{
    mem_destination_mgr *dest = (mem_destination_mgr*) cinfo->dest;
    dest->destBuf->buf = realloc(dest->destBuf->buf,
            dest->destBuf->len+OUTPUT_BUF_SIZE);
    if (dest->destBuf->buf == NULL) {
        ERREXIT(cinfo, JERR_FILE_WRITE);
    }
    dest->pub.next_output_byte = dest->destBuf->buf + dest->destBuf->len;
    dest->pub.free_in_buffer = OUTPUT_BUF_SIZE;
    dest->destBuf->len += OUTPUT_BUF_SIZE;
    return TRUE;
}

METHODDEF(void)
term_destination(j_compress_ptr cinfo)
{
    mem_destination_mgr *dest = (mem_destination_mgr*) cinfo->dest;
    size_t datacount = OUTPUT_BUF_SIZE - dest->pub.free_in_buffer;
    dest->destBuf->used = dest->destBuf->len - (4096 - datacount);
}

void jpeg_membuf_dest(j_compress_ptr cinfo, struct jpegDestBuf *destBuf)
{
    mem_destination_mgr *dest;
    if (cinfo->dest == NULL) {
        cinfo->dest = (struct jpeg_destination_mgr *)
            (*cinfo->mem->alloc_small) ((j_common_ptr) cinfo, JPOOL_PERMANENT,
                                sizeof(mem_destination_mgr));
    }
    dest = (mem_destination_mgr*) cinfo->dest;
    dest->pub.init_destination = init_destination;
    dest->pub.empty_output_buffer = empty_output_buffer;
    dest->pub.term_destination = term_destination;
    dest->destBuf = destBuf;
}

/* Compress an RGB image into a JPEG file in memory.
 * On error NULL is returned, otherwise the malloc-ed JPEG image.
 * On success *lenPtr is set to the length of the data contained
 * in the returned pointer. */
unsigned char *compressJpeg (int quality, int width, int height,
        unsigned char *image, int *lenPtr)
{
    JSAMPLE * image_buffer = (JSAMPLE *) image;
    struct jpeg_compress_struct cinfo;
    struct jpeg_error_mgr jerr;
    /* More stuff */
    JSAMPROW row_pointer[1];      /* pointer to JSAMPLE row[s] */
    int row_stride;               /* physical row width in image buffer */
    struct jpegDestBuf destBuf;

    cinfo.err = jpeg_std_error(&jerr);
    jpeg_create_compress(&cinfo);

    jpeg_membuf_dest(&cinfo, &destBuf);

    cinfo.image_width = width;
    cinfo.image_height = height;
    cinfo.input_components = 3;
    cinfo.in_color_space = JCS_RGB;
    jpeg_set_defaults(&cinfo);
    cinfo.optimize_coding = TRUE;
    jpeg_set_quality(&cinfo, quality, TRUE /* limit to baseline-JPEG values */);

    jpeg_start_compress(&cinfo, TRUE);
    row_stride = width * 3; /* JSAMPLEs per row in image_buffer */

    while (cinfo.next_scanline < cinfo.image_height) {
        /* jpeg_write_scanlines expects an array of pointers to scanlines.
         * Here the array is only one element long, but you could pass
         * more than one scanline at a time if that's more convenient.
         */
        row_pointer[0] = & image_buffer[cinfo.next_scanline * row_stride];
        (void) jpeg_write_scanlines(&cinfo, row_pointer, 1);
    }

    jpeg_finish_compress(&cinfo);
    jpeg_destroy_compress(&cinfo);

    *lenPtr = destBuf.used;
    return destBuf.buf;
}

typedef struct {
    struct jpeg_source_mgr pub;   /* public fields */
    unsigned char *buf;
    int len;
} mem_source_mgr;

METHODDEF(void)
init_source (j_decompress_ptr cinfo)
{
    ((void) cinfo);
    /* nothing to do */
}

METHODDEF(boolean)
fill_input_buffer (j_decompress_ptr cinfo)
{
    mem_source_mgr *src = (mem_source_mgr*) cinfo->src;

    src->pub.next_input_byte = src->buf;
    src->pub.bytes_in_buffer = src->len;
    return TRUE;
}

METHODDEF(void)
skip_input_data (j_decompress_ptr cinfo, long num_bytes)
{
    mem_source_mgr *src = (mem_source_mgr*) cinfo->src;

    if (num_bytes > (long)src->pub.bytes_in_buffer) {
        return; /* fatal error, as our buffer is the whole image. */
    }
    src->pub.next_input_byte += (size_t) num_bytes;
    src->pub.bytes_in_buffer -= (size_t) num_bytes;
}

METHODDEF(void)
term_source (j_decompress_ptr cinfo)
{
    ((void) cinfo);
    /* nothing to do */
}

GLOBAL(void)
jpeg_membuf_src (j_decompress_ptr cinfo, unsigned char *jpgData, int dataLen)
{
    mem_source_mgr *src;

    if (cinfo->src == NULL) {
        cinfo->src = (struct jpeg_source_mgr *)
            (*cinfo->mem->alloc_small) ((j_common_ptr) cinfo, JPOOL_PERMANENT,
                                         sizeof(mem_source_mgr));
    }
    src = (mem_source_mgr*) cinfo->src;
    src->buf = jpgData;
    src->len = dataLen;
    src->pub.init_source = init_source;
    src->pub.fill_input_buffer = fill_input_buffer;
    src->pub.skip_input_data = skip_input_data;
    src->pub.resync_to_restart = jpeg_resync_to_restart; /* default method */
    src->pub.term_source = term_source;
    src->pub.bytes_in_buffer = 0;
    src->pub.next_input_byte = NULL;
}

/* Decompress the JPEG image storted starting from 'jpg', of 'jpgLen'
 * bytes, into a memory buffer. The resulting dynamically allocated RGB
 * image buffer pointer is returned on success. On error NULL is returned.
 *
 * Information about image width, heigth and length are provided
 * by reference via widthPtr, heightPtr, and lenPtr arguments. */
unsigned char *decompressJpeg(unsigned char *jpg, int jpgLen,
        int *widthPtr, int *heightPtr, int *lenPtr)
{
    struct jpeg_decompress_struct cinfo;
    /* More stuff */
    JSAMPARRAY buffer;            /* Output row buffer */
    int row_stride;               /* physical row width in output buffer */
    unsigned char *rgb, *ptr;
    struct jpeg_error_mgr jerr;

    cinfo.err = jpeg_std_error(&jerr);
    jpeg_create_decompress(&cinfo);
    jpeg_membuf_src(&cinfo, jpg, jpgLen);
    jpeg_read_header(&cinfo, TRUE);
    jpeg_start_decompress(&cinfo);

    row_stride = cinfo.output_width * cinfo.output_components;
    buffer = (*cinfo.mem->alloc_sarray)
            ((j_common_ptr) &cinfo, JPOOL_IMAGE, row_stride, 1);

    *widthPtr = cinfo.output_width;
    *heightPtr = cinfo.output_height;
    *lenPtr = cinfo.output_components * cinfo.output_width *
        cinfo.output_height;
    ptr = rgb = malloc(*lenPtr);
    if (ptr == NULL) {
        jpeg_destroy_decompress(&cinfo);
        return NULL;
    }

    while (cinfo.output_scanline < cinfo.output_height) {
        jpeg_read_scanlines(&cinfo, buffer, 1);
        memcpy(ptr, buffer[0], row_stride); ptr += row_stride;
    }

    jpeg_finish_decompress(&cinfo);
    jpeg_destroy_decompress(&cinfo);
    return rgb;
}

/* Decompress the JPEG image storted starting from 'jpg', of 'jpgLen'
 * bytes, into a memory buffer. The resulting dynamically allocated RGB
 * image buffer pointer is returned on success. On error NULL is returned.
 *
 * Information about image width, heigth and length are provided
 * by reference via widthPtr, heightPtr, and lenPtr arguments. */

int sdup_decompressJpeg(unsigned char *jpg, int jpgLen,
        int *widthPtr, int *heightPtr, int *lenPtr,
				workBox *box)
{
    struct jpeg_decompress_struct cinfo;
    /* More stuff */
    JSAMPARRAY buffer;            /* Output row buffer */
    int row_stride;               /* physical row width in output buffer */
    char *ptr;
    struct jpeg_error_mgr jerr;

    cinfo.err = jpeg_std_error(&jerr);
    jpeg_create_decompress(&cinfo);
    jpeg_membuf_src(&cinfo, jpg, jpgLen);
    jpeg_read_header(&cinfo, TRUE);
    jpeg_start_decompress(&cinfo);

    row_stride = cinfo.output_width * cinfo.output_components;
    buffer = (*cinfo.mem->alloc_sarray)
            ((j_common_ptr) &cinfo, JPOOL_IMAGE, row_stride, 1);

    *widthPtr = cinfo.output_width;
    *heightPtr = cinfo.output_height;
    *lenPtr = cinfo.output_components * cinfo.output_width *
        cinfo.output_height;
		if (cinfo.output_width != (unsigned int) box->oldWidth  || cinfo.output_height != (unsigned int) box->oldHeight){
			free(box->oldImage);
			box->oldImage = (char *)malloc(cinfo.output_width*cinfo.output_height*3);
			box->oldWidth = (int)cinfo.output_width;
			box->oldHeight = (int)cinfo.output_height;
		}
		ptr = box->oldImage;
    if (ptr == NULL) {
        jpeg_destroy_decompress(&cinfo);
        return 1;
    }

    while (cinfo.output_scanline < cinfo.output_height) {
        jpeg_read_scanlines(&cinfo, buffer, 1);
        memcpy(ptr, buffer[0], row_stride); ptr += row_stride;
    }

    jpeg_finish_decompress(&cinfo);
    jpeg_destroy_decompress(&cinfo);
    return 0;
}
