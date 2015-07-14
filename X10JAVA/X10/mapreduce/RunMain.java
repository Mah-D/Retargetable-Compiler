import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;


public class RunMain {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public static void main(String[] args) {
		Program.runMain(0);
	}
}
class Program   {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}
public static final Region1 _MR_r = Program._MR_r_init(myUniquePlacePoint);
public static final Dist1 _MR_d = Program._MR_d_init(myUniquePlacePoint);


public static void runMain (  int myUniquePlacePoint)		{

		final MR X10_TEMP1 = new MR(myUniquePlacePoint);
		Program.MR_run(X10_TEMP1,myUniquePlacePoint);
		}
public static Region1 _MR_r_init (  int myUniquePlacePoint)		{

		final int X10_TEMP3 = 0;

		final int X10_TEMP4 = 300;

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);
		return X10_TEMP6;
		}
public static Dist1 _MR_d_init (  int myUniquePlacePoint)		{

		final Dist1 X10_TEMP2 = Program.getBlockDist1(_MR_r,myUniquePlacePoint);
		return X10_TEMP2;
		}
public static void MR_run ( final MR X10_TEMP0, int myUniquePlacePoint)		{
		Program.MR_map(X10_TEMP0,myUniquePlacePoint);
		Program.MR_reduce(X10_TEMP0,myUniquePlacePoint);
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
		throw new RuntimeException("Object in wrong place");
		}
		final int X10_TEMP2 = X10_TEMP0.total;

		final String X10_TEMP4 = "";

		final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;
		System.out.println(X10_TEMP3);
		}
public static void MR_map ( final MR X10_TEMP0, int myUniquePlacePoint)		{
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
		throw new RuntimeException("Object in wrong place");
		}
		final intRefArray1 b = X10_TEMP0.a;
					{
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(b)){
			throw new RuntimeException("Object in wrong place");
			}
			final Dist1 RX10_TEMP1 = b.distValue;
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP1)){
			throw new RuntimeException("Object in wrong place");
			}
			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP2)){
			throw new RuntimeException("Object in wrong place");
			}
			final Point1[] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3.length; RX10_TEMP0++)
				{

				final Point1 p = RX10_TEMP3[RX10_TEMP0];
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(b)){
				throw new RuntimeException("Object in wrong place");
				}
				final Dist1 RX10_TEMP4 = b.distValue;

				final Dist1 X10_TEMP3 = RX10_TEMP4;
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP3)){
				throw new RuntimeException("Object in wrong place");
				}
				final Region1 RX10_TEMP5 = X10_TEMP3.dReg;

				final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, p,myUniquePlacePoint);

				final int RX10_TEMP7 = 0;

				final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
				if(RX10_TEMP8)
					{

					final String RX10_TEMP9 = "Point p not found in the distribution X10_TEMP3.";
throw new RuntimeException(RX10_TEMP9);

					}
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP3)){
				throw new RuntimeException("Object in wrong place");
				}
				final Dist SX10_TEMP0 = X10_TEMP3.dDist;

				final int RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6,myUniquePlacePoint);

				final int X10_TEMP4 = RX10_TEMP10;
				//async(X10_TEMP4)
					{
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(b)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist1 RX10_TEMP11 = b.distValue;
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(RX10_TEMP11)){
					throw new RuntimeException("Object in wrong place");
					}
					final Region1 RX10_TEMP12 = RX10_TEMP11.dReg;

					final int RX10_TEMP13 = Program.searchPointInRegion1(RX10_TEMP12, p,X10_TEMP4);

					final int RX10_TEMP14 = 0;

					final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14;
					if(RX10_TEMP15)
						{

						String RX10_TEMP16 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP16);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(RX10_TEMP11)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist SX10_TEMP1 = RX10_TEMP11.dDist;

					final int RX10_TEMP17 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP13,X10_TEMP4);

					final int RX10_TEMP19 = 0;

					final boolean RX10_TEMP20 = RX10_TEMP17 != RX10_TEMP19;
					if(RX10_TEMP20)
						{

						String RX10_TEMP18 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP18);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(b)){
					throw new RuntimeException("Object in wrong place");
					}
					final INTArray RX10_TEMP21 = b.contents;

					final int X10_TEMP8 = Program.INTGetValue(RX10_TEMP21, RX10_TEMP13,X10_TEMP4);

					final int X10_TEMP11 = Program.MR_f(X10_TEMP0, X10_TEMP8,X10_TEMP4);

					final int X10_TEMP12 = X10_TEMP11;
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(b)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist1 RX10_TEMP22 = b.distValue;
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(RX10_TEMP22)){
					throw new RuntimeException("Object in wrong place");
					}
					final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;

					final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, p,X10_TEMP4);

					final int RX10_TEMP25 = 0;

					final boolean RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25;
					if(RX10_TEMP26)
						{

						String RX10_TEMP27 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP27);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(RX10_TEMP22)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist SX10_TEMP2 = RX10_TEMP22.dDist;

					final int RX10_TEMP28 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP24,X10_TEMP4);

					final int RX10_TEMP30 = 0;

					final boolean RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30;
					if(RX10_TEMP31)
						{

						String RX10_TEMP29 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP29);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP4) || !globalPointerHashMap.get(X10_TEMP4).contains(b)){
					throw new RuntimeException("Object in wrong place");
					}
					final INTArray RX10_TEMP32 = b.contents;
					Program.INTSetValue(RX10_TEMP32, RX10_TEMP24, X10_TEMP12,X10_TEMP4);
					}
				}
			}
		}
