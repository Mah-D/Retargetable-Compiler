#!/bin/bash

exe="head"
base=perf_head
RUNS=3

echo -n "Benchmarking HEAD on "
uname -a
echo -n "Preparing line-based input..."
rm -rf $base.in $base.in0
for n in `seq 1 256`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" >> $base.in0
done
for n in `seq 0 16`
do
  echo -n "$n "
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done
echo ""

# ----------------------------------------------------------------------------------
for n in 65536 1048576 16777216
do
echo -n "PERF: head with N=$n: "
for i in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe -n $n < $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr $n \* 81 / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"
done

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

