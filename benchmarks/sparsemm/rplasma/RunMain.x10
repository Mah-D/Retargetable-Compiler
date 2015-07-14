public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _MR_r = Program._MR_r_init();
public static final long _Random_multiplier = Program._Random_multiplier_init();
public static final long _Random_addend = Program._Random_addend_init();
public static final long _Random_mask = Program._Random_mask_init();
public static final long _SparseMatmult_RANDOM_SEED = Program._SparseMatmult_RANDOM_SEED_init();
public static final int _SparseMatmult_SPARSE_NUM_ITER = Program._SparseMatmult_SPARSE_NUM_ITER_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final Random _SparseMatmult_R = Program._SparseMatmult_R_init();


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
final SparseMatmult X10_TEMP4 = (new SparseMatmult());
final int X10_TEMP6 = (0);

Program.SparseMatmult_run(X10_TEMP4,X10_TEMP6);
Program.Timer_stop(tmr,count);
final String X10_TEMP9 = ("Wall-clock time for sparsemm: ");
final double X10_TEMP10 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP11 = (X10_TEMP9+X10_TEMP10);
final String X10_TEMP12 = (" secs");

final String X10_TEMP14 = (X10_TEMP11+X10_TEMP12);
System.out.println(X10_TEMP14);
}
public static long _SparseMatmult_RANDOM_SEED_init() {

final long X10_TEMP2 = (10101010);
return X10_TEMP2;
}
public static int _SparseMatmult_SPARSE_NUM_ITER_init() {

final int X10_TEMP2 = (200);
return X10_TEMP2;
}
public static void SparseMatmult_initDataSizes_M(final SparseMatmult X10_TEMP0, final int [:rank==1] datasizesM) {
final int X10_TEMP2 = (0);

final int X10_TEMP5 = (100);
final int X10_TEMP6 = (X10_TEMP5);
datasizesM[X10_TEMP2] = (X10_TEMP6);
final int X10_TEMP8 = (1);

final int X10_TEMP11 = (100000);
final int X10_TEMP12 = (X10_TEMP11);
datasizesM[X10_TEMP8] = (X10_TEMP12);
final int X10_TEMP14 = (2);

final int X10_TEMP17 = (500000);
final int X10_TEMP18 = (X10_TEMP17);
datasizesM[X10_TEMP14] = (X10_TEMP18);
}
public static void SparseMatmult_initDataSizes_N(final SparseMatmult X10_TEMP0, final int [:rank==1] datasizesN) {
final int X10_TEMP2 = (0);

final int X10_TEMP5 = (100);
final int X10_TEMP6 = (X10_TEMP5);
datasizesN[X10_TEMP2] = (X10_TEMP6);
final int X10_TEMP8 = (1);

final int X10_TEMP11 = (100000);
final int X10_TEMP12 = (X10_TEMP11);
datasizesN[X10_TEMP8] = (X10_TEMP12);
final int X10_TEMP14 = (2);

final int X10_TEMP17 = (500000);
final int X10_TEMP18 = (X10_TEMP17);
datasizesN[X10_TEMP14] = (X10_TEMP18);
}
public static void SparseMatmult_initDataSizes_NZ(final SparseMatmult X10_TEMP0, final int [:rank==1] datasizesNZ) {
final int X10_TEMP2 = (0);

final int X10_TEMP5 = (500);
final int X10_TEMP6 = (X10_TEMP5);
datasizesNZ[X10_TEMP2] = (X10_TEMP6);
final int X10_TEMP8 = (1);

final int X10_TEMP11 = (500000);
final int X10_TEMP12 = (X10_TEMP11);
datasizesNZ[X10_TEMP8] = (X10_TEMP12);
final int X10_TEMP14 = (2);

final int X10_TEMP17 = (2500000);
final int X10_TEMP18 = (X10_TEMP17);
datasizesNZ[X10_TEMP14] = (X10_TEMP18);
}
public static Random _SparseMatmult_R_init() {

final Random X10_TEMP3 = (new Random(_SparseMatmult_RANDOM_SEED));
return X10_TEMP3;
}
public static void SparseMatmult_JGFsetsize(final SparseMatmult X10_TEMP0, final int setSize) {
final int X10_TEMP3 = (setSize);
X10_TEMP0.setSize = (X10_TEMP3);
}
public static void SparseMatmult_JGFinitialise(final SparseMatmult X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (2);

final region(:rank==1) ar = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) dr = (dist(:rank==1))(ar->X10_TEMP6);
final int[:rank==1] datasizes_M = (int[:rank==1])(new int[dr](point(:rank==1)p) {
final int X10_TEMP9 = (0);
return X10_TEMP9;
}

);
final int[:rank==1] datasizes_N = (int[:rank==1])(new int[dr](point(:rank==1)p) {
final int X10_TEMP12 = (0);
return X10_TEMP12;
}

);
final int[:rank==1] datasizes_nz = (int[:rank==1])(new int[dr](point(:rank==1)p) {
final int X10_TEMP15 = (0);
return X10_TEMP15;
}

);
Program.SparseMatmult_initDataSizes_M(X10_TEMP0,datasizes_M);
Program.SparseMatmult_initDataSizes_N(X10_TEMP0,datasizes_N);
Program.SparseMatmult_initDataSizes_NZ(X10_TEMP0,datasizes_nz);
final int X10_TEMP21 = (X10_TEMP0.setSize);

