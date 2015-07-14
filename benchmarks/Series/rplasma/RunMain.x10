public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final Series X10_TEMP4 = (new Series());

Program.Series_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for series: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static void Series_setSize(final Series X10_TEMP0, final int setsize) {
final int X10_TEMP3 = (setsize);
X10_TEMP0.setsize = (X10_TEMP3);
}
public static void Series_initialise(final Series X10_TEMP0, final int n) {
final int X10_TEMP3 = (n);
X10_TEMP0.array_rows = (X10_TEMP3);
Program.Series_buildTestData(X10_TEMP0);
}
public static void Series_kernel(final Series X10_TEMP0) {
Program.Series_Do(X10_TEMP0);
}
public static void Series_initRefArray(final Series X10_TEMP0, final double [:rank==2] ref) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (0);

final double X10_TEMP7 = (2.8729524964837996);
final double X10_TEMP8 = (X10_TEMP7);
ref[X10_TEMP3,X10_TEMP4] = (X10_TEMP8);
final int X10_TEMP11 = (0);
final int X10_TEMP12 = (1);

final double X10_TEMP15 = (0.0);
final double X10_TEMP16 = (X10_TEMP15);
ref[X10_TEMP11,X10_TEMP12] = (X10_TEMP16);
final int X10_TEMP19 = (1);
final int X10_TEMP20 = (0);

final double X10_TEMP23 = (1.1161046676147888);
final double X10_TEMP24 = (X10_TEMP23);
ref[X10_TEMP19,X10_TEMP20] = (X10_TEMP24);
final int X10_TEMP27 = (1);
final int X10_TEMP28 = (1);

final double X10_TEMP29 = (1.8819691893398025);
final int X10_TEMP30 = 0;

final double X10_TEMP33 = (X10_TEMP30 - X10_TEMP29);
final double X10_TEMP34 = (X10_TEMP33);
ref[X10_TEMP27,X10_TEMP28] = (X10_TEMP34);
final int X10_TEMP37 = (2);
final int X10_TEMP38 = (0);

final double X10_TEMP41 = (0.34429060398168704);
final double X10_TEMP42 = (X10_TEMP41);
ref[X10_TEMP37,X10_TEMP38] = (X10_TEMP42);
final int X10_TEMP45 = (2);
final int X10_TEMP46 = (1);

final double X10_TEMP47 = (1.1645642623320958);
final int X10_TEMP48 = 0;

final double X10_TEMP51 = (X10_TEMP48 - X10_TEMP47);
final double X10_TEMP52 = (X10_TEMP51);
ref[X10_TEMP45,X10_TEMP46] = (X10_TEMP52);
final int X10_TEMP55 = (3);
final int X10_TEMP56 = (0);

final double X10_TEMP59 = (0.15238898702519288);
final double X10_TEMP60 = (X10_TEMP59);
ref[X10_TEMP55,X10_TEMP56] = (X10_TEMP60);
final int X10_TEMP63 = (3);
final int X10_TEMP64 = (1);

final double X10_TEMP65 = (0.8143461113044298);
final int X10_TEMP66 = 0;

final double X10_TEMP69 = (X10_TEMP66 - X10_TEMP65);
final double X10_TEMP70 = (X10_TEMP69);
ref[X10_TEMP63,X10_TEMP64] = (X10_TEMP70);
}
public static void Series_validate(final Series X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (3);
final int X10_TEMP7 = (0);
final int X10_TEMP8 = (1);

final region(:rank==2) r = (region(:rank==2))([X10_TEMP3:X10_TEMP4,X10_TEMP7:X10_TEMP8]);
final place X10_TEMP10 = (here);

final dist(:rank==2) vd = (dist(:rank==2))(r->X10_TEMP10);
final double[:rank==2] ref = (double[:rank==2])(new double[vd](point(:rank==2)p0) {
final double X10_TEMP13 = (0.0);
return X10_TEMP13;
}

);
Program.Series_initRefArray(X10_TEMP0,ref);
for(point(:rank==2)[i,j]:vd) {
final int ii = (i);
final int jj = (j);
double cval = (0);
final place curr_place = (here);
final int X10_TEMP23 = (0);
final int X10_TEMP24 = (0);

final region(:rank==1) tempr = (region(:rank==1))([X10_TEMP23:X10_TEMP24]);
final place X10_TEMP26 = (here);

final dist(:rank==1) tempvd = (dist(:rank==1))(tempr->X10_TEMP26);
final double[:rank==1] tempref = (double[:rank==1])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP29 = (0.0);
return X10_TEMP29;
}

);
final double[:rank==2] tA = (double[:rank==2])(X10_TEMP0.testArray);
finish {
final double[:rank==2] X10_TEMP32 = (double[:rank==2])(X10_TEMP0.testArray);
final dist(:rank==2) X10_TEMP33 = (dist(:rank==2))(X10_TEMP32.distribution);

final place X10_TEMP37 = X10_TEMP33.get(j,i);
async(X10_TEMP37) {
final double temp = (tA[jj,ii]);
async(curr_place) {
final int X10_TEMP43 = (0);

final double X10_TEMP46 = (temp);
tempref[X10_TEMP43] = (X10_TEMP46);
}
}
}
final int X10_TEMP48 = (0);

