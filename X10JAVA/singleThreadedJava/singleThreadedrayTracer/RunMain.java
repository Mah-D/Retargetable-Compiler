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

 
public static final int _RayTracer_alpha = Program._RayTracer_alpha_init(myUniquePlacePoint);
public static final Vec _RayTracer_voidVec = Program._RayTracer_voidVec_init(myUniquePlacePoint);
public static final int _Scene_maxObjects = Program._Scene_maxObjects_init(myUniquePlacePoint);
public static final int _Scene_maxLights = Program._Scene_maxLights_init(myUniquePlacePoint);
public static final int _Timer_max_counters = Program._Timer_max_counters_init(myUniquePlacePoint);



public static int prev(int x){ if(x==0){ x=Program.MAX_PLACES; }else{ x = x-1; } return x;}
public static String Envelope2_toString ( final Envelope2 X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP2 = "";

		return X10_TEMP2;
		}
public static String Envelope_toString ( final Envelope X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP2 = "";

		return X10_TEMP2;
		}
public static String Interval_toString ( final Interval X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP1 = X10_TEMP0.number;


		final String X10_TEMP2 = " ";


		final String X10_TEMP3 = X10_TEMP1 + X10_TEMP2;


		final int X10_TEMP4 = X10_TEMP0.width;


		final String X10_TEMP5 = X10_TEMP3 + X10_TEMP4;


		final String X10_TEMP6 = " ";


		final String X10_TEMP7 = X10_TEMP5 + X10_TEMP6;


		final int X10_TEMP8 = X10_TEMP0.height;


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " ";


		final String X10_TEMP11 = X10_TEMP9 + X10_TEMP10;


		final int X10_TEMP12 = X10_TEMP0.yfrom;


		final String X10_TEMP13 = X10_TEMP11 + X10_TEMP12;


		final String X10_TEMP14 = " ";


		final String X10_TEMP15 = X10_TEMP13 + X10_TEMP14;


		final int X10_TEMP16 = X10_TEMP0.yto;


		final String X10_TEMP17 = X10_TEMP15 + X10_TEMP16;


		final String X10_TEMP18 = " ";


		final String X10_TEMP19 = X10_TEMP17 + X10_TEMP18;


		final int X10_TEMP20 = X10_TEMP0.total;


		final String X10_TEMP22 = X10_TEMP19 + X10_TEMP20;

		return X10_TEMP22;
		}
public static String Light_toString ( final Light X10_TEMP0, int myUniquePlacePoint)
		{

		final Vec X10_TEMP1 = X10_TEMP0.pos;


		final String X10_TEMP2 = " ";


		final String X10_TEMP3 = Program.Vec_toString(X10_TEMP1,myUniquePlacePoint);


		final String X10_TEMP4 = X10_TEMP3 + X10_TEMP2;


		final double X10_TEMP5 = X10_TEMP0.brightness;


		final String X10_TEMP7 = X10_TEMP4 + X10_TEMP5;

		return X10_TEMP7;
		}
public static void runMain (  int myUniquePlacePoint)
		{

		Timer tmr = new Timer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(tmr.hashCode());


		int count = 0;

		Program.Timer_start(tmr, count,myUniquePlacePoint);

		final RayTracer X10_TEMP4 = new RayTracer(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());

		Program.RayTracer_run(X10_TEMP4,myUniquePlacePoint);
		Program.Timer_stop(tmr, count,myUniquePlacePoint);

		final String X10_TEMP7 = "Wall-clock time for raytracer: ";


		final double X10_TEMP8 = Program.Timer_readTimer(tmr, count,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " secs";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		System.out.println(X10_TEMP12);
		}
public static int _RayTracer_alpha_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP1 = 255;


		final int X10_TEMP2 = 24;


		final int X10_TEMP4 = X10_TEMP1 << X10_TEMP2;

		return X10_TEMP4;
		}
public static Vec _RayTracer_voidVec_init (  int myUniquePlacePoint)
		{

		final Vec X10_TEMP2 = new Vec(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP2.hashCode());

		return X10_TEMP2;
		}
public static void RayTracer_JGFsetsize ( final RayTracer X10_TEMP0, final int size_t, int myUniquePlacePoint)
		{

		final long X10_TEMP3 = 0;


		final long X10_TEMP4 = X10_TEMP3;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.checksum = (X10_TEMP4);

		final int X10_TEMP7 = 0;


		final int X10_TEMP8 = 1;


		final Region1 X10_TEMP9 = Program.createNewRegion1R(X10_TEMP7, X10_TEMP8,myUniquePlacePoint);


		final int X10_TEMP10 = 0;


		Dist1 d1 = Program.getPlaceDist1(X10_TEMP9, X10_TEMP10,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = d1.dReg;


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


				final int RX10_TEMP11 = Program.getDistLocalCount1(d1, RX10_TEMP9,myUniquePlacePoint);


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


		final intRefArray1 RX10_TEMP19 = new intRefArray1(d1, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final intRefArray1 X10_TEMP14 = RX10_TEMP19;


		final intRefArray1 X10_TEMP15 = X10_TEMP14;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.datasizes = (X10_TEMP15);

		final intRefArray1 X10_TEMP16 = X10_TEMP0.datasizes;


		final int X10_TEMP18 = 0;


		final int X10_TEMP21 = 20;


		final int X10_TEMP22 = X10_TEMP21;


		final Point1 RX10_TEMP20 = new Point1(X10_TEMP18,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final Dist1 RX10_TEMP21 = X10_TEMP16.distValue;


		final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


		final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, RX10_TEMP20,myUniquePlacePoint);


		final int RX10_TEMP24 = 0;


		final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;

		if(RX10_TEMP25)
			{

			String RX10_TEMP26 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP26);

			}

		final int RX10_TEMP27 = Program.getPlaceFromDist1(RX10_TEMP21, RX10_TEMP23,myUniquePlacePoint);


		final int RX10_TEMP29 = 0;


		final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;

		if(RX10_TEMP30)
			{

			String RX10_TEMP28 = "Bad place access for array X10_TEMP16";

			throw new RuntimeException(RX10_TEMP28);

			}
		Program.setRefArrayValue1int(X10_TEMP16, RX10_TEMP23, X10_TEMP22,myUniquePlacePoint);

		final intRefArray1 X10_TEMP23 = X10_TEMP0.datasizes;


		final int X10_TEMP25 = 1;


		final int X10_TEMP28 = 500;


		final int X10_TEMP29 = X10_TEMP28;


		final Point1 RX10_TEMP31 = new Point1(X10_TEMP25,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP31.hashCode());


		final Dist1 RX10_TEMP32 = X10_TEMP23.distValue;


		final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;


		final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31,myUniquePlacePoint);


		final int RX10_TEMP35 = 0;


		final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;

		if(RX10_TEMP36)
			{

			String RX10_TEMP37 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP37);

			}

		final int RX10_TEMP38 = Program.getPlaceFromDist1(RX10_TEMP32, RX10_TEMP34,myUniquePlacePoint);


		final int RX10_TEMP40 = 0;


		final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;

		if(RX10_TEMP41)
			{

			String RX10_TEMP39 = "Bad place access for array X10_TEMP23";

			throw new RuntimeException(RX10_TEMP39);

			}
		Program.setRefArrayValue1int(X10_TEMP23, RX10_TEMP34, X10_TEMP29,myUniquePlacePoint);

		final int X10_TEMP32 = size_t;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.size_t = (X10_TEMP32);
		}
public static void RayTracer_JGFinitialise ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{

		final intRefArray1 X10_TEMP1 = X10_TEMP0.datasizes;


		final int X10_TEMP3 = X10_TEMP0.size_t;


		final Point1 RX10_TEMP0 = new Point1(X10_TEMP3,myUniquePlacePoint);
		
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

		final int RX10_TEMP11 = Program.getRefArrayValue1int(X10_TEMP1, RX10_TEMP3,myUniquePlacePoint);


		final int X10_TEMP6 = RX10_TEMP11;


		final int X10_TEMP7 = X10_TEMP6;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.width = (X10_TEMP7);

		final intRefArray1 X10_TEMP8 = X10_TEMP0.datasizes;


		final int X10_TEMP10 = X10_TEMP0.size_t;


		final Point1 RX10_TEMP12 = new Point1(X10_TEMP10,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP12.hashCode());


		final Dist1 RX10_TEMP13 = X10_TEMP8.distValue;


		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;


		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12,myUniquePlacePoint);


		final int RX10_TEMP16 = 0;


		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;

		if(RX10_TEMP17)
			{

			String RX10_TEMP18 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP18);

			}

		final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13, RX10_TEMP15,myUniquePlacePoint);


		final int RX10_TEMP21 = 0;


		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;

		if(RX10_TEMP22)
			{

			String RX10_TEMP20 = "Bad place access for array X10_TEMP8";

			throw new RuntimeException(RX10_TEMP20);

			}

		final int RX10_TEMP23 = Program.getRefArrayValue1int(X10_TEMP8, RX10_TEMP15,myUniquePlacePoint);


		final int X10_TEMP13 = RX10_TEMP23;


		final int X10_TEMP14 = X10_TEMP13;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.height = (X10_TEMP14);

		final Scene X10_TEMP17 = Program.RayTracer_createScene(X10_TEMP0,myUniquePlacePoint);


		final Scene X10_TEMP18 = X10_TEMP17;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.scene = (X10_TEMP18);

		final Scene X10_TEMP20 = X10_TEMP0.scene;

		Program.RayTracer_setScene(X10_TEMP0, X10_TEMP20,myUniquePlacePoint);

		final Scene X10_TEMP21 = X10_TEMP0.scene;


		final int X10_TEMP24 = Program.Scene_getObjects(X10_TEMP21,myUniquePlacePoint);


		final int X10_TEMP25 = X10_TEMP24;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.numobjects = (X10_TEMP25);
		}
public static void RayTracer_JGFapplication ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{

		int X10_TEMP7 = 0;


		int X10_TEMP8 = X10_TEMP0.width;


		int X10_TEMP9 = X10_TEMP0.height;


		int X10_TEMP10 = 0;


		int X10_TEMP11 = X10_TEMP0.height;


		int X10_TEMP12 = 1;


		Interval interval = new Interval(X10_TEMP7, X10_TEMP8, X10_TEMP9, X10_TEMP10, X10_TEMP11, X10_TEMP12,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(interval.hashCode());

		Program.RayTracer_render(X10_TEMP0, interval,myUniquePlacePoint);
		}
public static void RayTracer_JGFvalidate ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP3 = 0;


		final int X10_TEMP4 = 1;


		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);


		final int X10_TEMP6 = 0;


		Dist1 d1 = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = d1.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final longStub[] RX10_TEMP6 = new longStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(d1, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final long[] RX10_TEMP14 = new long[RX10_TEMP13];


					final longStub RX10_TEMP15 = new longStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final longStub[] RX10_TEMP16 = (longStub[])(new longStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final longStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final longRefArray1 RX10_TEMP19 = new longRefArray1(d1, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		longRefArray1 refval = RX10_TEMP19;


		final int X10_TEMP10 = 0;


		final long X10_TEMP13 = 51428;


		final long X10_TEMP14 = X10_TEMP13;


		final Point1 RX10_TEMP20 = new Point1(X10_TEMP10,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP20.hashCode());


		final Dist1 RX10_TEMP21 = refval.distValue;


		final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


		final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, RX10_TEMP20,myUniquePlacePoint);


		final int RX10_TEMP24 = 0;


		final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;

		if(RX10_TEMP25)
			{

			String RX10_TEMP26 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP26);

			}

		final int RX10_TEMP27 = Program.getPlaceFromDist1(RX10_TEMP21, RX10_TEMP23,myUniquePlacePoint);


		final int RX10_TEMP29 = 0;


		final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;

		if(RX10_TEMP30)
			{

			String RX10_TEMP28 = "Bad place access for array refval";

			throw new RuntimeException(RX10_TEMP28);

			}
		Program.setRefArrayValue1long(refval, RX10_TEMP23, X10_TEMP14,myUniquePlacePoint);

		final int X10_TEMP16 = 1;


		final long X10_TEMP19 = 29827635;


		final long X10_TEMP20 = X10_TEMP19;


		final Point1 RX10_TEMP31 = new Point1(X10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP31.hashCode());


		final Dist1 RX10_TEMP32 = refval.distValue;


		final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;


		final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31,myUniquePlacePoint);


		final int RX10_TEMP35 = 0;


		final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;

		if(RX10_TEMP36)
			{

			String RX10_TEMP37 = "Array index out of bounds";

			throw new RuntimeException(RX10_TEMP37);

			}

		final int RX10_TEMP38 = Program.getPlaceFromDist1(RX10_TEMP32, RX10_TEMP34,myUniquePlacePoint);


		final int RX10_TEMP40 = 0;


		final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;

		if(RX10_TEMP41)
			{

			String RX10_TEMP39 = "Bad place access for array refval";

			throw new RuntimeException(RX10_TEMP39);

			}
		Program.setRefArrayValue1long(refval, RX10_TEMP34, X10_TEMP20,myUniquePlacePoint);

		final long X10_TEMP23 = X10_TEMP0.checksum;


		final int X10_TEMP22 = X10_TEMP0.size_t;


		final Point1 RX10_TEMP42 = new Point1(X10_TEMP22,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP42.hashCode());


		final Dist1 RX10_TEMP43 = refval.distValue;


		final Region1 RX10_TEMP44 = RX10_TEMP43.dReg;


		final int RX10_TEMP45 = Program.searchPointInRegion1(RX10_TEMP44, RX10_TEMP42,myUniquePlacePoint);


		final int RX10_TEMP46 = 0;


		final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;

		if(RX10_TEMP47)
			{

			String RX10_TEMP48 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP48);

			}

		final int RX10_TEMP49 = Program.getPlaceFromDist1(RX10_TEMP43, RX10_TEMP45,myUniquePlacePoint);


		final int RX10_TEMP51 = 0;


		final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;

		if(RX10_TEMP52)
			{

			String RX10_TEMP50 = "Bad place access for array refval";

			throw new RuntimeException(RX10_TEMP50);

			}

		final long RX10_TEMP53 = Program.getRefArrayValue1long(refval, RX10_TEMP45,myUniquePlacePoint);


		final long X10_TEMP24 = RX10_TEMP53;


		long dev = X10_TEMP23 - X10_TEMP24;


		final int X10_TEMP26 = 0;


		final boolean X10_TEMP28 = dev != X10_TEMP26;

		if(X10_TEMP28)
			{

			final String X10_TEMP30 = "Validation failed";

			System.out.println(X10_TEMP30);

			final String X10_TEMP31 = "Pixel checksum = ";


			final long X10_TEMP32 = X10_TEMP0.checksum;


			final String X10_TEMP34 = X10_TEMP31 + X10_TEMP32;

			System.out.println(X10_TEMP34);

			final String X10_TEMP37 = "Reference value = ";


			final int X10_TEMP36 = X10_TEMP0.size_t;


			final Point1 RX10_TEMP54 = new Point1(X10_TEMP36,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP54.hashCode());


			final Dist1 RX10_TEMP55 = refval.distValue;


			final Region1 RX10_TEMP56 = RX10_TEMP55.dReg;


			final int RX10_TEMP57 = Program.searchPointInRegion1(RX10_TEMP56, RX10_TEMP54,myUniquePlacePoint);


			final int RX10_TEMP58 = 0;


			final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58;

			if(RX10_TEMP59)
				{

				String RX10_TEMP60 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP60);

				}

			final int RX10_TEMP61 = Program.getPlaceFromDist1(RX10_TEMP55, RX10_TEMP57,myUniquePlacePoint);


			final int RX10_TEMP63 = 0;


			final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63;

			if(RX10_TEMP64)
				{

				String RX10_TEMP62 = "Bad place access for array refval";

				throw new RuntimeException(RX10_TEMP62);

				}

			final long RX10_TEMP65 = Program.getRefArrayValue1long(refval, RX10_TEMP57,myUniquePlacePoint);


			final long X10_TEMP38 = RX10_TEMP65;


			final String X10_TEMP40 = X10_TEMP37 + X10_TEMP38;

			System.out.println(X10_TEMP40);

			final String X10_TEMP42 = "Validation failed";

			throw new RuntimeException(X10_TEMP42);

			}
		}
public static void RayTracer_JGFtidyup ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{
		}
public static void RayTracer_run ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 0;

		Program.RayTracer_JGFsetsize(X10_TEMP0, X10_TEMP2,myUniquePlacePoint);
		Program.RayTracer_JGFinitialise(X10_TEMP0,myUniquePlacePoint);
		Program.RayTracer_JGFapplication(X10_TEMP0,myUniquePlacePoint);
		Program.RayTracer_JGFvalidate(X10_TEMP0,myUniquePlacePoint);
		Program.RayTracer_JGFtidyup(X10_TEMP0,myUniquePlacePoint);
		}
