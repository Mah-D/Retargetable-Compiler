#!/bin/sh
#
DUP=./dup
PFX=/tmp/
exe=$DUP

# ----------------------------------------------------------------------------------
# Simple use of -c
# ----------------------------------------------------------------------------------
echo -n "TEST: read code from file..."
echo "hw@localhost[1>$PFX/dup.out] $ echo Hello World;" > dup.in
echo "Hello World" > dup.want

if ! $DUP -c dup.in ; 
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
# Simple use of -c
# ----------------------------------------------------------------------------------
echo -n "TEST: read code from file and use DUP stdin/stdout for IO..."
echo "cat@localhost[DUP:0|0,1|DUP:1] $ cat -;" > dup.in
echo "Hello World" > dup.want

$DUP -c dup.in < dup.want > $PFX.dup.out
if test 0 != $? ; 
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



