#include "../inc/place.h"

place_t here;
int max_places;

place_t _place_init(int place, int maxPlaces) {
	max_places = maxPlaces;
	here = place;
	return 0;
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
