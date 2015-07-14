/**************************************************
 * dupvids.c
 *
 * ***********************************************/
#include "dupvids.h"
#include "jpg.h"
#include "dupio.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <assert.h>
#include <sys/select.h>
#include <unistd.h>

#define MAX_JPG_SIZE (1024*200)

struct PicGrid *createGrid(int numOfPics, int picHeight, int picWidth){
	struct PicGrid *val = (struct PicGrid *) malloc(sizeof(struct PicGrid));
	val->hight = sqrt((double)numOfPics) + 0.5;
	val->width = numOfPics % val->hight == 0 ? numOfPics/val->hight : numOfPics/val->hight+1;
	val->grid = (char *) calloc(picWidth*picHeight*val->hight*val->width, 3);
	val->picWidth = picWidth;
	val->picHight = picHeight;
	val->complete = 0;
	fprintf(stderr, "%dX%d PicGrid created with %dX%d pics.\n", val->hight, val->width, val->picWidth, val->picHight);
	return val;
}

void gridInsert(char *pic, int picnum, struct PicGrid *picGrid){
	int i;
	for(i = 0; i < picGrid->picHight; i++){
		char *src = pic + picGrid->picWidth*3*i;
		char *dst = PicRowOffset(picGrid, picnum, i);
		memcpy(dst, src, picGrid->picWidth*3);
	}
}


int main(){
sleep(15);
	struct timeval tv;
	fd_set rfds;
	FD_ZERO(&rfds);
	FD_SET(0, &rfds);
	int files[20];
	files[0] = 0;
	int fdcount = get_fd_list(3, &files[1], &rfds)+1;
	int maxfd = files[fdcount-1]+1;
	struct JpgBuff *jbufs = (struct JpgBuff*) malloc(sizeof(struct JpgBuff)*fdcount);
	//struct PicGrid *theGrid = createGrid(fdcount, 240, 320);
	struct PicGrid *theGrid = NULL;
	int piclenght, picwidth, picheight, i;
	int foundsize = 0;
	int setWidth = 0, setHeight = 0;
	char *picBuff;
	for(i = 0; i < fdcount; i++){
		jbufs[i].buf = (char *) malloc(MAX_JPG_SIZE);
		if(jbufs[i].buf == NULL){
			fprintf(stderr, "memory error: Could not allocate space for displayJpg");
			exit(1);
		}
		jbufs[i].bufflength = MAX_JPG_SIZE;
		jbufs[i].offset = 0;
		jbufs[i].complete = 0;
	}

	while(1){
	tv.tv_sec = 0;
	tv.tv_usec = 10000;
	select(maxfd, &rfds, NULL, NULL, &tv);
	for(i = 0; i < fdcount; i++){
		if(FD_ISSET(files[i], &rfds)){
			read_jpg(files[i], &jbufs[i], 1);
			if(jbufs[i].complete > 0){
				picBuff = (char *) decompressJpeg((unsigned char *)jbufs[i].jpg, jbufs[i].jpglength, &picwidth, &picheight, &piclenght);
				fprintf(stderr, "Read %dX%d pic.\n", picheight, foundsize);
				if(!foundsize){
					setWidth = picwidth;
					setHeight = picheight;
					theGrid = createGrid(fdcount, setHeight, setWidth);
					foundsize = 1;
				}
				assert(picwidth == setWidth && picheight == setHeight);
				gridInsert(picBuff, i, theGrid);
				free(picBuff);
				theGrid->complete += 1;
				jbufs[i].complete = 0;
				free(jbufs[i].jpg);
			}
			if(jbufs[i].complete < 0){
				int n;
				for(n = i; n < fdcount-1; n++){
					files[n] = files[n+1];
				}
				fdcount--;
				if(fdcount == 0) exit(0);
				i--;
			}
		} else FD_SET(files[i], &rfds);
	}
	if(theGrid->complete >= fdcount){
		int jpgLenght;
		char *jpgBuff = (char *) compressJpeg(100, theGrid->width*theGrid->picWidth, theGrid->hight*theGrid->picHight, (unsigned char *) theGrid->grid, &jpgLenght);
		write_all(1, jpgBuff, jpgLenght);
		free(jpgBuff);
		theGrid->complete = 0;
	}
	}
	return 0;
}
