#!/bin/sh

rm -f dup.in 
DUP=dup

# ----------------------------------------------------------------------------------
# Duplicate FD involving DUP for output
# ----------------------------------------------------------------------------------
echo -n "TEST: duplicate FD use for output..."
echo "hello" > input.data
echo 'testDUP@localhost:2222[1|DUP:1, 2|DUP:1, 0<input.data]$/usr/bin/time -f "%U %S %e %P %M %t %K %W %w %O %I %s %r" fanout;' > dup.in

if $DUP < dup.in > dup.out 2> time.out ;
then
    echo "FAIL: DUP failed to report error"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
# Duplicate FD involving DUP for input
# ----------------------------------------------------------------------------------
echo -n "TEST: duplicate FD use for input..."
echo "hello" > input.data
echo 'testDUP@localhost:2222[DUP:0|0, DUP:0|3, 1>dup.out]$/usr/bin/time -f "%U %S %e %P %M %t %K %W %w %O %I %s %r" fanout;' > dup.in

if $DUP < dup.in > dup.out 2> time.out ;
then
    echo "FAIL: DUP failed to report error"
    exit 1
fi
echo "PASS"
rm -f dup.in input.data dup.out time.out

