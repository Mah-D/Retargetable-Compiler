public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final long _Random_multiplier = Program._Random_multiplier_init();
public static final long _Random_addend = Program._Random_addend_init();
public static final long _Random_mask = Program._Random_mask_init();
public static final long _SparseMatmult_RANDOM_SEED = Program._SparseMatmult_RANDOM_SEED_init();
public static final int _SparseMatmult_SPARSE_NUM_ITER = Program._SparseMatmult_SPARSE_NUM_ITER_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final Random _SparseMatmult_R = Program._SparseMatmult_R_init();


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
for(point(:rank==1)[i]:r_nthreads) {
final int X10_TEMP151 = (i*sect);
final int X10_TEMP152 = (X10_TEMP151);
ilow[i] = (X10_TEMP152);
final int X10_TEMP154 = (1);

final int X10_TEMP156 = (i+X10_TEMP154);

final int X10_TEMP158 = (X10_TEMP156*sect);
final int X10_TEMP159 = (1);

final int X10_TEMP162 = (X10_TEMP158-X10_TEMP159);
final int X10_TEMP163 = (X10_TEMP162);
iup[i] = (X10_TEMP163);
final int X10_TEMP165 = (iup[i]);

final boolean X10_TEMP167 = X10_TEMP165>ds_M;
if (X10_TEMP167) {
final int X10_TEMP171 = (ds_M);
iup[i] = (X10_TEMP171);
}
}
for(point(:rank==1)i:r_nz) {
for(point(:rank==1)[j]:r_nthreads) {
final int X10_TEMP176 = (rowin[i]);
final int X10_TEMP177 = (ilow[j]);

final boolean X10_TEMP179 = (X10_TEMP176>=X10_TEMP177);
final int X10_TEMP182 = (rowin[i]);
final int X10_TEMP183 = (iup[j]);

final boolean X10_TEMP185 = (X10_TEMP182<=X10_TEMP183);

final boolean X10_TEMP187 = X10_TEMP179&&X10_TEMP185;
if (X10_TEMP187) {
final int X10_TEMP188 = (1);

final int X10_TEMP190 = (j+X10_TEMP188);
final int X10_TEMP191 = (sumT[X10_TEMP190]);
final int X10_TEMP192 = 1;
final int X10_TEMP193 = (sumT[X10_TEMP190]);
final int X10_TEMP194 = (X10_TEMP193 + X10_TEMP192);
sumT[X10_TEMP190] = (X10_TEMP194);

}
}
}
for(point(:rank==1)[j]:r_nthreads) {
final int X10_TEMP198 = (0);

final region(:rank==1) X10_TEMP200 = (region(:rank==1))([X10_TEMP198:j]);
for(point(:rank==1)[i]:X10_TEMP200) {
final int X10_TEMP203 = (j-i);

final int X10_TEMP205 = (lowsumin[j]);
final int X10_TEMP206 = (sumT[X10_TEMP203]);
final int X10_TEMP207 = (X10_TEMP205+X10_TEMP206);
lowsumin[j] = (X10_TEMP207);
final int X10_TEMP210 = (j-i);

final int X10_TEMP212 = (highsumin[j]);
final int X10_TEMP213 = (sumT[X10_TEMP210]);
final int X10_TEMP214 = (X10_TEMP212+X10_TEMP213);
highsumin[j] = (X10_TEMP214);
}
}
for(point(:rank==1)i1:r_nz) {
for(point(:rank==1)j1:r_nthreads) {
final int X10_TEMP219 = (rowin[i1]);
final int X10_TEMP220 = (ilow[j1]);

final boolean X10_TEMP222 = (X10_TEMP219>=X10_TEMP220);
final int X10_TEMP225 = (rowin[i1]);
final int X10_TEMP226 = (iup[j1]);

final boolean X10_TEMP228 = (X10_TEMP225<=X10_TEMP226);

final boolean X10_TEMP230 = X10_TEMP222&&X10_TEMP228;
if (X10_TEMP230) {
final int X10_TEMP233 = (highsumin[j1]);

final int X10_TEMP237 = (rowin[i1]);
final int X10_TEMP238 = (X10_TEMP237);
rowt[X10_TEMP233] = (X10_TEMP238);
final int X10_TEMP241 = (highsumin[j1]);

final int X10_TEMP245 = (colin[i1]);
final int X10_TEMP246 = (X10_TEMP245);
colt[X10_TEMP241] = (X10_TEMP246);
final int X10_TEMP249 = (highsumin[j1]);

final double X10_TEMP253 = (valin[i1]);
final double X10_TEMP254 = (X10_TEMP253);
valt[X10_TEMP249] = (X10_TEMP254);
final int X10_TEMP257 = (highsumin[j1]);
final int X10_TEMP258 = (1);

final int X10_TEMP261 = (X10_TEMP257+X10_TEMP258);
final int X10_TEMP262 = (X10_TEMP261);
highsumin[j1] = (X10_TEMP262);
}
}
}
final int X10_TEMP269 = (0);
final dist(:rank==1) X10_TEMP264 = (dist(:rank==1))(rowt.distribution);
final region(:rank==1) X10_TEMP265 = (region(:rank==1))(X10_TEMP264.region);
final int X10_TEMP266 = (X10_TEMP265.size());
final int X10_TEMP267 = (1);
final int X10_TEMP270 = (X10_TEMP266-X10_TEMP267);

