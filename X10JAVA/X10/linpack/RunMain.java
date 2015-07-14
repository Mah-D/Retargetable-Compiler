public class RunMain {
 
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program   {
 
public static final Region1 _Linpack_r = Program._Linpack_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static Region1 _Linpack_r_init ( )		{

		final int X10_TEMP3 = 0;

		final int X10_TEMP4 = 2;

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		return X10_TEMP6;
		}
public static void Linpack_initdataSizesArray ( final Linpack X10_TEMP0, final intRefArray1 datasizes)		{

		final int X10_TEMP2 = 0;

		final int X10_TEMP5 = 150;

		final int X10_TEMP6 = X10_TEMP5;

		final Point1 RX10_TEMP0 = new Point1(X10_TEMP2);

		final Dist1 RX10_TEMP1 = datasizes.distValue;

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

			String RX10_TEMP8 = "Bad place access for array datasizes";
throw new RuntimeException(RX10_TEMP8);

			}

		final INTArray RX10_TEMP11 = datasizes.contents;
		Program.INTSetValue(RX10_TEMP11, RX10_TEMP3, X10_TEMP6);

		final int X10_TEMP8 = 1;

		final int X10_TEMP11 = 1000;

		final int X10_TEMP12 = X10_TEMP11;

		final Point1 RX10_TEMP12 = new Point1(X10_TEMP8);

		final Dist1 RX10_TEMP13 = datasizes.distValue;

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

			String RX10_TEMP20 = "Bad place access for array datasizes";
throw new RuntimeException(RX10_TEMP20);

			}

		final INTArray RX10_TEMP23 = datasizes.contents;
		Program.INTSetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP12);

		final int X10_TEMP14 = 2;

		final int X10_TEMP17 = 2000;

		final int X10_TEMP18 = X10_TEMP17;

		final Point1 RX10_TEMP24 = new Point1(X10_TEMP14);

		final Dist1 RX10_TEMP25 = datasizes.distValue;

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

			String RX10_TEMP32 = "Bad place access for array datasizes";
throw new RuntimeException(RX10_TEMP32);

			}

		final INTArray RX10_TEMP35 = datasizes.contents;
		Program.INTSetValue(RX10_TEMP35, RX10_TEMP27, X10_TEMP18);
		}
public static void Linpack_JGFsetsize ( final Linpack X10_TEMP0, final int setSize)		{

		final int X10_TEMP3 = setSize;
		X10_TEMP0.setSize = (X10_TEMP3);
		}
public static void Linpack_JGFinitialise ( final Linpack X10_TEMP0, final Dist1 vd)		{

		final Region1 RX10_TEMP0 = vd.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = vd.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = vd.dDist;

				final int RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP5)
					{

					final Point1 p0 = RX10_TEMP2[RX10_TEMP4];

					final int X10_TEMP2 = 0;
					Program.INTSetValue(RX10_TEMP3, RX10_TEMP4, X10_TEMP2);
					}
				}
			}

		final intRefArray1 RX10_TEMP6 = new intRefArray1(vd, RX10_TEMP3);

		final intRefArray1 datasizes = RX10_TEMP6;
		Program.Linpack_initdataSizesArray(X10_TEMP0, datasizes);

		final int X10_TEMP6 = X10_TEMP0.setSize;

		final Point1 RX10_TEMP7 = new Point1(X10_TEMP6);

		final Dist1 RX10_TEMP8 = datasizes.distValue;

		final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;

		final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP7);

		final int RX10_TEMP11 = 0;

		final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
		if(RX10_TEMP12)
			{

			String RX10_TEMP13 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP13);

			}

		final Dist SX10_TEMP1 = RX10_TEMP8.dDist;

		final int RX10_TEMP14 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP10);

		final int RX10_TEMP16 = 0;

		final boolean RX10_TEMP17 = RX10_TEMP14 != RX10_TEMP16;
		if(RX10_TEMP17)
			{

			String RX10_TEMP15 = "Bad place access for array datasizes";
throw new RuntimeException(RX10_TEMP15);

			}

		final INTArray RX10_TEMP18 = datasizes.contents;

		final int X10_TEMP9 = Program.INTGetValue(RX10_TEMP18, RX10_TEMP10);

		final int X10_TEMP10 = X10_TEMP9;
		X10_TEMP0.n = (X10_TEMP10);

		final String X10_TEMP11 = "ATTENTION: Running with smaller size (";

		final int X10_TEMP12 = X10_TEMP0.n;

		final String X10_TEMP13 = X10_TEMP11 + X10_TEMP12;

		final String X10_TEMP14 = " instead of 500)";

		final String X10_TEMP16 = X10_TEMP13 + X10_TEMP14;
		System.out.println(X10_TEMP16);

		final int X10_TEMP19 = X10_TEMP0.n;

		final int X10_TEMP20 = X10_TEMP19;
		X10_TEMP0.ldaa = (X10_TEMP20);

		final int X10_TEMP21 = X10_TEMP0.ldaa;

		final int X10_TEMP22 = 1;

		final int X10_TEMP25 = X10_TEMP21 + X10_TEMP22;

		final int X10_TEMP26 = X10_TEMP25;
		X10_TEMP0.lda = (X10_TEMP26);

		final int X10_TEMP29 = 0;

		final int X10_TEMP30 = X10_TEMP0.ldaa;

		Region1 vectorRegion = Program.createNewRegion1R(X10_TEMP29, X10_TEMP30);

		final int X10_TEMP36 = 0;

		final int X10_TEMP33 = X10_TEMP0.ldaa;

		final int X10_TEMP34 = 1;

		final int X10_TEMP37 = X10_TEMP33 - X10_TEMP34;

		Region1 vectorRegionMinus1 = Program.createNewRegion1R(X10_TEMP36, X10_TEMP37);

		final int X10_TEMP39 = 0;

		Dist1 vectorRegionMinus1Dist = Program.getPlaceDist1(vectorRegionMinus1, X10_TEMP39);

		final int X10_TEMP43 = 0;

		final int X10_TEMP44 = X10_TEMP0.ldaa;

		final int X10_TEMP47 = 0;

		final int X10_TEMP48 = X10_TEMP0.lda;

		Region2 rectangularRegion = Program.createNewRegion2RR(X10_TEMP43, X10_TEMP44, X10_TEMP47, X10_TEMP48);

		final int X10_TEMP52 = 0;

		final int X10_TEMP53 = 0;

		final int X10_TEMP56 = 0;

		final int X10_TEMP57 = X10_TEMP0.lda;

		Region2 slimRegion = Program.createNewRegion2RR(X10_TEMP52, X10_TEMP53, X10_TEMP56, X10_TEMP57);

		final int X10_TEMP59 = 0;

		Dist2 slimRegionDist = Program.getPlaceDist2(slimRegion, X10_TEMP59);

		final int X10_TEMP62 = X10_TEMP0.lda;

		final int X10_TEMP63 = 1;

		final int X10_TEMP65 = X10_TEMP62 + X10_TEMP63;

		final Dist2 X10_TEMP66 = Program.getBlockCyclicDist2(rectangularRegion, X10_TEMP65);

		Dist2 rectangular_distribution = X10_TEMP66;

		final Region2 RX10_TEMP19 = rectangular_distribution.dReg;

		final Point2[] RX10_TEMP21 = RX10_TEMP19.pointArray;

		final Dist RX10_TEMP20 = rectangular_distribution.dDist;

		final DOUBLEArray RX10_TEMP22 = new DOUBLEArray(RX10_TEMP20);

		final doubleRefArray2 RX10_TEMP23 = new doubleRefArray2(rectangular_distribution, RX10_TEMP22);

		final doubleRefArray2 X10_TEMP70 = RX10_TEMP23;

		final doubleRefArray2 X10_TEMP71 = X10_TEMP70;
		X10_TEMP0.a = (X10_TEMP71);

		final Region2 RX10_TEMP24 = slimRegionDist.dReg;

		final Point2[] RX10_TEMP26 = RX10_TEMP24.pointArray;

		final Dist RX10_TEMP25 = slimRegionDist.dDist;

		final DOUBLEArray RX10_TEMP27 = new DOUBLEArray(RX10_TEMP25);

		final doubleRefArray2 RX10_TEMP28 = new doubleRefArray2(slimRegionDist, RX10_TEMP27);

		final doubleRefArray2 X10_TEMP74 = RX10_TEMP28;

		final doubleRefArray2 X10_TEMP75 = X10_TEMP74;
		X10_TEMP0.b = (X10_TEMP75);

		final Region2 RX10_TEMP29 = slimRegionDist.dReg;

		final Point2[] RX10_TEMP31 = RX10_TEMP29.pointArray;

		final Dist RX10_TEMP30 = slimRegionDist.dDist;

		final DOUBLEArray RX10_TEMP32 = new DOUBLEArray(RX10_TEMP30);

		final doubleRefArray2 RX10_TEMP33 = new doubleRefArray2(slimRegionDist, RX10_TEMP32);

		final doubleRefArray2 X10_TEMP78 = RX10_TEMP33;

		final doubleRefArray2 X10_TEMP79 = X10_TEMP78;
		X10_TEMP0.x = (X10_TEMP79);

		final Region1 RX10_TEMP34 = vectorRegionMinus1Dist.dReg;

		final Point1[] RX10_TEMP36 = RX10_TEMP34.pointArray;

		final Dist RX10_TEMP35 = vectorRegionMinus1Dist.dDist;

		final INTArray RX10_TEMP37 = new INTArray(RX10_TEMP35);

		final intRefArray1 RX10_TEMP38 = new intRefArray1(vectorRegionMinus1Dist, RX10_TEMP37);

		final intRefArray1 X10_TEMP82 = RX10_TEMP38;

		final intRefArray1 X10_TEMP83 = X10_TEMP82;
		X10_TEMP0.ipvt = (X10_TEMP83);

		final int X10_TEMP84 = X10_TEMP0.n;

		long nl = (long)X10_TEMP84;

		final double X10_TEMP89 = 2.0;

		final long X10_TEMP86 = nl * nl;

		final long X10_TEMP88 = X10_TEMP86 * nl;

		final double X10_TEMP91 = X10_TEMP89 * X10_TEMP88;

		final double X10_TEMP92 = 3.0;

		final double X10_TEMP96 = X10_TEMP91 / X10_TEMP92;

		final double X10_TEMP95 = 2.0;

		final long X10_TEMP94 = nl * nl;

		final double X10_TEMP97 = X10_TEMP95 * X10_TEMP94;

		final double X10_TEMP100 = X10_TEMP96 + X10_TEMP97;

		final double X10_TEMP101 = X10_TEMP100;
		X10_TEMP0.ops = (X10_TEMP101);

		final doubleRefArray2 X10_TEMP106 = X10_TEMP0.a;

		final int X10_TEMP107 = X10_TEMP0.lda;

		final int X10_TEMP108 = X10_TEMP0.n;

		final doubleRefArray2 X10_TEMP109 = X10_TEMP0.b;

		final double X10_TEMP112 = Program.Linpack_matgen(X10_TEMP0, X10_TEMP106, X10_TEMP107, X10_TEMP108, X10_TEMP109);

		final double X10_TEMP113 = X10_TEMP112;
		X10_TEMP0.norma = (X10_TEMP113);
		}
public static void Linpack_JGFkernel ( final Linpack X10_TEMP0)		{

		final doubleRefArray2 X10_TEMP5 = X10_TEMP0.a;

		final int X10_TEMP6 = X10_TEMP0.lda;

		final int X10_TEMP7 = X10_TEMP0.n;

		final intRefArray1 X10_TEMP8 = X10_TEMP0.ipvt;

		final int X10_TEMP11 = Program.Linpack_dgefa(X10_TEMP0, X10_TEMP5, X10_TEMP6, X10_TEMP7, X10_TEMP8);

		final int X10_TEMP12 = X10_TEMP11;
		X10_TEMP0.info = (X10_TEMP12);

		final doubleRefArray2 X10_TEMP19 = X10_TEMP0.a;

		final int X10_TEMP20 = X10_TEMP0.lda;

		final int X10_TEMP21 = X10_TEMP0.n;

		final intRefArray1 X10_TEMP22 = X10_TEMP0.ipvt;

		final doubleRefArray2 X10_TEMP23 = X10_TEMP0.b;

		final int X10_TEMP24 = 0;
		Program.Linpack_dgesl(X10_TEMP0, X10_TEMP19, X10_TEMP20, X10_TEMP21, X10_TEMP22, X10_TEMP23, X10_TEMP24);
		}
