public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _Linpack_r = Program._Linpack_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final Linpack X10_TEMP4 = (new Linpack());

Program.Linpack_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for linpack: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static region(:rank==1) _Linpack_r_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (2);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
return X10_TEMP6;
}
public static void Linpack_initdataSizesArray(final Linpack X10_TEMP0, final int [:rank==1] datasizes) {
final int X10_TEMP2 = (0);

final int X10_TEMP5 = (150);
final int X10_TEMP6 = (X10_TEMP5);
datasizes[X10_TEMP2] = (X10_TEMP6);
final int X10_TEMP8 = (1);

final int X10_TEMP11 = (1000);
final int X10_TEMP12 = (X10_TEMP11);
datasizes[X10_TEMP8] = (X10_TEMP12);
final int X10_TEMP14 = (2);

final int X10_TEMP17 = (2000);
final int X10_TEMP18 = (X10_TEMP17);
datasizes[X10_TEMP14] = (X10_TEMP18);
}
public static void Linpack_JGFsetsize(final Linpack X10_TEMP0, final int setSize) {
final int X10_TEMP3 = (setSize);
X10_TEMP0.setSize = (X10_TEMP3);
}
public static void Linpack_JGFinitialise(final Linpack X10_TEMP0, final dist(:rank==1) vd) {
final int[:rank==1] datasizes = (int[:rank==1])(new int[vd](point(:rank==1)p0) {
final int X10_TEMP2 = (0);
return X10_TEMP2;
}

);
Program.Linpack_initdataSizesArray(X10_TEMP0,datasizes);
final int X10_TEMP6 = (X10_TEMP0.setSize);

final int X10_TEMP9 = (datasizes[X10_TEMP6]);
final int X10_TEMP10 = (X10_TEMP9);
X10_TEMP0.n = (X10_TEMP10);
final String X10_TEMP11 = ("ATTENTION: Running with smaller size (");
final int X10_TEMP12 = (X10_TEMP0.n);
final String X10_TEMP13 = (X10_TEMP11+X10_TEMP12);
final String X10_TEMP14 = (" instead of 500)");

final String X10_TEMP16 = (X10_TEMP13+X10_TEMP14);
System.out.println(X10_TEMP16);
final int X10_TEMP19 = (X10_TEMP0.n);
final int X10_TEMP20 = (X10_TEMP19);
X10_TEMP0.ldaa = (X10_TEMP20);
final int X10_TEMP21 = (X10_TEMP0.ldaa);
final int X10_TEMP22 = (1);

final int X10_TEMP25 = (X10_TEMP21+X10_TEMP22);
final int X10_TEMP26 = (X10_TEMP25);
X10_TEMP0.lda = (X10_TEMP26);
final int X10_TEMP29 = (0);
final int X10_TEMP30 = (X10_TEMP0.ldaa);

region(:rank==1) vectorRegion = (region(:rank==1))([X10_TEMP29:X10_TEMP30]);
final int X10_TEMP36 = (0);
final int X10_TEMP33 = (X10_TEMP0.ldaa);
final int X10_TEMP34 = (1);
final int X10_TEMP37 = (X10_TEMP33-X10_TEMP34);

region(:rank==1) vectorRegionMinus1 = (region(:rank==1))([X10_TEMP36:X10_TEMP37]);
final place X10_TEMP39 = (here);

dist(:rank==1) vectorRegionMinus1Dist = (dist(:rank==1))(vectorRegionMinus1->X10_TEMP39);
final int X10_TEMP43 = (0);
final int X10_TEMP44 = (X10_TEMP0.ldaa);
final int X10_TEMP47 = (0);
final int X10_TEMP48 = (X10_TEMP0.lda);

region(:rank==2) rectangularRegion = (region(:rank==2))([X10_TEMP43:X10_TEMP44,X10_TEMP47:X10_TEMP48]);
final int X10_TEMP52 = (0);
final int X10_TEMP53 = (0);
final int X10_TEMP56 = (0);
final int X10_TEMP57 = (X10_TEMP0.lda);

region(:rank==2) slimRegion = (region(:rank==2))([X10_TEMP52:X10_TEMP53,X10_TEMP56:X10_TEMP57]);
final place X10_TEMP59 = (here);

dist(:rank==2) slimRegionDist = (dist(:rank==2))(slimRegion->X10_TEMP59);
final int X10_TEMP62 = (X10_TEMP0.lda);
final int X10_TEMP63 = (1);

final int X10_TEMP65 = (X10_TEMP62+X10_TEMP63);
final dist(:rank==2) X10_TEMP66 = (dist(:rank==2))(dist.factory.blockCyclic(rectangularRegion,X10_TEMP65));

dist(:rank==2) rectangular_distribution = (dist(:rank==2))(X10_TEMP66);
final double[:rank==2] X10_TEMP70 = (double[:rank==2])(new double[rectangular_distribution]);
final double[:rank==2] X10_TEMP71 = (double[:rank==2])(X10_TEMP70);
X10_TEMP0.a = (X10_TEMP71);
final double[:rank==2] X10_TEMP74 = (double[:rank==2])(new double[slimRegionDist]);
final double[:rank==2] X10_TEMP75 = (double[:rank==2])(X10_TEMP74);
X10_TEMP0.b = (X10_TEMP75);
final double[:rank==2] X10_TEMP78 = (double[:rank==2])(new double[slimRegionDist]);
final double[:rank==2] X10_TEMP79 = (double[:rank==2])(X10_TEMP78);
X10_TEMP0.x = (X10_TEMP79);
final int[:rank==1] X10_TEMP82 = (int[:rank==1])(new int[vectorRegionMinus1Dist]);
final int[:rank==1] X10_TEMP83 = (int[:rank==1])(X10_TEMP82);
X10_TEMP0.ipvt = (X10_TEMP83);
final int X10_TEMP84 = (X10_TEMP0.n);

long nl = ((long)X10_TEMP84);
final double X10_TEMP89 = (2.0);
final long X10_TEMP86 = (nl*nl);

final long X10_TEMP88 = (X10_TEMP86*nl);

final double X10_TEMP91 = (X10_TEMP89*X10_TEMP88);
final double X10_TEMP92 = (3.0);
final double X10_TEMP96 = (X10_TEMP91/X10_TEMP92);
final double X10_TEMP95 = (2.0);
final long X10_TEMP94 = (nl*nl);
final double X10_TEMP97 = (X10_TEMP95*X10_TEMP94);

final double X10_TEMP100 = (X10_TEMP96+X10_TEMP97);
final double X10_TEMP101 = (X10_TEMP100);
X10_TEMP0.ops = (X10_TEMP101);
final double[:rank==2] X10_TEMP106 = (double[:rank==2])(X10_TEMP0.a);
final int X10_TEMP107 = (X10_TEMP0.lda);
final int X10_TEMP108 = (X10_TEMP0.n);
final double[:rank==2] X10_TEMP109 = (double[:rank==2])(X10_TEMP0.b);

final double X10_TEMP112 = (Program.Linpack_matgen(X10_TEMP0,X10_TEMP106,X10_TEMP107,X10_TEMP108,X10_TEMP109));
final double X10_TEMP113 = (X10_TEMP112);
X10_TEMP0.norma = (X10_TEMP113);
}
public static void Linpack_JGFkernel(final Linpack X10_TEMP0) {
final double[:rank==2] X10_TEMP5 = (double[:rank==2])(X10_TEMP0.a);
final int X10_TEMP6 = (X10_TEMP0.lda);
final int X10_TEMP7 = (X10_TEMP0.n);
final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP0.ipvt);

