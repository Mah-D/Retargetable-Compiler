public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _Stream_MEG = Program._Stream_MEG_init();
public static final double _Stream_alpha = Program._Stream_alpha_init();
public static final int _Stream_NUM_TIMES = Program._Stream_NUM_TIMES_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final long _Stream_N0 = Program._Stream_N0_init();
public static final long _Stream_N = Program._Stream_N_init();
public static final int _Stream_LocalSize = Program._Stream_LocalSize_init();


public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final Stream X10_TEMP4 = (new Stream());

Program.Stream_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for stream: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _Stream_MEG_init() {
final int X10_TEMP1 = (2048);
final int X10_TEMP2 = (2048);

final int X10_TEMP4 = (X10_TEMP1*X10_TEMP2);
return X10_TEMP4;
}
public static double _Stream_alpha_init() {

final double X10_TEMP2 = (3.0D);
return X10_TEMP2;
}
public static int _Stream_NUM_TIMES_init() {

final int X10_TEMP2 = (10);
return X10_TEMP2;
}
public static long _Stream_N0_init() {
final int X10_TEMP1 = (2);

final long X10_TEMP3 = (X10_TEMP1*_Stream_MEG);
return X10_TEMP3;
}
public static long _Stream_N_init() {
final int X10_TEMP1 = (place.MAX_PLACES);

final long X10_TEMP3 = (_Stream_N0*X10_TEMP1);
return X10_TEMP3;
}
public static int _Stream_LocalSize_init() {

final int X10_TEMP2 = ((int)_Stream_N0);
return X10_TEMP2;
}
public static void Stream_run(final Stream X10_TEMP0) {
final String X10_TEMP1 = ("LocalSize=");

final String X10_TEMP3 = (X10_TEMP1+_Stream_LocalSize);
System.out.println(X10_TEMP3);
final StreamData tempSd = (X10_TEMP0.sd);
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP5);
final region(:rank==1)[:rank==1&&distribution==dUnique] X10_TEMP14 = (region(:rank==1)[:rank==1&&distribution==dUnique])(new region(:rank==1)[dUnique](point(:rank==1)p) {
final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(tempSd.D);
final place X10_TEMP9 = (here);

final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(X10_TEMP8|X10_TEMP9);

final region(:rank==1) X10_TEMP13 = (region(:rank==1))(X10_TEMP11.region);
return X10_TEMP13;
}

);

