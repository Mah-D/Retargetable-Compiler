#!/bin/bash

# Simple wrapper to run dprof with some normal options on a config file

configfile=${1:?Please enter a valid dup config file path}
datadir=${2:?Enter a path for data to be stored}
my_ip=${3:?supply local ip address}
basefilename=$4
hostfile=$5

echo "Preparing and running tests for $configfile"
echo "Will store data and intermediate config files in $datadir"
echo "Your host should be $my_ip (or this is the host on which data will be collected)"

#echo basename $configfile .dup
if [ $# -lt 4 ]
then
  basefilename=`basename $configfile .dup`
fi
echo basefilename is ${basefilename}
datadir=${datadir}/$basefilename
i=0
actualdatadir=${datadir}_$i

if [ $# -lt 5 ] ; then
  i=0
  while [ -d $actualdatadir ]
  do
  i=`expr $i \+ 1`
  actualdatadir=${datadir}_$i
  done
  echo dprof -c $configfile -T $actualdatadir -p 2222 -H $my_ip -P -m -C -N -r
  dprof -c $configfile -T $actualdatadir -p 2222 -H $my_ip -P -m -C -N -r
else
  i=0
  actualdatadir=${actualdatadir}_remote
  while [ -d $actualdatadir ]
  do
  i=`expr $i \+ 1`
  actualdatadir=${datadir}_$i
  actualdatadir=${actualdatadir}_remote
  done
  echo dprof -c $configfile -T $actualdatadir -p 2222 -H $my_ip -r -P -m -C -N -A $hostfile
  dprof -c $configfile -T $actualdatadir -p 2222 -H $my_ip -r -P -m -N -C -A $hostfile
fi
if [ $? -gt 0 ] ; then
  echo dprof returned badly, exiting
  exit 1
fi

### Run local config, to get single host benchmark ###
echo "Start local testing..."
sleep 2
echo dup -c $configfile
echo cd to `dirname $configfile`
cd `dirname $configfile`
`which time` -o ${actualdatadir}/approximate_local_seconds.txt -f %e dup -c $configfile
echo "End local testing..."
### End local testing ###

### Run the teed config, captures all data passing between processes ###
echo "Start tee data gathering..."
echo dup -c $actualdatadir/tee-0.conf
`which time` -o ${actualdatadir}/base_tee_data-0/approximate_tee_seconds.txt -f %e dup -c $actualdatadir/tee-0.conf
echo "End tee data gathering..."
### End teed config section ###

### Run base config, spread across remote machines ###
if [ $# -gt 7 ]
then
  echo "Start remote testing..."
  echo dup -c $actualdatadir/hosts_replaced.conf
  `which time` -o ${actualdatadir}/approximate_base_seconds.txt -f %e dup -c $actualdatadir/hosts_replaced.conf
  echo "End remote testing..."
  ### End run base config ###
fi

echo "Main testing done, starting individual filter testing..."
for i in ${actualdatadir}/network_data/*.conf ${actualdatadir}/base_tee_data-0/*.conf ${actualdatadir}/cpu_data/*.conf;do echo $i;dup -c $i;done
#for i in ${actualdatadir}/network_data/*.conf;do echo $i;dup -c $i;done
echo "Testing finished!"
tempdir=${actualdatadir}/
echo "Fixing psdata files... fix_psdata_files.pl $tempdir"
fix_psdata_files.pl $tempdir
echo "Running dup analysis preprocessor..."
dupap -d $tempdir
echo "Creating graphs and html"
dup_analysis_grapher.py $tempdir
#killall dupd
echo "Finished"
