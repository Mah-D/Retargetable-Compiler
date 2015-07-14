/*
 * unix_domain_stream_perf.h
 *
 *  Created on: Nov 11, 2009
 *      Author: liangxue
 */

#ifndef UNIX_DOMAIN_STREAM_PERF_H_
#define UNIX_DOMAIN_STREAM_PERF_H_

#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <stdint.h>
#include "common.h"

uint64_t unix_domain_stream_interface(size_t blocksize, unsigned int iter, MEASUREMENT_STATE state);

#endif /* UNIX_DOMAIN_STREAM_PERF_H_ */
