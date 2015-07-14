public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _md_ITERS = Program._md_ITERS_init();
public static final double _md_LENGTH = Program._md_LENGTH_init();
public static final double _md_m = Program._md_m_init();
public static final double _md_mu = Program._md_mu_init();
public static final double _md_kb = Program._md_kb_init();
public static final double _md_TSIM = Program._md_TSIM_init();
public static final double _md_deltat = Program._md_deltat_init();
public static final double _md_den = Program._md_den_init();
public static final double _md_tref = Program._md_tref_init();
public static final double _md_h = Program._md_h_init();
public static final int _md_irep = Program._md_irep_init();
public static final int _md_istop = Program._md_istop_init();
public static final int _md_iprint = Program._md_iprint_init();
public static final int _md_movemx = Program._md_movemx_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
Program.md_exec();
Program.Timer_stop(tmr,count);
final String X10_TEMP6 = ("Wall-clock time for moldyn: ");
final double X10_TEMP7 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = (" secs");

final String X10_TEMP11 = (X10_TEMP8+X10_TEMP9);
System.out.println(X10_TEMP11);
}
public static int _md_ITERS_init() {

final int X10_TEMP2 = (100);
return X10_TEMP2;
}
public static double _md_LENGTH_init() {

final double X10_TEMP2 = (50e-10);
return X10_TEMP2;
}
public static double _md_m_init() {

final double X10_TEMP2 = (4.0026);
return X10_TEMP2;
}
public static double _md_mu_init() {

final double X10_TEMP2 = (1.66056e-27);
return X10_TEMP2;
}
public static double _md_kb_init() {

final double X10_TEMP2 = (1.38066e-23);
return X10_TEMP2;
}
public static double _md_TSIM_init() {

final double X10_TEMP2 = (50);
return X10_TEMP2;
}
public static double _md_deltat_init() {

final double X10_TEMP2 = (5e-16);
return X10_TEMP2;
}
public static double _md_den_init() {

final double X10_TEMP2 = (0.83134);
return X10_TEMP2;
}
public static double _md_tref_init() {

final double X10_TEMP2 = (0.722);
return X10_TEMP2;
}
public static double _md_h_init() {

final double X10_TEMP2 = (0.064);
return X10_TEMP2;
}
public static int _md_irep_init() {

final int X10_TEMP2 = (10);
return X10_TEMP2;
}
public static int _md_istop_init() {

final int X10_TEMP2 = (19);
return X10_TEMP2;
}
public static int _md_iprint_init() {

final int X10_TEMP2 = (10);
return X10_TEMP2;
}
public static int _md_movemx_init() {

final int X10_TEMP2 = (50);
return X10_TEMP2;
}
public static void md_exec() {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) D = (dist(:rank==1))(X10_TEMP1);
final md[:rank==1] P = (md[:rank==1])(new md[D](point(:rank==1)pt) {
final md X10_TEMP4 = (new md());
return X10_TEMP4;
}

);
Program.md_init(D,P);
Program.md_run(D,P);
Program.md_validate(D,P);
}
public static void md_init(final dist(:rank==1) D, final md [:rank==1] P) {
finish {
for(point(:rank==1)j:D) {
final place X10_TEMP2 = D.get(j);
async(X10_TEMP2) {
final md X10_TEMP5 = (P[j]);
final int X10_TEMP9 = (j[0]);
final int X10_TEMP10 = (place.MAX_PLACES);

Program.md_initialise(X10_TEMP5,X10_TEMP9,X10_TEMP10);
}
}
}
}
public static void md_run(final dist(:rank==1) D, final md [:rank==1] P) {
int n = (0);
final int X10_TEMP5 = (0);
final int X10_TEMP3 = (1);
final int X10_TEMP6 = (_md_movemx-X10_TEMP3);

final region(:rank==1) X10_TEMP8 = (region(:rank==1))([X10_TEMP5:X10_TEMP6]);
for(point(:rank==1)move:X10_TEMP8) {
finish {
for(point(:rank==1)j:D) {
final place X10_TEMP10 = D.get(j);
async(X10_TEMP10) {
final md X10_TEMP12 = (P[j]);

Program.md_runiters1(X10_TEMP12);
}
}
}
finish {
for(point(:rank==1)j:D) {
final place X10_TEMP14 = D.get(j);
async(X10_TEMP14) {
final md X10_TEMP16 = (P[j]);

Program.md_runiters2(X10_TEMP16,P);
}
}
}
finish {
for(point(:rank==1)j:D) {
final place X10_TEMP19 = D.get(j);
async(X10_TEMP19) {
final md X10_TEMP21 = (P[j]);
final int X10_TEMP24 = (move[0]);

Program.md_runiters3(X10_TEMP21,X10_TEMP24);
}
}
}
}
}
public static void md_validate(final dist(:rank==1) D, final md [:rank==1] P) {
finish {
for(point(:rank==1)j:D) {
final place X10_TEMP2 = D.get(j);
async(X10_TEMP2) {
double ref = (275.97175611773514);
final md X10_TEMP5 = (P[j]);
final double X10_TEMP6 = (X10_TEMP5.ek);
final double X10_TEMP8 = (X10_TEMP6-ref);

double dev = (Math.abs(X10_TEMP8));
final double X10_TEMP10 = (1.0e-12);

final boolean X10_TEMP12 = dev>X10_TEMP10;
if (X10_TEMP12) {
final String X10_TEMP14 = ("Validation failed at place: ");
final int X10_TEMP15 = (j[0]);

final String X10_TEMP17 = (X10_TEMP14+X10_TEMP15);
System.out.println(X10_TEMP17);
final String X10_TEMP20 = ("Kinetic energy = ");
final md X10_TEMP19 = (P[j]);
final double X10_TEMP21 = (X10_TEMP19.ek);
final String X10_TEMP22 = (X10_TEMP20+X10_TEMP21);
final String X10_TEMP23 = (" ");
final String X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
final String X10_TEMP25 = (X10_TEMP24+dev);
final String X10_TEMP26 = (" ");
final String X10_TEMP27 = (X10_TEMP25+X10_TEMP26);

final String X10_TEMP29 = (X10_TEMP27+ref);
System.out.println(X10_TEMP29);
final String X10_TEMP31 = ("Validation failed");
throw new RuntimeException(X10_TEMP31);
}
}
}
}
}
public static void md_initialise(final md X10_TEMP0, final int rank0, final int nprocess0) {
final int X10_TEMP3 = (rank0);
X10_TEMP0.rnk = (X10_TEMP3);
final int X10_TEMP6 = (nprocess0);
X10_TEMP0.nprocess = (X10_TEMP6);
final double X10_TEMP9 = (0.0);
final double X10_TEMP10 = (X10_TEMP9);
X10_TEMP0.vir = (X10_TEMP10);
final double X10_TEMP13 = (0.0);
final double X10_TEMP14 = (X10_TEMP13);
X10_TEMP0.epot = (X10_TEMP14);
final int X10_TEMP17 = (0);
final int X10_TEMP18 = (X10_TEMP17);
X10_TEMP0.interactions = (X10_TEMP18);
int mm = (4);
final int X10_TEMP20 = (mm*mm);
final int X10_TEMP21 = (X10_TEMP20*mm);
final int X10_TEMP22 = (4);

int partsize = (X10_TEMP21*X10_TEMP22);
final int X10_TEMP26 = (partsize);
X10_TEMP0.mdsize = (X10_TEMP26);
final int X10_TEMP31 = (0);
final int X10_TEMP28 = (X10_TEMP0.mdsize);
final int X10_TEMP29 = (1);
final int X10_TEMP32 = (X10_TEMP28-X10_TEMP29);
final region(:rank==1) X10_TEMP33 = (region(:rank==1))([X10_TEMP31:X10_TEMP32]);
final place X10_TEMP34 = (here);

dist(:rank==1) dOne = (dist(:rank==1))(X10_TEMP33->X10_TEMP34);
final Particle[:rank==1] X10_TEMP38 = (Particle[:rank==1])(new Particle[dOne]);
final Particle[:rank==1] X10_TEMP39 = (Particle[:rank==1])(X10_TEMP38);
X10_TEMP0.one = (X10_TEMP39);
final double X10_TEMP42 = (_md_LENGTH);
X10_TEMP0.l = (X10_TEMP42);
final double X10_TEMP43 = (X10_TEMP0.mdsize);

final double X10_TEMP45 = (X10_TEMP43/_md_den);
final double X10_TEMP48 = (0.3333333);

final double X10_TEMP51 = (Math.pow(X10_TEMP45,X10_TEMP48));
final double X10_TEMP52 = (X10_TEMP51);
X10_TEMP0.side = (X10_TEMP52);
final double X10_TEMP53 = (4.0);

final double X10_TEMP56 = (mm/X10_TEMP53);
final double X10_TEMP57 = (X10_TEMP56);
X10_TEMP0.rcoff = (X10_TEMP57);
final double X10_TEMP58 = (X10_TEMP0.side);

final double X10_TEMP61 = (X10_TEMP58/mm);
final double X10_TEMP62 = (X10_TEMP61);
X10_TEMP0.a = (X10_TEMP62);
final double X10_TEMP63 = (X10_TEMP0.side);
final double X10_TEMP64 = (0.5);

final double X10_TEMP67 = (X10_TEMP63*X10_TEMP64);
final double X10_TEMP68 = (X10_TEMP67);
X10_TEMP0.sideh = (X10_TEMP68);
final double X10_TEMP71 = (_md_h*_md_h);
final double X10_TEMP72 = (X10_TEMP71);
X10_TEMP0.hsq = (X10_TEMP72);
final double X10_TEMP73 = (X10_TEMP0.hsq);
final double X10_TEMP74 = (0.5);

final double X10_TEMP77 = (X10_TEMP73*X10_TEMP74);
final double X10_TEMP78 = (X10_TEMP77);
X10_TEMP0.hsq2 = (X10_TEMP78);
final int X10_TEMP79 = (X10_TEMP0.mdsize);
final int X10_TEMP80 = (1);

final int X10_TEMP83 = (X10_TEMP79-X10_TEMP80);
final int X10_TEMP84 = (X10_TEMP83);
X10_TEMP0.npartm = (X10_TEMP84);
final double X10_TEMP85 = (X10_TEMP0.rcoff);
final double X10_TEMP86 = (X10_TEMP0.rcoff);

final double X10_TEMP89 = (X10_TEMP85*X10_TEMP86);
final double X10_TEMP90 = (X10_TEMP89);
X10_TEMP0.rcoffs = (X10_TEMP90);
final double X10_TEMP97 = (16.0);
final double X10_TEMP91 = (1.0);
final int X10_TEMP92 = (X10_TEMP0.mdsize);
final double X10_TEMP93 = (X10_TEMP91*X10_TEMP92);
final double X10_TEMP94 = (1.0);

final double X10_TEMP96 = (X10_TEMP93-X10_TEMP94);

final double X10_TEMP100 = (X10_TEMP97/X10_TEMP96);
final double X10_TEMP101 = (X10_TEMP100);
X10_TEMP0.tscale = (X10_TEMP101);
final double X10_TEMP105 = (1.13);
final double X10_TEMP102 = (24.0);
final double X10_TEMP104 = (_md_tref/X10_TEMP102);
final double X10_TEMP106 = (Math.sqrt(X10_TEMP104));

final double X10_TEMP109 = (X10_TEMP105*X10_TEMP106);
final double X10_TEMP110 = (X10_TEMP109);
X10_TEMP0.vaver = (X10_TEMP110);
final double X10_TEMP111 = (X10_TEMP0.vaver);

final double X10_TEMP114 = (X10_TEMP111*_md_h);
final double X10_TEMP115 = (X10_TEMP114);
X10_TEMP0.vaverh = (X10_TEMP115);
final int X10_TEMP118 = (0);
final int X10_TEMP119 = (0);

final region(:rank==1) X10_TEMP121 = (region(:rank==1))([X10_TEMP118:X10_TEMP119]);
for(point(:rank==1)base:X10_TEMP121) {
point(:rank==1) ijk = (base);
final int X10_TEMP125 = (0);
final int X10_TEMP126 = (1);
final int X10_TEMP130 = (0);
final int X10_TEMP128 = (1);
final int X10_TEMP131 = (mm-X10_TEMP128);
final int X10_TEMP135 = (0);
final int X10_TEMP133 = (1);
final int X10_TEMP136 = (mm-X10_TEMP133);
final int X10_TEMP140 = (0);
final int X10_TEMP138 = (1);
final int X10_TEMP141 = (mm-X10_TEMP138);

final region(:rank==4) X10_TEMP143 = (region(:rank==4))([X10_TEMP125:X10_TEMP126,X10_TEMP130:X10_TEMP131,X10_TEMP135:X10_TEMP136,X10_TEMP140:X10_TEMP141]);
for(point(:rank==4)p:X10_TEMP143) {
final Particle[:rank==1] X10_TEMP144 = (Particle[:rank==1])(X10_TEMP0.one);

final double X10_TEMP147 = (p[1]);
final double X10_TEMP148 = (X10_TEMP0.a);
final double X10_TEMP154 = (X10_TEMP147*X10_TEMP148);
final double X10_TEMP150 = (p[0]);
final double X10_TEMP151 = (X10_TEMP0.a);
final double X10_TEMP152 = (X10_TEMP150*X10_TEMP151);
final double X10_TEMP153 = (0.5);
final double X10_TEMP155 = (X10_TEMP152*X10_TEMP153);

final double X10_TEMP157 = (X10_TEMP154+X10_TEMP155);

final double X10_TEMP160 = (p[2]);
final double X10_TEMP161 = (X10_TEMP0.a);
final double X10_TEMP167 = (X10_TEMP160*X10_TEMP161);
final double X10_TEMP163 = (p[0]);
final double X10_TEMP164 = (X10_TEMP0.a);
final double X10_TEMP165 = (X10_TEMP163*X10_TEMP164);
final double X10_TEMP166 = (0.5);
final double X10_TEMP168 = (X10_TEMP165*X10_TEMP166);

final double X10_TEMP170 = (X10_TEMP167+X10_TEMP168);

final double X10_TEMP173 = (p[3]);
final double X10_TEMP174 = (X10_TEMP0.a);

final double X10_TEMP176 = (X10_TEMP173*X10_TEMP174);

double X10_TEMP184 = (0.0);
double X10_TEMP185 = (0.0);
double X10_TEMP186 = (0.0);
double X10_TEMP187 = (0.0);
double X10_TEMP188 = (0.0);
double X10_TEMP189 = (0.0);

final Particle X10_TEMP192 = (new Particle(X10_TEMP157,X10_TEMP170,X10_TEMP176,X10_TEMP184,X10_TEMP185,X10_TEMP186,X10_TEMP187,X10_TEMP188,X10_TEMP189));
final Particle X10_TEMP193 = (X10_TEMP192);
X10_TEMP144[ijk] = (X10_TEMP193);
int X10_TEMP195 = (1);

final point(:rank==1) X10_TEMP197 = (ijk+[X10_TEMP195]);
ijk = (X10_TEMP197);
}
final int X10_TEMP200 = (1);
final int X10_TEMP201 = (2);
final int X10_TEMP205 = (0);
final int X10_TEMP203 = (1);
final int X10_TEMP206 = (mm-X10_TEMP203);
final int X10_TEMP210 = (0);
final int X10_TEMP208 = (1);
final int X10_TEMP211 = (mm-X10_TEMP208);
final int X10_TEMP215 = (0);
final int X10_TEMP213 = (1);
final int X10_TEMP216 = (mm-X10_TEMP213);

final region(:rank==4) X10_TEMP218 = (region(:rank==4))([X10_TEMP200:X10_TEMP201,X10_TEMP205:X10_TEMP206,X10_TEMP210:X10_TEMP211,X10_TEMP215:X10_TEMP216]);
for(point(:rank==4)p:X10_TEMP218) {
final Particle[:rank==1] X10_TEMP219 = (Particle[:rank==1])(X10_TEMP0.one);

final double X10_TEMP222 = (p[1]);
final double X10_TEMP223 = (X10_TEMP0.a);
final double X10_TEMP232 = (X10_TEMP222*X10_TEMP223);
final int X10_TEMP225 = (2);
final int X10_TEMP226 = (p[0]);

final int X10_TEMP228 = (X10_TEMP225-X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP0.a);
final double X10_TEMP230 = (X10_TEMP228*X10_TEMP229);
final double X10_TEMP231 = (0.5);
final double X10_TEMP233 = (X10_TEMP230*X10_TEMP231);

final double X10_TEMP235 = (X10_TEMP232+X10_TEMP233);

final double X10_TEMP238 = (p[2]);
final double X10_TEMP239 = (X10_TEMP0.a);
final double X10_TEMP248 = (X10_TEMP238*X10_TEMP239);
final int X10_TEMP241 = (p[0]);
final int X10_TEMP242 = (1);

final int X10_TEMP244 = (X10_TEMP241-X10_TEMP242);
final double X10_TEMP245 = (X10_TEMP0.a);
final double X10_TEMP246 = (X10_TEMP244*X10_TEMP245);
final double X10_TEMP247 = (0.5);
final double X10_TEMP249 = (X10_TEMP246*X10_TEMP247);

final double X10_TEMP251 = (X10_TEMP248+X10_TEMP249);

final double X10_TEMP254 = (p[3]);
final double X10_TEMP255 = (X10_TEMP0.a);
final double X10_TEMP258 = (X10_TEMP254*X10_TEMP255);
final double X10_TEMP256 = (X10_TEMP0.a);
final double X10_TEMP257 = (0.5);
final double X10_TEMP259 = (X10_TEMP256*X10_TEMP257);

final double X10_TEMP261 = (X10_TEMP258+X10_TEMP259);

double X10_TEMP269 = (0.0);
double X10_TEMP270 = (0.0);
double X10_TEMP271 = (0.0);
double X10_TEMP272 = (0.0);
double X10_TEMP273 = (0.0);
double X10_TEMP274 = (0.0);

final Particle X10_TEMP277 = (new Particle(X10_TEMP235,X10_TEMP251,X10_TEMP261,X10_TEMP269,X10_TEMP270,X10_TEMP271,X10_TEMP272,X10_TEMP273,X10_TEMP274));
final Particle X10_TEMP278 = (X10_TEMP277);
X10_TEMP219[ijk] = (X10_TEMP278);
int X10_TEMP280 = (1);

final point(:rank==1) X10_TEMP282 = (ijk+[X10_TEMP280]);
ijk = (X10_TEMP282);
}
}
int iseed = (0);
double v1 = (0.0);
double v2 = (0.0);
Random randnum = (new Random(iseed,v1,v2));
double r = (0.0);
int k = (0);
final int X10_TEMP292 = (X10_TEMP0.mdsize);
boolean X10_TEMP296 = k<X10_TEMP292;
while(X10_TEMP296) {
final double X10_TEMP298 = (Program.Random_seed(randnum));
r = (X10_TEMP298);
final Particle[:rank==1] X10_TEMP299 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP301 = (X10_TEMP299[k]);

final double X10_TEMP302 = (randnum.v1);

final double X10_TEMP305 = (r*X10_TEMP302);
final double X10_TEMP306 = (X10_TEMP305);
X10_TEMP301.xvelocity = (X10_TEMP306);
final Particle[:rank==1] X10_TEMP307 = (Particle[:rank==1])(X10_TEMP0.one);
final int X10_TEMP308 = (1);

final int X10_TEMP310 = (k+X10_TEMP308);
final Particle X10_TEMP311 = (X10_TEMP307[X10_TEMP310]);

final double X10_TEMP312 = (randnum.v2);

final double X10_TEMP315 = (r*X10_TEMP312);
final double X10_TEMP316 = (X10_TEMP315);
X10_TEMP311.xvelocity = (X10_TEMP316);
final int X10_TEMP317 = (2);

final int X10_TEMP319 = (k+X10_TEMP317);
k = (X10_TEMP319);
final int X10_TEMP294 = (X10_TEMP0.mdsize);
X10_TEMP296 = k<X10_TEMP294;
}
final int X10_TEMP321 = (0);
k = (X10_TEMP321);
final int X10_TEMP322 = (X10_TEMP0.mdsize);
boolean X10_TEMP326 = k<X10_TEMP322;
while(X10_TEMP326) {
final double X10_TEMP328 = (Program.Random_seed(randnum));
r = (X10_TEMP328);
final Particle[:rank==1] X10_TEMP329 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP331 = (X10_TEMP329[k]);

final double X10_TEMP332 = (randnum.v1);

final double X10_TEMP335 = (r*X10_TEMP332);
final double X10_TEMP336 = (X10_TEMP335);
X10_TEMP331.yvelocity = (X10_TEMP336);
final Particle[:rank==1] X10_TEMP337 = (Particle[:rank==1])(X10_TEMP0.one);
final int X10_TEMP338 = (1);

final int X10_TEMP340 = (k+X10_TEMP338);
final Particle X10_TEMP341 = (X10_TEMP337[X10_TEMP340]);

final double X10_TEMP342 = (randnum.v2);

final double X10_TEMP345 = (r*X10_TEMP342);
final double X10_TEMP346 = (X10_TEMP345);
X10_TEMP341.yvelocity = (X10_TEMP346);
final int X10_TEMP347 = (2);

final int X10_TEMP349 = (k+X10_TEMP347);
k = (X10_TEMP349);
final int X10_TEMP324 = (X10_TEMP0.mdsize);
X10_TEMP326 = k<X10_TEMP324;
}
final int X10_TEMP351 = (0);
k = (X10_TEMP351);
final int X10_TEMP352 = (X10_TEMP0.mdsize);
boolean X10_TEMP356 = k<X10_TEMP352;
while(X10_TEMP356) {
final double X10_TEMP358 = (Program.Random_seed(randnum));
r = (X10_TEMP358);
final Particle[:rank==1] X10_TEMP359 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP361 = (X10_TEMP359[k]);

final double X10_TEMP362 = (randnum.v1);

final double X10_TEMP365 = (r*X10_TEMP362);
final double X10_TEMP366 = (X10_TEMP365);
X10_TEMP361.zvelocity = (X10_TEMP366);
final Particle[:rank==1] X10_TEMP367 = (Particle[:rank==1])(X10_TEMP0.one);
final int X10_TEMP368 = (1);

final int X10_TEMP370 = (k+X10_TEMP368);
final Particle X10_TEMP371 = (X10_TEMP367[X10_TEMP370]);

final double X10_TEMP372 = (randnum.v2);

final double X10_TEMP375 = (r*X10_TEMP372);
final double X10_TEMP376 = (X10_TEMP375);
X10_TEMP371.zvelocity = (X10_TEMP376);
final int X10_TEMP377 = (2);

final int X10_TEMP379 = (k+X10_TEMP377);
k = (X10_TEMP379);
final int X10_TEMP354 = (X10_TEMP0.mdsize);
X10_TEMP356 = k<X10_TEMP354;
}
final double X10_TEMP382 = (0.0);
final double X10_TEMP383 = (X10_TEMP382);
X10_TEMP0.ekin = (X10_TEMP383);
double sp = (0.0);
final int X10_TEMP389 = (0);
final int X10_TEMP386 = (X10_TEMP0.mdsize);
final int X10_TEMP387 = (1);
final int X10_TEMP390 = (X10_TEMP386-X10_TEMP387);

final region(:rank==1) X10_TEMP392 = (region(:rank==1))([X10_TEMP389:X10_TEMP390]);
for(point(:rank==1)i:X10_TEMP392) {
final Particle[:rank==1] X10_TEMP393 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP395 = (X10_TEMP393[i]);
final double X10_TEMP396 = (X10_TEMP395.xvelocity);

final double X10_TEMP398 = (sp+X10_TEMP396);
sp = (X10_TEMP398);
}
final int X10_TEMP399 = (X10_TEMP0.mdsize);

final double X10_TEMP401 = (sp/X10_TEMP399);
sp = (X10_TEMP401);
final int X10_TEMP406 = (0);
final int X10_TEMP403 = (X10_TEMP0.mdsize);
final int X10_TEMP404 = (1);
final int X10_TEMP407 = (X10_TEMP403-X10_TEMP404);

final region(:rank==1) X10_TEMP409 = (region(:rank==1))([X10_TEMP406:X10_TEMP407]);
for(point(:rank==1)i:X10_TEMP409) {
final Particle[:rank==1] X10_TEMP410 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP412 = (X10_TEMP410[i]);

final Particle[:rank==1] X10_TEMP413 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP415 = (X10_TEMP413[i]);
final double X10_TEMP416 = (X10_TEMP415.xvelocity);

final double X10_TEMP419 = (X10_TEMP416-sp);
final double X10_TEMP420 = (X10_TEMP419);
X10_TEMP412.xvelocity = (X10_TEMP420);
final double X10_TEMP429 = (X10_TEMP0.ekin);
final Particle[:rank==1] X10_TEMP421 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP423 = (X10_TEMP421[i]);
final double X10_TEMP427 = (X10_TEMP423.xvelocity);
final Particle[:rank==1] X10_TEMP424 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP426 = (X10_TEMP424[i]);
final double X10_TEMP428 = (X10_TEMP426.xvelocity);
final double X10_TEMP430 = (X10_TEMP427*X10_TEMP428);

final double X10_TEMP433 = (X10_TEMP429+X10_TEMP430);
final double X10_TEMP434 = (X10_TEMP433);
X10_TEMP0.ekin = (X10_TEMP434);
}
final double X10_TEMP436 = (0.0);
sp = (X10_TEMP436);
final int X10_TEMP441 = (0);
final int X10_TEMP438 = (X10_TEMP0.mdsize);
final int X10_TEMP439 = (1);
final int X10_TEMP442 = (X10_TEMP438-X10_TEMP439);

final region(:rank==1) X10_TEMP444 = (region(:rank==1))([X10_TEMP441:X10_TEMP442]);
for(point(:rank==1)i:X10_TEMP444) {
final Particle[:rank==1] X10_TEMP445 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP447 = (X10_TEMP445[i]);
final double X10_TEMP448 = (X10_TEMP447.yvelocity);

final double X10_TEMP450 = (sp+X10_TEMP448);
sp = (X10_TEMP450);
}
final int X10_TEMP451 = (X10_TEMP0.mdsize);

final double X10_TEMP453 = (sp/X10_TEMP451);
sp = (X10_TEMP453);
final int X10_TEMP458 = (0);
final int X10_TEMP455 = (X10_TEMP0.mdsize);
final int X10_TEMP456 = (1);
final int X10_TEMP459 = (X10_TEMP455-X10_TEMP456);

final region(:rank==1) X10_TEMP461 = (region(:rank==1))([X10_TEMP458:X10_TEMP459]);
for(point(:rank==1)i:X10_TEMP461) {
final Particle[:rank==1] X10_TEMP462 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP464 = (X10_TEMP462[i]);

final Particle[:rank==1] X10_TEMP465 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP467 = (X10_TEMP465[i]);
final double X10_TEMP468 = (X10_TEMP467.yvelocity);

final double X10_TEMP471 = (X10_TEMP468-sp);
final double X10_TEMP472 = (X10_TEMP471);
X10_TEMP464.yvelocity = (X10_TEMP472);
final double X10_TEMP481 = (X10_TEMP0.ekin);
final Particle[:rank==1] X10_TEMP473 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP475 = (X10_TEMP473[i]);
final double X10_TEMP479 = (X10_TEMP475.yvelocity);
final Particle[:rank==1] X10_TEMP476 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP478 = (X10_TEMP476[i]);
final double X10_TEMP480 = (X10_TEMP478.yvelocity);
final double X10_TEMP482 = (X10_TEMP479*X10_TEMP480);

final double X10_TEMP485 = (X10_TEMP481+X10_TEMP482);
final double X10_TEMP486 = (X10_TEMP485);
X10_TEMP0.ekin = (X10_TEMP486);
}
final double X10_TEMP488 = (0.0);
sp = (X10_TEMP488);
final int X10_TEMP493 = (0);
final int X10_TEMP490 = (X10_TEMP0.mdsize);
final int X10_TEMP491 = (1);
final int X10_TEMP494 = (X10_TEMP490-X10_TEMP491);

final region(:rank==1) X10_TEMP496 = (region(:rank==1))([X10_TEMP493:X10_TEMP494]);
for(point(:rank==1)i:X10_TEMP496) {
final Particle[:rank==1] X10_TEMP497 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP499 = (X10_TEMP497[i]);
final double X10_TEMP500 = (X10_TEMP499.zvelocity);

final double X10_TEMP502 = (sp+X10_TEMP500);
sp = (X10_TEMP502);
}
final int X10_TEMP503 = (X10_TEMP0.mdsize);

final double X10_TEMP505 = (sp/X10_TEMP503);
sp = (X10_TEMP505);
final int X10_TEMP510 = (0);
final int X10_TEMP507 = (X10_TEMP0.mdsize);
final int X10_TEMP508 = (1);
final int X10_TEMP511 = (X10_TEMP507-X10_TEMP508);

final region(:rank==1) X10_TEMP513 = (region(:rank==1))([X10_TEMP510:X10_TEMP511]);
for(point(:rank==1)i:X10_TEMP513) {
final Particle[:rank==1] X10_TEMP514 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP516 = (X10_TEMP514[i]);

final Particle[:rank==1] X10_TEMP517 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP519 = (X10_TEMP517[i]);
final double X10_TEMP520 = (X10_TEMP519.zvelocity);

final double X10_TEMP523 = (X10_TEMP520-sp);
final double X10_TEMP524 = (X10_TEMP523);
X10_TEMP516.zvelocity = (X10_TEMP524);
final double X10_TEMP533 = (X10_TEMP0.ekin);
final Particle[:rank==1] X10_TEMP525 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP527 = (X10_TEMP525[i]);
final double X10_TEMP531 = (X10_TEMP527.zvelocity);
final Particle[:rank==1] X10_TEMP528 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP530 = (X10_TEMP528[i]);
final double X10_TEMP532 = (X10_TEMP530.zvelocity);
final double X10_TEMP534 = (X10_TEMP531*X10_TEMP532);

final double X10_TEMP537 = (X10_TEMP533+X10_TEMP534);
final double X10_TEMP538 = (X10_TEMP537);
X10_TEMP0.ekin = (X10_TEMP538);
}
final double X10_TEMP539 = (X10_TEMP0.tscale);
final double X10_TEMP540 = (X10_TEMP0.ekin);

double ts = (X10_TEMP539*X10_TEMP540);
final double X10_TEMP543 = (_md_tref/ts);
final double X10_TEMP544 = (Math.sqrt(X10_TEMP543));

final double X10_TEMP547 = (_md_h*X10_TEMP544);
final double X10_TEMP548 = (X10_TEMP547);
X10_TEMP0.sc = (X10_TEMP548);
final int X10_TEMP553 = (0);
final int X10_TEMP550 = (X10_TEMP0.mdsize);
final int X10_TEMP551 = (1);
final int X10_TEMP554 = (X10_TEMP550-X10_TEMP551);

final region(:rank==1) X10_TEMP556 = (region(:rank==1))([X10_TEMP553:X10_TEMP554]);
for(point(:rank==1)i:X10_TEMP556) {
final Particle[:rank==1] X10_TEMP557 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP559 = (X10_TEMP557[i]);

final Particle[:rank==1] X10_TEMP560 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP562 = (X10_TEMP560[i]);
final double X10_TEMP563 = (X10_TEMP562.xvelocity);
final double X10_TEMP564 = (X10_TEMP0.sc);

final double X10_TEMP567 = (X10_TEMP563*X10_TEMP564);
final double X10_TEMP568 = (X10_TEMP567);
X10_TEMP559.xvelocity = (X10_TEMP568);
final Particle[:rank==1] X10_TEMP569 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP571 = (X10_TEMP569[i]);

final Particle[:rank==1] X10_TEMP572 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP574 = (X10_TEMP572[i]);
final double X10_TEMP575 = (X10_TEMP574.yvelocity);
final double X10_TEMP576 = (X10_TEMP0.sc);

final double X10_TEMP579 = (X10_TEMP575*X10_TEMP576);
final double X10_TEMP580 = (X10_TEMP579);
X10_TEMP571.yvelocity = (X10_TEMP580);
final Particle[:rank==1] X10_TEMP581 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP583 = (X10_TEMP581[i]);

final Particle[:rank==1] X10_TEMP584 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP586 = (X10_TEMP584[i]);
final double X10_TEMP587 = (X10_TEMP586.zvelocity);
final double X10_TEMP588 = (X10_TEMP0.sc);

final double X10_TEMP591 = (X10_TEMP587*X10_TEMP588);
final double X10_TEMP592 = (X10_TEMP591);
X10_TEMP583.zvelocity = (X10_TEMP592);
}
}
public static void md_runiters1(final md X10_TEMP0) {
final int X10_TEMP5 = (0);
final int X10_TEMP2 = (X10_TEMP0.mdsize);
final int X10_TEMP3 = (1);
final int X10_TEMP6 = (X10_TEMP2-X10_TEMP3);

final region(:rank==1) X10_TEMP8 = (region(:rank==1))([X10_TEMP5:X10_TEMP6]);
for(point(:rank==1)i:X10_TEMP8) {
final Particle[:rank==1] X10_TEMP9 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP11 = (X10_TEMP9[i]);
final double X10_TEMP13 = (X10_TEMP0.side);

Program.Particle_domove(X10_TEMP11,X10_TEMP13);
}
final double X10_TEMP16 = (0.0);
final double X10_TEMP17 = (X10_TEMP16);
X10_TEMP0.epot = (X10_TEMP17);
final double X10_TEMP20 = (0.0);
final double X10_TEMP21 = (X10_TEMP20);
X10_TEMP0.vir = (X10_TEMP21);
final int X10_TEMP22 = (0);
final int X10_TEMP23 = (X10_TEMP0.rnk);

int i = (X10_TEMP22+X10_TEMP23);
final int X10_TEMP25 = (X10_TEMP0.mdsize);
boolean X10_TEMP29 = i<X10_TEMP25;
while(X10_TEMP29) {
final Particle[:rank==1] X10_TEMP30 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP32 = (X10_TEMP30[i]);
final double X10_TEMP38 = (X10_TEMP0.side);
final double X10_TEMP39 = (X10_TEMP0.rcoff);
final int X10_TEMP40 = (X10_TEMP0.mdsize);

Program.Particle_force(X10_TEMP32,X10_TEMP38,X10_TEMP39,X10_TEMP40,i,X10_TEMP0);
final int X10_TEMP41 = (X10_TEMP0.nprocess);

final int X10_TEMP43 = (i+X10_TEMP41);
i = (X10_TEMP43);
final int X10_TEMP27 = (X10_TEMP0.mdsize);
X10_TEMP29 = i<X10_TEMP27;
}
}
public static void md_runiters2(final md X10_TEMP0, final md [:rank==1] P) {
Program.md_allreduce(X10_TEMP0,P);
}
public static void md_runiters3(final md X10_TEMP0, final int move) {
double summation = (0.0);
final int X10_TEMP6 = (0);
final int X10_TEMP3 = (X10_TEMP0.mdsize);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) X10_TEMP9 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
for(point(:rank==1)i:X10_TEMP9) {
final Particle[:rank==1] X10_TEMP10 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP12 = (X10_TEMP10[i]);
final double X10_TEMP14 = (X10_TEMP0.hsq2);
final double X10_TEMP15 = (Program.Particle_mkekin(X10_TEMP12,X10_TEMP14));

final double X10_TEMP17 = (summation+X10_TEMP15);
summation = (X10_TEMP17);
}
final double X10_TEMP18 = (X10_TEMP0.hsq);

