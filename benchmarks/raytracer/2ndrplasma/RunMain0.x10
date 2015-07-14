public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static final int _Program__RayTracer_alpha = Program0._Program__RayTracer_alpha_init();
public static final Vec _Program__RayTracer_voidVec = Program0._Program__RayTracer_voidVec_init();
public static final int _Program__Scene_maxObjects = Program0._Program__Scene_maxObjects_init();
public static final int _Program__Scene_maxLights = Program0._Program__Scene_maxLights_init();


public static void runMain() {
Program0.Program_runMain();
}
public static int _Program__RayTracer_alpha_init() {

final int X10_TEMP217 = (Program0.Program__RayTracer_alpha_init());
return X10_TEMP217;
}
public static Vec _Program__RayTracer_voidVec_init() {

final Vec X10_TEMP217 = (Program0.Program__RayTracer_voidVec_init());
return X10_TEMP217;
}
public static int _Program__Scene_maxObjects_init() {

final int X10_TEMP217 = (Program0.Program__Scene_maxObjects_init());
return X10_TEMP217;
}
public static int _Program__Scene_maxLights_init() {

final int X10_TEMP217 = (Program0.Program__Scene_maxLights_init());
return X10_TEMP217;
}
public static String Program_Envelope2_toString(final Envelope2 X10_TEMP0) {
final String X10_TEMP217 = ("");

final String X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static String Program_Envelope_toString(final Envelope X10_TEMP0) {
final String X10_TEMP217 = ("");

final String X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static String Program_Interval_toString(final Interval X10_TEMP0) {
final int X10_TEMP217 = (X10_TEMP0.number);

final int X10_TEMP1 = (X10_TEMP217);
final String X10_TEMP220 = (" ");

final String X10_TEMP2 = (X10_TEMP220);
final String X10_TEMP223 = (X10_TEMP1+X10_TEMP2);

final String X10_TEMP3 = (X10_TEMP223);
final int X10_TEMP226 = (X10_TEMP0.width);

final int X10_TEMP4 = (X10_TEMP226);
final String X10_TEMP229 = (X10_TEMP3+X10_TEMP4);

final String X10_TEMP5 = (X10_TEMP229);
final String X10_TEMP232 = (" ");

final String X10_TEMP6 = (X10_TEMP232);
final String X10_TEMP235 = (X10_TEMP5+X10_TEMP6);

final String X10_TEMP7 = (X10_TEMP235);
final int X10_TEMP238 = (X10_TEMP0.height);

final int X10_TEMP8 = (X10_TEMP238);
final String X10_TEMP241 = (X10_TEMP7+X10_TEMP8);

final String X10_TEMP9 = (X10_TEMP241);
final String X10_TEMP244 = (" ");

final String X10_TEMP10 = (X10_TEMP244);
final String X10_TEMP247 = (X10_TEMP9+X10_TEMP10);

final String X10_TEMP11 = (X10_TEMP247);
final int X10_TEMP250 = (X10_TEMP0.yfrom);

final int X10_TEMP12 = (X10_TEMP250);
final String X10_TEMP253 = (X10_TEMP11+X10_TEMP12);

final String X10_TEMP13 = (X10_TEMP253);
final String X10_TEMP256 = (" ");

final String X10_TEMP14 = (X10_TEMP256);
final String X10_TEMP259 = (X10_TEMP13+X10_TEMP14);

final String X10_TEMP15 = (X10_TEMP259);
final int X10_TEMP262 = (X10_TEMP0.yto);

final int X10_TEMP16 = (X10_TEMP262);
final String X10_TEMP265 = (X10_TEMP15+X10_TEMP16);

final String X10_TEMP17 = (X10_TEMP265);
final String X10_TEMP268 = (" ");

final String X10_TEMP18 = (X10_TEMP268);
final String X10_TEMP271 = (X10_TEMP17+X10_TEMP18);

final String X10_TEMP19 = (X10_TEMP271);
final int X10_TEMP274 = (X10_TEMP0.total);

final int X10_TEMP20 = (X10_TEMP274);
final String X10_TEMP277 = (X10_TEMP19+X10_TEMP20);

final String X10_TEMP22 = (X10_TEMP277);
return X10_TEMP22;
}
public static String Program_Light_toString(final Light X10_TEMP0) {
final Vec X10_TEMP217 = (X10_TEMP0.pos);

final Vec X10_TEMP1 = (X10_TEMP217);
final String X10_TEMP220 = (" ");

final String X10_TEMP2 = (X10_TEMP220);
final String X10_TEMP224 = (Program0.Program_Vec_toString(X10_TEMP1));

final String X10_TEMP3 = (X10_TEMP224);
final String X10_TEMP227 = (X10_TEMP3+X10_TEMP2);

final String X10_TEMP4 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP0.brightness);

final double X10_TEMP5 = (X10_TEMP230);
final String X10_TEMP233 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP7 = (X10_TEMP233);
return X10_TEMP7;
}
public static void Program_runMain() {
final RayTracer X10_TEMP217 = (new RayTracer());

final RayTracer X10_TEMP1 = (X10_TEMP217);
Program0.Program_RayTracer_run(X10_TEMP1);
}
public static int Program__RayTracer_alpha_init() {
final int X10_TEMP217 = (255);

final int X10_TEMP1 = (X10_TEMP217);
final int X10_TEMP220 = (24);

final int X10_TEMP2 = (X10_TEMP220);
final int X10_TEMP223 = (X10_TEMP1<<X10_TEMP2);

final int X10_TEMP4 = (X10_TEMP223);
return X10_TEMP4;
}
public static Vec Program__RayTracer_voidVec_init() {
final Vec X10_TEMP217 = (new Vec());

final Vec X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static void Program_RayTracer_JGFsetsize(final RayTracer X10_TEMP0, final int size_t) {
int X10_TEMP1 = (size_t);
final int X10_TEMP218 = (0);

final long X10_TEMP4 = (X10_TEMP218);
final long X10_TEMP221 = (X10_TEMP4);

final long X10_TEMP5 = (X10_TEMP221);
final long X10_TEMP224 = (X10_TEMP5);

final long X10_TEMP227 = (X10_TEMP224);
X10_TEMP0.checksum = (X10_TEMP227);
final int X10_TEMP229 = (0);

final int X10_TEMP8 = (X10_TEMP229);
final int X10_TEMP232 = (1);

final int X10_TEMP9 = (X10_TEMP232);
final region(:rank==1) X10_TEMP237 = (region(:rank==1))([X10_TEMP8:X10_TEMP9]);

final region(:rank==1) X10_TEMP10 = (region(:rank==1))(X10_TEMP237);
final place X10_TEMP240 = (here);

final place X10_TEMP11 = (X10_TEMP240);
final dist(:rank==1) X10_TEMP243 = (dist(:rank==1))(X10_TEMP10->X10_TEMP11);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP243);
final int[:rank==1] X10_TEMP246 = (int[:rank==1])(new int[d1]);

final int[:rank==1] X10_TEMP15 = (int[:rank==1])(X10_TEMP246);
final int[:rank==1] X10_TEMP249 = (int[:rank==1])(X10_TEMP15);

final int[:rank==1] X10_TEMP16 = (int[:rank==1])(X10_TEMP249);
final int[:rank==1] X10_TEMP252 = (int[:rank==1])(X10_TEMP16);

final int[:rank==1] X10_TEMP255 = (int[:rank==1])(X10_TEMP252);
X10_TEMP0.datasizes = (X10_TEMP255);
final int[:rank==1] X10_TEMP257 = (int[:rank==1])(X10_TEMP0.datasizes);

final int[:rank==1] X10_TEMP17 = (int[:rank==1])(X10_TEMP257);
final int X10_TEMP260 = (0);

final int X10_TEMP19 = (X10_TEMP260);
final int X10_TEMP263 = (20);

final int X10_TEMP22 = (X10_TEMP263);
final int X10_TEMP266 = (X10_TEMP22);

final int X10_TEMP23 = (X10_TEMP266);
final int X10_TEMP270 = (X10_TEMP23);

final int X10_TEMP273 = (X10_TEMP270);
X10_TEMP17[X10_TEMP19] = (X10_TEMP273);
final int[:rank==1] X10_TEMP275 = (int[:rank==1])(X10_TEMP0.datasizes);

final int[:rank==1] X10_TEMP24 = (int[:rank==1])(X10_TEMP275);
final int X10_TEMP278 = (1);

final int X10_TEMP26 = (X10_TEMP278);
final int X10_TEMP281 = (500);

final int X10_TEMP29 = (X10_TEMP281);
final int X10_TEMP284 = (X10_TEMP29);

final int X10_TEMP30 = (X10_TEMP284);
final int X10_TEMP288 = (X10_TEMP30);

final int X10_TEMP291 = (X10_TEMP288);
X10_TEMP24[X10_TEMP26] = (X10_TEMP291);
final int X10_TEMP293 = (X10_TEMP1);

final int X10_TEMP33 = (X10_TEMP293);
final int X10_TEMP296 = (X10_TEMP33);

final int X10_TEMP299 = (X10_TEMP296);
X10_TEMP0.size_t = (X10_TEMP299);
}
public static void Program_RayTracer_JGFinitialise(final RayTracer X10_TEMP0) {
final int[:rank==1] X10_TEMP217 = (int[:rank==1])(X10_TEMP0.datasizes);

final int[:rank==1] X10_TEMP1 = (int[:rank==1])(X10_TEMP217);
final int X10_TEMP220 = (X10_TEMP0.size_t);

final int X10_TEMP3 = (X10_TEMP220);
final int X10_TEMP224 = (X10_TEMP1[X10_TEMP3]);

final int X10_TEMP6 = (X10_TEMP224);
final int X10_TEMP227 = (X10_TEMP6);

final int X10_TEMP7 = (X10_TEMP227);
final int X10_TEMP230 = (X10_TEMP7);

final int X10_TEMP233 = (X10_TEMP230);
X10_TEMP0.width = (X10_TEMP233);
final int[:rank==1] X10_TEMP235 = (int[:rank==1])(X10_TEMP0.datasizes);

final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP235);
final int X10_TEMP238 = (X10_TEMP0.size_t);

final int X10_TEMP10 = (X10_TEMP238);
final int X10_TEMP242 = (X10_TEMP8[X10_TEMP10]);

final int X10_TEMP13 = (X10_TEMP242);
final int X10_TEMP245 = (X10_TEMP13);

final int X10_TEMP14 = (X10_TEMP245);
final int X10_TEMP248 = (X10_TEMP14);

final int X10_TEMP251 = (X10_TEMP248);
X10_TEMP0.height = (X10_TEMP251);
final Scene X10_TEMP254 = (Program0.Program_RayTracer_createScene(X10_TEMP0));

final Scene X10_TEMP17 = (X10_TEMP254);
final Scene X10_TEMP257 = (X10_TEMP17);

final Scene X10_TEMP18 = (X10_TEMP257);
final Scene X10_TEMP260 = (X10_TEMP18);

final Scene X10_TEMP263 = (X10_TEMP260);
X10_TEMP0.scene = (X10_TEMP263);
final Scene X10_TEMP265 = (X10_TEMP0.scene);

final Scene X10_TEMP20 = (X10_TEMP265);
Program0.Program_RayTracer_setScene(X10_TEMP0,X10_TEMP20);
final Scene X10_TEMP270 = (X10_TEMP0.scene);

final Scene X10_TEMP21 = (X10_TEMP270);
final int X10_TEMP274 = (Program0.Program_Scene_getObjects(X10_TEMP21));

final int X10_TEMP24 = (X10_TEMP274);
final int X10_TEMP277 = (X10_TEMP24);

final int X10_TEMP25 = (X10_TEMP277);
final int X10_TEMP280 = (X10_TEMP25);

final int X10_TEMP283 = (X10_TEMP280);
X10_TEMP0.numobjects = (X10_TEMP283);
}
public static void Program_RayTracer_JGFapplication(final RayTracer X10_TEMP0) {
final int X10_TEMP217 = (0);

int X10_TEMP7 = (X10_TEMP217);
final int X10_TEMP220 = (X10_TEMP0.width);

int X10_TEMP8 = (X10_TEMP220);
final int X10_TEMP223 = (X10_TEMP0.height);

int X10_TEMP9 = (X10_TEMP223);
final int X10_TEMP226 = (0);

int X10_TEMP10 = (X10_TEMP226);
final int X10_TEMP229 = (X10_TEMP0.height);

int X10_TEMP11 = (X10_TEMP229);
final int X10_TEMP232 = (1);

int X10_TEMP12 = (X10_TEMP232);
final Interval X10_TEMP241 = (new Interval(X10_TEMP7,X10_TEMP8,X10_TEMP9,X10_TEMP10,X10_TEMP11,X10_TEMP12));

Interval interval = (X10_TEMP241);
Program0.Program_RayTracer_render(X10_TEMP0,interval);
}
public static void Program_RayTracer_JGFvalidate(final RayTracer X10_TEMP0) {
final int X10_TEMP217 = (0);

final int X10_TEMP3 = (X10_TEMP217);
final int X10_TEMP220 = (1);

final int X10_TEMP4 = (X10_TEMP220);
final region(:rank==1) X10_TEMP225 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) X10_TEMP5 = (region(:rank==1))(X10_TEMP225);
final place X10_TEMP228 = (here);

final place X10_TEMP6 = (X10_TEMP228);
final dist(:rank==1) X10_TEMP231 = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP231);
final long[:rank==1] X10_TEMP234 = (long[:rank==1])(new long[d1]);

long[:rank==1] refval = (long[:rank==1])(X10_TEMP234);
final int X10_TEMP237 = (0);

final int X10_TEMP10 = (X10_TEMP237);
final int X10_TEMP240 = (51428);

final long X10_TEMP13 = (X10_TEMP240);
final long X10_TEMP243 = (X10_TEMP13);

final long X10_TEMP14 = (X10_TEMP243);
final long X10_TEMP247 = (X10_TEMP14);

final long X10_TEMP250 = (X10_TEMP247);
refval[X10_TEMP10] = (X10_TEMP250);
final int X10_TEMP252 = (1);

final int X10_TEMP16 = (X10_TEMP252);
final int X10_TEMP255 = (29827635);

final long X10_TEMP19 = (X10_TEMP255);
final long X10_TEMP258 = (X10_TEMP19);

final long X10_TEMP20 = (X10_TEMP258);
final long X10_TEMP262 = (X10_TEMP20);

final long X10_TEMP265 = (X10_TEMP262);
refval[X10_TEMP16] = (X10_TEMP265);
final long X10_TEMP267 = (X10_TEMP0.checksum);

final long X10_TEMP23 = (X10_TEMP267);
final int X10_TEMP270 = (X10_TEMP0.size_t);

final int X10_TEMP22 = (X10_TEMP270);
final long X10_TEMP274 = (refval[X10_TEMP22]);

final long X10_TEMP24 = (X10_TEMP274);
final long X10_TEMP277 = (X10_TEMP23-X10_TEMP24);

long dev = (X10_TEMP277);
final int X10_TEMP280 = (0);

