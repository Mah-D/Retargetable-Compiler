import x10.lang.*;

public class RunMain
extends x10.
  lang.
  Object
{
    
    
//#line 2
/* template:Main { */
    public static class Main extends x10.runtime.Activity {
    	private final String[] form;
    	public Main(String[] args) {
    		super("Main Activity");
    		this.form = args;
    	}
    	public void runX10Task() {
    		main(form);
    	}
    }
    
    // the original app-main method
    public static void main(java.
      lang.
      String[] args) {
    	if (x10.lang.Runtime.runtime == null) {
    		System.err.println("Please use the 'x10' script to invoke X10 programs, or see the generated");
    		System.err.println("Java code for alternate invocation instructions.");
    		System.exit(128);
    	}
    {
        
//#line 3
Program.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public RunMain() {
        
//#line 1
super();
    }
}

class StreamData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 8
final public Dist1
      dverified;
    
//#line 9
final public booleanRefArray1
      verified;
    
//#line 10
final public Dist1
      D;
    
//#line 11
final public doubleRefArray1
      times;
    
//#line 12
final public doubleRefArray1
      a;
    
//#line 13
final public doubleRefArray1
      b;
    
//#line 14
final public doubleRefArray1
      c;
    
    
//#line 17
public StreamData(final long N,
                                  final int NUM_TIMES) {
        
//#line 18
super();
        
//#line 20
final int X10_TEMP3 =
          (0);
        
//#line 22
final int X10_TEMP4 =
          (0);
        
//#line 24
final Region1 X10_TEMP5 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 26
final x10.
          lang.
          place X10_TEMP6 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 28
final Dist1 X10_TEMP8 =
          Program.
            getPlaceDist1(
            X10_TEMP5,
            X10_TEMP6);
        
//#line 30
dverified =
          X10_TEMP8;
        
//#line 32
final booleanRefArray1 X10_TEMP12 =
          Program.
            StreamData_initVerified(
            this,
            dverified);
        
//#line 34
verified =
          X10_TEMP12;
        
//#line 36
final int X10_TEMP18 =
          (0);
        
//#line 38
final int X10_TEMP14 =
          (1);
        
//#line 40
final long X10_TEMP16 =
          (N -
             X10_TEMP14);
        
//#line 42
final int X10_TEMP19 =
          ((int)
             X10_TEMP16);
        
//#line 44
final Region1 X10_TEMP21 =
          Program.
            createNewRegion1R(
            X10_TEMP18,
            X10_TEMP19);
        
//#line 46
final Dist1 X10_TEMP22 =
          Program.
            getBlockDist1(
            X10_TEMP21);
        
//#line 48
D =
          X10_TEMP22;
        
//#line 50
final int X10_TEMP30 =
          (0);
        
//#line 52
final int X10_TEMP26 =
          (1);
        
//#line 54
final int X10_TEMP28 =
          (NUM_TIMES -
             X10_TEMP26);
        
//#line 56
final int X10_TEMP31 =
          ((int)
             X10_TEMP28);
        
//#line 58
final Region1 X10_TEMP32 =
          Program.
            createNewRegion1R(
            X10_TEMP30,
            X10_TEMP31);
        
//#line 60
final x10.
          lang.
          place X10_TEMP33 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 62
final Dist1 X10_TEMP35 =
          Program.
            getPlaceDist1(
            X10_TEMP32,
            X10_TEMP33);
        
//#line 64
final doubleRefArray1 X10_TEMP37 =
          Program.
            StreamData_initArray(
            this,
            X10_TEMP35);
        
//#line 66
times =
          X10_TEMP37;
        
//#line 68
final doubleRefArray1 X10_TEMP41 =
          Program.
            StreamData_initArray(
            this,
            D);
        
//#line 70
a =
          X10_TEMP41;
        
//#line 72
final doubleRefArray1 X10_TEMP45 =
          Program.
            StreamData_initArray(
            this,
            D);
        
//#line 74
b =
          X10_TEMP45;
        
//#line 76
final doubleRefArray1 X10_TEMP49 =
          Program.
            StreamData_initArray(
            this,
            D);
        
//#line 78
c =
          X10_TEMP49;
    }
}

class Stream
extends x10.
  lang.
  Object
{
    
//#line 84
final public StreamData
      sd;
    
    
//#line 87
public Stream() {
        
//#line 88
super();
        
//#line 90
long X10_TEMP3 =
          (Program.
             _Stream_N);
        
//#line 92
int X10_TEMP4 =
          (Program.
             _Stream_NUM_TIMES);
        
//#line 94
final StreamData X10_TEMP6 =
          (new StreamData(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 96
sd =
          ((X10_TEMP6));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 103
final public Dist1
      d;
    
//#line 104
final public doubleRefArray1
      start_time;
    
//#line 105
final public doubleRefArray1
      elapsed_time;
    
//#line 106
final public doubleRefArray1
      total_time;
    
    
//#line 109
public Timer() {
        
//#line 110
super();
        
//#line 112
int i =
          (0);
        
//#line 114
final int X10_TEMP4 =
          (0);
        
//#line 116
final int X10_TEMP5 =
          (Program.
             _Timer_max_counters);
        
//#line 118
final Region1 X10_TEMP6 =
          Program.
            createNewRegion1R(
            X10_TEMP4,
            X10_TEMP5);
        
//#line 120
final x10.
          lang.
          place X10_TEMP7 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 122
final Dist1 X10_TEMP9 =
          Program.
            getPlaceDist1(
            X10_TEMP6,
            X10_TEMP7);
        
//#line 124
d =
          X10_TEMP9;
        
//#line 126
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 128
final x10.
          lang.
          GenericReferenceArray RX10_TEMP2 =
          RX10_TEMP0.
            pointArray;
        
//#line 130
final Dist RX10_TEMP1 =
          d.
            dDist;
        
//#line 132
final DOUBLEArray RX10_TEMP3 =
          new DOUBLEArray(
          RX10_TEMP1);
        
//#line 134
final doubleRefArray1 RX10_TEMP4 =
          new doubleRefArray1(
          d,
          RX10_TEMP3);
        
//#line 136
final doubleRefArray1 X10_TEMP11 =
          RX10_TEMP4;
        
//#line 138
start_time =
          X10_TEMP11;
        
//#line 140
final Region1 RX10_TEMP5 =
          d.
            dReg;
        
//#line 142
final x10.
          lang.
          GenericReferenceArray RX10_TEMP7 =
          RX10_TEMP5.
            pointArray;
        
//#line 144
final Dist RX10_TEMP6 =
          d.
            dDist;
        
//#line 146
final DOUBLEArray RX10_TEMP8 =
          new DOUBLEArray(
          RX10_TEMP6);
        
//#line 148
final doubleRefArray1 RX10_TEMP9 =
          new doubleRefArray1(
          d,
          RX10_TEMP8);
        
//#line 150
final doubleRefArray1 X10_TEMP13 =
          RX10_TEMP9;
        
//#line 152
elapsed_time =
          X10_TEMP13;
        
//#line 154
final Region1 RX10_TEMP10 =
          d.
            dReg;
        
//#line 156
final x10.
          lang.
          GenericReferenceArray RX10_TEMP12 =
          RX10_TEMP10.
            pointArray;
        
//#line 158
final Dist RX10_TEMP11 =
          d.
            dDist;
        
//#line 160
final DOUBLEArray RX10_TEMP13 =
          new DOUBLEArray(
          RX10_TEMP11);
        
//#line 162
final doubleRefArray1 RX10_TEMP14 =
          new doubleRefArray1(
          d,
          RX10_TEMP13);
        
//#line 164
final doubleRefArray1 X10_TEMP15 =
          RX10_TEMP14;
        
//#line 166
total_time =
          X10_TEMP15;
        
//#line 168
final int X10_TEMP16 =
          (Program.
             _Timer_max_counters);
        
//#line 170
boolean X10_TEMP20 =
          i <
          X10_TEMP16;
        
//#line 171
while (X10_TEMP20) {
            
//#line 174
final double X10_TEMP24 =
              (0);
            
//#line 176
final double X10_TEMP25 =
              (X10_TEMP24);
            
//#line 178
final Point1 RX10_TEMP15 =
              new Point1(
              i);
            
//#line 180
final Dist1 RX10_TEMP16 =
              start_time.
                distValue;
            
//#line 182
final Region1 RX10_TEMP17 =
              RX10_TEMP16.
                dReg;
            
//#line 184
final int RX10_TEMP18 =
              Program.
                searchPointInRegion1(
                RX10_TEMP17,
                RX10_TEMP15);
            
//#line 186
final int RX10_TEMP19 =
              0;
            
//#line 188
final boolean RX10_TEMP20 =
              RX10_TEMP18 <
              RX10_TEMP19;
            
//#line 189
if (RX10_TEMP20) {
                
//#line 192
java.
                  lang.
                  String RX10_TEMP21 =
                  "Array index out of bounds";
                
//#line 193
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP21);
            }
            
//#line 196
final Dist SX10_TEMP0 =
              RX10_TEMP16.
                dDist;
            
//#line 198
final x10.
              lang.
              place RX10_TEMP22 =
              Program.
                getPlaceFromDist(
                SX10_TEMP0,
                RX10_TEMP18);
            
//#line 200
final x10.
              lang.
              place RX10_TEMP24 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 202
final boolean RX10_TEMP25 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP22,RX10_TEMP24))/* } */;
            
//#line 203
if (RX10_TEMP25) {
                
//#line 206
java.
                  lang.
                  String RX10_TEMP23 =
                  "Bad place access for array start_time";
                
//#line 207
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP23);
            }
            
//#line 211
final DOUBLEArray RX10_TEMP26 =
              start_time.
                contents;
            
//#line 212
Program.
                           DOUBLESetValue(
                           RX10_TEMP26,
                           RX10_TEMP18,
                           X10_TEMP25);
            
//#line 214
final double X10_TEMP29 =
              (0);
            
//#line 216
final double X10_TEMP30 =
              (X10_TEMP29);
            
//#line 218
final Point1 RX10_TEMP27 =
              new Point1(
              i);
            
//#line 220
final Dist1 RX10_TEMP28 =
              elapsed_time.
                distValue;
            
//#line 222
final Region1 RX10_TEMP29 =
              RX10_TEMP28.
                dReg;
            
//#line 224
final int RX10_TEMP30 =
              Program.
                searchPointInRegion1(
                RX10_TEMP29,
                RX10_TEMP27);
            
//#line 226
final int RX10_TEMP31 =
              0;
            
//#line 228
final boolean RX10_TEMP32 =
              RX10_TEMP30 <
              RX10_TEMP31;
            
//#line 229
if (RX10_TEMP32) {
                
//#line 232
java.
                  lang.
                  String RX10_TEMP33 =
                  "Array index out of bounds";
                
//#line 233
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP33);
            }
            
//#line 236
final Dist SX10_TEMP1 =
              RX10_TEMP28.
                dDist;
            
//#line 238
final x10.
              lang.
              place RX10_TEMP34 =
              Program.
                getPlaceFromDist(
                SX10_TEMP1,
                RX10_TEMP30);
            
//#line 240
final x10.
              lang.
              place RX10_TEMP36 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 242
final boolean RX10_TEMP37 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP34,RX10_TEMP36))/* } */;
            
//#line 243
if (RX10_TEMP37) {
                
//#line 246
java.
                  lang.
                  String RX10_TEMP35 =
                  "Bad place access for array elapsed_time";
                
//#line 247
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP35);
            }
            
//#line 251
final DOUBLEArray RX10_TEMP38 =
              elapsed_time.
                contents;
            
//#line 252
Program.
                           DOUBLESetValue(
                           RX10_TEMP38,
                           RX10_TEMP30,
                           X10_TEMP30);
            
//#line 254
final double X10_TEMP34 =
              (0);
            
//#line 256
final double X10_TEMP35 =
              (X10_TEMP34);
            
//#line 258
final Point1 RX10_TEMP39 =
              new Point1(
              i);
            
//#line 260
final Dist1 RX10_TEMP40 =
              total_time.
                distValue;
            
//#line 262
final Region1 RX10_TEMP41 =
              RX10_TEMP40.
                dReg;
            
//#line 264
final int RX10_TEMP42 =
              Program.
                searchPointInRegion1(
                RX10_TEMP41,
                RX10_TEMP39);
            
//#line 266
final int RX10_TEMP43 =
              0;
            
//#line 268
final boolean RX10_TEMP44 =
              RX10_TEMP42 <
              RX10_TEMP43;
            
//#line 269
if (RX10_TEMP44) {
                
//#line 272
java.
                  lang.
                  String RX10_TEMP45 =
                  "Array index out of bounds";
                
//#line 273
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP45);
            }
            
//#line 276
final Dist SX10_TEMP2 =
              RX10_TEMP40.
                dDist;
            
//#line 278
final x10.
              lang.
              place RX10_TEMP46 =
              Program.
                getPlaceFromDist(
                SX10_TEMP2,
                RX10_TEMP42);
            
//#line 280
final x10.
              lang.
              place RX10_TEMP48 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 282
final boolean RX10_TEMP49 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP46,RX10_TEMP48))/* } */;
            
//#line 283
if (RX10_TEMP49) {
                
//#line 286
java.
                  lang.
                  String RX10_TEMP47 =
                  "Bad place access for array total_time";
                
//#line 287
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP47);
            }
            
//#line 291
final DOUBLEArray RX10_TEMP50 =
              total_time.
                contents;
            
//#line 292
Program.
                           DOUBLESetValue(
                           RX10_TEMP50,
                           RX10_TEMP42,
                           X10_TEMP35);
            
//#line 294
final int X10_TEMP36 =
              (i);
            
//#line 296
final int X10_TEMP37 =
              1;
            
//#line 298
i =
              i +
                X10_TEMP37;
            
//#line 300
final int X10_TEMP18 =
              (Program.
                 _Timer_max_counters);
            
//#line 302
X10_TEMP20 =
              i <
                X10_TEMP18;
        }
    }
}

class Region1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 311
final public int
      regRank;
    
//#line 312
final public boolean
      regType;
    
//#line 313
final public int
      low0;
    
//#line 314
final public int
      dim0;
    
//#line 315
final public x10.
      lang.
      GenericReferenceArray
      pointArray;
    
    
//#line 318
public Region1(final x10.
                                  lang.
                                  GenericReferenceArray pointArray_) {
        
//#line 319
super();
        
//#line 321
final int zero =
          0;
        
//#line 323
final int one =
          1;
        
//#line 325
final int minusOne =
          zero -
          one;
        
//#line 327
regRank =
          1;
        
//#line 329
pointArray =
          pointArray_;
        
//#line 331
regType =
          false;
        
//#line 333
low0 =
          minusOne;
        
//#line 335
dim0 =
          zero;
    }
    
    
//#line 337
public Region1(final x10.
                                  lang.
                                  GenericReferenceArray pointArray_,
                                final int low0_,
                                final int dim0_) {
        
//#line 338
super();
        
//#line 340
regRank =
          1;
        
//#line 342
pointArray =
          pointArray_;
        
//#line 344
regType =
          true;
        
//#line 346
low0 =
          low0_;
        
//#line 348
dim0 =
          dim0_;
    }
}

class Point1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 355
final public int
      f0;
    
    
//#line 358
public Point1(final int f0_) {
        
//#line 359
super();
        
//#line 361
f0 =
          f0_;
    }
}

class Dist1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 368
final public Region1
      dReg;
    
//#line 369
final public Dist
      dDist;
    
    
//#line 372
public Dist1(final Region1 dReg_,
                              final Dist dDist_) {
        
//#line 373
super();
        
//#line 375
dReg =
          dReg_;
        
//#line 377
dDist =
          dDist_;
    }
}

class booleanRefArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 384
final public Dist1
      distValue;
    
//#line 385
final public BOOLEANArray
      contents;
    
    
//#line 388
public booleanRefArray1(final Dist1 distValue_,
                                         final BOOLEANArray contents_) {
        
//#line 389
super();
        
//#line 391
distValue =
          distValue_;
        
//#line 393
contents =
          contents_;
    }
}

class doubleRefArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 400
final public Dist1
      distValue;
    
//#line 401
final public DOUBLEArray
      contents;
    
    
//#line 404
public doubleRefArray1(final Dist1 distValue_,
                                        final DOUBLEArray contents_) {
        
//#line 405
super();
        
//#line 407
distValue =
          distValue_;
        
//#line 409
contents =
          contents_;
    }
}