public static Scene RayTracer_createScene ( final RayTracer X10_TEMP0, int myUniquePlacePoint)
		{

		final int x = 0;


		final int y = 0;


		int X10_TEMP9 = 20;


		final int X10_TEMP5 = 30;


		final int X10_TEMP6 = 0;


		int X10_TEMP10 = X10_TEMP6 - X10_TEMP5;


		boolean X10_TEMP11 = false;


		Vec X10_TEMP36 = new Vec(x, X10_TEMP9, X10_TEMP10, X10_TEMP11,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP36.hashCode());


		int X10_TEMP17 = 0;


		boolean X10_TEMP18 = false;


		Vec X10_TEMP37 = new Vec(x, y, X10_TEMP17, X10_TEMP18,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP37.hashCode());


		int X10_TEMP24 = 0;


		int X10_TEMP25 = 1;


		int X10_TEMP26 = 0;


		boolean X10_TEMP27 = false;


		Vec X10_TEMP38 = new Vec(X10_TEMP24, X10_TEMP25, X10_TEMP26, X10_TEMP27,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP38.hashCode());


		double X10_TEMP39 = 1.0;


		final double X10_TEMP30 = 35.0;


		final double X10_TEMP31 = 3.14159265;


		final double X10_TEMP32 = X10_TEMP30 * X10_TEMP31;


		final double X10_TEMP33 = 180.0;


		double X10_TEMP40 = X10_TEMP32 / X10_TEMP33;


		double X10_TEMP41 = 1.0;


		View X10_TEMP43 = new View(X10_TEMP36, X10_TEMP37, X10_TEMP38, X10_TEMP39, X10_TEMP40, X10_TEMP41,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP43.hashCode());


		Scene scene = new Scene(X10_TEMP43,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(scene.hashCode());


		final int nx = 4;


		final int ny = 4;


		final int nz = 4;


		final int X10_TEMP51 = 0;


		final int X10_TEMP49 = 1;


		final int X10_TEMP52 = nx - X10_TEMP49;


		final int X10_TEMP56 = 0;


		final int X10_TEMP54 = 1;


		final int X10_TEMP57 = ny - X10_TEMP54;


		final int X10_TEMP61 = 0;


		final int X10_TEMP59 = 1;


		final int X10_TEMP62 = nz - X10_TEMP59;


		final Region3 reg = Program.createNewRegion3RRR(X10_TEMP51, X10_TEMP52, X10_TEMP56, X10_TEMP57, X10_TEMP61, X10_TEMP62,myUniquePlacePoint);


		final int RX10_TEMP3 = 1;


		int RX10_TEMP1 = reg.regSize;


		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;


		final int  RX10_TEMP2 = RX10_TEMP1+1;

		for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP2; RX10_TEMP0++)
			{

			final int RX10_TEMP4 = RX10_TEMP0;


			final Point3 pp = Program.regionOrdinalPoint3(reg, RX10_TEMP4,myUniquePlacePoint);


			final double X10_TEMP68 = 20.0;


			final int X10_TEMP65 = 1;


			final int X10_TEMP67 = nx - X10_TEMP65;


			final double X10_TEMP70 = X10_TEMP68 / X10_TEMP67;


			final int X10_TEMP71 = pp.f0;


			final double X10_TEMP72 = X10_TEMP70 * X10_TEMP71;


			final double X10_TEMP73 = 10.0;


			double xx = X10_TEMP72 - X10_TEMP73;


			final double X10_TEMP78 = 20.0;


			final int X10_TEMP75 = 1;


			final int X10_TEMP77 = ny - X10_TEMP75;


			final double X10_TEMP80 = X10_TEMP78 / X10_TEMP77;


			final int X10_TEMP81 = pp.f1;


			final double X10_TEMP82 = X10_TEMP80 * X10_TEMP81;


			final double X10_TEMP83 = 10.0;


			double yy = X10_TEMP82 - X10_TEMP83;


			final double X10_TEMP88 = 20.0;


			final int X10_TEMP85 = 1;


			final int X10_TEMP87 = nz - X10_TEMP85;


			final double X10_TEMP90 = X10_TEMP88 / X10_TEMP87;


			final int X10_TEMP91 = pp.f2;


			final double X10_TEMP92 = X10_TEMP90 * X10_TEMP91;


			final double X10_TEMP93 = 10.0;


			double zz = X10_TEMP92 - X10_TEMP93;


			boolean X10_TEMP99 = false;


			Vec X10_TEMP136 = new Vec(xx, yy, zz, X10_TEMP99,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP136.hashCode());


			int X10_TEMP137 = 3;


			double X10_TEMP130 = 15.0;


			final double X10_TEMP103 = 1.5;


			final double X10_TEMP104 = 1.0;


			double X10_TEMP131 = X10_TEMP103 - X10_TEMP104;


			final double X10_TEMP106 = 1.5;


			final double X10_TEMP107 = 1.0;


			double X10_TEMP132 = X10_TEMP106 - X10_TEMP107;


			int X10_TEMP124 = 0;


			int X10_TEMP125 = 0;


			final int X10_TEMP113 = pp.f0;


			final int X10_TEMP114 = pp.f1;


			final int X10_TEMP116 = X10_TEMP113 + X10_TEMP114;


			final int X10_TEMP117 = nx + ny;


			final int X10_TEMP118 = 2;


			final int X10_TEMP120 = X10_TEMP117 - X10_TEMP118;


			final double X10_TEMP121 = (double)X10_TEMP120;


			double X10_TEMP126 = X10_TEMP116 / X10_TEMP121;


			boolean X10_TEMP127 = false;


			Vec X10_TEMP133 = new Vec(X10_TEMP124, X10_TEMP125, X10_TEMP126, X10_TEMP127,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP133.hashCode());


			boolean X10_TEMP134 = false;


			Surface X10_TEMP138 = new Surface(X10_TEMP130, X10_TEMP131, X10_TEMP132, X10_TEMP133, X10_TEMP134,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP138.hashCode());


			Sphere p = new Sphere(X10_TEMP136, X10_TEMP137, X10_TEMP138,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(p.hashCode());

			Program.Scene_addObject(scene, p,myUniquePlacePoint);
			}

		int X10_TEMP147 = 100;


		int X10_TEMP148 = 100;


		final int X10_TEMP143 = 50;


		final int X10_TEMP144 = 0;


		int X10_TEMP149 = X10_TEMP144 - X10_TEMP143;


		double X10_TEMP150 = 1.0;


		final Light X10_TEMP152 = new Light(X10_TEMP147, X10_TEMP148, X10_TEMP149, X10_TEMP150,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP152.hashCode());

		Program.Scene_addLight(scene, X10_TEMP152,myUniquePlacePoint);

		final int X10_TEMP153 = 100;


		final int X10_TEMP154 = 0;


		int X10_TEMP161 = X10_TEMP154 - X10_TEMP153;


		int X10_TEMP162 = 100;


		final int X10_TEMP157 = 50;


		final int X10_TEMP158 = 0;


		int X10_TEMP163 = X10_TEMP158 - X10_TEMP157;


		double X10_TEMP164 = 1.0;


		final Light X10_TEMP166 = new Light(X10_TEMP161, X10_TEMP162, X10_TEMP163, X10_TEMP164,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP166.hashCode());

		Program.Scene_addLight(scene, X10_TEMP166,myUniquePlacePoint);

		int X10_TEMP175 = 100;


		final int X10_TEMP168 = 100;


		final int X10_TEMP169 = 0;


		int X10_TEMP176 = X10_TEMP169 - X10_TEMP168;


		final int X10_TEMP171 = 50;


		final int X10_TEMP172 = 0;


		int X10_TEMP177 = X10_TEMP172 - X10_TEMP171;


		double X10_TEMP178 = 1.0;


		final Light X10_TEMP180 = new Light(X10_TEMP175, X10_TEMP176, X10_TEMP177, X10_TEMP178,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP180.hashCode());

		Program.Scene_addLight(scene, X10_TEMP180,myUniquePlacePoint);

		final int X10_TEMP181 = 100;


		final int X10_TEMP182 = 0;


		int X10_TEMP191 = X10_TEMP182 - X10_TEMP181;


		final int X10_TEMP184 = 100;


		final int X10_TEMP185 = 0;


		int X10_TEMP192 = X10_TEMP185 - X10_TEMP184;


		final int X10_TEMP187 = 50;


		final int X10_TEMP188 = 0;


		int X10_TEMP193 = X10_TEMP188 - X10_TEMP187;


		double X10_TEMP194 = 1.0;


		final Light X10_TEMP196 = new Light(X10_TEMP191, X10_TEMP192, X10_TEMP193, X10_TEMP194,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP196.hashCode());

		Program.Scene_addLight(scene, X10_TEMP196,myUniquePlacePoint);

		int X10_TEMP201 = 200;


		int X10_TEMP202 = 200;


		int X10_TEMP203 = 0;


		double X10_TEMP204 = 1.0;


		final Light X10_TEMP206 = new Light(X10_TEMP201, X10_TEMP202, X10_TEMP203, X10_TEMP204,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP206.hashCode());

		Program.Scene_addLight(scene, X10_TEMP206,myUniquePlacePoint);
		return scene;
		}
public static void RayTracer_setScene ( final RayTracer X10_TEMP0, final Scene scene, int myUniquePlacePoint)
		{

		final int X10_TEMP3 = Program.Scene_getLights(scene,myUniquePlacePoint);


		final int X10_TEMP4 = X10_TEMP3;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.lightCount = (X10_TEMP4);

		final int X10_TEMP7 = Program.Scene_getObjects(scene,myUniquePlacePoint);


		final int X10_TEMP8 = X10_TEMP7;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.objCount = (X10_TEMP8);

		final Scene sc = scene;


		final Dist1 X10_TEMP10 = Program.UniqueDistribution;


		final Dist1 U = X10_TEMP10;


		final int mylightCount = X10_TEMP0.lightCount;


		final int myobjCount = X10_TEMP0.objCount;

		/*FINISH
*/			{

			final Region1 RX10_TEMP1 = U.dReg;


			final int RX10_TEMP4 = 1;


			int RX10_TEMP2 = RX10_TEMP1.regSize;


			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;


			final int  RX10_TEMP3 = RX10_TEMP2+1;

			for(int RX10_TEMP0=0; RX10_TEMP0 < RX10_TEMP3; RX10_TEMP0++)
				{

				final int RX10_TEMP5 = RX10_TEMP0;


				final Point1 pl = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5,myUniquePlacePoint);


				final Region1 RX10_TEMP6 = U.dReg;


				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6, pl,myUniquePlacePoint);


				final int RX10_TEMP8 = 0;


				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;

				if(RX10_TEMP9)
					{

					final String RX10_TEMP10 = "Point pl not found in the distribution U.";

					throw new RuntimeException(RX10_TEMP10);

					}

				final int RX10_TEMP11 = Program.getPlaceFromDist1(U, RX10_TEMP7,myUniquePlacePoint);


				final int X10_TEMP15 = RX10_TEMP11;

				//async(X10_TEMP15)
					{

					final int pHere = 0;


					final int X10_TEMP20 = 0;


					final int X10_TEMP18 = 1;


					final int X10_TEMP21 = mylightCount - X10_TEMP18;


					Region1 d1 = Program.createNewRegion1R(X10_TEMP20, X10_TEMP21,X10_TEMP15);


					final int X10_TEMP26 = 0;


					final int X10_TEMP24 = 1;


					final int X10_TEMP27 = myobjCount - X10_TEMP24;


					Region1 d2 = Program.createNewRegion1R(X10_TEMP26, X10_TEMP27,X10_TEMP15);


					final Region1 RX10_TEMP12 = d1;


					final int RX10_TEMP59 = d1.regSize;


					final int RX10_TEMP60 = 1;


					final int RX10_TEMP61 = RX10_TEMP59 - RX10_TEMP60;


					final int  RX10_TEMP58 = RX10_TEMP61+1;


					final Light[] RX10_TEMP62 = (Light[])(new Light/*value*/[RX10_TEMP58]);
/*arrayInitBlock*/
for(int RX10_TEMP13= 0;RX10_TEMP13 <RX10_TEMP62.length ;RX10_TEMP13++ )						{

						final int RX10_TEMP14 = RX10_TEMP13;


						final Point1 l = Program.regionOrdinalPoint1(RX10_TEMP12, RX10_TEMP14,X10_TEMP15);


						final int X10_TEMP31 = 0;


						final int X10_TEMP32 = 0;


						final Region1 X10_TEMP33 = Program.createNewRegion1R(X10_TEMP31, X10_TEMP32,X10_TEMP15);


						final Dist1 dTemp = Program.getPlaceDist1(X10_TEMP33, pHere,X10_TEMP15);


						final Region1 RX10_TEMP15 = dTemp.dReg;


						final int RX10_TEMP16 = 0;


						final int RX10_TEMP17 = 1;


						int RX10_TEMP18 = Program.MAX_PLACES;


						RX10_TEMP18 = RX10_TEMP18 - RX10_TEMP17;


						final int  RX10_TEMP19 = RX10_TEMP18+1;


						final int RX10_TEMP20 = RX10_TEMP18+1;


						final LightStub[] RX10_TEMP21 = new LightStub[RX10_TEMP20];

						/*FINISH
*/							{
							for(int RX10_TEMP22=0; RX10_TEMP22 < RX10_TEMP19; RX10_TEMP22++)
								{

								final int RX10_TEMP23 = 0;


								final int RX10_TEMP24 = RX10_TEMP22;


								final int RX10_TEMP25 = RX10_TEMP24;


								final int RX10_TEMP26 = Program.getDistLocalCount1(dTemp, RX10_TEMP24,X10_TEMP15);


								final int RX10_TEMP27 = RX10_TEMP26 - RX10_TEMP17;

								//async(RX10_TEMP25)
									{

									final int RX10_TEMP28 = RX10_TEMP27+1;


									final Light[] RX10_TEMP29 = new Light[RX10_TEMP28];


									final LightStub RX10_TEMP30 = new LightStub(RX10_TEMP29,RX10_TEMP25);
									
Program.globalPointerHashMap.get(RX10_TEMP25).add(RX10_TEMP30.hashCode());

									//async(RX10_TEMP23)
										{
										RX10_TEMP21[RX10_TEMP22] = RX10_TEMP30;
										}
									}
								}
							}

						final LightStub[] RX10_TEMP31 = (LightStub[])(new LightStub/*value*/[RX10_TEMP19]);
/*arrayInitBlock*/
for(int RX10_TEMP33= 0;RX10_TEMP33 <RX10_TEMP31.length ;RX10_TEMP33++ )							{

							final LightStub RX10_TEMP32 = RX10_TEMP21[RX10_TEMP33];

							RX10_TEMP31[RX10_TEMP33] =RX10_TEMP32;
							}

;


						final LightRefArray1 RX10_TEMP34 = new LightRefArray1(dTemp, RX10_TEMP31,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP34.hashCode());


						final LightRefArray1 temp = RX10_TEMP34;


						final Point1 temp_l = l;

						/*FINISH
*/							{

							final int X10_TEMP38 = 0;

							//async(X10_TEMP38)
								{

								final Light tempLight = Program.Scene_getLight(sc, temp_l,X10_TEMP38);

								//async(pHere)
									{

									final int X10_TEMP43 = 0;


									final Light X10_TEMP46 = tempLight;


									final Point1 RX10_TEMP35 = new Point1(X10_TEMP43,pHere);
									
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP35.hashCode());


									final Dist1 RX10_TEMP36 = temp.distValue;


									final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;


									final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37, RX10_TEMP35,pHere);


									final int RX10_TEMP39 = 0;


									final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39;

									if(RX10_TEMP40)
										{

										String RX10_TEMP41 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP41);

										}

									final int RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36, RX10_TEMP38,pHere);


									final int RX10_TEMP44 = 0;


									final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44;

									if(RX10_TEMP45)
										{

										String RX10_TEMP43 = "Bad place access for array temp";

										throw new RuntimeException(RX10_TEMP43);

										}
									Program.setRefArrayValue1Light(temp, RX10_TEMP38, X10_TEMP46,pHere);
									}
								}
							}

						final int X10_TEMP48 = 0;


						final Point1 RX10_TEMP46 = new Point1(X10_TEMP48,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP46.hashCode());


						final Dist1 RX10_TEMP47 = temp.distValue;


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

							String RX10_TEMP54 = "Bad place access for array temp";

							throw new RuntimeException(RX10_TEMP54);

							}

						final Light RX10_TEMP57 = Program.getRefArrayValue1Light(temp, RX10_TEMP49,myUniquePlacePoint);


						final Light X10_TEMP50 = RX10_TEMP57;

						RX10_TEMP62[RX10_TEMP13] =X10_TEMP50;
						}

