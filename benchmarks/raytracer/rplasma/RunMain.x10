public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _RayTracer_alpha = Program._RayTracer_alpha_init();
public static final Vec _RayTracer_voidVec = Program._RayTracer_voidVec_init();
public static final int _Scene_maxObjects = Program._Scene_maxObjects_init();
public static final int _Scene_maxLights = Program._Scene_maxLights_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static String Envelope2_toString(final Envelope2 X10_TEMP0) {
final String X10_TEMP2 = ("");
return X10_TEMP2;
}
public static String Envelope_toString(final Envelope X10_TEMP0) {
final String X10_TEMP2 = ("");
return X10_TEMP2;
}
public static String Interval_toString(final Interval X10_TEMP0) {
final int X10_TEMP1 = (X10_TEMP0.number);
final String X10_TEMP2 = (" ");
final String X10_TEMP3 = (X10_TEMP1+X10_TEMP2);
final int X10_TEMP4 = (X10_TEMP0.width);
final String X10_TEMP5 = (X10_TEMP3+X10_TEMP4);
final String X10_TEMP6 = (" ");
final String X10_TEMP7 = (X10_TEMP5+X10_TEMP6);
final int X10_TEMP8 = (X10_TEMP0.height);
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" ");
final String X10_TEMP11 = (X10_TEMP9+X10_TEMP10);
final int X10_TEMP12 = (X10_TEMP0.yfrom);
final String X10_TEMP13 = (X10_TEMP11+X10_TEMP12);
final String X10_TEMP14 = (" ");
final String X10_TEMP15 = (X10_TEMP13+X10_TEMP14);
final int X10_TEMP16 = (X10_TEMP0.yto);
final String X10_TEMP17 = (X10_TEMP15+X10_TEMP16);
final String X10_TEMP18 = (" ");
final String X10_TEMP19 = (X10_TEMP17+X10_TEMP18);
final int X10_TEMP20 = (X10_TEMP0.total);

final String X10_TEMP22 = (X10_TEMP19+X10_TEMP20);
return X10_TEMP22;
}
public static String Light_toString(final Light X10_TEMP0) {
final Vec X10_TEMP1 = (X10_TEMP0.pos);
final String X10_TEMP2 = (" ");
final String X10_TEMP3 = (Program.Vec_toString(X10_TEMP1));
final String X10_TEMP4 = (X10_TEMP3+X10_TEMP2);
final double X10_TEMP5 = (X10_TEMP0.brightness);

final String X10_TEMP7 = (X10_TEMP4+X10_TEMP5);
return X10_TEMP7;
}
public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final RayTracer X10_TEMP4 = (new RayTracer());

Program.RayTracer_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for raytracer: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _RayTracer_alpha_init() {
final int X10_TEMP1 = (255);
final int X10_TEMP2 = (24);

final int X10_TEMP4 = (X10_TEMP1<<X10_TEMP2);
return X10_TEMP4;
}
public static Vec _RayTracer_voidVec_init() {

final Vec X10_TEMP2 = (new Vec());
return X10_TEMP2;
}
public static void RayTracer_JGFsetsize(final RayTracer X10_TEMP0, final int size_t) {
final long X10_TEMP3 = (0);
final long X10_TEMP4 = (X10_TEMP3);
X10_TEMP0.checksum = (X10_TEMP4);
final int X10_TEMP7 = (0);
final int X10_TEMP8 = (1);
final region(:rank==1) X10_TEMP9 = (region(:rank==1))([X10_TEMP7:X10_TEMP8]);
final place X10_TEMP10 = (here);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP9->X10_TEMP10);
final int[:rank==1] X10_TEMP14 = (int[:rank==1])(new int[d1]);
final int[:rank==1] X10_TEMP15 = (int[:rank==1])(X10_TEMP14);
X10_TEMP0.datasizes = (X10_TEMP15);
final int[:rank==1] X10_TEMP16 = (int[:rank==1])(X10_TEMP0.datasizes);
final int X10_TEMP18 = (0);

final int X10_TEMP21 = (20);
final int X10_TEMP22 = (X10_TEMP21);
X10_TEMP16[X10_TEMP18] = (X10_TEMP22);
final int[:rank==1] X10_TEMP23 = (int[:rank==1])(X10_TEMP0.datasizes);
final int X10_TEMP25 = (1);

final int X10_TEMP28 = (500);
final int X10_TEMP29 = (X10_TEMP28);
X10_TEMP23[X10_TEMP25] = (X10_TEMP29);
final int X10_TEMP32 = (size_t);
X10_TEMP0.size_t = (X10_TEMP32);
}
public static void RayTracer_JGFinitialise(final RayTracer X10_TEMP0) {
final int[:rank==1] X10_TEMP1 = (int[:rank==1])(X10_TEMP0.datasizes);
final int X10_TEMP3 = (X10_TEMP0.size_t);

final int X10_TEMP6 = (X10_TEMP1[X10_TEMP3]);
final int X10_TEMP7 = (X10_TEMP6);
X10_TEMP0.width = (X10_TEMP7);
final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP0.datasizes);
final int X10_TEMP10 = (X10_TEMP0.size_t);

final int X10_TEMP13 = (X10_TEMP8[X10_TEMP10]);
final int X10_TEMP14 = (X10_TEMP13);
X10_TEMP0.height = (X10_TEMP14);
final Scene X10_TEMP17 = (Program.RayTracer_createScene(X10_TEMP0));
final Scene X10_TEMP18 = (X10_TEMP17);
X10_TEMP0.scene = (X10_TEMP18);
final Scene X10_TEMP20 = (X10_TEMP0.scene);

Program.RayTracer_setScene(X10_TEMP0,X10_TEMP20);
final Scene X10_TEMP21 = (X10_TEMP0.scene);

final int X10_TEMP24 = (Program.Scene_getObjects(X10_TEMP21));
final int X10_TEMP25 = (X10_TEMP24);
X10_TEMP0.numobjects = (X10_TEMP25);
}
public static void RayTracer_JGFapplication(final RayTracer X10_TEMP0) {
int X10_TEMP7 = (0);
int X10_TEMP8 = (X10_TEMP0.width);
int X10_TEMP9 = (X10_TEMP0.height);
int X10_TEMP10 = (0);
int X10_TEMP11 = (X10_TEMP0.height);
int X10_TEMP12 = (1);

Interval interval = (new Interval(X10_TEMP7,X10_TEMP8,X10_TEMP9,X10_TEMP10,X10_TEMP11,X10_TEMP12));
Program.RayTracer_render(X10_TEMP0,interval);
}
public static void RayTracer_JGFvalidate(final RayTracer X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (1);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);
long[:rank==1] refval = (long[:rank==1])(new long[d1]);
final int X10_TEMP10 = (0);

final long X10_TEMP13 = (51428);
final long X10_TEMP14 = (X10_TEMP13);
refval[X10_TEMP10] = (X10_TEMP14);
final int X10_TEMP16 = (1);

final long X10_TEMP19 = (29827635);
final long X10_TEMP20 = (X10_TEMP19);
refval[X10_TEMP16] = (X10_TEMP20);
final long X10_TEMP23 = (X10_TEMP0.checksum);
final int X10_TEMP22 = (X10_TEMP0.size_t);
final long X10_TEMP24 = (refval[X10_TEMP22]);

long dev = (X10_TEMP23-X10_TEMP24);
final int X10_TEMP26 = (0);