final double X10_TEMP21 = (summation/X10_TEMP18);
final double X10_TEMP22 = (X10_TEMP21);
X10_TEMP0.ekin = (X10_TEMP22);
double vel = (0.0);
final double X10_TEMP26 = (0.0);
final double X10_TEMP27 = (X10_TEMP26);
X10_TEMP0.count = (X10_TEMP27);
final int X10_TEMP32 = (0);
final int X10_TEMP29 = (X10_TEMP0.mdsize);
final int X10_TEMP30 = (1);
final int X10_TEMP33 = (X10_TEMP29-X10_TEMP30);

final region(:rank==1) X10_TEMP35 = (region(:rank==1))([X10_TEMP32:X10_TEMP33]);
for(point(:rank==1)i:X10_TEMP35) {
final Particle[:rank==1] X10_TEMP36 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP38 = (X10_TEMP36[i]);
final double X10_TEMP42 = (X10_TEMP0.vaverh);
final double X10_TEMP43 = (Program.Particle_velavg(X10_TEMP38,X10_TEMP42,_md_h,X10_TEMP0));

final double X10_TEMP45 = (vel+X10_TEMP43);
vel = (X10_TEMP45);
}
final double X10_TEMP47 = (vel/_md_h);
vel = (X10_TEMP47);
final boolean X10_TEMP49 = (move<_md_istop);
final int X10_TEMP50 = (1);

