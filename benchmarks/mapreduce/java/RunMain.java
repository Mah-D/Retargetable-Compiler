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

 
//public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(Program.MAX_PLACES);
//public static final HashMap globalPointerHashMap = new HashMap(Program.MAX_PLACES);
 //static {for(int i =0; i <Program.MAX_PLACES+1; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}
 //static {for(int i =0; i <Program.MAX_PLACES+1; ++i){globalPointerHashMap.put(i, new HashSet());}}


 
public static final Region1 _MR_r = Program._MR_r_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES-1; }else{ x = x-1; } return x;}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);

		final MR X10_TEMP4 = new MR(myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(X10_TEMP4.hashCode());

		Program.MR_run(X10_TEMP4,myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP7 = "Wall-clock time for mapreduce: ";


		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " secs";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		System.out.println(X10_TEMP12);
		}
public static Region1 _MR_r_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP3 = 0;


		final int X10_TEMP4 = 300000;


		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);

		return X10_TEMP6;
		}
public static void MR_run ( final MR X10_TEMP0, int myUniquePlacePoint)
		{
		Program.MR_map(X10_TEMP0,myUniquePlacePoint);
		Program.MR_reduce(X10_TEMP0,myUniquePlacePoint);

		final int X10_TEMP2 = X10_TEMP0.total;


		final String X10_TEMP4 = "";


		final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;

		System.out.println(X10_TEMP3);
		}
public static void MR_map ( final MR X10_TEMP0, int myUniquePlacePoint)
		{

		final intRefArray1 b = X10_TEMP0.a;

		/*FINISH
*/			{

			final Dist1 RX10_TEMP1 = b.distValue;


			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;


			final int RX10_TEMP5 = 1;


			int RX10_TEMP3 = RX10_TEMP2.regSize;


			RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5;


			final int  RX10_TEMP4 = RX10_TEMP3+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP4; RX10_TEMP0++)
				{

				final int RX10_TEMP6 = RX10_TEMP0;


				final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP2, RX10_TEMP6,myUniquePlacePoint);


				final Dist1 RX10_TEMP7 = b.distValue;


				final Dist1 X10_TEMP3 = RX10_TEMP7;


				final Region1 RX10_TEMP8 = X10_TEMP3.dReg;


				final int RX10_TEMP9 = Program.searchPointInRegion1(RX10_TEMP8, p,myUniquePlacePoint);


				final int RX10_TEMP10 = 0;


				final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10;

				if(RX10_TEMP11)
					{

					final String RX10_TEMP12 = "Point p not found in the distribution X10_TEMP3.";

					throw new RuntimeException(RX10_TEMP12);

					}

				final int RX10_TEMP13 = Program.getPlaceFromDist1(X10_TEMP3, RX10_TEMP9,myUniquePlacePoint);


				final int X10_TEMP4 = RX10_TEMP13;


				final T1 utmp1 = new T1(p, b, X10_TEMP0,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp1.hashCode());

				//async(X10_TEMP4)
					{
					Program.thread1(utmp1,X10_TEMP4);
					}
				}
			}
		}
public static int MR_f ( final MR X10_TEMP0, final int x, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = x * x;

		return X10_TEMP2;
		}
