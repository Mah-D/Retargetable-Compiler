public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
	value StreamData 
	 {
	public final Dist1 dverified;
	public final booleanRefArray1 verified;
	public final Dist1 D;
	public final doubleRefArray1 times;
	public final doubleRefArray1 a;
	public final doubleRefArray1 b;
	public final doubleRefArray1 c;


	public StreamData ( final long N, final int NUM_TIMES)
		{

		final int X10_TEMP3 = (0);

		final int X10_TEMP4 = (0);

		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);

		final place X10_TEMP6 = (here);

		final Dist1 X10_TEMP8 = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6);

		dverified=X10_TEMP8;

		final booleanRefArray1 X10_TEMP12 = Program.StreamData_initVerified(this, dverified);

		verified=X10_TEMP12;

		final int X10_TEMP18 = (0);

		final int X10_TEMP14 = (1);

		final long X10_TEMP16 = (N - X10_TEMP14);

		final int X10_TEMP19 = ((int)X10_TEMP16);

		final Region1 X10_TEMP21 = Program.createNewRegion1R(X10_TEMP18, X10_TEMP19);

		final Dist1 X10_TEMP22 = Program.getBlockDist1(X10_TEMP21);

		D=X10_TEMP22;

		final int X10_TEMP30 = (0);

		final int X10_TEMP26 = (1);

		final int X10_TEMP28 = (NUM_TIMES - X10_TEMP26);

		final int X10_TEMP31 = ((int)X10_TEMP28);

		final Region1 X10_TEMP32 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP31);

		final place X10_TEMP33 = (here);

		final Dist1 X10_TEMP35 = Program.getPlaceDist1(X10_TEMP32, X10_TEMP33);

		final doubleRefArray1 X10_TEMP37 = Program.StreamData_initArray(this, X10_TEMP35);

		times=X10_TEMP37;

		final doubleRefArray1 X10_TEMP41 = Program.StreamData_initArray(this, D);

		a=X10_TEMP41;

		final doubleRefArray1 X10_TEMP45 = Program.StreamData_initArray(this, D);

		b=X10_TEMP45;

		final doubleRefArray1 X10_TEMP49 = Program.StreamData_initArray(this, D);

		c=X10_TEMP49;
		}


	}
	class Stream   {
	public final StreamData sd;


	public Stream ( )
		{

		long X10_TEMP3 = (Program._Stream_N);

		int X10_TEMP4 = (Program._Stream_NUM_TIMES);

		final StreamData X10_TEMP6 = (new StreamData(X10_TEMP3, X10_TEMP4));

		sd=(X10_TEMP6);
		}



}
	class Timer   {
	public final Dist1 d;
	public final doubleRefArray1 start_time;
	public final doubleRefArray1 elapsed_time;
	public final doubleRefArray1 total_time;


	public Timer ( )
		{

		int i = (0);

		final int X10_TEMP4 = (0);

		final int X10_TEMP5 = (Program._Timer_max_counters);

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5);

		final place X10_TEMP7 = (place.FIRST_PLACE);

		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);

		d=X10_TEMP9;

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1 value[:rank==1] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);

		final doubleRefArray1 RX10_TEMP4 = new doubleRefArray1(d, RX10_TEMP3);

		final doubleRefArray1 X10_TEMP11 = RX10_TEMP4;

		start_time=X10_TEMP11;

		final Region1 RX10_TEMP5 = d.dReg;

		final Point1 value[:rank==1] RX10_TEMP7 = RX10_TEMP5.pointArray;

		final Dist RX10_TEMP6 = d.dDist;

		final DOUBLEArray RX10_TEMP8 = new DOUBLEArray(RX10_TEMP6);

		final doubleRefArray1 RX10_TEMP9 = new doubleRefArray1(d, RX10_TEMP8);

		final doubleRefArray1 X10_TEMP13 = RX10_TEMP9;

		elapsed_time=X10_TEMP13;

		final Region1 RX10_TEMP10 = d.dReg;

		final Point1 value[:rank==1] RX10_TEMP12 = RX10_TEMP10.pointArray;

		final Dist RX10_TEMP11 = d.dDist;

		final DOUBLEArray RX10_TEMP13 = new DOUBLEArray(RX10_TEMP11);

		final doubleRefArray1 RX10_TEMP14 = new doubleRefArray1(d, RX10_TEMP13);

		final doubleRefArray1 X10_TEMP15 = RX10_TEMP14;

		total_time=X10_TEMP15;

		final int X10_TEMP16 = (Program._Timer_max_counters);

		boolean X10_TEMP20 = i < X10_TEMP16;
		while(X10_TEMP20)
			{

			final double X10_TEMP24 = (0);

			final double X10_TEMP25 = (X10_TEMP24);

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

			final place RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP18);

			final place RX10_TEMP24 = here;

			final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
			if(RX10_TEMP25)
				{

				String RX10_TEMP23 = "Bad place access for array start_time";
throw new RuntimeException(RX10_TEMP23);

				}

			final DOUBLEArray RX10_TEMP26 = start_time.contents;
			Program.DOUBLESetValue(RX10_TEMP26,RX10_TEMP18,X10_TEMP25);

			final double X10_TEMP29 = (0);

			final double X10_TEMP30 = (X10_TEMP29);

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

			final place RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP30);

			final place RX10_TEMP36 = here;

			final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
			if(RX10_TEMP37)
				{

				String RX10_TEMP35 = "Bad place access for array elapsed_time";
throw new RuntimeException(RX10_TEMP35);

				}

			final DOUBLEArray RX10_TEMP38 = elapsed_time.contents;
			Program.DOUBLESetValue(RX10_TEMP38,RX10_TEMP30,X10_TEMP30);

			final double X10_TEMP34 = (0);

			final double X10_TEMP35 = (X10_TEMP34);

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

			final place RX10_TEMP46 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP42);

			final place RX10_TEMP48 = here;

			final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;
			if(RX10_TEMP49)
				{

				String RX10_TEMP47 = "Bad place access for array total_time";
throw new RuntimeException(RX10_TEMP47);

				}

			final DOUBLEArray RX10_TEMP50 = total_time.contents;
			Program.DOUBLESetValue(RX10_TEMP50,RX10_TEMP42,X10_TEMP35);

			final int X10_TEMP36 = (i);

			final int X10_TEMP37 = 1;

			i=i + X10_TEMP37;

			final int X10_TEMP18 = (Program._Timer_max_counters);

			X10_TEMP20=i < X10_TEMP18;
			}
		}



}
	value Region1 
	 {
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1 value[:rank==1] pointArray;


	public Region1 ( final Point1 value[:rank==1] pointArray_)
		{

		final int zero = 0;

		final int one = 1;

		final int minusOne = zero - one;

		regRank=1;

		pointArray=pointArray_;

		regType=false;

		low0=minusOne;

		dim0=zero;
		}
	public Region1 ( final Point1 value[:rank==1] pointArray_, final int low0_, final int dim0_)
		{

		regRank=1;

		pointArray=pointArray_;

		regType=true;

		low0=low0_;

		dim0=dim0_;
		}


	}
	value Point1 
	 {
	public final int f0;


	public Point1 ( final int f0_)
		{

		f0=f0_;
		}


	}
	value Dist1 
	 {
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_)
		{

		dReg=dReg_;

		dDist=dDist_;
		}


	}
	value booleanRefArray1 
	 {
	public final Dist1 distValue;
	public final BOOLEANArray contents;


	public booleanRefArray1 ( final Dist1 distValue_, final BOOLEANArray contents_)
		{

		distValue=distValue_;

		contents=contents_;
		}


	}
	value doubleRefArray1 
	 {
	public final Dist1 distValue;
	public final DOUBLEArray contents;


	public doubleRefArray1 ( final Dist1 distValue_, final DOUBLEArray contents_)
		{

		distValue=distValue_;

		contents=contents_;
		}


	}
class Program   {
public static final int _Stream_MEG = Program._Stream_MEG_init();
public static final double _Stream_alpha = Program._Stream_alpha_init();
public static final int _Stream_NUM_TIMES = Program._Stream_NUM_TIMES_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final long _Stream_N0 = Program._Stream_N0_init();
public static final long _Stream_N = Program._Stream_N_init();
public static final int _Stream_LocalSize = Program._Stream_LocalSize_init();


public static void runMain ( )		{

		Timer tmr = (new Timer());

		int count = (0);
		Program.Timer_start(tmr, count);

		final Stream X10_TEMP4 = (new Stream());
		Program.Stream_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);

		final String X10_TEMP7 = ("Wall-clock time for stream: ");

		final double X10_TEMP8 = (Program.Timer_readTimer(tmr, count));

		final String X10_TEMP9 = (X10_TEMP7 + X10_TEMP8);

		final String X10_TEMP10 = (" secs");

		final String X10_TEMP12 = (X10_TEMP9 + X10_TEMP10);
		System.out.println(X10_TEMP12);
		}
