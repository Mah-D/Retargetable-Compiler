public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _IDEATest_array_rows = Program._IDEATest_array_rows_init();
public static final long _Random_multiplier = Program._Random_multiplier_init();
public static final long _Random_addend = Program._Random_addend_init();
public static final long _Random_mask = Program._Random_mask_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final IDEATest X10_TEMP4 = (new IDEATest());

Program.IDEATest_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for crypt: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _IDEATest_array_rows_init() {

final int X10_TEMP2 = (32000);
return X10_TEMP2;
}
public static void IDEATest_run(final IDEATest X10_TEMP0) {
Program.IDEATest_kernel(X10_TEMP0);
Program.IDEATest_validate(X10_TEMP0);
}
public static void IDEATest_kernel(final IDEATest X10_TEMP0) {
Program.IDEATest_Do(X10_TEMP0);
}
public static void IDEATest_validate(final IDEATest X10_TEMP0) {
final byte[:rank==1] p1 = (byte[:rank==1])(X10_TEMP0.plain1);
final byte[:rank==1] c1 = (byte[:rank==1])(X10_TEMP0.crypt1);
final byte[:rank==1] p2 = (byte[:rank==1])(X10_TEMP0.plain2);
finish {
final byte[:rank==1] X10_TEMP4 = (byte[:rank==1])(X10_TEMP0.plain1);

final dist(:rank==1) X10_TEMP6 = (dist(:rank==1))(X10_TEMP4.distribution);
for(point(:rank==1)pt:X10_TEMP6) {
final place X10_TEMP7 = X10_TEMP6.get(pt);
async(X10_TEMP7) {
final byte X10_TEMP10 = (byte)(p1[pt]);
final byte X10_TEMP11 = (byte)(p2[pt]);

final boolean X10_TEMP13 = X10_TEMP10!=X10_TEMP11;
if (X10_TEMP13) {
final String X10_TEMP15 = ("Validation failed");
System.out.println(X10_TEMP15);
final String X10_TEMP16 = ("Original Byte ");
final String X10_TEMP17 = (X10_TEMP16+pt);
final String X10_TEMP18 = (" = ");
final String X10_TEMP20 = (X10_TEMP17+X10_TEMP18);
final byte X10_TEMP21 = (byte)(p1[pt]);

final String X10_TEMP23 = (X10_TEMP20+X10_TEMP21);
System.out.println(X10_TEMP23);
final String X10_TEMP24 = ("Encrypted Byte ");
final String X10_TEMP25 = (X10_TEMP24+pt);
final String X10_TEMP26 = (" = ");
final String X10_TEMP28 = (X10_TEMP25+X10_TEMP26);
final byte X10_TEMP29 = (byte)(c1[pt]);

final String X10_TEMP31 = (X10_TEMP28+X10_TEMP29);
System.out.println(X10_TEMP31);
final String X10_TEMP32 = ("Decrypted Byte ");
final String X10_TEMP33 = (X10_TEMP32+pt);
final String X10_TEMP34 = (" = ");
final String X10_TEMP36 = (X10_TEMP33+X10_TEMP34);
final byte X10_TEMP37 = (byte)(p2[pt]);

final String X10_TEMP39 = (X10_TEMP36+X10_TEMP37);
System.out.println(X10_TEMP39);
final String X10_TEMP41 = ("Validation failed");
throw new RuntimeException(X10_TEMP41);
}
}
}
}
}
public static void IDEATest_Do(final IDEATest X10_TEMP0) {
final byte[:rank==1] p1 = (byte[:rank==1])(X10_TEMP0.plain1);
final byte[:rank==1] c1 = (byte[:rank==1])(X10_TEMP0.crypt1);
final byte[:rank==1] p2 = (byte[:rank==1])(X10_TEMP0.plain2);
final int value[:rank==1] fzr = (int value[:rank==1])(X10_TEMP0.ZR);
final int value[:rank==1] fdkr = (int value[:rank==1])(X10_TEMP0.DKR);
finish {
final dist(:rank==1) X10_TEMP7 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pt:X10_TEMP7) {
final place X10_TEMP8 = X10_TEMP7.get(pt);
async(X10_TEMP8) {
Program.IDEATest_cipher_idea(X10_TEMP0,p1,c1,fzr);
Program.IDEATest_cipher_idea(X10_TEMP0,c1,p2,fdkr);
}
}
}
}
public static void IDEATest_cipher_idea(final IDEATest X10_TEMP0, final byte [:rank==1] text1, final byte [:rank==1] text2, final int value[:rank==1] key) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(text1.region);
final int X10_TEMP6 = (X10_TEMP1.size());
final int X10_TEMP2 = (8);
final int X10_TEMP3 = (place.MAX_PLACES);

final int X10_TEMP5 = (X10_TEMP2*X10_TEMP3);
final int X10_TEMP7 = (X10_TEMP6%X10_TEMP5);
final int X10_TEMP8 = (0);

final boolean X10_TEMP10 = X10_TEMP7!=X10_TEMP8;
if (X10_TEMP10) {
final String X10_TEMP12 = ("Invalid number of places for the distribution size");
throw new RuntimeException(X10_TEMP12);
}
final dist(:rank==1) X10_TEMP13 = (dist(:rank==1))(text1.distribution);
final place X10_TEMP14 = (here);

