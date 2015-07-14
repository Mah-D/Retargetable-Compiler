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

 
public static final int _md_ITERS = Program._md_ITERS_init(myUniquePlacePoint);
public static final double _md_LENGTH = Program._md_LENGTH_init(myUniquePlacePoint);
public static final double _md_m = Program._md_m_init(myUniquePlacePoint);
public static final double _md_mu = Program._md_mu_init(myUniquePlacePoint);
public static final double _md_kb = Program._md_kb_init(myUniquePlacePoint);
public static final double _md_TSIM = Program._md_TSIM_init(myUniquePlacePoint);
public static final double _md_deltat = Program._md_deltat_init(myUniquePlacePoint);
public static final double _md_den = Program._md_den_init(myUniquePlacePoint);
public static final double _md_tref = Program._md_tref_init(myUniquePlacePoint);
public static final double _md_h = Program._md_h_init(myUniquePlacePoint);
public static final int _md_irep = Program._md_irep_init(myUniquePlacePoint);
public static final int _md_istop = Program._md_istop_init(myUniquePlacePoint);
public static final int _md_iprint = Program._md_iprint_init(myUniquePlacePoint);
public static final int _md_movemx = Program._md_movemx_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES; }else{ x = x-1; } return x;}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);
		Program.md_exec(myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP6 = "Wall-clock time for moldyn: ";


		final double X10_TEMP7 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP8 = X10_TEMP6 + X10_TEMP7;


		final String X10_TEMP9 = " secs";


		final String X10_TEMP11 = X10_TEMP8 + X10_TEMP9;

		System.out.println(X10_TEMP11);
		}
public static int _md_ITERS_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 100;

		return X10_TEMP2;
		}
public static double _md_LENGTH_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 50e-10;

		return X10_TEMP2;
		}
public static double _md_m_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 4.0026;

		return X10_TEMP2;
		}
public static double _md_mu_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 1.66056e-27;

		return X10_TEMP2;
		}
public static double _md_kb_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 1.38066e-23;

		return X10_TEMP2;
		}
public static double _md_TSIM_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 50;

		return X10_TEMP2;
		}
public static double _md_deltat_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 5e-16;

		return X10_TEMP2;
		}
public static double _md_den_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 0.83134;

		return X10_TEMP2;
		}
public static double _md_tref_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 0.722;

		return X10_TEMP2;
		}
public static double _md_h_init (  int myUniquePlacePoint)
		{

		final double X10_TEMP2 = 0.064;

		return X10_TEMP2;
		}
public static int _md_irep_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 10;

		return X10_TEMP2;
		}
public static int _md_istop_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 19;

		return X10_TEMP2;
		}
public static int _md_iprint_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 10;

		return X10_TEMP2;
		}
public static int _md_movemx_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 50;

		return X10_TEMP2;
		}
public static void md_exec (  int myUniquePlacePoint)
		{

		final Dist1 X10_TEMP1 = Program.UniqueDistribution;


		final Dist1 D = X10_TEMP1;


		final Region1 RX10_TEMP0 = D.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final mdStub[] RX10_TEMP6 = new mdStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(D, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP14 = RX10_TEMP12+1;


					final md[] RX10_TEMP15 = new md/*NewUpdatableArray*/[RX10_TEMP14];
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP15.length ;RX10_TEMP13++ )						{

						final md X10_TEMP4 = new md();
						
Program.globalPointerHashMap.get(RX10_TEMP10).add(X10_TEMP4.hashCode());

						RX10_TEMP15[RX10_TEMP13] =X10_TEMP4;
						}

;


					final mdStub RX10_TEMP16 = new mdStub(RX10_TEMP15,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP16.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
						}
					}
				}
			}

		final mdStub[] RX10_TEMP17 = (mdStub[])(new mdStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP17.length ;RX10_TEMP19++ )			{

			final mdStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];

			RX10_TEMP17[RX10_TEMP19] =RX10_TEMP18;
			}

;


		final mdRefArray1 RX10_TEMP20 = new mdRefArray1(D, RX10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final mdRefArray1 P = RX10_TEMP20;

		Program.md_init(D, P,myUniquePlacePoint);
		Program.md_run(D, P,myUniquePlacePoint);
		Program.md_validate(D, P,myUniquePlacePoint);
		}
public static void md_init ( final Dist1 D, final mdRefArray1 P, int myUniquePlacePoint)
		{
		/*FINISH
*/			{

			final Region1 RX10_TEMP1 = D.dReg;


			final int RX10_TEMP4 = 1;


			int RX10_TEMP2 = RX10_TEMP1.regSize;


			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;


			final int  RX10_TEMP3 = RX10_TEMP2+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3; RX10_TEMP0++)
				{

				final int RX10_TEMP5 = RX10_TEMP0;


				final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5,myUniquePlacePoint);


				final Region1 RX10_TEMP6 = D.dReg;


				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, j,myUniquePlacePoint);


				final int RX10_TEMP8 = 0;


				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

				if(RX10_TEMP9)
					{

					final String RX10_TEMP10 = "Point j not found in the distribution D.";

					throw new RuntimeException(RX10_TEMP10);

					}

				final int RX10_TEMP11 = Program.getPlaceFromDist1(D, RX10_TEMP7,myUniquePlacePoint);


				final int X10_TEMP2 = RX10_TEMP11;

				//async(X10_TEMP2)
					{

					final Dist1 RX10_TEMP12 = P.distValue;


					final Region1 RX10_TEMP13 = RX10_TEMP12.dReg;


					final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13, j,X10_TEMP2);


					final int RX10_TEMP15 = 0;


					final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;

					if(RX10_TEMP16)
						{

						String RX10_TEMP17 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP17);

						}

					final int RX10_TEMP18 = Program.getPlaceFromDist1(RX10_TEMP12, RX10_TEMP14,X10_TEMP2);


					final int RX10_TEMP20 = 0;


					final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20;

					if(RX10_TEMP21)
						{

						String RX10_TEMP19 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP19);

						}

					final md RX10_TEMP22 = Program.getRefArrayValue1md(P, RX10_TEMP14,X10_TEMP2);


					final md X10_TEMP5 = RX10_TEMP22;


					final int X10_TEMP9 = j.f0;


					final int X10_TEMP10 = Program.MAX_PLACES;

					Program.md_initialise(X10_TEMP5, X10_TEMP9, X10_TEMP10,X10_TEMP2);
					}
				}
			}
		}
public static void md_run ( final Dist1 D, final mdRefArray1 P, int myUniquePlacePoint)
		{

		int n = 0;


		final int X10_TEMP5 = 0;


		final int X10_TEMP3 = 1;


		final int X10_TEMP6 = _md_movemx - X10_TEMP3;


		final Region1 X10_TEMP8 = Program.createNewRegion1R(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final int RX10_TEMP3 = 1;


		int RX10_TEMP1 = X10_TEMP8.regSize;


		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


		final int  RX10_TEMP2 = RX10_TEMP1+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
			{

			final int RX10_TEMP4 = RX10_TEMP0;


			final Point1 move = Program.regionOrdinalPoint1(X10_TEMP8, RX10_TEMP4,myUniquePlacePoint);

			/*FINISH
*/				{

				final Region1 RX10_TEMP6 = D.dReg;


				final int RX10_TEMP9 = 1;


				int RX10_TEMP7 = RX10_TEMP6.regSize;


				RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9;


				final int  RX10_TEMP8 = RX10_TEMP7+1;

				for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP8; RX10_TEMP5++)
					{

					final int RX10_TEMP10 = RX10_TEMP5;


					final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP6, RX10_TEMP10,myUniquePlacePoint);


					final Region1 RX10_TEMP11 = D.dReg;


					final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, j,myUniquePlacePoint);


					final int RX10_TEMP13 = 0;


					final boolean RX10_TEMP14 = RX10_TEMP12 < RX10_TEMP13;

					if(RX10_TEMP14)
						{

						final String RX10_TEMP15 = "Point j not found in the distribution D.";

						throw new RuntimeException(RX10_TEMP15);

						}

					final int RX10_TEMP16 = Program.getPlaceFromDist1(D, RX10_TEMP12,myUniquePlacePoint);


					final int X10_TEMP10 = RX10_TEMP16;

					//async(X10_TEMP10)
						{

						final Dist1 RX10_TEMP17 = P.distValue;


						final Region1 RX10_TEMP18 = RX10_TEMP17.dReg;


						final int RX10_TEMP19 = Program.searchPointInRegion1(RX10_TEMP18, j,X10_TEMP10);


						final int RX10_TEMP20 = 0;


						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;

						if(RX10_TEMP21)
							{

							String RX10_TEMP22 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP22);

							}

						final int RX10_TEMP23 = Program.getPlaceFromDist1(RX10_TEMP17, RX10_TEMP19,X10_TEMP10);


						final int RX10_TEMP25 = 0;


						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;

						if(RX10_TEMP26)
							{

							String RX10_TEMP24 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP24);

							}

						final md RX10_TEMP27 = Program.getRefArrayValue1md(P, RX10_TEMP19,X10_TEMP10);


						final md X10_TEMP12 = RX10_TEMP27;

						Program.md_runiters1(X10_TEMP12,X10_TEMP10);
						}
					}
				}
			/*FINISH
*/				{

				final Region1 RX10_TEMP29 = D.dReg;


				final int RX10_TEMP32 = 1;


				int RX10_TEMP30 = RX10_TEMP29.regSize;


				RX10_TEMP30 = RX10_TEMP30 - RX10_TEMP32;


				final int  RX10_TEMP31 = RX10_TEMP30+1;

				for(int RX10_TEMP28=0; RX10_TEMP28 < RX10_TEMP31; RX10_TEMP28++)
					{

					final int RX10_TEMP33 = RX10_TEMP28;


					final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP29, RX10_TEMP33,myUniquePlacePoint);


					final Region1 RX10_TEMP34 = D.dReg;


					final int RX10_TEMP35 = Program.searchPointInRegion1(RX10_TEMP34, j,myUniquePlacePoint);


					final int RX10_TEMP36 = 0;


					final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36;

					if(RX10_TEMP37)
						{

						final String RX10_TEMP38 = "Point j not found in the distribution D.";

						throw new RuntimeException(RX10_TEMP38);

						}

					final int RX10_TEMP39 = Program.getPlaceFromDist1(D, RX10_TEMP35,myUniquePlacePoint);


					final int X10_TEMP14 = RX10_TEMP39;

					//async(X10_TEMP14)
						{

						final Dist1 RX10_TEMP40 = P.distValue;


						final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;


						final int RX10_TEMP42 = Program.searchPointInRegion1(RX10_TEMP41, j,X10_TEMP14);


						final int RX10_TEMP43 = 0;


						final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;

						if(RX10_TEMP44)
							{

							String RX10_TEMP45 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP45);

							}

						final int RX10_TEMP46 = Program.getPlaceFromDist1(RX10_TEMP40, RX10_TEMP42,X10_TEMP14);


						final int RX10_TEMP48 = 0;


						final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;

						if(RX10_TEMP49)
							{

							String RX10_TEMP47 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP47);

							}

						final md RX10_TEMP50 = Program.getRefArrayValue1md(P, RX10_TEMP42,X10_TEMP14);


						final md X10_TEMP16 = RX10_TEMP50;

						Program.md_runiters2(X10_TEMP16, P,X10_TEMP14);
						}
					}
				}
			/*FINISH
*/				{

				final Region1 RX10_TEMP52 = D.dReg;


				final int RX10_TEMP55 = 1;


				int RX10_TEMP53 = RX10_TEMP52.regSize;


				RX10_TEMP53 = RX10_TEMP53 - RX10_TEMP55;


				final int  RX10_TEMP54 = RX10_TEMP53+1;

				for(int RX10_TEMP51=0; RX10_TEMP51 < RX10_TEMP54; RX10_TEMP51++)
					{

					final int RX10_TEMP56 = RX10_TEMP51;


					final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP52, RX10_TEMP56,myUniquePlacePoint);


					final Region1 RX10_TEMP57 = D.dReg;


					final int RX10_TEMP58 = Program.searchPointInRegion1(RX10_TEMP57, j,myUniquePlacePoint);


					final int RX10_TEMP59 = 0;


					final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;

					if(RX10_TEMP60)
						{

						final String RX10_TEMP61 = "Point j not found in the distribution D.";

						throw new RuntimeException(RX10_TEMP61);

						}

					final int RX10_TEMP62 = Program.getPlaceFromDist1(D, RX10_TEMP58,myUniquePlacePoint);


					final int X10_TEMP19 = RX10_TEMP62;

					//async(X10_TEMP19)
						{

						final Dist1 RX10_TEMP63 = P.distValue;


						final Region1 RX10_TEMP64 = RX10_TEMP63.dReg;


						final int RX10_TEMP65 = Program.searchPointInRegion1(RX10_TEMP64, j,X10_TEMP19);


						final int RX10_TEMP66 = 0;


						final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66;

						if(RX10_TEMP67)
							{

							String RX10_TEMP68 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP68);

							}

						final int RX10_TEMP69 = Program.getPlaceFromDist1(RX10_TEMP63, RX10_TEMP65,X10_TEMP19);


						final int RX10_TEMP71 = 0;


						final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71;

						if(RX10_TEMP72)
							{

							String RX10_TEMP70 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP70);

							}

						final md RX10_TEMP73 = Program.getRefArrayValue1md(P, RX10_TEMP65,X10_TEMP19);


						final md X10_TEMP21 = RX10_TEMP73;


						final int X10_TEMP24 = move.f0;

						Program.md_runiters3(X10_TEMP21, X10_TEMP24,X10_TEMP19);
						}
					}
				}
			}
		}
public static void md_validate ( final Dist1 D, final mdRefArray1 P, int myUniquePlacePoint)
		{
		/*FINISH
*/			{

			final Region1 RX10_TEMP1 = D.dReg;


			final int RX10_TEMP4 = 1;


			int RX10_TEMP2 = RX10_TEMP1.regSize;


			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;


			final int  RX10_TEMP3 = RX10_TEMP2+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3; RX10_TEMP0++)
				{

				final int RX10_TEMP5 = RX10_TEMP0;


				final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5,myUniquePlacePoint);


				final Region1 RX10_TEMP6 = D.dReg;


				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, j,myUniquePlacePoint);


				final int RX10_TEMP8 = 0;


				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

				if(RX10_TEMP9)
					{

					final String RX10_TEMP10 = "Point j not found in the distribution D.";

					throw new RuntimeException(RX10_TEMP10);

					}

				final int RX10_TEMP11 = Program.getPlaceFromDist1(D, RX10_TEMP7,myUniquePlacePoint);


				final int X10_TEMP2 = RX10_TEMP11;

				//async(X10_TEMP2)
					{

					double ref = 275.97175611773514;


					final Dist1 RX10_TEMP12 = P.distValue;


					final Region1 RX10_TEMP13 = RX10_TEMP12.dReg;


					final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13, j,X10_TEMP2);


					final int RX10_TEMP15 = 0;


					final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;

					if(RX10_TEMP16)
						{

						String RX10_TEMP17 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP17);

						}

					final int RX10_TEMP18 = Program.getPlaceFromDist1(RX10_TEMP12, RX10_TEMP14,X10_TEMP2);


					final int RX10_TEMP20 = 0;


					final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20;

					if(RX10_TEMP21)
						{

						String RX10_TEMP19 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP19);

						}

					final md RX10_TEMP22 = Program.getRefArrayValue1md(P, RX10_TEMP14,X10_TEMP2);


					final md X10_TEMP5 = RX10_TEMP22;


					final double X10_TEMP6 = X10_TEMP5.ek;


					final double X10_TEMP8 = X10_TEMP6 - ref;


					double dev = Math.abs(X10_TEMP8);


					final double X10_TEMP10 = 1.0e-12;


					final boolean X10_TEMP12 = dev > X10_TEMP10;

					if(X10_TEMP12)
						{

						final String X10_TEMP14 = "Validation failed at place: ";


						final int X10_TEMP15 = j.f0;


						final String X10_TEMP17 = X10_TEMP14 + X10_TEMP15;

						System.out.println(X10_TEMP17);

						final String X10_TEMP20 = "Kinetic energy = ";


						final Dist1 RX10_TEMP23 = P.distValue;


						final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;


						final int RX10_TEMP25 = Program.searchPointInRegion1(RX10_TEMP24, j,X10_TEMP2);


						final int RX10_TEMP26 = 0;


						final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;

						if(RX10_TEMP27)
							{

							String RX10_TEMP28 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP28);

							}

						final int RX10_TEMP29 = Program.getPlaceFromDist1(RX10_TEMP23, RX10_TEMP25,X10_TEMP2);


						final int RX10_TEMP31 = 0;


						final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;

						if(RX10_TEMP32)
							{

							String RX10_TEMP30 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP30);

							}

						final md RX10_TEMP33 = Program.getRefArrayValue1md(P, RX10_TEMP25,X10_TEMP2);


						final md X10_TEMP19 = RX10_TEMP33;


						final double X10_TEMP21 = X10_TEMP19.ek;


						final String X10_TEMP22 = X10_TEMP20 + X10_TEMP21;


						final String X10_TEMP23 = " ";


						final String X10_TEMP24 = X10_TEMP22 + X10_TEMP23;


						final String X10_TEMP25 = X10_TEMP24 + dev;


						final String X10_TEMP26 = " ";


						final String X10_TEMP27 = X10_TEMP25 + X10_TEMP26;


						final String X10_TEMP29 = X10_TEMP27 + ref;

						System.out.println(X10_TEMP29);

						final String X10_TEMP31 = "Validation failed";

						throw new RuntimeException(X10_TEMP31);

						}
					}
				}
			}
		}