;


					final LightValArray1 RX10_TEMP63 = new LightValArray1(d1, RX10_TEMP62,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP63.hashCode());


					final LightValArray1 X10_TEMP51 = RX10_TEMP63;


					final LightValArray1 templights = X10_TEMP51;

					/*FINISH
*/						{

						final int X10_TEMP54 = 0;

						//async(X10_TEMP54)
							{

							final LightValArray1 X10_TEMP57 = templights;

														if(!Program.globalPointerHashMap.get(X10_TEMP54).contains(X10_TEMP0.hashCode())){
							throw new RuntimeException("Object in wrong place");
							}							X10_TEMP0.lights = (X10_TEMP57);
							}
						}

					final Region1 RX10_TEMP64 = d2;


					final int RX10_TEMP111 = d2.regSize;


					final int RX10_TEMP112 = 1;


					final int RX10_TEMP113 = RX10_TEMP111 - RX10_TEMP112;


					final int  RX10_TEMP110 = RX10_TEMP113+1;


					final Sphere[] RX10_TEMP114 = (Sphere[])(new Sphere/*value*/[RX10_TEMP110]);
/*arrayInitBlock*/
for(int RX10_TEMP65= 0;RX10_TEMP65 <RX10_TEMP114.length ;RX10_TEMP65++ )						{

						final int RX10_TEMP66 = RX10_TEMP65;


						final Point1 o = Program.regionOrdinalPoint1(RX10_TEMP64, RX10_TEMP66,myUniquePlacePoint);


						final int X10_TEMP60 = 0;


						final int X10_TEMP61 = 0;


						final Region1 X10_TEMP62 = Program.createNewRegion1R(X10_TEMP60, X10_TEMP61,myUniquePlacePoint);


						final Dist1 dTemp1 = Program.getPlaceDist1(X10_TEMP62, pHere,myUniquePlacePoint);


						final Region1 RX10_TEMP67 = dTemp1.dReg;


						final int RX10_TEMP68 = 0;


						final int RX10_TEMP69 = 1;


						int RX10_TEMP70 = Program.MAX_PLACES;


						RX10_TEMP70 = RX10_TEMP70 - RX10_TEMP69;


						final int  RX10_TEMP71 = RX10_TEMP70+1;


						final int RX10_TEMP72 = RX10_TEMP70+1;


						final SphereStub[] RX10_TEMP73 = new SphereStub[RX10_TEMP72];

						/*FINISH
*/							{
							for(int RX10_TEMP74=0; RX10_TEMP74 < RX10_TEMP71; RX10_TEMP74++)
								{

								final int RX10_TEMP75 = 0;


								final int RX10_TEMP76 = RX10_TEMP74;


								final int RX10_TEMP77 = RX10_TEMP76;


								final int RX10_TEMP78 = Program.getDistLocalCount1(dTemp1, RX10_TEMP76,myUniquePlacePoint);


								final int RX10_TEMP79 = RX10_TEMP78 - RX10_TEMP69;

								//async(RX10_TEMP77)
									{

									final int RX10_TEMP80 = RX10_TEMP79+1;


									final Sphere[] RX10_TEMP81 = new Sphere[RX10_TEMP80];


									final SphereStub RX10_TEMP82 = new SphereStub(RX10_TEMP81,RX10_TEMP77);
									
Program.globalPointerHashMap.get(RX10_TEMP77).add(RX10_TEMP82.hashCode());

									//async(RX10_TEMP75)
										{
										RX10_TEMP73[RX10_TEMP74] = RX10_TEMP82;
										}
									}
								}
							}

						final SphereStub[] RX10_TEMP83 = (SphereStub[])(new SphereStub/*value*/[RX10_TEMP71]);
/*arrayInitBlock*/
for(int RX10_TEMP85= 0;RX10_TEMP85 <RX10_TEMP83.length ;RX10_TEMP85++ )							{

							final SphereStub RX10_TEMP84 = RX10_TEMP73[RX10_TEMP85];

							RX10_TEMP83[RX10_TEMP85] =RX10_TEMP84;
							}

;


						final SphereRefArray1 RX10_TEMP86 = new SphereRefArray1(dTemp1, RX10_TEMP83,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP86.hashCode());


						final SphereRefArray1 temp1 = RX10_TEMP86;


						final Point1 temp_o = o;

						/*FINISH
*/							{

							final int X10_TEMP67 = 0;

							//async(X10_TEMP67)
								{

								final Sphere tempObject = Program.Scene_getObject(sc, temp_o,X10_TEMP67);

								//async(pHere)
									{

									final int X10_TEMP72 = 0;


									final Sphere X10_TEMP75 = tempObject;


									final Point1 RX10_TEMP87 = new Point1(X10_TEMP72,pHere);
									
Program.globalPointerHashMap.get(pHere).add(RX10_TEMP87.hashCode());


									final Dist1 RX10_TEMP88 = temp1.distValue;


									final Region1 RX10_TEMP89 = RX10_TEMP88.dReg;


									final int RX10_TEMP90 = Program.searchPointInRegion1(RX10_TEMP89, RX10_TEMP87,pHere);


									final int RX10_TEMP91 = 0;


									final boolean RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91;

									if(RX10_TEMP92)
										{

										String RX10_TEMP93 = "Array index out of bounds";

										throw new RuntimeException(RX10_TEMP93);

										}

									final int RX10_TEMP94 = Program.getPlaceFromDist1(RX10_TEMP88, RX10_TEMP90,pHere);


									final int RX10_TEMP96 = 0;


									final boolean RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96;

									if(RX10_TEMP97)
										{

										String RX10_TEMP95 = "Bad place access for array temp1";

										throw new RuntimeException(RX10_TEMP95);

										}
									Program.setRefArrayValue1Sphere(temp1, RX10_TEMP90, X10_TEMP75,pHere);
									}
								}
							}

						final int X10_TEMP77 = 0;


						final Point1 RX10_TEMP98 = new Point1(X10_TEMP77,myUniquePlacePoint);
						
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP98.hashCode());


						final Dist1 RX10_TEMP99 = temp1.distValue;


						final Region1 RX10_TEMP100 = RX10_TEMP99.dReg;


						final int RX10_TEMP101 = Program.searchPointInRegion1(RX10_TEMP100, RX10_TEMP98,myUniquePlacePoint);


						final int RX10_TEMP102 = 0;


						final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102;

						if(RX10_TEMP103)
							{

							String RX10_TEMP104 = "Array access index out of bounds";

							throw new RuntimeException(RX10_TEMP104);

							}

						final int RX10_TEMP105 = Program.getPlaceFromDist1(RX10_TEMP99, RX10_TEMP101,myUniquePlacePoint);


						final int RX10_TEMP107 = 0;


						final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107;

						if(RX10_TEMP108)
							{

							String RX10_TEMP106 = "Bad place access for array temp1";

							throw new RuntimeException(RX10_TEMP106);

							}

						final Sphere RX10_TEMP109 = Program.getRefArrayValue1Sphere(temp1, RX10_TEMP101,myUniquePlacePoint);


						final Sphere X10_TEMP79 = RX10_TEMP109;

						RX10_TEMP114[RX10_TEMP65] =X10_TEMP79;
						}

;


					final SphereValArray1 RX10_TEMP115 = new SphereValArray1(d2, RX10_TEMP114,myUniquePlacePoint);
					
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP115.hashCode());


					final SphereValArray1 X10_TEMP80 = RX10_TEMP115;


					final SphereValArray1 tempprim = X10_TEMP80;

					/*FINISH
*/						{

						final int X10_TEMP83 = 0;

						//async(X10_TEMP83)
							{

							final SphereValArray1 X10_TEMP86 = tempprim;

														if(!Program.globalPointerHashMap.get(X10_TEMP83).contains(X10_TEMP0.hashCode())){
							throw new RuntimeException("Object in wrong place");
							}							X10_TEMP0.prim = (X10_TEMP86);
							}
						}
					}
				}
			}

		final View X10_TEMP89 = Program.Scene_getView(scene,myUniquePlacePoint);


		final View X10_TEMP90 = X10_TEMP89;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.view = (X10_TEMP90);
		}
public static void RayTracer_render ( final RayTracer X10_TEMP0, final Interval interval, int myUniquePlacePoint)
		{

		final int X10_TEMP11 = 0;


		final int X10_TEMP6 = interval.width;


		final int X10_TEMP2 = interval.yto;


		final int X10_TEMP3 = interval.yfrom;


		final int X10_TEMP5 = X10_TEMP2 - X10_TEMP3;


		final int X10_TEMP8 = X10_TEMP6 * X10_TEMP5;


		final int X10_TEMP9 = 1;


		final int X10_TEMP12 = X10_TEMP8 - X10_TEMP9;


		final Region1 R = Program.createNewRegion1R(X10_TEMP11, X10_TEMP12,myUniquePlacePoint);


		final Dist1 X10_TEMP15 = Program.getBlockDist1(R,myUniquePlacePoint);


		final Dist1 DBlock = X10_TEMP15;


		final Dist1 X10_TEMP17 = Program.UniqueDistribution;


		final Dist1 U = X10_TEMP17;


		final Region1 RX10_TEMP0 = DBlock.dReg;


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


				final int RX10_TEMP11 = Program.getDistLocalCount1(DBlock, RX10_TEMP9,myUniquePlacePoint);


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


		final intRefArray1 RX10_TEMP19 = new intRefArray1(DBlock, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final intRefArray1 row = RX10_TEMP19;


		final Region1 RX10_TEMP20 = U.dReg;


		final Region1 chkSumReg = RX10_TEMP20;


		final int pHere = 0;


		final int fp = 0;


		final Dist1 chkSumDist = Program.getPlaceDist1(chkSumReg, fp,myUniquePlacePoint);


		final Region1 RX10_TEMP21 = chkSumDist.dReg;


		final int RX10_TEMP22 = 0;


		final int RX10_TEMP23 = 1;


		int RX10_TEMP24 = Program.MAX_PLACES;


		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23;


		final int  RX10_TEMP25 = RX10_TEMP24+1;


		final int RX10_TEMP26 = RX10_TEMP24+1;


		final longStub[] RX10_TEMP27 = new longStub[RX10_TEMP26];

		/*FINISH
*/			{
			for(int RX10_TEMP28=0; RX10_TEMP28 < RX10_TEMP25; RX10_TEMP28++)
				{

				final int RX10_TEMP29 = 0;


				final int RX10_TEMP30 = RX10_TEMP28;


				final int RX10_TEMP31 = RX10_TEMP30;


				final int RX10_TEMP32 = Program.getDistLocalCount1(chkSumDist, RX10_TEMP30,myUniquePlacePoint);


				final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23;

				//async(RX10_TEMP31)
					{

					final int RX10_TEMP34 = RX10_TEMP33+1;


					final long[] RX10_TEMP35 = new long[RX10_TEMP34];


					final longStub RX10_TEMP36 = new longStub(RX10_TEMP35,RX10_TEMP31);
					
Program.globalPointerHashMap.get(RX10_TEMP31).add(RX10_TEMP36.hashCode());

					//async(RX10_TEMP29)
						{
						RX10_TEMP27[RX10_TEMP28] = RX10_TEMP36;
						}
					}
				}
			}

		final longStub[] RX10_TEMP37 = (longStub[])(new longStub/*value*/[RX10_TEMP25]);
/*arrayInitBlock*/
for(int RX10_TEMP39= 0;RX10_TEMP39 <RX10_TEMP37.length ;RX10_TEMP39++ )			{

			final longStub RX10_TEMP38 = RX10_TEMP27[RX10_TEMP39];

			RX10_TEMP37[RX10_TEMP39] =RX10_TEMP38;
			}

;


		final longRefArray1 RX10_TEMP40 = new longRefArray1(chkSumDist, RX10_TEMP37,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP40.hashCode());


		final longRefArray1 X10_TEMP26 = RX10_TEMP40;


		final longRefArray1 X10_TEMP27 = X10_TEMP26;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.checkSumArray = (X10_TEMP27);

		final View myview = X10_TEMP0.view;

		/*FINISH
*/			{

			final Region1 RX10_TEMP42 = U.dReg;


			final int RX10_TEMP45 = 1;


			int RX10_TEMP43 = RX10_TEMP42.regSize;


			RX10_TEMP43 = RX10_TEMP43 - RX10_TEMP45;


			final int  RX10_TEMP44 = RX10_TEMP43+1;

			for(int RX10_TEMP41=0; RX10_TEMP41 < RX10_TEMP44; RX10_TEMP41++)
				{

				final int RX10_TEMP46 = RX10_TEMP41;


				final Point1 pl = Program.regionOrdinalPoint1(RX10_TEMP42, RX10_TEMP46,myUniquePlacePoint);


				final Region1 RX10_TEMP47 = U.dReg;


				final int RX10_TEMP48 = Program.searchPointInRegion1(RX10_TEMP47, pl,myUniquePlacePoint);


				final int RX10_TEMP49 = 0;


				final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49;

				if(RX10_TEMP50)
					{

					final String RX10_TEMP51 = "Point pl not found in the distribution U.";

					throw new RuntimeException(RX10_TEMP51);

					}

				final int RX10_TEMP52 = Program.getPlaceFromDist1(U, RX10_TEMP48,myUniquePlacePoint);


				final int X10_TEMP30 = RX10_TEMP52;

				//async(X10_TEMP30)
					{

					final int X10_TEMP31 = 0;


					final Dist1 my_dist = Program.restrictDist1(DBlock, X10_TEMP31,X10_TEMP30);


					long checksum1 = 0;


					final double X10_TEMP42 = myview.distance;


					final double X10_TEMP35 = myview.angle;


					final double X10_TEMP38 = Math.sin(X10_TEMP35);


					final double X10_TEMP37 = myview.angle;


					final double X10_TEMP39 = Math.cos(X10_TEMP37);


					final double X10_TEMP41 = X10_TEMP38 / X10_TEMP39;


					double frustrumwidth = X10_TEMP42 * X10_TEMP41;


					final Vec X10_TEMP46 = myview.at;


					final Vec X10_TEMP47 = myview.from;


					final Vec X10_TEMP48 = Program.Vec_sub(X10_TEMP46, X10_TEMP47,X10_TEMP30);


					Vec viewVec = Program.Vec_normalized(X10_TEMP48,X10_TEMP30);


					boolean X10_TEMP52 = false;


					final Vec X10_TEMP53 = new Vec(viewVec, X10_TEMP52,X10_TEMP30);
					
Program.globalPointerHashMap.get(X10_TEMP30).add(X10_TEMP53.hashCode());


					final Vec X10_TEMP56 = myview.up;


					final double X10_TEMP58 = Program.Vec_dot(X10_TEMP56, viewVec,X10_TEMP30);


					Vec tmpVec = Program.Vec_scale(X10_TEMP53, X10_TEMP58,X10_TEMP30);


					final Vec X10_TEMP62 = myview.up;


					final Vec X10_TEMP63 = Program.Vec_sub(X10_TEMP62, tmpVec,X10_TEMP30);


					final Vec X10_TEMP64 = Program.Vec_normalized(X10_TEMP63,X10_TEMP30);


					final int X10_TEMP65 = 0;


					final double X10_TEMP67 = X10_TEMP65 - frustrumwidth;


					Vec upVec = Program.Vec_scale(X10_TEMP64, X10_TEMP67,X10_TEMP30);


					final Vec X10_TEMP71 = myview.up;


					final Vec X10_TEMP72 = Program.Vec_cross(X10_TEMP71, viewVec,X10_TEMP30);


					final Vec X10_TEMP73 = Program.Vec_normalized(X10_TEMP72,X10_TEMP30);


					final double X10_TEMP74 = myview.aspect;


					final double X10_TEMP76 = X10_TEMP74 * frustrumwidth;


					Vec leftVec = Program.Vec_scale(X10_TEMP73, X10_TEMP76,X10_TEMP30);


					Vec X10_TEMP80 = myview.from;


					Ray r = new Ray(X10_TEMP80, _RayTracer_voidVec,X10_TEMP30);
					
Program.globalPointerHashMap.get(X10_TEMP30).add(r.hashCode());


					final Region1 RX10_TEMP53 = my_dist.dReg;


					final Region1 X10_TEMP83 = RX10_TEMP53;


					final int RX10_TEMP57 = 1;


					int RX10_TEMP55 = X10_TEMP83.regSize;


					RX10_TEMP55 = RX10_TEMP55 - RX10_TEMP57;


					final int  RX10_TEMP56 = RX10_TEMP55+1;

					for(int RX10_TEMP54=0; RX10_TEMP54 < RX10_TEMP56; RX10_TEMP54++)
						{

						final int RX10_TEMP58 = RX10_TEMP54;


						final Point1 pixCounter = Program.regionOrdinalPoint1(X10_TEMP83, RX10_TEMP58,X10_TEMP30);


						final int X10_TEMP85 = pixCounter.f0;


						final int X10_TEMP86 = interval.width;


						int y = X10_TEMP85 / X10_TEMP86;


						final int X10_TEMP89 = pixCounter.f0;


						final int X10_TEMP90 = interval.width;


						int x = X10_TEMP89 % X10_TEMP90;


						final double X10_TEMP92 = 2.0;


						final double X10_TEMP94 = X10_TEMP92 * y;


						final double X10_TEMP96 = (double)X10_TEMP94;


						final int X10_TEMP95 = interval.width;


						final double X10_TEMP97 = (double)X10_TEMP95;


						final double X10_TEMP98 = X10_TEMP96 / X10_TEMP97;


						final double X10_TEMP99 = 1.0;


						double ylen = X10_TEMP98 - X10_TEMP99;


						final double X10_TEMP101 = 2.0;


						final double X10_TEMP103 = X10_TEMP101 * x;


						final double X10_TEMP105 = (double)X10_TEMP103;


						final int X10_TEMP104 = interval.width;


						final double X10_TEMP106 = (double)X10_TEMP104;


						final double X10_TEMP107 = X10_TEMP105 / X10_TEMP106;


						final double X10_TEMP108 = 1.0;


						double xlen = X10_TEMP107 - X10_TEMP108;


						final Vec X10_TEMP114 = Program.Vec_comb(xlen, leftVec, ylen, upVec,X10_TEMP30);


						final Vec X10_TEMP116 = Program.Vec_added(X10_TEMP114, viewVec,X10_TEMP30);


						final Vec X10_TEMP118 = Program.Vec_normalized(X10_TEMP116,X10_TEMP30);


						final Ray X10_TEMP120 = Program.Ray_d(r, X10_TEMP118,X10_TEMP30);


						r = X10_TEMP120;


						final int X10_TEMP126 = 0;


						final double X10_TEMP127 = 1.0;


						final Isect X10_TEMP128 = new Isect(X10_TEMP30);
						
Program.globalPointerHashMap.get(X10_TEMP30).add(X10_TEMP128.hashCode());


						final Ray X10_TEMP129 = new Ray(X10_TEMP30);
						
Program.globalPointerHashMap.get(X10_TEMP30).add(X10_TEMP129.hashCode());


						Vec col = Program.RayTracer_trace(X10_TEMP0, X10_TEMP126, X10_TEMP127, r, X10_TEMP128, X10_TEMP129,X10_TEMP30);


						final double X10_TEMP131 = col.x;


						final double X10_TEMP132 = 255.0;


						final double X10_TEMP134 = X10_TEMP131 * X10_TEMP132;


						int red = (int)X10_TEMP134;


						final int X10_TEMP136 = 255;


						final boolean X10_TEMP138 = red > X10_TEMP136;

						if(X10_TEMP138)
							{

							final int X10_TEMP140 = 255;


							red = X10_TEMP140;

							}

						final double X10_TEMP141 = col.y;


						final double X10_TEMP142 = 255.0;


						final double X10_TEMP144 = X10_TEMP141 * X10_TEMP142;


						int green = (int)X10_TEMP144;


						final int X10_TEMP146 = 255;


						final boolean X10_TEMP148 = green > X10_TEMP146;

						if(X10_TEMP148)
							{

							final int X10_TEMP150 = 255;


							green = X10_TEMP150;

							}

						final double X10_TEMP151 = col.z;


						final double X10_TEMP152 = 255.0;


						final double X10_TEMP154 = X10_TEMP151 * X10_TEMP152;


						int blue = (int)X10_TEMP154;


						final int X10_TEMP156 = 255;


						final boolean X10_TEMP158 = blue > X10_TEMP156;

						if(X10_TEMP158)
							{

							final int X10_TEMP160 = 255;


							blue = X10_TEMP160;

							}

						final long X10_TEMP161 = checksum1 + red;


						final long X10_TEMP162 = X10_TEMP161 + green;


						final long X10_TEMP164 = X10_TEMP162 + blue;


						checksum1 = X10_TEMP164;

						}

					final long checksumx = checksum1;

					/*FINISH
*/						{
						//async(fp)
							{

							final longRefArray1 X10_TEMP167 = X10_TEMP0.checkSumArray;


							final long X10_TEMP171 = checksumx;


							final Dist1 RX10_TEMP59 = X10_TEMP167.distValue;


							final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;


							final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, pl,fp);


							final int RX10_TEMP62 = 0;


							final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;

							if(RX10_TEMP63)
								{

								String RX10_TEMP64 = "Array index out of bounds";

								throw new RuntimeException(RX10_TEMP64);

								}

							final int RX10_TEMP65 = Program.getPlaceFromDist1(RX10_TEMP59, RX10_TEMP61,fp);


							final int RX10_TEMP67 = 0;


							final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;

							if(RX10_TEMP68)
								{

								String RX10_TEMP66 = "Bad place access for array X10_TEMP167";

								throw new RuntimeException(RX10_TEMP66);

								}
							Program.setRefArrayValue1long(X10_TEMP167, RX10_TEMP61, X10_TEMP171,fp);
							}
						}
					}
				}
			}

		final longRefArray1 X10_TEMP172 = X10_TEMP0.checkSumArray;


		final Dist1 RX10_TEMP69 = X10_TEMP172.distValue;


		final Dist1 X10_TEMP173 = RX10_TEMP69;


		final Region1 RX10_TEMP70 = X10_TEMP173.dReg;


		final Region1 regSum = RX10_TEMP70;


		final int RX10_TEMP74 = 1;


		int RX10_TEMP72 = chkSumReg.regSize;


		RX10_TEMP72 = RX10_TEMP72 - RX10_TEMP74;


		final int  RX10_TEMP73 = RX10_TEMP72+1;

		for(int RX10_TEMP71=0; RX10_TEMP71 < RX10_TEMP73; RX10_TEMP71++)
			{

			final int RX10_TEMP75 = RX10_TEMP71;


			final Point1 i = Program.regionOrdinalPoint1(chkSumReg, RX10_TEMP75,myUniquePlacePoint);


			final long X10_TEMP178 = X10_TEMP0.checksum;


			final longRefArray1 X10_TEMP176 = X10_TEMP0.checkSumArray;


			final Dist1 RX10_TEMP76 = X10_TEMP176.distValue;


			final Region1 RX10_TEMP77 = RX10_TEMP76.dReg;


			final int RX10_TEMP78 = Program.searchPointInRegion1(RX10_TEMP77, i,myUniquePlacePoint);


			final int RX10_TEMP79 = 0;


			final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79;

			if(RX10_TEMP80)
				{

				String RX10_TEMP81 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP81);

				}

			final int RX10_TEMP82 = Program.getPlaceFromDist1(RX10_TEMP76, RX10_TEMP78,myUniquePlacePoint);


			final int RX10_TEMP84 = 0;


			final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84;

			if(RX10_TEMP85)
				{

				String RX10_TEMP83 = "Bad place access for array X10_TEMP176";

				throw new RuntimeException(RX10_TEMP83);

				}

			final long RX10_TEMP86 = Program.getRefArrayValue1long(X10_TEMP176, RX10_TEMP78,myUniquePlacePoint);


			final long X10_TEMP179 = RX10_TEMP86;


			final long X10_TEMP182 = X10_TEMP178 + X10_TEMP179;


			final long X10_TEMP183 = X10_TEMP182;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			X10_TEMP0.checksum = (X10_TEMP183);
			}
		}
