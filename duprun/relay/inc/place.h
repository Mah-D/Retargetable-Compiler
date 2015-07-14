#ifndef PLACE_H_
#define PLACE_H_

#include <stdint.h>
#include "config.h"
#define PLACEZERO 0
typedef int32_t place_t;

int32_t _place_init(char * placeFile);
int32_t _isfirst(place_t);
int32_t _islast(place_t);
place_t _place_first();
place_t _place_last();
place_t _place_next(place_t);
place_t _place_prev(place_t);
place_t _here();
int32_t _max_places();
place_t _toplace(int);
int32_t _get_write_fd(place_t);
int32_t _get_read_fd(place_t);
place_t _dispatchers_rank();
int32_t _isdispatcherzero(place_t place);
int32_t _max_dispatchers();
int32_t _placetodispatcher(place_t place);
#endif
