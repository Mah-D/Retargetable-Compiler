#!/bin/bash

exe="tail"
base=perf_tail
RUNS=3

echo -n "Benchmarking TAIL on "
uname -a
echo -n "Preparing line-based input..."
rm -rf $base.in $base.in0
for n in `seq 1 100`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" >> $base.in0
done
for n in `seq 0 17`
do
  echo -n "$n "
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done
echo ""

# ----------------------------------------------------------------------------------
for n in 10000 100000 1000000
do
echo -n "PERF: tail with N=$n: "
for i in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe -n $n < $base.in > /dev/null
 END=`./mstime`
 TOTAL=`expr 80 \* $n`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"
done

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

