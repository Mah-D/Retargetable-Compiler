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

 
public static final int _Stream_MEG = Program._Stream_MEG_init(myUniquePlacePoint);
public static final double _Stream_alpha = Program._Stream_alpha_init(myUniquePlacePoint);
public static final int _Stream_NUM_TIMES = Program._Stream_NUM_TIMES_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);
public static final long _Stream_N0 = Program._Stream_N0_init(myUniquePlacePoint);
public static final long _Stream_N = Program._Stream_N_init(myUniquePlacePoint);
public static final int _Stream_LocalSize = Program._Stream_LocalSize_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES; }else{ x = x-1; } return x;}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);

		final Stream X10_TEMP4 = new Stream(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());

		Program.Stream_run(X10_TEMP4,myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP7 = "Wall-clock time for stream: ";


		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " secs";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		System.out.println(X10_TEMP12);
		}
public static int _Stream_MEG_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP1 = 50;


		final int X10_TEMP2 = 50;


		final int X10_TEMP4 = X10_TEMP1 * X10_TEMP2;

		return X10_TEMP4;
		}
public static double _Stream_alpha_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 3.0D;

		return X10_TEMP2;
		}
public static int _Stream_NUM_TIMES_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 10;

		return X10_TEMP2;
		}
public static long _Stream_N0_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP1 = 2;


		final long X10_TEMP3 = X10_TEMP1 * _Stream_MEG;

		return X10_TEMP3;
		}
public static long _Stream_N_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP1 = Program.MAX_PLACES;


		final long X10_TEMP3 = _Stream_N0 * X10_TEMP1;

		return X10_TEMP3;
		}
public static int _Stream_LocalSize_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = (int)_Stream_N0;

		return X10_TEMP2;
		}
