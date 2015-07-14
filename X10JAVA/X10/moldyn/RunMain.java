public class RunMain {
 
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program   {
 
public static final int _md_ITERS = Program._md_ITERS_init();
public static final double _md_LENGTH = Program._md_LENGTH_init();
public static final double _md_m = Program._md_m_init();
public static final double _md_mu = Program._md_mu_init();
public static final double _md_kb = Program._md_kb_init();
public static final double _md_TSIM = Program._md_TSIM_init();
public static final double _md_deltat = Program._md_deltat_init();
public static final double _md_den = Program._md_den_init();
public static final double _md_tref = Program._md_tref_init();
public static final double _md_h = Program._md_h_init();
public static final int _md_irep = Program._md_irep_init();
public static final int _md_istop = Program._md_istop_init();
public static final int _md_iprint = Program._md_iprint_init();
public static final int _md_movemx = Program._md_movemx_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain ( )		{

		Timer tmr = new Timer();

		int count = 0;
		Program.Timer_start(tmr, count);
		Program.md_exec();
		Program.Timer_stop(tmr, count);

		final String X10_TEMP6 = "Wall-clock time for moldyn: ";

		final double X10_TEMP7 = Program.Timer_readTimer(tmr, count);

		final String X10_TEMP8 = X10_TEMP6 + X10_TEMP7;

		final String X10_TEMP9 = " secs";

		final String X10_TEMP11 = X10_TEMP8 + X10_TEMP9;
		System.out.println(X10_TEMP11);
		}
public static int _md_ITERS_init ( )		{

		final int X10_TEMP2 = 100;
		return X10_TEMP2;
		}
public static double _md_LENGTH_init ( )		{

		final double X10_TEMP2 = 50e-10;
		return X10_TEMP2;
		}
public static double _md_m_init ( )		{

		final double X10_TEMP2 = 4.0026;
		return X10_TEMP2;
		}
public static double _md_mu_init ( )		{

		final double X10_TEMP2 = 1.66056e-27;
		return X10_TEMP2;
		}
public static double _md_kb_init ( )		{

		final double X10_TEMP2 = 1.38066e-23;
		return X10_TEMP2;
		}
public static double _md_TSIM_init ( )		{

		final double X10_TEMP2 = 50;
		return X10_TEMP2;
		}
public static double _md_deltat_init ( )		{

		final double X10_TEMP2 = 5e-16;
		return X10_TEMP2;
		}
public static double _md_den_init ( )		{

		final double X10_TEMP2 = 0.83134;
		return X10_TEMP2;
		}
public static double _md_tref_init ( )		{

		final double X10_TEMP2 = 0.722;
		return X10_TEMP2;
		}
public static double _md_h_init ( )		{

		final double X10_TEMP2 = 0.064;
		return X10_TEMP2;
		}
public static int _md_irep_init ( )		{

		final int X10_TEMP2 = 10;
		return X10_TEMP2;
		}
public static int _md_istop_init ( )		{

		final int X10_TEMP2 = 19;
		return X10_TEMP2;
		}
public static int _md_iprint_init ( )		{

		final int X10_TEMP2 = 10;
		return X10_TEMP2;
		}
public static int _md_movemx_init ( )		{

		final int X10_TEMP2 = 50;
		return X10_TEMP2;
		}
public static void md_exec ( )		{

		final Dist1 X10_TEMP1 = Program.getUniqueDist();

		final Dist1 D = X10_TEMP1;

		final Region1 RX10_TEMP0 = D.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = D.dDist;

		final MDArray RX10_TEMP3 = new MDArray(RX10_TEMP1);
					{
			for(int RX10_TEMP4=0; RX10_TEMP4 < RX10_TEMP2.length; RX10_TEMP4++)
				{

				final Dist SX10_TEMP0 = D.dDist;

				final int RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				//async(RX10_TEMP5)
					{

					final Point1 pt = RX10_TEMP2[RX10_TEMP4];

					final md X10_TEMP4 = new md();
					Program.MDSetValue(RX10_TEMP3, RX10_TEMP4, X10_TEMP4);
					}
				}
			}

		final mdRefArray1 RX10_TEMP6 = new mdRefArray1(D, RX10_TEMP3);

		final mdRefArray1 P = RX10_TEMP6;
		Program.md_init(D, P);
		Program.md_run(D, P);
		Program.md_validate(D, P);
		}
public static void md_init ( final Dist1 D, final mdRefArray1 P)		{
					{

			final Region1 RX10_TEMP1 = D.dReg;

			final Point1[] RX10_TEMP2 = RX10_TEMP1.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
				{

				final Point1 X10_TEMP3 = RX10_TEMP2[RX10_TEMP0];

				final int j = X10_TEMP3.f0;

				final Dist1 X10_TEMP2 = D;

				final Region1 RX10_TEMP3 = X10_TEMP2.dReg;

				final int RX10_TEMP4 = Program.searchPointInRegion1(RX10_TEMP3, X10_TEMP3);

				final int RX10_TEMP5 = 0;

				final boolean RX10_TEMP6 = RX10_TEMP4 < RX10_TEMP5;
				if(RX10_TEMP6)
					{

					final String RX10_TEMP7 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
throw new RuntimeException(RX10_TEMP7);

					}

				final Dist SX10_TEMP0 = X10_TEMP2.dDist;

				final int RX10_TEMP8 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);

				final int X10_TEMP4 = RX10_TEMP8;
				//async(X10_TEMP4)
					{

					final Point1 RX10_TEMP9 = new Point1(j);

					final Dist1 RX10_TEMP10 = P.distValue;

					final Region1 RX10_TEMP11 = RX10_TEMP10.dReg;

					final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, RX10_TEMP9);

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

						String RX10_TEMP17 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP17);

						}

					final MDArray RX10_TEMP20 = P.contents;

					final md X10_TEMP7 = Program.MDGetValue(RX10_TEMP20, RX10_TEMP12);

					final int X10_TEMP10 = 4;
					Program.md_initialise(X10_TEMP7, j, X10_TEMP10);
					}
				}
			}
		}
public static void md_run ( final Dist1 D, final mdRefArray1 P)		{

		int n = 0;

		final int X10_TEMP5 = 0;

		final int X10_TEMP3 = 1;

		final int X10_TEMP6 = _md_movemx - X10_TEMP3;

		final Region1 X10_TEMP8 = Program.createNewRegion1R(X10_TEMP5, X10_TEMP6);

		final Point1[] RX10_TEMP2 = X10_TEMP8.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
			{

			final Point1 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

			final int move = RX10_TEMP1.f0;
							{

				final Region1 RX10_TEMP4 = D.dReg;

				final Point1[] RX10_TEMP5 = RX10_TEMP4.pointArray;
				for(int RX10_TEMP3=0; RX10_TEMP3 < RX10_TEMP5.length; RX10_TEMP3++)
					{

					final Point1 X10_TEMP11 = RX10_TEMP5[RX10_TEMP3];

					final int j = X10_TEMP11.f0;

					final Dist1 X10_TEMP10 = D;

					final Region1 RX10_TEMP6 = X10_TEMP10.dReg;

					final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, X10_TEMP11);

					final int RX10_TEMP8 = 0;

					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if(RX10_TEMP9)
						{

						final String RX10_TEMP10 = "Point X10_TEMP11 not found in the distribution X10_TEMP10.";
throw new RuntimeException(RX10_TEMP10);

						}

					final Dist SX10_TEMP0 = X10_TEMP10.dDist;

					final int RX10_TEMP11 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP7);

					final int X10_TEMP12 = RX10_TEMP11;
					//async(X10_TEMP12)
						{

						final Point1 RX10_TEMP12 = new Point1(j);

						final Dist1 RX10_TEMP13 = P.distValue;

						final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;

						final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);

						final int RX10_TEMP16 = 0;

						final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
						if(RX10_TEMP17)
							{

							String RX10_TEMP18 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP18);

							}

						final Dist SX10_TEMP1 = RX10_TEMP13.dDist;

						final int RX10_TEMP19 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP15);

						final int RX10_TEMP21 = 0;

						final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
						if(RX10_TEMP22)
							{

							String RX10_TEMP20 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP20);

							}

						final MDArray RX10_TEMP23 = P.contents;

						final md X10_TEMP14 = Program.MDGetValue(RX10_TEMP23, RX10_TEMP15);
						Program.md_runiters1(X10_TEMP14);
						}
					}
				}
							{

				final Region1 RX10_TEMP25 = D.dReg;

				final Point1[] RX10_TEMP26 = RX10_TEMP25.pointArray;
				for(int RX10_TEMP24=0; RX10_TEMP24 < RX10_TEMP26.length; RX10_TEMP24++)
					{

					final Point1 X10_TEMP17 = RX10_TEMP26[RX10_TEMP24];

					final int j = X10_TEMP17.f0;

					final Dist1 X10_TEMP16 = D;

					final Region1 RX10_TEMP27 = X10_TEMP16.dReg;

					final int RX10_TEMP28 = Program.searchPointInRegion1(RX10_TEMP27, X10_TEMP17);

					final int RX10_TEMP29 = 0;

					final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29;
					if(RX10_TEMP30)
						{

						final String RX10_TEMP31 = "Point X10_TEMP17 not found in the distribution X10_TEMP16.";
throw new RuntimeException(RX10_TEMP31);

						}

					final Dist SX10_TEMP2 = X10_TEMP16.dDist;

					final int RX10_TEMP32 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP28);

					final int X10_TEMP18 = RX10_TEMP32;
					//async(X10_TEMP18)
						{

						final Point1 RX10_TEMP33 = new Point1(j);

						final Dist1 RX10_TEMP34 = P.distValue;

						final Region1 RX10_TEMP35 = RX10_TEMP34.dReg;

						final int RX10_TEMP36 = Program.searchPointInRegion1(RX10_TEMP35, RX10_TEMP33);

						final int RX10_TEMP37 = 0;

						final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
						if(RX10_TEMP38)
							{

							String RX10_TEMP39 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP39);

							}

						final Dist SX10_TEMP3 = RX10_TEMP34.dDist;

						final int RX10_TEMP40 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP36);

						final int RX10_TEMP42 = 0;

						final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
						if(RX10_TEMP43)
							{

							String RX10_TEMP41 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP41);

							}

						final MDArray RX10_TEMP44 = P.contents;

						final md X10_TEMP20 = Program.MDGetValue(RX10_TEMP44, RX10_TEMP36);
						Program.md_runiters2(X10_TEMP20, P);
						}
					}
				}
							{

				final Region1 RX10_TEMP46 = D.dReg;

				final Point1[] RX10_TEMP47 = RX10_TEMP46.pointArray;
				for(int RX10_TEMP45=0; RX10_TEMP45 < RX10_TEMP47.length; RX10_TEMP45++)
					{

					final Point1 X10_TEMP24 = RX10_TEMP47[RX10_TEMP45];

					final int j = X10_TEMP24.f0;

					final Dist1 X10_TEMP23 = D;

					final Region1 RX10_TEMP48 = X10_TEMP23.dReg;

					final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, X10_TEMP24);

					final int RX10_TEMP50 = 0;

					final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;
					if(RX10_TEMP51)
						{

						final String RX10_TEMP52 = "Point X10_TEMP24 not found in the distribution X10_TEMP23.";
throw new RuntimeException(RX10_TEMP52);

						}

					final Dist SX10_TEMP4 = X10_TEMP23.dDist;

					final int RX10_TEMP53 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP49);

					final int X10_TEMP25 = RX10_TEMP53;
					//async(X10_TEMP25)
						{

						final Point1 RX10_TEMP54 = new Point1(j);

						final Dist1 RX10_TEMP55 = P.distValue;

						final Region1 RX10_TEMP56 = RX10_TEMP55.dReg;

						final int RX10_TEMP57 = Program.searchPointInRegion1(RX10_TEMP56, RX10_TEMP54);

						final int RX10_TEMP58 = 0;

						final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58;
						if(RX10_TEMP59)
							{

							String RX10_TEMP60 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP60);

							}

						final Dist SX10_TEMP5 = RX10_TEMP55.dDist;

						final int RX10_TEMP61 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP57);

						final int RX10_TEMP63 = 0;

						final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63;
						if(RX10_TEMP64)
							{

							String RX10_TEMP62 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP62);

							}

						final MDArray RX10_TEMP65 = P.contents;

						final md X10_TEMP27 = Program.MDGetValue(RX10_TEMP65, RX10_TEMP57);
						Program.md_runiters3(X10_TEMP27, move);
						}
					}
				}
			}
		}
