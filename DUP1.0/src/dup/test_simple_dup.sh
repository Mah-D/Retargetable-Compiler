#!/bin/sh
#
DUP=./dup
PFX=/tmp/
exe=$DUP


# ----------------------------------------------------------------------------------
# Simple output to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: output to file..."
echo "hw@localhost[1>$PFX/dup.out] $ echo Hello World;" > dup.in
echo "Hello World" > dup.want

if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Simple append to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: append to file..."
echo "hw@localhost[1>>$PFX/dup.out] $ echo Hello World;" > dup.in
echo "Hello World" > $PFX/dup.out
echo "Hello World" > dup.want
echo "Hello World" >> dup.want

if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Simple read and output to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: read from file..."
echo "hw@localhost[0<$PFX/dup.in,1>$PFX/dup.out] $ wc -l;" > $PFX/dup.in
echo "1" > dup.want

if ! $DUP < $PFX/dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff -w $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Simple read, pipe and output to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: read, pipe and output..."
echo "i@localhost[0<$PFX/dup.in,1|o:0] $ cat -;" > $PFX/dup.in
echo "o@localhost[1>$PFX/dup.out] $ wc -l;" >> $PFX/dup.in
echo "2" > dup.want

if ! $DUP < $PFX/dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff -w $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Simple read from dup and output to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: read from dup and output..."
echo "i@localhost[DUP:3|0,1>$PFX/dup.out] $ cat -;" > dup.in
echo "Test" > dup.want

if ! $DUP < dup.in 3< dup.want ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# Simple read from file and output to dup 
# ----------------------------------------------------------------------------------
echo -n "TEST: read from file and output to dup..."
echo "i@localhost[0<$PFX/dup.want,1|DUP:3] $ cat -;" > dup.in
echo "Test" > $PFX/dup.want

if ! $DUP < dup.in 3> dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff dup.out $PFX/dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Test a cycle
# ----------------------------------------------------------------------------------

#note, read cycle_filter.sh for comments on rational/need -Jeff

rm dup.out
echo -n "TEST: create a cycle and output to file..."
echo "start@localhost[1|fanout:0]$ $PWD/cycle_filter.sh;" > dup.in
echo "fanout@localhost[1|start:0, 5>$PFX/dup.out]$ fanout;" >> dup.in

rm dup.want
#set up dup.want
for i in `seq 1 10`
do
	echo $i >> dup.want
done

for i in `seq 1 10`
do
	echo $i >> dup.want
done

#run dup
if ! $DUP < dup.in
then
    echo "FAIL: error running $exe"
    exit 1
fi

if ! diff $PFX/dup.out dup.want
then
	echo "FAIL:unexpected output"
	exit 1
fi 
echo "PASS"


# ----------------------------------------------------------------------------------
# Test dup read from file and dup write to file
# ----------------------------------------------------------------------------------

echo -n "TEST: read from dup, write to dup..."

echo "a@localhost[DUP:3|0, 1|DUP:4]$ sed 'y/aeiou/AEIOU/';" > dup.in

cat dup.in | sed 'y/aeiou/AEIOU/' > dup.want

if ! $DUP < dup.in 3< dup.in 4> dup.out
then
    echo "FAIL: error running $exe"
    exit 1
fi

if ! diff dup.out dup.want
then
	echo "FAIL:unexpected output"
	exit 1
fi 
echo "PASS"


# ----------------------------------------------------------------------------------
# read from dup and output to stdout test
# ----------------------------------------------------------------------------------
echo -n "TEST: output to DUP stdout..."
echo "i@localhost[1|DUP:1] $ echo Test;" > dup.in
echo "Test" > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Simple parser testcases
# ----------------------------------------------------------------------------------
echo -n "TEST: parsing of spaces in single quotes " 
echo "i@localhost[1|DUP:1] $ echo '  ';" > dup.in
echo "  " > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

echo -n "TEST: parsing of spaces in double quotes "
echo "i@localhost[1|DUP:1] $ echo \"  \";" > dup.in
echo "  " > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

echo -n "TEST: ignoring spaces outside of quotes "
echo "i@localhost[1|DUP:1] $ echo a   ;" > dup.in
echo "a" > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

echo -n "TEST: no need for spaces in command, tolerated elsewhere "
echo "i @ localhost [ 1 | DUP : 1 ] \$echo a;" > dup.in
echo "a" > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

echo -n "TEST: no need for newlines between commands, tolerated elsewhere "
/bin/echo -e "i\n@\nlocalhost\n[\n1\n|\no\n:\n0\n]\n\$echo a;o\n@localhost\n[1|DUP:1]\$cat -;" > dup.in
echo "a" > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

echo -n "TEST: tabs tolerated "
/bin/echo -e "i\t@\tlocalhost\t[\t1\t|\to\t:\t0\t]\t\$echo a;o\t@localhost\t[1|DUP:1]\$cat -;" > dup.in
echo "a" > dup.want
rm -f $PFX/dup.out
if ! $DUP < dup.in > $PFX/dup.out ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# ----------------------------------------------------------------------------------
# ----------------------------------------------------------------------------------
# ----------------------------------------------------------------------------------
# ----------------------------------------------------------------------------------

# END OF TESTS -- clean up!

rm -f dup.in dup.out dup.want dupB.in