final boolean X10_TEMP28 = dev!=X10_TEMP26;
if (X10_TEMP28) {
final String X10_TEMP30 = ("Validation failed");
System.out.println(X10_TEMP30);
final String X10_TEMP31 = ("Pixel checksum = ");
final long X10_TEMP32 = (X10_TEMP0.checksum);

final String X10_TEMP34 = (X10_TEMP31+X10_TEMP32);
System.out.println(X10_TEMP34);
final String X10_TEMP37 = ("Reference value = ");
final int X10_TEMP36 = (X10_TEMP0.size_t);
final long X10_TEMP38 = (refval[X10_TEMP36]);

final String X10_TEMP40 = (X10_TEMP37+X10_TEMP38);
System.out.println(X10_TEMP40);
final String X10_TEMP42 = ("Validation failed");
throw new RuntimeException(X10_TEMP42);
}
}
public static void RayTracer_JGFtidyup(final RayTracer X10_TEMP0) {
}
public static void RayTracer_run(final RayTracer X10_TEMP0) {
final int X10_TEMP2 = (0);

Program.RayTracer_JGFsetsize(X10_TEMP0,X10_TEMP2);
Program.RayTracer_JGFinitialise(X10_TEMP0);
Program.RayTracer_JGFapplication(X10_TEMP0);
Program.RayTracer_JGFvalidate(X10_TEMP0);
Program.RayTracer_JGFtidyup(X10_TEMP0);
}
public static Scene RayTracer_createScene(final RayTracer X10_TEMP0) {
final int x = (0);
final int y = (0);
int X10_TEMP9 = (20);
final int X10_TEMP5 = (30);
final int X10_TEMP6 = 0;

int X10_TEMP10 = (X10_TEMP6 - X10_TEMP5);
boolean X10_TEMP11 = (false);

Vec X10_TEMP36 = (new Vec(x,X10_TEMP9,X10_TEMP10,X10_TEMP11));
int X10_TEMP17 = (0);
boolean X10_TEMP18 = (false);

Vec X10_TEMP37 = (new Vec(x,y,X10_TEMP17,X10_TEMP18));
int X10_TEMP24 = (0);
int X10_TEMP25 = (1);
int X10_TEMP26 = (0);
boolean X10_TEMP27 = (false);

Vec X10_TEMP38 = (new Vec(X10_TEMP24,X10_TEMP25,X10_TEMP26,X10_TEMP27));
double X10_TEMP39 = (1.0);
final double X10_TEMP30 = (35.0);
final double X10_TEMP31 = (3.14159265);
final double X10_TEMP32 = (X10_TEMP30*X10_TEMP31);
final double X10_TEMP33 = (180.0);

double X10_TEMP40 = (X10_TEMP32/X10_TEMP33);
double X10_TEMP41 = (1.0);

View X10_TEMP43 = (new View(X10_TEMP36,X10_TEMP37,X10_TEMP38,X10_TEMP39,X10_TEMP40,X10_TEMP41));

Scene scene = (new Scene(X10_TEMP43));
final int nx = (4);
final int ny = (4);
final int nz = (4);
final int X10_TEMP51 = (0);
final int X10_TEMP49 = (1);
final int X10_TEMP52 = (nx-X10_TEMP49);
final int X10_TEMP56 = (0);
final int X10_TEMP54 = (1);
final int X10_TEMP57 = (ny-X10_TEMP54);
final int X10_TEMP61 = (0);
final int X10_TEMP59 = (1);
final int X10_TEMP62 = (nz-X10_TEMP59);

final region(:rank==3) reg = (region(:rank==3))([X10_TEMP51:X10_TEMP52,X10_TEMP56:X10_TEMP57,X10_TEMP61:X10_TEMP62]);
for(point(:rank==3)pp:reg) {
final double X10_TEMP68 = (20.0);
final int X10_TEMP65 = (1);

final int X10_TEMP67 = (nx-X10_TEMP65);
final double X10_TEMP70 = (X10_TEMP68/X10_TEMP67);
final int X10_TEMP71 = (pp[0]);
final double X10_TEMP72 = (X10_TEMP70*X10_TEMP71);
final double X10_TEMP73 = (10.0);

double xx = (X10_TEMP72-X10_TEMP73);
final double X10_TEMP78 = (20.0);
final int X10_TEMP75 = (1);

final int X10_TEMP77 = (ny-X10_TEMP75);
final double X10_TEMP80 = (X10_TEMP78/X10_TEMP77);
final int X10_TEMP81 = (pp[1]);
final double X10_TEMP82 = (X10_TEMP80*X10_TEMP81);
final double X10_TEMP83 = (10.0);

double yy = (X10_TEMP82-X10_TEMP83);
final double X10_TEMP88 = (20.0);
final int X10_TEMP85 = (1);

final int X10_TEMP87 = (nz-X10_TEMP85);
final double X10_TEMP90 = (X10_TEMP88/X10_TEMP87);
final int X10_TEMP91 = (pp[2]);
final double X10_TEMP92 = (X10_TEMP90*X10_TEMP91);
final double X10_TEMP93 = (10.0);

double zz = (X10_TEMP92-X10_TEMP93);
boolean X10_TEMP99 = (false);

Vec X10_TEMP136 = (new Vec(xx,yy,zz,X10_TEMP99));
int X10_TEMP137 = (3);
double X10_TEMP130 = (15.0);
final double X10_TEMP103 = (1.5);
final double X10_TEMP104 = (1.0);

double X10_TEMP131 = (X10_TEMP103-X10_TEMP104);
final double X10_TEMP106 = (1.5);
final double X10_TEMP107 = (1.0);

double X10_TEMP132 = (X10_TEMP106-X10_TEMP107);
int X10_TEMP124 = (0);
int X10_TEMP125 = (0);
final int X10_TEMP113 = (pp[0]);
final int X10_TEMP114 = (pp[1]);

final int X10_TEMP116 = (X10_TEMP113+X10_TEMP114);
final int X10_TEMP117 = (nx+ny);
final int X10_TEMP118 = (2);

final int X10_TEMP120 = (X10_TEMP117-X10_TEMP118);
final double X10_TEMP121 = ((double)X10_TEMP120);

double X10_TEMP126 = (X10_TEMP116/X10_TEMP121);
boolean X10_TEMP127 = (false);

Vec X10_TEMP133 = (new Vec(X10_TEMP124,X10_TEMP125,X10_TEMP126,X10_TEMP127));
boolean X10_TEMP134 = (false);

Surface X10_TEMP138 = (new Surface(X10_TEMP130,X10_TEMP131,X10_TEMP132,X10_TEMP133,X10_TEMP134));

Sphere p = (new Sphere(X10_TEMP136,X10_TEMP137,X10_TEMP138));
Program.Scene_addObject(scene,p);
}
int X10_TEMP147 = (100);
int X10_TEMP148 = (100);
final int X10_TEMP143 = (50);
final int X10_TEMP144 = 0;

int X10_TEMP149 = (X10_TEMP144 - X10_TEMP143);
double X10_TEMP150 = (1.0);

final Light X10_TEMP152 = (new Light(X10_TEMP147,X10_TEMP148,X10_TEMP149,X10_TEMP150));

Program.Scene_addLight(scene,X10_TEMP152);
final int X10_TEMP153 = (100);
final int X10_TEMP154 = 0;

int X10_TEMP161 = (X10_TEMP154 - X10_TEMP153);
int X10_TEMP162 = (100);
final int X10_TEMP157 = (50);
final int X10_TEMP158 = 0;

int X10_TEMP163 = (X10_TEMP158 - X10_TEMP157);
double X10_TEMP164 = (1.0);

final Light X10_TEMP166 = (new Light(X10_TEMP161,X10_TEMP162,X10_TEMP163,X10_TEMP164));

Program.Scene_addLight(scene,X10_TEMP166);
int X10_TEMP175 = (100);
final int X10_TEMP168 = (100);
final int X10_TEMP169 = 0;

int X10_TEMP176 = (X10_TEMP169 - X10_TEMP168);
final int X10_TEMP171 = (50);
final int X10_TEMP172 = 0;

int X10_TEMP177 = (X10_TEMP172 - X10_TEMP171);
double X10_TEMP178 = (1.0);

final Light X10_TEMP180 = (new Light(X10_TEMP175,X10_TEMP176,X10_TEMP177,X10_TEMP178));

Program.Scene_addLight(scene,X10_TEMP180);
final int X10_TEMP181 = (100);
final int X10_TEMP182 = 0;

int X10_TEMP191 = (X10_TEMP182 - X10_TEMP181);
final int X10_TEMP184 = (100);
final int X10_TEMP185 = 0;

int X10_TEMP192 = (X10_TEMP185 - X10_TEMP184);
final int X10_TEMP187 = (50);
final int X10_TEMP188 = 0;

int X10_TEMP193 = (X10_TEMP188 - X10_TEMP187);
double X10_TEMP194 = (1.0);

final Light X10_TEMP196 = (new Light(X10_TEMP191,X10_TEMP192,X10_TEMP193,X10_TEMP194));

Program.Scene_addLight(scene,X10_TEMP196);
int X10_TEMP201 = (200);
int X10_TEMP202 = (200);
int X10_TEMP203 = (0);
double X10_TEMP204 = (1.0);

final Light X10_TEMP206 = (new Light(X10_TEMP201,X10_TEMP202,X10_TEMP203,X10_TEMP204));

Program.Scene_addLight(scene,X10_TEMP206);
return scene;
}
public static void RayTracer_setScene(final RayTracer X10_TEMP0, final Scene scene) {
final int X10_TEMP3 = (Program.Scene_getLights(scene));
final int X10_TEMP4 = (X10_TEMP3);
X10_TEMP0.lightCount = (X10_TEMP4);
final int X10_TEMP7 = (Program.Scene_getObjects(scene));
final int X10_TEMP8 = (X10_TEMP7);
X10_TEMP0.objCount = (X10_TEMP8);
final Scene sc = (scene);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP10);
final int mylightCount = (X10_TEMP0.lightCount);
final int myobjCount = (X10_TEMP0.objCount);
finish {
for(point(:rank==1)pl:U) {
final place X10_TEMP15 = U.get(pl);
async(X10_TEMP15) {
final place pHere = (here);
final int X10_TEMP20 = (0);
final int X10_TEMP18 = (1);
final int X10_TEMP21 = (mylightCount-X10_TEMP18);

region(:rank==1) d1 = (region(:rank==1))([X10_TEMP20:X10_TEMP21]);
final int X10_TEMP26 = (0);
final int X10_TEMP24 = (1);
final int X10_TEMP27 = (myobjCount-X10_TEMP24);

region(:rank==1) d2 = (region(:rank==1))([X10_TEMP26:X10_TEMP27]);
final Light value[:rank==1] X10_TEMP51 = (Light value[:rank==1])(new Light value[d1](point(:rank==1)l) {
final int X10_TEMP31 = (0);
final int X10_TEMP32 = (0);
final region(:rank==1) X10_TEMP33 = (region(:rank==1))([X10_TEMP31:X10_TEMP32]);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP33->pHere);
final Light[:rank==1] temp = (Light[:rank==1])(new Light[dTemp]);
final point(:rank==1) temp_l = (l);
finish {
final place X10_TEMP38 = place.FIRST_PLACE;
async(X10_TEMP38) {
final Light tempLight = (Program.Scene_getLight(sc,temp_l));
async(pHere) {
final int X10_TEMP43 = (0);

final Light X10_TEMP46 = (tempLight);
temp[X10_TEMP43] = (X10_TEMP46);
}
}
}
final int X10_TEMP48 = (0);

final Light X10_TEMP50 = (temp[X10_TEMP48]);
return X10_TEMP50;
}

);

final Light value[:rank==1] templights = (Light value[:rank==1])(X10_TEMP51);
finish {
final place X10_TEMP54 = place.FIRST_PLACE;
async(X10_TEMP54) {
final Light value[:rank==1] X10_TEMP57 = (Light value[:rank==1])(templights);
X10_TEMP0.lights = (X10_TEMP57);
}
}
final Sphere value[:rank==1] X10_TEMP80 = (Sphere value[:rank==1])(new Sphere value[d2](point(:rank==1)o) {
final int X10_TEMP60 = (0);
final int X10_TEMP61 = (0);
final region(:rank==1) X10_TEMP62 = (region(:rank==1))([X10_TEMP60:X10_TEMP61]);

final dist(:rank==1) dTemp1 = (dist(:rank==1))(X10_TEMP62->pHere);
final Sphere[:rank==1] temp1 = (Sphere[:rank==1])(new Sphere[dTemp1]);
final point(:rank==1) temp_o = (o);
finish {
final place X10_TEMP67 = place.FIRST_PLACE;
async(X10_TEMP67) {
final Sphere tempObject = (Program.Scene_getObject(sc,temp_o));
async(pHere) {
final int X10_TEMP72 = (0);

final Sphere X10_TEMP75 = (tempObject);
temp1[X10_TEMP72] = (X10_TEMP75);
}
}
}
final int X10_TEMP77 = (0);

final Sphere X10_TEMP79 = (temp1[X10_TEMP77]);
return X10_TEMP79;
}

);

final Sphere value[:rank==1] tempprim = (Sphere value[:rank==1])(X10_TEMP80);
finish {
final place X10_TEMP83 = place.FIRST_PLACE;
async(X10_TEMP83) {
final Sphere value[:rank==1] X10_TEMP86 = (Sphere value[:rank==1])(tempprim);
X10_TEMP0.prim = (X10_TEMP86);
}
}
}
}
}
final View X10_TEMP89 = (Program.Scene_getView(scene));
final View X10_TEMP90 = (X10_TEMP89);
X10_TEMP0.view = (X10_TEMP90);
}
public static void RayTracer_render(final RayTracer X10_TEMP0, final Interval interval) {
final int X10_TEMP11 = (0);
final int X10_TEMP6 = (interval.width);
final int X10_TEMP2 = (interval.yto);
final int X10_TEMP3 = (interval.yfrom);

final int X10_TEMP5 = (X10_TEMP2-X10_TEMP3);

final int X10_TEMP8 = (X10_TEMP6*X10_TEMP5);
final int X10_TEMP9 = (1);
final int X10_TEMP12 = (X10_TEMP8-X10_TEMP9);

final region(:rank==1) R = (region(:rank==1))([X10_TEMP11:X10_TEMP12]);
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(dist.factory.block(R));

final dist(:rank==1) DBlock = (dist(:rank==1))(X10_TEMP15);
final dist(:rank==1) X10_TEMP17 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP17);
final int[:rank==1] row = (int[:rank==1])(new int[DBlock]);
final region(:rank==1) chkSumReg = (region(:rank==1))(U.region);
final place pHere = (here);
final place fp = (place.FIRST_PLACE);
final dist(:rank==1) chkSumDist = (dist(:rank==1))(chkSumReg->fp);
final long[:rank==1] X10_TEMP26 = (long[:rank==1])(new long[chkSumDist]);
final long[:rank==1] X10_TEMP27 = (long[:rank==1])(X10_TEMP26);
X10_TEMP0.checkSumArray = (X10_TEMP27);
final View myview = (X10_TEMP0.view);
finish {
for(point(:rank==1)pl:U) {
final place X10_TEMP30 = U.get(pl);
async(X10_TEMP30) {
final place X10_TEMP31 = (here);

final dist(:rank==1) my_dist = (dist(:rank==1))(DBlock|X10_TEMP31);
long checksum1 = (0);
final double X10_TEMP42 = (myview.distance);
final double X10_TEMP35 = (myview.angle);
final double X10_TEMP38 = (Math.sin(X10_TEMP35));
final double X10_TEMP37 = (myview.angle);
final double X10_TEMP39 = (Math.cos(X10_TEMP37));

final double X10_TEMP41 = (X10_TEMP38/X10_TEMP39);

double frustrumwidth = (X10_TEMP42*X10_TEMP41);
final Vec X10_TEMP46 = (myview.at);
final Vec X10_TEMP47 = (myview.from);
final Vec X10_TEMP48 = (Program.Vec_sub(X10_TEMP46,X10_TEMP47));

Vec viewVec = (Program.Vec_normalized(X10_TEMP48));
boolean X10_TEMP52 = (false);
final Vec X10_TEMP53 = (new Vec(viewVec,X10_TEMP52));
final Vec X10_TEMP56 = (myview.up);

final double X10_TEMP58 = (Program.Vec_dot(X10_TEMP56,viewVec));

Vec tmpVec = (Program.Vec_scale(X10_TEMP53,X10_TEMP58));
final Vec X10_TEMP62 = (myview.up);
final Vec X10_TEMP63 = (Program.Vec_sub(X10_TEMP62,tmpVec));
final Vec X10_TEMP64 = (Program.Vec_normalized(X10_TEMP63));
final int X10_TEMP65 = 0;

final double X10_TEMP67 = (X10_TEMP65 - frustrumwidth);

Vec upVec = (Program.Vec_scale(X10_TEMP64,X10_TEMP67));
final Vec X10_TEMP71 = (myview.up);
final Vec X10_TEMP72 = (Program.Vec_cross(X10_TEMP71,viewVec));
final Vec X10_TEMP73 = (Program.Vec_normalized(X10_TEMP72));
final double X10_TEMP74 = (myview.aspect);

final double X10_TEMP76 = (X10_TEMP74*frustrumwidth);

Vec leftVec = (Program.Vec_scale(X10_TEMP73,X10_TEMP76));
Vec X10_TEMP80 = (myview.from);

Ray r = (new Ray(X10_TEMP80,_RayTracer_voidVec));
final region(:rank==1) X10_TEMP83 = (region(:rank==1))(my_dist.region);
for(point(:rank==1)pixCounter:X10_TEMP83) {
final int X10_TEMP85 = (pixCounter[0]);
final int X10_TEMP86 = (interval.width);

int y = (X10_TEMP85/X10_TEMP86);
final int X10_TEMP89 = (pixCounter[0]);
final int X10_TEMP90 = (interval.width);

int x = (X10_TEMP89%X10_TEMP90);
final double X10_TEMP92 = (2.0);

final double X10_TEMP94 = (X10_TEMP92*y);
final double X10_TEMP96 = ((double)X10_TEMP94);
final int X10_TEMP95 = (interval.width);
final double X10_TEMP97 = ((double)X10_TEMP95);
final double X10_TEMP98 = (X10_TEMP96/X10_TEMP97);
final double X10_TEMP99 = (1.0);

double ylen = (X10_TEMP98-X10_TEMP99);
final double X10_TEMP101 = (2.0);

final double X10_TEMP103 = (X10_TEMP101*x);
final double X10_TEMP105 = ((double)X10_TEMP103);
final int X10_TEMP104 = (interval.width);
final double X10_TEMP106 = ((double)X10_TEMP104);
final double X10_TEMP107 = (X10_TEMP105/X10_TEMP106);
final double X10_TEMP108 = (1.0);

double xlen = (X10_TEMP107-X10_TEMP108);
final Vec X10_TEMP114 = (Program.Vec_comb(xlen,leftVec,ylen,upVec));
final Vec X10_TEMP116 = (Program.Vec_added(X10_TEMP114,viewVec));

final Vec X10_TEMP118 = (Program.Vec_normalized(X10_TEMP116));

final Ray X10_TEMP120 = (Program.Ray_d(r,X10_TEMP118));
r = (X10_TEMP120);
final int X10_TEMP126 = (0);
final double X10_TEMP127 = (1.0);
final Isect X10_TEMP128 = (new Isect());
final Ray X10_TEMP129 = (new Ray());

Vec col = (Program.RayTracer_trace(X10_TEMP0,X10_TEMP126,X10_TEMP127,r,X10_TEMP128,X10_TEMP129));
final double X10_TEMP131 = (col.x);
final double X10_TEMP132 = (255.0);

final double X10_TEMP134 = (X10_TEMP131*X10_TEMP132);

int red = ((int)X10_TEMP134);
final int X10_TEMP136 = (255);

final boolean X10_TEMP138 = red>X10_TEMP136;
if (X10_TEMP138) {
final int X10_TEMP140 = (255);
red = (X10_TEMP140);
}
final double X10_TEMP141 = (col.y);
final double X10_TEMP142 = (255.0);

final double X10_TEMP144 = (X10_TEMP141*X10_TEMP142);

int green = ((int)X10_TEMP144);
final int X10_TEMP146 = (255);

final boolean X10_TEMP148 = green>X10_TEMP146;
if (X10_TEMP148) {
final int X10_TEMP150 = (255);
green = (X10_TEMP150);
}
final double X10_TEMP151 = (col.z);
final double X10_TEMP152 = (255.0);

final double X10_TEMP154 = (X10_TEMP151*X10_TEMP152);

int blue = ((int)X10_TEMP154);
final int X10_TEMP156 = (255);

final boolean X10_TEMP158 = blue>X10_TEMP156;
if (X10_TEMP158) {
final int X10_TEMP160 = (255);
blue = (X10_TEMP160);
}
final long X10_TEMP161 = (checksum1+red);
final long X10_TEMP162 = (X10_TEMP161+green);

final long X10_TEMP164 = (X10_TEMP162+blue);
checksum1 = (X10_TEMP164);
}
final long checksumx = (checksum1);
finish {
async(fp) {
final long[:rank==1] X10_TEMP167 = (long[:rank==1])(X10_TEMP0.checkSumArray);

final long X10_TEMP171 = (checksumx);
X10_TEMP167[pl] = (X10_TEMP171);
}
}
}
}
}
final long[:rank==1] X10_TEMP172 = (long[:rank==1])(X10_TEMP0.checkSumArray);
final dist(:rank==1) X10_TEMP173 = (dist(:rank==1))(X10_TEMP172.distribution);