public static booleanRefArray1 StreamData_initVerified ( final StreamData X10_TEMP0, final Dist1 d)		{

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1 value[:rank==1] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final BOOLEANArray RX10_TEMP3 = new BOOLEANArray(RX10_TEMP1);
		finish 			{
			for(point(:rank==1)[RX10_TEMP4] : RX10_TEMP2)
				{
				final Dist SX10_TEMP0 = d.dDist;

				final place RX10_TEMP5 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				async(RX10_TEMP5)					{

					final Point1 p = RX10_TEMP2[RX10_TEMP4];

					final boolean X10_TEMP2 = (true);
					Program.BOOLEANSetValue(RX10_TEMP3,RX10_TEMP4,X10_TEMP2);
					}
				}
			}

		final booleanRefArray1 RX10_TEMP6 = new booleanRefArray1(d, RX10_TEMP3);

		final booleanRefArray1 X10_TEMP3 = RX10_TEMP6;
		return X10_TEMP3;
		}
public static doubleRefArray1 StreamData_initArray ( final StreamData X10_TEMP0, final Dist1 d)		{

		final Region1 RX10_TEMP0 = d.dReg;

		final Point1 value[:rank==1] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final DOUBLEArray RX10_TEMP3 = new DOUBLEArray(RX10_TEMP1);
		finish 			{
			for(point(:rank==1)[RX10_TEMP4] : RX10_TEMP2)
				{
				final Dist SX10_TEMP0 = d.dDist;

				final place RX10_TEMP6 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				async(RX10_TEMP6)					{

					final Point1 RX10_TEMP5 = RX10_TEMP2[RX10_TEMP4];

					final int i = RX10_TEMP5.f0;

					final double X10_TEMP2 = (0.0D);
					Program.DOUBLESetValue(RX10_TEMP3,RX10_TEMP4,X10_TEMP2);
					}
				}
			}

		final doubleRefArray1 RX10_TEMP7 = new doubleRefArray1(d, RX10_TEMP3);

		final doubleRefArray1 X10_TEMP3 = RX10_TEMP7;
		return X10_TEMP3;
		}
public static int _Stream_MEG_init ( )		{

		final int X10_TEMP1 = (50);

		final int X10_TEMP2 = (50);

		final int X10_TEMP4 = (X10_TEMP1 * X10_TEMP2);
		return X10_TEMP4;
		}
public static double _Stream_alpha_init ( )		{

		final double X10_TEMP2 = (3.0D);
		return X10_TEMP2;
		}
public static int _Stream_NUM_TIMES_init ( )		{

		final int X10_TEMP2 = (10);
		return X10_TEMP2;
		}
public static long _Stream_N0_init ( )		{

		final int X10_TEMP1 = (2);

		final long X10_TEMP3 = (X10_TEMP1 * _Stream_MEG);
		return X10_TEMP3;
		}
public static long _Stream_N_init ( )		{

		final int X10_TEMP1 = (place.MAX_PLACES);

		final long X10_TEMP3 = (_Stream_N0 * X10_TEMP1);
		return X10_TEMP3;
		}
public static int _Stream_LocalSize_init ( )		{

		final int X10_TEMP2 = ((int)_Stream_N0);
		return X10_TEMP2;
		}