public static void Linpack_JGFvalidate ( final Linpack X10_TEMP0, final Dist1 vd)		{

		double eps = 0.0;

		double residn = 0.0;

		final Region1 RX10_TEMP0 = vd.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = vd.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = vd.dDist;

				final int RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP5)
					{

					final Point1 p0 = RX10_TEMP2[RX10_TEMP4];

					final double X10_TEMP4 = 0.0;
					Program.DOUBLESetValue(RX10_TEMP3, RX10_TEMP4, X10_TEMP4);
					}
				}
			}

		final doubleRefArray1 RX10_TEMP6 = new doubleRefArray1(vd, RX10_TEMP3);

		final doubleRefArray1 ref = RX10_TEMP6;

		final int X10_TEMP7 = 0;

		final double X10_TEMP10 = 6.0;

		final double X10_TEMP11 = X10_TEMP10;

		final Point1 RX10_TEMP7 = new Point1(X10_TEMP7);

		final Dist1 RX10_TEMP8 = ref.distValue;

		final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;

		final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP7);

		final int RX10_TEMP11 = 0;

		final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
		if(RX10_TEMP12)
			{

			String RX10_TEMP13 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP13);

			}

		final Dist SX10_TEMP1 = RX10_TEMP8.dDist;

		final int RX10_TEMP14 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP10);

		final int RX10_TEMP16 = 0;

		final boolean RX10_TEMP17 = RX10_TEMP14 != RX10_TEMP16;
		if(RX10_TEMP17)
			{

			String RX10_TEMP15 = "Bad place access for array ref";
throw new RuntimeException(RX10_TEMP15);

			}

		final DOUBLEArray RX10_TEMP18 = ref.contents;
		Program.DOUBLESetValue(RX10_TEMP18, RX10_TEMP10, X10_TEMP11);

		final int X10_TEMP13 = 1;

		final double X10_TEMP16 = 12.0;

		final double X10_TEMP17 = X10_TEMP16;

		final Point1 RX10_TEMP19 = new Point1(X10_TEMP13);

		final Dist1 RX10_TEMP20 = ref.distValue;

		final Region1 RX10_TEMP21 = RX10_TEMP20.dReg;

		final int RX10_TEMP22 = Program.searchPointInRegion1(RX10_TEMP21, RX10_TEMP19);

		final int RX10_TEMP23 = 0;

		final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23;
		if(RX10_TEMP24)
			{

			String RX10_TEMP25 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP25);

			}

		final Dist SX10_TEMP2 = RX10_TEMP20.dDist;

		final int RX10_TEMP26 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP22);

		final int RX10_TEMP28 = 0;

		final boolean RX10_TEMP29 = RX10_TEMP26 != RX10_TEMP28;
		if(RX10_TEMP29)
			{

			String RX10_TEMP27 = "Bad place access for array ref";
throw new RuntimeException(RX10_TEMP27);

			}

		final DOUBLEArray RX10_TEMP30 = ref.contents;
		Program.DOUBLESetValue(RX10_TEMP30, RX10_TEMP22, X10_TEMP17);

		final int X10_TEMP19 = 2;

		final double X10_TEMP22 = 20.0;

		final double X10_TEMP23 = X10_TEMP22;

		final Point1 RX10_TEMP31 = new Point1(X10_TEMP19);

		final Dist1 RX10_TEMP32 = ref.distValue;

		final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;

		final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31);

		final int RX10_TEMP35 = 0;

		final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;
		if(RX10_TEMP36)
			{

			String RX10_TEMP37 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP37);

			}

		final Dist SX10_TEMP3 = RX10_TEMP32.dDist;

		final int RX10_TEMP38 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP34);

		final int RX10_TEMP40 = 0;

		final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;
		if(RX10_TEMP41)
			{

			String RX10_TEMP39 = "Bad place access for array ref";
throw new RuntimeException(RX10_TEMP39);

			}

		final DOUBLEArray RX10_TEMP42 = ref.contents;
		Program.DOUBLESetValue(RX10_TEMP42, RX10_TEMP34, X10_TEMP23);

		final int X10_TEMP26 = 0;

		final int X10_TEMP27 = 0;

		final int X10_TEMP30 = 0;

		final int X10_TEMP31 = X10_TEMP0.n;

		final Region2 tempR = Program.createNewRegion2RR(X10_TEMP26, X10_TEMP27, X10_TEMP30, X10_TEMP31);

		final int X10_TEMP33 = 0;

		final Dist2 tempdist = Program.getPlaceDist2(tempR, X10_TEMP33);

		final Region2 RX10_TEMP45 = tempdist.dReg;

		final Point2[] RX10_TEMP46 = RX10_TEMP45.pointArray;
		for(int RX10_TEMP43=0; RX10_TEMP43 < RX10_TEMP46.length; RX10_TEMP43++)
			{

			final Point2 RX10_TEMP44 = RX10_TEMP46[RX10_TEMP43];

			final int j = RX10_TEMP44.f0;

			final int i = RX10_TEMP44.f1;

			final doubleRefArray2 X10_TEMP36 = X10_TEMP0.x;

			final int X10_TEMP39 = 0;

			final doubleRefArray2 X10_TEMP40 = X10_TEMP0.b;

			final int X10_TEMP43 = 0;

			final Point2 RX10_TEMP47 = new Point2(X10_TEMP43, i);

			final Dist2 RX10_TEMP48 = X10_TEMP40.distValue;

			final Region2 RX10_TEMP49 = RX10_TEMP48.dReg;

			final int RX10_TEMP50 = Program.searchPointInRegion2(RX10_TEMP49, RX10_TEMP47);

			final int RX10_TEMP51 = 0;

			final boolean RX10_TEMP52 = RX10_TEMP50 < RX10_TEMP51;
			if(RX10_TEMP52)
				{

				String RX10_TEMP53 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP53);

				}

			final Dist SX10_TEMP4 = RX10_TEMP48.dDist;

			final int RX10_TEMP54 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP50);

			final int RX10_TEMP56 = 0;

			final boolean RX10_TEMP57 = RX10_TEMP54 != RX10_TEMP56;
			if(RX10_TEMP57)
				{

				String RX10_TEMP55 = "Bad place access for array X10_TEMP40";
throw new RuntimeException(RX10_TEMP55);

				}

			final DOUBLEArray RX10_TEMP58 = X10_TEMP40.contents;

			final double X10_TEMP46 = Program.DOUBLEGetValue(RX10_TEMP58, RX10_TEMP50);

			final double X10_TEMP47 = X10_TEMP46;

			final Point2 RX10_TEMP59 = new Point2(X10_TEMP39, i);

			final Dist2 RX10_TEMP60 = X10_TEMP36.distValue;

			final Region2 RX10_TEMP61 = RX10_TEMP60.dReg;

			final int RX10_TEMP62 = Program.searchPointInRegion2(RX10_TEMP61, RX10_TEMP59);

			final int RX10_TEMP63 = 0;

			final boolean RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63;
			if(RX10_TEMP64)
				{

				String RX10_TEMP65 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP65);

				}

			final Dist SX10_TEMP5 = RX10_TEMP60.dDist;

			final int RX10_TEMP66 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP62);

			final int RX10_TEMP68 = 0;

			final boolean RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68;
			if(RX10_TEMP69)
				{

				String RX10_TEMP67 = "Bad place access for array X10_TEMP36";
throw new RuntimeException(RX10_TEMP67);

				}

			final DOUBLEArray RX10_TEMP70 = X10_TEMP36.contents;
			Program.DOUBLESetValue(RX10_TEMP70, RX10_TEMP62, X10_TEMP47);
			}

		final doubleRefArray2 X10_TEMP52 = X10_TEMP0.a;

		final int X10_TEMP53 = X10_TEMP0.lda;

		final int X10_TEMP54 = X10_TEMP0.n;

		final doubleRefArray2 X10_TEMP55 = X10_TEMP0.b;

		final double X10_TEMP58 = Program.Linpack_matgen(X10_TEMP0, X10_TEMP52, X10_TEMP53, X10_TEMP54, X10_TEMP55);

		final double X10_TEMP59 = X10_TEMP58;
		X10_TEMP0.norma = (X10_TEMP59);

		final Region2 RX10_TEMP73 = tempdist.dReg;

		final Point2[] RX10_TEMP74 = RX10_TEMP73.pointArray;
		for(int RX10_TEMP71=0; RX10_TEMP71 < RX10_TEMP74.length; RX10_TEMP71++)
			{

			final Point2 RX10_TEMP72 = RX10_TEMP74[RX10_TEMP71];

			final int j = RX10_TEMP72.f0;

			final int i = RX10_TEMP72.f1;

			final doubleRefArray2 X10_TEMP61 = X10_TEMP0.b;

			final int X10_TEMP64 = 0;

			final doubleRefArray2 X10_TEMP65 = X10_TEMP0.b;

			final int X10_TEMP68 = 0;

			final Point2 RX10_TEMP75 = new Point2(X10_TEMP68, i);

			final Dist2 RX10_TEMP76 = X10_TEMP65.distValue;

			final Region2 RX10_TEMP77 = RX10_TEMP76.dReg;

			final int RX10_TEMP78 = Program.searchPointInRegion2(RX10_TEMP77, RX10_TEMP75);

			final int RX10_TEMP79 = 0;

			final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79;
			if(RX10_TEMP80)
				{

				String RX10_TEMP81 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP81);

				}

			final Dist SX10_TEMP6 = RX10_TEMP76.dDist;

			final int RX10_TEMP82 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP78);

			final int RX10_TEMP84 = 0;

			final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84;
			if(RX10_TEMP85)
				{

				String RX10_TEMP83 = "Bad place access for array X10_TEMP65";
throw new RuntimeException(RX10_TEMP83);

				}

			final DOUBLEArray RX10_TEMP86 = X10_TEMP65.contents;

			final double X10_TEMP69 = Program.DOUBLEGetValue(RX10_TEMP86, RX10_TEMP78);

			final int X10_TEMP70 = 0;

			final double X10_TEMP73 = X10_TEMP70 - X10_TEMP69;

			final double X10_TEMP74 = X10_TEMP73;

			final Point2 RX10_TEMP87 = new Point2(X10_TEMP64, i);

			final Dist2 RX10_TEMP88 = X10_TEMP61.distValue;

			final Region2 RX10_TEMP89 = RX10_TEMP88.dReg;

			final int RX10_TEMP90 = Program.searchPointInRegion2(RX10_TEMP89, RX10_TEMP87);

			final int RX10_TEMP91 = 0;

			final boolean RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91;
			if(RX10_TEMP92)
				{

				String RX10_TEMP93 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP93);

				}

			final Dist SX10_TEMP7 = RX10_TEMP88.dDist;

			final int RX10_TEMP94 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP90);

			final int RX10_TEMP96 = 0;

			final boolean RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96;
			if(RX10_TEMP97)
				{

				String RX10_TEMP95 = "Bad place access for array X10_TEMP61";
throw new RuntimeException(RX10_TEMP95);

				}

			final DOUBLEArray RX10_TEMP98 = X10_TEMP61.contents;
			Program.DOUBLESetValue(RX10_TEMP98, RX10_TEMP90, X10_TEMP74);
			}

		final int X10_TEMP81 = X10_TEMP0.n;

		final doubleRefArray2 X10_TEMP82 = X10_TEMP0.b;

		final int X10_TEMP83 = X10_TEMP0.n;

		final int X10_TEMP84 = X10_TEMP0.lda;

		final doubleRefArray2 X10_TEMP85 = X10_TEMP0.x;

		final doubleRefArray2 X10_TEMP86 = X10_TEMP0.a;
		Program.Linpack_dmxpy(X10_TEMP0, X10_TEMP81, X10_TEMP82, X10_TEMP83, X10_TEMP84, X10_TEMP85, X10_TEMP86);

		final double X10_TEMP89 = 0.0;

		final double X10_TEMP90 = X10_TEMP89;
		X10_TEMP0.resid = (X10_TEMP90);

		final double X10_TEMP93 = 0.0;

		final double X10_TEMP94 = X10_TEMP93;
		X10_TEMP0.normx = (X10_TEMP94);

		final Region2 RX10_TEMP101 = tempdist.dReg;

		final Point2[] RX10_TEMP102 = RX10_TEMP101.pointArray;
		for(int RX10_TEMP99=0; RX10_TEMP99 < RX10_TEMP102.length; RX10_TEMP99++)
			{

			final Point2 RX10_TEMP100 = RX10_TEMP102[RX10_TEMP99];

			final int j = RX10_TEMP100.f0;

			final int i = RX10_TEMP100.f1;

			final double X10_TEMP102 = X10_TEMP0.resid;

			final doubleRefArray2 X10_TEMP96 = X10_TEMP0.b;

			final int X10_TEMP99 = 0;

			final Point2 RX10_TEMP103 = new Point2(X10_TEMP99, i);

			final Dist2 RX10_TEMP104 = X10_TEMP96.distValue;

			final Region2 RX10_TEMP105 = RX10_TEMP104.dReg;

			final int RX10_TEMP106 = Program.searchPointInRegion2(RX10_TEMP105, RX10_TEMP103);

			final int RX10_TEMP107 = 0;

			final boolean RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107;
			if(RX10_TEMP108)
				{

				String RX10_TEMP109 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP109);

				}

			final Dist SX10_TEMP8 = RX10_TEMP104.dDist;

			final int RX10_TEMP110 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP106);

			final int RX10_TEMP112 = 0;

			final boolean RX10_TEMP113 = RX10_TEMP110 != RX10_TEMP112;
			if(RX10_TEMP113)
				{

				String RX10_TEMP111 = "Bad place access for array X10_TEMP96";
throw new RuntimeException(RX10_TEMP111);

				}

			final DOUBLEArray RX10_TEMP114 = X10_TEMP96.contents;

			final double X10_TEMP101 = Program.DOUBLEGetValue(RX10_TEMP114, RX10_TEMP106);

			final double X10_TEMP103 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP101);

			final boolean X10_TEMP105 = X10_TEMP102 > X10_TEMP103;

			final boolean X10_TEMP106 = X10_TEMP105;

			final doubleRefArray2 X10_TEMP108 = X10_TEMP0.b;

			final int X10_TEMP111 = 0;

			final Point2 RX10_TEMP115 = new Point2(X10_TEMP111, i);

			final Dist2 RX10_TEMP116 = X10_TEMP108.distValue;

			final Region2 RX10_TEMP117 = RX10_TEMP116.dReg;

			final int RX10_TEMP118 = Program.searchPointInRegion2(RX10_TEMP117, RX10_TEMP115);

			final int RX10_TEMP119 = 0;

			final boolean RX10_TEMP120 = RX10_TEMP118 < RX10_TEMP119;
			if(RX10_TEMP120)
				{

				String RX10_TEMP121 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP121);

				}

			final Dist SX10_TEMP9 = RX10_TEMP116.dDist;

			final int RX10_TEMP122 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP118);

			final int RX10_TEMP124 = 0;

			final boolean RX10_TEMP125 = RX10_TEMP122 != RX10_TEMP124;
			if(RX10_TEMP125)
				{

				String RX10_TEMP123 = "Bad place access for array X10_TEMP108";
throw new RuntimeException(RX10_TEMP123);

				}

			final DOUBLEArray RX10_TEMP126 = X10_TEMP108.contents;

			final double X10_TEMP113 = Program.DOUBLEGetValue(RX10_TEMP126, RX10_TEMP118);

			double X10_TEMP115 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP113);
			if(X10_TEMP106)
				{

				X10_TEMP115 = X10_TEMP0.resid;
				}

			final double X10_TEMP116 = X10_TEMP115;

			final double X10_TEMP118 = X10_TEMP116;
			X10_TEMP0.resid = (X10_TEMP118);

			final double X10_TEMP125 = X10_TEMP0.normx;

			final doubleRefArray2 X10_TEMP119 = X10_TEMP0.x;

			final int X10_TEMP122 = 0;

			final Point2 RX10_TEMP127 = new Point2(X10_TEMP122, i);

			final Dist2 RX10_TEMP128 = X10_TEMP119.distValue;

			final Region2 RX10_TEMP129 = RX10_TEMP128.dReg;

			final int RX10_TEMP130 = Program.searchPointInRegion2(RX10_TEMP129, RX10_TEMP127);

			final int RX10_TEMP131 = 0;

			final boolean RX10_TEMP132 = RX10_TEMP130 < RX10_TEMP131;
			if(RX10_TEMP132)
				{

				String RX10_TEMP133 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP133);

				}

			final Dist SX10_TEMP10 = RX10_TEMP128.dDist;

			final int RX10_TEMP134 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP130);

			final int RX10_TEMP136 = 0;

			final boolean RX10_TEMP137 = RX10_TEMP134 != RX10_TEMP136;
			if(RX10_TEMP137)
				{

				String RX10_TEMP135 = "Bad place access for array X10_TEMP119";
throw new RuntimeException(RX10_TEMP135);

				}

			final DOUBLEArray RX10_TEMP138 = X10_TEMP119.contents;

			final double X10_TEMP124 = Program.DOUBLEGetValue(RX10_TEMP138, RX10_TEMP130);

			final double X10_TEMP126 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP124);

			final boolean X10_TEMP128 = X10_TEMP125 > X10_TEMP126;

			final boolean X10_TEMP129 = X10_TEMP128;

			final doubleRefArray2 X10_TEMP131 = X10_TEMP0.x;

			final int X10_TEMP134 = 0;

			final Point2 RX10_TEMP139 = new Point2(X10_TEMP134, i);

			final Dist2 RX10_TEMP140 = X10_TEMP131.distValue;

			final Region2 RX10_TEMP141 = RX10_TEMP140.dReg;

			final int RX10_TEMP142 = Program.searchPointInRegion2(RX10_TEMP141, RX10_TEMP139);

			final int RX10_TEMP143 = 0;

			final boolean RX10_TEMP144 = RX10_TEMP142 < RX10_TEMP143;
			if(RX10_TEMP144)
				{

				String RX10_TEMP145 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP145);

				}

			final Dist SX10_TEMP11 = RX10_TEMP140.dDist;

			final int RX10_TEMP146 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP142);

			final int RX10_TEMP148 = 0;

			final boolean RX10_TEMP149 = RX10_TEMP146 != RX10_TEMP148;
			if(RX10_TEMP149)
				{

				String RX10_TEMP147 = "Bad place access for array X10_TEMP131";
throw new RuntimeException(RX10_TEMP147);

				}

			final DOUBLEArray RX10_TEMP150 = X10_TEMP131.contents;

			final double X10_TEMP136 = Program.DOUBLEGetValue(RX10_TEMP150, RX10_TEMP142);

			double X10_TEMP138 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP136);
			if(X10_TEMP129)
				{

				X10_TEMP138 = X10_TEMP0.normx;
				}

			final double X10_TEMP139 = X10_TEMP138;

			final double X10_TEMP141 = X10_TEMP139;
			X10_TEMP0.normx = (X10_TEMP141);
			}

		final double X10_TEMP142 = 1.0;

		final double X10_TEMP144 = (double)X10_TEMP142;

		final double X10_TEMP146 = Program.Linpack_epslon(X10_TEMP0, X10_TEMP144);

		eps = X10_TEMP146;

		final double X10_TEMP154 = X10_TEMP0.resid;

		final double X10_TEMP147 = X10_TEMP0.n;

		final double X10_TEMP148 = X10_TEMP0.norma;

		final double X10_TEMP149 = X10_TEMP147 * X10_TEMP148;

		final double X10_TEMP150 = X10_TEMP0.normx;

		final double X10_TEMP151 = X10_TEMP149 * X10_TEMP150;

		final double X10_TEMP153 = X10_TEMP151 * eps;

		final double X10_TEMP156 = X10_TEMP154 / X10_TEMP153;

		residn = X10_TEMP156;

		final int X10_TEMP158 = X10_TEMP0.setSize;

		final Point1 RX10_TEMP151 = new Point1(X10_TEMP158);

		final Dist1 RX10_TEMP152 = ref.distValue;

		final Region1 RX10_TEMP153 = RX10_TEMP152.dReg;

		final int RX10_TEMP154 = Program.searchPointInRegion1(RX10_TEMP153, RX10_TEMP151);

		final int RX10_TEMP155 = 0;

		final boolean RX10_TEMP156 = RX10_TEMP154 < RX10_TEMP155;
		if(RX10_TEMP156)
			{

			String RX10_TEMP157 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP157);

			}

		final Dist SX10_TEMP12 = RX10_TEMP152.dDist;

		final int RX10_TEMP158 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP154);

		final int RX10_TEMP160 = 0;

		final boolean RX10_TEMP161 = RX10_TEMP158 != RX10_TEMP160;
		if(RX10_TEMP161)
			{

			String RX10_TEMP159 = "Bad place access for array ref";
throw new RuntimeException(RX10_TEMP159);

			}

		final DOUBLEArray RX10_TEMP162 = ref.contents;

		final double X10_TEMP159 = Program.DOUBLEGetValue(RX10_TEMP162, RX10_TEMP154);

		final boolean X10_TEMP161 = residn > X10_TEMP159;
		if(X10_TEMP161)
			{

			final String X10_TEMP163 = "Validation failed";
			System.out.println(X10_TEMP163);

			final String X10_TEMP164 = "Computed Norm Res = ";

			final String X10_TEMP166 = X10_TEMP164 + residn;
			System.out.println(X10_TEMP166);

			final String X10_TEMP169 = "Reference Norm Res = ";

			final int X10_TEMP168 = X10_TEMP0.setSize;

			final Point1 RX10_TEMP163 = new Point1(X10_TEMP168);

			final Dist1 RX10_TEMP164 = ref.distValue;

			final Region1 RX10_TEMP165 = RX10_TEMP164.dReg;

			final int RX10_TEMP166 = Program.searchPointInRegion1(RX10_TEMP165, RX10_TEMP163);

			final int RX10_TEMP167 = 0;

			final boolean RX10_TEMP168 = RX10_TEMP166 < RX10_TEMP167;
			if(RX10_TEMP168)
				{

				String RX10_TEMP169 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP169);

				}

			final Dist SX10_TEMP13 = RX10_TEMP164.dDist;

			final int RX10_TEMP170 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP166);

			final int RX10_TEMP172 = 0;

			final boolean RX10_TEMP173 = RX10_TEMP170 != RX10_TEMP172;
			if(RX10_TEMP173)
				{

				String RX10_TEMP171 = "Bad place access for array ref";
throw new RuntimeException(RX10_TEMP171);

				}

			final DOUBLEArray RX10_TEMP174 = ref.contents;

			final double X10_TEMP170 = Program.DOUBLEGetValue(RX10_TEMP174, RX10_TEMP166);

			final String X10_TEMP172 = X10_TEMP169 + X10_TEMP170;
			System.out.println(X10_TEMP172);

			final String X10_TEMP174 = "Validation failed";
