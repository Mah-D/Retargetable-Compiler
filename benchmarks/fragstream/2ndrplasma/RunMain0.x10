public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static final int _Program__FragmentedStream_MEG = Program0._Program__FragmentedStream_MEG_init();
public static final double _Program__FragmentedStream_alpha = Program0._Program__FragmentedStream_alpha_init();
public static final int _Program__FragmentedStream_NUM_TIMES = Program0._Program__FragmentedStream_NUM_TIMES_init();
public static final dist(:rank==1) _Program__FragmentedStream_dverified = Program0._Program__FragmentedStream_dverified_init();
public static final long _Program__FragmentedStream_N0 = Program0._Program__FragmentedStream_N0_init();
public static final dist(:rank==1) _Program__FragmentedStream_dtimes = Program0._Program__FragmentedStream_dtimes_init();
public static final boolean[:rank==1] _Program__FragmentedStream_verified = Program0._Program__FragmentedStream_verified_init();
public static final long _Program__FragmentedStream_N = Program0._Program__FragmentedStream_N_init();
public static final int _Program__FragmentedStream_LocalSize = Program0._Program__FragmentedStream_LocalSize_init();
public static final double[:rank==1] _Program__FragmentedStream_times = Program0._Program__FragmentedStream_times_init();
public static final region(:rank==1) _Program__FragmentedStream_R = Program0._Program__FragmentedStream_R_init();
public static final dist(:rank==1) _Program__FragmentedStream_D = Program0._Program__FragmentedStream_D_init();
public static final double[:rank==1] _Program__FragmentedStream_a = Program0._Program__FragmentedStream_a_init();
public static final double[:rank==1] _Program__FragmentedStream_b = Program0._Program__FragmentedStream_b_init();
public static final double[:rank==1] _Program__FragmentedStream_c = Program0._Program__FragmentedStream_c_init();


public static void runMain() {
Program0.Program_runMain();
}
public static int _Program__FragmentedStream_MEG_init() {

final int X10_TEMP126 = (Program0.Program__FragmentedStream_MEG_init());
return X10_TEMP126;
}
public static double _Program__FragmentedStream_alpha_init() {

final double X10_TEMP126 = (Program0.Program__FragmentedStream_alpha_init());
return X10_TEMP126;
}
public static int _Program__FragmentedStream_NUM_TIMES_init() {

final int X10_TEMP126 = (Program0.Program__FragmentedStream_NUM_TIMES_init());
return X10_TEMP126;
}
public static dist(:rank==1) _Program__FragmentedStream_dverified_init() {

final dist(:rank==1) X10_TEMP126 = (dist(:rank==1))(Program0.Program__FragmentedStream_dverified_init());
return X10_TEMP126;
}
public static long _Program__FragmentedStream_N0_init() {

final long X10_TEMP126 = (Program0.Program__FragmentedStream_N0_init());
return X10_TEMP126;
}
public static dist(:rank==1) _Program__FragmentedStream_dtimes_init() {

final dist(:rank==1) X10_TEMP126 = (dist(:rank==1))(Program0.Program__FragmentedStream_dtimes_init());
return X10_TEMP126;
}
public static boolean[:rank==1] _Program__FragmentedStream_verified_init() {

final boolean[:rank==1] X10_TEMP126 = (boolean[:rank==1])(Program0.Program__FragmentedStream_verified_init());
return X10_TEMP126;
}
public static long _Program__FragmentedStream_N_init() {

final long X10_TEMP126 = (Program0.Program__FragmentedStream_N_init());
return X10_TEMP126;
}
public static int _Program__FragmentedStream_LocalSize_init() {

final int X10_TEMP126 = (Program0.Program__FragmentedStream_LocalSize_init());
return X10_TEMP126;
}
public static double[:rank==1] _Program__FragmentedStream_times_init() {

final double[:rank==1] X10_TEMP126 = (double[:rank==1])(Program0.Program__FragmentedStream_times_init());
return X10_TEMP126;
}
public static region(:rank==1) _Program__FragmentedStream_R_init() {

final region(:rank==1) X10_TEMP126 = (region(:rank==1))(Program0.Program__FragmentedStream_R_init());
return X10_TEMP126;
}
public static dist(:rank==1) _Program__FragmentedStream_D_init() {

final dist(:rank==1) X10_TEMP126 = (dist(:rank==1))(Program0.Program__FragmentedStream_D_init());
return X10_TEMP126;
}
public static double[:rank==1] _Program__FragmentedStream_a_init() {

final double[:rank==1] X10_TEMP126 = (double[:rank==1])(Program0.Program__FragmentedStream_a_init());
return X10_TEMP126;
}
public static double[:rank==1] _Program__FragmentedStream_b_init() {

final double[:rank==1] X10_TEMP126 = (double[:rank==1])(Program0.Program__FragmentedStream_b_init());
return X10_TEMP126;
}
public static double[:rank==1] _Program__FragmentedStream_c_init() {

final double[:rank==1] X10_TEMP126 = (double[:rank==1])(Program0.Program__FragmentedStream_c_init());
return X10_TEMP126;
}
public static void Program_runMain() {
final FragmentedStream X10_TEMP126 = (new FragmentedStream());

final FragmentedStream X10_TEMP1 = (X10_TEMP126);
Program0.Program_FragmentedStream_run(X10_TEMP1);
}
public static int Program__FragmentedStream_MEG_init() {
final int X10_TEMP126 = (1024);

final int X10_TEMP1 = (X10_TEMP126);
final int X10_TEMP129 = (1024);

final int X10_TEMP2 = (X10_TEMP129);
final int X10_TEMP132 = (X10_TEMP1*X10_TEMP2);

final int X10_TEMP4 = (X10_TEMP132);
return X10_TEMP4;
}
public static double Program__FragmentedStream_alpha_init() {
final double X10_TEMP126 = (3.0D);

final double X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}
public static int Program__FragmentedStream_NUM_TIMES_init() {
final int X10_TEMP126 = (10);

final int X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}
public static dist(:rank==1) Program__FragmentedStream_dverified_init() {
final int X10_TEMP126 = (0);

final int X10_TEMP3 = (X10_TEMP126);
final int X10_TEMP129 = (0);

final int X10_TEMP4 = (X10_TEMP129);
final region(:rank==1) X10_TEMP134 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) X10_TEMP5 = (region(:rank==1))(X10_TEMP134);
final place X10_TEMP137 = (here);