final dist(:rank==1) X10_TEMP16 = (dist(:rank==1))(X10_TEMP13|X10_TEMP14);
for(point(:rank==1)i:X10_TEMP16) {
final int X10_TEMP18 = (i[0]);
final int X10_TEMP19 = (8);
final int X10_TEMP20 = (X10_TEMP18%X10_TEMP19);
final int X10_TEMP21 = (0);

final boolean X10_TEMP23 = X10_TEMP20==X10_TEMP21;
if (X10_TEMP23) {
point(:rank==1) i1 = (i);
point(:rank==1) i2 = (i);
int ik = (0);
int x1 = (0);
int x2 = (0);
int x3 = (0);
int x4 = (0);
int t1 = (0);
int t2 = (0);
int r = (0);
final int X10_TEMP35 = (0);
ik = (X10_TEMP35);
final int X10_TEMP37 = (8);
r = (X10_TEMP37);
final byte X10_TEMP39 = (byte)(text1[i1]);
final int X10_TEMP40 = (0xff);

final int X10_TEMP42 = (X10_TEMP39&X10_TEMP40);
x1 = (X10_TEMP42);
int X10_TEMP44 = (1);

final point(:rank==1) X10_TEMP46 = (i1+[X10_TEMP44]);
i1 = (X10_TEMP46);
final byte X10_TEMP48 = (byte)(text1[i1]);
final int X10_TEMP49 = (0xff);

final int X10_TEMP51 = (X10_TEMP48&X10_TEMP49);
final int X10_TEMP52 = (8);
final int X10_TEMP53 = (X10_TEMP51<<X10_TEMP52);

final int X10_TEMP55 = (x1|X10_TEMP53);
x1 = (X10_TEMP55);
int X10_TEMP57 = (1);

final point(:rank==1) X10_TEMP59 = (i1+[X10_TEMP57]);
i1 = (X10_TEMP59);
final byte X10_TEMP61 = (byte)(text1[i1]);
final int X10_TEMP62 = (0xff);

final int X10_TEMP64 = (X10_TEMP61&X10_TEMP62);
x2 = (X10_TEMP64);
int X10_TEMP66 = (1);

final point(:rank==1) X10_TEMP68 = (i1+[X10_TEMP66]);
i1 = (X10_TEMP68);
final byte X10_TEMP70 = (byte)(text1[i1]);
final int X10_TEMP71 = (0xff);

final int X10_TEMP73 = (X10_TEMP70&X10_TEMP71);
final int X10_TEMP74 = (8);
final int X10_TEMP75 = (X10_TEMP73<<X10_TEMP74);

final int X10_TEMP77 = (x2|X10_TEMP75);
x2 = (X10_TEMP77);
int X10_TEMP79 = (1);

final point(:rank==1) X10_TEMP81 = (i1+[X10_TEMP79]);
i1 = (X10_TEMP81);
final byte X10_TEMP83 = (byte)(text1[i1]);
final int X10_TEMP84 = (0xff);

final int X10_TEMP86 = (X10_TEMP83&X10_TEMP84);
x3 = (X10_TEMP86);
int X10_TEMP88 = (1);

final point(:rank==1) X10_TEMP90 = (i1+[X10_TEMP88]);
i1 = (X10_TEMP90);
final byte X10_TEMP92 = (byte)(text1[i1]);
final int X10_TEMP93 = (0xff);

final int X10_TEMP95 = (X10_TEMP92&X10_TEMP93);
final int X10_TEMP96 = (8);
final int X10_TEMP97 = (X10_TEMP95<<X10_TEMP96);

final int X10_TEMP99 = (x3|X10_TEMP97);
x3 = (X10_TEMP99);
int X10_TEMP101 = (1);

final point(:rank==1) X10_TEMP103 = (i1+[X10_TEMP101]);
i1 = (X10_TEMP103);
final byte X10_TEMP105 = (byte)(text1[i1]);
final int X10_TEMP106 = (0xff);

final int X10_TEMP108 = (X10_TEMP105&X10_TEMP106);
x4 = (X10_TEMP108);
int X10_TEMP110 = (1);

final point(:rank==1) X10_TEMP112 = (i1+[X10_TEMP110]);
i1 = (X10_TEMP112);
final byte X10_TEMP114 = (byte)(text1[i1]);
final int X10_TEMP115 = (0xff);

final int X10_TEMP117 = (X10_TEMP114&X10_TEMP115);
final int X10_TEMP118 = (8);
final int X10_TEMP119 = (X10_TEMP117<<X10_TEMP118);

final int X10_TEMP121 = (x4|X10_TEMP119);
x4 = (X10_TEMP121);
int X10_TEMP123 = (1);

final point(:rank==1) X10_TEMP125 = (i1+[X10_TEMP123]);
i1 = (X10_TEMP125);
boolean X10_TEMP126 = false;
do {
final long X10_TEMP130 = ((long)x1);
final int X10_TEMP127 = (ik);
final int X10_TEMP128 = 1;
ik = ik + X10_TEMP128;

final int X10_TEMP131 = (key[X10_TEMP127]);
final long X10_TEMP132 = (X10_TEMP130*X10_TEMP131);
final long X10_TEMP133 = (0x10001L);
final long X10_TEMP134 = (X10_TEMP132%X10_TEMP133);
final int X10_TEMP135 = (0xffff);

final long X10_TEMP137 = (X10_TEMP134&X10_TEMP135);

final int X10_TEMP139 = ((int)X10_TEMP137);
x1 = (X10_TEMP139);
final int X10_TEMP140 = (ik);
final int X10_TEMP141 = 1;
ik = ik + X10_TEMP141;

final int X10_TEMP143 = (key[X10_TEMP140]);
final int X10_TEMP144 = (x2+X10_TEMP143);
final int X10_TEMP145 = (0xffff);

final int X10_TEMP147 = (X10_TEMP144&X10_TEMP145);
x2 = (X10_TEMP147);
final int X10_TEMP148 = (ik);
final int X10_TEMP149 = 1;
ik = ik + X10_TEMP149;

final int X10_TEMP151 = (key[X10_TEMP148]);
final int X10_TEMP152 = (x3+X10_TEMP151);
final int X10_TEMP153 = (0xffff);

final int X10_TEMP155 = (X10_TEMP152&X10_TEMP153);
x3 = (X10_TEMP155);
final long X10_TEMP159 = ((long)x4);
final int X10_TEMP156 = (ik);
final int X10_TEMP157 = 1;
ik = ik + X10_TEMP157;

final int X10_TEMP160 = (key[X10_TEMP156]);
final long X10_TEMP161 = (X10_TEMP159*X10_TEMP160);
final long X10_TEMP162 = (0x10001L);
final long X10_TEMP163 = (X10_TEMP161%X10_TEMP162);
final int X10_TEMP164 = (0xffff);

final long X10_TEMP166 = (X10_TEMP163&X10_TEMP164);

final int X10_TEMP168 = ((int)X10_TEMP166);
x4 = (X10_TEMP168);
final int X10_TEMP170 = (x1^x3);
t2 = (X10_TEMP170);
final long X10_TEMP174 = ((long)t2);
final int X10_TEMP171 = (ik);
final int X10_TEMP172 = 1;
ik = ik + X10_TEMP172;

final int X10_TEMP175 = (key[X10_TEMP171]);
final long X10_TEMP176 = (X10_TEMP174*X10_TEMP175);
final long X10_TEMP177 = (0x10001L);
final long X10_TEMP178 = (X10_TEMP176%X10_TEMP177);
final int X10_TEMP179 = (0xffff);

final long X10_TEMP181 = (X10_TEMP178&X10_TEMP179);

final int X10_TEMP183 = ((int)X10_TEMP181);
t2 = (X10_TEMP183);
final int X10_TEMP185 = (x2^x4);
final int X10_TEMP186 = (t2+X10_TEMP185);
final int X10_TEMP187 = (0xffff);

final int X10_TEMP189 = (X10_TEMP186&X10_TEMP187);
t1 = (X10_TEMP189);
final long X10_TEMP193 = ((long)t1);
final int X10_TEMP190 = (ik);
final int X10_TEMP191 = 1;
ik = ik + X10_TEMP191;

final int X10_TEMP194 = (key[X10_TEMP190]);
final long X10_TEMP195 = (X10_TEMP193*X10_TEMP194);
final long X10_TEMP196 = (0x10001L);
final long X10_TEMP197 = (X10_TEMP195%X10_TEMP196);
final int X10_TEMP198 = (0xffff);

final long X10_TEMP200 = (X10_TEMP197&X10_TEMP198);

final int X10_TEMP202 = ((int)X10_TEMP200);
t1 = (X10_TEMP202);
final int X10_TEMP203 = (t1+t2);
final int X10_TEMP204 = (0xffff);

final int X10_TEMP206 = (X10_TEMP203&X10_TEMP204);
t2 = (X10_TEMP206);
final int X10_TEMP208 = (x1^t1);
x1 = (X10_TEMP208);
final int X10_TEMP210 = (x4^t2);
x4 = (X10_TEMP210);
final int X10_TEMP212 = (t2^x2);
t2 = (X10_TEMP212);
final int X10_TEMP214 = (x3^t1);
x2 = (X10_TEMP214);
x3 = (t2);
final int X10_TEMP216 = 1;
r = r - X10_TEMP216;
final int X10_TEMP217 = (0);
X10_TEMP126 = r!=X10_TEMP217;
} while(X10_TEMP126);
final long X10_TEMP222 = ((long)x1);
final int X10_TEMP219 = (ik);
final int X10_TEMP220 = 1;
ik = ik + X10_TEMP220;

final int X10_TEMP223 = (key[X10_TEMP219]);
final long X10_TEMP224 = (X10_TEMP222*X10_TEMP223);
final long X10_TEMP225 = (0x10001L);
final long X10_TEMP226 = (X10_TEMP224%X10_TEMP225);
final int X10_TEMP227 = (0xffff);

final long X10_TEMP229 = (X10_TEMP226&X10_TEMP227);

final int X10_TEMP231 = ((int)X10_TEMP229);
x1 = (X10_TEMP231);
final int X10_TEMP232 = (ik);
final int X10_TEMP233 = 1;
ik = ik + X10_TEMP233;

final int X10_TEMP235 = (key[X10_TEMP232]);
final int X10_TEMP236 = (x3+X10_TEMP235);
final int X10_TEMP237 = (0xffff);

final int X10_TEMP239 = (X10_TEMP236&X10_TEMP237);
x3 = (X10_TEMP239);
final int X10_TEMP240 = (ik);
final int X10_TEMP241 = 1;
ik = ik + X10_TEMP241;

final int X10_TEMP243 = (key[X10_TEMP240]);
final int X10_TEMP244 = (x2+X10_TEMP243);
final int X10_TEMP245 = (0xffff);

final int X10_TEMP247 = (X10_TEMP244&X10_TEMP245);
x2 = (X10_TEMP247);
final long X10_TEMP251 = ((long)x4);
final int X10_TEMP248 = (ik);
final int X10_TEMP249 = 1;
ik = ik + X10_TEMP249;

final int X10_TEMP252 = (key[X10_TEMP248]);
final long X10_TEMP253 = (X10_TEMP251*X10_TEMP252);
final long X10_TEMP254 = (0x10001L);
final long X10_TEMP255 = (X10_TEMP253%X10_TEMP254);
final int X10_TEMP256 = (0xffff);

final long X10_TEMP258 = (X10_TEMP255&X10_TEMP256);

final int X10_TEMP260 = ((int)X10_TEMP258);
x4 = (X10_TEMP260);
final byte X10_TEMP264 = (byte)((byte)x1);
final byte X10_TEMP265 = (byte)(X10_TEMP264);
text2[i2] = (X10_TEMP265);
int X10_TEMP267 = (1);

final point(:rank==1) X10_TEMP269 = (i2+[X10_TEMP267]);
i2 = (X10_TEMP269);
final int X10_TEMP271 = (8);

final int X10_TEMP273 = (x1>>>X10_TEMP271);

final byte X10_TEMP276 = (byte)((byte)X10_TEMP273);
final byte X10_TEMP277 = (byte)(X10_TEMP276);
text2[i2] = (X10_TEMP277);
int X10_TEMP279 = (1);

final point(:rank==1) X10_TEMP281 = (i2+[X10_TEMP279]);
i2 = (X10_TEMP281);
final byte X10_TEMP285 = (byte)((byte)x3);
final byte X10_TEMP286 = (byte)(X10_TEMP285);
text2[i2] = (X10_TEMP286);
int X10_TEMP288 = (1);

final point(:rank==1) X10_TEMP290 = (i2+[X10_TEMP288]);
i2 = (X10_TEMP290);
final int X10_TEMP292 = (8);

final int X10_TEMP294 = (x3>>>X10_TEMP292);

final byte X10_TEMP297 = (byte)((byte)X10_TEMP294);
final byte X10_TEMP298 = (byte)(X10_TEMP297);
text2[i2] = (X10_TEMP298);
int X10_TEMP300 = (1);

final point(:rank==1) X10_TEMP302 = (i2+[X10_TEMP300]);
i2 = (X10_TEMP302);
final byte X10_TEMP306 = (byte)((byte)x2);
final byte X10_TEMP307 = (byte)(X10_TEMP306);
text2[i2] = (X10_TEMP307);
int X10_TEMP309 = (1);

final point(:rank==1) X10_TEMP311 = (i2+[X10_TEMP309]);
i2 = (X10_TEMP311);
final int X10_TEMP313 = (8);

final int X10_TEMP315 = (x2>>>X10_TEMP313);

final byte X10_TEMP318 = (byte)((byte)X10_TEMP315);
final byte X10_TEMP319 = (byte)(X10_TEMP318);
text2[i2] = (X10_TEMP319);
int X10_TEMP321 = (1);

final point(:rank==1) X10_TEMP323 = (i2+[X10_TEMP321]);
i2 = (X10_TEMP323);
final byte X10_TEMP327 = (byte)((byte)x4);
final byte X10_TEMP328 = (byte)(X10_TEMP327);
text2[i2] = (X10_TEMP328);
int X10_TEMP330 = (1);

final point(:rank==1) X10_TEMP332 = (i2+[X10_TEMP330]);
i2 = (X10_TEMP332);
final int X10_TEMP334 = (8);

final int X10_TEMP336 = (x4>>>X10_TEMP334);

final byte X10_TEMP339 = (byte)((byte)X10_TEMP336);
final byte X10_TEMP340 = (byte)(X10_TEMP339);
text2[i2] = (X10_TEMP340);
int X10_TEMP342 = (1);

final point(:rank==1) X10_TEMP344 = (i2+[X10_TEMP342]);
i2 = (X10_TEMP344);
}
}
}
public static int IDEATest_mul(final IDEATest X10_TEMP0, final int aa, final int ab) {
int a = (aa);
int b = (ab);
long p = (0L);
final int X10_TEMP4 = (0);

final boolean X10_TEMP6 = a!=X10_TEMP4;
if (X10_TEMP6) {
final int X10_TEMP7 = (0);

final boolean X10_TEMP9 = b!=X10_TEMP7;
if (X10_TEMP9) {
final long X10_TEMP10 = ((long)a);

final long X10_TEMP12 = (X10_TEMP10*b);
p = (X10_TEMP12);
final int X10_TEMP13 = ((int)p);
final int X10_TEMP14 = (0xFFFF);

final int X10_TEMP16 = (X10_TEMP13&X10_TEMP14);
b = (X10_TEMP16);
final int X10_TEMP17 = ((int)p);
final int X10_TEMP18 = (16);

final int X10_TEMP20 = (X10_TEMP17>>>X10_TEMP18);
a = (X10_TEMP20);
final int X10_TEMP27 = (b-a);
final boolean X10_TEMP21 = b<a;
int X10_TEMP24 = 0;
if(X10_TEMP21){
X10_TEMP24 = 1;
}
final int X10_TEMP25 = X10_TEMP24;

final int X10_TEMP26 = (X10_TEMP25);
final int X10_TEMP28 = (X10_TEMP27+X10_TEMP26);
final int X10_TEMP29 = (0xFFFF);

final int X10_TEMP31 = (X10_TEMP28&X10_TEMP29);

return X10_TEMP31;
}
else {
final int X10_TEMP33 = (1);

final int X10_TEMP35 = (X10_TEMP33-a);
final int X10_TEMP36 = (0xFFFF);

final int X10_TEMP38 = (X10_TEMP35&X10_TEMP36);

return X10_TEMP38;
}
}
else {
final int X10_TEMP40 = (1);

final int X10_TEMP42 = (X10_TEMP40-b);
final int X10_TEMP43 = (0xFFFF);

final int X10_TEMP45 = (X10_TEMP42&X10_TEMP43);

return X10_TEMP45;
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

class IDEATest {
public byte [:rank==1] plain1;
public byte [:rank==1] crypt1;
public byte [:rank==1] plain2;
public int value[:rank==1] userkey;
public int value[:rank==1] ZR;
public int value[:rank==1] DKR;


public IDEATest() {
this.IDEATest_buildTestData();
final int X10_TEMP6 = (0);
final int X10_TEMP3 = (Program._IDEATest_array_rows);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) X10_TEMP9 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.factory.block(X10_TEMP9));

final dist(:rank==1) D = (dist(:rank==1))(X10_TEMP10);
final byte[:rank==1] X10_TEMP17 = (byte[:rank==1])(new byte[D](point(:rank==1)p) {
final int X10_TEMP13 = (p[0]);

final byte X10_TEMP15 = (byte)((byte)X10_TEMP13);
return X10_TEMP15;
}

);
plain1 = (byte[:rank==1])(X10_TEMP17);
final byte[:rank==1] X10_TEMP19 = (byte[:rank==1])(new byte[D]);
crypt1 = (byte[:rank==1])(X10_TEMP19);
final byte[:rank==1] X10_TEMP21 = (byte[:rank==1])(new byte[D]);
plain2 = (byte[:rank==1])(X10_TEMP21);
}


public void IDEATest_buildTestData() {
long X10_TEMP2 = (136506717L);

final Random rndnum = (new Random(X10_TEMP2));
final int X10_TEMP6 = (0);
final int X10_TEMP7 = (7);

final region(:rank==1) rUserKey = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final place X10_TEMP9 = (here);

final dist(:rank==1) dUserKey = (dist(:rank==1))(rUserKey->X10_TEMP9);
final int[:rank==1] tUserKey = (int[:rank==1])(new int[dUserKey]);
for(point(:rank==1)pt:rUserKey) {
final int X10_TEMP14 = (Program.Random_nextInt(rndnum));

final int X10_TEMP17 = ((short)X10_TEMP14);
final int X10_TEMP18 = (X10_TEMP17);
tUserKey[pt] = (X10_TEMP18);
}
final int value[:rank==1] X10_TEMP22 = (int value[:rank==1])(new int value[rUserKey](point(:rank==1)pt) {
final int X10_TEMP21 = (tUserKey[pt]);
return X10_TEMP21;
}

);

final int value[:rank==1] tempuserkey = (int value[:rank==1])(X10_TEMP22);
userkey = (int value[:rank==1])(tempuserkey);
final int value[:rank==1] tempZR = (int value[:rank==1])(this.IDEATest_calcEncryptKey(tempuserkey));
ZR = (int value[:rank==1])(tempZR);
this.IDEATest_calcDecryptKey(tempZR);
}
public int value[:rank==1] IDEATest_calcEncryptKey(final int value[:rank==1] auserkey) {
int j = (0);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (51);

final region(:rank==1) rZ = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) dZ = (dist(:rank==1))(rZ->X10_TEMP7);
final int[:rank==1] Z = (int[:rank==1])(new int[dZ]);
final int X10_TEMP12 = (0);
final int X10_TEMP13 = (7);

final region(:rank==1) X10_TEMP15 = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
for(point(:rank==1)i:X10_TEMP15) {
final int X10_TEMP18 = (auserkey[i]);
final int X10_TEMP19 = (0xffff);

final int X10_TEMP22 = (X10_TEMP18&X10_TEMP19);
final int X10_TEMP23 = (X10_TEMP22);
Z[i] = (X10_TEMP23);
}
final int X10_TEMP26 = (8);
final int X10_TEMP27 = (51);

final region(:rank==1) X10_TEMP29 = (region(:rank==1))([X10_TEMP26:X10_TEMP27]);
for(point(:rank==1)i:X10_TEMP29) {
final int X10_TEMP31 = (i[0]);
final int X10_TEMP32 = (8);

final int X10_TEMP34 = (X10_TEMP31%X10_TEMP32);
j = (X10_TEMP34);
final int X10_TEMP35 = (6);

final boolean X10_TEMP37 = j<X10_TEMP35;
if (X10_TEMP37) {
final int X10_TEMP39 = (7);
final int X10_TEMP40 = 0;

int X10_TEMP42 = (X10_TEMP40 - X10_TEMP39);

final point(:rank==1) X10_TEMP44 = (i+[X10_TEMP42]);
final int X10_TEMP45 = (Z[X10_TEMP44]);
final int X10_TEMP46 = (9);

final int X10_TEMP48 = (X10_TEMP45>>>X10_TEMP46);
final int X10_TEMP49 = (6);
final int X10_TEMP50 = 0;

int X10_TEMP52 = (X10_TEMP50 - X10_TEMP49);

final point(:rank==1) X10_TEMP54 = (i+[X10_TEMP52]);
final int X10_TEMP55 = (Z[X10_TEMP54]);
final int X10_TEMP56 = (7);

final int X10_TEMP58 = (X10_TEMP55<<X10_TEMP56);

final int X10_TEMP60 = (X10_TEMP48|X10_TEMP58);
final int X10_TEMP61 = (0xFFFF);

final int X10_TEMP64 = (X10_TEMP60&X10_TEMP61);
final int X10_TEMP65 = (X10_TEMP64);
Z[i] = (X10_TEMP65);
continue;
}
final int X10_TEMP66 = (6);

final boolean X10_TEMP68 = j==X10_TEMP66;
if (X10_TEMP68) {
final int X10_TEMP70 = (7);
final int X10_TEMP71 = 0;

int X10_TEMP73 = (X10_TEMP71 - X10_TEMP70);

final point(:rank==1) X10_TEMP75 = (i+[X10_TEMP73]);
final int X10_TEMP76 = (Z[X10_TEMP75]);
final int X10_TEMP77 = (9);

final int X10_TEMP79 = (X10_TEMP76>>>X10_TEMP77);
final int X10_TEMP80 = (14);
final int X10_TEMP81 = 0;

int X10_TEMP83 = (X10_TEMP81 - X10_TEMP80);

final point(:rank==1) X10_TEMP85 = (i+[X10_TEMP83]);
final int X10_TEMP86 = (Z[X10_TEMP85]);
final int X10_TEMP87 = (7);

final int X10_TEMP89 = (X10_TEMP86<<X10_TEMP87);

final int X10_TEMP91 = (X10_TEMP79|X10_TEMP89);
final int X10_TEMP92 = (0xFFFF);

final int X10_TEMP95 = (X10_TEMP91&X10_TEMP92);
final int X10_TEMP96 = (X10_TEMP95);
Z[i] = (X10_TEMP96);
continue;
}
final int X10_TEMP98 = (15);
final int X10_TEMP99 = 0;

int X10_TEMP101 = (X10_TEMP99 - X10_TEMP98);

final point(:rank==1) X10_TEMP103 = (i+[X10_TEMP101]);
final int X10_TEMP104 = (Z[X10_TEMP103]);
final int X10_TEMP105 = (9);

final int X10_TEMP107 = (X10_TEMP104>>>X10_TEMP105);
final int X10_TEMP108 = (14);
final int X10_TEMP109 = 0;

int X10_TEMP111 = (X10_TEMP109 - X10_TEMP108);

final point(:rank==1) X10_TEMP113 = (i+[X10_TEMP111]);
final int X10_TEMP114 = (Z[X10_TEMP113]);
final int X10_TEMP115 = (7);

final int X10_TEMP117 = (X10_TEMP114<<X10_TEMP115);

final int X10_TEMP119 = (X10_TEMP107|X10_TEMP117);
final int X10_TEMP120 = (0xFFFF);

final int X10_TEMP123 = (X10_TEMP119&X10_TEMP120);
final int X10_TEMP124 = (X10_TEMP123);
Z[i] = (X10_TEMP124);
}
final int value[:rank==1] X10_TEMP128 = (int value[:rank==1])(new int value[rZ](point(:rank==1)pt) {
final int X10_TEMP127 = (Z[pt]);
return X10_TEMP127;
}

);

return X10_TEMP128;
}
public void IDEATest_calcDecryptKey(final int value[:rank==1] aZR) {
int j = (0);
int k = (0);
int t1 = (0);
int t2 = (0);
int t3 = (0);
final int X10_TEMP8 = (0);
final int X10_TEMP9 = (51);

final region(:rank==1) rDK = (region(:rank==1))([X10_TEMP8:X10_TEMP9]);
final place X10_TEMP11 = (here);

final dist(:rank==1) dDK = (dist(:rank==1))(rDK->X10_TEMP11);
final int[:rank==1] DK = (int[:rank==1])(new int[dDK]);
final int value[:rank==1] Z = (int value[:rank==1])(aZR);
final int X10_TEMP17 = (0);

final int X10_TEMP19 = (Z[X10_TEMP17]);

final int X10_TEMP21 = (this.IDEATest_inv(X10_TEMP19));
t1 = (X10_TEMP21);
final int X10_TEMP23 = (1);
final int X10_TEMP24 = (Z[X10_TEMP23]);
final int X10_TEMP25 = 0;
final int X10_TEMP26 = (X10_TEMP25 - X10_TEMP24);
final int X10_TEMP27 = (0xffff);

final int X10_TEMP29 = (X10_TEMP26&X10_TEMP27);
t2 = (X10_TEMP29);
final int X10_TEMP31 = (2);
final int X10_TEMP32 = (Z[X10_TEMP31]);
final int X10_TEMP33 = 0;
final int X10_TEMP34 = (X10_TEMP33 - X10_TEMP32);
final int X10_TEMP35 = (0xffff);

final int X10_TEMP37 = (X10_TEMP34&X10_TEMP35);
t3 = (X10_TEMP37);
final int X10_TEMP39 = (51);

final int X10_TEMP42 = (3);

final int X10_TEMP44 = (Z[X10_TEMP42]);

final int X10_TEMP47 = (this.IDEATest_inv(X10_TEMP44));
final int X10_TEMP48 = (X10_TEMP47);
DK[X10_TEMP39] = (X10_TEMP48);
final int X10_TEMP50 = (50);

final int X10_TEMP53 = (t3);
DK[X10_TEMP50] = (X10_TEMP53);
final int X10_TEMP55 = (49);

final int X10_TEMP58 = (t2);
DK[X10_TEMP55] = (X10_TEMP58);
final int X10_TEMP60 = (48);

final int X10_TEMP63 = (t1);
DK[X10_TEMP60] = (X10_TEMP63);
final int X10_TEMP65 = (47);
j = (X10_TEMP65);
final int X10_TEMP67 = (4);
k = (X10_TEMP67);
final int X10_TEMP70 = (0);
final int X10_TEMP71 = (6);

final region(:rank==1) X10_TEMP73 = (region(:rank==1))([X10_TEMP70:X10_TEMP71]);
for(point(:rank==1)i:X10_TEMP73) {
final int X10_TEMP74 = (k);
final int X10_TEMP75 = 1;
k = k + X10_TEMP75;


final int X10_TEMP78 = (Z[X10_TEMP74]);
t1 = (X10_TEMP78);
final int X10_TEMP79 = (j);
final int X10_TEMP80 = 1;
j = j - X10_TEMP80;


final int X10_TEMP82 = (k);
final int X10_TEMP83 = 1;
k = k + X10_TEMP83;


final int X10_TEMP87 = (Z[X10_TEMP82]);
final int X10_TEMP88 = (X10_TEMP87);
DK[X10_TEMP79] = (X10_TEMP88);
final int X10_TEMP89 = (j);
final int X10_TEMP90 = 1;
j = j - X10_TEMP90;


final int X10_TEMP94 = (t1);
DK[X10_TEMP89] = (X10_TEMP94);
final int X10_TEMP96 = (k);
final int X10_TEMP97 = 1;
k = k + X10_TEMP97;


final int X10_TEMP100 = (Z[X10_TEMP96]);

final int X10_TEMP102 = (this.IDEATest_inv(X10_TEMP100));
t1 = (X10_TEMP102);
final int X10_TEMP103 = (k);
final int X10_TEMP104 = 1;
k = k + X10_TEMP104;

final int X10_TEMP106 = (Z[X10_TEMP103]);
final int X10_TEMP107 = 0;
final int X10_TEMP108 = (X10_TEMP107 - X10_TEMP106);
final int X10_TEMP109 = (0xffff);

final int X10_TEMP111 = (X10_TEMP108&X10_TEMP109);
t2 = (X10_TEMP111);
final int X10_TEMP112 = (k);
final int X10_TEMP113 = 1;
k = k + X10_TEMP113;

final int X10_TEMP115 = (Z[X10_TEMP112]);
final int X10_TEMP116 = 0;
final int X10_TEMP117 = (X10_TEMP116 - X10_TEMP115);
final int X10_TEMP118 = (0xffff);

final int X10_TEMP120 = (X10_TEMP117&X10_TEMP118);
t3 = (X10_TEMP120);
final int X10_TEMP121 = (j);
final int X10_TEMP122 = 1;
j = j - X10_TEMP122;


final int X10_TEMP125 = (k);
final int X10_TEMP126 = 1;
k = k + X10_TEMP126;


final int X10_TEMP129 = (Z[X10_TEMP125]);

final int X10_TEMP132 = (this.IDEATest_inv(X10_TEMP129));
final int X10_TEMP133 = (X10_TEMP132);
DK[X10_TEMP121] = (X10_TEMP133);
final int X10_TEMP134 = (j);
final int X10_TEMP135 = 1;
j = j - X10_TEMP135;


final int X10_TEMP139 = (t2);
DK[X10_TEMP134] = (X10_TEMP139);
final int X10_TEMP140 = (j);
final int X10_TEMP141 = 1;
j = j - X10_TEMP141;


final int X10_TEMP145 = (t3);
DK[X10_TEMP140] = (X10_TEMP145);
final int X10_TEMP146 = (j);
final int X10_TEMP147 = 1;
j = j - X10_TEMP147;


final int X10_TEMP151 = (t1);
DK[X10_TEMP146] = (X10_TEMP151);
}
final int X10_TEMP152 = (k);
final int X10_TEMP153 = 1;
k = k + X10_TEMP153;


final int X10_TEMP156 = (Z[X10_TEMP152]);
t1 = (X10_TEMP156);
final int X10_TEMP157 = (j);
final int X10_TEMP158 = 1;
j = j - X10_TEMP158;


final int X10_TEMP160 = (k);
final int X10_TEMP161 = 1;
k = k + X10_TEMP161;


final int X10_TEMP165 = (Z[X10_TEMP160]);
final int X10_TEMP166 = (X10_TEMP165);
DK[X10_TEMP157] = (X10_TEMP166);
final int X10_TEMP167 = (j);
final int X10_TEMP168 = 1;
j = j - X10_TEMP168;


final int X10_TEMP172 = (t1);
DK[X10_TEMP167] = (X10_TEMP172);
final int X10_TEMP174 = (k);
final int X10_TEMP175 = 1;
k = k + X10_TEMP175;


final int X10_TEMP178 = (Z[X10_TEMP174]);

final int X10_TEMP180 = (this.IDEATest_inv(X10_TEMP178));
t1 = (X10_TEMP180);
final int X10_TEMP181 = (k);
final int X10_TEMP182 = 1;
k = k + X10_TEMP182;

final int X10_TEMP184 = (Z[X10_TEMP181]);
final int X10_TEMP185 = 0;
final int X10_TEMP186 = (X10_TEMP185 - X10_TEMP184);
final int X10_TEMP187 = (0xffff);

final int X10_TEMP189 = (X10_TEMP186&X10_TEMP187);
t2 = (X10_TEMP189);
final int X10_TEMP190 = (k);
final int X10_TEMP191 = 1;
k = k + X10_TEMP191;

final int X10_TEMP193 = (Z[X10_TEMP190]);
final int X10_TEMP194 = 0;
final int X10_TEMP195 = (X10_TEMP194 - X10_TEMP193);
final int X10_TEMP196 = (0xffff);

final int X10_TEMP198 = (X10_TEMP195&X10_TEMP196);
t3 = (X10_TEMP198);
final int X10_TEMP199 = (j);
final int X10_TEMP200 = 1;
j = j - X10_TEMP200;


final int X10_TEMP203 = (k);
final int X10_TEMP204 = 1;
k = k + X10_TEMP204;


final int X10_TEMP207 = (Z[X10_TEMP203]);

final int X10_TEMP210 = (this.IDEATest_inv(X10_TEMP207));
final int X10_TEMP211 = (X10_TEMP210);
DK[X10_TEMP199] = (X10_TEMP211);
final int X10_TEMP212 = (j);
final int X10_TEMP213 = 1;
j = j - X10_TEMP213;


final int X10_TEMP217 = (t3);
DK[X10_TEMP212] = (X10_TEMP217);
final int X10_TEMP218 = (j);
final int X10_TEMP219 = 1;
j = j - X10_TEMP219;


final int X10_TEMP223 = (t2);
DK[X10_TEMP218] = (X10_TEMP223);
final int X10_TEMP224 = (j);
final int X10_TEMP225 = 1;
j = j - X10_TEMP225;


final int X10_TEMP229 = (t1);
DK[X10_TEMP224] = (X10_TEMP229);
final int value[:rank==1] X10_TEMP233 = (int value[:rank==1])(new int value[rDK](point(:rank==1)i) {
final int X10_TEMP232 = (DK[i]);
return X10_TEMP232;
}

);

DKR = (int value[:rank==1])(X10_TEMP233);
}
public int IDEATest_inv(final int ax) {
int t0 = (0);
int t1 = (0);
int q = (0);
int y = (0);
int x = (ax);
final int X10_TEMP6 = (1);

final boolean X10_TEMP8 = x<=X10_TEMP6;
if (X10_TEMP8) {
final int X10_TEMP10 = (x);

return X10_TEMP10;
}
final int X10_TEMP12 = (0x10001);

final int X10_TEMP14 = (X10_TEMP12/x);
t1 = (X10_TEMP14);
final int X10_TEMP15 = (0x10001);

final int X10_TEMP17 = (X10_TEMP15%x);
y = (X10_TEMP17);
final int X10_TEMP18 = (1);

final boolean X10_TEMP20 = y==X10_TEMP18;
if (X10_TEMP20) {
final int X10_TEMP21 = (1);

final int X10_TEMP23 = (X10_TEMP21-t1);
final int X10_TEMP24 = (0xFFFF);

final int X10_TEMP26 = (X10_TEMP23&X10_TEMP24);

return X10_TEMP26;
}
final int X10_TEMP29 = (1);
t0 = (X10_TEMP29);
boolean X10_TEMP30 = false;
do {
final int X10_TEMP32 = (x/y);
q = (X10_TEMP32);
final int X10_TEMP34 = (x%y);
x = (X10_TEMP34);
final int X10_TEMP35 = (q*t1);

final int X10_TEMP37 = (t0+X10_TEMP35);
t0 = (X10_TEMP37);
final int X10_TEMP38 = (1);

final boolean X10_TEMP40 = x==X10_TEMP38;
if (X10_TEMP40) {
final int X10_TEMP42 = (t0);

return X10_TEMP42;
}
final int X10_TEMP45 = (y/x);
q = (X10_TEMP45);
final int X10_TEMP47 = (y%x);
y = (X10_TEMP47);
final int X10_TEMP48 = (q*t0);

final int X10_TEMP50 = (t1+X10_TEMP48);
t1 = (X10_TEMP50);
final int X10_TEMP51 = (1);
X10_TEMP30 = y!=X10_TEMP51;
} while(X10_TEMP30);
final int X10_TEMP53 = (1);

final int X10_TEMP55 = (X10_TEMP53-t1);
final int X10_TEMP56 = (0xFFFF);

final int X10_TEMP58 = (X10_TEMP55&X10_TEMP56);

return X10_TEMP58;
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

