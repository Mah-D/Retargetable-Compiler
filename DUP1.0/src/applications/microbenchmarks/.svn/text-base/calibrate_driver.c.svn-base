/*
 * calibrate_driver.c
 *
 *  Created on: Oct 8, 2009
 *      Author: liangxue
 *
 *  Description: This is where main() function is located.
 *
 *  Modification History:
 *  - 25.01.2010@Eric	Change output name convention
 *
 */

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdint.h>
#include <unistd.h>

#include "common.h"
#include "memcpy_perf.h"
#include "tcp_socket_perf.h"
#include "shm_perf.h"
#include "pipe_perf.h"
#include "msq_perf.h"
#include "AF_UNIX_STREAM_perf.h"
#include "AF_UNIX_DGRAM_perf.h"

//global variable - default unidirectional
int bidirectional = 1;

typedef uint64_t (*Profiler)(size_t blocksize, unsigned int iter,
			     MEASUREMENT_STATE state);

#define SQUARE(a) ((a)*(a))

/*
 * Double block size if measured time is less than target time
 * until done
 */
static unsigned int tuning_parameter(Profiler fun, uint64_t target_time, size_t block_size)
{
	uint64_t measured_time = 0;
	uint64_t iter_num = 1 + (1024 / block_size);

	measured_time = fun(block_size, iter_num, MAIN_BODY);
	//remember that this logic doesn't hold for unix domain socket with datagram option
	//because it can't transfer data of more than upper limit (64K for my case).
 	while ( (measured_time < target_time) &&
		(measured_time < 1000) )
	{
	  if (iter_num * 2 < iter_num)
	    break;
	  iter_num *= 2;
	  measured_time = fun(block_size, iter_num, MAIN_BODY);
	  if ( (iter_num > 1000) &&
	       (measured_time == 0) )
	    return 0; /* give up */
	}

	return (iter_num * target_time) / measured_time;
}
/*
 * Since time is in unit of microsecond, does it make sense to truncate decimal part?
 * note that mean is still of type unsigned int
 */
static void calculate_statistics(uint64_t *samples, unsigned int size,
				 uint64_t *mean,
				 double *standardDeviation) {
	unsigned int i = 0;
	double sum = 0.0;
	double tmp = 0.0;

	for (i = 0; i < size; i++) {
		if (sum + samples[i] < sum)
			abort();
		sum += samples[i];
	}
	*mean = sum / size;

	for (i = 0; i < size; i++)
	  tmp += SQUARE (samples[i] - *mean);
	*standardDeviation = sqrt(tmp / size);
}

