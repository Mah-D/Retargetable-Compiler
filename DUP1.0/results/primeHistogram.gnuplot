set terminal png transparent nocrop enhanced font arial 8 size 1024,768 
set output 'primeHistogram.png'
set boxwidth 0.9 absolute
set style fill solid 1.00 border -1
set style histogram clustered gap 1 title  offset character 0, 0, 0
set datafile missing '-'
set style data histograms
set key top left
set xtics border in scale 1,0.5 nomirror offset character 0, 0, 0 
set xtics ('1000 bits' 0.00000, "2000 bits" 1.00000, "3000 bits" 2.00000, "4000 bits" 3.00000)
set title "Primes generated per second\nHistogram of methods used vs. speed" 
#set yrange [ 0.00000 : 300000. ] noreverse nowriteback
#plot 'primeResults.dat' using 6:xtic(1) ti col, '' u 2 ti col, '' u 3 ti col, '' u 4 ti col, '' u 5 ti col, '' u 6 ti col
plot 'primeResults.dat' using 2 ti col, '' u 3 ti col, '' u 4 ti col, '' u 5 ti col, '' u 6 ti col