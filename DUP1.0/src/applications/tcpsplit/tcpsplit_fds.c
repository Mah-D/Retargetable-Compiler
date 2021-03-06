/* tcpsplit_fds
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

/**
 * @file applications/tcpsplit/tcpsplit_fds.c
 * @brief filter that takes a pcap stream on stdin (as generated by
 * tcpdump) and smartly outputs the same stream with relatively
 * equal amounts of data to each open output fd.  This is a modified
 * version of tcpsplit by Mark Allman (mallman@icir.org).
 *
 * @author Nathan Evans
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <net/if.h>
#include <netinet/in.h>
#include <netinet/in_systm.h>
#include <netinet/in.h>
#include <netinet/ip.h>
#include <netinet/tcp.h>
#include <pcap.h>
#include <dup/dup_filter_lib.h>
#include "tcpsplit.h"

char *readfile = NULL;
char *writespec = NULL;
unsigned short num_files = 0;
struct pkt_dump_file out_file[MAX_OUTPUT_FILES];
struct pkt_dump_file weirdf;
pcap_t *inputp = NULL;
unsigned short use_tcp_ports = TRUE;

void usage(progname)
	char *progname; {
	fprintf(stderr, "usage: %s [options] \n", progname);
	fprintf(stderr, "  options:\n");
	fprintf(stderr, "    -h        usage instructions\n");
	fprintf(stderr, "    --notcp   only use IP addresses in classification\n");
	fprintf(stderr, "    --version version information\n");
	exit(1);
}

void parseargs(argc, argv)
	int argc;char *argv[]; {
	int i;

	for (i = 1; i < argc; i++) {
		if (!strcmp(argv[i], "-h"))
			usage(argv[0]);
		if (!strcmp(argv[i], "--version")) {
			fprintf(stdout, "tcpsplit v%s\n", VERSION);
			exit(0);
		}
		if (!strcmp(argv[i], "--notcp"))
			use_tcp_ports = FALSE;
	}
}

void open_trace_files() {
	char errbuf[PCAP_ERRBUF_SIZE];
	int i;
	if ((inputp = pcap_open_offline("-", errbuf)) == NULL) {
		fprintf(stderr, "error opening tracefile %s: %s\n", "- (stdin)", errbuf);
		exit(1);
	}

	for (i = 0; i < num_files; i++) {
		out_file[i].file = fdopen(out_file[i].fd, "w");
		out_file[i].dp = pcap_dump_fopen(inputp, out_file[i].file);
		out_file[i].pkts = 0;
	}
	weirdf.file = fdopen(2, "w");
	weirdf.dp = pcap_dump_fopen(inputp, weirdf.file);
}

void process_trace() {
	struct pcap_pkthdr hdr;
	struct ip *iph;
	struct tcphdr *tcph;
	u_char *pkt;
	unsigned short fn;
	unsigned short offset;
	unsigned short src_port, dst_port;

	while ((pkt = (u_char *) pcap_next(inputp, &hdr)) != NULL) {
		if (hdr.caplen < (EH_SIZE + sizeof(struct ip))) {
			pcap_dump((u_char *) weirdf.dp, &hdr, (u_char *) pkt);
			continue;
		}
		if ((iph = (struct ip *) (pkt + EH_SIZE)) == NULL) {
			pcap_dump((u_char *) weirdf.dp, &hdr, (u_char *) pkt);
			continue;
		}
		offset = EH_SIZE + (iph->ip_hl * 4);
		if (!use_tcp_ports || (iph->ip_p != IPPROTO_TCP) || (hdr.caplen < (offset
				+ 4)))
			src_port = dst_port = 0;
		else {
			tcph = (struct tcphdr *) (pkt + offset);
			src_port = dst_port = 0;
#if LINUX
			src_port = tcph->source;
			dst_port = tcph->dest;
#elif SOMEBSD
			src_port = tcph->th_sport;
			dst_port = tcph->th_dport;
#endif
		}
		fn = get_file_num(iph->ip_src.s_addr, iph->ip_dst.s_addr, src_port,
				dst_port);
		if (fn < num_files)
			pcap_dump((u_char *) out_file[fn].dp, &hdr, (unsigned char *) pkt);
		else
			fprintf(stderr, "have a total of %d fds, trying to write to %d file",
					num_files, fn);
		out_file[fn].pkts++;
	}
}

void close_trace_files() {
	unsigned short i;

	pcap_close(inputp);
	for (i = 0; i < num_files; i++)
		pcap_dump_close(out_file[i].dp);
}

static int find_open_fds() {
	struct rlimit rl;
	int outfd;
	int maxfd;
	int numfd;
	fprintf(stderr, "Entered find_open_fds\n");
	getrlimit(RLIMIT_NOFILE, &rl);

	maxfd = 0;
	numfd = 0;

	for (outfd = 1; outfd < rl.rlim_cur; outfd++) {
		if (outfd == 2)
			continue;
		if (DUP_get_fd(outfd))
			numfd++;
	}
	fprintf(stderr, "Got %d open fds to print out\n", numfd);
	if (numfd > MAX_OUTPUT_FILES)
		return -1;
	numfd = 0;
	for (outfd = 1; outfd < rl.rlim_cur; outfd++) {
		if (outfd == 2)
			continue;
		if (DUP_get_fd(outfd)) {
			maxfd = outfd;
			out_file[numfd].fd = outfd;
			numfd++;
		}
	}
	fprintf(stderr, "Got %d open fds to print out\n", numfd);
	if (maxfd < 1)
		return 0;

	return numfd;
}

int main(int argc, char ** argv)
{
	parseargs(argc, argv);
	num_files = find_open_fds();
	open_trace_files();
	init_hash_table();
	process_trace();
	close_trace_files();
	exit(0);
}
