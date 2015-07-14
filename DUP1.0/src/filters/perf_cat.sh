#!/bin/bash

exe="cat -"
base=perf_cat
RUNS=3

echo -n "Benchmarking CAT on "
uname -a

echo "Preparing input..."
rm -rf $base.in
dd if=/dev/zero of=$base.in count=65536 ibs=8000 &> /dev/null

# ----------------------------------------------------------------------------------
echo -n "PERF: "
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
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

