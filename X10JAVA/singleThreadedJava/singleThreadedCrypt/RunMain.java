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

 
public static final int _IDEATest_array_rows = Program._IDEATest_array_rows_init(myUniquePlacePoint);
public static final long _Random_multiplier = Program._Random_multiplier_init(myUniquePlacePoint);
public static final long _Random_addend = Program._Random_addend_init(myUniquePlacePoint);
public static final long _Random_mask = Program._Random_mask_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES; }else{ x = x-1; } return x;}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);

		final IDEATest X10_TEMP4 = new IDEATest(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());

		Program.IDEATest_run(X10_TEMP4,myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP7 = "Wall-clock time for crypt: ";


		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " secs";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		System.out.println(X10_TEMP12);
		}
public static int _IDEATest_array_rows_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 32000;

		return X10_TEMP2;
		}
public static void IDEATest_run ( final IDEATest X10_TEMP0, int myUniquePlacePoint)
		{
		Program.IDEATest_kernel(X10_TEMP0,myUniquePlacePoint);
		Program.IDEATest_validate(X10_TEMP0,myUniquePlacePoint);
		}
public static void IDEATest_kernel ( final IDEATest X10_TEMP0, int myUniquePlacePoint)
		{
		Program.IDEATest_Do(X10_TEMP0,myUniquePlacePoint);
		}
public static void IDEATest_validate ( final IDEATest X10_TEMP0, int myUniquePlacePoint)
		{

		final byteRefArray1 p1 = X10_TEMP0.plain1;


		final byteRefArray1 c1 = X10_TEMP0.crypt1;


		final byteRefArray1 p2 = X10_TEMP0.plain2;

		/*FINISH
*/			{

			final byteRefArray1 X10_TEMP4 = X10_TEMP0.plain1;


			final Dist1 RX10_TEMP0 = X10_TEMP4.distValue;


			final Dist1 X10_TEMP6 = RX10_TEMP0;


			final Region1 RX10_TEMP2 = X10_TEMP6.dReg;


			final int RX10_TEMP5 = 1;


			int RX10_TEMP3 = RX10_TEMP2.regSize;


			RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5;


			final int  RX10_TEMP4 = RX10_TEMP3+1;

			for(int RX10_TEMP1=0; RX10_TEMP1 < RX10_TEMP4; RX10_TEMP1++)
				{

				final int RX10_TEMP6 = RX10_TEMP1;


				final Point1 pt = Program.regionOrdinalPoint1(RX10_TEMP2, RX10_TEMP6,myUniquePlacePoint);


				final Region1 RX10_TEMP7 = X10_TEMP6.dReg;


				final int RX10_TEMP8 = Program.searchPointInRegion1(RX10_TEMP7, pt,myUniquePlacePoint);


				final int RX10_TEMP9 = 0;


				final boolean RX10_TEMP10 = RX10_TEMP8 < RX10_TEMP9;

				if(RX10_TEMP10)
					{

					final String RX10_TEMP11 = "Point pt not found in the distribution X10_TEMP6.";

					throw new RuntimeException(RX10_TEMP11);

					}

				final int RX10_TEMP12 = Program.getPlaceFromDist1(X10_TEMP6, RX10_TEMP8,myUniquePlacePoint);


				final int X10_TEMP7 = RX10_TEMP12;

				//async(X10_TEMP7)
					{

					final Dist1 RX10_TEMP13 = p1.distValue;


					final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;


					final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, pt,X10_TEMP7);


					final int RX10_TEMP16 = 0;


					final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;

					if(RX10_TEMP17)
						{

						String RX10_TEMP18 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP18);

						}

					final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13, RX10_TEMP15,X10_TEMP7);


					final int RX10_TEMP21 = 0;


					final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;

					if(RX10_TEMP22)
						{

						String RX10_TEMP20 = "Bad place access for array p1";

						throw new RuntimeException(RX10_TEMP20);

						}

					final byte RX10_TEMP23 = Program.getRefArrayValue1byte(p1, RX10_TEMP15,X10_TEMP7);


					final byte X10_TEMP10 = (byte)RX10_TEMP23;


					final Dist1 RX10_TEMP24 = p2.distValue;


					final Region1 RX10_TEMP25 = RX10_TEMP24.dReg;


					final int RX10_TEMP26 = Program.searchPointInRegion1(RX10_TEMP25, pt,X10_TEMP7);


					final int RX10_TEMP27 = 0;


					final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27;

					if(RX10_TEMP28)
						{

						String RX10_TEMP29 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP29);

						}

					final int RX10_TEMP30 = Program.getPlaceFromDist1(RX10_TEMP24, RX10_TEMP26,X10_TEMP7);


					final int RX10_TEMP32 = 0;


					final boolean RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32;

					if(RX10_TEMP33)
						{

						String RX10_TEMP31 = "Bad place access for array p2";

						throw new RuntimeException(RX10_TEMP31);

						}

					final byte RX10_TEMP34 = Program.getRefArrayValue1byte(p2, RX10_TEMP26,X10_TEMP7);


					final byte X10_TEMP11 = (byte)RX10_TEMP34;


					final boolean X10_TEMP13 = X10_TEMP10 != X10_TEMP11;

					if(X10_TEMP13)
						{

						final String X10_TEMP15 = "Validation failed";

						System.out.println(X10_TEMP15);

						final String X10_TEMP16 = "Original Byte ";


						final String RX10_TEMP35 = Program.toStringPoint1(pt,X10_TEMP7);


						final String X10_TEMP17 = X10_TEMP16 + RX10_TEMP35;


						final String X10_TEMP18 = " = ";


						final String X10_TEMP20 = X10_TEMP17 + X10_TEMP18;


						final Dist1 RX10_TEMP36 = p1.distValue;


						final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;


						final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37, pt,X10_TEMP7);


						final int RX10_TEMP39 = 0;


						final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39;

						if(RX10_TEMP40)
							{

							String RX10_TEMP41 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP41);

							}

						final int RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36, RX10_TEMP38,X10_TEMP7);


						final int RX10_TEMP44 = 0;


						final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44;

						if(RX10_TEMP45)
							{

							String RX10_TEMP43 = "Bad place access for array p1";

							throw new RuntimeException(RX10_TEMP43);

							}

						final byte RX10_TEMP46 = Program.getRefArrayValue1byte(p1, RX10_TEMP38,X10_TEMP7);


						final byte X10_TEMP21 = (byte)RX10_TEMP46;


						final String X10_TEMP23 = X10_TEMP20 + X10_TEMP21;

						System.out.println(X10_TEMP23);

						final String X10_TEMP24 = "Encrypted Byte ";


						final String RX10_TEMP47 = Program.toStringPoint1(pt,X10_TEMP7);


						final String X10_TEMP25 = X10_TEMP24 + RX10_TEMP47;


						final String X10_TEMP26 = " = ";


						final String X10_TEMP28 = X10_TEMP25 + X10_TEMP26;


						final Dist1 RX10_TEMP48 = c1.distValue;


						final Region1 RX10_TEMP49 = RX10_TEMP48.dReg;


						final int RX10_TEMP50 = Program.searchPointInRegion1(RX10_TEMP49, pt,X10_TEMP7);


						final int RX10_TEMP51 = 0;


						final boolean RX10_TEMP52 = RX10_TEMP50 < RX10_TEMP51;

						if(RX10_TEMP52)
							{

							String RX10_TEMP53 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP53);

							}

						final int RX10_TEMP54 = Program.getPlaceFromDist1(RX10_TEMP48, RX10_TEMP50,X10_TEMP7);


						final int RX10_TEMP56 = 0;


						final boolean RX10_TEMP57 = RX10_TEMP54 != RX10_TEMP56;

						if(RX10_TEMP57)
							{

							String RX10_TEMP55 = "Bad place access for array c1";

							throw new RuntimeException(RX10_TEMP55);

							}

						final byte RX10_TEMP58 = Program.getRefArrayValue1byte(c1, RX10_TEMP50,X10_TEMP7);


						final byte X10_TEMP29 = (byte)RX10_TEMP58;


						final String X10_TEMP31 = X10_TEMP28 + X10_TEMP29;

						System.out.println(X10_TEMP31);

						final String X10_TEMP32 = "Decrypted Byte ";


						final String RX10_TEMP59 = Program.toStringPoint1(pt,X10_TEMP7);


						final String X10_TEMP33 = X10_TEMP32 + RX10_TEMP59;


						final String X10_TEMP34 = " = ";


						final String X10_TEMP36 = X10_TEMP33 + X10_TEMP34;


						final Dist1 RX10_TEMP60 = p2.distValue;


						final Region1 RX10_TEMP61 = RX10_TEMP60.dReg;


						final int RX10_TEMP62 = Program.searchPointInRegion1(RX10_TEMP61, pt,X10_TEMP7);


						final int RX10_TEMP63 = 0;


						final boolean RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63;

						if(RX10_TEMP64)
							{

							String RX10_TEMP65 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP65);

							}

						final int RX10_TEMP66 = Program.getPlaceFromDist1(RX10_TEMP60, RX10_TEMP62,X10_TEMP7);


						final int RX10_TEMP68 = 0;


						final boolean RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68;

						if(RX10_TEMP69)
							{

							String RX10_TEMP67 = "Bad place access for array p2";

							throw new RuntimeException(RX10_TEMP67);

							}

						final byte RX10_TEMP70 = Program.getRefArrayValue1byte(p2, RX10_TEMP62,X10_TEMP7);


						final byte X10_TEMP37 = (byte)RX10_TEMP70;


						final String X10_TEMP39 = X10_TEMP36 + X10_TEMP37;

						System.out.println(X10_TEMP39);

						final String X10_TEMP41 = "Validation failed";

						throw new RuntimeException(X10_TEMP41);

						}
					}
				}
			}
		}
public static void IDEATest_Do ( final IDEATest X10_TEMP0, int myUniquePlacePoint)
		{

		final byteRefArray1 p1 = X10_TEMP0.plain1;


		final byteRefArray1 c1 = X10_TEMP0.crypt1;


		final byteRefArray1 p2 = X10_TEMP0.plain2;


		final intValArray1 fzr = X10_TEMP0.ZR;


		final intValArray1 fdkr = X10_TEMP0.DKR;

		/*FINISH
*/			{

			final Dist1 X10_TEMP7 = Program.UniqueDistribution;


			final Region1 RX10_TEMP1 = X10_TEMP7.dReg;


			final int RX10_TEMP4 = 1;


			int RX10_TEMP2 = RX10_TEMP1.regSize;


			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;


			final int  RX10_TEMP3 = RX10_TEMP2+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3; RX10_TEMP0++)
				{

				final int RX10_TEMP5 = RX10_TEMP0;


				final Point1 pt = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5,myUniquePlacePoint);


				final Region1 RX10_TEMP6 = X10_TEMP7.dReg;


				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, pt,myUniquePlacePoint);


				final int RX10_TEMP8 = 0;


				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

				if(RX10_TEMP9)
					{

					final String RX10_TEMP10 = "Point pt not found in the distribution X10_TEMP7.";

					throw new RuntimeException(RX10_TEMP10);

					}

				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP7, RX10_TEMP7,myUniquePlacePoint);


				final int X10_TEMP8 = RX10_TEMP11;

				//async(X10_TEMP8)
					{
					Program.IDEATest_cipher_idea(X10_TEMP0, p1, c1, fzr,X10_TEMP8);
					Program.IDEATest_cipher_idea(X10_TEMP0, c1, p2, fdkr,X10_TEMP8);
					}
				}
			}
		}
