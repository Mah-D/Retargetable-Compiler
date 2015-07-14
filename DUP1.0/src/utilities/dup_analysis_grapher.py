#!/usr/bin/python
# -*- coding: iso-8859-1 -*-
import sys
import os
import types
import re
from xml.dom import minidom

class NetData(object):
	def __init__(self, from_host, to_host, bytes, seconds):
		self.from_host = from_host
		self.to_host = to_host
		self.bytes = bytes
		self.seconds = seconds
		if (self.bytes > 0) and (self.seconds > 0):
			self.kbytes_per_second = (self.bytes / 1024) / self.seconds
		else:
			self.kbytes_per_second = 0

class Syscall(object):
	def __init__(self, cmd, num, percentage, seconds):
		self.cmd = cmd
		self.num = num
		self.percentage = percentage
		self.seconds = seconds
		
class ThroughputDatum(object):
	def __init__(self, second, bytes):
		self.second = second
		self.bytes = bytes

class Average(object):
	def __init__(self, name, average, count):
		self.name = name
		self.average = 0
		self.count = 0
	
class Timing(object):
	def __init__(self, usertime, systime, elapsed, percentcpu, swaps):
		self.usertime = usertime
		self.systime = systime
		self.elapsed = elapsed 
		self.percentcpu = percentcpu
		self.swaps = swaps

class RealTimingInfo(object):
	def __init__(self, date, time, percentcpu, percentmem, coremem):
		self.date = date
		timelist,crap,crap2 = time.rpartition(":")
		self.time = timelist
		self.percentcpu = percentcpu
		self.percentmem = percentmem
		self.coremem = coremem

class Edge(object):
	def __init__(self, data_amount, to_node, datum_list, fd):
		self.data_amount = data_amount
		self.to_node = to_node
		self.datum_list = datum_list
		self.fd = fd
		

class Node(object):
	def __init__(self, name, command):
		self.name = name
		self.command = command
		self.out_edge_list = []
		self.in_edge_list = []
		self.syscall_list = []
		self.total_out = 0
		self.total_in = 0
		self.ratio = 0.0
		self.timing_info = None
		self.poll_list = []
		self.poll_list_hosts_replaced = []

	def compute_data_rates(self):
		for tempEdge in self.out_edge_list:
			self.total_out += tempEdge.data_amount

		for tempEdge in self.in_edge_list:
			self.total_in += tempEdge.data_amount

		if (self.total_in == 0):
			self.total_in = 1

		if (self.total_out == 0):
			self.total_out = 1
		
		mytype = 0
		if (self.total_in > self.total_out):
			self.ratio = float(self.total_out) / self.total_in
			mytype = 1
		elif (self.total_in < self.total_out):
			self.ratio = float(self.total_in) / self.total_out
			mytype = 2
		elif (self.total_in == self.total_out):
			self.ratio = 1
		
		if (self.ratio > .8):
			#make it bluish please
			temphex = hex(255 - int(self.ratio * 125))[2:]
			if (len(temphex) == 1):
				temphex = "0" + temphex
			if (mytype == 2):
				self.color = "#00" + temphex + "FF" 
			elif (mytype == 1):
				self.color = "#" + temphex + "00FF" 
			else:
				self.color = "#0000FF" 
		elif (mytype == 2):
			#make it greenish please
			temphex = hex(255 - int(self.ratio * 125))[2:]
			if (len(temphex) == 1):
				temphex = "0" + temphex
			self.color = "#00" + temphex + "00"
			
		elif (mytype == 1):
			#make it reddish please
			temphex = hex(255 - int(self.ratio * 255))[2:]
			if (len(temphex) == 1):
				temphex = "0" + temphex
			self.color = "#" + temphex + "0000"

		#print "node: " + self.name + " ratio: " + str(self.ratio) + " color " + self.color

def getText (node_list):
	ret = []
	for node in node_list:
			for child in node.childNodes:
					if child.nodeType == child.TEXT_NODE:
							ret.append (child.data)

	return "".join (ret)

def getNodeText (node):
	ret = []
	for child in node.childNodes:
		if child.nodeType == child.TEXT_NODE:
			ret.append (child.data)

	return "".join (ret)