public static int MR_f ( final MR X10_TEMP0, final int x, int myUniquePlacePoint)		{

		int X10_TEMP1 = x;

		final int X10_TEMP3 = X10_TEMP1 * X10_TEMP1;
		return X10_TEMP3;
		}
public static void MR_reduce ( final MR X10_TEMP0, int myUniquePlacePoint)		{

		final int h = 0;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
		throw new RuntimeException("Object in wrong place");
		}
		final intRefArray1 X10_TEMP2 = X10_TEMP0.a;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP2)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist1 RX10_TEMP0 = X10_TEMP2.distValue;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP0)){
		throw new RuntimeException("Object in wrong place");
		}
		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;

		final Region1 reg = RX10_TEMP1;

		final int X10_TEMP4 = 0;

		final Dist1 dis = Program.getPlaceDist1(reg, X10_TEMP4,myUniquePlacePoint);
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(dis)){
		throw new RuntimeException("Object in wrong place");
		}
		final Region1 RX10_TEMP2 = dis.dReg;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(dis)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist RX10_TEMP3 = dis.dDist;

		final INTArray RX10_TEMP4 = new INTArray(RX10_TEMP3,myUniquePlacePoint);

		final intRefArray1 RX10_TEMP5 = new intRefArray1(dis, RX10_TEMP4,myUniquePlacePoint);

		final intRefArray1 result = RX10_TEMP5;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
		throw new RuntimeException("Object in wrong place");
		}
		final intRefArray1 X10_TEMP8 = X10_TEMP0.a;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP8)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist1 RX10_TEMP7 = X10_TEMP8.distValue;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP7)){
		throw new RuntimeException("Object in wrong place");
		}
		final Region1 RX10_TEMP8 = RX10_TEMP7.dReg;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP8)){
		throw new RuntimeException("Object in wrong place");
		}
		final Point1[] RX10_TEMP9 = RX10_TEMP8.pointArray;
		for(int RX10_TEMP6=0; RX10_TEMP6 < RX10_TEMP9.length; RX10_TEMP6++)
			{

			final Point1 p = RX10_TEMP9[RX10_TEMP6];
							{
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
				throw new RuntimeException("Object in wrong place");
				}
				final intRefArray1 c = X10_TEMP0.a;
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
				throw new RuntimeException("Object in wrong place");
				}
				final intRefArray1 X10_TEMP10 = X10_TEMP0.a;
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP10)){
				throw new RuntimeException("Object in wrong place");
				}
				final Dist1 RX10_TEMP10 = X10_TEMP10.distValue;

				final Dist1 X10_TEMP11 = RX10_TEMP10;
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP11)){
				throw new RuntimeException("Object in wrong place");
				}
				final Region1 RX10_TEMP11 = X10_TEMP11.dReg;

				final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, p,myUniquePlacePoint);

				final int RX10_TEMP13 = 0;

				final boolean RX10_TEMP14 = RX10_TEMP12 < RX10_TEMP13;
				if(RX10_TEMP14)
					{

					final String RX10_TEMP15 = "Point p not found in the distribution X10_TEMP11.";
throw new RuntimeException(RX10_TEMP15);

					}
				if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP11)){
				throw new RuntimeException("Object in wrong place");
				}
				final Dist SX10_TEMP0 = X10_TEMP11.dDist;

				final int RX10_TEMP16 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP12,myUniquePlacePoint);

				final int X10_TEMP14 = RX10_TEMP16;
				//async(X10_TEMP14)
					{
					if(!globalPointerHashMap.containsKey(X10_TEMP14) || !globalPointerHashMap.get(X10_TEMP14).contains(c)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist1 RX10_TEMP17 = c.distValue;
					if(!globalPointerHashMap.containsKey(X10_TEMP14) || !globalPointerHashMap.get(X10_TEMP14).contains(RX10_TEMP17)){
					throw new RuntimeException("Object in wrong place");
					}
					final Region1 RX10_TEMP18 = RX10_TEMP17.dReg;

					final int RX10_TEMP19 = Program.searchPointInRegion1(RX10_TEMP18, p,X10_TEMP14);

					final int RX10_TEMP20 = 0;

					final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
					if(RX10_TEMP21)
						{

						String RX10_TEMP22 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP22);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP14) || !globalPointerHashMap.get(X10_TEMP14).contains(RX10_TEMP17)){
					throw new RuntimeException("Object in wrong place");
					}
					final Dist SX10_TEMP1 = RX10_TEMP17.dDist;

					final int RX10_TEMP23 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP19,X10_TEMP14);

					final int RX10_TEMP25 = 0;

					final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
					if(RX10_TEMP26)
						{

						String RX10_TEMP24 = "Bad place access for array c";
throw new RuntimeException(RX10_TEMP24);

						}
					if(!globalPointerHashMap.containsKey(X10_TEMP14) || !globalPointerHashMap.get(X10_TEMP14).contains(c)){
					throw new RuntimeException("Object in wrong place");
					}
					final INTArray RX10_TEMP27 = c.contents;

					final int v = Program.INTGetValue(RX10_TEMP27, RX10_TEMP19,X10_TEMP14);
					//async(h)
						{

						final int X10_TEMP21 = v;
						if(!globalPointerHashMap.containsKey(h) || !globalPointerHashMap.get(h).contains(result)){
						throw new RuntimeException("Object in wrong place");
						}
						final Dist1 RX10_TEMP28 = result.distValue;
						if(!globalPointerHashMap.containsKey(h) || !globalPointerHashMap.get(h).contains(RX10_TEMP28)){
						throw new RuntimeException("Object in wrong place");
						}
						final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;

						final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, p,h);

						final int RX10_TEMP31 = 0;

						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if(RX10_TEMP32)
							{

							String RX10_TEMP33 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP33);

							}
						if(!globalPointerHashMap.containsKey(h) || !globalPointerHashMap.get(h).contains(RX10_TEMP28)){
						throw new RuntimeException("Object in wrong place");
						}
						final Dist SX10_TEMP2 = RX10_TEMP28.dDist;

						final int RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP30,h);

						final int RX10_TEMP36 = 0;

						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if(RX10_TEMP37)
							{

							String RX10_TEMP35 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP35);

							}
						if(!globalPointerHashMap.containsKey(h) || !globalPointerHashMap.get(h).contains(result)){
						throw new RuntimeException("Object in wrong place");
						}
						final INTArray RX10_TEMP38 = result.contents;
						Program.INTSetValue(RX10_TEMP38, RX10_TEMP30, X10_TEMP21,h);
						}
					}
				}
			}
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(result)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist1 RX10_TEMP40 = result.distValue;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP40)){
		throw new RuntimeException("Object in wrong place");
		}
		final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP41)){
		throw new RuntimeException("Object in wrong place");
		}
		final Point1[] RX10_TEMP42 = RX10_TEMP41.pointArray;
		for(int RX10_TEMP39=0; RX10_TEMP39 < RX10_TEMP42.length; RX10_TEMP39++)
			{

			final Point1 p = RX10_TEMP42[RX10_TEMP39];
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0)){
			throw new RuntimeException("Object in wrong place");
			}
			final int X10_TEMP25 = X10_TEMP0.total;
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(result)){
			throw new RuntimeException("Object in wrong place");
			}
			final Dist1 RX10_TEMP43 = result.distValue;
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP43)){
			throw new RuntimeException("Object in wrong place");
			}
			final Region1 RX10_TEMP44 = RX10_TEMP43.dReg;

			final int RX10_TEMP45 = Program.searchPointInRegion1(RX10_TEMP44, p,myUniquePlacePoint);

			final int RX10_TEMP46 = 0;

			final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
			if(RX10_TEMP47)
				{

				String RX10_TEMP48 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP48);

				}
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(RX10_TEMP43)){
			throw new RuntimeException("Object in wrong place");
			}
			final Dist SX10_TEMP3 = RX10_TEMP43.dDist;

			final int RX10_TEMP49 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP45,myUniquePlacePoint);

			final int RX10_TEMP51 = 0;

			final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
			if(RX10_TEMP52)
				{

				String RX10_TEMP50 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP50);

				}
			if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(result)){
			throw new RuntimeException("Object in wrong place");
			}
			final INTArray RX10_TEMP53 = result.contents;

			final int X10_TEMP26 = Program.INTGetValue(RX10_TEMP53, RX10_TEMP45,myUniquePlacePoint);

			final int X10_TEMP27 = X10_TEMP25 + X10_TEMP26;
			X10_TEMP0.total = (X10_TEMP27);
			}
		}