public static void Stream_run ( final Stream X10_TEMP0)		{

		final String X10_TEMP1 = ("LocalSize=");

		final String X10_TEMP3 = (X10_TEMP1 + _Stream_LocalSize);
		System.out.println(X10_TEMP3);

		final StreamData tempSd = (X10_TEMP0.sd);
		finish 			{

			final int X10_TEMP10 = (0);

			final int X10_TEMP6 = (1);

			final int X10_TEMP8 = (_Stream_NUM_TIMES - X10_TEMP6);

			final int X10_TEMP11 = ((int)X10_TEMP8);

			Region1 r = Program.createNewRegion1R(X10_TEMP10, X10_TEMP11);

			final Point1 value[:rank==1] RX10_TEMP1 = r.pointArray;
			for(point(:rank==1)RX10_TEMP0 : RX10_TEMP1)
				{

				final Point1 p1 = RX10_TEMP1[RX10_TEMP0];
				finish 					{

					final Dist1 X10_TEMP15 = Program.getUniqueDist();

					final Region1 RX10_TEMP3 = X10_TEMP15.dReg;

					final Point1 value[:rank==1] RX10_TEMP4 = RX10_TEMP3.pointArray;
					for(point(:rank==1)RX10_TEMP2 : RX10_TEMP4)
						{

						final Point1 X10_TEMP17 = RX10_TEMP4[RX10_TEMP2];

						final int p = X10_TEMP17.f0;

						final Dist1 X10_TEMP16 = X10_TEMP15;

						final Region1 RX10_TEMP5 = X10_TEMP16.dReg;

						final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, X10_TEMP17);

						final int RX10_TEMP7 = 0;

						final boolean RX10_TEMP8 = RX10_TEMP6 < RX10_TEMP7;
						if(RX10_TEMP8)
							{

							final String RX10_TEMP9 = "Point X10_TEMP17 not found in the distribution X10_TEMP16.";
throw new RuntimeException(RX10_TEMP9);

							}
						final Dist SX10_TEMP0 = X10_TEMP16.dDist;

						final place RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

						final place X10_TEMP18 = RX10_TEMP10;
						async(X10_TEMP18)							{

							final Dist1 X10_TEMP20 = tempSd.D;

							final place X10_TEMP21 = (here);

							final Dist1 X10_TEMP23 = Program.restrictDist1(X10_TEMP20, X10_TEMP21);

							final Region1 RX10_TEMP13 = X10_TEMP23.dReg;

							final Point1 value[:rank==1] RX10_TEMP14 = RX10_TEMP13.pointArray;
							for(point(:rank==1)RX10_TEMP11 : RX10_TEMP14)
								{

								final Point1 RX10_TEMP12 = RX10_TEMP14[RX10_TEMP11];

								final int i = RX10_TEMP12.f0;

								final doubleRefArray1 X10_TEMP24 = tempSd.b;

								final double X10_TEMP29 = (1.5);

								final int X10_TEMP26 = (p * _Stream_LocalSize);

								final int X10_TEMP28 = (X10_TEMP26 + i);

								final double X10_TEMP32 = (X10_TEMP29 * X10_TEMP28);

								final double X10_TEMP33 = (X10_TEMP32);

								final Point1 RX10_TEMP15 = new Point1(i);

								final Dist1 RX10_TEMP16 = X10_TEMP24.distValue;

								final Region1 RX10_TEMP17 = RX10_TEMP16.dReg;

								final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, RX10_TEMP15);

								final int RX10_TEMP19 = 0;

								final boolean RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19;
								if(RX10_TEMP20)
									{

									String RX10_TEMP21 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP21);

									}
								final Dist SX10_TEMP1 = RX10_TEMP16.dDist;

								final place RX10_TEMP22 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP18);

								final place RX10_TEMP24 = here;

								final boolean RX10_TEMP25 = RX10_TEMP22 != RX10_TEMP24;
								if(RX10_TEMP25)
									{

									String RX10_TEMP23 = "Bad place access for array X10_TEMP24";
throw new RuntimeException(RX10_TEMP23);

									}

								final DOUBLEArray RX10_TEMP26 = X10_TEMP24.contents;
								Program.DOUBLESetValue(RX10_TEMP26,RX10_TEMP18,X10_TEMP33);

								final doubleRefArray1 X10_TEMP34 = tempSd.c;

								final double X10_TEMP39 = (2.5);

								final int X10_TEMP36 = (p * _Stream_LocalSize);

								final int X10_TEMP38 = (X10_TEMP36 + i);

								final double X10_TEMP42 = (X10_TEMP39 * X10_TEMP38);

								final double X10_TEMP43 = (X10_TEMP42);

								final Point1 RX10_TEMP27 = new Point1(i);

								final Dist1 RX10_TEMP28 = X10_TEMP34.distValue;

								final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;

								final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, RX10_TEMP27);

								final int RX10_TEMP31 = 0;

								final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
								if(RX10_TEMP32)
									{

									String RX10_TEMP33 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP33);

									}
								final Dist SX10_TEMP2 = RX10_TEMP28.dDist;

								final place RX10_TEMP34 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP30);

								final place RX10_TEMP36 = here;

								final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
								if(RX10_TEMP37)
									{

									String RX10_TEMP35 = "Bad place access for array X10_TEMP34";
throw new RuntimeException(RX10_TEMP35);

									}

								final DOUBLEArray RX10_TEMP38 = X10_TEMP34.contents;
								Program.DOUBLESetValue(RX10_TEMP38,RX10_TEMP30,X10_TEMP43);
								}

							final int X10_TEMP44 = (0);

							final boolean X10_TEMP46 = p == X10_TEMP44;
							if(X10_TEMP46)
								{

								final doubleRefArray1 X10_TEMP47 = tempSd.times;

								final double X10_TEMP49 = (Program.Stream_mySecond());

								final int X10_TEMP50 = 0;

								final double X10_TEMP53 = (X10_TEMP50 - X10_TEMP49);

								final double X10_TEMP54 = (X10_TEMP53);

								final Dist1 RX10_TEMP39 = X10_TEMP47.distValue;

								final Region1 RX10_TEMP40 = RX10_TEMP39.dReg;

								final int RX10_TEMP41 = Program.searchPointInRegion1(RX10_TEMP40, p1);

								final int RX10_TEMP42 = 0;

								final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
								if(RX10_TEMP43)
									{

									String RX10_TEMP44 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP44);

									}
								final Dist SX10_TEMP3 = RX10_TEMP39.dDist;

								final place RX10_TEMP45 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP41);

								final place RX10_TEMP47 = here;

								final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
								if(RX10_TEMP48)
									{

									String RX10_TEMP46 = "Bad place access for array X10_TEMP47";
throw new RuntimeException(RX10_TEMP46);

									}

								final DOUBLEArray RX10_TEMP49 = X10_TEMP47.contents;
								Program.DOUBLESetValue(RX10_TEMP49,RX10_TEMP41,X10_TEMP54);
								}

							final Dist1 X10_TEMP56 = tempSd.D;

							final place X10_TEMP57 = (here);

							final Dist1 X10_TEMP59 = Program.restrictDist1(X10_TEMP56, X10_TEMP57);

							final Region1 RX10_TEMP52 = X10_TEMP59.dReg;

							final Point1 value[:rank==1] RX10_TEMP53 = RX10_TEMP52.pointArray;
							for(point(:rank==1)RX10_TEMP50 : RX10_TEMP53)
								{

								final Point1 RX10_TEMP51 = RX10_TEMP53[RX10_TEMP50];

								final int i = RX10_TEMP51.f0;

								final doubleRefArray1 X10_TEMP60 = tempSd.a;

								final doubleRefArray1 X10_TEMP62 = tempSd.b;

								final Point1 RX10_TEMP54 = new Point1(i);

								final Dist1 RX10_TEMP55 = X10_TEMP62.distValue;

								final Region1 RX10_TEMP56 = RX10_TEMP55.dReg;

								final int RX10_TEMP57 = Program.searchPointInRegion1(RX10_TEMP56, RX10_TEMP54);

								final int RX10_TEMP58 = 0;

								final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58;
								if(RX10_TEMP59)
									{

									String RX10_TEMP60 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP60);

									}
								final Dist SX10_TEMP4 = RX10_TEMP55.dDist;

								final place RX10_TEMP61 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP57);

								final place RX10_TEMP63 = here;

								final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63;
								if(RX10_TEMP64)
									{

									String RX10_TEMP62 = "Bad place access for array X10_TEMP62";
throw new RuntimeException(RX10_TEMP62);

									}

								final DOUBLEArray RX10_TEMP65 = X10_TEMP62.contents;

								final double X10_TEMP67 = (Program.DOUBLEGetValue(RX10_TEMP65, RX10_TEMP57));

								final doubleRefArray1 X10_TEMP64 = tempSd.c;

								final Point1 RX10_TEMP66 = new Point1(i);

								final Dist1 RX10_TEMP67 = X10_TEMP64.distValue;

								final Region1 RX10_TEMP68 = RX10_TEMP67.dReg;

								final int RX10_TEMP69 = Program.searchPointInRegion1(RX10_TEMP68, RX10_TEMP66);

								final int RX10_TEMP70 = 0;

								final boolean RX10_TEMP71 = RX10_TEMP69 < RX10_TEMP70;
								if(RX10_TEMP71)
									{

									String RX10_TEMP72 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP72);

									}
								final Dist SX10_TEMP5 = RX10_TEMP67.dDist;

								final place RX10_TEMP73 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP69);

								final place RX10_TEMP75 = here;

								final boolean RX10_TEMP76 = RX10_TEMP73 != RX10_TEMP75;
								if(RX10_TEMP76)
									{

									String RX10_TEMP74 = "Bad place access for array X10_TEMP64";
throw new RuntimeException(RX10_TEMP74);

									}

								final DOUBLEArray RX10_TEMP77 = X10_TEMP64.contents;

								final double X10_TEMP66 = (Program.DOUBLEGetValue(RX10_TEMP77, RX10_TEMP69));

								final double X10_TEMP68 = (_Stream_alpha * X10_TEMP66);

								final double X10_TEMP71 = (X10_TEMP67 + X10_TEMP68);

								final double X10_TEMP72 = (X10_TEMP71);

								final Point1 RX10_TEMP78 = new Point1(i);

								final Dist1 RX10_TEMP79 = X10_TEMP60.distValue;

								final Region1 RX10_TEMP80 = RX10_TEMP79.dReg;

								final int RX10_TEMP81 = Program.searchPointInRegion1(RX10_TEMP80, RX10_TEMP78);

								final int RX10_TEMP82 = 0;

								final boolean RX10_TEMP83 = RX10_TEMP81 < RX10_TEMP82;
								if(RX10_TEMP83)
									{

									String RX10_TEMP84 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP84);

									}
								final Dist SX10_TEMP6 = RX10_TEMP79.dDist;

								final place RX10_TEMP85 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP81);

								final place RX10_TEMP87 = here;

								final boolean RX10_TEMP88 = RX10_TEMP85 != RX10_TEMP87;
								if(RX10_TEMP88)
									{

									String RX10_TEMP86 = "Bad place access for array X10_TEMP60";
throw new RuntimeException(RX10_TEMP86);

									}

								final DOUBLEArray RX10_TEMP89 = X10_TEMP60.contents;
								Program.DOUBLESetValue(RX10_TEMP89,RX10_TEMP81,X10_TEMP72);
								}
							}
						}
					}
				finish 					{

					final Dist1 X10_TEMP74 = Program.getUniqueDist();

					final Region1 RX10_TEMP91 = X10_TEMP74.dReg;

					final Point1 value[:rank==1] RX10_TEMP92 = RX10_TEMP91.pointArray;
					for(point(:rank==1)RX10_TEMP90 : RX10_TEMP92)
						{

						final Point1 X10_TEMP76 = RX10_TEMP92[RX10_TEMP90];

						final int p = X10_TEMP76.f0;

						final Dist1 X10_TEMP75 = X10_TEMP74;

						final Region1 RX10_TEMP93 = X10_TEMP75.dReg;

						final int RX10_TEMP94 = Program.searchPointInRegion1(RX10_TEMP93, X10_TEMP76);

						final int RX10_TEMP95 = 0;

						final boolean RX10_TEMP96 = RX10_TEMP94 < RX10_TEMP95;
						if(RX10_TEMP96)
							{

							final String RX10_TEMP97 = "Point X10_TEMP76 not found in the distribution X10_TEMP75.";
throw new RuntimeException(RX10_TEMP97);

							}
						final Dist SX10_TEMP7 = X10_TEMP75.dDist;

						final place RX10_TEMP98 = Program.getPlaceFromDist(SX10_TEMP7, RX10_TEMP94);

						final place X10_TEMP77 = RX10_TEMP98;
						async(X10_TEMP77)							{

							final int X10_TEMP78 = (0);

							final boolean X10_TEMP80 = p == X10_TEMP78;
							if(X10_TEMP80)
								{

								final doubleRefArray1 X10_TEMP81 = tempSd.times;

								final Dist1 RX10_TEMP99 = X10_TEMP81.distValue;

								final Region1 RX10_TEMP100 = RX10_TEMP99.dReg;

								final int RX10_TEMP101 = Program.searchPointInRegion1(RX10_TEMP100, p1);

								final int RX10_TEMP102 = 0;

								final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102;
								if(RX10_TEMP103)
									{

									String RX10_TEMP104 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP104);

									}
								final Dist SX10_TEMP8 = RX10_TEMP99.dDist;

								final place RX10_TEMP105 = Program.getPlaceFromDist(SX10_TEMP8, RX10_TEMP101);

								final place RX10_TEMP107 = here;

								final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107;
								if(RX10_TEMP108)
									{

									String RX10_TEMP106 = "Bad place access for array X10_TEMP81";
throw new RuntimeException(RX10_TEMP106);

									}

								final DOUBLEArray RX10_TEMP109 = X10_TEMP81.contents;

								final double X10_TEMP84 = (Program.DOUBLEGetValue(RX10_TEMP109, RX10_TEMP101));

								final double X10_TEMP85 = (Program.Stream_mySecond());

								final double X10_TEMP86 = (X10_TEMP84 + X10_TEMP85);

								final Dist1 RX10_TEMP110 = X10_TEMP81.distValue;

								final Region1 RX10_TEMP111 = RX10_TEMP110.dReg;

								final int RX10_TEMP112 = Program.searchPointInRegion1(RX10_TEMP111, p1);

								final int RX10_TEMP113 = 0;

								final boolean RX10_TEMP114 = RX10_TEMP112 < RX10_TEMP113;
								if(RX10_TEMP114)
									{

									String RX10_TEMP115 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP115);

									}
								final Dist SX10_TEMP9 = RX10_TEMP110.dDist;

								final place RX10_TEMP116 = Program.getPlaceFromDist(SX10_TEMP9, RX10_TEMP112);

								final place RX10_TEMP118 = here;

								final boolean RX10_TEMP119 = RX10_TEMP116 != RX10_TEMP118;
								if(RX10_TEMP119)
									{

									String RX10_TEMP117 = "Bad place access for array X10_TEMP81";
throw new RuntimeException(RX10_TEMP117);

									}

								final DOUBLEArray RX10_TEMP120 = X10_TEMP81.contents;
								Program.DOUBLESetValue(RX10_TEMP120,RX10_TEMP112,X10_TEMP86);
								}
							}
						}
					}
				}
			finish 				{

				final Dist1 X10_TEMP88 = Program.getUniqueDist();

				final Region1 RX10_TEMP122 = X10_TEMP88.dReg;

				final Point1 value[:rank==1] RX10_TEMP123 = RX10_TEMP122.pointArray;
				for(point(:rank==1)RX10_TEMP121 : RX10_TEMP123)
					{

					final Point1 X10_TEMP90 = RX10_TEMP123[RX10_TEMP121];

					final int p = X10_TEMP90.f0;

					final Dist1 X10_TEMP89 = X10_TEMP88;

					final Region1 RX10_TEMP124 = X10_TEMP89.dReg;

					final int RX10_TEMP125 = Program.searchPointInRegion1(RX10_TEMP124, X10_TEMP90);

					final int RX10_TEMP126 = 0;

					final boolean RX10_TEMP127 = RX10_TEMP125 < RX10_TEMP126;
					if(RX10_TEMP127)
						{

						final String RX10_TEMP128 = "Point X10_TEMP90 not found in the distribution X10_TEMP89.";
throw new RuntimeException(RX10_TEMP128);

						}
					final Dist SX10_TEMP10 = X10_TEMP89.dDist;

					final place RX10_TEMP129 = Program.getPlaceFromDist(SX10_TEMP10, RX10_TEMP125);

					final place X10_TEMP91 = RX10_TEMP129;
					async(X10_TEMP91)						{

						final Dist1 X10_TEMP93 = tempSd.D;

						final place X10_TEMP94 = (here);

						final Dist1 X10_TEMP96 = Program.restrictDist1(X10_TEMP93, X10_TEMP94);

						final Region1 RX10_TEMP132 = X10_TEMP96.dReg;

						final Point1 value[:rank==1] RX10_TEMP133 = RX10_TEMP132.pointArray;
						for(point(:rank==1)RX10_TEMP130 : RX10_TEMP133)
							{

							final Point1 RX10_TEMP131 = RX10_TEMP133[RX10_TEMP130];

							final int i = RX10_TEMP131.f0;

							final doubleRefArray1 X10_TEMP97 = tempSd.a;

							final Point1 RX10_TEMP134 = new Point1(i);

							final Dist1 RX10_TEMP135 = X10_TEMP97.distValue;

							final Region1 RX10_TEMP136 = RX10_TEMP135.dReg;

							final int RX10_TEMP137 = Program.searchPointInRegion1(RX10_TEMP136, RX10_TEMP134);

							final int RX10_TEMP138 = 0;

							final boolean RX10_TEMP139 = RX10_TEMP137 < RX10_TEMP138;
							if(RX10_TEMP139)
								{

								String RX10_TEMP140 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP140);

								}
							final Dist SX10_TEMP11 = RX10_TEMP135.dDist;

							final place RX10_TEMP141 = Program.getPlaceFromDist(SX10_TEMP11, RX10_TEMP137);

							final place RX10_TEMP143 = here;

							final boolean RX10_TEMP144 = RX10_TEMP141 != RX10_TEMP143;
							if(RX10_TEMP144)
								{

								String RX10_TEMP142 = "Bad place access for array X10_TEMP97";
throw new RuntimeException(RX10_TEMP142);

								}

							final DOUBLEArray RX10_TEMP145 = X10_TEMP97.contents;

							final double X10_TEMP106 = (Program.DOUBLEGetValue(RX10_TEMP145, RX10_TEMP137));

							final doubleRefArray1 X10_TEMP99 = tempSd.b;

							final Point1 RX10_TEMP146 = new Point1(i);

							final Dist1 RX10_TEMP147 = X10_TEMP99.distValue;

							final Region1 RX10_TEMP148 = RX10_TEMP147.dReg;

							final int RX10_TEMP149 = Program.searchPointInRegion1(RX10_TEMP148, RX10_TEMP146);

							final int RX10_TEMP150 = 0;

							final boolean RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150;
							if(RX10_TEMP151)
								{

								String RX10_TEMP152 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP152);

								}
							final Dist SX10_TEMP12 = RX10_TEMP147.dDist;

							final place RX10_TEMP153 = Program.getPlaceFromDist(SX10_TEMP12, RX10_TEMP149);

							final place RX10_TEMP155 = here;

							final boolean RX10_TEMP156 = RX10_TEMP153 != RX10_TEMP155;
							if(RX10_TEMP156)
								{

								String RX10_TEMP154 = "Bad place access for array X10_TEMP99";
throw new RuntimeException(RX10_TEMP154);

								}

							final DOUBLEArray RX10_TEMP157 = X10_TEMP99.contents;

							final double X10_TEMP104 = (Program.DOUBLEGetValue(RX10_TEMP157, RX10_TEMP149));

							final doubleRefArray1 X10_TEMP101 = tempSd.c;

							final Point1 RX10_TEMP158 = new Point1(i);

							final Dist1 RX10_TEMP159 = X10_TEMP101.distValue;

							final Region1 RX10_TEMP160 = RX10_TEMP159.dReg;

							final int RX10_TEMP161 = Program.searchPointInRegion1(RX10_TEMP160, RX10_TEMP158);

							final int RX10_TEMP162 = 0;

							final boolean RX10_TEMP163 = RX10_TEMP161 < RX10_TEMP162;
							if(RX10_TEMP163)
								{

								String RX10_TEMP164 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP164);

								}
							final Dist SX10_TEMP13 = RX10_TEMP159.dDist;

							final place RX10_TEMP165 = Program.getPlaceFromDist(SX10_TEMP13, RX10_TEMP161);

							final place RX10_TEMP167 = here;

							final boolean RX10_TEMP168 = RX10_TEMP165 != RX10_TEMP167;
							if(RX10_TEMP168)
								{

								String RX10_TEMP166 = "Bad place access for array X10_TEMP101";
throw new RuntimeException(RX10_TEMP166);

								}

							final DOUBLEArray RX10_TEMP169 = X10_TEMP101.contents;

							final double X10_TEMP103 = (Program.DOUBLEGetValue(RX10_TEMP169, RX10_TEMP161));

							final double X10_TEMP105 = (_Stream_alpha * X10_TEMP103);

							final double X10_TEMP107 = (X10_TEMP104 + X10_TEMP105);

							final boolean X10_TEMP109 = X10_TEMP106 != X10_TEMP107;
							if(X10_TEMP109)
								{

								final place X10_TEMP111 = place.FIRST_PLACE;
								async(X10_TEMP111)									{

									final booleanRefArray1 X10_TEMP112 = tempSd.verified;

									final int X10_TEMP114 = (0);

									final boolean X10_TEMP117 = (false);

									final boolean X10_TEMP118 = (X10_TEMP117);

									final Point1 RX10_TEMP170 = new Point1(X10_TEMP114);

									final Dist1 RX10_TEMP171 = X10_TEMP112.distValue;

									final Region1 RX10_TEMP172 = RX10_TEMP171.dReg;

									final int RX10_TEMP173 = Program.searchPointInRegion1(RX10_TEMP172, RX10_TEMP170);

									final int RX10_TEMP174 = 0;

									final boolean RX10_TEMP175 = RX10_TEMP173 < RX10_TEMP174;
									if(RX10_TEMP175)
										{

										String RX10_TEMP176 = "Array index out of bounds";
throw new RuntimeException(RX10_TEMP176);

										}
									final Dist SX10_TEMP14 = RX10_TEMP171.dDist;

									final place RX10_TEMP177 = Program.getPlaceFromDist(SX10_TEMP14, RX10_TEMP173);

									final place RX10_TEMP179 = here;

									final boolean RX10_TEMP180 = RX10_TEMP177 != RX10_TEMP179;
									if(RX10_TEMP180)
										{

										String RX10_TEMP178 = "Bad place access for array X10_TEMP112";
throw new RuntimeException(RX10_TEMP178);

										}

									final BOOLEANArray RX10_TEMP181 = X10_TEMP112.contents;
									Program.BOOLEANSetValue(RX10_TEMP181,RX10_TEMP173,X10_TEMP118);
									}
								}
							}
						}
					}
				}
			}

		double mini = (10000000L);

		final int X10_TEMP125 = (0);

		final int X10_TEMP121 = (1);

		final int X10_TEMP123 = (_Stream_NUM_TIMES - X10_TEMP121);

		final int X10_TEMP126 = ((int)X10_TEMP123);

		Region1 r = Program.createNewRegion1R(X10_TEMP125, X10_TEMP126);

		final Point1 value[:rank==1] RX10_TEMP183 = r.pointArray;
		for(point(:rank==1)RX10_TEMP182 : RX10_TEMP183)
			{

			final Point1 p1 = RX10_TEMP183[RX10_TEMP182];

			final doubleRefArray1 X10_TEMP129 = tempSd.times;

			final Dist1 RX10_TEMP184 = X10_TEMP129.distValue;

			final Region1 RX10_TEMP185 = RX10_TEMP184.dReg;

			final int RX10_TEMP186 = Program.searchPointInRegion1(RX10_TEMP185, p1);

			final int RX10_TEMP187 = 0;

			final boolean RX10_TEMP188 = RX10_TEMP186 < RX10_TEMP187;
			if(RX10_TEMP188)
				{

				String RX10_TEMP189 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP189);

				}
			final Dist SX10_TEMP15 = RX10_TEMP184.dDist;

			final place RX10_TEMP190 = Program.getPlaceFromDist(SX10_TEMP15, RX10_TEMP186);

			final place RX10_TEMP192 = here;

			final boolean RX10_TEMP193 = RX10_TEMP190 != RX10_TEMP192;
			if(RX10_TEMP193)
				{

				String RX10_TEMP191 = "Bad place access for array X10_TEMP129";
throw new RuntimeException(RX10_TEMP191);

				}

			final DOUBLEArray RX10_TEMP194 = X10_TEMP129.contents;

			final double X10_TEMP131 = (Program.DOUBLEGetValue(RX10_TEMP194, RX10_TEMP186));

			final boolean X10_TEMP133 = X10_TEMP131 < mini;
			if(X10_TEMP133)
				{

				final doubleRefArray1 X10_TEMP134 = tempSd.times;

				final Dist1 RX10_TEMP195 = X10_TEMP134.distValue;

				final Region1 RX10_TEMP196 = RX10_TEMP195.dReg;

				final int RX10_TEMP197 = Program.searchPointInRegion1(RX10_TEMP196, p1);

				final int RX10_TEMP198 = 0;

				final boolean RX10_TEMP199 = RX10_TEMP197 < RX10_TEMP198;
				if(RX10_TEMP199)
					{

					String RX10_TEMP200 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP200);

					}
				final Dist SX10_TEMP16 = RX10_TEMP195.dDist;

				final place RX10_TEMP201 = Program.getPlaceFromDist(SX10_TEMP16, RX10_TEMP197);

				final place RX10_TEMP203 = here;

				final boolean RX10_TEMP204 = RX10_TEMP201 != RX10_TEMP203;
				if(RX10_TEMP204)
					{

					String RX10_TEMP202 = "Bad place access for array X10_TEMP134";
throw new RuntimeException(RX10_TEMP202);

					}

				final DOUBLEArray RX10_TEMP205 = X10_TEMP134.contents;

				final double X10_TEMP137 = (Program.DOUBLEGetValue(RX10_TEMP205, RX10_TEMP197));

				mini=(X10_TEMP137);
				}
			}

		final booleanRefArray1 X10_TEMP140 = tempSd.verified;

		final int X10_TEMP142 = (0);

		final Point1 RX10_TEMP206 = new Point1(X10_TEMP142);

		final Dist1 RX10_TEMP207 = X10_TEMP140.distValue;

		final Region1 RX10_TEMP208 = RX10_TEMP207.dReg;

		final int RX10_TEMP209 = Program.searchPointInRegion1(RX10_TEMP208, RX10_TEMP206);

		final int RX10_TEMP210 = 0;

		final boolean RX10_TEMP211 = RX10_TEMP209 < RX10_TEMP210;
		if(RX10_TEMP211)
			{

			String RX10_TEMP212 = "Array access index out of bounds";
throw new RuntimeException(RX10_TEMP212);

			}
		final Dist SX10_TEMP17 = RX10_TEMP207.dDist;

		final place RX10_TEMP213 = Program.getPlaceFromDist(SX10_TEMP17, RX10_TEMP209);

		final place RX10_TEMP215 = here;

		final boolean RX10_TEMP216 = RX10_TEMP213 != RX10_TEMP215;
		if(RX10_TEMP216)
			{

			String RX10_TEMP214 = "Bad place access for array X10_TEMP140";
throw new RuntimeException(RX10_TEMP214);

			}

		final BOOLEANArray RX10_TEMP217 = X10_TEMP140.contents;

		final boolean X10_TEMP144 = (Program.BOOLEANGetValue(RX10_TEMP217, RX10_TEMP209));
		Program.Stream_printStats(_Stream_N, mini, X10_TEMP144);
		}
