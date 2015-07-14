#!/bin/bash

exe=./fanout
base=perf_fanout
RUNS=3

echo -n "Benchmarking FANOUT on "
uname -a
echo "Preparing line-based input..."
rm -rf $base.in $base.in0
for n in `seq 1 100`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" >> $base.in0
done
for n in `seq 0 14`
do
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done

# ----------------------------------------------------------------------------------
echo -n "PERF: line-based with 1 outputs: "
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
echo -n "PERF: line-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: line-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------

echo "Preparing record-based input..."
rm -rf $base.in
dd if=/dev/zero of=$base.in count=65536 ibs=8000 &> /dev/null

# ----------------------------------------------------------------------------------
echo -n "PERF: 80b record-based with 1 output: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 80b record-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 3> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 80b record-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 3> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"


# ----------------------------------------------------------------------------------
echo -n "PERF: 64k record-based with 1 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 64k record-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 3> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: 64k record-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 3> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

