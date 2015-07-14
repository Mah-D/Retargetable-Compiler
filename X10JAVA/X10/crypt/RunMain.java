public class RunMain {
 
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program   {
 
public static final int _IDEATest_array_rows = Program._IDEATest_array_rows_init();
public static final long _Random_multiplier = Program._Random_multiplier_init();
public static final long _Random_addend = Program._Random_addend_init();
public static final long _Random_mask = Program._Random_mask_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain ( )		{

		Timer tmr = new Timer();

		int count = 0;
		Program.Timer_start(tmr, count);

		final IDEATest X10_TEMP4 = new IDEATest();
		Program.IDEATest_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);

		final String X10_TEMP7 = "Wall-clock time for crypt: ";

		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count);

		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;

		final String X10_TEMP10 = " secs";

		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;
		System.out.println(X10_TEMP12);
		}
public static int _IDEATest_array_rows_init ( )		{

		final int X10_TEMP2 = 32000;
		return X10_TEMP2;
		}
public static void IDEATest_run ( final IDEATest X10_TEMP0)		{
		Program.IDEATest_kernel(X10_TEMP0);
		Program.IDEATest_validate(X10_TEMP0);
		}
public static void IDEATest_kernel ( final IDEATest X10_TEMP0)		{
		Program.IDEATest_Do(X10_TEMP0);
		}
public static void IDEATest_validate ( final IDEATest X10_TEMP0)		{

		final byteRefArray1 p1 = X10_TEMP0.plain1;

		final byteRefArray1 c1 = X10_TEMP0.crypt1;

		final byteRefArray1 p2 = X10_TEMP0.plain2;
					{

			final byteRefArray1 X10_TEMP4 = X10_TEMP0.plain1;

			final Dist1 RX10_TEMP0 = X10_TEMP4.distValue;

			final Dist1 X10_TEMP6 = RX10_TEMP0;

			final Region1 RX10_TEMP2 = X10_TEMP6.dReg;

			final Point1[] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(int RX10_TEMP1=0; RX10_TEMP1 < RX10_TEMP3.length; RX10_TEMP1++)
				{

				final Point1 pt = RX10_TEMP3[RX10_TEMP1];

				final Dist1 X10_TEMP7 = X10_TEMP6;

				final Region1 RX10_TEMP4 = X10_TEMP7.dReg;

				final int RX10_TEMP5 = Program.searchPointInRegion1(RX10_TEMP4, pt);

				final int RX10_TEMP6 = 0;

				final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6;
				if(RX10_TEMP7)
					{

					final String RX10_TEMP8 = "Point pt not found in the distribution X10_TEMP7.";
throw new RuntimeException(RX10_TEMP8);

					}

				final Dist SX10_TEMP0 = X10_TEMP7.dDist;

				final int RX10_TEMP9 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP5);

				final int X10_TEMP8 = RX10_TEMP9;
				//async(X10_TEMP8)
					{

					final Dist1 RX10_TEMP10 = p1.distValue;

					final Region1 RX10_TEMP11 = RX10_TEMP10.dReg;

					final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, pt);

					final int RX10_TEMP13 = 0;

					final boolean RX10_TEMP14 = RX10_TEMP12 < RX10_TEMP13;
					if(RX10_TEMP14)
						{

						String RX10_TEMP15 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP15);

						}

					final Dist SX10_TEMP1 = RX10_TEMP10.dDist;

					final int RX10_TEMP16 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP12);

					final int RX10_TEMP18 = 0;

					final boolean RX10_TEMP19 = RX10_TEMP16 != RX10_TEMP18;
					if(RX10_TEMP19)
						{

						String RX10_TEMP17 = "Bad place access for array p1";
throw new RuntimeException(RX10_TEMP17);

						}

					final BYTEArray RX10_TEMP20 = p1.contents;

					final byte X10_TEMP11 = (byte)Program.BYTEGetValue(RX10_TEMP20, RX10_TEMP12);

					final Dist1 RX10_TEMP21 = p2.distValue;

					final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;

					final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, pt);

					final int RX10_TEMP24 = 0;

					final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
					if(RX10_TEMP25)
						{

						String RX10_TEMP26 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP26);

						}

					final Dist SX10_TEMP2 = RX10_TEMP21.dDist;

					final int RX10_TEMP27 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP23);

					final int RX10_TEMP29 = 0;

					final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;
					if(RX10_TEMP30)
						{

						String RX10_TEMP28 = "Bad place access for array p2";
throw new RuntimeException(RX10_TEMP28);

						}

					final BYTEArray RX10_TEMP31 = p2.contents;

					final byte X10_TEMP12 = (byte)Program.BYTEGetValue(RX10_TEMP31, RX10_TEMP23);

					final boolean X10_TEMP14 = X10_TEMP11 != X10_TEMP12;
					if(X10_TEMP14)
						{

						final String X10_TEMP16 = "Validation failed";
						System.out.println(X10_TEMP16);

						final String X10_TEMP17 = "Original Byte ";

						final String RX10_TEMP32 = Program.toStringPoint1(pt);

						final String X10_TEMP18 = X10_TEMP17 + RX10_TEMP32;

						final String X10_TEMP19 = " = ";

						final String X10_TEMP21 = X10_TEMP18 + X10_TEMP19;

						final Dist1 RX10_TEMP33 = p1.distValue;

						final Region1 RX10_TEMP34 = RX10_TEMP33.dReg;

						final int RX10_TEMP35 = Program.searchPointInRegion1(RX10_TEMP34, pt);

						final int RX10_TEMP36 = 0;

						final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36;
						if(RX10_TEMP37)
							{

							String RX10_TEMP38 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP38);

							}

						final Dist SX10_TEMP3 = RX10_TEMP33.dDist;

						final int RX10_TEMP39 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP35);

						final int RX10_TEMP41 = 0;

						final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41;
						if(RX10_TEMP42)
							{

							String RX10_TEMP40 = "Bad place access for array p1";
throw new RuntimeException(RX10_TEMP40);

							}

						final BYTEArray RX10_TEMP43 = p1.contents;

						final byte X10_TEMP22 = (byte)Program.BYTEGetValue(RX10_TEMP43, RX10_TEMP35);

						final String X10_TEMP24 = X10_TEMP21 + X10_TEMP22;
						System.out.println(X10_TEMP24);

						final String X10_TEMP25 = "Encrypted Byte ";

						final String RX10_TEMP44 = Program.toStringPoint1(pt);

						final String X10_TEMP26 = X10_TEMP25 + RX10_TEMP44;

						final String X10_TEMP27 = " = ";

						final String X10_TEMP29 = X10_TEMP26 + X10_TEMP27;

						final Dist1 RX10_TEMP45 = c1.distValue;

						final Region1 RX10_TEMP46 = RX10_TEMP45.dReg;

						final int RX10_TEMP47 = Program.searchPointInRegion1(RX10_TEMP46, pt);

						final int RX10_TEMP48 = 0;

						final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48;
						if(RX10_TEMP49)
							{

							String RX10_TEMP50 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP50);

							}

						final Dist SX10_TEMP4 = RX10_TEMP45.dDist;

						final int RX10_TEMP51 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP47);

						final int RX10_TEMP53 = 0;

						final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53;
						if(RX10_TEMP54)
							{

							String RX10_TEMP52 = "Bad place access for array c1";
throw new RuntimeException(RX10_TEMP52);

							}

						final BYTEArray RX10_TEMP55 = c1.contents;

						final byte X10_TEMP30 = (byte)Program.BYTEGetValue(RX10_TEMP55, RX10_TEMP47);

						final String X10_TEMP32 = X10_TEMP29 + X10_TEMP30;
						System.out.println(X10_TEMP32);

						final String X10_TEMP33 = "Decrypted Byte ";

						final String RX10_TEMP56 = Program.toStringPoint1(pt);

						final String X10_TEMP34 = X10_TEMP33 + RX10_TEMP56;

						final String X10_TEMP35 = " = ";

						final String X10_TEMP37 = X10_TEMP34 + X10_TEMP35;

						final Dist1 RX10_TEMP57 = p2.distValue;

						final Region1 RX10_TEMP58 = RX10_TEMP57.dReg;

						final int RX10_TEMP59 = Program.searchPointInRegion1(RX10_TEMP58, pt);

						final int RX10_TEMP60 = 0;

						final boolean RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60;
						if(RX10_TEMP61)
							{

							String RX10_TEMP62 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP62);

							}

						final Dist SX10_TEMP5 = RX10_TEMP57.dDist;

						final int RX10_TEMP63 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP59);

						final int RX10_TEMP65 = 0;

						final boolean RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65;
						if(RX10_TEMP66)
							{

							String RX10_TEMP64 = "Bad place access for array p2";
throw new RuntimeException(RX10_TEMP64);

							}

						final BYTEArray RX10_TEMP67 = p2.contents;

						final byte X10_TEMP38 = (byte)Program.BYTEGetValue(RX10_TEMP67, RX10_TEMP59);

						final String X10_TEMP40 = X10_TEMP37 + X10_TEMP38;
						System.out.println(X10_TEMP40);

						final String X10_TEMP42 = "Validation failed";
throw new RuntimeException(X10_TEMP42);

						}
					}
				}
			}
		}
public static void IDEATest_Do ( final IDEATest X10_TEMP0)		{

		final byteRefArray1 p1 = X10_TEMP0.plain1;

		final byteRefArray1 c1 = X10_TEMP0.crypt1;

		final byteRefArray1 p2 = X10_TEMP0.plain2;

		final intValArray1 fzr = X10_TEMP0.ZR;

		final intValArray1 fdkr = X10_TEMP0.DKR;
					{

			final Dist1 X10_TEMP7 = Program.getUniqueDist();

			final Region1 RX10_TEMP1 = X10_TEMP7.dReg;

			final Point1[] RX10_TEMP2 = RX10_TEMP1.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
				{

				final Point1 pt = RX10_TEMP2[RX10_TEMP0];

				final Dist1 X10_TEMP8 = X10_TEMP7;

				final Region1 RX10_TEMP3 = X10_TEMP8.dReg;

				final int RX10_TEMP4 = Program.searchPointInRegion1(RX10_TEMP3, pt);

				final int RX10_TEMP5 = 0;

				final boolean RX10_TEMP6 = RX10_TEMP4 < RX10_TEMP5;
				if(RX10_TEMP6)
					{

					final String RX10_TEMP7 = "Point pt not found in the distribution X10_TEMP8.";
throw new RuntimeException(RX10_TEMP7);

					}

				final Dist SX10_TEMP0 = X10_TEMP8.dDist;

				final int RX10_TEMP8 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);

				final int X10_TEMP9 = RX10_TEMP8;
				//async(X10_TEMP9)
					{
					Program.IDEATest_cipher_idea(X10_TEMP0, p1, c1, fzr);
					Program.IDEATest_cipher_idea(X10_TEMP0, c1, p2, fdkr);
					}
				}
			}
		}
public static void IDEATest_buildTestData ( final IDEATest X10_TEMP0)		{

		long X10_TEMP2 = 136506717L;

		final Random rndnum = new Random(X10_TEMP2);

		final int X10_TEMP6 = 0;

		final int X10_TEMP7 = 7;

		final Region1 rUserKey = Program.createNewRegion1R(X10_TEMP6, X10_TEMP7);

		final int X10_TEMP9 = 0;

		final Dist1 dUserKey = Program.getPlaceDist1(rUserKey, X10_TEMP9);

		final Region1 RX10_TEMP0 = dUserKey.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = dUserKey.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);

		final intRefArray1 RX10_TEMP4 = new intRefArray1(dUserKey, RX10_TEMP3);

		final intRefArray1 tUserKey = RX10_TEMP4;

		final Point1[] RX10_TEMP6 = rUserKey.pointArray;
		for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP6.length; RX10_TEMP5++)
			{

			final Point1 pt = RX10_TEMP6[RX10_TEMP5];

			final int X10_TEMP14 = Program.Random_nextInt(rndnum);

			final int X10_TEMP17 = (short)X10_TEMP14;

			final int X10_TEMP18 = X10_TEMP17;

			final Dist1 RX10_TEMP7 = tUserKey.distValue;

			final Region1 RX10_TEMP8 = RX10_TEMP7.dReg;

			final int RX10_TEMP9 = Program.searchPointInRegion1(RX10_TEMP8, pt);

			final int RX10_TEMP10 = 0;

			final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10;
			if(RX10_TEMP11)
				{

				String RX10_TEMP12 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP12);

				}

			final Dist SX10_TEMP0 = RX10_TEMP7.dDist;

			final int RX10_TEMP13 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP9);

			final int RX10_TEMP15 = 0;

			final boolean RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15;
			if(RX10_TEMP16)
				{

				String RX10_TEMP14 = "Bad place access for array tUserKey";
throw new RuntimeException(RX10_TEMP14);

				}

			final INTArray RX10_TEMP17 = tUserKey.contents;
			Program.INTSetValue(RX10_TEMP17, RX10_TEMP9, X10_TEMP18);
			}

		final Region1 RX10_TEMP18 = rUserKey;

		final int RX10_TEMP33 = rUserKey.pointArray.length;

		final int RX10_TEMP34 = 1;

		final int RX10_TEMP35 = RX10_TEMP33 - RX10_TEMP34;

		final int  RX10_TEMP32 = RX10_TEMP35+1;

		final int[] RX10_TEMP36 = (int[])(new int/*value*/[RX10_TEMP32]);
/*arrayInitBlock*/
for(int RX10_TEMP19= 0;RX10_TEMP19 <RX10_TEMP36.length ;RX10_TEMP19++ )			{

			final Point1[] RX10_TEMP20 = RX10_TEMP18.pointArray;

			final Point1 pt = RX10_TEMP20[RX10_TEMP19];

			final Dist1 RX10_TEMP21 = tUserKey.distValue;

			final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;

			final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, pt);

			final int RX10_TEMP24 = 0;

			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if(RX10_TEMP25)
				{

				String RX10_TEMP26 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP26);

				}

			final Dist SX10_TEMP1 = RX10_TEMP21.dDist;

			final int RX10_TEMP27 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP23);

			final int RX10_TEMP29 = 0;

			final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;
			if(RX10_TEMP30)
				{

				String RX10_TEMP28 = "Bad place access for array tUserKey";
throw new RuntimeException(RX10_TEMP28);

				}

			final INTArray RX10_TEMP31 = tUserKey.contents;

			final int X10_TEMP21 = Program.INTGetValue(RX10_TEMP31, RX10_TEMP23);
			RX10_TEMP36[RX10_TEMP19] =X10_TEMP21;
			}

;

		final intValArray1 RX10_TEMP37 = new intValArray1(rUserKey, RX10_TEMP36);

		final intValArray1 X10_TEMP22 = RX10_TEMP37;

		final intValArray1 X10_TEMP25 = X10_TEMP22;
		X10_TEMP0.userkey = (X10_TEMP25);
		Program.IDEATest_calcEncryptKey(X10_TEMP0);
		Program.IDEATest_calcDecryptKey(X10_TEMP0);
		}