class Program
extends x10.
  lang.
  Object
{
    
//#line 415
final public static int
      _Stream_MEG =
      Program.
        _Stream_MEG_init();
    
//#line 416
final public static double
      _Stream_alpha =
      Program.
        _Stream_alpha_init();
    
//#line 417
final public static int
      _Stream_NUM_TIMES =
      Program.
        _Stream_NUM_TIMES_init();
    
//#line 418
final public static int
      _Timer_max_counters =
      Program.
        _Timer_max_counters_init();
    
//#line 419
final public static long
      _Stream_N0 =
      Program.
        _Stream_N0_init();
    
//#line 420
final public static long
      _Stream_N =
      Program.
        _Stream_N_init();
    
//#line 421
final public static int
      _Stream_LocalSize =
      Program.
        _Stream_LocalSize_init();
    
    
//#line 424
public static void
                   runMain(
                   ) {
        
//#line 426
Timer tmr =
          (new Timer(
             ));
        
//#line 428
int count =
          (0);
        
//#line 429
Program.
                       Timer_start(
                       tmr,
                       count);
        
//#line 431
final Stream X10_TEMP4 =
          (new Stream(
             ));
        
//#line 432
Program.
                       Stream_run(
                       X10_TEMP4);
        
//#line 433
Program.
                       Timer_stop(
                       tmr,
                       count);
        
//#line 435
final java.
          lang.
          String X10_TEMP7 =
          ("Wall-clock time for stream: ");
        
//#line 437
final double X10_TEMP8 =
          (Program.
             Timer_readTimer(
             tmr,
             count));
        
//#line 439
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 441
final java.
          lang.
          String X10_TEMP10 =
          (" secs");
        
//#line 443
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 444
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 446
public static booleanRefArray1
                   StreamData_initVerified(
                   final StreamData X10_TEMP0,
                   final Dist1 d) {
        
//#line 448
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 450
final x10.
          lang.
          GenericReferenceArray RX10_TEMP2 =
          RX10_TEMP0.
            pointArray;
        
//#line 452
final Dist RX10_TEMP1 =
          d.
            dDist;
        
//#line 454
final BOOLEANArray RX10_TEMP3 =
          new BOOLEANArray(
          RX10_TEMP1);
        
//#line 455
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 456
/* template:forloop-mult { */{
            x10.lang.region __var10__ = (x10.lang.region) RX10_TEMP2.
                                                            distribution.
                                                            region;
            if (__var10__.size() > 0 && (__var10__ instanceof x10.array.MultiDimRegion || __var10__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var11__ = __var10__.rank(0).low(), __var12__ = __var10__.rank(0).high(); __var11__ <= __var12__; __var11__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int RX10_TEMP4 = __var11__;
            /* } */
            /* } */
{
                
//#line 458
final Dist SX10_TEMP0 =
                  d.
                    dDist;
                
//#line 460
final x10.
                  lang.
                  place RX10_TEMP5 =
                  Program.
                    getPlaceFromDist(
                    SX10_TEMP0,
                    RX10_TEMP4);
                
//#line 461
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP5)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 463
final Point1 p =
                      /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP2).get(RX10_TEMP4))/* } */))/* } */;
                    
//#line 465
final boolean X10_TEMP2 =
                      (true);
                    
//#line 466
Program.
                                   BOOLEANSetValue(
                                   RX10_TEMP3,
                                   RX10_TEMP4,
                                   X10_TEMP2);
                }
                		}
                	});/* } */
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var0____ = (__var10__).iterator(); __var0____.hasNext(); ) {
            	final  x10.
              lang.
              point __var0__ = (x10.
              lang.
              point) __var0____.next();
            	/* Join: { *//* Join: { */final int RX10_TEMP4 =
              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                
//#line 458
final Dist SX10_TEMP0 =
                  d.
                    dDist;
                
//#line 460
final x10.
                  lang.
                  place RX10_TEMP5 =
                  Program.
                    getPlaceFromDist(
                    SX10_TEMP0,
                    RX10_TEMP4);
                
//#line 461
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP5)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 463
final Point1 p =
                      /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP2).get(RX10_TEMP4))/* } */))/* } */;
                    
//#line 465
final boolean X10_TEMP2 =
                      (true);
                    
//#line 466
Program.
                                   BOOLEANSetValue(
                                   RX10_TEMP3,
                                   RX10_TEMP4,
                                   X10_TEMP2);
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
        	} catch (Throwable tmp9) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp9);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 471
final booleanRefArray1 RX10_TEMP6 =
          new booleanRefArray1(
          d,
          RX10_TEMP3);
        
//#line 473
final booleanRefArray1 X10_TEMP3 =
          RX10_TEMP6;
        
//#line 474
return X10_TEMP3;
    }
    
    
//#line 476
public static doubleRefArray1
                   StreamData_initArray(
                   final StreamData X10_TEMP0,
                   final Dist1 d) {
        
//#line 478
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 480
final x10.
          lang.
          GenericReferenceArray RX10_TEMP2 =
          RX10_TEMP0.
            pointArray;
        
//#line 482
final Dist RX10_TEMP1 =
          d.
            dDist;
        
//#line 484
final DOUBLEArray RX10_TEMP3 =
          new DOUBLEArray(
          RX10_TEMP1);
        
//#line 485
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 486
/* template:forloop-mult { */{
            x10.lang.region __var14__ = (x10.lang.region) RX10_TEMP2.
                                                            distribution.
                                                            region;
            if (__var14__.size() > 0 && (__var14__ instanceof x10.array.MultiDimRegion || __var14__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var15__ = __var14__.rank(0).low(), __var16__ = __var14__.rank(0).high(); __var15__ <= __var16__; __var15__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int RX10_TEMP4 = __var15__;
            /* } */
            /* } */
{
                
//#line 488
final Dist SX10_TEMP0 =
                  d.
                    dDist;
                
//#line 490
final x10.
                  lang.
                  place RX10_TEMP6 =
                  Program.
                    getPlaceFromDist(
                    SX10_TEMP0,
                    RX10_TEMP4);
                
//#line 491
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP6)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 493
final Point1 RX10_TEMP5 =
                      /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP2).get(RX10_TEMP4))/* } */))/* } */;
                    
//#line 495
final int i =
                      RX10_TEMP5.
                        f0;
                    
//#line 497
final double X10_TEMP2 =
                      (0.0);
                    
//#line 498
Program.
                                   DOUBLESetValue(
                                   RX10_TEMP3,
                                   RX10_TEMP4,
                                   X10_TEMP2);
                }
                		}
                	});/* } */
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var1____ = (__var14__).iterator(); __var1____.hasNext(); ) {
            	final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            	/* Join: { *//* Join: { */final int RX10_TEMP4 =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 488
final Dist SX10_TEMP0 =
                  d.
                    dDist;
                
//#line 490
final x10.
                  lang.
                  place RX10_TEMP6 =
                  Program.
                    getPlaceFromDist(
                    SX10_TEMP0,
                    RX10_TEMP4);
                
//#line 491
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP6)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 493
final Point1 RX10_TEMP5 =
                      /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP2).get(RX10_TEMP4))/* } */))/* } */;
                    
//#line 495
final int i =
                      RX10_TEMP5.
                        f0;
                    
//#line 497
final double X10_TEMP2 =
                      (0.0);
                    
//#line 498
Program.
                                   DOUBLESetValue(
                                   RX10_TEMP3,
                                   RX10_TEMP4,
                                   X10_TEMP2);
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
        	} catch (Throwable tmp13) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp13);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 503
final doubleRefArray1 RX10_TEMP7 =
          new doubleRefArray1(
          d,
          RX10_TEMP3);
        
//#line 505
final doubleRefArray1 X10_TEMP3 =
          RX10_TEMP7;
        
//#line 506
return X10_TEMP3;
    }
    
    
//#line 508
public static int
                   _Stream_MEG_init(
                   ) {
        
//#line 510
final int X10_TEMP1 =
          (50);
        
//#line 512
final int X10_TEMP2 =
          (50);
        
//#line 514
final int X10_TEMP4 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 515
return X10_TEMP4;
    }
    
    
//#line 517
public static double
                   _Stream_alpha_init(
                   ) {
        
//#line 519
final double X10_TEMP2 =
          (3.0);
        
//#line 520
return X10_TEMP2;
    }
    
    
//#line 522
public static int
                   _Stream_NUM_TIMES_init(
                   ) {
        
//#line 524
final int X10_TEMP2 =
          (10);
        
//#line 525
return X10_TEMP2;
    }
    
    
//#line 527
public static long
                   _Stream_N0_init(
                   ) {
        
//#line 529
final int X10_TEMP1 =
          (2);
        
//#line 531
final long X10_TEMP3 =
          (X10_TEMP1 *
             _Stream_MEG);
        
//#line 532
return X10_TEMP3;
    }
    
    
//#line 534
public static long
                   _Stream_N_init(
                   ) {
        
//#line 536
final int X10_TEMP1 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 538
final long X10_TEMP3 =
          (_Stream_N0 *
             X10_TEMP1);
        
//#line 539
return X10_TEMP3;
    }
    
    
//#line 541
public static int
                   _Stream_LocalSize_init(
                   ) {
        
//#line 543
final int X10_TEMP2 =
          ((int)
             _Stream_N0);
        
//#line 544
return X10_TEMP2;
    }
    
    
//#line 546
public static void
                   Stream_run(
                   final Stream X10_TEMP0) {
        
//#line 548
final java.
          lang.
          String X10_TEMP1 =
          ("LocalSize=");
        
//#line 550
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP1 +
           _Stream_LocalSize);
        
//#line 551
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP3);
        
//#line 553
final StreamData tempSd =
          (/* template:place-check { */((Stream) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sd);
        
//#line 554
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 556
final int X10_TEMP10 =
              (0);
            
//#line 558
final int X10_TEMP6 =
              (1);
            
//#line 560
final int X10_TEMP8 =
              (_Stream_NUM_TIMES -
                 X10_TEMP6);
            
//#line 562
final int X10_TEMP11 =
              ((int)
                 X10_TEMP8);
            
//#line 564
Region1 r =
              Program.
                createNewRegion1R(
                X10_TEMP10,
                X10_TEMP11);
            
//#line 566
final x10.
              lang.
              GenericReferenceArray RX10_TEMP1 =
              r.
                pointArray;
            
//#line 567
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP0__ = (RX10_TEMP1.
                                                      distribution.
                                                      region).iterator(); RX10_TEMP0__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP0 = (x10.
              lang.
              point) RX10_TEMP0__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 570
final Point1 p1 =
                  /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP1).get(RX10_TEMP0))/* } */))/* } */;
                
//#line 571
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 573
final Dist1 X10_TEMP15 =
                      Program.
                        getUniqueDist();
                    
//#line 575
final Region1 RX10_TEMP3 =
                      X10_TEMP15.
                        dReg;
                    
//#line 577
final x10.
                      lang.
                      GenericReferenceArray RX10_TEMP4 =
                      RX10_TEMP3.
                        pointArray;
                    
//#line 578
/* template:forloop { */
                    for (java.util.Iterator RX10_TEMP2__ = (RX10_TEMP4.
                                                              distribution.
                                                              region).iterator(); RX10_TEMP2__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point RX10_TEMP2 = (x10.
                      lang.
                      point) RX10_TEMP2__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 581
final Point1 X10_TEMP17 =
                          /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP4).get(RX10_TEMP2))/* } */))/* } */;
                        
//#line 583
final int p =
                          X10_TEMP17.
                            f0;
                        
//#line 585
final Dist1 X10_TEMP16 =
                          X10_TEMP15;
                        
//#line 587
final Region1 RX10_TEMP5 =
                          X10_TEMP16.
                            dReg;
                        
//#line 589
final int RX10_TEMP6 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP5,
                            X10_TEMP17);
                        
//#line 591
final int RX10_TEMP7 =
                          0;
                        
//#line 593
final boolean RX10_TEMP8 =
                          RX10_TEMP6 <
                          RX10_TEMP7;
                        
//#line 594
if (RX10_TEMP8) {
                            
//#line 597
final java.
                              lang.
                              String RX10_TEMP9 =
                              "Point X10_TEMP17 not found in the distribution X10_TEMP16.";
                            
//#line 598
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP9);
                        }
                        
//#line 601
final Dist SX10_TEMP0 =
                          X10_TEMP16.
                            dDist;
                        
//#line 603
final x10.
                          lang.
                          place RX10_TEMP10 =
                          Program.
                            getPlaceFromDist(
                            SX10_TEMP0,
                            RX10_TEMP6);
                        
//#line 605
final x10.
                          lang.
                          place X10_TEMP18 =
                          RX10_TEMP10;
                        
//#line 606
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 608
final Dist1 X10_TEMP20 =
                              tempSd.
                                D;
                            
//#line 610
final x10.
                              lang.
                              place X10_TEMP21 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 612
final Dist1 X10_TEMP23 =
                              Program.
                                restrictDist1(
                                X10_TEMP20,
                                X10_TEMP21);
                            
//#line 614
final Region1 RX10_TEMP13 =
                              X10_TEMP23.
                                dReg;
                            
//#line 616
final x10.
                              lang.
                              GenericReferenceArray RX10_TEMP14 =
                              RX10_TEMP13.
                                pointArray;
                            
//#line 617
/* template:forloop { */
                            for (java.util.Iterator RX10_TEMP11__ = (RX10_TEMP14.
                                                                       distribution.
                                                                       region).iterator(); RX10_TEMP11__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point RX10_TEMP11 = (x10.
                              lang.
                              point) RX10_TEMP11__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 620
final Point1 RX10_TEMP12 =
                                  /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP14).get(RX10_TEMP11))/* } */))/* } */;
                                
//#line 622
final int i =
                                  RX10_TEMP12.
                                    f0;
                                
//#line 624
final doubleRefArray1 X10_TEMP24 =
                                  tempSd.
                                    b;
                                
//#line 626
final double X10_TEMP29 =
                                  (1.5);
                                
//#line 628
final int X10_TEMP26 =
                                  (p *
                                     _Stream_LocalSize);
                                
//#line 630
final int X10_TEMP28 =
                                  (X10_TEMP26 +
                                     i);
                                
//#line 632
final double X10_TEMP32 =
                                  (X10_TEMP29 *
                                     X10_TEMP28);
                                
//#line 634
final double X10_TEMP33 =
                                  (X10_TEMP32);
                                
//#line 636
final Point1 RX10_TEMP15 =
                                  new Point1(
                                  i);
                                
//#line 638
final Dist1 RX10_TEMP16 =
                                  X10_TEMP24.
                                    distValue;
                                
//#line 640
final Region1 RX10_TEMP17 =
                                  RX10_TEMP16.
                                    dReg;
                                
//#line 642
final int RX10_TEMP18 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP17,
                                    RX10_TEMP15);
                                
//#line 644
final int RX10_TEMP19 =
                                  0;
                                
//#line 646
final boolean RX10_TEMP20 =
                                  RX10_TEMP18 <
                                  RX10_TEMP19;
                                
//#line 647
if (RX10_TEMP20) {
                                    
//#line 650
java.
                                      lang.
                                      String RX10_TEMP21 =
                                      "Array index out of bounds";
                                    
//#line 651
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP21);
                                }
                                
//#line 654
final Dist SX10_TEMP1 =
                                  RX10_TEMP16.
                                    dDist;
                                
//#line 656
final x10.
                                  lang.
                                  place RX10_TEMP22 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP1,
                                    RX10_TEMP18);
                                
//#line 658
final x10.
                                  lang.
                                  place RX10_TEMP24 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 660
final boolean RX10_TEMP25 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP22,RX10_TEMP24))/* } */;
                                
//#line 661
if (RX10_TEMP25) {
                                    
//#line 664
java.
                                      lang.
                                      String RX10_TEMP23 =
                                      "Bad place access for array X10_TEMP24";
                                    
//#line 665
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP23);
                                }
                                
//#line 669
final DOUBLEArray RX10_TEMP26 =
                                  X10_TEMP24.
                                    contents;
                                
//#line 670
Program.
                                               DOUBLESetValue(
                                               RX10_TEMP26,
                                               RX10_TEMP18,
                                               X10_TEMP33);
                                
//#line 672
final doubleRefArray1 X10_TEMP34 =
                                  tempSd.
                                    c;
                                
//#line 674
final double X10_TEMP39 =
                                  (2.5);
                                
//#line 676
final int X10_TEMP36 =
                                  (p *
                                     _Stream_LocalSize);
                                
//#line 678
final int X10_TEMP38 =
                                  (X10_TEMP36 +
                                     i);
                                
//#line 680
final double X10_TEMP42 =
                                  (X10_TEMP39 *
                                     X10_TEMP38);
                                
//#line 682
final double X10_TEMP43 =
                                  (X10_TEMP42);
                                
//#line 684
final Point1 RX10_TEMP27 =
                                  new Point1(
                                  i);
                                
//#line 686
final Dist1 RX10_TEMP28 =
                                  X10_TEMP34.
                                    distValue;
                                
//#line 688
final Region1 RX10_TEMP29 =
                                  RX10_TEMP28.
                                    dReg;
                                
//#line 690
final int RX10_TEMP30 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP29,
                                    RX10_TEMP27);
                                
//#line 692
final int RX10_TEMP31 =
                                  0;
                                
//#line 694
final boolean RX10_TEMP32 =
                                  RX10_TEMP30 <
                                  RX10_TEMP31;
                                
//#line 695
if (RX10_TEMP32) {
                                    
//#line 698
java.
                                      lang.
                                      String RX10_TEMP33 =
                                      "Array index out of bounds";
                                    
//#line 699
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP33);
                                }
                                
//#line 702
final Dist SX10_TEMP2 =
                                  RX10_TEMP28.
                                    dDist;
                                
//#line 704
final x10.
                                  lang.
                                  place RX10_TEMP34 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP2,
                                    RX10_TEMP30);
                                
