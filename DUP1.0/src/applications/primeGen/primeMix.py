#!/usr/bin/python
# -*- coding: iso-8859-1 -*-

import sys
import resource
import fcntl
import os
import select
import re
import datetime
import time
import traceback

class PrimeInfo(object):
	def __init__ (self, prime):
		self.prime = prime
		self.result = 0
		self.responses = 0
	

def main():
	inputRegex = re.compile(r'([0-9]+,(0|1))')
	quitRegex = re.compile(r'quit')
	primeDict = {}
	#fd_list = getOpenFiles ('r')
	fd_list = []
	fd_list.append (sys.stdin)
	num_responses = len(fd_list)
	out = sys.stderr
	number_of_primes = 0
	temp_number_of_primes = 0
	out.write ("i count %d open fd's\n" % num_responses)
	out.write ("%s\n" % (", ".join (["%d" % x.fileno () for x in fd_list]),))
	starttime = datetime.datetime.now()
	lasttime = datetime.datetime.now()
	try:
		quitsneeded = int(sys.argv[1])
		num_responses = 1
	except Exception, e:
		quitsneeded = num_responses
	numquits = 0
	timeout = 1
	quit = False
	out.write ("primeMix waiting for %d responses...\n" % quitsneeded)

	try:
		select_list = select.select (fd_list, [], [], None)
		while (len (select_list[0]) > 0) and (quit == False):
			for fd in select_list[0]:
				#out.write("fd is %d\n" % fd.fd_num)
				message = fd.readline()
				if inputRegex.match(message):
					#out.write(message)
					values = message.split(',')
					if values[0] in primeDict.keys():
						tempinfo = primeDict[values[0]]
					else:
						tempinfo = PrimeInfo(values[0])
						primeDict[values[0]] = tempinfo
					tempinfo.result = tempinfo.result + int(values[1])
					tempinfo.responses = tempinfo.responses + 1
					for key in primeDict.keys():
						#out.write("prime %s\nresult %d\nresponses %d\n" % (primeDict[key].prime, primeDict[key].result, primeDict[key].responses))
						if (primeDict[key].responses >= num_responses) and (primeDict[key].result == 0):
							sys.stdout.write("%s\n" % (primeDict[key].prime))
							number_of_primes += 1
							temp_number_of_primes += 1
						if (primeDict[key].responses >= num_responses):
							del primeDict[key]
				if quitRegex.match(message):
					numquits = numquits + 1
					#out.write("received %d quits, %d needed\n" % (numquits, num_responses))
				if quitRegex.match(message) and (numquits == quitsneeded):
					quit = True
			#now = datetime.datetime.now()
			#elapsedtime = now - lasttime
			#if (elapsedtime.seconds >= 60):
				#out.write("Received %d primes in %d seconds\n%f primes per second (in the last %d seconds)\n" % (temp_number_of_primes, elapsedtime.seconds, float(temp_number_of_primes) / elapsedtime.seconds,elapsedtime.seconds))
				#temp_number_of_primes = 0
				#totaltime = now - starttime
				#out.write("Received %d primes in %d seconds\n%f primes per second\n" % (number_of_primes, totaltime.seconds, float(number_of_primes) / totaltime.seconds))
				#lasttime = now
			select_list = select.select (fd_list, [], [], None)
	except Exception, e:
		out.write ("%scaught an exception in primeMix.py: %s%s" %
				  ("\n" * 4, str (e), "\n" * 4))
		traceback.print_exc(file=sys.stderr)
	now = datetime.datetime.now()
	totaltime = now - starttime
	out.write("Received %d primes in %d seconds\n%f primes per second\n" % (number_of_primes, totaltime.seconds, float(number_of_primes) / totaltime.seconds))


if __name__ == "__main__": main ()