public static void IDEATest_calcEncryptKey ( final IDEATest X10_TEMP0)		{

		int j = 0;

		final int X10_TEMP4 = 0;

		final int X10_TEMP5 = 51;

		final Region1 rZ = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5);

		final int X10_TEMP7 = 0;

		final Dist1 dZ = Program.getPlaceDist1(rZ, X10_TEMP7);

		final Region1 RX10_TEMP0 = dZ.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = dZ.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);

		final intRefArray1 RX10_TEMP4 = new intRefArray1(dZ, RX10_TEMP3);

		final intRefArray1 Z = RX10_TEMP4;

		final int X10_TEMP12 = 0;

		final int X10_TEMP13 = 7;

		final Region1 X10_TEMP15 = Program.createNewRegion1R(X10_TEMP12, X10_TEMP13);

		final Point1[] RX10_TEMP7 = X10_TEMP15.pointArray;
		for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP7.length; RX10_TEMP5++)
			{

			final Point1 RX10_TEMP6 = RX10_TEMP7[RX10_TEMP5];

			final int i = RX10_TEMP6.f0;

			final intValArray1 X10_TEMP17 = X10_TEMP0.userkey;

			final Point1 RX10_TEMP8 = new Point1(i);

			final Region1 RX10_TEMP9 = X10_TEMP17.regionValue;

			final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP8);

			final int RX10_TEMP11 = 0;

			final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
			if(RX10_TEMP12)
				{

				String RX10_TEMP13 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP13);

				}

			final int[] RX10_TEMP14 = (int[])(X10_TEMP17.contents);

			final int X10_TEMP19 = RX10_TEMP14[RX10_TEMP10];

			final int X10_TEMP20 = 0xffff;

			final int X10_TEMP23 = X10_TEMP19 & X10_TEMP20;

			final int X10_TEMP24 = X10_TEMP23;

			final Point1 RX10_TEMP15 = new Point1(i);

			final Dist1 RX10_TEMP16 = Z.distValue;

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

				String RX10_TEMP23 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP23);

				}

			final INTArray RX10_TEMP26 = Z.contents;
			Program.INTSetValue(RX10_TEMP26, RX10_TEMP18, X10_TEMP24);
			}

		final int X10_TEMP27 = 8;

		final int X10_TEMP28 = 51;

		final Region1 X10_TEMP30 = Program.createNewRegion1R(X10_TEMP27, X10_TEMP28);

		final Point1[] RX10_TEMP29 = X10_TEMP30.pointArray;
		for(int RX10_TEMP27=0; RX10_TEMP27 < RX10_TEMP29.length; RX10_TEMP27++)
			{

			final Point1 RX10_TEMP28 = RX10_TEMP29[RX10_TEMP27];

			final int i = RX10_TEMP28.f0;

			final int X10_TEMP31 = 8;

			final int X10_TEMP33 = i % X10_TEMP31;

			j = X10_TEMP33;

			final int X10_TEMP34 = 6;

			final boolean X10_TEMP36 = j < X10_TEMP34;
			if(X10_TEMP36)
				{

				final int X10_TEMP38 = 7;

				final int X10_TEMP40 = i - X10_TEMP38;

				final Point1 RX10_TEMP30 = new Point1(X10_TEMP40);

				final Dist1 RX10_TEMP31 = Z.distValue;

				final Region1 RX10_TEMP32 = RX10_TEMP31.dReg;

				final int RX10_TEMP33 = Program.searchPointInRegion1(RX10_TEMP32, RX10_TEMP30);

				final int RX10_TEMP34 = 0;

				final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34;
				if(RX10_TEMP35)
					{

					String RX10_TEMP36 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP36);

					}

				final Dist SX10_TEMP1 = RX10_TEMP31.dDist;

				final int RX10_TEMP37 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP33);

				final int RX10_TEMP39 = 0;

				final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39;
				if(RX10_TEMP40)
					{

					String RX10_TEMP38 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP38);

					}

				final INTArray RX10_TEMP41 = Z.contents;

				final int X10_TEMP41 = Program.INTGetValue(RX10_TEMP41, RX10_TEMP33);

				final int X10_TEMP42 = 9;

				final int X10_TEMP44 = X10_TEMP41 >>> X10_TEMP42;

				final int X10_TEMP45 = 6;

				final int X10_TEMP47 = i - X10_TEMP45;

				final Point1 RX10_TEMP42 = new Point1(X10_TEMP47);

				final Dist1 RX10_TEMP43 = Z.distValue;

				final Region1 RX10_TEMP44 = RX10_TEMP43.dReg;

				final int RX10_TEMP45 = Program.searchPointInRegion1(RX10_TEMP44, RX10_TEMP42);

				final int RX10_TEMP46 = 0;

				final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
				if(RX10_TEMP47)
					{

					String RX10_TEMP48 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP48);

					}

				final Dist SX10_TEMP2 = RX10_TEMP43.dDist;

				final int RX10_TEMP49 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP45);

				final int RX10_TEMP51 = 0;

				final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
				if(RX10_TEMP52)
					{

					String RX10_TEMP50 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP50);

					}

				final INTArray RX10_TEMP53 = Z.contents;

				final int X10_TEMP48 = Program.INTGetValue(RX10_TEMP53, RX10_TEMP45);

				final int X10_TEMP49 = 7;

				final int X10_TEMP51 = X10_TEMP48 << X10_TEMP49;

				final int X10_TEMP53 = X10_TEMP44 | X10_TEMP51;

				final int X10_TEMP54 = 0xFFFF;

				final int X10_TEMP57 = X10_TEMP53 & X10_TEMP54;

				final int X10_TEMP58 = X10_TEMP57;

				final Point1 RX10_TEMP54 = new Point1(i);

				final Dist1 RX10_TEMP55 = Z.distValue;

				final Region1 RX10_TEMP56 = RX10_TEMP55.dReg;

				final int RX10_TEMP57 = Program.searchPointInRegion1(RX10_TEMP56, RX10_TEMP54);

				final int RX10_TEMP58 = 0;

				final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58;
				if(RX10_TEMP59)
					{

					String RX10_TEMP60 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP60);

					}

				final Dist SX10_TEMP3 = RX10_TEMP55.dDist;

				final int RX10_TEMP61 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP57);

				final int RX10_TEMP63 = 0;

				final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63;
				if(RX10_TEMP64)
					{

					String RX10_TEMP62 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP62);

					}

				final INTArray RX10_TEMP65 = Z.contents;
				Program.INTSetValue(RX10_TEMP65, RX10_TEMP57, X10_TEMP58);
				continue;
				}

			final int X10_TEMP59 = 6;

			final boolean X10_TEMP61 = j == X10_TEMP59;
			if(X10_TEMP61)
				{

				final int X10_TEMP63 = 7;

				final int X10_TEMP65 = i - X10_TEMP63;

				final Point1 RX10_TEMP66 = new Point1(X10_TEMP65);

				final Dist1 RX10_TEMP67 = Z.distValue;

				final Region1 RX10_TEMP68 = RX10_TEMP67.dReg;

				final int RX10_TEMP69 = Program.searchPointInRegion1(RX10_TEMP68, RX10_TEMP66);

				final int RX10_TEMP70 = 0;

				final boolean RX10_TEMP71 = RX10_TEMP69 < RX10_TEMP70;
				if(RX10_TEMP71)
					{

					String RX10_TEMP72 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP72);

					}

				final Dist SX10_TEMP4 = RX10_TEMP67.dDist;

				final int RX10_TEMP73 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP69);

				final int RX10_TEMP75 = 0;

				final boolean RX10_TEMP76 = RX10_TEMP73 != RX10_TEMP75;
				if(RX10_TEMP76)
					{

					String RX10_TEMP74 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP74);

					}

				final INTArray RX10_TEMP77 = Z.contents;

				final int X10_TEMP66 = Program.INTGetValue(RX10_TEMP77, RX10_TEMP69);

				final int X10_TEMP67 = 9;

				final int X10_TEMP69 = X10_TEMP66 >>> X10_TEMP67;

				final int X10_TEMP70 = 14;

				final int X10_TEMP72 = i - X10_TEMP70;

				final Point1 RX10_TEMP78 = new Point1(X10_TEMP72);

				final Dist1 RX10_TEMP79 = Z.distValue;

				final Region1 RX10_TEMP80 = RX10_TEMP79.dReg;

				final int RX10_TEMP81 = Program.searchPointInRegion1(RX10_TEMP80, RX10_TEMP78);

				final int RX10_TEMP82 = 0;

				final boolean RX10_TEMP83 = RX10_TEMP81 < RX10_TEMP82;
				if(RX10_TEMP83)
					{

					String RX10_TEMP84 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP84);

					}

				final Dist SX10_TEMP5 = RX10_TEMP79.dDist;

				final int RX10_TEMP85 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP81);

				final int RX10_TEMP87 = 0;

				final boolean RX10_TEMP88 = RX10_TEMP85 != RX10_TEMP87;
				if(RX10_TEMP88)
					{

					String RX10_TEMP86 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP86);

					}

				final INTArray RX10_TEMP89 = Z.contents;

				final int X10_TEMP73 = Program.INTGetValue(RX10_TEMP89, RX10_TEMP81);

				final int X10_TEMP74 = 7;

				final int X10_TEMP76 = X10_TEMP73 << X10_TEMP74;

				final int X10_TEMP78 = X10_TEMP69 | X10_TEMP76;

				final int X10_TEMP79 = 0xFFFF;

				final int X10_TEMP82 = X10_TEMP78 & X10_TEMP79;

				final int X10_TEMP83 = X10_TEMP82;

				final Point1 RX10_TEMP90 = new Point1(i);

				final Dist1 RX10_TEMP91 = Z.distValue;

				final Region1 RX10_TEMP92 = RX10_TEMP91.dReg;

				final int RX10_TEMP93 = Program.searchPointInRegion1(RX10_TEMP92, RX10_TEMP90);

				final int RX10_TEMP94 = 0;

				final boolean RX10_TEMP95 = RX10_TEMP93 < RX10_TEMP94;
				if(RX10_TEMP95)
					{

					String RX10_TEMP96 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP96);

					}

				final Dist SX10_TEMP6 = RX10_TEMP91.dDist;

				final int RX10_TEMP97 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP93);

				final int RX10_TEMP99 = 0;

				final boolean RX10_TEMP100 = RX10_TEMP97 != RX10_TEMP99;
				if(RX10_TEMP100)
					{

					String RX10_TEMP98 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP98);

					}

				final INTArray RX10_TEMP101 = Z.contents;
				Program.INTSetValue(RX10_TEMP101, RX10_TEMP93, X10_TEMP83);
				continue;
				}

			final int X10_TEMP85 = 15;

			final int X10_TEMP87 = i - X10_TEMP85;

			final Point1 RX10_TEMP102 = new Point1(X10_TEMP87);

			final Dist1 RX10_TEMP103 = Z.distValue;

			final Region1 RX10_TEMP104 = RX10_TEMP103.dReg;

			final int RX10_TEMP105 = Program.searchPointInRegion1(RX10_TEMP104, RX10_TEMP102);

			final int RX10_TEMP106 = 0;

			final boolean RX10_TEMP107 = RX10_TEMP105 < RX10_TEMP106;
			if(RX10_TEMP107)
				{

				String RX10_TEMP108 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP108);

				}

			final Dist SX10_TEMP7 = RX10_TEMP103.dDist;

			final int RX10_TEMP109 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP105);

			final int RX10_TEMP111 = 0;

			final boolean RX10_TEMP112 = RX10_TEMP109 != RX10_TEMP111;
			if(RX10_TEMP112)
				{

				String RX10_TEMP110 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP110);

				}

			final INTArray RX10_TEMP113 = Z.contents;

			final int X10_TEMP88 = Program.INTGetValue(RX10_TEMP113, RX10_TEMP105);

			final int X10_TEMP89 = 9;

			final int X10_TEMP91 = X10_TEMP88 >>> X10_TEMP89;

			final int X10_TEMP92 = 14;

			final int X10_TEMP94 = i - X10_TEMP92;

			final Point1 RX10_TEMP114 = new Point1(X10_TEMP94);

			final Dist1 RX10_TEMP115 = Z.distValue;

			final Region1 RX10_TEMP116 = RX10_TEMP115.dReg;

			final int RX10_TEMP117 = Program.searchPointInRegion1(RX10_TEMP116, RX10_TEMP114);

			final int RX10_TEMP118 = 0;

			final boolean RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118;
			if(RX10_TEMP119)
				{

				String RX10_TEMP120 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP120);

				}

			final Dist SX10_TEMP8 = RX10_TEMP115.dDist;

			final int RX10_TEMP121 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP117);

			final int RX10_TEMP123 = 0;

			final boolean RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123;
			if(RX10_TEMP124)
				{

				String RX10_TEMP122 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP122);

				}

			final INTArray RX10_TEMP125 = Z.contents;

			final int X10_TEMP95 = Program.INTGetValue(RX10_TEMP125, RX10_TEMP117);

			final int X10_TEMP96 = 7;

			final int X10_TEMP98 = X10_TEMP95 << X10_TEMP96;

			final int X10_TEMP100 = X10_TEMP91 | X10_TEMP98;

			final int X10_TEMP101 = 0xFFFF;

			final int X10_TEMP104 = X10_TEMP100 & X10_TEMP101;

			final int X10_TEMP105 = X10_TEMP104;

			final Point1 RX10_TEMP126 = new Point1(i);

			final Dist1 RX10_TEMP127 = Z.distValue;

			final Region1 RX10_TEMP128 = RX10_TEMP127.dReg;

			final int RX10_TEMP129 = Program.searchPointInRegion1(RX10_TEMP128, RX10_TEMP126);

			final int RX10_TEMP130 = 0;

			final boolean RX10_TEMP131 = RX10_TEMP129 < RX10_TEMP130;
			if(RX10_TEMP131)
				{

				String RX10_TEMP132 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP132);

				}

			final Dist SX10_TEMP9 = RX10_TEMP127.dDist;

			final int RX10_TEMP133 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP129);

			final int RX10_TEMP135 = 0;

			final boolean RX10_TEMP136 = RX10_TEMP133 != RX10_TEMP135;
			if(RX10_TEMP136)
				{

				String RX10_TEMP134 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP134);

				}

			final INTArray RX10_TEMP137 = Z.contents;
			Program.INTSetValue(RX10_TEMP137, RX10_TEMP129, X10_TEMP105);
			}

		final Region1 RX10_TEMP138 = rZ;

		final int RX10_TEMP153 = rZ.pointArray.length;

		final int RX10_TEMP154 = 1;

		final int RX10_TEMP155 = RX10_TEMP153 - RX10_TEMP154;

		final int  RX10_TEMP152 = RX10_TEMP155+1;

		final int[] RX10_TEMP156 = (int[])(new int/*value*/[RX10_TEMP152]);