final region(:rank==1)[:rank==1] placeDist = (region(:rank==1)[:rank==1])(X10_TEMP14);
finish {
final int X10_TEMP21 = (0);
final int X10_TEMP17 = (1);

final int X10_TEMP19 = (_Stream_NUM_TIMES-X10_TEMP17);
final int X10_TEMP22 = ((int)X10_TEMP19);

region(:rank==1) r = (region(:rank==1))([X10_TEMP21:X10_TEMP22]);
for(point(:rank==1)p1:r) {
finish {
final dist(:rank==1) X10_TEMP26 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)p6:X10_TEMP26) {
final place X10_TEMP27 = X10_TEMP26.get(p6);
async(X10_TEMP27) {
final region(:rank==1) X10_TEMP29 = (region(:rank==1))(placeDist[p6]);

final region(:rank==1) tempReg = (region(:rank==1))(X10_TEMP29);
for(point(:rank==1)i:tempReg) {
final double[:rank==1] X10_TEMP32 = (double[:rank==1])(tempSd.b);

final double X10_TEMP41 = (1.5);
final place X10_TEMP34 = (here);
final int X10_TEMP35 = (X10_TEMP34.id);
final int X10_TEMP37 = (X10_TEMP35*_Stream_LocalSize);
final int X10_TEMP38 = (i[0]);

final int X10_TEMP40 = (X10_TEMP37+X10_TEMP38);

final double X10_TEMP44 = (X10_TEMP41*X10_TEMP40);
final double X10_TEMP45 = (X10_TEMP44);
X10_TEMP32[i] = (X10_TEMP45);
final double[:rank==1] X10_TEMP46 = (double[:rank==1])(tempSd.c);

final double X10_TEMP55 = (2.5);
final place X10_TEMP48 = (here);
final int X10_TEMP49 = (X10_TEMP48.id);
final int X10_TEMP51 = (X10_TEMP49*_Stream_LocalSize);
final int X10_TEMP52 = (i[0]);

final int X10_TEMP54 = (X10_TEMP51+X10_TEMP52);

final double X10_TEMP58 = (X10_TEMP55*X10_TEMP54);
final double X10_TEMP59 = (X10_TEMP58);
X10_TEMP46[i] = (X10_TEMP59);
}
final dist(:rank==1) X10_TEMP60 = (dist(:rank==1))(dist.UNIQUE);
final place X10_TEMP62 = (X10_TEMP60.get(p6));
final place X10_TEMP63 = (place.FIRST_PLACE);

final boolean X10_TEMP65 = X10_TEMP62==X10_TEMP63;
if (X10_TEMP65) {
final double[:rank==1] X10_TEMP66 = (double[:rank==1])(tempSd.times);

final double X10_TEMP68 = (Program.Stream_mySecond());
final int X10_TEMP69 = 0;

final double X10_TEMP72 = (X10_TEMP69 - X10_TEMP68);
final double X10_TEMP73 = (X10_TEMP72);
X10_TEMP66[p1] = (X10_TEMP73);
}
for(point(:rank==1)p4:tempReg) {
final double[:rank==1] X10_TEMP75 = (double[:rank==1])(tempSd.a);

final double[:rank==1] X10_TEMP77 = (double[:rank==1])(tempSd.b);
final double X10_TEMP82 = (X10_TEMP77[p4]);
final double[:rank==1] X10_TEMP79 = (double[:rank==1])(tempSd.c);
final double X10_TEMP81 = (X10_TEMP79[p4]);
final double X10_TEMP83 = (_Stream_alpha*X10_TEMP81);

final double X10_TEMP86 = (X10_TEMP82+X10_TEMP83);
final double X10_TEMP87 = (X10_TEMP86);
X10_TEMP75[p4] = (X10_TEMP87);
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP89 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)p5:X10_TEMP89) {
final place X10_TEMP90 = X10_TEMP89.get(p5);
async(X10_TEMP90) {
final dist(:rank==1) X10_TEMP91 = (dist(:rank==1))(dist.UNIQUE);
final place X10_TEMP93 = (X10_TEMP91.get(p5));
final place X10_TEMP94 = (place.FIRST_PLACE);

final boolean X10_TEMP96 = X10_TEMP93==X10_TEMP94;
if (X10_TEMP96) {
final double[:rank==1] X10_TEMP97 = (double[:rank==1])(tempSd.times);

final double[:rank==1] X10_TEMP99 = (double[:rank==1])(tempSd.times);
final double X10_TEMP101 = (X10_TEMP99[p1]);
final double X10_TEMP102 = (Program.Stream_mySecond());

final double X10_TEMP105 = (X10_TEMP101+X10_TEMP102);
final double X10_TEMP106 = (X10_TEMP105);
X10_TEMP97[p1] = (X10_TEMP106);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP108 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)p2:X10_TEMP108) {
final place X10_TEMP109 = X10_TEMP108.get(p2);
async(X10_TEMP109) {
final region(:rank==1) X10_TEMP111 = (region(:rank==1))(placeDist[p2]);

final region(:rank==1) tempReg = (region(:rank==1))(X10_TEMP111);
for(point(:rank==1)p3:tempReg) {
final double[:rank==1] X10_TEMP114 = (double[:rank==1])(tempSd.a);
final double X10_TEMP123 = (X10_TEMP114[p3]);
final double[:rank==1] X10_TEMP116 = (double[:rank==1])(tempSd.b);
final double X10_TEMP121 = (X10_TEMP116[p3]);
final double[:rank==1] X10_TEMP118 = (double[:rank==1])(tempSd.c);
final double X10_TEMP120 = (X10_TEMP118[p3]);
final double X10_TEMP122 = (_Stream_alpha*X10_TEMP120);
final double X10_TEMP124 = (X10_TEMP121+X10_TEMP122);

final boolean X10_TEMP126 = X10_TEMP123!=X10_TEMP124;
if (X10_TEMP126) {
final place X10_TEMP128 = place.FIRST_PLACE;
async(X10_TEMP128) {
final boolean[:rank==1] X10_TEMP129 = (boolean[:rank==1])(tempSd.verified);
final int X10_TEMP131 = (0);

final boolean X10_TEMP134 = (false);
final boolean X10_TEMP135 = (X10_TEMP134);
X10_TEMP129[X10_TEMP131] = (X10_TEMP135);
}
}
}
}
}
}
}
double mini = (10000000L);
final int X10_TEMP142 = (0);
final int X10_TEMP138 = (1);

final int X10_TEMP140 = (_Stream_NUM_TIMES-X10_TEMP138);
final int X10_TEMP143 = ((int)X10_TEMP140);

region(:rank==1) r = (region(:rank==1))([X10_TEMP142:X10_TEMP143]);
for(point(:rank==1)p1:r) {
final double[:rank==1] X10_TEMP146 = (double[:rank==1])(tempSd.times);
final double X10_TEMP148 = (X10_TEMP146[p1]);

final boolean X10_TEMP150 = X10_TEMP148<mini;
if (X10_TEMP150) {
final double[:rank==1] X10_TEMP151 = (double[:rank==1])(tempSd.times);

final double X10_TEMP154 = (X10_TEMP151[p1]);
mini = (X10_TEMP154);
}
}
final boolean[:rank==1] X10_TEMP157 = (boolean[:rank==1])(tempSd.verified);
final int X10_TEMP159 = (0);

final boolean X10_TEMP161 = (X10_TEMP157[X10_TEMP159]);

Program.Stream_printStats(_Stream_N,mini,X10_TEMP161);
}
public static double Stream_mySecond() {
final double X10_TEMP1 = (System.currentTimeMillis());
final double X10_TEMP2 = (1.e6);
final double X10_TEMP3 = (X10_TEMP1*X10_TEMP2);
final int X10_TEMP4 = (1000);

final double X10_TEMP6 = (X10_TEMP3/X10_TEMP4);
final double X10_TEMP7 = ((double)X10_TEMP6);
final double X10_TEMP8 = (1.e-6);

final double X10_TEMP10 = (X10_TEMP7*X10_TEMP8);

final double X10_TEMP12 = ((double)X10_TEMP10);
return X10_TEMP12;
}
public static void Stream_printStats(final long N, final double time, final boolean verified) {
final String X10_TEMP1 = ("Number of places=");
final int X10_TEMP2 = (place.MAX_PLACES);

final String X10_TEMP4 = (X10_TEMP1+X10_TEMP2);
System.out.println(X10_TEMP4);
final int X10_TEMP5 = (3);
final int X10_TEMP6 = (8);
final long X10_TEMP7 = (X10_TEMP5*X10_TEMP6);
final long X10_TEMP8 = (X10_TEMP7*N);

final long X10_TEMP10 = (X10_TEMP8/_Stream_MEG);

long size1 = (X10_TEMP10);
final int X10_TEMP12 = (3);
final int X10_TEMP13 = (8);
final long X10_TEMP14 = (X10_TEMP12*X10_TEMP13);

final long X10_TEMP16 = (X10_TEMP14*N);
final double X10_TEMP17 = (1.0E9);

final double X10_TEMP19 = (X10_TEMP17*time);

double rate = (X10_TEMP16/X10_TEMP19);
final String X10_TEMP21 = ("Size of arrays: ");
final String X10_TEMP22 = (X10_TEMP21+size1);
final String X10_TEMP23 = (" MB (total)");
final String X10_TEMP25 = (X10_TEMP22+X10_TEMP23);
final int X10_TEMP24 = (place.MAX_PLACES);
final long X10_TEMP26 = (size1/X10_TEMP24);
final String X10_TEMP27 = (X10_TEMP25+X10_TEMP26);
final String X10_TEMP28 = (" MB (per place)");

final String X10_TEMP30 = (X10_TEMP27+X10_TEMP28);
System.out.println(X10_TEMP30);
final String X10_TEMP31 = ("Min time: ");
final String X10_TEMP32 = (X10_TEMP31+time);
final String X10_TEMP33 = (" rate=");
final String X10_TEMP34 = (X10_TEMP32+X10_TEMP33);
final String X10_TEMP35 = (X10_TEMP34+rate);
final String X10_TEMP36 = (" GB/s");

final String X10_TEMP38 = (X10_TEMP35+X10_TEMP36);
System.out.println(X10_TEMP38);
final String X10_TEMP45 = ("Result is ");
final boolean X10_TEMP39 = verified;
String X10_TEMP42 = "NOT verified.";
if(X10_TEMP39){
X10_TEMP42 = "verified.";
}
final String X10_TEMP43 = X10_TEMP42;

final String X10_TEMP44 = (X10_TEMP43);

final String X10_TEMP47 = (X10_TEMP45+X10_TEMP44);
System.out.println(X10_TEMP47);
}
public static int _Timer_max_counters_init() {

final int X10_TEMP2 = (64);
return X10_TEMP2;
}
public static void Timer_start(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.start_time);

