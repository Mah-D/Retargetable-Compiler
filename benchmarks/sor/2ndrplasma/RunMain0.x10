public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static final long _Program__Random_multiplier = (Program0._Program__Random_multiplier_init());
public static final long _Program__Random_addend = (Program0._Program__Random_addend_init());
public static final long _Program__Random_mask = (Program0._Program__Random_mask_init());
public static final int _Program__SOR_JACOBI_NUM_ITER = (Program0._Program__SOR_JACOBI_NUM_ITER_init());
public static final long _Program__SOR_RANDOM_SEED = (Program0._Program__SOR_RANDOM_SEED_init());


public static void runMain() {
Program0.Program_runMain();
}
public static long _Program__Random_multiplier_init() {
final long X10_TEMP138 = (Program0.Program__Random_multiplier_init());

return X10_TEMP138;
}
public static long _Program__Random_addend_init() {
final long X10_TEMP138 = (Program0.Program__Random_addend_init());

return X10_TEMP138;
}
public static long _Program__Random_mask_init() {
final long X10_TEMP138 = (Program0.Program__Random_mask_init());

return X10_TEMP138;
}
public static int _Program__SOR_JACOBI_NUM_ITER_init() {
final int X10_TEMP138 = (Program0.Program__SOR_JACOBI_NUM_ITER_init());

return X10_TEMP138;
}
public static long _Program__SOR_RANDOM_SEED_init() {
final long X10_TEMP138 = (Program0.Program__SOR_RANDOM_SEED_init());

return X10_TEMP138;
}
public static long Program__Random_multiplier_init() {
final long X10_TEMP138 = (0x5DEECE66DL);

final long X10_TEMP2 = (X10_TEMP138);
return X10_TEMP2;
}
public static long Program__Random_addend_init() {
final long X10_TEMP138 = (0xBL);

final long X10_TEMP2 = (X10_TEMP138);
return X10_TEMP2;
}
public static long Program__Random_mask_init() {
final long X10_TEMP138 = (1L);

final long X10_TEMP1 = (X10_TEMP138);
final int X10_TEMP141 = (48);

final int X10_TEMP2 = (X10_TEMP141);
final long X10_TEMP144 = (X10_TEMP1<<X10_TEMP2);

final long X10_TEMP4 = (X10_TEMP144);
final int X10_TEMP147 = (1);

final int X10_TEMP5 = (X10_TEMP147);
final long X10_TEMP150 = (X10_TEMP4-X10_TEMP5);

final long X10_TEMP7 = (X10_TEMP150);
return X10_TEMP7;
}
public static void Program_Random_setSeed(final Random X10_TEMP0, final long rseed) {
long X10_TEMP1 = (rseed);
final long X10_TEMP139 = (X10_TEMP1^_Program__Random_multiplier);

final long X10_TEMP3 = (X10_TEMP139);
final long X10_TEMP142 = (X10_TEMP3&_Program__Random_mask);

final long X10_TEMP6 = (X10_TEMP142);
final long X10_TEMP145 = (X10_TEMP6);

final long X10_TEMP7 = (X10_TEMP145);
final long X10_TEMP148 = (X10_TEMP7);

final long X10_TEMP151 = (X10_TEMP148);
X10_TEMP0.seed = (X10_TEMP151);
}
public static int Program_Random_nextbits(final Random X10_TEMP0, final int bits) {
int X10_TEMP1 = (bits);
final long X10_TEMP139 = (X10_TEMP0.seed);

long oldseed = (X10_TEMP139);
final long X10_TEMP142 = (oldseed*_Program__Random_multiplier);

final long X10_TEMP3 = (X10_TEMP142);
final long X10_TEMP145 = (X10_TEMP3+_Program__Random_addend);

final long X10_TEMP5 = (X10_TEMP145);
final long X10_TEMP148 = (X10_TEMP5&_Program__Random_mask);

long nextseed = (X10_TEMP148);
final long X10_TEMP151 = (nextseed);

final long X10_TEMP9 = (X10_TEMP151);
final long X10_TEMP154 = (X10_TEMP9);

final long X10_TEMP157 = (X10_TEMP154);
X10_TEMP0.seed = (X10_TEMP157);
final int X10_TEMP159 = (48);

final int X10_TEMP10 = (X10_TEMP159);
final int X10_TEMP162 = (X10_TEMP10-X10_TEMP1);

final int X10_TEMP12 = (X10_TEMP162);
final long X10_TEMP165 = (nextseed>>>X10_TEMP12);

final long X10_TEMP14 = (X10_TEMP165);
final int X10_TEMP168 = ((int)X10_TEMP14);

final int X10_TEMP16 = (X10_TEMP168);
return X10_TEMP16;
}
public static int Program_Random_nextInt(final Random X10_TEMP0) {
final int X10_TEMP138 = (32);

final int X10_TEMP2 = (X10_TEMP138);
final int X10_TEMP143 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP2));

