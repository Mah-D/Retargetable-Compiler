public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static final region(:rank==1) _Program__Linpack_r = Program0._Program__Linpack_r_init();
public static final dist(:rank==1) _Program__Linpack_vd = Program0._Program__Linpack_vd_init();
public static final int[:rank==1] _Program__Linpack_datasizes = Program0._Program__Linpack_datasizes_init();


public static void runMain() {
Program0.Program_runMain();
}
public static region(:rank==1) _Program__Linpack_r_init() {

final region(:rank==1) X10_TEMP210 = (region(:rank==1))(Program0.Program__Linpack_r_init());
return X10_TEMP210;
}
public static dist(:rank==1) _Program__Linpack_vd_init() {

final dist(:rank==1) X10_TEMP210 = (dist(:rank==1))(Program0.Program__Linpack_vd_init());
return X10_TEMP210;
}
public static int[:rank==1] _Program__Linpack_datasizes_init() {

final int[:rank==1] X10_TEMP210 = (int[:rank==1])(Program0.Program__Linpack_datasizes_init());
return X10_TEMP210;
}
public static void Program_runMain() {
final Linpack X10_TEMP210 = (new Linpack());

final Linpack X10_TEMP1 = (X10_TEMP210);
Program0.Program_Linpack_run(X10_TEMP1);
}
public static region(:rank==1) Program__Linpack_r_init() {
final int X10_TEMP210 = (0);

final int X10_TEMP3 = (X10_TEMP210);
final int X10_TEMP213 = (2);

final int X10_TEMP4 = (X10_TEMP213);
final region(:rank==1) X10_TEMP218 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))(X10_TEMP218);
return X10_TEMP6;
}
public static dist(:rank==1) Program__Linpack_vd_init() {
final place X10_TEMP210 = (place.FIRST_PLACE);

final place X10_TEMP1 = (X10_TEMP210);
final dist(:rank==1) X10_TEMP213 = (dist(:rank==1))(_Program__Linpack_r->X10_TEMP1);

final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(X10_TEMP213);
return X10_TEMP3;
}
public static int [:rank==1] Program__Linpack_datasizes_init() {
final int[:rank==1&&distribution==_Program__Linpack_vd] X10_TEMP214 = (int[:rank==1&&distribution==_Program__Linpack_vd])(new int[_Program__Linpack_vd](point(:rank==1)p0) {
final int X10_TEMP210 = (0);

final int X10_TEMP2 = (X10_TEMP210);
return X10_TEMP2;
}

);

final int[:rank==1] X10_TEMP4 = (int[:rank==1])(X10_TEMP214);
return X10_TEMP4;
}
public static void Program_Linpack_initdataSizesArray(final Linpack X10_TEMP0) {
final int X10_TEMP210 = (0);

final int X10_TEMP2 = (X10_TEMP210);
final int X10_TEMP213 = (150);

final int X10_TEMP5 = (X10_TEMP213);
final int X10_TEMP216 = (X10_TEMP5);

final int X10_TEMP6 = (X10_TEMP216);
final int X10_TEMP220 = (X10_TEMP6);

final int X10_TEMP223 = (X10_TEMP220);
_Program__Linpack_datasizes[X10_TEMP2] = (X10_TEMP223);
final int X10_TEMP225 = (1);

final int X10_TEMP8 = (X10_TEMP225);
final int X10_TEMP228 = (1000);

final int X10_TEMP11 = (X10_TEMP228);
final int X10_TEMP231 = (X10_TEMP11);

final int X10_TEMP12 = (X10_TEMP231);
final int X10_TEMP235 = (X10_TEMP12);

final int X10_TEMP238 = (X10_TEMP235);
_Program__Linpack_datasizes[X10_TEMP8] = (X10_TEMP238);
final int X10_TEMP240 = (2);

final int X10_TEMP14 = (X10_TEMP240);
final int X10_TEMP243 = (2000);

final int X10_TEMP17 = (X10_TEMP243);
final int X10_TEMP246 = (X10_TEMP17);

final int X10_TEMP18 = (X10_TEMP246);
final int X10_TEMP250 = (X10_TEMP18);

final int X10_TEMP253 = (X10_TEMP250);
_Program__Linpack_datasizes[X10_TEMP14] = (X10_TEMP253);
}
public static void Program_Linpack_JGFsetsize(final Linpack X10_TEMP0, final int setSize) {
int X10_TEMP1 = (setSize);
final int X10_TEMP211 = (X10_TEMP1);

final int X10_TEMP4 = (X10_TEMP211);
final int X10_TEMP214 = (X10_TEMP4);

final int X10_TEMP217 = (X10_TEMP214);
X10_TEMP0.setSize = (X10_TEMP217);
}
public static void Program_Linpack_JGFinitialise(final Linpack X10_TEMP0) {
Program0.Program_Linpack_initdataSizesArray(X10_TEMP0);
final int X10_TEMP211 = (X10_TEMP0.setSize);

final int X10_TEMP2 = (X10_TEMP211);
final int X10_TEMP215 = (_Program__Linpack_datasizes[X10_TEMP2]);

final int X10_TEMP5 = (X10_TEMP215);
final int X10_TEMP218 = (X10_TEMP5);

final int X10_TEMP6 = (X10_TEMP218);
final int X10_TEMP221 = (X10_TEMP6);

final int X10_TEMP224 = (X10_TEMP221);
X10_TEMP0.n = (X10_TEMP224);
final String X10_TEMP226 = ("ATTENTION: Running with smaller size (");

final String X10_TEMP7 = (X10_TEMP226);
final int X10_TEMP229 = (X10_TEMP0.n);

final int X10_TEMP8 = (X10_TEMP229);
final String X10_TEMP232 = (X10_TEMP7+X10_TEMP8);

final String X10_TEMP9 = (X10_TEMP232);
final String X10_TEMP235 = (" instead of 500)");

final String X10_TEMP10 = (X10_TEMP235);
final String X10_TEMP238 = (X10_TEMP9+X10_TEMP10);

final String X10_TEMP12 = (X10_TEMP238);
System.out.println(X10_TEMP12);
final int X10_TEMP242 = (X10_TEMP0.n);

final int X10_TEMP15 = (X10_TEMP242);
final int X10_TEMP245 = (X10_TEMP15);

final int X10_TEMP16 = (X10_TEMP245);
final int X10_TEMP248 = (X10_TEMP16);

final int X10_TEMP251 = (X10_TEMP248);
X10_TEMP0.ldaa = (X10_TEMP251);
final int X10_TEMP253 = (X10_TEMP0.ldaa);

final int X10_TEMP17 = (X10_TEMP253);
final int X10_TEMP256 = (1);

final int X10_TEMP18 = (X10_TEMP256);
final int X10_TEMP259 = (X10_TEMP17+X10_TEMP18);

final int X10_TEMP21 = (X10_TEMP259);
final int X10_TEMP262 = (X10_TEMP21);

final int X10_TEMP22 = (X10_TEMP262);
final int X10_TEMP265 = (X10_TEMP22);

final int X10_TEMP268 = (X10_TEMP265);
X10_TEMP0.lda = (X10_TEMP268);
final int X10_TEMP270 = (0);

final int X10_TEMP25 = (X10_TEMP270);
final int X10_TEMP273 = (X10_TEMP0.ldaa);

final int X10_TEMP26 = (X10_TEMP273);
final region(:rank==1) X10_TEMP278 = (region(:rank==1))([X10_TEMP25:X10_TEMP26]);

region(:rank==1) vectorRegion = (region(:rank==1))(X10_TEMP278);
final int X10_TEMP281 = (0);

final int X10_TEMP32 = (X10_TEMP281);
final int X10_TEMP284 = (X10_TEMP0.ldaa);

final int X10_TEMP29 = (X10_TEMP284);
final int X10_TEMP287 = (1);

final int X10_TEMP30 = (X10_TEMP287);
final int X10_TEMP290 = (X10_TEMP29-X10_TEMP30);

final int X10_TEMP33 = (X10_TEMP290);
final region(:rank==1) X10_TEMP295 = (region(:rank==1))([X10_TEMP32:X10_TEMP33]);

region(:rank==1) vectorRegionMinus1 = (region(:rank==1))(X10_TEMP295);
final place X10_TEMP298 = (here);

final place X10_TEMP35 = (X10_TEMP298);
final dist(:rank==1) X10_TEMP301 = (dist(:rank==1))(vectorRegionMinus1->X10_TEMP35);

dist(:rank==1) vectorRegionMinus1Dist = (dist(:rank==1))(X10_TEMP301);
final int X10_TEMP304 = (0);

final int X10_TEMP39 = (X10_TEMP304);
final int X10_TEMP307 = (X10_TEMP0.ldaa);

final int X10_TEMP40 = (X10_TEMP307);
final int X10_TEMP310 = (0);

final int X10_TEMP43 = (X10_TEMP310);
final int X10_TEMP313 = (X10_TEMP0.lda);

final int X10_TEMP44 = (X10_TEMP313);
final region(:rank==2) X10_TEMP320 = (region(:rank==2))([X10_TEMP39:X10_TEMP40,X10_TEMP43:X10_TEMP44]);

region(:rank==2) rectangularRegion = (region(:rank==2))(X10_TEMP320);
final int X10_TEMP323 = (0);

final int X10_TEMP48 = (X10_TEMP323);
final int X10_TEMP326 = (0);

final int X10_TEMP49 = (X10_TEMP326);
final int X10_TEMP329 = (0);

final int X10_TEMP52 = (X10_TEMP329);
final int X10_TEMP332 = (X10_TEMP0.lda);

final int X10_TEMP53 = (X10_TEMP332);
final region(:rank==2) X10_TEMP339 = (region(:rank==2))([X10_TEMP48:X10_TEMP49,X10_TEMP52:X10_TEMP53]);

region(:rank==2) slimRegion = (region(:rank==2))(X10_TEMP339);
final place X10_TEMP342 = (here);

final place X10_TEMP55 = (X10_TEMP342);
final dist(:rank==2) X10_TEMP345 = (dist(:rank==2))(slimRegion->X10_TEMP55);

dist(:rank==2) slimRegionDist = (dist(:rank==2))(X10_TEMP345);
final int X10_TEMP348 = (X10_TEMP0.lda);

final int X10_TEMP58 = (X10_TEMP348);
final int X10_TEMP351 = (1);

final int X10_TEMP59 = (X10_TEMP351);
final int X10_TEMP354 = (X10_TEMP58+X10_TEMP59);

final int X10_TEMP61 = (X10_TEMP354);
final dist(:rank==2) X10_TEMP359 = (dist(:rank==2))(dist.factory.blockCyclic(rectangularRegion,X10_TEMP61));

final dist(:rank==2) X10_TEMP62 = (dist(:rank==2))(X10_TEMP359);
final dist(:rank==2) X10_TEMP362 = (dist(:rank==2))(X10_TEMP62);

dist(:rank==2) rectangular_distribution = (dist(:rank==2))(X10_TEMP362);
final double[:rank==2] X10_TEMP365 = (double[:rank==2])(new double[rectangular_distribution]);

final double[:rank==2] X10_TEMP66 = (double[:rank==2])(X10_TEMP365);
final double[:rank==2] X10_TEMP368 = (double[:rank==2])(X10_TEMP66);

final double[:rank==2] X10_TEMP67 = (double[:rank==2])(X10_TEMP368);
final double[:rank==2] X10_TEMP371 = (double[:rank==2])(X10_TEMP67);

final double[:rank==2] X10_TEMP374 = (double[:rank==2])(X10_TEMP371);
X10_TEMP0.a = (X10_TEMP374);
final double[:rank==2] X10_TEMP376 = (double[:rank==2])(new double[slimRegionDist]);

final double[:rank==2] X10_TEMP70 = (double[:rank==2])(X10_TEMP376);
final double[:rank==2] X10_TEMP379 = (double[:rank==2])(X10_TEMP70);

final double[:rank==2] X10_TEMP71 = (double[:rank==2])(X10_TEMP379);
final double[:rank==2] X10_TEMP382 = (double[:rank==2])(X10_TEMP71);

final double[:rank==2] X10_TEMP385 = (double[:rank==2])(X10_TEMP382);
X10_TEMP0.b = (X10_TEMP385);
final double[:rank==2] X10_TEMP387 = (double[:rank==2])(new double[slimRegionDist]);

final double[:rank==2] X10_TEMP74 = (double[:rank==2])(X10_TEMP387);
final double[:rank==2] X10_TEMP390 = (double[:rank==2])(X10_TEMP74);

final double[:rank==2] X10_TEMP75 = (double[:rank==2])(X10_TEMP390);
final double[:rank==2] X10_TEMP393 = (double[:rank==2])(X10_TEMP75);

final double[:rank==2] X10_TEMP396 = (double[:rank==2])(X10_TEMP393);
X10_TEMP0.x = (X10_TEMP396);
final int[:rank==1] X10_TEMP398 = (int[:rank==1])(new int[vectorRegionMinus1Dist]);

final int[:rank==1] X10_TEMP78 = (int[:rank==1])(X10_TEMP398);
final int[:rank==1] X10_TEMP401 = (int[:rank==1])(X10_TEMP78);

final int[:rank==1] X10_TEMP79 = (int[:rank==1])(X10_TEMP401);
final int[:rank==1] X10_TEMP404 = (int[:rank==1])(X10_TEMP79);

final int[:rank==1] X10_TEMP407 = (int[:rank==1])(X10_TEMP404);
X10_TEMP0.ipvt = (X10_TEMP407);
final int X10_TEMP409 = (X10_TEMP0.n);

final int X10_TEMP80 = (X10_TEMP409);
final long X10_TEMP412 = ((long)X10_TEMP80);

long nl = (X10_TEMP412);
final double X10_TEMP415 = (2.0);

final double X10_TEMP85 = (X10_TEMP415);
final long X10_TEMP418 = (nl*nl);

final long X10_TEMP82 = (X10_TEMP418);
final long X10_TEMP421 = (X10_TEMP82*nl);

final long X10_TEMP84 = (X10_TEMP421);
final double X10_TEMP424 = (X10_TEMP85*X10_TEMP84);

final double X10_TEMP87 = (X10_TEMP424);
final double X10_TEMP427 = (3.0);

final double X10_TEMP88 = (X10_TEMP427);
final double X10_TEMP430 = (X10_TEMP87/X10_TEMP88);

final double X10_TEMP92 = (X10_TEMP430);
final double X10_TEMP433 = (2.0);

final double X10_TEMP91 = (X10_TEMP433);
final long X10_TEMP436 = (nl*nl);

final long X10_TEMP90 = (X10_TEMP436);
final double X10_TEMP439 = (X10_TEMP91*X10_TEMP90);

final double X10_TEMP93 = (X10_TEMP439);
final double X10_TEMP442 = (X10_TEMP92+X10_TEMP93);

final double X10_TEMP96 = (X10_TEMP442);
final double X10_TEMP445 = (X10_TEMP96);

final double X10_TEMP97 = (X10_TEMP445);
final double X10_TEMP448 = (X10_TEMP97);

final double X10_TEMP451 = (X10_TEMP448);
X10_TEMP0.ops = (X10_TEMP451);
final double[:rank==2] X10_TEMP453 = (double[:rank==2])(X10_TEMP0.a);

final double[:rank==2] X10_TEMP102 = (double[:rank==2])(X10_TEMP453);
final int X10_TEMP456 = (X10_TEMP0.lda);

final int X10_TEMP103 = (X10_TEMP456);
final int X10_TEMP459 = (X10_TEMP0.n);

final int X10_TEMP104 = (X10_TEMP459);
final double[:rank==2] X10_TEMP462 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP105 = (double[:rank==2])(X10_TEMP462);
final double X10_TEMP470 = (Program0.Program_Linpack_matgen(X10_TEMP0,X10_TEMP102,X10_TEMP103,X10_TEMP104,X10_TEMP105));

final double X10_TEMP108 = (X10_TEMP470);
final double X10_TEMP473 = (X10_TEMP108);

final double X10_TEMP109 = (X10_TEMP473);
final double X10_TEMP476 = (X10_TEMP109);

final double X10_TEMP479 = (X10_TEMP476);
X10_TEMP0.norma = (X10_TEMP479);
}
public static void Program_Linpack_JGFkernel(final Linpack X10_TEMP0) {
final double[:rank==2] X10_TEMP210 = (double[:rank==2])(X10_TEMP0.a);

final double[:rank==2] X10_TEMP5 = (double[:rank==2])(X10_TEMP210);
final int X10_TEMP213 = (X10_TEMP0.lda);

final int X10_TEMP6 = (X10_TEMP213);
final int X10_TEMP216 = (X10_TEMP0.n);

final int X10_TEMP7 = (X10_TEMP216);
final int[:rank==1] X10_TEMP219 = (int[:rank==1])(X10_TEMP0.ipvt);

final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP219);
final int X10_TEMP227 = (Program0.Program_Linpack_dgefa(X10_TEMP0,X10_TEMP5,X10_TEMP6,X10_TEMP7,X10_TEMP8));

