public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final long _Random_multiplier = Program._Random_multiplier_init();
public static final long _Random_addend = Program._Random_addend_init();
public static final long _Random_mask = Program._Random_mask_init();
public static final int _SOR_JACOBI_NUM_ITER = Program._SOR_JACOBI_NUM_ITER_init();
public static final long _SOR_RANDOM_SEED = Program._SOR_RANDOM_SEED_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static long _Random_multiplier_init() {

final long X10_TEMP2 = (0x5DEECE66DL);
return X10_TEMP2;
}
public static long _Random_addend_init() {

final long X10_TEMP2 = (0xBL);
return X10_TEMP2;
}
public static long _Random_mask_init() {
final long X10_TEMP1 = (1L);
final int X10_TEMP2 = (48);

final long X10_TEMP4 = (X10_TEMP1<<X10_TEMP2);
final int X10_TEMP5 = (1);

final long X10_TEMP7 = (X10_TEMP4-X10_TEMP5);
return X10_TEMP7;
}
public static int Random_nextbits(final Random X10_TEMP0, final int bits) {
long oldseed = (X10_TEMP0.seed);
final long X10_TEMP2 = (oldseed*_Random_multiplier);

final long X10_TEMP4 = (X10_TEMP2+_Random_addend);

long nextseed = (X10_TEMP4&_Random_mask);
final long X10_TEMP8 = (nextseed);
X10_TEMP0.seed = (X10_TEMP8);
final int X10_TEMP9 = (48);

final int X10_TEMP11 = (X10_TEMP9-bits);

final long X10_TEMP13 = (nextseed>>>X10_TEMP11);

final int X10_TEMP15 = ((int)X10_TEMP13);
return X10_TEMP15;
}
public static int Random_nextInt(final Random X10_TEMP0) {
final int X10_TEMP2 = (32);

final int X10_TEMP4 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP2));
return X10_TEMP4;
}
public static long Random_nextLong(final Random X10_TEMP0) {
final int X10_TEMP2 = (32);

final int X10_TEMP4 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP2));
final long X10_TEMP5 = ((long)X10_TEMP4);
final int X10_TEMP6 = (32);

final long X10_TEMP8 = (X10_TEMP5<<X10_TEMP6);
final int X10_TEMP10 = (32);
final int X10_TEMP11 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP10));

final long X10_TEMP13 = (X10_TEMP8+X10_TEMP11);
return X10_TEMP13;
}
public static boolean Random_nextBoolean(final Random X10_TEMP0) {
final int X10_TEMP2 = (1);
final int X10_TEMP3 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP2));
final int X10_TEMP4 = (0);

final boolean X10_TEMP6 = (X10_TEMP3!=X10_TEMP4);
return X10_TEMP6;
}
public static double Random_nextDouble(final Random X10_TEMP0) {
final int X10_TEMP2 = (26);

final int X10_TEMP4 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP2));
final long X10_TEMP5 = ((long)X10_TEMP4);
final int X10_TEMP6 = (27);

final long X10_TEMP8 = (X10_TEMP5<<X10_TEMP6);
final int X10_TEMP10 = (27);
final int X10_TEMP11 = (Program.Random_nextbits(X10_TEMP0,X10_TEMP10));

final long X10_TEMP13 = (X10_TEMP8+X10_TEMP11);
final long X10_TEMP14 = (1L);
final int X10_TEMP15 = (53);

final long X10_TEMP17 = (X10_TEMP14<<X10_TEMP15);
final double X10_TEMP18 = ((double)X10_TEMP17);

final double X10_TEMP20 = (X10_TEMP13/X10_TEMP18);
return X10_TEMP20;
}
public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final SOR X10_TEMP4 = (new SOR());

