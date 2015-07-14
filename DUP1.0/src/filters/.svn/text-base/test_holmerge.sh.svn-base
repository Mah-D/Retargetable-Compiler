#!/bin/bash

exe=./holmerge
base=test_holmerge

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe foo < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Begin record-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: record-based terminate with success on EOF..."
echo -n "" > $base.in
if ! $exe < $base.in > /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: single input..."

echo -n "12345678902468013579" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi

if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe < $base.in 3> $base.out | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: multiple input streams..."
echo -n "xxxxxxxxxx66"  > $base.in1
echo -n "112233"  > $base.in2
echo -n "1122334455"  > $base.in3

if ! cat $base.in1 | ./delay 100 | $exe 2< $base.in2 3< $base.in3 > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo -n "112233445566"  > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out1 $base.out2 $base.out3 $base.oracle $base.out $base.in?