final int X10_TEMP11 = (X10_TEMP227);
final int X10_TEMP230 = (X10_TEMP11);

final int X10_TEMP12 = (X10_TEMP230);
final int X10_TEMP233 = (X10_TEMP12);

final int X10_TEMP236 = (X10_TEMP233);
X10_TEMP0.info = (X10_TEMP236);
final double[:rank==2] X10_TEMP238 = (double[:rank==2])(X10_TEMP0.a);

final double[:rank==2] X10_TEMP19 = (double[:rank==2])(X10_TEMP238);
final int X10_TEMP241 = (X10_TEMP0.lda);

final int X10_TEMP20 = (X10_TEMP241);
final int X10_TEMP244 = (X10_TEMP0.n);

final int X10_TEMP21 = (X10_TEMP244);
final int[:rank==1] X10_TEMP247 = (int[:rank==1])(X10_TEMP0.ipvt);

final int[:rank==1] X10_TEMP22 = (int[:rank==1])(X10_TEMP247);
final double[:rank==2] X10_TEMP250 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP23 = (double[:rank==2])(X10_TEMP250);
final int X10_TEMP253 = (0);

final int X10_TEMP24 = (X10_TEMP253);
Program0.Program_Linpack_dgesl(X10_TEMP0,X10_TEMP19,X10_TEMP20,X10_TEMP21,X10_TEMP22,X10_TEMP23,X10_TEMP24);
}
public static void Program_Linpack_JGFvalidate(final Linpack X10_TEMP0) {
final double X10_TEMP210 = (0.0);

double eps = (X10_TEMP210);
final double X10_TEMP213 = (0.0);

double residn = (X10_TEMP213);
final double[:rank==1&&distribution==_Program__Linpack_vd] X10_TEMP220 = (double[:rank==1&&distribution==_Program__Linpack_vd])(new double[_Program__Linpack_vd](point(:rank==1)p0) {
final double X10_TEMP216 = (0.0);

final double X10_TEMP4 = (X10_TEMP216);
return X10_TEMP4;
}

);

final double[:rank==1] ref = (double[:rank==1])(X10_TEMP220);
final int X10_TEMP223 = (0);

final int X10_TEMP7 = (X10_TEMP223);
final double X10_TEMP226 = (6.0);

final double X10_TEMP10 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP10);

final double X10_TEMP11 = (X10_TEMP229);
final double X10_TEMP233 = (X10_TEMP11);

final double X10_TEMP236 = (X10_TEMP233);
ref[X10_TEMP7] = (X10_TEMP236);
final int X10_TEMP238 = (1);

final int X10_TEMP13 = (X10_TEMP238);
final double X10_TEMP241 = (12.0);

final double X10_TEMP16 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP16);

final double X10_TEMP17 = (X10_TEMP244);
final double X10_TEMP248 = (X10_TEMP17);

final double X10_TEMP251 = (X10_TEMP248);
ref[X10_TEMP13] = (X10_TEMP251);
final int X10_TEMP253 = (2);

final int X10_TEMP19 = (X10_TEMP253);
final double X10_TEMP256 = (20.0);

final double X10_TEMP22 = (X10_TEMP256);
final double X10_TEMP259 = (X10_TEMP22);

final double X10_TEMP23 = (X10_TEMP259);
final double X10_TEMP263 = (X10_TEMP23);

final double X10_TEMP266 = (X10_TEMP263);
ref[X10_TEMP19] = (X10_TEMP266);
final int X10_TEMP268 = (0);

final int X10_TEMP26 = (X10_TEMP268);
final int X10_TEMP271 = (0);

final int X10_TEMP27 = (X10_TEMP271);
final int X10_TEMP274 = (0);

final int X10_TEMP30 = (X10_TEMP274);
final int X10_TEMP277 = (X10_TEMP0.n);

final int X10_TEMP31 = (X10_TEMP277);
final region(:rank==2) X10_TEMP284 = (region(:rank==2))([X10_TEMP26:X10_TEMP27,X10_TEMP30:X10_TEMP31]);

final region(:rank==2) tempR = (region(:rank==2))(X10_TEMP284);
final place X10_TEMP287 = (here);

final place X10_TEMP33 = (X10_TEMP287);
final dist(:rank==2) X10_TEMP290 = (dist(:rank==2))(tempR->X10_TEMP33);

final dist(:rank==2) tempdist = (dist(:rank==2))(X10_TEMP290);
for(point(:rank==2)p[j,i]:tempdist) {
final double[:rank==2] X10_TEMP294 = (double[:rank==2])(X10_TEMP0.x);

final double[:rank==2] X10_TEMP36 = (double[:rank==2])(X10_TEMP294);
final int X10_TEMP297 = (0);

final int X10_TEMP39 = (X10_TEMP297);
final double[:rank==2] X10_TEMP300 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP40 = (double[:rank==2])(X10_TEMP300);
final int X10_TEMP303 = (0);

final int X10_TEMP43 = (X10_TEMP303);
final double X10_TEMP308 = (X10_TEMP40[X10_TEMP43,i]);

final double X10_TEMP46 = (X10_TEMP308);
final double X10_TEMP311 = (X10_TEMP46);

final double X10_TEMP47 = (X10_TEMP311);
final double X10_TEMP316 = (X10_TEMP47);

final double X10_TEMP319 = (X10_TEMP316);
X10_TEMP36[X10_TEMP39,i] = (X10_TEMP319);
}
final double[:rank==2] X10_TEMP321 = (double[:rank==2])(X10_TEMP0.a);

final double[:rank==2] X10_TEMP52 = (double[:rank==2])(X10_TEMP321);
final int X10_TEMP324 = (X10_TEMP0.lda);

