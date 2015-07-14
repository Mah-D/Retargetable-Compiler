#!/bin/bash

if [ $# -lt 1 ]
then
    echo "Wrong syntax. Should be $0 NUM_PIDS [INTERVAL]"
    exit
fi
count=0
numpids=$1

if [ $# = 1 ]
then
    interval=1
fi

if [ $# = 2 ]
then
    interval=$2
fi

while [ $count -lt $numpids ]
do
    read tempin
    #echo $tempin
    pidarr[$count]=`echo $tempin | awk '{print $1}'`
    processarr[$count]=`echo $tempin | awk '{print $2}'`
    #read pidarr[$count]
    #read processarr[$count]
    count=`expr $count + 1`
done

countminusone=`expr $count - 1`
pidstring=""
for i in `seq 0 $count`
do
    if [ $i -lt $countminusone ]
    then
        pidstring=$pidstring${pidarr[$i]}","
	idstring=$idstring${processarr[$i]}","
    else
        pidstring=$pidstring${pidarr[$i]}
	idstring=$idstring${processarr[$i]}
    fi
done

echo $pidstring
echo $idstring

i=`ps -p $pidstring h -o comm | wc -l`
if [ $i -gt 0 ]
then
    echo "YYYY-MM-DD HH:MM:SS:N CMD     %CPU     %MEM     CPUTIME     ELAPSED     MEMRES     COREMEM     VMEM	PID"
fi

while [ $i -gt 1 ]
do
  echo `date +%Y-%m-%d\ %H:%M:%S:%N` `top -p $pidstring -b -n 1 -d 1`
  #echo `date +%Y-%m-%d\ %H:%M:%S:%N` `ps -p $pidstring h -o comm,%cpu,%mem,cputime,etime,rss,sz,vsize,pid`
  sleep $interval
  i=`ps -p $pidstring h -o comm | wc -l`
done