public static int constantSearchRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)		{

		final int zero = 0;

		final int one = 1;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(r)){
		throw new RuntimeException("Object in wrong place");
		}
		final int dim0 = r.dim0;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(r)){
		throw new RuntimeException("Object in wrong place");
		}
		final int low0 = r.low0;

		final int high0 = low0 + dim0;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(target)){
		throw new RuntimeException("Object in wrong place");
		}
		int pt0 = target.f0;

		final boolean lbound0 = pt0 < low0;

		final boolean hbound0 = pt0 >= high0;

		final int dim1 = 1;

		boolean outRegion = false;

		outRegion = outRegion || lbound0;


		outRegion = outRegion || hbound0;

		if(outRegion)
			{

			int notFound = 0;

			notFound = notFound - one;

			return notFound;
			}

		final int stride1 = 1;

		final int stride0 = stride1 * dim1;

		pt0 = pt0 - low0;


		final int offset0 = stride0 * pt0;

		int found = 0;

		found = found + offset0;

		return found;
		}
public static int comparePoint1 ( final Point1 pt1, final Point1 pt2, int myUniquePlacePoint)		{

		final int zero = 0;

		final int one = 1;

		final int two = 2;

		int point1 = 0;

		int point2 = 0;

		boolean lt = false;

		boolean gt = false;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(pt1)){
		throw new RuntimeException("Object in wrong place");
		}
		point1 = pt1.f0;

		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(pt2)){
		throw new RuntimeException("Object in wrong place");
		}
		point2 = pt2.f0;


		lt = point1 < point2;


		gt = point1 > point2;

		if(lt)
			{
			return one;
			}
		if(gt)
			{
			return two;
			}
		return zero;
		}
