#!/bin/sh
#
DUP=./dup
PFX=/tmp
exe=$DUP
rm -f $dup.in $dupB.in $dup.out $dup.want $PFX/dupB.in $PFX/dup.out

# ----------------------------------------------------------------------------------
# Test dup launched by dup
# ----------------------------------------------------------------------------------

#test dup as a filter within dup

echo -n "TEST: dup within dup..."

echo "s@localhost[DUP:3|0,1>$PFX/dup.out]$ sed 'y/eo/EO/';" > $PFX/dupB.in
echo "echo@localhost[1|nodeDup:3]$ echo hello world;" > dup.in
echo "nodeDup@localhost[0<$PFX/dupB.in,2>/dev/null]$ dup;" >> dup.in
echo "hEllO wOrld" > dup.want

if ! $DUP < dup.in 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff $PFX/dup.out dup.want
then
        ps
        ls -l $PFX/dup.out
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