final int X10_TEMP53 = (X10_TEMP324);
final int X10_TEMP327 = (X10_TEMP0.n);

final int X10_TEMP54 = (X10_TEMP327);
final double[:rank==2] X10_TEMP330 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP55 = (double[:rank==2])(X10_TEMP330);
final double X10_TEMP338 = (Program0.Program_Linpack_matgen(X10_TEMP0,X10_TEMP52,X10_TEMP53,X10_TEMP54,X10_TEMP55));

final double X10_TEMP58 = (X10_TEMP338);
final double X10_TEMP341 = (X10_TEMP58);

final double X10_TEMP59 = (X10_TEMP341);
final double X10_TEMP344 = (X10_TEMP59);

final double X10_TEMP347 = (X10_TEMP344);
X10_TEMP0.norma = (X10_TEMP347);
for(point(:rank==2)p[j,i]:tempdist) {
final double[:rank==2] X10_TEMP350 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP61 = (double[:rank==2])(X10_TEMP350);
final int X10_TEMP353 = (0);

final int X10_TEMP64 = (X10_TEMP353);
final double[:rank==2] X10_TEMP356 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP65 = (double[:rank==2])(X10_TEMP356);
final int X10_TEMP359 = (0);

final int X10_TEMP68 = (X10_TEMP359);
final double X10_TEMP364 = (X10_TEMP65[X10_TEMP68,i]);

final double X10_TEMP69 = (X10_TEMP364);
final int X10_TEMP70 = (0);
final double X10_TEMP368 = (X10_TEMP70-X10_TEMP69);

final double X10_TEMP73 = (X10_TEMP368);
final double X10_TEMP371 = (X10_TEMP73);

final double X10_TEMP74 = (X10_TEMP371);
final double X10_TEMP376 = (X10_TEMP74);

final double X10_TEMP379 = (X10_TEMP376);
X10_TEMP61[X10_TEMP64,i] = (X10_TEMP379);
}
final int X10_TEMP381 = (X10_TEMP0.n);

final int X10_TEMP81 = (X10_TEMP381);
final double[:rank==2] X10_TEMP384 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP82 = (double[:rank==2])(X10_TEMP384);
final int X10_TEMP387 = (X10_TEMP0.n);

final int X10_TEMP83 = (X10_TEMP387);
final int X10_TEMP390 = (X10_TEMP0.lda);

final int X10_TEMP84 = (X10_TEMP390);
final double[:rank==2] X10_TEMP393 = (double[:rank==2])(X10_TEMP0.x);

final double[:rank==2] X10_TEMP85 = (double[:rank==2])(X10_TEMP393);
final double[:rank==2] X10_TEMP396 = (double[:rank==2])(X10_TEMP0.a);

final double[:rank==2] X10_TEMP86 = (double[:rank==2])(X10_TEMP396);
Program0.Program_Linpack_dmxpy(X10_TEMP0,X10_TEMP81,X10_TEMP82,X10_TEMP83,X10_TEMP84,X10_TEMP85,X10_TEMP86);
final double X10_TEMP406 = (0.0);

final double X10_TEMP89 = (X10_TEMP406);
final double X10_TEMP409 = (X10_TEMP89);

final double X10_TEMP90 = (X10_TEMP409);
final double X10_TEMP412 = (X10_TEMP90);

final double X10_TEMP415 = (X10_TEMP412);
X10_TEMP0.resid = (X10_TEMP415);
final double X10_TEMP417 = (0.0);

final double X10_TEMP93 = (X10_TEMP417);
final double X10_TEMP420 = (X10_TEMP93);

final double X10_TEMP94 = (X10_TEMP420);
final double X10_TEMP423 = (X10_TEMP94);

final double X10_TEMP426 = (X10_TEMP423);
X10_TEMP0.normx = (X10_TEMP426);
for(point(:rank==2)p[j,i]:tempdist) {
final double X10_TEMP429 = (X10_TEMP0.resid);

final double X10_TEMP102 = (X10_TEMP429);
final double[:rank==2] X10_TEMP432 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP96 = (double[:rank==2])(X10_TEMP432);
final int X10_TEMP435 = (0);

final int X10_TEMP99 = (X10_TEMP435);
final double X10_TEMP440 = (X10_TEMP96[X10_TEMP99,i]);

final double X10_TEMP101 = (X10_TEMP440);
final double X10_TEMP445 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP101));

final double X10_TEMP103 = (X10_TEMP445);
final boolean X10_TEMP448 = (X10_TEMP102>X10_TEMP103);

final boolean X10_TEMP105 = (X10_TEMP448);
final boolean X10_TEMP106 = (X10_TEMP105);
final double[:rank==2] X10_TEMP452 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP108 = (double[:rank==2])(X10_TEMP452);
final int X10_TEMP455 = (0);

final int X10_TEMP111 = (X10_TEMP455);
final double X10_TEMP460 = (X10_TEMP108[X10_TEMP111,i]);

final double X10_TEMP113 = (X10_TEMP460);
double X10_TEMP115 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP113));
if (X10_TEMP106) {
final double X10_TEMP467 = (X10_TEMP0.resid);
X10_TEMP115 = (X10_TEMP467);
}
final double X10_TEMP116 = (X10_TEMP115);
final double X10_TEMP470 = (X10_TEMP116);

final double X10_TEMP118 = (X10_TEMP470);
final double X10_TEMP473 = (X10_TEMP118);

final double X10_TEMP476 = (X10_TEMP473);
X10_TEMP0.resid = (X10_TEMP476);
final double X10_TEMP478 = (X10_TEMP0.normx);

final double X10_TEMP125 = (X10_TEMP478);
final double[:rank==2] X10_TEMP481 = (double[:rank==2])(X10_TEMP0.x);

final double[:rank==2] X10_TEMP119 = (double[:rank==2])(X10_TEMP481);
final int X10_TEMP484 = (0);

final int X10_TEMP122 = (X10_TEMP484);
final double X10_TEMP489 = (X10_TEMP119[X10_TEMP122,i]);

final double X10_TEMP124 = (X10_TEMP489);
final double X10_TEMP494 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP124));

final double X10_TEMP126 = (X10_TEMP494);
final boolean X10_TEMP497 = (X10_TEMP125>X10_TEMP126);

final boolean X10_TEMP128 = (X10_TEMP497);
final boolean X10_TEMP129 = (X10_TEMP128);
final double[:rank==2] X10_TEMP501 = (double[:rank==2])(X10_TEMP0.x);

final double[:rank==2] X10_TEMP131 = (double[:rank==2])(X10_TEMP501);
final int X10_TEMP504 = (0);

final int X10_TEMP134 = (X10_TEMP504);
final double X10_TEMP509 = (X10_TEMP131[X10_TEMP134,i]);

final double X10_TEMP136 = (X10_TEMP509);
double X10_TEMP138 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP136));
if (X10_TEMP129) {
final double X10_TEMP516 = (X10_TEMP0.normx);
X10_TEMP138 = (X10_TEMP516);
}
final double X10_TEMP139 = (X10_TEMP138);
final double X10_TEMP519 = (X10_TEMP139);

final double X10_TEMP141 = (X10_TEMP519);
final double X10_TEMP522 = (X10_TEMP141);

final double X10_TEMP525 = (X10_TEMP522);
X10_TEMP0.normx = (X10_TEMP525);
}
final double X10_TEMP527 = (1.0);

final double X10_TEMP142 = (X10_TEMP527);
final double X10_TEMP530 = ((double)X10_TEMP142);

final double X10_TEMP144 = (X10_TEMP530);
final double X10_TEMP535 = (Program0.Program_Linpack_epslon(X10_TEMP0,X10_TEMP144));

final double X10_TEMP146 = (X10_TEMP535);
final double X10_TEMP538 = (X10_TEMP146);

eps = (X10_TEMP538);
final double X10_TEMP541 = (X10_TEMP0.resid);

final double X10_TEMP154 = (X10_TEMP541);
final int X10_TEMP544 = (X10_TEMP0.n);

final double X10_TEMP147 = (X10_TEMP544);
final double X10_TEMP547 = (X10_TEMP0.norma);

final double X10_TEMP148 = (X10_TEMP547);
final double X10_TEMP550 = (X10_TEMP147*X10_TEMP148);

final double X10_TEMP149 = (X10_TEMP550);
final double X10_TEMP553 = (X10_TEMP0.normx);

final double X10_TEMP150 = (X10_TEMP553);
final double X10_TEMP556 = (X10_TEMP149*X10_TEMP150);

final double X10_TEMP151 = (X10_TEMP556);
final double X10_TEMP559 = (X10_TEMP151*eps);

final double X10_TEMP153 = (X10_TEMP559);
final double X10_TEMP562 = (X10_TEMP154/X10_TEMP153);

final double X10_TEMP156 = (X10_TEMP562);
final double X10_TEMP565 = (X10_TEMP156);

residn = (X10_TEMP565);
final int X10_TEMP568 = (X10_TEMP0.setSize);

final int X10_TEMP158 = (X10_TEMP568);
final double X10_TEMP572 = (ref[X10_TEMP158]);

final double X10_TEMP159 = (X10_TEMP572);
final boolean X10_TEMP161 = (residn>X10_TEMP159);
if (X10_TEMP161) {
final String X10_TEMP577 = ("Validation failed");

final String X10_TEMP163 = (X10_TEMP577);
System.out.println(X10_TEMP163);
final String X10_TEMP581 = ("Computed Norm Res = ");

final String X10_TEMP164 = (X10_TEMP581);
final String X10_TEMP584 = (X10_TEMP164+residn);

final String X10_TEMP166 = (X10_TEMP584);
System.out.println(X10_TEMP166);
final String X10_TEMP588 = ("Reference Norm Res = ");

final String X10_TEMP169 = (X10_TEMP588);
final int X10_TEMP591 = (X10_TEMP0.setSize);

final int X10_TEMP168 = (X10_TEMP591);
final double X10_TEMP595 = (ref[X10_TEMP168]);

final double X10_TEMP170 = (X10_TEMP595);
final String X10_TEMP598 = (X10_TEMP169+X10_TEMP170);

final String X10_TEMP172 = (X10_TEMP598);
System.out.println(X10_TEMP172);
final String X10_TEMP602 = ("Validation failed");

final String X10_TEMP174 = (X10_TEMP602);
throw new RuntimeException(X10_TEMP174);
}
}
public static void Program_Linpack_JGFtidyup(final Linpack X10_TEMP0) {
}
public static void Program_Linpack_run(final Linpack X10_TEMP0) {
final int X10_TEMP210 = (0);

final int X10_TEMP2 = (X10_TEMP210);
Program0.Program_Linpack_JGFsetsize(X10_TEMP0,X10_TEMP2);
Program0.Program_Linpack_JGFinitialise(X10_TEMP0);
Program0.Program_Linpack_JGFkernel(X10_TEMP0);
Program0.Program_Linpack_JGFvalidate(X10_TEMP0);
Program0.Program_Linpack_JGFtidyup(X10_TEMP0);
}
public static double Program_Linpack_read(final Linpack X10_TEMP0, final double [:rank==2] a, final int i, final int j) {
final place X10_TEMP210 = (here);

final place curr_place = (X10_TEMP210);
final int X10_TEMP213 = (0);

final int X10_TEMP4 = (X10_TEMP213);
final int X10_TEMP216 = (0);

final int X10_TEMP5 = (X10_TEMP216);
final region(:rank==1) X10_TEMP221 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);