/*arrayInitBlock*/
for(int RX10_TEMP139= 0;RX10_TEMP139 <RX10_TEMP156.length ;RX10_TEMP139++ )			{

			final Point1[] RX10_TEMP140 = RX10_TEMP138.pointArray;

			final Point1 pt = RX10_TEMP140[RX10_TEMP139];

			final Dist1 RX10_TEMP141 = Z.distValue;

			final Region1 RX10_TEMP142 = RX10_TEMP141.dReg;

			final int RX10_TEMP143 = Program.searchPointInRegion1(RX10_TEMP142, pt);

			final int RX10_TEMP144 = 0;

			final boolean RX10_TEMP145 = RX10_TEMP143 < RX10_TEMP144;
			if(RX10_TEMP145)
				{

				String RX10_TEMP146 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP146);

				}

			final Dist SX10_TEMP10 = RX10_TEMP141.dDist;

			final int RX10_TEMP147 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP143);

			final int RX10_TEMP149 = 0;

			final boolean RX10_TEMP150 = RX10_TEMP147 != RX10_TEMP149;
			if(RX10_TEMP150)
				{

				String RX10_TEMP148 = "Bad place access for array Z";
throw new RuntimeException(RX10_TEMP148);

				}

			final INTArray RX10_TEMP151 = Z.contents;

			final int X10_TEMP108 = Program.INTGetValue(RX10_TEMP151, RX10_TEMP143);
			RX10_TEMP156[RX10_TEMP139] =X10_TEMP108;
			}

;

		final intValArray1 RX10_TEMP157 = new intValArray1(rZ, RX10_TEMP156);

		final intValArray1 X10_TEMP109 = RX10_TEMP157;

		final intValArray1 X10_TEMP112 = X10_TEMP109;
		X10_TEMP0.ZR = (X10_TEMP112);
		}
