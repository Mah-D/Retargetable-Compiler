#include "../inc/place.h"
#include "../inc/errormsg.h"
#include "mpi.h"

static place_t here;
static int32_t max_places;
static int32_t max_dispatchers;

int32_t _place_init(int argc, char *argv[]) {
	int provided;
	MPI_Init_thread(&argc, &argv, MPI_THREAD_MULTIPLE, &provided);
	//MPI_Init(&argc, &argv);
	MPI_Comm_rank(MPI_COMM_WORLD, &here);
	MPI_Comm_size(MPI_COMM_WORLD, &max_places);
	max_dispatchers = max_places;
	return EXIT_SUCCESS;	
}

int32_t _isfirst(place_t place) {
	if(place == _place_first()) return TRUE;
	else return FALSE;
}

int32_t _islast(place_t place) {
	if(place == _place_last()) return TRUE;
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
	return _thread_gethere();
	// return here;
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
	//return place_to_write + 4 + 1;
	//return 4+1;
	return place_to_write;
}

//returns the fd at which a place should read
int32_t _get_read_fd(place_t place_to_read) {
	//return FILE_DESCRIPTOR_DUP_READ;
	return place_to_read;
}

place_t _dispatcher_rank() {
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
	//return _dispatcher_rank();
	return place;
}