/*
 * helper_lib.c
 *
 *  Created on: Oct 21, 2009
 *      Author: liangxue
 */
#include <sys/time.h>
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

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

void thread_bind_to_core(pthread_t thread_id, int cpu_num)
{
	cpu_set_t cpuset;
	/* Set affinity mask to include CPUs 0 to 7 */
	CPU_ZERO(&cpuset);
	CPU_SET(cpu_num, &cpuset);
	if (pthread_setaffinity_np(thread_id, sizeof(cpu_set_t), &cpuset) != 0)
	{
		perror("pthread_setaffinity_np");
	}
}