final int X10_TEMP11 = (Program.Linpack_dgefa(X10_TEMP0,X10_TEMP5,X10_TEMP6,X10_TEMP7,X10_TEMP8));
final int X10_TEMP12 = (X10_TEMP11);
X10_TEMP0.info = (X10_TEMP12);
final double[:rank==2] X10_TEMP19 = (double[:rank==2])(X10_TEMP0.a);
final int X10_TEMP20 = (X10_TEMP0.lda);
final int X10_TEMP21 = (X10_TEMP0.n);
final int[:rank==1] X10_TEMP22 = (int[:rank==1])(X10_TEMP0.ipvt);
final double[:rank==2] X10_TEMP23 = (double[:rank==2])(X10_TEMP0.b);
final int X10_TEMP24 = (0);

Program.Linpack_dgesl(X10_TEMP0,X10_TEMP19,X10_TEMP20,X10_TEMP21,X10_TEMP22,X10_TEMP23,X10_TEMP24);
}
public static void Linpack_JGFvalidate(final Linpack X10_TEMP0, final dist(:rank==1) vd) {
double eps = (0.0);
double residn = (0.0);
final double[:rank==1] ref = (double[:rank==1])(new double[vd](point(:rank==1)p0) {
final double X10_TEMP4 = (0.0);
return X10_TEMP4;
}

);
final int X10_TEMP7 = (0);

final double X10_TEMP10 = (6.0);
final double X10_TEMP11 = (X10_TEMP10);
ref[X10_TEMP7] = (X10_TEMP11);
final int X10_TEMP13 = (1);

final double X10_TEMP16 = (12.0);
final double X10_TEMP17 = (X10_TEMP16);
ref[X10_TEMP13] = (X10_TEMP17);
final int X10_TEMP19 = (2);

final double X10_TEMP22 = (20.0);
final double X10_TEMP23 = (X10_TEMP22);
ref[X10_TEMP19] = (X10_TEMP23);
final int X10_TEMP26 = (0);
final int X10_TEMP27 = (0);
final int X10_TEMP30 = (0);
final int X10_TEMP31 = (X10_TEMP0.n);

final region(:rank==2) tempR = (region(:rank==2))([X10_TEMP26:X10_TEMP27,X10_TEMP30:X10_TEMP31]);
final place X10_TEMP33 = (here);

final dist(:rank==2) tempdist = (dist(:rank==2))(tempR->X10_TEMP33);
for(point(:rank==2)pt:tempdist) {
int X10_TEMP38 = (0);
int X10_TEMP39 = (1);

final point(:rank==2) pt0 = (pt* [X10_TEMP38,X10_TEMP39]);
final double[:rank==2] X10_TEMP41 = (double[:rank==2])(X10_TEMP0.x);

final double[:rank==2] X10_TEMP43 = (double[:rank==2])(X10_TEMP0.b);

final double X10_TEMP47 = (X10_TEMP43[pt0]);
final double X10_TEMP48 = (X10_TEMP47);
X10_TEMP41[pt0] = (X10_TEMP48);
}
final double[:rank==2] X10_TEMP53 = (double[:rank==2])(X10_TEMP0.a);
final int X10_TEMP54 = (X10_TEMP0.lda);
final int X10_TEMP55 = (X10_TEMP0.n);
final double[:rank==2] X10_TEMP56 = (double[:rank==2])(X10_TEMP0.b);

final double X10_TEMP59 = (Program.Linpack_matgen(X10_TEMP0,X10_TEMP53,X10_TEMP54,X10_TEMP55,X10_TEMP56));
final double X10_TEMP60 = (X10_TEMP59);
X10_TEMP0.norma = (X10_TEMP60);
for(point(:rank==2)pt:tempdist) {
int X10_TEMP64 = (0);
int X10_TEMP65 = (1);

final point(:rank==2) pt0 = (pt* [X10_TEMP64,X10_TEMP65]);
final double[:rank==2] X10_TEMP67 = (double[:rank==2])(X10_TEMP0.b);

final double[:rank==2] X10_TEMP69 = (double[:rank==2])(X10_TEMP0.b);
final double X10_TEMP71 = (X10_TEMP69[pt0]);
final int X10_TEMP72 = 0;

final double X10_TEMP75 = (X10_TEMP72 - X10_TEMP71);
final double X10_TEMP76 = (X10_TEMP75);
X10_TEMP67[pt0] = (X10_TEMP76);
}
final int X10_TEMP83 = (X10_TEMP0.n);
final double[:rank==2] X10_TEMP84 = (double[:rank==2])(X10_TEMP0.b);
final int X10_TEMP85 = (X10_TEMP0.n);
final int X10_TEMP86 = (X10_TEMP0.lda);
final double[:rank==2] X10_TEMP87 = (double[:rank==2])(X10_TEMP0.x);
final double[:rank==2] X10_TEMP88 = (double[:rank==2])(X10_TEMP0.a);

Program.Linpack_dmxpy(X10_TEMP0,X10_TEMP83,X10_TEMP84,X10_TEMP85,X10_TEMP86,X10_TEMP87,X10_TEMP88);
final double X10_TEMP91 = (0.0);
final double X10_TEMP92 = (X10_TEMP91);
X10_TEMP0.resid = (X10_TEMP92);
final double X10_TEMP95 = (0.0);
final double X10_TEMP96 = (X10_TEMP95);
X10_TEMP0.normx = (X10_TEMP96);
for(point(:rank==2)pt:tempdist) {
int X10_TEMP100 = (0);
int X10_TEMP101 = (1);

final point(:rank==2) pt0 = (pt* [X10_TEMP100,X10_TEMP101]);
final double X10_TEMP107 = (X10_TEMP0.resid);
final double[:rank==2] X10_TEMP103 = (double[:rank==2])(X10_TEMP0.b);

final double X10_TEMP106 = (X10_TEMP103[pt0]);
final double X10_TEMP108 = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP106));