public static void IDEATest_cipher_idea ( final IDEATest X10_TEMP0, final byteRefArray1 text1, final byteRefArray1 text2, final intValArray1 key, int myUniquePlacePoint)
		{

		final Dist1 RX10_TEMP0 = text1.distValue;


		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;


		final Region1 X10_TEMP1 = RX10_TEMP1;


		final int X10_TEMP6 = X10_TEMP1.regSize;


		final int X10_TEMP2 = 8;


		final int X10_TEMP3 = Program.MAX_PLACES;


		final int X10_TEMP5 = X10_TEMP2 * X10_TEMP3;


		final int X10_TEMP7 = X10_TEMP6 % X10_TEMP5;


		final int X10_TEMP8 = 0;


		final boolean X10_TEMP10 = X10_TEMP7 != X10_TEMP8;

		if(X10_TEMP10)
			{

			final String X10_TEMP12 = "Invalid number of places for the distribution size";

			throw new RuntimeException(X10_TEMP12);

			}

		final Dist1 RX10_TEMP2 = text1.distValue;


		final Dist1 X10_TEMP13 = RX10_TEMP2;


		final int X10_TEMP14 = 0;


		final Dist1 X10_TEMP16 = Program.restrictDist1(X10_TEMP13, X10_TEMP14,myUniquePlacePoint);


		final Region1 RX10_TEMP4 = X10_TEMP16.dReg;


		final int RX10_TEMP7 = 1;


		int RX10_TEMP5 = RX10_TEMP4.regSize;


		RX10_TEMP5 = RX10_TEMP5 - RX10_TEMP7;


		final int  RX10_TEMP6 = RX10_TEMP5+1;

		for(int RX10_TEMP3=0; RX10_TEMP3 < RX10_TEMP6; RX10_TEMP3++)
			{

			final int RX10_TEMP8 = RX10_TEMP3;


			final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP4, RX10_TEMP8,myUniquePlacePoint);


			final int X10_TEMP18 = i.f0;


			final int X10_TEMP19 = 8;


			final int X10_TEMP20 = X10_TEMP18 % X10_TEMP19;


			final int X10_TEMP21 = 0;


			final boolean X10_TEMP23 = X10_TEMP20 == X10_TEMP21;

			if(X10_TEMP23)
				{

				Point1 i1 = i;


				Point1 i2 = i;


				int ik = 0;


				int x1 = 0;


				int x2 = 0;


				int x3 = 0;


				int x4 = 0;


				int t1 = 0;


				int t2 = 0;


				int r = 0;


				final int X10_TEMP35 = 0;


				ik = X10_TEMP35;


				final int X10_TEMP37 = 8;


				r = X10_TEMP37;


				final Dist1 RX10_TEMP9 = text1.distValue;


				final Region1 RX10_TEMP10 = RX10_TEMP9.dReg;


				final int RX10_TEMP11 = Program.searchPointInRegion1(RX10_TEMP10, i1,myUniquePlacePoint);


				final int RX10_TEMP12 = 0;


				final boolean RX10_TEMP13 = RX10_TEMP11 < RX10_TEMP12;

				if(RX10_TEMP13)
					{

					String RX10_TEMP14 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP14);

					}

				final int RX10_TEMP15 = Program.getPlaceFromDist1(RX10_TEMP9, RX10_TEMP11,myUniquePlacePoint);


				final int RX10_TEMP17 = 0;


				final boolean RX10_TEMP18 = RX10_TEMP15 != RX10_TEMP17;

				if(RX10_TEMP18)
					{

					String RX10_TEMP16 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP16);

					}

				final byte RX10_TEMP19 = Program.getRefArrayValue1byte(text1, RX10_TEMP11,myUniquePlacePoint);


				final byte X10_TEMP39 = (byte)RX10_TEMP19;


				final int X10_TEMP40 = 0xff;


				final int X10_TEMP42 = X10_TEMP39 & X10_TEMP40;


				x1 = X10_TEMP42;


				int X10_TEMP44 = 1;


				int RX10_TEMP20 = i1.f0;


				RX10_TEMP20 = RX10_TEMP20 + X10_TEMP44;


				final Point1 X10_TEMP46 = new Point1(RX10_TEMP20,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP46.hashCode());


				i1 = X10_TEMP46;


				final Dist1 RX10_TEMP21 = text1.distValue;


				final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


				final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, i1,myUniquePlacePoint);


				final int RX10_TEMP24 = 0;


				final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;

				if(RX10_TEMP25)
					{

					String RX10_TEMP26 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP26);

					}

				final int RX10_TEMP27 = Program.getPlaceFromDist1(RX10_TEMP21, RX10_TEMP23,myUniquePlacePoint);


				final int RX10_TEMP29 = 0;


				final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;

				if(RX10_TEMP30)
					{

					String RX10_TEMP28 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP28);

					}

				final byte RX10_TEMP31 = Program.getRefArrayValue1byte(text1, RX10_TEMP23,myUniquePlacePoint);


				final byte X10_TEMP48 = (byte)RX10_TEMP31;


				final int X10_TEMP49 = 0xff;


				final int X10_TEMP51 = X10_TEMP48 & X10_TEMP49;


				final int X10_TEMP52 = 8;


				final int X10_TEMP53 = X10_TEMP51 << X10_TEMP52;


				final int X10_TEMP55 = x1 | X10_TEMP53;


				x1 = X10_TEMP55;


				int X10_TEMP57 = 1;


				int RX10_TEMP32 = i1.f0;


				RX10_TEMP32 = RX10_TEMP32 + X10_TEMP57;


				final Point1 X10_TEMP59 = new Point1(RX10_TEMP32,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP59.hashCode());


				i1 = X10_TEMP59;


				final Dist1 RX10_TEMP33 = text1.distValue;


				final Region1 RX10_TEMP34 = RX10_TEMP33.dReg;


				final int RX10_TEMP35 = Program.searchPointInRegion1(RX10_TEMP34, i1,myUniquePlacePoint);


				final int RX10_TEMP36 = 0;


				final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36;

				if(RX10_TEMP37)
					{

					String RX10_TEMP38 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP38);

					}

				final int RX10_TEMP39 = Program.getPlaceFromDist1(RX10_TEMP33, RX10_TEMP35,myUniquePlacePoint);


				final int RX10_TEMP41 = 0;


				final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41;

				if(RX10_TEMP42)
					{

					String RX10_TEMP40 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP40);

					}

				final byte RX10_TEMP43 = Program.getRefArrayValue1byte(text1, RX10_TEMP35,myUniquePlacePoint);


				final byte X10_TEMP61 = (byte)RX10_TEMP43;


				final int X10_TEMP62 = 0xff;


				final int X10_TEMP64 = X10_TEMP61 & X10_TEMP62;


				x2 = X10_TEMP64;


				int X10_TEMP66 = 1;


				int RX10_TEMP44 = i1.f0;


				RX10_TEMP44 = RX10_TEMP44 + X10_TEMP66;


				final Point1 X10_TEMP68 = new Point1(RX10_TEMP44,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP68.hashCode());


				i1 = X10_TEMP68;


				final Dist1 RX10_TEMP45 = text1.distValue;


				final Region1 RX10_TEMP46 = RX10_TEMP45.dReg;


				final int RX10_TEMP47 = Program.searchPointInRegion1(RX10_TEMP46, i1,myUniquePlacePoint);


				final int RX10_TEMP48 = 0;


				final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48;

				if(RX10_TEMP49)
					{

					String RX10_TEMP50 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP50);

					}

				final int RX10_TEMP51 = Program.getPlaceFromDist1(RX10_TEMP45, RX10_TEMP47,myUniquePlacePoint);


				final int RX10_TEMP53 = 0;


				final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53;

				if(RX10_TEMP54)
					{

					String RX10_TEMP52 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP52);

					}

				final byte RX10_TEMP55 = Program.getRefArrayValue1byte(text1, RX10_TEMP47,myUniquePlacePoint);


				final byte X10_TEMP70 = (byte)RX10_TEMP55;


				final int X10_TEMP71 = 0xff;


				final int X10_TEMP73 = X10_TEMP70 & X10_TEMP71;


				final int X10_TEMP74 = 8;


				final int X10_TEMP75 = X10_TEMP73 << X10_TEMP74;


				final int X10_TEMP77 = x2 | X10_TEMP75;


				x2 = X10_TEMP77;


				int X10_TEMP79 = 1;


				int RX10_TEMP56 = i1.f0;


				RX10_TEMP56 = RX10_TEMP56 + X10_TEMP79;


				final Point1 X10_TEMP81 = new Point1(RX10_TEMP56,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP81.hashCode());


				i1 = X10_TEMP81;


				final Dist1 RX10_TEMP57 = text1.distValue;


				final Region1 RX10_TEMP58 = RX10_TEMP57.dReg;


				final int RX10_TEMP59 = Program.searchPointInRegion1(RX10_TEMP58, i1,myUniquePlacePoint);


				final int RX10_TEMP60 = 0;


				final boolean RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60;

				if(RX10_TEMP61)
					{

					String RX10_TEMP62 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP62);

					}

				final int RX10_TEMP63 = Program.getPlaceFromDist1(RX10_TEMP57, RX10_TEMP59,myUniquePlacePoint);


				final int RX10_TEMP65 = 0;


				final boolean RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65;

				if(RX10_TEMP66)
					{

					String RX10_TEMP64 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP64);

					}

				final byte RX10_TEMP67 = Program.getRefArrayValue1byte(text1, RX10_TEMP59,myUniquePlacePoint);


				final byte X10_TEMP83 = (byte)RX10_TEMP67;


				final int X10_TEMP84 = 0xff;


				final int X10_TEMP86 = X10_TEMP83 & X10_TEMP84;


				x3 = X10_TEMP86;


				int X10_TEMP88 = 1;


				int RX10_TEMP68 = i1.f0;


				RX10_TEMP68 = RX10_TEMP68 + X10_TEMP88;


				final Point1 X10_TEMP90 = new Point1(RX10_TEMP68,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP90.hashCode());


				i1 = X10_TEMP90;


				final Dist1 RX10_TEMP69 = text1.distValue;


				final Region1 RX10_TEMP70 = RX10_TEMP69.dReg;


				final int RX10_TEMP71 = Program.searchPointInRegion1(RX10_TEMP70, i1,myUniquePlacePoint);


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

					String RX10_TEMP76 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP76);

					}

				final byte RX10_TEMP79 = Program.getRefArrayValue1byte(text1, RX10_TEMP71,myUniquePlacePoint);


				final byte X10_TEMP92 = (byte)RX10_TEMP79;


				final int X10_TEMP93 = 0xff;


				final int X10_TEMP95 = X10_TEMP92 & X10_TEMP93;


				final int X10_TEMP96 = 8;


				final int X10_TEMP97 = X10_TEMP95 << X10_TEMP96;


				final int X10_TEMP99 = x3 | X10_TEMP97;


				x3 = X10_TEMP99;


				int X10_TEMP101 = 1;


				int RX10_TEMP80 = i1.f0;


				RX10_TEMP80 = RX10_TEMP80 + X10_TEMP101;


				final Point1 X10_TEMP103 = new Point1(RX10_TEMP80,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP103.hashCode());


				i1 = X10_TEMP103;


				final Dist1 RX10_TEMP81 = text1.distValue;


				final Region1 RX10_TEMP82 = RX10_TEMP81.dReg;


				final int RX10_TEMP83 = Program.searchPointInRegion1(RX10_TEMP82, i1,myUniquePlacePoint);


				final int RX10_TEMP84 = 0;


				final boolean RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84;

				if(RX10_TEMP85)
					{

					String RX10_TEMP86 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP86);

					}

				final int RX10_TEMP87 = Program.getPlaceFromDist1(RX10_TEMP81, RX10_TEMP83,myUniquePlacePoint);


				final int RX10_TEMP89 = 0;


				final boolean RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89;

				if(RX10_TEMP90)
					{

					String RX10_TEMP88 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP88);

					}

				final byte RX10_TEMP91 = Program.getRefArrayValue1byte(text1, RX10_TEMP83,myUniquePlacePoint);


				final byte X10_TEMP105 = (byte)RX10_TEMP91;


				final int X10_TEMP106 = 0xff;


				final int X10_TEMP108 = X10_TEMP105 & X10_TEMP106;


				x4 = X10_TEMP108;


				int X10_TEMP110 = 1;


				int RX10_TEMP92 = i1.f0;


				RX10_TEMP92 = RX10_TEMP92 + X10_TEMP110;


				final Point1 X10_TEMP112 = new Point1(RX10_TEMP92,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP112.hashCode());


				i1 = X10_TEMP112;


				final Dist1 RX10_TEMP93 = text1.distValue;


				final Region1 RX10_TEMP94 = RX10_TEMP93.dReg;


				final int RX10_TEMP95 = Program.searchPointInRegion1(RX10_TEMP94, i1,myUniquePlacePoint);


				final int RX10_TEMP96 = 0;


				final boolean RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96;

				if(RX10_TEMP97)
					{

					String RX10_TEMP98 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP98);

					}

				final int RX10_TEMP99 = Program.getPlaceFromDist1(RX10_TEMP93, RX10_TEMP95,myUniquePlacePoint);


				final int RX10_TEMP101 = 0;


				final boolean RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101;

				if(RX10_TEMP102)
					{

					String RX10_TEMP100 = "Bad place access for array text1";

					throw new RuntimeException(RX10_TEMP100);

					}

				final byte RX10_TEMP103 = Program.getRefArrayValue1byte(text1, RX10_TEMP95,myUniquePlacePoint);


				final byte X10_TEMP114 = (byte)RX10_TEMP103;


				final int X10_TEMP115 = 0xff;


				final int X10_TEMP117 = X10_TEMP114 & X10_TEMP115;


				final int X10_TEMP118 = 8;


				final int X10_TEMP119 = X10_TEMP117 << X10_TEMP118;


				final int X10_TEMP121 = x4 | X10_TEMP119;


				x4 = X10_TEMP121;


				int X10_TEMP123 = 1;


				int RX10_TEMP104 = i1.f0;


				RX10_TEMP104 = RX10_TEMP104 + X10_TEMP123;


				final Point1 X10_TEMP125 = new Point1(RX10_TEMP104,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP125.hashCode());


				i1 = X10_TEMP125;


				boolean X10_TEMP126 = false;

				do 					{

					final long X10_TEMP130 = (long)x1;


					final int X10_TEMP127 = ik;


					final int X10_TEMP128 = 1;


					ik = ik + X10_TEMP128;


					final Point1 RX10_TEMP105 = new Point1(X10_TEMP127,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP105.hashCode());


					final Region1 RX10_TEMP106 = key.regionValue;


					final int RX10_TEMP107 = Program.searchPointInRegion1(RX10_TEMP106, RX10_TEMP105,myUniquePlacePoint);


					final int RX10_TEMP108 = 0;


					final boolean RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108;

					if(RX10_TEMP109)
						{

						String RX10_TEMP110 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP110);

						}

					final int[] RX10_TEMP111 = (int[])(key.contents);


					final int X10_TEMP131 = RX10_TEMP111[RX10_TEMP107];


					final long X10_TEMP132 = X10_TEMP130 * X10_TEMP131;


					final long X10_TEMP133 = 0x10001L;


					final long X10_TEMP134 = X10_TEMP132 % X10_TEMP133;


					final int X10_TEMP135 = 0xffff;


					final long X10_TEMP137 = X10_TEMP134 & X10_TEMP135;


					final int X10_TEMP139 = (int)X10_TEMP137;


					x1 = X10_TEMP139;


					final int X10_TEMP140 = ik;


					final int X10_TEMP141 = 1;


					ik = ik + X10_TEMP141;


					final Point1 RX10_TEMP112 = new Point1(X10_TEMP140,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP112.hashCode());


					final Region1 RX10_TEMP113 = key.regionValue;


					final int RX10_TEMP114 = Program.searchPointInRegion1(RX10_TEMP113, RX10_TEMP112,myUniquePlacePoint);


					final int RX10_TEMP115 = 0;


					final boolean RX10_TEMP116 = RX10_TEMP114 < RX10_TEMP115;

					if(RX10_TEMP116)
						{

						String RX10_TEMP117 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP117);

						}

					final int[] RX10_TEMP118 = (int[])(key.contents);


					final int X10_TEMP143 = RX10_TEMP118[RX10_TEMP114];


					final int X10_TEMP144 = x2 + X10_TEMP143;


					final int X10_TEMP145 = 0xffff;


					final int X10_TEMP147 = X10_TEMP144 & X10_TEMP145;


					x2 = X10_TEMP147;


					final int X10_TEMP148 = ik;


					final int X10_TEMP149 = 1;


					ik = ik + X10_TEMP149;


					final Point1 RX10_TEMP119 = new Point1(X10_TEMP148,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP119.hashCode());


					final Region1 RX10_TEMP120 = key.regionValue;


					final int RX10_TEMP121 = Program.searchPointInRegion1(RX10_TEMP120, RX10_TEMP119,myUniquePlacePoint);


					final int RX10_TEMP122 = 0;


					final boolean RX10_TEMP123 = RX10_TEMP121 < RX10_TEMP122;

					if(RX10_TEMP123)
						{

						String RX10_TEMP124 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP124);

						}

					final int[] RX10_TEMP125 = (int[])(key.contents);


					final int X10_TEMP151 = RX10_TEMP125[RX10_TEMP121];


					final int X10_TEMP152 = x3 + X10_TEMP151;


					final int X10_TEMP153 = 0xffff;


					final int X10_TEMP155 = X10_TEMP152 & X10_TEMP153;


					x3 = X10_TEMP155;


					final long X10_TEMP159 = (long)x4;


					final int X10_TEMP156 = ik;


					final int X10_TEMP157 = 1;


					ik = ik + X10_TEMP157;


					final Point1 RX10_TEMP126 = new Point1(X10_TEMP156,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP126.hashCode());


					final Region1 RX10_TEMP127 = key.regionValue;


					final int RX10_TEMP128 = Program.searchPointInRegion1(RX10_TEMP127, RX10_TEMP126,myUniquePlacePoint);


					final int RX10_TEMP129 = 0;


					final boolean RX10_TEMP130 = RX10_TEMP128 < RX10_TEMP129;

					if(RX10_TEMP130)
						{

						String RX10_TEMP131 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP131);

						}

					final int[] RX10_TEMP132 = (int[])(key.contents);


					final int X10_TEMP160 = RX10_TEMP132[RX10_TEMP128];


					final long X10_TEMP161 = X10_TEMP159 * X10_TEMP160;


					final long X10_TEMP162 = 0x10001L;


					final long X10_TEMP163 = X10_TEMP161 % X10_TEMP162;


					final int X10_TEMP164 = 0xffff;


					final long X10_TEMP166 = X10_TEMP163 & X10_TEMP164;


					final int X10_TEMP168 = (int)X10_TEMP166;


					x4 = X10_TEMP168;


					final int X10_TEMP170 = x1 ^ x3;


					t2 = X10_TEMP170;


					final long X10_TEMP174 = (long)t2;


					final int X10_TEMP171 = ik;


					final int X10_TEMP172 = 1;


					ik = ik + X10_TEMP172;


					final Point1 RX10_TEMP133 = new Point1(X10_TEMP171,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP133.hashCode());


					final Region1 RX10_TEMP134 = key.regionValue;


					final int RX10_TEMP135 = Program.searchPointInRegion1(RX10_TEMP134, RX10_TEMP133,myUniquePlacePoint);


					final int RX10_TEMP136 = 0;


					final boolean RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136;

					if(RX10_TEMP137)
						{

						String RX10_TEMP138 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP138);

						}

					final int[] RX10_TEMP139 = (int[])(key.contents);


					final int X10_TEMP175 = RX10_TEMP139[RX10_TEMP135];


					final long X10_TEMP176 = X10_TEMP174 * X10_TEMP175;


					final long X10_TEMP177 = 0x10001L;


					final long X10_TEMP178 = X10_TEMP176 % X10_TEMP177;


					final int X10_TEMP179 = 0xffff;


					final long X10_TEMP181 = X10_TEMP178 & X10_TEMP179;


					final int X10_TEMP183 = (int)X10_TEMP181;


					t2 = X10_TEMP183;


					final int X10_TEMP185 = x2 ^ x4;


					final int X10_TEMP186 = t2 + X10_TEMP185;


					final int X10_TEMP187 = 0xffff;


					final int X10_TEMP189 = X10_TEMP186 & X10_TEMP187;


					t1 = X10_TEMP189;


					final long X10_TEMP193 = (long)t1;


					final int X10_TEMP190 = ik;


					final int X10_TEMP191 = 1;


					ik = ik + X10_TEMP191;


					final Point1 RX10_TEMP140 = new Point1(X10_TEMP190,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP140.hashCode());


					final Region1 RX10_TEMP141 = key.regionValue;


					final int RX10_TEMP142 = Program.searchPointInRegion1(RX10_TEMP141, RX10_TEMP140,myUniquePlacePoint);


					final int RX10_TEMP143 = 0;


					final boolean RX10_TEMP144 = RX10_TEMP142 < RX10_TEMP143;

					if(RX10_TEMP144)
						{

						String RX10_TEMP145 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP145);

						}

					final int[] RX10_TEMP146 = (int[])(key.contents);


					final int X10_TEMP194 = RX10_TEMP146[RX10_TEMP142];


					final long X10_TEMP195 = X10_TEMP193 * X10_TEMP194;


					final long X10_TEMP196 = 0x10001L;


					final long X10_TEMP197 = X10_TEMP195 % X10_TEMP196;


					final int X10_TEMP198 = 0xffff;


					final long X10_TEMP200 = X10_TEMP197 & X10_TEMP198;


					final int X10_TEMP202 = (int)X10_TEMP200;


					t1 = X10_TEMP202;


					final int X10_TEMP203 = t1 + t2;


					final int X10_TEMP204 = 0xffff;


					final int X10_TEMP206 = X10_TEMP203 & X10_TEMP204;


					t2 = X10_TEMP206;


					final int X10_TEMP208 = x1 ^ t1;


					x1 = X10_TEMP208;


					final int X10_TEMP210 = x4 ^ t2;


					x4 = X10_TEMP210;


					final int X10_TEMP212 = t2 ^ x2;


					t2 = X10_TEMP212;


					final int X10_TEMP214 = x3 ^ t1;


					x2 = X10_TEMP214;


					x3 = t2;


					final int X10_TEMP216 = 1;


					r = r - X10_TEMP216;


					final int X10_TEMP217 = 0;


					X10_TEMP126 = r != X10_TEMP217;

					}
				
 while(X10_TEMP126);
				final long X10_TEMP222 = (long)x1;


				final int X10_TEMP219 = ik;


				final int X10_TEMP220 = 1;


				ik = ik + X10_TEMP220;


				final Point1 RX10_TEMP147 = new Point1(X10_TEMP219,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP147.hashCode());


				final Region1 RX10_TEMP148 = key.regionValue;


				final int RX10_TEMP149 = Program.searchPointInRegion1(RX10_TEMP148, RX10_TEMP147,myUniquePlacePoint);


				final int RX10_TEMP150 = 0;


				final boolean RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150;

				if(RX10_TEMP151)
					{

					String RX10_TEMP152 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP152);

					}

				final int[] RX10_TEMP153 = (int[])(key.contents);


				final int X10_TEMP223 = RX10_TEMP153[RX10_TEMP149];


				final long X10_TEMP224 = X10_TEMP222 * X10_TEMP223;


				final long X10_TEMP225 = 0x10001L;


				final long X10_TEMP226 = X10_TEMP224 % X10_TEMP225;


				final int X10_TEMP227 = 0xffff;


				final long X10_TEMP229 = X10_TEMP226 & X10_TEMP227;


				final int X10_TEMP231 = (int)X10_TEMP229;


				x1 = X10_TEMP231;


				final int X10_TEMP232 = ik;


				final int X10_TEMP233 = 1;


				ik = ik + X10_TEMP233;


				final Point1 RX10_TEMP154 = new Point1(X10_TEMP232,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP154.hashCode());


				final Region1 RX10_TEMP155 = key.regionValue;


				final int RX10_TEMP156 = Program.searchPointInRegion1(RX10_TEMP155, RX10_TEMP154,myUniquePlacePoint);


				final int RX10_TEMP157 = 0;


				final boolean RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157;

				if(RX10_TEMP158)
					{

					String RX10_TEMP159 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP159);

					}

				final int[] RX10_TEMP160 = (int[])(key.contents);


				final int X10_TEMP235 = RX10_TEMP160[RX10_TEMP156];


				final int X10_TEMP236 = x3 + X10_TEMP235;


				final int X10_TEMP237 = 0xffff;


				final int X10_TEMP239 = X10_TEMP236 & X10_TEMP237;


				x3 = X10_TEMP239;


				final int X10_TEMP240 = ik;


				final int X10_TEMP241 = 1;


				ik = ik + X10_TEMP241;


				final Point1 RX10_TEMP161 = new Point1(X10_TEMP240,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP161.hashCode());


				final Region1 RX10_TEMP162 = key.regionValue;


				final int RX10_TEMP163 = Program.searchPointInRegion1(RX10_TEMP162, RX10_TEMP161,myUniquePlacePoint);


				final int RX10_TEMP164 = 0;


				final boolean RX10_TEMP165 = RX10_TEMP163 < RX10_TEMP164;

				if(RX10_TEMP165)
					{

					String RX10_TEMP166 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP166);

					}

				final int[] RX10_TEMP167 = (int[])(key.contents);


				final int X10_TEMP243 = RX10_TEMP167[RX10_TEMP163];


				final int X10_TEMP244 = x2 + X10_TEMP243;


				final int X10_TEMP245 = 0xffff;


				final int X10_TEMP247 = X10_TEMP244 & X10_TEMP245;


				x2 = X10_TEMP247;


				final long X10_TEMP251 = (long)x4;


				final int X10_TEMP248 = ik;


				final int X10_TEMP249 = 1;


				ik = ik + X10_TEMP249;


				final Point1 RX10_TEMP168 = new Point1(X10_TEMP248,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP168.hashCode());


				final Region1 RX10_TEMP169 = key.regionValue;


				final int RX10_TEMP170 = Program.searchPointInRegion1(RX10_TEMP169, RX10_TEMP168,myUniquePlacePoint);


				final int RX10_TEMP171 = 0;


				final boolean RX10_TEMP172 = RX10_TEMP170 < RX10_TEMP171;

				if(RX10_TEMP172)
					{

					String RX10_TEMP173 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP173);

					}

				final int[] RX10_TEMP174 = (int[])(key.contents);


				final int X10_TEMP252 = RX10_TEMP174[RX10_TEMP170];


				final long X10_TEMP253 = X10_TEMP251 * X10_TEMP252;


				final long X10_TEMP254 = 0x10001L;


				final long X10_TEMP255 = X10_TEMP253 % X10_TEMP254;


				final int X10_TEMP256 = 0xffff;


				final long X10_TEMP258 = X10_TEMP255 & X10_TEMP256;


				final int X10_TEMP260 = (int)X10_TEMP258;


				x4 = X10_TEMP260;


				final byte X10_TEMP264 = (byte)(byte)x1;


				final byte X10_TEMP265 = (byte)X10_TEMP264;


				final Dist1 RX10_TEMP175 = text2.distValue;


				final Region1 RX10_TEMP176 = RX10_TEMP175.dReg;


				final int RX10_TEMP177 = Program.searchPointInRegion1(RX10_TEMP176, i2,myUniquePlacePoint);


				final int RX10_TEMP178 = 0;


				final boolean RX10_TEMP179 = RX10_TEMP177 < RX10_TEMP178;

				if(RX10_TEMP179)
					{

					String RX10_TEMP180 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP180);

					}

				final int RX10_TEMP181 = Program.getPlaceFromDist1(RX10_TEMP175, RX10_TEMP177,myUniquePlacePoint);


				final int RX10_TEMP183 = 0;


				final boolean RX10_TEMP184 = RX10_TEMP181 != RX10_TEMP183;

				if(RX10_TEMP184)
					{

					String RX10_TEMP182 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP182);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP177, X10_TEMP265,myUniquePlacePoint);

				int X10_TEMP267 = 1;


				int RX10_TEMP185 = i2.f0;


				RX10_TEMP185 = RX10_TEMP185 + X10_TEMP267;


				final Point1 X10_TEMP269 = new Point1(RX10_TEMP185,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP269.hashCode());


				i2 = X10_TEMP269;


				final int X10_TEMP271 = 8;


				final int X10_TEMP273 = x1 >>> X10_TEMP271;


				final byte X10_TEMP276 = (byte)(byte)X10_TEMP273;


				final byte X10_TEMP277 = (byte)X10_TEMP276;


				final Dist1 RX10_TEMP186 = text2.distValue;


				final Region1 RX10_TEMP187 = RX10_TEMP186.dReg;


				final int RX10_TEMP188 = Program.searchPointInRegion1(RX10_TEMP187, i2,myUniquePlacePoint);


				final int RX10_TEMP189 = 0;


				final boolean RX10_TEMP190 = RX10_TEMP188 < RX10_TEMP189;

				if(RX10_TEMP190)
					{

					String RX10_TEMP191 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP191);

					}

				final int RX10_TEMP192 = Program.getPlaceFromDist1(RX10_TEMP186, RX10_TEMP188,myUniquePlacePoint);


				final int RX10_TEMP194 = 0;


				final boolean RX10_TEMP195 = RX10_TEMP192 != RX10_TEMP194;

				if(RX10_TEMP195)
					{

					String RX10_TEMP193 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP193);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP188, X10_TEMP277,myUniquePlacePoint);

				int X10_TEMP279 = 1;


				int RX10_TEMP196 = i2.f0;


				RX10_TEMP196 = RX10_TEMP196 + X10_TEMP279;


				final Point1 X10_TEMP281 = new Point1(RX10_TEMP196,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP281.hashCode());


				i2 = X10_TEMP281;


				final byte X10_TEMP285 = (byte)(byte)x3;


				final byte X10_TEMP286 = (byte)X10_TEMP285;


				final Dist1 RX10_TEMP197 = text2.distValue;


				final Region1 RX10_TEMP198 = RX10_TEMP197.dReg;


				final int RX10_TEMP199 = Program.searchPointInRegion1(RX10_TEMP198, i2,myUniquePlacePoint);


				final int RX10_TEMP200 = 0;


				final boolean RX10_TEMP201 = RX10_TEMP199 < RX10_TEMP200;

				if(RX10_TEMP201)
					{

					String RX10_TEMP202 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP202);

					}

				final int RX10_TEMP203 = Program.getPlaceFromDist1(RX10_TEMP197, RX10_TEMP199,myUniquePlacePoint);


				final int RX10_TEMP205 = 0;


				final boolean RX10_TEMP206 = RX10_TEMP203 != RX10_TEMP205;

				if(RX10_TEMP206)
					{

					String RX10_TEMP204 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP204);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP199, X10_TEMP286,myUniquePlacePoint);

				int X10_TEMP288 = 1;


				int RX10_TEMP207 = i2.f0;


				RX10_TEMP207 = RX10_TEMP207 + X10_TEMP288;


				final Point1 X10_TEMP290 = new Point1(RX10_TEMP207,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP290.hashCode());


				i2 = X10_TEMP290;


				final int X10_TEMP292 = 8;


				final int X10_TEMP294 = x3 >>> X10_TEMP292;


				final byte X10_TEMP297 = (byte)(byte)X10_TEMP294;


				final byte X10_TEMP298 = (byte)X10_TEMP297;


				final Dist1 RX10_TEMP208 = text2.distValue;


				final Region1 RX10_TEMP209 = RX10_TEMP208.dReg;


				final int RX10_TEMP210 = Program.searchPointInRegion1(RX10_TEMP209, i2,myUniquePlacePoint);


				final int RX10_TEMP211 = 0;


				final boolean RX10_TEMP212 = RX10_TEMP210 < RX10_TEMP211;

				if(RX10_TEMP212)
					{

					String RX10_TEMP213 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP213);

					}

				final int RX10_TEMP214 = Program.getPlaceFromDist1(RX10_TEMP208, RX10_TEMP210,myUniquePlacePoint);


				final int RX10_TEMP216 = 0;


				final boolean RX10_TEMP217 = RX10_TEMP214 != RX10_TEMP216;

				if(RX10_TEMP217)
					{

					String RX10_TEMP215 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP215);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP210, X10_TEMP298,myUniquePlacePoint);

				int X10_TEMP300 = 1;


				int RX10_TEMP218 = i2.f0;


				RX10_TEMP218 = RX10_TEMP218 + X10_TEMP300;


				final Point1 X10_TEMP302 = new Point1(RX10_TEMP218,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP302.hashCode());


				i2 = X10_TEMP302;


				final byte X10_TEMP306 = (byte)(byte)x2;


				final byte X10_TEMP307 = (byte)X10_TEMP306;


				final Dist1 RX10_TEMP219 = text2.distValue;


				final Region1 RX10_TEMP220 = RX10_TEMP219.dReg;


				final int RX10_TEMP221 = Program.searchPointInRegion1(RX10_TEMP220, i2,myUniquePlacePoint);


				final int RX10_TEMP222 = 0;


				final boolean RX10_TEMP223 = RX10_TEMP221 < RX10_TEMP222;

				if(RX10_TEMP223)
					{

					String RX10_TEMP224 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP224);

					}

				final int RX10_TEMP225 = Program.getPlaceFromDist1(RX10_TEMP219, RX10_TEMP221,myUniquePlacePoint);


				final int RX10_TEMP227 = 0;


				final boolean RX10_TEMP228 = RX10_TEMP225 != RX10_TEMP227;

				if(RX10_TEMP228)
					{

					String RX10_TEMP226 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP226);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP221, X10_TEMP307,myUniquePlacePoint);

				int X10_TEMP309 = 1;


				int RX10_TEMP229 = i2.f0;


				RX10_TEMP229 = RX10_TEMP229 + X10_TEMP309;


				final Point1 X10_TEMP311 = new Point1(RX10_TEMP229,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP311.hashCode());


				i2 = X10_TEMP311;


				final int X10_TEMP313 = 8;


				final int X10_TEMP315 = x2 >>> X10_TEMP313;


				final byte X10_TEMP318 = (byte)(byte)X10_TEMP315;


				final byte X10_TEMP319 = (byte)X10_TEMP318;


				final Dist1 RX10_TEMP230 = text2.distValue;


				final Region1 RX10_TEMP231 = RX10_TEMP230.dReg;


				final int RX10_TEMP232 = Program.searchPointInRegion1(RX10_TEMP231, i2,myUniquePlacePoint);


				final int RX10_TEMP233 = 0;


				final boolean RX10_TEMP234 = RX10_TEMP232 < RX10_TEMP233;

				if(RX10_TEMP234)
					{

					String RX10_TEMP235 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP235);

					}

				final int RX10_TEMP236 = Program.getPlaceFromDist1(RX10_TEMP230, RX10_TEMP232,myUniquePlacePoint);


				final int RX10_TEMP238 = 0;


				final boolean RX10_TEMP239 = RX10_TEMP236 != RX10_TEMP238;

				if(RX10_TEMP239)
					{

					String RX10_TEMP237 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP237);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP232, X10_TEMP319,myUniquePlacePoint);

				int X10_TEMP321 = 1;


				int RX10_TEMP240 = i2.f0;


				RX10_TEMP240 = RX10_TEMP240 + X10_TEMP321;


				final Point1 X10_TEMP323 = new Point1(RX10_TEMP240,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP323.hashCode());


				i2 = X10_TEMP323;


				final byte X10_TEMP327 = (byte)(byte)x4;


				final byte X10_TEMP328 = (byte)X10_TEMP327;


				final Dist1 RX10_TEMP241 = text2.distValue;


				final Region1 RX10_TEMP242 = RX10_TEMP241.dReg;


				final int RX10_TEMP243 = Program.searchPointInRegion1(RX10_TEMP242, i2,myUniquePlacePoint);


				final int RX10_TEMP244 = 0;


				final boolean RX10_TEMP245 = RX10_TEMP243 < RX10_TEMP244;

				if(RX10_TEMP245)
					{

					String RX10_TEMP246 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP246);

					}

				final int RX10_TEMP247 = Program.getPlaceFromDist1(RX10_TEMP241, RX10_TEMP243,myUniquePlacePoint);


				final int RX10_TEMP249 = 0;


				final boolean RX10_TEMP250 = RX10_TEMP247 != RX10_TEMP249;

				if(RX10_TEMP250)
					{

					String RX10_TEMP248 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP248);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP243, X10_TEMP328,myUniquePlacePoint);

				int X10_TEMP330 = 1;


				int RX10_TEMP251 = i2.f0;


				RX10_TEMP251 = RX10_TEMP251 + X10_TEMP330;


				final Point1 X10_TEMP332 = new Point1(RX10_TEMP251,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP332.hashCode());


				i2 = X10_TEMP332;


				final int X10_TEMP334 = 8;


				final int X10_TEMP336 = x4 >>> X10_TEMP334;


				final byte X10_TEMP339 = (byte)(byte)X10_TEMP336;


				final byte X10_TEMP340 = (byte)X10_TEMP339;


				final Dist1 RX10_TEMP252 = text2.distValue;


				final Region1 RX10_TEMP253 = RX10_TEMP252.dReg;


				final int RX10_TEMP254 = Program.searchPointInRegion1(RX10_TEMP253, i2,myUniquePlacePoint);


				final int RX10_TEMP255 = 0;


				final boolean RX10_TEMP256 = RX10_TEMP254 < RX10_TEMP255;

				if(RX10_TEMP256)
					{

					String RX10_TEMP257 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP257);

					}

				final int RX10_TEMP258 = Program.getPlaceFromDist1(RX10_TEMP252, RX10_TEMP254,myUniquePlacePoint);


				final int RX10_TEMP260 = 0;


				final boolean RX10_TEMP261 = RX10_TEMP258 != RX10_TEMP260;

				if(RX10_TEMP261)
					{

					String RX10_TEMP259 = "Bad place access for array text2";

					throw new RuntimeException(RX10_TEMP259);

					}
				Program.setRefArrayValue1byte(text2, RX10_TEMP254, X10_TEMP340,myUniquePlacePoint);

				int X10_TEMP342 = 1;


				int RX10_TEMP262 = i2.f0;


				RX10_TEMP262 = RX10_TEMP262 + X10_TEMP342;


				final Point1 X10_TEMP344 = new Point1(RX10_TEMP262,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP344.hashCode());


				i2 = X10_TEMP344;

				}
			}
		}
