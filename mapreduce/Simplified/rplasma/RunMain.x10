public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _MyProgram_r = (region(:rank==1))(Program._MyProgram_r_init());
public static final dist(:rank==1) _MyProgram_d = (dist(:rank==1))(Program._MyProgram_d_init());


public static void runMain() {
Program.MyProgram_init();
}
public static region(:rank==1) _MyProgram_r_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (300);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
return X10_TEMP6;
}
public static dist(:rank==1) _MyProgram_d_init() {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(dist.factory.block(_MyProgram_r));

return X10_TEMP2;
}
public static void MyProgram_init() {
final MR m = (new MR());
final int i = (4);
Program.MyProgram_run(m,i);
}
public static void MyProgram_run(final MR x, final int i) {
final String s = ("run: i = ");
System.out.print(s);
final String X10_TEMP5 = "";
final String X10_TEMP4 = X10_TEMP5 + i;
System.out.println(X10_TEMP4);
final int z = (0);
final int one = (1);
final boolean b = (i>z);
if (b) {
final int imo = (i-one);
Program.MyProgram_go(x,imo);
}
}
public static void MyProgram_go(final MR y, final int j) {
final String s = ("go: j = ");
System.out.print(s);
final String X10_TEMP5 = "";
final String X10_TEMP4 = X10_TEMP5 + j;
System.out.println(X10_TEMP4);
final int z = (0);
final int one = (1);
final boolean b1 = (j>one);
if (b1) {
Program.MyProgram_MR_run(y);
}
final boolean b2 = (j>z);
if (b2) {
final int jmo = (j-one);
Program.MyProgram_run(y,jmo);
}
}
public static void MyProgram_MR_run(final MR th) {
Program.MyProgram_MR_map(th);
Program.MyProgram_MR_reduce(th);
final int tot = (th.total);
final String X10_TEMP6 = "";
final String X10_TEMP5 = X10_TEMP6 + tot;
System.out.println(X10_TEMP5);
}
public static void MyProgram_MR_map(final MR th) {
final int[:rank==1] thisa = (int[:rank==1])(th.a);
finish {
for(point(:rank==1)p:thisa) {
final dist(:rank==1) di = (dist(:rank==1))(thisa.distribution);
final place pla = (di.get(p));
final T1 y = (new T1(thisa,th,p));
async(pla) {
Program.MyProgram_thread1(y);
}
}
}
}
public static int MyProgram_MR_f(final MR th, final int x) {
final int res = (x*x);
return res;
}
public static void MyProgram_MR_reduce(final MR th) {
final place h = (here);
final int[:rank==1] thisa = (int[:rank==1])(th.a);
for(point(:rank==1)p:thisa) {
finish {
final dist(:rank==1) di = (dist(:rank==1))(thisa.distribution);
final place pla = (di.get(p));
final T3 y = (new T3(thisa,th,p,h));
async(pla) {
Program.MyProgram_thread3(y);
}
}
}
}
public static void MyProgram_thread1(final T1 z) {
final int[:rank==1] thisa = (int[:rank==1])(z.thisa);
final MR th = (z.th);
point(:rank==1) p = (z.p);
final int i = (thisa[p]);
final int mrf = (Program.MyProgram_MR_f(th,i));
final int X10_TEMP12 = (mrf);
thisa[p] = (X10_TEMP12);
}
public static void MyProgram_thread2(final T2 z) {
final MR th = (z.th);
final int v = (z.v);
final int i = (th.total);
final int iv = (i+v);
final int X10_TEMP7 = (iv);
th.total = (X10_TEMP7);
}
public static void MyProgram_thread3(final T3 z) {
final int[:rank==1] thisa = (int[:rank==1])(z.thisa);
final MR th = (z.th);
point(:rank==1) p = (z.p);
place h = (z.h);
final int v = (thisa[p]);
final T2 y = (new T2(th,v));
async(h) {
Program.MyProgram_thread2(y);
}
}
public static String T1_toString(final T1 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T2_toString(final T2 X10_TEMP0) {
final String s = ("");
return s;
}
public static String T3_toString(final T3 X10_TEMP0) {
final String s = ("");
return s;
}

}

class MyProgram {
}

class MR {
public int [:rank==1] a;
public int total;


public MR() {
final dist(:rank==1) dd = (dist(:rank==1))(Program._MyProgram_d);
final int[:rank==1] X10_TEMP4 = (int[:rank==1])(new int[dd](point(:rank==1)[i]) {
return i;
}

);
a = (int[:rank==1])(X10_TEMP4);
final int X10_TEMP6 = (0);
total = (X10_TEMP6);
}


}

value T1 {
public final int [:rank==1] thisa;
public final MR th;
public final point(:rank==1) p;


public T1(final int [:rank==1] a_thisa, final MR a_th, final point(:rank==1) a_p) {
thisa = (int[:rank==1])(a_thisa);
th = (a_th);
p = (a_p);
}


}

value T2 {
public final MR th;
public final int v;


public T2(final MR a_th, final int a_v) {
th = (a_th);
v = (a_v);
}


}

value T3 {
public final int [:rank==1] thisa;
public final MR th;
public final point(:rank==1) p;
public final place h;


public T3(final int [:rank==1] a_thisa, final MR a_th, final point(:rank==1) a_p, final place a_h) {
thisa = (int[:rank==1])(a_thisa);
th = (a_th);
p = (a_p);
h = (a_h);
}


}