final int ds_N = (datasizes_N[X10_TEMP21]);
final int X10_TEMP24 = (X10_TEMP0.setSize);

final int ds_M = (datasizes_M[X10_TEMP24]);
final int X10_TEMP27 = (X10_TEMP0.setSize);

final int ds_nz = (datasizes_nz[X10_TEMP27]);
final int X10_TEMP32 = (0);
final int X10_TEMP30 = (1);
final int X10_TEMP33 = (ds_nz-X10_TEMP30);

final region(:rank==1) r_nz = (region(:rank==1))([X10_TEMP32:X10_TEMP33]);
final int X10_TEMP39 = (0);
final int X10_TEMP36 = (X10_TEMP0.nthreads);
final int X10_TEMP37 = (1);
final int X10_TEMP40 = (X10_TEMP36-X10_TEMP37);

final region(:rank==1) r_nthreads = (region(:rank==1))([X10_TEMP39:X10_TEMP40]);
final int X10_TEMP45 = (0);
final int X10_TEMP43 = (1);
final int X10_TEMP46 = (ds_M-X10_TEMP43);

final region(:rank==1) X10_TEMP48 = (region(:rank==1))([X10_TEMP45:X10_TEMP46]);
final dist(:rank==1) X10_TEMP49 = (dist(:rank==1))(dist.factory.block(X10_TEMP48));

final dist(:rank==1) d_M = (dist(:rank==1))(X10_TEMP49);
final int X10_TEMP53 = (0);
final int X10_TEMP54 = (X10_TEMP0.nthreads);

final region(:rank==1) r_nthreadsPlus1 = (region(:rank==1))([X10_TEMP53:X10_TEMP54]);
final int X10_TEMP59 = (0);
final int X10_TEMP57 = (1);
final int X10_TEMP60 = (ds_N-X10_TEMP57);

final region(:rank==1) ds_NReg = (region(:rank==1))([X10_TEMP59:X10_TEMP60]);
final place X10_TEMP62 = (here);

final dist(:rank==1) ds_NRegDist = (dist(:rank==1))(ds_NReg->X10_TEMP62);
final double[:rank==1&&distribution==ds_NRegDist] X10_TEMP64 = (double[:rank==1&&distribution==ds_NRegDist])(new double[ds_NRegDist]);

final double[:rank==1] X10_TEMP67 = (double[:rank==1])(Program.SparseMatmult_init(X10_TEMP64,_SparseMatmult_R));

final double[:rank==1] xin = (double[:rank==1])(X10_TEMP67);
final int X10_TEMP75 = (0);
final dist(:rank==1) X10_TEMP70 = (dist(:rank==1))(xin.distribution);
final region(:rank==1) X10_TEMP71 = (region(:rank==1))(X10_TEMP70.region);
final int X10_TEMP72 = (X10_TEMP71.size());
final int X10_TEMP73 = (1);
final int X10_TEMP76 = (X10_TEMP72-X10_TEMP73);

