#!/bin/bash

exe=./gmp_gen_random
base=test_gmp_gen_random

rm gmp_gen_random1.out

echo -n "TEST: correct number of outputs..."
for i in 1 10 200 4000 50000 1000000; 
	do if ! expr `$exe 1 $i | wc -l` \=\= $i > /dev/null; then
    echo "FAIL: invalid number of outputs!"
    exit 1
	fi;
done
echo "PASS"

echo -n "TEST: correct size of outputs..."
for i in 1 10 200 4000 50000 100000; 
	do MYLEN=`expr \`./pow.py 2 $i  | wc -c\` \- 1`;echo $MYLEN;
		for j in `seq 1 100`;
			do 
				VAL=`expr \`$exe $i 1 | wc -c\` \- 1`;
				if ! expr $VAL \<\= $MYLEN > /dev/null; then
					echo "FAIL: invalid output length!"
					exit 1
				fi;
			done;
done
echo "PASS"

echo -n "TEST: single argument test..."
$exe 10 > gmp_gen_random1.out &
sleep 1
kill %1
if ! expr `stat gmp_gen_random1.out -c %s` \> 0; then
	echo "FAIL: got bad file size with one argument!"
	exit 1
fi;
echo "PASS"
rm gmp_gen_random1.out

echo -n "TEST: no argument test..."
$exe > gmp_gen_random1.out &
sleep 1
kill %1
if ! expr `stat gmp_gen_random1.out -c %s` \> 0; then
	echo "FAIL: got bad file size with no arguments!"
	exit 1
fi;
echo "PASS"

rm gmp_gen_random1.out

echo -n "TEST: single BAD argument test..."
$exe adfasdfsdfasdf > /dev/null
if expr $? \=\= 0; then
	echo "FAIL: got incorrect return value"
	exit 1
fi;
echo "PASS"

echo -n "TEST: second BAD argument test..."
$exe 10 asdfasdfasd > /dev/null
if expr $? \=\= 0; then
	echo "FAIL: got incorrect return value"
	exit 1
fi;
echo "PASS"
