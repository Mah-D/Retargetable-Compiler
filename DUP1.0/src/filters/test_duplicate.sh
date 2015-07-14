#!/bin/bash

exe=./duplicate
base=test_duplicate

# ----------------------------------------------------------------------------------
# EOF test
# ----------------------------------------------------------------------------------
echo -n "TEST: instant terminate if no outputs..."
if ! ./exec_no_stdout $exe < /dev/urandom; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."
if $exe a < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
if $exe 4 a < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
if $exe "*" a < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
if $exe "*" 0 < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
if $exe a b c < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Begin record-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: record-based terminate with success on EOF..."
echo -n "A" > $base.in
if ! $exe 10 1 < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi    
echo -n "AAAAAAAAAA" > $base.oracle
if ! diff $base.oracle $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# Begin line-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: default duplication..."
echo "A" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi    
echo "A" > $base.oracle
echo "A" >> $base.oracle
if ! diff $base.oracle $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: default line mode..."
echo "A" > $base.in
if ! $exe 3 < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi    
echo "A" > $base.oracle
echo "A" >> $base.oracle
echo "A" >> $base.oracle
if ! diff $base.oracle $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
# FIXME: test infinite stream!


# ----------------------------------------------------------------------------------
echo -n "TEST: Infinite stream-based SIGPIPE tolerance..."

echo "A" > $base.in
if ! $exe "*" < $base.in | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: Finite Stream-based SIGPIPE tolerance..."

echo "A" > $base.in
if ! $exe 100000 < $base.in | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out1 $base.out2 $base.out3 $base.oracle $base.out

