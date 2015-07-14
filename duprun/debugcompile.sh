#!/bin/bash

if [ "$(hostname)" != 'tuvalu' ]; then
	loc=/Users/dupper/duprun
else
	loc=/home/dupper/duprun
fi

if [ "$(hostname)" != 'tuvalu' ]; then
	rm $loc/relayer
	rm $loc/dispatcher
	rm $loc/inc/*.gch
	rm $loc/relay/inc/*.gch
	rm $loc/lib/*.o
	rm $loc/relay/lib/*.o
	rm $loc/output/*.txt
	gcc -g -arch x86_64  -lm -std="c99" $loc/inc/*.h $loc/lib/*.c  -o $loc/dispatcher &> $loc/output/$(hostname).program.compile.txt
	gcc  -g -arch x86_64 $loc/relay/inc/*.h $loc/relay/lib/*.c -o $loc/relayer &> $loc/output/$(hostname).relay.compile.txt
	scp $loc/output/$(hostname).*.compile.txt dupper@tuvalu:/home/dupper/duprun/output/
else
	rm $loc/relayer
	rm $loc/dispatcher
	rm $loc/output/inc/*.gch
	rm $loc/output/relay/inc/*.gch
	rm $loc/output/lib/*.o
	rm $loc/output/relay/lib/*.o
	rm $loc/output/output/*.txt
	gcc -g -m64  -lpthread -lm -std="c99" $loc/inc/*.h $loc/lib/*.c  -o $loc/dispatcher &> $loc/output/tuvalu.program.compile.txt
	gcc -g  -m64  -lpthread $loc/relay/inc/*.h $loc/relay/lib/*.c -o $loc/relayer &> $loc/output/tuvalu.relay.compile.txt
fi
