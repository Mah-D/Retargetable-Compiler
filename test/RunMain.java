import x10.lang.*;

public class RunMain
extends x10.
  lang.
  Object
{
    
    
//#line 6
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
        
//#line 7
Program.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 3
public RunMain() {
        
//#line 3
super();
    }
}

class Program
extends x10.
  lang.
  Object
{
    
//#line 11
final public static int
      MAX_PLACES =
      1;
    
//#line 13
final public static Dist1
      UniqueDistribution =
      Program.
        getUniqueDist();
    
//#line 16
final public static int
      _IDEATest_array_rows =
      Program.
        _IDEATest_array_rows_init();
    
//#line 17
final public static long
      _Random_multiplier =
      Program.
        _Random_multiplier_init();
    
//#line 18
final public static long
      _Random_addend =
      Program.
        _Random_addend_init();
    
//#line 19
final public static long
      _Random_mask =
      Program.
        _Random_mask_init();
    
//#line 20
final public static int
      _Timer_max_counters =
      Program.
        _Timer_max_counters_init();
    
    
//#line 24
public static int
                  prev(
                  int x) {
        
//#line 24
if (x ==
                          0) {
            
//#line 24
x =
              Program.
                MAX_PLACES -
                1;
        } else {
            
//#line 24
x =
              x -
                1;
        }
        
//#line 24
return x;
    }
    
    
//#line 25
public static void
                  runMain(
                  ) {
        
//#line 28
Timer tmr =
          new Timer(
          );
        
//#line 31
int count =
          0;
        
//#line 33
Program.
                      Timer_start(
                      tmr,
                      count);
        
//#line 35
final IDEATest X10_TEMP4 =
          new IDEATest(
          );
        
//#line 37
Program.
                      IDEATest_run(
                      X10_TEMP4);
        
//#line 38
Program.
                      Timer_stop(
                      tmr,
                      count);
        
//#line 40
final java.
          lang.
          String X10_TEMP7 =
          "Wall-clock time for crypt: ";
        
//#line 43
final double X10_TEMP8 =
          Program.
            Timer_readTimer(
            tmr,
            count);
        
//#line 46
final java.
          lang.
          String X10_TEMP9 =
          X10_TEMP7 +
        X10_TEMP8;
        
//#line 49
final java.
          lang.
          String X10_TEMP10 =
          " secs";
        
//#line 52
final java.
          lang.
          String X10_TEMP12 =
          X10_TEMP9 +
        X10_TEMP10;
        
//#line 54
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 56
public static int
                  _IDEATest_array_rows_init(
                  ) {
        
//#line 59
final int X10_TEMP2 =
          32000;
        
//#line 61
return X10_TEMP2;
    }
    
    
//#line 63
public static void
                  IDEATest_run(
                  final IDEATest X10_TEMP0) {
        
//#line 65
Program.
                      IDEATest_kernel(
                      X10_TEMP0);
        
//#line 66
Program.
                      IDEATest_validate(
                      X10_TEMP0);
    }
    
    
//#line 68
public static void
                  IDEATest_kernel(
                  final IDEATest X10_TEMP0) {
        
//#line 70
Program.
                      IDEATest_Do(
                      X10_TEMP0);
    }
    
    
//#line 72
public static void
                  IDEATest_validate(
                  final IDEATest X10_TEMP0) {
        
//#line 75
final byteRefArray1 p1 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1;
        
//#line 78
final byteRefArray1 c1 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.crypt1;
        
//#line 81
final byteRefArray1 p2 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain2;
        
//#line 84
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 87
final byteRefArray1 X10_TEMP4 =
              /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1;
            
//#line 90
final Dist1 RX10_TEMP0 =
              X10_TEMP4.
                distValue;
            
//#line 93
final Dist1 X10_TEMP6 =
              RX10_TEMP0;
            
//#line 96
final Region1 RX10_TEMP2 =
              X10_TEMP6.
                dReg;
            
//#line 99
final int RX10_TEMP5 =
              1;
            
//#line 102
int RX10_TEMP3 =
              RX10_TEMP2.
                regSize;
            
//#line 105
RX10_TEMP3 =
              RX10_TEMP3 -
                RX10_TEMP5;
            
//#line 108
final int RX10_TEMP4 =
              RX10_TEMP3 +
              1;
            
//#line 110
for (
//#line 110
int RX10_TEMP1 =
                                0;
                              RX10_TEMP1 <
                                RX10_TEMP4;
                              
//#line 110
RX10_TEMP1++) {
                
//#line 113
final int RX10_TEMP6 =
                  RX10_TEMP1;
                
//#line 116
final Point1 pt =
                  Program.
                    regionOrdinalPoint1(
                    RX10_TEMP2,
                    RX10_TEMP6);
                
//#line 119
final Region1 RX10_TEMP7 =
                  X10_TEMP6.
                    dReg;
                
//#line 122
final int RX10_TEMP8 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP7,
                    pt);
                
//#line 125
final int RX10_TEMP9 =
                  0;
                
//#line 128
final boolean RX10_TEMP10 =
                  RX10_TEMP8 <
                  RX10_TEMP9;
                
//#line 130
if (RX10_TEMP10) {
                    
//#line 133
final java.
                      lang.
                      String RX10_TEMP11 =
                      "Point pt not found in the distribution X10_TEMP6.";
                    
//#line 135
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP11);
                }
                
//#line 139
final x10.
                  lang.
                  place RX10_TEMP12 =
                  Program.
                    getPlaceFromDist1(
                    X10_TEMP6,
                    RX10_TEMP8);
                
//#line 142
final x10.
                  lang.
                  place X10_TEMP7 =
                  RX10_TEMP12;
                
//#line 145
final T1 utmp1 =
                  new T1(
                  pt,
                  p2,
                  c1,
                  p1);
                
//#line 147
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP7)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 149
Program.
                                   thread1(
                                   utmp1);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 154
public static void
                   IDEATest_Do(
                   final IDEATest X10_TEMP0) {
        
//#line 157
final byteRefArray1 p1 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1;
        
//#line 160
final byteRefArray1 c1 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.crypt1;
        
//#line 163
final byteRefArray1 p2 =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain2;
        
//#line 166
final intValArray1 fzr =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ZR;
        
//#line 169
final intValArray1 fdkr =
          /* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.DKR;
        
//#line 172
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 175
final Dist1 X10_TEMP7 =
              Program.
                UniqueDistribution;
            
//#line 178
final Region1 RX10_TEMP1 =
              X10_TEMP7.
                dReg;
            
//#line 181
final int RX10_TEMP4 =
              1;
            
//#line 184
int RX10_TEMP2 =
              RX10_TEMP1.
                regSize;
            
//#line 187
RX10_TEMP2 =
              RX10_TEMP2 -
                RX10_TEMP4;
            
//#line 190
final int RX10_TEMP3 =
              RX10_TEMP2 +
              1;
            
//#line 192
for (
//#line 192
int RX10_TEMP0 =
                                0;
                              RX10_TEMP0 <
                                RX10_TEMP3;
                              
//#line 192
RX10_TEMP0++) {
                
//#line 195
final int RX10_TEMP5 =
                  RX10_TEMP0;
                
//#line 198
final Point1 pt =
                  Program.
                    regionOrdinalPoint1(
                    RX10_TEMP1,
                    RX10_TEMP5);
                
//#line 201
final Region1 RX10_TEMP6 =
                  X10_TEMP7.
                    dReg;
                
//#line 204
final int RX10_TEMP7 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP6,
                    pt);
                
//#line 207
final int RX10_TEMP8 =
                  0;
                
//#line 210
final boolean RX10_TEMP9 =
                  RX10_TEMP7 <
                  RX10_TEMP8;
                
//#line 212
if (RX10_TEMP9) {
                    
//#line 215
final java.
                      lang.
                      String RX10_TEMP10 =
                      "Point pt not found in the distribution X10_TEMP7.";
                    
//#line 217
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP10);
                }
                
//#line 221
final x10.
                  lang.
                  place RX10_TEMP11 =
                  Program.
                    getPlaceFromDist1(
                    X10_TEMP7,
                    RX10_TEMP7);
                
//#line 224
final x10.
                  lang.
                  place X10_TEMP8 =
                  RX10_TEMP11;
                
//#line 227
final T2 utmp2 =
                  new T2(
                  fdkr,
                  fzr,
                  p2,
                  c1,
                  p1,
                  X10_TEMP0);
                
//#line 229
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP8)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 231
Program.
                                   thread2(
                                   utmp2);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 236
public static void
                   IDEATest_cipher_idea(
                   final IDEATest X10_TEMP0,
                   final byteRefArray1 text1,
                   final byteRefArray1 text2,
                   final intValArray1 key) {
        
//#line 239
final Dist1 RX10_TEMP0 =
          text1.
            distValue;
        
//#line 242
final Region1 RX10_TEMP1 =
          RX10_TEMP0.
            dReg;
        
//#line 245
final Region1 X10_TEMP1 =
          RX10_TEMP1;
        
//#line 248
final int X10_TEMP6 =
          X10_TEMP1.
            regSize;
        
//#line 251
final int X10_TEMP2 =
          8;
        
//#line 254
final int X10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 257
final int X10_TEMP5 =
          X10_TEMP2 *
          X10_TEMP3;
        
//#line 260
final int X10_TEMP7 =
          X10_TEMP6 %
          X10_TEMP5;
        
//#line 263
final int X10_TEMP8 =
          0;
        
//#line 266
final boolean X10_TEMP10 =
          X10_TEMP7 !=
          X10_TEMP8;
        
//#line 268
if (X10_TEMP10) {
            
//#line 271
final java.
              lang.
              String X10_TEMP12 =
              "Invalid number of places for the distribution size";
            
//#line 273
throw new java.
              lang.
              RuntimeException(
              X10_TEMP12);
        }
        
//#line 277
final Dist1 RX10_TEMP2 =
          text1.
            distValue;
        
//#line 280
final Dist1 X10_TEMP13 =
          RX10_TEMP2;
        
//#line 283
final x10.
          lang.
          place X10_TEMP14 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 286
final Dist1 X10_TEMP16 =
          Program.
            restrictDist1(
            X10_TEMP13,
            X10_TEMP14);
        
//#line 289
final Region1 RX10_TEMP4 =
          X10_TEMP16.
            dReg;
        
//#line 292
final int RX10_TEMP7 =
          1;
        
//#line 295
int RX10_TEMP5 =
          RX10_TEMP4.
            regSize;
        
//#line 298
RX10_TEMP5 =
          RX10_TEMP5 -
            RX10_TEMP7;
        
//#line 301
final int RX10_TEMP6 =
          RX10_TEMP5 +
          1;
        
//#line 303
for (
//#line 303
int RX10_TEMP3 =
                            0;
                          RX10_TEMP3 <
                            RX10_TEMP6;
                          
//#line 303
RX10_TEMP3++) {
            
//#line 306
final int RX10_TEMP8 =
              RX10_TEMP3;
            
//#line 309
final Point1 i =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP4,
                RX10_TEMP8);
            
//#line 312
final int X10_TEMP18 =
              i.
                f0;
            
//#line 315
final int X10_TEMP19 =
              8;
            
//#line 318
final int X10_TEMP20 =
              X10_TEMP18 %
              X10_TEMP19;
            
//#line 321
final int X10_TEMP21 =
              0;
            
//#line 324
final boolean X10_TEMP23 =
              X10_TEMP20 ==
              X10_TEMP21;
            
//#line 326
if (X10_TEMP23) {
                
//#line 329
Point1 i1 =
                  i;
                
//#line 332
Point1 i2 =
                  i;
                
//#line 335
int ik =
                  0;
                
//#line 338
int x1 =
                  0;
                
//#line 341
int x2 =
                  0;
                
//#line 344
int x3 =
                  0;
                
//#line 347
int x4 =
                  0;
                
//#line 350
int t1 =
                  0;
                
//#line 353
int t2 =
                  0;
                
//#line 356
int r =
                  0;
                
//#line 359
final int X10_TEMP35 =
                  0;
                
//#line 362
ik =
                  X10_TEMP35;
                
//#line 365
final int X10_TEMP37 =
                  8;
                
//#line 368
r =
                  X10_TEMP37;
                
//#line 371
final Dist1 RX10_TEMP9 =
                  text1.
                    distValue;
                
//#line 374
final Region1 RX10_TEMP10 =
                  RX10_TEMP9.
                    dReg;
                
//#line 377
final int RX10_TEMP11 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP10,
                    i1);
                
//#line 380
final int RX10_TEMP12 =
                  0;
                
//#line 383
final boolean RX10_TEMP13 =
                  RX10_TEMP11 <
                  RX10_TEMP12;
                
//#line 385
if (RX10_TEMP13) {
                    
//#line 388
java.
                      lang.
                      String RX10_TEMP14 =
                      "Array access index out of bounds";
                    
//#line 390
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP14);
                }
                
//#line 394
final x10.
                  lang.
                  place RX10_TEMP15 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP9,
                    RX10_TEMP11);
                
//#line 397
final x10.
                  lang.
                  place RX10_TEMP17 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 400
final boolean RX10_TEMP18 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP15,RX10_TEMP17))/* } */;
                
//#line 402
if (RX10_TEMP18) {
                    
//#line 405
java.
                      lang.
                      String RX10_TEMP16 =
                      "Bad place access for array text1";
                    
//#line 407
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP16);
                }
                
//#line 411
final byte RX10_TEMP19 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP11);
                
//#line 414
final byte X10_TEMP39 =
                  (byte)
                    RX10_TEMP19;
                
//#line 417
final int X10_TEMP40 =
                  255;
                
//#line 420
final int X10_TEMP42 =
                  X10_TEMP39 &
                  X10_TEMP40;
                
//#line 423
x1 =
                  X10_TEMP42;
                
//#line 426
int X10_TEMP44 =
                  1;
                
//#line 429
int RX10_TEMP20 =
                  i1.
                    f0;
                
//#line 432
RX10_TEMP20 =
                  RX10_TEMP20 +
                    X10_TEMP44;
                
//#line 435
final Point1 X10_TEMP46 =
                  new Point1(
                  RX10_TEMP20);
                
//#line 438
i1 =
                  X10_TEMP46;
                
//#line 441
final Dist1 RX10_TEMP21 =
                  text1.
                    distValue;
                
//#line 444
final Region1 RX10_TEMP22 =
                  RX10_TEMP21.
                    dReg;
                
//#line 447
final int RX10_TEMP23 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP22,
                    i1);
                
//#line 450
final int RX10_TEMP24 =
                  0;
                
//#line 453
final boolean RX10_TEMP25 =
                  RX10_TEMP23 <
                  RX10_TEMP24;
                
//#line 455
if (RX10_TEMP25) {
                    
//#line 458
java.
                      lang.
                      String RX10_TEMP26 =
                      "Array access index out of bounds";
                    
//#line 460
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP26);
                }
                
//#line 464
final x10.
                  lang.
                  place RX10_TEMP27 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP21,
                    RX10_TEMP23);
                
//#line 467
final x10.
                  lang.
                  place RX10_TEMP29 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 470
final boolean RX10_TEMP30 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP27,RX10_TEMP29))/* } */;
                
//#line 472
if (RX10_TEMP30) {
                    
//#line 475
java.
                      lang.
                      String RX10_TEMP28 =
                      "Bad place access for array text1";
                    
//#line 477
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP28);
                }
                
//#line 481
final byte RX10_TEMP31 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP23);
                
//#line 484
final byte X10_TEMP48 =
                  (byte)
                    RX10_TEMP31;
                
//#line 487
final int X10_TEMP49 =
                  255;
                
//#line 490
final int X10_TEMP51 =
                  X10_TEMP48 &
                  X10_TEMP49;
                
//#line 493
final int X10_TEMP52 =
                  8;
                
//#line 496
final int X10_TEMP53 =
                  X10_TEMP51 <<
                  X10_TEMP52;
                
//#line 499
final int X10_TEMP55 =
                  x1 |
                  X10_TEMP53;
                
//#line 502
x1 =
                  X10_TEMP55;
                
//#line 505
int X10_TEMP57 =
                  1;
                
//#line 508
int RX10_TEMP32 =
                  i1.
                    f0;
                
//#line 511
RX10_TEMP32 =
                  RX10_TEMP32 +
                    X10_TEMP57;
                
//#line 514
final Point1 X10_TEMP59 =
                  new Point1(
                  RX10_TEMP32);
                
//#line 517
i1 =
                  X10_TEMP59;
                
//#line 520
final Dist1 RX10_TEMP33 =
                  text1.
                    distValue;
                
//#line 523
final Region1 RX10_TEMP34 =
                  RX10_TEMP33.
                    dReg;
                
//#line 526
final int RX10_TEMP35 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP34,
                    i1);
                
//#line 529
final int RX10_TEMP36 =
                  0;
                
//#line 532
final boolean RX10_TEMP37 =
                  RX10_TEMP35 <
                  RX10_TEMP36;
                
//#line 534
if (RX10_TEMP37) {
                    
//#line 537
java.
                      lang.
                      String RX10_TEMP38 =
                      "Array access index out of bounds";
                    
//#line 539
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP38);
                }
                
//#line 543
final x10.
                  lang.
                  place RX10_TEMP39 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP33,
                    RX10_TEMP35);
                
//#line 546
final x10.
                  lang.
                  place RX10_TEMP41 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 549
final boolean RX10_TEMP42 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP39,RX10_TEMP41))/* } */;
                
//#line 551
if (RX10_TEMP42) {
                    
//#line 554
java.
                      lang.
                      String RX10_TEMP40 =
                      "Bad place access for array text1";
                    
//#line 556
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP40);
                }
                
//#line 560
final byte RX10_TEMP43 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP35);
                
//#line 563
final byte X10_TEMP61 =
                  (byte)
                    RX10_TEMP43;
                
//#line 566
final int X10_TEMP62 =
                  255;
                
//#line 569
final int X10_TEMP64 =
                  X10_TEMP61 &
                  X10_TEMP62;
                
//#line 572
x2 =
                  X10_TEMP64;
                
//#line 575
int X10_TEMP66 =
                  1;
                
//#line 578
int RX10_TEMP44 =
                  i1.
                    f0;
                
//#line 581
RX10_TEMP44 =
                  RX10_TEMP44 +
                    X10_TEMP66;
                
//#line 584
final Point1 X10_TEMP68 =
                  new Point1(
                  RX10_TEMP44);
                
//#line 587
i1 =
                  X10_TEMP68;
                
//#line 590
final Dist1 RX10_TEMP45 =
                  text1.
                    distValue;
                
//#line 593
final Region1 RX10_TEMP46 =
                  RX10_TEMP45.
                    dReg;
                
//#line 596
final int RX10_TEMP47 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP46,
                    i1);
                
//#line 599
final int RX10_TEMP48 =
                  0;
                
//#line 602
final boolean RX10_TEMP49 =
                  RX10_TEMP47 <
                  RX10_TEMP48;
                
//#line 604
if (RX10_TEMP49) {
                    
//#line 607
java.
                      lang.
                      String RX10_TEMP50 =
                      "Array access index out of bounds";
                    
//#line 609
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP50);
                }
                
//#line 613
final x10.
                  lang.
                  place RX10_TEMP51 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP45,
                    RX10_TEMP47);
                
//#line 616
final x10.
                  lang.
                  place RX10_TEMP53 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 619
final boolean RX10_TEMP54 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP51,RX10_TEMP53))/* } */;
                
//#line 621
if (RX10_TEMP54) {
                    
//#line 624
java.
                      lang.
                      String RX10_TEMP52 =
                      "Bad place access for array text1";
                    
//#line 626
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP52);
                }
                
//#line 630
final byte RX10_TEMP55 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP47);
                
//#line 633
final byte X10_TEMP70 =
                  (byte)
                    RX10_TEMP55;
                
//#line 636
final int X10_TEMP71 =
                  255;
                
//#line 639
final int X10_TEMP73 =
                  X10_TEMP70 &
                  X10_TEMP71;
                
//#line 642
final int X10_TEMP74 =
                  8;
                
//#line 645
final int X10_TEMP75 =
                  X10_TEMP73 <<
                  X10_TEMP74;
                
//#line 648
final int X10_TEMP77 =
                  x2 |
                  X10_TEMP75;
                
//#line 651
x2 =
                  X10_TEMP77;
                
//#line 654
int X10_TEMP79 =
                  1;
                
//#line 657
int RX10_TEMP56 =
                  i1.
                    f0;
                
//#line 660
RX10_TEMP56 =
                  RX10_TEMP56 +
                    X10_TEMP79;
                
//#line 663
final Point1 X10_TEMP81 =
                  new Point1(
                  RX10_TEMP56);
                
//#line 666
i1 =
                  X10_TEMP81;
                
//#line 669
final Dist1 RX10_TEMP57 =
                  text1.
                    distValue;
                
//#line 672
final Region1 RX10_TEMP58 =
                  RX10_TEMP57.
                    dReg;
                
//#line 675
final int RX10_TEMP59 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP58,
                    i1);
                
//#line 678
final int RX10_TEMP60 =
                  0;
                
//#line 681
final boolean RX10_TEMP61 =
                  RX10_TEMP59 <
                  RX10_TEMP60;
                
//#line 683
if (RX10_TEMP61) {
                    
//#line 686
java.
                      lang.
                      String RX10_TEMP62 =
                      "Array access index out of bounds";
                    
//#line 688
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP62);
                }
                
//#line 692
final x10.
                  lang.
                  place RX10_TEMP63 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP57,
                    RX10_TEMP59);
                
//#line 695
final x10.
                  lang.
                  place RX10_TEMP65 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 698
final boolean RX10_TEMP66 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP63,RX10_TEMP65))/* } */;
                
//#line 700
if (RX10_TEMP66) {
                    
//#line 703
java.
                      lang.
                      String RX10_TEMP64 =
                      "Bad place access for array text1";
                    
//#line 705
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP64);
                }
                
//#line 709
final byte RX10_TEMP67 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP59);
                
//#line 712
final byte X10_TEMP83 =
                  (byte)
                    RX10_TEMP67;
                
//#line 715
final int X10_TEMP84 =
                  255;
                
//#line 718
final int X10_TEMP86 =
                  X10_TEMP83 &
                  X10_TEMP84;
                
//#line 721
x3 =
                  X10_TEMP86;
                
//#line 724
int X10_TEMP88 =
                  1;
                
//#line 727
int RX10_TEMP68 =
                  i1.
                    f0;
                
//#line 730
RX10_TEMP68 =
                  RX10_TEMP68 +
                    X10_TEMP88;
                
//#line 733
final Point1 X10_TEMP90 =
                  new Point1(
                  RX10_TEMP68);
                
//#line 736
i1 =
                  X10_TEMP90;
                
//#line 739
final Dist1 RX10_TEMP69 =
                  text1.
                    distValue;
                
//#line 742
final Region1 RX10_TEMP70 =
                  RX10_TEMP69.
                    dReg;
                
//#line 745
final int RX10_TEMP71 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP70,
                    i1);
                
//#line 748
final int RX10_TEMP72 =
                  0;
                
//#line 751
final boolean RX10_TEMP73 =
                  RX10_TEMP71 <
                  RX10_TEMP72;
                
//#line 753
if (RX10_TEMP73) {
                    
//#line 756
java.
                      lang.
                      String RX10_TEMP74 =
                      "Array access index out of bounds";
                    
//#line 758
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP74);
                }
                
//#line 762
final x10.
                  lang.
                  place RX10_TEMP75 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP69,
                    RX10_TEMP71);
                
//#line 765
final x10.
                  lang.
                  place RX10_TEMP77 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 768
final boolean RX10_TEMP78 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP75,RX10_TEMP77))/* } */;
                
//#line 770
if (RX10_TEMP78) {
                    
//#line 773
java.
                      lang.
                      String RX10_TEMP76 =
                      "Bad place access for array text1";
                    
//#line 775
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP76);
                }
                
//#line 779
final byte RX10_TEMP79 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP71);
                
//#line 782
final byte X10_TEMP92 =
                  (byte)
                    RX10_TEMP79;
                
//#line 785
final int X10_TEMP93 =
                  255;
                
//#line 788
final int X10_TEMP95 =
                  X10_TEMP92 &
                  X10_TEMP93;
                
//#line 791
final int X10_TEMP96 =
                  8;
                
//#line 794
final int X10_TEMP97 =
                  X10_TEMP95 <<
                  X10_TEMP96;
                
//#line 797
final int X10_TEMP99 =
                  x3 |
                  X10_TEMP97;
                
//#line 800
x3 =
                  X10_TEMP99;
                
//#line 803
int X10_TEMP101 =
                  1;
                
//#line 806
int RX10_TEMP80 =
                  i1.
                    f0;
                
//#line 809
RX10_TEMP80 =
                  RX10_TEMP80 +
                    X10_TEMP101;
                
//#line 812
final Point1 X10_TEMP103 =
                  new Point1(
                  RX10_TEMP80);
                
//#line 815
i1 =
                  X10_TEMP103;
                
//#line 818
final Dist1 RX10_TEMP81 =
                  text1.
                    distValue;
                
//#line 821
final Region1 RX10_TEMP82 =
                  RX10_TEMP81.
                    dReg;
                
//#line 824
final int RX10_TEMP83 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP82,
                    i1);
                
//#line 827
final int RX10_TEMP84 =
                  0;
                
//#line 830
final boolean RX10_TEMP85 =
                  RX10_TEMP83 <
                  RX10_TEMP84;
                
//#line 832
if (RX10_TEMP85) {
                    
//#line 835
java.
                      lang.
                      String RX10_TEMP86 =
                      "Array access index out of bounds";
                    
//#line 837
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP86);
                }
                
//#line 841
final x10.
                  lang.
                  place RX10_TEMP87 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP81,
                    RX10_TEMP83);
                
//#line 844
final x10.
                  lang.
                  place RX10_TEMP89 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 847
final boolean RX10_TEMP90 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP87,RX10_TEMP89))/* } */;
                
//#line 849
if (RX10_TEMP90) {
                    
//#line 852
java.
                      lang.
                      String RX10_TEMP88 =
                      "Bad place access for array text1";
                    
//#line 854
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP88);
                }
                
//#line 858
final byte RX10_TEMP91 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP83);
                
//#line 861
final byte X10_TEMP105 =
                  (byte)
                    RX10_TEMP91;
                
//#line 864
final int X10_TEMP106 =
                  255;
                
//#line 867
final int X10_TEMP108 =
                  X10_TEMP105 &
                  X10_TEMP106;
                
//#line 870
x4 =
                  X10_TEMP108;
                
//#line 873
int X10_TEMP110 =
                  1;
                
//#line 876
int RX10_TEMP92 =
                  i1.
                    f0;
                
//#line 879
RX10_TEMP92 =
                  RX10_TEMP92 +
                    X10_TEMP110;
                
//#line 882
final Point1 X10_TEMP112 =
                  new Point1(
                  RX10_TEMP92);
                
//#line 885
i1 =
                  X10_TEMP112;
                
//#line 888
final Dist1 RX10_TEMP93 =
                  text1.
                    distValue;
                
//#line 891
final Region1 RX10_TEMP94 =
                  RX10_TEMP93.
                    dReg;
                
//#line 894
final int RX10_TEMP95 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP94,
                    i1);
                
//#line 897
final int RX10_TEMP96 =
                  0;
                
//#line 900
final boolean RX10_TEMP97 =
                  RX10_TEMP95 <
                  RX10_TEMP96;
                
//#line 902
if (RX10_TEMP97) {
                    
//#line 905
java.
                      lang.
                      String RX10_TEMP98 =
                      "Array access index out of bounds";
                    
//#line 907
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP98);
                }
                
//#line 911
final x10.
                  lang.
                  place RX10_TEMP99 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP93,
                    RX10_TEMP95);
                
//#line 914
final x10.
                  lang.
                  place RX10_TEMP101 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 917
final boolean RX10_TEMP102 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP99,RX10_TEMP101))/* } */;
                
//#line 919
if (RX10_TEMP102) {
                    
//#line 922
java.
                      lang.
                      String RX10_TEMP100 =
                      "Bad place access for array text1";
                    
//#line 924
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP100);
                }
                
//#line 928
final byte RX10_TEMP103 =
                  Program.
                    getRefArrayValue1byte(
                    text1,
                    RX10_TEMP95);
                
//#line 931
final byte X10_TEMP114 =
                  (byte)
                    RX10_TEMP103;
                
//#line 934
final int X10_TEMP115 =
                  255;
                
//#line 937
final int X10_TEMP117 =
                  X10_TEMP114 &
                  X10_TEMP115;
                
//#line 940
final int X10_TEMP118 =
                  8;
                
//#line 943
final int X10_TEMP119 =
                  X10_TEMP117 <<
                  X10_TEMP118;
                
//#line 946
final int X10_TEMP121 =
                  x4 |
                  X10_TEMP119;
                
//#line 949
x4 =
                  X10_TEMP121;
                
//#line 952
int X10_TEMP123 =
                  1;
                
//#line 955
int RX10_TEMP104 =
                  i1.
                    f0;
                
//#line 958
RX10_TEMP104 =
                  RX10_TEMP104 +
                    X10_TEMP123;
                
//#line 961
final Point1 X10_TEMP125 =
                  new Point1(
                  RX10_TEMP104);
                
//#line 964
i1 =
                  X10_TEMP125;
                
//#line 967
boolean X10_TEMP126 =
                  false;
                
//#line 969
do  {
                    
//#line 971
final long X10_TEMP130 =
                      (long)
                        x1;
                    
//#line 974
final int X10_TEMP127 =
                      ik;
                    
//#line 977
final int X10_TEMP128 =
                      1;
                    
//#line 980
ik =
                      ik +
                        X10_TEMP128;
                    
//#line 983
final Point1 RX10_TEMP105 =
                      new Point1(
                      X10_TEMP127);
                    
//#line 986
final Region1 RX10_TEMP106 =
                      key.
                        regionValue;
                    
//#line 989
final int RX10_TEMP107 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP106,
                        RX10_TEMP105);
                    
//#line 992
final int RX10_TEMP108 =
                      0;
                    
//#line 995
final boolean RX10_TEMP109 =
                      RX10_TEMP107 <
                      RX10_TEMP108;
                    
//#line 997
if (RX10_TEMP109) {
                        
//#line 1000
java.
                          lang.
                          String RX10_TEMP110 =
                          "Array access index out of bounds";
                        
//#line 1002
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP110);
                    }
                    
//#line 1006
final int[] RX10_TEMP111 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1009
final int X10_TEMP131 =
                      RX10_TEMP111[RX10_TEMP107];
                    
//#line 1012
final long X10_TEMP132 =
                      X10_TEMP130 *
                      X10_TEMP131;
                    
//#line 1015
final long X10_TEMP133 =
                      65537L;
                    
//#line 1018
final long X10_TEMP134 =
                      X10_TEMP132 %
                      X10_TEMP133;
                    
//#line 1021
final int X10_TEMP135 =
                      65535;
                    
//#line 1024
final long X10_TEMP137 =
                      X10_TEMP134 &
                      X10_TEMP135;
                    
//#line 1027
final int X10_TEMP139 =
                      (int)
                        X10_TEMP137;
                    
//#line 1030
x1 =
                      X10_TEMP139;
                    
//#line 1033
final int X10_TEMP140 =
                      ik;
                    
//#line 1036
final int X10_TEMP141 =
                      1;
                    
//#line 1039
ik =
                      ik +
                        X10_TEMP141;
                    
//#line 1042
final Point1 RX10_TEMP112 =
                      new Point1(
                      X10_TEMP140);
                    
//#line 1045
final Region1 RX10_TEMP113 =
                      key.
                        regionValue;
                    
//#line 1048
final int RX10_TEMP114 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP113,
                        RX10_TEMP112);
                    
//#line 1051
final int RX10_TEMP115 =
                      0;
                    
//#line 1054
final boolean RX10_TEMP116 =
                      RX10_TEMP114 <
                      RX10_TEMP115;
                    
//#line 1056
if (RX10_TEMP116) {
                        
//#line 1059
java.
                          lang.
                          String RX10_TEMP117 =
                          "Array access index out of bounds";
                        
//#line 1061
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP117);
                    }
                    
//#line 1065
final int[] RX10_TEMP118 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1068
final int X10_TEMP143 =
                      RX10_TEMP118[RX10_TEMP114];
                    
//#line 1071
final int X10_TEMP144 =
                      x2 +
                      X10_TEMP143;
                    
//#line 1074
final int X10_TEMP145 =
                      65535;
                    
//#line 1077
final int X10_TEMP147 =
                      X10_TEMP144 &
                      X10_TEMP145;
                    
//#line 1080
x2 =
                      X10_TEMP147;
                    
//#line 1083
final int X10_TEMP148 =
                      ik;
                    
//#line 1086
final int X10_TEMP149 =
                      1;
                    
//#line 1089
ik =
                      ik +
                        X10_TEMP149;
                    
//#line 1092
final Point1 RX10_TEMP119 =
                      new Point1(
                      X10_TEMP148);
                    
//#line 1095
final Region1 RX10_TEMP120 =
                      key.
                        regionValue;
                    
//#line 1098
final int RX10_TEMP121 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP120,
                        RX10_TEMP119);
                    
//#line 1101
final int RX10_TEMP122 =
                      0;
                    
//#line 1104
final boolean RX10_TEMP123 =
                      RX10_TEMP121 <
                      RX10_TEMP122;
                    
//#line 1106
if (RX10_TEMP123) {
                        
//#line 1109
java.
                          lang.
                          String RX10_TEMP124 =
                          "Array access index out of bounds";
                        
//#line 1111
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP124);
                    }
                    
//#line 1115
final int[] RX10_TEMP125 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1118
final int X10_TEMP151 =
                      RX10_TEMP125[RX10_TEMP121];
                    
//#line 1121
final int X10_TEMP152 =
                      x3 +
                      X10_TEMP151;
                    
//#line 1124
final int X10_TEMP153 =
                      65535;
                    
//#line 1127
final int X10_TEMP155 =
                      X10_TEMP152 &
                      X10_TEMP153;
                    
//#line 1130
x3 =
                      X10_TEMP155;
                    
//#line 1133
final long X10_TEMP159 =
                      (long)
                        x4;
                    
//#line 1136
final int X10_TEMP156 =
                      ik;
                    
//#line 1139
final int X10_TEMP157 =
                      1;
                    
//#line 1142
ik =
                      ik +
                        X10_TEMP157;
                    
//#line 1145
final Point1 RX10_TEMP126 =
                      new Point1(
                      X10_TEMP156);
                    
//#line 1148
final Region1 RX10_TEMP127 =
                      key.
                        regionValue;
                    
//#line 1151
final int RX10_TEMP128 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP127,
                        RX10_TEMP126);
                    
//#line 1154
final int RX10_TEMP129 =
                      0;
                    
//#line 1157
final boolean RX10_TEMP130 =
                      RX10_TEMP128 <
                      RX10_TEMP129;
                    
//#line 1159
if (RX10_TEMP130) {
                        
//#line 1162
java.
                          lang.
                          String RX10_TEMP131 =
                          "Array access index out of bounds";
                        
//#line 1164
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP131);
                    }
                    
