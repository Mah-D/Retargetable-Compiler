public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static void runMain() {
Program0.Program_runMain();
}
public static void Program_runMain() {
final Series X10_TEMP93 = (new Series());

final Series X10_TEMP1 = (X10_TEMP93);
Program0.Program_Series_run(X10_TEMP1);
}
public static void Program_Series_setSize(final Series X10_TEMP0, final int setsize) {
int X10_TEMP1 = (setsize);
final int X10_TEMP94 = (X10_TEMP1);

final int X10_TEMP4 = (X10_TEMP94);
final int X10_TEMP97 = (X10_TEMP4);

final int X10_TEMP100 = (X10_TEMP97);
X10_TEMP0.setsize = (X10_TEMP100);
}
public static void Program_Series_initialise(final Series X10_TEMP0, final int n) {
int X10_TEMP1 = (n);
final int X10_TEMP94 = (X10_TEMP1);

final int X10_TEMP4 = (X10_TEMP94);
final int X10_TEMP97 = (X10_TEMP4);

final int X10_TEMP100 = (X10_TEMP97);
X10_TEMP0.array_rows = (X10_TEMP100);
Program0.Program_Series_buildTestData(X10_TEMP0);
}
public static void Program_Series_kernel(final Series X10_TEMP0) {
Program0.Program_Series_Do(X10_TEMP0);
}
public static void Program_Series_initRefArray(final Series X10_TEMP0, final double [:rank==2] ref) {
final int X10_TEMP93 = (0);

final int X10_TEMP3 = (X10_TEMP93);
final int X10_TEMP96 = (0);

final int X10_TEMP4 = (X10_TEMP96);
final double X10_TEMP99 = (2.8729524964837996);

final double X10_TEMP7 = (X10_TEMP99);
final double X10_TEMP102 = (X10_TEMP7);

final double X10_TEMP8 = (X10_TEMP102);
final double X10_TEMP107 = (X10_TEMP8);

final double X10_TEMP110 = (X10_TEMP107);
ref[X10_TEMP3,X10_TEMP4] = (X10_TEMP110);
final int X10_TEMP112 = (0);

final int X10_TEMP11 = (X10_TEMP112);
final int X10_TEMP115 = (1);

final int X10_TEMP12 = (X10_TEMP115);
final double X10_TEMP118 = (0.0);

final double X10_TEMP15 = (X10_TEMP118);
final double X10_TEMP121 = (X10_TEMP15);

final double X10_TEMP16 = (X10_TEMP121);
final double X10_TEMP126 = (X10_TEMP16);

final double X10_TEMP129 = (X10_TEMP126);
ref[X10_TEMP11,X10_TEMP12] = (X10_TEMP129);
final int X10_TEMP131 = (1);

final int X10_TEMP19 = (X10_TEMP131);
final int X10_TEMP134 = (0);

final int X10_TEMP20 = (X10_TEMP134);
final double X10_TEMP137 = (1.1161046676147888);

final double X10_TEMP23 = (X10_TEMP137);
final double X10_TEMP140 = (X10_TEMP23);

final double X10_TEMP24 = (X10_TEMP140);
final double X10_TEMP145 = (X10_TEMP24);

final double X10_TEMP148 = (X10_TEMP145);
ref[X10_TEMP19,X10_TEMP20] = (X10_TEMP148);
final int X10_TEMP150 = (1);

final int X10_TEMP27 = (X10_TEMP150);
final int X10_TEMP153 = (1);

final int X10_TEMP28 = (X10_TEMP153);
final double X10_TEMP156 = (1.8819691893398025);

final double X10_TEMP29 = (X10_TEMP156);
final int X10_TEMP30 = (0);
final double X10_TEMP160 = (X10_TEMP30-X10_TEMP29);

final double X10_TEMP33 = (X10_TEMP160);
final double X10_TEMP163 = (X10_TEMP33);

final double X10_TEMP34 = (X10_TEMP163);
final double X10_TEMP168 = (X10_TEMP34);

final double X10_TEMP171 = (X10_TEMP168);
ref[X10_TEMP27,X10_TEMP28] = (X10_TEMP171);
final int X10_TEMP173 = (2);

final int X10_TEMP37 = (X10_TEMP173);
final int X10_TEMP176 = (0);

final int X10_TEMP38 = (X10_TEMP176);
final double X10_TEMP179 = (0.34429060398168704);

final double X10_TEMP41 = (X10_TEMP179);
final double X10_TEMP182 = (X10_TEMP41);

final double X10_TEMP42 = (X10_TEMP182);
final double X10_TEMP187 = (X10_TEMP42);

final double X10_TEMP190 = (X10_TEMP187);
ref[X10_TEMP37,X10_TEMP38] = (X10_TEMP190);
final int X10_TEMP192 = (2);

final int X10_TEMP45 = (X10_TEMP192);
final int X10_TEMP195 = (1);

final int X10_TEMP46 = (X10_TEMP195);
final double X10_TEMP198 = (1.1645642623320958);

final double X10_TEMP47 = (X10_TEMP198);
final int X10_TEMP48 = (0);
final double X10_TEMP202 = (X10_TEMP48-X10_TEMP47);

final double X10_TEMP51 = (X10_TEMP202);
final double X10_TEMP205 = (X10_TEMP51);

final double X10_TEMP52 = (X10_TEMP205);
final double X10_TEMP210 = (X10_TEMP52);

final double X10_TEMP213 = (X10_TEMP210);
ref[X10_TEMP45,X10_TEMP46] = (X10_TEMP213);
final int X10_TEMP215 = (3);

final int X10_TEMP55 = (X10_TEMP215);
final int X10_TEMP218 = (0);

final int X10_TEMP56 = (X10_TEMP218);
final double X10_TEMP221 = (0.15238898702519288);

final double X10_TEMP59 = (X10_TEMP221);
final double X10_TEMP224 = (X10_TEMP59);

final double X10_TEMP60 = (X10_TEMP224);
final double X10_TEMP229 = (X10_TEMP60);

final double X10_TEMP232 = (X10_TEMP229);
ref[X10_TEMP55,X10_TEMP56] = (X10_TEMP232);
final int X10_TEMP234 = (3);

final int X10_TEMP63 = (X10_TEMP234);
final int X10_TEMP237 = (1);

final int X10_TEMP64 = (X10_TEMP237);
final double X10_TEMP240 = (0.8143461113044298);

final double X10_TEMP65 = (X10_TEMP240);
final int X10_TEMP66 = (0);
final double X10_TEMP244 = (X10_TEMP66-X10_TEMP65);

final double X10_TEMP69 = (X10_TEMP244);
final double X10_TEMP247 = (X10_TEMP69);

final double X10_TEMP70 = (X10_TEMP247);
final double X10_TEMP252 = (X10_TEMP70);

final double X10_TEMP255 = (X10_TEMP252);
ref[X10_TEMP63,X10_TEMP64] = (X10_TEMP255);
}
public static void Program_Series_validate(final Series X10_TEMP0) {
final int X10_TEMP93 = (0);

final int X10_TEMP3 = (X10_TEMP93);
final int X10_TEMP96 = (3);

final int X10_TEMP4 = (X10_TEMP96);
final int X10_TEMP99 = (0);

final int X10_TEMP7 = (X10_TEMP99);
final int X10_TEMP102 = (1);

final int X10_TEMP8 = (X10_TEMP102);
final region(:rank==2) X10_TEMP109 = (region(:rank==2))([X10_TEMP3:X10_TEMP4,X10_TEMP7:X10_TEMP8]);

final region(:rank==2) r = (region(:rank==2))(X10_TEMP109);
final place X10_TEMP112 = (here);

final place X10_TEMP10 = (X10_TEMP112);
final dist(:rank==2) X10_TEMP115 = (dist(:rank==2))(r->X10_TEMP10);

final dist(:rank==2) vd = (dist(:rank==2))(X10_TEMP115);
final double[:rank==2&&distribution==vd] X10_TEMP122 = (double[:rank==2&&distribution==vd])(new double[vd](point(:rank==2)p0) {
final double X10_TEMP118 = (0.0);

final double X10_TEMP13 = (X10_TEMP118);
return X10_TEMP13;
}

);

final double[:rank==2] ref = (double[:rank==2])(X10_TEMP122);
Program0.Program_Series_initRefArray(X10_TEMP0,ref);
for(point(:rank==2)[i,j]:vd) {
final int X10_TEMP128 = (i);

final int ii = (X10_TEMP128);
final int X10_TEMP131 = (j);

final int jj = (X10_TEMP131);
final int X10_TEMP134 = (0);

double cval = (X10_TEMP134);
final place X10_TEMP137 = (here);

final place curr_place = (X10_TEMP137);
final int X10_TEMP140 = (0);

final int X10_TEMP23 = (X10_TEMP140);
final int X10_TEMP143 = (0);

final int X10_TEMP24 = (X10_TEMP143);
final region(:rank==1) X10_TEMP148 = (region(:rank==1))([X10_TEMP23:X10_TEMP24]);

final region(:rank==1) tempr = (region(:rank==1))(X10_TEMP148);
final place X10_TEMP151 = (here);

final place X10_TEMP26 = (X10_TEMP151);
final dist(:rank==1) X10_TEMP154 = (dist(:rank==1))(tempr->X10_TEMP26);

final dist(:rank==1) tempvd = (dist(:rank==1))(X10_TEMP154);
final double[:rank==1&&distribution==tempvd] X10_TEMP161 = (double[:rank==1&&distribution==tempvd])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP157 = (0.0);

final double X10_TEMP29 = (X10_TEMP157);
return X10_TEMP29;
}

);

