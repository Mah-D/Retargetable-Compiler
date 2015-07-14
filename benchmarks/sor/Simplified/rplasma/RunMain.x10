public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _MyProgram_JACOBI_NUM_ITER = (Program._MyProgram_JACOBI_NUM_ITER_init());
public static final long _MyProgram_RANDOM_SEED = (Program._MyProgram_RANDOM_SEED_init());
public static final long _MyProgram_multiplier = (Program._MyProgram_multiplier_init());
public static final long _MyProgram_addend = (Program._MyProgram_addend_init());
public static final long _MyProgram_numberone = (Program._MyProgram_numberone_init());
public static final long _MyProgram_oneL = (Program._MyProgram_oneL_init());
public static final int _MyProgram_fortyeight = (Program._MyProgram_fortyeight_init());
public static final long _MyProgram_maskplusone = (Program._MyProgram_maskplusone_init());
public static final long _MyProgram_mask = (Program._MyProgram_mask_init());


public static void runMain() {
Program.MyProgram_run();
}
public static int _MyProgram_JACOBI_NUM_ITER_init() {

final int X10_TEMP2 = (100);
return X10_TEMP2;
}
public static long _MyProgram_RANDOM_SEED_init() {

final long X10_TEMP2 = (10101010);
return X10_TEMP2;
}
public static long _MyProgram_multiplier_init() {

final long X10_TEMP2 = (0x5DEECE66DL);
return X10_TEMP2;
}
public static long _MyProgram_addend_init() {

final long X10_TEMP2 = (0xBL);
return X10_TEMP2;
}
public static long _MyProgram_numberone_init() {

final long X10_TEMP2 = (1);
return X10_TEMP2;
}
public static long _MyProgram_oneL_init() {

final long X10_TEMP2 = (1L);
return X10_TEMP2;
}
public static int _MyProgram_fortyeight_init() {

final int X10_TEMP2 = (48);
return X10_TEMP2;
}
public static long _MyProgram_maskplusone_init() {

final long X10_TEMP2 = (_MyProgram_oneL<<_MyProgram_fortyeight);
return X10_TEMP2;
}
public static long _MyProgram_mask_init() {

final long X10_TEMP2 = (_MyProgram_maskplusone-_MyProgram_numberone);
return X10_TEMP2;
}
public static void MyProgram_run() {
final SOR ss = (new SOR());
Program.MyProgram_kernel(ss);
Program.MyProgram_validate(ss);
}
public static void MyProgram_kernel(final SOR s) {
final int ten = (10);
final Random rr = (s.R);
double[:rank==2] G = (double[:rank==2])(Program.MyProgram_RandomMatrix(ten,ten,rr));
final int jni = (_MyProgram_JACOBI_NUM_ITER);
final double oneandaquarter = (1.25);
Program.MyProgram_SORrun(s,oneandaquarter,G,jni);
}
public static double [:rank==2] MyProgram_RandomMatrix(final int M, final int N, final Random R) {
final int one = (1);
final int ub1 = (M-one);
final int ub2 = (N-one);
final int X10_TEMP6 = (0);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP6:ub1]);
final int X10_TEMP10 = (0);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP10:ub2]);
final dist(:rank==2) d = (dist(:rank==2))(Program.MyProgram_blockStar(r1,r2));
final double[:rank==2] t = (double[:rank==2])(new double[d]);
final region(:rank==2) rr = (region(:rank==2))(t.region);
for(point(:rank==2)[i,j]:rr) {
final double dd = (Program.MyProgram_nextDouble(R));
final double small = (1e-6);
final double d2 = (dd*small);
Program.MyProgram_write(t,i,j,d2);
}
return t;
}
public static void MyProgram_write(final double [:rank==2] t, final int i, final int j, final double v) {
final dist(:rank==2) d = (dist(:rank==2))(t.distribution);
final place pl = (d.get(i,j));
final T1 y = (new T1(t,i,j,v));
finish {
async(pl) {
Program.MyProgram_thread1(y);
}
}
}
public static void MyProgram_thread1(final T1 z) {
final double[:rank==2] t = (double[:rank==2])(z.t);
final int i = (z.i);
final int j = (z.j);
final double v = (z.v);
final double X10_TEMP9 = (v);
t[i,j] = (X10_TEMP9);
}
public static dist(:rank==2) MyProgram_blockStar(final region(:rank==1) r1, final region(:rank==1) r2) {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.factory.block(r1));

final dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP2);
final dist(:rank==2) dres = (dist(:rank==2))(Program.MyProgram_distTimesRegion(d1,r2));
return dres;
}
public static dist(:rank==2) MyProgram_distTimesRegion(final dist(:rank==1) d, final region(:rank==1) r) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);

