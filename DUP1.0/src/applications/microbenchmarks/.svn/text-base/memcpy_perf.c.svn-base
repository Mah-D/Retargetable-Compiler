/*
 * memcpy_perf.c
 *
 *  Created on: Oct 8, 2009
 *      Author: liangxue
 */

#include <assert.h>
#include <stdio.h>
#include <string.h>

#include <sys/time.h>
#include "memcpy_perf.h"
#include "helper_lib.h"

/*
 * Measure time by micro-second, change the implementation
 * in the future, use signal, alarm, longjump?
 */
//measure time spent in perform memcpy() function, return time in unit of microsecond
static uint64_t memcpy_perf(const char *src, char *dest, size_t bs,
			unsigned int iter) {
	unsigned int i;
	uint64_t start = get_time ();

	for (i=0;i<iter;i++)
		memcpy(dest, src, bs);

	//return (get_time () - start) / iter;
	return (get_time () - start);
}


/*
 * Either we declare as static array
 * or use dynamic memory allocation
 * However, any mean to ensure/check cache-related information
 * if those two arrays happen to fit in cache line of the CPU?
 */
uint64_t memcpy_perf_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state) {
	char* src_buf, *dest_buf;
	uint64_t elaspedMS;

	src_buf = malloc(blocksize);
	dest_buf = malloc(blocksize);

	elaspedMS = memcpy_perf(src_buf, dest_buf, blocksize, iter);

	free(dest_buf);
	free(src_buf);
	return elaspedMS;
}