final boolean X10_TEMP110 = (X10_TEMP107>X10_TEMP108);
final boolean X10_TEMP111 = X10_TEMP110;
final double[:rank==2] X10_TEMP113 = (double[:rank==2])(X10_TEMP0.b);

final double X10_TEMP116 = (X10_TEMP113[pt0]);
double X10_TEMP118 = Program.Linpack_myabs(X10_TEMP0,X10_TEMP116);
if(X10_TEMP111){
X10_TEMP118 = X10_TEMP0.resid;
}
final double X10_TEMP119 = X10_TEMP118;

final double X10_TEMP121 = (X10_TEMP119);
X10_TEMP0.resid = (X10_TEMP121);
final double X10_TEMP126 = (X10_TEMP0.normx);
final double[:rank==2] X10_TEMP122 = (double[:rank==2])(X10_TEMP0.x);

final double X10_TEMP125 = (X10_TEMP122[pt0]);
final double X10_TEMP127 = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP125));

final boolean X10_TEMP129 = (X10_TEMP126>X10_TEMP127);
final boolean X10_TEMP130 = X10_TEMP129;
final double[:rank==2] X10_TEMP132 = (double[:rank==2])(X10_TEMP0.x);

final double X10_TEMP135 = (X10_TEMP132[pt0]);
double X10_TEMP137 = Program.Linpack_myabs(X10_TEMP0,X10_TEMP135);
if(X10_TEMP130){
X10_TEMP137 = X10_TEMP0.normx;
}
final double X10_TEMP138 = X10_TEMP137;

final double X10_TEMP140 = (X10_TEMP138);
X10_TEMP0.normx = (X10_TEMP140);
}
final double X10_TEMP141 = (1.0);

final double X10_TEMP143 = ((double)X10_TEMP141);

final double X10_TEMP145 = (Program.Linpack_epslon(X10_TEMP0,X10_TEMP143));
eps = (X10_TEMP145);
final double X10_TEMP153 = (X10_TEMP0.resid);
final double X10_TEMP146 = (X10_TEMP0.n);
final double X10_TEMP147 = (X10_TEMP0.norma);
final double X10_TEMP148 = (X10_TEMP146*X10_TEMP147);
final double X10_TEMP149 = (X10_TEMP0.normx);
final double X10_TEMP150 = (X10_TEMP148*X10_TEMP149);

final double X10_TEMP152 = (X10_TEMP150*eps);

final double X10_TEMP155 = (X10_TEMP153/X10_TEMP152);
residn = (X10_TEMP155);
final int X10_TEMP157 = (X10_TEMP0.setSize);
final double X10_TEMP158 = (ref[X10_TEMP157]);

final boolean X10_TEMP160 = residn>X10_TEMP158;
if (X10_TEMP160) {
final String X10_TEMP162 = ("Validation failed");
System.out.println(X10_TEMP162);
final String X10_TEMP163 = ("Computed Norm Res = ");

final String X10_TEMP165 = (X10_TEMP163+residn);
System.out.println(X10_TEMP165);
final String X10_TEMP168 = ("Reference Norm Res = ");
final int X10_TEMP167 = (X10_TEMP0.setSize);
final double X10_TEMP169 = (ref[X10_TEMP167]);

final String X10_TEMP171 = (X10_TEMP168+X10_TEMP169);
System.out.println(X10_TEMP171);
final String X10_TEMP173 = ("Validation failed");
throw new RuntimeException(X10_TEMP173);
}
}
public static void Linpack_JGFtidyup(final Linpack X10_TEMP0) {
}
public static void Linpack_run(final Linpack X10_TEMP0) {
final int X10_TEMP2 = (0);

Program.Linpack_JGFsetsize(X10_TEMP0,X10_TEMP2);
final place X10_TEMP3 = (here);

final dist(:rank==1) vd = (dist(:rank==1))(_Linpack_r->X10_TEMP3);
Program.Linpack_JGFinitialise(X10_TEMP0,vd);
Program.Linpack_JGFkernel(X10_TEMP0);
Program.Linpack_JGFvalidate(X10_TEMP0,vd);
Program.Linpack_JGFtidyup(X10_TEMP0);
}
public static double Linpack_read(final Linpack X10_TEMP0, final double [:rank==2] a, final int i, final int j) {
final place curr_place = (here);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);

final region(:rank==1) tempr = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) tempvd = (dist(:rank==1))(tempr->X10_TEMP7);
final double[:rank==1] tempref = (double[:rank==1])(new double[tempvd](point(:rank==1)p0) {
final double X10_TEMP10 = (0.0);
return X10_TEMP10;
}

);
finish {
final dist(:rank==2) X10_TEMP12 = (dist(:rank==2))(a.distribution);

final place X10_TEMP16 = X10_TEMP12.get(i,j);
async(X10_TEMP16) {
final double temp = (a[i,j]);
async(curr_place) {
final int X10_TEMP22 = (0);

final double X10_TEMP25 = (temp);
tempref[X10_TEMP22] = (X10_TEMP25);
}
}
}
final int X10_TEMP27 = (0);