//#line 706
final x10.
                                  lang.
                                  place RX10_TEMP36 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 708
final boolean RX10_TEMP37 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP34,RX10_TEMP36))/* } */;
                                
//#line 709
if (RX10_TEMP37) {
                                    
//#line 712
java.
                                      lang.
                                      String RX10_TEMP35 =
                                      "Bad place access for array X10_TEMP34";
                                    
//#line 713
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP35);
                                }
                                
//#line 717
final DOUBLEArray RX10_TEMP38 =
                                  X10_TEMP34.
                                    contents;
                                
//#line 718
Program.
                                               DOUBLESetValue(
                                               RX10_TEMP38,
                                               RX10_TEMP30,
                                               X10_TEMP43);
                            }/* } */
                            }
                            /* } */
                            
                            
//#line 721
final int X10_TEMP44 =
                              (0);
                            
//#line 723
final boolean X10_TEMP46 =
                              p ==
                              X10_TEMP44;
                            
//#line 724
if (X10_TEMP46) {
                                
//#line 727
final doubleRefArray1 X10_TEMP47 =
                                  tempSd.
                                    times;
                                
//#line 729
final double X10_TEMP49 =
                                  (Program.
                                     Stream_mySecond());
                                
//#line 731
final int X10_TEMP50 =
                                  0;
                                
//#line 733
final double X10_TEMP53 =
                                  (X10_TEMP50 -
                                     X10_TEMP49);
                                
//#line 735
final double X10_TEMP54 =
                                  (X10_TEMP53);
                                
//#line 737
final Dist1 RX10_TEMP39 =
                                  X10_TEMP47.
                                    distValue;
                                
//#line 739
final Region1 RX10_TEMP40 =
                                  RX10_TEMP39.
                                    dReg;
                                
//#line 741
final int RX10_TEMP41 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP40,
                                    p1);
                                
//#line 743
final int RX10_TEMP42 =
                                  0;
                                
//#line 745
final boolean RX10_TEMP43 =
                                  RX10_TEMP41 <
                                  RX10_TEMP42;
                                
//#line 746
if (RX10_TEMP43) {
                                    
//#line 749
java.
                                      lang.
                                      String RX10_TEMP44 =
                                      "Array index out of bounds";
                                    
//#line 750
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP44);
                                }
                                
//#line 753
final Dist SX10_TEMP3 =
                                  RX10_TEMP39.
                                    dDist;
                                
//#line 755
final x10.
                                  lang.
                                  place RX10_TEMP45 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP3,
                                    RX10_TEMP41);
                                
//#line 757
final x10.
                                  lang.
                                  place RX10_TEMP47 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 759
final boolean RX10_TEMP48 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP45,RX10_TEMP47))/* } */;
                                
//#line 760
if (RX10_TEMP48) {
                                    
//#line 763
java.
                                      lang.
                                      String RX10_TEMP46 =
                                      "Bad place access for array X10_TEMP47";
                                    
//#line 764
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP46);
                                }
                                
//#line 768
final DOUBLEArray RX10_TEMP49 =
                                  X10_TEMP47.
                                    contents;
                                
//#line 769
Program.
                                               DOUBLESetValue(
                                               RX10_TEMP49,
                                               RX10_TEMP41,
                                               X10_TEMP54);
                            }
                            
//#line 772
final Dist1 X10_TEMP56 =
                              tempSd.
                                D;
                            
//#line 774
final x10.
                              lang.
                              place X10_TEMP57 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 776
final Dist1 X10_TEMP59 =
                              Program.
                                restrictDist1(
                                X10_TEMP56,
                                X10_TEMP57);
                            
//#line 778
final Region1 RX10_TEMP52 =
                              X10_TEMP59.
                                dReg;
                            
//#line 780
final x10.
                              lang.
                              GenericReferenceArray RX10_TEMP53 =
                              RX10_TEMP52.
                                pointArray;
                            
//#line 781
/* template:forloop { */
                            for (java.util.Iterator RX10_TEMP50__ = (RX10_TEMP53.
                                                                       distribution.
                                                                       region).iterator(); RX10_TEMP50__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point RX10_TEMP50 = (x10.
                              lang.
                              point) RX10_TEMP50__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 784
final Point1 RX10_TEMP51 =
                                  /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP53).get(RX10_TEMP50))/* } */))/* } */;
                                
//#line 786
final int i =
                                  RX10_TEMP51.
                                    f0;
                                
//#line 788
final doubleRefArray1 X10_TEMP60 =
                                  tempSd.
                                    a;
                                
//#line 790
final doubleRefArray1 X10_TEMP62 =
                                  tempSd.
                                    b;
                                
//#line 792
final Point1 RX10_TEMP54 =
                                  new Point1(
                                  i);
                                
//#line 794
final Dist1 RX10_TEMP55 =
                                  X10_TEMP62.
                                    distValue;
                                
//#line 796
final Region1 RX10_TEMP56 =
                                  RX10_TEMP55.
                                    dReg;
                                
//#line 798
final int RX10_TEMP57 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP56,
                                    RX10_TEMP54);
                                
//#line 800
final int RX10_TEMP58 =
                                  0;
                                
//#line 802
final boolean RX10_TEMP59 =
                                  RX10_TEMP57 <
                                  RX10_TEMP58;
                                
//#line 803
if (RX10_TEMP59) {
                                    
//#line 806
java.
                                      lang.
                                      String RX10_TEMP60 =
                                      "Array access index out of bounds";
                                    
//#line 807
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP60);
                                }
                                
//#line 810
final Dist SX10_TEMP4 =
                                  RX10_TEMP55.
                                    dDist;
                                
//#line 812
final x10.
                                  lang.
                                  place RX10_TEMP61 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP4,
                                    RX10_TEMP57);
                                
//#line 814
final x10.
                                  lang.
                                  place RX10_TEMP63 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 816
final boolean RX10_TEMP64 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP61,RX10_TEMP63))/* } */;
                                
//#line 817
if (RX10_TEMP64) {
                                    
//#line 820
java.
                                      lang.
                                      String RX10_TEMP62 =
                                      "Bad place access for array X10_TEMP62";
                                    
//#line 821
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP62);
                                }
                                
//#line 825
final DOUBLEArray RX10_TEMP65 =
                                  X10_TEMP62.
                                    contents;
                                
//#line 827
final double X10_TEMP67 =
                                  (Program.
                                     DOUBLEGetValue(
                                     RX10_TEMP65,
                                     RX10_TEMP57));
                                
//#line 829
final doubleRefArray1 X10_TEMP64 =
                                  tempSd.
                                    c;
                                
//#line 831
final Point1 RX10_TEMP66 =
                                  new Point1(
                                  i);
                                
//#line 833
final Dist1 RX10_TEMP67 =
                                  X10_TEMP64.
                                    distValue;
                                
//#line 835
final Region1 RX10_TEMP68 =
                                  RX10_TEMP67.
                                    dReg;
                                
//#line 837
final int RX10_TEMP69 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP68,
                                    RX10_TEMP66);
                                
//#line 839
final int RX10_TEMP70 =
                                  0;
                                
//#line 841
final boolean RX10_TEMP71 =
                                  RX10_TEMP69 <
                                  RX10_TEMP70;
                                
//#line 842
if (RX10_TEMP71) {
                                    
//#line 845
java.
                                      lang.
                                      String RX10_TEMP72 =
                                      "Array access index out of bounds";
                                    
//#line 846
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP72);
                                }
                                
//#line 849
final Dist SX10_TEMP5 =
                                  RX10_TEMP67.
                                    dDist;
                                
//#line 851
final x10.
                                  lang.
                                  place RX10_TEMP73 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP5,
                                    RX10_TEMP69);
                                
//#line 853
final x10.
                                  lang.
                                  place RX10_TEMP75 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 855
final boolean RX10_TEMP76 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP73,RX10_TEMP75))/* } */;
                                
//#line 856
if (RX10_TEMP76) {
                                    
//#line 859
java.
                                      lang.
                                      String RX10_TEMP74 =
                                      "Bad place access for array X10_TEMP64";
                                    
//#line 860
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP74);
                                }
                                
//#line 864
final DOUBLEArray RX10_TEMP77 =
                                  X10_TEMP64.
                                    contents;
                                
//#line 866
final double X10_TEMP66 =
                                  (Program.
                                     DOUBLEGetValue(
                                     RX10_TEMP77,
                                     RX10_TEMP69));
                                
//#line 868
final double X10_TEMP68 =
                                  (_Stream_alpha *
                                     X10_TEMP66);
                                
//#line 870
final double X10_TEMP71 =
                                  (X10_TEMP67 +
                                     X10_TEMP68);
                                
//#line 872
final double X10_TEMP72 =
                                  (X10_TEMP71);
                                
//#line 874
final Point1 RX10_TEMP78 =
                                  new Point1(
                                  i);
                                
//#line 876
final Dist1 RX10_TEMP79 =
                                  X10_TEMP60.
                                    distValue;
                                
//#line 878
final Region1 RX10_TEMP80 =
                                  RX10_TEMP79.
                                    dReg;
                                
//#line 880
final int RX10_TEMP81 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP80,
                                    RX10_TEMP78);
                                
//#line 882
final int RX10_TEMP82 =
                                  0;
                                
//#line 884
final boolean RX10_TEMP83 =
                                  RX10_TEMP81 <
                                  RX10_TEMP82;
                                
//#line 885
if (RX10_TEMP83) {
                                    
//#line 888
java.
                                      lang.
                                      String RX10_TEMP84 =
                                      "Array index out of bounds";
                                    
//#line 889
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP84);
                                }
                                
//#line 892
final Dist SX10_TEMP6 =
                                  RX10_TEMP79.
                                    dDist;
                                
//#line 894
final x10.
                                  lang.
                                  place RX10_TEMP85 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP6,
                                    RX10_TEMP81);
                                
//#line 896
final x10.
                                  lang.
                                  place RX10_TEMP87 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 898
final boolean RX10_TEMP88 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP85,RX10_TEMP87))/* } */;
                                
//#line 899
if (RX10_TEMP88) {
                                    
//#line 902
java.
                                      lang.
                                      String RX10_TEMP86 =
                                      "Bad place access for array X10_TEMP60";
                                    
//#line 903
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP86);
                                }
                                
//#line 907
final DOUBLEArray RX10_TEMP89 =
                                  X10_TEMP60.
                                    contents;
                                
//#line 908
Program.
                                               DOUBLESetValue(
                                               RX10_TEMP89,
                                               RX10_TEMP81,
                                               X10_TEMP72);
                            }/* } */
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp18) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp18);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 913
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 915
final Dist1 X10_TEMP74 =
                      Program.
                        getUniqueDist();
                    
//#line 917
final Region1 RX10_TEMP91 =
                      X10_TEMP74.
                        dReg;
                    
//#line 919
final x10.
                      lang.
                      GenericReferenceArray RX10_TEMP92 =
                      RX10_TEMP91.
                        pointArray;
                    
//#line 920
/* template:forloop { */
                    for (java.util.Iterator RX10_TEMP90__ = (RX10_TEMP92.
                                                               distribution.
                                                               region).iterator(); RX10_TEMP90__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point RX10_TEMP90 = (x10.
                      lang.
                      point) RX10_TEMP90__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 923
final Point1 X10_TEMP76 =
                          /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP92).get(RX10_TEMP90))/* } */))/* } */;
                        
//#line 925
final int p =
                          X10_TEMP76.
                            f0;
                        
//#line 927
final Dist1 X10_TEMP75 =
                          X10_TEMP74;
                        
//#line 929
final Region1 RX10_TEMP93 =
                          X10_TEMP75.
                            dReg;
                        
//#line 931
final int RX10_TEMP94 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP93,
                            X10_TEMP76);
                        
//#line 933
final int RX10_TEMP95 =
                          0;
                        
//#line 935
final boolean RX10_TEMP96 =
                          RX10_TEMP94 <
                          RX10_TEMP95;
                        
//#line 936
if (RX10_TEMP96) {
                            
//#line 939
final java.
                              lang.
                              String RX10_TEMP97 =
                              "Point X10_TEMP76 not found in the distribution X10_TEMP75.";
                            
//#line 940
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP97);
                        }
                        
//#line 943
final Dist SX10_TEMP7 =
                          X10_TEMP75.
                            dDist;
                        
//#line 945
final x10.
                          lang.
                          place RX10_TEMP98 =
                          Program.
                            getPlaceFromDist(
                            SX10_TEMP7,
                            RX10_TEMP94);
                        
//#line 947
final x10.
                          lang.
                          place X10_TEMP77 =
                          RX10_TEMP98;
                        
//#line 948
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP77)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 950
final int X10_TEMP78 =
                              (0);
                            
//#line 952
final boolean X10_TEMP80 =
                              p ==
                              X10_TEMP78;
                            
//#line 953
if (X10_TEMP80) {
                                
//#line 956
final doubleRefArray1 X10_TEMP81 =
                                  tempSd.
                                    times;
                                
//#line 958
final Dist1 RX10_TEMP99 =
                                  X10_TEMP81.
                                    distValue;
                                
//#line 960
final Region1 RX10_TEMP100 =
                                  RX10_TEMP99.
                                    dReg;
                                
//#line 962
final int RX10_TEMP101 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP100,
                                    p1);
                                
//#line 964
final int RX10_TEMP102 =
                                  0;
                                
//#line 966
final boolean RX10_TEMP103 =
                                  RX10_TEMP101 <
                                  RX10_TEMP102;
                                
//#line 967
if (RX10_TEMP103) {
                                    
//#line 970
java.
                                      lang.
                                      String RX10_TEMP104 =
                                      "Array access index out of bounds";
                                    
//#line 971
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP104);
                                }
                                
//#line 974
final Dist SX10_TEMP8 =
                                  RX10_TEMP99.
                                    dDist;
                                
//#line 976
final x10.
                                  lang.
                                  place RX10_TEMP105 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP8,
                                    RX10_TEMP101);
                                
//#line 978
final x10.
                                  lang.
                                  place RX10_TEMP107 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 980
final boolean RX10_TEMP108 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP105,RX10_TEMP107))/* } */;
                                
//#line 981
if (RX10_TEMP108) {
                                    
//#line 984
java.
                                      lang.
                                      String RX10_TEMP106 =
                                      "Bad place access for array X10_TEMP81";
                                    
//#line 985
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP106);
                                }
                                
//#line 989
final DOUBLEArray RX10_TEMP109 =
                                  X10_TEMP81.
                                    contents;
                                
//#line 991
final double X10_TEMP84 =
                                  (Program.
                                     DOUBLEGetValue(
                                     RX10_TEMP109,
                                     RX10_TEMP101));
                                
//#line 993
final double X10_TEMP85 =
                                  (Program.
                                     Stream_mySecond());
                                
//#line 995
final double X10_TEMP86 =
                                  (X10_TEMP84 +
                                     X10_TEMP85);
                                
//#line 997
final Dist1 RX10_TEMP110 =
                                  X10_TEMP81.
                                    distValue;
                                
//#line 999
final Region1 RX10_TEMP111 =
                                  RX10_TEMP110.
                                    dReg;
                                
//#line 1001
final int RX10_TEMP112 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP111,
                                    p1);
                                
//#line 1003
final int RX10_TEMP113 =
                                  0;
                                
//#line 1005
final boolean RX10_TEMP114 =
                                  RX10_TEMP112 <
                                  RX10_TEMP113;
                                
//#line 1006
if (RX10_TEMP114) {
                                    
//#line 1009
java.
                                      lang.
                                      String RX10_TEMP115 =
                                      "Array index out of bounds";
                                    
//#line 1010
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP115);
                                }
                                
//#line 1013
final Dist SX10_TEMP9 =
                                  RX10_TEMP110.
                                    dDist;
                                
//#line 1015
final x10.
                                  lang.
                                  place RX10_TEMP116 =
                                  Program.
                                    getPlaceFromDist(
                                    SX10_TEMP9,
                                    RX10_TEMP112);
                                
//#line 1017
final x10.
                                  lang.
                                  place RX10_TEMP118 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 1019
final boolean RX10_TEMP119 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP116,RX10_TEMP118))/* } */;
                                
//#line 1020
if (RX10_TEMP119) {
                                    
//#line 1023
java.
                                      lang.
                                      String RX10_TEMP117 =
                                      "Bad place access for array X10_TEMP81";
                                    
//#line 1024
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP117);
                                }
                                
//#line 1028
final DOUBLEArray RX10_TEMP120 =
                                  X10_TEMP81.
                                    contents;
                                
//#line 1029
Program.
                                                DOUBLESetValue(
                                                RX10_TEMP120,
                                                RX10_TEMP112,
                                                X10_TEMP86);
                            }
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp19) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp19);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            
//#line 1035
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1037
final Dist1 X10_TEMP88 =
                  Program.
                    getUniqueDist();
                
//#line 1039
final Region1 RX10_TEMP122 =
                  X10_TEMP88.
                    dReg;
                
//#line 1041
final x10.
                  lang.
                  GenericReferenceArray RX10_TEMP123 =
                  RX10_TEMP122.
                    pointArray;
                
