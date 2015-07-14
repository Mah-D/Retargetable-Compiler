#!/bin/bash

if [ "$(hostname)" != 'tuvalu' ]; then
	bloc=/Users/dupper
else
	bloc=/home/dupper
fi

mv out.txt $bloc/out.txt.bak
mv results.txt $bloc/results.txt.bak

#for i in caspian juhu hama tuvalu redondo
for i in caspian juhu hama tuvalu
do
	if [ "$(hostname)" != $i ]; then
		scp -r * dupper@$i:/Users/dupper/duprun
		ssh dupper@$i "/Users/dupper/duprun/compile.sh"
	else
		./compile.sh
	fi
done
#cat *.compile.txt