final region(:rank==1) xinreg = (region(:rank==1))([X10_TEMP75:X10_TEMP76]);
final place X10_TEMP78 = (here);

final dist(:rank==1) xinregDist = (dist(:rank==1))(xinreg->X10_TEMP78);
final double value[:rank==1] X10_TEMP83 = (double value[:rank==1])(new double value[xinreg](point(:rank==1)p) {
final double X10_TEMP82 = (xin[p]);
return X10_TEMP82;
}

);

final double value[:rank==1] X10_TEMP86 = (double value[:rank==1])(X10_TEMP83);
X10_TEMP0.x = (X10_TEMP86);
final double[:rank==1] X10_TEMP89 = (double[:rank==1])(new double[d_M]);
final double[:rank==1] X10_TEMP90 = (double[:rank==1])(X10_TEMP89);
X10_TEMP0.y = (X10_TEMP90);
final place X10_TEMP91 = (here);

final dist(:rank==1) r_nthreadsregDist = (dist(:rank==1))(r_nthreads->X10_TEMP91);
final int[:rank==1&&distribution==r_nthreadsregDist] X10_TEMP93 = (int[:rank==1&&distribution==r_nthreadsregDist])(new int[r_nthreadsregDist]);

int[:rank==1] ilow = (int[:rank==1])(X10_TEMP93);
final int[:rank==1&&distribution==r_nthreadsregDist] X10_TEMP95 = (int[:rank==1&&distribution==r_nthreadsregDist])(new int[r_nthreadsregDist]);

int[:rank==1] iup = (int[:rank==1])(X10_TEMP95);
final place X10_TEMP97 = (here);

final dist(:rank==1) r_nthreadsplus1regDist = (dist(:rank==1))(r_nthreadsPlus1->X10_TEMP97);
final place X10_TEMP99 = (here);

final dist(:rank==1) dsnzDist = (dist(:rank==1))(r_nz->X10_TEMP99);
final int[:rank==1] rowt = (int[:rank==1])(new int[dsnzDist]);
final int[:rank==1] colt = (int[:rank==1])(new int[dsnzDist]);
final double[:rank==1] valt = (double[:rank==1])(new double[dsnzDist]);
int[:rank==1] sumT = (int[:rank==1])(new int[r_nthreadsplus1regDist]);
final int X10_TEMP105 = (X10_TEMP0.nthreads);
final int X10_TEMP106 = (ds_M+X10_TEMP105);
final int X10_TEMP107 = (1);

final int X10_TEMP109 = (X10_TEMP106-X10_TEMP107);
final int X10_TEMP110 = (X10_TEMP0.nthreads);

int sect = (X10_TEMP109/X10_TEMP110);
int[:rank==1] rowin = (int[:rank==1])(new int[dsnzDist]);
int[:rank==1] colin = (int[:rank==1])(new int[dsnzDist]);
double[:rank==1] valin = (double[:rank==1])(new double[dsnzDist]);
final int[:rank==1&&distribution==r_nthreadsregDist] X10_TEMP115 = (int[:rank==1&&distribution==r_nthreadsregDist])(new int[r_nthreadsregDist]);

final int[:rank==1] lowsumin = (int[:rank==1])(X10_TEMP115);
final int[:rank==1&&distribution==r_nthreadsregDist] X10_TEMP117 = (int[:rank==1&&distribution==r_nthreadsregDist])(new int[r_nthreadsregDist]);

final int[:rank==1] highsumin = (int[:rank==1])(X10_TEMP117);
final int X10_TEMP122 = (0);
final int X10_TEMP120 = (1);
final int X10_TEMP123 = (ds_nz-X10_TEMP120);