public static void md_initialise ( final md X10_TEMP0, final int rank0, final int nprocess0, int myUniquePlacePoint)
		{

		final int X10_TEMP3 = rank0;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.rnk = (X10_TEMP3);

		final int X10_TEMP6 = nprocess0;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.nprocess = (X10_TEMP6);

		final double X10_TEMP9 = 0.0;


		final double X10_TEMP10 = X10_TEMP9;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.vir = (X10_TEMP10);

		final double X10_TEMP13 = 0.0;


		final double X10_TEMP14 = X10_TEMP13;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.epot = (X10_TEMP14);

		final int X10_TEMP17 = 0;


		final int X10_TEMP18 = X10_TEMP17;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.interactions = (X10_TEMP18);

		int mm = 4;


		final int X10_TEMP20 = mm * mm;


		final int X10_TEMP21 = X10_TEMP20 * mm;


		final int X10_TEMP22 = 4;


		int partsize = X10_TEMP21 * X10_TEMP22;


		final int X10_TEMP26 = partsize;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.mdsize = (X10_TEMP26);

		final int X10_TEMP31 = 0;


		final int X10_TEMP28 = X10_TEMP0.mdsize;


		final int X10_TEMP29 = 1;


		final int X10_TEMP32 = X10_TEMP28 - X10_TEMP29;


		final Region1 X10_TEMP33 = Program.createNewRegion1R(X10_TEMP31, X10_TEMP32,myUniquePlacePoint);


		final int X10_TEMP34 = 0;


		Dist1 dOne = Program.getPlaceDist1(X10_TEMP33, X10_TEMP34,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dOne.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final ParticleStub[] RX10_TEMP6 = new ParticleStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dOne, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Particle[] RX10_TEMP14 = new Particle[RX10_TEMP13];


					final ParticleStub RX10_TEMP15 = new ParticleStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final ParticleStub[] RX10_TEMP16 = (ParticleStub[])(new ParticleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final ParticleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final ParticleRefArray1 RX10_TEMP19 = new ParticleRefArray1(dOne, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final ParticleRefArray1 X10_TEMP38 = RX10_TEMP19;


		final ParticleRefArray1 X10_TEMP39 = X10_TEMP38;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.one = (X10_TEMP39);

		final double X10_TEMP42 = _md_LENGTH;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.l = (X10_TEMP42);

		final double X10_TEMP43 = X10_TEMP0.mdsize;


		final double X10_TEMP45 = X10_TEMP43 / _md_den;


		final double X10_TEMP48 = 0.3333333;


		final double X10_TEMP51 = Math.pow(X10_TEMP45, X10_TEMP48);


		final double X10_TEMP52 = X10_TEMP51;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.side = (X10_TEMP52);

		final double X10_TEMP53 = 4.0;


		final double X10_TEMP56 = mm / X10_TEMP53;


		final double X10_TEMP57 = X10_TEMP56;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.rcoff = (X10_TEMP57);

		final double X10_TEMP58 = X10_TEMP0.side;


		final double X10_TEMP61 = X10_TEMP58 / mm;


		final double X10_TEMP62 = X10_TEMP61;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.a = (X10_TEMP62);

		final double X10_TEMP63 = X10_TEMP0.side;


		final double X10_TEMP64 = 0.5;


		final double X10_TEMP67 = X10_TEMP63 * X10_TEMP64;


		final double X10_TEMP68 = X10_TEMP67;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.sideh = (X10_TEMP68);

		final double X10_TEMP71 = _md_h * _md_h;


		final double X10_TEMP72 = X10_TEMP71;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.hsq = (X10_TEMP72);

		final double X10_TEMP73 = X10_TEMP0.hsq;


		final double X10_TEMP74 = 0.5;


		final double X10_TEMP77 = X10_TEMP73 * X10_TEMP74;


		final double X10_TEMP78 = X10_TEMP77;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.hsq2 = (X10_TEMP78);

		final int X10_TEMP79 = X10_TEMP0.mdsize;


		final int X10_TEMP80 = 1;


		final int X10_TEMP83 = X10_TEMP79 - X10_TEMP80;


		final int X10_TEMP84 = X10_TEMP83;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.npartm = (X10_TEMP84);

		final double X10_TEMP85 = X10_TEMP0.rcoff;


		final double X10_TEMP86 = X10_TEMP0.rcoff;


		final double X10_TEMP89 = X10_TEMP85 * X10_TEMP86;


		final double X10_TEMP90 = X10_TEMP89;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.rcoffs = (X10_TEMP90);

		final double X10_TEMP97 = 16.0;


		final double X10_TEMP91 = 1.0;


		final int X10_TEMP92 = X10_TEMP0.mdsize;


		final double X10_TEMP93 = X10_TEMP91 * X10_TEMP92;


		final double X10_TEMP94 = 1.0;


		final double X10_TEMP96 = X10_TEMP93 - X10_TEMP94;


		final double X10_TEMP100 = X10_TEMP97 / X10_TEMP96;


		final double X10_TEMP101 = X10_TEMP100;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.tscale = (X10_TEMP101);

		final double X10_TEMP105 = 1.13;


		final double X10_TEMP102 = 24.0;


		final double X10_TEMP104 = _md_tref / X10_TEMP102;


		final double X10_TEMP106 = Math.sqrt(X10_TEMP104);


		final double X10_TEMP109 = X10_TEMP105 * X10_TEMP106;


		final double X10_TEMP110 = X10_TEMP109;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.vaver = (X10_TEMP110);

		final double X10_TEMP111 = X10_TEMP0.vaver;


		final double X10_TEMP114 = X10_TEMP111 * _md_h;


		final double X10_TEMP115 = X10_TEMP114;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.vaverh = (X10_TEMP115);

		final int X10_TEMP118 = 0;


		final int X10_TEMP119 = 0;


		final Region1 X10_TEMP121 = Program.createNewRegion1R(X10_TEMP118, X10_TEMP119,myUniquePlacePoint);


		final int RX10_TEMP23 = 1;


		int RX10_TEMP21 = X10_TEMP121.regSize;


		RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23;


		final int  RX10_TEMP22 = RX10_TEMP21+1;

		for(int RX10_TEMP20=0; RX10_TEMP20 < RX10_TEMP22; RX10_TEMP20++)
			{

			final int RX10_TEMP24 = RX10_TEMP20;


			final Point1 base = Program.regionOrdinalPoint1(X10_TEMP121, RX10_TEMP24,myUniquePlacePoint);


			Point1 ijk = base;


			final int X10_TEMP125 = 0;


			final int X10_TEMP126 = 1;


			final int X10_TEMP130 = 0;


			final int X10_TEMP128 = 1;


			final int X10_TEMP131 = mm - X10_TEMP128;


			final int X10_TEMP135 = 0;


			final int X10_TEMP133 = 1;


			final int X10_TEMP136 = mm - X10_TEMP133;


			final int X10_TEMP140 = 0;


			final int X10_TEMP138 = 1;


			final int X10_TEMP141 = mm - X10_TEMP138;


			final Region4 X10_TEMP143 = Program.createNewRegion4RRRR(X10_TEMP125, X10_TEMP126, X10_TEMP130, X10_TEMP131, X10_TEMP135, X10_TEMP136, X10_TEMP140, X10_TEMP141,myUniquePlacePoint);


			final int RX10_TEMP28 = 1;


			int RX10_TEMP26 = X10_TEMP143.regSize;


			RX10_TEMP26 = RX10_TEMP26 - RX10_TEMP28;


			final int  RX10_TEMP27 = RX10_TEMP26+1;

			for(int RX10_TEMP25=0; RX10_TEMP25 < RX10_TEMP27; RX10_TEMP25++)
				{

				final int RX10_TEMP29 = RX10_TEMP25;


				final Point4 p = Program.regionOrdinalPoint4(X10_TEMP143, RX10_TEMP29,myUniquePlacePoint);


				final ParticleRefArray1 X10_TEMP144 = X10_TEMP0.one;


				final double X10_TEMP147 = p.f1;


				final double X10_TEMP148 = X10_TEMP0.a;


				final double X10_TEMP154 = X10_TEMP147 * X10_TEMP148;


				final double X10_TEMP150 = p.f0;


				final double X10_TEMP151 = X10_TEMP0.a;


				final double X10_TEMP152 = X10_TEMP150 * X10_TEMP151;


				final double X10_TEMP153 = 0.5;


				final double X10_TEMP155 = X10_TEMP152 * X10_TEMP153;


				final double X10_TEMP157 = X10_TEMP154 + X10_TEMP155;


				final double X10_TEMP160 = p.f2;


				final double X10_TEMP161 = X10_TEMP0.a;


				final double X10_TEMP167 = X10_TEMP160 * X10_TEMP161;


				final double X10_TEMP163 = p.f0;


				final double X10_TEMP164 = X10_TEMP0.a;


				final double X10_TEMP165 = X10_TEMP163 * X10_TEMP164;


				final double X10_TEMP166 = 0.5;


				final double X10_TEMP168 = X10_TEMP165 * X10_TEMP166;


				final double X10_TEMP170 = X10_TEMP167 + X10_TEMP168;


				final double X10_TEMP173 = p.f3;


				final double X10_TEMP174 = X10_TEMP0.a;


				final double X10_TEMP176 = X10_TEMP173 * X10_TEMP174;


				double X10_TEMP184 = 0.0;


				double X10_TEMP185 = 0.0;


				double X10_TEMP186 = 0.0;


				double X10_TEMP187 = 0.0;


				double X10_TEMP188 = 0.0;


				double X10_TEMP189 = 0.0;


				final Particle X10_TEMP192 = new Particle(X10_TEMP157, X10_TEMP170, X10_TEMP176, X10_TEMP184, X10_TEMP185, X10_TEMP186, X10_TEMP187, X10_TEMP188, X10_TEMP189,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP192.hashCode());


				final Particle X10_TEMP193 = X10_TEMP192;


				final Dist1 RX10_TEMP30 = X10_TEMP144.distValue;


				final Region1 RX10_TEMP31 = RX10_TEMP30.dReg;


				final int RX10_TEMP32 = Program.searchPointInRegion1(RX10_TEMP31, ijk,myUniquePlacePoint);


				final int RX10_TEMP33 = 0;


				final boolean RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33;

				if(RX10_TEMP34)
					{

					String RX10_TEMP35 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP35);

					}

				final int RX10_TEMP36 = Program.getPlaceFromDist1(RX10_TEMP30, RX10_TEMP32,myUniquePlacePoint);


				final int RX10_TEMP38 = 0;


				final boolean RX10_TEMP39 = RX10_TEMP36 != RX10_TEMP38;

				if(RX10_TEMP39)
					{

					String RX10_TEMP37 = "Bad place access for array X10_TEMP144";

					throw new RuntimeException(RX10_TEMP37);

					}
				Program.setRefArrayValue1Particle(X10_TEMP144, RX10_TEMP32, X10_TEMP193,myUniquePlacePoint);

				int X10_TEMP195 = 1;


				int RX10_TEMP40 = ijk.f0;


				RX10_TEMP40 = RX10_TEMP40 + X10_TEMP195;


				final Point1 X10_TEMP197 = new Point1(RX10_TEMP40,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP197.hashCode());


				ijk = X10_TEMP197;

				}

			final int X10_TEMP200 = 1;


			final int X10_TEMP201 = 2;


			final int X10_TEMP205 = 0;


			final int X10_TEMP203 = 1;


			final int X10_TEMP206 = mm - X10_TEMP203;


			final int X10_TEMP210 = 0;


			final int X10_TEMP208 = 1;


			final int X10_TEMP211 = mm - X10_TEMP208;


			final int X10_TEMP215 = 0;


			final int X10_TEMP213 = 1;


			final int X10_TEMP216 = mm - X10_TEMP213;


			final Region4 X10_TEMP218 = Program.createNewRegion4RRRR(X10_TEMP200, X10_TEMP201, X10_TEMP205, X10_TEMP206, X10_TEMP210, X10_TEMP211, X10_TEMP215, X10_TEMP216,myUniquePlacePoint);


			final int RX10_TEMP44 = 1;


			int RX10_TEMP42 = X10_TEMP218.regSize;


			RX10_TEMP42 = RX10_TEMP42 - RX10_TEMP44;


			final int  RX10_TEMP43 = RX10_TEMP42+1;

			for(int RX10_TEMP41=0; RX10_TEMP41 < RX10_TEMP43; RX10_TEMP41++)
				{

				final int RX10_TEMP45 = RX10_TEMP41;


				final Point4 p = Program.regionOrdinalPoint4(X10_TEMP218, RX10_TEMP45,myUniquePlacePoint);


				final ParticleRefArray1 X10_TEMP219 = X10_TEMP0.one;


				final double X10_TEMP222 = p.f1;


				final double X10_TEMP223 = X10_TEMP0.a;


				final double X10_TEMP232 = X10_TEMP222 * X10_TEMP223;


				final int X10_TEMP225 = 2;


				final int X10_TEMP226 = p.f0;


				final int X10_TEMP228 = X10_TEMP225 - X10_TEMP226;


				final double X10_TEMP229 = X10_TEMP0.a;


				final double X10_TEMP230 = X10_TEMP228 * X10_TEMP229;


				final double X10_TEMP231 = 0.5;


				final double X10_TEMP233 = X10_TEMP230 * X10_TEMP231;


				final double X10_TEMP235 = X10_TEMP232 + X10_TEMP233;


				final double X10_TEMP238 = p.f2;


				final double X10_TEMP239 = X10_TEMP0.a;


				final double X10_TEMP248 = X10_TEMP238 * X10_TEMP239;


				final int X10_TEMP241 = p.f0;


				final int X10_TEMP242 = 1;


				final int X10_TEMP244 = X10_TEMP241 - X10_TEMP242;


				final double X10_TEMP245 = X10_TEMP0.a;


				final double X10_TEMP246 = X10_TEMP244 * X10_TEMP245;


				final double X10_TEMP247 = 0.5;


				final double X10_TEMP249 = X10_TEMP246 * X10_TEMP247;


				final double X10_TEMP251 = X10_TEMP248 + X10_TEMP249;


				final double X10_TEMP254 = p.f3;


				final double X10_TEMP255 = X10_TEMP0.a;


				final double X10_TEMP258 = X10_TEMP254 * X10_TEMP255;


				final double X10_TEMP256 = X10_TEMP0.a;


				final double X10_TEMP257 = 0.5;


				final double X10_TEMP259 = X10_TEMP256 * X10_TEMP257;


				final double X10_TEMP261 = X10_TEMP258 + X10_TEMP259;


				double X10_TEMP269 = 0.0;


				double X10_TEMP270 = 0.0;


				double X10_TEMP271 = 0.0;


				double X10_TEMP272 = 0.0;


				double X10_TEMP273 = 0.0;


				double X10_TEMP274 = 0.0;


				final Particle X10_TEMP277 = new Particle(X10_TEMP235, X10_TEMP251, X10_TEMP261, X10_TEMP269, X10_TEMP270, X10_TEMP271, X10_TEMP272, X10_TEMP273, X10_TEMP274,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP277.hashCode());


				final Particle X10_TEMP278 = X10_TEMP277;


				final Dist1 RX10_TEMP46 = X10_TEMP219.distValue;


				final Region1 RX10_TEMP47 = RX10_TEMP46.dReg;


				final int RX10_TEMP48 = Program.searchPointInRegion1(RX10_TEMP47, ijk,myUniquePlacePoint);


				final int RX10_TEMP49 = 0;


				final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49;

				if(RX10_TEMP50)
					{

					String RX10_TEMP51 = "Array index out of bounds";

					throw new RuntimeException(RX10_TEMP51);

					}

				final int RX10_TEMP52 = Program.getPlaceFromDist1(RX10_TEMP46, RX10_TEMP48,myUniquePlacePoint);


				final int RX10_TEMP54 = 0;


				final boolean RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54;

				if(RX10_TEMP55)
					{

					String RX10_TEMP53 = "Bad place access for array X10_TEMP219";

					throw new RuntimeException(RX10_TEMP53);

					}
				Program.setRefArrayValue1Particle(X10_TEMP219, RX10_TEMP48, X10_TEMP278,myUniquePlacePoint);

				int X10_TEMP280 = 1;


				int RX10_TEMP56 = ijk.f0;


				RX10_TEMP56 = RX10_TEMP56 + X10_TEMP280;


				final Point1 X10_TEMP282 = new Point1(RX10_TEMP56,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP282.hashCode());


				ijk = X10_TEMP282;

				}
			}

		int iseed = 0;


		double v1 = 0.0;


		double v2 = 0.0;


		Random randnum = new Random(iseed, v1, v2,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(randnum.hashCode());


		double r = 0.0;


		int k = 0;


		final int X10_TEMP292 = X10_TEMP0.mdsize;


		boolean X10_TEMP296 = k < X10_TEMP292;

		while(X10_TEMP296)
			{

			final double X10_TEMP298 = Program.Random_seed(randnum,myUniquePlacePoint);


			r = X10_TEMP298;


			final ParticleRefArray1 X10_TEMP299 = X10_TEMP0.one;


			final Point1 RX10_TEMP57 = new Point1(k,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP57.hashCode());


			final Dist1 RX10_TEMP58 = X10_TEMP299.distValue;


			final Region1 RX10_TEMP59 = RX10_TEMP58.dReg;


			final int RX10_TEMP60 = Program.searchPointInRegion1(RX10_TEMP59, RX10_TEMP57,myUniquePlacePoint);


			final int RX10_TEMP61 = 0;


			final boolean RX10_TEMP62 = RX10_TEMP60 < RX10_TEMP61;

			if(RX10_TEMP62)
				{

				String RX10_TEMP63 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP63);

				}

			final int RX10_TEMP64 = Program.getPlaceFromDist1(RX10_TEMP58, RX10_TEMP60,myUniquePlacePoint);


			final int RX10_TEMP66 = 0;


			final boolean RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66;

			if(RX10_TEMP67)
				{

				String RX10_TEMP65 = "Bad place access for array X10_TEMP299";

				throw new RuntimeException(RX10_TEMP65);

				}

			final Particle RX10_TEMP68 = Program.getRefArrayValue1Particle(X10_TEMP299, RX10_TEMP60,myUniquePlacePoint);


			final Particle X10_TEMP301 = RX10_TEMP68;


			final double X10_TEMP302 = randnum.v1;


			final double X10_TEMP305 = r * X10_TEMP302;


			final double X10_TEMP306 = X10_TEMP305;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP301.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP301.xvelocity = (X10_TEMP306);

			final ParticleRefArray1 X10_TEMP307 = X10_TEMP0.one;


			final int X10_TEMP308 = 1;


			final int X10_TEMP310 = k + X10_TEMP308;


			final Point1 RX10_TEMP69 = new Point1(X10_TEMP310,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP69.hashCode());


			final Dist1 RX10_TEMP70 = X10_TEMP307.distValue;


			final Region1 RX10_TEMP71 = RX10_TEMP70.dReg;


			final int RX10_TEMP72 = Program.searchPointInRegion1(RX10_TEMP71, RX10_TEMP69,myUniquePlacePoint);


			final int RX10_TEMP73 = 0;


			final boolean RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73;

			if(RX10_TEMP74)
				{

				String RX10_TEMP75 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP75);

				}

			final int RX10_TEMP76 = Program.getPlaceFromDist1(RX10_TEMP70, RX10_TEMP72,myUniquePlacePoint);


			final int RX10_TEMP78 = 0;


			final boolean RX10_TEMP79 = RX10_TEMP76 != RX10_TEMP78;

			if(RX10_TEMP79)
				{

				String RX10_TEMP77 = "Bad place access for array X10_TEMP307";

				throw new RuntimeException(RX10_TEMP77);

				}

			final Particle RX10_TEMP80 = Program.getRefArrayValue1Particle(X10_TEMP307, RX10_TEMP72,myUniquePlacePoint);


			final Particle X10_TEMP311 = RX10_TEMP80;


			final double X10_TEMP312 = randnum.v2;


			final double X10_TEMP315 = r * X10_TEMP312;


			final double X10_TEMP316 = X10_TEMP315;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP311.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP311.xvelocity = (X10_TEMP316);

			final int X10_TEMP317 = 2;


			final int X10_TEMP319 = k + X10_TEMP317;


			k = X10_TEMP319;


			final int X10_TEMP294 = X10_TEMP0.mdsize;


			X10_TEMP296 = k < X10_TEMP294;

			}

		final int X10_TEMP321 = 0;


		k = X10_TEMP321;


		final int X10_TEMP322 = X10_TEMP0.mdsize;


		boolean X10_TEMP326 = k < X10_TEMP322;

		while(X10_TEMP326)
			{

			final double X10_TEMP328 = Program.Random_seed(randnum,myUniquePlacePoint);


			r = X10_TEMP328;


			final ParticleRefArray1 X10_TEMP329 = X10_TEMP0.one;


			final Point1 RX10_TEMP81 = new Point1(k,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP81.hashCode());


			final Dist1 RX10_TEMP82 = X10_TEMP329.distValue;


			final Region1 RX10_TEMP83 = RX10_TEMP82.dReg;


			final int RX10_TEMP84 = Program.searchPointInRegion1(RX10_TEMP83, RX10_TEMP81,myUniquePlacePoint);


			final int RX10_TEMP85 = 0;


			final boolean RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85;

			if(RX10_TEMP86)
				{

				String RX10_TEMP87 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP87);

				}

			final int RX10_TEMP88 = Program.getPlaceFromDist1(RX10_TEMP82, RX10_TEMP84,myUniquePlacePoint);


			final int RX10_TEMP90 = 0;


			final boolean RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90;

			if(RX10_TEMP91)
				{

				String RX10_TEMP89 = "Bad place access for array X10_TEMP329";

				throw new RuntimeException(RX10_TEMP89);

				}

			final Particle RX10_TEMP92 = Program.getRefArrayValue1Particle(X10_TEMP329, RX10_TEMP84,myUniquePlacePoint);


			final Particle X10_TEMP331 = RX10_TEMP92;


			final double X10_TEMP332 = randnum.v1;


			final double X10_TEMP335 = r * X10_TEMP332;


			final double X10_TEMP336 = X10_TEMP335;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP331.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP331.yvelocity = (X10_TEMP336);

			final ParticleRefArray1 X10_TEMP337 = X10_TEMP0.one;


			final int X10_TEMP338 = 1;


			final int X10_TEMP340 = k + X10_TEMP338;


			final Point1 RX10_TEMP93 = new Point1(X10_TEMP340,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP93.hashCode());


			final Dist1 RX10_TEMP94 = X10_TEMP337.distValue;


			final Region1 RX10_TEMP95 = RX10_TEMP94.dReg;


			final int RX10_TEMP96 = Program.searchPointInRegion1(RX10_TEMP95, RX10_TEMP93,myUniquePlacePoint);


			final int RX10_TEMP97 = 0;


			final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;

			if(RX10_TEMP98)
				{

				String RX10_TEMP99 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP99);

				}

			final int RX10_TEMP100 = Program.getPlaceFromDist1(RX10_TEMP94, RX10_TEMP96,myUniquePlacePoint);


			final int RX10_TEMP102 = 0;


			final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;

			if(RX10_TEMP103)
				{

				String RX10_TEMP101 = "Bad place access for array X10_TEMP337";

				throw new RuntimeException(RX10_TEMP101);

				}

			final Particle RX10_TEMP104 = Program.getRefArrayValue1Particle(X10_TEMP337, RX10_TEMP96,myUniquePlacePoint);


			final Particle X10_TEMP341 = RX10_TEMP104;


			final double X10_TEMP342 = randnum.v2;


			final double X10_TEMP345 = r * X10_TEMP342;


			final double X10_TEMP346 = X10_TEMP345;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP341.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP341.yvelocity = (X10_TEMP346);

			final int X10_TEMP347 = 2;


			final int X10_TEMP349 = k + X10_TEMP347;


			k = X10_TEMP349;


			final int X10_TEMP324 = X10_TEMP0.mdsize;


			X10_TEMP326 = k < X10_TEMP324;

			}

		final int X10_TEMP351 = 0;


		k = X10_TEMP351;


		final int X10_TEMP352 = X10_TEMP0.mdsize;


		boolean X10_TEMP356 = k < X10_TEMP352;

		while(X10_TEMP356)
			{

			final double X10_TEMP358 = Program.Random_seed(randnum,myUniquePlacePoint);


			r = X10_TEMP358;


			final ParticleRefArray1 X10_TEMP359 = X10_TEMP0.one;


			final Point1 RX10_TEMP105 = new Point1(k,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP105.hashCode());


			final Dist1 RX10_TEMP106 = X10_TEMP359.distValue;


			final Region1 RX10_TEMP107 = RX10_TEMP106.dReg;


			final int RX10_TEMP108 = Program.searchPointInRegion1(RX10_TEMP107, RX10_TEMP105,myUniquePlacePoint);


			final int RX10_TEMP109 = 0;


			final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109;

			if(RX10_TEMP110)
				{

				String RX10_TEMP111 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP111);

				}

			final int RX10_TEMP112 = Program.getPlaceFromDist1(RX10_TEMP106, RX10_TEMP108,myUniquePlacePoint);


			final int RX10_TEMP114 = 0;


			final boolean RX10_TEMP115 = RX10_TEMP112 != RX10_TEMP114;

			if(RX10_TEMP115)
				{

				String RX10_TEMP113 = "Bad place access for array X10_TEMP359";

				throw new RuntimeException(RX10_TEMP113);

				}

			final Particle RX10_TEMP116 = Program.getRefArrayValue1Particle(X10_TEMP359, RX10_TEMP108,myUniquePlacePoint);


			final Particle X10_TEMP361 = RX10_TEMP116;


			final double X10_TEMP362 = randnum.v1;


			final double X10_TEMP365 = r * X10_TEMP362;


			final double X10_TEMP366 = X10_TEMP365;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP361.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP361.zvelocity = (X10_TEMP366);

			final ParticleRefArray1 X10_TEMP367 = X10_TEMP0.one;


			final int X10_TEMP368 = 1;


			final int X10_TEMP370 = k + X10_TEMP368;


			final Point1 RX10_TEMP117 = new Point1(X10_TEMP370,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP117.hashCode());


			final Dist1 RX10_TEMP118 = X10_TEMP367.distValue;


			final Region1 RX10_TEMP119 = RX10_TEMP118.dReg;


			final int RX10_TEMP120 = Program.searchPointInRegion1(RX10_TEMP119, RX10_TEMP117,myUniquePlacePoint);


			final int RX10_TEMP121 = 0;


			final boolean RX10_TEMP122 = RX10_TEMP120 < RX10_TEMP121;

			if(RX10_TEMP122)
				{

				String RX10_TEMP123 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP123);

				}

			final int RX10_TEMP124 = Program.getPlaceFromDist1(RX10_TEMP118, RX10_TEMP120,myUniquePlacePoint);


			final int RX10_TEMP126 = 0;


			final boolean RX10_TEMP127 = RX10_TEMP124 != RX10_TEMP126;

			if(RX10_TEMP127)
				{

				String RX10_TEMP125 = "Bad place access for array X10_TEMP367";

				throw new RuntimeException(RX10_TEMP125);

				}

			final Particle RX10_TEMP128 = Program.getRefArrayValue1Particle(X10_TEMP367, RX10_TEMP120,myUniquePlacePoint);


			final Particle X10_TEMP371 = RX10_TEMP128;


			final double X10_TEMP372 = randnum.v2;


			final double X10_TEMP375 = r * X10_TEMP372;


			final double X10_TEMP376 = X10_TEMP375;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP371.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP371.zvelocity = (X10_TEMP376);

			final int X10_TEMP377 = 2;


			final int X10_TEMP379 = k + X10_TEMP377;


			k = X10_TEMP379;


			final int X10_TEMP354 = X10_TEMP0.mdsize;


			X10_TEMP356 = k < X10_TEMP354;

			}

		final double X10_TEMP382 = 0.0;


		final double X10_TEMP383 = X10_TEMP382;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.ekin = (X10_TEMP383);

		double sp = 0.0;


		final int X10_TEMP389 = 0;


		final int X10_TEMP386 = X10_TEMP0.mdsize;


		final int X10_TEMP387 = 1;


		final int X10_TEMP390 = X10_TEMP386 - X10_TEMP387;


		final Region1 X10_TEMP392 = Program.createNewRegion1R(X10_TEMP389, X10_TEMP390,myUniquePlacePoint);


		final int RX10_TEMP132 = 1;


		int RX10_TEMP130 = X10_TEMP392.regSize;


		RX10_TEMP130 = RX10_TEMP130 - RX10_TEMP132;


		final int  RX10_TEMP131 = RX10_TEMP130+1;

		for(int RX10_TEMP129=0; RX10_TEMP129 < RX10_TEMP131; RX10_TEMP129++)
			{

			final int RX10_TEMP133 = RX10_TEMP129;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP392, RX10_TEMP133,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP393 = X10_TEMP0.one;


			final Dist1 RX10_TEMP134 = X10_TEMP393.distValue;


			final Region1 RX10_TEMP135 = RX10_TEMP134.dReg;


			final int RX10_TEMP136 = Program.searchPointInRegion1(RX10_TEMP135, i,myUniquePlacePoint);


			final int RX10_TEMP137 = 0;


			final boolean RX10_TEMP138 = RX10_TEMP136 < RX10_TEMP137;

			if(RX10_TEMP138)
				{

				String RX10_TEMP139 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP139);

				}

			final int RX10_TEMP140 = Program.getPlaceFromDist1(RX10_TEMP134, RX10_TEMP136,myUniquePlacePoint);


			final int RX10_TEMP142 = 0;


			final boolean RX10_TEMP143 = RX10_TEMP140 != RX10_TEMP142;

			if(RX10_TEMP143)
				{

				String RX10_TEMP141 = "Bad place access for array X10_TEMP393";

				throw new RuntimeException(RX10_TEMP141);

				}

			final Particle RX10_TEMP144 = Program.getRefArrayValue1Particle(X10_TEMP393, RX10_TEMP136,myUniquePlacePoint);


			final Particle X10_TEMP395 = RX10_TEMP144;


			final double X10_TEMP396 = X10_TEMP395.xvelocity;


			final double X10_TEMP398 = sp + X10_TEMP396;


			sp = X10_TEMP398;

			}

		final int X10_TEMP399 = X10_TEMP0.mdsize;


		final double X10_TEMP401 = sp / X10_TEMP399;


		sp = X10_TEMP401;


		final int X10_TEMP406 = 0;


		final int X10_TEMP403 = X10_TEMP0.mdsize;


		final int X10_TEMP404 = 1;


		final int X10_TEMP407 = X10_TEMP403 - X10_TEMP404;


		final Region1 X10_TEMP409 = Program.createNewRegion1R(X10_TEMP406, X10_TEMP407,myUniquePlacePoint);


		final int RX10_TEMP148 = 1;


		int RX10_TEMP146 = X10_TEMP409.regSize;


		RX10_TEMP146 = RX10_TEMP146 - RX10_TEMP148;


		final int  RX10_TEMP147 = RX10_TEMP146+1;

		for(int RX10_TEMP145=0; RX10_TEMP145 < RX10_TEMP147; RX10_TEMP145++)
			{

			final int RX10_TEMP149 = RX10_TEMP145;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP409, RX10_TEMP149,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP410 = X10_TEMP0.one;


			final Dist1 RX10_TEMP150 = X10_TEMP410.distValue;


			final Region1 RX10_TEMP151 = RX10_TEMP150.dReg;


			final int RX10_TEMP152 = Program.searchPointInRegion1(RX10_TEMP151, i,myUniquePlacePoint);


			final int RX10_TEMP153 = 0;


			final boolean RX10_TEMP154 = RX10_TEMP152 < RX10_TEMP153;

			if(RX10_TEMP154)
				{

				String RX10_TEMP155 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP155);

				}

			final int RX10_TEMP156 = Program.getPlaceFromDist1(RX10_TEMP150, RX10_TEMP152,myUniquePlacePoint);


			final int RX10_TEMP158 = 0;


			final boolean RX10_TEMP159 = RX10_TEMP156 != RX10_TEMP158;

			if(RX10_TEMP159)
				{

				String RX10_TEMP157 = "Bad place access for array X10_TEMP410";

				throw new RuntimeException(RX10_TEMP157);

				}

			final Particle RX10_TEMP160 = Program.getRefArrayValue1Particle(X10_TEMP410, RX10_TEMP152,myUniquePlacePoint);


			final Particle X10_TEMP412 = RX10_TEMP160;


			final ParticleRefArray1 X10_TEMP413 = X10_TEMP0.one;


			final Dist1 RX10_TEMP161 = X10_TEMP413.distValue;


			final Region1 RX10_TEMP162 = RX10_TEMP161.dReg;


			final int RX10_TEMP163 = Program.searchPointInRegion1(RX10_TEMP162, i,myUniquePlacePoint);


			final int RX10_TEMP164 = 0;


			final boolean RX10_TEMP165 = RX10_TEMP163 < RX10_TEMP164;

			if(RX10_TEMP165)
				{

				String RX10_TEMP166 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP166);

				}

			final int RX10_TEMP167 = Program.getPlaceFromDist1(RX10_TEMP161, RX10_TEMP163,myUniquePlacePoint);


			final int RX10_TEMP169 = 0;


			final boolean RX10_TEMP170 = RX10_TEMP167 != RX10_TEMP169;

			if(RX10_TEMP170)
				{

				String RX10_TEMP168 = "Bad place access for array X10_TEMP413";

				throw new RuntimeException(RX10_TEMP168);

				}

			final Particle RX10_TEMP171 = Program.getRefArrayValue1Particle(X10_TEMP413, RX10_TEMP163,myUniquePlacePoint);


			final Particle X10_TEMP415 = RX10_TEMP171;


			final double X10_TEMP416 = X10_TEMP415.xvelocity;


			final double X10_TEMP419 = X10_TEMP416 - sp;


			final double X10_TEMP420 = X10_TEMP419;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP412.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP412.xvelocity = (X10_TEMP420);

			final double X10_TEMP429 = X10_TEMP0.ekin;


			final ParticleRefArray1 X10_TEMP421 = X10_TEMP0.one;


			final Dist1 RX10_TEMP172 = X10_TEMP421.distValue;


			final Region1 RX10_TEMP173 = RX10_TEMP172.dReg;


			final int RX10_TEMP174 = Program.searchPointInRegion1(RX10_TEMP173, i,myUniquePlacePoint);


			final int RX10_TEMP175 = 0;


			final boolean RX10_TEMP176 = RX10_TEMP174 < RX10_TEMP175;

			if(RX10_TEMP176)
				{

				String RX10_TEMP177 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP177);

				}

			final int RX10_TEMP178 = Program.getPlaceFromDist1(RX10_TEMP172, RX10_TEMP174,myUniquePlacePoint);


			final int RX10_TEMP180 = 0;


			final boolean RX10_TEMP181 = RX10_TEMP178 != RX10_TEMP180;

			if(RX10_TEMP181)
				{

				String RX10_TEMP179 = "Bad place access for array X10_TEMP421";

				throw new RuntimeException(RX10_TEMP179);

				}

			final Particle RX10_TEMP182 = Program.getRefArrayValue1Particle(X10_TEMP421, RX10_TEMP174,myUniquePlacePoint);


			final Particle X10_TEMP423 = RX10_TEMP182;


			final double X10_TEMP427 = X10_TEMP423.xvelocity;


			final ParticleRefArray1 X10_TEMP424 = X10_TEMP0.one;


			final Dist1 RX10_TEMP183 = X10_TEMP424.distValue;


			final Region1 RX10_TEMP184 = RX10_TEMP183.dReg;


			final int RX10_TEMP185 = Program.searchPointInRegion1(RX10_TEMP184, i,myUniquePlacePoint);


			final int RX10_TEMP186 = 0;


			final boolean RX10_TEMP187 = RX10_TEMP185 < RX10_TEMP186;

			if(RX10_TEMP187)
				{

				String RX10_TEMP188 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP188);

				}

			final int RX10_TEMP189 = Program.getPlaceFromDist1(RX10_TEMP183, RX10_TEMP185,myUniquePlacePoint);


			final int RX10_TEMP191 = 0;


			final boolean RX10_TEMP192 = RX10_TEMP189 != RX10_TEMP191;

			if(RX10_TEMP192)
				{

				String RX10_TEMP190 = "Bad place access for array X10_TEMP424";

				throw new RuntimeException(RX10_TEMP190);

				}

			final Particle RX10_TEMP193 = Program.getRefArrayValue1Particle(X10_TEMP424, RX10_TEMP185,myUniquePlacePoint);


			final Particle X10_TEMP426 = RX10_TEMP193;


			final double X10_TEMP428 = X10_TEMP426.xvelocity;


			final double X10_TEMP430 = X10_TEMP427 * X10_TEMP428;


			final double X10_TEMP433 = X10_TEMP429 + X10_TEMP430;


			final double X10_TEMP434 = X10_TEMP433;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ekin = (X10_TEMP434);
			}

		final double X10_TEMP436 = 0.0;


		sp = X10_TEMP436;


		final int X10_TEMP441 = 0;


		final int X10_TEMP438 = X10_TEMP0.mdsize;


		final int X10_TEMP439 = 1;


		final int X10_TEMP442 = X10_TEMP438 - X10_TEMP439;


		final Region1 X10_TEMP444 = Program.createNewRegion1R(X10_TEMP441, X10_TEMP442,myUniquePlacePoint);


		final int RX10_TEMP197 = 1;


		int RX10_TEMP195 = X10_TEMP444.regSize;


		RX10_TEMP195 = RX10_TEMP195 - RX10_TEMP197;


		final int  RX10_TEMP196 = RX10_TEMP195+1;

		for(int RX10_TEMP194=0; RX10_TEMP194 < RX10_TEMP196; RX10_TEMP194++)
			{

			final int RX10_TEMP198 = RX10_TEMP194;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP444, RX10_TEMP198,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP445 = X10_TEMP0.one;


			final Dist1 RX10_TEMP199 = X10_TEMP445.distValue;


			final Region1 RX10_TEMP200 = RX10_TEMP199.dReg;


			final int RX10_TEMP201 = Program.searchPointInRegion1(RX10_TEMP200, i,myUniquePlacePoint);


			final int RX10_TEMP202 = 0;


			final boolean RX10_TEMP203 = RX10_TEMP201 < RX10_TEMP202;

			if(RX10_TEMP203)
				{

				String RX10_TEMP204 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP204);

				}

			final int RX10_TEMP205 = Program.getPlaceFromDist1(RX10_TEMP199, RX10_TEMP201,myUniquePlacePoint);


			final int RX10_TEMP207 = 0;


			final boolean RX10_TEMP208 = RX10_TEMP205 != RX10_TEMP207;

			if(RX10_TEMP208)
				{

				String RX10_TEMP206 = "Bad place access for array X10_TEMP445";

				throw new RuntimeException(RX10_TEMP206);

				}

			final Particle RX10_TEMP209 = Program.getRefArrayValue1Particle(X10_TEMP445, RX10_TEMP201,myUniquePlacePoint);


			final Particle X10_TEMP447 = RX10_TEMP209;


			final double X10_TEMP448 = X10_TEMP447.yvelocity;


			final double X10_TEMP450 = sp + X10_TEMP448;


			sp = X10_TEMP450;

			}

		final int X10_TEMP451 = X10_TEMP0.mdsize;


		final double X10_TEMP453 = sp / X10_TEMP451;


		sp = X10_TEMP453;


		final int X10_TEMP458 = 0;


		final int X10_TEMP455 = X10_TEMP0.mdsize;


		final int X10_TEMP456 = 1;


		final int X10_TEMP459 = X10_TEMP455 - X10_TEMP456;


		final Region1 X10_TEMP461 = Program.createNewRegion1R(X10_TEMP458, X10_TEMP459,myUniquePlacePoint);


		final int RX10_TEMP213 = 1;


		int RX10_TEMP211 = X10_TEMP461.regSize;


		RX10_TEMP211 = RX10_TEMP211 - RX10_TEMP213;


		final int  RX10_TEMP212 = RX10_TEMP211+1;

		for(int RX10_TEMP210=0; RX10_TEMP210 < RX10_TEMP212; RX10_TEMP210++)
			{

			final int RX10_TEMP214 = RX10_TEMP210;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP461, RX10_TEMP214,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP462 = X10_TEMP0.one;


			final Dist1 RX10_TEMP215 = X10_TEMP462.distValue;


			final Region1 RX10_TEMP216 = RX10_TEMP215.dReg;


			final int RX10_TEMP217 = Program.searchPointInRegion1(RX10_TEMP216, i,myUniquePlacePoint);


			final int RX10_TEMP218 = 0;


			final boolean RX10_TEMP219 = RX10_TEMP217 < RX10_TEMP218;

			if(RX10_TEMP219)
				{

				String RX10_TEMP220 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP220);

				}

			final int RX10_TEMP221 = Program.getPlaceFromDist1(RX10_TEMP215, RX10_TEMP217,myUniquePlacePoint);


			final int RX10_TEMP223 = 0;


			final boolean RX10_TEMP224 = RX10_TEMP221 != RX10_TEMP223;

			if(RX10_TEMP224)
				{

				String RX10_TEMP222 = "Bad place access for array X10_TEMP462";

				throw new RuntimeException(RX10_TEMP222);

				}

			final Particle RX10_TEMP225 = Program.getRefArrayValue1Particle(X10_TEMP462, RX10_TEMP217,myUniquePlacePoint);


			final Particle X10_TEMP464 = RX10_TEMP225;


			final ParticleRefArray1 X10_TEMP465 = X10_TEMP0.one;


			final Dist1 RX10_TEMP226 = X10_TEMP465.distValue;


			final Region1 RX10_TEMP227 = RX10_TEMP226.dReg;


			final int RX10_TEMP228 = Program.searchPointInRegion1(RX10_TEMP227, i,myUniquePlacePoint);


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

				String RX10_TEMP233 = "Bad place access for array X10_TEMP465";

				throw new RuntimeException(RX10_TEMP233);

				}

			final Particle RX10_TEMP236 = Program.getRefArrayValue1Particle(X10_TEMP465, RX10_TEMP228,myUniquePlacePoint);


			final Particle X10_TEMP467 = RX10_TEMP236;


			final double X10_TEMP468 = X10_TEMP467.yvelocity;


			final double X10_TEMP471 = X10_TEMP468 - sp;


			final double X10_TEMP472 = X10_TEMP471;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP464.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP464.yvelocity = (X10_TEMP472);

			final double X10_TEMP481 = X10_TEMP0.ekin;


			final ParticleRefArray1 X10_TEMP473 = X10_TEMP0.one;


			final Dist1 RX10_TEMP237 = X10_TEMP473.distValue;


			final Region1 RX10_TEMP238 = RX10_TEMP237.dReg;


			final int RX10_TEMP239 = Program.searchPointInRegion1(RX10_TEMP238, i,myUniquePlacePoint);


			final int RX10_TEMP240 = 0;


			final boolean RX10_TEMP241 = RX10_TEMP239 < RX10_TEMP240;

			if(RX10_TEMP241)
				{

				String RX10_TEMP242 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP242);

				}

			final int RX10_TEMP243 = Program.getPlaceFromDist1(RX10_TEMP237, RX10_TEMP239,myUniquePlacePoint);


			final int RX10_TEMP245 = 0;


			final boolean RX10_TEMP246 = RX10_TEMP243 != RX10_TEMP245;

			if(RX10_TEMP246)
				{

				String RX10_TEMP244 = "Bad place access for array X10_TEMP473";

				throw new RuntimeException(RX10_TEMP244);

				}

			final Particle RX10_TEMP247 = Program.getRefArrayValue1Particle(X10_TEMP473, RX10_TEMP239,myUniquePlacePoint);


			final Particle X10_TEMP475 = RX10_TEMP247;


			final double X10_TEMP479 = X10_TEMP475.yvelocity;


			final ParticleRefArray1 X10_TEMP476 = X10_TEMP0.one;


			final Dist1 RX10_TEMP248 = X10_TEMP476.distValue;


			final Region1 RX10_TEMP249 = RX10_TEMP248.dReg;


			final int RX10_TEMP250 = Program.searchPointInRegion1(RX10_TEMP249, i,myUniquePlacePoint);


			final int RX10_TEMP251 = 0;


			final boolean RX10_TEMP252 = RX10_TEMP250 < RX10_TEMP251;

			if(RX10_TEMP252)
				{

				String RX10_TEMP253 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP253);

				}

			final int RX10_TEMP254 = Program.getPlaceFromDist1(RX10_TEMP248, RX10_TEMP250,myUniquePlacePoint);


			final int RX10_TEMP256 = 0;


			final boolean RX10_TEMP257 = RX10_TEMP254 != RX10_TEMP256;

			if(RX10_TEMP257)
				{

				String RX10_TEMP255 = "Bad place access for array X10_TEMP476";

				throw new RuntimeException(RX10_TEMP255);

				}

			final Particle RX10_TEMP258 = Program.getRefArrayValue1Particle(X10_TEMP476, RX10_TEMP250,myUniquePlacePoint);


			final Particle X10_TEMP478 = RX10_TEMP258;


			final double X10_TEMP480 = X10_TEMP478.yvelocity;


			final double X10_TEMP482 = X10_TEMP479 * X10_TEMP480;


			final double X10_TEMP485 = X10_TEMP481 + X10_TEMP482;


			final double X10_TEMP486 = X10_TEMP485;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ekin = (X10_TEMP486);
			}

		final double X10_TEMP488 = 0.0;


		sp = X10_TEMP488;


		final int X10_TEMP493 = 0;


		final int X10_TEMP490 = X10_TEMP0.mdsize;


		final int X10_TEMP491 = 1;


		final int X10_TEMP494 = X10_TEMP490 - X10_TEMP491;


		final Region1 X10_TEMP496 = Program.createNewRegion1R(X10_TEMP493, X10_TEMP494,myUniquePlacePoint);


		final int RX10_TEMP262 = 1;


		int RX10_TEMP260 = X10_TEMP496.regSize;


		RX10_TEMP260 = RX10_TEMP260 - RX10_TEMP262;


		final int  RX10_TEMP261 = RX10_TEMP260+1;

		for(int RX10_TEMP259=0; RX10_TEMP259 < RX10_TEMP261; RX10_TEMP259++)
			{

			final int RX10_TEMP263 = RX10_TEMP259;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP496, RX10_TEMP263,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP497 = X10_TEMP0.one;


			final Dist1 RX10_TEMP264 = X10_TEMP497.distValue;


			final Region1 RX10_TEMP265 = RX10_TEMP264.dReg;


			final int RX10_TEMP266 = Program.searchPointInRegion1(RX10_TEMP265, i,myUniquePlacePoint);


			final int RX10_TEMP267 = 0;


			final boolean RX10_TEMP268 = RX10_TEMP266 < RX10_TEMP267;

			if(RX10_TEMP268)
				{

				String RX10_TEMP269 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP269);

				}

			final int RX10_TEMP270 = Program.getPlaceFromDist1(RX10_TEMP264, RX10_TEMP266,myUniquePlacePoint);


			final int RX10_TEMP272 = 0;


			final boolean RX10_TEMP273 = RX10_TEMP270 != RX10_TEMP272;

			if(RX10_TEMP273)
				{

				String RX10_TEMP271 = "Bad place access for array X10_TEMP497";

				throw new RuntimeException(RX10_TEMP271);

				}

			final Particle RX10_TEMP274 = Program.getRefArrayValue1Particle(X10_TEMP497, RX10_TEMP266,myUniquePlacePoint);


			final Particle X10_TEMP499 = RX10_TEMP274;


			final double X10_TEMP500 = X10_TEMP499.zvelocity;


			final double X10_TEMP502 = sp + X10_TEMP500;


			sp = X10_TEMP502;

			}

		final int X10_TEMP503 = X10_TEMP0.mdsize;


		final double X10_TEMP505 = sp / X10_TEMP503;


		sp = X10_TEMP505;


		final int X10_TEMP510 = 0;


		final int X10_TEMP507 = X10_TEMP0.mdsize;


		final int X10_TEMP508 = 1;


		final int X10_TEMP511 = X10_TEMP507 - X10_TEMP508;


		final Region1 X10_TEMP513 = Program.createNewRegion1R(X10_TEMP510, X10_TEMP511,myUniquePlacePoint);


		final int RX10_TEMP278 = 1;


		int RX10_TEMP276 = X10_TEMP513.regSize;


		RX10_TEMP276 = RX10_TEMP276 - RX10_TEMP278;


		final int  RX10_TEMP277 = RX10_TEMP276+1;

		for(int RX10_TEMP275=0; RX10_TEMP275 < RX10_TEMP277; RX10_TEMP275++)
			{

			final int RX10_TEMP279 = RX10_TEMP275;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP513, RX10_TEMP279,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP514 = X10_TEMP0.one;


			final Dist1 RX10_TEMP280 = X10_TEMP514.distValue;


			final Region1 RX10_TEMP281 = RX10_TEMP280.dReg;


			final int RX10_TEMP282 = Program.searchPointInRegion1(RX10_TEMP281, i,myUniquePlacePoint);


			final int RX10_TEMP283 = 0;


			final boolean RX10_TEMP284 = RX10_TEMP282 < RX10_TEMP283;

			if(RX10_TEMP284)
				{

				String RX10_TEMP285 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP285);

				}

			final int RX10_TEMP286 = Program.getPlaceFromDist1(RX10_TEMP280, RX10_TEMP282,myUniquePlacePoint);


			final int RX10_TEMP288 = 0;


			final boolean RX10_TEMP289 = RX10_TEMP286 != RX10_TEMP288;

			if(RX10_TEMP289)
				{

				String RX10_TEMP287 = "Bad place access for array X10_TEMP514";

				throw new RuntimeException(RX10_TEMP287);

				}

			final Particle RX10_TEMP290 = Program.getRefArrayValue1Particle(X10_TEMP514, RX10_TEMP282,myUniquePlacePoint);


			final Particle X10_TEMP516 = RX10_TEMP290;


			final ParticleRefArray1 X10_TEMP517 = X10_TEMP0.one;


			final Dist1 RX10_TEMP291 = X10_TEMP517.distValue;


			final Region1 RX10_TEMP292 = RX10_TEMP291.dReg;


			final int RX10_TEMP293 = Program.searchPointInRegion1(RX10_TEMP292, i,myUniquePlacePoint);


			final int RX10_TEMP294 = 0;


			final boolean RX10_TEMP295 = RX10_TEMP293 < RX10_TEMP294;

			if(RX10_TEMP295)
				{

				String RX10_TEMP296 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP296);

				}

			final int RX10_TEMP297 = Program.getPlaceFromDist1(RX10_TEMP291, RX10_TEMP293,myUniquePlacePoint);


			final int RX10_TEMP299 = 0;


			final boolean RX10_TEMP300 = RX10_TEMP297 != RX10_TEMP299;

			if(RX10_TEMP300)
				{

				String RX10_TEMP298 = "Bad place access for array X10_TEMP517";

				throw new RuntimeException(RX10_TEMP298);

				}

			final Particle RX10_TEMP301 = Program.getRefArrayValue1Particle(X10_TEMP517, RX10_TEMP293,myUniquePlacePoint);


			final Particle X10_TEMP519 = RX10_TEMP301;


			final double X10_TEMP520 = X10_TEMP519.zvelocity;


			final double X10_TEMP523 = X10_TEMP520 - sp;


			final double X10_TEMP524 = X10_TEMP523;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP516.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP516.zvelocity = (X10_TEMP524);

			final double X10_TEMP533 = X10_TEMP0.ekin;


			final ParticleRefArray1 X10_TEMP525 = X10_TEMP0.one;


			final Dist1 RX10_TEMP302 = X10_TEMP525.distValue;


			final Region1 RX10_TEMP303 = RX10_TEMP302.dReg;


			final int RX10_TEMP304 = Program.searchPointInRegion1(RX10_TEMP303, i,myUniquePlacePoint);


			final int RX10_TEMP305 = 0;


			final boolean RX10_TEMP306 = RX10_TEMP304 < RX10_TEMP305;

			if(RX10_TEMP306)
				{

				String RX10_TEMP307 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP307);

				}

			final int RX10_TEMP308 = Program.getPlaceFromDist1(RX10_TEMP302, RX10_TEMP304,myUniquePlacePoint);


			final int RX10_TEMP310 = 0;


			final boolean RX10_TEMP311 = RX10_TEMP308 != RX10_TEMP310;

			if(RX10_TEMP311)
				{

				String RX10_TEMP309 = "Bad place access for array X10_TEMP525";

				throw new RuntimeException(RX10_TEMP309);

				}

			final Particle RX10_TEMP312 = Program.getRefArrayValue1Particle(X10_TEMP525, RX10_TEMP304,myUniquePlacePoint);


			final Particle X10_TEMP527 = RX10_TEMP312;


			final double X10_TEMP531 = X10_TEMP527.zvelocity;


			final ParticleRefArray1 X10_TEMP528 = X10_TEMP0.one;


			final Dist1 RX10_TEMP313 = X10_TEMP528.distValue;


			final Region1 RX10_TEMP314 = RX10_TEMP313.dReg;


			final int RX10_TEMP315 = Program.searchPointInRegion1(RX10_TEMP314, i,myUniquePlacePoint);


			final int RX10_TEMP316 = 0;


			final boolean RX10_TEMP317 = RX10_TEMP315 < RX10_TEMP316;

			if(RX10_TEMP317)
				{

				String RX10_TEMP318 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP318);

				}

			final int RX10_TEMP319 = Program.getPlaceFromDist1(RX10_TEMP313, RX10_TEMP315,myUniquePlacePoint);


			final int RX10_TEMP321 = 0;


			final boolean RX10_TEMP322 = RX10_TEMP319 != RX10_TEMP321;

			if(RX10_TEMP322)
				{

				String RX10_TEMP320 = "Bad place access for array X10_TEMP528";

				throw new RuntimeException(RX10_TEMP320);

				}

			final Particle RX10_TEMP323 = Program.getRefArrayValue1Particle(X10_TEMP528, RX10_TEMP315,myUniquePlacePoint);


			final Particle X10_TEMP530 = RX10_TEMP323;


			final double X10_TEMP532 = X10_TEMP530.zvelocity;


			final double X10_TEMP534 = X10_TEMP531 * X10_TEMP532;


			final double X10_TEMP537 = X10_TEMP533 + X10_TEMP534;


			final double X10_TEMP538 = X10_TEMP537;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ekin = (X10_TEMP538);
			}

		final double X10_TEMP539 = X10_TEMP0.tscale;


		final double X10_TEMP540 = X10_TEMP0.ekin;


		double ts = X10_TEMP539 * X10_TEMP540;


		final double X10_TEMP543 = _md_tref / ts;


		final double X10_TEMP544 = Math.sqrt(X10_TEMP543);


		final double X10_TEMP547 = _md_h * X10_TEMP544;


		final double X10_TEMP548 = X10_TEMP547;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.sc = (X10_TEMP548);

		final int X10_TEMP553 = 0;


		final int X10_TEMP550 = X10_TEMP0.mdsize;


		final int X10_TEMP551 = 1;


		final int X10_TEMP554 = X10_TEMP550 - X10_TEMP551;


		final Region1 X10_TEMP556 = Program.createNewRegion1R(X10_TEMP553, X10_TEMP554,myUniquePlacePoint);


		final int RX10_TEMP327 = 1;


		int RX10_TEMP325 = X10_TEMP556.regSize;


		RX10_TEMP325 = RX10_TEMP325 - RX10_TEMP327;


		final int  RX10_TEMP326 = RX10_TEMP325+1;

		for(int RX10_TEMP324=0; RX10_TEMP324 < RX10_TEMP326; RX10_TEMP324++)
			{

			final int RX10_TEMP328 = RX10_TEMP324;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP556, RX10_TEMP328,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP557 = X10_TEMP0.one;


			final Dist1 RX10_TEMP329 = X10_TEMP557.distValue;


			final Region1 RX10_TEMP330 = RX10_TEMP329.dReg;


			final int RX10_TEMP331 = Program.searchPointInRegion1(RX10_TEMP330, i,myUniquePlacePoint);


			final int RX10_TEMP332 = 0;


			final boolean RX10_TEMP333 = RX10_TEMP331 < RX10_TEMP332;

			if(RX10_TEMP333)
				{

				String RX10_TEMP334 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP334);

				}

			final int RX10_TEMP335 = Program.getPlaceFromDist1(RX10_TEMP329, RX10_TEMP331,myUniquePlacePoint);


			final int RX10_TEMP337 = 0;


			final boolean RX10_TEMP338 = RX10_TEMP335 != RX10_TEMP337;

			if(RX10_TEMP338)
				{

				String RX10_TEMP336 = "Bad place access for array X10_TEMP557";

				throw new RuntimeException(RX10_TEMP336);

				}

			final Particle RX10_TEMP339 = Program.getRefArrayValue1Particle(X10_TEMP557, RX10_TEMP331,myUniquePlacePoint);


			final Particle X10_TEMP559 = RX10_TEMP339;


			final ParticleRefArray1 X10_TEMP560 = X10_TEMP0.one;


			final Dist1 RX10_TEMP340 = X10_TEMP560.distValue;


			final Region1 RX10_TEMP341 = RX10_TEMP340.dReg;


			final int RX10_TEMP342 = Program.searchPointInRegion1(RX10_TEMP341, i,myUniquePlacePoint);


			final int RX10_TEMP343 = 0;


			final boolean RX10_TEMP344 = RX10_TEMP342 < RX10_TEMP343;

			if(RX10_TEMP344)
				{

				String RX10_TEMP345 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP345);

				}

			final int RX10_TEMP346 = Program.getPlaceFromDist1(RX10_TEMP340, RX10_TEMP342,myUniquePlacePoint);


			final int RX10_TEMP348 = 0;


			final boolean RX10_TEMP349 = RX10_TEMP346 != RX10_TEMP348;

			if(RX10_TEMP349)
				{

				String RX10_TEMP347 = "Bad place access for array X10_TEMP560";

				throw new RuntimeException(RX10_TEMP347);

				}

			final Particle RX10_TEMP350 = Program.getRefArrayValue1Particle(X10_TEMP560, RX10_TEMP342,myUniquePlacePoint);


			final Particle X10_TEMP562 = RX10_TEMP350;


			final double X10_TEMP563 = X10_TEMP562.xvelocity;


			final double X10_TEMP564 = X10_TEMP0.sc;


			final double X10_TEMP567 = X10_TEMP563 * X10_TEMP564;


			final double X10_TEMP568 = X10_TEMP567;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP559.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP559.xvelocity = (X10_TEMP568);

			final ParticleRefArray1 X10_TEMP569 = X10_TEMP0.one;


			final Dist1 RX10_TEMP351 = X10_TEMP569.distValue;


			final Region1 RX10_TEMP352 = RX10_TEMP351.dReg;


			final int RX10_TEMP353 = Program.searchPointInRegion1(RX10_TEMP352, i,myUniquePlacePoint);


			final int RX10_TEMP354 = 0;


			final boolean RX10_TEMP355 = RX10_TEMP353 < RX10_TEMP354;

			if(RX10_TEMP355)
				{

				String RX10_TEMP356 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP356);

				}

			final int RX10_TEMP357 = Program.getPlaceFromDist1(RX10_TEMP351, RX10_TEMP353,myUniquePlacePoint);


			final int RX10_TEMP359 = 0;


			final boolean RX10_TEMP360 = RX10_TEMP357 != RX10_TEMP359;

			if(RX10_TEMP360)
				{

				String RX10_TEMP358 = "Bad place access for array X10_TEMP569";

				throw new RuntimeException(RX10_TEMP358);

				}

			final Particle RX10_TEMP361 = Program.getRefArrayValue1Particle(X10_TEMP569, RX10_TEMP353,myUniquePlacePoint);


			final Particle X10_TEMP571 = RX10_TEMP361;


			final ParticleRefArray1 X10_TEMP572 = X10_TEMP0.one;


			final Dist1 RX10_TEMP362 = X10_TEMP572.distValue;


			final Region1 RX10_TEMP363 = RX10_TEMP362.dReg;


			final int RX10_TEMP364 = Program.searchPointInRegion1(RX10_TEMP363, i,myUniquePlacePoint);


			final int RX10_TEMP365 = 0;


			final boolean RX10_TEMP366 = RX10_TEMP364 < RX10_TEMP365;

			if(RX10_TEMP366)
				{

				String RX10_TEMP367 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP367);

				}

			final int RX10_TEMP368 = Program.getPlaceFromDist1(RX10_TEMP362, RX10_TEMP364,myUniquePlacePoint);


			final int RX10_TEMP370 = 0;


			final boolean RX10_TEMP371 = RX10_TEMP368 != RX10_TEMP370;

			if(RX10_TEMP371)
				{

				String RX10_TEMP369 = "Bad place access for array X10_TEMP572";

				throw new RuntimeException(RX10_TEMP369);

				}

			final Particle RX10_TEMP372 = Program.getRefArrayValue1Particle(X10_TEMP572, RX10_TEMP364,myUniquePlacePoint);


			final Particle X10_TEMP574 = RX10_TEMP372;


			final double X10_TEMP575 = X10_TEMP574.yvelocity;


			final double X10_TEMP576 = X10_TEMP0.sc;


			final double X10_TEMP579 = X10_TEMP575 * X10_TEMP576;


			final double X10_TEMP580 = X10_TEMP579;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP571.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP571.yvelocity = (X10_TEMP580);

			final ParticleRefArray1 X10_TEMP581 = X10_TEMP0.one;


			final Dist1 RX10_TEMP373 = X10_TEMP581.distValue;


			final Region1 RX10_TEMP374 = RX10_TEMP373.dReg;


			final int RX10_TEMP375 = Program.searchPointInRegion1(RX10_TEMP374, i,myUniquePlacePoint);


			final int RX10_TEMP376 = 0;


			final boolean RX10_TEMP377 = RX10_TEMP375 < RX10_TEMP376;

			if(RX10_TEMP377)
				{

				String RX10_TEMP378 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP378);

				}

			final int RX10_TEMP379 = Program.getPlaceFromDist1(RX10_TEMP373, RX10_TEMP375,myUniquePlacePoint);


			final int RX10_TEMP381 = 0;


			final boolean RX10_TEMP382 = RX10_TEMP379 != RX10_TEMP381;

			if(RX10_TEMP382)
				{

				String RX10_TEMP380 = "Bad place access for array X10_TEMP581";

				throw new RuntimeException(RX10_TEMP380);

				}

			final Particle RX10_TEMP383 = Program.getRefArrayValue1Particle(X10_TEMP581, RX10_TEMP375,myUniquePlacePoint);


			final Particle X10_TEMP583 = RX10_TEMP383;


			final ParticleRefArray1 X10_TEMP584 = X10_TEMP0.one;


			final Dist1 RX10_TEMP384 = X10_TEMP584.distValue;


			final Region1 RX10_TEMP385 = RX10_TEMP384.dReg;


			final int RX10_TEMP386 = Program.searchPointInRegion1(RX10_TEMP385, i,myUniquePlacePoint);


			final int RX10_TEMP387 = 0;


			final boolean RX10_TEMP388 = RX10_TEMP386 < RX10_TEMP387;

			if(RX10_TEMP388)
				{

				String RX10_TEMP389 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP389);

				}

			final int RX10_TEMP390 = Program.getPlaceFromDist1(RX10_TEMP384, RX10_TEMP386,myUniquePlacePoint);


			final int RX10_TEMP392 = 0;


			final boolean RX10_TEMP393 = RX10_TEMP390 != RX10_TEMP392;

			if(RX10_TEMP393)
				{

				String RX10_TEMP391 = "Bad place access for array X10_TEMP584";

				throw new RuntimeException(RX10_TEMP391);

				}

			final Particle RX10_TEMP394 = Program.getRefArrayValue1Particle(X10_TEMP584, RX10_TEMP386,myUniquePlacePoint);


			final Particle X10_TEMP586 = RX10_TEMP394;


			final double X10_TEMP587 = X10_TEMP586.zvelocity;


			final double X10_TEMP588 = X10_TEMP0.sc;


			final double X10_TEMP591 = X10_TEMP587 * X10_TEMP588;


			final double X10_TEMP592 = X10_TEMP591;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP583.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP583.zvelocity = (X10_TEMP592);
			}
		}