def parseNodes(node):
	tempnodelist = []
	if (node.nodeName == "base_config"):
		base_config = True
		trial = -1
	elif (node.nodeName == "tee_data"):
		base_config = False
		triallist = node.getElementsByTagName("trial")
		if (len(triallist) >= 1):
			trial = getText(triallist)
	else:
		return -1;
	nodecount = 0
	
	for child in node.childNodes:
		if (child.nodeType == 1) and (child.nodeName == "node"):
			nodenamelist = child.getElementsByTagName("nodename")
			if (len(nodenamelist) >= 1):
				tempnodename = getText(nodenamelist)
			else:
				tempnodename = ""
			commandlist = child.getElementsByTagName("command")
			if (len(commandlist) >= 1):
				tempcommand = getText(commandlist)
				commandlist = tempcommand.split('/')
				tempcommand = commandlist[len(commandlist) - 1]
			else:
				tempcommand = ""

			tempnode = Node(tempnodename, tempcommand)
			syscall_list = child.getElementsByTagName("syscalls")
			if (len(syscall_list) >= 1):
				for syscall in syscall_list[0].childNodes:
					if syscall.nodeName == "syscall":
						templist = []
						templist = syscall.getElementsByTagName("call")
						if (len(templist) >= 1):
							tempcall = getText(templist)
						else:
							tempcall = ""

						templist = []
						templist = syscall.getElementsByTagName("seconds")
						if (len(templist) >= 1):
							tempseconds = getText(templist)

						templist = []
						templist = syscall.getElementsByTagName("numcalls")
						tempnumcalls = getText(templist)

						templist = []
						templist = syscall.getElementsByTagName("percent_time")
						if (len(templist) >= 1):
							temppercenttime = getText(templist)
					
						if (tempcall != ""):
							tempnode.syscall_list.append(Syscall(tempcall, tempnumcalls, temppercenttime, tempseconds));
							#print "call: " + tempcall + " numcalls: " + tempnumcalls + " %time: " + temppercenttime + " seconds: " + tempseconds

			poll_list = child.getElementsByTagName("poll_info")
			if (len(poll_list) >= 1):
				for poll_info in poll_list[0].childNodes:
					if poll_info.nodeName == "info":
						templist = []
						templist = poll_info.getElementsByTagName("date")
						if (len(templist) >= 1):
							tempdate = getText(templist)
						else:
							tempdate = ""

						templist = []
						templist = poll_info.getElementsByTagName("time")
						if (len(templist) >= 1):
							temptime = getText(templist)

						templist = []
						templist = poll_info.getElementsByTagName("percent_cpu")
						if (len(templist) >= 1):
							temppercentcpu = getText(templist)
							
						templist = []
						templist = poll_info.getElementsByTagName("percent_mem")
						if (len(templist) >= 1):
							temppercentmem = getText(templist)

						templist = []
						templist = poll_info.getElementsByTagName("mem_core")
						if (len(templist) >= 1):
							tempcoremem = getText(templist)  
					
						if (tempdate != ""):
							tempnode.poll_list.append(RealTimingInfo(tempdate, temptime, temppercentcpu, temppercentmem, tempcoremem));
							#print "date: " + tempdate + " time: " + temptime + " %cpu: " + temppercentcpu


			poll_list = child.getElementsByTagName("hosts_replaced_poll_info")
			if (len(poll_list) >= 1):
				for poll_info in poll_list[0].childNodes:
					if poll_info.nodeName == "info":
						templist = []
						templist = poll_info.getElementsByTagName("date")
						if (len(templist) >= 1):
							tempdate = getText(templist)
						else:
							tempdate = ""

						templist = []
						templist = poll_info.getElementsByTagName("time")
						if (len(templist) >= 1):
							temptime = getText(templist)

						templist = []
						templist = poll_info.getElementsByTagName("percent_cpu")
						if (len(templist) >= 1):
							temppercentcpu = getText(templist)
							
						templist = []
						templist = poll_info.getElementsByTagName("percent_mem")
						if (len(templist) >= 1):
							temppercentmem = getText(templist)

						templist = []
						templist = poll_info.getElementsByTagName("mem_core")
						if (len(templist) >= 1):
							tempcoremem = getText(templist)  
					
						if (tempdate != ""):
							tempnode.poll_list_hosts_replaced.append(RealTimingInfo(tempdate, temptime, temppercentcpu, temppercentmem, tempcoremem));
							#print "date: " + tempdate + " time: " + temptime + " %cpu: " + temppercentcpu

			timing_list = child.getElementsByTagName("timing_info")
			if (len(timing_list) >= 1):
				tempusertime = -1
				for timing in timing_list[0].childNodes:
					if timing.nodeName == "usertime":
						tempusertime = getNodeText(timing)
					elif timing.nodeName == "systime":
						tempsystime = getNodeText(timing)
					elif timing.nodeName == "elapsed":
						tempelapsed = getNodeText(timing)
					elif timing.nodeName == "percentcpu":
						tempcpu = getNodeText(timing)
					elif timing.nodeName == "numswaps":
						tempswaps = getNodeText(timing)
					
				if (tempusertime > -1):
					tempnode.timing_info = Timing(tempusertime, tempsystime, tempelapsed, tempcpu, tempswaps);
					#print "user: " + tempusertime + " sys: " + tempsystime + " elapsed: " + tempelapsed + " cpu: " + tempcpu + " swaps: " + tempswaps

			outedgelist = child.getElementsByTagName("out_edges")
			if (len(outedgelist) >= 1):
				for out_edge in outedgelist[0].childNodes:
					if (out_edge.nodeName == "edge"):
						edgelist = out_edge.getElementsByTagName("to_node")
						temptonode = getText(edgelist)
						sizelist = out_edge.getElementsByTagName("file_size")
						tempsize = 0
						if (len(sizelist) >= 1):
							tempsize = getText(sizelist)
						fdlist = out_edge.getElementsByTagName("fd")
						tempfd = getText(fdlist)	
						if (tempfd == ''):
							tempfd = 0
						else:
							tempfd = int(tempfd)
						
						throughput_data_list = out_edge.getElementsByTagName("throughput_data")
						datum_list = []
						if (len(throughput_data_list) > 0):
							offset = 0
							for datum in throughput_data_list[0].childNodes:
								if (datum.nodeName == "datum"):
									secondlist = datum.getElementsByTagName("second")
									byteslist = datum.getElementsByTagName("bytes")
									tempsecond = getText(secondlist)
									tempbytes = getText(byteslist)
									if (offset == 0):
										offset = int(tempsecond)
									tempsecond = int(tempsecond) - offset
									datum_list.append(ThroughputDatum(tempsecond, int(tempbytes)))	
						tempnode.out_edge_list.append(Edge(int(tempsize), temptonode, datum_list, tempfd))
						
				#print "Node name: " + tempnodename + "command: " + tempcommand + "to_node: " + temptonode + "out size: " + str(tempsize)

			temptonode = ""
			inedgelist = child.getElementsByTagName("in_edges")
			if (len(inedgelist) >= 1):
				for in_edge in inedgelist[0].childNodes:
					if (in_edge.nodeName == "edge"):
						sizelist = in_edge.getElementsByTagName("file_size")
						tempsize = 0
						if (len(sizelist) >= 1):
							tempsize = getText(sizelist)
						tempnode.in_edge_list.append(Edge(int(tempsize), "", [], ""))
				#print "in size: " + str(tempsize)
			tempnode.compute_data_rates()
			tempnodelist.append(tempnode)
	return trial, tempnodelist;

