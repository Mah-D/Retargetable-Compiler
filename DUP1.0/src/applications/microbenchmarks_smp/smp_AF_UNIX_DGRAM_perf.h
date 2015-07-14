/*
 * AF_UNIX_DGRAM_perf.h
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 */

#ifndef SMP_AF_UNIX_DGRAM_PERF_H_
#define SMP_AF_UNIX_DGRAM_PERF_H_

#include <stdint.h>
#include "common.h"

uint64_t smp_unix_domain_dgram_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state);

#endif /* AF_UNIX_DGRAM_PERF_H_ */