public static void Stream_run ( final Stream X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP1 = "LocalSize=";


		final String X10_TEMP3 = X10_TEMP1 + _Stream_LocalSize;

		System.out.println(X10_TEMP3);

		final StreamData tempSd = X10_TEMP0.sd;

		/*FINISH
*/			{

			final int X10_TEMP10 = 0;


			final int X10_TEMP6 = 1;


			final int X10_TEMP8 = _Stream_NUM_TIMES - X10_TEMP6;


			final int X10_TEMP11 = (int)X10_TEMP8;


			Region1 r = Program.createNewRegion1R(X10_TEMP10, X10_TEMP11,myUniquePlacePoint);


			final int RX10_TEMP3 = 1;


			int RX10_TEMP1 = r.regSize;


			RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


			final int  RX10_TEMP2 = RX10_TEMP1+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
				{

				final int RX10_TEMP4 = RX10_TEMP0;


				final Point1 p1 = Program.regionOrdinalPoint1(r, RX10_TEMP4,myUniquePlacePoint);

				/*FINISH
*/					{

					final Dist1 X10_TEMP15 = Program.UniqueDistribution;


					final Region1 RX10_TEMP6 = X10_TEMP15.dReg;


					final int RX10_TEMP9 = 1;


					int RX10_TEMP7 = RX10_TEMP6.regSize;


					RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9;


					final int  RX10_TEMP8 = RX10_TEMP7+1;

					for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP8; RX10_TEMP5++)
						{

						final int RX10_TEMP10 = RX10_TEMP5;


						final Point1 p6 = Program.regionOrdinalPoint1(RX10_TEMP6, RX10_TEMP10,myUniquePlacePoint);


						final Region1 RX10_TEMP11 = X10_TEMP15.dReg;


						final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, p6,myUniquePlacePoint);


						final int RX10_TEMP13 = 0;


						final boolean RX10_TEMP14 = RX10_TEMP12 < RX10_TEMP13;

						if(RX10_TEMP14)
							{

							final String RX10_TEMP15 = "Point p6 not found in the distribution X10_TEMP15.";

							throw new RuntimeException(RX10_TEMP15);

							}

						final int RX10_TEMP16 = Program.getPlaceFromDist1(X10_TEMP15, RX10_TEMP12,myUniquePlacePoint);


						final int X10_TEMP16 = RX10_TEMP16;

						//async(X10_TEMP16)
							{

							final Dist1 X10_TEMP18 = tempSd.D;


							final int X10_TEMP19 = 0;


							final Dist1 X10_TEMP21 = Program.restrictDist1(X10_TEMP18, X10_TEMP19,X10_TEMP16);


							final Region1 RX10_TEMP18 = X10_TEMP21.dReg;


							final int RX10_TEMP21 = 1;


							int RX10_TEMP19 = RX10_TEMP18.regSize;


							RX10_TEMP19 = RX10_TEMP19 - RX10_TEMP21;


							final int  RX10_TEMP20 = RX10_TEMP19+1;

							for(int RX10_TEMP17=0; RX10_TEMP17 < RX10_TEMP20; RX10_TEMP17++)
								{

								final int RX10_TEMP22 = RX10_TEMP17;


								final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP18, RX10_TEMP22,X10_TEMP16);


								final doubleRefArray1 X10_TEMP22 = tempSd.b;


								final double X10_TEMP31 = 1.5;


								final int X10_TEMP24 = 0;


								final int X10_TEMP25 = 0;


								final int X10_TEMP27 = X10_TEMP25 * _Stream_LocalSize;


								final int X10_TEMP28 = i.f0;


								final int X10_TEMP30 = X10_TEMP27 + X10_TEMP28;


								final double X10_TEMP34 = X10_TEMP31 * X10_TEMP30;


								final double X10_TEMP35 = X10_TEMP34;


								final Dist1 RX10_TEMP23 = X10_TEMP22.distValue;


								final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;


								final int RX10_TEMP25 = Program.searchPointInRegion1(RX10_TEMP24, i,X10_TEMP16);


								final int RX10_TEMP26 = 0;


								final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;

								if(RX10_TEMP27)
									{

									String RX10_TEMP28 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP28);

									}

								final int RX10_TEMP29 = Program.getPlaceFromDist1(RX10_TEMP23, RX10_TEMP25,X10_TEMP16);


								final int RX10_TEMP31 = 0;


								final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;

								if(RX10_TEMP32)
									{

									String RX10_TEMP30 = "Bad place access for array X10_TEMP22";

									throw new RuntimeException(RX10_TEMP30);

									}
								Program.setRefArrayValue1double(X10_TEMP22, RX10_TEMP25, X10_TEMP35,X10_TEMP16);

								final doubleRefArray1 X10_TEMP36 = tempSd.c;


								final double X10_TEMP45 = 2.5;


								final int X10_TEMP38 = 0;


								final int X10_TEMP39 = 0;


								final int X10_TEMP41 = X10_TEMP39 * _Stream_LocalSize;


								final int X10_TEMP42 = i.f0;


								final int X10_TEMP44 = X10_TEMP41 + X10_TEMP42;


								final double X10_TEMP48 = X10_TEMP45 * X10_TEMP44;


								final double X10_TEMP49 = X10_TEMP48;


								final Dist1 RX10_TEMP33 = X10_TEMP36.distValue;


								final Region1 RX10_TEMP34 = RX10_TEMP33.dReg;


								final int RX10_TEMP35 = Program.searchPointInRegion1(RX10_TEMP34, i,X10_TEMP16);


								final int RX10_TEMP36 = 0;


								final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36;

								if(RX10_TEMP37)
									{

									String RX10_TEMP38 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP38);

									}

								final int RX10_TEMP39 = Program.getPlaceFromDist1(RX10_TEMP33, RX10_TEMP35,X10_TEMP16);


								final int RX10_TEMP41 = 0;


								final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41;

								if(RX10_TEMP42)
									{

									String RX10_TEMP40 = "Bad place access for array X10_TEMP36";

									throw new RuntimeException(RX10_TEMP40);

									}
								Program.setRefArrayValue1double(X10_TEMP36, RX10_TEMP35, X10_TEMP49,X10_TEMP16);
								}

							final Dist1 X10_TEMP50 = Program.UniqueDistribution;


							final Region1 RX10_TEMP43 = X10_TEMP50.dReg;


							final int RX10_TEMP44 = Program.searchPointInRegion1(RX10_TEMP43, p6,X10_TEMP16);


							final int RX10_TEMP45 = 0;


							final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45;

							if(RX10_TEMP46)
								{

								final String RX10_TEMP47 = "Point p6 not found in the distribution X10_TEMP50.";

								throw new RuntimeException(RX10_TEMP47);

								}

							final int RX10_TEMP48 = Program.getPlaceFromDist1(X10_TEMP50, RX10_TEMP44,X10_TEMP16);


							final int X10_TEMP52 = RX10_TEMP48;


							final int X10_TEMP53 = 0;


							final boolean X10_TEMP55 = X10_TEMP52 == X10_TEMP53;

							if(X10_TEMP55)
								{

								final doubleRefArray1 X10_TEMP56 = tempSd.times;


								final double X10_TEMP58 = Program.Stream_mySecond(X10_TEMP16);


								final int X10_TEMP59 = 0;


								final double X10_TEMP62 = X10_TEMP59 - X10_TEMP58;


								final double X10_TEMP63 = X10_TEMP62;


								final Dist1 RX10_TEMP49 = X10_TEMP56.distValue;


								final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;


								final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50, p1,X10_TEMP16);


								final int RX10_TEMP52 = 0;


								final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;

								if(RX10_TEMP53)
									{

									String RX10_TEMP54 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP54);

									}

								final int RX10_TEMP55 = Program.getPlaceFromDist1(RX10_TEMP49, RX10_TEMP51,X10_TEMP16);


								final int RX10_TEMP57 = 0;


								final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;

								if(RX10_TEMP58)
									{

									String RX10_TEMP56 = "Bad place access for array X10_TEMP56";

									throw new RuntimeException(RX10_TEMP56);

									}
								Program.setRefArrayValue1double(X10_TEMP56, RX10_TEMP51, X10_TEMP63,X10_TEMP16);
								}

							final Dist1 X10_TEMP65 = tempSd.D;


							final int X10_TEMP66 = 0;


							final Dist1 X10_TEMP68 = Program.restrictDist1(X10_TEMP65, X10_TEMP66,X10_TEMP16);


							final Region1 RX10_TEMP60 = X10_TEMP68.dReg;


							final int RX10_TEMP63 = 1;


							int RX10_TEMP61 = RX10_TEMP60.regSize;


							RX10_TEMP61 = RX10_TEMP61 - RX10_TEMP63;


							final int  RX10_TEMP62 = RX10_TEMP61+1;

							for(int RX10_TEMP59=0; RX10_TEMP59 < RX10_TEMP62; RX10_TEMP59++)
								{

								final int RX10_TEMP64 = RX10_TEMP59;


								final Point1 p4 = Program.regionOrdinalPoint1(RX10_TEMP60, RX10_TEMP64,X10_TEMP16);


								final doubleRefArray1 X10_TEMP69 = tempSd.a;


								final doubleRefArray1 X10_TEMP71 = tempSd.b;


								final Dist1 RX10_TEMP65 = X10_TEMP71.distValue;


								final Region1 RX10_TEMP66 = RX10_TEMP65.dReg;


								final int RX10_TEMP67 = Program.searchPointInRegion1(RX10_TEMP66, p4,X10_TEMP16);


								final int RX10_TEMP68 = 0;


								final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68;

								if(RX10_TEMP69)
									{

									String RX10_TEMP70 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP70);

									}

								final int RX10_TEMP71 = Program.getPlaceFromDist1(RX10_TEMP65, RX10_TEMP67,X10_TEMP16);


								final int RX10_TEMP73 = 0;


								final boolean RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73;

								if(RX10_TEMP74)
									{

									String RX10_TEMP72 = "Bad place access for array X10_TEMP71";

									throw new RuntimeException(RX10_TEMP72);

									}

								final double RX10_TEMP75 = Program.getRefArrayValue1double(X10_TEMP71, RX10_TEMP67,X10_TEMP16);


								final double X10_TEMP76 = RX10_TEMP75;


								final doubleRefArray1 X10_TEMP73 = tempSd.c;


								final Dist1 RX10_TEMP76 = X10_TEMP73.distValue;


								final Region1 RX10_TEMP77 = RX10_TEMP76.dReg;


								final int RX10_TEMP78 = Program.searchPointInRegion1(RX10_TEMP77, p4,X10_TEMP16);


								final int RX10_TEMP79 = 0;


								final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79;

								if(RX10_TEMP80)
									{

									String RX10_TEMP81 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP81);

									}

								final int RX10_TEMP82 = Program.getPlaceFromDist1(RX10_TEMP76, RX10_TEMP78,X10_TEMP16);


								final int RX10_TEMP84 = 0;


								final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84;

								if(RX10_TEMP85)
									{

									String RX10_TEMP83 = "Bad place access for array X10_TEMP73";

									throw new RuntimeException(RX10_TEMP83);

									}

								final double RX10_TEMP86 = Program.getRefArrayValue1double(X10_TEMP73, RX10_TEMP78,X10_TEMP16);


								final double X10_TEMP75 = RX10_TEMP86;


								final double X10_TEMP77 = _Stream_alpha * X10_TEMP75;


								final double X10_TEMP80 = X10_TEMP76 + X10_TEMP77;


								final double X10_TEMP81 = X10_TEMP80;


								final Dist1 RX10_TEMP87 = X10_TEMP69.distValue;


								final Region1 RX10_TEMP88 = RX10_TEMP87.dReg;


								final int RX10_TEMP89 = Program.searchPointInRegion1(RX10_TEMP88, p4,X10_TEMP16);


								final int RX10_TEMP90 = 0;


								final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;

								if(RX10_TEMP91)
									{

									String RX10_TEMP92 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP92);

									}

								final int RX10_TEMP93 = Program.getPlaceFromDist1(RX10_TEMP87, RX10_TEMP89,X10_TEMP16);


								final int RX10_TEMP95 = 0;


								final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95;

								if(RX10_TEMP96)
									{

									String RX10_TEMP94 = "Bad place access for array X10_TEMP69";

									throw new RuntimeException(RX10_TEMP94);

									}
								Program.setRefArrayValue1double(X10_TEMP69, RX10_TEMP89, X10_TEMP81,X10_TEMP16);
								}
							}
						}
					}
				/*FINISH
*/					{

					final Dist1 X10_TEMP83 = Program.UniqueDistribution;


					final Region1 RX10_TEMP98 = X10_TEMP83.dReg;


					final int RX10_TEMP101 = 1;


					int RX10_TEMP99 = RX10_TEMP98.regSize;


					RX10_TEMP99 = RX10_TEMP99 - RX10_TEMP101;


					final int  RX10_TEMP100 = RX10_TEMP99+1;

					for(int RX10_TEMP97=0; RX10_TEMP97 < RX10_TEMP100; RX10_TEMP97++)
						{

						final int RX10_TEMP102 = RX10_TEMP97;


						final Point1 p5 = Program.regionOrdinalPoint1(RX10_TEMP98, RX10_TEMP102,myUniquePlacePoint);


						final Region1 RX10_TEMP103 = X10_TEMP83.dReg;


						final int RX10_TEMP104 = Program.searchPointInRegion1(RX10_TEMP103, p5,myUniquePlacePoint);


						final int RX10_TEMP105 = 0;


						final boolean RX10_TEMP106 = RX10_TEMP104 < RX10_TEMP105;

						if(RX10_TEMP106)
							{

							final String RX10_TEMP107 = "Point p5 not found in the distribution X10_TEMP83.";

							throw new RuntimeException(RX10_TEMP107);

							}

						final int RX10_TEMP108 = Program.getPlaceFromDist1(X10_TEMP83, RX10_TEMP104,myUniquePlacePoint);


						final int X10_TEMP84 = RX10_TEMP108;

						//async(X10_TEMP84)
							{

							final Dist1 X10_TEMP85 = Program.UniqueDistribution;


							final Region1 RX10_TEMP109 = X10_TEMP85.dReg;


							final int RX10_TEMP110 = Program.searchPointInRegion1(RX10_TEMP109, p5,X10_TEMP84);


							final int RX10_TEMP111 = 0;


							final boolean RX10_TEMP112 = RX10_TEMP110 < RX10_TEMP111;

							if(RX10_TEMP112)
								{

								final String RX10_TEMP113 = "Point p5 not found in the distribution X10_TEMP85.";

								throw new RuntimeException(RX10_TEMP113);

								}

							final int RX10_TEMP114 = Program.getPlaceFromDist1(X10_TEMP85, RX10_TEMP110,X10_TEMP84);


							final int X10_TEMP87 = RX10_TEMP114;


							final int X10_TEMP88 = 0;


							final boolean X10_TEMP90 = X10_TEMP87 == X10_TEMP88;

							if(X10_TEMP90)
								{

								final doubleRefArray1 X10_TEMP91 = tempSd.times;


								final doubleRefArray1 X10_TEMP93 = tempSd.times;


								final Dist1 RX10_TEMP115 = X10_TEMP93.distValue;


								final Region1 RX10_TEMP116 = RX10_TEMP115.dReg;


								final int RX10_TEMP117 = Program.searchPointInRegion1(RX10_TEMP116, p1,X10_TEMP84);


								final int RX10_TEMP118 = 0;


								final boolean RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118;

								if(RX10_TEMP119)
									{

									String RX10_TEMP120 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP120);

									}

								final int RX10_TEMP121 = Program.getPlaceFromDist1(RX10_TEMP115, RX10_TEMP117,X10_TEMP84);


								final int RX10_TEMP123 = 0;


								final boolean RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123;

								if(RX10_TEMP124)
									{

									String RX10_TEMP122 = "Bad place access for array X10_TEMP93";

									throw new RuntimeException(RX10_TEMP122);

									}

								final double RX10_TEMP125 = Program.getRefArrayValue1double(X10_TEMP93, RX10_TEMP117,X10_TEMP84);


								final double X10_TEMP95 = RX10_TEMP125;


								final double X10_TEMP96 = Program.Stream_mySecond(X10_TEMP84);


								final double X10_TEMP99 = X10_TEMP95 + X10_TEMP96;


								final double X10_TEMP100 = X10_TEMP99;


								final Dist1 RX10_TEMP126 = X10_TEMP91.distValue;


								final Region1 RX10_TEMP127 = RX10_TEMP126.dReg;


								final int RX10_TEMP128 = Program.searchPointInRegion1(RX10_TEMP127, p1,X10_TEMP84);


								final int RX10_TEMP129 = 0;


								final boolean RX10_TEMP130 = RX10_TEMP128 < RX10_TEMP129;

								if(RX10_TEMP130)
									{

									String RX10_TEMP131 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP131);

									}

								final int RX10_TEMP132 = Program.getPlaceFromDist1(RX10_TEMP126, RX10_TEMP128,X10_TEMP84);


								final int RX10_TEMP134 = 0;


								final boolean RX10_TEMP135 = RX10_TEMP132 != RX10_TEMP134;

								if(RX10_TEMP135)
									{

									String RX10_TEMP133 = "Bad place access for array X10_TEMP91";

									throw new RuntimeException(RX10_TEMP133);

									}
								Program.setRefArrayValue1double(X10_TEMP91, RX10_TEMP128, X10_TEMP100,X10_TEMP84);
								}
							}
						}
					}
				}
			/*FINISH
*/				{

				final Dist1 X10_TEMP102 = Program.UniqueDistribution;


				final Region1 RX10_TEMP137 = X10_TEMP102.dReg;


				final int RX10_TEMP140 = 1;


				int RX10_TEMP138 = RX10_TEMP137.regSize;


				RX10_TEMP138 = RX10_TEMP138 - RX10_TEMP140;


				final int  RX10_TEMP139 = RX10_TEMP138+1;

				for(int RX10_TEMP136=0; RX10_TEMP136 < RX10_TEMP139; RX10_TEMP136++)
					{

					final int RX10_TEMP141 = RX10_TEMP136;


					final Point1 p2 = Program.regionOrdinalPoint1(RX10_TEMP137, RX10_TEMP141,myUniquePlacePoint);


					final Region1 RX10_TEMP142 = X10_TEMP102.dReg;


					final int RX10_TEMP143 = Program.searchPointInRegion1(RX10_TEMP142, p2,myUniquePlacePoint);


					final int RX10_TEMP144 = 0;


					final boolean RX10_TEMP145 = RX10_TEMP143 < RX10_TEMP144;

					if(RX10_TEMP145)
						{

						final String RX10_TEMP146 = "Point p2 not found in the distribution X10_TEMP102.";

						throw new RuntimeException(RX10_TEMP146);

						}

					final int RX10_TEMP147 = Program.getPlaceFromDist1(X10_TEMP102, RX10_TEMP143,myUniquePlacePoint);


					final int X10_TEMP103 = RX10_TEMP147;

					//async(X10_TEMP103)
						{

						final Dist1 X10_TEMP105 = tempSd.D;


						final int X10_TEMP106 = 0;


						final Dist1 X10_TEMP108 = Program.restrictDist1(X10_TEMP105, X10_TEMP106,X10_TEMP103);


						final Region1 RX10_TEMP149 = X10_TEMP108.dReg;


						final int RX10_TEMP152 = 1;


						int RX10_TEMP150 = RX10_TEMP149.regSize;


						RX10_TEMP150 = RX10_TEMP150 - RX10_TEMP152;


						final int  RX10_TEMP151 = RX10_TEMP150+1;

						for(int RX10_TEMP148=0; RX10_TEMP148 < RX10_TEMP151; RX10_TEMP148++)
							{

							final int RX10_TEMP153 = RX10_TEMP148;


							final Point1 p3 = Program.regionOrdinalPoint1(RX10_TEMP149, RX10_TEMP153,X10_TEMP103);


							final doubleRefArray1 X10_TEMP109 = tempSd.a;


							final Dist1 RX10_TEMP154 = X10_TEMP109.distValue;


							final Region1 RX10_TEMP155 = RX10_TEMP154.dReg;


							final int RX10_TEMP156 = Program.searchPointInRegion1(RX10_TEMP155, p3,X10_TEMP103);


							final int RX10_TEMP157 = 0;


							final boolean RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157;

							if(RX10_TEMP158)
								{

								String RX10_TEMP159 = "Array access index out of bounds";

								throw new RuntimeException(RX10_TEMP159);

								}

							final int RX10_TEMP160 = Program.getPlaceFromDist1(RX10_TEMP154, RX10_TEMP156,X10_TEMP103);


							final int RX10_TEMP162 = 0;


							final boolean RX10_TEMP163 = RX10_TEMP160 != RX10_TEMP162;

							if(RX10_TEMP163)
								{

								String RX10_TEMP161 = "Bad place access for array X10_TEMP109";

								throw new RuntimeException(RX10_TEMP161);

								}

							final double RX10_TEMP164 = Program.getRefArrayValue1double(X10_TEMP109, RX10_TEMP156,X10_TEMP103);


							final double X10_TEMP118 = RX10_TEMP164;


							final doubleRefArray1 X10_TEMP111 = tempSd.b;


							final Dist1 RX10_TEMP165 = X10_TEMP111.distValue;


							final Region1 RX10_TEMP166 = RX10_TEMP165.dReg;


							final int RX10_TEMP167 = Program.searchPointInRegion1(RX10_TEMP166, p3,X10_TEMP103);


							final int RX10_TEMP168 = 0;


							final boolean RX10_TEMP169 = RX10_TEMP167 < RX10_TEMP168;

							if(RX10_TEMP169)
								{

								String RX10_TEMP170 = "Array access index out of bounds";

								throw new RuntimeException(RX10_TEMP170);

								}

							final int RX10_TEMP171 = Program.getPlaceFromDist1(RX10_TEMP165, RX10_TEMP167,X10_TEMP103);


							final int RX10_TEMP173 = 0;


							final boolean RX10_TEMP174 = RX10_TEMP171 != RX10_TEMP173;

							if(RX10_TEMP174)
								{

								String RX10_TEMP172 = "Bad place access for array X10_TEMP111";

								throw new RuntimeException(RX10_TEMP172);

								}

							final double RX10_TEMP175 = Program.getRefArrayValue1double(X10_TEMP111, RX10_TEMP167,X10_TEMP103);


							final double X10_TEMP116 = RX10_TEMP175;


							final doubleRefArray1 X10_TEMP113 = tempSd.c;


							final Dist1 RX10_TEMP176 = X10_TEMP113.distValue;


							final Region1 RX10_TEMP177 = RX10_TEMP176.dReg;


							final int RX10_TEMP178 = Program.searchPointInRegion1(RX10_TEMP177, p3,X10_TEMP103);


							final int RX10_TEMP179 = 0;


							final boolean RX10_TEMP180 = RX10_TEMP178 < RX10_TEMP179;

							if(RX10_TEMP180)
								{

								String RX10_TEMP181 = "Array access index out of bounds";

								throw new RuntimeException(RX10_TEMP181);

								}

							final int RX10_TEMP182 = Program.getPlaceFromDist1(RX10_TEMP176, RX10_TEMP178,X10_TEMP103);


							final int RX10_TEMP184 = 0;


							final boolean RX10_TEMP185 = RX10_TEMP182 != RX10_TEMP184;

							if(RX10_TEMP185)
								{

								String RX10_TEMP183 = "Bad place access for array X10_TEMP113";

								throw new RuntimeException(RX10_TEMP183);

								}

							final double RX10_TEMP186 = Program.getRefArrayValue1double(X10_TEMP113, RX10_TEMP178,X10_TEMP103);


							final double X10_TEMP115 = RX10_TEMP186;


							final double X10_TEMP117 = _Stream_alpha * X10_TEMP115;


							final double X10_TEMP119 = X10_TEMP116 + X10_TEMP117;


							final boolean X10_TEMP121 = X10_TEMP118 != X10_TEMP119;

							if(X10_TEMP121)
								{

								final int X10_TEMP123 = 0;

								//async(X10_TEMP123)
									{

									final booleanRefArray1 X10_TEMP124 = tempSd.verified;


									final int X10_TEMP126 = 0;


									final boolean X10_TEMP129 = false;


									final boolean X10_TEMP130 = X10_TEMP129;


									final Point1 RX10_TEMP187 = new Point1(X10_TEMP126,X10_TEMP123);
									
Program.globalPointerHashMap.get(X10_TEMP123).add(RX10_TEMP187.hashCode());


									final Dist1 RX10_TEMP188 = X10_TEMP124.distValue;


									final Region1 RX10_TEMP189 = RX10_TEMP188.dReg;


									final int RX10_TEMP190 = Program.searchPointInRegion1(RX10_TEMP189, RX10_TEMP187,X10_TEMP123);


									final int RX10_TEMP191 = 0;


									final boolean RX10_TEMP192 = RX10_TEMP190 < RX10_TEMP191;

									if(RX10_TEMP192)
										{

										String RX10_TEMP193 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP193);

										}

									final int RX10_TEMP194 = Program.getPlaceFromDist1(RX10_TEMP188, RX10_TEMP190,X10_TEMP123);


									final int RX10_TEMP196 = 0;


									final boolean RX10_TEMP197 = RX10_TEMP194 != RX10_TEMP196;

									if(RX10_TEMP197)
										{

										String RX10_TEMP195 = "Bad place access for array X10_TEMP124";

										throw new RuntimeException(RX10_TEMP195);

										}
									Program.setRefArrayValue1boolean(X10_TEMP124, RX10_TEMP190, X10_TEMP130,X10_TEMP123);
									}
								}
							}
						}
					}
				}
			}

		double mini = 10000000L;


		final int X10_TEMP137 = 0;


		final int X10_TEMP133 = 1;


		final int X10_TEMP135 = _Stream_NUM_TIMES - X10_TEMP133;


		final int X10_TEMP138 = (int)X10_TEMP135;


		Region1 r = Program.createNewRegion1R(X10_TEMP137, X10_TEMP138,myUniquePlacePoint);


		final int RX10_TEMP201 = 1;


		int RX10_TEMP199 = r.regSize;


		RX10_TEMP199 = RX10_TEMP199 - RX10_TEMP201;


		final int  RX10_TEMP200 = RX10_TEMP199+1;

		for(int RX10_TEMP198=0; RX10_TEMP198 < RX10_TEMP200; RX10_TEMP198++)
			{

			final int RX10_TEMP202 = RX10_TEMP198;


			final Point1 p1 = Program.regionOrdinalPoint1(r, RX10_TEMP202,myUniquePlacePoint);


			final doubleRefArray1 X10_TEMP141 = tempSd.times;


			final Dist1 RX10_TEMP203 = X10_TEMP141.distValue;


			final Region1 RX10_TEMP204 = RX10_TEMP203.dReg;


			final int RX10_TEMP205 = Program.searchPointInRegion1(RX10_TEMP204, p1,myUniquePlacePoint);


			final int RX10_TEMP206 = 0;


			final boolean RX10_TEMP207 = RX10_TEMP205 < RX10_TEMP206;

			if(RX10_TEMP207)
				{

				String RX10_TEMP208 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP208);

				}

			final int RX10_TEMP209 = Program.getPlaceFromDist1(RX10_TEMP203, RX10_TEMP205,myUniquePlacePoint);


			final int RX10_TEMP211 = 0;


			final boolean RX10_TEMP212 = RX10_TEMP209 != RX10_TEMP211;

			if(RX10_TEMP212)
				{

				String RX10_TEMP210 = "Bad place access for array X10_TEMP141";

				throw new RuntimeException(RX10_TEMP210);

				}

			final double RX10_TEMP213 = Program.getRefArrayValue1double(X10_TEMP141, RX10_TEMP205,myUniquePlacePoint);


			final double X10_TEMP143 = RX10_TEMP213;


			final boolean X10_TEMP145 = X10_TEMP143 < mini;

			if(X10_TEMP145)
				{

				final doubleRefArray1 X10_TEMP146 = tempSd.times;


				final Dist1 RX10_TEMP214 = X10_TEMP146.distValue;


				final Region1 RX10_TEMP215 = RX10_TEMP214.dReg;


				final int RX10_TEMP216 = Program.searchPointInRegion1(RX10_TEMP215, p1,myUniquePlacePoint);


				final int RX10_TEMP217 = 0;


				final boolean RX10_TEMP218 = RX10_TEMP216 < RX10_TEMP217;

				if(RX10_TEMP218)
					{

					String RX10_TEMP219 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP219);

					}

				final int RX10_TEMP220 = Program.getPlaceFromDist1(RX10_TEMP214, RX10_TEMP216,myUniquePlacePoint);


				final int RX10_TEMP222 = 0;


				final boolean RX10_TEMP223 = RX10_TEMP220 != RX10_TEMP222;

				if(RX10_TEMP223)
					{

					String RX10_TEMP221 = "Bad place access for array X10_TEMP146";

					throw new RuntimeException(RX10_TEMP221);

					}

				final double RX10_TEMP224 = Program.getRefArrayValue1double(X10_TEMP146, RX10_TEMP216,myUniquePlacePoint);


				final double X10_TEMP149 = RX10_TEMP224;


				mini = X10_TEMP149;

				}
			}

		final booleanRefArray1 X10_TEMP152 = tempSd.verified;


		final int X10_TEMP154 = 0;


		final Point1 RX10_TEMP225 = new Point1(X10_TEMP154,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP225.hashCode());


		final Dist1 RX10_TEMP226 = X10_TEMP152.distValue;


		final Region1 RX10_TEMP227 = RX10_TEMP226.dReg;


		final int RX10_TEMP228 = Program.searchPointInRegion1(RX10_TEMP227, RX10_TEMP225,myUniquePlacePoint);


		final int RX10_TEMP229 = 0;


		final boolean RX10_TEMP230 = RX10_TEMP228 < RX10_TEMP229;

		if(RX10_TEMP230)
			{

			String RX10_TEMP231 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP231);

			}

		final int RX10_TEMP232 = Program.getPlaceFromDist1(RX10_TEMP226, RX10_TEMP228,myUniquePlacePoint);


		final int RX10_TEMP234 = 0;


		final boolean RX10_TEMP235 = RX10_TEMP232 != RX10_TEMP234;

		if(RX10_TEMP235)
			{

			String RX10_TEMP233 = "Bad place access for array X10_TEMP152";

			throw new RuntimeException(RX10_TEMP233);

			}

		final boolean RX10_TEMP236 = Program.getRefArrayValue1boolean(X10_TEMP152, RX10_TEMP228,myUniquePlacePoint);


		final boolean X10_TEMP156 = RX10_TEMP236;

		Program.Stream_printStats(_Stream_N, mini, X10_TEMP156,myUniquePlacePoint);
		}
