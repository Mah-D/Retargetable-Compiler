#include "../inc/place.h"
#include "../inc/errormsg.h"
static place_t here;
static int max_places;

int _place_init() {
	//READS CONFIG FILE
	int BUF_SIZE = 80;
	char buf[BUF_SIZE]; /* Input buffer */
	const int fd = 4;
	
	FILE *fp;
	fp = fopen("/Users/dupper/Desktop/dupTestCode/in.txt", "rt"); /* Make fd into FILE* for reading */
	//fputs("Found the file descriptor\n", stderr);
	
	if (fp == NULL) {
		fprintf(stderr, "BAD FILE DESCRIPTOR %d TO CONFIG\n", fd);
		return EXIT_FAILURE;
	}
	
	int totalPlaces = -1;
	int place = -1;
	while (fgets(buf, 80, fp) != NULL) {
		/*if (OUTPUT_ERROR)
			fprintf(stderr, "READING CONFIG FILE\n");*/
		/* get a line, up to 80 chars from fr.  done if NULL */
		sscanf(buf, "%d %d", &place, &totalPlaces);
		/*if (OUTPUT_ERROR)
			fprintf(stderr, "%d:Convert place number from string to int\n",
					place);*/
		/* convert the string to a long int */
		/*if (OUTPUT_ERROR)
			fprintf(stderr, "%d,%d\n", place, totalPlaces);*/
	}
	max_places = totalPlaces;
	here = place;
	//writeDebugExtraPlace("Finished setting up the places", totalPlaces);
	//fclose(fp);
	return EXIT_SUCCESS;	
}

int _isfirst(place_t place) {
	if(place == PLACEZERO) return TRUE;
	else return FALSE;
}

int _islast(place_t place) {
	if(place == (max_places-1)) return TRUE;
	else return FALSE;
}

place_t _place_first() {
	return PLACEZERO;
}

place_t _place_last() {
	return max_places - 1;
}

place_t _place_next(place_t place) {
	return (place+1)%max_places;
}

place_t _place_prev(place_t place) {
	return (max_places-1+place)%max_places;
}

place_t _here() {
	return here;
}

int _max_places() {
	return max_places;
}

place_t _toplace(int place) {
	if(place >= max_places || place < 0) return _place_first();
	else return place;
}

//returns the file descriptor of at where a place should write.
int _get_write_fd(place_t place_to_write) {
	//if(_here()==0){return 4}else if(){return 102}else if{return 103}
	
	
	return place_to_write + 4 + 1;
	
}
//returns the fd at which a place should read
int _get_read_fd(place_t read_place) {
	
	return FILE_DESCRIPTOR_DUP_READ;
}