final double X10_TEMP29 = (tempref[X10_TEMP27]);
return X10_TEMP29;
}
public static void Linpack_write(final Linpack X10_TEMP0, final double [:rank==2] a, final point(:rank==2) p, final double val) {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(a.distribution);

final place X10_TEMP4 = X10_TEMP1.get(p);
async(X10_TEMP4) {
final double X10_TEMP8 = (val);
a[p] = (X10_TEMP8);
}
}
public static void Linpack_plusWrite(final Linpack X10_TEMP0, final double [:rank==2] a, final int i, final int j, final double val) {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(a.distribution);

final place X10_TEMP5 = X10_TEMP1.get(i,j);
async(X10_TEMP5) {
final double X10_TEMP10 = (a[i,j]);

final double X10_TEMP13 = (X10_TEMP10+val);
final double X10_TEMP14 = (X10_TEMP13);
a[i,j] = (X10_TEMP14);
}
}
public static double Linpack_myabs(final Linpack X10_TEMP0, final double d) {
final int X10_TEMP1 = (0);

final boolean X10_TEMP3 = (d>=X10_TEMP1);
final boolean X10_TEMP4 = X10_TEMP3;
final int X10_TEMP6 = 0;
double X10_TEMP8 = X10_TEMP6 - d;
if(X10_TEMP4){
X10_TEMP8 = d;
}
final double X10_TEMP9 = X10_TEMP8;

return X10_TEMP9;
}
public static double Linpack_matgen(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final double [:rank==2] b) {
int init = (1325);
double norma = (0.0);
for(point(:rank==2)p:a) {
final int X10_TEMP4 = (3125);
final int X10_TEMP5 = (X10_TEMP4*init);
final int X10_TEMP6 = (65536);

final int X10_TEMP8 = (X10_TEMP5%X10_TEMP6);
init = (X10_TEMP8);
final double X10_TEMP9 = (32768.0);

final double X10_TEMP11 = (init-X10_TEMP9);
final double X10_TEMP12 = (16384.0);

double val = (X10_TEMP11/X10_TEMP12);
finish {
Program.Linpack_write(X10_TEMP0,a,p,val);
}
final boolean X10_TEMP17 = val>norma;
double X10_TEMP20 = norma;
if(X10_TEMP17){
X10_TEMP20 = val;
}
final double X10_TEMP21 = X10_TEMP20;

norma = (X10_TEMP21);
}
finish {
for(point(:rank==2)p:b) {
final dist(:rank==2) X10_TEMP23 = (dist(:rank==2)) (b.distribution);
final place X10_TEMP24 = X10_TEMP23.get(p);
async(X10_TEMP24) {
final double X10_TEMP28 = (0.0);
final double X10_TEMP29 = (X10_TEMP28);
b[p] = (X10_TEMP29);
}
}
}
finish {
final int X10_TEMP33 = (0);
final int X10_TEMP31 = (1);
final int X10_TEMP34 = (n-X10_TEMP31);
final int X10_TEMP38 = (0);
final int X10_TEMP36 = (1);
final int X10_TEMP39 = (n-X10_TEMP36);

final region(:rank==2) X10_TEMP41 = (region(:rank==2))([X10_TEMP33:X10_TEMP34,X10_TEMP38:X10_TEMP39]);
for(point(:rank==2)[i,j]:X10_TEMP41) {
finish {
final dist(:rank==2) X10_TEMP42 = (dist(:rank==2))(a.distribution);

final place X10_TEMP46 = X10_TEMP42.get(i,j);
async(X10_TEMP46) {
final int X10_TEMP53 = (0);
final double X10_TEMP54 = (a[i,j]);

Program.Linpack_plusWrite(X10_TEMP0,b,X10_TEMP53,j,X10_TEMP54);
}
}
}
}
return norma;
}
public static int Linpack_dgefa(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final int [:rank==1] ipvt) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (X10_TEMP3);
X10_TEMP0.infodgefa = (X10_TEMP4);
final int X10_TEMP5 = (1);

final int nm1 = (n-X10_TEMP5);
final int X10_TEMP7 = (0);

