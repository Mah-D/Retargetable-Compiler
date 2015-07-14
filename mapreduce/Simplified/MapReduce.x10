public class MapReduce {
    public static void main(String[] args) { MyProgram.init(); }
}

class MyProgram {
  public static final region(:rank==1) r = [0:300];
  public static final dist(:rank==1) d = (dist(:rank==1))dist.factory.block(r);
  public static void init() {
     final MR m = new MR();
     final int i = 4;
     run(m, i); 
  }
  public static void run(final MR x, final int i) {
    final String s = "run: i = ";
    System.out.print(s);
    System.out.println(i);
    final int z = 0;
    final int one = 1;
    final boolean b = i>z;
    if (b) {
      final int imo = i-one;
      go(x,imo);
    }
  }
  public static void go(final MR y, final int j) {
    final String s = "go: j = ";
    System.out.print(s);
    System.out.println(j);
    final int z = 0;
    final int one = 1;
    final boolean b1 = j>one;
    if (b1) { MR_run(y); }
    final boolean b2 = j>z;
    if (b2) {
      final int jmo = j-one;
      run(y,jmo);
    }
  }

  public static void MR_run(final MR th) {
    MR_map(th); 
    MR_reduce(th); 
    final int tot = th.total;
    System.out.println(tot);
  }
  public static void MR_map(final MR th) {
    final int[:rank==1] thisa = th.a;
    finish { for (point(:rank==1) p: thisa) { 
      final dist(:rank==1) di = thisa.distribution;
      final place pla = di.get(p);
      final T1 y = new T1(thisa,th,p);
      async(pla) { thread1(y); }
    } }
  }
  public static int MR_f(final MR th, final int x) { 
    final int res = x*x;
    return res; 
  }
  public static void MR_reduce(final MR th) {
    final place h = here;
    final int[:rank==1] thisa = th.a;
    for (point(:rank==1) p: thisa) {
      finish {
        final dist(:rank==1) di = thisa.distribution;
        final place pla = di.get(p);
        final T3 y = new T3(thisa,th,p,h);
        async(pla) { thread3(y); }
      }
    }
  }
  public static void thread1(final T1 z) {
    final int[:rank==1] thisa = z.thisa;
    final MR th = z.th;  
    point(:rank==1) p = z.p;

    final int i = thisa[p];
    final int mrf = MR_f(th,i);
    thisa[p] = mrf;
  }

  public static void thread2(final T2 z) {
    final MR th = z.th;
    final int v = z.v;

    final int i = th.total;
    final int iv = i + v;
    th.total = iv;
  }

  public static void thread3(final T3 z) {
    final int[:rank==1] thisa = z.thisa;
    final MR th = z.th;  
    point(:rank==1) p = z.p;
    place h = z.h;  

    final int v = thisa[p];
    final T2 y = new T2(th,v);
    async(h) { thread2(y); }
  }
}

class MR {
  public int[:rank==1] a; 
  public int total;
  public MR() { 
     final dist(:rank==1) dd = MyProgram.d;
     a = new int[dd](point(:rank==1) [i]) { return i; }; 
     total = 0;
  }
}

value T1 {
  public final int[:rank==1] thisa;
  public final MR th;
  public final point(:rank==1) p;
  public T1(final int[:rank==1] a_thisa, final MR a_th, final point(:rank==1) a_p) {
    thisa = a_thisa;
       th = a_th;  
        p = a_p;
  }
  public String toString() { final String s = ""; return s; }
}

value T2 {
  public final MR th; 
  public final int v;
  public T2(final MR a_th, final int a_v) {
    th = a_th;
     v = a_v;
  }
  public String toString() { final String s = ""; return s; }
}

value T3 {
  public final int[:rank==1] thisa; 
  public final MR th; 
  public final point(:rank==1) p;
  public final place h;
  public T3(final int[:rank==1] a_thisa, final MR a_th, final point(:rank==1) a_p,
                      final place a_h) {
    thisa = a_thisa;
       th = a_th;  
        p = a_p;
        h = a_h;     
  }
  public String toString() { final String s = ""; return s; }
}