final region(:rank==1) X10_TEMP125 = (region(:rank==1))([X10_TEMP122:X10_TEMP123]);
for(point(:rank==1)p:X10_TEMP125) {
final int X10_TEMP128 = (Program.Random_nextInt(_SparseMatmult_R));
final int X10_TEMP129 = (Math.abs(X10_TEMP128));

final int X10_TEMP132 = (X10_TEMP129%ds_M);
final int X10_TEMP133 = (X10_TEMP132);
rowin[p] = (X10_TEMP133);
final int X10_TEMP136 = (Program.Random_nextInt(_SparseMatmult_R));
final int X10_TEMP137 = (Math.abs(X10_TEMP136));

final int X10_TEMP140 = (X10_TEMP137%ds_N);
final int X10_TEMP141 = (X10_TEMP140);
colin[p] = (X10_TEMP141);
final double X10_TEMP145 = (Program.Random_nextDouble(_SparseMatmult_R));
final double X10_TEMP146 = (X10_TEMP145);
valin[p] = (X10_TEMP146);
}
for(point(:rank==1)i:r_nthreads) {
final int X10_TEMP150 = (i[0]);

final int X10_TEMP153 = (X10_TEMP150*sect);
final int X10_TEMP154 = (X10_TEMP153);
ilow[i] = (X10_TEMP154);
final int X10_TEMP157 = (i[0]);
final int X10_TEMP158 = (1);

final int X10_TEMP160 = (X10_TEMP157+X10_TEMP158);

final int X10_TEMP162 = (X10_TEMP160*sect);
final int X10_TEMP163 = (1);

final int X10_TEMP166 = (X10_TEMP162-X10_TEMP163);
final int X10_TEMP167 = (X10_TEMP166);
iup[i] = (X10_TEMP167);
final int X10_TEMP169 = (iup[i]);

final boolean X10_TEMP171 = X10_TEMP169>ds_M;
if (X10_TEMP171) {
final int X10_TEMP175 = (ds_M);
iup[i] = (X10_TEMP175);
}
}
for(point(:rank==1)i:r_nz) {
for(point(:rank==1)j:r_nthreads) {
final int X10_TEMP180 = (rowin[i]);
final int X10_TEMP181 = (ilow[j]);

final boolean X10_TEMP183 = (X10_TEMP180>=X10_TEMP181);
final int X10_TEMP186 = (rowin[i]);
final int X10_TEMP187 = (iup[j]);

final boolean X10_TEMP189 = (X10_TEMP186<=X10_TEMP187);

final boolean X10_TEMP191 = X10_TEMP183&&X10_TEMP189;
if (X10_TEMP191) {
int X10_TEMP193 = (1);

final point(:rank==1) X10_TEMP195 = (j+[X10_TEMP193]);

int X10_TEMP197 = (1);

final point(:rank==1) X10_TEMP199 = (j+[X10_TEMP197]);
final int X10_TEMP200 = (sumT[X10_TEMP199]);
final int X10_TEMP201 = (1);

final int X10_TEMP204 = (X10_TEMP200+X10_TEMP201);
final int X10_TEMP205 = (X10_TEMP204);
sumT[X10_TEMP195] = (X10_TEMP205);
}
}
}
for(point(:rank==1)[j]:r_nthreads) {
final int X10_TEMP209 = (0);

final region(:rank==1) X10_TEMP211 = (region(:rank==1))([X10_TEMP209:j]);
for(point(:rank==1)[i]:X10_TEMP211) {
final int X10_TEMP216 = (lowsumin[j]);
final int X10_TEMP215 = (j-i);
final int X10_TEMP217 = (sumT[X10_TEMP215]);

final int X10_TEMP220 = (X10_TEMP216+X10_TEMP217);
final int X10_TEMP221 = (X10_TEMP220);
lowsumin[j] = (X10_TEMP221);
final int X10_TEMP226 = (highsumin[j]);
final int X10_TEMP225 = (j-i);
final int X10_TEMP227 = (sumT[X10_TEMP225]);

final int X10_TEMP230 = (X10_TEMP226+X10_TEMP227);
final int X10_TEMP231 = (X10_TEMP230);
highsumin[j] = (X10_TEMP231);
}
}
for(point(:rank==1)i1:r_nz) {
for(point(:rank==1)j1:r_nthreads) {
final int X10_TEMP236 = (rowin[i1]);
final int X10_TEMP237 = (ilow[j1]);

final boolean X10_TEMP239 = (X10_TEMP236>=X10_TEMP237);
final int X10_TEMP242 = (rowin[i1]);
final int X10_TEMP243 = (iup[j1]);

final boolean X10_TEMP245 = (X10_TEMP242<=X10_TEMP243);

final boolean X10_TEMP247 = X10_TEMP239&&X10_TEMP245;
if (X10_TEMP247) {
final int X10_TEMP250 = (highsumin[j1]);

final int X10_TEMP254 = (rowin[i1]);
final int X10_TEMP255 = (X10_TEMP254);
rowt[X10_TEMP250] = (X10_TEMP255);
final int X10_TEMP258 = (highsumin[j1]);

final int X10_TEMP262 = (colin[i1]);
final int X10_TEMP263 = (X10_TEMP262);
colt[X10_TEMP258] = (X10_TEMP263);
final int X10_TEMP266 = (highsumin[j1]);

final double X10_TEMP270 = (valin[i1]);
final double X10_TEMP271 = (X10_TEMP270);
valt[X10_TEMP266] = (X10_TEMP271);
final int X10_TEMP274 = (highsumin[j1]);
final int X10_TEMP275 = (1);

final int X10_TEMP278 = (X10_TEMP274+X10_TEMP275);
final int X10_TEMP279 = (X10_TEMP278);
highsumin[j1] = (X10_TEMP279);
}
}
}
final int X10_TEMP286 = (0);
final dist(:rank==1) X10_TEMP281 = (dist(:rank==1))(rowt.distribution);
final region(:rank==1) X10_TEMP282 = (region(:rank==1))(X10_TEMP281.region);
final int X10_TEMP283 = (X10_TEMP282.size());
final int X10_TEMP284 = (1);
final int X10_TEMP287 = (X10_TEMP283-X10_TEMP284);