public static void md_runiters1 ( final md X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP5 = 0;


		final int X10_TEMP2 = X10_TEMP0.mdsize;


		final int X10_TEMP3 = 1;


		final int X10_TEMP6 = X10_TEMP2 - X10_TEMP3;


		final Region1 X10_TEMP8 = Program.createNewRegion1R(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final int RX10_TEMP3 = 1;


		int RX10_TEMP1 = X10_TEMP8.regSize;


		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


		final int  RX10_TEMP2 = RX10_TEMP1+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
			{

			final int RX10_TEMP4 = RX10_TEMP0;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP8, RX10_TEMP4,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP9 = X10_TEMP0.one;


			final Dist1 RX10_TEMP5 = X10_TEMP9.distValue;


			final Region1 RX10_TEMP6 = RX10_TEMP5.dReg;


			final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, i,myUniquePlacePoint);


			final int RX10_TEMP8 = 0;


			final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

			if(RX10_TEMP9)
				{

				String RX10_TEMP10 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP10);

				}

			final int RX10_TEMP11 = Program.getPlaceFromDist1(RX10_TEMP5, RX10_TEMP7,myUniquePlacePoint);


			final int RX10_TEMP13 = 0;


			final boolean RX10_TEMP14 = RX10_TEMP11 != RX10_TEMP13;

			if(RX10_TEMP14)
				{

				String RX10_TEMP12 = "Bad place access for array X10_TEMP9";

				throw new RuntimeException(RX10_TEMP12);

				}

			final Particle RX10_TEMP15 = Program.getRefArrayValue1Particle(X10_TEMP9, RX10_TEMP7,myUniquePlacePoint);


			final Particle X10_TEMP11 = RX10_TEMP15;


			final double X10_TEMP13 = X10_TEMP0.side;

			Program.Particle_domove(X10_TEMP11, X10_TEMP13,myUniquePlacePoint);
			}

		final double X10_TEMP16 = 0.0;


		final double X10_TEMP17 = X10_TEMP16;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.epot = (X10_TEMP17);

		final double X10_TEMP20 = 0.0;


		final double X10_TEMP21 = X10_TEMP20;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.vir = (X10_TEMP21);

		final int X10_TEMP22 = 0;


		final int X10_TEMP23 = X10_TEMP0.rnk;


		int i = X10_TEMP22 + X10_TEMP23;


		final int X10_TEMP25 = X10_TEMP0.mdsize;


		boolean X10_TEMP29 = i < X10_TEMP25;

		while(X10_TEMP29)
			{

			final ParticleRefArray1 X10_TEMP30 = X10_TEMP0.one;


			final Point1 RX10_TEMP16 = new Point1(i,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP16.hashCode());


			final Dist1 RX10_TEMP17 = X10_TEMP30.distValue;


			final Region1 RX10_TEMP18 = RX10_TEMP17.dReg;


			final int RX10_TEMP19 = Program.searchPointInRegion1(RX10_TEMP18, RX10_TEMP16,myUniquePlacePoint);


			final int RX10_TEMP20 = 0;


			final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;

			if(RX10_TEMP21)
				{

				String RX10_TEMP22 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP22);

				}

			final int RX10_TEMP23 = Program.getPlaceFromDist1(RX10_TEMP17, RX10_TEMP19,myUniquePlacePoint);


			final int RX10_TEMP25 = 0;


			final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;

			if(RX10_TEMP26)
				{

				String RX10_TEMP24 = "Bad place access for array X10_TEMP30";

				throw new RuntimeException(RX10_TEMP24);

				}

			final Particle RX10_TEMP27 = Program.getRefArrayValue1Particle(X10_TEMP30, RX10_TEMP19,myUniquePlacePoint);


			final Particle X10_TEMP32 = RX10_TEMP27;


			final double X10_TEMP38 = X10_TEMP0.side;


			final double X10_TEMP39 = X10_TEMP0.rcoff;


			final int X10_TEMP40 = X10_TEMP0.mdsize;

			Program.Particle_force(X10_TEMP32, X10_TEMP38, X10_TEMP39, X10_TEMP40, i, X10_TEMP0,myUniquePlacePoint);

			final int X10_TEMP41 = X10_TEMP0.nprocess;


			final int X10_TEMP43 = i + X10_TEMP41;


			i = X10_TEMP43;


			final int X10_TEMP27 = X10_TEMP0.mdsize;


			X10_TEMP29 = i < X10_TEMP27;

			}
		}