final int X10_TEMP26 = (X10_TEMP280);
final boolean X10_TEMP28 = (dev!=X10_TEMP26);
if (X10_TEMP28) {
final String X10_TEMP285 = ("Validation failed");

final String X10_TEMP30 = (X10_TEMP285);
System.out.println(X10_TEMP30);
final String X10_TEMP289 = ("Pixel checksum = ");

final String X10_TEMP31 = (X10_TEMP289);
final long X10_TEMP292 = (X10_TEMP0.checksum);

final long X10_TEMP32 = (X10_TEMP292);
final String X10_TEMP295 = (X10_TEMP31+X10_TEMP32);

final String X10_TEMP34 = (X10_TEMP295);
System.out.println(X10_TEMP34);
final String X10_TEMP299 = ("Reference value = ");

final String X10_TEMP37 = (X10_TEMP299);
final int X10_TEMP302 = (X10_TEMP0.size_t);

final int X10_TEMP36 = (X10_TEMP302);
final long X10_TEMP306 = (refval[X10_TEMP36]);

final long X10_TEMP38 = (X10_TEMP306);
final String X10_TEMP309 = (X10_TEMP37+X10_TEMP38);

final String X10_TEMP40 = (X10_TEMP309);
System.out.println(X10_TEMP40);
final String X10_TEMP313 = ("Validation failed");

final String X10_TEMP42 = (X10_TEMP313);
throw new RuntimeException(X10_TEMP42);
}
}
public static void Program_RayTracer_JGFtidyup(final RayTracer X10_TEMP0) {
}
public static void Program_RayTracer_run(final RayTracer X10_TEMP0) {
final int X10_TEMP217 = (0);

final int X10_TEMP2 = (X10_TEMP217);
Program0.Program_RayTracer_JGFsetsize(X10_TEMP0,X10_TEMP2);
Program0.Program_RayTracer_JGFinitialise(X10_TEMP0);
Program0.Program_RayTracer_JGFapplication(X10_TEMP0);
Program0.Program_RayTracer_JGFvalidate(X10_TEMP0);
Program0.Program_RayTracer_JGFtidyup(X10_TEMP0);
}
public static Scene Program_RayTracer_createScene(final RayTracer X10_TEMP0) {
final int X10_TEMP217 = (0);

final int x = (X10_TEMP217);
final int X10_TEMP220 = (0);

final int y = (X10_TEMP220);
final int X10_TEMP223 = (20);

int X10_TEMP9 = (X10_TEMP223);
final int X10_TEMP226 = (30);

final int X10_TEMP5 = (X10_TEMP226);
final int X10_TEMP6 = (0);
final int X10_TEMP230 = (X10_TEMP6-X10_TEMP5);

int X10_TEMP10 = (X10_TEMP230);
final boolean X10_TEMP233 = (false);

boolean X10_TEMP11 = (X10_TEMP233);
final Vec X10_TEMP240 = (new Vec(x,X10_TEMP9,X10_TEMP10,X10_TEMP11));

Vec X10_TEMP36 = (X10_TEMP240);
final int X10_TEMP243 = (0);

int X10_TEMP17 = (X10_TEMP243);
final boolean X10_TEMP246 = (false);

boolean X10_TEMP18 = (X10_TEMP246);
final Vec X10_TEMP253 = (new Vec(x,y,X10_TEMP17,X10_TEMP18));

Vec X10_TEMP37 = (X10_TEMP253);
final int X10_TEMP256 = (0);

int X10_TEMP24 = (X10_TEMP256);
final int X10_TEMP259 = (1);

int X10_TEMP25 = (X10_TEMP259);
final int X10_TEMP262 = (0);

int X10_TEMP26 = (X10_TEMP262);
final boolean X10_TEMP265 = (false);

boolean X10_TEMP27 = (X10_TEMP265);
final Vec X10_TEMP272 = (new Vec(X10_TEMP24,X10_TEMP25,X10_TEMP26,X10_TEMP27));

Vec X10_TEMP38 = (X10_TEMP272);
final double X10_TEMP275 = (1.0);

double X10_TEMP39 = (X10_TEMP275);
final double X10_TEMP278 = (35.0);

final double X10_TEMP30 = (X10_TEMP278);
final double X10_TEMP281 = (3.14159265);

final double X10_TEMP31 = (X10_TEMP281);
final double X10_TEMP284 = (X10_TEMP30*X10_TEMP31);

final double X10_TEMP32 = (X10_TEMP284);
final double X10_TEMP287 = (180.0);

final double X10_TEMP33 = (X10_TEMP287);
final double X10_TEMP290 = (X10_TEMP32/X10_TEMP33);

double X10_TEMP40 = (X10_TEMP290);
final double X10_TEMP293 = (1.0);

double X10_TEMP41 = (X10_TEMP293);
final View X10_TEMP302 = (new View(X10_TEMP36,X10_TEMP37,X10_TEMP38,X10_TEMP39,X10_TEMP40,X10_TEMP41));

View X10_TEMP43 = (X10_TEMP302);
final Scene X10_TEMP306 = (new Scene(X10_TEMP43));

Scene scene = (X10_TEMP306);
final int X10_TEMP309 = (4);

final int nx = (X10_TEMP309);
final int X10_TEMP312 = (4);

final int ny = (X10_TEMP312);
final int X10_TEMP315 = (4);

final int nz = (X10_TEMP315);
final int X10_TEMP318 = (0);

final int X10_TEMP51 = (X10_TEMP318);
final int X10_TEMP321 = (1);

final int X10_TEMP49 = (X10_TEMP321);
final int X10_TEMP324 = (nx-X10_TEMP49);

final int X10_TEMP52 = (X10_TEMP324);
final int X10_TEMP327 = (0);

final int X10_TEMP56 = (X10_TEMP327);
final int X10_TEMP330 = (1);

final int X10_TEMP54 = (X10_TEMP330);
final int X10_TEMP333 = (ny-X10_TEMP54);

final int X10_TEMP57 = (X10_TEMP333);
final int X10_TEMP336 = (0);

final int X10_TEMP61 = (X10_TEMP336);
final int X10_TEMP339 = (1);

final int X10_TEMP59 = (X10_TEMP339);
final int X10_TEMP342 = (nz-X10_TEMP59);

final int X10_TEMP62 = (X10_TEMP342);
final region(:rank==3) X10_TEMP351 = (region(:rank==3))([X10_TEMP51:X10_TEMP52,X10_TEMP56:X10_TEMP57,X10_TEMP61:X10_TEMP62]);

final region(:rank==3) reg = (region(:rank==3))(X10_TEMP351);
for(point(:rank==3)[i,j,k]:reg) {
final double X10_TEMP355 = (20.0);

final double X10_TEMP68 = (X10_TEMP355);
final int X10_TEMP358 = (1);

final int X10_TEMP65 = (X10_TEMP358);
final int X10_TEMP361 = (nx-X10_TEMP65);

final int X10_TEMP67 = (X10_TEMP361);
final double X10_TEMP364 = (X10_TEMP68/X10_TEMP67);

final double X10_TEMP69 = (X10_TEMP364);
final double X10_TEMP367 = (X10_TEMP69*i);

final double X10_TEMP70 = (X10_TEMP367);
final double X10_TEMP370 = (10.0);

final double X10_TEMP71 = (X10_TEMP370);
final double X10_TEMP373 = (X10_TEMP70-X10_TEMP71);

double xx = (X10_TEMP373);
final double X10_TEMP376 = (20.0);

final double X10_TEMP76 = (X10_TEMP376);
final int X10_TEMP379 = (1);

final int X10_TEMP73 = (X10_TEMP379);
final int X10_TEMP382 = (ny-X10_TEMP73);

final int X10_TEMP75 = (X10_TEMP382);
final double X10_TEMP385 = (X10_TEMP76/X10_TEMP75);

final double X10_TEMP77 = (X10_TEMP385);
final double X10_TEMP388 = (X10_TEMP77*j);

final double X10_TEMP78 = (X10_TEMP388);
final double X10_TEMP391 = (10.0);

final double X10_TEMP79 = (X10_TEMP391);
final double X10_TEMP394 = (X10_TEMP78-X10_TEMP79);

double yy = (X10_TEMP394);
final double X10_TEMP397 = (20.0);

final double X10_TEMP84 = (X10_TEMP397);
final int X10_TEMP400 = (1);

final int X10_TEMP81 = (X10_TEMP400);
final int X10_TEMP403 = (nz-X10_TEMP81);

final int X10_TEMP83 = (X10_TEMP403);
final double X10_TEMP406 = (X10_TEMP84/X10_TEMP83);

final double X10_TEMP85 = (X10_TEMP406);
final double X10_TEMP409 = (X10_TEMP85*k);

final double X10_TEMP86 = (X10_TEMP409);
final double X10_TEMP412 = (10.0);

final double X10_TEMP87 = (X10_TEMP412);
final double X10_TEMP415 = (X10_TEMP86-X10_TEMP87);

double zz = (X10_TEMP415);
final boolean X10_TEMP418 = (false);

boolean X10_TEMP93 = (X10_TEMP418);
final Vec X10_TEMP425 = (new Vec(xx,yy,zz,X10_TEMP93));

Vec X10_TEMP126 = (X10_TEMP425);
final int X10_TEMP428 = (3);

int X10_TEMP127 = (X10_TEMP428);
final double X10_TEMP431 = (15.0);

double X10_TEMP120 = (X10_TEMP431);
final double X10_TEMP434 = (1.5);

final double X10_TEMP97 = (X10_TEMP434);
final double X10_TEMP437 = (1.0);

final double X10_TEMP98 = (X10_TEMP437);
final double X10_TEMP440 = (X10_TEMP97-X10_TEMP98);

double X10_TEMP121 = (X10_TEMP440);
final double X10_TEMP443 = (1.5);

final double X10_TEMP100 = (X10_TEMP443);
final double X10_TEMP446 = (1.0);

final double X10_TEMP101 = (X10_TEMP446);
final double X10_TEMP449 = (X10_TEMP100-X10_TEMP101);

double X10_TEMP122 = (X10_TEMP449);
final int X10_TEMP452 = (0);

int X10_TEMP114 = (X10_TEMP452);
final int X10_TEMP455 = (0);

int X10_TEMP115 = (X10_TEMP455);
final int X10_TEMP458 = (i+j);

final int X10_TEMP106 = (X10_TEMP458);
final int X10_TEMP461 = (nx+ny);

final int X10_TEMP107 = (X10_TEMP461);
final int X10_TEMP464 = (2);

final int X10_TEMP108 = (X10_TEMP464);
final int X10_TEMP467 = (X10_TEMP107-X10_TEMP108);

final int X10_TEMP110 = (X10_TEMP467);
final double X10_TEMP470 = ((double)X10_TEMP110);

final double X10_TEMP111 = (X10_TEMP470);
final double X10_TEMP473 = (X10_TEMP106/X10_TEMP111);

double X10_TEMP116 = (X10_TEMP473);
final boolean X10_TEMP476 = (false);

boolean X10_TEMP117 = (X10_TEMP476);
final Vec X10_TEMP483 = (new Vec(X10_TEMP114,X10_TEMP115,X10_TEMP116,X10_TEMP117));

Vec X10_TEMP123 = (X10_TEMP483);
final boolean X10_TEMP486 = (false);

boolean X10_TEMP124 = (X10_TEMP486);
final Surface X10_TEMP494 = (new Surface(X10_TEMP120,X10_TEMP121,X10_TEMP122,X10_TEMP123,X10_TEMP124));

Surface X10_TEMP128 = (X10_TEMP494);
final Sphere X10_TEMP500 = (new Sphere(X10_TEMP126,X10_TEMP127,X10_TEMP128));

Sphere p = (X10_TEMP500);
Program0.Program_Scene_addObject(scene,p);
}
final int X10_TEMP505 = (100);

int X10_TEMP137 = (X10_TEMP505);
final int X10_TEMP508 = (100);

int X10_TEMP138 = (X10_TEMP508);
final int X10_TEMP511 = (50);

final int X10_TEMP133 = (X10_TEMP511);
final int X10_TEMP134 = (0);
final int X10_TEMP515 = (X10_TEMP134-X10_TEMP133);

int X10_TEMP139 = (X10_TEMP515);
final double X10_TEMP518 = (1.0);

double X10_TEMP140 = (X10_TEMP518);
final Light X10_TEMP525 = (new Light(X10_TEMP137,X10_TEMP138,X10_TEMP139,X10_TEMP140));

final Light X10_TEMP142 = (X10_TEMP525);
Program0.Program_Scene_addLight(scene,X10_TEMP142);
final int X10_TEMP530 = (100);

final int X10_TEMP143 = (X10_TEMP530);
final int X10_TEMP144 = (0);
final int X10_TEMP534 = (X10_TEMP144-X10_TEMP143);

int X10_TEMP151 = (X10_TEMP534);
final int X10_TEMP537 = (100);

int X10_TEMP152 = (X10_TEMP537);
final int X10_TEMP540 = (50);

final int X10_TEMP147 = (X10_TEMP540);
final int X10_TEMP148 = (0);
final int X10_TEMP544 = (X10_TEMP148-X10_TEMP147);

int X10_TEMP153 = (X10_TEMP544);
final double X10_TEMP547 = (1.0);

double X10_TEMP154 = (X10_TEMP547);
final Light X10_TEMP554 = (new Light(X10_TEMP151,X10_TEMP152,X10_TEMP153,X10_TEMP154));

final Light X10_TEMP156 = (X10_TEMP554);
Program0.Program_Scene_addLight(scene,X10_TEMP156);
final int X10_TEMP559 = (100);

int X10_TEMP165 = (X10_TEMP559);
final int X10_TEMP562 = (100);

final int X10_TEMP158 = (X10_TEMP562);
final int X10_TEMP159 = (0);
final int X10_TEMP566 = (X10_TEMP159-X10_TEMP158);

int X10_TEMP166 = (X10_TEMP566);
final int X10_TEMP569 = (50);

final int X10_TEMP161 = (X10_TEMP569);
final int X10_TEMP162 = (0);
final int X10_TEMP573 = (X10_TEMP162-X10_TEMP161);

int X10_TEMP167 = (X10_TEMP573);
final double X10_TEMP576 = (1.0);

double X10_TEMP168 = (X10_TEMP576);
final Light X10_TEMP583 = (new Light(X10_TEMP165,X10_TEMP166,X10_TEMP167,X10_TEMP168));

final Light X10_TEMP170 = (X10_TEMP583);
Program0.Program_Scene_addLight(scene,X10_TEMP170);
final int X10_TEMP588 = (100);

final int X10_TEMP171 = (X10_TEMP588);
final int X10_TEMP172 = (0);
final int X10_TEMP592 = (X10_TEMP172-X10_TEMP171);

int X10_TEMP181 = (X10_TEMP592);
final int X10_TEMP595 = (100);

final int X10_TEMP174 = (X10_TEMP595);
final int X10_TEMP175 = (0);
final int X10_TEMP599 = (X10_TEMP175-X10_TEMP174);

int X10_TEMP182 = (X10_TEMP599);
final int X10_TEMP602 = (50);

final int X10_TEMP177 = (X10_TEMP602);
final int X10_TEMP178 = (0);
final int X10_TEMP606 = (X10_TEMP178-X10_TEMP177);

int X10_TEMP183 = (X10_TEMP606);
final double X10_TEMP609 = (1.0);

double X10_TEMP184 = (X10_TEMP609);
final Light X10_TEMP616 = (new Light(X10_TEMP181,X10_TEMP182,X10_TEMP183,X10_TEMP184));

final Light X10_TEMP186 = (X10_TEMP616);
Program0.Program_Scene_addLight(scene,X10_TEMP186);
final int X10_TEMP621 = (200);

int X10_TEMP191 = (X10_TEMP621);
final int X10_TEMP624 = (200);

int X10_TEMP192 = (X10_TEMP624);
final int X10_TEMP627 = (0);

int X10_TEMP193 = (X10_TEMP627);
final double X10_TEMP630 = (1.0);

double X10_TEMP194 = (X10_TEMP630);
final Light X10_TEMP637 = (new Light(X10_TEMP191,X10_TEMP192,X10_TEMP193,X10_TEMP194));

final Light X10_TEMP196 = (X10_TEMP637);
Program0.Program_Scene_addLight(scene,X10_TEMP196);
return scene;
}
public static void Program_RayTracer_setScene(final RayTracer X10_TEMP0, final Scene scene) {
Scene X10_TEMP1 = (scene);
final int X10_TEMP219 = (Program0.Program_Scene_getLights(X10_TEMP1));

final int X10_TEMP4 = (X10_TEMP219);
final int X10_TEMP222 = (X10_TEMP4);

final int X10_TEMP5 = (X10_TEMP222);
final int X10_TEMP225 = (X10_TEMP5);

final int X10_TEMP228 = (X10_TEMP225);
X10_TEMP0.lightCount = (X10_TEMP228);
final int X10_TEMP231 = (Program0.Program_Scene_getObjects(X10_TEMP1));

final int X10_TEMP8 = (X10_TEMP231);
final int X10_TEMP234 = (X10_TEMP8);

final int X10_TEMP9 = (X10_TEMP234);
final int X10_TEMP237 = (X10_TEMP9);

final int X10_TEMP240 = (X10_TEMP237);
X10_TEMP0.objCount = (X10_TEMP240);
final Scene X10_TEMP242 = (X10_TEMP1);

final Scene sc = (X10_TEMP242);
final dist(:rank==1) X10_TEMP245 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(X10_TEMP245);
final dist(:rank==1) X10_TEMP248 = (dist(:rank==1))(X10_TEMP11);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP248);
final int X10_TEMP251 = (X10_TEMP0.lightCount);

final int mylightCount = (X10_TEMP251);
final int X10_TEMP254 = (X10_TEMP0.objCount);

final int myobjCount = (X10_TEMP254);
finish {
for(point(:rank==1)X10_TEMP17[pl]:U) {
final dist(:rank==1) X10_TEMP258 = (dist(:rank==1))(U.distribution);

final dist(:rank==1) X10_TEMP16 = (dist(:rank==1))(X10_TEMP258);
final place X10_TEMP18 = (X10_TEMP16.get(X10_TEMP17));
async(X10_TEMP18) {
final place X10_TEMP264 = (here);

final place pHere = (X10_TEMP264);
final int X10_TEMP267 = (0);

final int X10_TEMP23 = (X10_TEMP267);
final int X10_TEMP270 = (1);

final int X10_TEMP21 = (X10_TEMP270);
final int X10_TEMP273 = (mylightCount-X10_TEMP21);

final int X10_TEMP24 = (X10_TEMP273);
final region(:rank==1) X10_TEMP278 = (region(:rank==1))([X10_TEMP23:X10_TEMP24]);

region(:rank==1) d1 = (region(:rank==1))(X10_TEMP278);
final int X10_TEMP281 = (0);

final int X10_TEMP29 = (X10_TEMP281);
final int X10_TEMP284 = (1);

final int X10_TEMP27 = (X10_TEMP284);
final int X10_TEMP287 = (myobjCount-X10_TEMP27);

final int X10_TEMP30 = (X10_TEMP287);
final region(:rank==1) X10_TEMP292 = (region(:rank==1))([X10_TEMP29:X10_TEMP30]);

region(:rank==1) d2 = (region(:rank==1))(X10_TEMP292);
final Light value[:rank==1] X10_TEMP340 = (Light value[:rank==1])(new Light value[d1](point(:rank==1)[l]) {
final int X10_TEMP295 = (0);

final int X10_TEMP34 = (X10_TEMP295);
final int X10_TEMP298 = (0);

final int X10_TEMP35 = (X10_TEMP298);
final region(:rank==1) X10_TEMP303 = (region(:rank==1))([X10_TEMP34:X10_TEMP35]);

final region(:rank==1) X10_TEMP36 = (region(:rank==1))(X10_TEMP303);
final dist(:rank==1) X10_TEMP306 = (dist(:rank==1))(X10_TEMP36->pHere);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP306);
final Light[:rank==1&&distribution==dTemp] X10_TEMP309 = (Light[:rank==1&&distribution==dTemp])(new Light[dTemp]);

final Light[:rank==1] temp = (Light[:rank==1])(X10_TEMP309);
finish {
final place X10_TEMP40 = (place.FIRST_PLACE);
async(X10_TEMP40) {
final Light X10_TEMP316 = (Program0.Program_Scene_getLight(sc,l));

final Light tempLight = (X10_TEMP316);
async(pHere) {
final int X10_TEMP320 = (0);

final int X10_TEMP45 = (X10_TEMP320);
final Light X10_TEMP323 = (tempLight);

final Light X10_TEMP48 = (X10_TEMP323);
final Light X10_TEMP327 = (X10_TEMP48);

final Light X10_TEMP330 = (X10_TEMP327);
temp[X10_TEMP45] = (X10_TEMP330);
}
}
}
final int X10_TEMP332 = (0);

final int X10_TEMP50 = (X10_TEMP332);
final Light X10_TEMP336 = (temp[X10_TEMP50]);

final Light X10_TEMP52 = (X10_TEMP336);
return X10_TEMP52;
}

);

final Light value[:rank==1] X10_TEMP53 = (Light value[:rank==1])(X10_TEMP340);
final Light value[:rank==1] X10_TEMP343 = (Light value[:rank==1])(X10_TEMP53);

final Light value[:rank==1] templights = (Light value[:rank==1])(X10_TEMP343);
finish {
final place X10_TEMP56 = (place.FIRST_PLACE);
async(X10_TEMP56) {
final Light value[:rank==1] X10_TEMP348 = (Light value[:rank==1])(templights);

final Light value[:rank==1] X10_TEMP59 = (Light value[:rank==1])(X10_TEMP348);
final Light value[:rank==1] X10_TEMP351 = (Light value[:rank==1])(X10_TEMP59);

final Light value[:rank==1] X10_TEMP354 = (Light value[:rank==1])(X10_TEMP351);
X10_TEMP0.lights = (X10_TEMP354);
}
}
final Sphere value[:rank==1] X10_TEMP401 = (Sphere value[:rank==1])(new Sphere value[d2](point(:rank==1)[o]) {
final int X10_TEMP356 = (0);

final int X10_TEMP62 = (X10_TEMP356);
final int X10_TEMP359 = (0);

final int X10_TEMP63 = (X10_TEMP359);
final region(:rank==1) X10_TEMP364 = (region(:rank==1))([X10_TEMP62:X10_TEMP63]);

final region(:rank==1) X10_TEMP64 = (region(:rank==1))(X10_TEMP364);
final dist(:rank==1) X10_TEMP367 = (dist(:rank==1))(X10_TEMP64->pHere);

final dist(:rank==1) dTemp1 = (dist(:rank==1))(X10_TEMP367);
final Sphere[:rank==1&&distribution==dTemp1] X10_TEMP370 = (Sphere[:rank==1&&distribution==dTemp1])(new Sphere[dTemp1]);

final Sphere[:rank==1] temp1 = (Sphere[:rank==1])(X10_TEMP370);
finish {
final place X10_TEMP68 = (place.FIRST_PLACE);
async(X10_TEMP68) {
final Sphere X10_TEMP377 = (Program0.Program_Scene_getObject(sc,o));

final Sphere tempObject = (X10_TEMP377);
async(pHere) {
final int X10_TEMP381 = (0);

final int X10_TEMP73 = (X10_TEMP381);
final Sphere X10_TEMP384 = (tempObject);

final Sphere X10_TEMP76 = (X10_TEMP384);
final Sphere X10_TEMP388 = (X10_TEMP76);

final Sphere X10_TEMP391 = (X10_TEMP388);
temp1[X10_TEMP73] = (X10_TEMP391);
}
}
}
final int X10_TEMP393 = (0);

final int X10_TEMP78 = (X10_TEMP393);
final Sphere X10_TEMP397 = (temp1[X10_TEMP78]);

final Sphere X10_TEMP80 = (X10_TEMP397);
return X10_TEMP80;
}

);

final Sphere value[:rank==1] X10_TEMP81 = (Sphere value[:rank==1])(X10_TEMP401);
final Sphere value[:rank==1] X10_TEMP404 = (Sphere value[:rank==1])(X10_TEMP81);

final Sphere value[:rank==1] tempprim = (Sphere value[:rank==1])(X10_TEMP404);
finish {
final place X10_TEMP84 = (place.FIRST_PLACE);
async(X10_TEMP84) {
final Sphere value[:rank==1] X10_TEMP409 = (Sphere value[:rank==1])(tempprim);

final Sphere value[:rank==1] X10_TEMP87 = (Sphere value[:rank==1])(X10_TEMP409);
final Sphere value[:rank==1] X10_TEMP412 = (Sphere value[:rank==1])(X10_TEMP87);

final Sphere value[:rank==1] X10_TEMP415 = (Sphere value[:rank==1])(X10_TEMP412);
X10_TEMP0.prim = (X10_TEMP415);
}
}
}
}
}
final View X10_TEMP418 = (Program0.Program_Scene_getView(X10_TEMP1));