final region(:rank==1) tempr = (region(:rank==1))(X10_TEMP221);
final place X10_TEMP224 = (here);

final place X10_TEMP7 = (X10_TEMP224);
final dist(:rank==1) X10_TEMP227 = (dist(:rank==1))(tempr->X10_TEMP7);

final dist(:rank==1) tempvd = (dist(:rank==1))(X10_TEMP227);
final double[:rank==1&&distribution==tempvd] X10_TEMP234 = (double[:rank==1&&distribution==tempvd])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP230 = (0.0);

final double X10_TEMP10 = (X10_TEMP230);
return X10_TEMP10;
}

);

final double[:rank==1] tempref = (double[:rank==1])(X10_TEMP234);
finish {
final dist(:rank==2) X10_TEMP237 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP12 = (dist(:rank==2))(X10_TEMP237);
final place X10_TEMP16 = (X10_TEMP12.get(i,j));
async(X10_TEMP16) {
final double X10_TEMP246 = (a[i,j]);

final double temp = (X10_TEMP246);
async(curr_place) {
final int X10_TEMP250 = (0);

final int X10_TEMP22 = (X10_TEMP250);
final double X10_TEMP253 = (temp);

final double X10_TEMP25 = (X10_TEMP253);
final double X10_TEMP257 = (X10_TEMP25);

final double X10_TEMP260 = (X10_TEMP257);
tempref[X10_TEMP22] = (X10_TEMP260);
}
}
}
final int X10_TEMP262 = (0);

final int X10_TEMP27 = (X10_TEMP262);
final double X10_TEMP266 = (tempref[X10_TEMP27]);

final double X10_TEMP29 = (X10_TEMP266);
return X10_TEMP29;
}
public static void Program_Linpack_write(final Linpack X10_TEMP0, final double [:rank==2] a, final int i, final int j, final double val) {
final dist(:rank==2) X10_TEMP210 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(X10_TEMP210);
final place X10_TEMP5 = (X10_TEMP1.get(i,j));
async(X10_TEMP5) {
final double X10_TEMP217 = (val);

final double X10_TEMP10 = (X10_TEMP217);
final double X10_TEMP222 = (X10_TEMP10);

final double X10_TEMP225 = (X10_TEMP222);
a[i,j] = (X10_TEMP225);
}
}
public static void Program_Linpack_plusWrite(final Linpack X10_TEMP0, final double [:rank==2] a, final int i, final int j, final double val) {
final dist(:rank==2) X10_TEMP210 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(X10_TEMP210);
final place X10_TEMP5 = (X10_TEMP1.get(i,j));
async(X10_TEMP5) {
final double X10_TEMP219 = (a[i,j]);

final double X10_TEMP9 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP9+val);

final double X10_TEMP10 = (X10_TEMP222);
final double X10_TEMP227 = (X10_TEMP10);

final double X10_TEMP230 = (X10_TEMP227);
a[i,j] = (X10_TEMP230);
}
}
public static double Program_Linpack_myabs(final Linpack X10_TEMP0, final double d) {
double X10_TEMP1 = (d);
final int X10_TEMP211 = (0);

final int X10_TEMP2 = (X10_TEMP211);
final boolean X10_TEMP214 = (X10_TEMP1>=X10_TEMP2);

final boolean X10_TEMP4 = (X10_TEMP214);
final boolean X10_TEMP5 = (X10_TEMP4);
final int X10_TEMP7 = (0);
double X10_TEMP9 = (X10_TEMP7-X10_TEMP1);
if (X10_TEMP5) {
X10_TEMP9 = (X10_TEMP1);
}
final double X10_TEMP10 = (X10_TEMP9);
return X10_TEMP10;
}
public static double Program_Linpack_matgen(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final double [:rank==2] b) {
final int X10_TEMP210 = (1325);

int init = (X10_TEMP210);
final double X10_TEMP213 = (0.0);

double norma = (X10_TEMP213);
for(point(:rank==2)[i,j]:a) {
final int X10_TEMP217 = (3125);

final int X10_TEMP4 = (X10_TEMP217);
final int X10_TEMP220 = (X10_TEMP4*init);

final int X10_TEMP5 = (X10_TEMP220);
final int X10_TEMP223 = (65536);

final int X10_TEMP6 = (X10_TEMP223);
final int X10_TEMP226 = (X10_TEMP5%X10_TEMP6);

final int X10_TEMP8 = (X10_TEMP226);
final int X10_TEMP229 = (X10_TEMP8);

init = (X10_TEMP229);
final double X10_TEMP232 = (32768.0);

final double X10_TEMP9 = (X10_TEMP232);
final double X10_TEMP235 = (init-X10_TEMP9);

final double X10_TEMP11 = (X10_TEMP235);
final double X10_TEMP238 = (16384.0);

final double X10_TEMP12 = (X10_TEMP238);
final double X10_TEMP241 = (X10_TEMP11/X10_TEMP12);

double val = (X10_TEMP241);
finish {
Program0.Program_Linpack_write(X10_TEMP0,a,i,j,val);
}
final boolean X10_TEMP18 = (val>norma);
double X10_TEMP21 = (norma);
if (X10_TEMP18) {
X10_TEMP21 = (val);
}
final double X10_TEMP22 = (X10_TEMP21);
final double X10_TEMP254 = (X10_TEMP22);

norma = (X10_TEMP254);
}
finish {
for(point(:rank==2)X10_TEMP25[i,j]:b) {
final dist(:rank==2) X10_TEMP258 = (dist(:rank==2))(b.distribution);

final dist(:rank==2) X10_TEMP24 = (dist(:rank==2))(X10_TEMP258);
final place X10_TEMP26 = (X10_TEMP24.get(X10_TEMP25));
async(X10_TEMP26) {
final double X10_TEMP264 = (0.0);

final double X10_TEMP31 = (X10_TEMP264);
final double X10_TEMP267 = (X10_TEMP31);

final double X10_TEMP32 = (X10_TEMP267);
final double X10_TEMP272 = (X10_TEMP32);

final double X10_TEMP275 = (X10_TEMP272);
b[i,j] = (X10_TEMP275);
}
}
}
finish {
final int X10_TEMP277 = (0);

final int X10_TEMP36 = (X10_TEMP277);
final int X10_TEMP280 = (1);

final int X10_TEMP34 = (X10_TEMP280);
final int X10_TEMP283 = (n-X10_TEMP34);

final int X10_TEMP37 = (X10_TEMP283);
final int X10_TEMP286 = (0);

final int X10_TEMP41 = (X10_TEMP286);
final int X10_TEMP289 = (1);

final int X10_TEMP39 = (X10_TEMP289);
final int X10_TEMP292 = (n-X10_TEMP39);

final int X10_TEMP42 = (X10_TEMP292);
final region(:rank==2) X10_TEMP299 = (region(:rank==2))([X10_TEMP36:X10_TEMP37,X10_TEMP41:X10_TEMP42]);

final region(:rank==2) X10_TEMP44 = (region(:rank==2))(X10_TEMP299);
for(point(:rank==2)[i,j]:X10_TEMP44) {
finish {
final dist(:rank==2) X10_TEMP303 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP45 = (dist(:rank==2))(X10_TEMP303);
final place X10_TEMP49 = (X10_TEMP45.get(i,j));
async(X10_TEMP49) {
final int X10_TEMP310 = (0);

final int X10_TEMP56 = (X10_TEMP310);
final double X10_TEMP315 = (a[i,j]);

final double X10_TEMP57 = (X10_TEMP315);
Program0.Program_Linpack_plusWrite(X10_TEMP0,b,X10_TEMP56,j,X10_TEMP57);
}
}
}
}
return norma;
}
public static int Program_Linpack_dgefa(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final int [:rank==1] ipvt) {
final int X10_TEMP210 = (0);

final int X10_TEMP3 = (X10_TEMP210);
final int X10_TEMP213 = (X10_TEMP3);

final int X10_TEMP4 = (X10_TEMP213);
final int X10_TEMP216 = (X10_TEMP4);

final int X10_TEMP219 = (X10_TEMP216);
X10_TEMP0.infodgefa = (X10_TEMP219);
final int X10_TEMP221 = (1);

final int X10_TEMP5 = (X10_TEMP221);
final int X10_TEMP224 = (n-X10_TEMP5);

final int nm1 = (X10_TEMP224);
final int X10_TEMP227 = (0);

final int X10_TEMP7 = (X10_TEMP227);
final boolean X10_TEMP9 = (nm1>=X10_TEMP7);
if (X10_TEMP9) {
final int X10_TEMP232 = (0);

final int X10_TEMP13 = (X10_TEMP232);
final int X10_TEMP235 = (1);

final int X10_TEMP11 = (X10_TEMP235);
final int X10_TEMP238 = (nm1-X10_TEMP11);

final int X10_TEMP14 = (X10_TEMP238);
final region(:rank==1) X10_TEMP243 = (region(:rank==1))([X10_TEMP13:X10_TEMP14]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP243);
final place X10_TEMP246 = (here);

final place X10_TEMP16 = (X10_TEMP246);
final dist(:rank==1) X10_TEMP249 = (dist(:rank==1))(tempr->X10_TEMP16);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP249);
for(point(:rank==1)[k]:temprDist) {
final int X10_TEMP253 = (n-k);

final int X10_TEMP24 = (X10_TEMP253);
final int X10_TEMP256 = (1);

final int X10_TEMP25 = (X10_TEMP256);
final int X10_TEMP265 = (Program0.Program_Linpack_idamax(X10_TEMP0,X10_TEMP24,a,k,k,X10_TEMP25));

final int X10_TEMP26 = (X10_TEMP265);
final int X10_TEMP268 = (X10_TEMP26+k);

final int l = (X10_TEMP268);
final int X10_TEMP271 = (l);

final int X10_TEMP31 = (X10_TEMP271);
final int X10_TEMP275 = (X10_TEMP31);

final int X10_TEMP278 = (X10_TEMP275);
ipvt[k] = (X10_TEMP278);
finish {
final dist(:rank==2) X10_TEMP280 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP32 = (dist(:rank==2))(X10_TEMP280);
final int X10_TEMP283 = (1);

int X10_TEMP35 = (X10_TEMP283);
final place X10_TEMP37 = (X10_TEMP32.get(k,X10_TEMP35));
async(X10_TEMP37) {
final int X10_TEMP290 = (1);

final int X10_TEMP38 = (X10_TEMP290);
final int X10_TEMP293 = (k+X10_TEMP38);

final int kp1 = (X10_TEMP293);
final double X10_TEMP298 = (a[k,l]);

final double X10_TEMP42 = (X10_TEMP298);
final int X10_TEMP301 = (0);

final int X10_TEMP43 = (X10_TEMP301);
final boolean X10_TEMP45 = (X10_TEMP42!=X10_TEMP43);
if (X10_TEMP45) {
final boolean X10_TEMP47 = (l!=k);
if (X10_TEMP47) {
final boolean X10_TEMP49 = (l!=k);
if (X10_TEMP49) {
final double X10_TEMP312 = (a[k,l]);

double t = (X10_TEMP312);
final double X10_TEMP317 = (a[k,k]);

final double X10_TEMP59 = (X10_TEMP317);
final double X10_TEMP320 = (X10_TEMP59);

final double X10_TEMP60 = (X10_TEMP320);
final double X10_TEMP325 = (X10_TEMP60);

final double X10_TEMP328 = (X10_TEMP325);
a[k,l] = (X10_TEMP328);
final double X10_TEMP330 = (t);

final double X10_TEMP65 = (X10_TEMP330);
final double X10_TEMP335 = (X10_TEMP65);

final double X10_TEMP338 = (X10_TEMP335);
a[k,k] = (X10_TEMP338);
}
}
final double X10_TEMP340 = (1.0);

final double X10_TEMP66 = (X10_TEMP340);
final int X10_TEMP67 = (0);
final double X10_TEMP344 = (X10_TEMP67-X10_TEMP66);

final double X10_TEMP70 = (X10_TEMP344);
final double X10_TEMP349 = (a[k,k]);

final double X10_TEMP71 = (X10_TEMP349);
final double X10_TEMP352 = (X10_TEMP70/X10_TEMP71);

final double tx = (X10_TEMP352);
final int X10_TEMP355 = (kp1);

final int X10_TEMP74 = (X10_TEMP355);
final int X10_TEMP358 = (n-X10_TEMP74);

final int X10_TEMP81 = (X10_TEMP358);
final int X10_TEMP361 = (1);

final int X10_TEMP82 = (X10_TEMP361);
Program0.Program_Linpack_dscal(X10_TEMP0,X10_TEMP81,tx,a,k,kp1,X10_TEMP82);
finish {
final int X10_TEMP371 = (1);

final int X10_TEMP84 = (X10_TEMP371);
final int X10_TEMP374 = (n-X10_TEMP84);

final int X10_TEMP86 = (X10_TEMP374);
final region(:rank==1) X10_TEMP379 = (region(:rank==1))([kp1:X10_TEMP86]);

region(:rank==1) temprkp1 = (region(:rank==1))(X10_TEMP379);
final place X10_TEMP382 = (here);

final place X10_TEMP88 = (X10_TEMP382);
final dist(:rank==1) X10_TEMP385 = (dist(:rank==1))(temprkp1->X10_TEMP88);

dist(:rank==1) temprkp1Dist = (dist(:rank==1))(X10_TEMP385);
for(point(:rank==1)[j]:temprkp1Dist) {
final dist(:rank==2) X10_TEMP389 = (dist(:rank==2))(a.distribution);

final dist(:rank==2) X10_TEMP91 = (dist(:rank==2))(X10_TEMP389);
final place X10_TEMP95 = (X10_TEMP91.get(j,l));
async(X10_TEMP95) {
final double X10_TEMP398 = (a[j,l]);

double t = (X10_TEMP398);
final boolean X10_TEMP100 = (l!=k);
if (X10_TEMP100) {
final double X10_TEMP405 = (a[j,k]);

final double X10_TEMP107 = (X10_TEMP405);
final double X10_TEMP408 = (X10_TEMP107);

final double X10_TEMP108 = (X10_TEMP408);
final double X10_TEMP413 = (X10_TEMP108);

final double X10_TEMP416 = (X10_TEMP413);
a[j,l] = (X10_TEMP416);
final double X10_TEMP418 = (t);

final double X10_TEMP113 = (X10_TEMP418);
final double X10_TEMP423 = (X10_TEMP113);

final double X10_TEMP426 = (X10_TEMP423);
a[j,k] = (X10_TEMP426);
}
final int X10_TEMP428 = (kp1);

final int X10_TEMP115 = (X10_TEMP428);
final int X10_TEMP431 = (n-X10_TEMP115);

final int X10_TEMP126 = (X10_TEMP431);
final int X10_TEMP434 = (1);

final int X10_TEMP127 = (X10_TEMP434);
final int X10_TEMP437 = (1);

final int X10_TEMP128 = (X10_TEMP437);
Program0.Program_Linpack_daxpy(X10_TEMP0,X10_TEMP126,t,a,k,kp1,X10_TEMP127,a,j,kp1,X10_TEMP128);
}
}
}
}
else {
final int X10_TEMP451 = (k);

final int X10_TEMP131 = (X10_TEMP451);
final int X10_TEMP454 = (X10_TEMP131);

final int X10_TEMP457 = (X10_TEMP454);
X10_TEMP0.infodgefa = (X10_TEMP457);
}
}
}
}
}
final int X10_TEMP459 = (1);