throw new RuntimeException(X10_TEMP174);

			}
		}
public static void Linpack_JGFtidyup ( final Linpack X10_TEMP0)		{
		}
public static void Linpack_run ( final Linpack X10_TEMP0)		{

		final int X10_TEMP2 = 0;
		Program.Linpack_JGFsetsize(X10_TEMP0, X10_TEMP2);

		final int X10_TEMP3 = 0;

		final Dist1 vd = Program.getPlaceDist1(_Linpack_r, X10_TEMP3);
		Program.Linpack_JGFinitialise(X10_TEMP0, vd);
		Program.Linpack_JGFkernel(X10_TEMP0);
		Program.Linpack_JGFvalidate(X10_TEMP0, vd);
		Program.Linpack_JGFtidyup(X10_TEMP0);
		}
public static double Linpack_read ( final Linpack X10_TEMP0, final doubleRefArray2 a, final int i, final int j)		{

		final int curr_place = 0;

		final int X10_TEMP4 = 0;

		final int X10_TEMP5 = 0;

		final Region1 tempr = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5);

		final int X10_TEMP7 = 0;

		final Dist1 tempvd = Program.getPlaceDist1(tempr, X10_TEMP7);

		final Region1 RX10_TEMP0 = tempvd.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = tempvd.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = tempvd.dDist;

				final int RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP5)
					{

					final Point1 p0 = RX10_TEMP2[RX10_TEMP4];

					final double X10_TEMP10 = 0.0;
					Program.DOUBLESetValue(RX10_TEMP3, RX10_TEMP4, X10_TEMP10);
					}
				}
			}

		final doubleRefArray1 RX10_TEMP6 = new doubleRefArray1(tempvd, RX10_TEMP3);

		final doubleRefArray1 tempref = RX10_TEMP6;
					{

			final Dist2 RX10_TEMP7 = a.distValue;

			final Dist2 X10_TEMP12 = RX10_TEMP7;

			final Point2 RX10_TEMP8 = new Point2(i, j);

			final Region2 RX10_TEMP9 = X10_TEMP12.dReg;

			final int RX10_TEMP10 = Program.searchPointInRegion2(RX10_TEMP9, RX10_TEMP8);

			final int RX10_TEMP11 = 0;

			final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
			if(RX10_TEMP12)
				{

				final String RX10_TEMP13 = "Point RX10_TEMP8 not found in the distribution X10_TEMP12.";
throw new RuntimeException(RX10_TEMP13);

				}

			final Dist SX10_TEMP1 = X10_TEMP12.dDist;

			final int RX10_TEMP14 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP10);

			final int X10_TEMP16 = RX10_TEMP14;
			//async(X10_TEMP16)
				{

				final Point2 RX10_TEMP15 = new Point2(i, j);

				final Dist2 RX10_TEMP16 = a.distValue;

				final Region2 RX10_TEMP17 = RX10_TEMP16.dReg;

				final int RX10_TEMP18 = Program.searchPointInRegion2(RX10_TEMP17, RX10_TEMP15);

				final int RX10_TEMP19 = 0;

				final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
				if(RX10_TEMP20)
					{

					String RX10_TEMP21 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP21);

					}

				final Dist SX10_TEMP2 = RX10_TEMP16.dDist;

				final int RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP18);

				final int RX10_TEMP24 = 0;

				final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
				if(RX10_TEMP25)
					{

					String RX10_TEMP23 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP23);

					}

				final DOUBLEArray RX10_TEMP26 = a.contents;

				final double temp = Program.DOUBLEGetValue(RX10_TEMP26, RX10_TEMP18);
				//async(curr_place)
					{

					final int X10_TEMP22 = 0;

					final double X10_TEMP25 = temp;

					final Point1 RX10_TEMP27 = new Point1(X10_TEMP22);

					final Dist1 RX10_TEMP28 = tempref.distValue;

					final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;

					final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, RX10_TEMP27);

					final int RX10_TEMP31 = 0;

					final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
					if(RX10_TEMP32)
						{

						String RX10_TEMP33 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP33);

						}

					final Dist SX10_TEMP3 = RX10_TEMP28.dDist;

					final int RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP30);

					final int RX10_TEMP36 = 0;

					final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
					if(RX10_TEMP37)
						{

						String RX10_TEMP35 = "Bad place access for array tempref";
throw new RuntimeException(RX10_TEMP35);

						}

					final DOUBLEArray RX10_TEMP38 = tempref.contents;
					Program.DOUBLESetValue(RX10_TEMP38, RX10_TEMP30, X10_TEMP25);
					}
				}
			}

		final int X10_TEMP27 = 0;

		final Point1 RX10_TEMP39 = new Point1(X10_TEMP27);

		final Dist1 RX10_TEMP40 = tempref.distValue;

		final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;

		final int RX10_TEMP42 = Program.searchPointInRegion1(RX10_TEMP41, RX10_TEMP39);

		final int RX10_TEMP43 = 0;

		final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;
		if(RX10_TEMP44)
			{

			String RX10_TEMP45 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP45);

			}

		final Dist SX10_TEMP4 = RX10_TEMP40.dDist;

		final int RX10_TEMP46 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP42);

		final int RX10_TEMP48 = 0;

		final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;
		if(RX10_TEMP49)
			{

			String RX10_TEMP47 = "Bad place access for array tempref";
throw new RuntimeException(RX10_TEMP47);

			}

		final DOUBLEArray RX10_TEMP50 = tempref.contents;

		final double X10_TEMP29 = Program.DOUBLEGetValue(RX10_TEMP50, RX10_TEMP42);
		return X10_TEMP29;
		}
public static void Linpack_write ( final Linpack X10_TEMP0, final doubleRefArray2 a, final Point2 p, final double val)		{

		final Dist2 RX10_TEMP0 = a.distValue;

		final Dist2 X10_TEMP1 = RX10_TEMP0;

		final Region2 RX10_TEMP1 = X10_TEMP1.dReg;

		final int RX10_TEMP2 = Program.searchPointInRegion2(RX10_TEMP1, p);

		final int RX10_TEMP3 = 0;

		final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3;
		if(RX10_TEMP4)
			{

			final String RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1.";
throw new RuntimeException(RX10_TEMP5);

			}

		final Dist SX10_TEMP0 = X10_TEMP1.dDist;

		final int RX10_TEMP6 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP2);

		final int X10_TEMP4 = RX10_TEMP6;
		//async(X10_TEMP4)
			{

			final double X10_TEMP8 = val;

			final Dist2 RX10_TEMP7 = a.distValue;

			final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;

			final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, p);

			final int RX10_TEMP10 = 0;

			final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10;
			if(RX10_TEMP11)
				{

				String RX10_TEMP12 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP12);

				}

			final Dist SX10_TEMP1 = RX10_TEMP7.dDist;

			final int RX10_TEMP13 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP9);

			final int RX10_TEMP15 = 0;

			final boolean RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15;
			if(RX10_TEMP16)
				{

				String RX10_TEMP14 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP14);

				}

			final DOUBLEArray RX10_TEMP17 = a.contents;
			Program.DOUBLESetValue(RX10_TEMP17, RX10_TEMP9, X10_TEMP8);
			}
		}
public static void Linpack_plusWrite ( final Linpack X10_TEMP0, final doubleRefArray2 a, final int i, final int j, final double val)		{

		final Dist2 RX10_TEMP0 = a.distValue;

		final Dist2 X10_TEMP1 = RX10_TEMP0;

		final Point2 RX10_TEMP1 = new Point2(i, j);

		final Region2 RX10_TEMP2 = X10_TEMP1.dReg;

		final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP1);

		final int RX10_TEMP4 = 0;

		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if(RX10_TEMP5)
			{

			final String RX10_TEMP6 = "Point RX10_TEMP1 not found in the distribution X10_TEMP1.";
throw new RuntimeException(RX10_TEMP6);

			}

		final Dist SX10_TEMP0 = X10_TEMP1.dDist;

		final int RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final int X10_TEMP5 = RX10_TEMP7;
		//async(X10_TEMP5)
			{

			final Point2 RX10_TEMP8 = new Point2(i, j);

			final Dist2 RX10_TEMP9 = a.distValue;

			final Region2 RX10_TEMP10 = RX10_TEMP9.dReg;

			final int RX10_TEMP11 = Program.searchPointInRegion2(RX10_TEMP10, RX10_TEMP8);

			final int RX10_TEMP12 = 0;

			final boolean RX10_TEMP13 = RX10_TEMP11 < RX10_TEMP12;
			if(RX10_TEMP13)
				{

				String RX10_TEMP14 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP14);

				}

			final Dist SX10_TEMP1 = RX10_TEMP9.dDist;

			final int RX10_TEMP15 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP11);

			final int RX10_TEMP17 = 0;

			final boolean RX10_TEMP18 = RX10_TEMP15 != RX10_TEMP17;
			if(RX10_TEMP18)
				{

				String RX10_TEMP16 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP16);

				}

			final DOUBLEArray RX10_TEMP19 = a.contents;

			final double X10_TEMP10 = Program.DOUBLEGetValue(RX10_TEMP19, RX10_TEMP11);

			final double X10_TEMP13 = X10_TEMP10 + val;

			final double X10_TEMP14 = X10_TEMP13;

			final Point2 RX10_TEMP20 = new Point2(i, j);

			final Dist2 RX10_TEMP21 = a.distValue;

			final Region2 RX10_TEMP22 = RX10_TEMP21.dReg;

			final int RX10_TEMP23 = Program.searchPointInRegion2(RX10_TEMP22, RX10_TEMP20);

			final int RX10_TEMP24 = 0;

			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if(RX10_TEMP25)
				{

				String RX10_TEMP26 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP26);

				}

			final Dist SX10_TEMP2 = RX10_TEMP21.dDist;

			final int RX10_TEMP27 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP23);

			final int RX10_TEMP29 = 0;

			final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;
			if(RX10_TEMP30)
				{

				String RX10_TEMP28 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP28);

				}

			final DOUBLEArray RX10_TEMP31 = a.contents;
			Program.DOUBLESetValue(RX10_TEMP31, RX10_TEMP23, X10_TEMP14);
			}
		}
public static double Linpack_myabs ( final Linpack X10_TEMP0, final double d)		{

		final int X10_TEMP1 = 0;

		final boolean X10_TEMP3 = d >= X10_TEMP1;

		final boolean X10_TEMP4 = X10_TEMP3;

		final int X10_TEMP6 = 0;

		double X10_TEMP8 = X10_TEMP6 - d;
		if(X10_TEMP4)
			{

			X10_TEMP8 = d;
			}

		final double X10_TEMP9 = X10_TEMP8;
		return X10_TEMP9;
		}
public static double Linpack_matgen ( final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final doubleRefArray2 b)		{

		int init = 1325;

		double norma = 0.0;

		final Dist2 RX10_TEMP1 = a.distValue;

		final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;

		final Point2[] RX10_TEMP3 = RX10_TEMP2.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3.length; RX10_TEMP0++)
			{

			final Point2 p = RX10_TEMP3[RX10_TEMP0];

			final int X10_TEMP4 = 3125;

			final int X10_TEMP5 = X10_TEMP4 * init;

			final int X10_TEMP6 = 65536;

			final int X10_TEMP8 = X10_TEMP5 % X10_TEMP6;

			init = X10_TEMP8;

			final double X10_TEMP9 = 32768.0;

			final double X10_TEMP11 = init - X10_TEMP9;

			final double X10_TEMP12 = 16384.0;

			double val = X10_TEMP11 / X10_TEMP12;
							{
				Program.Linpack_write(X10_TEMP0, a, p, val);
				}

			final boolean X10_TEMP17 = val > norma;

			double X10_TEMP20 = norma;
			if(X10_TEMP17)
				{

				X10_TEMP20 = val;
				}

			final double X10_TEMP21 = X10_TEMP20;

			norma = X10_TEMP21;
			}
					{

			final Dist2 RX10_TEMP5 = b.distValue;

			final Region2 RX10_TEMP6 = RX10_TEMP5.dReg;

			final Point2[] RX10_TEMP7 = RX10_TEMP6.pointArray;
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP7.length; RX10_TEMP4++)
				{

				final Point2 p = RX10_TEMP7[RX10_TEMP4];

				final Dist2 RX10_TEMP8 = b.distValue;

				final Dist2 X10_TEMP23 = RX10_TEMP8;

				final Region2 RX10_TEMP9 = X10_TEMP23.dReg;

				final int RX10_TEMP10 = Program.searchPointInRegion2(RX10_TEMP9, p);

				final int RX10_TEMP11 = 0;

				final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
				if(RX10_TEMP12)
					{

					final String RX10_TEMP13 = "Point p not found in the distribution X10_TEMP23.";
throw new RuntimeException(RX10_TEMP13);

					}

				final Dist SX10_TEMP0 = X10_TEMP23.dDist;

				final int RX10_TEMP14 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP10);

				final int X10_TEMP24 = RX10_TEMP14;
				//async(X10_TEMP24)
					{

					final double X10_TEMP28 = 0.0;

					final double X10_TEMP29 = X10_TEMP28;

					final Dist2 RX10_TEMP15 = b.distValue;

					final Region2 RX10_TEMP16 = RX10_TEMP15.dReg;

					final int RX10_TEMP17 = Program.searchPointInRegion2(RX10_TEMP16, p);

					final int RX10_TEMP18 = 0;

					final boolean RX10_TEMP19 = RX10_TEMP17 < RX10_TEMP18;
					if(RX10_TEMP19)
						{

						String RX10_TEMP20 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP20);

						}

					final Dist SX10_TEMP1 = RX10_TEMP15.dDist;

					final int RX10_TEMP21 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP17);

					final int RX10_TEMP23 = 0;

					final boolean RX10_TEMP24 = RX10_TEMP21 != RX10_TEMP23;
					if(RX10_TEMP24)
						{

						String RX10_TEMP22 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP22);

						}

					final DOUBLEArray RX10_TEMP25 = b.contents;
					Program.DOUBLESetValue(RX10_TEMP25, RX10_TEMP17, X10_TEMP29);
					}
				}
			}
					{

			final int X10_TEMP33 = 0;

			final int X10_TEMP31 = 1;

			final int X10_TEMP34 = n - X10_TEMP31;

			final int X10_TEMP38 = 0;

			final int X10_TEMP36 = 1;

			final int X10_TEMP39 = n - X10_TEMP36;

			final Region2 X10_TEMP41 = Program.createNewRegion2RR(X10_TEMP33, X10_TEMP34, X10_TEMP38, X10_TEMP39);

			final Point2[] RX10_TEMP28 = X10_TEMP41.pointArray;
			for(int RX10_TEMP26=0; RX10_TEMP26 < RX10_TEMP28.length; RX10_TEMP26++)
				{

				final Point2 RX10_TEMP27 = RX10_TEMP28[RX10_TEMP26];

				final int i = RX10_TEMP27.f0;

				final int j = RX10_TEMP27.f1;
									{

					final Dist2 RX10_TEMP29 = a.distValue;

					final Dist2 X10_TEMP42 = RX10_TEMP29;

					final Point2 RX10_TEMP30 = new Point2(i, j);

					final Region2 RX10_TEMP31 = X10_TEMP42.dReg;

					final int RX10_TEMP32 = Program.searchPointInRegion2(RX10_TEMP31, RX10_TEMP30);

					final int RX10_TEMP33 = 0;

					final boolean RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33;
					if(RX10_TEMP34)
						{

						final String RX10_TEMP35 = "Point RX10_TEMP30 not found in the distribution X10_TEMP42.";
throw new RuntimeException(RX10_TEMP35);

						}

					final Dist SX10_TEMP2 = X10_TEMP42.dDist;

					final int RX10_TEMP36 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP32);

					final int X10_TEMP46 = RX10_TEMP36;
					//async(X10_TEMP46)
						{

						final int X10_TEMP53 = 0;

						final Point2 RX10_TEMP37 = new Point2(i, j);

						final Dist2 RX10_TEMP38 = a.distValue;

						final Region2 RX10_TEMP39 = RX10_TEMP38.dReg;

						final int RX10_TEMP40 = Program.searchPointInRegion2(RX10_TEMP39, RX10_TEMP37);

						final int RX10_TEMP41 = 0;

						final boolean RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41;
						if(RX10_TEMP42)
							{

							String RX10_TEMP43 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP43);

							}

						final Dist SX10_TEMP3 = RX10_TEMP38.dDist;

						final int RX10_TEMP44 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP40);

						final int RX10_TEMP46 = 0;

						final boolean RX10_TEMP47 = RX10_TEMP44 != RX10_TEMP46;
						if(RX10_TEMP47)
							{

							String RX10_TEMP45 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP45);

							}

						final DOUBLEArray RX10_TEMP48 = a.contents;

						final double X10_TEMP54 = Program.DOUBLEGetValue(RX10_TEMP48, RX10_TEMP40);
						Program.Linpack_plusWrite(X10_TEMP0, b, X10_TEMP53, j, X10_TEMP54);
						}
					}
				}
			}
		return norma;
		}