public static void md_validate ( final Dist1 D, final mdRefArray1 P)		{
					{

			final Region1 RX10_TEMP1 = D.dReg;

			final Point1[] RX10_TEMP2 = RX10_TEMP1.pointArray;
			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
				{

				final Point1 X10_TEMP3 = RX10_TEMP2[RX10_TEMP0];

				final int j = X10_TEMP3.f0;

				final Dist1 X10_TEMP2 = D;

				final Region1 RX10_TEMP3 = X10_TEMP2.dReg;

				final int RX10_TEMP4 = Program.searchPointInRegion1(RX10_TEMP3, X10_TEMP3);

				final int RX10_TEMP5 = 0;

				final boolean RX10_TEMP6 = RX10_TEMP4 < RX10_TEMP5;
				if(RX10_TEMP6)
					{

					final String RX10_TEMP7 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
throw new RuntimeException(RX10_TEMP7);

					}

				final Dist SX10_TEMP0 = X10_TEMP2.dDist;

				final int RX10_TEMP8 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);

				final int X10_TEMP4 = RX10_TEMP8;
				//async(X10_TEMP4)
					{

					double ref = 275.97175611773514;

					final Point1 RX10_TEMP9 = new Point1(j);

					final Dist1 RX10_TEMP10 = P.distValue;

					final Region1 RX10_TEMP11 = RX10_TEMP10.dReg;

					final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, RX10_TEMP9);

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

						String RX10_TEMP17 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP17);

						}

					final MDArray RX10_TEMP20 = P.contents;

					final md X10_TEMP7 = Program.MDGetValue(RX10_TEMP20, RX10_TEMP12);

					final double X10_TEMP8 = X10_TEMP7.ek;

					final double X10_TEMP10 = X10_TEMP8 - ref;

					double dev = Math.abs(X10_TEMP10);

					final double X10_TEMP12 = 1.0e-12;

					final boolean X10_TEMP14 = dev > X10_TEMP12;
					if(X10_TEMP14)
						{

						final String X10_TEMP15 = "Validation failed at place: ";

						final String X10_TEMP17 = X10_TEMP15 + j;
						System.out.println(X10_TEMP17);

						final String X10_TEMP20 = "Kinetic energy = ";

						final Point1 RX10_TEMP21 = new Point1(j);

						final Dist1 RX10_TEMP22 = P.distValue;

						final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;

						final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, RX10_TEMP21);

						final int RX10_TEMP25 = 0;

						final boolean RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25;
						if(RX10_TEMP26)
							{

							String RX10_TEMP27 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP27);

							}

						final Dist SX10_TEMP2 = RX10_TEMP22.dDist;

						final int RX10_TEMP28 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP24);

						final int RX10_TEMP30 = 0;

						final boolean RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30;
						if(RX10_TEMP31)
							{

							String RX10_TEMP29 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP29);

							}

						final MDArray RX10_TEMP32 = P.contents;

						final md X10_TEMP19 = Program.MDGetValue(RX10_TEMP32, RX10_TEMP24);

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
public static void md_initialise ( final md X10_TEMP0, final int rank0, final int nprocess0)		{

		int X10_TEMP1 = rank0;

		int X10_TEMP2 = nprocess0;

		final int X10_TEMP5 = X10_TEMP1;
		X10_TEMP0.rnk = (X10_TEMP5);

		final int X10_TEMP8 = X10_TEMP2;
		X10_TEMP0.nprocess = (X10_TEMP8);

		final double X10_TEMP11 = 0.0;

		final double X10_TEMP12 = X10_TEMP11;
		X10_TEMP0.vir = (X10_TEMP12);

		final double X10_TEMP15 = 0.0;

		final double X10_TEMP16 = X10_TEMP15;
		X10_TEMP0.epot = (X10_TEMP16);

		final int X10_TEMP19 = 0;

		final int X10_TEMP20 = X10_TEMP19;
		X10_TEMP0.interactions = (X10_TEMP20);

		int mm = 4;

		final int X10_TEMP22 = mm * mm;

		final int X10_TEMP23 = X10_TEMP22 * mm;

		final int X10_TEMP24 = 4;

		int partsize = X10_TEMP23 * X10_TEMP24;

		final int X10_TEMP28 = partsize;
		X10_TEMP0.mdsize = (X10_TEMP28);

		final int X10_TEMP33 = 0;

		final int X10_TEMP30 = X10_TEMP0.mdsize;

		final int X10_TEMP31 = 1;

		final int X10_TEMP34 = X10_TEMP30 - X10_TEMP31;

		final Region1 X10_TEMP35 = Program.createNewRegion1R(X10_TEMP33, X10_TEMP34);

		final int X10_TEMP36 = 0;

		Dist1 dOne = Program.getPlaceDist1(X10_TEMP35, X10_TEMP36);

		final Region1 RX10_TEMP0 = dOne.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = dOne.dDist;

		final PARTICLEArray RX10_TEMP3 = new PARTICLEArray(RX10_TEMP1);

		final ParticleRefArray1 RX10_TEMP4 = new ParticleRefArray1(dOne, RX10_TEMP3);

		final ParticleRefArray1 X10_TEMP40 = RX10_TEMP4;

		final ParticleRefArray1 X10_TEMP41 = X10_TEMP40;
		X10_TEMP0.one = (X10_TEMP41);

		final double X10_TEMP44 = _md_LENGTH;
		X10_TEMP0.l = (X10_TEMP44);

		final double X10_TEMP45 = X10_TEMP0.mdsize;

		final double X10_TEMP47 = X10_TEMP45 / _md_den;

		final double X10_TEMP50 = 0.3333333;

		final double X10_TEMP53 = Math.pow(X10_TEMP47, X10_TEMP50);

		final double X10_TEMP54 = X10_TEMP53;
		X10_TEMP0.side = (X10_TEMP54);

		final double X10_TEMP55 = 4.0;

		final double X10_TEMP58 = mm / X10_TEMP55;

		final double X10_TEMP59 = X10_TEMP58;
		X10_TEMP0.rcoff = (X10_TEMP59);

		final double X10_TEMP60 = X10_TEMP0.side;

		final double X10_TEMP63 = X10_TEMP60 / mm;

		final double X10_TEMP64 = X10_TEMP63;
		X10_TEMP0.a = (X10_TEMP64);

		final double X10_TEMP65 = X10_TEMP0.side;

		final double X10_TEMP66 = 0.5;

		final double X10_TEMP69 = X10_TEMP65 * X10_TEMP66;

		final double X10_TEMP70 = X10_TEMP69;
		X10_TEMP0.sideh = (X10_TEMP70);

		final double X10_TEMP73 = _md_h * _md_h;

		final double X10_TEMP74 = X10_TEMP73;
		X10_TEMP0.hsq = (X10_TEMP74);

		final double X10_TEMP75 = X10_TEMP0.hsq;

		final double X10_TEMP76 = 0.5;

		final double X10_TEMP79 = X10_TEMP75 * X10_TEMP76;

		final double X10_TEMP80 = X10_TEMP79;
		X10_TEMP0.hsq2 = (X10_TEMP80);

		final int X10_TEMP81 = X10_TEMP0.mdsize;

		final int X10_TEMP82 = 1;

		final int X10_TEMP85 = X10_TEMP81 - X10_TEMP82;

		final int X10_TEMP86 = X10_TEMP85;
		X10_TEMP0.npartm = (X10_TEMP86);

		final double X10_TEMP87 = X10_TEMP0.rcoff;

		final double X10_TEMP88 = X10_TEMP0.rcoff;

		final double X10_TEMP91 = X10_TEMP87 * X10_TEMP88;

		final double X10_TEMP92 = X10_TEMP91;
		X10_TEMP0.rcoffs = (X10_TEMP92);

		final double X10_TEMP99 = 16.0;

		final double X10_TEMP93 = 1.0;

		final int X10_TEMP94 = X10_TEMP0.mdsize;

		final double X10_TEMP95 = X10_TEMP93 * X10_TEMP94;

		final double X10_TEMP96 = 1.0;

		final double X10_TEMP98 = X10_TEMP95 - X10_TEMP96;

		final double X10_TEMP102 = X10_TEMP99 / X10_TEMP98;

		final double X10_TEMP103 = X10_TEMP102;
		X10_TEMP0.tscale = (X10_TEMP103);

		final double X10_TEMP107 = 1.13;

		final double X10_TEMP104 = 24.0;

		final double X10_TEMP106 = _md_tref / X10_TEMP104;

		final double X10_TEMP108 = Math.sqrt(X10_TEMP106);

		final double X10_TEMP111 = X10_TEMP107 * X10_TEMP108;

		final double X10_TEMP112 = X10_TEMP111;
		X10_TEMP0.vaver = (X10_TEMP112);

		final double X10_TEMP113 = X10_TEMP0.vaver;

		final double X10_TEMP116 = X10_TEMP113 * _md_h;

		final double X10_TEMP117 = X10_TEMP116;
		X10_TEMP0.vaverh = (X10_TEMP117);

		int ijk = 0;

		final int X10_TEMP121 = 0;

		final int X10_TEMP122 = 1;

		final Region1 X10_TEMP124 = Program.createNewRegion1R(X10_TEMP121, X10_TEMP122);

		final Point1[] RX10_TEMP7 = X10_TEMP124.pointArray;
		for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP7.length; RX10_TEMP5++)
			{

			final Point1 RX10_TEMP6 = RX10_TEMP7[RX10_TEMP5];

			final int lg = RX10_TEMP6.f0;

			final int X10_TEMP128 = 0;

			final int X10_TEMP126 = 1;

			final int X10_TEMP129 = mm - X10_TEMP126;

			final Region1 X10_TEMP131 = Program.createNewRegion1R(X10_TEMP128, X10_TEMP129);

			final Point1[] RX10_TEMP10 = X10_TEMP131.pointArray;
			for(int RX10_TEMP8=0; RX10_TEMP8 < RX10_TEMP10.length; RX10_TEMP8++)
				{

				final Point1 RX10_TEMP9 = RX10_TEMP10[RX10_TEMP8];

				final int i = RX10_TEMP9.f0;

				final int X10_TEMP135 = 0;

				final int X10_TEMP133 = 1;

				final int X10_TEMP136 = mm - X10_TEMP133;

				final Region1 X10_TEMP138 = Program.createNewRegion1R(X10_TEMP135, X10_TEMP136);

				final Point1[] RX10_TEMP13 = X10_TEMP138.pointArray;
				for(int RX10_TEMP11=0; RX10_TEMP11 < RX10_TEMP13.length; RX10_TEMP11++)
					{

					final Point1 RX10_TEMP12 = RX10_TEMP13[RX10_TEMP11];

					final int j = RX10_TEMP12.f0;

					final int X10_TEMP142 = 0;

					final int X10_TEMP140 = 1;

					final int X10_TEMP143 = mm - X10_TEMP140;

					final Region1 X10_TEMP145 = Program.createNewRegion1R(X10_TEMP142, X10_TEMP143);

					final Point1[] RX10_TEMP16 = X10_TEMP145.pointArray;
					for(int RX10_TEMP14=0; RX10_TEMP14 < RX10_TEMP16.length; RX10_TEMP14++)
						{

						final Point1 RX10_TEMP15 = RX10_TEMP16[RX10_TEMP14];

						final int k = RX10_TEMP15.f0;

						final ParticleRefArray1 X10_TEMP146 = X10_TEMP0.one;

						final double X10_TEMP148 = X10_TEMP0.a;

						final double X10_TEMP152 = i * X10_TEMP148;

						final double X10_TEMP149 = X10_TEMP0.a;

						final double X10_TEMP150 = lg * X10_TEMP149;

						final double X10_TEMP151 = 0.5;

						final double X10_TEMP153 = X10_TEMP150 * X10_TEMP151;

						final double X10_TEMP155 = X10_TEMP152 + X10_TEMP153;

						final double X10_TEMP157 = X10_TEMP0.a;

						final double X10_TEMP161 = j * X10_TEMP157;

						final double X10_TEMP158 = X10_TEMP0.a;

						final double X10_TEMP159 = lg * X10_TEMP158;

						final double X10_TEMP160 = 0.5;

						final double X10_TEMP162 = X10_TEMP159 * X10_TEMP160;

						final double X10_TEMP164 = X10_TEMP161 + X10_TEMP162;

						final double X10_TEMP166 = X10_TEMP0.a;

						final double X10_TEMP168 = k * X10_TEMP166;

						double X10_TEMP176 = 0.0;

						double X10_TEMP177 = 0.0;

						double X10_TEMP178 = 0.0;

						double X10_TEMP179 = 0.0;

						double X10_TEMP180 = 0.0;

						double X10_TEMP181 = 0.0;

						final Particle X10_TEMP184 = new Particle(X10_TEMP155, X10_TEMP164, X10_TEMP168, X10_TEMP176, X10_TEMP177, X10_TEMP178, X10_TEMP179, X10_TEMP180, X10_TEMP181);

						final Particle X10_TEMP185 = X10_TEMP184;

						final Point1 RX10_TEMP17 = new Point1(ijk);

						final Dist1 RX10_TEMP18 = X10_TEMP146.distValue;

						final Region1 RX10_TEMP19 = RX10_TEMP18.dReg;

						final int RX10_TEMP20 = Program.searchPointInRegion1(RX10_TEMP19, RX10_TEMP17);

						final int RX10_TEMP21 = 0;

						final boolean RX10_TEMP22 = RX10_TEMP20 < RX10_TEMP21;
						if(RX10_TEMP22)
							{

							String RX10_TEMP23 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP23);

							}

						final Dist SX10_TEMP0 = RX10_TEMP18.dDist;

						final int RX10_TEMP24 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP20);

						final int RX10_TEMP26 = 0;

						final boolean RX10_TEMP27 = RX10_TEMP24 != RX10_TEMP26;
						if(RX10_TEMP27)
							{

							String RX10_TEMP25 = "Bad place access for array X10_TEMP146";
throw new RuntimeException(RX10_TEMP25);

							}

						final PARTICLEArray RX10_TEMP28 = X10_TEMP146.contents;
						Program.PARTICLESetValue(RX10_TEMP28, RX10_TEMP20, X10_TEMP185);

						final int X10_TEMP186 = 1;

						final int X10_TEMP188 = ijk + X10_TEMP186;

						ijk = X10_TEMP188;
						}
					}
				}
			}

		final int X10_TEMP191 = 1;

		final int X10_TEMP192 = 2;

		final Region1 X10_TEMP194 = Program.createNewRegion1R(X10_TEMP191, X10_TEMP192);

		final Point1[] RX10_TEMP31 = X10_TEMP194.pointArray;
		for(int RX10_TEMP29=0; RX10_TEMP29 < RX10_TEMP31.length; RX10_TEMP29++)
			{

			final Point1 RX10_TEMP30 = RX10_TEMP31[RX10_TEMP29];

			final int lg = RX10_TEMP30.f0;

			final int X10_TEMP198 = 0;

			final int X10_TEMP196 = 1;

			final int X10_TEMP199 = mm - X10_TEMP196;

			final Region1 X10_TEMP201 = Program.createNewRegion1R(X10_TEMP198, X10_TEMP199);

			final Point1[] RX10_TEMP34 = X10_TEMP201.pointArray;
			for(int RX10_TEMP32=0; RX10_TEMP32 < RX10_TEMP34.length; RX10_TEMP32++)
				{

				final Point1 RX10_TEMP33 = RX10_TEMP34[RX10_TEMP32];

				final int i = RX10_TEMP33.f0;

				final int X10_TEMP205 = 0;

				final int X10_TEMP203 = 1;

				final int X10_TEMP206 = mm - X10_TEMP203;

				final Region1 X10_TEMP208 = Program.createNewRegion1R(X10_TEMP205, X10_TEMP206);

				final Point1[] RX10_TEMP37 = X10_TEMP208.pointArray;
				for(int RX10_TEMP35=0; RX10_TEMP35 < RX10_TEMP37.length; RX10_TEMP35++)
					{

					final Point1 RX10_TEMP36 = RX10_TEMP37[RX10_TEMP35];

					final int j = RX10_TEMP36.f0;

					final int X10_TEMP212 = 0;

					final int X10_TEMP210 = 1;

					final int X10_TEMP213 = mm - X10_TEMP210;

					final Region1 X10_TEMP215 = Program.createNewRegion1R(X10_TEMP212, X10_TEMP213);

					final Point1[] RX10_TEMP40 = X10_TEMP215.pointArray;
					for(int RX10_TEMP38=0; RX10_TEMP38 < RX10_TEMP40.length; RX10_TEMP38++)
						{

						final Point1 RX10_TEMP39 = RX10_TEMP40[RX10_TEMP38];

						final int k = RX10_TEMP39.f0;

						final ParticleRefArray1 X10_TEMP216 = X10_TEMP0.one;

						final double X10_TEMP218 = X10_TEMP0.a;

						final double X10_TEMP225 = i * X10_TEMP218;

						final int X10_TEMP219 = 2;

						final int X10_TEMP221 = X10_TEMP219 - lg;

						final double X10_TEMP222 = X10_TEMP0.a;

						final double X10_TEMP223 = X10_TEMP221 * X10_TEMP222;

						final double X10_TEMP224 = 0.5;

						final double X10_TEMP226 = X10_TEMP223 * X10_TEMP224;

						final double X10_TEMP228 = X10_TEMP225 + X10_TEMP226;

						final double X10_TEMP230 = X10_TEMP0.a;

						final double X10_TEMP237 = j * X10_TEMP230;

						final int X10_TEMP231 = 1;

						final int X10_TEMP233 = lg - X10_TEMP231;

						final double X10_TEMP234 = X10_TEMP0.a;

						final double X10_TEMP235 = X10_TEMP233 * X10_TEMP234;

						final double X10_TEMP236 = 0.5;

						final double X10_TEMP238 = X10_TEMP235 * X10_TEMP236;

						final double X10_TEMP240 = X10_TEMP237 + X10_TEMP238;

						final double X10_TEMP242 = X10_TEMP0.a;

						final double X10_TEMP245 = k * X10_TEMP242;

						final double X10_TEMP243 = X10_TEMP0.a;

						final double X10_TEMP244 = 0.5;

						final double X10_TEMP246 = X10_TEMP243 * X10_TEMP244;

						final double X10_TEMP248 = X10_TEMP245 + X10_TEMP246;

						double X10_TEMP256 = 0.0;

						double X10_TEMP257 = 0.0;

						double X10_TEMP258 = 0.0;

						double X10_TEMP259 = 0.0;

						double X10_TEMP260 = 0.0;

						double X10_TEMP261 = 0.0;

						final Particle X10_TEMP264 = new Particle(X10_TEMP228, X10_TEMP240, X10_TEMP248, X10_TEMP256, X10_TEMP257, X10_TEMP258, X10_TEMP259, X10_TEMP260, X10_TEMP261);

						final Particle X10_TEMP265 = X10_TEMP264;

						final Point1 RX10_TEMP41 = new Point1(ijk);

						final Dist1 RX10_TEMP42 = X10_TEMP216.distValue;

						final Region1 RX10_TEMP43 = RX10_TEMP42.dReg;

						final int RX10_TEMP44 = Program.searchPointInRegion1(RX10_TEMP43, RX10_TEMP41);

						final int RX10_TEMP45 = 0;

						final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45;
						if(RX10_TEMP46)
							{

							String RX10_TEMP47 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP47);

							}

						final Dist SX10_TEMP1 = RX10_TEMP42.dDist;

						final int RX10_TEMP48 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP44);

						final int RX10_TEMP50 = 0;

						final boolean RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50;
						if(RX10_TEMP51)
							{

							String RX10_TEMP49 = "Bad place access for array X10_TEMP216";
throw new RuntimeException(RX10_TEMP49);

							}

						final PARTICLEArray RX10_TEMP52 = X10_TEMP216.contents;
						Program.PARTICLESetValue(RX10_TEMP52, RX10_TEMP44, X10_TEMP265);

						final int X10_TEMP266 = 1;

						final int X10_TEMP268 = ijk + X10_TEMP266;

						ijk = X10_TEMP268;
						}
					}
				}
			}

		int iseed = 0;

		double v1 = 0.0;

		double v2 = 0.0;

		Random randnum = new Random(iseed, v1, v2);

		double r = 0.0;

		int k = 0;

		final int X10_TEMP278 = X10_TEMP0.mdsize;

		boolean X10_TEMP282 = k < X10_TEMP278;
		while(X10_TEMP282)
			{

			final double X10_TEMP284 = Program.Random_seed(randnum);

			r = X10_TEMP284;

			final ParticleRefArray1 X10_TEMP285 = X10_TEMP0.one;

			final Point1 RX10_TEMP53 = new Point1(k);

			final Dist1 RX10_TEMP54 = X10_TEMP285.distValue;

			final Region1 RX10_TEMP55 = RX10_TEMP54.dReg;

			final int RX10_TEMP56 = Program.searchPointInRegion1(RX10_TEMP55, RX10_TEMP53);

			final int RX10_TEMP57 = 0;

			final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
			if(RX10_TEMP58)
				{

				String RX10_TEMP59 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP59);

				}

			final Dist SX10_TEMP2 = RX10_TEMP54.dDist;

			final int RX10_TEMP60 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP56);

			final int RX10_TEMP62 = 0;

			final boolean RX10_TEMP63 = RX10_TEMP60 != RX10_TEMP62;
			if(RX10_TEMP63)
				{

				String RX10_TEMP61 = "Bad place access for array X10_TEMP285";
throw new RuntimeException(RX10_TEMP61);

				}

			final PARTICLEArray RX10_TEMP64 = X10_TEMP285.contents;

			final Particle X10_TEMP287 = Program.PARTICLEGetValue(RX10_TEMP64, RX10_TEMP56);

			final double X10_TEMP288 = randnum.v1;

			final double X10_TEMP291 = r * X10_TEMP288;

			final double X10_TEMP292 = X10_TEMP291;
			X10_TEMP287.xvelocity = (X10_TEMP292);

			final ParticleRefArray1 X10_TEMP293 = X10_TEMP0.one;

			final int X10_TEMP294 = 1;

			final int X10_TEMP296 = k + X10_TEMP294;

			final Point1 RX10_TEMP65 = new Point1(X10_TEMP296);

			final Dist1 RX10_TEMP66 = X10_TEMP293.distValue;

			final Region1 RX10_TEMP67 = RX10_TEMP66.dReg;

			final int RX10_TEMP68 = Program.searchPointInRegion1(RX10_TEMP67, RX10_TEMP65);

			final int RX10_TEMP69 = 0;

			final boolean RX10_TEMP70 = RX10_TEMP68 < RX10_TEMP69;
			if(RX10_TEMP70)
				{

				String RX10_TEMP71 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP71);

				}

			final Dist SX10_TEMP3 = RX10_TEMP66.dDist;

			final int RX10_TEMP72 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP68);

			final int RX10_TEMP74 = 0;

			final boolean RX10_TEMP75 = RX10_TEMP72 != RX10_TEMP74;
			if(RX10_TEMP75)
				{

				String RX10_TEMP73 = "Bad place access for array X10_TEMP293";
throw new RuntimeException(RX10_TEMP73);

				}

			final PARTICLEArray RX10_TEMP76 = X10_TEMP293.contents;

			final Particle X10_TEMP297 = Program.PARTICLEGetValue(RX10_TEMP76, RX10_TEMP68);

			final double X10_TEMP298 = randnum.v2;

			final double X10_TEMP301 = r * X10_TEMP298;

			final double X10_TEMP302 = X10_TEMP301;
			X10_TEMP297.xvelocity = (X10_TEMP302);

			final int X10_TEMP304 = 2;

			k = k + X10_TEMP304;

			final int X10_TEMP280 = X10_TEMP0.mdsize;

			X10_TEMP282 = k < X10_TEMP280;
			}

		final int X10_TEMP306 = 0;

		k = X10_TEMP306;

		final int X10_TEMP307 = X10_TEMP0.mdsize;

		boolean X10_TEMP311 = k < X10_TEMP307;
		while(X10_TEMP311)
			{

			final double X10_TEMP313 = Program.Random_seed(randnum);

			r = X10_TEMP313;

			final ParticleRefArray1 X10_TEMP314 = X10_TEMP0.one;

			final Point1 RX10_TEMP77 = new Point1(k);

			final Dist1 RX10_TEMP78 = X10_TEMP314.distValue;

			final Region1 RX10_TEMP79 = RX10_TEMP78.dReg;

			final int RX10_TEMP80 = Program.searchPointInRegion1(RX10_TEMP79, RX10_TEMP77);

			final int RX10_TEMP81 = 0;

			final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81;
			if(RX10_TEMP82)
				{

				String RX10_TEMP83 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP83);

				}

			final Dist SX10_TEMP4 = RX10_TEMP78.dDist;

			final int RX10_TEMP84 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP80);

			final int RX10_TEMP86 = 0;

			final boolean RX10_TEMP87 = RX10_TEMP84 != RX10_TEMP86;
			if(RX10_TEMP87)
				{

				String RX10_TEMP85 = "Bad place access for array X10_TEMP314";
throw new RuntimeException(RX10_TEMP85);

				}

			final PARTICLEArray RX10_TEMP88 = X10_TEMP314.contents;

			final Particle X10_TEMP316 = Program.PARTICLEGetValue(RX10_TEMP88, RX10_TEMP80);

			final double X10_TEMP317 = randnum.v1;

			final double X10_TEMP320 = r * X10_TEMP317;

			final double X10_TEMP321 = X10_TEMP320;
			X10_TEMP316.yvelocity = (X10_TEMP321);

			final ParticleRefArray1 X10_TEMP322 = X10_TEMP0.one;

			final int X10_TEMP323 = 1;

			final int X10_TEMP325 = k + X10_TEMP323;

			final Point1 RX10_TEMP89 = new Point1(X10_TEMP325);

			final Dist1 RX10_TEMP90 = X10_TEMP322.distValue;

			final Region1 RX10_TEMP91 = RX10_TEMP90.dReg;

			final int RX10_TEMP92 = Program.searchPointInRegion1(RX10_TEMP91, RX10_TEMP89);

			final int RX10_TEMP93 = 0;

			final boolean RX10_TEMP94 = RX10_TEMP92 < RX10_TEMP93;
			if(RX10_TEMP94)
				{

				String RX10_TEMP95 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP95);

				}

			final Dist SX10_TEMP5 = RX10_TEMP90.dDist;

			final int RX10_TEMP96 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP92);

			final int RX10_TEMP98 = 0;

			final boolean RX10_TEMP99 = RX10_TEMP96 != RX10_TEMP98;
			if(RX10_TEMP99)
				{

				String RX10_TEMP97 = "Bad place access for array X10_TEMP322";
throw new RuntimeException(RX10_TEMP97);

				}

			final PARTICLEArray RX10_TEMP100 = X10_TEMP322.contents;

			final Particle X10_TEMP326 = Program.PARTICLEGetValue(RX10_TEMP100, RX10_TEMP92);

			final double X10_TEMP327 = randnum.v2;

			final double X10_TEMP330 = r * X10_TEMP327;

			final double X10_TEMP331 = X10_TEMP330;
			X10_TEMP326.yvelocity = (X10_TEMP331);

			final int X10_TEMP333 = 2;

			k = k + X10_TEMP333;

			final int X10_TEMP309 = X10_TEMP0.mdsize;

			X10_TEMP311 = k < X10_TEMP309;
			}

		final int X10_TEMP335 = 0;

		k = X10_TEMP335;

		final int X10_TEMP336 = X10_TEMP0.mdsize;

		boolean X10_TEMP340 = k < X10_TEMP336;
		while(X10_TEMP340)
			{

			final double X10_TEMP342 = Program.Random_seed(randnum);

			r = X10_TEMP342;

			final ParticleRefArray1 X10_TEMP343 = X10_TEMP0.one;

			final Point1 RX10_TEMP101 = new Point1(k);

			final Dist1 RX10_TEMP102 = X10_TEMP343.distValue;

			final Region1 RX10_TEMP103 = RX10_TEMP102.dReg;

			final int RX10_TEMP104 = Program.searchPointInRegion1(RX10_TEMP103, RX10_TEMP101);

			final int RX10_TEMP105 = 0;

			final boolean RX10_TEMP106 = RX10_TEMP104 < RX10_TEMP105;
			if(RX10_TEMP106)
				{

				String RX10_TEMP107 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP107);

				}

			final Dist SX10_TEMP6 = RX10_TEMP102.dDist;

			final int RX10_TEMP108 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP104);

			final int RX10_TEMP110 = 0;

			final boolean RX10_TEMP111 = RX10_TEMP108 != RX10_TEMP110;
			if(RX10_TEMP111)
				{

				String RX10_TEMP109 = "Bad place access for array X10_TEMP343";
throw new RuntimeException(RX10_TEMP109);

				}

			final PARTICLEArray RX10_TEMP112 = X10_TEMP343.contents;

			final Particle X10_TEMP345 = Program.PARTICLEGetValue(RX10_TEMP112, RX10_TEMP104);

			final double X10_TEMP346 = randnum.v1;

			final double X10_TEMP349 = r * X10_TEMP346;

			final double X10_TEMP350 = X10_TEMP349;
			X10_TEMP345.zvelocity = (X10_TEMP350);

			final ParticleRefArray1 X10_TEMP351 = X10_TEMP0.one;

			final int X10_TEMP352 = 1;

			final int X10_TEMP354 = k + X10_TEMP352;

			final Point1 RX10_TEMP113 = new Point1(X10_TEMP354);

			final Dist1 RX10_TEMP114 = X10_TEMP351.distValue;

			final Region1 RX10_TEMP115 = RX10_TEMP114.dReg;

			final int RX10_TEMP116 = Program.searchPointInRegion1(RX10_TEMP115, RX10_TEMP113);

			final int RX10_TEMP117 = 0;

			final boolean RX10_TEMP118 = RX10_TEMP116 < RX10_TEMP117;
			if(RX10_TEMP118)
				{

				String RX10_TEMP119 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP119);

				}

			final Dist SX10_TEMP7 = RX10_TEMP114.dDist;

			final int RX10_TEMP120 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP116);

			final int RX10_TEMP122 = 0;

			final boolean RX10_TEMP123 = RX10_TEMP120 != RX10_TEMP122;
			if(RX10_TEMP123)
				{

				String RX10_TEMP121 = "Bad place access for array X10_TEMP351";
throw new RuntimeException(RX10_TEMP121);

				}

			final PARTICLEArray RX10_TEMP124 = X10_TEMP351.contents;

			final Particle X10_TEMP355 = Program.PARTICLEGetValue(RX10_TEMP124, RX10_TEMP116);

			final double X10_TEMP356 = randnum.v2;

			final double X10_TEMP359 = r * X10_TEMP356;

			final double X10_TEMP360 = X10_TEMP359;
			X10_TEMP355.zvelocity = (X10_TEMP360);

			final int X10_TEMP362 = 2;

			k = k + X10_TEMP362;

			final int X10_TEMP338 = X10_TEMP0.mdsize;

			X10_TEMP340 = k < X10_TEMP338;
			}

		final double X10_TEMP365 = 0.0;

		final double X10_TEMP366 = X10_TEMP365;
		X10_TEMP0.ekin = (X10_TEMP366);

		double sp = 0.0;

		final int X10_TEMP372 = 0;

		final int X10_TEMP369 = X10_TEMP0.mdsize;

		final int X10_TEMP370 = 1;

		final int X10_TEMP373 = X10_TEMP369 - X10_TEMP370;

		final Region1 X10_TEMP375 = Program.createNewRegion1R(X10_TEMP372, X10_TEMP373);

		final Point1[] RX10_TEMP127 = X10_TEMP375.pointArray;
		for(int RX10_TEMP125=0; RX10_TEMP125 < RX10_TEMP127.length; RX10_TEMP125++)
			{

			final Point1 RX10_TEMP126 = RX10_TEMP127[RX10_TEMP125];

			final int i = RX10_TEMP126.f0;

			final ParticleRefArray1 X10_TEMP376 = X10_TEMP0.one;

			final Point1 RX10_TEMP128 = new Point1(i);

			final Dist1 RX10_TEMP129 = X10_TEMP376.distValue;

			final Region1 RX10_TEMP130 = RX10_TEMP129.dReg;

			final int RX10_TEMP131 = Program.searchPointInRegion1(RX10_TEMP130, RX10_TEMP128);

			final int RX10_TEMP132 = 0;

			final boolean RX10_TEMP133 = RX10_TEMP131 < RX10_TEMP132;
			if(RX10_TEMP133)
				{

				String RX10_TEMP134 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP134);

				}

			final Dist SX10_TEMP8 = RX10_TEMP129.dDist;

			final int RX10_TEMP135 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP131);

			final int RX10_TEMP137 = 0;

			final boolean RX10_TEMP138 = RX10_TEMP135 != RX10_TEMP137;
			if(RX10_TEMP138)
				{

				String RX10_TEMP136 = "Bad place access for array X10_TEMP376";
throw new RuntimeException(RX10_TEMP136);

				}

			final PARTICLEArray RX10_TEMP139 = X10_TEMP376.contents;

			final Particle X10_TEMP378 = Program.PARTICLEGetValue(RX10_TEMP139, RX10_TEMP131);

			final double X10_TEMP379 = X10_TEMP378.xvelocity;

			final double X10_TEMP381 = sp + X10_TEMP379;

			sp = X10_TEMP381;
			}

		final int X10_TEMP382 = X10_TEMP0.mdsize;

		final double X10_TEMP384 = sp / X10_TEMP382;

		sp = X10_TEMP384;

		final int X10_TEMP389 = 0;

		final int X10_TEMP386 = X10_TEMP0.mdsize;

		final int X10_TEMP387 = 1;

		final int X10_TEMP390 = X10_TEMP386 - X10_TEMP387;

		final Region1 X10_TEMP392 = Program.createNewRegion1R(X10_TEMP389, X10_TEMP390);

		final Point1[] RX10_TEMP142 = X10_TEMP392.pointArray;
		for(int RX10_TEMP140=0; RX10_TEMP140 < RX10_TEMP142.length; RX10_TEMP140++)
			{

			final Point1 RX10_TEMP141 = RX10_TEMP142[RX10_TEMP140];

			final int i = RX10_TEMP141.f0;

			final ParticleRefArray1 X10_TEMP393 = X10_TEMP0.one;

			final Point1 RX10_TEMP143 = new Point1(i);

			final Dist1 RX10_TEMP144 = X10_TEMP393.distValue;

			final Region1 RX10_TEMP145 = RX10_TEMP144.dReg;

			final int RX10_TEMP146 = Program.searchPointInRegion1(RX10_TEMP145, RX10_TEMP143);

			final int RX10_TEMP147 = 0;

			final boolean RX10_TEMP148 = RX10_TEMP146 < RX10_TEMP147;
			if(RX10_TEMP148)
				{

				String RX10_TEMP149 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP149);

				}

			final Dist SX10_TEMP9 = RX10_TEMP144.dDist;

			final int RX10_TEMP150 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP146);

			final int RX10_TEMP152 = 0;

			final boolean RX10_TEMP153 = RX10_TEMP150 != RX10_TEMP152;
			if(RX10_TEMP153)
				{

				String RX10_TEMP151 = "Bad place access for array X10_TEMP393";
throw new RuntimeException(RX10_TEMP151);

				}

			final PARTICLEArray RX10_TEMP154 = X10_TEMP393.contents;

			final Particle X10_TEMP395 = Program.PARTICLEGetValue(RX10_TEMP154, RX10_TEMP146);

			final ParticleRefArray1 X10_TEMP396 = X10_TEMP0.one;

			final Point1 RX10_TEMP155 = new Point1(i);

			final Dist1 RX10_TEMP156 = X10_TEMP396.distValue;

			final Region1 RX10_TEMP157 = RX10_TEMP156.dReg;

			final int RX10_TEMP158 = Program.searchPointInRegion1(RX10_TEMP157, RX10_TEMP155);

			final int RX10_TEMP159 = 0;

			final boolean RX10_TEMP160 = RX10_TEMP158 < RX10_TEMP159;
			if(RX10_TEMP160)
				{

				String RX10_TEMP161 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP161);

				}

			final Dist SX10_TEMP10 = RX10_TEMP156.dDist;

			final int RX10_TEMP162 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP158);

			final int RX10_TEMP164 = 0;

			final boolean RX10_TEMP165 = RX10_TEMP162 != RX10_TEMP164;
			if(RX10_TEMP165)
				{

				String RX10_TEMP163 = "Bad place access for array X10_TEMP396";
throw new RuntimeException(RX10_TEMP163);

				}

			final PARTICLEArray RX10_TEMP166 = X10_TEMP396.contents;

			final Particle X10_TEMP398 = Program.PARTICLEGetValue(RX10_TEMP166, RX10_TEMP158);

			final double X10_TEMP399 = X10_TEMP398.xvelocity;

			final double X10_TEMP402 = X10_TEMP399 - sp;

			final double X10_TEMP403 = X10_TEMP402;
			X10_TEMP395.xvelocity = (X10_TEMP403);

			final double X10_TEMP412 = X10_TEMP0.ekin;

			final ParticleRefArray1 X10_TEMP404 = X10_TEMP0.one;

			final Point1 RX10_TEMP167 = new Point1(i);

			final Dist1 RX10_TEMP168 = X10_TEMP404.distValue;

			final Region1 RX10_TEMP169 = RX10_TEMP168.dReg;

			final int RX10_TEMP170 = Program.searchPointInRegion1(RX10_TEMP169, RX10_TEMP167);

			final int RX10_TEMP171 = 0;

			final boolean RX10_TEMP172 = RX10_TEMP170 < RX10_TEMP171;
			if(RX10_TEMP172)
				{

				String RX10_TEMP173 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP173);

				}

			final Dist SX10_TEMP11 = RX10_TEMP168.dDist;

			final int RX10_TEMP174 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP170);

			final int RX10_TEMP176 = 0;

			final boolean RX10_TEMP177 = RX10_TEMP174 != RX10_TEMP176;
			if(RX10_TEMP177)
				{

				String RX10_TEMP175 = "Bad place access for array X10_TEMP404";
throw new RuntimeException(RX10_TEMP175);

				}

			final PARTICLEArray RX10_TEMP178 = X10_TEMP404.contents;

			final Particle X10_TEMP406 = Program.PARTICLEGetValue(RX10_TEMP178, RX10_TEMP170);

			final double X10_TEMP410 = X10_TEMP406.xvelocity;

			final ParticleRefArray1 X10_TEMP407 = X10_TEMP0.one;

			final Point1 RX10_TEMP179 = new Point1(i);

			final Dist1 RX10_TEMP180 = X10_TEMP407.distValue;

			final Region1 RX10_TEMP181 = RX10_TEMP180.dReg;

			final int RX10_TEMP182 = Program.searchPointInRegion1(RX10_TEMP181, RX10_TEMP179);

			final int RX10_TEMP183 = 0;

			final boolean RX10_TEMP184 = RX10_TEMP182 < RX10_TEMP183;
			if(RX10_TEMP184)
				{

				String RX10_TEMP185 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP185);

				}

			final Dist SX10_TEMP12 = RX10_TEMP180.dDist;

			final int RX10_TEMP186 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP182);

			final int RX10_TEMP188 = 0;

			final boolean RX10_TEMP189 = RX10_TEMP186 != RX10_TEMP188;
			if(RX10_TEMP189)
				{

				String RX10_TEMP187 = "Bad place access for array X10_TEMP407";
throw new RuntimeException(RX10_TEMP187);

				}

			final PARTICLEArray RX10_TEMP190 = X10_TEMP407.contents;

			final Particle X10_TEMP409 = Program.PARTICLEGetValue(RX10_TEMP190, RX10_TEMP182);

			final double X10_TEMP411 = X10_TEMP409.xvelocity;

			final double X10_TEMP413 = X10_TEMP410 * X10_TEMP411;

			final double X10_TEMP416 = X10_TEMP412 + X10_TEMP413;

			final double X10_TEMP417 = X10_TEMP416;
			X10_TEMP0.ekin = (X10_TEMP417);
			}

		final double X10_TEMP419 = 0.0;

		sp = X10_TEMP419;

		final int X10_TEMP424 = 0;

		final int X10_TEMP421 = X10_TEMP0.mdsize;

		final int X10_TEMP422 = 1;

		final int X10_TEMP425 = X10_TEMP421 - X10_TEMP422;

		final Region1 X10_TEMP427 = Program.createNewRegion1R(X10_TEMP424, X10_TEMP425);

		final Point1[] RX10_TEMP193 = X10_TEMP427.pointArray;
		for(int RX10_TEMP191=0; RX10_TEMP191 < RX10_TEMP193.length; RX10_TEMP191++)
			{

			final Point1 RX10_TEMP192 = RX10_TEMP193[RX10_TEMP191];

			final int i = RX10_TEMP192.f0;

			final ParticleRefArray1 X10_TEMP428 = X10_TEMP0.one;

			final Point1 RX10_TEMP194 = new Point1(i);

			final Dist1 RX10_TEMP195 = X10_TEMP428.distValue;

			final Region1 RX10_TEMP196 = RX10_TEMP195.dReg;

			final int RX10_TEMP197 = Program.searchPointInRegion1(RX10_TEMP196, RX10_TEMP194);

			final int RX10_TEMP198 = 0;

			final boolean RX10_TEMP199 = RX10_TEMP197 < RX10_TEMP198;
			if(RX10_TEMP199)
				{

				String RX10_TEMP200 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP200);

				}

			final Dist SX10_TEMP13 = RX10_TEMP195.dDist;

			final int RX10_TEMP201 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP197);

			final int RX10_TEMP203 = 0;

			final boolean RX10_TEMP204 = RX10_TEMP201 != RX10_TEMP203;
			if(RX10_TEMP204)
				{

				String RX10_TEMP202 = "Bad place access for array X10_TEMP428";
throw new RuntimeException(RX10_TEMP202);

				}

			final PARTICLEArray RX10_TEMP205 = X10_TEMP428.contents;

			final Particle X10_TEMP430 = Program.PARTICLEGetValue(RX10_TEMP205, RX10_TEMP197);

			final double X10_TEMP431 = X10_TEMP430.yvelocity;

			final double X10_TEMP433 = sp + X10_TEMP431;

			sp = X10_TEMP433;
			}

		final int X10_TEMP434 = X10_TEMP0.mdsize;

		final double X10_TEMP436 = sp / X10_TEMP434;

		sp = X10_TEMP436;

		final int X10_TEMP441 = 0;

		final int X10_TEMP438 = X10_TEMP0.mdsize;

		final int X10_TEMP439 = 1;

		final int X10_TEMP442 = X10_TEMP438 - X10_TEMP439;

		final Region1 X10_TEMP444 = Program.createNewRegion1R(X10_TEMP441, X10_TEMP442);

		final Point1[] RX10_TEMP208 = X10_TEMP444.pointArray;
		for(int RX10_TEMP206=0; RX10_TEMP206 < RX10_TEMP208.length; RX10_TEMP206++)
			{

			final Point1 RX10_TEMP207 = RX10_TEMP208[RX10_TEMP206];

			final int i = RX10_TEMP207.f0;

			final ParticleRefArray1 X10_TEMP445 = X10_TEMP0.one;

			final Point1 RX10_TEMP209 = new Point1(i);

			final Dist1 RX10_TEMP210 = X10_TEMP445.distValue;

			final Region1 RX10_TEMP211 = RX10_TEMP210.dReg;

			final int RX10_TEMP212 = Program.searchPointInRegion1(RX10_TEMP211, RX10_TEMP209);

			final int RX10_TEMP213 = 0;

			final boolean RX10_TEMP214 = RX10_TEMP212 < RX10_TEMP213;
			if(RX10_TEMP214)
				{

				String RX10_TEMP215 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP215);

				}

			final Dist SX10_TEMP14 = RX10_TEMP210.dDist;

			final int RX10_TEMP216 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP212);

			final int RX10_TEMP218 = 0;

			final boolean RX10_TEMP219 = RX10_TEMP216 != RX10_TEMP218;
			if(RX10_TEMP219)
				{

				String RX10_TEMP217 = "Bad place access for array X10_TEMP445";
throw new RuntimeException(RX10_TEMP217);

				}

			final PARTICLEArray RX10_TEMP220 = X10_TEMP445.contents;

			final Particle X10_TEMP447 = Program.PARTICLEGetValue(RX10_TEMP220, RX10_TEMP212);

			final ParticleRefArray1 X10_TEMP448 = X10_TEMP0.one;

			final Point1 RX10_TEMP221 = new Point1(i);

			final Dist1 RX10_TEMP222 = X10_TEMP448.distValue;

			final Region1 RX10_TEMP223 = RX10_TEMP222.dReg;

			final int RX10_TEMP224 = Program.searchPointInRegion1(RX10_TEMP223, RX10_TEMP221);

			final int RX10_TEMP225 = 0;

			final boolean RX10_TEMP226 = RX10_TEMP224 < RX10_TEMP225;
			if(RX10_TEMP226)
				{

				String RX10_TEMP227 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP227);

				}

			final Dist SX10_TEMP15 = RX10_TEMP222.dDist;

			final int RX10_TEMP228 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP224);

			final int RX10_TEMP230 = 0;

			final boolean RX10_TEMP231 = RX10_TEMP228 != RX10_TEMP230;
			if(RX10_TEMP231)
				{

				String RX10_TEMP229 = "Bad place access for array X10_TEMP448";
throw new RuntimeException(RX10_TEMP229);

				}

			final PARTICLEArray RX10_TEMP232 = X10_TEMP448.contents;

			final Particle X10_TEMP450 = Program.PARTICLEGetValue(RX10_TEMP232, RX10_TEMP224);

			final double X10_TEMP451 = X10_TEMP450.yvelocity;

			final double X10_TEMP454 = X10_TEMP451 - sp;

			final double X10_TEMP455 = X10_TEMP454;
			X10_TEMP447.yvelocity = (X10_TEMP455);

			final double X10_TEMP464 = X10_TEMP0.ekin;

			final ParticleRefArray1 X10_TEMP456 = X10_TEMP0.one;

			final Point1 RX10_TEMP233 = new Point1(i);

			final Dist1 RX10_TEMP234 = X10_TEMP456.distValue;

			final Region1 RX10_TEMP235 = RX10_TEMP234.dReg;

			final int RX10_TEMP236 = Program.searchPointInRegion1(RX10_TEMP235, RX10_TEMP233);

			final int RX10_TEMP237 = 0;

			final boolean RX10_TEMP238 = RX10_TEMP236 < RX10_TEMP237;
			if(RX10_TEMP238)
				{

				String RX10_TEMP239 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP239);

				}

			final Dist SX10_TEMP16 = RX10_TEMP234.dDist;

			final int RX10_TEMP240 = Program.getPlaceFromDist(SX10_TEMP16, RX10_TEMP236);

			final int RX10_TEMP242 = 0;

			final boolean RX10_TEMP243 = RX10_TEMP240 != RX10_TEMP242;
			if(RX10_TEMP243)
				{

				String RX10_TEMP241 = "Bad place access for array X10_TEMP456";
throw new RuntimeException(RX10_TEMP241);

				}

			final PARTICLEArray RX10_TEMP244 = X10_TEMP456.contents;

			final Particle X10_TEMP458 = Program.PARTICLEGetValue(RX10_TEMP244, RX10_TEMP236);

			final double X10_TEMP462 = X10_TEMP458.yvelocity;

			final ParticleRefArray1 X10_TEMP459 = X10_TEMP0.one;

			final Point1 RX10_TEMP245 = new Point1(i);

			final Dist1 RX10_TEMP246 = X10_TEMP459.distValue;

			final Region1 RX10_TEMP247 = RX10_TEMP246.dReg;

			final int RX10_TEMP248 = Program.searchPointInRegion1(RX10_TEMP247, RX10_TEMP245);

			final int RX10_TEMP249 = 0;

			final boolean RX10_TEMP250 = RX10_TEMP248 < RX10_TEMP249;
			if(RX10_TEMP250)
				{

				String RX10_TEMP251 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP251);

				}

			final Dist SX10_TEMP17 = RX10_TEMP246.dDist;

			final int RX10_TEMP252 = Program.getPlaceFromDist(SX10_TEMP17, RX10_TEMP248);

			final int RX10_TEMP254 = 0;

			final boolean RX10_TEMP255 = RX10_TEMP252 != RX10_TEMP254;
			if(RX10_TEMP255)
				{

				String RX10_TEMP253 = "Bad place access for array X10_TEMP459";
throw new RuntimeException(RX10_TEMP253);

				}

			final PARTICLEArray RX10_TEMP256 = X10_TEMP459.contents;

			final Particle X10_TEMP461 = Program.PARTICLEGetValue(RX10_TEMP256, RX10_TEMP248);

			final double X10_TEMP463 = X10_TEMP461.yvelocity;

			final double X10_TEMP465 = X10_TEMP462 * X10_TEMP463;

			final double X10_TEMP468 = X10_TEMP464 + X10_TEMP465;

			final double X10_TEMP469 = X10_TEMP468;
			X10_TEMP0.ekin = (X10_TEMP469);
			}

		final double X10_TEMP471 = 0.0;

		sp = X10_TEMP471;

		final int X10_TEMP476 = 0;

		final int X10_TEMP473 = X10_TEMP0.mdsize;

		final int X10_TEMP474 = 1;

		final int X10_TEMP477 = X10_TEMP473 - X10_TEMP474;

		final Region1 X10_TEMP479 = Program.createNewRegion1R(X10_TEMP476, X10_TEMP477);

		final Point1[] RX10_TEMP259 = X10_TEMP479.pointArray;
		for(int RX10_TEMP257=0; RX10_TEMP257 < RX10_TEMP259.length; RX10_TEMP257++)
			{

			final Point1 RX10_TEMP258 = RX10_TEMP259[RX10_TEMP257];

			final int i = RX10_TEMP258.f0;

			final ParticleRefArray1 X10_TEMP480 = X10_TEMP0.one;

			final Point1 RX10_TEMP260 = new Point1(i);

			final Dist1 RX10_TEMP261 = X10_TEMP480.distValue;

			final Region1 RX10_TEMP262 = RX10_TEMP261.dReg;

			final int RX10_TEMP263 = Program.searchPointInRegion1(RX10_TEMP262, RX10_TEMP260);

			final int RX10_TEMP264 = 0;

			final boolean RX10_TEMP265 = RX10_TEMP263 < RX10_TEMP264;
			if(RX10_TEMP265)
				{

				String RX10_TEMP266 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP266);

				}

			final Dist SX10_TEMP18 = RX10_TEMP261.dDist;

			final int RX10_TEMP267 = Program.getPlaceFromDist(SX10_TEMP18, RX10_TEMP263);

			final int RX10_TEMP269 = 0;

			final boolean RX10_TEMP270 = RX10_TEMP267 != RX10_TEMP269;
			if(RX10_TEMP270)
				{

				String RX10_TEMP268 = "Bad place access for array X10_TEMP480";
throw new RuntimeException(RX10_TEMP268);

				}

			final PARTICLEArray RX10_TEMP271 = X10_TEMP480.contents;

			final Particle X10_TEMP482 = Program.PARTICLEGetValue(RX10_TEMP271, RX10_TEMP263);

			final double X10_TEMP483 = X10_TEMP482.zvelocity;

			final double X10_TEMP485 = sp + X10_TEMP483;

			sp = X10_TEMP485;
			}

		final int X10_TEMP486 = X10_TEMP0.mdsize;

		final double X10_TEMP488 = sp / X10_TEMP486;

		sp = X10_TEMP488;

		final int X10_TEMP493 = 0;

		final int X10_TEMP490 = X10_TEMP0.mdsize;

		final int X10_TEMP491 = 1;

		final int X10_TEMP494 = X10_TEMP490 - X10_TEMP491;

		final Region1 X10_TEMP496 = Program.createNewRegion1R(X10_TEMP493, X10_TEMP494);

		final Point1[] RX10_TEMP274 = X10_TEMP496.pointArray;
		for(int RX10_TEMP272=0; RX10_TEMP272 < RX10_TEMP274.length; RX10_TEMP272++)
			{

			final Point1 RX10_TEMP273 = RX10_TEMP274[RX10_TEMP272];

			final int i = RX10_TEMP273.f0;

			final ParticleRefArray1 X10_TEMP497 = X10_TEMP0.one;

			final Point1 RX10_TEMP275 = new Point1(i);

			final Dist1 RX10_TEMP276 = X10_TEMP497.distValue;

			final Region1 RX10_TEMP277 = RX10_TEMP276.dReg;

			final int RX10_TEMP278 = Program.searchPointInRegion1(RX10_TEMP277, RX10_TEMP275);

			final int RX10_TEMP279 = 0;

			final boolean RX10_TEMP280 = RX10_TEMP278 < RX10_TEMP279;
			if(RX10_TEMP280)
				{

				String RX10_TEMP281 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP281);

				}

			final Dist SX10_TEMP19 = RX10_TEMP276.dDist;

			final int RX10_TEMP282 = Program.getPlaceFromDist(SX10_TEMP19, RX10_TEMP278);

			final int RX10_TEMP284 = 0;

			final boolean RX10_TEMP285 = RX10_TEMP282 != RX10_TEMP284;
			if(RX10_TEMP285)
				{

				String RX10_TEMP283 = "Bad place access for array X10_TEMP497";
throw new RuntimeException(RX10_TEMP283);

				}

			final PARTICLEArray RX10_TEMP286 = X10_TEMP497.contents;

			final Particle X10_TEMP499 = Program.PARTICLEGetValue(RX10_TEMP286, RX10_TEMP278);

			final ParticleRefArray1 X10_TEMP500 = X10_TEMP0.one;

			final Point1 RX10_TEMP287 = new Point1(i);

			final Dist1 RX10_TEMP288 = X10_TEMP500.distValue;

			final Region1 RX10_TEMP289 = RX10_TEMP288.dReg;

			final int RX10_TEMP290 = Program.searchPointInRegion1(RX10_TEMP289, RX10_TEMP287);

			final int RX10_TEMP291 = 0;

			final boolean RX10_TEMP292 = RX10_TEMP290 < RX10_TEMP291;
			if(RX10_TEMP292)
				{

				String RX10_TEMP293 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP293);

				}

			final Dist SX10_TEMP20 = RX10_TEMP288.dDist;

			final int RX10_TEMP294 = Program.getPlaceFromDist(SX10_TEMP20, RX10_TEMP290);

			final int RX10_TEMP296 = 0;

			final boolean RX10_TEMP297 = RX10_TEMP294 != RX10_TEMP296;
			if(RX10_TEMP297)
				{

				String RX10_TEMP295 = "Bad place access for array X10_TEMP500";
throw new RuntimeException(RX10_TEMP295);

				}

			final PARTICLEArray RX10_TEMP298 = X10_TEMP500.contents;

			final Particle X10_TEMP502 = Program.PARTICLEGetValue(RX10_TEMP298, RX10_TEMP290);

			final double X10_TEMP503 = X10_TEMP502.zvelocity;

			final double X10_TEMP506 = X10_TEMP503 - sp;

			final double X10_TEMP507 = X10_TEMP506;
			X10_TEMP499.zvelocity = (X10_TEMP507);

			final double X10_TEMP516 = X10_TEMP0.ekin;

			final ParticleRefArray1 X10_TEMP508 = X10_TEMP0.one;

			final Point1 RX10_TEMP299 = new Point1(i);

			final Dist1 RX10_TEMP300 = X10_TEMP508.distValue;

			final Region1 RX10_TEMP301 = RX10_TEMP300.dReg;

			final int RX10_TEMP302 = Program.searchPointInRegion1(RX10_TEMP301, RX10_TEMP299);

			final int RX10_TEMP303 = 0;

			final boolean RX10_TEMP304 = RX10_TEMP302 < RX10_TEMP303;
			if(RX10_TEMP304)
				{

				String RX10_TEMP305 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP305);

				}

			final Dist SX10_TEMP21 = RX10_TEMP300.dDist;

			final int RX10_TEMP306 = Program.getPlaceFromDist(SX10_TEMP21, RX10_TEMP302);

			final int RX10_TEMP308 = 0;

			final boolean RX10_TEMP309 = RX10_TEMP306 != RX10_TEMP308;
			if(RX10_TEMP309)
				{

				String RX10_TEMP307 = "Bad place access for array X10_TEMP508";
throw new RuntimeException(RX10_TEMP307);

				}

			final PARTICLEArray RX10_TEMP310 = X10_TEMP508.contents;

			final Particle X10_TEMP510 = Program.PARTICLEGetValue(RX10_TEMP310, RX10_TEMP302);

			final double X10_TEMP514 = X10_TEMP510.zvelocity;

			final ParticleRefArray1 X10_TEMP511 = X10_TEMP0.one;

			final Point1 RX10_TEMP311 = new Point1(i);

			final Dist1 RX10_TEMP312 = X10_TEMP511.distValue;

			final Region1 RX10_TEMP313 = RX10_TEMP312.dReg;

			final int RX10_TEMP314 = Program.searchPointInRegion1(RX10_TEMP313, RX10_TEMP311);

			final int RX10_TEMP315 = 0;

			final boolean RX10_TEMP316 = RX10_TEMP314 < RX10_TEMP315;
			if(RX10_TEMP316)
				{

				String RX10_TEMP317 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP317);

				}

			final Dist SX10_TEMP22 = RX10_TEMP312.dDist;

			final int RX10_TEMP318 = Program.getPlaceFromDist(SX10_TEMP22, RX10_TEMP314);

			final int RX10_TEMP320 = 0;

			final boolean RX10_TEMP321 = RX10_TEMP318 != RX10_TEMP320;
			if(RX10_TEMP321)
				{

				String RX10_TEMP319 = "Bad place access for array X10_TEMP511";
throw new RuntimeException(RX10_TEMP319);

				}

			final PARTICLEArray RX10_TEMP322 = X10_TEMP511.contents;

			final Particle X10_TEMP513 = Program.PARTICLEGetValue(RX10_TEMP322, RX10_TEMP314);

			final double X10_TEMP515 = X10_TEMP513.zvelocity;

			final double X10_TEMP517 = X10_TEMP514 * X10_TEMP515;

			final double X10_TEMP520 = X10_TEMP516 + X10_TEMP517;

			final double X10_TEMP521 = X10_TEMP520;
			X10_TEMP0.ekin = (X10_TEMP521);
			}

		final double X10_TEMP522 = X10_TEMP0.tscale;

		final double X10_TEMP523 = X10_TEMP0.ekin;

		double ts = X10_TEMP522 * X10_TEMP523;

		final double X10_TEMP526 = _md_tref / ts;

		final double X10_TEMP527 = Math.sqrt(X10_TEMP526);

		final double X10_TEMP530 = _md_h * X10_TEMP527;

		final double X10_TEMP531 = X10_TEMP530;
		X10_TEMP0.sc = (X10_TEMP531);

		final int X10_TEMP536 = 0;

		final int X10_TEMP533 = X10_TEMP0.mdsize;

		final int X10_TEMP534 = 1;

		final int X10_TEMP537 = X10_TEMP533 - X10_TEMP534;

		final Region1 X10_TEMP539 = Program.createNewRegion1R(X10_TEMP536, X10_TEMP537);

		final Point1[] RX10_TEMP325 = X10_TEMP539.pointArray;
		for(int RX10_TEMP323=0; RX10_TEMP323 < RX10_TEMP325.length; RX10_TEMP323++)
			{

			final Point1 RX10_TEMP324 = RX10_TEMP325[RX10_TEMP323];

			final int i = RX10_TEMP324.f0;

			final ParticleRefArray1 X10_TEMP540 = X10_TEMP0.one;

			final Point1 RX10_TEMP326 = new Point1(i);

			final Dist1 RX10_TEMP327 = X10_TEMP540.distValue;

			final Region1 RX10_TEMP328 = RX10_TEMP327.dReg;

			final int RX10_TEMP329 = Program.searchPointInRegion1(RX10_TEMP328, RX10_TEMP326);

			final int RX10_TEMP330 = 0;

			final boolean RX10_TEMP331 = RX10_TEMP329 < RX10_TEMP330;
			if(RX10_TEMP331)
				{

				String RX10_TEMP332 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP332);

				}

			final Dist SX10_TEMP23 = RX10_TEMP327.dDist;

			final int RX10_TEMP333 = Program.getPlaceFromDist(SX10_TEMP23, RX10_TEMP329);

			final int RX10_TEMP335 = 0;

			final boolean RX10_TEMP336 = RX10_TEMP333 != RX10_TEMP335;
			if(RX10_TEMP336)
				{

				String RX10_TEMP334 = "Bad place access for array X10_TEMP540";
throw new RuntimeException(RX10_TEMP334);

				}

			final PARTICLEArray RX10_TEMP337 = X10_TEMP540.contents;

			final Particle X10_TEMP542 = Program.PARTICLEGetValue(RX10_TEMP337, RX10_TEMP329);

			final ParticleRefArray1 X10_TEMP543 = X10_TEMP0.one;

			final Point1 RX10_TEMP338 = new Point1(i);

			final Dist1 RX10_TEMP339 = X10_TEMP543.distValue;

			final Region1 RX10_TEMP340 = RX10_TEMP339.dReg;

			final int RX10_TEMP341 = Program.searchPointInRegion1(RX10_TEMP340, RX10_TEMP338);

			final int RX10_TEMP342 = 0;

			final boolean RX10_TEMP343 = RX10_TEMP341 < RX10_TEMP342;
			if(RX10_TEMP343)
				{

				String RX10_TEMP344 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP344);

				}

			final Dist SX10_TEMP24 = RX10_TEMP339.dDist;

			final int RX10_TEMP345 = Program.getPlaceFromDist(SX10_TEMP24, RX10_TEMP341);

			final int RX10_TEMP347 = 0;

			final boolean RX10_TEMP348 = RX10_TEMP345 != RX10_TEMP347;
			if(RX10_TEMP348)
				{

				String RX10_TEMP346 = "Bad place access for array X10_TEMP543";
throw new RuntimeException(RX10_TEMP346);

				}

			final PARTICLEArray RX10_TEMP349 = X10_TEMP543.contents;

			final Particle X10_TEMP545 = Program.PARTICLEGetValue(RX10_TEMP349, RX10_TEMP341);

			final double X10_TEMP546 = X10_TEMP545.xvelocity;

			final double X10_TEMP547 = X10_TEMP0.sc;

			final double X10_TEMP550 = X10_TEMP546 * X10_TEMP547;

			final double X10_TEMP551 = X10_TEMP550;
			X10_TEMP542.xvelocity = (X10_TEMP551);

			final ParticleRefArray1 X10_TEMP552 = X10_TEMP0.one;

			final Point1 RX10_TEMP350 = new Point1(i);

			final Dist1 RX10_TEMP351 = X10_TEMP552.distValue;

			final Region1 RX10_TEMP352 = RX10_TEMP351.dReg;

			final int RX10_TEMP353 = Program.searchPointInRegion1(RX10_TEMP352, RX10_TEMP350);

			final int RX10_TEMP354 = 0;

			final boolean RX10_TEMP355 = RX10_TEMP353 < RX10_TEMP354;
			if(RX10_TEMP355)
				{

				String RX10_TEMP356 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP356);

				}

			final Dist SX10_TEMP25 = RX10_TEMP351.dDist;

			final int RX10_TEMP357 = Program.getPlaceFromDist(SX10_TEMP25, RX10_TEMP353);

			final int RX10_TEMP359 = 0;

			final boolean RX10_TEMP360 = RX10_TEMP357 != RX10_TEMP359;
			if(RX10_TEMP360)
				{

				String RX10_TEMP358 = "Bad place access for array X10_TEMP552";
throw new RuntimeException(RX10_TEMP358);

				}

			final PARTICLEArray RX10_TEMP361 = X10_TEMP552.contents;

			final Particle X10_TEMP554 = Program.PARTICLEGetValue(RX10_TEMP361, RX10_TEMP353);

			final ParticleRefArray1 X10_TEMP555 = X10_TEMP0.one;

			final Point1 RX10_TEMP362 = new Point1(i);

			final Dist1 RX10_TEMP363 = X10_TEMP555.distValue;

			final Region1 RX10_TEMP364 = RX10_TEMP363.dReg;

			final int RX10_TEMP365 = Program.searchPointInRegion1(RX10_TEMP364, RX10_TEMP362);

			final int RX10_TEMP366 = 0;

			final boolean RX10_TEMP367 = RX10_TEMP365 < RX10_TEMP366;
			if(RX10_TEMP367)
				{

				String RX10_TEMP368 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP368);

				}

			final Dist SX10_TEMP26 = RX10_TEMP363.dDist;

			final int RX10_TEMP369 = Program.getPlaceFromDist(SX10_TEMP26, RX10_TEMP365);

			final int RX10_TEMP371 = 0;

			final boolean RX10_TEMP372 = RX10_TEMP369 != RX10_TEMP371;
			if(RX10_TEMP372)
				{

				String RX10_TEMP370 = "Bad place access for array X10_TEMP555";
throw new RuntimeException(RX10_TEMP370);

				}

			final PARTICLEArray RX10_TEMP373 = X10_TEMP555.contents;

			final Particle X10_TEMP557 = Program.PARTICLEGetValue(RX10_TEMP373, RX10_TEMP365);

			final double X10_TEMP558 = X10_TEMP557.yvelocity;

			final double X10_TEMP559 = X10_TEMP0.sc;

			final double X10_TEMP562 = X10_TEMP558 * X10_TEMP559;

			final double X10_TEMP563 = X10_TEMP562;
			X10_TEMP554.yvelocity = (X10_TEMP563);

			final ParticleRefArray1 X10_TEMP564 = X10_TEMP0.one;

			final Point1 RX10_TEMP374 = new Point1(i);

			final Dist1 RX10_TEMP375 = X10_TEMP564.distValue;

			final Region1 RX10_TEMP376 = RX10_TEMP375.dReg;

			final int RX10_TEMP377 = Program.searchPointInRegion1(RX10_TEMP376, RX10_TEMP374);

			final int RX10_TEMP378 = 0;

			final boolean RX10_TEMP379 = RX10_TEMP377 < RX10_TEMP378;
			if(RX10_TEMP379)
				{

				String RX10_TEMP380 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP380);

				}

			final Dist SX10_TEMP27 = RX10_TEMP375.dDist;

			final int RX10_TEMP381 = Program.getPlaceFromDist(SX10_TEMP27, RX10_TEMP377);

			final int RX10_TEMP383 = 0;

			final boolean RX10_TEMP384 = RX10_TEMP381 != RX10_TEMP383;
			if(RX10_TEMP384)
				{

				String RX10_TEMP382 = "Bad place access for array X10_TEMP564";
throw new RuntimeException(RX10_TEMP382);

				}

			final PARTICLEArray RX10_TEMP385 = X10_TEMP564.contents;

			final Particle X10_TEMP566 = Program.PARTICLEGetValue(RX10_TEMP385, RX10_TEMP377);

			final ParticleRefArray1 X10_TEMP567 = X10_TEMP0.one;

			final Point1 RX10_TEMP386 = new Point1(i);

			final Dist1 RX10_TEMP387 = X10_TEMP567.distValue;

			final Region1 RX10_TEMP388 = RX10_TEMP387.dReg;

			final int RX10_TEMP389 = Program.searchPointInRegion1(RX10_TEMP388, RX10_TEMP386);

			final int RX10_TEMP390 = 0;

			final boolean RX10_TEMP391 = RX10_TEMP389 < RX10_TEMP390;
			if(RX10_TEMP391)
				{

				String RX10_TEMP392 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP392);

				}

			final Dist SX10_TEMP28 = RX10_TEMP387.dDist;

			final int RX10_TEMP393 = Program.getPlaceFromDist(SX10_TEMP28, RX10_TEMP389);

			final int RX10_TEMP395 = 0;

			final boolean RX10_TEMP396 = RX10_TEMP393 != RX10_TEMP395;
			if(RX10_TEMP396)
				{

				String RX10_TEMP394 = "Bad place access for array X10_TEMP567";
throw new RuntimeException(RX10_TEMP394);

				}

			final PARTICLEArray RX10_TEMP397 = X10_TEMP567.contents;

			final Particle X10_TEMP569 = Program.PARTICLEGetValue(RX10_TEMP397, RX10_TEMP389);

			final double X10_TEMP570 = X10_TEMP569.zvelocity;

			final double X10_TEMP571 = X10_TEMP0.sc;

			final double X10_TEMP574 = X10_TEMP570 * X10_TEMP571;

			final double X10_TEMP575 = X10_TEMP574;
			X10_TEMP566.zvelocity = (X10_TEMP575);
			}
		}