public static double Stream_mySecond (  int myUniquePlacePoint)
		{

		final double X10_TEMP1 = System.currentTimeMillis();


		final double X10_TEMP2 = 1.e6;


		final double X10_TEMP3 = X10_TEMP1 * X10_TEMP2;


		final int X10_TEMP4 = 1000;


		final double X10_TEMP6 = X10_TEMP3 / X10_TEMP4;


		final double X10_TEMP7 = (double)X10_TEMP6;


		final double X10_TEMP8 = 1.e-6;


		final double X10_TEMP10 = X10_TEMP7 * X10_TEMP8;


		final double X10_TEMP12 = (double)X10_TEMP10;

		return X10_TEMP12;
		}
public static void Stream_printStats ( final long N, final double time, final boolean verified, int myUniquePlacePoint)
		{

		final String X10_TEMP1 = "Number of places=";


		final int X10_TEMP2 = Program.MAX_PLACES;


		final String X10_TEMP4 = X10_TEMP1 + X10_TEMP2;

		System.out.println(X10_TEMP4);

		final int X10_TEMP5 = 3;


		final int X10_TEMP6 = 8;


		final long X10_TEMP7 = X10_TEMP5 * X10_TEMP6;


		final long X10_TEMP8 = X10_TEMP7 * N;


		final long X10_TEMP10 = X10_TEMP8 / _Stream_MEG;


		long size1 = X10_TEMP10;


		final int X10_TEMP12 = 3;


		final int X10_TEMP13 = 8;


		final long X10_TEMP14 = X10_TEMP12 * X10_TEMP13;


		final long X10_TEMP16 = X10_TEMP14 * N;


		final double X10_TEMP17 = 1.0E9;


		final double X10_TEMP19 = X10_TEMP17 * time;


		double rate = X10_TEMP16 / X10_TEMP19;


		final String X10_TEMP21 = "Size of arrays: ";


		final String X10_TEMP22 = X10_TEMP21 + size1;


		final String X10_TEMP23 = " MB (total)";


		final String X10_TEMP25 = X10_TEMP22 + X10_TEMP23;


		final int X10_TEMP24 = Program.MAX_PLACES;


		final long X10_TEMP26 = size1 / X10_TEMP24;


		final String X10_TEMP27 = X10_TEMP25 + X10_TEMP26;


		final String X10_TEMP28 = " MB (per place)";


		final String X10_TEMP30 = X10_TEMP27 + X10_TEMP28;

		System.out.println(X10_TEMP30);

		final String X10_TEMP31 = "Min time: ";


		final String X10_TEMP32 = X10_TEMP31 + time;


		final String X10_TEMP33 = " rate=";


		final String X10_TEMP34 = X10_TEMP32 + X10_TEMP33;


		final String X10_TEMP35 = X10_TEMP34 + rate;


		final String X10_TEMP36 = " GB/s";


		final String X10_TEMP38 = X10_TEMP35 + X10_TEMP36;

		System.out.println(X10_TEMP38);

		final String X10_TEMP45 = "Result is ";


		final boolean X10_TEMP39 = verified;


		String X10_TEMP42 = "NOT verified.";

		if(X10_TEMP39)
			{

			X10_TEMP42 = "verified.";

			}

		final String X10_TEMP43 = X10_TEMP42;


		final String X10_TEMP44 = X10_TEMP43;


		final String X10_TEMP47 = X10_TEMP45 + X10_TEMP44;

		System.out.println(X10_TEMP47);
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
public static boolean getRefArrayValue1boolean ( final booleanRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final booleanStub[] contents = array.contents;


		final booleanStub indexStub = contents[placeIndex];


		final boolean[] localArray = indexStub.localArray;


		final boolean returnValue = localArray[localIndex];

		return returnValue;
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
public static void setRefArrayValue1boolean ( final booleanRefArray1 array, final int index, final boolean val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final booleanStub[] contents = array.contents;


		final booleanStub indexStub = contents[placeIndex];


		final boolean[] localArray = indexStub.localArray;

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
	/*value*/ class StreamData 
	 {
 
	public final booleanRefArray1 verified;
	public final Dist1 D;
	public final doubleRefArray1 times;
	public final doubleRefArray1 a;
	public final doubleRefArray1 b;
	public final doubleRefArray1 c;


	public StreamData ( final long N, final int NUM_TIMES, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int X10_TEMP3 = 0;


		final int X10_TEMP4 = 0;


		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);


		final int X10_TEMP6 = 0;


		final Dist1 dverified = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final booleanRefArray1 X10_TEMP11 = this.StreamData_initVerified(dverified,myUniquePlacePoint);


		verified = X10_TEMP11;


		final int X10_TEMP17 = 0;


		final int X10_TEMP13 = 1;


		final long X10_TEMP15 = N - X10_TEMP13;


		final int X10_TEMP18 = (int)X10_TEMP15;


		final Region1 X10_TEMP20 = Program.createNewRegion1R(X10_TEMP17, X10_TEMP18,myUniquePlacePoint);


		final Dist1 X10_TEMP21 = Program.getBlockDist1(X10_TEMP20,myUniquePlacePoint);


		final Dist1 temp_D = X10_TEMP21;


		D = temp_D;


		final int X10_TEMP30 = 0;


		final int X10_TEMP26 = 1;


		final int X10_TEMP28 = NUM_TIMES - X10_TEMP26;


		final int X10_TEMP31 = (int)X10_TEMP28;


		final Region1 X10_TEMP32 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP31,myUniquePlacePoint);


		final int X10_TEMP33 = 0;


		final Dist1 X10_TEMP35 = Program.getPlaceDist1(X10_TEMP32, X10_TEMP33,myUniquePlacePoint);


		final doubleRefArray1 X10_TEMP37 = this.StreamData_initArray(X10_TEMP35,myUniquePlacePoint);


		times = X10_TEMP37;


		final doubleRefArray1 X10_TEMP41 = this.StreamData_initArray(temp_D,myUniquePlacePoint);


		a = X10_TEMP41;


		final doubleRefArray1 X10_TEMP45 = this.StreamData_initArray(temp_D,myUniquePlacePoint);


		b = X10_TEMP45;


		final doubleRefArray1 X10_TEMP49 = this.StreamData_initArray(temp_D,myUniquePlacePoint);


		c = X10_TEMP49;

		}


public booleanRefArray1 StreamData_initVerified ( final Dist1 d, int myUniquePlacePoint)
		{

		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final booleanStub[] RX10_TEMP6 = new booleanStub[RX10_TEMP5];

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

					final int RX10_TEMP14 = RX10_TEMP12+1;


					final boolean[] RX10_TEMP15 = new boolean/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )						{

						final boolean X10_TEMP2 = true;

						RX10_TEMP15[RX10_TEMP13] =X10_TEMP2;
						}

;


					final booleanStub RX10_TEMP16 = new booleanStub(RX10_TEMP15,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP16.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
						}
					}
				}
			}

		final booleanStub[] RX10_TEMP17 = (booleanStub[])(new booleanStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP17.length ;RX10_TEMP19++ )			{

			final booleanStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];

			RX10_TEMP17[RX10_TEMP19] =RX10_TEMP18;
			}