public static void IDEATest_calcDecryptKey ( final IDEATest X10_TEMP0)		{

		int j = 0;

		int k = 0;

		int t1 = 0;

		int t2 = 0;

		int t3 = 0;

		final int X10_TEMP8 = 0;

		final int X10_TEMP9 = 51;

		final Region1 rDK = Program.createNewRegion1R(X10_TEMP8, X10_TEMP9);

		final int X10_TEMP11 = 0;

		final Dist1 dDK = Program.getPlaceDist1(rDK, X10_TEMP11);

		final Region1 RX10_TEMP0 = dDK.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = dDK.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);

		final intRefArray1 RX10_TEMP4 = new intRefArray1(dDK, RX10_TEMP3);

		final intRefArray1 DK = RX10_TEMP4;

		final intValArray1 Z = X10_TEMP0.ZR;

		final int X10_TEMP16 = 0;

		final Point1 RX10_TEMP5 = new Point1(X10_TEMP16);

		final Region1 RX10_TEMP6 = Z.regionValue;

		final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, RX10_TEMP5);

		final int RX10_TEMP8 = 0;

		final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
		if(RX10_TEMP9)
			{

			String RX10_TEMP10 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP10);

			}

		final int[] RX10_TEMP11 = (int[])(Z.contents);

		final int X10_TEMP18 = RX10_TEMP11[RX10_TEMP7];

		final int X10_TEMP20 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP18);

		t1 = X10_TEMP20;

		final int X10_TEMP22 = 1;

		final Point1 RX10_TEMP12 = new Point1(X10_TEMP22);

		final Region1 RX10_TEMP13 = Z.regionValue;

		final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13, RX10_TEMP12);

		final int RX10_TEMP15 = 0;

		final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;
		if(RX10_TEMP16)
			{

			String RX10_TEMP17 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP17);

			}

		final int[] RX10_TEMP18 = (int[])(Z.contents);

		final int X10_TEMP23 = RX10_TEMP18[RX10_TEMP14];

		final int X10_TEMP24 = 0;

		final int X10_TEMP25 = X10_TEMP24 - X10_TEMP23;

		final int X10_TEMP26 = 0xffff;

		final int X10_TEMP28 = X10_TEMP25 & X10_TEMP26;

		t2 = X10_TEMP28;

		final int X10_TEMP30 = 2;

		final Point1 RX10_TEMP19 = new Point1(X10_TEMP30);

		final Region1 RX10_TEMP20 = Z.regionValue;

		final int RX10_TEMP21 = Program.searchPointInRegion1(RX10_TEMP20, RX10_TEMP19);

		final int RX10_TEMP22 = 0;

		final boolean RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22;
		if(RX10_TEMP23)
			{

			String RX10_TEMP24 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP24);

			}

		final int[] RX10_TEMP25 = (int[])(Z.contents);

		final int X10_TEMP31 = RX10_TEMP25[RX10_TEMP21];

		final int X10_TEMP32 = 0;

		final int X10_TEMP33 = X10_TEMP32 - X10_TEMP31;

		final int X10_TEMP34 = 0xffff;

		final int X10_TEMP36 = X10_TEMP33 & X10_TEMP34;

		t3 = X10_TEMP36;

		final int X10_TEMP38 = 51;

		final int X10_TEMP40 = 3;

		final Point1 RX10_TEMP26 = new Point1(X10_TEMP40);

		final Region1 RX10_TEMP27 = Z.regionValue;

		final int RX10_TEMP28 = Program.searchPointInRegion1(RX10_TEMP27, RX10_TEMP26);

		final int RX10_TEMP29 = 0;

		final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29;
		if(RX10_TEMP30)
			{

			String RX10_TEMP31 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP31);

			}

		final int[] RX10_TEMP32 = (int[])(Z.contents);

		final int X10_TEMP42 = RX10_TEMP32[RX10_TEMP28];

		final int X10_TEMP45 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP42);

		final int X10_TEMP46 = X10_TEMP45;

		final Point1 RX10_TEMP33 = new Point1(X10_TEMP38);

		final Dist1 RX10_TEMP34 = DK.distValue;

		final Region1 RX10_TEMP35 = RX10_TEMP34.dReg;

		final int RX10_TEMP36 = Program.searchPointInRegion1(RX10_TEMP35, RX10_TEMP33);

		final int RX10_TEMP37 = 0;

		final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
		if(RX10_TEMP38)
			{

			String RX10_TEMP39 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP39);

			}

		final Dist SX10_TEMP0 = RX10_TEMP34.dDist;

		final int RX10_TEMP40 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP36);

		final int RX10_TEMP42 = 0;

		final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
		if(RX10_TEMP43)
			{

			String RX10_TEMP41 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP41);

			}

		final INTArray RX10_TEMP44 = DK.contents;
		Program.INTSetValue(RX10_TEMP44, RX10_TEMP36, X10_TEMP46);

		final int X10_TEMP48 = 50;

		final int X10_TEMP51 = t3;

		final Point1 RX10_TEMP45 = new Point1(X10_TEMP48);

		final Dist1 RX10_TEMP46 = DK.distValue;

		final Region1 RX10_TEMP47 = RX10_TEMP46.dReg;

		final int RX10_TEMP48 = Program.searchPointInRegion1(RX10_TEMP47, RX10_TEMP45);

		final int RX10_TEMP49 = 0;

		final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49;
		if(RX10_TEMP50)
			{

			String RX10_TEMP51 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP51);

			}

		final Dist SX10_TEMP1 = RX10_TEMP46.dDist;

		final int RX10_TEMP52 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP48);

		final int RX10_TEMP54 = 0;

		final boolean RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54;
		if(RX10_TEMP55)
			{

			String RX10_TEMP53 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP53);

			}

		final INTArray RX10_TEMP56 = DK.contents;
		Program.INTSetValue(RX10_TEMP56, RX10_TEMP48, X10_TEMP51);

		final int X10_TEMP53 = 49;

		final int X10_TEMP56 = t2;

		final Point1 RX10_TEMP57 = new Point1(X10_TEMP53);

		final Dist1 RX10_TEMP58 = DK.distValue;

		final Region1 RX10_TEMP59 = RX10_TEMP58.dReg;

		final int RX10_TEMP60 = Program.searchPointInRegion1(RX10_TEMP59, RX10_TEMP57);

		final int RX10_TEMP61 = 0;

		final boolean RX10_TEMP62 = RX10_TEMP60 < RX10_TEMP61;
		if(RX10_TEMP62)
			{

			String RX10_TEMP63 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP63);

			}

		final Dist SX10_TEMP2 = RX10_TEMP58.dDist;

		final int RX10_TEMP64 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP60);

		final int RX10_TEMP66 = 0;

		final boolean RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66;
		if(RX10_TEMP67)
			{

			String RX10_TEMP65 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP65);

			}

		final INTArray RX10_TEMP68 = DK.contents;
		Program.INTSetValue(RX10_TEMP68, RX10_TEMP60, X10_TEMP56);

		final int X10_TEMP58 = 48;

		final int X10_TEMP61 = t1;

		final Point1 RX10_TEMP69 = new Point1(X10_TEMP58);

		final Dist1 RX10_TEMP70 = DK.distValue;

		final Region1 RX10_TEMP71 = RX10_TEMP70.dReg;

		final int RX10_TEMP72 = Program.searchPointInRegion1(RX10_TEMP71, RX10_TEMP69);

		final int RX10_TEMP73 = 0;

		final boolean RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73;
		if(RX10_TEMP74)
			{

			String RX10_TEMP75 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP75);

			}

		final Dist SX10_TEMP3 = RX10_TEMP70.dDist;

		final int RX10_TEMP76 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP72);

		final int RX10_TEMP78 = 0;

		final boolean RX10_TEMP79 = RX10_TEMP76 != RX10_TEMP78;
		if(RX10_TEMP79)
			{

			String RX10_TEMP77 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP77);

			}

		final INTArray RX10_TEMP80 = DK.contents;
		Program.INTSetValue(RX10_TEMP80, RX10_TEMP72, X10_TEMP61);

		final int X10_TEMP63 = 47;

		j = X10_TEMP63;

		final int X10_TEMP65 = 4;

		k = X10_TEMP65;

		final int X10_TEMP68 = 0;

		final int X10_TEMP69 = 6;

		final Region1 X10_TEMP71 = Program.createNewRegion1R(X10_TEMP68, X10_TEMP69);

		final Point1[] RX10_TEMP83 = X10_TEMP71.pointArray;
		for(int RX10_TEMP81=0; RX10_TEMP81 < RX10_TEMP83.length; RX10_TEMP81++)
			{

			final Point1 RX10_TEMP82 = RX10_TEMP83[RX10_TEMP81];

			final int i = RX10_TEMP82.f0;

			final int X10_TEMP72 = k;

			final int X10_TEMP73 = 1;

			k = k + X10_TEMP73;

			final Point1 RX10_TEMP84 = new Point1(X10_TEMP72);

			final Region1 RX10_TEMP85 = Z.regionValue;

			final int RX10_TEMP86 = Program.searchPointInRegion1(RX10_TEMP85, RX10_TEMP84);

			final int RX10_TEMP87 = 0;

			final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87;
			if(RX10_TEMP88)
				{

				String RX10_TEMP89 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP89);

				}

			final int[] RX10_TEMP90 = (int[])(Z.contents);

			final int X10_TEMP76 = RX10_TEMP90[RX10_TEMP86];

			t1 = X10_TEMP76;

			final int X10_TEMP77 = j;

			final int X10_TEMP78 = 1;

			j = j - X10_TEMP78;

			final int X10_TEMP80 = k;

			final int X10_TEMP81 = 1;

			k = k + X10_TEMP81;

			final Point1 RX10_TEMP91 = new Point1(X10_TEMP80);

			final Region1 RX10_TEMP92 = Z.regionValue;

			final int RX10_TEMP93 = Program.searchPointInRegion1(RX10_TEMP92, RX10_TEMP91);

			final int RX10_TEMP94 = 0;

			final boolean RX10_TEMP95 = RX10_TEMP93 < RX10_TEMP94;
			if(RX10_TEMP95)
				{

				String RX10_TEMP96 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP96);

				}

			final int[] RX10_TEMP97 = (int[])(Z.contents);

			final int X10_TEMP85 = RX10_TEMP97[RX10_TEMP93];

			final int X10_TEMP86 = X10_TEMP85;

			final Point1 RX10_TEMP98 = new Point1(X10_TEMP77);

			final Dist1 RX10_TEMP99 = DK.distValue;

			final Region1 RX10_TEMP100 = RX10_TEMP99.dReg;

			final int RX10_TEMP101 = Program.searchPointInRegion1(RX10_TEMP100, RX10_TEMP98);

			final int RX10_TEMP102 = 0;

			final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102;
			if(RX10_TEMP103)
				{

				String RX10_TEMP104 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP104);

				}

			final Dist SX10_TEMP4 = RX10_TEMP99.dDist;

			final int RX10_TEMP105 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP101);

			final int RX10_TEMP107 = 0;

			final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107;
			if(RX10_TEMP108)
				{

				String RX10_TEMP106 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP106);

				}

			final INTArray RX10_TEMP109 = DK.contents;
			Program.INTSetValue(RX10_TEMP109, RX10_TEMP101, X10_TEMP86);

			final int X10_TEMP87 = j;

			final int X10_TEMP88 = 1;

			j = j - X10_TEMP88;

			final int X10_TEMP92 = t1;

			final Point1 RX10_TEMP110 = new Point1(X10_TEMP87);

			final Dist1 RX10_TEMP111 = DK.distValue;

			final Region1 RX10_TEMP112 = RX10_TEMP111.dReg;

			final int RX10_TEMP113 = Program.searchPointInRegion1(RX10_TEMP112, RX10_TEMP110);

			final int RX10_TEMP114 = 0;

			final boolean RX10_TEMP115 = RX10_TEMP113 < RX10_TEMP114;
			if(RX10_TEMP115)
				{

				String RX10_TEMP116 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP116);

				}

			final Dist SX10_TEMP5 = RX10_TEMP111.dDist;

			final int RX10_TEMP117 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP113);

			final int RX10_TEMP119 = 0;

			final boolean RX10_TEMP120 = RX10_TEMP117 != RX10_TEMP119;
			if(RX10_TEMP120)
				{

				String RX10_TEMP118 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP118);

				}

			final INTArray RX10_TEMP121 = DK.contents;
			Program.INTSetValue(RX10_TEMP121, RX10_TEMP113, X10_TEMP92);

			final int X10_TEMP93 = k;

			final int X10_TEMP94 = 1;

			k = k + X10_TEMP94;

			final Point1 RX10_TEMP122 = new Point1(X10_TEMP93);

			final Region1 RX10_TEMP123 = Z.regionValue;

			final int RX10_TEMP124 = Program.searchPointInRegion1(RX10_TEMP123, RX10_TEMP122);

			final int RX10_TEMP125 = 0;

			final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125;
			if(RX10_TEMP126)
				{

				String RX10_TEMP127 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP127);

				}

			final int[] RX10_TEMP128 = (int[])(Z.contents);

			final int X10_TEMP97 = RX10_TEMP128[RX10_TEMP124];

			final int X10_TEMP99 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP97);

			t1 = X10_TEMP99;

			final int X10_TEMP100 = k;

			final int X10_TEMP101 = 1;

			k = k + X10_TEMP101;

			final Point1 RX10_TEMP129 = new Point1(X10_TEMP100);

			final Region1 RX10_TEMP130 = Z.regionValue;

			final int RX10_TEMP131 = Program.searchPointInRegion1(RX10_TEMP130, RX10_TEMP129);

			final int RX10_TEMP132 = 0;

			final boolean RX10_TEMP133 = RX10_TEMP131 < RX10_TEMP132;
			if(RX10_TEMP133)
				{

				String RX10_TEMP134 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP134);

				}

			final int[] RX10_TEMP135 = (int[])(Z.contents);

			final int X10_TEMP103 = RX10_TEMP135[RX10_TEMP131];

			final int X10_TEMP104 = 0;

			final int X10_TEMP105 = X10_TEMP104 - X10_TEMP103;

			final int X10_TEMP106 = 0xffff;

			final int X10_TEMP108 = X10_TEMP105 & X10_TEMP106;

			t2 = X10_TEMP108;

			final int X10_TEMP109 = k;

			final int X10_TEMP110 = 1;

			k = k + X10_TEMP110;

			final Point1 RX10_TEMP136 = new Point1(X10_TEMP109);

			final Region1 RX10_TEMP137 = Z.regionValue;

			final int RX10_TEMP138 = Program.searchPointInRegion1(RX10_TEMP137, RX10_TEMP136);

			final int RX10_TEMP139 = 0;

			final boolean RX10_TEMP140 = RX10_TEMP138 < RX10_TEMP139;
			if(RX10_TEMP140)
				{

				String RX10_TEMP141 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP141);

				}

			final int[] RX10_TEMP142 = (int[])(Z.contents);

			final int X10_TEMP112 = RX10_TEMP142[RX10_TEMP138];

			final int X10_TEMP113 = 0;

			final int X10_TEMP114 = X10_TEMP113 - X10_TEMP112;

			final int X10_TEMP115 = 0xffff;

			final int X10_TEMP117 = X10_TEMP114 & X10_TEMP115;

			t3 = X10_TEMP117;

			final int X10_TEMP118 = j;

			final int X10_TEMP119 = 1;

			j = j - X10_TEMP119;

			final int X10_TEMP121 = k;

			final int X10_TEMP122 = 1;

			k = k + X10_TEMP122;

			final Point1 RX10_TEMP143 = new Point1(X10_TEMP121);

			final Region1 RX10_TEMP144 = Z.regionValue;

			final int RX10_TEMP145 = Program.searchPointInRegion1(RX10_TEMP144, RX10_TEMP143);

			final int RX10_TEMP146 = 0;

			final boolean RX10_TEMP147 = RX10_TEMP145 < RX10_TEMP146;
			if(RX10_TEMP147)
				{

				String RX10_TEMP148 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP148);

				}

			final int[] RX10_TEMP149 = (int[])(Z.contents);

			final int X10_TEMP125 = RX10_TEMP149[RX10_TEMP145];

			final int X10_TEMP128 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP125);

			final int X10_TEMP129 = X10_TEMP128;

			final Point1 RX10_TEMP150 = new Point1(X10_TEMP118);

			final Dist1 RX10_TEMP151 = DK.distValue;

			final Region1 RX10_TEMP152 = RX10_TEMP151.dReg;

			final int RX10_TEMP153 = Program.searchPointInRegion1(RX10_TEMP152, RX10_TEMP150);

			final int RX10_TEMP154 = 0;

			final boolean RX10_TEMP155 = RX10_TEMP153 < RX10_TEMP154;
			if(RX10_TEMP155)
				{

				String RX10_TEMP156 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP156);

				}

			final Dist SX10_TEMP6 = RX10_TEMP151.dDist;

			final int RX10_TEMP157 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP153);

			final int RX10_TEMP159 = 0;

			final boolean RX10_TEMP160 = RX10_TEMP157 != RX10_TEMP159;
			if(RX10_TEMP160)
				{

				String RX10_TEMP158 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP158);

				}

			final INTArray RX10_TEMP161 = DK.contents;
			Program.INTSetValue(RX10_TEMP161, RX10_TEMP153, X10_TEMP129);

			final int X10_TEMP130 = j;

			final int X10_TEMP131 = 1;

			j = j - X10_TEMP131;

			final int X10_TEMP135 = t2;

			final Point1 RX10_TEMP162 = new Point1(X10_TEMP130);

			final Dist1 RX10_TEMP163 = DK.distValue;

			final Region1 RX10_TEMP164 = RX10_TEMP163.dReg;

			final int RX10_TEMP165 = Program.searchPointInRegion1(RX10_TEMP164, RX10_TEMP162);

			final int RX10_TEMP166 = 0;

			final boolean RX10_TEMP167 = RX10_TEMP165 < RX10_TEMP166;
			if(RX10_TEMP167)
				{

				String RX10_TEMP168 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP168);

				}

			final Dist SX10_TEMP7 = RX10_TEMP163.dDist;

			final int RX10_TEMP169 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP165);

			final int RX10_TEMP171 = 0;

			final boolean RX10_TEMP172 = RX10_TEMP169 != RX10_TEMP171;
			if(RX10_TEMP172)
				{

				String RX10_TEMP170 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP170);

				}

			final INTArray RX10_TEMP173 = DK.contents;
			Program.INTSetValue(RX10_TEMP173, RX10_TEMP165, X10_TEMP135);

			final int X10_TEMP136 = j;

			final int X10_TEMP137 = 1;

			j = j - X10_TEMP137;

			final int X10_TEMP141 = t3;

			final Point1 RX10_TEMP174 = new Point1(X10_TEMP136);

			final Dist1 RX10_TEMP175 = DK.distValue;

			final Region1 RX10_TEMP176 = RX10_TEMP175.dReg;

			final int RX10_TEMP177 = Program.searchPointInRegion1(RX10_TEMP176, RX10_TEMP174);

			final int RX10_TEMP178 = 0;

			final boolean RX10_TEMP179 = RX10_TEMP177 < RX10_TEMP178;
			if(RX10_TEMP179)
				{

				String RX10_TEMP180 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP180);

				}

			final Dist SX10_TEMP8 = RX10_TEMP175.dDist;

			final int RX10_TEMP181 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP177);

			final int RX10_TEMP183 = 0;

			final boolean RX10_TEMP184 = RX10_TEMP181 != RX10_TEMP183;
			if(RX10_TEMP184)
				{

				String RX10_TEMP182 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP182);

				}

			final INTArray RX10_TEMP185 = DK.contents;
			Program.INTSetValue(RX10_TEMP185, RX10_TEMP177, X10_TEMP141);

			final int X10_TEMP142 = j;

			final int X10_TEMP143 = 1;

			j = j - X10_TEMP143;

			final int X10_TEMP147 = t1;

			final Point1 RX10_TEMP186 = new Point1(X10_TEMP142);

			final Dist1 RX10_TEMP187 = DK.distValue;

			final Region1 RX10_TEMP188 = RX10_TEMP187.dReg;

			final int RX10_TEMP189 = Program.searchPointInRegion1(RX10_TEMP188, RX10_TEMP186);

			final int RX10_TEMP190 = 0;

			final boolean RX10_TEMP191 = RX10_TEMP189 < RX10_TEMP190;
			if(RX10_TEMP191)
				{

				String RX10_TEMP192 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP192);

				}

			final Dist SX10_TEMP9 = RX10_TEMP187.dDist;

			final int RX10_TEMP193 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP189);

			final int RX10_TEMP195 = 0;

			final boolean RX10_TEMP196 = RX10_TEMP193 != RX10_TEMP195;
			if(RX10_TEMP196)
				{

				String RX10_TEMP194 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP194);

				}

			final INTArray RX10_TEMP197 = DK.contents;
			Program.INTSetValue(RX10_TEMP197, RX10_TEMP189, X10_TEMP147);
			}

		final int X10_TEMP148 = k;

		final int X10_TEMP149 = 1;

		k = k + X10_TEMP149;

		final Point1 RX10_TEMP198 = new Point1(X10_TEMP148);

		final Region1 RX10_TEMP199 = Z.regionValue;

		final int RX10_TEMP200 = Program.searchPointInRegion1(RX10_TEMP199, RX10_TEMP198);

		final int RX10_TEMP201 = 0;

		final boolean RX10_TEMP202 = RX10_TEMP200 < RX10_TEMP201;
		if(RX10_TEMP202)
			{

			String RX10_TEMP203 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP203);

			}

		final int[] RX10_TEMP204 = (int[])(Z.contents);

		final int X10_TEMP152 = RX10_TEMP204[RX10_TEMP200];

		t1 = X10_TEMP152;

		final int X10_TEMP153 = j;

		final int X10_TEMP154 = 1;

		j = j - X10_TEMP154;

		final int X10_TEMP156 = k;

		final int X10_TEMP157 = 1;

		k = k + X10_TEMP157;

		final Point1 RX10_TEMP205 = new Point1(X10_TEMP156);

		final Region1 RX10_TEMP206 = Z.regionValue;

		final int RX10_TEMP207 = Program.searchPointInRegion1(RX10_TEMP206, RX10_TEMP205);

		final int RX10_TEMP208 = 0;

		final boolean RX10_TEMP209 = RX10_TEMP207 < RX10_TEMP208;
		if(RX10_TEMP209)
			{

			String RX10_TEMP210 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP210);

			}

		final int[] RX10_TEMP211 = (int[])(Z.contents);

		final int X10_TEMP161 = RX10_TEMP211[RX10_TEMP207];

		final int X10_TEMP162 = X10_TEMP161;

		final Point1 RX10_TEMP212 = new Point1(X10_TEMP153);

		final Dist1 RX10_TEMP213 = DK.distValue;

		final Region1 RX10_TEMP214 = RX10_TEMP213.dReg;

		final int RX10_TEMP215 = Program.searchPointInRegion1(RX10_TEMP214, RX10_TEMP212);

		final int RX10_TEMP216 = 0;

		final boolean RX10_TEMP217 = RX10_TEMP215 < RX10_TEMP216;
		if(RX10_TEMP217)
			{

			String RX10_TEMP218 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP218);

			}

		final Dist SX10_TEMP10 = RX10_TEMP213.dDist;

		final int RX10_TEMP219 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP215);

		final int RX10_TEMP221 = 0;

		final boolean RX10_TEMP222 = RX10_TEMP219 != RX10_TEMP221;
		if(RX10_TEMP222)
			{

			String RX10_TEMP220 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP220);

			}

		final INTArray RX10_TEMP223 = DK.contents;
		Program.INTSetValue(RX10_TEMP223, RX10_TEMP215, X10_TEMP162);

		final int X10_TEMP163 = j;

		final int X10_TEMP164 = 1;

		j = j - X10_TEMP164;

		final int X10_TEMP168 = t1;

		final Point1 RX10_TEMP224 = new Point1(X10_TEMP163);

		final Dist1 RX10_TEMP225 = DK.distValue;

		final Region1 RX10_TEMP226 = RX10_TEMP225.dReg;

		final int RX10_TEMP227 = Program.searchPointInRegion1(RX10_TEMP226, RX10_TEMP224);

		final int RX10_TEMP228 = 0;

		final boolean RX10_TEMP229 = RX10_TEMP227 < RX10_TEMP228;
		if(RX10_TEMP229)
			{

			String RX10_TEMP230 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP230);

			}

		final Dist SX10_TEMP11 = RX10_TEMP225.dDist;

		final int RX10_TEMP231 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP227);

		final int RX10_TEMP233 = 0;

		final boolean RX10_TEMP234 = RX10_TEMP231 != RX10_TEMP233;
		if(RX10_TEMP234)
			{

			String RX10_TEMP232 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP232);

			}

		final INTArray RX10_TEMP235 = DK.contents;
		Program.INTSetValue(RX10_TEMP235, RX10_TEMP227, X10_TEMP168);

		final int X10_TEMP169 = k;

		final int X10_TEMP170 = 1;

		k = k + X10_TEMP170;

		final Point1 RX10_TEMP236 = new Point1(X10_TEMP169);

		final Region1 RX10_TEMP237 = Z.regionValue;

		final int RX10_TEMP238 = Program.searchPointInRegion1(RX10_TEMP237, RX10_TEMP236);

		final int RX10_TEMP239 = 0;

		final boolean RX10_TEMP240 = RX10_TEMP238 < RX10_TEMP239;
		if(RX10_TEMP240)
			{

			String RX10_TEMP241 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP241);

			}

		final int[] RX10_TEMP242 = (int[])(Z.contents);

		final int X10_TEMP173 = RX10_TEMP242[RX10_TEMP238];

		final int X10_TEMP175 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP173);

		t1 = X10_TEMP175;

		final int X10_TEMP176 = k;

		final int X10_TEMP177 = 1;

		k = k + X10_TEMP177;

		final Point1 RX10_TEMP243 = new Point1(X10_TEMP176);

		final Region1 RX10_TEMP244 = Z.regionValue;

		final int RX10_TEMP245 = Program.searchPointInRegion1(RX10_TEMP244, RX10_TEMP243);

		final int RX10_TEMP246 = 0;

		final boolean RX10_TEMP247 = RX10_TEMP245 < RX10_TEMP246;
		if(RX10_TEMP247)
			{

			String RX10_TEMP248 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP248);

			}

		final int[] RX10_TEMP249 = (int[])(Z.contents);

		final int X10_TEMP179 = RX10_TEMP249[RX10_TEMP245];

		final int X10_TEMP180 = 0;

		final int X10_TEMP181 = X10_TEMP180 - X10_TEMP179;

		final int X10_TEMP182 = 0xffff;

		final int X10_TEMP184 = X10_TEMP181 & X10_TEMP182;

		t2 = X10_TEMP184;

		final int X10_TEMP185 = k;

		final int X10_TEMP186 = 1;

		k = k + X10_TEMP186;

		final Point1 RX10_TEMP250 = new Point1(X10_TEMP185);

		final Region1 RX10_TEMP251 = Z.regionValue;

		final int RX10_TEMP252 = Program.searchPointInRegion1(RX10_TEMP251, RX10_TEMP250);

		final int RX10_TEMP253 = 0;

		final boolean RX10_TEMP254 = RX10_TEMP252 < RX10_TEMP253;
		if(RX10_TEMP254)
			{

			String RX10_TEMP255 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP255);

			}

		final int[] RX10_TEMP256 = (int[])(Z.contents);

		final int X10_TEMP188 = RX10_TEMP256[RX10_TEMP252];

		final int X10_TEMP189 = 0;

		final int X10_TEMP190 = X10_TEMP189 - X10_TEMP188;

		final int X10_TEMP191 = 0xffff;

		final int X10_TEMP193 = X10_TEMP190 & X10_TEMP191;

		t3 = X10_TEMP193;

		final int X10_TEMP194 = j;

		final int X10_TEMP195 = 1;

		j = j - X10_TEMP195;

		final int X10_TEMP197 = k;

		final int X10_TEMP198 = 1;

		k = k + X10_TEMP198;

		final Point1 RX10_TEMP257 = new Point1(X10_TEMP197);

		final Region1 RX10_TEMP258 = Z.regionValue;

		final int RX10_TEMP259 = Program.searchPointInRegion1(RX10_TEMP258, RX10_TEMP257);

		final int RX10_TEMP260 = 0;

		final boolean RX10_TEMP261 = RX10_TEMP259 < RX10_TEMP260;
		if(RX10_TEMP261)
			{

			String RX10_TEMP262 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP262);

			}

		final int[] RX10_TEMP263 = (int[])(Z.contents);

		final int X10_TEMP201 = RX10_TEMP263[RX10_TEMP259];

		final int X10_TEMP204 = Program.IDEATest_inv(X10_TEMP0, X10_TEMP201);

		final int X10_TEMP205 = X10_TEMP204;

		final Point1 RX10_TEMP264 = new Point1(X10_TEMP194);

		final Dist1 RX10_TEMP265 = DK.distValue;

		final Region1 RX10_TEMP266 = RX10_TEMP265.dReg;

		final int RX10_TEMP267 = Program.searchPointInRegion1(RX10_TEMP266, RX10_TEMP264);

		final int RX10_TEMP268 = 0;

		final boolean RX10_TEMP269 = RX10_TEMP267 < RX10_TEMP268;
		if(RX10_TEMP269)
			{

			String RX10_TEMP270 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP270);

			}

		final Dist SX10_TEMP12 = RX10_TEMP265.dDist;

		final int RX10_TEMP271 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP267);

		final int RX10_TEMP273 = 0;

		final boolean RX10_TEMP274 = RX10_TEMP271 != RX10_TEMP273;
		if(RX10_TEMP274)
			{

			String RX10_TEMP272 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP272);

			}

		final INTArray RX10_TEMP275 = DK.contents;
		Program.INTSetValue(RX10_TEMP275, RX10_TEMP267, X10_TEMP205);

		final int X10_TEMP206 = j;

		final int X10_TEMP207 = 1;

		j = j - X10_TEMP207;

		final int X10_TEMP211 = t3;

		final Point1 RX10_TEMP276 = new Point1(X10_TEMP206);

		final Dist1 RX10_TEMP277 = DK.distValue;

		final Region1 RX10_TEMP278 = RX10_TEMP277.dReg;

		final int RX10_TEMP279 = Program.searchPointInRegion1(RX10_TEMP278, RX10_TEMP276);

		final int RX10_TEMP280 = 0;

		final boolean RX10_TEMP281 = RX10_TEMP279 < RX10_TEMP280;
		if(RX10_TEMP281)
			{

			String RX10_TEMP282 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP282);

			}

		final Dist SX10_TEMP13 = RX10_TEMP277.dDist;

		final int RX10_TEMP283 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP279);

		final int RX10_TEMP285 = 0;

		final boolean RX10_TEMP286 = RX10_TEMP283 != RX10_TEMP285;
		if(RX10_TEMP286)
			{

			String RX10_TEMP284 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP284);

			}

		final INTArray RX10_TEMP287 = DK.contents;
		Program.INTSetValue(RX10_TEMP287, RX10_TEMP279, X10_TEMP211);

		final int X10_TEMP212 = j;

		final int X10_TEMP213 = 1;

		j = j - X10_TEMP213;

		final int X10_TEMP217 = t2;

		final Point1 RX10_TEMP288 = new Point1(X10_TEMP212);

		final Dist1 RX10_TEMP289 = DK.distValue;

		final Region1 RX10_TEMP290 = RX10_TEMP289.dReg;

		final int RX10_TEMP291 = Program.searchPointInRegion1(RX10_TEMP290, RX10_TEMP288);

		final int RX10_TEMP292 = 0;

		final boolean RX10_TEMP293 = RX10_TEMP291 < RX10_TEMP292;
		if(RX10_TEMP293)
			{

			String RX10_TEMP294 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP294);

			}

		final Dist SX10_TEMP14 = RX10_TEMP289.dDist;

		final int RX10_TEMP295 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP291);

		final int RX10_TEMP297 = 0;

		final boolean RX10_TEMP298 = RX10_TEMP295 != RX10_TEMP297;
		if(RX10_TEMP298)
			{

			String RX10_TEMP296 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP296);

			}

		final INTArray RX10_TEMP299 = DK.contents;
		Program.INTSetValue(RX10_TEMP299, RX10_TEMP291, X10_TEMP217);

		final int X10_TEMP218 = j;

		final int X10_TEMP219 = 1;

		j = j - X10_TEMP219;

		final int X10_TEMP223 = t1;

		final Point1 RX10_TEMP300 = new Point1(X10_TEMP218);

		final Dist1 RX10_TEMP301 = DK.distValue;

		final Region1 RX10_TEMP302 = RX10_TEMP301.dReg;

		final int RX10_TEMP303 = Program.searchPointInRegion1(RX10_TEMP302, RX10_TEMP300);

		final int RX10_TEMP304 = 0;

		final boolean RX10_TEMP305 = RX10_TEMP303 < RX10_TEMP304;
		if(RX10_TEMP305)
			{

			String RX10_TEMP306 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP306);

			}

		final Dist SX10_TEMP15 = RX10_TEMP301.dDist;

		final int RX10_TEMP307 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP303);

		final int RX10_TEMP309 = 0;

		final boolean RX10_TEMP310 = RX10_TEMP307 != RX10_TEMP309;
		if(RX10_TEMP310)
			{

			String RX10_TEMP308 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP308);

			}

		final INTArray RX10_TEMP311 = DK.contents;
		Program.INTSetValue(RX10_TEMP311, RX10_TEMP303, X10_TEMP223);

		final Region1 RX10_TEMP312 = rDK;

		final int RX10_TEMP329 = rDK.pointArray.length;

		final int RX10_TEMP330 = 1;

		final int RX10_TEMP331 = RX10_TEMP329 - RX10_TEMP330;

		final int  RX10_TEMP328 = RX10_TEMP331+1;

		final int[] RX10_TEMP332 = (int[])(new int/*value*/[RX10_TEMP328]);