final int X10_TEMP132 = (X10_TEMP459);
final int X10_TEMP462 = (n-X10_TEMP132);

final int X10_TEMP134 = (X10_TEMP462);
final int X10_TEMP465 = (1);

final int X10_TEMP135 = (X10_TEMP465);
final int X10_TEMP468 = (n-X10_TEMP135);

final int X10_TEMP138 = (X10_TEMP468);
final int X10_TEMP471 = (X10_TEMP138);

final int X10_TEMP139 = (X10_TEMP471);
final int X10_TEMP475 = (X10_TEMP139);

final int X10_TEMP478 = (X10_TEMP475);
ipvt[X10_TEMP134] = (X10_TEMP478);
final int X10_TEMP480 = (1);

final int X10_TEMP141 = (X10_TEMP480);
final int X10_TEMP483 = (n-X10_TEMP141);

final int X10_TEMP145 = (X10_TEMP483);
final int X10_TEMP486 = (1);

final int X10_TEMP143 = (X10_TEMP486);
final int X10_TEMP489 = (n-X10_TEMP143);

final int X10_TEMP146 = (X10_TEMP489);
final double X10_TEMP496 = (Program0.Program_Linpack_read(X10_TEMP0,a,X10_TEMP145,X10_TEMP146));

double val = (X10_TEMP496);
final int X10_TEMP499 = (0);

final int X10_TEMP148 = (X10_TEMP499);
final boolean X10_TEMP150 = (val==X10_TEMP148);
if (X10_TEMP150) {
final int X10_TEMP504 = (1);

final int X10_TEMP151 = (X10_TEMP504);
final int X10_TEMP507 = (n-X10_TEMP151);

final int X10_TEMP154 = (X10_TEMP507);
final int X10_TEMP510 = (X10_TEMP154);

final int X10_TEMP155 = (X10_TEMP510);
final int X10_TEMP513 = (X10_TEMP155);

final int X10_TEMP516 = (X10_TEMP513);
X10_TEMP0.info = (X10_TEMP516);
}
final int X10_TEMP518 = (X10_TEMP0.infodgefa);

final int X10_TEMP157 = (X10_TEMP518);
return X10_TEMP157;
}
public static void Program_Linpack_dgesl(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final int [:rank==1] ipvt, final double [:rank==2] b, final int job) {
final int X10_TEMP210 = (1);

final int X10_TEMP1 = (X10_TEMP210);
final int X10_TEMP213 = (n-X10_TEMP1);

final int nm1 = (X10_TEMP213);
final int X10_TEMP216 = (0);

final int X10_TEMP3 = (X10_TEMP216);
final boolean X10_TEMP5 = (job==X10_TEMP3);
if (X10_TEMP5) {
final int X10_TEMP221 = (1);

final int X10_TEMP6 = (X10_TEMP221);
final boolean X10_TEMP8 = (nm1>=X10_TEMP6);
if (X10_TEMP8) {
final int X10_TEMP226 = (0);

final int X10_TEMP12 = (X10_TEMP226);
final int X10_TEMP229 = (1);

final int X10_TEMP10 = (X10_TEMP229);
final int X10_TEMP232 = (nm1-X10_TEMP10);

final int X10_TEMP13 = (X10_TEMP232);
final region(:rank==1) X10_TEMP237 = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP237);
final place X10_TEMP240 = (here);

final place X10_TEMP15 = (X10_TEMP240);
final dist(:rank==1) X10_TEMP243 = (dist(:rank==1))(tempr->X10_TEMP15);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP243);
for(point(:rank==1)[k]:temprDist) {
final int X10_TEMP248 = (ipvt[k]);

final int l = (X10_TEMP248);
final int X10_TEMP251 = (0);

final int X10_TEMP22 = (X10_TEMP251);
final double X10_TEMP256 = (b[X10_TEMP22,l]);

double t = (X10_TEMP256);
final boolean X10_TEMP25 = (l!=k);
if (X10_TEMP25) {
final int X10_TEMP261 = (0);

final int X10_TEMP28 = (X10_TEMP261);
final int X10_TEMP264 = (0);

final int X10_TEMP31 = (X10_TEMP264);
final double X10_TEMP269 = (b[X10_TEMP31,k]);

final double X10_TEMP34 = (X10_TEMP269);
final double X10_TEMP272 = (X10_TEMP34);

final double X10_TEMP35 = (X10_TEMP272);
final double X10_TEMP277 = (X10_TEMP35);

final double X10_TEMP280 = (X10_TEMP277);
b[X10_TEMP28,l] = (X10_TEMP280);
final int X10_TEMP282 = (0);

final int X10_TEMP38 = (X10_TEMP282);
final double X10_TEMP285 = (t);

final double X10_TEMP41 = (X10_TEMP285);
final double X10_TEMP290 = (X10_TEMP41);

final double X10_TEMP293 = (X10_TEMP290);
b[X10_TEMP38,k] = (X10_TEMP293);
}
final int X10_TEMP295 = (1);

final int X10_TEMP42 = (X10_TEMP295);
final int X10_TEMP298 = (k+X10_TEMP42);

final int kp1 = (X10_TEMP298);
final int X10_TEMP301 = (kp1);

final int X10_TEMP45 = (X10_TEMP301);
final int X10_TEMP304 = (n-X10_TEMP45);

final int X10_TEMP56 = (X10_TEMP304);
final int X10_TEMP307 = (1);

final int X10_TEMP57 = (X10_TEMP307);
final int X10_TEMP310 = (0);

final int X10_TEMP58 = (X10_TEMP310);
final int X10_TEMP313 = (1);

final int X10_TEMP59 = (X10_TEMP313);
Program0.Program_Linpack_daxpy(X10_TEMP0,X10_TEMP56,t,a,k,kp1,X10_TEMP57,b,X10_TEMP58,kp1,X10_TEMP59);
}
}
final int X10_TEMP327 = (0);

final int X10_TEMP63 = (X10_TEMP327);
final int X10_TEMP330 = (1);

final int X10_TEMP61 = (X10_TEMP330);
final int X10_TEMP333 = (n-X10_TEMP61);

final int X10_TEMP64 = (X10_TEMP333);
final region(:rank==1) X10_TEMP338 = (region(:rank==1))([X10_TEMP63:X10_TEMP64]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP338);
final place X10_TEMP341 = (here);