final View X10_TEMP90 = (X10_TEMP418);
final View X10_TEMP421 = (X10_TEMP90);

final View X10_TEMP91 = (X10_TEMP421);
final View X10_TEMP424 = (X10_TEMP91);

final View X10_TEMP427 = (X10_TEMP424);
X10_TEMP0.view = (X10_TEMP427);
}
public static void Program_RayTracer_render(final RayTracer X10_TEMP0, final Interval interval) {
final int X10_TEMP217 = (0);

final int X10_TEMP11 = (X10_TEMP217);
final int X10_TEMP220 = (interval.width);

final int X10_TEMP6 = (X10_TEMP220);
final int X10_TEMP223 = (interval.yto);

final int X10_TEMP2 = (X10_TEMP223);
final int X10_TEMP226 = (interval.yfrom);

final int X10_TEMP3 = (X10_TEMP226);
final int X10_TEMP229 = (X10_TEMP2-X10_TEMP3);

final int X10_TEMP5 = (X10_TEMP229);
final int X10_TEMP232 = (X10_TEMP6*X10_TEMP5);

final int X10_TEMP8 = (X10_TEMP232);
final int X10_TEMP235 = (1);

final int X10_TEMP9 = (X10_TEMP235);
final int X10_TEMP238 = (X10_TEMP8-X10_TEMP9);

final int X10_TEMP12 = (X10_TEMP238);
final region(:rank==1) X10_TEMP243 = (region(:rank==1))([X10_TEMP11:X10_TEMP12]);

final region(:rank==1) R = (region(:rank==1))(X10_TEMP243);
final dist(:rank==1) X10_TEMP247 = (dist(:rank==1))(dist.factory.block(R));

final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(X10_TEMP247);
final dist(:rank==1) X10_TEMP250 = (dist(:rank==1))(X10_TEMP15);

final dist(:rank==1) DBlock = (dist(:rank==1))(X10_TEMP250);
final dist(:rank==1) X10_TEMP253 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP17 = (dist(:rank==1))(X10_TEMP253);
final dist(:rank==1) X10_TEMP256 = (dist(:rank==1))(X10_TEMP17);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP256);
final int[:rank==1&&distribution==DBlock] X10_TEMP259 = (int[:rank==1&&distribution==DBlock])(new int[DBlock]);

final int[:rank==1] row = (int[:rank==1])(X10_TEMP259);
final region(:rank==1) X10_TEMP262 = (region(:rank==1))(U.region);

final region(:rank==1) chkSumReg = (region(:rank==1))(X10_TEMP262);
final place X10_TEMP265 = (here);

final place pHere = (X10_TEMP265);
final place X10_TEMP268 = (place.FIRST_PLACE);

final place fp = (X10_TEMP268);
final dist(:rank==1) X10_TEMP271 = (dist(:rank==1))(chkSumReg->fp);

final dist(:rank==1) chkSumDist = (dist(:rank==1))(X10_TEMP271);
final long[:rank==1&&distribution==chkSumDist] X10_TEMP274 = (long[:rank==1&&distribution==chkSumDist])(new long[chkSumDist]);

final long[:rank==1] X10_TEMP26 = (long[:rank==1])(X10_TEMP274);
final long[:rank==1] X10_TEMP277 = (long[:rank==1])(X10_TEMP26);

final long[:rank==1] X10_TEMP27 = (long[:rank==1])(X10_TEMP277);
final long[:rank==1] X10_TEMP280 = (long[:rank==1])(X10_TEMP27);

final long[:rank==1] X10_TEMP283 = (long[:rank==1])(X10_TEMP280);
X10_TEMP0.checkSumArray = (X10_TEMP283);
final View X10_TEMP285 = (X10_TEMP0.view);

final View myview = (X10_TEMP285);
finish {
for(point(:rank==1)X10_TEMP31[pl]:U) {
final dist(:rank==1) X10_TEMP289 = (dist(:rank==1))(U.distribution);

final dist(:rank==1) X10_TEMP30 = (dist(:rank==1))(X10_TEMP289);
final place X10_TEMP32 = (X10_TEMP30.get(X10_TEMP31));
async(X10_TEMP32) {
final place X10_TEMP295 = (here);

final place X10_TEMP33 = (X10_TEMP295);
final dist(:rank==1) X10_TEMP298 = (dist(:rank==1))(DBlock|X10_TEMP33);

final dist(:rank==1) my_dist = (dist(:rank==1))(X10_TEMP298);
final int X10_TEMP301 = (0);

long checksum1 = (X10_TEMP301);
final double X10_TEMP304 = (myview.distance);

final double X10_TEMP44 = (X10_TEMP304);
final double X10_TEMP307 = (myview.angle);

final double X10_TEMP37 = (X10_TEMP307);
final double X10_TEMP311 = (Math.sin(X10_TEMP37));

final double X10_TEMP40 = (X10_TEMP311);
final double X10_TEMP314 = (myview.angle);

final double X10_TEMP39 = (X10_TEMP314);
final double X10_TEMP318 = (Math.cos(X10_TEMP39));

final double X10_TEMP41 = (X10_TEMP318);
final double X10_TEMP321 = (X10_TEMP40/X10_TEMP41);

final double X10_TEMP43 = (X10_TEMP321);
final double X10_TEMP324 = (X10_TEMP44*X10_TEMP43);

double frustrumwidth = (X10_TEMP324);
final Vec X10_TEMP327 = (myview.at);

final Vec X10_TEMP48 = (X10_TEMP327);
final Vec X10_TEMP330 = (myview.from);

final Vec X10_TEMP49 = (X10_TEMP330);
final Vec X10_TEMP335 = (Program0.Program_Vec_sub(X10_TEMP48,X10_TEMP49));

final Vec X10_TEMP50 = (X10_TEMP335);
final Vec X10_TEMP339 = (Program0.Program_Vec_normalized(X10_TEMP50));

Vec viewVec = (X10_TEMP339);
final boolean X10_TEMP342 = (false);

boolean X10_TEMP54 = (X10_TEMP342);
final Vec X10_TEMP347 = (new Vec(viewVec,X10_TEMP54));

final Vec X10_TEMP55 = (X10_TEMP347);
final Vec X10_TEMP350 = (myview.up);

final Vec X10_TEMP58 = (X10_TEMP350);
final double X10_TEMP355 = (Program0.Program_Vec_dot(X10_TEMP58,viewVec));

final double X10_TEMP60 = (X10_TEMP355);
final Vec X10_TEMP360 = (Program0.Program_Vec_scale(X10_TEMP55,X10_TEMP60));

Vec tmpVec = (X10_TEMP360);
final Vec X10_TEMP363 = (myview.up);

final Vec X10_TEMP64 = (X10_TEMP363);
final Vec X10_TEMP368 = (Program0.Program_Vec_sub(X10_TEMP64,tmpVec));

final Vec X10_TEMP65 = (X10_TEMP368);
final Vec X10_TEMP372 = (Program0.Program_Vec_normalized(X10_TEMP65));

final Vec X10_TEMP66 = (X10_TEMP372);
final int X10_TEMP67 = (0);
final double X10_TEMP376 = (X10_TEMP67-frustrumwidth);

final double X10_TEMP69 = (X10_TEMP376);
final Vec X10_TEMP381 = (Program0.Program_Vec_scale(X10_TEMP66,X10_TEMP69));

Vec upVec = (X10_TEMP381);
final Vec X10_TEMP384 = (myview.up);

final Vec X10_TEMP73 = (X10_TEMP384);
final Vec X10_TEMP389 = (Program0.Program_Vec_cross(X10_TEMP73,viewVec));

final Vec X10_TEMP74 = (X10_TEMP389);
final Vec X10_TEMP393 = (Program0.Program_Vec_normalized(X10_TEMP74));

final Vec X10_TEMP75 = (X10_TEMP393);
final double X10_TEMP396 = (myview.aspect);

final double X10_TEMP76 = (X10_TEMP396);
final double X10_TEMP399 = (X10_TEMP76*frustrumwidth);

final double X10_TEMP78 = (X10_TEMP399);
final Vec X10_TEMP404 = (Program0.Program_Vec_scale(X10_TEMP75,X10_TEMP78));

Vec leftVec = (X10_TEMP404);
final Vec X10_TEMP407 = (myview.from);

Vec X10_TEMP82 = (X10_TEMP407);
final Ray X10_TEMP412 = (new Ray(X10_TEMP82,_Program__RayTracer_voidVec));

Ray r = (X10_TEMP412);
final region(:rank==1) X10_TEMP415 = (region(:rank==1))(my_dist.region);

final region(:rank==1) X10_TEMP85 = (region(:rank==1))(X10_TEMP415);
for(point(:rank==1)[pixCounter]:X10_TEMP85) {
final int X10_TEMP419 = (interval.width);

final int X10_TEMP86 = (X10_TEMP419);
final int X10_TEMP422 = (pixCounter/X10_TEMP86);

int y = (X10_TEMP422);
final int X10_TEMP425 = (interval.width);

final int X10_TEMP88 = (X10_TEMP425);
final int X10_TEMP428 = (pixCounter%X10_TEMP88);

int x = (X10_TEMP428);
final double X10_TEMP431 = (2.0);

final double X10_TEMP90 = (X10_TEMP431);
final double X10_TEMP434 = (X10_TEMP90*y);

final double X10_TEMP92 = (X10_TEMP434);
final double X10_TEMP437 = ((double)X10_TEMP92);

final double X10_TEMP94 = (X10_TEMP437);
final int X10_TEMP440 = (interval.width);

final int X10_TEMP93 = (X10_TEMP440);
final double X10_TEMP443 = ((double)X10_TEMP93);

final double X10_TEMP95 = (X10_TEMP443);
final double X10_TEMP446 = (X10_TEMP94/X10_TEMP95);

final double X10_TEMP96 = (X10_TEMP446);
final double X10_TEMP449 = (1.0);

final double X10_TEMP97 = (X10_TEMP449);
final double X10_TEMP452 = (X10_TEMP96-X10_TEMP97);

double ylen = (X10_TEMP452);
final double X10_TEMP455 = (2.0);

final double X10_TEMP99 = (X10_TEMP455);
final double X10_TEMP458 = (X10_TEMP99*x);

final double X10_TEMP101 = (X10_TEMP458);
final double X10_TEMP461 = ((double)X10_TEMP101);

final double X10_TEMP103 = (X10_TEMP461);
final int X10_TEMP464 = (interval.width);

final int X10_TEMP102 = (X10_TEMP464);
final double X10_TEMP467 = ((double)X10_TEMP102);

final double X10_TEMP104 = (X10_TEMP467);
final double X10_TEMP470 = (X10_TEMP103/X10_TEMP104);

final double X10_TEMP105 = (X10_TEMP470);
final double X10_TEMP473 = (1.0);

final double X10_TEMP106 = (X10_TEMP473);
final double X10_TEMP476 = (X10_TEMP105-X10_TEMP106);

double xlen = (X10_TEMP476);
final Vec X10_TEMP483 = (Program0.Program_Vec_comb(xlen,leftVec,ylen,upVec));

final Vec X10_TEMP112 = (X10_TEMP483);
final Vec X10_TEMP488 = (Program0.Program_Vec_added(X10_TEMP112,viewVec));

final Vec X10_TEMP114 = (X10_TEMP488);
final Vec X10_TEMP492 = (Program0.Program_Vec_normalized(X10_TEMP114));

final Vec X10_TEMP116 = (X10_TEMP492);
final Ray X10_TEMP497 = (Program0.Program_Ray_d(r,X10_TEMP116));

final Ray X10_TEMP118 = (X10_TEMP497);
final Ray X10_TEMP500 = (X10_TEMP118);

r = (X10_TEMP500);
final int X10_TEMP503 = (0);

final int X10_TEMP124 = (X10_TEMP503);
final double X10_TEMP506 = (1.0);

final double X10_TEMP125 = (X10_TEMP506);
final Isect X10_TEMP509 = (new Isect());

final Isect X10_TEMP126 = (X10_TEMP509);
final Ray X10_TEMP512 = (new Ray());

final Ray X10_TEMP127 = (X10_TEMP512);
final Vec X10_TEMP521 = (Program0.Program_RayTracer_trace(X10_TEMP0,X10_TEMP124,X10_TEMP125,r,X10_TEMP126,X10_TEMP127));

Vec col = (X10_TEMP521);
final double X10_TEMP524 = (col.x);

final double X10_TEMP129 = (X10_TEMP524);
final double X10_TEMP527 = (255.0);

final double X10_TEMP130 = (X10_TEMP527);
final double X10_TEMP530 = (X10_TEMP129*X10_TEMP130);

final double X10_TEMP132 = (X10_TEMP530);
final int X10_TEMP533 = ((int)X10_TEMP132);

int red = (X10_TEMP533);
final int X10_TEMP536 = (255);

final int X10_TEMP134 = (X10_TEMP536);
final boolean X10_TEMP136 = (red>X10_TEMP134);
if (X10_TEMP136) {
final int X10_TEMP541 = (255);

final int X10_TEMP138 = (X10_TEMP541);
final int X10_TEMP544 = (X10_TEMP138);

red = (X10_TEMP544);
}
final double X10_TEMP547 = (col.y);

final double X10_TEMP139 = (X10_TEMP547);
final double X10_TEMP550 = (255.0);

final double X10_TEMP140 = (X10_TEMP550);
final double X10_TEMP553 = (X10_TEMP139*X10_TEMP140);

final double X10_TEMP142 = (X10_TEMP553);
final int X10_TEMP556 = ((int)X10_TEMP142);

int green = (X10_TEMP556);
final int X10_TEMP559 = (255);

final int X10_TEMP144 = (X10_TEMP559);
final boolean X10_TEMP146 = (green>X10_TEMP144);
if (X10_TEMP146) {
final int X10_TEMP564 = (255);

final int X10_TEMP148 = (X10_TEMP564);
final int X10_TEMP567 = (X10_TEMP148);

green = (X10_TEMP567);
}
final double X10_TEMP570 = (col.z);

final double X10_TEMP149 = (X10_TEMP570);
final double X10_TEMP573 = (255.0);

final double X10_TEMP150 = (X10_TEMP573);
final double X10_TEMP576 = (X10_TEMP149*X10_TEMP150);

final double X10_TEMP152 = (X10_TEMP576);
final int X10_TEMP579 = ((int)X10_TEMP152);

int blue = (X10_TEMP579);
final int X10_TEMP582 = (255);

final int X10_TEMP154 = (X10_TEMP582);
final boolean X10_TEMP156 = (blue>X10_TEMP154);
if (X10_TEMP156) {
final int X10_TEMP587 = (255);

final int X10_TEMP158 = (X10_TEMP587);
final int X10_TEMP590 = (X10_TEMP158);

blue = (X10_TEMP590);
}
final int X10_TEMP593 = (red+green);

final int X10_TEMP159 = (X10_TEMP593);
final int X10_TEMP596 = (X10_TEMP159+blue);

final long X10_TEMP161 = (X10_TEMP596);
final long X10_TEMP599 = (checksum1+X10_TEMP161);

checksum1 = (X10_TEMP599);
}
final long X10_TEMP602 = (checksum1);

final long checksumx = (X10_TEMP602);
finish {
async(fp) {
final long[:rank==1] X10_TEMP606 = (long[:rank==1])(X10_TEMP0.checkSumArray);

final long[:rank==1] X10_TEMP164 = (long[:rank==1])(X10_TEMP606);
final long X10_TEMP609 = (checksumx);

final long X10_TEMP168 = (X10_TEMP609);
final long X10_TEMP613 = (X10_TEMP168);

final long X10_TEMP616 = (X10_TEMP613);
X10_TEMP164[pl] = (X10_TEMP616);
}
}
}
}
}
final long[:rank==1] X10_TEMP618 = (long[:rank==1])(X10_TEMP0.checkSumArray);

final long[:rank==1] X10_TEMP169 = (long[:rank==1])(X10_TEMP618);
final dist(:rank==1) X10_TEMP621 = (dist(:rank==1))(X10_TEMP169.distribution);

final dist(:rank==1) X10_TEMP170 = (dist(:rank==1))(X10_TEMP621);
final region(:rank==1) X10_TEMP624 = (region(:rank==1))(X10_TEMP170.region);

final region(:rank==1) regSum = (region(:rank==1))(X10_TEMP624);
for(point(:rank==1)[i]:chkSumReg) {
final long[:rank==1] X10_TEMP628 = (long[:rank==1])(X10_TEMP0.checkSumArray);

final long[:rank==1] X10_TEMP173 = (long[:rank==1])(X10_TEMP628);
final long X10_TEMP631 = (X10_TEMP0.checksum);

final long X10_TEMP176 = (X10_TEMP631);
final long X10_TEMP635 = (X10_TEMP173[i]);

final long X10_TEMP177 = (X10_TEMP635);
final long X10_TEMP638 = (X10_TEMP176+X10_TEMP177);

final long X10_TEMP178 = (X10_TEMP638);
final long X10_TEMP641 = (X10_TEMP178);

final long X10_TEMP644 = (X10_TEMP641);
X10_TEMP0.checksum = (X10_TEMP644);
}
}
public static boolean Program_RayTracer_intersect(final RayTracer X10_TEMP0, final Ray r, final double maxt, final Isect inter) {
Ray X10_TEMP1 = (r);
double X10_TEMP2 = (maxt);
Isect X10_TEMP3 = (inter);
final int X10_TEMP220 = (0);

int nhits = (X10_TEMP220);
final double X10_TEMP223 = (1e9);

final double X10_TEMP7 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP7);

final double X10_TEMP8 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP8);

final double X10_TEMP232 = (X10_TEMP229);
X10_TEMP3.t = (X10_TEMP232);
final place X10_TEMP234 = (here);

final place h = (X10_TEMP234);
final int X10_TEMP237 = (0);

final int X10_TEMP12 = (X10_TEMP237);
final int X10_TEMP240 = (0);

final int X10_TEMP13 = (X10_TEMP240);
final region(:rank==1) X10_TEMP245 = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);

final region(:rank==1) X10_TEMP14 = (region(:rank==1))(X10_TEMP245);
final place X10_TEMP248 = (here);

final place X10_TEMP15 = (X10_TEMP248);
final dist(:rank==1) X10_TEMP251 = (dist(:rank==1))(X10_TEMP14->X10_TEMP15);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP251);
final Envelope[:rank==1&&distribution==dTemp] X10_TEMP254 = (Envelope[:rank==1&&distribution==dTemp])(new Envelope[dTemp]);

