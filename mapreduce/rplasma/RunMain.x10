public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _MR_r = Program._MR_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final dist(:rank==1) _MR_d = Program._MR_d_init();
public static final dist(:rank==1) _Timer_d = Program._Timer_d_init();
public static final double[:rank==1] _Timer_start_time = Program._Timer_start_time_init();
public static final double[:rank==1] _Timer_elapsed_time = Program._Timer_elapsed_time_init();
public static final double[:rank==1] _Timer_total_time = Program._Timer_total_time_init();


public static region(:rank==1) _MR_r_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (300);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
return X10_TEMP6;
}
public static dist(:rank==1) _MR_d_init() {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.factory.block(_MR_r));

return X10_TEMP2;
}
public static void MR_run(final MR X10_TEMP0) {
Program.MR_map(X10_TEMP0);
Program.MR_reduce(X10_TEMP0);
final int X10_TEMP2 = (X10_TEMP0.total);
final String X10_TEMP4 = "";
final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;
System.out.println(X10_TEMP3);
}
public static void MR_map(final MR X10_TEMP0) {
final int[:rank==1] b = (int[:rank==1])(X10_TEMP0.a);
finish {
for(point(:rank==1)p:b) {
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1)) (b.distribution);
final place X10_TEMP4 = X10_TEMP3.get(p);
async(X10_TEMP4) {
final int X10_TEMP8 = (b[p]);

final int X10_TEMP11 = (Program.MR_f(X10_TEMP0,X10_TEMP8));
final int X10_TEMP12 = (X10_TEMP11);
b[p] = (X10_TEMP12);
}
}
}
}
public static int MR_f(final MR X10_TEMP0, final int x) {
int X10_TEMP1 = x;
final int X10_TEMP3 = (X10_TEMP1*X10_TEMP1);
return X10_TEMP3;
}
public static void MR_reduce(final MR X10_TEMP0) {
final place h = (here);
final int[:rank==1] X10_TEMP2 = (int[:rank==1])(X10_TEMP0.a);

final region(:rank==1) reg = (region(:rank==1))(X10_TEMP2.region);
final place X10_TEMP4 = (here);

final dist(:rank==1) dis = (dist(:rank==1))(reg->X10_TEMP4);
final int[:rank==1] result = (int[:rank==1])(new int[dis]);
final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP0.a);
for(point(:rank==1)p:X10_TEMP8) {
finish {
final int[:rank==1] c = (int[:rank==1])(X10_TEMP0.a);
final int[:rank==1] X10_TEMP10 = (int[:rank==1])(X10_TEMP0.a);
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(X10_TEMP10.distribution);

final place X10_TEMP14 = X10_TEMP11.get(p);
async(X10_TEMP14) {
final int v = (c[p]);
async(h) {
final int X10_TEMP21 = (v);
result[p] = (X10_TEMP21);
}
}
}
}
for(point(:rank==1)p:result) {
final int X10_TEMP25 = (X10_TEMP0.total);
final int X10_TEMP26 = (result[p]);
final int X10_TEMP27 = (X10_TEMP25+X10_TEMP26);
X10_TEMP0.total = (X10_TEMP27);
}
}
public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final MR X10_TEMP4 = (new MR());