final region(:rank==1) regSum = (region(:rank==1))(X10_TEMP173.region);
for(point(:rank==1)i:chkSumReg) {
final long X10_TEMP178 = (X10_TEMP0.checksum);
final long[:rank==1] X10_TEMP176 = (long[:rank==1])(X10_TEMP0.checkSumArray);
final long X10_TEMP179 = (X10_TEMP176[i]);

final long X10_TEMP182 = (X10_TEMP178+X10_TEMP179);
final long X10_TEMP183 = (X10_TEMP182);
X10_TEMP0.checksum = (X10_TEMP183);
}
}
public static boolean RayTracer_intersect(final RayTracer X10_TEMP0, final Ray r, final double maxt, final Isect inter) {
int nhits = (0);
final double X10_TEMP4 = (1e9);
final double X10_TEMP5 = (X10_TEMP4);
inter.t = (X10_TEMP5);
final place h = (here);
final int X10_TEMP9 = (0);
final int X10_TEMP10 = (0);
final region(:rank==1) X10_TEMP11 = (region(:rank==1))([X10_TEMP9:X10_TEMP10]);
final place X10_TEMP12 = (here);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP11->X10_TEMP12);
final Envelope[:rank==1] temp = (Envelope[:rank==1])(new Envelope[dTemp]);
finish {
final place X10_TEMP16 = place.FIRST_PLACE;
async(X10_TEMP16) {
final int tempobjCount = (X10_TEMP0.objCount);
final Sphere value[:rank==1] tempprim = (Sphere value[:rank==1])(X10_TEMP0.prim);
async(h) {
final int X10_TEMP21 = (0);

final Envelope X10_TEMP26 = (new Envelope(tempobjCount,tempprim));
final Envelope X10_TEMP27 = (X10_TEMP26);
temp[X10_TEMP21] = (X10_TEMP27);
}
}
}
final int X10_TEMP29 = (0);
final Envelope X10_TEMP30 = (temp[X10_TEMP29]);