final Envelope[:rank==1] temp = (Envelope[:rank==1])(X10_TEMP254);
finish {
final place X10_TEMP19 = (place.FIRST_PLACE);
async(X10_TEMP19) {
final int X10_TEMP259 = (X10_TEMP0.objCount);

final int tempobjCount = (X10_TEMP259);
final Sphere value[:rank==1] X10_TEMP262 = (Sphere value[:rank==1])(X10_TEMP0.prim);

final Sphere value[:rank==1] tempprim = (Sphere value[:rank==1])(X10_TEMP262);
async(h) {
final int X10_TEMP266 = (0);

final int X10_TEMP24 = (X10_TEMP266);
final Envelope X10_TEMP271 = (new Envelope(tempobjCount,tempprim));

final Envelope X10_TEMP29 = (X10_TEMP271);
final Envelope X10_TEMP274 = (X10_TEMP29);

final Envelope X10_TEMP30 = (X10_TEMP274);
final Envelope X10_TEMP278 = (X10_TEMP30);

final Envelope X10_TEMP281 = (X10_TEMP278);
temp[X10_TEMP24] = (X10_TEMP281);
}
}
}
final int X10_TEMP283 = (0);

final int X10_TEMP32 = (X10_TEMP283);
final Envelope X10_TEMP287 = (temp[X10_TEMP32]);

final Envelope X10_TEMP33 = (X10_TEMP287);
final int X10_TEMP290 = (X10_TEMP33.i);

final int myobjCount = (X10_TEMP290);
final int X10_TEMP293 = (0);

final int X10_TEMP36 = (X10_TEMP293);
final Envelope X10_TEMP297 = (temp[X10_TEMP36]);

final Envelope X10_TEMP37 = (X10_TEMP297);
final Sphere value[:rank==1] X10_TEMP300 = (Sphere value[:rank==1])(X10_TEMP37.a);

final Sphere value[:rank==1] X10_TEMP39 = (Sphere value[:rank==1])(X10_TEMP300);
final Sphere value[:rank==1] X10_TEMP303 = (Sphere value[:rank==1])(X10_TEMP39);

final Sphere value[:rank==1] myprim = (Sphere value[:rank==1])(X10_TEMP303);
final int X10_TEMP306 = (0);

final int X10_TEMP44 = (X10_TEMP306);
final int X10_TEMP309 = (1);

final int X10_TEMP42 = (X10_TEMP309);
final int X10_TEMP312 = (myobjCount-X10_TEMP42);

final int X10_TEMP45 = (X10_TEMP312);
final region(:rank==1) X10_TEMP317 = (region(:rank==1))([X10_TEMP44:X10_TEMP45]);

final region(:rank==1) X10_TEMP47 = (region(:rank==1))(X10_TEMP317);
for(point(:rank==1)[i]:X10_TEMP47) {
final Sphere X10_TEMP322 = (myprim[i]);

final Sphere X10_TEMP49 = (X10_TEMP322);
final Isect X10_TEMP327 = (Program0.Program_Sphere_intersect(X10_TEMP49,X10_TEMP1));

Isect tp = (X10_TEMP327);
final boolean X10_TEMP330 = (tp.isNull);

final boolean X10_TEMP52 = (X10_TEMP330);
final boolean X10_TEMP333 = (!X10_TEMP52);

final boolean X10_TEMP55 = (X10_TEMP333);
final double X10_TEMP336 = (tp.t);

final double X10_TEMP53 = (X10_TEMP336);
final double X10_TEMP339 = (X10_TEMP3.t);

final double X10_TEMP54 = (X10_TEMP339);
final boolean X10_TEMP342 = (X10_TEMP53<X10_TEMP54);

final boolean X10_TEMP56 = (X10_TEMP342);
final boolean X10_TEMP58 = (X10_TEMP55&&X10_TEMP56);
if (X10_TEMP58) {
final double X10_TEMP347 = (tp.t);

final double X10_TEMP61 = (X10_TEMP347);
final double X10_TEMP350 = (X10_TEMP61);

final double X10_TEMP62 = (X10_TEMP350);
final double X10_TEMP353 = (X10_TEMP62);

final double X10_TEMP356 = (X10_TEMP353);
X10_TEMP3.t = (X10_TEMP356);
final Sphere X10_TEMP358 = (tp.prim);

final Sphere X10_TEMP65 = (X10_TEMP358);
final Sphere X10_TEMP361 = (X10_TEMP65);

final Sphere X10_TEMP66 = (X10_TEMP361);
final Sphere X10_TEMP364 = (X10_TEMP66);

final Sphere X10_TEMP367 = (X10_TEMP364);
X10_TEMP3.prim = (X10_TEMP367);
final Surface X10_TEMP369 = (tp.surf);

final Surface X10_TEMP69 = (X10_TEMP369);
final Surface X10_TEMP372 = (X10_TEMP69);

final Surface X10_TEMP70 = (X10_TEMP372);
final Surface X10_TEMP375 = (X10_TEMP70);

final Surface X10_TEMP378 = (X10_TEMP375);
X10_TEMP3.surf = (X10_TEMP378);
final int X10_TEMP380 = (tp.enter);

final int X10_TEMP73 = (X10_TEMP380);
final int X10_TEMP383 = (X10_TEMP73);

final int X10_TEMP74 = (X10_TEMP383);
final int X10_TEMP386 = (X10_TEMP74);

final int X10_TEMP389 = (X10_TEMP386);
X10_TEMP3.enter = (X10_TEMP389);
final int X10_TEMP391 = (nhits);

final int X10_TEMP75 = (X10_TEMP391);
final int X10_TEMP76 = (1);
final int X10_TEMP395 = (nhits+X10_TEMP76);
nhits = (X10_TEMP395);
}
}
final int X10_TEMP397 = (0);

final int X10_TEMP77 = (X10_TEMP397);
final boolean X10_TEMP78 = (nhits>X10_TEMP77);
boolean X10_TEMP81 = (false);
if (X10_TEMP78) {
final boolean X10_TEMP403 = (true);
X10_TEMP81 = (X10_TEMP403);
}
final boolean X10_TEMP82 = (X10_TEMP81);
return X10_TEMP82;
}
public static int Program_RayTracer_Shadow(final RayTracer X10_TEMP0, final Ray r, final double tmax, final Isect inter) {
Ray X10_TEMP1 = (r);
double X10_TEMP2 = (tmax);
Isect X10_TEMP3 = (inter);
final boolean X10_TEMP8 = (Program0.Program_RayTracer_intersect(X10_TEMP0,X10_TEMP1,X10_TEMP2,X10_TEMP3));
if (X10_TEMP8) {
final int X10_TEMP226 = (0);

final int X10_TEMP10 = (X10_TEMP226);
return X10_TEMP10;
}
final int X10_TEMP230 = (1);

final int X10_TEMP12 = (X10_TEMP230);
return X10_TEMP12;
}
public static Vec Program_RayTracer_SpecularDirection(final RayTracer X10_TEMP0, final Vec I, final Vec N) {
Vec X10_TEMP1 = (I);
Vec X10_TEMP2 = (N);
final double X10_TEMP219 = (1.0);

final double X10_TEMP7 = (X10_TEMP219);
final double X10_TEMP224 = (Program0.Program_Vec_dot(X10_TEMP1,X10_TEMP2));

final double X10_TEMP6 = (X10_TEMP224);
final double X10_TEMP228 = (Math.abs(X10_TEMP6));

final double X10_TEMP8 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP7/X10_TEMP8);

final double X10_TEMP13 = (X10_TEMP231);
final double X10_TEMP234 = (2.0);

final double X10_TEMP14 = (X10_TEMP234);
final Vec X10_TEMP241 = (Program0.Program_Vec_comb(X10_TEMP13,X10_TEMP1,X10_TEMP14,X10_TEMP2));

final Vec X10_TEMP15 = (X10_TEMP241);
final Vec X10_TEMP245 = (Program0.Program_Vec_normalized(X10_TEMP15));

final Vec X10_TEMP17 = (X10_TEMP245);
return X10_TEMP17;
}
public static Vec Program_RayTracer_TransDir(final RayTracer X10_TEMP0, final Surface m1, final Surface m2, final Vec I, final Vec N) {
Surface X10_TEMP1 = (m1);
Surface X10_TEMP2 = (m2);
Vec X10_TEMP3 = (I);
Vec X10_TEMP4 = (N);
final boolean X10_TEMP5 = (X10_TEMP1.isNull);
double X10_TEMP8 = (X10_TEMP1.ior);
if (X10_TEMP5) {
final double X10_TEMP224 = (1.0);
X10_TEMP8 = (X10_TEMP224);
}
final double X10_TEMP9 = (X10_TEMP8);
final double X10_TEMP227 = (X10_TEMP9);

double n1 = (X10_TEMP227);
final boolean X10_TEMP10 = (X10_TEMP2.isNull);
double X10_TEMP13 = (X10_TEMP2.ior);
if (X10_TEMP10) {
final double X10_TEMP233 = (1.0);
X10_TEMP13 = (X10_TEMP233);
}
final double X10_TEMP14 = (X10_TEMP13);
final double X10_TEMP236 = (X10_TEMP14);

double n2 = (X10_TEMP236);
final double X10_TEMP239 = (n1/n2);

double eta = (X10_TEMP239);
final double X10_TEMP244 = (Program0.Program_Vec_dot(X10_TEMP3,X10_TEMP4));

final double X10_TEMP18 = (X10_TEMP244);
final int X10_TEMP19 = (0);
final double X10_TEMP248 = (X10_TEMP19-X10_TEMP18);

double c1 = (X10_TEMP248);
final double X10_TEMP251 = (1.0);

final double X10_TEMP26 = (X10_TEMP251);
final double X10_TEMP254 = (eta*eta);

final double X10_TEMP25 = (X10_TEMP254);
final double X10_TEMP257 = (1.0);

final double X10_TEMP21 = (X10_TEMP257);
final double X10_TEMP260 = (c1*c1);

final double X10_TEMP22 = (X10_TEMP260);
final double X10_TEMP263 = (X10_TEMP21-X10_TEMP22);

final double X10_TEMP24 = (X10_TEMP263);
final double X10_TEMP266 = (X10_TEMP25*X10_TEMP24);

final double X10_TEMP27 = (X10_TEMP266);
final double X10_TEMP269 = (X10_TEMP26-X10_TEMP27);

double cs2 = (X10_TEMP269);
final double X10_TEMP272 = (0.0);

final double X10_TEMP29 = (X10_TEMP272);
final boolean X10_TEMP31 = (cs2<X10_TEMP29);
if (X10_TEMP31) {
final double X10_TEMP277 = (0.0);

double X10_TEMP36 = (X10_TEMP277);
final double X10_TEMP280 = (0.0);

double X10_TEMP37 = (X10_TEMP280);
final double X10_TEMP283 = (0.0);

double X10_TEMP38 = (X10_TEMP283);
final boolean X10_TEMP286 = (true);

boolean X10_TEMP39 = (X10_TEMP286);
final Vec X10_TEMP293 = (new Vec(X10_TEMP36,X10_TEMP37,X10_TEMP38,X10_TEMP39));

final Vec X10_TEMP41 = (X10_TEMP293);
return X10_TEMP41;
}
final double X10_TEMP297 = (eta*c1);

final double X10_TEMP45 = (X10_TEMP297);
final double X10_TEMP301 = (Math.sqrt(cs2));

final double X10_TEMP46 = (X10_TEMP301);
final double X10_TEMP304 = (X10_TEMP45-X10_TEMP46);

final double X10_TEMP49 = (X10_TEMP304);
final Vec X10_TEMP311 = (Program0.Program_Vec_comb(eta,X10_TEMP3,X10_TEMP49,X10_TEMP4));

final Vec X10_TEMP50 = (X10_TEMP311);
final Vec X10_TEMP315 = (Program0.Program_Vec_normalized(X10_TEMP50));

final Vec X10_TEMP52 = (X10_TEMP315);
return X10_TEMP52;
}
public static Vec Program_RayTracer_shade(final RayTracer X10_TEMP0, final int level, final double weight, final Vec P, final Vec N, final Vec I, final Isect hit, final Ray tRay) {
int X10_TEMP1 = (level);
double X10_TEMP2 = (weight);
Vec X10_TEMP3 = (P);
Vec X10_TEMP4 = (N);
Vec X10_TEMP5 = (I);
Isect X10_TEMP6 = (hit);
Ray X10_TEMP7 = (tRay);
final Surface X10_TEMP224 = (X10_TEMP6.surf);

Surface surf = (X10_TEMP224);
final Vec X10_TEMP227 = (new Vec());

Vec bigr = (X10_TEMP227);
final double X10_TEMP230 = (surf.shine);

final double X10_TEMP10 = (X10_TEMP230);
final double X10_TEMP233 = (1e-6);

final double X10_TEMP11 = (X10_TEMP233);
final boolean X10_TEMP13 = (X10_TEMP10>X10_TEMP11);
if (X10_TEMP13) {
final Vec X10_TEMP241 = (Program0.Program_RayTracer_SpecularDirection(X10_TEMP0,X10_TEMP5,X10_TEMP4));

final Vec X10_TEMP17 = (X10_TEMP241);
final Vec X10_TEMP244 = (X10_TEMP17);

bigr = (X10_TEMP244);
}
final place X10_TEMP247 = (here);

final place h = (X10_TEMP247);
final int X10_TEMP250 = (0);

final int X10_TEMP21 = (X10_TEMP250);
final int X10_TEMP253 = (0);

final int X10_TEMP22 = (X10_TEMP253);
final region(:rank==1) X10_TEMP258 = (region(:rank==1))([X10_TEMP21:X10_TEMP22]);

final region(:rank==1) X10_TEMP23 = (region(:rank==1))(X10_TEMP258);
final place X10_TEMP261 = (here);

final place X10_TEMP24 = (X10_TEMP261);
final dist(:rank==1) X10_TEMP264 = (dist(:rank==1))(X10_TEMP23->X10_TEMP24);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP264);
final Envelope2[:rank==1&&distribution==dTemp] X10_TEMP267 = (Envelope2[:rank==1&&distribution==dTemp])(new Envelope2[dTemp]);

final Envelope2[:rank==1] temp = (Envelope2[:rank==1])(X10_TEMP267);
finish {
final place X10_TEMP28 = (place.FIRST_PLACE);
async(X10_TEMP28) {
final int X10_TEMP272 = (X10_TEMP0.lightCount);

final int templightCount = (X10_TEMP272);
final Light value[:rank==1] X10_TEMP275 = (Light value[:rank==1])(X10_TEMP0.lights);

final Light value[:rank==1] templights = (Light value[:rank==1])(X10_TEMP275);
async(h) {
final int X10_TEMP279 = (0);

final int X10_TEMP33 = (X10_TEMP279);
final Envelope2 X10_TEMP284 = (new Envelope2(templightCount,templights));

final Envelope2 X10_TEMP38 = (X10_TEMP284);
final Envelope2 X10_TEMP287 = (X10_TEMP38);

final Envelope2 X10_TEMP39 = (X10_TEMP287);
final Envelope2 X10_TEMP291 = (X10_TEMP39);

final Envelope2 X10_TEMP294 = (X10_TEMP291);
temp[X10_TEMP33] = (X10_TEMP294);
}
}
}
final int X10_TEMP296 = (0);

final int X10_TEMP41 = (X10_TEMP296);
final Envelope2 X10_TEMP300 = (temp[X10_TEMP41]);

final Envelope2 X10_TEMP42 = (X10_TEMP300);
final int X10_TEMP303 = (X10_TEMP42.i);

final int mylightCount = (X10_TEMP303);
final int X10_TEMP306 = (0);

final int X10_TEMP45 = (X10_TEMP306);
final Envelope2 X10_TEMP310 = (temp[X10_TEMP45]);

final Envelope2 X10_TEMP46 = (X10_TEMP310);
final Light value[:rank==1] X10_TEMP313 = (Light value[:rank==1])(X10_TEMP46.a);

final Light value[:rank==1] X10_TEMP48 = (Light value[:rank==1])(X10_TEMP313);
final Light value[:rank==1] X10_TEMP316 = (Light value[:rank==1])(X10_TEMP48);

final Light value[:rank==1] mylights = (Light value[:rank==1])(X10_TEMP316);
final Vec X10_TEMP319 = (new Vec());

Vec col = (X10_TEMP319);
final int X10_TEMP322 = (0);

final int X10_TEMP54 = (X10_TEMP322);
final int X10_TEMP325 = (1);

final int X10_TEMP52 = (X10_TEMP325);
final int X10_TEMP328 = (mylightCount-X10_TEMP52);

final int X10_TEMP55 = (X10_TEMP328);
final region(:rank==1) X10_TEMP333 = (region(:rank==1))([X10_TEMP54:X10_TEMP55]);

final region(:rank==1) X10_TEMP57 = (region(:rank==1))(X10_TEMP333);
for(point(:rank==1)[l]:X10_TEMP57) {
final Light X10_TEMP338 = (mylights[l]);

final Light X10_TEMP59 = (X10_TEMP338);
final Vec X10_TEMP341 = (X10_TEMP59.pos);

final Vec X10_TEMP62 = (X10_TEMP341);
final Vec X10_TEMP346 = (Program0.Program_Vec_sub(X10_TEMP62,X10_TEMP3));

Vec L = (X10_TEMP346);
final double X10_TEMP351 = (Program0.Program_Vec_dot(X10_TEMP4,L));

final double X10_TEMP66 = (X10_TEMP351);
final double X10_TEMP354 = (0.0);

final double X10_TEMP67 = (X10_TEMP354);
final boolean X10_TEMP69 = (X10_TEMP66>=X10_TEMP67);
if (X10_TEMP69) {
final Vec X10_TEMP360 = (Program0.Program_Vec_normalized(L));

final Vec X10_TEMP71 = (X10_TEMP360);
final Vec X10_TEMP363 = (X10_TEMP71);

L = (X10_TEMP363);
final double X10_TEMP367 = (Program0.Program_Vec_length(L));

double t = (X10_TEMP367);
final Vec X10_TEMP370 = (X10_TEMP3);

final Vec X10_TEMP75 = (X10_TEMP370);
final Vec X10_TEMP373 = (X10_TEMP75);

final Vec X10_TEMP376 = (X10_TEMP373);
X10_TEMP7.p = (X10_TEMP376);
final Vec X10_TEMP378 = (L);

final Vec X10_TEMP78 = (X10_TEMP378);
final Vec X10_TEMP381 = (X10_TEMP78);

final Vec X10_TEMP384 = (X10_TEMP381);
X10_TEMP7.d = (X10_TEMP384);
final int X10_TEMP390 = (Program0.Program_RayTracer_Shadow(X10_TEMP0,X10_TEMP7,t,X10_TEMP6));

final int X10_TEMP82 = (X10_TEMP390);
final int X10_TEMP393 = (0);

final int X10_TEMP83 = (X10_TEMP393);
final boolean X10_TEMP85 = (X10_TEMP82>X10_TEMP83);
if (X10_TEMP85) {
final double X10_TEMP400 = (Program0.Program_Vec_dot(X10_TEMP4,L));

final double X10_TEMP88 = (X10_TEMP400);
final double X10_TEMP403 = (surf.kd);

final double X10_TEMP89 = (X10_TEMP403);
final double X10_TEMP406 = (X10_TEMP88*X10_TEMP89);

final double X10_TEMP92 = (X10_TEMP406);
final Light X10_TEMP410 = (mylights[l]);

final Light X10_TEMP91 = (X10_TEMP410);
final double X10_TEMP413 = (X10_TEMP91.brightness);

final double X10_TEMP93 = (X10_TEMP413);
final double X10_TEMP416 = (X10_TEMP92*X10_TEMP93);

double diff = (X10_TEMP416);
final Vec X10_TEMP419 = (surf.color);

final Vec X10_TEMP97 = (X10_TEMP419);
final Vec X10_TEMP425 = (Program0.Program_Vec_adds2(col,diff,X10_TEMP97));

final Vec X10_TEMP99 = (X10_TEMP425);
final Vec X10_TEMP428 = (X10_TEMP99);

col = (X10_TEMP428);
final double X10_TEMP431 = (surf.shine);

final double X10_TEMP100 = (X10_TEMP431);
final double X10_TEMP434 = (1e-6);

final double X10_TEMP101 = (X10_TEMP434);
final boolean X10_TEMP103 = (X10_TEMP100>X10_TEMP101);
if (X10_TEMP103) {
final double X10_TEMP441 = (Program0.Program_Vec_dot(bigr,L));

double spec = (X10_TEMP441);
final double X10_TEMP444 = (1e-6);

final double X10_TEMP107 = (X10_TEMP444);
final boolean X10_TEMP109 = (spec>X10_TEMP107);
if (X10_TEMP109) {
final double X10_TEMP449 = (surf.shine);

final double X10_TEMP112 = (X10_TEMP449);
final double X10_TEMP454 = (Math.pow(spec,X10_TEMP112));

final double X10_TEMP114 = (X10_TEMP454);
final double X10_TEMP457 = (X10_TEMP114);

spec = (X10_TEMP457);
final boolean X10_TEMP460 = (false);

boolean X10_TEMP119 = (X10_TEMP460);
final Vec X10_TEMP467 = (new Vec(spec,spec,spec,X10_TEMP119));

final Vec X10_TEMP121 = (X10_TEMP467);
final Vec X10_TEMP472 = (Program0.Program_Vec_added(col,X10_TEMP121));

final Vec X10_TEMP123 = (X10_TEMP472);
final Vec X10_TEMP475 = (X10_TEMP123);

col = (X10_TEMP475);
}
}
}
}
}
final Vec X10_TEMP478 = (X10_TEMP3);

