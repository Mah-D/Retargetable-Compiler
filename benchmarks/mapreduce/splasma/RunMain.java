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

class Program
extends x10.
  lang.
  Object
{
    
//#line 7
final public static Region1
      _MR_r =
      Program.
        _MR_r_init();
    
//#line 8
final public static int
      _Timer_max_counters =
      Program.
        _Timer_max_counters_init();
    
    
//#line 11
public static void
                  runMain(
                  ) {
        
//#line 12
Timer tmr =
          (new Timer(
             ));
        
//#line 13
int count =
          (0);
        
//#line 14
Program.
                      Timer_start(
                      tmr,
                      count);
        
//#line 15
final MR X10_TEMP4 =
          (new MR(
             ));
        
//#line 16
Program.
                      MR_run(
                      X10_TEMP4);
        
//#line 17
Program.
                      Timer_stop(
                      tmr,
                      count);
        
//#line 18
final java.
          lang.
          String X10_TEMP7 =
          ("Wall-clock time for mapreduce: ");
        
//#line 19
final double X10_TEMP8 =
          (Program.
             Timer_readTimer(
             tmr,
             count));
        
//#line 20
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 21
final java.
          lang.
          String X10_TEMP10 =
          (" secs");
        
//#line 22
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 23
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 26
public static Region1
                  _MR_r_init(
                  ) {
        
//#line 27
final int X10_TEMP3 =
          (0);
        
//#line 28
final int X10_TEMP4 =
          (300000);
        
//#line 29
final Region1 X10_TEMP6 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 30
return X10_TEMP6;
    }
    
    
//#line 33
public static void
                  MR_run(
                  final MR X10_TEMP0) {
        
//#line 34
Program.
                      MR_map(
                      X10_TEMP0);
        
//#line 35
Program.
                      MR_reduce(
                      X10_TEMP0);
        
//#line 36
final int X10_TEMP2 =
          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
        
//#line 37
final java.
          lang.
          String X10_TEMP4 =
          "";
        
//#line 38
final java.
          lang.
          String X10_TEMP3 =
          X10_TEMP4 +
        X10_TEMP2;
        
//#line 39
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP3);
    }
    
    
//#line 42
public static void
                  MR_map(
                  final MR X10_TEMP0) {
        
//#line 43
final intRefArray1 b =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a;
        
//#line 44
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 45
final Dist1 RX10_TEMP1 =
              b.
                distValue;
            
//#line 46
final Region1 RX10_TEMP2 =
              RX10_TEMP1.
                dReg;
            
//#line 47
final int RX10_TEMP5 =
              1;
            
//#line 48
int RX10_TEMP3 =
              RX10_TEMP2.
                regSize;
            
//#line 49
RX10_TEMP3 =
              RX10_TEMP3 -
                RX10_TEMP5;
            
//#line 51
final int RX10_TEMP4 =
              RX10_TEMP3 +
              1;
            
//#line 52
for (
//#line 52
int RX10_TEMP0 =
                               0;
                             RX10_TEMP0 <
                               RX10_TEMP4;
                             
//#line 52
RX10_TEMP0++) {
                
//#line 53
final int RX10_TEMP6 =
                  RX10_TEMP0;
                
//#line 54
final Point1 p =
                  Program.
                    regionOrdinalPoint1(
                    RX10_TEMP2,
                    RX10_TEMP6);
                
//#line 55
final Dist1 RX10_TEMP7 =
                  b.
                    distValue;
                
//#line 56
final Dist1 X10_TEMP3 =
                  RX10_TEMP7;
                
//#line 57
final Region1 RX10_TEMP8 =
                  X10_TEMP3.
                    dReg;
                
//#line 58
final int RX10_TEMP9 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP8,
                    p);
                
//#line 59
final int RX10_TEMP10 =
                  0;
                
//#line 60
final boolean RX10_TEMP11 =
                  RX10_TEMP9 <
                  RX10_TEMP10;
                
//#line 61
if (RX10_TEMP11) {
                    
//#line 62
final java.
                      lang.
                      String RX10_TEMP12 =
                      "Point p not found in the distribution X10_TEMP3.";
                    
//#line 63
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP12);
                }
                
//#line 65
final x10.
                  lang.
                  place RX10_TEMP13 =
                  Program.
                    getPlaceFromDist1(
                    X10_TEMP3,
                    RX10_TEMP9);
                
//#line 66
final x10.
                  lang.
                  place X10_TEMP4 =
                  RX10_TEMP13;
                
//#line 67
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 68
final Dist1 RX10_TEMP14 =
                      b.
                        distValue;
                    
//#line 69
final Region1 RX10_TEMP15 =
                      RX10_TEMP14.
                        dReg;
                    
//#line 70
final int RX10_TEMP16 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP15,
                        p);
                    
//#line 71
final int RX10_TEMP17 =
                      0;
                    
//#line 72
final boolean RX10_TEMP18 =
                      RX10_TEMP16 <
                      RX10_TEMP17;
                    
//#line 73
if (RX10_TEMP18) {
                        
//#line 74
java.
                          lang.
                          String RX10_TEMP19 =
                          "Array access index out of bounds";
                        
//#line 75
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP19);
                    }
                    
//#line 77
final x10.
                      lang.
                      place RX10_TEMP20 =
                      Program.
                        getPlaceFromDist1(
                        RX10_TEMP14,
                        RX10_TEMP16);
                    
//#line 78
final x10.
                      lang.
                      place RX10_TEMP22 =
                      /* template:here { */x10.lang.Runtime.here()/* } */;
                    
//#line 79
final boolean RX10_TEMP23 =
                      /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP20,RX10_TEMP22))/* } */;
                    
//#line 80
if (RX10_TEMP23) {
                        
//#line 81
java.
                          lang.
                          String RX10_TEMP21 =
                          "Bad place access for array b";
                        
//#line 82
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP21);
                    }
                    
//#line 84
final int RX10_TEMP24 =
                      Program.
                        getRefArrayValue1int(
                        b,
                        RX10_TEMP16);
                    
//#line 85
final int X10_TEMP8 =
                      (RX10_TEMP24);
                    
//#line 86
final int X10_TEMP11 =
                      (Program.
                         MR_f(
                         X10_TEMP0,
                         X10_TEMP8));
                    
//#line 87
final int X10_TEMP12 =
                      (X10_TEMP11);
                    
//#line 88
final Dist1 RX10_TEMP25 =
                      b.
                        distValue;
                    
//#line 89
final Region1 RX10_TEMP26 =
                      RX10_TEMP25.
                        dReg;
                    
//#line 90
final int RX10_TEMP27 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP26,
                        p);
                    
//#line 91
final int RX10_TEMP28 =
                      0;
                    
//#line 92
final boolean RX10_TEMP29 =
                      RX10_TEMP27 <
                      RX10_TEMP28;
                    
//#line 93
if (RX10_TEMP29) {
                        
//#line 94
java.
                          lang.
                          String RX10_TEMP30 =
                          "Array index out of bounds";
                        
//#line 95
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP30);
                    }
                    
//#line 97
final x10.
                      lang.
                      place RX10_TEMP31 =
                      Program.
                        getPlaceFromDist1(
                        RX10_TEMP25,
                        RX10_TEMP27);
                    
//#line 98
final x10.
                      lang.
                      place RX10_TEMP33 =
                      /* template:here { */x10.lang.Runtime.here()/* } */;
                    
//#line 99
final boolean RX10_TEMP34 =
                      /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP31,RX10_TEMP33))/* } */;
                    
//#line 100
if (RX10_TEMP34) {
                        
//#line 101
java.
                          lang.
                          String RX10_TEMP32 =
                          "Bad place access for array b";
                        
//#line 102
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP32);
                    }
                    
//#line 104
Program.
                                   setRefArrayValue1int(
                                   b,
                                   RX10_TEMP27,
                                   X10_TEMP12);
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
    
    
//#line 110
public static int
                   MR_f(
                   final MR X10_TEMP0,
                   final int x) {
        
//#line 111
final int X10_TEMP2 =
          (x *
             x);
        
//#line 112
return X10_TEMP2;
    }
    
    
//#line 115
public static void
                   MR_reduce(
                   final MR X10_TEMP0) {
        
//#line 116
final x10.
          lang.
          place h =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 117
final intRefArray1 X10_TEMP2 =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a;
        
//#line 118
final Dist1 RX10_TEMP0 =
          X10_TEMP2.
            distValue;
        
//#line 119
final Region1 RX10_TEMP1 =
          RX10_TEMP0.
            dReg;
        
//#line 120
final Region1 reg =
          RX10_TEMP1;
        
//#line 121
final x10.
          lang.
          place X10_TEMP4 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 122
final Dist1 dis =
          Program.
            getPlaceDist1(
            reg,
            X10_TEMP4);
        
//#line 123
final Region1 RX10_TEMP2 =
          dis.
            dReg;
        
//#line 124
final int RX10_TEMP3 =
          0;
        
//#line 125
final int RX10_TEMP4 =
          1;
        
//#line 126
int RX10_TEMP5 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 127
RX10_TEMP5 =
          RX10_TEMP5 -
            RX10_TEMP4;
        
//#line 128
final int RX10_TEMP6 =
          RX10_TEMP5 +
          1;
        
//#line 129
final int RX10_TEMP7 =
          RX10_TEMP5 +
          1;
        
//#line 130
final intStub[] RX10_TEMP8 =
          new intStub[RX10_TEMP7];
        
//#line 131
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 132
for (
//#line 132
int RX10_TEMP9 =
                                0;
                              RX10_TEMP9 <
                                RX10_TEMP6;
                              
//#line 132
RX10_TEMP9++) {
                
//#line 133
final x10.
                  lang.
                  place RX10_TEMP10 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 134
final int RX10_TEMP11 =
                  RX10_TEMP9;
                
//#line 135
final x10.
                  lang.
                  place RX10_TEMP12 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP11);
                
//#line 136
final int RX10_TEMP13 =
                  Program.
                    getDistLocalCount1(
                    dis,
                    RX10_TEMP11);
                
//#line 137
final int RX10_TEMP14 =
                  RX10_TEMP13 -
                  RX10_TEMP4;
                
//#line 138
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP12)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 139
final int RX10_TEMP15 =
                      RX10_TEMP14 +
                      1;
                    