//#line 1168
final int[] RX10_TEMP132 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1171
final int X10_TEMP160 =
                      RX10_TEMP132[RX10_TEMP128];
                    
//#line 1174
final long X10_TEMP161 =
                      X10_TEMP159 *
                      X10_TEMP160;
                    
//#line 1177
final long X10_TEMP162 =
                      65537L;
                    
//#line 1180
final long X10_TEMP163 =
                      X10_TEMP161 %
                      X10_TEMP162;
                    
//#line 1183
final int X10_TEMP164 =
                      65535;
                    
//#line 1186
final long X10_TEMP166 =
                      X10_TEMP163 &
                      X10_TEMP164;
                    
//#line 1189
final int X10_TEMP168 =
                      (int)
                        X10_TEMP166;
                    
//#line 1192
x4 =
                      X10_TEMP168;
                    
//#line 1195
final int X10_TEMP170 =
                      x1 ^
                      x3;
                    
//#line 1198
t2 =
                      X10_TEMP170;
                    
//#line 1201
final long X10_TEMP174 =
                      (long)
                        t2;
                    
//#line 1204
final int X10_TEMP171 =
                      ik;
                    
//#line 1207
final int X10_TEMP172 =
                      1;
                    
//#line 1210
ik =
                      ik +
                        X10_TEMP172;
                    
//#line 1213
final Point1 RX10_TEMP133 =
                      new Point1(
                      X10_TEMP171);
                    
//#line 1216
final Region1 RX10_TEMP134 =
                      key.
                        regionValue;
                    
//#line 1219
final int RX10_TEMP135 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP134,
                        RX10_TEMP133);
                    
//#line 1222
final int RX10_TEMP136 =
                      0;
                    
//#line 1225
final boolean RX10_TEMP137 =
                      RX10_TEMP135 <
                      RX10_TEMP136;
                    
//#line 1227
if (RX10_TEMP137) {
                        
//#line 1230
java.
                          lang.
                          String RX10_TEMP138 =
                          "Array access index out of bounds";
                        
//#line 1232
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP138);
                    }
                    
//#line 1236
final int[] RX10_TEMP139 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1239
final int X10_TEMP175 =
                      RX10_TEMP139[RX10_TEMP135];
                    
//#line 1242
final long X10_TEMP176 =
                      X10_TEMP174 *
                      X10_TEMP175;
                    
//#line 1245
final long X10_TEMP177 =
                      65537L;
                    
//#line 1248
final long X10_TEMP178 =
                      X10_TEMP176 %
                      X10_TEMP177;
                    
//#line 1251
final int X10_TEMP179 =
                      65535;
                    
//#line 1254
final long X10_TEMP181 =
                      X10_TEMP178 &
                      X10_TEMP179;
                    
//#line 1257
final int X10_TEMP183 =
                      (int)
                        X10_TEMP181;
                    
//#line 1260
t2 =
                      X10_TEMP183;
                    
//#line 1263
final int X10_TEMP185 =
                      x2 ^
                      x4;
                    
//#line 1266
final int X10_TEMP186 =
                      t2 +
                      X10_TEMP185;
                    
//#line 1269
final int X10_TEMP187 =
                      65535;
                    
//#line 1272
final int X10_TEMP189 =
                      X10_TEMP186 &
                      X10_TEMP187;
                    
//#line 1275
t1 =
                      X10_TEMP189;
                    
//#line 1278
final long X10_TEMP193 =
                      (long)
                        t1;
                    
//#line 1281
final int X10_TEMP190 =
                      ik;
                    
//#line 1284
final int X10_TEMP191 =
                      1;
                    
//#line 1287
ik =
                      ik +
                        X10_TEMP191;
                    
//#line 1290
final Point1 RX10_TEMP140 =
                      new Point1(
                      X10_TEMP190);
                    
//#line 1293
final Region1 RX10_TEMP141 =
                      key.
                        regionValue;
                    
//#line 1296
final int RX10_TEMP142 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP141,
                        RX10_TEMP140);
                    
//#line 1299
final int RX10_TEMP143 =
                      0;
                    
//#line 1302
final boolean RX10_TEMP144 =
                      RX10_TEMP142 <
                      RX10_TEMP143;
                    
//#line 1304
if (RX10_TEMP144) {
                        
//#line 1307
java.
                          lang.
                          String RX10_TEMP145 =
                          "Array access index out of bounds";
                        
//#line 1309
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP145);
                    }
                    
//#line 1313
final int[] RX10_TEMP146 =
                      (int[])
                        ((key.
                            contents));
                    
//#line 1316
final int X10_TEMP194 =
                      RX10_TEMP146[RX10_TEMP142];
                    
//#line 1319
final long X10_TEMP195 =
                      X10_TEMP193 *
                      X10_TEMP194;
                    
//#line 1322
final long X10_TEMP196 =
                      65537L;
                    
//#line 1325
final long X10_TEMP197 =
                      X10_TEMP195 %
                      X10_TEMP196;
                    
//#line 1328
final int X10_TEMP198 =
                      65535;
                    
//#line 1331
final long X10_TEMP200 =
                      X10_TEMP197 &
                      X10_TEMP198;
                    
//#line 1334
final int X10_TEMP202 =
                      (int)
                        X10_TEMP200;
                    
//#line 1337
t1 =
                      X10_TEMP202;
                    
//#line 1340
final int X10_TEMP203 =
                      t1 +
                      t2;
                    
//#line 1343
final int X10_TEMP204 =
                      65535;
                    
//#line 1346
final int X10_TEMP206 =
                      X10_TEMP203 &
                      X10_TEMP204;
                    
//#line 1349
t2 =
                      X10_TEMP206;
                    
//#line 1352
final int X10_TEMP208 =
                      x1 ^
                      t1;
                    
//#line 1355
x1 =
                      X10_TEMP208;
                    
//#line 1358
final int X10_TEMP210 =
                      x4 ^
                      t2;
                    
//#line 1361
x4 =
                      X10_TEMP210;
                    
//#line 1364
final int X10_TEMP212 =
                      t2 ^
                      x2;
                    
//#line 1367
t2 =
                      X10_TEMP212;
                    
//#line 1370
final int X10_TEMP214 =
                      x3 ^
                      t1;
                    
//#line 1373
x2 =
                      X10_TEMP214;
                    
//#line 1376
x3 =
                      t2;
                    
//#line 1379
final int X10_TEMP216 =
                      1;
                    
//#line 1382
r =
                      r -
                        X10_TEMP216;
                    
//#line 1385
final int X10_TEMP217 =
                      0;
                    
//#line 1388
X10_TEMP126 =
                      r !=
                        X10_TEMP217;
                }while(X10_TEMP126); 
                
//#line 1393
final long X10_TEMP222 =
                  (long)
                    x1;
                
//#line 1396
final int X10_TEMP219 =
                  ik;
                
//#line 1399
final int X10_TEMP220 =
                  1;
                
//#line 1402
ik =
                  ik +
                    X10_TEMP220;
                
//#line 1405
final Point1 RX10_TEMP147 =
                  new Point1(
                  X10_TEMP219);
                
//#line 1408
final Region1 RX10_TEMP148 =
                  key.
                    regionValue;
                
//#line 1411
final int RX10_TEMP149 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP148,
                    RX10_TEMP147);
                
//#line 1414
final int RX10_TEMP150 =
                  0;
                
//#line 1417
final boolean RX10_TEMP151 =
                  RX10_TEMP149 <
                  RX10_TEMP150;
                
//#line 1419
if (RX10_TEMP151) {
                    
//#line 1422
java.
                      lang.
                      String RX10_TEMP152 =
                      "Array access index out of bounds";
                    
//#line 1424
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP152);
                }
                
//#line 1428
final int[] RX10_TEMP153 =
                  (int[])
                    ((key.
                        contents));
                
//#line 1431
final int X10_TEMP223 =
                  RX10_TEMP153[RX10_TEMP149];
                
//#line 1434
final long X10_TEMP224 =
                  X10_TEMP222 *
                  X10_TEMP223;
                
//#line 1437
final long X10_TEMP225 =
                  65537L;
                
//#line 1440
final long X10_TEMP226 =
                  X10_TEMP224 %
                  X10_TEMP225;
                
//#line 1443
final int X10_TEMP227 =
                  65535;
                
//#line 1446
final long X10_TEMP229 =
                  X10_TEMP226 &
                  X10_TEMP227;
                
//#line 1449
final int X10_TEMP231 =
                  (int)
                    X10_TEMP229;
                
//#line 1452
x1 =
                  X10_TEMP231;
                
//#line 1455
final int X10_TEMP232 =
                  ik;
                
//#line 1458
final int X10_TEMP233 =
                  1;
                
//#line 1461
ik =
                  ik +
                    X10_TEMP233;
                
//#line 1464
final Point1 RX10_TEMP154 =
                  new Point1(
                  X10_TEMP232);
                
//#line 1467
final Region1 RX10_TEMP155 =
                  key.
                    regionValue;
                
//#line 1470
final int RX10_TEMP156 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP155,
                    RX10_TEMP154);
                
//#line 1473
final int RX10_TEMP157 =
                  0;
                
//#line 1476
final boolean RX10_TEMP158 =
                  RX10_TEMP156 <
                  RX10_TEMP157;
                
//#line 1478
if (RX10_TEMP158) {
                    
//#line 1481
java.
                      lang.
                      String RX10_TEMP159 =
                      "Array access index out of bounds";
                    
//#line 1483
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP159);
                }
                
//#line 1487
final int[] RX10_TEMP160 =
                  (int[])
                    ((key.
                        contents));
                
//#line 1490
final int X10_TEMP235 =
                  RX10_TEMP160[RX10_TEMP156];
                
//#line 1493
final int X10_TEMP236 =
                  x3 +
                  X10_TEMP235;
                
//#line 1496
final int X10_TEMP237 =
                  65535;
                
//#line 1499
final int X10_TEMP239 =
                  X10_TEMP236 &
                  X10_TEMP237;
                
//#line 1502
x3 =
                  X10_TEMP239;
                
//#line 1505
final int X10_TEMP240 =
                  ik;
                
//#line 1508
final int X10_TEMP241 =
                  1;
                
//#line 1511
ik =
                  ik +
                    X10_TEMP241;
                
//#line 1514
final Point1 RX10_TEMP161 =
                  new Point1(
                  X10_TEMP240);
                
//#line 1517
final Region1 RX10_TEMP162 =
                  key.
                    regionValue;
                
//#line 1520
final int RX10_TEMP163 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP162,
                    RX10_TEMP161);
                
//#line 1523
final int RX10_TEMP164 =
                  0;
                
//#line 1526
final boolean RX10_TEMP165 =
                  RX10_TEMP163 <
                  RX10_TEMP164;
                
//#line 1528
if (RX10_TEMP165) {
                    
//#line 1531
java.
                      lang.
                      String RX10_TEMP166 =
                      "Array access index out of bounds";
                    
//#line 1533
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP166);
                }
                
//#line 1537
final int[] RX10_TEMP167 =
                  (int[])
                    ((key.
                        contents));
                
//#line 1540
final int X10_TEMP243 =
                  RX10_TEMP167[RX10_TEMP163];
                
//#line 1543
final int X10_TEMP244 =
                  x2 +
                  X10_TEMP243;
                
//#line 1546
final int X10_TEMP245 =
                  65535;
                
//#line 1549
final int X10_TEMP247 =
                  X10_TEMP244 &
                  X10_TEMP245;
                
//#line 1552
x2 =
                  X10_TEMP247;
                
//#line 1555
final long X10_TEMP251 =
                  (long)
                    x4;
                
//#line 1558
final int X10_TEMP248 =
                  ik;
                
//#line 1561
final int X10_TEMP249 =
                  1;
                
//#line 1564
ik =
                  ik +
                    X10_TEMP249;
                
//#line 1567
final Point1 RX10_TEMP168 =
                  new Point1(
                  X10_TEMP248);
                
//#line 1570
final Region1 RX10_TEMP169 =
                  key.
                    regionValue;
                
//#line 1573
final int RX10_TEMP170 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP169,
                    RX10_TEMP168);
                
//#line 1576
final int RX10_TEMP171 =
                  0;
                
//#line 1579
final boolean RX10_TEMP172 =
                  RX10_TEMP170 <
                  RX10_TEMP171;
                
//#line 1581
if (RX10_TEMP172) {
                    
//#line 1584
java.
                      lang.
                      String RX10_TEMP173 =
                      "Array access index out of bounds";
                    
//#line 1586
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP173);
                }
                
//#line 1590
final int[] RX10_TEMP174 =
                  (int[])
                    ((key.
                        contents));
                
//#line 1593
final int X10_TEMP252 =
                  RX10_TEMP174[RX10_TEMP170];
                
//#line 1596
final long X10_TEMP253 =
                  X10_TEMP251 *
                  X10_TEMP252;
                
//#line 1599
final long X10_TEMP254 =
                  65537L;
                
//#line 1602
final long X10_TEMP255 =
                  X10_TEMP253 %
                  X10_TEMP254;
                
//#line 1605
final int X10_TEMP256 =
                  65535;
                
//#line 1608
final long X10_TEMP258 =
                  X10_TEMP255 &
                  X10_TEMP256;
                
//#line 1611
final int X10_TEMP260 =
                  (int)
                    X10_TEMP258;
                
//#line 1614
x4 =
                  X10_TEMP260;
                
//#line 1617
final byte X10_TEMP264 =
                  (byte)
                    (byte)
                      x1;
                
//#line 1620
final byte X10_TEMP265 =
                  (byte)
                    X10_TEMP264;
                
//#line 1623
final Dist1 RX10_TEMP175 =
                  text2.
                    distValue;
                
//#line 1626
final Region1 RX10_TEMP176 =
                  RX10_TEMP175.
                    dReg;
                
//#line 1629
final int RX10_TEMP177 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP176,
                    i2);
                
//#line 1632
final int RX10_TEMP178 =
                  0;
                
//#line 1635
final boolean RX10_TEMP179 =
                  RX10_TEMP177 <
                  RX10_TEMP178;
                
//#line 1637
if (RX10_TEMP179) {
                    
//#line 1640
java.
                      lang.
                      String RX10_TEMP180 =
                      "Array index out of bounds";
                    
//#line 1642
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP180);
                }
                
//#line 1646
final x10.
                  lang.
                  place RX10_TEMP181 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP175,
                    RX10_TEMP177);
                
//#line 1649
final x10.
                  lang.
                  place RX10_TEMP183 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1652
final boolean RX10_TEMP184 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP181,RX10_TEMP183))/* } */;
                
//#line 1654
if (RX10_TEMP184) {
                    
//#line 1657
java.
                      lang.
                      String RX10_TEMP182 =
                      "Bad place access for array text2";
                    
//#line 1659
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP182);
                }
                
//#line 1662
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP177,
                                X10_TEMP265);
                
//#line 1664
int X10_TEMP267 =
                  1;
                
//#line 1667
int RX10_TEMP185 =
                  i2.
                    f0;
                
//#line 1670
RX10_TEMP185 =
                  RX10_TEMP185 +
                    X10_TEMP267;
                
//#line 1673
final Point1 X10_TEMP269 =
                  new Point1(
                  RX10_TEMP185);
                
//#line 1676
i2 =
                  X10_TEMP269;
                
//#line 1679
final int X10_TEMP271 =
                  8;
                
//#line 1682
final int X10_TEMP273 =
                  x1 >>>
                  X10_TEMP271;
                
//#line 1685
final byte X10_TEMP276 =
                  (byte)
                    (byte)
                      X10_TEMP273;
                
//#line 1688
final byte X10_TEMP277 =
                  (byte)
                    X10_TEMP276;
                
//#line 1691
final Dist1 RX10_TEMP186 =
                  text2.
                    distValue;
                
//#line 1694
final Region1 RX10_TEMP187 =
                  RX10_TEMP186.
                    dReg;
                
//#line 1697
final int RX10_TEMP188 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP187,
                    i2);
                
//#line 1700
final int RX10_TEMP189 =
                  0;
                
//#line 1703
final boolean RX10_TEMP190 =
                  RX10_TEMP188 <
                  RX10_TEMP189;
                
//#line 1705
if (RX10_TEMP190) {
                    
//#line 1708
java.
                      lang.
                      String RX10_TEMP191 =
                      "Array index out of bounds";
                    
//#line 1710
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP191);
                }
                
//#line 1714
final x10.
                  lang.
                  place RX10_TEMP192 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP186,
                    RX10_TEMP188);
                
//#line 1717
final x10.
                  lang.
                  place RX10_TEMP194 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1720
final boolean RX10_TEMP195 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP192,RX10_TEMP194))/* } */;
                
//#line 1722
if (RX10_TEMP195) {
                    
//#line 1725
java.
                      lang.
                      String RX10_TEMP193 =
                      "Bad place access for array text2";
                    
//#line 1727
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP193);
                }
                
//#line 1730
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP188,
                                X10_TEMP277);
                
//#line 1732
int X10_TEMP279 =
                  1;
                
//#line 1735
int RX10_TEMP196 =
                  i2.
                    f0;
                
//#line 1738
RX10_TEMP196 =
                  RX10_TEMP196 +
                    X10_TEMP279;
                
//#line 1741
final Point1 X10_TEMP281 =
                  new Point1(
                  RX10_TEMP196);
                
//#line 1744
i2 =
                  X10_TEMP281;
                
//#line 1747
final byte X10_TEMP285 =
                  (byte)
                    (byte)
                      x3;
                
//#line 1750
final byte X10_TEMP286 =
                  (byte)
                    X10_TEMP285;
                
//#line 1753
final Dist1 RX10_TEMP197 =
                  text2.
                    distValue;
                
//#line 1756
final Region1 RX10_TEMP198 =
                  RX10_TEMP197.
                    dReg;
                
//#line 1759
final int RX10_TEMP199 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP198,
                    i2);
                
//#line 1762
final int RX10_TEMP200 =
                  0;
                
//#line 1765
final boolean RX10_TEMP201 =
                  RX10_TEMP199 <
                  RX10_TEMP200;
                
//#line 1767
if (RX10_TEMP201) {
                    
//#line 1770
java.
                      lang.
                      String RX10_TEMP202 =
                      "Array index out of bounds";
                    
//#line 1772
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP202);
                }
                
//#line 1776
final x10.
                  lang.
                  place RX10_TEMP203 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP197,
                    RX10_TEMP199);
                
//#line 1779
final x10.
                  lang.
                  place RX10_TEMP205 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1782
final boolean RX10_TEMP206 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP203,RX10_TEMP205))/* } */;
                
//#line 1784
if (RX10_TEMP206) {
                    
//#line 1787
java.
                      lang.
                      String RX10_TEMP204 =
                      "Bad place access for array text2";
                    
//#line 1789
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP204);
                }
                
//#line 1792
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP199,
                                X10_TEMP286);
                
//#line 1794
int X10_TEMP288 =
                  1;
                
//#line 1797
int RX10_TEMP207 =
                  i2.
                    f0;
                
//#line 1800
RX10_TEMP207 =
                  RX10_TEMP207 +
                    X10_TEMP288;
                
//#line 1803
final Point1 X10_TEMP290 =
                  new Point1(
                  RX10_TEMP207);
                
//#line 1806
i2 =
                  X10_TEMP290;
                
//#line 1809
final int X10_TEMP292 =
                  8;
                
//#line 1812
final int X10_TEMP294 =
                  x3 >>>
                  X10_TEMP292;
                
//#line 1815
final byte X10_TEMP297 =
                  (byte)
                    (byte)
                      X10_TEMP294;
                
//#line 1818
final byte X10_TEMP298 =
                  (byte)
                    X10_TEMP297;
                
//#line 1821
final Dist1 RX10_TEMP208 =
                  text2.
                    distValue;
                
//#line 1824
final Region1 RX10_TEMP209 =
                  RX10_TEMP208.
                    dReg;
                
//#line 1827
final int RX10_TEMP210 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP209,
                    i2);
                
//#line 1830
final int RX10_TEMP211 =
                  0;
                
//#line 1833
final boolean RX10_TEMP212 =
                  RX10_TEMP210 <
                  RX10_TEMP211;
                
//#line 1835
if (RX10_TEMP212) {
                    
//#line 1838
java.
                      lang.
                      String RX10_TEMP213 =
                      "Array index out of bounds";
                    
//#line 1840
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP213);
                }
                
//#line 1844
final x10.
                  lang.
                  place RX10_TEMP214 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP208,
                    RX10_TEMP210);
                
//#line 1847
final x10.
                  lang.
                  place RX10_TEMP216 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1850
final boolean RX10_TEMP217 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP214,RX10_TEMP216))/* } */;
                
//#line 1852
if (RX10_TEMP217) {
                    
//#line 1855
java.
                      lang.
                      String RX10_TEMP215 =
                      "Bad place access for array text2";
                    
//#line 1857
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP215);
                }
                
//#line 1860
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP210,
                                X10_TEMP298);
                
//#line 1862
int X10_TEMP300 =
                  1;
                
//#line 1865
int RX10_TEMP218 =
                  i2.
                    f0;
                
//#line 1868
RX10_TEMP218 =
                  RX10_TEMP218 +
                    X10_TEMP300;
                
//#line 1871
final Point1 X10_TEMP302 =
                  new Point1(
                  RX10_TEMP218);
                
//#line 1874
i2 =
                  X10_TEMP302;
                
//#line 1877
final byte X10_TEMP306 =
                  (byte)
                    (byte)
                      x2;
                
//#line 1880
final byte X10_TEMP307 =
                  (byte)
                    X10_TEMP306;
                
//#line 1883
final Dist1 RX10_TEMP219 =
                  text2.
                    distValue;
                
//#line 1886
final Region1 RX10_TEMP220 =
                  RX10_TEMP219.
                    dReg;
                
//#line 1889
final int RX10_TEMP221 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP220,
                    i2);
                
//#line 1892
final int RX10_TEMP222 =
                  0;
                
//#line 1895
final boolean RX10_TEMP223 =
                  RX10_TEMP221 <
                  RX10_TEMP222;
                
//#line 1897
if (RX10_TEMP223) {
                    
//#line 1900
java.
                      lang.
                      String RX10_TEMP224 =
                      "Array index out of bounds";
                    
//#line 1902
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP224);
                }
                
//#line 1906
final x10.
                  lang.
                  place RX10_TEMP225 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP219,
                    RX10_TEMP221);
                
//#line 1909
final x10.
                  lang.
                  place RX10_TEMP227 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1912
final boolean RX10_TEMP228 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP225,RX10_TEMP227))/* } */;
                
//#line 1914
if (RX10_TEMP228) {
                    
//#line 1917
java.
                      lang.
                      String RX10_TEMP226 =
                      "Bad place access for array text2";
                    
//#line 1919
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP226);
                }
                
//#line 1922
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP221,
                                X10_TEMP307);
                
//#line 1924
int X10_TEMP309 =
                  1;
                
//#line 1927
int RX10_TEMP229 =
                  i2.
                    f0;
                
//#line 1930
RX10_TEMP229 =
                  RX10_TEMP229 +
                    X10_TEMP309;
                
//#line 1933
final Point1 X10_TEMP311 =
                  new Point1(
                  RX10_TEMP229);
                
//#line 1936
i2 =
                  X10_TEMP311;
                
//#line 1939
final int X10_TEMP313 =
                  8;
                
//#line 1942
final int X10_TEMP315 =
                  x2 >>>
                  X10_TEMP313;
                
//#line 1945
final byte X10_TEMP318 =
                  (byte)
                    (byte)
                      X10_TEMP315;
                
//#line 1948
final byte X10_TEMP319 =
                  (byte)
                    X10_TEMP318;
                
//#line 1951
final Dist1 RX10_TEMP230 =
                  text2.
                    distValue;
                
//#line 1954
final Region1 RX10_TEMP231 =
                  RX10_TEMP230.
                    dReg;
                
//#line 1957
final int RX10_TEMP232 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP231,
                    i2);
                
//#line 1960
final int RX10_TEMP233 =
                  0;
                
//#line 1963
final boolean RX10_TEMP234 =
                  RX10_TEMP232 <
                  RX10_TEMP233;
                
//#line 1965
if (RX10_TEMP234) {
                    
//#line 1968
java.
                      lang.
                      String RX10_TEMP235 =
                      "Array index out of bounds";
                    
//#line 1970
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP235);
                }
                
//#line 1974
final x10.
                  lang.
                  place RX10_TEMP236 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP230,
                    RX10_TEMP232);
                
//#line 1977
final x10.
                  lang.
                  place RX10_TEMP238 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1980
final boolean RX10_TEMP239 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP236,RX10_TEMP238))/* } */;
                
//#line 1982
if (RX10_TEMP239) {
                    
//#line 1985
java.
                      lang.
                      String RX10_TEMP237 =
                      "Bad place access for array text2";
                    
//#line 1987
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP237);
                }
                
//#line 1990
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP232,
                                X10_TEMP319);
                
//#line 1992
int X10_TEMP321 =
                  1;
                
//#line 1995
int RX10_TEMP240 =
                  i2.
                    f0;
                
//#line 1998
RX10_TEMP240 =
                  RX10_TEMP240 +
                    X10_TEMP321;
                
//#line 2001
final Point1 X10_TEMP323 =
                  new Point1(
                  RX10_TEMP240);
                
//#line 2004
i2 =
                  X10_TEMP323;
                
//#line 2007
final byte X10_TEMP327 =
                  (byte)
                    (byte)
                      x4;
                
//#line 2010
final byte X10_TEMP328 =
                  (byte)
                    X10_TEMP327;
                
//#line 2013
final Dist1 RX10_TEMP241 =
                  text2.
                    distValue;
                
//#line 2016
final Region1 RX10_TEMP242 =
                  RX10_TEMP241.
                    dReg;
                
//#line 2019
final int RX10_TEMP243 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP242,
                    i2);
                
//#line 2022
final int RX10_TEMP244 =
                  0;
                
//#line 2025
final boolean RX10_TEMP245 =
                  RX10_TEMP243 <
                  RX10_TEMP244;
                
//#line 2027
if (RX10_TEMP245) {
                    
//#line 2030
java.
                      lang.
                      String RX10_TEMP246 =
                      "Array index out of bounds";
                    
//#line 2032
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP246);
                }
                
//#line 2036
final x10.
                  lang.
                  place RX10_TEMP247 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP241,
                    RX10_TEMP243);
                
//#line 2039
final x10.
                  lang.
                  place RX10_TEMP249 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 2042
final boolean RX10_TEMP250 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP247,RX10_TEMP249))/* } */;
                
//#line 2044
if (RX10_TEMP250) {
                    
//#line 2047
java.
                      lang.
                      String RX10_TEMP248 =
                      "Bad place access for array text2";
                    
//#line 2049
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP248);
                }
                
//#line 2052
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP243,
                                X10_TEMP328);
                
//#line 2054
int X10_TEMP330 =
                  1;
                
//#line 2057
int RX10_TEMP251 =
                  i2.
                    f0;
                
//#line 2060
RX10_TEMP251 =
                  RX10_TEMP251 +
                    X10_TEMP330;
                
//#line 2063
final Point1 X10_TEMP332 =
                  new Point1(
                  RX10_TEMP251);
                
//#line 2066
i2 =
                  X10_TEMP332;
                
//#line 2069
final int X10_TEMP334 =
                  8;
                
//#line 2072
final int X10_TEMP336 =
                  x4 >>>
                  X10_TEMP334;
                
//#line 2075
final byte X10_TEMP339 =
                  (byte)
                    (byte)
                      X10_TEMP336;
                
//#line 2078
final byte X10_TEMP340 =
                  (byte)
                    X10_TEMP339;
                
//#line 2081
final Dist1 RX10_TEMP252 =
                  text2.
                    distValue;
                
//#line 2084
final Region1 RX10_TEMP253 =
                  RX10_TEMP252.
                    dReg;
                
//#line 2087
final int RX10_TEMP254 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP253,
                    i2);
                
//#line 2090
final int RX10_TEMP255 =
                  0;
                
//#line 2093
final boolean RX10_TEMP256 =
                  RX10_TEMP254 <
                  RX10_TEMP255;
                
//#line 2095
if (RX10_TEMP256) {
                    
//#line 2098
java.
                      lang.
                      String RX10_TEMP257 =
                      "Array index out of bounds";
                    
//#line 2100
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP257);
                }
                
//#line 2104
final x10.
                  lang.
                  place RX10_TEMP258 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP252,
                    RX10_TEMP254);
                
//#line 2107
final x10.
                  lang.
                  place RX10_TEMP260 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 2110
final boolean RX10_TEMP261 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP258,RX10_TEMP260))/* } */;
                
//#line 2112
if (RX10_TEMP261) {
                    
//#line 2115
java.
                      lang.
                      String RX10_TEMP259 =
                      "Bad place access for array text2";
                    
//#line 2117
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP259);
                }
                
//#line 2120
Program.
                                setRefArrayValue1byte(
                                text2,
                                RX10_TEMP254,
                                X10_TEMP340);
                
//#line 2122
int X10_TEMP342 =
                  1;
                
//#line 2125
int RX10_TEMP262 =
                  i2.
                    f0;
                
//#line 2128
RX10_TEMP262 =
                  RX10_TEMP262 +
                    X10_TEMP342;
                
//#line 2131
final Point1 X10_TEMP344 =
                  new Point1(
                  RX10_TEMP262);
                
//#line 2134
i2 =
                  X10_TEMP344;
            }
        }
    }
    
    
//#line 2139
public static int
                    IDEATest_mul(
                    final IDEATest X10_TEMP0,
                    final int aa,
                    final int ab) {
        
//#line 2142
int a =
          aa;
        
//#line 2145
int b =
          ab;
        
//#line 2148
long p =
          0L;
        
//#line 2151
final int X10_TEMP4 =
          0;
        
//#line 2154
final boolean X10_TEMP6 =
          a !=
          X10_TEMP4;
        
//#line 2156
if (X10_TEMP6) {
            
//#line 2159
final int X10_TEMP7 =
              0;
            
//#line 2162
final boolean X10_TEMP9 =
              b !=
              X10_TEMP7;
            
//#line 2164
if (X10_TEMP9) {
                
//#line 2167
final long X10_TEMP10 =
                  (long)
                    a;
                
//#line 2170
final long X10_TEMP12 =
                  X10_TEMP10 *
                  b;
                
//#line 2173
p =
                  X10_TEMP12;
                
//#line 2176
final int X10_TEMP13 =
                  (int)
                    p;
                
//#line 2179
final int X10_TEMP14 =
                  65535;
                
//#line 2182
final int X10_TEMP16 =
                  X10_TEMP13 &
                  X10_TEMP14;
                
//#line 2185
b =
                  X10_TEMP16;
                
//#line 2188
final int X10_TEMP17 =
                  (int)
                    p;
                
//#line 2191
final int X10_TEMP18 =
                  16;
                
//#line 2194
final int X10_TEMP20 =
                  X10_TEMP17 >>>
                  X10_TEMP18;
                
//#line 2197
a =
                  X10_TEMP20;
                
//#line 2200
final int X10_TEMP27 =
                  b -
                  a;
                
//#line 2203
final boolean X10_TEMP21 =
                  b <
                  a;
                
//#line 2206
int X10_TEMP24 =
                  0;
                
//#line 2208
if (X10_TEMP21) {
                    
//#line 2211
X10_TEMP24 =
                      1;
                }
                
//#line 2215
final int X10_TEMP25 =
                  X10_TEMP24;
                
//#line 2218
final int X10_TEMP26 =
                  X10_TEMP25;
                
//#line 2221
final int X10_TEMP28 =
                  X10_TEMP27 +
                  X10_TEMP26;
                
//#line 2224
final int X10_TEMP29 =
                  65535;
                
//#line 2227
final int X10_TEMP31 =
                  X10_TEMP28 &
                  X10_TEMP29;
                
//#line 2229
return X10_TEMP31;
            } else {
                
//#line 2234
final int X10_TEMP33 =
                  1;
                
//#line 2237
final int X10_TEMP35 =
                  X10_TEMP33 -
                  a;
                
//#line 2240
final int X10_TEMP36 =
                  65535;
                
//#line 2243
final int X10_TEMP38 =
                  X10_TEMP35 &
                  X10_TEMP36;
                
//#line 2245
return X10_TEMP38;
            }
        } else {
            
//#line 2251
final int X10_TEMP40 =
              1;
            
//#line 2254
final int X10_TEMP42 =
              X10_TEMP40 -
              b;
            
//#line 2257
final int X10_TEMP43 =
              65535;
            
//#line 2260
final int X10_TEMP45 =
              X10_TEMP42 &
              X10_TEMP43;
            
//#line 2262
return X10_TEMP45;
        }
    }
    
    
//#line 2265
public static long
                    _Random_multiplier_init(
                    ) {
        
//#line 2268
final long X10_TEMP2 =
          25214903917L;
        
//#line 2270
return X10_TEMP2;
    }
    
    
//#line 2272
public static long
                    _Random_addend_init(
                    ) {
        
//#line 2275
final long X10_TEMP2 =
          11L;
        
//#line 2277
return X10_TEMP2;
    }
    
    
//#line 2279
public static long
                    _Random_mask_init(
                    ) {
        
//#line 2282
final long X10_TEMP1 =
          1L;
        
//#line 2285
final int X10_TEMP2 =
          48;
        
//#line 2288
final long X10_TEMP4 =
          X10_TEMP1 <<
          X10_TEMP2;
        
//#line 2291
final int X10_TEMP5 =
          1;
        
//#line 2294
final long X10_TEMP7 =
          X10_TEMP4 -
          X10_TEMP5;
        
//#line 2296
return X10_TEMP7;
    }
    
    
//#line 2298
public static int
                    Random_nextbits(
                    final Random X10_TEMP0,
                    final int bits) {
        
//#line 2301
long oldseed =
          /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed;
        
//#line 2304
final long X10_TEMP2 =
          oldseed *
          _Random_multiplier;
        
//#line 2307
final long X10_TEMP4 =
          X10_TEMP2 +
          _Random_addend;
        
//#line 2310
long nextseed =
          X10_TEMP4 &
          _Random_mask;
        
//#line 2313
final long X10_TEMP8 =
          nextseed;
        
//#line 2315
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed =
          ((X10_TEMP8));
        
//#line 2317
final int X10_TEMP9 =
          48;
        
//#line 2320
final int X10_TEMP11 =
          X10_TEMP9 -
          bits;
        
//#line 2323
final long X10_TEMP13 =
          nextseed >>>
          X10_TEMP11;
        
//#line 2326
final int X10_TEMP15 =
          (int)
            X10_TEMP13;
        
//#line 2328
return X10_TEMP15;
    }
    
    
//#line 2330
public static int
                    Random_nextInt(
                    final Random X10_TEMP0) {
        
//#line 2333
final int X10_TEMP2 =
          32;
        
//#line 2336
final int X10_TEMP4 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP2);
        
//#line 2338
return X10_TEMP4;
    }
    
    
//#line 2340
public static long
                    Random_nextLong(
                    final Random X10_TEMP0) {
        
//#line 2343
final int X10_TEMP2 =
          32;
        
//#line 2346
final int X10_TEMP4 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP2);
        