final int myobjCount = (X10_TEMP30.i);
final int X10_TEMP33 = (0);
final Envelope X10_TEMP34 = (temp[X10_TEMP33]);

final Sphere value[:rank==1] X10_TEMP36 = (Sphere value[:rank==1])(X10_TEMP34.a);

final Sphere value[:rank==1] myprim = (Sphere value[:rank==1])(X10_TEMP36);
final int X10_TEMP41 = (0);
final int X10_TEMP39 = (1);
final int X10_TEMP42 = (myobjCount-X10_TEMP39);

final region(:rank==1) X10_TEMP44 = (region(:rank==1))([X10_TEMP41:X10_TEMP42]);
for(point(:rank==1)i:X10_TEMP44) {
final Sphere X10_TEMP46 = (myprim[i]);

Isect tp = (Program.Sphere_intersect(X10_TEMP46,r));
final boolean X10_TEMP49 = (tp.isNull);
final boolean X10_TEMP52 = (!X10_TEMP49);
final double X10_TEMP50 = (tp.t);
final double X10_TEMP51 = (inter.t);
final boolean X10_TEMP53 = (X10_TEMP50<X10_TEMP51);

final boolean X10_TEMP55 = X10_TEMP52&&X10_TEMP53;
if (X10_TEMP55) {
final double X10_TEMP58 = (tp.t);
final double X10_TEMP59 = (X10_TEMP58);
inter.t = (X10_TEMP59);
final Sphere X10_TEMP62 = (tp.prim);
final Sphere X10_TEMP63 = (X10_TEMP62);
inter.prim = (X10_TEMP63);
final Surface X10_TEMP66 = (tp.surf);
final Surface X10_TEMP67 = (X10_TEMP66);
inter.surf = (X10_TEMP67);
final int X10_TEMP70 = (tp.enter);
final int X10_TEMP71 = (X10_TEMP70);
inter.enter = (X10_TEMP71);
final int X10_TEMP72 = (nhits);
final int X10_TEMP73 = 1;
nhits = nhits + X10_TEMP73;

}
}
final int X10_TEMP74 = (0);
final boolean X10_TEMP75 = nhits>X10_TEMP74;
boolean X10_TEMP78 = false;
if(X10_TEMP75){
X10_TEMP78 = true;
}
final boolean X10_TEMP79 = X10_TEMP78;