public static void md_runiters1 ( final md X10_TEMP0)		{

		final int X10_TEMP5 = 0;

		final int X10_TEMP2 = X10_TEMP0.mdsize;

		final int X10_TEMP3 = 1;

		final int X10_TEMP6 = X10_TEMP2 - X10_TEMP3;

		final Region1 X10_TEMP8 = Program.createNewRegion1R(X10_TEMP5, X10_TEMP6);

		final Point1[] RX10_TEMP2 = X10_TEMP8.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
			{

			final Point1 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

			final int i = RX10_TEMP1.f0;

			final ParticleRefArray1 X10_TEMP9 = X10_TEMP0.one;

			final Point1 RX10_TEMP3 = new Point1(i);

			final Dist1 RX10_TEMP4 = X10_TEMP9.distValue;

			final Region1 RX10_TEMP5 = RX10_TEMP4.dReg;

			final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, RX10_TEMP3);

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

				String RX10_TEMP11 = "Bad place access for array X10_TEMP9";
throw new RuntimeException(RX10_TEMP11);

				}

			final PARTICLEArray RX10_TEMP14 = X10_TEMP9.contents;

			final Particle X10_TEMP11 = Program.PARTICLEGetValue(RX10_TEMP14, RX10_TEMP6);

			final double X10_TEMP13 = X10_TEMP0.side;
			Program.Particle_domove(X10_TEMP11, X10_TEMP13);
			}

		final double X10_TEMP16 = 0.0;

		final double X10_TEMP17 = X10_TEMP16;
		X10_TEMP0.epot = (X10_TEMP17);

		final double X10_TEMP20 = 0.0;

		final double X10_TEMP21 = X10_TEMP20;
		X10_TEMP0.vir = (X10_TEMP21);

		final int X10_TEMP22 = 0;

		final int X10_TEMP23 = X10_TEMP0.rnk;

		int i = X10_TEMP22 + X10_TEMP23;

		final int X10_TEMP25 = X10_TEMP0.mdsize;

		boolean X10_TEMP29 = i < X10_TEMP25;
		while(X10_TEMP29)
			{

			final ParticleRefArray1 X10_TEMP30 = X10_TEMP0.one;

			final Point1 RX10_TEMP15 = new Point1(i);

			final Dist1 RX10_TEMP16 = X10_TEMP30.distValue;

			final Region1 RX10_TEMP17 = RX10_TEMP16.dReg;

			final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, RX10_TEMP15);

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

				String RX10_TEMP23 = "Bad place access for array X10_TEMP30";
