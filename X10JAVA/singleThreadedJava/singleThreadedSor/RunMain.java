import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;


public class RunMain {
 
	
public static void main(String[] args) {
		Program.runMain(0);
	}
}
class Program   {	
 public static final int myUniquePlacePoint = 0;
public static final int MAX_PLACES = 1;

 
public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(4);
 static {for(int i =0; i <Program.MAX_PLACES; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}

public static final Dist1 UniqueDistribution = Program.getUniqueDist(myUniquePlacePoint);

 
public static final long _Random_multiplier = Program._Random_multiplier_init(myUniquePlacePoint);
public static final long _Random_addend = Program._Random_addend_init(myUniquePlacePoint);
public static final long _Random_mask = Program._Random_mask_init(myUniquePlacePoint);
public static final int _SOR_JACOBI_NUM_ITER = Program._SOR_JACOBI_NUM_ITER_init(myUniquePlacePoint);
public static final long _SOR_RANDOM_SEED = Program._SOR_RANDOM_SEED_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES; }else{ x = x-1; } return x;}
public static long _Random_multiplier_init (  int myUniquePlacePoint)
		{

		final long X10_TEMP2 = 0x5DEECE66DL;

		return X10_TEMP2;
		}
public static long _Random_addend_init (  int myUniquePlacePoint)
		{

		final long X10_TEMP2 = 0xBL;

		return X10_TEMP2;
		}
public static long _Random_mask_init (  int myUniquePlacePoint)
		{

		final long X10_TEMP1 = 1L;


		final int X10_TEMP2 = 48;


		final long X10_TEMP4 = X10_TEMP1 << X10_TEMP2;


		final int X10_TEMP5 = 1;


		final long X10_TEMP7 = X10_TEMP4 - X10_TEMP5;

		return X10_TEMP7;
		}
public static int Random_nextbits ( final Random X10_TEMP0, final int bits, int myUniquePlacePoint)
		{

		long oldseed = X10_TEMP0.seed;


		final long X10_TEMP2 = oldseed * _Random_multiplier;


		final long X10_TEMP4 = X10_TEMP2 + _Random_addend;


		long nextseed = X10_TEMP4 & _Random_mask;


		final long X10_TEMP8 = nextseed;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.seed = (X10_TEMP8);

		final int X10_TEMP9 = 48;


		final int X10_TEMP11 = X10_TEMP9 - bits;


		final long X10_TEMP13 = nextseed >>> X10_TEMP11;


		final int X10_TEMP15 = (int)X10_TEMP13;

		return X10_TEMP15;
		}
public static int Random_nextInt ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 32;


		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);

		return X10_TEMP4;
		}
public static long Random_nextLong ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 32;


		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);


		final long X10_TEMP5 = (long)X10_TEMP4;


		final int X10_TEMP6 = 32;


		final long X10_TEMP8 = X10_TEMP5 << X10_TEMP6;


		final int X10_TEMP10 = 32;


		final int X10_TEMP11 = Program.Random_nextbits(X10_TEMP0, X10_TEMP10,myUniquePlacePoint);


		final long X10_TEMP13 = X10_TEMP8 + X10_TEMP11;

		return X10_TEMP13;
		}
public static boolean Random_nextBoolean ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 1;


		final int X10_TEMP3 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);


		final int X10_TEMP4 = 0;


		final boolean X10_TEMP6 = X10_TEMP3 != X10_TEMP4;

		return X10_TEMP6;
		}
public static double Random_nextDouble ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 26;


		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);


		final long X10_TEMP5 = (long)X10_TEMP4;


		final int X10_TEMP6 = 27;


		final long X10_TEMP8 = X10_TEMP5 << X10_TEMP6;


		final int X10_TEMP10 = 27;


		final int X10_TEMP11 = Program.Random_nextbits(X10_TEMP0, X10_TEMP10,myUniquePlacePoint);


		final long X10_TEMP13 = X10_TEMP8 + X10_TEMP11;


		final long X10_TEMP14 = 1L;


		final int X10_TEMP15 = 53;


		final long X10_TEMP17 = X10_TEMP14 << X10_TEMP15;


		final double X10_TEMP18 = (double)X10_TEMP17;


		final double X10_TEMP20 = X10_TEMP13 / X10_TEMP18;

		return X10_TEMP20;
		}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);

		final SOR X10_TEMP4 = new SOR(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());

		Program.SOR_run(X10_TEMP4,myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP7 = "Wall-clock time for sor: ";


		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " secs";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		System.out.println(X10_TEMP12);
		}
public static int _SOR_JACOBI_NUM_ITER_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 100;

		return X10_TEMP2;
		}
public static long _SOR_RANDOM_SEED_init (  int myUniquePlacePoint)
		{

		final long X10_TEMP2 = 10101010;

		return X10_TEMP2;
		}
public static void SOR_run ( final SOR X10_TEMP0, int myUniquePlacePoint)
		{

		final double X10_TEMP2 = Program.SOR_kernel(X10_TEMP0,myUniquePlacePoint);

		Program.SOR_validate(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);
		}
public static double SOR_kernel ( final SOR X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP4 = 10;


		final int X10_TEMP5 = 10;


		final Random X10_TEMP6 = X10_TEMP0.R;


		doubleRefArray2 G = Program.SOR_RandomMatrix(X10_TEMP0, X10_TEMP4, X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final double X10_TEMP11 = 1.25;


		final double X10_TEMP13 = Program.SOR_SORrun(X10_TEMP0, X10_TEMP11, G, _SOR_JACOBI_NUM_ITER,myUniquePlacePoint);

		return X10_TEMP13;
		}
public static doubleRefArray2 SOR_RandomMatrix ( final SOR X10_TEMP0, final int M, final int N, final Random R, int myUniquePlacePoint)
		{

		final int X10_TEMP4 = 0;


		final int X10_TEMP2 = 1;


		final int X10_TEMP5 = M - X10_TEMP2;


		final Region1 X10_TEMP13 = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5,myUniquePlacePoint);


		final int X10_TEMP10 = 0;


		final int X10_TEMP8 = 1;


		final int X10_TEMP11 = N - X10_TEMP8;


		final Region1 X10_TEMP14 = Program.createNewRegion1R(X10_TEMP10, X10_TEMP11,myUniquePlacePoint);


		final Dist2 d = Program.SOR_blockStar(X10_TEMP0, X10_TEMP13, X10_TEMP14,myUniquePlacePoint);


		final Region2 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount2(d, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final double[] RX10_TEMP14 = new double[RX10_TEMP13];


					final doubleStub RX10_TEMP15 = new doubleStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP16 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final doubleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final doubleRefArray2 RX10_TEMP19 = new doubleRefArray2(d, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final doubleRefArray2 t = RX10_TEMP19;


		final Dist2 RX10_TEMP20 = t.distValue;


		final Region2 RX10_TEMP21 = RX10_TEMP20.dReg;


		final Region2 X10_TEMP18 = RX10_TEMP21;


		final int RX10_TEMP25 = 1;


		int RX10_TEMP23 = X10_TEMP18.regSize;


		RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25;


		final int  RX10_TEMP24 = RX10_TEMP23+1;

		for(int RX10_TEMP22=0; RX10_TEMP22 < RX10_TEMP24; RX10_TEMP22++)
			{

			final int RX10_TEMP26 = RX10_TEMP22;


			final Point2 p = Program.regionOrdinalPoint2(X10_TEMP18, RX10_TEMP26,myUniquePlacePoint);


			final double X10_TEMP21 = Program.Random_nextDouble(R,myUniquePlacePoint);


			final double X10_TEMP22 = 1e-6;


			final double X10_TEMP24 = X10_TEMP21 * X10_TEMP22;

			Program.SOR_write(X10_TEMP0, t, p, X10_TEMP24,myUniquePlacePoint);
			}
		return t;
		}
public static void SOR_write ( final SOR X10_TEMP0, final doubleRefArray2 t, final Point2 p, final double v, int myUniquePlacePoint)
		{
		/*FINISH
*/			{

			final Dist2 RX10_TEMP0 = t.distValue;


			final Dist2 X10_TEMP1 = RX10_TEMP0;


			final Region2 RX10_TEMP1 = X10_TEMP1.dReg;


			final int RX10_TEMP2 = Program.searchPointInRegion2(RX10_TEMP1, p,myUniquePlacePoint);


			final int RX10_TEMP3 = 0;


			final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3;

			if(RX10_TEMP4)
				{

				final String RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1.";

				throw new RuntimeException(RX10_TEMP5);

				}

			final int RX10_TEMP6 = Program.getPlaceFromDist2(X10_TEMP1, RX10_TEMP2,myUniquePlacePoint);


			final int X10_TEMP4 = RX10_TEMP6;

			//async(X10_TEMP4)
				{

				final double X10_TEMP8 = v;


				final Dist2 RX10_TEMP7 = t.distValue;


				final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;


				final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, p,X10_TEMP4);


				final int RX10_TEMP10 = 0;


				final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10;

				if(RX10_TEMP11)
					{

					String RX10_TEMP12 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP12);

					}

				final int RX10_TEMP13 = Program.getPlaceFromDist2(RX10_TEMP7, RX10_TEMP9,X10_TEMP4);


				final int RX10_TEMP15 = 0;


				final boolean RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15;

				if(RX10_TEMP16)
					{

					String RX10_TEMP14 = "Bad place access for array t";

					throw new RuntimeException(RX10_TEMP14);

					}
				Program.setRefArrayValue2double(t, RX10_TEMP9, X10_TEMP8,X10_TEMP4);
				}
			}
		}
public static Dist2 SOR_blockStar ( final SOR X10_TEMP0, final Region1 r1, final Region1 r2, int myUniquePlacePoint)
		{

		final Dist1 X10_TEMP2 = Program.getBlockDist1(r1,myUniquePlacePoint);


		final Dist1 d1 = X10_TEMP2;


		final Dist2 X10_TEMP7 = Program.SOR_distTimesRegion(X10_TEMP0, d1, r2,myUniquePlacePoint);

		return X10_TEMP7;
		}
public static Dist2 SOR_distTimesRegion ( final SOR X10_TEMP0, final Dist1 d, final Region1 r, int myUniquePlacePoint)
		{

		final int X10_TEMP1 = 0;


		final int X10_TEMP2 = 1;


		final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2;


		final Region2 X10_TEMP4 = Program.createNewRegion2RR(X10_TEMP1, X10_TEMP3, X10_TEMP1, X10_TEMP3,myUniquePlacePoint);


		final Region2 X10_TEMP6 = X10_TEMP4;


		final int X10_TEMP7 = 0;


		Dist2 d0 = Program.getPlaceDist2(X10_TEMP6, X10_TEMP7,myUniquePlacePoint);


		final Dist1 X10_TEMP10 = Program.UniqueDistribution;


		final Region1 RX10_TEMP1 = X10_TEMP10.dReg;


		final int RX10_TEMP4 = 1;


		int RX10_TEMP2 = RX10_TEMP1.regSize;


		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;


		final int  RX10_TEMP3 = RX10_TEMP2+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3; RX10_TEMP0++)
			{

			final int RX10_TEMP5 = RX10_TEMP0;


			final Point1 pl = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5,myUniquePlacePoint);


			final Dist1 X10_TEMP11 = Program.UniqueDistribution;


			final Region1 RX10_TEMP6 = X10_TEMP11.dReg;


			final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, pl,myUniquePlacePoint);


			final int RX10_TEMP8 = 0;


			final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

			if(RX10_TEMP9)
				{

				final String RX10_TEMP10 = "Point pl not found in the distribution X10_TEMP11.";

				throw new RuntimeException(RX10_TEMP10);

				}

			final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP11, RX10_TEMP7,myUniquePlacePoint);


			int p = RX10_TEMP11;


			final Dist1 X10_TEMP15 = Program.restrictDist1(d, p,myUniquePlacePoint);


			final Region1 RX10_TEMP12 = X10_TEMP15.dReg;


			final Region1 X10_TEMP16 = RX10_TEMP12;


			final Region2 X10_TEMP19 = Program.createNewRegion2AA(X10_TEMP16, r,myUniquePlacePoint);


			final Dist2 X10_TEMP21 = Program.getPlaceDist2(X10_TEMP19, p,myUniquePlacePoint);


			final Dist2 X10_TEMP23 = Program.unionDist2(d0, X10_TEMP21,myUniquePlacePoint);


			d0 = X10_TEMP23;

			}
		return d0;
		}