//#line 1042
/* template:forloop { */
                for (java.util.Iterator RX10_TEMP121__ = (RX10_TEMP123.
                                                            distribution.
                                                            region).iterator(); RX10_TEMP121__.hasNext(); ) {
                	final  x10.
                  lang.
                  point RX10_TEMP121 = (x10.
                  lang.
                  point) RX10_TEMP121__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1045
final Point1 X10_TEMP90 =
                      /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP123).get(RX10_TEMP121))/* } */))/* } */;
                    
//#line 1047
final int p =
                      X10_TEMP90.
                        f0;
                    
//#line 1049
final Dist1 X10_TEMP89 =
                      X10_TEMP88;
                    
//#line 1051
final Region1 RX10_TEMP124 =
                      X10_TEMP89.
                        dReg;
                    
//#line 1053
final int RX10_TEMP125 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP124,
                        X10_TEMP90);
                    
//#line 1055
final int RX10_TEMP126 =
                      0;
                    
//#line 1057
final boolean RX10_TEMP127 =
                      RX10_TEMP125 <
                      RX10_TEMP126;
                    
//#line 1058
if (RX10_TEMP127) {
                        
//#line 1061
final java.
                          lang.
                          String RX10_TEMP128 =
                          "Point X10_TEMP90 not found in the distribution X10_TEMP89.";
                        
//#line 1062
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP128);
                    }
                    
//#line 1065
final Dist SX10_TEMP10 =
                      X10_TEMP89.
                        dDist;
                    
//#line 1067
final x10.
                      lang.
                      place RX10_TEMP129 =
                      Program.
                        getPlaceFromDist(
                        SX10_TEMP10,
                        RX10_TEMP125);
                    
//#line 1069
final x10.
                      lang.
                      place X10_TEMP91 =
                      RX10_TEMP129;
                    
//#line 1070
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP91)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1072
final Dist1 X10_TEMP93 =
                          tempSd.
                            D;
                        
//#line 1074
final x10.
                          lang.
                          place X10_TEMP94 =
                          (/* template:here { */x10.lang.Runtime.here()/* } */);
                        
//#line 1076
final Dist1 X10_TEMP96 =
                          Program.
                            restrictDist1(
                            X10_TEMP93,
                            X10_TEMP94);
                        
//#line 1078
final Region1 RX10_TEMP132 =
                          X10_TEMP96.
                            dReg;
                        
//#line 1080
final x10.
                          lang.
                          GenericReferenceArray RX10_TEMP133 =
                          RX10_TEMP132.
                            pointArray;
                        
//#line 1081
/* template:forloop { */
                        for (java.util.Iterator RX10_TEMP130__ = (RX10_TEMP133.
                                                                    distribution.
                                                                    region).iterator(); RX10_TEMP130__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point RX10_TEMP130 = (x10.
                          lang.
                          point) RX10_TEMP130__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 1084
final Point1 RX10_TEMP131 =
                              /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP133).get(RX10_TEMP130))/* } */))/* } */;
                            
//#line 1086
final int i =
                              RX10_TEMP131.
                                f0;
                            
//#line 1088
final doubleRefArray1 X10_TEMP97 =
                              tempSd.
                                a;
                            
//#line 1090
final Point1 RX10_TEMP134 =
                              new Point1(
                              i);
                            
//#line 1092
final Dist1 RX10_TEMP135 =
                              X10_TEMP97.
                                distValue;
                            
//#line 1094
final Region1 RX10_TEMP136 =
                              RX10_TEMP135.
                                dReg;
                            
//#line 1096
final int RX10_TEMP137 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP136,
                                RX10_TEMP134);
                            
//#line 1098
final int RX10_TEMP138 =
                              0;
                            
//#line 1100
final boolean RX10_TEMP139 =
                              RX10_TEMP137 <
                              RX10_TEMP138;
                            
//#line 1101
if (RX10_TEMP139) {
                                
//#line 1104
java.
                                  lang.
                                  String RX10_TEMP140 =
                                  "Array access index out of bounds";
                                
//#line 1105
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP140);
                            }
                            
//#line 1108
final Dist SX10_TEMP11 =
                              RX10_TEMP135.
                                dDist;
                            
//#line 1110
final x10.
                              lang.
                              place RX10_TEMP141 =
                              Program.
                                getPlaceFromDist(
                                SX10_TEMP11,
                                RX10_TEMP137);
                            
//#line 1112
final x10.
                              lang.
                              place RX10_TEMP143 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 1114
final boolean RX10_TEMP144 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP141,RX10_TEMP143))/* } */;
                            
//#line 1115
if (RX10_TEMP144) {
                                
//#line 1118
java.
                                  lang.
                                  String RX10_TEMP142 =
                                  "Bad place access for array X10_TEMP97";
                                
//#line 1119
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP142);
                            }
                            
//#line 1123
final DOUBLEArray RX10_TEMP145 =
                              X10_TEMP97.
                                contents;
                            
//#line 1125
final double X10_TEMP106 =
                              (Program.
                                 DOUBLEGetValue(
                                 RX10_TEMP145,
                                 RX10_TEMP137));
                            
//#line 1127
final doubleRefArray1 X10_TEMP99 =
                              tempSd.
                                b;
                            
//#line 1129
final Point1 RX10_TEMP146 =
                              new Point1(
                              i);
                            
//#line 1131
final Dist1 RX10_TEMP147 =
                              X10_TEMP99.
                                distValue;
                            
//#line 1133
final Region1 RX10_TEMP148 =
                              RX10_TEMP147.
                                dReg;
                            
//#line 1135
final int RX10_TEMP149 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP148,
                                RX10_TEMP146);
                            
//#line 1137
final int RX10_TEMP150 =
                              0;
                            
//#line 1139
final boolean RX10_TEMP151 =
                              RX10_TEMP149 <
                              RX10_TEMP150;
                            
//#line 1140
if (RX10_TEMP151) {
                                
//#line 1143
java.
                                  lang.
                                  String RX10_TEMP152 =
                                  "Array access index out of bounds";
                                
//#line 1144
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP152);
                            }
                            
//#line 1147
final Dist SX10_TEMP12 =
                              RX10_TEMP147.
                                dDist;
                            
//#line 1149
final x10.
                              lang.
                              place RX10_TEMP153 =
                              Program.
                                getPlaceFromDist(
                                SX10_TEMP12,
                                RX10_TEMP149);
                            
//#line 1151
final x10.
                              lang.
                              place RX10_TEMP155 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 1153
final boolean RX10_TEMP156 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP153,RX10_TEMP155))/* } */;
                            
//#line 1154
if (RX10_TEMP156) {
                                
//#line 1157
java.
                                  lang.
                                  String RX10_TEMP154 =
                                  "Bad place access for array X10_TEMP99";
                                
//#line 1158
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP154);
                            }
                            
//#line 1162
final DOUBLEArray RX10_TEMP157 =
                              X10_TEMP99.
                                contents;
                            
//#line 1164
final double X10_TEMP104 =
                              (Program.
                                 DOUBLEGetValue(
                                 RX10_TEMP157,
                                 RX10_TEMP149));
                            
//#line 1166
final doubleRefArray1 X10_TEMP101 =
                              tempSd.
                                c;
                            
//#line 1168
final Point1 RX10_TEMP158 =
                              new Point1(
                              i);
                            
//#line 1170
final Dist1 RX10_TEMP159 =
                              X10_TEMP101.
                                distValue;
                            
//#line 1172
final Region1 RX10_TEMP160 =
                              RX10_TEMP159.
                                dReg;
                            
//#line 1174
final int RX10_TEMP161 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP160,
                                RX10_TEMP158);
                            
//#line 1176
final int RX10_TEMP162 =
                              0;
                            
//#line 1178
final boolean RX10_TEMP163 =
                              RX10_TEMP161 <
                              RX10_TEMP162;
                            
//#line 1179
if (RX10_TEMP163) {
                                
//#line 1182
java.
                                  lang.
                                  String RX10_TEMP164 =
                                  "Array access index out of bounds";
                                
//#line 1183
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP164);
                            }
                            
//#line 1186
final Dist SX10_TEMP13 =
                              RX10_TEMP159.
                                dDist;
                            
//#line 1188
final x10.
                              lang.
                              place RX10_TEMP165 =
                              Program.
                                getPlaceFromDist(
                                SX10_TEMP13,
                                RX10_TEMP161);
                            
//#line 1190
final x10.
                              lang.
                              place RX10_TEMP167 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 1192
final boolean RX10_TEMP168 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP165,RX10_TEMP167))/* } */;
                            
//#line 1193
if (RX10_TEMP168) {
                                
//#line 1196
java.
                                  lang.
                                  String RX10_TEMP166 =
                                  "Bad place access for array X10_TEMP101";
                                
//#line 1197
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP166);
                            }
                            
//#line 1201
final DOUBLEArray RX10_TEMP169 =
                              X10_TEMP101.
                                contents;
                            
//#line 1203
final double X10_TEMP103 =
                              (Program.
                                 DOUBLEGetValue(
                                 RX10_TEMP169,
                                 RX10_TEMP161));
                            
//#line 1205
final double X10_TEMP105 =
                              (_Stream_alpha *
                                 X10_TEMP103);
                            
//#line 1207
final double X10_TEMP107 =
                              (X10_TEMP104 +
                                 X10_TEMP105);
                            
//#line 1209
final boolean X10_TEMP109 =
                              X10_TEMP106 !=
                              X10_TEMP107;
                            
//#line 1210
if (X10_TEMP109) {
                                
//#line 1213
final x10.
                                  lang.
                                  place X10_TEMP111 =
                                  x10.
                                    lang.
                                    place.
                                    FIRST_PLACE;
                                
//#line 1214
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP111)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 1216
final booleanRefArray1 X10_TEMP112 =
                                      tempSd.
                                        verified;
                                    
//#line 1218
final int X10_TEMP114 =
                                      (0);
                                    
//#line 1220
final boolean X10_TEMP117 =
                                      (false);
                                    
//#line 1222
final boolean X10_TEMP118 =
                                      (X10_TEMP117);
                                    
//#line 1224
final Point1 RX10_TEMP170 =
                                      new Point1(
                                      X10_TEMP114);
                                    
//#line 1226
final Dist1 RX10_TEMP171 =
                                      X10_TEMP112.
                                        distValue;
                                    
//#line 1228
final Region1 RX10_TEMP172 =
                                      RX10_TEMP171.
                                        dReg;
                                    
//#line 1230
final int RX10_TEMP173 =
                                      Program.
                                        searchPointInRegion1(
                                        RX10_TEMP172,
                                        RX10_TEMP170);
                                    
//#line 1232
final int RX10_TEMP174 =
                                      0;
                                    
//#line 1234
final boolean RX10_TEMP175 =
                                      RX10_TEMP173 <
                                      RX10_TEMP174;
                                    
//#line 1235
if (RX10_TEMP175) {
                                        
//#line 1238
java.
                                          lang.
                                          String RX10_TEMP176 =
                                          "Array index out of bounds";
                                        
//#line 1239
throw new java.
                                          lang.
                                          RuntimeException(
                                          RX10_TEMP176);
                                    }
                                    
//#line 1242
final Dist SX10_TEMP14 =
                                      RX10_TEMP171.
                                        dDist;
                                    
//#line 1244
final x10.
                                      lang.
                                      place RX10_TEMP177 =
                                      Program.
                                        getPlaceFromDist(
                                        SX10_TEMP14,
                                        RX10_TEMP173);
                                    
//#line 1246
final x10.
                                      lang.
                                      place RX10_TEMP179 =
                                      /* template:here { */x10.lang.Runtime.here()/* } */;
                                    
//#line 1248
final boolean RX10_TEMP180 =
                                      /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP177,RX10_TEMP179))/* } */;
                                    
//#line 1249
if (RX10_TEMP180) {
                                        
//#line 1252
java.
                                          lang.
                                          String RX10_TEMP178 =
                                          "Bad place access for array X10_TEMP112";
                                        
//#line 1253
throw new java.
                                          lang.
                                          RuntimeException(
                                          RX10_TEMP178);
                                    }
                                    
//#line 1257
final BOOLEANArray RX10_TEMP181 =
                                      X10_TEMP112.
                                        contents;
                                    
//#line 1258
Program.
                                                    BOOLEANSetValue(
                                                    RX10_TEMP181,
                                                    RX10_TEMP173,
                                                    X10_TEMP118);
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp20) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp20);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp17) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp17);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1267
double mini =
          (10000000L);
        
//#line 1269
final int X10_TEMP125 =
          (0);
        
//#line 1271
final int X10_TEMP121 =
          (1);
        
//#line 1273
final int X10_TEMP123 =
          (_Stream_NUM_TIMES -
             X10_TEMP121);
        
//#line 1275
final int X10_TEMP126 =
          ((int)
             X10_TEMP123);
        
//#line 1277
Region1 r =
          Program.
            createNewRegion1R(
            X10_TEMP125,
            X10_TEMP126);
        
//#line 1279
final x10.
          lang.
          GenericReferenceArray RX10_TEMP183 =
          r.
            pointArray;
        
//#line 1280
/* template:forloop { */
        for (java.util.Iterator RX10_TEMP182__ = (RX10_TEMP183.
                                                    distribution.
                                                    region).iterator(); RX10_TEMP182__.hasNext(); ) {
        	final  x10.
          lang.
          point RX10_TEMP182 = (x10.
          lang.
          point) RX10_TEMP182__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1283
final Point1 p1 =
              /* template:parametric { */((Point1)(/* template:array_get { */((RX10_TEMP183).get(RX10_TEMP182))/* } */))/* } */;
            
//#line 1285
final doubleRefArray1 X10_TEMP129 =
              tempSd.
                times;
            
//#line 1287
final Dist1 RX10_TEMP184 =
              X10_TEMP129.
                distValue;
            
//#line 1289
final Region1 RX10_TEMP185 =
              RX10_TEMP184.
                dReg;
            
//#line 1291
final int RX10_TEMP186 =
              Program.
                searchPointInRegion1(
                RX10_TEMP185,
                p1);
            
//#line 1293
final int RX10_TEMP187 =
              0;
            
//#line 1295
final boolean RX10_TEMP188 =
              RX10_TEMP186 <
              RX10_TEMP187;
            
//#line 1296
if (RX10_TEMP188) {
                
//#line 1299
java.
                  lang.
                  String RX10_TEMP189 =
                  "Array access index out of bounds";
                
//#line 1300
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP189);
            }
            
//#line 1303
final Dist SX10_TEMP15 =
              RX10_TEMP184.
                dDist;
            
//#line 1305
final x10.
              lang.
              place RX10_TEMP190 =
              Program.
                getPlaceFromDist(
                SX10_TEMP15,
                RX10_TEMP186);
            
//#line 1307
final x10.
              lang.
              place RX10_TEMP192 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 1309
final boolean RX10_TEMP193 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP190,RX10_TEMP192))/* } */;
            
//#line 1310
if (RX10_TEMP193) {
                
//#line 1313
java.
                  lang.
                  String RX10_TEMP191 =
                  "Bad place access for array X10_TEMP129";
                
//#line 1314
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP191);
            }
            
//#line 1318
final DOUBLEArray RX10_TEMP194 =
              X10_TEMP129.
                contents;
            
//#line 1320
final double X10_TEMP131 =
              (Program.
                 DOUBLEGetValue(
                 RX10_TEMP194,
                 RX10_TEMP186));
            
//#line 1322
final boolean X10_TEMP133 =
              X10_TEMP131 <
              mini;
            
//#line 1323
if (X10_TEMP133) {
                
//#line 1326
final doubleRefArray1 X10_TEMP134 =
                  tempSd.
                    times;
                
//#line 1328
final Dist1 RX10_TEMP195 =
                  X10_TEMP134.
                    distValue;
                
//#line 1330
final Region1 RX10_TEMP196 =
                  RX10_TEMP195.
                    dReg;
                
//#line 1332
final int RX10_TEMP197 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP196,
                    p1);
                
//#line 1334
final int RX10_TEMP198 =
                  0;
                
//#line 1336
final boolean RX10_TEMP199 =
                  RX10_TEMP197 <
                  RX10_TEMP198;
                
//#line 1337
if (RX10_TEMP199) {
                    
//#line 1340
java.
                      lang.
                      String RX10_TEMP200 =
                      "Array access index out of bounds";
                    
//#line 1341
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP200);
                }
                
//#line 1344
final Dist SX10_TEMP16 =
                  RX10_TEMP195.
                    dDist;
                
//#line 1346
final x10.
                  lang.
                  place RX10_TEMP201 =
                  Program.
                    getPlaceFromDist(
                    SX10_TEMP16,
                    RX10_TEMP197);
                
//#line 1348
final x10.
                  lang.
                  place RX10_TEMP203 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1350
final boolean RX10_TEMP204 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP201,RX10_TEMP203))/* } */;
                
//#line 1351
if (RX10_TEMP204) {
                    
//#line 1354
java.
                      lang.
                      String RX10_TEMP202 =
                      "Bad place access for array X10_TEMP134";
                    
//#line 1355
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP202);
                }
                
//#line 1359
final DOUBLEArray RX10_TEMP205 =
                  X10_TEMP134.
                    contents;
                