final place X10_TEMP6 = (X10_TEMP137);
final dist(:rank==1) X10_TEMP140 = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);

final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(X10_TEMP140);
return X10_TEMP8;
}
public static boolean [:rank==1] Program__FragmentedStream_verified_init() {
final boolean[:rank==1&&distribution==_Program__FragmentedStream_dverified] X10_TEMP130 = (boolean[:rank==1&&distribution==_Program__FragmentedStream_dverified])(new boolean[_Program__FragmentedStream_dverified](point(:rank==1)p) {
final boolean X10_TEMP126 = (true);

final boolean X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}

);

final boolean[:rank==1] X10_TEMP4 = (boolean[:rank==1])(X10_TEMP130);
return X10_TEMP4;
}
public static long Program__FragmentedStream_N0_init() {
final int X10_TEMP126 = (2);

final int X10_TEMP1 = (X10_TEMP126);
final int X10_TEMP129 = (X10_TEMP1*_Program__FragmentedStream_MEG);

final long X10_TEMP3 = (X10_TEMP129);
return X10_TEMP3;
}
public static long Program__FragmentedStream_N_init() {
final int X10_TEMP126 = (place.MAX_PLACES);

final int X10_TEMP1 = (X10_TEMP126);
final long X10_TEMP129 = (_Program__FragmentedStream_N0*X10_TEMP1);

final long X10_TEMP3 = (X10_TEMP129);
return X10_TEMP3;
}
public static int Program__FragmentedStream_LocalSize_init() {
final int X10_TEMP126 = ((int)_Program__FragmentedStream_N0);

final int X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}
public static region(:rank==1) Program__FragmentedStream_R_init() {
final int X10_TEMP126 = (0);

final int X10_TEMP6 = (X10_TEMP126);
final int X10_TEMP129 = (1);

final int X10_TEMP2 = (X10_TEMP129);
final long X10_TEMP132 = (_Program__FragmentedStream_N-X10_TEMP2);

final long X10_TEMP4 = (X10_TEMP132);
final int X10_TEMP135 = ((int)X10_TEMP4);

final int X10_TEMP7 = (X10_TEMP135);
final region(:rank==1) X10_TEMP140 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);