public static int IDEATest_mul ( final IDEATest X10_TEMP0, final int aa, final int ab, int myUniquePlacePoint)
		{

		int a = aa;


		int b = ab;


		long p = 0L;


		final int X10_TEMP4 = 0;


		final boolean X10_TEMP6 = a != X10_TEMP4;

		if(X10_TEMP6)
			{

			final int X10_TEMP7 = 0;


			final boolean X10_TEMP9 = b != X10_TEMP7;

			if(X10_TEMP9)
				{

				final long X10_TEMP10 = (long)a;


				final long X10_TEMP12 = X10_TEMP10 * b;


				p = X10_TEMP12;


				final int X10_TEMP13 = (int)p;


				final int X10_TEMP14 = 0xFFFF;


				final int X10_TEMP16 = X10_TEMP13 & X10_TEMP14;


				b = X10_TEMP16;


				final int X10_TEMP17 = (int)p;


				final int X10_TEMP18 = 16;


				final int X10_TEMP20 = X10_TEMP17 >>> X10_TEMP18;


				a = X10_TEMP20;


				final int X10_TEMP27 = b - a;


				final boolean X10_TEMP21 = b < a;


				int X10_TEMP24 = 0;

				if(X10_TEMP21)
					{

					X10_TEMP24 = 1;

					}

				final int X10_TEMP25 = X10_TEMP24;


				final int X10_TEMP26 = X10_TEMP25;


				final int X10_TEMP28 = X10_TEMP27 + X10_TEMP26;


				final int X10_TEMP29 = 0xFFFF;


				final int X10_TEMP31 = X10_TEMP28 & X10_TEMP29;

				return X10_TEMP31;
				}
			else
				{

				final int X10_TEMP33 = 1;


				final int X10_TEMP35 = X10_TEMP33 - a;


				final int X10_TEMP36 = 0xFFFF;


				final int X10_TEMP38 = X10_TEMP35 & X10_TEMP36;

				return X10_TEMP38;
				}
 			}
		else
			{

			final int X10_TEMP40 = 1;


			final int X10_TEMP42 = X10_TEMP40 - b;


			final int X10_TEMP43 = 0xFFFF;


			final int X10_TEMP45 = X10_TEMP42 & X10_TEMP43;

			return X10_TEMP45;
			}
 		}
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
public static String toStringPoint1 ( final Point1 p, int myUniquePlacePoint)
		{

		String str = "";


		final int f0 = p.f0;


		String lSq = "[";


		String rSq = "]";


		str = str + lSq;


		str = str + f0;


		str = str + rSq;

		return str;
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
public static void setRefArrayValue1byte ( final byteRefArray1 array, final int index, final byte val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final byteStub[] contents = array.contents;


		final byteStub indexStub = contents[placeIndex];


		final byte[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
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
public static byte getRefArrayValue1byte ( final byteRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final byteStub[] contents = array.contents;


		final byteStub indexStub = contents[placeIndex];


		final byte[] localArray = indexStub.localArray;


		final byte returnValue = localArray[localIndex];

		return returnValue;
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

}
	class IDEATest   {
 
	public byteRefArray1 plain1;
	public byteRefArray1 crypt1;
	public byteRefArray1 plain2;
	public intValArray1 userkey;
	public intValArray1 ZR;
	public intValArray1 DKR;


	public IDEATest (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
		this.IDEATest_buildTestData(myUniquePlacePoint);

		final int X10_TEMP6 = 0;


		final int X10_TEMP3 = Program._IDEATest_array_rows;


		final int X10_TEMP4 = 1;


		final int X10_TEMP7 = X10_TEMP3 - X10_TEMP4;


		final Region1 X10_TEMP9 = Program.createNewRegion1R(X10_TEMP6, X10_TEMP7,myUniquePlacePoint);


		final Dist1 X10_TEMP10 = Program.getBlockDist1(X10_TEMP9,myUniquePlacePoint);


		final Dist1 D = X10_TEMP10;


		final Region1 RX10_TEMP0 = D.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final byteStub[] RX10_TEMP6 = new byteStub[RX10_TEMP5];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(D, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;


				final Point1[] RX10_TEMP13 = Program.getDistLocalArray1(D, RX10_TEMP9,myUniquePlacePoint);

				//async(RX10_TEMP10)
					{

					Program.globalPointerHashMap.get(RX10_TEMP10).add(this.hashCode());

					final int RX10_TEMP15 = RX10_TEMP12+1;


					final byte[] RX10_TEMP16 = new byte/*NewUpdatableArray*/[RX10_TEMP15];
/*arrayInitBlock*/
for(int RX10_TEMP14= 0;RX10_TEMP14 <RX10_TEMP16.length ;RX10_TEMP14++ )						{

						Program.globalPointerHashMap.get(RX10_TEMP10).add(this.hashCode());

						final Point1 p = RX10_TEMP13[RX10_TEMP14];


						final int X10_TEMP13 = p.f0;


						final byte X10_TEMP15 = (byte)(byte)X10_TEMP13;

						RX10_TEMP16[RX10_TEMP14] =X10_TEMP15;
						}

;


					final byteStub RX10_TEMP17 = new byteStub(RX10_TEMP16,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP17.hashCode());

					//async(RX10_TEMP8)
						{

						Program.globalPointerHashMap.get(RX10_TEMP8).add(this.hashCode());
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP17;
						}
					}
				}
			}

		final byteStub[] RX10_TEMP18 = (byteStub[])(new byteStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP20= 0;RX10_TEMP20 <RX10_TEMP18.length ;RX10_TEMP20++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final byteStub RX10_TEMP19 = RX10_TEMP6[RX10_TEMP20];

			RX10_TEMP18[RX10_TEMP20] =RX10_TEMP19;
			}

;


		final byteRefArray1 RX10_TEMP21 = new byteRefArray1(D, RX10_TEMP18,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP21.hashCode());


		final byteRefArray1 X10_TEMP17 = RX10_TEMP21;


		plain1 = X10_TEMP17;


		final Region1 RX10_TEMP22 = D.dReg;


		final int RX10_TEMP23 = 0;


		final int RX10_TEMP24 = 1;


		int RX10_TEMP25 = Program.MAX_PLACES;


		RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP24;


		final int  RX10_TEMP26 = RX10_TEMP25+1;


		final int RX10_TEMP27 = RX10_TEMP25+1;


		final byteStub[] RX10_TEMP28 = new byteStub[RX10_TEMP27];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP29=0; RX10_TEMP29 < RX10_TEMP26; RX10_TEMP29++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP30 = 0;


				final int RX10_TEMP31 = RX10_TEMP29;


				final int RX10_TEMP32 = RX10_TEMP31;


				final int RX10_TEMP33 = Program.getDistLocalCount1(D, RX10_TEMP31,myUniquePlacePoint);


				final int RX10_TEMP34 = RX10_TEMP33 - RX10_TEMP24;

				//async(RX10_TEMP32)
					{

					Program.globalPointerHashMap.get(RX10_TEMP32).add(this.hashCode());

					final int RX10_TEMP35 = RX10_TEMP34+1;


					final byte[] RX10_TEMP36 = new byte[RX10_TEMP35];


					final byteStub RX10_TEMP37 = new byteStub(RX10_TEMP36,RX10_TEMP32);
					
Program.globalPointerHashMap.get(RX10_TEMP32).add(RX10_TEMP37.hashCode());

					//async(RX10_TEMP30)
						{

						Program.globalPointerHashMap.get(RX10_TEMP30).add(this.hashCode());
						RX10_TEMP28[RX10_TEMP29] = RX10_TEMP37;
						}
					}
				}
			}

		final byteStub[] RX10_TEMP38 = (byteStub[])(new byteStub/*value*/[RX10_TEMP26]);
/*arrayInitBlock*/
for(int RX10_TEMP40= 0;RX10_TEMP40 <RX10_TEMP38.length ;RX10_TEMP40++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final byteStub RX10_TEMP39 = RX10_TEMP28[RX10_TEMP40];

			RX10_TEMP38[RX10_TEMP40] =RX10_TEMP39;
			}

;


		final byteRefArray1 RX10_TEMP41 = new byteRefArray1(D, RX10_TEMP38,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP41.hashCode());


		final byteRefArray1 X10_TEMP19 = RX10_TEMP41;


		crypt1 = X10_TEMP19;


		final Region1 RX10_TEMP42 = D.dReg;


		final int RX10_TEMP43 = 0;


		final int RX10_TEMP44 = 1;


		int RX10_TEMP45 = Program.MAX_PLACES;


		RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44;


		final int  RX10_TEMP46 = RX10_TEMP45+1;


		final int RX10_TEMP47 = RX10_TEMP45+1;


		final byteStub[] RX10_TEMP48 = new byteStub[RX10_TEMP47];

		/*FINISH
*/			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
			for(int RX10_TEMP49=0; RX10_TEMP49 < RX10_TEMP46; RX10_TEMP49++)
				{

				Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

				final int RX10_TEMP50 = 0;


				final int RX10_TEMP51 = RX10_TEMP49;


				final int RX10_TEMP52 = RX10_TEMP51;


				final int RX10_TEMP53 = Program.getDistLocalCount1(D, RX10_TEMP51,myUniquePlacePoint);


				final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44;

				//async(RX10_TEMP52)
					{

					Program.globalPointerHashMap.get(RX10_TEMP52).add(this.hashCode());

					final int RX10_TEMP55 = RX10_TEMP54+1;


					final byte[] RX10_TEMP56 = new byte[RX10_TEMP55];


					final byteStub RX10_TEMP57 = new byteStub(RX10_TEMP56,RX10_TEMP52);
					
Program.globalPointerHashMap.get(RX10_TEMP52).add(RX10_TEMP57.hashCode());

					//async(RX10_TEMP50)
						{

						Program.globalPointerHashMap.get(RX10_TEMP50).add(this.hashCode());
						RX10_TEMP48[RX10_TEMP49] = RX10_TEMP57;
						}
					}
				}
			}

		final byteStub[] RX10_TEMP58 = (byteStub[])(new byteStub/*value*/[RX10_TEMP46]);
/*arrayInitBlock*/
for(int RX10_TEMP60= 0;RX10_TEMP60 <RX10_TEMP58.length ;RX10_TEMP60++ )			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			final byteStub RX10_TEMP59 = RX10_TEMP48[RX10_TEMP60];

			RX10_TEMP58[RX10_TEMP60] =RX10_TEMP59;
			}