//#line 2349
final long X10_TEMP5 =
          (long)
            X10_TEMP4;
        
//#line 2352
final int X10_TEMP6 =
          32;
        
//#line 2355
final long X10_TEMP8 =
          X10_TEMP5 <<
          X10_TEMP6;
        
//#line 2358
final int X10_TEMP10 =
          32;
        
//#line 2361
final int X10_TEMP11 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP10);
        
//#line 2364
final long X10_TEMP13 =
          X10_TEMP8 +
          X10_TEMP11;
        
//#line 2366
return X10_TEMP13;
    }
    
    
//#line 2368
public static boolean
                    Random_nextBoolean(
                    final Random X10_TEMP0) {
        
//#line 2371
final int X10_TEMP2 =
          1;
        
//#line 2374
final int X10_TEMP3 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP2);
        
//#line 2377
final int X10_TEMP4 =
          0;
        
//#line 2380
final boolean X10_TEMP6 =
          X10_TEMP3 !=
          X10_TEMP4;
        
//#line 2382
return X10_TEMP6;
    }
    
    
//#line 2384
public static double
                    Random_nextDouble(
                    final Random X10_TEMP0) {
        
//#line 2387
final int X10_TEMP2 =
          26;
        
//#line 2390
final int X10_TEMP4 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP2);
        
//#line 2393
final long X10_TEMP5 =
          (long)
            X10_TEMP4;
        
//#line 2396
final int X10_TEMP6 =
          27;
        
//#line 2399
final long X10_TEMP8 =
          X10_TEMP5 <<
          X10_TEMP6;
        
//#line 2402
final int X10_TEMP10 =
          27;
        
//#line 2405
final int X10_TEMP11 =
          Program.
            Random_nextbits(
            X10_TEMP0,
            X10_TEMP10);
        
//#line 2408
final long X10_TEMP13 =
          X10_TEMP8 +
          X10_TEMP11;
        
//#line 2411
final long X10_TEMP14 =
          1L;
        
//#line 2414
final int X10_TEMP15 =
          53;
        
//#line 2417
final long X10_TEMP17 =
          X10_TEMP14 <<
          X10_TEMP15;
        
//#line 2420
final double X10_TEMP18 =
          (double)
            X10_TEMP17;
        
//#line 2423
final double X10_TEMP20 =
          X10_TEMP13 /
          X10_TEMP18;
        
//#line 2425
return X10_TEMP20;
    }
    
    
//#line 2427
public static int
                    _Timer_max_counters_init(
                    ) {
        
//#line 2430
final int X10_TEMP2 =
          64;
        
//#line 2432
return X10_TEMP2;
    }
    
    
//#line 2434
public static void
                    Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2437
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 2440
final double X10_TEMP5 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 2443
final double X10_TEMP6 =
          X10_TEMP5;
        
//#line 2446
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 2449
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 2452
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 2455
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 2458
final int RX10_TEMP4 =
          0;
        
//#line 2461
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 2463
if (RX10_TEMP5) {
            
//#line 2466
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 2468
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 2472
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 2475
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2478
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 2480
if (RX10_TEMP10) {
            
//#line 2483
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 2485
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 2488
Program.
                        setRefArrayValue1double(
                        X10_TEMP1,
                        RX10_TEMP3,
                        X10_TEMP6);
    }
    
    
//#line 2490
public static void
                    Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2493
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 2496
final double X10_TEMP5 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 2499
final doubleRefArray1 X10_TEMP3 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 2502
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 2505
final Dist1 RX10_TEMP1 =
          X10_TEMP3.
            distValue;
        
//#line 2508
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 2511
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 2514
final int RX10_TEMP4 =
          0;
        
//#line 2517
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 2519
if (RX10_TEMP5) {
            
//#line 2522
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 2524
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 2528
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 2531
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2534
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 2536
if (RX10_TEMP10) {
            
//#line 2539
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP3";
            
//#line 2541
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 2545
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP3,
            RX10_TEMP3);
        
//#line 2548
final double X10_TEMP6 =
          RX10_TEMP11;
        
//#line 2551
final double X10_TEMP9 =
          X10_TEMP5 -
          X10_TEMP6;
        
//#line 2554
final double X10_TEMP10 =
          X10_TEMP9;
        
//#line 2557
final Point1 RX10_TEMP12 =
          new Point1(
          n);
        
//#line 2560
final Dist1 RX10_TEMP13 =
          X10_TEMP1.
            distValue;
        
//#line 2563
final Region1 RX10_TEMP14 =
          RX10_TEMP13.
            dReg;
        
//#line 2566
final int RX10_TEMP15 =
          Program.
            searchPointInRegion1(
            RX10_TEMP14,
            RX10_TEMP12);
        
//#line 2569
final int RX10_TEMP16 =
          0;
        
//#line 2572
final boolean RX10_TEMP17 =
          RX10_TEMP15 <
          RX10_TEMP16;
        
//#line 2574
if (RX10_TEMP17) {
            
//#line 2577
java.
              lang.
              String RX10_TEMP18 =
              "Array index out of bounds";
            
//#line 2579
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP18);
        }
        
//#line 2583
final x10.
          lang.
          place RX10_TEMP19 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP13,
            RX10_TEMP15);
        
//#line 2586
final x10.
          lang.
          place RX10_TEMP21 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2589
final boolean RX10_TEMP22 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
        
//#line 2591
if (RX10_TEMP22) {
            
//#line 2594
java.
              lang.
              String RX10_TEMP20 =
              "Bad place access for array X10_TEMP1";
            
//#line 2596
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP20);
        }
        
//#line 2599
Program.
                        setRefArrayValue1double(
                        X10_TEMP1,
                        RX10_TEMP15,
                        X10_TEMP10);
        
//#line 2601
final doubleRefArray1 X10_TEMP11 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 2604
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 2607
final Point1 RX10_TEMP23 =
          new Point1(
          n);
        
//#line 2610
final Dist1 RX10_TEMP24 =
          X10_TEMP13.
            distValue;
        
//#line 2613
final Region1 RX10_TEMP25 =
          RX10_TEMP24.
            dReg;
        
//#line 2616
final int RX10_TEMP26 =
          Program.
            searchPointInRegion1(
            RX10_TEMP25,
            RX10_TEMP23);
        
//#line 2619
final int RX10_TEMP27 =
          0;
        
//#line 2622
final boolean RX10_TEMP28 =
          RX10_TEMP26 <
          RX10_TEMP27;
        
//#line 2624
if (RX10_TEMP28) {
            
//#line 2627
java.
              lang.
              String RX10_TEMP29 =
              "Array access index out of bounds";
            
//#line 2629
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP29);
        }
        
//#line 2633
final x10.
          lang.
          place RX10_TEMP30 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP24,
            RX10_TEMP26);
        
//#line 2636
final x10.
          lang.
          place RX10_TEMP32 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2639
final boolean RX10_TEMP33 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP30,RX10_TEMP32))/* } */;
        
//#line 2641
if (RX10_TEMP33) {
            
//#line 2644
java.
              lang.
              String RX10_TEMP31 =
              "Bad place access for array X10_TEMP13";
            
//#line 2646
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP31);
        }
        
//#line 2650
final double RX10_TEMP34 =
          Program.
            getRefArrayValue1double(
            X10_TEMP13,
            RX10_TEMP26);
        
//#line 2653
final double X10_TEMP15 =
          RX10_TEMP34;
        
//#line 2656
final int X10_TEMP16 =
          1000;
        
//#line 2659
final double X10_TEMP19 =
          X10_TEMP15 /
          X10_TEMP16;
        
//#line 2662
final double X10_TEMP20 =
          X10_TEMP19;
        
//#line 2665
final Point1 RX10_TEMP35 =
          new Point1(
          n);
        
//#line 2668
final Dist1 RX10_TEMP36 =
          X10_TEMP11.
            distValue;
        
//#line 2671
final Region1 RX10_TEMP37 =
          RX10_TEMP36.
            dReg;
        
//#line 2674
final int RX10_TEMP38 =
          Program.
            searchPointInRegion1(
            RX10_TEMP37,
            RX10_TEMP35);
        
//#line 2677
final int RX10_TEMP39 =
          0;
        
//#line 2680
final boolean RX10_TEMP40 =
          RX10_TEMP38 <
          RX10_TEMP39;
        
//#line 2682
if (RX10_TEMP40) {
            
//#line 2685
java.
              lang.
              String RX10_TEMP41 =
              "Array index out of bounds";
            
//#line 2687
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP41);
        }
        
//#line 2691
final x10.
          lang.
          place RX10_TEMP42 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP36,
            RX10_TEMP38);
        
//#line 2694
final x10.
          lang.
          place RX10_TEMP44 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2697
final boolean RX10_TEMP45 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP42,RX10_TEMP44))/* } */;
        
//#line 2699
if (RX10_TEMP45) {
            
//#line 2702
java.
              lang.
              String RX10_TEMP43 =
              "Bad place access for array X10_TEMP11";
            
//#line 2704
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP43);
        }
        
//#line 2707
Program.
                        setRefArrayValue1double(
                        X10_TEMP11,
                        RX10_TEMP38,
                        X10_TEMP20);
        
//#line 2709
final doubleRefArray1 X10_TEMP21 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 2712
final doubleRefArray1 X10_TEMP23 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 2715
final Point1 RX10_TEMP46 =
          new Point1(
          n);
        
//#line 2718
final Dist1 RX10_TEMP47 =
          X10_TEMP23.
            distValue;
        
//#line 2721
final Region1 RX10_TEMP48 =
          RX10_TEMP47.
            dReg;
        
//#line 2724
final int RX10_TEMP49 =
          Program.
            searchPointInRegion1(
            RX10_TEMP48,
            RX10_TEMP46);
        
//#line 2727
final int RX10_TEMP50 =
          0;
        
//#line 2730
final boolean RX10_TEMP51 =
          RX10_TEMP49 <
          RX10_TEMP50;
        
//#line 2732
if (RX10_TEMP51) {
            
//#line 2735
java.
              lang.
              String RX10_TEMP52 =
              "Array access index out of bounds";
            
//#line 2737
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP52);
        }
        
//#line 2741
final x10.
          lang.
          place RX10_TEMP53 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP47,
            RX10_TEMP49);
        
//#line 2744
final x10.
          lang.
          place RX10_TEMP55 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2747
final boolean RX10_TEMP56 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP53,RX10_TEMP55))/* } */;
        
//#line 2749
if (RX10_TEMP56) {
            
//#line 2752
java.
              lang.
              String RX10_TEMP54 =
              "Bad place access for array X10_TEMP23";
            
//#line 2754
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP54);
        }
        
//#line 2758
final double RX10_TEMP57 =
          Program.
            getRefArrayValue1double(
            X10_TEMP23,
            RX10_TEMP49);
        
//#line 2761
final double X10_TEMP27 =
          RX10_TEMP57;
        
//#line 2764
final doubleRefArray1 X10_TEMP25 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 2767
final Point1 RX10_TEMP58 =
          new Point1(
          n);
        
//#line 2770
final Dist1 RX10_TEMP59 =
          X10_TEMP25.
            distValue;
        
//#line 2773
final Region1 RX10_TEMP60 =
          RX10_TEMP59.
            dReg;
        
//#line 2776
final int RX10_TEMP61 =
          Program.
            searchPointInRegion1(
            RX10_TEMP60,
            RX10_TEMP58);
        
//#line 2779
final int RX10_TEMP62 =
          0;
        
//#line 2782
final boolean RX10_TEMP63 =
          RX10_TEMP61 <
          RX10_TEMP62;
        
//#line 2784
if (RX10_TEMP63) {
            
//#line 2787
java.
              lang.
              String RX10_TEMP64 =
              "Array access index out of bounds";
            
//#line 2789
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP64);
        }
        
//#line 2793
final x10.
          lang.
          place RX10_TEMP65 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP59,
            RX10_TEMP61);
        
//#line 2796
final x10.
          lang.
          place RX10_TEMP67 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2799
final boolean RX10_TEMP68 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP65,RX10_TEMP67))/* } */;
        
//#line 2801
if (RX10_TEMP68) {
            
//#line 2804
java.
              lang.
              String RX10_TEMP66 =
              "Bad place access for array X10_TEMP25";
            
//#line 2806
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP66);
        }
        
//#line 2810
final double RX10_TEMP69 =
          Program.
            getRefArrayValue1double(
            X10_TEMP25,
            RX10_TEMP61);
        
//#line 2813
final double X10_TEMP28 =
          RX10_TEMP69;
        
//#line 2816
final double X10_TEMP31 =
          X10_TEMP27 +
          X10_TEMP28;
        
//#line 2819
final double X10_TEMP32 =
          X10_TEMP31;
        
//#line 2822
final Point1 RX10_TEMP70 =
          new Point1(
          n);
        
//#line 2825
final Dist1 RX10_TEMP71 =
          X10_TEMP21.
            distValue;
        
//#line 2828
final Region1 RX10_TEMP72 =
          RX10_TEMP71.
            dReg;
        
//#line 2831
final int RX10_TEMP73 =
          Program.
            searchPointInRegion1(
            RX10_TEMP72,
            RX10_TEMP70);
        
//#line 2834
final int RX10_TEMP74 =
          0;
        
//#line 2837
final boolean RX10_TEMP75 =
          RX10_TEMP73 <
          RX10_TEMP74;
        
//#line 2839
if (RX10_TEMP75) {
            
//#line 2842
java.
              lang.
              String RX10_TEMP76 =
              "Array index out of bounds";
            
//#line 2844
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP76);
        }
        
//#line 2848
final x10.
          lang.
          place RX10_TEMP77 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP71,
            RX10_TEMP73);
        
//#line 2851
final x10.
          lang.
          place RX10_TEMP79 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2854
final boolean RX10_TEMP80 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP77,RX10_TEMP79))/* } */;
        
//#line 2856
if (RX10_TEMP80) {
            
//#line 2859
java.
              lang.
              String RX10_TEMP78 =
              "Bad place access for array X10_TEMP21";
            
//#line 2861
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP78);
        }
        
//#line 2864
Program.
                        setRefArrayValue1double(
                        X10_TEMP21,
                        RX10_TEMP73,
                        X10_TEMP32);
    }
    
    
//#line 2866
public static double
                    Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2869
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 2872
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 2875
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 2878
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 2881
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 2884
final int RX10_TEMP4 =
          0;
        
//#line 2887
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 2889
if (RX10_TEMP5) {
            
//#line 2892
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 2894
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 2898
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 2901
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2904
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 2906
if (RX10_TEMP10) {
            
//#line 2909
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 2911
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 2915
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP1,
            RX10_TEMP3);
        
//#line 2918
final double X10_TEMP4 =
          RX10_TEMP11;
        
//#line 2920
return X10_TEMP4;
    }
    
    
//#line 2922
public static void
                    Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2925
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 2928
final double X10_TEMP5 =
          0;
        
//#line 2931
final double X10_TEMP6 =
          X10_TEMP5;
        
//#line 2934
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 2937
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 2940
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 2943
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 2946
final int RX10_TEMP4 =
          0;
        
//#line 2949
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 2951
if (RX10_TEMP5) {
            
//#line 2954
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 2956
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 2960
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 2963
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2966
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 2968
if (RX10_TEMP10) {
            
//#line 2971
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 2973
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 2976
Program.
                        setRefArrayValue1double(
                        X10_TEMP1,
                        RX10_TEMP3,
                        X10_TEMP6);
        
//#line 2978
final doubleRefArray1 X10_TEMP7 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 2981
final double X10_TEMP11 =
          0;
        
//#line 2984
final double X10_TEMP12 =
          X10_TEMP11;
        
//#line 2987
final Point1 RX10_TEMP11 =
          new Point1(
          n);
        
//#line 2990
final Dist1 RX10_TEMP12 =
          X10_TEMP7.
            distValue;
        
//#line 2993
final Region1 RX10_TEMP13 =
          RX10_TEMP12.
            dReg;
        
//#line 2996
final int RX10_TEMP14 =
          Program.
            searchPointInRegion1(
            RX10_TEMP13,
            RX10_TEMP11);
        
//#line 2999
final int RX10_TEMP15 =
          0;
        
//#line 3002
final boolean RX10_TEMP16 =
          RX10_TEMP14 <
          RX10_TEMP15;
        
//#line 3004
if (RX10_TEMP16) {
            
//#line 3007
java.
              lang.
              String RX10_TEMP17 =
              "Array index out of bounds";
            
//#line 3009
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP17);
        }
        
//#line 3013
final x10.
          lang.
          place RX10_TEMP18 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP12,
            RX10_TEMP14);
        
//#line 3016
final x10.
          lang.
          place RX10_TEMP20 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3019
final boolean RX10_TEMP21 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP18,RX10_TEMP20))/* } */;
        
//#line 3021
if (RX10_TEMP21) {
            
//#line 3024
java.
              lang.
              String RX10_TEMP19 =
              "Bad place access for array X10_TEMP7";
            
//#line 3026
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP19);
        }
        
//#line 3029
Program.
                        setRefArrayValue1double(
                        X10_TEMP7,
                        RX10_TEMP14,
                        X10_TEMP12);
        
//#line 3031
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 3034
final double X10_TEMP17 =
          0;
        
//#line 3037
final double X10_TEMP18 =
          X10_TEMP17;
        
//#line 3040
final Point1 RX10_TEMP22 =
          new Point1(
          n);
        
//#line 3043
final Dist1 RX10_TEMP23 =
          X10_TEMP13.
            distValue;
        
//#line 3046
final Region1 RX10_TEMP24 =
          RX10_TEMP23.
            dReg;
        
//#line 3049
final int RX10_TEMP25 =
          Program.
            searchPointInRegion1(
            RX10_TEMP24,
            RX10_TEMP22);
        
//#line 3052
final int RX10_TEMP26 =
          0;
        
//#line 3055
final boolean RX10_TEMP27 =
          RX10_TEMP25 <
          RX10_TEMP26;
        
//#line 3057
if (RX10_TEMP27) {
            
//#line 3060
java.
              lang.
              String RX10_TEMP28 =
              "Array index out of bounds";
            
//#line 3062
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP28);
        }
        
//#line 3066
final x10.
          lang.
          place RX10_TEMP29 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP23,
            RX10_TEMP25);
        
//#line 3069
final x10.
          lang.
          place RX10_TEMP31 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3072
final boolean RX10_TEMP32 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP29,RX10_TEMP31))/* } */;
        
//#line 3074
if (RX10_TEMP32) {
            
//#line 3077
java.
              lang.
              String RX10_TEMP30 =
              "Bad place access for array X10_TEMP13";
            
//#line 3079
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP30);
        }
        
//#line 3082
Program.
                        setRefArrayValue1double(
                        X10_TEMP13,
                        RX10_TEMP25,
                        X10_TEMP18);
    }
    
    
//#line 3084
public static void
                    Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 3087
int i =
          0;
        
//#line 3090
boolean X10_TEMP4 =
          i <
          _Timer_max_counters;
        
//#line 3092
while (X10_TEMP4) {
            
//#line 3094
Program.
                            Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 3096
final int X10_TEMP6 =
              i;
            
//#line 3099
final int X10_TEMP7 =
              1;
            
//#line 3102
i =
              i +
                X10_TEMP7;
            
//#line 3105
X10_TEMP4 =
              i <
                _Timer_max_counters;
        }
    }
    
    
//#line 3109
public static double
                    getRefArrayValue1double(
                    final doubleRefArray1 array,
                    final int index) {
        
//#line 3112
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3115
final int placeIndex =
          pl.
            id;
        
//#line 3118
final Dist1 dArray =
          array.
            distValue;
        
//#line 3121
final Dist dDist =
          dArray.
            dDist;
        
//#line 3124
final int[] runSum =
          dDist.
            runningSum;
        
//#line 3127
final int localIndex =
          runSum[index];
        
//#line 3130
final doubleStub[] contents =
          array.
            contents;
        
//#line 3133
final doubleStub indexStub =
          contents[placeIndex];
        
//#line 3136
final double[] localArray =
          indexStub.
            localArray;
        
//#line 3139
final double returnValue =
          localArray[localIndex];
        
//#line 3141
return returnValue;
    }
    
    
//#line 3143
public static int
                    constantSearchRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 3146
final int zero =
          0;
        
//#line 3149
final int one =
          1;
        
//#line 3152
final int dim0 =
          r.
            dim0;
        
//#line 3155
final int low0 =
          r.
            low0;
        
//#line 3158
final int high0 =
          low0 +
          dim0;
        
//#line 3161
int pt0 =
          target.
            f0;
        
//#line 3164
final boolean lbound0 =
          pt0 <
          low0;
        
//#line 3167
final boolean hbound0 =
          pt0 >=
          high0;
        
//#line 3170
final int dim1 =
          1;
        
//#line 3173
boolean outRegion =
          false;
        
//#line 3176
outRegion =
          (outRegion ||
             lbound0);
        
//#line 3179
outRegion =
          (outRegion ||
             hbound0);
        
//#line 3181
if (outRegion) {
            
//#line 3184
int notFound =
              0;
            
//#line 3187
notFound =
              notFound -
                one;
            
//#line 3189
return notFound;
        }
        
//#line 3192
final int stride1 =
          1;
        
//#line 3195
final int stride0 =
          stride1 *
          dim1;
        
//#line 3198
pt0 =
          pt0 -
            low0;
        
//#line 3201
final int offset0 =
          stride0 *
          pt0;
        
//#line 3204
int found =
          0;
        
//#line 3207
found =
          found +
            offset0;
        
//#line 3209
return found;
    }
    
    
//#line 3211
public static Dist1
                    restrictDist1(
                    final Dist1 d,
                    final x10.
                      lang.
                      place p) {
        
//#line 3214
final int zero =
          0;
        
//#line 3217
final int one =
          1;
        
//#line 3220
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3223
final Region1 dReg =
          d.
            dReg;
        
//#line 3226
final Dist dDist =
          d.
            dDist;
        
//#line 3229
final int dim =
          dReg.
            regSize;
        
//#line 3232
final int dimMinusOne =
          dim -
          one;
        
//#line 3235
final int dRegReg =
          dimMinusOne +
          1;
        
//#line 3238
final Point1[] dArray =
          (Point1[])
            ((dReg.
                pointArray));
        
//#line 3241
final x10.
          lang.
          place[] dPlace =
          (x10.
            lang.
            place[])
            ((dDist.
                placeArray));
        
//#line 3244
final int[] dCounts =
          (int[])
            ((dDist.
                counts));
        
//#line 3247
final int index =
          p.
            id;
        
//#line 3250
int numPoints =
          dCounts[index];
        
//#line 3253
final int rSizeNumPoints =
          numPoints;
        
//#line 3256
final int rSize =
          numPoints -
          one;
        
//#line 3259
final int tempReg =
          rSize +
          1;
        
//#line 3262
final int tempDist =
          rSize +
          1;
        
//#line 3265
final x10.
          lang.
          place[] rPlace =
          (x10.
            lang.
            place[])
            ((new x10.
                lang.
                place[tempReg]));
        
//#line 3267
for (
//#line 3267
int pt =
                             0;
                           pt <
                             rPlace.
                               length;
                           
//#line 3267
pt++) {
            
//#line 3268
rPlace[pt] =
              p;
        }
        
//#line 3271
;
        
//#line 3274
final int[] tempArray =
          new int[tempDist];
        
//#line 3277
final boolean cond1 =
          numPoints >
          zero;
        
//#line 3279
if (cond1) {
            
//#line 3282
numPoints =
              0;
            
//#line 3284
for (
//#line 3284
int pt =
                                 0;
                               pt <
                                 dRegReg;
                               
//#line 3284
pt++) {
                
//#line 3287
final x10.
                  lang.
                  place dP =
                  dPlace[pt];
                
//#line 3290
final boolean cond2 =
                  /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
                
//#line 3292
if (cond2) {
                    
//#line 3295
final int i =
                      pt;
                    
//#line 3297
tempArray[numPoints] =
                      i;
                    
//#line 3299
numPoints =
                      numPoints +
                        one;
                }
            }
        }
        
//#line 3305
final Point1[] pointArray =
          (Point1[])
            ((new Point1[tempReg]));
        
//#line 3307
for (
//#line 3307
int pt =
                             0;
                           pt <
                             pointArray.
                               length;
                           
//#line 3307
pt++) {
            
//#line 3309
final int idx =
              tempArray[pt];
            
//#line 3312
final Point1 dpt =
              dArray[idx];
            
//#line 3314
pointArray[pt] =
              dpt;
        }
        
//#line 3317
;
        
//#line 3320
final Region1 dpReg =
          new Region1(
          pointArray);
        
//#line 3323
final Dist dpDist =
          new Dist(
          rPlace,
          rSizeNumPoints);
        
//#line 3326
final Dist1 dpDistn =
          new Dist1(
          dpReg,
          dpDist);
        
//#line 3328
return dpDistn;
    }
    
    
//#line 3330
public static java.
                    lang.
                    String
                    toStringPoint1(
                    final Point1 p) {
        
//#line 3333
java.
          lang.
          String str =
          "";
        
//#line 3336
final int f0 =
          p.
            f0;
        
//#line 3339
java.
          lang.
          String lSq =
          "[";
        
//#line 3342
java.
          lang.
          String rSq =
          "]";
        
//#line 3345
str =
          str +
          lSq;
        
//#line 3348
str =
          str +
          f0;
        
//#line 3351
str =
          str +
          rSq;
        
//#line 3353
return str;
    }
    
    
//#line 3355
public static int
                    binarySearchRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 3358
final Point1[] pointArray =
          (Point1[])
            ((r.
                pointArray));
        
//#line 3361
int start =
          0;
        
//#line 3364
int end =
          r.
            regSize;
        
//#line 3367
final int zero =
          0;
        
//#line 3370
final int one =
          1;
        
//#line 3373
final int two =
          2;
        
//#line 3376
end =
          end -
            one;
        
//#line 3379
int result =
          zero -
          one;
        
//#line 3382
boolean notDone =
          start <=
          end;
        
//#line 3384
while (notDone) {
            
//#line 3387
int mid =
              start +
              end;
            
//#line 3390
mid =
              mid /
                two;
            
//#line 3393
final Point1 temp =
              pointArray[mid];
            
//#line 3396
final int pointCompare =
              Program.
                comparePoint1(
                target,
                temp);
            
//#line 3399
final boolean eq =
              pointCompare ==
              zero;
            
//#line 3402
final boolean lt =
              pointCompare ==
              one;
            
//#line 3404
if (eq) {
                
//#line 3406
return mid;
            } else {
                
//#line 3410
if (lt) {
                    
//#line 3413
end =
                      mid -
                        one;
                } else {
                    
//#line 3419
start =
                      mid +
                        one;
                }
            }
            
//#line 3424
notDone =
              start <=
                end;
        }
        
//#line 3427
return result;
    }
    
    
//#line 3429
public static Dist1
                    getBlockDist1(
                    final Region1 r) {
        
//#line 3432
final int rSize =
          r.
            regSize;
        
//#line 3435
final int zero =
          0;
        
//#line 3438
final int one =
          1;
        
//#line 3441
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 3444
final int dReg =
          rSizeMinusOne +
          1;
        
//#line 3447
final int dDist =
          rSizeMinusOne +
          1;
        
//#line 3450
final x10.
          lang.
          place[] placeArray =
          new x10.
          lang.
          place[dDist];
        
//#line 3453
final int N =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 3456
final int q =
          rSize %
          N;
        
//#line 3459
final int p =
          rSize /
          N;
        
//#line 3462
int blockSize =
          p +
          one;
        
//#line 3465
int arraySize =
          q *
          blockSize;
        
//#line 3468
int offset =
          0;
        
//#line 3471
x10.
          lang.
          place initPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 3473
Program.
                        getCyclic(
                        placeArray,
                        arraySize,
                        initPlace,
                        blockSize);
        
//#line 3475
int remainingPlaces =
          N -
          q;
        
//#line 3478
final boolean cond =
          remainingPlaces ==
          zero;
        
//#line 3480
if (cond) {
            
//#line 3483
final x10.
              lang.
              place[] vPlaceArray =
              (x10.
                lang.
                place[])
                ((new x10.
                    lang.
                    place[dReg]));
            
//#line 3485
for (
//#line 3485
int pt =
                                 0;
                               pt <
                                 vPlaceArray.
                                   length;
                               
//#line 3485
pt++) {
                
//#line 3487
final x10.
                  lang.
                  place tempPl =
                  placeArray[pt];
                
//#line 3489
vPlaceArray[pt] =
                  tempPl;
            }
            
//#line 3492
;
            
//#line 3495
final Dist pointDist1 =
              new Dist(
              vPlaceArray,
              rSize);
            
//#line 3498
final Dist1 retDist =
              new Dist1(
              r,
              pointDist1);
            
//#line 3500
return retDist;
        }
        
//#line 3503
offset =
          arraySize;
        
//#line 3506
blockSize =
          p;
        
//#line 3509
arraySize =
          remainingPlaces *
            blockSize;
        
//#line 3512
initPlace =
          x10.
            lang.
            place.
            places(
            q);
        
//#line 3515
int chunk =
          blockSize;
        
//#line 3518
final boolean ifCond =
          blockSize >
          arraySize;
        
//#line 3520
if (ifCond) {
            
//#line 3523
chunk =
              arraySize;
        }
        
//#line 3527
int index =
          offset;
        
//#line 3530
int dSize =
          index +
          chunk;
        
//#line 3533
dSize =
          dSize -
            one;
        
//#line 3536
final int ub0 =
          chunk -
          one;
        
//#line 3539
final int pointReg0 =
          ub0 +
          1;
        
//#line 3541
for (
//#line 3541
int pt =
                             0;
                           pt <
                             pointReg0;
                           
//#line 3541
pt++) {
            
//#line 3544
final int tempPt =
              pt +
              index;
            
//#line 3546
placeArray[tempPt] =
              initPlace;
        }
        
//#line 3549
index =
          index +
            chunk;
        
//#line 3552
arraySize =
          arraySize -
            chunk;
        
//#line 3555
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 3558
boolean whileCond =
          arraySize !=
          zero;
        
//#line 3560
while (whileCond) {
            
//#line 3563
final boolean tailCond =
              chunk >
              arraySize;
            
//#line 3565
if (tailCond) {
                
//#line 3568
dSize =
                  index +
                    arraySize;
                
//#line 3571
dSize =
                  dSize -
                    one;
                
//#line 3574
final int ub =
                  arraySize -
                  one;
                
//#line 3577
final int pointReg1 =
                  ub +
                  1;
                
//#line 3579
for (
//#line 3579
int pt =
                                     0;
                                   pt <
                                     pointReg1;
                                   
//#line 3579
pt++) {
                    
//#line 3582
final int tempPt =
                      pt +
                      index;
                    
//#line 3584
placeArray[tempPt] =
                      pl;
                }
                
//#line 3587
arraySize =
                  0;
            } else {
                
//#line 3593
dSize =
                  index +
                    chunk;
                
//#line 3596
dSize =
                  dSize -
                    one;
                
//#line 3599
final int ub =
                  chunk -
                  one;
                
//#line 3602
final int pointReg1 =
                  ub +
                  1;
                
//#line 3604
for (
//#line 3604
int pt =
                                     0;
                                   pt <
                                     pointReg1;
                                   
//#line 3604
pt++) {
                    
//#line 3607
final int tempPt =
                      pt +
                      index;
                    
//#line 3609
placeArray[tempPt] =
                      pl;
                }
                
//#line 3612
index =
                  index +
                    chunk;
                
//#line 3615
arraySize =
                  arraySize -
                    chunk;
            }
            
//#line 3619
pl =
              pl.
                next();
            
//#line 3622
whileCond =
              arraySize !=
                zero;
        }
        
//#line 3626
final x10.
          lang.
          place[] vPlaceArray =
          (x10.
            lang.
            place[])
            ((new x10.
                lang.
                place[dReg]));
        
//#line 3628
for (
//#line 3628
int pt =
                             0;
                           pt <
                             vPlaceArray.
                               length;
                           
//#line 3628
pt++) {
            
//#line 3630
final x10.
              lang.
              place tempPl =
              placeArray[pt];
            
//#line 3632
vPlaceArray[pt] =
              tempPl;
        }
        
//#line 3635
;
        
//#line 3638
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 3641
final Dist1 retDist =
          new Dist1(
          r,
          pointDist1);
        
//#line 3643
return retDist;
    }
    
    
//#line 3645
public static void
                    setRefArrayValue1double(
                    final doubleRefArray1 array,
                    final int index,
                    final double val) {
        
//#line 3648
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3651
final int placeIndex =
          pl.
            id;
        
//#line 3654
final Dist1 dArray =
          array.
            distValue;
        
//#line 3657
final Dist dDist =
          dArray.
            dDist;
        
//#line 3660
final int[] runSum =
          dDist.
            runningSum;
        
//#line 3663
final int localIndex =
          runSum[index];
        
//#line 3666
final doubleStub[] contents =
          array.
            contents;
        
//#line 3669
final doubleStub indexStub =
          contents[placeIndex];
        
//#line 3672
final double[] localArray =
          indexStub.
            localArray;
        
//#line 3674
localArray[localIndex] =
          val;
    }
    
    
//#line 3676
public static Dist1
                    getUniqueDist(
                    ) {
        
//#line 3679
final int one =
          1;
        
//#line 3682
final int zero =
          0;
        
//#line 3685
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 3688
final int rSize =
          maxPlaces -
          one;
        
//#line 3691
final int placeRegion =
          rSize +
          1;
        
//#line 3694
final Point1[] pointArray =
          (Point1[])
            ((new Point1[placeRegion]));
        
//#line 3696
for (
//#line 3696
int p =
                             0;
                           p <
                             pointArray.
                               length;
                           
//#line 3696
p++) {
            
//#line 3698
final int i =
              p;
            
//#line 3701
final Point1 pt1 =
              new Point1(
              i);
            
//#line 3703
pointArray[p] =
              pt1;
        }
        
//#line 3706
;
        
//#line 3709
final x10.
          lang.
          place[] vPlaceArray =
          (x10.
            lang.
            place[])
            ((new x10.
                lang.
                place[placeRegion]));
        
//#line 3711
for (
//#line 3711
int p =
                             0;
                           p <
                             vPlaceArray.
                               length;
                           
//#line 3711
p++) {
            
//#line 3713
final int i =
              p;
            
//#line 3716
final x10.
              lang.
              place pl1 =
              x10.
                lang.
                place.
                places(
                i);
            
//#line 3718
vPlaceArray[p] =
              pl1;
        }
        
//#line 3721
;
        
//#line 3724
final Region1 reg =
          new Region1(
          pointArray,
          zero,
          maxPlaces);
        
//#line 3727
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          maxPlaces);
        
//#line 3730
final Dist1 retDist =
          new Dist1(
          reg,
          pointDist1);
        
//#line 3732
return retDist;
    }
    
    
//#line 3734
public static x10.
                    lang.
                    place
                    getPlaceFromDist1(
                    final Dist1 dn,
                    final int index) {
        
//#line 3737
final Dist d =
          dn.
            dDist;
        
//#line 3740
final x10.
          lang.
          place[] placeArray =
          d.
            placeArray;
        
//#line 3743
final x10.
          lang.
          place retPlace =
          placeArray[index];
        
//#line 3745
return retPlace;
    }
    
    