final int X10_TEMP4 = (X10_TEMP143);
return X10_TEMP4;
}
public static long Program_Random_nextLong(final Random X10_TEMP0) {
final int X10_TEMP138 = (32);

final int X10_TEMP2 = (X10_TEMP138);
final int X10_TEMP143 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP2));

final int X10_TEMP4 = (X10_TEMP143);
final long X10_TEMP146 = ((long)X10_TEMP4);

final long X10_TEMP5 = (X10_TEMP146);
final int X10_TEMP149 = (32);

final int X10_TEMP6 = (X10_TEMP149);
final long X10_TEMP152 = (X10_TEMP5<<X10_TEMP6);

final long X10_TEMP8 = (X10_TEMP152);
final int X10_TEMP155 = (32);

final int X10_TEMP10 = (X10_TEMP155);
final int X10_TEMP160 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP10));

final int X10_TEMP11 = (X10_TEMP160);
final long X10_TEMP163 = (X10_TEMP8+X10_TEMP11);

final long X10_TEMP13 = (X10_TEMP163);
return X10_TEMP13;
}
public static boolean Program_Random_nextBoolean(final Random X10_TEMP0) {
final int X10_TEMP138 = (1);

final int X10_TEMP2 = (X10_TEMP138);
final int X10_TEMP143 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP2));

final int X10_TEMP3 = (X10_TEMP143);
final int X10_TEMP146 = (0);

final int X10_TEMP4 = (X10_TEMP146);
final boolean X10_TEMP149 = (X10_TEMP3!=X10_TEMP4);

final boolean X10_TEMP6 = (X10_TEMP149);
return X10_TEMP6;
}
public static double Program_Random_nextDouble(final Random X10_TEMP0) {
final int X10_TEMP138 = (26);

final int X10_TEMP2 = (X10_TEMP138);
final int X10_TEMP143 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP2));

final int X10_TEMP4 = (X10_TEMP143);
final long X10_TEMP146 = ((long)X10_TEMP4);

final long X10_TEMP5 = (X10_TEMP146);
final int X10_TEMP149 = (27);

final int X10_TEMP6 = (X10_TEMP149);
final long X10_TEMP152 = (X10_TEMP5<<X10_TEMP6);

final long X10_TEMP8 = (X10_TEMP152);
final int X10_TEMP155 = (27);

final int X10_TEMP10 = (X10_TEMP155);
final int X10_TEMP160 = (Program0.Program_Random_nextbits(X10_TEMP0,X10_TEMP10));

final int X10_TEMP11 = (X10_TEMP160);
final long X10_TEMP163 = (X10_TEMP8+X10_TEMP11);

final long X10_TEMP13 = (X10_TEMP163);
final long X10_TEMP166 = (1L);

final long X10_TEMP14 = (X10_TEMP166);
final int X10_TEMP169 = (53);

final int X10_TEMP15 = (X10_TEMP169);
final long X10_TEMP172 = (X10_TEMP14<<X10_TEMP15);

final long X10_TEMP17 = (X10_TEMP172);
final double X10_TEMP175 = ((double)X10_TEMP17);

final double X10_TEMP18 = (X10_TEMP175);
final double X10_TEMP178 = (X10_TEMP13/X10_TEMP18);