public static double Stream_mySecond ( )		{

		final double X10_TEMP1 = (System.currentTimeMillis());

		final double X10_TEMP2 = (1.e6);

		final double X10_TEMP3 = (X10_TEMP1 * X10_TEMP2);

		final int X10_TEMP4 = (1000);

		final double X10_TEMP6 = (X10_TEMP3 / X10_TEMP4);

		final double X10_TEMP7 = ((double)X10_TEMP6);

		final double X10_TEMP8 = (1.e-6);

		final double X10_TEMP10 = (X10_TEMP7 * X10_TEMP8);

		final double X10_TEMP12 = ((double)X10_TEMP10);
		return X10_TEMP12;
		}
public static void Stream_printStats ( final long N, final double time, final boolean verified)		{

		long X10_TEMP1 = N;

		double X10_TEMP2 = time;

		boolean X10_TEMP3 = verified;

		final String X10_TEMP4 = ("Number of places=");

		final int X10_TEMP5 = (place.MAX_PLACES);

		final String X10_TEMP7 = (X10_TEMP4 + X10_TEMP5);
		System.out.println(X10_TEMP7);

		final int X10_TEMP8 = (3);

		final int X10_TEMP9 = (8);

		final long X10_TEMP10 = (X10_TEMP8 * X10_TEMP9);

		final long X10_TEMP11 = (X10_TEMP10 * X10_TEMP1);

		final long X10_TEMP13 = (X10_TEMP11 / _Stream_MEG);

		long size1 = (X10_TEMP13);

		final int X10_TEMP15 = (3);

		final int X10_TEMP16 = (8);

		final long X10_TEMP17 = (X10_TEMP15 * X10_TEMP16);

		final long X10_TEMP19 = (X10_TEMP17 * X10_TEMP1);

		final double X10_TEMP20 = (1.0E9);

		final double X10_TEMP22 = (X10_TEMP20 * X10_TEMP2);

		double rate = (X10_TEMP19 / X10_TEMP22);

		final String X10_TEMP24 = ("Size of arrays: ");

		final String X10_TEMP25 = (X10_TEMP24 + size1);

		final String X10_TEMP26 = (" MB (total)");

		final String X10_TEMP28 = (X10_TEMP25 + X10_TEMP26);

		final int X10_TEMP27 = (place.MAX_PLACES);

		final long X10_TEMP29 = (size1 / X10_TEMP27);

		final String X10_TEMP30 = (X10_TEMP28 + X10_TEMP29);

		final String X10_TEMP31 = (" MB (per place)");

		final String X10_TEMP33 = (X10_TEMP30 + X10_TEMP31);
		System.out.println(X10_TEMP33);

		final String X10_TEMP34 = ("Min time: ");

		final String X10_TEMP35 = (X10_TEMP34 + X10_TEMP2);

		final String X10_TEMP36 = (" rate=");

		final String X10_TEMP37 = (X10_TEMP35 + X10_TEMP36);

		final String X10_TEMP38 = (X10_TEMP37 + rate);

		final String X10_TEMP39 = (" GB/s");

		final String X10_TEMP41 = (X10_TEMP38 + X10_TEMP39);
		System.out.println(X10_TEMP41);

		final String X10_TEMP48 = ("Result is ");

		final boolean X10_TEMP42 = X10_TEMP3;

		String X10_TEMP45 = "NOT verified.";
		if(X10_TEMP42)
			{

			X10_TEMP45="verified.";
			}

		final String X10_TEMP46 = X10_TEMP45;

		final String X10_TEMP47 = (X10_TEMP46);

		final String X10_TEMP50 = (X10_TEMP48 + X10_TEMP47);
		System.out.println(X10_TEMP50);
		}
