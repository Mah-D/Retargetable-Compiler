#!/bin/bash

#Needed some sort of filter for the cycle test.
#This should echo ten numbers, then read ten numbers then die.
#The pipeline should die with exit 0 only if it gets a tenth number


for num in `seq 1 10`
do
	echo $num
done

for i in `seq 1 10`
do
	read num
	echo $num
	if test $num == $"10"
	then
		exit 0
	fi
done

exit -1