final double X10_TEMP20 = (X10_TEMP178);
return X10_TEMP20;
}
public static void Program_runMain() {
final SOR X10_TEMP138 = (new SOR());

final SOR X10_TEMP1 = (X10_TEMP138);
Program0.Program_SOR_run(X10_TEMP1);
}
public static int Program__SOR_JACOBI_NUM_ITER_init() {
final int X10_TEMP138 = (100);

final int X10_TEMP2 = (X10_TEMP138);
return X10_TEMP2;
}
public static long Program__SOR_RANDOM_SEED_init() {
final int X10_TEMP138 = (10101010);

final long X10_TEMP2 = (X10_TEMP138);
return X10_TEMP2;
}
public static void Program_SOR_run(final SOR X10_TEMP0) {
Program0.Program_SOR_kernel(X10_TEMP0);
Program0.Program_SOR_validate(X10_TEMP0);
}
public static void Program_SOR_kernel(final SOR X10_TEMP0) {
final int X10_TEMP138 = (10);

final int X10_TEMP4 = (X10_TEMP138);
final int X10_TEMP141 = (10);

final int X10_TEMP5 = (X10_TEMP141);
final Random X10_TEMP144 = (X10_TEMP0.R);

final Random X10_TEMP6 = (X10_TEMP144);
final double[:rank==2] X10_TEMP151 = (double[:rank==2])(Program0.Program_SOR_RandomMatrix(X10_TEMP0,X10_TEMP4,X10_TEMP5,X10_TEMP6));

double[:rank==2] G = (double[:rank==2])(X10_TEMP151);
final double X10_TEMP154 = (1.25);

final double X10_TEMP11 = (X10_TEMP154);
Program0.Program_SOR_SORrun(X10_TEMP0,X10_TEMP11,G,_Program__SOR_JACOBI_NUM_ITER);
}
public static double [:rank==2] Program_SOR_RandomMatrix(final SOR X10_TEMP0, final int M, final int N, final Random R) {
final int X10_TEMP138 = (0);

final int X10_TEMP4 = (X10_TEMP138);
final int X10_TEMP141 = (1);

final int X10_TEMP2 = (X10_TEMP141);
final int X10_TEMP144 = (M-X10_TEMP2);

final int X10_TEMP5 = (X10_TEMP144);
final region(:rank==1) X10_TEMP149 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);

final region(:rank==1) X10_TEMP13 = (region(:rank==1))(X10_TEMP149);
final int X10_TEMP152 = (0);

final int X10_TEMP10 = (X10_TEMP152);
final int X10_TEMP155 = (1);

final int X10_TEMP8 = (X10_TEMP155);
final int X10_TEMP158 = (N-X10_TEMP8);

final int X10_TEMP11 = (X10_TEMP158);
final region(:rank==1) X10_TEMP163 = (region(:rank==1))([X10_TEMP10:X10_TEMP11]);

final region(:rank==1) X10_TEMP14 = (region(:rank==1))(X10_TEMP163);
final dist(:rank==2) X10_TEMP169 = (dist(:rank==2))(Program0.Program_SOR_blockStar(X10_TEMP0,X10_TEMP13,X10_TEMP14));

final dist(:rank==2) d = (dist(:rank==2))(X10_TEMP169);
final double[:rank==2&&distribution==d] X10_TEMP172 = (double[:rank==2&&distribution==d])(new double[d]);

final double[:rank==2] t = (double[:rank==2])(X10_TEMP172);
final region(:rank==2) X10_TEMP175 = (region(:rank==2))(t.region);

final region(:rank==2) X10_TEMP18 = (region(:rank==2))(X10_TEMP175);
for(point(:rank==2)[i,j]:X10_TEMP18) {
final double X10_TEMP180 = (Program0.Program_Random_nextDouble(R));

final double X10_TEMP22 = (X10_TEMP180);
final double X10_TEMP183 = (1e-6);

final double X10_TEMP23 = (X10_TEMP183);
final double X10_TEMP186 = (X10_TEMP22*X10_TEMP23);

final double X10_TEMP25 = (X10_TEMP186);
Program0.Program_SOR_write(X10_TEMP0,t,i,j,X10_TEMP25);
}
return t;
}
public static void Program_SOR_write(final SOR X10_TEMP0, final double [:rank==2] t, final int i, final int j, final double v) {
finish {
final dist(:rank==2) X10_TEMP138 = (dist(:rank==2))(t.distribution);

final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(X10_TEMP138);
final place X10_TEMP5 = (X10_TEMP1.get(i,j));
async(X10_TEMP5) {
final double X10_TEMP145 = (v);

final double X10_TEMP10 = (X10_TEMP145);
final double X10_TEMP150 = (X10_TEMP10);

final double X10_TEMP153 = (X10_TEMP150);
t[i,j] = (X10_TEMP153);
}
}
}
public static dist(:rank==2) Program_SOR_blockStar(final SOR X10_TEMP0, final region(:rank==1) r1, final region(:rank==1) r2) {
final dist(:rank==1) X10_TEMP139 = (dist(:rank==1))(dist.factory.block(r1));

final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP139);
final dist(:rank==1) X10_TEMP142 = (dist(:rank==1))(X10_TEMP2);

final dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP142);
final dist(:rank==2) X10_TEMP148 = (dist(:rank==2))(Program0.Program_SOR_distTimesRegion(X10_TEMP0,d1,r2));

