#!/bin/bash

exe=./devrandom_gen_random
base=test_devrandom_gen_random

rm -f devrandom_random1.out

echo -n "TEST: correct number of outputs..."
for i in 1 10 200 4000 50000 1000000; 
	do if ! expr `$exe 1 $i | wc -l` \=\= $i > /dev/null; then
    echo "FAIL: invalid number of outputs!"
    exit 1
	fi;
done
echo "PASS"

echo -n "TEST: correct size of outputs..."
for i in 1 10 200 4000;
	do POWER=`expr $i \* 8`;
		 RESULT=`./pow.py 2 $POWER`
		 MYLEN=`expr \`echo $RESULT | wc -c\` \- 1`;
		 echo $MYLEN;
		for j in `seq 1 100`;
			do 
				VAL=`expr \`$exe $i 1 | wc -c\` \- 1`;
#				echo "MYLEN" $MYLEN "VAL" $VAL
				if ! expr $VAL \<\= $MYLEN > /dev/null; then
					echo "FAIL: invalid output length!"
					exit 1
				fi;
			done;
done
echo "PASS"

echo -n "TEST: single argument test..."
$exe 10 > devrandom_random1.out &
sleep 1
kill %1
if ! expr `stat devrandom_random1.out -c %s` \> 0; then
	echo "FAIL: got bad file size with one argument!"
	exit 1
fi;
echo "PASS"
rm -f devrandom_random1.out

echo -n "TEST: no argument test..."
$exe > devrandom_random1.out &
sleep 1
kill %1
if ! expr `stat devrandom_random1.out -c %s` \> 0; then
	echo "FAIL: got bad file size with no arguments!"
	exit 1
fi;
echo "PASS"
rm -f devrandom_random1.out

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
