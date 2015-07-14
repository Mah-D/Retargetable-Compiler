public class RunMain0 {
public static void main (String[] args) {
 Program0.runMain();
}

}

class Program0 {
public static final region(:rank==1) _Program__MR_r = (region(:rank==1))(Program0._Program__MR_r_init());
public static final dist(:rank==1) _Program__MR_d = (dist(:rank==1))(Program0._Program__MR_d_init());


public static void runMain() {
Program0.Program_runMain();
}
public static region(:rank==1) _Program__MR_r_init() {
final region(:rank==1) X10_TEMP30 = (region(:rank==1))(Program0.Program__MR_r_init());

return X10_TEMP30;
}
public static dist(:rank==1) _Program__MR_d_init() {
final dist(:rank==1) X10_TEMP30 = (dist(:rank==1))(Program0.Program__MR_d_init());

return X10_TEMP30;
}
public static void Program_runMain() {
final MR X10_TEMP30 = (new MR());

final MR X10_TEMP1 = (X10_TEMP30);
Program0.Program_MR_run(X10_TEMP1);
}
public static region(:rank==1) Program__MR_r_init() {
final int X10_TEMP30 = (0);

final int X10_TEMP3 = (X10_TEMP30);
final int X10_TEMP33 = (300);

final int X10_TEMP4 = (X10_TEMP33);
final region(:rank==1) X10_TEMP38 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))(X10_TEMP38);
return X10_TEMP6;
}
public static dist(:rank==1) Program__MR_d_init() {
final dist(:rank==1) X10_TEMP31 = (dist(:rank==1))(dist.factory.block(_Program__MR_r));

final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP31);
return X10_TEMP2;
}
public static void Program_MR_run(final MR X10_TEMP0) {
Program0.Program_MR_map(X10_TEMP0);
Program0.Program_MR_reduce(X10_TEMP0);
final int X10_TEMP32 = (X10_TEMP0.total);

final int X10_TEMP2 = (X10_TEMP32);
final String X10_TEMP4 = ("");
final String X10_TEMP3 = (X10_TEMP4+X10_TEMP2);
System.out.println(X10_TEMP3);
}
public static void Program_MR_map(final MR X10_TEMP0) {
final int[:rank==1] X10_TEMP30 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] b = (int[:rank==1])(X10_TEMP30);
finish {
for(point(:rank==1)p:b) {
final dist(:rank==1) X10_TEMP34 = (dist(:rank==1))(b.distribution);

final dist(:rank==1) X10_TEMP3 = (dist(:rank==1))(X10_TEMP34);
final place X10_TEMP4 = (X10_TEMP3.get(p));
async(X10_TEMP4) {
final int X10_TEMP41 = (b[p]);

final int X10_TEMP8 = (X10_TEMP41);
final int X10_TEMP46 = (Program0.Program_MR_f(X10_TEMP0,X10_TEMP8));

final int X10_TEMP11 = (X10_TEMP46);
final int X10_TEMP49 = (X10_TEMP11);

final int X10_TEMP12 = (X10_TEMP49);
final int X10_TEMP53 = (X10_TEMP12);

final int X10_TEMP56 = (X10_TEMP53);
b[p] = (X10_TEMP56);
}
}
}
}
public static int Program_MR_f(final MR X10_TEMP0, final int x) {
int X10_TEMP1 = (x);
final int X10_TEMP31 = (X10_TEMP1*X10_TEMP1);

final int X10_TEMP3 = (X10_TEMP31);
return X10_TEMP3;
}
public static void Program_MR_reduce(final MR X10_TEMP0) {
final place X10_TEMP30 = (here);

final place h = (X10_TEMP30);
final int[:rank==1] X10_TEMP33 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] X10_TEMP2 = (int[:rank==1])(X10_TEMP33);
final region(:rank==1) X10_TEMP36 = (region(:rank==1))(X10_TEMP2.region);

final region(:rank==1) reg = (region(:rank==1))(X10_TEMP36);
final place X10_TEMP39 = (here);

final place X10_TEMP4 = (X10_TEMP39);
final dist(:rank==1) X10_TEMP42 = (dist(:rank==1))(reg->X10_TEMP4);

final dist(:rank==1) dis = (dist(:rank==1))(X10_TEMP42);
final int[:rank==1&&distribution==dis] X10_TEMP45 = (int[:rank==1&&distribution==dis])(new int[dis]);

final int[:rank==1] result = (int[:rank==1])(X10_TEMP45);
final int[:rank==1] X10_TEMP48 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] X10_TEMP8 = (int[:rank==1])(X10_TEMP48);
for(point(:rank==1)p:X10_TEMP8) {
finish {
final int[:rank==1] X10_TEMP52 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] c = (int[:rank==1])(X10_TEMP52);
final int[:rank==1] X10_TEMP55 = (int[:rank==1])(X10_TEMP0.a);

final int[:rank==1] X10_TEMP10 = (int[:rank==1])(X10_TEMP55);
final dist(:rank==1) X10_TEMP58 = (dist(:rank==1))(X10_TEMP10.distribution);

final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(X10_TEMP58);
final place X10_TEMP14 = (X10_TEMP11.get(p));
async(X10_TEMP14) {
final int X10_TEMP65 = (c[p]);

final int v = (X10_TEMP65);
async(h) {
final int X10_TEMP69 = (v);

final int X10_TEMP21 = (X10_TEMP69);
final int X10_TEMP73 = (X10_TEMP21);

final int X10_TEMP76 = (X10_TEMP73);
result[p] = (X10_TEMP76);
}
}
}
}
for(point(:rank==1)p:result) {
final int X10_TEMP79 = (X10_TEMP0.total);

final int X10_TEMP25 = (X10_TEMP79);
final int X10_TEMP83 = (result[p]);

final int X10_TEMP26 = (X10_TEMP83);
final int X10_TEMP86 = (X10_TEMP25+X10_TEMP26);

final int X10_TEMP27 = (X10_TEMP86);
final int X10_TEMP89 = (X10_TEMP27);

final int X10_TEMP92 = (X10_TEMP89);
X10_TEMP0.total = (X10_TEMP92);
}
}

}

class Program {
}

class MR {
public int [:rank==1] a;
public int total;


public MR() {
final dist(:rank==1) X10_TEMP30 = (dist(:rank==1))(Program0._Program__MR_d);

final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(X10_TEMP30);
final int[:rank==1&&distribution==X10_TEMP1] X10_TEMP34 = (int[:rank==1&&distribution==X10_TEMP1])(new int[X10_TEMP1](point(:rank==1)[i]) {
return i;
}

);

final int[:rank==1] X10_TEMP4 = (int[:rank==1])(X10_TEMP34);
final int[:rank==1] X10_TEMP37 = (int[:rank==1])(X10_TEMP4);

a = (int[:rank==1])(X10_TEMP37);
final int X10_TEMP40 = (0);

final int X10_TEMP6 = (X10_TEMP40);
final int X10_TEMP43 = (X10_TEMP6);

total = (X10_TEMP43);
}


}