public static void SOR_validate ( final SOR X10_TEMP0, final double gtotal, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = 4.5185971433257635E-5;


		final double X10_TEMP3 = gtotal - X10_TEMP1;


		double dev = Math.abs(X10_TEMP3);


		final double X10_TEMP5 = 1.0e-12;


		final boolean X10_TEMP7 = dev > X10_TEMP5;

		if(X10_TEMP7)
			{

			final String X10_TEMP9 = "Validation failed";

			System.out.println(X10_TEMP9);

			final String X10_TEMP10 = "gtotal = ";


			final String X10_TEMP11 = X10_TEMP10 + gtotal;


			final String X10_TEMP12 = "  ";


			final String X10_TEMP13 = X10_TEMP11 + X10_TEMP12;


			final String X10_TEMP15 = X10_TEMP13 + dev;

			System.out.println(X10_TEMP15);

			final String X10_TEMP17 = "Validation failed";

			throw new RuntimeException(X10_TEMP17);

			}
		}
public static double SOR_read ( final SOR X10_TEMP0, final doubleRefArray2 G, final Point2 pt, int myUniquePlacePoint)
		{

		final int X10_TEMP3 = 0;


		final int X10_TEMP4 = 0;


		final Region1 r = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);


		final int X10_TEMP6 = 0;


		final Dist1 d = Program.getPlaceDist1(r, X10_TEMP6,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(d, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final double[] RX10_TEMP14 = new double[RX10_TEMP13];


					final doubleStub RX10_TEMP15 = new doubleStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP16 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final doubleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1(d, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final doubleRefArray1 result = RX10_TEMP19;


		final int phere = 0;

		/*FINISH
*/			{

			final Dist2 RX10_TEMP20 = G.distValue;


			final Dist2 X10_TEMP10 = RX10_TEMP20;


			final Region2 RX10_TEMP21 = X10_TEMP10.dReg;


			final int RX10_TEMP22 = Program.searchPointInRegion2(RX10_TEMP21, pt,myUniquePlacePoint);


			final int RX10_TEMP23 = 0;


			final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23;

			if(RX10_TEMP24)
				{

				final String RX10_TEMP25 = "Point pt not found in the distribution X10_TEMP10.";

				throw new RuntimeException(RX10_TEMP25);

				}

			final int RX10_TEMP26 = Program.getPlaceFromDist2(X10_TEMP10, RX10_TEMP22,myUniquePlacePoint);


			final int X10_TEMP13 = RX10_TEMP26;

			//async(X10_TEMP13)
				{

				final Dist2 RX10_TEMP27 = G.distValue;


				final Region2 RX10_TEMP28 = RX10_TEMP27.dReg;


				final int RX10_TEMP29 = Program.searchPointInRegion2(RX10_TEMP28, pt,X10_TEMP13);


				final int RX10_TEMP30 = 0;


				final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;

				if(RX10_TEMP31)
					{

					String RX10_TEMP32 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP32);

					}

				final int RX10_TEMP33 = Program.getPlaceFromDist2(RX10_TEMP27, RX10_TEMP29,X10_TEMP13);


				final int RX10_TEMP35 = 0;


				final boolean RX10_TEMP36 = RX10_TEMP33 != RX10_TEMP35;

				if(RX10_TEMP36)
					{

					String RX10_TEMP34 = "Bad place access for array G";

					throw new RuntimeException(RX10_TEMP34);

					}

				final double RX10_TEMP37 = Program.getRefArrayValue2double(G, RX10_TEMP29,X10_TEMP13);


				final double val = RX10_TEMP37;

				//async(phere)
					{

					final int X10_TEMP18 = 0;


					final double X10_TEMP21 = val;


					final Point1 RX10_TEMP38 = new Point1(X10_TEMP18,phere);
					
Program.globalPointerHashMap.get(phere).add(RX10_TEMP38.hashCode());


					final Dist1 RX10_TEMP39 = result.distValue;


					final Region1 RX10_TEMP40 = RX10_TEMP39.dReg;


					final int RX10_TEMP41 = Program.searchPointInRegion1(RX10_TEMP40, RX10_TEMP38,phere);


					final int RX10_TEMP42 = 0;


					final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;

					if(RX10_TEMP43)
						{

						String RX10_TEMP44 = "Array index out of bounds";

						throw new RuntimeException(RX10_TEMP44);

						}

					final int RX10_TEMP45 = Program.getPlaceFromDist1(RX10_TEMP39, RX10_TEMP41,phere);


					final int RX10_TEMP47 = 0;


					final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;

					if(RX10_TEMP48)
						{

						String RX10_TEMP46 = "Bad place access for array result";

						throw new RuntimeException(RX10_TEMP46);

						}
					Program.setRefArrayValue1double(result, RX10_TEMP41, X10_TEMP21,phere);
					}
				}
			}

		final int X10_TEMP23 = 0;


		final Point1 RX10_TEMP49 = new Point1(X10_TEMP23,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP49.hashCode());


		final Dist1 RX10_TEMP50 = result.distValue;


		final Region1 RX10_TEMP51 = RX10_TEMP50.dReg;


		final int RX10_TEMP52 = Program.searchPointInRegion1(RX10_TEMP51, RX10_TEMP49,myUniquePlacePoint);


		final int RX10_TEMP53 = 0;


		final boolean RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53;

		if(RX10_TEMP54)
			{

			String RX10_TEMP55 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP55);

			}

		final int RX10_TEMP56 = Program.getPlaceFromDist1(RX10_TEMP50, RX10_TEMP52,myUniquePlacePoint);


		final int RX10_TEMP58 = 0;


		final boolean RX10_TEMP59 = RX10_TEMP56 != RX10_TEMP58;

		if(RX10_TEMP59)
			{

			String RX10_TEMP57 = "Bad place access for array result";

			throw new RuntimeException(RX10_TEMP57);

			}

		final double RX10_TEMP60 = Program.getRefArrayValue1double(result, RX10_TEMP52,myUniquePlacePoint);


		final double X10_TEMP25 = RX10_TEMP60;

		return X10_TEMP25;
		}