final double X10_TEMP5 = (System.currentTimeMillis());
final double X10_TEMP6 = (X10_TEMP5);
X10_TEMP1[n] = (X10_TEMP6);
}
public static void Timer_stop(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double X10_TEMP5 = (System.currentTimeMillis());
final double[:rank==1] X10_TEMP3 = (double[:rank==1])(X10_TEMP0.start_time);
final double X10_TEMP6 = (X10_TEMP3[n]);

final double X10_TEMP9 = (X10_TEMP5-X10_TEMP6);
final double X10_TEMP10 = (X10_TEMP9);
X10_TEMP1[n] = (X10_TEMP10);
final double[:rank==1] X10_TEMP11 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double[:rank==1] X10_TEMP13 = (double[:rank==1])(X10_TEMP0.elapsed_time);
final double X10_TEMP15 = (X10_TEMP13[n]);
final int X10_TEMP16 = (1000);

final double X10_TEMP19 = (X10_TEMP15/X10_TEMP16);
final double X10_TEMP20 = (X10_TEMP19);
X10_TEMP11[n] = (X10_TEMP20);
final double[:rank==1] X10_TEMP21 = (double[:rank==1])(X10_TEMP0.total_time);

final double[:rank==1] X10_TEMP23 = (double[:rank==1])(X10_TEMP0.total_time);
final double X10_TEMP27 = (X10_TEMP23[n]);
final double[:rank==1] X10_TEMP25 = (double[:rank==1])(X10_TEMP0.elapsed_time);
final double X10_TEMP28 = (X10_TEMP25[n]);

final double X10_TEMP31 = (X10_TEMP27+X10_TEMP28);
final double X10_TEMP32 = (X10_TEMP31);
X10_TEMP21[n] = (X10_TEMP32);
}
public static double Timer_readTimer(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.total_time);