final int X10_TEMP52 = (move+X10_TEMP50);

final int X10_TEMP54 = (X10_TEMP52%_md_irep);
final int X10_TEMP55 = (0);

final boolean X10_TEMP57 = (X10_TEMP54==X10_TEMP55);

final boolean X10_TEMP59 = X10_TEMP49&&X10_TEMP57;
if (X10_TEMP59) {
final double X10_TEMP60 = (X10_TEMP0.tscale);
final double X10_TEMP61 = (X10_TEMP0.ekin);

final double X10_TEMP63 = (X10_TEMP60*X10_TEMP61);
final double X10_TEMP65 = (_md_tref/X10_TEMP63);

final double X10_TEMP68 = (Math.sqrt(X10_TEMP65));
final double X10_TEMP69 = (X10_TEMP68);
X10_TEMP0.sc = (X10_TEMP69);
final int X10_TEMP74 = (0);
final int X10_TEMP71 = (X10_TEMP0.mdsize);
final int X10_TEMP72 = (1);
final int X10_TEMP75 = (X10_TEMP71-X10_TEMP72);

final region(:rank==1) X10_TEMP77 = (region(:rank==1))([X10_TEMP74:X10_TEMP75]);
for(point(:rank==1)i:X10_TEMP77) {
final Particle[:rank==1] X10_TEMP78 = (Particle[:rank==1])(X10_TEMP0.one);
final Particle X10_TEMP80 = (X10_TEMP78[i]);
final double X10_TEMP83 = (X10_TEMP0.sc);
final int X10_TEMP84 = (1);

Program.Particle_dscal(X10_TEMP80,X10_TEMP83,X10_TEMP84);
}
final double X10_TEMP85 = (X10_TEMP0.tscale);

final double X10_TEMP88 = (_md_tref/X10_TEMP85);
final double X10_TEMP89 = (X10_TEMP88);
X10_TEMP0.ekin = (X10_TEMP89);
}
final int X10_TEMP90 = (1);

