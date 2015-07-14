#!/bin/bash

exe=./gate
base=test_gate

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe foo < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: cat-ing..."

echo -n "12345678902468013579" > $base.in
if ! $exe 3< $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: no fd 3..."

echo -n "12345678902468013579" > $base.in
if ! $exe > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: gateing pre..."
rm -f $base.fifo
mkfifo $base.fifo
echo "a" | ./delay 1000 | $exe 3< $base.fifo > $base.out &
echo -n "12345678902468013579" > $base.fifo
sleep 2
echo -n "12345678902468013579" > $base.in
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: gateing post..."
rm -f $base.fifo
mkfifo $base.fifo
echo -n "12345678902468013579" > $base.fifo &
echo "a" | $exe 3< $base.fifo > $base.out 
echo -n "" > $base.in
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# EOF tests
# ----------------------------------------------------------------------------------
echo -n "TEST: No stdin..."

echo -n "12345678902468013579" > $base.in
if ! ./exec_no_stdin $exe 3< $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: No stdin data ever, but abort (do not press any key...)"
rm -f $base.fifo
echo -n "12345678902468013579" > $base.in
if ! $exe 3< /dev/tty < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi   
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: terminate with success on write EOF..."
echo "a" > $base.in
for n in `seq 1 10000`
do
  echo "aaaaaaaaaaaaaaaaaaaaaaaaa\n" >> $base.in
done
if ! $exe 3< $base.in | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: cat failure..."

echo -n "12345678902468013579" > $base.in
OP=$PATH
export PATH=/nothing
if ! $exe 3< $base.in > $base.out 2> /dev/null 
then
    export PATH=$OP
    echo "FAIL: error running $exe"
    exit 1
fi
export PATH=$OP
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: cat failure, nostdin..."

echo -n "12345678902468013579" > $base.in
OP=$PATH
export PATH=/nothing
if ! ./exec_no_stdin $exe 3< $base.in > $base.out 2> /dev/null 
then
    export PATH=$OP
    echo "FAIL: error running $exe"
    exit 1
fi
export PATH=$OP
if ! diff $base.in $base.out; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"



rm -f $base.in $base.out $base.fifo