def generateGraphvizNetData(root_node, base_dir, do_dot, base_html):
	net_data_list = []
	for childNode in root_node.childNodes:
		if (childNode.nodeType == 1) and (childNode.localName == "datum"):
			from_host = ""
			to_host = ""
			temp_bytes = 0
			temp_seconds = 0.0
			for dataChild in childNode.childNodes:
				if dataChild.nodeName == "from_host":
					temp_from = getNodeText(dataChild)
				if dataChild.nodeName == "to_host":
					temp_to = getNodeText(dataChild)
				if dataChild.nodeName == "bytes":
					temp_bytes = getNodeText(dataChild)
				if dataChild.nodeName == "seconds":
					temp_seconds = getNodeText(dataChild)

			net_data_list.append(NetData(temp_from, temp_to, int(temp_bytes), float(temp_seconds)))
			
	if (len(net_data_list) > 0):
		baseGraphViz = "digraph G { \nnode [label=\"\N\"];\n"
		netcount = 0
		nettotal = 0
		
		for netNode in net_data_list:
			if netNode.from_host != netNode.to_host: # Sometimes measuring locally throws off numbers!
				netcount = netcount + 1
				nettotal = nettotal + netNode.kbytes_per_second
		
		if (netcount > 0):
			netAverageSpeed = nettotal / netcount
			avgOutFile = base_dir + "/data/netdataavg.txt"
			writefile = open(avgOutFile, 'w')
			writefile.write("0 " + str(netAverageSpeed) + "\n")
			writefile.write(str(len(net_data_list) + 100) + " " + str(netAverageSpeed) + "\n")
			writefile.close()
			for netNode in net_data_list:
				#baseGraphViz = baseGraphViz + "\t\"" + netNode.from_host + "\" -> \"" + netNode.to_host + "\" [label=\"" + ("%.2f" % netNode.kbytes_per_second) + " KiB/s\"];\n"
				if (netNode.kbytes_per_second > (netAverageSpeed * 2)):
					color = "green"
				elif (netNode.kbytes_per_second < (netAverageSpeed / 2)):
					color = "red"
				else:
					color = "blue"
				baseGraphViz = baseGraphViz + "\t\"" + netNode.from_host + "\" -> \"" + netNode.to_host + "\" [color=" + color + "];\n"
	
			baseGraphViz = baseGraphViz + "}"
			graphVizLegend = "digraph G { \nnode [label=\"\N\"];\n"
			graphVizLegend = graphVizLegend + "\"one\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"two\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"three\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"four\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"five\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"six\" [style=invisible];\n"
			graphVizLegend = graphVizLegend + "\"one\" -> \"two\" [color=green, label=\" Speed >" + ("%.2f" % (netAverageSpeed * 2)) + " KiB/s\"]\n";
			graphVizLegend = graphVizLegend + "\"three\" -> \"four\" [color=red, label=\" Speed <" + ("%.2f" % (netAverageSpeed / 2)) + " KiB/s\"]\n"; 
			graphVizLegend = graphVizLegend + "\"five\" -> \"six\" [color=blue, label=\" Speed >" + ("%.2f" % (netAverageSpeed / 2)) + " and < " + ("%.2f" % (netAverageSpeed * 2)) + "KiB/s\"]\n";
			graphVizLegend = graphVizLegend + "}"
			legendoutfile = base_dir + "/data/netdatalegend.dot"
			writefile = open(legendoutfile, 'w')
			writefile.write(graphVizLegend)
			writefile.close()
			outfile = base_dir + "/data/netdata.dot"
			writefile = open(outfile, 'w')
			writefile.write(baseGraphViz)
			writefile.close()
			if (do_dot):
				pngfile = base_dir + "/data/netdatalegend.png"
				os.system("dot -Tpng " + legendoutfile + " -o " + pngfile)
				base_html = base_html + "\t\t<tr><td><b>Network Link Speeds Legend</b><br>Average (mean) Node to Node Max Speed: " + str(netAverageSpeed) + " KiB/s</td></tr><tr><td><img src=\"netdatalegend.png\"/></td></tr>\n"
				pngfile = base_dir + "/data/netdata.png"
				os.system("circo -Tpng " + outfile + " -o " + pngfile)
				base_html = base_html + "\t\t<tr><td><b>Network Link Speeds Graph</b></td></tr><tr><td><img src=\"netdata.png\"/></td></tr>\n"

	return base_html


def generateGraphviz(nodelist, trialnum , base_dir, do_dot, base_html):
	baseGraphViz = "digraph G { \nnode [label=\"\N\"];\n"
	#print type(nodeList)
	nodecount = 0
	for node in nodelist:
		if (len(node.command) < 25):
			baseGraphViz = baseGraphViz + "\t\"" + node.name + "\" [label=\"" + node.command + "\""
		else:
			baseGraphViz = baseGraphViz + "\t\"" + node.name + "\" [label=\"" + node.command[:22] + "..." + "\""

		baseGraphViz = baseGraphViz + ", style=filled,color=\"" + node.color + "\"];\n"
		for out_edge in node.out_edge_list:
			baseGraphViz = baseGraphViz + "\t\"" + node.name + "\" -> \"" + out_edge.to_node + "\" [label=\"" + str(out_edge.data_amount) + "\"];\n"

	baseGraphViz = baseGraphViz + "}\n"
	if (trialnum < 0):
		outfile = base_dir + "/data/original.dot"
	else:
		outfile = base_dir + "/data/" + "tee" + trialnum + ".dot"

	#print outfile
	#print baseGraphViz
	writefile = open(outfile,'w')
	writefile.write(baseGraphViz)
	writefile.close()
	if (do_dot):
		os.system("dot -Tpng " + outfile + " -o " + base_dir + "/data/" + "tee" + str(trialnum) + ".png")
		base_html = base_html + "\t\t<tr><td><b>Data IO graph</b></td></tr><tr><td><img src=\"" + "tee" + str(trialnum) + ".png" + "\"/></td></tr>\n"
	return base_html

def getTotalTime(nodelist, base_html):
	totalelapsedtime = 0
	totalusertime = 0
	totalsystime = 0    
	for node in nodelist:
		if (type(node.timing_info) != types.NoneType):
			totalelapsedtime = totalelapsedtime + float(node.timing_info.elapsed)
			totalusertime = totalusertime + float(node.timing_info.usertime)
			totalsystime = totalsystime + float(node.timing_info.systime)

	if (totalelapsedtime > 0):
		base_html = base_html + "\t<h2>Timing Info</h2>\t<table border=1 style=\"text-align:center\">\n\t\t<tr>\n\t\t\t<td>Total Elapsed Time</td>\n\t\t\t<td>Total User Time</td>\n\t\t\t<td>Total System Time</td>\n\t\t</tr>\n"
		base_html = base_html + "\t\t<tr>\n\t\t\t<td>" + str(totalelapsedtime) + "</td>\n\t\t\t<td>" + str(totalusertime) + "</td>\n\t\t\t<td>" + str(totalsystime) + "</td>\n\t\t</tr>\n\t</table>\n"
	return base_html
			