public static int Linpack_dgefa ( final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final intRefArray1 ipvt)		{

		final int X10_TEMP3 = 0;

		final int X10_TEMP4 = X10_TEMP3;
		X10_TEMP0.infodgefa = (X10_TEMP4);

		final int X10_TEMP5 = 1;

		final int nm1 = n - X10_TEMP5;

		final int X10_TEMP7 = 0;

		final boolean X10_TEMP9 = nm1 >= X10_TEMP7;
		if(X10_TEMP9)
			{

			final int X10_TEMP13 = 0;

			final int X10_TEMP11 = 1;

			final int X10_TEMP14 = nm1 - X10_TEMP11;

			Region1 tempr = Program.createNewRegion1R(X10_TEMP13, X10_TEMP14);

			final int X10_TEMP16 = 0;

			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP16);

			final Region1 RX10_TEMP2 = temprDist.dReg;

			final Point1[] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3.length; RX10_TEMP0++)
				{

				final Point1 RX10_TEMP1 = RX10_TEMP3[RX10_TEMP0];

				final int k = RX10_TEMP1.f0;

				final int X10_TEMP24 = n - k;

				final int X10_TEMP25 = 1;

				final int X10_TEMP26 = Program.Linpack_idamax(X10_TEMP0, X10_TEMP24, a, k, k, X10_TEMP25);

				final int l = X10_TEMP26 + k;

				final int X10_TEMP31 = l;

				final Point1 RX10_TEMP4 = new Point1(k);

				final Dist1 RX10_TEMP5 = ipvt.distValue;

				final Region1 RX10_TEMP6 = RX10_TEMP5.dReg;

				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, RX10_TEMP4);

				final int RX10_TEMP8 = 0;

				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if(RX10_TEMP9)
					{

					String RX10_TEMP10 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP10);

					}

				final Dist SX10_TEMP0 = RX10_TEMP5.dDist;

				final int RX10_TEMP11 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP7);

				final int RX10_TEMP13 = 0;

				final boolean RX10_TEMP14 = RX10_TEMP11 != RX10_TEMP13;
				if(RX10_TEMP14)
					{

					String RX10_TEMP12 = "Bad place access for array ipvt";
throw new RuntimeException(RX10_TEMP12);

					}

				final INTArray RX10_TEMP15 = ipvt.contents;
				Program.INTSetValue(RX10_TEMP15, RX10_TEMP7, X10_TEMP31);
									{

					final Dist2 RX10_TEMP16 = a.distValue;

					final Dist2 X10_TEMP32 = RX10_TEMP16;

					int X10_TEMP35 = 1;

					final Point2 RX10_TEMP17 = new Point2(k, X10_TEMP35);

					final Region2 RX10_TEMP18 = X10_TEMP32.dReg;

					final int RX10_TEMP19 = Program.searchPointInRegion2(RX10_TEMP18, RX10_TEMP17);

					final int RX10_TEMP20 = 0;

					final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
					if(RX10_TEMP21)
						{

						final String RX10_TEMP22 = "Point RX10_TEMP17 not found in the distribution X10_TEMP32.";
throw new RuntimeException(RX10_TEMP22);

						}

					final Dist SX10_TEMP1 = X10_TEMP32.dDist;

					final int RX10_TEMP23 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP19);

					final int X10_TEMP37 = RX10_TEMP23;
					//async(X10_TEMP37)
						{

						final int X10_TEMP38 = 1;

						final int kp1 = k + X10_TEMP38;

						final Point2 RX10_TEMP24 = new Point2(k, l);

						final Dist2 RX10_TEMP25 = a.distValue;

						final Region2 RX10_TEMP26 = RX10_TEMP25.dReg;

						final int RX10_TEMP27 = Program.searchPointInRegion2(RX10_TEMP26, RX10_TEMP24);

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

							String RX10_TEMP32 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP32);

							}

						final DOUBLEArray RX10_TEMP35 = a.contents;

						final double X10_TEMP42 = Program.DOUBLEGetValue(RX10_TEMP35, RX10_TEMP27);

						final int X10_TEMP43 = 0;

						final boolean X10_TEMP45 = X10_TEMP42 != X10_TEMP43;
						if(X10_TEMP45)
							{

							final boolean X10_TEMP47 = l != k;
							if(X10_TEMP47)
								{

								final boolean X10_TEMP49 = l != k;
								if(X10_TEMP49)
									{

									final Point2 RX10_TEMP36 = new Point2(k, l);

									final Dist2 RX10_TEMP37 = a.distValue;

									final Region2 RX10_TEMP38 = RX10_TEMP37.dReg;

									final int RX10_TEMP39 = Program.searchPointInRegion2(RX10_TEMP38, RX10_TEMP36);

									final int RX10_TEMP40 = 0;

									final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40;
									if(RX10_TEMP41)
										{

										String RX10_TEMP42 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP42);

										}

									final Dist SX10_TEMP3 = RX10_TEMP37.dDist;

									final int RX10_TEMP43 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP39);

									final int RX10_TEMP45 = 0;

									final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;
									if(RX10_TEMP46)
										{

										String RX10_TEMP44 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP44);

										}

									final DOUBLEArray RX10_TEMP47 = a.contents;

									double t = Program.DOUBLEGetValue(RX10_TEMP47, RX10_TEMP39);

									final Point2 RX10_TEMP48 = new Point2(k, k);

									final Dist2 RX10_TEMP49 = a.distValue;

									final Region2 RX10_TEMP50 = RX10_TEMP49.dReg;

									final int RX10_TEMP51 = Program.searchPointInRegion2(RX10_TEMP50, RX10_TEMP48);

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

										String RX10_TEMP56 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP56);

										}

									final DOUBLEArray RX10_TEMP59 = a.contents;

									final double X10_TEMP59 = Program.DOUBLEGetValue(RX10_TEMP59, RX10_TEMP51);

									final double X10_TEMP60 = X10_TEMP59;

									final Point2 RX10_TEMP60 = new Point2(k, l);

									final Dist2 RX10_TEMP61 = a.distValue;

									final Region2 RX10_TEMP62 = RX10_TEMP61.dReg;

									final int RX10_TEMP63 = Program.searchPointInRegion2(RX10_TEMP62, RX10_TEMP60);

									final int RX10_TEMP64 = 0;

									final boolean RX10_TEMP65 = RX10_TEMP63 < RX10_TEMP64;
									if(RX10_TEMP65)
										{

										String RX10_TEMP66 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP66);

										}

									final Dist SX10_TEMP5 = RX10_TEMP61.dDist;

									final int RX10_TEMP67 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP63);

									final int RX10_TEMP69 = 0;

									final boolean RX10_TEMP70 = RX10_TEMP67 != RX10_TEMP69;
									if(RX10_TEMP70)
										{

										String RX10_TEMP68 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP68);

										}

									final DOUBLEArray RX10_TEMP71 = a.contents;
									Program.DOUBLESetValue(RX10_TEMP71, RX10_TEMP63, X10_TEMP60);

									final double X10_TEMP65 = t;

									final Point2 RX10_TEMP72 = new Point2(k, k);

									final Dist2 RX10_TEMP73 = a.distValue;

									final Region2 RX10_TEMP74 = RX10_TEMP73.dReg;

									final int RX10_TEMP75 = Program.searchPointInRegion2(RX10_TEMP74, RX10_TEMP72);

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

										String RX10_TEMP80 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP80);

										}

									final DOUBLEArray RX10_TEMP83 = a.contents;
									Program.DOUBLESetValue(RX10_TEMP83, RX10_TEMP75, X10_TEMP65);
									}
								}

							final double X10_TEMP66 = 1.0;

							final int X10_TEMP67 = 0;

							final double X10_TEMP70 = X10_TEMP67 - X10_TEMP66;

							final Point2 RX10_TEMP84 = new Point2(k, k);

							final Dist2 RX10_TEMP85 = a.distValue;

							final Region2 RX10_TEMP86 = RX10_TEMP85.dReg;

							final int RX10_TEMP87 = Program.searchPointInRegion2(RX10_TEMP86, RX10_TEMP84);

							final int RX10_TEMP88 = 0;

							final boolean RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88;
							if(RX10_TEMP89)
								{

								String RX10_TEMP90 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP90);

								}

							final Dist SX10_TEMP7 = RX10_TEMP85.dDist;

							final int RX10_TEMP91 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP87);

							final int RX10_TEMP93 = 0;

							final boolean RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93;
							if(RX10_TEMP94)
								{

								String RX10_TEMP92 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP92);

								}

							final DOUBLEArray RX10_TEMP95 = a.contents;

							final double X10_TEMP71 = Program.DOUBLEGetValue(RX10_TEMP95, RX10_TEMP87);

							final double tx = X10_TEMP70 / X10_TEMP71;

							final int X10_TEMP74 = kp1;

							final int X10_TEMP81 = n - X10_TEMP74;

							final int X10_TEMP82 = 1;
							Program.Linpack_dscal(X10_TEMP0, X10_TEMP81, tx, a, k, kp1, X10_TEMP82);
															{

								final int X10_TEMP84 = 1;

								final int X10_TEMP86 = n - X10_TEMP84;

								Region1 temprkp1 = Program.createNewRegion1R(kp1, X10_TEMP86);

								final int X10_TEMP88 = 0;

								Dist1 temprkp1Dist = Program.getPlaceDist1(temprkp1, X10_TEMP88);

								final Region1 RX10_TEMP98 = temprkp1Dist.dReg;

								final Point1[] RX10_TEMP99 = RX10_TEMP98.pointArray;
								for(int RX10_TEMP96=0; RX10_TEMP96 < RX10_TEMP99.length; RX10_TEMP96++)
									{

									final Point1 RX10_TEMP97 = RX10_TEMP99[RX10_TEMP96];

									final int j = RX10_TEMP97.f0;

									final Dist2 RX10_TEMP100 = a.distValue;

									final Dist2 X10_TEMP91 = RX10_TEMP100;

									final Point2 RX10_TEMP101 = new Point2(j, l);

									final Region2 RX10_TEMP102 = X10_TEMP91.dReg;

									final int RX10_TEMP103 = Program.searchPointInRegion2(RX10_TEMP102, RX10_TEMP101);

									final int RX10_TEMP104 = 0;

									final boolean RX10_TEMP105 = RX10_TEMP103 < RX10_TEMP104;
									if(RX10_TEMP105)
										{

										final String RX10_TEMP106 = "Point RX10_TEMP101 not found in the distribution X10_TEMP91.";
throw new RuntimeException(RX10_TEMP106);

										}

									final Dist SX10_TEMP8 = X10_TEMP91.dDist;

									final int RX10_TEMP107 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP103);

									final int X10_TEMP95 = RX10_TEMP107;
									//async(X10_TEMP95)
										{

										final Point2 RX10_TEMP108 = new Point2(j, l);

										final Dist2 RX10_TEMP109 = a.distValue;

										final Region2 RX10_TEMP110 = RX10_TEMP109.dReg;

										final int RX10_TEMP111 = Program.searchPointInRegion2(RX10_TEMP110, RX10_TEMP108);

										final int RX10_TEMP112 = 0;

										final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112;
										if(RX10_TEMP113)
											{

											String RX10_TEMP114 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP114);

											}

										final Dist SX10_TEMP9 = RX10_TEMP109.dDist;

										final int RX10_TEMP115 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP111);

										final int RX10_TEMP117 = 0;

										final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117;
										if(RX10_TEMP118)
											{

											String RX10_TEMP116 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP116);

											}

										final DOUBLEArray RX10_TEMP119 = a.contents;

										double t = Program.DOUBLEGetValue(RX10_TEMP119, RX10_TEMP111);

										final boolean X10_TEMP100 = l != k;
										if(X10_TEMP100)
											{

											final Point2 RX10_TEMP120 = new Point2(j, k);

											final Dist2 RX10_TEMP121 = a.distValue;

											final Region2 RX10_TEMP122 = RX10_TEMP121.dReg;

											final int RX10_TEMP123 = Program.searchPointInRegion2(RX10_TEMP122, RX10_TEMP120);

											final int RX10_TEMP124 = 0;

											final boolean RX10_TEMP125 = RX10_TEMP123 < RX10_TEMP124;
											if(RX10_TEMP125)
												{

												String RX10_TEMP126 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP126);

												}

											final Dist SX10_TEMP10 = RX10_TEMP121.dDist;

											final int RX10_TEMP127 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP123);

											final int RX10_TEMP129 = 0;

											final boolean RX10_TEMP130 = RX10_TEMP127 != RX10_TEMP129;
											if(RX10_TEMP130)
												{

												String RX10_TEMP128 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP128);

												}

											final DOUBLEArray RX10_TEMP131 = a.contents;

											final double X10_TEMP107 = Program.DOUBLEGetValue(RX10_TEMP131, RX10_TEMP123);

											final double X10_TEMP108 = X10_TEMP107;

											final Point2 RX10_TEMP132 = new Point2(j, l);

											final Dist2 RX10_TEMP133 = a.distValue;

											final Region2 RX10_TEMP134 = RX10_TEMP133.dReg;

											final int RX10_TEMP135 = Program.searchPointInRegion2(RX10_TEMP134, RX10_TEMP132);

											final int RX10_TEMP136 = 0;

											final boolean RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136;
											if(RX10_TEMP137)
												{

												String RX10_TEMP138 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP138);

												}

											final Dist SX10_TEMP11 = RX10_TEMP133.dDist;

											final int RX10_TEMP139 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP135);

											final int RX10_TEMP141 = 0;

											final boolean RX10_TEMP142 = RX10_TEMP139 != RX10_TEMP141;
											if(RX10_TEMP142)
												{

												String RX10_TEMP140 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP140);

												}

											final DOUBLEArray RX10_TEMP143 = a.contents;
											Program.DOUBLESetValue(RX10_TEMP143, RX10_TEMP135, X10_TEMP108);

											final double X10_TEMP113 = t;

											final Point2 RX10_TEMP144 = new Point2(j, k);

											final Dist2 RX10_TEMP145 = a.distValue;

											final Region2 RX10_TEMP146 = RX10_TEMP145.dReg;

											final int RX10_TEMP147 = Program.searchPointInRegion2(RX10_TEMP146, RX10_TEMP144);

											final int RX10_TEMP148 = 0;

											final boolean RX10_TEMP149 = RX10_TEMP147 < RX10_TEMP148;
											if(RX10_TEMP149)
												{

												String RX10_TEMP150 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP150);

												}

											final Dist SX10_TEMP12 = RX10_TEMP145.dDist;

											final int RX10_TEMP151 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP147);

											final int RX10_TEMP153 = 0;

											final boolean RX10_TEMP154 = RX10_TEMP151 != RX10_TEMP153;
											if(RX10_TEMP154)
												{

												String RX10_TEMP152 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP152);

												}

											final DOUBLEArray RX10_TEMP155 = a.contents;
											Program.DOUBLESetValue(RX10_TEMP155, RX10_TEMP147, X10_TEMP113);
											}

										final int X10_TEMP115 = kp1;

										final int X10_TEMP126 = n - X10_TEMP115;

										final int X10_TEMP127 = 1;

										final int X10_TEMP128 = 1;
										Program.Linpack_daxpy(X10_TEMP0, X10_TEMP126, t, a, k, kp1, X10_TEMP127, a, j, kp1, X10_TEMP128);
										}
									}
								}
							}
						else
							{

							final int X10_TEMP131 = k;
							X10_TEMP0.infodgefa = (X10_TEMP131);
							}
 						}
					}
				}
			}

		final int X10_TEMP132 = 1;

		final int X10_TEMP134 = n - X10_TEMP132;

		final int X10_TEMP135 = 1;

		final int X10_TEMP138 = n - X10_TEMP135;

		final int X10_TEMP139 = X10_TEMP138;

		final Point1 RX10_TEMP156 = new Point1(X10_TEMP134);

		final Dist1 RX10_TEMP157 = ipvt.distValue;

		final Region1 RX10_TEMP158 = RX10_TEMP157.dReg;

		final int RX10_TEMP159 = Program.searchPointInRegion1(RX10_TEMP158, RX10_TEMP156);

		final int RX10_TEMP160 = 0;

		final boolean RX10_TEMP161 = RX10_TEMP159 < RX10_TEMP160;
		if(RX10_TEMP161)
			{

			String RX10_TEMP162 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP162);

			}

		final Dist SX10_TEMP13 = RX10_TEMP157.dDist;

		final int RX10_TEMP163 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP159);

		final int RX10_TEMP165 = 0;

		final boolean RX10_TEMP166 = RX10_TEMP163 != RX10_TEMP165;
		if(RX10_TEMP166)
			{

			String RX10_TEMP164 = "Bad place access for array ipvt";
throw new RuntimeException(RX10_TEMP164);

			}

		final INTArray RX10_TEMP167 = ipvt.contents;
		Program.INTSetValue(RX10_TEMP167, RX10_TEMP159, X10_TEMP139);

		final int X10_TEMP141 = 1;

		final int X10_TEMP145 = n - X10_TEMP141;

		final int X10_TEMP143 = 1;

		final int X10_TEMP146 = n - X10_TEMP143;

		double val = Program.Linpack_read(X10_TEMP0, a, X10_TEMP145, X10_TEMP146);

		final int X10_TEMP148 = 0;

		final boolean X10_TEMP150 = val == X10_TEMP148;
		if(X10_TEMP150)
			{

			final int X10_TEMP151 = 1;

			final int X10_TEMP154 = n - X10_TEMP151;

			final int X10_TEMP155 = X10_TEMP154;
			X10_TEMP0.info = (X10_TEMP155);
			}

		final int X10_TEMP157 = X10_TEMP0.infodgefa;
		return X10_TEMP157;
		}