final region(:rank==2) r0 = (region(:rank==2))(X10_TEMP4);
final place h = (here);
dist(:rank==2) d0 = (dist(:rank==2))(r0->h);
final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) d3 = (dist(:rank==1))(X10_TEMP8);
final region(:rank==1) r3 = (region(:rank==1))(d3.region);
for(point(:rank==1)[pl]:r3) {
place p = (place.places(pl));
final dist(:rank==1) restr_d = (dist(:rank==1))(d|p);
final region(:rank==1) restr_r = (region(:rank==1))(restr_d.region);
final region(:rank==2) comb_r = (region(:rank==2))([restr_r,r]);
final dist(:rank==2) comb_d = (dist(:rank==2))(comb_r->p);
final dist(:rank==2) X10_TEMP21 = (dist(:rank==2))(d0||comb_d);
d0 = (dist(:rank==2))(X10_TEMP21);
}
return d0;
}
public static void MyProgram_validate(final SOR s) {
final double gtotal = (s.gtotal);
final double fourandahalf = (4.5185971433257635E-5);
final double difference = (gtotal-fourandahalf);
final double dev = (Math.abs(difference));
final double small = (1.0e-12);
final boolean b = (dev>small);
if (b) {
final String s1 = ("Validation failed");
System.out.println(s1);
final String s2 = ("gtotal = ");
final String s3 = ("  ");
System.out.print(s2);
final String X10_TEMP16 = "";
final String X10_TEMP15 = X10_TEMP16 + gtotal;
System.out.print(X10_TEMP15);
System.out.print(s3);
final String X10_TEMP20 = "";
final String X10_TEMP19 = X10_TEMP20 + dev;
System.out.println(X10_TEMP19);
final String s4 = ("Validation failed");
throw new RuntimeException(s4);
}
}
public static double MyProgram_read(final double [:rank==2] G, final int i, final int j) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (0);