;


		final byteRefArray1 RX10_TEMP61 = new byteRefArray1(D, RX10_TEMP58,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP61.hashCode());


		final byteRefArray1 X10_TEMP21 = RX10_TEMP61;


		plain2 = X10_TEMP21;

		}


public void IDEATest_buildTestData (  int myUniquePlacePoint)
		{

		long X10_TEMP2 = 136506717L;


		final Random rndnum = new Random(X10_TEMP2,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(rndnum.hashCode());


		final int X10_TEMP6 = 0;


		final int X10_TEMP7 = 7;


		final Region1 rUserKey = Program.createNewRegion1R(X10_TEMP6, X10_TEMP7,myUniquePlacePoint);


		final int X10_TEMP9 = 0;


		final Dist1 dUserKey = Program.getPlaceDist1(rUserKey, X10_TEMP9,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dUserKey.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final intStub[] RX10_TEMP6 = new intStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dUserKey, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final int[] RX10_TEMP14 = new int[RX10_TEMP13];


					final intStub RX10_TEMP15 = new intStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final intStub[] RX10_TEMP16 = (intStub[])(new intStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final intStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final intRefArray1 RX10_TEMP19 = new intRefArray1(dUserKey, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final intRefArray1 tUserKey = RX10_TEMP19;


		final int RX10_TEMP23 = 1;


		int RX10_TEMP21 = rUserKey.regSize;


		RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23;


		final int  RX10_TEMP22 = RX10_TEMP21+1;

		for(int RX10_TEMP20=0; RX10_TEMP20 < RX10_TEMP22; RX10_TEMP20++)
			{

			final int RX10_TEMP24 = RX10_TEMP20;


			final Point1 pt = Program.regionOrdinalPoint1(rUserKey, RX10_TEMP24,myUniquePlacePoint);


			final int X10_TEMP14 = Program.Random_nextInt(rndnum,myUniquePlacePoint);


			final int X10_TEMP17 = (short)X10_TEMP14;


			final int X10_TEMP18 = X10_TEMP17;


			final Dist1 RX10_TEMP25 = tUserKey.distValue;


			final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;


			final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, pt,myUniquePlacePoint);


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

				String RX10_TEMP32 = "Bad place access for array tUserKey";

				throw new RuntimeException(RX10_TEMP32);

				}
			Program.setRefArrayValue1int(tUserKey, RX10_TEMP27, X10_TEMP18,myUniquePlacePoint);
			}

		final Region1 RX10_TEMP35 = rUserKey;


		final int RX10_TEMP50 = rUserKey.regSize;


		final int RX10_TEMP51 = 1;


		final int RX10_TEMP52 = RX10_TEMP50 - RX10_TEMP51;


		final int  RX10_TEMP49 = RX10_TEMP52+1;


		final int[] RX10_TEMP53 = (int[])(new int/*value*/[RX10_TEMP49]);
/*arrayInitBlock*/
for(int RX10_TEMP36= 0;RX10_TEMP36 <RX10_TEMP53.length ;RX10_TEMP36++ )			{

			final int RX10_TEMP37 = RX10_TEMP36;


			final Point1 pt = Program.regionOrdinalPoint1(RX10_TEMP35, RX10_TEMP37,myUniquePlacePoint);


			final Dist1 RX10_TEMP38 = tUserKey.distValue;


			final Region1 RX10_TEMP39 = RX10_TEMP38.dReg;


			final int RX10_TEMP40 = Program.searchPointInRegion1(RX10_TEMP39, pt,myUniquePlacePoint);


			final int RX10_TEMP41 = 0;


			final boolean RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41;

			if(RX10_TEMP42)
				{

				String RX10_TEMP43 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP43);

				}

			final int RX10_TEMP44 = Program.getPlaceFromDist1(RX10_TEMP38, RX10_TEMP40,myUniquePlacePoint);


			final int RX10_TEMP46 = 0;


			final boolean RX10_TEMP47 = RX10_TEMP44 != RX10_TEMP46;

			if(RX10_TEMP47)
				{

				String RX10_TEMP45 = "Bad place access for array tUserKey";

				throw new RuntimeException(RX10_TEMP45);

				}

			final int RX10_TEMP48 = Program.getRefArrayValue1int(tUserKey, RX10_TEMP40,myUniquePlacePoint);


			final int X10_TEMP21 = RX10_TEMP48;

			RX10_TEMP53[RX10_TEMP36] =X10_TEMP21;
			}

;


		final intValArray1 RX10_TEMP54 = new intValArray1(rUserKey, RX10_TEMP53,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP54.hashCode());


		final intValArray1 X10_TEMP22 = RX10_TEMP54;


		final intValArray1 tempuserkey = X10_TEMP22;


		userkey = tempuserkey;


		final intValArray1 tempZR = this.IDEATest_calcEncryptKey(tempuserkey,myUniquePlacePoint);


		ZR = tempZR;

		this.IDEATest_calcDecryptKey(tempZR,myUniquePlacePoint);
		}
public intValArray1 IDEATest_calcEncryptKey ( final intValArray1 auserkey, int myUniquePlacePoint)
		{

		int j = 0;


		final int X10_TEMP4 = 0;


		final int X10_TEMP5 = 51;


		final Region1 rZ = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5,myUniquePlacePoint);


		final int X10_TEMP7 = 0;


		final Dist1 dZ = Program.getPlaceDist1(rZ, X10_TEMP7,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dZ.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final intStub[] RX10_TEMP6 = new intStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dZ, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final int[] RX10_TEMP14 = new int[RX10_TEMP13];


					final intStub RX10_TEMP15 = new intStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final intStub[] RX10_TEMP16 = (intStub[])(new intStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final intStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final intRefArray1 RX10_TEMP19 = new intRefArray1(dZ, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final intRefArray1 Z = RX10_TEMP19;


		final int X10_TEMP12 = 0;


		final int X10_TEMP13 = 7;


		final Region1 X10_TEMP15 = Program.createNewRegion1R(X10_TEMP12, X10_TEMP13,myUniquePlacePoint);


		final int RX10_TEMP23 = 1;


		int RX10_TEMP21 = X10_TEMP15.regSize;


		RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23;


		final int  RX10_TEMP22 = RX10_TEMP21+1;

		for(int RX10_TEMP20=0; RX10_TEMP20 < RX10_TEMP22; RX10_TEMP20++)
			{

			final int RX10_TEMP24 = RX10_TEMP20;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP15, RX10_TEMP24,myUniquePlacePoint);


			final Region1 RX10_TEMP25 = auserkey.regionValue;


			final int RX10_TEMP26 = Program.searchPointInRegion1(RX10_TEMP25, i,myUniquePlacePoint);


			final int RX10_TEMP27 = 0;


			final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27;

			if(RX10_TEMP28)
				{

				String RX10_TEMP29 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP29);

				}

			final int[] RX10_TEMP30 = (int[])(auserkey.contents);


			final int X10_TEMP18 = RX10_TEMP30[RX10_TEMP26];


			final int X10_TEMP19 = 0xffff;


			final int X10_TEMP22 = X10_TEMP18 & X10_TEMP19;


			final int X10_TEMP23 = X10_TEMP22;


			final Dist1 RX10_TEMP31 = Z.distValue;


			final Region1 RX10_TEMP32 = RX10_TEMP31.dReg;


			final int RX10_TEMP33 = Program.searchPointInRegion1(RX10_TEMP32, i,myUniquePlacePoint);


			final int RX10_TEMP34 = 0;


			final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34;

			if(RX10_TEMP35)
				{

				String RX10_TEMP36 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP36);

				}

			final int RX10_TEMP37 = Program.getPlaceFromDist1(RX10_TEMP31, RX10_TEMP33,myUniquePlacePoint);


			final int RX10_TEMP39 = 0;


			final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39;

			if(RX10_TEMP40)
				{

				String RX10_TEMP38 = "Bad place access for array Z";

				throw new RuntimeException(RX10_TEMP38);

				}
			Program.setRefArrayValue1int(Z, RX10_TEMP33, X10_TEMP23,myUniquePlacePoint);
			}

		final int X10_TEMP26 = 8;


		final int X10_TEMP27 = 51;


		final Region1 X10_TEMP29 = Program.createNewRegion1R(X10_TEMP26, X10_TEMP27,myUniquePlacePoint);


		final int RX10_TEMP44 = 1;


		int RX10_TEMP42 = X10_TEMP29.regSize;


		RX10_TEMP42 = RX10_TEMP42 - RX10_TEMP44;


		final int  RX10_TEMP43 = RX10_TEMP42+1;

		for(int RX10_TEMP41=0; RX10_TEMP41 < RX10_TEMP43; RX10_TEMP41++)
			{

			final int RX10_TEMP45 = RX10_TEMP41;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP29, RX10_TEMP45,myUniquePlacePoint);


			final int X10_TEMP31 = i.f0;


			final int X10_TEMP32 = 8;


			final int X10_TEMP34 = X10_TEMP31 % X10_TEMP32;


			j = X10_TEMP34;


			final int X10_TEMP35 = 6;


			final boolean X10_TEMP37 = j < X10_TEMP35;

			if(X10_TEMP37)
				{

				final int X10_TEMP39 = 7;


				final int X10_TEMP40 = 0;


				int X10_TEMP42 = X10_TEMP40 - X10_TEMP39;


				int RX10_TEMP46 = i.f0;


				RX10_TEMP46 = RX10_TEMP46 + X10_TEMP42;


				final Point1 X10_TEMP44 = new Point1(RX10_TEMP46,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP44.hashCode());


				final Dist1 RX10_TEMP47 = Z.distValue;


				final Region1 RX10_TEMP48 = RX10_TEMP47.dReg;


				final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, X10_TEMP44,myUniquePlacePoint);


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

					String RX10_TEMP54 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP54);

					}

				final int RX10_TEMP57 = Program.getRefArrayValue1int(Z, RX10_TEMP49,myUniquePlacePoint);


				final int X10_TEMP45 = RX10_TEMP57;


				final int X10_TEMP46 = 9;


				final int X10_TEMP48 = X10_TEMP45 >>> X10_TEMP46;


				final int X10_TEMP49 = 6;


				final int X10_TEMP50 = 0;


				int X10_TEMP52 = X10_TEMP50 - X10_TEMP49;


				int RX10_TEMP58 = i.f0;


				RX10_TEMP58 = RX10_TEMP58 + X10_TEMP52;


				final Point1 X10_TEMP54 = new Point1(RX10_TEMP58,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP54.hashCode());


				final Dist1 RX10_TEMP59 = Z.distValue;


				final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;


				final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, X10_TEMP54,myUniquePlacePoint);


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

					String RX10_TEMP66 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP66);

					}

				final int RX10_TEMP69 = Program.getRefArrayValue1int(Z, RX10_TEMP61,myUniquePlacePoint);


				final int X10_TEMP55 = RX10_TEMP69;


				final int X10_TEMP56 = 7;


				final int X10_TEMP58 = X10_TEMP55 << X10_TEMP56;


				final int X10_TEMP60 = X10_TEMP48 | X10_TEMP58;


				final int X10_TEMP61 = 0xFFFF;


				final int X10_TEMP64 = X10_TEMP60 & X10_TEMP61;


				final int X10_TEMP65 = X10_TEMP64;


				final Dist1 RX10_TEMP70 = Z.distValue;


				final Region1 RX10_TEMP71 = RX10_TEMP70.dReg;


				final int RX10_TEMP72 = Program.searchPointInRegion1(RX10_TEMP71, i,myUniquePlacePoint);


				final int RX10_TEMP73 = 0;


				final boolean RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73;

				if(RX10_TEMP74)
					{

					String RX10_TEMP75 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP75);

					}

				final int RX10_TEMP76 = Program.getPlaceFromDist1(RX10_TEMP70, RX10_TEMP72,myUniquePlacePoint);


				final int RX10_TEMP78 = 0;


				final boolean RX10_TEMP79 = RX10_TEMP76 != RX10_TEMP78;

				if(RX10_TEMP79)
					{

					String RX10_TEMP77 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP77);

					}
				Program.setRefArrayValue1int(Z, RX10_TEMP72, X10_TEMP65,myUniquePlacePoint);
				continue;
				}

			final int X10_TEMP66 = 6;


			final boolean X10_TEMP68 = j == X10_TEMP66;

			if(X10_TEMP68)
				{

				final int X10_TEMP70 = 7;


				final int X10_TEMP71 = 0;


				int X10_TEMP73 = X10_TEMP71 - X10_TEMP70;


				int RX10_TEMP80 = i.f0;


				RX10_TEMP80 = RX10_TEMP80 + X10_TEMP73;


				final Point1 X10_TEMP75 = new Point1(RX10_TEMP80,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP75.hashCode());


				final Dist1 RX10_TEMP81 = Z.distValue;


				final Region1 RX10_TEMP82 = RX10_TEMP81.dReg;


				final int RX10_TEMP83 = Program.searchPointInRegion1(RX10_TEMP82, X10_TEMP75,myUniquePlacePoint);


				final int RX10_TEMP84 = 0;


				final boolean RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84;

				if(RX10_TEMP85)
					{

					String RX10_TEMP86 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP86);

					}

				final int RX10_TEMP87 = Program.getPlaceFromDist1(RX10_TEMP81, RX10_TEMP83,myUniquePlacePoint);


				final int RX10_TEMP89 = 0;


				final boolean RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89;

				if(RX10_TEMP90)
					{

					String RX10_TEMP88 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP88);

					}

				final int RX10_TEMP91 = Program.getRefArrayValue1int(Z, RX10_TEMP83,myUniquePlacePoint);


				final int X10_TEMP76 = RX10_TEMP91;


				final int X10_TEMP77 = 9;


				final int X10_TEMP79 = X10_TEMP76 >>> X10_TEMP77;


				final int X10_TEMP80 = 14;


				final int X10_TEMP81 = 0;


				int X10_TEMP83 = X10_TEMP81 - X10_TEMP80;


				int RX10_TEMP92 = i.f0;


				RX10_TEMP92 = RX10_TEMP92 + X10_TEMP83;


				final Point1 X10_TEMP85 = new Point1(RX10_TEMP92,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP85.hashCode());


				final Dist1 RX10_TEMP93 = Z.distValue;


				final Region1 RX10_TEMP94 = RX10_TEMP93.dReg;


				final int RX10_TEMP95 = Program.searchPointInRegion1(RX10_TEMP94, X10_TEMP85,myUniquePlacePoint);


				final int RX10_TEMP96 = 0;


				final boolean RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96;

				if(RX10_TEMP97)
					{

					String RX10_TEMP98 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP98);

					}

				final int RX10_TEMP99 = Program.getPlaceFromDist1(RX10_TEMP93, RX10_TEMP95,myUniquePlacePoint);


				final int RX10_TEMP101 = 0;


				final boolean RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101;

				if(RX10_TEMP102)
					{

					String RX10_TEMP100 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP100);

					}

				final int RX10_TEMP103 = Program.getRefArrayValue1int(Z, RX10_TEMP95,myUniquePlacePoint);


				final int X10_TEMP86 = RX10_TEMP103;


				final int X10_TEMP87 = 7;


				final int X10_TEMP89 = X10_TEMP86 << X10_TEMP87;


				final int X10_TEMP91 = X10_TEMP79 | X10_TEMP89;


				final int X10_TEMP92 = 0xFFFF;


				final int X10_TEMP95 = X10_TEMP91 & X10_TEMP92;


				final int X10_TEMP96 = X10_TEMP95;


				final Dist1 RX10_TEMP104 = Z.distValue;


				final Region1 RX10_TEMP105 = RX10_TEMP104.dReg;


				final int RX10_TEMP106 = Program.searchPointInRegion1(RX10_TEMP105, i,myUniquePlacePoint);


				final int RX10_TEMP107 = 0;


				final boolean RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107;

				if(RX10_TEMP108)
					{

					String RX10_TEMP109 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP109);

					}

				final int RX10_TEMP110 = Program.getPlaceFromDist1(RX10_TEMP104, RX10_TEMP106,myUniquePlacePoint);


				final int RX10_TEMP112 = 0;


				final boolean RX10_TEMP113 = RX10_TEMP110 != RX10_TEMP112;

				if(RX10_TEMP113)
					{

					String RX10_TEMP111 = "Bad place access for array Z";

					throw new RuntimeException(RX10_TEMP111);

					}
				Program.setRefArrayValue1int(Z, RX10_TEMP106, X10_TEMP96,myUniquePlacePoint);
				continue;
				}

			final int X10_TEMP98 = 15;


			final int X10_TEMP99 = 0;


			int X10_TEMP101 = X10_TEMP99 - X10_TEMP98;


			int RX10_TEMP114 = i.f0;


			RX10_TEMP114 = RX10_TEMP114 + X10_TEMP101;


			final Point1 X10_TEMP103 = new Point1(RX10_TEMP114,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP103.hashCode());


			final Dist1 RX10_TEMP115 = Z.distValue;


			final Region1 RX10_TEMP116 = RX10_TEMP115.dReg;


			final int RX10_TEMP117 = Program.searchPointInRegion1(RX10_TEMP116, X10_TEMP103,myUniquePlacePoint);


			final int RX10_TEMP118 = 0;


			final boolean RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118;

			if(RX10_TEMP119)
				{

				String RX10_TEMP120 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP120);

				}

			final int RX10_TEMP121 = Program.getPlaceFromDist1(RX10_TEMP115, RX10_TEMP117,myUniquePlacePoint);


			final int RX10_TEMP123 = 0;


			final boolean RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123;

			if(RX10_TEMP124)
				{

				String RX10_TEMP122 = "Bad place access for array Z";

				throw new RuntimeException(RX10_TEMP122);

				}

			final int RX10_TEMP125 = Program.getRefArrayValue1int(Z, RX10_TEMP117,myUniquePlacePoint);


			final int X10_TEMP104 = RX10_TEMP125;


			final int X10_TEMP105 = 9;


			final int X10_TEMP107 = X10_TEMP104 >>> X10_TEMP105;


			final int X10_TEMP108 = 14;


			final int X10_TEMP109 = 0;


			int X10_TEMP111 = X10_TEMP109 - X10_TEMP108;


			int RX10_TEMP126 = i.f0;


			RX10_TEMP126 = RX10_TEMP126 + X10_TEMP111;


			final Point1 X10_TEMP113 = new Point1(RX10_TEMP126,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP113.hashCode());


			final Dist1 RX10_TEMP127 = Z.distValue;


			final Region1 RX10_TEMP128 = RX10_TEMP127.dReg;


			final int RX10_TEMP129 = Program.searchPointInRegion1(RX10_TEMP128, X10_TEMP113,myUniquePlacePoint);


			final int RX10_TEMP130 = 0;


			final boolean RX10_TEMP131 = RX10_TEMP129 < RX10_TEMP130;

			if(RX10_TEMP131)
				{

				String RX10_TEMP132 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP132);

				}

			final int RX10_TEMP133 = Program.getPlaceFromDist1(RX10_TEMP127, RX10_TEMP129,myUniquePlacePoint);


			final int RX10_TEMP135 = 0;


			final boolean RX10_TEMP136 = RX10_TEMP133 != RX10_TEMP135;

			if(RX10_TEMP136)
				{

				String RX10_TEMP134 = "Bad place access for array Z";

				throw new RuntimeException(RX10_TEMP134);

				}

			final int RX10_TEMP137 = Program.getRefArrayValue1int(Z, RX10_TEMP129,myUniquePlacePoint);


			final int X10_TEMP114 = RX10_TEMP137;


			final int X10_TEMP115 = 7;


			final int X10_TEMP117 = X10_TEMP114 << X10_TEMP115;


			final int X10_TEMP119 = X10_TEMP107 | X10_TEMP117;


			final int X10_TEMP120 = 0xFFFF;


			final int X10_TEMP123 = X10_TEMP119 & X10_TEMP120;


			final int X10_TEMP124 = X10_TEMP123;


			final Dist1 RX10_TEMP138 = Z.distValue;


			final Region1 RX10_TEMP139 = RX10_TEMP138.dReg;


			final int RX10_TEMP140 = Program.searchPointInRegion1(RX10_TEMP139, i,myUniquePlacePoint);


			final int RX10_TEMP141 = 0;


			final boolean RX10_TEMP142 = RX10_TEMP140 < RX10_TEMP141;

			if(RX10_TEMP142)
				{

				String RX10_TEMP143 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP143);

				}

			final int RX10_TEMP144 = Program.getPlaceFromDist1(RX10_TEMP138, RX10_TEMP140,myUniquePlacePoint);


			final int RX10_TEMP146 = 0;


			final boolean RX10_TEMP147 = RX10_TEMP144 != RX10_TEMP146;

			if(RX10_TEMP147)
				{

				String RX10_TEMP145 = "Bad place access for array Z";

				throw new RuntimeException(RX10_TEMP145);

				}
			Program.setRefArrayValue1int(Z, RX10_TEMP140, X10_TEMP124,myUniquePlacePoint);
			}

		final Region1 RX10_TEMP148 = rZ;


		final int RX10_TEMP163 = rZ.regSize;


		final int RX10_TEMP164 = 1;


		final int RX10_TEMP165 = RX10_TEMP163 - RX10_TEMP164;


		final int  RX10_TEMP162 = RX10_TEMP165+1;


		final int[] RX10_TEMP166 = (int[])(new int/*value*/[RX10_TEMP162]);