/*arrayInitBlock*/
for(int RX10_TEMP313= 0;RX10_TEMP313 <RX10_TEMP332.length ;RX10_TEMP313++ )			{

			final Point1[] RX10_TEMP315 = RX10_TEMP312.pointArray;

			final Point1 RX10_TEMP314 = RX10_TEMP315[RX10_TEMP313];

			final int i = RX10_TEMP314.f0;

			final Point1 RX10_TEMP316 = new Point1(i);

			final Dist1 RX10_TEMP317 = DK.distValue;

			final Region1 RX10_TEMP318 = RX10_TEMP317.dReg;

			final int RX10_TEMP319 = Program.searchPointInRegion1(RX10_TEMP318, RX10_TEMP316);

			final int RX10_TEMP320 = 0;

			final boolean RX10_TEMP321 = RX10_TEMP319 < RX10_TEMP320;
			if(RX10_TEMP321)
				{

				String RX10_TEMP322 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP322);

				}

			final Dist SX10_TEMP16 = RX10_TEMP317.dDist;

			final int RX10_TEMP323 = Program.getPlaceFromDist(SX10_TEMP16, RX10_TEMP319);

			final int RX10_TEMP325 = 0;

			final boolean RX10_TEMP326 = RX10_TEMP323 != RX10_TEMP325;
			if(RX10_TEMP326)
				{

				String RX10_TEMP324 = "Bad place access for array DK";
throw new RuntimeException(RX10_TEMP324);

				}

			final INTArray RX10_TEMP327 = DK.contents;

			final int X10_TEMP226 = Program.INTGetValue(RX10_TEMP327, RX10_TEMP319);
			RX10_TEMP332[RX10_TEMP313] =X10_TEMP226;
			}

;

		final intValArray1 RX10_TEMP333 = new intValArray1(rDK, RX10_TEMP332);

		final intValArray1 X10_TEMP227 = RX10_TEMP333;

		final intValArray1 X10_TEMP230 = X10_TEMP227;
		X10_TEMP0.DKR = (X10_TEMP230);
		}
