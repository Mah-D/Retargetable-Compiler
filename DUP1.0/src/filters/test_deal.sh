#!/bin/bash

exe=./deal
base=test_deal

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe foo < /dev/zero 2> /dev/null > /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Terminate no output
# ----------------------------------------------------------------------------------
echo -n "TEST: terminate if no output is open..."
if ! ./exec_no_stdout $exe 10 < /dev/urandom 2> /dev/null; then
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
if ! $exe 256 < $base.in 4> $base.out | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Data splitting..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe 256 < $base.in 4> $base.out4 > $base.out; then
  echo "FAIL: error running $exe"
  exit 1
fi
dd if=/dev/zero of=$base.oracle count=128 &> /dev/null
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
if ! diff $base.oracle $base.out4; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Stream-based SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe < $base.in 4> $base.out | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Stream-based large input with decrement case"

if ! $exe < test_deal_input.txt > $base.out; then
  echo "FAIL: error running $exe"
  exit 1
fi
if ! diff test_deal_input.txt $base.out; then
  echo "FAIL: unexpected output 1"
  exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: multiple output streams -- record-based..."
echo -n "1122334455"  > $base.in

if ! $exe 2 < $base.in 4>$base.out2 10>$base.out3 > $base.out1; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo -n "1144"  > $base.oracle
if ! diff $base.oracle $base.out1; then
  echo "FAIL: unexpected output 1"
  exit 1
fi

echo -n "2255"  > $base.oracle
if ! diff $base.oracle $base.out2; then
  echo "FAIL: unexpected output 2"
  exit 1
fi

echo -n "33"  > $base.oracle
if ! diff $base.oracle $base.out3; then
  echo "FAIL: unexpected output 3"
  exit 1
fi

echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: multiple output streams -- line-based..."
echo "11"  > $base.in
echo "22" >> $base.in
echo "33" >> $base.in
echo "4"  >> $base.in
echo "55" >> $base.in

if ! $exe < $base.in 4>$base.out2 10>$base.out3 > $base.out1; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "11"  > $base.oracle
echo "4"  >> $base.oracle
if ! diff $base.oracle $base.out1; then
  echo "FAIL: unexpected output 1"
  exit 1
fi

echo "22"  > $base.oracle
echo "55" >> $base.oracle
if ! diff $base.oracle $base.out2; then
  echo "FAIL: unexpected output 2"
  exit 1
fi

echo "33"  > $base.oracle
if ! diff $base.oracle $base.out3; then
  echo "FAIL: unexpected output 3"
  exit 1
fi

echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: deal input specification -- line-based..."
echo "11"  > $base.in
echo "22" >> $base.in
echo "33" >> $base.in
echo "4"  >> $base.in
echo "999"  >> $base.in
echo "55" >> $base.in
echo "666" >> $base.in
echo -e "1\n10\n4\n10\n5\n4" > $base.in3

if ! $exe < $base.in 3<$base.in3 4>$base.out2 10>$base.out3 > $base.out1; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "11"  > $base.oracle
if ! diff $base.oracle $base.out1; then
  echo "FAIL: unexpected output 1"
  exit 1
fi

echo "33"  > $base.oracle
echo "55" >> $base.oracle
if ! diff $base.oracle $base.out2; then
  echo "FAIL: unexpected output 2"
  exit 1
fi

echo "22" > $base.oracle
echo "4" >> $base.oracle
if ! diff $base.oracle $base.out3; then
  echo "FAIL: unexpected output 3"
  exit 1
fi

echo "PASS"





# ----------------------------------------------------------------------------------
echo -n "TEST: invalid deal input specification -- line-based..."
echo "11"  > $base.in
echo "22" >> $base.in
echo "33" >> $base.in
echo "4"  >> $base.in
echo "999"  >> $base.in
echo "55" >> $base.in
echo "666" >> $base.in
echo -e "1\n10\n4\n10\n5\nx" > $base.in3

if $exe < $base.in 3<$base.in3 4>$base.out2 10>$base.out3 > $base.out1 2> /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "11"  > $base.oracle
if ! diff $base.oracle $base.out1; then
  echo "FAIL: unexpected output 1"
  exit 1
fi

echo "33"  > $base.oracle
if ! diff $base.oracle $base.out2; then
  echo "FAIL: unexpected output 2"
  exit 1
fi

echo "22" > $base.oracle
echo "4" >> $base.oracle
if ! diff $base.oracle $base.out3; then
  echo "FAIL: unexpected output 3"
  exit 1
fi

echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: deal input specification with SIGPIPE..."
echo "11"  > $base.in
echo "22" >> $base.in
echo "33" >> $base.in
echo "4"  >> $base.in
echo "999">> $base.in
echo "55" >> $base.in
echo "666">> $base.in
echo -e "1\n10\n1\n10\n1\n1\n1" > $base.in3

if ! $exe < $base.in 3<$base.in3 4>$base.out2 10>$base.out3 | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "22" > $base.oracle
echo "4" >> $base.oracle
if ! diff $base.oracle $base.out3; then
  echo "FAIL: unexpected output 3"
  exit 1
fi

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
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out? $base.oracle $base.out $base.in3

