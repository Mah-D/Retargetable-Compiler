public class RunMain {
 
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program   {
 
public static final Region1 _MR_r = Program._MR_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain ( )		{

		Timer tmr = new Timer();

		int count = 0;
		Program.Timer_start(tmr, count);

		final MR X10_TEMP4 = new MR();
		Program.MR_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);

		final String X10_TEMP7 = "Wall-clock time for mapreduce: ";

		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count);

		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;

		final String X10_TEMP10 = " secs";

		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;
		System.out.println(X10_TEMP12);
		}
public static Region1 _MR_r_init ( )		{

		final int X10_TEMP3 = 0;

		final int X10_TEMP4 = 3000000;

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		return X10_TEMP6;
		}
public static void MR_run ( final MR X10_TEMP0)		{
		Program.MR_map(X10_TEMP0);
		Program.MR_reduce(X10_TEMP0);

		final int X10_TEMP2 = X10_TEMP0.total;

		final String X10_TEMP4 = "";

		final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;
		System.out.println(X10_TEMP3);
		}
public static void MR_map ( final MR X10_TEMP0)		{

		final intRefArray1 b = X10_TEMP0.a;
					{

			final Dist1 RX10_TEMP1 = b.distValue;

			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

			final Point1[] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3.length; RX10_TEMP0++)
				{

				final Point1 p = RX10_TEMP3[RX10_TEMP0];

				final Dist1 RX10_TEMP4 = b.distValue;

				final Dist1 X10_TEMP3 = RX10_TEMP4;

				final Region1 RX10_TEMP5 = X10_TEMP3.dReg;

				final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, p);

				final int RX10_TEMP7 = 0;

				final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
				if(RX10_TEMP8)
					{

					final String RX10_TEMP9 = "Point p not found in the distribution X10_TEMP3.";
throw new RuntimeException(RX10_TEMP9);

					}

				final Dist SX10_TEMP0 = X10_TEMP3.dDist;

				final int RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

				final int X10_TEMP4 = RX10_TEMP10;
				//async(X10_TEMP4)
					{

					final Dist1 RX10_TEMP11 = b.distValue;

					final Region1 RX10_TEMP12 = RX10_TEMP11.dReg;

					final int RX10_TEMP13 = Program.searchPointInRegion1(RX10_TEMP12, p);

					final int RX10_TEMP14 = 0;

					final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14;
					if(RX10_TEMP15)
						{

						String RX10_TEMP16 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP16);

						}

					final Dist SX10_TEMP1 = RX10_TEMP11.dDist;

					final int RX10_TEMP17 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP13);

					final int RX10_TEMP19 = 0;

					final boolean RX10_TEMP20 = RX10_TEMP17 != RX10_TEMP19;
					if(RX10_TEMP20)
						{

						String RX10_TEMP18 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP18);

						}

					final INTArray RX10_TEMP21 = b.contents;

					final int X10_TEMP8 = Program.INTGetValue(RX10_TEMP21, RX10_TEMP13);

					final int X10_TEMP11 = Program.MR_f(X10_TEMP0, X10_TEMP8);

					final int X10_TEMP12 = X10_TEMP11;

					final Dist1 RX10_TEMP22 = b.distValue;

					final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;

					final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, p);

					final int RX10_TEMP25 = 0;

					final boolean RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25;
					if(RX10_TEMP26)
						{

						String RX10_TEMP27 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP27);

						}

					final Dist SX10_TEMP2 = RX10_TEMP22.dDist;

					final int RX10_TEMP28 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP24);

					final int RX10_TEMP30 = 0;

					final boolean RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30;
					if(RX10_TEMP31)
						{

						String RX10_TEMP29 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP29);

						}

					final INTArray RX10_TEMP32 = b.contents;
					Program.INTSetValue(RX10_TEMP32, RX10_TEMP24, X10_TEMP12);
					}
				}
			}
		}
public static int MR_f ( final MR X10_TEMP0, final int x)		{

		int X10_TEMP1 = x;

		final int X10_TEMP3 = X10_TEMP1 * X10_TEMP1;
		return X10_TEMP3;
		}