public static int binarySearchRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)		{
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(r)){
		throw new RuntimeException("Object in wrong place");
		}
		final Point1[] pointArray = (Point1[])(r.pointArray);

		int start = 0;

		int end = r.pointArray.length;

		final int zero = 0;

		final int one = 1;

		final int two = 2;

		end = end - one;


		int result = zero - one;

		boolean notDone = start <= end;
		while(notDone)
			{

			int mid = start + end;

			mid = mid / two;


			final Point1 temp = pointArray[mid];

			final int pointCompare = Program.comparePoint1(target, temp,myUniquePlacePoint);

			final boolean eq = pointCompare == zero;

			final boolean lt = pointCompare == one;
			if(eq)
				{
				return mid;
				}
			else
				{
				if(lt)
					{

					end = mid - one;

					}
				else
					{

					start = mid + one;

					}
 				}
 
			notDone = start <= end;

			}
		return result;
		}
public static int searchPointInRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)		{
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(r)){
		throw new RuntimeException("Object in wrong place");
		}
		final boolean regType = r.regType;
		if(regType)
			{

			final int constantSearch = Program.constantSearchRegion1(r, target,myUniquePlacePoint);
			return constantSearch;
			}

		final int binarySearch = Program.binarySearchRegion1(r, target,myUniquePlacePoint);
		return binarySearch;
		}