//#line 3747
public static Point1[]
                    getDistLocalArray1(
                    final Dist1 dn,
                    final int placeIndex) {
        
//#line 3750
final Region1 r =
          dn.
            dReg;
        
//#line 3753
final Point1[] pointArray =
          r.
            pointArray;
        
//#line 3756
final int rSize =
          r.
            regSize;
        
//#line 3759
final Dist d =
          dn.
            dDist;
        
//#line 3762
final x10.
          lang.
          place[] placeArray =
          d.
            placeArray;
        
//#line 3765
final int one =
          1;
        
//#line 3768
final x10.
          lang.
          place currPlace =
          x10.
            lang.
            place.
            places(
            placeIndex);
        
//#line 3771
final int[] counts =
          d.
            counts;
        
//#line 3774
final int localCount =
          counts[placeIndex];
        
//#line 3777
final int localCountMinusOne =
          localCount -
          one;
        
//#line 3780
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 3783
final int localRegion =
          localCountMinusOne +
          1;
        
//#line 3786
final int placeRegion =
          rSizeMinusOne +
          1;
        
//#line 3789
final int localDist =
          localCountMinusOne +
          1;
        
//#line 3792
final Point1[] tempPointArray =
          new Point1[localDist];
        
//#line 3795
int tempCount =
          0;
        
//#line 3797
for (
//#line 3797
int p =
                             0;
                           p <
                             placeRegion;
                           
//#line 3797
p++) {
            
//#line 3800
final x10.
              lang.
              place pl =
              placeArray[p];
            
//#line 3803
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(pl,currPlace)/* } */;
            
//#line 3805
if (cond) {
                
//#line 3808
final Point1 tempPoint =
                  pointArray[p];
                
//#line 3810
tempPointArray[tempCount] =
                  tempPoint;
                
//#line 3812
tempCount =
                  tempCount +
                    one;
            }
        }
        
//#line 3817
final Point1[] vPointArray =
          (Point1[])
            ((new Point1[localRegion]));
        
//#line 3819
for (
//#line 3819
int p =
                             0;
                           p <
                             vPointArray.
                               length;
                           
//#line 3819
p++) {
            
//#line 3821
final Point1 tempPoint =
              tempPointArray[p];
            
//#line 3823
vPointArray[p] =
              tempPoint;
        }
        
//#line 3826
;
        
//#line 3828
return vPointArray;
    }
    
    
//#line 3830
public static void
                    getCyclic(
                    final x10.
                      lang.
                      place[] placeArray,
                    final int arraySize,
                    final x10.
                      lang.
                      place initPlace,
                    final int blockSize) {
        
//#line 3833
final int zero =
          0;
        
//#line 3836
final int one =
          1;
        
//#line 3839
int N =
          arraySize;
        
//#line 3842
int chunk =
          blockSize;
        
//#line 3845
final boolean ifCond =
          blockSize >
          N;
        
//#line 3847
if (ifCond) {
            
//#line 3850
chunk =
              N;
        }
        
//#line 3854
int index =
          0;
        
//#line 3857
int dSize =
          index +
          chunk;
        
//#line 3860
dSize =
          dSize -
            one;
        
//#line 3863
final int pointReg =
          dSize +
          1;
        
//#line 3865
for (
//#line 3865
int p =
                             0;
                           p <
                             pointReg;
                           
//#line 3865
p++) {
            
//#line 3867
placeArray[p] =
              initPlace;
        }
        
//#line 3870
index =
          index +
            chunk;
        
//#line 3873
N =
          N -
            chunk;
        
//#line 3876
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 3879
boolean whileCond =
          N !=
          zero;
        
//#line 3881
while (whileCond) {
            
//#line 3884
final boolean tailCond =
              chunk >
              N;
            
//#line 3886
if (tailCond) {
                
//#line 3889
dSize =
                  index +
                    N;
                
//#line 3892
dSize =
                  dSize -
                    one;
                
//#line 3895
final int ub =
                  N -
                  one;
                
//#line 3898
final int pointReg1 =
                  ub +
                  1;
                
//#line 3900
for (
//#line 3900
int p =
                                     0;
                                   p <
                                     pointReg1;
                                   
//#line 3900
p++) {
                    
//#line 3903
final int tempPt =
                      p +
                      index;
                    
//#line 3905
placeArray[tempPt] =
                      pl;
                }
                
//#line 3908
N =
                  0;
            } else {
                
//#line 3914
dSize =
                  index +
                    chunk;
                
//#line 3917
dSize =
                  dSize -
                    one;
                
//#line 3920
final int ub =
                  chunk -
                  one;
                
//#line 3923
final int pointReg1 =
                  ub +
                  1;
                
//#line 3925
for (
//#line 3925
int p =
                                     0;
                                   p <
                                     pointReg1;
                                   
//#line 3925
p++) {
                    
//#line 3928
final int tempPt =
                      p +
                      index;
                    
//#line 3930
placeArray[tempPt] =
                      pl;
                }
                
//#line 3933
index =
                  index +
                    chunk;
                
//#line 3936
N =
                  N -
                    chunk;
            }
            
//#line 3940
pl =
              pl.
                next();
            
//#line 3943
whileCond =
              N !=
                zero;
        }
    }
    
    
//#line 3947
public static int
                    getRefArrayValue1int(
                    final intRefArray1 array,
                    final int index) {
        
//#line 3950
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3953
final int placeIndex =
          pl.
            id;
        
//#line 3956
final Dist1 dArray =
          array.
            distValue;
        
//#line 3959
final Dist dDist =
          dArray.
            dDist;
        
//#line 3962
final int[] runSum =
          dDist.
            runningSum;
        
//#line 3965
final int localIndex =
          runSum[index];
        
//#line 3968
final intStub[] contents =
          array.
            contents;
        
//#line 3971
final intStub indexStub =
          contents[placeIndex];
        
//#line 3974
final int[] localArray =
          indexStub.
            localArray;
        
//#line 3977
final int returnValue =
          localArray[localIndex];
        
//#line 3979
return returnValue;
    }
    
    
//#line 3981
public static void
                    setRefArrayValue1byte(
                    final byteRefArray1 array,
                    final int index,
                    final byte val) {
        
//#line 3984
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 3987
final int placeIndex =
          pl.
            id;
        
//#line 3990
final Dist1 dArray =
          array.
            distValue;
        
//#line 3993
final Dist dDist =
          dArray.
            dDist;
        
//#line 3996
final int[] runSum =
          dDist.
            runningSum;
        
//#line 3999
final int localIndex =
          runSum[index];
        
//#line 4002
final byteStub[] contents =
          array.
            contents;
        
//#line 4005
final byteStub indexStub =
          contents[placeIndex];
        
//#line 4008
final byte[] localArray =
          indexStub.
            localArray;
        
//#line 4010
localArray[localIndex] =
          val;
    }
    
    
//#line 4012
public static int
                    getDistLocalCount1(
                    final Dist1 dn,
                    final int placeIndex) {
        
//#line 4015
final Dist d =
          dn.
            dDist;
        
//#line 4018
final int[] counts =
          d.
            counts;
        
//#line 4021
final int localCount =
          counts[placeIndex];
        
//#line 4023
return localCount;
    }
    
    
//#line 4025
public static int
                    comparePoint1(
                    final Point1 pt1,
                    final Point1 pt2) {
        
//#line 4028
final int zero =
          0;
        
//#line 4031
final int one =
          1;
        
//#line 4034
final int two =
          2;
        
//#line 4037
int point1 =
          0;
        
//#line 4040
int point2 =
          0;
        
//#line 4043
boolean lt =
          false;
        
//#line 4046
boolean gt =
          false;
        
//#line 4049
point1 =
          pt1.
            f0;
        
//#line 4052
point2 =
          pt2.
            f0;
        
//#line 4055
lt =
          point1 <
            point2;
        
//#line 4058
gt =
          point1 >
            point2;
        
//#line 4060
if (lt) {
            
//#line 4062
return one;
        }
        
//#line 4064
if (gt) {
            
//#line 4066
return two;
        }
        
//#line 4068
return zero;
    }
    
    
//#line 4070
public static int
                    searchPointInRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 4073
final boolean regType =
          r.
            regType;
        
//#line 4075
if (regType) {
            
//#line 4078
final int constantSearch =
              Program.
                constantSearchRegion1(
                r,
                target);
            
//#line 4080
return constantSearch;
        }
        
//#line 4083
final int binarySearch =
          Program.
            binarySearchRegion1(
            r,
            target);
        
//#line 4085
return binarySearch;
    }
    
    
//#line 4087
public static Point1
                    regionOrdinalPoint1(
                    final Region1 reg,
                    final int ordl) {
        
//#line 4090
final Point1[] pointArray =
          reg.
            pointArray;
        
//#line 4093
final Point1 pt =
          pointArray[ordl];
        
//#line 4095
return pt;
    }
    
    
//#line 4097
public static byte
                    getRefArrayValue1byte(
                    final byteRefArray1 array,
                    final int index) {
        
//#line 4100
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 4103
final int placeIndex =
          pl.
            id;
        
//#line 4106
final Dist1 dArray =
          array.
            distValue;
        
//#line 4109
final Dist dDist =
          dArray.
            dDist;
        
//#line 4112
final int[] runSum =
          dDist.
            runningSum;
        
//#line 4115
final int localIndex =
          runSum[index];
        
//#line 4118
final byteStub[] contents =
          array.
            contents;
        
//#line 4121
final byteStub indexStub =
          contents[placeIndex];
        
//#line 4124
final byte[] localArray =
          indexStub.
            localArray;
        
//#line 4127
final byte returnValue =
          localArray[localIndex];
        
//#line 4129
return returnValue;
    }
    
    
//#line 4131
public static Dist1
                    getPlaceDist1(
                    final Region1 r,
                    final x10.
                      lang.
                      place p) {
        
//#line 4134
final int rSize =
          r.
            regSize;
        
//#line 4137
final int one =
          1;
        
//#line 4140
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 4143
final int dReg =
          rSizeMinusOne +
          1;
        
//#line 4146
final x10.
          lang.
          place[] vPlaceArray =
          (x10.
            lang.
            place[])
            ((new x10.
                lang.
                place[dReg]));
        
//#line 4148
for (
//#line 4148
int pt =
                             0;
                           pt <
                             vPlaceArray.
                               length;
                           
//#line 4148
pt++) {
            
//#line 4149
vPlaceArray[pt] =
              p;
        }
        
//#line 4152
;
        
//#line 4155
final Dist pointDist =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 4158
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 4160
return retDist;
    }
    
    
//#line 4162
public static void
                    setRefArrayValue1int(
                    final intRefArray1 array,
                    final int index,
                    final int val) {
        
//#line 4165
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 4168
final int placeIndex =
          pl.
            id;
        
//#line 4171
final Dist1 dArray =
          array.
            distValue;
        
//#line 4174
final Dist dDist =
          dArray.
            dDist;
        
//#line 4177
final int[] runSum =
          dDist.
            runningSum;
        
//#line 4180
final int localIndex =
          runSum[index];
        
//#line 4183
final intStub[] contents =
          array.
            contents;
        
//#line 4186
final intStub indexStub =
          contents[placeIndex];
        
//#line 4189
final int[] localArray =
          indexStub.
            localArray;
        
//#line 4191
localArray[localIndex] =
          val;
    }
    
    
//#line 4193
public static int[]
                    initDist(
                    final int[] tempArr,
                    final int tempReg) {
        
//#line 4196
final int[] vTemp =
          (int[])
            ((new int[tempReg]));
        
//#line 4198
for (
//#line 4198
int p =
                             0;
                           p <
                             vTemp.
                               length;
                           
//#line 4198
p++) {
            
//#line 4200
final int tempInt =
              tempArr[p];
            
//#line 4202
vTemp[p] =
              tempInt;
        }
        
//#line 4205
;
        
//#line 4207
return vTemp;
    }
    
    
//#line 4209
public static Region1
                    createNewRegion1R(
                    final int v1_0,
                    final int v1_1) {
        
//#line 4212
final int zero =
          0;
        
//#line 4215
final int one =
          1;
        
//#line 4218
boolean regType =
          true;
        
//#line 4221
final boolean tempBool1 =
          true;
        
//#line 4224
regType =
          regType &&
            tempBool1;
        
//#line 4227
final int l1 =
          v1_1 -
          v1_0;
        
//#line 4230
final int dim1 =
          l1 +
          one;
        
//#line 4233
final int stride1 =
          1;
        
//#line 4236
final int stride0 =
          stride1 *
          dim1;
        
//#line 4239
final int rSize =
          stride0 -
          one;
        
//#line 4242
final int regArr =
          rSize +
          1;
        
//#line 4245
final Point1[] ptArray =
          (Point1[])
            ((new Point1[regArr]));
        
//#line 4247
for (
//#line 4247
int pt =
                             0;
                           pt <
                             ptArray.
                               length;
                           
//#line 4247
pt++) {
            
//#line 4249
final int p =
              pt;
            
//#line 4252
int f1 =
              p /
              stride1;
            
//#line 4255
f1 =
              f1 %
                dim1;
            
//#line 4258
f1 =
              f1 +
                v1_0;
            
//#line 4261
final Point1 retPoint =
              new Point1(
              f1);
            
//#line 4263
ptArray[pt] =
              retPoint;
        }
        
//#line 4266
;
        
//#line 4268
if (regType) {
            
//#line 4271
final Region1 retRegRegular =
              new Region1(
              ptArray,
              v1_0,
              dim1);
            
//#line 4273
return retRegRegular;
        }
        
//#line 4276
final Region1 retReg =
          new Region1(
          ptArray);
        
//#line 4278
return retReg;
    }
    
    
//#line 4280
public static void
                    thread1(
                    final T1 utmpz) {
        
//#line 4283
final Point1 pt =
          utmpz.
            pt;
        
//#line 4286
final byteRefArray1 p2 =
          utmpz.
            p2;
        
//#line 4289
final byteRefArray1 c1 =
          utmpz.
            c1;
        
//#line 4292
final byteRefArray1 p1 =
          utmpz.
            p1;
        {
            
//#line 4296
final Dist1 RX10_TEMP13 =
              p1.
                distValue;
            
//#line 4299
final Region1 RX10_TEMP14 =
              RX10_TEMP13.
                dReg;
            
//#line 4302
final int RX10_TEMP15 =
              Program.
                searchPointInRegion1(
                RX10_TEMP14,
                pt);
            
//#line 4305
final int RX10_TEMP16 =
              0;
            
//#line 4308
final boolean RX10_TEMP17 =
              RX10_TEMP15 <
              RX10_TEMP16;
            
//#line 4310
if (RX10_TEMP17) {
                
//#line 4313
java.
                  lang.
                  String RX10_TEMP18 =
                  "Array access index out of bounds";
                
//#line 4315
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP18);
            }
            
//#line 4319
final x10.
              lang.
              place RX10_TEMP19 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP13,
                RX10_TEMP15);
            
//#line 4322
final x10.
              lang.
              place RX10_TEMP21 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 4325
final boolean RX10_TEMP22 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
            
//#line 4327
if (RX10_TEMP22) {
                
//#line 4330
java.
                  lang.
                  String RX10_TEMP20 =
                  "Bad place access for array p1";
                
//#line 4332
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP20);
            }
            
//#line 4336
final byte RX10_TEMP23 =
              Program.
                getRefArrayValue1byte(
                p1,
                RX10_TEMP15);
            
//#line 4339
final byte X10_TEMP10 =
              (byte)
                RX10_TEMP23;
            
//#line 4342
final Dist1 RX10_TEMP24 =
              p2.
                distValue;
            
//#line 4345
final Region1 RX10_TEMP25 =
              RX10_TEMP24.
                dReg;
            
//#line 4348
final int RX10_TEMP26 =
              Program.
                searchPointInRegion1(
                RX10_TEMP25,
                pt);
            
//#line 4351
final int RX10_TEMP27 =
              0;
            
//#line 4354
final boolean RX10_TEMP28 =
              RX10_TEMP26 <
              RX10_TEMP27;
            
//#line 4356
if (RX10_TEMP28) {
                
//#line 4359
java.
                  lang.
                  String RX10_TEMP29 =
                  "Array access index out of bounds";
                
//#line 4361
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP29);
            }
            
//#line 4365
final x10.
              lang.
              place RX10_TEMP30 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP24,
                RX10_TEMP26);
            
//#line 4368
final x10.
              lang.
              place RX10_TEMP32 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 4371
final boolean RX10_TEMP33 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP30,RX10_TEMP32))/* } */;
            
//#line 4373
if (RX10_TEMP33) {
                
//#line 4376
java.
                  lang.
                  String RX10_TEMP31 =
                  "Bad place access for array p2";
                
//#line 4378
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP31);
            }
            
//#line 4382
final byte RX10_TEMP34 =
              Program.
                getRefArrayValue1byte(
                p2,
                RX10_TEMP26);
            
//#line 4385
final byte X10_TEMP11 =
              (byte)
                RX10_TEMP34;
            
//#line 4388
final boolean X10_TEMP13 =
              X10_TEMP10 !=
              X10_TEMP11;
            
//#line 4390
if (X10_TEMP13) {
                
//#line 4393
final java.
                  lang.
                  String X10_TEMP15 =
                  "Validation failed";
                
//#line 4395
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              out))/* } */.println(X10_TEMP15);
                
//#line 4397
final java.
                  lang.
                  String X10_TEMP16 =
                  "Original Byte ";
                
//#line 4400
final java.
                  lang.
                  String RX10_TEMP35 =
                  Program.
                    toStringPoint1(
                    pt);
                
//#line 4403
final java.
                  lang.
                  String X10_TEMP17 =
                  X10_TEMP16 +
                RX10_TEMP35;
                
//#line 4406
final java.
                  lang.
                  String X10_TEMP18 =
                  " = ";
                
//#line 4409
final java.
                  lang.
                  String X10_TEMP20 =
                  X10_TEMP17 +
                X10_TEMP18;
                
//#line 4412
final Dist1 RX10_TEMP36 =
                  p1.
                    distValue;
                
//#line 4415
final Region1 RX10_TEMP37 =
                  RX10_TEMP36.
                    dReg;
                
//#line 4418
final int RX10_TEMP38 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP37,
                    pt);
                
//#line 4421
final int RX10_TEMP39 =
                  0;
                
//#line 4424
final boolean RX10_TEMP40 =
                  RX10_TEMP38 <
                  RX10_TEMP39;
                
//#line 4426
if (RX10_TEMP40) {
                    
//#line 4429
java.
                      lang.
                      String RX10_TEMP41 =
                      "Array access index out of bounds";
                    
//#line 4431
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP41);
                }
                
//#line 4435
final x10.
                  lang.
                  place RX10_TEMP42 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP36,
                    RX10_TEMP38);
                
//#line 4438
final x10.
                  lang.
                  place RX10_TEMP44 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 4441
final boolean RX10_TEMP45 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP42,RX10_TEMP44))/* } */;
                
//#line 4443
if (RX10_TEMP45) {
                    
//#line 4446
java.
                      lang.
                      String RX10_TEMP43 =
                      "Bad place access for array p1";
                    
//#line 4448
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP43);
                }
                
//#line 4452
final byte RX10_TEMP46 =
                  Program.
                    getRefArrayValue1byte(
                    p1,
                    RX10_TEMP38);
                
//#line 4455
final byte X10_TEMP21 =
                  (byte)
                    RX10_TEMP46;
                
//#line 4458
final java.
                  lang.
                  String X10_TEMP23 =
                  X10_TEMP20 +
                X10_TEMP21;
                
//#line 4460
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              out))/* } */.println(X10_TEMP23);
                
//#line 4462
final java.
                  lang.
                  String X10_TEMP24 =
                  "Encrypted Byte ";
                
//#line 4465
final java.
                  lang.
                  String RX10_TEMP47 =
                  Program.
                    toStringPoint1(
                    pt);
                
//#line 4468
final java.
                  lang.
                  String X10_TEMP25 =
                  X10_TEMP24 +
                RX10_TEMP47;
                
//#line 4471
final java.
                  lang.
                  String X10_TEMP26 =
                  " = ";
                
//#line 4474
final java.
                  lang.
                  String X10_TEMP28 =
                  X10_TEMP25 +
                X10_TEMP26;
                
//#line 4477
final Dist1 RX10_TEMP48 =
                  c1.
                    distValue;
                
//#line 4480
final Region1 RX10_TEMP49 =
                  RX10_TEMP48.
                    dReg;
                
//#line 4483
final int RX10_TEMP50 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP49,
                    pt);
                
//#line 4486
final int RX10_TEMP51 =
                  0;
                
//#line 4489
final boolean RX10_TEMP52 =
                  RX10_TEMP50 <
                  RX10_TEMP51;
                
//#line 4491
if (RX10_TEMP52) {
                    
//#line 4494
java.
                      lang.
                      String RX10_TEMP53 =
                      "Array access index out of bounds";
                    
//#line 4496
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP53);
                }
                
//#line 4500
final x10.
                  lang.
                  place RX10_TEMP54 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP48,
                    RX10_TEMP50);
                
//#line 4503
final x10.
                  lang.
                  place RX10_TEMP56 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 4506
final boolean RX10_TEMP57 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP54,RX10_TEMP56))/* } */;
                
//#line 4508
if (RX10_TEMP57) {
                    
//#line 4511
java.
                      lang.
                      String RX10_TEMP55 =
                      "Bad place access for array c1";
                    
//#line 4513
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP55);
                }
                
//#line 4517
final byte RX10_TEMP58 =
                  Program.
                    getRefArrayValue1byte(
                    c1,
                    RX10_TEMP50);
                
//#line 4520
final byte X10_TEMP29 =
                  (byte)
                    RX10_TEMP58;
                
//#line 4523
final java.
                  lang.
                  String X10_TEMP31 =
                  X10_TEMP28 +
                X10_TEMP29;
                
//#line 4525
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              out))/* } */.println(X10_TEMP31);
                
//#line 4527
final java.
                  lang.
                  String X10_TEMP32 =
                  "Decrypted Byte ";
                
//#line 4530
final java.
                  lang.
                  String RX10_TEMP59 =
                  Program.
                    toStringPoint1(
                    pt);
                
//#line 4533
final java.
                  lang.
                  String X10_TEMP33 =
                  X10_TEMP32 +
                RX10_TEMP59;
                
//#line 4536
final java.
                  lang.
                  String X10_TEMP34 =
                  " = ";
                
//#line 4539
final java.
                  lang.
                  String X10_TEMP36 =
                  X10_TEMP33 +
                X10_TEMP34;
                
//#line 4542
final Dist1 RX10_TEMP60 =
                  p2.
                    distValue;
                
//#line 4545
final Region1 RX10_TEMP61 =
                  RX10_TEMP60.
                    dReg;
                
//#line 4548
final int RX10_TEMP62 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP61,
                    pt);
                
//#line 4551
final int RX10_TEMP63 =
                  0;
                
//#line 4554
final boolean RX10_TEMP64 =
                  RX10_TEMP62 <
                  RX10_TEMP63;
                
//#line 4556
if (RX10_TEMP64) {
                    
//#line 4559
java.
                      lang.
                      String RX10_TEMP65 =
                      "Array access index out of bounds";
                    
//#line 4561
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP65);
                }
                
//#line 4565
final x10.
                  lang.
                  place RX10_TEMP66 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP60,
                    RX10_TEMP62);
                
//#line 4568
final x10.
                  lang.
                  place RX10_TEMP68 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 4571
final boolean RX10_TEMP69 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP66,RX10_TEMP68))/* } */;
                
//#line 4573
if (RX10_TEMP69) {
                    
//#line 4576
java.
                      lang.
                      String RX10_TEMP67 =
                      "Bad place access for array p2";
                    
//#line 4578
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP67);
                }
                
//#line 4582
final byte RX10_TEMP70 =
                  Program.
                    getRefArrayValue1byte(
                    p2,
                    RX10_TEMP62);
                
//#line 4585
final byte X10_TEMP37 =
                  (byte)
                    RX10_TEMP70;
                
//#line 4588
final java.
                  lang.
                  String X10_TEMP39 =
                  X10_TEMP36 +
                X10_TEMP37;
                
//#line 4590
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              out))/* } */.println(X10_TEMP39);
                
//#line 4592
final java.
                  lang.
                  String X10_TEMP41 =
                  "Validation failed";
                
//#line 4594
throw new java.
                  lang.
                  RuntimeException(
                  X10_TEMP41);
            }
        }
    }
    
    
//#line 4599
public static void
                    thread2(
                    final T2 utmpz) {
        
//#line 4602
final intValArray1 fdkr =
          utmpz.
            fdkr;
        
//#line 4605
final intValArray1 fzr =
          utmpz.
            fzr;
        
//#line 4608
final byteRefArray1 p2 =
          utmpz.
            p2;
        
//#line 4611
final byteRefArray1 c1 =
          utmpz.
            c1;
        
//#line 4614
final byteRefArray1 p1 =
          utmpz.
            p1;
        
//#line 4617
final IDEATest X10_TEMP0 =
          utmpz.
            X10_TEMP0;
        {
            
//#line 4620
Program.
                            IDEATest_cipher_idea(
                            X10_TEMP0,
                            p1,
                            c1,
                            fzr);
            
//#line 4621
Program.
                            IDEATest_cipher_idea(
                            X10_TEMP0,
                            c1,
                            p2,
                            fdkr);
        }
    }
    
    
//#line 10
public Program() {
        
//#line 10
super();
    }
}

class T1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4629
final public Point1
      pt;
    
//#line 4630
final public byteRefArray1
      p2;
    
//#line 4631
final public byteRefArray1
      c1;
    
//#line 4632
final public byteRefArray1
      p1;
    
    
//#line 4635
public T1(final Point1 a_pt,
                            final byteRefArray1 a_p2,
                            final byteRefArray1 a_c1,
                            final byteRefArray1 a_p1) {
        
//#line 4636
super();
        
//#line 4638
pt =
          a_pt;
        
//#line 4641
p2 =
          a_p2;
        
//#line 4644
c1 =
          a_c1;
        
//#line 4647
p1 =
          a_p1;
    }
    
    
//#line 4652
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4655
final java.
          lang.
          String s =
          "";
        
//#line 4657
return s;
    }
}

class T2
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4663
final public intValArray1
      fdkr;
    
//#line 4664
final public intValArray1
      fzr;
    
//#line 4665
final public byteRefArray1
      p2;
    
//#line 4666
final public byteRefArray1
      c1;
    
//#line 4667
final public byteRefArray1
      p1;
    
//#line 4668
final public IDEATest
      X10_TEMP0;
    
    
//#line 4671
public T2(final intValArray1 a_fdkr,
                            final intValArray1 a_fzr,
                            final byteRefArray1 a_p2,
                            final byteRefArray1 a_c1,
                            final byteRefArray1 a_p1,
                            final IDEATest a_X10_TEMP0) {
        
//#line 4672
super();
        
//#line 4674
fdkr =
          a_fdkr;
        
//#line 4677
fzr =
          a_fzr;
        
//#line 4680
p2 =
          a_p2;
        
//#line 4683
c1 =
          a_c1;
        
//#line 4686
p1 =
          a_p1;
        
//#line 4689
X10_TEMP0 =
          a_X10_TEMP0;
    }
    
    
//#line 4694
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4697
final java.
          lang.
          String s =
          "";
        
//#line 4699
return s;
    }
}

class T3
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4705
final public Point1[]
      RX10_TEMP13;
    
//#line 4706
final public int
      RX10_TEMP12;
    
//#line 4707
final public x10.
      lang.
      place
      RX10_TEMP8;
    
//#line 4708
final public int
      RX10_TEMP7;
    
//#line 4709
final public byteStub[]
      RX10_TEMP6;
    
    
//#line 4712
public T3(final Point1[] a_RX10_TEMP13,
                            final int a_RX10_TEMP12,
                            final x10.
                              lang.
                              place a_RX10_TEMP8,
                            final int a_RX10_TEMP7,
                            final byteStub[] a_RX10_TEMP6) {
        
//#line 4713
super();
        
//#line 4715
RX10_TEMP13 =
          a_RX10_TEMP13;
        
//#line 4718
RX10_TEMP12 =
          a_RX10_TEMP12;
        
//#line 4721
RX10_TEMP8 =
          a_RX10_TEMP8;
        
//#line 4724
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 4727
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 4732
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4735
final java.
          lang.
          String s =
          "";
        
//#line 4737
return s;
    }
}

class T4
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4743
final public int
      RX10_TEMP34;
    
//#line 4744
final public x10.
      lang.
      place
      RX10_TEMP30;
    
//#line 4745
final public int
      RX10_TEMP29;
    
//#line 4746
final public byteStub[]
      RX10_TEMP28;
    
    
//#line 4749
public T4(final int a_RX10_TEMP34,
                            final x10.
                              lang.
                              place a_RX10_TEMP30,
                            final int a_RX10_TEMP29,
                            final byteStub[] a_RX10_TEMP28) {
        
//#line 4750
super();
        
//#line 4752
RX10_TEMP34 =
          a_RX10_TEMP34;
        
//#line 4755
RX10_TEMP30 =
          a_RX10_TEMP30;
        
//#line 4758
RX10_TEMP29 =
          a_RX10_TEMP29;
        
//#line 4761
RX10_TEMP28 =
          a_RX10_TEMP28;
    }
    
    
//#line 4766
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4769
final java.
          lang.
          String s =
          "";
        
//#line 4771
return s;
    }
}

class T5
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4777
final public int
      RX10_TEMP54;
    
//#line 4778
final public x10.
      lang.
      place
      RX10_TEMP50;
    
//#line 4779
final public int
      RX10_TEMP49;
    
//#line 4780
final public byteStub[]
      RX10_TEMP48;
    
    
//#line 4783
public T5(final int a_RX10_TEMP54,
                            final x10.
                              lang.
                              place a_RX10_TEMP50,
                            final int a_RX10_TEMP49,
                            final byteStub[] a_RX10_TEMP48) {
        
//#line 4784
super();
        
//#line 4786
RX10_TEMP54 =
          a_RX10_TEMP54;
        
//#line 4789
RX10_TEMP50 =
          a_RX10_TEMP50;
        
//#line 4792
RX10_TEMP49 =
          a_RX10_TEMP49;
        
//#line 4795
RX10_TEMP48 =
          a_RX10_TEMP48;
    }
    
    
//#line 4800
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4803
final java.
          lang.
          String s =
          "";
        
//#line 4805
return s;
    }
}

class T6
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4811
final public int
      RX10_TEMP12;
    
//#line 4812
final public x10.
      lang.
      place
      RX10_TEMP8;
    
//#line 4813
final public int
      RX10_TEMP7;
    
//#line 4814
final public intStub[]
      RX10_TEMP6;
    
    
//#line 4817
public T6(final int a_RX10_TEMP12,
                            final x10.
                              lang.
                              place a_RX10_TEMP8,
                            final int a_RX10_TEMP7,
                            final intStub[] a_RX10_TEMP6) {
        
//#line 4818
super();
        
//#line 4820
RX10_TEMP12 =
          a_RX10_TEMP12;
        
//#line 4823
RX10_TEMP8 =
          a_RX10_TEMP8;
        
//#line 4826
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 4829
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 4834
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4837
final java.
          lang.
          String s =
          "";
        
//#line 4839
return s;
    }
}

class T7
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4845
final public int
      RX10_TEMP12;
    
//#line 4846
final public x10.
      lang.
      place
      RX10_TEMP8;
    
//#line 4847
final public int
      RX10_TEMP7;
    
//#line 4848
final public intStub[]
      RX10_TEMP6;
    
    
//#line 4851
public T7(final int a_RX10_TEMP12,
                            final x10.
                              lang.
                              place a_RX10_TEMP8,
                            final int a_RX10_TEMP7,
                            final intStub[] a_RX10_TEMP6) {
        
//#line 4852
super();
        
//#line 4854
RX10_TEMP12 =
          a_RX10_TEMP12;
        
//#line 4857
RX10_TEMP8 =
          a_RX10_TEMP8;
        
//#line 4860
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 4863
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 4868
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4871
final java.
          lang.
          String s =
          "";
        
//#line 4873
return s;
    }
}

class T8
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4879
final public int
      RX10_TEMP12;
    
//#line 4880
final public x10.
      lang.
      place
      RX10_TEMP8;
    
//#line 4881
final public int
      RX10_TEMP7;
    
//#line 4882
final public intStub[]
      RX10_TEMP6;
    
    
//#line 4885
public T8(final int a_RX10_TEMP12,
                            final x10.
                              lang.
                              place a_RX10_TEMP8,
                            final int a_RX10_TEMP7,
                            final intStub[] a_RX10_TEMP6) {
        
//#line 4886
super();
        
//#line 4888
RX10_TEMP12 =
          a_RX10_TEMP12;
        
//#line 4891
RX10_TEMP8 =
          a_RX10_TEMP8;
        
//#line 4894
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 4897
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 4902
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4905
final java.
          lang.
          String s =
          "";
        
//#line 4907
return s;
    }
}

class T9
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4913
final public int
      RX10_TEMP12;
    
//#line 4914
final public x10.
      lang.
      place
      RX10_TEMP8;
    
//#line 4915
final public int
      RX10_TEMP7;
    
//#line 4916
final public doubleStub[]
      RX10_TEMP6;
    
    
//#line 4919
public T9(final int a_RX10_TEMP12,
                            final x10.
                              lang.
                              place a_RX10_TEMP8,
                            final int a_RX10_TEMP7,
                            final doubleStub[] a_RX10_TEMP6) {
        
//#line 4920
super();
        
//#line 4922
RX10_TEMP12 =
          a_RX10_TEMP12;
        
//#line 4925
RX10_TEMP8 =
          a_RX10_TEMP8;
        
//#line 4928
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 4931
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 4936
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4939
final java.
          lang.
          String s =
          "";
        
//#line 4941
return s;
    }
}

class T10
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4947
final public int
      RX10_TEMP33;
    
//#line 4948
final public x10.
      lang.
      place
      RX10_TEMP29;
    
//#line 4949
final public int
      RX10_TEMP28;
    
//#line 4950
final public doubleStub[]
      RX10_TEMP27;
    
    
//#line 4953
public T10(final int a_RX10_TEMP33,
                             final x10.
                               lang.
                               place a_RX10_TEMP29,
                             final int a_RX10_TEMP28,
                             final doubleStub[] a_RX10_TEMP27) {
        
//#line 4954
super();
        
//#line 4956
RX10_TEMP33 =
          a_RX10_TEMP33;
        
//#line 4959
RX10_TEMP29 =
          a_RX10_TEMP29;
        
//#line 4962
RX10_TEMP28 =
          a_RX10_TEMP28;
        
//#line 4965
RX10_TEMP27 =
          a_RX10_TEMP27;
    }
    
    
//#line 4970
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 4973
final java.
          lang.
          String s =
          "";
        
//#line 4975
return s;
    }
}

class T11
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4981
final public int
      RX10_TEMP54;
    
//#line 4982
final public x10.
      lang.
      place
      RX10_TEMP50;
    