public static void MR_reduce ( final MR X10_TEMP0)		{

		final int h = 0;

		final intRefArray1 X10_TEMP2 = X10_TEMP0.a;

		final Dist1 RX10_TEMP0 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;

		final Region1 reg = RX10_TEMP1;

		final int X10_TEMP4 = 0;

		final Dist1 dis = Program.getPlaceDist1(reg, X10_TEMP4);

		final Region1 RX10_TEMP2 = dis.dReg;

		final Point1[] RX10_TEMP4 = RX10_TEMP2.pointArray;

		final Dist RX10_TEMP3 = dis.dDist;

		final INTArray RX10_TEMP5 = new INTArray(RX10_TEMP3);

		final intRefArray1 RX10_TEMP6 = new intRefArray1(dis, RX10_TEMP5);

		final intRefArray1 result = RX10_TEMP6;

		final intRefArray1 X10_TEMP8 = X10_TEMP0.a;

		final Dist1 RX10_TEMP8 = X10_TEMP8.distValue;

		final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;

		final Point1[] RX10_TEMP10 = RX10_TEMP9.pointArray;
		for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP10.length; RX10_TEMP7++)
			{

			final Point1 p = RX10_TEMP10[RX10_TEMP7];
							{

				final intRefArray1 c = X10_TEMP0.a;

				final intRefArray1 X10_TEMP10 = X10_TEMP0.a;

				final Dist1 RX10_TEMP11 = X10_TEMP10.distValue;

				final Dist1 X10_TEMP11 = RX10_TEMP11;

				final Region1 RX10_TEMP12 = X10_TEMP11.dReg;

				final int RX10_TEMP13 = Program.searchPointInRegion1(RX10_TEMP12, p);

				final int RX10_TEMP14 = 0;

				final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14;
				if(RX10_TEMP15)
					{

					final String RX10_TEMP16 = "Point p not found in the distribution X10_TEMP11.";
throw new RuntimeException(RX10_TEMP16);

					}

				final Dist SX10_TEMP0 = X10_TEMP11.dDist;

				final int RX10_TEMP17 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP13);

				final int X10_TEMP14 = RX10_TEMP17;
				//async(X10_TEMP14)
					{

					final Dist1 RX10_TEMP18 = c.distValue;

					final Region1 RX10_TEMP19 = RX10_TEMP18.dReg;

					final int RX10_TEMP20 = Program.searchPointInRegion1(RX10_TEMP19, p);

					final int RX10_TEMP21 = 0;

					final boolean RX10_TEMP22 = RX10_TEMP20 < RX10_TEMP21;
					if(RX10_TEMP22)
						{

						String RX10_TEMP23 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP23);

						}

					final Dist SX10_TEMP1 = RX10_TEMP18.dDist;

					final int RX10_TEMP24 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP20);

					final int RX10_TEMP26 = 0;

					final boolean RX10_TEMP27 = RX10_TEMP24 != RX10_TEMP26;
					if(RX10_TEMP27)
						{

						String RX10_TEMP25 = "Bad place access for array c";
throw new RuntimeException(RX10_TEMP25);

						}

					final INTArray RX10_TEMP28 = c.contents;

					final int v = Program.INTGetValue(RX10_TEMP28, RX10_TEMP20);
					//async(h)
						{

						final int X10_TEMP21 = v;

						final Dist1 RX10_TEMP29 = result.distValue;

						final Region1 RX10_TEMP30 = RX10_TEMP29.dReg;

						final int RX10_TEMP31 = Program.searchPointInRegion1(RX10_TEMP30, p);

						final int RX10_TEMP32 = 0;

						final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
						if(RX10_TEMP33)
							{

							String RX10_TEMP34 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP34);

							}

						final Dist SX10_TEMP2 = RX10_TEMP29.dDist;

						final int RX10_TEMP35 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP31);

						final int RX10_TEMP37 = 0;

						final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
						if(RX10_TEMP38)
							{

							String RX10_TEMP36 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP36);

							}

						final INTArray RX10_TEMP39 = result.contents;
						Program.INTSetValue(RX10_TEMP39, RX10_TEMP31, X10_TEMP21);
						}
					}
				}
			}

		final Dist1 RX10_TEMP41 = result.distValue;

		final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;

		final Point1[] RX10_TEMP43 = RX10_TEMP42.pointArray;
		for(int RX10_TEMP40=0; RX10_TEMP40 < RX10_TEMP43.length; RX10_TEMP40++)
			{

			final Point1 p = RX10_TEMP43[RX10_TEMP40];

			final int X10_TEMP25 = X10_TEMP0.total;

			final Dist1 RX10_TEMP44 = result.distValue;

			final Region1 RX10_TEMP45 = RX10_TEMP44.dReg;

			final int RX10_TEMP46 = Program.searchPointInRegion1(RX10_TEMP45, p);

			final int RX10_TEMP47 = 0;

			final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47;
			if(RX10_TEMP48)
				{

				String RX10_TEMP49 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP49);

				}

			final Dist SX10_TEMP3 = RX10_TEMP44.dDist;

			final int RX10_TEMP50 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP46);

			final int RX10_TEMP52 = 0;

			final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52;
			if(RX10_TEMP53)
				{

				String RX10_TEMP51 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP51);

				}

			final INTArray RX10_TEMP54 = result.contents;

			final int X10_TEMP26 = Program.INTGetValue(RX10_TEMP54, RX10_TEMP46);

			final int X10_TEMP27 = X10_TEMP25 + X10_TEMP26;
			X10_TEMP0.total = (X10_TEMP27);
			}
		}
