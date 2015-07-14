public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final int _LinearESOpenPIC2D_NUMBER_OF_XBITS = Program._LinearESOpenPIC2D_NUMBER_OF_XBITS_init();
public static final int _LinearESOpenPIC2D_NUMBER_OF_YBITS = Program._LinearESOpenPIC2D_NUMBER_OF_YBITS_init();
public static final int _LinearESOpenPIC2D_PARTICLE_XDENSITY = Program._LinearESOpenPIC2D_PARTICLE_XDENSITY_init();
public static final int _LinearESOpenPIC2D_PARTICLE_YDENSITY = Program._LinearESOpenPIC2D_PARTICLE_YDENSITY_init();
public static final double _LinearESOpenPIC2D_DELTA_TIME = Program._LinearESOpenPIC2D_DELTA_TIME_init();
public static final double _LinearESOpenPIC2D_ELECTRON_CHARGE = Program._LinearESOpenPIC2D_ELECTRON_CHARGE_init();
public static final double _LinearESOpenPIC2D_THERMAL_XVELOCITY = Program._LinearESOpenPIC2D_THERMAL_XVELOCITY_init();
public static final double _LinearESOpenPIC2D_THERMAL_YVELOCITY = Program._LinearESOpenPIC2D_THERMAL_YVELOCITY_init();
public static final int _LinearESOpenPIC2D_BOUNDARY_CONDITION = Program._LinearESOpenPIC2D_BOUNDARY_CONDITION_init();
public static final int _LinearESOpenPIC2D_TIME_STEPS = Program._LinearESOpenPIC2D_TIME_STEPS_init();
public static final int _LinearESOpenPIC2D_SORT_TIME = Program._LinearESOpenPIC2D_SORT_TIME_init();
public static final double _LinearESOpenPIC2D_IMBALANCE = Program._LinearESOpenPIC2D_IMBALANCE_init();
public static final double _PoissonSolver_PI4I = Program._PoissonSolver_PI4I_init();
public static final double _PoissonSolver_SQT2I = Program._PoissonSolver_SQT2I_init();
public static final double _PoissonSolver_SQT2PI = Program._PoissonSolver_SQT2PI_init();
public static final int _PoissonSolver_GREENS_IDX = Program._PoissonSolver_GREENS_IDX_init();
public static final int _PoissonSolver_SHAPE_IDX = Program._PoissonSolver_SHAPE_IDX_init();
public static final int _PoissonSolver_ELECX_IDX = Program._PoissonSolver_ELECX_IDX_init();
public static final int _PoissonSolver_ELECY_IDX = Program._PoissonSolver_ELECY_IDX_init();
public static final double _PoissonSolver_AR = Program._PoissonSolver_AR_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final boolean _X10Util_DEBUG = Program._X10Util_DEBUG_init();
public static final boolean _X10Util_ENABLE_CHECKS = Program._X10Util_ENABLE_CHECKS_init();
public static final double _X10Util_ERROR = Program._X10Util_ERROR_init();
public static final int _LinearESOpenPIC2D_XLENGTH = Program._LinearESOpenPIC2D_XLENGTH_init();
public static final int _LinearESOpenPIC2D_YLENGTH = Program._LinearESOpenPIC2D_YLENGTH_init();
public static final int _LinearESOpenPIC2D_NPARTICLES = Program._LinearESOpenPIC2D_NPARTICLES_init();
public static final int _LinearESOpenPIC2D_MOVE_FIELD_TO_DIST_MAX_ROWS = Program._LinearESOpenPIC2D_MOVE_FIELD_TO_DIST_MAX_ROWS_init();
public static final int _LinearESOpenPIC2D_MOVE_PARTICLES_MAX = Program._LinearESOpenPIC2D_MOVE_PARTICLES_MAX_init();
public static final int _LinearESOpenPIC2D_MOVE_PARTICLES_MAX_BUFFER = Program._LinearESOpenPIC2D_MOVE_PARTICLES_MAX_BUFFER_init();


public static Complex [:rank==2] ArrayUtil_doubleToComplex(final double [:rank==2] src) {
final region(:rank==2) rSrc = (region(:rank==2))(src.region);
final int X10_TEMP4 = (1);

final region(:rank==1) rS2 = (region(:rank==1))(Program.X10Util_getRank2D(rSrc,X10_TEMP4));
final int X10_TEMP6 = (rS2.size());
final int X10_TEMP7 = (2);
final int X10_TEMP8 = (X10_TEMP6%X10_TEMP7);
final int X10_TEMP9 = (0);

final boolean X10_TEMP11 = X10_TEMP8!=X10_TEMP9;
if (X10_TEMP11) {
final String X10_TEMP12 = ("Error: doubleToComplex requires the second ");
final String X10_TEMP13 = ("dimension to be of even size");

final String X10_TEMP15 = (X10_TEMP12+X10_TEMP13);
System.err.println(X10_TEMP15);
final int X10_TEMP16 = 0;
final int X10_TEMP17 = 1;
final int X10_TEMP18 = X10_TEMP16 - X10_TEMP17;
final region(:rank==2) X10_TEMP19 = (region(:rank==2))([X10_TEMP16:X10_TEMP18, X10_TEMP16:X10_TEMP18]);
final place X10_TEMP20 = (here);

final dist(:rank==2) X10_TEMP22 = (dist(:rank==2))(X10_TEMP19->X10_TEMP20);

final dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP22);
final Complex[:rank==2] X10_TEMP25 = (Complex[:rank==2&&distribution==dResult])(new Complex[dResult]);
return X10_TEMP25;
}
final int X10_TEMP32 = (0);
final int X10_TEMP27 = (rS2.size());
final int X10_TEMP28 = (2);
final int X10_TEMP29 = (X10_TEMP27/X10_TEMP28);
final int X10_TEMP30 = (1);
final int X10_TEMP33 = (X10_TEMP29-X10_TEMP30);

final region(:rank==1) rD2 = (region(:rank==1))([X10_TEMP32:X10_TEMP33]);
final dist(:rank==2) dSrc = (dist(:rank==2))(src.distribution);
final int X10_TEMP38 = (0);

final dist(:rank==1) X10_TEMP41 = (dist(:rank==1))(Program.X10Util_get2DDistRank(dSrc,X10_TEMP38));

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_extendDistRank2D(X10_TEMP41,rD2));
final Complex[:rank==2] result = (Complex[:rank==2])(new Complex[dResult]);
finish {
for(point(:rank==2)pt:dResult) {
final place X10_TEMP45 = dResult.get(pt);
async(X10_TEMP45) {
int X10_TEMP49 = (1);
int X10_TEMP50 = (2);

final point(:rank==2) X10_TEMP52 = (pt* [X10_TEMP49,X10_TEMP50]);

double X10_TEMP66 = (src[X10_TEMP52]);
int X10_TEMP56 = (1);
int X10_TEMP57 = (2);
final point(:rank==2) X10_TEMP60 = (pt* [X10_TEMP56,X10_TEMP57]);
int X10_TEMP61 = (0);
int X10_TEMP62 = (1);

final point(:rank==2) X10_TEMP64 = (X10_TEMP60+[X10_TEMP61,X10_TEMP62]);

double X10_TEMP67 = (src[X10_TEMP64]);

final Complex X10_TEMP70 = (new Complex(X10_TEMP66,X10_TEMP67));
final Complex X10_TEMP71 = (X10_TEMP70);
result[pt] = (X10_TEMP71);
}
}
}
return result;
}
public static double [:rank==2] ArrayUtil_complexToDouble(final Complex [:rank==2] src) {
final region(:rank==2) rSrc = (region(:rank==2))(src.region);
final int X10_TEMP4 = (1);

final region(:rank==1) rS2 = (region(:rank==1))(Program.X10Util_getRank2D(rSrc,X10_TEMP4));
final int X10_TEMP12 = (0);
final int X10_TEMP7 = (2);
final int X10_TEMP8 = (rS2.size());
final int X10_TEMP9 = (X10_TEMP7*X10_TEMP8);
final int X10_TEMP10 = (1);
final int X10_TEMP13 = (X10_TEMP9-X10_TEMP10);

final region(:rank==1) rD2 = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
final dist(:rank==2) dSrc = (dist(:rank==2))(src.distribution);
final int X10_TEMP18 = (0);

final dist(:rank==1) X10_TEMP21 = (dist(:rank==1))(Program.X10Util_get2DDistRank(dSrc,X10_TEMP18));

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_extendDistRank2D(X10_TEMP21,rD2));
final double[:rank==2] result = (double[:rank==2])(new double[dResult]);
finish {
for(point(:rank==2)pt:dResult) {
final place X10_TEMP25 = dResult.get(pt);
async(X10_TEMP25) {
int X10_TEMP28 = (1);
int X10_TEMP29 = (2);

final point(:rank==2) ptd2 = (pt/ [X10_TEMP28,X10_TEMP29]);
final int X10_TEMP32 = (pt[1]);
final int X10_TEMP33 = (2);
final int X10_TEMP34 = (X10_TEMP32%X10_TEMP33);
final int X10_TEMP35 = (0);

final boolean X10_TEMP37 = X10_TEMP34==X10_TEMP35;
if (X10_TEMP37) {
final Complex X10_TEMP40 = (src[ptd2]);

final double X10_TEMP43 = (Program.Complex_getReal(X10_TEMP40));
final double X10_TEMP44 = (X10_TEMP43);
result[pt] = (X10_TEMP44);
}
else {
final Complex X10_TEMP47 = (src[ptd2]);

final double X10_TEMP50 = (Program.Complex_getImag(X10_TEMP47));
final double X10_TEMP51 = (X10_TEMP50);
result[pt] = (X10_TEMP51);
}
}
}
}
return result;
}
public static Complex [:rank==2] ArrayUtil_transpose(final Complex [:rank==2] data) {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(data.distribution);

final dist(:rank==2) dData = (dist(:rank==2))(X10_TEMP1);
final boolean X10_TEMP4 = (Program.X10Util_isDistBlockStar(dData));

final boolean X10_TEMP6 = !X10_TEMP4;
if (X10_TEMP6) {
final String X10_TEMP7 = ("Transpose only works on star block");
final String X10_TEMP8 = ("distributed arrays");

final String X10_TEMP10 = (X10_TEMP7+X10_TEMP8);

Program.X10Util_println(X10_TEMP10);
final String X10_TEMP11 = ("transpose: ");
final dist(:rank==2) X10_TEMP12 = (dist(:rank==2))(data.distribution);

final String X10_TEMP14 = (X10_TEMP11+X10_TEMP12);
throw new RuntimeException(X10_TEMP14);
}
final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_transposeBlockStar(dData));
final Complex[:rank==2] result = (Complex[:rank==2])(new Complex[dResult]);
finish {
final dist(:rank==1) X10_TEMP19 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP19) {
final place X10_TEMP20 = X10_TEMP19.get(pl);
async(X10_TEMP20) {
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final region(:rank==2) rTtmp = (region(:rank==2))(Program.X10Util_transposeRegion(rLocal));
final int X10_TEMP25 = (rLocal.size());
final int X10_TEMP26 = (0);

final boolean X10_TEMP28 = X10_TEMP25>X10_TEMP26;
if (X10_TEMP28) {
final int X10_TEMP31 = (0);

final region(:rank==1) rTtmp1 = (region(:rank==1))(Program.X10Util_getRank2D(rTtmp,X10_TEMP31));
final int X10_TEMP35 = (1);

final region(:rank==1) rTtmp2 = (region(:rank==1))(Program.X10Util_getRank2D(rTtmp,X10_TEMP35));
final int X10_TEMP39 = (rTtmp1.low());
final int X10_TEMP40 = (rTtmp1.high());
final int X10_TEMP43 = (rTtmp2.low());
final int X10_TEMP44 = (rTtmp2.high());

final region(:rank==2) rLocalT = (region(:rank==2))([X10_TEMP39:X10_TEMP40,X10_TEMP43:X10_TEMP44]);
final dist(:rank==1) X10_TEMP46 = (dist(:rank==1))(dist.UNIQUE);
final region(:rank==1) X10_TEMP47 = (region(:rank==1))(X10_TEMP46.region);

final region(:rank==1) rRSBuffer = (region(:rank==1))(X10_TEMP47);
final region(:rank==2) value[:rank==1] X10_TEMP68 = (region(:rank==2) value[:rank==1])(new region(:rank==2) value[rRSBuffer](point(:rank==1)p) {
final dist(:rank==1) X10_TEMP49 = (dist(:rank==1))(dist.UNIQUE);
final place X10_TEMP51 = (X10_TEMP49.get(p));

final dist(:rank==2) X10_TEMP53 = (dist(:rank==2))(dResult|X10_TEMP51);
final region(:rank==2) X10_TEMP54 = (region(:rank==2))(X10_TEMP53.region);

final region(:rank==2) rTLocal = (region(:rank==2))(X10_TEMP54);
final int X10_TEMP56 = 0;
final int X10_TEMP57 = 1;
final int X10_TEMP58 = X10_TEMP56 - X10_TEMP57;
final place X10_TEMP59 = here;
region(:rank==2) X10_TEMP60 = [X10_TEMP56:X10_TEMP58, X10_TEMP56:X10_TEMP58];
for(point(:rank==2)X10_TEMP61[X10_TEMP62, X10_TEMP63]:rLocalT) {
	final boolean X10_TEMP64 = rTLocal.contains(X10_TEMP61);
	if(X10_TEMP64) {
		final region(:rank==2) X10_TEMP65 = [X10_TEMP62:X10_TEMP62, X10_TEMP63:X10_TEMP63];
		X10_TEMP60 = X10_TEMP60 || X10_TEMP65;
	}
}
final region(:rank==2) X10_TEMP66 = X10_TEMP60;

return X10_TEMP66;
}

);

final region(:rank==2) value[:rank==1] rSBuffer = (region(:rank==2) value[:rank==1])(X10_TEMP68);
final Complex value[:rank==2] X10_TEMP74 = (Complex value[:rank==2])(new Complex value[rLocalT](point(:rank==2)[i,j]) {
final Complex X10_TEMP73 = (data[j,i]);
return X10_TEMP73;
}

);

final Complex value[:rank==2] sBuffer = (Complex value[:rank==2])(X10_TEMP74);
final place X10_TEMP77 = here;
for(point(:rank==1)i:rSBuffer) {
async(X10_TEMP77) {
final region(:rank==2) X10_TEMP81 = (region(:rank==2))(rSBuffer[i]);
final dist(:rank==1) X10_TEMP79 = (dist(:rank==1))(dist.UNIQUE);
final place X10_TEMP82 = (X10_TEMP79.get(i));

final dist(:rank==2) X10_TEMP84 = (dist(:rank==2))(X10_TEMP81->X10_TEMP82);
for(point(:rank==2)pt:X10_TEMP84) {
final place X10_TEMP85 = X10_TEMP84.get(pt);
async(X10_TEMP85) {
final Complex X10_TEMP90 = (sBuffer[pt]);
final Complex X10_TEMP91 = (X10_TEMP90);
result[pt] = (X10_TEMP91);
}
}
}
}
}
}
}
}
return result;
}
public static double Complex_getReal(final Complex X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.real);
return X10_TEMP2;
}
public static double Complex_getImag(final Complex X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.imag);
return X10_TEMP2;
}
public static Complex Complex_add(final Complex X10_TEMP0, final Complex n) {
final double X10_TEMP1 = (Program.Complex_getReal(X10_TEMP0));
final double X10_TEMP2 = (Program.Complex_getReal(n));

double X10_TEMP7 = (X10_TEMP1+X10_TEMP2);
final double X10_TEMP4 = (Program.Complex_getImag(X10_TEMP0));
final double X10_TEMP5 = (Program.Complex_getImag(n));

double X10_TEMP8 = (X10_TEMP4+X10_TEMP5);

final Complex X10_TEMP10 = (new Complex(X10_TEMP7,X10_TEMP8));
return X10_TEMP10;
}
public static Complex Complex_sub(final Complex X10_TEMP0, final Complex n) {
final double X10_TEMP1 = (Program.Complex_getReal(X10_TEMP0));
final double X10_TEMP2 = (Program.Complex_getReal(n));

double X10_TEMP7 = (X10_TEMP1-X10_TEMP2);
final double X10_TEMP4 = (Program.Complex_getImag(X10_TEMP0));
final double X10_TEMP5 = (Program.Complex_getImag(n));

double X10_TEMP8 = (X10_TEMP4-X10_TEMP5);

final Complex X10_TEMP10 = (new Complex(X10_TEMP7,X10_TEMP8));
return X10_TEMP10;
}
public static Complex Complex_mult(final Complex X10_TEMP0, final Complex n) {
final double a = (Program.Complex_getReal(X10_TEMP0));
final double b = (Program.Complex_getImag(X10_TEMP0));
final double c = (Program.Complex_getReal(n));
final double d = (Program.Complex_getImag(n));
final double X10_TEMP5 = (a*c);
final double X10_TEMP6 = (b*d);

double X10_TEMP11 = (X10_TEMP5-X10_TEMP6);
final double X10_TEMP8 = (a*d);
final double X10_TEMP9 = (b*c);

double X10_TEMP12 = (X10_TEMP8+X10_TEMP9);

final Complex X10_TEMP14 = (new Complex(X10_TEMP11,X10_TEMP12));
return X10_TEMP14;
}
public static Complex Complex_multS(final Complex X10_TEMP0, final double r) {
final double X10_TEMP1 = (Program.Complex_getReal(X10_TEMP0));

double X10_TEMP5 = (r*X10_TEMP1);
final double X10_TEMP3 = (Program.Complex_getImag(X10_TEMP0));

double X10_TEMP6 = (r*X10_TEMP3);

final Complex X10_TEMP8 = (new Complex(X10_TEMP5,X10_TEMP6));
return X10_TEMP8;
}
public static Complex Complex_getConjg(final Complex X10_TEMP0) {
double X10_TEMP5 = (Program.Complex_getReal(X10_TEMP0));
final double X10_TEMP2 = (Program.Complex_getImag(X10_TEMP0));
final int X10_TEMP3 = 0;

double X10_TEMP6 = (X10_TEMP3 - X10_TEMP2);

final Complex X10_TEMP8 = (new Complex(X10_TEMP5,X10_TEMP6));
return X10_TEMP8;
}
public static double Complex_multConjg(final Complex X10_TEMP0) {
final double a = (Program.Complex_getReal(X10_TEMP0));
final double b = (Program.Complex_getImag(X10_TEMP0));
final double X10_TEMP3 = (a*a);
final double X10_TEMP4 = (b*b);

final double X10_TEMP6 = (X10_TEMP3+X10_TEMP4);

return X10_TEMP6;
}
public static boolean Complex_complexEquals(final Complex X10_TEMP0, final Complex c) {
final double X10_TEMP1 = (Program.Complex_getReal(X10_TEMP0));
final double X10_TEMP2 = (Program.Complex_getReal(c));
final double X10_TEMP4 = (X10_TEMP1-X10_TEMP2);
final double X10_TEMP5 = (Math.abs(X10_TEMP4));

final boolean X10_TEMP7 = (X10_TEMP5<_X10Util_ERROR);
final double X10_TEMP8 = (Program.Complex_getImag(X10_TEMP0));
final double X10_TEMP9 = (Program.Complex_getImag(c));
final double X10_TEMP11 = (X10_TEMP8-X10_TEMP9);
final double X10_TEMP12 = (Math.abs(X10_TEMP11));

final boolean X10_TEMP14 = (X10_TEMP12<_X10Util_ERROR);

final boolean X10_TEMP16 = (X10_TEMP7&&X10_TEMP14);

return X10_TEMP16;
}
public static String Complex_toString(final Complex X10_TEMP0) {
final double r = (Program.Complex_getReal(X10_TEMP0));
final double i = (Program.Complex_getImag(X10_TEMP0));
final String X10_TEMP3 = ("(");
final String X10_TEMP4 = (X10_TEMP3+r);
final String X10_TEMP5 = (",");
final String X10_TEMP6 = (X10_TEMP4+X10_TEMP5);
final String X10_TEMP7 = (X10_TEMP6+i);
final String X10_TEMP8 = (")");

final String X10_TEMP10 = (X10_TEMP7+X10_TEMP8);
return X10_TEMP10;
}
public static Complex [:rank==2] FourierTransform2D_transformC(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
Program.FourierTransform2D_scrambleY(X10_TEMP0,f);
final int X10_TEMP4 = (0);

Program.FourierTransform2D_bitReverse(X10_TEMP0,f,X10_TEMP4);
final int X10_TEMP8 = (0);
final boolean X10_TEMP9 = (false);

Program.FourierTransform2D_transformRank(X10_TEMP0,f,X10_TEMP8,X10_TEMP9);
final Complex[:rank==2] g = (Complex[:rank==2])(Program.ArrayUtil_transpose(f));
Program.FourierTransform2D_scrambleX(X10_TEMP0,g);
final int X10_TEMP15 = (1);

Program.FourierTransform2D_bitReverse(X10_TEMP0,g,X10_TEMP15);
final int X10_TEMP19 = (1);
final boolean X10_TEMP20 = (false);

Program.FourierTransform2D_transformRank(X10_TEMP0,g,X10_TEMP19,X10_TEMP20);
return g;
}
public static Complex [:rank==2] FourierTransform2D_transformD(final FourierTransform2D X10_TEMP0, final double [:rank==2] f) {
final Complex[:rank==2] X10_TEMP3 = (Complex[:rank==2])(Program.ArrayUtil_doubleToComplex(f));

final Complex[:rank==2] X10_TEMP5 = (Complex[:rank==2])(Program.FourierTransform2D_transformC(X10_TEMP0,X10_TEMP3));
return X10_TEMP5;
}
public static Complex [:rank==2] FourierTransform2D_inverseTransformC(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
final int X10_TEMP3 = (1);

Program.FourierTransform2D_bitReverse(X10_TEMP0,f,X10_TEMP3);
final int X10_TEMP7 = (1);
final boolean X10_TEMP8 = (true);

Program.FourierTransform2D_transformRank(X10_TEMP0,f,X10_TEMP7,X10_TEMP8);
Program.FourierTransform2D_unscrambleX(X10_TEMP0,f);
final Complex[:rank==2] g = (Complex[:rank==2])(Program.ArrayUtil_transpose(f));
final int X10_TEMP14 = (0);

Program.FourierTransform2D_bitReverse(X10_TEMP0,g,X10_TEMP14);
final int X10_TEMP18 = (0);
final boolean X10_TEMP19 = (true);

Program.FourierTransform2D_transformRank(X10_TEMP0,g,X10_TEMP18,X10_TEMP19);
Program.FourierTransform2D_unscrambleY(X10_TEMP0,g);
return g;
}
public static Complex [:rank==2] FourierTransform2D_inverseTransformD(final FourierTransform2D X10_TEMP0, final double [:rank==2] f) {
final Complex[:rank==2] X10_TEMP3 = (Complex[:rank==2])(Program.ArrayUtil_doubleToComplex(f));

final Complex[:rank==2] X10_TEMP5 = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformC(X10_TEMP0,X10_TEMP3));
return X10_TEMP5;
}
public static void FourierTransform2D_bitReverse(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f, final int rnk) {
final int X10_TEMP1 = (0);

final boolean X10_TEMP3 = (rnk==X10_TEMP1);
final boolean X10_TEMP4 = X10_TEMP3;
final int X10_TEMP6 = (X10_TEMP0.nBits2);
final int X10_TEMP7 = (1);
int X10_TEMP9 = X10_TEMP6-X10_TEMP7;
if(X10_TEMP4){
X10_TEMP9 = X10_TEMP0.nBits1;
}
final int X10_TEMP10 = X10_TEMP9;

final int nBits = (X10_TEMP10);
final int X10_TEMP11 = (0);

final boolean X10_TEMP13 = (rnk==X10_TEMP11);
final boolean X10_TEMP14 = X10_TEMP13;
final int X10_TEMP16 = (X10_TEMP0.length2);
final int X10_TEMP17 = (2);
int X10_TEMP19 = X10_TEMP16/X10_TEMP17;
if(X10_TEMP14){
X10_TEMP19 = X10_TEMP0.length1;
}
final int X10_TEMP20 = X10_TEMP19;

final int r1Length = (X10_TEMP20);
final int X10_TEMP21 = (1);

final int X10_TEMP23 = (X10_TEMP21<<nBits);

final int nrx = (X10_TEMP23/r1Length);
finish {
final dist(:rank==1) X10_TEMP26 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP26) {
final place X10_TEMP27 = X10_TEMP26.get(pl);
async(X10_TEMP27) {
final dist(:rank==2) dF = (dist(:rank==2))(f.distribution);
final int X10_TEMP31 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dF,X10_TEMP31));
final int X10_TEMP36 = (0);
final int X10_TEMP34 = (1);
final int X10_TEMP37 = (r1Length-X10_TEMP34);

final region(:rank==1) X10_TEMP39 = (region(:rank==1))([X10_TEMP36:X10_TEMP37]);
final place X10_TEMP40 = here;
for(point(:rank==1)[j1]:X10_TEMP39) {
async(X10_TEMP40) {
final int value[:rank==1] X10_TEMP41 = (int value[:rank==1])(X10_TEMP0.tableBitReverse);
final int X10_TEMP46 = (X10_TEMP41[j1]);
final int X10_TEMP43 = (X10_TEMP0.maxBits);

final int X10_TEMP45 = (X10_TEMP43-nBits);

final int j2 = (X10_TEMP46>>X10_TEMP45);
final boolean X10_TEMP49 = j1<j2;
if (X10_TEMP49) {
finish {
final place X10_TEMP51 = here;
for(point(:rank==1)[i]:rLocal1) {
async(X10_TEMP51) {
final Complex temp = (f[i,j1]);
final Complex X10_TEMP61 = (f[i,j2]);
final Complex X10_TEMP62 = (X10_TEMP61);
f[i,j1] = (X10_TEMP62);
final Complex X10_TEMP67 = (temp);
f[i,j2] = (X10_TEMP67);
}
}
}
}
}
}
}
}
}
}
public static void FourierTransform2D_scrambleX(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
final int X10_TEMP1 = (X10_TEMP0.length2);
final int X10_TEMP2 = (2);

final int nxh = (X10_TEMP1/X10_TEMP2);
final int X10_TEMP4 = (2);

final int nxhh = (nxh/X10_TEMP4);
final int X10_TEMP8 = (X10_TEMP0.length1);
final int X10_TEMP9 = (X10_TEMP0.length2);
final int X10_TEMP10 = (Program.X10Util_maxInt(X10_TEMP8,X10_TEMP9));
final int X10_TEMP11 = (X10_TEMP0.length2);

final int kmr = (X10_TEMP10/X10_TEMP11);
finish {
final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP14) {
final place X10_TEMP15 = X10_TEMP14.get(pl);
async(X10_TEMP15) {
final dist(:rank==2) dF = (dist(:rank==2))(f.distribution);
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dF));
final int X10_TEMP21 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP21));
final region(:rank==2) X10_TEMP27 = (region(:rank==2))([rLocal1,nxhh:nxhh]);
final place X10_TEMP28 = here;
for(point(:rank==2)pt:X10_TEMP27) {
async(X10_TEMP28) {
final Complex X10_TEMP31 = (f[pt]);

final Complex X10_TEMP33 = (Program.Complex_getConjg(X10_TEMP31));
final int X10_TEMP35 = (2);

final Complex X10_TEMP38 = (Program.Complex_multS(X10_TEMP33,X10_TEMP35));
final Complex X10_TEMP39 = (X10_TEMP38);
f[pt] = (X10_TEMP39);
int X10_TEMP42 = (1);
int X10_TEMP43 = (0);

final point(:rank==2) pt0 = (pt* [X10_TEMP42,X10_TEMP43]);
final Complex t2 = (f[pt0]);
final double t2Real = (Program.Complex_getReal(t2));
final double t2Imag = (Program.Complex_getImag(t2));
double X10_TEMP52 = (t2Real+t2Imag);
double X10_TEMP53 = (t2Real-t2Imag);

final Complex X10_TEMP56 = (new Complex(X10_TEMP52,X10_TEMP53));
final Complex X10_TEMP57 = (X10_TEMP56);
f[pt0] = (X10_TEMP57);
}
}
final int X10_TEMP61 = (1);
final int X10_TEMP59 = (1);
final int X10_TEMP62 = (nxhh-X10_TEMP59);

final region(:rank==1) X10_TEMP64 = (region(:rank==1))([X10_TEMP61:X10_TEMP62]);
for(point(:rank==1)[j1]:X10_TEMP64) {
final int j2 = (nxh-j1);
final Complex value[:rank==1] X10_TEMP66 = (Complex value[:rank==1])(X10_TEMP0.tableSineCosine);
final int X10_TEMP68 = (kmr*j1);

final Complex t0 = (X10_TEMP66[X10_TEMP68]);
double X10_TEMP72 = (Program.Complex_getImag(t0));
double X10_TEMP73 = (Program.Complex_getReal(t0));

final Complex t1 = (new Complex(X10_TEMP72,X10_TEMP73));
final place X10_TEMP76 = here;
for(point(:rank==1)[i]:rLocal1) {
async(X10_TEMP76) {
final Complex X10_TEMP79 = (f[i,j2]);

final Complex t = (Program.Complex_getConjg(X10_TEMP79));
final Complex X10_TEMP83 = (f[i,j1]);

final Complex s = (Program.Complex_add(X10_TEMP83,t));
final Complex X10_TEMP88 = (f[i,j1]);

final Complex X10_TEMP91 = (Program.Complex_sub(X10_TEMP88,t));

final Complex t3 = (Program.Complex_mult(X10_TEMP91,t1));
final Complex X10_TEMP99 = (Program.Complex_add(s,t3));
final Complex X10_TEMP100 = (X10_TEMP99);
f[i,j1] = (X10_TEMP100);
final Complex X10_TEMP105 = (Program.Complex_sub(s,t3));

final Complex X10_TEMP108 = (Program.Complex_getConjg(X10_TEMP105));
final Complex X10_TEMP109 = (X10_TEMP108);
f[i,j2] = (X10_TEMP109);
}
}
}
}
}
}
}
public static void FourierTransform2D_unscrambleX(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
final int X10_TEMP1 = (X10_TEMP0.length2);
final int X10_TEMP2 = (2);

final int nxh = (X10_TEMP1/X10_TEMP2);
final int X10_TEMP4 = (X10_TEMP0.length2);
final int X10_TEMP5 = (4);

final int nxhh = (X10_TEMP4/X10_TEMP5);
final int X10_TEMP9 = (X10_TEMP0.length1);
final int X10_TEMP10 = (X10_TEMP0.length2);
final int X10_TEMP11 = (Program.X10Util_maxInt(X10_TEMP9,X10_TEMP10));
final int X10_TEMP12 = (X10_TEMP0.length2);

final int kmr = (X10_TEMP11/X10_TEMP12);
finish {
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP15) {
final place X10_TEMP16 = X10_TEMP15.get(pl);
async(X10_TEMP16) {
final dist(:rank==2) dF = (dist(:rank==2))(f.distribution);
final int X10_TEMP20 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dF,X10_TEMP20));
final int X10_TEMP25 = (1);
final int X10_TEMP23 = (1);
final int X10_TEMP26 = (nxhh-X10_TEMP23);

final region(:rank==1) X10_TEMP28 = (region(:rank==1))([X10_TEMP25:X10_TEMP26]);
final place X10_TEMP29 = here;
for(point(:rank==1)[j1]:X10_TEMP28) {
async(X10_TEMP29) {
final int j2 = (nxh-j1);
final Complex value[:rank==1] X10_TEMP31 = (Complex value[:rank==1])(X10_TEMP0.tableSineCosine);
final int X10_TEMP33 = (kmr*j1);

final Complex t0 = (X10_TEMP31[X10_TEMP33]);
double X10_TEMP39 = (Program.Complex_getImag(t0));
final double X10_TEMP36 = (Program.Complex_getReal(t0));
final int X10_TEMP37 = 0;

double X10_TEMP40 = (X10_TEMP37 - X10_TEMP36);

final Complex t1 = (new Complex(X10_TEMP39,X10_TEMP40));
final place X10_TEMP43 = here;
for(point(:rank==1)[i]:rLocal1) {
async(X10_TEMP43) {
final Complex X10_TEMP46 = (f[i,j2]);

final Complex t = (Program.Complex_getConjg(X10_TEMP46));
final Complex X10_TEMP50 = (f[i,j1]);

final Complex s = (Program.Complex_add(X10_TEMP50,t));
final Complex X10_TEMP55 = (f[i,j1]);

final Complex X10_TEMP58 = (Program.Complex_sub(X10_TEMP55,t));

final Complex t2 = (Program.Complex_mult(X10_TEMP58,t1));
final Complex X10_TEMP65 = (Program.Complex_add(s,t2));
final double X10_TEMP67 = (X10_TEMP0.invN);

final Complex X10_TEMP70 = (Program.Complex_multS(X10_TEMP65,X10_TEMP67));
final Complex X10_TEMP71 = (X10_TEMP70);
f[i,j1] = (X10_TEMP71);
final Complex X10_TEMP76 = (Program.Complex_sub(s,t2));

final Complex X10_TEMP78 = (Program.Complex_getConjg(X10_TEMP76));
final double X10_TEMP80 = (X10_TEMP0.invN);

final Complex X10_TEMP83 = (Program.Complex_multS(X10_TEMP78,X10_TEMP80));
final Complex X10_TEMP84 = (X10_TEMP83);
f[i,j2] = (X10_TEMP84);
}
}
}
}
final region(:rank==2) X10_TEMP89 = (region(:rank==2))([rLocal1,nxhh:nxhh]);
final place X10_TEMP90 = here;
for(point(:rank==2)pt:X10_TEMP89) {
async(X10_TEMP90) {
int X10_TEMP93 = (1);
int X10_TEMP94 = (0);

final point(:rank==2) pt0 = (pt* [X10_TEMP93,X10_TEMP94]);
final Complex t1 = (f[pt0]);
final Complex t2 = (f[pt]);
final double t1Real = (Program.Complex_getReal(t1));
final double t1Imag = (Program.Complex_getImag(t1));
double X10_TEMP104 = (t1Real+t1Imag);
double X10_TEMP105 = (t1Real-t1Imag);

final Complex t3 = (new Complex(X10_TEMP104,X10_TEMP105));
final Complex X10_TEMP109 = (Program.Complex_getConjg(t2));
final double X10_TEMP110 = (2);
final double X10_TEMP111 = (X10_TEMP0.invN);

final double X10_TEMP113 = (X10_TEMP110*X10_TEMP111);

final Complex X10_TEMP116 = (Program.Complex_multS(X10_TEMP109,X10_TEMP113));
final Complex X10_TEMP117 = (X10_TEMP116);
f[pt] = (X10_TEMP117);
final double X10_TEMP119 = (2);
final double X10_TEMP120 = (X10_TEMP0.invN);

final double X10_TEMP122 = (X10_TEMP119*X10_TEMP120);

final Complex X10_TEMP125 = (Program.Complex_multS(t3,X10_TEMP122));
final Complex X10_TEMP126 = (X10_TEMP125);
f[pt0] = (X10_TEMP126);
}
}
}
}
}
}
public static void FourierTransform2D_scrambleY(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
finish {
final place X10_TEMP2 = place.FIRST_PLACE;
async(X10_TEMP2) {
final int X10_TEMP10 = (1);
final int X10_TEMP4 = (X10_TEMP0.length1);
final int X10_TEMP5 = (2);

final int X10_TEMP7 = (X10_TEMP4/X10_TEMP5);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (X10_TEMP7-X10_TEMP8);

final region(:rank==1) X10_TEMP13 = (region(:rank==1))([X10_TEMP10:X10_TEMP11]);
final place X10_TEMP14 = here;
for(point(:rank==1)[j1]:X10_TEMP13) {
async(X10_TEMP14) {
final int X10_TEMP15 = (X10_TEMP0.length1);

final int j2 = (X10_TEMP15-j1);
final int X10_TEMP19 = (0);

final Complex t1 = (f[X10_TEMP19,j2]);
final int X10_TEMP23 = (0);

final Complex t2 = (f[X10_TEMP23,j1]);
double X10_TEMP27 = (Program.Complex_getImag(t1));
double X10_TEMP28 = (Program.Complex_getReal(t1));

final Complex s = (new Complex(X10_TEMP27,X10_TEMP28));
final int X10_TEMP32 = (0);

final Complex X10_TEMP35 = (Program.Complex_sub(t2,s));

final Complex X10_TEMP38 = (Program.Complex_getConjg(X10_TEMP35));
final Complex X10_TEMP39 = (X10_TEMP38);
f[X10_TEMP32,j2] = (X10_TEMP39);
final int X10_TEMP42 = (0);

final Complex X10_TEMP46 = (Program.Complex_add(t2,s));
final Complex X10_TEMP47 = (X10_TEMP46);
f[X10_TEMP42,j1] = (X10_TEMP47);
}
}
}
}
}
public static void FourierTransform2D_unscrambleY(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f) {
finish {
final place X10_TEMP2 = place.FIRST_PLACE;
async(X10_TEMP2) {
final int X10_TEMP10 = (1);
final int X10_TEMP4 = (X10_TEMP0.length1);
final int X10_TEMP5 = (2);

final int X10_TEMP7 = (X10_TEMP4/X10_TEMP5);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (X10_TEMP7-X10_TEMP8);

final region(:rank==1) X10_TEMP13 = (region(:rank==1))([X10_TEMP10:X10_TEMP11]);
final place X10_TEMP14 = here;
for(point(:rank==1)[j1]:X10_TEMP13) {
async(X10_TEMP14) {
final int X10_TEMP15 = (X10_TEMP0.length1);

final int j2 = (X10_TEMP15-j1);
final int X10_TEMP19 = (0);

final Complex s = (f[X10_TEMP19,j2]);
final int X10_TEMP23 = (0);

final Complex t = (f[X10_TEMP23,j1]);
final Complex t1 = (Program.Complex_add(t,s));
final Complex t2 = (Program.Complex_sub(t,s));
final int X10_TEMP31 = (0);

double X10_TEMP34 = (Program.Complex_getImag(t1));
double X10_TEMP35 = (Program.Complex_getReal(t2));

final Complex X10_TEMP37 = (new Complex(X10_TEMP34,X10_TEMP35));
final double X10_TEMP39 = (0.5);

final Complex X10_TEMP42 = (Program.Complex_multS(X10_TEMP37,X10_TEMP39));
final Complex X10_TEMP43 = (X10_TEMP42);
f[X10_TEMP31,j2] = (X10_TEMP43);
final int X10_TEMP46 = (0);

double X10_TEMP49 = (Program.Complex_getReal(t1));
double X10_TEMP50 = (Program.Complex_getImag(t2));

final Complex X10_TEMP52 = (new Complex(X10_TEMP49,X10_TEMP50));
final double X10_TEMP54 = (0.5);

final Complex X10_TEMP57 = (Program.Complex_multS(X10_TEMP52,X10_TEMP54));
final Complex X10_TEMP58 = (X10_TEMP57);
f[X10_TEMP46,j1] = (X10_TEMP58);
}
}
}
}
}
public static void FourierTransform2D_transformRank(final FourierTransform2D X10_TEMP0, final Complex [:rank==2] f, final int rnk, final boolean inverse) {
final int X10_TEMP3 = (X10_TEMP0.length1);
final int X10_TEMP4 = (X10_TEMP0.length2);

final int nxy = (Program.X10Util_maxInt(X10_TEMP3,X10_TEMP4));
final int X10_TEMP6 = (X10_TEMP0.length2);
final int X10_TEMP7 = (2);

final int nxh = (X10_TEMP6/X10_TEMP7);
final int X10_TEMP9 = (X10_TEMP0.length1);
final int X10_TEMP10 = (2);

final int nyh = (X10_TEMP9/X10_TEMP10);
final int X10_TEMP12 = (X10_TEMP0.length2);
final int X10_TEMP13 = (4);

final int nxhh = (X10_TEMP12/X10_TEMP13);
final int X10_TEMP15 = (0);

final boolean X10_TEMP17 = (rnk==X10_TEMP15);
final boolean X10_TEMP18 = X10_TEMP17;
final int X10_TEMP20 = (X10_TEMP0.nBits2);
final int X10_TEMP21 = (1);
int X10_TEMP23 = X10_TEMP20-X10_TEMP21;
if(X10_TEMP18){
X10_TEMP23 = X10_TEMP0.nBits1;
}
final int X10_TEMP24 = X10_TEMP23;

final int bits = (X10_TEMP24);
final int X10_TEMP25 = (0);

final boolean X10_TEMP27 = (rnk==X10_TEMP25);
final boolean X10_TEMP28 = X10_TEMP27;
int X10_TEMP31 = nxh;
if(X10_TEMP28){
X10_TEMP31 = X10_TEMP0.length1;
}
final int X10_TEMP32 = X10_TEMP31;

final int X10_TEMP33 = (X10_TEMP32);

final int r = (nxy/X10_TEMP33);
final int X10_TEMP38 = (0);
final int X10_TEMP36 = (1);
final int X10_TEMP39 = (bits-X10_TEMP36);

final region(:rank==1) X10_TEMP41 = (region(:rank==1))([X10_TEMP38:X10_TEMP39]);
for(point(:rank==1)exponent:X10_TEMP41) {
final int X10_TEMP43 = (1);
final int X10_TEMP44 = (exponent[0]);

final int stride = (X10_TEMP43<<X10_TEMP44);
final int X10_TEMP46 = (2);

final int width = (X10_TEMP46*stride);
final int X10_TEMP48 = (0);

final boolean X10_TEMP50 = (rnk==X10_TEMP48);
final boolean X10_TEMP51 = X10_TEMP50;
int X10_TEMP54 = nxhh;
if(X10_TEMP51){
X10_TEMP54 = nyh;
}
final int X10_TEMP55 = X10_TEMP54;

final int X10_TEMP56 = (X10_TEMP55);

final int km = (X10_TEMP56/stride);
final int kmr = (km*r);
finish {
final dist(:rank==1) X10_TEMP60 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP60) {
final place X10_TEMP61 = X10_TEMP60.get(pl);
async(X10_TEMP61) {
final int X10_TEMP65 = (0);
final int X10_TEMP63 = (1);
final int X10_TEMP66 = (km-X10_TEMP63);

final region(:rank==1) X10_TEMP68 = (region(:rank==1))([X10_TEMP65:X10_TEMP66]);
for(point(:rank==1)[k]:X10_TEMP68) {
final int lb = (width*k);
final int mb = (lb+stride);
finish {
final int X10_TEMP74 = (0);
final int X10_TEMP72 = (1);
final int X10_TEMP75 = (stride-X10_TEMP72);

final region(:rank==1) X10_TEMP77 = (region(:rank==1))([X10_TEMP74:X10_TEMP75]);
final place X10_TEMP78 = here;
for(point(:rank==1)[j]:X10_TEMP77) {
async(X10_TEMP78) {
final int j1 = (j+lb);
final int j2 = (j+mb);
final boolean X10_TEMP82 = (inverse);
final boolean X10_TEMP83 = X10_TEMP82;
final Complex value[:rank==1] X10_TEMP84 = (Complex value[:rank==1])(X10_TEMP0.tableSineCosine);
final int X10_TEMP86 = (kmr*j);
final Complex value[:rank==1] X10_TEMP88 = (Complex value[:rank==1])(X10_TEMP0.tableSineCosine);
final int X10_TEMP90 = (kmr*j);
final Complex X10_TEMP91 = (X10_TEMP88[X10_TEMP90]);
Complex X10_TEMP93 = Program.Complex_getConjg(X10_TEMP91);
if(X10_TEMP83){
X10_TEMP93 = X10_TEMP84[X10_TEMP86];
}
final Complex X10_TEMP94 = X10_TEMP93;

final Complex X10_TEMP95 = (X10_TEMP94);

final Complex s = (X10_TEMP95);
final dist(:rank==2) dF = (dist(:rank==2))(f.distribution);
final int X10_TEMP100 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dF,X10_TEMP100));
final place X10_TEMP103 = here;
for(point(:rank==1)[i]:rLocal1) {
async(X10_TEMP103) {
final Complex tmp1 = (f[i,j1]);
final Complex X10_TEMP110 = (f[i,j2]);

final Complex tmp2 = (Program.Complex_mult(s,X10_TEMP110));
final Complex X10_TEMP117 = (Program.Complex_sub(tmp1,tmp2));
final Complex X10_TEMP118 = (X10_TEMP117);
f[i,j2] = (X10_TEMP118);
final Complex X10_TEMP124 = (Program.Complex_add(tmp1,tmp2));
final Complex X10_TEMP125 = (X10_TEMP124);
f[i,j1] = (X10_TEMP125);
}
}
}
}
}
}
}
}
}
}
}
public static String FourierTransform2D_toString(final FourierTransform2D X10_TEMP0) {
final String X10_TEMP1 = ("FourierTransform: xbits = ");
final int X10_TEMP2 = (X10_TEMP0.nBits1);
final String X10_TEMP3 = (X10_TEMP1+X10_TEMP2);
final String X10_TEMP4 = (" ybits = ");
final String X10_TEMP5 = (X10_TEMP3+X10_TEMP4);
final int X10_TEMP6 = (X10_TEMP0.nBits2);

final String X10_TEMP8 = (X10_TEMP5+X10_TEMP6);
return X10_TEMP8;
}
public static void runMain() {
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
final LinearESOpenPIC2D X10_TEMP4 = (new LinearESOpenPIC2D());

Program.LinearESOpenPIC2D_run(X10_TEMP4);
Program.Timer_stop(tmr,count);
final String X10_TEMP7 = ("Wall-clock time for plasma: ");
final double X10_TEMP8 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP9 = (X10_TEMP7+X10_TEMP8);
final String X10_TEMP10 = (" secs");

final String X10_TEMP12 = (X10_TEMP9+X10_TEMP10);
System.out.println(X10_TEMP12);
}
public static int _LinearESOpenPIC2D_NUMBER_OF_XBITS_init() {

final int X10_TEMP2 = (2);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_NUMBER_OF_YBITS_init() {

final int X10_TEMP2 = (3);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_XLENGTH_init() {
final int X10_TEMP1 = (1);

final int X10_TEMP3 = (X10_TEMP1<<_LinearESOpenPIC2D_NUMBER_OF_XBITS);
return X10_TEMP3;
}
public static int _LinearESOpenPIC2D_YLENGTH_init() {
final int X10_TEMP1 = (1);

final int X10_TEMP3 = (X10_TEMP1<<_LinearESOpenPIC2D_NUMBER_OF_YBITS);
return X10_TEMP3;
}
public static int _LinearESOpenPIC2D_PARTICLE_XDENSITY_init() {

final int X10_TEMP2 = (4);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_PARTICLE_YDENSITY_init() {

final int X10_TEMP2 = (8);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_NPARTICLES_init() {

final int X10_TEMP2 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY*_LinearESOpenPIC2D_PARTICLE_YDENSITY);
return X10_TEMP2;
}
public static double _LinearESOpenPIC2D_DELTA_TIME_init() {

final double X10_TEMP2 = (0.2000000e+00);
return X10_TEMP2;
}
public static double _LinearESOpenPIC2D_ELECTRON_CHARGE_init() {
final double X10_TEMP1 = (1.0);
final int X10_TEMP2 = 0;

final double X10_TEMP4 = (X10_TEMP2 - X10_TEMP1);
return X10_TEMP4;
}
public static double _LinearESOpenPIC2D_THERMAL_XVELOCITY_init() {

final double X10_TEMP2 = (1.0);
return X10_TEMP2;
}
public static double _LinearESOpenPIC2D_THERMAL_YVELOCITY_init() {

final double X10_TEMP2 = (1.0);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_BOUNDARY_CONDITION_init() {

final int X10_TEMP2 = (2);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_TIME_STEPS_init() {

final int X10_TEMP2 = (325);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_SORT_TIME_init() {

final int X10_TEMP2 = (50);
return X10_TEMP2;
}
public static double _LinearESOpenPIC2D_IMBALANCE_init() {

final double X10_TEMP2 = (0.08);
return X10_TEMP2;
}
public static int _LinearESOpenPIC2D_MOVE_FIELD_TO_DIST_MAX_ROWS_init() {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*_LinearESOpenPIC2D_YLENGTH);
final int X10_TEMP3 = (place.MAX_PLACES);

final int X10_TEMP5 = (X10_TEMP2/X10_TEMP3);
return X10_TEMP5;
}
public static int _LinearESOpenPIC2D_MOVE_PARTICLES_MAX_init() {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*_LinearESOpenPIC2D_NPARTICLES);
final int X10_TEMP3 = (place.MAX_PLACES);

final int X10_TEMP5 = (X10_TEMP2/X10_TEMP3);
return X10_TEMP5;
}
public static int _LinearESOpenPIC2D_MOVE_PARTICLES_MAX_BUFFER_init() {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*_LinearESOpenPIC2D_NPARTICLES);
final int X10_TEMP3 = (place.MAX_PLACES);

final int X10_TEMP5 = (X10_TEMP2/X10_TEMP3);
return X10_TEMP5;
}
public static void LinearESOpenPIC2D_run(final LinearESOpenPIC2D X10_TEMP0) {
final long X10_TEMP3 = (System.currentTimeMillis());
final long X10_TEMP4 = (X10_TEMP3);
X10_TEMP0.totalTime = (X10_TEMP4);
final long X10_TEMP7 = (System.currentTimeMillis());
final long X10_TEMP8 = (X10_TEMP7);
X10_TEMP0.initTime = (X10_TEMP8);
Program.LinearESOpenPIC2D_initialize(X10_TEMP0);
final long X10_TEMP9 = (System.currentTimeMillis());
final long X10_TEMP10 = (X10_TEMP0.initTime);

final long X10_TEMP13 = (X10_TEMP9-X10_TEMP10);
final long X10_TEMP14 = (X10_TEMP13);
X10_TEMP0.initTime = (X10_TEMP14);
final int X10_TEMP18 = (0);
final int X10_TEMP16 = (1);
final int X10_TEMP19 = (_LinearESOpenPIC2D_TIME_STEPS-X10_TEMP16);

final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP18:X10_TEMP19]);
for(point(:rank==1)i:X10_TEMP21) {
final String X10_TEMP23 = ("T = ");
final int X10_TEMP24 = (i[0]);

final String X10_TEMP26 = (X10_TEMP23+X10_TEMP24);
System.out.println(X10_TEMP26);
final double[:rank==2] X10_TEMP28 = (double[:rank==2])(X10_TEMP0.backgroundCharge);

final double[:rank==1] e = (double[:rank==1])(Program.LinearESOpenPIC2D_stepTime(X10_TEMP0,X10_TEMP28));
final int X10_TEMP31 = (i[0]);
final int X10_TEMP32 = (X10_TEMP31%_LinearESOpenPIC2D_SORT_TIME);
final int X10_TEMP33 = (0);

final boolean X10_TEMP35 = X10_TEMP32==X10_TEMP33;
if (X10_TEMP35) {
long time = (System.currentTimeMillis());
final Particle[:rank==1] X10_TEMP40 = (Particle[:rank==1])(X10_TEMP0.particles);
final double[:rank==2] X10_TEMP38 = (double[:rank==2])(X10_TEMP0.backgroundCharge);

final dist(:rank==2) X10_TEMP41 = (dist(:rank==2))(X10_TEMP38.distribution);

Program.LinearESOpenPIC2D_sortParticles(X10_TEMP0,X10_TEMP40,X10_TEMP41);
final long X10_TEMP45 = (X10_TEMP0.moveTime);
final long X10_TEMP42 = (System.currentTimeMillis());

final long X10_TEMP44 = (X10_TEMP42-time);

final long X10_TEMP48 = (X10_TEMP45+X10_TEMP44);
final long X10_TEMP49 = (X10_TEMP48);
X10_TEMP0.moveTime = (X10_TEMP49);
}
final String X10_TEMP52 = ("field, kinetic, total energies = ");
final int X10_TEMP51 = (0);
final double X10_TEMP53 = (e[X10_TEMP51]);
final String X10_TEMP54 = (X10_TEMP52+X10_TEMP53);
final String X10_TEMP55 = (",");
final String X10_TEMP58 = (X10_TEMP54+X10_TEMP55);
final int X10_TEMP57 = (1);
final double X10_TEMP59 = (e[X10_TEMP57]);
final String X10_TEMP60 = (X10_TEMP58+X10_TEMP59);
final String X10_TEMP61 = (",");
final String X10_TEMP64 = (X10_TEMP60+X10_TEMP61);
final int X10_TEMP63 = (2);
final double X10_TEMP65 = (e[X10_TEMP63]);

final String X10_TEMP67 = (X10_TEMP64+X10_TEMP65);
System.out.println(X10_TEMP67);
final int X10_TEMP70 = (i[0]);
final int X10_TEMP69 = (1);
final int X10_TEMP71 = (_LinearESOpenPIC2D_TIME_STEPS-X10_TEMP69);

final boolean X10_TEMP73 = X10_TEMP70==X10_TEMP71;
if (X10_TEMP73) {
final int X10_TEMP76 = (0);
final int X10_TEMP77 = (2);
final region(:rank==1) X10_TEMP78 = (region(:rank==1))([X10_TEMP76:X10_TEMP77]);
final place X10_TEMP79 = (here);

final dist(:rank==1) dRef = (dist(:rank==1))(X10_TEMP78->X10_TEMP79);
final double[:rank==1] ref = (double[:rank==1])(new double[dRef]);
final int X10_TEMP82 = (2);
final boolean X10_TEMP84 = (_LinearESOpenPIC2D_NUMBER_OF_XBITS==X10_TEMP82);
final int X10_TEMP83 = (3);
final boolean X10_TEMP85 = (_LinearESOpenPIC2D_NUMBER_OF_YBITS==X10_TEMP83);
final boolean X10_TEMP87 = (X10_TEMP84&&X10_TEMP85);
final int X10_TEMP86 = (4);
final boolean X10_TEMP88 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY==X10_TEMP86);
final boolean X10_TEMP90 = (X10_TEMP87&&X10_TEMP88);
final int X10_TEMP89 = (8);
final boolean X10_TEMP91 = (_LinearESOpenPIC2D_PARTICLE_YDENSITY==X10_TEMP89);

final boolean X10_TEMP93 = X10_TEMP90&&X10_TEMP91;
if (X10_TEMP93) {
final int X10_TEMP95 = (0);

final double X10_TEMP98 = (0.009936711552799253);
final double X10_TEMP99 = (X10_TEMP98);
ref[X10_TEMP95] = (X10_TEMP99);
final int X10_TEMP101 = (1);

final double X10_TEMP104 = (35.7904959849017);
final double X10_TEMP105 = (X10_TEMP104);
ref[X10_TEMP101] = (X10_TEMP105);
final int X10_TEMP107 = (2);

final double X10_TEMP110 = (35.8004326964545);
final double X10_TEMP111 = (X10_TEMP110);
ref[X10_TEMP107] = (X10_TEMP111);
final String X10_TEMP122 = ("final field energy diff = ");
final int X10_TEMP113 = (0);
final double X10_TEMP116 = (ref[X10_TEMP113]);
final int X10_TEMP115 = (0);
final double X10_TEMP117 = (e[X10_TEMP115]);
final double X10_TEMP119 = (X10_TEMP116-X10_TEMP117);

final double X10_TEMP121 = (Math.abs(X10_TEMP119));

final String X10_TEMP124 = (X10_TEMP122+X10_TEMP121);
System.out.println(X10_TEMP124);
final String X10_TEMP135 = ("final kinetic energy diff = ");
final int X10_TEMP126 = (1);
final double X10_TEMP129 = (ref[X10_TEMP126]);
final int X10_TEMP128 = (1);
final double X10_TEMP130 = (e[X10_TEMP128]);
final double X10_TEMP132 = (X10_TEMP129-X10_TEMP130);

final double X10_TEMP134 = (Math.abs(X10_TEMP132));

final String X10_TEMP137 = (X10_TEMP135+X10_TEMP134);
System.out.println(X10_TEMP137);
final String X10_TEMP148 = ("final final energy diff = ");
final int X10_TEMP139 = (2);
final double X10_TEMP142 = (ref[X10_TEMP139]);
final int X10_TEMP141 = (2);
final double X10_TEMP143 = (e[X10_TEMP141]);
final double X10_TEMP145 = (X10_TEMP142-X10_TEMP143);

final double X10_TEMP147 = (Math.abs(X10_TEMP145));

final String X10_TEMP150 = (X10_TEMP148+X10_TEMP147);
System.out.println(X10_TEMP150);
}
else {
final int X10_TEMP151 = (3);
final boolean X10_TEMP153 = (_LinearESOpenPIC2D_NUMBER_OF_XBITS==X10_TEMP151);
final int X10_TEMP152 = (4);
final boolean X10_TEMP154 = (_LinearESOpenPIC2D_NUMBER_OF_YBITS==X10_TEMP152);
final boolean X10_TEMP156 = (X10_TEMP153&&X10_TEMP154);
final int X10_TEMP155 = (8);
final boolean X10_TEMP157 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY==X10_TEMP155);
final boolean X10_TEMP159 = (X10_TEMP156&&X10_TEMP157);
final int X10_TEMP158 = (16);
final boolean X10_TEMP160 = (_LinearESOpenPIC2D_PARTICLE_YDENSITY==X10_TEMP158);

final boolean X10_TEMP162 = X10_TEMP159&&X10_TEMP160;
if (X10_TEMP162) {
final int X10_TEMP164 = (0);

final double X10_TEMP167 = (1.12911030199718);
final double X10_TEMP168 = (X10_TEMP167);
ref[X10_TEMP164] = (X10_TEMP168);
final int X10_TEMP170 = (1);

final double X10_TEMP173 = (138.01404855563126);
final double X10_TEMP174 = (X10_TEMP173);
ref[X10_TEMP170] = (X10_TEMP174);
final int X10_TEMP176 = (2);

final double X10_TEMP179 = (139.14315885762844);
final double X10_TEMP180 = (X10_TEMP179);
ref[X10_TEMP176] = (X10_TEMP180);
final String X10_TEMP191 = ("final field energy diff = ");
final int X10_TEMP182 = (0);
final double X10_TEMP185 = (ref[X10_TEMP182]);
final int X10_TEMP184 = (0);
final double X10_TEMP186 = (e[X10_TEMP184]);
final double X10_TEMP188 = (X10_TEMP185-X10_TEMP186);

final double X10_TEMP190 = (Math.abs(X10_TEMP188));

final String X10_TEMP193 = (X10_TEMP191+X10_TEMP190);
System.out.println(X10_TEMP193);
final String X10_TEMP204 = ("final kinetic energy diff = ");
final int X10_TEMP195 = (1);
final double X10_TEMP198 = (ref[X10_TEMP195]);
final int X10_TEMP197 = (1);
final double X10_TEMP199 = (e[X10_TEMP197]);
final double X10_TEMP201 = (X10_TEMP198-X10_TEMP199);

final double X10_TEMP203 = (Math.abs(X10_TEMP201));

final String X10_TEMP206 = (X10_TEMP204+X10_TEMP203);
System.out.println(X10_TEMP206);
final String X10_TEMP217 = ("final final energy diff = ");
final int X10_TEMP208 = (2);
final double X10_TEMP211 = (ref[X10_TEMP208]);
final int X10_TEMP210 = (2);
final double X10_TEMP212 = (e[X10_TEMP210]);
final double X10_TEMP214 = (X10_TEMP211-X10_TEMP212);

final double X10_TEMP216 = (Math.abs(X10_TEMP214));

final String X10_TEMP219 = (X10_TEMP217+X10_TEMP216);
System.out.println(X10_TEMP219);
}
else {
final String X10_TEMP221 = ("No reference values availabile");
System.out.println(X10_TEMP221);
}
}
}
}
final long X10_TEMP222 = (System.currentTimeMillis());
final long X10_TEMP223 = (X10_TEMP0.totalTime);

final long X10_TEMP226 = (X10_TEMP222-X10_TEMP223);
final long X10_TEMP227 = (X10_TEMP226);
X10_TEMP0.totalTime = (X10_TEMP227);
final String X10_TEMP228 = ("Total time (ms): ");
final long X10_TEMP229 = (X10_TEMP0.totalTime);

final String X10_TEMP231 = (X10_TEMP228+X10_TEMP229);
System.out.println(X10_TEMP231);
final String X10_TEMP232 = ("Initialization time (ms): ");
final long X10_TEMP233 = (X10_TEMP0.initTime);
final String X10_TEMP234 = (X10_TEMP232+X10_TEMP233);
final String X10_TEMP235 = (" ");
final String X10_TEMP241 = (X10_TEMP234+X10_TEMP235);
final double X10_TEMP236 = (100.0);
final long X10_TEMP237 = (X10_TEMP0.initTime);

final double X10_TEMP239 = (X10_TEMP236*X10_TEMP237);
final long X10_TEMP240 = (X10_TEMP0.totalTime);
final double X10_TEMP242 = (X10_TEMP239/X10_TEMP240);

final String X10_TEMP244 = (X10_TEMP241+X10_TEMP242);
System.out.println(X10_TEMP244);
final String X10_TEMP245 = ("Particle Deposit time (ms): ");
final long X10_TEMP246 = (X10_TEMP0.depositTime);
final String X10_TEMP247 = (X10_TEMP245+X10_TEMP246);
final String X10_TEMP248 = (" ");
final String X10_TEMP254 = (X10_TEMP247+X10_TEMP248);
final double X10_TEMP249 = (100.0);
final long X10_TEMP250 = (X10_TEMP0.depositTime);

final double X10_TEMP252 = (X10_TEMP249*X10_TEMP250);
final long X10_TEMP253 = (X10_TEMP0.totalTime);
final double X10_TEMP255 = (X10_TEMP252/X10_TEMP253);

final String X10_TEMP257 = (X10_TEMP254+X10_TEMP255);
System.out.println(X10_TEMP257);
final String X10_TEMP258 = ("Field Redistribution time (ms): ");
final long X10_TEMP259 = (X10_TEMP0.redistTime);
final String X10_TEMP260 = (X10_TEMP258+X10_TEMP259);
final String X10_TEMP261 = (" ");
final String X10_TEMP267 = (X10_TEMP260+X10_TEMP261);
final double X10_TEMP262 = (100.0);
final long X10_TEMP263 = (X10_TEMP0.redistTime);

final double X10_TEMP265 = (X10_TEMP262*X10_TEMP263);
final long X10_TEMP266 = (X10_TEMP0.totalTime);
final double X10_TEMP268 = (X10_TEMP265/X10_TEMP266);

final String X10_TEMP270 = (X10_TEMP267+X10_TEMP268);
System.out.println(X10_TEMP270);
final String X10_TEMP271 = ("Solver time (ms): ");
final long X10_TEMP272 = (X10_TEMP0.solverTime);
final String X10_TEMP273 = (X10_TEMP271+X10_TEMP272);
final String X10_TEMP274 = (" ");
final String X10_TEMP280 = (X10_TEMP273+X10_TEMP274);
final double X10_TEMP275 = (100.0);
final long X10_TEMP276 = (X10_TEMP0.solverTime);

final double X10_TEMP278 = (X10_TEMP275*X10_TEMP276);
final long X10_TEMP279 = (X10_TEMP0.totalTime);
final double X10_TEMP281 = (X10_TEMP278/X10_TEMP279);

final String X10_TEMP283 = (X10_TEMP280+X10_TEMP281);
System.out.println(X10_TEMP283);
final String X10_TEMP284 = ("Particle Push time (ms): ");
final long X10_TEMP285 = (X10_TEMP0.pushTime);
final String X10_TEMP286 = (X10_TEMP284+X10_TEMP285);
final String X10_TEMP287 = (" ");
final String X10_TEMP293 = (X10_TEMP286+X10_TEMP287);
final double X10_TEMP288 = (100.0);
final long X10_TEMP289 = (X10_TEMP0.pushTime);

final double X10_TEMP291 = (X10_TEMP288*X10_TEMP289);
final long X10_TEMP292 = (X10_TEMP0.totalTime);
final double X10_TEMP294 = (X10_TEMP291/X10_TEMP292);

final String X10_TEMP296 = (X10_TEMP293+X10_TEMP294);
System.out.println(X10_TEMP296);
final String X10_TEMP297 = ("Particle move time (ms): ");
final long X10_TEMP298 = (X10_TEMP0.moveTime);
final String X10_TEMP299 = (X10_TEMP297+X10_TEMP298);
final String X10_TEMP300 = (" ");
final String X10_TEMP306 = (X10_TEMP299+X10_TEMP300);
final double X10_TEMP301 = (100.0);
final long X10_TEMP302 = (X10_TEMP0.moveTime);

final double X10_TEMP304 = (X10_TEMP301*X10_TEMP302);
final long X10_TEMP305 = (X10_TEMP0.totalTime);
final double X10_TEMP307 = (X10_TEMP304/X10_TEMP305);

final String X10_TEMP309 = (X10_TEMP306+X10_TEMP307);
System.out.println(X10_TEMP309);
}
public static void LinearESOpenPIC2D_initialize(final LinearESOpenPIC2D X10_TEMP0) {
final String X10_TEMP2 = ("Init: particle position");
System.out.println(X10_TEMP2);
final double[:rank==2] position = (double[:rank==2])(Program.LinearESOpenPIC2D_genParticlePosition(X10_TEMP0,_LinearESOpenPIC2D_NPARTICLES));
final String X10_TEMP6 = ("Init: particle velocity");
System.out.println(X10_TEMP6);
final double[:rank==2] velocity = (double[:rank==2])(Program.LinearESOpenPIC2D_genParticleVelocity(X10_TEMP0,_LinearESOpenPIC2D_NPARTICLES));
final String X10_TEMP10 = ("Init: particles");
System.out.println(X10_TEMP10);
final Particle[:rank==1] X10_TEMP16 = (Particle[:rank==1])(Program.LinearESOpenPIC2D_genParticles(X10_TEMP0,_LinearESOpenPIC2D_NPARTICLES,position,velocity));
final Particle[:rank==1] X10_TEMP17 = (Particle[:rank==1])(X10_TEMP16);
X10_TEMP0.particles = (X10_TEMP17);
final String X10_TEMP19 = ("Init: initial field distribution");
System.out.println(X10_TEMP19);
final Particle[:rank==1] X10_TEMP21 = (Particle[:rank==1])(X10_TEMP0.particles);

final dist(:rank==2) dField = (dist(:rank==2))(Program.LinearESOpenPIC2D_genInitialDist(X10_TEMP0,X10_TEMP21));
final String X10_TEMP24 = ("Init: initial partical distribution");
System.out.println(X10_TEMP24);
final int[:rank==1] info = (int[:rank==1])(Program.LinearESOpenPIC2D_makeInfoArray(X10_TEMP0));
final Particle[:rank==1] X10_TEMP29 = (Particle[:rank==1])(X10_TEMP0.particles);

final Particle[:rank==1] X10_TEMP32 = (Particle[:rank==1])(Program.LinearESOpenPIC2D_moveParticles(X10_TEMP0,X10_TEMP29,dField,info));
final Particle[:rank==1] X10_TEMP33 = (Particle[:rank==1])(X10_TEMP32);
X10_TEMP0.particles = (X10_TEMP33);
final String X10_TEMP35 = ("Init: background charge");
System.out.println(X10_TEMP35);
final double[:rank==2] X10_TEMP38 = (double[:rank==2])(new double[dField]);
final double[:rank==2] X10_TEMP39 = (double[:rank==2])(X10_TEMP38);
X10_TEMP0.backgroundCharge = (X10_TEMP39);
final double[:rank==2] backgroundGuards = (double[:rank==2])(Program.LinearESOpenPIC2D_makeGuards(X10_TEMP0,dField));
final Particle[:rank==1] X10_TEMP47 = (Particle[:rank==1])(X10_TEMP0.particles);
final double[:rank==2] X10_TEMP48 = (double[:rank==2])(X10_TEMP0.backgroundCharge);
final double X10_TEMP49 = (Math.abs(_LinearESOpenPIC2D_ELECTRON_CHARGE));

Program.LinearESOpenPIC2D_depositCharge(X10_TEMP0,X10_TEMP47,X10_TEMP48,backgroundGuards,X10_TEMP49);
final double[:rank==2] X10_TEMP52 = (double[:rank==2])(X10_TEMP0.backgroundCharge);

Program.LinearESOpenPIC2D_addGuards(X10_TEMP0,X10_TEMP52,backgroundGuards);
}
public static double [:rank==2] LinearESOpenPIC2D_genParticlePosition(final LinearESOpenPIC2D X10_TEMP0, final int np) {
final int X = (0);
final int Y = (1);
final int MAX_PLACES = (place.MAX_PLACES);
final int MAX_ITER = (20);
final double ERROR = (0.0001);
final double BIG = (0.5);
final int X10_TEMP10 = (0);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (np-X10_TEMP8);

final region(:rank==1) X10_TEMP18 = (region(:rank==1))([X10_TEMP10:X10_TEMP11]);
final int X10_TEMP15 = (0);
final int X10_TEMP16 = (1);

final region(:rank==1) X10_TEMP19 = (region(:rank==1))([X10_TEMP15:X10_TEMP16]);

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_distBlockStar2(X10_TEMP18,X10_TEMP19));
final double[:rank==2] result = (double[:rank==2])(new double[dResult]);
final int X10_TEMP23 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY*_LinearESOpenPIC2D_PARTICLE_YDENSITY);

final int particlesPerPlace = (X10_TEMP23/MAX_PLACES);
final int totalParticles = (particlesPerPlace*MAX_PLACES);
final boolean X10_TEMP27 = totalParticles!=_LinearESOpenPIC2D_NPARTICLES;
if (X10_TEMP27) {
final String X10_TEMP28 = ("Particle distribution truncated, ");
final String X10_TEMP29 = ("total particles = ");
final String X10_TEMP30 = (X10_TEMP28+X10_TEMP29);

final String X10_TEMP32 = (X10_TEMP30+totalParticles);
System.err.println(X10_TEMP32);
return result;
}
final int X10_TEMP34 = (2);
final boolean X10_TEMP36 = (_LinearESOpenPIC2D_BOUNDARY_CONDITION==X10_TEMP34);
final int X10_TEMP35 = (3);
final boolean X10_TEMP37 = (_LinearESOpenPIC2D_BOUNDARY_CONDITION==X10_TEMP35);

final boolean X10_TEMP39 = (X10_TEMP36||X10_TEMP37);
final boolean X10_TEMP40 = X10_TEMP39;
double X10_TEMP43 = 0.0;
if(X10_TEMP40){
X10_TEMP43 = 1.0;
}
final double X10_TEMP44 = X10_TEMP43;

final double edgelx = (X10_TEMP44);
final int X10_TEMP45 = (2);

final boolean X10_TEMP47 = (_LinearESOpenPIC2D_BOUNDARY_CONDITION==X10_TEMP45);
final boolean X10_TEMP48 = X10_TEMP47;
double X10_TEMP51 = 0.0;
if(X10_TEMP48){
X10_TEMP51 = 1.0;
}
final double X10_TEMP52 = X10_TEMP51;

final double edgely = (X10_TEMP52);
final double X10_TEMP57 = (0.0);
final double X10_TEMP58 = (0.0);
final double X10_TEMP59 = (0.0);

double tx0 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,edgelx,X10_TEMP57,X10_TEMP58,X10_TEMP59));
final double X10_TEMP65 = (0.0);
final double X10_TEMP66 = (0.0);
final double X10_TEMP67 = (0.0);

double ty0 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,edgely,X10_TEMP65,X10_TEMP66,X10_TEMP67));
final double anx = (_LinearESOpenPIC2D_XLENGTH-edgelx);
final double any = (_LinearESOpenPIC2D_YLENGTH-edgely);
final double X10_TEMP75 = (0.0);
final double X10_TEMP76 = (0.0);
final double X10_TEMP77 = (0.0);
final double X10_TEMP78 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,anx,X10_TEMP75,X10_TEMP76,X10_TEMP77));

final double X10_TEMP80 = (X10_TEMP78-tx0);

final double bnx = (_LinearESOpenPIC2D_PARTICLE_XDENSITY/X10_TEMP80);
final double X10_TEMP86 = (0.0);
final double X10_TEMP87 = (0.0);
final double X10_TEMP88 = (0.0);
final double X10_TEMP89 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,any,X10_TEMP86,X10_TEMP87,X10_TEMP88));

final double X10_TEMP91 = (X10_TEMP89-ty0);

final double bny = (_LinearESOpenPIC2D_PARTICLE_YDENSITY/X10_TEMP91);
final double X10_TEMP93 = (bnx*tx0);
final double X10_TEMP94 = (0.5);

final double x0 = (X10_TEMP93-X10_TEMP94);
final double X10_TEMP96 = (bny*ty0);
final double X10_TEMP97 = (0.5);

final double y0 = (X10_TEMP96-X10_TEMP97);
finish {
final dist(:rank==1) X10_TEMP100 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP100) {
final place X10_TEMP101 = X10_TEMP100.get(pl);
async(X10_TEMP101) {
final int X10_TEMP104 = (0);

final region(:rank==1) rLocal = (region(:rank==1))(Program.X10Util_getLRank2D(dResult,X10_TEMP104));
final int offset = (rLocal.low());
final int X10_TEMP108 = (pl[0]);

final int koff = (particlesPerPlace*X10_TEMP108);
final int noff = (offset);
int kc = (koff/_LinearESOpenPIC2D_PARTICLE_XDENSITY);
double yt0 = (edgely);
final double X10_TEMP123 = (0.5);
final double X10_TEMP117 = (0.0);
final double X10_TEMP118 = (0.0);
final double X10_TEMP119 = (0.0);
final double X10_TEMP120 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,yt0,X10_TEMP117,X10_TEMP118,X10_TEMP119));

final double X10_TEMP122 = (bny*X10_TEMP120);
final double X10_TEMP124 = (X10_TEMP123/X10_TEMP122);

double yt = (yt0+X10_TEMP124);
final int X10_TEMP129 = (0);
final int X10_TEMP127 = (1);
final int X10_TEMP130 = (kc-X10_TEMP127);

final region(:rank==1) X10_TEMP132 = (region(:rank==1))([X10_TEMP129:X10_TEMP130]);
for(point(:rank==1)k:X10_TEMP132) {
final int X10_TEMP134 = (k[0]);
final double X10_TEMP135 = (X10_TEMP134+y0);
final int X10_TEMP136 = (1);

double yn = (X10_TEMP135+X10_TEMP136);
final int X10_TEMP139 = (k[0]);
final int X10_TEMP140 = (0);

final boolean X10_TEMP142 = X10_TEMP139>X10_TEMP140;
if (X10_TEMP142) {
final double X10_TEMP153 = (1.0);
final double X10_TEMP147 = (0.0);
final double X10_TEMP148 = (0.0);
final double X10_TEMP149 = (0.0);
final double X10_TEMP150 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,yt,X10_TEMP147,X10_TEMP148,X10_TEMP149));

final double X10_TEMP152 = (bny*X10_TEMP150);

final double X10_TEMP155 = (X10_TEMP153/X10_TEMP152);

final double X10_TEMP157 = (yt+X10_TEMP155);
yt = (X10_TEMP157);
}
final double X10_TEMP162 = (Program.X10Util_minDouble(yt,any));

final double X10_TEMP164 = (Program.X10Util_maxDouble(edgely,X10_TEMP162));
yt = (X10_TEMP164);
final double X10_TEMP169 = (0.0);
final double X10_TEMP170 = (0.0);
final double X10_TEMP171 = (0.0);
final double X10_TEMP172 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,yt,X10_TEMP169,X10_TEMP170,X10_TEMP171));
final double X10_TEMP173 = (bny*X10_TEMP172);

double f = (X10_TEMP173-yn);
double absf = (Math.abs(f));
int i = (0);
boolean X10_TEMP180 = absf>=ERROR;
while(X10_TEMP180) {
final boolean X10_TEMP182 = absf<BIG;
if (X10_TEMP182) {
final double X10_TEMP187 = (0.0);
final double X10_TEMP188 = (0.0);
final double X10_TEMP189 = (0.0);
final double X10_TEMP190 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,yt,X10_TEMP187,X10_TEMP188,X10_TEMP189));

double fp = (bny*X10_TEMP190);
yt0 = (yt);
final double X10_TEMP194 = (f/fp);

final double X10_TEMP197 = (yt-X10_TEMP194);

final double X10_TEMP199 = (Program.X10Util_minDouble(X10_TEMP197,any));

final double X10_TEMP201 = (Program.X10Util_maxDouble(edgely,X10_TEMP199));
yt = (X10_TEMP201);
}
else {
final double X10_TEMP202 = (0.0);

final boolean X10_TEMP204 = f>X10_TEMP202;
if (X10_TEMP204) {
final double X10_TEMP207 = (0.5);
final double X10_TEMP206 = (yt-yt0);

final double X10_TEMP209 = (X10_TEMP207*X10_TEMP206);

final double X10_TEMP211 = (yt0+X10_TEMP209);
yt = (X10_TEMP211);
}
else {
final double X10_TEMP212 = (yt+yt);

final double X10_TEMP214 = (X10_TEMP212-yt0);
yt = (X10_TEMP214);
}
}
final boolean X10_TEMP216 = i>=MAX_ITER;
if (X10_TEMP216) {
final String X10_TEMP218 = ("1: Newton iteration max exceeded");
System.err.println(X10_TEMP218);
break;
}
else {
final double X10_TEMP223 = (0.0);
final double X10_TEMP224 = (0.0);
final double X10_TEMP225 = (0.0);
final double X10_TEMP226 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,yt,X10_TEMP223,X10_TEMP224,X10_TEMP225));
final double X10_TEMP227 = (bny*X10_TEMP226);

final double X10_TEMP229 = (X10_TEMP227-yn);
f = (X10_TEMP229);
final double X10_TEMP232 = (Math.abs(f));
absf = (X10_TEMP232);
}
final int X10_TEMP233 = (i);
final int X10_TEMP234 = 1;
i = i + X10_TEMP234;

X10_TEMP180 = absf>=ERROR;
}
yt0 = (yt);
}
final int X10_TEMP236 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY*kc);

int jc = (koff-X10_TEMP236);
double xt0 = (edgelx);
final double X10_TEMP249 = (0.5);
final double X10_TEMP243 = (0.0);
final double X10_TEMP244 = (0.0);
final double X10_TEMP245 = (0.0);
final double X10_TEMP246 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt0,X10_TEMP243,X10_TEMP244,X10_TEMP245));

final double X10_TEMP248 = (bnx*X10_TEMP246);
final double X10_TEMP250 = (X10_TEMP249/X10_TEMP248);

double xt = (xt0+X10_TEMP250);
final int X10_TEMP255 = (0);
final int X10_TEMP253 = (1);
final int X10_TEMP256 = (jc-X10_TEMP253);

final region(:rank==1) X10_TEMP258 = (region(:rank==1))([X10_TEMP255:X10_TEMP256]);
for(point(:rank==1)j:X10_TEMP258) {
final int X10_TEMP260 = (j[0]);
final double X10_TEMP261 = (X10_TEMP260+x0);
final int X10_TEMP262 = (1);

double xn = (X10_TEMP261+X10_TEMP262);
final int X10_TEMP265 = (j[0]);
final int X10_TEMP266 = (0);

final boolean X10_TEMP268 = X10_TEMP265>X10_TEMP266;
if (X10_TEMP268) {
final double X10_TEMP279 = (1.0);
final double X10_TEMP273 = (0.0);
final double X10_TEMP274 = (0.0);
final double X10_TEMP275 = (0.0);
final double X10_TEMP276 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt,X10_TEMP273,X10_TEMP274,X10_TEMP275));

final double X10_TEMP278 = (bnx*X10_TEMP276);

final double X10_TEMP281 = (X10_TEMP279/X10_TEMP278);

final double X10_TEMP283 = (xt+X10_TEMP281);
xt = (X10_TEMP283);
}
final double X10_TEMP288 = (Program.X10Util_minDouble(xt,anx));

final double X10_TEMP290 = (Program.X10Util_maxDouble(edgelx,X10_TEMP288));
xt = (X10_TEMP290);
final double X10_TEMP295 = (0.0);
final double X10_TEMP296 = (0.0);
final double X10_TEMP297 = (0.0);
final double X10_TEMP298 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,xt,X10_TEMP295,X10_TEMP296,X10_TEMP297));
final double X10_TEMP299 = (bnx*X10_TEMP298);

double f = (X10_TEMP299-xn);
double absf = (Math.abs(f));
int i = (0);
boolean X10_TEMP306 = absf>=ERROR;
while(X10_TEMP306) {
final boolean X10_TEMP308 = absf<BIG;
if (X10_TEMP308) {
final double X10_TEMP313 = (0.0);
final double X10_TEMP314 = (0.0);
final double X10_TEMP315 = (0.0);
final double X10_TEMP316 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt,X10_TEMP313,X10_TEMP314,X10_TEMP315));

double fp = (bnx*X10_TEMP316);
xt0 = (xt);
final double X10_TEMP320 = (f/fp);

final double X10_TEMP323 = (xt-X10_TEMP320);

final double X10_TEMP325 = (Program.X10Util_minDouble(X10_TEMP323,anx));

final double X10_TEMP327 = (Program.X10Util_maxDouble(edgelx,X10_TEMP325));
xt = (X10_TEMP327);
}
else {
final double X10_TEMP328 = (0.0);

final boolean X10_TEMP330 = f>X10_TEMP328;
if (X10_TEMP330) {
final double X10_TEMP333 = (0.5);
final double X10_TEMP332 = (xt-xt0);
final double X10_TEMP334 = (X10_TEMP333*X10_TEMP332);

final double X10_TEMP336 = (xt0+X10_TEMP334);
xt = (X10_TEMP336);
}
else {
final double X10_TEMP337 = (xt+xt);

final double X10_TEMP339 = (X10_TEMP337-xt0);
xt = (X10_TEMP339);
}
}
final boolean X10_TEMP341 = i>=MAX_ITER;
if (X10_TEMP341) {
final String X10_TEMP343 = ("2: Newton iteration max exceeded");
System.err.println(X10_TEMP343);
break;
}
else {
final double X10_TEMP348 = (0.0);
final double X10_TEMP349 = (0.0);
final double X10_TEMP350 = (0.0);
final double X10_TEMP351 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,xt,X10_TEMP348,X10_TEMP349,X10_TEMP350));
final double X10_TEMP352 = (bnx*X10_TEMP351);

final double X10_TEMP354 = (X10_TEMP352-xn);
f = (X10_TEMP354);
final double X10_TEMP357 = (Math.abs(f));
absf = (X10_TEMP357);
}
final int X10_TEMP358 = (i);
final int X10_TEMP359 = 1;
i = i + X10_TEMP359;

X10_TEMP306 = absf>=ERROR;
}
xt0 = (xt);
}
final int X10_TEMP361 = (kc);
final int X10_TEMP362 = 1;
kc = kc + X10_TEMP362;

final int X10_TEMP369 = (0);
final int X10_TEMP366 = (Program.X10Util_minInt(particlesPerPlace,_LinearESOpenPIC2D_PARTICLE_XDENSITY));
final int X10_TEMP367 = (1);
final int X10_TEMP370 = (X10_TEMP366-X10_TEMP367);

final region(:rank==1) X10_TEMP372 = (region(:rank==1))([X10_TEMP369:X10_TEMP370]);
for(point(:rank==1)[n]:X10_TEMP372) {
int nn = (n+koff);
int k = (nn/_LinearESOpenPIC2D_PARTICLE_XDENSITY);
int j = (nn%_LinearESOpenPIC2D_PARTICLE_XDENSITY);
final double X10_TEMP376 = (j+x0);
final int X10_TEMP377 = (1);

double xn = (X10_TEMP376+X10_TEMP377);
final int X10_TEMP379 = (0);

final boolean X10_TEMP381 = j==X10_TEMP379;
if (X10_TEMP381) {
xt0 = (edgelx);
final double X10_TEMP393 = (0.5);
final double X10_TEMP387 = (0.0);
final double X10_TEMP388 = (0.0);
final double X10_TEMP389 = (0.0);
final double X10_TEMP390 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt0,X10_TEMP387,X10_TEMP388,X10_TEMP389));

final double X10_TEMP392 = (bnx*X10_TEMP390);
final double X10_TEMP394 = (X10_TEMP393/X10_TEMP392);

final double X10_TEMP396 = (xt0+X10_TEMP394);
xt = (X10_TEMP396);
}
else {
final double X10_TEMP407 = (1.0);
final double X10_TEMP401 = (0.0);
final double X10_TEMP402 = (0.0);
final double X10_TEMP403 = (0.0);
final double X10_TEMP404 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt,X10_TEMP401,X10_TEMP402,X10_TEMP403));

final double X10_TEMP406 = (bnx*X10_TEMP404);

final double X10_TEMP409 = (X10_TEMP407/X10_TEMP406);

final double X10_TEMP411 = (xt+X10_TEMP409);
xt = (X10_TEMP411);
}
final double X10_TEMP416 = (Program.X10Util_minDouble(xt,anx));

final double X10_TEMP418 = (Program.X10Util_maxDouble(edgelx,X10_TEMP416));
xt = (X10_TEMP418);
final double X10_TEMP423 = (0.0);
final double X10_TEMP424 = (0.0);
final double X10_TEMP425 = (0.0);
final double X10_TEMP426 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,xt0,X10_TEMP423,X10_TEMP424,X10_TEMP425));
final double X10_TEMP427 = (bnx*X10_TEMP426);

double f = (X10_TEMP427-xn);
double absf = (Math.abs(f));
int i = (0);
boolean X10_TEMP434 = absf>=ERROR;
while(X10_TEMP434) {
final boolean X10_TEMP436 = absf<BIG;
if (X10_TEMP436) {
final double X10_TEMP441 = (0.0);
final double X10_TEMP442 = (0.0);
final double X10_TEMP443 = (0.0);
final double X10_TEMP444 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,xt,X10_TEMP441,X10_TEMP442,X10_TEMP443));

double fp = (bnx*X10_TEMP444);
xt0 = (xt);
final double X10_TEMP448 = (f/fp);

final double X10_TEMP451 = (xt-X10_TEMP448);

final double X10_TEMP453 = (Program.X10Util_minDouble(X10_TEMP451,anx));

final double X10_TEMP455 = (Program.X10Util_maxDouble(edgelx,X10_TEMP453));
xt = (X10_TEMP455);
}
else {
final double X10_TEMP456 = (0.0);

final boolean X10_TEMP458 = f>X10_TEMP456;
if (X10_TEMP458) {
final double X10_TEMP461 = (0.5);
final double X10_TEMP460 = (xt-xt0);
final double X10_TEMP462 = (X10_TEMP461*X10_TEMP460);

final double X10_TEMP464 = (xt0+X10_TEMP462);
xt = (X10_TEMP464);
}
else {
final double X10_TEMP465 = (xt+xt);

final double X10_TEMP467 = (X10_TEMP465-xt0);
xt = (X10_TEMP467);
}
}
final boolean X10_TEMP469 = i>=MAX_ITER;
if (X10_TEMP469) {
final String X10_TEMP471 = ("3: Newton iteration max exceeded");
System.err.println(X10_TEMP471);
break;
}
else {
final double X10_TEMP476 = (0.0);
final double X10_TEMP477 = (0.0);
final double X10_TEMP478 = (0.0);
final double X10_TEMP479 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,xt,X10_TEMP476,X10_TEMP477,X10_TEMP478));
final double X10_TEMP480 = (bnx*X10_TEMP479);

final double X10_TEMP482 = (X10_TEMP480-xn);
f = (X10_TEMP482);
final double X10_TEMP485 = (Math.abs(f));
absf = (X10_TEMP485);
}
final int X10_TEMP486 = (i);
final int X10_TEMP487 = 1;
i = i + X10_TEMP487;

X10_TEMP434 = absf>=ERROR;
}
final int X10_TEMP490 = (n+noff);

final double X10_TEMP493 = (xt);
result[X10_TEMP490,X] = (X10_TEMP493);
}
final int X10_TEMP497 = (0);
final int X10_TEMP495 = (1);
final int X10_TEMP498 = (particlesPerPlace-X10_TEMP495);

final region(:rank==1) X10_TEMP500 = (region(:rank==1))([X10_TEMP497:X10_TEMP498]);
for(point(:rank==1)[n]:X10_TEMP500) {
int nn = (n+koff);
final int X10_TEMP502 = (nn/_LinearESOpenPIC2D_PARTICLE_XDENSITY);
final int X10_TEMP503 = (1);

int k = (X10_TEMP502+X10_TEMP503);
final int X10_TEMP505 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY*k);

int j = (nn-X10_TEMP505);
final int X10_TEMP508 = (n%_LinearESOpenPIC2D_PARTICLE_XDENSITY);
nn = (X10_TEMP508);
final boolean X10_TEMP510 = k==kc;
if (X10_TEMP510) {
double yn = (k+y0);
final int X10_TEMP512 = (1);

final boolean X10_TEMP514 = k>X10_TEMP512;
if (X10_TEMP514) {
final double X10_TEMP525 = (1.0);
final double X10_TEMP519 = (0.0);
final double X10_TEMP520 = (0.0);
final double X10_TEMP521 = (0.0);
final double X10_TEMP522 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,yt,X10_TEMP519,X10_TEMP520,X10_TEMP521));

final double X10_TEMP524 = (bny*X10_TEMP522);

final double X10_TEMP527 = (X10_TEMP525/X10_TEMP524);

final double X10_TEMP529 = (yt+X10_TEMP527);
yt = (X10_TEMP529);
}
final double X10_TEMP534 = (Program.X10Util_minDouble(yt,any));

final double X10_TEMP536 = (Program.X10Util_maxDouble(edgelx,X10_TEMP534));
yt = (X10_TEMP536);
final double X10_TEMP541 = (0.0);
final double X10_TEMP542 = (0.0);
final double X10_TEMP543 = (0.0);
final double X10_TEMP544 = (Program.LinearESOpenPIC2D_linearDensityIntegral(X10_TEMP0,yt,X10_TEMP541,X10_TEMP542,X10_TEMP543));
final double X10_TEMP545 = (bny*X10_TEMP544);

double f = (X10_TEMP545-yn);
double absf = (Math.abs(f));
int i = (0);
boolean X10_TEMP552 = absf>=ERROR;
while(X10_TEMP552) {
final boolean X10_TEMP554 = absf<BIG;
if (X10_TEMP554) {
final double X10_TEMP559 = (0.0);
final double X10_TEMP560 = (0.0);
final double X10_TEMP561 = (0.0);
final double X10_TEMP562 = (Program.LinearESOpenPIC2D_linearDensityFn(X10_TEMP0,yt,X10_TEMP559,X10_TEMP560,X10_TEMP561));

double fp = (bny*X10_TEMP562);
yt0 = (yt);
final double X10_TEMP566 = (f/fp);

final double X10_TEMP569 = (yt-X10_TEMP566);

final double X10_TEMP571 = (Program.X10Util_minDouble(X10_TEMP569,any));

final double X10_TEMP573 = (Program.X10Util_maxDouble(edgely,X10_TEMP571));
yt = (X10_TEMP573);
}
else {
final double X10_TEMP574 = (0.0);

final boolean X10_TEMP576 = f>X10_TEMP574;
if (X10_TEMP576) {
final double X10_TEMP579 = (0.5);
final double X10_TEMP578 = (yt-yt0);
final double X10_TEMP580 = (X10_TEMP579*X10_TEMP578);

final double X10_TEMP582 = (yt0+X10_TEMP580);
yt = (X10_TEMP582);
}
else {
final double X10_TEMP583 = (yt+yt);

final double X10_TEMP585 = (X10_TEMP583-yt0);
yt = (X10_TEMP585);
}
}
final boolean X10_TEMP587 = i>=MAX_ITER;
if (X10_TEMP587) {
final String X10_TEMP589 = ("4: Newton iteration max exceeded");
System.err.println(X10_TEMP589);
break;
}
else {
final double X10_TEMP594 = (0.0);
final double X10_TEMP595 = (0.0);
final double X10_TEMP596 = (0.0);
final double X10_TEMP597 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,yt,X10_TEMP594,X10_TEMP595,X10_TEMP596));
final double X10_TEMP598 = (bny*X10_TEMP597);

final double X10_TEMP600 = (X10_TEMP598-yn);
f = (X10_TEMP600);
final double X10_TEMP603 = (Math.abs(f));
absf = (X10_TEMP603);
}
final int X10_TEMP604 = (i);
final int X10_TEMP605 = 1;
i = i + X10_TEMP605;

X10_TEMP552 = absf>=ERROR;
}
final int X10_TEMP606 = (kc);
final int X10_TEMP607 = 1;
kc = kc + X10_TEMP607;

yt0 = (yt);
}
final int X10_TEMP611 = (n+noff);

final int X10_TEMP614 = (nn+noff);

final double X10_TEMP617 = (result[X10_TEMP614,X]);
final double X10_TEMP618 = (X10_TEMP617);
result[X10_TEMP611,X] = (X10_TEMP618);
final int X10_TEMP621 = (n+noff);

final double X10_TEMP624 = (yt);
result[X10_TEMP621,Y] = (X10_TEMP624);
}
}
}
}
return result;
}
public static double [:rank==2] LinearESOpenPIC2D_genParticleVelocity(final LinearESOpenPIC2D X10_TEMP0, final int n) {
final int X = (0);
final int Y = (1);
final int X10_TEMP6 = (0);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (n-X10_TEMP4);

final region(:rank==1) X10_TEMP14 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final int X10_TEMP11 = (0);
final int X10_TEMP12 = (1);

final region(:rank==1) X10_TEMP15 = (region(:rank==1))([X10_TEMP11:X10_TEMP12]);

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_distBlockStar2(X10_TEMP14,X10_TEMP15));
final double[:rank==2] result = (double[:rank==2])(new double[dResult]);
finish {
final int X10_TEMP21 = (0);
final int X10_TEMP19 = (1);
final int X10_TEMP22 = (_LinearESOpenPIC2D_PARTICLE_YDENSITY-X10_TEMP19);

final region(:rank==1) X10_TEMP24 = (region(:rank==1))([X10_TEMP21:X10_TEMP22]);
for(point(:rank==1)[i]:X10_TEMP24) {
final int offset = (_LinearESOpenPIC2D_PARTICLE_XDENSITY*i);
final int X10_TEMP29 = (0);
final int X10_TEMP27 = (1);
final int X10_TEMP30 = (_LinearESOpenPIC2D_PARTICLE_XDENSITY-X10_TEMP27);

final region(:rank==1) X10_TEMP32 = (region(:rank==1))([X10_TEMP29:X10_TEMP30]);
for(point(:rank==1)[j]:X10_TEMP32) {
final int idx = (j+offset);
final Random X10_TEMP34 = (X10_TEMP0.r);
final double X10_TEMP35 = (Program.Random_nextNormal(X10_TEMP34));

final double vx = (_LinearESOpenPIC2D_THERMAL_XVELOCITY*X10_TEMP35);
final Random X10_TEMP37 = (X10_TEMP0.r);
final double X10_TEMP38 = (Program.Random_nextNormal(X10_TEMP37));

final double vy = (_LinearESOpenPIC2D_THERMAL_YVELOCITY*X10_TEMP38);
int X10_TEMP42 = (0);

final place X10_TEMP44 = dResult.get(idx,X10_TEMP42);
async(X10_TEMP44) {
final double X10_TEMP49 = (vx);
result[idx,X] = (X10_TEMP49);
final double X10_TEMP54 = (vy);
result[idx,Y] = (X10_TEMP54);
}
}
}
}
final String X10_TEMP56 = ("Init: correcting drift");
System.out.println(X10_TEMP56);
final dist(:rank==1) X10_TEMP57 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP57);
final int[:rank==1] numParticles = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP60 = (0);
return X10_TEMP60;
}

);
final double[:rank==1] sumX = (double[:rank==1])(new double[dUnique](point(:rank==1)pt) {
final double X10_TEMP63 = (0.0);
return X10_TEMP63;
}

);
final double[:rank==1] sumY = (double[:rank==1])(new double[dUnique](point(:rank==1)pt) {
final double X10_TEMP66 = (0.0);
return X10_TEMP66;
}

);
finish {
final dist(:rank==1) X10_TEMP69 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP69) {
final place X10_TEMP70 = X10_TEMP69.get(pl);
async(X10_TEMP70) {
final int X10_TEMP73 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dResult,X10_TEMP73));
final region(:rank==2) X10_TEMP79 = (region(:rank==2))([rLocal1,X:X]);
for(point(:rank==2)pt:X10_TEMP79) {
final double X10_TEMP83 = (sumX[pl]);
final double X10_TEMP84 = (result[pt]);

final double X10_TEMP87 = (X10_TEMP83+X10_TEMP84);
final double X10_TEMP88 = (X10_TEMP87);
sumX[pl] = (X10_TEMP88);
final int X10_TEMP91 = (numParticles[pl]);
final int X10_TEMP92 = (1);

final int X10_TEMP95 = (X10_TEMP91+X10_TEMP92);
final int X10_TEMP96 = (X10_TEMP95);
numParticles[pl] = (X10_TEMP96);
}
final region(:rank==2) X10_TEMP101 = (region(:rank==2))([rLocal1,Y:Y]);
for(point(:rank==2)pt:X10_TEMP101) {
final double X10_TEMP105 = (sumY[pl]);
final double X10_TEMP106 = (result[pt]);

final double X10_TEMP109 = (X10_TEMP105+X10_TEMP106);
final double X10_TEMP110 = (X10_TEMP109);
sumY[pl] = (X10_TEMP110);
}
}
}
}
final int totalParticles = (Program.intrefArraySum1(numParticles));
final double X10_TEMP112 = (Program.doublerefArraySum1(sumX));

final double driftX = (X10_TEMP112/totalParticles);
final double X10_TEMP114 = (Program.doublerefArraySum1(sumY));

final double driftY = (X10_TEMP114/totalParticles);
final String X10_TEMP117 = ("Init: updating with drift");
System.out.println(X10_TEMP117);
finish {
final dist(:rank==1) X10_TEMP119 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP119) {
final place X10_TEMP120 = X10_TEMP119.get(pl);
async(X10_TEMP120) {
final int X10_TEMP123 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dResult,X10_TEMP123));
final region(:rank==2) X10_TEMP129 = (region(:rank==2))([rLocal1,X:X]);
final place X10_TEMP130 = here;
for(point(:rank==2)pt:X10_TEMP129) {
async(X10_TEMP130) {
final double X10_TEMP133 = (result[pt]);

final double X10_TEMP136 = (X10_TEMP133-driftX);
final double X10_TEMP137 = (X10_TEMP136);
result[pt] = (X10_TEMP137);
}
}
final region(:rank==2) X10_TEMP142 = (region(:rank==2))([rLocal1,Y:Y]);
final place X10_TEMP143 = here;
for(point(:rank==2)pt:X10_TEMP142) {
async(X10_TEMP143) {
final double X10_TEMP146 = (result[pt]);

final double X10_TEMP149 = (X10_TEMP146-driftY);
final double X10_TEMP150 = (X10_TEMP149);
result[pt] = (X10_TEMP150);
}
}
}
}
}
final boolean X10_TEMP152 = totalParticles!=_LinearESOpenPIC2D_NPARTICLES;
if (X10_TEMP152) {
final String X10_TEMP153 = ("Velocity distribution truncated, number of ");
final String X10_TEMP154 = ("particles = ");
final String X10_TEMP155 = (X10_TEMP153+X10_TEMP154);

final String X10_TEMP157 = (X10_TEMP155+totalParticles);
System.err.println(X10_TEMP157);
}
return result;
}
public static Particle [:rank==1] LinearESOpenPIC2D_genParticles(final LinearESOpenPIC2D X10_TEMP0, final int n, final double [:rank==2] position, final double [:rank==2] velocity) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (n-X10_TEMP2);

final region(:rank==1) X10_TEMP7 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(dist.factory.block(X10_TEMP7));

final dist(:rank==1) dResult = (dist(:rank==1))(X10_TEMP8);
final Particle[:rank==1] X10_TEMP33 = (Particle[:rank==1&&distribution==dResult])(new Particle[dResult](point(:rank==1)[i]) {
final int X10_TEMP12 = (0);

double X10_TEMP26 = (position[i,X10_TEMP12]);
final int X10_TEMP16 = (1);

double X10_TEMP27 = (position[i,X10_TEMP16]);
final int X10_TEMP20 = (0);

double X10_TEMP28 = (velocity[i,X10_TEMP20]);
final int X10_TEMP24 = (1);

double X10_TEMP29 = (velocity[i,X10_TEMP24]);

final Particle X10_TEMP31 = (new Particle(X10_TEMP26,X10_TEMP27,X10_TEMP28,X10_TEMP29));
return X10_TEMP31;
}

);
return X10_TEMP33;
}
public static dist(:rank==2) LinearESOpenPIC2D_genInitialDist(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles) {
final int MAX_PLACES = (place.MAX_PLACES);
final int X10_TEMP2 = (2);

final boolean X10_TEMP4 = (_LinearESOpenPIC2D_BOUNDARY_CONDITION==X10_TEMP2);
final boolean X10_TEMP5 = X10_TEMP4;
double X10_TEMP8 = 0.0;
if(X10_TEMP5){
X10_TEMP8 = 1.0;
}
final double X10_TEMP9 = X10_TEMP8;

final double edgely = (X10_TEMP9);
final double y = (_LinearESOpenPIC2D_YLENGTH);
final double X10_TEMP15 = (0.0);
final double X10_TEMP16 = (0.0);
final double X10_TEMP17 = (0.0);

final double y0 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,edgely,X10_TEMP15,X10_TEMP16,X10_TEMP17));
final double X10_TEMP23 = (y-edgely);
final double X10_TEMP24 = (0.0);
final double X10_TEMP25 = (0.0);
final double X10_TEMP26 = (0.0);
final double X10_TEMP27 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,X10_TEMP23,X10_TEMP24,X10_TEMP25,X10_TEMP26));

final double X10_TEMP29 = (X10_TEMP27-y0);

final double nParticlesAve = (X10_TEMP29/MAX_PLACES);
final dist(:rank==1) X10_TEMP31 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP31);
final region(:rank==1)[:rank==1&&distribution==dUnique] X10_TEMP33 = (region(:rank==1)[:rank==1&&distribution==dUnique])(new region(:rank==1)[dUnique]);

final region(:rank==1)[:rank==1] yRegions = (region(:rank==1)[:rank==1])(X10_TEMP33);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final double X10_TEMP39 = (pl[0]);

final double anpl = (X10_TEMP39*nParticlesAve);
final int X10_TEMP42 = (pl[0]);
final int X10_TEMP43 = (1);

final int X10_TEMP45 = (X10_TEMP42+X10_TEMP43);

final double anpr = (X10_TEMP45*nParticlesAve);
double total = (0.0);
double tmp = (0.0);
double y1 = (edgely);
boolean X10_TEMP50 = false;
do {
tmp = (total);
final double X10_TEMP56 = (0.0);
final double X10_TEMP57 = (0.0);
final double X10_TEMP58 = (0.0);
final double X10_TEMP59 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,y1,X10_TEMP56,X10_TEMP57,X10_TEMP58));

final double X10_TEMP61 = (X10_TEMP59-y0);
total = (X10_TEMP61);
final double X10_TEMP62 = (1.0);

final double X10_TEMP64 = (y1+X10_TEMP62);
y1 = (X10_TEMP64);
final boolean X10_TEMP65 = (total<anpl);
final boolean X10_TEMP66 = (y1<=y);
X10_TEMP50 = X10_TEMP65&&X10_TEMP66;
} while(X10_TEMP50);
final boolean X10_TEMP69 = (total>tmp);
final boolean X10_TEMP70 = X10_TEMP69;
final double X10_TEMP71 = (2.0);

final double X10_TEMP73 = (y1-X10_TEMP71);
final double X10_TEMP75 = (anpl-tmp);
final double X10_TEMP77 = (total-tmp);
final double X10_TEMP78 = (X10_TEMP75/X10_TEMP77);

final double X10_TEMP80 = (X10_TEMP73+X10_TEMP78);
final double X10_TEMP82 = (1.0);

final double X10_TEMP84 = (y1-X10_TEMP82);
double X10_TEMP86 = X10_TEMP84;
if(X10_TEMP70){
X10_TEMP86 = X10_TEMP80;
}
final double X10_TEMP87 = X10_TEMP86;

final double X10_TEMP88 = (X10_TEMP87);

double lb = (X10_TEMP88);
final place X10_TEMP90 = (here);

final boolean X10_TEMP92 = X10_TEMP90.isFirst();
if (X10_TEMP92) {
final double X10_TEMP94 = (0.0);
lb = (X10_TEMP94);
}
boolean X10_TEMP95 = false;
do {
tmp = (total);
final double X10_TEMP101 = (0.0);
final double X10_TEMP102 = (0.0);
final double X10_TEMP103 = (0.0);
final double X10_TEMP104 = (Program.LinearESOpenPIC2D_linearDensityFnIntegral(X10_TEMP0,y1,X10_TEMP101,X10_TEMP102,X10_TEMP103));

final double X10_TEMP106 = (X10_TEMP104-y0);
total = (X10_TEMP106);
final double X10_TEMP107 = (1.0);

final double X10_TEMP109 = (y1+X10_TEMP107);
y1 = (X10_TEMP109);
final boolean X10_TEMP110 = (total<anpr);
final boolean X10_TEMP111 = (y1<=y);
X10_TEMP95 = X10_TEMP110&&X10_TEMP111;
} while(X10_TEMP95);
final double X10_TEMP113 = (2.0);

final double X10_TEMP115 = (y1-X10_TEMP113);
final double X10_TEMP117 = (anpr-tmp);
final double X10_TEMP119 = (total-tmp);
final double X10_TEMP120 = (X10_TEMP117/X10_TEMP119);

double ub = (X10_TEMP115+X10_TEMP120);
final place X10_TEMP122 = (here);

final boolean X10_TEMP124 = X10_TEMP122.isLast();
if (X10_TEMP124) {
ub = (y);
}
final double X10_TEMP127 = (0.5);

final double X10_TEMP129 = (lb+X10_TEMP127);
final int X10_TEMP139 = ((int)X10_TEMP129);
final double X10_TEMP131 = (0.5);

final double X10_TEMP133 = (ub+X10_TEMP131);
final int X10_TEMP134 = ((int)X10_TEMP133);
final int X10_TEMP135 = (1);

final int X10_TEMP137 = (X10_TEMP134-X10_TEMP135);

final region(:rank==1) X10_TEMP142 = (region(:rank==1))([X10_TEMP139:X10_TEMP137]);
final region(:rank==1) X10_TEMP143 = (region(:rank==1))(X10_TEMP142);
yRegions[pl] = (X10_TEMP143);
}
}
}
final place pHere = (here);
final int X10_TEMP148 = (0);
final int X10_TEMP146 = (1);
final int X10_TEMP149 = (MAX_PLACES-X10_TEMP146);
final region(:rank==1) X10_TEMP150 = (region(:rank==1))([X10_TEMP148:X10_TEMP149]);
final place X10_TEMP151 = (here);

final dist(:rank==1) X10_TEMP153 = (dist(:rank==1))(X10_TEMP150->X10_TEMP151);

final dist(:rank==1) dPlace = (dist(:rank==1))(X10_TEMP153);
final region(:rank==1)[:rank==1&&distribution==dPlace] X10_TEMP155 = (region(:rank==1)[:rank==1&&distribution==dPlace])(new region(:rank==1)[dPlace]);

final region(:rank==1)[:rank==1] rBuffer = (region(:rank==1)[:rank==1])(X10_TEMP155);
finish {
final dist(:rank==1) X10_TEMP158 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP158) {
final place X10_TEMP159 = X10_TEMP158.get(pl);
async(X10_TEMP159) {
final region(:rank==1) X10_TEMP161 = (region(:rank==1))(yRegions[pl]);

final region(:rank==1) r = (region(:rank==1))(X10_TEMP161);
async(pHere) {
final region(:rank==1) X10_TEMP167 = (region(:rank==1))(r);
rBuffer[pl] = (X10_TEMP167);
}
}
}
}
final int X10_TEMP168 = 0;
final int X10_TEMP169 = 1;
final int X10_TEMP170 = X10_TEMP168 - X10_TEMP169;
final region(:rank==2) X10_TEMP171 = (region(:rank==2))([X10_TEMP168:X10_TEMP170, X10_TEMP168:X10_TEMP170]);
final place X10_TEMP172 = (here);

final dist(:rank==2) X10_TEMP174 = (dist(:rank==2))(X10_TEMP171->X10_TEMP172);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP174);
final dist(:rank==1) X10_TEMP177 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP177) {
final dist(:rank==1) X10_TEMP178 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP178.get(pl));
final region(:rank==1) X10_TEMP182 = (region(:rank==1))(rBuffer[pl]);

final region(:rank==1) ry = (region(:rank==1))(X10_TEMP182);
final int X10_TEMP187 = (0);
final region(:rank==2) X10_TEMP188 = (region(:rank==2))([ry,X10_TEMP187:_LinearESOpenPIC2D_XLENGTH]);

final dist(:rank==2) X10_TEMP190 = (dist(:rank==2))(X10_TEMP188->p);

final dist(:rank==2) dLocal = (dist(:rank==2))(X10_TEMP190);
final dist(:rank==2) X10_TEMP193 = (dist(:rank==2))(dResult||dLocal);
dResult = (dist(:rank==2))(X10_TEMP193);
}
return dResult;
}
public static double LinearESOpenPIC2D_linearDensityFn(final LinearESOpenPIC2D X10_TEMP0, final double x, final double anlx, final double anxi, final double shift) {
final double X10_TEMP4 = (1.0);
final double X10_TEMP1 = (x*anxi);

final double X10_TEMP3 = (X10_TEMP1-shift);
final double X10_TEMP5 = (anlx*X10_TEMP3);

final double result = (X10_TEMP4+X10_TEMP5);
final double X10_TEMP7 = (0.0);

final boolean X10_TEMP9 = result<X10_TEMP7;
if (X10_TEMP9) {
final String X10_TEMP10 = ("Linear Density Error: result = ");

final String X10_TEMP12 = (X10_TEMP10+result);
System.err.println(X10_TEMP12);
}
return result;
}
public static double LinearESOpenPIC2D_linearDensityFnIntegral(final LinearESOpenPIC2D X10_TEMP0, final double x, final double anlx, final double anxi, final double shift) {
double result = (0.0);
final double X10_TEMP2 = (0.0);

final boolean X10_TEMP4 = anxi==X10_TEMP2;
if (X10_TEMP4) {
result = (x);
}
else {
final double X10_TEMP6 = (0.5);
final double X10_TEMP7 = (X10_TEMP6*anlx);
final double X10_TEMP13 = (X10_TEMP7*x);
final double X10_TEMP9 = (x*anxi);
final double X10_TEMP8 = (2.0);
final double X10_TEMP10 = (X10_TEMP8*shift);

final double X10_TEMP12 = (X10_TEMP9-X10_TEMP10);
final double X10_TEMP14 = (X10_TEMP13*X10_TEMP12);

final double X10_TEMP16 = (x+X10_TEMP14);
result = (X10_TEMP16);
}
final double X10_TEMP17 = (0.0);

final boolean X10_TEMP19 = result<X10_TEMP17;
if (X10_TEMP19) {
final String X10_TEMP20 = ("Linear Density Integral Error: ");
final String X10_TEMP21 = ("result = ");
final String X10_TEMP22 = (X10_TEMP20+X10_TEMP21);

final String X10_TEMP24 = (X10_TEMP22+result);
System.err.println(X10_TEMP24);
}
return result;
}
public static double [:rank==1] LinearESOpenPIC2D_stepTime(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] ionBackground) {
long time1 = (System.currentTimeMillis());
long time2 = (0);
final double CHARGE = (_LinearESOpenPIC2D_ELECTRON_CHARGE);
final dist(:rank==2) dIonBG = (dist(:rank==2))(ionBackground.distribution);
final double[:rank==2] chargeDensityGuards = (double[:rank==2])(Program.LinearESOpenPIC2D_makeGuards(X10_TEMP0,dIonBG));
final double[:rank==2&&distribution==dIonBG] X10_TEMP9 = (double[:rank==2&&distribution==dIonBG])(new double[dIonBG](point(:rank==2)pt) {
final double X10_TEMP8 = (0.0);
return X10_TEMP8;
}

);

final double[:rank==2] chargeDensity = (double[:rank==2])(X10_TEMP9);
final Particle[:rank==1] X10_TEMP15 = (Particle[:rank==1])(X10_TEMP0.particles);

Program.LinearESOpenPIC2D_depositCharge(X10_TEMP0,X10_TEMP15,chargeDensity,chargeDensityGuards,CHARGE);
finish {
for(point(:rank==2)pt:dIonBG) {
final place X10_TEMP17 = dIonBG.get(pt);
async(X10_TEMP17) {
final double X10_TEMP21 = (chargeDensity[pt]);
final double X10_TEMP22 = (ionBackground[pt]);

final double X10_TEMP25 = (X10_TEMP21+X10_TEMP22);
final double X10_TEMP26 = (X10_TEMP25);
chargeDensity[pt] = (X10_TEMP26);
}
}
}
Program.LinearESOpenPIC2D_addGuards(X10_TEMP0,chargeDensity,chargeDensityGuards);
final long X10_TEMP30 = (System.currentTimeMillis());
time2 = (X10_TEMP30);
final long X10_TEMP33 = (X10_TEMP0.depositTime);
final long X10_TEMP32 = (time2-time1);

final long X10_TEMP36 = (X10_TEMP33+X10_TEMP32);
final long X10_TEMP37 = (X10_TEMP36);
X10_TEMP0.depositTime = (X10_TEMP37);
final dist(:rank==2) dOld = (dist(:rank==2))(chargeDensity.distribution);
final double[:rank==2] uniformChargeDensity = (double[:rank==2])(Program.LinearESOpenPIC2D_moveFieldToUniform(X10_TEMP0,chargeDensity));
final double[:rank==2] X10_TEMP43 = (double[:rank==2])(Program.LinearESOpenPIC2D_doubleDimensions(X10_TEMP0,uniformChargeDensity));

final Complex[:rank==2] complexChargeDensity = (Complex[:rank==2])(Program.ArrayUtil_doubleToComplex(X10_TEMP43));
final long X10_TEMP46 = (System.currentTimeMillis());
time1 = (X10_TEMP46);
final long X10_TEMP49 = (X10_TEMP0.redistTime);
final long X10_TEMP48 = (time1-time2);

final long X10_TEMP52 = (X10_TEMP49+X10_TEMP48);
final long X10_TEMP53 = (X10_TEMP52);
X10_TEMP0.redistTime = (X10_TEMP53);
final PoissonSolver X10_TEMP54 = (X10_TEMP0.solver);

final Complex[:rank==2] complexForceX = (Complex[:rank==2])(Program.PoissonSolver_makeForceArray(X10_TEMP54));
final PoissonSolver X10_TEMP56 = (X10_TEMP0.solver);

final Complex[:rank==2] complexForceY = (Complex[:rank==2])(Program.PoissonSolver_makeForceArray(X10_TEMP56));
final PoissonSolver X10_TEMP58 = (X10_TEMP0.solver);

double we = (Program.PoissonSolver_getForceCharge(X10_TEMP58,complexChargeDensity,complexForceX,complexForceY));
final long X10_TEMP64 = (System.currentTimeMillis());
time2 = (X10_TEMP64);
final long X10_TEMP67 = (X10_TEMP0.solverTime);
final long X10_TEMP66 = (time2-time1);

final long X10_TEMP70 = (X10_TEMP67+X10_TEMP66);
final long X10_TEMP71 = (X10_TEMP70);
X10_TEMP0.solverTime = (X10_TEMP71);
final dist(:rank==2) dChargeDensityGuards = (dist(:rank==2))(chargeDensityGuards.distribution);
final double[:rank==2] gx = (double[:rank==2])(new double[dChargeDensityGuards]);
final double[:rank==2] gy = (double[:rank==2])(new double[dChargeDensityGuards]);
final double[:rank==2] X10_TEMP78 = (double[:rank==2])(Program.ArrayUtil_complexToDouble(complexForceX));

final double[:rank==2] forceX = (double[:rank==2])(Program.LinearESOpenPIC2D_cropField(X10_TEMP0,X10_TEMP78,gx));
final double[:rank==2] X10_TEMP83 = (double[:rank==2])(Program.ArrayUtil_complexToDouble(complexForceY));

final double[:rank==2] forceY = (double[:rank==2])(Program.LinearESOpenPIC2D_cropField(X10_TEMP0,X10_TEMP83,gy));
final double[:rank==2] fcx = (double[:rank==2])(Program.LinearESOpenPIC2D_moveFieldToDist(X10_TEMP0,forceX,dOld));
final double[:rank==2] fcy = (double[:rank==2])(Program.LinearESOpenPIC2D_moveFieldToDist(X10_TEMP0,forceY,dOld));
Program.LinearESOpenPIC2D_loadGuards(X10_TEMP0,fcx,gx);
Program.LinearESOpenPIC2D_loadGuards(X10_TEMP0,fcy,gy);
final long X10_TEMP96 = (System.currentTimeMillis());
time1 = (X10_TEMP96);
final long X10_TEMP99 = (X10_TEMP0.redistTime);
final long X10_TEMP98 = (time1-time2);

final long X10_TEMP102 = (X10_TEMP99+X10_TEMP98);
final long X10_TEMP103 = (X10_TEMP102);
X10_TEMP0.redistTime = (X10_TEMP103);
final Particle[:rank==1] X10_TEMP109 = (Particle[:rank==1])(X10_TEMP0.particles);

double wk = (Program.LinearESOpenPIC2D_pushParticles(X10_TEMP0,X10_TEMP109,fcx,gx,fcy,gy));
final long X10_TEMP112 = (System.currentTimeMillis());
time2 = (X10_TEMP112);
final long X10_TEMP115 = (X10_TEMP0.pushTime);
final long X10_TEMP114 = (time2-time1);

final long X10_TEMP118 = (X10_TEMP115+X10_TEMP114);
final long X10_TEMP119 = (X10_TEMP118);
X10_TEMP0.pushTime = (X10_TEMP119);
final int[:rank==1] info = (int[:rank==1])(Program.LinearESOpenPIC2D_makeInfoArray(X10_TEMP0));
final Particle[:rank==1] X10_TEMP124 = (Particle[:rank==1])(X10_TEMP0.particles);

final Particle[:rank==1] X10_TEMP127 = (Particle[:rank==1])(Program.LinearESOpenPIC2D_moveParticles(X10_TEMP0,X10_TEMP124,dOld,info));
final Particle[:rank==1] X10_TEMP128 = (Particle[:rank==1])(X10_TEMP127);
X10_TEMP0.particles = (X10_TEMP128);
final int X10_TEMP130 = (6);
final int X10_TEMP131 = (info[X10_TEMP130]);

final double X10_TEMP133 = ((double)X10_TEMP131);
final int X10_TEMP134 = (place.MAX_PLACES);

final double particleAve = (X10_TEMP133/X10_TEMP134);
final int X10_TEMP137 = (1);
final double X10_TEMP138 = (info[X10_TEMP137]);

final double X10_TEMP146 = (X10_TEMP138-particleAve);
final int X10_TEMP141 = (2);
final double X10_TEMP142 = (info[X10_TEMP141]);

final double X10_TEMP144 = (X10_TEMP142/particleAve);

final double X10_TEMP147 = (particleAve-X10_TEMP144);

final double balance = (Program.X10Util_maxDouble(X10_TEMP146,X10_TEMP147));
final boolean X10_TEMP150 = balance>_LinearESOpenPIC2D_IMBALANCE;
if (X10_TEMP150) {
final Particle[:rank==1] X10_TEMP153 = (Particle[:rank==1])(X10_TEMP0.particles);

final int[:rank==1] count = (int[:rank==1])(Program.LinearESOpenPIC2D_countParticles(X10_TEMP0,X10_TEMP153,dOld));
final dist(:rank==2) dNew = (dist(:rank==2))(Program.LinearESOpenPIC2D_repartition(X10_TEMP0,count,dOld,particleAve));
final double[:rank==2] X10_TEMP161 = (double[:rank==2])(X10_TEMP0.backgroundCharge);

final double[:rank==2] X10_TEMP164 = (double[:rank==2])(Program.LinearESOpenPIC2D_moveFieldToDist(X10_TEMP0,X10_TEMP161,dNew));
final double[:rank==2] X10_TEMP165 = (double[:rank==2])(X10_TEMP164);
X10_TEMP0.backgroundCharge = (X10_TEMP165);
final Particle[:rank==1] X10_TEMP169 = (Particle[:rank==1])(X10_TEMP0.particles);

final Particle[:rank==1] X10_TEMP172 = (Particle[:rank==1])(Program.LinearESOpenPIC2D_moveParticles(X10_TEMP0,X10_TEMP169,dNew,info));
final Particle[:rank==1] X10_TEMP173 = (Particle[:rank==1])(X10_TEMP172);
X10_TEMP0.particles = (X10_TEMP173);
}
final int X10_TEMP176 = (0);
final int X10_TEMP177 = (2);
final region(:rank==1) X10_TEMP178 = (region(:rank==1))([X10_TEMP176:X10_TEMP177]);
final place X10_TEMP179 = (here);

final dist(:rank==1) X10_TEMP181 = (dist(:rank==1))(X10_TEMP178->X10_TEMP179);

final dist(:rank==1) dResult = (dist(:rank==1))(X10_TEMP181);
final double[:rank==1] result = (double[:rank==1])(new double[dResult]);
final int X10_TEMP185 = (0);

final double X10_TEMP188 = (we);
result[X10_TEMP185] = (X10_TEMP188);
final int X10_TEMP190 = (1);

final double X10_TEMP193 = (wk);
result[X10_TEMP190] = (X10_TEMP193);
final int X10_TEMP195 = (2);

final double X10_TEMP198 = (we+wk);
final double X10_TEMP199 = (X10_TEMP198);
result[X10_TEMP195] = (X10_TEMP199);
final long X10_TEMP201 = (System.currentTimeMillis());
time1 = (X10_TEMP201);
final long X10_TEMP204 = (X10_TEMP0.moveTime);
final long X10_TEMP203 = (time1-time2);

final long X10_TEMP207 = (X10_TEMP204+X10_TEMP203);
final long X10_TEMP208 = (X10_TEMP207);
X10_TEMP0.moveTime = (X10_TEMP208);
return result;
}
public static double LinearESOpenPIC2D_linearDensity(final LinearESOpenPIC2D X10_TEMP0, final double x, final double anlx, final double anxi, final double shift) {
final double X10_TEMP4 = (1.0);
final double X10_TEMP1 = (x*anxi);

final double X10_TEMP3 = (X10_TEMP1-shift);
final double X10_TEMP5 = (anlx*X10_TEMP3);

final double X10_TEMP7 = (X10_TEMP4+X10_TEMP5);
return X10_TEMP7;
}
public static double LinearESOpenPIC2D_linearDensityIntegral(final LinearESOpenPIC2D X10_TEMP0, final double x, final double anlx, final double anxi, final double shift) {
final int X10_TEMP1 = (0);

final boolean X10_TEMP3 = (anxi==X10_TEMP1);
final boolean X10_TEMP4 = X10_TEMP3;
final double X10_TEMP6 = (0.5);
final double X10_TEMP7 = (X10_TEMP6*anlx);
final double X10_TEMP13 = (X10_TEMP7*x);
final double X10_TEMP9 = (x*anxi);
final double X10_TEMP8 = (2.0);
final double X10_TEMP10 = (X10_TEMP8*shift);

final double X10_TEMP12 = (X10_TEMP9-X10_TEMP10);
final double X10_TEMP14 = (X10_TEMP13*X10_TEMP12);
double X10_TEMP16 = x+X10_TEMP14;
if(X10_TEMP4){
X10_TEMP16 = x;
}
final double X10_TEMP17 = X10_TEMP16;

return X10_TEMP17;
}
public static double [:rank==2] LinearESOpenPIC2D_makeGuards(final LinearESOpenPIC2D X10_TEMP0, final dist(:rank==2) dData) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(X10_TEMP4->X10_TEMP5);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final int X10_TEMP17 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getPRank2D(dData,p,X10_TEMP17));
final int X10_TEMP22 = (1);

final region(:rank==1) rLocal2 = (region(:rank==1))(Program.X10Util_getPRank2D(dData,p,X10_TEMP22));
final int ub = (rLocal1.high());
final int X10_TEMP25 = (1);
final int X10_TEMP29 = (ub+X10_TEMP25);
final int X10_TEMP27 = (1);
final int X10_TEMP30 = (ub+X10_TEMP27);
final region(:rank==2) X10_TEMP32 = (region(:rank==2))([X10_TEMP29:X10_TEMP30,rLocal2]);

final dist(:rank==2) X10_TEMP34 = (dist(:rank==2))(X10_TEMP32->p);

final dist(:rank==2) X10_TEMP36 = (dist(:rank==2))(dResult||X10_TEMP34);
dResult = (dist(:rank==2))(X10_TEMP36);
}
final double[:rank==2] X10_TEMP40 = (double[:rank==2])(new double[dResult](point(:rank==2)pt) {
final double X10_TEMP38 = (0.0);
return X10_TEMP38;
}

);
return X10_TEMP40;
}
public static void LinearESOpenPIC2D_depositCharge(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final double [:rank==2] fieldCharge, final double [:rank==2] guards, final double charge) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP2) {
final place X10_TEMP3 = X10_TEMP2.get(pl);
async(X10_TEMP3) {
final dist(:rank==2) dFC = (dist(:rank==2))(fieldCharge.distribution);
final region(:rank==2) rLocalFC = (region(:rank==2))(Program.X10Util_get2DLRegion(dFC));
final dist(:rank==2) dG = (dist(:rank==2))(guards.distribution);
final region(:rank==2) rLocalG = (region(:rank==2))(Program.X10Util_get2DLRegion(dG));
final region(:rank==2) X10_TEMP11 = (region(:rank==2))(rLocalFC||rLocalG);
final place X10_TEMP12 = (here);

final dist(:rank==2) X10_TEMP14 = (dist(:rank==2))(X10_TEMP11->X10_TEMP12);

final dist(:rank==2) dLocal = (dist(:rank==2))(X10_TEMP14);
final double[:rank==2] localCharge = (double[:rank==2])(new double[dLocal](point(:rank==2)pt) {
final double X10_TEMP17 = (0.0);
return X10_TEMP17;
}

);
final dist(:rank==1) X10_TEMP19 = (dist(:rank==1))(particles.distribution);
final place X10_TEMP20 = (here);

final dist(:rank==1) X10_TEMP22 = (dist(:rank==1))(X10_TEMP19|X10_TEMP20);
for(point(:rank==1)pt:X10_TEMP22) {
final Particle p = (particles[pt]);
final double X10_TEMP25 = (Program.Particle_getX(p));

final int x = ((int)X10_TEMP25);
final double X10_TEMP27 = (Program.Particle_getY(p));

final int y = ((int)X10_TEMP27);
final double X10_TEMP29 = (Program.Particle_getX(p));

final double dx = (X10_TEMP29-x);
final double X10_TEMP31 = (Program.Particle_getY(p));

final double dy = (X10_TEMP31-y);
final int X10_TEMP33 = (1);

final int X10_TEMP37 = (y+X10_TEMP33);
final int X10_TEMP35 = (1);

final int X10_TEMP38 = (x+X10_TEMP35);

final int X10_TEMP39 = (1);

final int X10_TEMP43 = (y+X10_TEMP39);
final int X10_TEMP41 = (1);

final int X10_TEMP44 = (x+X10_TEMP41);
final double X10_TEMP48 = (localCharge[X10_TEMP43,X10_TEMP44]);
final double X10_TEMP45 = (charge*dx);

final double X10_TEMP47 = (X10_TEMP45*dy);

final double X10_TEMP51 = (X10_TEMP48+X10_TEMP47);
final double X10_TEMP52 = (X10_TEMP51);
localCharge[X10_TEMP37,X10_TEMP38] = (X10_TEMP52);
final int X10_TEMP53 = (1);

final int X10_TEMP56 = (y+X10_TEMP53);

final int X10_TEMP57 = (1);

final int X10_TEMP60 = (y+X10_TEMP57);
final double X10_TEMP67 = (localCharge[X10_TEMP60,x]);
final double X10_TEMP61 = (1.0);

final double X10_TEMP63 = (X10_TEMP61-dx);
final double X10_TEMP64 = (charge*X10_TEMP63);

final double X10_TEMP66 = (X10_TEMP64*dy);

final double X10_TEMP70 = (X10_TEMP67+X10_TEMP66);
final double X10_TEMP71 = (X10_TEMP70);
localCharge[X10_TEMP56,x] = (X10_TEMP71);
final int X10_TEMP73 = (1);

final int X10_TEMP75 = (x+X10_TEMP73);

final int X10_TEMP77 = (1);

final int X10_TEMP79 = (x+X10_TEMP77);
final double X10_TEMP86 = (localCharge[y,X10_TEMP79]);
final double X10_TEMP83 = (charge*dx);
final double X10_TEMP80 = (1.0);

final double X10_TEMP82 = (X10_TEMP80-dy);

final double X10_TEMP85 = (X10_TEMP83*X10_TEMP82);

final double X10_TEMP89 = (X10_TEMP86+X10_TEMP85);
final double X10_TEMP90 = (X10_TEMP89);
localCharge[y,X10_TEMP75] = (X10_TEMP90);
final double X10_TEMP104 = (localCharge[y,x]);
final double X10_TEMP95 = (1.0);

final double X10_TEMP97 = (X10_TEMP95-dx);
final double X10_TEMP101 = (charge*X10_TEMP97);
final double X10_TEMP98 = (1.0);

final double X10_TEMP100 = (X10_TEMP98-dy);

final double X10_TEMP103 = (X10_TEMP101*X10_TEMP100);

final double X10_TEMP107 = (X10_TEMP104+X10_TEMP103);
final double X10_TEMP108 = (X10_TEMP107);
localCharge[y,x] = (X10_TEMP108);
}
finish {
final dist(:rank==2) X10_TEMP109 = (dist(:rank==2))(fieldCharge.distribution);
final place X10_TEMP110 = (here);

final dist(:rank==2) X10_TEMP112 = (dist(:rank==2))(X10_TEMP109|X10_TEMP110);
final place X10_TEMP113 = here;
for(point(:rank==2)pt:X10_TEMP112) {
async(X10_TEMP113) {
final double X10_TEMP118 = (localCharge[pt]);
final double X10_TEMP119 = (X10_TEMP118);
fieldCharge[pt] = (X10_TEMP119);
}
}
final dist(:rank==2) X10_TEMP120 = (dist(:rank==2))(guards.distribution);
final place X10_TEMP121 = (here);

final dist(:rank==2) X10_TEMP123 = (dist(:rank==2))(X10_TEMP120|X10_TEMP121);
final place X10_TEMP124 = here;
for(point(:rank==2)pt:X10_TEMP123) {
async(X10_TEMP124) {
final double X10_TEMP129 = (localCharge[pt]);
final double X10_TEMP130 = (X10_TEMP129);
guards[pt] = (X10_TEMP130);
}
}
}
}
}
}
}
public static void LinearESOpenPIC2D_addGuards(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data, final double [:rank==2] guards) {
final dist(:rank==2) X10_TEMP1 = (dist(:rank==2))(guards.distribution);

final dist(:rank==2) dGuard = (dist(:rank==2))(X10_TEMP1);
finish {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP4) {
final place X10_TEMP5 = X10_TEMP4.get(pl);
async(X10_TEMP5) {
final dist(:rank==2) dG = (dist(:rank==2))(guards.distribution);
final region(:rank==2) rLocalG = (region(:rank==2))(Program.X10Util_get2DLRegion(dG));
final place X10_TEMP9 = (here);
final boolean X10_TEMP10 = (X10_TEMP9.isLast());

final boolean X10_TEMP12 = !X10_TEMP10;
if (X10_TEMP12) {
final double value[:rank==2] X10_TEMP16 = (double value[:rank==2])(new double value[rLocalG](point(:rank==2)pt) {
final double X10_TEMP15 = (guards[pt]);
return X10_TEMP15;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP16);
finish {
final place X10_TEMP18 = (here);

final place X10_TEMP20 = X10_TEMP18.next();
async(X10_TEMP20) {
final dist(:rank==2) dData = (dist(:rank==2))(data.distribution);
final region(:rank==2) rLocalD = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final int X10_TEMP24 = 0;
final int X10_TEMP25 = 1;
final int X10_TEMP26 = X10_TEMP24 - X10_TEMP25;
final place X10_TEMP27 = here;
region(:rank==2) X10_TEMP28 = [X10_TEMP24:X10_TEMP26, X10_TEMP24:X10_TEMP26];
for(point(:rank==2)X10_TEMP29[X10_TEMP30, X10_TEMP31]:rLocalD) {
	final boolean X10_TEMP32 = rLocalG.contains(X10_TEMP29);
	if(X10_TEMP32) {
		final region(:rank==2) X10_TEMP33 = [X10_TEMP30:X10_TEMP30, X10_TEMP31:X10_TEMP31];
		X10_TEMP28 = X10_TEMP28 || X10_TEMP33;
	}
}
final region(:rank==2) X10_TEMP34 = X10_TEMP28;

final region(:rank==2) X10_TEMP36 = (region(:rank==2))(X10_TEMP34);

final place X10_TEMP38 = here;
for(point(:rank==2)pt:X10_TEMP36) {
async(X10_TEMP38) {
final double X10_TEMP42 = (data[pt]);
final double X10_TEMP43 = (sBuffer[pt]);

final double X10_TEMP46 = (X10_TEMP42+X10_TEMP43);
final double X10_TEMP47 = (X10_TEMP46);
data[pt] = (X10_TEMP47);
}
}
}
}
}
final place X10_TEMP49 = here;
for(point(:rank==2)pt:rLocalG) {
async(X10_TEMP49) {
final double X10_TEMP53 = (0.0);
final double X10_TEMP54 = (X10_TEMP53);
guards[pt] = (X10_TEMP54);
}
}
}
}
}
}
public static double [:rank==2] LinearESOpenPIC2D_doubleDimensions(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data) {
final region(:rank==2) rData = (region(:rank==2))(data.region);
final int X10_TEMP4 = (0);

final region(:rank==1) rData1 = (region(:rank==1))(Program.X10Util_getRank2D(rData,X10_TEMP4));
final int X10_TEMP8 = (1);

final region(:rank==1) rData2 = (region(:rank==1))(Program.X10Util_getRank2D(rData,X10_TEMP8));
final int X10_TEMP16 = (0);
final int X10_TEMP11 = (2);
final int X10_TEMP12 = (rData1.size());
final int X10_TEMP13 = (X10_TEMP11*X10_TEMP12);
final int X10_TEMP14 = (1);
final int X10_TEMP17 = (X10_TEMP13-X10_TEMP14);

final region(:rank==1) X10_TEMP28 = (region(:rank==1))([X10_TEMP16:X10_TEMP17]);
final int X10_TEMP25 = (0);
final int X10_TEMP20 = (2);
final int X10_TEMP21 = (rData2.size());
final int X10_TEMP22 = (X10_TEMP20*X10_TEMP21);
final int X10_TEMP23 = (1);
final int X10_TEMP26 = (X10_TEMP22-X10_TEMP23);

final region(:rank==1) X10_TEMP29 = (region(:rank==1))([X10_TEMP25:X10_TEMP26]);

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_distBlockStar2(X10_TEMP28,X10_TEMP29));
final double[:rank==2] result = (double[:rank==2])(new double[dResult](point(:rank==2)pt) {
final double X10_TEMP32 = (0.0);
return X10_TEMP32;
}

);
finish {
final dist(:rank==1) X10_TEMP35 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP35) {
final place X10_TEMP36 = X10_TEMP35.get(pl);
async(X10_TEMP36) {
final int X10_TEMP38 = (pl[0]);
final int X10_TEMP39 = (2);

final int X10_TEMP41 = (X10_TEMP38/X10_TEMP39);

final place pDst = (place.places(X10_TEMP41));
final dist(:rank==2) dData = (dist(:rank==2))(data.distribution);
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final double value[:rank==2] X10_TEMP49 = (double value[:rank==2])(new double value[rLocal](point(:rank==2)pt) {
final double X10_TEMP48 = (data[pt]);
return X10_TEMP48;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP49);
async(pDst) {
final place X10_TEMP53 = here;
for(point(:rank==2)pt:rLocal) {
async(X10_TEMP53) {
final double X10_TEMP58 = (sBuffer[pt]);
final double X10_TEMP59 = (X10_TEMP58);
result[pt] = (X10_TEMP59);
}
}
}
}
}
}
return result;
}
public static double [:rank==2] LinearESOpenPIC2D_moveFieldToUniform(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data) {
final region(:rank==2) rData = (region(:rank==2))(data.region);
final dist(:rank==2) X10_TEMP5 = (dist(:rank==2))(Program.X10Util_distBlockStar1(rData));

final double[:rank==2] X10_TEMP7 = (double[:rank==2])(Program.LinearESOpenPIC2D_moveFieldToDist(X10_TEMP0,data,X10_TEMP5));
return X10_TEMP7;
}
public static double [:rank==2] LinearESOpenPIC2D_moveFieldToDist(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data, final dist(:rank==2) dDst) {
final int MAX_ROWS = (_LinearESOpenPIC2D_MOVE_FIELD_TO_DIST_MAX_ROWS);
final int MAX_ITER = (0);
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP3);
final region(:rank==2) rData = (region(:rank==2))(data.region);
final int X10_TEMP8 = (0);

final region(:rank==1) rRank1 = (region(:rank==1))(Program.X10Util_getRank2D(rData,X10_TEMP8));
final int X10_TEMP12 = (1);

final region(:rank==1) rRank2t = (region(:rank==1))(Program.X10Util_getRank2D(rData,X10_TEMP12));
final int X10_TEMP18 = (0);
final int X10_TEMP15 = (rRank2t.size());
final int X10_TEMP16 = (1);
final int X10_TEMP19 = (X10_TEMP15-X10_TEMP16);

final region(:rank==1) rRank2 = (region(:rank==1))([X10_TEMP18:X10_TEMP19]);
final int X10_TEMP24 = (0);
final int X10_TEMP22 = (1);
final int X10_TEMP25 = (MAX_ROWS-X10_TEMP22);

final region(:rank==1) rRows = (region(:rank==1))([X10_TEMP24:X10_TEMP25]);
final dist(:rank==2) X10_TEMP31 = (dist(:rank==2))(Program.X10Util_extendDistRank2D(dUnique,rRows));

final dist(:rank==3) dBuffer = (dist(:rank==3))(Program.X10Util_extendDistRank3D(X10_TEMP31,rRank2));
final double[:rank==3] srcBuffer = (double[:rank==3])(new double[dBuffer](point(:rank==3)pt) {
final double X10_TEMP34 = (0.0);
return X10_TEMP34;
}

);
final double[:rank==3] dstBuffer = (double[:rank==3])(new double[dBuffer](point(:rank==3)pt) {
final double X10_TEMP37 = (0.0);
return X10_TEMP37;
}

);
final int[:rank==1] offsets = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP40 = (0);
return X10_TEMP40;
}

);
final int[:rank==1] sizes = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP43 = (0);
return X10_TEMP43;
}

);
final int[:rank==1] inLt = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP46 = (0);
return X10_TEMP46;
}

);
final int[:rank==1] inRt = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP49 = (0);
return X10_TEMP49;
}

);
final int[:rank==1] outLt = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP52 = (0);
return X10_TEMP52;
}

);
final int[:rank==1] outRt = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP55 = (0);
return X10_TEMP55;
}

);
finish {
final dist(:rank==1) X10_TEMP58 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP59[pl]:X10_TEMP58) {
final place X10_TEMP60 = X10_TEMP58.get(X10_TEMP59);
async(X10_TEMP60) {
final dist(:rank==2) dData = (dist(:rank==2))(data.distribution);
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final int X10_TEMP66 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP66));
final int X10_TEMP68 = (rLocal1.size());
final int X10_TEMP69 = (0);
final boolean X10_TEMP70 = (X10_TEMP68==X10_TEMP69);

final boolean X10_TEMP72 = _X10Util_ENABLE_CHECKS&&X10_TEMP70;
if (X10_TEMP72) {
final String X10_TEMP74 = ("Region empty -- should not happen");
throw new RuntimeException(X10_TEMP74);
}
final int offset = (rLocal1.low());
final place X10_TEMP77 = here;
for(point(:rank==2)[i,j]:rLocal) {
async(X10_TEMP77) {
final int X10_TEMP81 = (i-offset);

final double X10_TEMP86 = (data[i,j]);
final double X10_TEMP87 = (X10_TEMP86);
srcBuffer[pl,X10_TEMP81,j] = (X10_TEMP87);
}
}
final int X10_TEMP91 = (rLocal1.size());
final int X10_TEMP92 = (X10_TEMP91);
sizes[pl] = (X10_TEMP92);
final int X10_TEMP96 = (offset);
offsets[pl] = (X10_TEMP96);
}
}
}
int mter = (MAX_ITER);
int iter = (0);
boolean done = (false);
boolean X10_TEMP100 = false;
do {
finish {
final dist(:rank==1) X10_TEMP102 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP102) {
final place X10_TEMP103 = X10_TEMP102.get(pl);
async(X10_TEMP103) {
final region(:rank==2) rLocalD = (region(:rank==2))(Program.X10Util_get2DLRegion(dDst));
final int X10_TEMP108 = (0);

final region(:rank==1) rLocalD1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocalD,X10_TEMP108));
final int X10_TEMP110 = (rLocalD1.size());
final int X10_TEMP111 = (0);
final boolean X10_TEMP112 = (X10_TEMP110==X10_TEMP111);

final boolean X10_TEMP114 = _X10Util_ENABLE_CHECKS&&X10_TEMP112;
if (X10_TEMP114) {
final String X10_TEMP115 = ("Region empty -- ");
final String X10_TEMP116 = ("cannot to move grids");

final String X10_TEMP118 = (X10_TEMP115+X10_TEMP116);
throw new RuntimeException(X10_TEMP118);
}
final int X10_TEMP122 = (0);
final int X10_TEMP123 = (X10_TEMP122);
outLt[pl] = (X10_TEMP123);
final int X10_TEMP127 = (0);
final int X10_TEMP128 = (X10_TEMP127);
outRt[pl] = (X10_TEMP128);
final int lBorder = (rLocalD1.low());
final int X10_TEMP130 = (rLocalD1.high());
final int X10_TEMP131 = (1);

final int rBorder = (X10_TEMP130+X10_TEMP131);
final int X10_TEMP138 = (0);
final int X10_TEMP135 = (sizes[pl]);
final int X10_TEMP136 = (1);
final int X10_TEMP139 = (X10_TEMP135-X10_TEMP136);

final region(:rank==1) X10_TEMP141 = (region(:rank==1))([X10_TEMP138:X10_TEMP139]);
for(point(:rank==1)[i1]:X10_TEMP141) {
final int X10_TEMP143 = (offsets[pl]);

final int i2 = (i1+X10_TEMP143);
final boolean X10_TEMP146 = i2>=rBorder;
if (X10_TEMP146) {
final int X10_TEMP149 = (outRt[pl]);
final int X10_TEMP150 = (1);

final int X10_TEMP153 = (X10_TEMP149+X10_TEMP150);
final int X10_TEMP154 = (X10_TEMP153);
outRt[pl] = (X10_TEMP154);
}
else {
final boolean X10_TEMP156 = i2<lBorder;
if (X10_TEMP156) {
final int X10_TEMP159 = (outLt[pl]);
final int X10_TEMP160 = (1);

final int X10_TEMP163 = (X10_TEMP159+X10_TEMP160);
final int X10_TEMP164 = (X10_TEMP163);
outLt[pl] = (X10_TEMP164);
}
}
}
}
}
}
final int X10_TEMP165 = (iter);
final int X10_TEMP166 = 1;
iter = iter + X10_TEMP166;

final int[:rank==1] pr = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP168 = (0);
return X10_TEMP168;
}

);
final int[:rank==1] ter = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP171 = (0);
return X10_TEMP171;
}

);
finish {
final dist(:rank==1) X10_TEMP174 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP174) {
final place X10_TEMP175 = X10_TEMP174.get(pl);
async(X10_TEMP175) {
final int X10_TEMP179 = (0);
final int X10_TEMP180 = (X10_TEMP179);
inLt[pl] = (X10_TEMP180);
final int X10_TEMP184 = (0);
final int X10_TEMP185 = (X10_TEMP184);
inRt[pl] = (X10_TEMP185);
}
}
}
finish {
final dist(:rank==1) X10_TEMP187 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP188[pl]:X10_TEMP187) {
final place X10_TEMP189 = X10_TEMP187.get(X10_TEMP188);
async(X10_TEMP189) {
final int X10_TEMP191 = (outRt[pl]);
final int X10_TEMP192 = (0);

final boolean X10_TEMP194 = X10_TEMP191>X10_TEMP192;
if (X10_TEMP194) {
final int bsize = (outRt[pl]);
final int X10_TEMP200 = (0);
final int X10_TEMP198 = (1);
final int X10_TEMP201 = (bsize-X10_TEMP198);

final region(:rank==2) rBuffer = (region(:rank==2))([X10_TEMP200:X10_TEMP201,rRank2]);
final double value[:rank==2] X10_TEMP215 = (double value[:rank==2])(new double value[rBuffer](point(:rank==2)[i,j]) {
final int X10_TEMP206 = (sizes[pl]);
final int X10_TEMP208 = (i+X10_TEMP206);
final int X10_TEMP209 = (outRt[pl]);

final int X10_TEMP212 = (X10_TEMP208-X10_TEMP209);

final double X10_TEMP214 = (srcBuffer[pl,X10_TEMP212,j]);
return X10_TEMP214;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP215);
final place X10_TEMP217 = (here);

final place X10_TEMP219 = X10_TEMP217.next();
async(X10_TEMP219) {
final place X10_TEMP221 = here;
for(point(:rank==2)[i,j]:rBuffer) {
async(X10_TEMP221) {
final place X10_TEMP222 = (here);

final int X10_TEMP226 = (X10_TEMP222.id);

final double X10_TEMP231 = (sBuffer[i,j]);
final double X10_TEMP232 = (X10_TEMP231);
dstBuffer[X10_TEMP226,i,j] = (X10_TEMP232);
}
}
final place X10_TEMP233 = (here);

final int X10_TEMP235 = (X10_TEMP233.id);

final int X10_TEMP238 = (bsize);
inLt[X10_TEMP235] = (X10_TEMP238);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP240 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP241[pl]:X10_TEMP240) {
final place X10_TEMP242 = X10_TEMP240.get(X10_TEMP241);
async(X10_TEMP242) {
final int X10_TEMP246 = (sizes[pl]);
final int X10_TEMP247 = (outRt[pl]);

final int X10_TEMP250 = (X10_TEMP246-X10_TEMP247);
final int X10_TEMP251 = (X10_TEMP250);
sizes[pl] = (X10_TEMP251);
final int X10_TEMP255 = (sizes[pl]);
final int X10_TEMP256 = (inLt[pl]);
final int X10_TEMP257 = (X10_TEMP255+X10_TEMP256);

final int X10_TEMP260 = (X10_TEMP257-MAX_ROWS);
final int X10_TEMP261 = (0);

final int X10_TEMP264 = (Program.X10Util_maxInt(X10_TEMP260,X10_TEMP261));
final int X10_TEMP265 = (X10_TEMP264);
outRt[pl] = (X10_TEMP265);
final int X10_TEMP269 = (sizes[pl]);
final int X10_TEMP270 = (outRt[pl]);

final int X10_TEMP273 = (X10_TEMP269-X10_TEMP270);
final int X10_TEMP274 = (X10_TEMP273);
sizes[pl] = (X10_TEMP274);
final int X10_TEMP276 = (outRt[pl]);
final int X10_TEMP277 = (0);

final boolean X10_TEMP279 = X10_TEMP276>X10_TEMP277;
if (X10_TEMP279) {
final int X10_TEMP285 = (pr[pl]);
final int X10_TEMP286 = (outRt[pl]);

final int X10_TEMP289 = (Program.X10Util_maxInt(X10_TEMP285,X10_TEMP286));
final int X10_TEMP290 = (X10_TEMP289);
pr[pl] = (X10_TEMP290);
final int X10_TEMP296 = (outRt[pl]);
final int X10_TEMP294 = (inLt[pl]);

final int X10_TEMP297 = (MAX_ROWS-X10_TEMP294);

final int rsize = (Program.X10Util_minInt(X10_TEMP296,X10_TEMP297));
finish {
final int X10_TEMP302 = (0);
final int X10_TEMP300 = (1);
final int X10_TEMP303 = (rsize-X10_TEMP300);

final region(:rank==2) X10_TEMP306 = (region(:rank==2))([X10_TEMP302:X10_TEMP303,rRank2]);
final place X10_TEMP307 = here;
for(point(:rank==2)[i,j]:X10_TEMP306) {
async(X10_TEMP307) {
final int X10_TEMP309 = (MAX_ROWS-rsize);

final int X10_TEMP312 = (X10_TEMP309+i);

final int X10_TEMP315 = (sizes[pl]);

final int X10_TEMP318 = (X10_TEMP315+i);

final double X10_TEMP321 = (srcBuffer[pl,X10_TEMP318,j]);
final double X10_TEMP322 = (X10_TEMP321);
dstBuffer[pl,X10_TEMP312,j] = (X10_TEMP322);
}
}
}
}
final int X10_TEMP324 = (sizes[pl]);
final int X10_TEMP325 = (0);
final boolean X10_TEMP329 = (X10_TEMP324>X10_TEMP325);
final int X10_TEMP327 = (inLt[pl]);
final int X10_TEMP328 = (0);
final boolean X10_TEMP330 = (X10_TEMP327>X10_TEMP328);

final boolean X10_TEMP332 = X10_TEMP329&&X10_TEMP330;
if (X10_TEMP332) {
final int X10_TEMP336 = (1);
final int X10_TEMP337 = (sizes[pl]);

final region(:rank==1) X10_TEMP339 = (region(:rank==1))([X10_TEMP336:X10_TEMP337]);
for(point(:rank==1)[i1]:X10_TEMP339) {
final int X10_TEMP341 = (sizes[pl]);

final int i2 = (X10_TEMP341-i1);
finish {
final place X10_TEMP344 = here;
for(point(:rank==1)[j]:rRank2) {
async(X10_TEMP344) {
final int X10_TEMP347 = (inLt[pl]);

final int X10_TEMP350 = (i2+X10_TEMP347);

final double X10_TEMP356 = (srcBuffer[pl,i2,j]);
final double X10_TEMP357 = (X10_TEMP356);
srcBuffer[pl,X10_TEMP350,j] = (X10_TEMP357);
}
}
}
}
}
finish {
final int X10_TEMP365 = (0);
final int X10_TEMP362 = (inLt[pl]);
final int X10_TEMP363 = (1);
final int X10_TEMP366 = (X10_TEMP362-X10_TEMP363);

final region(:rank==3) X10_TEMP369 = (region(:rank==3))([pl:pl,X10_TEMP365:X10_TEMP366,rRank2]);
final place X10_TEMP370 = here;
for(point(:rank==3)pt:X10_TEMP369) {
async(X10_TEMP370) {
final double X10_TEMP375 = (dstBuffer[pt]);
final double X10_TEMP376 = (X10_TEMP375);
srcBuffer[pt] = (X10_TEMP376);
}
}
}
final int X10_TEMP380 = (sizes[pl]);
final int X10_TEMP381 = (inLt[pl]);

final int X10_TEMP384 = (X10_TEMP380+X10_TEMP381);
final int X10_TEMP385 = (X10_TEMP384);
sizes[pl] = (X10_TEMP385);
final int X10_TEMP389 = (offsets[pl]);
final int X10_TEMP390 = (inLt[pl]);

final int X10_TEMP393 = (X10_TEMP389-X10_TEMP390);
final int X10_TEMP394 = (X10_TEMP393);
offsets[pl] = (X10_TEMP394);
}
}
}
finish {
final dist(:rank==1) X10_TEMP396 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP397[pl]:X10_TEMP396) {
final place X10_TEMP398 = X10_TEMP396.get(X10_TEMP397);
async(X10_TEMP398) {
final int X10_TEMP400 = (outLt[pl]);
final int X10_TEMP401 = (0);

final boolean X10_TEMP403 = X10_TEMP400>X10_TEMP401;
if (X10_TEMP403) {
final int bsize = (outLt[pl]);
final int X10_TEMP409 = (0);
final int X10_TEMP407 = (1);
final int X10_TEMP410 = (bsize-X10_TEMP407);

final region(:rank==2) rBuffer = (region(:rank==2))([X10_TEMP409:X10_TEMP410,rRank2]);
final double value[:rank==2] X10_TEMP418 = (double value[:rank==2])(new double value[rBuffer](point(:rank==2)[i,j]) {
final double X10_TEMP417 = (srcBuffer[pl,i,j]);
return X10_TEMP417;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP418);
final place X10_TEMP420 = (here);

final place X10_TEMP422 = X10_TEMP420.prev();
async(X10_TEMP422) {
final place X10_TEMP424 = here;
for(point(:rank==2)[i,j]:rBuffer) {
async(X10_TEMP424) {
final place X10_TEMP425 = (here);

final int X10_TEMP429 = (X10_TEMP425.id);

final double X10_TEMP434 = (sBuffer[i,j]);
final double X10_TEMP435 = (X10_TEMP434);
dstBuffer[X10_TEMP429,i,j] = (X10_TEMP435);
}
}
final place X10_TEMP436 = (here);

final int X10_TEMP438 = (X10_TEMP436.id);

final int X10_TEMP441 = (bsize);
inRt[X10_TEMP438] = (X10_TEMP441);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP443 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP444[pl]:X10_TEMP443) {
final place X10_TEMP445 = X10_TEMP443.get(X10_TEMP444);
async(X10_TEMP445) {
final int X10_TEMP449 = (sizes[pl]);
final int X10_TEMP450 = (outLt[pl]);

final int X10_TEMP453 = (X10_TEMP449-X10_TEMP450);
final int X10_TEMP454 = (X10_TEMP453);
sizes[pl] = (X10_TEMP454);
final int X10_TEMP458 = (offsets[pl]);
final int X10_TEMP459 = (outLt[pl]);

final int X10_TEMP462 = (X10_TEMP458+X10_TEMP459);
final int X10_TEMP463 = (X10_TEMP462);
offsets[pl] = (X10_TEMP463);
final int X10_TEMP465 = (sizes[pl]);
final int X10_TEMP466 = (0);
final boolean X10_TEMP470 = (X10_TEMP465>X10_TEMP466);
final int X10_TEMP468 = (outLt[pl]);
final int X10_TEMP469 = (0);
final boolean X10_TEMP471 = (X10_TEMP468>X10_TEMP469);

final boolean X10_TEMP473 = X10_TEMP470&&X10_TEMP471;
if (X10_TEMP473) {
final int X10_TEMP479 = (0);
final int X10_TEMP476 = (sizes[pl]);
final int X10_TEMP477 = (1);
final int X10_TEMP480 = (X10_TEMP476-X10_TEMP477);

final region(:rank==1) X10_TEMP482 = (region(:rank==1))([X10_TEMP479:X10_TEMP480]);
for(point(:rank==1)[i]:X10_TEMP482) {
finish {
final place X10_TEMP484 = here;
for(point(:rank==1)[j]:rRank2) {
async(X10_TEMP484) {
final int X10_TEMP490 = (outLt[pl]);

final int X10_TEMP493 = (i+X10_TEMP490);

final double X10_TEMP496 = (srcBuffer[pl,X10_TEMP493,j]);
final double X10_TEMP497 = (X10_TEMP496);
srcBuffer[pl,i,j] = (X10_TEMP497);
}
}
}
}
}
final int X10_TEMP501 = (sizes[pl]);
final int X10_TEMP502 = (inRt[pl]);
final int X10_TEMP503 = (X10_TEMP501+X10_TEMP502);

final int X10_TEMP506 = (X10_TEMP503-MAX_ROWS);
final int X10_TEMP507 = (0);

final int X10_TEMP510 = (Program.X10Util_maxInt(X10_TEMP506,X10_TEMP507));
final int X10_TEMP511 = (X10_TEMP510);
outLt[pl] = (X10_TEMP511);
final int X10_TEMP513 = (outLt[pl]);
final int X10_TEMP514 = (0);

final boolean X10_TEMP516 = X10_TEMP513>X10_TEMP514;
if (X10_TEMP516) {
final int X10_TEMP522 = (pr[pl]);
final int X10_TEMP523 = (outLt[pl]);

final int X10_TEMP526 = (Program.X10Util_maxInt(X10_TEMP522,X10_TEMP523));
final int X10_TEMP527 = (X10_TEMP526);
pr[pl] = (X10_TEMP527);
final int X10_TEMP531 = (inRt[pl]);
final int X10_TEMP532 = (outLt[pl]);

final int X10_TEMP535 = (X10_TEMP531-X10_TEMP532);
final int X10_TEMP536 = (X10_TEMP535);
inRt[pl] = (X10_TEMP536);
}
else {
final int X10_TEMP538 = (outRt[pl]);
final int X10_TEMP539 = (0);

final boolean X10_TEMP541 = X10_TEMP538>X10_TEMP539;
if (X10_TEMP541) {
}
}
finish {
final int X10_TEMP547 = (0);
final int X10_TEMP544 = (inRt[pl]);
final int X10_TEMP545 = (1);
final int X10_TEMP548 = (X10_TEMP544-X10_TEMP545);

final region(:rank==2) X10_TEMP551 = (region(:rank==2))([X10_TEMP547:X10_TEMP548,rRank2]);
final place X10_TEMP552 = here;
for(point(:rank==2)[i,j]:X10_TEMP551) {
async(X10_TEMP552) {
final int X10_TEMP555 = (sizes[pl]);

final int X10_TEMP558 = (i+X10_TEMP555);

final double X10_TEMP564 = (dstBuffer[pl,i,j]);
final double X10_TEMP565 = (X10_TEMP564);
srcBuffer[pl,X10_TEMP558,j] = (X10_TEMP565);
}
}
}
final int X10_TEMP569 = (sizes[pl]);
final int X10_TEMP570 = (inRt[pl]);

final int X10_TEMP573 = (X10_TEMP569+X10_TEMP570);
final int X10_TEMP574 = (X10_TEMP573);
sizes[pl] = (X10_TEMP574);
final int X10_TEMP577 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dDst,X10_TEMP577));
final int X10_TEMP579 = (rLocal1.size());
final int X10_TEMP580 = (0);
final boolean X10_TEMP581 = (X10_TEMP579==X10_TEMP580);

final boolean X10_TEMP583 = _X10Util_ENABLE_CHECKS&&X10_TEMP581;
if (X10_TEMP583) {
final String X10_TEMP584 = ("Destination distribution ");
final String X10_TEMP585 = ("is empty");

final String X10_TEMP587 = (X10_TEMP584+X10_TEMP585);
throw new RuntimeException(X10_TEMP587);
}
final int rsize = (rLocal1.size());
final int offset = (rLocal1.low());
final int X10_TEMP592 = (sizes[pl]);
final int X10_TEMP594 = (X10_TEMP592-rsize);
final int X10_TEMP599 = (Math.abs(X10_TEMP594));
final int X10_TEMP596 = (offsets[pl]);
final int X10_TEMP598 = (X10_TEMP596-offset);
final int X10_TEMP600 = (Math.abs(X10_TEMP598));

final int X10_TEMP602 = (X10_TEMP599+X10_TEMP600);

final int X10_TEMP605 = (X10_TEMP602);
ter[pl] = (X10_TEMP605);
}
}
}
int ierr = (0);
final boolean X10_TEMP608 = iter<=mter;
if (X10_TEMP608) {
final int X10_TEMP609 = (Program.intrefArrayMax1(pr));
final int X10_TEMP610 = (0);

final boolean X10_TEMP612 = X10_TEMP609!=X10_TEMP610;
if (X10_TEMP612) {
final int X10_TEMP614 = (Program.intrefArrayMax1(pr));
ierr = (X10_TEMP614);
final String X10_TEMP615 = ("Local field overflow error, ");
final String X10_TEMP616 = ("ierr = ");
final String X10_TEMP617 = (X10_TEMP615+X10_TEMP616);

final String X10_TEMP619 = (X10_TEMP617+ierr);
System.err.println(X10_TEMP619);
break;
}
final boolean X10_TEMP621 = iter<mter;
if (X10_TEMP621) {
continue;
}
else {
break;
}
}
final int X10_TEMP622 = (10);

final boolean X10_TEMP624 = iter>X10_TEMP622;
if (X10_TEMP624) {
final String X10_TEMP626 = ("Too many iterations");
throw new RuntimeException(X10_TEMP626);
}
final int X10_TEMP629 = (0);
final int X10_TEMP630 = (1);
final region(:rank==1) X10_TEMP631 = (region(:rank==1))([X10_TEMP629:X10_TEMP630]);
final place X10_TEMP632 = (here);

final dist(:rank==1) dFlags = (dist(:rank==1))(X10_TEMP631->X10_TEMP632);
final int[:rank==1] flags = (int[:rank==1])(new int[dFlags]);
final int X10_TEMP636 = (0);

final int X10_TEMP639 = (Program.intrefArrayMax1(pr));
final int X10_TEMP640 = (X10_TEMP639);
flags[X10_TEMP636] = (X10_TEMP640);
final int X10_TEMP642 = (1);

final int X10_TEMP645 = (Program.intrefArrayMax1(ter));
final int X10_TEMP646 = (X10_TEMP645);
flags[X10_TEMP642] = (X10_TEMP646);
final int X10_TEMP648 = (0);
final int X10_TEMP649 = (flags[X10_TEMP648]);
final int X10_TEMP650 = (0);

final boolean X10_TEMP652 = X10_TEMP649!=X10_TEMP650;
if (X10_TEMP652) {
final int X10_TEMP654 = (0);

final int X10_TEMP656 = (flags[X10_TEMP654]);
ierr = (X10_TEMP656);
final String X10_TEMP657 = ("Global field overflow error, ");
final String X10_TEMP658 = ("ierr = ");
final String X10_TEMP659 = (X10_TEMP657+X10_TEMP658);

final String X10_TEMP661 = (X10_TEMP659+ierr);
System.err.println(X10_TEMP661);
break;
}
final int X10_TEMP663 = (1);
final int X10_TEMP664 = (flags[X10_TEMP663]);
final int X10_TEMP665 = (0);

final boolean X10_TEMP667 = X10_TEMP664!=X10_TEMP665;
if (X10_TEMP667) {
final String X10_TEMP668 = ("Info: fields being passed ");
final String X10_TEMP669 = ("further = ");
final String X10_TEMP672 = (X10_TEMP668+X10_TEMP669);
final int X10_TEMP671 = (1);
final int X10_TEMP673 = (flags[X10_TEMP671]);

final String X10_TEMP675 = (X10_TEMP672+X10_TEMP673);
System.err.println(X10_TEMP675);
}
else {
mter = (iter);
break;
}
X10_TEMP100 = !done;
} while(X10_TEMP100);
final double[:rank==2] result = (double[:rank==2])(new double[dDst]);
finish {
final dist(:rank==1) X10_TEMP680 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP681[pl]:X10_TEMP680) {
final place X10_TEMP682 = X10_TEMP680.get(X10_TEMP681);
async(X10_TEMP682) {
final int X10_TEMP685 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getLRank2D(dDst,X10_TEMP685));
if (_X10Util_ENABLE_CHECKS) {
final int X10_TEMP689 = (sizes[pl]);
final int X10_TEMP690 = (0);

final boolean X10_TEMP692 = X10_TEMP689<=X10_TEMP690;
if (X10_TEMP692) {
final String X10_TEMP693 = ("Cannot make non-existant ");
final String X10_TEMP694 = ("region");

final String X10_TEMP696 = (X10_TEMP693+X10_TEMP694);
throw new RuntimeException(X10_TEMP696);
}
final int X10_TEMP698 = (sizes[pl]);
final int X10_TEMP699 = (rLocal1.size());
final boolean X10_TEMP703 = (X10_TEMP698!=X10_TEMP699);
final int X10_TEMP701 = (offsets[pl]);
final int X10_TEMP702 = (rLocal1.low());
final boolean X10_TEMP704 = (X10_TEMP701!=X10_TEMP702);

final boolean X10_TEMP706 = X10_TEMP703||X10_TEMP704;
if (X10_TEMP706) {
final String X10_TEMP707 = ("Regions don't match result ");
final String X10_TEMP708 = ("dist");

final String X10_TEMP710 = (X10_TEMP707+X10_TEMP708);
throw new RuntimeException(X10_TEMP710);
}
}
final int X10_TEMP716 = (0);
final int X10_TEMP713 = (sizes[pl]);
final int X10_TEMP714 = (1);
final int X10_TEMP717 = (X10_TEMP713-X10_TEMP714);

final region(:rank==2) X10_TEMP720 = (region(:rank==2))([X10_TEMP716:X10_TEMP717,rRank2]);
final place X10_TEMP721 = here;
for(point(:rank==2)[i,j]:X10_TEMP720) {
async(X10_TEMP721) {
final int X10_TEMP723 = (offsets[pl]);

final int X10_TEMP726 = (X10_TEMP723+i);

final double X10_TEMP732 = (srcBuffer[pl,i,j]);
final double X10_TEMP733 = (X10_TEMP732);
result[X10_TEMP726,j] = (X10_TEMP733);
}
}
}
}
}
return result;
}
public static double [:rank==2] LinearESOpenPIC2D_cropField(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data, final double [:rank==2] guards) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (_LinearESOpenPIC2D_YLENGTH-X10_TEMP2);

final region(:rank==1) rRank1 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final int X10_TEMP9 = (0);

final region(:rank==1) rRank2 = (region(:rank==1))([X10_TEMP9:_LinearESOpenPIC2D_XLENGTH]);
final dist(:rank==2) dGuard = (dist(:rank==2))(guards.distribution);
final int X10_TEMP13 = (place.MAX_PLACES);
final int X10_TEMP14 = (1);

final int X10_TEMP16 = (X10_TEMP13-X10_TEMP14);

final place X10_TEMP18 = (place.places(X10_TEMP16));

final region(:rank==2) rGuard = (region(:rank==2))(Program.X10Util_get2DPRegion(dGuard,X10_TEMP18));
final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_distBlockStar2(rRank1,rRank2));
final double[:rank==2] result = (double[:rank==2])(new double[dResult]);
final dist(:rank==1) X10_TEMP25 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP25) {
finish {
final dist(:rank==1) X10_TEMP26 = (dist(:rank==1))(dist.UNIQUE);

final place X10_TEMP29 = X10_TEMP26.get(pl);
async(X10_TEMP29) {
final dist(:rank==2) dData = (dist(:rank==2))(data.distribution);
final region(:rank==2) rLocalS = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final int X10_TEMP35 = (0);

final region(:rank==1) rLocalS1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocalS,X10_TEMP35));
final int X10_TEMP37 = (rLocalS.size());
final int X10_TEMP38 = (0);
final boolean X10_TEMP40 = (X10_TEMP37>X10_TEMP38);
final int X10_TEMP39 = (rLocalS1.low());
final boolean X10_TEMP41 = (X10_TEMP39<_LinearESOpenPIC2D_YLENGTH);

final boolean X10_TEMP43 = X10_TEMP40&&X10_TEMP41;
if (X10_TEMP43) {
final int X10_TEMP45 = (2);
final int X10_TEMP46 = (pl[0]);

final int X10_TEMP48 = (X10_TEMP45*X10_TEMP46);

final place pDst1 = (place.places(X10_TEMP48));
final int X10_TEMP51 = (2);
final int X10_TEMP52 = (pl[0]);
final int X10_TEMP53 = (X10_TEMP51*X10_TEMP52);
final int X10_TEMP54 = (1);

final int X10_TEMP56 = (X10_TEMP53+X10_TEMP54);

final place pDst2 = (place.places(X10_TEMP56));
final double value[:rank==2] X10_TEMP61 = (double value[:rank==2])(new double value[rLocalS](point(:rank==2)pt) {
final double X10_TEMP60 = (data[pt]);
return X10_TEMP60;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP61);
async(pDst1) {
final region(:rank==2) rLocalD = (region(:rank==2))(Program.X10Util_get2DLRegion(dResult));
final place X10_TEMP67 = here;
for(point(:rank==2)pt:rLocalD) {
async(X10_TEMP67) {
final double X10_TEMP72 = (sBuffer[pt]);
final double X10_TEMP73 = (X10_TEMP72);
result[pt] = (X10_TEMP73);
}
}
}
async(pDst2) {
final region(:rank==2) rLocalD = (region(:rank==2))(Program.X10Util_get2DLRegion(dResult));
final place X10_TEMP78 = here;
for(point(:rank==2)pt:rLocalD) {
async(X10_TEMP78) {
final double X10_TEMP83 = (sBuffer[pt]);
final double X10_TEMP84 = (X10_TEMP83);
result[pt] = (X10_TEMP84);
}
}
}
}
final boolean X10_TEMP87 = rLocalS1.contains([_LinearESOpenPIC2D_YLENGTH]);
if (X10_TEMP87) {
final double value[:rank==2] X10_TEMP91 = (double value[:rank==2])(new double value[rGuard](point(:rank==2)pt) {
final double X10_TEMP90 = (data[pt]);
return X10_TEMP90;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP91);
final int X10_TEMP93 = (place.MAX_PLACES);
final int X10_TEMP94 = (1);

final int X10_TEMP96 = (X10_TEMP93-X10_TEMP94);

final place X10_TEMP98 = place.places(X10_TEMP96);
async(X10_TEMP98) {
final place X10_TEMP100 = here;
for(point(:rank==2)pt:rGuard) {
async(X10_TEMP100) {
final double X10_TEMP105 = (sBuffer[pt]);
final double X10_TEMP106 = (X10_TEMP105);
guards[pt] = (X10_TEMP106);
}
}
}
}
}
}
}
return result;
}
public static void LinearESOpenPIC2D_loadGuards(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data, final double [:rank==2] guards) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP2) {
final place X10_TEMP3 = X10_TEMP2.get(pl);
async(X10_TEMP3) {
final place X10_TEMP4 = (here);
final boolean X10_TEMP5 = (X10_TEMP4.isFirst());

final boolean X10_TEMP7 = !X10_TEMP5;
if (X10_TEMP7) {
final dist(:rank==2) dGuard = (dist(:rank==2))(guards.distribution);
final place X10_TEMP10 = (here);

final place X10_TEMP12 = (X10_TEMP10.prev());

final region(:rank==2) rGuard = (region(:rank==2))(Program.X10Util_get2DPRegion(dGuard,X10_TEMP12));
final double value[:rank==2] X10_TEMP17 = (double value[:rank==2])(new double value[rGuard](point(:rank==2)pt) {
final double X10_TEMP16 = (data[pt]);
return X10_TEMP16;
}

);

final double value[:rank==2] sBuffer = (double value[:rank==2])(X10_TEMP17);
final place X10_TEMP19 = (here);

final place X10_TEMP21 = X10_TEMP19.prev();
async(X10_TEMP21) {
final place X10_TEMP23 = here;
for(point(:rank==2)pt:rGuard) {
async(X10_TEMP23) {
final double X10_TEMP28 = (sBuffer[pt]);
final double X10_TEMP29 = (X10_TEMP28);
guards[pt] = (X10_TEMP29);
}
}
}
}
}
}
}
}
public static int [:rank==1] LinearESOpenPIC2D_makeInfoArray(final LinearESOpenPIC2D X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (6);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);

final dist(:rank==1) dInfo = (dist(:rank==1))(X10_TEMP8);
final int[:rank==1] X10_TEMP13 = (int[:rank==1&&distribution==dInfo])(new int[dInfo](point(:rank==1)pt) {
final int X10_TEMP11 = (0);
return X10_TEMP11;
}

);
return X10_TEMP13;
}
public static Particle [:rank==1] LinearESOpenPIC2D_moveParticles(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final dist(:rank==2) dFieldSpace, final int [:rank==1] info) {
final int MAX = (_LinearESOpenPIC2D_MOVE_PARTICLES_MAX);
final int MAX_BUFFER = (_LinearESOpenPIC2D_MOVE_PARTICLES_MAX_BUFFER);
final int ITER_MAX = (20);
final int X10_TEMP7 = (0);
final int X10_TEMP5 = (1);
final int X10_TEMP8 = (MAX-X10_TEMP5);

final region(:rank==1) rPart = (region(:rank==1))([X10_TEMP7:X10_TEMP8]);
final int X10_TEMP13 = (0);
final int X10_TEMP11 = (1);
final int X10_TEMP14 = (MAX_BUFFER-X10_TEMP11);

final region(:rank==1) rBuffer = (region(:rank==1))([X10_TEMP13:X10_TEMP14]);
final dist(:rank==1) X10_TEMP16 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP16);
final dist(:rank==2) dPart = (dist(:rank==2))(Program.X10Util_extendDistRank2D(dUnique,rPart));
final dist(:rank==2) dBuffer = (dist(:rank==2))(Program.X10Util_extendDistRank2D(dUnique,rBuffer));
final Particle[:rank==2] part = (Particle[:rank==2])(new Particle[dPart]);
final Particle[:rank==2] sBufferL = (Particle[:rank==2])(new Particle[dBuffer]);
final Particle[:rank==2] sBufferR = (Particle[:rank==2])(new Particle[dBuffer]);
final Particle[:rank==2] rBufferL = (Particle[:rank==2])(new Particle[dBuffer]);
final Particle[:rank==2] rBufferR = (Particle[:rank==2])(new Particle[dBuffer]);
final int[:rank==1&&distribution==dUnique] inLt = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP30 = (0);
return X10_TEMP30;
}

);
final int[:rank==1&&distribution==dUnique] inRt = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP33 = (0);
return X10_TEMP33;
}

);
final int[:rank==1&&distribution==dUnique] outLt = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP36 = (0);
return X10_TEMP36;
}

);
final int[:rank==1&&distribution==dUnique] outRt = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP39 = (0);
return X10_TEMP39;
}

);
final int[:rank==1&&distribution==dUnique] nPart = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP42 = (0);
return X10_TEMP42;
}

);
int[:rank==1&&distribution==dUnique] nPartOld = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP45 = (0);
return X10_TEMP45;
}

);
final int[:rank==2] holes = (int[:rank==2])(new int[dPart](point(:rank==2)pt) {
final int X10_TEMP48 = (0);
return X10_TEMP48;
}

);
final int X10_TEMP52 = (0);
final int X10_TEMP53 = (3);
final region(:rank==1) X10_TEMP54 = (region(:rank==1))([X10_TEMP52:X10_TEMP53]);
final place X10_TEMP55 = (here);

final dist(:rank==1) dFlags = (dist(:rank==1))(X10_TEMP54->X10_TEMP55);
final int[:rank==1&&distribution==dUnique] nSent = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP58 = (0);
return X10_TEMP58;
}

);
final int[:rank==1] ibflg = (int[:rank==1])(new int[dFlags](point(:rank==1)pt) {
final int X10_TEMP61 = (0);
return X10_TEMP61;
}

);
finish {
final dist(:rank==1) X10_TEMP64 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP65[pl]:X10_TEMP64) {
final place X10_TEMP66 = X10_TEMP64.get(X10_TEMP65);
async(X10_TEMP66) {
final dist(:rank==1) X10_TEMP67 = (dist(:rank==1))(particles.distribution);
final place X10_TEMP68 = (here);

final dist(:rank==1) X10_TEMP70 = (dist(:rank==1))(X10_TEMP67|X10_TEMP68);
final region(:rank==1) X10_TEMP71 = (region(:rank==1))(X10_TEMP70.region);

final region(:rank==1) rLocal = (region(:rank==1))(X10_TEMP71);
final int X10_TEMP73 = (rLocal.size());
final int X10_TEMP74 = (0);

final boolean X10_TEMP76 = X10_TEMP73>X10_TEMP74;
if (X10_TEMP76) {
final int offset = (rLocal.low());
final place X10_TEMP79 = here;
for(point(:rank==1)[i]:rLocal) {
async(X10_TEMP79) {
final int X10_TEMP82 = (i-offset);

final Particle X10_TEMP86 = (particles[i]);
final Particle X10_TEMP87 = (X10_TEMP86);
part[pl,X10_TEMP82] = (X10_TEMP87);
}
}
}
final int X10_TEMP91 = (rLocal.size());
final int X10_TEMP92 = (X10_TEMP91);
nPart[pl] = (X10_TEMP92);
}
}
}
final region(:rank==2) rFieldSpace = (region(:rank==2))(dFieldSpace.region);
final int X10_TEMP96 = (1);
final region(:rank==1) X10_TEMP97 = (region(:rank==1))(Program.X10Util_getRank2D(rFieldSpace,X10_TEMP96));

final double rsize = (X10_TEMP97.size());
int iter = (2);
int nter = (0);
finish {
final int X10_TEMP103 = (0);
final int X10_TEMP104 = (6);

final region(:rank==1) X10_TEMP106 = (region(:rank==1))([X10_TEMP103:X10_TEMP104]);
final place X10_TEMP107 = here;
for(point(:rank==1)pt:X10_TEMP106) {
async(X10_TEMP107) {
final int X10_TEMP111 = (0);
final int X10_TEMP112 = (X10_TEMP111);
info[pt] = (X10_TEMP112);
}
}
}
final int[:rank==1&&distribution==dUnique] X10_TEMP115 = nPartOld;
final int[:rank==1&&distribution==dUnique] X10_TEMP116 = nPart;
final int[:rank==1&&distribution==dUnique] X10_TEMP113 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)X10_TEMP114){
	final int X10_TEMP117 = X10_TEMP115[X10_TEMP114];
	final int X10_TEMP118 = X10_TEMP116[X10_TEMP114];
	final int X10_TEMP119 = X10_TEMP117 + X10_TEMP118;
	return X10_TEMP119;
});

nPartOld = (int[:rank==1&&distribution==dUnique])(X10_TEMP113);
boolean doneInner = (false);
boolean doneOuter = (false);
boolean X10_TEMP123 = false;
do {
int mter = (0);
final int[:rank==1&&distribution==dUnique] overflow = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP126 = (0);
return X10_TEMP126;
}

);
finish {
final dist(:rank==1) X10_TEMP129 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP130[pl]:X10_TEMP129) {
final place X10_TEMP131 = X10_TEMP129.get(X10_TEMP130);
async(X10_TEMP131) {
final place X10_TEMP132 = (here);

final dist(:rank==2) X10_TEMP134 = (dist(:rank==2))(dFieldSpace|X10_TEMP132);
final region(:rank==2) X10_TEMP135 = (region(:rank==2))(X10_TEMP134.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP135);
final int X10_TEMP139 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP139));
final int X10_TEMP141 = (rLocal1.high());
final int X10_TEMP142 = (1);

final double ub = (X10_TEMP141+X10_TEMP142);
final double lb = (rLocal1.low());
final int X10_TEMP148 = (0);
final int X10_TEMP149 = (X10_TEMP148);
outLt[pl] = (X10_TEMP149);
final int X10_TEMP153 = (0);
final int X10_TEMP154 = (X10_TEMP153);
outRt[pl] = (X10_TEMP154);
final int X10_TEMP160 = (0);
final int X10_TEMP157 = (nPart[pl]);
final int X10_TEMP158 = (1);
final int X10_TEMP161 = (X10_TEMP157-X10_TEMP158);

final region(:rank==1) X10_TEMP163 = (region(:rank==1))([X10_TEMP160:X10_TEMP161]);
for(point(:rank==1)[i]:X10_TEMP163) {
final Particle p = (part[pl,i]);
double y = (Program.Particle_getY(p));
final boolean X10_TEMP169 = y<lb;
if (X10_TEMP169) {
final int X10_TEMP171 = (outLt[pl]);
final int X10_TEMP172 = (rBuffer.size());

final boolean X10_TEMP174 = X10_TEMP171<X10_TEMP172;
if (X10_TEMP174) {
final place X10_TEMP175 = (here);

final boolean X10_TEMP177 = X10_TEMP175.isFirst();
if (X10_TEMP177) {
final double X10_TEMP179 = (y+rsize);
y = (X10_TEMP179);
}
final int X10_TEMP183 = (outLt[pl]);

final Particle X10_TEMP187 = (Program.Particle_setY(p,y));
final Particle X10_TEMP188 = (X10_TEMP187);
sBufferL[pl,X10_TEMP183] = (X10_TEMP188);
final int X10_TEMP192 = (outLt[pl]);
final int X10_TEMP193 = (outRt[pl]);

final int X10_TEMP195 = (X10_TEMP192+X10_TEMP193);

final int X10_TEMP198 = (i);
holes[pl,X10_TEMP195] = (X10_TEMP198);
final int X10_TEMP200 = (outLt[pl]);
final int X10_TEMP201 = 1;
final int X10_TEMP202 = (outLt[pl]);
final int X10_TEMP203 = (X10_TEMP202 + X10_TEMP201);
outLt[pl] = (X10_TEMP203);

}
else {
final int X10_TEMP207 = (1);
final int X10_TEMP208 = (X10_TEMP207);
overflow[pl] = (X10_TEMP208);
break;
}
}
else {
final boolean X10_TEMP210 = y>=ub;
if (X10_TEMP210) {
final int X10_TEMP212 = (outRt[pl]);
final int X10_TEMP213 = (rBuffer.size());

final boolean X10_TEMP215 = X10_TEMP212<X10_TEMP213;
if (X10_TEMP215) {
final place X10_TEMP216 = (here);

final boolean X10_TEMP218 = X10_TEMP216.isLast();
if (X10_TEMP218) {
final double X10_TEMP220 = (y-rsize);
y = (X10_TEMP220);
}
final int X10_TEMP224 = (outRt[pl]);

final Particle X10_TEMP228 = (Program.Particle_setY(p,y));
final Particle X10_TEMP229 = (X10_TEMP228);
sBufferR[pl,X10_TEMP224] = (X10_TEMP229);
final int X10_TEMP233 = (outLt[pl]);
final int X10_TEMP234 = (outRt[pl]);

final int X10_TEMP236 = (X10_TEMP233+X10_TEMP234);

final int X10_TEMP239 = (i);
holes[pl,X10_TEMP236] = (X10_TEMP239);
final int X10_TEMP241 = (outRt[pl]);
final int X10_TEMP242 = 1;
final int X10_TEMP243 = (outRt[pl]);
final int X10_TEMP244 = (X10_TEMP243 + X10_TEMP242);
outRt[pl] = (X10_TEMP244);

}
else {
final int X10_TEMP248 = (1);
final int X10_TEMP249 = (X10_TEMP248);
overflow[pl] = (X10_TEMP249);
break;
}
}
}
}
final int X10_TEMP253 = (outLt[pl]);
final int X10_TEMP254 = (outRt[pl]);

final int X10_TEMP257 = (X10_TEMP253+X10_TEMP254);
final int X10_TEMP258 = (X10_TEMP257);
nSent[pl] = (X10_TEMP258);
}
}
}
final int X10_TEMP260 = (2);

final int X10_TEMP263 = (Program.intrefArrayMax1(overflow));
final int X10_TEMP264 = (X10_TEMP263);
ibflg[X10_TEMP260] = (X10_TEMP264);
boolean X10_TEMP265 = false;
do {
final int X10_TEMP266 = (2);

final int X10_TEMP268 = (iter+X10_TEMP266);
iter = (X10_TEMP268);
final int X10_TEMP269 = (1);

final int X10_TEMP271 = (mter+X10_TEMP269);
mter = (X10_TEMP271);
Program.LinearESOpenPIC2D_transferParticles(X10_TEMP0,sBufferL,sBufferR,outLt,outRt,rBufferL,rBufferR,inLt,inRt);
final int[:rank==1] outgoing = (int[:rank==1])(new int[dUnique]);
finish {
final dist(:rank==1) X10_TEMP282 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP283[pl]:X10_TEMP282) {
final place X10_TEMP284 = X10_TEMP282.get(X10_TEMP283);
async(X10_TEMP284) {
final place X10_TEMP285 = (here);

final dist(:rank==2) X10_TEMP287 = (dist(:rank==2))(dFieldSpace|X10_TEMP285);
final region(:rank==2) X10_TEMP288 = (region(:rank==2))(X10_TEMP287.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP288);
final int X10_TEMP292 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP292));
final int X10_TEMP294 = (rLocal1.high());
final int X10_TEMP295 = (1);

final double ub = (X10_TEMP294+X10_TEMP295);
final double lb = (rLocal1.low());
final int X10_TEMP301 = (0);
final int X10_TEMP302 = (X10_TEMP301);
outLt[pl] = (X10_TEMP302);
final int X10_TEMP306 = (0);
final int X10_TEMP307 = (X10_TEMP306);
outRt[pl] = (X10_TEMP307);
int belowLeft = (0);
final int X10_TEMP314 = (0);
final int X10_TEMP311 = (inRt[pl]);
final int X10_TEMP312 = (1);
final int X10_TEMP315 = (X10_TEMP311-X10_TEMP312);

final region(:rank==1) X10_TEMP317 = (region(:rank==1))([X10_TEMP314:X10_TEMP315]);
for(point(:rank==1)[i]:X10_TEMP317) {
final Particle p = (rBufferR[pl,i]);
final double y = (Program.Particle_getY(p));
final boolean X10_TEMP323 = y<lb;
if (X10_TEMP323) {
final int X10_TEMP325 = (outLt[pl]);
final int X10_TEMP326 = 1;
final int X10_TEMP327 = (outLt[pl]);
final int X10_TEMP328 = (X10_TEMP327 + X10_TEMP326);
outLt[pl] = (X10_TEMP328);

}
final boolean X10_TEMP330 = y>=ub;
if (X10_TEMP330) {
final int X10_TEMP332 = (outRt[pl]);
final int X10_TEMP333 = 1;
final int X10_TEMP334 = (outRt[pl]);
final int X10_TEMP335 = (X10_TEMP334 + X10_TEMP333);
outRt[pl] = (X10_TEMP335);

}
}
final int X10_TEMP337 = (outRt[pl]);
final int X10_TEMP338 = (0);

final boolean X10_TEMP340 = X10_TEMP337!=X10_TEMP338;
if (X10_TEMP340) {
final String X10_TEMP342 = ("Info: particles returning up");
System.err.println(X10_TEMP342);
}
final int X10_TEMP348 = (0);
final int X10_TEMP345 = (inLt[pl]);
final int X10_TEMP346 = (1);
final int X10_TEMP349 = (X10_TEMP345-X10_TEMP346);

final region(:rank==1) X10_TEMP351 = (region(:rank==1))([X10_TEMP348:X10_TEMP349]);
for(point(:rank==1)[i]:X10_TEMP351) {
final Particle p = (rBufferL[pl,i]);
final double y = (Program.Particle_getY(p));
final boolean X10_TEMP357 = y>=ub;
if (X10_TEMP357) {
final int X10_TEMP359 = (outRt[pl]);
final int X10_TEMP360 = 1;
final int X10_TEMP361 = (outRt[pl]);
final int X10_TEMP362 = (X10_TEMP361 + X10_TEMP360);
outRt[pl] = (X10_TEMP362);

}
final boolean X10_TEMP364 = y<lb;
if (X10_TEMP364) {
final int X10_TEMP365 = (belowLeft);
final int X10_TEMP366 = 1;
belowLeft = belowLeft + X10_TEMP366;

}
}
final int X10_TEMP367 = (0);

final boolean X10_TEMP369 = belowLeft!=X10_TEMP367;
if (X10_TEMP369) {
final String X10_TEMP371 = ("Info: particles returning down");
System.err.println(X10_TEMP371);
}
final int X10_TEMP374 = (outLt[pl]);

final int X10_TEMP377 = (X10_TEMP374+belowLeft);
final int X10_TEMP378 = (X10_TEMP377);
outLt[pl] = (X10_TEMP378);
final int X10_TEMP382 = (outLt[pl]);
final int X10_TEMP383 = (outRt[pl]);

final int X10_TEMP386 = (X10_TEMP382+X10_TEMP383);
final int X10_TEMP387 = (X10_TEMP386);
outgoing[pl] = (X10_TEMP387);
}
}
}
final int X10_TEMP389 = (1);

final int X10_TEMP392 = (Program.intrefArrayMax1(outgoing));
final int X10_TEMP393 = (X10_TEMP392);
ibflg[X10_TEMP389] = (X10_TEMP393);
final int X10_TEMP395 = (1);
final int X10_TEMP396 = (ibflg[X10_TEMP395]);
final int X10_TEMP397 = (0);

final boolean X10_TEMP399 = X10_TEMP396!=X10_TEMP397;
if (X10_TEMP399) {
finish {
final dist(:rank==1) X10_TEMP401 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP402[pl]:X10_TEMP401) {
final place X10_TEMP403 = X10_TEMP401.get(X10_TEMP402);
async(X10_TEMP403) {
final place X10_TEMP404 = (here);

final dist(:rank==2) X10_TEMP406 = (dist(:rank==2))(dFieldSpace|X10_TEMP404);
final region(:rank==2) X10_TEMP407 = (region(:rank==2))(X10_TEMP406.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP407);
final int X10_TEMP411 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP411));
final int X10_TEMP413 = (rLocal1.high());
final int X10_TEMP414 = (1);

final double ub = (X10_TEMP413+X10_TEMP414);
final double lb = (rLocal1.low());
final int X10_TEMP420 = (0);
final int X10_TEMP421 = (X10_TEMP420);
outLt[pl] = (X10_TEMP421);
final int X10_TEMP425 = (0);
final int X10_TEMP426 = (X10_TEMP425);
outRt[pl] = (X10_TEMP426);
final int X10_TEMP430 = (0);
final int X10_TEMP431 = (X10_TEMP430);
overflow[pl] = (X10_TEMP431);
int inRightStaying = (0);
final int X10_TEMP438 = (0);
final int X10_TEMP435 = (inRt[pl]);
final int X10_TEMP436 = (1);
final int X10_TEMP439 = (X10_TEMP435-X10_TEMP436);

final region(:rank==1) X10_TEMP441 = (region(:rank==1))([X10_TEMP438:X10_TEMP439]);
for(point(:rank==1)[i]:X10_TEMP441) {
final Particle p = (rBufferR[pl,i]);
double y = (Program.Particle_getY(p));
final boolean X10_TEMP447 = y<lb;
if (X10_TEMP447) {
final place X10_TEMP448 = (here);

final boolean X10_TEMP450 = X10_TEMP448.isFirst();
if (X10_TEMP450) {
final double X10_TEMP452 = (y+rsize);
y = (X10_TEMP452);
}
final int X10_TEMP456 = (outLt[pl]);

final Particle X10_TEMP460 = (Program.Particle_setY(p,y));
final Particle X10_TEMP461 = (X10_TEMP460);
sBufferL[pl,X10_TEMP456] = (X10_TEMP461);
final int X10_TEMP463 = (outLt[pl]);
final int X10_TEMP464 = 1;
final int X10_TEMP465 = (outLt[pl]);
final int X10_TEMP466 = (X10_TEMP465 + X10_TEMP464);
outLt[pl] = (X10_TEMP466);

}
else {
final boolean X10_TEMP468 = y>=ub;
if (X10_TEMP468) {
final String X10_TEMP469 = ("Particle returning up -- ");
final String X10_TEMP470 = ("should not happen: ");
final String X10_TEMP471 = (X10_TEMP469+X10_TEMP470);
final String X10_TEMP472 = (Program.Particle_toString(p));

final String X10_TEMP474 = (X10_TEMP471+X10_TEMP472);
System.err.println(X10_TEMP474);
final place X10_TEMP475 = (here);

final boolean X10_TEMP477 = X10_TEMP475.isLast();
if (X10_TEMP477) {
final double X10_TEMP479 = (y-rsize);
y = (X10_TEMP479);
}
final int X10_TEMP483 = (outRt[pl]);

final Particle X10_TEMP487 = (Program.Particle_setY(p,y));
final Particle X10_TEMP488 = (X10_TEMP487);
sBufferR[pl,X10_TEMP483] = (X10_TEMP488);
final int X10_TEMP490 = (outRt[pl]);
final int X10_TEMP491 = 1;
final int X10_TEMP492 = (outRt[pl]);
final int X10_TEMP493 = (X10_TEMP492 + X10_TEMP491);
outRt[pl] = (X10_TEMP493);

}
else {
final Particle X10_TEMP498 = (p);
rBufferR[pl,inRightStaying] = (X10_TEMP498);
final int X10_TEMP499 = (inRightStaying);
final int X10_TEMP500 = 1;
inRightStaying = inRightStaying + X10_TEMP500;

}
}
}
final int X10_TEMP504 = (inRightStaying);
inRt[pl] = (X10_TEMP504);
int inLeftStaying = (0);
final int X10_TEMP511 = (0);
final int X10_TEMP508 = (inLt[pl]);
final int X10_TEMP509 = (1);
final int X10_TEMP512 = (X10_TEMP508-X10_TEMP509);

final region(:rank==1) X10_TEMP514 = (region(:rank==1))([X10_TEMP511:X10_TEMP512]);
for(point(:rank==1)[i]:X10_TEMP514) {
final Particle p = (rBufferL[pl,i]);
double y = (Program.Particle_getY(p));
final boolean X10_TEMP520 = y>=ub;
if (X10_TEMP520) {
final int X10_TEMP522 = (outRt[pl]);
final int X10_TEMP523 = (rBuffer.size());

final boolean X10_TEMP525 = X10_TEMP522<X10_TEMP523;
if (X10_TEMP525) {
final place X10_TEMP526 = (here);

final boolean X10_TEMP528 = X10_TEMP526.isLast();
if (X10_TEMP528) {
final double X10_TEMP530 = (y-rsize);
y = (X10_TEMP530);
}
final int X10_TEMP534 = (outRt[pl]);

final Particle X10_TEMP538 = (Program.Particle_setY(p,y));
final Particle X10_TEMP539 = (X10_TEMP538);
sBufferR[pl,X10_TEMP534] = (X10_TEMP539);
final int X10_TEMP541 = (outRt[pl]);
final int X10_TEMP542 = 1;
final int X10_TEMP543 = (outRt[pl]);
final int X10_TEMP544 = (X10_TEMP543 + X10_TEMP542);
outRt[pl] = (X10_TEMP544);

}
else {
final int X10_TEMP546 = (2);
final int X10_TEMP547 = (rBuffer.size());

final int X10_TEMP550 = (X10_TEMP546*X10_TEMP547);
final int X10_TEMP551 = (X10_TEMP550);
overflow[pl] = (X10_TEMP551);
break;
}
}
else {
final boolean X10_TEMP553 = y<lb;
if (X10_TEMP553) {
final int X10_TEMP555 = (outLt[pl]);
final int X10_TEMP556 = (rBuffer.size());

final boolean X10_TEMP558 = X10_TEMP555<X10_TEMP556;
if (X10_TEMP558) {
final place X10_TEMP559 = (here);

final boolean X10_TEMP561 = X10_TEMP559.isFirst();
if (X10_TEMP561) {
final double X10_TEMP563 = (y+rsize);
y = (X10_TEMP563);
}
final int X10_TEMP567 = (outLt[pl]);

final Particle X10_TEMP571 = (Program.Particle_setY(p,y));
final Particle X10_TEMP572 = (X10_TEMP571);
sBufferL[pl,X10_TEMP567] = (X10_TEMP572);
final int X10_TEMP574 = (outLt[pl]);
final int X10_TEMP575 = 1;
final int X10_TEMP576 = (outLt[pl]);
final int X10_TEMP577 = (X10_TEMP576 + X10_TEMP575);
outLt[pl] = (X10_TEMP577);

}
else {
final int X10_TEMP579 = (2);
final int X10_TEMP580 = (rBuffer.size());

final int X10_TEMP583 = (X10_TEMP579*X10_TEMP580);
final int X10_TEMP584 = (X10_TEMP583);
overflow[pl] = (X10_TEMP584);
break;
}
}
else {
final Particle X10_TEMP589 = (p);
rBufferL[pl,inLeftStaying] = (X10_TEMP589);
final int X10_TEMP590 = (inLeftStaying);
final int X10_TEMP591 = 1;
inLeftStaying = inLeftStaying + X10_TEMP591;

}
}
}
final int X10_TEMP595 = (inLeftStaying);
inLt[pl] = (X10_TEMP595);
}
}
}
}
final int rSize = (rPart.size());
final int[:rank==1&&distribution==dUnique] X10_TEMP599 = nPart;
final int[:rank==1&&distribution==dUnique] X10_TEMP600 = inLt;
final int[:rank==1&&distribution==dUnique] X10_TEMP597 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)X10_TEMP598){
	final int X10_TEMP601 = X10_TEMP599[X10_TEMP598];
	final int X10_TEMP602 = X10_TEMP600[X10_TEMP598];
	final int X10_TEMP603 = X10_TEMP601 + X10_TEMP602;
	return X10_TEMP603;
});
final int[:rank==1&&distribution==dUnique] X10_TEMP606 = X10_TEMP597;
final int[:rank==1&&distribution==dUnique] X10_TEMP607 = inRt;
final int[:rank==1&&distribution==dUnique] X10_TEMP604 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)X10_TEMP605){
	final int X10_TEMP608 = X10_TEMP606[X10_TEMP605];
	final int X10_TEMP609 = X10_TEMP607[X10_TEMP605];
	final int X10_TEMP610 = X10_TEMP608 + X10_TEMP609;
	return X10_TEMP610;
});
final int[:rank==1&&distribution==dUnique] X10_TEMP613 = X10_TEMP604;
final int[:rank==1&&distribution==dUnique] X10_TEMP614 = nSent;
final int[:rank==1&&distribution==dUnique] X10_TEMP611 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)X10_TEMP612){
	final int X10_TEMP615 = X10_TEMP613[X10_TEMP612];
	final int X10_TEMP616 = X10_TEMP614[X10_TEMP612];
	final int X10_TEMP617 = X10_TEMP615 - X10_TEMP616;
	return X10_TEMP617;
});

final int[:rank==1&&distribution==dUnique] X10_TEMP619 = (int[:rank==1&&distribution==dUnique])(X10_TEMP611);

final int[:rank==1&&distribution==dUnique] tMaxSize = (int[:rank==1&&distribution==dUnique])(X10_TEMP619);
final int[:rank==1&&distribution==dUnique] X10_TEMP623 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)pt) {
return rSize;
}

);
final int[:rank==1&&distribution==dUnique] X10_TEMP626 = X10_TEMP623;
final int[:rank==1&&distribution==dUnique] X10_TEMP627 = tMaxSize;
final int[:rank==1&&distribution==dUnique] X10_TEMP624 = (int[:rank==1&&distribution==dUnique])(new int[dUnique](point(:rank==1)X10_TEMP625){
	final int X10_TEMP628 = X10_TEMP626[X10_TEMP625];
	final int X10_TEMP629 = X10_TEMP627[X10_TEMP625];
	final int X10_TEMP630 = X10_TEMP628 - X10_TEMP629;
	return X10_TEMP630;
});

final int[:rank==1&&distribution==dUnique] tMinSize = (int[:rank==1&&distribution==dUnique])(X10_TEMP624);
final int X10_TEMP633 = (1);

final int X10_TEMP636 = (Program.intrefArrayMax1(tMaxSize));
final int X10_TEMP637 = (X10_TEMP636);
info[X10_TEMP633] = (X10_TEMP637);
final int X10_TEMP639 = (2);

final int X10_TEMP640 = (Program.intrefArrayMax1(tMinSize));

final int X10_TEMP643 = (rSize-X10_TEMP640);
final int X10_TEMP644 = (X10_TEMP643);
info[X10_TEMP639] = (X10_TEMP644);
final int X10_TEMP646 = (1);
final int X10_TEMP647 = (ibflg[X10_TEMP646]);
final int X10_TEMP648 = (rPart.size());

int err = (X10_TEMP647-X10_TEMP648);
final int X10_TEMP650 = (0);

final boolean X10_TEMP652 = err>X10_TEMP650;
if (X10_TEMP652) {
final String X10_TEMP653 = ("Particle overflow error, err = ");

final String X10_TEMP655 = (X10_TEMP653+err);
System.err.println(X10_TEMP655);
final int X10_TEMP657 = (0);

final int X10_TEMP660 = (err);
info[X10_TEMP657] = (X10_TEMP660);
return particles;
}
finish {
final dist(:rank==1) X10_TEMP663 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP664[pl]:X10_TEMP663) {
final place X10_TEMP665 = X10_TEMP663.get(X10_TEMP664);
async(X10_TEMP665) {
int holesTotal = (nSent[pl]);
int holesLeft = (nSent[pl]);
final int X10_TEMP673 = (inLt[pl]);

int nMove = (Program.X10Util_minInt(holesLeft,X10_TEMP673));
finish {
final int X10_TEMP678 = (0);
final int X10_TEMP676 = (1);
final int X10_TEMP679 = (nMove-X10_TEMP676);

final region(:rank==1) X10_TEMP681 = (region(:rank==1))([X10_TEMP678:X10_TEMP679]);
final place X10_TEMP682 = here;
for(point(:rank==1)[i]:X10_TEMP681) {
async(X10_TEMP682) {
final int X10_TEMP687 = (holes[pl,i]);

final Particle X10_TEMP692 = (rBufferL[pl,i]);
final Particle X10_TEMP693 = (X10_TEMP692);
part[pl,X10_TEMP687] = (X10_TEMP693);
}
}
}
final int X10_TEMP695 = (inLt[pl]);

final int X10_TEMP697 = (holesLeft-X10_TEMP695);
holesLeft = (X10_TEMP697);
final int X10_TEMP698 = (0);

final boolean X10_TEMP700 = holesLeft>X10_TEMP698;
if (X10_TEMP700) {
final int X10_TEMP704 = (inRt[pl]);

final int X10_TEMP706 = (Program.X10Util_minInt(holesLeft,X10_TEMP704));
nMove = (X10_TEMP706);
final int X10_TEMP710 = (0);
final int X10_TEMP708 = (1);
final int X10_TEMP711 = (nMove-X10_TEMP708);

final region(:rank==1) X10_TEMP713 = (region(:rank==1))([X10_TEMP710:X10_TEMP711]);
for(point(:rank==1)[i]:X10_TEMP713) {
final int X10_TEMP717 = (inLt[pl]);

final int X10_TEMP719 = (i+X10_TEMP717);

final int X10_TEMP721 = (holes[pl,X10_TEMP719]);

final Particle X10_TEMP726 = (rBufferR[pl,i]);
final Particle X10_TEMP727 = (X10_TEMP726);
part[pl,X10_TEMP721] = (X10_TEMP727);
}
}
else {
final int X10_TEMP728 = 0;

final int X10_TEMP730 = (X10_TEMP728 - holesLeft);
nMove = (X10_TEMP730);
final int X10_TEMP734 = (0);
final int X10_TEMP732 = (1);
final int X10_TEMP735 = (nMove-X10_TEMP732);

final region(:rank==1) X10_TEMP737 = (region(:rank==1))([X10_TEMP734:X10_TEMP735]);
for(point(:rank==1)[i]:X10_TEMP737) {
final int X10_TEMP740 = (nPart[pl]);

final int X10_TEMP742 = (i+X10_TEMP740);

final int X10_TEMP745 = (i+holesTotal);

final Particle X10_TEMP748 = (rBufferL[pl,X10_TEMP745]);
final Particle X10_TEMP749 = (X10_TEMP748);
part[pl,X10_TEMP742] = (X10_TEMP749);
}
}
final int X10_TEMP750 = (0);

final boolean X10_TEMP752 = holesLeft<=X10_TEMP750;
if (X10_TEMP752) {
final int X10_TEMP755 = (nPart[pl]);

final int X10_TEMP758 = (X10_TEMP755-holesLeft);
final int X10_TEMP759 = (X10_TEMP758);
nPart[pl] = (X10_TEMP759);
final int X10_TEMP762 = (inLt[pl]);
holesTotal = (X10_TEMP762);
}
final int X10_TEMP765 = (inLt[pl]);
final int X10_TEMP766 = (inRt[pl]);

final int X10_TEMP768 = (X10_TEMP765+X10_TEMP766);

final int X10_TEMP770 = (holesTotal-X10_TEMP768);
holesLeft = (X10_TEMP770);
final int X10_TEMP771 = (0);

final boolean X10_TEMP773 = holesLeft>X10_TEMP771;
if (X10_TEMP773) {
final int X10_TEMP776 = (inLt[pl]);
final int X10_TEMP777 = (inRt[pl]);

final int X10_TEMP779 = (X10_TEMP776+X10_TEMP777);
holesTotal = (X10_TEMP779);
final int X10_TEMP783 = (holesLeft);
inRt[pl] = (X10_TEMP783);
}
else {
final int X10_TEMP785 = (inLt[pl]);

final int X10_TEMP787 = (holesTotal-X10_TEMP785);
holesTotal = (X10_TEMP787);
final int X10_TEMP789 = 0;

final int X10_TEMP792 = (X10_TEMP789 - holesLeft);
final int X10_TEMP793 = (X10_TEMP792);
inRt[pl] = (X10_TEMP793);
}
final int X10_TEMP799 = (0);
final int X10_TEMP796 = (inRt[pl]);
final int X10_TEMP797 = (1);
final int X10_TEMP800 = (X10_TEMP796-X10_TEMP797);

final region(:rank==1) X10_TEMP802 = (region(:rank==1))([X10_TEMP799:X10_TEMP800]);
for(point(:rank==1)[i]:X10_TEMP802) {
final int X10_TEMP803 = (0);

final boolean X10_TEMP805 = holesLeft>X10_TEMP803;
if (X10_TEMP805) {
final int X10_TEMP807 = (nPart[pl]);
final int X10_TEMP808 = (X10_TEMP807-i);
final int X10_TEMP809 = (1);

final int i1 = (X10_TEMP808-X10_TEMP809);
final int X10_TEMP811 = (holesTotal+holesLeft);
final int X10_TEMP812 = (X10_TEMP811-i);
final int X10_TEMP813 = (1);

final int i2 = (X10_TEMP812-X10_TEMP813);
final int X10_TEMP817 = (holes[pl,i2]);

final boolean X10_TEMP819 = i1>X10_TEMP817;
if (X10_TEMP819) {
final int X10_TEMP824 = (holes[pl,i2]);

final Particle X10_TEMP829 = (part[pl,i1]);
final Particle X10_TEMP830 = (X10_TEMP829);
part[pl,X10_TEMP824] = (X10_TEMP830);
}
}
else {
final int X10_TEMP833 = (nPart[pl]);

final int X10_TEMP835 = (i+X10_TEMP833);

final int X10_TEMP838 = (i+holesTotal);

final Particle X10_TEMP841 = (rBufferR[pl,X10_TEMP838]);
final Particle X10_TEMP842 = (X10_TEMP841);
part[pl,X10_TEMP835] = (X10_TEMP842);
}
}
final int X10_TEMP843 = (0);

final boolean X10_TEMP845 = holesLeft>X10_TEMP843;
if (X10_TEMP845) {
final int X10_TEMP849 = (nPart[pl]);
final int X10_TEMP850 = (inRt[pl]);

final int X10_TEMP853 = (X10_TEMP849-X10_TEMP850);
final int X10_TEMP854 = (X10_TEMP853);
nPart[pl] = (X10_TEMP854);
}
else {
final int X10_TEMP858 = (nPart[pl]);
final int X10_TEMP859 = (inRt[pl]);

final int X10_TEMP862 = (X10_TEMP858+X10_TEMP859);
final int X10_TEMP863 = (X10_TEMP862);
nPart[pl] = (X10_TEMP863);
}
final int X10_TEMP867 = (0);
final int X10_TEMP868 = (X10_TEMP867);
nSent[pl] = (X10_TEMP868);
}
}
}
final int X10_TEMP870 = (4);

final int X10_TEMP872 = (4);

final int X10_TEMP875 = (info[X10_TEMP872]);

final int X10_TEMP878 = (Program.X10Util_maxInt(X10_TEMP875,mter));
final int X10_TEMP879 = (X10_TEMP878);
info[X10_TEMP870] = (X10_TEMP879);
final int X10_TEMP881 = (1);
final int X10_TEMP882 = (ibflg[X10_TEMP881]);
final int X10_TEMP883 = (0);

final boolean X10_TEMP885 = X10_TEMP882>X10_TEMP883;
if (X10_TEMP885) {
final String X10_TEMP886 = ("Info: particles being passed");
final String X10_TEMP887 = (" further = ");
final String X10_TEMP890 = (X10_TEMP886+X10_TEMP887);
final int X10_TEMP889 = (1);
final int X10_TEMP891 = (ibflg[X10_TEMP889]);

final String X10_TEMP893 = (X10_TEMP890+X10_TEMP891);
System.err.println(X10_TEMP893);
final int X10_TEMP895 = (2);
final int X10_TEMP896 = (ibflg[X10_TEMP895]);
final int X10_TEMP897 = (0);

final boolean X10_TEMP899 = X10_TEMP896>X10_TEMP897;
if (X10_TEMP899) {
final int X10_TEMP901 = (2);

final int X10_TEMP904 = (1);
final int X10_TEMP905 = (X10_TEMP904);
ibflg[X10_TEMP901] = (X10_TEMP905);
}
final boolean X10_TEMP907 = iter>=ITER_MAX;
if (X10_TEMP907) {
final int X10_TEMP908 = (2);
final int X10_TEMP909 = (2);
final int X10_TEMP910 = (X10_TEMP908/X10_TEMP909);

final int X10_TEMP912 = (iter-X10_TEMP910);

final int X10_TEMP914 = (X10_TEMP912);
final int X10_TEMP915 = 0;

final int X10_TEMP917 = (X10_TEMP915 - X10_TEMP914);
err = (X10_TEMP917);
final String X10_TEMP918 = ("Iteration overflow, ");
final String X10_TEMP919 = ("iter = ");
final String X10_TEMP920 = (X10_TEMP918+X10_TEMP919);

final String X10_TEMP922 = (X10_TEMP920+err);
System.err.println(X10_TEMP922);
final int X10_TEMP924 = (0);

final int X10_TEMP927 = (err);
info[X10_TEMP924] = (X10_TEMP927);
final boolean X10_TEMP929 = (true);
doneInner = (X10_TEMP929);
final boolean X10_TEMP931 = (true);
doneOuter = (X10_TEMP931);
}
}
else {
final boolean X10_TEMP933 = (true);
doneInner = (X10_TEMP933);
}
X10_TEMP265 = !doneInner;
} while(X10_TEMP265);
final boolean X10_TEMP939 = (!doneOuter);
final int X10_TEMP936 = (2);
final int X10_TEMP937 = (ibflg[X10_TEMP936]);
final int X10_TEMP938 = (0);
final boolean X10_TEMP940 = (X10_TEMP937>X10_TEMP938);

final boolean X10_TEMP942 = X10_TEMP939&&X10_TEMP940;
if (X10_TEMP942) {
final int X10_TEMP943 = (nter);
final int X10_TEMP944 = 1;
nter = nter + X10_TEMP944;

final int X10_TEMP946 = (3);

final int X10_TEMP949 = (nter);
info[X10_TEMP946] = (X10_TEMP949);
}
else {
final boolean X10_TEMP951 = (true);
doneOuter = (X10_TEMP951);
}
X10_TEMP123 = !doneOuter;
} while(X10_TEMP123);
final int X10_TEMP954 = (5);

final int X10_TEMP957 = (Program.intrefArraySum1(nPart));
final int X10_TEMP958 = (X10_TEMP957);
info[X10_TEMP954] = (X10_TEMP958);
final int X10_TEMP960 = (6);

final int X10_TEMP963 = (Program.intrefArraySum1(nPartOld));
final int X10_TEMP964 = (X10_TEMP963);
info[X10_TEMP960] = (X10_TEMP964);
final int X10_TEMP966 = (5);
final int X10_TEMP969 = (info[X10_TEMP966]);
final int X10_TEMP968 = (6);
final int X10_TEMP970 = (info[X10_TEMP968]);

final boolean X10_TEMP972 = X10_TEMP969!=X10_TEMP970;
if (X10_TEMP972) {
final String X10_TEMP975 = ("Particle number error, old/new = ");
final int X10_TEMP974 = (0);
final int X10_TEMP976 = (info[X10_TEMP974]);
final String X10_TEMP977 = (X10_TEMP975+X10_TEMP976);
final String X10_TEMP978 = (" ");
final String X10_TEMP981 = (X10_TEMP977+X10_TEMP978);
final int X10_TEMP980 = (1);
final int X10_TEMP982 = (info[X10_TEMP980]);

final String X10_TEMP984 = (X10_TEMP981+X10_TEMP982);
System.err.println(X10_TEMP984);
final int X10_TEMP986 = (0);

final int X10_TEMP989 = (1);
final int X10_TEMP990 = (X10_TEMP989);
info[X10_TEMP986] = (X10_TEMP990);
}
final int X10_TEMP991 = (0);

final boolean X10_TEMP993 = nter>X10_TEMP991;
if (X10_TEMP993) {
final String X10_TEMP994 = ("Info: ");
final String X10_TEMP995 = (X10_TEMP994+nter);
final String X10_TEMP996 = (" buffer overflows, ");
final String X10_TEMP997 = (X10_TEMP995+X10_TEMP996);
final String X10_TEMP998 = ("nbmax = ");
final String X10_TEMP999 = (X10_TEMP997+X10_TEMP998);
final int X10_TEMP1000 = (rBuffer.size());

final String X10_TEMP1002 = (X10_TEMP999+X10_TEMP1000);
System.err.println(X10_TEMP1002);
}
final Particle[:rank==1] X10_TEMP1006 = (Particle[:rank==1])(Program.LinearESOpenPIC2D_packParticleArray(X10_TEMP0,part,nPart));
return X10_TEMP1006;
}
public static void LinearESOpenPIC2D_transferParticles(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==2] leftOutBuffer, final Particle [:rank==2] rightOutBuffer, final int [:rank==1] outLeft, final int [:rank==1] outRight, final Particle [:rank==2] leftInBuffer, final Particle [:rank==2] rightInBuffer, final int [:rank==1] inLeft, final int [:rank==1] inRight) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP3[pl]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final place X10_TEMP5 = (here);

final place pLeft = (X10_TEMP5.prev());
final place X10_TEMP7 = (here);

final place pRight = (X10_TEMP7.next());
final int X10_TEMP14 = (0);
final int X10_TEMP11 = (outLeft[pl]);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);

final region(:rank==1) rLeft = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final int X10_TEMP22 = (0);
final int X10_TEMP19 = (outRight[pl]);
final int X10_TEMP20 = (1);
final int X10_TEMP23 = (X10_TEMP19-X10_TEMP20);

final region(:rank==1) rRight = (region(:rank==1))([X10_TEMP22:X10_TEMP23]);
final Particle value[:rank==1] X10_TEMP29 = (Particle value[:rank==1])(new Particle value[rLeft](point(:rank==1)[i]) {
final Particle X10_TEMP28 = (leftOutBuffer[pl,i]);
return X10_TEMP28;
}

);

final Particle value[:rank==1] lBuffer = (Particle value[:rank==1])(X10_TEMP29);
final Particle value[:rank==1] X10_TEMP35 = (Particle value[:rank==1])(new Particle value[rRight](point(:rank==1)[i]) {
final Particle X10_TEMP34 = (rightOutBuffer[pl,i]);
return X10_TEMP34;
}

);

final Particle value[:rank==1] rBuffer = (Particle value[:rank==1])(X10_TEMP35);
async(pLeft) {
final place X10_TEMP38 = (here);

final int pid = (X10_TEMP38.id);
final region(:rank==1) X10_TEMP41 = (region(:rank==1))(lBuffer.region);

final int X10_TEMP44 = (X10_TEMP41.size());
final int X10_TEMP45 = (X10_TEMP44);
inRight[pid] = (X10_TEMP45);
final place X10_TEMP47 = here;
for(point(:rank==1)[i]:lBuffer) {
async(X10_TEMP47) {
final Particle X10_TEMP53 = (lBuffer[i]);
final Particle X10_TEMP54 = (X10_TEMP53);
rightInBuffer[pid,i] = (X10_TEMP54);
}
}
}
async(pRight) {
final place X10_TEMP56 = (here);

final int pid = (X10_TEMP56.id);
final region(:rank==1) X10_TEMP59 = (region(:rank==1))(rBuffer.region);

final int X10_TEMP62 = (X10_TEMP59.size());
final int X10_TEMP63 = (X10_TEMP62);
inLeft[pid] = (X10_TEMP63);
final place X10_TEMP65 = here;
for(point(:rank==1)[i]:rBuffer) {
async(X10_TEMP65) {
final Particle X10_TEMP71 = (rBuffer[i]);
final Particle X10_TEMP72 = (X10_TEMP71);
leftInBuffer[pid,i] = (X10_TEMP72);
}
}
}
}
}
}
}
public static Particle [:rank==1] LinearESOpenPIC2D_packParticleArray(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==2] part, final int [:rank==1] nParticles) {
int lb = (0);
final int X10_TEMP2 = 0;
final int X10_TEMP3 = 1;
final int X10_TEMP4 = X10_TEMP2 - X10_TEMP3;
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP2:X10_TEMP4]);
final place X10_TEMP6 = (here);

final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);

dist(:rank==1) dResult = (dist(:rank==1))(X10_TEMP8);
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pt:X10_TEMP11) {
int rsize = (Program.X10Util_pullInt(nParticles,pt));
final int X10_TEMP17 = (pt[0]);

place p = (place.places(X10_TEMP17));
final int X10_TEMP20 = (lb+rsize);
final int X10_TEMP21 = (1);
final int X10_TEMP23 = (X10_TEMP20-X10_TEMP21);
final region(:rank==1) X10_TEMP24 = (region(:rank==1))([lb:X10_TEMP23]);

final dist(:rank==1) X10_TEMP26 = (dist(:rank==1))(X10_TEMP24->p);

final dist(:rank==1) X10_TEMP28 = (dist(:rank==1))(dResult||X10_TEMP26);
dResult = (dist(:rank==1))(X10_TEMP28);
final int X10_TEMP30 = (lb+rsize);
lb = (X10_TEMP30);
}
final Particle[:rank==1] result = (Particle[:rank==1])(new Particle[dResult]);
finish {
final dist(:rank==1) X10_TEMP33 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP34[pl]:X10_TEMP33) {
final place X10_TEMP35 = X10_TEMP33.get(X10_TEMP34);
async(X10_TEMP35) {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(result.distribution);
final place X10_TEMP37 = (here);

final dist(:rank==1) X10_TEMP39 = (dist(:rank==1))(X10_TEMP36|X10_TEMP37);
final region(:rank==1) X10_TEMP40 = (region(:rank==1))(X10_TEMP39.region);

final region(:rank==1) rLocal = (region(:rank==1))(X10_TEMP40);
final int X10_TEMP42 = (rLocal.size());
final int X10_TEMP43 = (0);

final boolean X10_TEMP45 = X10_TEMP42>X10_TEMP43;
if (X10_TEMP45) {
final int offset = (rLocal.low());
final place X10_TEMP48 = here;
for(point(:rank==1)[i]:rLocal) {
async(X10_TEMP48) {
final int X10_TEMP52 = (i-offset);

final Particle X10_TEMP55 = (part[pl,X10_TEMP52]);
final Particle X10_TEMP56 = (X10_TEMP55);
result[i] = (X10_TEMP56);
}
}
}
}
}
}
return result;
}
public static double LinearESOpenPIC2D_pushParticles(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final double [:rank==2] forceChargeX, final double [:rank==2] fcGuardX, final double [:rank==2] forceChargeY, final double [:rank==2] fcGuardY) {
double lx = (0.0);
double ly = (0.0);
double rx = (0.0);
double ry = (0.0);
final int X10_TEMP7 = 1;
final int X10_TEMP10 = 2;
final int X10_TEMP22 = 3;
switch(_LinearESOpenPIC2D_BOUNDARY_CONDITION){
case X10_TEMP7:
{
rx = (_LinearESOpenPIC2D_XLENGTH);
break;
}
case X10_TEMP10:
{
final double X10_TEMP12 = (1.0);
lx = (X10_TEMP12);
final double X10_TEMP14 = (1.0);
ly = (X10_TEMP14);
final double X10_TEMP15 = (1.0);

final double X10_TEMP17 = (_LinearESOpenPIC2D_XLENGTH-X10_TEMP15);
rx = (X10_TEMP17);
final double X10_TEMP18 = (1.0);

final double X10_TEMP20 = (_LinearESOpenPIC2D_YLENGTH-X10_TEMP18);
ry = (X10_TEMP20);
break;
}
case X10_TEMP22:
{
final double X10_TEMP24 = (1.0);
lx = (X10_TEMP24);
final double X10_TEMP25 = (1.0);

final double X10_TEMP27 = (_LinearESOpenPIC2D_XLENGTH-X10_TEMP25);
rx = (X10_TEMP27);
break;
}
}
final double edgelx = (lx);
final double edgely = (ly);
final double edgerx = (rx);
final double edgery = (ry);
final double quantum = (_LinearESOpenPIC2D_ELECTRON_CHARGE*_LinearESOpenPIC2D_DELTA_TIME);
final dist(:rank==1) dEnergy = (dist(:rank==1))(particles.distribution);
final double[:rank==1] energy = (double[:rank==1])(new double[dEnergy]);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final double[:rank==2] fcLocalX = (double[:rank==2])(Program.LinearESOpenPIC2D_makeLocalSpace(X10_TEMP0,forceChargeX,fcGuardX));
final double[:rank==2] fcLocalY = (double[:rank==2])(Program.LinearESOpenPIC2D_makeLocalSpace(X10_TEMP0,forceChargeY,fcGuardY));
final dist(:rank==1) X10_TEMP44 = (dist(:rank==1))(particles.distribution);
final place X10_TEMP45 = (here);

final dist(:rank==1) X10_TEMP47 = (dist(:rank==1))(X10_TEMP44|X10_TEMP45);
final place X10_TEMP48 = here;
for(point(:rank==1)pt:X10_TEMP47) {
async(X10_TEMP48) {
Program.LinearESOpenPIC2D_pushParticle(X10_TEMP0,particles,pt,fcLocalX,fcLocalY,quantum,edgelx,edgely,edgerx,edgery,energy);
}
}
}
}
}
final double X10_TEMP59 = (0.125);
final double X10_TEMP60 = (Program.doublerefArraySum1(energy));

final double X10_TEMP62 = (X10_TEMP59*X10_TEMP60);

return X10_TEMP62;
}
public static double [:rank==2] LinearESOpenPIC2D_makeLocalSpace(final LinearESOpenPIC2D X10_TEMP0, final double [:rank==2] data, final double [:rank==2] guards) {
final dist(:rank==2) dData = (dist(:rank==2))(data.distribution);
final dist(:rank==2) dGuard = (dist(:rank==2))(guards.distribution);
final region(:rank==2) rLocalD = (region(:rank==2))(Program.X10Util_get2DLRegion(dData));
final region(:rank==2) rLocalG = (region(:rank==2))(Program.X10Util_get2DLRegion(dGuard));
final region(:rank==2) X10_TEMP8 = (region(:rank==2))(rLocalD||rLocalG);
final place X10_TEMP9 = (here);

final dist(:rank==2) X10_TEMP11 = (dist(:rank==2))(X10_TEMP8->X10_TEMP9);

final dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP11);
final double[:rank==2] result = (double[:rank==2])(new double[dResult]);
finish {
final dist(:rank==2) X10_TEMP14 = (dist(:rank==2))(data.distribution);
final place X10_TEMP15 = (here);

final dist(:rank==2) X10_TEMP17 = (dist(:rank==2))(X10_TEMP14|X10_TEMP15);
final place X10_TEMP18 = here;
for(point(:rank==2)pt:X10_TEMP17) {
async(X10_TEMP18) {
final double X10_TEMP23 = (data[pt]);
final double X10_TEMP24 = (X10_TEMP23);
result[pt] = (X10_TEMP24);
}
}
final dist(:rank==2) X10_TEMP25 = (dist(:rank==2))(guards.distribution);
final place X10_TEMP26 = (here);

final dist(:rank==2) X10_TEMP28 = (dist(:rank==2))(X10_TEMP25|X10_TEMP26);
final place X10_TEMP29 = here;
for(point(:rank==2)pt:X10_TEMP28) {
async(X10_TEMP29) {
final double X10_TEMP34 = (guards[pt]);
final double X10_TEMP35 = (X10_TEMP34);
result[pt] = (X10_TEMP35);
}
}
}
return result;
}
public static void LinearESOpenPIC2D_pushParticle(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final point(:rank==1) pt, final double [:rank==2] forceChargeX, final double [:rank==2] forceChargeY, final double quantum, final double edgelx, final double edgely, final double edgerx, final double edgery, final double [:rank==1] energy) {
final Particle p = (particles[pt]);
final double X10_TEMP3 = (Program.Particle_getX(p));

final int x = ((int)X10_TEMP3);
final double X10_TEMP5 = (Program.Particle_getY(p));

final int y = ((int)X10_TEMP5);
final double X10_TEMP7 = (Program.Particle_getX(p));

final double dx = (X10_TEMP7-x);
final double X10_TEMP9 = (Program.Particle_getY(p));

final double dy = (X10_TEMP9-y);
final double X10_TEMP11 = (1.0);

final double mx = (X10_TEMP11-dx);
final double X10_TEMP13 = (1.0);

final double my = (X10_TEMP13-dy);
final int X10_TEMP15 = (1);

final int X10_TEMP19 = (y+X10_TEMP15);
final int X10_TEMP17 = (1);

final int X10_TEMP20 = (x+X10_TEMP17);
final double X10_TEMP21 = (forceChargeX[X10_TEMP19,X10_TEMP20]);
final double X10_TEMP27 = (dx*X10_TEMP21);
final int X10_TEMP22 = (1);

final int X10_TEMP25 = (y+X10_TEMP22);
final double X10_TEMP26 = (forceChargeX[X10_TEMP25,x]);
final double X10_TEMP28 = (mx*X10_TEMP26);

final double X10_TEMP30 = (X10_TEMP27+X10_TEMP28);
final double X10_TEMP43 = (dy*X10_TEMP30);
final int X10_TEMP32 = (1);

final int X10_TEMP34 = (x+X10_TEMP32);
final double X10_TEMP35 = (forceChargeX[y,X10_TEMP34]);
final double X10_TEMP39 = (dx*X10_TEMP35);
final double X10_TEMP38 = (forceChargeX[y,x]);
final double X10_TEMP40 = (mx*X10_TEMP38);

final double X10_TEMP42 = (X10_TEMP39+X10_TEMP40);
final double X10_TEMP44 = (my*X10_TEMP42);

final double X10_TEMP46 = (X10_TEMP43+X10_TEMP44);

final double ax = (X10_TEMP46);
final int X10_TEMP48 = (1);

final int X10_TEMP52 = (y+X10_TEMP48);
final int X10_TEMP50 = (1);

final int X10_TEMP53 = (x+X10_TEMP50);
final double X10_TEMP54 = (forceChargeY[X10_TEMP52,X10_TEMP53]);
final double X10_TEMP60 = (dx*X10_TEMP54);
final int X10_TEMP55 = (1);

final int X10_TEMP58 = (y+X10_TEMP55);
final double X10_TEMP59 = (forceChargeY[X10_TEMP58,x]);
final double X10_TEMP61 = (mx*X10_TEMP59);

final double X10_TEMP63 = (X10_TEMP60+X10_TEMP61);
final double X10_TEMP76 = (dy*X10_TEMP63);
final int X10_TEMP65 = (1);

final int X10_TEMP67 = (x+X10_TEMP65);
final double X10_TEMP68 = (forceChargeY[y,X10_TEMP67]);
final double X10_TEMP72 = (dx*X10_TEMP68);
final double X10_TEMP71 = (forceChargeY[y,x]);
final double X10_TEMP73 = (mx*X10_TEMP71);

final double X10_TEMP75 = (X10_TEMP72+X10_TEMP73);
final double X10_TEMP77 = (my*X10_TEMP75);

final double X10_TEMP79 = (X10_TEMP76+X10_TEMP77);

final double ay = (X10_TEMP79);
final double X10_TEMP81 = (Program.Particle_getXVel(p));
final double X10_TEMP82 = (quantum*ax);

double vx = (X10_TEMP81+X10_TEMP82);
final double X10_TEMP84 = (Program.Particle_getYVel(p));
final double X10_TEMP85 = (quantum*ay);

double vy = (X10_TEMP84+X10_TEMP85);
final double X10_TEMP87 = (Program.Particle_getX(p));
final double X10_TEMP88 = (vx*_LinearESOpenPIC2D_DELTA_TIME);

double nx = (X10_TEMP87+X10_TEMP88);
final double X10_TEMP90 = (Program.Particle_getY(p));
final double X10_TEMP91 = (vy*_LinearESOpenPIC2D_DELTA_TIME);

double ny = (X10_TEMP90+X10_TEMP91);
final double X10_TEMP94 = (Program.Particle_getXVel(p));
final double X10_TEMP97 = (vx+X10_TEMP94);
final int X10_TEMP98 = (2);
final double X10_TEMP104 = (Math.pow(X10_TEMP97,X10_TEMP98));
final double X10_TEMP99 = (Program.Particle_getYVel(p));
final double X10_TEMP102 = (vy+X10_TEMP99);
final int X10_TEMP103 = (2);
final double X10_TEMP105 = (Math.pow(X10_TEMP102,X10_TEMP103));

final double X10_TEMP107 = (X10_TEMP104+X10_TEMP105);

final double X10_TEMP110 = (X10_TEMP107);
energy[pt] = (X10_TEMP110);
final int X10_TEMP113 = 1;
final int X10_TEMP123 = 2;
final int X10_TEMP134 = 3;
switch(_LinearESOpenPIC2D_BOUNDARY_CONDITION){
case X10_TEMP113:
{
final boolean X10_TEMP115 = nx<edgelx;
if (X10_TEMP115) {
final double X10_TEMP117 = (nx+edgerx);
nx = (X10_TEMP117);
}
final boolean X10_TEMP119 = nx>=edgerx;
if (X10_TEMP119) {
final double X10_TEMP121 = (nx-edgerx);
nx = (X10_TEMP121);
}
break;
}
case X10_TEMP123:
{
final boolean X10_TEMP124 = (ny<edgely);
final boolean X10_TEMP125 = (ny>=edgery);

final boolean X10_TEMP127 = X10_TEMP124||X10_TEMP125;
if (X10_TEMP127) {
final double X10_TEMP129 = (Program.Particle_getY(p));
ny = (X10_TEMP129);
final int X10_TEMP130 = 0;

final double X10_TEMP132 = (X10_TEMP130 - vy);
vy = (X10_TEMP132);
}
}
case X10_TEMP134:
{
final boolean X10_TEMP135 = (nx<edgelx);
final boolean X10_TEMP136 = (nx>=edgerx);

final boolean X10_TEMP138 = X10_TEMP135||X10_TEMP136;
if (X10_TEMP138) {
final double X10_TEMP140 = (Program.Particle_getX(p));
nx = (X10_TEMP140);
final int X10_TEMP141 = 0;

final double X10_TEMP143 = (X10_TEMP141 - vx);
vx = (X10_TEMP143);
}
break;
}
}
final Particle X10_TEMP151 = (new Particle(nx,ny,vx,vy));
final Particle X10_TEMP152 = (X10_TEMP151);
particles[pt] = (X10_TEMP152);
}
public static int [:rank==1] LinearESOpenPIC2D_countParticles(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final dist(:rank==2) dField) {
final int X10_TEMP3 = (0);

final dist(:rank==1) dCount = (dist(:rank==1))(Program.X10Util_get2DDistRank(dField,X10_TEMP3));
final int[:rank==1] count = (int[:rank==1])(new int[dCount](point(:rank==1)pt) {
final int X10_TEMP6 = (0);
return X10_TEMP6;
}

);
finish {
final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP9) {
final place X10_TEMP10 = X10_TEMP9.get(pl);
async(X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(particles.distribution);
final place X10_TEMP12 = (here);

final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP11|X10_TEMP12);
for(point(:rank==1)pt:X10_TEMP14) {
final Particle X10_TEMP16 = (particles[pt]);
final double X10_TEMP17 = (Program.Particle_getY(X10_TEMP16));

final int X10_TEMP19 = ((int)X10_TEMP17);
final int X10_TEMP20 = (count[X10_TEMP19]);
final int X10_TEMP21 = 1;
final int X10_TEMP22 = (count[X10_TEMP19]);
final int X10_TEMP23 = (X10_TEMP22 + X10_TEMP21);
count[X10_TEMP19] = (X10_TEMP23);

}
}
}
}
return count;
}
public static dist(:rank==2) LinearESOpenPIC2D_repartition(final LinearESOpenPIC2D X10_TEMP0, final int [:rank==1] particleCount, final dist(:rank==2) dField, final double countAve) {
final int MAX = (32);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP2);
final int X10_TEMP6 = (0);

final dist(:rank==1) dGrids = (dist(:rank==1))(Program.X10Util_get2DDistRank(dField,X10_TEMP6));
final region(:rank==2) rField = (region(:rank==2))(dField.region);
final int X10_TEMP11 = (1);

final region(:rank==1) rRows = (region(:rank==1))(Program.X10Util_getRank2D(rField,X10_TEMP11));
final double[:rank==1] border = (double[:rank==1])(new double[dUnique](point(:rank==1)pt) {
final double X10_TEMP14 = (0.0);
return X10_TEMP14;
}

);
final int[:rank==1] particleTotals = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP17 = (0);
return X10_TEMP17;
}

);
final int[:rank==1] gridTotals = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP20 = (0);
return X10_TEMP20;
}

);
final dist(:rank==1) X10_TEMP22 = (dist(:rank==1))(dist.UNIQUE);

final int X10_TEMP27 = (0);
final int X10_TEMP25 = (1);
final int X10_TEMP28 = (MAX-X10_TEMP25);

final region(:rank==1) X10_TEMP30 = (region(:rank==1))([X10_TEMP27:X10_TEMP28]);

final dist(:rank==2) dBuffer = (dist(:rank==2))(Program.X10Util_extendDistRank2D(X10_TEMP22,X10_TEMP30));
final int[:rank==2] sCountBuffer = (int[:rank==2])(new int[dBuffer]);
final int[:rank==2] rCountBuffer = (int[:rank==2])(new int[dBuffer]);
final int[:rank==1] sendCount = (int[:rank==1])(new int[dUnique]);
final int[:rank==1] sendGrids = (int[:rank==1])(new int[dUnique]);
final int[:rank==1] recvCount = (int[:rank==1])(new int[dUnique]);
final int[:rank==1] recvGrids = (int[:rank==1])(new int[dUnique]);
final int[:rank==1] finished = (int[:rank==1])(new int[dUnique](point(:rank==1)pt) {
final int X10_TEMP39 = (0);
return X10_TEMP39;
}

);
finish {
final dist(:rank==1) X10_TEMP42 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP43[pl]:X10_TEMP42) {
final place X10_TEMP44 = X10_TEMP42.get(X10_TEMP43);
async(X10_TEMP44) {
final dist(:rank==1) dPC = (dist(:rank==1))(particleCount.distribution);
final region(:rank==1) rLocal = (region(:rank==1))(Program.X10Util_get1DLRegion(dPC));
final int rsize = (rLocal.size());
final int X10_TEMP49 = (0);

final boolean X10_TEMP51 = (rsize>X10_TEMP49);
final boolean X10_TEMP52 = X10_TEMP51;
int X10_TEMP55 = 0;
if(X10_TEMP52){
X10_TEMP55 = rLocal.low();
}
final int X10_TEMP56 = X10_TEMP55;

final int offset = (X10_TEMP56);
int total = (0);
final dist(:rank==1) X10_TEMP58 = (dist(:rank==1))(particleCount.distribution);
final place X10_TEMP59 = (here);

final dist(:rank==1) X10_TEMP61 = (dist(:rank==1))(X10_TEMP58|X10_TEMP59);
for(point(:rank==1)[i]:X10_TEMP61) {
final int count = (particleCount[i]);
final int X10_TEMP66 = (i-offset);

final int X10_TEMP69 = (count);
sCountBuffer[pl,X10_TEMP66] = (X10_TEMP69);
final int X10_TEMP71 = (total+count);
total = (X10_TEMP71);
}
final int X10_TEMP75 = (total);
particleTotals[pl] = (X10_TEMP75);
final int X10_TEMP79 = (rsize);
gridTotals[pl] = (X10_TEMP79);
final int X10_TEMP83 = (total);
sendCount[pl] = (X10_TEMP83);
final int X10_TEMP87 = (rsize);
sendGrids[pl] = (X10_TEMP87);
final int X10_TEMP91 = (0);
final int X10_TEMP92 = (X10_TEMP91);
recvCount[pl] = (X10_TEMP92);
final int X10_TEMP96 = (0);
final int X10_TEMP97 = (X10_TEMP96);
recvGrids[pl] = (X10_TEMP97);
}
}
}
final int[:rank==1] runningPTotals = (int[:rank==1])(Program.LinearESOpenPIC2D_parallelPrefix(X10_TEMP0,particleTotals));
final int[:rank==1] runningGTotals = (int[:rank==1])(Program.LinearESOpenPIC2D_parallelPrefix(X10_TEMP0,gridTotals));
finish {
final dist(:rank==1) X10_TEMP103 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP103) {
final place X10_TEMP104 = X10_TEMP103.get(pl);
async(X10_TEMP104) {
final int X10_TEMP109 = (runningPTotals[pl]);
final int X10_TEMP110 = (X10_TEMP109);
particleTotals[pl] = (X10_TEMP110);
final int X10_TEMP115 = (runningGTotals[pl]);
final int X10_TEMP116 = (X10_TEMP115);
gridTotals[pl] = (X10_TEMP116);
}
}
}
boolean X10_TEMP117 = false;
do {
finish {
final dist(:rank==1) X10_TEMP119 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP120[pl]:X10_TEMP119) {
final place X10_TEMP121 = X10_TEMP119.get(X10_TEMP120);
async(X10_TEMP121) {
final int X10_TEMP122 = (1);

final int X10_TEMP124 = (pl+X10_TEMP122);
final double X10_TEMP125 = (X10_TEMP124*countAve);
final double X10_TEMP126 = (0.5);

final double X10_TEMP128 = (X10_TEMP125+X10_TEMP126);

final int expected = ((int)X10_TEMP128);
final int X10_TEMP131 = (runningPTotals[pl]);

final int surplus = (X10_TEMP131-expected);
final double X10_TEMP133 = (0.0);

final boolean X10_TEMP135 = surplus>X10_TEMP133;
if (X10_TEMP135) {
final int X10_TEMP141 = (0);
final int X10_TEMP138 = (sendGrids[pl]);
final int X10_TEMP139 = (1);
final int X10_TEMP142 = (X10_TEMP138-X10_TEMP139);

final region(:rank==1) dSBuffer = (region(:rank==1))([X10_TEMP141:X10_TEMP142]);
final int value[:rank==1] X10_TEMP148 = (int value[:rank==1])(new int value[dSBuffer](point(:rank==1)[i]) {
final int X10_TEMP147 = (sCountBuffer[pl,i]);
return X10_TEMP147;
}

);

final int value[:rank==1] sBuffer = (int value[:rank==1])(X10_TEMP148);
final int nCount = (sendCount[pl]);
final int nGrids = (sendGrids[pl]);
finish {
final place X10_TEMP154 = (here);

final place X10_TEMP156 = X10_TEMP154.next();
async(X10_TEMP156) {
final place X10_TEMP157 = (here);

final int X10_TEMP159 = (X10_TEMP157.id);

final int X10_TEMP162 = (nCount);
recvCount[X10_TEMP159] = (X10_TEMP162);
final place X10_TEMP163 = (here);

final int X10_TEMP165 = (X10_TEMP163.id);

final int X10_TEMP168 = (nGrids);
recvGrids[X10_TEMP165] = (X10_TEMP168);
finish {
final place X10_TEMP170 = here;
for(point(:rank==1)[i]:dSBuffer) {
async(X10_TEMP170) {
final place X10_TEMP171 = (here);

final int X10_TEMP174 = (X10_TEMP171.id);

final int X10_TEMP178 = (sBuffer[i]);
final int X10_TEMP179 = (X10_TEMP178);
rCountBuffer[X10_TEMP174,i] = (X10_TEMP179);
}
}
}
}
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP181 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP182[pl]:X10_TEMP181) {
final place X10_TEMP183 = X10_TEMP181.get(X10_TEMP182);
async(X10_TEMP183) {
final int X10_TEMP187 = (0);
final int X10_TEMP188 = (X10_TEMP187);
finished[pl] = (X10_TEMP188);
final double X10_TEMP189 = (pl*countAve);
final double X10_TEMP190 = (0.5);

final double X10_TEMP192 = (X10_TEMP189+X10_TEMP190);

final int expected1 = ((int)X10_TEMP192);
final int X10_TEMP194 = (1);

final int X10_TEMP196 = (pl+X10_TEMP194);
final double X10_TEMP197 = (X10_TEMP196*countAve);
final double X10_TEMP198 = (0.5);

final double X10_TEMP200 = (X10_TEMP197+X10_TEMP198);

final int expected2 = ((int)X10_TEMP200);
final int X10_TEMP203 = (runningPTotals[pl]);
final int X10_TEMP205 = (expected1-X10_TEMP203);
final int X10_TEMP206 = (sendCount[pl]);

final int lDeficit = (X10_TEMP205+X10_TEMP206);
final int X10_TEMP209 = (runningPTotals[pl]);

final int rDeficit = (X10_TEMP209-expected2);
final double X10_TEMP211 = (0.0);

final boolean X10_TEMP213 = lDeficit<X10_TEMP211;
if (X10_TEMP213) {
final int X10_TEMP215 = (recvCount[pl]);
final int X10_TEMP216 = (lDeficit+X10_TEMP215);
final double X10_TEMP217 = (0.0);

final boolean X10_TEMP219 = X10_TEMP216>=X10_TEMP217;
if (X10_TEMP219) {
int total = (0);
int oldTotal = (0);
int gsize = (recvGrids[pl]);
int i = (gsize);
boolean X10_TEMP225 = false;
do {
final int X10_TEMP226 = (i);
final int X10_TEMP227 = 1;
i = i - X10_TEMP227;

oldTotal = (total);
final int X10_TEMP231 = (rCountBuffer[pl,i]);

final int X10_TEMP233 = (total-X10_TEMP231);
total = (X10_TEMP233);
final boolean X10_TEMP235 = (total>lDeficit);
final int X10_TEMP234 = (0);
final boolean X10_TEMP236 = (i>=X10_TEMP234);
X10_TEMP225 = X10_TEMP235&&X10_TEMP236;
} while(X10_TEMP225);
final int X10_TEMP239 = (gsize-i);
final int X10_TEMP241 = (lDeficit-oldTotal);

final double X10_TEMP243 = ((double)X10_TEMP241);
final int X10_TEMP245 = (total-oldTotal);

final double X10_TEMP247 = ((double)X10_TEMP245);

final double X10_TEMP249 = (X10_TEMP243/X10_TEMP247);

final double X10_TEMP251 = (X10_TEMP239+X10_TEMP249);

double offset = (X10_TEMP251);
final int X10_TEMP256 = (runningGTotals[pl]);
final int X10_TEMP257 = (sendGrids[pl]);
final double X10_TEMP258 = (X10_TEMP256-X10_TEMP257);

final double X10_TEMP261 = (X10_TEMP258-offset);
final double X10_TEMP262 = (X10_TEMP261);
border[pl] = (X10_TEMP262);
}
else {
final int X10_TEMP264 = (finished[pl]);
final int X10_TEMP265 = 1;
final int X10_TEMP266 = (finished[pl]);
final int X10_TEMP267 = (X10_TEMP266 + X10_TEMP265);
finished[pl] = (X10_TEMP267);

}
}
else {
final int X10_TEMP269 = (runningPTotals[pl]);

final boolean X10_TEMP271 = X10_TEMP269>=expected1;
if (X10_TEMP271) {
int gsize = (sendGrids[pl]);
int i = (0);
int total = (0);
int oldTotal = (0);
boolean X10_TEMP277 = false;
do {
oldTotal = (total);
final int X10_TEMP281 = (sCountBuffer[pl,i]);

final int X10_TEMP283 = (total+X10_TEMP281);
total = (X10_TEMP283);
final int X10_TEMP284 = (i);
final int X10_TEMP285 = 1;
i = i + X10_TEMP285;

final boolean X10_TEMP286 = (total<lDeficit);
final boolean X10_TEMP287 = (i<gsize);
X10_TEMP277 = X10_TEMP286&&X10_TEMP287;
} while(X10_TEMP277);
final int X10_TEMP289 = (1);

double offset = (i-X10_TEMP289);
final boolean X10_TEMP292 = total>oldTotal;
if (X10_TEMP292) {
final int X10_TEMP294 = (lDeficit-oldTotal);

final double X10_TEMP296 = ((double)X10_TEMP294);
final int X10_TEMP298 = (total-oldTotal);

final double X10_TEMP300 = ((double)X10_TEMP298);

final double X10_TEMP302 = (X10_TEMP296/X10_TEMP300);

final double X10_TEMP304 = (offset+X10_TEMP302);
offset = (X10_TEMP304);
}
final int X10_TEMP308 = (runningGTotals[pl]);
final int X10_TEMP309 = (sendGrids[pl]);
final int X10_TEMP310 = (X10_TEMP308-X10_TEMP309);

final double X10_TEMP313 = (X10_TEMP310+offset);
final double X10_TEMP314 = (X10_TEMP313);
border[pl] = (X10_TEMP314);
}
}
final int X10_TEMP316 = (sendCount[pl]);

final boolean X10_TEMP318 = rDeficit>X10_TEMP316;
if (X10_TEMP318) {
final int X10_TEMP320 = (finished[pl]);
final int X10_TEMP321 = 1;
final int X10_TEMP322 = (finished[pl]);
final int X10_TEMP323 = (X10_TEMP322 + X10_TEMP321);
finished[pl] = (X10_TEMP323);

}
final place X10_TEMP324 = (here);
final boolean X10_TEMP325 = (X10_TEMP324.isFirst());

final boolean X10_TEMP327 = !X10_TEMP325;
if (X10_TEMP327) {
int gsize = (recvGrids[pl]);
final int X10_TEMP333 = (runningPTotals[pl]);
final int X10_TEMP334 = (sendCount[pl]);

final int X10_TEMP337 = (X10_TEMP333-X10_TEMP334);
final int X10_TEMP338 = (X10_TEMP337);
runningPTotals[pl] = (X10_TEMP338);
final int X10_TEMP342 = (runningGTotals[pl]);
final int X10_TEMP343 = (sendGrids[pl]);

final int X10_TEMP346 = (X10_TEMP342-X10_TEMP343);
final int X10_TEMP347 = (X10_TEMP346);
runningGTotals[pl] = (X10_TEMP347);
final int X10_TEMP352 = (recvCount[pl]);
final int X10_TEMP353 = (X10_TEMP352);
sendCount[pl] = (X10_TEMP353);
final int X10_TEMP358 = (recvGrids[pl]);
final int X10_TEMP359 = (X10_TEMP358);
sendGrids[pl] = (X10_TEMP359);
finish {
final int X10_TEMP365 = (0);
final int X10_TEMP363 = (1);
final int X10_TEMP366 = (gsize-X10_TEMP363);

final region(:rank==2) X10_TEMP368 = (region(:rank==2))([pl:pl,X10_TEMP365:X10_TEMP366]);
final place X10_TEMP369 = here;
for(point(:rank==2)pt:X10_TEMP368) {
async(X10_TEMP369) {
final int X10_TEMP374 = (rCountBuffer[pt]);
final int X10_TEMP375 = (X10_TEMP374);
sCountBuffer[pt] = (X10_TEMP375);
}
}
}
}
}
}
}
final int X10_TEMP376 = (Program.intrefArraySum1(finished));
final int X10_TEMP377 = (0);
X10_TEMP117 = X10_TEMP376!=X10_TEMP377;
} while(X10_TEMP117);
finish {
final dist(:rank==1) X10_TEMP380 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP381[pl]:X10_TEMP380) {
final place X10_TEMP382 = X10_TEMP380.get(X10_TEMP381);
async(X10_TEMP382) {
final dist(:rank==1) dPC = (dist(:rank==1))(particleCount.distribution);
final region(:rank==1) rLocal = (region(:rank==1))(Program.X10Util_get1DLRegion(dPC));
final int rsize = (rLocal.size());
final int X10_TEMP387 = (0);

final boolean X10_TEMP389 = (rsize>X10_TEMP387);
final boolean X10_TEMP390 = X10_TEMP389;
int X10_TEMP393 = 0;
if(X10_TEMP390){
X10_TEMP393 = rLocal.low();
}
final int X10_TEMP394 = X10_TEMP393;

final int offset = (X10_TEMP394);
int total = (0);
final dist(:rank==1) X10_TEMP396 = (dist(:rank==1))(particleCount.distribution);
final place X10_TEMP397 = (here);

final dist(:rank==1) X10_TEMP399 = (dist(:rank==1))(X10_TEMP396|X10_TEMP397);
for(point(:rank==1)[i]:X10_TEMP399) {
final int count = (particleCount[i]);
final int X10_TEMP404 = (i-offset);

final int X10_TEMP407 = (count);
sCountBuffer[pl,X10_TEMP404] = (X10_TEMP407);
final int X10_TEMP409 = (total+count);
total = (X10_TEMP409);
}
final int X10_TEMP414 = (particleTotals[pl]);
final int X10_TEMP415 = (X10_TEMP414);
runningPTotals[pl] = (X10_TEMP415);
final int X10_TEMP420 = (gridTotals[pl]);
final int X10_TEMP421 = (X10_TEMP420);
runningGTotals[pl] = (X10_TEMP421);
final int X10_TEMP425 = (total);
sendCount[pl] = (X10_TEMP425);
final int X10_TEMP429 = (rsize);
sendGrids[pl] = (X10_TEMP429);
final int X10_TEMP433 = (0);
final int X10_TEMP434 = (X10_TEMP433);
recvCount[pl] = (X10_TEMP434);
final int X10_TEMP438 = (0);
final int X10_TEMP439 = (X10_TEMP438);
recvGrids[pl] = (X10_TEMP439);
}
}
}
boolean X10_TEMP440 = false;
do {
finish {
final dist(:rank==1) X10_TEMP442 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP443[pl]:X10_TEMP442) {
final place X10_TEMP444 = X10_TEMP442.get(X10_TEMP443);
async(X10_TEMP444) {
final double X10_TEMP445 = (pl*countAve);
final double X10_TEMP446 = (0.5);

final double X10_TEMP448 = (X10_TEMP445+X10_TEMP446);

final int expected = ((int)X10_TEMP448);
final int X10_TEMP450 = (1);

final int X10_TEMP452 = (pl-X10_TEMP450);
final double X10_TEMP453 = (X10_TEMP452*countAve);
final double X10_TEMP454 = (0.5);

final double X10_TEMP456 = (X10_TEMP453+X10_TEMP454);

final int X10_TEMP458 = ((int)X10_TEMP456);
final int X10_TEMP460 = (runningPTotals[pl]);
final int X10_TEMP462 = (X10_TEMP458-X10_TEMP460);
final int X10_TEMP463 = (sendCount[pl]);

final int X10_TEMP465 = (X10_TEMP462+X10_TEMP463);

final int lDeficit = (X10_TEMP465);
final int X10_TEMP467 = (0);

final boolean X10_TEMP469 = lDeficit>X10_TEMP467;
if (X10_TEMP469) {
final int X10_TEMP475 = (0);
final int X10_TEMP472 = (sendGrids[pl]);
final int X10_TEMP473 = (1);
final int X10_TEMP476 = (X10_TEMP472-X10_TEMP473);

final region(:rank==1) dSBuffer = (region(:rank==1))([X10_TEMP475:X10_TEMP476]);
final int value[:rank==1] X10_TEMP482 = (int value[:rank==1])(new int value[dSBuffer](point(:rank==1)[i]) {
final int X10_TEMP481 = (sCountBuffer[pl,i]);
return X10_TEMP481;
}

);

final int value[:rank==1] sBuffer = (int value[:rank==1])(X10_TEMP482);
final int nCount = (sendCount[pl]);
final int nGrids = (sendGrids[pl]);
finish {
final place X10_TEMP488 = (here);

final place X10_TEMP490 = X10_TEMP488.prev();
async(X10_TEMP490) {
final place X10_TEMP491 = (here);

final int X10_TEMP493 = (X10_TEMP491.id);

final int X10_TEMP496 = (nCount);
recvCount[X10_TEMP493] = (X10_TEMP496);
final place X10_TEMP497 = (here);

final int X10_TEMP499 = (X10_TEMP497.id);

final int X10_TEMP502 = (nGrids);
recvGrids[X10_TEMP499] = (X10_TEMP502);
final place X10_TEMP504 = here;
for(point(:rank==1)[i]:dSBuffer) {
async(X10_TEMP504) {
final place X10_TEMP505 = (here);

final int X10_TEMP508 = (X10_TEMP505.id);

final int X10_TEMP512 = (sBuffer[i]);
final int X10_TEMP513 = (X10_TEMP512);
rCountBuffer[X10_TEMP508,i] = (X10_TEMP513);
}
}
}
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP515 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)X10_TEMP516[pl]:X10_TEMP515) {
final place X10_TEMP517 = X10_TEMP515.get(X10_TEMP516);
async(X10_TEMP517) {
final int X10_TEMP521 = (0);
final int X10_TEMP522 = (X10_TEMP521);
finished[pl] = (X10_TEMP522);
final double X10_TEMP523 = (pl*countAve);
final double X10_TEMP524 = (0.5);

final double X10_TEMP526 = (X10_TEMP523+X10_TEMP524);

final int expected1 = ((int)X10_TEMP526);
final int X10_TEMP528 = (1);

final int X10_TEMP530 = (pl-X10_TEMP528);
final double X10_TEMP531 = (X10_TEMP530*countAve);
final double X10_TEMP532 = (0.5);

final double X10_TEMP534 = (X10_TEMP531+X10_TEMP532);

final int expected2 = ((int)X10_TEMP534);
final int X10_TEMP537 = (runningPTotals[pl]);
final int X10_TEMP539 = (expected2-X10_TEMP537);
final int X10_TEMP540 = (sendCount[pl]);

final int lDeficit = (X10_TEMP539+X10_TEMP540);
final int X10_TEMP543 = (runningPTotals[pl]);

final int rDeficit = (X10_TEMP543-expected1);
final int X10_TEMP546 = (runningPTotals[pl]);

final boolean X10_TEMP548 = X10_TEMP546<expected1;
if (X10_TEMP548) {
final int X10_TEMP551 = (runningPTotals[pl]);
final int X10_TEMP552 = (recvCount[pl]);
final int X10_TEMP553 = (X10_TEMP551+X10_TEMP552);

final boolean X10_TEMP555 = X10_TEMP553>=expected1;
if (X10_TEMP555) {
final int gsize = (recvGrids[pl]);
int oldTotal = (0);
int total = (0);
int i = (0);
boolean X10_TEMP561 = false;
do {
oldTotal = (total);
final int X10_TEMP565 = (rCountBuffer[pl,i]);

final int X10_TEMP567 = (total+X10_TEMP565);
total = (X10_TEMP567);
final int X10_TEMP568 = (i);
final int X10_TEMP569 = 1;
i = i + X10_TEMP569;

final int X10_TEMP570 = 0;
final int X10_TEMP571 = (X10_TEMP570 - rDeficit);
final boolean X10_TEMP572 = (total<X10_TEMP571);
final boolean X10_TEMP573 = (i<gsize);
X10_TEMP561 = X10_TEMP572&&X10_TEMP573;
} while(X10_TEMP561);
final int X10_TEMP575 = (1);
final int X10_TEMP588 = (i-X10_TEMP575);
final int X10_TEMP576 = 0;
final int X10_TEMP577 = (X10_TEMP576 - rDeficit);

final int X10_TEMP579 = (X10_TEMP577-oldTotal);

final double X10_TEMP581 = ((double)X10_TEMP579);
final int X10_TEMP583 = (total-oldTotal);

final double X10_TEMP585 = ((double)X10_TEMP583);

final double X10_TEMP587 = (X10_TEMP581/X10_TEMP585);

final double X10_TEMP590 = (X10_TEMP588+X10_TEMP587);

final int offset = ((int)X10_TEMP590);
final int X10_TEMP594 = (runningGTotals[pl]);

final double X10_TEMP597 = (X10_TEMP594+offset);
final double X10_TEMP598 = (X10_TEMP597);
border[pl] = (X10_TEMP598);
}
else {
final int X10_TEMP600 = (finished[pl]);
final int X10_TEMP601 = 1;
final int X10_TEMP602 = (finished[pl]);
final int X10_TEMP603 = (X10_TEMP602 + X10_TEMP601);
finished[pl] = (X10_TEMP603);

}
}
final int X10_TEMP605 = (sendCount[pl]);

final boolean X10_TEMP607 = lDeficit>X10_TEMP605;
if (X10_TEMP607) {
final int X10_TEMP609 = (finished[pl]);
final int X10_TEMP610 = 1;
final int X10_TEMP611 = (finished[pl]);
final int X10_TEMP612 = (X10_TEMP611 + X10_TEMP610);
finished[pl] = (X10_TEMP612);

}
final place X10_TEMP613 = (here);
final boolean X10_TEMP614 = (X10_TEMP613.isLast());

final boolean X10_TEMP616 = !X10_TEMP614;
if (X10_TEMP616) {
final int count = (recvCount[pl]);
final int gsize = (recvGrids[pl]);
final int X10_TEMP623 = (runningPTotals[pl]);

final int X10_TEMP626 = (X10_TEMP623+count);
final int X10_TEMP627 = (X10_TEMP626);
runningPTotals[pl] = (X10_TEMP627);
final int X10_TEMP630 = (runningGTotals[pl]);

final int X10_TEMP633 = (X10_TEMP630+gsize);
final int X10_TEMP634 = (X10_TEMP633);
runningGTotals[pl] = (X10_TEMP634);
final int X10_TEMP638 = (count);
sendCount[pl] = (X10_TEMP638);
final int X10_TEMP642 = (gsize);
sendGrids[pl] = (X10_TEMP642);
final int X10_TEMP648 = (0);
final int X10_TEMP646 = (1);
final int X10_TEMP649 = (gsize-X10_TEMP646);

final region(:rank==2) X10_TEMP651 = (region(:rank==2))([pl:pl,X10_TEMP648:X10_TEMP649]);
final place X10_TEMP652 = here;
for(point(:rank==2)pt:X10_TEMP651) {
async(X10_TEMP652) {
final int X10_TEMP657 = (rCountBuffer[pt]);
final int X10_TEMP658 = (X10_TEMP657);
sCountBuffer[pt] = (X10_TEMP658);
}
}
}
}
}
}
final int X10_TEMP659 = (Program.intrefArraySum1(finished));
final int X10_TEMP660 = (0);
X10_TEMP440 = X10_TEMP659!=X10_TEMP660;
} while(X10_TEMP440);
final place pHere = (here);
final int X10_TEMP665 = (0);
final int X10_TEMP666 = (place.MAX_PLACES);
final region(:rank==1) X10_TEMP667 = (region(:rank==1))([X10_TEMP665:X10_TEMP666]);
final place X10_TEMP668 = (here);

final dist(:rank==1) dBounds = (dist(:rank==1))(X10_TEMP667->X10_TEMP668);
final int[:rank==1] lowerbounds = (int[:rank==1])(new int[dBounds]);
final int[:rank==1] upperbounds = (int[:rank==1])(new int[dBounds]);
finish {
final dist(:rank==1) X10_TEMP673 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP673) {
final place X10_TEMP674 = X10_TEMP673.get(pl);
async(X10_TEMP674) {
final double edge = (border[pl]);
async(pHere) {
final double X10_TEMP679 = (0.5);

final double X10_TEMP681 = (edge+X10_TEMP679);

final int X10_TEMP684 = ((int)X10_TEMP681);
final int X10_TEMP685 = (X10_TEMP684);
lowerbounds[pl] = (X10_TEMP685);
}
}
}
}
final int X10_TEMP690 = (0);
final int X10_TEMP687 = (place.MAX_PLACES);
final int X10_TEMP688 = (1);
final int X10_TEMP691 = (X10_TEMP687-X10_TEMP688);

final region(:rank==1) X10_TEMP693 = (region(:rank==1))([X10_TEMP690:X10_TEMP691]);
for(point(:rank==1)i:X10_TEMP693) {
final int lb = (lowerbounds[i]);
final int X10_TEMP697 = (i[0]);
final int X10_TEMP698 = (1);
final int X10_TEMP703 = (X10_TEMP697+X10_TEMP698);
final int X10_TEMP700 = (place.MAX_PLACES);
final int X10_TEMP701 = (1);
final int X10_TEMP704 = (X10_TEMP700-X10_TEMP701);

final region(:rank==1) X10_TEMP706 = (region(:rank==1))([X10_TEMP703:X10_TEMP704]);
for(point(:rank==1)j:X10_TEMP706) {
final int X10_TEMP708 = (lowerbounds[j]);

final boolean X10_TEMP710 = X10_TEMP708<=lb;
if (X10_TEMP710) {
final int X10_TEMP712 = (1);

final int X10_TEMP715 = (lb+X10_TEMP712);
final int X10_TEMP716 = (X10_TEMP715);
lowerbounds[j] = (X10_TEMP716);
}
}
}
final int X10_TEMP721 = (0);
final int X10_TEMP718 = (place.MAX_PLACES);
final int X10_TEMP719 = (2);
final int X10_TEMP722 = (X10_TEMP718-X10_TEMP719);

final region(:rank==1) X10_TEMP724 = (region(:rank==1))([X10_TEMP721:X10_TEMP722]);
for(point(:rank==1)i:X10_TEMP724) {
int X10_TEMP727 = (1);

final point(:rank==1) X10_TEMP729 = (i+[X10_TEMP727]);
final int X10_TEMP730 = (lowerbounds[X10_TEMP729]);
final int X10_TEMP731 = (1);

final int X10_TEMP734 = (X10_TEMP730-X10_TEMP731);
final int X10_TEMP735 = (X10_TEMP734);
upperbounds[i] = (X10_TEMP735);
}
final int X10_TEMP736 = (place.MAX_PLACES);
final int X10_TEMP737 = (1);

final int X10_TEMP739 = (X10_TEMP736-X10_TEMP737);

final int X10_TEMP740 = (1);

final int X10_TEMP743 = (_LinearESOpenPIC2D_YLENGTH-X10_TEMP740);
final int X10_TEMP744 = (X10_TEMP743);
upperbounds[X10_TEMP739] = (X10_TEMP744);
final int X10_TEMP745 = 0;
final int X10_TEMP746 = 1;
final int X10_TEMP747 = X10_TEMP745 - X10_TEMP746;
final region(:rank==2) X10_TEMP748 = (region(:rank==2))([X10_TEMP745:X10_TEMP747, X10_TEMP745:X10_TEMP747]);
final place X10_TEMP749 = (here);

final dist(:rank==2) X10_TEMP751 = (dist(:rank==2))(X10_TEMP748->X10_TEMP749);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP751);
final dist(:rank==1) X10_TEMP754 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP754) {
final dist(:rank==1) X10_TEMP755 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP755.get(pl));
final int X10_TEMP762 = (lowerbounds[pl]);
final int X10_TEMP763 = (upperbounds[pl]);
final region(:rank==2) X10_TEMP765 = (region(:rank==2))([X10_TEMP762:X10_TEMP763,rRows]);

final dist(:rank==2) X10_TEMP767 = (dist(:rank==2))(X10_TEMP765->p);

final dist(:rank==2) X10_TEMP769 = (dist(:rank==2))(dResult||X10_TEMP767);
dResult = (dist(:rank==2))(X10_TEMP769);
}
return dResult;
}
public static Particle [:rank==1] LinearESOpenPIC2D_sortParticles(final LinearESOpenPIC2D X10_TEMP0, final Particle [:rank==1] particles, final dist(:rank==2) dField) {
final dist(:rank==1) dParticles = (dist(:rank==1))(particles.distribution);
final Particle[:rank==1] result = (Particle[:rank==1])(new Particle[dParticles]);
final int[:rank==1] indices = (int[:rank==1])(new int[dParticles]);
final int X10_TEMP6 = (0);

final dist(:rank==1) dCount = (dist(:rank==1))(Program.X10Util_get2DDistRank(dField,X10_TEMP6));
final int[:rank==1] count = (int[:rank==1])(new int[dCount](point(:rank==1)pt) {
final int X10_TEMP9 = (0);
return X10_TEMP9;
}

);
finish {
final dist(:rank==1) X10_TEMP12 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP12) {
final place X10_TEMP13 = X10_TEMP12.get(pl);
async(X10_TEMP13) {
final dist(:rank==1) dP = (dist(:rank==1))(particles.distribution);
final region(:rank==1) rLocalP = (region(:rank==1))(Program.X10Util_get1DLRegion(dP));
final region(:rank==1) rLocalC = (region(:rank==1))(Program.X10Util_get1DLRegion(dCount));
final dist(:rank==1) X10_TEMP19 = (dist(:rank==1))(particles.distribution);
final place X10_TEMP20 = (here);

final dist(:rank==1) X10_TEMP22 = (dist(:rank==1))(X10_TEMP19|X10_TEMP20);
for(point(:rank==1)pt:X10_TEMP22) {
final Particle X10_TEMP24 = (particles[pt]);
final double X10_TEMP25 = (Program.Particle_getY(X10_TEMP24));

final int y = ((int)X10_TEMP25);
final int X10_TEMP28 = (count[y]);
final int X10_TEMP29 = 1;
final int X10_TEMP30 = (count[y]);
final int X10_TEMP31 = (X10_TEMP30 + X10_TEMP29);
count[y] = (X10_TEMP31);

final int X10_TEMP35 = (y);
indices[pt] = (X10_TEMP35);
}
final place X10_TEMP36 = (here);

final dist(:rank==1) dLocalC = (dist(:rank==1))(rLocalC->X10_TEMP36);
final int X10_TEMP38 = (rLocalP.size());
final int X10_TEMP39 = (0);

final boolean X10_TEMP41 = (X10_TEMP38>X10_TEMP39);
final boolean X10_TEMP42 = X10_TEMP41;
int X10_TEMP45 = 0;
if(X10_TEMP42){
X10_TEMP45 = rLocalP.low();
}
final int X10_TEMP46 = X10_TEMP45;

int offset = (X10_TEMP46);
int[:rank==1] offsets = (int[:rank==1])(new int[dLocalC]);
for(point(:rank==1)pt:rLocalC) {
final int n = (count[pt]);
final int X10_TEMP54 = (offset);
offsets[pt] = (X10_TEMP54);
final int X10_TEMP56 = (offset+n);
offset = (X10_TEMP56);
}
for(point(:rank==1)pt:rLocalP) {
final int index = (indices[pt]);
final int X10_TEMP64 = (offsets[index]);
final int X10_TEMP65 = (X10_TEMP64);
indices[pt] = (X10_TEMP65);
final int X10_TEMP67 = (offsets[index]);
final int X10_TEMP68 = 1;
final int X10_TEMP69 = (offsets[index]);
final int X10_TEMP70 = (X10_TEMP69 + X10_TEMP68);
offsets[index] = (X10_TEMP70);

}
final place X10_TEMP72 = here;
for(point(:rank==1)i:rLocalP) {
async(X10_TEMP72) {
final int X10_TEMP75 = (indices[i]);

final Particle X10_TEMP79 = (particles[i]);
final Particle X10_TEMP80 = (X10_TEMP79);
result[X10_TEMP75] = (X10_TEMP80);
}
}
}
}
}
return result;
}
public static int [:rank==1] LinearESOpenPIC2D_parallelPrefix(final LinearESOpenPIC2D X10_TEMP0, final int [:rank==1] data) {
final dist(:rank==1) dData = (dist(:rank==1))(data.distribution);
final int[:rank==1] result = (int[:rank==1])(new int[dData](point(:rank==1)pt) {
final int X10_TEMP4 = (data[pt]);
return X10_TEMP4;
}

);
final int[:rank==1] tmp1 = (int[:rank==1])(new int[dData](point(:rank==1)pt) {
final int X10_TEMP8 = (data[pt]);
return X10_TEMP8;
}

);
final int[:rank==1] tmp2 = (int[:rank==1])(new int[dData](point(:rank==1)pt) {
final int X10_TEMP11 = (0);
return X10_TEMP11;
}

);
int strides = (1);
final int X10_TEMP14 = (place.MAX_PLACES);
boolean X10_TEMP18 = strides<X10_TEMP14;
while(X10_TEMP18) {
final int stride = (strides);
finish {
final dist(:rank==1) X10_TEMP21 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP21) {
final place X10_TEMP22 = X10_TEMP21.get(pl);
async(X10_TEMP22) {
final int X10_TEMP24 = (pl[0]);

final int X10_TEMP26 = (X10_TEMP24/stride);
final int X10_TEMP27 = (2);

final int dir = (X10_TEMP26%X10_TEMP27);
final int val = (tmp1[pl]);
final int X10_TEMP43 = (pl[0]);
final int X10_TEMP32 = (0);

final boolean X10_TEMP34 = (dir==X10_TEMP32);
final boolean X10_TEMP35 = X10_TEMP34;
final int X10_TEMP37 = (1);
final int X10_TEMP38 = 0;
int X10_TEMP40 = X10_TEMP38 - X10_TEMP37;
if(X10_TEMP35){
X10_TEMP40 = 1;
}
final int X10_TEMP41 = X10_TEMP40;

final int X10_TEMP42 = (X10_TEMP41);
final int X10_TEMP44 = (X10_TEMP42*stride);

final int X10_TEMP46 = (X10_TEMP43+X10_TEMP44);

final place pDst = (place.places(X10_TEMP46));
finish {
async(pDst) {
final int X10_TEMP49 = (0);

final boolean X10_TEMP51 = dir==X10_TEMP49;
if (X10_TEMP51) {
final place X10_TEMP52 = (here);

final int X10_TEMP54 = (X10_TEMP52.id);

final place X10_TEMP55 = (here);

final int X10_TEMP57 = (X10_TEMP55.id);
final int X10_TEMP58 = (result[X10_TEMP57]);

final int X10_TEMP61 = (X10_TEMP58+val);
final int X10_TEMP62 = (X10_TEMP61);
result[X10_TEMP54] = (X10_TEMP62);
}
final place X10_TEMP63 = (here);

final int X10_TEMP65 = (X10_TEMP63.id);

final int X10_TEMP68 = (val);
tmp2[X10_TEMP65] = (X10_TEMP68);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP70 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP70) {
final place X10_TEMP71 = X10_TEMP70.get(pl);
async(X10_TEMP71) {
final int X10_TEMP75 = (tmp1[pl]);
final int X10_TEMP76 = (tmp2[pl]);

final int X10_TEMP79 = (X10_TEMP75+X10_TEMP76);
final int X10_TEMP80 = (X10_TEMP79);
tmp1[pl] = (X10_TEMP80);
}
}
}
final int X10_TEMP82 = (strides+strides);
strides = (X10_TEMP82);
final int X10_TEMP16 = (place.MAX_PLACES);
X10_TEMP18 = strides<X10_TEMP16;
}
return result;
}
public static double Particle_getX(final Particle X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.x);
return X10_TEMP2;
}
public static double Particle_getY(final Particle X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.y);
return X10_TEMP2;
}
public static double Particle_getXVel(final Particle X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.xVel);
return X10_TEMP2;
}
public static double Particle_getYVel(final Particle X10_TEMP0) {
final double X10_TEMP2 = (X10_TEMP0.yVel);
return X10_TEMP2;
}
public static Particle Particle_setX(final Particle X10_TEMP0, final double x) {
double X10_TEMP6 = (X10_TEMP0.y);
double X10_TEMP7 = (X10_TEMP0.xVel);
double X10_TEMP8 = (X10_TEMP0.yVel);
int X10_TEMP9 = (X10_TEMP0.pid);

final Particle X10_TEMP11 = (new Particle(x,X10_TEMP6,X10_TEMP7,X10_TEMP8,X10_TEMP9));
return X10_TEMP11;
}
public static Particle Particle_setY(final Particle X10_TEMP0, final double y) {
double X10_TEMP6 = (X10_TEMP0.x);
double X10_TEMP7 = (X10_TEMP0.xVel);
double X10_TEMP8 = (X10_TEMP0.yVel);
int X10_TEMP9 = (X10_TEMP0.pid);

final Particle X10_TEMP11 = (new Particle(X10_TEMP6,y,X10_TEMP7,X10_TEMP8,X10_TEMP9));
return X10_TEMP11;
}
public static Particle Particle_setXVel(final Particle X10_TEMP0, final double xVel) {
double X10_TEMP6 = (X10_TEMP0.x);
double X10_TEMP7 = (X10_TEMP0.y);
double X10_TEMP8 = (X10_TEMP0.yVel);
int X10_TEMP9 = (X10_TEMP0.pid);

final Particle X10_TEMP11 = (new Particle(X10_TEMP6,X10_TEMP7,xVel,X10_TEMP8,X10_TEMP9));
return X10_TEMP11;
}
public static Particle Particle_setYVel(final Particle X10_TEMP0, final double yVel) {
double X10_TEMP6 = (X10_TEMP0.x);
double X10_TEMP7 = (X10_TEMP0.y);
double X10_TEMP8 = (X10_TEMP0.xVel);
int X10_TEMP9 = (X10_TEMP0.pid);

final Particle X10_TEMP11 = (new Particle(X10_TEMP6,X10_TEMP7,X10_TEMP8,yVel,X10_TEMP9));
return X10_TEMP11;
}
public static Particle Particle_setPos(final Particle X10_TEMP0, final double x, final double y) {
double X10_TEMP6 = (X10_TEMP0.xVel);
double X10_TEMP7 = (X10_TEMP0.yVel);
int X10_TEMP8 = (X10_TEMP0.pid);

final Particle X10_TEMP10 = (new Particle(x,y,X10_TEMP6,X10_TEMP7,X10_TEMP8));
return X10_TEMP10;
}
public static Particle Particle_setVel(final Particle X10_TEMP0, final double xVel, final double yVel) {
double X10_TEMP6 = (X10_TEMP0.x);
double X10_TEMP7 = (X10_TEMP0.y);
int X10_TEMP8 = (X10_TEMP0.pid);

final Particle X10_TEMP10 = (new Particle(X10_TEMP6,X10_TEMP7,xVel,yVel,X10_TEMP8));
return X10_TEMP10;
}
public static String Particle_toString(final Particle X10_TEMP0) {
final int X10_TEMP1 = (X10_TEMP0.pid);
final int X10_TEMP2 = (0);

final boolean X10_TEMP4 = (X10_TEMP1>=X10_TEMP2);
final boolean X10_TEMP5 = X10_TEMP4;
final String X10_TEMP6 = ("p");
final int X10_TEMP7 = (X10_TEMP0.pid);
String X10_TEMP10 = "";
if(X10_TEMP5){
X10_TEMP10 = X10_TEMP6+X10_TEMP7;
}
final String X10_TEMP11 = X10_TEMP10;

String result = (X10_TEMP11);
final String X10_TEMP12 = ("(");
final String X10_TEMP13 = (result+X10_TEMP12);
final double X10_TEMP14 = (X10_TEMP0.x);
final String X10_TEMP15 = (X10_TEMP13+X10_TEMP14);
final String X10_TEMP16 = (",");
final String X10_TEMP17 = (X10_TEMP15+X10_TEMP16);
final double X10_TEMP18 = (X10_TEMP0.y);
final String X10_TEMP19 = (X10_TEMP17+X10_TEMP18);
final String X10_TEMP20 = (",");
final String X10_TEMP21 = (X10_TEMP19+X10_TEMP20);
final double X10_TEMP22 = (X10_TEMP0.xVel);
final String X10_TEMP23 = (X10_TEMP21+X10_TEMP22);
final String X10_TEMP24 = (",");
final String X10_TEMP25 = (X10_TEMP23+X10_TEMP24);
final double X10_TEMP26 = (X10_TEMP0.yVel);
final String X10_TEMP27 = (X10_TEMP25+X10_TEMP26);
final String X10_TEMP28 = (")");

final String X10_TEMP30 = (X10_TEMP27+X10_TEMP28);
result = (X10_TEMP30);
return result;
}
public static boolean Particle_particleEquals(final Particle X10_TEMP0, final Particle p) {
final double error = (_X10Util_ERROR);
final int X10_TEMP2 = (X10_TEMP0.pid);
final int X10_TEMP3 = (0);
final boolean X10_TEMP6 = (X10_TEMP2>=X10_TEMP3);
final int X10_TEMP4 = (X10_TEMP0.pid);
final int X10_TEMP5 = (p.pid);
final boolean X10_TEMP7 = (X10_TEMP4!=X10_TEMP5);

final boolean X10_TEMP9 = X10_TEMP6&&X10_TEMP7;
if (X10_TEMP9) {
final boolean X10_TEMP11 = (false);
return X10_TEMP11;
}
final double X10_TEMP12 = (Program.Particle_getX(X10_TEMP0));
final double X10_TEMP13 = (Program.Particle_getX(p));
final double X10_TEMP15 = (X10_TEMP12-X10_TEMP13);
final double X10_TEMP16 = (Math.abs(X10_TEMP15));

final boolean X10_TEMP18 = (X10_TEMP16<error);
final double X10_TEMP19 = (Program.Particle_getY(X10_TEMP0));
final double X10_TEMP20 = (Program.Particle_getY(p));
final double X10_TEMP22 = (X10_TEMP19-X10_TEMP20);
final double X10_TEMP23 = (Math.abs(X10_TEMP22));

final boolean X10_TEMP25 = (X10_TEMP23<error);
final boolean X10_TEMP33 = (X10_TEMP18&&X10_TEMP25);
final double X10_TEMP26 = (Program.Particle_getXVel(X10_TEMP0));
final double X10_TEMP27 = (Program.Particle_getXVel(p));
final double X10_TEMP29 = (X10_TEMP26-X10_TEMP27);
final double X10_TEMP30 = (Math.abs(X10_TEMP29));

final boolean X10_TEMP32 = (X10_TEMP30<error);
final boolean X10_TEMP41 = (X10_TEMP33&&X10_TEMP32);
final double X10_TEMP34 = (Program.Particle_getYVel(X10_TEMP0));
final double X10_TEMP35 = (Program.Particle_getYVel(p));
final double X10_TEMP37 = (X10_TEMP34-X10_TEMP35);
final double X10_TEMP38 = (Math.abs(X10_TEMP37));

final boolean X10_TEMP40 = (X10_TEMP38<error);

final boolean X10_TEMP43 = (X10_TEMP41&&X10_TEMP40);

return X10_TEMP43;
}
public static double _PoissonSolver_PI4I_init() {
final double X10_TEMP1 = (0.5);
final double X10_TEMP2 = (6.28318530717959);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _PoissonSolver_SQT2I_init() {

final double X10_TEMP2 = (0.707106781186548);
return X10_TEMP2;
}
public static double _PoissonSolver_SQT2PI_init() {

final double X10_TEMP2 = (0.797884560802865);
return X10_TEMP2;
}
public static int _PoissonSolver_GREENS_IDX_init() {

final int X10_TEMP2 = (0);
return X10_TEMP2;
}
public static int _PoissonSolver_SHAPE_IDX_init() {

final int X10_TEMP2 = (1);
return X10_TEMP2;
}
public static int _PoissonSolver_ELECX_IDX_init() {

final int X10_TEMP2 = (2);
return X10_TEMP2;
}
public static int _PoissonSolver_ELECY_IDX_init() {

final int X10_TEMP2 = (3);
return X10_TEMP2;
}
public static double _PoissonSolver_AR_init() {

final double X10_TEMP2 = (0.912871);
return X10_TEMP2;
}
public static Complex [:rank==2] PoissonSolver_makeForceArray(final PoissonSolver X10_TEMP0) {
final int X10_TEMP7 = (0);
final int X10_TEMP2 = (2);
final int X10_TEMP3 = (X10_TEMP0.y);
final int X10_TEMP4 = (X10_TEMP2*X10_TEMP3);
final int X10_TEMP5 = (1);
final int X10_TEMP8 = (X10_TEMP4-X10_TEMP5);
final int X10_TEMP13 = (0);
final int X10_TEMP10 = (X10_TEMP0.x);
final int X10_TEMP11 = (1);
final int X10_TEMP14 = (X10_TEMP10-X10_TEMP11);

final region(:rank==2) X10_TEMP16 = (region(:rank==2))([X10_TEMP7:X10_TEMP8,X10_TEMP13:X10_TEMP14]);

final dist(:rank==2) dResult = (dist(:rank==2))(Program.X10Util_distBlockStar1(X10_TEMP16));
final Complex[:rank==2] X10_TEMP19 = (Complex[:rank==2&&distribution==dResult])(new Complex[dResult]);
return X10_TEMP19;
}
public static double PoissonSolver_getForceCharge(final PoissonSolver X10_TEMP0, final Complex [:rank==2] q, final Complex [:rank==2] forceX, final Complex [:rank==2] forceY) {
final int X10_TEMP5 = (0);
final int X10_TEMP2 = (X10_TEMP0.x);
final int X10_TEMP3 = (1);
final int X10_TEMP6 = (X10_TEMP2-X10_TEMP3);
final int X10_TEMP13 = (0);
final int X10_TEMP8 = (2);
final int X10_TEMP9 = (X10_TEMP0.y);
final int X10_TEMP10 = (X10_TEMP8*X10_TEMP9);
final int X10_TEMP11 = (1);
final int X10_TEMP14 = (X10_TEMP10-X10_TEMP11);

final region(:rank==2) X10_TEMP16 = (region(:rank==2))([X10_TEMP5:X10_TEMP6,X10_TEMP13:X10_TEMP14]);

final dist(:rank==2) dForce = (dist(:rank==2))(Program.X10Util_distBlockStar1(X10_TEMP16));
final Complex[:rank==2] fxfft = (Complex[:rank==2])(new Complex[dForce]);
final Complex[:rank==2] fyfft = (Complex[:rank==2])(new Complex[dForce]);
final FourierTransform2D X10_TEMP20 = (X10_TEMP0.fft);

final Complex[:rank==2] qfft = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformC(X10_TEMP20,q));
final double we = (Program.PoissonSolver_solveForceCharge(X10_TEMP0,qfft,fxfft,fyfft));
final FourierTransform2D X10_TEMP27 = (X10_TEMP0.fft);

final Complex[:rank==2] fx = (Complex[:rank==2])(Program.FourierTransform2D_transformC(X10_TEMP27,fxfft));
final FourierTransform2D X10_TEMP30 = (X10_TEMP0.fft);

final Complex[:rank==2] fy = (Complex[:rank==2])(Program.FourierTransform2D_transformC(X10_TEMP30,fyfft));
finish {
for(point(:rank==2)pt:forceX) {
final dist(:rank==2) X10_TEMP34 = (dist(:rank==2)) (forceX.distribution);
final place X10_TEMP35 = X10_TEMP34.get(pt);
async(X10_TEMP35) {
final Complex X10_TEMP40 = (fx[pt]);
final Complex X10_TEMP41 = (X10_TEMP40);
forceX[pt] = (X10_TEMP41);
final Complex X10_TEMP46 = (fy[pt]);
final Complex X10_TEMP47 = (X10_TEMP46);
forceY[pt] = (X10_TEMP47);
}
}
}
return we;
}
public static double PoissonSolver_solveForceCharge(final PoissonSolver X10_TEMP0, final Complex [:rank==2] q, final Complex [:rank==2] forceX, final Complex [:rank==2] forceY) {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) dUnique = (dist(:rank==1))(X10_TEMP1);
final double[:rank==1] energy = (double[:rank==1])(new double[dUnique](point(:rank==1)pt) {
final double X10_TEMP4 = (0.0);
return X10_TEMP4;
}

);
final dist(:rank==1) X10_TEMP7 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP7) {
finish {
final dist(:rank==1) X10_TEMP8 = (dist(:rank==1))(dist.UNIQUE);

final place X10_TEMP11 = X10_TEMP8.get(pl);
async(X10_TEMP11) {
final int X10_TEMP13 = (pl[0]);
final int X10_TEMP14 = (X10_TEMP0.x);

final boolean X10_TEMP16 = X10_TEMP13<=X10_TEMP14;
if (X10_TEMP16) {
final double[:rank==3] X10_TEMP17 = (double[:rank==3])(X10_TEMP0.ffg);

final dist(:rank==3) dFFG = (dist(:rank==3))(X10_TEMP17.distribution);
final region(:rank==3) rLocal = (region(:rank==3))(Program.X10Util_get3DLRegion(dFFG));
final int X10_TEMP23 = (0);

final region(:rank==1) rLocal1 = (region(:rank==1))(Program.X10Util_getRank3D(rLocal,X10_TEMP23));
final int X10_TEMP27 = (1);

final region(:rank==1) rLocal2 = (region(:rank==1))(Program.X10Util_getRank3D(rLocal,X10_TEMP27));
final double X10_TEMP29 = (1.0);
final int X10_TEMP30 = 0;

double tmp3 = (X10_TEMP30 - X10_TEMP29);
for(point(:rank==1)[i]:rLocal1) {
final int X10_TEMP33 = (2);
final int X10_TEMP34 = (i%X10_TEMP33);
final int X10_TEMP35 = (0);

final boolean X10_TEMP37 = (X10_TEMP34==X10_TEMP35);
final boolean X10_TEMP38 = X10_TEMP37;
final double X10_TEMP40 = (1.0);
final int X10_TEMP41 = 0;
double X10_TEMP43 = X10_TEMP41 - X10_TEMP40;
if(X10_TEMP38){
X10_TEMP43 = 1.0;
}
final double X10_TEMP44 = X10_TEMP43;

tmp3 = (X10_TEMP44);
final int X10_TEMP45 = (0);

final boolean X10_TEMP47 = i>X10_TEMP45;
if (X10_TEMP47) {
final double[:rank==3] X10_TEMP48 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP52 = (0);

double tmp2 = (X10_TEMP48[i,X10_TEMP52,_PoissonSolver_ELECY_IDX]);
final int X10_TEMP58 = (1);
final int X10_TEMP55 = (X10_TEMP0.y);
final int X10_TEMP56 = (1);
final int X10_TEMP59 = (X10_TEMP55-X10_TEMP56);

final region(:rank==1) X10_TEMP61 = (region(:rank==1))([X10_TEMP58:X10_TEMP59]);
for(point(:rank==1)[j1]:X10_TEMP61) {
final int X10_TEMP62 = (2);
final int X10_TEMP63 = (X10_TEMP0.y);
final int X10_TEMP64 = (X10_TEMP62*X10_TEMP63);

final int j2 = (X10_TEMP64-j1);
final place X10_TEMP66 = (here);

final boolean X10_TEMP68 = (X10_TEMP66.isFirst());
final boolean X10_TEMP69 = X10_TEMP68;
final double[:rank==3] X10_TEMP70 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP74 = (0);
final double value[:rank==2] X10_TEMP76 = (double value[:rank==2])(X10_TEMP0.ffg2);
double X10_TEMP80 = X10_TEMP76[j1,_PoissonSolver_ELECX_IDX];
if(X10_TEMP69){
X10_TEMP80 = X10_TEMP70[X10_TEMP74,j1,_PoissonSolver_ELECX_IDX];
}
final double X10_TEMP81 = X10_TEMP80;

final double X10_TEMP82 = (X10_TEMP81);

final double tmp0 = (X10_TEMP82);
final double tmp1 = (tmp3*tmp0);
final int X10_TEMP85 = 0;

final double X10_TEMP87 = (X10_TEMP85 - tmp2);
tmp2 = (X10_TEMP87);
final double[:rank==3] X10_TEMP89 = (double[:rank==3])(X10_TEMP0.ffg);

double X10_TEMP94 = (X10_TEMP89[i,j1,_PoissonSolver_ELECX_IDX]);

final Complex cx = (new Complex(tmp1,X10_TEMP94));
final double[:rank==3] X10_TEMP97 = (double[:rank==3])(X10_TEMP0.ffg);

double X10_TEMP102 = (X10_TEMP97[i,j1,_PoissonSolver_ELECY_IDX]);

final Complex cy = (new Complex(tmp2,X10_TEMP102));
final Complex X10_TEMP109 = (q[i,j1]);

final Complex X10_TEMP112 = (Program.Complex_mult(cx,X10_TEMP109));
final Complex X10_TEMP113 = (X10_TEMP112);
forceX[i,j1] = (X10_TEMP113);
final Complex X10_TEMP119 = (q[i,j2]);

final Complex X10_TEMP122 = (Program.Complex_mult(cx,X10_TEMP119));
final Complex X10_TEMP123 = (X10_TEMP122);
forceX[i,j2] = (X10_TEMP123);
final Complex X10_TEMP129 = (q[i,j1]);

final Complex X10_TEMP132 = (Program.Complex_mult(cy,X10_TEMP129));
final Complex X10_TEMP133 = (X10_TEMP132);
forceY[i,j1] = (X10_TEMP133);
final Complex X10_TEMP137 = (Program.Complex_getConjg(cy));
final Complex X10_TEMP141 = (q[i,j2]);

final Complex X10_TEMP144 = (Program.Complex_mult(X10_TEMP137,X10_TEMP141));
final Complex X10_TEMP145 = (X10_TEMP144);
forceY[i,j2] = (X10_TEMP145);
final double X10_TEMP165 = (energy[pl]);
final double[:rank==3] X10_TEMP148 = (double[:rank==3])(X10_TEMP0.ffg);
final double X10_TEMP162 = (X10_TEMP148[i,j1,_PoissonSolver_GREENS_IDX]);
final Complex X10_TEMP154 = (q[i,j1]);
final double X10_TEMP158 = (Program.Complex_multConjg(X10_TEMP154));
final Complex X10_TEMP157 = (q[i,j2]);
final double X10_TEMP159 = (Program.Complex_multConjg(X10_TEMP157));

final double X10_TEMP161 = (X10_TEMP158+X10_TEMP159);

final double X10_TEMP164 = (X10_TEMP162*X10_TEMP161);

final double X10_TEMP168 = (X10_TEMP165+X10_TEMP164);
final double X10_TEMP169 = (X10_TEMP168);
energy[pl] = (X10_TEMP169);
}
final place X10_TEMP170 = (here);

final boolean X10_TEMP172 = (X10_TEMP170.isFirst());
final boolean X10_TEMP173 = X10_TEMP172;
final double[:rank==3] X10_TEMP174 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP178 = (0);
final int X10_TEMP179 = (0);
final double value[:rank==2] X10_TEMP181 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP184 = (0);
double X10_TEMP186 = X10_TEMP181[X10_TEMP184,_PoissonSolver_ELECX_IDX];
if(X10_TEMP173){
X10_TEMP186 = X10_TEMP174[X10_TEMP178,X10_TEMP179,_PoissonSolver_ELECX_IDX];
}
final double X10_TEMP187 = X10_TEMP186;

final double X10_TEMP188 = (X10_TEMP187);

double tmp0 = (X10_TEMP188);
double tmp1 = (tmp3*tmp0);
final double[:rank==3] X10_TEMP192 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP196 = (0);

double X10_TEMP198 = (X10_TEMP192[i,X10_TEMP196,_PoissonSolver_ELECX_IDX]);

final Complex x0 = (new Complex(tmp1,X10_TEMP198));
final int X10_TEMP202 = (0);

final int X10_TEMP205 = (0);

final Complex X10_TEMP207 = (q[i,X10_TEMP205]);

final Complex X10_TEMP210 = (Program.Complex_mult(x0,X10_TEMP207));
final Complex X10_TEMP211 = (X10_TEMP210);
forceX[i,X10_TEMP202] = (X10_TEMP211);
final int X10_TEMP214 = (0);

final int X10_TEMP217 = (0);
final Complex X10_TEMP218 = (q[i,X10_TEMP217]);
final double[:rank==3] X10_TEMP219 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP223 = (0);

final double X10_TEMP225 = (X10_TEMP219[i,X10_TEMP223,_PoissonSolver_ELECY_IDX]);

final Complex X10_TEMP228 = (Program.Complex_multS(X10_TEMP218,X10_TEMP225));
final Complex X10_TEMP229 = (X10_TEMP228);
forceY[i,X10_TEMP214] = (X10_TEMP229);
final double X10_TEMP245 = (energy[pl]);
final double[:rank==3] X10_TEMP232 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP236 = (0);
final double X10_TEMP241 = (X10_TEMP232[i,X10_TEMP236,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP239 = (0);
final Complex X10_TEMP240 = (q[i,X10_TEMP239]);
final double X10_TEMP242 = (Program.Complex_multConjg(X10_TEMP240));

final double X10_TEMP244 = (X10_TEMP241*X10_TEMP242);

final double X10_TEMP248 = (X10_TEMP245+X10_TEMP244);
final double X10_TEMP249 = (X10_TEMP248);
energy[pl] = (X10_TEMP249);
final place X10_TEMP250 = (here);

final boolean X10_TEMP252 = (X10_TEMP250.isFirst());
final boolean X10_TEMP253 = X10_TEMP252;
final double[:rank==3] X10_TEMP254 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP258 = (0);
final int X10_TEMP259 = (X10_TEMP0.y);
final double value[:rank==2] X10_TEMP261 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP264 = (X10_TEMP0.y);
double X10_TEMP266 = X10_TEMP261[X10_TEMP264,_PoissonSolver_ELECX_IDX];
if(X10_TEMP253){
X10_TEMP266 = X10_TEMP254[X10_TEMP258,X10_TEMP259,_PoissonSolver_ELECX_IDX];
}
final double X10_TEMP267 = X10_TEMP266;

final double X10_TEMP268 = (X10_TEMP267);

tmp0 = (X10_TEMP268);
final double X10_TEMP271 = (tmp3*tmp0);
tmp1 = (X10_TEMP271);
final double[:rank==3] X10_TEMP273 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP277 = (X10_TEMP0.y);

double X10_TEMP279 = (X10_TEMP273[i,X10_TEMP277,_PoissonSolver_ELECX_IDX]);

final Complex xNY = (new Complex(tmp1,X10_TEMP279));
final int X10_TEMP283 = (X10_TEMP0.y);

final int X10_TEMP286 = (X10_TEMP0.y);

final Complex X10_TEMP288 = (q[i,X10_TEMP286]);

final Complex X10_TEMP291 = (Program.Complex_mult(xNY,X10_TEMP288));
final Complex X10_TEMP292 = (X10_TEMP291);
forceX[i,X10_TEMP283] = (X10_TEMP292);
final int X10_TEMP295 = (X10_TEMP0.y);

final int X10_TEMP298 = (X10_TEMP0.y);
final Complex X10_TEMP299 = (q[i,X10_TEMP298]);
final double[:rank==3] X10_TEMP300 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP304 = (X10_TEMP0.y);

final double X10_TEMP306 = (X10_TEMP300[i,X10_TEMP304,_PoissonSolver_ELECY_IDX]);

final Complex X10_TEMP309 = (Program.Complex_multS(X10_TEMP299,X10_TEMP306));
final Complex X10_TEMP310 = (X10_TEMP309);
forceY[i,X10_TEMP295] = (X10_TEMP310);
final double X10_TEMP326 = (energy[pl]);
final double[:rank==3] X10_TEMP313 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP317 = (X10_TEMP0.y);
final double X10_TEMP322 = (X10_TEMP313[i,X10_TEMP317,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP320 = (X10_TEMP0.y);
final Complex X10_TEMP321 = (q[i,X10_TEMP320]);
final double X10_TEMP323 = (Program.Complex_multConjg(X10_TEMP321));

final double X10_TEMP325 = (X10_TEMP322*X10_TEMP323);

final double X10_TEMP329 = (X10_TEMP326+X10_TEMP325);
final double X10_TEMP330 = (X10_TEMP329);
energy[pl] = (X10_TEMP330);
}
}
final place X10_TEMP331 = (here);

final boolean X10_TEMP333 = X10_TEMP331.isFirst();
if (X10_TEMP333) {
final double[:rank==3] X10_TEMP334 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP338 = (0);
final int X10_TEMP339 = (0);

final double X10_TEMP341 = (X10_TEMP334[X10_TEMP338,X10_TEMP339,_PoissonSolver_ELECY_IDX]);
tmp3 = (X10_TEMP341);
final int X10_TEMP346 = (1);
final int X10_TEMP343 = (X10_TEMP0.y);
final int X10_TEMP344 = (1);
final int X10_TEMP347 = (X10_TEMP343-X10_TEMP344);

final region(:rank==1) X10_TEMP349 = (region(:rank==1))([X10_TEMP346:X10_TEMP347]);
for(point(:rank==1)[j]:X10_TEMP349) {
final int X10_TEMP350 = 0;

final double X10_TEMP352 = (X10_TEMP350 - tmp3);
tmp3 = (X10_TEMP352);
final double[:rank==3] X10_TEMP354 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP358 = (0);

double X10_TEMP360 = (X10_TEMP354[X10_TEMP358,j,_PoissonSolver_ELECY_IDX]);

final Complex s = (new Complex(tmp3,X10_TEMP360));
final int X10_TEMP364 = (0);

final int X10_TEMP367 = (0);
final Complex X10_TEMP368 = (q[X10_TEMP367,j]);
final double[:rank==3] X10_TEMP369 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP373 = (0);

final double X10_TEMP375 = (X10_TEMP369[X10_TEMP373,j,_PoissonSolver_ELECX_IDX]);

final Complex X10_TEMP378 = (Program.Complex_multS(X10_TEMP368,X10_TEMP375));
final Complex X10_TEMP379 = (X10_TEMP378);
forceX[X10_TEMP364,j] = (X10_TEMP379);
final int X10_TEMP382 = (0);

final int X10_TEMP385 = (0);

final Complex X10_TEMP387 = (q[X10_TEMP385,j]);

final Complex X10_TEMP390 = (Program.Complex_mult(s,X10_TEMP387));
final Complex X10_TEMP391 = (X10_TEMP390);
forceY[X10_TEMP382,j] = (X10_TEMP391);
final double X10_TEMP407 = (energy[pl]);
final double[:rank==3] X10_TEMP394 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP398 = (0);
final double X10_TEMP403 = (X10_TEMP394[X10_TEMP398,j,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP401 = (0);
final Complex X10_TEMP402 = (q[X10_TEMP401,j]);
final double X10_TEMP404 = (Program.Complex_multConjg(X10_TEMP402));

final double X10_TEMP406 = (X10_TEMP403*X10_TEMP404);

final double X10_TEMP410 = (X10_TEMP407+X10_TEMP406);
final double X10_TEMP411 = (X10_TEMP410);
energy[pl] = (X10_TEMP411);
}
final double value[:rank==2] X10_TEMP412 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP415 = (0);

final double X10_TEMP417 = (X10_TEMP412[X10_TEMP415,_PoissonSolver_ELECY_IDX]);
tmp3 = (X10_TEMP417);
final int X10_TEMP422 = (1);
final int X10_TEMP419 = (X10_TEMP0.y);
final int X10_TEMP420 = (1);
final int X10_TEMP423 = (X10_TEMP419-X10_TEMP420);

final region(:rank==1) X10_TEMP425 = (region(:rank==1))([X10_TEMP422:X10_TEMP423]);
for(point(:rank==1)[j1]:X10_TEMP425) {
final int X10_TEMP426 = 0;

final double X10_TEMP428 = (X10_TEMP426 - tmp3);
tmp3 = (X10_TEMP428);
final int X10_TEMP429 = (2);
final int X10_TEMP430 = (X10_TEMP0.y);
final int X10_TEMP431 = (X10_TEMP429*X10_TEMP430);

final int j2 = (X10_TEMP431-j1);
final double value[:rank==2] X10_TEMP434 = (double value[:rank==2])(X10_TEMP0.ffg2);

double X10_TEMP438 = (X10_TEMP434[j1,_PoissonSolver_ELECY_IDX]);

final Complex s = (new Complex(tmp3,X10_TEMP438));
final int X10_TEMP442 = (0);

final int X10_TEMP445 = (0);
final Complex X10_TEMP446 = (q[X10_TEMP445,j2]);
final double[:rank==3] X10_TEMP447 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP451 = (0);

final double X10_TEMP453 = (X10_TEMP447[X10_TEMP451,j1,_PoissonSolver_ELECX_IDX]);

final Complex X10_TEMP456 = (Program.Complex_multS(X10_TEMP446,X10_TEMP453));
final Complex X10_TEMP457 = (X10_TEMP456);
forceX[X10_TEMP442,j2] = (X10_TEMP457);
final int X10_TEMP460 = (0);

final int X10_TEMP463 = (0);

final Complex X10_TEMP465 = (q[X10_TEMP463,j2]);

final Complex X10_TEMP468 = (Program.Complex_mult(s,X10_TEMP465));
final Complex X10_TEMP469 = (X10_TEMP468);
forceY[X10_TEMP460,j2] = (X10_TEMP469);
final double X10_TEMP483 = (energy[pl]);
final double value[:rank==2] X10_TEMP472 = (double value[:rank==2])(X10_TEMP0.ffg2);
final double X10_TEMP479 = (X10_TEMP472[j1,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP477 = (0);
final Complex X10_TEMP478 = (q[X10_TEMP477,j2]);
final double X10_TEMP480 = (Program.Complex_multConjg(X10_TEMP478));

final double X10_TEMP482 = (X10_TEMP479*X10_TEMP480);

final double X10_TEMP486 = (X10_TEMP483+X10_TEMP482);
final double X10_TEMP487 = (X10_TEMP486);
energy[pl] = (X10_TEMP487);
}
final int X10_TEMP490 = (0);
final int X10_TEMP491 = (0);
final Complex X10_TEMP492 = (q[X10_TEMP490,X10_TEMP491]);

final double q00R = (Program.Complex_getReal(X10_TEMP492));
final int X10_TEMP496 = (0);
final int X10_TEMP497 = (0);
final Complex X10_TEMP498 = (q[X10_TEMP496,X10_TEMP497]);

final double q00I = (Program.Complex_getImag(X10_TEMP498));
final int X10_TEMP502 = (0);
final int X10_TEMP503 = (0);

final double[:rank==3] X10_TEMP504 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP508 = (0);
final int X10_TEMP509 = (0);
final double X10_TEMP510 = (X10_TEMP504[X10_TEMP508,X10_TEMP509,_PoissonSolver_ELECX_IDX]);

double X10_TEMP518 = (X10_TEMP510*q00R);
final double value[:rank==2] X10_TEMP512 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP515 = (0);
final double X10_TEMP516 = (X10_TEMP512[X10_TEMP515,_PoissonSolver_ELECX_IDX]);

double X10_TEMP519 = (X10_TEMP516*q00I);

final Complex X10_TEMP522 = (new Complex(X10_TEMP518,X10_TEMP519));
final Complex X10_TEMP523 = (X10_TEMP522);
forceX[X10_TEMP502,X10_TEMP503] = (X10_TEMP523);
final int X10_TEMP526 = (0);
final int X10_TEMP527 = (0);

final double[:rank==3] X10_TEMP528 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP532 = (0);
final int X10_TEMP533 = (0);
final double X10_TEMP534 = (X10_TEMP528[X10_TEMP532,X10_TEMP533,_PoissonSolver_ELECY_IDX]);

double X10_TEMP542 = (X10_TEMP534*q00R);
final double value[:rank==2] X10_TEMP536 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP539 = (0);
final double X10_TEMP540 = (X10_TEMP536[X10_TEMP539,_PoissonSolver_ELECY_IDX]);

double X10_TEMP543 = (X10_TEMP540*q00I);

final Complex X10_TEMP546 = (new Complex(X10_TEMP542,X10_TEMP543));
final Complex X10_TEMP547 = (X10_TEMP546);
forceY[X10_TEMP526,X10_TEMP527] = (X10_TEMP547);
final double X10_TEMP577 = (energy[pl]);
final double X10_TEMP576 = (0.5);
final double[:rank==3] X10_TEMP550 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP554 = (0);
final int X10_TEMP555 = (0);
final double X10_TEMP559 = (X10_TEMP550[X10_TEMP554,X10_TEMP555,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP558 = (2);
final double X10_TEMP560 = (Math.pow(q00R,X10_TEMP558));

final double X10_TEMP562 = (X10_TEMP559*X10_TEMP560);
final double value[:rank==2] X10_TEMP563 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP566 = (0);
final double X10_TEMP570 = (X10_TEMP563[X10_TEMP566,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP569 = (2);
final double X10_TEMP571 = (Math.pow(q00I,X10_TEMP569));

final double X10_TEMP573 = (X10_TEMP570*X10_TEMP571);

final double X10_TEMP575 = (X10_TEMP562+X10_TEMP573);
final double X10_TEMP578 = (X10_TEMP576*X10_TEMP575);

final double X10_TEMP581 = (X10_TEMP577+X10_TEMP578);
final double X10_TEMP582 = (X10_TEMP581);
energy[pl] = (X10_TEMP582);
final int X10_TEMP585 = (0);
final int X10_TEMP586 = (X10_TEMP0.y);
final Complex X10_TEMP587 = (q[X10_TEMP585,X10_TEMP586]);

final double q0NYR = (Program.Complex_getReal(X10_TEMP587));
final int X10_TEMP591 = (0);
final int X10_TEMP592 = (X10_TEMP0.y);
final Complex X10_TEMP593 = (q[X10_TEMP591,X10_TEMP592]);

final double q0NYI = (Program.Complex_getImag(X10_TEMP593));
final int X10_TEMP597 = (0);
final int X10_TEMP598 = (X10_TEMP0.y);

final double[:rank==3] X10_TEMP599 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP603 = (0);
final int X10_TEMP604 = (X10_TEMP0.y);
final double X10_TEMP605 = (X10_TEMP599[X10_TEMP603,X10_TEMP604,_PoissonSolver_ELECX_IDX]);

double X10_TEMP613 = (X10_TEMP605*q0NYR);
final double value[:rank==2] X10_TEMP607 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP610 = (X10_TEMP0.y);
final double X10_TEMP611 = (X10_TEMP607[X10_TEMP610,_PoissonSolver_ELECX_IDX]);

double X10_TEMP614 = (X10_TEMP611*q0NYI);

final Complex X10_TEMP617 = (new Complex(X10_TEMP613,X10_TEMP614));
final Complex X10_TEMP618 = (X10_TEMP617);
forceX[X10_TEMP597,X10_TEMP598] = (X10_TEMP618);
final int X10_TEMP621 = (0);
final int X10_TEMP622 = (X10_TEMP0.y);

final double[:rank==3] X10_TEMP623 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP627 = (0);
final int X10_TEMP628 = (X10_TEMP0.y);
final double X10_TEMP629 = (X10_TEMP623[X10_TEMP627,X10_TEMP628,_PoissonSolver_ELECY_IDX]);

double X10_TEMP637 = (X10_TEMP629*q0NYR);
final double value[:rank==2] X10_TEMP631 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP634 = (X10_TEMP0.y);
final double X10_TEMP635 = (X10_TEMP631[X10_TEMP634,_PoissonSolver_ELECY_IDX]);

double X10_TEMP638 = (X10_TEMP635*q0NYI);

final Complex X10_TEMP641 = (new Complex(X10_TEMP637,X10_TEMP638));
final Complex X10_TEMP642 = (X10_TEMP641);
forceY[X10_TEMP621,X10_TEMP622] = (X10_TEMP642);
final double X10_TEMP672 = (energy[pl]);
final double X10_TEMP671 = (0.5);
final double[:rank==3] X10_TEMP645 = (double[:rank==3])(X10_TEMP0.ffg);
final int X10_TEMP649 = (0);
final int X10_TEMP650 = (X10_TEMP0.y);
final double X10_TEMP654 = (X10_TEMP645[X10_TEMP649,X10_TEMP650,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP653 = (2);
final double X10_TEMP655 = (Math.pow(q0NYR,X10_TEMP653));

final double X10_TEMP657 = (X10_TEMP654*X10_TEMP655);
final double value[:rank==2] X10_TEMP658 = (double value[:rank==2])(X10_TEMP0.ffg2);
final int X10_TEMP661 = (X10_TEMP0.y);
final double X10_TEMP665 = (X10_TEMP658[X10_TEMP661,_PoissonSolver_GREENS_IDX]);
final int X10_TEMP664 = (2);
final double X10_TEMP666 = (Math.pow(q0NYI,X10_TEMP664));

final double X10_TEMP668 = (X10_TEMP665*X10_TEMP666);

final double X10_TEMP670 = (X10_TEMP657+X10_TEMP668);
final double X10_TEMP673 = (X10_TEMP671*X10_TEMP670);

final double X10_TEMP676 = (X10_TEMP672+X10_TEMP673);
final double X10_TEMP677 = (X10_TEMP676);
energy[pl] = (X10_TEMP677);
}
}
}
}
}
final double X10_TEMP678 = (4.0);
final int X10_TEMP679 = (X10_TEMP0.x);
final double X10_TEMP680 = (X10_TEMP678*X10_TEMP679);
final int X10_TEMP681 = (X10_TEMP0.y);
final double X10_TEMP682 = (X10_TEMP680*X10_TEMP681);
final double X10_TEMP683 = (Program.doublerefArraySum1(energy));

final double X10_TEMP685 = (X10_TEMP682*X10_TEMP683);
return X10_TEMP685;
}
public static double PoissonSolver_expIntNL(final PoissonSolver X10_TEMP0, final double x) {
final double X10_TEMP1 = (0.57721566);
final int X10_TEMP2 = 0;

final double a0 = (X10_TEMP2 - X10_TEMP1);
final double a1 = (0.99999193);
final double X10_TEMP5 = (0.24991055);
final int X10_TEMP6 = 0;

final double a2 = (X10_TEMP6 - X10_TEMP5);
final double a3 = (0.05519968);
final double X10_TEMP9 = (0.00976004);
final int X10_TEMP10 = 0;

final double a4 = (X10_TEMP10 - X10_TEMP9);
final double a5 = (0.00107857);
final double b1 = (8.5733287401);
final double b2 = (18.0590169730);
final double b3 = (8.6347608925);
final double b4 = (0.2677737343);
final double c1 = (9.5733223454);
final double c2 = (25.6329561486);
final double c3 = (21.0996530827);
final double c4 = (3.9584969228);
final double X10_TEMP21 = (1.0);

final boolean X10_TEMP23 = x<X10_TEMP21;
if (X10_TEMP23) {
final double X10_TEMP24 = (x*a5);

final double X10_TEMP26 = (a4+X10_TEMP24);
final double X10_TEMP27 = (x*X10_TEMP26);

final double X10_TEMP29 = (a3+X10_TEMP27);
final double X10_TEMP30 = (x*X10_TEMP29);

final double X10_TEMP32 = (a2+X10_TEMP30);
final double X10_TEMP33 = (x*X10_TEMP32);

final double X10_TEMP35 = (a1+X10_TEMP33);
final double X10_TEMP36 = (x*X10_TEMP35);

final double X10_TEMP38 = (a0+X10_TEMP36);
return X10_TEMP38;
}
else {
final double X10_TEMP39 = (50.0);

final boolean X10_TEMP41 = x<X10_TEMP39;
if (X10_TEMP41) {
final double X10_TEMP75 = (Math.log(x));
final int X10_TEMP43 = 0;
final double X10_TEMP45 = (X10_TEMP43 - x);
final double X10_TEMP46 = (Math.exp(X10_TEMP45));

final double X10_TEMP48 = (X10_TEMP46/x);
final double X10_TEMP50 = (b1+x);
final double X10_TEMP51 = (x*X10_TEMP50);

final double X10_TEMP53 = (b2+X10_TEMP51);
final double X10_TEMP54 = (x*X10_TEMP53);

final double X10_TEMP56 = (b3+X10_TEMP54);
final double X10_TEMP57 = (x*X10_TEMP56);

final double X10_TEMP59 = (b4+X10_TEMP57);
final double X10_TEMP61 = (c1+x);
final double X10_TEMP62 = (x*X10_TEMP61);

final double X10_TEMP64 = (c2+X10_TEMP62);
final double X10_TEMP65 = (x*X10_TEMP64);

final double X10_TEMP67 = (c3+X10_TEMP65);
final double X10_TEMP68 = (x*X10_TEMP67);

final double X10_TEMP70 = (c4+X10_TEMP68);

final double X10_TEMP72 = (X10_TEMP59/X10_TEMP70);

final double X10_TEMP74 = (X10_TEMP48*X10_TEMP72);

final double X10_TEMP77 = (X10_TEMP75+X10_TEMP74);
return X10_TEMP77;
}
else {
final double X10_TEMP80 = (Math.log(x));
return X10_TEMP80;
}
}
}
public static String PoissonSolver_toString(final PoissonSolver X10_TEMP0) {
final String X10_TEMP1 = ("PoisonSolver: xbits = ");
final int X10_TEMP2 = (X10_TEMP0.xBits);
final String X10_TEMP3 = (X10_TEMP1+X10_TEMP2);
final String X10_TEMP4 = (" ybits = ");
final String X10_TEMP5 = (X10_TEMP3+X10_TEMP4);
final int X10_TEMP6 = (X10_TEMP0.yBits);

final String X10_TEMP8 = (X10_TEMP5+X10_TEMP6);
return X10_TEMP8;
}
public static double Random_nextNormal(final Random X10_TEMP0) {
double ret = (0.0);
final int X10_TEMP2 = (X10_TEMP0.flag);
final int X10_TEMP3 = (0);

final boolean X10_TEMP5 = X10_TEMP2!=X10_TEMP3;
if (X10_TEMP5) {
final double X10_TEMP7 = (X10_TEMP0.r0);
ret = (X10_TEMP7);
final double X10_TEMP10 = (0.0);
final double X10_TEMP11 = (X10_TEMP10);
X10_TEMP0.r0 = (X10_TEMP11);
final int X10_TEMP14 = (0);
final int X10_TEMP15 = (X10_TEMP14);
X10_TEMP0.flag = (X10_TEMP15);
}
else {
int isc = (65536);
double asc = (isc);
double bsc = (asc*asc);
final int X10_TEMP22 = (X10_TEMP0.r1);
final int X10_TEMP19 = (X10_TEMP0.r1);

final int X10_TEMP21 = (X10_TEMP19/isc);
final int X10_TEMP23 = (X10_TEMP21*isc);

int i1 = (X10_TEMP22-X10_TEMP23);
final double X10_TEMP25 = (X10_TEMP0.h1l);
final int X10_TEMP26 = (X10_TEMP0.r1);
final double X10_TEMP29 = (X10_TEMP25*X10_TEMP26);
final double X10_TEMP27 = (X10_TEMP0.h1u);
final double X10_TEMP28 = (asc*X10_TEMP27);
final double X10_TEMP30 = (X10_TEMP28*i1);

double r3 = (X10_TEMP29+X10_TEMP30);
final double X10_TEMP33 = (r3/bsc);

final int X10_TEMP35 = ((int)X10_TEMP33);
i1 = (X10_TEMP35);
final double X10_TEMP37 = (i1*bsc);

final double X10_TEMP39 = (r3-X10_TEMP37);
r3 = (X10_TEMP39);
final double X10_TEMP40 = (0.5);

final double X10_TEMP42 = (X10_TEMP40*bsc);
bsc = (X10_TEMP42);
final int X10_TEMP43 = (X10_TEMP0.r2);

final int X10_TEMP45 = (X10_TEMP43/isc);
i1 = (X10_TEMP45);
final int X10_TEMP46 = (X10_TEMP0.r2);
final int X10_TEMP47 = (i1*isc);

final int X10_TEMP49 = (X10_TEMP46-X10_TEMP47);
isc = (X10_TEMP49);
final double X10_TEMP50 = (X10_TEMP0.h1l);
final int X10_TEMP51 = (X10_TEMP0.r2);
final double X10_TEMP54 = (X10_TEMP50*X10_TEMP51);
final double X10_TEMP52 = (X10_TEMP0.h1u);
final double X10_TEMP53 = (asc*X10_TEMP52);
final double X10_TEMP55 = (X10_TEMP53*isc);

final double X10_TEMP58 = (X10_TEMP54+X10_TEMP55);
final double X10_TEMP59 = (X10_TEMP58);
X10_TEMP0.r0 = (X10_TEMP59);
final double X10_TEMP60 = (1.0);

final double X10_TEMP62 = (X10_TEMP60/bsc);
asc = (X10_TEMP62);
final double X10_TEMP63 = (X10_TEMP0.r0);

final double X10_TEMP65 = (X10_TEMP63*asc);

final int X10_TEMP67 = ((int)X10_TEMP65);
isc = (X10_TEMP67);
final double X10_TEMP68 = (X10_TEMP0.r0);
final double X10_TEMP69 = (isc*bsc);

final double X10_TEMP71 = (X10_TEMP68-X10_TEMP69);

final int X10_TEMP74 = ((int)X10_TEMP71);
final int X10_TEMP75 = (X10_TEMP74);
X10_TEMP0.r2 = (X10_TEMP75);
final double X10_TEMP79 = (r3+isc);
final double X10_TEMP76 = (2.0);
final double X10_TEMP77 = (X10_TEMP0.h1u);
final double X10_TEMP78 = (X10_TEMP76*X10_TEMP77);
final double X10_TEMP80 = (X10_TEMP78*i1);

final double X10_TEMP82 = (X10_TEMP79+X10_TEMP80);
r3 = (X10_TEMP82);
final double X10_TEMP84 = (r3*asc);

final int X10_TEMP86 = ((int)X10_TEMP84);
isc = (X10_TEMP86);
final double X10_TEMP87 = (isc*bsc);

final double X10_TEMP89 = (r3-X10_TEMP87);

final int X10_TEMP92 = ((int)X10_TEMP89);
final int X10_TEMP93 = (X10_TEMP92);
X10_TEMP0.r1 = (X10_TEMP93);
final double X10_TEMP94 = (2.0);
final int X10_TEMP95 = 0;
final double X10_TEMP103 = (X10_TEMP95 - X10_TEMP94);
final int X10_TEMP97 = (X10_TEMP0.r1);
final double X10_TEMP96 = (X10_TEMP0.r2);
final double X10_TEMP98 = (X10_TEMP96*asc);

final double X10_TEMP100 = (X10_TEMP97+X10_TEMP98);
final double X10_TEMP102 = (X10_TEMP100*asc);
final double X10_TEMP104 = (Math.log(X10_TEMP102));
final double X10_TEMP106 = (X10_TEMP103*X10_TEMP104);

double temp = (Math.sqrt(X10_TEMP106));
final int X10_TEMP109 = (65536);
isc = (X10_TEMP109);
asc = (isc);
final double X10_TEMP112 = (asc*asc);
bsc = (X10_TEMP112);
final int X10_TEMP116 = (X10_TEMP0.r4);
final int X10_TEMP113 = (X10_TEMP0.r4);

final int X10_TEMP115 = (X10_TEMP113/isc);
final int X10_TEMP117 = (X10_TEMP115*isc);

final int X10_TEMP119 = (X10_TEMP116-X10_TEMP117);
i1 = (X10_TEMP119);
final double X10_TEMP120 = (X10_TEMP0.h2l);
final int X10_TEMP121 = (X10_TEMP0.r4);
final double X10_TEMP124 = (X10_TEMP120*X10_TEMP121);
final double X10_TEMP122 = (X10_TEMP0.h1u);
final double X10_TEMP123 = (asc*X10_TEMP122);
final double X10_TEMP125 = (X10_TEMP123*i1);

final double X10_TEMP127 = (X10_TEMP124+X10_TEMP125);
r3 = (X10_TEMP127);
final double X10_TEMP129 = (r3/bsc);

final int X10_TEMP131 = ((int)X10_TEMP129);
i1 = (X10_TEMP131);
final double X10_TEMP133 = (i1*bsc);

final double X10_TEMP135 = (r3-X10_TEMP133);
r3 = (X10_TEMP135);
final double X10_TEMP136 = (0.5);

final double X10_TEMP138 = (X10_TEMP136*bsc);
bsc = (X10_TEMP138);
final int X10_TEMP139 = (X10_TEMP0.r5);

final int X10_TEMP141 = (X10_TEMP139/isc);
i1 = (X10_TEMP141);
final int X10_TEMP142 = (X10_TEMP0.r5);
final int X10_TEMP143 = (i1*isc);

final int X10_TEMP145 = (X10_TEMP142-X10_TEMP143);
isc = (X10_TEMP145);
final double X10_TEMP146 = (X10_TEMP0.h2l);
final int X10_TEMP147 = (X10_TEMP0.r5);
final double X10_TEMP150 = (X10_TEMP146*X10_TEMP147);
final double X10_TEMP148 = (X10_TEMP0.h1u);
final double X10_TEMP149 = (asc*X10_TEMP148);
final double X10_TEMP151 = (X10_TEMP149*isc);

final double X10_TEMP154 = (X10_TEMP150+X10_TEMP151);
final double X10_TEMP155 = (X10_TEMP154);
X10_TEMP0.r0 = (X10_TEMP155);
final double X10_TEMP156 = (1.0);

final double X10_TEMP158 = (X10_TEMP156/bsc);
asc = (X10_TEMP158);
final double X10_TEMP159 = (X10_TEMP0.r0);

final double X10_TEMP161 = (X10_TEMP159*asc);

final int X10_TEMP163 = ((int)X10_TEMP161);
isc = (X10_TEMP163);
final double X10_TEMP164 = (X10_TEMP0.r0);
final double X10_TEMP165 = (isc*bsc);

final double X10_TEMP167 = (X10_TEMP164-X10_TEMP165);

final int X10_TEMP170 = ((int)X10_TEMP167);
final int X10_TEMP171 = (X10_TEMP170);
X10_TEMP0.r5 = (X10_TEMP171);
final double X10_TEMP172 = (2.0);
final double X10_TEMP173 = (X10_TEMP0.h1u);
final double X10_TEMP174 = (X10_TEMP172*X10_TEMP173);
final double X10_TEMP175 = (X10_TEMP174*i1);

final double X10_TEMP177 = (isc+X10_TEMP175);

final double X10_TEMP179 = (r3+X10_TEMP177);
r3 = (X10_TEMP179);
final double X10_TEMP181 = (r3*asc);

final int X10_TEMP183 = ((int)X10_TEMP181);
isc = (X10_TEMP183);
final double X10_TEMP184 = (isc*bsc);

final double X10_TEMP186 = (r3-X10_TEMP184);

final int X10_TEMP189 = ((int)X10_TEMP186);
final int X10_TEMP190 = (X10_TEMP189);
X10_TEMP0.r4 = (X10_TEMP190);
final double X10_TEMP198 = (6.28318530717959);
final int X10_TEMP192 = (X10_TEMP0.r4);
final double X10_TEMP191 = (X10_TEMP0.r5);
final double X10_TEMP193 = (X10_TEMP191*asc);

final double X10_TEMP195 = (X10_TEMP192+X10_TEMP193);

final double X10_TEMP197 = (X10_TEMP195*asc);

final double X10_TEMP201 = (X10_TEMP198*X10_TEMP197);
final double X10_TEMP202 = (X10_TEMP201);
X10_TEMP0.r0 = (X10_TEMP202);
final double X10_TEMP204 = (X10_TEMP0.r0);
final double X10_TEMP205 = (Math.sin(X10_TEMP204));

final double X10_TEMP207 = (temp*X10_TEMP205);
ret = (X10_TEMP207);
final double X10_TEMP209 = (X10_TEMP0.r0);
final double X10_TEMP210 = (Math.cos(X10_TEMP209));

final double X10_TEMP213 = (temp*X10_TEMP210);
final double X10_TEMP214 = (X10_TEMP213);
X10_TEMP0.r0 = (X10_TEMP214);
final int X10_TEMP217 = (1);
final int X10_TEMP218 = (X10_TEMP217);
X10_TEMP0.flag = (X10_TEMP218);
}
return ret;
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
public static boolean _X10Util_DEBUG_init() {

final boolean X10_TEMP2 = (true);
return X10_TEMP2;
}
public static boolean _X10Util_ENABLE_CHECKS_init() {

final boolean X10_TEMP2 = (true);
return X10_TEMP2;
}
public static double _X10Util_ERROR_init() {

final double X10_TEMP2 = (1.0e-13);
return X10_TEMP2;
}
public static double X10Util_maxDouble(final double d1, final double d2) {
final boolean X10_TEMP2 = (d1>=d2);
final boolean X10_TEMP3 = X10_TEMP2;
double X10_TEMP6 = d2;
if(X10_TEMP3){
X10_TEMP6 = d1;
}
final double X10_TEMP7 = X10_TEMP6;

return X10_TEMP7;
}
public static double X10Util_minDouble(final double d1, final double d2) {
final boolean X10_TEMP2 = (d1>=d2);
final boolean X10_TEMP3 = X10_TEMP2;
double X10_TEMP6 = d1;
if(X10_TEMP3){
X10_TEMP6 = d2;
}
final double X10_TEMP7 = X10_TEMP6;

return X10_TEMP7;
}
public static int X10Util_maxInt(final int i1, final int i2) {
final boolean X10_TEMP2 = (i1>=i2);
final boolean X10_TEMP3 = X10_TEMP2;
int X10_TEMP6 = i2;
if(X10_TEMP3){
X10_TEMP6 = i1;
}
final int X10_TEMP7 = X10_TEMP6;

return X10_TEMP7;
}
public static int X10Util_minInt(final int i1, final int i2) {
final boolean X10_TEMP2 = (i1>=i2);
final boolean X10_TEMP3 = X10_TEMP2;
int X10_TEMP6 = i1;
if(X10_TEMP3){
X10_TEMP6 = i2;
}
final int X10_TEMP7 = X10_TEMP6;

return X10_TEMP7;
}
public static region(:rank==2) X10Util_prependRegionRank2D(final region(:rank==1) r1, final region(:rank==1) r2) {
final region(:rank==2) X10_TEMP4 = (region(:rank==2))(Program.X10Util_extendRegionRank2D(r1,r2));
return X10_TEMP4;
}
public static region(:rank==3) X10Util_prependRegionRank3D(final region(:rank==1) r1, final region(:rank==2) r2) {
final int X10_TEMP4 = (0);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))(Program.X10Util_getRank2D(r2,X10_TEMP4));
final int X10_TEMP9 = (1);
final region(:rank==1) X10_TEMP11 = (region(:rank==1))(Program.X10Util_getRank2D(r2,X10_TEMP9));

final region(:rank==3) X10_TEMP13 = (region(:rank==3))([r1,X10_TEMP6,X10_TEMP11]);
return X10_TEMP13;
}
public static region(:rank==2) X10Util_extendRegionRank2D(final region(:rank==1) r1, final region(:rank==1) r2) {
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([r1,r2]);
return X10_TEMP4;
}
public static region(:rank==3) X10Util_extendRegionRank3D(final region(:rank==2) r1, final region(:rank==1) r2) {
final int X10_TEMP3 = (0);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))(Program.X10Util_getRank2D(r1,X10_TEMP3));
final int X10_TEMP8 = (1);
final region(:rank==1) X10_TEMP10 = (region(:rank==1))(Program.X10Util_getRank2D(r1,X10_TEMP8));

final region(:rank==3) X10_TEMP13 = (region(:rank==3))([X10_TEMP5,X10_TEMP10,r2]);
return X10_TEMP13;
}
public static dist(:rank==2) X10Util_prependDistRank2D(final region(:rank==1) r1, final dist(:rank==1) d2) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(X10_TEMP4->X10_TEMP5);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(d2|p);
final region(:rank==1) X10_TEMP16 = (region(:rank==1))(X10_TEMP15.region);

final region(:rank==1) rLocal = (region(:rank==1))(X10_TEMP16);
final region(:rank==2) X10_TEMP20 = (region(:rank==2))(Program.X10Util_prependRegionRank2D(r1,rLocal));

final dist(:rank==2) X10_TEMP22 = (dist(:rank==2))(X10_TEMP20->p);

final dist(:rank==2) X10_TEMP24 = (dist(:rank==2))(dResult||X10_TEMP22);
dResult = (dist(:rank==2))(X10_TEMP24);
}
return dResult;
}
public static dist(:rank==3) X10Util_prependDistRank3D(final region(:rank==1) r1, final dist(:rank==2) d2) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==3) X10_TEMP4 = (region(:rank==3))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==3) X10_TEMP7 = (dist(:rank==3))(X10_TEMP4->X10_TEMP5);

dist(:rank==3) dResult = (dist(:rank==3))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final dist(:rank==2) X10_TEMP15 = (dist(:rank==2))(d2|p);
final region(:rank==2) X10_TEMP16 = (region(:rank==2))(X10_TEMP15.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP16);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(Program.X10Util_prependRegionRank3D(r1,rLocal));

final dist(:rank==3) X10_TEMP22 = (dist(:rank==3))(X10_TEMP20->p);

final dist(:rank==3) X10_TEMP24 = (dist(:rank==3))(dResult||X10_TEMP22);
dResult = (dist(:rank==3))(X10_TEMP24);
}
return dResult;
}
public static dist(:rank==2) X10Util_extendDistRank2D(final dist(:rank==1) d1, final region(:rank==1) r2) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(X10_TEMP4->X10_TEMP5);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(d1|p);
final region(:rank==1) X10_TEMP16 = (region(:rank==1))(X10_TEMP15.region);

final region(:rank==1) rLocal = (region(:rank==1))(X10_TEMP16);
final region(:rank==2) X10_TEMP20 = (region(:rank==2))(Program.X10Util_extendRegionRank2D(rLocal,r2));

final dist(:rank==2) X10_TEMP22 = (dist(:rank==2))(X10_TEMP20->p);

final dist(:rank==2) X10_TEMP24 = (dist(:rank==2))(dResult||X10_TEMP22);
dResult = (dist(:rank==2))(X10_TEMP24);
}
return dResult;
}
public static dist(:rank==3) X10Util_extendDistRank3D(final dist(:rank==2) d1, final region(:rank==1) r2) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==3) X10_TEMP4 = (region(:rank==3))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==3) X10_TEMP7 = (dist(:rank==3))(X10_TEMP4->X10_TEMP5);

dist(:rank==3) dResult = (dist(:rank==3))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final dist(:rank==2) X10_TEMP15 = (dist(:rank==2))(d1|p);
final region(:rank==2) X10_TEMP16 = (region(:rank==2))(X10_TEMP15.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP16);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(Program.X10Util_extendRegionRank3D(rLocal,r2));

final dist(:rank==3) X10_TEMP22 = (dist(:rank==3))(X10_TEMP20->p);

final dist(:rank==3) X10_TEMP24 = (dist(:rank==3))(dResult||X10_TEMP22);
dResult = (dist(:rank==3))(X10_TEMP24);
}
return dResult;
}
public static dist(:rank==1) X10Util_distBlock(final region(:rank==1) r) {
final int X10_TEMP1 = (r.low());
final int X10_TEMP2 = (0);

final boolean X10_TEMP4 = X10_TEMP1!=X10_TEMP2;
if (X10_TEMP4) {
final String X10_TEMP6 = ("distBlock only applies to rails");
throw new RuntimeException(X10_TEMP6);
}
final int X10_TEMP9 = (r.high());
final int X10_TEMP7 = (r.size());
final int X10_TEMP8 = (1);
final int X10_TEMP10 = (X10_TEMP7-X10_TEMP8);

final boolean X10_TEMP12 = X10_TEMP9!=X10_TEMP10;
if (X10_TEMP12) {
final String X10_TEMP14 = ("distblock only applies to rails");
throw new RuntimeException(X10_TEMP14);
}
final int X10_TEMP15 = (r.size());
final int X10_TEMP16 = (place.MAX_PLACES);

int blockSize = (X10_TEMP15/X10_TEMP16);
final int X10_TEMP18 = 0;
final int X10_TEMP19 = 1;
final int X10_TEMP20 = X10_TEMP18 - X10_TEMP19;
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP18:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) X10_TEMP24 = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);

dist(:rank==1) dResult = (dist(:rank==1))(X10_TEMP24);
final dist(:rank==1) X10_TEMP27 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP27) {
final dist(:rank==1) X10_TEMP28 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP28.get(pl));
final int X10_TEMP32 = (pl[0]);
final int X10_TEMP43 = (X10_TEMP32*blockSize);
final int X10_TEMP35 = (pl[0]);
final int X10_TEMP36 = (1);

final int X10_TEMP38 = (X10_TEMP35+X10_TEMP36);

final int X10_TEMP40 = (X10_TEMP38*blockSize);
final int X10_TEMP41 = (1);
final int X10_TEMP44 = (X10_TEMP40-X10_TEMP41);
final region(:rank==1) X10_TEMP45 = (region(:rank==1))([X10_TEMP43:X10_TEMP44]);

final dist(:rank==1) X10_TEMP47 = (dist(:rank==1))(X10_TEMP45->p);

dist(:rank==1) ext = (dist(:rank==1))(X10_TEMP47);
final dist(:rank==1) X10_TEMP50 = (dist(:rank==1))(dResult||ext);
dResult = (dist(:rank==1))(X10_TEMP50);
}
final int X10_TEMP52 = (r.size());
final int X10_TEMP51 = (place.MAX_PLACES);
final int X10_TEMP53 = (blockSize*X10_TEMP51);

int diff = (X10_TEMP52-X10_TEMP53);
final int X10_TEMP55 = (place.MAX_PLACES);
final int X10_TEMP56 = (blockSize*X10_TEMP55);
final int X10_TEMP57 = (r.size());

final boolean X10_TEMP59 = X10_TEMP56!=X10_TEMP57;
if (X10_TEMP59) {
final int X10_TEMP60 = (place.MAX_PLACES);
final int X10_TEMP61 = (1);

final int X10_TEMP63 = (X10_TEMP60-X10_TEMP61);

place l = (place.places(X10_TEMP63));
final int X10_TEMP65 = (r.size());
final int X10_TEMP70 = (X10_TEMP65-diff);
final int X10_TEMP67 = (r.size());
final int X10_TEMP68 = (1);
final int X10_TEMP71 = (X10_TEMP67-X10_TEMP68);
final region(:rank==1) X10_TEMP72 = (region(:rank==1))([X10_TEMP70:X10_TEMP71]);

final dist(:rank==1) X10_TEMP74 = (dist(:rank==1))(X10_TEMP72->l);

dist(:rank==1) ext = (dist(:rank==1))(X10_TEMP74);
final dist(:rank==1) X10_TEMP77 = (dist(:rank==1))(dResult||ext);
dResult = (dist(:rank==1))(X10_TEMP77);
}
return dResult;
}
public static dist(:rank==2) X10Util_distBlockStar1(final region(:rank==2) r) {
final int X10_TEMP3 = (0);

final region(:rank==1) r1 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP3));
final dist(:rank==1) d1 = (dist(:rank==1))(Program.X10Util_distBlock(r1));
final int X10_TEMP10 = (1);

final region(:rank==1) X10_TEMP12 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP10));

final dist(:rank==2) X10_TEMP14 = (dist(:rank==2))(Program.X10Util_extendDistRank2D(d1,X10_TEMP12));
return X10_TEMP14;
}
public static dist(:rank==2) X10Util_distBlockStar2(final region(:rank==1) r1, final region(:rank==1) r2) {
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([r1,r2]);

final dist(:rank==2) X10_TEMP6 = (dist(:rank==2))(Program.X10Util_distBlockStar1(X10_TEMP4));
return X10_TEMP6;
}
public static dist(:rank==2) X10Util_distStarBlock1(final region(:rank==2) r) {
final int X10_TEMP3 = (1);

final region(:rank==1) r2 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP3));
final dist(:rank==1) d2 = (dist(:rank==1))(Program.X10Util_distBlock(r2));
final int X10_TEMP9 = (0);

final region(:rank==1) X10_TEMP12 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP9));

final dist(:rank==2) X10_TEMP14 = (dist(:rank==2))(Program.X10Util_prependDistRank2D(X10_TEMP12,d2));
return X10_TEMP14;
}
public static dist(:rank==2) X10Util_distStarBlock2(final region(:rank==1) r1, final region(:rank==1) r2) {
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([r1,r2]);

final dist(:rank==2) X10_TEMP6 = (dist(:rank==2))(Program.X10Util_distStarBlock1(X10_TEMP4));
return X10_TEMP6;
}
public static boolean X10Util_isDistBlockStar(final dist(:rank==2) d) {
if (_X10Util_ENABLE_CHECKS) {
final region(:rank==2) rd = (region(:rank==2))(d.region);
final int X10_TEMP5 = (0);

final region(:rank==1) r1 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP5));
final int X10_TEMP9 = (1);

final region(:rank==1) r2 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP9));
final dist(:rank==1) X10_TEMP12 = (dist(:rank==1))(dist.factory.block(r1));

final dist(:rank==1) dRef = (dist(:rank==1))(X10_TEMP12);
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP15) {
final dist(:rank==1) X10_TEMP16 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP16.get(pl));
final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(d|p);
final region(:rank==2) X10_TEMP21 = (region(:rank==2))(X10_TEMP20.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP21);
final dist(:rank==1) X10_TEMP24 = (dist(:rank==1))(dRef|p);
final region(:rank==1) X10_TEMP25 = (region(:rank==1))(X10_TEMP24.region);

final region(:rank==1) rRefLocal = (region(:rank==1))(X10_TEMP25);
final int X10_TEMP29 = (0);
final region(:rank==1) X10_TEMP31 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP29));
final int X10_TEMP34 = 0;
final boolean X10_TEMP35 = false;
final int X10_TEMP32 = X10_TEMP31.size();
final int X10_TEMP33 = rRefLocal.size();
boolean X10_TEMP36 = X10_TEMP32 == X10_TEMP33;
if(X10_TEMP36) {
final region(:rank==1) X10_TEMP37 = [X10_TEMP34:X10_TEMP34];
final place X10_TEMP38 = here;
final dist(:rank==1) X10_TEMP39 = X10_TEMP37->X10_TEMP38;
final boolean[:rank==1] X10_TEMP40 = (boolean[:rank==1])(new boolean[X10_TEMP39](point(:rank==1)X10_TEMP41){ final boolean X10_TEMP42 = true; return X10_TEMP42;});
finish {
for(point(:rank==1)X10_TEMP43:X10_TEMP31) {
async(X10_TEMP38) {
boolean X10_TEMP44 = rRefLocal.contains(X10_TEMP43);
X10_TEMP44 = !X10_TEMP44;
if(X10_TEMP44) {
X10_TEMP40[X10_TEMP34] = (X10_TEMP35);
}
}
}
}
X10_TEMP36 = X10_TEMP40[X10_TEMP34];
}
final boolean X10_TEMP45 = X10_TEMP36;

final boolean X10_TEMP47 = (X10_TEMP45);

final boolean X10_TEMP49 = !X10_TEMP47;
if (X10_TEMP49) {
final boolean X10_TEMP51 = (false);
return X10_TEMP51;
}
else {
final int X10_TEMP54 = (1);
final region(:rank==1) X10_TEMP56 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP54));
final int X10_TEMP59 = 0;
final boolean X10_TEMP60 = false;
final int X10_TEMP57 = X10_TEMP56.size();
final int X10_TEMP58 = r2.size();
boolean X10_TEMP61 = X10_TEMP57 == X10_TEMP58;
if(X10_TEMP61) {
final region(:rank==1) X10_TEMP62 = [X10_TEMP59:X10_TEMP59];
final place X10_TEMP63 = here;
final dist(:rank==1) X10_TEMP64 = X10_TEMP62->X10_TEMP63;
final boolean[:rank==1] X10_TEMP65 = (boolean[:rank==1])(new boolean[X10_TEMP64](point(:rank==1)X10_TEMP66){ final boolean X10_TEMP67 = true; return X10_TEMP67;});
finish {
for(point(:rank==1)X10_TEMP68:X10_TEMP56) {
async(X10_TEMP63) {
boolean X10_TEMP69 = r2.contains(X10_TEMP68);
X10_TEMP69 = !X10_TEMP69;
if(X10_TEMP69) {
X10_TEMP65[X10_TEMP59] = (X10_TEMP60);
}
}
}
}
X10_TEMP61 = X10_TEMP65[X10_TEMP59];
}
final boolean X10_TEMP70 = X10_TEMP61;

final boolean X10_TEMP72 = (X10_TEMP70);

final boolean X10_TEMP74 = !X10_TEMP72;
if (X10_TEMP74) {
final int X10_TEMP75 = (rRefLocal.size());
final int X10_TEMP76 = (0);

final boolean X10_TEMP78 = X10_TEMP75>X10_TEMP76;
if (X10_TEMP78) {
final boolean X10_TEMP80 = (false);
return X10_TEMP80;
}
}
}
}
}
final boolean X10_TEMP82 = (true);
return X10_TEMP82;
}
public static boolean X10Util_isDistStarBlock(final dist(:rank==2) d) {
if (_X10Util_ENABLE_CHECKS) {
final region(:rank==2) rd = (region(:rank==2))(d.region);
final int X10_TEMP5 = (0);

final region(:rank==1) r1 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP5));
final int X10_TEMP9 = (1);

final region(:rank==1) r2 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP9));
final dist(:rank==1) X10_TEMP12 = (dist(:rank==1))(dist.factory.block(r2));

final dist(:rank==1) dRef = (dist(:rank==1))(X10_TEMP12);
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP15) {
final dist(:rank==1) X10_TEMP16 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP16.get(pl));
final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(d|p);
final region(:rank==2) X10_TEMP21 = (region(:rank==2))(X10_TEMP20.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP21);
final dist(:rank==1) X10_TEMP24 = (dist(:rank==1))(dRef|p);
final region(:rank==1) X10_TEMP25 = (region(:rank==1))(X10_TEMP24.region);

final region(:rank==1) rRefLocal = (region(:rank==1))(X10_TEMP25);
final int X10_TEMP29 = (0);
final region(:rank==1) X10_TEMP31 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP29));
final int X10_TEMP34 = 0;
final boolean X10_TEMP35 = false;
final int X10_TEMP32 = X10_TEMP31.size();
final int X10_TEMP33 = r1.size();
boolean X10_TEMP36 = X10_TEMP32 == X10_TEMP33;
if(X10_TEMP36) {
final region(:rank==1) X10_TEMP37 = [X10_TEMP34:X10_TEMP34];
final place X10_TEMP38 = here;
final dist(:rank==1) X10_TEMP39 = X10_TEMP37->X10_TEMP38;
final boolean[:rank==1] X10_TEMP40 = (boolean[:rank==1])(new boolean[X10_TEMP39](point(:rank==1)X10_TEMP41){ final boolean X10_TEMP42 = true; return X10_TEMP42;});
finish {
for(point(:rank==1)X10_TEMP43:X10_TEMP31) {
async(X10_TEMP38) {
boolean X10_TEMP44 = r1.contains(X10_TEMP43);
X10_TEMP44 = !X10_TEMP44;
if(X10_TEMP44) {
X10_TEMP40[X10_TEMP34] = (X10_TEMP35);
}
}
}
}
X10_TEMP36 = X10_TEMP40[X10_TEMP34];
}
final boolean X10_TEMP45 = X10_TEMP36;
final int X10_TEMP48 = (1);
final region(:rank==1) X10_TEMP50 = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,X10_TEMP48));
final int X10_TEMP53 = 0;
final boolean X10_TEMP54 = false;
final int X10_TEMP51 = X10_TEMP50.size();
final int X10_TEMP52 = rRefLocal.size();
boolean X10_TEMP55 = X10_TEMP51 == X10_TEMP52;
if(X10_TEMP55) {
final region(:rank==1) X10_TEMP56 = [X10_TEMP53:X10_TEMP53];
final place X10_TEMP57 = here;
final dist(:rank==1) X10_TEMP58 = X10_TEMP56->X10_TEMP57;
final boolean[:rank==1] X10_TEMP59 = (boolean[:rank==1])(new boolean[X10_TEMP58](point(:rank==1)X10_TEMP60){ final boolean X10_TEMP61 = true; return X10_TEMP61;});
finish {
for(point(:rank==1)X10_TEMP62:X10_TEMP50) {
async(X10_TEMP57) {
boolean X10_TEMP63 = rRefLocal.contains(X10_TEMP62);
X10_TEMP63 = !X10_TEMP63;
if(X10_TEMP63) {
X10_TEMP59[X10_TEMP53] = (X10_TEMP54);
}
}
}
}
X10_TEMP55 = X10_TEMP59[X10_TEMP53];
}
final boolean X10_TEMP64 = X10_TEMP55;

final boolean X10_TEMP66 = (X10_TEMP45&&X10_TEMP64);

final boolean X10_TEMP68 = !X10_TEMP66;
if (X10_TEMP68) {
final boolean X10_TEMP70 = (false);
return X10_TEMP70;
}
}
}
final boolean X10_TEMP72 = (true);
return X10_TEMP72;
}
public static dist(:rank==1) X10Util_get2DDistRank(final dist(:rank==2) d, final int n) {
final int X10_TEMP1 = (2);
final boolean X10_TEMP3 = (n>X10_TEMP1);
final int X10_TEMP2 = (0);
final boolean X10_TEMP4 = (n<X10_TEMP2);

final boolean X10_TEMP6 = X10_TEMP3||X10_TEMP4;
if (X10_TEMP6) {
final String X10_TEMP8 = ("Rank must within bounds");
throw new RuntimeException(X10_TEMP8);
}
final int X10_TEMP9 = 0;
final int X10_TEMP10 = 1;
final int X10_TEMP11 = X10_TEMP9 - X10_TEMP10;
final region(:rank==1) X10_TEMP12 = (region(:rank==1))([X10_TEMP9:X10_TEMP11]);
final place X10_TEMP13 = (here);

final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(X10_TEMP12->X10_TEMP13);

dist(:rank==1) dResult = (dist(:rank==1))(X10_TEMP15);
final dist(:rank==1) X10_TEMP18 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP18) {
final dist(:rank==1) X10_TEMP19 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP19.get(pl));
final dist(:rank==2) X10_TEMP23 = (dist(:rank==2))(d|p);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP23.region);
final region(:rank==1) rLocalN = (region(:rank==1))(Program.X10Util_getRank2D(rLocal,n));
final region(:rank==1) X10_TEMP28 = (region(:rank==1))(dResult.region);
final int X10_TEMP29 = 0;
final int X10_TEMP30 = 1;
final int X10_TEMP31 = X10_TEMP29 - X10_TEMP30;
final place X10_TEMP32 = here;
region(:rank==1) X10_TEMP33 = [X10_TEMP29:X10_TEMP31];
for(point(:rank==1)X10_TEMP34[X10_TEMP35]:rLocalN) {
	boolean X10_TEMP36 = X10_TEMP28.contains(X10_TEMP34);
	X10_TEMP36 = !X10_TEMP36;
	if(X10_TEMP36) {
		final region(:rank==1) X10_TEMP37 = [X10_TEMP35:X10_TEMP35];
		X10_TEMP33 = X10_TEMP33 || X10_TEMP37;
	}
}
final region(:rank==1) X10_TEMP38 = X10_TEMP33;

final region(:rank==1) X10_TEMP40 = (region(:rank==1))(X10_TEMP38);

final dist(:rank==1) X10_TEMP42 = (dist(:rank==1))(X10_TEMP40->p);

final dist(:rank==1) X10_TEMP44 = (dist(:rank==1))(dResult||X10_TEMP42);
dResult = (dist(:rank==1))(X10_TEMP44);
}
return dResult;
}
public static region(:rank==2) X10Util_transposeRegion(final region(:rank==2) r) {
final int X10_TEMP3 = (1);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP3));
final int X10_TEMP8 = (0);
final region(:rank==1) X10_TEMP10 = (region(:rank==1))(Program.X10Util_getRank2D(r,X10_TEMP8));

final region(:rank==2) X10_TEMP12 = (region(:rank==2))([X10_TEMP5,X10_TEMP10]);
return X10_TEMP12;
}
public static dist(:rank==2) X10Util_transposeDist(final dist(:rank==2) d) {
final int X10_TEMP1 = 0;
final int X10_TEMP2 = 1;
final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;
final region(:rank==2) X10_TEMP4 = (region(:rank==2))([X10_TEMP1:X10_TEMP3, X10_TEMP1:X10_TEMP3]);
final place X10_TEMP5 = (here);

final dist(:rank==2) X10_TEMP7 = (dist(:rank==2))(X10_TEMP4->X10_TEMP5);

dist(:rank==2) dResult = (dist(:rank==2))(X10_TEMP7);
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP10) {
final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(dist.UNIQUE);

final place p = (X10_TEMP11.get(pl));
final dist(:rank==2) X10_TEMP15 = (dist(:rank==2))(d|p);
final region(:rank==2) X10_TEMP16 = (region(:rank==2))(X10_TEMP15.region);

final region(:rank==2) rLocal = (region(:rank==2))(X10_TEMP16);
final region(:rank==2) X10_TEMP19 = (region(:rank==2))(Program.X10Util_transposeRegion(rLocal));

final dist(:rank==2) X10_TEMP21 = (dist(:rank==2))(X10_TEMP19->p);

final dist(:rank==2) X10_TEMP23 = (dist(:rank==2))(dResult||X10_TEMP21);
dResult = (dist(:rank==2))(X10_TEMP23);
}
return dResult;
}
public static dist(:rank==2) X10Util_transposeBlockStar(final dist(:rank==2) d) {
final region(:rank==2) rd = (region(:rank==2))(d.region);
final int X10_TEMP4 = (0);

final region(:rank==1) r1 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP4));
final int X10_TEMP8 = (1);

final region(:rank==1) r2 = (region(:rank==1))(Program.X10Util_getRank2D(rd,X10_TEMP8));
final dist(:rank==1) X10_TEMP13 = (dist(:rank==1))(Program.X10Util_distBlock(r2));

final dist(:rank==2) X10_TEMP15 = (dist(:rank==2))(Program.X10Util_extendDistRank2D(X10_TEMP13,r1));
return X10_TEMP15;
}
public static boolean X10Util_pullBoolean(final boolean [:rank==1] b, final point(:rank==1) pt) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(b.region);
final boolean X10_TEMP3 = (X10_TEMP1.contains(pt));

final boolean X10_TEMP5 = !X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("pt must be contained in b.region: ");
final region(:rank==1) X10_TEMP7 = (region(:rank==1))(b.region);
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = (" ");
final String X10_TEMP10 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP12 = (X10_TEMP10+pt);

Program.X10Util_println(X10_TEMP12);
final String X10_TEMP13 = ("pullBoolean Exception: ");

final String X10_TEMP15 = (X10_TEMP13+pt);
throw new RuntimeException(X10_TEMP15);
}
final place pHere = (here);
final int X10_TEMP19 = (0);
final int X10_TEMP20 = (0);
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP19:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) dDst = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);
final boolean[:rank==1] result = (boolean[:rank==1])(new boolean[dDst]);
finish {
final dist(:rank==1) X10_TEMP25 = (dist(:rank==1))(b.distribution);

final place X10_TEMP28 = X10_TEMP25.get(pt);
async(X10_TEMP28) {
final boolean val = (b[pt]);
async(pHere) {
final int X10_TEMP33 = (0);

final boolean X10_TEMP36 = (val);
result[X10_TEMP33] = (X10_TEMP36);
}
}
}
final int X10_TEMP38 = (0);

final boolean X10_TEMP40 = (result[X10_TEMP38]);
return X10_TEMP40;
}
public static Complex X10Util_pullComplex(final Complex [:rank==1] c, final point(:rank==1) pt) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(c.region);
final boolean X10_TEMP3 = (X10_TEMP1.contains(pt));

final boolean X10_TEMP5 = !X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("pt must be contained in c.region: ");
final region(:rank==1) X10_TEMP7 = (region(:rank==1))(c.region);
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = (" ");
final String X10_TEMP10 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP12 = (X10_TEMP10+pt);

Program.X10Util_println(X10_TEMP12);
final String X10_TEMP13 = ("Complex Exception: ");

final String X10_TEMP15 = (X10_TEMP13+pt);
throw new RuntimeException(X10_TEMP15);
}
final place pHere = (here);
final int X10_TEMP19 = (0);
final int X10_TEMP20 = (0);
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP19:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) dDst = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);
final Complex[:rank==1] result = (Complex[:rank==1])(new Complex[dDst]);
finish {
final dist(:rank==1) X10_TEMP25 = (dist(:rank==1))(c.distribution);

final place X10_TEMP28 = X10_TEMP25.get(pt);
async(X10_TEMP28) {
final Complex val = (c[pt]);
async(pHere) {
final int X10_TEMP33 = (0);

final Complex X10_TEMP36 = (val);
result[X10_TEMP33] = (X10_TEMP36);
}
}
}
final int X10_TEMP38 = (0);

final Complex X10_TEMP40 = (result[X10_TEMP38]);
return X10_TEMP40;
}
public static int X10Util_pullInt(final int [:rank==1] i, final point(:rank==1) pt) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(i.region);
final boolean X10_TEMP3 = (X10_TEMP1.contains(pt));

final boolean X10_TEMP5 = !X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("pt must be contained in i.region: ");
final region(:rank==1) X10_TEMP7 = (region(:rank==1))(i.region);
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = (" ");
final String X10_TEMP10 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP12 = (X10_TEMP10+pt);

Program.X10Util_println(X10_TEMP12);
final String X10_TEMP13 = ("pullDouble Exception: ");

final String X10_TEMP15 = (X10_TEMP13+pt);
throw new RuntimeException(X10_TEMP15);
}
final place pHere = (here);
final int X10_TEMP19 = (0);
final int X10_TEMP20 = (0);
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP19:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) dDst = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);
final int[:rank==1] result = (int[:rank==1])(new int[dDst]);
finish {
final dist(:rank==1) X10_TEMP25 = (dist(:rank==1))(i.distribution);

final place X10_TEMP28 = X10_TEMP25.get(pt);
async(X10_TEMP28) {
final int val = (i[pt]);
async(pHere) {
final int X10_TEMP33 = (0);

final int X10_TEMP36 = (val);
result[X10_TEMP33] = (X10_TEMP36);
}
}
}
final int X10_TEMP38 = (0);

final int X10_TEMP40 = (result[X10_TEMP38]);
return X10_TEMP40;
}
public static double X10Util_pullDouble(final double [:rank==1] d, final point(:rank==1) pt) {
final region(:rank==1) X10_TEMP1 = (region(:rank==1))(d.region);
final boolean X10_TEMP3 = (X10_TEMP1.contains(pt));

final boolean X10_TEMP5 = !X10_TEMP3;
if (X10_TEMP5) {
final String X10_TEMP6 = ("pt must be contained in d.region: ");
final region(:rank==1) X10_TEMP7 = (region(:rank==1))(d.region);
final String X10_TEMP8 = (X10_TEMP6+X10_TEMP7);
final String X10_TEMP9 = (" ");
final String X10_TEMP10 = (X10_TEMP8+X10_TEMP9);

final String X10_TEMP12 = (X10_TEMP10+pt);

Program.X10Util_println(X10_TEMP12);
final String X10_TEMP13 = ("pullDouble Exception: ");

final String X10_TEMP15 = (X10_TEMP13+pt);
throw new RuntimeException(X10_TEMP15);
}
final place pHere = (here);
final int X10_TEMP19 = (0);
final int X10_TEMP20 = (0);
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP19:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) dDst = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);
final double[:rank==1] result = (double[:rank==1])(new double[dDst]);
finish {
final dist(:rank==1) X10_TEMP25 = (dist(:rank==1))(d.distribution);

final place X10_TEMP28 = X10_TEMP25.get(pt);
async(X10_TEMP28) {
final double val = (d[pt]);
async(pHere) {
final int X10_TEMP33 = (0);

final double X10_TEMP36 = (val);
result[X10_TEMP33] = (X10_TEMP36);
}
}
}
final int X10_TEMP38 = (0);

final double X10_TEMP40 = (result[X10_TEMP38]);
return X10_TEMP40;
}
public static region(:rank==1) X10Util_getRank2D(final region(:rank==2) r, final int n) {
final int X10_TEMP3 = 2;
final boolean X10_TEMP2 = n>=X10_TEMP3;
if (X10_TEMP2) {
final String X10_TEMP4 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP5 = ", expected 2";
String X10_TEMP6 = X10_TEMP4 + n;
X10_TEMP6 = X10_TEMP6 + X10_TEMP5;
throw new RuntimeException(X10_TEMP6);
}
final int X10_TEMP7 = 0;
final int X10_TEMP8 = 1;
final int X10_TEMP10 = X10_TEMP7 - X10_TEMP8;
region(:rank==1) X10_TEMP9 = (region(:rank==1))([X10_TEMP7:X10_TEMP10]);
final int X10_TEMP11 = 0;
final boolean X10_TEMP13 = n == X10_TEMP11;
final int X10_TEMP12 = 1;
final boolean X10_TEMP14 = n == X10_TEMP12;
for(point(:rank==2)[X10_TEMP15, X10_TEMP16]:r) {
if(X10_TEMP13) {
final region(:rank==1) X10_TEMP17 = [X10_TEMP15:X10_TEMP15];
X10_TEMP9 = X10_TEMP9 || X10_TEMP17;
}
else {
 if(X10_TEMP14) {
final region(:rank==1) X10_TEMP17 = [X10_TEMP16:X10_TEMP16];
X10_TEMP9 = X10_TEMP9 || X10_TEMP17;
}
}
}
final region(:rank==1) X10_TEMP18 = X10_TEMP9;

return X10_TEMP18;
}
public static region(:rank==1) X10Util_getRank3D(final region(:rank==3) r, final int n) {
final int X10_TEMP3 = 3;
final boolean X10_TEMP2 = n>=X10_TEMP3;
if (X10_TEMP2) {
final String X10_TEMP4 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP5 = ", expected 3";
String X10_TEMP6 = X10_TEMP4 + n;
X10_TEMP6 = X10_TEMP6 + X10_TEMP5;
throw new RuntimeException(X10_TEMP6);
}
final int X10_TEMP7 = 0;
final int X10_TEMP8 = 1;
final int X10_TEMP10 = X10_TEMP7 - X10_TEMP8;
region(:rank==1) X10_TEMP9 = (region(:rank==1))([X10_TEMP7:X10_TEMP10]);
final int X10_TEMP11 = 0;
final boolean X10_TEMP14 = n == X10_TEMP11;
final int X10_TEMP12 = 1;
final boolean X10_TEMP15 = n == X10_TEMP12;
final int X10_TEMP13 = 2;
final boolean X10_TEMP16 = n == X10_TEMP13;
for(point(:rank==3)[X10_TEMP17, X10_TEMP18, X10_TEMP19]:r) {
if(X10_TEMP14) {
final region(:rank==1) X10_TEMP20 = [X10_TEMP17:X10_TEMP17];
X10_TEMP9 = X10_TEMP9 || X10_TEMP20;
}
else {
 if(X10_TEMP15) {
final region(:rank==1) X10_TEMP20 = [X10_TEMP18:X10_TEMP18];
X10_TEMP9 = X10_TEMP9 || X10_TEMP20;
}
else {
 if(X10_TEMP16) {
final region(:rank==1) X10_TEMP20 = [X10_TEMP19:X10_TEMP19];
X10_TEMP9 = X10_TEMP9 || X10_TEMP20;
}
}
}
}
final region(:rank==1) X10_TEMP21 = X10_TEMP9;

return X10_TEMP21;
}
public static region(:rank==1) X10Util_getLRank2D(final dist(:rank==2) d, final int n) {
final place X10_TEMP4 = (here);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))(Program.X10Util_getPRank2D(d,X10_TEMP4,n));
return X10_TEMP6;
}
public static region(:rank==1) X10Util_getLRank3D(final dist(:rank==3) d, final int n) {
final place X10_TEMP4 = (here);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))(Program.X10Util_getPRank3D(d,X10_TEMP4,n));
return X10_TEMP6;
}
public static region(:rank==1) X10Util_getPRank2D(final dist(:rank==2) d, final place p, final int n) {
final dist(:rank==2) X10_TEMP2 = (dist(:rank==2))(d|p);

final region(:rank==2) X10_TEMP5 = (region(:rank==2))(X10_TEMP2.region);

final region(:rank==1) X10_TEMP7 = (region(:rank==1))(Program.X10Util_getRank2D(X10_TEMP5,n));
return X10_TEMP7;
}
public static region(:rank==1) X10Util_getPRank3D(final dist(:rank==3) d, final place p, final int n) {
final dist(:rank==3) X10_TEMP2 = (dist(:rank==3))(d|p);

final region(:rank==3) X10_TEMP5 = (region(:rank==3))(X10_TEMP2.region);

final region(:rank==1) X10_TEMP7 = (region(:rank==1))(Program.X10Util_getRank3D(X10_TEMP5,n));
return X10_TEMP7;
}
public static region(:rank==1) X10Util_get1DLRegion(final dist(:rank==1) d) {
final place X10_TEMP1 = (here);

final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(d|X10_TEMP1);
final region(:rank==1) X10_TEMP4 = (region(:rank==1))(X10_TEMP3.region);

return X10_TEMP4;
}
public static region(:rank==1) X10Util_get1DPRegion(final dist(:rank==1) d, final place p) {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(d|p);
final region(:rank==1) X10_TEMP3 = (region(:rank==1))(X10_TEMP2.region);

return X10_TEMP3;
}
public static region(:rank==2) X10Util_get2DLRegion(final dist(:rank==2) d) {
final place X10_TEMP1 = (here);

final dist(:rank==2) X10_TEMP3 = (dist(:rank==2))(d|X10_TEMP1);
final region(:rank==2) X10_TEMP4 = (region(:rank==2))(X10_TEMP3.region);

return X10_TEMP4;
}
public static region(:rank==2) X10Util_get2DPRegion(final dist(:rank==2) d, final place p) {
final dist(:rank==2) X10_TEMP2 = (dist(:rank==2))(d|p);
final region(:rank==2) X10_TEMP3 = (region(:rank==2))(X10_TEMP2.region);

return X10_TEMP3;
}
public static region(:rank==3) X10Util_get3DLRegion(final dist(:rank==3) d) {
final place X10_TEMP1 = (here);

final dist(:rank==3) X10_TEMP3 = (dist(:rank==3))(d|X10_TEMP1);
final region(:rank==3) X10_TEMP4 = (region(:rank==3))(X10_TEMP3.region);

return X10_TEMP4;
}
public static region(:rank==3) X10Util_get3DPRegion(final dist(:rank==3) d, final place p) {
final dist(:rank==3) X10_TEMP2 = (dist(:rank==3))(d|p);
final region(:rank==3) X10_TEMP3 = (region(:rank==3))(X10_TEMP2.region);

return X10_TEMP3;
}
public static void X10Util_print(final String s) {
if (_X10Util_DEBUG) {
System.out.print(s);
}
}
public static void X10Util_println(final String s) {
Program.X10Util_print(s);
Program.X10Util_newline();
}
public static void X10Util_newline() {
final String X10_TEMP2 = ("\n");

Program.X10Util_print(X10_TEMP2);
}
public static double doublerefArraySum1(final double[:rank==1] sumArray) {
	final int maxPlaces = place.MAX_PLACES;
	final int one = 1;
	final int zero = 0;
	final int maxPlacesMinusOne = maxPlaces-one;
	final region(:rank==1) dReg = (region(:rank==1))([zero:maxPlacesMinusOne]);
	final place source = here;
	final dist(:rank==1) dSum = (dist(:rank==1))(dReg->source);
	final double initVal = 0;
	final double[:rank==1] localSumArray = (double[:rank==1])(new double[dSum](point(:rank==1)p) {return initVal;});
	final dist(:rank==1) dUnique = (dist(:rank==1))(dist.UNIQUE);
	finish {
		for(point(:rank==1)p : dUnique) {
			final place nthPlace = dUnique.get(p);
			async(nthPlace) {
				double localSumTemp = 0;
				final place thisPlace = here;
				final dist(:rank==1) sumArrayDist = (dist(:rank==1))(sumArray.distribution);
				final dist(:rank==1) sumArrayDistHere = (dist(:rank==1))(sumArrayDist|thisPlace);
				for(point(:rank==1)pt:sumArrayDistHere) {
					final double localSumCurr = sumArray[pt];
					localSumTemp = localSumTemp + localSumCurr;
				}
				final boolean isNotEqual = localSumTemp!=zero;
				if (isNotEqual) {
					final int index = thisPlace.id;
					final double localSum = localSumTemp;
					async(source) {
						localSumArray[index] = (localSum);
					}
				}
			}
		}
	}
	double globalSum = 0;
	for(point(:rank==1)p:localSumArray) {
		final double localSumCurr = localSumArray[p];
		globalSum = globalSum + localSumCurr;
	}
	return globalSum;
}
public static int intrefArrayMax1(final int[:rank==1] maxArray) {
	final int maxPlaces = place.MAX_PLACES;
	final int one = 1;
	final int zero = 0;
	final int maxPlacesMinusOne = maxPlaces-one;
	final region(:rank==1) dReg = (region(:rank==1))([zero:maxPlacesMinusOne]);
	final place source = here;
	final dist(:rank==1) dMax = (dist(:rank==1))(dReg->source);
	final int zeroVal = 0;
	final int maxVal = 2147483647;
	final int initVal = zeroVal - maxVal;
	final int[:rank==1] localMaxArray = (int[:rank==1])(new int[dMax](point(:rank==1)p) {return initVal;});
	final dist(:rank==1) dUnique = (dist(:rank==1))(dist.UNIQUE);
	finish {
		for(point(:rank==1)p : dUnique) {
			final place nthPlace = dUnique.get(p);
			async(nthPlace) {
				int localMaxTemp = initVal;
				final place thisPlace = here;
				final dist(:rank==1) maxArrayDist = (dist(:rank==1))(maxArray.distribution);
				final dist(:rank==1) maxArrayDistHere = (dist(:rank==1))(maxArrayDist|thisPlace);
				for(point(:rank==1)pt:maxArrayDistHere) {
					final int localMaxCurr = maxArray[pt];
					final boolean isGreater = localMaxCurr>localMaxTemp;
					if (isGreater) {
						localMaxTemp = localMaxCurr;
					}
				}
				final int index = thisPlace.id;
				final int localMax = localMaxTemp;
				async(source) {
					localMaxArray[index] = (localMax);
				}
			}
		}
	}
	int globalMax = localMaxArray[zero];
	for(point(:rank==1)p:localMaxArray) {
		final int localMaxCurr = localMaxArray[p];
		final boolean isGreater = localMaxCurr>globalMax;
		if (isGreater) {
			globalMax = localMaxCurr;
		}
	}
	return globalMax;
}
public static int intrefArraySum1(final int[:rank==1] sumArray) {
	final int maxPlaces = place.MAX_PLACES;
	final int one = 1;
	final int zero = 0;
	final int maxPlacesMinusOne = maxPlaces-one;
	final region(:rank==1) dReg = (region(:rank==1))([zero:maxPlacesMinusOne]);
	final place source = here;
	final dist(:rank==1) dSum = (dist(:rank==1))(dReg->source);
	final int initVal = 0;
	final int[:rank==1] localSumArray = (int[:rank==1])(new int[dSum](point(:rank==1)p) {return initVal;});
	final dist(:rank==1) dUnique = (dist(:rank==1))(dist.UNIQUE);
	finish {
		for(point(:rank==1)p : dUnique) {
			final place nthPlace = dUnique.get(p);
			async(nthPlace) {
				int localSumTemp = 0;
				final place thisPlace = here;
				final dist(:rank==1) sumArrayDist = (dist(:rank==1))(sumArray.distribution);
				final dist(:rank==1) sumArrayDistHere = (dist(:rank==1))(sumArrayDist|thisPlace);
				for(point(:rank==1)pt:sumArrayDistHere) {
					final int localSumCurr = sumArray[pt];
					localSumTemp = localSumTemp + localSumCurr;
				}
				final boolean isNotEqual = localSumTemp!=zero;
				if (isNotEqual) {
					final int index = thisPlace.id;
					final int localSum = localSumTemp;
					async(source) {
						localSumArray[index] = (localSum);
					}
				}
			}
		}
	}
	int globalSum = 0;
	for(point(:rank==1)p:localSumArray) {
		final int localSumCurr = localSumArray[p];
		globalSum = globalSum + localSumCurr;
	}
	return globalSum;
}

}

class ArrayUtil {
}

value Complex {
public final double real;
public final double imag;


public Complex(final double real, final double imag) {
final double X10_TEMP3 = (real);
this.real = (X10_TEMP3);
final double X10_TEMP6 = (imag);
this.imag = (X10_TEMP6);
}


}

value FourierTransform2D {
public final int maxBits;
public final int nBits1;
public final int nBits2;
public final int length1;
public final int length2;
public final double invN;
public final int value[:rank==1] tableBitReverse;
public final Complex value[:rank==1] tableSineCosine;


public FourierTransform2D(final int nBits1, final int nBits2) {
final int X10_TEMP3 = (nBits1);
this.nBits1 = (X10_TEMP3);
final int X10_TEMP6 = (nBits2);
this.nBits2 = (X10_TEMP6);
final int X10_TEMP8 = (1);

final int X10_TEMP10 = (nBits2-X10_TEMP8);

final int X10_TEMP12 = (Program.X10Util_maxInt(nBits1,X10_TEMP10));
maxBits = (X10_TEMP12);
final int X10_TEMP13 = (1);

final int len1 = (X10_TEMP13<<nBits1);
final int X10_TEMP15 = (1);

final int len2 = (X10_TEMP15<<nBits2);
length1 = (len1);
length2 = (len2);
final double X10_TEMP23 = (1.0);
final int X10_TEMP19 = (2);
final int X10_TEMP20 = (X10_TEMP19*len1);

final int X10_TEMP22 = (X10_TEMP20*len2);

final double X10_TEMP25 = (X10_TEMP23/X10_TEMP22);
invN = (X10_TEMP25);
final int value[:rank==1] X10_TEMP30 = (int value[:rank==1])(this.FourierTransform2D_initBitReverse(nBits1,nBits2));
tableBitReverse = (int value[:rank==1])(X10_TEMP30);
final Complex value[:rank==1] X10_TEMP35 = (Complex value[:rank==1])(this.FourierTransform2D_initSineCosine(len1,len2));
tableSineCosine = (Complex value[:rank==1])(X10_TEMP35);
}


public int value[:rank==1] FourierTransform2D_initBitReverse(final int nBits1, final int nBits2) {
final int X10_TEMP1 = (1);

final int X10_TEMP4 = (nBits2-X10_TEMP1);

final int maxBits = (Program.X10Util_maxInt(X10_TEMP4,nBits1));
final int X10_TEMP12 = (0);
final int X10_TEMP7 = (1);

final int X10_TEMP9 = (X10_TEMP7<<maxBits);
final int X10_TEMP10 = (1);
final int X10_TEMP13 = (X10_TEMP9-X10_TEMP10);

final region(:rank==1) r = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
final int value[:rank==1] X10_TEMP97 = (int value[:rank==1])(new int value[r](point(:rank==1)i) {
final int i0 = (i[0]);
final int X10_TEMP17 = (0x0000FFFF);

final int X10_TEMP19 = (i0&X10_TEMP17);
final int X10_TEMP20 = (16);

final int X10_TEMP22 = (X10_TEMP19<<X10_TEMP20);
final int X10_TEMP23 = (16);

final int X10_TEMP25 = (i0>>X10_TEMP23);
final int X10_TEMP26 = (0x0000FFFF);

final int X10_TEMP28 = (X10_TEMP25&X10_TEMP26);

final int X10_TEMP30 = (X10_TEMP22|X10_TEMP28);

final int i1 = (X10_TEMP30);
final int X10_TEMP32 = (0x00FF00FF);

final int X10_TEMP34 = (i1&X10_TEMP32);
final int X10_TEMP35 = (8);

final int X10_TEMP37 = (X10_TEMP34<<X10_TEMP35);
final int X10_TEMP38 = (8);

final int X10_TEMP40 = (i1>>X10_TEMP38);
final int X10_TEMP41 = (0x00FF00FF);

final int X10_TEMP43 = (X10_TEMP40&X10_TEMP41);

final int X10_TEMP45 = (X10_TEMP37|X10_TEMP43);

final int i2 = (X10_TEMP45);
final int X10_TEMP47 = (0x0F0F0F0F);

final int X10_TEMP49 = (i2&X10_TEMP47);
final int X10_TEMP50 = (4);

final int X10_TEMP52 = (X10_TEMP49<<X10_TEMP50);
final int X10_TEMP53 = (4);

final int X10_TEMP55 = (i2>>X10_TEMP53);
final int X10_TEMP56 = (0x0F0F0F0F);

final int X10_TEMP58 = (X10_TEMP55&X10_TEMP56);

final int X10_TEMP60 = (X10_TEMP52|X10_TEMP58);

final int i3 = (X10_TEMP60);
final int X10_TEMP62 = (0x33333333);

final int X10_TEMP64 = (i3&X10_TEMP62);
final int X10_TEMP65 = (2);

final int X10_TEMP67 = (X10_TEMP64<<X10_TEMP65);
final int X10_TEMP68 = (2);

final int X10_TEMP70 = (i3>>X10_TEMP68);
final int X10_TEMP71 = (0x33333333);

final int X10_TEMP73 = (X10_TEMP70&X10_TEMP71);

final int X10_TEMP75 = (X10_TEMP67|X10_TEMP73);

final int i4 = (X10_TEMP75);
final int X10_TEMP77 = (0x55555555);

final int X10_TEMP79 = (i4&X10_TEMP77);
final int X10_TEMP80 = (1);

final int X10_TEMP82 = (X10_TEMP79<<X10_TEMP80);
final int X10_TEMP83 = (1);

final int X10_TEMP85 = (i4>>X10_TEMP83);
final int X10_TEMP86 = (0x55555555);

final int X10_TEMP88 = (X10_TEMP85&X10_TEMP86);

final int X10_TEMP90 = (X10_TEMP82|X10_TEMP88);

final int i5 = (X10_TEMP90);
final int X10_TEMP92 = (java.lang.Integer.SIZE);

final int X10_TEMP94 = (X10_TEMP92-maxBits);

final int X10_TEMP96 = (i5>>>X10_TEMP94);
return X10_TEMP96;
}

);

return X10_TEMP97;
}
public Complex value[:rank==1] FourierTransform2D_initSineCosine(final int length1, final int length2) {
final int maxLength = (Program.X10Util_maxInt(length1,length2));
final double PI2 = (6.28318530717959);
final double k = (PI2/maxLength);
final int X10_TEMP12 = (0);
final int X10_TEMP7 = (2);

final int X10_TEMP9 = (maxLength/X10_TEMP7);
final int X10_TEMP10 = (1);
final int X10_TEMP13 = (X10_TEMP9-X10_TEMP10);

final region(:rank==1) r = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
final Complex value[:rank==1] X10_TEMP28 = (Complex value[:rank==1])(new Complex value[r](point(:rank==1)i) {
final int X10_TEMP16 = (i[0]);

final double theta = (k*X10_TEMP16);
double X10_TEMP24 = (Math.cos(theta));
final double X10_TEMP21 = (Math.sin(theta));
final int X10_TEMP22 = 0;

double X10_TEMP25 = (X10_TEMP22 - X10_TEMP21);

final Complex X10_TEMP27 = (new Complex(X10_TEMP24,X10_TEMP25));
return X10_TEMP27;
}

);

return X10_TEMP28;
}

}

class LinearESOpenPIC2D {
public final Random r;
public final PoissonSolver solver;


public Particle [:rank==1] particles;
public double [:rank==2] backgroundCharge;
public long totalTime;
public long initTime;
public long depositTime;
public long redistTime;
public long solverTime;
public long pushTime;
public long moveTime;


public LinearESOpenPIC2D() {
final Random X10_TEMP2 = (new Random());
r = (X10_TEMP2);
final double X10_TEMP3 = (Program._LinearESOpenPIC2D_XLENGTH);
final double X10_TEMP4 = (2.0);

final double X10_TEMP6 = (X10_TEMP3-X10_TEMP4);
final double X10_TEMP7 = (Program._LinearESOpenPIC2D_YLENGTH);
final double X10_TEMP8 = (2.0);

final double X10_TEMP10 = (X10_TEMP7-X10_TEMP8);

final double X10_TEMP12 = (X10_TEMP6*X10_TEMP10);
final int X10_TEMP13 = (Program._LinearESOpenPIC2D_NPARTICLES);

double affp = (X10_TEMP12/X10_TEMP13);
int X10_TEMP18 = (Program._LinearESOpenPIC2D_NUMBER_OF_XBITS);
int X10_TEMP19 = (Program._LinearESOpenPIC2D_NUMBER_OF_YBITS);

final PoissonSolver X10_TEMP21 = (new PoissonSolver(X10_TEMP18,X10_TEMP19,affp));
solver = (X10_TEMP21);
final long X10_TEMP23 = (0);
totalTime = (X10_TEMP23);
final long X10_TEMP25 = (0);
initTime = (X10_TEMP25);
final long X10_TEMP27 = (0);
depositTime = (X10_TEMP27);
final long X10_TEMP29 = (0);
redistTime = (X10_TEMP29);
final long X10_TEMP31 = (0);
pushTime = (X10_TEMP31);
final long X10_TEMP33 = (0);
moveTime = (X10_TEMP33);
}


}

value Particle {
public final double x;
public final double y;
public final double xVel;
public final double yVel;
public final int pid;


public Particle() {
final double X10_TEMP2 = (0.0);
x = (X10_TEMP2);
final double X10_TEMP4 = (0.0);
y = (X10_TEMP4);
final double X10_TEMP6 = (0.0);
xVel = (X10_TEMP6);
final double X10_TEMP8 = (0.0);
yVel = (X10_TEMP8);
final int X10_TEMP9 = (1);
final int X10_TEMP10 = 0;

final int X10_TEMP12 = (X10_TEMP10 - X10_TEMP9);
pid = (X10_TEMP12);
}
public Particle(final double x, final double y, final double xVel, final double yVel) {
final double X10_TEMP3 = (x);
this.x = (X10_TEMP3);
final double X10_TEMP6 = (y);
this.y = (X10_TEMP6);
final double X10_TEMP9 = (xVel);
this.xVel = (X10_TEMP9);
final double X10_TEMP12 = (yVel);
this.yVel = (X10_TEMP12);
final int X10_TEMP13 = (1);
final int X10_TEMP14 = 0;

final int X10_TEMP16 = (X10_TEMP14 - X10_TEMP13);
pid = (X10_TEMP16);
}
public Particle(final double x, final double y, final double xVel, final double yVel, final int pid) {
final double X10_TEMP3 = (x);
this.x = (X10_TEMP3);
final double X10_TEMP6 = (y);
this.y = (X10_TEMP6);
final double X10_TEMP9 = (xVel);
this.xVel = (X10_TEMP9);
final double X10_TEMP12 = (yVel);
this.yVel = (X10_TEMP12);
final int X10_TEMP15 = (pid);
this.pid = (X10_TEMP15);
}


}

value PoissonSolver {
public final int x;
public final int y;
public final int xBits;
public final int yBits;
public final double ari;
public final double affp;
public final FourierTransform2D fft;
public final double [:rank==3] ffg;
public final double value[:rank==2] ffg2;


public PoissonSolver(final int xBits, final int yBits, final double affp) {
final int X10_TEMP3 = (xBits);
this.xBits = (X10_TEMP3);
final int X10_TEMP6 = (yBits);
this.yBits = (X10_TEMP6);
final double X10_TEMP9 = (affp);
this.affp = (X10_TEMP9);
final int X10_TEMP10 = (1);

final int x0 = (X10_TEMP10<<xBits);
final int X10_TEMP12 = (1);

final int y0 = (X10_TEMP12<<yBits);
x = (x0);
y = (y0);
final double X10_TEMP17 = (0);
ari = (X10_TEMP17);
final int X10_TEMP18 = (1);

int X10_TEMP22 = (yBits+X10_TEMP18);
final int X10_TEMP20 = (1);

int X10_TEMP23 = (xBits+X10_TEMP20);

final FourierTransform2D fft0 = (new FourierTransform2D(X10_TEMP22,X10_TEMP23));
fft = (fft0);
final double[:rank==3] tables = (double[:rank==3])(this.PoissonSolver_initTables(fft0,x0,y0,affp));
final double[:rank==3] X10_TEMP37 = (double[:rank==3])(this.PoissonSolver_makeFFG(tables,x0,y0));
ffg = (double[:rank==3])(X10_TEMP37);
final double value[:rank==2] X10_TEMP43 = (double value[:rank==2])(this.PoissonSolver_makeFFG2(tables,x0,y0));
ffg2 = (double value[:rank==2])(X10_TEMP43);
final String X10_TEMP45 = ("Poisson Solver initialized");
System.out.println(X10_TEMP45);
}


public double [:rank==3] PoissonSolver_initTables(final FourierTransform2D fft, final int x, final int y, final double affp) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (x-X10_TEMP2);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final int X10_TEMP9 = (0);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP9:y]);
final int X10_TEMP13 = (0);
final int X10_TEMP14 = (3);

final region(:rank==1) r3 = (region(:rank==1))([X10_TEMP13:X10_TEMP14]);
final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));

final dist(:rank==3) dTable1 = (dist(:rank==3))(Program.X10Util_extendDistRank3D(X10_TEMP20,r3));
final place first = (place.FIRST_PLACE);
final int X10_TEMP27 = (0);
final int X10_TEMP30 = (0);
final int X10_TEMP31 = (3);
final region(:rank==3) X10_TEMP32 = (region(:rank==3))([x:x,X10_TEMP27:y,X10_TEMP30:X10_TEMP31]);

final dist(:rank==3) X10_TEMP34 = (dist(:rank==3))(X10_TEMP32->first);

final dist(:rank==3) dTable2 = (dist(:rank==3))(X10_TEMP34);
final dist(:rank==3) dTable = (dist(:rank==3))(dTable1||dTable2);
final double[:rank==3] table = (double[:rank==3])(new double[dTable]);
final String X10_TEMP39 = ("Init: Green's function");
System.out.println(X10_TEMP39);
this.PoissonSolver_initGreensFnTable(table,fft,x,y,affp);
final String X10_TEMP47 = ("Init: Shape factor");
System.out.println(X10_TEMP47);
this.PoissonSolver_initShapeFactorTable(table,fft,x,y,affp);
final String X10_TEMP55 = ("Init: X Electric field");
System.out.println(X10_TEMP55);
this.PoissonSolver_initElectricFieldXTable(table,fft,x,y,affp);
final String X10_TEMP63 = ("Init: Y Electric field");
System.out.println(X10_TEMP63);
this.PoissonSolver_initElectricFieldYTable(table,fft,x,y,affp);
return table;
}
public double [:rank==3] PoissonSolver_makeFFG(final double [:rank==3] table, final int x, final int y) {
final int X10_TEMP4 = (0);
final int X10_TEMP2 = (1);
final int X10_TEMP5 = (x-X10_TEMP2);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final int X10_TEMP9 = (0);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP9:y]);
final int X10_TEMP13 = (0);
final int X10_TEMP14 = (3);

final region(:rank==1) r3 = (region(:rank==1))([X10_TEMP13:X10_TEMP14]);
final dist(:rank==2) X10_TEMP20 = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));

final dist(:rank==3) dResult = (dist(:rank==3))(Program.X10Util_extendDistRank3D(X10_TEMP20,r3));
final double[:rank==3] X10_TEMP26 = (double[:rank==3&&distribution==dResult])(new double[dResult](point(:rank==3)pt) {
final double X10_TEMP24 = (table[pt]);
return X10_TEMP24;
}

);
return X10_TEMP26;
}
public double value[:rank==2] PoissonSolver_makeFFG2(final double [:rank==3] table, final int x, final int y) {
final int X10_TEMP3 = (0);
final int X10_TEMP6 = (0);
final int X10_TEMP7 = (3);

final region(:rank==2) rResult = (region(:rank==2))([X10_TEMP3:y,X10_TEMP6:X10_TEMP7]);
final double value[:rank==2] X10_TEMP34 = (double value[:rank==2])(new double value[rResult](point(:rank==2)[i,j]) {
final place pHere = (here);
final int X10_TEMP12 = (0);
final int X10_TEMP13 = (0);
final region(:rank==1) X10_TEMP14 = (region(:rank==1))([X10_TEMP12:X10_TEMP13]);
final place X10_TEMP15 = (here);

final dist(:rank==1) dDst = (dist(:rank==1))(X10_TEMP14->X10_TEMP15);
final double[:rank==1] rcv = (double[:rank==1])(new double[dDst]);
finish {
final place X10_TEMP19 = place.FIRST_PLACE;
async(X10_TEMP19) {
final double val = (table[x,i,j]);
finish {
async(pHere) {
final int X10_TEMP26 = (0);

final double X10_TEMP29 = (val);
rcv[X10_TEMP26] = (X10_TEMP29);
}
}
}
}
final int X10_TEMP31 = (0);

final double X10_TEMP33 = (rcv[X10_TEMP31]);
return X10_TEMP33;
}

);

return X10_TEMP34;
}
public void PoissonSolver_initGreensFnTable(final double [:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
final int X10_TEMP6 = (0);
final int X10_TEMP2 = (2);
final int X10_TEMP3 = (X10_TEMP2*y);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final int X10_TEMP14 = (0);
final int X10_TEMP10 = (2);
final int X10_TEMP11 = (X10_TEMP10*x);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final dist(:rank==2) dGreen = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));
final double[:rank==2] f = (double[:rank==2])(new double[dGreen]);
final double X10_TEMP21 = (Program._PoissonSolver_AR);
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = (X10_TEMP21>X10_TEMP22);
final boolean X10_TEMP25 = X10_TEMP24;
final double X10_TEMP26 = (1.0);
final double X10_TEMP27 = (Program._PoissonSolver_AR);
double X10_TEMP30 = 0.0;
if(X10_TEMP25){
X10_TEMP30 = X10_TEMP26/X10_TEMP27;
}
final double X10_TEMP31 = X10_TEMP30;

final double invRadius = (X10_TEMP31);
final int X10_TEMP32 = (4);
final int X10_TEMP33 = (X10_TEMP32*x);

final double N = (X10_TEMP33*y);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final int X10_TEMP40 = (pl[0]);
final int X10_TEMP39 = (2);
final int X10_TEMP41 = (X10_TEMP39*y);

final boolean X10_TEMP43 = X10_TEMP40<=X10_TEMP41;
if (X10_TEMP43) {
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dGreen));
final place X10_TEMP47 = here;
for(point(:rank==2)p:rLocal) {
async(X10_TEMP47) {
final int X10_TEMP49 = (p[0]);

final boolean X10_TEMP51 = (X10_TEMP49>y);
final boolean X10_TEMP52 = X10_TEMP51;
final int X10_TEMP57 = (p[0]);
final int X10_TEMP54 = (2);

final int X10_TEMP56 = (X10_TEMP54*y);
int X10_TEMP61 = p[0];
if(X10_TEMP52){
X10_TEMP61 = X10_TEMP57-X10_TEMP56;
}
final int X10_TEMP62 = X10_TEMP61;
final int X10_TEMP64 = (2);

final double x1 = (Math.pow(X10_TEMP62,X10_TEMP64));
final int X10_TEMP67 = (p[1]);

final boolean X10_TEMP69 = (X10_TEMP67>x);
final boolean X10_TEMP70 = X10_TEMP69;
final int X10_TEMP75 = (p[1]);
final int X10_TEMP72 = (2);

final int X10_TEMP74 = (X10_TEMP72*x);
int X10_TEMP79 = p[1];
if(X10_TEMP70){
X10_TEMP79 = X10_TEMP75-X10_TEMP74;
}
final int X10_TEMP80 = X10_TEMP79;
final int X10_TEMP82 = (2);

final double x2 = (Math.pow(X10_TEMP80,X10_TEMP82));
final double X10_TEMP85 = (x1+x2);

final double r = (Math.sqrt(X10_TEMP85));
final double X10_TEMP94 = (this.PoissonSolver_potentialField(r,invRadius,affp));
final double X10_TEMP95 = (X10_TEMP94);
f[p] = (X10_TEMP95);
}
}
}
}
}
}
final Complex[:rank==2] ft = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformD(fft,f));
final int X10_TEMP104 = (Program._PoissonSolver_GREENS_IDX);

this.PoissonSolver_genTable1(table,ft,X10_TEMP104,x,y);
}
public void PoissonSolver_initShapeFactorTable(final double [:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
final int X10_TEMP6 = (0);
final int X10_TEMP2 = (2);
final int X10_TEMP3 = (X10_TEMP2*y);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final int X10_TEMP14 = (0);
final int X10_TEMP10 = (2);
final int X10_TEMP11 = (X10_TEMP10*x);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final dist(:rank==2) dShape = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));
final double[:rank==2] f = (double[:rank==2])(new double[dShape]);
final double X10_TEMP21 = (Program._PoissonSolver_AR);
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = (X10_TEMP21>X10_TEMP22);
final boolean X10_TEMP25 = X10_TEMP24;
final double X10_TEMP26 = (1.0);
final double X10_TEMP27 = (Program._PoissonSolver_AR);
double X10_TEMP30 = 0.0;
if(X10_TEMP25){
X10_TEMP30 = X10_TEMP26/X10_TEMP27;
}
final double X10_TEMP31 = X10_TEMP30;

final double invRadius = (X10_TEMP31);
final int X10_TEMP32 = (4);
final int X10_TEMP33 = (X10_TEMP32*x);

final double N = (X10_TEMP33*y);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final int X10_TEMP40 = (pl[0]);
final int X10_TEMP39 = (2);
final int X10_TEMP41 = (X10_TEMP39*y);

final boolean X10_TEMP43 = X10_TEMP40<=X10_TEMP41;
if (X10_TEMP43) {
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dShape));
final place X10_TEMP47 = here;
for(point(:rank==2)p:rLocal) {
async(X10_TEMP47) {
final int X10_TEMP49 = (p[0]);

final boolean X10_TEMP51 = (X10_TEMP49>y);
final boolean X10_TEMP52 = X10_TEMP51;
final int X10_TEMP57 = (p[0]);
final int X10_TEMP54 = (2);

final int X10_TEMP56 = (X10_TEMP54*y);
int X10_TEMP61 = p[0];
if(X10_TEMP52){
X10_TEMP61 = X10_TEMP57-X10_TEMP56;
}
final int X10_TEMP62 = X10_TEMP61;
final int X10_TEMP64 = (2);

final double x1 = (Math.pow(X10_TEMP62,X10_TEMP64));
final int X10_TEMP67 = (p[1]);

final boolean X10_TEMP69 = (X10_TEMP67>x);
final boolean X10_TEMP70 = X10_TEMP69;
final int X10_TEMP75 = (p[1]);
final int X10_TEMP72 = (2);

final int X10_TEMP74 = (X10_TEMP72*x);
int X10_TEMP79 = p[1];
if(X10_TEMP70){
X10_TEMP79 = X10_TEMP75-X10_TEMP74;
}
final int X10_TEMP80 = X10_TEMP79;
final int X10_TEMP82 = (2);

final double x2 = (Math.pow(X10_TEMP80,X10_TEMP82));
final double X10_TEMP85 = (x1+x2);

final double r = (Math.sqrt(X10_TEMP85));
final double X10_TEMP94 = (this.PoissonSolver_particleShape(r,invRadius,affp));
final double X10_TEMP95 = (X10_TEMP94);
f[p] = (X10_TEMP95);
}
}
}
}
}
}
final Complex[:rank==2] ft = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformD(fft,f));
final int X10_TEMP104 = (Program._PoissonSolver_SHAPE_IDX);

this.PoissonSolver_genTable1(table,ft,X10_TEMP104,x,y);
}
public void PoissonSolver_initElectricFieldXTable(final double [:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
final int X10_TEMP6 = (0);
final int X10_TEMP2 = (2);
final int X10_TEMP3 = (X10_TEMP2*y);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final int X10_TEMP14 = (0);
final int X10_TEMP10 = (2);
final int X10_TEMP11 = (X10_TEMP10*x);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final dist(:rank==2) dElecX = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));
final double[:rank==2] f = (double[:rank==2])(new double[dElecX]);
final double X10_TEMP21 = (Program._PoissonSolver_AR);
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = (X10_TEMP21>X10_TEMP22);
final boolean X10_TEMP25 = X10_TEMP24;
final double X10_TEMP26 = (1.0);
final double X10_TEMP27 = (Program._PoissonSolver_AR);
double X10_TEMP30 = 0.0;
if(X10_TEMP25){
X10_TEMP30 = X10_TEMP26/X10_TEMP27;
}
final double X10_TEMP31 = X10_TEMP30;

final double invRadius = (X10_TEMP31);
final int X10_TEMP32 = (4);
final int X10_TEMP33 = (X10_TEMP32*x);

final double N = (X10_TEMP33*y);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final int X10_TEMP40 = (pl[0]);
final int X10_TEMP39 = (2);
final int X10_TEMP41 = (X10_TEMP39*y);

final boolean X10_TEMP43 = X10_TEMP40<=X10_TEMP41;
if (X10_TEMP43) {
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dElecX));
final place X10_TEMP47 = here;
for(point(:rank==2)p:rLocal) {
async(X10_TEMP47) {
final int X10_TEMP49 = (p[0]);

final boolean X10_TEMP51 = (X10_TEMP49>y);
final boolean X10_TEMP52 = X10_TEMP51;
final int X10_TEMP57 = (p[0]);
final int X10_TEMP54 = (2);

final int X10_TEMP56 = (X10_TEMP54*y);
int X10_TEMP61 = p[0];
if(X10_TEMP52){
X10_TEMP61 = X10_TEMP57-X10_TEMP56;
}
final int X10_TEMP62 = X10_TEMP61;

final double x1 = (X10_TEMP62);
final int X10_TEMP65 = (2);

final double xs1 = (Math.pow(x1,X10_TEMP65));
final int X10_TEMP68 = (p[1]);

final boolean X10_TEMP70 = (X10_TEMP68>x);
final boolean X10_TEMP71 = X10_TEMP70;
final int X10_TEMP76 = (p[1]);
final int X10_TEMP73 = (2);

final int X10_TEMP75 = (X10_TEMP73*x);
int X10_TEMP80 = p[1];
if(X10_TEMP71){
X10_TEMP80 = X10_TEMP76-X10_TEMP75;
}
final int X10_TEMP81 = X10_TEMP80;

final double x2 = (X10_TEMP81);
final int X10_TEMP84 = (2);

final double xs2 = (Math.pow(x2,X10_TEMP84));
final double X10_TEMP87 = (xs1+xs2);

final double r = (Math.sqrt(X10_TEMP87));
final double val = (this.PoissonSolver_radialElectricField(r,invRadius,affp));
final double X10_TEMP95 = (0.0);

final boolean X10_TEMP97 = (r>X10_TEMP95);
final boolean X10_TEMP98 = X10_TEMP97;
final double X10_TEMP100 = (x2/r);
double X10_TEMP103 = val;
if(X10_TEMP98){
X10_TEMP103 = val*X10_TEMP100;
}
final double X10_TEMP104 = X10_TEMP103;

final double X10_TEMP106 = (X10_TEMP104);
f[p] = (X10_TEMP106);
}
}
}
}
}
}
final Complex[:rank==2] ft = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformD(fft,f));
final int X10_TEMP115 = (Program._PoissonSolver_ELECX_IDX);

this.PoissonSolver_genTable2(table,ft,X10_TEMP115,x,y);
}
public void PoissonSolver_initElectricFieldYTable(final double [:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
final int X10_TEMP6 = (0);
final int X10_TEMP2 = (2);
final int X10_TEMP3 = (X10_TEMP2*y);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (X10_TEMP3-X10_TEMP4);

final region(:rank==1) r1 = (region(:rank==1))([X10_TEMP6:X10_TEMP7]);
final int X10_TEMP14 = (0);
final int X10_TEMP10 = (2);
final int X10_TEMP11 = (X10_TEMP10*x);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (X10_TEMP11-X10_TEMP12);

final region(:rank==1) r2 = (region(:rank==1))([X10_TEMP14:X10_TEMP15]);
final dist(:rank==2) dElecX = (dist(:rank==2))(Program.X10Util_distBlockStar2(r1,r2));
final double[:rank==2] f = (double[:rank==2])(new double[dElecX]);
final double X10_TEMP21 = (Program._PoissonSolver_AR);
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = (X10_TEMP21>X10_TEMP22);
final boolean X10_TEMP25 = X10_TEMP24;
final double X10_TEMP26 = (1.0);
final double X10_TEMP27 = (Program._PoissonSolver_AR);
double X10_TEMP30 = 0.0;
if(X10_TEMP25){
X10_TEMP30 = X10_TEMP26/X10_TEMP27;
}
final double X10_TEMP31 = X10_TEMP30;

final double invRadius = (X10_TEMP31);
final int X10_TEMP32 = (4);
final int X10_TEMP33 = (X10_TEMP32*x);

final double N = (X10_TEMP33*y);
finish {
final dist(:rank==1) X10_TEMP36 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP36) {
final place X10_TEMP37 = X10_TEMP36.get(pl);
async(X10_TEMP37) {
final int X10_TEMP40 = (pl[0]);
final int X10_TEMP39 = (2);
final int X10_TEMP41 = (X10_TEMP39*y);

final boolean X10_TEMP43 = X10_TEMP40<=X10_TEMP41;
if (X10_TEMP43) {
final region(:rank==2) rLocal = (region(:rank==2))(Program.X10Util_get2DLRegion(dElecX));
final place X10_TEMP47 = here;
for(point(:rank==2)p:rLocal) {
async(X10_TEMP47) {
final int X10_TEMP49 = (p[0]);

final boolean X10_TEMP51 = (X10_TEMP49>y);
final boolean X10_TEMP52 = X10_TEMP51;
final int X10_TEMP57 = (p[0]);
final int X10_TEMP54 = (2);

final int X10_TEMP56 = (X10_TEMP54*y);
int X10_TEMP61 = p[0];
if(X10_TEMP52){
X10_TEMP61 = X10_TEMP57-X10_TEMP56;
}
final int X10_TEMP62 = X10_TEMP61;

final double y1 = (X10_TEMP62);
final int X10_TEMP65 = (2);

final double ys1 = (Math.pow(y1,X10_TEMP65));
final int X10_TEMP68 = (p[1]);

final boolean X10_TEMP70 = (X10_TEMP68>x);
final boolean X10_TEMP71 = X10_TEMP70;
final int X10_TEMP76 = (p[1]);
final int X10_TEMP73 = (2);

final int X10_TEMP75 = (X10_TEMP73*x);
int X10_TEMP80 = p[1];
if(X10_TEMP71){
X10_TEMP80 = X10_TEMP76-X10_TEMP75;
}
final int X10_TEMP81 = X10_TEMP80;

final double y2 = (X10_TEMP81);
final int X10_TEMP84 = (2);

final double ys2 = (Math.pow(y2,X10_TEMP84));
final double X10_TEMP87 = (ys1+ys2);

final double r = (Math.sqrt(X10_TEMP87));
final double val = (this.PoissonSolver_radialElectricField(r,invRadius,affp));
final double X10_TEMP95 = (0.0);

final boolean X10_TEMP97 = (r>X10_TEMP95);
final boolean X10_TEMP98 = X10_TEMP97;
final double X10_TEMP100 = (y1/r);
double X10_TEMP103 = val;
if(X10_TEMP98){
X10_TEMP103 = val*X10_TEMP100;
}
final double X10_TEMP104 = X10_TEMP103;

final double X10_TEMP106 = (X10_TEMP104);
f[p] = (X10_TEMP106);
}
}
}
}
}
}
final Complex[:rank==2] ft = (Complex[:rank==2])(Program.FourierTransform2D_inverseTransformD(fft,f));
final int X10_TEMP115 = (Program._PoissonSolver_ELECY_IDX);

this.PoissonSolver_genTable3(table,ft,X10_TEMP115,x,y);
}
public void PoissonSolver_genTable1(final double [:rank==3] table, final Complex [:rank==2] ft, final int index, final int x, final int y) {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*x);

final int N = (X10_TEMP2*y);
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP5) {
final place X10_TEMP6 = X10_TEMP5.get(pl);
async(X10_TEMP6) {
final int X10_TEMP8 = (pl[0]);

final boolean X10_TEMP10 = X10_TEMP8<=x;
if (X10_TEMP10) {
final dist(:rank==2) dFT = (dist(:rank==2))(ft.distribution);
final dist(:rank==3) dTable = (dist(:rank==3))(table.distribution);
final int X10_TEMP15 = (0);

final region(:rank==1) rLocalFT1 = (region(:rank==1))(Program.X10Util_getLRank2D(dFT,X10_TEMP15));
final int X10_TEMP19 = (1);

final region(:rank==1) rLocalT2 = (region(:rank==1))(Program.X10Util_getLRank3D(dTable,X10_TEMP19));
final region(:rank==2) X10_TEMP24 = (region(:rank==2))([rLocalFT1,rLocalT2]);
final place X10_TEMP25 = here;
for(point(:rank==2)[i,j]:X10_TEMP24) {
async(X10_TEMP25) {
final Complex X10_TEMP31 = (ft[i,j]);
final double X10_TEMP32 = (Program.Complex_getReal(X10_TEMP31));

final double X10_TEMP35 = (N*X10_TEMP32);
final double X10_TEMP36 = (X10_TEMP35);
table[i,j,index] = (X10_TEMP36);
}
}
final place X10_TEMP37 = (here);

final boolean X10_TEMP39 = X10_TEMP37.isFirst();
if (X10_TEMP39) {
final int X10_TEMP43 = (1);
final int X10_TEMP41 = (1);
final int X10_TEMP44 = (y-X10_TEMP41);

final region(:rank==1) X10_TEMP46 = (region(:rank==1))([X10_TEMP43:X10_TEMP44]);
final place X10_TEMP47 = here;
for(point(:rank==1)[i]:X10_TEMP46) {
async(X10_TEMP47) {
final int X10_TEMP55 = (0);
final int X10_TEMP52 = (2);
final int X10_TEMP53 = (X10_TEMP52*y);

final int X10_TEMP56 = (X10_TEMP53-i);
final Complex X10_TEMP57 = (ft[X10_TEMP55,X10_TEMP56]);
final double X10_TEMP58 = (Program.Complex_getReal(X10_TEMP57));

final double X10_TEMP61 = (N*X10_TEMP58);
final double X10_TEMP62 = (X10_TEMP61);
table[x,i,index] = (X10_TEMP62);
}
}
final int X10_TEMP66 = (0);

final int X10_TEMP69 = (0);
final int X10_TEMP70 = (0);
final Complex X10_TEMP71 = (ft[X10_TEMP69,X10_TEMP70]);
final double X10_TEMP72 = (Program.Complex_getImag(X10_TEMP71));

final double X10_TEMP75 = (N*X10_TEMP72);
final double X10_TEMP76 = (X10_TEMP75);
table[x,X10_TEMP66,index] = (X10_TEMP76);
final int X10_TEMP82 = (0);
final Complex X10_TEMP83 = (ft[X10_TEMP82,y]);
final double X10_TEMP84 = (Program.Complex_getImag(X10_TEMP83));

final double X10_TEMP87 = (N*X10_TEMP84);
final double X10_TEMP88 = (X10_TEMP87);
table[x,y,index] = (X10_TEMP88);
}
}
}
}
}
}
public void PoissonSolver_genTable2(final double [:rank==3] table, final Complex [:rank==2] ft, final int index, final int x, final int y) {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*x);

final int N = (X10_TEMP2*y);
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP5) {
final place X10_TEMP6 = X10_TEMP5.get(pl);
async(X10_TEMP6) {
final int X10_TEMP8 = (pl[0]);

final boolean X10_TEMP10 = X10_TEMP8<=x;
if (X10_TEMP10) {
final dist(:rank==2) dFT = (dist(:rank==2))(ft.distribution);
final dist(:rank==3) dTable = (dist(:rank==3))(table.distribution);
final int X10_TEMP15 = (0);

final region(:rank==1) rLocalFT1 = (region(:rank==1))(Program.X10Util_getLRank2D(dFT,X10_TEMP15));
final int X10_TEMP19 = (1);

final region(:rank==1) rLocalT2 = (region(:rank==1))(Program.X10Util_getLRank3D(dTable,X10_TEMP19));
final place X10_TEMP22 = here;
for(point(:rank==1)[i]:rLocalFT1) {
async(X10_TEMP22) {
final int X10_TEMP23 = (0);

final boolean X10_TEMP25 = i>X10_TEMP23;
if (X10_TEMP25) {
final place X10_TEMP27 = here;
for(point(:rank==1)[j]:rLocalT2) {
async(X10_TEMP27) {
final Complex X10_TEMP33 = (ft[i,j]);
final double X10_TEMP34 = (Program.Complex_getImag(X10_TEMP33));

final double X10_TEMP37 = (N*X10_TEMP34);
final double X10_TEMP38 = (X10_TEMP37);
table[i,j,index] = (X10_TEMP38);
}
}
}
}
}
final place X10_TEMP39 = (here);

final boolean X10_TEMP41 = X10_TEMP39.isFirst();
if (X10_TEMP41) {
final int X10_TEMP45 = (1);
final int X10_TEMP43 = (1);
final int X10_TEMP46 = (y-X10_TEMP43);

final region(:rank==1) X10_TEMP48 = (region(:rank==1))([X10_TEMP45:X10_TEMP46]);
final place X10_TEMP49 = here;
for(point(:rank==1)[i1]:X10_TEMP48) {
async(X10_TEMP49) {
final int X10_TEMP50 = (2);
final int X10_TEMP51 = (X10_TEMP50*y);

final int i2 = (X10_TEMP51-i1);
final int X10_TEMP56 = (0);

final int X10_TEMP59 = (0);
final Complex X10_TEMP60 = (ft[X10_TEMP59,i1]);
final double X10_TEMP61 = (Program.Complex_getReal(X10_TEMP60));

final double X10_TEMP64 = (N*X10_TEMP61);
final double X10_TEMP65 = (X10_TEMP64);
table[X10_TEMP56,i1,index] = (X10_TEMP65);
final int X10_TEMP71 = (0);
final Complex X10_TEMP72 = (ft[X10_TEMP71,i2]);
final double X10_TEMP73 = (Program.Complex_getReal(X10_TEMP72));

final double X10_TEMP76 = (N*X10_TEMP73);
final double X10_TEMP77 = (X10_TEMP76);
table[x,i1,index] = (X10_TEMP77);
}
}
final int X10_TEMP81 = (0);
final int X10_TEMP82 = (0);

final int X10_TEMP85 = (0);
final int X10_TEMP86 = (0);
final Complex X10_TEMP87 = (ft[X10_TEMP85,X10_TEMP86]);
final double X10_TEMP88 = (Program.Complex_getReal(X10_TEMP87));

final double X10_TEMP91 = (N*X10_TEMP88);
final double X10_TEMP92 = (X10_TEMP91);
table[X10_TEMP81,X10_TEMP82,index] = (X10_TEMP92);
final int X10_TEMP96 = (0);

final int X10_TEMP99 = (0);
final int X10_TEMP100 = (0);
final Complex X10_TEMP101 = (ft[X10_TEMP99,X10_TEMP100]);
final double X10_TEMP102 = (Program.Complex_getImag(X10_TEMP101));

final double X10_TEMP105 = (N*X10_TEMP102);
final double X10_TEMP106 = (X10_TEMP105);
table[x,X10_TEMP96,index] = (X10_TEMP106);
final int X10_TEMP110 = (0);

final int X10_TEMP113 = (0);
final Complex X10_TEMP114 = (ft[X10_TEMP113,y]);
final double X10_TEMP115 = (Program.Complex_getReal(X10_TEMP114));

final double X10_TEMP118 = (N*X10_TEMP115);
final double X10_TEMP119 = (X10_TEMP118);
table[X10_TEMP110,y,index] = (X10_TEMP119);
final int X10_TEMP125 = (0);
final Complex X10_TEMP126 = (ft[X10_TEMP125,y]);
final double X10_TEMP127 = (Program.Complex_getImag(X10_TEMP126));

final double X10_TEMP130 = (N*X10_TEMP127);
final double X10_TEMP131 = (X10_TEMP130);
table[x,y,index] = (X10_TEMP131);
}
}
}
}
}
}
public void PoissonSolver_genTable3(final double [:rank==3] table, final Complex [:rank==2] ft, final int index, final int x, final int y) {
final int X10_TEMP1 = (4);
final int X10_TEMP2 = (X10_TEMP1*x);

final int N = (X10_TEMP2*y);
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(dist.UNIQUE);
for(point(:rank==1)pl:X10_TEMP5) {
final place X10_TEMP6 = X10_TEMP5.get(pl);
async(X10_TEMP6) {
final int X10_TEMP8 = (pl[0]);

final boolean X10_TEMP10 = X10_TEMP8<=x;
if (X10_TEMP10) {
final dist(:rank==2) dFT = (dist(:rank==2))(ft.distribution);
final dist(:rank==3) dTable = (dist(:rank==3))(table.distribution);
final int X10_TEMP15 = (0);

final region(:rank==1) rLocalFT1 = (region(:rank==1))(Program.X10Util_getLRank2D(dFT,X10_TEMP15));
final int X10_TEMP19 = (1);

final region(:rank==1) rLocalT2 = (region(:rank==1))(Program.X10Util_getLRank3D(dTable,X10_TEMP19));
final place X10_TEMP22 = here;
for(point(:rank==1)[i]:rLocalFT1) {
async(X10_TEMP22) {
final int X10_TEMP23 = (0);

final boolean X10_TEMP25 = i>X10_TEMP23;
if (X10_TEMP25) {
final int X10_TEMP29 = (1);
final int X10_TEMP27 = (1);
final int X10_TEMP30 = (y-X10_TEMP27);

final region(:rank==1) X10_TEMP32 = (region(:rank==1))([X10_TEMP29:X10_TEMP30]);
final place X10_TEMP33 = here;
for(point(:rank==1)[j]:X10_TEMP32) {
async(X10_TEMP33) {
final Complex X10_TEMP39 = (ft[i,j]);
final double X10_TEMP40 = (Program.Complex_getImag(X10_TEMP39));

final double X10_TEMP43 = (N*X10_TEMP40);
final double X10_TEMP44 = (X10_TEMP43);
table[i,j,index] = (X10_TEMP44);
}
}
final int X10_TEMP48 = (0);

final int X10_TEMP51 = (0);
final Complex X10_TEMP52 = (ft[i,X10_TEMP51]);
final double X10_TEMP53 = (Program.Complex_getReal(X10_TEMP52));

final double X10_TEMP56 = (N*X10_TEMP53);
final double X10_TEMP57 = (X10_TEMP56);
table[i,X10_TEMP48,index] = (X10_TEMP57);
final Complex X10_TEMP63 = (ft[i,y]);
final double X10_TEMP64 = (Program.Complex_getReal(X10_TEMP63));

final double X10_TEMP67 = (N*X10_TEMP64);
final double X10_TEMP68 = (X10_TEMP67);
table[i,y,index] = (X10_TEMP68);
}
}
}
final place X10_TEMP69 = (here);

final boolean X10_TEMP71 = X10_TEMP69.isFirst();
if (X10_TEMP71) {
final int X10_TEMP75 = (1);
final int X10_TEMP73 = (1);
final int X10_TEMP76 = (y-X10_TEMP73);

final region(:rank==1) X10_TEMP78 = (region(:rank==1))([X10_TEMP75:X10_TEMP76]);
final place X10_TEMP79 = here;
for(point(:rank==1)[i1]:X10_TEMP78) {
async(X10_TEMP79) {
final int X10_TEMP80 = (2);
final int X10_TEMP81 = (X10_TEMP80*y);

final int i2 = (X10_TEMP81-i1);
final int X10_TEMP86 = (0);

final int X10_TEMP89 = (0);
final Complex X10_TEMP90 = (ft[X10_TEMP89,i1]);
final double X10_TEMP91 = (Program.Complex_getImag(X10_TEMP90));

final double X10_TEMP94 = (N*X10_TEMP91);
final double X10_TEMP95 = (X10_TEMP94);
table[X10_TEMP86,i1,index] = (X10_TEMP95);
final int X10_TEMP101 = (0);
final Complex X10_TEMP102 = (ft[X10_TEMP101,i2]);
final double X10_TEMP103 = (Program.Complex_getImag(X10_TEMP102));

final double X10_TEMP106 = (N*X10_TEMP103);
final double X10_TEMP107 = (X10_TEMP106);
table[x,i1,index] = (X10_TEMP107);
}
}
final int X10_TEMP111 = (0);
final int X10_TEMP112 = (0);

final int X10_TEMP115 = (0);
final int X10_TEMP116 = (0);
final Complex X10_TEMP117 = (ft[X10_TEMP115,X10_TEMP116]);
final double X10_TEMP118 = (Program.Complex_getReal(X10_TEMP117));

final double X10_TEMP121 = (N*X10_TEMP118);
final double X10_TEMP122 = (X10_TEMP121);
table[X10_TEMP111,X10_TEMP112,index] = (X10_TEMP122);
final int X10_TEMP126 = (0);

final int X10_TEMP129 = (0);
final int X10_TEMP130 = (0);
final Complex X10_TEMP131 = (ft[X10_TEMP129,X10_TEMP130]);
final double X10_TEMP132 = (Program.Complex_getImag(X10_TEMP131));

final double X10_TEMP135 = (N*X10_TEMP132);
final double X10_TEMP136 = (X10_TEMP135);
table[x,X10_TEMP126,index] = (X10_TEMP136);
final int X10_TEMP140 = (0);

final int X10_TEMP143 = (0);
final Complex X10_TEMP144 = (ft[X10_TEMP143,y]);
final double X10_TEMP145 = (Program.Complex_getReal(X10_TEMP144));

final double X10_TEMP148 = (N*X10_TEMP145);
final double X10_TEMP149 = (X10_TEMP148);
table[X10_TEMP140,y,index] = (X10_TEMP149);
final int X10_TEMP155 = (0);
final Complex X10_TEMP156 = (ft[X10_TEMP155,y]);
final double X10_TEMP157 = (Program.Complex_getImag(X10_TEMP156));

final double X10_TEMP160 = (N*X10_TEMP157);
final double X10_TEMP161 = (X10_TEMP160);
table[x,y,index] = (X10_TEMP161);
}
}
}
}
}
}
public double PoissonSolver_potentialField(final double r, final double ari, final double affp) {
final double X10_TEMP1 = (Program._PoissonSolver_PI4I);

final double anorm = (affp*X10_TEMP1);
final int X10_TEMP3 = (0);

final boolean X10_TEMP5 = ari>X10_TEMP3;
if (X10_TEMP5) {
final double X10_TEMP6 = (0.0);

final boolean X10_TEMP8 = r==X10_TEMP6;
if (X10_TEMP8) {
final double X10_TEMP9 = (Program._PoissonSolver_SQT2PI);
final double X10_TEMP10 = (anorm*X10_TEMP9);

final double X10_TEMP12 = (X10_TEMP10*ari);
return X10_TEMP12;
}
else {
final double X10_TEMP14 = (Program._PoissonSolver_SQT2I);
final double X10_TEMP15 = (r*X10_TEMP14);

final double X10_TEMP17 = (X10_TEMP15*ari);
final double X10_TEMP18 = (this.PoissonSolver_errorFn(X10_TEMP17));
final double X10_TEMP19 = (anorm*X10_TEMP18);

final double X10_TEMP21 = (X10_TEMP19/r);
return X10_TEMP21;
}
}
else {
final double X10_TEMP22 = (0.0);

final boolean X10_TEMP24 = r==X10_TEMP22;
if (X10_TEMP24) {
final double X10_TEMP26 = (0.0);
return X10_TEMP26;
}
else {
final double X10_TEMP28 = (anorm/r);
return X10_TEMP28;
}
}
}
public double PoissonSolver_particleShape(final double r, final double ari, final double affp) {
final double X10_TEMP1 = (0.5);
final double X10_TEMP2 = (Program._PoissonSolver_SQT2PI);
final double X10_TEMP3 = (X10_TEMP1*X10_TEMP2);
final double X10_TEMP6 = (X10_TEMP3*ari);
final int X10_TEMP7 = (2);
final double X10_TEMP8 = (Math.pow(X10_TEMP6,X10_TEMP7));

final double anorm = (affp*X10_TEMP8);
final double X10_TEMP10 = (0.0);

final boolean X10_TEMP12 = ari>X10_TEMP10;
if (X10_TEMP12) {
final double X10_TEMP13 = (0.0);

final boolean X10_TEMP15 = r==X10_TEMP13;
if (X10_TEMP15) {
return anorm;
}
else {
final double X10_TEMP17 = (Program._PoissonSolver_SQT2I);
final double X10_TEMP18 = (r*X10_TEMP17);

final double X10_TEMP21 = (X10_TEMP18*ari);
final double X10_TEMP22 = (8.0);

final double at1 = (Program.X10Util_minDouble(X10_TEMP21,X10_TEMP22));
final double X10_TEMP25 = (at1*at1);
final int X10_TEMP26 = 0;
final double X10_TEMP28 = (X10_TEMP26 - X10_TEMP25);
final double X10_TEMP29 = (Math.exp(X10_TEMP28));

final double X10_TEMP31 = (anorm*X10_TEMP29);
return X10_TEMP31;
}
}
else {
final double X10_TEMP32 = (0.0);

final boolean X10_TEMP34 = r==X10_TEMP32;
if (X10_TEMP34) {
return affp;
}
else {
final double X10_TEMP37 = (0.0);
return X10_TEMP37;
}
}
}
public double PoissonSolver_radialElectricField(final double r, final double ari, final double affp) {
final double X10_TEMP1 = (Program._PoissonSolver_PI4I);

final double anorm = (affp*X10_TEMP1);
final double X10_TEMP3 = (0.0);

final boolean X10_TEMP5 = ari>X10_TEMP3;
if (X10_TEMP5) {
final double X10_TEMP6 = (0.0);

final boolean X10_TEMP8 = r==X10_TEMP6;
if (X10_TEMP8) {
final double X10_TEMP10 = (0.0);
return X10_TEMP10;
}
else {
final double X10_TEMP11 = (1.0);

final double ri = (X10_TEMP11/r);
final double X10_TEMP13 = (Program._PoissonSolver_SQT2I);
final double X10_TEMP14 = (r*X10_TEMP13);

final double X10_TEMP17 = (X10_TEMP14*ari);
final double X10_TEMP18 = (8.0);

final double at1 = (Program.X10Util_minDouble(X10_TEMP17,X10_TEMP18));
final double X10_TEMP35 = (anorm*ri);
final double X10_TEMP22 = (this.PoissonSolver_errorFn(at1));
final double X10_TEMP31 = (X10_TEMP22*ri);
final double X10_TEMP23 = (Program._PoissonSolver_SQT2PI);
final double X10_TEMP29 = (X10_TEMP23*ari);
final double X10_TEMP25 = (at1*at1);
final int X10_TEMP26 = 0;
final double X10_TEMP28 = (X10_TEMP26 - X10_TEMP25);
final double X10_TEMP30 = (Math.exp(X10_TEMP28));
final double X10_TEMP32 = (X10_TEMP29*X10_TEMP30);

final double X10_TEMP34 = (X10_TEMP31-X10_TEMP32);

final double X10_TEMP37 = (X10_TEMP35*X10_TEMP34);
return X10_TEMP37;
}
}
else {
final double X10_TEMP38 = (0.0);

final boolean X10_TEMP40 = r==X10_TEMP38;
if (X10_TEMP40) {
final double X10_TEMP42 = (0.0);
return X10_TEMP42;
}
else {
final double X10_TEMP44 = (r*r);

final double X10_TEMP46 = (anorm/X10_TEMP44);
return X10_TEMP46;
}
}
}
public double PoissonSolver_errorFn(final double x) {
final double p = (0.3275911);
final double a1 = (0.254829592);
final double X10_TEMP3 = (0.284496736);
final int X10_TEMP4 = 0;

final double a2 = (X10_TEMP4 - X10_TEMP3);
final double a3 = (1.421413741);
final double X10_TEMP7 = (1.453152027);
final int X10_TEMP8 = 0;

final double a4 = (X10_TEMP8 - X10_TEMP7);
final double a5 = (1.061405429);
final double f = (Math.abs(x));
final double X10_TEMP17 = (1.0);
final double X10_TEMP13 = (1.0);
final double X10_TEMP14 = (p*f);

final double X10_TEMP16 = (X10_TEMP13+X10_TEMP14);

final double t = (X10_TEMP17/X10_TEMP16);
double ret = (0.0);
final double X10_TEMP20 = (8.0);

final boolean X10_TEMP22 = f<=X10_TEMP20;
if (X10_TEMP22) {
final double X10_TEMP41 = (1.0);
final double X10_TEMP23 = (t*a5);

final double X10_TEMP25 = (a4+X10_TEMP23);
final double X10_TEMP26 = (t*X10_TEMP25);

final double X10_TEMP28 = (a3+X10_TEMP26);
final double X10_TEMP29 = (t*X10_TEMP28);

final double X10_TEMP31 = (a2+X10_TEMP29);
final double X10_TEMP32 = (t*X10_TEMP31);

final double X10_TEMP34 = (a1+X10_TEMP32);
final double X10_TEMP39 = (t*X10_TEMP34);
final int X10_TEMP35 = 0;
final double X10_TEMP36 = (X10_TEMP35 - x);
final double X10_TEMP38 = (X10_TEMP36*x);
final double X10_TEMP40 = (Math.exp(X10_TEMP38));
final double X10_TEMP42 = (X10_TEMP39*X10_TEMP40);

final double X10_TEMP44 = (X10_TEMP41-X10_TEMP42);
ret = (X10_TEMP44);
}
else {
final double X10_TEMP46 = (1.0);
ret = (X10_TEMP46);
}
final int X10_TEMP47 = (0);

final boolean X10_TEMP49 = x<X10_TEMP47;
if (X10_TEMP49) {
final int X10_TEMP50 = 0;

final double X10_TEMP52 = (X10_TEMP50 - ret);
ret = (X10_TEMP52);
}
return ret;
}

}

class Random {
public int flag;
public double r0;
public int r1;
public int r2;
public int r4;
public int r5;
public double h1l;
public double h1u;
public double h2l;


public Random() {
final int X10_TEMP2 = (0);
flag = (X10_TEMP2);
final double X10_TEMP4 = (0.0);
r0 = (X10_TEMP4);
final int X10_TEMP6 = (885098780);
r1 = (X10_TEMP6);
final int X10_TEMP8 = (1824280461);
r2 = (X10_TEMP8);
final int X10_TEMP10 = (1396483093);
r4 = (X10_TEMP10);
final int X10_TEMP12 = (55318673);
r5 = (X10_TEMP12);
final double X10_TEMP14 = (65531.0);
h1l = (X10_TEMP14);
final double X10_TEMP16 = (32767.0);
h1u = (X10_TEMP16);
final double X10_TEMP18 = (65525.0);
h2l = (X10_TEMP18);
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

class X10Util {
}