final region(:rank==1) rowtregion = (region(:rank==1))([X10_TEMP286:X10_TEMP287]);
final place X10_TEMP289 = (here);

final dist(:rank==1) rowtdist = (dist(:rank==1))(rowtregion->X10_TEMP289);
final int value[:rank==1] X10_TEMP294 = (int value[:rank==1])(new int value[rowtregion](point(:rank==1)i) {
final int X10_TEMP293 = (rowt[i]);
return X10_TEMP293;
}

);

final int value[:rank==1] X10_TEMP297 = (int value[:rank==1])(X10_TEMP294);
X10_TEMP0.row = (X10_TEMP297);
final int X10_TEMP304 = (0);
final dist(:rank==1) X10_TEMP299 = (dist(:rank==1))(colt.distribution);
final region(:rank==1) X10_TEMP300 = (region(:rank==1))(X10_TEMP299.region);
final int X10_TEMP301 = (X10_TEMP300.size());
final int X10_TEMP302 = (1);
final int X10_TEMP305 = (X10_TEMP301-X10_TEMP302);

final region(:rank==1) coltregion = (region(:rank==1))([X10_TEMP304:X10_TEMP305]);
final place X10_TEMP307 = (here);

final dist(:rank==1) coltdist = (dist(:rank==1))(coltregion->X10_TEMP307);
final int value[:rank==1] X10_TEMP312 = (int value[:rank==1])(new int value[coltregion](point(:rank==1)i) {
final int X10_TEMP311 = (colt[i]);
return X10_TEMP311;
}

);

final int value[:rank==1] X10_TEMP315 = (int value[:rank==1])(X10_TEMP312);
X10_TEMP0.col = (X10_TEMP315);
final int X10_TEMP322 = (0);
final dist(:rank==1) X10_TEMP317 = (dist(:rank==1))(valt.distribution);
final region(:rank==1) X10_TEMP318 = (region(:rank==1))(X10_TEMP317.region);
final int X10_TEMP319 = (X10_TEMP318.size());
final int X10_TEMP320 = (1);
final int X10_TEMP323 = (X10_TEMP319-X10_TEMP320);

final region(:rank==1) valtregion = (region(:rank==1))([X10_TEMP322:X10_TEMP323]);
final place X10_TEMP325 = (here);