throw new RuntimeException(RX10_TEMP23);

				}

			final PARTICLEArray RX10_TEMP26 = X10_TEMP30.contents;

			final Particle X10_TEMP32 = Program.PARTICLEGetValue(RX10_TEMP26, RX10_TEMP18);

			final double X10_TEMP38 = X10_TEMP0.side;

			final double X10_TEMP39 = X10_TEMP0.rcoff;

			final int X10_TEMP40 = X10_TEMP0.mdsize;
			Program.Particle_force(X10_TEMP32, X10_TEMP38, X10_TEMP39, X10_TEMP40, i, X10_TEMP0);

			final int X10_TEMP42 = X10_TEMP0.nprocess;

			i = i + X10_TEMP42;

			final int X10_TEMP27 = X10_TEMP0.mdsize;

			X10_TEMP29 = i < X10_TEMP27;
			}
		}
public static void md_runiters2 ( final md X10_TEMP0, final mdRefArray1 P)		{
		Program.md_allreduce(X10_TEMP0, P);
		}
public static void md_runiters3 ( final md X10_TEMP0, final int move)		{

		int X10_TEMP1 = move;

		double summation = 0.0;

		final int X10_TEMP7 = 0;

		final int X10_TEMP4 = X10_TEMP0.mdsize;

		final int X10_TEMP5 = 1;

		final int X10_TEMP8 = X10_TEMP4 - X10_TEMP5;

		final Region1 X10_TEMP10 = Program.createNewRegion1R(X10_TEMP7, X10_TEMP8);

		final Point1[] RX10_TEMP2 = X10_TEMP10.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
			{

			final Point1 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

			final int i = RX10_TEMP1.f0;

			final ParticleRefArray1 X10_TEMP11 = X10_TEMP0.one;

			final Point1 RX10_TEMP3 = new Point1(i);

			final Dist1 RX10_TEMP4 = X10_TEMP11.distValue;

			final Region1 RX10_TEMP5 = RX10_TEMP4.dReg;

			final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, RX10_TEMP3);

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

				String RX10_TEMP11 = "Bad place access for array X10_TEMP11";
throw new RuntimeException(RX10_TEMP11);

				}

			final PARTICLEArray RX10_TEMP14 = X10_TEMP11.contents;

			final Particle X10_TEMP13 = Program.PARTICLEGetValue(RX10_TEMP14, RX10_TEMP6);

			final double X10_TEMP15 = X10_TEMP0.hsq2;

			final double X10_TEMP16 = Program.Particle_mkekin(X10_TEMP13, X10_TEMP15);

			final double X10_TEMP18 = summation + X10_TEMP16;

			summation = X10_TEMP18;
			}

		final double X10_TEMP19 = X10_TEMP0.hsq;

		final double X10_TEMP22 = summation / X10_TEMP19;

		final double X10_TEMP23 = X10_TEMP22;
		X10_TEMP0.ekin = (X10_TEMP23);

		double vel = 0.0;

		final double X10_TEMP27 = 0.0;

		final double X10_TEMP28 = X10_TEMP27;
		X10_TEMP0.count = (X10_TEMP28);

		final int X10_TEMP33 = 0;

		final int X10_TEMP30 = X10_TEMP0.mdsize;

		final int X10_TEMP31 = 1;

		final int X10_TEMP34 = X10_TEMP30 - X10_TEMP31;

		final Region1 X10_TEMP36 = Program.createNewRegion1R(X10_TEMP33, X10_TEMP34);

		final Point1[] RX10_TEMP17 = X10_TEMP36.pointArray;
		for(int RX10_TEMP15=0; RX10_TEMP15 < RX10_TEMP17.length; RX10_TEMP15++)
			{

			final Point1 RX10_TEMP16 = RX10_TEMP17[RX10_TEMP15];

			final int i = RX10_TEMP16.f0;

			final ParticleRefArray1 X10_TEMP37 = X10_TEMP0.one;

			final Point1 RX10_TEMP18 = new Point1(i);

			final Dist1 RX10_TEMP19 = X10_TEMP37.distValue;

			final Region1 RX10_TEMP20 = RX10_TEMP19.dReg;

			final int RX10_TEMP21 = Program.searchPointInRegion1(RX10_TEMP20, RX10_TEMP18);

			final int RX10_TEMP22 = 0;

			final boolean RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22;
			if(RX10_TEMP23)
				{

				String RX10_TEMP24 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP24);

				}

			final Dist SX10_TEMP1 = RX10_TEMP19.dDist;

			final int RX10_TEMP25 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP21);

			final int RX10_TEMP27 = 0;

			final boolean RX10_TEMP28 = RX10_TEMP25 != RX10_TEMP27;
			if(RX10_TEMP28)
				{

				String RX10_TEMP26 = "Bad place access for array X10_TEMP37";
throw new RuntimeException(RX10_TEMP26);

				}

			final PARTICLEArray RX10_TEMP29 = X10_TEMP37.contents;

			final Particle X10_TEMP39 = Program.PARTICLEGetValue(RX10_TEMP29, RX10_TEMP21);

			final double X10_TEMP43 = X10_TEMP0.vaverh;

			final double X10_TEMP44 = Program.Particle_velavg(X10_TEMP39, X10_TEMP43, _md_h, X10_TEMP0);

			final double X10_TEMP46 = vel + X10_TEMP44;

			vel = X10_TEMP46;
			}

		final double X10_TEMP48 = vel / _md_h;

		vel = X10_TEMP48;

		final boolean X10_TEMP50 = X10_TEMP1 < _md_istop;

		final int X10_TEMP51 = 1;

		final int X10_TEMP53 = X10_TEMP1 + X10_TEMP51;

		final int X10_TEMP55 = X10_TEMP53 % _md_irep;

		final int X10_TEMP56 = 0;

		final boolean X10_TEMP58 = X10_TEMP55 == X10_TEMP56;

		final boolean X10_TEMP60 = X10_TEMP50 && X10_TEMP58;
		if(X10_TEMP60)
			{

			final double X10_TEMP61 = X10_TEMP0.tscale;

			final double X10_TEMP62 = X10_TEMP0.ekin;

			final double X10_TEMP64 = X10_TEMP61 * X10_TEMP62;

			final double X10_TEMP66 = _md_tref / X10_TEMP64;

			final double X10_TEMP69 = Math.sqrt(X10_TEMP66);

			final double X10_TEMP70 = X10_TEMP69;
			X10_TEMP0.sc = (X10_TEMP70);

			final int X10_TEMP75 = 0;

			final int X10_TEMP72 = X10_TEMP0.mdsize;

			final int X10_TEMP73 = 1;

			final int X10_TEMP76 = X10_TEMP72 - X10_TEMP73;

			final Region1 X10_TEMP78 = Program.createNewRegion1R(X10_TEMP75, X10_TEMP76);

			final Point1[] RX10_TEMP32 = X10_TEMP78.pointArray;
			for(int RX10_TEMP30=0; RX10_TEMP30 < RX10_TEMP32.length; RX10_TEMP30++)
				{

				final Point1 RX10_TEMP31 = RX10_TEMP32[RX10_TEMP30];

				final int i = RX10_TEMP31.f0;

				final ParticleRefArray1 X10_TEMP79 = X10_TEMP0.one;

				final Point1 RX10_TEMP33 = new Point1(i);

				final Dist1 RX10_TEMP34 = X10_TEMP79.distValue;

				final Region1 RX10_TEMP35 = RX10_TEMP34.dReg;

				final int RX10_TEMP36 = Program.searchPointInRegion1(RX10_TEMP35, RX10_TEMP33);

				final int RX10_TEMP37 = 0;

				final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
				if(RX10_TEMP38)
					{

					String RX10_TEMP39 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP39);

					}

				final Dist SX10_TEMP2 = RX10_TEMP34.dDist;

				final int RX10_TEMP40 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP36);

				final int RX10_TEMP42 = 0;

				final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
				if(RX10_TEMP43)
					{

					String RX10_TEMP41 = "Bad place access for array X10_TEMP79";
throw new RuntimeException(RX10_TEMP41);

					}

				final PARTICLEArray RX10_TEMP44 = X10_TEMP79.contents;

				final Particle X10_TEMP81 = Program.PARTICLEGetValue(RX10_TEMP44, RX10_TEMP36);

				final double X10_TEMP84 = X10_TEMP0.sc;

				final int X10_TEMP85 = 1;
				Program.Particle_dscal(X10_TEMP81, X10_TEMP84, X10_TEMP85);
				}

			final double X10_TEMP86 = X10_TEMP0.tscale;

			final double X10_TEMP89 = _md_tref / X10_TEMP86;

			final double X10_TEMP90 = X10_TEMP89;
			X10_TEMP0.ekin = (X10_TEMP90);
			}

		final int X10_TEMP91 = 1;

		final int X10_TEMP93 = X10_TEMP1 + X10_TEMP91;

		final int X10_TEMP95 = X10_TEMP93 % _md_iprint;

		final int X10_TEMP96 = 0;

		final boolean X10_TEMP98 = X10_TEMP95 == X10_TEMP96;
		if(X10_TEMP98)
			{

			final double X10_TEMP99 = 24.0;

			final double X10_TEMP100 = X10_TEMP0.ekin;

			final double X10_TEMP103 = X10_TEMP99 * X10_TEMP100;

			final double X10_TEMP104 = X10_TEMP103;
			X10_TEMP0.ek = (X10_TEMP104);

			final double X10_TEMP105 = 4.0;

			final double X10_TEMP106 = X10_TEMP0.epot;

			final double X10_TEMP109 = X10_TEMP105 * X10_TEMP106;

			final double X10_TEMP110 = X10_TEMP109;
			X10_TEMP0.epot = (X10_TEMP110);

			final double X10_TEMP111 = X10_TEMP0.ek;

			final double X10_TEMP112 = X10_TEMP0.epot;

			final double X10_TEMP115 = X10_TEMP111 + X10_TEMP112;

			final double X10_TEMP116 = X10_TEMP115;
			X10_TEMP0.etot = (X10_TEMP116);

			final double X10_TEMP117 = X10_TEMP0.tscale;

			final double X10_TEMP118 = X10_TEMP0.ekin;

			final double X10_TEMP121 = X10_TEMP117 * X10_TEMP118;

			final double X10_TEMP122 = X10_TEMP121;
			X10_TEMP0.temp = (X10_TEMP122);

			final double X10_TEMP123 = 16.0;

			final double X10_TEMP128 = _md_den * X10_TEMP123;

			final double X10_TEMP124 = X10_TEMP0.ekin;

			final double X10_TEMP125 = X10_TEMP0.vir;

			final double X10_TEMP127 = X10_TEMP124 - X10_TEMP125;

			final double X10_TEMP129 = X10_TEMP128 * X10_TEMP127;

			final int X10_TEMP130 = X10_TEMP0.mdsize;

			final double X10_TEMP133 = X10_TEMP129 / X10_TEMP130;

			final double X10_TEMP134 = X10_TEMP133;
			X10_TEMP0.pres = (X10_TEMP134);

			final int X10_TEMP135 = X10_TEMP0.mdsize;

			final double X10_TEMP137 = vel / X10_TEMP135;

			vel = X10_TEMP137;

			final double X10_TEMP138 = X10_TEMP0.count;

			final int X10_TEMP139 = X10_TEMP0.mdsize;

			final double X10_TEMP141 = X10_TEMP138 / X10_TEMP139;

			final double X10_TEMP142 = 100.0;

			final double X10_TEMP145 = X10_TEMP141 * X10_TEMP142;

			final double X10_TEMP146 = X10_TEMP145;
			X10_TEMP0.rp = (X10_TEMP146);
			}
		}
