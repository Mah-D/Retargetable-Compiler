#!/bin/bash

exe=./delay
base=test_delay

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe foo < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: More argument checking..."

if $exe < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: cat-ing..."

echo -n "12345678902468013579" > $base.in
if ! $exe 1 < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: delaying..."

echo -n "12345678902468013579" > $base.in
STIME=`date +%s`
if ! $exe 2000 < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
ETIME=`date +%s`
if (($STIME == $ETIME)); then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: cat failure..."

echo -n "12345678902468013579" > $base.in
OP=$PATH
export PATH=/nothing
if $exe 1 < $base.in > $base.out 2> /dev/null 
then
    export PATH=$OP
    echo "FAIL: error running $exe"
    exit 1
fi
export PATH=$OP
echo "PASS"
