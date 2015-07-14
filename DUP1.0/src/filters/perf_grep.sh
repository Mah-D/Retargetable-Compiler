#!/bin/bash

exe="grep AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
base=perf_grep
RUNS=3

echo -n "Benchmarking GREP on "
uname -a
echo -n "Preparing line-based input... "
rm -rf $base.in $base.in0
for n in `seq 1 5`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" >> $base.in0
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAb" >> $base.in0
done
for n in `seq 0 16`
do
  echo -n "$n "
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done
echo ""

# ----------------------------------------------------------------------------------
echo -n "PERF: grep: "
for i in `seq 1 $RUNS`
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