public static void md_allreduce ( final md X10_TEMP0, final mdRefArray1 P)		{

		final int X10_TEMP1 = X10_TEMP0.rnk;

		final int X10_TEMP2 = 0;

		final boolean X10_TEMP4 = X10_TEMP1 != X10_TEMP2;
		if(X10_TEMP4)
			{
			return;
			}

		final md t = new md();

		final int X10_TEMP8 = X10_TEMP0.mdsize;

		final int X10_TEMP9 = X10_TEMP8;
		t.mdsize = (X10_TEMP9);

		final int X10_TEMP14 = 0;

		final int X10_TEMP11 = X10_TEMP0.mdsize;

		final int X10_TEMP12 = 1;

		final int X10_TEMP15 = X10_TEMP11 - X10_TEMP12;

		final Region1 X10_TEMP16 = Program.createNewRegion1R(X10_TEMP14, X10_TEMP15);

		final int X10_TEMP17 = 0;

		final Dist1 dOne = Program.getPlaceDist1(X10_TEMP16, X10_TEMP17);

		final Region1 RX10_TEMP0 = dOne.dReg;

		final Point1[] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = dOne.dDist;

		final PARTICLEArray RX10_TEMP3 = new PARTICLEArray(RX10_TEMP1);

		final ParticleRefArray1 RX10_TEMP4 = new ParticleRefArray1(dOne, RX10_TEMP3);

		final ParticleRefArray1 X10_TEMP21 = RX10_TEMP4;

		final ParticleRefArray1 X10_TEMP22 = X10_TEMP21;
		t.one = (X10_TEMP22);

		final int tHere = 0;

		final int X10_TEMP30 = 0;

		final int X10_TEMP25 = X10_TEMP0.mdsize;

		final int X10_TEMP26 = 1;

		final int X10_TEMP28 = X10_TEMP25 - X10_TEMP26;

		final Region1 X10_TEMP32 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP28);

		final Point1[] RX10_TEMP7 = X10_TEMP32.pointArray;
		for(int RX10_TEMP5=0; RX10_TEMP5 < RX10_TEMP7.length; RX10_TEMP5++)
			{

			final Point1 RX10_TEMP6 = RX10_TEMP7[RX10_TEMP5];

			final int k = RX10_TEMP6.f0;

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

			final Particle X10_TEMP55 = new Particle(X10_TEMP44, X10_TEMP45, X10_TEMP46, X10_TEMP47, X10_TEMP48, X10_TEMP49, X10_TEMP50, X10_TEMP51, X10_TEMP52);

			final Particle X10_TEMP56 = X10_TEMP55;

			final Point1 RX10_TEMP8 = new Point1(k);

			final Dist1 RX10_TEMP9 = X10_TEMP33.distValue;

			final Region1 RX10_TEMP10 = RX10_TEMP9.dReg;

			final int RX10_TEMP11 = Program.searchPointInRegion1(RX10_TEMP10, RX10_TEMP8);

			final int RX10_TEMP12 = 0;

			final boolean RX10_TEMP13 = RX10_TEMP11 < RX10_TEMP12;
			if(RX10_TEMP13)
				{

				String RX10_TEMP14 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP14);

				}

			final Dist SX10_TEMP0 = RX10_TEMP9.dDist;

			final int RX10_TEMP15 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP11);

			final int RX10_TEMP17 = 0;

			final boolean RX10_TEMP18 = RX10_TEMP15 != RX10_TEMP17;
			if(RX10_TEMP18)
				{

				String RX10_TEMP16 = "Bad place access for array X10_TEMP33";
throw new RuntimeException(RX10_TEMP16);

				}

			final PARTICLEArray RX10_TEMP19 = X10_TEMP33.contents;
			Program.PARTICLESetValue(RX10_TEMP19, RX10_TEMP11, X10_TEMP56);
			}

		final Dist1 RX10_TEMP22 = P.distValue;

		final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;

		final Point1[] RX10_TEMP24 = RX10_TEMP23.pointArray;
		for(int RX10_TEMP20=0; RX10_TEMP20 < RX10_TEMP24.length; RX10_TEMP20++)
			{

			final Point1 RX10_TEMP21 = RX10_TEMP24[RX10_TEMP20];

			final int j = RX10_TEMP21.f0;

			final int X10_TEMP60 = 0;

			final int X10_TEMP61 = 2;

			final Region1 X10_TEMP62 = Program.createNewRegion1R(X10_TEMP60, X10_TEMP61);

			final int X10_TEMP63 = 0;

			final Dist1 dD = Program.getPlaceDist1(X10_TEMP62, X10_TEMP63);

			final int X10_TEMP67 = 0;

			final int X10_TEMP68 = 0;

			final Region1 X10_TEMP69 = Program.createNewRegion1R(X10_TEMP67, X10_TEMP68);

			final int X10_TEMP70 = 0;

			final Dist1 dI = Program.getPlaceDist1(X10_TEMP69, X10_TEMP70);

			final Region1 RX10_TEMP25 = dD.dReg;

			final Point1[] RX10_TEMP27 = RX10_TEMP25.pointArray;

			final Dist RX10_TEMP26 = dD.dDist;

			final DOUBLEArray RX10_TEMP28 = new DOUBLEArray(RX10_TEMP26);

			final doubleRefArray1 RX10_TEMP29 = new doubleRefArray1(dD, RX10_TEMP28);

			final doubleRefArray1 dataD = RX10_TEMP29;

			final Region1 RX10_TEMP30 = dI.dReg;

			final Point1[] RX10_TEMP32 = RX10_TEMP30.pointArray;

			final Dist RX10_TEMP31 = dI.dDist;

			final DOUBLEArray RX10_TEMP33 = new DOUBLEArray(RX10_TEMP31);

			final doubleRefArray1 RX10_TEMP34 = new doubleRefArray1(dI, RX10_TEMP33);

			final doubleRefArray1 dataI = RX10_TEMP34;

			final int X10_TEMP80 = 0;

			final int X10_TEMP75 = X10_TEMP0.mdsize;

			final int X10_TEMP76 = 1;

			final int X10_TEMP78 = X10_TEMP75 - X10_TEMP76;

			final Region1 X10_TEMP82 = Program.createNewRegion1R(X10_TEMP80, X10_TEMP78);

			final Point1[] RX10_TEMP37 = X10_TEMP82.pointArray;
			for(int RX10_TEMP35=0; RX10_TEMP35 < RX10_TEMP37.length; RX10_TEMP35++)
				{

				final Point1 RX10_TEMP36 = RX10_TEMP37[RX10_TEMP35];

				final int k = RX10_TEMP36.f0;
									{

					final Dist1 RX10_TEMP38 = P.distValue;

					final Dist1 X10_TEMP83 = RX10_TEMP38;

					final Point1 RX10_TEMP39 = new Point1(j);

					final Region1 RX10_TEMP40 = X10_TEMP83.dReg;

					final int RX10_TEMP41 = Program.searchPointInRegion1(RX10_TEMP40, RX10_TEMP39);

					final int RX10_TEMP42 = 0;

					final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
					if(RX10_TEMP43)
						{

						final String RX10_TEMP44 = "Point RX10_TEMP39 not found in the distribution X10_TEMP83.";
throw new RuntimeException(RX10_TEMP44);

						}

					final Dist SX10_TEMP1 = X10_TEMP83.dDist;

					final int RX10_TEMP45 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP41);

					final int X10_TEMP86 = RX10_TEMP45;
					//async(X10_TEMP86)
						{

						final Point1 RX10_TEMP46 = new Point1(j);

						final Dist1 RX10_TEMP47 = P.distValue;

						final Region1 RX10_TEMP48 = RX10_TEMP47.dReg;

						final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, RX10_TEMP46);

						final int RX10_TEMP50 = 0;

						final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;
						if(RX10_TEMP51)
							{

							String RX10_TEMP52 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP52);

							}

						final Dist SX10_TEMP2 = RX10_TEMP47.dDist;

						final int RX10_TEMP53 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP49);

						final int RX10_TEMP55 = 0;

						final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55;
						if(RX10_TEMP56)
							{

							String RX10_TEMP54 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP54);

							}

						final MDArray RX10_TEMP57 = P.contents;

						final md X10_TEMP88 = Program.MDGetValue(RX10_TEMP57, RX10_TEMP49);

						final ParticleRefArray1 X10_TEMP89 = X10_TEMP88.one;

						final Point1 RX10_TEMP58 = new Point1(k);

						final Dist1 RX10_TEMP59 = X10_TEMP89.distValue;

						final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;

						final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, RX10_TEMP58);

						final int RX10_TEMP62 = 0;

						final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;
						if(RX10_TEMP63)
							{

							String RX10_TEMP64 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP64);

							}

						final Dist SX10_TEMP3 = RX10_TEMP59.dDist;

						final int RX10_TEMP65 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP61);

						final int RX10_TEMP67 = 0;

						final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;
						if(RX10_TEMP68)
							{

							String RX10_TEMP66 = "Bad place access for array X10_TEMP89";
throw new RuntimeException(RX10_TEMP66);

							}

						final PARTICLEArray RX10_TEMP69 = X10_TEMP89.contents;

						final Particle X10_TEMP91 = Program.PARTICLEGetValue(RX10_TEMP69, RX10_TEMP61);

						final double fx = X10_TEMP91.xforce;

						final Point1 RX10_TEMP70 = new Point1(j);

						final Dist1 RX10_TEMP71 = P.distValue;

						final Region1 RX10_TEMP72 = RX10_TEMP71.dReg;

						final int RX10_TEMP73 = Program.searchPointInRegion1(RX10_TEMP72, RX10_TEMP70);

						final int RX10_TEMP74 = 0;

						final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74;
						if(RX10_TEMP75)
							{

							String RX10_TEMP76 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP76);

							}

						final Dist SX10_TEMP4 = RX10_TEMP71.dDist;

						final int RX10_TEMP77 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP73);

						final int RX10_TEMP79 = 0;

						final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79;
						if(RX10_TEMP80)
							{

							String RX10_TEMP78 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP78);

							}

						final MDArray RX10_TEMP81 = P.contents;

						final md X10_TEMP94 = Program.MDGetValue(RX10_TEMP81, RX10_TEMP73);

						final ParticleRefArray1 X10_TEMP95 = X10_TEMP94.one;

						final Point1 RX10_TEMP82 = new Point1(k);

						final Dist1 RX10_TEMP83 = X10_TEMP95.distValue;

						final Region1 RX10_TEMP84 = RX10_TEMP83.dReg;

						final int RX10_TEMP85 = Program.searchPointInRegion1(RX10_TEMP84, RX10_TEMP82);

						final int RX10_TEMP86 = 0;

						final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86;
						if(RX10_TEMP87)
							{

							String RX10_TEMP88 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP88);

							}

						final Dist SX10_TEMP5 = RX10_TEMP83.dDist;

						final int RX10_TEMP89 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP85);

						final int RX10_TEMP91 = 0;

						final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91;
						if(RX10_TEMP92)
							{

							String RX10_TEMP90 = "Bad place access for array X10_TEMP95";
throw new RuntimeException(RX10_TEMP90);

							}

						final PARTICLEArray RX10_TEMP93 = X10_TEMP95.contents;

						final Particle X10_TEMP97 = Program.PARTICLEGetValue(RX10_TEMP93, RX10_TEMP85);

						final double fy = X10_TEMP97.yforce;

						final Point1 RX10_TEMP94 = new Point1(j);

						final Dist1 RX10_TEMP95 = P.distValue;

						final Region1 RX10_TEMP96 = RX10_TEMP95.dReg;

						final int RX10_TEMP97 = Program.searchPointInRegion1(RX10_TEMP96, RX10_TEMP94);

						final int RX10_TEMP98 = 0;

						final boolean RX10_TEMP99 = RX10_TEMP97 < RX10_TEMP98;
						if(RX10_TEMP99)
							{

							String RX10_TEMP100 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP100);

							}

						final Dist SX10_TEMP6 = RX10_TEMP95.dDist;

						final int RX10_TEMP101 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP97);

						final int RX10_TEMP103 = 0;

						final boolean RX10_TEMP104 = RX10_TEMP101 != RX10_TEMP103;
						if(RX10_TEMP104)
							{

							String RX10_TEMP102 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP102);

							}

						final MDArray RX10_TEMP105 = P.contents;

						final md X10_TEMP100 = Program.MDGetValue(RX10_TEMP105, RX10_TEMP97);

						final ParticleRefArray1 X10_TEMP101 = X10_TEMP100.one;

						final Point1 RX10_TEMP106 = new Point1(k);

						final Dist1 RX10_TEMP107 = X10_TEMP101.distValue;

						final Region1 RX10_TEMP108 = RX10_TEMP107.dReg;

						final int RX10_TEMP109 = Program.searchPointInRegion1(RX10_TEMP108, RX10_TEMP106);

						final int RX10_TEMP110 = 0;

						final boolean RX10_TEMP111 = RX10_TEMP109 < RX10_TEMP110;
						if(RX10_TEMP111)
							{

							String RX10_TEMP112 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP112);

							}

						final Dist SX10_TEMP7 = RX10_TEMP107.dDist;

						final int RX10_TEMP113 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP109);

						final int RX10_TEMP115 = 0;

						final boolean RX10_TEMP116 = RX10_TEMP113 != RX10_TEMP115;
						if(RX10_TEMP116)
							{

							String RX10_TEMP114 = "Bad place access for array X10_TEMP101";
throw new RuntimeException(RX10_TEMP114);

							}

						final PARTICLEArray RX10_TEMP117 = X10_TEMP101.contents;

						final Particle X10_TEMP103 = Program.PARTICLEGetValue(RX10_TEMP117, RX10_TEMP109);

						final double fz = X10_TEMP103.zforce;
													{
							//async(tHere)
								{

								final int X10_TEMP107 = 0;

								final double X10_TEMP110 = fx;

								final Point1 RX10_TEMP118 = new Point1(X10_TEMP107);

								final Dist1 RX10_TEMP119 = dataD.distValue;

								final Region1 RX10_TEMP120 = RX10_TEMP119.dReg;

								final int RX10_TEMP121 = Program.searchPointInRegion1(RX10_TEMP120, RX10_TEMP118);

								final int RX10_TEMP122 = 0;

								final boolean RX10_TEMP123 = RX10_TEMP121 < RX10_TEMP122;
								if(RX10_TEMP123)
									{

									String RX10_TEMP124 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP124);

									}

								final Dist SX10_TEMP8 = RX10_TEMP119.dDist;

								final int RX10_TEMP125 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP121);

								final int RX10_TEMP127 = 0;

								final boolean RX10_TEMP128 = RX10_TEMP125 != RX10_TEMP127;
								if(RX10_TEMP128)
									{

									String RX10_TEMP126 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP126);

									}

								final DOUBLEArray RX10_TEMP129 = dataD.contents;
								Program.DOUBLESetValue(RX10_TEMP129, RX10_TEMP121, X10_TEMP110);

								final int X10_TEMP112 = 1;

								final double X10_TEMP115 = fy;

								final Point1 RX10_TEMP130 = new Point1(X10_TEMP112);

								final Dist1 RX10_TEMP131 = dataD.distValue;

								final Region1 RX10_TEMP132 = RX10_TEMP131.dReg;

								final int RX10_TEMP133 = Program.searchPointInRegion1(RX10_TEMP132, RX10_TEMP130);

								final int RX10_TEMP134 = 0;

								final boolean RX10_TEMP135 = RX10_TEMP133 < RX10_TEMP134;
								if(RX10_TEMP135)
									{

									String RX10_TEMP136 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP136);

									}

								final Dist SX10_TEMP9 = RX10_TEMP131.dDist;

								final int RX10_TEMP137 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP133);

								final int RX10_TEMP139 = 0;

								final boolean RX10_TEMP140 = RX10_TEMP137 != RX10_TEMP139;
								if(RX10_TEMP140)
									{

									String RX10_TEMP138 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP138);

									}

								final DOUBLEArray RX10_TEMP141 = dataD.contents;
								Program.DOUBLESetValue(RX10_TEMP141, RX10_TEMP133, X10_TEMP115);

								final int X10_TEMP117 = 2;

								final double X10_TEMP120 = fz;

								final Point1 RX10_TEMP142 = new Point1(X10_TEMP117);

								final Dist1 RX10_TEMP143 = dataD.distValue;

								final Region1 RX10_TEMP144 = RX10_TEMP143.dReg;

								final int RX10_TEMP145 = Program.searchPointInRegion1(RX10_TEMP144, RX10_TEMP142);

								final int RX10_TEMP146 = 0;

								final boolean RX10_TEMP147 = RX10_TEMP145 < RX10_TEMP146;
								if(RX10_TEMP147)
									{

									String RX10_TEMP148 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP148);

									}

								final Dist SX10_TEMP10 = RX10_TEMP143.dDist;

								final int RX10_TEMP149 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP145);

								final int RX10_TEMP151 = 0;

								final boolean RX10_TEMP152 = RX10_TEMP149 != RX10_TEMP151;
								if(RX10_TEMP152)
									{

									String RX10_TEMP150 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP150);

									}

								final DOUBLEArray RX10_TEMP153 = dataD.contents;
								Program.DOUBLESetValue(RX10_TEMP153, RX10_TEMP145, X10_TEMP120);
								}
							}
						}
					}

				final ParticleRefArray1 X10_TEMP121 = t.one;

				final Point1 RX10_TEMP154 = new Point1(k);

				final Dist1 RX10_TEMP155 = X10_TEMP121.distValue;

				final Region1 RX10_TEMP156 = RX10_TEMP155.dReg;

				final int RX10_TEMP157 = Program.searchPointInRegion1(RX10_TEMP156, RX10_TEMP154);

				final int RX10_TEMP158 = 0;

				final boolean RX10_TEMP159 = RX10_TEMP157 < RX10_TEMP158;
				if(RX10_TEMP159)
					{

					String RX10_TEMP160 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP160);

					}

				final Dist SX10_TEMP11 = RX10_TEMP155.dDist;

				final int RX10_TEMP161 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP157);

				final int RX10_TEMP163 = 0;

				final boolean RX10_TEMP164 = RX10_TEMP161 != RX10_TEMP163;
				if(RX10_TEMP164)
					{

					String RX10_TEMP162 = "Bad place access for array X10_TEMP121";
throw new RuntimeException(RX10_TEMP162);

					}

				final PARTICLEArray RX10_TEMP165 = X10_TEMP121.contents;

				final Particle X10_TEMP123 = Program.PARTICLEGetValue(RX10_TEMP165, RX10_TEMP157);

				final int X10_TEMP125 = 0;

				final double X10_TEMP127 = X10_TEMP123.xforce;

				final Point1 RX10_TEMP166 = new Point1(X10_TEMP125);

				final Dist1 RX10_TEMP167 = dataD.distValue;

				final Region1 RX10_TEMP168 = RX10_TEMP167.dReg;

				final int RX10_TEMP169 = Program.searchPointInRegion1(RX10_TEMP168, RX10_TEMP166);

				final int RX10_TEMP170 = 0;

				final boolean RX10_TEMP171 = RX10_TEMP169 < RX10_TEMP170;
				if(RX10_TEMP171)
					{

					String RX10_TEMP172 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP172);

					}

				final Dist SX10_TEMP12 = RX10_TEMP167.dDist;

				final int RX10_TEMP173 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP169);

				final int RX10_TEMP175 = 0;

				final boolean RX10_TEMP176 = RX10_TEMP173 != RX10_TEMP175;
				if(RX10_TEMP176)
					{

					String RX10_TEMP174 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP174);

					}

				final DOUBLEArray RX10_TEMP177 = dataD.contents;

				final double X10_TEMP128 = Program.DOUBLEGetValue(RX10_TEMP177, RX10_TEMP169);

				final double X10_TEMP129 = X10_TEMP127 + X10_TEMP128;
				X10_TEMP123.xforce = (X10_TEMP129);

				final ParticleRefArray1 X10_TEMP130 = t.one;

				final Point1 RX10_TEMP178 = new Point1(k);

				final Dist1 RX10_TEMP179 = X10_TEMP130.distValue;

				final Region1 RX10_TEMP180 = RX10_TEMP179.dReg;

				final int RX10_TEMP181 = Program.searchPointInRegion1(RX10_TEMP180, RX10_TEMP178);

				final int RX10_TEMP182 = 0;

				final boolean RX10_TEMP183 = RX10_TEMP181 < RX10_TEMP182;
				if(RX10_TEMP183)
					{

					String RX10_TEMP184 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP184);

					}

				final Dist SX10_TEMP13 = RX10_TEMP179.dDist;

				final int RX10_TEMP185 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP181);

				final int RX10_TEMP187 = 0;

				final boolean RX10_TEMP188 = RX10_TEMP185 != RX10_TEMP187;
				if(RX10_TEMP188)
					{

					String RX10_TEMP186 = "Bad place access for array X10_TEMP130";
throw new RuntimeException(RX10_TEMP186);

					}

				final PARTICLEArray RX10_TEMP189 = X10_TEMP130.contents;

				final Particle X10_TEMP132 = Program.PARTICLEGetValue(RX10_TEMP189, RX10_TEMP181);

				final int X10_TEMP134 = 1;

				final double X10_TEMP136 = X10_TEMP132.yforce;

				final Point1 RX10_TEMP190 = new Point1(X10_TEMP134);

				final Dist1 RX10_TEMP191 = dataD.distValue;

				final Region1 RX10_TEMP192 = RX10_TEMP191.dReg;

				final int RX10_TEMP193 = Program.searchPointInRegion1(RX10_TEMP192, RX10_TEMP190);

				final int RX10_TEMP194 = 0;

				final boolean RX10_TEMP195 = RX10_TEMP193 < RX10_TEMP194;
				if(RX10_TEMP195)
					{

					String RX10_TEMP196 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP196);

					}

				final Dist SX10_TEMP14 = RX10_TEMP191.dDist;

				final int RX10_TEMP197 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP193);

				final int RX10_TEMP199 = 0;

				final boolean RX10_TEMP200 = RX10_TEMP197 != RX10_TEMP199;
				if(RX10_TEMP200)
					{

					String RX10_TEMP198 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP198);

					}

				final DOUBLEArray RX10_TEMP201 = dataD.contents;

				final double X10_TEMP137 = Program.DOUBLEGetValue(RX10_TEMP201, RX10_TEMP193);

				final double X10_TEMP138 = X10_TEMP136 + X10_TEMP137;
				X10_TEMP132.yforce = (X10_TEMP138);

				final ParticleRefArray1 X10_TEMP139 = t.one;

				final Point1 RX10_TEMP202 = new Point1(k);

				final Dist1 RX10_TEMP203 = X10_TEMP139.distValue;

				final Region1 RX10_TEMP204 = RX10_TEMP203.dReg;

				final int RX10_TEMP205 = Program.searchPointInRegion1(RX10_TEMP204, RX10_TEMP202);

				final int RX10_TEMP206 = 0;

				final boolean RX10_TEMP207 = RX10_TEMP205 < RX10_TEMP206;
				if(RX10_TEMP207)
					{

					String RX10_TEMP208 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP208);

					}

				final Dist SX10_TEMP15 = RX10_TEMP203.dDist;

				final int RX10_TEMP209 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP205);

				final int RX10_TEMP211 = 0;

				final boolean RX10_TEMP212 = RX10_TEMP209 != RX10_TEMP211;
				if(RX10_TEMP212)
					{

					String RX10_TEMP210 = "Bad place access for array X10_TEMP139";
throw new RuntimeException(RX10_TEMP210);

					}

				final PARTICLEArray RX10_TEMP213 = X10_TEMP139.contents;

				final Particle X10_TEMP141 = Program.PARTICLEGetValue(RX10_TEMP213, RX10_TEMP205);

				final int X10_TEMP143 = 2;

				final double X10_TEMP145 = X10_TEMP141.zforce;

				final Point1 RX10_TEMP214 = new Point1(X10_TEMP143);

				final Dist1 RX10_TEMP215 = dataD.distValue;

				final Region1 RX10_TEMP216 = RX10_TEMP215.dReg;

				final int RX10_TEMP217 = Program.searchPointInRegion1(RX10_TEMP216, RX10_TEMP214);

				final int RX10_TEMP218 = 0;

				final boolean RX10_TEMP219 = RX10_TEMP217 < RX10_TEMP218;
				if(RX10_TEMP219)
					{

					String RX10_TEMP220 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP220);

					}

				final Dist SX10_TEMP16 = RX10_TEMP215.dDist;

				final int RX10_TEMP221 = Program.getPlaceFromDist(SX10_TEMP16, RX10_TEMP217);

				final int RX10_TEMP223 = 0;

				final boolean RX10_TEMP224 = RX10_TEMP221 != RX10_TEMP223;
				if(RX10_TEMP224)
					{

					String RX10_TEMP222 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP222);

					}

				final DOUBLEArray RX10_TEMP225 = dataD.contents;

				final double X10_TEMP146 = Program.DOUBLEGetValue(RX10_TEMP225, RX10_TEMP217);

				final double X10_TEMP147 = X10_TEMP145 + X10_TEMP146;
				X10_TEMP141.zforce = (X10_TEMP147);
				}
							{

				final Dist1 RX10_TEMP226 = P.distValue;

				final Dist1 X10_TEMP148 = RX10_TEMP226;

				final Point1 RX10_TEMP227 = new Point1(j);

				final Region1 RX10_TEMP228 = X10_TEMP148.dReg;

				final int RX10_TEMP229 = Program.searchPointInRegion1(RX10_TEMP228, RX10_TEMP227);

				final int RX10_TEMP230 = 0;

				final boolean RX10_TEMP231 = RX10_TEMP229 < RX10_TEMP230;
				if(RX10_TEMP231)
					{

					final String RX10_TEMP232 = "Point RX10_TEMP227 not found in the distribution X10_TEMP148.";
throw new RuntimeException(RX10_TEMP232);

					}

				final Dist SX10_TEMP17 = X10_TEMP148.dDist;

				final int RX10_TEMP233 = Program.getPlaceFromDist(SX10_TEMP17, RX10_TEMP229);

				final int X10_TEMP151 = RX10_TEMP233;
				//async(X10_TEMP151)
					{

					final Point1 RX10_TEMP234 = new Point1(j);

					final Dist1 RX10_TEMP235 = P.distValue;

					final Region1 RX10_TEMP236 = RX10_TEMP235.dReg;

					final int RX10_TEMP237 = Program.searchPointInRegion1(RX10_TEMP236, RX10_TEMP234);

					final int RX10_TEMP238 = 0;

					final boolean RX10_TEMP239 = RX10_TEMP237 < RX10_TEMP238;
					if(RX10_TEMP239)
						{

						String RX10_TEMP240 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP240);

						}

					final Dist SX10_TEMP18 = RX10_TEMP235.dDist;

					final int RX10_TEMP241 = Program.getPlaceFromDist(SX10_TEMP18, RX10_TEMP237);

					final int RX10_TEMP243 = 0;

					final boolean RX10_TEMP244 = RX10_TEMP241 != RX10_TEMP243;
					if(RX10_TEMP244)
						{

						String RX10_TEMP242 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP242);

						}

					final MDArray RX10_TEMP245 = P.contents;

					final md X10_TEMP153 = Program.MDGetValue(RX10_TEMP245, RX10_TEMP237);

					final double jvir = X10_TEMP153.vir;

					final Point1 RX10_TEMP246 = new Point1(j);

					final Dist1 RX10_TEMP247 = P.distValue;

					final Region1 RX10_TEMP248 = RX10_TEMP247.dReg;

					final int RX10_TEMP249 = Program.searchPointInRegion1(RX10_TEMP248, RX10_TEMP246);

					final int RX10_TEMP250 = 0;

					final boolean RX10_TEMP251 = RX10_TEMP249 < RX10_TEMP250;
					if(RX10_TEMP251)
						{

						String RX10_TEMP252 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP252);

						}

					final Dist SX10_TEMP19 = RX10_TEMP247.dDist;

					final int RX10_TEMP253 = Program.getPlaceFromDist(SX10_TEMP19, RX10_TEMP249);

					final int RX10_TEMP255 = 0;

					final boolean RX10_TEMP256 = RX10_TEMP253 != RX10_TEMP255;
					if(RX10_TEMP256)
						{

						String RX10_TEMP254 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP254);

						}

					final MDArray RX10_TEMP257 = P.contents;

					final md X10_TEMP156 = Program.MDGetValue(RX10_TEMP257, RX10_TEMP249);

					final double jepot = X10_TEMP156.epot;

					final Point1 RX10_TEMP258 = new Point1(j);

					final Dist1 RX10_TEMP259 = P.distValue;

					final Region1 RX10_TEMP260 = RX10_TEMP259.dReg;

					final int RX10_TEMP261 = Program.searchPointInRegion1(RX10_TEMP260, RX10_TEMP258);

					final int RX10_TEMP262 = 0;

					final boolean RX10_TEMP263 = RX10_TEMP261 < RX10_TEMP262;
					if(RX10_TEMP263)
						{

						String RX10_TEMP264 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP264);

						}

					final Dist SX10_TEMP20 = RX10_TEMP259.dDist;

					final int RX10_TEMP265 = Program.getPlaceFromDist(SX10_TEMP20, RX10_TEMP261);

					final int RX10_TEMP267 = 0;

					final boolean RX10_TEMP268 = RX10_TEMP265 != RX10_TEMP267;
					if(RX10_TEMP268)
						{

						String RX10_TEMP266 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP266);

						}

					final MDArray RX10_TEMP269 = P.contents;

					final md X10_TEMP159 = Program.MDGetValue(RX10_TEMP269, RX10_TEMP261);

					final int jinter = X10_TEMP159.interactions;
											{
						//async(tHere)
							{

							final int X10_TEMP163 = 0;

							final double X10_TEMP166 = jvir;

							final Point1 RX10_TEMP270 = new Point1(X10_TEMP163);

							final Dist1 RX10_TEMP271 = dataD.distValue;

							final Region1 RX10_TEMP272 = RX10_TEMP271.dReg;

							final int RX10_TEMP273 = Program.searchPointInRegion1(RX10_TEMP272, RX10_TEMP270);

							final int RX10_TEMP274 = 0;

							final boolean RX10_TEMP275 = RX10_TEMP273 < RX10_TEMP274;
							if(RX10_TEMP275)
								{

								String RX10_TEMP276 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP276);

								}

							final Dist SX10_TEMP21 = RX10_TEMP271.dDist;

							final int RX10_TEMP277 = Program.getPlaceFromDist(SX10_TEMP21, RX10_TEMP273);

							final int RX10_TEMP279 = 0;

							final boolean RX10_TEMP280 = RX10_TEMP277 != RX10_TEMP279;
							if(RX10_TEMP280)
								{

								String RX10_TEMP278 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP278);

								}

							final DOUBLEArray RX10_TEMP281 = dataD.contents;
							Program.DOUBLESetValue(RX10_TEMP281, RX10_TEMP273, X10_TEMP166);

							final int X10_TEMP168 = 1;

							final double X10_TEMP171 = jepot;

							final Point1 RX10_TEMP282 = new Point1(X10_TEMP168);

							final Dist1 RX10_TEMP283 = dataD.distValue;

							final Region1 RX10_TEMP284 = RX10_TEMP283.dReg;

							final int RX10_TEMP285 = Program.searchPointInRegion1(RX10_TEMP284, RX10_TEMP282);

							final int RX10_TEMP286 = 0;

							final boolean RX10_TEMP287 = RX10_TEMP285 < RX10_TEMP286;
							if(RX10_TEMP287)
								{

								String RX10_TEMP288 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP288);

								}

							final Dist SX10_TEMP22 = RX10_TEMP283.dDist;

							final int RX10_TEMP289 = Program.getPlaceFromDist(SX10_TEMP22, RX10_TEMP285);

							final int RX10_TEMP291 = 0;

							final boolean RX10_TEMP292 = RX10_TEMP289 != RX10_TEMP291;
							if(RX10_TEMP292)
								{

								String RX10_TEMP290 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP290);

								}

							final DOUBLEArray RX10_TEMP293 = dataD.contents;
							Program.DOUBLESetValue(RX10_TEMP293, RX10_TEMP285, X10_TEMP171);

							final int X10_TEMP173 = 0;

							final double X10_TEMP176 = jinter;

							final Point1 RX10_TEMP294 = new Point1(X10_TEMP173);

							final Dist1 RX10_TEMP295 = dataI.distValue;

							final Region1 RX10_TEMP296 = RX10_TEMP295.dReg;

							final int RX10_TEMP297 = Program.searchPointInRegion1(RX10_TEMP296, RX10_TEMP294);

							final int RX10_TEMP298 = 0;

							final boolean RX10_TEMP299 = RX10_TEMP297 < RX10_TEMP298;
							if(RX10_TEMP299)
								{

								String RX10_TEMP300 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP300);

								}

							final Dist SX10_TEMP23 = RX10_TEMP295.dDist;

							final int RX10_TEMP301 = Program.getPlaceFromDist(SX10_TEMP23, RX10_TEMP297);

							final int RX10_TEMP303 = 0;

							final boolean RX10_TEMP304 = RX10_TEMP301 != RX10_TEMP303;
							if(RX10_TEMP304)
								{

								String RX10_TEMP302 = "Bad place access for array dataI";
throw new RuntimeException(RX10_TEMP302);

								}

							final DOUBLEArray RX10_TEMP305 = dataI.contents;
							Program.DOUBLESetValue(RX10_TEMP305, RX10_TEMP297, X10_TEMP176);
							}
						}
					}
				}

			final int X10_TEMP178 = 0;

			final double X10_TEMP180 = t.vir;

			final Point1 RX10_TEMP306 = new Point1(X10_TEMP178);

			final Dist1 RX10_TEMP307 = dataD.distValue;

			final Region1 RX10_TEMP308 = RX10_TEMP307.dReg;

			final int RX10_TEMP309 = Program.searchPointInRegion1(RX10_TEMP308, RX10_TEMP306);

			final int RX10_TEMP310 = 0;

			final boolean RX10_TEMP311 = RX10_TEMP309 < RX10_TEMP310;
			if(RX10_TEMP311)
				{

				String RX10_TEMP312 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP312);

				}

			final Dist SX10_TEMP24 = RX10_TEMP307.dDist;

			final int RX10_TEMP313 = Program.getPlaceFromDist(SX10_TEMP24, RX10_TEMP309);

			final int RX10_TEMP315 = 0;

			final boolean RX10_TEMP316 = RX10_TEMP313 != RX10_TEMP315;
			if(RX10_TEMP316)
				{

				String RX10_TEMP314 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP314);

				}

			final DOUBLEArray RX10_TEMP317 = dataD.contents;

			final double X10_TEMP181 = Program.DOUBLEGetValue(RX10_TEMP317, RX10_TEMP309);

			final double X10_TEMP182 = X10_TEMP180 + X10_TEMP181;
			t.vir = (X10_TEMP182);

			final int X10_TEMP184 = 1;

			final double X10_TEMP186 = t.epot;

			final Point1 RX10_TEMP318 = new Point1(X10_TEMP184);

			final Dist1 RX10_TEMP319 = dataD.distValue;

			final Region1 RX10_TEMP320 = RX10_TEMP319.dReg;

			final int RX10_TEMP321 = Program.searchPointInRegion1(RX10_TEMP320, RX10_TEMP318);

			final int RX10_TEMP322 = 0;

			final boolean RX10_TEMP323 = RX10_TEMP321 < RX10_TEMP322;
			if(RX10_TEMP323)
				{

				String RX10_TEMP324 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP324);

				}

			final Dist SX10_TEMP25 = RX10_TEMP319.dDist;

			final int RX10_TEMP325 = Program.getPlaceFromDist(SX10_TEMP25, RX10_TEMP321);

			final int RX10_TEMP327 = 0;

			final boolean RX10_TEMP328 = RX10_TEMP325 != RX10_TEMP327;
			if(RX10_TEMP328)
				{

				String RX10_TEMP326 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP326);

				}

			final DOUBLEArray RX10_TEMP329 = dataD.contents;

			final double X10_TEMP187 = Program.DOUBLEGetValue(RX10_TEMP329, RX10_TEMP321);

			final double X10_TEMP188 = X10_TEMP186 + X10_TEMP187;
			t.epot = (X10_TEMP188);

			final int X10_TEMP190 = 0;

			final Point1 RX10_TEMP330 = new Point1(X10_TEMP190);

			final Dist1 RX10_TEMP331 = dataI.distValue;

			final Region1 RX10_TEMP332 = RX10_TEMP331.dReg;

			final int RX10_TEMP333 = Program.searchPointInRegion1(RX10_TEMP332, RX10_TEMP330);

			final int RX10_TEMP334 = 0;

			final boolean RX10_TEMP335 = RX10_TEMP333 < RX10_TEMP334;
			if(RX10_TEMP335)
				{

				String RX10_TEMP336 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP336);

				}

			final Dist SX10_TEMP26 = RX10_TEMP331.dDist;

			final int RX10_TEMP337 = Program.getPlaceFromDist(SX10_TEMP26, RX10_TEMP333);

			final int RX10_TEMP339 = 0;

			final boolean RX10_TEMP340 = RX10_TEMP337 != RX10_TEMP339;
			if(RX10_TEMP340)
				{

				String RX10_TEMP338 = "Bad place access for array dataI";
throw new RuntimeException(RX10_TEMP338);

				}

			final DOUBLEArray RX10_TEMP341 = dataI.contents;

			final double X10_TEMP191 = Program.DOUBLEGetValue(RX10_TEMP341, RX10_TEMP333);

			final int X10_TEMP193 = t.interactions;

			final int X10_TEMP194 = (int)X10_TEMP191;

			final int X10_TEMP195 = X10_TEMP193 + X10_TEMP194;
			t.interactions = (X10_TEMP195);
			}

		final int mymdsize = X10_TEMP0.mdsize;
					{

			final Dist1 RX10_TEMP342 = P.distValue;

			final Dist1 X10_TEMP198 = RX10_TEMP342;

			final Region1 RX10_TEMP344 = X10_TEMP198.dReg;

			final Point1[] RX10_TEMP345 = RX10_TEMP344.pointArray;
			for(int RX10_TEMP343=0; RX10_TEMP343 < RX10_TEMP345.length; RX10_TEMP343++)
				{

				final Point1 X10_TEMP200 = RX10_TEMP345[RX10_TEMP343];

				final int j = X10_TEMP200.f0;

				final Dist1 X10_TEMP199 = X10_TEMP198;

				final Region1 RX10_TEMP346 = X10_TEMP199.dReg;

				final int RX10_TEMP347 = Program.searchPointInRegion1(RX10_TEMP346, X10_TEMP200);

				final int RX10_TEMP348 = 0;

				final boolean RX10_TEMP349 = RX10_TEMP347 < RX10_TEMP348;
				if(RX10_TEMP349)
					{

					final String RX10_TEMP350 = "Point X10_TEMP200 not found in the distribution X10_TEMP199.";
throw new RuntimeException(RX10_TEMP350);

					}

				final Dist SX10_TEMP27 = X10_TEMP199.dDist;

				final int RX10_TEMP351 = Program.getPlaceFromDist(SX10_TEMP27, RX10_TEMP347);

				final int X10_TEMP201 = RX10_TEMP351;
				//async(X10_TEMP201)
					{

					final int pHere = 0;

					final int X10_TEMP205 = 0;

					final int X10_TEMP206 = 2;

					final Region1 X10_TEMP207 = Program.createNewRegion1R(X10_TEMP205, X10_TEMP206);

					final int X10_TEMP208 = 0;

					final Dist1 dD = Program.getPlaceDist1(X10_TEMP207, X10_TEMP208);

					final Region1 RX10_TEMP352 = dD.dReg;

					final Point1[] RX10_TEMP354 = RX10_TEMP352.pointArray;

					final Dist RX10_TEMP353 = dD.dDist;

					final DOUBLEArray RX10_TEMP355 = new DOUBLEArray(RX10_TEMP353);

					final doubleRefArray1 RX10_TEMP356 = new doubleRefArray1(dD, RX10_TEMP355);

					final doubleRefArray1 dataD = RX10_TEMP356;

					final int X10_TEMP216 = 0;

					final int X10_TEMP212 = 1;

					final int X10_TEMP214 = mymdsize - X10_TEMP212;

					final Region1 X10_TEMP218 = Program.createNewRegion1R(X10_TEMP216, X10_TEMP214);

					final Point1[] RX10_TEMP359 = X10_TEMP218.pointArray;
					for(int RX10_TEMP357=0; RX10_TEMP357 < RX10_TEMP359.length; RX10_TEMP357++)
						{

						final Point1 RX10_TEMP358 = RX10_TEMP359[RX10_TEMP357];

						final int k = RX10_TEMP358.f0;
													{
							//async(tHere)
								{

								final ParticleRefArray1 X10_TEMP220 = t.one;

								final Point1 RX10_TEMP360 = new Point1(k);

								final Dist1 RX10_TEMP361 = X10_TEMP220.distValue;

								final Region1 RX10_TEMP362 = RX10_TEMP361.dReg;

								final int RX10_TEMP363 = Program.searchPointInRegion1(RX10_TEMP362, RX10_TEMP360);

								final int RX10_TEMP364 = 0;

								final boolean RX10_TEMP365 = RX10_TEMP363 < RX10_TEMP364;
								if(RX10_TEMP365)
									{

									String RX10_TEMP366 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP366);

									}

								final Dist SX10_TEMP28 = RX10_TEMP361.dDist;

								final int RX10_TEMP367 = Program.getPlaceFromDist(SX10_TEMP28, RX10_TEMP363);

								final int RX10_TEMP369 = 0;

								final boolean RX10_TEMP370 = RX10_TEMP367 != RX10_TEMP369;
								if(RX10_TEMP370)
									{

									String RX10_TEMP368 = "Bad place access for array X10_TEMP220";
throw new RuntimeException(RX10_TEMP368);

									}

								final PARTICLEArray RX10_TEMP371 = X10_TEMP220.contents;

								final Particle X10_TEMP222 = Program.PARTICLEGetValue(RX10_TEMP371, RX10_TEMP363);

								final double xf = X10_TEMP222.xforce;

								final ParticleRefArray1 X10_TEMP224 = t.one;

								final Point1 RX10_TEMP372 = new Point1(k);

								final Dist1 RX10_TEMP373 = X10_TEMP224.distValue;

								final Region1 RX10_TEMP374 = RX10_TEMP373.dReg;

								final int RX10_TEMP375 = Program.searchPointInRegion1(RX10_TEMP374, RX10_TEMP372);

								final int RX10_TEMP376 = 0;

								final boolean RX10_TEMP377 = RX10_TEMP375 < RX10_TEMP376;
								if(RX10_TEMP377)
									{

									String RX10_TEMP378 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP378);

									}

								final Dist SX10_TEMP29 = RX10_TEMP373.dDist;

								final int RX10_TEMP379 = Program.getPlaceFromDist(SX10_TEMP29, RX10_TEMP375);

								final int RX10_TEMP381 = 0;

								final boolean RX10_TEMP382 = RX10_TEMP379 != RX10_TEMP381;
								if(RX10_TEMP382)
									{

									String RX10_TEMP380 = "Bad place access for array X10_TEMP224";
throw new RuntimeException(RX10_TEMP380);

									}

								final PARTICLEArray RX10_TEMP383 = X10_TEMP224.contents;

								final Particle X10_TEMP226 = Program.PARTICLEGetValue(RX10_TEMP383, RX10_TEMP375);

								final double yf = X10_TEMP226.yforce;

								final ParticleRefArray1 X10_TEMP228 = t.one;

								final Point1 RX10_TEMP384 = new Point1(k);

								final Dist1 RX10_TEMP385 = X10_TEMP228.distValue;

								final Region1 RX10_TEMP386 = RX10_TEMP385.dReg;

								final int RX10_TEMP387 = Program.searchPointInRegion1(RX10_TEMP386, RX10_TEMP384);

								final int RX10_TEMP388 = 0;

								final boolean RX10_TEMP389 = RX10_TEMP387 < RX10_TEMP388;
								if(RX10_TEMP389)
									{

									String RX10_TEMP390 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP390);

									}

								final Dist SX10_TEMP30 = RX10_TEMP385.dDist;

								final int RX10_TEMP391 = Program.getPlaceFromDist(SX10_TEMP30, RX10_TEMP387);

								final int RX10_TEMP393 = 0;

								final boolean RX10_TEMP394 = RX10_TEMP391 != RX10_TEMP393;
								if(RX10_TEMP394)
									{

									String RX10_TEMP392 = "Bad place access for array X10_TEMP228";
throw new RuntimeException(RX10_TEMP392);

									}

								final PARTICLEArray RX10_TEMP395 = X10_TEMP228.contents;

								final Particle X10_TEMP230 = Program.PARTICLEGetValue(RX10_TEMP395, RX10_TEMP387);

								final double zf = X10_TEMP230.zforce;
																	{
									//async(pHere)
										{

										final int X10_TEMP234 = 0;

										final double X10_TEMP237 = xf;

										final Point1 RX10_TEMP396 = new Point1(X10_TEMP234);

										final Dist1 RX10_TEMP397 = dataD.distValue;

										final Region1 RX10_TEMP398 = RX10_TEMP397.dReg;

										final int RX10_TEMP399 = Program.searchPointInRegion1(RX10_TEMP398, RX10_TEMP396);

										final int RX10_TEMP400 = 0;

										final boolean RX10_TEMP401 = RX10_TEMP399 < RX10_TEMP400;
										if(RX10_TEMP401)
											{

											String RX10_TEMP402 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP402);

											}

										final Dist SX10_TEMP31 = RX10_TEMP397.dDist;

										final int RX10_TEMP403 = Program.getPlaceFromDist(SX10_TEMP31, RX10_TEMP399);

										final int RX10_TEMP405 = 0;

										final boolean RX10_TEMP406 = RX10_TEMP403 != RX10_TEMP405;
										if(RX10_TEMP406)
											{

											String RX10_TEMP404 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP404);

											}

										final DOUBLEArray RX10_TEMP407 = dataD.contents;
										Program.DOUBLESetValue(RX10_TEMP407, RX10_TEMP399, X10_TEMP237);

										final int X10_TEMP239 = 1;

										final double X10_TEMP242 = yf;

										final Point1 RX10_TEMP408 = new Point1(X10_TEMP239);

										final Dist1 RX10_TEMP409 = dataD.distValue;

										final Region1 RX10_TEMP410 = RX10_TEMP409.dReg;

										final int RX10_TEMP411 = Program.searchPointInRegion1(RX10_TEMP410, RX10_TEMP408);

										final int RX10_TEMP412 = 0;

										final boolean RX10_TEMP413 = RX10_TEMP411 < RX10_TEMP412;
										if(RX10_TEMP413)
											{

											String RX10_TEMP414 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP414);

											}

										final Dist SX10_TEMP32 = RX10_TEMP409.dDist;

										final int RX10_TEMP415 = Program.getPlaceFromDist(SX10_TEMP32, RX10_TEMP411);

										final int RX10_TEMP417 = 0;

										final boolean RX10_TEMP418 = RX10_TEMP415 != RX10_TEMP417;
										if(RX10_TEMP418)
											{

											String RX10_TEMP416 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP416);

											}

										final DOUBLEArray RX10_TEMP419 = dataD.contents;
										Program.DOUBLESetValue(RX10_TEMP419, RX10_TEMP411, X10_TEMP242);

										final int X10_TEMP244 = 2;

										final double X10_TEMP247 = zf;

										final Point1 RX10_TEMP420 = new Point1(X10_TEMP244);

										final Dist1 RX10_TEMP421 = dataD.distValue;

										final Region1 RX10_TEMP422 = RX10_TEMP421.dReg;

										final int RX10_TEMP423 = Program.searchPointInRegion1(RX10_TEMP422, RX10_TEMP420);

										final int RX10_TEMP424 = 0;

										final boolean RX10_TEMP425 = RX10_TEMP423 < RX10_TEMP424;
										if(RX10_TEMP425)
											{

											String RX10_TEMP426 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP426);

											}

										final Dist SX10_TEMP33 = RX10_TEMP421.dDist;

										final int RX10_TEMP427 = Program.getPlaceFromDist(SX10_TEMP33, RX10_TEMP423);

										final int RX10_TEMP429 = 0;

										final boolean RX10_TEMP430 = RX10_TEMP427 != RX10_TEMP429;
										if(RX10_TEMP430)
											{

											String RX10_TEMP428 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP428);

											}

										final DOUBLEArray RX10_TEMP431 = dataD.contents;
										Program.DOUBLESetValue(RX10_TEMP431, RX10_TEMP423, X10_TEMP247);
										}
									}
								}
							}

						final Point1 RX10_TEMP432 = new Point1(j);

						final Dist1 RX10_TEMP433 = P.distValue;

						final Region1 RX10_TEMP434 = RX10_TEMP433.dReg;

						final int RX10_TEMP435 = Program.searchPointInRegion1(RX10_TEMP434, RX10_TEMP432);

						final int RX10_TEMP436 = 0;

						final boolean RX10_TEMP437 = RX10_TEMP435 < RX10_TEMP436;
						if(RX10_TEMP437)
							{

							String RX10_TEMP438 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP438);

							}

						final Dist SX10_TEMP34 = RX10_TEMP433.dDist;

						final int RX10_TEMP439 = Program.getPlaceFromDist(SX10_TEMP34, RX10_TEMP435);

						final int RX10_TEMP441 = 0;

						final boolean RX10_TEMP442 = RX10_TEMP439 != RX10_TEMP441;
						if(RX10_TEMP442)
							{

							String RX10_TEMP440 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP440);

							}

						final MDArray RX10_TEMP443 = P.contents;

						final md X10_TEMP249 = Program.MDGetValue(RX10_TEMP443, RX10_TEMP435);

						final ParticleRefArray1 X10_TEMP250 = X10_TEMP249.one;

						final Point1 RX10_TEMP444 = new Point1(k);

						final Dist1 RX10_TEMP445 = X10_TEMP250.distValue;

						final Region1 RX10_TEMP446 = RX10_TEMP445.dReg;

						final int RX10_TEMP447 = Program.searchPointInRegion1(RX10_TEMP446, RX10_TEMP444);

						final int RX10_TEMP448 = 0;

						final boolean RX10_TEMP449 = RX10_TEMP447 < RX10_TEMP448;
						if(RX10_TEMP449)
							{

							String RX10_TEMP450 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP450);

							}

						final Dist SX10_TEMP35 = RX10_TEMP445.dDist;

						final int RX10_TEMP451 = Program.getPlaceFromDist(SX10_TEMP35, RX10_TEMP447);

						final int RX10_TEMP453 = 0;

						final boolean RX10_TEMP454 = RX10_TEMP451 != RX10_TEMP453;
						if(RX10_TEMP454)
							{

							String RX10_TEMP452 = "Bad place access for array X10_TEMP250";
throw new RuntimeException(RX10_TEMP452);

							}

						final PARTICLEArray RX10_TEMP455 = X10_TEMP250.contents;

						final Particle X10_TEMP252 = Program.PARTICLEGetValue(RX10_TEMP455, RX10_TEMP447);

						final int X10_TEMP254 = 0;

						final Point1 RX10_TEMP456 = new Point1(X10_TEMP254);

						final Dist1 RX10_TEMP457 = dataD.distValue;

						final Region1 RX10_TEMP458 = RX10_TEMP457.dReg;

						final int RX10_TEMP459 = Program.searchPointInRegion1(RX10_TEMP458, RX10_TEMP456);

						final int RX10_TEMP460 = 0;

						final boolean RX10_TEMP461 = RX10_TEMP459 < RX10_TEMP460;
						if(RX10_TEMP461)
							{

							String RX10_TEMP462 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP462);

							}

						final Dist SX10_TEMP36 = RX10_TEMP457.dDist;

						final int RX10_TEMP463 = Program.getPlaceFromDist(SX10_TEMP36, RX10_TEMP459);

						final int RX10_TEMP465 = 0;

						final boolean RX10_TEMP466 = RX10_TEMP463 != RX10_TEMP465;
						if(RX10_TEMP466)
							{

							String RX10_TEMP464 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP464);

							}

						final DOUBLEArray RX10_TEMP467 = dataD.contents;

						final double X10_TEMP257 = Program.DOUBLEGetValue(RX10_TEMP467, RX10_TEMP459);

						final double X10_TEMP258 = X10_TEMP257;
						X10_TEMP252.xforce = (X10_TEMP258);

						final Point1 RX10_TEMP468 = new Point1(j);

						final Dist1 RX10_TEMP469 = P.distValue;

						final Region1 RX10_TEMP470 = RX10_TEMP469.dReg;

						final int RX10_TEMP471 = Program.searchPointInRegion1(RX10_TEMP470, RX10_TEMP468);

						final int RX10_TEMP472 = 0;

						final boolean RX10_TEMP473 = RX10_TEMP471 < RX10_TEMP472;
						if(RX10_TEMP473)
							{

							String RX10_TEMP474 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP474);

							}

						final Dist SX10_TEMP37 = RX10_TEMP469.dDist;

						final int RX10_TEMP475 = Program.getPlaceFromDist(SX10_TEMP37, RX10_TEMP471);

						final int RX10_TEMP477 = 0;

						final boolean RX10_TEMP478 = RX10_TEMP475 != RX10_TEMP477;
						if(RX10_TEMP478)
							{

							String RX10_TEMP476 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP476);

							}

						final MDArray RX10_TEMP479 = P.contents;

						final md X10_TEMP260 = Program.MDGetValue(RX10_TEMP479, RX10_TEMP471);

						final ParticleRefArray1 X10_TEMP261 = X10_TEMP260.one;

						final Point1 RX10_TEMP480 = new Point1(k);

						final Dist1 RX10_TEMP481 = X10_TEMP261.distValue;

						final Region1 RX10_TEMP482 = RX10_TEMP481.dReg;

						final int RX10_TEMP483 = Program.searchPointInRegion1(RX10_TEMP482, RX10_TEMP480);

						final int RX10_TEMP484 = 0;

						final boolean RX10_TEMP485 = RX10_TEMP483 < RX10_TEMP484;
						if(RX10_TEMP485)
							{

							String RX10_TEMP486 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP486);

							}

						final Dist SX10_TEMP38 = RX10_TEMP481.dDist;

						final int RX10_TEMP487 = Program.getPlaceFromDist(SX10_TEMP38, RX10_TEMP483);

						final int RX10_TEMP489 = 0;

						final boolean RX10_TEMP490 = RX10_TEMP487 != RX10_TEMP489;
						if(RX10_TEMP490)
							{

							String RX10_TEMP488 = "Bad place access for array X10_TEMP261";
throw new RuntimeException(RX10_TEMP488);

							}

						final PARTICLEArray RX10_TEMP491 = X10_TEMP261.contents;

						final Particle X10_TEMP263 = Program.PARTICLEGetValue(RX10_TEMP491, RX10_TEMP483);

						final int X10_TEMP265 = 1;

						final Point1 RX10_TEMP492 = new Point1(X10_TEMP265);

						final Dist1 RX10_TEMP493 = dataD.distValue;

						final Region1 RX10_TEMP494 = RX10_TEMP493.dReg;

						final int RX10_TEMP495 = Program.searchPointInRegion1(RX10_TEMP494, RX10_TEMP492);

						final int RX10_TEMP496 = 0;

						final boolean RX10_TEMP497 = RX10_TEMP495 < RX10_TEMP496;
						if(RX10_TEMP497)
							{

							String RX10_TEMP498 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP498);

							}

						final Dist SX10_TEMP39 = RX10_TEMP493.dDist;

						final int RX10_TEMP499 = Program.getPlaceFromDist(SX10_TEMP39, RX10_TEMP495);

						final int RX10_TEMP501 = 0;

						final boolean RX10_TEMP502 = RX10_TEMP499 != RX10_TEMP501;
						if(RX10_TEMP502)
							{

							String RX10_TEMP500 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP500);

							}

						final DOUBLEArray RX10_TEMP503 = dataD.contents;

						final double X10_TEMP268 = Program.DOUBLEGetValue(RX10_TEMP503, RX10_TEMP495);

						final double X10_TEMP269 = X10_TEMP268;
						X10_TEMP263.yforce = (X10_TEMP269);

						final Point1 RX10_TEMP504 = new Point1(j);

						final Dist1 RX10_TEMP505 = P.distValue;

						final Region1 RX10_TEMP506 = RX10_TEMP505.dReg;

						final int RX10_TEMP507 = Program.searchPointInRegion1(RX10_TEMP506, RX10_TEMP504);

						final int RX10_TEMP508 = 0;

						final boolean RX10_TEMP509 = RX10_TEMP507 < RX10_TEMP508;
						if(RX10_TEMP509)
							{

							String RX10_TEMP510 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP510);

							}

						final Dist SX10_TEMP40 = RX10_TEMP505.dDist;

						final int RX10_TEMP511 = Program.getPlaceFromDist(SX10_TEMP40, RX10_TEMP507);

						final int RX10_TEMP513 = 0;

						final boolean RX10_TEMP514 = RX10_TEMP511 != RX10_TEMP513;
						if(RX10_TEMP514)
							{

							String RX10_TEMP512 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP512);

							}

						final MDArray RX10_TEMP515 = P.contents;

						final md X10_TEMP271 = Program.MDGetValue(RX10_TEMP515, RX10_TEMP507);

						final ParticleRefArray1 X10_TEMP272 = X10_TEMP271.one;

						final Point1 RX10_TEMP516 = new Point1(k);

						final Dist1 RX10_TEMP517 = X10_TEMP272.distValue;

						final Region1 RX10_TEMP518 = RX10_TEMP517.dReg;

						final int RX10_TEMP519 = Program.searchPointInRegion1(RX10_TEMP518, RX10_TEMP516);

						final int RX10_TEMP520 = 0;

						final boolean RX10_TEMP521 = RX10_TEMP519 < RX10_TEMP520;
						if(RX10_TEMP521)
							{

							String RX10_TEMP522 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP522);

							}

						final Dist SX10_TEMP41 = RX10_TEMP517.dDist;

						final int RX10_TEMP523 = Program.getPlaceFromDist(SX10_TEMP41, RX10_TEMP519);

						final int RX10_TEMP525 = 0;

						final boolean RX10_TEMP526 = RX10_TEMP523 != RX10_TEMP525;
						if(RX10_TEMP526)
							{

							String RX10_TEMP524 = "Bad place access for array X10_TEMP272";
throw new RuntimeException(RX10_TEMP524);

							}

						final PARTICLEArray RX10_TEMP527 = X10_TEMP272.contents;

						final Particle X10_TEMP274 = Program.PARTICLEGetValue(RX10_TEMP527, RX10_TEMP519);

						final int X10_TEMP276 = 2;

						final Point1 RX10_TEMP528 = new Point1(X10_TEMP276);

						final Dist1 RX10_TEMP529 = dataD.distValue;

						final Region1 RX10_TEMP530 = RX10_TEMP529.dReg;

						final int RX10_TEMP531 = Program.searchPointInRegion1(RX10_TEMP530, RX10_TEMP528);

						final int RX10_TEMP532 = 0;

						final boolean RX10_TEMP533 = RX10_TEMP531 < RX10_TEMP532;
						if(RX10_TEMP533)
							{

							String RX10_TEMP534 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP534);

							}

						final Dist SX10_TEMP42 = RX10_TEMP529.dDist;

						final int RX10_TEMP535 = Program.getPlaceFromDist(SX10_TEMP42, RX10_TEMP531);

						final int RX10_TEMP537 = 0;

						final boolean RX10_TEMP538 = RX10_TEMP535 != RX10_TEMP537;
						if(RX10_TEMP538)
							{

							String RX10_TEMP536 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP536);

							}

						final DOUBLEArray RX10_TEMP539 = dataD.contents;

						final double X10_TEMP279 = Program.DOUBLEGetValue(RX10_TEMP539, RX10_TEMP531);

						final double X10_TEMP280 = X10_TEMP279;
						X10_TEMP274.zforce = (X10_TEMP280);
						}

					final int X10_TEMP283 = 0;

					final int X10_TEMP284 = 0;

					final Region1 X10_TEMP285 = Program.createNewRegion1R(X10_TEMP283, X10_TEMP284);

					final int X10_TEMP286 = 0;

					final Dist1 dI = Program.getPlaceDist1(X10_TEMP285, X10_TEMP286);

					final Region1 RX10_TEMP540 = dI.dReg;

					final Point1[] RX10_TEMP542 = RX10_TEMP540.pointArray;

					final Dist RX10_TEMP541 = dI.dDist;

					final INTArray RX10_TEMP543 = new INTArray(RX10_TEMP541);

					final intRefArray1 RX10_TEMP544 = new intRefArray1(dI, RX10_TEMP543);

					final intRefArray1 dataI = RX10_TEMP544;
											{
						//async(tHere)
							{

							final double tvir = t.vir;

							final double tepot = t.epot;

							final int tinter = t.interactions;
															{
								//async(pHere)
									{

									final int X10_TEMP295 = 0;

									final double X10_TEMP298 = tvir;

									final Point1 RX10_TEMP545 = new Point1(X10_TEMP295);

									final Dist1 RX10_TEMP546 = dataD.distValue;

									final Region1 RX10_TEMP547 = RX10_TEMP546.dReg;

									final int RX10_TEMP548 = Program.searchPointInRegion1(RX10_TEMP547, RX10_TEMP545);

									final int RX10_TEMP549 = 0;

									final boolean RX10_TEMP550 = RX10_TEMP548 < RX10_TEMP549;
									if(RX10_TEMP550)
										{

										String RX10_TEMP551 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP551);

										}

									final Dist SX10_TEMP43 = RX10_TEMP546.dDist;

									final int RX10_TEMP552 = Program.getPlaceFromDist(SX10_TEMP43, RX10_TEMP548);

									final int RX10_TEMP554 = 0;

									final boolean RX10_TEMP555 = RX10_TEMP552 != RX10_TEMP554;
									if(RX10_TEMP555)
										{

										String RX10_TEMP553 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP553);

										}

									final DOUBLEArray RX10_TEMP556 = dataD.contents;
									Program.DOUBLESetValue(RX10_TEMP556, RX10_TEMP548, X10_TEMP298);

									final int X10_TEMP300 = 1;

									final double X10_TEMP303 = tepot;

									final Point1 RX10_TEMP557 = new Point1(X10_TEMP300);

									final Dist1 RX10_TEMP558 = dataD.distValue;

									final Region1 RX10_TEMP559 = RX10_TEMP558.dReg;

									final int RX10_TEMP560 = Program.searchPointInRegion1(RX10_TEMP559, RX10_TEMP557);

									final int RX10_TEMP561 = 0;

									final boolean RX10_TEMP562 = RX10_TEMP560 < RX10_TEMP561;
									if(RX10_TEMP562)
										{

										String RX10_TEMP563 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP563);

										}

									final Dist SX10_TEMP44 = RX10_TEMP558.dDist;

									final int RX10_TEMP564 = Program.getPlaceFromDist(SX10_TEMP44, RX10_TEMP560);

									final int RX10_TEMP566 = 0;

									final boolean RX10_TEMP567 = RX10_TEMP564 != RX10_TEMP566;
									if(RX10_TEMP567)
										{

										String RX10_TEMP565 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP565);

										}

									final DOUBLEArray RX10_TEMP568 = dataD.contents;
									Program.DOUBLESetValue(RX10_TEMP568, RX10_TEMP560, X10_TEMP303);

									final int X10_TEMP305 = 0;

									final int X10_TEMP308 = tinter;

									final Point1 RX10_TEMP569 = new Point1(X10_TEMP305);

									final Dist1 RX10_TEMP570 = dataI.distValue;

									final Region1 RX10_TEMP571 = RX10_TEMP570.dReg;

									final int RX10_TEMP572 = Program.searchPointInRegion1(RX10_TEMP571, RX10_TEMP569);

									final int RX10_TEMP573 = 0;

									final boolean RX10_TEMP574 = RX10_TEMP572 < RX10_TEMP573;
									if(RX10_TEMP574)
										{

										String RX10_TEMP575 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP575);

										}

									final Dist SX10_TEMP45 = RX10_TEMP570.dDist;

									final int RX10_TEMP576 = Program.getPlaceFromDist(SX10_TEMP45, RX10_TEMP572);

									final int RX10_TEMP578 = 0;

									final boolean RX10_TEMP579 = RX10_TEMP576 != RX10_TEMP578;
									if(RX10_TEMP579)
										{

										String RX10_TEMP577 = "Bad place access for array dataI";
throw new RuntimeException(RX10_TEMP577);

										}

									final INTArray RX10_TEMP580 = dataI.contents;
									Program.INTSetValue(RX10_TEMP580, RX10_TEMP572, X10_TEMP308);
									}
								}
							}
						}

					final Point1 RX10_TEMP581 = new Point1(j);

					final Dist1 RX10_TEMP582 = P.distValue;

					final Region1 RX10_TEMP583 = RX10_TEMP582.dReg;

					final int RX10_TEMP584 = Program.searchPointInRegion1(RX10_TEMP583, RX10_TEMP581);

					final int RX10_TEMP585 = 0;

					final boolean RX10_TEMP586 = RX10_TEMP584 < RX10_TEMP585;
					if(RX10_TEMP586)
						{

						String RX10_TEMP587 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP587);

						}

					final Dist SX10_TEMP46 = RX10_TEMP582.dDist;

					final int RX10_TEMP588 = Program.getPlaceFromDist(SX10_TEMP46, RX10_TEMP584);

					final int RX10_TEMP590 = 0;

					final boolean RX10_TEMP591 = RX10_TEMP588 != RX10_TEMP590;
					if(RX10_TEMP591)
						{

						String RX10_TEMP589 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP589);

						}

					final MDArray RX10_TEMP592 = P.contents;

					final md X10_TEMP310 = Program.MDGetValue(RX10_TEMP592, RX10_TEMP584);

					final int X10_TEMP312 = 0;

					final Point1 RX10_TEMP593 = new Point1(X10_TEMP312);

					final Dist1 RX10_TEMP594 = dataD.distValue;

					final Region1 RX10_TEMP595 = RX10_TEMP594.dReg;

					final int RX10_TEMP596 = Program.searchPointInRegion1(RX10_TEMP595, RX10_TEMP593);

					final int RX10_TEMP597 = 0;

					final boolean RX10_TEMP598 = RX10_TEMP596 < RX10_TEMP597;
					if(RX10_TEMP598)
						{

						String RX10_TEMP599 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP599);

						}

					final Dist SX10_TEMP47 = RX10_TEMP594.dDist;

					final int RX10_TEMP600 = Program.getPlaceFromDist(SX10_TEMP47, RX10_TEMP596);

					final int RX10_TEMP602 = 0;

					final boolean RX10_TEMP603 = RX10_TEMP600 != RX10_TEMP602;
					if(RX10_TEMP603)
						{

						String RX10_TEMP601 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP601);

						}

					final DOUBLEArray RX10_TEMP604 = dataD.contents;

					final double X10_TEMP315 = Program.DOUBLEGetValue(RX10_TEMP604, RX10_TEMP596);

					final double X10_TEMP316 = X10_TEMP315;
					X10_TEMP310.vir = (X10_TEMP316);

					final Point1 RX10_TEMP605 = new Point1(j);

					final Dist1 RX10_TEMP606 = P.distValue;

					final Region1 RX10_TEMP607 = RX10_TEMP606.dReg;

					final int RX10_TEMP608 = Program.searchPointInRegion1(RX10_TEMP607, RX10_TEMP605);

					final int RX10_TEMP609 = 0;

					final boolean RX10_TEMP610 = RX10_TEMP608 < RX10_TEMP609;
					if(RX10_TEMP610)
						{

						String RX10_TEMP611 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP611);

						}

					final Dist SX10_TEMP48 = RX10_TEMP606.dDist;

					final int RX10_TEMP612 = Program.getPlaceFromDist(SX10_TEMP48, RX10_TEMP608);

					final int RX10_TEMP614 = 0;

					final boolean RX10_TEMP615 = RX10_TEMP612 != RX10_TEMP614;
					if(RX10_TEMP615)
						{

						String RX10_TEMP613 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP613);

						}

					final MDArray RX10_TEMP616 = P.contents;

					final md X10_TEMP318 = Program.MDGetValue(RX10_TEMP616, RX10_TEMP608);

					final int X10_TEMP320 = 1;

					final Point1 RX10_TEMP617 = new Point1(X10_TEMP320);

					final Dist1 RX10_TEMP618 = dataD.distValue;

					final Region1 RX10_TEMP619 = RX10_TEMP618.dReg;

					final int RX10_TEMP620 = Program.searchPointInRegion1(RX10_TEMP619, RX10_TEMP617);

					final int RX10_TEMP621 = 0;

					final boolean RX10_TEMP622 = RX10_TEMP620 < RX10_TEMP621;
					if(RX10_TEMP622)
						{

						String RX10_TEMP623 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP623);

						}

					final Dist SX10_TEMP49 = RX10_TEMP618.dDist;

					final int RX10_TEMP624 = Program.getPlaceFromDist(SX10_TEMP49, RX10_TEMP620);

					final int RX10_TEMP626 = 0;

					final boolean RX10_TEMP627 = RX10_TEMP624 != RX10_TEMP626;
					if(RX10_TEMP627)
						{

						String RX10_TEMP625 = "Bad place access for array dataD";
throw new RuntimeException(RX10_TEMP625);

						}

					final DOUBLEArray RX10_TEMP628 = dataD.contents;

					final double X10_TEMP323 = Program.DOUBLEGetValue(RX10_TEMP628, RX10_TEMP620);

					final double X10_TEMP324 = X10_TEMP323;
					X10_TEMP318.epot = (X10_TEMP324);

					final Point1 RX10_TEMP629 = new Point1(j);

					final Dist1 RX10_TEMP630 = P.distValue;

					final Region1 RX10_TEMP631 = RX10_TEMP630.dReg;

					final int RX10_TEMP632 = Program.searchPointInRegion1(RX10_TEMP631, RX10_TEMP629);

					final int RX10_TEMP633 = 0;

					final boolean RX10_TEMP634 = RX10_TEMP632 < RX10_TEMP633;
					if(RX10_TEMP634)
						{

						String RX10_TEMP635 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP635);

						}

					final Dist SX10_TEMP50 = RX10_TEMP630.dDist;

					final int RX10_TEMP636 = Program.getPlaceFromDist(SX10_TEMP50, RX10_TEMP632);

					final int RX10_TEMP638 = 0;

					final boolean RX10_TEMP639 = RX10_TEMP636 != RX10_TEMP638;
					if(RX10_TEMP639)
						{

						String RX10_TEMP637 = "Bad place access for array P";
throw new RuntimeException(RX10_TEMP637);

						}

					final MDArray RX10_TEMP640 = P.contents;

					final md X10_TEMP326 = Program.MDGetValue(RX10_TEMP640, RX10_TEMP632);

					final int X10_TEMP328 = 0;

					final Point1 RX10_TEMP641 = new Point1(X10_TEMP328);

					final Dist1 RX10_TEMP642 = dataI.distValue;

					final Region1 RX10_TEMP643 = RX10_TEMP642.dReg;

					final int RX10_TEMP644 = Program.searchPointInRegion1(RX10_TEMP643, RX10_TEMP641);

					final int RX10_TEMP645 = 0;

					final boolean RX10_TEMP646 = RX10_TEMP644 < RX10_TEMP645;
					if(RX10_TEMP646)
						{

						String RX10_TEMP647 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP647);

						}

					final Dist SX10_TEMP51 = RX10_TEMP642.dDist;

					final int RX10_TEMP648 = Program.getPlaceFromDist(SX10_TEMP51, RX10_TEMP644);

					final int RX10_TEMP650 = 0;

					final boolean RX10_TEMP651 = RX10_TEMP648 != RX10_TEMP650;
					if(RX10_TEMP651)
						{

						String RX10_TEMP649 = "Bad place access for array dataI";
throw new RuntimeException(RX10_TEMP649);

						}

					final INTArray RX10_TEMP652 = dataI.contents;

					final int X10_TEMP331 = Program.INTGetValue(RX10_TEMP652, RX10_TEMP644);

					final int X10_TEMP332 = X10_TEMP331;
					X10_TEMP326.interactions = (X10_TEMP332);
					}
				}
			}
		}