public static int _Timer_max_counters_init ( )		{

		final int X10_TEMP2 = (64);
		return X10_TEMP2;
		}
public static void Timer_start ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.start_time;

		final double X10_TEMP6 = (System.currentTimeMillis());

		final double X10_TEMP7 = (X10_TEMP6);

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

		final place RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final place RX10_TEMP9 = here;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP11,RX10_TEMP3,X10_TEMP7);
		}
public static void Timer_stop ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.elapsed_time;

		final double X10_TEMP6 = (System.currentTimeMillis());

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

		final place RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final place RX10_TEMP9 = here;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP4";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP4.contents;

		final double X10_TEMP7 = (Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3));

		final double X10_TEMP10 = (X10_TEMP6 - X10_TEMP7);

		final double X10_TEMP11 = (X10_TEMP10);

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

		final place RX10_TEMP19 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP15);

		final place RX10_TEMP21 = here;

		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP23,RX10_TEMP15,X10_TEMP11);

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

		final place RX10_TEMP31 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP27);

		final place RX10_TEMP33 = here;

		final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
		if(RX10_TEMP34)
			{

			String RX10_TEMP32 = "Bad place access for array X10_TEMP12";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP12.contents;

		final double X10_TEMP15 = (Program.DOUBLEGetValue(RX10_TEMP35, RX10_TEMP27));

		final double X10_TEMP16 = (1000);

		final double X10_TEMP17 = (X10_TEMP15 / X10_TEMP16);

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

		final place RX10_TEMP43 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP39);

		final place RX10_TEMP45 = here;

		final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;
		if(RX10_TEMP46)
			{

			String RX10_TEMP44 = "Bad place access for array X10_TEMP12";
throw new RuntimeException(RX10_TEMP44);

			}

		final DOUBLEArray RX10_TEMP47 = X10_TEMP12.contents;
		Program.DOUBLESetValue(RX10_TEMP47,RX10_TEMP39,X10_TEMP17);

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

		final place RX10_TEMP55 = Program.getPlaceFromDist(SX10_TEMP4, RX10_TEMP51);

		final place RX10_TEMP57 = here;

		final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;
		if(RX10_TEMP58)
			{

			String RX10_TEMP56 = "Bad place access for array X10_TEMP18";
throw new RuntimeException(RX10_TEMP56);

			}

		final DOUBLEArray RX10_TEMP59 = X10_TEMP18.contents;

		final double X10_TEMP23 = (Program.DOUBLEGetValue(RX10_TEMP59, RX10_TEMP51));

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

		final place RX10_TEMP67 = Program.getPlaceFromDist(SX10_TEMP5, RX10_TEMP63);

		final place RX10_TEMP69 = here;

		final boolean RX10_TEMP70 = RX10_TEMP67 != RX10_TEMP69;
		if(RX10_TEMP70)
			{

			String RX10_TEMP68 = "Bad place access for array X10_TEMP20";
throw new RuntimeException(RX10_TEMP68);

			}

		final DOUBLEArray RX10_TEMP71 = X10_TEMP20.contents;

		final double X10_TEMP24 = (Program.DOUBLEGetValue(RX10_TEMP71, RX10_TEMP63));

		final double X10_TEMP25 = (X10_TEMP23 + X10_TEMP24);

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

		final place RX10_TEMP79 = Program.getPlaceFromDist(SX10_TEMP6, RX10_TEMP75);

		final place RX10_TEMP81 = here;

		final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
		if(RX10_TEMP82)
			{

			String RX10_TEMP80 = "Bad place access for array X10_TEMP18";
throw new RuntimeException(RX10_TEMP80);

			}

		final DOUBLEArray RX10_TEMP83 = X10_TEMP18.contents;
		Program.DOUBLESetValue(RX10_TEMP83,RX10_TEMP75,X10_TEMP25);
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

		final place RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final place RX10_TEMP9 = here;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;

		final double X10_TEMP5 = (Program.DOUBLEGetValue(RX10_TEMP11, RX10_TEMP3));
		return X10_TEMP5;
		}