final place X10_TEMP66 = (X10_TEMP341);
final dist(:rank==1) X10_TEMP344 = (dist(:rank==1))(tempr->X10_TEMP66);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP344);
for(point(:rank==1)[kb]:temprDist) {
final int X10_TEMP348 = (1);

final int X10_TEMP69 = (X10_TEMP348);
final int X10_TEMP351 = (kb+X10_TEMP69);

final int X10_TEMP71 = (X10_TEMP351);
final int X10_TEMP354 = (n-X10_TEMP71);

final int k = (X10_TEMP354);
final int X10_TEMP357 = (0);

final int X10_TEMP75 = (X10_TEMP357);
final double X10_TEMP362 = (b[X10_TEMP75,k]);

final double X10_TEMP80 = (X10_TEMP362);
final double X10_TEMP369 = (Program0.Program_Linpack_read(X10_TEMP0,a,k,k));

final double X10_TEMP81 = (X10_TEMP369);
final double X10_TEMP372 = (X10_TEMP80/X10_TEMP81);

final double X10_TEMP82 = (X10_TEMP372);
final double X10_TEMP377 = (X10_TEMP82);

final double X10_TEMP380 = (X10_TEMP377);
b[X10_TEMP75,k] = (X10_TEMP380);
final int X10_TEMP382 = (0);

final int X10_TEMP85 = (X10_TEMP382);
final double X10_TEMP387 = (b[X10_TEMP85,k]);

final double X10_TEMP86 = (X10_TEMP387);
final int X10_TEMP87 = (0);
final double X10_TEMP391 = (X10_TEMP87-X10_TEMP86);

double t = (X10_TEMP391);
final int X10_TEMP394 = (0);

final int X10_TEMP99 = (X10_TEMP394);
final int X10_TEMP397 = (1);

final int X10_TEMP100 = (X10_TEMP397);
final int X10_TEMP400 = (0);

final int X10_TEMP101 = (X10_TEMP400);
final int X10_TEMP403 = (0);

final int X10_TEMP102 = (X10_TEMP403);
final int X10_TEMP406 = (1);

final int X10_TEMP103 = (X10_TEMP406);
Program0.Program_Linpack_daxpy(X10_TEMP0,k,t,a,k,X10_TEMP99,X10_TEMP100,b,X10_TEMP101,X10_TEMP102,X10_TEMP103);
}
}
else {
final int X10_TEMP420 = (0);

final int X10_TEMP107 = (X10_TEMP420);
final int X10_TEMP423 = (1);

final int X10_TEMP105 = (X10_TEMP423);
final int X10_TEMP426 = (n-X10_TEMP105);

final int X10_TEMP108 = (X10_TEMP426);
final region(:rank==1) X10_TEMP431 = (region(:rank==1))([X10_TEMP107:X10_TEMP108]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP431);
final place X10_TEMP434 = (here);

final place X10_TEMP110 = (X10_TEMP434);
final dist(:rank==1) X10_TEMP437 = (dist(:rank==1))(tempr->X10_TEMP110);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP437);
for(point(:rank==1)[k]:temprDist) {
final int X10_TEMP441 = (0);

final int X10_TEMP122 = (X10_TEMP441);
final int X10_TEMP444 = (1);

final int X10_TEMP123 = (X10_TEMP444);
final int X10_TEMP447 = (0);

final int X10_TEMP124 = (X10_TEMP447);
final int X10_TEMP450 = (0);

final int X10_TEMP125 = (X10_TEMP450);
final int X10_TEMP453 = (1);

final int X10_TEMP126 = (X10_TEMP453);
final double X10_TEMP466 = (Program0.Program_Linpack_ddot(X10_TEMP0,k,a,k,X10_TEMP122,X10_TEMP123,b,X10_TEMP124,X10_TEMP125,X10_TEMP126));

double t = (X10_TEMP466);
final int X10_TEMP469 = (0);

final int X10_TEMP130 = (X10_TEMP469);
final int X10_TEMP472 = (0);

final int X10_TEMP133 = (X10_TEMP472);
final double X10_TEMP477 = (b[X10_TEMP133,k]);

final double X10_TEMP134 = (X10_TEMP477);
final double X10_TEMP480 = (X10_TEMP134-t);

final double X10_TEMP136 = (X10_TEMP480);
final double X10_TEMP485 = (a[k,k]);

final double X10_TEMP139 = (X10_TEMP485);
final double X10_TEMP488 = (X10_TEMP136/X10_TEMP139);

final double X10_TEMP142 = (X10_TEMP488);
final double X10_TEMP491 = (X10_TEMP142);

final double X10_TEMP143 = (X10_TEMP491);
final double X10_TEMP496 = (X10_TEMP143);

final double X10_TEMP499 = (X10_TEMP496);
b[X10_TEMP130,k] = (X10_TEMP499);
}
final int X10_TEMP501 = (1);

final int X10_TEMP144 = (X10_TEMP501);
final boolean X10_TEMP146 = (nm1>=X10_TEMP144);
if (X10_TEMP146) {
final int X10_TEMP506 = (1);

final int X10_TEMP150 = (X10_TEMP506);
final int X10_TEMP509 = (1);

final int X10_TEMP148 = (X10_TEMP509);
final int X10_TEMP512 = (nm1-X10_TEMP148);

final int X10_TEMP151 = (X10_TEMP512);
final region(:rank==1) X10_TEMP517 = (region(:rank==1))([X10_TEMP150:X10_TEMP151]);

region(:rank==1) temprnm1 = (region(:rank==1))(X10_TEMP517);
final place X10_TEMP520 = (here);

final place X10_TEMP153 = (X10_TEMP520);
final dist(:rank==1) X10_TEMP523 = (dist(:rank==1))(temprnm1->X10_TEMP153);

dist(:rank==1) temprnm1Dist = (dist(:rank==1))(X10_TEMP523);
for(point(:rank==1)[kb]:temprnm1Dist) {
final int X10_TEMP527 = (1);

final int X10_TEMP156 = (X10_TEMP527);
final int X10_TEMP530 = (kb+X10_TEMP156);

final int X10_TEMP158 = (X10_TEMP530);
final int X10_TEMP533 = (n-X10_TEMP158);

final int k = (X10_TEMP533);
final int X10_TEMP536 = (1);

final int X10_TEMP160 = (X10_TEMP536);
final int X10_TEMP539 = (k+X10_TEMP160);

final int kp1 = (X10_TEMP539);
final int X10_TEMP542 = (0);

final int X10_TEMP164 = (X10_TEMP542);
final int X10_TEMP545 = (kp1);

final int X10_TEMP166 = (X10_TEMP545);
final int X10_TEMP548 = (n-X10_TEMP166);

final int X10_TEMP176 = (X10_TEMP548);
final int X10_TEMP551 = (1);

final int X10_TEMP177 = (X10_TEMP551);
final int X10_TEMP554 = (0);

final int X10_TEMP178 = (X10_TEMP554);
final int X10_TEMP557 = (1);

final int X10_TEMP179 = (X10_TEMP557);
final double X10_TEMP562 = (b[X10_TEMP164,k]);

final double X10_TEMP181 = (X10_TEMP562);
final double X10_TEMP575 = (Program0.Program_Linpack_ddot(X10_TEMP0,X10_TEMP176,a,k,kp1,X10_TEMP177,b,X10_TEMP178,kp1,X10_TEMP179));

final double X10_TEMP182 = (X10_TEMP575);
final double X10_TEMP578 = (X10_TEMP181+X10_TEMP182);

final double X10_TEMP183 = (X10_TEMP578);
final double X10_TEMP583 = (X10_TEMP183);

final double X10_TEMP586 = (X10_TEMP583);
b[X10_TEMP164,k] = (X10_TEMP586);
final int X10_TEMP589 = (ipvt[k]);

final int l = (X10_TEMP589);
final boolean X10_TEMP187 = (l!=k);
if (X10_TEMP187) {
final int X10_TEMP594 = (0);

final int X10_TEMP190 = (X10_TEMP594);
final double X10_TEMP599 = (b[X10_TEMP190,l]);

double t = (X10_TEMP599);
final int X10_TEMP602 = (0);

final int X10_TEMP194 = (X10_TEMP602);
final int X10_TEMP605 = (0);

final int X10_TEMP197 = (X10_TEMP605);
final double X10_TEMP610 = (b[X10_TEMP197,k]);

final double X10_TEMP200 = (X10_TEMP610);
final double X10_TEMP613 = (X10_TEMP200);

final double X10_TEMP201 = (X10_TEMP613);
final double X10_TEMP618 = (X10_TEMP201);

final double X10_TEMP621 = (X10_TEMP618);
b[X10_TEMP194,l] = (X10_TEMP621);
final int X10_TEMP623 = (0);

final int X10_TEMP204 = (X10_TEMP623);
final double X10_TEMP626 = (t);

final double X10_TEMP207 = (X10_TEMP626);
final double X10_TEMP631 = (X10_TEMP207);

final double X10_TEMP634 = (X10_TEMP631);
b[X10_TEMP204,k] = (X10_TEMP634);
}
}
}
}
}
public static void Program_Linpack_daxpy(final Linpack X10_TEMP0, final int n, final double da, final double [:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double [:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
int X10_TEMP1 = (n);
double X10_TEMP2 = (da);
int X10_TEMP3 = (incx);
double[:rank==2] X10_TEMP4 = (double[:rank==2])(dy);
int X10_TEMP5 = (dyCol);
int X10_TEMP6 = (dy_off);
int X10_TEMP7 = (incy);
final int X10_TEMP217 = (0);

final int X10_TEMP8 = (X10_TEMP217);
final boolean X10_TEMP220 = (X10_TEMP1>X10_TEMP8);

final boolean X10_TEMP10 = (X10_TEMP220);
final int X10_TEMP223 = (0);

final int X10_TEMP11 = (X10_TEMP223);
final boolean X10_TEMP226 = (X10_TEMP2!=X10_TEMP11);

final boolean X10_TEMP13 = (X10_TEMP226);
final boolean X10_TEMP15 = (X10_TEMP10&&X10_TEMP13);
if (X10_TEMP15) {
final int X10_TEMP231 = (1);

final int X10_TEMP16 = (X10_TEMP231);
final boolean X10_TEMP234 = (X10_TEMP3!=X10_TEMP16);

final boolean X10_TEMP18 = (X10_TEMP234);
final int X10_TEMP237 = (1);

final int X10_TEMP17 = (X10_TEMP237);
final boolean X10_TEMP240 = (X10_TEMP7!=X10_TEMP17);

final boolean X10_TEMP19 = (X10_TEMP240);
final boolean X10_TEMP21 = (X10_TEMP18||X10_TEMP19);
if (X10_TEMP21) {
final int X10_TEMP245 = (0);

int ix = (X10_TEMP245);
final int X10_TEMP248 = (0);

int iy = (X10_TEMP248);
final int X10_TEMP251 = (0);

final int X10_TEMP24 = (X10_TEMP251);
final boolean X10_TEMP26 = (X10_TEMP3<X10_TEMP24);
if (X10_TEMP26) {
final int X10_TEMP27 = (0);
final int X10_TEMP257 = (X10_TEMP27-X10_TEMP1);

final int X10_TEMP28 = (X10_TEMP257);
final int X10_TEMP260 = (1);

final int X10_TEMP29 = (X10_TEMP260);
final int X10_TEMP263 = (X10_TEMP28+X10_TEMP29);

final int X10_TEMP31 = (X10_TEMP263);
final int X10_TEMP266 = (X10_TEMP31*X10_TEMP3);

final int X10_TEMP33 = (X10_TEMP266);
final int X10_TEMP269 = (X10_TEMP33);

ix = (X10_TEMP269);
}
final int X10_TEMP272 = (0);

final int X10_TEMP34 = (X10_TEMP272);
final boolean X10_TEMP36 = (X10_TEMP7<X10_TEMP34);
if (X10_TEMP36) {
final int X10_TEMP37 = (0);
final int X10_TEMP278 = (X10_TEMP37-X10_TEMP1);

final int X10_TEMP38 = (X10_TEMP278);
final int X10_TEMP281 = (1);

final int X10_TEMP39 = (X10_TEMP281);
final int X10_TEMP284 = (X10_TEMP38+X10_TEMP39);

final int X10_TEMP41 = (X10_TEMP284);
final int X10_TEMP287 = (X10_TEMP41*X10_TEMP7);

final int X10_TEMP43 = (X10_TEMP287);
final int X10_TEMP290 = (X10_TEMP43);

iy = (X10_TEMP290);
}
final int X10_TEMP293 = (0);

final int X10_TEMP47 = (X10_TEMP293);
final int X10_TEMP296 = (1);

final int X10_TEMP45 = (X10_TEMP296);
final int X10_TEMP299 = (X10_TEMP1-X10_TEMP45);

final int X10_TEMP48 = (X10_TEMP299);
final region(:rank==1) X10_TEMP304 = (region(:rank==1))([X10_TEMP47:X10_TEMP48]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP304);
final place X10_TEMP307 = (here);

final place X10_TEMP50 = (X10_TEMP307);
final dist(:rank==1) X10_TEMP310 = (dist(:rank==1))(tempr->X10_TEMP50);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP310);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP314 = (iy+X10_TEMP6);

final int X10_TEMP55 = (X10_TEMP314);
final int X10_TEMP317 = (ix+dx_off);

final int X10_TEMP59 = (X10_TEMP317);
final double X10_TEMP324 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxCol,X10_TEMP59));

final double X10_TEMP60 = (X10_TEMP324);
final double X10_TEMP329 = (X10_TEMP4[X10_TEMP5,X10_TEMP55]);

final double X10_TEMP62 = (X10_TEMP329);
final double X10_TEMP332 = (X10_TEMP2*X10_TEMP60);

final double X10_TEMP63 = (X10_TEMP332);
final double X10_TEMP335 = (X10_TEMP62+X10_TEMP63);

final double X10_TEMP64 = (X10_TEMP335);
final double X10_TEMP340 = (X10_TEMP64);

final double X10_TEMP343 = (X10_TEMP340);
X10_TEMP4[X10_TEMP5,X10_TEMP55] = (X10_TEMP343);
final int X10_TEMP345 = (ix+X10_TEMP3);

ix = (X10_TEMP345);
final int X10_TEMP348 = (iy+X10_TEMP7);

iy = (X10_TEMP348);
}
return;
}
final int X10_TEMP351 = (0);