public static Dist1 getBlockDist1 ( final Region1 r, int myUniquePlacePoint)		{

		final int R = r.pointArray.length;

		final int N = 4;

		final int q = R % N;

		final int p = R / N;

		final int one = 1;

		final int zero = 0;

		int blockSize = p + one;

		int arraySize = q * blockSize;

		int offset = 0;

		int initPlace = 0;

		Dist pointDist1 = Program.getCyclic(arraySize, initPlace, blockSize,myUniquePlacePoint);

		int remainingPlaces = N - q;

		final boolean cond = remainingPlaces == zero;
		if(cond)
			{

			final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
			return retDist;
			}

		offset = arraySize;


		blockSize = p;


		arraySize = remainingPlaces * blockSize;


		initPlace = 0;


		int chunk = blockSize;

		final boolean ifCond = blockSize > arraySize;
		if(ifCond)
			{

			chunk = arraySize;

			}

		int index = offset;

		int dSize = index + chunk;

		dSize = dSize - one;


		pointDist1 = new Dist(pointDist1, index, dSize, initPlace,myUniquePlacePoint);
if(globalPointerHashMap.containsKey(myUniquePlacePoint)){

globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());}
else{throw new RuntimeException("Object in wrong place");
 }

		index = index + chunk;


		arraySize = arraySize - chunk;


		int pl = 0;

		boolean whileCond = arraySize != zero;
		while(whileCond)
			{

			final boolean tailCond = chunk > arraySize;
			if(tailCond)
				{

				dSize = index + arraySize;


				dSize = dSize - one;


				pointDist1 = new Dist(pointDist1, index, dSize, pl,myUniquePlacePoint);
if(globalPointerHashMap.containsKey(myUniquePlacePoint)){

globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());}
else{throw new RuntimeException("Object in wrong place");
 }

				arraySize = 0;

				}
			else
				{

				dSize = index + chunk;


				dSize = dSize - one;


				pointDist1 = new Dist(pointDist1, index, dSize, pl,myUniquePlacePoint);
if(globalPointerHashMap.containsKey(myUniquePlacePoint)){

globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());}
else{throw new RuntimeException("Object in wrong place");
 }

				index = index + chunk;


				arraySize = arraySize - chunk;

				}
 
			pl = 0;


			whileCond = arraySize != zero;

			}

		final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
		return retDist;
		}