final double[:rank==1] tempref = (double[:rank==1])(X10_TEMP161);
final double[:rank==2] X10_TEMP164 = (double[:rank==2])(X10_TEMP0.testArray);

final double[:rank==2] tA = (double[:rank==2])(X10_TEMP164);
finish {
final double[:rank==2] X10_TEMP167 = (double[:rank==2])(X10_TEMP0.testArray);

final double[:rank==2] X10_TEMP32 = (double[:rank==2])(X10_TEMP167);
final dist(:rank==2) X10_TEMP170 = (dist(:rank==2))(X10_TEMP32.distribution);

final dist(:rank==2) X10_TEMP33 = (dist(:rank==2))(X10_TEMP170);
final place X10_TEMP37 = (X10_TEMP33.get(j,i));
async(X10_TEMP37) {
final double X10_TEMP179 = (tA[jj,ii]);

final double temp = (X10_TEMP179);
async(curr_place) {
final int X10_TEMP183 = (0);

final int X10_TEMP43 = (X10_TEMP183);
final double X10_TEMP186 = (temp);

final double X10_TEMP46 = (X10_TEMP186);
final double X10_TEMP190 = (X10_TEMP46);

final double X10_TEMP193 = (X10_TEMP190);
tempref[X10_TEMP43] = (X10_TEMP193);
}
}
}
final int X10_TEMP195 = (0);

