public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==3) _A_reg = (region(:rank==3))(Program._A_reg_init());
public static final int _A_f1 = (Program._A_f1_init());
public static final dist(:rank==3) _A_dReg = (dist(:rank==3))(Program._A_dReg_init());
public static final int value[:rank==3] _A_valArray = (int value[:rank==3])(Program._A_valArray_init());
public static final int[:rank==3] _A_refArray = (int[:rank==3])(Program._A_refArray_init());


public static void runMain() {
int X10_TEMP3 = (0);
int X10_TEMP4 = (1);
final A X10_TEMP5 = (new A(X10_TEMP3,X10_TEMP4));

Program.A_run(X10_TEMP5);
}
public static region(:rank==3) _A_reg_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (0);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (0);
final int X10_TEMP12 = (1);

final region(:rank==3) X10_TEMP14 = (region(:rank==3))([X10_TEMP3:X10_TEMP4,X10_TEMP7:X10_TEMP8,X10_TEMP11:X10_TEMP12]);
return X10_TEMP14;
}
public static dist(:rank==3) _A_dReg_init() {
final place X10_TEMP1 = (here);

final dist(:rank==3) X10_TEMP3 = (dist(:rank==3))(_A_reg->X10_TEMP1);
return X10_TEMP3;
}
public static int[:rank==3] _A_refArray_init() {
final int[:rank==3&&distribution==_A_dReg] X10_TEMP4 = (int[:rank==3&&distribution==_A_dReg])(new int[_A_dReg](point(:rank==3)[i,j,k]) {
final int X10_TEMP1 = (i+j);

final int X10_TEMP3 = (X10_TEMP1+k);
return X10_TEMP3;
}

);

return X10_TEMP4;
}
public static int value[:rank==3] _A_valArray_init() {
final int value[:rank==3] X10_TEMP4 = (int value[:rank==3])(new int value[_A_reg](point(:rank==3)[i,j,k]) {
final int X10_TEMP1 = (i+j);

final int X10_TEMP3 = (X10_TEMP1+k);
return X10_TEMP3;
}

);

return X10_TEMP4;
}
public static int _A_f1_init() {

final int X10_TEMP2 = (10);
return X10_TEMP2;
}
public static void A_run(final A X10_TEMP0) {
final int i = (10);
Program.A_m1(i);
Program.A_m2(X10_TEMP0,i);
}
public static int A_m1(final int i) {
int X10_TEMP1 = i;
final int X10_TEMP3 = (_A_f1*X10_TEMP1);
return X10_TEMP3;
}
public static int A_m2(final A X10_TEMP0, final int i) {
int X10_TEMP1 = i;
final int X10_TEMP2 = (X10_TEMP0.f2);
final int X10_TEMP3 = (X10_TEMP0.f3);

final int X10_TEMP5 = (X10_TEMP2+X10_TEMP3);

final int X10_TEMP7 = (X10_TEMP5*X10_TEMP1);
return X10_TEMP7;
}

}

class A {
public final int f2;


public int f3;


public A(final int f2_, final int f3_) {
int X10_TEMP1 = (f2_);
int X10_TEMP2 = (f3_);
f2 = (X10_TEMP1);
f3 = (X10_TEMP2);
}


}