public static Dist1 getPlaceDist1 ( final Region1 r, final int p, int myUniquePlacePoint)		{

		final int rSize = r.pointArray.length;

		final Dist pointDist = Program.getCyclic(rSize, p, rSize,myUniquePlacePoint);

		final Dist1 retDist = new Dist1(r, pointDist,myUniquePlacePoint);
		return retDist;
		}
public static Dist getCyclic ( final int arraySize, final int initPlace, final int blockSize, int myUniquePlacePoint)		{

		final int zero = 0;

		final int one = 1;

		int N = arraySize;

		int chunk = blockSize;

		final boolean ifCond = blockSize > N;
		if(ifCond)
			{

			chunk = N;

			}

		int index = 0;

		int dSize = index + chunk;

		dSize = dSize - one;


		final int  pointReg = dSize+1;

		Dist pointDist = new Dist(pointReg, initPlace,myUniquePlacePoint);

		index = index + chunk;


		N = N - chunk;


		int p = 0;

		boolean whileCond = N != zero;
		while(whileCond)
			{

			final boolean tailCond = chunk > N;
			if(tailCond)
				{

				dSize = index + N;


				dSize = dSize - one;


				pointDist = new Dist(pointDist, index, dSize, p,myUniquePlacePoint);
if(globalPointerHashMap.containsKey(myUniquePlacePoint)){

globalPointerHashMap.get(myUniquePlacePoint).add(pointDist.hashCode());}
else{throw new RuntimeException("Object in wrong place");
 }

				N = 0;

				}
			else
				{

				dSize = index + chunk;


				dSize = dSize - one;


				pointDist = new Dist(pointDist, index, dSize, p,myUniquePlacePoint);
if(globalPointerHashMap.containsKey(myUniquePlacePoint)){

globalPointerHashMap.get(myUniquePlacePoint).add(pointDist.hashCode());}
else{throw new RuntimeException("Object in wrong place");
 }

				index = index + chunk;


				N = N - chunk;

				}
 
			p = 0;


			whileCond = N != zero;

			}
		return pointDist;
		}
public static Region1 createNewRegion1R ( final int v1_0, final int v1_1, int myUniquePlacePoint)		{

		final int zero = 0;

		final int one = 1;

		boolean regType = true;

		final boolean tempBool1 = true;

		regType = regType && tempBool1;


		final int l1 = v1_1 - v1_0;

		final int dim1 = l1 + one;

		final int stride1 = 1;

		final int stride0 = stride1 * dim1;

		final int rSize = stride0 - one;

		final int  regArr = rSize+1;

		final Point1[] ptArray = (Point1[])(new Point1/*value*/[regArr]);
/*arrayInitBlock*/
for(int p= 0;p <ptArray.length ;p++ )			{

			int f1 = p / stride1;

			f1 = f1 % dim1;


			f1 = f1 + v1_0;


			final Point1 retPoint = new Point1(f1,myUniquePlacePoint);
			ptArray[p] =retPoint;
			}

;
		if(regType)
			{

			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1,myUniquePlacePoint);
			return retRegRegular;
			}

		final Region1 retReg = new Region1(ptArray,myUniquePlacePoint);
		return retReg;
		}
public static int[] createDist ( final int  reg, final int pl, int myUniquePlacePoint)		{

		final int[] placeArray = (int[])(new int/*value*/[reg]);
/*arrayInitBlock*/
for(int p= 0;p <placeArray.length ;p++ )			{
			placeArray[p] =pl;
			}

;
		return placeArray;
		}
public static int[] extendDist ( final Dist d1, final int x, final int y, final int pl, int myUniquePlacePoint)		{

		final int one = 1;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(d1)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] d1Array = d1.placeArray;

		final int dis = y+1;

		final int[] temp = new int[dis];
		for(int p=0; p < d1Array.length; p++)
			{

			final int tempPlace = d1Array[p];
			temp[p] = tempPlace;
			}

		int tail = x;

		boolean bool = tail <= y;
		while(bool)
			{
			temp[tail] = pl;

			tail = tail + one;


			bool = tail <= y;

			}

		final int myReplacment = y+1;

		final int[] placeArray = (int[])(new int/*value*/[myReplacment]);
