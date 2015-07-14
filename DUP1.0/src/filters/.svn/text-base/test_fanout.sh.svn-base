#!/bin/bash

exe=./fanout
base=test_fanout

# ----------------------------------------------------------------------------------
# EOF test
# ----------------------------------------------------------------------------------
echo -n "TEST: instant terminate if no outputs..."
if ! ./exec_no_stdout $exe 10 < /dev/urandom; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
# Begin record-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: record-based terminate with success on EOF..."
echo -n "" > $base.in
if ! $exe 10 < $base.in > /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based..."

echo -n "12345678902468013579" > $base.in
for rs in 1 2 4 5 10 20; do
    echo -n "$rs..."
    if ! $exe $rs < $base.in > $base.out; then
	echo "FAIL: error running $exe"
	exit 1
    fi
    
    if ! diff $base.in $base.out; then
	echo "FAIL: unexpected output"
	exit 1
    fi
done
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based with incomplete last record..."

echo -n "123456789024680135" > $base.oracle
for rs in 3 6 9; do
    echo -n "$rs..."
    if ! $exe $rs < $base.in > $base.out; then
	echo "FAIL: error running $exe"
	exit 1
    fi
    if ! diff $base.oracle $base.out; then
	echo "FAIL: unexpected output"
	exit 1
    fi
done
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: no data written if first record is too small..."
echo -n > $base.oracle
if ! $exe 100 < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $base.oracle $base.out; then
    echo "FAIL: unexpected output"
    exit 1;
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: Record-based SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe 256 < $base.in 3> $base.out | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
    
if ! diff $base.in $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Stream-based SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe < $base.in 3> $base.out | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
    
if ! diff $base.in $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe foo < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: multiple output streams -- record-based..."
echo -n "112233445566" > $base.in

if ! $exe 2 < $base.in 3>$base.out2 10>$base.out3 > $base.out1; then
    echo "FAIL: error running $exe"
    exit 1
fi
if(( $(wc -c < $base.out1) != 12 )); then
    echo "FAIL: incorrect number of output bytes in 1"
    exit 1
fi
if(( $(wc -c < $base.out2) != 12 )); then
    echo "FAIL: incorrect number of output bytes in 2"
    exit 1
fi
if(( $(wc -c < $base.out3) != 12 )); then
    echo "FAIL: incorrect number of output bytes in 3"
    exit 1
fi
for p in 1 2 3; do
    if ! grep 1122 $base.out$p > /dev/null; then
	echo "FAIL: invalid output for stream $p"
	exit 1
    fi
done
echo "PASS"

# ----------------------------------------------------------------------------------
# Begin newline-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: newline-based terminate with success on EOF..."
echo -n "" > $base.in
if ! $exe < $base.in; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic newline-based..."

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee

this is just a test, there are many like it, but this one is mine

aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
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
echo -n "TEST: basic newline-based with incomplete last line..."

echo -n "123456789024680135" >> $base.in
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
echo -n "TEST: multiple output streams -- newline-based..."
cat > $base.in <<EOF
111111111111111111111
22222222222222222222222222222222222222222
333333
EOF

if ! $exe < $base.in 3>$base.out2 10>$base.out3 > $base.out1; then
    echo "FAIL: error running $exe"
    exit 1
fi
if(( $(wc -l < $base.out1) != 3 )); then
    echo "FAIL: incorrect number of output lines"
    exit 1
fi
if(( $(wc -l < $base.out2) != 3 )); then
    echo "FAIL: incorrect number of output lines"
    exit 1
fi
if(( $(wc -l < $base.out3) != 3 )); then
    echo "FAIL: incorrect number of output lines"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out1 $base.out2 $base.out3 $base.oracle $base.out