final boolean X10_TEMP9 = nm1>=X10_TEMP7;
if (X10_TEMP9) {
final int X10_TEMP13 = (0);
final int X10_TEMP11 = (1);
final int X10_TEMP14 = (nm1-X10_TEMP11);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP13:X10_TEMP14]);
final place X10_TEMP16 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP16);
for(point(:rank==1)[k]:temprDist) {
final int X10_TEMP24 = (n-k);
final int X10_TEMP25 = (1);
final int X10_TEMP26 = (Program.Linpack_idamax(X10_TEMP0,X10_TEMP24,a,k,k,X10_TEMP25));

final int l = (X10_TEMP26+k);
final int X10_TEMP31 = (l);
ipvt[k] = (X10_TEMP31);
finish {
final dist(:rank==2) X10_TEMP32 = (dist(:rank==2))(a.distribution);
int X10_TEMP35 = (1);

final place X10_TEMP37 = X10_TEMP32.get(k,X10_TEMP35);
async(X10_TEMP37) {
final int X10_TEMP38 = (1);

final int kp1 = (k+X10_TEMP38);
final double X10_TEMP42 = (a[k,l]);
final int X10_TEMP43 = (0);

final boolean X10_TEMP45 = X10_TEMP42!=X10_TEMP43;
if (X10_TEMP45) {
final boolean X10_TEMP47 = l!=k;
if (X10_TEMP47) {
final boolean X10_TEMP49 = l!=k;
if (X10_TEMP49) {
double t = (a[k,l]);
final double X10_TEMP59 = (a[k,k]);
final double X10_TEMP60 = (X10_TEMP59);
a[k,l] = (X10_TEMP60);
final double X10_TEMP65 = (t);
a[k,k] = (X10_TEMP65);
}
}
final double X10_TEMP66 = (1.0);
final int X10_TEMP67 = 0;
final double X10_TEMP70 = (X10_TEMP67 - X10_TEMP66);
final double X10_TEMP71 = (a[k,k]);

final double tx = (X10_TEMP70/X10_TEMP71);
final int X10_TEMP74 = (kp1);

final int X10_TEMP81 = (n-X10_TEMP74);
final int X10_TEMP82 = (1);

Program.Linpack_dscal(X10_TEMP0,X10_TEMP81,tx,a,k,kp1,X10_TEMP82);
finish {
final int X10_TEMP84 = (1);
final int X10_TEMP86 = (n-X10_TEMP84);

region(:rank==1) temprkp1 = (region(:rank==1))([kp1:X10_TEMP86]);
final place X10_TEMP88 = (here);

dist(:rank==1) temprkp1Dist = (dist(:rank==1))(temprkp1->X10_TEMP88);
for(point(:rank==1)[j]:temprkp1Dist) {
final dist(:rank==2) X10_TEMP91 = (dist(:rank==2))(a.distribution);

final place X10_TEMP95 = X10_TEMP91.get(j,l);
async(X10_TEMP95) {
double t = (a[j,l]);
final boolean X10_TEMP100 = l!=k;
if (X10_TEMP100) {
final double X10_TEMP107 = (a[j,k]);
final double X10_TEMP108 = (X10_TEMP107);
a[j,l] = (X10_TEMP108);
final double X10_TEMP113 = (t);
a[j,k] = (X10_TEMP113);
}
final int X10_TEMP115 = (kp1);

final int X10_TEMP126 = (n-X10_TEMP115);
final int X10_TEMP127 = (1);
final int X10_TEMP128 = (1);

Program.Linpack_daxpy(X10_TEMP0,X10_TEMP126,t,a,k,kp1,X10_TEMP127,a,j,kp1,X10_TEMP128);
}
}
}
}
else {
final int X10_TEMP131 = (k);
X10_TEMP0.infodgefa = (X10_TEMP131);
}
}
}
}
}
final int X10_TEMP132 = (1);

final int X10_TEMP134 = (n-X10_TEMP132);

final int X10_TEMP135 = (1);

final int X10_TEMP138 = (n-X10_TEMP135);
final int X10_TEMP139 = (X10_TEMP138);
ipvt[X10_TEMP134] = (X10_TEMP139);
final int X10_TEMP141 = (1);

final int X10_TEMP145 = (n-X10_TEMP141);
final int X10_TEMP143 = (1);

final int X10_TEMP146 = (n-X10_TEMP143);

double val = (Program.Linpack_read(X10_TEMP0,a,X10_TEMP145,X10_TEMP146));
final int X10_TEMP148 = (0);

final boolean X10_TEMP150 = val==X10_TEMP148;
if (X10_TEMP150) {
final int X10_TEMP151 = (1);

final int X10_TEMP154 = (n-X10_TEMP151);
final int X10_TEMP155 = (X10_TEMP154);
X10_TEMP0.info = (X10_TEMP155);
}
final int X10_TEMP157 = (X10_TEMP0.infodgefa);
return X10_TEMP157;
}
public static void Linpack_dgesl(final Linpack X10_TEMP0, final double [:rank==2] a, final int lda, final int n, final int [:rank==1] ipvt, final double [:rank==2] b, final int job) {
final int X10_TEMP1 = (1);

final int nm1 = (n-X10_TEMP1);
final int X10_TEMP3 = (0);

final boolean X10_TEMP5 = job==X10_TEMP3;
if (X10_TEMP5) {
final int X10_TEMP6 = (1);

final boolean X10_TEMP8 = nm1>=X10_TEMP6;
if (X10_TEMP8) {
final int X10_TEMP12 = (0);
final int X10_TEMP10 = (1);
final int X10_TEMP13 = (nm1-X10_TEMP10);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
final place X10_TEMP15 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP15);
for(point(:rank==1)[k]:temprDist) {
final int l = (ipvt[k]);
final int X10_TEMP22 = (0);

double t = (b[X10_TEMP22,l]);
final boolean X10_TEMP25 = l!=k;
if (X10_TEMP25) {
final int X10_TEMP28 = (0);

final int X10_TEMP31 = (0);

final double X10_TEMP34 = (b[X10_TEMP31,k]);
final double X10_TEMP35 = (X10_TEMP34);
b[X10_TEMP28,l] = (X10_TEMP35);
final int X10_TEMP38 = (0);

final double X10_TEMP41 = (t);
b[X10_TEMP38,k] = (X10_TEMP41);
}
final int X10_TEMP42 = (1);

final int kp1 = (k+X10_TEMP42);
final int X10_TEMP45 = (kp1);

final int X10_TEMP56 = (n-X10_TEMP45);
final int X10_TEMP57 = (1);
final int X10_TEMP58 = (0);
final int X10_TEMP59 = (1);

Program.Linpack_daxpy(X10_TEMP0,X10_TEMP56,t,a,k,kp1,X10_TEMP57,b,X10_TEMP58,kp1,X10_TEMP59);
}
}
final int X10_TEMP63 = (0);
final int X10_TEMP61 = (1);
final int X10_TEMP64 = (n-X10_TEMP61);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP63:X10_TEMP64]);
final place X10_TEMP66 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP66);
for(point(:rank==1)[kb]:temprDist) {
final int X10_TEMP69 = (1);

final int X10_TEMP71 = (kb+X10_TEMP69);

final int k = (n-X10_TEMP71);
final int X10_TEMP75 = (0);

final int X10_TEMP78 = (0);
final double X10_TEMP82 = (b[X10_TEMP78,k]);
final double X10_TEMP83 = (Program.Linpack_read(X10_TEMP0,a,k,k));

final double X10_TEMP86 = (X10_TEMP82/X10_TEMP83);
final double X10_TEMP87 = (X10_TEMP86);
b[X10_TEMP75,k] = (X10_TEMP87);
final int X10_TEMP90 = (0);
final double X10_TEMP91 = (b[X10_TEMP90,k]);
final int X10_TEMP92 = 0;

double t = (X10_TEMP92 - X10_TEMP91);
final int X10_TEMP104 = (0);
final int X10_TEMP105 = (1);
final int X10_TEMP106 = (0);
final int X10_TEMP107 = (0);
final int X10_TEMP108 = (1);

Program.Linpack_daxpy(X10_TEMP0,k,t,a,k,X10_TEMP104,X10_TEMP105,b,X10_TEMP106,X10_TEMP107,X10_TEMP108);
}
}
else {
final int X10_TEMP112 = (0);
final int X10_TEMP110 = (1);
final int X10_TEMP113 = (n-X10_TEMP110);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP112:X10_TEMP113]);
final place X10_TEMP115 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP115);
for(point(:rank==1)[k]:temprDist) {
final int X10_TEMP127 = (0);
final int X10_TEMP128 = (1);
final int X10_TEMP129 = (0);
final int X10_TEMP130 = (0);
final int X10_TEMP131 = (1);

double t = (Program.Linpack_ddot(X10_TEMP0,k,a,k,X10_TEMP127,X10_TEMP128,b,X10_TEMP129,X10_TEMP130,X10_TEMP131));
final int X10_TEMP135 = (0);

final int X10_TEMP138 = (0);
final double X10_TEMP139 = (b[X10_TEMP138,k]);

final double X10_TEMP141 = (X10_TEMP139-t);
final double X10_TEMP144 = (a[k,k]);

final double X10_TEMP147 = (X10_TEMP141/X10_TEMP144);
final double X10_TEMP148 = (X10_TEMP147);
b[X10_TEMP135,k] = (X10_TEMP148);
}
final int X10_TEMP149 = (1);