final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(X10_TEMP148);
return X10_TEMP7;
}
public static dist(:rank==2) Program_SOR_distTimesRegion(final SOR X10_TEMP0, final dist(:rank==1) d, final region(:rank==1) r) {
dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(d);
region(:rank==1) X10_TEMP2 = (region(:rank==1))(r);
final int X10_TEMP141 = (1);
final int X10_TEMP142 = (0);
final int X10_TEMP145 = (1);
final int X10_TEMP146 = (0);

final region(:rank==2) X10_TEMP148 = (region(:rank==2))([X10_TEMP141:X10_TEMP142,X10_TEMP145:X10_TEMP146]);

final region(:rank==2) X10_TEMP3 = (region(:rank==2))(X10_TEMP148);
final region(:rank==2) X10_TEMP151 = (region(:rank==2))(X10_TEMP3);

final region(:rank==2) X10_TEMP5 = (region(:rank==2))(X10_TEMP151);
final place X10_TEMP154 = (here);

final place X10_TEMP6 = (X10_TEMP154);
final dist(:rank==2) X10_TEMP157 = (dist(:rank==2))(X10_TEMP5->X10_TEMP6);

dist(:rank==2) d0 = (dist(:rank==2))(X10_TEMP157);
final dist(:rank==1) X10_TEMP160 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(X10_TEMP160);
final region(:rank==1) X10_TEMP163 = (region(:rank==1))(X10_TEMP8.region);

final region(:rank==1) X10_TEMP10 = (region(:rank==1))(X10_TEMP163);
for(point(:rank==1)[pl]:X10_TEMP10) {
final place X10_TEMP168 = (place.places(pl));

place p = (X10_TEMP168);
final dist(:rank==1) X10_TEMP171 = (dist(:rank==1))(X10_TEMP1|p);

final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP171);
final region(:rank==1) X10_TEMP174 = (region(:rank==1))(X10_TEMP14.region);

final region(:rank==1) X10_TEMP15 = (region(:rank==1))(X10_TEMP174);
final region(:rank==2) X10_TEMP179 = (region(:rank==2))([X10_TEMP15,X10_TEMP2]);

final region(:rank==2) X10_TEMP18 = (region(:rank==2))(X10_TEMP179);
final dist(:rank==2) X10_TEMP182 = (dist(:rank==2))(X10_TEMP18->p);

final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(X10_TEMP182);
final dist(:rank==2) X10_TEMP185 = (dist(:rank==2))(d0||X10_TEMP20);

final dist(:rank==2) X10_TEMP22 = (dist(:rank==2))(X10_TEMP185);
final dist(:rank==2) X10_TEMP188 = (dist(:rank==2))(X10_TEMP22);

d0 = (dist(:rank==2))(X10_TEMP188);
}
return d0;
}
public static void Program_SOR_validate(final SOR X10_TEMP0) {
final double X10_TEMP138 = (X10_TEMP0.gtotal);

final double X10_TEMP1 = (X10_TEMP138);
final double X10_TEMP141 = (4.5185971433257635E-5);

final double X10_TEMP2 = (X10_TEMP141);
final double X10_TEMP144 = (X10_TEMP1-X10_TEMP2);

final double X10_TEMP4 = (X10_TEMP144);
final double X10_TEMP148 = (Math.abs(X10_TEMP4));

double dev = (X10_TEMP148);
final double X10_TEMP151 = (1.0e-12);

final double X10_TEMP6 = (X10_TEMP151);
final boolean X10_TEMP8 = (dev>X10_TEMP6);
if (X10_TEMP8) {
final String X10_TEMP156 = ("Validation failed");

final String X10_TEMP10 = (X10_TEMP156);
System.out.println(X10_TEMP10);
final String X10_TEMP160 = ("gtotal = ");

final String X10_TEMP11 = (X10_TEMP160);
final double X10_TEMP163 = (X10_TEMP0.gtotal);

final double X10_TEMP12 = (X10_TEMP163);
final String X10_TEMP166 = (X10_TEMP11+X10_TEMP12);

final String X10_TEMP13 = (X10_TEMP166);
final String X10_TEMP169 = ("  ");

final String X10_TEMP14 = (X10_TEMP169);
final String X10_TEMP172 = (X10_TEMP13+X10_TEMP14);

final String X10_TEMP15 = (X10_TEMP172);
final String X10_TEMP175 = (X10_TEMP15+dev);

final String X10_TEMP17 = (X10_TEMP175);
System.out.println(X10_TEMP17);
final String X10_TEMP179 = ("Validation failed");

final String X10_TEMP19 = (X10_TEMP179);
throw new RuntimeException(X10_TEMP19);
}
}
public static double Program_SOR_read(final SOR X10_TEMP0, final double [:rank==2] G, final int i, final int j) {
final int X10_TEMP138 = (0);

final int X10_TEMP3 = (X10_TEMP138);
final int X10_TEMP141 = (0);

final int X10_TEMP4 = (X10_TEMP141);
final region(:rank==1) X10_TEMP146 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) r = (region(:rank==1))(X10_TEMP146);
final place X10_TEMP149 = (here);