public static double SOR_SORrun ( final SOR X10_TEMP0, final double omega, final doubleRefArray2 G, final int num_iterations, int myUniquePlacePoint)
		{

		final Dist2 RX10_TEMP0 = G.distValue;


		final Dist2 X10_TEMP1 = RX10_TEMP0;


		final Region2 RX10_TEMP1 = X10_TEMP1.dReg;


		final Region2 X10_TEMP2 = RX10_TEMP1;


		final int X10_TEMP4 = 0;


		final int X10_TEMP6 = 2;


		final boolean X10_TEMP5 = X10_TEMP4 >= X10_TEMP6;

		if(X10_TEMP5)
			{

			final String X10_TEMP7 = "Invalid dimension for rank projection. Got ";


			final String X10_TEMP8 = ", expected 2";


			String X10_TEMP9 = X10_TEMP7 + X10_TEMP4;


			X10_TEMP9 = X10_TEMP9 + X10_TEMP8;

			throw new RuntimeException(X10_TEMP9);

			}

		final int X10_TEMP10 = 0;


		final int X10_TEMP11 = 1;


		final int X10_TEMP13 = X10_TEMP10 - X10_TEMP11;


		Region1 X10_TEMP12 = Program.createNewRegion1R(X10_TEMP10, X10_TEMP13,myUniquePlacePoint);


		final int X10_TEMP14 = 0;


		final boolean X10_TEMP16 = X10_TEMP4 == X10_TEMP14;


		final int X10_TEMP15 = 1;


		final boolean X10_TEMP17 = X10_TEMP4 == X10_TEMP15;


		final int RX10_TEMP6 = 1;


		int RX10_TEMP4 = X10_TEMP2.regSize;


		RX10_TEMP4 = RX10_TEMP4 - RX10_TEMP6;


		final int  RX10_TEMP5 = RX10_TEMP4+1;

		for(int RX10_TEMP2=0; RX10_TEMP2 < RX10_TEMP5; RX10_TEMP2++)
			{

			final int RX10_TEMP7 = RX10_TEMP2;


			final Point2 RX10_TEMP3 = Program.regionOrdinalPoint2(X10_TEMP2, RX10_TEMP7,myUniquePlacePoint);


			final int X10_TEMP18 = RX10_TEMP3.f0;


			final int X10_TEMP19 = RX10_TEMP3.f1;

			if(X10_TEMP16)
				{

				final Region1 X10_TEMP20 = Program.createNewRegion1R(X10_TEMP18, X10_TEMP18,myUniquePlacePoint);


				X10_TEMP12 = Program.unionRegion1(X10_TEMP12, X10_TEMP20,myUniquePlacePoint);

				}
			else
				{
				if(X10_TEMP17)
					{

					final Region1 X10_TEMP20 = Program.createNewRegion1R(X10_TEMP19, X10_TEMP19,myUniquePlacePoint);


					X10_TEMP12 = Program.unionRegion1(X10_TEMP12, X10_TEMP20,myUniquePlacePoint);

					}
				}
 			}

		final Region1 X10_TEMP21 = X10_TEMP12;


		final int M = X10_TEMP21.regSize;


		final Dist2 RX10_TEMP8 = G.distValue;


		final Dist2 X10_TEMP23 = RX10_TEMP8;


		final Region2 RX10_TEMP9 = X10_TEMP23.dReg;


		final Region2 X10_TEMP24 = RX10_TEMP9;


		final int X10_TEMP26 = 1;


		final int X10_TEMP28 = 2;


		final boolean X10_TEMP27 = X10_TEMP26 >= X10_TEMP28;

		if(X10_TEMP27)
			{

			final String X10_TEMP29 = "Invalid dimension for rank projection. Got ";


			final String X10_TEMP30 = ", expected 2";


			String X10_TEMP31 = X10_TEMP29 + X10_TEMP26;


			X10_TEMP31 = X10_TEMP31 + X10_TEMP30;

			throw new RuntimeException(X10_TEMP31);

			}

		final int X10_TEMP32 = 0;


		final int X10_TEMP33 = 1;


		final int X10_TEMP35 = X10_TEMP32 - X10_TEMP33;


		Region1 X10_TEMP34 = Program.createNewRegion1R(X10_TEMP32, X10_TEMP35,myUniquePlacePoint);


		final int X10_TEMP36 = 0;


		final boolean X10_TEMP38 = X10_TEMP26 == X10_TEMP36;


		final int X10_TEMP37 = 1;


		final boolean X10_TEMP39 = X10_TEMP26 == X10_TEMP37;


		final int RX10_TEMP14 = 1;


		int RX10_TEMP12 = X10_TEMP24.regSize;


		RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14;


		final int  RX10_TEMP13 = RX10_TEMP12+1;

		for(int RX10_TEMP10=0; RX10_TEMP10 < RX10_TEMP13; RX10_TEMP10++)
			{

			final int RX10_TEMP15 = RX10_TEMP10;


			final Point2 RX10_TEMP11 = Program.regionOrdinalPoint2(X10_TEMP24, RX10_TEMP15,myUniquePlacePoint);


			final int X10_TEMP40 = RX10_TEMP11.f0;


			final int X10_TEMP41 = RX10_TEMP11.f1;

			if(X10_TEMP38)
				{

				final Region1 X10_TEMP42 = Program.createNewRegion1R(X10_TEMP40, X10_TEMP40,myUniquePlacePoint);


				X10_TEMP34 = Program.unionRegion1(X10_TEMP34, X10_TEMP42,myUniquePlacePoint);

				}
			else
				{
				if(X10_TEMP39)
					{

					final Region1 X10_TEMP42 = Program.createNewRegion1R(X10_TEMP41, X10_TEMP41,myUniquePlacePoint);


					X10_TEMP34 = Program.unionRegion1(X10_TEMP34, X10_TEMP42,myUniquePlacePoint);

					}
				}
 			}

		final Region1 X10_TEMP43 = X10_TEMP34;


		final int N = X10_TEMP43.regSize;


		final double X10_TEMP45 = 0.25;


		final double omega_over_four = omega * X10_TEMP45;


		final double X10_TEMP47 = 1.0;


		final double one_minus_omega = X10_TEMP47 - omega;


		final int X10_TEMP49 = 1;


		final int Mm1 = M - X10_TEMP49;


		final int X10_TEMP51 = 1;


		final int Nm1 = N - X10_TEMP51;


		final int X10_TEMP56 = 0;


		final int X10_TEMP54 = 1;


		final int X10_TEMP57 = num_iterations - X10_TEMP54;


		final int X10_TEMP60 = 0;


		final int X10_TEMP61 = 1;


		final Region2 X10_TEMP63 = Program.createNewRegion2RR(X10_TEMP56, X10_TEMP57, X10_TEMP60, X10_TEMP61,myUniquePlacePoint);


		final int RX10_TEMP19 = 1;


		int RX10_TEMP17 = X10_TEMP63.regSize;


		RX10_TEMP17 = RX10_TEMP17 - RX10_TEMP19;


		final int  RX10_TEMP18 = RX10_TEMP17+1;

		for(int RX10_TEMP16=0; RX10_TEMP16 < RX10_TEMP18; RX10_TEMP16++)
			{

			final int RX10_TEMP20 = RX10_TEMP16;


			final Point2 po = Program.regionOrdinalPoint2(X10_TEMP63, RX10_TEMP20,myUniquePlacePoint);

			/*FINISH
*/				{

				final int X10_TEMP79 = 0;


				final int X10_TEMP65 = 1;


				final int X10_TEMP67 = Mm1 - X10_TEMP65;


				final int X10_TEMP69 = 1;


				final int X10_TEMP70 = po.f1;


				final int X10_TEMP72 = X10_TEMP69 + X10_TEMP70;


				final int X10_TEMP74 = X10_TEMP67 - X10_TEMP72;


				final int X10_TEMP75 = 2;


				final int X10_TEMP77 = X10_TEMP74 / X10_TEMP75;


				final int X10_TEMP83 = 1;


				final int X10_TEMP81 = 1;


				final int X10_TEMP84 = Nm1 - X10_TEMP81;


				final Region2 X10_TEMP86 = Program.createNewRegion2RR(X10_TEMP79, X10_TEMP77, X10_TEMP83, X10_TEMP84,myUniquePlacePoint);


				final int X10_TEMP87 = 0;


				final int RX10_TEMP24 = 1;


				int RX10_TEMP22 = X10_TEMP86.regSize;


				RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24;


				final int  RX10_TEMP23 = RX10_TEMP22+1;

				for(int RX10_TEMP21=0; RX10_TEMP21 < RX10_TEMP23; RX10_TEMP21++)
					{

					final int RX10_TEMP25 = RX10_TEMP21;


					final Point2 pt = Program.regionOrdinalPoint2(X10_TEMP86, RX10_TEMP25,myUniquePlacePoint);

					//async(X10_TEMP87)
						{

						int X10_TEMP90 = 2;


						int X10_TEMP91 = 1;


						int RX10_TEMP26 = pt.f0;


						int RX10_TEMP27 = pt.f1;


						RX10_TEMP26 = RX10_TEMP26 * X10_TEMP90;


						RX10_TEMP27 = RX10_TEMP27 * X10_TEMP91;


						final Point2 X10_TEMP97 = new Point2(RX10_TEMP26, RX10_TEMP27,X10_TEMP87);
						
Program.globalPointerHashMap.get(X10_TEMP87).add(X10_TEMP97.hashCode());


						final int X10_TEMP93 = 1;


						final int X10_TEMP94 = po.f1;


						int X10_TEMP98 = X10_TEMP93 + X10_TEMP94;


						int X10_TEMP99 = 0;


						int RX10_TEMP28 = X10_TEMP97.f0;


						int RX10_TEMP29 = X10_TEMP97.f1;


						RX10_TEMP28 = RX10_TEMP28 + X10_TEMP98;


						RX10_TEMP29 = RX10_TEMP29 + X10_TEMP99;


						final Point2 ij = new Point2(RX10_TEMP28, RX10_TEMP29,X10_TEMP87);
						
Program.globalPointerHashMap.get(X10_TEMP87).add(ij.hashCode());

						/*FINISH
*/							{

							final Dist2 RX10_TEMP30 = G.distValue;


							final Dist2 X10_TEMP101 = RX10_TEMP30;


							final Region2 RX10_TEMP31 = X10_TEMP101.dReg;


							final int RX10_TEMP32 = Program.searchPointInRegion2(RX10_TEMP31, ij,X10_TEMP87);


							final int RX10_TEMP33 = 0;


							final boolean RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33;

							if(RX10_TEMP34)
								{

								final String RX10_TEMP35 = "Point ij not found in the distribution X10_TEMP101.";

								throw new RuntimeException(RX10_TEMP35);

								}

							final int RX10_TEMP36 = Program.getPlaceFromDist2(X10_TEMP101, RX10_TEMP32,X10_TEMP87);


							final int X10_TEMP104 = RX10_TEMP36;

							//async(X10_TEMP104)
								{

								final int X10_TEMP107 = 1;


								final int X10_TEMP108 = 0;


								int X10_TEMP111 = X10_TEMP108 - X10_TEMP107;


								int X10_TEMP112 = 0;


								int RX10_TEMP37 = ij.f0;


								int RX10_TEMP38 = ij.f1;


								RX10_TEMP37 = RX10_TEMP37 + X10_TEMP111;


								RX10_TEMP38 = RX10_TEMP38 + X10_TEMP112;


								final Point2 X10_TEMP114 = new Point2(RX10_TEMP37, RX10_TEMP38,X10_TEMP104);
								
Program.globalPointerHashMap.get(X10_TEMP104).add(X10_TEMP114.hashCode());


								final double X10_TEMP122 = Program.SOR_read(X10_TEMP0, G, X10_TEMP114,X10_TEMP104);


								int X10_TEMP118 = 1;


								int X10_TEMP119 = 0;


								int RX10_TEMP39 = ij.f0;


								int RX10_TEMP40 = ij.f1;


								RX10_TEMP39 = RX10_TEMP39 + X10_TEMP118;


								RX10_TEMP40 = RX10_TEMP40 + X10_TEMP119;


								final Point2 X10_TEMP121 = new Point2(RX10_TEMP39, RX10_TEMP40,X10_TEMP104);
								
Program.globalPointerHashMap.get(X10_TEMP104).add(X10_TEMP121.hashCode());


								final double X10_TEMP123 = Program.SOR_read(X10_TEMP0, G, X10_TEMP121,X10_TEMP104);


								final double X10_TEMP132 = X10_TEMP122 + X10_TEMP123;


								int X10_TEMP128 = 0;


								final int X10_TEMP125 = 1;


								final int X10_TEMP126 = 0;


								int X10_TEMP129 = X10_TEMP126 - X10_TEMP125;


								int RX10_TEMP41 = ij.f0;


								int RX10_TEMP42 = ij.f1;


								RX10_TEMP41 = RX10_TEMP41 + X10_TEMP128;


								RX10_TEMP42 = RX10_TEMP42 + X10_TEMP129;


								final Point2 X10_TEMP131 = new Point2(RX10_TEMP41, RX10_TEMP42,X10_TEMP104);
								
Program.globalPointerHashMap.get(X10_TEMP104).add(X10_TEMP131.hashCode());


								final Dist2 RX10_TEMP43 = G.distValue;


								final Region2 RX10_TEMP44 = RX10_TEMP43.dReg;


								final int RX10_TEMP45 = Program.searchPointInRegion2(RX10_TEMP44, X10_TEMP131,X10_TEMP104);


								final int RX10_TEMP46 = 0;


								final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;

								if(RX10_TEMP47)
									{

									String RX10_TEMP48 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP48);

									}

								final int RX10_TEMP49 = Program.getPlaceFromDist2(RX10_TEMP43, RX10_TEMP45,X10_TEMP104);


								final int RX10_TEMP51 = 0;


								final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;

								if(RX10_TEMP52)
									{

									String RX10_TEMP50 = "Bad place access for array G";

									throw new RuntimeException(RX10_TEMP50);

									}

								final double RX10_TEMP53 = Program.getRefArrayValue2double(G, RX10_TEMP45,X10_TEMP104);


								final double X10_TEMP133 = RX10_TEMP53;


								final double X10_TEMP140 = X10_TEMP132 + X10_TEMP133;


								int X10_TEMP136 = 0;


								int X10_TEMP137 = 1;


								int RX10_TEMP54 = ij.f0;


								int RX10_TEMP55 = ij.f1;


								RX10_TEMP54 = RX10_TEMP54 + X10_TEMP136;


								RX10_TEMP55 = RX10_TEMP55 + X10_TEMP137;


								final Point2 X10_TEMP139 = new Point2(RX10_TEMP54, RX10_TEMP55,X10_TEMP104);
								
Program.globalPointerHashMap.get(X10_TEMP104).add(X10_TEMP139.hashCode());


								final Dist2 RX10_TEMP56 = G.distValue;


								final Region2 RX10_TEMP57 = RX10_TEMP56.dReg;


								final int RX10_TEMP58 = Program.searchPointInRegion2(RX10_TEMP57, X10_TEMP139,X10_TEMP104);


								final int RX10_TEMP59 = 0;


								final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;

								if(RX10_TEMP60)
									{

									String RX10_TEMP61 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP61);

									}

								final int RX10_TEMP62 = Program.getPlaceFromDist2(RX10_TEMP56, RX10_TEMP58,X10_TEMP104);


								final int RX10_TEMP64 = 0;


								final boolean RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64;

								if(RX10_TEMP65)
									{

									String RX10_TEMP63 = "Bad place access for array G";

									throw new RuntimeException(RX10_TEMP63);

									}

								final double RX10_TEMP66 = Program.getRefArrayValue2double(G, RX10_TEMP58,X10_TEMP104);


								final double X10_TEMP141 = RX10_TEMP66;


								final double X10_TEMP143 = X10_TEMP140 + X10_TEMP141;


								final double X10_TEMP146 = omega_over_four * X10_TEMP143;


								final Dist2 RX10_TEMP67 = G.distValue;


								final Region2 RX10_TEMP68 = RX10_TEMP67.dReg;


								final int RX10_TEMP69 = Program.searchPointInRegion2(RX10_TEMP68, ij,X10_TEMP104);


								final int RX10_TEMP70 = 0;


								final boolean RX10_TEMP71 = RX10_TEMP69 < RX10_TEMP70;

								if(RX10_TEMP71)
									{

									String RX10_TEMP72 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP72);

									}

								final int RX10_TEMP73 = Program.getPlaceFromDist2(RX10_TEMP67, RX10_TEMP69,X10_TEMP104);


								final int RX10_TEMP75 = 0;


								final boolean RX10_TEMP76 = RX10_TEMP73 != RX10_TEMP75;

								if(RX10_TEMP76)
									{

									String RX10_TEMP74 = "Bad place access for array G";

									throw new RuntimeException(RX10_TEMP74);

									}

								final double RX10_TEMP77 = Program.getRefArrayValue2double(G, RX10_TEMP69,X10_TEMP104);


								final double X10_TEMP145 = RX10_TEMP77;


								final double X10_TEMP147 = one_minus_omega * X10_TEMP145;


								final double X10_TEMP150 = X10_TEMP146 + X10_TEMP147;


								final double X10_TEMP151 = X10_TEMP150;


								final Dist2 RX10_TEMP78 = G.distValue;


								final Region2 RX10_TEMP79 = RX10_TEMP78.dReg;


								final int RX10_TEMP80 = Program.searchPointInRegion2(RX10_TEMP79, ij,X10_TEMP104);


								final int RX10_TEMP81 = 0;


								final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81;

								if(RX10_TEMP82)
									{

									String RX10_TEMP83 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP83);

									}

								final int RX10_TEMP84 = Program.getPlaceFromDist2(RX10_TEMP78, RX10_TEMP80,X10_TEMP104);


								final int RX10_TEMP86 = 0;


								final boolean RX10_TEMP87 = RX10_TEMP84 != RX10_TEMP86;

								if(RX10_TEMP87)
									{

									String RX10_TEMP85 = "Bad place access for array G";

									throw new RuntimeException(RX10_TEMP85);

									}
								Program.setRefArrayValue2double(G, RX10_TEMP80, X10_TEMP151,X10_TEMP104);
								}
							}
						}
					}
				}
			}

		final double X10_TEMP153 = Program.doublerefArraySum2(G,myUniquePlacePoint);

		return X10_TEMP153;
		}