public static int _Timer_max_counters_init ( )		{

		final int X10_TEMP2 = 64;
		return X10_TEMP2;
		}
public static void Timer_start ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.start_time;

		final double X10_TEMP6 = System.currentTimeMillis();

		final double X10_TEMP7 = X10_TEMP6;

		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP1 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);

		final int RX10_TEMP4 = 0;

		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP6);

			}

		final Dist SX10_TEMP0 = RX10_TEMP1.dDist;

		final int RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final int RX10_TEMP9 = 0;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP11, RX10_TEMP3, X10_TEMP7);
		}
public static void Timer_stop ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.elapsed_time;

		final double X10_TEMP6 = System.currentTimeMillis();

		final doubleRefArray1 X10_TEMP4 = X10_TEMP0.start_time;

		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP1 = X10_TEMP4.distValue;

		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);

		final int RX10_TEMP4 = 0;

		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP6);

			}

		final Dist SX10_TEMP0 = RX10_TEMP1.dDist;

		final int RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final int RX10_TEMP9 = 0;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP4";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP4.contents;

		final double X10_TEMP7 = Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3);

		final double X10_TEMP10 = X10_TEMP6 - X10_TEMP7;

		final double X10_TEMP11 = X10_TEMP10;

		final Point1 RX10_TEMP12 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP13 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;

		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);

		final int RX10_TEMP16 = 0;

		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
		if(RX10_TEMP17)
			{

			String RX10_TEMP18 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP18);

			}

		final Dist SX10_TEMP1 = RX10_TEMP13.dDist;

		final int RX10_TEMP19 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP15);

		final int RX10_TEMP21 = 0;

		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP11);

		final doubleRefArray1 X10_TEMP12 = X10_TEMP0.elapsed_time;

		final Point1 RX10_TEMP24 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP25 = X10_TEMP12.distValue;

		final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;

		final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, RX10_TEMP24);

		final int RX10_TEMP28 = 0;

		final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
		if(RX10_TEMP29)
			{

			String RX10_TEMP30 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP30);

			}

		final Dist SX10_TEMP2 = RX10_TEMP25.dDist;

		final int RX10_TEMP31 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP27);

		final int RX10_TEMP33 = 0;

		final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
		if(RX10_TEMP34)
			{

			String RX10_TEMP32 = "Bad place access for array X10_TEMP12";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP12.contents;

		final double X10_TEMP15 = Program.DOUBLEGetValue(RX10_TEMP35, RX10_TEMP27);

		final double X10_TEMP16 = 1000;

		final double X10_TEMP17 = X10_TEMP15 / X10_TEMP16;

		final Point1 RX10_TEMP36 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP37 = X10_TEMP12.distValue;

		final Region1 RX10_TEMP38 = RX10_TEMP37.dReg;

		final int RX10_TEMP39 = Program.searchPointInRegion1(RX10_TEMP38, RX10_TEMP36);

		final int RX10_TEMP40 = 0;

		final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40;
		if(RX10_TEMP41)
			{

			String RX10_TEMP42 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP42);

			}

		final Dist SX10_TEMP3 = RX10_TEMP37.dDist;

		final int RX10_TEMP43 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP39);

		final int RX10_TEMP45 = 0;

		final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;
		if(RX10_TEMP46)
			{

			String RX10_TEMP44 = "Bad place access for array X10_TEMP12";
throw new RuntimeException(RX10_TEMP44);

			}

		final DOUBLEArray RX10_TEMP47 = X10_TEMP12.contents;
		Program.DOUBLESetValue(RX10_TEMP47, RX10_TEMP39, X10_TEMP17);

		final doubleRefArray1 X10_TEMP18 = X10_TEMP0.total_time;

		final doubleRefArray1 X10_TEMP20 = X10_TEMP0.elapsed_time;

		final Point1 RX10_TEMP48 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP49 = X10_TEMP18.distValue;

		final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;

		final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50, RX10_TEMP48);

		final int RX10_TEMP52 = 0;

		final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;
		if(RX10_TEMP53)
			{

			String RX10_TEMP54 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP54);

			}

		final Dist SX10_TEMP4 = RX10_TEMP49.dDist;

		final int RX10_TEMP55 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP51);

		final int RX10_TEMP57 = 0;

		final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;
		if(RX10_TEMP58)
			{

			String RX10_TEMP56 = "Bad place access for array X10_TEMP18";
throw new RuntimeException(RX10_TEMP56);

			}

		final DOUBLEArray RX10_TEMP59 = X10_TEMP18.contents;

		final double X10_TEMP23 = Program.DOUBLEGetValue(RX10_TEMP59, RX10_TEMP51);

		final Point1 RX10_TEMP60 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP61 = X10_TEMP20.distValue;

		final Region1 RX10_TEMP62 = RX10_TEMP61.dReg;

		final int RX10_TEMP63 = Program.searchPointInRegion1(RX10_TEMP62, RX10_TEMP60);

		final int RX10_TEMP64 = 0;

		final boolean RX10_TEMP65 = RX10_TEMP63 < RX10_TEMP64;
		if(RX10_TEMP65)
			{

			String RX10_TEMP66 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP66);

			}

		final Dist SX10_TEMP5 = RX10_TEMP61.dDist;

		final int RX10_TEMP67 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP63);

		final int RX10_TEMP69 = 0;

		final boolean RX10_TEMP70 = RX10_TEMP67 != RX10_TEMP69;
		if(RX10_TEMP70)
			{

			String RX10_TEMP68 = "Bad place access for array X10_TEMP20";
throw new RuntimeException(RX10_TEMP68);

			}

		final DOUBLEArray RX10_TEMP71 = X10_TEMP20.contents;

		final double X10_TEMP24 = Program.DOUBLEGetValue(RX10_TEMP71, RX10_TEMP63);

		final double X10_TEMP25 = X10_TEMP23 + X10_TEMP24;

		final Point1 RX10_TEMP72 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP73 = X10_TEMP18.distValue;

		final Region1 RX10_TEMP74 = RX10_TEMP73.dReg;

		final int RX10_TEMP75 = Program.searchPointInRegion1(RX10_TEMP74, RX10_TEMP72);

		final int RX10_TEMP76 = 0;

		final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
		if(RX10_TEMP77)
			{

			String RX10_TEMP78 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP78);

			}

		final Dist SX10_TEMP6 = RX10_TEMP73.dDist;

		final int RX10_TEMP79 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP75);

		final int RX10_TEMP81 = 0;

		final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
		if(RX10_TEMP82)
			{

			String RX10_TEMP80 = "Bad place access for array X10_TEMP18";
throw new RuntimeException(RX10_TEMP80);

			}

		final DOUBLEArray RX10_TEMP83 = X10_TEMP18.contents;
		Program.DOUBLESetValue(RX10_TEMP83, RX10_TEMP75, X10_TEMP25);
		}