final int X10_TEMP48 = (X10_TEMP195);
final double X10_TEMP199 = (tempref[X10_TEMP48]);

final double X10_TEMP50 = (X10_TEMP199);
final double X10_TEMP202 = (X10_TEMP50);

cval = (X10_TEMP202);
final double X10_TEMP207 = (ref[i,j]);

final double X10_TEMP53 = (X10_TEMP207);
final double X10_TEMP210 = (cval-X10_TEMP53);

final double X10_TEMP55 = (X10_TEMP210);
final double X10_TEMP214 = (Math.abs(X10_TEMP55));

double error = (X10_TEMP214);
final double X10_TEMP217 = (1.0e-12);

final double X10_TEMP57 = (X10_TEMP217);
final boolean X10_TEMP59 = (error>X10_TEMP57);
if (X10_TEMP59) {
final String X10_TEMP222 = ("Validation failed for coefficient ");

final String X10_TEMP60 = (X10_TEMP222);
final String X10_TEMP225 = (X10_TEMP60+j);

final String X10_TEMP61 = (X10_TEMP225);
final String X10_TEMP228 = (",");

final String X10_TEMP62 = (X10_TEMP228);
final String X10_TEMP231 = (X10_TEMP61+X10_TEMP62);

final String X10_TEMP63 = (X10_TEMP231);
final String X10_TEMP234 = (X10_TEMP63+i);

final String X10_TEMP65 = (X10_TEMP234);
System.out.println(X10_TEMP65);
final String X10_TEMP238 = ("Computed value = ");

final String X10_TEMP66 = (X10_TEMP238);
final String X10_TEMP241 = (X10_TEMP66+cval);

final String X10_TEMP68 = (X10_TEMP241);
System.out.println(X10_TEMP68);
final String X10_TEMP245 = ("Reference value = ");

final String X10_TEMP71 = (X10_TEMP245);
final double X10_TEMP250 = (ref[i,j]);

final double X10_TEMP72 = (X10_TEMP250);
final String X10_TEMP253 = (X10_TEMP71+X10_TEMP72);

final String X10_TEMP74 = (X10_TEMP253);
System.out.println(X10_TEMP74);
final String X10_TEMP257 = ("Validation failed");

final String X10_TEMP76 = (X10_TEMP257);
throw new RuntimeException(X10_TEMP76);
}
}
}
public static void Program_Series_tidyup(final Series X10_TEMP0) {
Program0.Program_Series_freeTestData(X10_TEMP0);
}
public static void Program_Series_run(final Series X10_TEMP0) {
final int X10_TEMP93 = (0);

final int X10_TEMP3 = (X10_TEMP93);
final int X10_TEMP96 = (0);

final int X10_TEMP4 = (X10_TEMP96);
final region(:rank==1) X10_TEMP101 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) tempregion = (region(:rank==1))(X10_TEMP101);
final place X10_TEMP104 = (here);

