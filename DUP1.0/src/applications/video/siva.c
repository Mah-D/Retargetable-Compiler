/* SIVA: SImple V4l Access Library
 * Copyright (C) 2006 Salvatore Sanfilippo <antirez@invece.org>
 *
 * This library implements an higher level API to access video4linux
 * devices (in particular webcams), where images are always captured
 * into RGB24 format regardless of the actual raw device-specific output.
 *
 * SIVA may become a standalone library in the future, and is released
 * under the terms of the GPL license version 2. */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdarg.h>
#include <errno.h>
#include <sys/ioctl.h>
#include <linux/types.h>
#include <linux/videodev.h>

#include "siva.h"

/* A static error string for out of memory conditions, where
 * allocation for the 'err' pointer of the sivaSource structure is not
 * possible. */
static char *sivaEomErrorString = "Out of memory";

static void sivaSetError(struct sivaSource *source, const char *fmt, ...)
{
    va_list ap;
    char buf[SIVA_MAX_ERR];

    va_start(ap, fmt);
    vsnprintf(buf, SIVA_MAX_ERR, fmt, ap);
    va_end(ap);

    free(source->err);
    source->err = strdup(buf);
    if (source->err == NULL) {
        source->err = sivaEomErrorString;
    }
}

char *sivaGetError(struct sivaSource *source)
{
    if (source->err == NULL)
        return "No error";
    return source->err;
}

static char *sivaV4lPaletteToStr(int palette)
{
    char *tab[] = {NULL,
        "GREY", "HI240", "RGB565", "RGB24", "RGB32", "RGB555", "YUV422",
        "YUYV", "UYVY", "YUV420", "YUV411", "RAW", "YUV422P", "YUV411P",
        "YUV420P", "YUV410P"};
    if (palette < 1 || palette > 16)
        return "Unknown";
    return tab[palette];
}

static int sivaSetBpp(struct sivaSource *s)
{
    switch(s->vpic.palette) {
    case VIDEO_PALETTE_RGB24: s->bpp = 24; break;
    case VIDEO_PALETTE_RGB32: s->bpp = 32; break;
    case VIDEO_PALETTE_YUV420P: s->bpp = 12; break;
    default:
        sivaSetError(s, "Unsupported source output '%s'",
                sivaV4lPaletteToStr(s->vpic.palette));
        return SIVA_ERR;
    }
    return SIVA_OK;
}

int sivaSetRes(struct sivaSource *s, unsigned int width, unsigned int height)
{
    /* Don't really use the ioctls if the mode requested is the
     * mode already set. */
    if (width != s->vwin.width || height != s->vwin.height) {
        int oldWidth, oldHeight;

        oldWidth = s->vwin.width;
        oldHeight = s->vwin.height;
        s->vwin.x = s->vwin.y = 0;
        s->vwin.width = width;
        s->vwin.height = height;
        if (ioctl(s->fd, VIDIOCSWIN, &s->vwin) == -1) {
            sivaSetError(s, "ioctl VIDIOCSWIN: %s", strerror(errno));
            s->vwin.width = oldWidth;
            s->vwin.height = oldHeight;
            return SIVA_ERR;
        }
        /* Mode set without errors. Get it back (to be sure to get the
         * currently set mode, the driver may select a 'near' resolution). */
        if (ioctl(s->fd, VIDIOCGWIN, &s->vwin) == -1) {
            sivaSetError(s, "ioctl VIDIOCGWIN: %s", strerror(errno));
            return SIVA_ERR;
        }
    }
    s->width = s->vwin.width;
    s->height = s->vwin.height;

    /* Resize buffers and update info accordingly */
    free(s->fb);
    free(s->raw);
    if (sivaSetBpp(s) == SIVA_ERR)
        return SIVA_ERR;
    if (s->vpic.palette != VIDEO_PALETTE_RGB24) {
        s->raw = malloc((s->bpp*s->width*s->height)/8);
        if (s->raw == NULL) {
            sivaSetError(s, "Out of memory allocating raw frame buffer");
            return SIVA_ERR;
        }
    }
    s->fb = malloc(3*s->width*s->height);
    if (s->fb == NULL) {
        sivaSetError(s, "Out of memory allocating RGB24 frame buffer");
        return SIVA_ERR;
    }
    return SIVA_OK;
}