public static void md_runiters2 ( final md X10_TEMP0, final mdRefArray1 P, int myUniquePlacePoint)
		{
		Program.md_allreduce(X10_TEMP0, P,myUniquePlacePoint);
		}
public static void md_runiters3 ( final md X10_TEMP0, final int move, int myUniquePlacePoint)
		{

		double summation = 0.0;


		final int X10_TEMP6 = 0;


		final int X10_TEMP3 = X10_TEMP0.mdsize;


		final int X10_TEMP4 = 1;


		final int X10_TEMP7 = X10_TEMP3 - X10_TEMP4;


		final Region1 X10_TEMP9 = Program.createNewRegion1R(X10_TEMP6, X10_TEMP7,myUniquePlacePoint);


		final int RX10_TEMP3 = 1;


		int RX10_TEMP1 = X10_TEMP9.regSize;


		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


		final int  RX10_TEMP2 = RX10_TEMP1+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
			{

			final int RX10_TEMP4 = RX10_TEMP0;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP9, RX10_TEMP4,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP10 = X10_TEMP0.one;


			final Dist1 RX10_TEMP5 = X10_TEMP10.distValue;


			final Region1 RX10_TEMP6 = RX10_TEMP5.dReg;


			final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, i,myUniquePlacePoint);


			final int RX10_TEMP8 = 0;


			final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

			if(RX10_TEMP9)
				{

				String RX10_TEMP10 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP10);

				}

			final int RX10_TEMP11 = Program.getPlaceFromDist1(RX10_TEMP5, RX10_TEMP7,myUniquePlacePoint);


			final int RX10_TEMP13 = 0;


			final boolean RX10_TEMP14 = RX10_TEMP11 != RX10_TEMP13;

			if(RX10_TEMP14)
				{

				String RX10_TEMP12 = "Bad place access for array X10_TEMP10";

				throw new RuntimeException(RX10_TEMP12);

				}

			final Particle RX10_TEMP15 = Program.getRefArrayValue1Particle(X10_TEMP10, RX10_TEMP7,myUniquePlacePoint);


			final Particle X10_TEMP12 = RX10_TEMP15;


			final double X10_TEMP14 = X10_TEMP0.hsq2;


			final double X10_TEMP15 = Program.Particle_mkekin(X10_TEMP12, X10_TEMP14,myUniquePlacePoint);


			final double X10_TEMP17 = summation + X10_TEMP15;


			summation = X10_TEMP17;

			}

		final double X10_TEMP18 = X10_TEMP0.hsq;


		final double X10_TEMP21 = summation / X10_TEMP18;


		final double X10_TEMP22 = X10_TEMP21;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.ekin = (X10_TEMP22);

		double vel = 0.0;


		final double X10_TEMP26 = 0.0;


		final double X10_TEMP27 = X10_TEMP26;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.count = (X10_TEMP27);

		final int X10_TEMP32 = 0;


		final int X10_TEMP29 = X10_TEMP0.mdsize;


		final int X10_TEMP30 = 1;


		final int X10_TEMP33 = X10_TEMP29 - X10_TEMP30;


		final Region1 X10_TEMP35 = Program.createNewRegion1R(X10_TEMP32, X10_TEMP33,myUniquePlacePoint);


		final int RX10_TEMP19 = 1;


		int RX10_TEMP17 = X10_TEMP35.regSize;


		RX10_TEMP17 = RX10_TEMP17 - RX10_TEMP19;


		final int  RX10_TEMP18 = RX10_TEMP17+1;

		for(int RX10_TEMP16=0; RX10_TEMP16 < RX10_TEMP18; RX10_TEMP16++)
			{

			final int RX10_TEMP20 = RX10_TEMP16;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP35, RX10_TEMP20,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP36 = X10_TEMP0.one;


			final Dist1 RX10_TEMP21 = X10_TEMP36.distValue;


			final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


			final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, i,myUniquePlacePoint);


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

				String RX10_TEMP28 = "Bad place access for array X10_TEMP36";

				throw new RuntimeException(RX10_TEMP28);

				}

			final Particle RX10_TEMP31 = Program.getRefArrayValue1Particle(X10_TEMP36, RX10_TEMP23,myUniquePlacePoint);


			final Particle X10_TEMP38 = RX10_TEMP31;


			final double X10_TEMP42 = X10_TEMP0.vaverh;


			final double X10_TEMP43 = Program.Particle_velavg(X10_TEMP38, X10_TEMP42, _md_h, X10_TEMP0,myUniquePlacePoint);


			final double X10_TEMP45 = vel + X10_TEMP43;


			vel = X10_TEMP45;

			}

		final double X10_TEMP47 = vel / _md_h;


		vel = X10_TEMP47;


		final boolean X10_TEMP49 = move < _md_istop;


		final int X10_TEMP50 = 1;


		final int X10_TEMP52 = move + X10_TEMP50;


		final int X10_TEMP54 = X10_TEMP52 % _md_irep;


		final int X10_TEMP55 = 0;


		final boolean X10_TEMP57 = X10_TEMP54 == X10_TEMP55;


		final boolean X10_TEMP59 = X10_TEMP49 && X10_TEMP57;

		if(X10_TEMP59)
			{

			final double X10_TEMP60 = X10_TEMP0.tscale;


			final double X10_TEMP61 = X10_TEMP0.ekin;


			final double X10_TEMP63 = X10_TEMP60 * X10_TEMP61;


			final double X10_TEMP65 = _md_tref / X10_TEMP63;


			final double X10_TEMP68 = Math.sqrt(X10_TEMP65);


			final double X10_TEMP69 = X10_TEMP68;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.sc = (X10_TEMP69);

			final int X10_TEMP74 = 0;


			final int X10_TEMP71 = X10_TEMP0.mdsize;


			final int X10_TEMP72 = 1;


			final int X10_TEMP75 = X10_TEMP71 - X10_TEMP72;


			final Region1 X10_TEMP77 = Program.createNewRegion1R(X10_TEMP74, X10_TEMP75,myUniquePlacePoint);


			final int RX10_TEMP35 = 1;


			int RX10_TEMP33 = X10_TEMP77.regSize;


			RX10_TEMP33 = RX10_TEMP33 - RX10_TEMP35;


			final int  RX10_TEMP34 = RX10_TEMP33+1;

			for(int RX10_TEMP32=0; RX10_TEMP32 < RX10_TEMP34; RX10_TEMP32++)
				{

				final int RX10_TEMP36 = RX10_TEMP32;


				final Point1 i = Program.regionOrdinalPoint1(X10_TEMP77, RX10_TEMP36,myUniquePlacePoint);


				final ParticleRefArray1 X10_TEMP78 = X10_TEMP0.one;


				final Dist1 RX10_TEMP37 = X10_TEMP78.distValue;


				final Region1 RX10_TEMP38 = RX10_TEMP37.dReg;


				final int RX10_TEMP39 = Program.searchPointInRegion1(RX10_TEMP38, i,myUniquePlacePoint);


				final int RX10_TEMP40 = 0;


				final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40;

				if(RX10_TEMP41)
					{

					String RX10_TEMP42 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP42);

					}

				final int RX10_TEMP43 = Program.getPlaceFromDist1(RX10_TEMP37, RX10_TEMP39,myUniquePlacePoint);


				final int RX10_TEMP45 = 0;


				final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;

				if(RX10_TEMP46)
					{

					String RX10_TEMP44 = "Bad place access for array X10_TEMP78";

					throw new RuntimeException(RX10_TEMP44);

					}

				final Particle RX10_TEMP47 = Program.getRefArrayValue1Particle(X10_TEMP78, RX10_TEMP39,myUniquePlacePoint);


				final Particle X10_TEMP80 = RX10_TEMP47;


				final double X10_TEMP83 = X10_TEMP0.sc;


				final int X10_TEMP84 = 1;

				Program.Particle_dscal(X10_TEMP80, X10_TEMP83, X10_TEMP84,myUniquePlacePoint);
				}

			final double X10_TEMP85 = X10_TEMP0.tscale;


			final double X10_TEMP88 = _md_tref / X10_TEMP85;


			final double X10_TEMP89 = X10_TEMP88;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ekin = (X10_TEMP89);
			}

		final int X10_TEMP90 = 1;


		final int X10_TEMP92 = move + X10_TEMP90;


		final int X10_TEMP94 = X10_TEMP92 % _md_iprint;


		final int X10_TEMP95 = 0;


		final boolean X10_TEMP97 = X10_TEMP94 == X10_TEMP95;

		if(X10_TEMP97)
			{

			final double X10_TEMP98 = 24.0;


			final double X10_TEMP99 = X10_TEMP0.ekin;


			final double X10_TEMP102 = X10_TEMP98 * X10_TEMP99;


			final double X10_TEMP103 = X10_TEMP102;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ek = (X10_TEMP103);

			final double X10_TEMP104 = 4.0;


			final double X10_TEMP105 = X10_TEMP0.epot;


			final double X10_TEMP108 = X10_TEMP104 * X10_TEMP105;


			final double X10_TEMP109 = X10_TEMP108;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.epot = (X10_TEMP109);

			final double X10_TEMP110 = X10_TEMP0.ek;


			final double X10_TEMP111 = X10_TEMP0.epot;


			final double X10_TEMP114 = X10_TEMP110 + X10_TEMP111;


			final double X10_TEMP115 = X10_TEMP114;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.etot = (X10_TEMP115);

			final double X10_TEMP116 = X10_TEMP0.tscale;


			final double X10_TEMP117 = X10_TEMP0.ekin;


			final double X10_TEMP120 = X10_TEMP116 * X10_TEMP117;


			final double X10_TEMP121 = X10_TEMP120;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.temp = (X10_TEMP121);

			final double X10_TEMP122 = 16.0;


			final double X10_TEMP127 = _md_den * X10_TEMP122;


			final double X10_TEMP123 = X10_TEMP0.ekin;


			final double X10_TEMP124 = X10_TEMP0.vir;


			final double X10_TEMP126 = X10_TEMP123 - X10_TEMP124;


			final double X10_TEMP128 = X10_TEMP127 * X10_TEMP126;


			final int X10_TEMP129 = X10_TEMP0.mdsize;


			final double X10_TEMP132 = X10_TEMP128 / X10_TEMP129;


			final double X10_TEMP133 = X10_TEMP132;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.pres = (X10_TEMP133);

			final int X10_TEMP134 = X10_TEMP0.mdsize;


			final double X10_TEMP136 = vel / X10_TEMP134;


			vel = X10_TEMP136;


			final double X10_TEMP137 = X10_TEMP0.count;


			final int X10_TEMP138 = X10_TEMP0.mdsize;


			final double X10_TEMP140 = X10_TEMP137 / X10_TEMP138;


			final double X10_TEMP141 = 100.0;


			final double X10_TEMP144 = X10_TEMP140 * X10_TEMP141;


			final double X10_TEMP145 = X10_TEMP144;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.rp = (X10_TEMP145);
			}
		}
public static void md_allreduce ( final md X10_TEMP0, final mdRefArray1 P, int myUniquePlacePoint)
		{

		final int X10_TEMP1 = X10_TEMP0.rnk;


		final int X10_TEMP2 = 0;


		final boolean X10_TEMP4 = X10_TEMP1 != X10_TEMP2;

		if(X10_TEMP4)
			{
			return;
			}

		final md t = new md();
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(t.hashCode());


		final int X10_TEMP8 = X10_TEMP0.mdsize;


		final int X10_TEMP9 = X10_TEMP8;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(t.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		t.mdsize = (X10_TEMP9);

		final int X10_TEMP14 = 0;


		final int X10_TEMP11 = X10_TEMP0.mdsize;


		final int X10_TEMP12 = 1;


		final int X10_TEMP15 = X10_TEMP11 - X10_TEMP12;


		final Region1 X10_TEMP16 = Program.createNewRegion1R(X10_TEMP14, X10_TEMP15,myUniquePlacePoint);


		final int X10_TEMP17 = 0;


		final Dist1 dOne = Program.getPlaceDist1(X10_TEMP16, X10_TEMP17,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dOne.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final ParticleStub[] RX10_TEMP6 = new ParticleStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dOne, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Particle[] RX10_TEMP14 = new Particle[RX10_TEMP13];


					final ParticleStub RX10_TEMP15 = new ParticleStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final ParticleStub[] RX10_TEMP16 = (ParticleStub[])(new ParticleStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final ParticleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final ParticleRefArray1 RX10_TEMP19 = new ParticleRefArray1(dOne, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final ParticleRefArray1 X10_TEMP21 = RX10_TEMP19;


		final ParticleRefArray1 X10_TEMP22 = X10_TEMP21;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(t.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		t.one = (X10_TEMP22);

		final int tHere = 0;


		final int X10_TEMP30 = 0;


		final int X10_TEMP25 = X10_TEMP0.mdsize;


		final int X10_TEMP26 = 1;


		final int X10_TEMP28 = X10_TEMP25 - X10_TEMP26;


		final Region1 X10_TEMP32 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP28,myUniquePlacePoint);


		final int RX10_TEMP23 = 1;


		int RX10_TEMP21 = X10_TEMP32.regSize;


		RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23;


		final int  RX10_TEMP22 = RX10_TEMP21+1;

		for(int RX10_TEMP20=0; RX10_TEMP20 < RX10_TEMP22; RX10_TEMP20++)
			{

			final int RX10_TEMP24 = RX10_TEMP20;


			final Point1 k = Program.regionOrdinalPoint1(X10_TEMP32, RX10_TEMP24,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP33 = t.one;


			double X10_TEMP44 = 0.0;


			double X10_TEMP45 = 0.0;


			double X10_TEMP46 = 0.0;


			double X10_TEMP47 = 0.0;


			double X10_TEMP48 = 0.0;


			double X10_TEMP49 = 0.0;


			double X10_TEMP50 = 0.0;


			double X10_TEMP51 = 0.0;


			double X10_TEMP52 = 0.0;


			final Particle X10_TEMP55 = new Particle(X10_TEMP44, X10_TEMP45, X10_TEMP46, X10_TEMP47, X10_TEMP48, X10_TEMP49, X10_TEMP50, X10_TEMP51, X10_TEMP52,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP55.hashCode());


			final Particle X10_TEMP56 = X10_TEMP55;


			final Dist1 RX10_TEMP25 = X10_TEMP33.distValue;


			final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;


			final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, k,myUniquePlacePoint);


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

				String RX10_TEMP32 = "Bad place access for array X10_TEMP33";

				throw new RuntimeException(RX10_TEMP32);

				}
			Program.setRefArrayValue1Particle(X10_TEMP33, RX10_TEMP27, X10_TEMP56,myUniquePlacePoint);
			}

		final Dist1 RX10_TEMP36 = P.distValue;


		final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;


		final int RX10_TEMP40 = 1;


		int RX10_TEMP38 = RX10_TEMP37.regSize;


		RX10_TEMP38 = RX10_TEMP38 - RX10_TEMP40;


		final int  RX10_TEMP39 = RX10_TEMP38+1;

		for(int RX10_TEMP35=0; RX10_TEMP35 < RX10_TEMP39; RX10_TEMP35++)
			{

			final int RX10_TEMP41 = RX10_TEMP35;


			final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP37, RX10_TEMP41,myUniquePlacePoint);


			final int X10_TEMP60 = 0;


			final int X10_TEMP61 = 2;


			final Region1 X10_TEMP62 = Program.createNewRegion1R(X10_TEMP60, X10_TEMP61,myUniquePlacePoint);


			final int X10_TEMP63 = 0;


			final Dist1 dD = Program.getPlaceDist1(X10_TEMP62, X10_TEMP63,myUniquePlacePoint);


			final int X10_TEMP67 = 0;


			final int X10_TEMP68 = 0;


			final Region1 X10_TEMP69 = Program.createNewRegion1R(X10_TEMP67, X10_TEMP68,myUniquePlacePoint);


			final int X10_TEMP70 = 0;


			final Dist1 dI = Program.getPlaceDist1(X10_TEMP69, X10_TEMP70,myUniquePlacePoint);


			final Region1 RX10_TEMP42 = dD.dReg;


			final int RX10_TEMP43 = 0;


			final int RX10_TEMP44 = 1;


			int RX10_TEMP45 = Program.MAX_PLACES;


			RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44;


			final int  RX10_TEMP46 = RX10_TEMP45+1;


			final int RX10_TEMP47 = RX10_TEMP45+1;


			final doubleStub[] RX10_TEMP48 = new doubleStub[RX10_TEMP47];

			/*FINISH
*/				{
				for(int RX10_TEMP49=0; RX10_TEMP49 < RX10_TEMP46; RX10_TEMP49++)
					{

					final int RX10_TEMP50 = 0;


					final int RX10_TEMP51 = RX10_TEMP49;


					final int RX10_TEMP52 = RX10_TEMP51;


					final int RX10_TEMP53 = Program.getDistLocalCount1(dD, RX10_TEMP51,myUniquePlacePoint);


					final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44;

					//async(RX10_TEMP52)
						{

						final int RX10_TEMP55 = RX10_TEMP54+1;


						final double[] RX10_TEMP56 = new double[RX10_TEMP55];


						final doubleStub RX10_TEMP57 = new doubleStub(RX10_TEMP56,RX10_TEMP52);
						
Program.globalPointerHashMap.get(RX10_TEMP52).add(RX10_TEMP57.hashCode());

						//async(RX10_TEMP50)
							{
							RX10_TEMP48[RX10_TEMP49] = RX10_TEMP57;
							}
						}
					}
				}

			final doubleStub[] RX10_TEMP58 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP46]);
/*arrayInitBlock*/
for(int RX10_TEMP60= 0;RX10_TEMP60 <RX10_TEMP58.length ;RX10_TEMP60++ )				{

				final doubleStub RX10_TEMP59 = RX10_TEMP48[RX10_TEMP60];

				RX10_TEMP58[RX10_TEMP60] =RX10_TEMP59;
				}

;


			final doubleRefArray1 RX10_TEMP61 = new doubleRefArray1(dD, RX10_TEMP58,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP61.hashCode());


			final doubleRefArray1 dataD = RX10_TEMP61;


			final Region1 RX10_TEMP62 = dI.dReg;


			final int RX10_TEMP63 = 0;


			final int RX10_TEMP64 = 1;


			int RX10_TEMP65 = Program.MAX_PLACES;


			RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP64;


			final int  RX10_TEMP66 = RX10_TEMP65+1;


			final int RX10_TEMP67 = RX10_TEMP65+1;


			final doubleStub[] RX10_TEMP68 = new doubleStub[RX10_TEMP67];

			/*FINISH
*/				{
				for(int RX10_TEMP69=0; RX10_TEMP69 < RX10_TEMP66; RX10_TEMP69++)
					{

					final int RX10_TEMP70 = 0;


					final int RX10_TEMP71 = RX10_TEMP69;


					final int RX10_TEMP72 = RX10_TEMP71;


					final int RX10_TEMP73 = Program.getDistLocalCount1(dI, RX10_TEMP71,myUniquePlacePoint);


					final int RX10_TEMP74 = RX10_TEMP73 - RX10_TEMP64;

					//async(RX10_TEMP72)
						{

						final int RX10_TEMP75 = RX10_TEMP74+1;


						final double[] RX10_TEMP76 = new double[RX10_TEMP75];


						final doubleStub RX10_TEMP77 = new doubleStub(RX10_TEMP76,RX10_TEMP72);
						
Program.globalPointerHashMap.get(RX10_TEMP72).add(RX10_TEMP77.hashCode());

						//async(RX10_TEMP70)
							{
							RX10_TEMP68[RX10_TEMP69] = RX10_TEMP77;
							}
						}
					}
				}

			final doubleStub[] RX10_TEMP78 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP66]);
/*arrayInitBlock*/
for(int RX10_TEMP80= 0;RX10_TEMP80 <RX10_TEMP78.length ;RX10_TEMP80++ )				{

				final doubleStub RX10_TEMP79 = RX10_TEMP68[RX10_TEMP80];

				RX10_TEMP78[RX10_TEMP80] =RX10_TEMP79;
				}