public static void Particle_domove ( final Particle X10_TEMP0, final double side)		{

		double X10_TEMP1 = side;

		final double X10_TEMP2 = X10_TEMP0.xcoord;

		final double X10_TEMP3 = X10_TEMP0.xvelocity;

		final double X10_TEMP4 = X10_TEMP2 + X10_TEMP3;

		final double X10_TEMP5 = X10_TEMP0.xforce;

		final double X10_TEMP8 = X10_TEMP4 + X10_TEMP5;

		final double X10_TEMP9 = X10_TEMP8;
		X10_TEMP0.xcoord = (X10_TEMP9);

		final double X10_TEMP10 = X10_TEMP0.ycoord;

		final double X10_TEMP11 = X10_TEMP0.yvelocity;

		final double X10_TEMP12 = X10_TEMP10 + X10_TEMP11;

		final double X10_TEMP13 = X10_TEMP0.yforce;

		final double X10_TEMP16 = X10_TEMP12 + X10_TEMP13;

		final double X10_TEMP17 = X10_TEMP16;
		X10_TEMP0.ycoord = (X10_TEMP17);

		final double X10_TEMP18 = X10_TEMP0.zcoord;

		final double X10_TEMP19 = X10_TEMP0.zvelocity;

		final double X10_TEMP20 = X10_TEMP18 + X10_TEMP19;

		final double X10_TEMP21 = X10_TEMP0.zforce;

		final double X10_TEMP24 = X10_TEMP20 + X10_TEMP21;

		final double X10_TEMP25 = X10_TEMP24;
		X10_TEMP0.zcoord = (X10_TEMP25);

		final double X10_TEMP26 = X10_TEMP0.xcoord;

		final int X10_TEMP27 = 0;

		final boolean X10_TEMP29 = X10_TEMP26 < X10_TEMP27;
		if(X10_TEMP29)
			{

			final double X10_TEMP30 = X10_TEMP0.xcoord;

			final double X10_TEMP33 = X10_TEMP30 + X10_TEMP1;

			final double X10_TEMP34 = X10_TEMP33;
			X10_TEMP0.xcoord = (X10_TEMP34);
			}

		final double X10_TEMP35 = X10_TEMP0.xcoord;

		final boolean X10_TEMP37 = X10_TEMP35 > X10_TEMP1;
		if(X10_TEMP37)
			{

			final double X10_TEMP38 = X10_TEMP0.xcoord;

			final double X10_TEMP41 = X10_TEMP38 - X10_TEMP1;

			final double X10_TEMP42 = X10_TEMP41;
			X10_TEMP0.xcoord = (X10_TEMP42);
			}

		final double X10_TEMP43 = X10_TEMP0.ycoord;

		final int X10_TEMP44 = 0;

		final boolean X10_TEMP46 = X10_TEMP43 < X10_TEMP44;
		if(X10_TEMP46)
			{

			final double X10_TEMP47 = X10_TEMP0.ycoord;

			final double X10_TEMP50 = X10_TEMP47 + X10_TEMP1;

			final double X10_TEMP51 = X10_TEMP50;
			X10_TEMP0.ycoord = (X10_TEMP51);
			}

		final double X10_TEMP52 = X10_TEMP0.ycoord;

		final boolean X10_TEMP54 = X10_TEMP52 > X10_TEMP1;
		if(X10_TEMP54)
			{

			final double X10_TEMP55 = X10_TEMP0.ycoord;

			final double X10_TEMP58 = X10_TEMP55 - X10_TEMP1;

			final double X10_TEMP59 = X10_TEMP58;
			X10_TEMP0.ycoord = (X10_TEMP59);
			}

		final double X10_TEMP60 = X10_TEMP0.zcoord;

		final int X10_TEMP61 = 0;

		final boolean X10_TEMP63 = X10_TEMP60 < X10_TEMP61;
		if(X10_TEMP63)
			{

			final double X10_TEMP64 = X10_TEMP0.zcoord;

			final double X10_TEMP67 = X10_TEMP64 + X10_TEMP1;

			final double X10_TEMP68 = X10_TEMP67;
			X10_TEMP0.zcoord = (X10_TEMP68);
			}

		final double X10_TEMP69 = X10_TEMP0.zcoord;

		final boolean X10_TEMP71 = X10_TEMP69 > X10_TEMP1;
		if(X10_TEMP71)
			{

			final double X10_TEMP72 = X10_TEMP0.zcoord;

			final double X10_TEMP75 = X10_TEMP72 - X10_TEMP1;

			final double X10_TEMP76 = X10_TEMP75;
			X10_TEMP0.zcoord = (X10_TEMP76);
			}

		final double X10_TEMP77 = X10_TEMP0.xvelocity;

		final double X10_TEMP78 = X10_TEMP0.xforce;

		final double X10_TEMP81 = X10_TEMP77 + X10_TEMP78;

		final double X10_TEMP82 = X10_TEMP81;
		X10_TEMP0.xvelocity = (X10_TEMP82);

		final double X10_TEMP83 = X10_TEMP0.yvelocity;

		final double X10_TEMP84 = X10_TEMP0.yforce;

		final double X10_TEMP87 = X10_TEMP83 + X10_TEMP84;

		final double X10_TEMP88 = X10_TEMP87;
		X10_TEMP0.yvelocity = (X10_TEMP88);

		final double X10_TEMP89 = X10_TEMP0.zvelocity;

		final double X10_TEMP90 = X10_TEMP0.zforce;

		final double X10_TEMP93 = X10_TEMP89 + X10_TEMP90;

		final double X10_TEMP94 = X10_TEMP93;
		X10_TEMP0.zvelocity = (X10_TEMP94);

		final double X10_TEMP97 = 0.0;

		final double X10_TEMP98 = X10_TEMP97;
		X10_TEMP0.xforce = (X10_TEMP98);

		final double X10_TEMP101 = 0.0;

		final double X10_TEMP102 = X10_TEMP101;
		X10_TEMP0.yforce = (X10_TEMP102);

		final double X10_TEMP105 = 0.0;

		final double X10_TEMP106 = X10_TEMP105;
		X10_TEMP0.zforce = (X10_TEMP106);
		}