final int X10_TEMP70 = (X10_TEMP351);
final int X10_TEMP354 = (1);

final int X10_TEMP68 = (X10_TEMP354);
final int X10_TEMP357 = (X10_TEMP1-X10_TEMP68);

final int X10_TEMP71 = (X10_TEMP357);
final region(:rank==1) X10_TEMP362 = (region(:rank==1))([X10_TEMP70:X10_TEMP71]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP362);
final place X10_TEMP365 = (here);

final place X10_TEMP73 = (X10_TEMP365);
final dist(:rank==1) X10_TEMP368 = (dist(:rank==1))(tempr->X10_TEMP73);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP368);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP372 = (i+X10_TEMP6);

final int X10_TEMP78 = (X10_TEMP372);
final int X10_TEMP375 = (i+dx_off);

final int X10_TEMP82 = (X10_TEMP375);
final double X10_TEMP382 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxCol,X10_TEMP82));

final double X10_TEMP83 = (X10_TEMP382);
final double X10_TEMP387 = (X10_TEMP4[X10_TEMP5,X10_TEMP78]);

final double X10_TEMP85 = (X10_TEMP387);
final double X10_TEMP390 = (X10_TEMP2*X10_TEMP83);

final double X10_TEMP86 = (X10_TEMP390);
final double X10_TEMP393 = (X10_TEMP85+X10_TEMP86);

final double X10_TEMP87 = (X10_TEMP393);
final double X10_TEMP398 = (X10_TEMP87);

final double X10_TEMP401 = (X10_TEMP398);
X10_TEMP4[X10_TEMP5,X10_TEMP78] = (X10_TEMP401);
}
}
}
public static double Program_Linpack_ddot(final Linpack X10_TEMP0, final int n, final double [:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double [:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
final int X10_TEMP210 = (0);

double dtemp = (X10_TEMP210);
final int X10_TEMP213 = (0);

final int X10_TEMP2 = (X10_TEMP213);
final boolean X10_TEMP4 = (n>X10_TEMP2);
if (X10_TEMP4) {
final int X10_TEMP218 = (1);

final int X10_TEMP5 = (X10_TEMP218);
final boolean X10_TEMP221 = (incx!=X10_TEMP5);

final boolean X10_TEMP7 = (X10_TEMP221);
final int X10_TEMP224 = (1);

final int X10_TEMP6 = (X10_TEMP224);
final boolean X10_TEMP227 = (incy!=X10_TEMP6);

final boolean X10_TEMP8 = (X10_TEMP227);
final boolean X10_TEMP10 = (X10_TEMP7||X10_TEMP8);
if (X10_TEMP10) {
final int X10_TEMP232 = (0);

int ix = (X10_TEMP232);
final int X10_TEMP235 = (0);

int iy = (X10_TEMP235);
final int X10_TEMP238 = (0);

final int X10_TEMP13 = (X10_TEMP238);
final boolean X10_TEMP15 = (incx<X10_TEMP13);
if (X10_TEMP15) {
final int X10_TEMP16 = (0);
final int X10_TEMP244 = (X10_TEMP16-n);

final int X10_TEMP17 = (X10_TEMP244);
final int X10_TEMP247 = (1);

final int X10_TEMP18 = (X10_TEMP247);
final int X10_TEMP250 = (X10_TEMP17+X10_TEMP18);

final int X10_TEMP20 = (X10_TEMP250);
final int X10_TEMP253 = (X10_TEMP20*incx);

final int X10_TEMP22 = (X10_TEMP253);
final int X10_TEMP256 = (X10_TEMP22);

ix = (X10_TEMP256);
}
final int X10_TEMP259 = (0);

final int X10_TEMP23 = (X10_TEMP259);
final boolean X10_TEMP25 = (incy<X10_TEMP23);
if (X10_TEMP25) {
final int X10_TEMP26 = (0);
final int X10_TEMP265 = (X10_TEMP26-n);

final int X10_TEMP27 = (X10_TEMP265);
final int X10_TEMP268 = (1);

final int X10_TEMP28 = (X10_TEMP268);
final int X10_TEMP271 = (X10_TEMP27+X10_TEMP28);

final int X10_TEMP30 = (X10_TEMP271);
final int X10_TEMP274 = (X10_TEMP30*incy);

final int X10_TEMP32 = (X10_TEMP274);
final int X10_TEMP277 = (X10_TEMP32);

iy = (X10_TEMP277);
}
final int X10_TEMP280 = (0);

final int X10_TEMP36 = (X10_TEMP280);
final int X10_TEMP283 = (1);

final int X10_TEMP34 = (X10_TEMP283);
final int X10_TEMP286 = (n-X10_TEMP34);

final int X10_TEMP37 = (X10_TEMP286);
final region(:rank==1) X10_TEMP291 = (region(:rank==1))([X10_TEMP36:X10_TEMP37]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP291);
final place X10_TEMP294 = (here);

final place X10_TEMP39 = (X10_TEMP294);
final dist(:rank==1) X10_TEMP297 = (dist(:rank==1))(tempr->X10_TEMP39);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP297);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP301 = (ix+dx_off);

final int X10_TEMP44 = (X10_TEMP301);
final double X10_TEMP306 = (dx[dxCol,X10_TEMP44]);

final double X10_TEMP48 = (X10_TEMP306);
final int X10_TEMP309 = (iy+dy_off);

final int X10_TEMP47 = (X10_TEMP309);
final double X10_TEMP314 = (dy[dyCol,X10_TEMP47]);

final double X10_TEMP49 = (X10_TEMP314);
final double X10_TEMP317 = (X10_TEMP48*X10_TEMP49);

final double X10_TEMP51 = (X10_TEMP317);
final double X10_TEMP320 = (dtemp+X10_TEMP51);

dtemp = (X10_TEMP320);
final int X10_TEMP323 = (ix+incx);

ix = (X10_TEMP323);
final int X10_TEMP326 = (iy+incy);

iy = (X10_TEMP326);
}
}
else {
final int X10_TEMP329 = (0);

final int X10_TEMP57 = (X10_TEMP329);
final int X10_TEMP332 = (1);

final int X10_TEMP55 = (X10_TEMP332);
final int X10_TEMP335 = (n-X10_TEMP55);

final int X10_TEMP58 = (X10_TEMP335);
final region(:rank==1) X10_TEMP340 = (region(:rank==1))([X10_TEMP57:X10_TEMP58]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP340);
final place X10_TEMP343 = (here);

final place X10_TEMP60 = (X10_TEMP343);
final dist(:rank==1) X10_TEMP346 = (dist(:rank==1))(tempr->X10_TEMP60);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP346);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP350 = (i+dx_off);

final int X10_TEMP65 = (X10_TEMP350);
final double X10_TEMP355 = (dx[dxCol,X10_TEMP65]);

final double X10_TEMP69 = (X10_TEMP355);
final int X10_TEMP358 = (i+dy_off);

final int X10_TEMP68 = (X10_TEMP358);
final double X10_TEMP363 = (dy[dyCol,X10_TEMP68]);

final double X10_TEMP70 = (X10_TEMP363);
final double X10_TEMP366 = (X10_TEMP69*X10_TEMP70);

final double X10_TEMP72 = (X10_TEMP366);
final double X10_TEMP369 = (dtemp+X10_TEMP72);

dtemp = (X10_TEMP369);
}
}
}
return dtemp;
}
public static void Program_Linpack_dscal(final Linpack X10_TEMP0, final int n, final double da, final double [:rank==2] dx, final int currentCol, final int dx_off, final int incx) {
int X10_TEMP1 = (n);
double X10_TEMP2 = (da);
double[:rank==2] X10_TEMP3 = (double[:rank==2])(dx);
int X10_TEMP4 = (currentCol);
int X10_TEMP5 = (dx_off);
int X10_TEMP6 = (incx);
final int X10_TEMP216 = (0);

final int X10_TEMP7 = (X10_TEMP216);
final boolean X10_TEMP9 = (X10_TEMP1>X10_TEMP7);
if (X10_TEMP9) {
final int X10_TEMP221 = (1);

final int X10_TEMP10 = (X10_TEMP221);
final boolean X10_TEMP12 = (X10_TEMP6!=X10_TEMP10);
if (X10_TEMP12) {
final int X10_TEMP226 = (X10_TEMP1*X10_TEMP6);

final int nincx = (X10_TEMP226);
final int X10_TEMP229 = (0);

int i = (X10_TEMP229);
boolean X10_TEMP17 = (i<nincx);
boolean X10_TEMP234 = X10_TEMP17;
while(X10_TEMP234) {
final int X10_TEMP236 = (i+X10_TEMP5);

final int X10_TEMP20 = (X10_TEMP236);
final double X10_TEMP241 = (X10_TEMP3[X10_TEMP4,X10_TEMP20]);

final double X10_TEMP22 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP22*X10_TEMP2);

final double X10_TEMP23 = (X10_TEMP244);
final double X10_TEMP249 = (X10_TEMP23);

final double X10_TEMP252 = (X10_TEMP249);
X10_TEMP3[X10_TEMP4,X10_TEMP20] = (X10_TEMP252);
final int X10_TEMP254 = (i+X10_TEMP6);

i = (X10_TEMP254);
final boolean X10_TEMP257 = (i<nincx);
X10_TEMP17 = (X10_TEMP257);
X10_TEMP234 = X10_TEMP17;
}
}
else {
final int X10_TEMP259 = (0);

final int X10_TEMP28 = (X10_TEMP259);
final int X10_TEMP262 = (1);

final int X10_TEMP26 = (X10_TEMP262);
final int X10_TEMP265 = (X10_TEMP1-X10_TEMP26);

final int X10_TEMP29 = (X10_TEMP265);
final region(:rank==1) X10_TEMP270 = (region(:rank==1))([X10_TEMP28:X10_TEMP29]);

region(:rank==1) tempr = (region(:rank==1))(X10_TEMP270);
final place X10_TEMP273 = (here);

final place X10_TEMP31 = (X10_TEMP273);
final dist(:rank==1) X10_TEMP276 = (dist(:rank==1))(tempr->X10_TEMP31);

dist(:rank==1) temprDist = (dist(:rank==1))(X10_TEMP276);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP280 = (i+X10_TEMP5);

final int X10_TEMP36 = (X10_TEMP280);
final double X10_TEMP285 = (X10_TEMP3[X10_TEMP4,X10_TEMP36]);

final double X10_TEMP38 = (X10_TEMP285);
final double X10_TEMP288 = (X10_TEMP38*X10_TEMP2);

final double X10_TEMP39 = (X10_TEMP288);
final double X10_TEMP293 = (X10_TEMP39);

final double X10_TEMP296 = (X10_TEMP293);
X10_TEMP3[X10_TEMP4,X10_TEMP36] = (X10_TEMP296);
}
}
}
}
public static int Program_Linpack_idamax(final Linpack X10_TEMP0, final int n, final double [:rank==2] dx, final int dxk, final int dx_off, final int incx) {
final int X10_TEMP210 = (1);

final int X10_TEMP1 = (X10_TEMP210);
final boolean X10_TEMP3 = (n<X10_TEMP1);
if (X10_TEMP3) {
final int X10_TEMP215 = (1);

final int X10_TEMP4 = (X10_TEMP215);
final int X10_TEMP5 = (0);
final int X10_TEMP219 = (X10_TEMP5-X10_TEMP4);

final int X10_TEMP7 = (X10_TEMP219);
return X10_TEMP7;
}
final int X10_TEMP223 = (1);

final int X10_TEMP8 = (X10_TEMP223);
final boolean X10_TEMP10 = (n==X10_TEMP8);
if (X10_TEMP10) {
final int X10_TEMP228 = (0);

final int X10_TEMP12 = (X10_TEMP228);
return X10_TEMP12;
}
final int X10_TEMP232 = (1);

final int X10_TEMP13 = (X10_TEMP232);
final boolean X10_TEMP15 = (incx!=X10_TEMP13);
if (X10_TEMP15) {
final int X10_TEMP237 = (0);

int itemp = (X10_TEMP237);
final int X10_TEMP240 = (0);

final int X10_TEMP19 = (X10_TEMP240);
final int X10_TEMP243 = (X10_TEMP19+dx_off);

final int X10_TEMP21 = (X10_TEMP243);
final double X10_TEMP250 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP21));

