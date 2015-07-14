/*
 * helper_lib.c
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */
#include <sys/time.h>
#include <stdio.h>
#include <stdlib.h>
#include "helper_lib.h"
/*
 * Potential further considerations
 * - high resolution timer
 * - cpu time, system time, idle time... classification?
 *
 */

uint64_t get_time ()
{
	struct timeval tv;
	gettimeofday (&tv, NULL);
	return ((uint64_t) tv.tv_sec * 1000 * 1000) + (uint64_t) tv.tv_usec;
}