;


			final doubleRefArray1 RX10_TEMP81 = new doubleRefArray1(dI, RX10_TEMP78,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP81.hashCode());


			final doubleRefArray1 dataI = RX10_TEMP81;


			final int X10_TEMP80 = 0;


			final int X10_TEMP75 = X10_TEMP0.mdsize;


			final int X10_TEMP76 = 1;


			final int X10_TEMP78 = X10_TEMP75 - X10_TEMP76;


			final Region1 X10_TEMP82 = Program.createNewRegion1R(X10_TEMP80, X10_TEMP78,myUniquePlacePoint);


			final int RX10_TEMP85 = 1;


			int RX10_TEMP83 = X10_TEMP82.regSize;


			RX10_TEMP83 = RX10_TEMP83 - RX10_TEMP85;


			final int  RX10_TEMP84 = RX10_TEMP83+1;

			for(int RX10_TEMP82=0; RX10_TEMP82 < RX10_TEMP84; RX10_TEMP82++)
				{

				final int RX10_TEMP86 = RX10_TEMP82;


				final Point1 k = Program.regionOrdinalPoint1(X10_TEMP82, RX10_TEMP86,myUniquePlacePoint);

				/*FINISH
*/					{

					final Dist1 RX10_TEMP87 = P.distValue;


					final Dist1 X10_TEMP83 = RX10_TEMP87;


					final Region1 RX10_TEMP88 = X10_TEMP83.dReg;


					final int RX10_TEMP89 = Program.searchPointInRegion1(RX10_TEMP88, j,myUniquePlacePoint);


					final int RX10_TEMP90 = 0;


					final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;

					if(RX10_TEMP91)
						{

						final String RX10_TEMP92 = "Point j not found in the distribution X10_TEMP83.";

						throw new RuntimeException(RX10_TEMP92);

						}

					final int RX10_TEMP93 = Program.getPlaceFromDist1(X10_TEMP83, RX10_TEMP89,myUniquePlacePoint);


					final int X10_TEMP86 = RX10_TEMP93;

					//async(X10_TEMP86)
						{

						final Dist1 RX10_TEMP94 = P.distValue;


						final Region1 RX10_TEMP95 = RX10_TEMP94.dReg;


						final int RX10_TEMP96 = Program.searchPointInRegion1(RX10_TEMP95, j,X10_TEMP86);


						final int RX10_TEMP97 = 0;


						final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;

						if(RX10_TEMP98)
							{

							String RX10_TEMP99 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP99);

							}

						final int RX10_TEMP100 = Program.getPlaceFromDist1(RX10_TEMP94, RX10_TEMP96,X10_TEMP86);


						final int RX10_TEMP102 = 0;


						final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;

						if(RX10_TEMP103)
							{

							String RX10_TEMP101 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP101);

							}

						final md RX10_TEMP104 = Program.getRefArrayValue1md(P, RX10_TEMP96,X10_TEMP86);


						final md X10_TEMP88 = RX10_TEMP104;


						final ParticleRefArray1 X10_TEMP89 = X10_TEMP88.one;


						final Dist1 RX10_TEMP105 = X10_TEMP89.distValue;


						final Region1 RX10_TEMP106 = RX10_TEMP105.dReg;


						final int RX10_TEMP107 = Program.searchPointInRegion1(RX10_TEMP106, k,X10_TEMP86);


						final int RX10_TEMP108 = 0;


						final boolean RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108;

						if(RX10_TEMP109)
							{

							String RX10_TEMP110 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP110);

							}

						final int RX10_TEMP111 = Program.getPlaceFromDist1(RX10_TEMP105, RX10_TEMP107,X10_TEMP86);


						final int RX10_TEMP113 = 0;


						final boolean RX10_TEMP114 = RX10_TEMP111 != RX10_TEMP113;

						if(RX10_TEMP114)
							{

							String RX10_TEMP112 = "Bad place access for array X10_TEMP89";

							throw new RuntimeException(RX10_TEMP112);

							}

						final Particle RX10_TEMP115 = Program.getRefArrayValue1Particle(X10_TEMP89, RX10_TEMP107,X10_TEMP86);


						final Particle X10_TEMP91 = RX10_TEMP115;


						final double fx = X10_TEMP91.xforce;


						final Dist1 RX10_TEMP116 = P.distValue;


						final Region1 RX10_TEMP117 = RX10_TEMP116.dReg;


						final int RX10_TEMP118 = Program.searchPointInRegion1(RX10_TEMP117, j,X10_TEMP86);


						final int RX10_TEMP119 = 0;


						final boolean RX10_TEMP120 = RX10_TEMP118 < RX10_TEMP119;

						if(RX10_TEMP120)
							{

							String RX10_TEMP121 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP121);

							}

						final int RX10_TEMP122 = Program.getPlaceFromDist1(RX10_TEMP116, RX10_TEMP118,X10_TEMP86);


						final int RX10_TEMP124 = 0;


						final boolean RX10_TEMP125 = RX10_TEMP122 != RX10_TEMP124;

						if(RX10_TEMP125)
							{

							String RX10_TEMP123 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP123);

							}

						final md RX10_TEMP126 = Program.getRefArrayValue1md(P, RX10_TEMP118,X10_TEMP86);


						final md X10_TEMP94 = RX10_TEMP126;


						final ParticleRefArray1 X10_TEMP95 = X10_TEMP94.one;


						final Dist1 RX10_TEMP127 = X10_TEMP95.distValue;


						final Region1 RX10_TEMP128 = RX10_TEMP127.dReg;


						final int RX10_TEMP129 = Program.searchPointInRegion1(RX10_TEMP128, k,X10_TEMP86);


						final int RX10_TEMP130 = 0;


						final boolean RX10_TEMP131 = RX10_TEMP129 < RX10_TEMP130;

						if(RX10_TEMP131)
							{

							String RX10_TEMP132 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP132);

							}

						final int RX10_TEMP133 = Program.getPlaceFromDist1(RX10_TEMP127, RX10_TEMP129,X10_TEMP86);


						final int RX10_TEMP135 = 0;


						final boolean RX10_TEMP136 = RX10_TEMP133 != RX10_TEMP135;

						if(RX10_TEMP136)
							{

							String RX10_TEMP134 = "Bad place access for array X10_TEMP95";

							throw new RuntimeException(RX10_TEMP134);

							}

						final Particle RX10_TEMP137 = Program.getRefArrayValue1Particle(X10_TEMP95, RX10_TEMP129,X10_TEMP86);


						final Particle X10_TEMP97 = RX10_TEMP137;


						final double fy = X10_TEMP97.yforce;


						final Dist1 RX10_TEMP138 = P.distValue;


						final Region1 RX10_TEMP139 = RX10_TEMP138.dReg;


						final int RX10_TEMP140 = Program.searchPointInRegion1(RX10_TEMP139, j,X10_TEMP86);


						final int RX10_TEMP141 = 0;


						final boolean RX10_TEMP142 = RX10_TEMP140 < RX10_TEMP141;

						if(RX10_TEMP142)
							{

							String RX10_TEMP143 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP143);

							}

						final int RX10_TEMP144 = Program.getPlaceFromDist1(RX10_TEMP138, RX10_TEMP140,X10_TEMP86);


						final int RX10_TEMP146 = 0;


						final boolean RX10_TEMP147 = RX10_TEMP144 != RX10_TEMP146;

						if(RX10_TEMP147)
							{

							String RX10_TEMP145 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP145);

							}

						final md RX10_TEMP148 = Program.getRefArrayValue1md(P, RX10_TEMP140,X10_TEMP86);


						final md X10_TEMP100 = RX10_TEMP148;


						final ParticleRefArray1 X10_TEMP101 = X10_TEMP100.one;


						final Dist1 RX10_TEMP149 = X10_TEMP101.distValue;


						final Region1 RX10_TEMP150 = RX10_TEMP149.dReg;


						final int RX10_TEMP151 = Program.searchPointInRegion1(RX10_TEMP150, k,X10_TEMP86);


						final int RX10_TEMP152 = 0;


						final boolean RX10_TEMP153 = RX10_TEMP151 < RX10_TEMP152;

						if(RX10_TEMP153)
							{

							String RX10_TEMP154 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP154);

							}

						final int RX10_TEMP155 = Program.getPlaceFromDist1(RX10_TEMP149, RX10_TEMP151,X10_TEMP86);


						final int RX10_TEMP157 = 0;


						final boolean RX10_TEMP158 = RX10_TEMP155 != RX10_TEMP157;

						if(RX10_TEMP158)
							{

							String RX10_TEMP156 = "Bad place access for array X10_TEMP101";

							throw new RuntimeException(RX10_TEMP156);

							}

						final Particle RX10_TEMP159 = Program.getRefArrayValue1Particle(X10_TEMP101, RX10_TEMP151,X10_TEMP86);


						final Particle X10_TEMP103 = RX10_TEMP159;


						final double fz = X10_TEMP103.zforce;

						/*FINISH
*/							{
							//async(tHere)
								{

								final int X10_TEMP107 = 0;


								final double X10_TEMP110 = fx;


								final Point1 RX10_TEMP160 = new Point1(X10_TEMP107,tHere);
								
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP160.hashCode());


								final Dist1 RX10_TEMP161 = dataD.distValue;


								final Region1 RX10_TEMP162 = RX10_TEMP161.dReg;


								final int RX10_TEMP163 = Program.searchPointInRegion1(RX10_TEMP162, RX10_TEMP160,tHere);


								final int RX10_TEMP164 = 0;


								final boolean RX10_TEMP165 = RX10_TEMP163 < RX10_TEMP164;

								if(RX10_TEMP165)
									{

									String RX10_TEMP166 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP166);

									}

								final int RX10_TEMP167 = Program.getPlaceFromDist1(RX10_TEMP161, RX10_TEMP163,tHere);


								final int RX10_TEMP169 = 0;


								final boolean RX10_TEMP170 = RX10_TEMP167 != RX10_TEMP169;

								if(RX10_TEMP170)
									{

									String RX10_TEMP168 = "Bad place access for array dataD";

									throw new RuntimeException(RX10_TEMP168);

									}
								Program.setRefArrayValue1double(dataD, RX10_TEMP163, X10_TEMP110,tHere);

								final int X10_TEMP112 = 1;


								final double X10_TEMP115 = fy;


								final Point1 RX10_TEMP171 = new Point1(X10_TEMP112,tHere);
								
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP171.hashCode());


								final Dist1 RX10_TEMP172 = dataD.distValue;


								final Region1 RX10_TEMP173 = RX10_TEMP172.dReg;


								final int RX10_TEMP174 = Program.searchPointInRegion1(RX10_TEMP173, RX10_TEMP171,tHere);


								final int RX10_TEMP175 = 0;


								final boolean RX10_TEMP176 = RX10_TEMP174 < RX10_TEMP175;

								if(RX10_TEMP176)
									{

									String RX10_TEMP177 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP177);

									}

								final int RX10_TEMP178 = Program.getPlaceFromDist1(RX10_TEMP172, RX10_TEMP174,tHere);


								final int RX10_TEMP180 = 0;


								final boolean RX10_TEMP181 = RX10_TEMP178 != RX10_TEMP180;

								if(RX10_TEMP181)
									{

									String RX10_TEMP179 = "Bad place access for array dataD";

									throw new RuntimeException(RX10_TEMP179);

									}
								Program.setRefArrayValue1double(dataD, RX10_TEMP174, X10_TEMP115,tHere);

								final int X10_TEMP117 = 2;


								final double X10_TEMP120 = fz;


								final Point1 RX10_TEMP182 = new Point1(X10_TEMP117,tHere);
								
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP182.hashCode());


								final Dist1 RX10_TEMP183 = dataD.distValue;


								final Region1 RX10_TEMP184 = RX10_TEMP183.dReg;


								final int RX10_TEMP185 = Program.searchPointInRegion1(RX10_TEMP184, RX10_TEMP182,tHere);


								final int RX10_TEMP186 = 0;


								final boolean RX10_TEMP187 = RX10_TEMP185 < RX10_TEMP186;

								if(RX10_TEMP187)
									{

									String RX10_TEMP188 = "Array index out of bounds";

									throw new RuntimeException(RX10_TEMP188);

									}

								final int RX10_TEMP189 = Program.getPlaceFromDist1(RX10_TEMP183, RX10_TEMP185,tHere);


								final int RX10_TEMP191 = 0;


								final boolean RX10_TEMP192 = RX10_TEMP189 != RX10_TEMP191;

								if(RX10_TEMP192)
									{

									String RX10_TEMP190 = "Bad place access for array dataD";

									throw new RuntimeException(RX10_TEMP190);

									}
								Program.setRefArrayValue1double(dataD, RX10_TEMP185, X10_TEMP120,tHere);
								}
							}
						}
					}

				final ParticleRefArray1 X10_TEMP121 = t.one;


				final Dist1 RX10_TEMP193 = X10_TEMP121.distValue;


				final Region1 RX10_TEMP194 = RX10_TEMP193.dReg;


				final int RX10_TEMP195 = Program.searchPointInRegion1(RX10_TEMP194, k,myUniquePlacePoint);


				final int RX10_TEMP196 = 0;


				final boolean RX10_TEMP197 = RX10_TEMP195 < RX10_TEMP196;

				if(RX10_TEMP197)
					{

					String RX10_TEMP198 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP198);

					}

				final int RX10_TEMP199 = Program.getPlaceFromDist1(RX10_TEMP193, RX10_TEMP195,myUniquePlacePoint);


				final int RX10_TEMP201 = 0;


				final boolean RX10_TEMP202 = RX10_TEMP199 != RX10_TEMP201;

				if(RX10_TEMP202)
					{

					String RX10_TEMP200 = "Bad place access for array X10_TEMP121";

					throw new RuntimeException(RX10_TEMP200);

					}

				final Particle RX10_TEMP203 = Program.getRefArrayValue1Particle(X10_TEMP121, RX10_TEMP195,myUniquePlacePoint);


				final Particle X10_TEMP123 = RX10_TEMP203;


				final ParticleRefArray1 X10_TEMP124 = t.one;


				final Dist1 RX10_TEMP204 = X10_TEMP124.distValue;


				final Region1 RX10_TEMP205 = RX10_TEMP204.dReg;


				final int RX10_TEMP206 = Program.searchPointInRegion1(RX10_TEMP205, k,myUniquePlacePoint);


				final int RX10_TEMP207 = 0;


				final boolean RX10_TEMP208 = RX10_TEMP206 < RX10_TEMP207;

				if(RX10_TEMP208)
					{

					String RX10_TEMP209 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP209);

					}

				final int RX10_TEMP210 = Program.getPlaceFromDist1(RX10_TEMP204, RX10_TEMP206,myUniquePlacePoint);


				final int RX10_TEMP212 = 0;


				final boolean RX10_TEMP213 = RX10_TEMP210 != RX10_TEMP212;

				if(RX10_TEMP213)
					{

					String RX10_TEMP211 = "Bad place access for array X10_TEMP124";

					throw new RuntimeException(RX10_TEMP211);

					}

				final Particle RX10_TEMP214 = Program.getRefArrayValue1Particle(X10_TEMP124, RX10_TEMP206,myUniquePlacePoint);


				final Particle X10_TEMP126 = RX10_TEMP214;


				final double X10_TEMP129 = X10_TEMP126.xforce;


				final int X10_TEMP128 = 0;


				final Point1 RX10_TEMP215 = new Point1(X10_TEMP128,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP215.hashCode());


				final Dist1 RX10_TEMP216 = dataD.distValue;


				final Region1 RX10_TEMP217 = RX10_TEMP216.dReg;


				final int RX10_TEMP218 = Program.searchPointInRegion1(RX10_TEMP217, RX10_TEMP215,myUniquePlacePoint);


				final int RX10_TEMP219 = 0;


				final boolean RX10_TEMP220 = RX10_TEMP218 < RX10_TEMP219;

				if(RX10_TEMP220)
					{

					String RX10_TEMP221 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP221);

					}

				final int RX10_TEMP222 = Program.getPlaceFromDist1(RX10_TEMP216, RX10_TEMP218,myUniquePlacePoint);


				final int RX10_TEMP224 = 0;


				final boolean RX10_TEMP225 = RX10_TEMP222 != RX10_TEMP224;

				if(RX10_TEMP225)
					{

					String RX10_TEMP223 = "Bad place access for array dataD";

					throw new RuntimeException(RX10_TEMP223);

					}

				final double RX10_TEMP226 = Program.getRefArrayValue1double(dataD, RX10_TEMP218,myUniquePlacePoint);


				final double X10_TEMP130 = RX10_TEMP226;


				final double X10_TEMP133 = X10_TEMP129 + X10_TEMP130;


				final double X10_TEMP134 = X10_TEMP133;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP123.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP123.xforce = (X10_TEMP134);

				final ParticleRefArray1 X10_TEMP135 = t.one;


				final Dist1 RX10_TEMP227 = X10_TEMP135.distValue;


				final Region1 RX10_TEMP228 = RX10_TEMP227.dReg;


				final int RX10_TEMP229 = Program.searchPointInRegion1(RX10_TEMP228, k,myUniquePlacePoint);


				final int RX10_TEMP230 = 0;


				final boolean RX10_TEMP231 = RX10_TEMP229 < RX10_TEMP230;

				if(RX10_TEMP231)
					{

					String RX10_TEMP232 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP232);

					}

				final int RX10_TEMP233 = Program.getPlaceFromDist1(RX10_TEMP227, RX10_TEMP229,myUniquePlacePoint);


				final int RX10_TEMP235 = 0;


				final boolean RX10_TEMP236 = RX10_TEMP233 != RX10_TEMP235;

				if(RX10_TEMP236)
					{

					String RX10_TEMP234 = "Bad place access for array X10_TEMP135";

					throw new RuntimeException(RX10_TEMP234);

					}

				final Particle RX10_TEMP237 = Program.getRefArrayValue1Particle(X10_TEMP135, RX10_TEMP229,myUniquePlacePoint);


				final Particle X10_TEMP137 = RX10_TEMP237;


				final ParticleRefArray1 X10_TEMP138 = t.one;


				final Dist1 RX10_TEMP238 = X10_TEMP138.distValue;


				final Region1 RX10_TEMP239 = RX10_TEMP238.dReg;


				final int RX10_TEMP240 = Program.searchPointInRegion1(RX10_TEMP239, k,myUniquePlacePoint);


				final int RX10_TEMP241 = 0;


				final boolean RX10_TEMP242 = RX10_TEMP240 < RX10_TEMP241;

				if(RX10_TEMP242)
					{

					String RX10_TEMP243 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP243);

					}

				final int RX10_TEMP244 = Program.getPlaceFromDist1(RX10_TEMP238, RX10_TEMP240,myUniquePlacePoint);


				final int RX10_TEMP246 = 0;


				final boolean RX10_TEMP247 = RX10_TEMP244 != RX10_TEMP246;

				if(RX10_TEMP247)
					{

					String RX10_TEMP245 = "Bad place access for array X10_TEMP138";

					throw new RuntimeException(RX10_TEMP245);

					}

				final Particle RX10_TEMP248 = Program.getRefArrayValue1Particle(X10_TEMP138, RX10_TEMP240,myUniquePlacePoint);


				final Particle X10_TEMP140 = RX10_TEMP248;


				final double X10_TEMP143 = X10_TEMP140.yforce;


				final int X10_TEMP142 = 1;


				final Point1 RX10_TEMP249 = new Point1(X10_TEMP142,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP249.hashCode());


				final Dist1 RX10_TEMP250 = dataD.distValue;


				final Region1 RX10_TEMP251 = RX10_TEMP250.dReg;


				final int RX10_TEMP252 = Program.searchPointInRegion1(RX10_TEMP251, RX10_TEMP249,myUniquePlacePoint);


				final int RX10_TEMP253 = 0;


				final boolean RX10_TEMP254 = RX10_TEMP252 < RX10_TEMP253;

				if(RX10_TEMP254)
					{

					String RX10_TEMP255 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP255);

					}

				final int RX10_TEMP256 = Program.getPlaceFromDist1(RX10_TEMP250, RX10_TEMP252,myUniquePlacePoint);


				final int RX10_TEMP258 = 0;


				final boolean RX10_TEMP259 = RX10_TEMP256 != RX10_TEMP258;

				if(RX10_TEMP259)
					{

					String RX10_TEMP257 = "Bad place access for array dataD";

					throw new RuntimeException(RX10_TEMP257);

					}

				final double RX10_TEMP260 = Program.getRefArrayValue1double(dataD, RX10_TEMP252,myUniquePlacePoint);


				final double X10_TEMP144 = RX10_TEMP260;


				final double X10_TEMP147 = X10_TEMP143 + X10_TEMP144;


				final double X10_TEMP148 = X10_TEMP147;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP137.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP137.yforce = (X10_TEMP148);

				final ParticleRefArray1 X10_TEMP149 = t.one;


				final Dist1 RX10_TEMP261 = X10_TEMP149.distValue;


				final Region1 RX10_TEMP262 = RX10_TEMP261.dReg;


				final int RX10_TEMP263 = Program.searchPointInRegion1(RX10_TEMP262, k,myUniquePlacePoint);


				final int RX10_TEMP264 = 0;


				final boolean RX10_TEMP265 = RX10_TEMP263 < RX10_TEMP264;

				if(RX10_TEMP265)
					{

					String RX10_TEMP266 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP266);

					}

				final int RX10_TEMP267 = Program.getPlaceFromDist1(RX10_TEMP261, RX10_TEMP263,myUniquePlacePoint);


				final int RX10_TEMP269 = 0;


				final boolean RX10_TEMP270 = RX10_TEMP267 != RX10_TEMP269;

				if(RX10_TEMP270)
					{

					String RX10_TEMP268 = "Bad place access for array X10_TEMP149";

					throw new RuntimeException(RX10_TEMP268);

					}

				final Particle RX10_TEMP271 = Program.getRefArrayValue1Particle(X10_TEMP149, RX10_TEMP263,myUniquePlacePoint);


				final Particle X10_TEMP151 = RX10_TEMP271;


				final ParticleRefArray1 X10_TEMP152 = t.one;


				final Dist1 RX10_TEMP272 = X10_TEMP152.distValue;


				final Region1 RX10_TEMP273 = RX10_TEMP272.dReg;


				final int RX10_TEMP274 = Program.searchPointInRegion1(RX10_TEMP273, k,myUniquePlacePoint);


				final int RX10_TEMP275 = 0;


				final boolean RX10_TEMP276 = RX10_TEMP274 < RX10_TEMP275;

				if(RX10_TEMP276)
					{

					String RX10_TEMP277 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP277);

					}

				final int RX10_TEMP278 = Program.getPlaceFromDist1(RX10_TEMP272, RX10_TEMP274,myUniquePlacePoint);


				final int RX10_TEMP280 = 0;


				final boolean RX10_TEMP281 = RX10_TEMP278 != RX10_TEMP280;

				if(RX10_TEMP281)
					{

					String RX10_TEMP279 = "Bad place access for array X10_TEMP152";

					throw new RuntimeException(RX10_TEMP279);

					}

				final Particle RX10_TEMP282 = Program.getRefArrayValue1Particle(X10_TEMP152, RX10_TEMP274,myUniquePlacePoint);


				final Particle X10_TEMP154 = RX10_TEMP282;


				final double X10_TEMP157 = X10_TEMP154.zforce;


				final int X10_TEMP156 = 2;


				final Point1 RX10_TEMP283 = new Point1(X10_TEMP156,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP283.hashCode());


				final Dist1 RX10_TEMP284 = dataD.distValue;


				final Region1 RX10_TEMP285 = RX10_TEMP284.dReg;


				final int RX10_TEMP286 = Program.searchPointInRegion1(RX10_TEMP285, RX10_TEMP283,myUniquePlacePoint);


				final int RX10_TEMP287 = 0;


				final boolean RX10_TEMP288 = RX10_TEMP286 < RX10_TEMP287;

				if(RX10_TEMP288)
					{

					String RX10_TEMP289 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP289);

					}

				final int RX10_TEMP290 = Program.getPlaceFromDist1(RX10_TEMP284, RX10_TEMP286,myUniquePlacePoint);


				final int RX10_TEMP292 = 0;


				final boolean RX10_TEMP293 = RX10_TEMP290 != RX10_TEMP292;

				if(RX10_TEMP293)
					{

					String RX10_TEMP291 = "Bad place access for array dataD";

					throw new RuntimeException(RX10_TEMP291);

					}

				final double RX10_TEMP294 = Program.getRefArrayValue1double(dataD, RX10_TEMP286,myUniquePlacePoint);


				final double X10_TEMP158 = RX10_TEMP294;


				final double X10_TEMP161 = X10_TEMP157 + X10_TEMP158;


				final double X10_TEMP162 = X10_TEMP161;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP151.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP151.zforce = (X10_TEMP162);
				}
			/*FINISH
*/				{

				final Dist1 RX10_TEMP295 = P.distValue;


				final Dist1 X10_TEMP163 = RX10_TEMP295;


				final Region1 RX10_TEMP296 = X10_TEMP163.dReg;


				final int RX10_TEMP297 = Program.searchPointInRegion1(RX10_TEMP296, j,myUniquePlacePoint);


				final int RX10_TEMP298 = 0;


				final boolean RX10_TEMP299 = RX10_TEMP297 < RX10_TEMP298;

				if(RX10_TEMP299)
					{

					final String RX10_TEMP300 = "Point j not found in the distribution X10_TEMP163.";

					throw new RuntimeException(RX10_TEMP300);

					}

				final int RX10_TEMP301 = Program.getPlaceFromDist1(X10_TEMP163, RX10_TEMP297,myUniquePlacePoint);


				final int X10_TEMP166 = RX10_TEMP301;

				//async(X10_TEMP166)
					{

					final Dist1 RX10_TEMP302 = P.distValue;


					final Region1 RX10_TEMP303 = RX10_TEMP302.dReg;


					final int RX10_TEMP304 = Program.searchPointInRegion1(RX10_TEMP303, j,X10_TEMP166);


					final int RX10_TEMP305 = 0;


					final boolean RX10_TEMP306 = RX10_TEMP304 < RX10_TEMP305;

					if(RX10_TEMP306)
						{

						String RX10_TEMP307 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP307);

						}

					final int RX10_TEMP308 = Program.getPlaceFromDist1(RX10_TEMP302, RX10_TEMP304,X10_TEMP166);


					final int RX10_TEMP310 = 0;


					final boolean RX10_TEMP311 = RX10_TEMP308 != RX10_TEMP310;

					if(RX10_TEMP311)
						{

						String RX10_TEMP309 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP309);

						}

					final md RX10_TEMP312 = Program.getRefArrayValue1md(P, RX10_TEMP304,X10_TEMP166);


					final md X10_TEMP168 = RX10_TEMP312;


					final double jvir = X10_TEMP168.vir;


					final Dist1 RX10_TEMP313 = P.distValue;


					final Region1 RX10_TEMP314 = RX10_TEMP313.dReg;


					final int RX10_TEMP315 = Program.searchPointInRegion1(RX10_TEMP314, j,X10_TEMP166);


					final int RX10_TEMP316 = 0;


					final boolean RX10_TEMP317 = RX10_TEMP315 < RX10_TEMP316;

					if(RX10_TEMP317)
						{

						String RX10_TEMP318 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP318);

						}

					final int RX10_TEMP319 = Program.getPlaceFromDist1(RX10_TEMP313, RX10_TEMP315,X10_TEMP166);


					final int RX10_TEMP321 = 0;


					final boolean RX10_TEMP322 = RX10_TEMP319 != RX10_TEMP321;

					if(RX10_TEMP322)
						{

						String RX10_TEMP320 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP320);

						}

					final md RX10_TEMP323 = Program.getRefArrayValue1md(P, RX10_TEMP315,X10_TEMP166);


					final md X10_TEMP171 = RX10_TEMP323;


					final double jepot = X10_TEMP171.epot;


					final Dist1 RX10_TEMP324 = P.distValue;


					final Region1 RX10_TEMP325 = RX10_TEMP324.dReg;


					final int RX10_TEMP326 = Program.searchPointInRegion1(RX10_TEMP325, j,X10_TEMP166);


					final int RX10_TEMP327 = 0;


					final boolean RX10_TEMP328 = RX10_TEMP326 < RX10_TEMP327;

					if(RX10_TEMP328)
						{

						String RX10_TEMP329 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP329);

						}

					final int RX10_TEMP330 = Program.getPlaceFromDist1(RX10_TEMP324, RX10_TEMP326,X10_TEMP166);


					final int RX10_TEMP332 = 0;


					final boolean RX10_TEMP333 = RX10_TEMP330 != RX10_TEMP332;

					if(RX10_TEMP333)
						{

						String RX10_TEMP331 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP331);

						}

					final md RX10_TEMP334 = Program.getRefArrayValue1md(P, RX10_TEMP326,X10_TEMP166);


					final md X10_TEMP174 = RX10_TEMP334;


					final int jinter = X10_TEMP174.interactions;

					/*FINISH
*/						{
						//async(tHere)
							{

							final int X10_TEMP178 = 0;


							final double X10_TEMP181 = jvir;


							final Point1 RX10_TEMP335 = new Point1(X10_TEMP178,tHere);
							
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP335.hashCode());


							final Dist1 RX10_TEMP336 = dataD.distValue;


							final Region1 RX10_TEMP337 = RX10_TEMP336.dReg;


							final int RX10_TEMP338 = Program.searchPointInRegion1(RX10_TEMP337, RX10_TEMP335,tHere);


							final int RX10_TEMP339 = 0;


							final boolean RX10_TEMP340 = RX10_TEMP338 < RX10_TEMP339;

							if(RX10_TEMP340)
								{

								String RX10_TEMP341 = "Array index out of bounds";

								throw new RuntimeException(RX10_TEMP341);

								}

							final int RX10_TEMP342 = Program.getPlaceFromDist1(RX10_TEMP336, RX10_TEMP338,tHere);


							final int RX10_TEMP344 = 0;


							final boolean RX10_TEMP345 = RX10_TEMP342 != RX10_TEMP344;

							if(RX10_TEMP345)
								{

								String RX10_TEMP343 = "Bad place access for array dataD";

								throw new RuntimeException(RX10_TEMP343);

								}
							Program.setRefArrayValue1double(dataD, RX10_TEMP338, X10_TEMP181,tHere);

							final int X10_TEMP183 = 1;


							final double X10_TEMP186 = jepot;


							final Point1 RX10_TEMP346 = new Point1(X10_TEMP183,tHere);
							
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP346.hashCode());


							final Dist1 RX10_TEMP347 = dataD.distValue;


							final Region1 RX10_TEMP348 = RX10_TEMP347.dReg;


							final int RX10_TEMP349 = Program.searchPointInRegion1(RX10_TEMP348, RX10_TEMP346,tHere);


							final int RX10_TEMP350 = 0;


							final boolean RX10_TEMP351 = RX10_TEMP349 < RX10_TEMP350;

							if(RX10_TEMP351)
								{

								String RX10_TEMP352 = "Array index out of bounds";

								throw new RuntimeException(RX10_TEMP352);

								}

							final int RX10_TEMP353 = Program.getPlaceFromDist1(RX10_TEMP347, RX10_TEMP349,tHere);


							final int RX10_TEMP355 = 0;


							final boolean RX10_TEMP356 = RX10_TEMP353 != RX10_TEMP355;

							if(RX10_TEMP356)
								{

								String RX10_TEMP354 = "Bad place access for array dataD";

								throw new RuntimeException(RX10_TEMP354);

								}
							Program.setRefArrayValue1double(dataD, RX10_TEMP349, X10_TEMP186,tHere);

							final int X10_TEMP188 = 0;


							final double X10_TEMP191 = jinter;


							final Point1 RX10_TEMP357 = new Point1(X10_TEMP188,tHere);
							
