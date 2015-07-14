public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
}

class MyProgram {
}

class SOR {
public final Random R;


public double gtotal;


public SOR() {
final long X10_TEMP2 = (Program._Program__MyProgram_RANDOM_SEED);

final long rs = (X10_TEMP2);
final Random X10_TEMP6 = (new Random(rs));

final Random X10_TEMP4 = (X10_TEMP6);
final Random X10_TEMP9 = (X10_TEMP4);

R = (X10_TEMP9);
final double X10_TEMP12 = (0.0);

final double X10_TEMP6 = (X10_TEMP12);
final double X10_TEMP15 = (X10_TEMP6);

gtotal = (X10_TEMP15);
}


}

class Random {
public long seed;


public Random(final long rseed) {
final long X10_TEMP2 = (Program._Program__MyProgram_multiplier);

final long mu = (X10_TEMP2);
final long X10_TEMP5 = (rseed^mu);

final long rm = (X10_TEMP5);
final long X10_TEMP8 = (Program._Program__MyProgram_mask);

final long ma = (X10_TEMP8);
final long X10_TEMP11 = (rm&ma);

final long X10_TEMP5 = (X10_TEMP11);
final long X10_TEMP14 = (X10_TEMP5);

seed = (X10_TEMP14);
}


}

value T1 {
public final double [:rank==2] t;
public final int i;
public final int j;
public final double v;


public T1(final double [:rank==2] a_t, final int a_i, final int a_j, final double a_v) {
final double[:rank==2] X10_TEMP2 = (double[:rank==2])(a_t);

t = (double[:rank==2])(X10_TEMP2);
final int X10_TEMP5 = (a_i);

i = (X10_TEMP5);
final int X10_TEMP8 = (a_j);

j = (X10_TEMP8);
final double X10_TEMP11 = (a_v);

v = (X10_TEMP11);
}


}

value T2 {
public final double [:rank==2] G;
public final int i;
public final int j;
public final place phere;
public final double [:rank==1] result;


public T2(final double [:rank==2] a_G, final int a_i, final int a_j, final place a_phere, final double [:rank==1] a_result) {
final double[:rank==2] X10_TEMP2 = (double[:rank==2])(a_G);

G = (double[:rank==2])(X10_TEMP2);
final int X10_TEMP5 = (a_i);

i = (X10_TEMP5);
final int X10_TEMP8 = (a_j);

j = (X10_TEMP8);
final place X10_TEMP11 = (a_phere);

phere = (X10_TEMP11);
final double[:rank==1] X10_TEMP14 = (double[:rank==1])(a_result);

result = (double[:rank==1])(X10_TEMP14);
}


}

value T3 {
public final double [:rank==1] result;
public final double val;


public T3(final double [:rank==1] a_result, final double a_val) {
final double[:rank==1] X10_TEMP2 = (double[:rank==1])(a_result);

result = (double[:rank==1])(X10_TEMP2);
final double X10_TEMP5 = (a_val);

val = (X10_TEMP5);
}


}

value T4 {
public final int ii;
public final int o;
public final double [:rank==2] G;
public final int Nm1;
public final double omega;


public T4(final int a_ii, final int a_o, final double [:rank==2] a_G, final int a_Nm1, final double a_omega) {
final int X10_TEMP2 = (a_ii);

ii = (X10_TEMP2);
final int X10_TEMP5 = (a_o);

o = (X10_TEMP5);
final double[:rank==2] X10_TEMP8 = (double[:rank==2])(a_G);

G = (double[:rank==2])(X10_TEMP8);
final int X10_TEMP11 = (a_Nm1);

Nm1 = (X10_TEMP11);
final double X10_TEMP14 = (a_omega);

omega = (X10_TEMP14);
}


}

value T5 {
public final int Nm1;
public final double [:rank==2] G;
public final int i;
public final double omega;


public T5(final int a_Nm1, final double [:rank==2] a_G, final int a_i, final double a_omega) {
final int X10_TEMP2 = (a_Nm1);

Nm1 = (X10_TEMP2);
final double[:rank==2] X10_TEMP5 = (double[:rank==2])(a_G);

G = (double[:rank==2])(X10_TEMP5);
final int X10_TEMP8 = (a_i);

i = (X10_TEMP8);
final double X10_TEMP11 = (a_omega);

omega = (X10_TEMP11);
}


}