int sivaOpen(struct sivaSource *s, char *dev)
{
    s->fd = -1;
    s->err = NULL;
    s->width = -1;
    s->height = -1;
    s->bpp = -1;
    s->fb = NULL;
    s->raw = NULL;

    /* Get the current device state */
    if ((s->fd = open(dev, O_RDWR)) == -1) {
        sivaSetError(s, "Opening '%s': %s", dev, strerror(errno));
        return SIVA_ERR;
    }
    if (ioctl(s->fd, VIDIOCGCAP, &s->vcap) == -1) {
        sivaSetError(s, "ioctl VIDIOCGCAP: %s", strerror(errno));
        return SIVA_ERR;
    }
    if (ioctl(s->fd, VIDIOCGPICT, &s->vpic) == -1) {
        sivaSetError(s, "ioctl VIDIOCGPICT: %s", strerror(errno));
        return SIVA_ERR;
    }
    if (ioctl(s->fd, VIDIOCGWIN, &s->vwin) == -1) {
        sivaSetError(s, "ioctl VIDIOCGWIN: %s", strerror(errno));
        return SIVA_ERR;
    }
    /* Set the BPP field using the 'palette' information */
    if (sivaSetBpp(s) == SIVA_ERR)
        return SIVA_ERR;
    /* Use the current device resolution */
    if (sivaSetRes(s, s->vwin.width, s->vwin.height) == SIVA_ERR)
        return SIVA_ERR;
    return SIVA_OK;
}

void sivaPrintDeviceInfo(struct sivaSource *s)
{
    const char *typebits[] = {NULL, "CAPTURE", "TUNER", "TELETEXT", "OVERLAY",
        "CHROMAKEY", "CLIPPING", "FRAMERAM", "SCALES", "MONOCHROME",
        "SUBCAPTURE", "MPEG_DECODER", "MPEG_ENCODER", "MJPEG_DECODER",
        "MJPEG_ENCODER"};
    char type[1024];
    int i, j;

    type[0] = '\0';
    for (i = 1, j = 1; i <= 8192; i *= 2, j++) {
        if (s->vcap.type & i) {
            strcat(type, typebits[j]);
            strcat(type, "|");
        }
    }
    if (type[0] != '\0') {
        int l = strlen(type);
        type[l-1] = '\0'; /* trim the trailing '|' char. */
    }

    printf("Source name: '%s'\n", s->vcap.name);
    printf("  channels: %d\n", s->vcap.channels);
    printf("  audios: %d\n", s->vcap.audios);
    printf("  maxwidth: %d\n", s->vcap.maxwidth);
    printf("  maxheight: %d\n", s->vcap.maxheight);
    printf("  minwidth: %d\n", s->vcap.minwidth);
    printf("  minheight: %d\n", s->vcap.minheight);
    printf("  type: %s\n", type);
    printf("  --\n");
    printf("  brigthness: %d\n", s->vpic.brightness);
    printf("  hue: %d\n", s->vpic.hue);
    printf("  colour: %d\n", s->vpic.colour);
    printf("  whiteness: %d\n", s->vpic.whiteness);
    printf("  depth: %d\n", s->vpic.depth);
    printf("  palette: %s\n", sivaV4lPaletteToStr(s->vpic.palette));
    printf("  --\n");
    printf("  x: %d\n", s->vwin.x);
    printf("  y: %d\n", s->vwin.x);
    printf("  width: %d\n", s->vwin.width);
    printf("  height: %d\n", s->vwin.height);
    printf("  chromakey: %d\n", s->vwin.chromakey);
}

void sivaClose(struct sivaSource *s)
{
    if (s->err != sivaEomErrorString)
        free(s->err);
    close(s->fd);
    free(s->fb);
    free(s->raw);
}

/* Simple original version */
#if 0
static void orig_sivaConvertYuv420p(struct sivaSource *s)
{
    unsigned char *Y = s->raw;
    unsigned char *U = Y+(s->width*s->height);
    unsigned char *V = U+((s->width*s->height)/4);
    unsigned char *rgb = s->fb;
    int h, x;

    for (h = 0; h < s->height; h++) {
        for (x = 0; x < s->width; x++) {
            int R, G, B, u, v;

            u = U[x/2+(h/2*s->width/2)];
            v = V[x/2+(h/2*s->width/2)];
            R = (int)(1.164*((*Y)-16)+1.596*(v-128));
            G = (int)(1.164*((*Y)-16)-0.813*(u-128)-0.391*(v-128));
            B = (int)(1.164*((*Y)-16)+2.018*(u-128));
            if (R < 0) R = 0; else if (R > 255) R = 255;
            if (G < 0) G = 0; else if (G > 255) G = 255;
            if (B < 0) B = 0; else if (B > 255) B = 255;
            Y++;
            *rgb++ = R;
            *rgb++ = G;
            *rgb++ = B;
        }
    }
}
#endif

/* Optimized version - in order to only use integers there is some
 * minor loss of precision if compared to the original version. */