public static void Linpack_dgesl ( final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final intRefArray1 ipvt, final doubleRefArray2 b, final int job)		{

		final int X10_TEMP1 = 1;

		final int nm1 = n - X10_TEMP1;

		final int X10_TEMP3 = 0;

		final boolean X10_TEMP5 = job == X10_TEMP3;
		if(X10_TEMP5)
			{

			final int X10_TEMP6 = 1;

			final boolean X10_TEMP8 = nm1 >= X10_TEMP6;
			if(X10_TEMP8)
				{

				final int X10_TEMP12 = 0;

				final int X10_TEMP10 = 1;

				final int X10_TEMP13 = nm1 - X10_TEMP10;

				Region1 tempr = Program.createNewRegion1R(X10_TEMP12, X10_TEMP13);

				final int X10_TEMP15 = 0;

				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP15);

				final Region1 RX10_TEMP2 = temprDist.dReg;

				final Point1[] RX10_TEMP3 = RX10_TEMP2.pointArray;
				for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3.length; RX10_TEMP0++)
					{

					final Point1 RX10_TEMP1 = RX10_TEMP3[RX10_TEMP0];

					final int k = RX10_TEMP1.f0;

					final Point1 RX10_TEMP4 = new Point1(k);

					final Dist1 RX10_TEMP5 = ipvt.distValue;

					final Region1 RX10_TEMP6 = RX10_TEMP5.dReg;

					final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, RX10_TEMP4);

					final int RX10_TEMP8 = 0;

					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if(RX10_TEMP9)
						{

						String RX10_TEMP10 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP10);

						}

					final Dist SX10_TEMP0 = RX10_TEMP5.dDist;

					final int RX10_TEMP11 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP7);

					final int RX10_TEMP13 = 0;

					final boolean RX10_TEMP14 = RX10_TEMP11 != RX10_TEMP13;
					if(RX10_TEMP14)
						{

						String RX10_TEMP12 = "Bad place access for array ipvt";
throw new RuntimeException(RX10_TEMP12);

						}

					final INTArray RX10_TEMP15 = ipvt.contents;

					final int l = Program.INTGetValue(RX10_TEMP15, RX10_TEMP7);

					final int X10_TEMP22 = 0;

					final Point2 RX10_TEMP16 = new Point2(X10_TEMP22, l);

					final Dist2 RX10_TEMP17 = b.distValue;

					final Region2 RX10_TEMP18 = RX10_TEMP17.dReg;

					final int RX10_TEMP19 = Program.searchPointInRegion2(RX10_TEMP18, RX10_TEMP16);

					final int RX10_TEMP20 = 0;

					final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
					if(RX10_TEMP21)
						{

						String RX10_TEMP22 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP22);

						}

					final Dist SX10_TEMP1 = RX10_TEMP17.dDist;

					final int RX10_TEMP23 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP19);

					final int RX10_TEMP25 = 0;

					final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
					if(RX10_TEMP26)
						{

						String RX10_TEMP24 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP24);

						}

					final DOUBLEArray RX10_TEMP27 = b.contents;

					double t = Program.DOUBLEGetValue(RX10_TEMP27, RX10_TEMP19);

					final boolean X10_TEMP25 = l != k;
					if(X10_TEMP25)
						{

						final int X10_TEMP28 = 0;

						final int X10_TEMP31 = 0;

						final Point2 RX10_TEMP28 = new Point2(X10_TEMP31, k);

						final Dist2 RX10_TEMP29 = b.distValue;

						final Region2 RX10_TEMP30 = RX10_TEMP29.dReg;

						final int RX10_TEMP31 = Program.searchPointInRegion2(RX10_TEMP30, RX10_TEMP28);

						final int RX10_TEMP32 = 0;

						final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
						if(RX10_TEMP33)
							{

							String RX10_TEMP34 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP34);

							}

						final Dist SX10_TEMP2 = RX10_TEMP29.dDist;

						final int RX10_TEMP35 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP31);

						final int RX10_TEMP37 = 0;

						final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
						if(RX10_TEMP38)
							{

							String RX10_TEMP36 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP36);

							}

						final DOUBLEArray RX10_TEMP39 = b.contents;

						final double X10_TEMP34 = Program.DOUBLEGetValue(RX10_TEMP39, RX10_TEMP31);

						final double X10_TEMP35 = X10_TEMP34;

						final Point2 RX10_TEMP40 = new Point2(X10_TEMP28, l);

						final Dist2 RX10_TEMP41 = b.distValue;

						final Region2 RX10_TEMP42 = RX10_TEMP41.dReg;

						final int RX10_TEMP43 = Program.searchPointInRegion2(RX10_TEMP42, RX10_TEMP40);

						final int RX10_TEMP44 = 0;

						final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
						if(RX10_TEMP45)
							{

							String RX10_TEMP46 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP46);

							}

						final Dist SX10_TEMP3 = RX10_TEMP41.dDist;

						final int RX10_TEMP47 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP43);

						final int RX10_TEMP49 = 0;

						final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
						if(RX10_TEMP50)
							{

							String RX10_TEMP48 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP48);

							}

						final DOUBLEArray RX10_TEMP51 = b.contents;
						Program.DOUBLESetValue(RX10_TEMP51, RX10_TEMP43, X10_TEMP35);

						final int X10_TEMP38 = 0;

						final double X10_TEMP41 = t;

						final Point2 RX10_TEMP52 = new Point2(X10_TEMP38, k);

						final Dist2 RX10_TEMP53 = b.distValue;

						final Region2 RX10_TEMP54 = RX10_TEMP53.dReg;

						final int RX10_TEMP55 = Program.searchPointInRegion2(RX10_TEMP54, RX10_TEMP52);

						final int RX10_TEMP56 = 0;

						final boolean RX10_TEMP57 = RX10_TEMP55 < RX10_TEMP56;
						if(RX10_TEMP57)
							{

							String RX10_TEMP58 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP58);

							}

						final Dist SX10_TEMP4 = RX10_TEMP53.dDist;

						final int RX10_TEMP59 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP55);

						final int RX10_TEMP61 = 0;

						final boolean RX10_TEMP62 = RX10_TEMP59 != RX10_TEMP61;
						if(RX10_TEMP62)
							{

							String RX10_TEMP60 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP60);

							}

						final DOUBLEArray RX10_TEMP63 = b.contents;
						Program.DOUBLESetValue(RX10_TEMP63, RX10_TEMP55, X10_TEMP41);
						}

					final int X10_TEMP42 = 1;

					final int kp1 = k + X10_TEMP42;

					final int X10_TEMP45 = kp1;

					final int X10_TEMP56 = n - X10_TEMP45;

					final int X10_TEMP57 = 1;

					final int X10_TEMP58 = 0;

					final int X10_TEMP59 = 1;
					Program.Linpack_daxpy(X10_TEMP0, X10_TEMP56, t, a, k, kp1, X10_TEMP57, b, X10_TEMP58, kp1, X10_TEMP59);
					}
				}

			final int X10_TEMP63 = 0;

			final int X10_TEMP61 = 1;

			final int X10_TEMP64 = n - X10_TEMP61;

			Region1 tempr = Program.createNewRegion1R(X10_TEMP63, X10_TEMP64);

			final int X10_TEMP66 = 0;

			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP66);

			final Region1 RX10_TEMP66 = temprDist.dReg;

			final Point1[] RX10_TEMP67 = RX10_TEMP66.pointArray;
			for(int RX10_TEMP64=0; RX10_TEMP64 < RX10_TEMP67.length; RX10_TEMP64++)
				{

				final Point1 RX10_TEMP65 = RX10_TEMP67[RX10_TEMP64];

				final int kb = RX10_TEMP65.f0;

				final int X10_TEMP69 = 1;

				final int X10_TEMP71 = kb + X10_TEMP69;

				final int k = n - X10_TEMP71;

				final int X10_TEMP75 = 0;

				final int X10_TEMP78 = 0;

				final Point2 RX10_TEMP68 = new Point2(X10_TEMP78, k);

				final Dist2 RX10_TEMP69 = b.distValue;

				final Region2 RX10_TEMP70 = RX10_TEMP69.dReg;

				final int RX10_TEMP71 = Program.searchPointInRegion2(RX10_TEMP70, RX10_TEMP68);

				final int RX10_TEMP72 = 0;

				final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72;
				if(RX10_TEMP73)
					{

					String RX10_TEMP74 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP74);

					}

				final Dist SX10_TEMP5 = RX10_TEMP69.dDist;

				final int RX10_TEMP75 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP71);

				final int RX10_TEMP77 = 0;

				final boolean RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77;
				if(RX10_TEMP78)
					{

					String RX10_TEMP76 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP76);

					}

				final DOUBLEArray RX10_TEMP79 = b.contents;

				final double X10_TEMP82 = Program.DOUBLEGetValue(RX10_TEMP79, RX10_TEMP71);

				final double X10_TEMP83 = Program.Linpack_read(X10_TEMP0, a, k, k);

				final double X10_TEMP86 = X10_TEMP82 / X10_TEMP83;

				final double X10_TEMP87 = X10_TEMP86;

				final Point2 RX10_TEMP80 = new Point2(X10_TEMP75, k);

				final Dist2 RX10_TEMP81 = b.distValue;

				final Region2 RX10_TEMP82 = RX10_TEMP81.dReg;

				final int RX10_TEMP83 = Program.searchPointInRegion2(RX10_TEMP82, RX10_TEMP80);

				final int RX10_TEMP84 = 0;

				final boolean RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84;
				if(RX10_TEMP85)
					{

					String RX10_TEMP86 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP86);

					}

				final Dist SX10_TEMP6 = RX10_TEMP81.dDist;

				final int RX10_TEMP87 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP83);

				final int RX10_TEMP89 = 0;

				final boolean RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89;
				if(RX10_TEMP90)
					{

					String RX10_TEMP88 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP88);

					}

				final DOUBLEArray RX10_TEMP91 = b.contents;
				Program.DOUBLESetValue(RX10_TEMP91, RX10_TEMP83, X10_TEMP87);

				final int X10_TEMP90 = 0;

				final Point2 RX10_TEMP92 = new Point2(X10_TEMP90, k);

				final Dist2 RX10_TEMP93 = b.distValue;

				final Region2 RX10_TEMP94 = RX10_TEMP93.dReg;

				final int RX10_TEMP95 = Program.searchPointInRegion2(RX10_TEMP94, RX10_TEMP92);

				final int RX10_TEMP96 = 0;

				final boolean RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96;
				if(RX10_TEMP97)
					{

					String RX10_TEMP98 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP98);

					}

				final Dist SX10_TEMP7 = RX10_TEMP93.dDist;

				final int RX10_TEMP99 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP95);

				final int RX10_TEMP101 = 0;

				final boolean RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101;
				if(RX10_TEMP102)
					{

					String RX10_TEMP100 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP100);

					}

				final DOUBLEArray RX10_TEMP103 = b.contents;

				final double X10_TEMP91 = Program.DOUBLEGetValue(RX10_TEMP103, RX10_TEMP95);

				final int X10_TEMP92 = 0;

				double t = X10_TEMP92 - X10_TEMP91;

				final int X10_TEMP104 = 0;

				final int X10_TEMP105 = 1;

				final int X10_TEMP106 = 0;

				final int X10_TEMP107 = 0;

				final int X10_TEMP108 = 1;
				Program.Linpack_daxpy(X10_TEMP0, k, t, a, k, X10_TEMP104, X10_TEMP105, b, X10_TEMP106, X10_TEMP107, X10_TEMP108);
				}
			}
		else
			{

			final int X10_TEMP112 = 0;

			final int X10_TEMP110 = 1;

			final int X10_TEMP113 = n - X10_TEMP110;

			Region1 tempr = Program.createNewRegion1R(X10_TEMP112, X10_TEMP113);

			final int X10_TEMP115 = 0;

			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP115);

			final Region1 RX10_TEMP106 = temprDist.dReg;

			final Point1[] RX10_TEMP107 = RX10_TEMP106.pointArray;
			for(int RX10_TEMP104=0; RX10_TEMP104 < RX10_TEMP107.length; RX10_TEMP104++)
				{

				final Point1 RX10_TEMP105 = RX10_TEMP107[RX10_TEMP104];

				final int k = RX10_TEMP105.f0;

				final int X10_TEMP127 = 0;

				final int X10_TEMP128 = 1;

				final int X10_TEMP129 = 0;

				final int X10_TEMP130 = 0;

				final int X10_TEMP131 = 1;

				double t = Program.Linpack_ddot(X10_TEMP0, k, a, k, X10_TEMP127, X10_TEMP128, b, X10_TEMP129, X10_TEMP130, X10_TEMP131);

				final int X10_TEMP135 = 0;

				final int X10_TEMP138 = 0;

				final Point2 RX10_TEMP108 = new Point2(X10_TEMP138, k);

				final Dist2 RX10_TEMP109 = b.distValue;

				final Region2 RX10_TEMP110 = RX10_TEMP109.dReg;

				final int RX10_TEMP111 = Program.searchPointInRegion2(RX10_TEMP110, RX10_TEMP108);

				final int RX10_TEMP112 = 0;

				final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112;
				if(RX10_TEMP113)
					{

					String RX10_TEMP114 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP114);

					}

				final Dist SX10_TEMP8 = RX10_TEMP109.dDist;

				final int RX10_TEMP115 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP111);

				final int RX10_TEMP117 = 0;

				final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117;
				if(RX10_TEMP118)
					{

					String RX10_TEMP116 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP116);

					}

				final DOUBLEArray RX10_TEMP119 = b.contents;

				final double X10_TEMP139 = Program.DOUBLEGetValue(RX10_TEMP119, RX10_TEMP111);

				final double X10_TEMP141 = X10_TEMP139 - t;

				final Point2 RX10_TEMP120 = new Point2(k, k);

				final Dist2 RX10_TEMP121 = a.distValue;

				final Region2 RX10_TEMP122 = RX10_TEMP121.dReg;

				final int RX10_TEMP123 = Program.searchPointInRegion2(RX10_TEMP122, RX10_TEMP120);

				final int RX10_TEMP124 = 0;

				final boolean RX10_TEMP125 = RX10_TEMP123 < RX10_TEMP124;
				if(RX10_TEMP125)
					{

					String RX10_TEMP126 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP126);

					}

				final Dist SX10_TEMP9 = RX10_TEMP121.dDist;

				final int RX10_TEMP127 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP123);

				final int RX10_TEMP129 = 0;

				final boolean RX10_TEMP130 = RX10_TEMP127 != RX10_TEMP129;
				if(RX10_TEMP130)
					{

					String RX10_TEMP128 = "Bad place access for array a";
throw new RuntimeException(RX10_TEMP128);

					}

				final DOUBLEArray RX10_TEMP131 = a.contents;

				final double X10_TEMP144 = Program.DOUBLEGetValue(RX10_TEMP131, RX10_TEMP123);

				final double X10_TEMP147 = X10_TEMP141 / X10_TEMP144;

				final double X10_TEMP148 = X10_TEMP147;

				final Point2 RX10_TEMP132 = new Point2(X10_TEMP135, k);

				final Dist2 RX10_TEMP133 = b.distValue;

				final Region2 RX10_TEMP134 = RX10_TEMP133.dReg;

				final int RX10_TEMP135 = Program.searchPointInRegion2(RX10_TEMP134, RX10_TEMP132);

				final int RX10_TEMP136 = 0;

				final boolean RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136;
				if(RX10_TEMP137)
					{

					String RX10_TEMP138 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP138);

					}

				final Dist SX10_TEMP10 = RX10_TEMP133.dDist;

				final int RX10_TEMP139 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP135);

				final int RX10_TEMP141 = 0;

				final boolean RX10_TEMP142 = RX10_TEMP139 != RX10_TEMP141;
				if(RX10_TEMP142)
					{

					String RX10_TEMP140 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP140);

					}

				final DOUBLEArray RX10_TEMP143 = b.contents;
				Program.DOUBLESetValue(RX10_TEMP143, RX10_TEMP135, X10_TEMP148);
				}

			final int X10_TEMP149 = 1;

			final boolean X10_TEMP151 = nm1 >= X10_TEMP149;
			if(X10_TEMP151)
				{

				final int X10_TEMP155 = 1;

				final int X10_TEMP153 = 1;

				final int X10_TEMP156 = nm1 - X10_TEMP153;

				Region1 temprnm1 = Program.createNewRegion1R(X10_TEMP155, X10_TEMP156);

				final int X10_TEMP158 = 0;

				Dist1 temprnm1Dist = Program.getPlaceDist1(temprnm1, X10_TEMP158);

				final Region1 RX10_TEMP146 = temprnm1Dist.dReg;

				final Point1[] RX10_TEMP147 = RX10_TEMP146.pointArray;
				for(int RX10_TEMP144=0; RX10_TEMP144 < RX10_TEMP147.length; RX10_TEMP144++)
					{

					final Point1 RX10_TEMP145 = RX10_TEMP147[RX10_TEMP144];

					final int kb = RX10_TEMP145.f0;

					final int X10_TEMP161 = 1;

					final int X10_TEMP163 = kb + X10_TEMP161;

					final int k = n - X10_TEMP163;

					final int X10_TEMP165 = 1;

					final int kp1 = k + X10_TEMP165;

					final int X10_TEMP169 = 0;

					final int X10_TEMP172 = 0;

					final Point2 RX10_TEMP148 = new Point2(X10_TEMP172, k);

					final Dist2 RX10_TEMP149 = b.distValue;

					final Region2 RX10_TEMP150 = RX10_TEMP149.dReg;

					final int RX10_TEMP151 = Program.searchPointInRegion2(RX10_TEMP150, RX10_TEMP148);

					final int RX10_TEMP152 = 0;

					final boolean RX10_TEMP153 = RX10_TEMP151 < RX10_TEMP152;
					if(RX10_TEMP153)
						{

						String RX10_TEMP154 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP154);

						}

					final Dist SX10_TEMP11 = RX10_TEMP149.dDist;

					final int RX10_TEMP155 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP151);

					final int RX10_TEMP157 = 0;

					final boolean RX10_TEMP158 = RX10_TEMP155 != RX10_TEMP157;
					if(RX10_TEMP158)
						{

						String RX10_TEMP156 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP156);

						}

					final DOUBLEArray RX10_TEMP159 = b.contents;

					final double X10_TEMP188 = Program.DOUBLEGetValue(RX10_TEMP159, RX10_TEMP151);

					final int X10_TEMP174 = kp1;

					final int X10_TEMP184 = n - X10_TEMP174;

					final int X10_TEMP185 = 1;

					final int X10_TEMP186 = 0;

					final int X10_TEMP187 = 1;

					final double X10_TEMP189 = Program.Linpack_ddot(X10_TEMP0, X10_TEMP184, a, k, kp1, X10_TEMP185, b, X10_TEMP186, kp1, X10_TEMP187);

					final double X10_TEMP192 = X10_TEMP188 + X10_TEMP189;

					final double X10_TEMP193 = X10_TEMP192;

					final Point2 RX10_TEMP160 = new Point2(X10_TEMP169, k);

					final Dist2 RX10_TEMP161 = b.distValue;

					final Region2 RX10_TEMP162 = RX10_TEMP161.dReg;

					final int RX10_TEMP163 = Program.searchPointInRegion2(RX10_TEMP162, RX10_TEMP160);

					final int RX10_TEMP164 = 0;

					final boolean RX10_TEMP165 = RX10_TEMP163 < RX10_TEMP164;
					if(RX10_TEMP165)
						{

						String RX10_TEMP166 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP166);

						}

					final Dist SX10_TEMP12 = RX10_TEMP161.dDist;

					final int RX10_TEMP167 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP163);

					final int RX10_TEMP169 = 0;

					final boolean RX10_TEMP170 = RX10_TEMP167 != RX10_TEMP169;
					if(RX10_TEMP170)
						{

						String RX10_TEMP168 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP168);

						}

					final DOUBLEArray RX10_TEMP171 = b.contents;
					Program.DOUBLESetValue(RX10_TEMP171, RX10_TEMP163, X10_TEMP193);

					final Point1 RX10_TEMP172 = new Point1(k);

					final Dist1 RX10_TEMP173 = ipvt.distValue;

					final Region1 RX10_TEMP174 = RX10_TEMP173.dReg;

					final int RX10_TEMP175 = Program.searchPointInRegion1(RX10_TEMP174, RX10_TEMP172);

					final int RX10_TEMP176 = 0;

					final boolean RX10_TEMP177 = RX10_TEMP175 < RX10_TEMP176;
					if(RX10_TEMP177)
						{

						String RX10_TEMP178 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP178);

						}

					final Dist SX10_TEMP13 = RX10_TEMP173.dDist;

					final int RX10_TEMP179 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP175);

					final int RX10_TEMP181 = 0;

					final boolean RX10_TEMP182 = RX10_TEMP179 != RX10_TEMP181;
					if(RX10_TEMP182)
						{

						String RX10_TEMP180 = "Bad place access for array ipvt";
throw new RuntimeException(RX10_TEMP180);

						}

					final INTArray RX10_TEMP183 = ipvt.contents;

					final int l = Program.INTGetValue(RX10_TEMP183, RX10_TEMP175);

					final boolean X10_TEMP197 = l != k;
					if(X10_TEMP197)
						{

						final int X10_TEMP200 = 0;

						final Point2 RX10_TEMP184 = new Point2(X10_TEMP200, l);

						final Dist2 RX10_TEMP185 = b.distValue;

						final Region2 RX10_TEMP186 = RX10_TEMP185.dReg;

						final int RX10_TEMP187 = Program.searchPointInRegion2(RX10_TEMP186, RX10_TEMP184);

						final int RX10_TEMP188 = 0;

						final boolean RX10_TEMP189 = RX10_TEMP187 < RX10_TEMP188;
						if(RX10_TEMP189)
							{

							String RX10_TEMP190 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP190);

							}

						final Dist SX10_TEMP14 = RX10_TEMP185.dDist;

						final int RX10_TEMP191 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP187);

						final int RX10_TEMP193 = 0;

						final boolean RX10_TEMP194 = RX10_TEMP191 != RX10_TEMP193;
						if(RX10_TEMP194)
							{

							String RX10_TEMP192 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP192);

							}

						final DOUBLEArray RX10_TEMP195 = b.contents;

						double t = Program.DOUBLEGetValue(RX10_TEMP195, RX10_TEMP187);

						final int X10_TEMP204 = 0;

						final int X10_TEMP207 = 0;

						final Point2 RX10_TEMP196 = new Point2(X10_TEMP207, k);

						final Dist2 RX10_TEMP197 = b.distValue;

						final Region2 RX10_TEMP198 = RX10_TEMP197.dReg;

						final int RX10_TEMP199 = Program.searchPointInRegion2(RX10_TEMP198, RX10_TEMP196);

						final int RX10_TEMP200 = 0;

						final boolean RX10_TEMP201 = RX10_TEMP199 < RX10_TEMP200;
						if(RX10_TEMP201)
							{

							String RX10_TEMP202 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP202);

							}

						final Dist SX10_TEMP15 = RX10_TEMP197.dDist;

						final int RX10_TEMP203 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP199);

						final int RX10_TEMP205 = 0;

						final boolean RX10_TEMP206 = RX10_TEMP203 != RX10_TEMP205;
						if(RX10_TEMP206)
							{

							String RX10_TEMP204 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP204);

							}

						final DOUBLEArray RX10_TEMP207 = b.contents;

						final double X10_TEMP210 = Program.DOUBLEGetValue(RX10_TEMP207, RX10_TEMP199);

						final double X10_TEMP211 = X10_TEMP210;

						final Point2 RX10_TEMP208 = new Point2(X10_TEMP204, l);

						final Dist2 RX10_TEMP209 = b.distValue;

						final Region2 RX10_TEMP210 = RX10_TEMP209.dReg;

						final int RX10_TEMP211 = Program.searchPointInRegion2(RX10_TEMP210, RX10_TEMP208);

						final int RX10_TEMP212 = 0;

						final boolean RX10_TEMP213 = RX10_TEMP211 < RX10_TEMP212;
						if(RX10_TEMP213)
							{

							String RX10_TEMP214 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP214);

							}

						final Dist SX10_TEMP16 = RX10_TEMP209.dDist;

						final int RX10_TEMP215 = Program.getPlaceFromDist(SX10_TEMP16, RX10_TEMP211);

						final int RX10_TEMP217 = 0;

						final boolean RX10_TEMP218 = RX10_TEMP215 != RX10_TEMP217;
						if(RX10_TEMP218)
							{

							String RX10_TEMP216 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP216);

							}

						final DOUBLEArray RX10_TEMP219 = b.contents;
						Program.DOUBLESetValue(RX10_TEMP219, RX10_TEMP211, X10_TEMP211);

						final int X10_TEMP214 = 0;

						final double X10_TEMP217 = t;

						final Point2 RX10_TEMP220 = new Point2(X10_TEMP214, k);

						final Dist2 RX10_TEMP221 = b.distValue;

						final Region2 RX10_TEMP222 = RX10_TEMP221.dReg;

						final int RX10_TEMP223 = Program.searchPointInRegion2(RX10_TEMP222, RX10_TEMP220);

						final int RX10_TEMP224 = 0;

						final boolean RX10_TEMP225 = RX10_TEMP223 < RX10_TEMP224;
						if(RX10_TEMP225)
							{

							String RX10_TEMP226 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP226);

							}

						final Dist SX10_TEMP17 = RX10_TEMP221.dDist;

						final int RX10_TEMP227 = Program.getPlaceFromDist(SX10_TEMP17, RX10_TEMP223);

						final int RX10_TEMP229 = 0;

						final boolean RX10_TEMP230 = RX10_TEMP227 != RX10_TEMP229;
						if(RX10_TEMP230)
							{

							String RX10_TEMP228 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP228);

							}

						final DOUBLEArray RX10_TEMP231 = b.contents;
						Program.DOUBLESetValue(RX10_TEMP231, RX10_TEMP223, X10_TEMP217);
						}
					}
				}
			}
 		}