//#line 4983
final public int
      RX10_TEMP49;
    
//#line 4984
final public doubleStub[]
      RX10_TEMP48;
    
    
//#line 4987
public T11(final int a_RX10_TEMP54,
                             final x10.
                               lang.
                               place a_RX10_TEMP50,
                             final int a_RX10_TEMP49,
                             final doubleStub[] a_RX10_TEMP48) {
        
//#line 4988
super();
        
//#line 4990
RX10_TEMP54 =
          a_RX10_TEMP54;
        
//#line 4993
RX10_TEMP50 =
          a_RX10_TEMP50;
        
//#line 4996
RX10_TEMP49 =
          a_RX10_TEMP49;
        
//#line 4999
RX10_TEMP48 =
          a_RX10_TEMP48;
    }
    
    
//#line 5004
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5007
final java.
          lang.
          String s =
          "";
        
//#line 5009
return s;
    }
}

class T12
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5015
final public byteStub
      RX10_TEMP17;
    
//#line 5016
final public int
      RX10_TEMP7;
    
//#line 5017
final public byteStub[]
      RX10_TEMP6;
    
    
//#line 5020
public T12(final byteStub a_RX10_TEMP17,
                             final int a_RX10_TEMP7,
                             final byteStub[] a_RX10_TEMP6) {
        
//#line 5021
super();
        
//#line 5023
RX10_TEMP17 =
          a_RX10_TEMP17;
        
//#line 5026
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 5029
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 5034
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5037
final java.
          lang.
          String s =
          "";
        
//#line 5039
return s;
    }
}

class T13
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5045
final public byteStub
      RX10_TEMP37;
    
//#line 5046
final public int
      RX10_TEMP29;
    
//#line 5047
final public byteStub[]
      RX10_TEMP28;
    
    
//#line 5050
public T13(final byteStub a_RX10_TEMP37,
                             final int a_RX10_TEMP29,
                             final byteStub[] a_RX10_TEMP28) {
        
//#line 5051
super();
        
//#line 5053
RX10_TEMP37 =
          a_RX10_TEMP37;
        
//#line 5056
RX10_TEMP29 =
          a_RX10_TEMP29;
        
//#line 5059
RX10_TEMP28 =
          a_RX10_TEMP28;
    }
    
    
//#line 5064
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5067
final java.
          lang.
          String s =
          "";
        
//#line 5069
return s;
    }
}

class T14
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5075
final public byteStub
      RX10_TEMP57;
    
//#line 5076
final public int
      RX10_TEMP49;
    
//#line 5077
final public byteStub[]
      RX10_TEMP48;
    
    
//#line 5080
public T14(final byteStub a_RX10_TEMP57,
                             final int a_RX10_TEMP49,
                             final byteStub[] a_RX10_TEMP48) {
        
//#line 5081
super();
        
//#line 5083
RX10_TEMP57 =
          a_RX10_TEMP57;
        
//#line 5086
RX10_TEMP49 =
          a_RX10_TEMP49;
        
//#line 5089
RX10_TEMP48 =
          a_RX10_TEMP48;
    }
    
    
//#line 5094
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5097
final java.
          lang.
          String s =
          "";
        
//#line 5099
return s;
    }
}

class T15
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5105
final public intStub
      RX10_TEMP15;
    
//#line 5106
final public int
      RX10_TEMP7;
    
//#line 5107
final public intStub[]
      RX10_TEMP6;
    
    
//#line 5110
public T15(final intStub a_RX10_TEMP15,
                             final int a_RX10_TEMP7,
                             final intStub[] a_RX10_TEMP6) {
        
//#line 5111
super();
        
//#line 5113
RX10_TEMP15 =
          a_RX10_TEMP15;
        
//#line 5116
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 5119
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 5124
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5127
final java.
          lang.
          String s =
          "";
        
//#line 5129
return s;
    }
}

class T16
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5135
final public intStub
      RX10_TEMP15;
    
//#line 5136
final public int
      RX10_TEMP7;
    
//#line 5137
final public intStub[]
      RX10_TEMP6;
    
    
//#line 5140
public T16(final intStub a_RX10_TEMP15,
                             final int a_RX10_TEMP7,
                             final intStub[] a_RX10_TEMP6) {
        
//#line 5141
super();
        
//#line 5143
RX10_TEMP15 =
          a_RX10_TEMP15;
        
//#line 5146
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 5149
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 5154
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5157
final java.
          lang.
          String s =
          "";
        
//#line 5159
return s;
    }
}

class T17
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5165
final public intStub
      RX10_TEMP15;
    
//#line 5166
final public int
      RX10_TEMP7;
    
//#line 5167
final public intStub[]
      RX10_TEMP6;
    
    
//#line 5170
public T17(final intStub a_RX10_TEMP15,
                             final int a_RX10_TEMP7,
                             final intStub[] a_RX10_TEMP6) {
        
//#line 5171
super();
        
//#line 5173
RX10_TEMP15 =
          a_RX10_TEMP15;
        
//#line 5176
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 5179
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 5184
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5187
final java.
          lang.
          String s =
          "";
        
//#line 5189
return s;
    }
}

class T18
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5195
final public doubleStub
      RX10_TEMP16;
    
//#line 5196
final public int
      RX10_TEMP7;
    
//#line 5197
final public doubleStub[]
      RX10_TEMP6;
    
    
//#line 5200
public T18(final doubleStub a_RX10_TEMP16,
                             final int a_RX10_TEMP7,
                             final doubleStub[] a_RX10_TEMP6) {
        
//#line 5201
super();
        
//#line 5203
RX10_TEMP16 =
          a_RX10_TEMP16;
        
//#line 5206
RX10_TEMP7 =
          a_RX10_TEMP7;
        
//#line 5209
RX10_TEMP6 =
          a_RX10_TEMP6;
    }
    
    
//#line 5214
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5217
final java.
          lang.
          String s =
          "";
        
//#line 5219
return s;
    }
}

class T19
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5225
final public doubleStub
      RX10_TEMP37;
    
//#line 5226
final public int
      RX10_TEMP28;
    
//#line 5227
final public doubleStub[]
      RX10_TEMP27;
    
    
//#line 5230
public T19(final doubleStub a_RX10_TEMP37,
                             final int a_RX10_TEMP28,
                             final doubleStub[] a_RX10_TEMP27) {
        
//#line 5231
super();
        
//#line 5233
RX10_TEMP37 =
          a_RX10_TEMP37;
        
//#line 5236
RX10_TEMP28 =
          a_RX10_TEMP28;
        
//#line 5239
RX10_TEMP27 =
          a_RX10_TEMP27;
    }
    
    
//#line 5244
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5247
final java.
          lang.
          String s =
          "";
        
//#line 5249
return s;
    }
}

class T20
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5255
final public doubleStub
      RX10_TEMP58;
    
//#line 5256
final public int
      RX10_TEMP49;
    
//#line 5257
final public doubleStub[]
      RX10_TEMP48;
    
    
//#line 5260
public T20(final doubleStub a_RX10_TEMP58,
                             final int a_RX10_TEMP49,
                             final doubleStub[] a_RX10_TEMP48) {
        
//#line 5261
super();
        
//#line 5263
RX10_TEMP58 =
          a_RX10_TEMP58;
        
//#line 5266
RX10_TEMP49 =
          a_RX10_TEMP49;
        
//#line 5269
RX10_TEMP48 =
          a_RX10_TEMP48;
    }
    
    
//#line 5274
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 5277
final java.
          lang.
          String s =
          "";
        
//#line 5279
return s;
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
    
//#line 5285
final public Dist1
      distValue;
    
//#line 5286
final public doubleStub[]
      contents;
    
    
//#line 5289
public doubleRefArray1(final Dist1 distValue_,
                                         final doubleStub[] contents_) {
        
//#line 5290
super();
        
//#line 5292
distValue =
          distValue_;
        
//#line 5295
contents =
          contents_;
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
    
//#line 5304
final public Region1
      dReg;
    
//#line 5305
final public Dist
      dDist;
    
    
//#line 5308
public Dist1(final Region1 dReg_,
                               final Dist dDist_) {
        
//#line 5309
super();
        
//#line 5311
dReg =
          dReg_;
        
//#line 5314
dDist =
          dDist_;
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 5322
public doubleRefArray1
      start_time;
    
//#line 5323
public doubleRefArray1
      elapsed_time;
    
//#line 5324
public doubleRefArray1
      total_time;
    
    
//#line 5327
public Timer() {
        
//#line 5328
super();
        
//#line 5330
final int X10_TEMP3 =
          0;
        
//#line 5333
final int X10_TEMP4 =
          Program.
            _Timer_max_counters;
        
//#line 5336
final Region1 X10_TEMP5 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 5339
final x10.
          lang.
          place X10_TEMP6 =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 5342
final Dist1 d =
          Program.
            getPlaceDist1(
            X10_TEMP5,
            X10_TEMP6);
        
//#line 5345
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 5348
final int RX10_TEMP1 =
          0;
        
//#line 5351
final int RX10_TEMP2 =
          1;
        
//#line 5354
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 5357
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 5360
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 5363
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 5366
final doubleStub[] RX10_TEMP6 =
          new doubleStub[RX10_TEMP5];
        
//#line 5369
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 5371
for (
//#line 5371
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 5371
RX10_TEMP7++) {
                
//#line 5374
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 5377
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 5380
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 5383
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 5386
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 5389
final T9 utmp9 =
                  new T9(
                  RX10_TEMP12,
                  RX10_TEMP8,
                  RX10_TEMP7,
                  RX10_TEMP6);
                
//#line 5391
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 5393
Timer.this.
                                    thread9(
                                    utmp9);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp2) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp2);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 5398
final doubleStub[] RX10_TEMP17 =
          (doubleStub[])
            ((new doubleStub[RX10_TEMP4]));
        
//#line 5400
for (
//#line 5400
int RX10_TEMP19 =
                             0;
                           RX10_TEMP19 <
                             RX10_TEMP17.
                               length;
                           
//#line 5400
RX10_TEMP19++) {
            
//#line 5402
final doubleStub RX10_TEMP18 =
              RX10_TEMP6[RX10_TEMP19];
            
//#line 5404
RX10_TEMP17[RX10_TEMP19] =
              RX10_TEMP18;
        }
        
//#line 5407
;
        
//#line 5410
final doubleRefArray1 RX10_TEMP20 =
          new doubleRefArray1(
          d,
          RX10_TEMP17);
        
//#line 5413
final doubleRefArray1 X10_TEMP11 =
          RX10_TEMP20;
        
//#line 5416
start_time =
          X10_TEMP11;
        
//#line 5419
final Region1 RX10_TEMP21 =
          d.
            dReg;
        
//#line 5422
final int RX10_TEMP22 =
          0;
        
//#line 5425
final int RX10_TEMP23 =
          1;
        
//#line 5428
int RX10_TEMP24 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 5431
RX10_TEMP24 =
          RX10_TEMP24 -
            RX10_TEMP23;
        
//#line 5434
final int RX10_TEMP25 =
          RX10_TEMP24 +
          1;
        
//#line 5437
final int RX10_TEMP26 =
          RX10_TEMP24 +
          1;
        
//#line 5440
final doubleStub[] RX10_TEMP27 =
          new doubleStub[RX10_TEMP26];
        
//#line 5443
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 5445
for (
//#line 5445
int RX10_TEMP28 =
                                 0;
                               RX10_TEMP28 <
                                 RX10_TEMP25;
                               
//#line 5445
RX10_TEMP28++) {
                
//#line 5448
final x10.
                  lang.
                  place RX10_TEMP29 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 5451
final int RX10_TEMP30 =
                  RX10_TEMP28;
                
//#line 5454
final x10.
                  lang.
                  place RX10_TEMP31 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP30);
                
//#line 5457
final int RX10_TEMP32 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP30);
                
//#line 5460
final int RX10_TEMP33 =
                  RX10_TEMP32 -
                  RX10_TEMP23;
                
//#line 5463
final T10 utmp10 =
                  new T10(
                  RX10_TEMP33,
                  RX10_TEMP29,
                  RX10_TEMP28,
                  RX10_TEMP27);
                
//#line 5465
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP31)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 5467
Timer.this.
                                    thread10(
                                    utmp10);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp3) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp3);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 5472
final doubleStub[] RX10_TEMP38 =
          (doubleStub[])
            ((new doubleStub[RX10_TEMP25]));
        
//#line 5474
for (
//#line 5474
int RX10_TEMP40 =
                             0;
                           RX10_TEMP40 <
                             RX10_TEMP38.
                               length;
                           
//#line 5474
RX10_TEMP40++) {
            
//#line 5476
final doubleStub RX10_TEMP39 =
              RX10_TEMP27[RX10_TEMP40];
            
//#line 5478
RX10_TEMP38[RX10_TEMP40] =
              RX10_TEMP39;
        }
        
//#line 5481
;
        
//#line 5484
final doubleRefArray1 RX10_TEMP41 =
          new doubleRefArray1(
          d,
          RX10_TEMP38);
        
//#line 5487
final doubleRefArray1 X10_TEMP15 =
          RX10_TEMP41;
        
//#line 5490
elapsed_time =
          X10_TEMP15;
        
//#line 5493
final Region1 RX10_TEMP42 =
          d.
            dReg;
        
//#line 5496
final int RX10_TEMP43 =
          0;
        
//#line 5499
final int RX10_TEMP44 =
          1;
        
//#line 5502
int RX10_TEMP45 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 5505
RX10_TEMP45 =
          RX10_TEMP45 -
            RX10_TEMP44;
        
//#line 5508
final int RX10_TEMP46 =
          RX10_TEMP45 +
          1;
        
//#line 5511
final int RX10_TEMP47 =
          RX10_TEMP45 +
          1;
        
//#line 5514
final doubleStub[] RX10_TEMP48 =
          new doubleStub[RX10_TEMP47];
        
//#line 5517
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 5519
for (
//#line 5519
int RX10_TEMP49 =
                                 0;
                               RX10_TEMP49 <
                                 RX10_TEMP46;
                               
//#line 5519
RX10_TEMP49++) {
                
//#line 5522
final x10.
                  lang.
                  place RX10_TEMP50 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 5525
final int RX10_TEMP51 =
                  RX10_TEMP49;
                
//#line 5528
final x10.
                  lang.
                  place RX10_TEMP52 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP51);
                
//#line 5531
final int RX10_TEMP53 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP51);
                
//#line 5534
final int RX10_TEMP54 =
                  RX10_TEMP53 -
                  RX10_TEMP44;
                
//#line 5537
final T11 utmp11 =
                  new T11(
                  RX10_TEMP54,
                  RX10_TEMP50,
                  RX10_TEMP49,
                  RX10_TEMP48);
                
//#line 5539
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP52)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 5541
Timer.this.
                                    thread11(
                                    utmp11);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp4) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp4);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 5546
final doubleStub[] RX10_TEMP59 =
          (doubleStub[])
            ((new doubleStub[RX10_TEMP46]));
        
//#line 5548
for (
//#line 5548
int RX10_TEMP61 =
                             0;
                           RX10_TEMP61 <
                             RX10_TEMP59.
                               length;
                           
//#line 5548
RX10_TEMP61++) {
            
//#line 5550
final doubleStub RX10_TEMP60 =
              RX10_TEMP48[RX10_TEMP61];
            
//#line 5552
RX10_TEMP59[RX10_TEMP61] =
              RX10_TEMP60;
        }
        
//#line 5555
;
        
//#line 5558
final doubleRefArray1 RX10_TEMP62 =
          new doubleRefArray1(
          d,
          RX10_TEMP59);
        
//#line 5561
final doubleRefArray1 X10_TEMP19 =
          RX10_TEMP62;
        
//#line 5564
total_time =
          X10_TEMP19;
    }
    
    
//#line 5569
public void
                    thread9(
                    final T9 utmpz) {
        
//#line 5572
final int RX10_TEMP12 =
          utmpz.
            RX10_TEMP12;
        
//#line 5575
final x10.
          lang.
          place RX10_TEMP8 =
          utmpz.
            RX10_TEMP8;
        
//#line 5578
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 5581
final doubleStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 5585
final int RX10_TEMP14 =
              RX10_TEMP12 +
              1;
            
//#line 5588
final double[] RX10_TEMP15 =
              new double[RX10_TEMP14];
            
//#line 5590
for (
//#line 5590
int RX10_TEMP13 =
                                 0;
                               RX10_TEMP13 <
                                 RX10_TEMP15.
                                   length;
                               
//#line 5590
RX10_TEMP13++) {
                
//#line 5592
final double X10_TEMP9 =
                  0;
                
//#line 5594
RX10_TEMP15[RX10_TEMP13] =
                  X10_TEMP9;
            }
            
//#line 5597
;
            
//#line 5600
final doubleStub RX10_TEMP16 =
              new doubleStub(
              RX10_TEMP15);
            
//#line 5603
final T18 utmp18 =
              new T18(
              RX10_TEMP16,
              RX10_TEMP7,
              RX10_TEMP6);
            
//#line 5605
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 5607
Timer.this.
                                thread18(
                                utmp18);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 5611
public void
                    thread10(
                    final T10 utmpz) {
        
//#line 5614
final int RX10_TEMP33 =
          utmpz.
            RX10_TEMP33;
        
//#line 5617
final x10.
          lang.
          place RX10_TEMP29 =
          utmpz.
            RX10_TEMP29;
        
//#line 5620
final int RX10_TEMP28 =
          utmpz.
            RX10_TEMP28;
        
//#line 5623
final doubleStub[] RX10_TEMP27 =
          utmpz.
            RX10_TEMP27;
        {
            
//#line 5627
final int RX10_TEMP35 =
              RX10_TEMP33 +
              1;
            
//#line 5630
final double[] RX10_TEMP36 =
              new double[RX10_TEMP35];
            
//#line 5632
for (
//#line 5632
int RX10_TEMP34 =
                                 0;
                               RX10_TEMP34 <
                                 RX10_TEMP36.
                                   length;
                               
//#line 5632
RX10_TEMP34++) {
                
//#line 5634
final double X10_TEMP13 =
                  0;
                
//#line 5636
RX10_TEMP36[RX10_TEMP34] =
                  X10_TEMP13;
            }
            
//#line 5639
;
            
//#line 5642
final doubleStub RX10_TEMP37 =
              new doubleStub(
              RX10_TEMP36);
            
//#line 5645
final T19 utmp19 =
              new T19(
              RX10_TEMP37,
              RX10_TEMP28,
              RX10_TEMP27);
            
//#line 5647
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP29)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 5649
Timer.this.
                                thread19(
                                utmp19);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 5653
public void
                    thread11(
                    final T11 utmpz) {
        
//#line 5656
final int RX10_TEMP54 =
          utmpz.
            RX10_TEMP54;
        
//#line 5659
final x10.
          lang.
          place RX10_TEMP50 =
          utmpz.
            RX10_TEMP50;
        
//#line 5662
final int RX10_TEMP49 =
          utmpz.
            RX10_TEMP49;
        
//#line 5665
final doubleStub[] RX10_TEMP48 =
          utmpz.
            RX10_TEMP48;
        {
            
//#line 5669
final int RX10_TEMP56 =
              RX10_TEMP54 +
              1;
            
//#line 5672
final double[] RX10_TEMP57 =
              new double[RX10_TEMP56];
            
//#line 5674
for (
//#line 5674
int RX10_TEMP55 =
                                 0;
                               RX10_TEMP55 <
                                 RX10_TEMP57.
                                   length;
                               
//#line 5674
RX10_TEMP55++) {
                
//#line 5676
final double X10_TEMP17 =
                  0;
                
//#line 5678
RX10_TEMP57[RX10_TEMP55] =
                  X10_TEMP17;
            }
            
//#line 5681
;
            
//#line 5684
final doubleStub RX10_TEMP58 =
              new doubleStub(
              RX10_TEMP57);
            
//#line 5687
final T20 utmp20 =
              new T20(
              RX10_TEMP58,
              RX10_TEMP49,
              RX10_TEMP48);
            
//#line 5689
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP50)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 5691
Timer.this.
                                thread20(
                                utmp20);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 5695
public void
                    thread18(
                    final T18 utmpz) {
        
//#line 5698
final doubleStub RX10_TEMP16 =
          utmpz.
            RX10_TEMP16;
        
//#line 5701
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 5704
final doubleStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 5707
RX10_TEMP6[RX10_TEMP7] =
              RX10_TEMP16;
        }
    }
    
    
//#line 5710
public void
                    thread19(
                    final T19 utmpz) {
        
//#line 5713
final doubleStub RX10_TEMP37 =
          utmpz.
            RX10_TEMP37;
        
//#line 5716
final int RX10_TEMP28 =
          utmpz.
            RX10_TEMP28;
        
//#line 5719
final doubleStub[] RX10_TEMP27 =
          utmpz.
            RX10_TEMP27;
        {
            
//#line 5722
RX10_TEMP27[RX10_TEMP28] =
              RX10_TEMP37;
        }
    }
    
    
//#line 5725
public void
                    thread20(
                    final T20 utmpz) {
        
//#line 5728
final doubleStub RX10_TEMP58 =
          utmpz.
            RX10_TEMP58;
        
//#line 5731
final int RX10_TEMP49 =
          utmpz.
            RX10_TEMP49;
        
//#line 5734
final doubleStub[] RX10_TEMP48 =
          utmpz.
            RX10_TEMP48;
        {
            
//#line 5737
RX10_TEMP48[RX10_TEMP49] =
              RX10_TEMP58;
        }
    }
}

class byteStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5745
final public byte[]
      localArray;
    
    
//#line 5748
public byteStub(final byte[] localArray_) {
        
//#line 5749
super();
        
//#line 5751
localArray =
          localArray_;
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
    
//#line 5760
final public int
      regRank;
    
//#line 5761
final public int
      regSize;
    
//#line 5762
final public boolean
      regType;
    
//#line 5763
final public int
      low0;
    
//#line 5764
final public int
      dim0;
    
//#line 5765
final public Point1[]
      pointArray;
    
    
//#line 5768
public Region1(final Point1[] pointArray_) {
        
//#line 5769
super();
        
//#line 5771
final int zero =
          0;
        
//#line 5774
final int one =
          1;
        
//#line 5777
final int minusOne =
          zero -
          one;
        
//#line 5780
regRank =
          1;
        
//#line 5783
regSize =
          pointArray_.
            length;
        
//#line 5786
pointArray =
          pointArray_;
        
//#line 5789
regType =
          false;
        
//#line 5792
low0 =
          minusOne;
        
//#line 5795
dim0 =
          zero;
    }
    
    
//#line 5798
public Region1(final Point1[] pointArray_,
                                 final int low0_,
                                 final int dim0_) {
        
//#line 5799
super();
        
//#line 5801
regRank =
          1;
        
//#line 5804
regSize =
          pointArray_.
            length;
        
//#line 5807
pointArray =
          pointArray_;
        
//#line 5810
regType =
          true;
        
//#line 5813
low0 =
          low0_;
        
//#line 5816
dim0 =
          dim0_;
    }
}

class doubleStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5825
final public double[]
      localArray;
    
    
//#line 5828
public doubleStub(final double[] localArray_) {
        
//#line 5829
super();
        
//#line 5831
localArray =
          localArray_;
    }
}

class intValArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5840
final public Region1
      regionValue;
    
//#line 5841
final public int[]
      contents;
    
    
//#line 5844
public intValArray1(final Region1 regionValue_,
                                      final int[] contents_) {
        
//#line 5845
super();
        
//#line 5847
regionValue =
          regionValue_;
        
//#line 5850
contents =
          contents_;
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
    
//#line 5859
final public int
      f0;
    
    
//#line 5862
public Point1(final int f0_) {
        
//#line 5863
super();
        
//#line 5865
f0 =
          f0_;
    }
}

class intStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 5874
final public int[]
      localArray;
    
    
//#line 5877
public intStub(final int[] localArray_) {
        
//#line 5878
super();
        
//#line 5880
localArray =
          localArray_;
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
    
//#line 5889
final public x10.
      lang.
      place[]
      placeArray;
    
//#line 5890
final public int[]
      counts;
    
//#line 5891
final public int[]
      runningSum;
    
    
//#line 5894
public Dist(final x10.
                                lang.
                                place[] vPlaceArray,
                              final int arraySize) {
        
//#line 5895
super();
        
//#line 5897
final int one =
          1;
        
//#line 5900
final int zero =
          0;
        
//#line 5903
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 5906
final int ub =
          maxPlaces -
          one;
        
//#line 5909
final int countReg =
          ub +
          1;
        
//#line 5912
final int countDist =
          ub +
          1;
        
//#line 5915
final int rSize =
          arraySize -
          one;
        
//#line 5918
final int arrayReg =
          rSize +
          1;
        
//#line 5921
final int runSumDist =
          rSize +
          1;
        
//#line 5924
final int[] tempCounts =
          new int[countDist];
        
//#line 5927
final int[] tempRunSum =
          new int[runSumDist];
        
//#line 5929
for (
//#line 5929
int p =
                             0;
                           p <
                             countReg;
                           
//#line 5929
p++) {
            
//#line 5931
tempCounts[p] =
              zero;
        }
        
//#line 5933
for (
//#line 5933
int p =
                             0;
                           p <
                             arrayReg;
                           
//#line 5933
p++) {
            
//#line 5936
final x10.
              lang.
              place pl =
              vPlaceArray[p];
            
//#line 5939
final int index =
              pl.
                id;
            
//#line 5942
final int oldVal =
              tempCounts[index];
            
//#line 5944
tempRunSum[p] =
              oldVal;
            
//#line 5946
final int oldValPlusOne =
              oldVal +
              one;
            
//#line 5948
tempCounts[index] =
              oldValPlusOne;
        }
        
//#line 5951
placeArray =
          vPlaceArray;
        
//#line 5954
counts =
          Program.
            initDist(
            tempCounts,
            countReg);
        
//#line 5957
runningSum =
          Program.
            initDist(
            tempRunSum,
            arrayReg);
    }
}

class IDEATest
extends x10.
  lang.
  Object
{
    
//#line 5965
public byteRefArray1
      plain1;
    
//#line 5966
public byteRefArray1
      crypt1;
    
//#line 5967
public byteRefArray1
      plain2;
    
//#line 5968
public intValArray1
      userkey;
    
//#line 5969
public intValArray1
      ZR;
    
//#line 5970
public intValArray1
      DKR;
    
    
//#line 5973
public IDEATest() {
        
//#line 5974
super();
        
//#line 5975
this.
                        IDEATest_buildTestData();
        
//#line 5977
final int X10_TEMP6 =
          0;
        
//#line 5980
final int X10_TEMP3 =
          Program.
            _IDEATest_array_rows;
        
//#line 5983
final int X10_TEMP4 =
          1;
        
//#line 5986
final int X10_TEMP7 =
          X10_TEMP3 -
          X10_TEMP4;
        
//#line 5989
final Region1 X10_TEMP9 =
          Program.
            createNewRegion1R(
            X10_TEMP6,
            X10_TEMP7);
        
//#line 5992
final Dist1 X10_TEMP10 =
          Program.
            getBlockDist1(
            X10_TEMP9);
        
//#line 5995
final Dist1 D =
          X10_TEMP10;
        
//#line 5998
final Region1 RX10_TEMP0 =
          D.
            dReg;
        
//#line 6001
final int RX10_TEMP1 =
          0;
        
//#line 6004
final int RX10_TEMP2 =
          1;
        
//#line 6007
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 6010
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 6013
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 6016
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 6019
final byteStub[] RX10_TEMP6 =
          new byteStub[RX10_TEMP5];
        
//#line 6022
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 6024
for (
//#line 6024
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 6024
RX10_TEMP7++) {
                
//#line 6027
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6030
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 6033
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 6036
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    D,
                    RX10_TEMP9);
                
//#line 6039
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 6042
final Point1[] RX10_TEMP13 =
                  Program.
                    getDistLocalArray1(
                    D,
                    RX10_TEMP9);
                
//#line 6045
final T3 utmp3 =
                  new T3(
                  RX10_TEMP13,
                  RX10_TEMP12,
                  RX10_TEMP8,
                  RX10_TEMP7,
                  RX10_TEMP6);
                
//#line 6047
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 6049
IDEATest.this.
                                    thread3(
                                    utmp3);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp5) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp5);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 6054
final byteStub[] RX10_TEMP18 =
          (byteStub[])
            ((new byteStub[RX10_TEMP4]));
        
//#line 6056
for (
//#line 6056
int RX10_TEMP20 =
                             0;
                           RX10_TEMP20 <
                             RX10_TEMP18.
                               length;
                           
//#line 6056
RX10_TEMP20++) {
            
//#line 6058
final byteStub RX10_TEMP19 =
              RX10_TEMP6[RX10_TEMP20];
            
//#line 6060
RX10_TEMP18[RX10_TEMP20] =
              RX10_TEMP19;
        }
        
//#line 6063
;
        
//#line 6066
final byteRefArray1 RX10_TEMP21 =
          new byteRefArray1(
          D,
          RX10_TEMP18);
        
//#line 6069
final byteRefArray1 X10_TEMP17 =
          RX10_TEMP21;
        
//#line 6072
plain1 =
          X10_TEMP17;
        
//#line 6075
final Region1 RX10_TEMP22 =
          D.
            dReg;
        
//#line 6078
final int RX10_TEMP23 =
          0;
        
//#line 6081
final int RX10_TEMP24 =
          1;
        
//#line 6084
int RX10_TEMP25 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 6087
RX10_TEMP25 =
          RX10_TEMP25 -
            RX10_TEMP24;
        
//#line 6090
final int RX10_TEMP26 =
          RX10_TEMP25 +
          1;
        
//#line 6093
final int RX10_TEMP27 =
          RX10_TEMP25 +
          1;
        
//#line 6096
final byteStub[] RX10_TEMP28 =
          new byteStub[RX10_TEMP27];
        
//#line 6099
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 6101
for (
//#line 6101
int RX10_TEMP29 =
                                 0;
                               RX10_TEMP29 <
                                 RX10_TEMP26;
                               
//#line 6101
RX10_TEMP29++) {
                
//#line 6104
final x10.
                  lang.
                  place RX10_TEMP30 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6107
final int RX10_TEMP31 =
                  RX10_TEMP29;
                
//#line 6110
final x10.
                  lang.
                  place RX10_TEMP32 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP31);
                
//#line 6113
final int RX10_TEMP33 =
                  Program.
                    getDistLocalCount1(
                    D,
                    RX10_TEMP31);
                
//#line 6116
final int RX10_TEMP34 =
                  RX10_TEMP33 -
                  RX10_TEMP24;
                
//#line 6119
final T4 utmp4 =
                  new T4(
                  RX10_TEMP34,
                  RX10_TEMP30,
                  RX10_TEMP29,
                  RX10_TEMP28);
                
//#line 6121
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP32)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 6123
IDEATest.this.
                                    thread4(
                                    utmp4);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp6) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 6128
final byteStub[] RX10_TEMP38 =
          (byteStub[])
            ((new byteStub[RX10_TEMP26]));
        
//#line 6130
for (
//#line 6130
int RX10_TEMP40 =
                             0;
                           RX10_TEMP40 <
                             RX10_TEMP38.
                               length;
                           
//#line 6130
RX10_TEMP40++) {
            
//#line 6132
final byteStub RX10_TEMP39 =
              RX10_TEMP28[RX10_TEMP40];
            
//#line 6134
RX10_TEMP38[RX10_TEMP40] =
              RX10_TEMP39;
        }
        
//#line 6137
;
        
//#line 6140
final byteRefArray1 RX10_TEMP41 =
          new byteRefArray1(
          D,
          RX10_TEMP38);
        
//#line 6143
final byteRefArray1 X10_TEMP19 =
          RX10_TEMP41;
        
//#line 6146
crypt1 =
          X10_TEMP19;
        
//#line 6149
final Region1 RX10_TEMP42 =
          D.
            dReg;
        
//#line 6152
final int RX10_TEMP43 =
          0;
        
//#line 6155
final int RX10_TEMP44 =
          1;
        
//#line 6158
int RX10_TEMP45 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 6161
RX10_TEMP45 =
          RX10_TEMP45 -
            RX10_TEMP44;
        
//#line 6164
final int RX10_TEMP46 =
          RX10_TEMP45 +
          1;
        
//#line 6167
final int RX10_TEMP47 =
          RX10_TEMP45 +
          1;
        
//#line 6170
final byteStub[] RX10_TEMP48 =
          new byteStub[RX10_TEMP47];
        
//#line 6173
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 6175
for (
//#line 6175
int RX10_TEMP49 =
                                 0;
                               RX10_TEMP49 <
                                 RX10_TEMP46;
                               
//#line 6175
RX10_TEMP49++) {
                
//#line 6178
final x10.
                  lang.
                  place RX10_TEMP50 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6181
final int RX10_TEMP51 =
                  RX10_TEMP49;
                
//#line 6184
final x10.
                  lang.
                  place RX10_TEMP52 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP51);
                
//#line 6187
final int RX10_TEMP53 =
                  Program.
                    getDistLocalCount1(
                    D,
                    RX10_TEMP51);
                
//#line 6190
final int RX10_TEMP54 =
                  RX10_TEMP53 -
                  RX10_TEMP44;
                
//#line 6193
final T5 utmp5 =
                  new T5(
                  RX10_TEMP54,
                  RX10_TEMP50,
                  RX10_TEMP49,
                  RX10_TEMP48);
                
//#line 6195
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP52)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 6197
IDEATest.this.
                                    thread5(
                                    utmp5);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp7) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 6202
final byteStub[] RX10_TEMP58 =
          (byteStub[])
            ((new byteStub[RX10_TEMP46]));
        
//#line 6204
for (
//#line 6204
int RX10_TEMP60 =
                             0;
                           RX10_TEMP60 <
                             RX10_TEMP58.
                               length;
                           
//#line 6204
RX10_TEMP60++) {
            
//#line 6206
final byteStub RX10_TEMP59 =
              RX10_TEMP48[RX10_TEMP60];
            
//#line 6208
RX10_TEMP58[RX10_TEMP60] =
              RX10_TEMP59;
        }
        
//#line 6211
;
        
//#line 6214
final byteRefArray1 RX10_TEMP61 =
          new byteRefArray1(
          D,
          RX10_TEMP58);
        
//#line 6217
final byteRefArray1 X10_TEMP21 =
          RX10_TEMP61;
        
//#line 6220
plain2 =
          X10_TEMP21;
    }
    
    