final place X10_TEMP6 = (X10_TEMP104);
final dist(:rank==1) X10_TEMP107 = (dist(:rank==1))(tempregion->X10_TEMP6);

final dist(:rank==1) tempdist = (dist(:rank==1))(X10_TEMP107);
final int X10_TEMP110 = (10000);

int j = (X10_TEMP110);
for(point(:rank==1)[i]:tempdist) {
Program0.Program_Series_setSize(X10_TEMP0,i);
final int X10_TEMP116 = (100);

final int X10_TEMP13 = (X10_TEMP116);
final double X10_TEMP121 = (Math.pow(X10_TEMP13,i));

final double X10_TEMP14 = (X10_TEMP121);
final double X10_TEMP124 = (j*X10_TEMP14);

final double X10_TEMP16 = (X10_TEMP124);
final int X10_TEMP127 = ((int)X10_TEMP16);

final int X10_TEMP18 = (X10_TEMP127);
Program0.Program_Series_initialise(X10_TEMP0,X10_TEMP18);
Program0.Program_Series_kernel(X10_TEMP0);
Program0.Program_Series_validate(X10_TEMP0);
}
Program0.Program_Series_tidyup(X10_TEMP0);
}
public static void Program_Series_buildTestData(final Series X10_TEMP0) {
final int X10_TEMP93 = (0);

final int X10_TEMP3 = (X10_TEMP93);
final int X10_TEMP96 = (1);

final int X10_TEMP4 = (X10_TEMP96);
final int X10_TEMP99 = (0);

final int X10_TEMP9 = (X10_TEMP99);
final int X10_TEMP102 = (X10_TEMP0.array_rows);

final int X10_TEMP6 = (X10_TEMP102);
final int X10_TEMP105 = (1);

final int X10_TEMP7 = (X10_TEMP105);
final int X10_TEMP108 = (X10_TEMP6-X10_TEMP7);

final int X10_TEMP10 = (X10_TEMP108);
final region(:rank==2) X10_TEMP115 = (region(:rank==2))([X10_TEMP3:X10_TEMP4,X10_TEMP9:X10_TEMP10]);

final region(:rank==2) R = (region(:rank==2))(X10_TEMP115);
final dist(:rank==2) X10_TEMP119 = (dist(:rank==2))(dist.factory.block(R));

final dist(:rank==2) X10_TEMP13 = (dist(:rank==2))(X10_TEMP119);
final dist(:rank==2) X10_TEMP122 = (dist(:rank==2))(X10_TEMP13);

final dist(:rank==2) d = (dist(:rank==2))(X10_TEMP122);
final double[:rank==2&&distribution==d] X10_TEMP125 = (double[:rank==2&&distribution==d])(new double[d]);

final double[:rank==2&&distribution==d] X10_TEMP15 = (double[:rank==2&&distribution==d])(X10_TEMP125);
final double[:rank==2&&distribution==d] X10_TEMP128 = (double[:rank==2&&distribution==d])(X10_TEMP15);

final double[:rank==2] X10_TEMP18 = (double[:rank==2])(X10_TEMP128);
final double[:rank==2] X10_TEMP131 = (double[:rank==2])(X10_TEMP18);

final double[:rank==2] X10_TEMP134 = (double[:rank==2])(X10_TEMP131);
X10_TEMP0.testArray = (X10_TEMP134);
}
public static void Program_Series_Do(final Series X10_TEMP0) {
final double[:rank==2] X10_TEMP93 = (double[:rank==2])(X10_TEMP0.testArray);

final double[:rank==2] X10_TEMP1 = (double[:rank==2])(X10_TEMP93);
final int X10_TEMP96 = (0);

final int X10_TEMP4 = (X10_TEMP96);
final int X10_TEMP99 = (0);

final int X10_TEMP5 = (X10_TEMP99);
final double X10_TEMP102 = (0.0);

final double X10_TEMP6 = (X10_TEMP102);
final double X10_TEMP105 = ((double)X10_TEMP6);

final double X10_TEMP14 = (X10_TEMP105);
final double X10_TEMP108 = (2.0);

final double X10_TEMP8 = (X10_TEMP108);
final double X10_TEMP111 = ((double)X10_TEMP8);

final double X10_TEMP15 = (X10_TEMP111);
final int X10_TEMP114 = (1000);

final int X10_TEMP16 = (X10_TEMP114);
final double X10_TEMP117 = (0.0);

final double X10_TEMP11 = (X10_TEMP117);
final double X10_TEMP120 = ((double)X10_TEMP11);

final double X10_TEMP17 = (X10_TEMP120);
final int X10_TEMP123 = (0);

final int X10_TEMP18 = (X10_TEMP123);
final double X10_TEMP132 = (Program0.Program_Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP14,X10_TEMP15,X10_TEMP16,X10_TEMP17,X10_TEMP18));