public static void Linpack_daxpy ( final Linpack X10_TEMP0, final int n, final double da, final doubleRefArray2 dx, final int dxCol, final int dx_off, final int incx, final doubleRefArray2 dy, final int dyCol, final int dy_off, final int incy)		{

		final int X10_TEMP1 = 0;

		final boolean X10_TEMP3 = n > X10_TEMP1;

		final int X10_TEMP4 = 0;

		final boolean X10_TEMP6 = da != X10_TEMP4;

		final boolean X10_TEMP8 = X10_TEMP3 && X10_TEMP6;
		if(X10_TEMP8)
			{

			final int X10_TEMP9 = 1;

			final boolean X10_TEMP11 = incx != X10_TEMP9;

			final int X10_TEMP10 = 1;

			final boolean X10_TEMP12 = incy != X10_TEMP10;

			final boolean X10_TEMP14 = X10_TEMP11 || X10_TEMP12;
			if(X10_TEMP14)
				{

				int ix = 0;

				int iy = 0;

				final int X10_TEMP17 = 0;

				final boolean X10_TEMP19 = incx < X10_TEMP17;
				if(X10_TEMP19)
					{

					final int X10_TEMP20 = 0;

					final int X10_TEMP21 = X10_TEMP20 - n;

					final int X10_TEMP22 = 1;

					final int X10_TEMP24 = X10_TEMP21 + X10_TEMP22;

					final int X10_TEMP26 = X10_TEMP24 * incx;

					ix = X10_TEMP26;
					}

				final int X10_TEMP27 = 0;

				final boolean X10_TEMP29 = incy < X10_TEMP27;
				if(X10_TEMP29)
					{

					final int X10_TEMP30 = 0;

					final int X10_TEMP31 = X10_TEMP30 - n;

					final int X10_TEMP32 = 1;

					final int X10_TEMP34 = X10_TEMP31 + X10_TEMP32;

					final int X10_TEMP36 = X10_TEMP34 * incy;

					iy = X10_TEMP36;
					}

				final int X10_TEMP40 = 0;

				final int X10_TEMP38 = 1;

				final int X10_TEMP41 = n - X10_TEMP38;

				Region1 tempr = Program.createNewRegion1R(X10_TEMP40, X10_TEMP41);

				final int X10_TEMP43 = 0;

				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP43);

				final Region1 RX10_TEMP1 = temprDist.dReg;

				final Point1[] RX10_TEMP2 = RX10_TEMP1.pointArray;
				for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
					{

					final Point1 i = RX10_TEMP2[RX10_TEMP0];

					final int X10_TEMP48 = iy + dy_off;

					final int X10_TEMP51 = iy + dy_off;

					final Point2 RX10_TEMP3 = new Point2(dyCol, X10_TEMP51);

					final Dist2 RX10_TEMP4 = dy.distValue;

					final Region2 RX10_TEMP5 = RX10_TEMP4.dReg;

					final int RX10_TEMP6 = Program.searchPointInRegion2(RX10_TEMP5, RX10_TEMP3);

					final int RX10_TEMP7 = 0;

					final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
					if(RX10_TEMP8)
						{

						String RX10_TEMP9 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP9);

						}

					final Dist SX10_TEMP0 = RX10_TEMP4.dDist;

					final int RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

					final int RX10_TEMP12 = 0;

					final boolean RX10_TEMP13 = RX10_TEMP10 != RX10_TEMP12;
					if(RX10_TEMP13)
						{

						String RX10_TEMP11 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP11);

						}

					final DOUBLEArray RX10_TEMP14 = dy.contents;

					final double X10_TEMP59 = Program.DOUBLEGetValue(RX10_TEMP14, RX10_TEMP6);

					final int X10_TEMP55 = ix + dx_off;

					final double X10_TEMP56 = Program.Linpack_read(X10_TEMP0, dx, dxCol, X10_TEMP55);

					final double X10_TEMP58 = da * X10_TEMP56;

					final double X10_TEMP62 = X10_TEMP59 + X10_TEMP58;

					final double X10_TEMP63 = X10_TEMP62;

					final Point2 RX10_TEMP15 = new Point2(dyCol, X10_TEMP48);

					final Dist2 RX10_TEMP16 = dy.distValue;

					final Region2 RX10_TEMP17 = RX10_TEMP16.dReg;

					final int RX10_TEMP18 = Program.searchPointInRegion2(RX10_TEMP17, RX10_TEMP15);

					final int RX10_TEMP19 = 0;

					final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
					if(RX10_TEMP20)
						{

						String RX10_TEMP21 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP21);

						}

					final Dist SX10_TEMP1 = RX10_TEMP16.dDist;

					final int RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP18);

					final int RX10_TEMP24 = 0;

					final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
					if(RX10_TEMP25)
						{

						String RX10_TEMP23 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP23);

						}

					final DOUBLEArray RX10_TEMP26 = dy.contents;
					Program.DOUBLESetValue(RX10_TEMP26, RX10_TEMP18, X10_TEMP63);

					final int X10_TEMP65 = ix + incx;

					ix = X10_TEMP65;

					final int X10_TEMP67 = iy + incy;

					iy = X10_TEMP67;
					}
				return;
				}

			final int X10_TEMP71 = 0;

			final int X10_TEMP69 = 1;

			final int X10_TEMP72 = n - X10_TEMP69;

			Region1 tempr = Program.createNewRegion1R(X10_TEMP71, X10_TEMP72);

			final int X10_TEMP74 = 0;

			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP74);

			final Region1 RX10_TEMP29 = temprDist.dReg;

			final Point1[] RX10_TEMP30 = RX10_TEMP29.pointArray;
			for(int RX10_TEMP27=0; RX10_TEMP27 < RX10_TEMP30.length; RX10_TEMP27++)
				{

				final Point1 RX10_TEMP28 = RX10_TEMP30[RX10_TEMP27];

				final int i = RX10_TEMP28.f0;

				final int X10_TEMP79 = i + dy_off;

				final int X10_TEMP82 = i + dy_off;

				final Point2 RX10_TEMP31 = new Point2(dyCol, X10_TEMP82);

				final Dist2 RX10_TEMP32 = dy.distValue;

				final Region2 RX10_TEMP33 = RX10_TEMP32.dReg;

				final int RX10_TEMP34 = Program.searchPointInRegion2(RX10_TEMP33, RX10_TEMP31);

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

					String RX10_TEMP39 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP39);

					}

				final DOUBLEArray RX10_TEMP42 = dy.contents;

				final double X10_TEMP90 = Program.DOUBLEGetValue(RX10_TEMP42, RX10_TEMP34);

				final int X10_TEMP86 = i + dx_off;

				final double X10_TEMP87 = Program.Linpack_read(X10_TEMP0, dx, dxCol, X10_TEMP86);

				final double X10_TEMP89 = da * X10_TEMP87;

				final double X10_TEMP93 = X10_TEMP90 + X10_TEMP89;

				final double X10_TEMP94 = X10_TEMP93;

				final Point2 RX10_TEMP43 = new Point2(dyCol, X10_TEMP79);

				final Dist2 RX10_TEMP44 = dy.distValue;

				final Region2 RX10_TEMP45 = RX10_TEMP44.dReg;

				final int RX10_TEMP46 = Program.searchPointInRegion2(RX10_TEMP45, RX10_TEMP43);

				final int RX10_TEMP47 = 0;

				final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47;
				if(RX10_TEMP48)
					{

					String RX10_TEMP49 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP49);

					}

				final Dist SX10_TEMP3 = RX10_TEMP44.dDist;

				final int RX10_TEMP50 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP46);

				final int RX10_TEMP52 = 0;

				final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52;
				if(RX10_TEMP53)
					{

					String RX10_TEMP51 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP51);

					}

				final DOUBLEArray RX10_TEMP54 = dy.contents;
				Program.DOUBLESetValue(RX10_TEMP54, RX10_TEMP46, X10_TEMP94);
				}
			}
		}