final dist(:rank==1) valtdist = (dist(:rank==1))(valtregion->X10_TEMP325);
final double value[:rank==1] X10_TEMP330 = (double value[:rank==1])(new double value[valtregion](point(:rank==1)i) {
final double X10_TEMP329 = (valt[i]);
return X10_TEMP329;
}

);

final double value[:rank==1] X10_TEMP333 = (double value[:rank==1])(X10_TEMP330);
X10_TEMP0.val = (X10_TEMP333);
final int X10_TEMP340 = (0);
final dist(:rank==1) X10_TEMP335 = (dist(:rank==1))(lowsumin.distribution);
final region(:rank==1) X10_TEMP336 = (region(:rank==1))(X10_TEMP335.region);
final int X10_TEMP337 = (X10_TEMP336.size());
final int X10_TEMP338 = (1);
final int X10_TEMP341 = (X10_TEMP337-X10_TEMP338);

final region(:rank==1) lowsuminregion = (region(:rank==1))([X10_TEMP340:X10_TEMP341]);
final place X10_TEMP343 = (here);

final dist(:rank==1) lowsumindist = (dist(:rank==1))(lowsuminregion->X10_TEMP343);
final int value[:rank==1] X10_TEMP348 = (int value[:rank==1])(new int value[lowsuminregion](point(:rank==1)i) {
final int X10_TEMP347 = (lowsumin[i]);
return X10_TEMP347;
}

);

final int value[:rank==1] X10_TEMP351 = (int value[:rank==1])(X10_TEMP348);
X10_TEMP0.lowsum = (X10_TEMP351);
final int X10_TEMP358 = (0);
final dist(:rank==1) X10_TEMP353 = (dist(:rank==1))(highsumin.distribution);
final region(:rank==1) X10_TEMP354 = (region(:rank==1))(X10_TEMP353.region);
final int X10_TEMP355 = (X10_TEMP354.size());
final int X10_TEMP356 = (1);
final int X10_TEMP359 = (X10_TEMP355-X10_TEMP356);

final region(:rank==1) highsuminregion = (region(:rank==1))([X10_TEMP358:X10_TEMP359]);
final place X10_TEMP361 = (here);

final dist(:rank==1) highsumindist = (dist(:rank==1))(highsuminregion->X10_TEMP361);
final int value[:rank==1] X10_TEMP366 = (int value[:rank==1])(new int value[highsuminregion](point(:rank==1)i) {
final int X10_TEMP365 = (highsumin[i]);
return X10_TEMP365;
}

);