Program.MR_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for mapreduce: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _Timer_max_counters_init() {

final int X10_TEMP2 = (64);
return X10_TEMP2;
}
public static dist(:rank==1) _Timer_d_init() {
final int X10_TEMP3 = (0);
final region(:rank==1) X10_TEMP4 = (region(:rank==1))([X10_TEMP3:_Timer_max_counters]);
final place X10_TEMP5 = (place.FIRST_PLACE);

final dist(:rank==1) X10_TEMP7 = (dist(:rank==1))(X10_TEMP4->X10_TEMP5);
return X10_TEMP7;
}
public static double[:rank==1] _Timer_start_time_init() {

final double[:rank==1] X10_TEMP2 = (double[:rank==1])(new double[_Timer_d]);
return X10_TEMP2;
}
public static double[:rank==1] _Timer_elapsed_time_init() {

final double[:rank==1] X10_TEMP2 = (double[:rank==1])(new double[_Timer_d]);
return X10_TEMP2;
}
public static double[:rank==1] _Timer_total_time_init() {

final double[:rank==1] X10_TEMP2 = (double[:rank==1])(new double[_Timer_d]);
return X10_TEMP2;
}
public static void Timer_start(final Timer X10_TEMP0, final int n) {
int X10_TEMP1 = n;
final double X10_TEMP5 = (System.currentTimeMillis());
final double X10_TEMP6 = (X10_TEMP5);
_Timer_start_time[X10_TEMP1] = (X10_TEMP6);
}
public static void Timer_stop(final Timer X10_TEMP0, final int n) {
int X10_TEMP1 = n;
final double X10_TEMP4 = (System.currentTimeMillis());
final double X10_TEMP5 = (_Timer_start_time[X10_TEMP1]);

final double X10_TEMP8 = (X10_TEMP4-X10_TEMP5);
final double X10_TEMP9 = (X10_TEMP8);
_Timer_elapsed_time[X10_TEMP1] = (X10_TEMP9);
final double X10_TEMP12 = (_Timer_elapsed_time[X10_TEMP1]);
final double X10_TEMP13 = (1000);
final double X10_TEMP14 = (X10_TEMP12/X10_TEMP13);
_Timer_elapsed_time[X10_TEMP1] = (X10_TEMP14);
final double X10_TEMP18 = (_Timer_total_time[X10_TEMP1]);
final double X10_TEMP19 = (_Timer_elapsed_time[X10_TEMP1]);
final double X10_TEMP20 = (X10_TEMP18+X10_TEMP19);
_Timer_total_time[X10_TEMP1] = (X10_TEMP20);
}
public static double Timer_readTimer(final Timer X10_TEMP0, final int n) {
int X10_TEMP1 = n;
final double X10_TEMP4 = (_Timer_total_time[X10_TEMP1]);
return X10_TEMP4;
}
public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
int X10_TEMP1 = n;
final double X10_TEMP5 = (0);
final double X10_TEMP6 = (X10_TEMP5);
_Timer_total_time[X10_TEMP1] = (X10_TEMP6);
final double X10_TEMP10 = (0);
final double X10_TEMP11 = (X10_TEMP10);
_Timer_start_time[X10_TEMP1] = (X10_TEMP11);
final double X10_TEMP15 = (0);
final double X10_TEMP16 = (X10_TEMP15);
_Timer_elapsed_time[X10_TEMP1] = (X10_TEMP16);
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

class MR {
public int [:rank==1] a;
public int total;


public MR() {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(Program._MR_d);

final int[:rank==1] X10_TEMP4 = (int[:rank==1])(new int[X10_TEMP1](point(:rank==1)[i]) {
return i;
}

);
a = (int[:rank==1])(X10_TEMP4);
final int X10_TEMP6 = (0);
total = (X10_TEMP6);
}


}

class Timer {
public Timer() {
int i = (0);
final int X10_TEMP2 = (Program._Timer_max_counters);
boolean X10_TEMP6 = i<X10_TEMP2;
while(X10_TEMP6) {
final double[:rank==1] X10_TEMP7 = (double[:rank==1])(Program._Timer_start_time);

final double X10_TEMP11 = (0);
final double X10_TEMP12 = (X10_TEMP11);
X10_TEMP7[i] = (X10_TEMP12);
final double[:rank==1] X10_TEMP13 = (double[:rank==1])(Program._Timer_elapsed_time);

final double X10_TEMP17 = (0);
final double X10_TEMP18 = (X10_TEMP17);
X10_TEMP13[i] = (X10_TEMP18);
final double[:rank==1] X10_TEMP19 = (double[:rank==1])(Program._Timer_total_time);

final double X10_TEMP23 = (0);
final double X10_TEMP24 = (X10_TEMP23);
X10_TEMP19[i] = (X10_TEMP24);
final int X10_TEMP25 = (i);
final int X10_TEMP26 = 1;
i = i + X10_TEMP26;

final int X10_TEMP4 = (Program._Timer_max_counters);
X10_TEMP6 = i<X10_TEMP4;
}
}


}