public static double Timer_readTimer ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.total_time;

		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP1 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);

		final int RX10_TEMP4 = 0;

		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP6);

			}

		final Dist SX10_TEMP0 = RX10_TEMP1.dDist;

		final int RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final int RX10_TEMP9 = 0;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;

		final double X10_TEMP5 = Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3);
		return X10_TEMP5;
		}
public static void Timer_resetTimer ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.total_time;

		final double X10_TEMP6 = 0;

		final double X10_TEMP7 = X10_TEMP6;

		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP1 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);

		final int RX10_TEMP4 = 0;

		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if(RX10_TEMP5)
			{

			String RX10_TEMP6 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP6);

			}

		final Dist SX10_TEMP0 = RX10_TEMP1.dDist;

		final int RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final int RX10_TEMP9 = 0;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP11, RX10_TEMP3, X10_TEMP7);

		final doubleRefArray1 X10_TEMP8 = X10_TEMP0.start_time;

		final double X10_TEMP12 = 0;

		final double X10_TEMP13 = X10_TEMP12;

		final Point1 RX10_TEMP12 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP13 = X10_TEMP8.distValue;

		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;

		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);

		final int RX10_TEMP16 = 0;

		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
		if(RX10_TEMP17)
			{

			String RX10_TEMP18 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP18);

			}

		final Dist SX10_TEMP1 = RX10_TEMP13.dDist;

		final int RX10_TEMP19 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP15);

		final int RX10_TEMP21 = 0;

		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP8";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP8.contents;
		Program.DOUBLESetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP13);

		final doubleRefArray1 X10_TEMP14 = X10_TEMP0.elapsed_time;

		final double X10_TEMP18 = 0;

		final double X10_TEMP19 = X10_TEMP18;

		final Point1 RX10_TEMP24 = new Point1(X10_TEMP1);

		final Dist1 RX10_TEMP25 = X10_TEMP14.distValue;

		final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;

		final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, RX10_TEMP24);

		final int RX10_TEMP28 = 0;

		final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
		if(RX10_TEMP29)
			{

			String RX10_TEMP30 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP30);

			}

		final Dist SX10_TEMP2 = RX10_TEMP25.dDist;

		final int RX10_TEMP31 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP27);

		final int RX10_TEMP33 = 0;

		final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
		if(RX10_TEMP34)
			{

			String RX10_TEMP32 = "Bad place access for array X10_TEMP14";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP14.contents;
		Program.DOUBLESetValue(RX10_TEMP35, RX10_TEMP27, X10_TEMP19);
		}