void profile(FILE *fp_output, Profiler fun, const char *descr) {

	size_t bs;
	unsigned int tuned_iter_num = 0;
	//suggest minimum block size starts from 8
	//because for message queue, each message have a prefix stating the type of this message
	//and this prefix is of type "long", on 64-bit processors, it takes 8 bytes
	size_t sizes[] = {
			8, 16,
			//32, 64, 128, 256, 512, 1024, 2048, 4096,
			1024 * 8,
			//1024 * 16, 1024 * 32, 1024 * 64,
			1024 * 128, 1024 * 256, 1024*512, 1024*1024,
			//2*1024*1024, 4*1024*1024, 8*1024*1024,
			0 };

	unsigned int i = 0;
	unsigned int index_j = 0;

	uint64_t time_samples_of_one_bs[NUM_ITER_PER_SAMPLE];
	uint64_t mean;
	double standardDeviation;

	//for socket related application, server needs to be started
	//in order to performance measurement
	if (strncmp(descr, AF_UNIX_STREAM_DESCR, strlen(AF_UNIX_STREAM_DESCR))
					== 0 || strncmp(descr, AF_UNIX_DGRAM_DESCR, strlen(AF_UNIX_DGRAM_DESCR))
					== 0 || strncmp(descr, TCP_LOOPBACK_DESCR, strlen(TCP_LOOPBACK_DESCR))
					== 0)
	{
		fun(0, 0, START_UP);
	}

	uint64_t target_time = 1*1000*1000; // 1s  --- production runs: 5s

	while (0 != (bs = sizes[i++])) {
		printf("%s for size %u \n", descr, (unsigned int)  bs);

		//sorry that UNIX Domain socket with Datagram option
		//can't send data more than 64K in my case! Skip tuning...

		printf("%s tuning \t block size %u \n", descr, (unsigned int)bs);
		tuned_iter_num = tuning_parameter(fun, target_time, bs);
		printf("tuned iteration number %u\n", tuned_iter_num);


		for (index_j = 0; index_j < NUM_ITER_PER_SAMPLE; index_j++) {
			time_samples_of_one_bs[index_j] = fun(bs, tuned_iter_num, MAIN_BODY);
		}

		//pass-by-reference
		calculate_statistics(time_samples_of_one_bs, NUM_ITER_PER_SAMPLE,
				&mean, &standardDeviation);

		//final output unit: blocksize - KB, time - microsecond
		fprintf(fp_output, "%s: %u\t%lf\t%u\t%llu\t%f\t%f\n",
			descr,
			(unsigned int) bs,
			((double)bs*tuned_iter_num)/mean,
			tuned_iter_num,
			(unsigned long long) mean,
			standardDeviation,
			(double)1/standardDeviation);
		//get rid of messed up buffers being written to file
		fflush (fp_output);
	}

	if (strncmp(descr, AF_UNIX_STREAM_DESCR, strlen(AF_UNIX_STREAM_DESCR))
						== 0 || strncmp(descr, AF_UNIX_DGRAM_DESCR, strlen(AF_UNIX_DGRAM_DESCR))
						== 0 || strncmp(descr, TCP_LOOPBACK_DESCR, strlen(TCP_LOOPBACK_DESCR))
						== 0)
	{
		fun(0, 0, CLEAN_UP);
	}
}

typedef struct {
	Profiler fun;
	const char *description;
} RunInfo;

int main(int argc, char *argv[]) {
	RunInfo funs[] = {
	  {&memcpy_perf_interface, MEMCPY_DESCR},
	  {&pipe_perf_interface, PIPE_DESCR},
	  {&msq_perf_interface, MSQ_DESCR},
	  {&tcp_loopback_interface, TCP_LOOPBACK_DESCR},
	  {&unix_domain_stream_interface, AF_UNIX_STREAM_DESCR},
 	  {&AF_UNIX_DGRAM_perf_interface, AF_UNIX_DGRAM_DESCR},
	  { NULL, NULL},
	};
	Profiler fun;
	unsigned int i;
	i = 0;
	FILE *fp_output;


	char my_host_name[256] = {0};
	char experiment_name[512] = {0};
	char bidirectional_str[32] = {0};

	if(bidirectional == 1)
	{
		strcpy(bidirectional_str, STR_BIDIRECTION);
		bidirectional_str[strlen(STR_BIDIRECTION)] = '\0';
	}
	else
	{
		strcpy(bidirectional_str, STR_UNIDIRECTION);
		bidirectional_str[strlen(STR_UNIDIRECTION)] = '\0';
	}

	gethostname(my_host_name, 256);
	//sprintf(experiment_name, "%s_%s_%s.dat", my_host_name, bidirectional_str, core);
	//fp_output = fopen(experiment_name, "w");

	while (NULL != (fun = funs[i].fun))
	{
		sprintf(experiment_name, "%s_%s_%s.dat", my_host_name, funs[i].description, bidirectional_str);
		fp_output = fopen(experiment_name, "w");

		if(bidirectional)
			fprintf(fp_output, "#bi-directional version\n");
		else
			fprintf(fp_output, "#uni-directional version\n");

		fprintf(fp_output, "#description\t block-size\t bytes-per-second\t tuned-iteration-num\t mean\t standard-deviation \t errorbar\n");

		fflush(fp_output);

		profile (fp_output, fun, funs[i].description);

		i++;
		//for gnuplot
		//fprintf(fp_output, "\n\n");

		fclose(fp_output);
	}

	return 0;

}