public static int _Timer_max_counters_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 64;

		return X10_TEMP2;
		}
public static void Timer_start ( final Timer X10_TEMP0, final int n, int myUniquePlacePoint)
		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.start_time;


		final double X10_TEMP5 = System.currentTimeMillis();


		final double X10_TEMP6 = X10_TEMP5;


		final Point1 RX10_TEMP0 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;


		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0,myUniquePlacePoint);


		final int RX10_TEMP4 = 0;


		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;

		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP6);

			}

		final int RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final int RX10_TEMP9 = 0;


		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;

		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP8);

			}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6,myUniquePlacePoint);
		}
public static void Timer_stop ( final Timer X10_TEMP0, final int n, int myUniquePlacePoint)
		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.elapsed_time;


		final double X10_TEMP5 = System.currentTimeMillis();


		final doubleRefArray1 X10_TEMP3 = X10_TEMP0.start_time;


		final Point1 RX10_TEMP0 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP3.distValue;


		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;


		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0,myUniquePlacePoint);


		final int RX10_TEMP4 = 0;


		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;

		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP6);

			}

		final int RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final int RX10_TEMP9 = 0;


		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;

		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP3";

			throw new RuntimeException(RX10_TEMP8);

			}

		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP3, RX10_TEMP3,myUniquePlacePoint);


		final double X10_TEMP6 = RX10_TEMP11;


		final double X10_TEMP9 = X10_TEMP5 - X10_TEMP6;


		final double X10_TEMP10 = X10_TEMP9;


		final Point1 RX10_TEMP12 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP12.hashCode());


		final Dist1 RX10_TEMP13 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;


		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12,myUniquePlacePoint);


		final int RX10_TEMP16 = 0;


		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;

		if(RX10_TEMP17)
			{

			String RX10_TEMP18 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP18);

			}

		final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13, RX10_TEMP15,myUniquePlacePoint);


		final int RX10_TEMP21 = 0;


		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;

		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP20);

			}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP15, X10_TEMP10,myUniquePlacePoint);

		final doubleRefArray1 X10_TEMP11 = X10_TEMP0.elapsed_time;


		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;


		final Point1 RX10_TEMP23 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP23.hashCode());


		final Dist1 RX10_TEMP24 = X10_TEMP13.distValue;


		final Region1 RX10_TEMP25 = RX10_TEMP24.dReg;


		final int RX10_TEMP26 = Program.searchPointInRegion1(RX10_TEMP25, RX10_TEMP23,myUniquePlacePoint);


		final int RX10_TEMP27 = 0;


		final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27;

		if(RX10_TEMP28)
			{

			String RX10_TEMP29 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP29);

			}

		final int RX10_TEMP30 = Program.getPlaceFromDist1(RX10_TEMP24, RX10_TEMP26,myUniquePlacePoint);


		final int RX10_TEMP32 = 0;


		final boolean RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32;

		if(RX10_TEMP33)
			{

			String RX10_TEMP31 = "Bad place access for array X10_TEMP13";

			throw new RuntimeException(RX10_TEMP31);

			}

		final double RX10_TEMP34 = Program.getRefArrayValue1double(X10_TEMP13, RX10_TEMP26,myUniquePlacePoint);


		final double X10_TEMP15 = RX10_TEMP34;


		final int X10_TEMP16 = 1000;


		final double X10_TEMP19 = X10_TEMP15 / X10_TEMP16;


		final double X10_TEMP20 = X10_TEMP19;


		final Point1 RX10_TEMP35 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP35.hashCode());


		final Dist1 RX10_TEMP36 = X10_TEMP11.distValue;


		final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;


		final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37, RX10_TEMP35,myUniquePlacePoint);


		final int RX10_TEMP39 = 0;


		final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39;

		if(RX10_TEMP40)
			{

			String RX10_TEMP41 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP41);

			}

		final int RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36, RX10_TEMP38,myUniquePlacePoint);


		final int RX10_TEMP44 = 0;


		final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44;

		if(RX10_TEMP45)
			{

			String RX10_TEMP43 = "Bad place access for array X10_TEMP11";

			throw new RuntimeException(RX10_TEMP43);

			}
		Program.setRefArrayValue1double(X10_TEMP11, RX10_TEMP38, X10_TEMP20,myUniquePlacePoint);

		final doubleRefArray1 X10_TEMP21 = X10_TEMP0.total_time;


		final doubleRefArray1 X10_TEMP23 = X10_TEMP0.total_time;


		final Point1 RX10_TEMP46 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP46.hashCode());


		final Dist1 RX10_TEMP47 = X10_TEMP23.distValue;


		final Region1 RX10_TEMP48 = RX10_TEMP47.dReg;


		final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, RX10_TEMP46,myUniquePlacePoint);


		final int RX10_TEMP50 = 0;


		final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;

		if(RX10_TEMP51)
			{

			String RX10_TEMP52 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP52);

			}

		final int RX10_TEMP53 = Program.getPlaceFromDist1(RX10_TEMP47, RX10_TEMP49,myUniquePlacePoint);


		final int RX10_TEMP55 = 0;


		final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55;

		if(RX10_TEMP56)
			{

			String RX10_TEMP54 = "Bad place access for array X10_TEMP23";

			throw new RuntimeException(RX10_TEMP54);

			}

		final double RX10_TEMP57 = Program.getRefArrayValue1double(X10_TEMP23, RX10_TEMP49,myUniquePlacePoint);


		final double X10_TEMP27 = RX10_TEMP57;


		final doubleRefArray1 X10_TEMP25 = X10_TEMP0.elapsed_time;


		final Point1 RX10_TEMP58 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP58.hashCode());


		final Dist1 RX10_TEMP59 = X10_TEMP25.distValue;


		final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;


		final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, RX10_TEMP58,myUniquePlacePoint);


		final int RX10_TEMP62 = 0;


		final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;

		if(RX10_TEMP63)
			{

			String RX10_TEMP64 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP64);

			}

		final int RX10_TEMP65 = Program.getPlaceFromDist1(RX10_TEMP59, RX10_TEMP61,myUniquePlacePoint);


		final int RX10_TEMP67 = 0;


		final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;

		if(RX10_TEMP68)
			{

			String RX10_TEMP66 = "Bad place access for array X10_TEMP25";

			throw new RuntimeException(RX10_TEMP66);

			}

		final double RX10_TEMP69 = Program.getRefArrayValue1double(X10_TEMP25, RX10_TEMP61,myUniquePlacePoint);


		final double X10_TEMP28 = RX10_TEMP69;


		final double X10_TEMP31 = X10_TEMP27 + X10_TEMP28;


		final double X10_TEMP32 = X10_TEMP31;


		final Point1 RX10_TEMP70 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP70.hashCode());


		final Dist1 RX10_TEMP71 = X10_TEMP21.distValue;


		final Region1 RX10_TEMP72 = RX10_TEMP71.dReg;


		final int RX10_TEMP73 = Program.searchPointInRegion1(RX10_TEMP72, RX10_TEMP70,myUniquePlacePoint);


		final int RX10_TEMP74 = 0;


		final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74;

		if(RX10_TEMP75)
			{

			String RX10_TEMP76 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP76);

			}

		final int RX10_TEMP77 = Program.getPlaceFromDist1(RX10_TEMP71, RX10_TEMP73,myUniquePlacePoint);


		final int RX10_TEMP79 = 0;


		final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79;

		if(RX10_TEMP80)
			{

			String RX10_TEMP78 = "Bad place access for array X10_TEMP21";

			throw new RuntimeException(RX10_TEMP78);

			}
		Program.setRefArrayValue1double(X10_TEMP21, RX10_TEMP73, X10_TEMP32,myUniquePlacePoint);
		}
public static double Timer_readTimer ( final Timer X10_TEMP0, final int n, int myUniquePlacePoint)
		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;


		final Point1 RX10_TEMP0 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;


		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0,myUniquePlacePoint);


		final int RX10_TEMP4 = 0;


		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;

		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP6);

			}

		final int RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final int RX10_TEMP9 = 0;


		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;

		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP8);

			}

		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final double X10_TEMP4 = RX10_TEMP11;

		return X10_TEMP4;
		}
public static void Timer_resetTimer ( final Timer X10_TEMP0, final int n, int myUniquePlacePoint)
		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;


		final double X10_TEMP5 = 0;


		final double X10_TEMP6 = X10_TEMP5;


		final Point1 RX10_TEMP0 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;


		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0,myUniquePlacePoint);


		final int RX10_TEMP4 = 0;


		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;

		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP6);

			}

		final int RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final int RX10_TEMP9 = 0;


		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;

		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP8);

			}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6,myUniquePlacePoint);

		final doubleRefArray1 X10_TEMP7 = X10_TEMP0.start_time;


		final double X10_TEMP11 = 0;


		final double X10_TEMP12 = X10_TEMP11;


		final Point1 RX10_TEMP11 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP11.hashCode());


		final Dist1 RX10_TEMP12 = X10_TEMP7.distValue;


		final Region1 RX10_TEMP13 = RX10_TEMP12.dReg;


		final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13, RX10_TEMP11,myUniquePlacePoint);


		final int RX10_TEMP15 = 0;


		final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;

		if(RX10_TEMP16)
			{

			String RX10_TEMP17 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP17);

			}

		final int RX10_TEMP18 = Program.getPlaceFromDist1(RX10_TEMP12, RX10_TEMP14,myUniquePlacePoint);


		final int RX10_TEMP20 = 0;


		final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20;

		if(RX10_TEMP21)
			{

			String RX10_TEMP19 = "Bad place access for array X10_TEMP7";

			throw new RuntimeException(RX10_TEMP19);

			}
		Program.setRefArrayValue1double(X10_TEMP7, RX10_TEMP14, X10_TEMP12,myUniquePlacePoint);

		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;


		final double X10_TEMP17 = 0;


		final double X10_TEMP18 = X10_TEMP17;


		final Point1 RX10_TEMP22 = new Point1(n,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP22.hashCode());


		final Dist1 RX10_TEMP23 = X10_TEMP13.distValue;


		final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;


		final int RX10_TEMP25 = Program.searchPointInRegion1(RX10_TEMP24, RX10_TEMP22,myUniquePlacePoint);


		final int RX10_TEMP26 = 0;


		final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;

		if(RX10_TEMP27)
			{

			String RX10_TEMP28 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP28);

			}

		final int RX10_TEMP29 = Program.getPlaceFromDist1(RX10_TEMP23, RX10_TEMP25,myUniquePlacePoint);


		final int RX10_TEMP31 = 0;


		final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;

		if(RX10_TEMP32)
			{

			String RX10_TEMP30 = "Bad place access for array X10_TEMP13";

			throw new RuntimeException(RX10_TEMP30);

			}
		Program.setRefArrayValue1double(X10_TEMP13, RX10_TEMP25, X10_TEMP18,myUniquePlacePoint);
		}