final Vec X10_TEMP126 = (X10_TEMP478);
final Vec X10_TEMP481 = (X10_TEMP126);

final Vec X10_TEMP484 = (X10_TEMP481);
X10_TEMP7.p = (X10_TEMP484);
final double X10_TEMP486 = (surf.ks);

final double X10_TEMP127 = (X10_TEMP486);
final double X10_TEMP489 = (X10_TEMP127*X10_TEMP2);

final double X10_TEMP128 = (X10_TEMP489);
final double X10_TEMP492 = (1e-3);

final double X10_TEMP129 = (X10_TEMP492);
final boolean X10_TEMP131 = (X10_TEMP128>X10_TEMP129);
if (X10_TEMP131) {
final Vec X10_TEMP500 = (Program0.Program_RayTracer_SpecularDirection(X10_TEMP0,X10_TEMP5,X10_TEMP4));

final Vec X10_TEMP136 = (X10_TEMP500);
final Vec X10_TEMP503 = (X10_TEMP136);

final Vec X10_TEMP137 = (X10_TEMP503);
final Vec X10_TEMP506 = (X10_TEMP137);

final Vec X10_TEMP509 = (X10_TEMP506);
X10_TEMP7.d = (X10_TEMP509);
final int X10_TEMP511 = (1);

final int X10_TEMP138 = (X10_TEMP511);
final int X10_TEMP514 = (X10_TEMP1+X10_TEMP138);

final int X10_TEMP145 = (X10_TEMP514);
final double X10_TEMP517 = (surf.ks);

final double X10_TEMP140 = (X10_TEMP517);
final double X10_TEMP520 = (X10_TEMP140*X10_TEMP2);

final double X10_TEMP146 = (X10_TEMP520);
final Vec X10_TEMP529 = (Program0.Program_RayTracer_trace(X10_TEMP0,X10_TEMP145,X10_TEMP146,X10_TEMP7,X10_TEMP6,X10_TEMP7));

Vec tcol = (X10_TEMP529);
final double X10_TEMP532 = (surf.ks);

final double X10_TEMP150 = (X10_TEMP532);
final Vec X10_TEMP538 = (Program0.Program_Vec_adds2(col,X10_TEMP150,tcol));

final Vec X10_TEMP152 = (X10_TEMP538);
final Vec X10_TEMP541 = (X10_TEMP152);

col = (X10_TEMP541);
}
final double X10_TEMP544 = (surf.kt);

final double X10_TEMP153 = (X10_TEMP544);
final double X10_TEMP547 = (X10_TEMP153*X10_TEMP2);

final double X10_TEMP154 = (X10_TEMP547);
final double X10_TEMP550 = (1e-3);

final double X10_TEMP155 = (X10_TEMP550);
final boolean X10_TEMP157 = (X10_TEMP154>X10_TEMP155);
if (X10_TEMP157) {
final int X10_TEMP555 = (X10_TEMP6.enter);

final int X10_TEMP158 = (X10_TEMP555);
final int X10_TEMP558 = (0);

final int X10_TEMP159 = (X10_TEMP558);
final boolean X10_TEMP161 = (X10_TEMP158>X10_TEMP159);
if (X10_TEMP161) {
final int X10_TEMP563 = (0);

int X10_TEMP167 = (X10_TEMP563);
final int X10_TEMP566 = (0);

int X10_TEMP168 = (X10_TEMP566);
final int X10_TEMP569 = (0);

int X10_TEMP169 = (X10_TEMP569);
final Vec X10_TEMP572 = (new Vec());

Vec X10_TEMP170 = (X10_TEMP572);
final boolean X10_TEMP575 = (true);

boolean X10_TEMP171 = (X10_TEMP575);
final Surface X10_TEMP583 = (new Surface(X10_TEMP167,X10_TEMP168,X10_TEMP169,X10_TEMP170,X10_TEMP171));

final Surface X10_TEMP176 = (X10_TEMP583);
final Vec X10_TEMP591 = (Program0.Program_RayTracer_TransDir(X10_TEMP0,X10_TEMP176,surf,X10_TEMP5,X10_TEMP4));

final Vec X10_TEMP179 = (X10_TEMP591);
final Vec X10_TEMP594 = (X10_TEMP179);

final Vec X10_TEMP180 = (X10_TEMP594);
final Vec X10_TEMP597 = (X10_TEMP180);

final Vec X10_TEMP600 = (X10_TEMP597);
X10_TEMP7.d = (X10_TEMP600);
}
else {
final int X10_TEMP602 = (0);

int X10_TEMP187 = (X10_TEMP602);
final int X10_TEMP605 = (0);

int X10_TEMP188 = (X10_TEMP605);
final int X10_TEMP608 = (0);

int X10_TEMP189 = (X10_TEMP608);
final Vec X10_TEMP611 = (new Vec());

Vec X10_TEMP190 = (X10_TEMP611);
final boolean X10_TEMP614 = (true);

boolean X10_TEMP191 = (X10_TEMP614);
final Surface X10_TEMP622 = (new Surface(X10_TEMP187,X10_TEMP188,X10_TEMP189,X10_TEMP190,X10_TEMP191));

final Surface X10_TEMP195 = (X10_TEMP622);
final Vec X10_TEMP630 = (Program0.Program_RayTracer_TransDir(X10_TEMP0,surf,X10_TEMP195,X10_TEMP5,X10_TEMP4));

final Vec X10_TEMP198 = (X10_TEMP630);
final Vec X10_TEMP633 = (X10_TEMP198);

final Vec X10_TEMP199 = (X10_TEMP633);
final Vec X10_TEMP636 = (X10_TEMP199);

final Vec X10_TEMP639 = (X10_TEMP636);
X10_TEMP7.d = (X10_TEMP639);
}
final int X10_TEMP641 = (1);

final int X10_TEMP200 = (X10_TEMP641);
final int X10_TEMP644 = (X10_TEMP1+X10_TEMP200);

final int X10_TEMP207 = (X10_TEMP644);
final double X10_TEMP647 = (surf.kt);

final double X10_TEMP202 = (X10_TEMP647);
final double X10_TEMP650 = (X10_TEMP202*X10_TEMP2);

final double X10_TEMP208 = (X10_TEMP650);
final Vec X10_TEMP659 = (Program0.Program_RayTracer_trace(X10_TEMP0,X10_TEMP207,X10_TEMP208,X10_TEMP7,X10_TEMP6,X10_TEMP7));

Vec tcol = (X10_TEMP659);
final double X10_TEMP662 = (surf.kt);

final double X10_TEMP212 = (X10_TEMP662);
final Vec X10_TEMP668 = (Program0.Program_Vec_adds2(col,X10_TEMP212,tcol));

final Vec X10_TEMP214 = (X10_TEMP668);
final Vec X10_TEMP671 = (X10_TEMP214);

col = (X10_TEMP671);
}
return col;
}
public static Vec Program_RayTracer_trace(final RayTracer X10_TEMP0, final int level, final double weight, final Ray r, final Isect inter, final Ray tRay) {
int X10_TEMP1 = (level);
double X10_TEMP2 = (weight);
Ray X10_TEMP3 = (r);
Isect X10_TEMP4 = (inter);
Ray X10_TEMP5 = (tRay);
final int X10_TEMP222 = (6);

final int X10_TEMP6 = (X10_TEMP222);
final boolean X10_TEMP8 = (X10_TEMP1>X10_TEMP6);
if (X10_TEMP8) {
final Vec X10_TEMP227 = (new Vec());

final Vec X10_TEMP10 = (X10_TEMP227);
return X10_TEMP10;
}
final double X10_TEMP231 = (1e6);

final double X10_TEMP14 = (X10_TEMP231);
final boolean X10_TEMP238 = (Program0.Program_RayTracer_intersect(X10_TEMP0,X10_TEMP3,X10_TEMP14,X10_TEMP4));

boolean hit = (X10_TEMP238);
if (hit) {
final double X10_TEMP242 = (X10_TEMP4.t);

final double X10_TEMP18 = (X10_TEMP242);
final Vec X10_TEMP247 = (Program0.Program_Ray_rayPoint(X10_TEMP3,X10_TEMP18));

Vec P = (X10_TEMP247);
final Sphere X10_TEMP250 = (X10_TEMP4.prim);

final Sphere X10_TEMP20 = (X10_TEMP250);
final Vec X10_TEMP255 = (Program0.Program_Sphere_normal(X10_TEMP20,P));

Vec N = (X10_TEMP255);
final Vec X10_TEMP258 = (X10_TEMP3.d);

final Vec X10_TEMP25 = (X10_TEMP258);
final double X10_TEMP263 = (Program0.Program_Vec_dot(X10_TEMP25,N));

final double X10_TEMP26 = (X10_TEMP263);
final double X10_TEMP266 = (0.0);

final double X10_TEMP27 = (X10_TEMP266);
final boolean X10_TEMP29 = (X10_TEMP26>=X10_TEMP27);
if (X10_TEMP29) {
final Vec X10_TEMP272 = (Program0.Program_Vec_negate(N));

final Vec X10_TEMP31 = (X10_TEMP272);
final Vec X10_TEMP275 = (X10_TEMP31);

N = (X10_TEMP275);
}
final Vec X10_TEMP278 = (X10_TEMP3.d);

final Vec X10_TEMP39 = (X10_TEMP278);
final Vec X10_TEMP289 = (Program0.Program_RayTracer_shade(X10_TEMP0,X10_TEMP1,X10_TEMP2,P,N,X10_TEMP39,X10_TEMP4,X10_TEMP5));

final Vec X10_TEMP41 = (X10_TEMP289);
return X10_TEMP41;
}
return _Program__RayTracer_voidVec;
}
public static Ray Program_Ray_d(final Ray X10_TEMP0, final Vec d_) {
Vec X10_TEMP1 = (d_);
final Vec X10_TEMP218 = (X10_TEMP0.p);

Vec X10_TEMP5 = (X10_TEMP218);
final boolean X10_TEMP221 = (false);

boolean X10_TEMP6 = (X10_TEMP221);
final Ray X10_TEMP227 = (new Ray(X10_TEMP5,X10_TEMP1,X10_TEMP6));

final Ray X10_TEMP8 = (X10_TEMP227);
return X10_TEMP8;
}
public static Vec Program_Ray_rayPoint(final Ray X10_TEMP0, final double t) {
double X10_TEMP1 = (t);
final Vec X10_TEMP218 = (X10_TEMP0.p);

final Vec X10_TEMP2 = (X10_TEMP218);
final double X10_TEMP221 = (X10_TEMP2.x);

final double X10_TEMP5 = (X10_TEMP221);
final Vec X10_TEMP224 = (X10_TEMP0.d);

final Vec X10_TEMP3 = (X10_TEMP224);
final double X10_TEMP227 = (X10_TEMP3.x);

final double X10_TEMP4 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP4*X10_TEMP1);

final double X10_TEMP6 = (X10_TEMP230);
final double X10_TEMP233 = (X10_TEMP5+X10_TEMP6);

double X10_TEMP21 = (X10_TEMP233);
final Vec X10_TEMP236 = (X10_TEMP0.p);

final Vec X10_TEMP8 = (X10_TEMP236);
final double X10_TEMP239 = (X10_TEMP8.y);

final double X10_TEMP11 = (X10_TEMP239);
final Vec X10_TEMP242 = (X10_TEMP0.d);

final Vec X10_TEMP9 = (X10_TEMP242);
final double X10_TEMP245 = (X10_TEMP9.y);

final double X10_TEMP10 = (X10_TEMP245);
final double X10_TEMP248 = (X10_TEMP10*X10_TEMP1);

final double X10_TEMP12 = (X10_TEMP248);
final double X10_TEMP251 = (X10_TEMP11+X10_TEMP12);

double X10_TEMP22 = (X10_TEMP251);
final Vec X10_TEMP254 = (X10_TEMP0.p);

final Vec X10_TEMP14 = (X10_TEMP254);
final double X10_TEMP257 = (X10_TEMP14.z);

final double X10_TEMP17 = (X10_TEMP257);
final Vec X10_TEMP260 = (X10_TEMP0.d);

final Vec X10_TEMP15 = (X10_TEMP260);
final double X10_TEMP263 = (X10_TEMP15.z);

final double X10_TEMP16 = (X10_TEMP263);
final double X10_TEMP266 = (X10_TEMP16*X10_TEMP1);

final double X10_TEMP18 = (X10_TEMP266);
final double X10_TEMP269 = (X10_TEMP17+X10_TEMP18);

double X10_TEMP23 = (X10_TEMP269);
final boolean X10_TEMP272 = (false);

boolean X10_TEMP24 = (X10_TEMP272);
final Vec X10_TEMP279 = (new Vec(X10_TEMP21,X10_TEMP22,X10_TEMP23,X10_TEMP24));