/*arrayInitBlock*/
for(int RX10_TEMP149= 0;RX10_TEMP149 <RX10_TEMP166.length ;RX10_TEMP149++ )			{

			final int RX10_TEMP150 = RX10_TEMP149;


			final Point1 pt = Program.regionOrdinalPoint1(RX10_TEMP148, RX10_TEMP150,myUniquePlacePoint);


			final Dist1 RX10_TEMP151 = Z.distValue;


			final Region1 RX10_TEMP152 = RX10_TEMP151.dReg;


			final int RX10_TEMP153 = Program.searchPointInRegion1(RX10_TEMP152, pt,myUniquePlacePoint);


			final int RX10_TEMP154 = 0;


			final boolean RX10_TEMP155 = RX10_TEMP153 < RX10_TEMP154;

			if(RX10_TEMP155)
				{

				String RX10_TEMP156 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP156);

				}

			final int RX10_TEMP157 = Program.getPlaceFromDist1(RX10_TEMP151, RX10_TEMP153,myUniquePlacePoint);


			final int RX10_TEMP159 = 0;


			final boolean RX10_TEMP160 = RX10_TEMP157 != RX10_TEMP159;

			if(RX10_TEMP160)
				{

				String RX10_TEMP158 = "Bad place access for array Z";

				throw new RuntimeException(RX10_TEMP158);

				}

			final int RX10_TEMP161 = Program.getRefArrayValue1int(Z, RX10_TEMP153,myUniquePlacePoint);


			final int X10_TEMP127 = RX10_TEMP161;

			RX10_TEMP166[RX10_TEMP149] =X10_TEMP127;
			}