def generateGNUplot(nodelist, trialnum , base_dir, do_plot, base_html):
	print "Generating lots of gnuplot data"
	count = 1
	realcount = 1
    

  #Create time data file and plot
	timedatafile = base_dir + "/data/trial-" + str(trialnum) + "_timing.data"
	timeplotfile = base_dir + "/data/trial-" + str(trialnum) + "_timing.gnuplot"
	timepngfile =  base_dir + "/data/trial-" + str(trialnum) + "_timing.png"
	basegnuplotdata = ""
	basegnuplottimes = "set title \"Elapsed time for Trial" + str(trialnum) + "\"\n"
	basegnuplottimes = basegnuplottimes + "set ylabel \"Time (secs)\"\n"
	basegnuplottimes = basegnuplottimes + "set term png\nset style data histograms\n"
	basegnuplottimes = basegnuplottimes + "set style fill solid\n"
	basegnuplottimes = basegnuplottimes + "set output \"" + timepngfile + "\"\n"
	basegnuplottimes = basegnuplottimes + "set boxwidth 1\n"
	xtics = False
	for node in nodelist:
		if (type(node.timing_info) != types.NoneType):
			xtics = True
	if (xtics == True):
		basegnuplottimes = basegnuplottimes + "set xtics ("
	for node in nodelist:
		if (type(node.timing_info) != types.NoneType):
			if (realcount < len(nodelist)):
				basegnuplottimes = basegnuplottimes + "\"" + node.name + "\" " + str(realcount - 1) + "," 
			else:
				basegnuplottimes = basegnuplottimes + "\"" + node.name + "\" " + str(realcount - 1) + ") rotate by 90\n"
			basegnuplotdata = basegnuplotdata + str(realcount - 1) + " " + node.timing_info.elapsed + " " + node.timing_info.usertime + " " + node.timing_info.systime + "\n"

			count += 5
			realcount += 1
	basegnuplottimes = basegnuplottimes + "set xtics offset 0,-5\n"
	basegnuplottimes = basegnuplottimes + "plot \"" + timedatafile + "\" u 2 ti \"Elapsed Time\", '' u 3 ti \"User Time\", '' u 4 ti \"System Time\"\n"

	writefile = open(timedatafile,'w')
	writefile.write(basegnuplotdata)
	writefile.close()

	writefile = open(timeplotfile,'w')
	writefile.write(basegnuplottimes)
	writefile.close()
	
  #Create cpu data file and plot
	count = 1
	realcount = 1
	cpudatafile = base_dir + "/data/trial-" + str(trialnum) + "_cpu.data"
	cpuplotfile = base_dir + "/data/trial-" + str(trialnum) + "_cpu.gnuplot"
	cpupngfile =  base_dir + "/data/trial-" + str(trialnum) + "_cpu.png"
	basegnuplotdata = ""
	basegnuplotcpu = "set title \"CPU Usage for Trial" + str(trialnum) + "\"\n"
	basegnuplotcpu = basegnuplotcpu + "set ylabel \"Percent CPU\"\n"
	basegnuplotcpu = basegnuplotcpu + "set yrange [0:100]\n"
	basegnuplotcpu = basegnuplotcpu + "set term png\nset style fill solid\n"
	basegnuplotcpu = basegnuplotcpu + "set output \"" + cpupngfile + "\"\n"
	basegnuplotcpu = basegnuplotcpu + "set nokey\n"
	basegnuplotcpu = basegnuplotcpu + "set boxwidth 1\n"
	xtics = False
	for node in nodelist:
		if (type(node.timing_info) != types.NoneType):
			xtics = True
	if (xtics):
		basegnuplotcpu = basegnuplotcpu + "set xtics ("

	for node in nodelist:
		if (type(node.timing_info) != types.NoneType):
			if (realcount < len(nodelist)):
				basegnuplotcpu = basegnuplotcpu + "\"" + node.name + "\" " + str(count) + "," 
			else:
				basegnuplotcpu = basegnuplotcpu + "\"" + node.name + "\" " + str(count) + ") rotate by 90\n"
			basegnuplotdata = basegnuplotdata + str(count) + " " + node.timing_info.percentcpu + "\n"
			count += 5
			realcount += 1
	basegnuplotcpu = basegnuplotcpu + "set xtics offset 0,-5\n"
	basegnuplotcpu = basegnuplotcpu + "plot \"" + cpudatafile + "\" with boxes\n"

	writefile = open(cpudatafile,'w')
	writefile.write(basegnuplotdata)
	writefile.close()

	writefile = open(cpuplotfile,'w')
	writefile.write(basegnuplotcpu)
	writefile.close()

	if (do_plot) and (xtics):
		os.system("gnuplot " + cpuplotfile)
		os.system("gnuplot " + timeplotfile)
		base_html = base_html + "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><b>Time comparison graph</b></td>\n\t\t\t<td style=\"text-align:center\"><b>Stand alone CPU Usage Comparison graph</b></td>\n\t\t</tr>\n"
		base_html = base_html + "\t\t<tr>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "_timing.png" + "\"/></td>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "_cpu.png" + "\"/></td>\n\t\t</tr>\n"

