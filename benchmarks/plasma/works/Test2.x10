public class Test2 {
  public static void main(String[] arg) {
    new A().f([0:0]->here,[1:1,2:2]->here);
  }
}

class A {
  void f(final dist(:rank==1) b, final dist(:rank==2) d) {
    int[:rank==1] a = new int[b];
    for (point p : d.region) {
      a[p] = 1;
    }
  }
}