return X10_TEMP79;
}
public static int RayTracer_Shadow(final RayTracer X10_TEMP0, final Ray r, final double tmax, final Isect inter) {
final boolean X10_TEMP5 = Program.RayTracer_intersect(X10_TEMP0,r,tmax,inter);
if (X10_TEMP5) {
final int X10_TEMP7 = (0);
return X10_TEMP7;
}
final int X10_TEMP9 = (1);
return X10_TEMP9;
}
public static Vec RayTracer_SpecularDirection(final RayTracer X10_TEMP0, final Vec I, final Vec N) {
final double X10_TEMP5 = (1.0);
final double X10_TEMP4 = (Program.Vec_dot(I,N));
final double X10_TEMP6 = (Math.abs(X10_TEMP4));

final double X10_TEMP11 = (X10_TEMP5/X10_TEMP6);
final double X10_TEMP12 = (2.0);
final Vec X10_TEMP13 = (Program.Vec_comb(X10_TEMP11,I,X10_TEMP12,N));

final Vec X10_TEMP15 = (Program.Vec_normalized(X10_TEMP13));
return X10_TEMP15;
}
public static Vec RayTracer_TransDir(final RayTracer X10_TEMP0, final Surface m1, final Surface m2, final Vec I, final Vec N) {
final boolean X10_TEMP1 = m1.isNull;
double X10_TEMP4 = m1.ior;
if(X10_TEMP1){
X10_TEMP4 = 1.0;
}
final double X10_TEMP5 = X10_TEMP4;

double n1 = (X10_TEMP5);
final boolean X10_TEMP6 = m2.isNull;
double X10_TEMP9 = m2.ior;
if(X10_TEMP6){
X10_TEMP9 = 1.0;
}
final double X10_TEMP10 = X10_TEMP9;

double n2 = (X10_TEMP10);
double eta = (n1/n2);
final double X10_TEMP14 = (Program.Vec_dot(I,N));
final int X10_TEMP15 = 0;

double c1 = (X10_TEMP15 - X10_TEMP14);
final double X10_TEMP22 = (1.0);
final double X10_TEMP21 = (eta*eta);
final double X10_TEMP17 = (1.0);
final double X10_TEMP18 = (c1*c1);

final double X10_TEMP20 = (X10_TEMP17-X10_TEMP18);
final double X10_TEMP23 = (X10_TEMP21*X10_TEMP20);

double cs2 = (X10_TEMP22-X10_TEMP23);
final double X10_TEMP25 = (0.0);

final boolean X10_TEMP27 = cs2<X10_TEMP25;
if (X10_TEMP27) {
double X10_TEMP32 = (0.0);
double X10_TEMP33 = (0.0);
double X10_TEMP34 = (0.0);
boolean X10_TEMP35 = (true);

final Vec X10_TEMP37 = (new Vec(X10_TEMP32,X10_TEMP33,X10_TEMP34,X10_TEMP35));
return X10_TEMP37;
}
final double X10_TEMP41 = (eta*c1);
final double X10_TEMP42 = (Math.sqrt(cs2));

final double X10_TEMP45 = (X10_TEMP41-X10_TEMP42);
final Vec X10_TEMP46 = (Program.Vec_comb(eta,I,X10_TEMP45,N));

final Vec X10_TEMP48 = (Program.Vec_normalized(X10_TEMP46));
return X10_TEMP48;
}
public static Vec RayTracer_shade(final RayTracer X10_TEMP0, final int level, final double weight, final Vec P, final Vec N, final Vec I, final Isect hit, final Ray tRay) {
Surface surf = (hit.surf);
Vec bigr = (new Vec());
final double X10_TEMP3 = (surf.shine);
final double X10_TEMP4 = (1e-6);

final boolean X10_TEMP6 = X10_TEMP3>X10_TEMP4;
if (X10_TEMP6) {
final Vec X10_TEMP10 = (Program.RayTracer_SpecularDirection(X10_TEMP0,I,N));
bigr = (X10_TEMP10);
}
final place h = (here);
final int X10_TEMP14 = (0);
final int X10_TEMP15 = (0);
final region(:rank==1) X10_TEMP16 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final place X10_TEMP17 = (here);

final dist(:rank==1) dTemp = (dist(:rank==1))(X10_TEMP16->X10_TEMP17);
final Envelope2[:rank==1] temp = (Envelope2[:rank==1])(new Envelope2[dTemp]);
finish {
final place X10_TEMP21 = place.FIRST_PLACE;
async(X10_TEMP21) {
final int templightCount = (X10_TEMP0.lightCount);
final Light value[:rank==1] templights = (Light value[:rank==1])(X10_TEMP0.lights);
async(h) {
final int X10_TEMP26 = (0);

final Envelope2 X10_TEMP31 = (new Envelope2(templightCount,templights));
final Envelope2 X10_TEMP32 = (X10_TEMP31);
temp[X10_TEMP26] = (X10_TEMP32);
}
}
}
final int X10_TEMP34 = (0);
final Envelope2 X10_TEMP35 = (temp[X10_TEMP34]);

final int mylightCount = (X10_TEMP35.i);
final int X10_TEMP38 = (0);
final Envelope2 X10_TEMP39 = (temp[X10_TEMP38]);

final Light value[:rank==1] X10_TEMP41 = (Light value[:rank==1])(X10_TEMP39.a);

final Light value[:rank==1] mylights = (Light value[:rank==1])(X10_TEMP41);
Vec col = (new Vec());
final int X10_TEMP47 = (0);
final int X10_TEMP45 = (1);
final int X10_TEMP48 = (mylightCount-X10_TEMP45);

final region(:rank==1) X10_TEMP50 = (region(:rank==1))([X10_TEMP47:X10_TEMP48]);
for(point(:rank==1)l:X10_TEMP50) {
final Light X10_TEMP52 = (mylights[l]);

final Vec X10_TEMP55 = (X10_TEMP52.pos);

Vec L = (Program.Vec_sub(X10_TEMP55,P));
final double X10_TEMP59 = (Program.Vec_dot(N,L));
final double X10_TEMP60 = (0.0);

final boolean X10_TEMP62 = X10_TEMP59>=X10_TEMP60;
if (X10_TEMP62) {
final Vec X10_TEMP64 = (Program.Vec_normalized(L));
L = (X10_TEMP64);
double t = (Program.Vec_length(L));
final Vec X10_TEMP68 = (P);
tRay.p = (X10_TEMP68);
final Vec X10_TEMP71 = (L);
tRay.d = (X10_TEMP71);
final int X10_TEMP75 = (Program.RayTracer_Shadow(X10_TEMP0,tRay,t,hit));
final int X10_TEMP76 = (0);

final boolean X10_TEMP78 = X10_TEMP75>X10_TEMP76;
if (X10_TEMP78) {
final double X10_TEMP81 = (Program.Vec_dot(N,L));
final double X10_TEMP82 = (surf.kd);
final double X10_TEMP85 = (X10_TEMP81*X10_TEMP82);
final Light X10_TEMP84 = (mylights[l]);
final double X10_TEMP86 = (X10_TEMP84.brightness);

double diff = (X10_TEMP85*X10_TEMP86);
final Vec X10_TEMP90 = (surf.color);

final Vec X10_TEMP92 = (Program.Vec_adds2(col,diff,X10_TEMP90));
col = (X10_TEMP92);
final double X10_TEMP93 = (surf.shine);
final double X10_TEMP94 = (1e-6);

final boolean X10_TEMP96 = X10_TEMP93>X10_TEMP94;
if (X10_TEMP96) {
double spec = (Program.Vec_dot(bigr,L));
final double X10_TEMP100 = (1e-6);

final boolean X10_TEMP102 = spec>X10_TEMP100;
if (X10_TEMP102) {
final double X10_TEMP105 = (surf.shine);

final double X10_TEMP107 = (Math.pow(spec,X10_TEMP105));
spec = (X10_TEMP107);
boolean X10_TEMP112 = (false);

final Vec X10_TEMP114 = (new Vec(spec,spec,spec,X10_TEMP112));

final Vec X10_TEMP116 = (Program.Vec_added(col,X10_TEMP114));
col = (X10_TEMP116);
}
}
}
}
}
final Vec X10_TEMP119 = (P);
tRay.p = (X10_TEMP119);
final double X10_TEMP120 = (surf.ks);
final double X10_TEMP121 = (X10_TEMP120*weight);
final double X10_TEMP122 = (1e-3);

final boolean X10_TEMP124 = X10_TEMP121>X10_TEMP122;
if (X10_TEMP124) {
final Vec X10_TEMP129 = (Program.RayTracer_SpecularDirection(X10_TEMP0,I,N));
final Vec X10_TEMP130 = (X10_TEMP129);
tRay.d = (X10_TEMP130);
final int X10_TEMP131 = (1);

final int X10_TEMP138 = (level+X10_TEMP131);
final double X10_TEMP133 = (surf.ks);

final double X10_TEMP139 = (X10_TEMP133*weight);

Vec tcol = (Program.RayTracer_trace(X10_TEMP0,X10_TEMP138,X10_TEMP139,tRay,hit,tRay));
final double X10_TEMP143 = (surf.ks);

final Vec X10_TEMP145 = (Program.Vec_adds2(col,X10_TEMP143,tcol));
col = (X10_TEMP145);
}
final double X10_TEMP146 = (surf.kt);
final double X10_TEMP147 = (X10_TEMP146*weight);
final double X10_TEMP148 = (1e-3);

final boolean X10_TEMP150 = X10_TEMP147>X10_TEMP148;
if (X10_TEMP150) {
final int X10_TEMP151 = (hit.enter);
final int X10_TEMP152 = (0);

final boolean X10_TEMP154 = X10_TEMP151>X10_TEMP152;
if (X10_TEMP154) {
int X10_TEMP160 = (0);
int X10_TEMP161 = (0);
int X10_TEMP162 = (0);
Vec X10_TEMP163 = (new Vec());
boolean X10_TEMP164 = (true);

final Surface X10_TEMP169 = (new Surface(X10_TEMP160,X10_TEMP161,X10_TEMP162,X10_TEMP163,X10_TEMP164));

final Vec X10_TEMP172 = (Program.RayTracer_TransDir(X10_TEMP0,X10_TEMP169,surf,I,N));
final Vec X10_TEMP173 = (X10_TEMP172);
tRay.d = (X10_TEMP173);
}
else {
int X10_TEMP180 = (0);
int X10_TEMP181 = (0);
int X10_TEMP182 = (0);
Vec X10_TEMP183 = (new Vec());
boolean X10_TEMP184 = (true);

final Surface X10_TEMP188 = (new Surface(X10_TEMP180,X10_TEMP181,X10_TEMP182,X10_TEMP183,X10_TEMP184));

final Vec X10_TEMP191 = (Program.RayTracer_TransDir(X10_TEMP0,surf,X10_TEMP188,I,N));
final Vec X10_TEMP192 = (X10_TEMP191);
tRay.d = (X10_TEMP192);
}
final int X10_TEMP193 = (1);

final int X10_TEMP200 = (level+X10_TEMP193);
final double X10_TEMP195 = (surf.kt);

final double X10_TEMP201 = (X10_TEMP195*weight);

Vec tcol = (Program.RayTracer_trace(X10_TEMP0,X10_TEMP200,X10_TEMP201,tRay,hit,tRay));
final double X10_TEMP205 = (surf.kt);

final Vec X10_TEMP207 = (Program.Vec_adds2(col,X10_TEMP205,tcol));
col = (X10_TEMP207);
}
return col;
}
public static Vec RayTracer_trace(final RayTracer X10_TEMP0, final int level, final double weight, final Ray r, final Isect inter, final Ray tRay) {
final int X10_TEMP1 = (6);

final boolean X10_TEMP3 = level>X10_TEMP1;
if (X10_TEMP3) {
final Vec X10_TEMP5 = (new Vec());
return X10_TEMP5;
}
final double X10_TEMP9 = (1e6);

boolean hit = (Program.RayTracer_intersect(X10_TEMP0,r,X10_TEMP9,inter));
if (hit) {
final double X10_TEMP13 = (inter.t);

Vec P = (Program.Ray_rayPoint(r,X10_TEMP13));
final Sphere X10_TEMP15 = (inter.prim);

Vec N = (Program.Sphere_normal(X10_TEMP15,P));
final Vec X10_TEMP20 = (r.d);
final double X10_TEMP21 = (Program.Vec_dot(X10_TEMP20,N));
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = X10_TEMP21>=X10_TEMP22;
if (X10_TEMP24) {
final Vec X10_TEMP26 = (Program.Vec_negate(N));
N = (X10_TEMP26);
}
final Vec X10_TEMP34 = (r.d);

final Vec X10_TEMP36 = (Program.RayTracer_shade(X10_TEMP0,level,weight,P,N,X10_TEMP34,inter,tRay));
return X10_TEMP36;
}
return _RayTracer_voidVec;
}
public static Ray Ray_d(final Ray X10_TEMP0, final Vec d_) {
Vec X10_TEMP4 = (X10_TEMP0.p);
boolean X10_TEMP5 = (false);

final Ray X10_TEMP7 = (new Ray(X10_TEMP4,d_,X10_TEMP5));
return X10_TEMP7;
}
public static Vec Ray_rayPoint(final Ray X10_TEMP0, final double t) {
final Vec X10_TEMP1 = (X10_TEMP0.p);
final double X10_TEMP4 = (X10_TEMP1.x);
final Vec X10_TEMP2 = (X10_TEMP0.d);
final double X10_TEMP3 = (X10_TEMP2.x);
final double X10_TEMP5 = (X10_TEMP3*t);

double X10_TEMP20 = (X10_TEMP4+X10_TEMP5);
final Vec X10_TEMP7 = (X10_TEMP0.p);
final double X10_TEMP10 = (X10_TEMP7.y);
final Vec X10_TEMP8 = (X10_TEMP0.d);
final double X10_TEMP9 = (X10_TEMP8.y);
final double X10_TEMP11 = (X10_TEMP9*t);

double X10_TEMP21 = (X10_TEMP10+X10_TEMP11);
final Vec X10_TEMP13 = (X10_TEMP0.p);
final double X10_TEMP16 = (X10_TEMP13.z);
final Vec X10_TEMP14 = (X10_TEMP0.d);
final double X10_TEMP15 = (X10_TEMP14.z);
final double X10_TEMP17 = (X10_TEMP15*t);

double X10_TEMP22 = (X10_TEMP16+X10_TEMP17);
boolean X10_TEMP23 = (false);

final Vec X10_TEMP25 = (new Vec(X10_TEMP20,X10_TEMP21,X10_TEMP22,X10_TEMP23));
return X10_TEMP25;
}
public static String Ray_toString(final Ray X10_TEMP0) {
final String X10_TEMP2 = (" { ");
final Vec X10_TEMP1 = (X10_TEMP0.p);
final String X10_TEMP3 = (Program.Vec_toString(X10_TEMP1));
final String X10_TEMP4 = (X10_TEMP2+X10_TEMP3);
final String X10_TEMP5 = ("->");
final String X10_TEMP7 = (X10_TEMP4+X10_TEMP5);
final Vec X10_TEMP6 = (X10_TEMP0.d);
final String X10_TEMP8 = (Program.Vec_toString(X10_TEMP6));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" } ");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
return X10_TEMP12;
}
public static int _Scene_maxObjects_init() {

final int X10_TEMP2 = (64);
return X10_TEMP2;
}
public static int _Scene_maxLights_init() {

final int X10_TEMP2 = (5);
return X10_TEMP2;
}
public static void Scene_addLight(final Scene X10_TEMP0, final Light l) {
final int X10_TEMP2 = (X10_TEMP0.lightCount);
final int X10_TEMP1 = (1);
final int X10_TEMP3 = (_Scene_maxLights-X10_TEMP1);

final boolean X10_TEMP5 = X10_TEMP2>X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("Only ");
final String X10_TEMP7 = (X10_TEMP6+_Scene_maxLights);
final String X10_TEMP8 = (" lights allowed");

final String X10_TEMP10 = (X10_TEMP7+X10_TEMP8);
throw new RuntimeException(X10_TEMP10);
}
final Light[:rank==1] X10_TEMP11 = (Light[:rank==1])(X10_TEMP0.lights);
final int X10_TEMP13 = (X10_TEMP0.lightCount);

final Light X10_TEMP16 = (l);
X10_TEMP11[X10_TEMP13] = (X10_TEMP16);
final int X10_TEMP17 = (X10_TEMP0.lightCount);
final int X10_TEMP18 = (1);