final Vec X10_TEMP26 = (X10_TEMP279);
return X10_TEMP26;
}
public static String Program_Ray_toString(final Ray X10_TEMP0) {
final String X10_TEMP217 = (" { ");

final String X10_TEMP2 = (X10_TEMP217);
final Vec X10_TEMP220 = (X10_TEMP0.p);

final Vec X10_TEMP1 = (X10_TEMP220);
final String X10_TEMP224 = (Program0.Program_Vec_toString(X10_TEMP1));

final String X10_TEMP3 = (X10_TEMP224);
final String X10_TEMP227 = (X10_TEMP2+X10_TEMP3);

final String X10_TEMP4 = (X10_TEMP227);
final String X10_TEMP230 = ("->");

final String X10_TEMP5 = (X10_TEMP230);
final String X10_TEMP233 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP7 = (X10_TEMP233);
final Vec X10_TEMP236 = (X10_TEMP0.d);

final Vec X10_TEMP6 = (X10_TEMP236);
final String X10_TEMP240 = (Program0.Program_Vec_toString(X10_TEMP6));

final String X10_TEMP8 = (X10_TEMP240);
final String X10_TEMP243 = (X10_TEMP7+X10_TEMP8);

final String X10_TEMP9 = (X10_TEMP243);
final String X10_TEMP246 = (" } ");

final String X10_TEMP10 = (X10_TEMP246);
final String X10_TEMP249 = (X10_TEMP9+X10_TEMP10);

final String X10_TEMP12 = (X10_TEMP249);
return X10_TEMP12;
}
public static int Program__Scene_maxObjects_init() {
final int X10_TEMP217 = (64);

final int X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static int Program__Scene_maxLights_init() {
final int X10_TEMP217 = (5);

final int X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static void Program_Scene_addLight(final Scene X10_TEMP0, final Light l) {
Light X10_TEMP1 = (l);
final int X10_TEMP218 = (X10_TEMP0.lightCount);

final int X10_TEMP3 = (X10_TEMP218);
final int X10_TEMP221 = (1);

final int X10_TEMP2 = (X10_TEMP221);
final int X10_TEMP224 = (_Program__Scene_maxLights-X10_TEMP2);

final int X10_TEMP4 = (X10_TEMP224);
final boolean X10_TEMP6 = (X10_TEMP3>X10_TEMP4);
if (X10_TEMP6) {
final String X10_TEMP229 = ("Only ");

final String X10_TEMP7 = (X10_TEMP229);
final String X10_TEMP232 = (X10_TEMP7+_Program__Scene_maxLights);

final String X10_TEMP8 = (X10_TEMP232);
final String X10_TEMP235 = (" lights allowed");

final String X10_TEMP9 = (X10_TEMP235);
final String X10_TEMP238 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP11 = (X10_TEMP238);
throw new RuntimeException(X10_TEMP11);
}
final Light[:rank==1] X10_TEMP242 = (Light[:rank==1])(X10_TEMP0.lights);

final Light[:rank==1] X10_TEMP12 = (Light[:rank==1])(X10_TEMP242);
final int X10_TEMP245 = (X10_TEMP0.lightCount);

final int X10_TEMP13 = (X10_TEMP245);
final int X10_TEMP14 = (1);
final int X10_TEMP249 = (X10_TEMP0.lightCount);

final int X10_TEMP15 = (X10_TEMP249);
final int X10_TEMP252 = (X10_TEMP15+X10_TEMP14);

final int X10_TEMP16 = (X10_TEMP252);
final int X10_TEMP255 = (X10_TEMP16);

final int X10_TEMP258 = (X10_TEMP255);
X10_TEMP0.lightCount = (X10_TEMP258);
final Light X10_TEMP260 = (X10_TEMP1);

final Light X10_TEMP20 = (X10_TEMP260);
final Light X10_TEMP264 = (X10_TEMP20);

final Light X10_TEMP267 = (X10_TEMP264);
X10_TEMP12[X10_TEMP13] = (X10_TEMP267);
}
public static void Program_Scene_addObject(final Scene X10_TEMP0, final Sphere object) {
Sphere X10_TEMP1 = (object);
final int X10_TEMP218 = (X10_TEMP0.objectCount);

final int X10_TEMP3 = (X10_TEMP218);
final int X10_TEMP221 = (1);

final int X10_TEMP2 = (X10_TEMP221);
final int X10_TEMP224 = (_Program__Scene_maxObjects-X10_TEMP2);

final int X10_TEMP4 = (X10_TEMP224);
final boolean X10_TEMP6 = (X10_TEMP3>X10_TEMP4);
if (X10_TEMP6) {
final String X10_TEMP229 = ("Only ");

final String X10_TEMP7 = (X10_TEMP229);
final String X10_TEMP232 = (X10_TEMP7+_Program__Scene_maxObjects);

final String X10_TEMP8 = (X10_TEMP232);
final String X10_TEMP235 = (" objects allowed");

final String X10_TEMP9 = (X10_TEMP235);
final String X10_TEMP238 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP11 = (X10_TEMP238);
throw new RuntimeException(X10_TEMP11);
}
final Sphere[:rank==1] X10_TEMP242 = (Sphere[:rank==1])(X10_TEMP0.objects);

final Sphere[:rank==1] X10_TEMP12 = (Sphere[:rank==1])(X10_TEMP242);
final int X10_TEMP245 = (X10_TEMP0.objectCount);

final int X10_TEMP13 = (X10_TEMP245);
final int X10_TEMP14 = (1);
final int X10_TEMP249 = (X10_TEMP0.objectCount);

final int X10_TEMP15 = (X10_TEMP249);
final int X10_TEMP252 = (X10_TEMP15+X10_TEMP14);

final int X10_TEMP16 = (X10_TEMP252);
final int X10_TEMP255 = (X10_TEMP16);

final int X10_TEMP258 = (X10_TEMP255);
X10_TEMP0.objectCount = (X10_TEMP258);
final Sphere X10_TEMP260 = (X10_TEMP1);

final Sphere X10_TEMP20 = (X10_TEMP260);
final Sphere X10_TEMP264 = (X10_TEMP20);

final Sphere X10_TEMP267 = (X10_TEMP264);
X10_TEMP12[X10_TEMP13] = (X10_TEMP267);
}
public static View Program_Scene_getView(final Scene X10_TEMP0) {
final View X10_TEMP217 = (X10_TEMP0.view);

final View X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static Light Program_Scene_getLight(final Scene X10_TEMP0, final int number) {
int X10_TEMP1 = (number);
final Light[:rank==1] X10_TEMP218 = (Light[:rank==1])(X10_TEMP0.lights);

final Light[:rank==1] X10_TEMP2 = (Light[:rank==1])(X10_TEMP218);
final Light X10_TEMP222 = (X10_TEMP2[X10_TEMP1]);

final Light X10_TEMP5 = (X10_TEMP222);
return X10_TEMP5;
}
public static Sphere Program_Scene_getObject(final Scene X10_TEMP0, final int number) {
int X10_TEMP1 = (number);
final Sphere[:rank==1] X10_TEMP218 = (Sphere[:rank==1])(X10_TEMP0.objects);

final Sphere[:rank==1] X10_TEMP2 = (Sphere[:rank==1])(X10_TEMP218);
final Sphere X10_TEMP222 = (X10_TEMP2[X10_TEMP1]);

final Sphere X10_TEMP5 = (X10_TEMP222);
return X10_TEMP5;
}
public static int Program_Scene_getLights(final Scene X10_TEMP0) {
final int X10_TEMP217 = (X10_TEMP0.lightCount);

final int X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static int Program_Scene_getObjects(final Scene X10_TEMP0) {
final int X10_TEMP217 = (X10_TEMP0.objectCount);

final int X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static Isect Program_Sphere_intersect(final Sphere X10_TEMP0, final Ray ry) {
Ray X10_TEMP1 = (ry);
final Vec X10_TEMP218 = (X10_TEMP0.c);

final Vec X10_TEMP4 = (X10_TEMP218);
final Vec X10_TEMP221 = (X10_TEMP1.p);

final Vec X10_TEMP5 = (X10_TEMP221);
final Vec X10_TEMP226 = (Program0.Program_Vec_sub(X10_TEMP4,X10_TEMP5));

Vec v = (X10_TEMP226);
final Vec X10_TEMP229 = (X10_TEMP1.d);

final Vec X10_TEMP9 = (X10_TEMP229);
final double X10_TEMP234 = (Program0.Program_Vec_dot(v,X10_TEMP9));

double b = (X10_TEMP234);
final double X10_TEMP237 = (b*b);

final double X10_TEMP13 = (X10_TEMP237);
final double X10_TEMP242 = (Program0.Program_Vec_dot(v,v));

final double X10_TEMP14 = (X10_TEMP242);
final double X10_TEMP245 = (X10_TEMP13-X10_TEMP14);

final double X10_TEMP15 = (X10_TEMP245);
final double X10_TEMP248 = (X10_TEMP0.r2);

final double X10_TEMP16 = (X10_TEMP248);
final double X10_TEMP251 = (X10_TEMP15+X10_TEMP16);

double disc = (X10_TEMP251);
final double X10_TEMP254 = (0.0);

final double X10_TEMP18 = (X10_TEMP254);
final boolean X10_TEMP20 = (disc<X10_TEMP18);
if (X10_TEMP20) {
final double X10_TEMP259 = (0.0);

double X10_TEMP26 = (X10_TEMP259);
final int X10_TEMP262 = (0);

int X10_TEMP27 = (X10_TEMP262);
final boolean X10_TEMP265 = (true);

boolean X10_TEMP28 = (X10_TEMP265);
final Surface X10_TEMP268 = (X10_TEMP0.surf);

Surface X10_TEMP29 = (X10_TEMP268);
final Isect X10_TEMP276 = (new Isect(X10_TEMP26,X10_TEMP27,X10_TEMP28,X10_TEMP0,X10_TEMP29));

final Isect X10_TEMP31 = (X10_TEMP276);
return X10_TEMP31;
}
final double X10_TEMP281 = (Math.sqrt(disc));

final double X10_TEMP34 = (X10_TEMP281);
final double X10_TEMP284 = (X10_TEMP34);

disc = (X10_TEMP284);
final double X10_TEMP287 = (b-disc);

final double X10_TEMP35 = (X10_TEMP287);
final double X10_TEMP290 = (1e-6);

final double X10_TEMP36 = (X10_TEMP290);
final boolean X10_TEMP293 = (X10_TEMP35<X10_TEMP36);

final boolean X10_TEMP38 = (X10_TEMP293);
final boolean X10_TEMP39 = (X10_TEMP38);
double X10_TEMP42 = (b-disc);
if (X10_TEMP39) {
final double X10_TEMP299 = (b+disc);
X10_TEMP42 = (X10_TEMP299);
}
final double X10_TEMP43 = (X10_TEMP42);
final double X10_TEMP302 = (X10_TEMP43);

double t = (X10_TEMP302);
final double X10_TEMP305 = (1e-6);

final double X10_TEMP44 = (X10_TEMP305);
final boolean X10_TEMP46 = (t<X10_TEMP44);
if (X10_TEMP46) {
final double X10_TEMP310 = (0.0);

double X10_TEMP52 = (X10_TEMP310);
final int X10_TEMP313 = (0);

int X10_TEMP53 = (X10_TEMP313);
final boolean X10_TEMP316 = (true);

boolean X10_TEMP54 = (X10_TEMP316);
final Surface X10_TEMP319 = (X10_TEMP0.surf);

Surface X10_TEMP55 = (X10_TEMP319);
final Isect X10_TEMP327 = (new Isect(X10_TEMP52,X10_TEMP53,X10_TEMP54,X10_TEMP0,X10_TEMP55));

final Isect X10_TEMP57 = (X10_TEMP327);
return X10_TEMP57;
}
final double X10_TEMP333 = (Program0.Program_Vec_dot(v,v));

final double X10_TEMP63 = (X10_TEMP333);
final double X10_TEMP336 = (X10_TEMP0.r2);

final double X10_TEMP61 = (X10_TEMP336);
final double X10_TEMP339 = (1e-6);

final double X10_TEMP62 = (X10_TEMP339);
final double X10_TEMP342 = (X10_TEMP61+X10_TEMP62);

final double X10_TEMP64 = (X10_TEMP342);
final boolean X10_TEMP65 = (X10_TEMP63>X10_TEMP64);
int X10_TEMP68 = (0);
if (X10_TEMP65) {
final int X10_TEMP348 = (1);
X10_TEMP68 = (X10_TEMP348);
}
final int X10_TEMP69 = (X10_TEMP68);
final boolean X10_TEMP351 = (false);

boolean X10_TEMP73 = (X10_TEMP351);
final Surface X10_TEMP354 = (X10_TEMP0.surf);

Surface X10_TEMP74 = (X10_TEMP354);
final Isect X10_TEMP362 = (new Isect(t,X10_TEMP69,X10_TEMP73,X10_TEMP0,X10_TEMP74));

Isect ip = (X10_TEMP362);
return ip;
}
public static Vec Program_Sphere_normal(final Sphere X10_TEMP0, final Vec p) {
Vec X10_TEMP1 = (p);
final Vec X10_TEMP218 = (X10_TEMP0.c);

final Vec X10_TEMP4 = (X10_TEMP218);
final Vec X10_TEMP223 = (Program0.Program_Vec_sub(X10_TEMP1,X10_TEMP4));

final Vec X10_TEMP5 = (X10_TEMP223);
final Vec X10_TEMP227 = (Program0.Program_Vec_normalized(X10_TEMP5));

final Vec X10_TEMP7 = (X10_TEMP227);
return X10_TEMP7;
}
public static String Program_Sphere_toString(final Sphere X10_TEMP0) {
final String X10_TEMP217 = ("Sphere {");

final String X10_TEMP2 = (X10_TEMP217);
final Vec X10_TEMP220 = (X10_TEMP0.c);

final Vec X10_TEMP1 = (X10_TEMP220);
final String X10_TEMP224 = (Program0.Program_Vec_toString(X10_TEMP1));

final String X10_TEMP3 = (X10_TEMP224);
final String X10_TEMP227 = (X10_TEMP2+X10_TEMP3);

final String X10_TEMP4 = (X10_TEMP227);
final String X10_TEMP230 = (",");

final String X10_TEMP5 = (X10_TEMP230);
final String X10_TEMP233 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP6 = (X10_TEMP233);
final double X10_TEMP236 = (X10_TEMP0.r);

final double X10_TEMP7 = (X10_TEMP236);
final String X10_TEMP239 = (X10_TEMP6+X10_TEMP7);

final String X10_TEMP8 = (X10_TEMP239);
final String X10_TEMP242 = ("}");

final String X10_TEMP9 = (X10_TEMP242);
final String X10_TEMP245 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP11 = (X10_TEMP245);
return X10_TEMP11;
}
public static Vec Program_Sphere_getCenter(final Sphere X10_TEMP0) {
final Vec X10_TEMP217 = (X10_TEMP0.c);

final Vec X10_TEMP2 = (X10_TEMP217);
return X10_TEMP2;
}
public static String Program_Surface_toString(final Surface X10_TEMP0) {
final String X10_TEMP217 = ("Surface { color = ");

final String X10_TEMP1 = (X10_TEMP217);
final Vec X10_TEMP220 = (X10_TEMP0.color);

final Vec X10_TEMP2 = (X10_TEMP220);
final String X10_TEMP224 = (Program0.Program_Vec_toString(X10_TEMP2));

final String X10_TEMP3 = (X10_TEMP224);
final String X10_TEMP227 = (X10_TEMP1+X10_TEMP3);

final String X10_TEMP4 = (X10_TEMP227);
final String X10_TEMP230 = (" }");

final String X10_TEMP5 = (X10_TEMP230);
final String X10_TEMP233 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP7 = (X10_TEMP233);
return X10_TEMP7;
}
public static Vec Program_Vec_added(final Vec X10_TEMP0, final Vec a) {
Vec X10_TEMP1 = (a);
final double X10_TEMP218 = (X10_TEMP0.x);

final double X10_TEMP2 = (X10_TEMP218);
final double X10_TEMP221 = (X10_TEMP1.x);

final double X10_TEMP3 = (X10_TEMP221);
final double X10_TEMP224 = (X10_TEMP2+X10_TEMP3);

double X10_TEMP12 = (X10_TEMP224);
final double X10_TEMP227 = (X10_TEMP0.y);

final double X10_TEMP5 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP1.y);

final double X10_TEMP6 = (X10_TEMP230);
final double X10_TEMP233 = (X10_TEMP5+X10_TEMP6);

double X10_TEMP13 = (X10_TEMP233);
final double X10_TEMP236 = (X10_TEMP0.z);

final double X10_TEMP8 = (X10_TEMP236);
final double X10_TEMP239 = (X10_TEMP1.z);

final double X10_TEMP9 = (X10_TEMP239);
final double X10_TEMP242 = (X10_TEMP8+X10_TEMP9);

double X10_TEMP14 = (X10_TEMP242);
final boolean X10_TEMP245 = (false);

boolean X10_TEMP15 = (X10_TEMP245);
final Vec X10_TEMP252 = (new Vec(X10_TEMP12,X10_TEMP13,X10_TEMP14,X10_TEMP15));

final Vec X10_TEMP17 = (X10_TEMP252);
return X10_TEMP17;
}
public static Vec Program_Vec_adds3(final double s, final Vec a, final Vec b) {
double X10_TEMP1 = (s);
Vec X10_TEMP2 = (a);
Vec X10_TEMP3 = (b);
final double X10_TEMP220 = (X10_TEMP2.x);

final double X10_TEMP4 = (X10_TEMP220);
final double X10_TEMP223 = (X10_TEMP1*X10_TEMP4);

final double X10_TEMP5 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP3.x);

final double X10_TEMP6 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP5+X10_TEMP6);

double X10_TEMP17 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP2.y);

final double X10_TEMP8 = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP1*X10_TEMP8);

final double X10_TEMP9 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP3.y);

final double X10_TEMP10 = (X10_TEMP238);
final double X10_TEMP241 = (X10_TEMP9+X10_TEMP10);

double X10_TEMP18 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP2.z);

final double X10_TEMP12 = (X10_TEMP244);
final double X10_TEMP247 = (X10_TEMP1*X10_TEMP12);

final double X10_TEMP13 = (X10_TEMP247);
final double X10_TEMP250 = (X10_TEMP3.z);

final double X10_TEMP14 = (X10_TEMP250);
final double X10_TEMP253 = (X10_TEMP13+X10_TEMP14);

double X10_TEMP19 = (X10_TEMP253);
final boolean X10_TEMP256 = (false);

boolean X10_TEMP20 = (X10_TEMP256);
final Vec X10_TEMP263 = (new Vec(X10_TEMP17,X10_TEMP18,X10_TEMP19,X10_TEMP20));

final Vec X10_TEMP22 = (X10_TEMP263);
return X10_TEMP22;
}
public static Vec Program_Vec_adds2(final Vec X10_TEMP0, final double s, final Vec b) {
double X10_TEMP1 = (s);
Vec X10_TEMP2 = (b);
final double X10_TEMP219 = (X10_TEMP0.x);

final double X10_TEMP4 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP2.x);

final double X10_TEMP3 = (X10_TEMP222);
final double X10_TEMP225 = (X10_TEMP1*X10_TEMP3);

final double X10_TEMP5 = (X10_TEMP225);
final double X10_TEMP228 = (X10_TEMP4+X10_TEMP5);

double X10_TEMP16 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP0.y);

final double X10_TEMP8 = (X10_TEMP231);
final double X10_TEMP234 = (X10_TEMP2.y);

final double X10_TEMP7 = (X10_TEMP234);
final double X10_TEMP237 = (X10_TEMP1*X10_TEMP7);

final double X10_TEMP9 = (X10_TEMP237);
final double X10_TEMP240 = (X10_TEMP8+X10_TEMP9);

double X10_TEMP17 = (X10_TEMP240);
final double X10_TEMP243 = (X10_TEMP0.z);

final double X10_TEMP12 = (X10_TEMP243);
final double X10_TEMP246 = (X10_TEMP2.z);

final double X10_TEMP11 = (X10_TEMP246);
final double X10_TEMP249 = (X10_TEMP1*X10_TEMP11);

final double X10_TEMP13 = (X10_TEMP249);
final double X10_TEMP252 = (X10_TEMP12+X10_TEMP13);

double X10_TEMP18 = (X10_TEMP252);
final boolean X10_TEMP255 = (false);

boolean X10_TEMP19 = (X10_TEMP255);
final Vec X10_TEMP262 = (new Vec(X10_TEMP16,X10_TEMP17,X10_TEMP18,X10_TEMP19));

final Vec X10_TEMP21 = (X10_TEMP262);
return X10_TEMP21;
}
public static Vec Program_Vec_sub(final Vec a, final Vec b) {
Vec X10_TEMP1 = (a);
Vec X10_TEMP2 = (b);
final double X10_TEMP219 = (X10_TEMP1.x);

final double X10_TEMP3 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP2.x);

final double X10_TEMP4 = (X10_TEMP222);
final double X10_TEMP225 = (X10_TEMP3-X10_TEMP4);

double X10_TEMP13 = (X10_TEMP225);
final double X10_TEMP228 = (X10_TEMP1.y);

final double X10_TEMP6 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP2.y);

final double X10_TEMP7 = (X10_TEMP231);
final double X10_TEMP234 = (X10_TEMP6-X10_TEMP7);

double X10_TEMP14 = (X10_TEMP234);
final double X10_TEMP237 = (X10_TEMP1.z);

final double X10_TEMP9 = (X10_TEMP237);
final double X10_TEMP240 = (X10_TEMP2.z);

final double X10_TEMP10 = (X10_TEMP240);
final double X10_TEMP243 = (X10_TEMP9-X10_TEMP10);

double X10_TEMP15 = (X10_TEMP243);
final boolean X10_TEMP246 = (false);

boolean X10_TEMP16 = (X10_TEMP246);
final Vec X10_TEMP253 = (new Vec(X10_TEMP13,X10_TEMP14,X10_TEMP15,X10_TEMP16));

final Vec X10_TEMP18 = (X10_TEMP253);
return X10_TEMP18;
}
public static Vec Program_Vec_mult(final Vec a, final Vec b) {
Vec X10_TEMP1 = (a);
Vec X10_TEMP2 = (b);
final double X10_TEMP219 = (X10_TEMP1.x);

final double X10_TEMP3 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP2.x);

final double X10_TEMP4 = (X10_TEMP222);
final double X10_TEMP225 = (X10_TEMP3*X10_TEMP4);

double X10_TEMP13 = (X10_TEMP225);
final double X10_TEMP228 = (X10_TEMP1.y);

final double X10_TEMP6 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP2.y);

final double X10_TEMP7 = (X10_TEMP231);
final double X10_TEMP234 = (X10_TEMP6*X10_TEMP7);

double X10_TEMP14 = (X10_TEMP234);
final double X10_TEMP237 = (X10_TEMP1.z);

final double X10_TEMP9 = (X10_TEMP237);
final double X10_TEMP240 = (X10_TEMP2.z);

final double X10_TEMP10 = (X10_TEMP240);
final double X10_TEMP243 = (X10_TEMP9*X10_TEMP10);

double X10_TEMP15 = (X10_TEMP243);
final boolean X10_TEMP246 = (false);

boolean X10_TEMP16 = (X10_TEMP246);
final Vec X10_TEMP253 = (new Vec(X10_TEMP13,X10_TEMP14,X10_TEMP15,X10_TEMP16));

final Vec X10_TEMP18 = (X10_TEMP253);
return X10_TEMP18;
}
public static Vec Program_Vec_cross(final Vec a, final Vec b) {
Vec X10_TEMP1 = (a);
Vec X10_TEMP2 = (b);
final double X10_TEMP219 = (X10_TEMP1.y);

final double X10_TEMP3 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP2.z);

final double X10_TEMP4 = (X10_TEMP222);
final double X10_TEMP225 = (X10_TEMP3*X10_TEMP4);