final int X10_TEMP92 = (move+X10_TEMP90);

final int X10_TEMP94 = (X10_TEMP92%_md_iprint);
final int X10_TEMP95 = (0);

final boolean X10_TEMP97 = X10_TEMP94==X10_TEMP95;
if (X10_TEMP97) {
final double X10_TEMP98 = (24.0);
final double X10_TEMP99 = (X10_TEMP0.ekin);

final double X10_TEMP102 = (X10_TEMP98*X10_TEMP99);
final double X10_TEMP103 = (X10_TEMP102);
X10_TEMP0.ek = (X10_TEMP103);
final double X10_TEMP104 = (4.0);
final double X10_TEMP105 = (X10_TEMP0.epot);

final double X10_TEMP108 = (X10_TEMP104*X10_TEMP105);
final double X10_TEMP109 = (X10_TEMP108);
X10_TEMP0.epot = (X10_TEMP109);
final double X10_TEMP110 = (X10_TEMP0.ek);
final double X10_TEMP111 = (X10_TEMP0.epot);

final double X10_TEMP114 = (X10_TEMP110+X10_TEMP111);
final double X10_TEMP115 = (X10_TEMP114);
X10_TEMP0.etot = (X10_TEMP115);
final double X10_TEMP116 = (X10_TEMP0.tscale);
final double X10_TEMP117 = (X10_TEMP0.ekin);

final double X10_TEMP120 = (X10_TEMP116*X10_TEMP117);
final double X10_TEMP121 = (X10_TEMP120);
X10_TEMP0.temp = (X10_TEMP121);
final double X10_TEMP122 = (16.0);
final double X10_TEMP127 = (_md_den*X10_TEMP122);
final double X10_TEMP123 = (X10_TEMP0.ekin);
final double X10_TEMP124 = (X10_TEMP0.vir);

final double X10_TEMP126 = (X10_TEMP123-X10_TEMP124);
final double X10_TEMP128 = (X10_TEMP127*X10_TEMP126);
final int X10_TEMP129 = (X10_TEMP0.mdsize);

final double X10_TEMP132 = (X10_TEMP128/X10_TEMP129);
final double X10_TEMP133 = (X10_TEMP132);
X10_TEMP0.pres = (X10_TEMP133);
final int X10_TEMP134 = (X10_TEMP0.mdsize);

final double X10_TEMP136 = (vel/X10_TEMP134);
vel = (X10_TEMP136);
final double X10_TEMP137 = (X10_TEMP0.count);
final int X10_TEMP138 = (X10_TEMP0.mdsize);

final double X10_TEMP140 = (X10_TEMP137/X10_TEMP138);
final double X10_TEMP141 = (100.0);

final double X10_TEMP144 = (X10_TEMP140*X10_TEMP141);
final double X10_TEMP145 = (X10_TEMP144);
X10_TEMP0.rp = (X10_TEMP145);
}
}
public static void md_allreduce(final md X10_TEMP0, final md [:rank==1] P) {
final int X10_TEMP1 = (X10_TEMP0.rnk);
final int X10_TEMP2 = (0);

final boolean X10_TEMP4 = X10_TEMP1!=X10_TEMP2;
if (X10_TEMP4) {
return;
}
final md t = (new md());
final int X10_TEMP8 = (X10_TEMP0.mdsize);
final int X10_TEMP9 = (X10_TEMP8);
t.mdsize = (X10_TEMP9);
final int X10_TEMP14 = (0);
final int X10_TEMP11 = (X10_TEMP0.mdsize);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);
final region(:rank==1) X10_TEMP16 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final place X10_TEMP17 = (here);