public static void Particle_force ( final Particle X10_TEMP0, final double side, final double rcoff, final int mdsize, final int x, final md md1)		{

		double X10_TEMP1 = side;

		double X10_TEMP2 = rcoff;

		int X10_TEMP3 = mdsize;

		int X10_TEMP4 = x;

		md X10_TEMP5 = md1;

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

		final double X10_TEMP28 = 0.5;

		final double X10_TEMP30 = X10_TEMP28 * X10_TEMP1;

		sideh = X10_TEMP30;

		final double X10_TEMP32 = X10_TEMP2 * X10_TEMP2;

		rcoffs = X10_TEMP32;

		final double X10_TEMP34 = X10_TEMP0.xcoord;

		xi = X10_TEMP34;

		final double X10_TEMP36 = X10_TEMP0.ycoord;

		yi = X10_TEMP36;

		final double X10_TEMP38 = X10_TEMP0.zcoord;

		zi = X10_TEMP38;

		final double X10_TEMP40 = 0.0;

		fxi = X10_TEMP40;

		final double X10_TEMP42 = 0.0;

		fyi = X10_TEMP42;

		final double X10_TEMP44 = 0.0;

		fzi = X10_TEMP44;

		final int X10_TEMP45 = 1;

		final int X10_TEMP49 = X10_TEMP4 + X10_TEMP45;

		final int X10_TEMP47 = 1;

		final int X10_TEMP50 = X10_TEMP3 - X10_TEMP47;

		final Region1 X10_TEMP52 = Program.createNewRegion1R(X10_TEMP49, X10_TEMP50);

		final Point1[] RX10_TEMP2 = X10_TEMP52.pointArray;
		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2.length; RX10_TEMP0++)
			{

			final Point1 RX10_TEMP1 = RX10_TEMP2[RX10_TEMP0];

			final int i = RX10_TEMP1.f0;

			final ParticleRefArray1 X10_TEMP53 = X10_TEMP5.one;

			final Point1 RX10_TEMP3 = new Point1(i);

			final Dist1 RX10_TEMP4 = X10_TEMP53.distValue;

			final Region1 RX10_TEMP5 = RX10_TEMP4.dReg;

			final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, RX10_TEMP3);

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

				String RX10_TEMP11 = "Bad place access for array X10_TEMP53";
throw new RuntimeException(RX10_TEMP11);

				}

			final PARTICLEArray RX10_TEMP14 = X10_TEMP53.contents;

			final Particle X10_TEMP55 = Program.PARTICLEGetValue(RX10_TEMP14, RX10_TEMP6);

			final double X10_TEMP56 = X10_TEMP55.xcoord;

			final double X10_TEMP58 = xi - X10_TEMP56;

			xx = X10_TEMP58;

			final ParticleRefArray1 X10_TEMP59 = X10_TEMP5.one;

			final Point1 RX10_TEMP15 = new Point1(i);

			final Dist1 RX10_TEMP16 = X10_TEMP59.distValue;

			final Region1 RX10_TEMP17 = RX10_TEMP16.dReg;

			final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, RX10_TEMP15);

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

				String RX10_TEMP23 = "Bad place access for array X10_TEMP59";