final double X10_TEMP7 = (X10_TEMP225);
final double X10_TEMP228 = (X10_TEMP1.z);

final double X10_TEMP5 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP2.y);

final double X10_TEMP6 = (X10_TEMP231);
final double X10_TEMP234 = (X10_TEMP5*X10_TEMP6);

final double X10_TEMP8 = (X10_TEMP234);
final double X10_TEMP237 = (X10_TEMP7-X10_TEMP8);

double X10_TEMP25 = (X10_TEMP237);
final double X10_TEMP240 = (X10_TEMP1.z);

final double X10_TEMP10 = (X10_TEMP240);
final double X10_TEMP243 = (X10_TEMP2.x);

final double X10_TEMP11 = (X10_TEMP243);
final double X10_TEMP246 = (X10_TEMP10*X10_TEMP11);

final double X10_TEMP14 = (X10_TEMP246);
final double X10_TEMP249 = (X10_TEMP1.x);

final double X10_TEMP12 = (X10_TEMP249);
final double X10_TEMP252 = (X10_TEMP2.z);

final double X10_TEMP13 = (X10_TEMP252);
final double X10_TEMP255 = (X10_TEMP12*X10_TEMP13);

final double X10_TEMP15 = (X10_TEMP255);
final double X10_TEMP258 = (X10_TEMP14-X10_TEMP15);

double X10_TEMP26 = (X10_TEMP258);
final double X10_TEMP261 = (X10_TEMP1.x);

final double X10_TEMP17 = (X10_TEMP261);
final double X10_TEMP264 = (X10_TEMP2.y);

final double X10_TEMP18 = (X10_TEMP264);
final double X10_TEMP267 = (X10_TEMP17*X10_TEMP18);

final double X10_TEMP21 = (X10_TEMP267);
final double X10_TEMP270 = (X10_TEMP1.y);

final double X10_TEMP19 = (X10_TEMP270);
final double X10_TEMP273 = (X10_TEMP2.x);

final double X10_TEMP20 = (X10_TEMP273);
final double X10_TEMP276 = (X10_TEMP19*X10_TEMP20);

final double X10_TEMP22 = (X10_TEMP276);
final double X10_TEMP279 = (X10_TEMP21-X10_TEMP22);

double X10_TEMP27 = (X10_TEMP279);
final boolean X10_TEMP282 = (false);

boolean X10_TEMP28 = (X10_TEMP282);
final Vec X10_TEMP289 = (new Vec(X10_TEMP25,X10_TEMP26,X10_TEMP27,X10_TEMP28));

final Vec X10_TEMP30 = (X10_TEMP289);
return X10_TEMP30;
}
public static double Program_Vec_dot(final Vec a, final Vec b) {
Vec X10_TEMP1 = (a);
Vec X10_TEMP2 = (b);
final double X10_TEMP219 = (X10_TEMP1.x);

final double X10_TEMP3 = (X10_TEMP219);
final double X10_TEMP222 = (X10_TEMP2.x);

final double X10_TEMP4 = (X10_TEMP222);
final double X10_TEMP225 = (X10_TEMP3*X10_TEMP4);

final double X10_TEMP7 = (X10_TEMP225);
final double X10_TEMP228 = (X10_TEMP1.y);

final double X10_TEMP5 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP2.y);

final double X10_TEMP6 = (X10_TEMP231);
final double X10_TEMP234 = (X10_TEMP5*X10_TEMP6);

final double X10_TEMP8 = (X10_TEMP234);
final double X10_TEMP237 = (X10_TEMP7+X10_TEMP8);

final double X10_TEMP11 = (X10_TEMP237);
final double X10_TEMP240 = (X10_TEMP1.z);

final double X10_TEMP9 = (X10_TEMP240);
final double X10_TEMP243 = (X10_TEMP2.z);

final double X10_TEMP10 = (X10_TEMP243);
final double X10_TEMP246 = (X10_TEMP9*X10_TEMP10);

final double X10_TEMP12 = (X10_TEMP246);
final double X10_TEMP249 = (X10_TEMP11+X10_TEMP12);

final double X10_TEMP14 = (X10_TEMP249);
return X10_TEMP14;
}
public static Vec Program_Vec_comb(final double a, final Vec A, final double b, final Vec B) {
double X10_TEMP1 = (a);
Vec X10_TEMP2 = (A);
double X10_TEMP3 = (b);
Vec X10_TEMP4 = (B);
final double X10_TEMP221 = (X10_TEMP2.x);

final double X10_TEMP5 = (X10_TEMP221);
final double X10_TEMP224 = (X10_TEMP1*X10_TEMP5);

final double X10_TEMP7 = (X10_TEMP224);
final double X10_TEMP227 = (X10_TEMP4.x);

final double X10_TEMP6 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP3*X10_TEMP6);

final double X10_TEMP8 = (X10_TEMP230);
final double X10_TEMP233 = (X10_TEMP7+X10_TEMP8);

double X10_TEMP21 = (X10_TEMP233);
final double X10_TEMP236 = (X10_TEMP2.y);

final double X10_TEMP10 = (X10_TEMP236);
final double X10_TEMP239 = (X10_TEMP1*X10_TEMP10);

final double X10_TEMP12 = (X10_TEMP239);
final double X10_TEMP242 = (X10_TEMP4.y);

final double X10_TEMP11 = (X10_TEMP242);
final double X10_TEMP245 = (X10_TEMP3*X10_TEMP11);

final double X10_TEMP13 = (X10_TEMP245);
final double X10_TEMP248 = (X10_TEMP12+X10_TEMP13);

double X10_TEMP22 = (X10_TEMP248);
final double X10_TEMP251 = (X10_TEMP2.z);

final double X10_TEMP15 = (X10_TEMP251);
final double X10_TEMP254 = (X10_TEMP1*X10_TEMP15);

final double X10_TEMP17 = (X10_TEMP254);
final double X10_TEMP257 = (X10_TEMP4.z);

final double X10_TEMP16 = (X10_TEMP257);
final double X10_TEMP260 = (X10_TEMP3*X10_TEMP16);

final double X10_TEMP18 = (X10_TEMP260);
final double X10_TEMP263 = (X10_TEMP17+X10_TEMP18);

double X10_TEMP23 = (X10_TEMP263);
final boolean X10_TEMP266 = (false);

boolean X10_TEMP24 = (X10_TEMP266);
final Vec X10_TEMP273 = (new Vec(X10_TEMP21,X10_TEMP22,X10_TEMP23,X10_TEMP24));

final Vec X10_TEMP26 = (X10_TEMP273);
return X10_TEMP26;
}
public static Vec Program_Vec_scale(final Vec X10_TEMP0, final double t) {
double X10_TEMP1 = (t);
final double X10_TEMP218 = (X10_TEMP0.x);

final double X10_TEMP2 = (X10_TEMP218);
final double X10_TEMP221 = (X10_TEMP2*X10_TEMP1);

double X10_TEMP9 = (X10_TEMP221);
final double X10_TEMP224 = (X10_TEMP0.y);

final double X10_TEMP4 = (X10_TEMP224);
final double X10_TEMP227 = (X10_TEMP4*X10_TEMP1);

double X10_TEMP10 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP0.z);

final double X10_TEMP6 = (X10_TEMP230);
final double X10_TEMP233 = (X10_TEMP6*X10_TEMP1);

double X10_TEMP11 = (X10_TEMP233);
final boolean X10_TEMP236 = (false);

boolean X10_TEMP12 = (X10_TEMP236);
final Vec X10_TEMP243 = (new Vec(X10_TEMP9,X10_TEMP10,X10_TEMP11,X10_TEMP12));

final Vec X10_TEMP14 = (X10_TEMP243);
return X10_TEMP14;
}
public static Vec Program_Vec_negate(final Vec X10_TEMP0) {
final double X10_TEMP217 = (X10_TEMP0.x);

final double X10_TEMP1 = (X10_TEMP217);
final int X10_TEMP2 = (0);
final double X10_TEMP221 = (X10_TEMP2-X10_TEMP1);

double X10_TEMP11 = (X10_TEMP221);
final double X10_TEMP224 = (X10_TEMP0.y);

final double X10_TEMP4 = (X10_TEMP224);
final int X10_TEMP5 = (0);
final double X10_TEMP228 = (X10_TEMP5-X10_TEMP4);

double X10_TEMP12 = (X10_TEMP228);
final double X10_TEMP231 = (X10_TEMP0.z);

final double X10_TEMP7 = (X10_TEMP231);
final int X10_TEMP8 = (0);
final double X10_TEMP235 = (X10_TEMP8-X10_TEMP7);

double X10_TEMP13 = (X10_TEMP235);
final boolean X10_TEMP238 = (false);

boolean X10_TEMP14 = (X10_TEMP238);
final Vec X10_TEMP245 = (new Vec(X10_TEMP11,X10_TEMP12,X10_TEMP13,X10_TEMP14));

final Vec X10_TEMP16 = (X10_TEMP245);
return X10_TEMP16;
}
public static Vec Program_Vec_normalized(final Vec X10_TEMP0) {
final double X10_TEMP217 = (X10_TEMP0.x);

final double X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (X10_TEMP0.x);

final double X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (X10_TEMP1*X10_TEMP2);

final double X10_TEMP5 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP0.y);

final double X10_TEMP3 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP0.y);

final double X10_TEMP4 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP3*X10_TEMP4);

final double X10_TEMP6 = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP5+X10_TEMP6);

final double X10_TEMP9 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP0.z);

final double X10_TEMP7 = (X10_TEMP238);
final double X10_TEMP241 = (X10_TEMP0.z);

final double X10_TEMP8 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP7*X10_TEMP8);

final double X10_TEMP10 = (X10_TEMP244);
final double X10_TEMP247 = (X10_TEMP9+X10_TEMP10);

final double X10_TEMP12 = (X10_TEMP247);
final double X10_TEMP251 = (Math.sqrt(X10_TEMP12));

double len = (X10_TEMP251);
final double X10_TEMP254 = (0.0);

final double X10_TEMP14 = (X10_TEMP254);
final boolean X10_TEMP257 = (len>X10_TEMP14);

final boolean X10_TEMP16 = (X10_TEMP257);
final boolean X10_TEMP17 = (X10_TEMP16);
final double X10_TEMP261 = (X10_TEMP0.x);

final double X10_TEMP18 = (X10_TEMP261);
final double X10_TEMP264 = (X10_TEMP18/len);

double X10_TEMP25 = (X10_TEMP264);
final double X10_TEMP267 = (X10_TEMP0.y);

final double X10_TEMP20 = (X10_TEMP267);
final double X10_TEMP270 = (X10_TEMP20/len);

double X10_TEMP26 = (X10_TEMP270);
final double X10_TEMP273 = (X10_TEMP0.z);

final double X10_TEMP22 = (X10_TEMP273);
final double X10_TEMP276 = (X10_TEMP22/len);

double X10_TEMP27 = (X10_TEMP276);
final boolean X10_TEMP279 = (false);

boolean X10_TEMP28 = (X10_TEMP279);
Vec X10_TEMP31 = (X10_TEMP0);
if (X10_TEMP17) {
final Vec X10_TEMP288 = (new Vec(X10_TEMP25,X10_TEMP26,X10_TEMP27,X10_TEMP28));
X10_TEMP31 = (X10_TEMP288);
}
final Vec X10_TEMP32 = (X10_TEMP31);
return X10_TEMP32;
}
public static double Program_Vec_length(final Vec X10_TEMP0) {
final double X10_TEMP217 = (X10_TEMP0.x);

final double X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (X10_TEMP0.x);

final double X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (X10_TEMP1*X10_TEMP2);

final double X10_TEMP5 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP0.y);

final double X10_TEMP3 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP0.y);

final double X10_TEMP4 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP3*X10_TEMP4);

final double X10_TEMP6 = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP5+X10_TEMP6);

final double X10_TEMP9 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP0.z);

final double X10_TEMP7 = (X10_TEMP238);
final double X10_TEMP241 = (X10_TEMP0.z);

final double X10_TEMP8 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP7*X10_TEMP8);

final double X10_TEMP10 = (X10_TEMP244);
final double X10_TEMP247 = (X10_TEMP9+X10_TEMP10);

final double X10_TEMP12 = (X10_TEMP247);
final double X10_TEMP251 = (Math.sqrt(X10_TEMP12));

final double X10_TEMP14 = (X10_TEMP251);
return X10_TEMP14;
}
public static String Program_Vec_toString(final Vec X10_TEMP0) {
final String X10_TEMP217 = ("<");

final String X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (X10_TEMP0.x);

final double X10_TEMP2 = (X10_TEMP220);
final String X10_TEMP223 = (X10_TEMP1+X10_TEMP2);

final String X10_TEMP3 = (X10_TEMP223);
final String X10_TEMP226 = (",");

final String X10_TEMP4 = (X10_TEMP226);
final String X10_TEMP229 = (X10_TEMP3+X10_TEMP4);

final String X10_TEMP5 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP0.y);

final double X10_TEMP6 = (X10_TEMP232);
final String X10_TEMP235 = (X10_TEMP5+X10_TEMP6);

final String X10_TEMP7 = (X10_TEMP235);
final String X10_TEMP238 = (",");

final String X10_TEMP8 = (X10_TEMP238);
final String X10_TEMP241 = (X10_TEMP7+X10_TEMP8);

final String X10_TEMP9 = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP0.z);

final double X10_TEMP10 = (X10_TEMP244);
final String X10_TEMP247 = (X10_TEMP9+X10_TEMP10);

final String X10_TEMP11 = (X10_TEMP247);
final String X10_TEMP250 = (">");

final String X10_TEMP12 = (X10_TEMP250);
final String X10_TEMP253 = (X10_TEMP11+X10_TEMP12);

final String X10_TEMP14 = (X10_TEMP253);
return X10_TEMP14;
}
public static String Program_View_toString(final View X10_TEMP0) {
final String X10_TEMP217 = ("View { from = ");

final String X10_TEMP1 = (X10_TEMP217);
final Vec X10_TEMP220 = (X10_TEMP0.from);

final Vec X10_TEMP2 = (X10_TEMP220);
final String X10_TEMP224 = (Program0.Program_Vec_toString(X10_TEMP2));

final String X10_TEMP3 = (X10_TEMP224);
final String X10_TEMP227 = (X10_TEMP1+X10_TEMP3);

final String X10_TEMP4 = (X10_TEMP227);
final String X10_TEMP230 = (" at = ");

final String X10_TEMP5 = (X10_TEMP230);
final String X10_TEMP233 = (X10_TEMP4+X10_TEMP5);

final String X10_TEMP6 = (X10_TEMP233);
final Vec X10_TEMP236 = (X10_TEMP0.at);

final Vec X10_TEMP7 = (X10_TEMP236);
final String X10_TEMP240 = (Program0.Program_Vec_toString(X10_TEMP7));

final String X10_TEMP8 = (X10_TEMP240);
final String X10_TEMP243 = (X10_TEMP6+X10_TEMP8);

final String X10_TEMP9 = (X10_TEMP243);
final String X10_TEMP246 = (" up = ");

final String X10_TEMP10 = (X10_TEMP246);
final String X10_TEMP249 = (X10_TEMP9+X10_TEMP10);

final String X10_TEMP11 = (X10_TEMP249);
final Vec X10_TEMP252 = (X10_TEMP0.up);

final Vec X10_TEMP12 = (X10_TEMP252);
final String X10_TEMP256 = (Program0.Program_Vec_toString(X10_TEMP12));

final String X10_TEMP13 = (X10_TEMP256);
final String X10_TEMP259 = (X10_TEMP11+X10_TEMP13);

final String X10_TEMP14 = (X10_TEMP259);
final String X10_TEMP262 = (" distance = ");

final String X10_TEMP15 = (X10_TEMP262);
final String X10_TEMP265 = (X10_TEMP14+X10_TEMP15);

final String X10_TEMP16 = (X10_TEMP265);
final double X10_TEMP268 = (X10_TEMP0.distance);

final double X10_TEMP17 = (X10_TEMP268);
final String X10_TEMP271 = (X10_TEMP16+X10_TEMP17);

final String X10_TEMP18 = (X10_TEMP271);
final String X10_TEMP274 = (" angle = ");

final String X10_TEMP19 = (X10_TEMP274);
final String X10_TEMP277 = (X10_TEMP18+X10_TEMP19);

final String X10_TEMP20 = (X10_TEMP277);
final double X10_TEMP280 = (X10_TEMP0.angle);

final double X10_TEMP21 = (X10_TEMP280);
final String X10_TEMP283 = (X10_TEMP20+X10_TEMP21);

final String X10_TEMP22 = (X10_TEMP283);
final String X10_TEMP286 = (" aspect = ");

final String X10_TEMP23 = (X10_TEMP286);
final String X10_TEMP289 = (X10_TEMP22+X10_TEMP23);

final String X10_TEMP24 = (X10_TEMP289);
final double X10_TEMP292 = (X10_TEMP0.aspect);

final double X10_TEMP25 = (X10_TEMP292);
final String X10_TEMP295 = (X10_TEMP24+X10_TEMP25);

final String X10_TEMP26 = (X10_TEMP295);
final String X10_TEMP298 = ("}");

final String X10_TEMP27 = (X10_TEMP298);
final String X10_TEMP301 = (X10_TEMP26+X10_TEMP27);

final String X10_TEMP29 = (X10_TEMP301);
return X10_TEMP29;
}

}

class Program {
}

value Envelope2 {
public final int i;
public final Light value[:rank==1] a;


public Envelope2(final int i1, final Light value[:rank==1] a1) {
final int X10_TEMP217 = (i1);

int X10_TEMP1 = (X10_TEMP217);
final Light value[:rank==1] X10_TEMP220 = (Light value[:rank==1])(a1);

Light value[:rank==1] X10_TEMP2 = (Light value[:rank==1])(X10_TEMP220);
final int X10_TEMP223 = (X10_TEMP1);

i = (X10_TEMP223);
final Light value[:rank==1] X10_TEMP226 = (Light value[:rank==1])(X10_TEMP2);

a = (Light value[:rank==1])(X10_TEMP226);
}


}

value Envelope {
public final int i;
public final Sphere value[:rank==1] a;


public Envelope(final int i1, final Sphere value[:rank==1] a1) {
final int X10_TEMP217 = (i1);

int X10_TEMP1 = (X10_TEMP217);
final Sphere value[:rank==1] X10_TEMP220 = (Sphere value[:rank==1])(a1);

Sphere value[:rank==1] X10_TEMP2 = (Sphere value[:rank==1])(X10_TEMP220);
final int X10_TEMP223 = (X10_TEMP1);

i = (X10_TEMP223);
final Sphere value[:rank==1] X10_TEMP226 = (Sphere value[:rank==1])(X10_TEMP2);

a = (Sphere value[:rank==1])(X10_TEMP226);
}


}

