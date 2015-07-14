public class Test
{
	public static void main(String[] args)
	{
		new Test();
		double x = 10.003;
		double y = 1.123;
		System.out.println(x%y);
	}
	/*public boolean run() {
		final dist(:rank==1) dis = [0:0]->here;
		final TO[:rank==1] temp = new TO[dis];
		final place pl = here;
		finish
		{
			async(pl.next()) {
				//final TO to = new TO();
				//async(pl) {
				//	temp[0] = to;
				//}
				// TPlasmaX10 version
				Thread1(dis, temp, pl);
			}
		}
		final TO to = temp[0];
		System.out.println(temp[0]);
		async(pl.next()) {
			System.out.println(to.localArray[0] + ":" + to.localArray[1]);
		}
		return true;
	}
	public static void Thread1(final dist(:rank==1) d, final TO[:rank==1] a, final place pl)
	{
		// need to preserve the reference "to"
		final TO to = new TO([0:place.MAX_PLACES-1]);
		async(pl) {
			Thread2(a, to);
		}
	}
	public static void Thread2(final TO[:rank==1] a, final TO to)
	{
		a[0] = to;
	}*/
	public static int r(final int r)
	{
		return r;
	}
}

value TO {
	public final int[:rank==1] localArray;
	public TO(final region(:rank==1) R) {
		localArray = getArray(R);
		/*localArray = (int[:rank==1]) (new int[R](point [p])
			{
				//int r = Test.r(p);
				return p;
			});*/
	}
	public TO(final region(:rank==1) R, final int r) {
		localArray = getArray(R);
		/*localArray = (int[:rank==1]) (new int[R](point [p])
			{
				//int r = Test.r(p);
				return p;
			});*/
	}
	public TO(final double b, final region(:rank==1) R) {
		localArray = getArray(R);
		/*localArray = (int[:rank==1]) (new int[R](point [p])
			{
				//int r = Test.r(p);
				return p;
			});*/
	}
	public int[:rank==1] getArray(final region(:rank==1) R)
	{
		final dist(:rank==1) d = [0:1] -> here;
		int[:rank==1] temp = new int[d](point(:rank==1) [p]){return Test.r(p);};
		double x = 10.003;
		double y = 11.123;
		System.out.println(x%y);
		return temp;
	}
}
