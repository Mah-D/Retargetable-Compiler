#!/bin/sh
DUP=./dup
PFX=/tmp/
exe=$DUP

echo -n "TEST: simple dupd run..."
echo "i@localhost[1|o:0] $ echo Hello;" > dup.in
echo "o@localhost[1>$PFX/dup.out] $ faninany;" >> dup.in
echo "Hello" > dup.want

if ! $DUP < dup.in; 
then
    echo "FAIL: error running $exe"
    exit 1
fi

if ! diff $PFX/dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"