final boolean X10_TEMP151 = nm1>=X10_TEMP149;
if (X10_TEMP151) {
final int X10_TEMP155 = (1);
final int X10_TEMP153 = (1);
final int X10_TEMP156 = (nm1-X10_TEMP153);

region(:rank==1) temprnm1 = (region(:rank==1))([X10_TEMP155:X10_TEMP156]);
final place X10_TEMP158 = (here);

dist(:rank==1) temprnm1Dist = (dist(:rank==1))(temprnm1->X10_TEMP158);
for(point(:rank==1)[kb]:temprnm1Dist) {
final int X10_TEMP161 = (1);

final int X10_TEMP163 = (kb+X10_TEMP161);

final int k = (n-X10_TEMP163);
final int X10_TEMP165 = (1);

final int kp1 = (k+X10_TEMP165);
final int X10_TEMP169 = (0);

final int X10_TEMP172 = (0);
final double X10_TEMP188 = (b[X10_TEMP172,k]);
final int X10_TEMP174 = (kp1);

final int X10_TEMP184 = (n-X10_TEMP174);
final int X10_TEMP185 = (1);
final int X10_TEMP186 = (0);
final int X10_TEMP187 = (1);
final double X10_TEMP189 = (Program.Linpack_ddot(X10_TEMP0,X10_TEMP184,a,k,kp1,X10_TEMP185,b,X10_TEMP186,kp1,X10_TEMP187));

final double X10_TEMP192 = (X10_TEMP188+X10_TEMP189);
final double X10_TEMP193 = (X10_TEMP192);
b[X10_TEMP169,k] = (X10_TEMP193);
final int l = (ipvt[k]);
final boolean X10_TEMP197 = l!=k;
if (X10_TEMP197) {
final int X10_TEMP200 = (0);

double t = (b[X10_TEMP200,l]);
final int X10_TEMP204 = (0);

final int X10_TEMP207 = (0);

final double X10_TEMP210 = (b[X10_TEMP207,k]);
final double X10_TEMP211 = (X10_TEMP210);
b[X10_TEMP204,l] = (X10_TEMP211);
final int X10_TEMP214 = (0);

final double X10_TEMP217 = (t);
b[X10_TEMP214,k] = (X10_TEMP217);
}
}
}
}
}
public static void Linpack_daxpy(final Linpack X10_TEMP0, final int n, final double da, final double [:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double [:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
final int X10_TEMP1 = (0);

final boolean X10_TEMP3 = (n>X10_TEMP1);
final int X10_TEMP4 = (0);

final boolean X10_TEMP6 = (da!=X10_TEMP4);

final boolean X10_TEMP8 = X10_TEMP3&&X10_TEMP6;
if (X10_TEMP8) {
final int X10_TEMP9 = (1);
final boolean X10_TEMP11 = (incx!=X10_TEMP9);
final int X10_TEMP10 = (1);
final boolean X10_TEMP12 = (incy!=X10_TEMP10);

final boolean X10_TEMP14 = X10_TEMP11||X10_TEMP12;
if (X10_TEMP14) {
int ix = (0);
int iy = (0);
final int X10_TEMP17 = (0);

final boolean X10_TEMP19 = incx<X10_TEMP17;
if (X10_TEMP19) {
final int X10_TEMP20 = 0;
final int X10_TEMP21 = (X10_TEMP20 - n);
final int X10_TEMP22 = (1);

final int X10_TEMP24 = (X10_TEMP21+X10_TEMP22);

final int X10_TEMP26 = (X10_TEMP24*incx);
ix = (X10_TEMP26);
}
final int X10_TEMP27 = (0);

final boolean X10_TEMP29 = incy<X10_TEMP27;
if (X10_TEMP29) {
final int X10_TEMP30 = 0;
final int X10_TEMP31 = (X10_TEMP30 - n);
final int X10_TEMP32 = (1);

final int X10_TEMP34 = (X10_TEMP31+X10_TEMP32);

final int X10_TEMP36 = (X10_TEMP34*incy);
iy = (X10_TEMP36);
}
final int X10_TEMP40 = (0);
final int X10_TEMP38 = (1);
final int X10_TEMP41 = (n-X10_TEMP38);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP40:X10_TEMP41]);
final place X10_TEMP43 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP43);
for(point(:rank==1)i:temprDist) {
final int X10_TEMP48 = (iy+dy_off);

final int X10_TEMP51 = (iy+dy_off);
final double X10_TEMP59 = (dy[dyCol,X10_TEMP51]);
final int X10_TEMP55 = (ix+dx_off);
final double X10_TEMP56 = (Program.Linpack_read(X10_TEMP0,dx,dxCol,X10_TEMP55));

final double X10_TEMP58 = (da*X10_TEMP56);

final double X10_TEMP62 = (X10_TEMP59+X10_TEMP58);
final double X10_TEMP63 = (X10_TEMP62);
dy[dyCol,X10_TEMP48] = (X10_TEMP63);
final int X10_TEMP65 = (ix+incx);
ix = (X10_TEMP65);
final int X10_TEMP67 = (iy+incy);
iy = (X10_TEMP67);
}
return;
}
final int X10_TEMP71 = (0);
final int X10_TEMP69 = (1);
final int X10_TEMP72 = (n-X10_TEMP69);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP71:X10_TEMP72]);
final place X10_TEMP74 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP74);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP79 = (i+dy_off);