public static void Timer_resetTimer ( final Timer X10_TEMP0, final int n)		{

		int X10_TEMP1 = n;

		final doubleRefArray1 X10_TEMP2 = X10_TEMP0.total_time;

		final double X10_TEMP6 = (0);

		final double X10_TEMP7 = (X10_TEMP6);

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

		final place RX10_TEMP7 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP3);

		final place RX10_TEMP9 = here;

		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if(RX10_TEMP10)
			{

			String RX10_TEMP8 = "Bad place access for array X10_TEMP2";
throw new RuntimeException(RX10_TEMP8);

			}

		final DOUBLEArray RX10_TEMP11 = X10_TEMP2.contents;
		Program.DOUBLESetValue(RX10_TEMP11,RX10_TEMP3,X10_TEMP7);

		final doubleRefArray1 X10_TEMP8 = X10_TEMP0.start_time;

		final double X10_TEMP12 = (0);

		final double X10_TEMP13 = (X10_TEMP12);

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

		final place RX10_TEMP19 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP15);

		final place RX10_TEMP21 = here;

		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP8";
throw new RuntimeException(RX10_TEMP20);

			}

		final DOUBLEArray RX10_TEMP23 = X10_TEMP8.contents;
		Program.DOUBLESetValue(RX10_TEMP23,RX10_TEMP15,X10_TEMP13);

		final doubleRefArray1 X10_TEMP14 = X10_TEMP0.elapsed_time;

		final double X10_TEMP18 = (0);

		final double X10_TEMP19 = (X10_TEMP18);

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

		final place RX10_TEMP31 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP27);

		final place RX10_TEMP33 = here;

		final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
		if(RX10_TEMP34)
			{

			String RX10_TEMP32 = "Bad place access for array X10_TEMP14";
throw new RuntimeException(RX10_TEMP32);

			}

		final DOUBLEArray RX10_TEMP35 = X10_TEMP14.contents;
		Program.DOUBLESetValue(RX10_TEMP35,RX10_TEMP27,X10_TEMP19);
		}
public static void Timer_resetAllTimers ( final Timer X10_TEMP0)		{

		int i = (0);

		boolean X10_TEMP4 = i < _Timer_max_counters;
		while(X10_TEMP4)
			{
			Program.Timer_resetTimer(X10_TEMP0, i);

			final int X10_TEMP6 = (i);

			final int X10_TEMP7 = 1;

			i=i + X10_TEMP7;

			X10_TEMP4=i < _Timer_max_counters;
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

		outRegion=outRegion || lbound0;

		outRegion=outRegion || hbound0;
		if(outRegion)
			{

			int notFound = 0;

			notFound=notFound - one;
			return notFound;
			}

		final int stride1 = 1;

		final int stride0 = stride1 * dim1;

		pt0=pt0 - low0;

		final int offset0 = stride0 * pt0;

		int found = 0;

		found=found + offset0;
		return found;
		}
public static Dist1 restrictDist1 ( final Dist1 d, final place p)		{

		final Region1 dReg = d.dReg;

		final Point1 value[:rank==1] dArray = (Point1 value[:rank==1])(dReg.pointArray);

		int numPoints = 0;

		final int zero = 0;

		final int one = 1;

		final place h = here;
		for(point(:rank==1)[i] : dArray)
			{
			final Dist SX10_TEMP0 = d.dDist;

			final place dP = Program.getPlaceFromDist(SX10_TEMP0, i);

			final boolean cond = p == dP;
			if(cond)
				{

				numPoints=numPoints + one;
				}
			}

		final int rSize = numPoints - one;

		final region(:rank==1) tempReg = [0:rSize];

		final Dist tempDist = new Dist(tempReg,h);

		final Dist dpdist = new Dist(tempReg,p);

		final INTArray tempArray = new INTArray(tempDist);

		numPoints=0;
		for(point(:rank==1)[i] : dArray)
			{
			final Dist SX10_TEMP1 = d.dDist;

			final place dP = Program.getPlaceFromDist(SX10_TEMP1, i);

			final boolean cond = p == dP;
			if(cond)
				{
				Program.INTSetValue(tempArray,i,i);

				numPoints=numPoints + one;
				}
			}

		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1])(new Point1 value[tempReg](point(:rank==1)p)			{

			final int index = Program.INTGetValue(tempArray, p);

			final Point1 dpt = dArray[index];
			return dpt;
			}
);

		final Region1 dpReg = new Region1(pointArray);

		final Dist1 dpDist = new Dist1(dpReg, dpdist);
		return dpDist;
		}