final double X10_TEMP20 = (X10_TEMP132);
final double X10_TEMP135 = (2.0);

final double X10_TEMP19 = (X10_TEMP135);
final double X10_TEMP138 = ((double)X10_TEMP19);

final double X10_TEMP21 = (X10_TEMP138);
final double X10_TEMP141 = (X10_TEMP20/X10_TEMP21);

final double X10_TEMP24 = (X10_TEMP141);
final double X10_TEMP144 = (X10_TEMP24);

final double X10_TEMP25 = (X10_TEMP144);
final double X10_TEMP149 = (X10_TEMP25);

final double X10_TEMP152 = (X10_TEMP149);
X10_TEMP1[X10_TEMP4,X10_TEMP5] = (X10_TEMP152);
final double X10_TEMP154 = (3.1415926535897932);

final double X10_TEMP26 = (X10_TEMP154);
final double X10_TEMP157 = ((double)X10_TEMP26);

final double omega = (X10_TEMP157);
final dist(:rank==1) X10_TEMP160 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP28 = (dist(:rank==1))(X10_TEMP160);
final dist(:rank==1) X10_TEMP163 = (dist(:rank==1))(X10_TEMP28);

final dist(:rank==1) U = (dist(:rank==1))(X10_TEMP163);
final double[:rank==2] X10_TEMP166 = (double[:rank==2])(X10_TEMP0.testArray);

