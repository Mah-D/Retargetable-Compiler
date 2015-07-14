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


value intRefArray1 
	 {
	public final Dist1 distValue;
	public final int contents;


	public intRefArray1 ( final Dist1 distValue_, final int contents_)
		{

		distValue=distValue_;

		contents=contents_;
		}


	}
	value doubleRefArray1 
	 {
	public final Dist1 distValue;
	public final double contents;


	public doubleRefArray1 ( final Dist1 distValue_, final double contents_)
		{

		distValue=distValue_;

		contents=contents_;
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

		final Point1 value[:rank==1] RX10_TEMP2 = RX10_TEMP0.pointArray;

		final Dist RX10_TEMP1 = d.dDist;

		final INTArray RX10_TEMP3 = new INTArray(RX10_TEMP1);
		finish 			{
			for(point(:rank==1)[RX10_TEMP4] : RX10_TEMP2)
				{
				final Dist SX10_TEMP0 = d.dDist;

				final place RX10_TEMP6 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP4);
				async(RX10_TEMP6)					{

					final Point1 RX10_TEMP5 = RX10_TEMP2[RX10_TEMP4];

					final int i = RX10_TEMP5.f0;
					Program.INTSetValue(RX10_TEMP3,RX10_TEMP4,i);
					}
				}
			}

		final intRefArray1 RX10_TEMP7 = new intRefArray1(d, RX10_TEMP3);

		final intRefArray1 X10_TEMP7 = RX10_TEMP7;

		a=X10_TEMP7;

		final int X10_TEMP9 = (0);

		total=(X10_TEMP9);
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
	public final Point1 pointArray;


	public Region1 ( final Point1 pointArray_)
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
	public Region1 ( final Point1 pointArray_, final int low0_, final int dim0_)
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
public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program   {
public static final Region1 _MR_r = Program._MR_r_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();


public static void runMain ( )		{

		Timer tmr = (new Timer());

		int count = (0);
		Program.Timer_start(tmr, count);

		final MR X10_TEMP4 = (new MR());
		Program.MR_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);

		final String X10_TEMP7 = ("Wall-clock time for mapreduce: ");

		final double X10_TEMP8 = (Program.Timer_readTimer(tmr, count));

		final String X10_TEMP9 = (X10_TEMP7 + X10_TEMP8);

		final String X10_TEMP10 = (" secs");

		final String X10_TEMP12 = (X10_TEMP9 + X10_TEMP10);
		System.out.println(X10_TEMP12);
		}
public static Region1 _MR_r_init ( )		{

		final int X10_TEMP3 = (0);

		final int X10_TEMP4 = (300);

		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		return X10_TEMP6;
		}
public static void MR_run ( final MR X10_TEMP0)		{
		Program.MR_map(X10_TEMP0);
		Program.MR_reduce(X10_TEMP0);

		final int X10_TEMP2 = (X10_TEMP0.total);

		final String X10_TEMP4 = "";

		final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;
		System.out.println(X10_TEMP3);
		}
public static void MR_map ( final MR X10_TEMP0)		{

		final intRefArray1 b = X10_TEMP0.a;
		finish 			{

			final Dist1 RX10_TEMP1 = b.distValue;

			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;

			final Point1 value[:rank==1] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(point(:rank==1)RX10_TEMP0 : RX10_TEMP3)
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

				final place RX10_TEMP10 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP6);

				final place X10_TEMP4 = RX10_TEMP10;
				async(X10_TEMP4)					{

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

					final place RX10_TEMP17 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP13);

					final place RX10_TEMP19 = here;

					final boolean RX10_TEMP20 = RX10_TEMP17 != RX10_TEMP19;
					if(RX10_TEMP20)
						{

						String RX10_TEMP18 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP18);

						}

					final INTArray RX10_TEMP21 = b.contents;

					final int X10_TEMP8 = (Program.intGetValue(RX10_TEMP21, RX10_TEMP13));

					final int X10_TEMP11 = (Program.MR_f(X10_TEMP0, X10_TEMP8));

					final int X10_TEMP12 = (X10_TEMP11);

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

					final place RX10_TEMP28 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP24);

					final place RX10_TEMP30 = here;

					final boolean RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30;
					if(RX10_TEMP31)
						{

						String RX10_TEMP29 = "Bad place access for array b";
throw new RuntimeException(RX10_TEMP29);

						}

					final INTArray RX10_TEMP32 = b.contents;
					Program.INTSetValue(RX10_TEMP32,RX10_TEMP24,X10_TEMP12);
					}
				}
			}
		}
public static int MR_f ( final MR X10_TEMP0, final int x)		{

		int X10_TEMP1 = x;

		final int X10_TEMP3 = (X10_TEMP1 * X10_TEMP1);
		return X10_TEMP3;
		}