public static void MR_reduce ( final MR X10_TEMP0, int myUniquePlacePoint)
		{

		final int h = 0;


		final intRefArray1 X10_TEMP2 = X10_TEMP0.a;


		final Dist1 RX10_TEMP0 = X10_TEMP2.distValue;


		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;


		final Region1 reg = RX10_TEMP1;


		final int X10_TEMP4 = 0;


		final Dist1 dis = Program.getPlaceDist1(reg, X10_TEMP4,myUniquePlacePoint);


		final Region1 RX10_TEMP2 = dis.dReg;


		final int RX10_TEMP3 = 0;


		final int RX10_TEMP4 = 1;


		int RX10_TEMP5 = Program.MAX_PLACES;


		RX10_TEMP5 = RX10_TEMP5 - RX10_TEMP4;


		final int  RX10_TEMP6 = RX10_TEMP5+1;


		final int RX10_TEMP7 = RX10_TEMP5+1;


		final intStub[] RX10_TEMP8 = new intStub[RX10_TEMP7];

		/*FINISH
*/			{
			for(int RX10_TEMP9=0; RX10_TEMP9 < RX10_TEMP6; RX10_TEMP9++)
				{

				final int RX10_TEMP10 = 0;


				final int RX10_TEMP11 = RX10_TEMP9;


				final int RX10_TEMP12 = RX10_TEMP11;


				final int RX10_TEMP13 = Program.getDistLocalCount1(dis, RX10_TEMP11,myUniquePlacePoint);


				final int RX10_TEMP14 = RX10_TEMP13 - RX10_TEMP4;


				final T2 utmp2 = new T2(RX10_TEMP14, RX10_TEMP10, RX10_TEMP9, RX10_TEMP8,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp2.hashCode());

				//async(RX10_TEMP12)
					{
					Program.thread2(utmp2,RX10_TEMP12);
					}
				}
			}

		final intStub[] RX10_TEMP18 = (intStub[])(new intStub/*value*/[RX10_TEMP6]);
/*arrayInitBlock*/
for(int RX10_TEMP20= 0;RX10_TEMP20 <RX10_TEMP18.length ;RX10_TEMP20++ )			{

			final intStub RX10_TEMP19 = RX10_TEMP8[RX10_TEMP20];

			RX10_TEMP18[RX10_TEMP20] =RX10_TEMP19;
			}

;


		final intRefArray1 RX10_TEMP21 = new intRefArray1(dis, RX10_TEMP18,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP21.hashCode());


		final intRefArray1 result = RX10_TEMP21;


		final intRefArray1 X10_TEMP8 = X10_TEMP0.a;


		final Dist1 RX10_TEMP23 = X10_TEMP8.distValue;


		final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;


		final int RX10_TEMP27 = 1;


		int RX10_TEMP25 = RX10_TEMP24.regSize;


		RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27;


		final int  RX10_TEMP26 = RX10_TEMP25+1;

		for(int RX10_TEMP22=0; RX10_TEMP22 < RX10_TEMP26; RX10_TEMP22++)
			{

			final int RX10_TEMP28 = RX10_TEMP22;


			final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP24, RX10_TEMP28,myUniquePlacePoint);

			/*FINISH
*/				{

				final intRefArray1 c = X10_TEMP0.a;


				final intRefArray1 X10_TEMP10 = X10_TEMP0.a;


				final Dist1 RX10_TEMP29 = X10_TEMP10.distValue;


				final Dist1 X10_TEMP11 = RX10_TEMP29;


				final Region1 RX10_TEMP30 = X10_TEMP11.dReg;


				final int RX10_TEMP31 = Program.searchPointInRegion1(RX10_TEMP30, p,myUniquePlacePoint);


				final int RX10_TEMP32 = 0;


				final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;

				if(RX10_TEMP33)
					{

					final String RX10_TEMP34 = "Point p not found in the distribution X10_TEMP11.";

					throw new RuntimeException(RX10_TEMP34);

					}

				final int RX10_TEMP35 = Program.getPlaceFromDist1(X10_TEMP11, RX10_TEMP31,myUniquePlacePoint);


				final int X10_TEMP14 = RX10_TEMP35;


				final T3 utmp3 = new T3(c, p, result, h,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp3.hashCode());

				//async(X10_TEMP14)
					{
					Program.thread3(utmp3,X10_TEMP14);
					}
				}
			}

		final Dist1 RX10_TEMP58 = result.distValue;


		final Region1 RX10_TEMP59 = RX10_TEMP58.dReg;


		final int RX10_TEMP62 = 1;


		int RX10_TEMP60 = RX10_TEMP59.regSize;


		RX10_TEMP60 = RX10_TEMP60 - RX10_TEMP62;


		final int  RX10_TEMP61 = RX10_TEMP60+1;

		for(int RX10_TEMP57=0; RX10_TEMP57 < RX10_TEMP61; RX10_TEMP57++)
			{

			final int RX10_TEMP63 = RX10_TEMP57;


			final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP59, RX10_TEMP63,myUniquePlacePoint);


			final int X10_TEMP24 = X10_TEMP0.total;


			final Dist1 RX10_TEMP64 = result.distValue;


			final Region1 RX10_TEMP65 = RX10_TEMP64.dReg;


			final int RX10_TEMP66 = Program.searchPointInRegion1(RX10_TEMP65, p,myUniquePlacePoint);


			final int RX10_TEMP67 = 0;


			final boolean RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67;

			if(RX10_TEMP68)
				{

				String RX10_TEMP69 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP69);

				}

			final int RX10_TEMP70 = Program.getPlaceFromDist1(RX10_TEMP64, RX10_TEMP66,myUniquePlacePoint);


			final int RX10_TEMP72 = 0;


			final boolean RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72;

			if(RX10_TEMP73)
				{

				String RX10_TEMP71 = "Bad place access for array result";

				throw new RuntimeException(RX10_TEMP71);

				}

			final int RX10_TEMP74 = Program.getRefArrayValue1int(result, RX10_TEMP66,myUniquePlacePoint);


			final int X10_TEMP25 = RX10_TEMP74;


			final int X10_TEMP28 = X10_TEMP24 + X10_TEMP25;


			final int X10_TEMP29 = X10_TEMP28;

						//if(!((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).contains(X10_TEMP0.hashCode())){
			//throw new RuntimeException("Object in wrong place");
			//}
			X10_TEMP0.total = (X10_TEMP29);
			}
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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP0.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP0.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP12.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP23.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP35.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP46.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP58.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP70.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP0.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP0.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP11.hashCode());


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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP22.hashCode());


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
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(pointDist1.hashCode());


			final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retDist.hashCode());

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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(pointDist1.hashCode());


		final Dist1 retDist = new Dist1(r, pointDist1,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retDist.hashCode());

		return retDist;
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
public static int getPlaceFromDist1 ( final Dist1 dn, final int index, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int retPlace = placeArray[index];

		return retPlace;
		}
