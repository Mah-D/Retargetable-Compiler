
/* tcpsplit
 * Mark Allman (mallman@icir.org)
 *
 * Copyright (c) 2004 International Computer Science Institute
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation files
 * (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * The names and trademarks of copyright holders may not be used in
 * advertising or publicity pertaining to the software without specific
 * prior permission. Title to copyright in this software and any
 * associated documentation will at all times remain with the copyright
 * holders.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

#include <pcap.h>

#define FALSE                  0
#define TRUE                   1

#define MAX_OUTPUT_FILES       32
#define HASH_MULTIPLIER        37
#define HASH_TBL_SIZE          48611
#define EH_SIZE                14
#define VERSION "0.0.1"

struct pkt_dump_file {
	FILE *file;
	pcap_dumper_t *dp;
	int fd;
	unsigned long pkts;
};

struct ip_pair {
	unsigned int ip1, ip2;
	unsigned short port1, port2;
	unsigned short file_num;
	struct ip_pair *next;
};

/* balancer.c */

unsigned short file_for_new_cnn();

/* ipa_db.c */

void init_hash_table();
unsigned short get_file_num();

/* tcpsplit.c */

extern unsigned short num_files;
extern struct pkt_dump_file out_file[];