//#line 6225
public void
                    IDEATest_buildTestData(
                    ) {
        
//#line 6228
long X10_TEMP2 =
          136506717L;
        
//#line 6231
final Random rndnum =
          new Random(
          X10_TEMP2);
        
//#line 6234
final int X10_TEMP6 =
          0;
        
//#line 6237
final int X10_TEMP7 =
          7;
        
//#line 6240
final Region1 rUserKey =
          Program.
            createNewRegion1R(
            X10_TEMP6,
            X10_TEMP7);
        
//#line 6243
final x10.
          lang.
          place X10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 6246
final Dist1 dUserKey =
          Program.
            getPlaceDist1(
            rUserKey,
            X10_TEMP9);
        
//#line 6249
final Region1 RX10_TEMP0 =
          dUserKey.
            dReg;
        
//#line 6252
final int RX10_TEMP1 =
          0;
        
//#line 6255
final int RX10_TEMP2 =
          1;
        
//#line 6258
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 6261
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 6264
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 6267
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 6270
final intStub[] RX10_TEMP6 =
          new intStub[RX10_TEMP5];
        
//#line 6273
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 6275
for (
//#line 6275
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 6275
RX10_TEMP7++) {
                
//#line 6278
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6281
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 6284
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 6287
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    dUserKey,
                    RX10_TEMP9);
                
//#line 6290
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 6293
final T6 utmp6 =
                  new T6(
                  RX10_TEMP12,
                  RX10_TEMP8,
                  RX10_TEMP7,
                  RX10_TEMP6);
                
//#line 6295
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 6297
IDEATest.this.
                                    thread6(
                                    utmp6);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp8) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp8);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 6302
final intStub[] RX10_TEMP16 =
          (intStub[])
            ((new intStub[RX10_TEMP4]));
        
//#line 6304
for (
//#line 6304
int RX10_TEMP18 =
                             0;
                           RX10_TEMP18 <
                             RX10_TEMP16.
                               length;
                           
//#line 6304
RX10_TEMP18++) {
            
//#line 6306
final intStub RX10_TEMP17 =
              RX10_TEMP6[RX10_TEMP18];
            
//#line 6308
RX10_TEMP16[RX10_TEMP18] =
              RX10_TEMP17;
        }
        
//#line 6311
;
        
//#line 6314
final intRefArray1 RX10_TEMP19 =
          new intRefArray1(
          dUserKey,
          RX10_TEMP16);
        
//#line 6317
final intRefArray1 tUserKey =
          RX10_TEMP19;
        
//#line 6320
final int RX10_TEMP23 =
          1;
        
//#line 6323
int RX10_TEMP21 =
          rUserKey.
            regSize;
        
//#line 6326
RX10_TEMP21 =
          RX10_TEMP21 -
            RX10_TEMP23;
        
//#line 6329
final int RX10_TEMP22 =
          RX10_TEMP21 +
          1;
        
//#line 6331
for (
//#line 6331
int RX10_TEMP20 =
                             0;
                           RX10_TEMP20 <
                             RX10_TEMP22;
                           
//#line 6331
RX10_TEMP20++) {
            
//#line 6334
final int RX10_TEMP24 =
              RX10_TEMP20;
            
//#line 6337
final Point1 pt =
              Program.
                regionOrdinalPoint1(
                rUserKey,
                RX10_TEMP24);
            
//#line 6340
final int X10_TEMP14 =
              Program.
                Random_nextInt(
                rndnum);
            
//#line 6343
final int X10_TEMP17 =
              (short)
                X10_TEMP14;
            
//#line 6346
final int X10_TEMP18 =
              X10_TEMP17;
            
//#line 6349
final Dist1 RX10_TEMP25 =
              tUserKey.
                distValue;
            
//#line 6352
final Region1 RX10_TEMP26 =
              RX10_TEMP25.
                dReg;
            
//#line 6355
final int RX10_TEMP27 =
              Program.
                searchPointInRegion1(
                RX10_TEMP26,
                pt);
            
//#line 6358
final int RX10_TEMP28 =
              0;
            
//#line 6361
final boolean RX10_TEMP29 =
              RX10_TEMP27 <
              RX10_TEMP28;
            
//#line 6363
if (RX10_TEMP29) {
                
//#line 6366
java.
                  lang.
                  String RX10_TEMP30 =
                  "Array index out of bounds";
                
//#line 6368
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP30);
            }
            
//#line 6372
final x10.
              lang.
              place RX10_TEMP31 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP25,
                RX10_TEMP27);
            
//#line 6375
final x10.
              lang.
              place RX10_TEMP33 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 6378
final boolean RX10_TEMP34 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP31,RX10_TEMP33))/* } */;
            
//#line 6380
if (RX10_TEMP34) {
                
//#line 6383
java.
                  lang.
                  String RX10_TEMP32 =
                  "Bad place access for array tUserKey";
                
//#line 6385
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP32);
            }
            
//#line 6388
Program.
                            setRefArrayValue1int(
                            tUserKey,
                            RX10_TEMP27,
                            X10_TEMP18);
        }
        
//#line 6391
final Region1 RX10_TEMP35 =
          rUserKey;
        
//#line 6394
final int RX10_TEMP50 =
          rUserKey.
            regSize;
        
//#line 6397
final int RX10_TEMP51 =
          1;
        
//#line 6400
final int RX10_TEMP52 =
          RX10_TEMP50 -
          RX10_TEMP51;
        
//#line 6403
final int RX10_TEMP49 =
          RX10_TEMP52 +
          1;
        
//#line 6406
final int[] RX10_TEMP53 =
          (int[])
            ((new int[RX10_TEMP49]));
        
//#line 6408
for (
//#line 6408
int RX10_TEMP36 =
                             0;
                           RX10_TEMP36 <
                             RX10_TEMP53.
                               length;
                           
//#line 6408
RX10_TEMP36++) {
            
//#line 6410
final int RX10_TEMP37 =
              RX10_TEMP36;
            
//#line 6413
final Point1 pt =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP35,
                RX10_TEMP37);
            
//#line 6416
final Dist1 RX10_TEMP38 =
              tUserKey.
                distValue;
            
//#line 6419
final Region1 RX10_TEMP39 =
              RX10_TEMP38.
                dReg;
            
//#line 6422
final int RX10_TEMP40 =
              Program.
                searchPointInRegion1(
                RX10_TEMP39,
                pt);
            
//#line 6425
final int RX10_TEMP41 =
              0;
            
//#line 6428
final boolean RX10_TEMP42 =
              RX10_TEMP40 <
              RX10_TEMP41;
            
//#line 6430
if (RX10_TEMP42) {
                
//#line 6433
java.
                  lang.
                  String RX10_TEMP43 =
                  "Array access index out of bounds";
                
//#line 6435
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP43);
            }
            
//#line 6439
final x10.
              lang.
              place RX10_TEMP44 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP38,
                RX10_TEMP40);
            
//#line 6442
final x10.
              lang.
              place RX10_TEMP46 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 6445
final boolean RX10_TEMP47 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP44,RX10_TEMP46))/* } */;
            
//#line 6447
if (RX10_TEMP47) {
                
//#line 6450
java.
                  lang.
                  String RX10_TEMP45 =
                  "Bad place access for array tUserKey";
                
//#line 6452
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP45);
            }
            
//#line 6456
final int RX10_TEMP48 =
              Program.
                getRefArrayValue1int(
                tUserKey,
                RX10_TEMP40);
            
//#line 6459
final int X10_TEMP21 =
              RX10_TEMP48;
            
//#line 6461
RX10_TEMP53[RX10_TEMP36] =
              X10_TEMP21;
        }
        
//#line 6464
;
        
//#line 6467
final intValArray1 RX10_TEMP54 =
          new intValArray1(
          rUserKey,
          RX10_TEMP53);
        
//#line 6470
final intValArray1 X10_TEMP22 =
          RX10_TEMP54;
        
//#line 6473
final intValArray1 tempuserkey =
          X10_TEMP22;
        
//#line 6476
userkey =
          tempuserkey;
        
//#line 6479
final intValArray1 tempZR =
          this.
            IDEATest_calcEncryptKey(
            tempuserkey);
        
//#line 6482
ZR =
          tempZR;
        
//#line 6484
this.
                        IDEATest_calcDecryptKey(
                        tempZR);
    }
    
    
//#line 6486
public intValArray1
                    IDEATest_calcEncryptKey(
                    final intValArray1 auserkey) {
        
//#line 6489
int j =
          0;
        
//#line 6492
final int X10_TEMP4 =
          0;
        
//#line 6495
final int X10_TEMP5 =
          51;
        
//#line 6498
final Region1 rZ =
          Program.
            createNewRegion1R(
            X10_TEMP4,
            X10_TEMP5);
        
//#line 6501
final x10.
          lang.
          place X10_TEMP7 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 6504
final Dist1 dZ =
          Program.
            getPlaceDist1(
            rZ,
            X10_TEMP7);
        
//#line 6507
final Region1 RX10_TEMP0 =
          dZ.
            dReg;
        
//#line 6510
final int RX10_TEMP1 =
          0;
        
//#line 6513
final int RX10_TEMP2 =
          1;
        
//#line 6516
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 6519
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 6522
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 6525
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 6528
final intStub[] RX10_TEMP6 =
          new intStub[RX10_TEMP5];
        
//#line 6531
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 6533
for (
//#line 6533
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 6533
RX10_TEMP7++) {
                
//#line 6536
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6539
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 6542
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 6545
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    dZ,
                    RX10_TEMP9);
                
//#line 6548
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 6551
final T7 utmp7 =
                  new T7(
                  RX10_TEMP12,
                  RX10_TEMP8,
                  RX10_TEMP7,
                  RX10_TEMP6);
                
//#line 6553
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 6555
IDEATest.this.
                                    thread7(
                                    utmp7);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp9) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp9);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 6560
final intStub[] RX10_TEMP16 =
          (intStub[])
            ((new intStub[RX10_TEMP4]));
        
//#line 6562
for (
//#line 6562
int RX10_TEMP18 =
                             0;
                           RX10_TEMP18 <
                             RX10_TEMP16.
                               length;
                           
//#line 6562
RX10_TEMP18++) {
            
//#line 6564
final intStub RX10_TEMP17 =
              RX10_TEMP6[RX10_TEMP18];
            
//#line 6566
RX10_TEMP16[RX10_TEMP18] =
              RX10_TEMP17;
        }
        
//#line 6569
;
        
//#line 6572
final intRefArray1 RX10_TEMP19 =
          new intRefArray1(
          dZ,
          RX10_TEMP16);
        
//#line 6575
final intRefArray1 Z =
          RX10_TEMP19;
        
//#line 6578
final int X10_TEMP12 =
          0;
        
//#line 6581
final int X10_TEMP13 =
          7;
        
//#line 6584
final Region1 X10_TEMP15 =
          Program.
            createNewRegion1R(
            X10_TEMP12,
            X10_TEMP13);
        
//#line 6587
final int RX10_TEMP23 =
          1;
        
//#line 6590
int RX10_TEMP21 =
          X10_TEMP15.
            regSize;
        
//#line 6593
RX10_TEMP21 =
          RX10_TEMP21 -
            RX10_TEMP23;
        
//#line 6596
final int RX10_TEMP22 =
          RX10_TEMP21 +
          1;
        
//#line 6598
for (
//#line 6598
int RX10_TEMP20 =
                             0;
                           RX10_TEMP20 <
                             RX10_TEMP22;
                           
//#line 6598
RX10_TEMP20++) {
            
//#line 6601
final int RX10_TEMP24 =
              RX10_TEMP20;
            
//#line 6604
final Point1 i =
              Program.
                regionOrdinalPoint1(
                X10_TEMP15,
                RX10_TEMP24);
            
//#line 6607
final Region1 RX10_TEMP25 =
              auserkey.
                regionValue;
            
//#line 6610
final int RX10_TEMP26 =
              Program.
                searchPointInRegion1(
                RX10_TEMP25,
                i);
            
//#line 6613
final int RX10_TEMP27 =
              0;
            
//#line 6616
final boolean RX10_TEMP28 =
              RX10_TEMP26 <
              RX10_TEMP27;
            
//#line 6618
if (RX10_TEMP28) {
                
//#line 6621
java.
                  lang.
                  String RX10_TEMP29 =
                  "Array access index out of bounds";
                
//#line 6623
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP29);
            }
            
//#line 6627
final int[] RX10_TEMP30 =
              (int[])
                ((auserkey.
                    contents));
            
//#line 6630
final int X10_TEMP18 =
              RX10_TEMP30[RX10_TEMP26];
            
//#line 6633
final int X10_TEMP19 =
              65535;
            
//#line 6636
final int X10_TEMP22 =
              X10_TEMP18 &
              X10_TEMP19;
            
//#line 6639
final int X10_TEMP23 =
              X10_TEMP22;
            
//#line 6642
final Dist1 RX10_TEMP31 =
              Z.
                distValue;
            
//#line 6645
final Region1 RX10_TEMP32 =
              RX10_TEMP31.
                dReg;
            
//#line 6648
final int RX10_TEMP33 =
              Program.
                searchPointInRegion1(
                RX10_TEMP32,
                i);
            
//#line 6651
final int RX10_TEMP34 =
              0;
            
//#line 6654
final boolean RX10_TEMP35 =
              RX10_TEMP33 <
              RX10_TEMP34;
            
//#line 6656
if (RX10_TEMP35) {
                
//#line 6659
java.
                  lang.
                  String RX10_TEMP36 =
                  "Array index out of bounds";
                
//#line 6661
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP36);
            }
            
//#line 6665
final x10.
              lang.
              place RX10_TEMP37 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP31,
                RX10_TEMP33);
            
//#line 6668
final x10.
              lang.
              place RX10_TEMP39 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 6671
final boolean RX10_TEMP40 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP37,RX10_TEMP39))/* } */;
            
//#line 6673
if (RX10_TEMP40) {
                
//#line 6676
java.
                  lang.
                  String RX10_TEMP38 =
                  "Bad place access for array Z";
                
//#line 6678
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP38);
            }
            
//#line 6681
Program.
                            setRefArrayValue1int(
                            Z,
                            RX10_TEMP33,
                            X10_TEMP23);
        }
        
//#line 6684
final int X10_TEMP26 =
          8;
        
//#line 6687
final int X10_TEMP27 =
          51;
        
//#line 6690
final Region1 X10_TEMP29 =
          Program.
            createNewRegion1R(
            X10_TEMP26,
            X10_TEMP27);
        
//#line 6693
final int RX10_TEMP44 =
          1;
        
//#line 6696
int RX10_TEMP42 =
          X10_TEMP29.
            regSize;
        
//#line 6699
RX10_TEMP42 =
          RX10_TEMP42 -
            RX10_TEMP44;
        
//#line 6702
final int RX10_TEMP43 =
          RX10_TEMP42 +
          1;
        
//#line 6704
for (
//#line 6704
int RX10_TEMP41 =
                             0;
                           RX10_TEMP41 <
                             RX10_TEMP43;
                           
//#line 6704
RX10_TEMP41++) {
            
//#line 6707
final int RX10_TEMP45 =
              RX10_TEMP41;
            
//#line 6710
final Point1 i =
              Program.
                regionOrdinalPoint1(
                X10_TEMP29,
                RX10_TEMP45);
            
//#line 6713
final int X10_TEMP31 =
              i.
                f0;
            
//#line 6716
final int X10_TEMP32 =
              8;
            
//#line 6719
final int X10_TEMP34 =
              X10_TEMP31 %
              X10_TEMP32;
            
//#line 6722
j =
              X10_TEMP34;
            
//#line 6725
final int X10_TEMP35 =
              6;
            
//#line 6728
final boolean X10_TEMP37 =
              j <
              X10_TEMP35;
            
//#line 6730
if (X10_TEMP37) {
                
//#line 6733
final int X10_TEMP39 =
                  7;
                
//#line 6736
final int X10_TEMP40 =
                  0;
                
//#line 6739
int X10_TEMP42 =
                  X10_TEMP40 -
                  X10_TEMP39;
                
//#line 6742
int RX10_TEMP46 =
                  i.
                    f0;
                
//#line 6745
RX10_TEMP46 =
                  RX10_TEMP46 +
                    X10_TEMP42;
                
//#line 6748
final Point1 X10_TEMP44 =
                  new Point1(
                  RX10_TEMP46);
                
//#line 6751
final Dist1 RX10_TEMP47 =
                  Z.
                    distValue;
                
//#line 6754
final Region1 RX10_TEMP48 =
                  RX10_TEMP47.
                    dReg;
                
//#line 6757
final int RX10_TEMP49 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP48,
                    X10_TEMP44);
                
//#line 6760
final int RX10_TEMP50 =
                  0;
                
//#line 6763
final boolean RX10_TEMP51 =
                  RX10_TEMP49 <
                  RX10_TEMP50;
                
//#line 6765
if (RX10_TEMP51) {
                    
//#line 6768
java.
                      lang.
                      String RX10_TEMP52 =
                      "Array access index out of bounds";
                    
//#line 6770
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP52);
                }
                
//#line 6774
final x10.
                  lang.
                  place RX10_TEMP53 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP47,
                    RX10_TEMP49);
                
//#line 6777
final x10.
                  lang.
                  place RX10_TEMP55 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6780
final boolean RX10_TEMP56 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP53,RX10_TEMP55))/* } */;
                
//#line 6782
if (RX10_TEMP56) {
                    
//#line 6785
java.
                      lang.
                      String RX10_TEMP54 =
                      "Bad place access for array Z";
                    
//#line 6787
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP54);
                }
                
//#line 6791
final int RX10_TEMP57 =
                  Program.
                    getRefArrayValue1int(
                    Z,
                    RX10_TEMP49);
                
//#line 6794
final int X10_TEMP45 =
                  RX10_TEMP57;
                
//#line 6797
final int X10_TEMP46 =
                  9;
                
//#line 6800
final int X10_TEMP48 =
                  X10_TEMP45 >>>
                  X10_TEMP46;
                
//#line 6803
final int X10_TEMP49 =
                  6;
                
//#line 6806
final int X10_TEMP50 =
                  0;
                
//#line 6809
int X10_TEMP52 =
                  X10_TEMP50 -
                  X10_TEMP49;
                
//#line 6812
int RX10_TEMP58 =
                  i.
                    f0;
                
//#line 6815
RX10_TEMP58 =
                  RX10_TEMP58 +
                    X10_TEMP52;
                
//#line 6818
final Point1 X10_TEMP54 =
                  new Point1(
                  RX10_TEMP58);
                
//#line 6821
final Dist1 RX10_TEMP59 =
                  Z.
                    distValue;
                
//#line 6824
final Region1 RX10_TEMP60 =
                  RX10_TEMP59.
                    dReg;
                
//#line 6827
final int RX10_TEMP61 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP60,
                    X10_TEMP54);
                
//#line 6830
final int RX10_TEMP62 =
                  0;
                
//#line 6833
final boolean RX10_TEMP63 =
                  RX10_TEMP61 <
                  RX10_TEMP62;
                
//#line 6835
if (RX10_TEMP63) {
                    
//#line 6838
java.
                      lang.
                      String RX10_TEMP64 =
                      "Array access index out of bounds";
                    
//#line 6840
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP64);
                }
                
//#line 6844
final x10.
                  lang.
                  place RX10_TEMP65 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP59,
                    RX10_TEMP61);
                
//#line 6847
final x10.
                  lang.
                  place RX10_TEMP67 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6850
final boolean RX10_TEMP68 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP65,RX10_TEMP67))/* } */;
                
//#line 6852
if (RX10_TEMP68) {
                    
//#line 6855
java.
                      lang.
                      String RX10_TEMP66 =
                      "Bad place access for array Z";
                    
//#line 6857
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP66);
                }
                
//#line 6861
final int RX10_TEMP69 =
                  Program.
                    getRefArrayValue1int(
                    Z,
                    RX10_TEMP61);
                
//#line 6864
final int X10_TEMP55 =
                  RX10_TEMP69;
                
//#line 6867
final int X10_TEMP56 =
                  7;
                
//#line 6870
final int X10_TEMP58 =
                  X10_TEMP55 <<
                  X10_TEMP56;
                
//#line 6873
final int X10_TEMP60 =
                  X10_TEMP48 |
                  X10_TEMP58;
                
//#line 6876
final int X10_TEMP61 =
                  65535;
                
//#line 6879
final int X10_TEMP64 =
                  X10_TEMP60 &
                  X10_TEMP61;
                
//#line 6882
final int X10_TEMP65 =
                  X10_TEMP64;
                
//#line 6885
final Dist1 RX10_TEMP70 =
                  Z.
                    distValue;
                
//#line 6888
final Region1 RX10_TEMP71 =
                  RX10_TEMP70.
                    dReg;
                
//#line 6891
final int RX10_TEMP72 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP71,
                    i);
                
//#line 6894
final int RX10_TEMP73 =
                  0;
                
//#line 6897
final boolean RX10_TEMP74 =
                  RX10_TEMP72 <
                  RX10_TEMP73;
                
//#line 6899
if (RX10_TEMP74) {
                    
//#line 6902
java.
                      lang.
                      String RX10_TEMP75 =
                      "Array index out of bounds";
                    
//#line 6904
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP75);
                }
                
//#line 6908
final x10.
                  lang.
                  place RX10_TEMP76 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP70,
                    RX10_TEMP72);
                
//#line 6911
final x10.
                  lang.
                  place RX10_TEMP78 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6914
final boolean RX10_TEMP79 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP76,RX10_TEMP78))/* } */;
                
//#line 6916
if (RX10_TEMP79) {
                    
//#line 6919
java.
                      lang.
                      String RX10_TEMP77 =
                      "Bad place access for array Z";
                    
//#line 6921
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP77);
                }
                
//#line 6924
Program.
                                setRefArrayValue1int(
                                Z,
                                RX10_TEMP72,
                                X10_TEMP65);
                
//#line 6925
continue;
            }
            
//#line 6928
final int X10_TEMP66 =
              6;
            
//#line 6931
final boolean X10_TEMP68 =
              j ==
              X10_TEMP66;
            
//#line 6933
if (X10_TEMP68) {
                
//#line 6936
final int X10_TEMP70 =
                  7;
                
//#line 6939
final int X10_TEMP71 =
                  0;
                
//#line 6942
int X10_TEMP73 =
                  X10_TEMP71 -
                  X10_TEMP70;
                
//#line 6945
int RX10_TEMP80 =
                  i.
                    f0;
                
//#line 6948
RX10_TEMP80 =
                  RX10_TEMP80 +
                    X10_TEMP73;
                
//#line 6951
final Point1 X10_TEMP75 =
                  new Point1(
                  RX10_TEMP80);
                
//#line 6954
final Dist1 RX10_TEMP81 =
                  Z.
                    distValue;
                
//#line 6957
final Region1 RX10_TEMP82 =
                  RX10_TEMP81.
                    dReg;
                
//#line 6960
final int RX10_TEMP83 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP82,
                    X10_TEMP75);
                
//#line 6963
final int RX10_TEMP84 =
                  0;
                
//#line 6966
final boolean RX10_TEMP85 =
                  RX10_TEMP83 <
                  RX10_TEMP84;
                
//#line 6968
if (RX10_TEMP85) {
                    
//#line 6971
java.
                      lang.
                      String RX10_TEMP86 =
                      "Array access index out of bounds";
                    
//#line 6973
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP86);
                }
                
//#line 6977
final x10.
                  lang.
                  place RX10_TEMP87 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP81,
                    RX10_TEMP83);
                
//#line 6980
final x10.
                  lang.
                  place RX10_TEMP89 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 6983
final boolean RX10_TEMP90 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP87,RX10_TEMP89))/* } */;
                
//#line 6985
if (RX10_TEMP90) {
                    
//#line 6988
java.
                      lang.
                      String RX10_TEMP88 =
                      "Bad place access for array Z";
                    
//#line 6990
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP88);
                }
                
//#line 6994
final int RX10_TEMP91 =
                  Program.
                    getRefArrayValue1int(
                    Z,
                    RX10_TEMP83);
                
//#line 6997
final int X10_TEMP76 =
                  RX10_TEMP91;
                
//#line 7000
final int X10_TEMP77 =
                  9;
                
//#line 7003
final int X10_TEMP79 =
                  X10_TEMP76 >>>
                  X10_TEMP77;
                
//#line 7006
final int X10_TEMP80 =
                  14;
                
//#line 7009
final int X10_TEMP81 =
                  0;
                
//#line 7012
int X10_TEMP83 =
                  X10_TEMP81 -
                  X10_TEMP80;
                
//#line 7015
int RX10_TEMP92 =
                  i.
                    f0;
                
//#line 7018
RX10_TEMP92 =
                  RX10_TEMP92 +
                    X10_TEMP83;
                
//#line 7021
final Point1 X10_TEMP85 =
                  new Point1(
                  RX10_TEMP92);
                
//#line 7024
final Dist1 RX10_TEMP93 =
                  Z.
                    distValue;
                
//#line 7027
final Region1 RX10_TEMP94 =
                  RX10_TEMP93.
                    dReg;
                
//#line 7030
final int RX10_TEMP95 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP94,
                    X10_TEMP85);
                
//#line 7033
final int RX10_TEMP96 =
                  0;
                
//#line 7036
final boolean RX10_TEMP97 =
                  RX10_TEMP95 <
                  RX10_TEMP96;
                
//#line 7038
if (RX10_TEMP97) {
                    
//#line 7041
java.
                      lang.
                      String RX10_TEMP98 =
                      "Array access index out of bounds";
                    
//#line 7043
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP98);
                }
                
//#line 7047
final x10.
                  lang.
                  place RX10_TEMP99 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP93,
                    RX10_TEMP95);
                
//#line 7050
final x10.
                  lang.
                  place RX10_TEMP101 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 7053
final boolean RX10_TEMP102 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP99,RX10_TEMP101))/* } */;
                
//#line 7055
if (RX10_TEMP102) {
                    
//#line 7058
java.
                      lang.
                      String RX10_TEMP100 =
                      "Bad place access for array Z";
                    
//#line 7060
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP100);
                }
                
//#line 7064
final int RX10_TEMP103 =
                  Program.
                    getRefArrayValue1int(
                    Z,
                    RX10_TEMP95);
                
//#line 7067
final int X10_TEMP86 =
                  RX10_TEMP103;
                
//#line 7070
final int X10_TEMP87 =
                  7;
                
//#line 7073
final int X10_TEMP89 =
                  X10_TEMP86 <<
                  X10_TEMP87;
                
//#line 7076
final int X10_TEMP91 =
                  X10_TEMP79 |
                  X10_TEMP89;
                
//#line 7079
final int X10_TEMP92 =
                  65535;
                
//#line 7082
final int X10_TEMP95 =
                  X10_TEMP91 &
                  X10_TEMP92;
                
//#line 7085
final int X10_TEMP96 =
                  X10_TEMP95;
                
//#line 7088
final Dist1 RX10_TEMP104 =
                  Z.
                    distValue;
                
//#line 7091
final Region1 RX10_TEMP105 =
                  RX10_TEMP104.
                    dReg;
                
//#line 7094
final int RX10_TEMP106 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP105,
                    i);
                
//#line 7097
final int RX10_TEMP107 =
                  0;
                
//#line 7100
final boolean RX10_TEMP108 =
                  RX10_TEMP106 <
                  RX10_TEMP107;
                
//#line 7102
if (RX10_TEMP108) {
                    
//#line 7105
java.
                      lang.
                      String RX10_TEMP109 =
                      "Array index out of bounds";
                    
//#line 7107
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP109);
                }
                
//#line 7111
final x10.
                  lang.
                  place RX10_TEMP110 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP104,
                    RX10_TEMP106);
                
//#line 7114
final x10.
                  lang.
                  place RX10_TEMP112 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 7117
final boolean RX10_TEMP113 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP110,RX10_TEMP112))/* } */;
                
//#line 7119
if (RX10_TEMP113) {
                    
//#line 7122
java.
                      lang.
                      String RX10_TEMP111 =
                      "Bad place access for array Z";
                    
//#line 7124
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP111);
                }
                
//#line 7127
Program.
                                setRefArrayValue1int(
                                Z,
                                RX10_TEMP106,
                                X10_TEMP96);
                
//#line 7128
continue;
            }
            
//#line 7131
final int X10_TEMP98 =
              15;
            
//#line 7134
final int X10_TEMP99 =
              0;
            
//#line 7137
int X10_TEMP101 =
              X10_TEMP99 -
              X10_TEMP98;
            
//#line 7140
int RX10_TEMP114 =
              i.
                f0;
            
//#line 7143
RX10_TEMP114 =
              RX10_TEMP114 +
                X10_TEMP101;
            
//#line 7146
final Point1 X10_TEMP103 =
              new Point1(
              RX10_TEMP114);
            
//#line 7149
final Dist1 RX10_TEMP115 =
              Z.
                distValue;
            
//#line 7152
final Region1 RX10_TEMP116 =
              RX10_TEMP115.
                dReg;
            
//#line 7155
final int RX10_TEMP117 =
              Program.
                searchPointInRegion1(
                RX10_TEMP116,
                X10_TEMP103);
            
//#line 7158
final int RX10_TEMP118 =
              0;
            
//#line 7161
final boolean RX10_TEMP119 =
              RX10_TEMP117 <
              RX10_TEMP118;
            
//#line 7163
if (RX10_TEMP119) {
                
//#line 7166
java.
                  lang.
                  String RX10_TEMP120 =
                  "Array access index out of bounds";
                
//#line 7168
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP120);
            }
            
//#line 7172
final x10.
              lang.
              place RX10_TEMP121 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP115,
                RX10_TEMP117);
            
//#line 7175
final x10.
              lang.
              place RX10_TEMP123 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 7178
final boolean RX10_TEMP124 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP121,RX10_TEMP123))/* } */;
            
//#line 7180
if (RX10_TEMP124) {
                
//#line 7183
java.
                  lang.
                  String RX10_TEMP122 =
                  "Bad place access for array Z";
                
//#line 7185
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP122);
            }
            
//#line 7189
final int RX10_TEMP125 =
              Program.
                getRefArrayValue1int(
                Z,
                RX10_TEMP117);
            
//#line 7192
final int X10_TEMP104 =
              RX10_TEMP125;
            
//#line 7195
final int X10_TEMP105 =
              9;
            
//#line 7198
final int X10_TEMP107 =
              X10_TEMP104 >>>
              X10_TEMP105;
            
//#line 7201
final int X10_TEMP108 =
              14;
            
//#line 7204
final int X10_TEMP109 =
              0;
            
//#line 7207
int X10_TEMP111 =
              X10_TEMP109 -
              X10_TEMP108;
            
//#line 7210
int RX10_TEMP126 =
              i.
                f0;
            
//#line 7213
RX10_TEMP126 =
              RX10_TEMP126 +
                X10_TEMP111;
            
//#line 7216
final Point1 X10_TEMP113 =
              new Point1(
              RX10_TEMP126);
            
//#line 7219
final Dist1 RX10_TEMP127 =
              Z.
                distValue;
            
//#line 7222
final Region1 RX10_TEMP128 =
              RX10_TEMP127.
                dReg;
            
//#line 7225
final int RX10_TEMP129 =
              Program.
                searchPointInRegion1(
                RX10_TEMP128,
                X10_TEMP113);
            
//#line 7228
final int RX10_TEMP130 =
              0;
            
//#line 7231
final boolean RX10_TEMP131 =
              RX10_TEMP129 <
              RX10_TEMP130;
            
//#line 7233
if (RX10_TEMP131) {
                
//#line 7236
java.
                  lang.
                  String RX10_TEMP132 =
                  "Array access index out of bounds";
                
//#line 7238
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP132);
            }
            
//#line 7242
final x10.
              lang.
              place RX10_TEMP133 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP127,
                RX10_TEMP129);
            
//#line 7245
final x10.
              lang.
              place RX10_TEMP135 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 7248
final boolean RX10_TEMP136 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP133,RX10_TEMP135))/* } */;
            
//#line 7250
if (RX10_TEMP136) {
                
//#line 7253
java.
                  lang.
                  String RX10_TEMP134 =
                  "Bad place access for array Z";
                
//#line 7255
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP134);
            }
            
//#line 7259
final int RX10_TEMP137 =
              Program.
                getRefArrayValue1int(
                Z,
                RX10_TEMP129);
            
//#line 7262
final int X10_TEMP114 =
              RX10_TEMP137;
            
//#line 7265
final int X10_TEMP115 =
              7;
            
//#line 7268
final int X10_TEMP117 =
              X10_TEMP114 <<
              X10_TEMP115;
            
//#line 7271
final int X10_TEMP119 =
              X10_TEMP107 |
              X10_TEMP117;
            
//#line 7274
final int X10_TEMP120 =
              65535;
            
//#line 7277
final int X10_TEMP123 =
              X10_TEMP119 &
              X10_TEMP120;
            
//#line 7280
final int X10_TEMP124 =
              X10_TEMP123;
            
//#line 7283
final Dist1 RX10_TEMP138 =
              Z.
                distValue;
            
//#line 7286
final Region1 RX10_TEMP139 =
              RX10_TEMP138.
                dReg;
            
//#line 7289
final int RX10_TEMP140 =
              Program.
                searchPointInRegion1(
                RX10_TEMP139,
                i);
            
//#line 7292
final int RX10_TEMP141 =
              0;
            
//#line 7295
final boolean RX10_TEMP142 =
              RX10_TEMP140 <
              RX10_TEMP141;
            
//#line 7297
if (RX10_TEMP142) {
                
//#line 7300
java.
                  lang.
                  String RX10_TEMP143 =
                  "Array index out of bounds";
                
//#line 7302
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP143);
            }
            
//#line 7306
final x10.
              lang.
              place RX10_TEMP144 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP138,
                RX10_TEMP140);
            
//#line 7309
final x10.
              lang.
              place RX10_TEMP146 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 7312
final boolean RX10_TEMP147 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP144,RX10_TEMP146))/* } */;
            
//#line 7314
if (RX10_TEMP147) {
                
//#line 7317
java.
                  lang.
                  String RX10_TEMP145 =
                  "Bad place access for array Z";
                
//#line 7319
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP145);
            }
            
//#line 7322
Program.
                            setRefArrayValue1int(
                            Z,
                            RX10_TEMP140,
                            X10_TEMP124);
        }
        
//#line 7325
final Region1 RX10_TEMP148 =
          rZ;
        
//#line 7328
final int RX10_TEMP163 =
          rZ.
            regSize;
        
//#line 7331
final int RX10_TEMP164 =
          1;
        
//#line 7334
final int RX10_TEMP165 =
          RX10_TEMP163 -
          RX10_TEMP164;
        
//#line 7337
final int RX10_TEMP162 =
          RX10_TEMP165 +
          1;
        
//#line 7340
final int[] RX10_TEMP166 =
          (int[])
            ((new int[RX10_TEMP162]));
        
//#line 7342
for (
//#line 7342
int RX10_TEMP149 =
                             0;
                           RX10_TEMP149 <
                             RX10_TEMP166.
                               length;
                           
//#line 7342
RX10_TEMP149++) {
            
//#line 7344
final int RX10_TEMP150 =
              RX10_TEMP149;
            
//#line 7347
final Point1 pt =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP148,
                RX10_TEMP150);
            
//#line 7350
final Dist1 RX10_TEMP151 =
              Z.
                distValue;
            
//#line 7353
final Region1 RX10_TEMP152 =
              RX10_TEMP151.
                dReg;
            
//#line 7356
final int RX10_TEMP153 =
              Program.
                searchPointInRegion1(
                RX10_TEMP152,
                pt);
            
//#line 7359
final int RX10_TEMP154 =
              0;
            
//#line 7362
final boolean RX10_TEMP155 =
              RX10_TEMP153 <
              RX10_TEMP154;
            