//#line 1361
final double X10_TEMP137 =
                  (Program.
                     DOUBLEGetValue(
                     RX10_TEMP205,
                     RX10_TEMP197));
                
//#line 1363
mini =
                  ((X10_TEMP137));
            }
        }/* } */
        }
        /* } */
        
        
//#line 1367
final booleanRefArray1 X10_TEMP140 =
          tempSd.
            verified;
        
//#line 1369
final int X10_TEMP142 =
          (0);
        
//#line 1371
final Point1 RX10_TEMP206 =
          new Point1(
          X10_TEMP142);
        
//#line 1373
final Dist1 RX10_TEMP207 =
          X10_TEMP140.
            distValue;
        
//#line 1375
final Region1 RX10_TEMP208 =
          RX10_TEMP207.
            dReg;
        
//#line 1377
final int RX10_TEMP209 =
          Program.
            searchPointInRegion1(
            RX10_TEMP208,
            RX10_TEMP206);
        
//#line 1379
final int RX10_TEMP210 =
          0;
        
//#line 1381
final boolean RX10_TEMP211 =
          RX10_TEMP209 <
          RX10_TEMP210;
        
//#line 1382
if (RX10_TEMP211) {
            
//#line 1385
java.
              lang.
              String RX10_TEMP212 =
              "Array access index out of bounds";
            
//#line 1386
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP212);
        }
        
//#line 1389
final Dist SX10_TEMP17 =
          RX10_TEMP207.
            dDist;
        
//#line 1391
final x10.
          lang.
          place RX10_TEMP213 =
          Program.
            getPlaceFromDist(
            SX10_TEMP17,
            RX10_TEMP209);
        
//#line 1393
final x10.
          lang.
          place RX10_TEMP215 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1395
final boolean RX10_TEMP216 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP213,RX10_TEMP215))/* } */;
        
//#line 1396
if (RX10_TEMP216) {
            
//#line 1399
java.
              lang.
              String RX10_TEMP214 =
              "Bad place access for array X10_TEMP140";
            
//#line 1400
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP214);
        }
        
//#line 1404
final BOOLEANArray RX10_TEMP217 =
          X10_TEMP140.
            contents;
        
//#line 1406
final boolean X10_TEMP144 =
          (Program.
             BOOLEANGetValue(
             RX10_TEMP217,
             RX10_TEMP209));
        
//#line 1407
Program.
                        Stream_printStats(
                        _Stream_N,
                        mini,
                        X10_TEMP144);
    }
    
    
//#line 1409
public static double
                    Stream_mySecond(
                    ) {
        
//#line 1411
final double X10_TEMP1 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1413
final double X10_TEMP2 =
          (1000000.0);
        
//#line 1415
final double X10_TEMP3 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 1417
final int X10_TEMP4 =
          (1000);
        
//#line 1419
final double X10_TEMP6 =
          (X10_TEMP3 /
             X10_TEMP4);
        
//#line 1421
final double X10_TEMP7 =
          ((double)
             X10_TEMP6);
        
//#line 1423
final double X10_TEMP8 =
          (1.0E-6);
        
//#line 1425
final double X10_TEMP10 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 1427
final double X10_TEMP12 =
          ((double)
             X10_TEMP10);
        
//#line 1428
return X10_TEMP12;
    }
    
    
//#line 1430
public static void
                    Stream_printStats(
                    final long N,
                    final double time,
                    final boolean verified) {
        
//#line 1432
long X10_TEMP1 =
          N;
        
//#line 1434
double X10_TEMP2 =
          time;
        
//#line 1436
boolean X10_TEMP3 =
          verified;
        
//#line 1438
final java.
          lang.
          String X10_TEMP4 =
          ("Number of places=");
        
//#line 1440
final int X10_TEMP5 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 1442
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 1443
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP7);
        
//#line 1445
final int X10_TEMP8 =
          (3);
        
//#line 1447
final int X10_TEMP9 =
          (8);
        
//#line 1449
final long X10_TEMP10 =
          (X10_TEMP8 *
             X10_TEMP9);
        
//#line 1451
final long X10_TEMP11 =
          (X10_TEMP10 *
             X10_TEMP1);
        
//#line 1453
final long X10_TEMP13 =
          (X10_TEMP11 /
             _Stream_MEG);
        
//#line 1455
long size1 =
          (X10_TEMP13);
        
//#line 1457
final int X10_TEMP15 =
          (3);
        
//#line 1459
final int X10_TEMP16 =
          (8);
        
//#line 1461
final long X10_TEMP17 =
          (X10_TEMP15 *
             X10_TEMP16);
        
//#line 1463
final long X10_TEMP19 =
          (X10_TEMP17 *
             X10_TEMP1);
        
//#line 1465
final double X10_TEMP20 =
          (1.0E9);
        
//#line 1467
final double X10_TEMP22 =
          (X10_TEMP20 *
             X10_TEMP2);
        
//#line 1469
double rate =
          (X10_TEMP19 /
             X10_TEMP22);
        
//#line 1471
final java.
          lang.
          String X10_TEMP24 =
          ("Size of arrays: ");
        
//#line 1473
final java.
          lang.
          String X10_TEMP25 =
          (X10_TEMP24 +
           size1);
        
//#line 1475
final java.
          lang.
          String X10_TEMP26 =
          (" MB (total)");
        
//#line 1477
final java.
          lang.
          String X10_TEMP28 =
          (X10_TEMP25 +
           X10_TEMP26);
        
//#line 1479
final int X10_TEMP27 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 1481
final long X10_TEMP29 =
          (size1 /
             X10_TEMP27);
        
//#line 1483
final java.
          lang.
          String X10_TEMP30 =
          (X10_TEMP28 +
           X10_TEMP29);
        
//#line 1485
final java.
          lang.
          String X10_TEMP31 =
          (" MB (per place)");
        
//#line 1487
final java.
          lang.
          String X10_TEMP33 =
          (X10_TEMP30 +
           X10_TEMP31);
        
//#line 1488
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP33);
        
//#line 1490
final java.
          lang.
          String X10_TEMP34 =
          ("Min time: ");
        
//#line 1492
final java.
          lang.
          String X10_TEMP35 =
          (X10_TEMP34 +
           X10_TEMP2);
        
//#line 1494
final java.
          lang.
          String X10_TEMP36 =
          (" rate=");
        
//#line 1496
final java.
          lang.
          String X10_TEMP37 =
          (X10_TEMP35 +
           X10_TEMP36);
        
//#line 1498
final java.
          lang.
          String X10_TEMP38 =
          (X10_TEMP37 +
           rate);
        
//#line 1500
final java.
          lang.
          String X10_TEMP39 =
          (" GB/s");
        
//#line 1502
final java.
          lang.
          String X10_TEMP41 =
          (X10_TEMP38 +
           X10_TEMP39);
        
//#line 1503
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP41);
        
//#line 1505
final java.
          lang.
          String X10_TEMP48 =
          ("Result is ");
        
//#line 1507
final boolean X10_TEMP42 =
          X10_TEMP3;
        
//#line 1509
java.
          lang.
          String X10_TEMP45 =
          "NOT verified.";
        
//#line 1510
if (X10_TEMP42) {
            
//#line 1513
X10_TEMP45 =
              "verified.";
        }
        
//#line 1516
final java.
          lang.
          String X10_TEMP46 =
          X10_TEMP45;
        
//#line 1518
final java.
          lang.
          String X10_TEMP47 =
          (X10_TEMP46);
        
//#line 1520
final java.
          lang.
          String X10_TEMP50 =
          (X10_TEMP48 +
           X10_TEMP47);
        
//#line 1521
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP50);
    }
    
    
//#line 1523
public static int
                    _Timer_max_counters_init(
                    ) {
        
//#line 1525
final int X10_TEMP2 =
          (64);
        
//#line 1526
return X10_TEMP2;
    }
    
    
//#line 1528
public static void
                    Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1530
int X10_TEMP1 =
          n;
        
//#line 1532
final doubleRefArray1 X10_TEMP2 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 1534
final double X10_TEMP6 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1536
final double X10_TEMP7 =
          (X10_TEMP6);
        
//#line 1538
final Point1 RX10_TEMP0 =
          new Point1(
          X10_TEMP1);
        
//#line 1540
final Dist1 RX10_TEMP1 =
          X10_TEMP2.
            distValue;
        
//#line 1542
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 1544
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 1546
final int RX10_TEMP4 =
          0;
        
//#line 1548
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 1549
if (RX10_TEMP5) {
            
//#line 1552
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 1553
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 1556
final Dist SX10_TEMP0 =
          RX10_TEMP1.
            dDist;
        
//#line 1558
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist(
            SX10_TEMP0,
            RX10_TEMP3);
        
//#line 1560
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1562
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 1563
if (RX10_TEMP10) {
            
//#line 1566
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP2";
            
//#line 1567
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 1571
final DOUBLEArray RX10_TEMP11 =
          X10_TEMP2.
            contents;
        
//#line 1572
Program.
                        DOUBLESetValue(
                        RX10_TEMP11,
                        RX10_TEMP3,
                        X10_TEMP7);
    }
    
    
//#line 1574
public static void
                    Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1576
int X10_TEMP1 =
          n;
        
//#line 1578
final doubleRefArray1 X10_TEMP2 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 1580
final double X10_TEMP6 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1582
final doubleRefArray1 X10_TEMP4 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 1584
final Point1 RX10_TEMP0 =
          new Point1(
          X10_TEMP1);
        
//#line 1586
final Dist1 RX10_TEMP1 =
          X10_TEMP4.
            distValue;
        
//#line 1588
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 1590
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 1592
final int RX10_TEMP4 =
          0;
        
//#line 1594
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 1595
if (RX10_TEMP5) {
            
//#line 1598
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 1599
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 1602
final Dist SX10_TEMP0 =
          RX10_TEMP1.
            dDist;
        
//#line 1604
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist(
            SX10_TEMP0,
            RX10_TEMP3);
        
//#line 1606
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1608
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 1609
if (RX10_TEMP10) {
            
//#line 1612
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP4";
            
//#line 1613
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 1617
final DOUBLEArray RX10_TEMP11 =
          X10_TEMP4.
            contents;
        
//#line 1619
final double X10_TEMP7 =
          (Program.
             DOUBLEGetValue(
             RX10_TEMP11,
             RX10_TEMP3));
        
//#line 1621
final double X10_TEMP10 =
          (X10_TEMP6 -
             X10_TEMP7);
        
//#line 1623
final double X10_TEMP11 =
          (X10_TEMP10);
        
//#line 1625
final Point1 RX10_TEMP12 =
          new Point1(
          X10_TEMP1);
        
//#line 1627
final Dist1 RX10_TEMP13 =
          X10_TEMP2.
            distValue;
        
//#line 1629
final Region1 RX10_TEMP14 =
          RX10_TEMP13.
            dReg;
        
//#line 1631
final int RX10_TEMP15 =
          Program.
            searchPointInRegion1(
            RX10_TEMP14,
            RX10_TEMP12);
        
//#line 1633
final int RX10_TEMP16 =
          0;
        
//#line 1635
final boolean RX10_TEMP17 =
          RX10_TEMP15 <
          RX10_TEMP16;
        
//#line 1636
if (RX10_TEMP17) {
            
//#line 1639
java.
              lang.
              String RX10_TEMP18 =
              "Array index out of bounds";
            
//#line 1640
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP18);
        }
        
//#line 1643
final Dist SX10_TEMP1 =
          RX10_TEMP13.
            dDist;
        
//#line 1645
final x10.
          lang.
          place RX10_TEMP19 =
          Program.
            getPlaceFromDist(
            SX10_TEMP1,
            RX10_TEMP15);
        
//#line 1647
final x10.
          lang.
          place RX10_TEMP21 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1649
final boolean RX10_TEMP22 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
        
//#line 1650
if (RX10_TEMP22) {
            
//#line 1653
java.
              lang.
              String RX10_TEMP20 =
              "Bad place access for array X10_TEMP2";
            
//#line 1654
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP20);
        }
        
//#line 1658
final DOUBLEArray RX10_TEMP23 =
          X10_TEMP2.
            contents;
        
//#line 1659
Program.
                        DOUBLESetValue(
                        RX10_TEMP23,
                        RX10_TEMP15,
                        X10_TEMP11);
        
//#line 1661
final doubleRefArray1 X10_TEMP12 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 1663
final Point1 RX10_TEMP24 =
          new Point1(
          X10_TEMP1);
        
//#line 1665
final Dist1 RX10_TEMP25 =
          X10_TEMP12.
            distValue;
        
//#line 1667
final Region1 RX10_TEMP26 =
          RX10_TEMP25.
            dReg;
        
//#line 1669
final int RX10_TEMP27 =
          Program.
            searchPointInRegion1(
            RX10_TEMP26,
            RX10_TEMP24);
        
//#line 1671
final int RX10_TEMP28 =
          0;
        
//#line 1673
final boolean RX10_TEMP29 =
          RX10_TEMP27 <
          RX10_TEMP28;
        
//#line 1674
if (RX10_TEMP29) {
            
//#line 1677
java.
              lang.
              String RX10_TEMP30 =
              "Array access index out of bounds";
            
//#line 1678
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP30);
        }
        
//#line 1681
final Dist SX10_TEMP2 =
          RX10_TEMP25.
            dDist;
        
//#line 1683
final x10.
          lang.
          place RX10_TEMP31 =
          Program.
            getPlaceFromDist(
            SX10_TEMP2,
            RX10_TEMP27);
        
//#line 1685
final x10.
          lang.
          place RX10_TEMP33 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1687
final boolean RX10_TEMP34 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP31,RX10_TEMP33))/* } */;
        
//#line 1688
if (RX10_TEMP34) {
            
//#line 1691
java.
              lang.
              String RX10_TEMP32 =
              "Bad place access for array X10_TEMP12";
            
//#line 1692
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP32);
        }
        
//#line 1696
final DOUBLEArray RX10_TEMP35 =
          X10_TEMP12.
            contents;
        
//#line 1698
final double X10_TEMP15 =
          (Program.
             DOUBLEGetValue(
             RX10_TEMP35,
             RX10_TEMP27));
        
//#line 1700
final double X10_TEMP16 =
          (1000);
        
//#line 1702
final double X10_TEMP17 =
          (X10_TEMP15 /
             X10_TEMP16);
        
//#line 1704
final Point1 RX10_TEMP36 =
          new Point1(
          X10_TEMP1);
        
//#line 1706
final Dist1 RX10_TEMP37 =
          X10_TEMP12.
            distValue;
        
//#line 1708
final Region1 RX10_TEMP38 =
          RX10_TEMP37.
            dReg;
        
//#line 1710
final int RX10_TEMP39 =
          Program.
            searchPointInRegion1(
            RX10_TEMP38,
            RX10_TEMP36);
        
//#line 1712
final int RX10_TEMP40 =
          0;
        
//#line 1714
final boolean RX10_TEMP41 =
          RX10_TEMP39 <
          RX10_TEMP40;
        
//#line 1715
if (RX10_TEMP41) {
            
//#line 1718
java.
              lang.
              String RX10_TEMP42 =
              "Array index out of bounds";
            
//#line 1719
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP42);
        }
        
//#line 1722
final Dist SX10_TEMP3 =
          RX10_TEMP37.
            dDist;
        
//#line 1724
final x10.
          lang.
          place RX10_TEMP43 =
          Program.
            getPlaceFromDist(
            SX10_TEMP3,
            RX10_TEMP39);
        
//#line 1726
final x10.
          lang.
          place RX10_TEMP45 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1728
final boolean RX10_TEMP46 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP43,RX10_TEMP45))/* } */;
        
//#line 1729
if (RX10_TEMP46) {
            
//#line 1732
java.
              lang.
              String RX10_TEMP44 =
              "Bad place access for array X10_TEMP12";
            
//#line 1733
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP44);
        }
        
//#line 1737
final DOUBLEArray RX10_TEMP47 =
          X10_TEMP12.
            contents;
        
//#line 1738
Program.
                        DOUBLESetValue(
                        RX10_TEMP47,
                        RX10_TEMP39,
                        X10_TEMP17);
        
//#line 1740
final doubleRefArray1 X10_TEMP18 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 1742
final doubleRefArray1 X10_TEMP20 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 1744
final Point1 RX10_TEMP48 =
          new Point1(
          X10_TEMP1);
        
//#line 1746
final Dist1 RX10_TEMP49 =
          X10_TEMP18.
            distValue;
        
//#line 1748
final Region1 RX10_TEMP50 =
          RX10_TEMP49.
            dReg;
        
//#line 1750
final int RX10_TEMP51 =
          Program.
            searchPointInRegion1(
            RX10_TEMP50,
            RX10_TEMP48);
        
//#line 1752
final int RX10_TEMP52 =
          0;
        
//#line 1754
final boolean RX10_TEMP53 =
          RX10_TEMP51 <
          RX10_TEMP52;
        
//#line 1755
if (RX10_TEMP53) {
            
//#line 1758
java.
              lang.
              String RX10_TEMP54 =
              "Array access index out of bounds";
            
//#line 1759
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP54);
        }
        
