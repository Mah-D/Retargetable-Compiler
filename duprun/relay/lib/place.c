#include "../inc/place.h"
#include "../inc/errormsg.h"

static place_t here;
static int32_t max_places;
static int32_t max_dispatchers;

int32_t _place_init(char * placeFile) {
	//READS CONFIG FILE
	int32_t BUF_SIZE = 80;
	char buf[BUF_SIZE]; /* Input buffer */
	const int32_t fd = 4;
	
	FILE *fp;
	fp = fopen(placeFile, "rt"); /* Make fd int32_to FILE* for reading */
	
	if (fp == NULL) {
		fprintf(stderr, "BAD FILE DESCRIPTOR %d TO CONFIG\n", fd);
		return EXIT_FAILURE;
	}
	
	int32_t totalPlaces = -1;
	int32_t place = -1;
	int32_t totaldispatchers = -1;
	while (fgets(buf, 80, fp) != NULL) {
		/*if (OUTPUT_ERROR)
			fprint32_tf(stderr, "READING CONFIG FILE\n");*/
		/* get a line, up to 80 chars from fr.  done if NULL */
		sscanf(buf, "%d %d %d", &place, &totalPlaces, &totaldispatchers);
		/*if (OUTPUT_ERROR)
			fprint32_tf(stderr, "%d:Convert place number from string to int32_t\n",
					place);*/
		/* convert the string to a long int32_t */
		/*if (OUTPUT_ERROR)
			fprint32_tf(stderr, "%d,%d,%d\n", place, totalPlaces, totaldispatchers);*/
	}
	here = place;
	max_places = totalPlaces;
	max_dispatchers = totaldispatchers;
	
	return EXIT_SUCCESS;	
}

int32_t _isfirst(place_t place) {
	if(place == PLACEZERO) return TRUE;
	else return FALSE;
}

int32_t _islast(place_t place) {
	if(place == ((max_places)-1)) return TRUE;
	else return FALSE;
}

place_t _place_first() {
	return PLACEZERO;
}

place_t _place_last() {
	return (max_places - 1);
}

place_t _place_next(place_t place) {
	return (place+1)%(max_places);
}

place_t _place_prev(place_t place) {
	return (max_places-1+place)%(max_places);
}

place_t _here() {
	return here;
}

int32_t _max_places() {
	return max_places;
}

place_t _toplace(int32_t place) {
	if(place >= max_places || place < 0) return _place_first();
	else return place;
}

//returns the file descriptor of at where a place should write.
int32_t _get_write_fd(place_t place_to_write) {
	return place_to_write + 4 + 1;
	//return 4+1;
}

//returns the fd at which a place should read
int32_t _get_read_fd(place_t read_place) {
	return FILE_DESCRIPTOR_DUP_READ;
}

place_t _dispatchers_rank() {
	return here;
}

int32_t _isdispatcherzero(place_t place) {
	if(place == PLACEZERO) return TRUE;
	else return FALSE;
}

int32_t _max_dispatchers() {
	return max_dispatchers;
}

int32_t _placetodispatcher(place_t place) {
	return _dispatchers_rank();
}