final int X10_TEMP21 = (X10_TEMP17+X10_TEMP18);
final int X10_TEMP22 = (X10_TEMP21);
X10_TEMP0.lightCount = (X10_TEMP22);
}
public static void Scene_addObject(final Scene X10_TEMP0, final Sphere object) {
final int X10_TEMP2 = (X10_TEMP0.objectCount);
final int X10_TEMP1 = (1);
final int X10_TEMP3 = (_Scene_maxObjects-X10_TEMP1);

final boolean X10_TEMP5 = X10_TEMP2>X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("Only ");
final String X10_TEMP7 = (X10_TEMP6+_Scene_maxObjects);
final String X10_TEMP8 = (" objects allowed");

final String X10_TEMP10 = (X10_TEMP7+X10_TEMP8);
throw new RuntimeException(X10_TEMP10);
}
final Sphere[:rank==1] X10_TEMP11 = (Sphere[:rank==1])(X10_TEMP0.objects);
final int X10_TEMP13 = (X10_TEMP0.objectCount);

final Sphere X10_TEMP16 = (object);
X10_TEMP11[X10_TEMP13] = (X10_TEMP16);
final int X10_TEMP17 = (X10_TEMP0.objectCount);
final int X10_TEMP18 = (1);

final int X10_TEMP21 = (X10_TEMP17+X10_TEMP18);
final int X10_TEMP22 = (X10_TEMP21);
X10_TEMP0.objectCount = (X10_TEMP22);
}
public static View Scene_getView(final Scene X10_TEMP0) {
final View X10_TEMP2 = (X10_TEMP0.view);
return X10_TEMP2;
}
public static Light Scene_getLight(final Scene X10_TEMP0, final point(:rank==1) number) {
final Light[:rank==1] X10_TEMP1 = (Light[:rank==1])(X10_TEMP0.lights);

final Light X10_TEMP4 = (X10_TEMP1[number]);
return X10_TEMP4;
}
public static Sphere Scene_getObject(final Scene X10_TEMP0, final point(:rank==1) number) {
final Sphere[:rank==1] X10_TEMP1 = (Sphere[:rank==1])(X10_TEMP0.objects);

final Sphere X10_TEMP4 = (X10_TEMP1[number]);
return X10_TEMP4;
}
public static int Scene_getLights(final Scene X10_TEMP0) {
final int X10_TEMP2 = (X10_TEMP0.lightCount);
return X10_TEMP2;
}
public static int Scene_getObjects(final Scene X10_TEMP0) {
final int X10_TEMP2 = (X10_TEMP0.objectCount);
return X10_TEMP2;
}
public static Isect Sphere_intersect(final Sphere X10_TEMP0, final Ray ry) {
final Vec X10_TEMP3 = (X10_TEMP0.c);
final Vec X10_TEMP4 = (ry.p);

Vec v = (Program.Vec_sub(X10_TEMP3,X10_TEMP4));
final Vec X10_TEMP8 = (ry.d);

double b = (Program.Vec_dot(v,X10_TEMP8));
final double X10_TEMP12 = (b*b);
final double X10_TEMP13 = (Program.Vec_dot(v,v));
final double X10_TEMP14 = (X10_TEMP12-X10_TEMP13);
final double X10_TEMP15 = (X10_TEMP0.r2);

double disc = (X10_TEMP14+X10_TEMP15);
final double X10_TEMP17 = (0.0);

final boolean X10_TEMP19 = disc<X10_TEMP17;
if (X10_TEMP19) {
double X10_TEMP25 = (0.0);
int X10_TEMP26 = (0);
boolean X10_TEMP27 = (true);
Surface X10_TEMP28 = (X10_TEMP0.surf);

final Isect X10_TEMP30 = (new Isect(X10_TEMP25,X10_TEMP26,X10_TEMP27,X10_TEMP0,X10_TEMP28));
return X10_TEMP30;
}
final double X10_TEMP33 = (Math.sqrt(disc));
disc = (X10_TEMP33);
final double X10_TEMP34 = (b-disc);
final double X10_TEMP35 = (1e-6);

final boolean X10_TEMP37 = (X10_TEMP34<X10_TEMP35);
final boolean X10_TEMP38 = X10_TEMP37;
double X10_TEMP41 = b-disc;
if(X10_TEMP38){
X10_TEMP41 = b+disc;
}
final double X10_TEMP42 = X10_TEMP41;

double t = (X10_TEMP42);
final double X10_TEMP43 = (1e-6);

final boolean X10_TEMP45 = t<X10_TEMP43;
if (X10_TEMP45) {
double X10_TEMP51 = (0.0);
int X10_TEMP52 = (0);
boolean X10_TEMP53 = (true);
Surface X10_TEMP54 = (X10_TEMP0.surf);

final Isect X10_TEMP56 = (new Isect(X10_TEMP51,X10_TEMP52,X10_TEMP53,X10_TEMP0,X10_TEMP54));
return X10_TEMP56;
}
final double X10_TEMP62 = (Program.Vec_dot(v,v));
final double X10_TEMP60 = (X10_TEMP0.r2);
final double X10_TEMP61 = (1e-6);
final double X10_TEMP63 = (X10_TEMP60+X10_TEMP61);
final boolean X10_TEMP64 = X10_TEMP62>X10_TEMP63;
int X10_TEMP67 = 0;
if(X10_TEMP64){
X10_TEMP67 = 1;
}
final int X10_TEMP68 = X10_TEMP67;

boolean X10_TEMP72 = (false);
Surface X10_TEMP73 = (X10_TEMP0.surf);

Isect ip = (new Isect(t,X10_TEMP68,X10_TEMP72,X10_TEMP0,X10_TEMP73));
return ip;
}
public static Vec Sphere_normal(final Sphere X10_TEMP0, final Vec p) {
final Vec X10_TEMP3 = (X10_TEMP0.c);
final Vec X10_TEMP4 = (Program.Vec_sub(p,X10_TEMP3));

final Vec X10_TEMP6 = (Program.Vec_normalized(X10_TEMP4));
return X10_TEMP6;
}
public static String Sphere_toString(final Sphere X10_TEMP0) {
final String X10_TEMP2 = ("Sphere {");
final Vec X10_TEMP1 = (X10_TEMP0.c);
final String X10_TEMP3 = (Program.Vec_toString(X10_TEMP1));
final String X10_TEMP4 = (X10_TEMP2+X10_TEMP3);
final String X10_TEMP5 = (",");
final String X10_TEMP6 = (X10_TEMP4+X10_TEMP5);
final double X10_TEMP7 = (X10_TEMP0.r);
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = ("}");

final String X10_TEMP11 = (X10_TEMP8+X10_TEMP9);
return X10_TEMP11;
}
public static Vec Sphere_getCenter(final Sphere X10_TEMP0) {
final Vec X10_TEMP2 = (X10_TEMP0.c);
return X10_TEMP2;
}
public static String Surface_toString(final Surface X10_TEMP0) {
final String X10_TEMP1 = ("Surface { color = ");
final Vec X10_TEMP2 = (X10_TEMP0.color);
final String X10_TEMP3 = (Program.Vec_toString(X10_TEMP2));
final String X10_TEMP4 = (X10_TEMP1+X10_TEMP3);
final String X10_TEMP5 = (" }");

final String X10_TEMP7 = (X10_TEMP4+X10_TEMP5);
return X10_TEMP7;
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
public static Vec Vec_added(final Vec X10_TEMP0, final Vec a) {
final double X10_TEMP1 = (X10_TEMP0.x);
final double X10_TEMP2 = (a.x);

double X10_TEMP11 = (X10_TEMP1+X10_TEMP2);
final double X10_TEMP4 = (X10_TEMP0.y);
final double X10_TEMP5 = (a.y);

double X10_TEMP12 = (X10_TEMP4+X10_TEMP5);
final double X10_TEMP7 = (X10_TEMP0.z);
final double X10_TEMP8 = (a.z);

double X10_TEMP13 = (X10_TEMP7+X10_TEMP8);
boolean X10_TEMP14 = (false);

final Vec X10_TEMP16 = (new Vec(X10_TEMP11,X10_TEMP12,X10_TEMP13,X10_TEMP14));
return X10_TEMP16;
}
public static Vec Vec_adds3(final double s, final Vec a, final Vec b) {
final double X10_TEMP1 = (a.x);
final double X10_TEMP2 = (s*X10_TEMP1);
final double X10_TEMP3 = (b.x);

double X10_TEMP14 = (X10_TEMP2+X10_TEMP3);
final double X10_TEMP5 = (a.y);
final double X10_TEMP6 = (s*X10_TEMP5);
final double X10_TEMP7 = (b.y);

double X10_TEMP15 = (X10_TEMP6+X10_TEMP7);
final double X10_TEMP9 = (a.z);
final double X10_TEMP10 = (s*X10_TEMP9);
final double X10_TEMP11 = (b.z);

double X10_TEMP16 = (X10_TEMP10+X10_TEMP11);
boolean X10_TEMP17 = (false);

final Vec X10_TEMP19 = (new Vec(X10_TEMP14,X10_TEMP15,X10_TEMP16,X10_TEMP17));
return X10_TEMP19;
}
public static Vec Vec_adds2(final Vec X10_TEMP0, final double s, final Vec b) {
final double X10_TEMP2 = (X10_TEMP0.x);
final double X10_TEMP1 = (b.x);
final double X10_TEMP3 = (s*X10_TEMP1);

double X10_TEMP14 = (X10_TEMP2+X10_TEMP3);
final double X10_TEMP6 = (X10_TEMP0.y);
final double X10_TEMP5 = (b.y);
final double X10_TEMP7 = (s*X10_TEMP5);

double X10_TEMP15 = (X10_TEMP6+X10_TEMP7);
final double X10_TEMP10 = (X10_TEMP0.z);
final double X10_TEMP9 = (b.z);
final double X10_TEMP11 = (s*X10_TEMP9);

double X10_TEMP16 = (X10_TEMP10+X10_TEMP11);
boolean X10_TEMP17 = (false);

final Vec X10_TEMP19 = (new Vec(X10_TEMP14,X10_TEMP15,X10_TEMP16,X10_TEMP17));
return X10_TEMP19;
}
public static Vec Vec_sub(final Vec a, final Vec b) {
final double X10_TEMP1 = (a.x);
final double X10_TEMP2 = (b.x);

double X10_TEMP11 = (X10_TEMP1-X10_TEMP2);
final double X10_TEMP4 = (a.y);
final double X10_TEMP5 = (b.y);

double X10_TEMP12 = (X10_TEMP4-X10_TEMP5);
final double X10_TEMP7 = (a.z);
final double X10_TEMP8 = (b.z);

double X10_TEMP13 = (X10_TEMP7-X10_TEMP8);
boolean X10_TEMP14 = (false);

final Vec X10_TEMP16 = (new Vec(X10_TEMP11,X10_TEMP12,X10_TEMP13,X10_TEMP14));
return X10_TEMP16;
}
public static Vec Vec_mult(final Vec a, final Vec b) {
final double X10_TEMP1 = (a.x);
final double X10_TEMP2 = (b.x);

double X10_TEMP11 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP4 = (a.y);
final double X10_TEMP5 = (b.y);

double X10_TEMP12 = (X10_TEMP4*X10_TEMP5);
final double X10_TEMP7 = (a.z);
final double X10_TEMP8 = (b.z);

double X10_TEMP13 = (X10_TEMP7*X10_TEMP8);
boolean X10_TEMP14 = (false);

final Vec X10_TEMP16 = (new Vec(X10_TEMP11,X10_TEMP12,X10_TEMP13,X10_TEMP14));
return X10_TEMP16;
}
public static Vec Vec_cross(final Vec a, final Vec b) {
final double X10_TEMP1 = (a.y);
final double X10_TEMP2 = (b.z);
final double X10_TEMP5 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP3 = (a.z);
final double X10_TEMP4 = (b.y);
final double X10_TEMP6 = (X10_TEMP3*X10_TEMP4);

double X10_TEMP23 = (X10_TEMP5-X10_TEMP6);
final double X10_TEMP8 = (a.z);
final double X10_TEMP9 = (b.x);
final double X10_TEMP12 = (X10_TEMP8*X10_TEMP9);
final double X10_TEMP10 = (a.x);
final double X10_TEMP11 = (b.z);
final double X10_TEMP13 = (X10_TEMP10*X10_TEMP11);

double X10_TEMP24 = (X10_TEMP12-X10_TEMP13);
final double X10_TEMP15 = (a.x);
final double X10_TEMP16 = (b.y);
final double X10_TEMP19 = (X10_TEMP15*X10_TEMP16);
final double X10_TEMP17 = (a.y);
final double X10_TEMP18 = (b.x);
final double X10_TEMP20 = (X10_TEMP17*X10_TEMP18);

double X10_TEMP25 = (X10_TEMP19-X10_TEMP20);
boolean X10_TEMP26 = (false);

final Vec X10_TEMP28 = (new Vec(X10_TEMP23,X10_TEMP24,X10_TEMP25,X10_TEMP26));
return X10_TEMP28;
}
public static double Vec_dot(final Vec a, final Vec b) {
final double X10_TEMP1 = (a.x);
final double X10_TEMP2 = (b.x);
final double X10_TEMP5 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP3 = (a.y);
final double X10_TEMP4 = (b.y);
final double X10_TEMP6 = (X10_TEMP3*X10_TEMP4);
final double X10_TEMP9 = (X10_TEMP5+X10_TEMP6);
final double X10_TEMP7 = (a.z);
final double X10_TEMP8 = (b.z);
final double X10_TEMP10 = (X10_TEMP7*X10_TEMP8);

final double X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
return X10_TEMP12;
}
public static Vec Vec_comb(final double a, final Vec A, final double b, final Vec B) {
final double X10_TEMP1 = (A.x);
final double X10_TEMP3 = (a*X10_TEMP1);
final double X10_TEMP2 = (B.x);
final double X10_TEMP4 = (b*X10_TEMP2);

double X10_TEMP17 = (X10_TEMP3+X10_TEMP4);
final double X10_TEMP6 = (A.y);
final double X10_TEMP8 = (a*X10_TEMP6);
final double X10_TEMP7 = (B.y);
final double X10_TEMP9 = (b*X10_TEMP7);

double X10_TEMP18 = (X10_TEMP8+X10_TEMP9);
final double X10_TEMP11 = (A.z);
final double X10_TEMP13 = (a*X10_TEMP11);
final double X10_TEMP12 = (B.z);
final double X10_TEMP14 = (b*X10_TEMP12);

double X10_TEMP19 = (X10_TEMP13+X10_TEMP14);
boolean X10_TEMP20 = (false);

final Vec X10_TEMP22 = (new Vec(X10_TEMP17,X10_TEMP18,X10_TEMP19,X10_TEMP20));
return X10_TEMP22;
}
public static Vec Vec_scale(final Vec X10_TEMP0, final double t) {
final double X10_TEMP1 = (X10_TEMP0.x);

double X10_TEMP8 = (X10_TEMP1*t);
final double X10_TEMP3 = (X10_TEMP0.y);

double X10_TEMP9 = (X10_TEMP3*t);
final double X10_TEMP5 = (X10_TEMP0.z);

double X10_TEMP10 = (X10_TEMP5*t);
boolean X10_TEMP11 = (false);

final Vec X10_TEMP13 = (new Vec(X10_TEMP8,X10_TEMP9,X10_TEMP10,X10_TEMP11));
return X10_TEMP13;
}
public static Vec Vec_negate(final Vec X10_TEMP0) {
final double X10_TEMP1 = (X10_TEMP0.x);
final int X10_TEMP2 = 0;

double X10_TEMP11 = (X10_TEMP2 - X10_TEMP1);
final double X10_TEMP4 = (X10_TEMP0.y);
final int X10_TEMP5 = 0;

double X10_TEMP12 = (X10_TEMP5 - X10_TEMP4);
final double X10_TEMP7 = (X10_TEMP0.z);
final int X10_TEMP8 = 0;

double X10_TEMP13 = (X10_TEMP8 - X10_TEMP7);
boolean X10_TEMP14 = (false);

final Vec X10_TEMP16 = (new Vec(X10_TEMP11,X10_TEMP12,X10_TEMP13,X10_TEMP14));
return X10_TEMP16;
}
public static Vec Vec_normalized(final Vec X10_TEMP0) {
final double X10_TEMP1 = (X10_TEMP0.x);
final double X10_TEMP2 = (X10_TEMP0.x);
final double X10_TEMP5 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP3 = (X10_TEMP0.y);
final double X10_TEMP4 = (X10_TEMP0.y);
final double X10_TEMP6 = (X10_TEMP3*X10_TEMP4);
final double X10_TEMP9 = (X10_TEMP5+X10_TEMP6);
final double X10_TEMP7 = (X10_TEMP0.z);
final double X10_TEMP8 = (X10_TEMP0.z);
final double X10_TEMP10 = (X10_TEMP7*X10_TEMP8);
final double X10_TEMP12 = (X10_TEMP9+X10_TEMP10);

double len = (Math.sqrt(X10_TEMP12));
final double X10_TEMP14 = (0.0);

final boolean X10_TEMP16 = (len>X10_TEMP14);
final boolean X10_TEMP17 = X10_TEMP16;
final double X10_TEMP18 = (X10_TEMP0.x);

double X10_TEMP25 = (X10_TEMP18/len);
final double X10_TEMP20 = (X10_TEMP0.y);

double X10_TEMP26 = (X10_TEMP20/len);
final double X10_TEMP22 = (X10_TEMP0.z);

double X10_TEMP27 = (X10_TEMP22/len);
boolean X10_TEMP28 = (false);
Vec X10_TEMP31 = X10_TEMP0;
if(X10_TEMP17){
X10_TEMP31 = new Vec(X10_TEMP25,X10_TEMP26,X10_TEMP27,X10_TEMP28);
}
final Vec X10_TEMP32 = X10_TEMP31;

return X10_TEMP32;
}
public static double Vec_length(final Vec X10_TEMP0) {
final double X10_TEMP1 = (X10_TEMP0.x);
final double X10_TEMP2 = (X10_TEMP0.x);
final double X10_TEMP5 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP3 = (X10_TEMP0.y);
final double X10_TEMP4 = (X10_TEMP0.y);
final double X10_TEMP6 = (X10_TEMP3*X10_TEMP4);
final double X10_TEMP9 = (X10_TEMP5+X10_TEMP6);
final double X10_TEMP7 = (X10_TEMP0.z);
final double X10_TEMP8 = (X10_TEMP0.z);
final double X10_TEMP10 = (X10_TEMP7*X10_TEMP8);
final double X10_TEMP12 = (X10_TEMP9+X10_TEMP10);

final double X10_TEMP14 = (Math.sqrt(X10_TEMP12));
return X10_TEMP14;
}
public static String Vec_toString(final Vec X10_TEMP0) {
final String X10_TEMP1 = ("<");
final double X10_TEMP2 = (X10_TEMP0.x);
final String X10_TEMP3 = (X10_TEMP1+X10_TEMP2);
final String X10_TEMP4 = (",");
final String X10_TEMP5 = (X10_TEMP3+X10_TEMP4);
final double X10_TEMP6 = (X10_TEMP0.y);
final String X10_TEMP7 = (X10_TEMP5+X10_TEMP6);
final String X10_TEMP8 = (",");
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final double X10_TEMP10 = (X10_TEMP0.z);
final String X10_TEMP11 = (X10_TEMP9+X10_TEMP10);
final String X10_TEMP12 = (">");

final String X10_TEMP14 = (X10_TEMP11+X10_TEMP12);
return X10_TEMP14;
}
public static String View_toString(final View X10_TEMP0) {
final String X10_TEMP1 = ("View { from = ");
final Vec X10_TEMP2 = (X10_TEMP0.from);
final String X10_TEMP3 = (Program.Vec_toString(X10_TEMP2));
final String X10_TEMP4 = (X10_TEMP1+X10_TEMP3);
final String X10_TEMP5 = (" at = ");
final String X10_TEMP6 = (X10_TEMP4+X10_TEMP5);
final Vec X10_TEMP7 = (X10_TEMP0.at);
final String X10_TEMP8 = (Program.Vec_toString(X10_TEMP7));
final String X10_TEMP9 = (X10_TEMP6+X10_TEMP8);
final String X10_TEMP10 = (" up = ");
final String X10_TEMP11 = (X10_TEMP9+X10_TEMP10);
final Vec X10_TEMP12 = (X10_TEMP0.up);
final String X10_TEMP13 = (Program.Vec_toString(X10_TEMP12));
final String X10_TEMP14 = (X10_TEMP11+X10_TEMP13);
final String X10_TEMP15 = (" distance = ");
final String X10_TEMP16 = (X10_TEMP14+X10_TEMP15);
final double X10_TEMP17 = (X10_TEMP0.distance);
final String X10_TEMP18 = (X10_TEMP16+X10_TEMP17);
final String X10_TEMP19 = (" angle = ");
final String X10_TEMP20 = (X10_TEMP18+X10_TEMP19);
final double X10_TEMP21 = (X10_TEMP0.angle);
final String X10_TEMP22 = (X10_TEMP20+X10_TEMP21);
final String X10_TEMP23 = (" aspect = ");
final String X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
final double X10_TEMP25 = (X10_TEMP0.aspect);
final String X10_TEMP26 = (X10_TEMP24+X10_TEMP25);
final String X10_TEMP27 = ("}");

final String X10_TEMP29 = (X10_TEMP26+X10_TEMP27);
return X10_TEMP29;
}

}