#  #Create cpu/time comparison plot
#	count = 1
#	realcount = 1
#	cputimedatafile = base_dir + "/data/trial-" + str(trialnum) + "_cpu_time.data"
#	cputimeplotfile = base_dir + "/data/trial-" + str(trialnum) + "_cpu_time.gnuplot"
#	cputimepngfile =  base_dir + "/data/trial-" + str(trialnum) + "_cpu_time.png"
#	basegnuplotdata = ""
#	basegnuplotcputime = "set title \"CPU Usage for Trial" + str(trialnum) + "\"\n"
#	basegnuplotcputime = basegnuplotcputime + "set ylabel \"Percent CPU\"\n"
#	basegnuplotcputime = basegnuplotcputime + "set term png\nset style fill solid\n"
#	basegnuplotcputime = basegnuplotcputime + "set output \"" + cputimepngfile + "\"\n"
#	basegnuplotcputime = basegnuplotcputime + "set nokey\n"
#	basegnuplotcputime = basegnuplotcputime + "set boxwidth 1\n"
#	xtics = False
#	for node in nodelist:
#		if (type(node.timing_info) != types.NoneType):
#			xtics = True
#	if (xtics):
#		basegnuplotcputime = basegnuplotcputime + "set xtics ("
#
#	for node in nodelist:
#		if (type(node.timing_info) != types.NoneType):
#			if (realcount < len(nodelist)):
#				basegnuplotcputime = basegnuplotcputime + "\"" + node.name + "\" " + str(count) + "," 
#			else:
#				basegnuplotcputime = basegnuplotcputime + "\"" + node.name + "\" " + str(count) + ") rotate by 90\n"
#			basegnuplotdata = basegnuplotdata + str(count) + " " + node.timing_info.percentcpu + " " + node.timing_info.elapsed + "\n"
#			count += 5
#			realcount += 1
#	basegnuplotcputime = basegnuplotcputime + "set xtics offset 0,-5\n"
#	basegnuplotcputime = basegnuplotcputime + "set xtic rotate by -45\n"
#
#	basegnuplotcputime = basegnuplotcputime + "plot \"" + cputimedatafile + "\" with boxes using 2, '' using 3\n"
#
#	writefile = open(cputimedatafile,'w')
#	writefile.write(basegnuplotdata)
#	writefile.close()
#
#	writefile = open(cputimeplotfile,'w')
#	writefile.write(basegnuplotcputime)
#	writefile.close()
#
#	if (do_plot) and (xtics):
#		os.system("gnuplot " + cputimeplotfile)
#		base_html = base_html + "\t\t<tr><td><b>CPU/Time Comparison graph</b></td></tr><tr><td><img src=\"" + "trial-" + str(trialnum) + "_cpu_time.png" + "\"/></td></tr>\n"


	#Add in plotting of memory usage
	plotfilelist = []
	plotnamelist = []
	count = 1;
	memdatafile = base_dir + "/data/trial-" + str(trialnum) + "-mem_totals.data"
	memplotfile = base_dir + "/data/trial-" + str(trialnum) + "-mem_totals.gnuplot"
	mempngfile =  base_dir + "/data/trial-" + str(trialnum) + "-mem_totals.png"
	
	basegnuplotdata = ""
	basegnuplotmem = "set title \"Memory Usage for Trial " + str(trialnum) + ", ALL processes \n"
	basegnuplotmem = basegnuplotmem + "set ylabel \"Percent Memory\"\n"
	basegnuplotmem = basegnuplotmem + "set xlabel \"Process\"\n"
	basegnuplotmem = basegnuplotmem + "set style data histograms\nset style fill solid\n"
	basegnuplotmem = basegnuplotmem + "set term png size 1024,480\n"
	basegnuplotmem = basegnuplotmem + "set output \"" + mempngfile + "\"\n"
	basegnuplotmem = basegnuplotmem + "unset key\n"
	basegnuplotmem = basegnuplotmem + "set yrange [0:100]\n"
	basegnuplotmem = basegnuplotmem + "set xtics ("
	for node in nodelist:
		realcount = 1
		mem_total = 0.0
		core_max = 0
		for poll_info in node.poll_list:
			if (poll_info.percentmem > mem_total):
				mem_total = float(poll_info.percentmem)
				core_max = poll_info.coremem
				
			#basegnuplotdata = basegnuplotdata + poll_info.date + "_" + poll_info.time + " " + poll_info.percentcpu + "\n"
			realcount += 1
		
		if (count < len(nodelist)):
			basegnuplotmem = basegnuplotmem + "\"" + node.name + "\" " + str(count - 1) + "," 
		else:
			basegnuplotmem = basegnuplotmem + "\"" + node.name + "\" " + str(count - 1) + ") rotate by -45\n"
			
		basegnuplotdata = basegnuplotdata + str(count) + "\t" + str(mem_total) + "\t" + str(core_max) + "\t" + str(core_max) + "\t" + node.name + "\n"
		count = count + 1
		
	#basegnuplotmem = basegnuplotmem + "plot \"" + cpudatafile + "\" using 1:2 with linespoints\n"
	basegnuplotmem = basegnuplotmem + "plot \"" + memdatafile + "\" u 2\n"

	writefile = open(memdatafile,'w')
	writefile.write(basegnuplotdata)
	writefile.close()

	writefile = open(memplotfile,'w')
	writefile.write(basegnuplotmem)
	writefile.close()

	if (do_plot):
		os.system("gnuplot " + memplotfile)

		
	#end memory usage plotting


	#Add in plotting of CPU hosts replaced real time information
	plotfilelist = []
	plotnamelist = []
	count = 1;
	allavgcpu = 0
	allcpucount = 0
	for node in nodelist:
		realcount = 1
		cpudatafile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_hosts_replaced_realtime.data"
		cpuplotfile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_hosts_replaced_realtime.gnuplot"
		cpupngfile =  base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_hosts_replaced_realtime.png"
		basegnuplotdata = ""
		basegnuplotcpu = "set title \"CPU Usage for Trial " + str(trialnum) + ", process " + node.name + "\"\n"
		basegnuplotcpu = basegnuplotcpu + "set ylabel \"Percent CPU\"\n"
		basegnuplotcpu = basegnuplotcpu + "set xlabel \"Date/Time\"\n"
		basegnuplotcpu = basegnuplotcpu + "set term png\n"
		basegnuplotcpu = basegnuplotcpu + "set output \"" + cpupngfile + "\"\n"
		#basegnuplotcpu = basegnuplotcpu + "set nokey\n"
		basegnuplotcpu = basegnuplotcpu + "samples(x) = $0 > 4 ? 5 : ($0+1)\n"
		basegnuplotcpu = basegnuplotcpu + "avg5(x) = (shift5(x), (back1+back2+back3+back4+back5)/samples($0))\n"
		basegnuplotcpu = basegnuplotcpu + "shift5(x) = (back5 = back4, back4 = back3, back3 = back2, back2 = back1, back1 = x)\n"
		basegnuplotcpu = basegnuplotcpu + "init(x) = (back1 = back2 = back3 = back4 = back5 = sum = 0)\n"
		basegnuplotcpu = basegnuplotcpu + "set xdata time\n"
		basegnuplotcpu = basegnuplotcpu + "set timefmt \"%Y-%m-%d_%H\:%M\:%S\"\n"
		basegnuplotcpu = basegnuplotcpu + "set yrange [0:*]\n"
		#basegnuplotcpu = basegnuplotcpu + "set boxwidth 1\n"
		#basegnuplotcpu = basegnuplotcpu + "set xtics ("

		avgcpu = 0
		for poll_info in node.poll_list_hosts_replaced:
			avgcpu = avgcpu + float(poll_info.percentcpu)
			basegnuplotdata = basegnuplotdata + poll_info.date + "_" + poll_info.time + " " + poll_info.percentcpu + "\n"
			realcount += 1
		if (len(node.poll_list_hosts_replaced) > 0):
			avgcpu = avgcpu / len(node.poll_list_hosts_replaced)
		plotfilelist.append(cpudatafile)
		plotnamelist.append(node.name)
		basegnuplotcpu = basegnuplotcpu + "plot sum = init(0), \"" + cpudatafile + "\" using 1:2 with lines ti \"Raw CPU Data\", \"" + cpudatafile + "\" using 1:(avg5($2)) with lines lw 3 ti \"5 point running avg\"\n"
		#basegnuplotcpu = basegnuplotcpu + "plot \"" + cpudatafile + "\" using 1:2 with linespoints\n"

		writefile = open(cpudatafile,'w')
		writefile.write(basegnuplotdata)
		writefile.close()

		writefile = open(cpuplotfile,'w')
		writefile.write(basegnuplotcpu)
		writefile.close()

		if (do_plot) and (len(node.poll_list_hosts_replaced) > 0):
			os.system("gnuplot " + cpuplotfile)
			if (count % 2 == 1):
				base_html = base_html + "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><b>Realtime hosts_replaced CPU Usage Graph for " + node.name + "</b></td>\n"
				temphtml = "\t\t<tr>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_cpu_hosts_replaced_realtime.png" + "\"/></td>\n"
			else:
				base_html = base_html + "\t\t\t<td style=\"text-align:center\"><b>Realtime hosts_replaced CPU Usage Graph for " + node.name + "</b></td></tr>\n" + temphtml + "\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_cpu_hosts_replaced_realtime.png" + "\"/></td>\n\t\t</tr>\n"
				temphtml = ""
			count = count + 1


	#Add in plotting of CPU tee real time information
	plotfilelist = []
	plotnamelist = []
	cpuavghash = {}
	count = 1;
	for node in nodelist:
		templist = [0, 0]
		basestring = re.sub(r'[0-9]', '', node.name)
		cpuavghash[basestring] = Average(basestring, 0, 0)
	for node in nodelist:
		basestring = re.sub(r'[0-9]', '', node.name)
		realcount = 1
		cpudatafile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_realtime.data"
		cpuplotfile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_realtime.gnuplot"
		cpupngfile =  base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_cpu_realtime.png"
		basegnuplotdata = ""
		basegnuplotcpu = "set title \"CPU Usage for Trial " + str(trialnum) + ", process " + node.name + "\"\n"
		basegnuplotcpu = basegnuplotcpu + "set ylabel \"Percent CPU\"\n"
		basegnuplotcpu = basegnuplotcpu + "set xlabel \"Date/Time\"\n"
		basegnuplotcpu = basegnuplotcpu + "set term png\n"
		basegnuplotcpu = basegnuplotcpu + "set output \"" + cpupngfile + "\"\n"
		#basegnuplotcpu = basegnuplotcpu + "set nokey\n"
		basegnuplotcpu = basegnuplotcpu + "set xdata time\n"
		basegnuplotcpu = basegnuplotcpu + "samples(x) = $0 > 4 ? 5 : ($0+1)\n"
		basegnuplotcpu = basegnuplotcpu + "avg5(x) = (shift5(x), (back1+back2+back3+back4+back5)/samples($0))\n"
		basegnuplotcpu = basegnuplotcpu + "shift5(x) = (back5 = back4, back4 = back3, back3 = back2, back2 = back1, back1 = x)\n"
		basegnuplotcpu = basegnuplotcpu + "init(x) = (back1 = back2 = back3 = back4 = back5 = sum = 0)\n"

		basegnuplotcpu = basegnuplotcpu + "set timefmt \"%Y-%m-%d_%H\:%M\:%S\"\n"
		basegnuplotcpu = basegnuplotcpu + "set yrange [0:*]\n"
		#basegnuplotcpu = basegnuplotcpu + "set boxwidth 1\n"
		#basegnuplotcpu = basegnuplotcpu + "set xtics ("

		avgcpu = 0
		for poll_info in node.poll_list:
			avgcpu = avgcpu + float(poll_info.percentcpu)
			cpuavghash[basestring].count += 1
			cpuavghash[basestring].average += float(poll_info.percentcpu)
			#allavgcpu = allavgcpu + float(poll_info.percentcpu)
			#allcpucount += 1
			basegnuplotdata = basegnuplotdata + poll_info.date + "_" + poll_info.time + " " + poll_info.percentcpu + "\n"
			realcount += 1
		if (len(node.poll_list) > 0):
			avgcpu = avgcpu / len(node.poll_list)
			plotfilelist.append(cpudatafile)
		plotnamelist.append(node.name)
		basegnuplotcpu = basegnuplotcpu + "plot sum = init(0), \"" + cpudatafile + "\" using 1:2 with lines ti \"Raw CPU Data\", \"" + cpudatafile + "\" using 1:(avg5($2)) with lines lw 3 ti \"5 point running avg\"\n"
		#basegnuplotcpu = basegnuplotcpu + "plot \"" + cpudatafile + "\" using 1:2 with linespoints\n"

		writefile = open(cpudatafile,'w')
		writefile.write(basegnuplotdata)
		writefile.close()

		writefile = open(cpuplotfile,'w')
		writefile.write(basegnuplotcpu)
		writefile.close()

		if (do_plot) and (len(node.poll_list) > 0):
			os.system("gnuplot " + cpuplotfile)
			if (count % 2 == 1):
				base_html = base_html + "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><b>Realtime CPU Usage Graph for " + node.name + "</b><br>Avg CPU (mean) " + str(avgcpu) + "</td>\n"
				temphtml = "\t\t<tr>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_cpu_realtime.png" + "\"/></td>\n"
			else:
				base_html = base_html + "\t\t\t<td style=\"text-align:center\"><b>Realtime CPU Usage Graph for " + node.name + "</b><br>Avg CPU (mean) " + str(avgcpu) + "</td></tr>\n" + temphtml + "\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_cpu_realtime.png" + "\"/></td>\n\t\t</tr>\n"
				temphtml = ""
			count = count + 1			
	
	#PLot all CPU data on the same plot for comparison
	cpuplotfile = base_dir + "/data/trial-" + str(trialnum) + "-ALL_cpu_realtime.gnuplot"
	cpupngfile = base_dir + "/data/trial-" + str(trialnum) + "-ALL_cpu_realtime.png"
	basegnuplotdata = ""
	basegnuplotcpu = "set title \"CPU Usage for Trial " + str(trialnum) + ", ALL processes \n"
	basegnuplotcpu = basegnuplotcpu + "set ylabel \"Percent CPU\"\n"
	basegnuplotcpu = basegnuplotcpu + "set xlabel \"Date/Time\"\n"
	basegnuplotcpu = basegnuplotcpu + "set term png size 1024,480\n"
	basegnuplotcpu = basegnuplotcpu + "set output \"" + cpupngfile + "\"\n"
	basegnuplotcpu = basegnuplotcpu + "set key outside right\n"
	basegnuplotcpu = basegnuplotcpu + "set yrange [0:100]\n"
	basegnuplotcpu = basegnuplotcpu + "samples(x) = $0 > 4 ? 5 : ($0+1)\n"
	basegnuplotcpu = basegnuplotcpu + "avg5(x) = (shift5(x), (back1+back2+back3+back4+back5)/samples($0))\n"
	basegnuplotcpu = basegnuplotcpu + "shift5(x) = (back5 = back4, back4 = back3, back3 = back2, back2 = back1, back1 = x)\n"
	basegnuplotcpu = basegnuplotcpu + "init(x) = (back1 = back2 = back3 = back4 = back5 = sum = 0)\n"
	basegnuplotcpu = basegnuplotcpu + "set xdata time\n"
	basegnuplotcpu = basegnuplotcpu + "set timefmt \"%Y-%m-%d_%H\:%M\:%S\"\n"
	basegnuplotcpu = basegnuplotcpu + "plot sum = init(0),"
	newcount = 0
	listlen = len(plotfilelist)
	for file in plotfilelist:
		#print ("newcount is %d sizeof is %d" %  (newcount, listlen))
		if (newcount < listlen - 1):
			basegnuplotcpu = basegnuplotcpu + "\"" + file + "\" using 1:(avg5($2)) with lines ti \"" + plotnamelist[newcount] + "\", "
		else:
			basegnuplotcpu = basegnuplotcpu + "\"" + file + "\" using 1:(avg5($2)) with lines ti \"" + plotnamelist[newcount] + "\"\n"
		newcount = newcount + 1
		
	writefile = open(cpuplotfile,'w')
	writefile.write(basegnuplotcpu)
	writefile.close()
	
	if (do_plot) and (listlen > 0):
		os.system("gnuplot " + cpuplotfile)
		base_html = base_html + "\t\t<tr>\n\t\t\t<td colspan=2 style=\"text-align:center\"><b>Realtime CPU Usage Graph for ALL Processes</b>"
		for avg in cpuavghash:
			if (cpuavghash[avg].count > 0):
				base_html = base_html + "<br>CPU average for " + avg + " processes " + str(cpuavghash[avg].average / cpuavghash[avg].count)	
		base_html = base_html + "</td>\n\t\t</tr>\n"
		base_html = base_html + "\t\t<tr>\n\t\t\t<td colspan=2 style=\"text-align:center\"><img src=\"" + "trial-" + str(trialnum) + "-ALL_cpu_realtime.png" + "\"/></td>\n\t\t</tr>\n"
	
	#Add in plotting of stand alone syscall information
	for node in nodelist:
		count = 1
		realcount = 1
		syscalldatafile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_syscall.data"
		syscallplotfile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_syscall.gnuplot"
		syscallplotfile_percentage = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_syscall_percentage.gnuplot"
		syscallpngfile =  base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_syscall.png"
		syscallpngfile_percentage =  base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "_syscall_percentage.png"
		basegnuplotdata = ""
		basegnuplotsyscall = "set title \"Syscall info for Trial " + str(trialnum) + ", process " + node.name + "\"\n"
		basegnuplotsyscall = basegnuplotsyscall + "set ylabel \"Times called\"\n"
		basegnuplotsyscall = basegnuplotsyscall + "set xlabel \"Syscall\"\n"
		basegnuplotsyscall = basegnuplotsyscall + "set term png\nset style data histograms\nset style fill solid\n"
		basegnuplotsyscall = basegnuplotsyscall + "set output \"" + syscallpngfile + "\"\n"
		basegnuplotsyscall = basegnuplotsyscall + "set nokey\n"
		basegnuplotsyscall = basegnuplotsyscall + "set boxwidth 1\n"
		
		basegnuplotsyscall = basegnuplotsyscall + "set xtics ("
	
		for syscall_info in node.syscall_list:
			if (realcount < len(node.syscall_list)):
				basegnuplotsyscall = basegnuplotsyscall + "\"" + syscall_info.cmd + "\" " + str(realcount - 1) + "," 
			else:
				basegnuplotsyscall = basegnuplotsyscall + "\"" + syscall_info.cmd + "\" " + str(realcount - 1) + ") rotate by -45\n"
			#print "num is: " + syscall_info.num
			basegnuplotdata = basegnuplotdata + str(realcount - 1) + " " + syscall_info.num + " " + syscall_info.percentage + "\n"
			count += 5
			realcount += 1
			
		#basegnuplotsyscall = basegnuplotsyscall + "set xtics offset 0,-5\n"
		basegnuplotsyscallpercentage = basegnuplotsyscall + "set ylabel \"Percent time in syscall\"\n"
		basegnuplotsyscallpercentage = basegnuplotsyscallpercentage + "unset output\nset output \"" + syscallpngfile_percentage + "\"\n"
		basegnuplotsyscallpercentage = basegnuplotsyscallpercentage + "plot \"" + syscalldatafile + "\" u 3\n"
		basegnuplotsyscall = basegnuplotsyscall + "plot \"" + syscalldatafile + "\" u 2\n"

		writefile = open(syscalldatafile,'w')
		writefile.write(basegnuplotdata)
		writefile.close()

		writefile = open(syscallplotfile,'w')
		writefile.write(basegnuplotsyscall)
		writefile.close()
		
		writefile = open(syscallplotfile_percentage,'w')
		writefile.write(basegnuplotsyscallpercentage)
		writefile.close()

		if (do_plot) and len(node.syscall_list) > 0:
			os.system("gnuplot " + syscallplotfile_percentage)
			os.system("gnuplot " + syscallplotfile)
			base_html = base_html + "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><b>Syscall breakdown for " + node.name + "</b></td>\n\t\t\t<td style=\"text-align:center\"><b>Syscall breakdown (time spent by percentage) for " + node.name + "</b></td>\n\t\t</tr>\n"
			base_html = base_html +  "\t\t<tr>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_syscall.png" + "\"/></td>\n\t\t\t<td><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "_syscall_percentage.png" + "\"/></td>\n\t\t</tr>\n"

	#Create throughput graphs for each edge
	plotfilelist = []
	plottitlelist = []
	temp_html = ""
	count = 0
	for node in nodelist:
		for out_edge in node.out_edge_list:
			basegnuplotdata = "" 
			throughputdatafile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "-" + out_edge.to_node + "-" + str(out_edge.fd) + "_throughput.data"
			throughputplotfile = base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "-" + out_edge.to_node + "-" + str(out_edge.fd) + "_throughput.gnuplot"
			throughputpngfile =  base_dir + "/data/trial-" + str(trialnum) + "-" + node.name + "-" + out_edge.to_node + "-" + str(out_edge.fd) + "_throughput.png"
			basegnuplot = "set title \"node " + node.name + " to " + out_edge.to_node + "-" + str(out_edge.fd) +  " Throughput\"\n"
			basegnuplot = basegnuplot + "set term png\n"
			#basegnuplot = basegnuplot + "set key off\n"
			basegnuplot = basegnuplot + "set output \"" + throughputpngfile + "\"\n"
			basegnuplot = basegnuplot + "set xlabel \"Seconds\"\n"
			basegnuplot = basegnuplot + "samples(x) = $0 > 4 ? 5 : ($0+1)\n"
			basegnuplot = basegnuplot + "avg5(x) = (shift5(x), (back1+back2+back3+back4+back5)/samples($0))\n"
			basegnuplot = basegnuplot + "shift5(x) = (back5 = back4, back4 = back3, back3 = back2, back2 = back1, back1 = x)\n"
			basegnuplot = basegnuplot + "init(x) = (back1 = back2 = back3 = back4 = back5 = sum = 0)\n"

			
			if (len(out_edge.datum_list) > 1):
				temptitle = node.name + ":" + str(out_edge.fd) + " to " + out_edge.to_node
				plottitlelist.append(temptitle)
				plotfilelist.append(throughputdatafile)
				avg_bytes = 0
				for datum in out_edge.datum_list:
					avg_bytes += datum.bytes
				avg_bytes = avg_bytes / len(out_edge.datum_list)
				
				for datum in out_edge.datum_list:
					basegnuplotdata = basegnuplotdata + str(datum.second) + "\t" + str(datum.bytes / 1024) + "\n"
	
				basegnuplot = basegnuplot + "set ylabel \"KBytes transferred\"\n"
				basegnuplot = basegnuplot + "plot sum = init(0), \"" + throughputdatafile + "\" with lines ti \"Raw data\", \"" + throughputdatafile + "\" using 1:(avg5($2)) with lines lw 3 ti \"5 point running avg\"\n"
				
				writefile = open(throughputdatafile,'w')
				writefile.write(basegnuplotdata)
				writefile.close()
		
				writefile = open(throughputplotfile,'w')
				writefile.write(basegnuplot)
				writefile.close()
	
				if (do_plot):
					os.system("gnuplot " + throughputplotfile)
					if (temp_html == ""):
						base_html = base_html + "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><b>Throughput for " + node.name + " to " + out_edge.to_node + "-" + str(out_edge.fd) + "</b><br>Avg. throughput (mean) " + str(avg_bytes/1024) + " KiB/s</td>\n"			
						temp_html = "\t\t<tr>\n\t\t\t<td style=\"text-align:center\"><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "-" + out_edge.to_node + "-" + str(out_edge.fd) + "_throughput.png" + "\"</td>\n"
					else:
						base_html = base_html + "\t\t\t<td style=\"text-align:center\"><b>Throughput for " + node.name + " to " + out_edge.to_node + "-" + str(out_edge.fd) + "</b><br>Avg. throughput (mean) " + str(avg_bytes/1024) + " KiB/s</td>\n\t\t</tr>\n"
						base_html = base_html + temp_html 
						base_html = base_html + "\t\t\t<td style=\"text-align:center\"><img src=\"" + "trial-" + str(trialnum) + "-" + node.name + "-" + out_edge.to_node + "-" + str(out_edge.fd) + "_throughput.png" + "\"</td>\n\t\t</tr>\n"
						temp_html = ""
					
	if (temp_html != ""):
		base_html = base_html + temp_html
		base_html = base_html + "\t\t\t</tr>\n"
		
	throughputplotfile =  base_dir + "/data/trial-" + str(trialnum) + "-ALL_throughput.gnuplot"
	throughputpngfile =  base_dir + "/data/trial-" + str(trialnum) + "-ALL_throughput.png"  			
	basegnuplot = "set title \"node to node Throughput over time\"\n"
	basegnuplot = basegnuplot + "set term png\n"
	#basegnuplot = basegnuplot + "set key off\n"
	basegnuplot = basegnuplot + "set output \"" + throughputpngfile + "\"\n"
	basegnuplot = basegnuplot + "set xlabel \"Seconds\"\n"
	basegnuplot = basegnuplot + "set ylabel \"KBytes transferred\"\n"
	basegnuplot = basegnuplot + "samples(x) = $0 > 4 ? 5 : ($0+1)\n"
	basegnuplot = basegnuplot + "avg5(x) = (shift5(x), (back1+back2+back3+back4+back5)/samples($0))\n"
	basegnuplot = basegnuplot + "shift5(x) = (back5 = back4, back4 = back3, back3 = back2, back2 = back1, back1 = x)\n"
	basegnuplot = basegnuplot + "init(x) = (back1 = back2 = back3 = back4 = back5 = sum = 0)\n"
	basegnuplot = basegnuplot + "plot init(0), "
	count = 0
	listlen = len(plotfilelist)
	for plotfile in plotfilelist:
		if (count < listlen - 1):
			basegnuplot = basegnuplot + "\"" +  plotfile + "\" using 1:(avg5($2)) with lines ti \"" + plottitlelist[count] + "\", "
		else:
			basegnuplot = basegnuplot + "\"" + plotfile + "\" using 1:(avg5($2)) with lines ti \"" + plottitlelist[count] + "\"\n"
		count += 1

	writefile = open(throughputplotfile,'w')
	writefile.write(basegnuplot)
	writefile.close()		
	
	if (do_plot) and listlen > 0:
		os.system("gnuplot " + throughputplotfile)
		base_html = base_html + "\t\t<tr>\n\t\t\t<td colspan=2 style=\"text-align:center\"><b>Throughput for ALL edges</b></td>\n\t\t</tr>\n"			
		base_html = base_html + "\t\t<tr>\n\t\t\t<td colspan=2 style=\"text-align:center\"><img src=\"" + "trial-" + str(trialnum) + "-ALL_throughput.png" + "\"</td>\n\t\t</tr>\n"

	
	return base_html


