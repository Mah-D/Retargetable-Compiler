public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _MR_r = Program._MR_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


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
public static region(:rank==1) _MR_r_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (300000);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
return X10_TEMP6;
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
final int X10_TEMP2 = (x*x);
return X10_TEMP2;
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
final int X10_TEMP24 = (X10_TEMP0.total);
final int X10_TEMP25 = (result[p]);

final int X10_TEMP28 = (X10_TEMP24+X10_TEMP25);
final int X10_TEMP29 = (X10_TEMP28);
X10_TEMP0.total = (X10_TEMP29);
}
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

class MR {
public int [:rank==1] a;
public int total;


public MR() {
final region(:rank==1) X10_TEMP2 = (region(:rank==1))(Program._MR_r);
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(dist.factory.block(X10_TEMP2));

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP3);
final int[:rank==1] X10_TEMP9 = (int[:rank==1])(new int[d](point(:rank==1)p) {
final int X10_TEMP7 = (p[0]);
return X10_TEMP7;
}

);
a = (int[:rank==1])(X10_TEMP9);
final int X10_TEMP11 = (0);
total = (X10_TEMP11);
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