public static void Timer_resetAllTimers ( final Timer X10_TEMP0, int myUniquePlacePoint)
		{

		int i = 0;


		boolean X10_TEMP4 = i < _Timer_max_counters;

		while(X10_TEMP4)
			{
			Program.Timer_resetTimer(X10_TEMP0, i,myUniquePlacePoint);

			final int X10_TEMP6 = i;


			final int X10_TEMP7 = 1;


			i = i + X10_TEMP7;


			X10_TEMP4 = i < _Timer_max_counters;

			}
		}
public static double doublerefArraySum2 ( final doubleRefArray2 sumArray, int myUniquePlacePoint)
		{

		final int maxPlaces = Program.MAX_PLACES;


		final int one = 1;


		final int zero = 0;


		final int maxPlacesMinusOne = maxPlaces - one;


		final Region1 dReg = Program.createNewRegion1R(zero, maxPlacesMinusOne,myUniquePlacePoint);


		final int source = 0;


		final Dist1 dSum = Program.getPlaceDist1(dReg, source,myUniquePlacePoint);


		final double initVal = 0;


		final Region1 RX10_TEMP0 = dSum.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dSum, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP14 = RX10_TEMP12+1;


					final double[] RX10_TEMP15 = new double/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )						{
						RX10_TEMP15[RX10_TEMP13] =initVal;
						}

;


					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP16.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP17 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP17.length ;RX10_TEMP19++ )			{

			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];

			RX10_TEMP17[RX10_TEMP19] =RX10_TEMP18;
			}

;


		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(dSum, RX10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final doubleRefArray1 localSumArray = RX10_TEMP20;


		final Dist1 dUnique = Program.UniqueDistribution;

		/*FINISH
*/			{

			final Region1 RX10_TEMP22 = dUnique.dReg;


			final int RX10_TEMP25 = 1;


			int RX10_TEMP23 = RX10_TEMP22.regSize;


			RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25;


			final int  RX10_TEMP24 = RX10_TEMP23+1;

			for(int RX10_TEMP21=0; RX10_TEMP21 < RX10_TEMP24; RX10_TEMP21++)
				{

				final int RX10_TEMP26 = RX10_TEMP21;


				final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP22, RX10_TEMP26,myUniquePlacePoint);


				final Region1 RX10_TEMP27 = dUnique.dReg;


				final int RX10_TEMP28 = Program.searchPointInRegion1(RX10_TEMP27, p,myUniquePlacePoint);


				final int RX10_TEMP29 = 0;


				final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29;

				if(RX10_TEMP30)
					{

					final String RX10_TEMP31 = "Point p not found in the distribution dUnique.";

					throw new RuntimeException(RX10_TEMP31);

					}

				final int RX10_TEMP32 = Program.getPlaceFromDist1(dUnique, RX10_TEMP28,myUniquePlacePoint);


				final int nthPlace = RX10_TEMP32;

				//async(nthPlace)
					{

					double localSumTemp = 0;


					final int thisPlace = 0;


					final Dist2 RX10_TEMP33 = sumArray.distValue;


					final Dist2 sumArrayDist = RX10_TEMP33;


					final Dist2 sumArrayDistHere = Program.restrictDist2(sumArrayDist, thisPlace,nthPlace);


					final Region2 RX10_TEMP35 = sumArrayDistHere.dReg;


					final int RX10_TEMP38 = 1;


					int RX10_TEMP36 = RX10_TEMP35.regSize;


					RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38;


					final int  RX10_TEMP37 = RX10_TEMP36+1;

					for(int RX10_TEMP34=0; RX10_TEMP34 < RX10_TEMP37; RX10_TEMP34++)
						{

						final int RX10_TEMP39 = RX10_TEMP34;


						final Point2 pt = Program.regionOrdinalPoint2(RX10_TEMP35, RX10_TEMP39,nthPlace);


						final Dist2 RX10_TEMP40 = sumArray.distValue;


						final Region2 RX10_TEMP41 = RX10_TEMP40.dReg;


						final int RX10_TEMP42 = Program.searchPointInRegion2(RX10_TEMP41, pt,nthPlace);


						final int RX10_TEMP43 = 0;


						final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;

						if(RX10_TEMP44)
							{

							String RX10_TEMP45 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP45);

							}

						final int RX10_TEMP46 = Program.getPlaceFromDist2(RX10_TEMP40, RX10_TEMP42,nthPlace);


						final int RX10_TEMP48 = 0;


						final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;

						if(RX10_TEMP49)
							{

							String RX10_TEMP47 = "Bad place access for array sumArray";

							throw new RuntimeException(RX10_TEMP47);

							}

						final double RX10_TEMP50 = Program.getRefArrayValue2double(sumArray, RX10_TEMP42,nthPlace);


						final double localSumCurr = RX10_TEMP50;


						localSumTemp = localSumTemp + localSumCurr;

						}

					final boolean isNotEqual = localSumTemp != zero;

					if(isNotEqual)
						{

						final int index = 0;


						final double localSum = localSumTemp;

						//async(source)
							{

							final Point1 RX10_TEMP51 = new Point1(index,source);
							
Program.globalPointerHashMap.get(source).add(RX10_TEMP51.hashCode());


							final Dist1 RX10_TEMP52 = localSumArray.distValue;


							final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;


							final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53, RX10_TEMP51,source);


							final int RX10_TEMP55 = 0;


							final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;

							if(RX10_TEMP56)
								{

								String RX10_TEMP57 = "Array index out of bounds";

								throw new RuntimeException(RX10_TEMP57);

								}

							final int RX10_TEMP58 = Program.getPlaceFromDist1(RX10_TEMP52, RX10_TEMP54,source);


							final int RX10_TEMP60 = 0;


							final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;

							if(RX10_TEMP61)
								{

								String RX10_TEMP59 = "Bad place access for array localSumArray";

								throw new RuntimeException(RX10_TEMP59);

								}
							Program.setRefArrayValue1double(localSumArray, RX10_TEMP54, localSum,source);
							}
						}
					}
				}
			}

		double globalSum = 0;


		final Dist1 RX10_TEMP63 = localSumArray.distValue;


		final Region1 RX10_TEMP64 = RX10_TEMP63.dReg;


		final int RX10_TEMP67 = 1;


		int RX10_TEMP65 = RX10_TEMP64.regSize;


		RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67;


		final int  RX10_TEMP66 = RX10_TEMP65+1;

		for(int RX10_TEMP62=0; RX10_TEMP62 < RX10_TEMP66; RX10_TEMP62++)
			{

			final int RX10_TEMP68 = RX10_TEMP62;


			final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP64, RX10_TEMP68,myUniquePlacePoint);


			final Dist1 RX10_TEMP69 = localSumArray.distValue;


			final Region1 RX10_TEMP70 = RX10_TEMP69.dReg;


			final int RX10_TEMP71 = Program.searchPointInRegion1(RX10_TEMP70, p,myUniquePlacePoint);


			final int RX10_TEMP72 = 0;


			final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72;

			if(RX10_TEMP73)
				{

				String RX10_TEMP74 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP74);

				}

			final int RX10_TEMP75 = Program.getPlaceFromDist1(RX10_TEMP69, RX10_TEMP71,myUniquePlacePoint);


			final int RX10_TEMP77 = 0;


			final boolean RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77;

			if(RX10_TEMP78)
				{

				String RX10_TEMP76 = "Bad place access for array localSumArray";

				throw new RuntimeException(RX10_TEMP76);

				}

			final double RX10_TEMP79 = Program.getRefArrayValue1double(localSumArray, RX10_TEMP71,myUniquePlacePoint);


			final double localSumCurr = RX10_TEMP79;


			globalSum = globalSum + localSumCurr;

			}
		return globalSum;
		}