value Envelope2 {
public final int i;
public final Light value[:rank==1] a;


public Envelope2(final int i1, final Light value[:rank==1] a1) {
i = (i1);
a = (Light value[:rank==1])(a1);
}


}

value Envelope {
public final int i;
public final Sphere value[:rank==1] a;


public Envelope(final int i1, final Sphere value[:rank==1] a1) {
i = (i1);
a = (Sphere value[:rank==1])(a1);
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
number = (number_);
width = (width_);
height = (height_);
yfrom = (yfrom_);
yto = (yto_);
total = (total_);
}


}

class Isect {
public double t;
public int enter;
public Sphere prim;
public Surface surf;
public boolean isNull;


public Isect() {
final double X10_TEMP2 = (0.0);
t = (X10_TEMP2);
final int X10_TEMP4 = (0);
enter = (X10_TEMP4);
final boolean X10_TEMP6 = (false);
isNull = (X10_TEMP6);
}
public Isect(final double t_, final int enter_, final boolean isNull_, final Sphere prim_, final Surface surf_) {
t = (t_);
isNull = (isNull_);
enter = (enter_);
prim = (prim_);
surf = (surf_);
}


}

value Light {
public final Vec pos;
public final double brightness;


public Light(final double x, final double y, final double z, final double b) {
boolean X10_TEMP5 = (false);

final Vec X10_TEMP7 = (new Vec(x,y,z,X10_TEMP5));
pos = (X10_TEMP7);
brightness = (b);
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
double X10_TEMP5 = (pnt.x);
double X10_TEMP6 = (pnt.y);
double X10_TEMP7 = (pnt.z);
boolean X10_TEMP8 = (false);

final Vec X10_TEMP10 = (new Vec(X10_TEMP5,X10_TEMP6,X10_TEMP7,X10_TEMP8));
p = (X10_TEMP10);
double X10_TEMP15 = (dir.x);
double X10_TEMP16 = (dir.y);
double X10_TEMP17 = (dir.z);
boolean X10_TEMP18 = (false);
final Vec X10_TEMP19 = (new Vec(X10_TEMP15,X10_TEMP16,X10_TEMP17,X10_TEMP18));

final Vec X10_TEMP21 = (Program.Vec_normalized(X10_TEMP19));
d = (X10_TEMP21);
}
public Ray(final Vec pnt, final Vec dir, final boolean normalize) {
if (normalize) {
double X10_TEMP6 = (pnt.x);
double X10_TEMP7 = (pnt.y);
double X10_TEMP8 = (pnt.z);
boolean X10_TEMP9 = (false);

final Vec X10_TEMP11 = (new Vec(X10_TEMP6,X10_TEMP7,X10_TEMP8,X10_TEMP9));
p = (X10_TEMP11);
double X10_TEMP16 = (dir.x);
double X10_TEMP17 = (dir.y);
double X10_TEMP18 = (dir.z);
boolean X10_TEMP19 = (false);
final Vec X10_TEMP20 = (new Vec(X10_TEMP16,X10_TEMP17,X10_TEMP18,X10_TEMP19));

final Vec X10_TEMP22 = (Program.Vec_normalized(X10_TEMP20));
d = (X10_TEMP22);
}
else {
p = (pnt);
d = (dir);
}
}
public Ray() {
final Vec X10_TEMP2 = (new Vec());
p = (X10_TEMP2);
final Vec X10_TEMP4 = (new Vec());
d = (X10_TEMP4);
}


}

