#!/bin/sh

rm -f dup.in dup.out dup.want dup.want.sorted
DUP=dup

# ----------------------------------------------------------------------------------
# Simple read, pipe and output to file test
# ----------------------------------------------------------------------------------
echo -n "TEST: read, pipe and output..."
echo "i@localhost:12345[0<dup.in,1|o:0] $ cat -;" > dup.in
echo "o@localhost:12346[1>dup.out] $ wc -l;" >> dup.in
echo "2" > dup.want

if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# More complex linear pipeline, one process per dupd
# ----------------------------------------------------------------------------------

echo -n "TEST: more complicated pipeline..."
echo "nodeCAT@localhost:12345[1|nodeGREP:0]$ echo '1--2--3--4';" > dup.in
echo "nodeGREP@localhost:12346[1|nodeWC:0]$ sed 's/--/ /g';" >> dup.in
echo "nodeWC@localhost:12346[1>dup.out]$ wc -w;" >> dup.in

echo "4" > dup.want

if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
# merge streams
# ----------------------------------------------------------------------------------

echo -n "TEST: merge streams..."
echo "nodeA@localhost:12345[1|nodeMerge:0]$ echo 1--2--3--4;" > dup.in
echo "nodeB@localhost:12345[1|nodeMerge:3]$ echo 1--2--3--4;" >> dup.in
echo "nodeMerge@localhost:12346[1>dup.out]$ gather;" >> dup.in


echo "1--2--3--4" > dup.want
echo "1--2--3--4" >> dup.want

if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! diff dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"




# ----------------------------------------------------------------------------------
# split, write to files
# ----------------------------------------------------------------------------------

echo -n "TEST: split, write to files..."
echo "nodeStart@localhost:12345[1|nodeFanout:0]$ seq 1 9;" > dup.in
echo "nodeFanout@localhost:12345[1|nodeA:0, 3|nodeB:0]$ fanout;" >> dup.in
echo "nodeA@localhost:12346[1>nodea.out]$ cat -;" >> dup.in
echo "nodeB@localhost:12346[1>nodeb.out]$ cat -;" >> dup.in




if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi

cat nodea.out nodeb.out > dup.out
rm -f dup.want

for i in `seq 1 2` 
do
	for j in `seq 1 9`
	do
		echo $j >> dup.want
	done
done

if ! diff dup.out dup.want; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"

rm node?.out


# ----------------------------------------------------------------------------------
# split, merge, write to file
# ----------------------------------------------------------------------------------

echo -n "TEST: split, gather, write to files..."
echo "nodeStart@localhost:12345[1|nodeFanout:0]$ seq 1 9;" > dup.in
echo "nodeFanout@localhost:12345[1|nodeA:0, 3|nodeB:0]$ fanout;" >> dup.in
echo "nodeA@localhost:12346[1|nodeMerge:0]$ cat -;" >> dup.in
echo "nodeB@localhost:12346[1|nodeMerge:3]$ cat -;" >> dup.in
echo "nodeMerge@localhost:12345[1>dup.out]$ gather;" >> dup.in



if ! $DUP < dup.in ; 
then
    echo "FAIL: error running $exe"
    exit 1
fi
cat dup.want | sort > dup.want.sorted

if ! diff dup.out dup.want.sorted; then
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

rm -f dup.in dup.out dup.want dup.want.sorted