final int value[:rank==1] X10_TEMP369 = (int value[:rank==1])(X10_TEMP366);
X10_TEMP0.highsum = (X10_TEMP369);
}
public static void SparseMatmult_JGFkernel(final SparseMatmult X10_TEMP0) {
final double[:rank==1] X10_TEMP9 = (double[:rank==1])(X10_TEMP0.y);
final double value[:rank==1] X10_TEMP10 = (double value[:rank==1])(X10_TEMP0.val);
final int value[:rank==1] X10_TEMP11 = (int value[:rank==1])(X10_TEMP0.row);
final int value[:rank==1] X10_TEMP12 = (int value[:rank==1])(X10_TEMP0.col);
final double value[:rank==1] X10_TEMP13 = (double value[:rank==1])(X10_TEMP0.x);
final int value[:rank==1] X10_TEMP14 = (int value[:rank==1])(X10_TEMP0.lowsum);
final int value[:rank==1] X10_TEMP15 = (int value[:rank==1])(X10_TEMP0.highsum);

Program.SparseMatmult_test(X10_TEMP0,X10_TEMP9,X10_TEMP10,X10_TEMP11,X10_TEMP12,X10_TEMP13,_SparseMatmult_SPARSE_NUM_ITER,X10_TEMP14,X10_TEMP15);
}
public static void SparseMatmult_initRefVal(final SparseMatmult X10_TEMP0, final double [:rank==1] refval) {
final int X10_TEMP2 = (0);

final double X10_TEMP5 = (0.1436496372119012);
final double X10_TEMP6 = (X10_TEMP5);
refval[X10_TEMP2] = (X10_TEMP6);
final int X10_TEMP8 = (1);

final double X10_TEMP11 = (150.0130719633895);
final double X10_TEMP12 = (X10_TEMP11);
refval[X10_TEMP8] = (X10_TEMP12);
final int X10_TEMP14 = (2);

final double X10_TEMP17 = (749.5245870753752);
final double X10_TEMP18 = (X10_TEMP17);
refval[X10_TEMP14] = (X10_TEMP18);
}
public static void SparseMatmult_JGFvalidate(final SparseMatmult X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (2);

region(:rank==1) rtemp = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

dist(:rank==1) dtemp = (dist(:rank==1))(rtemp->X10_TEMP6);
double[:rank==1] refval = (double[:rank==1])(new double[dtemp]);
Program.SparseMatmult_initRefVal(X10_TEMP0,refval);
final double X10_TEMP12 = (X10_TEMP0.ytotal);
final int X10_TEMP11 = (X10_TEMP0.setSize);
final double X10_TEMP13 = (refval[X10_TEMP11]);
final double X10_TEMP15 = (X10_TEMP12-X10_TEMP13);

double dev = (Math.abs(X10_TEMP15));
final double X10_TEMP17 = (1.0e-10);

final boolean X10_TEMP19 = dev>X10_TEMP17;
if (X10_TEMP19) {
final String X10_TEMP21 = ("Validation failed");
System.out.println(X10_TEMP21);
final String X10_TEMP22 = ("ytotal = ");
final double X10_TEMP23 = (X10_TEMP0.ytotal);
final String X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
final String X10_TEMP25 = ("  ");
final String X10_TEMP26 = (X10_TEMP24+X10_TEMP25);
final String X10_TEMP27 = (X10_TEMP26+dev);
final String X10_TEMP28 = ("  ");
final String X10_TEMP29 = (X10_TEMP27+X10_TEMP28);
final int X10_TEMP30 = (X10_TEMP0.setSize);

final String X10_TEMP32 = (X10_TEMP29+X10_TEMP30);
System.out.println(X10_TEMP32);
final String X10_TEMP34 = ("Validation failed");
throw new RuntimeException(X10_TEMP34);
}
}
public static void SparseMatmult_JGFtidyup(final SparseMatmult X10_TEMP0) {
}
public static void SparseMatmult_run(final SparseMatmult X10_TEMP0, final int setSize) {
Program.SparseMatmult_JGFsetsize(X10_TEMP0,setSize);
Program.SparseMatmult_JGFinitialise(X10_TEMP0);
Program.SparseMatmult_JGFkernel(X10_TEMP0);
Program.SparseMatmult_JGFvalidate(X10_TEMP0);
Program.SparseMatmult_JGFtidyup(X10_TEMP0);
}
public static double [:rank==1] SparseMatmult_init(final double [:rank==1] a, final Random R) {
final int X10_TEMP7 = (0);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(a.distribution);
final region(:rank==1) X10_TEMP3 = (region(:rank==1))(X10_TEMP2.region);
final int X10_TEMP4 = (X10_TEMP3.size());
final int X10_TEMP5 = (1);
final int X10_TEMP8 = (X10_TEMP4-X10_TEMP5);

final region(:rank==1) areg = (region(:rank==1))([X10_TEMP7:X10_TEMP8]);
final place X10_TEMP10 = (here);

final dist(:rank==1) adist = (dist(:rank==1))(areg->X10_TEMP10);
for(point(:rank==1)i:areg) {
final double X10_TEMP14 = (Program.Random_nextDouble(R));
final double X10_TEMP15 = (1e-6);

final double X10_TEMP18 = (X10_TEMP14*X10_TEMP15);
final double X10_TEMP19 = (X10_TEMP18);
a[i] = (X10_TEMP19);
}
return a;
}
public static void SparseMatmult_test(final SparseMatmult X10_TEMP0, final double [:rank==1] y, final double value[:rank==1] val, final int value[:rank==1] row, final int value[:rank==1] col, final double value[:rank==1] x, final int NUM_ITERATIONS, final int value[:rank==1] lowsum, final int value[:rank==1] highsum) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(val.region);