final int X10_TEMP82 = (i+dy_off);
final double X10_TEMP90 = (dy[dyCol,X10_TEMP82]);
final int X10_TEMP86 = (i+dx_off);
final double X10_TEMP87 = (Program.Linpack_read(X10_TEMP0,dx,dxCol,X10_TEMP86));

final double X10_TEMP89 = (da*X10_TEMP87);

final double X10_TEMP93 = (X10_TEMP90+X10_TEMP89);
final double X10_TEMP94 = (X10_TEMP93);
dy[dyCol,X10_TEMP79] = (X10_TEMP94);
}
}
}
public static double Linpack_ddot(final Linpack X10_TEMP0, final int n, final double [:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double [:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
double dtemp = (0);
final int X10_TEMP2 = (0);

final boolean X10_TEMP4 = n>X10_TEMP2;
if (X10_TEMP4) {
final int X10_TEMP5 = (1);
final boolean X10_TEMP7 = (incx!=X10_TEMP5);
final int X10_TEMP6 = (1);
final boolean X10_TEMP8 = (incy!=X10_TEMP6);

final boolean X10_TEMP10 = X10_TEMP7||X10_TEMP8;
if (X10_TEMP10) {
int ix = (0);
int iy = (0);
final int X10_TEMP13 = (0);

final boolean X10_TEMP15 = incx<X10_TEMP13;
if (X10_TEMP15) {
final int X10_TEMP16 = 0;
final int X10_TEMP17 = (X10_TEMP16 - n);
final int X10_TEMP18 = (1);

final int X10_TEMP20 = (X10_TEMP17+X10_TEMP18);

final int X10_TEMP22 = (X10_TEMP20*incx);
ix = (X10_TEMP22);
}
final int X10_TEMP23 = (0);

final boolean X10_TEMP25 = incy<X10_TEMP23;
if (X10_TEMP25) {
final int X10_TEMP26 = 0;
final int X10_TEMP27 = (X10_TEMP26 - n);
final int X10_TEMP28 = (1);

final int X10_TEMP30 = (X10_TEMP27+X10_TEMP28);

final int X10_TEMP32 = (X10_TEMP30*incy);
iy = (X10_TEMP32);
}
final int X10_TEMP36 = (0);
final int X10_TEMP34 = (1);
final int X10_TEMP37 = (n-X10_TEMP34);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP36:X10_TEMP37]);
final place X10_TEMP39 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP39);
for(point(:rank==1)i:temprDist) {
final int X10_TEMP44 = (ix+dx_off);
final double X10_TEMP48 = (dx[dxCol,X10_TEMP44]);
final int X10_TEMP47 = (iy+dy_off);
final double X10_TEMP49 = (dy[dyCol,X10_TEMP47]);

final double X10_TEMP51 = (X10_TEMP48*X10_TEMP49);

final double X10_TEMP53 = (dtemp+X10_TEMP51);
dtemp = (X10_TEMP53);
final int X10_TEMP55 = (ix+incx);
ix = (X10_TEMP55);
final int X10_TEMP57 = (iy+incy);
iy = (X10_TEMP57);
}
}
else {
final int X10_TEMP61 = (0);
final int X10_TEMP59 = (1);
final int X10_TEMP62 = (n-X10_TEMP59);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP61:X10_TEMP62]);
final place X10_TEMP64 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP64);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP69 = (i+dx_off);
final double X10_TEMP73 = (dx[dxCol,X10_TEMP69]);
final int X10_TEMP72 = (i+dy_off);
final double X10_TEMP74 = (dy[dyCol,X10_TEMP72]);
final double X10_TEMP75 = (X10_TEMP73*X10_TEMP74);

