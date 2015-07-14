/*
 * shm_perf.h
 *
 *  Created on: Oct 26, 2009
 *      Author: liangxue
 */

#ifndef SHM_PERF_H_
#define SHM_PERF_H_
#include <stdio.h>
#include <stdint.h>
#include "common.h"

uint64_t shm_perf_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state);

#endif /* SHM_PERF_H_ */