public static void IDEATest_cipher_idea ( final IDEATest X10_TEMP0, final byteRefArray1 text1, final byteRefArray1 text2, final intValArray1 key)		{

		final Dist1 RX10_TEMP0 = text1.distValue;

		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;

		final Region1 X10_TEMP1 = RX10_TEMP1;

		final int X10_TEMP6 = X10_TEMP1.pointArray.length;

		final int X10_TEMP2 = 8;

		final int X10_TEMP3 = 4;

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

		final Dist1 X10_TEMP16 = Program.restrictDist1(X10_TEMP13, X10_TEMP14);

		final Region1 RX10_TEMP5 = X10_TEMP16.dReg;

		final Point1[] RX10_TEMP6 = RX10_TEMP5.pointArray;
		for(int RX10_TEMP3=0; RX10_TEMP3 < RX10_TEMP6.length; RX10_TEMP3++)
			{

			final Point1 RX10_TEMP4 = RX10_TEMP6[RX10_TEMP3];

			final int i = RX10_TEMP4.f0;

			final int X10_TEMP17 = 8;

			final int X10_TEMP18 = i % X10_TEMP17;

			final int X10_TEMP19 = 0;

			final boolean X10_TEMP21 = X10_TEMP18 == X10_TEMP19;
			if(X10_TEMP21)
				{

				int i1 = i;

				int i2 = i;

				int ik = 0;

				int x1 = 0;

				int x2 = 0;

				int x3 = 0;

				int x4 = 0;

				int t1 = 0;

				int t2 = 0;

				int r = 0;

				final int X10_TEMP33 = 0;

				ik = X10_TEMP33;

				final int X10_TEMP35 = 8;

				r = X10_TEMP35;

				final int X10_TEMP36 = i1;

				final int X10_TEMP37 = 1;

				i1 = i1 + X10_TEMP37;

				final Point1 RX10_TEMP7 = new Point1(X10_TEMP36);

				final Dist1 RX10_TEMP8 = text1.distValue;

				final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;

				final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP7);

				final int RX10_TEMP11 = 0;

				final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
				if(RX10_TEMP12)
					{

					String RX10_TEMP13 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP13);

					}

				final Dist SX10_TEMP0 = RX10_TEMP8.dDist;

				final int RX10_TEMP14 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP10);

				final int RX10_TEMP16 = 0;

				final boolean RX10_TEMP17 = RX10_TEMP14 != RX10_TEMP16;
				if(RX10_TEMP17)
					{

					String RX10_TEMP15 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP15);

					}

				final BYTEArray RX10_TEMP18 = text1.contents;

				final byte X10_TEMP39 = (byte)Program.BYTEGetValue(RX10_TEMP18, RX10_TEMP10);

				final int X10_TEMP40 = 0xff;

				final int X10_TEMP42 = X10_TEMP39 & X10_TEMP40;

				x1 = X10_TEMP42;

				final int X10_TEMP43 = i1;

				final int X10_TEMP44 = 1;

				i1 = i1 + X10_TEMP44;

				final Point1 RX10_TEMP19 = new Point1(X10_TEMP43);

				final Dist1 RX10_TEMP20 = text1.distValue;

				final Region1 RX10_TEMP21 = RX10_TEMP20.dReg;

				final int RX10_TEMP22 = Program.searchPointInRegion1(RX10_TEMP21, RX10_TEMP19);

				final int RX10_TEMP23 = 0;

				final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23;
				if(RX10_TEMP24)
					{

					String RX10_TEMP25 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP25);

					}

				final Dist SX10_TEMP1 = RX10_TEMP20.dDist;

				final int RX10_TEMP26 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP22);

				final int RX10_TEMP28 = 0;

				final boolean RX10_TEMP29 = RX10_TEMP26 != RX10_TEMP28;
				if(RX10_TEMP29)
					{

					String RX10_TEMP27 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP27);

					}

				final BYTEArray RX10_TEMP30 = text1.contents;

				final byte X10_TEMP46 = (byte)Program.BYTEGetValue(RX10_TEMP30, RX10_TEMP22);

				final int X10_TEMP47 = 0xff;

				final int X10_TEMP49 = X10_TEMP46 & X10_TEMP47;

				final int X10_TEMP50 = 8;

				final int X10_TEMP52 = X10_TEMP49 << X10_TEMP50;

				x1 = x1 | X10_TEMP52;

				final int X10_TEMP53 = i1;

				final int X10_TEMP54 = 1;

				i1 = i1 + X10_TEMP54;

				final Point1 RX10_TEMP31 = new Point1(X10_TEMP53);

				final Dist1 RX10_TEMP32 = text1.distValue;

				final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;

				final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31);

				final int RX10_TEMP35 = 0;

				final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;
				if(RX10_TEMP36)
					{

					String RX10_TEMP37 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP37);

					}

				final Dist SX10_TEMP2 = RX10_TEMP32.dDist;

				final int RX10_TEMP38 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP34);

				final int RX10_TEMP40 = 0;

				final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;
				if(RX10_TEMP41)
					{

					String RX10_TEMP39 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP39);

					}

				final BYTEArray RX10_TEMP42 = text1.contents;

				final byte X10_TEMP56 = (byte)Program.BYTEGetValue(RX10_TEMP42, RX10_TEMP34);

				final int X10_TEMP57 = 0xff;

				final int X10_TEMP59 = X10_TEMP56 & X10_TEMP57;

				x2 = X10_TEMP59;

				final int X10_TEMP60 = i1;

				final int X10_TEMP61 = 1;

				i1 = i1 + X10_TEMP61;

				final Point1 RX10_TEMP43 = new Point1(X10_TEMP60);

				final Dist1 RX10_TEMP44 = text1.distValue;

				final Region1 RX10_TEMP45 = RX10_TEMP44.dReg;

				final int RX10_TEMP46 = Program.searchPointInRegion1(RX10_TEMP45, RX10_TEMP43);

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

					String RX10_TEMP51 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP51);

					}

				final BYTEArray RX10_TEMP54 = text1.contents;

				final byte X10_TEMP63 = (byte)Program.BYTEGetValue(RX10_TEMP54, RX10_TEMP46);

				final int X10_TEMP64 = 0xff;

				final int X10_TEMP66 = X10_TEMP63 & X10_TEMP64;

				final int X10_TEMP67 = 8;

				final int X10_TEMP69 = X10_TEMP66 << X10_TEMP67;

				x2 = x2 | X10_TEMP69;

				final int X10_TEMP70 = i1;

				final int X10_TEMP71 = 1;

				i1 = i1 + X10_TEMP71;

				final Point1 RX10_TEMP55 = new Point1(X10_TEMP70);

				final Dist1 RX10_TEMP56 = text1.distValue;

				final Region1 RX10_TEMP57 = RX10_TEMP56.dReg;

				final int RX10_TEMP58 = Program.searchPointInRegion1(RX10_TEMP57, RX10_TEMP55);

				final int RX10_TEMP59 = 0;

				final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;
				if(RX10_TEMP60)
					{

					String RX10_TEMP61 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP61);

					}

				final Dist SX10_TEMP4 = RX10_TEMP56.dDist;

				final int RX10_TEMP62 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP58);

				final int RX10_TEMP64 = 0;

				final boolean RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64;
				if(RX10_TEMP65)
					{

					String RX10_TEMP63 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP63);

					}

				final BYTEArray RX10_TEMP66 = text1.contents;

				final byte X10_TEMP73 = (byte)Program.BYTEGetValue(RX10_TEMP66, RX10_TEMP58);

				final int X10_TEMP74 = 0xff;

				final int X10_TEMP76 = X10_TEMP73 & X10_TEMP74;

				x3 = X10_TEMP76;

				final int X10_TEMP77 = i1;

				final int X10_TEMP78 = 1;

				i1 = i1 + X10_TEMP78;

				final Point1 RX10_TEMP67 = new Point1(X10_TEMP77);

				final Dist1 RX10_TEMP68 = text1.distValue;

				final Region1 RX10_TEMP69 = RX10_TEMP68.dReg;

				final int RX10_TEMP70 = Program.searchPointInRegion1(RX10_TEMP69, RX10_TEMP67);

				final int RX10_TEMP71 = 0;

				final boolean RX10_TEMP72 = RX10_TEMP70 < RX10_TEMP71;
				if(RX10_TEMP72)
					{

					String RX10_TEMP73 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP73);

					}

				final Dist SX10_TEMP5 = RX10_TEMP68.dDist;

				final int RX10_TEMP74 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP70);

				final int RX10_TEMP76 = 0;

				final boolean RX10_TEMP77 = RX10_TEMP74 != RX10_TEMP76;
				if(RX10_TEMP77)
					{

					String RX10_TEMP75 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP75);

					}

				final BYTEArray RX10_TEMP78 = text1.contents;

				final byte X10_TEMP80 = (byte)Program.BYTEGetValue(RX10_TEMP78, RX10_TEMP70);

				final int X10_TEMP81 = 0xff;

				final int X10_TEMP83 = X10_TEMP80 & X10_TEMP81;

				final int X10_TEMP84 = 8;

				final int X10_TEMP86 = X10_TEMP83 << X10_TEMP84;

				x3 = x3 | X10_TEMP86;

				final int X10_TEMP87 = i1;

				final int X10_TEMP88 = 1;

				i1 = i1 + X10_TEMP88;

				final Point1 RX10_TEMP79 = new Point1(X10_TEMP87);

				final Dist1 RX10_TEMP80 = text1.distValue;

				final Region1 RX10_TEMP81 = RX10_TEMP80.dReg;

				final int RX10_TEMP82 = Program.searchPointInRegion1(RX10_TEMP81, RX10_TEMP79);

				final int RX10_TEMP83 = 0;

				final boolean RX10_TEMP84 = RX10_TEMP82 < RX10_TEMP83;
				if(RX10_TEMP84)
					{

					String RX10_TEMP85 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP85);

					}

				final Dist SX10_TEMP6 = RX10_TEMP80.dDist;

				final int RX10_TEMP86 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP82);

				final int RX10_TEMP88 = 0;

				final boolean RX10_TEMP89 = RX10_TEMP86 != RX10_TEMP88;
				if(RX10_TEMP89)
					{

					String RX10_TEMP87 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP87);

					}

				final BYTEArray RX10_TEMP90 = text1.contents;

				final byte X10_TEMP90 = (byte)Program.BYTEGetValue(RX10_TEMP90, RX10_TEMP82);

				final int X10_TEMP91 = 0xff;

				final int X10_TEMP93 = X10_TEMP90 & X10_TEMP91;

				x4 = X10_TEMP93;

				final int X10_TEMP94 = i1;

				final int X10_TEMP95 = 1;

				i1 = i1 + X10_TEMP95;

				final Point1 RX10_TEMP91 = new Point1(X10_TEMP94);

				final Dist1 RX10_TEMP92 = text1.distValue;

				final Region1 RX10_TEMP93 = RX10_TEMP92.dReg;

				final int RX10_TEMP94 = Program.searchPointInRegion1(RX10_TEMP93, RX10_TEMP91);

				final int RX10_TEMP95 = 0;

				final boolean RX10_TEMP96 = RX10_TEMP94 < RX10_TEMP95;
				if(RX10_TEMP96)
					{

					String RX10_TEMP97 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP97);

					}

				final Dist SX10_TEMP7 = RX10_TEMP92.dDist;

				final int RX10_TEMP98 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP94);

				final int RX10_TEMP100 = 0;

				final boolean RX10_TEMP101 = RX10_TEMP98 != RX10_TEMP100;
				if(RX10_TEMP101)
					{

					String RX10_TEMP99 = "Bad place access for array text1";
throw new RuntimeException(RX10_TEMP99);

					}

				final BYTEArray RX10_TEMP102 = text1.contents;

				final byte X10_TEMP97 = (byte)Program.BYTEGetValue(RX10_TEMP102, RX10_TEMP94);

				final int X10_TEMP98 = 0xff;

				final int X10_TEMP100 = X10_TEMP97 & X10_TEMP98;

				final int X10_TEMP101 = 8;

				final int X10_TEMP103 = X10_TEMP100 << X10_TEMP101;

				x4 = x4 | X10_TEMP103;

				boolean X10_TEMP104 = false;
				do 					{

					final long X10_TEMP108 = (long)x1;

					final int X10_TEMP105 = ik;

					final int X10_TEMP106 = 1;

					ik = ik + X10_TEMP106;

					final Point1 RX10_TEMP103 = new Point1(X10_TEMP105);

					final Region1 RX10_TEMP104 = key.regionValue;

					final int RX10_TEMP105 = Program.searchPointInRegion1(RX10_TEMP104, RX10_TEMP103);

					final int RX10_TEMP106 = 0;

					final boolean RX10_TEMP107 = RX10_TEMP105 < RX10_TEMP106;
					if(RX10_TEMP107)
						{

						String RX10_TEMP108 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP108);

						}

					final int[] RX10_TEMP109 = (int[])(key.contents);

					final int X10_TEMP109 = RX10_TEMP109[RX10_TEMP105];

					final long X10_TEMP110 = X10_TEMP108 * X10_TEMP109;

					final long X10_TEMP111 = 0x10001L;

					final long X10_TEMP112 = X10_TEMP110 % X10_TEMP111;

					final int X10_TEMP113 = 0xffff;

					final long X10_TEMP115 = X10_TEMP112 & X10_TEMP113;

					final int X10_TEMP117 = (int)X10_TEMP115;

					x1 = X10_TEMP117;

					final int X10_TEMP118 = ik;

					final int X10_TEMP119 = 1;

					ik = ik + X10_TEMP119;

					final Point1 RX10_TEMP110 = new Point1(X10_TEMP118);

					final Region1 RX10_TEMP111 = key.regionValue;

					final int RX10_TEMP112 = Program.searchPointInRegion1(RX10_TEMP111, RX10_TEMP110);

					final int RX10_TEMP113 = 0;

					final boolean RX10_TEMP114 = RX10_TEMP112 < RX10_TEMP113;
					if(RX10_TEMP114)
						{

						String RX10_TEMP115 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP115);

						}

					final int[] RX10_TEMP116 = (int[])(key.contents);

					final int X10_TEMP121 = RX10_TEMP116[RX10_TEMP112];

					final int X10_TEMP122 = x2 + X10_TEMP121;

					final int X10_TEMP123 = 0xffff;

					final int X10_TEMP125 = X10_TEMP122 & X10_TEMP123;

					x2 = X10_TEMP125;

					final int X10_TEMP126 = ik;

					final int X10_TEMP127 = 1;

					ik = ik + X10_TEMP127;

					final Point1 RX10_TEMP117 = new Point1(X10_TEMP126);

					final Region1 RX10_TEMP118 = key.regionValue;

					final int RX10_TEMP119 = Program.searchPointInRegion1(RX10_TEMP118, RX10_TEMP117);

					final int RX10_TEMP120 = 0;

					final boolean RX10_TEMP121 = RX10_TEMP119 < RX10_TEMP120;
					if(RX10_TEMP121)
						{

						String RX10_TEMP122 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP122);

						}

					final int[] RX10_TEMP123 = (int[])(key.contents);

					final int X10_TEMP129 = RX10_TEMP123[RX10_TEMP119];

					final int X10_TEMP130 = x3 + X10_TEMP129;

					final int X10_TEMP131 = 0xffff;

					final int X10_TEMP133 = X10_TEMP130 & X10_TEMP131;

					x3 = X10_TEMP133;

					final long X10_TEMP137 = (long)x4;

					final int X10_TEMP134 = ik;

					final int X10_TEMP135 = 1;

					ik = ik + X10_TEMP135;

					final Point1 RX10_TEMP124 = new Point1(X10_TEMP134);

					final Region1 RX10_TEMP125 = key.regionValue;

					final int RX10_TEMP126 = Program.searchPointInRegion1(RX10_TEMP125, RX10_TEMP124);

					final int RX10_TEMP127 = 0;

					final boolean RX10_TEMP128 = RX10_TEMP126 < RX10_TEMP127;
					if(RX10_TEMP128)
						{

						String RX10_TEMP129 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP129);

						}

					final int[] RX10_TEMP130 = (int[])(key.contents);

					final int X10_TEMP138 = RX10_TEMP130[RX10_TEMP126];

					final long X10_TEMP139 = X10_TEMP137 * X10_TEMP138;

					final long X10_TEMP140 = 0x10001L;

					final long X10_TEMP141 = X10_TEMP139 % X10_TEMP140;

					final int X10_TEMP142 = 0xffff;

					final long X10_TEMP144 = X10_TEMP141 & X10_TEMP142;

					final int X10_TEMP146 = (int)X10_TEMP144;

					x4 = X10_TEMP146;

					final int X10_TEMP148 = x1 ^ x3;

					t2 = X10_TEMP148;

					final long X10_TEMP152 = (long)t2;

					final int X10_TEMP149 = ik;

					final int X10_TEMP150 = 1;

					ik = ik + X10_TEMP150;

					final Point1 RX10_TEMP131 = new Point1(X10_TEMP149);

					final Region1 RX10_TEMP132 = key.regionValue;

					final int RX10_TEMP133 = Program.searchPointInRegion1(RX10_TEMP132, RX10_TEMP131);

					final int RX10_TEMP134 = 0;

					final boolean RX10_TEMP135 = RX10_TEMP133 < RX10_TEMP134;
					if(RX10_TEMP135)
						{

						String RX10_TEMP136 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP136);

						}

					final int[] RX10_TEMP137 = (int[])(key.contents);

					final int X10_TEMP153 = RX10_TEMP137[RX10_TEMP133];

					final long X10_TEMP154 = X10_TEMP152 * X10_TEMP153;

					final long X10_TEMP155 = 0x10001L;

					final long X10_TEMP156 = X10_TEMP154 % X10_TEMP155;

					final int X10_TEMP157 = 0xffff;

					final long X10_TEMP159 = X10_TEMP156 & X10_TEMP157;

					final int X10_TEMP161 = (int)X10_TEMP159;

					t2 = X10_TEMP161;

					final int X10_TEMP163 = x2 ^ x4;

					final int X10_TEMP164 = t2 + X10_TEMP163;

					final int X10_TEMP165 = 0xffff;

					final int X10_TEMP167 = X10_TEMP164 & X10_TEMP165;

					t1 = X10_TEMP167;

					final long X10_TEMP171 = (long)t1;

					final int X10_TEMP168 = ik;

					final int X10_TEMP169 = 1;

					ik = ik + X10_TEMP169;

					final Point1 RX10_TEMP138 = new Point1(X10_TEMP168);

					final Region1 RX10_TEMP139 = key.regionValue;

					final int RX10_TEMP140 = Program.searchPointInRegion1(RX10_TEMP139, RX10_TEMP138);

					final int RX10_TEMP141 = 0;

					final boolean RX10_TEMP142 = RX10_TEMP140 < RX10_TEMP141;
					if(RX10_TEMP142)
						{

						String RX10_TEMP143 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP143);

						}

					final int[] RX10_TEMP144 = (int[])(key.contents);

					final int X10_TEMP172 = RX10_TEMP144[RX10_TEMP140];

					final long X10_TEMP173 = X10_TEMP171 * X10_TEMP172;

					final long X10_TEMP174 = 0x10001L;

					final long X10_TEMP175 = X10_TEMP173 % X10_TEMP174;

					final int X10_TEMP176 = 0xffff;

					final long X10_TEMP178 = X10_TEMP175 & X10_TEMP176;

					final int X10_TEMP180 = (int)X10_TEMP178;

					t1 = X10_TEMP180;

					final int X10_TEMP181 = t1 + t2;

					final int X10_TEMP182 = 0xffff;

					final int X10_TEMP184 = X10_TEMP181 & X10_TEMP182;

					t2 = X10_TEMP184;

					x1 = x1 ^ t1;

					x4 = x4 ^ t2;

					t2 = t2 ^ x2;

					final int X10_TEMP189 = x3 ^ t1;

					x2 = X10_TEMP189;

					x3 = t2;

					final int X10_TEMP191 = 1;

					r = r - X10_TEMP191;

					final int X10_TEMP192 = 0;

					X10_TEMP104 = r != X10_TEMP192;
					}
				
 while(X10_TEMP104);
				final long X10_TEMP197 = (long)x1;

				final int X10_TEMP194 = ik;

				final int X10_TEMP195 = 1;

				ik = ik + X10_TEMP195;

				final Point1 RX10_TEMP145 = new Point1(X10_TEMP194);

				final Region1 RX10_TEMP146 = key.regionValue;

				final int RX10_TEMP147 = Program.searchPointInRegion1(RX10_TEMP146, RX10_TEMP145);

				final int RX10_TEMP148 = 0;

				final boolean RX10_TEMP149 = RX10_TEMP147 < RX10_TEMP148;
				if(RX10_TEMP149)
					{

					String RX10_TEMP150 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP150);

					}

				final int[] RX10_TEMP151 = (int[])(key.contents);

				final int X10_TEMP198 = RX10_TEMP151[RX10_TEMP147];

				final long X10_TEMP199 = X10_TEMP197 * X10_TEMP198;

				final long X10_TEMP200 = 0x10001L;

				final long X10_TEMP201 = X10_TEMP199 % X10_TEMP200;

				final int X10_TEMP202 = 0xffff;

				final long X10_TEMP204 = X10_TEMP201 & X10_TEMP202;

				final int X10_TEMP206 = (int)X10_TEMP204;

				x1 = X10_TEMP206;

				final int X10_TEMP207 = ik;

				final int X10_TEMP208 = 1;

				ik = ik + X10_TEMP208;

				final Point1 RX10_TEMP152 = new Point1(X10_TEMP207);

				final Region1 RX10_TEMP153 = key.regionValue;

				final int RX10_TEMP154 = Program.searchPointInRegion1(RX10_TEMP153, RX10_TEMP152);

				final int RX10_TEMP155 = 0;

				final boolean RX10_TEMP156 = RX10_TEMP154 < RX10_TEMP155;
				if(RX10_TEMP156)
					{

					String RX10_TEMP157 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP157);

					}

				final int[] RX10_TEMP158 = (int[])(key.contents);

				final int X10_TEMP210 = RX10_TEMP158[RX10_TEMP154];

				final int X10_TEMP211 = x3 + X10_TEMP210;

				final int X10_TEMP212 = 0xffff;

				final int X10_TEMP214 = X10_TEMP211 & X10_TEMP212;

				x3 = X10_TEMP214;

				final int X10_TEMP215 = ik;

				final int X10_TEMP216 = 1;

				ik = ik + X10_TEMP216;

				final Point1 RX10_TEMP159 = new Point1(X10_TEMP215);

				final Region1 RX10_TEMP160 = key.regionValue;

				final int RX10_TEMP161 = Program.searchPointInRegion1(RX10_TEMP160, RX10_TEMP159);

				final int RX10_TEMP162 = 0;

				final boolean RX10_TEMP163 = RX10_TEMP161 < RX10_TEMP162;
				if(RX10_TEMP163)
					{

					String RX10_TEMP164 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP164);

					}

				final int[] RX10_TEMP165 = (int[])(key.contents);

				final int X10_TEMP218 = RX10_TEMP165[RX10_TEMP161];

				final int X10_TEMP219 = x2 + X10_TEMP218;

				final int X10_TEMP220 = 0xffff;

				final int X10_TEMP222 = X10_TEMP219 & X10_TEMP220;

				x2 = X10_TEMP222;

				final long X10_TEMP226 = (long)x4;

				final int X10_TEMP223 = ik;

				final int X10_TEMP224 = 1;

				ik = ik + X10_TEMP224;

				final Point1 RX10_TEMP166 = new Point1(X10_TEMP223);

				final Region1 RX10_TEMP167 = key.regionValue;

				final int RX10_TEMP168 = Program.searchPointInRegion1(RX10_TEMP167, RX10_TEMP166);

				final int RX10_TEMP169 = 0;

				final boolean RX10_TEMP170 = RX10_TEMP168 < RX10_TEMP169;
				if(RX10_TEMP170)
					{

					String RX10_TEMP171 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP171);

					}

				final int[] RX10_TEMP172 = (int[])(key.contents);

				final int X10_TEMP227 = RX10_TEMP172[RX10_TEMP168];

				final long X10_TEMP228 = X10_TEMP226 * X10_TEMP227;

				final long X10_TEMP229 = 0x10001L;

				final long X10_TEMP230 = X10_TEMP228 % X10_TEMP229;

				final int X10_TEMP231 = 0xffff;

				final long X10_TEMP233 = X10_TEMP230 & X10_TEMP231;

				final int X10_TEMP235 = (int)X10_TEMP233;

				x4 = X10_TEMP235;

				final int X10_TEMP236 = i2;

				final int X10_TEMP237 = 1;

				i2 = i2 + X10_TEMP237;

				final byte X10_TEMP241 = (byte)(byte)x1;

				final byte X10_TEMP242 = (byte)X10_TEMP241;

				final Point1 RX10_TEMP173 = new Point1(X10_TEMP236);

				final Dist1 RX10_TEMP174 = text2.distValue;

				final Region1 RX10_TEMP175 = RX10_TEMP174.dReg;

				final int RX10_TEMP176 = Program.searchPointInRegion1(RX10_TEMP175, RX10_TEMP173);

				final int RX10_TEMP177 = 0;

				final boolean RX10_TEMP178 = RX10_TEMP176 < RX10_TEMP177;
				if(RX10_TEMP178)
					{

					String RX10_TEMP179 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP179);

					}

				final Dist SX10_TEMP8 = RX10_TEMP174.dDist;

				final int RX10_TEMP180 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP176);

				final int RX10_TEMP182 = 0;

				final boolean RX10_TEMP183 = RX10_TEMP180 != RX10_TEMP182;
				if(RX10_TEMP183)
					{

					String RX10_TEMP181 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP181);

					}

				final BYTEArray RX10_TEMP184 = text2.contents;
				Program.BYTESetValue(RX10_TEMP184, RX10_TEMP176, X10_TEMP242);

				final int X10_TEMP243 = i2;

				final int X10_TEMP244 = 1;

				i2 = i2 + X10_TEMP244;

				final int X10_TEMP246 = 8;

				final int X10_TEMP248 = x1 >>> X10_TEMP246;

				final byte X10_TEMP251 = (byte)(byte)X10_TEMP248;

				final byte X10_TEMP252 = (byte)X10_TEMP251;

				final Point1 RX10_TEMP185 = new Point1(X10_TEMP243);

				final Dist1 RX10_TEMP186 = text2.distValue;

				final Region1 RX10_TEMP187 = RX10_TEMP186.dReg;

				final int RX10_TEMP188 = Program.searchPointInRegion1(RX10_TEMP187, RX10_TEMP185);

				final int RX10_TEMP189 = 0;

				final boolean RX10_TEMP190 = RX10_TEMP188 < RX10_TEMP189;
				if(RX10_TEMP190)
					{

					String RX10_TEMP191 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP191);

					}

				final Dist SX10_TEMP9 = RX10_TEMP186.dDist;

				final int RX10_TEMP192 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP188);

				final int RX10_TEMP194 = 0;

				final boolean RX10_TEMP195 = RX10_TEMP192 != RX10_TEMP194;
				if(RX10_TEMP195)
					{

					String RX10_TEMP193 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP193);

					}

				final BYTEArray RX10_TEMP196 = text2.contents;
				Program.BYTESetValue(RX10_TEMP196, RX10_TEMP188, X10_TEMP252);

				final int X10_TEMP253 = i2;

				final int X10_TEMP254 = 1;

				i2 = i2 + X10_TEMP254;

				final byte X10_TEMP258 = (byte)(byte)x3;

				final byte X10_TEMP259 = (byte)X10_TEMP258;

				final Point1 RX10_TEMP197 = new Point1(X10_TEMP253);

				final Dist1 RX10_TEMP198 = text2.distValue;

				final Region1 RX10_TEMP199 = RX10_TEMP198.dReg;

				final int RX10_TEMP200 = Program.searchPointInRegion1(RX10_TEMP199, RX10_TEMP197);

				final int RX10_TEMP201 = 0;

				final boolean RX10_TEMP202 = RX10_TEMP200 < RX10_TEMP201;
				if(RX10_TEMP202)
					{

					String RX10_TEMP203 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP203);

					}

				final Dist SX10_TEMP10 = RX10_TEMP198.dDist;

				final int RX10_TEMP204 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP200);

				final int RX10_TEMP206 = 0;

				final boolean RX10_TEMP207 = RX10_TEMP204 != RX10_TEMP206;
				if(RX10_TEMP207)
					{

					String RX10_TEMP205 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP205);

					}

				final BYTEArray RX10_TEMP208 = text2.contents;
				Program.BYTESetValue(RX10_TEMP208, RX10_TEMP200, X10_TEMP259);

				final int X10_TEMP260 = i2;

				final int X10_TEMP261 = 1;

				i2 = i2 + X10_TEMP261;

				final int X10_TEMP263 = 8;

				final int X10_TEMP265 = x3 >>> X10_TEMP263;

				final byte X10_TEMP268 = (byte)(byte)X10_TEMP265;

				final byte X10_TEMP269 = (byte)X10_TEMP268;

				final Point1 RX10_TEMP209 = new Point1(X10_TEMP260);

				final Dist1 RX10_TEMP210 = text2.distValue;

				final Region1 RX10_TEMP211 = RX10_TEMP210.dReg;

				final int RX10_TEMP212 = Program.searchPointInRegion1(RX10_TEMP211, RX10_TEMP209);

				final int RX10_TEMP213 = 0;

				final boolean RX10_TEMP214 = RX10_TEMP212 < RX10_TEMP213;
				if(RX10_TEMP214)
					{

					String RX10_TEMP215 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP215);

					}

				final Dist SX10_TEMP11 = RX10_TEMP210.dDist;

				final int RX10_TEMP216 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP212);

				final int RX10_TEMP218 = 0;

				final boolean RX10_TEMP219 = RX10_TEMP216 != RX10_TEMP218;
				if(RX10_TEMP219)
					{

					String RX10_TEMP217 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP217);

					}

				final BYTEArray RX10_TEMP220 = text2.contents;
				Program.BYTESetValue(RX10_TEMP220, RX10_TEMP212, X10_TEMP269);

				final int X10_TEMP270 = i2;

				final int X10_TEMP271 = 1;

				i2 = i2 + X10_TEMP271;

				final byte X10_TEMP275 = (byte)(byte)x2;

				final byte X10_TEMP276 = (byte)X10_TEMP275;

				final Point1 RX10_TEMP221 = new Point1(X10_TEMP270);

				final Dist1 RX10_TEMP222 = text2.distValue;

				final Region1 RX10_TEMP223 = RX10_TEMP222.dReg;

				final int RX10_TEMP224 = Program.searchPointInRegion1(RX10_TEMP223, RX10_TEMP221);

				final int RX10_TEMP225 = 0;

				final boolean RX10_TEMP226 = RX10_TEMP224 < RX10_TEMP225;
				if(RX10_TEMP226)
					{

					String RX10_TEMP227 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP227);

					}

				final Dist SX10_TEMP12 = RX10_TEMP222.dDist;

				final int RX10_TEMP228 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP224);

				final int RX10_TEMP230 = 0;

				final boolean RX10_TEMP231 = RX10_TEMP228 != RX10_TEMP230;
				if(RX10_TEMP231)
					{

					String RX10_TEMP229 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP229);

					}

				final BYTEArray RX10_TEMP232 = text2.contents;
				Program.BYTESetValue(RX10_TEMP232, RX10_TEMP224, X10_TEMP276);

				final int X10_TEMP277 = i2;

				final int X10_TEMP278 = 1;

				i2 = i2 + X10_TEMP278;

				final int X10_TEMP280 = 8;

				final int X10_TEMP282 = x2 >>> X10_TEMP280;

				final byte X10_TEMP285 = (byte)(byte)X10_TEMP282;

				final byte X10_TEMP286 = (byte)X10_TEMP285;

				final Point1 RX10_TEMP233 = new Point1(X10_TEMP277);

				final Dist1 RX10_TEMP234 = text2.distValue;

				final Region1 RX10_TEMP235 = RX10_TEMP234.dReg;

				final int RX10_TEMP236 = Program.searchPointInRegion1(RX10_TEMP235, RX10_TEMP233);

				final int RX10_TEMP237 = 0;

				final boolean RX10_TEMP238 = RX10_TEMP236 < RX10_TEMP237;
				if(RX10_TEMP238)
					{

					String RX10_TEMP239 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP239);

					}

				final Dist SX10_TEMP13 = RX10_TEMP234.dDist;

				final int RX10_TEMP240 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP236);

				final int RX10_TEMP242 = 0;

				final boolean RX10_TEMP243 = RX10_TEMP240 != RX10_TEMP242;
				if(RX10_TEMP243)
					{

					String RX10_TEMP241 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP241);

					}

				final BYTEArray RX10_TEMP244 = text2.contents;
				Program.BYTESetValue(RX10_TEMP244, RX10_TEMP236, X10_TEMP286);

				final int X10_TEMP287 = i2;

				final int X10_TEMP288 = 1;

				i2 = i2 + X10_TEMP288;

				final byte X10_TEMP292 = (byte)(byte)x4;

				final byte X10_TEMP293 = (byte)X10_TEMP292;

				final Point1 RX10_TEMP245 = new Point1(X10_TEMP287);

				final Dist1 RX10_TEMP246 = text2.distValue;

				final Region1 RX10_TEMP247 = RX10_TEMP246.dReg;

				final int RX10_TEMP248 = Program.searchPointInRegion1(RX10_TEMP247, RX10_TEMP245);

				final int RX10_TEMP249 = 0;

				final boolean RX10_TEMP250 = RX10_TEMP248 < RX10_TEMP249;
				if(RX10_TEMP250)
					{

					String RX10_TEMP251 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP251);

					}

				final Dist SX10_TEMP14 = RX10_TEMP246.dDist;

				final int RX10_TEMP252 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP248);

				final int RX10_TEMP254 = 0;

				final boolean RX10_TEMP255 = RX10_TEMP252 != RX10_TEMP254;
				if(RX10_TEMP255)
					{

					String RX10_TEMP253 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP253);

					}

				final BYTEArray RX10_TEMP256 = text2.contents;
				Program.BYTESetValue(RX10_TEMP256, RX10_TEMP248, X10_TEMP293);

				final int X10_TEMP294 = i2;

				final int X10_TEMP295 = 1;

				i2 = i2 + X10_TEMP295;

				final int X10_TEMP297 = 8;

				final int X10_TEMP299 = x4 >>> X10_TEMP297;

				final byte X10_TEMP302 = (byte)(byte)X10_TEMP299;

				final byte X10_TEMP303 = (byte)X10_TEMP302;

				final Point1 RX10_TEMP257 = new Point1(X10_TEMP294);

				final Dist1 RX10_TEMP258 = text2.distValue;

				final Region1 RX10_TEMP259 = RX10_TEMP258.dReg;

				final int RX10_TEMP260 = Program.searchPointInRegion1(RX10_TEMP259, RX10_TEMP257);

				final int RX10_TEMP261 = 0;

				final boolean RX10_TEMP262 = RX10_TEMP260 < RX10_TEMP261;
				if(RX10_TEMP262)
					{

					String RX10_TEMP263 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP263);

					}

				final Dist SX10_TEMP15 = RX10_TEMP258.dDist;

				final int RX10_TEMP264 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP260);

				final int RX10_TEMP266 = 0;

				final boolean RX10_TEMP267 = RX10_TEMP264 != RX10_TEMP266;
				if(RX10_TEMP267)
					{

					String RX10_TEMP265 = "Bad place access for array text2";
throw new RuntimeException(RX10_TEMP265);

					}

				final BYTEArray RX10_TEMP268 = text2.contents;
				Program.BYTESetValue(RX10_TEMP268, RX10_TEMP260, X10_TEMP303);
				}
			}
		}