public static boolean RayTracer_intersect ( final RayTracer X10_TEMP0, final Ray r, final double maxt, final Isect inter, int myUniquePlacePoint)
		{

		int nhits = 0;


		final double X10_TEMP4 = 1e9;


		final double X10_TEMP5 = X10_TEMP4;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(inter.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		inter.t = (X10_TEMP5);

		final int h = 0;


		final int X10_TEMP9 = 0;


		final int X10_TEMP10 = 0;


		final Region1 X10_TEMP11 = Program.createNewRegion1R(X10_TEMP9, X10_TEMP10,myUniquePlacePoint);


		final int X10_TEMP12 = 0;


		final Dist1 dTemp = Program.getPlaceDist1(X10_TEMP11, X10_TEMP12,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dTemp.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final EnvelopeStub[] RX10_TEMP6 = new EnvelopeStub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dTemp, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Envelope[] RX10_TEMP14 = new Envelope[RX10_TEMP13];


					final EnvelopeStub RX10_TEMP15 = new EnvelopeStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final EnvelopeStub[] RX10_TEMP16 = (EnvelopeStub[])(new EnvelopeStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final EnvelopeStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final EnvelopeRefArray1 RX10_TEMP19 = new EnvelopeRefArray1(dTemp, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final EnvelopeRefArray1 temp = RX10_TEMP19;

		/*FINISH
*/			{

			final int X10_TEMP16 = 0;

			//async(X10_TEMP16)
				{

				final int tempobjCount = X10_TEMP0.objCount;


				final SphereValArray1 tempprim = X10_TEMP0.prim;

				//async(h)
					{

					final int X10_TEMP21 = 0;


					final Envelope X10_TEMP26 = new Envelope(tempobjCount, tempprim,h);
					
Program.globalPointerHashMap.get(h).add(X10_TEMP26.hashCode());


					final Envelope X10_TEMP27 = X10_TEMP26;


					final Point1 RX10_TEMP20 = new Point1(X10_TEMP21,h);
					
Program.globalPointerHashMap.get(h).add(RX10_TEMP20.hashCode());


					final Dist1 RX10_TEMP21 = temp.distValue;


					final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


					final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, RX10_TEMP20,h);


					final int RX10_TEMP24 = 0;


					final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;

					if(RX10_TEMP25)
						{

						String RX10_TEMP26 = "Array index out of bounds";

						throw new RuntimeException(RX10_TEMP26);

						}

					final int RX10_TEMP27 = Program.getPlaceFromDist1(RX10_TEMP21, RX10_TEMP23,h);


					final int RX10_TEMP29 = 0;


					final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;

					if(RX10_TEMP30)
						{

						String RX10_TEMP28 = "Bad place access for array temp";

						throw new RuntimeException(RX10_TEMP28);

						}
					Program.setRefArrayValue1Envelope(temp, RX10_TEMP23, X10_TEMP27,h);
					}
				}
			}

		final int X10_TEMP29 = 0;


		final Point1 RX10_TEMP31 = new Point1(X10_TEMP29,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP31.hashCode());


		final Dist1 RX10_TEMP32 = temp.distValue;


		final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;


		final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31,myUniquePlacePoint);


		final int RX10_TEMP35 = 0;


		final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;

		if(RX10_TEMP36)
			{

			String RX10_TEMP37 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP37);

			}

		final int RX10_TEMP38 = Program.getPlaceFromDist1(RX10_TEMP32, RX10_TEMP34,myUniquePlacePoint);


		final int RX10_TEMP40 = 0;


		final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;

		if(RX10_TEMP41)
			{

			String RX10_TEMP39 = "Bad place access for array temp";

			throw new RuntimeException(RX10_TEMP39);

			}

		final Envelope RX10_TEMP42 = Program.getRefArrayValue1Envelope(temp, RX10_TEMP34,myUniquePlacePoint);


		final Envelope X10_TEMP30 = RX10_TEMP42;


		final int myobjCount = X10_TEMP30.i;


		final int X10_TEMP33 = 0;


		final Point1 RX10_TEMP43 = new Point1(X10_TEMP33,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP43.hashCode());


		final Dist1 RX10_TEMP44 = temp.distValue;


		final Region1 RX10_TEMP45 = RX10_TEMP44.dReg;


		final int RX10_TEMP46 = Program.searchPointInRegion1(RX10_TEMP45, RX10_TEMP43,myUniquePlacePoint);


		final int RX10_TEMP47 = 0;


		final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47;

		if(RX10_TEMP48)
			{

			String RX10_TEMP49 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP49);

			}

		final int RX10_TEMP50 = Program.getPlaceFromDist1(RX10_TEMP44, RX10_TEMP46,myUniquePlacePoint);


		final int RX10_TEMP52 = 0;


		final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52;

		if(RX10_TEMP53)
			{

			String RX10_TEMP51 = "Bad place access for array temp";

			throw new RuntimeException(RX10_TEMP51);

			}

		final Envelope RX10_TEMP54 = Program.getRefArrayValue1Envelope(temp, RX10_TEMP46,myUniquePlacePoint);


		final Envelope X10_TEMP34 = RX10_TEMP54;


		final SphereValArray1 X10_TEMP36 = X10_TEMP34.a;


		final SphereValArray1 myprim = X10_TEMP36;


		final int X10_TEMP41 = 0;


		final int X10_TEMP39 = 1;


		final int X10_TEMP42 = myobjCount - X10_TEMP39;


		final Region1 X10_TEMP44 = Program.createNewRegion1R(X10_TEMP41, X10_TEMP42,myUniquePlacePoint);


		final int RX10_TEMP58 = 1;


		int RX10_TEMP56 = X10_TEMP44.regSize;


		RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58;


		final int  RX10_TEMP57 = RX10_TEMP56+1;

		for(int RX10_TEMP55=0; RX10_TEMP55 < RX10_TEMP57; RX10_TEMP55++)
			{

			final int RX10_TEMP59 = RX10_TEMP55;


			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP44, RX10_TEMP59,myUniquePlacePoint);


			final Region1 RX10_TEMP60 = myprim.regionValue;


			final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, i,myUniquePlacePoint);


			final int RX10_TEMP62 = 0;


			final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;

			if(RX10_TEMP63)
				{

				String RX10_TEMP64 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP64);

				}

			final Sphere[] RX10_TEMP65 = (Sphere[])(myprim.contents);


			final Sphere X10_TEMP46 = RX10_TEMP65[RX10_TEMP61];


			Isect tp = Program.Sphere_intersect(X10_TEMP46, r,myUniquePlacePoint);


			final boolean X10_TEMP49 = tp.isNull;


			final boolean X10_TEMP52 = ! X10_TEMP49;


			final double X10_TEMP50 = tp.t;


			final double X10_TEMP51 = inter.t;


			final boolean X10_TEMP53 = X10_TEMP50 < X10_TEMP51;


			final boolean X10_TEMP55 = X10_TEMP52 && X10_TEMP53;

			if(X10_TEMP55)
				{

				final double X10_TEMP58 = tp.t;


				final double X10_TEMP59 = X10_TEMP58;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(inter.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				inter.t = (X10_TEMP59);

				final Sphere X10_TEMP62 = tp.prim;


				final Sphere X10_TEMP63 = X10_TEMP62;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(inter.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				inter.prim = (X10_TEMP63);

				final Surface X10_TEMP66 = tp.surf;


				final Surface X10_TEMP67 = X10_TEMP66;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(inter.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				inter.surf = (X10_TEMP67);

				final int X10_TEMP70 = tp.enter;


				final int X10_TEMP71 = X10_TEMP70;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(inter.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				inter.enter = (X10_TEMP71);

				final int X10_TEMP72 = nhits;


				final int X10_TEMP73 = 1;


				nhits = nhits + X10_TEMP73;

				}
			}

		final int X10_TEMP74 = 0;


		final boolean X10_TEMP75 = nhits > X10_TEMP74;


		boolean X10_TEMP78 = false;

		if(X10_TEMP75)
			{

			X10_TEMP78 = true;

			}

		final boolean X10_TEMP79 = X10_TEMP78;

		return X10_TEMP79;
		}
public static int RayTracer_Shadow ( final RayTracer X10_TEMP0, final Ray r, final double tmax, final Isect inter, int myUniquePlacePoint)
		{

		final boolean X10_TEMP5 = Program.RayTracer_intersect(X10_TEMP0, r, tmax, inter,myUniquePlacePoint);

		if(X10_TEMP5)
			{

			final int X10_TEMP7 = 0;

			return X10_TEMP7;
			}

		final int X10_TEMP9 = 1;

		return X10_TEMP9;
		}
public static Vec RayTracer_SpecularDirection ( final RayTracer X10_TEMP0, final Vec I, final Vec N, int myUniquePlacePoint)
		{

		final double X10_TEMP5 = 1.0;


		final double X10_TEMP4 = Program.Vec_dot(I, N,myUniquePlacePoint);


		final double X10_TEMP6 = Math.abs(X10_TEMP4);


		final double X10_TEMP11 = X10_TEMP5 / X10_TEMP6;


		final double X10_TEMP12 = 2.0;


		final Vec X10_TEMP13 = Program.Vec_comb(X10_TEMP11, I, X10_TEMP12, N,myUniquePlacePoint);


		final Vec X10_TEMP15 = Program.Vec_normalized(X10_TEMP13,myUniquePlacePoint);

		return X10_TEMP15;
		}
public static Vec RayTracer_TransDir ( final RayTracer X10_TEMP0, final Surface m1, final Surface m2, final Vec I, final Vec N, int myUniquePlacePoint)
		{

		final boolean X10_TEMP1 = m1.isNull;


		double X10_TEMP4 = m1.ior;

		if(X10_TEMP1)
			{

			X10_TEMP4 = 1.0;

			}

		final double X10_TEMP5 = X10_TEMP4;


		double n1 = X10_TEMP5;


		final boolean X10_TEMP6 = m2.isNull;


		double X10_TEMP9 = m2.ior;

		if(X10_TEMP6)
			{

			X10_TEMP9 = 1.0;

			}

		final double X10_TEMP10 = X10_TEMP9;


		double n2 = X10_TEMP10;


		double eta = n1 / n2;


		final double X10_TEMP14 = Program.Vec_dot(I, N,myUniquePlacePoint);


		final int X10_TEMP15 = 0;


		double c1 = X10_TEMP15 - X10_TEMP14;


		final double X10_TEMP22 = 1.0;


		final double X10_TEMP21 = eta * eta;


		final double X10_TEMP17 = 1.0;


		final double X10_TEMP18 = c1 * c1;


		final double X10_TEMP20 = X10_TEMP17 - X10_TEMP18;


		final double X10_TEMP23 = X10_TEMP21 * X10_TEMP20;


		double cs2 = X10_TEMP22 - X10_TEMP23;


		final double X10_TEMP25 = 0.0;


		final boolean X10_TEMP27 = cs2 < X10_TEMP25;

		if(X10_TEMP27)
			{

			double X10_TEMP32 = 0.0;


			double X10_TEMP33 = 0.0;


			double X10_TEMP34 = 0.0;


			boolean X10_TEMP35 = true;


			final Vec X10_TEMP37 = new Vec(X10_TEMP32, X10_TEMP33, X10_TEMP34, X10_TEMP35,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP37.hashCode());

			return X10_TEMP37;
			}

		final double X10_TEMP41 = eta * c1;


		final double X10_TEMP42 = Math.sqrt(cs2);


		final double X10_TEMP45 = X10_TEMP41 - X10_TEMP42;


		final Vec X10_TEMP46 = Program.Vec_comb(eta, I, X10_TEMP45, N,myUniquePlacePoint);


		final Vec X10_TEMP48 = Program.Vec_normalized(X10_TEMP46,myUniquePlacePoint);

		return X10_TEMP48;
		}
public static Vec RayTracer_shade ( final RayTracer X10_TEMP0, final int level, final double weight, final Vec P, final Vec N, final Vec I, final Isect hit, final Ray tRay, int myUniquePlacePoint)
		{

		Surface surf = hit.surf;


		Vec bigr = new Vec(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(bigr.hashCode());


		final double X10_TEMP3 = surf.shine;


		final double X10_TEMP4 = 1e-6;


		final boolean X10_TEMP6 = X10_TEMP3 > X10_TEMP4;

		if(X10_TEMP6)
			{

			final Vec X10_TEMP10 = Program.RayTracer_SpecularDirection(X10_TEMP0, I, N,myUniquePlacePoint);


			bigr = X10_TEMP10;

			}

		final int h = 0;


		final int X10_TEMP14 = 0;


		final int X10_TEMP15 = 0;


		final Region1 X10_TEMP16 = Program.createNewRegion1R(X10_TEMP14, X10_TEMP15,myUniquePlacePoint);


		final int X10_TEMP17 = 0;


		final Dist1 dTemp = Program.getPlaceDist1(X10_TEMP16, X10_TEMP17,myUniquePlacePoint);


		final Region1 RX10_TEMP0 = dTemp.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final Envelope2Stub[] RX10_TEMP6 = new Envelope2Stub[RX10_TEMP5];

		/*FINISH
*/			{
			for(int RX10_TEMP7=0; RX10_TEMP7 < RX10_TEMP4; RX10_TEMP7++)
				{

				final int RX10_TEMP8 = 0;


				final int RX10_TEMP9 = RX10_TEMP7;


				final int RX10_TEMP10 = RX10_TEMP9;


				final int RX10_TEMP11 = Program.getDistLocalCount1(dTemp, RX10_TEMP9,myUniquePlacePoint);


				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;

				//async(RX10_TEMP10)
					{

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Envelope2[] RX10_TEMP14 = new Envelope2[RX10_TEMP13];


					final Envelope2Stub RX10_TEMP15 = new Envelope2Stub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final Envelope2Stub[] RX10_TEMP16 = (Envelope2Stub[])(new Envelope2Stub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final Envelope2Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final Envelope2RefArray1 RX10_TEMP19 = new Envelope2RefArray1(dTemp, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final Envelope2RefArray1 temp = RX10_TEMP19;

		/*FINISH
*/			{

			final int X10_TEMP21 = 0;

			//async(X10_TEMP21)
				{

				final int templightCount = X10_TEMP0.lightCount;


				final LightValArray1 templights = X10_TEMP0.lights;

				//async(h)
					{

					final int X10_TEMP26 = 0;


					final Envelope2 X10_TEMP31 = new Envelope2(templightCount, templights,h);
					
Program.globalPointerHashMap.get(h).add(X10_TEMP31.hashCode());


					final Envelope2 X10_TEMP32 = X10_TEMP31;


					final Point1 RX10_TEMP20 = new Point1(X10_TEMP26,h);
					
Program.globalPointerHashMap.get(h).add(RX10_TEMP20.hashCode());


					final Dist1 RX10_TEMP21 = temp.distValue;


					final Region1 RX10_TEMP22 = RX10_TEMP21.dReg;


					final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22, RX10_TEMP20,h);


					final int RX10_TEMP24 = 0;


					final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;

					if(RX10_TEMP25)
						{

						String RX10_TEMP26 = "Array index out of bounds";

						throw new RuntimeException(RX10_TEMP26);

						}

					final int RX10_TEMP27 = Program.getPlaceFromDist1(RX10_TEMP21, RX10_TEMP23,h);


					final int RX10_TEMP29 = 0;


					final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29;

					if(RX10_TEMP30)
						{

						String RX10_TEMP28 = "Bad place access for array temp";

						throw new RuntimeException(RX10_TEMP28);

						}
					Program.setRefArrayValue1Envelope2(temp, RX10_TEMP23, X10_TEMP32,h);
					}
				}
			}

		final int X10_TEMP34 = 0;


		final Point1 RX10_TEMP31 = new Point1(X10_TEMP34,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP31.hashCode());


		final Dist1 RX10_TEMP32 = temp.distValue;


		final Region1 RX10_TEMP33 = RX10_TEMP32.dReg;


		final int RX10_TEMP34 = Program.searchPointInRegion1(RX10_TEMP33, RX10_TEMP31,myUniquePlacePoint);


		final int RX10_TEMP35 = 0;


		final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;

		if(RX10_TEMP36)
			{

			String RX10_TEMP37 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP37);

			}

		final int RX10_TEMP38 = Program.getPlaceFromDist1(RX10_TEMP32, RX10_TEMP34,myUniquePlacePoint);


		final int RX10_TEMP40 = 0;


		final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;

		if(RX10_TEMP41)
			{

			String RX10_TEMP39 = "Bad place access for array temp";

			throw new RuntimeException(RX10_TEMP39);

			}

		final Envelope2 RX10_TEMP42 = Program.getRefArrayValue1Envelope2(temp, RX10_TEMP34,myUniquePlacePoint);


		final Envelope2 X10_TEMP35 = RX10_TEMP42;


		final int mylightCount = X10_TEMP35.i;


		final int X10_TEMP38 = 0;


		final Point1 RX10_TEMP43 = new Point1(X10_TEMP38,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP43.hashCode());


		final Dist1 RX10_TEMP44 = temp.distValue;


		final Region1 RX10_TEMP45 = RX10_TEMP44.dReg;


		final int RX10_TEMP46 = Program.searchPointInRegion1(RX10_TEMP45, RX10_TEMP43,myUniquePlacePoint);


		final int RX10_TEMP47 = 0;


		final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47;

		if(RX10_TEMP48)
			{

			String RX10_TEMP49 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP49);

			}

		final int RX10_TEMP50 = Program.getPlaceFromDist1(RX10_TEMP44, RX10_TEMP46,myUniquePlacePoint);


		final int RX10_TEMP52 = 0;


		final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52;

		if(RX10_TEMP53)
			{

			String RX10_TEMP51 = "Bad place access for array temp";

			throw new RuntimeException(RX10_TEMP51);

			}

		final Envelope2 RX10_TEMP54 = Program.getRefArrayValue1Envelope2(temp, RX10_TEMP46,myUniquePlacePoint);


		final Envelope2 X10_TEMP39 = RX10_TEMP54;


		final LightValArray1 X10_TEMP41 = X10_TEMP39.a;


		final LightValArray1 mylights = X10_TEMP41;


		Vec col = new Vec(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(col.hashCode());


		final int X10_TEMP47 = 0;


		final int X10_TEMP45 = 1;


		final int X10_TEMP48 = mylightCount - X10_TEMP45;


		final Region1 X10_TEMP50 = Program.createNewRegion1R(X10_TEMP47, X10_TEMP48,myUniquePlacePoint);


		final int RX10_TEMP58 = 1;


		int RX10_TEMP56 = X10_TEMP50.regSize;


		RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58;


		final int  RX10_TEMP57 = RX10_TEMP56+1;

		for(int RX10_TEMP55=0; RX10_TEMP55 < RX10_TEMP57; RX10_TEMP55++)
			{

			final int RX10_TEMP59 = RX10_TEMP55;


			final Point1 l = Program.regionOrdinalPoint1(X10_TEMP50, RX10_TEMP59,myUniquePlacePoint);


			final Region1 RX10_TEMP60 = mylights.regionValue;


			final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, l,myUniquePlacePoint);


			final int RX10_TEMP62 = 0;


			final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;

			if(RX10_TEMP63)
				{

				String RX10_TEMP64 = "Array access index out of bounds";

				throw new RuntimeException(RX10_TEMP64);

				}

			final Light[] RX10_TEMP65 = (Light[])(mylights.contents);


			final Light X10_TEMP52 = RX10_TEMP65[RX10_TEMP61];


			final Vec X10_TEMP55 = X10_TEMP52.pos;


			Vec L = Program.Vec_sub(X10_TEMP55, P,myUniquePlacePoint);


			final double X10_TEMP59 = Program.Vec_dot(N, L,myUniquePlacePoint);


			final double X10_TEMP60 = 0.0;


			final boolean X10_TEMP62 = X10_TEMP59 >= X10_TEMP60;

			if(X10_TEMP62)
				{

				final Vec X10_TEMP64 = Program.Vec_normalized(L,myUniquePlacePoint);


				L = X10_TEMP64;


				double t = Program.Vec_length(L,myUniquePlacePoint);


				final Vec X10_TEMP68 = P;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				tRay.p = (X10_TEMP68);

				final Vec X10_TEMP71 = L;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				tRay.d = (X10_TEMP71);

				final int X10_TEMP75 = Program.RayTracer_Shadow(X10_TEMP0, tRay, t, hit,myUniquePlacePoint);


				final int X10_TEMP76 = 0;


				final boolean X10_TEMP78 = X10_TEMP75 > X10_TEMP76;

				if(X10_TEMP78)
					{

					final double X10_TEMP81 = Program.Vec_dot(N, L,myUniquePlacePoint);


					final double X10_TEMP82 = surf.kd;


					final double X10_TEMP85 = X10_TEMP81 * X10_TEMP82;


					final Region1 RX10_TEMP66 = mylights.regionValue;


					final int RX10_TEMP67 = Program.searchPointInRegion1(RX10_TEMP66, l,myUniquePlacePoint);


					final int RX10_TEMP68 = 0;


					final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68;

					if(RX10_TEMP69)
						{

						String RX10_TEMP70 = "Array access index out of bounds";

						throw new RuntimeException(RX10_TEMP70);

						}

					final Light[] RX10_TEMP71 = (Light[])(mylights.contents);


					final Light X10_TEMP84 = RX10_TEMP71[RX10_TEMP67];


					final double X10_TEMP86 = X10_TEMP84.brightness;


					double diff = X10_TEMP85 * X10_TEMP86;


					final Vec X10_TEMP90 = surf.color;


					final Vec X10_TEMP92 = Program.Vec_adds2(col, diff, X10_TEMP90,myUniquePlacePoint);


					col = X10_TEMP92;


					final double X10_TEMP93 = surf.shine;


					final double X10_TEMP94 = 1e-6;


					final boolean X10_TEMP96 = X10_TEMP93 > X10_TEMP94;

					if(X10_TEMP96)
						{

						double spec = Program.Vec_dot(bigr, L,myUniquePlacePoint);


						final double X10_TEMP100 = 1e-6;


						final boolean X10_TEMP102 = spec > X10_TEMP100;

						if(X10_TEMP102)
							{

							final double X10_TEMP105 = surf.shine;


							final double X10_TEMP107 = Math.pow(spec, X10_TEMP105);


							spec = X10_TEMP107;


							boolean X10_TEMP112 = false;


							final Vec X10_TEMP114 = new Vec(spec, spec, spec, X10_TEMP112,myUniquePlacePoint);
							
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP114.hashCode());


							final Vec X10_TEMP116 = Program.Vec_added(col, X10_TEMP114,myUniquePlacePoint);


							col = X10_TEMP116;

							}
						}
					}
				}
			}

		final Vec X10_TEMP119 = P;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		tRay.p = (X10_TEMP119);

		final double X10_TEMP120 = surf.ks;


		final double X10_TEMP121 = X10_TEMP120 * weight;


		final double X10_TEMP122 = 1e-3;


		final boolean X10_TEMP124 = X10_TEMP121 > X10_TEMP122;

		if(X10_TEMP124)
			{

			final Vec X10_TEMP129 = Program.RayTracer_SpecularDirection(X10_TEMP0, I, N,myUniquePlacePoint);


			final Vec X10_TEMP130 = X10_TEMP129;

						if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
			throw new RuntimeException("Object in wrong place");
			}			tRay.d = (X10_TEMP130);

			final int X10_TEMP131 = 1;


			final int X10_TEMP138 = level + X10_TEMP131;


			final double X10_TEMP133 = surf.ks;


			final double X10_TEMP139 = X10_TEMP133 * weight;


			Vec tcol = Program.RayTracer_trace(X10_TEMP0, X10_TEMP138, X10_TEMP139, tRay, hit, tRay,myUniquePlacePoint);


			final double X10_TEMP143 = surf.ks;


			final Vec X10_TEMP145 = Program.Vec_adds2(col, X10_TEMP143, tcol,myUniquePlacePoint);


			col = X10_TEMP145;

			}

		final double X10_TEMP146 = surf.kt;


		final double X10_TEMP147 = X10_TEMP146 * weight;


		final double X10_TEMP148 = 1e-3;


		final boolean X10_TEMP150 = X10_TEMP147 > X10_TEMP148;

		if(X10_TEMP150)
			{

			final int X10_TEMP151 = hit.enter;


			final int X10_TEMP152 = 0;


			final boolean X10_TEMP154 = X10_TEMP151 > X10_TEMP152;

			if(X10_TEMP154)
				{

				int X10_TEMP160 = 0;


				int X10_TEMP161 = 0;


				int X10_TEMP162 = 0;


				Vec X10_TEMP163 = new Vec(myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP163.hashCode());


				boolean X10_TEMP164 = true;


				final Surface X10_TEMP169 = new Surface(X10_TEMP160, X10_TEMP161, X10_TEMP162, X10_TEMP163, X10_TEMP164,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP169.hashCode());


				final Vec X10_TEMP172 = Program.RayTracer_TransDir(X10_TEMP0, X10_TEMP169, surf, I, N,myUniquePlacePoint);


				final Vec X10_TEMP173 = X10_TEMP172;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				tRay.d = (X10_TEMP173);
				}
			else
				{

				int X10_TEMP180 = 0;


				int X10_TEMP181 = 0;


				int X10_TEMP182 = 0;


				Vec X10_TEMP183 = new Vec(myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP183.hashCode());


				boolean X10_TEMP184 = true;


				final Surface X10_TEMP188 = new Surface(X10_TEMP180, X10_TEMP181, X10_TEMP182, X10_TEMP183, X10_TEMP184,myUniquePlacePoint);
				
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP188.hashCode());


				final Vec X10_TEMP191 = Program.RayTracer_TransDir(X10_TEMP0, surf, X10_TEMP188, I, N,myUniquePlacePoint);


				final Vec X10_TEMP192 = X10_TEMP191;

								if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(tRay.hashCode())){
				throw new RuntimeException("Object in wrong place");
				}				tRay.d = (X10_TEMP192);
				}
 
			final int X10_TEMP193 = 1;


			final int X10_TEMP200 = level + X10_TEMP193;


			final double X10_TEMP195 = surf.kt;


			final double X10_TEMP201 = X10_TEMP195 * weight;


			Vec tcol = Program.RayTracer_trace(X10_TEMP0, X10_TEMP200, X10_TEMP201, tRay, hit, tRay,myUniquePlacePoint);


			final double X10_TEMP205 = surf.kt;


			final Vec X10_TEMP207 = Program.Vec_adds2(col, X10_TEMP205, tcol,myUniquePlacePoint);


			col = X10_TEMP207;

			}
		return col;
		}
public static Vec RayTracer_trace ( final RayTracer X10_TEMP0, final int level, final double weight, final Ray r, final Isect inter, final Ray tRay, int myUniquePlacePoint)
		{

		final int X10_TEMP1 = 6;


		final boolean X10_TEMP3 = level > X10_TEMP1;

		if(X10_TEMP3)
			{

			final Vec X10_TEMP5 = new Vec(myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP5.hashCode());

			return X10_TEMP5;
			}

		final double X10_TEMP9 = 1e6;


		boolean hit = Program.RayTracer_intersect(X10_TEMP0, r, X10_TEMP9, inter,myUniquePlacePoint);

		if(hit)
			{

			final double X10_TEMP13 = inter.t;


			Vec P = Program.Ray_rayPoint(r, X10_TEMP13,myUniquePlacePoint);


			final Sphere X10_TEMP15 = inter.prim;


			Vec N = Program.Sphere_normal(X10_TEMP15, P,myUniquePlacePoint);


			final Vec X10_TEMP20 = r.d;


			final double X10_TEMP21 = Program.Vec_dot(X10_TEMP20, N,myUniquePlacePoint);


			final double X10_TEMP22 = 0.0;


			final boolean X10_TEMP24 = X10_TEMP21 >= X10_TEMP22;

			if(X10_TEMP24)
				{

				final Vec X10_TEMP26 = Program.Vec_negate(N,myUniquePlacePoint);


				N = X10_TEMP26;

				}

			final Vec X10_TEMP34 = r.d;


			final Vec X10_TEMP36 = Program.RayTracer_shade(X10_TEMP0, level, weight, P, N, X10_TEMP34, inter, tRay,myUniquePlacePoint);

			return X10_TEMP36;
			}
		return _RayTracer_voidVec;
		}
public static Ray Ray_d ( final Ray X10_TEMP0, final Vec d_, int myUniquePlacePoint)
		{

		Vec X10_TEMP4 = X10_TEMP0.p;


		boolean X10_TEMP5 = false;


		final Ray X10_TEMP7 = new Ray(X10_TEMP4, d_, X10_TEMP5,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP7.hashCode());

		return X10_TEMP7;
		}
public static Vec Ray_rayPoint ( final Ray X10_TEMP0, final double t, int myUniquePlacePoint)
		{

		final Vec X10_TEMP1 = X10_TEMP0.p;


		final double X10_TEMP4 = X10_TEMP1.x;


		final Vec X10_TEMP2 = X10_TEMP0.d;


		final double X10_TEMP3 = X10_TEMP2.x;


		final double X10_TEMP5 = X10_TEMP3 * t;


		double X10_TEMP20 = X10_TEMP4 + X10_TEMP5;


		final Vec X10_TEMP7 = X10_TEMP0.p;


		final double X10_TEMP10 = X10_TEMP7.y;


		final Vec X10_TEMP8 = X10_TEMP0.d;


		final double X10_TEMP9 = X10_TEMP8.y;


		final double X10_TEMP11 = X10_TEMP9 * t;


		double X10_TEMP21 = X10_TEMP10 + X10_TEMP11;


		final Vec X10_TEMP13 = X10_TEMP0.p;


		final double X10_TEMP16 = X10_TEMP13.z;


		final Vec X10_TEMP14 = X10_TEMP0.d;


		final double X10_TEMP15 = X10_TEMP14.z;


		final double X10_TEMP17 = X10_TEMP15 * t;


		double X10_TEMP22 = X10_TEMP16 + X10_TEMP17;


		boolean X10_TEMP23 = false;


		final Vec X10_TEMP25 = new Vec(X10_TEMP20, X10_TEMP21, X10_TEMP22, X10_TEMP23,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP25.hashCode());

		return X10_TEMP25;
		}
public static String Ray_toString ( final Ray X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP2 = " { ";


		final Vec X10_TEMP1 = X10_TEMP0.p;


		final String X10_TEMP3 = Program.Vec_toString(X10_TEMP1,myUniquePlacePoint);


		final String X10_TEMP4 = X10_TEMP2 + X10_TEMP3;


		final String X10_TEMP5 = "->";


		final String X10_TEMP7 = X10_TEMP4 + X10_TEMP5;


		final Vec X10_TEMP6 = X10_TEMP0.d;


		final String X10_TEMP8 = Program.Vec_toString(X10_TEMP6,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final String X10_TEMP10 = " } ";


		final String X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		return X10_TEMP12;
		}
public static int _Scene_maxObjects_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 64;

		return X10_TEMP2;
		}
public static int _Scene_maxLights_init (  int myUniquePlacePoint)
		{

		final int X10_TEMP2 = 5;

		return X10_TEMP2;
		}
public static void Scene_addLight ( final Scene X10_TEMP0, final Light l, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = X10_TEMP0.lightCount;


		final int X10_TEMP1 = 1;


		final int X10_TEMP3 = _Scene_maxLights - X10_TEMP1;


		final boolean X10_TEMP5 = X10_TEMP2 > X10_TEMP3;

		if(X10_TEMP5)
			{

			final String X10_TEMP6 = "Only ";


			final String X10_TEMP7 = X10_TEMP6 + _Scene_maxLights;


			final String X10_TEMP8 = " lights allowed";


			final String X10_TEMP10 = X10_TEMP7 + X10_TEMP8;

			throw new RuntimeException(X10_TEMP10);

			}

		final LightRefArray1 X10_TEMP11 = X10_TEMP0.lights;


		final int X10_TEMP13 = X10_TEMP0.lightCount;


		final Light X10_TEMP16 = l;


		final Point1 RX10_TEMP0 = new Point1(X10_TEMP13,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP11.distValue;


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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP11";

			throw new RuntimeException(RX10_TEMP8);

			}
		Program.setRefArrayValue1Light(X10_TEMP11, RX10_TEMP3, X10_TEMP16,myUniquePlacePoint);

		final int X10_TEMP17 = X10_TEMP0.lightCount;


		final int X10_TEMP18 = 1;


		final int X10_TEMP21 = X10_TEMP17 + X10_TEMP18;


		final int X10_TEMP22 = X10_TEMP21;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.lightCount = (X10_TEMP22);
		}
public static void Scene_addObject ( final Scene X10_TEMP0, final Sphere object, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = X10_TEMP0.objectCount;


		final int X10_TEMP1 = 1;


		final int X10_TEMP3 = _Scene_maxObjects - X10_TEMP1;


		final boolean X10_TEMP5 = X10_TEMP2 > X10_TEMP3;

		if(X10_TEMP5)
			{

			final String X10_TEMP6 = "Only ";


			final String X10_TEMP7 = X10_TEMP6 + _Scene_maxObjects;


			final String X10_TEMP8 = " objects allowed";


			final String X10_TEMP10 = X10_TEMP7 + X10_TEMP8;

			throw new RuntimeException(X10_TEMP10);

			}

		final SphereRefArray1 X10_TEMP11 = X10_TEMP0.objects;


		final int X10_TEMP13 = X10_TEMP0.objectCount;


		final Sphere X10_TEMP16 = object;


		final Point1 RX10_TEMP0 = new Point1(X10_TEMP13,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP0.hashCode());


		final Dist1 RX10_TEMP1 = X10_TEMP11.distValue;


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

			String RX10_TEMP8 = "Bad place access for array X10_TEMP11";

			throw new RuntimeException(RX10_TEMP8);

			}
		Program.setRefArrayValue1Sphere(X10_TEMP11, RX10_TEMP3, X10_TEMP16,myUniquePlacePoint);

		final int X10_TEMP17 = X10_TEMP0.objectCount;


		final int X10_TEMP18 = 1;


		final int X10_TEMP21 = X10_TEMP17 + X10_TEMP18;


		final int X10_TEMP22 = X10_TEMP21;

				if(!Program.globalPointerHashMap.get(myUniquePlacePoint).contains(X10_TEMP0.hashCode())){
		throw new RuntimeException("Object in wrong place");
		}		X10_TEMP0.objectCount = (X10_TEMP22);
		}
