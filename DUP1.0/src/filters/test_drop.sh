#!/bin/bash

exe=./drop
base=test_drop

# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."
cat > $base.in <<EOF
1
2
3
EOF

if $exe foo < /dev/zero 1> /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe with a bad argument"
  exit 1
fi

if ! $exe < $base.in 1> /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe with no arguments"
  exit 1
fi

echo "PASS"


# ----------------------------------------------------------------------------------
# Terminate no output
# ----------------------------------------------------------------------------------
echo -n "TEST: terminate if no output is open..."
if ./exec_no_stdout $exe < /dev/urandom 2> /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
# Begin record-based tests
# ----------------------------------------------------------------------------------
echo -n "TEST: record-based terminate with success on EOF..."
echo -n "" > $base.in
if ! $exe 1 0 10 < $base.in > /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based, first record..."

echo -n "12345678902468013579" > $base.in
for rs in 1 2 4 5 10 20; do
  for fst in 1 4; do
    echo -n "$rs ($fst)..."
    if ! $exe $fst 0 $rs < $base.in > $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi
    
    # test the outputted and dropped parts separately
    head -c $((rs * fst)) $base.in > $base.head
     
    if ! diff $base.head $base.err; then
        echo "FAIL: unexpected drop from the first of the stream"
        exit 1
    fi 
 
    cat $base.err $base.out > $base.res
    if ! diff $base.in $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi
  done
done
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based, last record..."
echo -n "12345678902468013579" > $base.in
rm -f $base.err
rm -f $base.out

for rs in 1 2 4 5 10 20; do
  for lst in 1 4; do
    echo -n "$rs ($lst)..."
    if ! $exe 0 $lst $rs < $base.in > $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi
    
    # test the outputted and dropped parts separately
    tail -c $((rs * lst)) $base.in > $base.tail
     
    if ! diff $base.tail $base.err; then
        echo "FAIL: unexpected drop result from the last of the stream"
        exit 1
    fi 
 
    cat $base.out $base.err > $base.res
    if ! diff $base.in $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi

    rm -f $base.out
    rm -f $base.err
  done
done
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based (first record) with incomplete last record..."

echo -n "123456789024680135" > $base.oracle
for rs in 3 6 9; do
  for fst in 1 2; do
    echo -n "$rs ($fst)..."
    if ! $exe $fst 0 $rs < $base.in > $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi

    head -c $((rs * fst)) $base.in > $base.head
    if ! diff $base.head $base.err; then
        echo "FAIL: unexpected drop from the first of the stream ($((rs * fst)) bytes)"
        exit 1
    fi
	
    cat $base.err $base.out > $base.res
    if ! diff $base.oracle $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi 
  done
done
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic record-based (last record) with incomplete last record..."
rm -f $base.err
rm -f $base.out

echo -n "123456789024680135" > $base.oracle
for rs in 3 6 9; do
  for lst in 1 2; do
    echo -n "$rs ($lst)..."
    if ! $exe 0 $lst $rs < $base.in > $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi

    tail -c $((rs * lst + 2)) $base.in | head -c $((rs * lst)) > $base.tail
    if ! diff $base.tail $base.err; then
        echo "FAIL: unexpected drop from the last of the stream ($((rs * lst)) bytes)"
        exit 1
    fi
	
    cat $base.out $base.tail > $base.res
    if ! diff $base.oracle $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi 
  done
done
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: nothing dropped if first record is too big..."
echo -n > $base.oracle
if ! $exe 1 0 100 < $base.in > $base.out 2> $base.err; then
    echo "FAIL: error running $exe"
    exit 1
fi

if ! diff $base.oracle $base.out; then
    echo "FAIL: unexpected output, nothing should go to stdout"
    exit 1;
fi

if ! diff $base.oracle $base.err; then
    echo "FAIL: unexpected output, nothing should be in stdin"
    exit 1;
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: Record-based SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe 1 0 256 < $base.in 1> $base.out 2> $base.err | ./eof; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: Stream-based SIGPIPE tolerance..."

dd if=/dev/zero of=$base.in count=256 &> /dev/null
if ! $exe 1 < $base.in 1> $base.out 2> $base.err  | ./eof; then
  echo "FAIL: error running $exe"
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

if ! $exe 0 1 < $base.in; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic newline-based (lines from first)..."

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee

this is just a test, there are many like it, but this one is mine

aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
for lines in 1 2 3; do
    if ! $exe $lines < $base.in 1> $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi

    head -n $lines $base.in > $base.head
    if ! diff $base.head $base.err; then
	echo "FAIL: unexpected output"
	exit 1
    fi
   
    cat $base.err $base.out > $base.res
    if ! diff $base.in $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi
done
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: basic newline-based (lines from tail)..."

cat > $base.in <<EOF
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee

this is just a test, there are many like it, but this one is mine

aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeee
EOF
for lines in 1 2 3; do
    if ! $exe 0 $lines < $base.in 1> $base.out 2> $base.err; then
	echo "FAIL: error running $exe"
	exit 1
    fi

    tail -n $lines $base.in > $base.head
    if ! diff $base.head $base.err; then
	echo "FAIL: unexpected output"
	exit 1
    fi

    cat $base.out $base.err > $base.res
    if ! diff $base.in $base.res; then
	echo "FAIL: unexpected output"
	exit 1
    fi
done
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic newline-based with incomplete last line (drop from first)..."

echo -n "123456789024680135" >> $base.in
if ! $exe < $base.in > $base.out 2> $base.err; then
    echo "FAIL: error running $exe"
    exit 1
fi

head -n 1 $base.in > $base.head
if ! diff $base.head $base.err; then
    echo "FAIL: unexpected output (1)"
    exit 1
fi
cat $base.err $base.out > $base.res
if ! diff $base.in $base.res; then
    echo "FAIL: unexpected output (2)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: basic newline-based with incomplete last line (drop from tail)..."

echo -n "123456789024680135" >> $base.in
if ! $exe 0 1 < $base.in > $base.out 2> $base.err; then
    echo "FAIL: error running $exe (1)"
    exit 1
fi

tail -n 1 $base.in > $base.tail
if ! diff $base.tail $base.err; then
    echo "FAIL: unexpected output (1)"
    exit 1
fi

cat $base.out $base.err > $base.res
if ! diff $base.in $base.res; then
    echo "FAIL: unexpected output (2)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------

echo -n "TEST: basic newline-based drop from head and tail..."
cat > $base.in <<EOF
1
2
3
4
5
6
7
8
9
0
EOF

cat > $base.oracle <<EOF
1
0
2
3
4
5
6
7
8
9
EOF

if ! $exe 1 1 < $base.in > $base.out 2> $base.err; then
    echo "FAIL: error running $exe (1)"
    exit 1
fi

cat $base.err $base.out > $base.res
if ! diff $base.oracle $base.res; then
    echo "FAIL: unexpected output (1)"
    exit 1
fi

cat > $base.oracle <<EOF
1
2
9
0
3
4
5
6
7
8
EOF

if ! $exe 2 2 < $base.in > $base.out 2> $base.err; then
    echo "FAIL: error running $exe (1)"
    exit 1
fi

cat $base.err $base.out > $base.res
if ! diff $base.oracle $base.res; then
    echo "FAIL: unexpected output (1)"
    exit 1
fi


echo "PASS"


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out $base.err $base.oracle $base.res $base.head $base.tail