class Scene {
public final Light [:rank==1] lights;
public final Sphere [:rank==1] objects;
public final View view;


public int lightCount;
public int objectCount;


public Scene(final View v) {
final int X10_TEMP5 = (0);
final int X10_TEMP2 = (Program._Scene_maxLights);
final int X10_TEMP3 = (1);
final int X10_TEMP6 = (X10_TEMP2-X10_TEMP3);
final region(:rank==1) X10_TEMP7 = (region(:rank==1))([X10_TEMP5:X10_TEMP6]);
final place X10_TEMP8 = (here);

dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP7->X10_TEMP8);
final Light[:rank==1] X10_TEMP13 = (Light[:rank==1])(this.Scene_getLightArray(d1));
lights = (Light[:rank==1])(X10_TEMP13);
final int X10_TEMP18 = (0);
final int X10_TEMP15 = (Program._Scene_maxObjects);
final int X10_TEMP16 = (1);
final int X10_TEMP19 = (X10_TEMP15-X10_TEMP16);
final region(:rank==1) X10_TEMP20 = (region(:rank==1))([X10_TEMP18:X10_TEMP19]);
final place X10_TEMP21 = (here);

dist(:rank==1) d2 = (dist(:rank==1))(X10_TEMP20->X10_TEMP21);
final Sphere[:rank==1] X10_TEMP26 = (Sphere[:rank==1])(this.Scene_getSphereArray(d2));
objects = (Sphere[:rank==1])(X10_TEMP26);
view = (v);
final int X10_TEMP29 = (0);
lightCount = (X10_TEMP29);
final int X10_TEMP31 = (0);
objectCount = (X10_TEMP31);
}


public Light [:rank==1] Scene_getLightArray(final dist(:rank==1) d) {
final Light[:rank==1] X10_TEMP2 = (Light[:rank==1&&distribution==d])(new Light[d]);
return X10_TEMP2;
}
public Sphere [:rank==1] Scene_getSphereArray(final dist(:rank==1) d) {
final Sphere[:rank==1] X10_TEMP2 = (Sphere[:rank==1&&distribution==d])(new Sphere[d]);
return X10_TEMP2;
}

}

value Sphere {
public final Vec c;
public final double r;
public final double r2;
public final Surface surf;


public Sphere(final Vec center, final double radius, final Surface s) {
surf = (s);
c = (center);
r = (radius);
final double X10_TEMP5 = (radius*radius);
r2 = (X10_TEMP5);
}
public Sphere(final Vec center, final double radius) {
c = (center);
r = (radius);
final double X10_TEMP4 = (radius*radius);
r2 = (X10_TEMP4);
final Surface X10_TEMP6 = (new Surface());
surf = (X10_TEMP6);
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
int X10_TEMP5 = (1);
int X10_TEMP6 = (0);
int X10_TEMP7 = (0);
boolean X10_TEMP8 = (false);

final Vec X10_TEMP10 = (new Vec(X10_TEMP5,X10_TEMP6,X10_TEMP7,X10_TEMP8));
color = (X10_TEMP10);
final double X10_TEMP12 = (1.0);
kd = (X10_TEMP12);
final double X10_TEMP14 = (0.0);
ks = (X10_TEMP14);
final double X10_TEMP16 = (0.0);
shine = (X10_TEMP16);
final double X10_TEMP18 = (0.0);
kt = (X10_TEMP18);
final double X10_TEMP20 = (1.0);
ior = (X10_TEMP20);
final boolean X10_TEMP22 = (false);
isNull = (X10_TEMP22);
}
public Surface(final double shine_, final double ks_, final double kt_, final Vec c_, final boolean isNull_) {
final double X10_TEMP2 = (1.0);
kd = (X10_TEMP2);
ks = (ks_);
shine = (shine_);
kt = (kt_);
final double X10_TEMP7 = (1.0);
ior = (X10_TEMP7);
color = (c_);
isNull = (isNull_);
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

value Vec {
public final double x;
public final double y;
public final double z;
public final boolean isNull;


public Vec(final double a, final double b, final double c, final boolean isNull_) {
x = (a);
y = (b);
z = (c);
isNull = (isNull_);
}
public Vec(final Vec a, final boolean isNull_) {
final double X10_TEMP2 = (a.x);
x = (X10_TEMP2);
final double X10_TEMP4 = (a.y);
y = (X10_TEMP4);
final double X10_TEMP6 = (a.z);
z = (X10_TEMP6);
isNull = (isNull_);
}
public Vec() {
final double X10_TEMP2 = (0.0);
x = (X10_TEMP2);
final double X10_TEMP4 = (0.0);
y = (X10_TEMP4);
final double X10_TEMP6 = (0.0);
z = (X10_TEMP6);
final boolean X10_TEMP8 = (false);
isNull = (X10_TEMP8);
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
from = (from_);
at = (at_);
up = (up_);
distance = (dist_);
angle = (angle_);
aspect = (aspect_);
}


}