//#line 140
final int[] RX10_TEMP16 =
                      new int[RX10_TEMP15];
                    
//#line 141
final intStub RX10_TEMP17 =
                      new intStub(
                      RX10_TEMP16);
                    
//#line 142
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 143
RX10_TEMP8[RX10_TEMP11] =
                          ((RX10_TEMP17));
                    }
                    		}
                    	});/* } */
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
        
        
//#line 148
final intStub[] RX10_TEMP18 =
          new intStub[RX10_TEMP6];
        
//#line 149
for (
//#line 149
int RX10_TEMP20 =
                            0;
                          RX10_TEMP20 <
                            RX10_TEMP6;
                          
//#line 149
RX10_TEMP20++) {
            
//#line 150
final intStub RX10_TEMP19 =
              RX10_TEMP8[RX10_TEMP20];
            
//#line 151
RX10_TEMP18[RX10_TEMP20] =
              RX10_TEMP19;
        }
        
//#line 153
final intRefArray1 RX10_TEMP21 =
          new intRefArray1(
          dis,
          RX10_TEMP18);
        
//#line 154
final intRefArray1 result =
          RX10_TEMP21;
        
//#line 155
final intRefArray1 X10_TEMP8 =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a;
        
//#line 156
final Dist1 RX10_TEMP23 =
          X10_TEMP8.
            distValue;
        
//#line 157
final Region1 RX10_TEMP24 =
          RX10_TEMP23.
            dReg;
        
//#line 158
final int RX10_TEMP27 =
          1;
        
//#line 159
int RX10_TEMP25 =
          RX10_TEMP24.
            regSize;
        
//#line 160
RX10_TEMP25 =
          RX10_TEMP25 -
            RX10_TEMP27;
        
//#line 161
final int RX10_TEMP26 =
          RX10_TEMP25 +
          1;
        
//#line 162
for (
//#line 162
int RX10_TEMP22 =
                            0;
                          RX10_TEMP22 <
                            RX10_TEMP26;
                          
//#line 162
RX10_TEMP22++) {
            
//#line 163
final int RX10_TEMP28 =
              RX10_TEMP22;
            
//#line 164
final Point1 p =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP24,
                RX10_TEMP28);
            
//#line 165
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 166
final intRefArray1 c =
                  /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a;
                
//#line 167
final intRefArray1 X10_TEMP10 =
                  /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a;
                
//#line 168
final Dist1 RX10_TEMP29 =
                  X10_TEMP10.
                    distValue;
                
//#line 169
final Dist1 X10_TEMP11 =
                  RX10_TEMP29;
                
//#line 170
final Region1 RX10_TEMP30 =
                  X10_TEMP11.
                    dReg;
                
//#line 171
final int RX10_TEMP31 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP30,
                    p);
                
//#line 172
final int RX10_TEMP32 =
                  0;
                
//#line 173
final boolean RX10_TEMP33 =
                  RX10_TEMP31 <
                  RX10_TEMP32;
                
//#line 174
if (RX10_TEMP33) {
                    
//#line 175
final java.
                      lang.
                      String RX10_TEMP34 =
                      "Point p not found in the distribution X10_TEMP11.";
                    
//#line 176
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP34);
                }
                
//#line 178
final x10.
                  lang.
                  place RX10_TEMP35 =
                  Program.
                    getPlaceFromDist1(
                    X10_TEMP11,
                    RX10_TEMP31);
                
//#line 179
final x10.
                  lang.
                  place X10_TEMP14 =
                  RX10_TEMP35;
                
//#line 180
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP14)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 181
final Dist1 RX10_TEMP36 =
                      c.
                        distValue;
                    
//#line 182
final Region1 RX10_TEMP37 =
                      RX10_TEMP36.
                        dReg;
                    
//#line 183
final int RX10_TEMP38 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP37,
                        p);
                    
//#line 184
final int RX10_TEMP39 =
                      0;
                    
//#line 185
final boolean RX10_TEMP40 =
                      RX10_TEMP38 <
                      RX10_TEMP39;
                    
//#line 186
if (RX10_TEMP40) {
                        
//#line 187
java.
                          lang.
                          String RX10_TEMP41 =
                          "Array access index out of bounds";
                        
//#line 188
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP41);
                    }
                    
//#line 190
final x10.
                      lang.
                      place RX10_TEMP42 =
                      Program.
                        getPlaceFromDist1(
                        RX10_TEMP36,
                        RX10_TEMP38);
                    
//#line 191
final x10.
                      lang.
                      place RX10_TEMP44 =
                      /* template:here { */x10.lang.Runtime.here()/* } */;
                    
//#line 192
final boolean RX10_TEMP45 =
                      /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP42,RX10_TEMP44))/* } */;
                    
//#line 193
if (RX10_TEMP45) {
                        
//#line 194
java.
                          lang.
                          String RX10_TEMP43 =
                          "Bad place access for array c";
                        
//#line 195
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP43);
                    }
                    
//#line 197
final int RX10_TEMP46 =
                      Program.
                        getRefArrayValue1int(
                        c,
                        RX10_TEMP38);
                    
//#line 198
final int v =
                      (RX10_TEMP46);
                    
//#line 199
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 200
final int X10_TEMP21 =
                          (v);
                        
//#line 201
final Dist1 RX10_TEMP47 =
                          result.
                            distValue;
                        
//#line 202
final Region1 RX10_TEMP48 =
                          RX10_TEMP47.
                            dReg;
                        
//#line 203
final int RX10_TEMP49 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP48,
                            p);
                        
//#line 204
final int RX10_TEMP50 =
                          0;
                        
//#line 205
final boolean RX10_TEMP51 =
                          RX10_TEMP49 <
                          RX10_TEMP50;
                        
//#line 206
if (RX10_TEMP51) {
                            
//#line 207
java.
                              lang.
                              String RX10_TEMP52 =
                              "Array index out of bounds";
                            
//#line 208
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP52);
                        }
                        
//#line 210
final x10.
                          lang.
                          place RX10_TEMP53 =
                          Program.
                            getPlaceFromDist1(
                            RX10_TEMP47,
                            RX10_TEMP49);
                        
//#line 211
final x10.
                          lang.
                          place RX10_TEMP55 =
                          /* template:here { */x10.lang.Runtime.here()/* } */;
                        
//#line 212
final boolean RX10_TEMP56 =
                          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP53,RX10_TEMP55))/* } */;
                        
//#line 213
if (RX10_TEMP56) {
                            
//#line 214
java.
                              lang.
                              String RX10_TEMP54 =
                              "Bad place access for array result";
                            
//#line 215
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP54);
                        }
                        
//#line 217
Program.
                                       setRefArrayValue1int(
                                       result,
                                       RX10_TEMP49,
                                       X10_TEMP21);
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp2) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp2);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 222
final Dist1 RX10_TEMP58 =
          result.
            distValue;
        
//#line 223
final Region1 RX10_TEMP59 =
          RX10_TEMP58.
            dReg;
        
//#line 224
final int RX10_TEMP62 =
          1;
        
//#line 225
int RX10_TEMP60 =
          RX10_TEMP59.
            regSize;
        
//#line 226
RX10_TEMP60 =
          RX10_TEMP60 -
            RX10_TEMP62;
        
//#line 227
final int RX10_TEMP61 =
          RX10_TEMP60 +
          1;
        
//#line 228
for (
//#line 228
int RX10_TEMP57 =
                            0;
                          RX10_TEMP57 <
                            RX10_TEMP61;
                          
//#line 228
RX10_TEMP57++) {
            
//#line 229
final int RX10_TEMP63 =
              RX10_TEMP57;
            
//#line 230
final Point1 p =
              Program.
                regionOrdinalPoint1(
                RX10_TEMP59,
                RX10_TEMP63);
            
//#line 231
final int X10_TEMP24 =
              (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
            
//#line 232
final Dist1 RX10_TEMP64 =
              result.
                distValue;
            
//#line 233
final Region1 RX10_TEMP65 =
              RX10_TEMP64.
                dReg;
            
//#line 234
final int RX10_TEMP66 =
              Program.
                searchPointInRegion1(
                RX10_TEMP65,
                p);
            
//#line 235
final int RX10_TEMP67 =
              0;
            
//#line 236
final boolean RX10_TEMP68 =
              RX10_TEMP66 <
              RX10_TEMP67;
            
//#line 237
if (RX10_TEMP68) {
                
//#line 238
java.
                  lang.
                  String RX10_TEMP69 =
                  "Array access index out of bounds";
                
//#line 239
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP69);
            }
            
//#line 241
final x10.
              lang.
              place RX10_TEMP70 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP64,
                RX10_TEMP66);
            