final place X10_TEMP6 = (X10_TEMP149);
final dist(:rank==1) X10_TEMP152 = (dist(:rank==1))(r->X10_TEMP6);

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP152);
final double[:rank==1&&distribution==d] X10_TEMP155 = (double[:rank==1&&distribution==d])(new double[d]);

final double[:rank==1] result = (double[:rank==1])(X10_TEMP155);
final place X10_TEMP158 = (here);

final place phere = (X10_TEMP158);
finish {
final dist(:rank==2) X10_TEMP161 = (dist(:rank==2))(G.distribution);

final dist(:rank==2) X10_TEMP10 = (dist(:rank==2))(X10_TEMP161);
final place X10_TEMP14 = (X10_TEMP10.get(i,j));
async(X10_TEMP14) {
final double X10_TEMP170 = (G[i,j]);

final double val = (X10_TEMP170);
async(phere) {
final int X10_TEMP174 = (0);

final int X10_TEMP20 = (X10_TEMP174);
final double X10_TEMP177 = (val);

final double X10_TEMP23 = (X10_TEMP177);
final double X10_TEMP181 = (X10_TEMP23);

final double X10_TEMP184 = (X10_TEMP181);
result[X10_TEMP20] = (X10_TEMP184);
}
}
}
final int X10_TEMP186 = (0);

final int X10_TEMP25 = (X10_TEMP186);
final double X10_TEMP190 = (result[X10_TEMP25]);

