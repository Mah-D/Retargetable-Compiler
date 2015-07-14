public class Test {
  void f(final dist(:rank==1) d) {
    final dist(:rank==1) d1 = d;
    final dist(:rank==1) d2 = d;
    final int [:rank==1 && distribution==d1] a1 = new int[d1];
    final int [:rank==1 && distribution==d2] a2 = a1;
  }
}
