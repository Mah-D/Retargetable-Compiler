public class C
{
	//public final int[:rank==1] a;
	public static void main(String[] args)
	{
		new C();
	}
	public C()
	{
		final region(:rank==2) r2 = [[1:2],[2:3]];
		final dist(:rank==1) d = [0:0] -> here;
		System.out.println(place.places(2000));
		//a = (int[:rank==1]) new int[d](point p){return 0;};
	}
}