;


		final intValArray1 RX10_TEMP167 = new intValArray1(rZ, RX10_TEMP166,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP167.hashCode());


		final intValArray1 X10_TEMP128 = RX10_TEMP167;

		return X10_TEMP128;
		}
public void IDEATest_calcDecryptKey ( final intValArray1 aZR, int myUniquePlacePoint)
		{

		int j = 0;


		int k = 0;


		int t1 = 0;


		int t2 = 0;


		int t3 = 0;


		final int X10_TEMP8 = 0;


		final int X10_TEMP9 = 51;


		final Region1 rDK = Program.createNewRegion1R(X10_TEMP8, X10_TEMP9,myUniquePlacePoint);


		final int X10_TEMP11 = 0;


		final Dist1 dDK = Program.getPlaceDist1(rDK, X10_TEMP11,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dDK.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final intStub[] RX10_TEMP6 = new intStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dDK, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final int[] RX10_TEMP14 = new int[RX10_TEMP13];


					final intStub RX10_TEMP15 = new intStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final intStub[] RX10_TEMP16 = (intStub[])(new intStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final intStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final intRefArray1 RX10_TEMP19 = new intRefArray1(dDK, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final intRefArray1 DK = RX10_TEMP19;


		final intValArray1 Z = aZR;


		final int X10_TEMP17 = 0;


		final Point1 RX10_TEMP20 = new Point1(X10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final Region1 RX10_TEMP21 = Z.regionValue;


		final int RX10_TEMP22 = Program.searchPointInRegion1(RX10_TEMP21, RX10_TEMP20,myUniquePlacePoint);


		final int RX10_TEMP23 = 0;


		final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23;

		if(RX10_TEMP24)
			{

			String RX10_TEMP25 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP25);

			}

		final int[] RX10_TEMP26 = (int[])(Z.contents);


		final int X10_TEMP19 = RX10_TEMP26[RX10_TEMP22];


		final int X10_TEMP21 = this.IDEATest_inv(X10_TEMP19,myUniquePlacePoint);


		t1 = X10_TEMP21;


		final int X10_TEMP23 = 1;


		final Point1 RX10_TEMP27 = new Point1(X10_TEMP23,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP27.hashCode());


		final Region1 RX10_TEMP28 = Z.regionValue;


		final int RX10_TEMP29 = Program.searchPointInRegion1(RX10_TEMP28, RX10_TEMP27,myUniquePlacePoint);


		final int RX10_TEMP30 = 0;


		final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;

		if(RX10_TEMP31)
			{

			String RX10_TEMP32 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP32);

			}

		final int[] RX10_TEMP33 = (int[])(Z.contents);


		final int X10_TEMP24 = RX10_TEMP33[RX10_TEMP29];


		final int X10_TEMP25 = 0;


		final int X10_TEMP26 = X10_TEMP25 - X10_TEMP24;


		final int X10_TEMP27 = 0xffff;


		final int X10_TEMP29 = X10_TEMP26 & X10_TEMP27;


		t2 = X10_TEMP29;


		final int X10_TEMP31 = 2;


		final Point1 RX10_TEMP34 = new Point1(X10_TEMP31,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP34.hashCode());


		final Region1 RX10_TEMP35 = Z.regionValue;


		final int RX10_TEMP36 = Program.searchPointInRegion1(RX10_TEMP35, RX10_TEMP34,myUniquePlacePoint);


		final int RX10_TEMP37 = 0;


		final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;

		if(RX10_TEMP38)
			{

			String RX10_TEMP39 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP39);

			}

		final int[] RX10_TEMP40 = (int[])(Z.contents);


		final int X10_TEMP32 = RX10_TEMP40[RX10_TEMP36];


		final int X10_TEMP33 = 0;


		final int X10_TEMP34 = X10_TEMP33 - X10_TEMP32;


		final int X10_TEMP35 = 0xffff;


		final int X10_TEMP37 = X10_TEMP34 & X10_TEMP35;


		t3 = X10_TEMP37;


		final int X10_TEMP39 = 51;


		final int X10_TEMP42 = 3;


		final Point1 RX10_TEMP41 = new Point1(X10_TEMP42,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP41.hashCode());


		final Region1 RX10_TEMP42 = Z.regionValue;


		final int RX10_TEMP43 = Program.searchPointInRegion1(RX10_TEMP42, RX10_TEMP41,myUniquePlacePoint);


		final int RX10_TEMP44 = 0;


		final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;

		if(RX10_TEMP45)
			{

			String RX10_TEMP46 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP46);

			}

		final int[] RX10_TEMP47 = (int[])(Z.contents);


		final int X10_TEMP44 = RX10_TEMP47[RX10_TEMP43];


		final int X10_TEMP47 = this.IDEATest_inv(X10_TEMP44,myUniquePlacePoint);


		final int X10_TEMP48 = X10_TEMP47;


		final Point1 RX10_TEMP48 = new Point1(X10_TEMP39,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP48.hashCode());


		final Dist1 RX10_TEMP49 = DK.distValue;


		final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;


		final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50, RX10_TEMP48,myUniquePlacePoint);


		final int RX10_TEMP52 = 0;


		final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;

		if(RX10_TEMP53)
			{

			String RX10_TEMP54 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP54);

			}

		final int RX10_TEMP55 = Program.getPlaceFromDist1(RX10_TEMP49, RX10_TEMP51,myUniquePlacePoint);


		final int RX10_TEMP57 = 0;


		final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;

		if(RX10_TEMP58)
			{

			String RX10_TEMP56 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP56);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP51, X10_TEMP48,myUniquePlacePoint);

		final int X10_TEMP50 = 50;


		final int X10_TEMP53 = t3;


		final Point1 RX10_TEMP59 = new Point1(X10_TEMP50,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP59.hashCode());


		final Dist1 RX10_TEMP60 = DK.distValue;


		final Region1 RX10_TEMP61 = RX10_TEMP60.dReg;


		final int RX10_TEMP62 = Program.searchPointInRegion1(RX10_TEMP61, RX10_TEMP59,myUniquePlacePoint);


		final int RX10_TEMP63 = 0;


		final boolean RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63;

		if(RX10_TEMP64)
			{

			String RX10_TEMP65 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP65);

			}

		final int RX10_TEMP66 = Program.getPlaceFromDist1(RX10_TEMP60, RX10_TEMP62,myUniquePlacePoint);


		final int RX10_TEMP68 = 0;


		final boolean RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68;

		if(RX10_TEMP69)
			{

			String RX10_TEMP67 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP67);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP62, X10_TEMP53,myUniquePlacePoint);

		final int X10_TEMP55 = 49;


		final int X10_TEMP58 = t2;


		final Point1 RX10_TEMP70 = new Point1(X10_TEMP55,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP70.hashCode());


		final Dist1 RX10_TEMP71 = DK.distValue;


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

			String RX10_TEMP78 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP78);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP73, X10_TEMP58,myUniquePlacePoint);

		final int X10_TEMP60 = 48;


		final int X10_TEMP63 = t1;


		final Point1 RX10_TEMP81 = new Point1(X10_TEMP60,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP81.hashCode());


		final Dist1 RX10_TEMP82 = DK.distValue;


		final Region1 RX10_TEMP83 = RX10_TEMP82.dReg;


		final int RX10_TEMP84 = Program.searchPointInRegion1(RX10_TEMP83, RX10_TEMP81,myUniquePlacePoint);


		final int RX10_TEMP85 = 0;


		final boolean RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85;

		if(RX10_TEMP86)
			{

			String RX10_TEMP87 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP87);

			}

		final int RX10_TEMP88 = Program.getPlaceFromDist1(RX10_TEMP82, RX10_TEMP84,myUniquePlacePoint);


		final int RX10_TEMP90 = 0;


		final boolean RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90;

		if(RX10_TEMP91)
			{

			String RX10_TEMP89 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP89);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP84, X10_TEMP63,myUniquePlacePoint);

		final int X10_TEMP65 = 47;


		j = X10_TEMP65;


		final int X10_TEMP67 = 4;


		k = X10_TEMP67;


		final int X10_TEMP70 = 0;


		final int X10_TEMP71 = 6;


		final Region1 X10_TEMP73 = Program.createNewRegion1R(X10_TEMP70, X10_TEMP71,myUniquePlacePoint);


		final int RX10_TEMP95 = 1;


		int RX10_TEMP93 = X10_TEMP73.regSize;


		RX10_TEMP93 = RX10_TEMP93 - RX10_TEMP95;


		final int  RX10_TEMP94 = RX10_TEMP93+1;

		for(int RX10_TEMP92=0; RX10_TEMP92 < RX10_TEMP94; RX10_TEMP92++)
			{

			final int RX10_TEMP96 = RX10_TEMP92;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP73, RX10_TEMP96,myUniquePlacePoint);


			final int X10_TEMP74 = k;


			final int X10_TEMP75 = 1;


			k = k + X10_TEMP75;


			final Point1 RX10_TEMP97 = new Point1(X10_TEMP74,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP97.hashCode());


			final Region1 RX10_TEMP98 = Z.regionValue;


			final int RX10_TEMP99 = Program.searchPointInRegion1(RX10_TEMP98, RX10_TEMP97,myUniquePlacePoint);


			final int RX10_TEMP100 = 0;


			final boolean RX10_TEMP101 = RX10_TEMP99 < RX10_TEMP100;

			if(RX10_TEMP101)
				{

				String RX10_TEMP102 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP102);

				}

			final int[] RX10_TEMP103 = (int[])(Z.contents);


			final int X10_TEMP78 = RX10_TEMP103[RX10_TEMP99];


			t1 = X10_TEMP78;


			final int X10_TEMP79 = j;


			final int X10_TEMP80 = 1;


			j = j - X10_TEMP80;


			final int X10_TEMP82 = k;


			final int X10_TEMP83 = 1;


			k = k + X10_TEMP83;


			final Point1 RX10_TEMP104 = new Point1(X10_TEMP82,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP104.hashCode());


			final Region1 RX10_TEMP105 = Z.regionValue;


			final int RX10_TEMP106 = Program.searchPointInRegion1(RX10_TEMP105, RX10_TEMP104,myUniquePlacePoint);


			final int RX10_TEMP107 = 0;


			final boolean RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107;

			if(RX10_TEMP108)
				{

				String RX10_TEMP109 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP109);

				}

			final int[] RX10_TEMP110 = (int[])(Z.contents);


			final int X10_TEMP87 = RX10_TEMP110[RX10_TEMP106];


			final int X10_TEMP88 = X10_TEMP87;


			final Point1 RX10_TEMP111 = new Point1(X10_TEMP79,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP111.hashCode());


			final Dist1 RX10_TEMP112 = DK.distValue;


			final Region1 RX10_TEMP113 = RX10_TEMP112.dReg;


			final int RX10_TEMP114 = Program.searchPointInRegion1(RX10_TEMP113, RX10_TEMP111,myUniquePlacePoint);


			final int RX10_TEMP115 = 0;


			final boolean RX10_TEMP116 = RX10_TEMP114 < RX10_TEMP115;

			if(RX10_TEMP116)
				{

				String RX10_TEMP117 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP117);

				}

			final int RX10_TEMP118 = Program.getPlaceFromDist1(RX10_TEMP112, RX10_TEMP114,myUniquePlacePoint);


			final int RX10_TEMP120 = 0;


			final boolean RX10_TEMP121 = RX10_TEMP118 != RX10_TEMP120;

			if(RX10_TEMP121)
				{

				String RX10_TEMP119 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP119);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP114, X10_TEMP88,myUniquePlacePoint);

			final int X10_TEMP89 = j;


			final int X10_TEMP90 = 1;


			j = j - X10_TEMP90;


			final int X10_TEMP94 = t1;


			final Point1 RX10_TEMP122 = new Point1(X10_TEMP89,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP122.hashCode());


			final Dist1 RX10_TEMP123 = DK.distValue;


			final Region1 RX10_TEMP124 = RX10_TEMP123.dReg;


			final int RX10_TEMP125 = Program.searchPointInRegion1(RX10_TEMP124, RX10_TEMP122,myUniquePlacePoint);


			final int RX10_TEMP126 = 0;


			final boolean RX10_TEMP127 = RX10_TEMP125 < RX10_TEMP126;

			if(RX10_TEMP127)
				{

				String RX10_TEMP128 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP128);

				}

			final int RX10_TEMP129 = Program.getPlaceFromDist1(RX10_TEMP123, RX10_TEMP125,myUniquePlacePoint);


			final int RX10_TEMP131 = 0;


			final boolean RX10_TEMP132 = RX10_TEMP129 != RX10_TEMP131;

			if(RX10_TEMP132)
				{

				String RX10_TEMP130 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP130);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP125, X10_TEMP94,myUniquePlacePoint);

			final int X10_TEMP96 = k;


			final int X10_TEMP97 = 1;


			k = k + X10_TEMP97;


			final Point1 RX10_TEMP133 = new Point1(X10_TEMP96,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP133.hashCode());


			final Region1 RX10_TEMP134 = Z.regionValue;


			final int RX10_TEMP135 = Program.searchPointInRegion1(RX10_TEMP134, RX10_TEMP133,myUniquePlacePoint);


			final int RX10_TEMP136 = 0;


			final boolean RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136;

			if(RX10_TEMP137)
				{

				String RX10_TEMP138 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP138);

				}

			final int[] RX10_TEMP139 = (int[])(Z.contents);


			final int X10_TEMP100 = RX10_TEMP139[RX10_TEMP135];


			final int X10_TEMP102 = this.IDEATest_inv(X10_TEMP100,myUniquePlacePoint);


			t1 = X10_TEMP102;


			final int X10_TEMP103 = k;


			final int X10_TEMP104 = 1;


			k = k + X10_TEMP104;


			final Point1 RX10_TEMP140 = new Point1(X10_TEMP103,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP140.hashCode());


			final Region1 RX10_TEMP141 = Z.regionValue;


			final int RX10_TEMP142 = Program.searchPointInRegion1(RX10_TEMP141, RX10_TEMP140,myUniquePlacePoint);


			final int RX10_TEMP143 = 0;


			final boolean RX10_TEMP144 = RX10_TEMP142 < RX10_TEMP143;

			if(RX10_TEMP144)
				{

				String RX10_TEMP145 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP145);

				}

			final int[] RX10_TEMP146 = (int[])(Z.contents);


			final int X10_TEMP106 = RX10_TEMP146[RX10_TEMP142];


			final int X10_TEMP107 = 0;


			final int X10_TEMP108 = X10_TEMP107 - X10_TEMP106;


			final int X10_TEMP109 = 0xffff;


			final int X10_TEMP111 = X10_TEMP108 & X10_TEMP109;


			t2 = X10_TEMP111;


			final int X10_TEMP112 = k;


			final int X10_TEMP113 = 1;


			k = k + X10_TEMP113;


			final Point1 RX10_TEMP147 = new Point1(X10_TEMP112,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP147.hashCode());


			final Region1 RX10_TEMP148 = Z.regionValue;


			final int RX10_TEMP149 = Program.searchPointInRegion1(RX10_TEMP148, RX10_TEMP147,myUniquePlacePoint);


			final int RX10_TEMP150 = 0;


			final boolean RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150;

			if(RX10_TEMP151)
				{

				String RX10_TEMP152 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP152);

				}

			final int[] RX10_TEMP153 = (int[])(Z.contents);


			final int X10_TEMP115 = RX10_TEMP153[RX10_TEMP149];


			final int X10_TEMP116 = 0;


			final int X10_TEMP117 = X10_TEMP116 - X10_TEMP115;


			final int X10_TEMP118 = 0xffff;


			final int X10_TEMP120 = X10_TEMP117 & X10_TEMP118;


			t3 = X10_TEMP120;


			final int X10_TEMP121 = j;


			final int X10_TEMP122 = 1;


			j = j - X10_TEMP122;


			final int X10_TEMP125 = k;


			final int X10_TEMP126 = 1;


			k = k + X10_TEMP126;


			final Point1 RX10_TEMP154 = new Point1(X10_TEMP125,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP154.hashCode());


			final Region1 RX10_TEMP155 = Z.regionValue;


			final int RX10_TEMP156 = Program.searchPointInRegion1(RX10_TEMP155, RX10_TEMP154,myUniquePlacePoint);


			final int RX10_TEMP157 = 0;


			final boolean RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157;

			if(RX10_TEMP158)
				{

				String RX10_TEMP159 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP159);

				}

			final int[] RX10_TEMP160 = (int[])(Z.contents);


			final int X10_TEMP129 = RX10_TEMP160[RX10_TEMP156];


			final int X10_TEMP132 = this.IDEATest_inv(X10_TEMP129,myUniquePlacePoint);


			final int X10_TEMP133 = X10_TEMP132;


			final Point1 RX10_TEMP161 = new Point1(X10_TEMP121,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP161.hashCode());


			final Dist1 RX10_TEMP162 = DK.distValue;


			final Region1 RX10_TEMP163 = RX10_TEMP162.dReg;


			final int RX10_TEMP164 = Program.searchPointInRegion1(RX10_TEMP163, RX10_TEMP161,myUniquePlacePoint);


			final int RX10_TEMP165 = 0;


			final boolean RX10_TEMP166 = RX10_TEMP164 < RX10_TEMP165;

			if(RX10_TEMP166)
				{

				String RX10_TEMP167 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP167);

				}

			final int RX10_TEMP168 = Program.getPlaceFromDist1(RX10_TEMP162, RX10_TEMP164,myUniquePlacePoint);


			final int RX10_TEMP170 = 0;


			final boolean RX10_TEMP171 = RX10_TEMP168 != RX10_TEMP170;

			if(RX10_TEMP171)
				{

				String RX10_TEMP169 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP169);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP164, X10_TEMP133,myUniquePlacePoint);

			final int X10_TEMP134 = j;


			final int X10_TEMP135 = 1;


			j = j - X10_TEMP135;


			final int X10_TEMP139 = t2;


			final Point1 RX10_TEMP172 = new Point1(X10_TEMP134,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP172.hashCode());


			final Dist1 RX10_TEMP173 = DK.distValue;


			final Region1 RX10_TEMP174 = RX10_TEMP173.dReg;


			final int RX10_TEMP175 = Program.searchPointInRegion1(RX10_TEMP174, RX10_TEMP172,myUniquePlacePoint);


			final int RX10_TEMP176 = 0;


			final boolean RX10_TEMP177 = RX10_TEMP175 < RX10_TEMP176;

			if(RX10_TEMP177)
				{

				String RX10_TEMP178 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP178);

				}

			final int RX10_TEMP179 = Program.getPlaceFromDist1(RX10_TEMP173, RX10_TEMP175,myUniquePlacePoint);


			final int RX10_TEMP181 = 0;


			final boolean RX10_TEMP182 = RX10_TEMP179 != RX10_TEMP181;

			if(RX10_TEMP182)
				{

				String RX10_TEMP180 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP180);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP175, X10_TEMP139,myUniquePlacePoint);

			final int X10_TEMP140 = j;


			final int X10_TEMP141 = 1;


			j = j - X10_TEMP141;


			final int X10_TEMP145 = t3;


			final Point1 RX10_TEMP183 = new Point1(X10_TEMP140,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP183.hashCode());


			final Dist1 RX10_TEMP184 = DK.distValue;


			final Region1 RX10_TEMP185 = RX10_TEMP184.dReg;


			final int RX10_TEMP186 = Program.searchPointInRegion1(RX10_TEMP185, RX10_TEMP183,myUniquePlacePoint);


			final int RX10_TEMP187 = 0;


			final boolean RX10_TEMP188 = RX10_TEMP186 < RX10_TEMP187;

			if(RX10_TEMP188)
				{

				String RX10_TEMP189 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP189);

				}

			final int RX10_TEMP190 = Program.getPlaceFromDist1(RX10_TEMP184, RX10_TEMP186,myUniquePlacePoint);


			final int RX10_TEMP192 = 0;


			final boolean RX10_TEMP193 = RX10_TEMP190 != RX10_TEMP192;

			if(RX10_TEMP193)
				{

				String RX10_TEMP191 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP191);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP186, X10_TEMP145,myUniquePlacePoint);

			final int X10_TEMP146 = j;


			final int X10_TEMP147 = 1;


			j = j - X10_TEMP147;


			final int X10_TEMP151 = t1;


			final Point1 RX10_TEMP194 = new Point1(X10_TEMP146,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP194.hashCode());


			final Dist1 RX10_TEMP195 = DK.distValue;


			final Region1 RX10_TEMP196 = RX10_TEMP195.dReg;


			final int RX10_TEMP197 = Program.searchPointInRegion1(RX10_TEMP196, RX10_TEMP194,myUniquePlacePoint);


			final int RX10_TEMP198 = 0;


			final boolean RX10_TEMP199 = RX10_TEMP197 < RX10_TEMP198;

			if(RX10_TEMP199)
				{

				String RX10_TEMP200 = "Array index out of bounds";

				throw new RuntimeException(RX10_TEMP200);

				}

			final int RX10_TEMP201 = Program.getPlaceFromDist1(RX10_TEMP195, RX10_TEMP197,myUniquePlacePoint);


			final int RX10_TEMP203 = 0;


			final boolean RX10_TEMP204 = RX10_TEMP201 != RX10_TEMP203;

			if(RX10_TEMP204)
				{

				String RX10_TEMP202 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP202);

				}
			Program.setRefArrayValue1int(DK, RX10_TEMP197, X10_TEMP151,myUniquePlacePoint);
			}

		final int X10_TEMP152 = k;


		final int X10_TEMP153 = 1;


		k = k + X10_TEMP153;


		final Point1 RX10_TEMP205 = new Point1(X10_TEMP152,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP205.hashCode());


		final Region1 RX10_TEMP206 = Z.regionValue;


		final int RX10_TEMP207 = Program.searchPointInRegion1(RX10_TEMP206, RX10_TEMP205,myUniquePlacePoint);


		final int RX10_TEMP208 = 0;


		final boolean RX10_TEMP209 = RX10_TEMP207 < RX10_TEMP208;

		if(RX10_TEMP209)
			{

			String RX10_TEMP210 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP210);

			}

		final int[] RX10_TEMP211 = (int[])(Z.contents);


		final int X10_TEMP156 = RX10_TEMP211[RX10_TEMP207];


		t1 = X10_TEMP156;


		final int X10_TEMP157 = j;


		final int X10_TEMP158 = 1;


		j = j - X10_TEMP158;


		final int X10_TEMP160 = k;


		final int X10_TEMP161 = 1;


		k = k + X10_TEMP161;


		final Point1 RX10_TEMP212 = new Point1(X10_TEMP160,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP212.hashCode());


		final Region1 RX10_TEMP213 = Z.regionValue;


		final int RX10_TEMP214 = Program.searchPointInRegion1(RX10_TEMP213, RX10_TEMP212,myUniquePlacePoint);


		final int RX10_TEMP215 = 0;


		final boolean RX10_TEMP216 = RX10_TEMP214 < RX10_TEMP215;

		if(RX10_TEMP216)
			{

			String RX10_TEMP217 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP217);

			}

		final int[] RX10_TEMP218 = (int[])(Z.contents);


		final int X10_TEMP165 = RX10_TEMP218[RX10_TEMP214];


		final int X10_TEMP166 = X10_TEMP165;


		final Point1 RX10_TEMP219 = new Point1(X10_TEMP157,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP219.hashCode());


		final Dist1 RX10_TEMP220 = DK.distValue;


		final Region1 RX10_TEMP221 = RX10_TEMP220.dReg;


		final int RX10_TEMP222 = Program.searchPointInRegion1(RX10_TEMP221, RX10_TEMP219,myUniquePlacePoint);


		final int RX10_TEMP223 = 0;


		final boolean RX10_TEMP224 = RX10_TEMP222 < RX10_TEMP223;

		if(RX10_TEMP224)
			{

			String RX10_TEMP225 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP225);

			}

		final int RX10_TEMP226 = Program.getPlaceFromDist1(RX10_TEMP220, RX10_TEMP222,myUniquePlacePoint);


		final int RX10_TEMP228 = 0;


		final boolean RX10_TEMP229 = RX10_TEMP226 != RX10_TEMP228;

		if(RX10_TEMP229)
			{

			String RX10_TEMP227 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP227);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP222, X10_TEMP166,myUniquePlacePoint);

		final int X10_TEMP167 = j;


		final int X10_TEMP168 = 1;


		j = j - X10_TEMP168;


		final int X10_TEMP172 = t1;


		final Point1 RX10_TEMP230 = new Point1(X10_TEMP167,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP230.hashCode());


		final Dist1 RX10_TEMP231 = DK.distValue;


		final Region1 RX10_TEMP232 = RX10_TEMP231.dReg;


		final int RX10_TEMP233 = Program.searchPointInRegion1(RX10_TEMP232, RX10_TEMP230,myUniquePlacePoint);


		final int RX10_TEMP234 = 0;


		final boolean RX10_TEMP235 = RX10_TEMP233 < RX10_TEMP234;

		if(RX10_TEMP235)
			{

			String RX10_TEMP236 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP236);

			}

		final int RX10_TEMP237 = Program.getPlaceFromDist1(RX10_TEMP231, RX10_TEMP233,myUniquePlacePoint);


		final int RX10_TEMP239 = 0;


		final boolean RX10_TEMP240 = RX10_TEMP237 != RX10_TEMP239;

		if(RX10_TEMP240)
			{

			String RX10_TEMP238 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP238);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP233, X10_TEMP172,myUniquePlacePoint);

		final int X10_TEMP174 = k;


		final int X10_TEMP175 = 1;


		k = k + X10_TEMP175;


		final Point1 RX10_TEMP241 = new Point1(X10_TEMP174,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP241.hashCode());


		final Region1 RX10_TEMP242 = Z.regionValue;


		final int RX10_TEMP243 = Program.searchPointInRegion1(RX10_TEMP242, RX10_TEMP241,myUniquePlacePoint);


		final int RX10_TEMP244 = 0;


		final boolean RX10_TEMP245 = RX10_TEMP243 < RX10_TEMP244;

		if(RX10_TEMP245)
			{

			String RX10_TEMP246 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP246);

			}

		final int[] RX10_TEMP247 = (int[])(Z.contents);


		final int X10_TEMP178 = RX10_TEMP247[RX10_TEMP243];


		final int X10_TEMP180 = this.IDEATest_inv(X10_TEMP178,myUniquePlacePoint);


		t1 = X10_TEMP180;


		final int X10_TEMP181 = k;


		final int X10_TEMP182 = 1;


		k = k + X10_TEMP182;


		final Point1 RX10_TEMP248 = new Point1(X10_TEMP181,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP248.hashCode());


		final Region1 RX10_TEMP249 = Z.regionValue;


		final int RX10_TEMP250 = Program.searchPointInRegion1(RX10_TEMP249, RX10_TEMP248,myUniquePlacePoint);


		final int RX10_TEMP251 = 0;


		final boolean RX10_TEMP252 = RX10_TEMP250 < RX10_TEMP251;

		if(RX10_TEMP252)
			{

			String RX10_TEMP253 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP253);

			}

		final int[] RX10_TEMP254 = (int[])(Z.contents);


		final int X10_TEMP184 = RX10_TEMP254[RX10_TEMP250];


		final int X10_TEMP185 = 0;


		final int X10_TEMP186 = X10_TEMP185 - X10_TEMP184;


		final int X10_TEMP187 = 0xffff;


		final int X10_TEMP189 = X10_TEMP186 & X10_TEMP187;


		t2 = X10_TEMP189;


		final int X10_TEMP190 = k;


		final int X10_TEMP191 = 1;


		k = k + X10_TEMP191;


		final Point1 RX10_TEMP255 = new Point1(X10_TEMP190,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP255.hashCode());


		final Region1 RX10_TEMP256 = Z.regionValue;


		final int RX10_TEMP257 = Program.searchPointInRegion1(RX10_TEMP256, RX10_TEMP255,myUniquePlacePoint);


		final int RX10_TEMP258 = 0;


		final boolean RX10_TEMP259 = RX10_TEMP257 < RX10_TEMP258;

		if(RX10_TEMP259)
			{

			String RX10_TEMP260 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP260);

			}

		final int[] RX10_TEMP261 = (int[])(Z.contents);


		final int X10_TEMP193 = RX10_TEMP261[RX10_TEMP257];


		final int X10_TEMP194 = 0;


		final int X10_TEMP195 = X10_TEMP194 - X10_TEMP193;


		final int X10_TEMP196 = 0xffff;


		final int X10_TEMP198 = X10_TEMP195 & X10_TEMP196;


		t3 = X10_TEMP198;


		final int X10_TEMP199 = j;


		final int X10_TEMP200 = 1;


		j = j - X10_TEMP200;


		final int X10_TEMP203 = k;


		final int X10_TEMP204 = 1;


		k = k + X10_TEMP204;


		final Point1 RX10_TEMP262 = new Point1(X10_TEMP203,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP262.hashCode());


		final Region1 RX10_TEMP263 = Z.regionValue;


		final int RX10_TEMP264 = Program.searchPointInRegion1(RX10_TEMP263, RX10_TEMP262,myUniquePlacePoint);


		final int RX10_TEMP265 = 0;


		final boolean RX10_TEMP266 = RX10_TEMP264 < RX10_TEMP265;

		if(RX10_TEMP266)
			{

			String RX10_TEMP267 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP267);

			}

		final int[] RX10_TEMP268 = (int[])(Z.contents);


		final int X10_TEMP207 = RX10_TEMP268[RX10_TEMP264];


		final int X10_TEMP210 = this.IDEATest_inv(X10_TEMP207,myUniquePlacePoint);


		final int X10_TEMP211 = X10_TEMP210;


		final Point1 RX10_TEMP269 = new Point1(X10_TEMP199,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP269.hashCode());


		final Dist1 RX10_TEMP270 = DK.distValue;


		final Region1 RX10_TEMP271 = RX10_TEMP270.dReg;


		final int RX10_TEMP272 = Program.searchPointInRegion1(RX10_TEMP271, RX10_TEMP269,myUniquePlacePoint);


		final int RX10_TEMP273 = 0;


		final boolean RX10_TEMP274 = RX10_TEMP272 < RX10_TEMP273;

		if(RX10_TEMP274)
			{

			String RX10_TEMP275 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP275);

			}

		final int RX10_TEMP276 = Program.getPlaceFromDist1(RX10_TEMP270, RX10_TEMP272,myUniquePlacePoint);


		final int RX10_TEMP278 = 0;


		final boolean RX10_TEMP279 = RX10_TEMP276 != RX10_TEMP278;

		if(RX10_TEMP279)
			{

			String RX10_TEMP277 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP277);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP272, X10_TEMP211,myUniquePlacePoint);

		final int X10_TEMP212 = j;


		final int X10_TEMP213 = 1;


		j = j - X10_TEMP213;


		final int X10_TEMP217 = t3;


		final Point1 RX10_TEMP280 = new Point1(X10_TEMP212,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP280.hashCode());


		final Dist1 RX10_TEMP281 = DK.distValue;


		final Region1 RX10_TEMP282 = RX10_TEMP281.dReg;


		final int RX10_TEMP283 = Program.searchPointInRegion1(RX10_TEMP282, RX10_TEMP280,myUniquePlacePoint);


		final int RX10_TEMP284 = 0;


		final boolean RX10_TEMP285 = RX10_TEMP283 < RX10_TEMP284;

		if(RX10_TEMP285)
			{

			String RX10_TEMP286 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP286);

			}

		final int RX10_TEMP287 = Program.getPlaceFromDist1(RX10_TEMP281, RX10_TEMP283,myUniquePlacePoint);


		final int RX10_TEMP289 = 0;


		final boolean RX10_TEMP290 = RX10_TEMP287 != RX10_TEMP289;

		if(RX10_TEMP290)
			{

			String RX10_TEMP288 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP288);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP283, X10_TEMP217,myUniquePlacePoint);

		final int X10_TEMP218 = j;


		final int X10_TEMP219 = 1;


		j = j - X10_TEMP219;


		final int X10_TEMP223 = t2;


		final Point1 RX10_TEMP291 = new Point1(X10_TEMP218,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP291.hashCode());


		final Dist1 RX10_TEMP292 = DK.distValue;


		final Region1 RX10_TEMP293 = RX10_TEMP292.dReg;


		final int RX10_TEMP294 = Program.searchPointInRegion1(RX10_TEMP293, RX10_TEMP291,myUniquePlacePoint);


		final int RX10_TEMP295 = 0;


		final boolean RX10_TEMP296 = RX10_TEMP294 < RX10_TEMP295;

		if(RX10_TEMP296)
			{

			String RX10_TEMP297 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP297);

			}

		final int RX10_TEMP298 = Program.getPlaceFromDist1(RX10_TEMP292, RX10_TEMP294,myUniquePlacePoint);


		final int RX10_TEMP300 = 0;


		final boolean RX10_TEMP301 = RX10_TEMP298 != RX10_TEMP300;

		if(RX10_TEMP301)
			{

			String RX10_TEMP299 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP299);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP294, X10_TEMP223,myUniquePlacePoint);

		final int X10_TEMP224 = j;


		final int X10_TEMP225 = 1;


		j = j - X10_TEMP225;


		final int X10_TEMP229 = t1;


		final Point1 RX10_TEMP302 = new Point1(X10_TEMP224,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP302.hashCode());


		final Dist1 RX10_TEMP303 = DK.distValue;


		final Region1 RX10_TEMP304 = RX10_TEMP303.dReg;


		final int RX10_TEMP305 = Program.searchPointInRegion1(RX10_TEMP304, RX10_TEMP302,myUniquePlacePoint);


		final int RX10_TEMP306 = 0;


		final boolean RX10_TEMP307 = RX10_TEMP305 < RX10_TEMP306;

		if(RX10_TEMP307)
			{

			String RX10_TEMP308 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP308);

			}

		final int RX10_TEMP309 = Program.getPlaceFromDist1(RX10_TEMP303, RX10_TEMP305,myUniquePlacePoint);


		final int RX10_TEMP311 = 0;


		final boolean RX10_TEMP312 = RX10_TEMP309 != RX10_TEMP311;

		if(RX10_TEMP312)
			{

			String RX10_TEMP310 = "Bad place access for array DK";

			throw new RuntimeException(RX10_TEMP310);

			}
		Program.setRefArrayValue1int(DK, RX10_TEMP305, X10_TEMP229,myUniquePlacePoint);

		final Region1 RX10_TEMP313 = rDK;


		final int RX10_TEMP328 = rDK.regSize;


		final int RX10_TEMP329 = 1;


		final int RX10_TEMP330 = RX10_TEMP328 - RX10_TEMP329;


		final int  RX10_TEMP327 = RX10_TEMP330+1;


		final int[] RX10_TEMP331 = (int[])(new int/*value*/[RX10_TEMP327]);