public static double Linpack_ddot ( final Linpack X10_TEMP0, final int n, final doubleRefArray2 dx, final int dxCol, final int dx_off, final int incx, final doubleRefArray2 dy, final int dyCol, final int dy_off, final int incy)		{

		double dtemp = 0;

		final int X10_TEMP2 = 0;

		final boolean X10_TEMP4 = n > X10_TEMP2;
		if(X10_TEMP4)
			{

			final int X10_TEMP5 = 1;

			final boolean X10_TEMP7 = incx != X10_TEMP5;

			final int X10_TEMP6 = 1;

			final boolean X10_TEMP8 = incy != X10_TEMP6;

			final boolean X10_TEMP10 = X10_TEMP7 || X10_TEMP8;
			if(X10_TEMP10)
				{

				int ix = 0;

				int iy = 0;

				final int X10_TEMP13 = 0;

				final boolean X10_TEMP15 = incx < X10_TEMP13;
				if(X10_TEMP15)
					{

					final int X10_TEMP16 = 0;

					final int X10_TEMP17 = X10_TEMP16 - n;

					final int X10_TEMP18 = 1;

					final int X10_TEMP20 = X10_TEMP17 + X10_TEMP18;

					final int X10_TEMP22 = X10_TEMP20 * incx;

					ix = X10_TEMP22;
					}

				final int X10_TEMP23 = 0;

				final boolean X10_TEMP25 = incy < X10_TEMP23;
				if(X10_TEMP25)
					{

					final int X10_TEMP26 = 0;

					final int X10_TEMP27 = X10_TEMP26 - n;

					final int X10_TEMP28 = 1;

					final int X10_TEMP30 = X10_TEMP27 + X10_TEMP28;

					final int X10_TEMP32 = X10_TEMP30 * incy;

					iy = X10_TEMP32;
					}

				final int X10_TEMP36 = 0;

				final int X10_TEMP34 = 1;

				final int X10_TEMP37 = n - X10_TEMP34;

				Region1 tempr = Program.createNewRegion1R(X10_TEMP36, X10_TEMP37);

				final int X10_TEMP39 = 0;

				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP39);

				final Region1 RX10_TEMP1 = temprDist.dReg;

				final Point1[] RX10_TEMP2 = RX10_TEMP1.pointArray;
				for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
					{

					final Point1 i = RX10_TEMP2[RX10_TEMP0];

					final int X10_TEMP44 = ix + dx_off;

					final Point2 RX10_TEMP3 = new Point2(dxCol, X10_TEMP44);

					final Dist2 RX10_TEMP4 = dx.distValue;

					final Region2 RX10_TEMP5 = RX10_TEMP4.dReg;

					final int RX10_TEMP6 = Program.searchPointInRegion2(RX10_TEMP5, RX10_TEMP3);

					final int RX10_TEMP7 = 0;

					final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
					if(RX10_TEMP8)
						{

						String RX10_TEMP9 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP9);

						}

					final Dist SX10_TEMP0 = RX10_TEMP4.dDist;

					final int RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

					final int RX10_TEMP12 = 0;

					final boolean RX10_TEMP13 = RX10_TEMP10 != RX10_TEMP12;
					if(RX10_TEMP13)
						{

						String RX10_TEMP11 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP11);

						}

					final DOUBLEArray RX10_TEMP14 = dx.contents;

					final double X10_TEMP48 = Program.DOUBLEGetValue(RX10_TEMP14, RX10_TEMP6);

					final int X10_TEMP47 = iy + dy_off;

					final Point2 RX10_TEMP15 = new Point2(dyCol, X10_TEMP47);

					final Dist2 RX10_TEMP16 = dy.distValue;

					final Region2 RX10_TEMP17 = RX10_TEMP16.dReg;

					final int RX10_TEMP18 = Program.searchPointInRegion2(RX10_TEMP17, RX10_TEMP15);

					final int RX10_TEMP19 = 0;

					final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
					if(RX10_TEMP20)
						{

						String RX10_TEMP21 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP21);

						}

					final Dist SX10_TEMP1 = RX10_TEMP16.dDist;

					final int RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP18);

					final int RX10_TEMP24 = 0;

					final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
					if(RX10_TEMP25)
						{

						String RX10_TEMP23 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP23);

						}

					final DOUBLEArray RX10_TEMP26 = dy.contents;

					final double X10_TEMP49 = Program.DOUBLEGetValue(RX10_TEMP26, RX10_TEMP18);

					final double X10_TEMP51 = X10_TEMP48 * X10_TEMP49;

					final double X10_TEMP53 = dtemp + X10_TEMP51;

					dtemp = X10_TEMP53;

					final int X10_TEMP55 = ix + incx;

					ix = X10_TEMP55;

					final int X10_TEMP57 = iy + incy;

					iy = X10_TEMP57;
					}
				}
			else
				{

				final int X10_TEMP61 = 0;

				final int X10_TEMP59 = 1;

				final int X10_TEMP62 = n - X10_TEMP59;

				Region1 tempr = Program.createNewRegion1R(X10_TEMP61, X10_TEMP62);

				final int X10_TEMP64 = 0;

				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP64);

				final Region1 RX10_TEMP29 = temprDist.dReg;

				final Point1[] RX10_TEMP30 = RX10_TEMP29.pointArray;
				for(int RX10_TEMP27=0; RX10_TEMP27 < RX10_TEMP30.length; RX10_TEMP27++)
					{

					final Point1 RX10_TEMP28 = RX10_TEMP30[RX10_TEMP27];

					final int i = RX10_TEMP28.f0;

					final int X10_TEMP69 = i + dx_off;

					final Point2 RX10_TEMP31 = new Point2(dxCol, X10_TEMP69);

					final Dist2 RX10_TEMP32 = dx.distValue;

					final Region2 RX10_TEMP33 = RX10_TEMP32.dReg;

					final int RX10_TEMP34 = Program.searchPointInRegion2(RX10_TEMP33, RX10_TEMP31);

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

						String RX10_TEMP39 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP39);

						}

					final DOUBLEArray RX10_TEMP42 = dx.contents;

					final double X10_TEMP73 = Program.DOUBLEGetValue(RX10_TEMP42, RX10_TEMP34);

					final int X10_TEMP72 = i + dy_off;

					final Point2 RX10_TEMP43 = new Point2(dyCol, X10_TEMP72);

					final Dist2 RX10_TEMP44 = dy.distValue;

					final Region2 RX10_TEMP45 = RX10_TEMP44.dReg;

					final int RX10_TEMP46 = Program.searchPointInRegion2(RX10_TEMP45, RX10_TEMP43);

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

						String RX10_TEMP51 = "Bad place access for array dy";
throw new RuntimeException(RX10_TEMP51);

						}

					final DOUBLEArray RX10_TEMP54 = dy.contents;

					final double X10_TEMP74 = Program.DOUBLEGetValue(RX10_TEMP54, RX10_TEMP46);

					final double X10_TEMP75 = X10_TEMP73 * X10_TEMP74;

					final double X10_TEMP77 = dtemp + X10_TEMP75;

					dtemp = X10_TEMP77;
					}
				}
 			}
		return dtemp;
		}
public static void Linpack_dscal ( final Linpack X10_TEMP0, final int n, final double da, final doubleRefArray2 dx, final int currentCol, final int dx_off, final int incx)		{

		final int X10_TEMP1 = 0;

		final boolean X10_TEMP3 = n > X10_TEMP1;
		if(X10_TEMP3)
			{

			final int X10_TEMP4 = 1;

			final boolean X10_TEMP6 = incx != X10_TEMP4;
			if(X10_TEMP6)
				{

				final int nincx = n * incx;

				int i = 0;

				boolean X10_TEMP11 = i < nincx;
				while(X10_TEMP11)
					{

					final int X10_TEMP14 = i + dx_off;

					final int X10_TEMP17 = i + dx_off;

					final Point2 RX10_TEMP0 = new Point2(currentCol, X10_TEMP17);

					final Dist2 RX10_TEMP1 = dx.distValue;

					final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;

					final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP0);

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

						String RX10_TEMP8 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP8);

						}

					final DOUBLEArray RX10_TEMP11 = dx.contents;

					final double X10_TEMP18 = Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3);

					final double X10_TEMP21 = X10_TEMP18 * da;

					final double X10_TEMP22 = X10_TEMP21;

					final Point2 RX10_TEMP12 = new Point2(currentCol, X10_TEMP14);

					final Dist2 RX10_TEMP13 = dx.distValue;

					final Region2 RX10_TEMP14 = RX10_TEMP13.dReg;

					final int RX10_TEMP15 = Program.searchPointInRegion2(RX10_TEMP14, RX10_TEMP12);

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

						String RX10_TEMP20 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP20);

						}

					final DOUBLEArray RX10_TEMP23 = dx.contents;
					Program.DOUBLESetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP22);

					final int X10_TEMP24 = i + incx;

					i = X10_TEMP24;

					X10_TEMP11 = i < nincx;
					}
				}
			else
				{

				final int X10_TEMP28 = 0;

				final int X10_TEMP26 = 1;

				final int X10_TEMP29 = n - X10_TEMP26;

				Region1 tempr = Program.createNewRegion1R(X10_TEMP28, X10_TEMP29);

				final int X10_TEMP31 = 0;

				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP31);

				final Region1 RX10_TEMP26 = temprDist.dReg;

				final Point1[] RX10_TEMP27 = RX10_TEMP26.pointArray;
				for(int RX10_TEMP24=0; RX10_TEMP24 < RX10_TEMP27.length; RX10_TEMP24++)
					{

					final Point1 RX10_TEMP25 = RX10_TEMP27[RX10_TEMP24];

					final int i = RX10_TEMP25.f0;

					final int X10_TEMP36 = i + dx_off;

					final int X10_TEMP39 = i + dx_off;

					final Point2 RX10_TEMP28 = new Point2(currentCol, X10_TEMP39);

					final Dist2 RX10_TEMP29 = dx.distValue;

					final Region2 RX10_TEMP30 = RX10_TEMP29.dReg;

					final int RX10_TEMP31 = Program.searchPointInRegion2(RX10_TEMP30, RX10_TEMP28);

					final int RX10_TEMP32 = 0;

					final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
					if(RX10_TEMP33)
						{

						String RX10_TEMP34 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP34);

						}

					final Dist SX10_TEMP2 = RX10_TEMP29.dDist;

					final int RX10_TEMP35 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP31);

					final int RX10_TEMP37 = 0;

					final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
					if(RX10_TEMP38)
						{

						String RX10_TEMP36 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP36);

						}

					final DOUBLEArray RX10_TEMP39 = dx.contents;

					final double X10_TEMP40 = Program.DOUBLEGetValue(RX10_TEMP39, RX10_TEMP31);

					final double X10_TEMP43 = X10_TEMP40 * da;

					final double X10_TEMP44 = X10_TEMP43;

					final Point2 RX10_TEMP40 = new Point2(currentCol, X10_TEMP36);

					final Dist2 RX10_TEMP41 = dx.distValue;

					final Region2 RX10_TEMP42 = RX10_TEMP41.dReg;

					final int RX10_TEMP43 = Program.searchPointInRegion2(RX10_TEMP42, RX10_TEMP40);

					final int RX10_TEMP44 = 0;

					final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
					if(RX10_TEMP45)
						{

						String RX10_TEMP46 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP46);

						}

					final Dist SX10_TEMP3 = RX10_TEMP41.dDist;

					final int RX10_TEMP47 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP43);

					final int RX10_TEMP49 = 0;

					final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
					if(RX10_TEMP50)
						{

						String RX10_TEMP48 = "Bad place access for array dx";
throw new RuntimeException(RX10_TEMP48);

						}

					final DOUBLEArray RX10_TEMP51 = dx.contents;
					Program.DOUBLESetValue(RX10_TEMP51, RX10_TEMP43, X10_TEMP44);
					}
				}
 			}
		}
public static int Linpack_idamax ( final Linpack X10_TEMP0, final int n, final doubleRefArray2 dx, final int dxk, final int dx_off, final int incx)		{

		final int X10_TEMP1 = 1;

		final boolean X10_TEMP3 = n < X10_TEMP1;
		if(X10_TEMP3)
			{

			final int X10_TEMP4 = 1;

			final int X10_TEMP5 = 0;

			final int X10_TEMP7 = X10_TEMP5 - X10_TEMP4;
			return X10_TEMP7;
			}

		final int X10_TEMP8 = 1;

		final boolean X10_TEMP10 = n == X10_TEMP8;
		if(X10_TEMP10)
			{

			final int X10_TEMP12 = 0;
			return X10_TEMP12;
			}

		final int X10_TEMP13 = 1;

		final boolean X10_TEMP15 = incx != X10_TEMP13;
		if(X10_TEMP15)
			{

			int itemp = 0;

			final int X10_TEMP19 = 0;

			final int X10_TEMP21 = X10_TEMP19 + dx_off;

			final double X10_TEMP23 = Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP21);

			double dmax = Program.Linpack_myabs(X10_TEMP0, X10_TEMP23);

			final int X10_TEMP25 = 1;

			int ix = X10_TEMP25 + incx;

			final int X10_TEMP30 = 1;

			final int X10_TEMP28 = 1;

			final int X10_TEMP31 = n - X10_TEMP28;

			final Region1 X10_TEMP33 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP31);

			final Point1[] RX10_TEMP2 = X10_TEMP33.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
				{

				final Point1 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

				final int i = RX10_TEMP1.f0;

				final int X10_TEMP37 = ix + dx_off;

				final double X10_TEMP39 = Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP37);

				double dtemp = Program.Linpack_myabs(X10_TEMP0, X10_TEMP39);

				final boolean X10_TEMP42 = dtemp > dmax;
				if(X10_TEMP42)
					{

					itemp = i;

					dmax = dtemp;
					}

				final int X10_TEMP46 = i + incx;

				ix = X10_TEMP46;
				}
			return itemp;
			}

		int itemp = 0;

		final int X10_TEMP51 = 0;

		final int X10_TEMP53 = X10_TEMP51 + dx_off;

		final double X10_TEMP55 = Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP53);

		double dmax = Program.Linpack_myabs(X10_TEMP0, X10_TEMP55);

		final int X10_TEMP60 = 1;

		final int X10_TEMP58 = 1;

		final int X10_TEMP61 = n - X10_TEMP58;

		final Region1 X10_TEMP63 = Program.createNewRegion1R(X10_TEMP60, X10_TEMP61);

		final Point1[] RX10_TEMP5 = X10_TEMP63.pointArray;
		for(int RX10_TEMP3=0; RX10_TEMP3 < RX10_TEMP5.length; RX10_TEMP3++)
			{

			final Point1 RX10_TEMP4 = RX10_TEMP5[RX10_TEMP3];

			final int i = RX10_TEMP4.f0;

			final int X10_TEMP67 = i + dx_off;

			final double X10_TEMP69 = Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP67);

			double dtemp = Program.Linpack_myabs(X10_TEMP0, X10_TEMP69);

			final boolean X10_TEMP72 = dtemp > dmax;
			if(X10_TEMP72)
				{

				itemp = i;

				dmax = dtemp;
				}
			}
		return itemp;
		}
public static double Linpack_epslon ( final Linpack X10_TEMP0, final double x)		{

		final double X10_TEMP1 = 4.0e0;

		final double X10_TEMP2 = 3.0e0;

		final double a = X10_TEMP1 / X10_TEMP2;

		double eps = 0;

		final int X10_TEMP5 = 0;

		boolean X10_TEMP9 = eps == X10_TEMP5;
		while(X10_TEMP9)
			{

			final double X10_TEMP10 = 1.0;

			double b = a - X10_TEMP10;

			final double X10_TEMP12 = b + b;

			double c = X10_TEMP12 + b;

			final double X10_TEMP14 = 1.0;

			final double X10_TEMP16 = c - X10_TEMP14;

			final double X10_TEMP18 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP16);

			eps = X10_TEMP18;

			final int X10_TEMP7 = 0;

			X10_TEMP9 = eps == X10_TEMP7;
			}

		final double X10_TEMP20 = Program.Linpack_myabs(X10_TEMP0, x);

		final double X10_TEMP22 = eps * X10_TEMP20;
		return X10_TEMP22;
		}