//#line 1762
final Dist SX10_TEMP4 =
          RX10_TEMP49.
            dDist;
        
//#line 1764
final x10.
          lang.
          place RX10_TEMP55 =
          Program.
            getPlaceFromDist(
            SX10_TEMP4,
            RX10_TEMP51);
        
//#line 1766
final x10.
          lang.
          place RX10_TEMP57 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1768
final boolean RX10_TEMP58 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP55,RX10_TEMP57))/* } */;
        
//#line 1769
if (RX10_TEMP58) {
            
//#line 1772
java.
              lang.
              String RX10_TEMP56 =
              "Bad place access for array X10_TEMP18";
            
//#line 1773
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP56);
        }
        
//#line 1777
final DOUBLEArray RX10_TEMP59 =
          X10_TEMP18.
            contents;
        
//#line 1779
final double X10_TEMP23 =
          (Program.
             DOUBLEGetValue(
             RX10_TEMP59,
             RX10_TEMP51));
        
//#line 1781
final Point1 RX10_TEMP60 =
          new Point1(
          X10_TEMP1);
        
//#line 1783
final Dist1 RX10_TEMP61 =
          X10_TEMP20.
            distValue;
        
//#line 1785
final Region1 RX10_TEMP62 =
          RX10_TEMP61.
            dReg;
        
//#line 1787
final int RX10_TEMP63 =
          Program.
            searchPointInRegion1(
            RX10_TEMP62,
            RX10_TEMP60);
        
//#line 1789
final int RX10_TEMP64 =
          0;
        
//#line 1791
final boolean RX10_TEMP65 =
          RX10_TEMP63 <
          RX10_TEMP64;
        
//#line 1792
if (RX10_TEMP65) {
            
//#line 1795
java.
              lang.
              String RX10_TEMP66 =
              "Array access index out of bounds";
            
//#line 1796
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP66);
        }
        
//#line 1799
final Dist SX10_TEMP5 =
          RX10_TEMP61.
            dDist;
        
//#line 1801
final x10.
          lang.
          place RX10_TEMP67 =
          Program.
            getPlaceFromDist(
            SX10_TEMP5,
            RX10_TEMP63);
        
//#line 1803
final x10.
          lang.
          place RX10_TEMP69 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1805
final boolean RX10_TEMP70 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP67,RX10_TEMP69))/* } */;
        
//#line 1806
if (RX10_TEMP70) {
            
//#line 1809
java.
              lang.
              String RX10_TEMP68 =
              "Bad place access for array X10_TEMP20";
            
//#line 1810
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP68);
        }
        
//#line 1814
final DOUBLEArray RX10_TEMP71 =
          X10_TEMP20.
            contents;
        
//#line 1816
final double X10_TEMP24 =
          (Program.
             DOUBLEGetValue(
             RX10_TEMP71,
             RX10_TEMP63));
        
//#line 1818
final double X10_TEMP25 =
          (X10_TEMP23 +
             X10_TEMP24);
        
//#line 1820
final Point1 RX10_TEMP72 =
          new Point1(
          X10_TEMP1);
        
//#line 1822
final Dist1 RX10_TEMP73 =
          X10_TEMP18.
            distValue;
        
//#line 1824
final Region1 RX10_TEMP74 =
          RX10_TEMP73.
            dReg;
        
//#line 1826
final int RX10_TEMP75 =
          Program.
            searchPointInRegion1(
            RX10_TEMP74,
            RX10_TEMP72);
        
//#line 1828
final int RX10_TEMP76 =
          0;
        
//#line 1830
final boolean RX10_TEMP77 =
          RX10_TEMP75 <
          RX10_TEMP76;
        
//#line 1831
if (RX10_TEMP77) {
            
//#line 1834
java.
              lang.
              String RX10_TEMP78 =
              "Array index out of bounds";
            
//#line 1835
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP78);
        }
        
//#line 1838
final Dist SX10_TEMP6 =
          RX10_TEMP73.
            dDist;
        
//#line 1840
final x10.
          lang.
          place RX10_TEMP79 =
          Program.
            getPlaceFromDist(
            SX10_TEMP6,
            RX10_TEMP75);
        
//#line 1842
final x10.
          lang.
          place RX10_TEMP81 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1844
final boolean RX10_TEMP82 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP79,RX10_TEMP81))/* } */;
        
//#line 1845
if (RX10_TEMP82) {
            
//#line 1848
java.
              lang.
              String RX10_TEMP80 =
              "Bad place access for array X10_TEMP18";
            
//#line 1849
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP80);
        }
        
//#line 1853
final DOUBLEArray RX10_TEMP83 =
          X10_TEMP18.
            contents;
        
//#line 1854
Program.
                        DOUBLESetValue(
                        RX10_TEMP83,
                        RX10_TEMP75,
                        X10_TEMP25);
    }
    
    
//#line 1856
public static double
                    Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1858
int X10_TEMP1 =
          n;
        
//#line 1860
final doubleRefArray1 X10_TEMP2 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 1862
final Point1 RX10_TEMP0 =
          new Point1(
          X10_TEMP1);
        
//#line 1864
final Dist1 RX10_TEMP1 =
          X10_TEMP2.
            distValue;
        
//#line 1866
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 1868
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 1870
final int RX10_TEMP4 =
          0;
        
//#line 1872
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 1873
if (RX10_TEMP5) {
            
//#line 1876
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 1877
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 1880
final Dist SX10_TEMP0 =
          RX10_TEMP1.
            dDist;
        
//#line 1882
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist(
            SX10_TEMP0,
            RX10_TEMP3);
        
//#line 1884
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1886
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 1887
if (RX10_TEMP10) {
            
//#line 1890
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP2";
            
//#line 1891
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 1895
final DOUBLEArray RX10_TEMP11 =
          X10_TEMP2.
            contents;
        
//#line 1897
final double X10_TEMP5 =
          (Program.
             DOUBLEGetValue(
             RX10_TEMP11,
             RX10_TEMP3));
        
//#line 1898
return X10_TEMP5;
    }
    
    
//#line 1900
public static void
                    Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1902
int X10_TEMP1 =
          n;
        
//#line 1904
final doubleRefArray1 X10_TEMP2 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 1906
final double X10_TEMP6 =
          (0);
        
//#line 1908
final double X10_TEMP7 =
          (X10_TEMP6);
        
//#line 1910
final Point1 RX10_TEMP0 =
          new Point1(
          X10_TEMP1);
        
//#line 1912
final Dist1 RX10_TEMP1 =
          X10_TEMP2.
            distValue;
        
//#line 1914
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 1916
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 1918
final int RX10_TEMP4 =
          0;
        
//#line 1920
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 1921
if (RX10_TEMP5) {
            
//#line 1924
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 1925
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 1928
final Dist SX10_TEMP0 =
          RX10_TEMP1.
            dDist;
        
//#line 1930
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist(
            SX10_TEMP0,
            RX10_TEMP3);
        
//#line 1932
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1934
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 1935
if (RX10_TEMP10) {
            
//#line 1938
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP2";
            
//#line 1939
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 1943
final DOUBLEArray RX10_TEMP11 =
          X10_TEMP2.
            contents;
        
//#line 1944
Program.
                        DOUBLESetValue(
                        RX10_TEMP11,
                        RX10_TEMP3,
                        X10_TEMP7);
        
//#line 1946
final doubleRefArray1 X10_TEMP8 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 1948
final double X10_TEMP12 =
          (0);
        
//#line 1950
final double X10_TEMP13 =
          (X10_TEMP12);
        
//#line 1952
final Point1 RX10_TEMP12 =
          new Point1(
          X10_TEMP1);
        
//#line 1954
final Dist1 RX10_TEMP13 =
          X10_TEMP8.
            distValue;
        
//#line 1956
final Region1 RX10_TEMP14 =
          RX10_TEMP13.
            dReg;
        
//#line 1958
final int RX10_TEMP15 =
          Program.
            searchPointInRegion1(
            RX10_TEMP14,
            RX10_TEMP12);
        
//#line 1960
final int RX10_TEMP16 =
          0;
        
//#line 1962
final boolean RX10_TEMP17 =
          RX10_TEMP15 <
          RX10_TEMP16;
        
//#line 1963
if (RX10_TEMP17) {
            
//#line 1966
java.
              lang.
              String RX10_TEMP18 =
              "Array index out of bounds";
            
//#line 1967
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP18);
        }
        
//#line 1970
final Dist SX10_TEMP1 =
          RX10_TEMP13.
            dDist;
        
//#line 1972
final x10.
          lang.
          place RX10_TEMP19 =
          Program.
            getPlaceFromDist(
            SX10_TEMP1,
            RX10_TEMP15);
        
//#line 1974
final x10.
          lang.
          place RX10_TEMP21 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1976
final boolean RX10_TEMP22 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
        
//#line 1977
if (RX10_TEMP22) {
            
//#line 1980
java.
              lang.
              String RX10_TEMP20 =
              "Bad place access for array X10_TEMP8";
            
//#line 1981
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP20);
        }
        
//#line 1985
final DOUBLEArray RX10_TEMP23 =
          X10_TEMP8.
            contents;
        
//#line 1986
Program.
                        DOUBLESetValue(
                        RX10_TEMP23,
                        RX10_TEMP15,
                        X10_TEMP13);
        
//#line 1988
final doubleRefArray1 X10_TEMP14 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 1990
final double X10_TEMP18 =
          (0);
        
//#line 1992
final double X10_TEMP19 =
          (X10_TEMP18);
        
//#line 1994
final Point1 RX10_TEMP24 =
          new Point1(
          X10_TEMP1);
        
//#line 1996
final Dist1 RX10_TEMP25 =
          X10_TEMP14.
            distValue;
        
//#line 1998
final Region1 RX10_TEMP26 =
          RX10_TEMP25.
            dReg;
        
//#line 2000
final int RX10_TEMP27 =
          Program.
            searchPointInRegion1(
            RX10_TEMP26,
            RX10_TEMP24);
        
//#line 2002
final int RX10_TEMP28 =
          0;
        
//#line 2004
final boolean RX10_TEMP29 =
          RX10_TEMP27 <
          RX10_TEMP28;
        
//#line 2005
if (RX10_TEMP29) {
            
//#line 2008
java.
              lang.
              String RX10_TEMP30 =
              "Array index out of bounds";
            
//#line 2009
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP30);
        }
        
//#line 2012
final Dist SX10_TEMP2 =
          RX10_TEMP25.
            dDist;
        
//#line 2014
final x10.
          lang.
          place RX10_TEMP31 =
          Program.
            getPlaceFromDist(
            SX10_TEMP2,
            RX10_TEMP27);
        
//#line 2016
final x10.
          lang.
          place RX10_TEMP33 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2018
final boolean RX10_TEMP34 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP31,RX10_TEMP33))/* } */;
        
//#line 2019
if (RX10_TEMP34) {
            
//#line 2022
java.
              lang.
              String RX10_TEMP32 =
              "Bad place access for array X10_TEMP14";
            
//#line 2023
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP32);
        }
        
//#line 2027
final DOUBLEArray RX10_TEMP35 =
          X10_TEMP14.
            contents;
        
//#line 2028
Program.
                        DOUBLESetValue(
                        RX10_TEMP35,
                        RX10_TEMP27,
                        X10_TEMP19);
    }
    
    
//#line 2030
public static void
                    Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 2032
int i =
          (0);
        
//#line 2034
boolean X10_TEMP4 =
          i <
          _Timer_max_counters;
        
//#line 2035
while (X10_TEMP4) {
            
//#line 2037
Program.
                            Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 2039
final int X10_TEMP6 =
              (i);
            
//#line 2041
final int X10_TEMP7 =
              1;
            
//#line 2043
i =
              i +
                X10_TEMP7;
            
//#line 2045
X10_TEMP4 =
              i <
                _Timer_max_counters;
        }
    }
    
    
//#line 2048
public static int
                    constantSearchRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 2050
final int zero =
          0;
        
//#line 2052
final int one =
          1;
        
//#line 2054
final int dim0 =
          r.
            dim0;
        
//#line 2056
final int low0 =
          r.
            low0;
        
//#line 2058
final int high0 =
          low0 +
          dim0;
        
//#line 2060
int pt0 =
          target.
            f0;
        
//#line 2062
final boolean lbound0 =
          pt0 <
          low0;
        
//#line 2064
final boolean hbound0 =
          pt0 >=
          high0;
        
//#line 2066
final int dim1 =
          1;
        
//#line 2068
boolean outRegion =
          false;
        
//#line 2070
outRegion =
          (outRegion ||
             lbound0);
        
//#line 2072
outRegion =
          (outRegion ||
             hbound0);
        
//#line 2073
if (outRegion) {
            
//#line 2076
int notFound =
              0;
            
//#line 2078
notFound =
              notFound -
                one;
            
//#line 2079
return notFound;
        }
        
//#line 2082
final int stride1 =
          1;
        
//#line 2084
final int stride0 =
          stride1 *
          dim1;
        
//#line 2086
pt0 =
          pt0 -
            low0;
        
//#line 2088
final int offset0 =
          stride0 *
          pt0;
        
//#line 2090
int found =
          0;
        
//#line 2092
found =
          found +
            offset0;
        
//#line 2093
return found;
    }
    
    