final region(:rank==1) rowtregion = (region(:rank==1))([X10_TEMP269:X10_TEMP270]);
final place X10_TEMP272 = (here);

final dist(:rank==1) rowtdist = (dist(:rank==1))(rowtregion->X10_TEMP272);
final int value[:rank==1] X10_TEMP277 = (int value[:rank==1])(new int value[rowtregion](point(:rank==1)i) {
final int X10_TEMP276 = (rowt[i]);
return X10_TEMP276;
}

);

final int value[:rank==1] X10_TEMP280 = (int value[:rank==1])(X10_TEMP277);
X10_TEMP0.row = (X10_TEMP280);
final int X10_TEMP287 = (0);
final dist(:rank==1) X10_TEMP282 = (dist(:rank==1))(colt.distribution);
final region(:rank==1) X10_TEMP283 = (region(:rank==1))(X10_TEMP282.region);
final int X10_TEMP284 = (X10_TEMP283.size());
final int X10_TEMP285 = (1);
final int X10_TEMP288 = (X10_TEMP284-X10_TEMP285);

final region(:rank==1) coltregion = (region(:rank==1))([X10_TEMP287:X10_TEMP288]);
final place X10_TEMP290 = (here);

final dist(:rank==1) coltdist = (dist(:rank==1))(coltregion->X10_TEMP290);
final int value[:rank==1] X10_TEMP295 = (int value[:rank==1])(new int value[coltregion](point(:rank==1)i) {
final int X10_TEMP294 = (colt[i]);
return X10_TEMP294;
}

);

final int value[:rank==1] X10_TEMP298 = (int value[:rank==1])(X10_TEMP295);
X10_TEMP0.col = (X10_TEMP298);
final int X10_TEMP305 = (0);
final dist(:rank==1) X10_TEMP300 = (dist(:rank==1))(valt.distribution);
final region(:rank==1) X10_TEMP301 = (region(:rank==1))(X10_TEMP300.region);
final int X10_TEMP302 = (X10_TEMP301.size());
final int X10_TEMP303 = (1);
final int X10_TEMP306 = (X10_TEMP302-X10_TEMP303);

final region(:rank==1) valtregion = (region(:rank==1))([X10_TEMP305:X10_TEMP306]);
final place X10_TEMP308 = (here);

final dist(:rank==1) valtdist = (dist(:rank==1))(valtregion->X10_TEMP308);
final double value[:rank==1] X10_TEMP313 = (double value[:rank==1])(new double value[valtregion](point(:rank==1)i) {
final double X10_TEMP312 = (valt[i]);
return X10_TEMP312;
}

);

final double value[:rank==1] X10_TEMP316 = (double value[:rank==1])(X10_TEMP313);
X10_TEMP0.val = (X10_TEMP316);
final int X10_TEMP323 = (0);
final dist(:rank==1) X10_TEMP318 = (dist(:rank==1))(lowsumin.distribution);
final region(:rank==1) X10_TEMP319 = (region(:rank==1))(X10_TEMP318.region);
final int X10_TEMP320 = (X10_TEMP319.size());
final int X10_TEMP321 = (1);
final int X10_TEMP324 = (X10_TEMP320-X10_TEMP321);

final region(:rank==1) lowsuminregion = (region(:rank==1))([X10_TEMP323:X10_TEMP324]);
final place X10_TEMP326 = (here);

final dist(:rank==1) lowsumindist = (dist(:rank==1))(lowsuminregion->X10_TEMP326);
final int value[:rank==1] X10_TEMP331 = (int value[:rank==1])(new int value[lowsuminregion](point(:rank==1)i) {
final int X10_TEMP330 = (lowsumin[i]);
return X10_TEMP330;
}

);

final int value[:rank==1] X10_TEMP334 = (int value[:rank==1])(X10_TEMP331);
X10_TEMP0.lowsum = (X10_TEMP334);
final int X10_TEMP341 = (0);
final dist(:rank==1) X10_TEMP336 = (dist(:rank==1))(highsumin.distribution);
final region(:rank==1) X10_TEMP337 = (region(:rank==1))(X10_TEMP336.region);
final int X10_TEMP338 = (X10_TEMP337.size());
final int X10_TEMP339 = (1);
final int X10_TEMP342 = (X10_TEMP338-X10_TEMP339);

final region(:rank==1) highsuminregion = (region(:rank==1))([X10_TEMP341:X10_TEMP342]);
final place X10_TEMP344 = (here);

final dist(:rank==1) highsumindist = (dist(:rank==1))(highsuminregion->X10_TEMP344);
final int value[:rank==1] X10_TEMP349 = (int value[:rank==1])(new int value[highsuminregion](point(:rank==1)i) {
final int X10_TEMP348 = (highsumin[i]);
return X10_TEMP348;
}

);