/*arrayInitBlock*/
for(int RX10_TEMP314= 0;RX10_TEMP314 <RX10_TEMP331.length ;RX10_TEMP314++ )			{

			final int RX10_TEMP315 = RX10_TEMP314;


			final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP313, RX10_TEMP315,myUniquePlacePoint);


			final Dist1 RX10_TEMP316 = DK.distValue;


			final Region1 RX10_TEMP317 = RX10_TEMP316.dReg;


			final int RX10_TEMP318 = Program.searchPointInRegion1(RX10_TEMP317, i,myUniquePlacePoint);


			final int RX10_TEMP319 = 0;


			final boolean RX10_TEMP320 = RX10_TEMP318 < RX10_TEMP319;

			if(RX10_TEMP320)
				{

				String RX10_TEMP321 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP321);

				}

			final int RX10_TEMP322 = Program.getPlaceFromDist1(RX10_TEMP316, RX10_TEMP318,myUniquePlacePoint);


			final int RX10_TEMP324 = 0;


			final boolean RX10_TEMP325 = RX10_TEMP322 != RX10_TEMP324;

			if(RX10_TEMP325)
				{

				String RX10_TEMP323 = "Bad place access for array DK";

				throw new RuntimeException(RX10_TEMP323);

				}

			final int RX10_TEMP326 = Program.getRefArrayValue1int(DK, RX10_TEMP318,myUniquePlacePoint);


			final int X10_TEMP232 = RX10_TEMP326;

			RX10_TEMP331[RX10_TEMP314] =X10_TEMP232;
			}