public static void Timer_resetAllTimers ( final Timer X10_TEMP0)		{

		int i = 0;

		boolean X10_TEMP4 = i < _Timer_max_counters;
		while(X10_TEMP4)
			{
			Program.Timer_resetTimer(X10_TEMP0, i);

			final int X10_TEMP6 = i;

			final int X10_TEMP7 = 1;

			i = i + X10_TEMP7;

			X10_TEMP4 = i < _Timer_max_counters;
			}
		}
public static int constantSearchRegion1 ( final Region1 r, final Point1 target)		{

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
public static int comparePoint1 ( final Point1 pt1, final Point1 pt2)		{

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
public static int searchPointInRegion1 ( final Region1 r, final Point1 target)		{

		final boolean regType = r.regType;
		if(regType)
			{

			final int constantSearch = Program.constantSearchRegion1(r, target);
			return constantSearch;
			}

		final int binarySearch = Program.binarySearchRegion1(r, target);
		return binarySearch;
		}
public static int binarySearchRegion1 ( final Region1 r, final Point1 target)		{

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

			final int pointCompare = Program.comparePoint1(target, temp);

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
public static Dist1 getBlockDist1 ( final Region1 r)		{

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

		Dist pointDist1 = Program.getCyclic(arraySize, initPlace, blockSize);

		int remainingPlaces = N - q;

		final boolean cond = remainingPlaces == zero;
		if(cond)
			{

			final Dist1 retDist = new Dist1(r, pointDist1);
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

		pointDist1 = new Dist(pointDist1, index, dSize, initPlace);

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

				pointDist1 = new Dist(pointDist1, index, dSize, pl);

				arraySize = 0;
				}
			else
				{

				dSize = index + chunk;

				dSize = dSize - one;

				pointDist1 = new Dist(pointDist1, index, dSize, pl);

				index = index + chunk;

				arraySize = arraySize - chunk;
				}
 
			pl = 0;

			whileCond = arraySize != zero;
			}

		final Dist1 retDist = new Dist1(r, pointDist1);
		return retDist;
		}
public static Dist1 getPlaceDist1 ( final Region1 r, final int p)		{

		final int rSize = r.pointArray.length;

		final Dist pointDist = Program.getCyclic(rSize, p, rSize);

		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
		}
public static Dist getCyclic ( final int arraySize, final int initPlace, final int blockSize)		{

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

		Dist pointDist = new Dist(pointReg, initPlace);

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

				pointDist = new Dist(pointDist, index, dSize, p);

				N = 0;
				}
			else
				{

				dSize = index + chunk;

				dSize = dSize - one;

				pointDist = new Dist(pointDist, index, dSize, p);

				index = index + chunk;

				N = N - chunk;
				}
 
			p = 0;

			whileCond = N != zero;
			}
		return pointDist;
		}
