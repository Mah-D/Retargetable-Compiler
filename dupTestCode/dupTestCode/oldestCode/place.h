#include <stdint.h>

#define PLACEZERO 0
#define TRUE 1
#define FALSE 0

typedef uint32_t place_t;

place_t _place_init();
int _isfirst(place_t);
int _islast(place_t);
place_t _place_first();
place_t _place_last();
place_t _place_next(place_t);
place_t _place_prev(place_t);
place_t _here();
int _max_places();
place_t _toplace(int);