/*arrayInitBlock*/
for(int p= 0;p <placeArray.length ;p++ )			{

			final int tempPlace = temp[p];
			placeArray[p] =tempPlace;
			}

;
		return placeArray;
		}
public static int getPlaceFromDist ( final Dist d, final int index, int myUniquePlacePoint)		{
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(d)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] placeArray = d.placeArray;

		final int retPlace = placeArray[index];
		return retPlace;
		}
public static int[] getCounts ( final Dist d, int myUniquePlacePoint)		{

		final int one = 1;

		final int zero = 0;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int dis = ub+1;

		final int[] tempCounts = new int[dis];
		for(int p=0; p < tempCounts.length; p++)
			{
			tempCounts[p] = zero;
			}
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(d)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] placeArray = d.placeArray;
		for(int p=0; p < placeArray.length; p++)
			{

			final int pl = placeArray[p];

			final int index = 0;

			final int oldVal = tempCounts[index];

			final int oldValPlusOne = oldVal + one;
			tempCounts[index] = oldValPlusOne;
			}

		final int[] counts = (int[])(new int/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <counts.length ;p++ )			{

			final int tempInt = tempCounts[p];
			counts[p] =tempInt;
			}

;
		return counts;
		}
public static int[] getRunningSum ( final Dist d, int myUniquePlacePoint)		{

		final int one = 1;

		final int zero = 0;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int dis = ub+1;

		final int[] tempCounts = new int[dis];

		final int count = d.placeArray.length;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(d)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] placeArray = d.placeArray;

		final int  runReg = count+1;

		final int runDist = count+1;

		final int[] tempRunSum = new int[runDist];
		for(int p=0; p < tempCounts.length; p++)
			{
			tempCounts[p] = zero;
			}
		for(int p=0; p < placeArray.length; p++)
			{

			final int pl = placeArray[p];

			final int index = 0;

			final int temp = tempCounts[index];
			tempRunSum[p] = temp;

			final int tempPlusOne = temp + one;
			tempCounts[index] = tempPlusOne;
			}

		final int[] runSum = (int[])(new int/*value*/[runReg]);
/*arrayInitBlock*/
for(int p= 0;p <runSum.length ;p++ )			{

			final int tempInt = tempRunSum[p];
			runSum[p] =tempInt;
			}

;
		return runSum;
		}
public static int getLocalIndex ( final Dist myDist, final int index, int myUniquePlacePoint)		{
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(myDist)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] runningSum = myDist.runningSum;

		final int retVal = runningSum[index];
		return retVal;
		}
public static INTStub[] createINTArray ( final Dist distArray, int myUniquePlacePoint)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(distArray)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] counts = distArray.counts;

		final INTStub[] temp = (INTStub[])(new INTStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final INTStub is = Program.createINTStub(pl, count,myUniquePlacePoint);
			temp[p] =is;
			}

;
		return temp;
		}
public static INTStub createINTStub ( final int remotePlace, final int count, int myUniquePlacePoint)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final INTStub[] retStub = new INTStub[retDist];
					{
			//async(remotePlace)
				{

				final INTStub to = new INTStub(count,remotePlace);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final INTStub to = retStub[zero];
		return to;
		}
public static int[] allocateLocalINTArray ( final int count, int myUniquePlacePoint)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final int[] temp = new int[localDist];
		return temp;
		}
public static int INTGetValue ( final INTArray arr, final int index, int myUniquePlacePoint)		{

		final int pl = 0;

		final int placeIndex = 0;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(arr)){
		throw new RuntimeException("Object in wrong place");
		}
		final INTStub[] contents = arr.contents;

		final INTStub indexStub = contents[placeIndex];
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(indexStub)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] localArray = indexStub.localArray;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(arr)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index,myUniquePlacePoint);

		final int returnValue = localArray[localIndex];
		return returnValue;
		}