public static Region1 createNewRegion1R ( final int v1_0, final int v1_1)		{

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
for(int p= 0; p<ptArray.length ;p++ )			{

			int f1 = p / stride1;

			f1 = f1 % dim1;

			f1 = f1 + v1_0;

			final Point1 retPoint = new Point1(f1);
			ptArray[p] =retPoint;
			}

;
		if(regType)
			{

			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1);
			return retRegRegular;
			}

		final Region1 retReg = new Region1(ptArray);
		return retReg;
		}
public static int[] createDist ( final int  reg, final int pl)		{

		final int[] placeArray = (int[])(new int/*value*/[reg]);
/*arrayInitBlock*/
for(int p= 0; p<placeArray.length ;p++ )			{
			placeArray[p] =pl;
			}

;
		return placeArray;
		}
public static int[] extendDist ( final Dist d1, final int x, final int y, final int pl)		{

		final int one = 1;

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

		final int dis2 = y+1;

		final int[] placeArray = new int[dis2];
		return placeArray;
		}
public static int getPlaceFromDist ( final Dist d, final int index)		{

		final int[] placeArray = d.placeArray;

		final int retPlace = placeArray[index];
		return retPlace;
		}
public static int[] getCounts ( final Dist d)		{

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
for(int p= 0; p<counts.length ;p++ )			{

			final int tempInt = tempCounts[p];
			counts[p] =tempInt;
			}

;
		return counts;
		}
public static int[] getRunningSum ( final Dist d)		{

		final int one = 1;

		final int zero = 0;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int dis = ub+1;

		final int[] tempCounts = new int[dis];

		final int count = d.placeArray.length;

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
for(int p= 0; p<runSum.length ;p++ )			{

			final int tempInt = tempRunSum[p];
			runSum[p] =tempInt;
			}

;
		return runSum;
		}
public static int getLocalIndex ( final Dist myDist, final int index)		{

		final int[] runningSum = myDist.runningSum;

		final int retVal = runningSum[index];
		return retVal;
		}
public static INTStub[] createINTArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final INTStub[] temp = (INTStub[])(new INTStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0; p<temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final INTStub is = Program.createINTStub(pl, count);
			temp[p] =is;
			}

;
		return temp;
		}
public static INTStub createINTStub ( final int remotePlace, final int count)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final INTStub[] retStub = new INTStub[retDist];
					{
			//async(remotePlace)
				{

				final INTStub to = new INTStub(count);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final INTStub to = retStub[zero];
		return to;
		}
public static int[] allocateLocalINTArray ( final int count)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final int[] temp = new int[localDist];
		return temp;
		}
public static int INTGetValue ( final INTArray arr, final int index)		{

		final int pl = 0;

		final int placeIndex = 0;

		final INTStub[] contents = arr.contents;

		final INTStub indexStub = contents[placeIndex];

		final int[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);

		final int returnValue = localArray[localIndex];
		return returnValue;
		}
public static void INTSetValue ( final INTArray arr, final int index, final int val)		{

		final int pl = 0;

		final int placeIndex = 0;

		final INTStub[] contents = arr.contents;

		final INTStub indexStub = contents[placeIndex];

		final int[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = val;
		return;
		}
public static DOUBLEStub[] createDOUBLEArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final DOUBLEStub[] temp = (DOUBLEStub[])(new DOUBLEStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0; p<temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final DOUBLEStub is = Program.createDOUBLEStub(pl, count);
			temp[p] =is;
			}

;
		return temp;
		}
public static DOUBLEStub createDOUBLEStub ( final int remotePlace, final int count)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final DOUBLEStub[] retStub = new DOUBLEStub[retDist];
					{
			//async(remotePlace)
				{

				final DOUBLEStub to = new DOUBLEStub(count);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final DOUBLEStub to = retStub[zero];
		return to;
		}
public static double[] allocateLocalDOUBLEArray ( final int count)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final double[] temp = new double[localDist];
		return temp;
		}
public static double DOUBLEGetValue ( final DOUBLEArray arr, final int index)		{

		final int pl = 0;

		final int placeIndex = 0;

		final DOUBLEStub[] contents = arr.contents;

		final DOUBLEStub indexStub = contents[placeIndex];

		final double[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);

		final double returnValue = localArray[localIndex];
		return returnValue;
		}