public static int IDEATest_mul ( final IDEATest X10_TEMP0, final int a, final int b)		{

		int X10_TEMP1 = a;

		int X10_TEMP2 = b;

		long p = 0L;

		final int X10_TEMP4 = 0;

		final boolean X10_TEMP6 = X10_TEMP1 != X10_TEMP4;
		if(X10_TEMP6)
			{

			final int X10_TEMP7 = 0;

			final boolean X10_TEMP9 = X10_TEMP2 != X10_TEMP7;
			if(X10_TEMP9)
				{

				final long X10_TEMP10 = (long)X10_TEMP1;

				final long X10_TEMP12 = X10_TEMP10 * X10_TEMP2;

				p = X10_TEMP12;

				final int X10_TEMP13 = (int)p;

				final int X10_TEMP14 = 0xFFFF;

				final int X10_TEMP16 = X10_TEMP13 & X10_TEMP14;

				X10_TEMP2 = X10_TEMP16;

				final int X10_TEMP17 = (int)p;

				final int X10_TEMP18 = 16;

				final int X10_TEMP20 = X10_TEMP17 >>> X10_TEMP18;

				X10_TEMP1 = X10_TEMP20;

				final int X10_TEMP27 = X10_TEMP2 - X10_TEMP1;

				final boolean X10_TEMP21 = X10_TEMP2 < X10_TEMP1;

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

				final int X10_TEMP35 = X10_TEMP33 - X10_TEMP1;

				final int X10_TEMP36 = 0xFFFF;

				final int X10_TEMP38 = X10_TEMP35 & X10_TEMP36;
				return X10_TEMP38;
				}
 			}
		else
			{

			final int X10_TEMP40 = 1;

			final int X10_TEMP42 = X10_TEMP40 - X10_TEMP2;

			final int X10_TEMP43 = 0xFFFF;

			final int X10_TEMP45 = X10_TEMP42 & X10_TEMP43;
			return X10_TEMP45;
			}
 		}