public static void INTSetValue ( final INTArray arr, final int index, final int val, int myUniquePlacePoint)		{

		final int pl = 0;

		final int placeIndex = 0;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(arr)){
		throw new RuntimeException("Object in wrong place");
		}
		final INTStub[] contents = arr.contents;

		final INTStub indexStub = contents[placeIndex];
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(indexStub)){
		throw new RuntimeException("Object in wrong place");
		}
		final int[] localArray = indexStub.localArray;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(arr)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index,myUniquePlacePoint);
		localArray[localIndex] = val;
		return;
		}

}
	/*value*/ class INTStub 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final int[] localArray;


	public INTStub ( final int count, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		localArray = Program.allocateLocalINTArray(count,myUniquePlacePoint);

		}


	}
	/*value*/ class INTArray 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final INTStub[] contents;
	public final Dist distArray;


	public INTArray ( final Dist distArray_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		distArray = distArray_;


		contents = Program.createINTArray(distArray,myUniquePlacePoint);

		}


	}
	/*value*/ class Dist 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final int[] placeArray;
	public final int[] counts;
	public final int[] runningSum;


	public Dist ( final int  reg, final int pl, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		placeArray = Program.createDist(reg, pl,myUniquePlacePoint);


		counts = Program.getCounts(this,myUniquePlacePoint);


		runningSum = (int[])(Program.getRunningSum(this,myUniquePlacePoint));

		}
	public Dist ( final Dist d1, final int x, final int y, final int pl, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		placeArray = Program.extendDist(d1, x, y, pl,myUniquePlacePoint);


		counts = Program.getCounts(this,myUniquePlacePoint);


		runningSum = (int[])(Program.getRunningSum(this,myUniquePlacePoint));

		}


	}
	class MR   {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public intRefArray1 a;
	public int total;


	public MR (  int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		final Dist1 X10_TEMP1 = Program._MR_d;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP1)){
		throw new RuntimeException("Object in wrong place");
		}
		final Region1 RX10_TEMP0 = X10_TEMP1.dReg;
		if(!globalPointerHashMap.containsKey(myUniquePlacePoint) || !globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP1)){
		throw new RuntimeException("Object in wrong place");
		}
		final Dist RX10_TEMP4 = X10_TEMP1.dDist;

		final INTArray RX10_TEMP5 = new INTArray(RX10_TEMP4,myUniquePlacePoint);

		final intRefArray1 RX10_TEMP6 = new intRefArray1(X10_TEMP1, RX10_TEMP5,myUniquePlacePoint);

		final intRefArray1 X10_TEMP4 = RX10_TEMP6;

		a = X10_TEMP4;


		final int X10_TEMP6 = 0;

		total = X10_TEMP6;

		}



}
	/*value*/ class Region1 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1[] pointArray;


	public Region1 ( final Point1[] pointArray_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		final int zero = 0;

		final int one = 1;

		final int minusOne = zero - one;

		regRank = 1;


		pointArray = pointArray_;


		regType = false;


		low0 = minusOne;


		dim0 = zero;

		}
	public Region1 ( final Point1[] pointArray_, final int low0_, final int dim0_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		regRank = 1;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;

		}


	}
	/*value*/ class Dist1 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		dReg = dReg_;


		dDist = dDist_;

		}


	}
	/*value*/ class Point1 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final int f0;


	public Point1 ( final int f0_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		f0 = f0_;

		}


	}
	/*value*/ class intRefArray1 
	 {
 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4); 
public  final static int myUniquePlacePoint = 0;
 public static final int maxPlaces = 4;
 static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}


	public final Dist1 distValue;
	public final INTArray contents;


	public intRefArray1 ( final Dist1 distValue_, final INTArray contents_, int myUniquePlacePoint )
		{

int maxPlaces =4;
for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}

		distValue = distValue_;


		contents = contents_;

		}


	}