public static void DOUBLESetValue ( final DOUBLEArray arr, final int index, final double val)		{

		final int pl = 0;

		final int placeIndex = 0;

		final DOUBLEStub[] contents = arr.contents;

		final DOUBLEStub indexStub = contents[placeIndex];

		final double[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = val;
		return;
		}

}
	/*value*/ class INTStub 
	 {
 
	public final int[] localArray;


	public INTStub ( final int count)
		{

		localArray = Program.allocateLocalINTArray(count);
		}


	}
	/*value*/ class INTArray 
	 {
 
	public final INTStub[] contents;
	public final Dist distArray;


	public INTArray ( final Dist distArray_)
		{

		distArray = distArray_;

		contents = Program.createINTArray(distArray);
		}


	}
	/*value*/ class DOUBLEStub 
	 {
 
	public final double[] localArray;


	public DOUBLEStub ( final int count)
		{

		localArray = Program.allocateLocalDOUBLEArray(count);
		}


	}
	/*value*/ class DOUBLEArray 
	 {
 
	public final DOUBLEStub[] contents;
	public final Dist distArray;


	public DOUBLEArray ( final Dist distArray_)
		{

		distArray = distArray_;

		contents = Program.createDOUBLEArray(distArray);
		}


	}
	/*value*/ class Dist 
	 {
 
	public final int[] placeArray;
	public final int[] counts;
	public final int[] runningSum;


	public Dist ( final int  reg, final int pl)
		{

		placeArray = Program.createDist(reg, pl);

		counts = Program.getCounts(this);

		runningSum = (int[])(Program.getRunningSum(this));
		}
	public Dist ( final Dist d1, final int x, final int y, final int pl)
		{

		placeArray = Program.extendDist(d1, x, y, pl);

		counts = Program.getCounts(this);

		runningSum = (int[])(Program.getRunningSum(this));
		}


	}
	class MR   {
 
	public intRefArray1 a;
	public int total;


	public MR ( )
		{

		final Region1 X10_TEMP2 = Program._MR_r;

		final Dist1 X10_TEMP3 = Program.getBlockDist1(X10_TEMP2);

		Dist1 d = X10_TEMP3;

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = d.dDist;

				final int RX10_TEMP6 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP6)
					{

					final Point1 RX10_TEMP5 = RX10_TEMP2[RX10_TEMP4];

					final int i = RX10_TEMP5.f0;
					Program.INTSetValue(RX10_TEMP3, RX10_TEMP4, i);
					}
				}
			}

		final intRefArray1 RX10_TEMP7 = new intRefArray1(d, RX10_TEMP3);

		final intRefArray1 X10_TEMP7 = RX10_TEMP7;

		a = X10_TEMP7;

		final int X10_TEMP9 = 0;

		total = X10_TEMP9;
		}



}
	class Timer   {
 
	public final Dist1 d;
	public final doubleRefArray1 start_time;
	public final doubleRefArray1 elapsed_time;
	public final doubleRefArray1 total_time;


	public Timer ( )
		{

		int i = 0;

		final int X10_TEMP4 = 0;

		final int X10_TEMP5 = Program._Timer_max_counters;

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5);

		final int X10_TEMP7 = 0;

		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);

		d = X10_TEMP9;

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);

		final doubleRefArray1 RX10_TEMP4 = new doubleRefArray1(d, RX10_TEMP3);

		final doubleRefArray1 X10_TEMP11 = RX10_TEMP4;

		start_time = X10_TEMP11;

		final Region1 RX10_TEMP5 = d.dReg;

		final Point1[] RX10_TEMP7 = RX10_TEMP5.pointArray;

		final Dist RX10_TEMP6 = d.dDist;

		final DOUBLEArray RX10_TEMP8 = new DOUBLEArray(RX10_TEMP6);

		final doubleRefArray1 RX10_TEMP9 = new doubleRefArray1(d, RX10_TEMP8);

		final doubleRefArray1 X10_TEMP13 = RX10_TEMP9;

		elapsed_time = X10_TEMP13;

		final Region1 RX10_TEMP10 = d.dReg;

		final Point1[] RX10_TEMP12 = RX10_TEMP10.pointArray;

		final Dist RX10_TEMP11 = d.dDist;

		final DOUBLEArray RX10_TEMP13 = new DOUBLEArray(RX10_TEMP11);

		final doubleRefArray1 RX10_TEMP14 = new doubleRefArray1(d, RX10_TEMP13);

		final doubleRefArray1 X10_TEMP15 = RX10_TEMP14;

		total_time = X10_TEMP15;

		final int X10_TEMP16 = Program._Timer_max_counters;

		boolean X10_TEMP20 = i < X10_TEMP16;
		while(X10_TEMP20)
			{

			final double X10_TEMP24 = 0;

			final double X10_TEMP25 = X10_TEMP24;

			final Point1 RX10_TEMP15 = new Point1(i);

			final Dist1 RX10_TEMP16 = start_time.distValue;

			final Region1 RX10_TEMP17 = RX10_TEMP16.dReg;

			final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, RX10_TEMP15);

			final int RX10_TEMP19 = 0;

			final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
			if(RX10_TEMP20)
				{

				String RX10_TEMP21 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP21);

				}

			final Dist SX10_TEMP0 = RX10_TEMP16.dDist;

			final int RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP18);

			final int RX10_TEMP24 = 0;

			final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
			if(RX10_TEMP25)
				{

				String RX10_TEMP23 = "Bad place access for array start_time";
throw new RuntimeException(RX10_TEMP23);

				}

			final DOUBLEArray RX10_TEMP26 = start_time.contents;
			Program.DOUBLESetValue(RX10_TEMP26, RX10_TEMP18, X10_TEMP25);

			final double X10_TEMP29 = 0;

			final double X10_TEMP30 = X10_TEMP29;

			final Point1 RX10_TEMP27 = new Point1(i);

			final Dist1 RX10_TEMP28 = elapsed_time.distValue;

			final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;

			final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, RX10_TEMP27);

			final int RX10_TEMP31 = 0;

			final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
			if(RX10_TEMP32)
				{

				String RX10_TEMP33 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP33);

				}

			final Dist SX10_TEMP1 = RX10_TEMP28.dDist;

			final int RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP30);

			final int RX10_TEMP36 = 0;

			final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
			if(RX10_TEMP37)
				{

				String RX10_TEMP35 = "Bad place access for array elapsed_time";
throw new RuntimeException(RX10_TEMP35);

				}

			final DOUBLEArray RX10_TEMP38 = elapsed_time.contents;
			Program.DOUBLESetValue(RX10_TEMP38, RX10_TEMP30, X10_TEMP30);

			final double X10_TEMP34 = 0;

			final double X10_TEMP35 = X10_TEMP34;

			final Point1 RX10_TEMP39 = new Point1(i);

			final Dist1 RX10_TEMP40 = total_time.distValue;

			final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;

			final int RX10_TEMP42 = Program.searchPointInRegion1(RX10_TEMP41, RX10_TEMP39);

			final int RX10_TEMP43 = 0;

			final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;
			if(RX10_TEMP44)
				{

				String RX10_TEMP45 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP45);

				}

			final Dist SX10_TEMP2 = RX10_TEMP40.dDist;

			final int RX10_TEMP46 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP42);

			final int RX10_TEMP48 = 0;

			final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;
			if(RX10_TEMP49)
				{

				String RX10_TEMP47 = "Bad place access for array total_time";
throw new RuntimeException(RX10_TEMP47);

				}

			final DOUBLEArray RX10_TEMP50 = total_time.contents;
			Program.DOUBLESetValue(RX10_TEMP50, RX10_TEMP42, X10_TEMP35);

			final int X10_TEMP36 = i;

			final int X10_TEMP37 = 1;

			i = i + X10_TEMP37;

			final int X10_TEMP18 = Program._Timer_max_counters;

			X10_TEMP20 = i < X10_TEMP18;
			}
		}



}
	/*value*/ class intRefArray1 
	 {
 
	public final Dist1 distValue;
	public final INTArray contents;


	public intRefArray1 ( final Dist1 distValue_, final INTArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
		}


	}
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_)
		{

		f0 = f0_;
		}


	}
	/*value*/ class Dist1 
	 {
 
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_)
		{

		dReg = dReg_;

		dDist = dDist_;
		}


	}
	/*value*/ class Region1 
	 {
 
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1[] pointArray;


	public Region1 ( final Point1[] pointArray_)
		{

		final int zero = 0;

		final int one = 1;

		final int minusOne = zero - one;

		regRank = 1;

		pointArray = pointArray_;

		regType = false;

		low0 = minusOne;

		dim0 = zero;
		}
	public Region1 ( final Point1[] pointArray_, final int low0_, final int dim0_)
		{

		regRank = 1;

		pointArray = pointArray_;

		regType = true;

		low0 = low0_;

		dim0 = dim0_;
		}


	}
	/*value*/ class doubleRefArray1 
	 {
 
	public final Dist1 distValue;
	public final DOUBLEArray contents;


	public doubleRefArray1 ( final Dist1 distValue_, final DOUBLEArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
		}


	}