final region(:rank==1) r = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place h = (here);
final dist(:rank==1) d = (dist(:rank==1))(r->h);
final double[:rank==1] result = (double[:rank==1])(new double[d]);
final place phere = (here);
final dist(:rank==2) G_d = (dist(:rank==2))(G.distribution);
final place h2 = (G_d.get(i,j));
final T2 y = (new T2(G,i,j,phere,result));
finish {
async(h2) {
Program.MyProgram_thread2(y);
}
}
final int zero = (0);
final double res = (result[zero]);
return res;
}
public static void MyProgram_thread2(final T2 z) {
final double[:rank==2] G = (double[:rank==2])(z.G);
final int i = (z.i);
final int j = (z.j);
final place phere = (z.phere);
final double[:rank==1] result = (double[:rank==1])(z.result);
final double val = (G[i,j]);
final T3 y = (new T3(result,val));
async(phere) {
Program.MyProgram_thread3(y);
}
}
public static void MyProgram_thread3(final T3 z) {
final double[:rank==1] result = (double[:rank==1])(z.result);
final double val = (z.val);
final int zero = (0);
final double X10_TEMP7 = (val);
result[zero] = (X10_TEMP7);
}
public static void MyProgram_SORrun(final SOR s, final double omega, final double [:rank==2] G, final int num_iterations) {
final int zero = (0);
final int one = (1);
final int two = (2);
final dist(:rank==2) g_d = (dist(:rank==2))(G.distribution);
final region(:rank==2) g_r = (region(:rank==2))(g_d.region);
final int X10_TEMP8 = 2;
final boolean X10_TEMP7 = zero>=X10_TEMP8;
if (X10_TEMP7) {
final String X10_TEMP9 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP10 = ", expected 2";
String X10_TEMP11 = X10_TEMP9 + zero;
X10_TEMP11 = X10_TEMP11 + X10_TEMP10;
throw new RuntimeException(X10_TEMP11);
}
final int X10_TEMP12 = 0;
final int X10_TEMP13 = 1;
final int X10_TEMP15 = X10_TEMP12 - X10_TEMP13;
region(:rank==1) X10_TEMP14 = (region(:rank==1))([X10_TEMP12:X10_TEMP15]);
final int X10_TEMP16 = 0;
final boolean X10_TEMP18 = zero == X10_TEMP16;
final int X10_TEMP17 = 1;
final boolean X10_TEMP19 = zero == X10_TEMP17;
for(point(:rank==2)[X10_TEMP20, X10_TEMP21]:g_r) {
if(X10_TEMP18) {
final region(:rank==1) X10_TEMP22 = [X10_TEMP20:X10_TEMP20];
X10_TEMP14 = X10_TEMP14 || X10_TEMP22;
}
else {
 if(X10_TEMP19) {
final region(:rank==1) X10_TEMP22 = [X10_TEMP21:X10_TEMP21];
X10_TEMP14 = X10_TEMP14 || X10_TEMP22;
}
}
}
final region(:rank==1) X10_TEMP23 = X10_TEMP14;

final region(:rank==1) X10_TEMP25 = (region(:rank==1))(X10_TEMP23);

final region(:rank==1) g_r0 = (region(:rank==1))(X10_TEMP25);
final int X10_TEMP29 = 2;
final boolean X10_TEMP28 = one>=X10_TEMP29;
if (X10_TEMP28) {
final String X10_TEMP30 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP31 = ", expected 2";
String X10_TEMP32 = X10_TEMP30 + one;
X10_TEMP32 = X10_TEMP32 + X10_TEMP31;
throw new RuntimeException(X10_TEMP32);
}
final int X10_TEMP33 = 0;
final int X10_TEMP34 = 1;
final int X10_TEMP36 = X10_TEMP33 - X10_TEMP34;
region(:rank==1) X10_TEMP35 = (region(:rank==1))([X10_TEMP33:X10_TEMP36]);
final int X10_TEMP37 = 0;
final boolean X10_TEMP39 = one == X10_TEMP37;
final int X10_TEMP38 = 1;
final boolean X10_TEMP40 = one == X10_TEMP38;
for(point(:rank==2)[X10_TEMP41, X10_TEMP42]:g_r) {
if(X10_TEMP39) {
final region(:rank==1) X10_TEMP43 = [X10_TEMP41:X10_TEMP41];
X10_TEMP35 = X10_TEMP35 || X10_TEMP43;
}
else {
 if(X10_TEMP40) {
final region(:rank==1) X10_TEMP43 = [X10_TEMP42:X10_TEMP42];
X10_TEMP35 = X10_TEMP35 || X10_TEMP43;
}
}
}
final region(:rank==1) X10_TEMP44 = X10_TEMP35;

final region(:rank==1) X10_TEMP46 = (region(:rank==1))(X10_TEMP44);

final region(:rank==1) g_r1 = (region(:rank==1))(X10_TEMP46);
final int M = (g_r0.size());
final int N = (g_r1.size());
final int Mm1 = (M-one);
final int Nm1 = (N-one);
final int ni_plusone = (num_iterations-one);
final int X10_TEMP55 = (0);

final region(:rank==1) reg1 = (region(:rank==1))([X10_TEMP55:ni_plusone]);
final int X10_TEMP59 = (0);
final int X10_TEMP60 = (1);

final region(:rank==1) reg2 = (region(:rank==1))([X10_TEMP59:X10_TEMP60]);
for(point(:rank==1)[p]:reg1) {
for(point(:rank==1)[o]:reg2) {
final int Mm2 = (Mm1-one);
final int one_plus_o = (one+o);
final int mop = (Mm2-one_plus_o);
final int mopdivtwo = (mop/two);
final int X10_TEMP70 = (0);

final region(:rank==1) reg3 = (region(:rank==1))([X10_TEMP70:mopdivtwo]);
final place h = (here);
finish {
for(point(:rank==1)[ii]:reg3) {
final T4 y = (new T4(ii,o,G,Nm1,omega));
async(h) {
Program.MyProgram_thread4(y);
}
}
}
}
}
final double gs = (Program.doublerefArraySum2(G));
final double X10_TEMP85 = (gs);
s.gtotal = (X10_TEMP85);
}
public static void MyProgram_thread4(final T4 z) {
final int ii = (z.ii);
final int o = (z.o);
final double[:rank==2] G = (double[:rank==2])(z.G);
final int Nm1 = (z.Nm1);
final double omega = (z.omega);
final int one = (1);
final int two = (2);
final int twoii = (two*ii);
final int twoii_plusone = (twoii+one);
final int i = (twoii_plusone+o);
final dist(:rank==2) Gd = (dist(:rank==2))(G.distribution);
final place p = (Gd.get(i,one));
final T5 y = (new T5(Nm1,G,i,omega));
finish {
async(p) {
Program.MyProgram_thread5(y);
}
}
}
public static void MyProgram_thread5(final T5 z) {
final int Nm1 = (z.Nm1);
final double[:rank==2] G = (double[:rank==2])(z.G);
final int i = (z.i);
final double omega = (z.omega);
final int one = (1);
final double quarter = (0.25);
final double onedouble = (1.0);
final double omega_over_four = (omega*quarter);
final double one_minus_omega = (onedouble-omega);
final int Nm1_minusone = (Nm1-one);
final int X10_TEMP13 = (1);

final region(:rank==1) reg = (region(:rank==1))([X10_TEMP13:Nm1_minusone]);
final int i_minusone = (i-one);
final int i_plusone = (i+one);
for(point(:rank==1)[j]:reg) {
final int j_minusone = (j-one);
final int j_plusone = (j+one);
final double re1 = (Program.MyProgram_read(G,i_minusone,j));
final double re2 = (Program.MyProgram_read(G,i_plusone,j));
final double resum = (re1+re2);
final double g1 = (G[i,j_minusone]);
final double g2 = (G[i,j_plusone]);
final double gsum = (g1+g2);
final double re_plus_g = (resum+gsum);
final double omre = (omega_over_four*re_plus_g);
final double gij = (G[i,j]);
final double og = (one_minus_omega*gij);
final double omreog = (omre+og);
final double X10_TEMP47 = (omreog);
G[i,j] = (X10_TEMP47);
}
}
public static int MyProgram_nextbits(final Random rand, final int bits) {
final long oldseed = (rand.seed);
final long om = (oldseed*_MyProgram_multiplier);
final long oma = (om+_MyProgram_addend);
long nextseed = (oma&_MyProgram_mask);
final long X10_TEMP7 = (nextseed);
rand.seed = (X10_TEMP7);
final int fortyeight = (48);
final int fb = (fortyeight-bits);
final long nfb = (nextseed>>>fb);
final int infb = ((int)nfb);
return infb;
}
public static int MyProgram_nextInt(final Random rand) {
final int thirtytwo = (32);
final int nb = (Program.MyProgram_nextbits(rand,thirtytwo));
return nb;
}
public static long MyProgram_nextLong(final Random rand) {
final int thirtytwo = (32);
final int nb1 = (Program.MyProgram_nextbits(rand,thirtytwo));
final long lnb = ((long)nb1);
final int nb2 = (Program.MyProgram_nextbits(rand,thirtytwo));
final long lnbt = (lnb<<thirtytwo);
final long l = (lnbt+nb2);
return l;
}
public static boolean MyProgram_nextBoolean(final Random rand) {
final int zero = (0);
final int one = (1);
final int nb = (Program.MyProgram_nextbits(rand,one));
final boolean b = (nb!=zero);
return b;
}
public static double MyProgram_nextDouble(final Random rand) {
final int twentysix = (26);
final int twentyseven = (27);
final int fiftythree = (53);
final long one = (1L);
final int nb1 = (Program.MyProgram_nextbits(rand,twentysix));
final long lnb1 = ((long)nb1);
final long lnb127 = (lnb1<<twentyseven);
final int nb2 = (Program.MyProgram_nextbits(rand,twentyseven));
final long lnbsum = (lnb127+nb2);
final long of = (one<<fiftythree);
final double dof = ((double)of);
final double res = (lnbsum/dof);
return res;
}
public static String T1_toString(final T1 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T2_toString(final T2 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T3_toString(final T3 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T4_toString(final T4 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T5_toString(final T5 X10_TEMP0) {
final String s = ("");
return s;
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

class MyProgram {
}

class SOR {
public final Random R;


public double gtotal;


public SOR() {
final long rs = (Program._MyProgram_RANDOM_SEED);
final Random X10_TEMP4 = (new Random(rs));
R = (X10_TEMP4);
final double X10_TEMP6 = (0.0);
gtotal = (X10_TEMP6);
}


}

class Random {
public long seed;


public Random(final long rseed) {
final long mu = (Program._MyProgram_multiplier);
final long rm = (rseed^mu);
final long ma = (Program._MyProgram_mask);
final long X10_TEMP5 = (rm&ma);
seed = (X10_TEMP5);
}


}

value T1 {
public final double [:rank==2] t;
public final int i;
public final int j;
public final double v;


public T1(final double [:rank==2] a_t, final int a_i, final int a_j, final double a_v) {
t = (double[:rank==2])(a_t);
i = (a_i);
j = (a_j);
v = (a_v);
}


}

value T2 {
public final double [:rank==2] G;
public final int i;
public final int j;
public final place phere;
public final double [:rank==1] result;


public T2(final double [:rank==2] a_G, final int a_i, final int a_j, final place a_phere, final double [:rank==1] a_result) {
G = (double[:rank==2])(a_G);
i = (a_i);
j = (a_j);
phere = (a_phere);
result = (double[:rank==1])(a_result);
}


}

value T3 {
public final double [:rank==1] result;
public final double val;


public T3(final double [:rank==1] a_result, final double a_val) {
result = (double[:rank==1])(a_result);
val = (a_val);
}


}

value T4 {
public final int ii;
public final int o;
public final double [:rank==2] G;
public final int Nm1;
public final double omega;


public T4(final int a_ii, final int a_o, final double [:rank==2] a_G, final int a_Nm1, final double a_omega) {
ii = (a_ii);
o = (a_o);
G = (double[:rank==2])(a_G);
Nm1 = (a_Nm1);
omega = (a_omega);
}


}

value T5 {
public final int Nm1;
public final double [:rank==2] G;
public final int i;
public final double omega;


public T5(final int a_Nm1, final double [:rank==2] a_G, final int a_i, final double a_omega) {
Nm1 = (a_Nm1);
G = (double[:rank==2])(a_G);
i = (a_i);
omega = (a_omega);
}


}

