#!/bin/bash

exe=./faninany
base=$TMPDIR/perf_faninany


echo -n "SETUP: inputs..."

for n in `seq 1 10`
do
  echo -n "0123456789" >> $base.in
  cp $base.in $base.line
  /bin/echo "" >> $base.line
  s=`expr 1 + $n % 3`
  for j in `seq 1 $s 10`
  do
    cat $base.line >> $base.lin
    for i in `seq 10 $j 100` 
    do
      cat $base.lin >> $base.lin.$j
    done
  done
done

echo "Done."


echo -n "PERF: newline-based, 3 inputs..."

START=`./mstime`
if ! $exe < $base.lin.6  3< $base.lin.4 5<$base.lin.7 >$base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
END=`./mstime`
SUM=`cat $base.lin.6 $base.lin.4 $base.lin.7 | wc -c`
HAVE=`cat $base.out | wc -c`
if (test $HAVE != $SUM ); then
    echo "FAIL: incorrect number of output characters (want $SUM, got $HAVE)"
    exit 1
fi
DELTA=`expr $END - $START`
RATIO=`expr $SUM / $DELTA`
echo "$SUM characters in $DELTA ms ($RATIO b/ms)"



echo -n "PERF: newline-based, 6 inputs..."

START=`./mstime`
if ! $exe < /dev/null 4< $base.lin.2 5< $base.lin.6 6< $base.lin.3 7< $base.lin.9 9< $base.lin.4 >$base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
END=`./mstime`
SUM=`cat $base.lin.2 $base.lin.6 $base.lin.3 $base.lin.9 $base.lin.4 | wc -c`
HAVE=`cat $base.out | wc -c`
if (test $HAVE != $SUM ); then
    echo "FAIL: incorrect number of output characters (want $SUM, got $HAVE)"
    exit 1
fi
DELTA=`expr $END - $START`
RATIO=`expr $SUM / $DELTA`
echo "$SUM characters in $DELTA ms ($RATIO b/ms)"



echo -n "PERF: newline-based, 1 input..."

START=`./mstime`
if ! $exe < $base.lin.1 >$base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
END=`./mstime`
SUM=`cat $base.lin.1 | wc -c`
HAVE=`cat $base.out | wc -c`
if (test $HAVE != $SUM ); then
    echo "FAIL: incorrect number of output characters (want $SUM, got $HAVE)"
    exit 1
fi
DELTA=`expr $END - $START`
RATIO=`expr $SUM / $DELTA`
echo "$SUM characters in $DELTA ms ($RATIO b/ms)"


rm -f $base.*

echo -n "SETUP: large inputs..."

for n in `seq 1 8`
do
  echo -n "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789" >> $base.in
  cp $base.in $base.line
  /bin/echo "" >> $base.line
  s=`expr 1 + $n % 3`
  for j in `seq 1 $s 10`
  do
    cat $base.line >> $base.lin
    for i in `seq 10 $j 100` 
    do
      cat $base.lin >> $base.lin.$j
    done
  done
done

echo "Done."


echo -n "PERF: extra-long newline-based, 3 inputs..."

START=`./mstime`
if ! $exe < $base.lin.6  3< $base.lin.4 5<$base.lin.7 >$base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
END=`./mstime`
SUM=`cat $base.lin.6 $base.lin.4 $base.lin.7 | wc -c`
HAVE=`cat $base.out | wc -c`
if (test $HAVE != $SUM ); then
    echo "FAIL: incorrect number of output characters (want $SUM, got $HAVE)"
    exit 1
fi
DELTA=`expr $END - $START`
RATIO=`expr $SUM / $DELTA`
echo "$SUM characters in $DELTA ms ($RATIO b/ms)"




# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.*