value Interval {
public final int number;
public final int width;
public final int height;
public final int yfrom;
public final int yto;
public final int total;


public Interval(final int number_, final int width_, final int height_, final int yfrom_, final int yto_, final int total_) {
final int X10_TEMP217 = (number_);

int X10_TEMP1 = (X10_TEMP217);
final int X10_TEMP220 = (width_);

int X10_TEMP2 = (X10_TEMP220);
final int X10_TEMP223 = (height_);

int X10_TEMP3 = (X10_TEMP223);
final int X10_TEMP226 = (yfrom_);

int X10_TEMP4 = (X10_TEMP226);
final int X10_TEMP229 = (yto_);

int X10_TEMP5 = (X10_TEMP229);
final int X10_TEMP232 = (total_);

int X10_TEMP6 = (X10_TEMP232);
final int X10_TEMP235 = (X10_TEMP1);

number = (X10_TEMP235);
final int X10_TEMP238 = (X10_TEMP2);

width = (X10_TEMP238);
final int X10_TEMP241 = (X10_TEMP3);

height = (X10_TEMP241);
final int X10_TEMP244 = (X10_TEMP4);

yfrom = (X10_TEMP244);
final int X10_TEMP247 = (X10_TEMP5);

yto = (X10_TEMP247);
final int X10_TEMP250 = (X10_TEMP6);

total = (X10_TEMP250);
}


}

class Isect {
public double t;
public int enter;
public Sphere prim;
public Surface surf;
public boolean isNull;


public Isect() {
final double X10_TEMP217 = (0.0);

final double X10_TEMP2 = (X10_TEMP217);
final double X10_TEMP220 = (X10_TEMP2);

t = (X10_TEMP220);
final int X10_TEMP223 = (0);

final int X10_TEMP4 = (X10_TEMP223);
final int X10_TEMP226 = (X10_TEMP4);

enter = (X10_TEMP226);
final boolean X10_TEMP229 = (false);

final boolean X10_TEMP6 = (X10_TEMP229);
final boolean X10_TEMP232 = (X10_TEMP6);

isNull = (X10_TEMP232);
}
public Isect(final double t_, final int enter_, final boolean isNull_, final Sphere prim_, final Surface surf_) {
final double X10_TEMP217 = (t_);

double X10_TEMP1 = (X10_TEMP217);
final int X10_TEMP220 = (enter_);

int X10_TEMP2 = (X10_TEMP220);
final boolean X10_TEMP223 = (isNull_);

boolean X10_TEMP3 = (X10_TEMP223);
final Sphere X10_TEMP226 = (prim_);

Sphere X10_TEMP4 = (X10_TEMP226);
final Surface X10_TEMP229 = (surf_);

Surface X10_TEMP5 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP1);

t = (X10_TEMP232);
final boolean X10_TEMP235 = (X10_TEMP3);

isNull = (X10_TEMP235);
final int X10_TEMP238 = (X10_TEMP2);

enter = (X10_TEMP238);
final Sphere X10_TEMP241 = (X10_TEMP4);

prim = (X10_TEMP241);
final Surface X10_TEMP244 = (X10_TEMP5);

surf = (X10_TEMP244);
}


}

value Light {
public final Vec pos;
public final double brightness;


public Light(final double x, final double y, final double z, final double b) {
final double X10_TEMP217 = (x);

double X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (y);

double X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (z);

double X10_TEMP3 = (X10_TEMP223);
final double X10_TEMP226 = (b);

double X10_TEMP4 = (X10_TEMP226);
final boolean X10_TEMP229 = (false);

boolean X10_TEMP9 = (X10_TEMP229);
final Vec X10_TEMP236 = (new Vec(X10_TEMP1,X10_TEMP2,X10_TEMP3,X10_TEMP9));

final Vec X10_TEMP11 = (X10_TEMP236);
final Vec X10_TEMP239 = (X10_TEMP11);

pos = (X10_TEMP239);
final double X10_TEMP242 = (X10_TEMP4);

brightness = (X10_TEMP242);
}


}

class RayTracer {
public Scene scene;
public int lightCount;
public int objCount;
public Light value[:rank==1] lights;
public Sphere value[:rank==1] prim;
public View view;
public int height;
public int width;
public int [:rank==1] datasizes;
public long checksum;
public long [:rank==1] checkSumArray;
public int size_t;
public int numobjects;


public RayTracer() {
}


}

class Ray {
public Vec p;
public Vec d;


public Ray(final Vec pnt, final Vec dir) {
final Vec X10_TEMP217 = (pnt);

Vec X10_TEMP1 = (X10_TEMP217);
final Vec X10_TEMP220 = (dir);

Vec X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (X10_TEMP1.x);

double X10_TEMP7 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP1.y);

double X10_TEMP8 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP1.z);

double X10_TEMP9 = (X10_TEMP229);
final boolean X10_TEMP232 = (false);

boolean X10_TEMP10 = (X10_TEMP232);
final Vec X10_TEMP239 = (new Vec(X10_TEMP7,X10_TEMP8,X10_TEMP9,X10_TEMP10));

final Vec X10_TEMP12 = (X10_TEMP239);
final Vec X10_TEMP242 = (X10_TEMP12);

p = (X10_TEMP242);
final double X10_TEMP245 = (X10_TEMP2.x);

double X10_TEMP17 = (X10_TEMP245);
final double X10_TEMP248 = (X10_TEMP2.y);

double X10_TEMP18 = (X10_TEMP248);
final double X10_TEMP251 = (X10_TEMP2.z);

double X10_TEMP19 = (X10_TEMP251);
final boolean X10_TEMP254 = (false);

boolean X10_TEMP20 = (X10_TEMP254);
final Vec X10_TEMP261 = (new Vec(X10_TEMP17,X10_TEMP18,X10_TEMP19,X10_TEMP20));

final Vec X10_TEMP21 = (X10_TEMP261);
final Vec X10_TEMP265 = (Program0.Program_Vec_normalized(X10_TEMP21));

final Vec X10_TEMP23 = (X10_TEMP265);
final Vec X10_TEMP268 = (X10_TEMP23);

d = (X10_TEMP268);
}
public Ray(final Vec pnt, final Vec dir, final boolean normalize) {
final Vec X10_TEMP217 = (pnt);

Vec X10_TEMP1 = (X10_TEMP217);
final Vec X10_TEMP220 = (dir);

Vec X10_TEMP2 = (X10_TEMP220);
final boolean X10_TEMP223 = (normalize);

boolean X10_TEMP3 = (X10_TEMP223);
if (X10_TEMP3) {
final double X10_TEMP227 = (X10_TEMP1.x);

double X10_TEMP9 = (X10_TEMP227);
final double X10_TEMP230 = (X10_TEMP1.y);

double X10_TEMP10 = (X10_TEMP230);
final double X10_TEMP233 = (X10_TEMP1.z);

double X10_TEMP11 = (X10_TEMP233);
final boolean X10_TEMP236 = (false);

boolean X10_TEMP12 = (X10_TEMP236);
final Vec X10_TEMP243 = (new Vec(X10_TEMP9,X10_TEMP10,X10_TEMP11,X10_TEMP12));

final Vec X10_TEMP14 = (X10_TEMP243);
final Vec X10_TEMP246 = (X10_TEMP14);

p = (X10_TEMP246);
final double X10_TEMP249 = (X10_TEMP2.x);

double X10_TEMP19 = (X10_TEMP249);
final double X10_TEMP252 = (X10_TEMP2.y);

double X10_TEMP20 = (X10_TEMP252);
final double X10_TEMP255 = (X10_TEMP2.z);

double X10_TEMP21 = (X10_TEMP255);
final boolean X10_TEMP258 = (false);

boolean X10_TEMP22 = (X10_TEMP258);
final Vec X10_TEMP265 = (new Vec(X10_TEMP19,X10_TEMP20,X10_TEMP21,X10_TEMP22));

final Vec X10_TEMP23 = (X10_TEMP265);
final Vec X10_TEMP269 = (Program0.Program_Vec_normalized(X10_TEMP23));

final Vec X10_TEMP25 = (X10_TEMP269);
final Vec X10_TEMP272 = (X10_TEMP25);

d = (X10_TEMP272);
}
else {
final Vec X10_TEMP275 = (X10_TEMP1);

p = (X10_TEMP275);
final Vec X10_TEMP278 = (X10_TEMP2);

d = (X10_TEMP278);
}
}
public Ray() {
final Vec X10_TEMP217 = (new Vec());

final Vec X10_TEMP2 = (X10_TEMP217);
final Vec X10_TEMP220 = (X10_TEMP2);

p = (X10_TEMP220);
final Vec X10_TEMP223 = (new Vec());

final Vec X10_TEMP4 = (X10_TEMP223);
final Vec X10_TEMP226 = (X10_TEMP4);

d = (X10_TEMP226);
}


}

class Scene {
public final Light [:rank==1] lights;
public final Sphere [:rank==1] objects;
public final View view;


public int lightCount;
public int objectCount;


public Scene(final View v) {
final View X10_TEMP217 = (v);

View X10_TEMP1 = (X10_TEMP217);
final int X10_TEMP220 = (0);

final int X10_TEMP6 = (X10_TEMP220);
final int X10_TEMP223 = (Program0._Program__Scene_maxLights);

final int X10_TEMP3 = (X10_TEMP223);
final int X10_TEMP226 = (1);

final int X10_TEMP4 = (X10_TEMP226);
final int X10_TEMP229 = (X10_TEMP3-X10_TEMP4);

final int X10_TEMP7 = (X10_TEMP229);
final region(:rank==1) X10_TEMP234 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);

final region(:rank==1) X10_TEMP8 = (region(:rank==1))(X10_TEMP234);
final place X10_TEMP237 = (here);

final place X10_TEMP9 = (X10_TEMP237);
final dist(:rank==1) X10_TEMP240 = (dist(:rank==1))(X10_TEMP8->X10_TEMP9);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP240);
final Light[:rank==1] X10_TEMP243 = (Light[:rank==1])(new Light[d1]);

final Light[:rank==1] X10_TEMP12 = (Light[:rank==1])(X10_TEMP243);
final Light[:rank==1] X10_TEMP246 = (Light[:rank==1])(X10_TEMP12);

lights = (Light[:rank==1])(X10_TEMP246);
final int X10_TEMP249 = (0);

final int X10_TEMP17 = (X10_TEMP249);
final int X10_TEMP252 = (Program0._Program__Scene_maxObjects);

final int X10_TEMP14 = (X10_TEMP252);
final int X10_TEMP255 = (1);

final int X10_TEMP15 = (X10_TEMP255);
final int X10_TEMP258 = (X10_TEMP14-X10_TEMP15);

final int X10_TEMP18 = (X10_TEMP258);
final region(:rank==1) X10_TEMP263 = (region(:rank==1))([X10_TEMP17:X10_TEMP18]);

final region(:rank==1) X10_TEMP19 = (region(:rank==1))(X10_TEMP263);
final place X10_TEMP266 = (here);

final place X10_TEMP20 = (X10_TEMP266);
final dist(:rank==1) X10_TEMP269 = (dist(:rank==1))(X10_TEMP19->X10_TEMP20);

dist(:rank==1) d2 = (dist(:rank==1))(X10_TEMP269);
final Sphere[:rank==1] X10_TEMP272 = (Sphere[:rank==1])(new Sphere[d2]);

final Sphere[:rank==1] X10_TEMP23 = (Sphere[:rank==1])(X10_TEMP272);
final Sphere[:rank==1] X10_TEMP275 = (Sphere[:rank==1])(X10_TEMP23);

objects = (Sphere[:rank==1])(X10_TEMP275);
final View X10_TEMP278 = (X10_TEMP1);

view = (X10_TEMP278);
final int X10_TEMP281 = (0);

final int X10_TEMP26 = (X10_TEMP281);
final int X10_TEMP284 = (X10_TEMP26);

lightCount = (X10_TEMP284);
final int X10_TEMP287 = (0);

final int X10_TEMP28 = (X10_TEMP287);
final int X10_TEMP290 = (X10_TEMP28);

objectCount = (X10_TEMP290);
}


}

value Sphere {
public final Vec c;
public final double r;
public final double r2;
public final Surface surf;


public Sphere(final Vec center, final double radius, final Surface s) {
final Vec X10_TEMP217 = (center);

Vec X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (radius);

double X10_TEMP2 = (X10_TEMP220);
final Surface X10_TEMP223 = (s);

Surface X10_TEMP3 = (X10_TEMP223);
final Surface X10_TEMP226 = (X10_TEMP3);

surf = (X10_TEMP226);
final Vec X10_TEMP229 = (X10_TEMP1);

c = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP2);

r = (X10_TEMP232);
final double X10_TEMP235 = (r*r);

final double X10_TEMP8 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP8);

r2 = (X10_TEMP238);
}
public Sphere(final Vec center, final double radius) {
final Vec X10_TEMP217 = (center);

Vec X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (radius);

double X10_TEMP2 = (X10_TEMP220);
final Vec X10_TEMP223 = (X10_TEMP1);

c = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP2);

r = (X10_TEMP226);
final double X10_TEMP229 = (r*r);

final double X10_TEMP6 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP6);

r2 = (X10_TEMP232);
final Surface X10_TEMP235 = (new Surface());

final Surface X10_TEMP8 = (X10_TEMP235);
final Surface X10_TEMP238 = (X10_TEMP8);

surf = (X10_TEMP238);
}


}

value Surface {
public final Vec color;
public final double kd;
public final double ks;
public final double shine;
public final double kt;
public final double ior;
public final boolean isNull;


public Surface() {
final int X10_TEMP217 = (1);

int X10_TEMP5 = (X10_TEMP217);
final int X10_TEMP220 = (0);

int X10_TEMP6 = (X10_TEMP220);
final int X10_TEMP223 = (0);

int X10_TEMP7 = (X10_TEMP223);
final boolean X10_TEMP226 = (false);

boolean X10_TEMP8 = (X10_TEMP226);
final Vec X10_TEMP233 = (new Vec(X10_TEMP5,X10_TEMP6,X10_TEMP7,X10_TEMP8));

final Vec X10_TEMP10 = (X10_TEMP233);
final Vec X10_TEMP236 = (X10_TEMP10);

color = (X10_TEMP236);
final double X10_TEMP239 = (1.0);

final double X10_TEMP12 = (X10_TEMP239);
final double X10_TEMP242 = (X10_TEMP12);

kd = (X10_TEMP242);
final double X10_TEMP245 = (0.0);

final double X10_TEMP14 = (X10_TEMP245);
final double X10_TEMP248 = (X10_TEMP14);

ks = (X10_TEMP248);
final double X10_TEMP251 = (0.0);

final double X10_TEMP16 = (X10_TEMP251);
final double X10_TEMP254 = (X10_TEMP16);

shine = (X10_TEMP254);
final double X10_TEMP257 = (0.0);

final double X10_TEMP18 = (X10_TEMP257);
final double X10_TEMP260 = (X10_TEMP18);

kt = (X10_TEMP260);
final double X10_TEMP263 = (1.0);

final double X10_TEMP20 = (X10_TEMP263);
final double X10_TEMP266 = (X10_TEMP20);

ior = (X10_TEMP266);
final boolean X10_TEMP269 = (false);

final boolean X10_TEMP22 = (X10_TEMP269);
final boolean X10_TEMP272 = (X10_TEMP22);

isNull = (X10_TEMP272);
}
public Surface(final double shine_, final double ks_, final double kt_, final Vec c_, final boolean isNull_) {
final double X10_TEMP217 = (shine_);

double X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (ks_);

double X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (kt_);

double X10_TEMP3 = (X10_TEMP223);
final Vec X10_TEMP226 = (c_);

Vec X10_TEMP4 = (X10_TEMP226);
final boolean X10_TEMP229 = (isNull_);

boolean X10_TEMP5 = (X10_TEMP229);
final double X10_TEMP232 = (1.0);

final double X10_TEMP7 = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP7);

kd = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP2);

ks = (X10_TEMP238);
final double X10_TEMP241 = (X10_TEMP1);

shine = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP3);

kt = (X10_TEMP244);
final double X10_TEMP247 = (1.0);

final double X10_TEMP12 = (X10_TEMP247);
final double X10_TEMP250 = (X10_TEMP12);

ior = (X10_TEMP250);
final Vec X10_TEMP253 = (X10_TEMP4);

color = (X10_TEMP253);
final boolean X10_TEMP256 = (X10_TEMP5);

isNull = (X10_TEMP256);
}


}

value Vec {
public final double x;
public final double y;
public final double z;
public final boolean isNull;


public Vec(final double a, final double b, final double c, final boolean isNull_) {
final double X10_TEMP217 = (a);

double X10_TEMP1 = (X10_TEMP217);
final double X10_TEMP220 = (b);

double X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (c);

double X10_TEMP3 = (X10_TEMP223);
final boolean X10_TEMP226 = (isNull_);

boolean X10_TEMP4 = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP1);

x = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP2);

y = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP3);

z = (X10_TEMP235);
final boolean X10_TEMP238 = (X10_TEMP4);

isNull = (X10_TEMP238);
}
public Vec(final Vec a, final boolean isNull_) {
final Vec X10_TEMP217 = (a);

Vec X10_TEMP1 = (X10_TEMP217);
final boolean X10_TEMP220 = (isNull_);

boolean X10_TEMP2 = (X10_TEMP220);
final double X10_TEMP223 = (X10_TEMP1.x);

final double X10_TEMP4 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP4);

x = (X10_TEMP226);
final double X10_TEMP229 = (X10_TEMP1.y);

final double X10_TEMP6 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP6);

y = (X10_TEMP232);
final double X10_TEMP235 = (X10_TEMP1.z);

final double X10_TEMP8 = (X10_TEMP235);
final double X10_TEMP238 = (X10_TEMP8);

z = (X10_TEMP238);
final boolean X10_TEMP241 = (X10_TEMP2);

isNull = (X10_TEMP241);
}
public Vec() {
final double X10_TEMP217 = (0.0);

final double X10_TEMP2 = (X10_TEMP217);
final double X10_TEMP220 = (X10_TEMP2);

x = (X10_TEMP220);
final double X10_TEMP223 = (0.0);

final double X10_TEMP4 = (X10_TEMP223);
final double X10_TEMP226 = (X10_TEMP4);

y = (X10_TEMP226);
final double X10_TEMP229 = (0.0);

final double X10_TEMP6 = (X10_TEMP229);
final double X10_TEMP232 = (X10_TEMP6);

z = (X10_TEMP232);
final boolean X10_TEMP235 = (false);

final boolean X10_TEMP8 = (X10_TEMP235);
final boolean X10_TEMP238 = (X10_TEMP8);

isNull = (X10_TEMP238);
}


}

value View {
public final Vec from;
public final Vec at;
public final Vec up;
public final double distance;
public final double angle;
public final double aspect;


public View(final Vec from_, final Vec at_, final Vec up_, final double dist_, final double angle_, final double aspect_) {
final Vec X10_TEMP217 = (from_);

Vec X10_TEMP1 = (X10_TEMP217);
final Vec X10_TEMP220 = (at_);

Vec X10_TEMP2 = (X10_TEMP220);
final Vec X10_TEMP223 = (up_);

Vec X10_TEMP3 = (X10_TEMP223);
final double X10_TEMP226 = (dist_);

double X10_TEMP4 = (X10_TEMP226);
final double X10_TEMP229 = (angle_);

double X10_TEMP5 = (X10_TEMP229);
final double X10_TEMP232 = (aspect_);

double X10_TEMP6 = (X10_TEMP232);
final Vec X10_TEMP235 = (X10_TEMP1);

from = (X10_TEMP235);
final Vec X10_TEMP238 = (X10_TEMP2);

at = (X10_TEMP238);
final Vec X10_TEMP241 = (X10_TEMP3);

up = (X10_TEMP241);
final double X10_TEMP244 = (X10_TEMP4);

distance = (X10_TEMP244);
final double X10_TEMP247 = (X10_TEMP5);

angle = (X10_TEMP247);
final double X10_TEMP250 = (X10_TEMP6);

aspect = (X10_TEMP250);
}


}

