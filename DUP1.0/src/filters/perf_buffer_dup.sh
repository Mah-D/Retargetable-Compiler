#!/bin/bash

TOTAL=`expr 10240 \* 512000 / 1024`

echo -n "PERF: overhead..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer > /dev/null 2> /dev/null; then
    echo "FAIL: error running dd"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"



echo -n "PERF: cat..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer  2> /dev/null  | cat - > /dev/null 2> /dev/null; then
    echo "FAIL: error running cat"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"



echo -n "PERF: dd..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer 2> /dev/null  | dd bs=512000 status=noxfer  > /dev/null 2> /dev/null; then
    echo "FAIL: error running dd"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"



echo -n "PERF: dup-buffer..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer  2> /dev/null  | ./buffer-dup 512000 > /dev/null 2> /dev/null; then
    echo "FAIL: error running buffer-dup"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"



echo -n "PERF: faninany..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer  2> /dev/null  | ./faninany 512000 > /dev/null 2> /dev/null; then
    echo "FAIL: error running faninany"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"


echo -n "PERF: fanout..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer  2> /dev/null  | ./fanout 512000 > /dev/null 2> /dev/null; then
    echo "FAIL: error running fanout"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"


echo -n "PERF: deal..."
START=`./mstime`
if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer 2> /dev/null  | ./deal 512000 > /dev/null ; then
    echo "FAIL: error running deal"
    exit 1
fi
END=`./mstime`
DELTA=`expr $END - $START`
RATIO=`expr $TOTAL / $DELTA`
echo "$DELTA ms ($RATIO kb/ms)"




if test -x `which buffer`
then
  echo -n "PERF: buffer..."
  START=`./mstime`
  if ! dd if=/dev/zero count=10240 bs=512000 status=noxfer  2> /dev/null  | buffer -m 512000 > /dev/null 2> /dev/null; then
      echo "FAIL: error running buffer"
      exit 1
  fi
  END=`./mstime`
  DELTA=`expr $END - $START`
  RATIO=`expr $TOTAL / $DELTA`
  echo "$DELTA ms ($RATIO kb/ms)"
fi