Program.SOR_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for sor: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _SOR_JACOBI_NUM_ITER_init() {

final int X10_TEMP2 = (100);
return X10_TEMP2;
}
public static long _SOR_RANDOM_SEED_init() {

final long X10_TEMP2 = (10101010);
return X10_TEMP2;
}
public static void SOR_run(final SOR X10_TEMP0) {
final double X10_TEMP2 = (Program.SOR_kernel(X10_TEMP0));

Program.SOR_validate(X10_TEMP0,X10_TEMP2);
}
public static double SOR_kernel(final SOR X10_TEMP0) {
final int X10_TEMP4 = (10);
final int X10_TEMP5 = (10);
final Random X10_TEMP6 = (X10_TEMP0.R);

double[:rank==2] G = (double[:rank==2])(Program.SOR_RandomMatrix(X10_TEMP0,X10_TEMP4,X10_TEMP5,X10_TEMP6));
final double X10_TEMP11 = (1.25);

final double X10_TEMP13 = (Program.SOR_SORrun(X10_TEMP0,X10_TEMP11,G,_SOR_JACOBI_NUM_ITER));
return X10_TEMP13;
}
public static double [:rank==2] SOR_RandomMatrix(final SOR X10_TEMP0, final int M, final int N, final Random R) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (M-X10_TEMP2);

final region(:rank==1) X10_TEMP13 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final int X10_TEMP10 = (0);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (N-X10_TEMP8);

final region(:rank==1) X10_TEMP14 = (region(:rank==1))([X10_TEMP10:X10_TEMP11]);

final dist(:rank==2) d = (dist(:rank==2))(Program.SOR_blockStar(X10_TEMP0,X10_TEMP13,X10_TEMP14));
final double[:rank==2] t = (double[:rank==2])(new double[d]);
final region(:rank==2) X10_TEMP18 = (region(:rank==2))(t.region);
for(point(:rank==2)p:X10_TEMP18) {
final double X10_TEMP21 = (Program.Random_nextDouble(R));
final double X10_TEMP22 = (1e-6);

final double X10_TEMP24 = (X10_TEMP21*X10_TEMP22);

Program.SOR_write(X10_TEMP0,t,p,X10_TEMP24);
}
return t;
}
public static void SOR_write(final SOR X10_TEMP0, final double [:rank==2] t, final point(:rank==2) p, final double v) {
finish {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(t.distribution);

final place X10_TEMP4 = X10_TEMP1.get(p);
async(X10_TEMP4) {
final double X10_TEMP8 = (v);
t[p] = (X10_TEMP8);
}
}
}
public static dist(:rank==2) SOR_blockStar(final SOR X10_TEMP0, final region(:rank==1) r1, final region(:rank==1) r2) {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.factory.block(r1));

final dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP2);
final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(Program.SOR_distTimesRegion(X10_TEMP0,d1,r2));
return X10_TEMP7;
}
public static dist(:rank==2) SOR_distTimesRegion(final SOR X10_TEMP0, final dist(:rank==1) d, final region(:rank==1) r) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);

final region(:rank==2) X10_TEMP6 = (region(:rank==2))(X10_TEMP4);
final place X10_TEMP7 = (here);

dist(:rank==2) d0 = (dist(:rank==2))(X10_TEMP6->X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

place p = (X10_TEMP11.get(pl));
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(d|p);
final region(:rank==1) X10_TEMP16 = (region(:rank==1))(X10_TEMP15.region);
final region(:rank==2) X10_TEMP19 = (region(:rank==2))([X10_TEMP16,r]);

final dist(:rank==2) X10_TEMP21 = (dist(:rank==2))(X10_TEMP19->p);

final dist(:rank==2) X10_TEMP23 = (dist(:rank==2))(d0||X10_TEMP21);
d0 = (dist(:rank==2))(X10_TEMP23);
}
return d0;
}
public static void SOR_validate(final SOR X10_TEMP0, final double gtotal) {
final double X10_TEMP1 = (4.5185971433257635E-5);
final double X10_TEMP3 = (gtotal-X10_TEMP1);

double dev = (Math.abs(X10_TEMP3));
final double X10_TEMP5 = (1.0e-12);

final boolean X10_TEMP7 = dev>X10_TEMP5;
if (X10_TEMP7) {
final String X10_TEMP9 = ("Validation failed");
System.out.println(X10_TEMP9);
final String X10_TEMP10 = ("gtotal = ");
final String X10_TEMP11 = (X10_TEMP10+gtotal);
final String X10_TEMP12 = ("  ");
final String X10_TEMP13 = (X10_TEMP11+X10_TEMP12);

final String X10_TEMP15 = (X10_TEMP13+dev);
System.out.println(X10_TEMP15);
final String X10_TEMP17 = ("Validation failed");
throw new RuntimeException(X10_TEMP17);
}
}
public static double SOR_read(final SOR X10_TEMP0, final double [:rank==2] G, final point(:rank==2) pt) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (0);