public static int IDEATest_inv ( final IDEATest X10_TEMP0, final int x)		{

		int X10_TEMP1 = x;

		int t0 = 0;

		int t1 = 0;

		int q = 0;

		int y = 0;

		final int X10_TEMP6 = 1;

		final boolean X10_TEMP8 = X10_TEMP1 <= X10_TEMP6;
		if(X10_TEMP8)
			{

			final int X10_TEMP10 = X10_TEMP1;
			return X10_TEMP10;
			}

		final int X10_TEMP12 = 0x10001;

		final int X10_TEMP14 = X10_TEMP12 / X10_TEMP1;

		t1 = X10_TEMP14;

		final int X10_TEMP15 = 0x10001;

		final int X10_TEMP17 = X10_TEMP15 % X10_TEMP1;

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

			final int X10_TEMP32 = X10_TEMP1 / y;

			q = X10_TEMP32;

			final int X10_TEMP34 = X10_TEMP1 % y;

			X10_TEMP1 = X10_TEMP34;

			final int X10_TEMP36 = q * t1;

			t0 = t0 + X10_TEMP36;

			final int X10_TEMP37 = 1;

			final boolean X10_TEMP39 = X10_TEMP1 == X10_TEMP37;
			if(X10_TEMP39)
				{

				final int X10_TEMP41 = t0;
				return X10_TEMP41;
				}

			final int X10_TEMP44 = y / X10_TEMP1;

			q = X10_TEMP44;

			final int X10_TEMP46 = y % X10_TEMP1;

			y = X10_TEMP46;

			final int X10_TEMP48 = q * t0;

			t1 = t1 + X10_TEMP48;

			final int X10_TEMP49 = 1;

			X10_TEMP30 = y != X10_TEMP49;
			}
		
 while(X10_TEMP30);
		final int X10_TEMP51 = 1;

		final int X10_TEMP53 = X10_TEMP51 - t1;

		final int X10_TEMP54 = 0xFFFF;

		final int X10_TEMP56 = X10_TEMP53 & X10_TEMP54;
		return X10_TEMP56;
		}
public static long _Random_multiplier_init ( )		{

		final long X10_TEMP2 = 0x5DEECE66DL;
		return X10_TEMP2;
		}
public static long _Random_addend_init ( )		{

		final long X10_TEMP2 = 0xBL;
		return X10_TEMP2;
		}
public static long _Random_mask_init ( )		{

		final long X10_TEMP1 = 1L;

		final int X10_TEMP2 = 48;

		final long X10_TEMP4 = X10_TEMP1 << X10_TEMP2;

		final int X10_TEMP5 = 1;

		final long X10_TEMP7 = X10_TEMP4 - X10_TEMP5;
		return X10_TEMP7;
		}
public static void Random_setSeed ( final Random X10_TEMP0, final long rseed)		{

		long X10_TEMP1 = rseed;

		final long X10_TEMP3 = X10_TEMP1 ^ _Random_multiplier;

		final long X10_TEMP6 = X10_TEMP3 & _Random_mask;

		final long X10_TEMP7 = X10_TEMP6;
		X10_TEMP0.seed = (X10_TEMP7);
		}
public static int Random_nextbits ( final Random X10_TEMP0, final int bits)		{

		int X10_TEMP1 = bits;

		long oldseed = X10_TEMP0.seed;

		final long X10_TEMP3 = oldseed * _Random_multiplier;

		final long X10_TEMP5 = X10_TEMP3 + _Random_addend;

		long nextseed = X10_TEMP5 & _Random_mask;

		final long X10_TEMP9 = nextseed;
		X10_TEMP0.seed = (X10_TEMP9);

		final int X10_TEMP10 = 48;

		final int X10_TEMP12 = X10_TEMP10 - X10_TEMP1;

		final long X10_TEMP14 = nextseed >>> X10_TEMP12;

		final int X10_TEMP16 = (int)X10_TEMP14;
		return X10_TEMP16;
		}
public static int Random_nextInt ( final Random X10_TEMP0)		{

		final int X10_TEMP2 = 32;

		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2);
		return X10_TEMP4;
		}
public static long Random_nextLong ( final Random X10_TEMP0)		{

		final int X10_TEMP2 = 32;

		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2);

		final long X10_TEMP5 = (long)X10_TEMP4;

		final int X10_TEMP6 = 32;

		final long X10_TEMP8 = X10_TEMP5 << X10_TEMP6;

		final int X10_TEMP10 = 32;

		final int X10_TEMP11 = Program.Random_nextbits(X10_TEMP0, X10_TEMP10);

		final long X10_TEMP13 = X10_TEMP8 + X10_TEMP11;
		return X10_TEMP13;
		}
public static boolean Random_nextBoolean ( final Random X10_TEMP0)		{

		final int X10_TEMP2 = 1;

		final int X10_TEMP3 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2);

		final int X10_TEMP4 = 0;

		final boolean X10_TEMP6 = X10_TEMP3 != X10_TEMP4;
		return X10_TEMP6;
		}
public static double Random_nextDouble ( final Random X10_TEMP0)		{

		final int X10_TEMP2 = 26;

		final int X10_TEMP4 = Program.Random_nextbits(X10_TEMP0, X10_TEMP2);

		final long X10_TEMP5 = (long)X10_TEMP4;

		final int X10_TEMP6 = 27;

		final long X10_TEMP8 = X10_TEMP5 << X10_TEMP6;

		final int X10_TEMP10 = 27;

		final int X10_TEMP11 = Program.Random_nextbits(X10_TEMP0, X10_TEMP10);

		final long X10_TEMP13 = X10_TEMP8 + X10_TEMP11;

		final long X10_TEMP14 = 1L;

		final int X10_TEMP15 = 53;

		final long X10_TEMP17 = X10_TEMP14 << X10_TEMP15;

		final double X10_TEMP18 = (double)X10_TEMP17;

		final double X10_TEMP20 = X10_TEMP13 / X10_TEMP18;
		return X10_TEMP20;
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
public static Dist1 restrictDist1 ( final Dist1 d,  int p)		{

		final Region1 dReg = d.dReg;

		final Point1[] dArray = (Point1[])(dReg.pointArray);

		int numPoints = 0;

		final int zero = 0;

		final int one = 1;

		final int h = 0;
		for(int i=0; i < dArray.length; i++)
			{

			final Dist SX10_TEMP0 = d.dDist;

			final int dP = Program.getPlaceFromDist(SX10_TEMP0, i);

			final boolean cond = p == dP;
			if(cond)
				{

				numPoints = numPoints + one;
				}
			}

		final int rSize = numPoints - one;

		final int  tempReg = rSize+1;

		final Dist tempDist = new Dist(tempReg, h);

		final Dist dpdist = new Dist(tempReg, p);

		final INTArray tempArray = new INTArray(tempDist);

		numPoints = 0;
		for(int i=0; i < dArray.length; i++)
			{

			final Dist SX10_TEMP1 = d.dDist;

			final int dP = Program.getPlaceFromDist(SX10_TEMP1, i);

			final boolean cond = p == dP;
			if(cond)
				{
				Program.INTSetValue(tempArray, i, i);

				numPoints = numPoints + one;
				}
			}

		final Point1[] pointArray = (Point1[])(new Point1/*value*/[tempReg]);
/*arrayInitBlock*/
for( p= 0;p <pointArray.length ;p++ )			{

			final int index = Program.INTGetValue(tempArray, p);

			final Point1 dpt = dArray[index];
			pointArray[p] =dpt;
			}

;

		final Region1 dpReg = new Region1(pointArray);

		final Dist1 dpDist = new Dist1(dpReg, dpdist);
		return dpDist;
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
public static String toStringPoint1 ( final Point1 p)		{

		String str = "";

		final int f0 = p.f0;

		String lSq = "[";

		String rSq = "]";

		str = str + lSq;

		str = str + f0;

		str = str + rSq;
		return str;
		}
public static Dist1 getBlockCyclicDist1 ( final Region1 r, final int blockSize)		{

		final int N = r.pointArray.length;

		final int fPlace = 0;

		final Dist pointDist = Program.getCyclic(N, fPlace, blockSize);

		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
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
public static Dist1 getUniqueDist ( )		{

		final int one = 1;

		final int zero = 0;

		final int maxPlaces = 4;

		final int rSize = maxPlaces - one;

		final int  placeRegion = rSize+1;

		final Point1[] pointArray = (Point1[])(new Point1/*value*/[placeRegion]);
/*arrayInitBlock*/
for(int i= 0;i <pointArray.length ;i++ )			{

			final Point1 pt1 = new Point1(i);
			pointArray[i] =pt1;
			}

;

		final Region1 reg = new Region1(pointArray, zero, maxPlaces);

		final Dist1 retDist = Program.getBlockCyclicDist1(reg, one);
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
for(int p= 0;p <ptArray.length ;p++ )			{

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
for(int p= 0;p <placeArray.length ;p++ )			{
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
for(int p= 0;p <counts.length ;p++ )			{

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
for(int p= 0;p <runSum.length ;p++ )			{

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
public static BYTEStub[] createBYTEArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final BYTEStub[] temp = (BYTEStub[])(new BYTEStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final BYTEStub is = Program.createBYTEStub(pl, count);
			temp[p] =is;
			}

;
		return temp;
		}
public static BYTEStub createBYTEStub ( final int remotePlace, final int count)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final BYTEStub[] retStub = new BYTEStub[retDist];
					{
			//async(remotePlace)
				{

				final BYTEStub to = new BYTEStub(count);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final BYTEStub to = retStub[zero];
		return to;
		}
public static byte[] allocateLocalBYTEArray ( final int count)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final byte[] temp = new byte[localDist];
		return temp;
		}
public static byte BYTEGetValue ( final BYTEArray arr, final int index)		{

		final int pl = 0;

		final int placeIndex = 0;

		final BYTEStub[] contents = arr.contents;

		final BYTEStub indexStub = contents[placeIndex];

		final byte[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);

		final byte returnValue = localArray[localIndex];
		return returnValue;
		}
public static void BYTESetValue ( final BYTEArray arr, final int index, final byte val)		{

		final int pl = 0;

		final int placeIndex = 0;

		final BYTEStub[] contents = arr.contents;

		final BYTEStub indexStub = contents[placeIndex];

		final byte[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = val;
		return;
		}
public static INTStub[] createINTArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final INTStub[] temp = (INTStub[])(new INTStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <temp.length ;p++ )			{

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
for(int p= 0;p <temp.length ;p++ )			{

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
	/*value*/ class BYTEStub 
	 {
 
	public final byte[] localArray;


	public BYTEStub ( final int count)
		{

		localArray = Program.allocateLocalBYTEArray(count);
		}


	}
	/*value*/ class BYTEArray 
	 {
 
	public final BYTEStub[] contents;
	public final Dist distArray;


	public BYTEArray ( final Dist distArray_)
		{

		distArray = distArray_;

		contents = Program.createBYTEArray(distArray);
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
	class IDEATest   {
 
	public byteRefArray1 plain1;
	public byteRefArray1 crypt1;
	public byteRefArray1 plain2;
	public intValArray1 userkey;
	public intValArray1 ZR;
	public intValArray1 DKR;


	public IDEATest ( )
		{
		Program.IDEATest_buildTestData(this);

		final int X10_TEMP6 = 0;

		final int X10_TEMP3 = Program._IDEATest_array_rows;

		final int X10_TEMP4 = 1;

		final int X10_TEMP7 = X10_TEMP3 - X10_TEMP4;

		final Region1 X10_TEMP9 = Program.createNewRegion1R(X10_TEMP6, X10_TEMP7);

		final Dist1 X10_TEMP10 = Program.getBlockDist1(X10_TEMP9);

		final Dist1 D = X10_TEMP10;

		final Region1 RX10_TEMP0 = D.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = D.dDist;

		final BYTEArray RX10_TEMP3 = new BYTEArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = D.dDist;

				final int RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP5)
					{

					final Point1 p = RX10_TEMP2[RX10_TEMP4];

					final int i = p.f0;

					final byte X10_TEMP13 = (byte)(byte)i;
					Program.BYTESetValue(RX10_TEMP3, RX10_TEMP4, X10_TEMP13);
					}
				}
			}

		final byteRefArray1 RX10_TEMP6 = new byteRefArray1(D, RX10_TEMP3);

		final byteRefArray1 X10_TEMP15 = RX10_TEMP6;

		plain1 = X10_TEMP15;

		final Region1 RX10_TEMP7 = D.dReg;

		final Point1[] RX10_TEMP9 = RX10_TEMP7.pointArray;

		final Dist RX10_TEMP8 = D.dDist;

		final BYTEArray RX10_TEMP10 = new BYTEArray(RX10_TEMP8);

		final byteRefArray1 RX10_TEMP11 = new byteRefArray1(D, RX10_TEMP10);

		final byteRefArray1 X10_TEMP17 = RX10_TEMP11;

		crypt1 = X10_TEMP17;

		final Region1 RX10_TEMP12 = D.dReg;

		final Point1[] RX10_TEMP14 = RX10_TEMP12.pointArray;

		final Dist RX10_TEMP13 = D.dDist;

		final BYTEArray RX10_TEMP15 = new BYTEArray(RX10_TEMP13);

		final byteRefArray1 RX10_TEMP16 = new byteRefArray1(D, RX10_TEMP15);

		final byteRefArray1 X10_TEMP19 = RX10_TEMP16;

		plain2 = X10_TEMP19;
		}



}
	class Random   {
 
	public long seed;


	public Random ( final long rseed)
		{

		long X10_TEMP1 = rseed;
		Program.Random_setSeed(this, X10_TEMP1);
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
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_)
		{

		f0 = f0_;
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
	/*value*/ class byteRefArray1 
	 {
 
	public final Dist1 distValue;
	public final BYTEArray contents;


	public byteRefArray1 ( final Dist1 distValue_, final BYTEArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
		}


	}
	/*value*/ class intValArray1 
	 {
 
	public final Region1 regionValue;
	public final int[] contents;


	public intValArray1 ( final Region1 regionValue_, final int[] contents_)
		{

		regionValue = regionValue_;

		contents = contents_;
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