public static Point1[] getDistLocalArray1 ( final Dist1 dn, final int placeIndex, int myUniquePlacePoint)
		{

		final Region1 r = dn.dReg;


		final Point1[] pointArray = r.pointArray;


		final int rSize = r.regSize;


		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int one = 1;


		final int currPlace = placeIndex;


		final int[] counts = d.counts;


		final int localCount = counts[placeIndex];


		final int localCountMinusOne = localCount - one;


		final int rSizeMinusOne = rSize - one;


		final int  localRegion = localCountMinusOne+1;


		final int  placeRegion = rSizeMinusOne+1;


		final int localDist = localCountMinusOne+1;


		final Point1[] tempPointArray = new Point1[localDist];


		int tempCount = 0;

		for(int p=0; p < placeRegion; p++)
			{

			final int pl = placeArray[p];


			final boolean cond = pl == currPlace;

			if(cond)
				{

				final Point1 tempPoint = pointArray[p];

				tempPointArray[tempCount] = tempPoint;

				tempCount = tempCount + one;

				}
			}

		final Point1[] vPointArray = (Point1[])(new Point1/*value*/[localRegion]);
/*arrayInitBlock*/
for(int p= 0;p <vPointArray.length ;p++ )			{

			final Point1 tempPoint = tempPointArray[p];

			vPointArray[p] =tempPoint;
			}

;

		return vPointArray;
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
public static int getRefArrayValue1int ( final intRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final intStub[] contents = array.contents;


		final intStub indexStub = contents[placeIndex];


		final int[] localArray = indexStub.localArray;


		final int returnValue = localArray[localIndex];

		return returnValue;
		}
public static int getDistLocalCount1 ( final Dist1 dn, final int placeIndex, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] counts = d.counts;


		final int localCount = counts[placeIndex];

		return localCount;
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
public static Point1 regionOrdinalPoint1 ( final Region1 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point1[] pointArray = reg.pointArray;


		final Point1 pt = pointArray[ordl];

		return pt;
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
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(pointDist.hashCode());


		final Dist1 retDist = new Dist1(r, pointDist,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retDist.hashCode());

		return retDist;
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
public static void setRefArrayValue1int ( final intRefArray1 array, final int index, final int val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final intStub[] contents = array.contents;


		final intStub indexStub = contents[placeIndex];


		final int[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
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
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region1 retReg = new Region1(ptArray,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(retReg.hashCode());

		return retReg;
		}
public static void thread1 ( final T1 utmpz, int myUniquePlacePoint)
		{

		final Point1 p = utmpz.p;


		final intRefArray1 b = utmpz.b;


		final MR X10_TEMP0 = utmpz.X10_TEMP0;

			{

			final Dist1 RX10_TEMP14 = b.distValue;


			final Region1 RX10_TEMP15 = RX10_TEMP14.dReg;


			final int RX10_TEMP16 = Program.searchPointInRegion1(RX10_TEMP15, p,myUniquePlacePoint);


			final int RX10_TEMP17 = 0;


			final boolean RX10_TEMP18 = RX10_TEMP16 < RX10_TEMP17;

			if(RX10_TEMP18)
				{

				String RX10_TEMP19 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP19);

				}

			final int RX10_TEMP20 = Program.getPlaceFromDist1(RX10_TEMP14, RX10_TEMP16,myUniquePlacePoint);


			final int RX10_TEMP22 = 0;


			final boolean RX10_TEMP23 = RX10_TEMP20 != RX10_TEMP22;

			if(RX10_TEMP23)
				{

				String RX10_TEMP21 = "Bad place access for array b";

				throw new RuntimeException(RX10_TEMP21);

				}

			final int RX10_TEMP24 = Program.getRefArrayValue1int(b, RX10_TEMP16,myUniquePlacePoint);


			final int X10_TEMP8 = RX10_TEMP24;


			final int X10_TEMP11 = Program.MR_f(X10_TEMP0, X10_TEMP8,myUniquePlacePoint);


			final int X10_TEMP12 = X10_TEMP11;


			final Dist1 RX10_TEMP25 = b.distValue;


			final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;


			final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, p,myUniquePlacePoint);


			final int RX10_TEMP28 = 0;


			final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;

			if(RX10_TEMP29)
				{

				String RX10_TEMP30 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP30);

				}

			final int RX10_TEMP31 = Program.getPlaceFromDist1(RX10_TEMP25, RX10_TEMP27,myUniquePlacePoint);


			final int RX10_TEMP33 = 0;


			final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;

			if(RX10_TEMP34)
				{

				String RX10_TEMP32 = "Bad place access for array b";

				throw new RuntimeException(RX10_TEMP32);

				}
			Program.setRefArrayValue1int(b, RX10_TEMP27, X10_TEMP12,myUniquePlacePoint);
			}
		}
public static void thread2 ( final T2 utmpz, int myUniquePlacePoint)
		{

		final int RX10_TEMP14 = utmpz.RX10_TEMP14;


		final int RX10_TEMP10 = utmpz.RX10_TEMP10;


		final int RX10_TEMP9 = utmpz.RX10_TEMP9;


		final intStub[] RX10_TEMP8 = utmpz.RX10_TEMP8;

			{

			final int RX10_TEMP15 = RX10_TEMP14+1;


			final int[] RX10_TEMP16 = new int[RX10_TEMP15];


			final intStub RX10_TEMP17 = new intStub(RX10_TEMP16,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP17.hashCode());


			final T8 utmp8 = new T8(RX10_TEMP17, RX10_TEMP9, RX10_TEMP8,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp8.hashCode());

			//async(RX10_TEMP10)
				{
				Program.thread8(utmp8,RX10_TEMP10);
				}
			}
		}
public static void thread3 ( final T3 utmpz, int myUniquePlacePoint)
		{

		final intRefArray1 c = utmpz.c;


		final Point1 p = utmpz.p;


		final intRefArray1 result = utmpz.result;


		final int h = utmpz.h;

			{

			final Dist1 RX10_TEMP36 = c.distValue;


			final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;


			final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37, p,myUniquePlacePoint);


			final int RX10_TEMP39 = 0;


			final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39;

			if(RX10_TEMP40)
				{

				String RX10_TEMP41 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP41);

				}

			final int RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36, RX10_TEMP38,myUniquePlacePoint);


			final int RX10_TEMP44 = 0;


			final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44;

			if(RX10_TEMP45)
				{

				String RX10_TEMP43 = "Bad place access for array c";

				throw new RuntimeException(RX10_TEMP43);

				}

			final int RX10_TEMP46 = Program.getRefArrayValue1int(c, RX10_TEMP38,myUniquePlacePoint);


			final int v = RX10_TEMP46;


			final T9 utmp9 = new T9(v, p, result,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp9.hashCode());

			//async(h)
				{
				Program.thread9(utmp9,h);
				}
			}
		}