public static Dist1 getBlockCyclicDist1 ( final Region1 r, final int blockSize)		{

		final int N = r.pointArray.region.size();

		final place fPlace = place.FIRST_PLACE;

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

		point1=pt1.f0;

		point2=pt2.f0;

		lt=point1 < point2;

		gt=point1 > point2;
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

		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1])(r.pointArray);

		int start = 0;

		int end = r.pointArray.region.size();

		final int zero = 0;

		final int one = 1;

		final int two = 2;

		end=end - one;

		int result = zero - one;

		boolean notDone = start <= end;
		while(notDone)
			{

			int mid = start + end;

			mid=mid / two;

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

					end=mid - one;
					}
				else
					{

					start=mid + one;
					}
 				}
 
			notDone=start <= end;
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
public static Dist1 getBlockDist1 ( final Region1 r)		{

		final int R = r.pointArray.region.size();

		final int N = place.MAX_PLACES;

		final int q = R % N;

		final int p = R / N;

		final int one = 1;

		final int zero = 0;

		int blockSize = p + one;

		int arraySize = q * blockSize;

		int offset = 0;

		place initPlace = place.FIRST_PLACE;

		Dist pointDist1 = Program.getCyclic(arraySize, initPlace, blockSize);

		int remainingPlaces = N - q;

		final boolean cond = remainingPlaces == zero;
		if(cond)
			{

			final Dist1 retDist = new Dist1(r, pointDist1);
			return retDist;
			}

		offset=arraySize;

		blockSize=p;

		arraySize=remainingPlaces * blockSize;

		initPlace=place.places(q);

		int chunk = blockSize;

		final boolean ifCond = blockSize > arraySize;
		if(ifCond)
			{

			chunk=arraySize;
			}

		int index = offset;

		int dSize = index + chunk;

		dSize=dSize - one;

		pointDist1=new Dist(pointDist1,index,dSize,initPlace);

		index=index + chunk;

		arraySize=arraySize - chunk;

		place pl = initPlace.next();

		boolean whileCond = arraySize != zero;
		while(whileCond)
			{

			final boolean tailCond = chunk > arraySize;
			if(tailCond)
				{

				dSize=index + arraySize;

				dSize=dSize - one;

				pointDist1=new Dist(pointDist1,index,dSize,pl);

				arraySize=0;
				}
			else
				{

				dSize=index + chunk;

				dSize=dSize - one;

				pointDist1=new Dist(pointDist1,index,dSize,pl);

				index=index + chunk;

				arraySize=arraySize - chunk;
				}
 
			pl=pl.next();

			whileCond=arraySize != zero;
			}

		final Dist1 retDist = new Dist1(r, pointDist1);
		return retDist;
		}
public static Dist1 getUniqueDist ( )		{

		final int one = 1;

		final int zero = 0;

		final int maxPlaces = place.MAX_PLACES;

		final int rSize = maxPlaces - one;

		final region(:rank==1) placeRegion = [0:rSize];

		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1])(new Point1 value[placeRegion](point(:rank==1)[i])			{

			final Point1 pt1 = new Point1(i);
			return pt1;
			}
);

		final Region1 reg = new Region1(pointArray, zero, maxPlaces);

		final Dist1 retDist = Program.getBlockCyclicDist1(reg, one);
		return retDist;
		}
public static Dist1 getPlaceDist1 ( final Region1 r, final place p)		{

		final int rSize = r.pointArray.region.size();

		final Dist pointDist = Program.getCyclic(rSize, p, rSize);

		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
		}
public static Dist getCyclic ( final int arraySize, final place initPlace, final int blockSize)		{

		final int zero = 0;

		final int one = 1;

		int N = arraySize;

		int chunk = blockSize;

		final boolean ifCond = blockSize > N;
		if(ifCond)
			{

			chunk=N;
			}

		int index = 0;

		int dSize = index + chunk;

		dSize=dSize - one;

		final region(:rank==1) pointReg = [0:dSize];

		Dist pointDist = new Dist(pointReg,initPlace);

		index=index + chunk;

		N=N - chunk;

		place p = initPlace.next();

		boolean whileCond = N != zero;
		while(whileCond)
			{

			final boolean tailCond = chunk > N;
			if(tailCond)
				{

				dSize=index + N;

				dSize=dSize - one;

				pointDist=new Dist(pointDist,index,dSize,p);

				N=0;
				}
			else
				{

				dSize=index + chunk;

				dSize=dSize - one;

				pointDist=new Dist(pointDist,index,dSize,p);

				index=index + chunk;

				N=N - chunk;
				}
 
			p=p.next();

			whileCond=N != zero;
			}
		return pointDist;
		}