final double X10_TEMP4 = (X10_TEMP1[n]);
return X10_TEMP4;
}
public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.total_time);

final double X10_TEMP5 = (0);
final double X10_TEMP6 = (X10_TEMP5);
X10_TEMP1[n] = (X10_TEMP6);
final double[:rank==1] X10_TEMP7 = (double[:rank==1])(X10_TEMP0.start_time);

final double X10_TEMP11 = (0);
final double X10_TEMP12 = (X10_TEMP11);
X10_TEMP7[n] = (X10_TEMP12);
final double[:rank==1] X10_TEMP13 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double X10_TEMP17 = (0);
final double X10_TEMP18 = (X10_TEMP17);
X10_TEMP13[n] = (X10_TEMP18);
}
public static void Timer_resetAllTimers(final Timer X10_TEMP0) {
int i = (0);
boolean X10_TEMP4 = i<_Timer_max_counters;
while(X10_TEMP4) {
Program.Timer_resetTimer(X10_TEMP0,i);
final int X10_TEMP6 = (i);
final int X10_TEMP7 = 1;
i = i + X10_TEMP7;

X10_TEMP4 = i<_Timer_max_counters;
}
}

}

value StreamData {
public final boolean [:rank==1] verified;
public final dist(:rank==1) D;
public final double [:rank==1] times;
public final double [:rank==1] a;
public final double [:rank==1] b;
public final double [:rank==1] c;


public StreamData(final long N, final int NUM_TIMES) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (0);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) dverified = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);
final boolean[:rank==1] X10_TEMP11 = (boolean[:rank==1])(this.StreamData_initVerified(dverified));
verified = (boolean[:rank==1])(X10_TEMP11);
final int X10_TEMP17 = (0);
final int X10_TEMP13 = (1);