//#line 242
final x10.
              lang.
              place RX10_TEMP72 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 243
final boolean RX10_TEMP73 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP70,RX10_TEMP72))/* } */;
            
//#line 244
if (RX10_TEMP73) {
                
//#line 245
java.
                  lang.
                  String RX10_TEMP71 =
                  "Bad place access for array result";
                
//#line 246
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP71);
            }
            
//#line 248
final int RX10_TEMP74 =
              Program.
                getRefArrayValue1int(
                result,
                RX10_TEMP66);
            
//#line 249
final int X10_TEMP25 =
              (RX10_TEMP74);
            
//#line 250
final int X10_TEMP28 =
              (X10_TEMP24 +
                 X10_TEMP25);
            
//#line 251
final int X10_TEMP29 =
              (X10_TEMP28);
            
//#line 252
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total =
              ((X10_TEMP29));
        }
    }
    
    
//#line 256
public static int
                   _Timer_max_counters_init(
                   ) {
        
//#line 257
final int X10_TEMP2 =
          (64);
        
//#line 258
return X10_TEMP2;
    }
    
    
//#line 261
public static void
                   Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 262
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 263
final double X10_TEMP5 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 264
final double X10_TEMP6 =
          (X10_TEMP5);
        
//#line 265
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 266
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 267
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 268
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 269
final int RX10_TEMP4 =
          0;
        
//#line 270
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 271
if (RX10_TEMP5) {
            
//#line 272
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 273
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 275
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 276
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 277
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 278
if (RX10_TEMP10) {
            
//#line 279
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 280
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 282
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP3,
                       X10_TEMP6);
    }
    
    
//#line 285
public static void
                   Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 286
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 287
final double X10_TEMP5 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 288
final doubleRefArray1 X10_TEMP3 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 289
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 290
final Dist1 RX10_TEMP1 =
          X10_TEMP3.
            distValue;
        
//#line 291
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 292
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 293
final int RX10_TEMP4 =
          0;
        
//#line 294
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 295
if (RX10_TEMP5) {
            
//#line 296
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 297
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 299
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 300
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 301
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 302
if (RX10_TEMP10) {
            
//#line 303
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP3";
            
//#line 304
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 306
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP3,
            RX10_TEMP3);
        
//#line 307
final double X10_TEMP6 =
          (RX10_TEMP11);
        
//#line 308
final double X10_TEMP9 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 309
final double X10_TEMP10 =
          (X10_TEMP9);
        
//#line 310
final Point1 RX10_TEMP12 =
          new Point1(
          n);
        
//#line 311
final Dist1 RX10_TEMP13 =
          X10_TEMP1.
            distValue;
        
//#line 312
final Region1 RX10_TEMP14 =
          RX10_TEMP13.
            dReg;
        
//#line 313
final int RX10_TEMP15 =
          Program.
            searchPointInRegion1(
            RX10_TEMP14,
            RX10_TEMP12);
        
//#line 314
final int RX10_TEMP16 =
          0;
        
//#line 315
final boolean RX10_TEMP17 =
          RX10_TEMP15 <
          RX10_TEMP16;
        
//#line 316
if (RX10_TEMP17) {
            
//#line 317
java.
              lang.
              String RX10_TEMP18 =
              "Array index out of bounds";
            
//#line 318
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP18);
        }
        
//#line 320
final x10.
          lang.
          place RX10_TEMP19 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP13,
            RX10_TEMP15);
        
//#line 321
final x10.
          lang.
          place RX10_TEMP21 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 322
final boolean RX10_TEMP22 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
        
//#line 323
if (RX10_TEMP22) {
            
//#line 324
java.
              lang.
              String RX10_TEMP20 =
              "Bad place access for array X10_TEMP1";
            
//#line 325
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP20);
        }
        
//#line 327
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP15,
                       X10_TEMP10);
        
//#line 328
final doubleRefArray1 X10_TEMP11 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 329
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 330
final Point1 RX10_TEMP23 =
          new Point1(
          n);
        
//#line 331
final Dist1 RX10_TEMP24 =
          X10_TEMP13.
            distValue;
        
//#line 332
final Region1 RX10_TEMP25 =
          RX10_TEMP24.
            dReg;
        
//#line 333
final int RX10_TEMP26 =
          Program.
            searchPointInRegion1(
            RX10_TEMP25,
            RX10_TEMP23);
        
//#line 334
final int RX10_TEMP27 =
          0;
        
//#line 335
final boolean RX10_TEMP28 =
          RX10_TEMP26 <
          RX10_TEMP27;
        
//#line 336
if (RX10_TEMP28) {
            
//#line 337
java.
              lang.
              String RX10_TEMP29 =
              "Array access index out of bounds";
            
//#line 338
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP29);
        }
        
//#line 340
final x10.
          lang.
          place RX10_TEMP30 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP24,
            RX10_TEMP26);
        
//#line 341
final x10.
          lang.
          place RX10_TEMP32 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 342
final boolean RX10_TEMP33 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP30,RX10_TEMP32))/* } */;
        
//#line 343
if (RX10_TEMP33) {
            
//#line 344
java.
              lang.
              String RX10_TEMP31 =
              "Bad place access for array X10_TEMP13";
            
//#line 345
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP31);
        }
        
//#line 347
final double RX10_TEMP34 =
          Program.
            getRefArrayValue1double(
            X10_TEMP13,
            RX10_TEMP26);
        
//#line 348
final double X10_TEMP15 =
          (RX10_TEMP34);
        
//#line 349
final int X10_TEMP16 =
          (1000);
        
//#line 350
final double X10_TEMP19 =
          (X10_TEMP15 /
             X10_TEMP16);
        
//#line 351
final double X10_TEMP20 =
          (X10_TEMP19);
        
//#line 352
final Point1 RX10_TEMP35 =
          new Point1(
          n);
        
//#line 353
final Dist1 RX10_TEMP36 =
          X10_TEMP11.
            distValue;
        
//#line 354
final Region1 RX10_TEMP37 =
          RX10_TEMP36.
            dReg;
        
//#line 355
final int RX10_TEMP38 =
          Program.
            searchPointInRegion1(
            RX10_TEMP37,
            RX10_TEMP35);
        
//#line 356
final int RX10_TEMP39 =
          0;
        
//#line 357
final boolean RX10_TEMP40 =
          RX10_TEMP38 <
          RX10_TEMP39;
        
//#line 358
if (RX10_TEMP40) {
            
//#line 359
java.
              lang.
              String RX10_TEMP41 =
              "Array index out of bounds";
            
//#line 360
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP41);
        }
        
//#line 362
final x10.
          lang.
          place RX10_TEMP42 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP36,
            RX10_TEMP38);
        
//#line 363
final x10.
          lang.
          place RX10_TEMP44 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 364
final boolean RX10_TEMP45 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP42,RX10_TEMP44))/* } */;
        
//#line 365
if (RX10_TEMP45) {
            
//#line 366
java.
              lang.
              String RX10_TEMP43 =
              "Bad place access for array X10_TEMP11";
            
//#line 367
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP43);
        }
        
//#line 369
Program.
                       setRefArrayValue1double(
                       X10_TEMP11,
                       RX10_TEMP38,
                       X10_TEMP20);
        
//#line 370
final doubleRefArray1 X10_TEMP21 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 371
final doubleRefArray1 X10_TEMP23 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 372
final Point1 RX10_TEMP46 =
          new Point1(
          n);
        
//#line 373
final Dist1 RX10_TEMP47 =
          X10_TEMP23.
            distValue;
        
//#line 374
final Region1 RX10_TEMP48 =
          RX10_TEMP47.
            dReg;
        
//#line 375
final int RX10_TEMP49 =
          Program.
            searchPointInRegion1(
            RX10_TEMP48,
            RX10_TEMP46);
        
//#line 376
final int RX10_TEMP50 =
          0;
        
//#line 377
final boolean RX10_TEMP51 =
          RX10_TEMP49 <
          RX10_TEMP50;
        
//#line 378
if (RX10_TEMP51) {
            
//#line 379
java.
              lang.
              String RX10_TEMP52 =
              "Array access index out of bounds";
            
//#line 380
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP52);
        }
        
//#line 382
final x10.
          lang.
          place RX10_TEMP53 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP47,
            RX10_TEMP49);
        
//#line 383
final x10.
          lang.
          place RX10_TEMP55 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 384
final boolean RX10_TEMP56 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP53,RX10_TEMP55))/* } */;
        
//#line 385
if (RX10_TEMP56) {
            
//#line 386
java.
              lang.
              String RX10_TEMP54 =
              "Bad place access for array X10_TEMP23";
            
//#line 387
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP54);
        }
        
//#line 389
final double RX10_TEMP57 =
          Program.
            getRefArrayValue1double(
            X10_TEMP23,
            RX10_TEMP49);
        
//#line 390
final double X10_TEMP27 =
          (RX10_TEMP57);
        
//#line 391
final doubleRefArray1 X10_TEMP25 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 392
final Point1 RX10_TEMP58 =
          new Point1(
          n);
        
//#line 393
final Dist1 RX10_TEMP59 =
          X10_TEMP25.
            distValue;
        
//#line 394
final Region1 RX10_TEMP60 =
          RX10_TEMP59.
            dReg;
        
//#line 395
final int RX10_TEMP61 =
          Program.
            searchPointInRegion1(
            RX10_TEMP60,
            RX10_TEMP58);
        
