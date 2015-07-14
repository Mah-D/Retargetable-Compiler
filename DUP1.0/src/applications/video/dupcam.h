/* tcpcam.h -- global header file.
 * This file contains definitions that may be useful in different
 * C files of the TcpCAM program.
 *
 * Copyright(C) 2006 Salvatore Sanfilippo <antirez@invece.org>
 * This software is released under the GPL license version 2.0 */

#ifndef __TCPCAM_H__
#define __TCPCAM_H__

#include <SDL/SDL.h>
#include "siva.h"
#include "adlist.h"
#include "protocol.h"
#include "audiodev.h"
#include "audiocompr.h"

/* This struct contains the 'global' state of the program.
 * It is modified both by option parsing at startup, as 
 * result of user input (e.g. gui or key press operations),
 * and while the program is running. */
struct tcamConf {
    /* General */
    int debug;          /* true if in debug mode, more info printed. */
    int nocam;          /* if true run in no-webcam mode. */
    int noaudio;        /* if true run in no-audio mode. */
    char *errMsg;       /* Where functions called with 'tcamConf' structure
                           pointer set errors (when returning with TCAM_ERR). */
    /* SDL */
    SDL_Surface *screen;
    /* Webcam and images */
    struct sivaSource s;
    char *v4lDevice;    /* v4l device name, for default /dev/video. */
    int bw;             /* black and white image if true */
    int jpgCompr;       /* jpeg compression level, from 1 to 100 */
    int brightness;     /* v4l device brightness setting, 16 bit unsigned max */
    int width;          /* v4l device frame width */
    int height;         /* v4l device frame height */
    unsigned char *localJpg; /* local jpeg image of the last captured frame. */
    int localJpgLen;    /* length of 'localJpg' data. */
    unsigned char *remoteJpg;/* remote jpeg image of the last received frame. */
    int remoteJpgLen;   /* length of 'remoteJpg' data. */
    int jpgSent;        /* true if the current 'localJpg' was already sent. */
    int viewRemote;     /* If true, remote camera is shown, otherwise local. */
    unsigned char *recvBuf;
    int recvBufLen;     /* Length of used recvBuf */
    unsigned char *sendBuf;
    unsigned char *sendBufPtr;  /* Pointer to next data to send in sendBuf */
    int sendBufLen;     /* Length of used sendBuf */
    int fullScreen;     /* Full screen mode, if true. */
    /* Audio */
    tcamAudioDev ad;
    char *inAudioBuf;
    int inAudioBufLen;
    char *outAudioBuf;
    int outAudioBufLen;
    int srate;          /* Audio sampling rate */
    int inputAudioBufMax;
    int outputAudioQueueMax;
    int writeFullFrag;
    /* Audio compression */
    int audioQuality;   /* Speex audio quality, from 1 to 10 */
    int speexMode;
    int speexFrameSize;
    int speexComprFrameSize;
    void *enc_state;
    void *dec_state;
    SpeexBits enc_bits;
    SpeexBits dec_bits;
    
    /* Networking */
    int tcpPort;        /* TCP port number to accept incoming connections. */
    int serverMode;     /* True if in server mode. */
    int serverSocket;   /* socket descriptor of the listening socket. */
    int clientSocket;   /* socket for the connection to the other peer.
                           May be -1 if still not connected. */
    char *peerAddr;     /* IP address or domain name of the other peer. */
    int peerPort;       /* TCP Port of the other peer */
    /* Outgoing Image and Audio packets lists */
    AlList *imageOutList;   /* Outgoing image packets. */
    AlList *audioOutList;   /* Outgoing audio/control packets. */
    /* Incoming Image and Audio buffers */
    unsigned char *imageInBuf; /* Image input buffer. */
    int imageInBufLen;
    int netTimeout;     /* Timeout for read/write operations on sockets. */
};

#define TCAM_OK 0
#define TCAM_ERR 1
#define TCAM_MAX_ERR 1024
#define TCAM_MAX_JPG_SIZE (1024*200)
#define TCAM_MAX_AUDIO_LIST_LEN 64
#define TCAM_MAX_AUDIO_INPUT_BUF (64000) /* 4 seconds at 8Hhz, 16bit */
#define TCAM_NARROW_BAND 0
#define TCAM_WIDE_BAND 1

void tcamSetError(struct tcamConf *conf, const char *fmt, ...);
char *tcamGetError(struct tcamConf *conf);
void sdlUpdateScreen(struct tcamConf *conf);

#endif /* __TCPCAM_H__ */