final double X10_TEMP50 = (tempref[X10_TEMP48]);
cval = (X10_TEMP50);
final double X10_TEMP53 = (ref[i,j]);
final double X10_TEMP55 = (cval-X10_TEMP53);

double error = (Math.abs(X10_TEMP55));
final double X10_TEMP57 = (1.0e-12);

final boolean X10_TEMP59 = error>X10_TEMP57;
if (X10_TEMP59) {
final String X10_TEMP60 = ("Validation failed for coefficient ");
final String X10_TEMP61 = (X10_TEMP60+j);
final String X10_TEMP62 = (",");
final String X10_TEMP63 = (X10_TEMP61+X10_TEMP62);

final String X10_TEMP65 = (X10_TEMP63+i);
System.out.println(X10_TEMP65);
final String X10_TEMP66 = ("Computed value = ");

final String X10_TEMP68 = (X10_TEMP66+cval);
System.out.println(X10_TEMP68);
final String X10_TEMP71 = ("Reference value = ");
final double X10_TEMP72 = (ref[i,j]);

final String X10_TEMP74 = (X10_TEMP71+X10_TEMP72);
System.out.println(X10_TEMP74);
final String X10_TEMP76 = ("Validation failed");
throw new RuntimeException(X10_TEMP76);
}
}
}
public static void Series_tidyup(final Series X10_TEMP0) {
Program.Series_freeTestData(X10_TEMP0);
}
public static void Series_run(final Series X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (0);

final region(:rank==1) tempregion = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) tempdist = (dist(:rank==1))(tempregion->X10_TEMP6);
int j = (10000);
for(point(:rank==1)i:tempdist) {
final int X10_TEMP11 = (0);

Program.Series_setSize(X10_TEMP0,X10_TEMP11);
final int X10_TEMP14 = (100);
final int X10_TEMP15 = (0);
final double X10_TEMP16 = (Math.pow(X10_TEMP14,X10_TEMP15));

final double X10_TEMP18 = (j*X10_TEMP16);

final int X10_TEMP20 = ((int)X10_TEMP18);

Program.Series_initialise(X10_TEMP0,X10_TEMP20);
Program.Series_kernel(X10_TEMP0);
Program.Series_validate(X10_TEMP0);
}
Program.Series_tidyup(X10_TEMP0);
}
public static void Series_buildTestData(final Series X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (1);
final int X10_TEMP9 = (0);
final int X10_TEMP6 = (X10_TEMP0.array_rows);
final int X10_TEMP7 = (1);
final int X10_TEMP10 = (X10_TEMP6-X10_TEMP7);

final region(:rank==2) R = (region(:rank==2))([X10_TEMP3:X10_TEMP4,X10_TEMP9:X10_TEMP10]);
final dist(:rank==2) X10_TEMP13 = (dist(:rank==2))(dist.factory.block(R));

final dist(:rank==2) d = (dist(:rank==2))(X10_TEMP13);
final double[:rank==2&&distribution==d] X10_TEMP15 = (double[:rank==2&&distribution==d])(new double[d]);

final double[:rank==2] X10_TEMP18 = (double[:rank==2])(X10_TEMP15);
X10_TEMP0.testArray = (X10_TEMP18);
}
public static void Series_Do(final Series X10_TEMP0) {
final double[:rank==2] X10_TEMP1 = (double[:rank==2])(X10_TEMP0.testArray);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);