final double X10_TEMP23 = (X10_TEMP250);
final double X10_TEMP255 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP23));

double dmax = (X10_TEMP255);
final int X10_TEMP258 = (1);

final int X10_TEMP25 = (X10_TEMP258);
final int X10_TEMP261 = (X10_TEMP25+incx);

int ix = (X10_TEMP261);
final int X10_TEMP264 = (1);

final int X10_TEMP30 = (X10_TEMP264);
final int X10_TEMP267 = (1);

final int X10_TEMP28 = (X10_TEMP267);
final int X10_TEMP270 = (n-X10_TEMP28);

final int X10_TEMP31 = (X10_TEMP270);
final region(:rank==1) X10_TEMP275 = (region(:rank==1))([X10_TEMP30:X10_TEMP31]);

final region(:rank==1) X10_TEMP33 = (region(:rank==1))(X10_TEMP275);
for(point(:rank==1)[i]:X10_TEMP33) {
final int X10_TEMP279 = (ix+dx_off);

final int X10_TEMP37 = (X10_TEMP279);
final double X10_TEMP286 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP37));

final double X10_TEMP39 = (X10_TEMP286);
final double X10_TEMP291 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP39));

double dtemp = (X10_TEMP291);
final boolean X10_TEMP42 = (dtemp>dmax);
if (X10_TEMP42) {
final int X10_TEMP296 = (i);

itemp = (X10_TEMP296);
final double X10_TEMP299 = (dtemp);

dmax = (X10_TEMP299);
}
final int X10_TEMP302 = (ix+incx);

ix = (X10_TEMP302);
}
return itemp;
}
final int X10_TEMP306 = (0);

int itemp = (X10_TEMP306);
final int X10_TEMP309 = (0);

final int X10_TEMP50 = (X10_TEMP309);
final int X10_TEMP312 = (X10_TEMP50+dx_off);

final int X10_TEMP52 = (X10_TEMP312);
final double X10_TEMP319 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP52));

final double X10_TEMP54 = (X10_TEMP319);
final double X10_TEMP324 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP54));

double dmax = (X10_TEMP324);
final int X10_TEMP327 = (1);

final int X10_TEMP59 = (X10_TEMP327);
final int X10_TEMP330 = (1);

final int X10_TEMP57 = (X10_TEMP330);
final int X10_TEMP333 = (n-X10_TEMP57);

final int X10_TEMP60 = (X10_TEMP333);
final region(:rank==1) X10_TEMP338 = (region(:rank==1))([X10_TEMP59:X10_TEMP60]);

final region(:rank==1) X10_TEMP62 = (region(:rank==1))(X10_TEMP338);
for(point(:rank==1)[i]:X10_TEMP62) {
final int X10_TEMP342 = (i+dx_off);

final int X10_TEMP66 = (X10_TEMP342);
final double X10_TEMP349 = (Program0.Program_Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP66));

final double X10_TEMP68 = (X10_TEMP349);
final double X10_TEMP354 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP68));

double dtemp = (X10_TEMP354);
final boolean X10_TEMP71 = (dtemp>dmax);
if (X10_TEMP71) {
final int X10_TEMP359 = (i);

itemp = (X10_TEMP359);
final double X10_TEMP362 = (dtemp);

dmax = (X10_TEMP362);
}
}
return itemp;
}
public static double Program_Linpack_epslon(final Linpack X10_TEMP0, final double x) {
final double X10_TEMP210 = (4.0e0);

final double X10_TEMP1 = (X10_TEMP210);
final double X10_TEMP213 = (3.0e0);

final double X10_TEMP2 = (X10_TEMP213);
final double X10_TEMP216 = (X10_TEMP1/X10_TEMP2);

final double a = (X10_TEMP216);
final int X10_TEMP219 = (0);

double eps = (X10_TEMP219);
final int X10_TEMP222 = (0);

final int X10_TEMP5 = (X10_TEMP222);
boolean X10_TEMP9 = (eps==X10_TEMP5);
boolean X10_TEMP227 = X10_TEMP9;
while(X10_TEMP227) {
final double X10_TEMP229 = (1.0);

final double X10_TEMP10 = (X10_TEMP229);
final double X10_TEMP232 = (a-X10_TEMP10);

double b = (X10_TEMP232);
final double X10_TEMP235 = (b+b);

final double X10_TEMP12 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP12+b);

double c = (X10_TEMP238);
final double X10_TEMP241 = (1.0);

final double X10_TEMP14 = (X10_TEMP241);
final double X10_TEMP244 = (c-X10_TEMP14);

final double X10_TEMP16 = (X10_TEMP244);
final double X10_TEMP249 = (Program0.Program_Linpack_myabs(X10_TEMP0,X10_TEMP16));

final double X10_TEMP18 = (X10_TEMP249);
final double X10_TEMP252 = (X10_TEMP18);

eps = (X10_TEMP252);
final int X10_TEMP255 = (0);

final int X10_TEMP7 = (X10_TEMP255);
final boolean X10_TEMP258 = (eps==X10_TEMP7);
X10_TEMP9 = (X10_TEMP258);
X10_TEMP227 = X10_TEMP9;
}
final double X10_TEMP262 = (Program0.Program_Linpack_myabs(X10_TEMP0,x));

final double X10_TEMP20 = (X10_TEMP262);
final double X10_TEMP265 = (eps*X10_TEMP20);

final double X10_TEMP22 = (X10_TEMP265);
return X10_TEMP22;
}
public static void Program_Linpack_dmxpy(final Linpack X10_TEMP0, final int n1, final double [:rank==2] y, final int n2, final int ldm, final double [:rank==2] x, final double [:rank==2] m) {
final int X10_TEMP210 = (0);

final int X10_TEMP4 = (X10_TEMP210);
final int X10_TEMP213 = (1);

final int X10_TEMP2 = (X10_TEMP213);
final int X10_TEMP216 = (n2-X10_TEMP2);

final int X10_TEMP5 = (X10_TEMP216);
final int X10_TEMP219 = (0);

final int X10_TEMP9 = (X10_TEMP219);
final int X10_TEMP222 = (1);

final int X10_TEMP7 = (X10_TEMP222);
final int X10_TEMP225 = (n1-X10_TEMP7);

final int X10_TEMP10 = (X10_TEMP225);
final region(:rank==2) X10_TEMP232 = (region(:rank==2))([X10_TEMP4:X10_TEMP5,X10_TEMP9:X10_TEMP10]);

final region(:rank==2) X10_TEMP12 = (region(:rank==2))(X10_TEMP232);
for(point(:rank==2)[j,i]:X10_TEMP12) {
final int X10_TEMP236 = (0);

final int X10_TEMP15 = (X10_TEMP236);
final int X10_TEMP239 = (0);

final int X10_TEMP18 = (X10_TEMP239);
final double X10_TEMP244 = (x[X10_TEMP18,j]);

final double X10_TEMP22 = (X10_TEMP244);
final double X10_TEMP251 = (Program0.Program_Linpack_read(X10_TEMP0,m,j,i));

final double X10_TEMP23 = (X10_TEMP251);
final double X10_TEMP256 = (y[X10_TEMP15,i]);

final double X10_TEMP25 = (X10_TEMP256);
final double X10_TEMP259 = (X10_TEMP22*X10_TEMP23);

final double X10_TEMP26 = (X10_TEMP259);
final double X10_TEMP262 = (X10_TEMP25+X10_TEMP26);

final double X10_TEMP27 = (X10_TEMP262);
final double X10_TEMP267 = (X10_TEMP27);

final double X10_TEMP270 = (X10_TEMP267);
y[X10_TEMP15,i] = (X10_TEMP270);
}
}

}

class Program {
}

class Linpack {
public int setSize;
public double [:rank==2] a;
public double [:rank==2] b;
public double [:rank==2] x;
public double ops;
public double total;
public double norma;
public double normx;
public double resid;
public double time;
public double kf;
public int n;
public int i;
public int ntimes;
public int info;
public int lda;
public int ldaa;
public int kflops;
public int [:rank==1] ipvt;
public int infodgefa;


}