final double X10_TEMP27 = (X10_TEMP190);
return X10_TEMP27;
}
public static void Program_SOR_SORrun(final SOR X10_TEMP0, final double omega, final double [:rank==2] G, final int num_iterations) {
final dist(:rank==2) X10_TEMP138 = (dist(:rank==2))(G.distribution);

final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(X10_TEMP138);
final region(:rank==2) X10_TEMP141 = (region(:rank==2))(X10_TEMP1.region);

final region(:rank==2) X10_TEMP2 = (region(:rank==2))(X10_TEMP141);
final int X10_TEMP144 = (0);

final int X10_TEMP4 = (X10_TEMP144);
final int X10_TEMP6 = (2);
final boolean X10_TEMP5 = (X10_TEMP4>=X10_TEMP6);
if (X10_TEMP5) {
final String X10_TEMP7 = ("Invalid dimension for rank projection. Got ");
final String X10_TEMP8 = (", expected 2");
String X10_TEMP9 = (X10_TEMP7+X10_TEMP4);
final String X10_TEMP153 = (X10_TEMP9+X10_TEMP8);
X10_TEMP9 = (X10_TEMP153);
throw new RuntimeException(X10_TEMP9);
}
final int X10_TEMP157 = (1);
final int X10_TEMP158 = (0);

final region(:rank==1) X10_TEMP160 = (region(:rank==1))([X10_TEMP157:X10_TEMP158]);

region(:rank==1) X10_TEMP10 = (region(:rank==1))(X10_TEMP160);
final int X10_TEMP11 = (0);
final boolean X10_TEMP13 = (X10_TEMP4==X10_TEMP11);
final int X10_TEMP12 = (1);
final boolean X10_TEMP14 = (X10_TEMP4==X10_TEMP12);
for(point(:rank==2)[X10_TEMP15,X10_TEMP16]:X10_TEMP2) {
if (X10_TEMP13) {
final region(:rank==1) X10_TEMP17 = (region(:rank==1))([X10_TEMP15:X10_TEMP15]);
final region(:rank==1) X10_TEMP172 = (region(:rank==1))(X10_TEMP10||X10_TEMP17);
X10_TEMP10 = (region(:rank==1))(X10_TEMP172);
}
else {
if (X10_TEMP14) {
final region(:rank==1) X10_TEMP17 = (region(:rank==1))([X10_TEMP16:X10_TEMP16]);
final region(:rank==1) X10_TEMP178 = (region(:rank==1))(X10_TEMP10||X10_TEMP17);
X10_TEMP10 = (region(:rank==1))(X10_TEMP178);
}
}
}
final region(:rank==1) X10_TEMP18 = (region(:rank==1))(X10_TEMP10);
final int X10_TEMP181 = (X10_TEMP18.size());

final int M = (X10_TEMP181);
final dist(:rank==2) X10_TEMP184 = (dist(:rank==2))(G.distribution);

final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(X10_TEMP184);
final region(:rank==2) X10_TEMP187 = (region(:rank==2))(X10_TEMP20.region);

final region(:rank==2) X10_TEMP21 = (region(:rank==2))(X10_TEMP187);
final int X10_TEMP190 = (1);

final int X10_TEMP23 = (X10_TEMP190);
final int X10_TEMP25 = (2);
final boolean X10_TEMP24 = (X10_TEMP23>=X10_TEMP25);
if (X10_TEMP24) {
final String X10_TEMP26 = ("Invalid dimension for rank projection. Got ");
final String X10_TEMP27 = (", expected 2");
String X10_TEMP28 = (X10_TEMP26+X10_TEMP23);
final String X10_TEMP199 = (X10_TEMP28+X10_TEMP27);
X10_TEMP28 = (X10_TEMP199);
throw new RuntimeException(X10_TEMP28);
}
final int X10_TEMP203 = (1);
final int X10_TEMP204 = (0);

final region(:rank==1) X10_TEMP206 = (region(:rank==1))([X10_TEMP203:X10_TEMP204]);

region(:rank==1) X10_TEMP29 = (region(:rank==1))(X10_TEMP206);
final int X10_TEMP30 = (0);
final boolean X10_TEMP32 = (X10_TEMP23==X10_TEMP30);
final int X10_TEMP31 = (1);
final boolean X10_TEMP33 = (X10_TEMP23==X10_TEMP31);
for(point(:rank==2)[X10_TEMP34,X10_TEMP35]:X10_TEMP21) {
if (X10_TEMP32) {
final region(:rank==1) X10_TEMP36 = (region(:rank==1))([X10_TEMP34:X10_TEMP34]);
final region(:rank==1) X10_TEMP218 = (region(:rank==1))(X10_TEMP29||X10_TEMP36);
X10_TEMP29 = (region(:rank==1))(X10_TEMP218);
}
else {
if (X10_TEMP33) {
final region(:rank==1) X10_TEMP36 = (region(:rank==1))([X10_TEMP35:X10_TEMP35]);
final region(:rank==1) X10_TEMP224 = (region(:rank==1))(X10_TEMP29||X10_TEMP36);
X10_TEMP29 = (region(:rank==1))(X10_TEMP224);
}
}
}
final region(:rank==1) X10_TEMP37 = (region(:rank==1))(X10_TEMP29);
final int X10_TEMP227 = (X10_TEMP37.size());

final int N = (X10_TEMP227);
final double X10_TEMP230 = (0.25);

final double X10_TEMP39 = (X10_TEMP230);
final double X10_TEMP233 = (omega*X10_TEMP39);

final double omega_over_four = (X10_TEMP233);
final double X10_TEMP236 = (1.0);

final double X10_TEMP41 = (X10_TEMP236);
final double X10_TEMP239 = (X10_TEMP41-omega);

final double one_minus_omega = (X10_TEMP239);
final int X10_TEMP242 = (1);

final int X10_TEMP43 = (X10_TEMP242);
final int X10_TEMP245 = (M-X10_TEMP43);

final int Mm1 = (X10_TEMP245);
final int X10_TEMP248 = (1);

final int X10_TEMP45 = (X10_TEMP248);
final int X10_TEMP251 = (N-X10_TEMP45);

final int Nm1 = (X10_TEMP251);
final int X10_TEMP254 = (0);

final int X10_TEMP50 = (X10_TEMP254);
final int X10_TEMP257 = (1);

final int X10_TEMP48 = (X10_TEMP257);
final int X10_TEMP260 = (num_iterations-X10_TEMP48);

final int X10_TEMP51 = (X10_TEMP260);
final region(:rank==1) X10_TEMP265 = (region(:rank==1))([X10_TEMP50:X10_TEMP51]);

final region(:rank==1) X10_TEMP53 = (region(:rank==1))(X10_TEMP265);
for(point(:rank==1)[p]:X10_TEMP53) {
final int X10_TEMP269 = (0);

final int X10_TEMP56 = (X10_TEMP269);
final int X10_TEMP272 = (1);

final int X10_TEMP57 = (X10_TEMP272);
final region(:rank==1) X10_TEMP277 = (region(:rank==1))([X10_TEMP56:X10_TEMP57]);

final region(:rank==1) X10_TEMP59 = (region(:rank==1))(X10_TEMP277);
for(point(:rank==1)[o]:X10_TEMP59) {
finish {
final int X10_TEMP281 = (0);

final int X10_TEMP73 = (X10_TEMP281);
final int X10_TEMP284 = (1);

final int X10_TEMP61 = (X10_TEMP284);
final int X10_TEMP287 = (Mm1-X10_TEMP61);

final int X10_TEMP63 = (X10_TEMP287);
final int X10_TEMP290 = (1);

final int X10_TEMP64 = (X10_TEMP290);
final int X10_TEMP293 = (X10_TEMP64+o);

final int X10_TEMP66 = (X10_TEMP293);
final int X10_TEMP296 = (X10_TEMP63-X10_TEMP66);

final int X10_TEMP68 = (X10_TEMP296);
final int X10_TEMP299 = (2);

final int X10_TEMP69 = (X10_TEMP299);
final int X10_TEMP302 = (X10_TEMP68/X10_TEMP69);

final int X10_TEMP71 = (X10_TEMP302);
final region(:rank==1) X10_TEMP307 = (region(:rank==1))([X10_TEMP73:X10_TEMP71]);

final region(:rank==1) X10_TEMP75 = (region(:rank==1))(X10_TEMP307);
final place X10_TEMP76 = (here);
for(point(:rank==1)[ii]:X10_TEMP75) {
async(X10_TEMP76) {
final int X10_TEMP313 = (2);

final int X10_TEMP77 = (X10_TEMP313);
final int X10_TEMP316 = (X10_TEMP77*ii);

final int X10_TEMP78 = (X10_TEMP316);
final int X10_TEMP319 = (1);

final int X10_TEMP79 = (X10_TEMP319);
final int X10_TEMP322 = (X10_TEMP78+X10_TEMP79);

final int X10_TEMP80 = (X10_TEMP322);
final int X10_TEMP325 = (X10_TEMP80+o);

final int i = (X10_TEMP325);
finish {
final dist(:rank==2) X10_TEMP328 = (dist(:rank==2))(G.distribution);

final dist(:rank==2) X10_TEMP82 = (dist(:rank==2))(X10_TEMP328);
final int X10_TEMP331 = (1);

int X10_TEMP85 = (X10_TEMP331);
final place X10_TEMP87 = (X10_TEMP82.get(i,X10_TEMP85));
async(X10_TEMP87) {
final int X10_TEMP338 = (1);

final int X10_TEMP91 = (X10_TEMP338);
final int X10_TEMP341 = (1);

final int X10_TEMP89 = (X10_TEMP341);
final int X10_TEMP344 = (Nm1-X10_TEMP89);

final int X10_TEMP92 = (X10_TEMP344);
final region(:rank==1) X10_TEMP349 = (region(:rank==1))([X10_TEMP91:X10_TEMP92]);

final region(:rank==1) X10_TEMP94 = (region(:rank==1))(X10_TEMP349);
for(point(:rank==1)[j]:X10_TEMP94) {
final int X10_TEMP353 = (1);

final int X10_TEMP98 = (X10_TEMP353);
final int X10_TEMP356 = (i-X10_TEMP98);

final int X10_TEMP101 = (X10_TEMP356);
final double X10_TEMP363 = (Program0.Program_SOR_read(X10_TEMP0,G,X10_TEMP101,j));

final double X10_TEMP107 = (X10_TEMP363);
final int X10_TEMP366 = (1);

final int X10_TEMP103 = (X10_TEMP366);
final int X10_TEMP369 = (i+X10_TEMP103);

final int X10_TEMP106 = (X10_TEMP369);
final double X10_TEMP376 = (Program0.Program_SOR_read(X10_TEMP0,G,X10_TEMP106,j));

final double X10_TEMP108 = (X10_TEMP376);
final double X10_TEMP379 = (X10_TEMP107+X10_TEMP108);

final double X10_TEMP113 = (X10_TEMP379);
final int X10_TEMP382 = (1);

final int X10_TEMP110 = (X10_TEMP382);
final int X10_TEMP385 = (j-X10_TEMP110);

final int X10_TEMP112 = (X10_TEMP385);
final double X10_TEMP390 = (G[i,X10_TEMP112]);

final double X10_TEMP114 = (X10_TEMP390);
final double X10_TEMP393 = (X10_TEMP113+X10_TEMP114);

final double X10_TEMP119 = (X10_TEMP393);
final int X10_TEMP396 = (1);

final int X10_TEMP116 = (X10_TEMP396);
final int X10_TEMP399 = (j+X10_TEMP116);

final int X10_TEMP118 = (X10_TEMP399);
final double X10_TEMP404 = (G[i,X10_TEMP118]);

final double X10_TEMP120 = (X10_TEMP404);
final double X10_TEMP407 = (X10_TEMP119+X10_TEMP120);

final double X10_TEMP122 = (X10_TEMP407);
final double X10_TEMP410 = (omega_over_four*X10_TEMP122);

final double X10_TEMP126 = (X10_TEMP410);
final double X10_TEMP415 = (G[i,j]);

final double X10_TEMP125 = (X10_TEMP415);
final double X10_TEMP418 = (one_minus_omega*X10_TEMP125);

final double X10_TEMP127 = (X10_TEMP418);
final double X10_TEMP421 = (X10_TEMP126+X10_TEMP127);

final double X10_TEMP130 = (X10_TEMP421);
final double X10_TEMP424 = (X10_TEMP130);

final double X10_TEMP131 = (X10_TEMP424);
final double X10_TEMP429 = (X10_TEMP131);

final double X10_TEMP432 = (X10_TEMP429);
G[i,j] = (X10_TEMP432);
}
}
}
}
}
}
}
}
final double X10_TEMP435 = (Program0.Program_doublerefArraySum2(G));

final double X10_TEMP134 = (X10_TEMP435);
final double X10_TEMP438 = (X10_TEMP134);

final double X10_TEMP135 = (X10_TEMP438);
final double X10_TEMP441 = (X10_TEMP135);

final double X10_TEMP444 = (X10_TEMP441);
X10_TEMP0.gtotal = (X10_TEMP444);
}
public static double Program_doublerefArraySum2(final double [:rank==2] sumArray) {
final int maxPlaces = (place.MAX_PLACES);
final int one = (1);
final int maxPlacesMinusOne = (maxPlaces-one);
final int X10_TEMP142 = (0);

final region(:rank==1) X10_TEMP144 = (region(:rank==1))([X10_TEMP142:maxPlacesMinusOne]);

final region(:rank==1) dReg = (region(:rank==1))(X10_TEMP144);
final place source = (here);
final dist(:rank==1) X10_TEMP148 = (dist(:rank==1))(dReg->source);

final dist(:rank==1) dSum = (dist(:rank==1))(X10_TEMP148);
final double initVal = (0);
final double[:rank==1&&distribution==dSum] X10_TEMP153 = (double[:rank==1&&distribution==dSum])(new double[dSum](point(:rank==1)p) {
return initVal;
}

);

final double[:rank==1] localSumArray = (double[:rank==1])(X10_TEMP153);
final dist(:rank==1) X10_TEMP156 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP156);
finish {
for(point(:rank==1)p:dUnique) {
final place nthPlace = (dUnique.get(p));
async(nthPlace) {
double localSumTemp = (0);
final place thisPlace = (here);
final dist(:rank==2) X10_TEMP165 = (dist(:rank==2))(sumArray.distribution);

final dist(:rank==2) sumArrayDist = (dist(:rank==2))(X10_TEMP165);
final dist(:rank==2) X10_TEMP168 = (dist(:rank==2))(sumArrayDist|thisPlace);

final dist(:rank==2) sumArrayDistHere = (dist(:rank==2))(X10_TEMP168);
for(point(:rank==2)pt:sumArrayDistHere) {
final double localSumCurr = (sumArray[pt]);
final double X10_TEMP174 = (localSumTemp+localSumCurr);
localSumTemp = (X10_TEMP174);
}
final double zero = (0);
final boolean isNotEqual = (localSumTemp!=zero);
if (isNotEqual) {
final int index = (thisPlace.id);
final double localSum = (localSumTemp);
async(source) {
final double X10_TEMP183 = (localSum);

final double X10_TEMP186 = (X10_TEMP183);
localSumArray[index] = (X10_TEMP186);
}
}
}
}
}
double globalSum = (0);
for(point(:rank==1)p:localSumArray) {
final double localSumCurr = (localSumArray[p]);
final double X10_TEMP192 = (globalSum+localSumCurr);
globalSum = (X10_TEMP192);
}
return globalSum;
}

}

class Program {
}

class Random {
public long seed;


public Random(final long rseed) {
final long X10_TEMP138 = (rseed);

long X10_TEMP1 = (X10_TEMP138);
Program0.Program_Random_setSeed(this,X10_TEMP1);
}


}

class SOR {
public Random R;
public double gtotal;


public SOR() {
final double X10_TEMP138 = (0.0);

final double X10_TEMP2 = (X10_TEMP138);
final double X10_TEMP141 = (X10_TEMP2);

gtotal = (X10_TEMP141);
final long X10_TEMP144 = (Program0._Program__SOR_RANDOM_SEED);

long X10_TEMP4 = (X10_TEMP144);
final Random X10_TEMP148 = (new Random(X10_TEMP4));

final Random X10_TEMP6 = (X10_TEMP148);
final Random X10_TEMP151 = (X10_TEMP6);

R = (X10_TEMP151);
}


}