//#line 396
final int RX10_TEMP62 =
          0;
        
//#line 397
final boolean RX10_TEMP63 =
          RX10_TEMP61 <
          RX10_TEMP62;
        
//#line 398
if (RX10_TEMP63) {
            
//#line 399
java.
              lang.
              String RX10_TEMP64 =
              "Array access index out of bounds";
            
//#line 400
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP64);
        }
        
//#line 402
final x10.
          lang.
          place RX10_TEMP65 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP59,
            RX10_TEMP61);
        
//#line 403
final x10.
          lang.
          place RX10_TEMP67 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 404
final boolean RX10_TEMP68 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP65,RX10_TEMP67))/* } */;
        
//#line 405
if (RX10_TEMP68) {
            
//#line 406
java.
              lang.
              String RX10_TEMP66 =
              "Bad place access for array X10_TEMP25";
            
//#line 407
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP66);
        }
        
//#line 409
final double RX10_TEMP69 =
          Program.
            getRefArrayValue1double(
            X10_TEMP25,
            RX10_TEMP61);
        
//#line 410
final double X10_TEMP28 =
          (RX10_TEMP69);
        
//#line 411
final double X10_TEMP31 =
          (X10_TEMP27 +
             X10_TEMP28);
        
//#line 412
final double X10_TEMP32 =
          (X10_TEMP31);
        
//#line 413
final Point1 RX10_TEMP70 =
          new Point1(
          n);
        
//#line 414
final Dist1 RX10_TEMP71 =
          X10_TEMP21.
            distValue;
        
//#line 415
final Region1 RX10_TEMP72 =
          RX10_TEMP71.
            dReg;
        
//#line 416
final int RX10_TEMP73 =
          Program.
            searchPointInRegion1(
            RX10_TEMP72,
            RX10_TEMP70);
        
//#line 417
final int RX10_TEMP74 =
          0;
        
//#line 418
final boolean RX10_TEMP75 =
          RX10_TEMP73 <
          RX10_TEMP74;
        
//#line 419
if (RX10_TEMP75) {
            
//#line 420
java.
              lang.
              String RX10_TEMP76 =
              "Array index out of bounds";
            
//#line 421
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP76);
        }
        
//#line 423
final x10.
          lang.
          place RX10_TEMP77 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP71,
            RX10_TEMP73);
        
//#line 424
final x10.
          lang.
          place RX10_TEMP79 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 425
final boolean RX10_TEMP80 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP77,RX10_TEMP79))/* } */;
        
//#line 426
if (RX10_TEMP80) {
            
//#line 427
java.
              lang.
              String RX10_TEMP78 =
              "Bad place access for array X10_TEMP21";
            
//#line 428
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP78);
        }
        
//#line 430
Program.
                       setRefArrayValue1double(
                       X10_TEMP21,
                       RX10_TEMP73,
                       X10_TEMP32);
    }
    
    
//#line 433
public static double
                   Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 434
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 435
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 436
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 437
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 438
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 439
final int RX10_TEMP4 =
          0;
        
//#line 440
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 441
if (RX10_TEMP5) {
            
//#line 442
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 443
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 445
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 446
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 447
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 448
if (RX10_TEMP10) {
            
//#line 449
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 450
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 452
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP1,
            RX10_TEMP3);
        
//#line 453
final double X10_TEMP4 =
          (RX10_TEMP11);
        
//#line 454
return X10_TEMP4;
    }
    
    
//#line 457
public static void
                   Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 458
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 459
final double X10_TEMP5 =
          (0);
        
//#line 460
final double X10_TEMP6 =
          (X10_TEMP5);
        
//#line 461
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 462
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 463
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 464
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 465
final int RX10_TEMP4 =
          0;
        
//#line 466
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 467
if (RX10_TEMP5) {
            
//#line 468
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 469
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 471
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 472
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 473
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 474
if (RX10_TEMP10) {
            
//#line 475
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 476
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 478
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP3,
                       X10_TEMP6);
        
//#line 479
final doubleRefArray1 X10_TEMP7 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 480
final double X10_TEMP11 =
          (0);
        
//#line 481
final double X10_TEMP12 =
          (X10_TEMP11);
        
//#line 482
final Point1 RX10_TEMP11 =
          new Point1(
          n);
        
//#line 483
final Dist1 RX10_TEMP12 =
          X10_TEMP7.
            distValue;
        
//#line 484
final Region1 RX10_TEMP13 =
          RX10_TEMP12.
            dReg;
        
//#line 485
final int RX10_TEMP14 =
          Program.
            searchPointInRegion1(
            RX10_TEMP13,
            RX10_TEMP11);
        
//#line 486
final int RX10_TEMP15 =
          0;
        
//#line 487
final boolean RX10_TEMP16 =
          RX10_TEMP14 <
          RX10_TEMP15;
        
//#line 488
if (RX10_TEMP16) {
            
//#line 489
java.
              lang.
              String RX10_TEMP17 =
              "Array index out of bounds";
            
//#line 490
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP17);
        }
        
//#line 492
final x10.
          lang.
          place RX10_TEMP18 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP12,
            RX10_TEMP14);
        
//#line 493
final x10.
          lang.
          place RX10_TEMP20 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 494
final boolean RX10_TEMP21 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP18,RX10_TEMP20))/* } */;
        
//#line 495
if (RX10_TEMP21) {
            
//#line 496
java.
              lang.
              String RX10_TEMP19 =
              "Bad place access for array X10_TEMP7";
            
//#line 497
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP19);
        }
        
//#line 499
Program.
                       setRefArrayValue1double(
                       X10_TEMP7,
                       RX10_TEMP14,
                       X10_TEMP12);
        
//#line 500
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 501
final double X10_TEMP17 =
          (0);
        
//#line 502
final double X10_TEMP18 =
          (X10_TEMP17);
        
//#line 503
final Point1 RX10_TEMP22 =
          new Point1(
          n);
        
//#line 504
final Dist1 RX10_TEMP23 =
          X10_TEMP13.
            distValue;
        
//#line 505
final Region1 RX10_TEMP24 =
          RX10_TEMP23.
            dReg;
        
//#line 506
final int RX10_TEMP25 =
          Program.
            searchPointInRegion1(
            RX10_TEMP24,
            RX10_TEMP22);
        
//#line 507
final int RX10_TEMP26 =
          0;
        
//#line 508
final boolean RX10_TEMP27 =
          RX10_TEMP25 <
          RX10_TEMP26;
        
//#line 509
if (RX10_TEMP27) {
            
//#line 510
java.
              lang.
              String RX10_TEMP28 =
              "Array index out of bounds";
            
//#line 511
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP28);
        }
        
//#line 513
final x10.
          lang.
          place RX10_TEMP29 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP23,
            RX10_TEMP25);
        
//#line 514
final x10.
          lang.
          place RX10_TEMP31 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 515
final boolean RX10_TEMP32 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP29,RX10_TEMP31))/* } */;
        
//#line 516
if (RX10_TEMP32) {
            
//#line 517
java.
              lang.
              String RX10_TEMP30 =
              "Bad place access for array X10_TEMP13";
            
//#line 518
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP30);
        }
        
//#line 520
Program.
                       setRefArrayValue1double(
                       X10_TEMP13,
                       RX10_TEMP25,
                       X10_TEMP18);
    }
    
    
//#line 523
public static void
                   Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 524
int i =
          (0);
        
//#line 525
boolean X10_TEMP4 =
          i <
          _Timer_max_counters;
        
//#line 526
while (X10_TEMP4) {
            
//#line 527
Program.
                           Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 528
final int X10_TEMP6 =
              (i);
            
//#line 529
final int X10_TEMP7 =
              1;
            
//#line 530
i =
              i +
                X10_TEMP7;
            
//#line 531
X10_TEMP4 =
              i <
                _Timer_max_counters;
        }
    }
    
    
//#line 535
public static double
                   getRefArrayValue1double(
                   final doubleRefArray1 array,
                   final int index) {
        
//#line 536
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 537
final int placeIndex =
          pl.
            id;
        
//#line 538
final Dist1 dArray =
          array.
            distValue;
        
//#line 539
final Dist dDist =
          dArray.
            dDist;
        
//#line 540
final int[] runSum =
          dDist.
            runningSum;
        
//#line 541
final int localIndex =
          runSum[index];
        
//#line 542
final doubleStub[] contents =
          array.
            contents;
        
//#line 543
final doubleStub indexStub =
          contents[placeIndex];
        
//#line 544
final double[] localArray =
          indexStub.
            localArray;
        
//#line 545
final double returnValue =
          localArray[localIndex];
        
//#line 546
return returnValue;
    }
    
    
//#line 549
public static int
                   constantSearchRegion1(
                   final Region1 r,
                   final Point1 target) {
        
//#line 550
final int zero =
          0;
        
//#line 551
final int one =
          1;
        
//#line 553
final int dim0 =
          r.
            dim0;
        
//#line 554
final int low0 =
          r.
            low0;
        
//#line 555
final int high0 =
          low0 +
          dim0;
        
//#line 556
int pt0 =
          target.
            f0;
        
//#line 557
final boolean lbound0 =
          pt0 <
          low0;
        
//#line 558
final boolean hbound0 =
          pt0 >=
          high0;
        
//#line 560
final int dim1 =
          1;
        
//#line 562
boolean outRegion =
          false;
        
//#line 563
outRegion =
          (outRegion ||
             lbound0);
        
//#line 564
outRegion =
          (outRegion ||
             hbound0);
        
//#line 565
if (outRegion) {
            
//#line 566
int notFound =
              0;
            
//#line 567
notFound =
              notFound -
                one;
            
//#line 568
return notFound;
        }
        
//#line 571
final int stride1 =
          1;
        
//#line 572
final int stride0 =
          stride1 *
          dim1;
        
//#line 574
pt0 =
          pt0 -
            low0;
        
//#line 575
final int offset0 =
          stride0 *
          pt0;
        
//#line 577
int found =
          0;
        
//#line 578
found =
          found +
            offset0;
        
//#line 579
return found;
    }
    
    
