#!/bin/bash

exe=./holmerge
base=perf_holmerge
RUNS=5

echo -n "Benchmarking HOLMERGE on "
uname -a
# ----------------------------------------------------------------------------------

echo "Preparing input..."
rm -rf $base.in
dd if=/dev/zero of=$base.in count=65536 ibs=8000 &> /dev/null

# ----------------------------------------------------------------------------------
echo -n "PERF: 1 inputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 2 inputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: 2x $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 3 inputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.in 4< $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: 3x $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 10 inputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.in 4< $base.in 5< $base.in 6< $base.in 7< $base.in 8< $base.in 9< $base.in 10< $base.in 11< $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 10000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: 10x $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