;


		final intValArray1 RX10_TEMP332 = new intValArray1(rDK, RX10_TEMP331,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP332.hashCode());


		final intValArray1 X10_TEMP233 = RX10_TEMP332;


		DKR = X10_TEMP233;

		}
public int IDEATest_inv ( final int ax, int myUniquePlacePoint)
		{

		int t0 = 0;


		int t1 = 0;


		int q = 0;


		int y = 0;


		int x = ax;


		final int X10_TEMP6 = 1;


		final boolean X10_TEMP8 = x <= X10_TEMP6;

		if(X10_TEMP8)
			{

			final int X10_TEMP10 = x;

			return X10_TEMP10;
			}

		final int X10_TEMP12 = 0x10001;


		final int X10_TEMP14 = X10_TEMP12 / x;


		t1 = X10_TEMP14;


		final int X10_TEMP15 = 0x10001;


		final int X10_TEMP17 = X10_TEMP15 % x;


		y = X10_TEMP17;


		final int X10_TEMP18 = 1;


		final boolean X10_TEMP20 = y == X10_TEMP18;

		if(X10_TEMP20)
			{

			final int X10_TEMP21 = 1;


			final int X10_TEMP23 = X10_TEMP21 - t1;


			final int X10_TEMP24 = 0xFFFF;


			final int X10_TEMP26 = X10_TEMP23 & X10_TEMP24;

			return X10_TEMP26;
			}

		final int X10_TEMP29 = 1;


		t0 = X10_TEMP29;


		boolean X10_TEMP30 = false;

		do 			{

			final int X10_TEMP32 = x / y;


			q = X10_TEMP32;


			final int X10_TEMP34 = x % y;


			x = X10_TEMP34;


			final int X10_TEMP35 = q * t1;


			final int X10_TEMP37 = t0 + X10_TEMP35;


			t0 = X10_TEMP37;


			final int X10_TEMP38 = 1;


			final boolean X10_TEMP40 = x == X10_TEMP38;

			if(X10_TEMP40)
				{

				final int X10_TEMP42 = t0;

				return X10_TEMP42;
				}

			final int X10_TEMP45 = y / x;


			q = X10_TEMP45;


			final int X10_TEMP47 = y % x;


			y = X10_TEMP47;


			final int X10_TEMP48 = q * t0;


			final int X10_TEMP50 = t1 + X10_TEMP48;


			t1 = X10_TEMP50;


			final int X10_TEMP51 = 1;


			X10_TEMP30 = y != X10_TEMP51;

			}
		
 while(X10_TEMP30);
		final int X10_TEMP53 = 1;


		final int X10_TEMP55 = X10_TEMP53 - t1;


		final int X10_TEMP56 = 0xFFFF;


		final int X10_TEMP58 = X10_TEMP55 & X10_TEMP56;

		return X10_TEMP58;
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
	/*value*/ class byteRefArray1 
	 {
 
	public final Dist1 distValue;
	public final byteStub[] contents;


	public byteRefArray1 ( final Dist1 distValue_, final byteStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

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
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;

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
	/*value*/ class intValArray1 
	 {
 
	public final Region1 regionValue;
	public final int[] contents;


	public intValArray1 ( final Region1 regionValue_, final int[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regionValue = regionValue_;


		contents = contents_;

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
	/*value*/ class byteStub 
	 {
 
	public final byte[] localArray;


	public byteStub ( final byte[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class intStub 
	 {
 
	public final int[] localArray;


	public intStub ( final int[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class intRefArray1 
	 {
 
	public final Dist1 distValue;
	public final intStub[] contents;


	public intRefArray1 ( final Dist1 distValue_, final intStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
