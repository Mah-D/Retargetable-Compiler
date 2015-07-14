#!/bin/bash

exe=./mgrep
base=test_mgrep


# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe '[a' < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# EOF tests
# ----------------------------------------------------------------------------------
echo -n "TEST: terminate with success on write EOF..."
echo "a" > $base.in
for n in `seq 1 10000`
do
  echo "aaaaaaaaaaaaaaaaaaaaaaaaa\n" >> $base.in
done
if ! $exe a < $base.in | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: terminate with success on read EOF..."
if ! $exe a < /dev/null > $base.out; then
 echo "FAIL: error running $exe"
    exit 1
fi
if(( $(wc -c < $base.out) != 0 )); then
    echo "FAIL: incorrect number of output bytes"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic matching..."

echo "abc" > $base.in
echo "def" >> $base.in
echo "efg" >> $base.in
if ! $exe def < $base.in > $base.out 3> $base.out3; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "def" > $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi
echo "abc" > $base.oracle
echo "efg" >> $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic matching without EOL..."

echo "abc" > $base.in
echo "def" >> $base.in
echo -n "efg" >> $base.in
if ! $exe def < $base.in > $base.out 3> $base.out3; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "def" > $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi
echo "abc" > $base.oracle
echo -n "efg" >> $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: inverse lines matching..."

echo "abc" > $base.in
echo "def" >> $base.in
echo "efg" >> $base.in
if ! $exe 'abc|efg' < $base.in > $base.out 3> $base.out3; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "abc" > $base.oracle
echo "efg" >> $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi
echo "def" > $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: inverse lines matching without EOL..."

echo "abc" > $base.in
echo "def" >> $base.in
echo -n "efg" >> $base.in
if ! $exe 'abc|efg' < $base.in > $base.out 3> $base.out3; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "abc" > $base.oracle
echo -n "efg" >> $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi
echo "def" > $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: inverse lines matching without stdout..."

echo "abc" > $base.in
echo "def" >> $base.in
echo -n "efg" >> $base.in
if ! ./exec_no_stdout $exe 'abc|efg' < $base.in 3> $base.out3; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "def" > $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: long line test..."

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee

this is just a test, there are many like it, but this one is mine

aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
if ! $exe test < $base.in > $base.out 3> /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "this is just a test, there are many like it, but this one is mine" > $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: EOF on stdout test..."
# NOTE: should also test EOF on FD3, but that's impossible without DUP

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
this is just a test, there are many like it, but this one is mine
aaaa
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
if ! $exe aa < $base.in 3> $base.out3 | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "this is just a test, there are many like it, but this one is mine" > $base.oracle
if ! diff $base.out3 $base.oracle; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Disk full..."

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
this is just a test, there are many like it, but this one is mine
aaaa
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
if $exe test < $base.in 3> /dev/full > $base.out 2>/dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out1 $base.out2 $base.out3 $base.oracle $base.out