final double X10_TEMP77 = (dtemp+X10_TEMP75);
dtemp = (X10_TEMP77);
}
}
}
return dtemp;
}
public static void Linpack_dscal(final Linpack X10_TEMP0, final int n, final double da, final double [:rank==2] dx, final int currentCol, final int dx_off, final int incx) {
final int X10_TEMP1 = (0);

final boolean X10_TEMP3 = n>X10_TEMP1;
if (X10_TEMP3) {
final int X10_TEMP4 = (1);

final boolean X10_TEMP6 = incx!=X10_TEMP4;
if (X10_TEMP6) {
final int nincx = (n*incx);
int i = (0);
boolean X10_TEMP11 = i<nincx;
while(X10_TEMP11) {
final int X10_TEMP14 = (i+dx_off);

final int X10_TEMP17 = (i+dx_off);
final double X10_TEMP18 = (dx[currentCol,X10_TEMP17]);

final double X10_TEMP21 = (X10_TEMP18*da);
final double X10_TEMP22 = (X10_TEMP21);
dx[currentCol,X10_TEMP14] = (X10_TEMP22);
final int X10_TEMP24 = (i+incx);
i = (X10_TEMP24);
X10_TEMP11 = i<nincx;
}
}
else {
final int X10_TEMP28 = (0);
final int X10_TEMP26 = (1);
final int X10_TEMP29 = (n-X10_TEMP26);

region(:rank==1) tempr = (region(:rank==1))([X10_TEMP28:X10_TEMP29]);
final place X10_TEMP31 = (here);

dist(:rank==1) temprDist = (dist(:rank==1))(tempr->X10_TEMP31);
for(point(:rank==1)[i]:temprDist) {
final int X10_TEMP36 = (i+dx_off);

final int X10_TEMP39 = (i+dx_off);
final double X10_TEMP40 = (dx[currentCol,X10_TEMP39]);

final double X10_TEMP43 = (X10_TEMP40*da);
final double X10_TEMP44 = (X10_TEMP43);
dx[currentCol,X10_TEMP36] = (X10_TEMP44);
}
}
}
}
public static int Linpack_idamax(final Linpack X10_TEMP0, final int n, final double [:rank==2] dx, final int dxk, final int dx_off, final int incx) {
final int X10_TEMP1 = (1);

final boolean X10_TEMP3 = n<X10_TEMP1;
if (X10_TEMP3) {
final int X10_TEMP4 = (1);
final int X10_TEMP5 = 0;

final int X10_TEMP7 = (X10_TEMP5 - X10_TEMP4);
return X10_TEMP7;
}
final int X10_TEMP8 = (1);

final boolean X10_TEMP10 = n==X10_TEMP8;
if (X10_TEMP10) {
final int X10_TEMP12 = (0);
return X10_TEMP12;
}
final int X10_TEMP13 = (1);

final boolean X10_TEMP15 = incx!=X10_TEMP13;
if (X10_TEMP15) {
int itemp = (0);
final int X10_TEMP19 = (0);

final int X10_TEMP21 = (X10_TEMP19+dx_off);

final double X10_TEMP23 = (Program.Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP21));

double dmax = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP23));
final int X10_TEMP25 = (1);

int ix = (X10_TEMP25+incx);
final int X10_TEMP30 = (1);
final int X10_TEMP28 = (1);
final int X10_TEMP31 = (n-X10_TEMP28);

final region(:rank==1) X10_TEMP33 = (region(:rank==1))([X10_TEMP30:X10_TEMP31]);
for(point(:rank==1)i:X10_TEMP33) {
final int X10_TEMP37 = (ix+dx_off);

final double X10_TEMP39 = (Program.Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP37));

double dtemp = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP39));
final boolean X10_TEMP42 = dtemp>dmax;
if (X10_TEMP42) {
final int X10_TEMP45 = (i[0]);
itemp = (X10_TEMP45);
dmax = (dtemp);
}
final int X10_TEMP48 = (i[0]);

final int X10_TEMP50 = (X10_TEMP48+incx);
ix = (X10_TEMP50);
}
return itemp;
}
int itemp = (0);
final int X10_TEMP55 = (0);

final int X10_TEMP57 = (X10_TEMP55+dx_off);

final double X10_TEMP59 = (Program.Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP57));

double dmax = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP59));
final int X10_TEMP64 = (1);
final int X10_TEMP62 = (1);
final int X10_TEMP65 = (n-X10_TEMP62);

final region(:rank==1) X10_TEMP67 = (region(:rank==1))([X10_TEMP64:X10_TEMP65]);
for(point(:rank==1)i:X10_TEMP67) {
final int X10_TEMP71 = (i[0]);

final int X10_TEMP73 = (X10_TEMP71+dx_off);

final double X10_TEMP75 = (Program.Linpack_read(X10_TEMP0,dx,dxk,X10_TEMP73));

double dtemp = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP75));
final boolean X10_TEMP78 = dtemp>dmax;
if (X10_TEMP78) {
final int X10_TEMP81 = (i[0]);
itemp = (X10_TEMP81);
dmax = (dtemp);
}
}
return itemp;
}
public static double Linpack_epslon(final Linpack X10_TEMP0, final double x) {
final double X10_TEMP1 = (4.0e0);
final double X10_TEMP2 = (3.0e0);

final double a = (X10_TEMP1/X10_TEMP2);
double eps = (0);
final int X10_TEMP5 = (0);
boolean X10_TEMP9 = eps==X10_TEMP5;
while(X10_TEMP9) {
final double X10_TEMP10 = (1.0);

double b = (a-X10_TEMP10);
final double X10_TEMP12 = (b+b);

double c = (X10_TEMP12+b);
final double X10_TEMP14 = (1.0);

final double X10_TEMP16 = (c-X10_TEMP14);

final double X10_TEMP18 = (Program.Linpack_myabs(X10_TEMP0,X10_TEMP16));
eps = (X10_TEMP18);
final int X10_TEMP7 = (0);
X10_TEMP9 = eps==X10_TEMP7;
}
final double X10_TEMP20 = (Program.Linpack_myabs(X10_TEMP0,x));

final double X10_TEMP22 = (eps*X10_TEMP20);

return X10_TEMP22;
}
public static void Linpack_dmxpy(final Linpack X10_TEMP0, final int n1, final double [:rank==2] y, final int n2, final int ldm, final double [:rank==2] x, final double [:rank==2] m) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (n2-X10_TEMP2);
final int X10_TEMP9 = (0);
final int X10_TEMP7 = (1);
final int X10_TEMP10 = (n1-X10_TEMP7);

final region(:rank==2) X10_TEMP12 = (region(:rank==2))([X10_TEMP4:X10_TEMP5,X10_TEMP9:X10_TEMP10]);
for(point(:rank==2)[j,i]:X10_TEMP12) {
final int X10_TEMP15 = (0);

final int X10_TEMP18 = (0);
final double X10_TEMP29 = (y[X10_TEMP18,i]);
final int X10_TEMP21 = (0);
final double X10_TEMP25 = (x[X10_TEMP21,j]);
final double X10_TEMP26 = (Program.Linpack_read(X10_TEMP0,m,j,i));

final double X10_TEMP28 = (X10_TEMP25*X10_TEMP26);

final double X10_TEMP32 = (X10_TEMP29+X10_TEMP28);
final double X10_TEMP33 = (X10_TEMP32);
y[X10_TEMP15,i] = (X10_TEMP33);
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