//#line 582
public static int
                   binarySearchRegion1(
                   final Region1 r,
                   final Point1 target) {
        
//#line 583
final Point1[] pointArray =
          r.
            pointArray;
        
//#line 584
int start =
          0;
        
//#line 585
int end =
          r.
            regSize;
        
//#line 586
final int zero =
          0;
        
//#line 587
final int one =
          1;
        
//#line 588
final int two =
          2;
        
//#line 589
end =
          end -
            one;
        
//#line 590
int result =
          zero -
          one;
        
//#line 591
boolean notDone =
          start <=
          end;
        
//#line 592
while (notDone) {
            
//#line 593
int mid =
              start +
              end;
            
//#line 594
mid =
              mid /
                two;
            
//#line 595
final Point1 temp =
              pointArray[mid];
            
//#line 596
final int pointCompare =
              Program.
                comparePoint1(
                target,
                temp);
            
//#line 597
final boolean eq =
              pointCompare ==
              zero;
            
//#line 598
final boolean lt =
              pointCompare ==
              one;
            
//#line 599
if (eq) {
                
//#line 600
return mid;
            } else {
                
//#line 603
if (lt) {
                    
//#line 604
end =
                      mid -
                        one;
                } else {
                    
//#line 607
start =
                      mid +
                        one;
                }
            }
            
//#line 610
notDone =
              start <=
                end;
        }
        
//#line 612
return result;
    }
    
    
//#line 615
public static Dist1
                   getBlockDist1(
                   final Region1 r) {
        
//#line 616
final int rSize =
          r.
            regSize;
        
//#line 617
final int zero =
          0;
        
//#line 618
final int one =
          1;
        
//#line 619
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 620
final int dReg =
          rSizeMinusOne +
          1;
        
//#line 621
final int dDist =
          rSizeMinusOne +
          1;
        
//#line 622
final x10.
          lang.
          place[] placeArray =
          new x10.
          lang.
          place[dDist];
        
//#line 623
final int N =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 624
final int q =
          rSize %
          N;
        
//#line 625
final int p =
          rSize /
          N;
        
//#line 626
int blockSize =
          p +
          one;
        
//#line 627
int arraySize =
          q *
          blockSize;
        
//#line 628
int offset =
          0;
        
//#line 629
x10.
          lang.
          place initPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 630
Program.
                       getCyclic(
                       placeArray,
                       arraySize,
                       initPlace,
                       blockSize);
        
//#line 631
int remainingPlaces =
          N -
          q;
        
//#line 632
final boolean cond =
          remainingPlaces ==
          zero;
        
//#line 633
if (cond) {
            
//#line 634
final x10.
              lang.
              place[] vPlaceArray =
              new x10.
              lang.
              place[dReg];
            
//#line 635
for (
//#line 635
int pt =
                                0;
                              pt <
                                dReg;
                              
//#line 635
pt++) {
                
//#line 636
final x10.
                  lang.
                  place tempPl =
                  placeArray[pt];
                
//#line 637
vPlaceArray[pt] =
                  tempPl;
            }
            
//#line 639
final Dist pointDist1 =
              new Dist(
              vPlaceArray,
              rSize);
            
//#line 640
final Dist1 retDist =
              new Dist1(
              r,
              pointDist1);
            
//#line 641
return retDist;
        }
        
//#line 643
offset =
          arraySize;
        
//#line 644
blockSize =
          p;
        
//#line 645
arraySize =
          remainingPlaces *
            blockSize;
        
//#line 646
initPlace =
          x10.
            lang.
            place.
            places(
            q);
        
//#line 647
int chunk =
          blockSize;
        
//#line 648
final boolean ifCond =
          blockSize >
          arraySize;
        
//#line 649
if (ifCond) {
            
//#line 650
chunk =
              arraySize;
        }
        
//#line 652
int index =
          offset;
        
//#line 653
int dSize =
          index +
          chunk;
        
//#line 654
dSize =
          dSize -
            one;
        
//#line 655
final int ub0 =
          chunk -
          one;
        
//#line 656
final int pointReg0 =
          ub0 +
          1;
        
//#line 657
for (
//#line 657
int pt =
                            0;
                          pt <
                            pointReg0;
                          
//#line 657
pt++) {
            
//#line 658
final int tempPt =
              pt +
              index;
            
//#line 659
placeArray[tempPt] =
              ((initPlace));
        }
        
//#line 661
index =
          index +
            chunk;
        
//#line 662
arraySize =
          arraySize -
            chunk;
        
//#line 663
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 664
boolean whileCond =
          arraySize !=
          zero;
        
//#line 665
while (whileCond) {
            
//#line 666
final boolean tailCond =
              chunk >
              arraySize;
            
//#line 667
if (tailCond) {
                
//#line 668
dSize =
                  index +
                    arraySize;
                
//#line 669
dSize =
                  dSize -
                    one;
                
//#line 670
final int ub =
                  arraySize -
                  one;
                
//#line 671
final int pointReg1 =
                  ub +
                  1;
                
//#line 672
for (
//#line 672
int pt =
                                    0;
                                  pt <
                                    pointReg1;
                                  
//#line 672
pt++) {
                    
//#line 673
final int tempPt =
                      pt +
                      index;
                    
//#line 674
placeArray[tempPt] =
                      ((pl));
                }
                
//#line 676
arraySize =
                  0;
            } else {
                
//#line 679
dSize =
                  index +
                    chunk;
                
//#line 680
dSize =
                  dSize -
                    one;
                
//#line 681
final int ub =
                  chunk -
                  one;
                
//#line 682
final int pointReg1 =
                  ub +
                  1;
                
//#line 683
for (
//#line 683
int pt =
                                    0;
                                  pt <
                                    pointReg1;
                                  
//#line 683
pt++) {
                    
//#line 684
final int tempPt =
                      pt +
                      index;
                    
//#line 685
placeArray[tempPt] =
                      ((pl));
                }
                
//#line 687
index =
                  index +
                    chunk;
                
//#line 688
arraySize =
                  arraySize -
                    chunk;
            }
            
//#line 690
pl =
              pl.
                next();
            
//#line 691
whileCond =
              arraySize !=
                zero;
        }
        
//#line 693
final x10.
          lang.
          place[] vPlaceArray =
          new x10.
          lang.
          place[dReg];
        
//#line 694
for (
//#line 694
int pt =
                            0;
                          pt <
                            dReg;
                          
//#line 694
pt++) {
            
//#line 695
final x10.
              lang.
              place tempPl =
              placeArray[pt];
            
//#line 696
vPlaceArray[pt] =
              tempPl;
        }
        
//#line 698
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 699
final Dist1 retDist =
          new Dist1(
          r,
          pointDist1);
        
//#line 700
return retDist;
    }
    
    
//#line 703
public static void
                   setRefArrayValue1double(
                   final doubleRefArray1 array,
                   final int index,
                   final double val) {
        
//#line 704
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 705
final int placeIndex =
          pl.
            id;
        
//#line 706
final Dist1 dArray =
          array.
            distValue;
        
//#line 707
final Dist dDist =
          dArray.
            dDist;
        
//#line 708
final int[] runSum =
          dDist.
            runningSum;
        
//#line 709
final int localIndex =
          runSum[index];
        
//#line 710
final doubleStub[] contents =
          array.
            contents;
        
//#line 711
final doubleStub indexStub =
          contents[placeIndex];
        
//#line 712
final double[] localArray =
          indexStub.
            localArray;
        
//#line 713
localArray[localIndex] =
          ((val));
    }
    
    
//#line 716
public static x10.
                   lang.
                   place
                   getPlaceFromDist1(
                   final Dist1 dn,
                   final int index) {
        
//#line 717
final Dist d =
          dn.
            dDist;
        
//#line 718
final x10.
          lang.
          place[] placeArray =
          d.
            placeArray;
        
//#line 719
final x10.
          lang.
          place retPlace =
          placeArray[index];
        
//#line 720
return retPlace;
    }
    
    
