#!/bin/bash

exe=./deal
base=perf_deal
RUNS=3

echo -n "Benchmarking DEAL on "
uname -a
echo "Preparing line-based input..."
rm -rf $base.in $base.in0
for n in `seq 1 100`
do
  echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" >> $base.in0
done
for n in `seq 0 16`
do
  cat $base.in0 >> $base.in
  cp $base.in $base.in0
done

# ----------------------------------------------------------------------------------
echo -n "PERF: RR line-based with 1 outputs: "
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
echo -n "PERF: RR line-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: RR line-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 5> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"


# ----------------------------------------------------------------------------------
echo -n "PERF: ANY line-based with 1 outputs: "
LINES=`wc -l $base.in`
echo "0" | ./duplicate $LINES > $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.order > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY line-based with 2 outputs: "
LD2=`expr $LINES / 2`
echo "0" | ./duplicate $LD2 > $base.order
echo "5" | ./duplicate $LD2 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.order 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY line-based with 3 outputs: "
LD3=`expr $LINES / 3`
LD32=`expr $LD3 \* 2`
echo "0" | ./duplicate $LD3 > $base.order
echo -e "5\n4" | ./duplicate $LD32 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe < $base.in 3< $base.order 5> /dev/null 4> /dev/null > /dev/null
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
dd if=/dev/zero of=$base.in count=6553600 ibs=80 &> /dev/null

# ----------------------------------------------------------------------------------
echo -n "PERF: RR 80b record-based with 1 output: "
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
echo -n "PERF: RR 80b record-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: RR 80b record-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 5> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"



# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 80b record-based with 1 outputs: "
LINES=`wc -c $base.in`
LINES=`expr $LINES / 80`
echo "0" | ./duplicate $LINES > $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 3< $base.order > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 80b record-based with 2 outputs: "
LD2=`expr $LINES / 2`
echo "0" | ./duplicate $LD2 > $base.order
echo "5" | ./duplicate $LD2 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 3< $base.order 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 80b record-based with 3 outputs: "
LD3=`expr $LINES / 3`
LD32=`expr $LD3 \* 2`
echo "0" | ./duplicate $LD3 > $base.order
echo -e "5\n4" | ./duplicate $LD32 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 80 < $base.in 3< $base.order 5> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"




# ----------------------------------------------------------------------------------
echo -n "PERF: RR 64k record-based with 1 outputs: "
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
echo -n "PERF: RR 64k record-based with 2 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: RR 64k record-based with 3 outputs: "
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 5> /dev/null 4> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 3000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"


# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 64k record-based with 1 outputs: "
LINES=`wc -c $base.in`
LINES=`expr $LINES / 65536`
echo "0" | ./duplicate $LINES > $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 3< $base.order > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 1000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 80b record-based with 2 outputs: "
LD2=`expr $LINES / 2`
echo "0" | ./duplicate $LD2 > $base.order
echo "5" | ./duplicate $LD2 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 3< $base.order 5> /dev/null > /dev/null
 END=`./mstime`
 TOTAL=`du -b $base.in | awk '{print $1}'`
 DELTA=`expr $END - $START`
 BPS=`expr 2000 \* $TOTAL / 1024 / $DELTA`
 echo -n "$BPS "
done
echo " kb/second (total: $TOTAL, time $DELTA ms)"

# ----------------------------------------------------------------------------------
echo -n "PERF: ANY 80b record-based with 3 outputs: "
LD3=`expr $LINES / 3`
LD32=`expr $LD3 \* 2`
echo "0" | ./duplicate $LD3 > $base.order
echo -e "5\n4" | ./duplicate $LD32 >> $base.order
for n in `seq 1 $RUNS`
do
 START=`./mstime`
 $exe 65536 < $base.in 3< $base.order 5> /dev/null 4> /dev/null > /dev/null
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
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out $base.order