final region(:rank==1) r = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) d = (dist(:rank==1))(r->X10_TEMP6);
final double[:rank==1] result = (double[:rank==1])(new double[d]);
final place phere = (here);
finish {
final dist(:rank==2) X10_TEMP10 = (dist(:rank==2))(G.distribution);

final place X10_TEMP13 = X10_TEMP10.get(pt);
async(X10_TEMP13) {
final double val = (G[pt]);
async(phere) {
final int X10_TEMP18 = (0);

final double X10_TEMP21 = (val);
result[X10_TEMP18] = (X10_TEMP21);
}
}
}
final int X10_TEMP23 = (0);

final double X10_TEMP25 = (result[X10_TEMP23]);
return X10_TEMP25;
}
public static double SOR_SORrun(final SOR X10_TEMP0, final double omega, final double [:rank==2] G, final int num_iterations) {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(G.distribution);
final region(:rank==2) X10_TEMP2 = (region(:rank==2))(X10_TEMP1.region);
final int X10_TEMP4 = (0);
final int X10_TEMP6 = 2;
final boolean X10_TEMP5 = X10_TEMP4>=X10_TEMP6;
if (X10_TEMP5) {
final String X10_TEMP7 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP8 = ", expected 2";
String X10_TEMP9 = X10_TEMP7 + X10_TEMP4;
X10_TEMP9 = X10_TEMP9 + X10_TEMP8;
throw new RuntimeException(X10_TEMP9);
}
final int X10_TEMP10 = 0;
final int X10_TEMP11 = 1;
final int X10_TEMP13 = X10_TEMP10 - X10_TEMP11;
region(:rank==1) X10_TEMP12 = (region(:rank==1))([X10_TEMP10:X10_TEMP13]);
final int X10_TEMP14 = 0;
final boolean X10_TEMP16 = X10_TEMP4 == X10_TEMP14;
final int X10_TEMP15 = 1;
final boolean X10_TEMP17 = X10_TEMP4 == X10_TEMP15;
for(point(:rank==2)[X10_TEMP18, X10_TEMP19]:X10_TEMP2) {
if(X10_TEMP16) {
final region(:rank==1) X10_TEMP20 = [X10_TEMP18:X10_TEMP18];
X10_TEMP12 = X10_TEMP12 || X10_TEMP20;
}
else {
 if(X10_TEMP17) {
final region(:rank==1) X10_TEMP20 = [X10_TEMP19:X10_TEMP19];
X10_TEMP12 = X10_TEMP12 || X10_TEMP20;
}
}
}
final region(:rank==1) X10_TEMP21 = X10_TEMP12;

final int M = (X10_TEMP21.size());
final dist(:rank==2) X10_TEMP23 = (dist(:rank==2))(G.distribution);
final region(:rank==2) X10_TEMP24 = (region(:rank==2))(X10_TEMP23.region);
final int X10_TEMP26 = (1);
final int X10_TEMP28 = 2;
final boolean X10_TEMP27 = X10_TEMP26>=X10_TEMP28;
if (X10_TEMP27) {
final String X10_TEMP29 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP30 = ", expected 2";
String X10_TEMP31 = X10_TEMP29 + X10_TEMP26;
X10_TEMP31 = X10_TEMP31 + X10_TEMP30;
throw new RuntimeException(X10_TEMP31);
}
final int X10_TEMP32 = 0;
final int X10_TEMP33 = 1;
final int X10_TEMP35 = X10_TEMP32 - X10_TEMP33;
region(:rank==1) X10_TEMP34 = (region(:rank==1))([X10_TEMP32:X10_TEMP35]);
final int X10_TEMP36 = 0;
final boolean X10_TEMP38 = X10_TEMP26 == X10_TEMP36;
final int X10_TEMP37 = 1;
final boolean X10_TEMP39 = X10_TEMP26 == X10_TEMP37;
for(point(:rank==2)[X10_TEMP40, X10_TEMP41]:X10_TEMP24) {
if(X10_TEMP38) {
final region(:rank==1) X10_TEMP42 = [X10_TEMP40:X10_TEMP40];
X10_TEMP34 = X10_TEMP34 || X10_TEMP42;
}
else {
 if(X10_TEMP39) {
final region(:rank==1) X10_TEMP42 = [X10_TEMP41:X10_TEMP41];
X10_TEMP34 = X10_TEMP34 || X10_TEMP42;
}
}
}
final region(:rank==1) X10_TEMP43 = X10_TEMP34;

final int N = (X10_TEMP43.size());
final double X10_TEMP45 = (0.25);

final double omega_over_four = (omega*X10_TEMP45);
final double X10_TEMP47 = (1.0);

final double one_minus_omega = (X10_TEMP47-omega);
final int X10_TEMP49 = (1);

final int Mm1 = (M-X10_TEMP49);
final int X10_TEMP51 = (1);

final int Nm1 = (N-X10_TEMP51);
final int X10_TEMP56 = (0);
final int X10_TEMP54 = (1);
final int X10_TEMP57 = (num_iterations-X10_TEMP54);
final int X10_TEMP60 = (0);
final int X10_TEMP61 = (1);

final region(:rank==2) X10_TEMP63 = (region(:rank==2))([X10_TEMP56:X10_TEMP57,X10_TEMP60:X10_TEMP61]);
for(point(:rank==2)po:X10_TEMP63) {
finish {
final int X10_TEMP79 = (0);
final int X10_TEMP65 = (1);

final int X10_TEMP67 = (Mm1-X10_TEMP65);
final int X10_TEMP69 = (1);
final int X10_TEMP70 = (po[1]);

final int X10_TEMP72 = (X10_TEMP69+X10_TEMP70);

final int X10_TEMP74 = (X10_TEMP67-X10_TEMP72);
final int X10_TEMP75 = (2);

final int X10_TEMP77 = (X10_TEMP74/X10_TEMP75);
final int X10_TEMP83 = (1);
final int X10_TEMP81 = (1);
final int X10_TEMP84 = (Nm1-X10_TEMP81);

final region(:rank==2) X10_TEMP86 = (region(:rank==2))([X10_TEMP79:X10_TEMP77,X10_TEMP83:X10_TEMP84]);
final place X10_TEMP87 = here;
for(point(:rank==2)pt:X10_TEMP86) {
async(X10_TEMP87) {
int X10_TEMP90 = (2);
int X10_TEMP91 = (1);
final point(:rank==2) X10_TEMP97 = (pt* [X10_TEMP90,X10_TEMP91]);
final int X10_TEMP93 = (1);
final int X10_TEMP94 = (po[1]);

int X10_TEMP98 = (X10_TEMP93+X10_TEMP94);
int X10_TEMP99 = (0);

final point(:rank==2) ij = (X10_TEMP97+[X10_TEMP98,X10_TEMP99]);
finish {
final dist(:rank==2) X10_TEMP101 = (dist(:rank==2))(G.distribution);

final place X10_TEMP104 = X10_TEMP101.get(ij);
async(X10_TEMP104) {
final int X10_TEMP107 = (1);
final int X10_TEMP108 = 0;

int X10_TEMP111 = (X10_TEMP108 - X10_TEMP107);
int X10_TEMP112 = (0);

final point(:rank==2) X10_TEMP114 = (ij+[X10_TEMP111,X10_TEMP112]);
final double X10_TEMP122 = (Program.SOR_read(X10_TEMP0,G,X10_TEMP114));
int X10_TEMP118 = (1);
int X10_TEMP119 = (0);

final point(:rank==2) X10_TEMP121 = (ij+[X10_TEMP118,X10_TEMP119]);
final double X10_TEMP123 = (Program.SOR_read(X10_TEMP0,G,X10_TEMP121));
final double X10_TEMP132 = (X10_TEMP122+X10_TEMP123);
int X10_TEMP128 = (0);
final int X10_TEMP125 = (1);
final int X10_TEMP126 = 0;

int X10_TEMP129 = (X10_TEMP126 - X10_TEMP125);

final point(:rank==2) X10_TEMP131 = (ij+[X10_TEMP128,X10_TEMP129]);
final double X10_TEMP133 = (G[X10_TEMP131]);
final double X10_TEMP140 = (X10_TEMP132+X10_TEMP133);
int X10_TEMP136 = (0);
int X10_TEMP137 = (1);

final point(:rank==2) X10_TEMP139 = (ij+[X10_TEMP136,X10_TEMP137]);
final double X10_TEMP141 = (G[X10_TEMP139]);

final double X10_TEMP143 = (X10_TEMP140+X10_TEMP141);
final double X10_TEMP146 = (omega_over_four*X10_TEMP143);
final double X10_TEMP145 = (G[ij]);
final double X10_TEMP147 = (one_minus_omega*X10_TEMP145);

final double X10_TEMP150 = (X10_TEMP146+X10_TEMP147);
final double X10_TEMP151 = (X10_TEMP150);
G[ij] = (X10_TEMP151);
}
}
}
}
}
}
final double X10_TEMP153 = (Program.doublerefArraySum2(G));
return X10_TEMP153;
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
public static double doublerefArraySum2(final double[:rank==2] sumArray) {
	final int maxPlaces = place.MAX_PLACES;
	final int one = 1;
	final int zero = 0;
	final int maxPlacesMinusOne = maxPlaces-one;
	final region(:rank==1) dReg = (region(:rank==1))([zero:maxPlacesMinusOne]);
	final place source = here;
	final dist(:rank==1) dSum = (dist(:rank==1))(dReg->source);
	final double initVal = 0;
	final double[:rank==1] localSumArray = (double[:rank==1])(new double[dSum](point(:rank==1)p) {return initVal;});
	final dist(:rank==1) dUnique = (dist(:rank==1))(dist.UNIQUE);
	finish {
		for(point(:rank==1)p : dUnique) {
			final place nthPlace = dUnique.get(p);
			async(nthPlace) {
				double localSumTemp = 0;
				final place thisPlace = here;
				final dist(:rank==2) sumArrayDist = (dist(:rank==2))(sumArray.distribution);
				final dist(:rank==2) sumArrayDistHere = (dist(:rank==2))(sumArrayDist|thisPlace);
				for(point(:rank==2)pt:sumArrayDistHere) {
					final double localSumCurr = sumArray[pt];
					localSumTemp = localSumTemp + localSumCurr;
				}
				final boolean isNotEqual = localSumTemp!=zero;
				if (isNotEqual) {
					final int index = thisPlace.id;
					final double localSum = localSumTemp;
					async(source) {
						localSumArray[index] = (localSum);
					}
				}
			}
		}
	}
	double globalSum = 0;
	for(point(:rank==1)p:localSumArray) {
		final double localSumCurr = localSumArray[p];
		globalSum = globalSum + localSumCurr;
	}
	return globalSum;
}

}

class Random {
public long seed;


public Random(final long rseed) {
this.Random_setSeed(rseed);
}


public void Random_setSeed(final long rseed) {
final long X10_TEMP1 = (Program._Random_multiplier);

final long X10_TEMP3 = (rseed^X10_TEMP1);
final long X10_TEMP4 = (Program._Random_mask);

final long X10_TEMP6 = (X10_TEMP3&X10_TEMP4);
seed = (X10_TEMP6);
}

}

class SOR {
public Random R;


public SOR() {
long X10_TEMP2 = (Program._SOR_RANDOM_SEED);

final Random X10_TEMP4 = (new Random(X10_TEMP2));
R = (X10_TEMP4);
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