//#line 723
public static Point1[]
                   getDistLocalArray1(
                   final Dist1 dn,
                   final int placeIndex) {
        
//#line 724
final Region1 r =
          dn.
            dReg;
        
//#line 725
final Point1[] pointArray =
          r.
            pointArray;
        
//#line 726
final int rSize =
          r.
            regSize;
        
//#line 727
final Dist d =
          dn.
            dDist;
        
//#line 728
final x10.
          lang.
          place[] placeArray =
          d.
            placeArray;
        
//#line 729
final int one =
          1;
        
//#line 730
final x10.
          lang.
          place currPlace =
          x10.
            lang.
            place.
            places(
            placeIndex);
        
//#line 731
final int[] counts =
          d.
            counts;
        
//#line 732
final int localCount =
          counts[placeIndex];
        
//#line 733
final int localCountMinusOne =
          localCount -
          one;
        
//#line 734
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 735
final int localRegion =
          localCountMinusOne +
          1;
        
//#line 736
final int placeRegion =
          rSizeMinusOne +
          1;
        
//#line 737
final int localDist =
          localCountMinusOne +
          1;
        
//#line 738
final Point1[] tempPointArray =
          new Point1[localDist];
        
//#line 739
int tempCount =
          0;
        
//#line 740
for (
//#line 740
int p =
                            0;
                          p <
                            placeRegion;
                          
//#line 740
p++) {
            
//#line 741
final x10.
              lang.
              place pl =
              placeArray[p];
            
//#line 742
final boolean cond =
              /* template:equalsequals { */x10.lang.Runtime.equalsequals(pl,currPlace)/* } */;
            
//#line 743
if (cond) {
                
//#line 744
final Point1 tempPoint =
                  pointArray[p];
                
//#line 745
tempPointArray[tempCount] =
                  ((tempPoint));
                
//#line 746
tempCount =
                  tempCount +
                    one;
            }
        }
        
//#line 749
final Point1[] vPointArray =
          new Point1[localRegion];
        
//#line 750
for (
//#line 750
int p =
                            0;
                          p <
                            localRegion;
                          
//#line 750
p++) {
            
//#line 752
final Point1 tempPoint =
              tempPointArray[p];
            
//#line 753
vPointArray[p] =
              tempPoint;
        }
        
//#line 755
return vPointArray;
    }
    
    
//#line 758
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
        
//#line 759
final int zero =
          0;
        
//#line 760
final int one =
          1;
        
//#line 761
int N =
          arraySize;
        
//#line 762
int chunk =
          blockSize;
        
//#line 763
final boolean ifCond =
          blockSize >
          N;
        
//#line 764
if (ifCond) {
            
//#line 765
chunk =
              N;
        }
        
//#line 767
int index =
          0;
        
//#line 768
int dSize =
          index +
          chunk;
        
//#line 769
dSize =
          dSize -
            one;
        
//#line 770
final int pointReg =
          dSize +
          1;
        
//#line 771
for (
//#line 771
int p =
                            0;
                          p <
                            pointReg;
                          
//#line 771
p++) {
            
//#line 772
placeArray[p] =
              ((initPlace));
        }
        
//#line 774
index =
          index +
            chunk;
        
//#line 775
N =
          N -
            chunk;
        
//#line 776
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 777
boolean whileCond =
          N !=
          zero;
        
//#line 778
while (whileCond) {
            
//#line 779
final boolean tailCond =
              chunk >
              N;
            
//#line 780
if (tailCond) {
                
//#line 781
dSize =
                  index +
                    N;
                
//#line 782
dSize =
                  dSize -
                    one;
                
//#line 783
final int ub =
                  N -
                  one;
                
//#line 784
final int pointReg1 =
                  ub +
                  1;
                
//#line 785
for (
//#line 785
int p =
                                    0;
                                  p <
                                    pointReg1;
                                  
//#line 785
p++) {
                    
//#line 786
final int tempPt =
                      p +
                      index;
                    
//#line 787
placeArray[tempPt] =
                      ((pl));
                }
                
//#line 789
N =
                  0;
            } else {
                
//#line 792
dSize =
                  index +
                    chunk;
                
//#line 793
dSize =
                  dSize -
                    one;
                
//#line 794
final int ub =
                  chunk -
                  one;
                
//#line 795
final int pointReg1 =
                  ub +
                  1;
                
//#line 796
for (
//#line 796
int p =
                                    0;
                                  p <
                                    pointReg1;
                                  
//#line 796
p++) {
                    
//#line 797
final int tempPt =
                      p +
                      index;
                    
//#line 798
placeArray[tempPt] =
                      ((pl));
                }
                
//#line 800
index =
                  index +
                    chunk;
                
//#line 801
N =
                  N -
                    chunk;
            }
            
//#line 803
pl =
              pl.
                next();
            
//#line 804
whileCond =
              N !=
                zero;
        }
    }
    
    
//#line 808
public static int
                   getRefArrayValue1int(
                   final intRefArray1 array,
                   final int index) {
        
//#line 809
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 810
final int placeIndex =
          pl.
            id;
        
//#line 811
final Dist1 dArray =
          array.
            distValue;
        
//#line 812
final Dist dDist =
          dArray.
            dDist;
        
//#line 813
final int[] runSum =
          dDist.
            runningSum;
        
//#line 814
final int localIndex =
          runSum[index];
        
//#line 815
final intStub[] contents =
          array.
            contents;
        
//#line 816
final intStub indexStub =
          contents[placeIndex];
        
//#line 817
final int[] localArray =
          indexStub.
            localArray;
        
//#line 818
final int returnValue =
          localArray[localIndex];
        
//#line 819
return returnValue;
    }
    
    
//#line 822
public static int
                   getDistLocalCount1(
                   final Dist1 dn,
                   final int placeIndex) {
        
//#line 823
final Dist d =
          dn.
            dDist;
        
//#line 824
final int[] counts =
          d.
            counts;
        
//#line 825
final int localCount =
          counts[placeIndex];
        
//#line 826
return localCount;
    }
    
    
//#line 833
public static int
                   comparePoint1(
                   final Point1 pt1,
                   final Point1 pt2) {
        
//#line 834
final int zero =
          0;
        
//#line 835
final int one =
          1;
        
//#line 836
final int two =
          2;
        
//#line 837
int point1 =
          0;
        
//#line 838
int point2 =
          0;
        
//#line 839
boolean lt =
          false;
        
//#line 840
boolean gt =
          false;
        
//#line 842
point1 =
          pt1.
            f0;
        
//#line 843
point2 =
          pt2.
            f0;
        
//#line 844
lt =
          point1 <
            point2;
        
//#line 845
gt =
          point1 >
            point2;
        
//#line 846
if (lt) {
            
//#line 847
return one;
        }
        
//#line 849
if (gt) {
            
//#line 850
return two;
        }
        
//#line 852
return zero;
    }
    
    
//#line 855
public static int
                   searchPointInRegion1(
                   final Region1 r,
                   final Point1 target) {
        
//#line 856
final boolean regType =
          r.
            regType;
        
//#line 857
if (regType) {
            
//#line 858
final int constantSearch =
              Program.
                constantSearchRegion1(
                r,
                target);
            
//#line 859
return constantSearch;
        }
        
//#line 861
final int binarySearch =
          Program.
            binarySearchRegion1(
            r,
            target);
        
//#line 862
return binarySearch;
    }
    
    
//#line 865
public static Point1
                   regionOrdinalPoint1(
                   final Region1 reg,
                   final int ordl) {
        
//#line 866
final Point1[] pointArray =
          reg.
            pointArray;
        
//#line 867
final Point1 pt =
          pointArray[ordl];
        
//#line 868
return pt;
    }
    
    
//#line 871
public static Dist1
                   getPlaceDist1(
                   final Region1 r,
                   final x10.
                     lang.
                     place p) {
        
//#line 872
final int rSize =
          r.
            regSize;
        
//#line 873
final int one =
          1;
        
//#line 874
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 875
final int dReg =
          rSizeMinusOne +
          1;
        
//#line 876
final x10.
          lang.
          place[] vPlaceArray =
          new x10.
          lang.
          place[dReg];
        
//#line 877
for (
//#line 877
int pt =
                            0;
                          pt <
                            dReg;
                          
//#line 877
pt++) {
            
//#line 879
vPlaceArray[pt] =
              p;
        }
        
//#line 881
final Dist pointDist =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 882
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 883
return retDist;
    }
    
    
//#line 886
public static int[]
                   initDist(
                   final int[] tempArr,
                   final int tempReg) {
        
//#line 887
final int[] vTemp =
          new int[tempReg];
        
//#line 888
for (
//#line 888
int p =
                            0;
                          p <
                            tempReg;
                          
//#line 888
p++) {
            
//#line 889
final int tempInt =
              tempArr[p];
            
//#line 890
vTemp[p] =
              tempInt;
        }
        
//#line 892
return vTemp;
    }
    
    
//#line 895
public static void
                   setRefArrayValue1int(
                   final intRefArray1 array,
                   final int index,
                   final int val) {
        
//#line 896
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 897
final int placeIndex =
          pl.
            id;
        
//#line 898
final Dist1 dArray =
          array.
            distValue;
        
//#line 899
final Dist dDist =
          dArray.
            dDist;
        
//#line 900
final int[] runSum =
          dDist.
            runningSum;
        
//#line 901
final int localIndex =
          runSum[index];
        
//#line 902
final intStub[] contents =
          array.
            contents;
        
//#line 903
final intStub indexStub =
          contents[placeIndex];
        
//#line 904
final int[] localArray =
          indexStub.
            localArray;
        
//#line 905
localArray[localIndex] =
          ((val));
    }
    
    