final int value[:rank==1] X10_TEMP352 = (int value[:rank==1])(X10_TEMP349);
X10_TEMP0.highsum = (X10_TEMP352);
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

final int X10_TEMP39 = (col[i]);
final double X10_TEMP41 = (x[X10_TEMP39]);
final double X10_TEMP42 = (val[i]);

final double X10_TEMP44 = (y[X10_TEMP36]);
final double X10_TEMP45 = (X10_TEMP41*X10_TEMP42);
final double X10_TEMP46 = (X10_TEMP44+X10_TEMP45);
y[X10_TEMP36] = (X10_TEMP46);
}
}
}
}
}
}
}
final place curr_place = (here);
final int X10_TEMP50 = (0);
final int X10_TEMP51 = (0);

final region(:rank==1) tempr = (region(:rank==1))([X10_TEMP50:X10_TEMP51]);
final place X10_TEMP53 = (here);

final dist(:rank==1) tempvd = (dist(:rank==1))(tempr->X10_TEMP53);
final double[:rank==1] tempref = (double[:rank==1])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP56 = (0.0);
return X10_TEMP56;
}

);
final int X10_TEMP61 = (0);
final int X10_TEMP59 = (1);
final int X10_TEMP62 = (nz-X10_TEMP59);

final region(:rank==1) X10_TEMP64 = (region(:rank==1))([X10_TEMP61:X10_TEMP62]);
for(point(:rank==1)i:X10_TEMP64) {
finish {
final dist(:rank==1) X10_TEMP65 = (dist(:rank==1))(y.distribution);
int X10_TEMP68 = (row[i]);

final place X10_TEMP70 = X10_TEMP65.get(X10_TEMP68);
async(X10_TEMP70) {
final int X10_TEMP73 = (row[i]);

final double temp = (y[X10_TEMP73]);
async(curr_place) {
final int X10_TEMP77 = (0);

final double X10_TEMP80 = (temp);
tempref[X10_TEMP77] = (X10_TEMP80);
}
}
}
final int X10_TEMP82 = (0);

final double X10_TEMP84 = (X10_TEMP0.ytotal);
final double X10_TEMP85 = (tempref[X10_TEMP82]);
final double X10_TEMP86 = (X10_TEMP84+X10_TEMP85);
X10_TEMP0.ytotal = (X10_TEMP86);
}
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

final double X10_TEMP14 = (X10_TEMP11[n]);
final double X10_TEMP15 = (1000);
final double X10_TEMP16 = (X10_TEMP14/X10_TEMP15);
X10_TEMP11[n] = (X10_TEMP16);
final double[:rank==1] X10_TEMP17 = (double[:rank==1])(X10_TEMP0.total_time);

final double[:rank==1] X10_TEMP19 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double X10_TEMP22 = (X10_TEMP17[n]);
final double X10_TEMP23 = (X10_TEMP19[n]);
final double X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
X10_TEMP17[n] = (X10_TEMP24);
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

class Random {
public long seed;


public Random(final long rseed) {
Random_setSeed(rseed);
}


public void Random_setSeed(final long rseed) {
final long X10_TEMP0 = (Program._Random_multiplier);

final long X10_TEMP2 = (rseed^X10_TEMP0);
final long X10_TEMP3 = (Program._Random_mask);

final long X10_TEMP5 = (X10_TEMP2&X10_TEMP3);
seed = (X10_TEMP5);
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
public final double [:rank==1] start_time;
public final double [:rank==1] elapsed_time;
public final double [:rank==1] total_time;


public Timer() {
int i = (0);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (Program._Timer_max_counters);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (place.FIRST_PLACE);

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP6->X10_TEMP7);
final double[:rank==1] X10_TEMP10 = (double[:rank==1])(new double[d]);
start_time = (double[:rank==1])(X10_TEMP10);
final double[:rank==1] X10_TEMP12 = (double[:rank==1])(new double[d]);
elapsed_time = (double[:rank==1])(X10_TEMP12);
final double[:rank==1] X10_TEMP14 = (double[:rank==1])(new double[d]);
total_time = (double[:rank==1])(X10_TEMP14);
final int X10_TEMP15 = (Program._Timer_max_counters);
boolean X10_TEMP19 = i<X10_TEMP15;
while(X10_TEMP19) {
final double X10_TEMP23 = (0);
final double X10_TEMP24 = (X10_TEMP23);
start_time[i] = (X10_TEMP24);
final double X10_TEMP28 = (0);
final double X10_TEMP29 = (X10_TEMP28);
elapsed_time[i] = (X10_TEMP29);
final double X10_TEMP33 = (0);
final double X10_TEMP34 = (X10_TEMP33);
total_time[i] = (X10_TEMP34);
final int X10_TEMP35 = (i);
final int X10_TEMP36 = 1;
i = i + X10_TEMP36;

final int X10_TEMP17 = (Program._Timer_max_counters);
X10_TEMP19 = i<X10_TEMP17;
}
}


}

