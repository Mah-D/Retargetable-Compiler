public class MR {
  public static final region(:rank==1) r = [0:300];
  public static final dist(:rank==1) d = (dist(:rank==1))dist.factory.block(r);

  public int[:rank==1] a;
  public int total;

  public MR() { 
     a = new int[d](point(:rank==1) [i]) { return i; };
     total = 0;
  }

  public void run() {
    map(); reduce(); System.out.println(total);
  }
  public void map() {
    finish ateach (point(:rank==1) p: a) { 
      a[p]=f(a[p]);
    }
  }
  public int f(int x) { return x*x; }
  public void reduce() {
    final place h = here;
    for (point(:rank==1) p: a) {
      finish {
        async(a.distribution.get(p)) { 
          final int v = a[p];
          async(h) { 
            total = total + v; 
          }
        }
      }
    }
  }
}