Program.globalPointerHashMap.get(tHere).add(RX10_TEMP357.hashCode());


							final Dist1 RX10_TEMP358 = dataI.distValue;


							final Region1 RX10_TEMP359 = RX10_TEMP358.dReg;


							final int RX10_TEMP360 = Program.searchPointInRegion1(RX10_TEMP359, RX10_TEMP357,tHere);


							final int RX10_TEMP361 = 0;


							final boolean RX10_TEMP362 = RX10_TEMP360 < RX10_TEMP361;

							if(RX10_TEMP362)
								{

								String RX10_TEMP363 = "Array index out of bounds";

								throw new RuntimeException(RX10_TEMP363);

								}

							final int RX10_TEMP364 = Program.getPlaceFromDist1(RX10_TEMP358, RX10_TEMP360,tHere);


							final int RX10_TEMP366 = 0;


							final boolean RX10_TEMP367 = RX10_TEMP364 != RX10_TEMP366;

							if(RX10_TEMP367)
								{

								String RX10_TEMP365 = "Bad place access for array dataI";

								throw new RuntimeException(RX10_TEMP365);

								}
							Program.setRefArrayValue1double(dataI, RX10_TEMP360, X10_TEMP191,tHere);
							}
						}
					}
				}

			final double X10_TEMP194 = t.vir;


			final int X10_TEMP193 = 0;


			final Point1 RX10_TEMP368 = new Point1(X10_TEMP193,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP368.hashCode());


			final Dist1 RX10_TEMP369 = dataD.distValue;


			final Region1 RX10_TEMP370 = RX10_TEMP369.dReg;


			final int RX10_TEMP371 = Program.searchPointInRegion1(RX10_TEMP370, RX10_TEMP368,myUniquePlacePoint);


			final int RX10_TEMP372 = 0;


			final boolean RX10_TEMP373 = RX10_TEMP371 < RX10_TEMP372;

			if(RX10_TEMP373)
				{

				String RX10_TEMP374 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP374);

				}

			final int RX10_TEMP375 = Program.getPlaceFromDist1(RX10_TEMP369, RX10_TEMP371,myUniquePlacePoint);


			final int RX10_TEMP377 = 0;


			final boolean RX10_TEMP378 = RX10_TEMP375 != RX10_TEMP377;

			if(RX10_TEMP378)
				{

				String RX10_TEMP376 = "Bad place access for array dataD";

				throw new RuntimeException(RX10_TEMP376);

				}

			final double RX10_TEMP379 = Program.getRefArrayValue1double(dataD, RX10_TEMP371,myUniquePlacePoint);


			final double X10_TEMP195 = RX10_TEMP379;


			final double X10_TEMP198 = X10_TEMP194 + X10_TEMP195;


			final double X10_TEMP199 = X10_TEMP198;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(t.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			t.vir = (X10_TEMP199);

			final double X10_TEMP202 = t.epot;


			final int X10_TEMP201 = 1;


			final Point1 RX10_TEMP380 = new Point1(X10_TEMP201,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP380.hashCode());


			final Dist1 RX10_TEMP381 = dataD.distValue;


			final Region1 RX10_TEMP382 = RX10_TEMP381.dReg;


			final int RX10_TEMP383 = Program.searchPointInRegion1(RX10_TEMP382, RX10_TEMP380,myUniquePlacePoint);


			final int RX10_TEMP384 = 0;


			final boolean RX10_TEMP385 = RX10_TEMP383 < RX10_TEMP384;

			if(RX10_TEMP385)
				{

				String RX10_TEMP386 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP386);

				}

			final int RX10_TEMP387 = Program.getPlaceFromDist1(RX10_TEMP381, RX10_TEMP383,myUniquePlacePoint);


			final int RX10_TEMP389 = 0;


			final boolean RX10_TEMP390 = RX10_TEMP387 != RX10_TEMP389;

			if(RX10_TEMP390)
				{

				String RX10_TEMP388 = "Bad place access for array dataD";

				throw new RuntimeException(RX10_TEMP388);

				}

			final double RX10_TEMP391 = Program.getRefArrayValue1double(dataD, RX10_TEMP383,myUniquePlacePoint);


			final double X10_TEMP203 = RX10_TEMP391;


			final double X10_TEMP206 = X10_TEMP202 + X10_TEMP203;


			final double X10_TEMP207 = X10_TEMP206;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(t.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			t.epot = (X10_TEMP207);

			final int X10_TEMP211 = t.interactions;


			final int X10_TEMP209 = 0;


			final Point1 RX10_TEMP392 = new Point1(X10_TEMP209,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP392.hashCode());


			final Dist1 RX10_TEMP393 = dataI.distValue;


			final Region1 RX10_TEMP394 = RX10_TEMP393.dReg;


			final int RX10_TEMP395 = Program.searchPointInRegion1(RX10_TEMP394, RX10_TEMP392,myUniquePlacePoint);


			final int RX10_TEMP396 = 0;


			final boolean RX10_TEMP397 = RX10_TEMP395 < RX10_TEMP396;

			if(RX10_TEMP397)
				{

				String RX10_TEMP398 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP398);

				}

			final int RX10_TEMP399 = Program.getPlaceFromDist1(RX10_TEMP393, RX10_TEMP395,myUniquePlacePoint);


			final int RX10_TEMP401 = 0;


			final boolean RX10_TEMP402 = RX10_TEMP399 != RX10_TEMP401;

			if(RX10_TEMP402)
				{

				String RX10_TEMP400 = "Bad place access for array dataI";

				throw new RuntimeException(RX10_TEMP400);

				}

			final double RX10_TEMP403 = Program.getRefArrayValue1double(dataI, RX10_TEMP395,myUniquePlacePoint);


			final double X10_TEMP210 = RX10_TEMP403;


			final int X10_TEMP212 = (int)X10_TEMP210;


			final int X10_TEMP215 = X10_TEMP211 + X10_TEMP212;


			final int X10_TEMP216 = X10_TEMP215;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(t.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			t.interactions = (X10_TEMP216);
			}

		final int mymdsize = X10_TEMP0.mdsize;

		/*FINISH
*/			{

			final Dist1 RX10_TEMP404 = P.distValue;


			final Dist1 X10_TEMP219 = RX10_TEMP404;


			final Region1 RX10_TEMP406 = X10_TEMP219.dReg;


			final int RX10_TEMP409 = 1;


			int RX10_TEMP407 = RX10_TEMP406.regSize;


			RX10_TEMP407 = RX10_TEMP407 - RX10_TEMP409;


			final int  RX10_TEMP408 = RX10_TEMP407+1;

			for(int RX10_TEMP405=0; RX10_TEMP405 < RX10_TEMP408; RX10_TEMP405++)
				{

				final int RX10_TEMP410 = RX10_TEMP405;


				final Point1 j = Program.regionOrdinalPoint1(RX10_TEMP406, RX10_TEMP410,myUniquePlacePoint);


				final Region1 RX10_TEMP411 = X10_TEMP219.dReg;


				final int RX10_TEMP412 = Program.searchPointInRegion1(RX10_TEMP411, j,myUniquePlacePoint);


				final int RX10_TEMP413 = 0;


				final boolean RX10_TEMP414 = RX10_TEMP412 < RX10_TEMP413;

				if(RX10_TEMP414)
					{

					final String RX10_TEMP415 = "Point j not found in the distribution X10_TEMP219.";

					throw new RuntimeException(RX10_TEMP415);

					}

				final int RX10_TEMP416 = Program.getPlaceFromDist1(X10_TEMP219, RX10_TEMP412,myUniquePlacePoint);


				final int X10_TEMP220 = RX10_TEMP416;

				//async(X10_TEMP220)
					{

					final int pHere = 0;


					final int X10_TEMP224 = 0;


					final int X10_TEMP225 = 2;


					final Region1 X10_TEMP226 = Program.createNewRegion1R(X10_TEMP224, X10_TEMP225,X10_TEMP220);


					final int X10_TEMP227 = 0;


					final Dist1 dD = Program.getPlaceDist1(X10_TEMP226, X10_TEMP227,X10_TEMP220);


					final Region1 RX10_TEMP417 = dD.dReg;


					final int RX10_TEMP418 = 0;


					final int RX10_TEMP419 = 1;


					int RX10_TEMP420 = Program.MAX_PLACES;


					RX10_TEMP420 = RX10_TEMP420 - RX10_TEMP419;


					final int  RX10_TEMP421 = RX10_TEMP420+1;


					final int RX10_TEMP422 = RX10_TEMP420+1;


					final doubleStub[] RX10_TEMP423 = new doubleStub[RX10_TEMP422];

					/*FINISH
*/						{
						for(int RX10_TEMP424=0; RX10_TEMP424 < RX10_TEMP421; RX10_TEMP424++)
							{

							final int RX10_TEMP425 = 0;


							final int RX10_TEMP426 = RX10_TEMP424;


							final int RX10_TEMP427 = RX10_TEMP426;


							final int RX10_TEMP428 = Program.getDistLocalCount1(dD, RX10_TEMP426,X10_TEMP220);


							final int RX10_TEMP429 = RX10_TEMP428 - RX10_TEMP419;

							//async(RX10_TEMP427)
								{

								final int RX10_TEMP430 = RX10_TEMP429+1;


								final double[] RX10_TEMP431 = new double[RX10_TEMP430];


								final doubleStub RX10_TEMP432 = new doubleStub(RX10_TEMP431,RX10_TEMP427);
								
Program.globalPointerHashMap.get(RX10_TEMP427).add(RX10_TEMP432.hashCode());

								//async(RX10_TEMP425)
									{
									RX10_TEMP423[RX10_TEMP424] = RX10_TEMP432;
									}
								}
							}
						}

					final doubleStub[] RX10_TEMP433 = (doubleStub[])(new doubleStub/*value*/[RX10_TEMP421]);
/*arrayInitBlock*/
for(int RX10_TEMP435= 0;RX10_TEMP435 <RX10_TEMP433.length ;RX10_TEMP435++ )						{

						final doubleStub RX10_TEMP434 = RX10_TEMP423[RX10_TEMP435];

						RX10_TEMP433[RX10_TEMP435] =RX10_TEMP434;
						}

;


					final doubleRefArray1 RX10_TEMP436 = new doubleRefArray1(dD, RX10_TEMP433,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP436.hashCode());


					final doubleRefArray1 dataD = RX10_TEMP436;


					final int X10_TEMP235 = 0;


					final int X10_TEMP231 = 1;


					final int X10_TEMP233 = mymdsize - X10_TEMP231;


					final Region1 X10_TEMP237 = Program.createNewRegion1R(X10_TEMP235, X10_TEMP233,myUniquePlacePoint);


					final int RX10_TEMP440 = 1;


					int RX10_TEMP438 = X10_TEMP237.regSize;


					RX10_TEMP438 = RX10_TEMP438 - RX10_TEMP440;


					final int  RX10_TEMP439 = RX10_TEMP438+1;

					for(int RX10_TEMP437=0; RX10_TEMP437 < RX10_TEMP439; RX10_TEMP437++)
						{

						final int RX10_TEMP441 = RX10_TEMP437;


						final Point1 k = Program.regionOrdinalPoint1(X10_TEMP237, RX10_TEMP441,myUniquePlacePoint);

						/*FINISH
*/							{
							//async(tHere)
								{

								final ParticleRefArray1 X10_TEMP239 = t.one;


								final Dist1 RX10_TEMP442 = X10_TEMP239.distValue;


								final Region1 RX10_TEMP443 = RX10_TEMP442.dReg;


								final int RX10_TEMP444 = Program.searchPointInRegion1(RX10_TEMP443, k,tHere);


								final int RX10_TEMP445 = 0;


								final boolean RX10_TEMP446 = RX10_TEMP444 < RX10_TEMP445;

								if(RX10_TEMP446)
									{

									String RX10_TEMP447 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP447);

									}

								final int RX10_TEMP448 = Program.getPlaceFromDist1(RX10_TEMP442, RX10_TEMP444,tHere);


								final int RX10_TEMP450 = 0;


								final boolean RX10_TEMP451 = RX10_TEMP448 != RX10_TEMP450;

								if(RX10_TEMP451)
									{

									String RX10_TEMP449 = "Bad place access for array X10_TEMP239";

									throw new RuntimeException(RX10_TEMP449);

									}

								final Particle RX10_TEMP452 = Program.getRefArrayValue1Particle(X10_TEMP239, RX10_TEMP444,tHere);


								final Particle X10_TEMP241 = RX10_TEMP452;


								final double xf = X10_TEMP241.xforce;


								final ParticleRefArray1 X10_TEMP243 = t.one;


								final Dist1 RX10_TEMP453 = X10_TEMP243.distValue;


								final Region1 RX10_TEMP454 = RX10_TEMP453.dReg;


								final int RX10_TEMP455 = Program.searchPointInRegion1(RX10_TEMP454, k,tHere);


								final int RX10_TEMP456 = 0;


								final boolean RX10_TEMP457 = RX10_TEMP455 < RX10_TEMP456;

								if(RX10_TEMP457)
									{

									String RX10_TEMP458 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP458);

									}

								final int RX10_TEMP459 = Program.getPlaceFromDist1(RX10_TEMP453, RX10_TEMP455,tHere);


								final int RX10_TEMP461 = 0;


								final boolean RX10_TEMP462 = RX10_TEMP459 != RX10_TEMP461;

								if(RX10_TEMP462)
									{

									String RX10_TEMP460 = "Bad place access for array X10_TEMP243";

									throw new RuntimeException(RX10_TEMP460);

									}

								final Particle RX10_TEMP463 = Program.getRefArrayValue1Particle(X10_TEMP243, RX10_TEMP455,tHere);


								final Particle X10_TEMP245 = RX10_TEMP463;


								final double yf = X10_TEMP245.yforce;


								final ParticleRefArray1 X10_TEMP247 = t.one;


								final Dist1 RX10_TEMP464 = X10_TEMP247.distValue;


								final Region1 RX10_TEMP465 = RX10_TEMP464.dReg;


								final int RX10_TEMP466 = Program.searchPointInRegion1(RX10_TEMP465, k,tHere);


								final int RX10_TEMP467 = 0;


								final boolean RX10_TEMP468 = RX10_TEMP466 < RX10_TEMP467;

								if(RX10_TEMP468)
									{

									String RX10_TEMP469 = "Array access index out of bounds";

									throw new RuntimeException(RX10_TEMP469);

									}

								final int RX10_TEMP470 = Program.getPlaceFromDist1(RX10_TEMP464, RX10_TEMP466,tHere);


								final int RX10_TEMP472 = 0;


								final boolean RX10_TEMP473 = RX10_TEMP470 != RX10_TEMP472;

								if(RX10_TEMP473)
									{

									String RX10_TEMP471 = "Bad place access for array X10_TEMP247";

									throw new RuntimeException(RX10_TEMP471);

									}

								final Particle RX10_TEMP474 = Program.getRefArrayValue1Particle(X10_TEMP247, RX10_TEMP466,tHere);


								final Particle X10_TEMP249 = RX10_TEMP474;


								final double zf = X10_TEMP249.zforce;

								/*FINISH
*/									{
									//async(pHere)
										{

										final int X10_TEMP253 = 0;


										final double X10_TEMP256 = xf;


										final Point1 RX10_TEMP475 = new Point1(X10_TEMP253,pHere);
										
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP475.hashCode());


										final Dist1 RX10_TEMP476 = dataD.distValue;


										final Region1 RX10_TEMP477 = RX10_TEMP476.dReg;


										final int RX10_TEMP478 = Program.searchPointInRegion1(RX10_TEMP477, RX10_TEMP475,pHere);


										final int RX10_TEMP479 = 0;


										final boolean RX10_TEMP480 = RX10_TEMP478 < RX10_TEMP479;

										if(RX10_TEMP480)
											{

											String RX10_TEMP481 = "Array index out of bounds";

											throw new RuntimeException(RX10_TEMP481);

											}

										final int RX10_TEMP482 = Program.getPlaceFromDist1(RX10_TEMP476, RX10_TEMP478,pHere);


										final int RX10_TEMP484 = 0;


										final boolean RX10_TEMP485 = RX10_TEMP482 != RX10_TEMP484;

										if(RX10_TEMP485)
											{

											String RX10_TEMP483 = "Bad place access for array dataD";

											throw new RuntimeException(RX10_TEMP483);

											}
										Program.setRefArrayValue1double(dataD, RX10_TEMP478, X10_TEMP256,pHere);

										final int X10_TEMP258 = 1;


										final double X10_TEMP261 = yf;


										final Point1 RX10_TEMP486 = new Point1(X10_TEMP258,pHere);
										
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP486.hashCode());


										final Dist1 RX10_TEMP487 = dataD.distValue;


										final Region1 RX10_TEMP488 = RX10_TEMP487.dReg;


										final int RX10_TEMP489 = Program.searchPointInRegion1(RX10_TEMP488, RX10_TEMP486,pHere);


										final int RX10_TEMP490 = 0;


										final boolean RX10_TEMP491 = RX10_TEMP489 < RX10_TEMP490;

										if(RX10_TEMP491)
											{

											String RX10_TEMP492 = "Array index out of bounds";

											throw new RuntimeException(RX10_TEMP492);

											}

										final int RX10_TEMP493 = Program.getPlaceFromDist1(RX10_TEMP487, RX10_TEMP489,pHere);


										final int RX10_TEMP495 = 0;


										final boolean RX10_TEMP496 = RX10_TEMP493 != RX10_TEMP495;

										if(RX10_TEMP496)
											{

											String RX10_TEMP494 = "Bad place access for array dataD";

											throw new RuntimeException(RX10_TEMP494);

											}
										Program.setRefArrayValue1double(dataD, RX10_TEMP489, X10_TEMP261,pHere);

										final int X10_TEMP263 = 2;


										final double X10_TEMP266 = zf;


										final Point1 RX10_TEMP497 = new Point1(X10_TEMP263,pHere);
										
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP497.hashCode());


										final Dist1 RX10_TEMP498 = dataD.distValue;


										final Region1 RX10_TEMP499 = RX10_TEMP498.dReg;


										final int RX10_TEMP500 = Program.searchPointInRegion1(RX10_TEMP499, RX10_TEMP497,pHere);


										final int RX10_TEMP501 = 0;


										final boolean RX10_TEMP502 = RX10_TEMP500 < RX10_TEMP501;

										if(RX10_TEMP502)
											{

											String RX10_TEMP503 = "Array index out of bounds";

											throw new RuntimeException(RX10_TEMP503);

											}

										final int RX10_TEMP504 = Program.getPlaceFromDist1(RX10_TEMP498, RX10_TEMP500,pHere);


										final int RX10_TEMP506 = 0;


										final boolean RX10_TEMP507 = RX10_TEMP504 != RX10_TEMP506;

										if(RX10_TEMP507)
											{

											String RX10_TEMP505 = "Bad place access for array dataD";

											throw new RuntimeException(RX10_TEMP505);

											}
										Program.setRefArrayValue1double(dataD, RX10_TEMP500, X10_TEMP266,pHere);
										}
									}
								}
							}

						final Dist1 RX10_TEMP508 = P.distValue;


						final Region1 RX10_TEMP509 = RX10_TEMP508.dReg;


						final int RX10_TEMP510 = Program.searchPointInRegion1(RX10_TEMP509, j,myUniquePlacePoint);


						final int RX10_TEMP511 = 0;


						final boolean RX10_TEMP512 = RX10_TEMP510 < RX10_TEMP511;

						if(RX10_TEMP512)
							{

							String RX10_TEMP513 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP513);

							}

						final int RX10_TEMP514 = Program.getPlaceFromDist1(RX10_TEMP508, RX10_TEMP510,myUniquePlacePoint);


						final int RX10_TEMP516 = 0;


						final boolean RX10_TEMP517 = RX10_TEMP514 != RX10_TEMP516;

						if(RX10_TEMP517)
							{

							String RX10_TEMP515 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP515);

							}

						final md RX10_TEMP518 = Program.getRefArrayValue1md(P, RX10_TEMP510,myUniquePlacePoint);


						final md X10_TEMP268 = RX10_TEMP518;


						final ParticleRefArray1 X10_TEMP269 = X10_TEMP268.one;


						final Dist1 RX10_TEMP519 = X10_TEMP269.distValue;


						final Region1 RX10_TEMP520 = RX10_TEMP519.dReg;


						final int RX10_TEMP521 = Program.searchPointInRegion1(RX10_TEMP520, k,myUniquePlacePoint);


						final int RX10_TEMP522 = 0;


						final boolean RX10_TEMP523 = RX10_TEMP521 < RX10_TEMP522;

						if(RX10_TEMP523)
							{

							String RX10_TEMP524 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP524);

							}

						final int RX10_TEMP525 = Program.getPlaceFromDist1(RX10_TEMP519, RX10_TEMP521,myUniquePlacePoint);


						final int RX10_TEMP527 = 0;


						final boolean RX10_TEMP528 = RX10_TEMP525 != RX10_TEMP527;

						if(RX10_TEMP528)
							{

							String RX10_TEMP526 = "Bad place access for array X10_TEMP269";

							throw new RuntimeException(RX10_TEMP526);

							}

						final Particle RX10_TEMP529 = Program.getRefArrayValue1Particle(X10_TEMP269, RX10_TEMP521,myUniquePlacePoint);


						final Particle X10_TEMP271 = RX10_TEMP529;


						final int X10_TEMP273 = 0;


						final Point1 RX10_TEMP530 = new Point1(X10_TEMP273,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP530.hashCode());


						final Dist1 RX10_TEMP531 = dataD.distValue;


						final Region1 RX10_TEMP532 = RX10_TEMP531.dReg;


						final int RX10_TEMP533 = Program.searchPointInRegion1(RX10_TEMP532, RX10_TEMP530,myUniquePlacePoint);


						final int RX10_TEMP534 = 0;


						final boolean RX10_TEMP535 = RX10_TEMP533 < RX10_TEMP534;

						if(RX10_TEMP535)
							{

							String RX10_TEMP536 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP536);

							}

						final int RX10_TEMP537 = Program.getPlaceFromDist1(RX10_TEMP531, RX10_TEMP533,myUniquePlacePoint);


						final int RX10_TEMP539 = 0;


						final boolean RX10_TEMP540 = RX10_TEMP537 != RX10_TEMP539;

						if(RX10_TEMP540)
							{

							String RX10_TEMP538 = "Bad place access for array dataD";

							throw new RuntimeException(RX10_TEMP538);

							}

						final double RX10_TEMP541 = Program.getRefArrayValue1double(dataD, RX10_TEMP533,myUniquePlacePoint);


						final double X10_TEMP276 = RX10_TEMP541;


						final double X10_TEMP277 = X10_TEMP276;

												if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP271.hashCode())){
						throw new RuntimeException("Object in wrong place");
						}						X10_TEMP271.xforce = (X10_TEMP277);

						final Dist1 RX10_TEMP542 = P.distValue;


						final Region1 RX10_TEMP543 = RX10_TEMP542.dReg;


						final int RX10_TEMP544 = Program.searchPointInRegion1(RX10_TEMP543, j,myUniquePlacePoint);


						final int RX10_TEMP545 = 0;


						final boolean RX10_TEMP546 = RX10_TEMP544 < RX10_TEMP545;

						if(RX10_TEMP546)
							{

							String RX10_TEMP547 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP547);

							}

						final int RX10_TEMP548 = Program.getPlaceFromDist1(RX10_TEMP542, RX10_TEMP544,myUniquePlacePoint);


						final int RX10_TEMP550 = 0;


						final boolean RX10_TEMP551 = RX10_TEMP548 != RX10_TEMP550;

						if(RX10_TEMP551)
							{

							String RX10_TEMP549 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP549);

							}

						final md RX10_TEMP552 = Program.getRefArrayValue1md(P, RX10_TEMP544,myUniquePlacePoint);


						final md X10_TEMP279 = RX10_TEMP552;


						final ParticleRefArray1 X10_TEMP280 = X10_TEMP279.one;


						final Dist1 RX10_TEMP553 = X10_TEMP280.distValue;


						final Region1 RX10_TEMP554 = RX10_TEMP553.dReg;


						final int RX10_TEMP555 = Program.searchPointInRegion1(RX10_TEMP554, k,myUniquePlacePoint);


						final int RX10_TEMP556 = 0;


						final boolean RX10_TEMP557 = RX10_TEMP555 < RX10_TEMP556;

						if(RX10_TEMP557)
							{

							String RX10_TEMP558 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP558);

							}

						final int RX10_TEMP559 = Program.getPlaceFromDist1(RX10_TEMP553, RX10_TEMP555,myUniquePlacePoint);


						final int RX10_TEMP561 = 0;


						final boolean RX10_TEMP562 = RX10_TEMP559 != RX10_TEMP561;

						if(RX10_TEMP562)
							{

							String RX10_TEMP560 = "Bad place access for array X10_TEMP280";

							throw new RuntimeException(RX10_TEMP560);

							}

						final Particle RX10_TEMP563 = Program.getRefArrayValue1Particle(X10_TEMP280, RX10_TEMP555,myUniquePlacePoint);


						final Particle X10_TEMP282 = RX10_TEMP563;


						final int X10_TEMP284 = 1;


						final Point1 RX10_TEMP564 = new Point1(X10_TEMP284,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP564.hashCode());


						final Dist1 RX10_TEMP565 = dataD.distValue;


						final Region1 RX10_TEMP566 = RX10_TEMP565.dReg;


						final int RX10_TEMP567 = Program.searchPointInRegion1(RX10_TEMP566, RX10_TEMP564,myUniquePlacePoint);


						final int RX10_TEMP568 = 0;


						final boolean RX10_TEMP569 = RX10_TEMP567 < RX10_TEMP568;

						if(RX10_TEMP569)
							{

							String RX10_TEMP570 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP570);

							}

						final int RX10_TEMP571 = Program.getPlaceFromDist1(RX10_TEMP565, RX10_TEMP567,myUniquePlacePoint);


						final int RX10_TEMP573 = 0;


						final boolean RX10_TEMP574 = RX10_TEMP571 != RX10_TEMP573;

						if(RX10_TEMP574)
							{

							String RX10_TEMP572 = "Bad place access for array dataD";

							throw new RuntimeException(RX10_TEMP572);

							}

						final double RX10_TEMP575 = Program.getRefArrayValue1double(dataD, RX10_TEMP567,myUniquePlacePoint);


						final double X10_TEMP287 = RX10_TEMP575;


						final double X10_TEMP288 = X10_TEMP287;

												if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP282.hashCode())){
						throw new RuntimeException("Object in wrong place");
						}						X10_TEMP282.yforce = (X10_TEMP288);

						final Dist1 RX10_TEMP576 = P.distValue;


						final Region1 RX10_TEMP577 = RX10_TEMP576.dReg;


						final int RX10_TEMP578 = Program.searchPointInRegion1(RX10_TEMP577, j,myUniquePlacePoint);


						final int RX10_TEMP579 = 0;


						final boolean RX10_TEMP580 = RX10_TEMP578 < RX10_TEMP579;

						if(RX10_TEMP580)
							{

							String RX10_TEMP581 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP581);

							}

						final int RX10_TEMP582 = Program.getPlaceFromDist1(RX10_TEMP576, RX10_TEMP578,myUniquePlacePoint);


						final int RX10_TEMP584 = 0;


						final boolean RX10_TEMP585 = RX10_TEMP582 != RX10_TEMP584;

						if(RX10_TEMP585)
							{

							String RX10_TEMP583 = "Bad place access for array P";

							throw new RuntimeException(RX10_TEMP583);

							}

						final md RX10_TEMP586 = Program.getRefArrayValue1md(P, RX10_TEMP578,myUniquePlacePoint);


						final md X10_TEMP290 = RX10_TEMP586;


						final ParticleRefArray1 X10_TEMP291 = X10_TEMP290.one;


						final Dist1 RX10_TEMP587 = X10_TEMP291.distValue;


						final Region1 RX10_TEMP588 = RX10_TEMP587.dReg;


						final int RX10_TEMP589 = Program.searchPointInRegion1(RX10_TEMP588, k,myUniquePlacePoint);


						final int RX10_TEMP590 = 0;


						final boolean RX10_TEMP591 = RX10_TEMP589 < RX10_TEMP590;

						if(RX10_TEMP591)
							{

							String RX10_TEMP592 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP592);

							}

						final int RX10_TEMP593 = Program.getPlaceFromDist1(RX10_TEMP587, RX10_TEMP589,myUniquePlacePoint);


						final int RX10_TEMP595 = 0;


						final boolean RX10_TEMP596 = RX10_TEMP593 != RX10_TEMP595;

						if(RX10_TEMP596)
							{

							String RX10_TEMP594 = "Bad place access for array X10_TEMP291";

							throw new RuntimeException(RX10_TEMP594);

							}

						final Particle RX10_TEMP597 = Program.getRefArrayValue1Particle(X10_TEMP291, RX10_TEMP589,myUniquePlacePoint);


						final Particle X10_TEMP293 = RX10_TEMP597;


						final int X10_TEMP295 = 2;


						final Point1 RX10_TEMP598 = new Point1(X10_TEMP295,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP598.hashCode());


						final Dist1 RX10_TEMP599 = dataD.distValue;


						final Region1 RX10_TEMP600 = RX10_TEMP599.dReg;


						final int RX10_TEMP601 = Program.searchPointInRegion1(RX10_TEMP600, RX10_TEMP598,myUniquePlacePoint);


						final int RX10_TEMP602 = 0;


						final boolean RX10_TEMP603 = RX10_TEMP601 < RX10_TEMP602;

						if(RX10_TEMP603)
							{

							String RX10_TEMP604 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP604);

							}

						final int RX10_TEMP605 = Program.getPlaceFromDist1(RX10_TEMP599, RX10_TEMP601,myUniquePlacePoint);


						final int RX10_TEMP607 = 0;


						final boolean RX10_TEMP608 = RX10_TEMP605 != RX10_TEMP607;

						if(RX10_TEMP608)
							{

							String RX10_TEMP606 = "Bad place access for array dataD";

							throw new RuntimeException(RX10_TEMP606);

							}

						final double RX10_TEMP609 = Program.getRefArrayValue1double(dataD, RX10_TEMP601,myUniquePlacePoint);


						final double X10_TEMP298 = RX10_TEMP609;


						final double X10_TEMP299 = X10_TEMP298;

												if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP293.hashCode())){
						throw new RuntimeException("Object in wrong place");
						}						X10_TEMP293.zforce = (X10_TEMP299);
						}

					final int X10_TEMP302 = 0;


					final int X10_TEMP303 = 0;


					final Region1 X10_TEMP304 = Program.createNewRegion1R(X10_TEMP302, X10_TEMP303,myUniquePlacePoint);


					final int X10_TEMP305 = 0;


					final Dist1 dI = Program.getPlaceDist1(X10_TEMP304, X10_TEMP305,myUniquePlacePoint);


					final Region1 RX10_TEMP610 = dI.dReg;


					final int RX10_TEMP611 = 0;


					final int RX10_TEMP612 = 1;


					int RX10_TEMP613 = Program.MAX_PLACES;


					RX10_TEMP613 = RX10_TEMP613 - RX10_TEMP612;


					final int  RX10_TEMP614 = RX10_TEMP613+1;


					final int RX10_TEMP615 = RX10_TEMP613+1;


					final intStub[] RX10_TEMP616 = new intStub[RX10_TEMP615];

					/*FINISH
*/						{
						for(int RX10_TEMP617=0; RX10_TEMP617 < RX10_TEMP614; RX10_TEMP617++)
							{

							final int RX10_TEMP618 = 0;


							final int RX10_TEMP619 = RX10_TEMP617;


							final int RX10_TEMP620 = RX10_TEMP619;


							final int RX10_TEMP621 = Program.getDistLocalCount1(dI, RX10_TEMP619,myUniquePlacePoint);


							final int RX10_TEMP622 = RX10_TEMP621 - RX10_TEMP612;

							//async(RX10_TEMP620)
								{

								final int RX10_TEMP623 = RX10_TEMP622+1;


								final int[] RX10_TEMP624 = new int[RX10_TEMP623];


								final intStub RX10_TEMP625 = new intStub(RX10_TEMP624,RX10_TEMP620);
								
Program.globalPointerHashMap.get(RX10_TEMP620).add(RX10_TEMP625.hashCode());

								//async(RX10_TEMP618)
									{
									RX10_TEMP616[RX10_TEMP617] = RX10_TEMP625;
									}
								}
							}
						}

					final intStub[] RX10_TEMP626 = (intStub[])(new intStub/*value*/[RX10_TEMP614]);