//#line 908
public static Region1
                   createNewRegion1R(
                   final int v1_0,
                   final int v1_1) {
        
//#line 909
final int zero =
          0;
        
//#line 910
final int one =
          1;
        
//#line 912
boolean regType =
          true;
        
//#line 913
final boolean tempBool1 =
          true;
        
//#line 914
regType =
          regType &&
            tempBool1;
        
//#line 917
final int l1 =
          v1_1 -
          v1_0;
        
//#line 918
final int dim1 =
          l1 +
          one;
        
//#line 920
final int stride1 =
          1;
        
//#line 921
final int stride0 =
          stride1 *
          dim1;
        
//#line 923
final int rSize =
          stride0 -
          one;
        
//#line 924
final int regArr =
          rSize +
          1;
        
//#line 926
final Point1[] ptArray =
          new Point1[regArr];
        
//#line 927
for (
//#line 927
int pt =
                            0;
                          pt <
                            regArr;
                          
//#line 927
pt++) {
            
//#line 928
final int p =
              pt;
            
//#line 929
int f1 =
              p /
              stride1;
            
//#line 930
f1 =
              f1 %
                dim1;
            
//#line 931
f1 =
              f1 +
                v1_0;
            
//#line 933
final Point1 retPoint =
              new Point1(
              f1);
            
//#line 934
ptArray[pt] =
              retPoint;
        }
        
//#line 936
if (regType) {
            
//#line 937
final Region1 retRegRegular =
              new Region1(
              ptArray,
              v1_0,
              dim1);
            
//#line 938
return retRegRegular;
        }
        
//#line 940
final Region1 retReg =
          new Region1(
          ptArray);
        
//#line 941
return retReg;
    }
    
    
//#line 6
public Program() {
        
//#line 6
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 946
public intRefArray1
      a;
    
//#line 947
public int
      total;
    
    
//#line 950
public MR() {
        
//#line 950
super();
        
//#line 951
final Region1 X10_TEMP2 =
          Program.
            _MR_r;
        
//#line 952
final Dist1 X10_TEMP3 =
          Program.
            getBlockDist1(
            X10_TEMP2);
        
//#line 953
final Dist1 d =
          X10_TEMP3;
        
//#line 954
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 955
final int RX10_TEMP1 =
          0;
        
//#line 956
final int RX10_TEMP2 =
          1;
        
//#line 957
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 958
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 959
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 960
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 961
final intStub[] RX10_TEMP6 =
          new intStub[RX10_TEMP5];
        
//#line 962
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 963
for (
//#line 963
int RX10_TEMP7 =
                                0;
                              RX10_TEMP7 <
                                RX10_TEMP4;
                              
//#line 963
RX10_TEMP7++) {
                
//#line 964
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 965
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 966
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 967
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 968
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 969
final Point1[] RX10_TEMP13 =
                  Program.
                    getDistLocalArray1(
                    d,
                    RX10_TEMP9);
                
//#line 970
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 971
final int RX10_TEMP15 =
                      RX10_TEMP12 +
                      1;
                    
//#line 972
final int[] RX10_TEMP16 =
                      new int[RX10_TEMP15];
                    
//#line 973
for (
//#line 973
int RX10_TEMP14 =
                                        0;
                                      RX10_TEMP14 <
                                        RX10_TEMP15;
                                      
//#line 973
RX10_TEMP14++) {
                        
//#line 974
final Point1 p =
                          RX10_TEMP13[RX10_TEMP14];
                        
//#line 975
final int X10_TEMP7 =
                          (p.
                             f0);
                        
//#line 976
RX10_TEMP16[RX10_TEMP14] =
                          X10_TEMP7;
                    }
                    
//#line 978
final intStub RX10_TEMP17 =
                      new intStub(
                      RX10_TEMP16);
                    
//#line 979
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 980
RX10_TEMP6[RX10_TEMP9] =
                          ((RX10_TEMP17));
                    }
                    		}
                    	});/* } */
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
        
        
//#line 985
final intStub[] RX10_TEMP18 =
          new intStub[RX10_TEMP4];
        
//#line 986
for (
//#line 986
int RX10_TEMP20 =
                            0;
                          RX10_TEMP20 <
                            RX10_TEMP4;
                          
//#line 986
RX10_TEMP20++) {
            
//#line 987
final intStub RX10_TEMP19 =
              RX10_TEMP6[RX10_TEMP20];
            
//#line 988
RX10_TEMP18[RX10_TEMP20] =
              RX10_TEMP19;
        }
        
//#line 990
final intRefArray1 RX10_TEMP21 =
          new intRefArray1(
          d,
          RX10_TEMP18);
        
//#line 991
final intRefArray1 X10_TEMP9 =
          RX10_TEMP21;
        
//#line 992
a =
          X10_TEMP9;
        
//#line 993
final int X10_TEMP11 =
          (0);
        
//#line 994
total =
          ((X10_TEMP11));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1001
public doubleRefArray1
      start_time;
    
//#line 1002
public doubleRefArray1
      elapsed_time;
    
//#line 1003
public doubleRefArray1
      total_time;
    
    
//#line 1006
public Timer() {
        
//#line 1006
super();
        
//#line 1007
final int X10_TEMP3 =
          (0);
        
//#line 1008
final int X10_TEMP4 =
          (Program.
             _Timer_max_counters);
        
//#line 1009
final Region1 X10_TEMP5 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 1010
final x10.
          lang.
          place X10_TEMP6 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1011
final Dist1 d =
          Program.
            getPlaceDist1(
            X10_TEMP5,
            X10_TEMP6);
        
//#line 1012
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 1013
final int RX10_TEMP1 =
          0;
        
//#line 1014
final int RX10_TEMP2 =
          1;
        
//#line 1015
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1016
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 1017
final int RX10_TEMP4 =
          RX10_TEMP3 +
          1;
        
//#line 1018
final int RX10_TEMP5 =
          RX10_TEMP3 +
          1;
        
//#line 1019
final doubleStub[] RX10_TEMP6 =
          new doubleStub[RX10_TEMP5];
        
//#line 1020
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1021
for (
//#line 1021
int RX10_TEMP7 =
                                 0;
                               RX10_TEMP7 <
                                 RX10_TEMP4;
                               
//#line 1021
RX10_TEMP7++) {
                
//#line 1022
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1023
final int RX10_TEMP9 =
                  RX10_TEMP7;
                
//#line 1024
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 1025
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 1026
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 1027
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1028
final int RX10_TEMP14 =
                      RX10_TEMP12 +
                      1;
                    
//#line 1029
final double[] RX10_TEMP15 =
                      new double[RX10_TEMP14];
                    
//#line 1030
for (
//#line 1030
int RX10_TEMP13 =
                                         0;
                                       RX10_TEMP13 <
                                         RX10_TEMP14;
                                       
//#line 1030
RX10_TEMP13++) {
                        
//#line 1031
final double X10_TEMP9 =
                          (0);
                        
//#line 1032
RX10_TEMP15[RX10_TEMP13] =
                          X10_TEMP9;
                    }
                    
//#line 1034
final doubleStub RX10_TEMP16 =
                      new doubleStub(
                      RX10_TEMP15);
                    
//#line 1035
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1036
RX10_TEMP6[RX10_TEMP9] =
                          ((RX10_TEMP16));
                    }
                    		}
                    	});/* } */
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
        
        
//#line 1041
final doubleStub[] RX10_TEMP17 =
          new doubleStub[RX10_TEMP4];
        
//#line 1042
for (
//#line 1042
int RX10_TEMP19 =
                             0;
                           RX10_TEMP19 <
                             RX10_TEMP4;
                           
//#line 1042
RX10_TEMP19++) {
            
//#line 1043
final doubleStub RX10_TEMP18 =
              RX10_TEMP6[RX10_TEMP19];
            
//#line 1044
RX10_TEMP17[RX10_TEMP19] =
              RX10_TEMP18;
        }
        
//#line 1046
final doubleRefArray1 RX10_TEMP20 =
          new doubleRefArray1(
          d,
          RX10_TEMP17);
        
//#line 1047
final doubleRefArray1 X10_TEMP11 =
          RX10_TEMP20;
        
//#line 1048
start_time =
          X10_TEMP11;
        
//#line 1049
final Region1 RX10_TEMP21 =
          d.
            dReg;
        
//#line 1050
final int RX10_TEMP22 =
          0;
        
//#line 1051
final int RX10_TEMP23 =
          1;
        
//#line 1052
int RX10_TEMP24 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1053
RX10_TEMP24 =
          RX10_TEMP24 -
            RX10_TEMP23;
        
//#line 1054
final int RX10_TEMP25 =
          RX10_TEMP24 +
          1;
        
//#line 1055
final int RX10_TEMP26 =
          RX10_TEMP24 +
          1;
        
//#line 1056
final doubleStub[] RX10_TEMP27 =
          new doubleStub[RX10_TEMP26];
        
//#line 1057
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1058
for (
//#line 1058
int RX10_TEMP28 =
                                 0;
                               RX10_TEMP28 <
                                 RX10_TEMP25;
                               
//#line 1058
RX10_TEMP28++) {
                
//#line 1059
final x10.
                  lang.
                  place RX10_TEMP29 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1060
final int RX10_TEMP30 =
                  RX10_TEMP28;
                
//#line 1061
final x10.
                  lang.
                  place RX10_TEMP31 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP30);
                
//#line 1062
final int RX10_TEMP32 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP30);
                
//#line 1063
final int RX10_TEMP33 =
                  RX10_TEMP32 -
                  RX10_TEMP23;
                
//#line 1064
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP31)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1065
final int RX10_TEMP35 =
                      RX10_TEMP33 +
                      1;
                    
//#line 1066
final double[] RX10_TEMP36 =
                      new double[RX10_TEMP35];
                    
//#line 1067
for (
//#line 1067
int RX10_TEMP34 =
                                         0;
                                       RX10_TEMP34 <
                                         RX10_TEMP35;
                                       
//#line 1067
RX10_TEMP34++) {
                        
//#line 1068
final double X10_TEMP13 =
                          (0);
                        
//#line 1069
RX10_TEMP36[RX10_TEMP34] =
                          X10_TEMP13;
                    }
                    
