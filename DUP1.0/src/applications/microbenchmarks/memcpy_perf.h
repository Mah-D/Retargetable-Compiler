/*
 * memcpy_perf.h
 *
 *  Created on: Oct 8, 2009
 *      Author: liangxue
 */

#ifndef MEMCPY_PERF_H_
#define MEMCPY_PERF_H_

#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <stdint.h>
#include "common.h"

uint64_t memcpy_perf_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state);


#endif /* MEMCPY_PERF_H_ */