final long X10_TEMP15 = (N-X10_TEMP13);
final int X10_TEMP18 = ((int)X10_TEMP15);

final region(:rank==1) X10_TEMP20 = (region(:rank==1))([X10_TEMP17:X10_TEMP18]);
final dist(:rank==1) X10_TEMP21 = (dist(:rank==1))(dist.factory.block(X10_TEMP20));

final dist(:rank==1) temp_D = (dist(:rank==1))(X10_TEMP21);
D = (dist(:rank==1))(temp_D);
final int X10_TEMP30 = (0);
final int X10_TEMP26 = (1);

final int X10_TEMP28 = (NUM_TIMES-X10_TEMP26);
final int X10_TEMP31 = ((int)X10_TEMP28);
final region(:rank==1) X10_TEMP32 = (region(:rank==1))([X10_TEMP30:X10_TEMP31]);
final place X10_TEMP33 = (here);

final dist(:rank==1) X10_TEMP35 = (dist(:rank==1))(X10_TEMP32->X10_TEMP33);

final double[:rank==1] X10_TEMP37 = (double[:rank==1])(this.StreamData_initArray(X10_TEMP35));
times = (double[:rank==1])(X10_TEMP37);
final double[:rank==1] X10_TEMP41 = (double[:rank==1])(this.StreamData_initArray(temp_D));
a = (double[:rank==1])(X10_TEMP41);
final double[:rank==1] X10_TEMP45 = (double[:rank==1])(this.StreamData_initArray(temp_D));
b = (double[:rank==1])(X10_TEMP45);
final double[:rank==1] X10_TEMP49 = (double[:rank==1])(this.StreamData_initArray(temp_D));
c = (double[:rank==1])(X10_TEMP49);
}


public boolean [:rank==1] StreamData_initVerified(final dist(:rank==1) d) {
final boolean[:rank==1&&distribution==d] X10_TEMP3 = (boolean[:rank==1&&distribution==d])(new boolean[d](point(:rank==1)p) {
final boolean X10_TEMP2 = (true);
return X10_TEMP2;
}

);

return X10_TEMP3;
}
public double [:rank==1] StreamData_initArray(final dist(:rank==1) d) {
final double[:rank==1&&distribution==d] X10_TEMP3 = (double[:rank==1&&distribution==d])(new double[d](point(:rank==1)p) {
final double X10_TEMP2 = (0.0D);
return X10_TEMP2;
}

);

return X10_TEMP3;
}

}

class Stream {
public final StreamData sd;


public Stream() {
long X10_TEMP3 = (Program._Stream_N);
int X10_TEMP4 = (Program._Stream_NUM_TIMES);

final StreamData X10_TEMP6 = (new StreamData(X10_TEMP3,X10_TEMP4));
sd = (X10_TEMP6);
}


}

class Timer {
public double [:rank==1] start_time;
public double [:rank==1] elapsed_time;
public double [:rank==1] total_time;


public Timer() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (Program._Timer_max_counters);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (place.FIRST_PLACE);

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);
final double[:rank==1] X10_TEMP11 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP9 = (0);
return X10_TEMP9;
}

);
start_time = (double[:rank==1])(X10_TEMP11);
final double[:rank==1] X10_TEMP15 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP13 = (0);
return X10_TEMP13;
}

);
elapsed_time = (double[:rank==1])(X10_TEMP15);
final double[:rank==1] X10_TEMP19 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP17 = (0);
return X10_TEMP17;
}

);
total_time = (double[:rank==1])(X10_TEMP19);
}


}