static void sivaConvertYuv420p(struct sivaSource *s)
{
    unsigned char *Y = s->raw;
    unsigned char *U = Y+(s->width*s->height);
    unsigned char *V = U+((s->width*s->height)/4);
    unsigned char *rgb = s->fb;
    int R, G, B;
    int h, x;

    for (h = 0; h < s->height; h++) {
        if (h&1) {
            U -= s->width/2;
            V -= s->width/2;
        }
        for (x = 0; x < s->width; x++) {
            int alpha = (((*Y)-16)*298)>>8;
            R = alpha+((((*V)-128)*409)>>8);
            G = alpha-((((*U)-128)*208)>>8)-((((*V)-128)*100)>>8);
            B = alpha+(((*U)-128)<<1);
            if (R < 0) R = 0; else if (R > 255) R = 255;
            if (G < 0) G = 0; else if (G > 255) G = 255;
            if (B < 0) B = 0; else if (B > 255) B = 255;
            Y++;
            *rgb++ = R;
            *rgb++ = G;
            *rgb++ = B;
            if (x&1) {
                U++;
                V++;
            }
        }
    }
}

void sivaConvertRgb24(struct sivaSource *s)
{
    int i;
    unsigned char *p = s->fb;

    for (i = 0; i < s->width*s->height; i++) {
        unsigned char t = p[0];
        p[0] = p[2];
        p[2] = t;
        p += 3;
    }
}

void sivaConvertRgb32(struct sivaSource *s)
{
    int i;
    unsigned char *p = s->raw;
    unsigned char *d = s->fb;

    for (i = 0; i < s->width*s->height; i++) {
        d[0] = p[2];
        d[1] = p[1];
        d[2] = p[0];
        p += 4;
        d += 3;
    }
}

void sivaApplyFilterGrayScale(struct sivaSource *s)
{
    int i;
    unsigned char *p = s->fb;

    for (i = 0; i < s->width*s->height; i++) {
        int gray = (p[0]*30)/100 + (p[1]*59)/100 + (p[2]*11)/100;
        if (gray > 255) gray = 255;
        p[0] = p[1] = p[2] = gray;
        p += 3;
    }
}

int sivaCapture(struct sivaSource *s)
{
    unsigned char *dest;
    int nread, expectedLen;

    /* Since our abstract format is RGB24, for devices already outputing
     * frames in this format we can directly write the caputed image
     * into the frame buffer. */
    if (s->vpic.palette == VIDEO_PALETTE_RGB24)
        dest = s->fb;
    else
        dest = s->raw;
    /* Read the frame */
    expectedLen = (s->width*s->height*s->bpp)/8;
    nread = read(s->fd, dest, expectedLen);
    if (nread == -1) {
        sivaSetError(s, "Reading from source: %s\n", strerror(errno));
        return SIVA_ERR;
    }
    if (nread != expectedLen) {
        fprintf(stderr, "Warning: caputring from v4l device:\n");
        fprintf(stderr, "         expected read len: %d\n", expectedLen);
        fprintf(stderr, "         actual read len  : %d\n", nread);
    }
    /* Convert the input frame into RGB24 */
    switch(s->vpic.palette) {
    case VIDEO_PALETTE_RGB24: sivaConvertRgb24(s); break;
    case VIDEO_PALETTE_RGB32: sivaConvertRgb32(s); break;
    case VIDEO_PALETTE_YUV420P: sivaConvertYuv420p(s); break;
    }
    return SIVA_OK;
}

static int sivaSetPicInfo(struct sivaSource *s)
{
    if (ioctl(s->fd, VIDIOCSPICT, &s->vpic) == -1) {
        sivaSetError(s, "ioctl VIDIOCGPICT: %s", strerror(errno));
        return SIVA_ERR;
    }
    return SIVA_OK;
}

int sivaSetBrightness(struct sivaSource *s, int brightness)
{
    int oldval = s->vpic.brightness;
    s->vpic.brightness = brightness;
    if (sivaSetPicInfo(s) == SIVA_ERR) {
        s->vpic.brightness = oldval;
        return SIVA_ERR;
    }
    return SIVA_OK;
}

int sivaSizeInfo(char *name, int *widthPtr, int *heightPtr)
{
    struct {char *name; int width; int height;} size[] = {
        {"subqcif", 128, 96},
        {"qsif", 168, 120},
        {"qcif", 176, 144},
        {"sif", 320, 240},
        {"cif", 352, 288},
        {"vga", 640, 480},
        {NULL, 0, 0}
    };
    int i = 0;

    while(size[i].name != NULL) {
        if (strcasecmp(size[i].name, name) == 0) {
            *widthPtr = size[i].width;
            *heightPtr = size[i].height;
            return SIVA_OK;
        }
        i++;
    }
    return SIVA_ERR;
}

/* This function returns the siva source file descriptor in order
 * to make able the SIVA's user to use select(2) based I/O. */
int sivaGetFd(struct sivaSource *s)
{
    return s->fd;
}