final region(:rank==1) X10_TEMP9 = (region(:rank==1))(X10_TEMP140);
return X10_TEMP9;
}
public static dist(:rank==1) Program__FragmentedStream_D_init() {
final dist(:rank==1) X10_TEMP127 = (dist(:rank==1))(dist.factory.block(_Program__FragmentedStream_R));

final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP127);
return X10_TEMP2;
}
public static dist(:rank==1) Program__FragmentedStream_dtimes_init() {
final int X10_TEMP126 = (0);

final int X10_TEMP6 = (X10_TEMP126);
final int X10_TEMP129 = (1);

final int X10_TEMP2 = (X10_TEMP129);
final int X10_TEMP132 = (_Program__FragmentedStream_NUM_TIMES-X10_TEMP2);

final int X10_TEMP4 = (X10_TEMP132);
final int X10_TEMP135 = ((int)X10_TEMP4);

final int X10_TEMP7 = (X10_TEMP135);
final region(:rank==1) X10_TEMP140 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);

final region(:rank==1) X10_TEMP8 = (region(:rank==1))(X10_TEMP140);
final place X10_TEMP143 = (here);

final place X10_TEMP9 = (X10_TEMP143);
final dist(:rank==1) X10_TEMP146 = (dist(:rank==1))(X10_TEMP8->X10_TEMP9);