public static int constantSearchRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int dim0 = r.dim0;


		final int low0 = r.low0;


		final int high0 = low0 + dim0;


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
public static void setRefArrayValue2double ( final doubleRefArray2 array, final int index, final double val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist2 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final doubleStub[] contents = array.contents;


		final doubleStub indexStub = contents[placeIndex];


		final double[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
		}
public static int constantSearchRegion2 ( final Region2 r, final Point2 target, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int dim0 = r.dim0;


		final int low0 = r.low0;


		final int high0 = low0 + dim0;


		int pt0 = target.f0;


		final boolean lbound0 = pt0 < low0;


		final boolean hbound0 = pt0 >= high0;


		final int dim1 = r.dim1;


		final int low1 = r.low1;


		final int high1 = low1 + dim1;


		int pt1 = target.f1;


		final boolean lbound1 = pt1 < low1;


		final boolean hbound1 = pt1 >= high1;


		final int dim2 = 1;


		boolean outRegion = false;


		outRegion = outRegion || lbound0;


		outRegion = outRegion || hbound0;


		outRegion = outRegion || lbound1;


		outRegion = outRegion || hbound1;

		if(outRegion)
			{

			int notFound = 0;


			notFound = notFound - one;

			return notFound;
			}

		final int stride2 = 1;


		final int stride1 = stride2 * dim2;


		final int stride0 = stride1 * dim1;


		pt0 = pt0 - low0;


		final int offset0 = stride0 * pt0;


		pt1 = pt1 - low1;


		final int offset1 = stride1 * pt1;


		int found = 0;


		found = found + offset0;


		found = found + offset1;

		return found;
		}
public static int binarySearchRegion2 ( final Region2 r, final Point2 target, int myUniquePlacePoint)
		{

		final Point2[] pointArray = (Point2[])(r.pointArray);


		int start = 0;


		int end = r.regSize;


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


			final Point2 temp = pointArray[mid];


			final int pointCompare = Program.comparePoint2(target, temp,myUniquePlacePoint);


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
public static int binarySearchRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)
		{

		final Point1[] pointArray = (Point1[])(r.pointArray);


		int start = 0;


		int end = r.regSize;


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
public static void setRefArrayValue1double ( final doubleRefArray1 array, final int index, final double val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final doubleStub[] contents = array.contents;


		final doubleStub indexStub = contents[placeIndex];


		final double[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
		}
public static Dist1 getUniqueDist (  int myUniquePlacePoint)
		{

		final int one = 1;


		final int zero = 0;


		final int maxPlaces = Program.MAX_PLACES;


		final int rSize = maxPlaces - one;


		final int  placeRegion = rSize+1;


		final Point1[] pointArray = (Point1[])(new Point1/*value*/[placeRegion]);
/*arrayInitBlock*/
for(int p= 0;p <pointArray.length ;p++ )			{

			final int i = p;


			final Point1 pt1 = new Point1(i,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pt1.hashCode());

			pointArray[p] =pt1;
			}

;


		final int[] vPlaceArray = (int[])(new int/*value*/[placeRegion]);
/*arrayInitBlock*/
for(int p= 0;p <vPlaceArray.length ;p++ )			{

			final int i = p;


			final int pl1 = i;

			vPlaceArray[p] =pl1;
			}

;


		final Region1 reg = new Region1(pointArray, zero, maxPlaces,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(reg.hashCode());


		final Dist pointDist1 = new Dist(vPlaceArray, maxPlaces,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());


		final Dist1 retDist = new Dist1(reg, pointDist1,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retDist.hashCode());

		return retDist;
		}
public static int getPlaceFromDist1 ( final Dist1 dn, final int index, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int retPlace = placeArray[index];

		return retPlace;
		}
public static int getPlaceFromDist2 ( final Dist2 dn, final int index, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int retPlace = placeArray[index];

		return retPlace;
		}
public static int comparePoint1 ( final Point1 pt1, final Point1 pt2, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int two = 2;


		int point1 = 0;


		int point2 = 0;


		boolean lt = false;


		boolean gt = false;


		point1 = pt1.f0;


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
public static int comparePoint2 ( final Point2 pt1, final Point2 pt2, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int two = 2;


		int point1 = 0;


		int point2 = 0;


		boolean lt = false;


		boolean gt = false;


		point1 = pt1.f0;


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

		point1 = pt1.f1;


		point2 = pt2.f1;


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
public static Point2 regionOrdinalPoint2 ( final Region2 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point2[] pointArray = reg.pointArray;


		final Point2 pt = pointArray[ordl];

		return pt;
		}
public static Point1 regionOrdinalPoint1 ( final Region1 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point1[] pointArray = reg.pointArray;


		final Point1 pt = pointArray[ordl];

		return pt;
		}
public static double getRefArrayValue1double ( final doubleRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final doubleStub[] contents = array.contents;


		final doubleStub indexStub = contents[placeIndex];


		final double[] localArray = indexStub.localArray;


		final double returnValue = localArray[localIndex];

		return returnValue;
		}
public static Dist1 restrictDist1 ( final Dist1 d, final int p, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int h = 0;


		final Region1 dReg = d.dReg;


		final Dist dDist = d.dDist;


		final int dim = dReg.regSize;


		final int dimMinusOne = dim - one;


		final int  dRegReg = dimMinusOne+1;


		final Point1[] dArray = (Point1[])(dReg.pointArray);


		final int[] dPlace = (int[])(dDist.placeArray);


		final int[] dCounts = (int[])(dDist.counts);


		final int index = 0;


		int numPoints = dCounts[index];


		final int rSizeNumPoints = numPoints;


		final int rSize = numPoints - one;


		final int  tempReg = rSize+1;


		final int tempDist = rSize+1;


		final int[] rPlace = (int[])(new int/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <rPlace.length ;pt++ )			{
			rPlace[pt] =p;
			}

;


		final int[] tempArray = new int[tempDist];


		final boolean cond1 = numPoints > zero;

		if(cond1)
			{

			numPoints = 0;

			for(int pt=0; pt < dRegReg; pt++)
				{

				final int dP = dPlace[pt];


				final boolean cond2 = p == dP;

				if(cond2)
					{

					final int i = pt;

					tempArray[numPoints] = i;

					numPoints = numPoints + one;

					}
				}
			}

		final Point1[] pointArray = (Point1[])(new Point1/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <pointArray.length ;pt++ )			{

			final int idx = tempArray[pt];


			final Point1 dpt = dArray[idx];

			pointArray[pt] =dpt;
			}

;


		final Region1 dpReg = new Region1(pointArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpReg.hashCode());


		final Dist dpDist = new Dist(rPlace, rSizeNumPoints,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpDist.hashCode());


		final Dist1 dpDistn = new Dist1(dpReg, dpDist,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpDistn.hashCode());

		return dpDistn;
		}
public static Region1 unionRegion1 ( final Region1 reg1, final Region1 reg2, int myUniquePlacePoint)
		{

		int index1 = 0;


		int index2 = 0;


		int index = 0;


		final Point1[] arr1 = (Point1[])(reg1.pointArray);


		final Point1[] arr2 = (Point1[])(reg2.pointArray);


		final int size1 = reg1.regSize;


		final int size2 = reg2.regSize;


		boolean cond1 = index1 < size1;


		boolean cond2 = index2 < size2;


		final int zero = 0;


		final int one = 1;


		final int two = 2;


		boolean cond = cond1 && cond2;

		while(cond)
			{

			final Point1 p1 = arr1[index1];


			final Point1 p2 = arr2[index2];


			final int pointCompare = Program.comparePoint1(p1, p2,myUniquePlacePoint);


			final boolean eq = pointCompare == zero;


			final boolean lt = pointCompare == one;


			final boolean gt = pointCompare == two;

			if(eq)
				{

				index1 = index1 + one;


				index2 = index2 + one;

				}
			if(lt)
				{

				index1 = index1 + one;

				}
			if(gt)
				{

				index2 = index2 + one;

				}

			index = index + one;


			cond1 = index1 < size1;


			cond2 = index2 < size2;


			cond = cond1 && cond2;

			}

		cond1 = index1 < size1;

		while(cond1)
			{

			index1 = index1 + one;


			index = index + one;


			cond1 = index1 < size1;

			}

		cond2 = index2 < size2;

		while(cond2)
			{

			index2 = index2 + one;


			index = index + one;


			cond2 = index2 < size2;

			}

		final int rSize = index;


		final int sizeMinusOne = rSize - one;


		final int  tempReg = sizeMinusOne+1;


		final int tempDist = sizeMinusOne+1;


		final Point1[] tempArr = new Point1[tempDist];


		index1 = 0;


		index2 = 0;


		index = 0;


		cond1 = index1 < size1;


		cond2 = index2 < size2;


		cond = cond1 && cond2;

		while(cond)
			{

			final Point1 p1 = arr1[index1];


			final Point1 p2 = arr2[index2];


			final int pointCompare = Program.comparePoint1(p1, p2,myUniquePlacePoint);


			final boolean eq = pointCompare == zero;


			final boolean lt = pointCompare == one;


			final boolean gt = pointCompare == two;

			if(eq)
				{
				tempArr[index] = p1;

				index1 = index1 + one;


				index2 = index2 + one;

				}
			if(lt)
				{
				tempArr[index] = p1;

				index1 = index1 + one;

				}
			if(gt)
				{
				tempArr[index] = p2;

				index2 = index2 + one;

				}

			index = index + one;


			cond1 = index1 < size1;


			cond2 = index2 < size2;


			cond = cond1 && cond2;

			}

		cond1 = index1 < size1;

		while(cond1)
			{

			final Point1 tempArrPt = arr1[index1];

			tempArr[index] = tempArrPt;

			index1 = index1 + one;


			index = index + one;


			cond1 = index1 < size1;

			}

		cond2 = index2 < size2;

		while(cond2)
			{

			final Point1 tempArrPt = arr2[index2];

			tempArr[index] = tempArrPt;

			index2 = index2 + one;


			index = index + one;


			cond2 = index2 < size2;

			}

		final Point1[] arr = (Point1[])(new Point1/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <arr.length ;pt++ )			{

			final Point1 retPoint = tempArr[pt];

			arr[pt] =retPoint;
			}

;


		final Region1 unionReg = new Region1(arr,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(unionReg.hashCode());

		return unionReg;
		}
public static Dist1 getBlockDist1 ( final Region1 r, int myUniquePlacePoint)
		{

		final int rSize = r.regSize;


		final int zero = 0;


		final int one = 1;


		final int rSizeMinusOne = rSize - one;


		final int  dReg = rSizeMinusOne+1;


		final int dDist = rSizeMinusOne+1;


		final int[] placeArray = new int[dDist];


		final int N = Program.MAX_PLACES;


		final int q = rSize % N;


		final int p = rSize / N;


		int blockSize = p + one;


		int arraySize = q * blockSize;


		int offset = 0;


		int initPlace = 0;

		Program.getCyclic(placeArray, arraySize, initPlace, blockSize,myUniquePlacePoint);

		int remainingPlaces = N - q;


		final boolean cond = remainingPlaces == zero;

		if(cond)
			{

			final int[] vPlaceArray = (int[])(new int/*value*/[dReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <vPlaceArray.length ;pt++ )				{

				final int tempPl = placeArray[pt];

				vPlaceArray[pt] =tempPl;
				}

;


			final Dist pointDist1 = new Dist(vPlaceArray, rSize,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());


			final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retDist.hashCode());

			return retDist;
			}

		offset = arraySize;


		blockSize = p;


		arraySize = remainingPlaces * blockSize;


		initPlace = q;


		int chunk = blockSize;


		final boolean ifCond = blockSize > arraySize;

		if(ifCond)
			{

			chunk = arraySize;

			}

		int index = offset;


		int dSize = index + chunk;


		dSize = dSize - one;


		final int ub0 = chunk - one;


		final int  pointReg0 = ub0+1;

		for(int pt=0; pt < pointReg0; pt++)
			{

			final int tempPt = pt +index;

			placeArray[tempPt] = initPlace;
			}

		index = index + chunk;


		arraySize = arraySize - chunk;


		int pl = ((initPlace+1)%Program.MAX_PLACES);


		boolean whileCond = arraySize != zero;

		while(whileCond)
			{

			final boolean tailCond = chunk > arraySize;

			if(tailCond)
				{

				dSize = index + arraySize;


				dSize = dSize - one;


				final int ub = arraySize - one;


				final int  pointReg1 = ub+1;

				for(int pt=0; pt < pointReg1; pt++)
					{

					final int tempPt = pt +index;

					placeArray[tempPt] = pl;
					}

				arraySize = 0;

				}
			else
				{

				dSize = index + chunk;


				dSize = dSize - one;


				final int ub = chunk - one;


				final int  pointReg1 = ub+1;

				for(int pt=0; pt < pointReg1; pt++)
					{

					final int tempPt = pt +index;

					placeArray[tempPt] = pl;
					}

				index = index + chunk;


				arraySize = arraySize - chunk;

				}
 
			pl = ((pl+1)%Program.MAX_PLACES);


			whileCond = arraySize != zero;

			}

		final int[] vPlaceArray = (int[])(new int/*value*/[dReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <vPlaceArray.length ;pt++ )			{

			final int tempPl = placeArray[pt];

			vPlaceArray[pt] =tempPl;
			}

;


		final Dist pointDist1 = new Dist(vPlaceArray, rSize,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist1.hashCode());


		final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retDist.hashCode());

		return retDist;
		}
public static Dist2 unionDist2 ( final Dist2 d1, final Dist2 d2, int myUniquePlacePoint)
		{

		int index1 = 0;


		int index2 = 0;


		int index = 0;


		final Region2 reg1 = d1.dReg;


		final Point2[] arr1 = (Point2[])(reg1.pointArray);


		final Region2 reg2 = d2.dReg;


		final Point2[] arr2 = (Point2[])(reg2.pointArray);


		final Dist dDist1 = d1.dDist;


		final int[] dPlaceArray1 = dDist1.placeArray;


		final Dist dDist2 = d2.dDist;


		final int[] dPlaceArray2 = dDist2.placeArray;


		final int size1 = reg1.regSize;


		final int size2 = reg2.regSize;


		final int rSize = size1 + size2;


		final int zero = 0;


		final int one = 1;


		final int sizeMinusOne = rSize - one;


		final int  tempReg = sizeMinusOne+1;


		final int tempDist = sizeMinusOne+1;


		final Point2[] tempArr = new Point2[tempDist];


		final int[] placeArray = new int[tempDist];


		boolean cond1 = index1 < size1;


		boolean cond2 = index2 < size2;


		boolean cond = cond1 && cond2;

		while(cond)
			{

			final Point2 p1 = arr1[index1];


			final Point2 p2 = arr2[index2];


			final int pointCompare = Program.comparePoint2(p1, p2,myUniquePlacePoint);


			final boolean eq = pointCompare == zero;


			final boolean lt = pointCompare == one;

			if(eq)
				{

				final String errMsg = "Non-disjoint region in a disjoint union";

				throw new RuntimeException(errMsg);

				}
			if(lt)
				{
				tempArr[index] = p1;

				final int pPlace = dPlaceArray1[index1];

				placeArray[index] = pPlace;

				index1 = index1 + one;

				}
			else
				{
				tempArr[index] = p2;

				final int pPlace = dPlaceArray2[index2];

				placeArray[index] = pPlace;

				index2 = index2 + one;

				}
 
			index = index + one;


			cond1 = index1 < size1;


			cond2 = index2 < size2;


			cond = cond1 && cond2;

			}

		cond1 = index1 < size1;

		while(cond1)
			{

			final Point2 tempArrPt = arr1[index1];

			tempArr[index] = tempArrPt;

			final int pPlace = dPlaceArray1[index1];

			placeArray[index] = pPlace;

			index1 = index1 + one;


			index = index + one;


			cond1 = index1 < size1;

			}

		cond2 = index2 < size2;

		while(cond2)
			{

			final Point2 tempArrPt = arr2[index2];

			tempArr[index] = tempArrPt;

			final int pPlace = dPlaceArray2[index2];

			placeArray[index] = pPlace;

			index2 = index2 + one;


			index = index + one;


			cond2 = index2 < size2;

			}

		final Point2[] arr = (Point2[])(new Point2/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <arr.length ;pt++ )			{

			final Point2 retPoint = tempArr[pt];

			arr[pt] =retPoint;
			}

;


		final Region2 unionReg = new Region2(arr,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(unionReg.hashCode());


		final int[] vPlaceArray = (int[])(new int/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <vPlaceArray.length ;pt++ )			{

			final int tempPl = placeArray[pt];

			vPlaceArray[pt] =tempPl;
			}

;


		final Dist pointDist = new Dist(vPlaceArray, rSize,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist.hashCode());


		final Dist2 unionDist = new Dist2(unionReg, pointDist,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(unionDist.hashCode());

		return unionDist;
		}
public static void getCyclic ( final int[] placeArray, final int arraySize, final int initPlace, final int blockSize, int myUniquePlacePoint)
		{

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

		for(int p=0; p < pointReg; p++)
			{
			placeArray[p] = initPlace;
			}

		index = index + chunk;


		N = N - chunk;


		int pl = ((initPlace+1)%Program.MAX_PLACES);


		boolean whileCond = N != zero;

		while(whileCond)
			{

			final boolean tailCond = chunk > N;

			if(tailCond)
				{

				dSize = index + N;


				dSize = dSize - one;


				final int ub = N - one;


				final int  pointReg1 = ub+1;

				for(int p=0; p < pointReg1; p++)
					{

					final int tempPt = p +index;

					placeArray[tempPt] = pl;
					}

				N = 0;

				}
			else
				{

				dSize = index + chunk;


				dSize = dSize - one;


				final int ub = chunk - one;


				final int  pointReg1 = ub+1;

				for(int p=0; p < pointReg1; p++)
					{

					final int tempPt = p +index;

					placeArray[tempPt] = pl;
					}

				index = index + chunk;


				N = N - chunk;

				}
 
			pl = ((pl+1)%Program.MAX_PLACES);


			whileCond = N != zero;

			}
		}
public static int getDistLocalCount2 ( final Dist2 dn, final int placeIndex, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] counts = d.counts;


		final int localCount = counts[placeIndex];

		return localCount;
		}
public static int getDistLocalCount1 ( final Dist1 dn, final int placeIndex, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] counts = d.counts;


		final int localCount = counts[placeIndex];

		return localCount;
		}
public static int searchPointInRegion2 ( final Region2 r, final Point2 target, int myUniquePlacePoint)
		{

		final boolean regType = r.regType;

		if(regType)
			{

			final int constantSearch = Program.constantSearchRegion2(r, target,myUniquePlacePoint);

			return constantSearch;
			}

		final int binarySearch = Program.binarySearchRegion2(r, target,myUniquePlacePoint);

		return binarySearch;
		}
public static int searchPointInRegion1 ( final Region1 r, final Point1 target, int myUniquePlacePoint)
		{

		final boolean regType = r.regType;

		if(regType)
			{

			final int constantSearch = Program.constantSearchRegion1(r, target,myUniquePlacePoint);

			return constantSearch;
			}

		final int binarySearch = Program.binarySearchRegion1(r, target,myUniquePlacePoint);

		return binarySearch;
		}
public static double getRefArrayValue2double ( final doubleRefArray2 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist2 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final doubleStub[] contents = array.contents;


		final doubleStub indexStub = contents[placeIndex];


		final double[] localArray = indexStub.localArray;


		final double returnValue = localArray[localIndex];

		return returnValue;
		}
public static Dist2 getPlaceDist2 ( final Region2 r, final int p, int myUniquePlacePoint)
		{

		final int rSize = r.regSize;


		final int one = 1;


		final int rSizeMinusOne = rSize - one;


		final int  dReg = rSizeMinusOne+1;


		final int[] vPlaceArray = (int[])(new int/*value*/[dReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <vPlaceArray.length ;pt++ )			{
			vPlaceArray[pt] =p;
			}

;


		final Dist pointDist = new Dist(vPlaceArray, rSize,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist.hashCode());


		final Dist2 retDist = new Dist2(r, pointDist,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retDist.hashCode());

		return retDist;
		}
public static Dist1 getPlaceDist1 ( final Region1 r, final int p, int myUniquePlacePoint)
		{

		final int rSize = r.regSize;


		final int one = 1;


		final int rSizeMinusOne = rSize - one;


		final int  dReg = rSizeMinusOne+1;


		final int[] vPlaceArray = (int[])(new int/*value*/[dReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <vPlaceArray.length ;pt++ )			{
			vPlaceArray[pt] =p;
			}

;


		final Dist pointDist = new Dist(vPlaceArray, rSize,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(pointDist.hashCode());


		final Dist1 retDist = new Dist1(r, pointDist,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retDist.hashCode());

		return retDist;
		}
public static Dist2 restrictDist2 ( final Dist2 d, final int p, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		final int h = 0;


		final Region2 dReg = d.dReg;


		final Dist dDist = d.dDist;


		final int dim = dReg.regSize;


		final int dimMinusOne = dim - one;


		final int  dRegReg = dimMinusOne+1;


		final Point2[] dArray = (Point2[])(dReg.pointArray);


		final int[] dPlace = (int[])(dDist.placeArray);


		final int[] dCounts = (int[])(dDist.counts);


		final int index = 0;


		int numPoints = dCounts[index];


		final int rSizeNumPoints = numPoints;


		final int rSize = numPoints - one;


		final int  tempReg = rSize+1;


		final int tempDist = rSize+1;


		final int[] rPlace = (int[])(new int/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <rPlace.length ;pt++ )			{
			rPlace[pt] =p;
			}

;


		final int[] tempArray = new int[tempDist];


		final boolean cond1 = numPoints > zero;

		if(cond1)
			{

			numPoints = 0;

			for(int pt=0; pt < dRegReg; pt++)
				{

				final int dP = dPlace[pt];


				final boolean cond2 = p == dP;

				if(cond2)
					{

					final int i = pt;

					tempArray[numPoints] = i;

					numPoints = numPoints + one;

					}
				}
			}

		final Point2[] pointArray = (Point2[])(new Point2/*value*/[tempReg]);
/*arrayInitBlock*/
for(int pt= 0;pt <pointArray.length ;pt++ )			{

			final int idx = tempArray[pt];


			final Point2 dpt = dArray[idx];

			pointArray[pt] =dpt;
			}

;


		final Region2 dpReg = new Region2(pointArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpReg.hashCode());


		final Dist dpDist = new Dist(rPlace, rSizeNumPoints,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpDist.hashCode());


		final Dist2 dpDistn = new Dist2(dpReg, dpDist,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(dpDistn.hashCode());

		return dpDistn;
		}
public static int[] initDist ( final int[] tempArr, final int  tempReg, int myUniquePlacePoint)
		{

		final int[] vTemp = (int[])(new int/*value*/[tempReg]);
/*arrayInitBlock*/
for(int p= 0;p <vTemp.length ;p++ )			{

			final int tempInt = tempArr[p];

			vTemp[p] =tempInt;
			}

;

		return vTemp;
		}
public static Region1 createNewRegion1R ( final int v1_0, final int v1_1, int myUniquePlacePoint)
		{

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
for(int pt= 0;pt <ptArray.length ;pt++ )			{

			final int p = pt;


			int f1 = p / stride1;


			f1 = f1 % dim1;


			f1 = f1 + v1_0;


			final Point1 retPoint = new Point1(f1,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region1 retReg = new Region1(ptArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retReg.hashCode());

		return retReg;
		}
public static Region2 createNewRegion2RR ( final int v1_0, final int v1_1, final int v2_0, final int v2_1, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		boolean regType = true;


		final boolean tempBool1 = true;


		final boolean tempBool2 = true;


		regType = regType && tempBool1;


		regType = regType && tempBool2;


		final int l1 = v1_1 - v1_0;


		final int dim1 = l1 + one;


		final int l2 = v2_1 - v2_0;


		final int dim2 = l2 + one;


		final int stride2 = 1;


		final int stride1 = stride2 * dim2;


		final int stride0 = stride1 * dim1;


		final int rSize = stride0 - one;


		final int  regArr = rSize+1;


		final Point2[] ptArray = (Point2[])(new Point2/*value*/[regArr]);
/*arrayInitBlock*/
for(int pt= 0;pt <ptArray.length ;pt++ )			{

			final int p = pt;


			int f1 = p / stride1;


			f1 = f1 % dim1;


			f1 = f1 + v1_0;


			int f2 = p / stride2;


			f2 = f2 % dim2;


			f2 = f2 + v2_0;


			final Point2 retPoint = new Point2(f1, f2,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region2 retRegRegular = new Region2(ptArray, v1_0, dim1, v2_0, dim2,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region2 retReg = new Region2(ptArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retReg.hashCode());

		return retReg;
		}
public static Region2 createNewRegion2AA ( final Region1 v1_0, final Region1 v2_0, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		boolean regType = true;


		final boolean tempBool1 = v1_0.regType;


		final boolean tempBool2 = v2_0.regType;


		regType = regType && tempBool1;


		regType = regType && tempBool2;


		final int tempRegSize1 = v1_0.regSize;


		final boolean cond1 = tempRegSize1 <= zero;


		int tempLow1 = 0;

		if(cond1)
			{

			tempLow1 = zero;

			}
		else
			{

			final Point1[] tempArray1 = v1_0.pointArray;


			final Point1 tempArrayPt1 = tempArray1[zero];


			tempLow1 = tempArrayPt1.f0;

			}
 
		final int low1 = tempLow1;


		final int tempRegSize2 = v2_0.regSize;


		final boolean cond2 = tempRegSize2 <= zero;


		int tempLow2 = 0;

		if(cond2)
			{

			tempLow2 = zero;

			}
		else
			{

			final Point1[] tempArray2 = v2_0.pointArray;


			final Point1 tempArrayPt2 = tempArray2[zero];


			tempLow2 = tempArrayPt2.f0;

			}
 
		final int low2 = tempLow2;


		final int l1 = v1_0.regSize;


		final int dim1 = l1;


		final int l2 = v2_0.regSize;


		final int dim2 = l2;


		final int stride2 = 1;


		final int stride1 = stride2 * dim2;


		final int stride0 = stride1 * dim1;


		final int rSize = stride0 - one;


		final int  regArr = rSize+1;


		final Point2[] ptArray = (Point2[])(new Point2/*value*/[regArr]);
/*arrayInitBlock*/
for(int pt= 0;pt <ptArray.length ;pt++ )			{

			final int p = pt;


			int f1 = p / stride1;


			f1 = f1 % dim1;


			final Point1[] rArray1 = v1_0.pointArray;


			final Point1 rArrayPt1 = rArray1[f1];


			f1 = rArrayPt1.f0;


			int f2 = p / stride2;


			f2 = f2 % dim2;


			final Point1[] rArray2 = v2_0.pointArray;


			final Point1 rArrayPt2 = rArray2[f2];


			f2 = rArrayPt2.f0;


			final Point2 retPoint = new Point2(f1, f2,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region2 retRegRegular = new Region2(ptArray, low1, dim1, low2, dim2,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region2 retReg = new Region2(ptArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retReg.hashCode());

		return retReg;
		}

}
	class Random   {
 
	public long seed;


	public Random ( final long rseed, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
		this.Random_setSeed(rseed,myUniquePlacePoint);
		}


public void Random_setSeed ( final long rseed, int myUniquePlacePoint)
		{

		final long X10_TEMP1 = Program._Random_multiplier;


		final long X10_TEMP3 = rseed ^ X10_TEMP1;


		final long X10_TEMP4 = Program._Random_mask;


		final long X10_TEMP6 = X10_TEMP3 & X10_TEMP4;


		seed = X10_TEMP6;

		}

}
	class SOR   {
 
	public Random R;


	public SOR (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		long X10_TEMP2 = Program._SOR_RANDOM_SEED;


		final Random X10_TEMP4 = new Random(X10_TEMP2,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());


		R = X10_TEMP4;

		}



}
	class Timer   {
 
	public doubleRefArray1 start_time;
	public doubleRefArray1 elapsed_time;
	public doubleRefArray1 total_time;


	public Timer (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int X10_TEMP3 = 0;


		final int X10_TEMP4 = Program._Timer_max_counters;


		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);


		final int X10_TEMP6 = 0;


		final Dist1 d = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(d, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					Program.globalPointerHashMap.get(RX10_TEMP10).add(this.hashCode());

					final int RX10_TEMP14 = RX10_TEMP12+1;


					final double[] RX10_TEMP15 = new double/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )						{

						Program.globalPointerHashMap.get(RX10_TEMP10).add(this.hashCode());

						final double X10_TEMP9 = 0;

						RX10_TEMP15[RX10_TEMP13] =X10_TEMP9;
						}

;


					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP16.hashCode());

					//async(RX10_TEMP8)
						{

						Program.globalPointerHashMap.get(RX10_TEMP8).add(this.hashCode());
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP17 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP17.length ;RX10_TEMP19++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];

			RX10_TEMP17[RX10_TEMP19] =RX10_TEMP18;
			}

;


		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(d, RX10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final doubleRefArray1 X10_TEMP11 = RX10_TEMP20;


		start_time = X10_TEMP11;


		final Region1 RX10_TEMP21 = d.dReg;


		final int RX10_TEMP22 = 0;


		final int RX10_TEMP23 = 1;


		int RX10_TEMP24 = Program.MAX_PLACES;


		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23;


		final int  RX10_TEMP25 = RX10_TEMP24+1;


		final int RX10_TEMP26 = RX10_TEMP24+1;


		final doubleStub[] RX10_TEMP27 = new doubleStub[RX10_TEMP26];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP28=0; RX10_TEMP28 < RX10_TEMP25; RX10_TEMP28++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP29 = 0;


				final int RX10_TEMP30 = RX10_TEMP28;


				final int RX10_TEMP31 = RX10_TEMP30;


				final int RX10_TEMP32 = Program.getDistLocalCount1(d, RX10_TEMP30,myUniquePlacePoint);


				final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23;

				//async(RX10_TEMP31)
					{

					Program.globalPointerHashMap.get(RX10_TEMP31).add(this.hashCode());

					final int RX10_TEMP35 = RX10_TEMP33+1;


					final double[] RX10_TEMP36 = new double/*NewUpdatableArray*/[RX10_TEMP35];
/*arrayInitBlock*/
for(int RX10_TEMP34= 0;RX10_TEMP34 <RX10_TEMP36.length ;RX10_TEMP34++ )						{

						Program.globalPointerHashMap.get(RX10_TEMP31).add(this.hashCode());

						final double X10_TEMP13 = 0;

						RX10_TEMP36[RX10_TEMP34] =X10_TEMP13;
						}

;


					final doubleStub RX10_TEMP37 = new doubleStub(RX10_TEMP36,RX10_TEMP31);
					
Program.globalPointerHashMap.get(RX10_TEMP31).add(RX10_TEMP37.hashCode());

					//async(RX10_TEMP29)
						{

						Program.globalPointerHashMap.get(RX10_TEMP29).add(this.hashCode());
						RX10_TEMP27[RX10_TEMP28] = RX10_TEMP37;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP38 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP25]);
/*arrayInitBlock*/
for(int RX10_TEMP40= 0;RX10_TEMP40 <RX10_TEMP38.length ;RX10_TEMP40++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final doubleStub RX10_TEMP39 = RX10_TEMP27[RX10_TEMP40];

			RX10_TEMP38[RX10_TEMP40] =RX10_TEMP39;
			}

;


		final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1(d, RX10_TEMP38,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP41.hashCode());


		final doubleRefArray1 X10_TEMP15 = RX10_TEMP41;


		elapsed_time = X10_TEMP15;


		final Region1 RX10_TEMP42 = d.dReg;


		final int RX10_TEMP43 = 0;


		final int RX10_TEMP44 = 1;


		int RX10_TEMP45 = Program.MAX_PLACES;


		RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44;


		final int  RX10_TEMP46 = RX10_TEMP45+1;


		final int RX10_TEMP47 = RX10_TEMP45+1;


		final doubleStub[] RX10_TEMP48 = new doubleStub[RX10_TEMP47];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP49=0; RX10_TEMP49 < RX10_TEMP46; RX10_TEMP49++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP50 = 0;


				final int RX10_TEMP51 = RX10_TEMP49;


				final int RX10_TEMP52 = RX10_TEMP51;


				final int RX10_TEMP53 = Program.getDistLocalCount1(d, RX10_TEMP51,myUniquePlacePoint);


				final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44;

				//async(RX10_TEMP52)
					{

					Program.globalPointerHashMap.get(RX10_TEMP52).add(this.hashCode());

					final int RX10_TEMP56 = RX10_TEMP54+1;


					final double[] RX10_TEMP57 = new double/*NewUpdatableArray*/[RX10_TEMP56];
/*arrayInitBlock*/
for(int RX10_TEMP55= 0;RX10_TEMP55 <RX10_TEMP57.length ;RX10_TEMP55++ )						{

						Program.globalPointerHashMap.get(RX10_TEMP52).add(this.hashCode());

						final double X10_TEMP17 = 0;

						RX10_TEMP57[RX10_TEMP55] =X10_TEMP17;
						}

;


					final doubleStub RX10_TEMP58 = new doubleStub(RX10_TEMP57,RX10_TEMP52);
					
Program.globalPointerHashMap.get(RX10_TEMP52).add(RX10_TEMP58.hashCode());

					//async(RX10_TEMP50)
						{

						Program.globalPointerHashMap.get(RX10_TEMP50).add(this.hashCode());
						RX10_TEMP48[RX10_TEMP49] = RX10_TEMP58;
						}
					}
				}
			}

		final doubleStub[] RX10_TEMP59 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP46]);
/*arrayInitBlock*/
for(int RX10_TEMP61= 0;RX10_TEMP61 <RX10_TEMP59.length ;RX10_TEMP61++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final doubleStub RX10_TEMP60 = RX10_TEMP48[RX10_TEMP61];

			RX10_TEMP59[RX10_TEMP61] =RX10_TEMP60;
			}

;


		final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1(d, RX10_TEMP59,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP62.hashCode());


		final doubleRefArray1 X10_TEMP19 = RX10_TEMP62;


		total_time = X10_TEMP19;

		}



}
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;

		}


	}
	/*value*/ class Dist 
	 {
 
	public final int[] placeArray;
	public final int[] counts;
	public final int[] runningSum;


	public Dist ( final int[] vPlaceArray, final int arraySize, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int one = 1;


		final int zero = 0;


		final int maxPlaces = Program.MAX_PLACES;


		final int ub = maxPlaces - one;


		final int  countReg = ub+1;


		final int countDist = ub+1;


		final int rSize = arraySize - one;


		final int  arrayReg = rSize+1;


		final int runSumDist = rSize+1;


		final int[] tempCounts = new int[countDist];


		final int[] tempRunSum = new int[runSumDist];

		for(int p=0; p < countReg; p++)
			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			tempCounts[p] = zero;
			}
		for(int p=0; p < arrayReg; p++)
			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final int pl = vPlaceArray[p];


			final int index = 0;


			final int oldVal = tempCounts[index];

			tempRunSum[p] = oldVal;

			final int oldValPlusOne = oldVal + one;

			tempCounts[index] = oldValPlusOne;
			}

		placeArray = vPlaceArray;


		counts = Program.initDist(tempCounts, countReg,myUniquePlacePoint);


		runningSum = Program.initDist(tempRunSum, arrayReg,myUniquePlacePoint);

		}


	}
	/*value*/ class doubleRefArray2 
	 {
 
	public final Dist2 distValue;
	public final doubleStub[] contents;


	public doubleRefArray2 ( final Dist2 distValue_, final doubleStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Dist1 
	 {
 
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		dReg = dReg_;


		dDist = dDist_;

		}


	}
	/*value*/ class Region2 
	 {
 
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final Point2[] pointArray;


	public Region2 ( final Point2[] pointArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int zero = 0;


		final int one = 1;


		final int minusOne = zero - one;


		regRank = 2;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = false;


		low0 = minusOne;


		dim0 = zero;


		low1 = minusOne;


		dim1 = zero;

		}
	public Region2 ( final Point2[] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regRank = 2;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;


		low1 = low1_;


		dim1 = dim1_;

		}


	}
	/*value*/ class doubleRefArray1 
	 {
 
	public final Dist1 distValue;
	public final doubleStub[] contents;


	public doubleRefArray1 ( final Dist1 distValue_, final doubleStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Region1 
	 {
 
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1[] pointArray;


	public Region1 ( final Point1[] pointArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int zero = 0;


		final int one = 1;


		final int minusOne = zero - one;


		regRank = 1;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = false;


		low0 = minusOne;


		dim0 = zero;

		}
	public Region1 ( final Point1[] pointArray_, final int low0_, final int dim0_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regRank = 1;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;

		}


	}
	/*value*/ class Point2 
	 {
 
	public final int f0;
	public final int f1;


	public Point2 ( final int f0_, final int f1_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;


		f1 = f1_;

		}


	}
	/*value*/ class doubleStub 
	 {
 
	public final double[] localArray;


	public doubleStub ( final double[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class Dist2 
	 {
 
	public final Region2 dReg;
	public final Dist dDist;


	public Dist2 ( final Region2 dReg_, final Dist dDist_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		dReg = dReg_;


		dDist = dDist_;

		}


	}