//#line 1071
final doubleStub RX10_TEMP37 =
                      new doubleStub(
                      RX10_TEMP36);
                    
//#line 1072
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP29)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1073
RX10_TEMP27[RX10_TEMP30] =
                          ((RX10_TEMP37));
                    }
                    		}
                    	});/* } */
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
        
        
//#line 1078
final doubleStub[] RX10_TEMP38 =
          new doubleStub[RX10_TEMP25];
        
//#line 1079
for (
//#line 1079
int RX10_TEMP40 =
                             0;
                           RX10_TEMP40 <
                             RX10_TEMP25;
                           
//#line 1079
RX10_TEMP40++) {
            
//#line 1080
final doubleStub RX10_TEMP39 =
              RX10_TEMP27[RX10_TEMP40];
            
//#line 1081
RX10_TEMP38[RX10_TEMP40] =
              RX10_TEMP39;
        }
        
//#line 1083
final doubleRefArray1 RX10_TEMP41 =
          new doubleRefArray1(
          d,
          RX10_TEMP38);
        
//#line 1084
final doubleRefArray1 X10_TEMP15 =
          RX10_TEMP41;
        
//#line 1085
elapsed_time =
          X10_TEMP15;
        
//#line 1086
final Region1 RX10_TEMP42 =
          d.
            dReg;
        
//#line 1087
final int RX10_TEMP43 =
          0;
        
//#line 1088
final int RX10_TEMP44 =
          1;
        
//#line 1089
int RX10_TEMP45 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1090
RX10_TEMP45 =
          RX10_TEMP45 -
            RX10_TEMP44;
        
//#line 1091
final int RX10_TEMP46 =
          RX10_TEMP45 +
          1;
        
//#line 1092
final int RX10_TEMP47 =
          RX10_TEMP45 +
          1;
        
//#line 1093
final doubleStub[] RX10_TEMP48 =
          new doubleStub[RX10_TEMP47];
        
//#line 1094
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1095
for (
//#line 1095
int RX10_TEMP49 =
                                 0;
                               RX10_TEMP49 <
                                 RX10_TEMP46;
                               
//#line 1095
RX10_TEMP49++) {
                
//#line 1096
final x10.
                  lang.
                  place RX10_TEMP50 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1097
final int RX10_TEMP51 =
                  RX10_TEMP49;
                
//#line 1098
final x10.
                  lang.
                  place RX10_TEMP52 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP51);
                
//#line 1099
final int RX10_TEMP53 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP51);
                
//#line 1100
final int RX10_TEMP54 =
                  RX10_TEMP53 -
                  RX10_TEMP44;
                
//#line 1101
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP52)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1102
final int RX10_TEMP56 =
                      RX10_TEMP54 +
                      1;
                    
//#line 1103
final double[] RX10_TEMP57 =
                      new double[RX10_TEMP56];
                    
//#line 1104
for (
//#line 1104
int RX10_TEMP55 =
                                         0;
                                       RX10_TEMP55 <
                                         RX10_TEMP56;
                                       
//#line 1104
RX10_TEMP55++) {
                        
//#line 1105
final double X10_TEMP17 =
                          (0);
                        
//#line 1106
RX10_TEMP57[RX10_TEMP55] =
                          X10_TEMP17;
                    }
                    
//#line 1108
final doubleStub RX10_TEMP58 =
                      new doubleStub(
                      RX10_TEMP57);
                    
//#line 1109
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP50)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1110
RX10_TEMP48[RX10_TEMP51] =
                          ((RX10_TEMP58));
                    }
                    		}
                    	});/* } */
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
        
        
//#line 1115
final doubleStub[] RX10_TEMP59 =
          new doubleStub[RX10_TEMP46];
        
//#line 1116
for (
//#line 1116
int RX10_TEMP61 =
                             0;
                           RX10_TEMP61 <
                             RX10_TEMP46;
                           
//#line 1116
RX10_TEMP61++) {
            
//#line 1117
final doubleStub RX10_TEMP60 =
              RX10_TEMP48[RX10_TEMP61];
            
//#line 1118
RX10_TEMP59[RX10_TEMP61] =
              RX10_TEMP60;
        }
        
//#line 1120
final doubleRefArray1 RX10_TEMP62 =
          new doubleRefArray1(
          d,
          RX10_TEMP59);
        
//#line 1121
final doubleRefArray1 X10_TEMP19 =
          RX10_TEMP62;
        
//#line 1122
total_time =
          X10_TEMP19;
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
    
//#line 1129
final public int
      regRank;
    
//#line 1130
final public int
      regSize;
    
//#line 1131
final public boolean
      regType;
    
//#line 1132
final public int
      low0;
    
//#line 1133
final public int
      dim0;
    
//#line 1134
final public Point1[]
      pointArray;
    
    
//#line 1137
public Region1(final Point1[] pointArray_) {
        
//#line 1137
super();
        
//#line 1138
final int zero =
          0;
        
//#line 1139
final int one =
          1;
        
//#line 1140
final int minusOne =
          zero -
          one;
        
//#line 1141
regRank =
          1;
        
//#line 1143
regSize =
          pointArray_.
            length;
        
//#line 1144
pointArray =
          pointArray_;
        
//#line 1145
regType =
          false;
        
//#line 1146
low0 =
          minusOne;
        
//#line 1147
dim0 =
          zero;
    }
    
    
//#line 1149
public Region1(final Point1[] pointArray_,
                                 final int low0_,
                                 final int dim0_) {
        
//#line 1149
super();
        
//#line 1150
regRank =
          1;
        
//#line 1152
regSize =
          pointArray_.
            length;
        
//#line 1153
pointArray =
          pointArray_;
        
//#line 1154
regType =
          true;
        
//#line 1155
low0 =
          low0_;
        
//#line 1156
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
    
//#line 1162
final public double[]
      localArray;
    
    
//#line 1165
public doubleStub(final double[] localArray_) {
        
//#line 1165
super();
        
//#line 1166
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
    
//#line 1172
final public x10.
      lang.
      place[]
      placeArray;
    
//#line 1173
final public int[]
      counts;
    
//#line 1174
final public int[]
      runningSum;
    
    
//#line 1177
public Dist(final x10.
                                lang.
                                place[] vPlaceArray,
                              final int arraySize) {
        
//#line 1177
super();
        
//#line 1178
final int one =
          1;
        
//#line 1179
final int zero =
          0;
        
//#line 1180
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1181
final int ub =
          maxPlaces -
          one;
        
//#line 1182
final int countReg =
          ub +
          1;
        
//#line 1183
final int countDist =
          ub +
          1;
        
//#line 1184
final int rSize =
          arraySize -
          one;
        
//#line 1185
final int arrayReg =
          rSize +
          1;
        
//#line 1186
final int runSumDist =
          rSize +
          1;
        
//#line 1187
final int[] tempCounts =
          new int[countDist];
        
//#line 1188
final int[] tempRunSum =
          new int[runSumDist];
        
//#line 1190
for (
//#line 1190
int p =
                             0;
                           p <
                             countReg;
                           
//#line 1190
p++) {
            
//#line 1191
tempCounts[p] =
              ((zero));
        }
        
//#line 1194
for (
//#line 1194
int p =
                             0;
                           p <
                             arrayReg;
                           
//#line 1194
p++) {
            
//#line 1195
final x10.
              lang.
              place pl =
              vPlaceArray[p];
            
//#line 1196
final int index =
              pl.
                id;
            
//#line 1197
final int oldVal =
              tempCounts[index];
            
//#line 1198
tempRunSum[p] =
              ((oldVal));
            
//#line 1199
final int oldValPlusOne =
              oldVal +
              one;
            
//#line 1200
tempCounts[index] =
              ((oldValPlusOne));
        }
        
//#line 1203
placeArray =
          vPlaceArray;
        
//#line 1204
counts =
          Program.
            initDist(
            tempCounts,
            countReg);
        
//#line 1205
runningSum =
          Program.
            initDist(
            tempRunSum,
            arrayReg);
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
    
//#line 1211
final public int[]
      localArray;
    
    
//#line 1214
public intStub(final int[] localArray_) {
        
//#line 1214
super();
        
//#line 1215
localArray =
          localArray_;
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
    
//#line 1221
final public int
      f0;
    
    
//#line 1224
public Point1(final int f0_) {
        
//#line 1224
super();
        
//#line 1225
f0 =
          f0_;
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
    
//#line 1231
final public Dist1
      distValue;
    
//#line 1232
final public intStub[]
      contents;
    
    
//#line 1235
public intRefArray1(final Dist1 distValue_,
                                      final intStub[] contents_) {
        
//#line 1235
super();
        
//#line 1236
distValue =
          distValue_;
        
//#line 1237
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
    
//#line 1243
final public Region1
      dReg;
    
//#line 1244
final public Dist
      dDist;
    
    
//#line 1247
public Dist1(final Region1 dReg_,
                               final Dist dDist_) {
        
//#line 1247
super();
        
//#line 1248
dReg =
          dReg_;
        
//#line 1249
dDist =
          dDist_;
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
    
//#line 1255
final public Dist1
      distValue;
    
//#line 1256
final public doubleStub[]
      contents;
    
    
//#line 1259
public doubleRefArray1(final Dist1 distValue_,
                                         final doubleStub[] contents_) {
        
//#line 1259
super();
        
//#line 1260
distValue =
          distValue_;
        
//#line 1261
contents =
          contents_;
    }
}
