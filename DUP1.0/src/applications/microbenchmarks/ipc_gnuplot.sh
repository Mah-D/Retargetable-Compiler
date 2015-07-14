#!/bin/sh
# first argument: list of IPC mechanisms
# second argument: list of platforms
# third argument: title
# fourth argument: with error bars (stddev) or not?

TMPFILE=`mktemp /tmp/gnuplotXXXXXX`

#echo "set terminal postscript eps enhanced color" >> $TMPFILE
#echo "set output \"$TMPFILE.ps\"" >> $TMPFILE
echo "set title \"$4\"" >> $TMPFILE
echo "set xlabel \"Blocksize\"" >> $TMPFILE
echo "set ylabel \"MB/s\"" >> $TMPFILE
echo "set logscale x" >> $TMPFILE

style=0
for plat in $1
do
  for ipc in $2
  do
    echo "plot \"${plat}_${ipc}_${3}.dat\" index 0 using 2:3 with linespoints tit '$ipc on $plat'" >> $TMPFILE
    style=`expr $style + 1`
  done
done

echo "pause -1 \"Hit any key to continue\"" >> $TMPFILE

gnuplot $TMPFILE 

cp $TMPFILE .
#gnuplot < $TMPFILE > $TMPFILE.pdf
#okular $TMPFILE.pdf
echo "For modifications to the graph, edit $TMPFILE and run gnuplot again"