final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(X10_TEMP146);
return X10_TEMP11;
}
public static double [:rank==1] Program__FragmentedStream_times_init() {
final double[:rank==1&&distribution==_Program__FragmentedStream_dtimes] X10_TEMP130 = (double[:rank==1&&distribution==_Program__FragmentedStream_dtimes])(new double[_Program__FragmentedStream_dtimes](point(:rank==1)p) {
final double X10_TEMP126 = (0.0D);

final double X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}

);

final double[:rank==1] X10_TEMP4 = (double[:rank==1])(X10_TEMP130);
return X10_TEMP4;
}
public static double [:rank==1] Program__FragmentedStream_a_init() {
final double[:rank==1&&distribution==_Program__FragmentedStream_D] X10_TEMP130 = (double[:rank==1&&distribution==_Program__FragmentedStream_D])(new double[_Program__FragmentedStream_D](point(:rank==1)[i]) {
final double X10_TEMP126 = (0.0D);

final double X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}

);

final double[:rank==1] X10_TEMP4 = (double[:rank==1])(X10_TEMP130);
return X10_TEMP4;
}
public static double [:rank==1] Program__FragmentedStream_b_init() {
final double[:rank==1&&distribution==_Program__FragmentedStream_D] X10_TEMP130 = (double[:rank==1&&distribution==_Program__FragmentedStream_D])(new double[_Program__FragmentedStream_D](point(:rank==1)[i]) {
final double X10_TEMP126 = (0.0D);

final double X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}

);

final double[:rank==1] X10_TEMP4 = (double[:rank==1])(X10_TEMP130);
return X10_TEMP4;
}
public static double [:rank==1] Program__FragmentedStream_c_init() {
final double[:rank==1&&distribution==_Program__FragmentedStream_D] X10_TEMP130 = (double[:rank==1&&distribution==_Program__FragmentedStream_D])(new double[_Program__FragmentedStream_D](point(:rank==1)[i]) {
final double X10_TEMP126 = (0.0D);

final double X10_TEMP2 = (X10_TEMP126);
return X10_TEMP2;
}

);

final double[:rank==1] X10_TEMP4 = (double[:rank==1])(X10_TEMP130);
return X10_TEMP4;
}
public static void Program_FragmentedStream_run(final FragmentedStream X10_TEMP0) {
final String X10_TEMP126 = ("LocalSize=");

final String X10_TEMP1 = (X10_TEMP126);
final String X10_TEMP129 = (X10_TEMP1+_Program__FragmentedStream_LocalSize);

final String X10_TEMP3 = (X10_TEMP129);
System.out.println(X10_TEMP3);
finish {
final int X10_TEMP133 = (0);

final int X10_TEMP9 = (X10_TEMP133);
final int X10_TEMP136 = (1);

final int X10_TEMP5 = (X10_TEMP136);
final int X10_TEMP139 = (_Program__FragmentedStream_NUM_TIMES-X10_TEMP5);

final int X10_TEMP7 = (X10_TEMP139);
final int X10_TEMP142 = ((int)X10_TEMP7);

final int X10_TEMP10 = (X10_TEMP142);
final region(:rank==1) X10_TEMP147 = (region(:rank==1))([X10_TEMP9:X10_TEMP10]);

region(:rank==1) r = (region(:rank==1))(X10_TEMP147);
for(point(:rank==1)p1:r) {
finish {
final dist(:rank==1) X10_TEMP151 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP151);
for(point(:rank==1)X10_TEMP16[p]:X10_TEMP14) {
final dist(:rank==1) X10_TEMP155 = (dist(:rank==1))(X10_TEMP14.distribution);

final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(X10_TEMP155);
final place X10_TEMP17 = (X10_TEMP15.get(X10_TEMP16));
async(X10_TEMP17) {
final place X10_TEMP161 = (here);

final place X10_TEMP18 = (X10_TEMP161);
final dist(:rank==1) X10_TEMP164 = (dist(:rank==1))(_Program__FragmentedStream_D|X10_TEMP18);

final dist(:rank==1) X10_TEMP20 = (dist(:rank==1))(X10_TEMP164);
for(point(:rank==1)[i]:X10_TEMP20) {
final double X10_TEMP168 = (1.5);

final double X10_TEMP25 = (X10_TEMP168);
final int X10_TEMP171 = (p*_Program__FragmentedStream_LocalSize);

final int X10_TEMP22 = (X10_TEMP171);
final int X10_TEMP174 = (X10_TEMP22+i);

final int X10_TEMP24 = (X10_TEMP174);
final double X10_TEMP177 = (X10_TEMP25*X10_TEMP24);

final double X10_TEMP28 = (X10_TEMP177);
final double X10_TEMP180 = (X10_TEMP28);

final double X10_TEMP29 = (X10_TEMP180);
final double X10_TEMP184 = (X10_TEMP29);

final double X10_TEMP187 = (X10_TEMP184);
_Program__FragmentedStream_b[i] = (X10_TEMP187);
final double X10_TEMP189 = (2.5);

final double X10_TEMP34 = (X10_TEMP189);
final int X10_TEMP192 = (p*_Program__FragmentedStream_LocalSize);

final int X10_TEMP31 = (X10_TEMP192);
final int X10_TEMP195 = (X10_TEMP31+i);

final int X10_TEMP33 = (X10_TEMP195);
final double X10_TEMP198 = (X10_TEMP34*X10_TEMP33);

final double X10_TEMP37 = (X10_TEMP198);
final double X10_TEMP201 = (X10_TEMP37);

final double X10_TEMP38 = (X10_TEMP201);
final double X10_TEMP205 = (X10_TEMP38);

final double X10_TEMP208 = (X10_TEMP205);
_Program__FragmentedStream_c[i] = (X10_TEMP208);
}
final int X10_TEMP210 = (0);

final int X10_TEMP39 = (X10_TEMP210);
final boolean X10_TEMP41 = (p==X10_TEMP39);
if (X10_TEMP41) {
final double X10_TEMP215 = (Program0.Program_FragmentedStream_mySecond());

final double X10_TEMP43 = (X10_TEMP215);
final int X10_TEMP44 = (0);
final double X10_TEMP219 = (X10_TEMP44-X10_TEMP43);

final double X10_TEMP47 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP47);

final double X10_TEMP48 = (X10_TEMP222);
final double X10_TEMP226 = (X10_TEMP48);

final double X10_TEMP229 = (X10_TEMP226);
_Program__FragmentedStream_times[p1] = (X10_TEMP229);
}
final place X10_TEMP231 = (here);

final place X10_TEMP49 = (X10_TEMP231);
final dist(:rank==1) X10_TEMP234 = (dist(:rank==1))(_Program__FragmentedStream_D|X10_TEMP49);

final dist(:rank==1) X10_TEMP51 = (dist(:rank==1))(X10_TEMP234);
for(point(:rank==1)[i]:X10_TEMP51) {
final double X10_TEMP239 = (_Program__FragmentedStream_b[i]);

final double X10_TEMP56 = (X10_TEMP239);
final double X10_TEMP243 = (_Program__FragmentedStream_c[i]);

final double X10_TEMP55 = (X10_TEMP243);
final double X10_TEMP246 = (_Program__FragmentedStream_alpha*X10_TEMP55);

final double X10_TEMP57 = (X10_TEMP246);
final double X10_TEMP249 = (X10_TEMP56+X10_TEMP57);

final double X10_TEMP60 = (X10_TEMP249);
final double X10_TEMP252 = (X10_TEMP60);

final double X10_TEMP61 = (X10_TEMP252);
final double X10_TEMP256 = (X10_TEMP61);

final double X10_TEMP259 = (X10_TEMP256);
_Program__FragmentedStream_a[i] = (X10_TEMP259);
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP261 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP63 = (dist(:rank==1))(X10_TEMP261);
for(point(:rank==1)X10_TEMP65[p]:X10_TEMP63) {
final dist(:rank==1) X10_TEMP265 = (dist(:rank==1))(X10_TEMP63.distribution);

final dist(:rank==1) X10_TEMP64 = (dist(:rank==1))(X10_TEMP265);
final place X10_TEMP66 = (X10_TEMP64.get(X10_TEMP65));
async(X10_TEMP66) {
final int X10_TEMP271 = (0);

final int X10_TEMP67 = (X10_TEMP271);
final boolean X10_TEMP69 = (p==X10_TEMP67);
if (X10_TEMP69) {
final double X10_TEMP277 = (_Program__FragmentedStream_times[p1]);

final double X10_TEMP72 = (X10_TEMP277);
final double X10_TEMP280 = (Program0.Program_FragmentedStream_mySecond());

final double X10_TEMP73 = (X10_TEMP280);
final double X10_TEMP283 = (X10_TEMP72+X10_TEMP73);

final double X10_TEMP74 = (X10_TEMP283);
final double X10_TEMP287 = (X10_TEMP74);

final double X10_TEMP290 = (X10_TEMP287);
_Program__FragmentedStream_times[p1] = (X10_TEMP290);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP292 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP76 = (dist(:rank==1))(X10_TEMP292);
for(point(:rank==1)X10_TEMP78[p]:X10_TEMP76) {
final dist(:rank==1) X10_TEMP296 = (dist(:rank==1))(X10_TEMP76.distribution);

final dist(:rank==1) X10_TEMP77 = (dist(:rank==1))(X10_TEMP296);
final place X10_TEMP79 = (X10_TEMP77.get(X10_TEMP78));
async(X10_TEMP79) {
final place X10_TEMP302 = (here);

final place X10_TEMP80 = (X10_TEMP302);
final dist(:rank==1) X10_TEMP305 = (dist(:rank==1))(_Program__FragmentedStream_D|X10_TEMP80);

final dist(:rank==1) X10_TEMP82 = (dist(:rank==1))(X10_TEMP305);
for(point(:rank==1)[i]:X10_TEMP82) {
final double X10_TEMP310 = (_Program__FragmentedStream_a[i]);

final double X10_TEMP89 = (X10_TEMP310);
final double X10_TEMP314 = (_Program__FragmentedStream_b[i]);

final double X10_TEMP87 = (X10_TEMP314);
final double X10_TEMP318 = (_Program__FragmentedStream_c[i]);

final double X10_TEMP86 = (X10_TEMP318);
final double X10_TEMP321 = (_Program__FragmentedStream_alpha*X10_TEMP86);

final double X10_TEMP88 = (X10_TEMP321);
final double X10_TEMP324 = (X10_TEMP87+X10_TEMP88);

final double X10_TEMP90 = (X10_TEMP324);
final boolean X10_TEMP92 = (X10_TEMP89!=X10_TEMP90);
if (X10_TEMP92) {
final place X10_TEMP94 = (place.FIRST_PLACE);
async(X10_TEMP94) {
final int X10_TEMP331 = (0);

final int X10_TEMP96 = (X10_TEMP331);
final boolean X10_TEMP334 = (false);

final boolean X10_TEMP99 = (X10_TEMP334);
final boolean X10_TEMP337 = (X10_TEMP99);

final boolean X10_TEMP100 = (X10_TEMP337);
final boolean X10_TEMP341 = (X10_TEMP100);

final boolean X10_TEMP344 = (X10_TEMP341);
_Program__FragmentedStream_verified[X10_TEMP96] = (X10_TEMP344);
}
}
}
}
}
}
}
final long X10_TEMP346 = (10000000L);

double mini = (X10_TEMP346);
final int X10_TEMP349 = (0);

final int X10_TEMP107 = (X10_TEMP349);
final int X10_TEMP352 = (1);

final int X10_TEMP103 = (X10_TEMP352);
final int X10_TEMP355 = (_Program__FragmentedStream_NUM_TIMES-X10_TEMP103);

final int X10_TEMP105 = (X10_TEMP355);
final int X10_TEMP358 = ((int)X10_TEMP105);

final int X10_TEMP108 = (X10_TEMP358);
final region(:rank==1) X10_TEMP363 = (region(:rank==1))([X10_TEMP107:X10_TEMP108]);

region(:rank==1) r = (region(:rank==1))(X10_TEMP363);
for(point(:rank==1)p1:r) {
final double X10_TEMP368 = (_Program__FragmentedStream_times[p1]);

final double X10_TEMP112 = (X10_TEMP368);
final boolean X10_TEMP114 = (X10_TEMP112<mini);
if (X10_TEMP114) {
final double X10_TEMP374 = (_Program__FragmentedStream_times[p1]);

final double X10_TEMP117 = (X10_TEMP374);
final double X10_TEMP377 = (X10_TEMP117);

mini = (X10_TEMP377);
}
}
final int X10_TEMP380 = (0);

final int X10_TEMP121 = (X10_TEMP380);
final boolean X10_TEMP384 = (_Program__FragmentedStream_verified[X10_TEMP121]);

final boolean X10_TEMP123 = (X10_TEMP384);
Program0.Program_FragmentedStream_printStats(_Program__FragmentedStream_N,mini,X10_TEMP123);
}
public static double Program_FragmentedStream_mySecond() {
final long X10_TEMP126 = (System.currentTimeMillis());

final double X10_TEMP1 = (X10_TEMP126);
final double X10_TEMP129 = (1.e6);

final double X10_TEMP2 = (X10_TEMP129);
final double X10_TEMP132 = (X10_TEMP1*X10_TEMP2);

final double X10_TEMP3 = (X10_TEMP132);
final int X10_TEMP135 = (1000);

final int X10_TEMP4 = (X10_TEMP135);
final double X10_TEMP138 = (X10_TEMP3/X10_TEMP4);

final double X10_TEMP6 = (X10_TEMP138);
final double X10_TEMP141 = ((double)X10_TEMP6);

final double X10_TEMP7 = (X10_TEMP141);
final double X10_TEMP144 = (1.e-6);

final double X10_TEMP8 = (X10_TEMP144);
final double X10_TEMP147 = (X10_TEMP7*X10_TEMP8);

final double X10_TEMP10 = (X10_TEMP147);
final double X10_TEMP150 = ((double)X10_TEMP10);

final double X10_TEMP12 = (X10_TEMP150);
return X10_TEMP12;
}
public static void Program_FragmentedStream_printStats(final long N, final double time, final boolean verified) {
long X10_TEMP1 = (N);
double X10_TEMP2 = (time);
boolean X10_TEMP3 = (verified);
final String X10_TEMP129 = ("Number of places=");

final String X10_TEMP4 = (X10_TEMP129);
final int X10_TEMP132 = (place.MAX_PLACES);

final int X10_TEMP5 = (X10_TEMP132);
final String X10_TEMP135 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP7 = (X10_TEMP135);
System.out.println(X10_TEMP7);
final int X10_TEMP139 = (3);

final int X10_TEMP8 = (X10_TEMP139);
final int X10_TEMP142 = (8);

final int X10_TEMP9 = (X10_TEMP142);
final int X10_TEMP145 = (X10_TEMP8*X10_TEMP9);

final long X10_TEMP10 = (X10_TEMP145);
final long X10_TEMP148 = (X10_TEMP10*X10_TEMP1);

final long X10_TEMP11 = (X10_TEMP148);
final long X10_TEMP151 = (X10_TEMP11/_Program__FragmentedStream_MEG);

final long X10_TEMP13 = (X10_TEMP151);
final long X10_TEMP154 = (X10_TEMP13);

long size1 = (X10_TEMP154);
final int X10_TEMP157 = (3);

final int X10_TEMP15 = (X10_TEMP157);
final int X10_TEMP160 = (8);

final int X10_TEMP16 = (X10_TEMP160);
final int X10_TEMP163 = (X10_TEMP15*X10_TEMP16);

final long X10_TEMP17 = (X10_TEMP163);
final long X10_TEMP166 = (X10_TEMP17*X10_TEMP1);

final long X10_TEMP19 = (X10_TEMP166);
final double X10_TEMP169 = (1.0E9);

final double X10_TEMP20 = (X10_TEMP169);
final double X10_TEMP172 = (X10_TEMP20*X10_TEMP2);

final double X10_TEMP22 = (X10_TEMP172);
final double X10_TEMP175 = (X10_TEMP19/X10_TEMP22);

double rate = (X10_TEMP175);
final String X10_TEMP178 = ("Size of arrays: ");

final String X10_TEMP24 = (X10_TEMP178);
final String X10_TEMP181 = (X10_TEMP24+size1);

final String X10_TEMP25 = (X10_TEMP181);
final String X10_TEMP184 = (" MB (total)");

final String X10_TEMP26 = (X10_TEMP184);
final String X10_TEMP187 = (X10_TEMP25+X10_TEMP26);

final String X10_TEMP28 = (X10_TEMP187);
final int X10_TEMP190 = (place.MAX_PLACES);

final int X10_TEMP27 = (X10_TEMP190);
final long X10_TEMP193 = (size1/X10_TEMP27);

final long X10_TEMP29 = (X10_TEMP193);
final String X10_TEMP196 = (X10_TEMP28+X10_TEMP29);

final String X10_TEMP30 = (X10_TEMP196);
final String X10_TEMP199 = (" MB (per place)");

final String X10_TEMP31 = (X10_TEMP199);
final String X10_TEMP202 = (X10_TEMP30+X10_TEMP31);

final String X10_TEMP33 = (X10_TEMP202);
System.out.println(X10_TEMP33);
final String X10_TEMP206 = ("Min time: ");

final String X10_TEMP34 = (X10_TEMP206);
final String X10_TEMP209 = (X10_TEMP34+X10_TEMP2);

final String X10_TEMP35 = (X10_TEMP209);
final String X10_TEMP212 = (" rate=");

final String X10_TEMP36 = (X10_TEMP212);
final String X10_TEMP215 = (X10_TEMP35+X10_TEMP36);

final String X10_TEMP37 = (X10_TEMP215);
final String X10_TEMP218 = (X10_TEMP37+rate);

final String X10_TEMP38 = (X10_TEMP218);
final String X10_TEMP221 = (" GB/s");

final String X10_TEMP39 = (X10_TEMP221);
final String X10_TEMP224 = (X10_TEMP38+X10_TEMP39);

final String X10_TEMP41 = (X10_TEMP224);
System.out.println(X10_TEMP41);
final String X10_TEMP228 = ("Result is ");

final String X10_TEMP48 = (X10_TEMP228);
final boolean X10_TEMP42 = (X10_TEMP3);
String X10_TEMP45 = ("NOT verified.");
if (X10_TEMP42) {
final String X10_TEMP234 = ("verified.");
X10_TEMP45 = (X10_TEMP234);
}
final String X10_TEMP46 = (X10_TEMP45);
final String X10_TEMP237 = (X10_TEMP46);

final String X10_TEMP47 = (X10_TEMP237);
final String X10_TEMP240 = (X10_TEMP48+X10_TEMP47);

final String X10_TEMP50 = (X10_TEMP240);
System.out.println(X10_TEMP50);
}

}

class Program {
}

class FragmentedStream {
}