try:
	base_dir = sys.argv[1]
except:
	print "Error, need a path to data directory!"
	sys.exit()

try:
	doc = minidom.parse(base_dir + "/data/data.xml")
except(IOError):
	print "Couldn't open file " + base_dir + "/data/data.xml !"
	sys.exit()
node_list = []
parent = doc.documentElement

base_html = "<html>\n<body>\n\t<center>\n\t<table>\n"

for child in parent.childNodes:
	count = 0
	if (child.nodeType == 1) and (child.localName != "network_data") and (child.localName != "cpu_data"):
		#print "Parsing node"
		#number, tempnodelist = parseNode(child)
		trial, tempnodelist = parseNodes(child)
		count += 1
		if (trial >= 0):
			base_html = base_html + "\t<tr><td><h2>Trial #" + str(trial) + "</td></tr></h2>\n"
		else:
			base_html = base_html + "\t<tr><td><h2>Base Config</td></tr></h2>\n"
		base_html = generateGraphviz(tempnodelist, trial, base_dir, True, base_html)
		base_html = base_html + "\t</table>\n"
		base_html = getTotalTime(tempnodelist, base_html)
		base_html = base_html + "\n\t<table>\n"
		if (trial > 0):
			base_html = generateGNUplot(tempnodelist, trial, base_dir, True, base_html)
		base_html = base_html + "\t</table>\n"
	elif (child.nodeType ==1) and (child.localName == "network_data"):
		base_html = base_html + "\n\t<table>"
		base_html = generateGraphvizNetData(child, base_dir, True, base_html);

base_html = base_html + "\t</table>\n\t</center>\n</body>\n</html>\n"
#print base_html
writefile = open(base_dir + "/data/index.html",'w')
writefile.write(base_html)
writefile.close()