final dist(:rank==1) dOne = (dist(:rank==1))(X10_TEMP16->X10_TEMP17);
final Particle[:rank==1] X10_TEMP21 = (Particle[:rank==1])(new Particle[dOne]);
final Particle[:rank==1] X10_TEMP22 = (Particle[:rank==1])(X10_TEMP21);
t.one = (X10_TEMP22);
final place tHere = (here);
final int X10_TEMP30 = (0);
final int X10_TEMP25 = (X10_TEMP0.mdsize);
final int X10_TEMP26 = (1);

final int X10_TEMP28 = (X10_TEMP25-X10_TEMP26);

final region(:rank==1) X10_TEMP32 = (region(:rank==1))([X10_TEMP30:X10_TEMP28]);
for(point(:rank==1)k:X10_TEMP32) {
final Particle[:rank==1] X10_TEMP33 = (Particle[:rank==1])(t.one);

double X10_TEMP44 = (0.0);
double X10_TEMP45 = (0.0);
double X10_TEMP46 = (0.0);
double X10_TEMP47 = (0.0);
double X10_TEMP48 = (0.0);
double X10_TEMP49 = (0.0);
double X10_TEMP50 = (0.0);
double X10_TEMP51 = (0.0);
double X10_TEMP52 = (0.0);

final Particle X10_TEMP55 = (new Particle(X10_TEMP44,X10_TEMP45,X10_TEMP46,X10_TEMP47,X10_TEMP48,X10_TEMP49,X10_TEMP50,X10_TEMP51,X10_TEMP52));
final Particle X10_TEMP56 = (X10_TEMP55);
X10_TEMP33[k] = (X10_TEMP56);
}
for(point(:rank==1)j:P) {
final int X10_TEMP60 = (0);
final int X10_TEMP61 = (2);
final region(:rank==1) X10_TEMP62 = (region(:rank==1))([X10_TEMP60:X10_TEMP61]);
final place X10_TEMP63 = (here);

final dist(:rank==1) dD = (dist(:rank==1))(X10_TEMP62->X10_TEMP63);
final int X10_TEMP67 = (0);
final int X10_TEMP68 = (0);
final region(:rank==1) X10_TEMP69 = (region(:rank==1))([X10_TEMP67:X10_TEMP68]);
final place X10_TEMP70 = (here);

final dist(:rank==1) dI = (dist(:rank==1))(X10_TEMP69->X10_TEMP70);
final double[:rank==1] dataD = (double[:rank==1])(new double[dD]);
final double[:rank==1] dataI = (double[:rank==1])(new double[dI]);
final int X10_TEMP80 = (0);
final int X10_TEMP75 = (X10_TEMP0.mdsize);
final int X10_TEMP76 = (1);

final int X10_TEMP78 = (X10_TEMP75-X10_TEMP76);

final region(:rank==1) X10_TEMP82 = (region(:rank==1))([X10_TEMP80:X10_TEMP78]);
for(point(:rank==1)k:X10_TEMP82) {
finish {
final dist(:rank==1) X10_TEMP83 = (dist(:rank==1))(P.distribution);

final place X10_TEMP86 = X10_TEMP83.get(j);
async(X10_TEMP86) {
final md X10_TEMP88 = (P[j]);
final Particle[:rank==1] X10_TEMP89 = (Particle[:rank==1])(X10_TEMP88.one);
final Particle X10_TEMP91 = (X10_TEMP89[k]);

final double fx = (X10_TEMP91.xforce);
final md X10_TEMP94 = (P[j]);
final Particle[:rank==1] X10_TEMP95 = (Particle[:rank==1])(X10_TEMP94.one);
final Particle X10_TEMP97 = (X10_TEMP95[k]);

final double fy = (X10_TEMP97.yforce);
final md X10_TEMP100 = (P[j]);
final Particle[:rank==1] X10_TEMP101 = (Particle[:rank==1])(X10_TEMP100.one);
final Particle X10_TEMP103 = (X10_TEMP101[k]);

final double fz = (X10_TEMP103.zforce);
finish {
async(tHere) {
final int X10_TEMP107 = (0);

final double X10_TEMP110 = (fx);
dataD[X10_TEMP107] = (X10_TEMP110);
final int X10_TEMP112 = (1);

final double X10_TEMP115 = (fy);
dataD[X10_TEMP112] = (X10_TEMP115);
final int X10_TEMP117 = (2);

final double X10_TEMP120 = (fz);
dataD[X10_TEMP117] = (X10_TEMP120);
}
}
}
}
final Particle[:rank==1] X10_TEMP121 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP123 = (X10_TEMP121[k]);

final Particle[:rank==1] X10_TEMP124 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP126 = (X10_TEMP124[k]);
final double X10_TEMP129 = (X10_TEMP126.xforce);
final int X10_TEMP128 = (0);
final double X10_TEMP130 = (dataD[X10_TEMP128]);

final double X10_TEMP133 = (X10_TEMP129+X10_TEMP130);
final double X10_TEMP134 = (X10_TEMP133);
X10_TEMP123.xforce = (X10_TEMP134);
final Particle[:rank==1] X10_TEMP135 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP137 = (X10_TEMP135[k]);

final Particle[:rank==1] X10_TEMP138 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP140 = (X10_TEMP138[k]);
final double X10_TEMP143 = (X10_TEMP140.yforce);
final int X10_TEMP142 = (1);
final double X10_TEMP144 = (dataD[X10_TEMP142]);

final double X10_TEMP147 = (X10_TEMP143+X10_TEMP144);
final double X10_TEMP148 = (X10_TEMP147);
X10_TEMP137.yforce = (X10_TEMP148);
final Particle[:rank==1] X10_TEMP149 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP151 = (X10_TEMP149[k]);

final Particle[:rank==1] X10_TEMP152 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP154 = (X10_TEMP152[k]);
final double X10_TEMP157 = (X10_TEMP154.zforce);
final int X10_TEMP156 = (2);
final double X10_TEMP158 = (dataD[X10_TEMP156]);

final double X10_TEMP161 = (X10_TEMP157+X10_TEMP158);
final double X10_TEMP162 = (X10_TEMP161);
X10_TEMP151.zforce = (X10_TEMP162);
}
finish {
final dist(:rank==1) X10_TEMP163 = (dist(:rank==1))(P.distribution);

final place X10_TEMP166 = X10_TEMP163.get(j);
async(X10_TEMP166) {
final md X10_TEMP168 = (P[j]);

final double jvir = (X10_TEMP168.vir);
final md X10_TEMP171 = (P[j]);

final double jepot = (X10_TEMP171.epot);
final md X10_TEMP174 = (P[j]);

final int jinter = (X10_TEMP174.interactions);
finish {
async(tHere) {
final int X10_TEMP178 = (0);

final double X10_TEMP181 = (jvir);
dataD[X10_TEMP178] = (X10_TEMP181);
final int X10_TEMP183 = (1);

final double X10_TEMP186 = (jepot);
dataD[X10_TEMP183] = (X10_TEMP186);
final int X10_TEMP188 = (0);

final double X10_TEMP191 = (jinter);
dataI[X10_TEMP188] = (X10_TEMP191);
}
}
}
}
final double X10_TEMP194 = (t.vir);
final int X10_TEMP193 = (0);
final double X10_TEMP195 = (dataD[X10_TEMP193]);

final double X10_TEMP198 = (X10_TEMP194+X10_TEMP195);
final double X10_TEMP199 = (X10_TEMP198);
t.vir = (X10_TEMP199);
final double X10_TEMP202 = (t.epot);
final int X10_TEMP201 = (1);
final double X10_TEMP203 = (dataD[X10_TEMP201]);

final double X10_TEMP206 = (X10_TEMP202+X10_TEMP203);
final double X10_TEMP207 = (X10_TEMP206);
t.epot = (X10_TEMP207);
final int X10_TEMP211 = (t.interactions);
final int X10_TEMP209 = (0);
final double X10_TEMP210 = (dataI[X10_TEMP209]);
final int X10_TEMP212 = ((int)X10_TEMP210);

final int X10_TEMP215 = (X10_TEMP211+X10_TEMP212);
final int X10_TEMP216 = (X10_TEMP215);
t.interactions = (X10_TEMP216);
}
final int mymdsize = (X10_TEMP0.mdsize);
finish {
final dist(:rank==1) X10_TEMP219 = (dist(:rank==1))(P.distribution);
for(point(:rank==1)j:X10_TEMP219) {
final place X10_TEMP220 = X10_TEMP219.get(j);
async(X10_TEMP220) {
final place pHere = (here);
final int X10_TEMP224 = (0);
final int X10_TEMP225 = (2);
final region(:rank==1) X10_TEMP226 = (region(:rank==1))([X10_TEMP224:X10_TEMP225]);
final place X10_TEMP227 = (here);

final dist(:rank==1) dD = (dist(:rank==1))(X10_TEMP226->X10_TEMP227);
final double[:rank==1] dataD = (double[:rank==1])(new double[dD]);
final int X10_TEMP235 = (0);
final int X10_TEMP231 = (1);

final int X10_TEMP233 = (mymdsize-X10_TEMP231);

final region(:rank==1) X10_TEMP237 = (region(:rank==1))([X10_TEMP235:X10_TEMP233]);
for(point(:rank==1)k:X10_TEMP237) {
finish {
async(tHere) {
final Particle[:rank==1] X10_TEMP239 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP241 = (X10_TEMP239[k]);

final double xf = (X10_TEMP241.xforce);
final Particle[:rank==1] X10_TEMP243 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP245 = (X10_TEMP243[k]);

final double yf = (X10_TEMP245.yforce);
final Particle[:rank==1] X10_TEMP247 = (Particle[:rank==1])(t.one);
final Particle X10_TEMP249 = (X10_TEMP247[k]);

final double zf = (X10_TEMP249.zforce);
finish {
async(pHere) {
final int X10_TEMP253 = (0);

final double X10_TEMP256 = (xf);
dataD[X10_TEMP253] = (X10_TEMP256);
final int X10_TEMP258 = (1);

final double X10_TEMP261 = (yf);
dataD[X10_TEMP258] = (X10_TEMP261);
final int X10_TEMP263 = (2);

final double X10_TEMP266 = (zf);
dataD[X10_TEMP263] = (X10_TEMP266);
}
}
}
}
final md X10_TEMP268 = (P[j]);
final Particle[:rank==1] X10_TEMP269 = (Particle[:rank==1])(X10_TEMP268.one);
final Particle X10_TEMP271 = (X10_TEMP269[k]);

final int X10_TEMP273 = (0);

final double X10_TEMP276 = (dataD[X10_TEMP273]);
final double X10_TEMP277 = (X10_TEMP276);
X10_TEMP271.xforce = (X10_TEMP277);
final md X10_TEMP279 = (P[j]);
final Particle[:rank==1] X10_TEMP280 = (Particle[:rank==1])(X10_TEMP279.one);
final Particle X10_TEMP282 = (X10_TEMP280[k]);

final int X10_TEMP284 = (1);

final double X10_TEMP287 = (dataD[X10_TEMP284]);
final double X10_TEMP288 = (X10_TEMP287);
X10_TEMP282.yforce = (X10_TEMP288);
final md X10_TEMP290 = (P[j]);
final Particle[:rank==1] X10_TEMP291 = (Particle[:rank==1])(X10_TEMP290.one);
final Particle X10_TEMP293 = (X10_TEMP291[k]);

final int X10_TEMP295 = (2);

final double X10_TEMP298 = (dataD[X10_TEMP295]);
final double X10_TEMP299 = (X10_TEMP298);
X10_TEMP293.zforce = (X10_TEMP299);
}
final int X10_TEMP302 = (0);
final int X10_TEMP303 = (0);
final region(:rank==1) X10_TEMP304 = (region(:rank==1))([X10_TEMP302:X10_TEMP303]);
final place X10_TEMP305 = (here);

final dist(:rank==1) dI = (dist(:rank==1))(X10_TEMP304->X10_TEMP305);
final int[:rank==1] dataI = (int[:rank==1])(new int[dI]);
finish {
async(tHere) {
final double tvir = (t.vir);
final double tepot = (t.epot);
final int tinter = (t.interactions);
finish {
async(pHere) {
final int X10_TEMP314 = (0);

final double X10_TEMP317 = (tvir);
dataD[X10_TEMP314] = (X10_TEMP317);
final int X10_TEMP319 = (1);

final double X10_TEMP322 = (tepot);
dataD[X10_TEMP319] = (X10_TEMP322);
final int X10_TEMP324 = (0);

final int X10_TEMP327 = (tinter);
dataI[X10_TEMP324] = (X10_TEMP327);
}
}
}
}
final md X10_TEMP329 = (P[j]);

final int X10_TEMP331 = (0);

final double X10_TEMP334 = (dataD[X10_TEMP331]);
final double X10_TEMP335 = (X10_TEMP334);
X10_TEMP329.vir = (X10_TEMP335);
final md X10_TEMP337 = (P[j]);

final int X10_TEMP339 = (1);

final double X10_TEMP342 = (dataD[X10_TEMP339]);
final double X10_TEMP343 = (X10_TEMP342);
X10_TEMP337.epot = (X10_TEMP343);
final md X10_TEMP345 = (P[j]);

final int X10_TEMP347 = (0);

final int X10_TEMP350 = (dataI[X10_TEMP347]);
final int X10_TEMP351 = (X10_TEMP350);
X10_TEMP345.interactions = (X10_TEMP351);
}
}
}
}
public static void Particle_domove(final Particle X10_TEMP0, final double side) {
final double X10_TEMP1 = (X10_TEMP0.xcoord);
final double X10_TEMP2 = (X10_TEMP0.xvelocity);
final double X10_TEMP3 = (X10_TEMP1+X10_TEMP2);
final double X10_TEMP4 = (X10_TEMP0.xforce);

final double X10_TEMP7 = (X10_TEMP3+X10_TEMP4);
final double X10_TEMP8 = (X10_TEMP7);
X10_TEMP0.xcoord = (X10_TEMP8);
final double X10_TEMP9 = (X10_TEMP0.ycoord);
final double X10_TEMP10 = (X10_TEMP0.yvelocity);
final double X10_TEMP11 = (X10_TEMP9+X10_TEMP10);
final double X10_TEMP12 = (X10_TEMP0.yforce);

final double X10_TEMP15 = (X10_TEMP11+X10_TEMP12);
final double X10_TEMP16 = (X10_TEMP15);
X10_TEMP0.ycoord = (X10_TEMP16);
final double X10_TEMP17 = (X10_TEMP0.zcoord);
final double X10_TEMP18 = (X10_TEMP0.zvelocity);
final double X10_TEMP19 = (X10_TEMP17+X10_TEMP18);
final double X10_TEMP20 = (X10_TEMP0.zforce);

final double X10_TEMP23 = (X10_TEMP19+X10_TEMP20);
final double X10_TEMP24 = (X10_TEMP23);
X10_TEMP0.zcoord = (X10_TEMP24);
final double X10_TEMP25 = (X10_TEMP0.xcoord);
final int X10_TEMP26 = (0);

final boolean X10_TEMP28 = X10_TEMP25<X10_TEMP26;
if (X10_TEMP28) {
final double X10_TEMP29 = (X10_TEMP0.xcoord);

final double X10_TEMP32 = (X10_TEMP29+side);
final double X10_TEMP33 = (X10_TEMP32);
X10_TEMP0.xcoord = (X10_TEMP33);
}
final double X10_TEMP34 = (X10_TEMP0.xcoord);

final boolean X10_TEMP36 = X10_TEMP34>side;
if (X10_TEMP36) {
final double X10_TEMP37 = (X10_TEMP0.xcoord);

final double X10_TEMP40 = (X10_TEMP37-side);
final double X10_TEMP41 = (X10_TEMP40);
X10_TEMP0.xcoord = (X10_TEMP41);
}
final double X10_TEMP42 = (X10_TEMP0.ycoord);
final int X10_TEMP43 = (0);

final boolean X10_TEMP45 = X10_TEMP42<X10_TEMP43;
if (X10_TEMP45) {
final double X10_TEMP46 = (X10_TEMP0.ycoord);

final double X10_TEMP49 = (X10_TEMP46+side);
final double X10_TEMP50 = (X10_TEMP49);
X10_TEMP0.ycoord = (X10_TEMP50);
}
final double X10_TEMP51 = (X10_TEMP0.ycoord);

final boolean X10_TEMP53 = X10_TEMP51>side;
if (X10_TEMP53) {
final double X10_TEMP54 = (X10_TEMP0.ycoord);

final double X10_TEMP57 = (X10_TEMP54-side);
final double X10_TEMP58 = (X10_TEMP57);
X10_TEMP0.ycoord = (X10_TEMP58);
}
final double X10_TEMP59 = (X10_TEMP0.zcoord);
final int X10_TEMP60 = (0);

final boolean X10_TEMP62 = X10_TEMP59<X10_TEMP60;
if (X10_TEMP62) {
final double X10_TEMP63 = (X10_TEMP0.zcoord);

final double X10_TEMP66 = (X10_TEMP63+side);
final double X10_TEMP67 = (X10_TEMP66);
X10_TEMP0.zcoord = (X10_TEMP67);
}
final double X10_TEMP68 = (X10_TEMP0.zcoord);

final boolean X10_TEMP70 = X10_TEMP68>side;
if (X10_TEMP70) {
final double X10_TEMP71 = (X10_TEMP0.zcoord);

final double X10_TEMP74 = (X10_TEMP71-side);
final double X10_TEMP75 = (X10_TEMP74);
X10_TEMP0.zcoord = (X10_TEMP75);
}
final double X10_TEMP76 = (X10_TEMP0.xvelocity);
final double X10_TEMP77 = (X10_TEMP0.xforce);

final double X10_TEMP80 = (X10_TEMP76+X10_TEMP77);
final double X10_TEMP81 = (X10_TEMP80);
X10_TEMP0.xvelocity = (X10_TEMP81);
final double X10_TEMP82 = (X10_TEMP0.yvelocity);
final double X10_TEMP83 = (X10_TEMP0.yforce);

final double X10_TEMP86 = (X10_TEMP82+X10_TEMP83);
final double X10_TEMP87 = (X10_TEMP86);
X10_TEMP0.yvelocity = (X10_TEMP87);
final double X10_TEMP88 = (X10_TEMP0.zvelocity);
final double X10_TEMP89 = (X10_TEMP0.zforce);

final double X10_TEMP92 = (X10_TEMP88+X10_TEMP89);
final double X10_TEMP93 = (X10_TEMP92);
X10_TEMP0.zvelocity = (X10_TEMP93);
final double X10_TEMP96 = (0.0);
final double X10_TEMP97 = (X10_TEMP96);
X10_TEMP0.xforce = (X10_TEMP97);
final double X10_TEMP100 = (0.0);
final double X10_TEMP101 = (X10_TEMP100);
X10_TEMP0.yforce = (X10_TEMP101);
final double X10_TEMP104 = (0.0);
final double X10_TEMP105 = (X10_TEMP104);
X10_TEMP0.zforce = (X10_TEMP105);
}
public static void Particle_force(final Particle X10_TEMP0, final double side, final double rcoff, final int mdsize, final int x, final md md1) {
double sideh = (0.0);
double rcoffs = (0.0);
double xx = (0.0);
double yy = (0.0);
double zz = (0.0);
double xi = (0.0);
double yi = (0.0);
double zi = (0.0);
double fxi = (0.0);
double fyi = (0.0);
double fzi = (0.0);
double rd = (0.0);
double rrd = (0.0);
double rrd2 = (0.0);
double rrd3 = (0.0);
double rrd4 = (0.0);
double rrd6 = (0.0);
double rrd7 = (0.0);
double r148 = (0.0);
double forcex = (0.0);
double forcey = (0.0);
double forcez = (0.0);
final double X10_TEMP23 = (0.5);

final double X10_TEMP25 = (X10_TEMP23*side);
sideh = (X10_TEMP25);
final double X10_TEMP27 = (rcoff*rcoff);
rcoffs = (X10_TEMP27);
final double X10_TEMP29 = (X10_TEMP0.xcoord);
xi = (X10_TEMP29);
final double X10_TEMP31 = (X10_TEMP0.ycoord);
yi = (X10_TEMP31);
final double X10_TEMP33 = (X10_TEMP0.zcoord);
zi = (X10_TEMP33);
final double X10_TEMP35 = (0.0);
fxi = (X10_TEMP35);
final double X10_TEMP37 = (0.0);
fyi = (X10_TEMP37);
final double X10_TEMP39 = (0.0);
fzi = (X10_TEMP39);
final int X10_TEMP40 = (1);
final int X10_TEMP44 = (x+X10_TEMP40);
final int X10_TEMP42 = (1);
final int X10_TEMP45 = (mdsize-X10_TEMP42);

final region(:rank==1) X10_TEMP47 = (region(:rank==1))([X10_TEMP44:X10_TEMP45]);
for(point(:rank==1)i:X10_TEMP47) {
final Particle[:rank==1] X10_TEMP48 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP50 = (X10_TEMP48[i]);
final double X10_TEMP51 = (X10_TEMP50.xcoord);

final double X10_TEMP53 = (xi-X10_TEMP51);
xx = (X10_TEMP53);
final Particle[:rank==1] X10_TEMP54 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP56 = (X10_TEMP54[i]);
final double X10_TEMP57 = (X10_TEMP56.ycoord);

final double X10_TEMP59 = (yi-X10_TEMP57);
yy = (X10_TEMP59);
final Particle[:rank==1] X10_TEMP60 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP62 = (X10_TEMP60[i]);
final double X10_TEMP63 = (X10_TEMP62.zcoord);

final double X10_TEMP65 = (zi-X10_TEMP63);
zz = (X10_TEMP65);
final int X10_TEMP66 = 0;

final double X10_TEMP68 = (X10_TEMP66 - sideh);

final boolean X10_TEMP70 = xx<X10_TEMP68;
if (X10_TEMP70) {
final double X10_TEMP72 = (xx+side);
xx = (X10_TEMP72);
}
final double X10_TEMP74 = (sideh);

final boolean X10_TEMP76 = xx>X10_TEMP74;
if (X10_TEMP76) {
final double X10_TEMP78 = (xx-side);
xx = (X10_TEMP78);
}
final int X10_TEMP79 = 0;

final double X10_TEMP81 = (X10_TEMP79 - sideh);

final boolean X10_TEMP83 = yy<X10_TEMP81;
if (X10_TEMP83) {
final double X10_TEMP85 = (yy+side);
yy = (X10_TEMP85);
}
final double X10_TEMP87 = (sideh);

final boolean X10_TEMP89 = yy>X10_TEMP87;
if (X10_TEMP89) {
final double X10_TEMP91 = (yy-side);
yy = (X10_TEMP91);
}
final int X10_TEMP92 = 0;

final double X10_TEMP94 = (X10_TEMP92 - sideh);

final boolean X10_TEMP96 = zz<X10_TEMP94;
if (X10_TEMP96) {
final double X10_TEMP98 = (zz+side);
zz = (X10_TEMP98);
}
final double X10_TEMP100 = (sideh);

final boolean X10_TEMP102 = zz>X10_TEMP100;
if (X10_TEMP102) {
final double X10_TEMP104 = (zz-side);
zz = (X10_TEMP104);
}
final double X10_TEMP105 = (xx*xx);
final double X10_TEMP106 = (yy*yy);
final double X10_TEMP107 = (X10_TEMP105+X10_TEMP106);
final double X10_TEMP108 = (zz*zz);

final double X10_TEMP110 = (X10_TEMP107+X10_TEMP108);
rd = (X10_TEMP110);
final boolean X10_TEMP112 = rd<=rcoffs;
if (X10_TEMP112) {
final double X10_TEMP113 = (1.0);

final double X10_TEMP115 = (X10_TEMP113/rd);
rrd = (X10_TEMP115);
final double X10_TEMP117 = (rrd*rrd);
rrd2 = (X10_TEMP117);
final double X10_TEMP119 = (rrd2*rrd);
rrd3 = (X10_TEMP119);
final double X10_TEMP121 = (rrd2*rrd2);
rrd4 = (X10_TEMP121);
final double X10_TEMP123 = (rrd2*rrd4);
rrd6 = (X10_TEMP123);
final double X10_TEMP125 = (rrd6*rrd);
rrd7 = (X10_TEMP125);
final double X10_TEMP128 = (md1.epot);
final double X10_TEMP127 = (rrd6-rrd3);

final double X10_TEMP131 = (X10_TEMP128+X10_TEMP127);
final double X10_TEMP132 = (X10_TEMP131);
md1.epot = (X10_TEMP132);
final double X10_TEMP133 = (0.5);
final double X10_TEMP134 = (X10_TEMP133*rrd4);

final double X10_TEMP136 = (rrd7-X10_TEMP134);
r148 = (X10_TEMP136);
final double X10_TEMP137 = (md1.vir);
final double X10_TEMP138 = (rd*r148);

final double X10_TEMP141 = (X10_TEMP137-X10_TEMP138);
final double X10_TEMP142 = (X10_TEMP141);
md1.vir = (X10_TEMP142);
final double X10_TEMP144 = (xx*r148);
forcex = (X10_TEMP144);
final double X10_TEMP146 = (fxi+forcex);
fxi = (X10_TEMP146);
final Particle[:rank==1] X10_TEMP147 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP149 = (X10_TEMP147[i]);

final Particle[:rank==1] X10_TEMP150 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP152 = (X10_TEMP150[i]);
final double X10_TEMP153 = (X10_TEMP152.xforce);

final double X10_TEMP156 = (X10_TEMP153-forcex);
final double X10_TEMP157 = (X10_TEMP156);
X10_TEMP149.xforce = (X10_TEMP157);
final double X10_TEMP159 = (yy*r148);
forcey = (X10_TEMP159);
final double X10_TEMP161 = (fyi+forcey);
fyi = (X10_TEMP161);
final Particle[:rank==1] X10_TEMP162 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP164 = (X10_TEMP162[i]);

final Particle[:rank==1] X10_TEMP165 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP167 = (X10_TEMP165[i]);
final double X10_TEMP168 = (X10_TEMP167.yforce);

final double X10_TEMP171 = (X10_TEMP168-forcey);
final double X10_TEMP172 = (X10_TEMP171);
X10_TEMP164.yforce = (X10_TEMP172);
final double X10_TEMP174 = (zz*r148);
forcez = (X10_TEMP174);
final double X10_TEMP176 = (fzi+forcez);
fzi = (X10_TEMP176);
final Particle[:rank==1] X10_TEMP177 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP179 = (X10_TEMP177[i]);

final Particle[:rank==1] X10_TEMP180 = (Particle[:rank==1])(md1.one);
final Particle X10_TEMP182 = (X10_TEMP180[i]);
final double X10_TEMP183 = (X10_TEMP182.zforce);

final double X10_TEMP186 = (X10_TEMP183-forcez);
final double X10_TEMP187 = (X10_TEMP186);
X10_TEMP179.zforce = (X10_TEMP187);
final int X10_TEMP188 = (md1.interactions);
final int X10_TEMP189 = 1;
final int X10_TEMP190 = (md1.interactions);
final int X10_TEMP191 = (X10_TEMP190 + X10_TEMP189);
md1.interactions = (X10_TEMP191);

}
}
final double X10_TEMP192 = (X10_TEMP0.xforce);

final double X10_TEMP195 = (X10_TEMP192+fxi);
final double X10_TEMP196 = (X10_TEMP195);
X10_TEMP0.xforce = (X10_TEMP196);
final double X10_TEMP197 = (X10_TEMP0.yforce);

final double X10_TEMP200 = (X10_TEMP197+fyi);
final double X10_TEMP201 = (X10_TEMP200);
X10_TEMP0.yforce = (X10_TEMP201);
final double X10_TEMP202 = (X10_TEMP0.zforce);

final double X10_TEMP205 = (X10_TEMP202+fzi);
final double X10_TEMP206 = (X10_TEMP205);
X10_TEMP0.zforce = (X10_TEMP206);
}
public static double Particle_mkekin(final Particle X10_TEMP0, final double hsq2) {
double sumt = (0.0);
final double X10_TEMP2 = (X10_TEMP0.xforce);

final double X10_TEMP5 = (X10_TEMP2*hsq2);
final double X10_TEMP6 = (X10_TEMP5);
X10_TEMP0.xforce = (X10_TEMP6);
final double X10_TEMP7 = (X10_TEMP0.yforce);

final double X10_TEMP10 = (X10_TEMP7*hsq2);
final double X10_TEMP11 = (X10_TEMP10);
X10_TEMP0.yforce = (X10_TEMP11);
final double X10_TEMP12 = (X10_TEMP0.zforce);

final double X10_TEMP15 = (X10_TEMP12*hsq2);
final double X10_TEMP16 = (X10_TEMP15);
X10_TEMP0.zforce = (X10_TEMP16);
final double X10_TEMP17 = (X10_TEMP0.xvelocity);
final double X10_TEMP18 = (X10_TEMP0.xforce);

final double X10_TEMP21 = (X10_TEMP17+X10_TEMP18);
final double X10_TEMP22 = (X10_TEMP21);
X10_TEMP0.xvelocity = (X10_TEMP22);
final double X10_TEMP23 = (X10_TEMP0.yvelocity);
final double X10_TEMP24 = (X10_TEMP0.yforce);

final double X10_TEMP27 = (X10_TEMP23+X10_TEMP24);
final double X10_TEMP28 = (X10_TEMP27);
X10_TEMP0.yvelocity = (X10_TEMP28);
final double X10_TEMP29 = (X10_TEMP0.zvelocity);
final double X10_TEMP30 = (X10_TEMP0.zforce);

final double X10_TEMP33 = (X10_TEMP29+X10_TEMP30);
final double X10_TEMP34 = (X10_TEMP33);
X10_TEMP0.zvelocity = (X10_TEMP34);
final double X10_TEMP35 = (X10_TEMP0.xvelocity);
final double X10_TEMP36 = (X10_TEMP0.xvelocity);

final double X10_TEMP38 = (X10_TEMP35*X10_TEMP36);
final double X10_TEMP39 = (X10_TEMP0.yvelocity);
final double X10_TEMP40 = (X10_TEMP0.yvelocity);

final double X10_TEMP42 = (X10_TEMP39*X10_TEMP40);
final double X10_TEMP47 = (X10_TEMP38+X10_TEMP42);
final double X10_TEMP43 = (X10_TEMP0.zvelocity);
final double X10_TEMP44 = (X10_TEMP0.zvelocity);

final double X10_TEMP46 = (X10_TEMP43*X10_TEMP44);

final double X10_TEMP49 = (X10_TEMP47+X10_TEMP46);
sumt = (X10_TEMP49);
return sumt;
}
public static double Particle_velavg(final Particle X10_TEMP0, final double vaverh, final double h, final md md1) {
double velt = (0.0);
double sq = (0.0);
final double X10_TEMP3 = (X10_TEMP0.xvelocity);
final double X10_TEMP4 = (X10_TEMP0.xvelocity);
final double X10_TEMP7 = (X10_TEMP3*X10_TEMP4);
final double X10_TEMP5 = (X10_TEMP0.yvelocity);
final double X10_TEMP6 = (X10_TEMP0.yvelocity);
final double X10_TEMP8 = (X10_TEMP5*X10_TEMP6);
final double X10_TEMP11 = (X10_TEMP7+X10_TEMP8);
final double X10_TEMP9 = (X10_TEMP0.zvelocity);
final double X10_TEMP10 = (X10_TEMP0.zvelocity);
final double X10_TEMP12 = (X10_TEMP9*X10_TEMP10);
final double X10_TEMP14 = (X10_TEMP11+X10_TEMP12);

final double X10_TEMP16 = (Math.sqrt(X10_TEMP14));
sq = (X10_TEMP16);
final boolean X10_TEMP18 = sq>vaverh;
if (X10_TEMP18) {
final double X10_TEMP19 = (md1.count);
final double X10_TEMP20 = (1.0);

final double X10_TEMP23 = (X10_TEMP19+X10_TEMP20);
final double X10_TEMP24 = (X10_TEMP23);
md1.count = (X10_TEMP24);
}
velt = (sq);
return velt;
}
public static void Particle_dscal(final Particle X10_TEMP0, final double sc, final int incx) {
final double X10_TEMP1 = (X10_TEMP0.xvelocity);

final double X10_TEMP4 = (X10_TEMP1*sc);
final double X10_TEMP5 = (X10_TEMP4);
X10_TEMP0.xvelocity = (X10_TEMP5);
final double X10_TEMP6 = (X10_TEMP0.yvelocity);

final double X10_TEMP9 = (X10_TEMP6*sc);
final double X10_TEMP10 = (X10_TEMP9);
X10_TEMP0.yvelocity = (X10_TEMP10);
final double X10_TEMP11 = (X10_TEMP0.zvelocity);

final double X10_TEMP14 = (X10_TEMP11*sc);
final double X10_TEMP15 = (X10_TEMP14);
X10_TEMP0.zvelocity = (X10_TEMP15);
}
public static double Random_update(final Random X10_TEMP0) {
double rand = (0.0);
double scale = (4.656612875e-10);
int is1 = (0);
int is2 = (0);
int iss2 = (0);
int imult = (16807);
int imod = (2147483647);
final int X10_TEMP8 = (X10_TEMP0.iseed);
final int X10_TEMP9 = (0);

final boolean X10_TEMP11 = X10_TEMP8<=X10_TEMP9;
if (X10_TEMP11) {
final int X10_TEMP14 = (1);
final int X10_TEMP15 = (X10_TEMP14);
X10_TEMP0.iseed = (X10_TEMP15);
}
final int X10_TEMP16 = (X10_TEMP0.iseed);
final int X10_TEMP17 = (32768);

final int X10_TEMP19 = (X10_TEMP16%X10_TEMP17);
is2 = (X10_TEMP19);
final int X10_TEMP20 = (X10_TEMP0.iseed);

final int X10_TEMP22 = (X10_TEMP20-is2);
final int X10_TEMP23 = (32768);

final int X10_TEMP25 = (X10_TEMP22/X10_TEMP23);
is1 = (X10_TEMP25);
final int X10_TEMP27 = (is2*imult);
iss2 = (X10_TEMP27);
final int X10_TEMP28 = (32768);

final int X10_TEMP30 = (iss2%X10_TEMP28);
is2 = (X10_TEMP30);
final int X10_TEMP34 = (is1*imult);
final int X10_TEMP32 = (iss2-is2);
final int X10_TEMP33 = (32768);
final int X10_TEMP35 = (X10_TEMP32/X10_TEMP33);

final int X10_TEMP37 = (X10_TEMP34+X10_TEMP35);
final int X10_TEMP39 = (65536);

final int X10_TEMP41 = (X10_TEMP37%X10_TEMP39);
is1 = (X10_TEMP41);
final int X10_TEMP42 = (32768);
final int X10_TEMP43 = (is1*X10_TEMP42);

final int X10_TEMP45 = (X10_TEMP43+is2);

final int X10_TEMP48 = (X10_TEMP45%imod);
final int X10_TEMP49 = (X10_TEMP48);
X10_TEMP0.iseed = (X10_TEMP49);
final int X10_TEMP50 = (X10_TEMP0.iseed);

final double X10_TEMP52 = (scale*X10_TEMP50);
rand = (X10_TEMP52);
return rand;
}
public static double Random_seed(final Random X10_TEMP0) {
double s = (0.0);
double u1 = (0.0);
double u2 = (0.0);
double r = (0.0);
final double X10_TEMP6 = (1.0);
s = (X10_TEMP6);
boolean X10_TEMP7 = false;
do {
final double X10_TEMP9 = (Program.Random_update(X10_TEMP0));
u1 = (X10_TEMP9);
final double X10_TEMP11 = (Program.Random_update(X10_TEMP0));
u2 = (X10_TEMP11);
final double X10_TEMP12 = (2.0);
final double X10_TEMP13 = (X10_TEMP12*u1);
final double X10_TEMP14 = (1.0);

final double X10_TEMP17 = (X10_TEMP13-X10_TEMP14);
final double X10_TEMP18 = (X10_TEMP17);
X10_TEMP0.v1 = (X10_TEMP18);
final double X10_TEMP19 = (2.0);
final double X10_TEMP20 = (X10_TEMP19*u2);
final double X10_TEMP21 = (1.0);

final double X10_TEMP24 = (X10_TEMP20-X10_TEMP21);
final double X10_TEMP25 = (X10_TEMP24);
X10_TEMP0.v2 = (X10_TEMP25);
final double X10_TEMP26 = (X10_TEMP0.v1);
final double X10_TEMP27 = (X10_TEMP0.v1);
final double X10_TEMP30 = (X10_TEMP26*X10_TEMP27);
final double X10_TEMP28 = (X10_TEMP0.v2);
final double X10_TEMP29 = (X10_TEMP0.v2);
final double X10_TEMP31 = (X10_TEMP28*X10_TEMP29);

final double X10_TEMP33 = (X10_TEMP30+X10_TEMP31);
s = (X10_TEMP33);
final double X10_TEMP34 = (1.0);
X10_TEMP7 = s>=X10_TEMP34;
} while(X10_TEMP7);
final double X10_TEMP36 = (2.0);
final int X10_TEMP37 = 0;
final double X10_TEMP39 = (X10_TEMP37 - X10_TEMP36);
final double X10_TEMP40 = (Math.log(s));
final double X10_TEMP41 = (X10_TEMP39*X10_TEMP40);
final double X10_TEMP43 = (X10_TEMP41/s);

final double X10_TEMP45 = (Math.sqrt(X10_TEMP43));
r = (X10_TEMP45);
return r;
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

class md {
public Particle [:rank==1] one;
public double epot;
public double vir;
public int interactions;
public double count;
public int mdsize;
public double l;
public double rcoff;
public double rcoffs;
public double side;
public double sideh;
public double hsq;
public double hsq2;
public double a;
public double tscale;
public double sc;
public double ekin;
public double ek;
public double vaver;
public double vaverh;
public double etot;
public double temp;
public double pres;
public double rp;
public int npartm;
public int rnk;
public int nprocess;


}

class Particle {
public double xcoord;
public double ycoord;
public double zcoord;
public double xvelocity;
public double yvelocity;
public double zvelocity;
public double xforce;
public double yforce;
public double zforce;


public Particle(final double xcoord0, final double ycoord0, final double zcoord0, final double xvelocity0, final double yvelocity0, final double zvelocity0, final double xforce0, final double yforce0, final double zforce0) {
xcoord = (xcoord0);
ycoord = (ycoord0);
zcoord = (zcoord0);
xvelocity = (xvelocity0);
yvelocity = (yvelocity0);
zvelocity = (zvelocity0);
xforce = (xforce0);
yforce = (yforce0);
zforce = (zforce0);
}


}

class Random {
public int iseed;
public double v1;
public double v2;


public Random(final int iseed0, final double v10, final double v20) {
iseed = (iseed0);
v1 = (v10);
v2 = (v20);
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

