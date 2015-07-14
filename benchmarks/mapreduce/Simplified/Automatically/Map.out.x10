public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}
}
class Program {
public static final region(:rank==1) _MR_r = (region(:rank==1))(_MR_r_init());
public static final dist(:rank==1) _MR_d = (dist(:rank==1))(_MR_d_init());

public static void runMain() {
  final MR X10_TEMP1 = (new MR());
  Program.MR_run(X10_TEMP1);
}

public static region(:rank==1) _MR_r_init() {

final region(:rank==1) X10_TEMP4 = (region(:rank==1))([0:300]);
return X10_TEMP4;
}
public static dist(:rank==1) _MR_d_init() {
final region(:rank==1) X10_TEMP2 = (region(:rank==1))(_MR_r_init());
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(dist.factory.block(X10_TEMP2));

return X10_TEMP3;
}
public static void MR_t() {
}
public static void MR_run(final MR X10_TEMP0) {
Program.MR_t();
Program.MR_map(X10_TEMP0);
Program.MR_reduce(X10_TEMP0);
final int X10_TEMP2 = (X10_TEMP0.total);
System.out.println(X10_TEMP2);
}
public static void MR_map(final MR X10_TEMP0) {
finish {
final int[:rank==1] X10_TEMP2 = (int[:rank==1])(X10_TEMP0.a);
for(point(:rank==1)p:X10_TEMP2) {
final dist(:rank==1) X10_TEMP3 = (dist(:rank==1)) X10_TEMP2.distribution;
final place X10_TEMP4 = X10_TEMP3.get(p);
async(X10_TEMP4) {
final int[:rank==1] X10_TEMP5 = (int[:rank==1])(X10_TEMP0.b);

final int[:rank==1] X10_TEMP7 = (int[:rank==1])(X10_TEMP0.a);

final int X10_TEMP10 = (X10_TEMP7[p]);

X10_TEMP5[p] = (Program.MR_f(X10_TEMP0,X10_TEMP10));
final int[:rank==1] X10_TEMP12 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] X10_TEMP14 = (int[:rank==1])(X10_TEMP0.a);

final int X10_TEMP17 = (X10_TEMP14[p]);

X10_TEMP12[p] = (Program.MR_f(X10_TEMP0,X10_TEMP17));
}
}
}
}
public static int MR_f(final MR X10_TEMP0, final int x) {
int X10_TEMP1 = x;
final int X10_TEMP3 = (X10_TEMP1*X10_TEMP1);
return X10_TEMP3;
}
public static void MR_reduce(final MR X10_TEMP0) {
final place h = (here);
final int[:rank==1] X10_TEMP3 = (int[:rank==1])(X10_TEMP0.a);
for(point(:rank==1)p:X10_TEMP3) {
finish {
final int[:rank==1] X10_TEMP4 = (int[:rank==1])(X10_TEMP0.a);
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(X10_TEMP4.distribution);

final place X10_TEMP8 = X10_TEMP5.get(p);
async(X10_TEMP8) {
final int[:rank==1] X10_TEMP9 = (int[:rank==1])(X10_TEMP0.a);

final int v = (X10_TEMP9[p]);
final int[:rank==1] X10_TEMP12 = (int[:rank==1])(X10_TEMP0.b);

final int vv = (X10_TEMP12[p]);
final dist(:rank==1) X10_TEMP15 = (dist(:rank==1))(_MR_d.distribution);

final dist(:rank==1) d1 = (dist(:rank==1))(X10_TEMP15);
final int X10_TEMP17 = (X10_TEMP0.total);
final int X10_TEMP18 = (1);

X10_TEMP0.total = (X10_TEMP17+X10_TEMP18);
async(h) {
final int X10_TEMP21 = (X10_TEMP0.total);

X10_TEMP0.total = (X10_TEMP21+v);
}
}
}
}
}
}
class MR {
public int [:rank==1] a;
public int [:rank==1] b;
public int total;
public MR() {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(Program._MR_d);

a = (int[:rank==1])(new int[X10_TEMP1](point(:rank==1)[i]) {
return i;
}

);
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(Program._MR_d);

b = (int[:rank==1])(new int[X10_TEMP4](point(:rank==1)[i]) {
return i;
}

);
total = (0);
}
}