//#line 7364
if (RX10_TEMP155) {
                
//#line 7367
java.
                  lang.
                  String RX10_TEMP156 =
                  "Array access index out of bounds";
                
//#line 7369
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP156);
            }
            
//#line 7373
final x10.
              lang.
              place RX10_TEMP157 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP151,
                RX10_TEMP153);
            
//#line 7376
final x10.
              lang.
              place RX10_TEMP159 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 7379
final boolean RX10_TEMP160 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP157,RX10_TEMP159))/* } */;
            
//#line 7381
if (RX10_TEMP160) {
                
//#line 7384
java.
                  lang.
                  String RX10_TEMP158 =
                  "Bad place access for array Z";
                
//#line 7386
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP158);
            }
            
//#line 7390
final int RX10_TEMP161 =
              Program.
                getRefArrayValue1int(
                Z,
                RX10_TEMP153);
            
//#line 7393
final int X10_TEMP127 =
              RX10_TEMP161;
            
//#line 7395
RX10_TEMP166[RX10_TEMP149] =
              X10_TEMP127;
        }
        
//#line 7398
;
        
//#line 7401
final intValArray1 RX10_TEMP167 =
          new intValArray1(
          rZ,
          RX10_TEMP166);
        
//#line 7404
final intValArray1 X10_TEMP128 =
          RX10_TEMP167;
        
//#line 7406
return X10_TEMP128;
    }
    
    
//#line 7408
public void
                    IDEATest_calcDecryptKey(
                    final intValArray1 aZR) {
        
//#line 7411
int j =
          0;
        
//#line 7414
int k =
          0;
        
//#line 7417
int t1 =
          0;
        
//#line 7420
int t2 =
          0;
        
//#line 7423
int t3 =
          0;
        
//#line 7426
final int X10_TEMP8 =
          0;
        
//#line 7429
final int X10_TEMP9 =
          51;
        
//#line 7432
final Region1 rDK =
          Program.
            createNewRegion1R(
            X10_TEMP8,
            X10_TEMP9);
        
//#line 7435
final x10.
          lang.
          place X10_TEMP11 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 7438
final Dist1 dDK =
          Program.
            getPlaceDist1(
            rDK,
            X10_TEMP11);
        
//#line 7441
final Region1 RX10_TEMP0 =
          dDK.
            dReg;
        
//#line 7444
final int RX10_TEMP1 =
          0;
        
//#line 7447
final int RX10_TEMP2 =
          1;
        
//#line 7450
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 7453
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 7456
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 7459
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 7462
final intStub[] RX10_TEMP6 =
          new intStub[RX10_TEMP5];
        
//#line 7465
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 7467
for (
//#line 7467
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 7467
RX10_TEMP7++) {
                
//#line 7470
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 7473
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 7476
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 7479
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    dDK,
                    RX10_TEMP9);
                
//#line 7482
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 7485
final T8 utmp8 =
                  new T8(
                  RX10_TEMP12,
                  RX10_TEMP8,
                  RX10_TEMP7,
                  RX10_TEMP6);
                
//#line 7487
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 7489
IDEATest.this.
                                    thread8(
                                    utmp8);
                }
                		}
                	});/* } */
            }
        }
        	} catch (Throwable tmp10) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp10);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 7494
final intStub[] RX10_TEMP16 =
          (intStub[])
            ((new intStub[RX10_TEMP4]));
        
//#line 7496
for (
//#line 7496
int RX10_TEMP18 =
                             0;
                           RX10_TEMP18 <
                             RX10_TEMP16.
                               length;
                           
//#line 7496
RX10_TEMP18++) {
            
//#line 7498
final intStub RX10_TEMP17 =
              RX10_TEMP6[RX10_TEMP18];
            
//#line 7500
RX10_TEMP16[RX10_TEMP18] =
              RX10_TEMP17;
        }
        
//#line 7503
;
        
//#line 7506
final intRefArray1 RX10_TEMP19 =
          new intRefArray1(
          dDK,
          RX10_TEMP16);
        
//#line 7509
final intRefArray1 DK =
          RX10_TEMP19;
        
//#line 7512
final intValArray1 Z =
          aZR;
        
//#line 7515
final int X10_TEMP17 =
          0;
        
//#line 7518
final Point1 RX10_TEMP20 =
          new Point1(
          X10_TEMP17);
        
//#line 7521
final Region1 RX10_TEMP21 =
          Z.
            regionValue;
        
//#line 7524
final int RX10_TEMP22 =
          Program.
            searchPointInRegion1(
            RX10_TEMP21,
            RX10_TEMP20);
        
//#line 7527
final int RX10_TEMP23 =
          0;
        
//#line 7530
final boolean RX10_TEMP24 =
          RX10_TEMP22 <
          RX10_TEMP23;
        
//#line 7532
if (RX10_TEMP24) {
            
//#line 7535
java.
              lang.
              String RX10_TEMP25 =
              "Array access index out of bounds";
            
//#line 7537
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP25);
        }
        
//#line 7541
final int[] RX10_TEMP26 =
          (int[])
            ((Z.
                contents));
        
//#line 7544
final int X10_TEMP19 =
          RX10_TEMP26[RX10_TEMP22];
        
//#line 7547
final int X10_TEMP21 =
          this.
            IDEATest_inv(
            X10_TEMP19);
        
//#line 7550
t1 =
          X10_TEMP21;
        
//#line 7553
final int X10_TEMP23 =
          1;
        
//#line 7556
final Point1 RX10_TEMP27 =
          new Point1(
          X10_TEMP23);
        
//#line 7559
final Region1 RX10_TEMP28 =
          Z.
            regionValue;
        
//#line 7562
final int RX10_TEMP29 =
          Program.
            searchPointInRegion1(
            RX10_TEMP28,
            RX10_TEMP27);
        
//#line 7565
final int RX10_TEMP30 =
          0;
        
//#line 7568
final boolean RX10_TEMP31 =
          RX10_TEMP29 <
          RX10_TEMP30;
        
//#line 7570
if (RX10_TEMP31) {
            
//#line 7573
java.
              lang.
              String RX10_TEMP32 =
              "Array access index out of bounds";
            
//#line 7575
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP32);
        }
        
//#line 7579
final int[] RX10_TEMP33 =
          (int[])
            ((Z.
                contents));
        
//#line 7582
final int X10_TEMP24 =
          RX10_TEMP33[RX10_TEMP29];
        
//#line 7585
final int X10_TEMP25 =
          0;
        
//#line 7588
final int X10_TEMP26 =
          X10_TEMP25 -
          X10_TEMP24;
        
//#line 7591
final int X10_TEMP27 =
          65535;
        
//#line 7594
final int X10_TEMP29 =
          X10_TEMP26 &
          X10_TEMP27;
        
//#line 7597
t2 =
          X10_TEMP29;
        
//#line 7600
final int X10_TEMP31 =
          2;
        
//#line 7603
final Point1 RX10_TEMP34 =
          new Point1(
          X10_TEMP31);
        
//#line 7606
final Region1 RX10_TEMP35 =
          Z.
            regionValue;
        
//#line 7609
final int RX10_TEMP36 =
          Program.
            searchPointInRegion1(
            RX10_TEMP35,
            RX10_TEMP34);
        
//#line 7612
final int RX10_TEMP37 =
          0;
        
//#line 7615
final boolean RX10_TEMP38 =
          RX10_TEMP36 <
          RX10_TEMP37;
        
//#line 7617
if (RX10_TEMP38) {
            
//#line 7620
java.
              lang.
              String RX10_TEMP39 =
              "Array access index out of bounds";
            
//#line 7622
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP39);
        }
        
//#line 7626
final int[] RX10_TEMP40 =
          (int[])
            ((Z.
                contents));
        
//#line 7629
final int X10_TEMP32 =
          RX10_TEMP40[RX10_TEMP36];
        
//#line 7632
final int X10_TEMP33 =
          0;
        
//#line 7635
final int X10_TEMP34 =
          X10_TEMP33 -
          X10_TEMP32;
        
//#line 7638
final int X10_TEMP35 =
          65535;
        
//#line 7641
final int X10_TEMP37 =
          X10_TEMP34 &
          X10_TEMP35;
        
//#line 7644
t3 =
          X10_TEMP37;
        
//#line 7647
final int X10_TEMP39 =
          51;
        
//#line 7650
final int X10_TEMP42 =
          3;
        
//#line 7653
final Point1 RX10_TEMP41 =
          new Point1(
          X10_TEMP42);
        
//#line 7656
final Region1 RX10_TEMP42 =
          Z.
            regionValue;
        
//#line 7659
final int RX10_TEMP43 =
          Program.
            searchPointInRegion1(
            RX10_TEMP42,
            RX10_TEMP41);
        
//#line 7662
final int RX10_TEMP44 =
          0;
        
//#line 7665
final boolean RX10_TEMP45 =
          RX10_TEMP43 <
          RX10_TEMP44;
        
//#line 7667
if (RX10_TEMP45) {
            
//#line 7670
java.
              lang.
              String RX10_TEMP46 =
              "Array access index out of bounds";
            
//#line 7672
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP46);
        }
        
//#line 7676
final int[] RX10_TEMP47 =
          (int[])
            ((Z.
                contents));
        
//#line 7679
final int X10_TEMP44 =
          RX10_TEMP47[RX10_TEMP43];
        
//#line 7682
final int X10_TEMP47 =
          this.
            IDEATest_inv(
            X10_TEMP44);
        
//#line 7685
final int X10_TEMP48 =
          X10_TEMP47;
        
//#line 7688
final Point1 RX10_TEMP48 =
          new Point1(
          X10_TEMP39);
        
//#line 7691
final Dist1 RX10_TEMP49 =
          DK.
            distValue;
        
//#line 7694
final Region1 RX10_TEMP50 =
          RX10_TEMP49.
            dReg;
        
//#line 7697
final int RX10_TEMP51 =
          Program.
            searchPointInRegion1(
            RX10_TEMP50,
            RX10_TEMP48);
        
//#line 7700
final int RX10_TEMP52 =
          0;
        
//#line 7703
final boolean RX10_TEMP53 =
          RX10_TEMP51 <
          RX10_TEMP52;
        
//#line 7705
if (RX10_TEMP53) {
            
//#line 7708
java.
              lang.
              String RX10_TEMP54 =
              "Array index out of bounds";
            
//#line 7710
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP54);
        }
        
//#line 7714
final x10.
          lang.
          place RX10_TEMP55 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP49,
            RX10_TEMP51);
        
//#line 7717
final x10.
          lang.
          place RX10_TEMP57 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 7720
final boolean RX10_TEMP58 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP55,RX10_TEMP57))/* } */;
        
//#line 7722
if (RX10_TEMP58) {
            
//#line 7725
java.
              lang.
              String RX10_TEMP56 =
              "Bad place access for array DK";
            
//#line 7727
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP56);
        }
        
//#line 7730
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP51,
                        X10_TEMP48);
        
//#line 7732
final int X10_TEMP50 =
          50;
        
//#line 7735
final int X10_TEMP53 =
          t3;
        
//#line 7738
final Point1 RX10_TEMP59 =
          new Point1(
          X10_TEMP50);
        
//#line 7741
final Dist1 RX10_TEMP60 =
          DK.
            distValue;
        
//#line 7744
final Region1 RX10_TEMP61 =
          RX10_TEMP60.
            dReg;
        
//#line 7747
final int RX10_TEMP62 =
          Program.
            searchPointInRegion1(
            RX10_TEMP61,
            RX10_TEMP59);
        
//#line 7750
final int RX10_TEMP63 =
          0;
        
//#line 7753
final boolean RX10_TEMP64 =
          RX10_TEMP62 <
          RX10_TEMP63;
        
//#line 7755
if (RX10_TEMP64) {
            
//#line 7758
java.
              lang.
              String RX10_TEMP65 =
              "Array index out of bounds";
            
//#line 7760
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP65);
        }
        
//#line 7764
final x10.
          lang.
          place RX10_TEMP66 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP60,
            RX10_TEMP62);
        
//#line 7767
final x10.
          lang.
          place RX10_TEMP68 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 7770
final boolean RX10_TEMP69 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP66,RX10_TEMP68))/* } */;
        
//#line 7772
if (RX10_TEMP69) {
            
//#line 7775
java.
              lang.
              String RX10_TEMP67 =
              "Bad place access for array DK";
            
//#line 7777
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP67);
        }
        
//#line 7780
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP62,
                        X10_TEMP53);
        
//#line 7782
final int X10_TEMP55 =
          49;
        
//#line 7785
final int X10_TEMP58 =
          t2;
        
//#line 7788
final Point1 RX10_TEMP70 =
          new Point1(
          X10_TEMP55);
        
//#line 7791
final Dist1 RX10_TEMP71 =
          DK.
            distValue;
        
//#line 7794
final Region1 RX10_TEMP72 =
          RX10_TEMP71.
            dReg;
        
//#line 7797
final int RX10_TEMP73 =
          Program.
            searchPointInRegion1(
            RX10_TEMP72,
            RX10_TEMP70);
        
//#line 7800
final int RX10_TEMP74 =
          0;
        
//#line 7803
final boolean RX10_TEMP75 =
          RX10_TEMP73 <
          RX10_TEMP74;
        
//#line 7805
if (RX10_TEMP75) {
            
//#line 7808
java.
              lang.
              String RX10_TEMP76 =
              "Array index out of bounds";
            
//#line 7810
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP76);
        }
        
//#line 7814
final x10.
          lang.
          place RX10_TEMP77 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP71,
            RX10_TEMP73);
        
//#line 7817
final x10.
          lang.
          place RX10_TEMP79 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 7820
final boolean RX10_TEMP80 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP77,RX10_TEMP79))/* } */;
        
//#line 7822
if (RX10_TEMP80) {
            
//#line 7825
java.
              lang.
              String RX10_TEMP78 =
              "Bad place access for array DK";
            
//#line 7827
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP78);
        }
        
//#line 7830
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP73,
                        X10_TEMP58);
        
//#line 7832
final int X10_TEMP60 =
          48;
        
//#line 7835
final int X10_TEMP63 =
          t1;
        
//#line 7838
final Point1 RX10_TEMP81 =
          new Point1(
          X10_TEMP60);
        
//#line 7841
final Dist1 RX10_TEMP82 =
          DK.
            distValue;
        
//#line 7844
final Region1 RX10_TEMP83 =
          RX10_TEMP82.
            dReg;
        
//#line 7847
final int RX10_TEMP84 =
          Program.
            searchPointInRegion1(
            RX10_TEMP83,
            RX10_TEMP81);
        
//#line 7850
final int RX10_TEMP85 =
          0;
        
//#line 7853
final boolean RX10_TEMP86 =
          RX10_TEMP84 <
          RX10_TEMP85;
        
//#line 7855
if (RX10_TEMP86) {
            
//#line 7858
java.
              lang.
              String RX10_TEMP87 =
              "Array index out of bounds";
            
//#line 7860
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP87);
        }
        
//#line 7864
final x10.
          lang.
          place RX10_TEMP88 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP82,
            RX10_TEMP84);
        
//#line 7867
final x10.
          lang.
          place RX10_TEMP90 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 7870
final boolean RX10_TEMP91 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP88,RX10_TEMP90))/* } */;
        
//#line 7872
if (RX10_TEMP91) {
            
//#line 7875
java.
              lang.
              String RX10_TEMP89 =
              "Bad place access for array DK";
            
//#line 7877
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP89);
        }
        
//#line 7880
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP84,
                        X10_TEMP63);
        
//#line 7882
final int X10_TEMP65 =
          47;
        
//#line 7885
j =
          X10_TEMP65;
        
//#line 7888
final int X10_TEMP67 =
          4;
        
//#line 7891
k =
          X10_TEMP67;
        
//#line 7894
final int X10_TEMP70 =
          0;
        
//#line 7897
final int X10_TEMP71 =
          6;
        
//#line 7900
final Region1 X10_TEMP73 =
          Program.
            createNewRegion1R(
            X10_TEMP70,
            X10_TEMP71);
        
//#line 7903
final int RX10_TEMP95 =
          1;
        
//#line 7906
int RX10_TEMP93 =
          X10_TEMP73.
            regSize;
        
//#line 7909
RX10_TEMP93 =
          RX10_TEMP93 -
            RX10_TEMP95;
        
//#line 7912
final int RX10_TEMP94 =
          RX10_TEMP93 +
          1;
        
//#line 7914
for (
//#line 7914
int RX10_TEMP92 =
                             0;
                           RX10_TEMP92 <
                             RX10_TEMP94;
                           
//#line 7914
RX10_TEMP92++) {
            
//#line 7917
final int RX10_TEMP96 =
              RX10_TEMP92;
            
//#line 7920
final Point1 i =
              Program.
                regionOrdinalPoint1(
                X10_TEMP73,
                RX10_TEMP96);
            
//#line 7923
final int X10_TEMP74 =
              k;
            
//#line 7926
final int X10_TEMP75 =
              1;
            
//#line 7929
k =
              k +
                X10_TEMP75;
            
//#line 7932
final Point1 RX10_TEMP97 =
              new Point1(
              X10_TEMP74);
            
//#line 7935
final Region1 RX10_TEMP98 =
              Z.
                regionValue;
            
//#line 7938
final int RX10_TEMP99 =
              Program.
                searchPointInRegion1(
                RX10_TEMP98,
                RX10_TEMP97);
            
//#line 7941
final int RX10_TEMP100 =
              0;
            
//#line 7944
final boolean RX10_TEMP101 =
              RX10_TEMP99 <
              RX10_TEMP100;
            
//#line 7946
if (RX10_TEMP101) {
                
//#line 7949
java.
                  lang.
                  String RX10_TEMP102 =
                  "Array access index out of bounds";
                
//#line 7951
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP102);
            }
            
//#line 7955
final int[] RX10_TEMP103 =
              (int[])
                ((Z.
                    contents));
            
//#line 7958
final int X10_TEMP78 =
              RX10_TEMP103[RX10_TEMP99];
            
//#line 7961
t1 =
              X10_TEMP78;
            
//#line 7964
final int X10_TEMP79 =
              j;
            
//#line 7967
final int X10_TEMP80 =
              1;
            
//#line 7970
j =
              j -
                X10_TEMP80;
            
//#line 7973
final int X10_TEMP82 =
              k;
            
//#line 7976
final int X10_TEMP83 =
              1;
            
//#line 7979
k =
              k +
                X10_TEMP83;
            
//#line 7982
final Point1 RX10_TEMP104 =
              new Point1(
              X10_TEMP82);
            
//#line 7985
final Region1 RX10_TEMP105 =
              Z.
                regionValue;
            
//#line 7988
final int RX10_TEMP106 =
              Program.
                searchPointInRegion1(
                RX10_TEMP105,
                RX10_TEMP104);
            
//#line 7991
final int RX10_TEMP107 =
              0;
            
//#line 7994
final boolean RX10_TEMP108 =
              RX10_TEMP106 <
              RX10_TEMP107;
            
//#line 7996
if (RX10_TEMP108) {
                
//#line 7999
java.
                  lang.
                  String RX10_TEMP109 =
                  "Array access index out of bounds";
                
//#line 8001
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP109);
            }
            
//#line 8005
final int[] RX10_TEMP110 =
              (int[])
                ((Z.
                    contents));
            
//#line 8008
final int X10_TEMP87 =
              RX10_TEMP110[RX10_TEMP106];
            
//#line 8011
final int X10_TEMP88 =
              X10_TEMP87;
            
//#line 8014
final Point1 RX10_TEMP111 =
              new Point1(
              X10_TEMP79);
            
//#line 8017
final Dist1 RX10_TEMP112 =
              DK.
                distValue;
            
//#line 8020
final Region1 RX10_TEMP113 =
              RX10_TEMP112.
                dReg;
            
//#line 8023
final int RX10_TEMP114 =
              Program.
                searchPointInRegion1(
                RX10_TEMP113,
                RX10_TEMP111);
            
//#line 8026
final int RX10_TEMP115 =
              0;
            
//#line 8029
final boolean RX10_TEMP116 =
              RX10_TEMP114 <
              RX10_TEMP115;
            
//#line 8031
if (RX10_TEMP116) {
                
//#line 8034
java.
                  lang.
                  String RX10_TEMP117 =
                  "Array index out of bounds";
                
//#line 8036
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP117);
            }
            
//#line 8040
final x10.
              lang.
              place RX10_TEMP118 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP112,
                RX10_TEMP114);
            
//#line 8043
final x10.
              lang.
              place RX10_TEMP120 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8046
final boolean RX10_TEMP121 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP118,RX10_TEMP120))/* } */;
            
//#line 8048
if (RX10_TEMP121) {
                
//#line 8051
java.
                  lang.
                  String RX10_TEMP119 =
                  "Bad place access for array DK";
                
//#line 8053
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP119);
            }
            
//#line 8056
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP114,
                            X10_TEMP88);
            
//#line 8058
final int X10_TEMP89 =
              j;
            
//#line 8061
final int X10_TEMP90 =
              1;
            
//#line 8064
j =
              j -
                X10_TEMP90;
            
//#line 8067
final int X10_TEMP94 =
              t1;
            
//#line 8070
final Point1 RX10_TEMP122 =
              new Point1(
              X10_TEMP89);
            
//#line 8073
final Dist1 RX10_TEMP123 =
              DK.
                distValue;
            
//#line 8076
final Region1 RX10_TEMP124 =
              RX10_TEMP123.
                dReg;
            
//#line 8079
final int RX10_TEMP125 =
              Program.
                searchPointInRegion1(
                RX10_TEMP124,
                RX10_TEMP122);
            
//#line 8082
final int RX10_TEMP126 =
              0;
            
//#line 8085
final boolean RX10_TEMP127 =
              RX10_TEMP125 <
              RX10_TEMP126;
            
//#line 8087
if (RX10_TEMP127) {
                
//#line 8090
java.
                  lang.
                  String RX10_TEMP128 =
                  "Array index out of bounds";
                
//#line 8092
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP128);
            }
            
//#line 8096
final x10.
              lang.
              place RX10_TEMP129 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP123,
                RX10_TEMP125);
            
//#line 8099
final x10.
              lang.
              place RX10_TEMP131 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8102
final boolean RX10_TEMP132 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP129,RX10_TEMP131))/* } */;
            
//#line 8104
if (RX10_TEMP132) {
                
//#line 8107
java.
                  lang.
                  String RX10_TEMP130 =
                  "Bad place access for array DK";
                
//#line 8109
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP130);
            }
            
//#line 8112
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP125,
                            X10_TEMP94);
            
//#line 8114
final int X10_TEMP96 =
              k;
            
//#line 8117
final int X10_TEMP97 =
              1;
            
//#line 8120
k =
              k +
                X10_TEMP97;
            
//#line 8123
final Point1 RX10_TEMP133 =
              new Point1(
              X10_TEMP96);
            
//#line 8126
final Region1 RX10_TEMP134 =
              Z.
                regionValue;
            
//#line 8129
final int RX10_TEMP135 =
              Program.
                searchPointInRegion1(
                RX10_TEMP134,
                RX10_TEMP133);
            
//#line 8132
final int RX10_TEMP136 =
              0;
            
//#line 8135
final boolean RX10_TEMP137 =
              RX10_TEMP135 <
              RX10_TEMP136;
            
//#line 8137
if (RX10_TEMP137) {
                
//#line 8140
java.
                  lang.
                  String RX10_TEMP138 =
                  "Array access index out of bounds";
                
//#line 8142
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP138);
            }
            
//#line 8146
final int[] RX10_TEMP139 =
              (int[])
                ((Z.
                    contents));
            
//#line 8149
final int X10_TEMP100 =
              RX10_TEMP139[RX10_TEMP135];
            
//#line 8152
final int X10_TEMP102 =
              this.
                IDEATest_inv(
                X10_TEMP100);
            
//#line 8155
t1 =
              X10_TEMP102;
            
//#line 8158
final int X10_TEMP103 =
              k;
            
//#line 8161
final int X10_TEMP104 =
              1;
            
//#line 8164
k =
              k +
                X10_TEMP104;
            
//#line 8167
final Point1 RX10_TEMP140 =
              new Point1(
              X10_TEMP103);
            
//#line 8170
final Region1 RX10_TEMP141 =
              Z.
                regionValue;
            
//#line 8173
final int RX10_TEMP142 =
              Program.
                searchPointInRegion1(
                RX10_TEMP141,
                RX10_TEMP140);
            
//#line 8176
final int RX10_TEMP143 =
              0;
            
//#line 8179
final boolean RX10_TEMP144 =
              RX10_TEMP142 <
              RX10_TEMP143;
            
//#line 8181
if (RX10_TEMP144) {
                
//#line 8184
java.
                  lang.
                  String RX10_TEMP145 =
                  "Array access index out of bounds";
                
//#line 8186
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP145);
            }
            
//#line 8190
final int[] RX10_TEMP146 =
              (int[])
                ((Z.
                    contents));
            
//#line 8193
final int X10_TEMP106 =
              RX10_TEMP146[RX10_TEMP142];
            
//#line 8196
final int X10_TEMP107 =
              0;
            
//#line 8199
final int X10_TEMP108 =
              X10_TEMP107 -
              X10_TEMP106;
            
//#line 8202
final int X10_TEMP109 =
              65535;
            
//#line 8205
final int X10_TEMP111 =
              X10_TEMP108 &
              X10_TEMP109;
            
//#line 8208
t2 =
              X10_TEMP111;
            
//#line 8211
final int X10_TEMP112 =
              k;
            
//#line 8214
final int X10_TEMP113 =
              1;
            
//#line 8217
k =
              k +
                X10_TEMP113;
            
//#line 8220
final Point1 RX10_TEMP147 =
              new Point1(
              X10_TEMP112);
            
//#line 8223
final Region1 RX10_TEMP148 =
              Z.
                regionValue;
            
//#line 8226
final int RX10_TEMP149 =
              Program.
                searchPointInRegion1(
                RX10_TEMP148,
                RX10_TEMP147);
            
//#line 8229
final int RX10_TEMP150 =
              0;
            
//#line 8232
final boolean RX10_TEMP151 =
              RX10_TEMP149 <
              RX10_TEMP150;
            
//#line 8234
if (RX10_TEMP151) {
                
//#line 8237
java.
                  lang.
                  String RX10_TEMP152 =
                  "Array access index out of bounds";
                
//#line 8239
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP152);
            }
            
//#line 8243
final int[] RX10_TEMP153 =
              (int[])
                ((Z.
                    contents));
            
//#line 8246
final int X10_TEMP115 =
              RX10_TEMP153[RX10_TEMP149];
            
//#line 8249
final int X10_TEMP116 =
              0;
            
//#line 8252
final int X10_TEMP117 =
              X10_TEMP116 -
              X10_TEMP115;
            
//#line 8255
final int X10_TEMP118 =
              65535;
            
//#line 8258
final int X10_TEMP120 =
              X10_TEMP117 &
              X10_TEMP118;
            
//#line 8261
t3 =
              X10_TEMP120;
            
//#line 8264
final int X10_TEMP121 =
              j;
            
//#line 8267
final int X10_TEMP122 =
              1;
            
//#line 8270
j =
              j -
                X10_TEMP122;
            
//#line 8273
final int X10_TEMP125 =
              k;
            
//#line 8276
final int X10_TEMP126 =
              1;
            
//#line 8279
k =
              k +
                X10_TEMP126;
            
//#line 8282
final Point1 RX10_TEMP154 =
              new Point1(
              X10_TEMP125);
            
//#line 8285
final Region1 RX10_TEMP155 =
              Z.
                regionValue;
            
//#line 8288
final int RX10_TEMP156 =
              Program.
                searchPointInRegion1(
                RX10_TEMP155,
                RX10_TEMP154);
            
//#line 8291
final int RX10_TEMP157 =
              0;
            
//#line 8294
final boolean RX10_TEMP158 =
              RX10_TEMP156 <
              RX10_TEMP157;
            
//#line 8296
if (RX10_TEMP158) {
                
//#line 8299
java.
                  lang.
                  String RX10_TEMP159 =
                  "Array access index out of bounds";
                
//#line 8301
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP159);
            }
            
//#line 8305
final int[] RX10_TEMP160 =
              (int[])
                ((Z.
                    contents));
            
//#line 8308
final int X10_TEMP129 =
              RX10_TEMP160[RX10_TEMP156];
            
//#line 8311
final int X10_TEMP132 =
              this.
                IDEATest_inv(
                X10_TEMP129);
            
//#line 8314
final int X10_TEMP133 =
              X10_TEMP132;
            
//#line 8317
final Point1 RX10_TEMP161 =
              new Point1(
              X10_TEMP121);
            
//#line 8320
final Dist1 RX10_TEMP162 =
              DK.
                distValue;
            
//#line 8323
final Region1 RX10_TEMP163 =
              RX10_TEMP162.
                dReg;
            
//#line 8326
final int RX10_TEMP164 =
              Program.
                searchPointInRegion1(
                RX10_TEMP163,
                RX10_TEMP161);
            
//#line 8329
final int RX10_TEMP165 =
              0;
            
//#line 8332
final boolean RX10_TEMP166 =
              RX10_TEMP164 <
              RX10_TEMP165;
            
//#line 8334
if (RX10_TEMP166) {
                
//#line 8337
java.
                  lang.
                  String RX10_TEMP167 =
                  "Array index out of bounds";
                
//#line 8339
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP167);
            }
            
//#line 8343
final x10.
              lang.
              place RX10_TEMP168 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP162,
                RX10_TEMP164);
            
//#line 8346
final x10.
              lang.
              place RX10_TEMP170 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8349
final boolean RX10_TEMP171 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP168,RX10_TEMP170))/* } */;
            
//#line 8351
if (RX10_TEMP171) {
                
//#line 8354
java.
                  lang.
                  String RX10_TEMP169 =
                  "Bad place access for array DK";
                
//#line 8356
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP169);
            }
            
//#line 8359
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP164,
                            X10_TEMP133);
            
//#line 8361
final int X10_TEMP134 =
              j;
            
//#line 8364
final int X10_TEMP135 =
              1;
            
//#line 8367
j =
              j -
                X10_TEMP135;
            
//#line 8370
final int X10_TEMP139 =
              t2;
            
//#line 8373
final Point1 RX10_TEMP172 =
              new Point1(
              X10_TEMP134);
            
//#line 8376
final Dist1 RX10_TEMP173 =
              DK.
                distValue;
            
//#line 8379
final Region1 RX10_TEMP174 =
              RX10_TEMP173.
                dReg;
            
//#line 8382
final int RX10_TEMP175 =
              Program.
                searchPointInRegion1(
                RX10_TEMP174,
                RX10_TEMP172);
            
//#line 8385
final int RX10_TEMP176 =
              0;
            
//#line 8388
final boolean RX10_TEMP177 =
              RX10_TEMP175 <
              RX10_TEMP176;
            
//#line 8390
if (RX10_TEMP177) {
                
//#line 8393
java.
                  lang.
                  String RX10_TEMP178 =
                  "Array index out of bounds";
                
//#line 8395
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP178);
            }
            
//#line 8399
final x10.
              lang.
              place RX10_TEMP179 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP173,
                RX10_TEMP175);
            
//#line 8402
final x10.
              lang.
              place RX10_TEMP181 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8405
final boolean RX10_TEMP182 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP179,RX10_TEMP181))/* } */;
            
//#line 8407
if (RX10_TEMP182) {
                
//#line 8410
java.
                  lang.
                  String RX10_TEMP180 =
                  "Bad place access for array DK";
                
//#line 8412
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP180);
            }
            
//#line 8415
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP175,
                            X10_TEMP139);
            
//#line 8417
final int X10_TEMP140 =
              j;
            
//#line 8420
final int X10_TEMP141 =
              1;
            
//#line 8423
j =
              j -
                X10_TEMP141;
            
//#line 8426
final int X10_TEMP145 =
              t3;
            
//#line 8429
final Point1 RX10_TEMP183 =
              new Point1(
              X10_TEMP140);
            
//#line 8432
final Dist1 RX10_TEMP184 =
              DK.
                distValue;
            
//#line 8435
final Region1 RX10_TEMP185 =
              RX10_TEMP184.
                dReg;
            
//#line 8438
final int RX10_TEMP186 =
              Program.
                searchPointInRegion1(
                RX10_TEMP185,
                RX10_TEMP183);
            
//#line 8441
final int RX10_TEMP187 =
              0;
            
//#line 8444
final boolean RX10_TEMP188 =
              RX10_TEMP186 <
              RX10_TEMP187;
            
//#line 8446
if (RX10_TEMP188) {
                
//#line 8449
java.
                  lang.
                  String RX10_TEMP189 =
                  "Array index out of bounds";
                
//#line 8451
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP189);
            }
            
//#line 8455
final x10.
              lang.
              place RX10_TEMP190 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP184,
                RX10_TEMP186);
            
//#line 8458
final x10.
              lang.
              place RX10_TEMP192 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8461
final boolean RX10_TEMP193 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP190,RX10_TEMP192))/* } */;
            
//#line 8463
if (RX10_TEMP193) {
                
//#line 8466
java.
                  lang.
                  String RX10_TEMP191 =
                  "Bad place access for array DK";
                
//#line 8468
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP191);
            }
            
//#line 8471
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP186,
                            X10_TEMP145);
            
//#line 8473
final int X10_TEMP146 =
              j;
            
//#line 8476
final int X10_TEMP147 =
              1;
            
//#line 8479
j =
              j -
                X10_TEMP147;
            
//#line 8482
final int X10_TEMP151 =
              t1;
            
//#line 8485
final Point1 RX10_TEMP194 =
              new Point1(
              X10_TEMP146);
            
//#line 8488
final Dist1 RX10_TEMP195 =
              DK.
                distValue;
            
//#line 8491
final Region1 RX10_TEMP196 =
              RX10_TEMP195.
                dReg;
            
//#line 8494
final int RX10_TEMP197 =
              Program.
                searchPointInRegion1(
                RX10_TEMP196,
                RX10_TEMP194);
            
//#line 8497
final int RX10_TEMP198 =
              0;
            
//#line 8500
final boolean RX10_TEMP199 =
              RX10_TEMP197 <
              RX10_TEMP198;
            
//#line 8502
if (RX10_TEMP199) {
                
//#line 8505
java.
                  lang.
                  String RX10_TEMP200 =
                  "Array index out of bounds";
                
//#line 8507
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP200);
            }
            
//#line 8511
final x10.
              lang.
              place RX10_TEMP201 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP195,
                RX10_TEMP197);
            
//#line 8514
final x10.
              lang.
              place RX10_TEMP203 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 8517
final boolean RX10_TEMP204 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP201,RX10_TEMP203))/* } */;
            
//#line 8519
if (RX10_TEMP204) {
                
//#line 8522
java.
                  lang.
                  String RX10_TEMP202 =
                  "Bad place access for array DK";
                
//#line 8524
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP202);
            }
            
//#line 8527
Program.
                            setRefArrayValue1int(
                            DK,
                            RX10_TEMP197,
                            X10_TEMP151);
        }
        
//#line 8530
final int X10_TEMP152 =
          k;
        
//#line 8533
final int X10_TEMP153 =
          1;
        
//#line 8536
k =
          k +
            X10_TEMP153;
        
