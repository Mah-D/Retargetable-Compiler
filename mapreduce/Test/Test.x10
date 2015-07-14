public class Test {
	public static void main(String[] args) { new A(0,1).run(); }
}

class A {
	public static final region(:rank==3) reg = [0:1, 0:1, 0:1];
	public static final dist(:rank==3) dReg = reg->here;
	public static final int[:rank==3] refArray = (int [:rank==3])new int[dReg] (point(:rank==3) [i,j,k]){return i+j+k;};
	public static final int value[:rank==3] valArray = (int value[:rank==3] )new int value[reg] (point(:rank==3) [i,j,k]){return i+j+k;};
	public static final int f1 = 10;
	public final int f2;
	public int f3;
	public A(int f2_, int f3_) {
		f2 = f2_;
		f3 = f3_;		
	}
	public void run() {
		final int i = 10;
		m1(i);
		int r = reg.ordinal([3,4,5]);
		System.out.println(r);
		m2(i);
	}
	public static int m1(int i) {
		return f1*i;
	}
	public int m2(int i) {
		return (f2+f3)*i;
	}
}