public static View Scene_getView ( final Scene X10_TEMP0, int myUniquePlacePoint)
		{

		final View X10_TEMP2 = X10_TEMP0.view;

		return X10_TEMP2;
		}
public static Light Scene_getLight ( final Scene X10_TEMP0, final Point1 number, int myUniquePlacePoint)
		{

		final LightRefArray1 X10_TEMP1 = X10_TEMP0.lights;


		final Dist1 RX10_TEMP0 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;


		final int RX10_TEMP2 = Program.searchPointInRegion1(RX10_TEMP1, number,myUniquePlacePoint);


		final int RX10_TEMP3 = 0;


		final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3;

		if(RX10_TEMP4)
			{

			String RX10_TEMP5 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP5);

			}

		final int RX10_TEMP6 = Program.getPlaceFromDist1(RX10_TEMP0, RX10_TEMP2,myUniquePlacePoint);


		final int RX10_TEMP8 = 0;


		final boolean RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8;

		if(RX10_TEMP9)
			{

			String RX10_TEMP7 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP7);

			}

		final Light RX10_TEMP10 = Program.getRefArrayValue1Light(X10_TEMP1, RX10_TEMP2,myUniquePlacePoint);


		final Light X10_TEMP4 = RX10_TEMP10;

		return X10_TEMP4;
		}