;


		final booleanRefArray1 RX10_TEMP20 = new booleanRefArray1(d, RX10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final booleanRefArray1 X10_TEMP3 = RX10_TEMP20;

		return X10_TEMP3;
		}
public doubleRefArray1 StreamData_initArray ( final Dist1 d, int myUniquePlacePoint)
		{

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

					final int RX10_TEMP14 = RX10_TEMP12+1;


					final double[] RX10_TEMP15 = new double/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )						{

						final double X10_TEMP2 = 0.0D;

						RX10_TEMP15[RX10_TEMP13] =X10_TEMP2;
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


		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(d, RX10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final doubleRefArray1 X10_TEMP3 = RX10_TEMP20;

		return X10_TEMP3;
		}
	}
	class Stream   {
 
	public final StreamData sd;


	public Stream (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		long X10_TEMP3 = Program._Stream_N;


		int X10_TEMP4 = Program._Stream_NUM_TIMES;


		final StreamData X10_TEMP6 = new StreamData(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP6.hashCode());


		sd = X10_TEMP6;

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
	/*value*/ class booleanStub 
	 {
 
	public final boolean[] localArray;


	public booleanStub ( final boolean[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class booleanRefArray1 
	 {
 
	public final Dist1 distValue;
	public final booleanStub[] contents;


	public booleanRefArray1 ( final Dist1 distValue_, final booleanStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
