public class Test {
	public static void main(String[] args)
	{
		D a = m();
		 b = a;
		System.out.println(b + ":" + a);
	}

	static D m() {
		return new D();
	}
}

class D {
	
}