public static void thread8 ( final T8 utmpz, int myUniquePlacePoint)
		{

		final intStub RX10_TEMP17 = utmpz.RX10_TEMP17;


		final int RX10_TEMP9 = utmpz.RX10_TEMP9;


		final intStub[] RX10_TEMP8 = utmpz.RX10_TEMP8;

			{
			RX10_TEMP8[RX10_TEMP9] = RX10_TEMP17;
			}
		}
public static void thread9 ( final T9 utmpz, int myUniquePlacePoint)
		{

		final int v = utmpz.v;


		final Point1 p = utmpz.p;


		final intRefArray1 result = utmpz.result;

			{

			final int X10_TEMP21 = v;


			final Dist1 RX10_TEMP47 = result.distValue;


			final Region1 RX10_TEMP48 = RX10_TEMP47.dReg;


			final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, p,myUniquePlacePoint);


			final int RX10_TEMP50 = 0;


			final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;

			if(RX10_TEMP51)
				{

				String RX10_TEMP52 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP52);

				}

			final int RX10_TEMP53 = Program.getPlaceFromDist1(RX10_TEMP47, RX10_TEMP49,myUniquePlacePoint);


			final int RX10_TEMP55 = 0;


			final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55;

			if(RX10_TEMP56)
				{

				String RX10_TEMP54 = "Bad place access for array result";

				throw new RuntimeException(RX10_TEMP54);

				}
			Program.setRefArrayValue1int(result, RX10_TEMP49, X10_TEMP21,myUniquePlacePoint);
			}
		}

}
	/*value*/ class T1 
	 {
 
	public final Point1 p;
	public final intRefArray1 b;
	public final MR X10_TEMP0;


	public T1 ( final Point1 a_p, final intRefArray1 a_b, final MR a_X10_TEMP0, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		p = a_p;


		b = a_b;


		X10_TEMP0 = a_X10_TEMP0;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T2 
	 {
 
	public final int RX10_TEMP14;
	public final int RX10_TEMP10;
	public final int RX10_TEMP9;
	public final intStub[] RX10_TEMP8;


	public T2 ( final int a_RX10_TEMP14, final int a_RX10_TEMP10, final int a_RX10_TEMP9, final intStub[] a_RX10_TEMP8, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP14 = a_RX10_TEMP14;


		RX10_TEMP10 = a_RX10_TEMP10;


		RX10_TEMP9 = a_RX10_TEMP9;


		RX10_TEMP8 = a_RX10_TEMP8;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T3 
	 {
 
	public final intRefArray1 c;
	public final Point1 p;
	public final intRefArray1 result;
	public final int h;


	public T3 ( final intRefArray1 a_c, final Point1 a_p, final intRefArray1 a_result, final int a_h, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		c = a_c;


		p = a_p;


		result = a_result;


		h = a_h;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T4 
	 {
 
	public final Point1[] RX10_TEMP13;
	public final int RX10_TEMP12;
	public final int RX10_TEMP8;
	public final int RX10_TEMP7;
	public final intStub[] RX10_TEMP6;


	public T4 ( final Point1[] a_RX10_TEMP13, final int a_RX10_TEMP12, final int a_RX10_TEMP8, final int a_RX10_TEMP7, final intStub[] a_RX10_TEMP6, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP13 = a_RX10_TEMP13;


		RX10_TEMP12 = a_RX10_TEMP12;


		RX10_TEMP8 = a_RX10_TEMP8;


		RX10_TEMP7 = a_RX10_TEMP7;


		RX10_TEMP6 = a_RX10_TEMP6;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T5 
	 {
 
	public final int RX10_TEMP12;
	public final int RX10_TEMP8;
	public final int RX10_TEMP7;
	public final doubleStub[] RX10_TEMP6;


	public T5 ( final int a_RX10_TEMP12, final int a_RX10_TEMP8, final int a_RX10_TEMP7, final doubleStub[] a_RX10_TEMP6, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP12 = a_RX10_TEMP12;


		RX10_TEMP8 = a_RX10_TEMP8;


		RX10_TEMP7 = a_RX10_TEMP7;


		RX10_TEMP6 = a_RX10_TEMP6;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T6 
	 {
 
	public final int RX10_TEMP33;
	public final int RX10_TEMP29;
	public final int RX10_TEMP28;
	public final doubleStub[] RX10_TEMP27;


	public T6 ( final int a_RX10_TEMP33, final int a_RX10_TEMP29, final int a_RX10_TEMP28, final doubleStub[] a_RX10_TEMP27, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP33 = a_RX10_TEMP33;


		RX10_TEMP29 = a_RX10_TEMP29;


		RX10_TEMP28 = a_RX10_TEMP28;


		RX10_TEMP27 = a_RX10_TEMP27;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T7 
	 {
 
	public final int RX10_TEMP54;
	public final int RX10_TEMP50;
	public final int RX10_TEMP49;
	public final doubleStub[] RX10_TEMP48;


	public T7 ( final int a_RX10_TEMP54, final int a_RX10_TEMP50, final int a_RX10_TEMP49, final doubleStub[] a_RX10_TEMP48, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP54 = a_RX10_TEMP54;


		RX10_TEMP50 = a_RX10_TEMP50;


		RX10_TEMP49 = a_RX10_TEMP49;


		RX10_TEMP48 = a_RX10_TEMP48;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T8 
	 {
 
	public final intStub RX10_TEMP17;
	public final int RX10_TEMP9;
	public final intStub[] RX10_TEMP8;


	public T8 ( final intStub a_RX10_TEMP17, final int a_RX10_TEMP9, final intStub[] a_RX10_TEMP8, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP17 = a_RX10_TEMP17;


		RX10_TEMP9 = a_RX10_TEMP9;


		RX10_TEMP8 = a_RX10_TEMP8;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T9 
	 {
 
	public final int v;
	public final Point1 p;
	public final intRefArray1 result;


	public T9 ( final int a_v, final Point1 a_p, final intRefArray1 a_result, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		v = a_v;


		p = a_p;


		result = a_result;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T10 
	 {
 
	public final intStub RX10_TEMP17;
	public final int RX10_TEMP7;
	public final intStub[] RX10_TEMP6;


	public T10 ( final intStub a_RX10_TEMP17, final int a_RX10_TEMP7, final intStub[] a_RX10_TEMP6, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP17 = a_RX10_TEMP17;


		RX10_TEMP7 = a_RX10_TEMP7;


		RX10_TEMP6 = a_RX10_TEMP6;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T11 
	 {
 
	public final doubleStub RX10_TEMP16;
	public final int RX10_TEMP7;
	public final doubleStub[] RX10_TEMP6;


	public T11 ( final doubleStub a_RX10_TEMP16, final int a_RX10_TEMP7, final doubleStub[] a_RX10_TEMP6, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP16 = a_RX10_TEMP16;


		RX10_TEMP7 = a_RX10_TEMP7;


		RX10_TEMP6 = a_RX10_TEMP6;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T12 
	 {
 
	public final doubleStub RX10_TEMP37;
	public final int RX10_TEMP28;
	public final doubleStub[] RX10_TEMP27;


	public T12 ( final doubleStub a_RX10_TEMP37, final int a_RX10_TEMP28, final doubleStub[] a_RX10_TEMP27, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP37 = a_RX10_TEMP37;


		RX10_TEMP28 = a_RX10_TEMP28;


		RX10_TEMP27 = a_RX10_TEMP27;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class T13 
	 {
 
	public final doubleStub RX10_TEMP58;
	public final int RX10_TEMP49;
	public final doubleStub[] RX10_TEMP48;


	public T13 ( final doubleStub a_RX10_TEMP58, final int a_RX10_TEMP49, final doubleStub[] a_RX10_TEMP48, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		RX10_TEMP58 = a_RX10_TEMP58;


		RX10_TEMP49 = a_RX10_TEMP49;


		RX10_TEMP48 = a_RX10_TEMP48;

		}


public String toString (  int myUniquePlacePoint)
		{

		final String s = "";

		return s;
		}
	}
	/*value*/ class doubleRefArray1 
	 {
 
	public final Dist1 distValue;
	public final doubleStub[] contents;


	public doubleRefArray1 ( final Dist1 distValue_, final doubleStub[] contents_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		f0 = f0_;

		}


	}
	/*value*/ class Dist1 
	 {
 
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		dReg = dReg_;


		dDist = dDist_;

		}


	}
	/*value*/ class intStub 
	 {
 
	public final int[] localArray;


	public intStub ( final int[] localArray_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class Dist 
	 {
 
	public final int[] placeArray;
	public final int[] counts;
	public final int[] runningSum;


	public Dist ( final int[] vPlaceArray, final int arraySize, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

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

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());
			tempCounts[p] = zero;
			}
		for(int p=0; p < arrayReg; p++)
			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

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
	class Timer   {
 
	public doubleRefArray1 start_time;
	public doubleRefArray1 elapsed_time;
	public doubleRefArray1 total_time;


	public Timer (  int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

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

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(d, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;


				final T5 utmp5 = new T5(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp5.hashCode());

				//async(RX10_TEMP10)
					{

					//((HashSet)Program.globalPointerHashMap.get(RX10_TEMP10)).add(this.hashCode());
					this.thread5(utmp5,RX10_TEMP10);
					}
				}
			}

		final doubleStub[] RX10_TEMP17 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP17.length ;RX10_TEMP19++ )			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];

			RX10_TEMP17[RX10_TEMP19] =RX10_TEMP18;
			}

;


		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(d, RX10_TEMP17,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP20.hashCode());


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

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());
			for(int RX10_TEMP28=0; RX10_TEMP28 < RX10_TEMP25; RX10_TEMP28++)
				{

				//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

				final int RX10_TEMP29 = 0;


				final int RX10_TEMP30 = RX10_TEMP28;


				final int RX10_TEMP31 = RX10_TEMP30;


				final int RX10_TEMP32 = Program.getDistLocalCount1(d, RX10_TEMP30,myUniquePlacePoint);


				final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23;


				final T6 utmp6 = new T6(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp6.hashCode());

				//async(RX10_TEMP31)
					{

					//((HashSet)Program.globalPointerHashMap.get(RX10_TEMP31)).add(this.hashCode());
					this.thread6(utmp6,RX10_TEMP31);
					}
				}
			}

		final doubleStub[] RX10_TEMP38 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP25]);
/*arrayInitBlock*/
for(int RX10_TEMP40= 0;RX10_TEMP40 <RX10_TEMP38.length ;RX10_TEMP40++ )			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

			final doubleStub RX10_TEMP39 = RX10_TEMP27[RX10_TEMP40];

			RX10_TEMP38[RX10_TEMP40] =RX10_TEMP39;
			}

;


		final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1(d, RX10_TEMP38,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP41.hashCode());


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

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());
			for(int RX10_TEMP49=0; RX10_TEMP49 < RX10_TEMP46; RX10_TEMP49++)
				{

				//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

				final int RX10_TEMP50 = 0;


				final int RX10_TEMP51 = RX10_TEMP49;


				final int RX10_TEMP52 = RX10_TEMP51;


				final int RX10_TEMP53 = Program.getDistLocalCount1(d, RX10_TEMP51,myUniquePlacePoint);


				final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44;


				final T7 utmp7 = new T7(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp7.hashCode());

				//async(RX10_TEMP52)
					{

					//((HashSet)Program.globalPointerHashMap.get(RX10_TEMP52)).add(this.hashCode());
					this.thread7(utmp7,RX10_TEMP52);
					}
				}
			}

		final doubleStub[] RX10_TEMP59 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP46]);
/*arrayInitBlock*/
for(int RX10_TEMP61= 0;RX10_TEMP61 <RX10_TEMP59.length ;RX10_TEMP61++ )			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

			final doubleStub RX10_TEMP60 = RX10_TEMP48[RX10_TEMP61];

			RX10_TEMP59[RX10_TEMP61] =RX10_TEMP60;
			}

;


		final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1(d, RX10_TEMP59,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP62.hashCode());


		final doubleRefArray1 X10_TEMP19 = RX10_TEMP62;


		total_time = X10_TEMP19;

		}


public void thread5 ( final T5 utmpz, int myUniquePlacePoint)
		{

		final int RX10_TEMP12 = utmpz.RX10_TEMP12;


		final int RX10_TEMP8 = utmpz.RX10_TEMP8;


		final int RX10_TEMP7 = utmpz.RX10_TEMP7;


		final doubleStub[] RX10_TEMP6 = utmpz.RX10_TEMP6;

			{

			final int RX10_TEMP14 = RX10_TEMP12+1;


			final double[] RX10_TEMP15 = new double/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )				{

				final double X10_TEMP9 = 0;

				RX10_TEMP15[RX10_TEMP13] =X10_TEMP9;
				}

;


			final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP16.hashCode());


			final T11 utmp11 = new T11(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp11.hashCode());

			//async(RX10_TEMP8)
				{
				this.thread11(utmp11,RX10_TEMP8);
				}
			}
		}
public void thread6 ( final T6 utmpz, int myUniquePlacePoint)
		{

		final int RX10_TEMP33 = utmpz.RX10_TEMP33;


		final int RX10_TEMP29 = utmpz.RX10_TEMP29;


		final int RX10_TEMP28 = utmpz.RX10_TEMP28;


		final doubleStub[] RX10_TEMP27 = utmpz.RX10_TEMP27;

			{

			final int RX10_TEMP35 = RX10_TEMP33+1;


			final double[] RX10_TEMP36 = new double/*NewUpdatableArray*/[RX10_TEMP35];
/*arrayInitBlock*/
for(int RX10_TEMP34= 0;RX10_TEMP34 <RX10_TEMP36.length ;RX10_TEMP34++ )				{

				final double X10_TEMP13 = 0;

				RX10_TEMP36[RX10_TEMP34] =X10_TEMP13;
				}

;


			final doubleStub RX10_TEMP37 = new doubleStub(RX10_TEMP36,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP37.hashCode());


			final T12 utmp12 = new T12(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp12.hashCode());

			//async(RX10_TEMP29)
				{
				this.thread12(utmp12,RX10_TEMP29);
				}
			}
		}
public void thread7 ( final T7 utmpz, int myUniquePlacePoint)
		{

		final int RX10_TEMP54 = utmpz.RX10_TEMP54;


		final int RX10_TEMP50 = utmpz.RX10_TEMP50;


		final int RX10_TEMP49 = utmpz.RX10_TEMP49;


		final doubleStub[] RX10_TEMP48 = utmpz.RX10_TEMP48;

			{

			final int RX10_TEMP56 = RX10_TEMP54+1;


			final double[] RX10_TEMP57 = new double/*NewUpdatableArray*/[RX10_TEMP56];
/*arrayInitBlock*/
for(int RX10_TEMP55= 0;RX10_TEMP55 <RX10_TEMP57.length ;RX10_TEMP55++ )				{

				final double X10_TEMP17 = 0;

				RX10_TEMP57[RX10_TEMP55] =X10_TEMP17;
				}

;


			final doubleStub RX10_TEMP58 = new doubleStub(RX10_TEMP57,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP58.hashCode());


			final T13 utmp13 = new T13(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp13.hashCode());

			//async(RX10_TEMP50)
				{
				this.thread13(utmp13,RX10_TEMP50);
				}
			}
		}
public void thread11 ( final T11 utmpz, int myUniquePlacePoint)
		{

		final doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;


		final int RX10_TEMP7 = utmpz.RX10_TEMP7;


		final doubleStub[] RX10_TEMP6 = utmpz.RX10_TEMP6;

			{
			RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
			}
		}
public void thread12 ( final T12 utmpz, int myUniquePlacePoint)
		{

		final doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;


		final int RX10_TEMP28 = utmpz.RX10_TEMP28;


		final doubleStub[] RX10_TEMP27 = utmpz.RX10_TEMP27;

			{
			RX10_TEMP27[RX10_TEMP28] = RX10_TEMP37;
			}
		}
public void thread13 ( final T13 utmpz, int myUniquePlacePoint)
		{

		final doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;


		final int RX10_TEMP49 = utmpz.RX10_TEMP49;


		final doubleStub[] RX10_TEMP48 = utmpz.RX10_TEMP48;

			{
			RX10_TEMP48[RX10_TEMP49] = RX10_TEMP58;
			}
		}

}
	/*value*/ class intRefArray1 
	 {
 
	public final Dist1 distValue;
	public final intStub[] contents;


	public intRefArray1 ( final Dist1 distValue_, final intStub[] contents_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

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

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

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

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		regRank = 1;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;

		}


	}
	class MR   {
 
	public intRefArray1 a;
	public int total;


	public MR (  int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		final Region1 X10_TEMP2 = Program._MR_r;


		final Dist1 X10_TEMP3 = Program.getBlockDist1(X10_TEMP2,myUniquePlacePoint);


		final Dist1 d = X10_TEMP3;


		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final intStub[] RX10_TEMP6 = new intStub[RX10_TEMP5];

		/*FINISH
*/			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(d, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;


				final Point1[] RX10_TEMP13 = Program.getDistLocalArray1(d, RX10_TEMP9,myUniquePlacePoint);


				final T4 utmp4 = new T4(RX10_TEMP13, RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6,myUniquePlacePoint);
				
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp4.hashCode());

				//async(RX10_TEMP10)
					{

					//((HashSet)Program.globalPointerHashMap.get(RX10_TEMP10)).add(this.hashCode());
					this.thread4(utmp4,RX10_TEMP10);
					}
				}
			}

		final intStub[] RX10_TEMP18 = (intStub[])(new intStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP20= 0;RX10_TEMP20 <RX10_TEMP18.length ;RX10_TEMP20++ )			{

			//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

			final intStub RX10_TEMP19 = RX10_TEMP6[RX10_TEMP20];

			RX10_TEMP18[RX10_TEMP20] =RX10_TEMP19;
			}

;


		final intRefArray1 RX10_TEMP21 = new intRefArray1(d, RX10_TEMP18,myUniquePlacePoint);
		
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP21.hashCode());


		final intRefArray1 X10_TEMP9 = RX10_TEMP21;


		a = X10_TEMP9;


		final int X10_TEMP11 = 0;


		total = X10_TEMP11;

		}


public void thread4 ( final T4 utmpz, int myUniquePlacePoint)
		{

		final Point1[] RX10_TEMP13 = utmpz.RX10_TEMP13;


		final int RX10_TEMP12 = utmpz.RX10_TEMP12;


		final int RX10_TEMP8 = utmpz.RX10_TEMP8;


		final int RX10_TEMP7 = utmpz.RX10_TEMP7;


		final intStub[] RX10_TEMP6 = utmpz.RX10_TEMP6;

			{

			final int RX10_TEMP15 = RX10_TEMP12+1;


			final int[] RX10_TEMP16 = new int/*NewUpdatableArray*/[RX10_TEMP15];
/*arrayInitBlock*/
for(int RX10_TEMP14= 0;RX10_TEMP14 <RX10_TEMP16.length ;RX10_TEMP14++ )				{

				final Point1 p = RX10_TEMP13[RX10_TEMP14];


				final int X10_TEMP7 = p.f0;

				RX10_TEMP16[RX10_TEMP14] =X10_TEMP7;
				}

;


			final intStub RX10_TEMP17 = new intStub(RX10_TEMP16,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(RX10_TEMP17.hashCode());


			final T10 utmp10 = new T10(RX10_TEMP17, RX10_TEMP7, RX10_TEMP6,myUniquePlacePoint);
			
//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(utmp10.hashCode());

			//async(RX10_TEMP8)
				{
				this.thread10(utmp10,RX10_TEMP8);
				}
			}
		}
public void thread10 ( final T10 utmpz, int myUniquePlacePoint)
		{

		final intStub RX10_TEMP17 = utmpz.RX10_TEMP17;


		final int RX10_TEMP7 = utmpz.RX10_TEMP7;


		final intStub[] RX10_TEMP6 = utmpz.RX10_TEMP6;

			{
			RX10_TEMP6[RX10_TEMP7] = RX10_TEMP17;
			}
		}

}
	/*value*/ class doubleStub 
	 {
 
	public final double[] localArray;


	public doubleStub ( final double[] localArray_, int myUniquePlacePoint)
		{

		//((HashSet)Program.globalPointerHashMap.get(myUniquePlacePoint)).add(this.hashCode());

		localArray = localArray_;

		}


	}