/*arrayInitBlock*/
for(int RX10_TEMP628= 0;RX10_TEMP628 <RX10_TEMP626.length ;RX10_TEMP628++ )						{

						final intStub RX10_TEMP627 = RX10_TEMP616[RX10_TEMP628];

						RX10_TEMP626[RX10_TEMP628] =RX10_TEMP627;
						}

;


					final intRefArray1 RX10_TEMP629 = new intRefArray1(dI, RX10_TEMP626,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP629.hashCode());


					final intRefArray1 dataI = RX10_TEMP629;

					/*FINISH
*/						{
						//async(tHere)
							{

							final double tvir = t.vir;


							final double tepot = t.epot;


							final int tinter = t.interactions;

							/*FINISH
*/								{
								//async(pHere)
									{

									final int X10_TEMP314 = 0;


									final double X10_TEMP317 = tvir;


									final Point1 RX10_TEMP630 = new Point1(X10_TEMP314,pHere);
									
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP630.hashCode());


									final Dist1 RX10_TEMP631 = dataD.distValue;


									final Region1 RX10_TEMP632 = RX10_TEMP631.dReg;


									final int RX10_TEMP633 = Program.searchPointInRegion1(RX10_TEMP632, RX10_TEMP630,pHere);


									final int RX10_TEMP634 = 0;


									final boolean RX10_TEMP635 = RX10_TEMP633 < RX10_TEMP634;

									if(RX10_TEMP635)
										{

										String RX10_TEMP636 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP636);

										}

									final int RX10_TEMP637 = Program.getPlaceFromDist1(RX10_TEMP631, RX10_TEMP633,pHere);


									final int RX10_TEMP639 = 0;


									final boolean RX10_TEMP640 = RX10_TEMP637 != RX10_TEMP639;

									if(RX10_TEMP640)
										{

										String RX10_TEMP638 = "Bad place access for array dataD";

										throw new RuntimeException(RX10_TEMP638);

										}
									Program.setRefArrayValue1double(dataD, RX10_TEMP633, X10_TEMP317,pHere);

									final int X10_TEMP319 = 1;


									final double X10_TEMP322 = tepot;


									final Point1 RX10_TEMP641 = new Point1(X10_TEMP319,pHere);
									
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP641.hashCode());


									final Dist1 RX10_TEMP642 = dataD.distValue;


									final Region1 RX10_TEMP643 = RX10_TEMP642.dReg;


									final int RX10_TEMP644 = Program.searchPointInRegion1(RX10_TEMP643, RX10_TEMP641,pHere);


									final int RX10_TEMP645 = 0;


									final boolean RX10_TEMP646 = RX10_TEMP644 < RX10_TEMP645;

									if(RX10_TEMP646)
										{

										String RX10_TEMP647 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP647);

										}

									final int RX10_TEMP648 = Program.getPlaceFromDist1(RX10_TEMP642, RX10_TEMP644,pHere);


									final int RX10_TEMP650 = 0;


									final boolean RX10_TEMP651 = RX10_TEMP648 != RX10_TEMP650;

									if(RX10_TEMP651)
										{

										String RX10_TEMP649 = "Bad place access for array dataD";

										throw new RuntimeException(RX10_TEMP649);

										}
									Program.setRefArrayValue1double(dataD, RX10_TEMP644, X10_TEMP322,pHere);

									final int X10_TEMP324 = 0;


									final int X10_TEMP327 = tinter;


									final Point1 RX10_TEMP652 = new Point1(X10_TEMP324,pHere);
									
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP652.hashCode());


									final Dist1 RX10_TEMP653 = dataI.distValue;


									final Region1 RX10_TEMP654 = RX10_TEMP653.dReg;


									final int RX10_TEMP655 = Program.searchPointInRegion1(RX10_TEMP654, RX10_TEMP652,pHere);


									final int RX10_TEMP656 = 0;


									final boolean RX10_TEMP657 = RX10_TEMP655 < RX10_TEMP656;

									if(RX10_TEMP657)
										{

										String RX10_TEMP658 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP658);

										}

									final int RX10_TEMP659 = Program.getPlaceFromDist1(RX10_TEMP653, RX10_TEMP655,pHere);


									final int RX10_TEMP661 = 0;


									final boolean RX10_TEMP662 = RX10_TEMP659 != RX10_TEMP661;

									if(RX10_TEMP662)
										{

										String RX10_TEMP660 = "Bad place access for array dataI";

										throw new RuntimeException(RX10_TEMP660);

										}
									Program.setRefArrayValue1int(dataI, RX10_TEMP655, X10_TEMP327,pHere);
									}
								}
							}
						}

					final Dist1 RX10_TEMP663 = P.distValue;


					final Region1 RX10_TEMP664 = RX10_TEMP663.dReg;


					final int RX10_TEMP665 = Program.searchPointInRegion1(RX10_TEMP664, j,myUniquePlacePoint);


					final int RX10_TEMP666 = 0;


					final boolean RX10_TEMP667 = RX10_TEMP665 < RX10_TEMP666;

					if(RX10_TEMP667)
						{

						String RX10_TEMP668 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP668);

						}

					final int RX10_TEMP669 = Program.getPlaceFromDist1(RX10_TEMP663, RX10_TEMP665,myUniquePlacePoint);


					final int RX10_TEMP671 = 0;


					final boolean RX10_TEMP672 = RX10_TEMP669 != RX10_TEMP671;

					if(RX10_TEMP672)
						{

						String RX10_TEMP670 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP670);

						}

					final md RX10_TEMP673 = Program.getRefArrayValue1md(P, RX10_TEMP665,myUniquePlacePoint);


					final md X10_TEMP329 = RX10_TEMP673;


					final int X10_TEMP331 = 0;


					final Point1 RX10_TEMP674 = new Point1(X10_TEMP331,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP674.hashCode());


					final Dist1 RX10_TEMP675 = dataD.distValue;


					final Region1 RX10_TEMP676 = RX10_TEMP675.dReg;


					final int RX10_TEMP677 = Program.searchPointInRegion1(RX10_TEMP676, RX10_TEMP674,myUniquePlacePoint);


					final int RX10_TEMP678 = 0;


					final boolean RX10_TEMP679 = RX10_TEMP677 < RX10_TEMP678;

					if(RX10_TEMP679)
						{

						String RX10_TEMP680 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP680);

						}

					final int RX10_TEMP681 = Program.getPlaceFromDist1(RX10_TEMP675, RX10_TEMP677,myUniquePlacePoint);


					final int RX10_TEMP683 = 0;


					final boolean RX10_TEMP684 = RX10_TEMP681 != RX10_TEMP683;

					if(RX10_TEMP684)
						{

						String RX10_TEMP682 = "Bad place access for array dataD";

						throw new RuntimeException(RX10_TEMP682);

						}

					final double RX10_TEMP685 = Program.getRefArrayValue1double(dataD, RX10_TEMP677,myUniquePlacePoint);


					final double X10_TEMP334 = RX10_TEMP685;


					final double X10_TEMP335 = X10_TEMP334;

										if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP329.hashCode())){
					throw new RuntimeException("Object in wrong place");
					}					X10_TEMP329.vir = (X10_TEMP335);

					final Dist1 RX10_TEMP686 = P.distValue;


					final Region1 RX10_TEMP687 = RX10_TEMP686.dReg;


					final int RX10_TEMP688 = Program.searchPointInRegion1(RX10_TEMP687, j,myUniquePlacePoint);


					final int RX10_TEMP689 = 0;


					final boolean RX10_TEMP690 = RX10_TEMP688 < RX10_TEMP689;

					if(RX10_TEMP690)
						{

						String RX10_TEMP691 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP691);

						}

					final int RX10_TEMP692 = Program.getPlaceFromDist1(RX10_TEMP686, RX10_TEMP688,myUniquePlacePoint);


					final int RX10_TEMP694 = 0;


					final boolean RX10_TEMP695 = RX10_TEMP692 != RX10_TEMP694;

					if(RX10_TEMP695)
						{

						String RX10_TEMP693 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP693);

						}

					final md RX10_TEMP696 = Program.getRefArrayValue1md(P, RX10_TEMP688,myUniquePlacePoint);


					final md X10_TEMP337 = RX10_TEMP696;


					final int X10_TEMP339 = 1;


					final Point1 RX10_TEMP697 = new Point1(X10_TEMP339,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP697.hashCode());


					final Dist1 RX10_TEMP698 = dataD.distValue;


					final Region1 RX10_TEMP699 = RX10_TEMP698.dReg;


					final int RX10_TEMP700 = Program.searchPointInRegion1(RX10_TEMP699, RX10_TEMP697,myUniquePlacePoint);


					final int RX10_TEMP701 = 0;


					final boolean RX10_TEMP702 = RX10_TEMP700 < RX10_TEMP701;

					if(RX10_TEMP702)
						{

						String RX10_TEMP703 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP703);

						}

					final int RX10_TEMP704 = Program.getPlaceFromDist1(RX10_TEMP698, RX10_TEMP700,myUniquePlacePoint);


					final int RX10_TEMP706 = 0;


					final boolean RX10_TEMP707 = RX10_TEMP704 != RX10_TEMP706;

					if(RX10_TEMP707)
						{

						String RX10_TEMP705 = "Bad place access for array dataD";

						throw new RuntimeException(RX10_TEMP705);

						}

					final double RX10_TEMP708 = Program.getRefArrayValue1double(dataD, RX10_TEMP700,myUniquePlacePoint);


					final double X10_TEMP342 = RX10_TEMP708;


					final double X10_TEMP343 = X10_TEMP342;

										if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP337.hashCode())){
					throw new RuntimeException("Object in wrong place");
					}					X10_TEMP337.epot = (X10_TEMP343);

					final Dist1 RX10_TEMP709 = P.distValue;


					final Region1 RX10_TEMP710 = RX10_TEMP709.dReg;


					final int RX10_TEMP711 = Program.searchPointInRegion1(RX10_TEMP710, j,myUniquePlacePoint);


					final int RX10_TEMP712 = 0;


					final boolean RX10_TEMP713 = RX10_TEMP711 < RX10_TEMP712;

					if(RX10_TEMP713)
						{

						String RX10_TEMP714 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP714);

						}

					final int RX10_TEMP715 = Program.getPlaceFromDist1(RX10_TEMP709, RX10_TEMP711,myUniquePlacePoint);


					final int RX10_TEMP717 = 0;


					final boolean RX10_TEMP718 = RX10_TEMP715 != RX10_TEMP717;

					if(RX10_TEMP718)
						{

						String RX10_TEMP716 = "Bad place access for array P";

						throw new RuntimeException(RX10_TEMP716);

						}

					final md RX10_TEMP719 = Program.getRefArrayValue1md(P, RX10_TEMP711,myUniquePlacePoint);


					final md X10_TEMP345 = RX10_TEMP719;


					final int X10_TEMP347 = 0;


					final Point1 RX10_TEMP720 = new Point1(X10_TEMP347,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP720.hashCode());


					final Dist1 RX10_TEMP721 = dataI.distValue;


					final Region1 RX10_TEMP722 = RX10_TEMP721.dReg;


					final int RX10_TEMP723 = Program.searchPointInRegion1(RX10_TEMP722, RX10_TEMP720,myUniquePlacePoint);


					final int RX10_TEMP724 = 0;


					final boolean RX10_TEMP725 = RX10_TEMP723 < RX10_TEMP724;

					if(RX10_TEMP725)
						{

						String RX10_TEMP726 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP726);

						}

					final int RX10_TEMP727 = Program.getPlaceFromDist1(RX10_TEMP721, RX10_TEMP723,myUniquePlacePoint);


					final int RX10_TEMP729 = 0;


					final boolean RX10_TEMP730 = RX10_TEMP727 != RX10_TEMP729;

					if(RX10_TEMP730)
						{

						String RX10_TEMP728 = "Bad place access for array dataI";

						throw new RuntimeException(RX10_TEMP728);

						}

					final int RX10_TEMP731 = Program.getRefArrayValue1int(dataI, RX10_TEMP723,myUniquePlacePoint);


					final int X10_TEMP350 = RX10_TEMP731;


					final int X10_TEMP351 = X10_TEMP350;

										if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP345.hashCode())){
					throw new RuntimeException("Object in wrong place");
					}					X10_TEMP345.interactions = (X10_TEMP351);
					}
				}
			}
		}
public static void Particle_domove ( final Particle X10_TEMP0, final double side, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.xcoord;


		final double X10_TEMP2 = X10_TEMP0.xvelocity;


		final double X10_TEMP3 = X10_TEMP1 + X10_TEMP2;


		final double X10_TEMP4 = X10_TEMP0.xforce;


		final double X10_TEMP7 = X10_TEMP3 + X10_TEMP4;


		final double X10_TEMP8 = X10_TEMP7;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xcoord = (X10_TEMP8);

		final double X10_TEMP9 = X10_TEMP0.ycoord;


		final double X10_TEMP10 = X10_TEMP0.yvelocity;


		final double X10_TEMP11 = X10_TEMP9 + X10_TEMP10;


		final double X10_TEMP12 = X10_TEMP0.yforce;


		final double X10_TEMP15 = X10_TEMP11 + X10_TEMP12;


		final double X10_TEMP16 = X10_TEMP15;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.ycoord = (X10_TEMP16);

		final double X10_TEMP17 = X10_TEMP0.zcoord;


		final double X10_TEMP18 = X10_TEMP0.zvelocity;


		final double X10_TEMP19 = X10_TEMP17 + X10_TEMP18;


		final double X10_TEMP20 = X10_TEMP0.zforce;


		final double X10_TEMP23 = X10_TEMP19 + X10_TEMP20;


		final double X10_TEMP24 = X10_TEMP23;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zcoord = (X10_TEMP24);

		final double X10_TEMP25 = X10_TEMP0.xcoord;


		final int X10_TEMP26 = 0;


		final boolean X10_TEMP28 = X10_TEMP25 < X10_TEMP26;

		if(X10_TEMP28)
			{

			final double X10_TEMP29 = X10_TEMP0.xcoord;


			final double X10_TEMP32 = X10_TEMP29 + side;


			final double X10_TEMP33 = X10_TEMP32;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.xcoord = (X10_TEMP33);
			}

		final double X10_TEMP34 = X10_TEMP0.xcoord;


		final boolean X10_TEMP36 = X10_TEMP34 > side;

		if(X10_TEMP36)
			{

			final double X10_TEMP37 = X10_TEMP0.xcoord;


			final double X10_TEMP40 = X10_TEMP37 - side;


			final double X10_TEMP41 = X10_TEMP40;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.xcoord = (X10_TEMP41);
			}

		final double X10_TEMP42 = X10_TEMP0.ycoord;


		final int X10_TEMP43 = 0;


		final boolean X10_TEMP45 = X10_TEMP42 < X10_TEMP43;

		if(X10_TEMP45)
			{

			final double X10_TEMP46 = X10_TEMP0.ycoord;


			final double X10_TEMP49 = X10_TEMP46 + side;


			final double X10_TEMP50 = X10_TEMP49;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ycoord = (X10_TEMP50);
			}

		final double X10_TEMP51 = X10_TEMP0.ycoord;


		final boolean X10_TEMP53 = X10_TEMP51 > side;

		if(X10_TEMP53)
			{

			final double X10_TEMP54 = X10_TEMP0.ycoord;


			final double X10_TEMP57 = X10_TEMP54 - side;


			final double X10_TEMP58 = X10_TEMP57;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.ycoord = (X10_TEMP58);
			}

		final double X10_TEMP59 = X10_TEMP0.zcoord;


		final int X10_TEMP60 = 0;


		final boolean X10_TEMP62 = X10_TEMP59 < X10_TEMP60;

		if(X10_TEMP62)
			{

			final double X10_TEMP63 = X10_TEMP0.zcoord;


			final double X10_TEMP66 = X10_TEMP63 + side;


			final double X10_TEMP67 = X10_TEMP66;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.zcoord = (X10_TEMP67);
			}

		final double X10_TEMP68 = X10_TEMP0.zcoord;


		final boolean X10_TEMP70 = X10_TEMP68 > side;

		if(X10_TEMP70)
			{

			final double X10_TEMP71 = X10_TEMP0.zcoord;


			final double X10_TEMP74 = X10_TEMP71 - side;


			final double X10_TEMP75 = X10_TEMP74;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.zcoord = (X10_TEMP75);
			}

		final double X10_TEMP76 = X10_TEMP0.xvelocity;


		final double X10_TEMP77 = X10_TEMP0.xforce;


		final double X10_TEMP80 = X10_TEMP76 + X10_TEMP77;


		final double X10_TEMP81 = X10_TEMP80;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xvelocity = (X10_TEMP81);

		final double X10_TEMP82 = X10_TEMP0.yvelocity;


		final double X10_TEMP83 = X10_TEMP0.yforce;


		final double X10_TEMP86 = X10_TEMP82 + X10_TEMP83;


		final double X10_TEMP87 = X10_TEMP86;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yvelocity = (X10_TEMP87);

		final double X10_TEMP88 = X10_TEMP0.zvelocity;


		final double X10_TEMP89 = X10_TEMP0.zforce;


		final double X10_TEMP92 = X10_TEMP88 + X10_TEMP89;


		final double X10_TEMP93 = X10_TEMP92;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zvelocity = (X10_TEMP93);

		final double X10_TEMP96 = 0.0;


		final double X10_TEMP97 = X10_TEMP96;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xforce = (X10_TEMP97);

		final double X10_TEMP100 = 0.0;


		final double X10_TEMP101 = X10_TEMP100;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yforce = (X10_TEMP101);

		final double X10_TEMP104 = 0.0;


		final double X10_TEMP105 = X10_TEMP104;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zforce = (X10_TEMP105);
		}