public static void MR_reduce ( final MR X10_TEMP0)		{

		final place h = (here);

		final intRefArray1 X10_TEMP2 = X10_TEMP0.a;

		final Dist1 RX10_TEMP0 = X10_TEMP2.distValue;

		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;

		final Region1 reg = RX10_TEMP1;

		final place X10_TEMP4 = (here);

		final Dist1 dis = Program.getPlaceDist1(reg, X10_TEMP4);

		final Region1 RX10_TEMP2 = dis.dReg;

		final Point1 value[:rank==1] RX10_TEMP4 = RX10_TEMP2.pointArray;

		final Dist RX10_TEMP3 = dis.dDist;

		final INTArray RX10_TEMP5 = new INTArray(RX10_TEMP3);

		final intRefArray1 RX10_TEMP6 = new intRefArray1(dis, RX10_TEMP5);

		final intRefArray1 result = RX10_TEMP6;

		final intRefArray1 X10_TEMP8 = X10_TEMP0.a;

		final Dist1 RX10_TEMP8 = X10_TEMP8.distValue;

		final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;

		final Point1 value[:rank==1] RX10_TEMP10 = RX10_TEMP9.pointArray;
		for(point(:rank==1)RX10_TEMP7 : RX10_TEMP10)
			{

			final Point1 p = RX10_TEMP10[RX10_TEMP7];
			finish 				{

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

				final place RX10_TEMP17 = Program.getPlaceFromDist(SX10_TEMP0, RX10_TEMP13);

				final place X10_TEMP14 = RX10_TEMP17;
				async(X10_TEMP14)					{

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

					final place RX10_TEMP24 = Program.getPlaceFromDist(SX10_TEMP1, RX10_TEMP20);

					final place RX10_TEMP26 = here;

					final boolean RX10_TEMP27 = RX10_TEMP24 != RX10_TEMP26;
					if(RX10_TEMP27)
						{

						String RX10_TEMP25 = "Bad place access for array c";
throw new RuntimeException(RX10_TEMP25);

						}

					final INTArray RX10_TEMP28 = c.contents;

					final int v = (Program.intGetValue(RX10_TEMP28, RX10_TEMP20));
					async(h)						{

						final int X10_TEMP21 = (v);

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

						final place RX10_TEMP35 = Program.getPlaceFromDist(SX10_TEMP2, RX10_TEMP31);

						final place RX10_TEMP37 = here;

						final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
						if(RX10_TEMP38)
							{

							String RX10_TEMP36 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP36);

							}

						final INTArray RX10_TEMP39 = result.contents;
						Program.INTSetValue(RX10_TEMP39,RX10_TEMP31,X10_TEMP21);
						}
					}
				}
			}

		final Dist1 RX10_TEMP41 = result.distValue;

		final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;

		final Point1 value[:rank==1] RX10_TEMP43 = RX10_TEMP42.pointArray;
		for(point(:rank==1)RX10_TEMP40 : RX10_TEMP43)
			{

			final Point1 p = RX10_TEMP43[RX10_TEMP40];

			final int X10_TEMP25 = (X10_TEMP0.total);

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

			final place RX10_TEMP50 = Program.getPlaceFromDist(SX10_TEMP3, RX10_TEMP46);

			final place RX10_TEMP52 = here;

			final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52;
			if(RX10_TEMP53)
				{

				String RX10_TEMP51 = "Bad place access for array result";
throw new RuntimeException(RX10_TEMP51);

				}

			final INTArray RX10_TEMP54 = result.contents;

			final int X10_TEMP26 = (Program.intGetValue(RX10_TEMP54, RX10_TEMP46));

			final int X10_TEMP27 = (X10_TEMP25 + X10_TEMP26);
			X10_TEMP0.total = (X10_TEMP27);
			}
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

		final double X10_TEMP7 = (Program.doubleGetValue(RX10_TEMP11, RX10_TEMP3));

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

		final double X10_TEMP15 = (Program.doubleGetValue(RX10_TEMP35, RX10_TEMP27));

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

		final double X10_TEMP23 = (Program.doubleGetValue(RX10_TEMP59, RX10_TEMP51));

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

		final double X10_TEMP24 = (Program.doubleGetValue(RX10_TEMP71, RX10_TEMP63));

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

		final double X10_TEMP5 = (Program.doubleGetValue(RX10_TEMP11, RX10_TEMP3));
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
		final place pl1 = here;
		final place value[:rank==1] d1Array = d1.placeArray;
		final region(:rank==1) reg = [0 : y];
		final dist(:rank==1) dis = reg -> pl1;
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
		final place value[:rank==1] placeArray = (place value[:rank==1]) (new place value[reg] (point(:rank==1) p)
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
		final place pl1 = here;

		final dist(:rank==1) dis = R -> pl1;
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
		final region(:rank==1) R = [0 : ub];
		final place pl1 = here;

		final dist(:rank==1) dis = R -> pl1;
		final int [:rank==1] tempCounts = (int [:rank==1]) (new int[dis]);
		
		final int count = d.placeArray.region.size();
	
		final place value[:rank==1] placeArray = d.placeArray;
	
		final region(:rank==1) runReg = [0 : count];
		final dist(:rank==1) runDist = runReg -> pl1;
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

		final region(:rank==1) retReg = [0 : zero];
		final dist(:rank==1) retDist = retReg -> pl;

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
		final region(:rank==1) localReg = [0 : sizeOfChunk];
		final place allocPlace = here;
		final dist(:rank==1) localDist = localReg -> allocPlace;

		final int[:rank==1] temp = (int[:rank==1])(new int[localDist]);
		return temp;
	}
	public static int intGetValue(final INTArray arr, final int index){
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

	public static void intSetValue(final INTArray arr, final int index, final int val){
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
	public static DOUBLEStub createDOUBLEStub(final place remotePlace, final double count) {

		final int zero = 0;
		final place pl = here;

		final region(:rank==1) retReg = [0 : zero];
		final dist(:rank==1) retDist = retReg -> pl;

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
		final region(:rank==1) localReg = [0 : sizeOfChunk];
		final place allocPlace = here;
		final dist(:rank==1) localDist = localReg -> allocPlace;

		final int[:rank==1] temp = (int[:rank==1])(new int[localDist]);
		return temp;
	}
	public static double doubleGetValue(final DOUBLEArray arr, final int index){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static void doubleSetValue(final DOUBLEArray arr, final int index, final double val){
		final place pl = here;
		final int placeIndex = pl.id;
		final DOUBLEStub value[:rank==1] contents = arr.contents;	
		final DOUBLEStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final Dist distArray = arr.distArray;
		final int localIndex = Program.getLocalIndex(distArray, index);
		localArray[localIndex] = (val);
		return;
	}

}