final int nz = (X10_TEMP1.size());
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dDistU = (dist(:rank==1))(X10_TEMP3);
final double X10_TEMP7 = (0.0);
final double X10_TEMP8 = (X10_TEMP7);
X10_TEMP0.ytotal = (X10_TEMP8);
finish {
final place X10_TEMP10 = here;
for(point(:rank==1)id1:dDistU) {
async(X10_TEMP10) {
final int X10_TEMP14 = (0);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (NUM_ITERATIONS-X10_TEMP12);

final region(:rank==1) X10_TEMP17 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
for(point(:rank==1)reps:X10_TEMP17) {
final int X10_TEMP24 = (lowsum[id1]);
final int X10_TEMP21 = (highsum[id1]);
final int X10_TEMP22 = (1);
final int X10_TEMP25 = (X10_TEMP21-X10_TEMP22);

final region(:rank==1) X10_TEMP27 = (region(:rank==1))([X10_TEMP24:X10_TEMP25]);
for(point(:rank==1)i:X10_TEMP27) {
finish {
final dist(:rank==1) X10_TEMP28 = (dist(:rank==1))(y.distribution);
int X10_TEMP31 = (row[i]);

final place X10_TEMP33 = X10_TEMP28.get(X10_TEMP31);
async(X10_TEMP33) {
final int X10_TEMP36 = (row[i]);

final int X10_TEMP39 = (row[i]);
final double X10_TEMP46 = (y[X10_TEMP39]);
final int X10_TEMP42 = (col[i]);
final double X10_TEMP44 = (x[X10_TEMP42]);
final double X10_TEMP45 = (val[i]);
final double X10_TEMP47 = (X10_TEMP44*X10_TEMP45);

final double X10_TEMP50 = (X10_TEMP46+X10_TEMP47);
final double X10_TEMP51 = (X10_TEMP50);
y[X10_TEMP36] = (X10_TEMP51);
}
}
}
}
}
}
}
final place curr_place = (here);
final int X10_TEMP55 = (0);
final int X10_TEMP56 = (0);

final region(:rank==1) tempr = (region(:rank==1))([X10_TEMP55:X10_TEMP56]);
final place X10_TEMP58 = (here);

final dist(:rank==1) tempvd = (dist(:rank==1))(tempr->X10_TEMP58);
final double[:rank==1] tempref = (double[:rank==1])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP61 = (0.0);
return X10_TEMP61;
}

);
final int X10_TEMP66 = (0);
final int X10_TEMP64 = (1);
final int X10_TEMP67 = (nz-X10_TEMP64);

final region(:rank==1) X10_TEMP69 = (region(:rank==1))([X10_TEMP66:X10_TEMP67]);
for(point(:rank==1)i:X10_TEMP69) {
finish {
final dist(:rank==1) X10_TEMP70 = (dist(:rank==1))(y.distribution);
int X10_TEMP73 = (row[i]);

final place X10_TEMP75 = X10_TEMP70.get(X10_TEMP73);
async(X10_TEMP75) {
final int X10_TEMP78 = (row[i]);

final double temp = (y[X10_TEMP78]);
async(curr_place) {
final int X10_TEMP82 = (0);

final double X10_TEMP85 = (temp);
tempref[X10_TEMP82] = (X10_TEMP85);
}
}
}
final double X10_TEMP88 = (X10_TEMP0.ytotal);
final int X10_TEMP87 = (0);
final double X10_TEMP89 = (tempref[X10_TEMP87]);

final double X10_TEMP92 = (X10_TEMP88+X10_TEMP89);
final double X10_TEMP93 = (X10_TEMP92);
X10_TEMP0.ytotal = (X10_TEMP93);
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

class SparseMatmult {
public int nthreads;
public int setSize;
public double value[:rank==1] x;
public double value[:rank==1] val;
public int value[:rank==1] col;
public int value[:rank==1] row;
public int value[:rank==1] lowsum;
public int value[:rank==1] highsum;
public double [:rank==1] y;
public double ytotal;


public SparseMatmult() {
final int X10_TEMP3 = (place.MAX_PLACES);
final int X10_TEMP4 = (X10_TEMP3);
this.nthreads = (X10_TEMP4);
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