public static Sphere Scene_getObject ( final Scene X10_TEMP0, final Point1 number, int myUniquePlacePoint)
		{

		final SphereRefArray1 X10_TEMP1 = X10_TEMP0.objects;


		final Dist1 RX10_TEMP0 = X10_TEMP1.distValue;


		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;


		final int RX10_TEMP2 = Program.searchPointInRegion1(RX10_TEMP1, number,myUniquePlacePoint);


		final int RX10_TEMP3 = 0;


		final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3;

		if(RX10_TEMP4)
			{

			String RX10_TEMP5 = "Array access index out of bounds";

			throw new RuntimeException(RX10_TEMP5);

			}

		final int RX10_TEMP6 = Program.getPlaceFromDist1(RX10_TEMP0, RX10_TEMP2,myUniquePlacePoint);


		final int RX10_TEMP8 = 0;


		final boolean RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8;

		if(RX10_TEMP9)
			{

			String RX10_TEMP7 = "Bad place access for array X10_TEMP1";

			throw new RuntimeException(RX10_TEMP7);

			}

		final Sphere RX10_TEMP10 = Program.getRefArrayValue1Sphere(X10_TEMP1, RX10_TEMP2,myUniquePlacePoint);


		final Sphere X10_TEMP4 = RX10_TEMP10;

		return X10_TEMP4;
		}
public static int Scene_getLights ( final Scene X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = X10_TEMP0.lightCount;

		return X10_TEMP2;
		}
public static int Scene_getObjects ( final Scene X10_TEMP0, int myUniquePlacePoint)
		{

		final int X10_TEMP2 = X10_TEMP0.objectCount;

		return X10_TEMP2;
		}