public static void Particle_force ( final Particle X10_TEMP0, final double side, final double rcoff, final int mdsize, final int x, final md md1, int myUniquePlacePoint)
		{

		double sideh = 0.0;


		double rcoffs = 0.0;


		double xx = 0.0;


		double yy = 0.0;


		double zz = 0.0;


		double xi = 0.0;


		double yi = 0.0;


		double zi = 0.0;


		double fxi = 0.0;


		double fyi = 0.0;


		double fzi = 0.0;


		double rd = 0.0;


		double rrd = 0.0;


		double rrd2 = 0.0;


		double rrd3 = 0.0;


		double rrd4 = 0.0;


		double rrd6 = 0.0;


		double rrd7 = 0.0;


		double r148 = 0.0;


		double forcex = 0.0;


		double forcey = 0.0;


		double forcez = 0.0;


		final double X10_TEMP23 = 0.5;


		final double X10_TEMP25 = X10_TEMP23 * side;


		sideh = X10_TEMP25;


		final double X10_TEMP27 = rcoff * rcoff;


		rcoffs = X10_TEMP27;


		final double X10_TEMP29 = X10_TEMP0.xcoord;


		xi = X10_TEMP29;


		final double X10_TEMP31 = X10_TEMP0.ycoord;


		yi = X10_TEMP31;


		final double X10_TEMP33 = X10_TEMP0.zcoord;


		zi = X10_TEMP33;


		final double X10_TEMP35 = 0.0;


		fxi = X10_TEMP35;


		final double X10_TEMP37 = 0.0;


		fyi = X10_TEMP37;


		final double X10_TEMP39 = 0.0;


		fzi = X10_TEMP39;


		final int X10_TEMP40 = 1;


		final int X10_TEMP44 = x + X10_TEMP40;


		final int X10_TEMP42 = 1;


		final int X10_TEMP45 = mdsize - X10_TEMP42;


		final Region1 X10_TEMP47 = Program.createNewRegion1R(X10_TEMP44, X10_TEMP45,myUniquePlacePoint);


		final int RX10_TEMP3 = 1;


		int RX10_TEMP1 = X10_TEMP47.regSize;


		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


		final int  RX10_TEMP2 = RX10_TEMP1+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
			{

			final int RX10_TEMP4 = RX10_TEMP0;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP47, RX10_TEMP4,myUniquePlacePoint);


			final ParticleRefArray1 X10_TEMP48 = md1.one;


			final Dist1 RX10_TEMP5 = X10_TEMP48.distValue;


			final Region1 RX10_TEMP6 = RX10_TEMP5.dReg;


			final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, i,myUniquePlacePoint);


			final int RX10_TEMP8 = 0;


			final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

			if(RX10_TEMP9)
				{

				String RX10_TEMP10 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP10);

				}

			final int RX10_TEMP11 = Program.getPlaceFromDist1(RX10_TEMP5, RX10_TEMP7,myUniquePlacePoint);


			final int RX10_TEMP13 = 0;


			final boolean RX10_TEMP14 = RX10_TEMP11 != RX10_TEMP13;

			if(RX10_TEMP14)
				{

				String RX10_TEMP12 = "Bad place access for array X10_TEMP48";

				throw new RuntimeException(RX10_TEMP12);

				}

			final Particle RX10_TEMP15 = Program.getRefArrayValue1Particle(X10_TEMP48, RX10_TEMP7,myUniquePlacePoint);


			final Particle X10_TEMP50 = RX10_TEMP15;


			final double X10_TEMP51 = X10_TEMP50.xcoord;


			final double X10_TEMP53 = xi - X10_TEMP51;


			xx = X10_TEMP53;


			final ParticleRefArray1 X10_TEMP54 = md1.one;


			final Dist1 RX10_TEMP16 = X10_TEMP54.distValue;


			final Region1 RX10_TEMP17 = RX10_TEMP16.dReg;


			final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, i,myUniquePlacePoint);


			final int RX10_TEMP19 = 0;


			final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;

			if(RX10_TEMP20)
				{

				String RX10_TEMP21 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP21);

				}

			final int RX10_TEMP22 = Program.getPlaceFromDist1(RX10_TEMP16, RX10_TEMP18,myUniquePlacePoint);


			final int RX10_TEMP24 = 0;


			final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;

			if(RX10_TEMP25)
				{

				String RX10_TEMP23 = "Bad place access for array X10_TEMP54";

				throw new RuntimeException(RX10_TEMP23);

				}

			final Particle RX10_TEMP26 = Program.getRefArrayValue1Particle(X10_TEMP54, RX10_TEMP18,myUniquePlacePoint);


			final Particle X10_TEMP56 = RX10_TEMP26;


			final double X10_TEMP57 = X10_TEMP56.ycoord;


			final double X10_TEMP59 = yi - X10_TEMP57;


			yy = X10_TEMP59;


			final ParticleRefArray1 X10_TEMP60 = md1.one;


			final Dist1 RX10_TEMP27 = X10_TEMP60.distValue;


			final Region1 RX10_TEMP28 = RX10_TEMP27.dReg;


			final int RX10_TEMP29 = Program.searchPointInRegion1(RX10_TEMP28, i,myUniquePlacePoint);


			final int RX10_TEMP30 = 0;


			final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;

			if(RX10_TEMP31)
				{

				String RX10_TEMP32 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP32);

				}

			final int RX10_TEMP33 = Program.getPlaceFromDist1(RX10_TEMP27, RX10_TEMP29,myUniquePlacePoint);


			final int RX10_TEMP35 = 0;


			final boolean RX10_TEMP36 = RX10_TEMP33 != RX10_TEMP35;

			if(RX10_TEMP36)
				{

				String RX10_TEMP34 = "Bad place access for array X10_TEMP60";

				throw new RuntimeException(RX10_TEMP34);

				}

			final Particle RX10_TEMP37 = Program.getRefArrayValue1Particle(X10_TEMP60, RX10_TEMP29,myUniquePlacePoint);


			final Particle X10_TEMP62 = RX10_TEMP37;


			final double X10_TEMP63 = X10_TEMP62.zcoord;


			final double X10_TEMP65 = zi - X10_TEMP63;


			zz = X10_TEMP65;


			final int X10_TEMP66 = 0;


			final double X10_TEMP68 = X10_TEMP66 - sideh;


			final boolean X10_TEMP70 = xx < X10_TEMP68;

			if(X10_TEMP70)
				{

				final double X10_TEMP72 = xx + side;


				xx = X10_TEMP72;

				}

			final double X10_TEMP74 = sideh;


			final boolean X10_TEMP76 = xx > X10_TEMP74;

			if(X10_TEMP76)
				{

				final double X10_TEMP78 = xx - side;


				xx = X10_TEMP78;

				}

			final int X10_TEMP79 = 0;


			final double X10_TEMP81 = X10_TEMP79 - sideh;


			final boolean X10_TEMP83 = yy < X10_TEMP81;

			if(X10_TEMP83)
				{

				final double X10_TEMP85 = yy + side;


				yy = X10_TEMP85;

				}

			final double X10_TEMP87 = sideh;


			final boolean X10_TEMP89 = yy > X10_TEMP87;

			if(X10_TEMP89)
				{

				final double X10_TEMP91 = yy - side;


				yy = X10_TEMP91;

				}

			final int X10_TEMP92 = 0;


			final double X10_TEMP94 = X10_TEMP92 - sideh;


			final boolean X10_TEMP96 = zz < X10_TEMP94;

			if(X10_TEMP96)
				{

				final double X10_TEMP98 = zz + side;


				zz = X10_TEMP98;

				}

			final double X10_TEMP100 = sideh;


			final boolean X10_TEMP102 = zz > X10_TEMP100;

			if(X10_TEMP102)
				{

				final double X10_TEMP104 = zz - side;


				zz = X10_TEMP104;

				}

			final double X10_TEMP105 = xx * xx;


			final double X10_TEMP106 = yy * yy;


			final double X10_TEMP107 = X10_TEMP105 + X10_TEMP106;


			final double X10_TEMP108 = zz * zz;


			final double X10_TEMP110 = X10_TEMP107 + X10_TEMP108;


			rd = X10_TEMP110;


			final boolean X10_TEMP112 = rd <= rcoffs;

			if(X10_TEMP112)
				{

				final double X10_TEMP113 = 1.0;


				final double X10_TEMP115 = X10_TEMP113 / rd;


				rrd = X10_TEMP115;


				final double X10_TEMP117 = rrd * rrd;


				rrd2 = X10_TEMP117;


				final double X10_TEMP119 = rrd2 * rrd;


				rrd3 = X10_TEMP119;


				final double X10_TEMP121 = rrd2 * rrd2;


				rrd4 = X10_TEMP121;


				final double X10_TEMP123 = rrd2 * rrd4;


				rrd6 = X10_TEMP123;


				final double X10_TEMP125 = rrd6 * rrd;


				rrd7 = X10_TEMP125;


				final double X10_TEMP128 = md1.epot;


				final double X10_TEMP127 = rrd6 - rrd3;


				final double X10_TEMP131 = X10_TEMP128 + X10_TEMP127;


				final double X10_TEMP132 = X10_TEMP131;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(md1.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				md1.epot = (X10_TEMP132);

				final double X10_TEMP133 = 0.5;


				final double X10_TEMP134 = X10_TEMP133 * rrd4;


				final double X10_TEMP136 = rrd7 - X10_TEMP134;


				r148 = X10_TEMP136;


				final double X10_TEMP137 = md1.vir;


				final double X10_TEMP138 = rd * r148;


				final double X10_TEMP141 = X10_TEMP137 - X10_TEMP138;


				final double X10_TEMP142 = X10_TEMP141;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(md1.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				md1.vir = (X10_TEMP142);

				final double X10_TEMP144 = xx * r148;


				forcex = X10_TEMP144;


				final double X10_TEMP146 = fxi + forcex;


				fxi = X10_TEMP146;


				final ParticleRefArray1 X10_TEMP147 = md1.one;


				final Dist1 RX10_TEMP38 = X10_TEMP147.distValue;


				final Region1 RX10_TEMP39 = RX10_TEMP38.dReg;


				final int RX10_TEMP40 = Program.searchPointInRegion1(RX10_TEMP39, i,myUniquePlacePoint);


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

					String RX10_TEMP45 = "Bad place access for array X10_TEMP147";

					throw new RuntimeException(RX10_TEMP45);

					}

				final Particle RX10_TEMP48 = Program.getRefArrayValue1Particle(X10_TEMP147, RX10_TEMP40,myUniquePlacePoint);


				final Particle X10_TEMP149 = RX10_TEMP48;


				final ParticleRefArray1 X10_TEMP150 = md1.one;


				final Dist1 RX10_TEMP49 = X10_TEMP150.distValue;


				final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;


				final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50, i,myUniquePlacePoint);


				final int RX10_TEMP52 = 0;


				final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;

				if(RX10_TEMP53)
					{

					String RX10_TEMP54 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP54);

					}

				final int RX10_TEMP55 = Program.getPlaceFromDist1(RX10_TEMP49, RX10_TEMP51,myUniquePlacePoint);


				final int RX10_TEMP57 = 0;


				final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;

				if(RX10_TEMP58)
					{

					String RX10_TEMP56 = "Bad place access for array X10_TEMP150";

					throw new RuntimeException(RX10_TEMP56);

					}

				final Particle RX10_TEMP59 = Program.getRefArrayValue1Particle(X10_TEMP150, RX10_TEMP51,myUniquePlacePoint);


				final Particle X10_TEMP152 = RX10_TEMP59;


				final double X10_TEMP153 = X10_TEMP152.xforce;


				final double X10_TEMP156 = X10_TEMP153 - forcex;


				final double X10_TEMP157 = X10_TEMP156;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP149.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP149.xforce = (X10_TEMP157);

				final double X10_TEMP159 = yy * r148;


				forcey = X10_TEMP159;


				final double X10_TEMP161 = fyi + forcey;


				fyi = X10_TEMP161;


				final ParticleRefArray1 X10_TEMP162 = md1.one;


				final Dist1 RX10_TEMP60 = X10_TEMP162.distValue;


				final Region1 RX10_TEMP61 = RX10_TEMP60.dReg;


				final int RX10_TEMP62 = Program.searchPointInRegion1(RX10_TEMP61, i,myUniquePlacePoint);


				final int RX10_TEMP63 = 0;


				final boolean RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63;

				if(RX10_TEMP64)
					{

					String RX10_TEMP65 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP65);

					}

				final int RX10_TEMP66 = Program.getPlaceFromDist1(RX10_TEMP60, RX10_TEMP62,myUniquePlacePoint);


				final int RX10_TEMP68 = 0;


				final boolean RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68;

				if(RX10_TEMP69)
					{

					String RX10_TEMP67 = "Bad place access for array X10_TEMP162";

					throw new RuntimeException(RX10_TEMP67);

					}

				final Particle RX10_TEMP70 = Program.getRefArrayValue1Particle(X10_TEMP162, RX10_TEMP62,myUniquePlacePoint);


				final Particle X10_TEMP164 = RX10_TEMP70;


				final ParticleRefArray1 X10_TEMP165 = md1.one;


				final Dist1 RX10_TEMP71 = X10_TEMP165.distValue;


				final Region1 RX10_TEMP72 = RX10_TEMP71.dReg;


				final int RX10_TEMP73 = Program.searchPointInRegion1(RX10_TEMP72, i,myUniquePlacePoint);


				final int RX10_TEMP74 = 0;


				final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74;

				if(RX10_TEMP75)
					{

					String RX10_TEMP76 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP76);

					}

				final int RX10_TEMP77 = Program.getPlaceFromDist1(RX10_TEMP71, RX10_TEMP73,myUniquePlacePoint);


				final int RX10_TEMP79 = 0;


				final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79;

				if(RX10_TEMP80)
					{

					String RX10_TEMP78 = "Bad place access for array X10_TEMP165";

					throw new RuntimeException(RX10_TEMP78);

					}

				final Particle RX10_TEMP81 = Program.getRefArrayValue1Particle(X10_TEMP165, RX10_TEMP73,myUniquePlacePoint);


				final Particle X10_TEMP167 = RX10_TEMP81;


				final double X10_TEMP168 = X10_TEMP167.yforce;


				final double X10_TEMP171 = X10_TEMP168 - forcey;


				final double X10_TEMP172 = X10_TEMP171;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP164.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP164.yforce = (X10_TEMP172);

				final double X10_TEMP174 = zz * r148;


				forcez = X10_TEMP174;


				final double X10_TEMP176 = fzi + forcez;


				fzi = X10_TEMP176;


				final ParticleRefArray1 X10_TEMP177 = md1.one;


				final Dist1 RX10_TEMP82 = X10_TEMP177.distValue;


				final Region1 RX10_TEMP83 = RX10_TEMP82.dReg;


				final int RX10_TEMP84 = Program.searchPointInRegion1(RX10_TEMP83, i,myUniquePlacePoint);


				final int RX10_TEMP85 = 0;


				final boolean RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85;

				if(RX10_TEMP86)
					{

					String RX10_TEMP87 = "Array access index out of bounds";

					throw new RuntimeException(RX10_TEMP87);

					}

				final int RX10_TEMP88 = Program.getPlaceFromDist1(RX10_TEMP82, RX10_TEMP84,myUniquePlacePoint);


				final int RX10_TEMP90 = 0;


				final boolean RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90;

				if(RX10_TEMP91)
					{

					String RX10_TEMP89 = "Bad place access for array X10_TEMP177";

					throw new RuntimeException(RX10_TEMP89);

					}

				final Particle RX10_TEMP92 = Program.getRefArrayValue1Particle(X10_TEMP177, RX10_TEMP84,myUniquePlacePoint);


				final Particle X10_TEMP179 = RX10_TEMP92;


				final ParticleRefArray1 X10_TEMP180 = md1.one;


				final Dist1 RX10_TEMP93 = X10_TEMP180.distValue;


				final Region1 RX10_TEMP94 = RX10_TEMP93.dReg;


				final int RX10_TEMP95 = Program.searchPointInRegion1(RX10_TEMP94, i,myUniquePlacePoint);


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

					String RX10_TEMP100 = "Bad place access for array X10_TEMP180";

					throw new RuntimeException(RX10_TEMP100);

					}

				final Particle RX10_TEMP103 = Program.getRefArrayValue1Particle(X10_TEMP180, RX10_TEMP95,myUniquePlacePoint);


				final Particle X10_TEMP182 = RX10_TEMP103;


				final double X10_TEMP183 = X10_TEMP182.zforce;


				final double X10_TEMP186 = X10_TEMP183 - forcez;


				final double X10_TEMP187 = X10_TEMP186;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP179.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				X10_TEMP179.zforce = (X10_TEMP187);

				final int X10_TEMP188 = md1.interactions;


				final int X10_TEMP189 = 1;


				final int X10_TEMP190 = md1.interactions;


				final int X10_TEMP191 = X10_TEMP190 + X10_TEMP189;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(md1.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				md1.interactions = (X10_TEMP191);
				}
			}

		final double X10_TEMP192 = X10_TEMP0.xforce;


		final double X10_TEMP195 = X10_TEMP192 + fxi;


		final double X10_TEMP196 = X10_TEMP195;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xforce = (X10_TEMP196);

		final double X10_TEMP197 = X10_TEMP0.yforce;


		final double X10_TEMP200 = X10_TEMP197 + fyi;


		final double X10_TEMP201 = X10_TEMP200;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yforce = (X10_TEMP201);

		final double X10_TEMP202 = X10_TEMP0.zforce;


		final double X10_TEMP205 = X10_TEMP202 + fzi;


		final double X10_TEMP206 = X10_TEMP205;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zforce = (X10_TEMP206);
		}
public static double Particle_mkekin ( final Particle X10_TEMP0, final double hsq2, int myUniquePlacePoint)
		{

		double sumt = 0.0;


		final double X10_TEMP2 = X10_TEMP0.xforce;


		final double X10_TEMP5 = X10_TEMP2 * hsq2;


		final double X10_TEMP6 = X10_TEMP5;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xforce = (X10_TEMP6);

		final double X10_TEMP7 = X10_TEMP0.yforce;


		final double X10_TEMP10 = X10_TEMP7 * hsq2;


		final double X10_TEMP11 = X10_TEMP10;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yforce = (X10_TEMP11);

		final double X10_TEMP12 = X10_TEMP0.zforce;


		final double X10_TEMP15 = X10_TEMP12 * hsq2;


		final double X10_TEMP16 = X10_TEMP15;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zforce = (X10_TEMP16);

		final double X10_TEMP17 = X10_TEMP0.xvelocity;


		final double X10_TEMP18 = X10_TEMP0.xforce;


		final double X10_TEMP21 = X10_TEMP17 + X10_TEMP18;


		final double X10_TEMP22 = X10_TEMP21;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xvelocity = (X10_TEMP22);

		final double X10_TEMP23 = X10_TEMP0.yvelocity;


		final double X10_TEMP24 = X10_TEMP0.yforce;


		final double X10_TEMP27 = X10_TEMP23 + X10_TEMP24;


		final double X10_TEMP28 = X10_TEMP27;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yvelocity = (X10_TEMP28);

		final double X10_TEMP29 = X10_TEMP0.zvelocity;


		final double X10_TEMP30 = X10_TEMP0.zforce;


		final double X10_TEMP33 = X10_TEMP29 + X10_TEMP30;


		final double X10_TEMP34 = X10_TEMP33;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zvelocity = (X10_TEMP34);

		final double X10_TEMP35 = X10_TEMP0.xvelocity;


		final double X10_TEMP36 = X10_TEMP0.xvelocity;


		final double X10_TEMP38 = X10_TEMP35 * X10_TEMP36;


		final double X10_TEMP39 = X10_TEMP0.yvelocity;


		final double X10_TEMP40 = X10_TEMP0.yvelocity;


		final double X10_TEMP42 = X10_TEMP39 * X10_TEMP40;


		final double X10_TEMP47 = X10_TEMP38 + X10_TEMP42;


		final double X10_TEMP43 = X10_TEMP0.zvelocity;


		final double X10_TEMP44 = X10_TEMP0.zvelocity;


		final double X10_TEMP46 = X10_TEMP43 * X10_TEMP44;


		final double X10_TEMP49 = X10_TEMP47 + X10_TEMP46;


		sumt = X10_TEMP49;

		return sumt;
		}
public static double Particle_velavg ( final Particle X10_TEMP0, final double vaverh, final double h, final md md1, int myUniquePlacePoint)
		{

		double velt = 0.0;


		double sq = 0.0;


		final double X10_TEMP3 = X10_TEMP0.xvelocity;


		final double X10_TEMP4 = X10_TEMP0.xvelocity;


		final double X10_TEMP7 = X10_TEMP3 * X10_TEMP4;


		final double X10_TEMP5 = X10_TEMP0.yvelocity;


		final double X10_TEMP6 = X10_TEMP0.yvelocity;


		final double X10_TEMP8 = X10_TEMP5 * X10_TEMP6;


		final double X10_TEMP11 = X10_TEMP7 + X10_TEMP8;


		final double X10_TEMP9 = X10_TEMP0.zvelocity;


		final double X10_TEMP10 = X10_TEMP0.zvelocity;


		final double X10_TEMP12 = X10_TEMP9 * X10_TEMP10;


		final double X10_TEMP14 = X10_TEMP11 + X10_TEMP12;


		final double X10_TEMP16 = Math.sqrt(X10_TEMP14);


		sq = X10_TEMP16;


		final boolean X10_TEMP18 = sq > vaverh;

		if(X10_TEMP18)
			{

			final double X10_TEMP19 = md1.count;


			final double X10_TEMP20 = 1.0;


			final double X10_TEMP23 = X10_TEMP19 + X10_TEMP20;


			final double X10_TEMP24 = X10_TEMP23;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(md1.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			md1.count = (X10_TEMP24);
			}

		velt = sq;

		return velt;
		}
public static void Particle_dscal ( final Particle X10_TEMP0, final double sc, final int incx, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.xvelocity;


		final double X10_TEMP4 = X10_TEMP1 * sc;


		final double X10_TEMP5 = X10_TEMP4;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.xvelocity = (X10_TEMP5);

		final double X10_TEMP6 = X10_TEMP0.yvelocity;


		final double X10_TEMP9 = X10_TEMP6 * sc;


		final double X10_TEMP10 = X10_TEMP9;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.yvelocity = (X10_TEMP10);

		final double X10_TEMP11 = X10_TEMP0.zvelocity;


		final double X10_TEMP14 = X10_TEMP11 * sc;


		final double X10_TEMP15 = X10_TEMP14;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.zvelocity = (X10_TEMP15);
		}
public static double Random_update ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		double rand = 0.0;


		double scale = 4.656612875e-10;


		int is1 = 0;


		int is2 = 0;


		int iss2 = 0;


		int imult = 16807;


		int imod = 2147483647;


		final int X10_TEMP8 = X10_TEMP0.iseed;


		final int X10_TEMP9 = 0;


		final boolean X10_TEMP11 = X10_TEMP8 <= X10_TEMP9;

		if(X10_TEMP11)
			{

			final int X10_TEMP14 = 1;


			final int X10_TEMP15 = X10_TEMP14;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.iseed = (X10_TEMP15);
			}

		final int X10_TEMP16 = X10_TEMP0.iseed;


		final int X10_TEMP17 = 32768;


		final int X10_TEMP19 = X10_TEMP16 % X10_TEMP17;


		is2 = X10_TEMP19;


		final int X10_TEMP20 = X10_TEMP0.iseed;


		final int X10_TEMP22 = X10_TEMP20 - is2;


		final int X10_TEMP23 = 32768;


		final int X10_TEMP25 = X10_TEMP22 / X10_TEMP23;


		is1 = X10_TEMP25;


		final int X10_TEMP27 = is2 * imult;


		iss2 = X10_TEMP27;


		final int X10_TEMP28 = 32768;


		final int X10_TEMP30 = iss2 % X10_TEMP28;


		is2 = X10_TEMP30;


		final int X10_TEMP34 = is1 * imult;


		final int X10_TEMP32 = iss2 - is2;


		final int X10_TEMP33 = 32768;


		final int X10_TEMP35 = X10_TEMP32 / X10_TEMP33;


		final int X10_TEMP37 = X10_TEMP34 + X10_TEMP35;


		final int X10_TEMP39 = 65536;


		final int X10_TEMP41 = X10_TEMP37 % X10_TEMP39;


		is1 = X10_TEMP41;


		final int X10_TEMP42 = 32768;


		final int X10_TEMP43 = is1 * X10_TEMP42;


		final int X10_TEMP45 = X10_TEMP43 + is2;


		final int X10_TEMP48 = X10_TEMP45 % imod;


		final int X10_TEMP49 = X10_TEMP48;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.iseed = (X10_TEMP49);

		final int X10_TEMP50 = X10_TEMP0.iseed;


		final double X10_TEMP52 = scale * X10_TEMP50;


		rand = X10_TEMP52;

		return rand;
		}
public static double Random_seed ( final Random X10_TEMP0, int myUniquePlacePoint)
		{

		double s = 0.0;


		double u1 = 0.0;


		double u2 = 0.0;


		double r = 0.0;


		final double X10_TEMP6 = 1.0;


		s = X10_TEMP6;


		boolean X10_TEMP7 = false;

		do 			{

			final double X10_TEMP9 = Program.Random_update(X10_TEMP0,myUniquePlacePoint);


			u1 = X10_TEMP9;


			final double X10_TEMP11 = Program.Random_update(X10_TEMP0,myUniquePlacePoint);


			u2 = X10_TEMP11;


			final double X10_TEMP12 = 2.0;


			final double X10_TEMP13 = X10_TEMP12 * u1;


			final double X10_TEMP14 = 1.0;


			final double X10_TEMP17 = X10_TEMP13 - X10_TEMP14;


			final double X10_TEMP18 = X10_TEMP17;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.v1 = (X10_TEMP18);

			final double X10_TEMP19 = 2.0;


			final double X10_TEMP20 = X10_TEMP19 * u2;


			final double X10_TEMP21 = 1.0;


			final double X10_TEMP24 = X10_TEMP20 - X10_TEMP21;


			final double X10_TEMP25 = X10_TEMP24;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.v2 = (X10_TEMP25);

			final double X10_TEMP26 = X10_TEMP0.v1;


			final double X10_TEMP27 = X10_TEMP0.v1;


			final double X10_TEMP30 = X10_TEMP26 * X10_TEMP27;


			final double X10_TEMP28 = X10_TEMP0.v2;


			final double X10_TEMP29 = X10_TEMP0.v2;


			final double X10_TEMP31 = X10_TEMP28 * X10_TEMP29;


			final double X10_TEMP33 = X10_TEMP30 + X10_TEMP31;


			s = X10_TEMP33;


			final double X10_TEMP34 = 1.0;


			X10_TEMP7 = s >= X10_TEMP34;

			}
		
 while(X10_TEMP7);
		final double X10_TEMP36 = 2.0;


		final int X10_TEMP37 = 0;


		final double X10_TEMP39 = X10_TEMP37 - X10_TEMP36;


		final double X10_TEMP40 = Math.log(s);


		final double X10_TEMP41 = X10_TEMP39 * X10_TEMP40;


		final double X10_TEMP43 = X10_TEMP41 / s;


		final double X10_TEMP45 = Math.sqrt(X10_TEMP43);


		r = X10_TEMP45;

		return r;
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
public static void setRefArrayValue1Particle ( final ParticleRefArray1 array, final int index, final Particle val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final ParticleStub[] contents = array.contents;


		final ParticleStub indexStub = contents[placeIndex];


		final Particle[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
		}
public static int getPlaceFromDist1 ( final Dist1 dn, final int index, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int retPlace = placeArray[index];

		return retPlace;
		}
public static Point4 regionOrdinalPoint4 ( final Region4 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point4[] pointArray = reg.pointArray;


		final Point4 pt = pointArray[ordl];

		return pt;
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
public static Particle getRefArrayValue1Particle ( final ParticleRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final ParticleStub[] contents = array.contents;


		final ParticleStub indexStub = contents[placeIndex];


		final Particle[] localArray = indexStub.localArray;


		final Particle returnValue = localArray[localIndex];

		return returnValue;
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
public static md getRefArrayValue1md ( final mdRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final mdStub[] contents = array.contents;


		final mdStub indexStub = contents[placeIndex];


		final md[] localArray = indexStub.localArray;


		final md returnValue = localArray[localIndex];

		return returnValue;
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
public static Region4 createNewRegion4RRRR ( final int v1_0, final int v1_1, final int v2_0, final int v2_1, final int v3_0, final int v3_1, final int v4_0, final int v4_1, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		boolean regType = true;


		final boolean tempBool1 = true;


		final boolean tempBool2 = true;


		final boolean tempBool3 = true;


		final boolean tempBool4 = true;


		regType = regType && tempBool1;


		regType = regType && tempBool2;


		regType = regType && tempBool3;


		regType = regType && tempBool4;


		final int l1 = v1_1 - v1_0;


		final int dim1 = l1 + one;


		final int l2 = v2_1 - v2_0;


		final int dim2 = l2 + one;


		final int l3 = v3_1 - v3_0;


		final int dim3 = l3 + one;


		final int l4 = v4_1 - v4_0;


		final int dim4 = l4 + one;


		final int stride4 = 1;


		final int stride3 = stride4 * dim4;


		final int stride2 = stride3 * dim3;


		final int stride1 = stride2 * dim2;


		final int stride0 = stride1 * dim1;


		final int rSize = stride0 - one;


		final int  regArr = rSize+1;


		final Point4[] ptArray = (Point4[])(new Point4/*value*/[regArr]);
/*arrayInitBlock*/
for(int pt= 0;pt <ptArray.length ;pt++ )			{

			final int p = pt;


			int f1 = p / stride1;


			f1 = f1 % dim1;


			f1 = f1 + v1_0;


			int f2 = p / stride2;


			f2 = f2 % dim2;


			f2 = f2 + v2_0;


			int f3 = p / stride3;


			f3 = f3 % dim3;


			f3 = f3 + v3_0;


			int f4 = p / stride4;


			f4 = f4 % dim4;


			f4 = f4 + v4_0;


			final Point4 retPoint = new Point4(f1, f2, f3, f4,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region4 retRegRegular = new Region4(ptArray, v1_0, dim1, v2_0, dim2, v3_0, dim3, v4_0, dim4,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region4 retReg = new Region4(ptArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retReg.hashCode());

		return retReg;
		}

}
	class md   {
 
	public ParticleRefArray1 one;
	public double epot;
	public double vir;
	public int interactions;
	public double count;
	public int mdsize;
	public double l;
	public double rcoff;
	public double rcoffs;
	public double side;
	public double sideh;
	public double hsq;
	public double hsq2;
	public double a;
	public double tscale;
	public double sc;
	public double ekin;
	public double ek;
	public double vaver;
	public double vaverh;
	public double etot;
	public double temp;
	public double pres;
	public double rp;
	public int npartm;
	public int rnk;
	public int nprocess;



}
	class Particle   {
 
	public double xcoord;
	public double ycoord;
	public double zcoord;
	public double xvelocity;
	public double yvelocity;
	public double zvelocity;
	public double xforce;
	public double yforce;
	public double zforce;


	public Particle ( final double xcoord0, final double ycoord0, final double zcoord0, final double xvelocity0, final double yvelocity0, final double zvelocity0, final double xforce0, final double yforce0, final double zforce0, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		xcoord = xcoord0;


		ycoord = ycoord0;


		zcoord = zcoord0;


		xvelocity = xvelocity0;


		yvelocity = yvelocity0;


		zvelocity = zvelocity0;


		xforce = xforce0;


		yforce = yforce0;


		zforce = zforce0;

		}



}
	class Random   {
 
	public int iseed;
	public double v1;
	public double v2;


	public Random ( final int iseed0, final double v10, final double v20, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		iseed = iseed0;


		v1 = v10;


		v2 = v20;

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
	/*value*/ class ParticleStub 
	 {
 
	public final Particle[] localArray;


	public ParticleStub ( final Particle[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

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
	/*value*/ class ParticleRefArray1 
	 {
 
	public final Dist1 distValue;
	public final ParticleStub[] contents;


	public ParticleRefArray1 ( final Dist1 distValue_, final ParticleStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

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
	/*value*/ class doubleStub 
	 {
 
	public final double[] localArray;


	public doubleStub ( final double[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class mdRefArray1 
	 {
 
	public final Dist1 distValue;
	public final mdStub[] contents;


	public mdRefArray1 ( final Dist1 distValue_, final mdStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Point4 
	 {
 
	public final int f0;
	public final int f1;
	public final int f2;
	public final int f3;


	public Point4 ( final int f0_, final int f1_, final int f2_, final int f3_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;


		f1 = f1_;


		f2 = f2_;


		f3 = f3_;

		}


	}
	/*value*/ class Region4 
	 {
 
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final int low2;
	public final int dim2;
	public final int low3;
	public final int dim3;
	public final Point4[] pointArray;


	public Region4 ( final Point4[] pointArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int zero = 0;


		final int one = 1;


		final int minusOne = zero - one;


		regRank = 4;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = false;


		low0 = minusOne;


		dim0 = zero;


		low1 = minusOne;


		dim1 = zero;


		low2 = minusOne;


		dim2 = zero;


		low3 = minusOne;


		dim3 = zero;

		}
	public Region4 ( final Point4[] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_, final int low2_, final int dim2_, final int low3_, final int dim3_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regRank = 4;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;


		low1 = low1_;


		dim1 = dim1_;


		low2 = low2_;


		dim2 = dim2_;


		low3 = low3_;


		dim3 = dim3_;

		}


	}
	/*value*/ class mdStub 
	 {
 
	public final md[] localArray;


	public mdStub ( final md[] localArray_, int myUniquePlacePoint)
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
	/*value*/ class intStub 
	 {
 
	public final int[] localArray;


	public intStub ( final int[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