//#line 2095
public static Dist1
                    restrictDist1(
                    final Dist1 d,
                    final x10.
                      lang.
                      place p) {
        
//#line 2097
final Region1 dReg =
          d.
            dReg;
        
//#line 2099
final x10.
          lang.
          GenericReferenceArray dArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((dReg.
                pointArray));
        
//#line 2101
int numPoints =
          0;
        
//#line 2103
final int zero =
          0;
        
//#line 2105
final int one =
          1;
        
//#line 2107
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2108
/* template:forloop-mult { */{
        x10.lang.region __var21__ = (x10.lang.region) dArray.
                                                        distribution.
                                                        region;
        if (__var21__.size() > 0 && (__var21__ instanceof x10.array.MultiDimRegion || __var21__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var22__ = __var21__.rank(0).low(), __var23__ = __var21__.rank(0).high(); __var22__ <= __var23__; __var22__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var22__;
        /* } */
        /* } */
{
            
//#line 2110
final Dist SX10_TEMP0 =
              d.
                dDist;
            
//#line 2112
final x10.
              lang.
              place dP =
              Program.
                getPlaceFromDist(
                SX10_TEMP0,
                i);
            
//#line 2114
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
            
//#line 2115
if (cond) {
                
//#line 2118
numPoints =
                  numPoints +
                    one;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var2____ = (__var21__).iterator(); __var2____.hasNext(); ) {
        	final  x10.
          lang.
          point __var2__ = (x10.
          lang.
          point) __var2____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
            
//#line 2110
final Dist SX10_TEMP0 =
              d.
                dDist;
            
//#line 2112
final x10.
              lang.
              place dP =
              Program.
                getPlaceFromDist(
                SX10_TEMP0,
                i);
            
//#line 2114
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
            
//#line 2115
if (cond) {
                
//#line 2118
numPoints =
                  numPoints +
                    one;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2122
final int rSize =
          numPoints -
          one;
        
//#line 2124
final x10.
          lang.
          region tempReg =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              rSize));
        
//#line 2126
final Dist tempDist =
          new Dist(
          tempReg,
          h);
        
//#line 2128
final Dist dpdist =
          new Dist(
          tempReg,
          p);
        
//#line 2130
final INTArray tempArray =
          new INTArray(
          tempDist);
        
//#line 2132
numPoints =
          0;
        
//#line 2133
/* template:forloop-mult { */{
        x10.lang.region __var24__ = (x10.lang.region) dArray.
                                                        distribution.
                                                        region;
        if (__var24__.size() > 0 && (__var24__ instanceof x10.array.MultiDimRegion || __var24__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var25__ = __var24__.rank(0).low(), __var26__ = __var24__.rank(0).high(); __var25__ <= __var26__; __var25__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var25__;
        /* } */
        /* } */
{
            
//#line 2135
final Dist SX10_TEMP1 =
              d.
                dDist;
            
//#line 2137
final x10.
              lang.
              place dP =
              Program.
                getPlaceFromDist(
                SX10_TEMP1,
                i);
            
//#line 2139
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
            
//#line 2140
if (cond) {
                
//#line 2142
Program.
                                INTSetValue(
                                tempArray,
                                i,
                                i);
                
//#line 2144
numPoints =
                  numPoints +
                    one;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var3____ = (__var24__).iterator(); __var3____.hasNext(); ) {
        	final  x10.
          lang.
          point __var3__ = (x10.
          lang.
          point) __var3____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
            
//#line 2135
final Dist SX10_TEMP1 =
              d.
                dDist;
            
//#line 2137
final x10.
              lang.
              place dP =
              Program.
                getPlaceFromDist(
                SX10_TEMP1,
                i);
            
//#line 2139
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
            
//#line 2140
if (cond) {
                
//#line 2142
Program.
                                INTSetValue(
                                tempArray,
                                i,
                                i);
                
//#line 2144
numPoints =
                  numPoints +
                    one;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2148
final x10.
          lang.
          GenericReferenceArray pointArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(tempReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2150
final int index =
                    Program.
                      INTGetValue(
                      tempArray,
                      p);
                  
//#line 2152
final Point1 dpt =
                    /* template:parametric { */((Point1)(/* template:array_get { */((dArray).get(index))/* } */))/* } */;
                  
//#line 2153
return dpt;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2157
final Region1 dpReg =
          new Region1(
          pointArray);
        
//#line 2159
final Dist1 dpDist =
          new Dist1(
          dpReg,
          dpdist);
        
//#line 2160
return dpDist;
    }
    
    
//#line 2162
public static Dist1
                    getBlockCyclicDist1(
                    final Region1 r,
                    final int blockSize) {
        
//#line 2164
final int N =
          r.
            pointArray.
            region.
            size();
        
//#line 2166
final x10.
          lang.
          place fPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 2168
final Dist pointDist =
          Program.
            getCyclic(
            N,
            fPlace,
            blockSize);
        
//#line 2170
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 2171
return retDist;
    }
    
    
//#line 2173
public static int
                    comparePoint1(
                    final Point1 pt1,
                    final Point1 pt2) {
        
//#line 2175
final int zero =
          0;
        
//#line 2177
final int one =
          1;
        
//#line 2179
final int two =
          2;
        
//#line 2181
int point1 =
          0;
        
//#line 2183
int point2 =
          0;
        
//#line 2185
boolean lt =
          false;
        
//#line 2187
boolean gt =
          false;
        
//#line 2189
point1 =
          pt1.
            f0;
        
//#line 2191
point2 =
          pt2.
            f0;
        
//#line 2193
lt =
          point1 <
            point2;
        
//#line 2195
gt =
          point1 >
            point2;
        
//#line 2196
if (lt) {
            
//#line 2198
return one;
        }
        
//#line 2200
if (gt) {
            
//#line 2202
return two;
        }
        
//#line 2204
return zero;
    }
    
    
//#line 2206
public static int
                    binarySearchRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 2208
final x10.
          lang.
          GenericReferenceArray pointArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((r.
                pointArray));
        
//#line 2210
int start =
          0;
        
//#line 2212
int end =
          r.
            pointArray.
            region.
            size();
        
//#line 2214
final int zero =
          0;
        
//#line 2216
final int one =
          1;
        
//#line 2218
final int two =
          2;
        
//#line 2220
end =
          end -
            one;
        
//#line 2222
int result =
          zero -
          one;
        
//#line 2224
boolean notDone =
          start <=
          end;
        
//#line 2225
while (notDone) {
            
//#line 2228
int mid =
              start +
              end;
            
//#line 2230
mid =
              mid /
                two;
            
//#line 2232
final Point1 temp =
              /* template:parametric { */((Point1)(/* template:array_get { */((pointArray).get(mid))/* } */))/* } */;
            
//#line 2234
final int pointCompare =
              Program.
                comparePoint1(
                target,
                temp);
            
//#line 2236
final boolean eq =
              pointCompare ==
              zero;
            
//#line 2238
final boolean lt =
              pointCompare ==
              one;
            
//#line 2239
if (eq) {
                
//#line 2241
return mid;
            } else {
                
//#line 2245
if (lt) {
                    
//#line 2248
end =
                      mid -
                        one;
                } else {
                    
//#line 2253
start =
                      mid +
                        one;
                }
            }
            
//#line 2257
notDone =
              start <=
                end;
        }
        
//#line 2259
return result;
    }
    
    
//#line 2261
public static int
                    searchPointInRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 2263
final boolean regType =
          r.
            regType;
        
//#line 2264
if (regType) {
            
//#line 2267
final int constantSearch =
              Program.
                constantSearchRegion1(
                r,
                target);
            
//#line 2268
return constantSearch;
        }
        
//#line 2271
final int binarySearch =
          Program.
            binarySearchRegion1(
            r,
            target);
        
//#line 2272
return binarySearch;
    }
    
    
//#line 2274
public static Dist1
                    getBlockDist1(
                    final Region1 r) {
        
//#line 2276
final int R =
          r.
            pointArray.
            region.
            size();
        
//#line 2278
final int N =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2280
final int q =
          R %
          N;
        
//#line 2282
final int p =
          R /
          N;
        
//#line 2284
final int one =
          1;
        
//#line 2286
final int zero =
          0;
        
//#line 2288
int blockSize =
          p +
          one;
        
//#line 2290
int arraySize =
          q *
          blockSize;
        
//#line 2292
int offset =
          0;
        
//#line 2294
x10.
          lang.
          place initPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 2296
Dist pointDist1 =
          Program.
            getCyclic(
            arraySize,
            initPlace,
            blockSize);
        
//#line 2298
int remainingPlaces =
          N -
          q;
        
//#line 2300
final boolean cond =
          remainingPlaces ==
          zero;
        
//#line 2301
if (cond) {
            
//#line 2304
final Dist1 retDist =
              new Dist1(
              r,
              pointDist1);
            
//#line 2305
return retDist;
        }
        
//#line 2308
offset =
          arraySize;
        
//#line 2310
blockSize =
          p;
        
//#line 2312
arraySize =
          remainingPlaces *
            blockSize;
        
//#line 2314
initPlace =
          x10.
            lang.
            place.
            places(
            q);
        
//#line 2316
int chunk =
          blockSize;
        
//#line 2318
final boolean ifCond =
          blockSize >
          arraySize;
        
//#line 2319
if (ifCond) {
            
//#line 2322
chunk =
              arraySize;
        }
        
//#line 2325
int index =
          offset;
        
//#line 2327
int dSize =
          index +
          chunk;
        
//#line 2329
dSize =
          dSize -
            one;
        
//#line 2331
pointDist1 =
          new Dist(
            pointDist1,
            index,
            dSize,
            initPlace);
        
//#line 2333
index =
          index +
            chunk;
        
//#line 2335
arraySize =
          arraySize -
            chunk;
        
//#line 2337
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 2339
boolean whileCond =
          arraySize !=
          zero;
        
//#line 2340
while (whileCond) {
            
//#line 2343
final boolean tailCond =
              chunk >
              arraySize;
            
//#line 2344
if (tailCond) {
                
//#line 2347
dSize =
                  index +
                    arraySize;
                
//#line 2349
dSize =
                  dSize -
                    one;
                
//#line 2351
pointDist1 =
                  new Dist(
                    pointDist1,
                    index,
                    dSize,
                    pl);
                
//#line 2353
arraySize =
                  0;
            } else {
                
//#line 2358
dSize =
                  index +
                    chunk;
                
//#line 2360
dSize =
                  dSize -
                    one;
                
//#line 2362
pointDist1 =
                  new Dist(
                    pointDist1,
                    index,
                    dSize,
                    pl);
                
//#line 2364
index =
                  index +
                    chunk;
                
//#line 2366
arraySize =
                  arraySize -
                    chunk;
            }
            
//#line 2369
pl =
              pl.
                next();
            
//#line 2371
whileCond =
              arraySize !=
                zero;
        }
        
//#line 2374
final Dist1 retDist =
          new Dist1(
          r,
          pointDist1);
        
//#line 2375
return retDist;
    }
    
    
//#line 2377
public static Dist1
                    getUniqueDist(
                    ) {
        
//#line 2379
final int one =
          1;
        
//#line 2381
final int zero =
          0;
        
//#line 2383
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2385
final int rSize =
          maxPlaces -
          one;
        
//#line 2387
final x10.
          lang.
          region placeRegion =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              rSize));
        
//#line 2389
final x10.
          lang.
          GenericReferenceArray pointArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(placeRegion.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point __var4__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2389
final int i =
                    /* template:array_get { */((__var4__).get(0))/* } */;
                  
//#line 2391
final Point1 pt1 =
                    new Point1(
                    i);
                  
//#line 2392
return pt1;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2396
final Region1 reg =
          new Region1(
          pointArray,
          zero,
          maxPlaces);
        
//#line 2398
final Dist1 retDist =
          Program.
            getBlockCyclicDist1(
            reg,
            one);
        
//#line 2399
return retDist;
    }
    
    
//#line 2401
public static Dist1
                    getPlaceDist1(
                    final Region1 r,
                    final x10.
                      lang.
                      place p) {
        
//#line 2403
final int rSize =
          r.
            pointArray.
            region.
            size();
        
//#line 2405
final Dist pointDist =
          Program.
            getCyclic(
            rSize,
            p,
            rSize);
        
//#line 2407
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 2408
return retDist;
    }
    
    
//#line 2410
public static Dist
                    getCyclic(
                    final int arraySize,
                    final x10.
                      lang.
                      place initPlace,
                    final int blockSize) {
        
//#line 2412
final int zero =
          0;
        
//#line 2414
final int one =
          1;
        
//#line 2416
int N =
          arraySize;
        
//#line 2418
int chunk =
          blockSize;
        
//#line 2420
final boolean ifCond =
          blockSize >
          N;
        
//#line 2421
if (ifCond) {
            
//#line 2424
chunk =
              N;
        }
        
//#line 2427
int index =
          0;
        
//#line 2429
int dSize =
          index +
          chunk;
        
//#line 2431
dSize =
          dSize -
            one;
        
//#line 2433
final x10.
          lang.
          region pointReg =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              dSize));
        
//#line 2435
Dist pointDist =
          new Dist(
          pointReg,
          initPlace);
        
//#line 2437
index =
          index +
            chunk;
        
//#line 2439
N =
          N -
            chunk;
        
//#line 2441
x10.
          lang.
          place p =
          initPlace.
            next();
        
//#line 2443
boolean whileCond =
          N !=
          zero;
        
//#line 2444
while (whileCond) {
            
//#line 2447
final boolean tailCond =
              chunk >
              N;
            
//#line 2448
if (tailCond) {
                
//#line 2451
dSize =
                  index +
                    N;
                
//#line 2453
dSize =
                  dSize -
                    one;
                
//#line 2455
pointDist =
                  new Dist(
                    pointDist,
                    index,
                    dSize,
                    p);
                
//#line 2457
N =
                  0;
            } else {
                
//#line 2462
dSize =
                  index +
                    chunk;
                
//#line 2464
dSize =
                  dSize -
                    one;
                
//#line 2466
pointDist =
                  new Dist(
                    pointDist,
                    index,
                    dSize,
                    p);
                
//#line 2468
index =
                  index +
                    chunk;
                
//#line 2470
N =
                  N -
                    chunk;
            }
            
//#line 2473
p =
              p.
                next();
            
//#line 2475
whileCond =
              N !=
                zero;
        }
        
//#line 2477
return pointDist;
    }
    
    
//#line 2479
public static Region1
                    createNewRegion1R(
                    final int v1_0,
                    final int v1_1) {
        
//#line 2481
final int zero =
          0;
        
//#line 2483
final int one =
          1;
        
//#line 2485
boolean regType =
          true;
        
//#line 2487
final boolean tempBool1 =
          true;
        
//#line 2489
regType =
          regType &&
            tempBool1;
        
//#line 2491
final int l1 =
          v1_1 -
          v1_0;
        
//#line 2493
final int dim1 =
          l1 +
          one;
        
//#line 2495
final int stride1 =
          1;
        
//#line 2497
final int stride0 =
          stride1 *
          dim1;
        
//#line 2499
final int rSize =
          stride0 -
          one;
        
//#line 2501
final x10.
          lang.
          region regArr =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              rSize));
        
//#line 2503
final x10.
          lang.
          GenericReferenceArray ptArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(regArr.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point __var5__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2503
final int p =
                    /* template:array_get { */((__var5__).get(0))/* } */;
                  
//#line 2505
int f1 =
                    p /
                    stride1;
                  
//#line 2507
f1 =
                    f1 %
                      dim1;
                  
//#line 2509
f1 =
                    f1 +
                      v1_0;
                  
//#line 2511
final Point1 retPoint =
                    new Point1(
                    f1);
                  
//#line 2512
return retPoint;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2515
if (regType) {
            
//#line 2518
final Region1 retRegRegular =
              new Region1(
              ptArray,
              v1_0,
              dim1);
            
//#line 2519
return retRegRegular;
        }
        
//#line 2522
final Region1 retReg =
          new Region1(
          ptArray);
        
//#line 2523
return retReg;
    }
    
    
//#line 2528
public static x10.
                    lang.
                    GenericReferenceArray
                    createDist(
                    final x10.
                      lang.
                      region reg,
                    final x10.
                      lang.
                      place pl) {
        
//#line 2529
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(reg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2529
return pl;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2530
return placeArray;
    }
    
    
//#line 2534
public static x10.
                    lang.
                    GenericReferenceArray
                    extendDist(
                    final Dist d1,
                    final int x,
                    final int y,
                    final x10.
                      lang.
                      place pl) {
        
//#line 2536
final int one =
          1;
        
//#line 2538
final x10.
          lang.
          GenericReferenceArray d1Array =
          d1.
            placeArray;
        
//#line 2540
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                y)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2541
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dis,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2543
/* template:forloop { */
        for (java.util.Iterator p__ = (d1Array.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2545
final x10.
              lang.
              place tempPlace =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((d1Array).get(p))/* } */))/* } */;
            
//#line 2546
/* template:array_set { */(temp).set((tempPlace),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2549
int tail =
          x;
        
//#line 2550
boolean bool =
          (tail <=
             y);
        
//#line 2551
while (bool) {
            
//#line 2553
/* template:array_set { */(temp).set((pl),tail)/* } */;
            
//#line 2554
tail =
              tail +
                one;
            
//#line 2555
bool =
              ((tail <=
                  y));
        }
        
//#line 2557
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(x10.
                                                                                                                           lang.
                                                                                                                           dist.
                                                                                                                           factory.
                                                                                                                           constant(
                                                                                                                           x10.
                                                                                                                             lang.
                                                                                                                             region.
                                                                                                                             factory.
                                                                                                                             region(
                                                                                                                             x10.
                                                                                                                               lang.
                                                                                                                               region.
                                                                                                                               factory.
                                                                                                                               region(
                                                                                                                               0,
                                                                                                                               y)),
                                                                                                                           /* template:here { */x10.lang.Runtime.here()/* } */),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2559
final x10.
                    lang.
                    place tempPlace =
                    /* template:parametric { */((x10.
                    lang.
                    place)(/* template:array_get { */((temp).get(p))/* } */))/* } */;
                  
//#line 2560
return tempPlace;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2562
return placeArray;
    }
    
    
//#line 2565
public static x10.
                    lang.
                    place
                    getPlaceFromDist(
                    final Dist d,
                    final int index) {
        
//#line 2566
final x10.
          lang.
          GenericReferenceArray placeArray =
          d.
            placeArray;
        
//#line 2567
final x10.
          lang.
          place retPlace =
          /* template:parametric { */((x10.
          lang.
          place)(/* template:array_get { */((placeArray).get(index))/* } */))/* } */;
        
//#line 2568
return retPlace;
    }
    
    
//#line 2570
public static x10.
                    lang.
                    intArray
                    getCounts(
                    final Dist d) {
        
//#line 2571
final int one =
          1;
        
//#line 2572
final int zero =
          0;
        
//#line 2573
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2574
final int ub =
          maxPlaces -
          one;
        
//#line 2575
final x10.
          lang.
          region R =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              ub));
        
//#line 2577
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                ub)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2578
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2580
/* template:forloop { */
        for (java.util.Iterator p__ = (tempCounts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2581
/* template:array_set { */(tempCounts).set((zero),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2584
final x10.
          lang.
          GenericReferenceArray placeArray =
          d.
            placeArray;
        
//#line 2586
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2587
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
            
//#line 2588
final int index =
              pl.
                id;
            
//#line 2589
final int oldVal =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 2590
final int oldValPlusOne =
              oldVal +
              one;
            
//#line 2591
/* template:array_set { */(tempCounts).set((oldValPlusOne),index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2593
final x10.
          lang.
          intArray counts =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(R.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 2595
final int tempInt =
                    /* template:array_get { */((tempCounts).get(p))/* } */;
                  
//#line 2596
return tempInt;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 2598
return counts;
    }
    
    
//#line 2600
public static x10.
                    lang.
                    intArray
                    getRunningSum(
                    final Dist d) {
        
//#line 2602
final int one =
          1;
        
//#line 2603
final int zero =
          0;
        
//#line 2604
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2605
final int ub =
          maxPlaces -
          one;
        
//#line 2608
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                ub)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2609
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2611
final int count =
          d.
            placeArray.
            region.
            size();
        
//#line 2613
final x10.
          lang.
          GenericReferenceArray placeArray =
          d.
            placeArray;
        
//#line 2615
final x10.
          lang.
          region runReg =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              count));
        
//#line 2616
final x10.
          lang.
          dist runDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                count)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2617
final x10.
          lang.
          IntReferenceArray tempRunSum =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2619
/* template:forloop { */
        for (java.util.Iterator p__ = (tempCounts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2620
/* template:array_set { */(tempCounts).set((zero),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2623
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2624
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
            
//#line 2625
final int index =
              pl.
                id;
            
//#line 2626
final int temp =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 2627
/* template:array_set { */(tempRunSum).set((temp),p)/* } */;
            
//#line 2628
final int tempPlusOne =
              temp +
              one;
            
//#line 2629
/* template:array_set { */(tempCounts).set((tempPlusOne),index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2632
final x10.
          lang.
          intArray runSum =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runReg.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 2633
final int tempInt =
                    /* template:array_get { */((tempRunSum).get(p))/* } */;
                  
//#line 2634
return tempInt;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 2636
return runSum;
    }
    
    
//#line 2638
public static int
                    getLocalIndex(
                    final Dist myDist,
                    final int index) {
        
//#line 2639
final x10.
          lang.
          intArray runningSum =
          myDist.
            runningSum;
        
//#line 2640
final int retVal =
          /* template:array_get { */((runningSum).get(index))/* } */;
        
//#line 2641
return retVal;
    }
    
    
//#line 2645
public static int
                    getLocalIndex(
                    final Dist myDist,
                    final x10.
                      lang.
                      point index) {
        
//#line 2646
final x10.
          lang.
          intArray runningSum =
          myDist.
            runningSum;
        
//#line 2647
final int retVal =
          /* template:array_get { */((runningSum).get(index))/* } */;
        
//#line 2648
return retVal;
    }
    
    
//#line 2652
public static x10.
                    lang.
                    GenericReferenceArray
                    createINTArray(
                    final Dist distArray) {
        
//#line 2653
final int one =
          1;
        
//#line 2654
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2655
final int ub =
          maxPlaces -
          one;
        
//#line 2656
final x10.
          lang.
          region R =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              ub));
        
//#line 2658
final x10.
          lang.
          intArray counts =
          distArray.
            counts;
        
//#line 2660
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(R.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point __var6__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2660
final int p =
                    /* template:array_get { */((__var6__).get(0))/* } */;
                  
//#line 2661
final int count =
                    /* template:array_get { */((counts).get(p))/* } */;
                  
//#line 2662
final x10.
                    lang.
                    place pl =
                    x10.
                      lang.
                      place.
                      places(
                      p);
                  
//#line 2663
final INTStub is =
                    Program.
                      createINTStub(
                      pl,
                      count);
                  
//#line 2664
return is;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2665
return temp;
    }
    
    
//#line 2667
public static INTStub
                    createINTStub(
                    final x10.
                      lang.
                      place remotePlace,
                    final int count) {
        
//#line 2669
final int zero =
          0;
        
//#line 2670
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2671
final x10.
          lang.
          dist retDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                zero)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2673
final x10.
          lang.
          GenericReferenceArray retStub =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(retDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2675
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2676
/* template:Async { */(x10.lang.Runtime.asPlace(remotePlace)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 2677
final INTStub to =
                  new INTStub(
                  count);
                
//#line 2678
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2679
/* template:array_set { */(retStub).set((to),zero)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp27) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp27);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2684
final INTStub to =
          /* template:parametric { */((INTStub)(/* template:array_get { */((retStub).get(zero))/* } */))/* } */;
        
//#line 2685
return to;
    }
    
    
//#line 2687
public static x10.
                    lang.
                    IntReferenceArray
                    allocateLocalINTArray(
                    final int count) {
        
//#line 2689
final int one =
          1;
        
//#line 2690
final int sizeOfChunk =
          count -
          one;
        
//#line 2691
final x10.
          lang.
          dist localDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                sizeOfChunk)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2693
final x10.
          lang.
          IntReferenceArray temp =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(localDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2694
return temp;
    }
    
    
//#line 2696
public static int
                    INTGetValue(
                    final INTArray arr,
                    final int index) {
        
//#line 2697
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2698
final int placeIndex =
          pl.
            id;
        
//#line 2699
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2700
final INTStub indexStub =
          /* template:parametric { */((INTStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2701
final x10.
          lang.
          IntReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2702
final Dist distArray =
          arr.
            distArray;
        
//#line 2703
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2704
final int returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2705
return returnValue;
    }
    
    
//#line 2708
public static void
                    INTSetValue(
                    final INTArray arr,
                    final int index,
                    final int val) {
        
//#line 2709
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2710
final int placeIndex =
          pl.
            id;
        
//#line 2711
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2712
final INTStub indexStub =
          /* template:parametric { */((INTStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2713
final x10.
          lang.
          IntReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2714
final Dist distArray =
          arr.
            distArray;
        
//#line 2715
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2716
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2717
return;
    }
    
    
//#line 2719
public static int
                    INTGetValue(
                    final INTArray arr,
                    final x10.
                      lang.
                      point index) {
        
//#line 2720
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2721
final int placeIndex =
          pl.
            id;
        
//#line 2722
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2723
final INTStub indexStub =
          /* template:parametric { */((INTStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2724
final x10.
          lang.
          IntReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2725
final Dist distArray =
          arr.
            distArray;
        
//#line 2726
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2727
final int returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2728
return returnValue;
    }
    
    
//#line 2731
public static void
                    INTSetValue(
                    final INTArray arr,
                    final x10.
                      lang.
                      point index,
                    final int val) {
        
//#line 2732
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2733
final int placeIndex =
          pl.
            id;
        
//#line 2734
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2735
final INTStub indexStub =
          /* template:parametric { */((INTStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2736
final x10.
          lang.
          IntReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2737
final Dist distArray =
          arr.
            distArray;
        
//#line 2738
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2739
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2740
return;
    }
    
    
//#line 2743
public static x10.
                    lang.
                    GenericReferenceArray
                    createBOOLEANArray(
                    final Dist distArray) {
        
//#line 2744
final int one =
          1;
        
//#line 2745
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2746
final int ub =
          maxPlaces -
          one;
        
//#line 2747
final x10.
          lang.
          region R =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              ub));
        
//#line 2749
final x10.
          lang.
          intArray counts =
          distArray.
            counts;
        
//#line 2751
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(R.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point __var7__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2751
final int p =
                    /* template:array_get { */((__var7__).get(0))/* } */;
                  
//#line 2752
final int count =
                    /* template:array_get { */((counts).get(p))/* } */;
                  
//#line 2753
final x10.
                    lang.
                    place pl =
                    x10.
                      lang.
                      place.
                      places(
                      p);
                  
//#line 2754
final BOOLEANStub is =
                    Program.
                      createBOOLEANStub(
                      pl,
                      count);
                  
//#line 2755
return is;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2756
return temp;
    }
    
    
//#line 2758
public static BOOLEANStub
                    createBOOLEANStub(
                    final x10.
                      lang.
                      place remotePlace,
                    final int count) {
        
//#line 2760
final int zero =
          0;
        
//#line 2761
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2762
final x10.
          lang.
          dist retDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                zero)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2764
final x10.
          lang.
          GenericReferenceArray retStub =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(retDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2766
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2767
/* template:Async { */(x10.lang.Runtime.asPlace(remotePlace)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 2768
final BOOLEANStub to =
                  new BOOLEANStub(
                  count);
                
//#line 2769
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2770
/* template:array_set { */(retStub).set((to),zero)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp28) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp28);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2775
final BOOLEANStub to =
          /* template:parametric { */((BOOLEANStub)(/* template:array_get { */((retStub).get(zero))/* } */))/* } */;
        
//#line 2776
return to;
    }
    
    
//#line 2778
public static x10.
                    lang.
                    BooleanReferenceArray
                    allocateLocalBOOLEANArray(
                    final int count) {
        
//#line 2780
final int one =
          1;
        
//#line 2781
final int sizeOfChunk =
          count -
          one;
        
//#line 2782
final x10.
          lang.
          dist localDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                sizeOfChunk)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2784
final x10.
          lang.
          BooleanReferenceArray temp =
          (x10.
            lang.
            BooleanReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(localDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2785
return temp;
    }
    
    
//#line 2787
public static boolean
                    BOOLEANGetValue(
                    final BOOLEANArray arr,
                    final int index) {
        
//#line 2788
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2789
final int placeIndex =
          pl.
            id;
        
//#line 2790
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2791
final BOOLEANStub indexStub =
          /* template:parametric { */((BOOLEANStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2792
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2793
final Dist distArray =
          arr.
            distArray;
        
//#line 2794
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2795
final boolean returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2796
return returnValue;
    }
    
    
//#line 2799
public static void
                    BOOLEANSetValue(
                    final BOOLEANArray arr,
                    final int index,
                    final boolean val) {
        
//#line 2800
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2801
final int placeIndex =
          pl.
            id;
        
//#line 2802
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2803
final BOOLEANStub indexStub =
          /* template:parametric { */((BOOLEANStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2804
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2805
final Dist distArray =
          arr.
            distArray;
        
//#line 2806
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2807
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2808
return;
    }
    
    
//#line 2810
public static boolean
                    BOOLEANGetValue(
                    final BOOLEANArray arr,
                    final x10.
                      lang.
                      point index) {
        
//#line 2811
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2812
final int placeIndex =
          pl.
            id;
        
//#line 2813
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2814
final BOOLEANStub indexStub =
          /* template:parametric { */((BOOLEANStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2815
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2816
final Dist distArray =
          arr.
            distArray;
        
//#line 2817
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2818
final boolean returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2819
return returnValue;
    }
    
    
//#line 2822
public static void
                    BOOLEANSetValue(
                    final BOOLEANArray arr,
                    final x10.
                      lang.
                      point index,
                    final boolean val) {
        
//#line 2823
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2824
final int placeIndex =
          pl.
            id;
        
//#line 2825
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2826
final BOOLEANStub indexStub =
          /* template:parametric { */((BOOLEANStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2827
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2828
final Dist distArray =
          arr.
            distArray;
        
//#line 2829
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2830
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2831
return;
    }
    
    
//#line 2834
public static x10.
                    lang.
                    GenericReferenceArray
                    createDOUBLEArray(
                    final Dist distArray) {
        
//#line 2835
final int one =
          1;
        
//#line 2836
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 2837
final int ub =
          maxPlaces -
          one;
        
//#line 2838
final x10.
          lang.
          region R =
          x10.
            lang.
            region.
            factory.
            region(
            x10.
              lang.
              region.
              factory.
              region(
              0,
              ub));
        
//#line 2840
final x10.
          lang.
          intArray counts =
          distArray.
            counts;
        
//#line 2842
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(R.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point __var8__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 2842
final int p =
                    /* template:array_get { */((__var8__).get(0))/* } */;
                  
//#line 2843
final int count =
                    /* template:array_get { */((counts).get(p))/* } */;
                  
//#line 2844
final x10.
                    lang.
                    place pl =
                    x10.
                      lang.
                      place.
                      places(
                      p);
                  
//#line 2845
final DOUBLEStub is =
                    Program.
                      createDOUBLEStub(
                      pl,
                      count);
                  
//#line 2846
return is;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 2847
return temp;
    }
    
    
//#line 2849
public static DOUBLEStub
                    createDOUBLEStub(
                    final x10.
                      lang.
                      place remotePlace,
                    final int count) {
        
//#line 2851
final int zero =
          0;
        
//#line 2852
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2853
final x10.
          lang.
          dist retDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                zero)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2855
final x10.
          lang.
          GenericReferenceArray retStub =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(retDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2857
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2858
/* template:Async { */(x10.lang.Runtime.asPlace(remotePlace)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 2859
final DOUBLEStub to =
                  new DOUBLEStub(
                  count);
                
//#line 2860
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2861
/* template:array_set { */(retStub).set((to),zero)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp29) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp29);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2866
final DOUBLEStub to =
          /* template:parametric { */((DOUBLEStub)(/* template:array_get { */((retStub).get(zero))/* } */))/* } */;
        
//#line 2867
return to;
    }
    
    
//#line 2869
public static x10.
                    lang.
                    DoubleReferenceArray
                    allocateLocalDOUBLEArray(
                    final int count) {
        
//#line 2871
final int one =
          1;
        
//#line 2872
final int sizeOfChunk =
          count -
          one;
        
//#line 2873
final x10.
          lang.
          dist localDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                sizeOfChunk)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2875
final x10.
          lang.
          DoubleReferenceArray temp =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(localDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2876
return temp;
    }
    
    
//#line 2878
public static double
                    DOUBLEGetValue(
                    final DOUBLEArray arr,
                    final int index) {
        
//#line 2879
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2880
final int placeIndex =
          pl.
            id;
        
//#line 2881
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2882
final DOUBLEStub indexStub =
          /* template:parametric { */((DOUBLEStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2883
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2884
final Dist distArray =
          arr.
            distArray;
        
//#line 2885
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2886
final double returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2887
return returnValue;
    }
    
    
//#line 2890
public static void
                    DOUBLESetValue(
                    final DOUBLEArray arr,
                    final int index,
                    final double val) {
        
//#line 2891
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2892
final int placeIndex =
          pl.
            id;
        
//#line 2893
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2894
final DOUBLEStub indexStub =
          /* template:parametric { */((DOUBLEStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2895
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2896
final Dist distArray =
          arr.
            distArray;
        
//#line 2897
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2898
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2899
return;
    }
    
    
//#line 2901
public static double
                    DOUBLEGetValue(
                    final DOUBLEArray arr,
                    final x10.
                      lang.
                      point index) {
        
//#line 2902
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2903
final int placeIndex =
          pl.
            id;
        
//#line 2904
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2905
final DOUBLEStub indexStub =
          /* template:parametric { */((DOUBLEStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2906
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2907
final Dist distArray =
          arr.
            distArray;
        
//#line 2908
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2909
final double returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 2910
return returnValue;
    }
    
    
//#line 2913
public static void
                    DOUBLESetValue(
                    final DOUBLEArray arr,
                    final x10.
                      lang.
                      point index,
                    final double val) {
        
//#line 2914
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2915
final int placeIndex =
          pl.
            id;
        
//#line 2916
final x10.
          lang.
          GenericReferenceArray contents =
          arr.
            contents;
        
//#line 2917
final DOUBLEStub indexStub =
          /* template:parametric { */((DOUBLEStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 2918
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 2919
final Dist distArray =
          arr.
            distArray;
        
//#line 2920
final int localIndex =
          Program.
            getLocalIndex(
            distArray,
            index);
        
//#line 2921
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
        
//#line 2922
return;
    }
    
    
//#line 414
public Program() {
        
//#line 414
super();
    }
}

class INTStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2927
final public x10.
      lang.
      IntReferenceArray
      localArray;
    
    
//#line 2929
public INTStub(final int count) {
        
//#line 2929
super();
        
//#line 2930
localArray =
          Program.
            allocateLocalINTArray(
            count);
    }
}

class INTArray
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2936
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
//#line 2937
final public Dist
      distArray;
    
    
//#line 2939
public INTArray(final Dist distArray_) {
        
//#line 2939
super();
        
//#line 2940
distArray =
          distArray_;
        
//#line 2941
contents =
          Program.
            createINTArray(
            distArray);
    }
}

class BOOLEANStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2947
final public x10.
      lang.
      BooleanReferenceArray
      localArray;
    
    
//#line 2949
public BOOLEANStub(final int count) {
        
//#line 2949
super();
        
//#line 2950
localArray =
          Program.
            allocateLocalBOOLEANArray(
            count);
    }
}

class BOOLEANArray
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2956
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
//#line 2957
final public Dist
      distArray;
    
    
//#line 2959
public BOOLEANArray(final Dist distArray_) {
        
//#line 2959
super();
        
//#line 2960
distArray =
          distArray_;
        
//#line 2961
contents =
          Program.
            createBOOLEANArray(
            distArray);
    }
}

class DOUBLEStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2967
final public x10.
      lang.
      DoubleReferenceArray
      localArray;
    
    
//#line 2969
public DOUBLEStub(final int count) {
        
//#line 2969
super();
        
//#line 2970
localArray =
          Program.
            allocateLocalDOUBLEArray(
            count);
    }
}

class DOUBLEArray
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2976
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
//#line 2977
final public Dist
      distArray;
    
    
//#line 2979
public DOUBLEArray(final Dist distArray_) {
        
//#line 2979
super();
        
//#line 2980
distArray =
          distArray_;
        
//#line 2981
contents =
          Program.
            createDOUBLEArray(
            distArray);
    }
}

class Dist
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2988
final public x10.
      lang.
      GenericReferenceArray
      placeArray;
    
//#line 2989
final public x10.
      lang.
      intArray
      counts;
    
//#line 2990
final public x10.
      lang.
      intArray
      runningSum;
    
    
//#line 2992
public Dist(final x10.
                                lang.
                                region reg,
                              final x10.
                                lang.
                                place pl) {
        
//#line 2992
super();
        
//#line 2993
placeArray =
          Program.
            createDist(
            reg,
            pl);
        
//#line 2994
counts =
          Program.
            getCounts(
            this);
        
//#line 2995
runningSum =
          (x10.
            lang.
            intArray)
            ((Program.
                getRunningSum(
                this)));
    }
    
    
//#line 2998
public Dist(final Dist d1,
                              final int x,
                              final int y,
                              final x10.
                                lang.
                                place pl) {
        
//#line 2998
super();
        
//#line 2999
placeArray =
          Program.
            extendDist(
            d1,
            x,
            y,
            pl);
        
//#line 3000
counts =
          Program.
            getCounts(
            this);
        
//#line 3001
runningSum =
          (x10.
            lang.
            intArray)
            ((Program.
                getRunningSum(
                this)));
    }
}