throw new RuntimeException(RX10_TEMP23);

				}

			final PARTICLEArray RX10_TEMP26 = X10_TEMP59.contents;

			final Particle X10_TEMP61 = Program.PARTICLEGetValue(RX10_TEMP26, RX10_TEMP18);

			final double X10_TEMP62 = X10_TEMP61.ycoord;

			final double X10_TEMP64 = yi - X10_TEMP62;

			yy = X10_TEMP64;

			final ParticleRefArray1 X10_TEMP65 = X10_TEMP5.one;

			final Point1 RX10_TEMP27 = new Point1(i);

			final Dist1 RX10_TEMP28 = X10_TEMP65.distValue;

			final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;

			final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, RX10_TEMP27);

			final int RX10_TEMP31 = 0;

			final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
			if(RX10_TEMP32)
				{

				String RX10_TEMP33 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP33);

				}

			final Dist SX10_TEMP2 = RX10_TEMP28.dDist;

			final int RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP30);

			final int RX10_TEMP36 = 0;

			final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
			if(RX10_TEMP37)
				{

				String RX10_TEMP35 = "Bad place access for array X10_TEMP65";
throw new RuntimeException(RX10_TEMP35);

				}

			final PARTICLEArray RX10_TEMP38 = X10_TEMP65.contents;

			final Particle X10_TEMP67 = Program.PARTICLEGetValue(RX10_TEMP38, RX10_TEMP30);

			final double X10_TEMP68 = X10_TEMP67.zcoord;

			final double X10_TEMP70 = zi - X10_TEMP68;

			zz = X10_TEMP70;

			final int X10_TEMP71 = 0;

			final double X10_TEMP73 = X10_TEMP71 - sideh;

			final boolean X10_TEMP75 = xx < X10_TEMP73;
			if(X10_TEMP75)
				{

				final double X10_TEMP77 = xx + X10_TEMP1;

				xx = X10_TEMP77;
				}

			final double X10_TEMP79 = sideh;

			final boolean X10_TEMP81 = xx > X10_TEMP79;
			if(X10_TEMP81)
				{

				final double X10_TEMP83 = xx - X10_TEMP1;

				xx = X10_TEMP83;
				}

			final int X10_TEMP84 = 0;

			final double X10_TEMP86 = X10_TEMP84 - sideh;

			final boolean X10_TEMP88 = yy < X10_TEMP86;
			if(X10_TEMP88)
				{

				final double X10_TEMP90 = yy + X10_TEMP1;

				yy = X10_TEMP90;
				}

			final double X10_TEMP92 = sideh;

			final boolean X10_TEMP94 = yy > X10_TEMP92;
			if(X10_TEMP94)
				{

				final double X10_TEMP96 = yy - X10_TEMP1;

				yy = X10_TEMP96;
				}

			final int X10_TEMP97 = 0;

			final double X10_TEMP99 = X10_TEMP97 - sideh;

			final boolean X10_TEMP101 = zz < X10_TEMP99;
			if(X10_TEMP101)
				{

				final double X10_TEMP103 = zz + X10_TEMP1;

				zz = X10_TEMP103;
				}

			final double X10_TEMP105 = sideh;

			final boolean X10_TEMP107 = zz > X10_TEMP105;
			if(X10_TEMP107)
				{

				final double X10_TEMP109 = zz - X10_TEMP1;

				zz = X10_TEMP109;
				}

			final double X10_TEMP110 = xx * xx;

			final double X10_TEMP111 = yy * yy;

			final double X10_TEMP112 = X10_TEMP110 + X10_TEMP111;

			final double X10_TEMP113 = zz * zz;

			final double X10_TEMP115 = X10_TEMP112 + X10_TEMP113;

			rd = X10_TEMP115;

			final boolean X10_TEMP117 = rd <= rcoffs;
			if(X10_TEMP117)
				{

				final double X10_TEMP118 = 1.0;

				final double X10_TEMP120 = X10_TEMP118 / rd;

				rrd = X10_TEMP120;

				final double X10_TEMP122 = rrd * rrd;

				rrd2 = X10_TEMP122;

				final double X10_TEMP124 = rrd2 * rrd;

				rrd3 = X10_TEMP124;

				final double X10_TEMP126 = rrd2 * rrd2;

				rrd4 = X10_TEMP126;

				final double X10_TEMP128 = rrd2 * rrd4;

				rrd6 = X10_TEMP128;

				final double X10_TEMP130 = rrd6 * rrd;

				rrd7 = X10_TEMP130;

				final double X10_TEMP133 = X10_TEMP5.epot;

				final double X10_TEMP132 = rrd6 - rrd3;

				final double X10_TEMP136 = X10_TEMP133 + X10_TEMP132;

				final double X10_TEMP137 = X10_TEMP136;
				X10_TEMP5.epot = (X10_TEMP137);

				final double X10_TEMP138 = 0.5;

				final double X10_TEMP139 = X10_TEMP138 * rrd4;

				final double X10_TEMP141 = rrd7 - X10_TEMP139;

				r148 = X10_TEMP141;

				final double X10_TEMP142 = X10_TEMP5.vir;

				final double X10_TEMP143 = rd * r148;

				final double X10_TEMP146 = X10_TEMP142 - X10_TEMP143;

				final double X10_TEMP147 = X10_TEMP146;
				X10_TEMP5.vir = (X10_TEMP147);

				final double X10_TEMP149 = xx * r148;

				forcex = X10_TEMP149;

				final double X10_TEMP151 = fxi + forcex;

				fxi = X10_TEMP151;

				final ParticleRefArray1 X10_TEMP152 = X10_TEMP5.one;

				final Point1 RX10_TEMP39 = new Point1(i);

				final Dist1 RX10_TEMP40 = X10_TEMP152.distValue;

				final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;

				final int RX10_TEMP42 = Program.searchPointInRegion1(RX10_TEMP41, RX10_TEMP39);

				final int RX10_TEMP43 = 0;

				final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;
				if(RX10_TEMP44)
					{

					String RX10_TEMP45 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP45);

					}

				final Dist SX10_TEMP3 = RX10_TEMP40.dDist;

				final int RX10_TEMP46 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP42);

				final int RX10_TEMP48 = 0;

				final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;
				if(RX10_TEMP49)
					{

					String RX10_TEMP47 = "Bad place access for array X10_TEMP152";
throw new RuntimeException(RX10_TEMP47);

					}

				final PARTICLEArray RX10_TEMP50 = X10_TEMP152.contents;

				final Particle X10_TEMP154 = Program.PARTICLEGetValue(RX10_TEMP50, RX10_TEMP42);

				final ParticleRefArray1 X10_TEMP155 = X10_TEMP5.one;

				final Point1 RX10_TEMP51 = new Point1(i);

				final Dist1 RX10_TEMP52 = X10_TEMP155.distValue;

				final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;

				final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53, RX10_TEMP51);

				final int RX10_TEMP55 = 0;

				final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
				if(RX10_TEMP56)
					{

					String RX10_TEMP57 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP57);

					}

				final Dist SX10_TEMP4 = RX10_TEMP52.dDist;

				final int RX10_TEMP58 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP54);

				final int RX10_TEMP60 = 0;

				final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
				if(RX10_TEMP61)
					{

					String RX10_TEMP59 = "Bad place access for array X10_TEMP155";
throw new RuntimeException(RX10_TEMP59);

					}

				final PARTICLEArray RX10_TEMP62 = X10_TEMP155.contents;

				final Particle X10_TEMP157 = Program.PARTICLEGetValue(RX10_TEMP62, RX10_TEMP54);

				final double X10_TEMP158 = X10_TEMP157.xforce;

				final double X10_TEMP161 = X10_TEMP158 - forcex;

				final double X10_TEMP162 = X10_TEMP161;
				X10_TEMP154.xforce = (X10_TEMP162);

				final double X10_TEMP164 = yy * r148;

				forcey = X10_TEMP164;

				final double X10_TEMP166 = fyi + forcey;

				fyi = X10_TEMP166;

				final ParticleRefArray1 X10_TEMP167 = X10_TEMP5.one;

				final Point1 RX10_TEMP63 = new Point1(i);

				final Dist1 RX10_TEMP64 = X10_TEMP167.distValue;

				final Region1 RX10_TEMP65 = RX10_TEMP64.dReg;

				final int RX10_TEMP66 = Program.searchPointInRegion1(RX10_TEMP65, RX10_TEMP63);

				final int RX10_TEMP67 = 0;

				final boolean RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67;
				if(RX10_TEMP68)
					{

					String RX10_TEMP69 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP69);

					}

				final Dist SX10_TEMP5 = RX10_TEMP64.dDist;

				final int RX10_TEMP70 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP66);

				final int RX10_TEMP72 = 0;

				final boolean RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72;
				if(RX10_TEMP73)
					{

					String RX10_TEMP71 = "Bad place access for array X10_TEMP167";
throw new RuntimeException(RX10_TEMP71);

					}

				final PARTICLEArray RX10_TEMP74 = X10_TEMP167.contents;

				final Particle X10_TEMP169 = Program.PARTICLEGetValue(RX10_TEMP74, RX10_TEMP66);

				final ParticleRefArray1 X10_TEMP170 = X10_TEMP5.one;

				final Point1 RX10_TEMP75 = new Point1(i);

				final Dist1 RX10_TEMP76 = X10_TEMP170.distValue;

				final Region1 RX10_TEMP77 = RX10_TEMP76.dReg;

				final int RX10_TEMP78 = Program.searchPointInRegion1(RX10_TEMP77, RX10_TEMP75);

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

					String RX10_TEMP83 = "Bad place access for array X10_TEMP170";
throw new RuntimeException(RX10_TEMP83);

					}

				final PARTICLEArray RX10_TEMP86 = X10_TEMP170.contents;

				final Particle X10_TEMP172 = Program.PARTICLEGetValue(RX10_TEMP86, RX10_TEMP78);

				final double X10_TEMP173 = X10_TEMP172.yforce;

				final double X10_TEMP176 = X10_TEMP173 - forcey;

				final double X10_TEMP177 = X10_TEMP176;
				X10_TEMP169.yforce = (X10_TEMP177);

				final double X10_TEMP179 = zz * r148;

				forcez = X10_TEMP179;

				final double X10_TEMP181 = fzi + forcez;

				fzi = X10_TEMP181;

				final ParticleRefArray1 X10_TEMP182 = X10_TEMP5.one;

				final Point1 RX10_TEMP87 = new Point1(i);

				final Dist1 RX10_TEMP88 = X10_TEMP182.distValue;

				final Region1 RX10_TEMP89 = RX10_TEMP88.dReg;

				final int RX10_TEMP90 = Program.searchPointInRegion1(RX10_TEMP89, RX10_TEMP87);

				final int RX10_TEMP91 = 0;

				final boolean RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91;
				if(RX10_TEMP92)
					{

					String RX10_TEMP93 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP93);

					}

				final Dist SX10_TEMP7 = RX10_TEMP88.dDist;

				final int RX10_TEMP94 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP90);

				final int RX10_TEMP96 = 0;

				final boolean RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96;
				if(RX10_TEMP97)
					{

					String RX10_TEMP95 = "Bad place access for array X10_TEMP182";
throw new RuntimeException(RX10_TEMP95);

					}

				final PARTICLEArray RX10_TEMP98 = X10_TEMP182.contents;

				final Particle X10_TEMP184 = Program.PARTICLEGetValue(RX10_TEMP98, RX10_TEMP90);

				final ParticleRefArray1 X10_TEMP185 = X10_TEMP5.one;

				final Point1 RX10_TEMP99 = new Point1(i);

				final Dist1 RX10_TEMP100 = X10_TEMP185.distValue;

				final Region1 RX10_TEMP101 = RX10_TEMP100.dReg;

				final int RX10_TEMP102 = Program.searchPointInRegion1(RX10_TEMP101, RX10_TEMP99);

				final int RX10_TEMP103 = 0;

				final boolean RX10_TEMP104 = RX10_TEMP102 < RX10_TEMP103;
				if(RX10_TEMP104)
					{

					String RX10_TEMP105 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP105);

					}

				final Dist SX10_TEMP8 = RX10_TEMP100.dDist;

				final int RX10_TEMP106 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP102);

				final int RX10_TEMP108 = 0;

				final boolean RX10_TEMP109 = RX10_TEMP106 != RX10_TEMP108;
				if(RX10_TEMP109)
					{

					String RX10_TEMP107 = "Bad place access for array X10_TEMP185";
throw new RuntimeException(RX10_TEMP107);

					}

				final PARTICLEArray RX10_TEMP110 = X10_TEMP185.contents;

				final Particle X10_TEMP187 = Program.PARTICLEGetValue(RX10_TEMP110, RX10_TEMP102);

				final double X10_TEMP188 = X10_TEMP187.zforce;

				final double X10_TEMP191 = X10_TEMP188 - forcez;

				final double X10_TEMP192 = X10_TEMP191;
				X10_TEMP184.zforce = (X10_TEMP192);

				final int X10_TEMP193 = X10_TEMP5.interactions;

				final int X10_TEMP194 = 1;

				final int X10_TEMP195 = X10_TEMP5.interactions;

				final int X10_TEMP196 = X10_TEMP195 + X10_TEMP194;
				X10_TEMP5.interactions = (X10_TEMP196);
				}
			}

		final double X10_TEMP197 = X10_TEMP0.xforce;

		final double X10_TEMP200 = X10_TEMP197 + fxi;

		final double X10_TEMP201 = X10_TEMP200;
		X10_TEMP0.xforce = (X10_TEMP201);

		final double X10_TEMP202 = X10_TEMP0.yforce;

		final double X10_TEMP205 = X10_TEMP202 + fyi;

		final double X10_TEMP206 = X10_TEMP205;
		X10_TEMP0.yforce = (X10_TEMP206);

		final double X10_TEMP207 = X10_TEMP0.zforce;

		final double X10_TEMP210 = X10_TEMP207 + fzi;

		final double X10_TEMP211 = X10_TEMP210;
		X10_TEMP0.zforce = (X10_TEMP211);
		}
public static double Particle_mkekin ( final Particle X10_TEMP0, final double hsq2)		{

		double X10_TEMP1 = hsq2;

		double sumt = 0.0;

		final double X10_TEMP3 = X10_TEMP0.xforce;

		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP1;

		final double X10_TEMP7 = X10_TEMP6;
		X10_TEMP0.xforce = (X10_TEMP7);

		final double X10_TEMP8 = X10_TEMP0.yforce;

		final double X10_TEMP11 = X10_TEMP8 * X10_TEMP1;

		final double X10_TEMP12 = X10_TEMP11;
		X10_TEMP0.yforce = (X10_TEMP12);

		final double X10_TEMP13 = X10_TEMP0.zforce;

		final double X10_TEMP16 = X10_TEMP13 * X10_TEMP1;

		final double X10_TEMP17 = X10_TEMP16;
		X10_TEMP0.zforce = (X10_TEMP17);

		final double X10_TEMP18 = X10_TEMP0.xvelocity;

		final double X10_TEMP19 = X10_TEMP0.xforce;

		final double X10_TEMP22 = X10_TEMP18 + X10_TEMP19;

		final double X10_TEMP23 = X10_TEMP22;
		X10_TEMP0.xvelocity = (X10_TEMP23);

		final double X10_TEMP24 = X10_TEMP0.yvelocity;

		final double X10_TEMP25 = X10_TEMP0.yforce;

		final double X10_TEMP28 = X10_TEMP24 + X10_TEMP25;

		final double X10_TEMP29 = X10_TEMP28;
		X10_TEMP0.yvelocity = (X10_TEMP29);

		final double X10_TEMP30 = X10_TEMP0.zvelocity;

		final double X10_TEMP31 = X10_TEMP0.zforce;

		final double X10_TEMP34 = X10_TEMP30 + X10_TEMP31;

		final double X10_TEMP35 = X10_TEMP34;
		X10_TEMP0.zvelocity = (X10_TEMP35);

		final double X10_TEMP36 = X10_TEMP0.xvelocity;

		final double X10_TEMP37 = X10_TEMP0.xvelocity;

		final double X10_TEMP39 = X10_TEMP36 * X10_TEMP37;

		final double X10_TEMP40 = X10_TEMP0.yvelocity;

		final double X10_TEMP41 = X10_TEMP0.yvelocity;

		final double X10_TEMP43 = X10_TEMP40 * X10_TEMP41;

		final double X10_TEMP48 = X10_TEMP39 + X10_TEMP43;

		final double X10_TEMP44 = X10_TEMP0.zvelocity;

		final double X10_TEMP45 = X10_TEMP0.zvelocity;

		final double X10_TEMP47 = X10_TEMP44 * X10_TEMP45;

		final double X10_TEMP50 = X10_TEMP48 + X10_TEMP47;

		sumt = X10_TEMP50;
		return sumt;
		}
public static double Particle_velavg ( final Particle X10_TEMP0, final double vaverh, final double h, final md md1)		{

		double X10_TEMP1 = vaverh;

		double X10_TEMP2 = h;

		md X10_TEMP3 = md1;

		double velt = 0.0;

		double sq = 0.0;

		final double X10_TEMP6 = X10_TEMP0.xvelocity;

		final double X10_TEMP7 = X10_TEMP0.xvelocity;

		final double X10_TEMP10 = X10_TEMP6 * X10_TEMP7;

		final double X10_TEMP8 = X10_TEMP0.yvelocity;

		final double X10_TEMP9 = X10_TEMP0.yvelocity;

		final double X10_TEMP11 = X10_TEMP8 * X10_TEMP9;

		final double X10_TEMP14 = X10_TEMP10 + X10_TEMP11;

		final double X10_TEMP12 = X10_TEMP0.zvelocity;

		final double X10_TEMP13 = X10_TEMP0.zvelocity;

		final double X10_TEMP15 = X10_TEMP12 * X10_TEMP13;

		final double X10_TEMP17 = X10_TEMP14 + X10_TEMP15;

		final double X10_TEMP19 = Math.sqrt(X10_TEMP17);

		sq = X10_TEMP19;

		final boolean X10_TEMP21 = sq > X10_TEMP1;
		if(X10_TEMP21)
			{

			final double X10_TEMP22 = X10_TEMP3.count;

			final double X10_TEMP23 = 1.0;

			final double X10_TEMP26 = X10_TEMP22 + X10_TEMP23;

			final double X10_TEMP27 = X10_TEMP26;
			X10_TEMP3.count = (X10_TEMP27);
			}

		velt = sq;
		return velt;
		}
public static void Particle_dscal ( final Particle X10_TEMP0, final double sc, final int incx)		{

		double X10_TEMP1 = sc;

		int X10_TEMP2 = incx;

		final double X10_TEMP3 = X10_TEMP0.xvelocity;

		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP1;

		final double X10_TEMP7 = X10_TEMP6;
		X10_TEMP0.xvelocity = (X10_TEMP7);

		final double X10_TEMP8 = X10_TEMP0.yvelocity;

		final double X10_TEMP11 = X10_TEMP8 * X10_TEMP1;

		final double X10_TEMP12 = X10_TEMP11;
		X10_TEMP0.yvelocity = (X10_TEMP12);

		final double X10_TEMP13 = X10_TEMP0.zvelocity;

		final double X10_TEMP16 = X10_TEMP13 * X10_TEMP1;

		final double X10_TEMP17 = X10_TEMP16;
		X10_TEMP0.zvelocity = (X10_TEMP17);
		}
public static double Random_update ( final Random X10_TEMP0)		{

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
			X10_TEMP0.iseed = (X10_TEMP15);
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
		X10_TEMP0.iseed = (X10_TEMP49);

		final int X10_TEMP50 = X10_TEMP0.iseed;

		final double X10_TEMP52 = scale * X10_TEMP50;

		rand = X10_TEMP52;
		return rand;
		}
public static double Random_seed ( final Random X10_TEMP0)		{

		double s = 0.0;

		double u1 = 0.0;

		double u2 = 0.0;

		double r = 0.0;

		final double X10_TEMP6 = 1.0;

		s = X10_TEMP6;

		boolean X10_TEMP7 = false;
		do 			{

			final double X10_TEMP9 = Program.Random_update(X10_TEMP0);

			u1 = X10_TEMP9;

			final double X10_TEMP11 = Program.Random_update(X10_TEMP0);

			u2 = X10_TEMP11;

			final double X10_TEMP12 = 2.0;

			final double X10_TEMP13 = X10_TEMP12 * u1;

			final double X10_TEMP14 = 1.0;

			final double X10_TEMP17 = X10_TEMP13 - X10_TEMP14;

			final double X10_TEMP18 = X10_TEMP17;
			X10_TEMP0.v1 = (X10_TEMP18);

			final double X10_TEMP19 = 2.0;

			final double X10_TEMP20 = X10_TEMP19 * u2;

			final double X10_TEMP21 = 1.0;

			final double X10_TEMP24 = X10_TEMP20 - X10_TEMP21;

			final double X10_TEMP25 = X10_TEMP24;
			X10_TEMP0.v2 = (X10_TEMP25);

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
public static Dist1 getBlockCyclicDist1 ( final Region1 r, final int blockSize)		{

		final int N = r.pointArray.length;

		final int fPlace = 0;

		final Dist pointDist = Program.getCyclic(N, fPlace, blockSize);

		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
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
public static MDStub[] createMDArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final MDStub[] temp = (MDStub[])(new MDStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final MDStub is = Program.createMDStub(pl, count);
			temp[p] =is;
			}

;
		return temp;
		}
public static MDStub createMDStub ( final int remotePlace, final int count)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final MDStub[] retStub = new MDStub[retDist];
					{
			//async(remotePlace)
				{

				final MDStub to = new MDStub(count);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final MDStub to = retStub[zero];
		return to;
		}
public static md[] allocateLocalMDArray ( final int count)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final md[] temp = new md[localDist];
		return temp;
		}
public static md MDGetValue ( final MDArray arr, final int index)		{

		final int pl = 0;

		final int placeIndex = 0;

		final MDStub[] contents = arr.contents;

		final MDStub indexStub = contents[placeIndex];

		final md[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);

		final md returnValue = localArray[localIndex];
		return returnValue;
		}
public static void MDSetValue ( final MDArray arr, final int index, final md val)		{

		final int pl = 0;

		final int placeIndex = 0;

		final MDStub[] contents = arr.contents;

		final MDStub indexStub = contents[placeIndex];

		final md[] localArray = indexStub.localArray;

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
public static PARTICLEStub[] createPARTICLEArray ( final Dist distArray)		{

		final int one = 1;

		final int maxPlaces = 4;

		final int ub = maxPlaces - one;

		final int  R = ub+1;

		final int[] counts = distArray.counts;

		final PARTICLEStub[] temp = (PARTICLEStub[])(new PARTICLEStub/*value*/[R]);
/*arrayInitBlock*/
for(int p= 0;p <temp.length ;p++ )			{

			final int count = counts[p];

			final int pl = 0;

			final PARTICLEStub is = Program.createPARTICLEStub(pl, count);
			temp[p] =is;
			}

;
		return temp;
		}
public static PARTICLEStub createPARTICLEStub ( final int remotePlace, final int count)		{

		final int zero = 0;

		final int pl = 0;

		final int retDist = zero+1;

		final PARTICLEStub[] retStub = new PARTICLEStub[retDist];
					{
			//async(remotePlace)
				{

				final PARTICLEStub to = new PARTICLEStub(count);
				//async(pl)
					{
					retStub[zero] = to;
					}
				}
			}

		final PARTICLEStub to = retStub[zero];
		return to;
		}
public static Particle[] allocateLocalPARTICLEArray ( final int count)		{

		final int one = 1;

		final int sizeOfChunk = count - one;

		final int localDist = sizeOfChunk+1;

		final Particle[] temp = new Particle[localDist];
		return temp;
		}
public static Particle PARTICLEGetValue ( final PARTICLEArray arr, final int index)		{

		final int pl = 0;

		final int placeIndex = 0;

		final PARTICLEStub[] contents = arr.contents;

		final PARTICLEStub indexStub = contents[placeIndex];

		final Particle[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);

		final Particle returnValue = localArray[localIndex];
		return returnValue;
		}
public static void PARTICLESetValue ( final PARTICLEArray arr, final int index, final Particle val)		{

		final int pl = 0;

		final int placeIndex = 0;

		final PARTICLEStub[] contents = arr.contents;

		final PARTICLEStub indexStub = contents[placeIndex];

		final Particle[] localArray = indexStub.localArray;

		final Dist distArray = arr.distArray;

		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = val;
		return;
		}

}
	/*value*/ class MDStub 
	 {
 
	public final md[] localArray;


	public MDStub ( final int count)
		{

		localArray = Program.allocateLocalMDArray(count);
		}


	}
	/*value*/ class MDArray 
	 {
 
	public final MDStub[] contents;
	public final Dist distArray;


	public MDArray ( final Dist distArray_)
		{

		distArray = distArray_;

		contents = Program.createMDArray(distArray);
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
	/*value*/ class PARTICLEStub 
	 {
 
	public final Particle[] localArray;


	public PARTICLEStub ( final int count)
		{

		localArray = Program.allocateLocalPARTICLEArray(count);
		}


	}
	/*value*/ class PARTICLEArray 
	 {
 
	public final PARTICLEStub[] contents;
	public final Dist distArray;


	public PARTICLEArray ( final Dist distArray_)
		{

		distArray = distArray_;

		contents = Program.createPARTICLEArray(distArray);
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


	public Particle ( final double xcoord0, final double ycoord0, final double zcoord0, final double xvelocity0, final double yvelocity0, final double zvelocity0, final double xforce0, final double yforce0, final double zforce0)
		{

		double X10_TEMP1 = xcoord0;

		double X10_TEMP2 = ycoord0;

		double X10_TEMP3 = zcoord0;

		double X10_TEMP4 = xvelocity0;

		double X10_TEMP5 = yvelocity0;

		double X10_TEMP6 = zvelocity0;

		double X10_TEMP7 = xforce0;

		double X10_TEMP8 = yforce0;

		double X10_TEMP9 = zforce0;

		xcoord = X10_TEMP1;

		ycoord = X10_TEMP2;

		zcoord = X10_TEMP3;

		xvelocity = X10_TEMP4;

		yvelocity = X10_TEMP5;

		zvelocity = X10_TEMP6;

		xforce = X10_TEMP7;

		yforce = X10_TEMP8;

		zforce = X10_TEMP9;
		}



}
	class Random   {
 
	public int iseed;
	public double v1;
	public double v2;


	public Random ( final int iseed0, final double v10, final double v20)
		{

		int X10_TEMP1 = iseed0;

		double X10_TEMP2 = v10;

		double X10_TEMP3 = v20;

		iseed = X10_TEMP1;

		v1 = X10_TEMP2;

		v2 = X10_TEMP3;
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
	/*value*/ class ParticleRefArray1 
	 {
 
	public final Dist1 distValue;
	public final PARTICLEArray contents;


	public ParticleRefArray1 ( final Dist1 distValue_, final PARTICLEArray contents_)
		{

		distValue = distValue_;

		contents = contents_;
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
	/*value*/ class mdRefArray1 
	 {
 
	public final Dist1 distValue;
	public final MDArray contents;


	public mdRefArray1 ( final Dist1 distValue_, final MDArray contents_)
		{

		distValue = distValue_;

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