public static Isect Sphere_intersect ( final Sphere X10_TEMP0, final Ray ry, int myUniquePlacePoint)
		{

		final Vec X10_TEMP3 = X10_TEMP0.c;


		final Vec X10_TEMP4 = ry.p;


		Vec v = Program.Vec_sub(X10_TEMP3, X10_TEMP4,myUniquePlacePoint);


		final Vec X10_TEMP8 = ry.d;


		double b = Program.Vec_dot(v, X10_TEMP8,myUniquePlacePoint);


		final double X10_TEMP12 = b * b;


		final double X10_TEMP13 = Program.Vec_dot(v, v,myUniquePlacePoint);


		final double X10_TEMP14 = X10_TEMP12 - X10_TEMP13;


		final double X10_TEMP15 = X10_TEMP0.r2;


		double disc = X10_TEMP14 + X10_TEMP15;


		final double X10_TEMP17 = 0.0;


		final boolean X10_TEMP19 = disc < X10_TEMP17;

		if(X10_TEMP19)
			{

			double X10_TEMP25 = 0.0;


			int X10_TEMP26 = 0;


			boolean X10_TEMP27 = true;


			Surface X10_TEMP28 = X10_TEMP0.surf;


			final Isect X10_TEMP30 = new Isect(X10_TEMP25, X10_TEMP26, X10_TEMP27, X10_TEMP0, X10_TEMP28,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP30.hashCode());

			return X10_TEMP30;
			}

		final double X10_TEMP33 = Math.sqrt(disc);


		disc = X10_TEMP33;


		final double X10_TEMP34 = b - disc;


		final double X10_TEMP35 = 1e-6;


		final boolean X10_TEMP37 = X10_TEMP34 < X10_TEMP35;


		final boolean X10_TEMP38 = X10_TEMP37;


		double X10_TEMP41 = b - disc;

		if(X10_TEMP38)
			{

			X10_TEMP41 = b + disc;

			}

		final double X10_TEMP42 = X10_TEMP41;


		double t = X10_TEMP42;


		final double X10_TEMP43 = 1e-6;


		final boolean X10_TEMP45 = t < X10_TEMP43;

		if(X10_TEMP45)
			{

			double X10_TEMP51 = 0.0;


			int X10_TEMP52 = 0;


			boolean X10_TEMP53 = true;


			Surface X10_TEMP54 = X10_TEMP0.surf;


			final Isect X10_TEMP56 = new Isect(X10_TEMP51, X10_TEMP52, X10_TEMP53, X10_TEMP0, X10_TEMP54,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP56.hashCode());

			return X10_TEMP56;
			}

		final double X10_TEMP62 = Program.Vec_dot(v, v,myUniquePlacePoint);


		final double X10_TEMP60 = X10_TEMP0.r2;


		final double X10_TEMP61 = 1e-6;


		final double X10_TEMP63 = X10_TEMP60 + X10_TEMP61;


		final boolean X10_TEMP64 = X10_TEMP62 > X10_TEMP63;


		int X10_TEMP67 = 0;

		if(X10_TEMP64)
			{

			X10_TEMP67 = 1;

			}

		final int X10_TEMP68 = X10_TEMP67;


		boolean X10_TEMP72 = false;


		Surface X10_TEMP73 = X10_TEMP0.surf;


		Isect ip = new Isect(t, X10_TEMP68, X10_TEMP72, X10_TEMP0, X10_TEMP73,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(ip.hashCode());

		return ip;
		}
public static Vec Sphere_normal ( final Sphere X10_TEMP0, final Vec p, int myUniquePlacePoint)
		{

		final Vec X10_TEMP3 = X10_TEMP0.c;


		final Vec X10_TEMP4 = Program.Vec_sub(p, X10_TEMP3,myUniquePlacePoint);


		final Vec X10_TEMP6 = Program.Vec_normalized(X10_TEMP4,myUniquePlacePoint);

		return X10_TEMP6;
		}
public static String Sphere_toString ( final Sphere X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP2 = "Sphere {";


		final Vec X10_TEMP1 = X10_TEMP0.c;


		final String X10_TEMP3 = Program.Vec_toString(X10_TEMP1,myUniquePlacePoint);


		final String X10_TEMP4 = X10_TEMP2 + X10_TEMP3;


		final String X10_TEMP5 = ",";


		final String X10_TEMP6 = X10_TEMP4 + X10_TEMP5;


		final double X10_TEMP7 = X10_TEMP0.r;


		final String X10_TEMP8 = X10_TEMP6 + X10_TEMP7;


		final String X10_TEMP9 = "}";


		final String X10_TEMP11 = X10_TEMP8 + X10_TEMP9;

		return X10_TEMP11;
		}
public static Vec Sphere_getCenter ( final Sphere X10_TEMP0, int myUniquePlacePoint)
		{

		final Vec X10_TEMP2 = X10_TEMP0.c;

		return X10_TEMP2;
		}
public static String Surface_toString ( final Surface X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP1 = "Surface { color = ";


		final Vec X10_TEMP2 = X10_TEMP0.color;


		final String X10_TEMP3 = Program.Vec_toString(X10_TEMP2,myUniquePlacePoint);


		final String X10_TEMP4 = X10_TEMP1 + X10_TEMP3;


		final String X10_TEMP5 = " }";


		final String X10_TEMP7 = X10_TEMP4 + X10_TEMP5;

		return X10_TEMP7;
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
public static Vec Vec_added ( final Vec X10_TEMP0, final Vec a, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.x;


		final double X10_TEMP2 = a.x;


		double X10_TEMP11 = X10_TEMP1 + X10_TEMP2;


		final double X10_TEMP4 = X10_TEMP0.y;


		final double X10_TEMP5 = a.y;


		double X10_TEMP12 = X10_TEMP4 + X10_TEMP5;


		final double X10_TEMP7 = X10_TEMP0.z;


		final double X10_TEMP8 = a.z;


		double X10_TEMP13 = X10_TEMP7 + X10_TEMP8;


		boolean X10_TEMP14 = false;


		final Vec X10_TEMP16 = new Vec(X10_TEMP11, X10_TEMP12, X10_TEMP13, X10_TEMP14,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP16.hashCode());

		return X10_TEMP16;
		}
public static Vec Vec_adds3 ( final double s, final Vec a, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = a.x;


		final double X10_TEMP2 = s * X10_TEMP1;


		final double X10_TEMP3 = b.x;


		double X10_TEMP14 = X10_TEMP2 + X10_TEMP3;


		final double X10_TEMP5 = a.y;


		final double X10_TEMP6 = s * X10_TEMP5;


		final double X10_TEMP7 = b.y;


		double X10_TEMP15 = X10_TEMP6 + X10_TEMP7;


		final double X10_TEMP9 = a.z;


		final double X10_TEMP10 = s * X10_TEMP9;


		final double X10_TEMP11 = b.z;


		double X10_TEMP16 = X10_TEMP10 + X10_TEMP11;


		boolean X10_TEMP17 = false;


		final Vec X10_TEMP19 = new Vec(X10_TEMP14, X10_TEMP15, X10_TEMP16, X10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP19.hashCode());

		return X10_TEMP19;
		}
public static Vec Vec_adds2 ( final Vec X10_TEMP0, final double s, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP2 = X10_TEMP0.x;


		final double X10_TEMP1 = b.x;


		final double X10_TEMP3 = s * X10_TEMP1;


		double X10_TEMP14 = X10_TEMP2 + X10_TEMP3;


		final double X10_TEMP6 = X10_TEMP0.y;


		final double X10_TEMP5 = b.y;


		final double X10_TEMP7 = s * X10_TEMP5;


		double X10_TEMP15 = X10_TEMP6 + X10_TEMP7;


		final double X10_TEMP10 = X10_TEMP0.z;


		final double X10_TEMP9 = b.z;


		final double X10_TEMP11 = s * X10_TEMP9;


		double X10_TEMP16 = X10_TEMP10 + X10_TEMP11;


		boolean X10_TEMP17 = false;


		final Vec X10_TEMP19 = new Vec(X10_TEMP14, X10_TEMP15, X10_TEMP16, X10_TEMP17,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP19.hashCode());

		return X10_TEMP19;
		}
public static Vec Vec_sub ( final Vec a, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = a.x;


		final double X10_TEMP2 = b.x;


		double X10_TEMP11 = X10_TEMP1 - X10_TEMP2;


		final double X10_TEMP4 = a.y;


		final double X10_TEMP5 = b.y;


		double X10_TEMP12 = X10_TEMP4 - X10_TEMP5;


		final double X10_TEMP7 = a.z;


		final double X10_TEMP8 = b.z;


		double X10_TEMP13 = X10_TEMP7 - X10_TEMP8;


		boolean X10_TEMP14 = false;


		final Vec X10_TEMP16 = new Vec(X10_TEMP11, X10_TEMP12, X10_TEMP13, X10_TEMP14,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP16.hashCode());

		return X10_TEMP16;
		}
public static Vec Vec_mult ( final Vec a, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = a.x;


		final double X10_TEMP2 = b.x;


		double X10_TEMP11 = X10_TEMP1 * X10_TEMP2;


		final double X10_TEMP4 = a.y;


		final double X10_TEMP5 = b.y;


		double X10_TEMP12 = X10_TEMP4 * X10_TEMP5;


		final double X10_TEMP7 = a.z;


		final double X10_TEMP8 = b.z;


		double X10_TEMP13 = X10_TEMP7 * X10_TEMP8;


		boolean X10_TEMP14 = false;


		final Vec X10_TEMP16 = new Vec(X10_TEMP11, X10_TEMP12, X10_TEMP13, X10_TEMP14,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP16.hashCode());

		return X10_TEMP16;
		}
public static Vec Vec_cross ( final Vec a, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = a.y;


		final double X10_TEMP2 = b.z;


		final double X10_TEMP5 = X10_TEMP1 * X10_TEMP2;


		final double X10_TEMP3 = a.z;


		final double X10_TEMP4 = b.y;


		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP4;


		double X10_TEMP23 = X10_TEMP5 - X10_TEMP6;


		final double X10_TEMP8 = a.z;


		final double X10_TEMP9 = b.x;


		final double X10_TEMP12 = X10_TEMP8 * X10_TEMP9;


		final double X10_TEMP10 = a.x;


		final double X10_TEMP11 = b.z;


		final double X10_TEMP13 = X10_TEMP10 * X10_TEMP11;


		double X10_TEMP24 = X10_TEMP12 - X10_TEMP13;


		final double X10_TEMP15 = a.x;


		final double X10_TEMP16 = b.y;


		final double X10_TEMP19 = X10_TEMP15 * X10_TEMP16;


		final double X10_TEMP17 = a.y;


		final double X10_TEMP18 = b.x;


		final double X10_TEMP20 = X10_TEMP17 * X10_TEMP18;


		double X10_TEMP25 = X10_TEMP19 - X10_TEMP20;


		boolean X10_TEMP26 = false;


		final Vec X10_TEMP28 = new Vec(X10_TEMP23, X10_TEMP24, X10_TEMP25, X10_TEMP26,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP28.hashCode());

		return X10_TEMP28;
		}
public static double Vec_dot ( final Vec a, final Vec b, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = a.x;


		final double X10_TEMP2 = b.x;


		final double X10_TEMP5 = X10_TEMP1 * X10_TEMP2;


		final double X10_TEMP3 = a.y;


		final double X10_TEMP4 = b.y;


		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP4;


		final double X10_TEMP9 = X10_TEMP5 + X10_TEMP6;


		final double X10_TEMP7 = a.z;


		final double X10_TEMP8 = b.z;


		final double X10_TEMP10 = X10_TEMP7 * X10_TEMP8;


		final double X10_TEMP12 = X10_TEMP9 + X10_TEMP10;

		return X10_TEMP12;
		}
public static Vec Vec_comb ( final double a, final Vec A, final double b, final Vec B, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = A.x;


		final double X10_TEMP3 = a * X10_TEMP1;


		final double X10_TEMP2 = B.x;


		final double X10_TEMP4 = b * X10_TEMP2;


		double X10_TEMP17 = X10_TEMP3 + X10_TEMP4;


		final double X10_TEMP6 = A.y;


		final double X10_TEMP8 = a * X10_TEMP6;


		final double X10_TEMP7 = B.y;


		final double X10_TEMP9 = b * X10_TEMP7;


		double X10_TEMP18 = X10_TEMP8 + X10_TEMP9;


		final double X10_TEMP11 = A.z;


		final double X10_TEMP13 = a * X10_TEMP11;


		final double X10_TEMP12 = B.z;


		final double X10_TEMP14 = b * X10_TEMP12;


		double X10_TEMP19 = X10_TEMP13 + X10_TEMP14;


		boolean X10_TEMP20 = false;


		final Vec X10_TEMP22 = new Vec(X10_TEMP17, X10_TEMP18, X10_TEMP19, X10_TEMP20,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP22.hashCode());

		return X10_TEMP22;
		}
public static Vec Vec_scale ( final Vec X10_TEMP0, final double t, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.x;


		double X10_TEMP8 = X10_TEMP1 * t;


		final double X10_TEMP3 = X10_TEMP0.y;


		double X10_TEMP9 = X10_TEMP3 * t;


		final double X10_TEMP5 = X10_TEMP0.z;


		double X10_TEMP10 = X10_TEMP5 * t;


		boolean X10_TEMP11 = false;


		final Vec X10_TEMP13 = new Vec(X10_TEMP8, X10_TEMP9, X10_TEMP10, X10_TEMP11,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP13.hashCode());

		return X10_TEMP13;
		}
public static Vec Vec_negate ( final Vec X10_TEMP0, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.x;


		final int X10_TEMP2 = 0;


		double X10_TEMP11 = X10_TEMP2 - X10_TEMP1;


		final double X10_TEMP4 = X10_TEMP0.y;


		final int X10_TEMP5 = 0;


		double X10_TEMP12 = X10_TEMP5 - X10_TEMP4;


		final double X10_TEMP7 = X10_TEMP0.z;


		final int X10_TEMP8 = 0;


		double X10_TEMP13 = X10_TEMP8 - X10_TEMP7;


		boolean X10_TEMP14 = false;


		final Vec X10_TEMP16 = new Vec(X10_TEMP11, X10_TEMP12, X10_TEMP13, X10_TEMP14,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP16.hashCode());

		return X10_TEMP16;
		}
public static Vec Vec_normalized ( final Vec X10_TEMP0, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.x;


		final double X10_TEMP2 = X10_TEMP0.x;


		final double X10_TEMP5 = X10_TEMP1 * X10_TEMP2;


		final double X10_TEMP3 = X10_TEMP0.y;


		final double X10_TEMP4 = X10_TEMP0.y;


		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP4;


		final double X10_TEMP9 = X10_TEMP5 + X10_TEMP6;


		final double X10_TEMP7 = X10_TEMP0.z;


		final double X10_TEMP8 = X10_TEMP0.z;


		final double X10_TEMP10 = X10_TEMP7 * X10_TEMP8;


		final double X10_TEMP12 = X10_TEMP9 + X10_TEMP10;


		double len = Math.sqrt(X10_TEMP12);


		final double X10_TEMP14 = 0.0;


		final boolean X10_TEMP16 = len > X10_TEMP14;


		final boolean X10_TEMP17 = X10_TEMP16;


		final double X10_TEMP18 = X10_TEMP0.x;


		double X10_TEMP25 = X10_TEMP18 / len;


		final double X10_TEMP20 = X10_TEMP0.y;


		double X10_TEMP26 = X10_TEMP20 / len;


		final double X10_TEMP22 = X10_TEMP0.z;


		double X10_TEMP27 = X10_TEMP22 / len;


		boolean X10_TEMP28 = false;


		Vec X10_TEMP31 = X10_TEMP0;

		if(X10_TEMP17)
			{

			X10_TEMP31 = new Vec(X10_TEMP25, X10_TEMP26, X10_TEMP27, X10_TEMP28,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP31.hashCode());

			}

		final Vec X10_TEMP32 = X10_TEMP31;

		return X10_TEMP32;
		}
public static double Vec_length ( final Vec X10_TEMP0, int myUniquePlacePoint)
		{

		final double X10_TEMP1 = X10_TEMP0.x;


		final double X10_TEMP2 = X10_TEMP0.x;


		final double X10_TEMP5 = X10_TEMP1 * X10_TEMP2;


		final double X10_TEMP3 = X10_TEMP0.y;


		final double X10_TEMP4 = X10_TEMP0.y;


		final double X10_TEMP6 = X10_TEMP3 * X10_TEMP4;


		final double X10_TEMP9 = X10_TEMP5 + X10_TEMP6;


		final double X10_TEMP7 = X10_TEMP0.z;


		final double X10_TEMP8 = X10_TEMP0.z;


		final double X10_TEMP10 = X10_TEMP7 * X10_TEMP8;


		final double X10_TEMP12 = X10_TEMP9 + X10_TEMP10;


		final double X10_TEMP14 = Math.sqrt(X10_TEMP12);

		return X10_TEMP14;
		}
public static String Vec_toString ( final Vec X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP1 = "<";


		final double X10_TEMP2 = X10_TEMP0.x;


		final String X10_TEMP3 = X10_TEMP1 + X10_TEMP2;


		final String X10_TEMP4 = ",";


		final String X10_TEMP5 = X10_TEMP3 + X10_TEMP4;


		final double X10_TEMP6 = X10_TEMP0.y;


		final String X10_TEMP7 = X10_TEMP5 + X10_TEMP6;


		final String X10_TEMP8 = ",";


		final String X10_TEMP9 = X10_TEMP7 + X10_TEMP8;


		final double X10_TEMP10 = X10_TEMP0.z;


		final String X10_TEMP11 = X10_TEMP9 + X10_TEMP10;


		final String X10_TEMP12 = ">";


		final String X10_TEMP14 = X10_TEMP11 + X10_TEMP12;

		return X10_TEMP14;
		}
public static String View_toString ( final View X10_TEMP0, int myUniquePlacePoint)
		{

		final String X10_TEMP1 = "View { from = ";


		final Vec X10_TEMP2 = X10_TEMP0.from;


		final String X10_TEMP3 = Program.Vec_toString(X10_TEMP2,myUniquePlacePoint);


		final String X10_TEMP4 = X10_TEMP1 + X10_TEMP3;


		final String X10_TEMP5 = " at = ";


		final String X10_TEMP6 = X10_TEMP4 + X10_TEMP5;


		final Vec X10_TEMP7 = X10_TEMP0.at;


		final String X10_TEMP8 = Program.Vec_toString(X10_TEMP7,myUniquePlacePoint);


		final String X10_TEMP9 = X10_TEMP6 + X10_TEMP8;


		final String X10_TEMP10 = " up = ";


		final String X10_TEMP11 = X10_TEMP9 + X10_TEMP10;


		final Vec X10_TEMP12 = X10_TEMP0.up;


		final String X10_TEMP13 = Program.Vec_toString(X10_TEMP12,myUniquePlacePoint);


		final String X10_TEMP14 = X10_TEMP11 + X10_TEMP13;


		final String X10_TEMP15 = " distance = ";


		final String X10_TEMP16 = X10_TEMP14 + X10_TEMP15;


		final double X10_TEMP17 = X10_TEMP0.distance;


		final String X10_TEMP18 = X10_TEMP16 + X10_TEMP17;


		final String X10_TEMP19 = " angle = ";


		final String X10_TEMP20 = X10_TEMP18 + X10_TEMP19;


		final double X10_TEMP21 = X10_TEMP0.angle;


		final String X10_TEMP22 = X10_TEMP20 + X10_TEMP21;


		final String X10_TEMP23 = " aspect = ";


		final String X10_TEMP24 = X10_TEMP22 + X10_TEMP23;


		final double X10_TEMP25 = X10_TEMP0.aspect;


		final String X10_TEMP26 = X10_TEMP24 + X10_TEMP25;


		final String X10_TEMP27 = "}";


		final String X10_TEMP29 = X10_TEMP26 + X10_TEMP27;

		return X10_TEMP29;
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
public static void setRefArrayValue1Light ( final LightRefArray1 array, final int index, final Light val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final LightStub[] contents = array.contents;


		final LightStub indexStub = contents[placeIndex];


		final Light[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
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
public static Envelope2 getRefArrayValue1Envelope2 ( final Envelope2RefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final Envelope2Stub[] contents = array.contents;


		final Envelope2Stub indexStub = contents[placeIndex];


		final Envelope2[] localArray = indexStub.localArray;


		final Envelope2 returnValue = localArray[localIndex];

		return returnValue;
		}
public static int getPlaceFromDist1 ( final Dist1 dn, final int index, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] placeArray = d.placeArray;


		final int retPlace = placeArray[index];

		return retPlace;
		}
public static void setRefArrayValue1Envelope ( final EnvelopeRefArray1 array, final int index, final Envelope val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final EnvelopeStub[] contents = array.contents;


		final EnvelopeStub indexStub = contents[placeIndex];


		final Envelope[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
		}
public static Envelope getRefArrayValue1Envelope ( final EnvelopeRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final EnvelopeStub[] contents = array.contents;


		final EnvelopeStub indexStub = contents[placeIndex];


		final Envelope[] localArray = indexStub.localArray;


		final Envelope returnValue = localArray[localIndex];

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
public static Sphere getRefArrayValue1Sphere ( final SphereRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final SphereStub[] contents = array.contents;


		final SphereStub indexStub = contents[placeIndex];


		final Sphere[] localArray = indexStub.localArray;


		final Sphere returnValue = localArray[localIndex];

		return returnValue;
		}
public static Point1 regionOrdinalPoint1 ( final Region1 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point1[] pointArray = reg.pointArray;


		final Point1 pt = pointArray[ordl];

		return pt;
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
public static Light getRefArrayValue1Light ( final LightRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final LightStub[] contents = array.contents;


		final LightStub indexStub = contents[placeIndex];


		final Light[] localArray = indexStub.localArray;


		final Light returnValue = localArray[localIndex];

		return returnValue;
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
public static void setRefArrayValue1Sphere ( final SphereRefArray1 array, final int index, final Sphere val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final SphereStub[] contents = array.contents;


		final SphereStub indexStub = contents[placeIndex];


		final Sphere[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
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
public static Point3 regionOrdinalPoint3 ( final Region3 reg, final int ordl, int myUniquePlacePoint)
		{

		final Point3[] pointArray = reg.pointArray;


		final Point3 pt = pointArray[ordl];

		return pt;
		}
public static void setRefArrayValue1long ( final longRefArray1 array, final int index, final long val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final longStub[] contents = array.contents;


		final longStub indexStub = contents[placeIndex];


		final long[] localArray = indexStub.localArray;

		localArray[localIndex] = val;
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
public static int getDistLocalCount1 ( final Dist1 dn, final int placeIndex, int myUniquePlacePoint)
		{

		final Dist d = dn.dDist;


		final int[] counts = d.counts;


		final int localCount = counts[placeIndex];

		return localCount;
		}
public static long getRefArrayValue1long ( final longRefArray1 array, final int index, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final longStub[] contents = array.contents;


		final longStub indexStub = contents[placeIndex];


		final long[] localArray = indexStub.localArray;


		final long returnValue = localArray[localIndex];

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
public static void setRefArrayValue1Envelope2 ( final Envelope2RefArray1 array, final int index, final Envelope2 val, int myUniquePlacePoint)
		{

		final int pl = 0;


		final int placeIndex = 0;


		final Dist1 dArray = array.distValue;


		final Dist dDist = dArray.dDist;


		final int[] runSum = dDist.runningSum;


		final int localIndex = runSum[index];


		final Envelope2Stub[] contents = array.contents;


		final Envelope2Stub indexStub = contents[placeIndex];


		final Envelope2[] localArray = indexStub.localArray;

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
public static Region3 createNewRegion3RRR ( final int v1_0, final int v1_1, final int v2_0, final int v2_1, final int v3_0, final int v3_1, int myUniquePlacePoint)
		{

		final int zero = 0;


		final int one = 1;


		boolean regType = true;


		final boolean tempBool1 = true;


		final boolean tempBool2 = true;


		final boolean tempBool3 = true;


		regType = regType && tempBool1;


		regType = regType && tempBool2;


		regType = regType && tempBool3;


		final int l1 = v1_1 - v1_0;


		final int dim1 = l1 + one;


		final int l2 = v2_1 - v2_0;


		final int dim2 = l2 + one;


		final int l3 = v3_1 - v3_0;


		final int dim3 = l3 + one;


		final int stride3 = 1;


		final int stride2 = stride3 * dim3;


		final int stride1 = stride2 * dim2;


		final int stride0 = stride1 * dim1;


		final int rSize = stride0 - one;


		final int  regArr = rSize+1;


		final Point3[] ptArray = (Point3[])(new Point3/*value*/[regArr]);
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


			final Point3 retPoint = new Point3(f1, f2, f3,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retPoint.hashCode());

			ptArray[pt] =retPoint;
			}

;

		if(regType)
			{

			final Region3 retRegRegular = new Region3(ptArray, v1_0, dim1, v2_0, dim2, v3_0, dim3,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retRegRegular.hashCode());

			return retRegRegular;
			}

		final Region3 retReg = new Region3(ptArray,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(retReg.hashCode());

		return retReg;
		}

}
	/*value*/ class Envelope2 
	 {
 
	public final int i;
	public final LightValArray1 a;


	public Envelope2 ( final int i1, final LightValArray1 a1, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		i = i1;


		a = a1;

		}


	}
	/*value*/ class Envelope 
	 {
 
	public final int i;
	public final SphereValArray1 a;


	public Envelope ( final int i1, final SphereValArray1 a1, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		i = i1;


		a = a1;

		}


	}
	/*value*/ class Interval 
	 {
 
	public final int number;
	public final int width;
	public final int height;
	public final int yfrom;
	public final int yto;
	public final int total;


	public Interval ( final int number_, final int width_, final int height_, final int yfrom_, final int yto_, final int total_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		number = number_;


		width = width_;


		height = height_;


		yfrom = yfrom_;


		yto = yto_;


		total = total_;

		}


	}
	class Isect   {
 
	public double t;
	public int enter;
	public Sphere prim;
	public Surface surf;
	public boolean isNull;


	public Isect (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final double X10_TEMP2 = 0.0;


		t = X10_TEMP2;


		final int X10_TEMP4 = 0;


		enter = X10_TEMP4;


		final boolean X10_TEMP6 = false;


		isNull = X10_TEMP6;

		}
	public Isect ( final double t_, final int enter_, final boolean isNull_, final Sphere prim_, final Surface surf_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		t = t_;


		isNull = isNull_;


		enter = enter_;


		prim = prim_;


		surf = surf_;

		}



}
	/*value*/ class Light 
	 {
 
	public final Vec pos;
	public final double brightness;


	public Light ( final double x, final double y, final double z, final double b, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		boolean X10_TEMP5 = false;


		final Vec X10_TEMP7 = new Vec(x, y, z, X10_TEMP5,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP7.hashCode());


		pos = X10_TEMP7;


		brightness = b;

		}


	}
	class RayTracer   {
 
	public Scene scene;
	public int lightCount;
	public int objCount;
	public LightValArray1 lights;
	public SphereValArray1 prim;
	public View view;
	public int height;
	public int width;
	public intRefArray1 datasizes;
	public long checksum;
	public longRefArray1 checkSumArray;
	public int size_t;
	public int numobjects;


	public RayTracer (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
		}



}
	class Ray   {
 
	public Vec p;
	public Vec d;


	public Ray ( final Vec pnt, final Vec dir, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		double X10_TEMP5 = pnt.x;


		double X10_TEMP6 = pnt.y;


		double X10_TEMP7 = pnt.z;


		boolean X10_TEMP8 = false;


		final Vec X10_TEMP10 = new Vec(X10_TEMP5, X10_TEMP6, X10_TEMP7, X10_TEMP8,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP10.hashCode());


		p = X10_TEMP10;


		double X10_TEMP15 = dir.x;


		double X10_TEMP16 = dir.y;


		double X10_TEMP17 = dir.z;


		boolean X10_TEMP18 = false;


		final Vec X10_TEMP19 = new Vec(X10_TEMP15, X10_TEMP16, X10_TEMP17, X10_TEMP18,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP19.hashCode());


		final Vec X10_TEMP21 = Program.Vec_normalized(X10_TEMP19,myUniquePlacePoint);


		d = X10_TEMP21;

		}
	public Ray ( final Vec pnt, final Vec dir, final boolean normalize, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());
		if(normalize)
			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			double X10_TEMP6 = pnt.x;


			double X10_TEMP7 = pnt.y;


			double X10_TEMP8 = pnt.z;


			boolean X10_TEMP9 = false;


			final Vec X10_TEMP11 = new Vec(X10_TEMP6, X10_TEMP7, X10_TEMP8, X10_TEMP9,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP11.hashCode());


			p = X10_TEMP11;


			double X10_TEMP16 = dir.x;


			double X10_TEMP17 = dir.y;


			double X10_TEMP18 = dir.z;


			boolean X10_TEMP19 = false;


			final Vec X10_TEMP20 = new Vec(X10_TEMP16, X10_TEMP17, X10_TEMP18, X10_TEMP19,myUniquePlacePoint);
			
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP20.hashCode());


			final Vec X10_TEMP22 = Program.Vec_normalized(X10_TEMP20,myUniquePlacePoint);


			d = X10_TEMP22;

			}
		else
			{

			Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

			p = pnt;


			d = dir;

			}
 		}
	public Ray (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final Vec X10_TEMP2 = new Vec(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP2.hashCode());


		p = X10_TEMP2;


		final Vec X10_TEMP4 = new Vec(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP4.hashCode());


		d = X10_TEMP4;

		}



}
	class Scene   {
 
	public final LightRefArray1 lights;
	public final SphereRefArray1 objects;
	public final View view;


	public int lightCount;
	public int objectCount;


	public Scene ( final View v, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int X10_TEMP5 = 0;


		final int X10_TEMP2 = Program._Scene_maxLights;


		final int X10_TEMP3 = 1;


		final int X10_TEMP6 = X10_TEMP2 - X10_TEMP3;


		final Region1 X10_TEMP7 = Program.createNewRegion1R(X10_TEMP5, X10_TEMP6,myUniquePlacePoint);


		final int X10_TEMP8 = 0;


		Dist1 d1 = Program.getPlaceDist1(X10_TEMP7, X10_TEMP8,myUniquePlacePoint);


		final LightRefArray1 X10_TEMP13 = this.Scene_getLightArray(d1,myUniquePlacePoint);


		lights = X10_TEMP13;


		final int X10_TEMP18 = 0;


		final int X10_TEMP15 = Program._Scene_maxObjects;


		final int X10_TEMP16 = 1;


		final int X10_TEMP19 = X10_TEMP15 - X10_TEMP16;


		final Region1 X10_TEMP20 = Program.createNewRegion1R(X10_TEMP18, X10_TEMP19,myUniquePlacePoint);


		final int X10_TEMP21 = 0;


		Dist1 d2 = Program.getPlaceDist1(X10_TEMP20, X10_TEMP21,myUniquePlacePoint);


		final SphereRefArray1 X10_TEMP26 = this.Scene_getSphereArray(d2,myUniquePlacePoint);


		objects = X10_TEMP26;


		view = v;


		final int X10_TEMP29 = 0;


		lightCount = X10_TEMP29;


		final int X10_TEMP31 = 0;


		objectCount = X10_TEMP31;

		}


public LightRefArray1 Scene_getLightArray ( final Dist1 d, int myUniquePlacePoint)
		{

		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final LightStub[] RX10_TEMP6 = new LightStub[RX10_TEMP5];

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

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Light[] RX10_TEMP14 = new Light[RX10_TEMP13];


					final LightStub RX10_TEMP15 = new LightStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final LightStub[] RX10_TEMP16 = (LightStub[])(new LightStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final LightStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final LightRefArray1 RX10_TEMP19 = new LightRefArray1(d, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final LightRefArray1 X10_TEMP2 = RX10_TEMP19;

		return X10_TEMP2;
		}
public SphereRefArray1 Scene_getSphereArray ( final Dist1 d, int myUniquePlacePoint)
		{

		final Region1 RX10_TEMP0 = d.dReg;


		final int RX10_TEMP1 = 0;


		final int RX10_TEMP2 = 1;


		int RX10_TEMP3 = Program.MAX_PLACES;


		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;


		final int  RX10_TEMP4 = RX10_TEMP3+1;


		final int RX10_TEMP5 = RX10_TEMP3+1;


		final SphereStub[] RX10_TEMP6 = new SphereStub[RX10_TEMP5];

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

					final int RX10_TEMP13 = RX10_TEMP12+1;


					final Sphere[] RX10_TEMP14 = new Sphere[RX10_TEMP13];


					final SphereStub RX10_TEMP15 = new SphereStub(RX10_TEMP14,RX10_TEMP10);
					
Program.globalPointerHashMap.get(RX10_TEMP10).add(RX10_TEMP15.hashCode());

					//async(RX10_TEMP8)
						{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
						}
					}
				}
			}

		final SphereStub[] RX10_TEMP16 = (SphereStub[])(new SphereStub/*value*/[RX10_TEMP4]);
/*arrayInitBlock*/
for(int RX10_TEMP18= 0;RX10_TEMP18 <RX10_TEMP16.length ;RX10_TEMP18++ )			{

			final SphereStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];

			RX10_TEMP16[RX10_TEMP18] =RX10_TEMP17;
			}

;


		final SphereRefArray1 RX10_TEMP19 = new SphereRefArray1(d, RX10_TEMP16,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(RX10_TEMP19.hashCode());


		final SphereRefArray1 X10_TEMP2 = RX10_TEMP19;

		return X10_TEMP2;
		}

}
	/*value*/ class Sphere 
	 {
 
	public final Vec c;
	public final double r;
	public final double r2;
	public final Surface surf;


	public Sphere ( final Vec center, final double radius, final Surface s, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		surf = s;


		c = center;


		r = radius;


		final double X10_TEMP5 = radius * radius;


		r2 = X10_TEMP5;

		}
	public Sphere ( final Vec center, final double radius, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		c = center;


		r = radius;


		final double X10_TEMP4 = radius * radius;


		r2 = X10_TEMP4;


		final Surface X10_TEMP6 = new Surface(myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP6.hashCode());


		surf = X10_TEMP6;

		}


	}
	/*value*/ class Surface 
	 {
 
	public final Vec color;
	public final double kd;
	public final double ks;
	public final double shine;
	public final double kt;
	public final double ior;
	public final boolean isNull;


	public Surface (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		int X10_TEMP5 = 1;


		int X10_TEMP6 = 0;


		int X10_TEMP7 = 0;


		boolean X10_TEMP8 = false;


		final Vec X10_TEMP10 = new Vec(X10_TEMP5, X10_TEMP6, X10_TEMP7, X10_TEMP8,myUniquePlacePoint);
		
Program.globalPointerHashMap.get(myUniquePlacePoint).add(X10_TEMP10.hashCode());


		color = X10_TEMP10;


		final double X10_TEMP12 = 1.0;


		kd = X10_TEMP12;


		final double X10_TEMP14 = 0.0;


		ks = X10_TEMP14;


		final double X10_TEMP16 = 0.0;


		shine = X10_TEMP16;


		final double X10_TEMP18 = 0.0;


		kt = X10_TEMP18;


		final double X10_TEMP20 = 1.0;


		ior = X10_TEMP20;


		final boolean X10_TEMP22 = false;


		isNull = X10_TEMP22;

		}
	public Surface ( final double shine_, final double ks_, final double kt_, final Vec c_, final boolean isNull_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final double X10_TEMP2 = 1.0;


		kd = X10_TEMP2;


		ks = ks_;


		shine = shine_;


		kt = kt_;


		final double X10_TEMP7 = 1.0;


		ior = X10_TEMP7;


		color = c_;


		isNull = isNull_;

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
	/*value*/ class Vec 
	 {
 
	public final double x;
	public final double y;
	public final double z;
	public final boolean isNull;


	public Vec ( final double a, final double b, final double c, final boolean isNull_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		x = a;


		y = b;


		z = c;


		isNull = isNull_;

		}
	public Vec ( final Vec a, final boolean isNull_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final double X10_TEMP2 = a.x;


		x = X10_TEMP2;


		final double X10_TEMP4 = a.y;


		y = X10_TEMP4;


		final double X10_TEMP6 = a.z;


		z = X10_TEMP6;


		isNull = isNull_;

		}
	public Vec (  int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final double X10_TEMP2 = 0.0;


		x = X10_TEMP2;


		final double X10_TEMP4 = 0.0;


		y = X10_TEMP4;


		final double X10_TEMP6 = 0.0;


		z = X10_TEMP6;


		final boolean X10_TEMP8 = false;


		isNull = X10_TEMP8;

		}


	}
	/*value*/ class View 
	 {
 
	public final Vec from;
	public final Vec at;
	public final Vec up;
	public final double distance;
	public final double angle;
	public final double aspect;


	public View ( final Vec from_, final Vec at_, final Vec up_, final double dist_, final double angle_, final double aspect_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		from = from_;


		at = at_;


		up = up_;


		distance = dist_;


		angle = angle_;


		aspect = aspect_;

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
	/*value*/ class Point1 
	 {
 
	public final int f0;


	public Point1 ( final int f0_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;

		}


	}
	/*value*/ class LightValArray1 
	 {
 
	public final Region1 regionValue;
	public final Light[] contents;


	public LightValArray1 ( final Region1 regionValue_, final Light[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regionValue = regionValue_;


		contents = contents_;

		}


	}
	/*value*/ class SphereValArray1 
	 {
 
	public final Region1 regionValue;
	public final Sphere[] contents;


	public SphereValArray1 ( final Region1 regionValue_, final Sphere[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regionValue = regionValue_;


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
	/*value*/ class longStub 
	 {
 
	public final long[] localArray;


	public longStub ( final long[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class SphereStub 
	 {
 
	public final Sphere[] localArray;


	public SphereStub ( final Sphere[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class LightStub 
	 {
 
	public final Light[] localArray;


	public LightStub ( final Light[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class longRefArray1 
	 {
 
	public final Dist1 distValue;
	public final longStub[] contents;


	public longRefArray1 ( final Dist1 distValue_, final longStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

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
	/*value*/ class LightRefArray1 
	 {
 
	public final Dist1 distValue;
	public final LightStub[] contents;


	public LightRefArray1 ( final Dist1 distValue_, final LightStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class SphereRefArray1 
	 {
 
	public final Dist1 distValue;
	public final SphereStub[] contents;


	public SphereRefArray1 ( final Dist1 distValue_, final SphereStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Point3 
	 {
 
	public final int f0;
	public final int f1;
	public final int f2;


	public Point3 ( final int f0_, final int f1_, final int f2_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		f0 = f0_;


		f1 = f1_;


		f2 = f2_;

		}


	}
	/*value*/ class Envelope2RefArray1 
	 {
 
	public final Dist1 distValue;
	public final Envelope2Stub[] contents;


	public Envelope2RefArray1 ( final Dist1 distValue_, final Envelope2Stub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class Region3 
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
	public final Point3[] pointArray;


	public Region3 ( final Point3[] pointArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		final int zero = 0;


		final int one = 1;


		final int minusOne = zero - one;


		regRank = 3;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = false;


		low0 = minusOne;


		dim0 = zero;


		low1 = minusOne;


		dim1 = zero;


		low2 = minusOne;


		dim2 = zero;

		}
	public Region3 ( final Point3[] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_, final int low2_, final int dim2_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		regRank = 3;


		regSize = pointArray_.length;


		pointArray = pointArray_;


		regType = true;


		low0 = low0_;


		dim0 = dim0_;


		low1 = low1_;


		dim1 = dim1_;


		low2 = low2_;


		dim2 = dim2_;

		}


	}
	/*value*/ class Envelope2Stub 
	 {
 
	public final Envelope2[] localArray;


	public Envelope2Stub ( final Envelope2[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
	/*value*/ class EnvelopeRefArray1 
	 {
 
	public final Dist1 distValue;
	public final EnvelopeStub[] contents;


	public EnvelopeRefArray1 ( final Dist1 distValue_, final EnvelopeStub[] contents_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		distValue = distValue_;


		contents = contents_;

		}


	}
	/*value*/ class EnvelopeStub 
	 {
 
	public final Envelope[] localArray;


	public EnvelopeStub ( final Envelope[] localArray_, int myUniquePlacePoint)
		{

		Program.globalPointerHashMap.get(myUniquePlacePoint).add(this.hashCode());

		localArray = localArray_;

		}


	}