public static void Linpack_dmxpy ( final Linpack X10_TEMP0, final int n1, final doubleRefArray2 y, final int n2, final int ldm, final doubleRefArray2 x, final doubleRefArray2 m)		{

		final int X10_TEMP4 = 0;

		final int X10_TEMP2 = 1;

		final int X10_TEMP5 = n2 - X10_TEMP2;

		final int X10_TEMP9 = 0;

		final int X10_TEMP7 = 1;

		final int X10_TEMP10 = n1 - X10_TEMP7;

		final Region2 X10_TEMP12 = Program.createNewRegion2RR(X10_TEMP4, X10_TEMP5, X10_TEMP9, X10_TEMP10);

		final Point2[] RX10_TEMP2 = X10_TEMP12.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
			{

			final Point2 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

			final int j = RX10_TEMP1.f0;

			final int i = RX10_TEMP1.f1;

			final int X10_TEMP15 = 0;

			final int X10_TEMP18 = 0;

			final Point2 RX10_TEMP3 = new Point2(X10_TEMP18, i);

			final Dist2 RX10_TEMP4 = y.distValue;

			final Region2 RX10_TEMP5 = RX10_TEMP4.dReg;

			final int RX10_TEMP6 = Program.searchPointInRegion2(RX10_TEMP5, RX10_TEMP3);

			final int RX10_TEMP7 = 0;

			final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
			if(RX10_TEMP8)
				{

				String RX10_TEMP9 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP9);

				}

			final Dist SX10_TEMP0 = RX10_TEMP4.dDist;

			final int RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

			final int RX10_TEMP12 = 0;

			final boolean RX10_TEMP13 = RX10_TEMP10 != RX10_TEMP12;
			if(RX10_TEMP13)
				{

				String RX10_TEMP11 = "Bad place access for array y";
throw new RuntimeException(RX10_TEMP11);

				}

			final DOUBLEArray RX10_TEMP14 = y.contents;

			final double X10_TEMP29 = Program.DOUBLEGetValue(RX10_TEMP14, RX10_TEMP6);

			final int X10_TEMP21 = 0;

			final Point2 RX10_TEMP15 = new Point2(X10_TEMP21, j);

			final Dist2 RX10_TEMP16 = x.distValue;

			final Region2 RX10_TEMP17 = RX10_TEMP16.dReg;

			final int RX10_TEMP18 = Program.searchPointInRegion2(RX10_TEMP17, RX10_TEMP15);

			final int RX10_TEMP19 = 0;

			final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
			if(RX10_TEMP20)
				{

				String RX10_TEMP21 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP21);

				}

			final Dist SX10_TEMP1 = RX10_TEMP16.dDist;

			final int RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP18);

			final int RX10_TEMP24 = 0;

			final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
			if(RX10_TEMP25)
				{

				String RX10_TEMP23 = "Bad place access for array x";
throw new RuntimeException(RX10_TEMP23);

				}

			final DOUBLEArray RX10_TEMP26 = x.contents;

			final double X10_TEMP25 = Program.DOUBLEGetValue(RX10_TEMP26, RX10_TEMP18);

			final double X10_TEMP26 = Program.Linpack_read(X10_TEMP0, m, j, i);

			final double X10_TEMP28 = X10_TEMP25 * X10_TEMP26;

			final double X10_TEMP32 = X10_TEMP29 + X10_TEMP28;

			final double X10_TEMP33 = X10_TEMP32;

			final Point2 RX10_TEMP27 = new Point2(X10_TEMP15, i);

			final Dist2 RX10_TEMP28 = y.distValue;

			final Region2 RX10_TEMP29 = RX10_TEMP28.dReg;

			final int RX10_TEMP30 = Program.searchPointInRegion2(RX10_TEMP29, RX10_TEMP27);

			final int RX10_TEMP31 = 0;

			final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
			if(RX10_TEMP32)
				{

				String RX10_TEMP33 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP33);

				}

			final Dist SX10_TEMP2 = RX10_TEMP28.dDist;

			final int RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP30);

			final int RX10_TEMP36 = 0;

			final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
			if(RX10_TEMP37)
				{

				String RX10_TEMP35 = "Bad place access for array y";
throw new RuntimeException(RX10_TEMP35);

				}

			final DOUBLEArray RX10_TEMP38 = y.contents;
			Program.DOUBLESetValue(RX10_TEMP38, RX10_TEMP30, X10_TEMP33);
			}
		}
public static void runMain ( )		{

		Timer tmr = new Timer();

		int count = 0;
		Program.Timer_start(tmr, count);

		final Linpack X10_TEMP4 = new Linpack();
		Program.Linpack_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);

		final String X10_TEMP7 = "Wall-clock time for linpack: ";

		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count);

		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;

		final String X10_TEMP10 = " secs";

		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;
		System.out.println(X10_TEMP12);
		}
public static int _Timer_max_counters_init ( )		{

		final int X10_TEMP2 = 64;
		return X10_TEMP2;
		}
public static void Timer_start ( final Timer X10_TEMP0, final int n)		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.start_time;

		final double X10_TEMP5 = System.currentTimeMillis();

		final double X10_TEMP6 = X10_TEMP5;

		final Point1 RX10_TEMP0 = new Point1(n);

		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;

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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP1.contents;
		Program.DOUBLESetValue(RX10_TEMP11, RX10_TEMP3, X10_TEMP6);
		}
public static void Timer_stop ( final Timer X10_TEMP0, final int n)		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.elapsed_time;

		final double X10_TEMP5 = System.currentTimeMillis();

		final doubleRefArray1 X10_TEMP3 = X10_TEMP0.start_time;

		final Point1 RX10_TEMP0 = new Point1(n);

		final Dist1 RX10_TEMP1 = X10_TEMP3.distValue;

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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP3";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP3.contents;

		final double X10_TEMP6 = Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3);

		final double X10_TEMP9 = X10_TEMP5 - X10_TEMP6;

		final double X10_TEMP10 = X10_TEMP9;

		final Point1 RX10_TEMP12 = new Point1(n);

		final Dist1 RX10_TEMP13 = X10_TEMP1.distValue;

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

			String RX10_TEMP20 = "Bad place access for array X10_TEMP1";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP1.contents;
		Program.DOUBLESetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP10);

		final doubleRefArray1 X10_TEMP11 = X10_TEMP0.elapsed_time;

		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;

		final Point1 RX10_TEMP24 = new Point1(n);

		final Dist1 RX10_TEMP25 = X10_TEMP13.distValue;

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

			String RX10_TEMP32 = "Bad place access for array X10_TEMP13";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP13.contents;

		final double X10_TEMP15 = Program.DOUBLEGetValue(RX10_TEMP35, RX10_TEMP27);

		final int X10_TEMP16 = 1000;

		final double X10_TEMP19 = X10_TEMP15 / X10_TEMP16;

		final double X10_TEMP20 = X10_TEMP19;

		final Point1 RX10_TEMP36 = new Point1(n);

		final Dist1 RX10_TEMP37 = X10_TEMP11.distValue;

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

			String RX10_TEMP44 = "Bad place access for array X10_TEMP11";
throw new RuntimeException(RX10_TEMP44);

			}

		final DOUBLEArray RX10_TEMP47 = X10_TEMP11.contents;
		Program.DOUBLESetValue(RX10_TEMP47, RX10_TEMP39, X10_TEMP20);

		final doubleRefArray1 X10_TEMP21 = X10_TEMP0.total_time;

		final doubleRefArray1 X10_TEMP23 = X10_TEMP0.total_time;

		final Point1 RX10_TEMP48 = new Point1(n);

		final Dist1 RX10_TEMP49 = X10_TEMP23.distValue;

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

			String RX10_TEMP56 = "Bad place access for array X10_TEMP23";
throw new RuntimeException(RX10_TEMP56);

			}

		final DOUBLEArray RX10_TEMP59 = X10_TEMP23.contents;

		final double X10_TEMP27 = Program.DOUBLEGetValue(RX10_TEMP59, RX10_TEMP51);

		final doubleRefArray1 X10_TEMP25 = X10_TEMP0.elapsed_time;

		final Point1 RX10_TEMP60 = new Point1(n);

		final Dist1 RX10_TEMP61 = X10_TEMP25.distValue;

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

			String RX10_TEMP68 = "Bad place access for array X10_TEMP25";
throw new RuntimeException(RX10_TEMP68);

			}

		final DOUBLEArray RX10_TEMP71 = X10_TEMP25.contents;

		final double X10_TEMP28 = Program.DOUBLEGetValue(RX10_TEMP71, RX10_TEMP63);

		final double X10_TEMP31 = X10_TEMP27 + X10_TEMP28;

		final double X10_TEMP32 = X10_TEMP31;

		final Point1 RX10_TEMP72 = new Point1(n);

		final Dist1 RX10_TEMP73 = X10_TEMP21.distValue;

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

			String RX10_TEMP80 = "Bad place access for array X10_TEMP21";
throw new RuntimeException(RX10_TEMP80);

			}

		final DOUBLEArray RX10_TEMP83 = X10_TEMP21.contents;
		Program.DOUBLESetValue(RX10_TEMP83, RX10_TEMP75, X10_TEMP32);
		}
public static double Timer_readTimer ( final Timer X10_TEMP0, final int n)		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;

		final Point1 RX10_TEMP0 = new Point1(n);

		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;

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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP1.contents;

		final double X10_TEMP4 = Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3);
		return X10_TEMP4;
		}
public static void Timer_resetTimer ( final Timer X10_TEMP0, final int n)		{

		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;

		final double X10_TEMP5 = 0;

		final double X10_TEMP6 = X10_TEMP5;

		final Point1 RX10_TEMP0 = new Point1(n);

		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;

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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP1.contents;
		Program.DOUBLESetValue(RX10_TEMP11, RX10_TEMP3, X10_TEMP6);

		final doubleRefArray1 X10_TEMP7 = X10_TEMP0.start_time;

		final double X10_TEMP11 = 0;

		final double X10_TEMP12 = X10_TEMP11;

		final Point1 RX10_TEMP12 = new Point1(n);

		final Dist1 RX10_TEMP13 = X10_TEMP7.distValue;

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

			String RX10_TEMP20 = "Bad place access for array X10_TEMP7";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP7.contents;
		Program.DOUBLESetValue(RX10_TEMP23, RX10_TEMP15, X10_TEMP12);

		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;

		final double X10_TEMP17 = 0;

		final double X10_TEMP18 = X10_TEMP17;

		final Point1 RX10_TEMP24 = new Point1(n);

		final Dist1 RX10_TEMP25 = X10_TEMP13.distValue;

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

			String RX10_TEMP32 = "Bad place access for array X10_TEMP13";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP13.contents;
		Program.DOUBLESetValue(RX10_TEMP35, RX10_TEMP27, X10_TEMP18);
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
public static int constantSearchRegion2 ( final Region2 r, final Point2 target)		{

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
public static Dist2 getBlockCyclicDist2 ( final Region2 r, final int blockSize)		{

		final int N = r.pointArray.length;

		final int fPlace = 0;

		final Dist pointDist = Program.getCyclic(N, fPlace, blockSize);

		final Dist2 retDist = new Dist2(r, pointDist);
		return retDist;
		}
public static int searchPointInRegion2 ( final Region2 r, final Point2 target)		{

		final boolean regType = r.regType;
		if(regType)
			{

			final int constantSearch = Program.constantSearchRegion2(r, target);
			return constantSearch;
			}

		final int binarySearch = Program.binarySearchRegion2(r, target);
		return binarySearch;
		}
public static int binarySearchRegion2 ( final Region2 r, final Point2 target)		{

		final Point2[] pointArray = (Point2[])(r.pointArray);

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

			final Point2 temp = pointArray[mid];

			final int pointCompare = Program.comparePoint2(target, temp);

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
public static int comparePoint2 ( final Point2 pt1, final Point2 pt2)		{

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
public static Dist2 getPlaceDist2 ( final Region2 r, final int p)		{

		final int rSize = r.pointArray.length;

		final Dist pointDist = Program.getCyclic(rSize, p, rSize);

		final Dist2 retDist = new Dist2(r, pointDist);
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
public static Region2 createNewRegion2RR ( final int v1_0, final int v1_1, final int v2_0, final int v2_1)		{

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
for(int p= 0;p <ptArray.length ;p++ )			{

			int f1 = p / stride1;

			f1 = f1 % dim1;

			f1 = f1 + v1_0;

			int f2 = p / stride2;

			f2 = f2 % dim2;

			f2 = f2 + v2_0;

			final Point2 retPoint = new Point2(f1, f2);
			ptArray[p] =retPoint;
			}

;
		if(regType)
			{

			final Region2 retRegRegular = new Region2(ptArray, v1_0, dim1, v2_0, dim2);
			return retRegRegular;
			}

		final Region2 retReg = new Region2(ptArray);
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
	class Linpack   {
 
	public int setSize;
	public doubleRefArray2 a;
	public doubleRefArray2 b;
	public doubleRefArray2 x;
	public double ops;
	public double total;
	public double norma;
	public double normx;
	public double resid;
	public double time;
	public double kf;
	public int n;
	public int i;
	public int ntimes;
	public int info;
	public int lda;
	public int ldaa;
	public int kflops;
	public intRefArray1 ipvt;
	public int infodgefa;



}
	class Timer   {
 
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

		final Dist1 d = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);

		final doubleRefArray1 RX10_TEMP4 = new doubleRefArray1(d, RX10_TEMP3);

		final doubleRefArray1 X10_TEMP10 = RX10_TEMP4;

		start_time = X10_TEMP10;

		final Region1 RX10_TEMP5 = d.dReg;

		final Point1[] RX10_TEMP7 = RX10_TEMP5.pointArray;

		final Dist RX10_TEMP6 = d.dDist;

		final DOUBLEArray RX10_TEMP8 = new DOUBLEArray(RX10_TEMP6);

		final doubleRefArray1 RX10_TEMP9 = new doubleRefArray1(d, RX10_TEMP8);

		final doubleRefArray1 X10_TEMP12 = RX10_TEMP9;

		elapsed_time = X10_TEMP12;

		final Region1 RX10_TEMP10 = d.dReg;

		final Point1[] RX10_TEMP12 = RX10_TEMP10.pointArray;

		final Dist RX10_TEMP11 = d.dDist;

		final DOUBLEArray RX10_TEMP13 = new DOUBLEArray(RX10_TEMP11);

		final doubleRefArray1 RX10_TEMP14 = new doubleRefArray1(d, RX10_TEMP13);

		final doubleRefArray1 X10_TEMP14 = RX10_TEMP14;

		total_time = X10_TEMP14;

		final int X10_TEMP15 = Program._Timer_max_counters;

		boolean X10_TEMP19 = i < X10_TEMP15;
		while(X10_TEMP19)
			{

			final double X10_TEMP23 = 0;

			final double X10_TEMP24 = X10_TEMP23;

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
			Program.DOUBLESetValue(RX10_TEMP26, RX10_TEMP18, X10_TEMP24);

			final double X10_TEMP28 = 0;

			final double X10_TEMP29 = X10_TEMP28;

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
			Program.DOUBLESetValue(RX10_TEMP38, RX10_TEMP30, X10_TEMP29);

			final double X10_TEMP33 = 0;

			final double X10_TEMP34 = X10_TEMP33;

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
			Program.DOUBLESetValue(RX10_TEMP50, RX10_TEMP42, X10_TEMP34);

			final int X10_TEMP35 = i;

			final int X10_TEMP36 = 1;

			i = i + X10_TEMP36;

			final int X10_TEMP17 = Program._Timer_max_counters;

			X10_TEMP19 = i < X10_TEMP17;
			}
		}



}
	/*value*/ class Point2 
	 {
 
	public final int f0;
	public final int f1;


	public Point2 ( final int f0_, final int f1_)
		{

		f0 = f0_;

		f1 = f1_;
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
	/*value*/ class Region2 
	 {
 
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final Point2[] pointArray;


	public Region2 ( final Point2[] pointArray_)
		{

		final int zero = 0;

		final int one = 1;

		final int minusOne = zero - one;

		regRank = 2;

		pointArray = pointArray_;

		regType = false;

		low0 = minusOne;

		dim0 = zero;

		low1 = minusOne;

		dim1 = zero;
		}
	public Region2 ( final Point2[] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_)
		{

		regRank = 2;

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
	public final DOUBLEArray contents;


	public doubleRefArray1 ( final Dist1 distValue_, final DOUBLEArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
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
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_)
		{

		f0 = f0_;
		}


	}
	/*value*/ class Dist2 
	 {
 
	public final Region2 dReg;
	public final Dist dDist;


	public Dist2 ( final Region2 dReg_, final Dist dDist_)
		{

		dReg = dReg_;

		dDist = dDist_;
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
	/*value*/ class doubleRefArray2 
	 {
 
	public final Dist2 distValue;
	public final DOUBLEArray contents;


	public doubleRefArray2 ( final Dist2 distValue_, final DOUBLEArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
		}


	}
