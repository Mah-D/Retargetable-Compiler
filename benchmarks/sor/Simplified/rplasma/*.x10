public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
}

class SOR {
public final Random R;


public double gtotal;


public SOR() {
final long rs = (Program._Program_RANDOM_SEED);
R = (new Random(rs));
gtotal = (0.0);
}

}

class Random {
public long seed;


public Random(final long rseed) {
final long mu = (Program._Program_multiplier);
final long rm = (rseed^mu);
final long ma = (Program._Program_mask);
seed = (rm&ma);
}

}

value T1 {
public final double [:rank==2] t;
public final int i;
public final int j;
public final double v;


public T1(final double [:rank==2] a_t, final int a_i, final int a_j, final double a_v) {
t = (double[:rank==2])(a_t);
i = (a_i);
j = (a_j);
v = (a_v);
}
public String toString() {
final String s = ("");
return s;
}

}

value T2 {
public final double [:rank==2] G;
public final int i;
public final int j;
public final place phere;
public final double [:rank==1] result;


public T2(final double [:rank==2] a_G, final int a_i, final int a_j, final place a_phere, final double [:rank==1] a_result) {
G = (double[:rank==2])(a_G);
i = (a_i);
j = (a_j);
phere = (a_phere);
result = (double[:rank==1])(a_result);
}
public String toString() {
final String s = ("");
return s;
}

}

value T3 {
public final double [:rank==1] result;
public final double val;


public T3(final double [:rank==1] a_result, final double a_val) {
result = (double[:rank==1])(a_result);
val = (a_val);
}
public String toString() {
final String s = ("");
return s;
}

}

value T4 {
public final int ii;
public final int o;
public final double [:rank==2] G;
public final int Nm1;
public final double omega;


public T4(final int a_ii, final int a_o, final double [:rank==2] a_G, final int a_Nm1, final double a_omega) {
ii = (a_ii);
o = (a_o);
G = (double[:rank==2])(a_G);
Nm1 = (a_Nm1);
omega = (a_omega);
}
public String toString() {
final String s = ("");
return s;
}

}

value T5 {
public final int Nm1;
public final double [:rank==2] G;
public final int i;
public final double omega;


public T5(final int a_Nm1, final double [:rank==2] a_G, final int a_i, final double a_omega) {
Nm1 = (a_Nm1);
G = (double[:rank==2])(a_G);
i = (a_i);
omega = (a_omega);
}
public String toString() {
final String s = ("");
return s;
}

}