public static Region1 createNewRegion1R ( final int v1_0, final int v1_1)		{

		final int zero = 0;

		final int one = 1;

		boolean regType = true;

		final boolean tempBool1 = true;

		regType=regType && tempBool1;

		final int l1 = v1_1 - v1_0;

		final int dim1 = l1 + one;

		final int stride1 = 1;

		final int stride0 = stride1 * dim1;

		final int rSize = stride0 - one;

		final region(:rank==1) regArr = [0:rSize];

		final Point1 value[:rank==1] ptArray = (Point1 value[:rank==1])(new Point1 value[regArr](point(:rank==1)[p])			{

			int f1 = p / stride1;

			f1=f1 % dim1;

			f1=f1 + v1_0;

			final Point1 retPoint = new Point1(f1);
			return retPoint;
			}
);
		if(regType)
			{

			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1);
			return retRegRegular;
			}

		final Region1 retReg = new Region1(ptArray);
		return retReg;
		}


	/* dist:== region -> place  */
	public static place value[:rank==1] createDist(final region(:rank==1) reg, final place pl) {
		final place value[:rank==1] placeArray = (place value[:rank==1]) (new place value[reg] (point(:rank==1) p){return pl;});
		return placeArray;
	}

	/* dist:== dist || [x:y]-> place  */
	public static place value[:rank==1] extendDist(final Dist d1, final int x, final int y, final place pl) {
		
		final int one = 1;
	
		final place value[:rank==1] d1Array = d1.placeArray;
	
		final dist(:rank==1) dis = [0 : y] -> here;
		final place [:rank==1] temp = (place[:rank==1]) (new place[dis]);

		for(point(:rank==1) p : d1Array)
		{
			final place tempPlace = d1Array[p];
			temp[p] = (tempPlace);
		}

		int tail = x;
		boolean bool = (tail<=y);
		while(bool) // check the math here..replace with do-while
		{
			temp[tail] = (pl);
			tail = tail + one;
			bool = (tail <= y);
		}
		final place value[:rank==1] placeArray = (place value[:rank==1]) (new place value[[0 : y] -> here] (point(:rank==1) p)
										{
											final place tempPlace = temp[p];
											return tempPlace;
										});
		return placeArray;
	}
	/* dist.get(p) */
	public static place getPlaceFromDist(final Dist d, final int index) {
		final place value[:rank==1] placeArray = d.placeArray;
		final place retPlace = placeArray[index];
		return retPlace;
	}
	public static int value[:rank==1] getCounts(final Dist d) {
		final int one = 1;
		final int zero = 0;
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
	final region(:rank==1) R = [0 : ub];

		final dist(:rank==1) dis = [0 : ub] -> here;
		final int [:rank==1] tempCounts = (int [:rank==1]) (new int[dis]);

		for(point(:rank==1) p : tempCounts) {
			tempCounts[p] = (zero);
		}

		final place value[:rank==1] placeArray = d.placeArray;

		for(point(:rank==1) p : placeArray) {
			final place pl = placeArray[p];
			final int index = pl.id;
			final int oldVal = tempCounts[index];
			final int oldValPlusOne = oldVal + one;
			tempCounts[index] = (oldValPlusOne);
		}
		final int value[:rank==1] counts = (int value[:rank==1]) (new int value[R](point(:rank==1) p)
										{
											final int tempInt = tempCounts[p];	
											return tempInt;
										});
		return counts;
	}
	public static int value[:rank==1] getRunningSum(final Dist d) {
		
		final int one = 1;
		final int zero = 0;
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
	

		final dist(:rank==1) dis = [0 : ub] -> here;
		final int [:rank==1] tempCounts = (int [:rank==1]) (new int[dis]);
		
		final int count = d.placeArray.region.size();
	
		final place value[:rank==1] placeArray = d.placeArray;
	
			final region(:rank==1) runReg = [0 : count];
		final dist(:rank==1) runDist = [0 : count] -> here;
		final int [:rank==1] tempRunSum = (int [:rank==1]) (new int [runDist]);
		
		for(point(:rank==1) p : tempCounts) {
			tempCounts[p] = (zero);
		}
	
		for(point(:rank==1) p : placeArray) {
			final place pl = placeArray[p];
			final int index = pl.id;
			final int temp = tempCounts[index];
			tempRunSum[p] = (temp);
			final int tempPlusOne = temp + one;
			tempCounts[index] = (tempPlusOne);
		}
		
		final int value[:rank==1] runSum = (int value[:rank==1]) (new int value[runReg](point(:rank==1) p) {
												final int tempInt = tempRunSum[p];	
												return tempInt;
											});
		return runSum;
	}
	public static int getLocalIndex(final Dist myDist, final int index) {
		final int value[:rank==1] runningSum = myDist.runningSum;
		final int retVal = runningSum[index];
		return retVal;
	}


	public static int getLocalIndex(final Dist myDist, final point(:rank==1) index) {
		final int value[:rank==1] runningSum = myDist.runningSum;
		final int retVal = runningSum[index];
		return retVal;
	}


	public static INTStub value[:rank==1] createINTArray(final Dist distArray) {
		final int one = 1;
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
		final region(:rank==1) R = [0 : ub];

		final int value[:rank==1] counts = distArray.counts;

		final INTStub value[:rank==1] temp = (INTStub value[:rank==1])(new INTStub value [R](point(:rank==1) [p]) {
						final int count = counts[p];
						final place pl = place.places(p);
						final INTStub is = Program.createINTStub(pl, count);
						return is;});
		return temp;
	} 
	public static INTStub createINTStub(final place remotePlace, final int count) {

		final int zero = 0;
		final place pl = here;
		final dist(:rank==1) retDist = [0 : zero] -> here;

		final INTStub[:rank==1] retStub = (INTStub[:rank==1])(new INTStub[retDist]);

		finish {
			async(remotePlace) {
				final INTStub to = new INTStub(count);
				async(pl){
					retStub[zero] = (to);
				}
			}
		}
	
		final INTStub to = retStub[zero];
		return to;
	}
	public static int[:rank==1] allocateLocalINTArray(final int count) {
		
		final int one = 1;	
		final int sizeOfChunk = count - one;
		final dist(:rank==1) localDist = [0 : sizeOfChunk] -> here;

		final int[:rank==1] temp = (int[:rank==1])(new int[localDist]);
		return temp;
	}
	public static int INTGetValue(final INTArray arr, final int index){
		final place pl = here;
		final int placeIndex = pl.id;
		final INTStub value[:rank==1] contents = arr.contents;	
		final INTStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final int returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void INTSetValue(final INTArray arr, final int index, final int val){
		final place pl = here;
		final int placeIndex = pl.id;
		final INTStub value[:rank==1] contents = arr.contents;	
		final INTStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}
	public static int INTGetValue(final INTArray arr, final point(:rank==1) index){
		final place pl = here;
		final int placeIndex = pl.id;
		final INTStub value[:rank==1] contents = arr.contents;	
		final INTStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final int returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void INTSetValue(final INTArray arr, final point(:rank==1) index, final int val){
		final place pl = here;
		final int placeIndex = pl.id;
		final INTStub value[:rank==1] contents = arr.contents;	
		final INTStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}

	public static BOOLEANStub value[:rank==1] createBOOLEANArray(final Dist distArray) {
		final int one = 1;
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
		final region(:rank==1) R = [0 : ub];

		final int value[:rank==1] counts = distArray.counts;

		final BOOLEANStub value[:rank==1] temp = (BOOLEANStub value[:rank==1])(new BOOLEANStub value [R](point(:rank==1) [p]) {
						final int count = counts[p];
						final place pl = place.places(p);
						final BOOLEANStub is = Program.createBOOLEANStub(pl, count);
						return is;});
		return temp;
	} 
	public static BOOLEANStub createBOOLEANStub(final place remotePlace, final int count) {

		final int zero = 0;
		final place pl = here;
		final dist(:rank==1) retDist = [0 : zero] -> here;

		final BOOLEANStub[:rank==1] retStub = (BOOLEANStub[:rank==1])(new BOOLEANStub[retDist]);

		finish {
			async(remotePlace) {
				final BOOLEANStub to = new BOOLEANStub(count);
				async(pl){
					retStub[zero] = (to);
				}
			}
		}
	
		final BOOLEANStub to = retStub[zero];
		return to;
	}
	public static boolean[:rank==1] allocateLocalBOOLEANArray(final int count) {
		
		final int one = 1;	
		final int sizeOfChunk = count - one;
		final dist(:rank==1) localDist = [0 : sizeOfChunk] -> here;

		final boolean[:rank==1] temp = (boolean[:rank==1])(new boolean[localDist]);
		return temp;
	}
	public static boolean BOOLEANGetValue(final BOOLEANArray arr, final int index){
		final place pl = here;
		final int placeIndex = pl.id;
		final BOOLEANStub value[:rank==1] contents = arr.contents;	
		final BOOLEANStub indexStub = contents[placeIndex];
		final boolean[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final boolean returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void BOOLEANSetValue(final BOOLEANArray arr, final int index, final boolean val){
		final place pl = here;
		final int placeIndex = pl.id;
		final BOOLEANStub value[:rank==1] contents = arr.contents;	
		final BOOLEANStub indexStub = contents[placeIndex];
		final boolean[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}
	public static boolean BOOLEANGetValue(final BOOLEANArray arr, final point(:rank==1) index){
		final place pl = here;
		final int placeIndex = pl.id;
		final BOOLEANStub value[:rank==1] contents = arr.contents;	
		final BOOLEANStub indexStub = contents[placeIndex];
		final boolean[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final boolean returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void BOOLEANSetValue(final BOOLEANArray arr, final point(:rank==1) index, final boolean val){
		final place pl = here;
		final int placeIndex = pl.id;
		final BOOLEANStub value[:rank==1] contents = arr.contents;	
		final BOOLEANStub indexStub = contents[placeIndex];
		final boolean[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}

	public static DOUBLEStub value[:rank==1] createDOUBLEArray(final Dist distArray) {
		final int one = 1;
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
		final region(:rank==1) R = [0 : ub];

		final int value[:rank==1] counts = distArray.counts;

		final DOUBLEStub value[:rank==1] temp = (DOUBLEStub value[:rank==1])(new DOUBLEStub value [R](point(:rank==1) [p]) {
						final int count = counts[p];
						final place pl = place.places(p);
						final DOUBLEStub is = Program.createDOUBLEStub(pl, count);
						return is;});
		return temp;
	} 
	public static DOUBLEStub createDOUBLEStub(final place remotePlace, final int count) {

		final int zero = 0;
		final place pl = here;
		final dist(:rank==1) retDist = [0 : zero] -> here;

		final DOUBLEStub[:rank==1] retStub = (DOUBLEStub[:rank==1])(new DOUBLEStub[retDist]);

		finish {
			async(remotePlace) {
				final DOUBLEStub to = new DOUBLEStub(count);
				async(pl){
					retStub[zero] = (to);
				}
			}
		}
	
		final DOUBLEStub to = retStub[zero];
		return to;
	}
	public static double[:rank==1] allocateLocalDOUBLEArray(final int count) {
		
		final int one = 1;	
		final int sizeOfChunk = count - one;
		final dist(:rank==1) localDist = [0 : sizeOfChunk] -> here;

		final double[:rank==1] temp = (double[:rank==1])(new double[localDist]);
		return temp;
	}
	public static double DOUBLEGetValue(final DOUBLEArray arr, final int index){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void DOUBLESetValue(final DOUBLEArray arr, final int index, final double val){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}
	public static double DOUBLEGetValue(final DOUBLEArray arr, final point(:rank==1) index){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void DOUBLESetValue(final DOUBLEArray arr, final point(:rank==1) index, final double val){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}

}
value INTStub {
	public final int[:rank==1] localArray;
	
	public INTStub(final int count) {
		localArray = Program.allocateLocalINTArray(count);	
	}

}
value INTArray {

	public final INTStub value[:rank==1] contents;
	public final Dist distArray;

	public INTArray(final Dist distArray_) {
		distArray = distArray_;
		contents = Program.createINTArray(distArray);
	}
	
}

value BOOLEANStub {
	public final boolean[:rank==1] localArray;
	
	public BOOLEANStub(final int count) {
		localArray = Program.allocateLocalBOOLEANArray(count);	
	}

}
value BOOLEANArray {

	public final BOOLEANStub value[:rank==1] contents;
	public final Dist distArray;

	public BOOLEANArray(final Dist distArray_) {
		distArray = distArray_;
		contents = Program.createBOOLEANArray(distArray);
	}
	
}

value DOUBLEStub {
	public final double[:rank==1] localArray;
	
	public DOUBLEStub(final int count) {
		localArray = Program.allocateLocalDOUBLEArray(count);	
	}

}
value DOUBLEArray {

	public final DOUBLEStub value[:rank==1] contents;
	public final Dist distArray;

	public DOUBLEArray(final Dist distArray_) {
		distArray = distArray_;
		contents = Program.createDOUBLEArray(distArray);
	}
	
}

value Dist {

	public final place value[:rank==1] placeArray;
	public final int value[:rank==1] counts;
	public final int value[:rank==1] runningSum;
	
	public Dist(final region(:rank==1) reg, final place pl) {
		placeArray = Program.createDist(reg, pl);
		counts = Program.getCounts(this);
		runningSum = (int value[:rank==1])(Program.getRunningSum(this));
	}
	
	public Dist(final Dist d1, final int x, final int y, final place pl) {
		placeArray = Program.extendDist(d1, x, y, pl);
		counts = Program.getCounts(this);
		runningSum = (int value[:rank==1])(Program.getRunningSum(this));
	}
}
