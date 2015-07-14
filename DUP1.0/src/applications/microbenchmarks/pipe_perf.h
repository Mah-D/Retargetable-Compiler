/*
 * bidirection_pipe.h
 *
 *  Created on: Nov 2, 2009
 *      Author: liangxue
 */

#ifndef BIDIRECTION_PIPE_H_
#define BIDIRECTION_PIPE_H_
#include <stdio.h>
#include <stdint.h>
#include "common.h"

uint64_t pipe_perf_interface(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state);

#endif /* BIDIRECTION_PIPE_H_ */
