#!/bin/bash

exe="./lookup"
base=perf_lookup
RUNS=3

echo -n "Benchmarking LOOKUP on "
uname -a
echo "Preparing line-based input..."
rm -rf $base.in $base.in0 
for n in `seq 1 200`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$n" >> $base.in0
done
for n in `seq 0 12`
do
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done

# ----------------------------------------------------------------------------------

for k in 1 10 100
do
  rm -rf $base.keys
  for n in `seq 1 $k`
  do 
    echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA$n" >> $base.keys
  done

  echo -n "PERF: lookup with $k keys: "
  for i in `seq 1 $RUNS`
  do
   START=`./mstime`
   $exe < $base.in 3< $base.keys > /dev/null 4> /dev/null 5> /dev/null
   END=`./mstime`
   TOTAL=`du -b $base.in | awk '{print $1}'`
   DELTA=`expr $END - $START`
   BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
   echo -n "$BPS "
  done
  echo " kb/second (total: $TOTAL, time $DELTA ms)"
done


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out $base.keys