//#line 8539
final Point1 RX10_TEMP205 =
          new Point1(
          X10_TEMP152);
        
//#line 8542
final Region1 RX10_TEMP206 =
          Z.
            regionValue;
        
//#line 8545
final int RX10_TEMP207 =
          Program.
            searchPointInRegion1(
            RX10_TEMP206,
            RX10_TEMP205);
        
//#line 8548
final int RX10_TEMP208 =
          0;
        
//#line 8551
final boolean RX10_TEMP209 =
          RX10_TEMP207 <
          RX10_TEMP208;
        
//#line 8553
if (RX10_TEMP209) {
            
//#line 8556
java.
              lang.
              String RX10_TEMP210 =
              "Array access index out of bounds";
            
//#line 8558
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP210);
        }
        
//#line 8562
final int[] RX10_TEMP211 =
          (int[])
            ((Z.
                contents));
        
//#line 8565
final int X10_TEMP156 =
          RX10_TEMP211[RX10_TEMP207];
        
//#line 8568
t1 =
          X10_TEMP156;
        
//#line 8571
final int X10_TEMP157 =
          j;
        
//#line 8574
final int X10_TEMP158 =
          1;
        
//#line 8577
j =
          j -
            X10_TEMP158;
        
//#line 8580
final int X10_TEMP160 =
          k;
        
//#line 8583
final int X10_TEMP161 =
          1;
        
//#line 8586
k =
          k +
            X10_TEMP161;
        
//#line 8589
final Point1 RX10_TEMP212 =
          new Point1(
          X10_TEMP160);
        
//#line 8592
final Region1 RX10_TEMP213 =
          Z.
            regionValue;
        
//#line 8595
final int RX10_TEMP214 =
          Program.
            searchPointInRegion1(
            RX10_TEMP213,
            RX10_TEMP212);
        
//#line 8598
final int RX10_TEMP215 =
          0;
        
//#line 8601
final boolean RX10_TEMP216 =
          RX10_TEMP214 <
          RX10_TEMP215;
        
//#line 8603
if (RX10_TEMP216) {
            
//#line 8606
java.
              lang.
              String RX10_TEMP217 =
              "Array access index out of bounds";
            
//#line 8608
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP217);
        }
        
//#line 8612
final int[] RX10_TEMP218 =
          (int[])
            ((Z.
                contents));
        
//#line 8615
final int X10_TEMP165 =
          RX10_TEMP218[RX10_TEMP214];
        
//#line 8618
final int X10_TEMP166 =
          X10_TEMP165;
        
//#line 8621
final Point1 RX10_TEMP219 =
          new Point1(
          X10_TEMP157);
        
//#line 8624
final Dist1 RX10_TEMP220 =
          DK.
            distValue;
        
//#line 8627
final Region1 RX10_TEMP221 =
          RX10_TEMP220.
            dReg;
        
//#line 8630
final int RX10_TEMP222 =
          Program.
            searchPointInRegion1(
            RX10_TEMP221,
            RX10_TEMP219);
        
//#line 8633
final int RX10_TEMP223 =
          0;
        
//#line 8636
final boolean RX10_TEMP224 =
          RX10_TEMP222 <
          RX10_TEMP223;
        
//#line 8638
if (RX10_TEMP224) {
            
//#line 8641
java.
              lang.
              String RX10_TEMP225 =
              "Array index out of bounds";
            
//#line 8643
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP225);
        }
        
//#line 8647
final x10.
          lang.
          place RX10_TEMP226 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP220,
            RX10_TEMP222);
        
//#line 8650
final x10.
          lang.
          place RX10_TEMP228 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 8653
final boolean RX10_TEMP229 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP226,RX10_TEMP228))/* } */;
        
//#line 8655
if (RX10_TEMP229) {
            
//#line 8658
java.
              lang.
              String RX10_TEMP227 =
              "Bad place access for array DK";
            
//#line 8660
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP227);
        }
        
//#line 8663
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP222,
                        X10_TEMP166);
        
//#line 8665
final int X10_TEMP167 =
          j;
        
//#line 8668
final int X10_TEMP168 =
          1;
        
//#line 8671
j =
          j -
            X10_TEMP168;
        
//#line 8674
final int X10_TEMP172 =
          t1;
        
//#line 8677
final Point1 RX10_TEMP230 =
          new Point1(
          X10_TEMP167);
        
//#line 8680
final Dist1 RX10_TEMP231 =
          DK.
            distValue;
        
//#line 8683
final Region1 RX10_TEMP232 =
          RX10_TEMP231.
            dReg;
        
//#line 8686
final int RX10_TEMP233 =
          Program.
            searchPointInRegion1(
            RX10_TEMP232,
            RX10_TEMP230);
        
//#line 8689
final int RX10_TEMP234 =
          0;
        
//#line 8692
final boolean RX10_TEMP235 =
          RX10_TEMP233 <
          RX10_TEMP234;
        
//#line 8694
if (RX10_TEMP235) {
            
//#line 8697
java.
              lang.
              String RX10_TEMP236 =
              "Array index out of bounds";
            
//#line 8699
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP236);
        }
        
//#line 8703
final x10.
          lang.
          place RX10_TEMP237 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP231,
            RX10_TEMP233);
        
//#line 8706
final x10.
          lang.
          place RX10_TEMP239 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 8709
final boolean RX10_TEMP240 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP237,RX10_TEMP239))/* } */;
        
//#line 8711
if (RX10_TEMP240) {
            
//#line 8714
java.
              lang.
              String RX10_TEMP238 =
              "Bad place access for array DK";
            
//#line 8716
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP238);
        }
        
//#line 8719
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP233,
                        X10_TEMP172);
        
//#line 8721
final int X10_TEMP174 =
          k;
        
//#line 8724
final int X10_TEMP175 =
          1;
        
//#line 8727
k =
          k +
            X10_TEMP175;
        
//#line 8730
final Point1 RX10_TEMP241 =
          new Point1(
          X10_TEMP174);
        
//#line 8733
final Region1 RX10_TEMP242 =
          Z.
            regionValue;
        
//#line 8736
final int RX10_TEMP243 =
          Program.
            searchPointInRegion1(
            RX10_TEMP242,
            RX10_TEMP241);
        
//#line 8739
final int RX10_TEMP244 =
          0;
        
//#line 8742
final boolean RX10_TEMP245 =
          RX10_TEMP243 <
          RX10_TEMP244;
        
//#line 8744
if (RX10_TEMP245) {
            
//#line 8747
java.
              lang.
              String RX10_TEMP246 =
              "Array access index out of bounds";
            
//#line 8749
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP246);
        }
        
//#line 8753
final int[] RX10_TEMP247 =
          (int[])
            ((Z.
                contents));
        
//#line 8756
final int X10_TEMP178 =
          RX10_TEMP247[RX10_TEMP243];
        
//#line 8759
final int X10_TEMP180 =
          this.
            IDEATest_inv(
            X10_TEMP178);
        
//#line 8762
t1 =
          X10_TEMP180;
        
//#line 8765
final int X10_TEMP181 =
          k;
        
//#line 8768
final int X10_TEMP182 =
          1;
        
//#line 8771
k =
          k +
            X10_TEMP182;
        
//#line 8774
final Point1 RX10_TEMP248 =
          new Point1(
          X10_TEMP181);
        
//#line 8777
final Region1 RX10_TEMP249 =
          Z.
            regionValue;
        
//#line 8780
final int RX10_TEMP250 =
          Program.
            searchPointInRegion1(
            RX10_TEMP249,
            RX10_TEMP248);
        
//#line 8783
final int RX10_TEMP251 =
          0;
        
//#line 8786
final boolean RX10_TEMP252 =
          RX10_TEMP250 <
          RX10_TEMP251;
        
//#line 8788
if (RX10_TEMP252) {
            
//#line 8791
java.
              lang.
              String RX10_TEMP253 =
              "Array access index out of bounds";
            
//#line 8793
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP253);
        }
        
//#line 8797
final int[] RX10_TEMP254 =
          (int[])
            ((Z.
                contents));
        
//#line 8800
final int X10_TEMP184 =
          RX10_TEMP254[RX10_TEMP250];
        
//#line 8803
final int X10_TEMP185 =
          0;
        
//#line 8806
final int X10_TEMP186 =
          X10_TEMP185 -
          X10_TEMP184;
        
//#line 8809
final int X10_TEMP187 =
          65535;
        
//#line 8812
final int X10_TEMP189 =
          X10_TEMP186 &
          X10_TEMP187;
        
//#line 8815
t2 =
          X10_TEMP189;
        
//#line 8818
final int X10_TEMP190 =
          k;
        
//#line 8821
final int X10_TEMP191 =
          1;
        
//#line 8824
k =
          k +
            X10_TEMP191;
        
//#line 8827
final Point1 RX10_TEMP255 =
          new Point1(
          X10_TEMP190);
        
//#line 8830
final Region1 RX10_TEMP256 =
          Z.
            regionValue;
        
//#line 8833
final int RX10_TEMP257 =
          Program.
            searchPointInRegion1(
            RX10_TEMP256,
            RX10_TEMP255);
        
//#line 8836
final int RX10_TEMP258 =
          0;
        
//#line 8839
final boolean RX10_TEMP259 =
          RX10_TEMP257 <
          RX10_TEMP258;
        
//#line 8841
if (RX10_TEMP259) {
            
//#line 8844
java.
              lang.
              String RX10_TEMP260 =
              "Array access index out of bounds";
            
//#line 8846
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP260);
        }
        
//#line 8850
final int[] RX10_TEMP261 =
          (int[])
            ((Z.
                contents));
        
//#line 8853
final int X10_TEMP193 =
          RX10_TEMP261[RX10_TEMP257];
        
//#line 8856
final int X10_TEMP194 =
          0;
        
//#line 8859
final int X10_TEMP195 =
          X10_TEMP194 -
          X10_TEMP193;
        
//#line 8862
final int X10_TEMP196 =
          65535;
        
//#line 8865
final int X10_TEMP198 =
          X10_TEMP195 &
          X10_TEMP196;
        
//#line 8868
t3 =
          X10_TEMP198;
        
//#line 8871
final int X10_TEMP199 =
          j;
        
//#line 8874
final int X10_TEMP200 =
          1;
        
//#line 8877
j =
          j -
            X10_TEMP200;
        
//#line 8880
final int X10_TEMP203 =
          k;
        
//#line 8883
final int X10_TEMP204 =
          1;
        
//#line 8886
k =
          k +
            X10_TEMP204;
        
//#line 8889
final Point1 RX10_TEMP262 =
          new Point1(
          X10_TEMP203);
        
//#line 8892
final Region1 RX10_TEMP263 =
          Z.
            regionValue;
        
//#line 8895
final int RX10_TEMP264 =
          Program.
            searchPointInRegion1(
            RX10_TEMP263,
            RX10_TEMP262);
        
//#line 8898
final int RX10_TEMP265 =
          0;
        
//#line 8901
final boolean RX10_TEMP266 =
          RX10_TEMP264 <
          RX10_TEMP265;
        
//#line 8903
if (RX10_TEMP266) {
            
//#line 8906
java.
              lang.
              String RX10_TEMP267 =
              "Array access index out of bounds";
            
//#line 8908
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP267);
        }
        
//#line 8912
final int[] RX10_TEMP268 =
          (int[])
            ((Z.
                contents));
        
//#line 8915
final int X10_TEMP207 =
          RX10_TEMP268[RX10_TEMP264];
        
//#line 8918
final int X10_TEMP210 =
          this.
            IDEATest_inv(
            X10_TEMP207);
        
//#line 8921
final int X10_TEMP211 =
          X10_TEMP210;
        
//#line 8924
final Point1 RX10_TEMP269 =
          new Point1(
          X10_TEMP199);
        
//#line 8927
final Dist1 RX10_TEMP270 =
          DK.
            distValue;
        
//#line 8930
final Region1 RX10_TEMP271 =
          RX10_TEMP270.
            dReg;
        
//#line 8933
final int RX10_TEMP272 =
          Program.
            searchPointInRegion1(
            RX10_TEMP271,
            RX10_TEMP269);
        
//#line 8936
final int RX10_TEMP273 =
          0;
        
//#line 8939
final boolean RX10_TEMP274 =
          RX10_TEMP272 <
          RX10_TEMP273;
        
//#line 8941
if (RX10_TEMP274) {
            
//#line 8944
java.
              lang.
              String RX10_TEMP275 =
              "Array index out of bounds";
            
//#line 8946
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP275);
        }
        
//#line 8950
final x10.
          lang.
          place RX10_TEMP276 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP270,
            RX10_TEMP272);
        
//#line 8953
final x10.
          lang.
          place RX10_TEMP278 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 8956
final boolean RX10_TEMP279 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP276,RX10_TEMP278))/* } */;
        
//#line 8958
if (RX10_TEMP279) {
            
//#line 8961
java.
              lang.
              String RX10_TEMP277 =
              "Bad place access for array DK";
            
//#line 8963
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP277);
        }
        
//#line 8966
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP272,
                        X10_TEMP211);
        
//#line 8968
final int X10_TEMP212 =
          j;
        
//#line 8971
final int X10_TEMP213 =
          1;
        
//#line 8974
j =
          j -
            X10_TEMP213;
        
//#line 8977
final int X10_TEMP217 =
          t3;
        
//#line 8980
final Point1 RX10_TEMP280 =
          new Point1(
          X10_TEMP212);
        
//#line 8983
final Dist1 RX10_TEMP281 =
          DK.
            distValue;
        
//#line 8986
final Region1 RX10_TEMP282 =
          RX10_TEMP281.
            dReg;
        
//#line 8989
final int RX10_TEMP283 =
          Program.
            searchPointInRegion1(
            RX10_TEMP282,
            RX10_TEMP280);
        
//#line 8992
final int RX10_TEMP284 =
          0;
        
//#line 8995
final boolean RX10_TEMP285 =
          RX10_TEMP283 <
          RX10_TEMP284;
        
//#line 8997
if (RX10_TEMP285) {
            
//#line 9000
java.
              lang.
              String RX10_TEMP286 =
              "Array index out of bounds";
            
//#line 9002
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP286);
        }
        
//#line 9006
final x10.
          lang.
          place RX10_TEMP287 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP281,
            RX10_TEMP283);
        
//#line 9009
final x10.
          lang.
          place RX10_TEMP289 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 9012
final boolean RX10_TEMP290 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP287,RX10_TEMP289))/* } */;
        
//#line 9014
if (RX10_TEMP290) {
            
//#line 9017
java.
              lang.
              String RX10_TEMP288 =
              "Bad place access for array DK";
            
//#line 9019
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP288);
        }
        
//#line 9022
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP283,
                        X10_TEMP217);
        
//#line 9024
final int X10_TEMP218 =
          j;
        
//#line 9027
final int X10_TEMP219 =
          1;
        
//#line 9030
j =
          j -
            X10_TEMP219;
        
//#line 9033
final int X10_TEMP223 =
          t2;
        
//#line 9036
final Point1 RX10_TEMP291 =
          new Point1(
          X10_TEMP218);
        
//#line 9039
final Dist1 RX10_TEMP292 =
          DK.
            distValue;
        
//#line 9042
final Region1 RX10_TEMP293 =
          RX10_TEMP292.
            dReg;
        
//#line 9045
final int RX10_TEMP294 =
          Program.
            searchPointInRegion1(
            RX10_TEMP293,
            RX10_TEMP291);
        
//#line 9048
final int RX10_TEMP295 =
          0;
        
//#line 9051
final boolean RX10_TEMP296 =
          RX10_TEMP294 <
          RX10_TEMP295;
        
//#line 9053
if (RX10_TEMP296) {
            
//#line 9056
java.
              lang.
              String RX10_TEMP297 =
              "Array index out of bounds";
            
//#line 9058
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP297);
        }
        
//#line 9062
final x10.
          lang.
          place RX10_TEMP298 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP292,
            RX10_TEMP294);
        
//#line 9065
final x10.
          lang.
          place RX10_TEMP300 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 9068
final boolean RX10_TEMP301 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP298,RX10_TEMP300))/* } */;
        
//#line 9070
if (RX10_TEMP301) {
            
//#line 9073
java.
              lang.
              String RX10_TEMP299 =
              "Bad place access for array DK";
            
//#line 9075
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP299);
        }
        
//#line 9078
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP294,
                        X10_TEMP223);
        
//#line 9080
final int X10_TEMP224 =
          j;
        
//#line 9083
final int X10_TEMP225 =
          1;
        
//#line 9086
j =
          j -
            X10_TEMP225;
        
//#line 9089
final int X10_TEMP229 =
          t1;
        
//#line 9092
final Point1 RX10_TEMP302 =
          new Point1(
          X10_TEMP224);
        
//#line 9095
final Dist1 RX10_TEMP303 =
          DK.
            distValue;
        
//#line 9098
final Region1 RX10_TEMP304 =
          RX10_TEMP303.
            dReg;
        
//#line 9101
final int RX10_TEMP305 =
          Program.
            searchPointInRegion1(
            RX10_TEMP304,
            RX10_TEMP302);
        
//#line 9104
final int RX10_TEMP306 =
          0;
        
//#line 9107
final boolean RX10_TEMP307 =
          RX10_TEMP305 <
          RX10_TEMP306;
        
//#line 9109
if (RX10_TEMP307) {
            
//#line 9112
java.
              lang.
              String RX10_TEMP308 =
              "Array index out of bounds";
            
//#line 9114
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP308);
        }
        
//#line 9118
final x10.
          lang.
          place RX10_TEMP309 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP303,
            RX10_TEMP305);
        
//#line 9121
final x10.
          lang.
          place RX10_TEMP311 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 9124
final boolean RX10_TEMP312 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP309,RX10_TEMP311))/* } */;
        
//#line 9126
if (RX10_TEMP312) {
            
//#line 9129
java.
              lang.
              String RX10_TEMP310 =
              "Bad place access for array DK";
            
//#line 9131
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP310);
        }
        
//#line 9134
Program.
                        setRefArrayValue1int(
                        DK,
                        RX10_TEMP305,
                        X10_TEMP229);
        
//#line 9136
final Region1 RX10_TEMP313 =
          rDK;
        
//#line 9139
final int RX10_TEMP328 =
          rDK.
            regSize;
        
//#line 9142
final int RX10_TEMP329 =
          1;
        
//#line 9145
final int RX10_TEMP330 =
          RX10_TEMP328 -
          RX10_TEMP329;
        
//#line 9148
final int RX10_TEMP327 =
          RX10_TEMP330 +
          1;
        
//#line 9151
final int[] RX10_TEMP331 =
          (int[])
            ((new int[RX10_TEMP327]));
        
//#line 9153
for (
//#line 9153
int RX10_TEMP314 =
                             0;
                           RX10_TEMP314 <
                             RX10_TEMP331.
                               length;
                           
//#line 9153
RX10_TEMP314++) {
            
//#line 9155
final int RX10_TEMP315 =
              RX10_TEMP314;
            
//#line 9158
final Point1 i =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP313,
                RX10_TEMP315);
            
//#line 9161
final Dist1 RX10_TEMP316 =
              DK.
                distValue;
            
//#line 9164
final Region1 RX10_TEMP317 =
              RX10_TEMP316.
                dReg;
            
//#line 9167
final int RX10_TEMP318 =
              Program.
                searchPointInRegion1(
                RX10_TEMP317,
                i);
            
//#line 9170
final int RX10_TEMP319 =
              0;
            
//#line 9173
final boolean RX10_TEMP320 =
              RX10_TEMP318 <
              RX10_TEMP319;
            
//#line 9175
if (RX10_TEMP320) {
                
//#line 9178
java.
                  lang.
                  String RX10_TEMP321 =
                  "Array access index out of bounds";
                
//#line 9180
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP321);
            }
            
//#line 9184
final x10.
              lang.
              place RX10_TEMP322 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP316,
                RX10_TEMP318);
            
//#line 9187
final x10.
              lang.
              place RX10_TEMP324 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 9190
final boolean RX10_TEMP325 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP322,RX10_TEMP324))/* } */;
            
//#line 9192
if (RX10_TEMP325) {
                
//#line 9195
java.
                  lang.
                  String RX10_TEMP323 =
                  "Bad place access for array DK";
                
//#line 9197
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP323);
            }
            
//#line 9201
final int RX10_TEMP326 =
              Program.
                getRefArrayValue1int(
                DK,
                RX10_TEMP318);
            
//#line 9204
final int X10_TEMP232 =
              RX10_TEMP326;
            
//#line 9206
RX10_TEMP331[RX10_TEMP314] =
              X10_TEMP232;
        }
        
//#line 9209
;
        
//#line 9212
final intValArray1 RX10_TEMP332 =
          new intValArray1(
          rDK,
          RX10_TEMP331);
        
//#line 9215
final intValArray1 X10_TEMP233 =
          RX10_TEMP332;
        
//#line 9218
DKR =
          X10_TEMP233;
    }
    
    
//#line 9221
public int
                    IDEATest_inv(
                    final int ax) {
        
//#line 9224
int t0 =
          0;
        
//#line 9227
int t1 =
          0;
        
//#line 9230
int q =
          0;
        
//#line 9233
int y =
          0;
        
//#line 9236
int x =
          ax;
        
//#line 9239
final int X10_TEMP6 =
          1;
        
//#line 9242
final boolean X10_TEMP8 =
          x <=
          X10_TEMP6;
        
//#line 9244
if (X10_TEMP8) {
            
//#line 9247
final int X10_TEMP10 =
              x;
            
//#line 9249
return X10_TEMP10;
        }
        
//#line 9252
final int X10_TEMP12 =
          65537;
        
//#line 9255
final int X10_TEMP14 =
          X10_TEMP12 /
          x;
        
//#line 9258
t1 =
          X10_TEMP14;
        
//#line 9261
final int X10_TEMP15 =
          65537;
        
//#line 9264
final int X10_TEMP17 =
          X10_TEMP15 %
          x;
        
//#line 9267
y =
          X10_TEMP17;
        
//#line 9270
final int X10_TEMP18 =
          1;
        
//#line 9273
final boolean X10_TEMP20 =
          y ==
          X10_TEMP18;
        
//#line 9275
if (X10_TEMP20) {
            
//#line 9278
final int X10_TEMP21 =
              1;
            
//#line 9281
final int X10_TEMP23 =
              X10_TEMP21 -
              t1;
            
//#line 9284
final int X10_TEMP24 =
              65535;
            
//#line 9287
final int X10_TEMP26 =
              X10_TEMP23 &
              X10_TEMP24;
            
//#line 9289
return X10_TEMP26;
        }
        
//#line 9292
final int X10_TEMP29 =
          1;
        
//#line 9295
t0 =
          X10_TEMP29;
        
//#line 9298
boolean X10_TEMP30 =
          false;
        
//#line 9300
do  {
            
//#line 9302
final int X10_TEMP32 =
              x /
              y;
            
//#line 9305
q =
              X10_TEMP32;
            
//#line 9308
final int X10_TEMP34 =
              x %
              y;
            
//#line 9311
x =
              X10_TEMP34;
            
//#line 9314
final int X10_TEMP35 =
              q *
              t1;
            
//#line 9317
final int X10_TEMP37 =
              t0 +
              X10_TEMP35;
            
//#line 9320
t0 =
              X10_TEMP37;
            
//#line 9323
final int X10_TEMP38 =
              1;
            
//#line 9326
final boolean X10_TEMP40 =
              x ==
              X10_TEMP38;
            
//#line 9328
if (X10_TEMP40) {
                
//#line 9331
final int X10_TEMP42 =
                  t0;
                
//#line 9333
return X10_TEMP42;
            }
            
//#line 9336
final int X10_TEMP45 =
              y /
              x;
            
//#line 9339
q =
              X10_TEMP45;
            
//#line 9342
final int X10_TEMP47 =
              y %
              x;
            
//#line 9345
y =
              X10_TEMP47;
            
//#line 9348
final int X10_TEMP48 =
              q *
              t0;
            
//#line 9351
final int X10_TEMP50 =
              t1 +
              X10_TEMP48;
            
//#line 9354
t1 =
              X10_TEMP50;
            
//#line 9357
final int X10_TEMP51 =
              1;
            
//#line 9360
X10_TEMP30 =
              y !=
                X10_TEMP51;
        }while(X10_TEMP30); 
        
//#line 9365
final int X10_TEMP53 =
          1;
        
//#line 9368
final int X10_TEMP55 =
          X10_TEMP53 -
          t1;
        
//#line 9371
final int X10_TEMP56 =
          65535;
        
//#line 9374
final int X10_TEMP58 =
          X10_TEMP55 &
          X10_TEMP56;
        
//#line 9376
return X10_TEMP58;
    }
    
    
//#line 9378
public void
                    thread3(
                    final T3 utmpz) {
        
//#line 9381
final Point1[] RX10_TEMP13 =
          utmpz.
            RX10_TEMP13;
        
//#line 9384
final int RX10_TEMP12 =
          utmpz.
            RX10_TEMP12;
        
//#line 9387
final x10.
          lang.
          place RX10_TEMP8 =
          utmpz.
            RX10_TEMP8;
        
//#line 9390
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9393
final byteStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9397
final int RX10_TEMP15 =
              RX10_TEMP12 +
              1;
            
//#line 9400
final byte[] RX10_TEMP16 =
              new byte[RX10_TEMP15];
            
//#line 9402
for (
//#line 9402
int RX10_TEMP14 =
                                 0;
                               RX10_TEMP14 <
                                 RX10_TEMP16.
                                   length;
                               
//#line 9402
RX10_TEMP14++) {
                
//#line 9404
final Point1 p =
                  RX10_TEMP13[RX10_TEMP14];
                
//#line 9407
final int X10_TEMP13 =
                  p.
                    f0;
                
//#line 9410
final byte X10_TEMP15 =
                  (byte)
                    (byte)
                      X10_TEMP13;
                
//#line 9412
RX10_TEMP16[RX10_TEMP14] =
                  X10_TEMP15;
            }
            
//#line 9415
;
            
//#line 9418
final byteStub RX10_TEMP17 =
              new byteStub(
              RX10_TEMP16);
            
//#line 9421
final T12 utmp12 =
              new T12(
              RX10_TEMP17,
              RX10_TEMP7,
              RX10_TEMP6);
            
//#line 9423
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9425
IDEATest.this.
                                thread12(
                                utmp12);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9429
public void
                    thread4(
                    final T4 utmpz) {
        
//#line 9432
final int RX10_TEMP34 =
          utmpz.
            RX10_TEMP34;
        
//#line 9435
final x10.
          lang.
          place RX10_TEMP30 =
          utmpz.
            RX10_TEMP30;
        
//#line 9438
final int RX10_TEMP29 =
          utmpz.
            RX10_TEMP29;
        
//#line 9441
final byteStub[] RX10_TEMP28 =
          utmpz.
            RX10_TEMP28;
        {
            
//#line 9445
final int RX10_TEMP35 =
              RX10_TEMP34 +
              1;
            
//#line 9448
final byte[] RX10_TEMP36 =
              new byte[RX10_TEMP35];
            
//#line 9451
final byteStub RX10_TEMP37 =
              new byteStub(
              RX10_TEMP36);
            
//#line 9454
final T13 utmp13 =
              new T13(
              RX10_TEMP37,
              RX10_TEMP29,
              RX10_TEMP28);
            
//#line 9456
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP30)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9458
IDEATest.this.
                                thread13(
                                utmp13);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9462
public void
                    thread5(
                    final T5 utmpz) {
        
//#line 9465
final int RX10_TEMP54 =
          utmpz.
            RX10_TEMP54;
        
//#line 9468
final x10.
          lang.
          place RX10_TEMP50 =
          utmpz.
            RX10_TEMP50;
        
//#line 9471
final int RX10_TEMP49 =
          utmpz.
            RX10_TEMP49;
        
//#line 9474
final byteStub[] RX10_TEMP48 =
          utmpz.
            RX10_TEMP48;
        {
            
//#line 9478
final int RX10_TEMP55 =
              RX10_TEMP54 +
              1;
            
//#line 9481
final byte[] RX10_TEMP56 =
              new byte[RX10_TEMP55];
            
//#line 9484
final byteStub RX10_TEMP57 =
              new byteStub(
              RX10_TEMP56);
            
//#line 9487
final T14 utmp14 =
              new T14(
              RX10_TEMP57,
              RX10_TEMP49,
              RX10_TEMP48);
            
//#line 9489
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP50)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9491
IDEATest.this.
                                thread14(
                                utmp14);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9495
public void
                    thread6(
                    final T6 utmpz) {
        
//#line 9498
final int RX10_TEMP12 =
          utmpz.
            RX10_TEMP12;
        
//#line 9501
final x10.
          lang.
          place RX10_TEMP8 =
          utmpz.
            RX10_TEMP8;
        
//#line 9504
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9507
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9511
final int RX10_TEMP13 =
              RX10_TEMP12 +
              1;
            
//#line 9514
final int[] RX10_TEMP14 =
              new int[RX10_TEMP13];
            
//#line 9517
final intStub RX10_TEMP15 =
              new intStub(
              RX10_TEMP14);
            
//#line 9520
final T15 utmp15 =
              new T15(
              RX10_TEMP15,
              RX10_TEMP7,
              RX10_TEMP6);
            
//#line 9522
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9524
IDEATest.this.
                                thread15(
                                utmp15);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9528
public void
                    thread7(
                    final T7 utmpz) {
        
//#line 9531
final int RX10_TEMP12 =
          utmpz.
            RX10_TEMP12;
        
//#line 9534
final x10.
          lang.
          place RX10_TEMP8 =
          utmpz.
            RX10_TEMP8;
        
//#line 9537
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9540
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9544
final int RX10_TEMP13 =
              RX10_TEMP12 +
              1;
            
//#line 9547
final int[] RX10_TEMP14 =
              new int[RX10_TEMP13];
            
//#line 9550
final intStub RX10_TEMP15 =
              new intStub(
              RX10_TEMP14);
            
//#line 9553
final T16 utmp16 =
              new T16(
              RX10_TEMP15,
              RX10_TEMP7,
              RX10_TEMP6);
            
//#line 9555
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9557
IDEATest.this.
                                thread16(
                                utmp16);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9561
public void
                    thread8(
                    final T8 utmpz) {
        
//#line 9564
final int RX10_TEMP12 =
          utmpz.
            RX10_TEMP12;
        
//#line 9567
final x10.
          lang.
          place RX10_TEMP8 =
          utmpz.
            RX10_TEMP8;
        
//#line 9570
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9573
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9577
final int RX10_TEMP13 =
              RX10_TEMP12 +
              1;
            
//#line 9580
final int[] RX10_TEMP14 =
              new int[RX10_TEMP13];
            
//#line 9583
final intStub RX10_TEMP15 =
              new intStub(
              RX10_TEMP14);
            
//#line 9586
final T17 utmp17 =
              new T17(
              RX10_TEMP15,
              RX10_TEMP7,
              RX10_TEMP6);
            
//#line 9588
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 9590
IDEATest.this.
                                thread17(
                                utmp17);
            }
            		}
            	});/* } */
        }
    }
    
    
//#line 9594
public void
                    thread12(
                    final T12 utmpz) {
        
//#line 9597
final byteStub RX10_TEMP17 =
          utmpz.
            RX10_TEMP17;
        
//#line 9600
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9603
final byteStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9606
RX10_TEMP6[RX10_TEMP7] =
              RX10_TEMP17;
        }
    }
    
    
//#line 9609
public void
                    thread13(
                    final T13 utmpz) {
        
//#line 9612
final byteStub RX10_TEMP37 =
          utmpz.
            RX10_TEMP37;
        
//#line 9615
final int RX10_TEMP29 =
          utmpz.
            RX10_TEMP29;
        
//#line 9618
final byteStub[] RX10_TEMP28 =
          utmpz.
            RX10_TEMP28;
        {
            
//#line 9621
RX10_TEMP28[RX10_TEMP29] =
              RX10_TEMP37;
        }
    }
    
    
//#line 9624
public void
                    thread14(
                    final T14 utmpz) {
        
//#line 9627
final byteStub RX10_TEMP57 =
          utmpz.
            RX10_TEMP57;
        
//#line 9630
final int RX10_TEMP49 =
          utmpz.
            RX10_TEMP49;
        
//#line 9633
final byteStub[] RX10_TEMP48 =
          utmpz.
            RX10_TEMP48;
        {
            
//#line 9636
RX10_TEMP48[RX10_TEMP49] =
              RX10_TEMP57;
        }
    }
    
    
//#line 9639
public void
                    thread15(
                    final T15 utmpz) {
        
//#line 9642
final intStub RX10_TEMP15 =
          utmpz.
            RX10_TEMP15;
        
//#line 9645
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9648
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9651
RX10_TEMP6[RX10_TEMP7] =
              RX10_TEMP15;
        }
    }
    
    
//#line 9654
public void
                    thread16(
                    final T16 utmpz) {
        
//#line 9657
final intStub RX10_TEMP15 =
          utmpz.
            RX10_TEMP15;
        
//#line 9660
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9663
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9666
RX10_TEMP6[RX10_TEMP7] =
              RX10_TEMP15;
        }
    }
    
    
//#line 9669
public void
                    thread17(
                    final T17 utmpz) {
        
//#line 9672
final intStub RX10_TEMP15 =
          utmpz.
            RX10_TEMP15;
        
//#line 9675
final int RX10_TEMP7 =
          utmpz.
            RX10_TEMP7;
        
//#line 9678
final intStub[] RX10_TEMP6 =
          utmpz.
            RX10_TEMP6;
        {
            
//#line 9681
RX10_TEMP6[RX10_TEMP7] =
              RX10_TEMP15;
        }
    }
}

class intRefArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 9689
final public Dist1
      distValue;
    
//#line 9690
final public intStub[]
      contents;
    
    
//#line 9693
public intRefArray1(final Dist1 distValue_,
                                      final intStub[] contents_) {
        
//#line 9694
super();
        
//#line 9696
distValue =
          distValue_;
        
//#line 9699
contents =
          contents_;
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 9707
public long
      seed;
    
    
//#line 9710
public Random(final long rseed) {
        
//#line 9711
super();
        
//#line 9712
this.
                        Random_setSeed(
                        rseed);
    }
    
    
//#line 9716
public void
                    Random_setSeed(
                    final long rseed) {
        
//#line 9719
final long X10_TEMP1 =
          Program.
            _Random_multiplier;
        
//#line 9722
final long X10_TEMP3 =
          rseed ^
          X10_TEMP1;
        
//#line 9725
final long X10_TEMP4 =
          Program.
            _Random_mask;
        
//#line 9728
final long X10_TEMP6 =
          X10_TEMP3 &
          X10_TEMP4;
        
//#line 9731
seed =
          X10_TEMP6;
    }
}

class byteRefArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 9739
final public Dist1
      distValue;
    
//#line 9740
final public byteStub[]
      contents;
    
    
//#line 9743
public byteRefArray1(final Dist1 distValue_,
                                       final byteStub[] contents_) {
        
//#line 9744
super();
        
//#line 9746
distValue =
          distValue_;
        
//#line 9749
contents =
          contents_;
    }
}