final double X10_TEMP6 = (0.0);

final double X10_TEMP14 = ((double)X10_TEMP6);
final double X10_TEMP8 = (2.0);

final double X10_TEMP15 = ((double)X10_TEMP8);
final int X10_TEMP16 = (1000);
final double X10_TEMP11 = (0.0);

final double X10_TEMP17 = ((double)X10_TEMP11);
final int X10_TEMP18 = (0);
final double X10_TEMP20 = (Program.Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP14,X10_TEMP15,X10_TEMP16,X10_TEMP17,X10_TEMP18));
final double X10_TEMP19 = (2.0);
final double X10_TEMP21 = ((double)X10_TEMP19);

final double X10_TEMP24 = (X10_TEMP20/X10_TEMP21);
final double X10_TEMP25 = (X10_TEMP24);
X10_TEMP1[X10_TEMP4,X10_TEMP5] = (X10_TEMP25);
final double X10_TEMP26 = (3.1415926535897932);

final double omega = ((double)X10_TEMP26);
final dist(:rank==1) X10_TEMP28 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP28);
final double[:rank==2] tA = (double[:rank==2])(X10_TEMP0.testArray);
finish {
for(point(:rank==1)p:U) {
final place X10_TEMP32 = U.get(p);
async(X10_TEMP32) {
int ilow = (0);
final place X10_TEMP35 = (U.get(p));

final boolean X10_TEMP37 = X10_TEMP35.isFirst();
if (X10_TEMP37) {
final int X10_TEMP39 = (1);
ilow = (X10_TEMP39);
}
else {
final int X10_TEMP41 = (0);
ilow = (X10_TEMP41);
}
final dist(:rank==2) X10_TEMP42 = (dist(:rank==2))(tA.distribution);
final place X10_TEMP43 = (here);

final dist(:rank==2) X10_TEMP45 = (dist(:rank==2))(X10_TEMP42|X10_TEMP43);
for(point(:rank==2)pp:X10_TEMP45) {
final int X10_TEMP47 = (pp[1]);

final boolean X10_TEMP49 = X10_TEMP47>=ilow;
if (X10_TEMP49) {
final int X10_TEMP51 = (pp[0]);
final int X10_TEMP52 = (0);

final boolean X10_TEMP54 = X10_TEMP51==X10_TEMP52;
if (X10_TEMP54) {
final double X10_TEMP56 = (0.0);

final double X10_TEMP66 = ((double)X10_TEMP56);
final double X10_TEMP58 = (2.0);

final double X10_TEMP67 = ((double)X10_TEMP58);
final int X10_TEMP68 = (1000);
final int X10_TEMP62 = (pp[1]);
final double X10_TEMP63 = ((double)X10_TEMP62);

final double X10_TEMP69 = (omega*X10_TEMP63);
final int X10_TEMP70 = (1);

final double X10_TEMP73 = (Program.Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP66,X10_TEMP67,X10_TEMP68,X10_TEMP69,X10_TEMP70));
final double X10_TEMP74 = (X10_TEMP73);
tA[pp] = (X10_TEMP74);
}
else {
final double X10_TEMP76 = (0.0);

final double X10_TEMP86 = ((double)X10_TEMP76);
final double X10_TEMP78 = (2.0);

final double X10_TEMP87 = ((double)X10_TEMP78);
final int X10_TEMP88 = (1000);
final int X10_TEMP82 = (pp[1]);
final double X10_TEMP83 = ((double)X10_TEMP82);

final double X10_TEMP89 = (omega*X10_TEMP83);
final int X10_TEMP90 = (2);

final double X10_TEMP93 = (Program.Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP86,X10_TEMP87,X10_TEMP88,X10_TEMP89,X10_TEMP90));
final double X10_TEMP94 = (X10_TEMP93);
tA[pp] = (X10_TEMP94);
}
}
}
}
}
}
}
public static double Series_TrapezoidIntegrate(final Series X10_TEMP0, final double x0, final double x1, final int a_nsteps, final double omegan, final int select) {
double x = (0.0);
double dx = (0.0);
double rvalue = (0.0);
int nsteps = (a_nsteps);
x = (x0);
final double X10_TEMP7 = (x1-x0);
final double X10_TEMP8 = ((double)nsteps);

final double X10_TEMP10 = (X10_TEMP7/X10_TEMP8);
dx = (X10_TEMP10);
final double X10_TEMP15 = (Program.Series_thefunction(X10_TEMP0,x0,omegan,select));
final double X10_TEMP14 = (2.0);
final double X10_TEMP16 = ((double)X10_TEMP14);

final double X10_TEMP18 = (X10_TEMP15/X10_TEMP16);
rvalue = (X10_TEMP18);
final int X10_TEMP19 = (1);

final boolean X10_TEMP21 = nsteps!=X10_TEMP19;
if (X10_TEMP21) {
final int X10_TEMP22 = (nsteps);
final int X10_TEMP23 = 1;
nsteps = nsteps - X10_TEMP23;

final int X10_TEMP24 = (nsteps);
final int X10_TEMP25 = 1;
nsteps = nsteps - X10_TEMP25;

final int X10_TEMP26 = (0);
boolean X10_TEMP30 = nsteps>X10_TEMP26;
while(X10_TEMP30) {
final double X10_TEMP32 = (x+dx);
x = (X10_TEMP32);
final double X10_TEMP36 = (Program.Series_thefunction(X10_TEMP0,x,omegan,select));

final double X10_TEMP38 = (rvalue+X10_TEMP36);
rvalue = (X10_TEMP38);
final int X10_TEMP39 = (nsteps);
final int X10_TEMP40 = 1;
nsteps = nsteps - X10_TEMP40;

final int X10_TEMP28 = (0);
X10_TEMP30 = nsteps>X10_TEMP28;
}
}
final double X10_TEMP45 = (Program.Series_thefunction(X10_TEMP0,x1,omegan,select));
final double X10_TEMP44 = (2.0);
final double X10_TEMP46 = ((double)X10_TEMP44);
final double X10_TEMP47 = (X10_TEMP45/X10_TEMP46);

final double X10_TEMP49 = (rvalue+X10_TEMP47);

final double X10_TEMP51 = (X10_TEMP49*dx);
rvalue = (X10_TEMP51);
final double X10_TEMP53 = (rvalue);

return X10_TEMP53;
}
public static double Series_thefunction(final Series X10_TEMP0, final double x, final double omegan, final int select) {
final int X10_TEMP3 = 0;
final int X10_TEMP13 = 1;
final int X10_TEMP27 = 2;
switch(select){
case X10_TEMP3:
{
final double X10_TEMP4 = (1.0);
final double X10_TEMP5 = ((double)X10_TEMP4);
final double X10_TEMP8 = (x+X10_TEMP5);

final double X10_TEMP10 = (Math.pow(X10_TEMP8,x));

return X10_TEMP10;
}
case X10_TEMP13:
{
final double X10_TEMP14 = (1.0);
final double X10_TEMP15 = ((double)X10_TEMP14);
final double X10_TEMP18 = (x+X10_TEMP15);
final double X10_TEMP21 = (Math.pow(X10_TEMP18,x));
final double X10_TEMP20 = (omegan*x);
final double X10_TEMP22 = (Math.cos(X10_TEMP20));

final double X10_TEMP24 = (X10_TEMP21*X10_TEMP22);

return X10_TEMP24;
}
case X10_TEMP27:
{
final double X10_TEMP28 = (1.0);
final double X10_TEMP29 = ((double)X10_TEMP28);
final double X10_TEMP32 = (x+X10_TEMP29);
final double X10_TEMP35 = (Math.pow(X10_TEMP32,x));
final double X10_TEMP34 = (omegan*x);
final double X10_TEMP36 = (Math.sin(X10_TEMP34));

final double X10_TEMP38 = (X10_TEMP35*X10_TEMP36);

return X10_TEMP38;
}
}
final double X10_TEMP41 = (0.0);

return X10_TEMP41;
}
public static void Series_freeTestData(final Series X10_TEMP0) {
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

class Series {
public int setsize;
public int array_rows;
public double [:rank==2] testArray;


public Series() {
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