final double[:rank==2] tA = (double[:rank==2])(X10_TEMP166);
finish {
for(point(:rank==1)p:U) {
final dist(:rank==1) X10_TEMP170 = (dist(:rank==1))(U.distribution);

final dist(:rank==1) X10_TEMP32 = (dist(:rank==1))(X10_TEMP170);
final place X10_TEMP33 = (X10_TEMP32.get(p));
async(X10_TEMP33) {
final int X10_TEMP176 = (0);

int ilow = (X10_TEMP176);
final place X10_TEMP180 = (U.get(p));

final place X10_TEMP36 = (X10_TEMP180);
final boolean X10_TEMP38 = (X10_TEMP36.isFirst());
if (X10_TEMP38) {
final int X10_TEMP185 = (1);

final int X10_TEMP40 = (X10_TEMP185);
final int X10_TEMP188 = (X10_TEMP40);

ilow = (X10_TEMP188);
}
else {
final int X10_TEMP191 = (0);

final int X10_TEMP42 = (X10_TEMP191);
final int X10_TEMP194 = (X10_TEMP42);

ilow = (X10_TEMP194);
}
final dist(:rank==2) X10_TEMP197 = (dist(:rank==2))(tA.distribution);

final dist(:rank==2) X10_TEMP43 = (dist(:rank==2))(X10_TEMP197);
final place X10_TEMP200 = (here);

final place X10_TEMP44 = (X10_TEMP200);
final dist(:rank==2) X10_TEMP203 = (dist(:rank==2))(X10_TEMP43|X10_TEMP44);

final dist(:rank==2) X10_TEMP46 = (dist(:rank==2))(X10_TEMP203);
for(point(:rank==2)tempP[n,i]:X10_TEMP46) {
final boolean X10_TEMP48 = (i>=ilow);
if (X10_TEMP48) {
final int X10_TEMP209 = (0);

final int X10_TEMP49 = (X10_TEMP209);
final boolean X10_TEMP51 = (n==X10_TEMP49);
if (X10_TEMP51) {
final int X10_TEMP214 = (0);

final int X10_TEMP54 = (X10_TEMP214);
final double X10_TEMP217 = (0.0);

final double X10_TEMP55 = (X10_TEMP217);
final double X10_TEMP220 = ((double)X10_TEMP55);

final double X10_TEMP63 = (X10_TEMP220);
final double X10_TEMP223 = (2.0);

final double X10_TEMP57 = (X10_TEMP223);
final double X10_TEMP226 = ((double)X10_TEMP57);

final double X10_TEMP64 = (X10_TEMP226);
final int X10_TEMP229 = (1000);

final int X10_TEMP65 = (X10_TEMP229);
final double X10_TEMP232 = ((double)i);

final double X10_TEMP60 = (X10_TEMP232);
final double X10_TEMP235 = (omega*X10_TEMP60);

final double X10_TEMP66 = (X10_TEMP235);
final int X10_TEMP238 = (1);

final int X10_TEMP67 = (X10_TEMP238);
final double X10_TEMP247 = (Program0.Program_Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP63,X10_TEMP64,X10_TEMP65,X10_TEMP66,X10_TEMP67));

final double X10_TEMP70 = (X10_TEMP247);
final double X10_TEMP250 = (X10_TEMP70);

final double X10_TEMP71 = (X10_TEMP250);
final double X10_TEMP255 = (X10_TEMP71);

final double X10_TEMP258 = (X10_TEMP255);
tA[X10_TEMP54,i] = (X10_TEMP258);
}
else {
final double X10_TEMP260 = (0.0);

final double X10_TEMP74 = (X10_TEMP260);
final double X10_TEMP263 = ((double)X10_TEMP74);

final double X10_TEMP82 = (X10_TEMP263);
final double X10_TEMP266 = (2.0);

final double X10_TEMP76 = (X10_TEMP266);
final double X10_TEMP269 = ((double)X10_TEMP76);

final double X10_TEMP83 = (X10_TEMP269);
final int X10_TEMP272 = (1000);

final int X10_TEMP84 = (X10_TEMP272);
final double X10_TEMP275 = ((double)i);

final double X10_TEMP79 = (X10_TEMP275);
final double X10_TEMP278 = (omega*X10_TEMP79);

final double X10_TEMP85 = (X10_TEMP278);
final int X10_TEMP281 = (2);

final int X10_TEMP86 = (X10_TEMP281);
final double X10_TEMP290 = (Program0.Program_Series_TrapezoidIntegrate(X10_TEMP0,X10_TEMP82,X10_TEMP83,X10_TEMP84,X10_TEMP85,X10_TEMP86));

final double X10_TEMP89 = (X10_TEMP290);
final double X10_TEMP293 = (X10_TEMP89);

final double X10_TEMP90 = (X10_TEMP293);
final double X10_TEMP298 = (X10_TEMP90);

final double X10_TEMP301 = (X10_TEMP298);
tA[n,i] = (X10_TEMP301);
}
}
}
}
}
}
}
public static double Program_Series_TrapezoidIntegrate(final Series X10_TEMP0, final double x0, final double x1, final int nsteps, final double omegan, final int select) {
double X10_TEMP1 = (x0);
double X10_TEMP2 = (x1);
int X10_TEMP3 = (nsteps);
double X10_TEMP4 = (omegan);
int X10_TEMP5 = (select);
final double X10_TEMP98 = (0.0);

double x = (X10_TEMP98);
final double X10_TEMP101 = (0.0);

double dx = (X10_TEMP101);
final double X10_TEMP104 = (0.0);

double rvalue = (X10_TEMP104);
final double X10_TEMP107 = (X10_TEMP1);

x = (X10_TEMP107);
final double X10_TEMP110 = (X10_TEMP2-X10_TEMP1);

final double X10_TEMP11 = (X10_TEMP110);
final double X10_TEMP113 = ((double)X10_TEMP3);

final double X10_TEMP12 = (X10_TEMP113);
final double X10_TEMP116 = (X10_TEMP11/X10_TEMP12);

final double X10_TEMP14 = (X10_TEMP116);
final double X10_TEMP119 = (X10_TEMP14);

dx = (X10_TEMP119);
final double X10_TEMP126 = (Program0.Program_Series_thefunction(X10_TEMP0,X10_TEMP1,X10_TEMP4,X10_TEMP5));

final double X10_TEMP19 = (X10_TEMP126);
final double X10_TEMP129 = (2.0);

final double X10_TEMP18 = (X10_TEMP129);
final double X10_TEMP132 = ((double)X10_TEMP18);

final double X10_TEMP20 = (X10_TEMP132);
final double X10_TEMP135 = (X10_TEMP19/X10_TEMP20);

final double X10_TEMP22 = (X10_TEMP135);
final double X10_TEMP138 = (X10_TEMP22);

rvalue = (X10_TEMP138);
final int X10_TEMP141 = (1);

final int X10_TEMP23 = (X10_TEMP141);
final boolean X10_TEMP25 = (X10_TEMP3!=X10_TEMP23);
if (X10_TEMP25) {
final int X10_TEMP146 = (X10_TEMP3);

final int X10_TEMP26 = (X10_TEMP146);
final int X10_TEMP27 = (1);
final int X10_TEMP150 = (X10_TEMP3-X10_TEMP27);
X10_TEMP3 = (X10_TEMP150);
final int X10_TEMP28 = (1);
final int X10_TEMP153 = (X10_TEMP3-X10_TEMP28);
X10_TEMP3 = (X10_TEMP153);
final int X10_TEMP155 = (0);

final int X10_TEMP29 = (X10_TEMP155);
boolean X10_TEMP34 = (X10_TEMP3>X10_TEMP29);
boolean X10_TEMP160 = X10_TEMP34;
while(X10_TEMP160) {
final double X10_TEMP162 = (x+dx);

x = (X10_TEMP162);
final double X10_TEMP169 = (Program0.Program_Series_thefunction(X10_TEMP0,x,X10_TEMP4,X10_TEMP5));

final double X10_TEMP40 = (X10_TEMP169);
final double X10_TEMP172 = (rvalue+X10_TEMP40);

rvalue = (X10_TEMP172);
final int X10_TEMP31 = (1);
final int X10_TEMP176 = (X10_TEMP3-X10_TEMP31);
X10_TEMP3 = (X10_TEMP176);
final int X10_TEMP178 = (0);

final int X10_TEMP32 = (X10_TEMP178);
final boolean X10_TEMP181 = (X10_TEMP3>X10_TEMP32);
X10_TEMP34 = (X10_TEMP181);
X10_TEMP160 = X10_TEMP34;
}
}
final double X10_TEMP187 = (Program0.Program_Series_thefunction(X10_TEMP0,X10_TEMP2,X10_TEMP4,X10_TEMP5));

final double X10_TEMP45 = (X10_TEMP187);
final double X10_TEMP190 = (2.0);

final double X10_TEMP44 = (X10_TEMP190);
final double X10_TEMP193 = ((double)X10_TEMP44);

final double X10_TEMP46 = (X10_TEMP193);
final double X10_TEMP196 = (X10_TEMP45/X10_TEMP46);

final double X10_TEMP47 = (X10_TEMP196);
final double X10_TEMP199 = (rvalue+X10_TEMP47);

final double X10_TEMP49 = (X10_TEMP199);
final double X10_TEMP202 = (X10_TEMP49*dx);

final double X10_TEMP51 = (X10_TEMP202);
final double X10_TEMP205 = (X10_TEMP51);

rvalue = (X10_TEMP205);
final double X10_TEMP208 = (rvalue);

final double X10_TEMP53 = (X10_TEMP208);
return X10_TEMP53;
}
public static double Program_Series_thefunction(final Series X10_TEMP0, final double x, final double omegan, final int select) {
double X10_TEMP1 = (x);
double X10_TEMP2 = (omegan);
int X10_TEMP3 = (select);
final int X10_TEMP6 = (0);
final int X10_TEMP16 = (1);
final int X10_TEMP30 = (2);
switch(X10_TEMP3){
case X10_TEMP6:
{
final double X10_TEMP101 = (1.0);

final double X10_TEMP7 = (X10_TEMP101);
final double X10_TEMP104 = ((double)X10_TEMP7);

final double X10_TEMP8 = (X10_TEMP104);
final double X10_TEMP107 = (X10_TEMP1+X10_TEMP8);

final double X10_TEMP11 = (X10_TEMP107);
final double X10_TEMP112 = (Math.pow(X10_TEMP11,X10_TEMP1));

final double X10_TEMP13 = (X10_TEMP112);
return X10_TEMP13;
}
case X10_TEMP16:
{
final double X10_TEMP117 = (1.0);

final double X10_TEMP17 = (X10_TEMP117);
final double X10_TEMP120 = ((double)X10_TEMP17);

final double X10_TEMP18 = (X10_TEMP120);
final double X10_TEMP123 = (X10_TEMP1+X10_TEMP18);

final double X10_TEMP21 = (X10_TEMP123);
final double X10_TEMP128 = (Math.pow(X10_TEMP21,X10_TEMP1));

final double X10_TEMP24 = (X10_TEMP128);
final double X10_TEMP131 = (X10_TEMP2*X10_TEMP1);

final double X10_TEMP23 = (X10_TEMP131);
final double X10_TEMP135 = (Math.cos(X10_TEMP23));

final double X10_TEMP25 = (X10_TEMP135);
final double X10_TEMP138 = (X10_TEMP24*X10_TEMP25);

final double X10_TEMP27 = (X10_TEMP138);
return X10_TEMP27;
}
case X10_TEMP30:
{
final double X10_TEMP143 = (1.0);

final double X10_TEMP31 = (X10_TEMP143);
final double X10_TEMP146 = ((double)X10_TEMP31);

final double X10_TEMP32 = (X10_TEMP146);
final double X10_TEMP149 = (X10_TEMP1+X10_TEMP32);

final double X10_TEMP35 = (X10_TEMP149);
final double X10_TEMP154 = (Math.pow(X10_TEMP35,X10_TEMP1));

final double X10_TEMP38 = (X10_TEMP154);
final double X10_TEMP157 = (X10_TEMP2*X10_TEMP1);

final double X10_TEMP37 = (X10_TEMP157);
final double X10_TEMP161 = (Math.sin(X10_TEMP37));

final double X10_TEMP39 = (X10_TEMP161);
final double X10_TEMP164 = (X10_TEMP38*X10_TEMP39);

final double X10_TEMP41 = (X10_TEMP164);
return X10_TEMP41;
}
}
final double X10_TEMP168 = (0.0);

final double X10_TEMP44 = (X10_TEMP168);
return X10_TEMP44;
}
public static void Program_Series_freeTestData(final Series X10_TEMP0) {
}

}

class Program {
}

class Series {
public int setsize;
public int array_rows;
public double [:rank==2] testArray;


public Series() {
}


}

