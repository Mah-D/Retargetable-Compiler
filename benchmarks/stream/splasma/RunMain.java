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
final public static int
      _Stream_MEG =
      Program.
        _Stream_MEG_init();
    
//#line 8
final public static double
      _Stream_alpha =
      Program.
        _Stream_alpha_init();
    
//#line 9
final public static int
      _Stream_NUM_TIMES =
      Program.
        _Stream_NUM_TIMES_init();
    
//#line 10
final public static int
      _Timer_max_counters =
      Program.
        _Timer_max_counters_init();
    
//#line 11
final public static long
      _Stream_N0 =
      Program.
        _Stream_N0_init();
    
//#line 12
final public static long
      _Stream_N =
      Program.
        _Stream_N_init();
    
//#line 13
final public static int
      _Stream_LocalSize =
      Program.
        _Stream_LocalSize_init();
    
    
//#line 16
public static void
                  runMain(
                  ) {
        
//#line 17
Timer tmr =
          (new Timer(
             ));
        
//#line 18
int count =
          (0);
        
//#line 19
Program.
                      Timer_start(
                      tmr,
                      count);
        
//#line 20
final Stream X10_TEMP4 =
          (new Stream(
             ));
        
//#line 21
Program.
                      Stream_run(
                      X10_TEMP4);
        
//#line 22
Program.
                      Timer_stop(
                      tmr,
                      count);
        
//#line 23
final java.
          lang.
          String X10_TEMP7 =
          ("Wall-clock time for stream: ");
        
//#line 24
final double X10_TEMP8 =
          (Program.
             Timer_readTimer(
             tmr,
             count));
        
//#line 25
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 26
final java.
          lang.
          String X10_TEMP10 =
          (" secs");
        
//#line 27
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 28
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 31
public static int
                  _Stream_MEG_init(
                  ) {
        
//#line 32
final int X10_TEMP1 =
          (2048);
        
//#line 33
final int X10_TEMP2 =
          (2048);
        
//#line 34
final int X10_TEMP4 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 35
return X10_TEMP4;
    }
    
    
//#line 38
public static double
                  _Stream_alpha_init(
                  ) {
        
//#line 39
final double X10_TEMP2 =
          (3.0);
        
//#line 40
return X10_TEMP2;
    }
    
    
//#line 43
public static int
                  _Stream_NUM_TIMES_init(
                  ) {
        
//#line 44
final int X10_TEMP2 =
          (10);
        
//#line 45
return X10_TEMP2;
    }
    
    
//#line 48
public static long
                  _Stream_N0_init(
                  ) {
        
//#line 49
final int X10_TEMP1 =
          (2);
        
//#line 50
final long X10_TEMP3 =
          (X10_TEMP1 *
             _Stream_MEG);
        
//#line 51
return X10_TEMP3;
    }
    
    
//#line 54
public static long
                  _Stream_N_init(
                  ) {
        
//#line 55
final int X10_TEMP1 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 56
final long X10_TEMP3 =
          (_Stream_N0 *
             X10_TEMP1);
        
//#line 57
return X10_TEMP3;
    }
    
    
//#line 60
public static int
                  _Stream_LocalSize_init(
                  ) {
        
//#line 61
final int X10_TEMP2 =
          ((int)
             _Stream_N0);
        
//#line 62
return X10_TEMP2;
    }
    
    
//#line 65
public static void
                  Stream_run(
                  final Stream X10_TEMP0) {
        
//#line 66
final java.
          lang.
          String X10_TEMP1 =
          ("LocalSize=");
        
//#line 67
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP1 +
           _Stream_LocalSize);
        
//#line 68
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP3);
        
//#line 69
final StreamData tempSd =
          (/* template:place-check { */((Stream) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sd);
        
//#line 70
final Dist1 X10_TEMP5 =
          Program.
            getUniqueDist();
        
//#line 71
final Dist1 dUnique =
          X10_TEMP5;
        
//#line 72
final Region1 RX10_TEMP0 =
          dUnique.
            dReg;
        
//#line 73
final int RX10_TEMP1 =
          0;
        
//#line 74
final int RX10_TEMP2 =
          1;
        
//#line 75
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 76
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 77
final x10.
          lang.
          region RX10_TEMP4 =
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
              RX10_TEMP3));
        
//#line 78
final x10.
          lang.
          dist RX10_TEMP5 =
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
                RX10_TEMP3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 79
final x10.
          lang.
          GenericReferenceArray RX10_TEMP6 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP5,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 80
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 81
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP7__ = (RX10_TEMP4).iterator(); RX10_TEMP7__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP7 = (x10.
              lang.
              point) RX10_TEMP7__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 82
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 83
final int RX10_TEMP9 =
                  /* template:array_get { */((RX10_TEMP7).get(0))/* } */;
                
//#line 84
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 85
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    dUnique,
                    RX10_TEMP9);
                
//#line 86
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 87
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 88
final x10.
                      lang.
                      dist RX10_TEMP15 =
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
                            RX10_TEMP12)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 89
final x10.
                      lang.
                      GenericReferenceArray RX10_TEMP16 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP15,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP13/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 90
final Dist1 X10_TEMP8 =
                                tempSd.
                                  D;
                              
//#line 91
final x10.
                                lang.
                                place X10_TEMP9 =
                                (/* template:here { */x10.lang.Runtime.here()/* } */);
                              
//#line 92
final Dist1 X10_TEMP11 =
                                Program.
                                  restrictDist1(
                                  X10_TEMP8,
                                  X10_TEMP9);
                              
//#line 93
final Region1 RX10_TEMP14 =
                                X10_TEMP11.
                                  dReg;
                              
//#line 94
final Region1 X10_TEMP13 =
                                RX10_TEMP14;
                              
//#line 95
return X10_TEMP13;
                          } }
                          }/* } */,true,true,true)/* } */));
                    
//#line 98
final Region1Stub RX10_TEMP17 =
                      new Region1Stub(
                      RX10_TEMP16);
                    
//#line 99
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 100
/* template:array_set { */(RX10_TEMP6).set((RX10_TEMP17),RX10_TEMP7)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 105
final x10.
          lang.
          GenericReferenceArray RX10_TEMP18 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP4.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP20/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 106
final Region1Stub RX10_TEMP19 =
                    /* template:parametric { */((Region1Stub)(/* template:array_get { */((RX10_TEMP6).get(RX10_TEMP20))/* } */))/* } */;
                  
//#line 107
return RX10_TEMP19;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 109
final Region1RefArray1 RX10_TEMP21 =
          new Region1RefArray1(
          dUnique,
          RX10_TEMP18);
        
//#line 110
final Region1RefArray1 X10_TEMP14 =
          RX10_TEMP21;
        
//#line 111
final Region1RefArray1 placeDist =
          X10_TEMP14;
        
//#line 112
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 113
final int X10_TEMP21 =
              (0);
            
//#line 114
final int X10_TEMP17 =
              (1);
            
//#line 115
final int X10_TEMP19 =
              (_Stream_NUM_TIMES -
                 X10_TEMP17);
            
//#line 116
final int X10_TEMP22 =
              ((int)
                 X10_TEMP19);
            
//#line 117
Region1 r =
              Program.
                createNewRegion1R(
                X10_TEMP21,
                X10_TEMP22);
            
//#line 118
final int RX10_TEMP25 =
              1;
            
//#line 119
int RX10_TEMP23 =
              r.
                regSize;
            
//#line 120
RX10_TEMP23 =
              RX10_TEMP23 -
                RX10_TEMP25;
            
//#line 121
final x10.
              lang.
              region RX10_TEMP24 =
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
                  RX10_TEMP23));
            
//#line 122
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP22__ = (RX10_TEMP24).iterator(); RX10_TEMP22__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP22 = (x10.
              lang.
              point) RX10_TEMP22__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 123
final int RX10_TEMP26 =
                  /* template:array_get { */((RX10_TEMP22).get(0))/* } */;
                
//#line 124
final Point1 p1 =
                  Program.
                    regionOrdinalPoint1(
                    r,
                    RX10_TEMP26);
                
//#line 125
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 126
final Dist1 X10_TEMP26 =
                      Program.
                        getUniqueDist();
                    
//#line 127
final Region1 RX10_TEMP28 =
                      X10_TEMP26.
                        dReg;
                    
//#line 128
final int RX10_TEMP31 =
                      1;
                    
//#line 129
int RX10_TEMP29 =
                      RX10_TEMP28.
                        regSize;
                    
//#line 130
RX10_TEMP29 =
                      RX10_TEMP29 -
                        RX10_TEMP31;
                    
//#line 131
final x10.
                      lang.
                      region RX10_TEMP30 =
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
                          RX10_TEMP29));
                    
//#line 132
/* template:forloop { */
                    for (java.util.Iterator RX10_TEMP27__ = (RX10_TEMP30).iterator(); RX10_TEMP27__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point RX10_TEMP27 = (x10.
                      lang.
                      point) RX10_TEMP27__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 133
final int RX10_TEMP32 =
                          /* template:array_get { */((RX10_TEMP27).get(0))/* } */;
                        
//#line 134
final Point1 p6 =
                          Program.
                            regionOrdinalPoint1(
                            RX10_TEMP28,
                            RX10_TEMP32);
                        
//#line 135
final Region1 RX10_TEMP33 =
                          X10_TEMP26.
                            dReg;
                        
//#line 136
final int RX10_TEMP34 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP33,
                            p6);
                        
//#line 137
final int RX10_TEMP35 =
                          0;
                        
//#line 138
final boolean RX10_TEMP36 =
                          RX10_TEMP34 <
                          RX10_TEMP35;
                        
//#line 139
if (RX10_TEMP36) {
                            
//#line 140
final java.
                              lang.
                              String RX10_TEMP37 =
                              "Point p6 not found in the distribution X10_TEMP26.";
                            
//#line 141
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP37);
                        }
                        
//#line 143
final x10.
                          lang.
                          place RX10_TEMP38 =
                          Program.
                            getPlaceFromDist1(
                            X10_TEMP26,
                            RX10_TEMP34);
                        
//#line 144
final x10.
                          lang.
                          place X10_TEMP27 =
                          RX10_TEMP38;
                        
//#line 145
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP27)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 146
final Dist1 RX10_TEMP39 =
                              placeDist.
                                distValue;
                            
//#line 147
final Region1 RX10_TEMP40 =
                              RX10_TEMP39.
                                dReg;
                            
//#line 148
final int RX10_TEMP41 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP40,
                                p6);
                            
//#line 149
final int RX10_TEMP42 =
                              0;
                            
//#line 150
final boolean RX10_TEMP43 =
                              RX10_TEMP41 <
                              RX10_TEMP42;
                            
//#line 151
if (RX10_TEMP43) {
                                
//#line 152
java.
                                  lang.
                                  String RX10_TEMP44 =
                                  "Array access index out of bounds";
                                
//#line 153
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP44);
                            }
                            
//#line 155
final x10.
                              lang.
                              place RX10_TEMP45 =
                              Program.
                                getPlaceFromDist1(
                                RX10_TEMP39,
                                RX10_TEMP41);
                            
//#line 156
final x10.
                              lang.
                              place RX10_TEMP47 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 157
final boolean RX10_TEMP48 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP45,RX10_TEMP47))/* } */;
                            
//#line 158
if (RX10_TEMP48) {
                                
//#line 159
java.
                                  lang.
                                  String RX10_TEMP46 =
                                  "Bad place access for array placeDist";
                                
//#line 160
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP46);
                            }
                            
//#line 162
final Region1 RX10_TEMP49 =
                              Program.
                                getRefArrayValue1Region1(
                                placeDist,
                                RX10_TEMP41);
                            
//#line 163
final Region1 X10_TEMP29 =
                              RX10_TEMP49;
                            
//#line 164
final Region1 tempReg =
                              X10_TEMP29;
                            
//#line 165
final int RX10_TEMP53 =
                              1;
                            
//#line 166
int RX10_TEMP51 =
                              tempReg.
                                regSize;
                            
//#line 167
RX10_TEMP51 =
                              RX10_TEMP51 -
                                RX10_TEMP53;
                            
//#line 168
final x10.
                              lang.
                              region RX10_TEMP52 =
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
                                  RX10_TEMP51));
                            
//#line 169
/* template:forloop { */
                            for (java.util.Iterator RX10_TEMP50__ = (RX10_TEMP52).iterator(); RX10_TEMP50__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point RX10_TEMP50 = (x10.
                              lang.
                              point) RX10_TEMP50__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 170
final int RX10_TEMP54 =
                                  /* template:array_get { */((RX10_TEMP50).get(0))/* } */;
                                
//#line 171
final Point1 i =
                                  Program.
                                    regionOrdinalPoint1(
                                    tempReg,
                                    RX10_TEMP54);
                                
//#line 172
final doubleRefArray1 X10_TEMP32 =
                                  tempSd.
                                    b;
                                
//#line 173
final double X10_TEMP41 =
                                  (1.5);
                                
//#line 174
final x10.
                                  lang.
                                  place X10_TEMP34 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 175
final int X10_TEMP35 =
                                  (X10_TEMP34.
                                     id);
                                
//#line 176
final int X10_TEMP37 =
                                  (X10_TEMP35 *
                                     _Stream_LocalSize);
                                
//#line 177
final int X10_TEMP38 =
                                  (i.
                                     f0);
                                
//#line 178
final int X10_TEMP40 =
                                  (X10_TEMP37 +
                                     X10_TEMP38);
                                
//#line 179
final double X10_TEMP44 =
                                  (X10_TEMP41 *
                                     X10_TEMP40);
                                
//#line 180
final double X10_TEMP45 =
                                  (X10_TEMP44);
                                
//#line 181
final Dist1 RX10_TEMP55 =
                                  X10_TEMP32.
                                    distValue;
                                
//#line 182
final Region1 RX10_TEMP56 =
                                  RX10_TEMP55.
                                    dReg;
                                
//#line 183
final int RX10_TEMP57 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP56,
                                    i);
                                
//#line 184
final int RX10_TEMP58 =
                                  0;
                                
//#line 185
final boolean RX10_TEMP59 =
                                  RX10_TEMP57 <
                                  RX10_TEMP58;
                                
//#line 186
if (RX10_TEMP59) {
                                    
//#line 187
java.
                                      lang.
                                      String RX10_TEMP60 =
                                      "Array index out of bounds";
                                    
//#line 188
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP60);
                                }
                                
//#line 190
final x10.
                                  lang.
                                  place RX10_TEMP61 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP55,
                                    RX10_TEMP57);
                                
//#line 191
final x10.
                                  lang.
                                  place RX10_TEMP63 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 192
final boolean RX10_TEMP64 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP61,RX10_TEMP63))/* } */;
                                
//#line 193
if (RX10_TEMP64) {
                                    
//#line 194
java.
                                      lang.
                                      String RX10_TEMP62 =
                                      "Bad place access for array X10_TEMP32";
                                    
//#line 195
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP62);
                                }
                                
//#line 197
Program.
                                               setRefArrayValue1double(
                                               X10_TEMP32,
                                               RX10_TEMP57,
                                               X10_TEMP45);
                                
//#line 198
final doubleRefArray1 X10_TEMP46 =
                                  tempSd.
                                    c;
                                
//#line 199
final double X10_TEMP55 =
                                  (2.5);
                                
//#line 200
final x10.
                                  lang.
                                  place X10_TEMP48 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 201
final int X10_TEMP49 =
                                  (X10_TEMP48.
                                     id);
                                
//#line 202
final int X10_TEMP51 =
                                  (X10_TEMP49 *
                                     _Stream_LocalSize);
                                
//#line 203
final int X10_TEMP52 =
                                  (i.
                                     f0);
                                
//#line 204
final int X10_TEMP54 =
                                  (X10_TEMP51 +
                                     X10_TEMP52);
                                
//#line 205
final double X10_TEMP58 =
                                  (X10_TEMP55 *
                                     X10_TEMP54);
                                
//#line 206
final double X10_TEMP59 =
                                  (X10_TEMP58);
                                
//#line 207
final Dist1 RX10_TEMP65 =
                                  X10_TEMP46.
                                    distValue;
                                
//#line 208
final Region1 RX10_TEMP66 =
                                  RX10_TEMP65.
                                    dReg;
                                
//#line 209
final int RX10_TEMP67 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP66,
                                    i);
                                
//#line 210
final int RX10_TEMP68 =
                                  0;
                                
//#line 211
final boolean RX10_TEMP69 =
                                  RX10_TEMP67 <
                                  RX10_TEMP68;
                                
//#line 212
if (RX10_TEMP69) {
                                    
//#line 213
java.
                                      lang.
                                      String RX10_TEMP70 =
                                      "Array index out of bounds";
                                    
//#line 214
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP70);
                                }
                                
//#line 216
final x10.
                                  lang.
                                  place RX10_TEMP71 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP65,
                                    RX10_TEMP67);
                                
//#line 217
final x10.
                                  lang.
                                  place RX10_TEMP73 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 218
final boolean RX10_TEMP74 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP71,RX10_TEMP73))/* } */;
                                
//#line 219
if (RX10_TEMP74) {
                                    
//#line 220
java.
                                      lang.
                                      String RX10_TEMP72 =
                                      "Bad place access for array X10_TEMP46";
                                    
//#line 221
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP72);
                                }
                                
//#line 223
Program.
                                               setRefArrayValue1double(
                                               X10_TEMP46,
                                               RX10_TEMP67,
                                               X10_TEMP59);
                            }/* } */
                            }
                            /* } */
                            
                            
//#line 225
final Dist1 X10_TEMP60 =
                              Program.
                                getUniqueDist();
                            
//#line 226
final Region1 RX10_TEMP75 =
                              X10_TEMP60.
                                dReg;
                            
//#line 227
final int RX10_TEMP76 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP75,
                                p6);
                            
//#line 228
final int RX10_TEMP77 =
                              0;
                            
//#line 229
final boolean RX10_TEMP78 =
                              RX10_TEMP76 <
                              RX10_TEMP77;
                            
//#line 230
if (RX10_TEMP78) {
                                
//#line 231
final java.
                                  lang.
                                  String RX10_TEMP79 =
                                  "Point p6 not found in the distribution X10_TEMP60.";
                                
//#line 232
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP79);
                            }
                            
//#line 234
final x10.
                              lang.
                              place RX10_TEMP80 =
                              Program.
                                getPlaceFromDist1(
                                X10_TEMP60,
                                RX10_TEMP76);
                            
//#line 235
final x10.
                              lang.
                              place X10_TEMP62 =
                              (RX10_TEMP80);
                            
//#line 236
final x10.
                              lang.
                              place X10_TEMP63 =
                              (x10.
                                 lang.
                                 place.
                                 FIRST_PLACE);
                            
//#line 237
final boolean X10_TEMP65 =
                              /* template:equalsequals { */x10.lang.Runtime.equalsequals(X10_TEMP62,X10_TEMP63)/* } */;
                            
//#line 238
if (X10_TEMP65) {
                                
//#line 239
final doubleRefArray1 X10_TEMP66 =
                                  tempSd.
                                    times;
                                
//#line 240
final double X10_TEMP68 =
                                  (Program.
                                     Stream_mySecond());
                                
//#line 241
final int X10_TEMP69 =
                                  0;
                                
//#line 242
final double X10_TEMP72 =
                                  (X10_TEMP69 -
                                     X10_TEMP68);
                                
//#line 243
final double X10_TEMP73 =
                                  (X10_TEMP72);
                                
//#line 244
final Dist1 RX10_TEMP81 =
                                  X10_TEMP66.
                                    distValue;
                                
//#line 245
final Region1 RX10_TEMP82 =
                                  RX10_TEMP81.
                                    dReg;
                                
//#line 246
final int RX10_TEMP83 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP82,
                                    p1);
                                
//#line 247
final int RX10_TEMP84 =
                                  0;
                                
//#line 248
final boolean RX10_TEMP85 =
                                  RX10_TEMP83 <
                                  RX10_TEMP84;
                                
//#line 249
if (RX10_TEMP85) {
                                    
//#line 250
java.
                                      lang.
                                      String RX10_TEMP86 =
                                      "Array index out of bounds";
                                    
//#line 251
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP86);
                                }
                                
//#line 253
final x10.
                                  lang.
                                  place RX10_TEMP87 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP81,
                                    RX10_TEMP83);
                                
//#line 254
final x10.
                                  lang.
                                  place RX10_TEMP89 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 255
final boolean RX10_TEMP90 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP87,RX10_TEMP89))/* } */;
                                
//#line 256
if (RX10_TEMP90) {
                                    
//#line 257
java.
                                      lang.
                                      String RX10_TEMP88 =
                                      "Bad place access for array X10_TEMP66";
                                    
//#line 258
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP88);
                                }
                                
//#line 260
Program.
                                               setRefArrayValue1double(
                                               X10_TEMP66,
                                               RX10_TEMP83,
                                               X10_TEMP73);
                            }
                            
//#line 262
final int RX10_TEMP94 =
                              1;
                            
//#line 263
int RX10_TEMP92 =
                              tempReg.
                                regSize;
                            
//#line 264
RX10_TEMP92 =
                              RX10_TEMP92 -
                                RX10_TEMP94;
                            
//#line 265
final x10.
                              lang.
                              region RX10_TEMP93 =
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
                                  RX10_TEMP92));
                            
//#line 266
/* template:forloop { */
                            for (java.util.Iterator RX10_TEMP91__ = (RX10_TEMP93).iterator(); RX10_TEMP91__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point RX10_TEMP91 = (x10.
                              lang.
                              point) RX10_TEMP91__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 267
final int RX10_TEMP95 =
                                  /* template:array_get { */((RX10_TEMP91).get(0))/* } */;
                                
//#line 268
final Point1 p4 =
                                  Program.
                                    regionOrdinalPoint1(
                                    tempReg,
                                    RX10_TEMP95);
                                
//#line 269
final doubleRefArray1 X10_TEMP75 =
                                  tempSd.
                                    a;
                                
//#line 270
final doubleRefArray1 X10_TEMP77 =
                                  tempSd.
                                    b;
                                
//#line 271
final Dist1 RX10_TEMP96 =
                                  X10_TEMP77.
                                    distValue;
                                
//#line 272
final Region1 RX10_TEMP97 =
                                  RX10_TEMP96.
                                    dReg;
                                
//#line 273
final int RX10_TEMP98 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP97,
                                    p4);
                                
//#line 274
final int RX10_TEMP99 =
                                  0;
                                
//#line 275
final boolean RX10_TEMP100 =
                                  RX10_TEMP98 <
                                  RX10_TEMP99;
                                
//#line 276
if (RX10_TEMP100) {
                                    
//#line 277
java.
                                      lang.
                                      String RX10_TEMP101 =
                                      "Array access index out of bounds";
                                    
//#line 278
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP101);
                                }
                                
//#line 280
final x10.
                                  lang.
                                  place RX10_TEMP102 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP96,
                                    RX10_TEMP98);
                                
//#line 281
final x10.
                                  lang.
                                  place RX10_TEMP104 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 282
final boolean RX10_TEMP105 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP102,RX10_TEMP104))/* } */;
                                
//#line 283
if (RX10_TEMP105) {
                                    
//#line 284
java.
                                      lang.
                                      String RX10_TEMP103 =
                                      "Bad place access for array X10_TEMP77";
                                    
//#line 285
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP103);
                                }
                                
//#line 287
final double RX10_TEMP106 =
                                  Program.
                                    getRefArrayValue1double(
                                    X10_TEMP77,
                                    RX10_TEMP98);
                                
//#line 288
final double X10_TEMP82 =
                                  (RX10_TEMP106);
                                
//#line 289
final doubleRefArray1 X10_TEMP79 =
                                  tempSd.
                                    c;
                                
//#line 290
final Dist1 RX10_TEMP107 =
                                  X10_TEMP79.
                                    distValue;
                                
//#line 291
final Region1 RX10_TEMP108 =
                                  RX10_TEMP107.
                                    dReg;
                                
//#line 292
final int RX10_TEMP109 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP108,
                                    p4);
                                
//#line 293
final int RX10_TEMP110 =
                                  0;
                                
//#line 294
final boolean RX10_TEMP111 =
                                  RX10_TEMP109 <
                                  RX10_TEMP110;
                                
//#line 295
if (RX10_TEMP111) {
                                    
//#line 296
java.
                                      lang.
                                      String RX10_TEMP112 =
                                      "Array access index out of bounds";
                                    
//#line 297
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP112);
                                }
                                
//#line 299
final x10.
                                  lang.
                                  place RX10_TEMP113 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP107,
                                    RX10_TEMP109);
                                
//#line 300
final x10.
                                  lang.
                                  place RX10_TEMP115 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 301
final boolean RX10_TEMP116 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP113,RX10_TEMP115))/* } */;
                                
//#line 302
if (RX10_TEMP116) {
                                    
//#line 303
java.
                                      lang.
                                      String RX10_TEMP114 =
                                      "Bad place access for array X10_TEMP79";
                                    
//#line 304
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP114);
                                }
                                
//#line 306
final double RX10_TEMP117 =
                                  Program.
                                    getRefArrayValue1double(
                                    X10_TEMP79,
                                    RX10_TEMP109);
                                
//#line 307
final double X10_TEMP81 =
                                  (RX10_TEMP117);
                                
//#line 308
final double X10_TEMP83 =
                                  (_Stream_alpha *
                                     X10_TEMP81);
                                
//#line 309
final double X10_TEMP86 =
                                  (X10_TEMP82 +
                                     X10_TEMP83);
                                
//#line 310
final double X10_TEMP87 =
                                  (X10_TEMP86);
                                
//#line 311
final Dist1 RX10_TEMP118 =
                                  X10_TEMP75.
                                    distValue;
                                
//#line 312
final Region1 RX10_TEMP119 =
                                  RX10_TEMP118.
                                    dReg;
                                
//#line 313
final int RX10_TEMP120 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP119,
                                    p4);
                                
//#line 314
final int RX10_TEMP121 =
                                  0;
                                
//#line 315
final boolean RX10_TEMP122 =
                                  RX10_TEMP120 <
                                  RX10_TEMP121;
                                
//#line 316
if (RX10_TEMP122) {
                                    
//#line 317
java.
                                      lang.
                                      String RX10_TEMP123 =
                                      "Array index out of bounds";
                                    
//#line 318
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP123);
                                }
                                
//#line 320
final x10.
                                  lang.
                                  place RX10_TEMP124 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP118,
                                    RX10_TEMP120);
                                
//#line 321
final x10.
                                  lang.
                                  place RX10_TEMP126 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 322
final boolean RX10_TEMP127 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP124,RX10_TEMP126))/* } */;
                                
//#line 323
if (RX10_TEMP127) {
                                    
//#line 324
java.
                                      lang.
                                      String RX10_TEMP125 =
                                      "Bad place access for array X10_TEMP75";
                                    
//#line 325
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP125);
                                }
                                
//#line 327
Program.
                                               setRefArrayValue1double(
                                               X10_TEMP75,
                                               RX10_TEMP120,
                                               X10_TEMP87);
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
                	} catch (Throwable tmp2) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp2);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 332
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 333
final Dist1 X10_TEMP89 =
                      Program.
                        getUniqueDist();
                    
//#line 334
final Region1 RX10_TEMP129 =
                      X10_TEMP89.
                        dReg;
                    
//#line 335
final int RX10_TEMP132 =
                      1;
                    
//#line 336
int RX10_TEMP130 =
                      RX10_TEMP129.
                        regSize;
                    
//#line 337
RX10_TEMP130 =
                      RX10_TEMP130 -
                        RX10_TEMP132;
                    
//#line 338
final x10.
                      lang.
                      region RX10_TEMP131 =
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
                          RX10_TEMP130));
                    
//#line 339
/* template:forloop { */
                    for (java.util.Iterator RX10_TEMP128__ = (RX10_TEMP131).iterator(); RX10_TEMP128__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point RX10_TEMP128 = (x10.
                      lang.
                      point) RX10_TEMP128__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 340
final int RX10_TEMP133 =
                          /* template:array_get { */((RX10_TEMP128).get(0))/* } */;
                        
//#line 341
final Point1 p5 =
                          Program.
                            regionOrdinalPoint1(
                            RX10_TEMP129,
                            RX10_TEMP133);
                        
//#line 342
final Region1 RX10_TEMP134 =
                          X10_TEMP89.
                            dReg;
                        
//#line 343
final int RX10_TEMP135 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP134,
                            p5);
                        
//#line 344
final int RX10_TEMP136 =
                          0;
                        
//#line 345
final boolean RX10_TEMP137 =
                          RX10_TEMP135 <
                          RX10_TEMP136;
                        
//#line 346
if (RX10_TEMP137) {
                            
//#line 347
final java.
                              lang.
                              String RX10_TEMP138 =
                              "Point p5 not found in the distribution X10_TEMP89.";
                            
//#line 348
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP138);
                        }
                        
//#line 350
final x10.
                          lang.
                          place RX10_TEMP139 =
                          Program.
                            getPlaceFromDist1(
                            X10_TEMP89,
                            RX10_TEMP135);
                        
//#line 351
final x10.
                          lang.
                          place X10_TEMP90 =
                          RX10_TEMP139;
                        
//#line 352
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP90)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 353
final Dist1 X10_TEMP91 =
                              Program.
                                getUniqueDist();
                            
//#line 354
final Region1 RX10_TEMP140 =
                              X10_TEMP91.
                                dReg;
                            
//#line 355
final int RX10_TEMP141 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP140,
                                p5);
                            
//#line 356
final int RX10_TEMP142 =
                              0;
                            
//#line 357
final boolean RX10_TEMP143 =
                              RX10_TEMP141 <
                              RX10_TEMP142;
                            
//#line 358
if (RX10_TEMP143) {
                                
//#line 359
final java.
                                  lang.
                                  String RX10_TEMP144 =
                                  "Point p5 not found in the distribution X10_TEMP91.";
                                
//#line 360
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP144);
                            }
                            
//#line 362
final x10.
                              lang.
                              place RX10_TEMP145 =
                              Program.
                                getPlaceFromDist1(
                                X10_TEMP91,
                                RX10_TEMP141);
                            
//#line 363
final x10.
                              lang.
                              place X10_TEMP93 =
                              (RX10_TEMP145);
                            
//#line 364
final x10.
                              lang.
                              place X10_TEMP94 =
                              (x10.
                                 lang.
                                 place.
                                 FIRST_PLACE);
                            
//#line 365
final boolean X10_TEMP96 =
                              /* template:equalsequals { */x10.lang.Runtime.equalsequals(X10_TEMP93,X10_TEMP94)/* } */;
                            
//#line 366
if (X10_TEMP96) {
                                
//#line 367
final doubleRefArray1 X10_TEMP97 =
                                  tempSd.
                                    times;
                                
//#line 368
final doubleRefArray1 X10_TEMP99 =
                                  tempSd.
                                    times;
                                
//#line 369
final Dist1 RX10_TEMP146 =
                                  X10_TEMP99.
                                    distValue;
                                
//#line 370
final Region1 RX10_TEMP147 =
                                  RX10_TEMP146.
                                    dReg;
                                
//#line 371
final int RX10_TEMP148 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP147,
                                    p1);
                                
//#line 372
final int RX10_TEMP149 =
                                  0;
                                
//#line 373
final boolean RX10_TEMP150 =
                                  RX10_TEMP148 <
                                  RX10_TEMP149;
                                
//#line 374
if (RX10_TEMP150) {
                                    
//#line 375
java.
                                      lang.
                                      String RX10_TEMP151 =
                                      "Array access index out of bounds";
                                    
//#line 376
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP151);
                                }
                                
//#line 378
final x10.
                                  lang.
                                  place RX10_TEMP152 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP146,
                                    RX10_TEMP148);
                                
//#line 379
final x10.
                                  lang.
                                  place RX10_TEMP154 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 380
final boolean RX10_TEMP155 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP152,RX10_TEMP154))/* } */;
                                
//#line 381
if (RX10_TEMP155) {
                                    
//#line 382
java.
                                      lang.
                                      String RX10_TEMP153 =
                                      "Bad place access for array X10_TEMP99";
                                    
//#line 383
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP153);
                                }
                                
//#line 385
final double RX10_TEMP156 =
                                  Program.
                                    getRefArrayValue1double(
                                    X10_TEMP99,
                                    RX10_TEMP148);
                                
//#line 386
final double X10_TEMP101 =
                                  (RX10_TEMP156);
                                
//#line 387
final double X10_TEMP102 =
                                  (Program.
                                     Stream_mySecond());
                                
//#line 388
final double X10_TEMP105 =
                                  (X10_TEMP101 +
                                     X10_TEMP102);
                                
//#line 389
final double X10_TEMP106 =
                                  (X10_TEMP105);
                                
//#line 390
final Dist1 RX10_TEMP157 =
                                  X10_TEMP97.
                                    distValue;
                                
//#line 391
final Region1 RX10_TEMP158 =
                                  RX10_TEMP157.
                                    dReg;
                                
//#line 392
final int RX10_TEMP159 =
                                  Program.
                                    searchPointInRegion1(
                                    RX10_TEMP158,
                                    p1);
                                
//#line 393
final int RX10_TEMP160 =
                                  0;
                                
//#line 394
final boolean RX10_TEMP161 =
                                  RX10_TEMP159 <
                                  RX10_TEMP160;
                                
//#line 395
if (RX10_TEMP161) {
                                    
//#line 396
java.
                                      lang.
                                      String RX10_TEMP162 =
                                      "Array index out of bounds";
                                    
//#line 397
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP162);
                                }
                                
//#line 399
final x10.
                                  lang.
                                  place RX10_TEMP163 =
                                  Program.
                                    getPlaceFromDist1(
                                    RX10_TEMP157,
                                    RX10_TEMP159);
                                
//#line 400
final x10.
                                  lang.
                                  place RX10_TEMP165 =
                                  /* template:here { */x10.lang.Runtime.here()/* } */;
                                
//#line 401
final boolean RX10_TEMP166 =
                                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP163,RX10_TEMP165))/* } */;
                                
//#line 402
if (RX10_TEMP166) {
                                    
//#line 403
java.
                                      lang.
                                      String RX10_TEMP164 =
                                      "Bad place access for array X10_TEMP97";
                                    
//#line 404
throw new java.
                                      lang.
                                      RuntimeException(
                                      RX10_TEMP164);
                                }
                                
//#line 406
Program.
                                               setRefArrayValue1double(
                                               X10_TEMP97,
                                               RX10_TEMP159,
                                               X10_TEMP106);
                            }
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp3) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp3);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            
//#line 412
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 413
final Dist1 X10_TEMP108 =
                  Program.
                    getUniqueDist();
                
//#line 414
final Region1 RX10_TEMP168 =
                  X10_TEMP108.
                    dReg;
                
//#line 415
final int RX10_TEMP171 =
                  1;
                
//#line 416
int RX10_TEMP169 =
                  RX10_TEMP168.
                    regSize;
                
//#line 417
RX10_TEMP169 =
                  RX10_TEMP169 -
                    RX10_TEMP171;
                
//#line 418
final x10.
                  lang.
                  region RX10_TEMP170 =
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
                      RX10_TEMP169));
                
//#line 419
/* template:forloop { */
                for (java.util.Iterator RX10_TEMP167__ = (RX10_TEMP170).iterator(); RX10_TEMP167__.hasNext(); ) {
                	final  x10.
                  lang.
                  point RX10_TEMP167 = (x10.
                  lang.
                  point) RX10_TEMP167__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 420
final int RX10_TEMP172 =
                      /* template:array_get { */((RX10_TEMP167).get(0))/* } */;
                    
//#line 421
final Point1 p2 =
                      Program.
                        regionOrdinalPoint1(
                        RX10_TEMP168,
                        RX10_TEMP172);
                    
//#line 422
final Region1 RX10_TEMP173 =
                      X10_TEMP108.
                        dReg;
                    
//#line 423
final int RX10_TEMP174 =
                      Program.
                        searchPointInRegion1(
                        RX10_TEMP173,
                        p2);
                    
//#line 424
final int RX10_TEMP175 =
                      0;
                    
//#line 425
final boolean RX10_TEMP176 =
                      RX10_TEMP174 <
                      RX10_TEMP175;
                    
//#line 426
if (RX10_TEMP176) {
                        
//#line 427
final java.
                          lang.
                          String RX10_TEMP177 =
                          "Point p2 not found in the distribution X10_TEMP108.";
                        
//#line 428
throw new java.
                          lang.
                          RuntimeException(
                          RX10_TEMP177);
                    }
                    
//#line 430
final x10.
                      lang.
                      place RX10_TEMP178 =
                      Program.
                        getPlaceFromDist1(
                        X10_TEMP108,
                        RX10_TEMP174);
                    
//#line 431
final x10.
                      lang.
                      place X10_TEMP109 =
                      RX10_TEMP178;
                    
//#line 432
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP109)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 433
final Dist1 RX10_TEMP179 =
                          placeDist.
                            distValue;
                        
//#line 434
final Region1 RX10_TEMP180 =
                          RX10_TEMP179.
                            dReg;
                        
//#line 435
final int RX10_TEMP181 =
                          Program.
                            searchPointInRegion1(
                            RX10_TEMP180,
                            p2);
                        
//#line 436
final int RX10_TEMP182 =
                          0;
                        
//#line 437
final boolean RX10_TEMP183 =
                          RX10_TEMP181 <
                          RX10_TEMP182;
                        
//#line 438
if (RX10_TEMP183) {
                            
//#line 439
java.
                              lang.
                              String RX10_TEMP184 =
                              "Array access index out of bounds";
                            
//#line 440
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP184);
                        }
                        
//#line 442
final x10.
                          lang.
                          place RX10_TEMP185 =
                          Program.
                            getPlaceFromDist1(
                            RX10_TEMP179,
                            RX10_TEMP181);
                        
//#line 443
final x10.
                          lang.
                          place RX10_TEMP187 =
                          /* template:here { */x10.lang.Runtime.here()/* } */;
                        
//#line 444
final boolean RX10_TEMP188 =
                          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP185,RX10_TEMP187))/* } */;
                        
//#line 445
if (RX10_TEMP188) {
                            
//#line 446
java.
                              lang.
                              String RX10_TEMP186 =
                              "Bad place access for array placeDist";
                            
//#line 447
throw new java.
                              lang.
                              RuntimeException(
                              RX10_TEMP186);
                        }
                        
//#line 449
final Region1 RX10_TEMP189 =
                          Program.
                            getRefArrayValue1Region1(
                            placeDist,
                            RX10_TEMP181);
                        
//#line 450
final Region1 X10_TEMP111 =
                          RX10_TEMP189;
                        
//#line 451
final Region1 tempReg =
                          X10_TEMP111;
                        
//#line 452
final int RX10_TEMP193 =
                          1;
                        
//#line 453
int RX10_TEMP191 =
                          tempReg.
                            regSize;
                        
//#line 454
RX10_TEMP191 =
                          RX10_TEMP191 -
                            RX10_TEMP193;
                        
//#line 455
final x10.
                          lang.
                          region RX10_TEMP192 =
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
                              RX10_TEMP191));
                        
//#line 456
/* template:forloop { */
                        for (java.util.Iterator RX10_TEMP190__ = (RX10_TEMP192).iterator(); RX10_TEMP190__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point RX10_TEMP190 = (x10.
                          lang.
                          point) RX10_TEMP190__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 457
final int RX10_TEMP194 =
                              /* template:array_get { */((RX10_TEMP190).get(0))/* } */;
                            
//#line 458
final Point1 p3 =
                              Program.
                                regionOrdinalPoint1(
                                tempReg,
                                RX10_TEMP194);
                            
//#line 459
final doubleRefArray1 X10_TEMP114 =
                              tempSd.
                                a;
                            
//#line 460
final Dist1 RX10_TEMP195 =
                              X10_TEMP114.
                                distValue;
                            
//#line 461
final Region1 RX10_TEMP196 =
                              RX10_TEMP195.
                                dReg;
                            
//#line 462
final int RX10_TEMP197 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP196,
                                p3);
                            
//#line 463
final int RX10_TEMP198 =
                              0;
                            
//#line 464
final boolean RX10_TEMP199 =
                              RX10_TEMP197 <
                              RX10_TEMP198;
                            
//#line 465
if (RX10_TEMP199) {
                                
//#line 466
java.
                                  lang.
                                  String RX10_TEMP200 =
                                  "Array access index out of bounds";
                                
//#line 467
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP200);
                            }
                            
//#line 469
final x10.
                              lang.
                              place RX10_TEMP201 =
                              Program.
                                getPlaceFromDist1(
                                RX10_TEMP195,
                                RX10_TEMP197);
                            
//#line 470
final x10.
                              lang.
                              place RX10_TEMP203 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 471
final boolean RX10_TEMP204 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP201,RX10_TEMP203))/* } */;
                            
//#line 472
if (RX10_TEMP204) {
                                
//#line 473
java.
                                  lang.
                                  String RX10_TEMP202 =
                                  "Bad place access for array X10_TEMP114";
                                
//#line 474
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP202);
                            }
                            
//#line 476
final double RX10_TEMP205 =
                              Program.
                                getRefArrayValue1double(
                                X10_TEMP114,
                                RX10_TEMP197);
                            
//#line 477
final double X10_TEMP123 =
                              (RX10_TEMP205);
                            
//#line 478
final doubleRefArray1 X10_TEMP116 =
                              tempSd.
                                b;
                            
//#line 479
final Dist1 RX10_TEMP206 =
                              X10_TEMP116.
                                distValue;
                            
//#line 480
final Region1 RX10_TEMP207 =
                              RX10_TEMP206.
                                dReg;
                            
//#line 481
final int RX10_TEMP208 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP207,
                                p3);
                            
//#line 482
final int RX10_TEMP209 =
                              0;
                            
//#line 483
final boolean RX10_TEMP210 =
                              RX10_TEMP208 <
                              RX10_TEMP209;
                            
//#line 484
if (RX10_TEMP210) {
                                
//#line 485
java.
                                  lang.
                                  String RX10_TEMP211 =
                                  "Array access index out of bounds";
                                
//#line 486
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP211);
                            }
                            
//#line 488
final x10.
                              lang.
                              place RX10_TEMP212 =
                              Program.
                                getPlaceFromDist1(
                                RX10_TEMP206,
                                RX10_TEMP208);
                            
//#line 489
final x10.
                              lang.
                              place RX10_TEMP214 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 490
final boolean RX10_TEMP215 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP212,RX10_TEMP214))/* } */;
                            
//#line 491
if (RX10_TEMP215) {
                                
//#line 492
java.
                                  lang.
                                  String RX10_TEMP213 =
                                  "Bad place access for array X10_TEMP116";
                                
//#line 493
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP213);
                            }
                            
//#line 495
final double RX10_TEMP216 =
                              Program.
                                getRefArrayValue1double(
                                X10_TEMP116,
                                RX10_TEMP208);
                            
//#line 496
final double X10_TEMP121 =
                              (RX10_TEMP216);
                            
//#line 497
final doubleRefArray1 X10_TEMP118 =
                              tempSd.
                                c;
                            
//#line 498
final Dist1 RX10_TEMP217 =
                              X10_TEMP118.
                                distValue;
                            
//#line 499
final Region1 RX10_TEMP218 =
                              RX10_TEMP217.
                                dReg;
                            
//#line 500
final int RX10_TEMP219 =
                              Program.
                                searchPointInRegion1(
                                RX10_TEMP218,
                                p3);
                            
//#line 501
final int RX10_TEMP220 =
                              0;
                            
//#line 502
final boolean RX10_TEMP221 =
                              RX10_TEMP219 <
                              RX10_TEMP220;
                            
//#line 503
if (RX10_TEMP221) {
                                
//#line 504
java.
                                  lang.
                                  String RX10_TEMP222 =
                                  "Array access index out of bounds";
                                
//#line 505
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP222);
                            }
                            
//#line 507
final x10.
                              lang.
                              place RX10_TEMP223 =
                              Program.
                                getPlaceFromDist1(
                                RX10_TEMP217,
                                RX10_TEMP219);
                            
//#line 508
final x10.
                              lang.
                              place RX10_TEMP225 =
                              /* template:here { */x10.lang.Runtime.here()/* } */;
                            
//#line 509
final boolean RX10_TEMP226 =
                              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP223,RX10_TEMP225))/* } */;
                            
//#line 510
if (RX10_TEMP226) {
                                
//#line 511
java.
                                  lang.
                                  String RX10_TEMP224 =
                                  "Bad place access for array X10_TEMP118";
                                
//#line 512
throw new java.
                                  lang.
                                  RuntimeException(
                                  RX10_TEMP224);
                            }
                            
//#line 514
final double RX10_TEMP227 =
                              Program.
                                getRefArrayValue1double(
                                X10_TEMP118,
                                RX10_TEMP219);
                            
//#line 515
final double X10_TEMP120 =
                              (RX10_TEMP227);
                            
//#line 516
final double X10_TEMP122 =
                              (_Stream_alpha *
                                 X10_TEMP120);
                            
//#line 517
final double X10_TEMP124 =
                              (X10_TEMP121 +
                                 X10_TEMP122);
                            
//#line 518
final boolean X10_TEMP126 =
                              X10_TEMP123 !=
                              X10_TEMP124;
                            
//#line 519
if (X10_TEMP126) {
                                
//#line 520
final x10.
                                  lang.
                                  place X10_TEMP128 =
                                  x10.
                                    lang.
                                    place.
                                    FIRST_PLACE;
                                
//#line 521
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP128)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 522
final booleanRefArray1 X10_TEMP129 =
                                      tempSd.
                                        verified;
                                    
//#line 523
final int X10_TEMP131 =
                                      (0);
                                    
//#line 524
final boolean X10_TEMP134 =
                                      (false);
                                    
//#line 525
final boolean X10_TEMP135 =
                                      (X10_TEMP134);
                                    
//#line 526
final Point1 RX10_TEMP228 =
                                      new Point1(
                                      X10_TEMP131);
                                    
//#line 527
final Dist1 RX10_TEMP229 =
                                      X10_TEMP129.
                                        distValue;
                                    
//#line 528
final Region1 RX10_TEMP230 =
                                      RX10_TEMP229.
                                        dReg;
                                    
//#line 529
final int RX10_TEMP231 =
                                      Program.
                                        searchPointInRegion1(
                                        RX10_TEMP230,
                                        RX10_TEMP228);
                                    
//#line 530
final int RX10_TEMP232 =
                                      0;
                                    
//#line 531
final boolean RX10_TEMP233 =
                                      RX10_TEMP231 <
                                      RX10_TEMP232;
                                    
//#line 532
if (RX10_TEMP233) {
                                        
//#line 533
java.
                                          lang.
                                          String RX10_TEMP234 =
                                          "Array index out of bounds";
                                        
//#line 534
throw new java.
                                          lang.
                                          RuntimeException(
                                          RX10_TEMP234);
                                    }
                                    
//#line 536
final x10.
                                      lang.
                                      place RX10_TEMP235 =
                                      Program.
                                        getPlaceFromDist1(
                                        RX10_TEMP229,
                                        RX10_TEMP231);
                                    
//#line 537
final x10.
                                      lang.
                                      place RX10_TEMP237 =
                                      /* template:here { */x10.lang.Runtime.here()/* } */;
                                    
//#line 538
final boolean RX10_TEMP238 =
                                      /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP235,RX10_TEMP237))/* } */;
                                    
//#line 539
if (RX10_TEMP238) {
                                        
//#line 540
java.
                                          lang.
                                          String RX10_TEMP236 =
                                          "Bad place access for array X10_TEMP129";
                                        
//#line 541
throw new java.
                                          lang.
                                          RuntimeException(
                                          RX10_TEMP236);
                                    }
                                    
//#line 543
Program.
                                                   setRefArrayValue1boolean(
                                                   X10_TEMP129,
                                                   RX10_TEMP231,
                                                   X10_TEMP135);
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
            	} catch (Throwable tmp4) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp4);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 551
double mini =
          (10000000L);
        
//#line 552
final int X10_TEMP142 =
          (0);
        
//#line 553
final int X10_TEMP138 =
          (1);
        
//#line 554
final int X10_TEMP140 =
          (_Stream_NUM_TIMES -
             X10_TEMP138);
        
//#line 555
final int X10_TEMP143 =
          ((int)
             X10_TEMP140);
        
//#line 556
Region1 r =
          Program.
            createNewRegion1R(
            X10_TEMP142,
            X10_TEMP143);
        
//#line 557
final int RX10_TEMP242 =
          1;
        
//#line 558
int RX10_TEMP240 =
          r.
            regSize;
        
//#line 559
RX10_TEMP240 =
          RX10_TEMP240 -
            RX10_TEMP242;
        
//#line 560
final x10.
          lang.
          region RX10_TEMP241 =
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
              RX10_TEMP240));
        
//#line 561
/* template:forloop { */
        for (java.util.Iterator RX10_TEMP239__ = (RX10_TEMP241).iterator(); RX10_TEMP239__.hasNext(); ) {
        	final  x10.
          lang.
          point RX10_TEMP239 = (x10.
          lang.
          point) RX10_TEMP239__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 562
final int RX10_TEMP243 =
              /* template:array_get { */((RX10_TEMP239).get(0))/* } */;
            
//#line 563
final Point1 p1 =
              Program.
                regionOrdinalPoint1(
                r,
                RX10_TEMP243);
            
//#line 564
final doubleRefArray1 X10_TEMP146 =
              tempSd.
                times;
            
//#line 565
final Dist1 RX10_TEMP244 =
              X10_TEMP146.
                distValue;
            
//#line 566
final Region1 RX10_TEMP245 =
              RX10_TEMP244.
                dReg;
            
//#line 567
final int RX10_TEMP246 =
              Program.
                searchPointInRegion1(
                RX10_TEMP245,
                p1);
            
//#line 568
final int RX10_TEMP247 =
              0;
            
//#line 569
final boolean RX10_TEMP248 =
              RX10_TEMP246 <
              RX10_TEMP247;
            
//#line 570
if (RX10_TEMP248) {
                
//#line 571
java.
                  lang.
                  String RX10_TEMP249 =
                  "Array access index out of bounds";
                
//#line 572
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP249);
            }
            
//#line 574
final x10.
              lang.
              place RX10_TEMP250 =
              Program.
                getPlaceFromDist1(
                RX10_TEMP244,
                RX10_TEMP246);
            
//#line 575
final x10.
              lang.
              place RX10_TEMP252 =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 576
final boolean RX10_TEMP253 =
              /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP250,RX10_TEMP252))/* } */;
            
//#line 577
if (RX10_TEMP253) {
                
//#line 578
java.
                  lang.
                  String RX10_TEMP251 =
                  "Bad place access for array X10_TEMP146";
                
//#line 579
throw new java.
                  lang.
                  RuntimeException(
                  RX10_TEMP251);
            }
            
//#line 581
final double RX10_TEMP254 =
              Program.
                getRefArrayValue1double(
                X10_TEMP146,
                RX10_TEMP246);
            
//#line 582
final double X10_TEMP148 =
              (RX10_TEMP254);
            
//#line 583
final boolean X10_TEMP150 =
              X10_TEMP148 <
              mini;
            
//#line 584
if (X10_TEMP150) {
                
//#line 585
final doubleRefArray1 X10_TEMP151 =
                  tempSd.
                    times;
                
//#line 586
final Dist1 RX10_TEMP255 =
                  X10_TEMP151.
                    distValue;
                
//#line 587
final Region1 RX10_TEMP256 =
                  RX10_TEMP255.
                    dReg;
                
//#line 588
final int RX10_TEMP257 =
                  Program.
                    searchPointInRegion1(
                    RX10_TEMP256,
                    p1);
                
//#line 589
final int RX10_TEMP258 =
                  0;
                
//#line 590
final boolean RX10_TEMP259 =
                  RX10_TEMP257 <
                  RX10_TEMP258;
                
//#line 591
if (RX10_TEMP259) {
                    
//#line 592
java.
                      lang.
                      String RX10_TEMP260 =
                      "Array access index out of bounds";
                    
//#line 593
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP260);
                }
                
//#line 595
final x10.
                  lang.
                  place RX10_TEMP261 =
                  Program.
                    getPlaceFromDist1(
                    RX10_TEMP255,
                    RX10_TEMP257);
                
//#line 596
final x10.
                  lang.
                  place RX10_TEMP263 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 597
final boolean RX10_TEMP264 =
                  /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP261,RX10_TEMP263))/* } */;
                
//#line 598
if (RX10_TEMP264) {
                    
//#line 599
java.
                      lang.
                      String RX10_TEMP262 =
                      "Bad place access for array X10_TEMP151";
                    
//#line 600
throw new java.
                      lang.
                      RuntimeException(
                      RX10_TEMP262);
                }
                
//#line 602
final double RX10_TEMP265 =
                  Program.
                    getRefArrayValue1double(
                    X10_TEMP151,
                    RX10_TEMP257);
                
//#line 603
final double X10_TEMP154 =
                  (RX10_TEMP265);
                
//#line 604
mini =
                  ((X10_TEMP154));
            }
        }/* } */
        }
        /* } */
        
        
//#line 607
final booleanRefArray1 X10_TEMP157 =
          tempSd.
            verified;
        
//#line 608
final int X10_TEMP159 =
          (0);
        
//#line 609
final Point1 RX10_TEMP266 =
          new Point1(
          X10_TEMP159);
        
//#line 610
final Dist1 RX10_TEMP267 =
          X10_TEMP157.
            distValue;
        
//#line 611
final Region1 RX10_TEMP268 =
          RX10_TEMP267.
            dReg;
        
//#line 612
final int RX10_TEMP269 =
          Program.
            searchPointInRegion1(
            RX10_TEMP268,
            RX10_TEMP266);
        
//#line 613
final int RX10_TEMP270 =
          0;
        
//#line 614
final boolean RX10_TEMP271 =
          RX10_TEMP269 <
          RX10_TEMP270;
        
//#line 615
if (RX10_TEMP271) {
            
//#line 616
java.
              lang.
              String RX10_TEMP272 =
              "Array access index out of bounds";
            
//#line 617
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP272);
        }
        
//#line 619
final x10.
          lang.
          place RX10_TEMP273 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP267,
            RX10_TEMP269);
        
//#line 620
final x10.
          lang.
          place RX10_TEMP275 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 621
final boolean RX10_TEMP276 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP273,RX10_TEMP275))/* } */;
        
//#line 622
if (RX10_TEMP276) {
            
//#line 623
java.
              lang.
              String RX10_TEMP274 =
              "Bad place access for array X10_TEMP157";
            
//#line 624
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP274);
        }
        
//#line 626
final boolean RX10_TEMP277 =
          Program.
            getRefArrayValue1boolean(
            X10_TEMP157,
            RX10_TEMP269);
        
//#line 627
final boolean X10_TEMP161 =
          (RX10_TEMP277);
        
//#line 628
Program.
                       Stream_printStats(
                       _Stream_N,
                       mini,
                       X10_TEMP161);
    }
    
    
//#line 631
public static double
                   Stream_mySecond(
                   ) {
        
//#line 632
final double X10_TEMP1 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 633
final double X10_TEMP2 =
          (1000000.0);
        
//#line 634
final double X10_TEMP3 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 635
final int X10_TEMP4 =
          (1000);
        
//#line 636
final double X10_TEMP6 =
          (X10_TEMP3 /
             X10_TEMP4);
        
//#line 637
final double X10_TEMP7 =
          ((double)
             X10_TEMP6);
        
//#line 638
final double X10_TEMP8 =
          (1.0E-6);
        
//#line 639
final double X10_TEMP10 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 640
final double X10_TEMP12 =
          ((double)
             X10_TEMP10);
        
//#line 641
return X10_TEMP12;
    }
    
    
//#line 644
public static void
                   Stream_printStats(
                   final long N,
                   final double time,
                   final boolean verified) {
        
//#line 645
final java.
          lang.
          String X10_TEMP1 =
          ("Number of places=");
        
//#line 646
final int X10_TEMP2 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 647
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 648
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP4);
        
//#line 649
final int X10_TEMP5 =
          (3);
        
//#line 650
final int X10_TEMP6 =
          (8);
        
//#line 651
final long X10_TEMP7 =
          (X10_TEMP5 *
             X10_TEMP6);
        
//#line 652
final long X10_TEMP8 =
          (X10_TEMP7 *
             N);
        
//#line 653
final long X10_TEMP10 =
          (X10_TEMP8 /
             _Stream_MEG);
        
//#line 654
long size1 =
          (X10_TEMP10);
        
//#line 655
final int X10_TEMP12 =
          (3);
        
//#line 656
final int X10_TEMP13 =
          (8);
        
//#line 657
final long X10_TEMP14 =
          (X10_TEMP12 *
             X10_TEMP13);
        
//#line 658
final long X10_TEMP16 =
          (X10_TEMP14 *
             N);
        
//#line 659
final double X10_TEMP17 =
          (1.0E9);
        
//#line 660
final double X10_TEMP19 =
          (X10_TEMP17 *
             time);
        
//#line 661
double rate =
          (X10_TEMP16 /
             X10_TEMP19);
        
//#line 662
final java.
          lang.
          String X10_TEMP21 =
          ("Size of arrays: ");
        
//#line 663
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP21 +
           size1);
        
//#line 664
final java.
          lang.
          String X10_TEMP23 =
          (" MB (total)");
        
//#line 665
final java.
          lang.
          String X10_TEMP25 =
          (X10_TEMP22 +
           X10_TEMP23);
        
//#line 666
final int X10_TEMP24 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 667
final long X10_TEMP26 =
          (size1 /
             X10_TEMP24);
        
//#line 668
final java.
          lang.
          String X10_TEMP27 =
          (X10_TEMP25 +
           X10_TEMP26);
        
//#line 669
final java.
          lang.
          String X10_TEMP28 =
          (" MB (per place)");
        
//#line 670
final java.
          lang.
          String X10_TEMP30 =
          (X10_TEMP27 +
           X10_TEMP28);
        
//#line 671
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP30);
        
//#line 672
final java.
          lang.
          String X10_TEMP31 =
          ("Min time: ");
        
//#line 673
final java.
          lang.
          String X10_TEMP32 =
          (X10_TEMP31 +
           time);
        
//#line 674
final java.
          lang.
          String X10_TEMP33 =
          (" rate=");
        
//#line 675
final java.
          lang.
          String X10_TEMP34 =
          (X10_TEMP32 +
           X10_TEMP33);
        
//#line 676
final java.
          lang.
          String X10_TEMP35 =
          (X10_TEMP34 +
           rate);
        
//#line 677
final java.
          lang.
          String X10_TEMP36 =
          (" GB/s");
        
//#line 678
final java.
          lang.
          String X10_TEMP38 =
          (X10_TEMP35 +
           X10_TEMP36);
        
//#line 679
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP38);
        
//#line 680
final java.
          lang.
          String X10_TEMP45 =
          ("Result is ");
        
//#line 681
final boolean X10_TEMP39 =
          verified;
        
//#line 682
java.
          lang.
          String X10_TEMP42 =
          "NOT verified.";
        
//#line 683
if (X10_TEMP39) {
            
//#line 684
X10_TEMP42 =
              "verified.";
        }
        
//#line 686
final java.
          lang.
          String X10_TEMP43 =
          X10_TEMP42;
        
//#line 687
final java.
          lang.
          String X10_TEMP44 =
          (X10_TEMP43);
        
//#line 688
final java.
          lang.
          String X10_TEMP47 =
          (X10_TEMP45 +
           X10_TEMP44);
        
//#line 689
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP47);
    }
    
    
//#line 692
public static int
                   _Timer_max_counters_init(
                   ) {
        
//#line 693
final int X10_TEMP2 =
          (64);
        
//#line 694
return X10_TEMP2;
    }
    
    
//#line 697
public static void
                   Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 698
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 699
final double X10_TEMP5 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 700
final double X10_TEMP6 =
          (X10_TEMP5);
        
//#line 701
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 702
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 703
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 704
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 705
final int RX10_TEMP4 =
          0;
        
//#line 706
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 707
if (RX10_TEMP5) {
            
//#line 708
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 709
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 711
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 712
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 713
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 714
if (RX10_TEMP10) {
            
//#line 715
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 716
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 718
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP3,
                       X10_TEMP6);
    }
    
    
//#line 721
public static void
                   Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 722
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 723
final double X10_TEMP5 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 724
final doubleRefArray1 X10_TEMP3 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 725
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 726
final Dist1 RX10_TEMP1 =
          X10_TEMP3.
            distValue;
        
//#line 727
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 728
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 729
final int RX10_TEMP4 =
          0;
        
//#line 730
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 731
if (RX10_TEMP5) {
            
//#line 732
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 733
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 735
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 736
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 737
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 738
if (RX10_TEMP10) {
            
//#line 739
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP3";
            
//#line 740
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 742
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP3,
            RX10_TEMP3);
        
//#line 743
final double X10_TEMP6 =
          (RX10_TEMP11);
        
//#line 744
final double X10_TEMP9 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 745
final double X10_TEMP10 =
          (X10_TEMP9);
        
//#line 746
final Point1 RX10_TEMP12 =
          new Point1(
          n);
        
//#line 747
final Dist1 RX10_TEMP13 =
          X10_TEMP1.
            distValue;
        
//#line 748
final Region1 RX10_TEMP14 =
          RX10_TEMP13.
            dReg;
        
//#line 749
final int RX10_TEMP15 =
          Program.
            searchPointInRegion1(
            RX10_TEMP14,
            RX10_TEMP12);
        
//#line 750
final int RX10_TEMP16 =
          0;
        
//#line 751
final boolean RX10_TEMP17 =
          RX10_TEMP15 <
          RX10_TEMP16;
        
//#line 752
if (RX10_TEMP17) {
            
//#line 753
java.
              lang.
              String RX10_TEMP18 =
              "Array index out of bounds";
            
//#line 754
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP18);
        }
        
//#line 756
final x10.
          lang.
          place RX10_TEMP19 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP13,
            RX10_TEMP15);
        
//#line 757
final x10.
          lang.
          place RX10_TEMP21 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 758
final boolean RX10_TEMP22 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP19,RX10_TEMP21))/* } */;
        
//#line 759
if (RX10_TEMP22) {
            
//#line 760
java.
              lang.
              String RX10_TEMP20 =
              "Bad place access for array X10_TEMP1";
            
//#line 761
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP20);
        }
        
//#line 763
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP15,
                       X10_TEMP10);
        
//#line 764
final doubleRefArray1 X10_TEMP11 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 765
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 766
final Point1 RX10_TEMP23 =
          new Point1(
          n);
        
//#line 767
final Dist1 RX10_TEMP24 =
          X10_TEMP13.
            distValue;
        
//#line 768
final Region1 RX10_TEMP25 =
          RX10_TEMP24.
            dReg;
        
//#line 769
final int RX10_TEMP26 =
          Program.
            searchPointInRegion1(
            RX10_TEMP25,
            RX10_TEMP23);
        
//#line 770
final int RX10_TEMP27 =
          0;
        
//#line 771
final boolean RX10_TEMP28 =
          RX10_TEMP26 <
          RX10_TEMP27;
        
//#line 772
if (RX10_TEMP28) {
            
//#line 773
java.
              lang.
              String RX10_TEMP29 =
              "Array access index out of bounds";
            
//#line 774
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP29);
        }
        
//#line 776
final x10.
          lang.
          place RX10_TEMP30 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP24,
            RX10_TEMP26);
        
//#line 777
final x10.
          lang.
          place RX10_TEMP32 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 778
final boolean RX10_TEMP33 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP30,RX10_TEMP32))/* } */;
        
//#line 779
if (RX10_TEMP33) {
            
//#line 780
java.
              lang.
              String RX10_TEMP31 =
              "Bad place access for array X10_TEMP13";
            
//#line 781
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP31);
        }
        
//#line 783
final double RX10_TEMP34 =
          Program.
            getRefArrayValue1double(
            X10_TEMP13,
            RX10_TEMP26);
        
//#line 784
final double X10_TEMP15 =
          (RX10_TEMP34);
        
//#line 785
final int X10_TEMP16 =
          (1000);
        
//#line 786
final double X10_TEMP19 =
          (X10_TEMP15 /
             X10_TEMP16);
        
//#line 787
final double X10_TEMP20 =
          (X10_TEMP19);
        
//#line 788
final Point1 RX10_TEMP35 =
          new Point1(
          n);
        
//#line 789
final Dist1 RX10_TEMP36 =
          X10_TEMP11.
            distValue;
        
//#line 790
final Region1 RX10_TEMP37 =
          RX10_TEMP36.
            dReg;
        
//#line 791
final int RX10_TEMP38 =
          Program.
            searchPointInRegion1(
            RX10_TEMP37,
            RX10_TEMP35);
        
//#line 792
final int RX10_TEMP39 =
          0;
        
//#line 793
final boolean RX10_TEMP40 =
          RX10_TEMP38 <
          RX10_TEMP39;
        
//#line 794
if (RX10_TEMP40) {
            
//#line 795
java.
              lang.
              String RX10_TEMP41 =
              "Array index out of bounds";
            
//#line 796
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP41);
        }
        
//#line 798
final x10.
          lang.
          place RX10_TEMP42 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP36,
            RX10_TEMP38);
        
//#line 799
final x10.
          lang.
          place RX10_TEMP44 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 800
final boolean RX10_TEMP45 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP42,RX10_TEMP44))/* } */;
        
//#line 801
if (RX10_TEMP45) {
            
//#line 802
java.
              lang.
              String RX10_TEMP43 =
              "Bad place access for array X10_TEMP11";
            
//#line 803
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP43);
        }
        
//#line 805
Program.
                       setRefArrayValue1double(
                       X10_TEMP11,
                       RX10_TEMP38,
                       X10_TEMP20);
        
//#line 806
final doubleRefArray1 X10_TEMP21 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 807
final doubleRefArray1 X10_TEMP23 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 808
final Point1 RX10_TEMP46 =
          new Point1(
          n);
        
//#line 809
final Dist1 RX10_TEMP47 =
          X10_TEMP23.
            distValue;
        
//#line 810
final Region1 RX10_TEMP48 =
          RX10_TEMP47.
            dReg;
        
//#line 811
final int RX10_TEMP49 =
          Program.
            searchPointInRegion1(
            RX10_TEMP48,
            RX10_TEMP46);
        
//#line 812
final int RX10_TEMP50 =
          0;
        
//#line 813
final boolean RX10_TEMP51 =
          RX10_TEMP49 <
          RX10_TEMP50;
        
//#line 814
if (RX10_TEMP51) {
            
//#line 815
java.
              lang.
              String RX10_TEMP52 =
              "Array access index out of bounds";
            
//#line 816
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP52);
        }
        
//#line 818
final x10.
          lang.
          place RX10_TEMP53 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP47,
            RX10_TEMP49);
        
//#line 819
final x10.
          lang.
          place RX10_TEMP55 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 820
final boolean RX10_TEMP56 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP53,RX10_TEMP55))/* } */;
        
//#line 821
if (RX10_TEMP56) {
            
//#line 822
java.
              lang.
              String RX10_TEMP54 =
              "Bad place access for array X10_TEMP23";
            
//#line 823
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP54);
        }
        
//#line 825
final double RX10_TEMP57 =
          Program.
            getRefArrayValue1double(
            X10_TEMP23,
            RX10_TEMP49);
        
//#line 826
final double X10_TEMP27 =
          (RX10_TEMP57);
        
//#line 827
final doubleRefArray1 X10_TEMP25 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 828
final Point1 RX10_TEMP58 =
          new Point1(
          n);
        
//#line 829
final Dist1 RX10_TEMP59 =
          X10_TEMP25.
            distValue;
        
//#line 830
final Region1 RX10_TEMP60 =
          RX10_TEMP59.
            dReg;
        
//#line 831
final int RX10_TEMP61 =
          Program.
            searchPointInRegion1(
            RX10_TEMP60,
            RX10_TEMP58);
        
//#line 832
final int RX10_TEMP62 =
          0;
        
//#line 833
final boolean RX10_TEMP63 =
          RX10_TEMP61 <
          RX10_TEMP62;
        
//#line 834
if (RX10_TEMP63) {
            
//#line 835
java.
              lang.
              String RX10_TEMP64 =
              "Array access index out of bounds";
            
//#line 836
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP64);
        }
        
//#line 838
final x10.
          lang.
          place RX10_TEMP65 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP59,
            RX10_TEMP61);
        
//#line 839
final x10.
          lang.
          place RX10_TEMP67 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 840
final boolean RX10_TEMP68 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP65,RX10_TEMP67))/* } */;
        
//#line 841
if (RX10_TEMP68) {
            
//#line 842
java.
              lang.
              String RX10_TEMP66 =
              "Bad place access for array X10_TEMP25";
            
//#line 843
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP66);
        }
        
//#line 845
final double RX10_TEMP69 =
          Program.
            getRefArrayValue1double(
            X10_TEMP25,
            RX10_TEMP61);
        
//#line 846
final double X10_TEMP28 =
          (RX10_TEMP69);
        
//#line 847
final double X10_TEMP31 =
          (X10_TEMP27 +
             X10_TEMP28);
        
//#line 848
final double X10_TEMP32 =
          (X10_TEMP31);
        
//#line 849
final Point1 RX10_TEMP70 =
          new Point1(
          n);
        
//#line 850
final Dist1 RX10_TEMP71 =
          X10_TEMP21.
            distValue;
        
//#line 851
final Region1 RX10_TEMP72 =
          RX10_TEMP71.
            dReg;
        
//#line 852
final int RX10_TEMP73 =
          Program.
            searchPointInRegion1(
            RX10_TEMP72,
            RX10_TEMP70);
        
//#line 853
final int RX10_TEMP74 =
          0;
        
//#line 854
final boolean RX10_TEMP75 =
          RX10_TEMP73 <
          RX10_TEMP74;
        
//#line 855
if (RX10_TEMP75) {
            
//#line 856
java.
              lang.
              String RX10_TEMP76 =
              "Array index out of bounds";
            
//#line 857
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP76);
        }
        
//#line 859
final x10.
          lang.
          place RX10_TEMP77 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP71,
            RX10_TEMP73);
        
//#line 860
final x10.
          lang.
          place RX10_TEMP79 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 861
final boolean RX10_TEMP80 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP77,RX10_TEMP79))/* } */;
        
//#line 862
if (RX10_TEMP80) {
            
//#line 863
java.
              lang.
              String RX10_TEMP78 =
              "Bad place access for array X10_TEMP21";
            
//#line 864
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP78);
        }
        
//#line 866
Program.
                       setRefArrayValue1double(
                       X10_TEMP21,
                       RX10_TEMP73,
                       X10_TEMP32);
    }
    
    
//#line 869
public static double
                   Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 870
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 871
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 872
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 873
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 874
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 875
final int RX10_TEMP4 =
          0;
        
//#line 876
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 877
if (RX10_TEMP5) {
            
//#line 878
java.
              lang.
              String RX10_TEMP6 =
              "Array access index out of bounds";
            
//#line 879
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 881
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 882
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 883
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 884
if (RX10_TEMP10) {
            
//#line 885
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 886
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 888
final double RX10_TEMP11 =
          Program.
            getRefArrayValue1double(
            X10_TEMP1,
            RX10_TEMP3);
        
//#line 889
final double X10_TEMP4 =
          (RX10_TEMP11);
        
//#line 890
return X10_TEMP4;
    }
    
    
//#line 893
public static void
                   Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 894
final doubleRefArray1 X10_TEMP1 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time;
        
//#line 895
final double X10_TEMP5 =
          (0);
        
//#line 896
final double X10_TEMP6 =
          (X10_TEMP5);
        
//#line 897
final Point1 RX10_TEMP0 =
          new Point1(
          n);
        
//#line 898
final Dist1 RX10_TEMP1 =
          X10_TEMP1.
            distValue;
        
//#line 899
final Region1 RX10_TEMP2 =
          RX10_TEMP1.
            dReg;
        
//#line 900
final int RX10_TEMP3 =
          Program.
            searchPointInRegion1(
            RX10_TEMP2,
            RX10_TEMP0);
        
//#line 901
final int RX10_TEMP4 =
          0;
        
//#line 902
final boolean RX10_TEMP5 =
          RX10_TEMP3 <
          RX10_TEMP4;
        
//#line 903
if (RX10_TEMP5) {
            
//#line 904
java.
              lang.
              String RX10_TEMP6 =
              "Array index out of bounds";
            
//#line 905
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP6);
        }
        
//#line 907
final x10.
          lang.
          place RX10_TEMP7 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP1,
            RX10_TEMP3);
        
//#line 908
final x10.
          lang.
          place RX10_TEMP9 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 909
final boolean RX10_TEMP10 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP7,RX10_TEMP9))/* } */;
        
//#line 910
if (RX10_TEMP10) {
            
//#line 911
java.
              lang.
              String RX10_TEMP8 =
              "Bad place access for array X10_TEMP1";
            
//#line 912
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP8);
        }
        
//#line 914
Program.
                       setRefArrayValue1double(
                       X10_TEMP1,
                       RX10_TEMP3,
                       X10_TEMP6);
        
//#line 915
final doubleRefArray1 X10_TEMP7 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time;
        
//#line 916
final double X10_TEMP11 =
          (0);
        
//#line 917
final double X10_TEMP12 =
          (X10_TEMP11);
        
//#line 918
final Point1 RX10_TEMP11 =
          new Point1(
          n);
        
//#line 919
final Dist1 RX10_TEMP12 =
          X10_TEMP7.
            distValue;
        
//#line 920
final Region1 RX10_TEMP13 =
          RX10_TEMP12.
            dReg;
        
//#line 921
final int RX10_TEMP14 =
          Program.
            searchPointInRegion1(
            RX10_TEMP13,
            RX10_TEMP11);
        
//#line 922
final int RX10_TEMP15 =
          0;
        
//#line 923
final boolean RX10_TEMP16 =
          RX10_TEMP14 <
          RX10_TEMP15;
        
//#line 924
if (RX10_TEMP16) {
            
//#line 925
java.
              lang.
              String RX10_TEMP17 =
              "Array index out of bounds";
            
//#line 926
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP17);
        }
        
//#line 928
final x10.
          lang.
          place RX10_TEMP18 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP12,
            RX10_TEMP14);
        
//#line 929
final x10.
          lang.
          place RX10_TEMP20 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 930
final boolean RX10_TEMP21 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP18,RX10_TEMP20))/* } */;
        
//#line 931
if (RX10_TEMP21) {
            
//#line 932
java.
              lang.
              String RX10_TEMP19 =
              "Bad place access for array X10_TEMP7";
            
//#line 933
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP19);
        }
        
//#line 935
Program.
                       setRefArrayValue1double(
                       X10_TEMP7,
                       RX10_TEMP14,
                       X10_TEMP12);
        
//#line 936
final doubleRefArray1 X10_TEMP13 =
          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time;
        
//#line 937
final double X10_TEMP17 =
          (0);
        
//#line 938
final double X10_TEMP18 =
          (X10_TEMP17);
        
//#line 939
final Point1 RX10_TEMP22 =
          new Point1(
          n);
        
//#line 940
final Dist1 RX10_TEMP23 =
          X10_TEMP13.
            distValue;
        
//#line 941
final Region1 RX10_TEMP24 =
          RX10_TEMP23.
            dReg;
        
//#line 942
final int RX10_TEMP25 =
          Program.
            searchPointInRegion1(
            RX10_TEMP24,
            RX10_TEMP22);
        
//#line 943
final int RX10_TEMP26 =
          0;
        
//#line 944
final boolean RX10_TEMP27 =
          RX10_TEMP25 <
          RX10_TEMP26;
        
//#line 945
if (RX10_TEMP27) {
            
//#line 946
java.
              lang.
              String RX10_TEMP28 =
              "Array index out of bounds";
            
//#line 947
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP28);
        }
        
//#line 949
final x10.
          lang.
          place RX10_TEMP29 =
          Program.
            getPlaceFromDist1(
            RX10_TEMP23,
            RX10_TEMP25);
        
//#line 950
final x10.
          lang.
          place RX10_TEMP31 =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 951
final boolean RX10_TEMP32 =
          /* template:notequalsequals { */(!x10.lang.Runtime.equalsequals(RX10_TEMP29,RX10_TEMP31))/* } */;
        
//#line 952
if (RX10_TEMP32) {
            
//#line 953
java.
              lang.
              String RX10_TEMP30 =
              "Bad place access for array X10_TEMP13";
            
//#line 954
throw new java.
              lang.
              RuntimeException(
              RX10_TEMP30);
        }
        
//#line 956
Program.
                       setRefArrayValue1double(
                       X10_TEMP13,
                       RX10_TEMP25,
                       X10_TEMP18);
    }
    
    
//#line 959
public static void
                   Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 960
int i =
          (0);
        
//#line 961
boolean X10_TEMP4 =
          i <
          _Timer_max_counters;
        
//#line 962
while (X10_TEMP4) {
            
//#line 963
Program.
                           Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 964
final int X10_TEMP6 =
              (i);
            
//#line 965
final int X10_TEMP7 =
              1;
            
//#line 966
i =
              i +
                X10_TEMP7;
            
//#line 967
X10_TEMP4 =
              i <
                _Timer_max_counters;
        }
    }
    
    
//#line 971
public static int
                   constantSearchRegion1(
                   final Region1 r,
                   final Point1 target) {
        
//#line 972
final int zero =
          0;
        
//#line 973
final int one =
          1;
        
//#line 975
final int dim0 =
          r.
            dim0;
        
//#line 976
final int low0 =
          r.
            low0;
        
//#line 977
final int high0 =
          low0 +
          dim0;
        
//#line 978
int pt0 =
          target.
            f0;
        
//#line 979
final boolean lbound0 =
          pt0 <
          low0;
        
//#line 980
final boolean hbound0 =
          pt0 >=
          high0;
        
//#line 982
final int dim1 =
          1;
        
//#line 984
boolean outRegion =
          false;
        
//#line 985
outRegion =
          (outRegion ||
             lbound0);
        
//#line 986
outRegion =
          (outRegion ||
             hbound0);
        
//#line 987
if (outRegion) {
            
//#line 988
int notFound =
              0;
            
//#line 989
notFound =
              notFound -
                one;
            
//#line 990
return notFound;
        }
        
//#line 993
final int stride1 =
          1;
        
//#line 994
final int stride0 =
          stride1 *
          dim1;
        
//#line 996
pt0 =
          pt0 -
            low0;
        
//#line 997
final int offset0 =
          stride0 *
          pt0;
        
//#line 999
int found =
          0;
        
//#line 1000
found =
          found +
            offset0;
        
//#line 1001
return found;
    }
    
    
//#line 1004
public static double
                    getRefArrayValue1double(
                    final doubleRefArray1 array,
                    final int index) {
        
//#line 1005
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1006
final int placeIndex =
          pl.
            id;
        
//#line 1007
final Dist1 dArray =
          array.
            distValue;
        
//#line 1008
final Dist dDist =
          dArray.
            dDist;
        
//#line 1009
final x10.
          lang.
          intArray runSum =
          dDist.
            runningSum;
        
//#line 1010
final int localIndex =
          /* template:array_get { */((runSum).get(index))/* } */;
        
//#line 1011
final x10.
          lang.
          GenericReferenceArray contents =
          array.
            contents;
        
//#line 1012
final doubleStub indexStub =
          /* template:parametric { */((doubleStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 1013
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 1014
final double returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 1015
return returnValue;
    }
    
    
//#line 1018
public static Dist1
                    restrictDist1(
                    final Dist1 d,
                    final x10.
                      lang.
                      place p) {
        
//#line 1019
final int zero =
          0;
        
//#line 1020
final int one =
          1;
        
//#line 1021
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1022
final Region1 dReg =
          d.
            dReg;
        
//#line 1023
final Dist dDist =
          d.
            dDist;
        
//#line 1024
final int dim =
          dReg.
            regSize;
        
//#line 1025
final int dimMinusOne =
          dim -
          one;
        
//#line 1026
final x10.
          lang.
          region dRegReg =
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
              dimMinusOne));
        
//#line 1027
final x10.
          lang.
          GenericReferenceArray dArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((dReg.
                pointArray));
        
//#line 1028
final x10.
          lang.
          GenericReferenceArray dPlace =
          (x10.
            lang.
            GenericReferenceArray)
            ((dDist.
                placeArray));
        
//#line 1029
final x10.
          lang.
          intArray dCounts =
          (x10.
            lang.
            intArray)
            ((dDist.
                counts));
        
//#line 1030
final int index =
          p.
            id;
        
//#line 1031
int numPoints =
          /* template:array_get { */((dCounts).get(index))/* } */;
        
//#line 1032
final int rSizeNumPoints =
          numPoints;
        
//#line 1033
final int rSize =
          numPoints -
          one;
        
//#line 1034
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
        
//#line 1035
final x10.
          lang.
          dist tempDist =
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
                rSize)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1036
final x10.
          lang.
          GenericReferenceArray rPlace =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(tempReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1036
return p;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1037
final x10.
          lang.
          IntReferenceArray tempArray =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(tempDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1038
final boolean cond1 =
          numPoints >
          zero;
        
//#line 1039
if (cond1) {
            
//#line 1040
numPoints =
              0;
            
//#line 1041
/* template:forloop { */
            for (java.util.Iterator pt__ = (dRegReg).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1042
final x10.
                  lang.
                  place dP =
                  /* template:parametric { */((x10.
                  lang.
                  place)(/* template:array_get { */((dPlace).get(pt))/* } */))/* } */;
                
//#line 1043
final boolean cond2 =
                  /* template:equalsequals { */x10.lang.Runtime.equalsequals(p,dP)/* } */;
                
//#line 1044
if (cond2) {
                    
//#line 1045
final int i =
                      /* template:array_get { */((pt).get(0))/* } */;
                    
//#line 1046
/* template:array_set { */(tempArray).set((i),numPoints)/* } */;
                    
//#line 1047
numPoints =
                      numPoints +
                        one;
                }
            }/* } */
            }
            /* } */
            
        }
        
//#line 1051
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
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1052
final int idx =
                    /* template:array_get { */((tempArray).get(pt))/* } */;
                  
//#line 1053
final Point1 dpt =
                    /* template:parametric { */((Point1)(/* template:array_get { */((dArray).get(idx))/* } */))/* } */;
                  
//#line 1054
return dpt;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1056
final Region1 dpReg =
          new Region1(
          pointArray);
        
//#line 1057
final Dist dpDist =
          new Dist(
          rPlace,
          rSizeNumPoints);
        
//#line 1058
final Dist1 dpDistn =
          new Dist1(
          dpReg,
          dpDist);
        
//#line 1059
return dpDistn;
    }
    
    
//#line 1062
public static int
                    binarySearchRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 1063
final x10.
          lang.
          GenericReferenceArray pointArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((r.
                pointArray));
        
//#line 1064
int start =
          0;
        
//#line 1065
int end =
          r.
            regSize;
        
//#line 1066
final int zero =
          0;
        
//#line 1067
final int one =
          1;
        
//#line 1068
final int two =
          2;
        
//#line 1069
end =
          end -
            one;
        
//#line 1070
int result =
          zero -
          one;
        
//#line 1071
boolean notDone =
          start <=
          end;
        
//#line 1072
while (notDone) {
            
//#line 1073
int mid =
              start +
              end;
            
//#line 1074
mid =
              mid /
                two;
            
//#line 1075
final Point1 temp =
              /* template:parametric { */((Point1)(/* template:array_get { */((pointArray).get(mid))/* } */))/* } */;
            
//#line 1076
final int pointCompare =
              Program.
                comparePoint1(
                target,
                temp);
            
//#line 1077
final boolean eq =
              pointCompare ==
              zero;
            
//#line 1078
final boolean lt =
              pointCompare ==
              one;
            
//#line 1079
if (eq) {
                
//#line 1080
return mid;
            } else {
                
//#line 1083
if (lt) {
                    
//#line 1084
end =
                      mid -
                        one;
                } else {
                    
//#line 1087
start =
                      mid +
                        one;
                }
            }
            
//#line 1090
notDone =
              start <=
                end;
        }
        
//#line 1092
return result;
    }
    
    
//#line 1095
public static Dist1
                    getBlockDist1(
                    final Region1 r) {
        
//#line 1096
final int rSize =
          r.
            regSize;
        
//#line 1097
final int zero =
          0;
        
//#line 1098
final int one =
          1;
        
//#line 1099
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 1100
final x10.
          lang.
          region dReg =
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
              rSizeMinusOne));
        
//#line 1101
final x10.
          lang.
          dist dDist =
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
                rSizeMinusOne)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1102
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1103
final int N =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1104
final int q =
          rSize %
          N;
        
//#line 1105
final int p =
          rSize /
          N;
        
//#line 1106
int blockSize =
          p +
          one;
        
//#line 1107
int arraySize =
          q *
          blockSize;
        
//#line 1108
int offset =
          0;
        
//#line 1109
x10.
          lang.
          place initPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 1110
Program.
                        getCyclic(
                        placeArray,
                        arraySize,
                        initPlace,
                        blockSize);
        
//#line 1111
int remainingPlaces =
          N -
          q;
        
//#line 1112
final boolean cond =
          remainingPlaces ==
          zero;
        
//#line 1113
if (cond) {
            
//#line 1114
final x10.
              lang.
              GenericReferenceArray vPlaceArray =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dReg.
                                                                                                                               toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                  	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                    lang.
                    point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                      
//#line 1114
final x10.
                        lang.
                        place tempPl =
                        /* template:parametric { */((x10.
                        lang.
                        place)(/* template:array_get { */((placeArray).get(pt))/* } */))/* } */;
                      
//#line 1114
return tempPl;
                  } }
                  }/* } */,true,false,true)/* } */));
            
//#line 1115
final Dist pointDist1 =
              new Dist(
              vPlaceArray,
              rSize);
            
//#line 1116
final Dist1 retDist =
              new Dist1(
              r,
              pointDist1);
            
//#line 1117
return retDist;
        }
        
//#line 1119
offset =
          arraySize;
        
//#line 1120
blockSize =
          p;
        
//#line 1121
arraySize =
          remainingPlaces *
            blockSize;
        
//#line 1122
initPlace =
          x10.
            lang.
            place.
            places(
            q);
        
//#line 1123
int chunk =
          blockSize;
        
//#line 1124
final boolean ifCond =
          blockSize >
          arraySize;
        
//#line 1125
if (ifCond) {
            
//#line 1126
chunk =
              arraySize;
        }
        
//#line 1128
int index =
          offset;
        
//#line 1129
int dSize =
          index +
          chunk;
        
//#line 1130
dSize =
          dSize -
            one;
        
//#line 1131
final int ub0 =
          chunk -
          one;
        
//#line 1132
final x10.
          lang.
          region pointReg0 =
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
              ub0));
        
//#line 1133
/* template:forloop { */
        for (java.util.Iterator pt__ = (pointReg0).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1134
final x10.
              lang.
              point tempPt =
              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.add(x10.
                                                                                                         lang.
                                                                                                         point.
                                                                                                         factory.
                                                                                                         point(
                                                                                                         index));
            
//#line 1135
/* template:array_set { */(placeArray).set((initPlace),tempPt)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1137
index =
          index +
            chunk;
        
//#line 1138
arraySize =
          arraySize -
            chunk;
        
//#line 1139
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 1140
boolean whileCond =
          arraySize !=
          zero;
        
//#line 1141
while (whileCond) {
            
//#line 1142
final boolean tailCond =
              chunk >
              arraySize;
            
//#line 1143
if (tailCond) {
                
//#line 1144
dSize =
                  index +
                    arraySize;
                
//#line 1145
dSize =
                  dSize -
                    one;
                
//#line 1146
final int ub =
                  arraySize -
                  one;
                
//#line 1147
final x10.
                  lang.
                  region pointReg1 =
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
                
//#line 1148
/* template:forloop { */
                for (java.util.Iterator pt__ = (pointReg1).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1149
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.add(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 index));
                    
//#line 1150
/* template:array_set { */(placeArray).set((pl),tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1152
arraySize =
                  0;
            } else {
                
//#line 1155
dSize =
                  index +
                    chunk;
                
//#line 1156
dSize =
                  dSize -
                    one;
                
//#line 1157
final int ub =
                  chunk -
                  one;
                
//#line 1158
final x10.
                  lang.
                  region pointReg1 =
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
                
//#line 1159
/* template:forloop { */
                for (java.util.Iterator pt__ = (pointReg1).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1160
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.add(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 index));
                    
//#line 1161
/* template:array_set { */(placeArray).set((pl),tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1163
index =
                  index +
                    chunk;
                
//#line 1164
arraySize =
                  arraySize -
                    chunk;
            }
            
//#line 1166
pl =
              pl.
                next();
            
//#line 1167
whileCond =
              arraySize !=
                zero;
        }
        
//#line 1169
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1169
final x10.
                    lang.
                    place tempPl =
                    /* template:parametric { */((x10.
                    lang.
                    place)(/* template:array_get { */((placeArray).get(pt))/* } */))/* } */;
                  
//#line 1169
return tempPl;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1170
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 1171
final Dist1 retDist =
          new Dist1(
          r,
          pointDist1);
        
//#line 1172
return retDist;
    }
    
    
//#line 1175
public static boolean
                    getRefArrayValue1boolean(
                    final booleanRefArray1 array,
                    final int index) {
        
//#line 1176
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1177
final int placeIndex =
          pl.
            id;
        
//#line 1178
final Dist1 dArray =
          array.
            distValue;
        
//#line 1179
final Dist dDist =
          dArray.
            dDist;
        
//#line 1180
final x10.
          lang.
          intArray runSum =
          dDist.
            runningSum;
        
//#line 1181
final int localIndex =
          /* template:array_get { */((runSum).get(index))/* } */;
        
//#line 1182
final x10.
          lang.
          GenericReferenceArray contents =
          array.
            contents;
        
//#line 1183
final booleanStub indexStub =
          /* template:parametric { */((booleanStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 1184
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 1185
final boolean returnValue =
          /* template:array_get { */((localArray).get(localIndex))/* } */;
        
//#line 1186
return returnValue;
    }
    
    
//#line 1189
public static void
                    setRefArrayValue1double(
                    final doubleRefArray1 array,
                    final int index,
                    final double val) {
        
//#line 1190
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1191
final int placeIndex =
          pl.
            id;
        
//#line 1192
final Dist1 dArray =
          array.
            distValue;
        
//#line 1193
final Dist dDist =
          dArray.
            dDist;
        
//#line 1194
final x10.
          lang.
          intArray runSum =
          dDist.
            runningSum;
        
//#line 1195
final int localIndex =
          /* template:array_get { */((runSum).get(index))/* } */;
        
//#line 1196
final x10.
          lang.
          GenericReferenceArray contents =
          array.
            contents;
        
//#line 1197
final doubleStub indexStub =
          /* template:parametric { */((doubleStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 1198
final x10.
          lang.
          DoubleReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 1199
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
    }
    
    
//#line 1202
public static Dist1
                    getUniqueDist(
                    ) {
        
//#line 1203
final int one =
          1;
        
//#line 1204
final int zero =
          0;
        
//#line 1205
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1206
final int rSize =
          maxPlaces -
          one;
        
//#line 1207
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
        
//#line 1208
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
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1209
final int i =
                    /* template:array_get { */((p).get(0))/* } */;
                  
//#line 1210
final Point1 pt1 =
                    new Point1(
                    i);
                  
//#line 1211
return pt1;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1213
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(placeRegion.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1214
final int i =
                    /* template:array_get { */((p).get(0))/* } */;
                  
//#line 1215
final x10.
                    lang.
                    place pl1 =
                    x10.
                      lang.
                      place.
                      places(
                      i);
                  
//#line 1216
return pl1;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1218
final Region1 reg =
          new Region1(
          pointArray,
          zero,
          maxPlaces);
        
//#line 1219
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          maxPlaces);
        
//#line 1220
final Dist1 retDist =
          new Dist1(
          reg,
          pointDist1);
        
//#line 1221
return retDist;
    }
    
    
//#line 1224
public static x10.
                    lang.
                    place
                    getPlaceFromDist1(
                    final Dist1 dn,
                    final int index) {
        
//#line 1225
final Dist d =
          dn.
            dDist;
        
//#line 1226
final x10.
          lang.
          GenericReferenceArray placeArray =
          d.
            placeArray;
        
//#line 1227
final x10.
          lang.
          place retPlace =
          /* template:parametric { */((x10.
          lang.
          place)(/* template:array_get { */((placeArray).get(index))/* } */))/* } */;
        
//#line 1228
return retPlace;
    }
    
    
//#line 1231
public static void
                    getCyclic(
                    final x10.
                      lang.
                      GenericReferenceArray placeArray,
                    final int arraySize,
                    final x10.
                      lang.
                      place initPlace,
                    final int blockSize) {
        
//#line 1232
final int zero =
          0;
        
//#line 1233
final int one =
          1;
        
//#line 1234
int N =
          arraySize;
        
//#line 1235
int chunk =
          blockSize;
        
//#line 1236
final boolean ifCond =
          blockSize >
          N;
        
//#line 1237
if (ifCond) {
            
//#line 1238
chunk =
              N;
        }
        
//#line 1240
int index =
          0;
        
//#line 1241
int dSize =
          index +
          chunk;
        
//#line 1242
dSize =
          dSize -
            one;
        
//#line 1243
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
        
//#line 1244
/* template:forloop { */
        for (java.util.Iterator p__ = (pointReg).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1245
/* template:array_set { */(placeArray).set((initPlace),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1247
index =
          index +
            chunk;
        
//#line 1248
N =
          N -
            chunk;
        
//#line 1249
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 1250
boolean whileCond =
          N !=
          zero;
        
//#line 1251
while (whileCond) {
            
//#line 1252
final boolean tailCond =
              chunk >
              N;
            
//#line 1253
if (tailCond) {
                
//#line 1254
dSize =
                  index +
                    N;
                
//#line 1255
dSize =
                  dSize -
                    one;
                
//#line 1256
final int ub =
                  N -
                  one;
                
//#line 1257
final x10.
                  lang.
                  region pointReg1 =
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
                
//#line 1258
/* template:forloop { */
                for (java.util.Iterator p__ = (pointReg1).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1259
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                lang.
                                                                                                                point.
                                                                                                                factory.
                                                                                                                point(
                                                                                                                index));
                    
//#line 1260
/* template:array_set { */(placeArray).set((pl),tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1262
N =
                  0;
            } else {
                
//#line 1265
dSize =
                  index +
                    chunk;
                
//#line 1266
dSize =
                  dSize -
                    one;
                
//#line 1267
final int ub =
                  chunk -
                  one;
                
//#line 1268
final x10.
                  lang.
                  region pointReg1 =
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
                
//#line 1269
/* template:forloop { */
                for (java.util.Iterator p__ = (pointReg1).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1270
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                lang.
                                                                                                                point.
                                                                                                                factory.
                                                                                                                point(
                                                                                                                index));
                    
//#line 1271
/* template:array_set { */(placeArray).set((pl),tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1273
index =
                  index +
                    chunk;
                
//#line 1274
N =
                  N -
                    chunk;
            }
            
//#line 1276
pl =
              pl.
                next();
            
//#line 1277
whileCond =
              N !=
                zero;
        }
    }
    
    
//#line 1281
public static void
                    setRefArrayValue1boolean(
                    final booleanRefArray1 array,
                    final int index,
                    final boolean val) {
        
//#line 1282
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1283
final int placeIndex =
          pl.
            id;
        
//#line 1284
final Dist1 dArray =
          array.
            distValue;
        
//#line 1285
final Dist dDist =
          dArray.
            dDist;
        
//#line 1286
final x10.
          lang.
          intArray runSum =
          dDist.
            runningSum;
        
//#line 1287
final int localIndex =
          /* template:array_get { */((runSum).get(index))/* } */;
        
//#line 1288
final x10.
          lang.
          GenericReferenceArray contents =
          array.
            contents;
        
//#line 1289
final booleanStub indexStub =
          /* template:parametric { */((booleanStub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 1290
final x10.
          lang.
          BooleanReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 1291
/* template:array_set { */(localArray).set((val),localIndex)/* } */;
    }
    
    
//#line 1294
public static Region1
                    getRefArrayValue1Region1(
                    final Region1RefArray1 array,
                    final int index) {
        
//#line 1295
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1296
final int placeIndex =
          pl.
            id;
        
//#line 1297
final Dist1 dArray =
          array.
            distValue;
        
//#line 1298
final Dist dDist =
          dArray.
            dDist;
        
//#line 1299
final x10.
          lang.
          intArray runSum =
          dDist.
            runningSum;
        
//#line 1300
final int localIndex =
          /* template:array_get { */((runSum).get(index))/* } */;
        
//#line 1301
final x10.
          lang.
          GenericReferenceArray contents =
          array.
            contents;
        
//#line 1302
final Region1Stub indexStub =
          /* template:parametric { */((Region1Stub)(/* template:array_get { */((contents).get(placeIndex))/* } */))/* } */;
        
//#line 1303
final x10.
          lang.
          GenericReferenceArray localArray =
          indexStub.
            localArray;
        
//#line 1304
final Region1 returnValue =
          /* template:parametric { */((Region1)(/* template:array_get { */((localArray).get(localIndex))/* } */))/* } */;
        
//#line 1305
return returnValue;
    }
    
    
//#line 1308
public static int
                    getDistLocalCount1(
                    final Dist1 dn,
                    final int placeIndex) {
        
//#line 1309
final Dist d =
          dn.
            dDist;
        
//#line 1310
final x10.
          lang.
          intArray counts =
          d.
            counts;
        
//#line 1311
final int localCount =
          /* template:array_get { */((counts).get(placeIndex))/* } */;
        
//#line 1312
return localCount;
    }
    
    
//#line 1319
public static int
                    comparePoint1(
                    final Point1 pt1,
                    final Point1 pt2) {
        
//#line 1320
final int zero =
          0;
        
//#line 1321
final int one =
          1;
        
//#line 1322
final int two =
          2;
        
//#line 1323
int point1 =
          0;
        
//#line 1324
int point2 =
          0;
        
//#line 1325
boolean lt =
          false;
        
//#line 1326
boolean gt =
          false;
        
//#line 1328
point1 =
          pt1.
            f0;
        
//#line 1329
point2 =
          pt2.
            f0;
        
//#line 1330
lt =
          point1 <
            point2;
        
//#line 1331
gt =
          point1 >
            point2;
        
//#line 1332
if (lt) {
            
//#line 1333
return one;
        }
        
//#line 1335
if (gt) {
            
//#line 1336
return two;
        }
        
//#line 1338
return zero;
    }
    
    
//#line 1341
public static int
                    searchPointInRegion1(
                    final Region1 r,
                    final Point1 target) {
        
//#line 1342
final boolean regType =
          r.
            regType;
        
//#line 1343
if (regType) {
            
//#line 1344
final int constantSearch =
              Program.
                constantSearchRegion1(
                r,
                target);
            
//#line 1345
return constantSearch;
        }
        
//#line 1347
final int binarySearch =
          Program.
            binarySearchRegion1(
            r,
            target);
        
//#line 1348
return binarySearch;
    }
    
    
//#line 1351
public static Point1
                    regionOrdinalPoint1(
                    final Region1 reg,
                    final int ordl) {
        
//#line 1352
final x10.
          lang.
          GenericReferenceArray pointArray =
          reg.
            pointArray;
        
//#line 1353
final Point1 pt =
          /* template:parametric { */((Point1)(/* template:array_get { */((pointArray).get(ordl))/* } */))/* } */;
        
//#line 1354
return pt;
    }
    
    
//#line 1357
public static Dist1
                    getPlaceDist1(
                    final Region1 r,
                    final x10.
                      lang.
                      place p) {
        
//#line 1358
final int rSize =
          r.
            regSize;
        
//#line 1359
final int one =
          1;
        
//#line 1360
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 1361
final x10.
          lang.
          region dReg =
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
              rSizeMinusOne));
        
//#line 1362
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1362
return p;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1363
final Dist pointDist =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 1364
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 1365
return retDist;
    }
    
    
//#line 1368
public static x10.
                    lang.
                    intArray
                    initDist(
                    final x10.
                      lang.
                      IntReferenceArray tempArr,
                    final x10.
                      lang.
                      region tempReg) {
        
//#line 1369
final x10.
          lang.
          intArray vTemp =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(tempReg.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 1370
final int tempInt =
                    /* template:array_get { */((tempArr).get(p))/* } */;
                  
//#line 1371
return tempInt;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1373
return vTemp;
    }
    
    
//#line 1376
public static Region1
                    createNewRegion1R(
                    final int v1_0,
                    final int v1_1) {
        
//#line 1377
final int zero =
          0;
        
//#line 1378
final int one =
          1;
        
//#line 1380
boolean regType =
          true;
        
//#line 1381
final boolean tempBool1 =
          true;
        
//#line 1382
regType =
          regType &&
            tempBool1;
        
//#line 1385
final int l1 =
          v1_1 -
          v1_0;
        
//#line 1386
final int dim1 =
          l1 +
          one;
        
//#line 1388
final int stride1 =
          1;
        
//#line 1389
final int stride0 =
          stride1 *
          dim1;
        
//#line 1391
final int rSize =
          stride0 -
          one;
        
//#line 1392
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
        
//#line 1394
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
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1395
final int p =
                    /* template:array_get { */((pt).get(0))/* } */;
                  
//#line 1396
int f1 =
                    p /
                    stride1;
                  
//#line 1397
f1 =
                    f1 %
                      dim1;
                  
//#line 1398
f1 =
                    f1 +
                      v1_0;
                  
//#line 1400
final Point1 retPoint =
                    new Point1(
                    f1);
                  
//#line 1401
return retPoint;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1403
if (regType) {
            
//#line 1404
final Region1 retRegRegular =
              new Region1(
              ptArray,
              v1_0,
              dim1);
            
//#line 1405
return retRegRegular;
        }
        
//#line 1407
final Region1 retReg =
          new Region1(
          ptArray);
        
//#line 1408
return retReg;
    }
    
    
//#line 6
public Program() {
        
//#line 6
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
    
//#line 1413
final public booleanRefArray1
      verified;
    
//#line 1414
final public Dist1
      D;
    
//#line 1415
final public doubleRefArray1
      times;
    
//#line 1416
final public doubleRefArray1
      a;
    
//#line 1417
final public doubleRefArray1
      b;
    
//#line 1418
final public doubleRefArray1
      c;
    
    
//#line 1421
public StreamData(final long N,
                                    final int NUM_TIMES) {
        
//#line 1421
super();
        
//#line 1422
final int X10_TEMP3 =
          (0);
        
//#line 1423
final int X10_TEMP4 =
          (0);
        
//#line 1424
final Region1 X10_TEMP5 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 1425
final x10.
          lang.
          place X10_TEMP6 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1426
final Dist1 dverified =
          Program.
            getPlaceDist1(
            X10_TEMP5,
            X10_TEMP6);
        
//#line 1427
final booleanRefArray1 X10_TEMP11 =
          this.
            StreamData_initVerified(
            dverified);
        
//#line 1428
verified =
          X10_TEMP11;
        
//#line 1429
final int X10_TEMP17 =
          (0);
        
//#line 1430
final int X10_TEMP13 =
          (1);
        
//#line 1431
final long X10_TEMP15 =
          (N -
             X10_TEMP13);
        
//#line 1432
final int X10_TEMP18 =
          ((int)
             X10_TEMP15);
        
//#line 1433
final Region1 X10_TEMP20 =
          Program.
            createNewRegion1R(
            X10_TEMP17,
            X10_TEMP18);
        
//#line 1434
final Dist1 X10_TEMP21 =
          Program.
            getBlockDist1(
            X10_TEMP20);
        
//#line 1435
final Dist1 temp_D =
          X10_TEMP21;
        
//#line 1436
D =
          temp_D;
        
//#line 1437
final int X10_TEMP30 =
          (0);
        
//#line 1438
final int X10_TEMP26 =
          (1);
        
//#line 1439
final int X10_TEMP28 =
          (NUM_TIMES -
             X10_TEMP26);
        
//#line 1440
final int X10_TEMP31 =
          ((int)
             X10_TEMP28);
        
//#line 1441
final Region1 X10_TEMP32 =
          Program.
            createNewRegion1R(
            X10_TEMP30,
            X10_TEMP31);
        
//#line 1442
final x10.
          lang.
          place X10_TEMP33 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1443
final Dist1 X10_TEMP35 =
          Program.
            getPlaceDist1(
            X10_TEMP32,
            X10_TEMP33);
        
//#line 1444
final doubleRefArray1 X10_TEMP37 =
          this.
            StreamData_initArray(
            X10_TEMP35);
        
//#line 1445
times =
          X10_TEMP37;
        
//#line 1446
final doubleRefArray1 X10_TEMP41 =
          this.
            StreamData_initArray(
            temp_D);
        
//#line 1447
a =
          X10_TEMP41;
        
//#line 1448
final doubleRefArray1 X10_TEMP45 =
          this.
            StreamData_initArray(
            temp_D);
        
//#line 1449
b =
          X10_TEMP45;
        
//#line 1450
final doubleRefArray1 X10_TEMP49 =
          this.
            StreamData_initArray(
            temp_D);
        
//#line 1451
c =
          X10_TEMP49;
    }
    
    
//#line 1456
public booleanRefArray1
                    StreamData_initVerified(
                    final Dist1 d) {
        
//#line 1457
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 1458
final int RX10_TEMP1 =
          0;
        
//#line 1459
final int RX10_TEMP2 =
          1;
        
//#line 1460
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1461
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 1462
final x10.
          lang.
          region RX10_TEMP4 =
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
              RX10_TEMP3));
        
//#line 1463
final x10.
          lang.
          dist RX10_TEMP5 =
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
                RX10_TEMP3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1464
final x10.
          lang.
          GenericReferenceArray RX10_TEMP6 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP5,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1465
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1466
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP7__ = (RX10_TEMP4).iterator(); RX10_TEMP7__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP7 = (x10.
              lang.
              point) RX10_TEMP7__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1467
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1468
final int RX10_TEMP9 =
                  /* template:array_get { */((RX10_TEMP7).get(0))/* } */;
                
//#line 1469
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 1470
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 1471
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 1472
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1473
final x10.
                      lang.
                      dist RX10_TEMP14 =
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
                            RX10_TEMP12)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1474
final x10.
                      lang.
                      BooleanReferenceArray RX10_TEMP15 =
                      (x10.
                        lang.
                        BooleanReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(RX10_TEMP14,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public boolean apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP13/* } */, boolean dummy) { {
                              
//#line 1475
final boolean X10_TEMP2 =
                                (true);
                              
//#line 1476
return X10_TEMP2;
                          } }
                          }/* } */,true,true,false)/* } */));
                    
//#line 1479
final booleanStub RX10_TEMP16 =
                      new booleanStub(
                      RX10_TEMP15);
                    
//#line 1480
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1481
/* template:array_set { */(RX10_TEMP6).set((RX10_TEMP16),RX10_TEMP7)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp5) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp5);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1486
final x10.
          lang.
          GenericReferenceArray RX10_TEMP17 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP4.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP19/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1487
final booleanStub RX10_TEMP18 =
                    /* template:parametric { */((booleanStub)(/* template:array_get { */((RX10_TEMP6).get(RX10_TEMP19))/* } */))/* } */;
                  
//#line 1488
return RX10_TEMP18;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1490
final booleanRefArray1 RX10_TEMP20 =
          new booleanRefArray1(
          d,
          RX10_TEMP17);
        
//#line 1491
final booleanRefArray1 X10_TEMP3 =
          RX10_TEMP20;
        
//#line 1492
return X10_TEMP3;
    }
    
    
//#line 1495
public doubleRefArray1
                    StreamData_initArray(
                    final Dist1 d) {
        
//#line 1496
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 1497
final int RX10_TEMP1 =
          0;
        
//#line 1498
final int RX10_TEMP2 =
          1;
        
//#line 1499
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1500
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 1501
final x10.
          lang.
          region RX10_TEMP4 =
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
              RX10_TEMP3));
        
//#line 1502
final x10.
          lang.
          dist RX10_TEMP5 =
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
                RX10_TEMP3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1503
final x10.
          lang.
          GenericReferenceArray RX10_TEMP6 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP5,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1504
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1505
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP7__ = (RX10_TEMP4).iterator(); RX10_TEMP7__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP7 = (x10.
              lang.
              point) RX10_TEMP7__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1506
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1507
final int RX10_TEMP9 =
                  /* template:array_get { */((RX10_TEMP7).get(0))/* } */;
                
//#line 1508
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 1509
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 1510
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 1511
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1512
final x10.
                      lang.
                      dist RX10_TEMP14 =
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
                            RX10_TEMP12)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1513
final x10.
                      lang.
                      DoubleReferenceArray RX10_TEMP15 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(RX10_TEMP14,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public double apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP13/* } */, double dummy) { {
                              
//#line 1514
final double X10_TEMP2 =
                                (0.0);
                              
//#line 1515
return X10_TEMP2;
                          } }
                          }/* } */,true,true,false)/* } */));
                    
//#line 1518
final doubleStub RX10_TEMP16 =
                      new doubleStub(
                      RX10_TEMP15);
                    
//#line 1519
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1520
/* template:array_set { */(RX10_TEMP6).set((RX10_TEMP16),RX10_TEMP7)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp6) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1525
final x10.
          lang.
          GenericReferenceArray RX10_TEMP17 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP4.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP19/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1526
final doubleStub RX10_TEMP18 =
                    /* template:parametric { */((doubleStub)(/* template:array_get { */((RX10_TEMP6).get(RX10_TEMP19))/* } */))/* } */;
                  
//#line 1527
return RX10_TEMP18;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1529
final doubleRefArray1 RX10_TEMP20 =
          new doubleRefArray1(
          d,
          RX10_TEMP17);
        
//#line 1530
final doubleRefArray1 X10_TEMP3 =
          RX10_TEMP20;
        
//#line 1531
return X10_TEMP3;
    }
}

class Stream
extends x10.
  lang.
  Object
{
    
//#line 1536
final public StreamData
      sd;
    
    
//#line 1539
public Stream() {
        
//#line 1539
super();
        
//#line 1540
long X10_TEMP3 =
          (Program.
             _Stream_N);
        
//#line 1541
int X10_TEMP4 =
          (Program.
             _Stream_NUM_TIMES);
        
//#line 1542
final StreamData X10_TEMP6 =
          (new StreamData(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 1543
sd =
          ((X10_TEMP6));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1550
public doubleRefArray1
      start_time;
    
//#line 1551
public doubleRefArray1
      elapsed_time;
    
//#line 1552
public doubleRefArray1
      total_time;
    
    
//#line 1555
public Timer() {
        
//#line 1555
super();
        
//#line 1556
final int X10_TEMP3 =
          (0);
        
//#line 1557
final int X10_TEMP4 =
          (Program.
             _Timer_max_counters);
        
//#line 1558
final Region1 X10_TEMP5 =
          Program.
            createNewRegion1R(
            X10_TEMP3,
            X10_TEMP4);
        
//#line 1559
final x10.
          lang.
          place X10_TEMP6 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1560
final Dist1 d =
          Program.
            getPlaceDist1(
            X10_TEMP5,
            X10_TEMP6);
        
//#line 1561
final Region1 RX10_TEMP0 =
          d.
            dReg;
        
//#line 1562
final int RX10_TEMP1 =
          0;
        
//#line 1563
final int RX10_TEMP2 =
          1;
        
//#line 1564
int RX10_TEMP3 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1565
RX10_TEMP3 =
          RX10_TEMP3 -
            RX10_TEMP2;
        
//#line 1566
final x10.
          lang.
          region RX10_TEMP4 =
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
              RX10_TEMP3));
        
//#line 1567
final x10.
          lang.
          dist RX10_TEMP5 =
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
                RX10_TEMP3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1568
final x10.
          lang.
          GenericReferenceArray RX10_TEMP6 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP5,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1569
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1570
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP7__ = (RX10_TEMP4).iterator(); RX10_TEMP7__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP7 = (x10.
              lang.
              point) RX10_TEMP7__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1571
final x10.
                  lang.
                  place RX10_TEMP8 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1572
final int RX10_TEMP9 =
                  /* template:array_get { */((RX10_TEMP7).get(0))/* } */;
                
//#line 1573
final x10.
                  lang.
                  place RX10_TEMP10 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP9);
                
//#line 1574
final int RX10_TEMP11 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP9);
                
//#line 1575
final int RX10_TEMP12 =
                  RX10_TEMP11 -
                  RX10_TEMP2;
                
//#line 1576
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1577
final x10.
                      lang.
                      dist RX10_TEMP14 =
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
                            RX10_TEMP12)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1578
final x10.
                      lang.
                      DoubleReferenceArray RX10_TEMP15 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(RX10_TEMP14,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public double apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP13/* } */, double dummy) { {
                              
//#line 1579
final double X10_TEMP9 =
                                (0);
                              
//#line 1580
return X10_TEMP9;
                          } }
                          }/* } */,true,true,false)/* } */));
                    
//#line 1583
final doubleStub RX10_TEMP16 =
                      new doubleStub(
                      RX10_TEMP15);
                    
//#line 1584
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP8)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1585
/* template:array_set { */(RX10_TEMP6).set((RX10_TEMP16),RX10_TEMP7)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp7) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1590
final x10.
          lang.
          GenericReferenceArray RX10_TEMP17 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP4.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP19/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1591
final doubleStub RX10_TEMP18 =
                    /* template:parametric { */((doubleStub)(/* template:array_get { */((RX10_TEMP6).get(RX10_TEMP19))/* } */))/* } */;
                  
//#line 1592
return RX10_TEMP18;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1594
final doubleRefArray1 RX10_TEMP20 =
          new doubleRefArray1(
          d,
          RX10_TEMP17);
        
//#line 1595
final doubleRefArray1 X10_TEMP11 =
          RX10_TEMP20;
        
//#line 1596
start_time =
          X10_TEMP11;
        
//#line 1597
final Region1 RX10_TEMP21 =
          d.
            dReg;
        
//#line 1598
final int RX10_TEMP22 =
          0;
        
//#line 1599
final int RX10_TEMP23 =
          1;
        
//#line 1600
int RX10_TEMP24 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1601
RX10_TEMP24 =
          RX10_TEMP24 -
            RX10_TEMP23;
        
//#line 1602
final x10.
          lang.
          region RX10_TEMP25 =
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
              RX10_TEMP24));
        
//#line 1603
final x10.
          lang.
          dist RX10_TEMP26 =
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
                RX10_TEMP24)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1604
final x10.
          lang.
          GenericReferenceArray RX10_TEMP27 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP26,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1605
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1606
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP28__ = (RX10_TEMP25).iterator(); RX10_TEMP28__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP28 = (x10.
              lang.
              point) RX10_TEMP28__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1607
final x10.
                  lang.
                  place RX10_TEMP29 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1608
final int RX10_TEMP30 =
                  /* template:array_get { */((RX10_TEMP28).get(0))/* } */;
                
//#line 1609
final x10.
                  lang.
                  place RX10_TEMP31 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP30);
                
//#line 1610
final int RX10_TEMP32 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP30);
                
//#line 1611
final int RX10_TEMP33 =
                  RX10_TEMP32 -
                  RX10_TEMP23;
                
//#line 1612
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP31)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1613
final x10.
                      lang.
                      dist RX10_TEMP35 =
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
                            RX10_TEMP33)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1614
final x10.
                      lang.
                      DoubleReferenceArray RX10_TEMP36 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(RX10_TEMP35,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public double apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP34/* } */, double dummy) { {
                              
//#line 1615
final double X10_TEMP13 =
                                (0);
                              
//#line 1616
return X10_TEMP13;
                          } }
                          }/* } */,true,true,false)/* } */));
                    
//#line 1619
final doubleStub RX10_TEMP37 =
                      new doubleStub(
                      RX10_TEMP36);
                    
//#line 1620
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP29)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1621
/* template:array_set { */(RX10_TEMP27).set((RX10_TEMP37),RX10_TEMP28)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp8) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp8);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1626
final x10.
          lang.
          GenericReferenceArray RX10_TEMP38 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP25.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP40/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1627
final doubleStub RX10_TEMP39 =
                    /* template:parametric { */((doubleStub)(/* template:array_get { */((RX10_TEMP27).get(RX10_TEMP40))/* } */))/* } */;
                  
//#line 1628
return RX10_TEMP39;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1630
final doubleRefArray1 RX10_TEMP41 =
          new doubleRefArray1(
          d,
          RX10_TEMP38);
        
//#line 1631
final doubleRefArray1 X10_TEMP15 =
          RX10_TEMP41;
        
//#line 1632
elapsed_time =
          X10_TEMP15;
        
//#line 1633
final Region1 RX10_TEMP42 =
          d.
            dReg;
        
//#line 1634
final int RX10_TEMP43 =
          0;
        
//#line 1635
final int RX10_TEMP44 =
          1;
        
//#line 1636
int RX10_TEMP45 =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1637
RX10_TEMP45 =
          RX10_TEMP45 -
            RX10_TEMP44;
        
//#line 1638
final x10.
          lang.
          region RX10_TEMP46 =
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
              RX10_TEMP45));
        
//#line 1639
final x10.
          lang.
          dist RX10_TEMP47 =
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
                RX10_TEMP45)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1640
final x10.
          lang.
          GenericReferenceArray RX10_TEMP48 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP47,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1641
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1642
/* template:forloop { */
            for (java.util.Iterator RX10_TEMP49__ = (RX10_TEMP46).iterator(); RX10_TEMP49__.hasNext(); ) {
            	final  x10.
              lang.
              point RX10_TEMP49 = (x10.
              lang.
              point) RX10_TEMP49__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1643
final x10.
                  lang.
                  place RX10_TEMP50 =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 1644
final int RX10_TEMP51 =
                  /* template:array_get { */((RX10_TEMP49).get(0))/* } */;
                
//#line 1645
final x10.
                  lang.
                  place RX10_TEMP52 =
                  x10.
                    lang.
                    place.
                    places(
                    RX10_TEMP51);
                
//#line 1646
final int RX10_TEMP53 =
                  Program.
                    getDistLocalCount1(
                    d,
                    RX10_TEMP51);
                
//#line 1647
final int RX10_TEMP54 =
                  RX10_TEMP53 -
                  RX10_TEMP44;
                
//#line 1648
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP52)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1649
final x10.
                      lang.
                      dist RX10_TEMP56 =
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
                            RX10_TEMP54)),
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1650
final x10.
                      lang.
                      DoubleReferenceArray RX10_TEMP57 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(RX10_TEMP56,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public double apply(/* Join: { */x10.
                            lang.
                            point RX10_TEMP55/* } */, double dummy) { {
                              
//#line 1651
final double X10_TEMP17 =
                                (0);
                              
//#line 1652
return X10_TEMP17;
                          } }
                          }/* } */,true,true,false)/* } */));
                    
//#line 1655
final doubleStub RX10_TEMP58 =
                      new doubleStub(
                      RX10_TEMP57);
                    
//#line 1656
/* template:Async { */(x10.lang.Runtime.asPlace(RX10_TEMP50)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1657
/* template:array_set { */(RX10_TEMP48).set((RX10_TEMP58),RX10_TEMP49)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }/* } */
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
        
        
//#line 1662
final x10.
          lang.
          GenericReferenceArray RX10_TEMP59 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(RX10_TEMP46.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point RX10_TEMP61/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1663
final doubleStub RX10_TEMP60 =
                    /* template:parametric { */((doubleStub)(/* template:array_get { */((RX10_TEMP48).get(RX10_TEMP61))/* } */))/* } */;
                  
//#line 1664
return RX10_TEMP60;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 1666
final doubleRefArray1 RX10_TEMP62 =
          new doubleRefArray1(
          d,
          RX10_TEMP59);
        
//#line 1667
final doubleRefArray1 X10_TEMP19 =
          RX10_TEMP62;
        
//#line 1668
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
    
//#line 1675
final public int
      regRank;
    
//#line 1676
final public int
      regSize;
    
//#line 1677
final public boolean
      regType;
    
//#line 1678
final public int
      low0;
    
//#line 1679
final public int
      dim0;
    
//#line 1680
final public x10.
      lang.
      GenericReferenceArray
      pointArray;
    
    
//#line 1683
public Region1(final x10.
                                   lang.
                                   GenericReferenceArray pointArray_) {
        
//#line 1683
super();
        
//#line 1684
final int zero =
          0;
        
//#line 1685
final int one =
          1;
        
//#line 1686
final int minusOne =
          zero -
          one;
        
//#line 1687
regRank =
          1;
        
//#line 1688
regSize =
          pointArray_.
            region.
            size();
        
//#line 1689
pointArray =
          pointArray_;
        
//#line 1690
regType =
          false;
        
//#line 1691
low0 =
          minusOne;
        
//#line 1692
dim0 =
          zero;
    }
    
    
//#line 1694
public Region1(final x10.
                                   lang.
                                   GenericReferenceArray pointArray_,
                                 final int low0_,
                                 final int dim0_) {
        
//#line 1694
super();
        
//#line 1695
regRank =
          1;
        
//#line 1696
regSize =
          pointArray_.
            region.
            size();
        
//#line 1697
pointArray =
          pointArray_;
        
//#line 1698
regType =
          true;
        
//#line 1699
low0 =
          low0_;
        
//#line 1700
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
    
//#line 1706
final public int
      f0;
    
    
//#line 1709
public Point1(final int f0_) {
        
//#line 1709
super();
        
//#line 1710
f0 =
          f0_;
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
    
//#line 1716
final public x10.
      lang.
      DoubleReferenceArray
      localArray;
    
    
//#line 1719
public doubleStub(final x10.
                                      lang.
                                      DoubleReferenceArray localArray_) {
        
//#line 1719
super();
        
//#line 1720
localArray =
          localArray_;
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
    
//#line 1726
final public Region1
      dReg;
    
//#line 1727
final public Dist
      dDist;
    
    
//#line 1730
public Dist1(final Region1 dReg_,
                               final Dist dDist_) {
        
//#line 1730
super();
        
//#line 1731
dReg =
          dReg_;
        
//#line 1732
dDist =
          dDist_;
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
    
//#line 1738
final public x10.
      lang.
      GenericReferenceArray
      placeArray;
    
//#line 1739
final public x10.
      lang.
      intArray
      counts;
    
//#line 1740
final public x10.
      lang.
      intArray
      runningSum;
    
    
//#line 1743
public Dist(final x10.
                                lang.
                                GenericReferenceArray vPlaceArray,
                              final int arraySize) {
        
//#line 1743
super();
        
//#line 1744
final int one =
          1;
        
//#line 1745
final int zero =
          0;
        
//#line 1746
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1747
final int ub =
          maxPlaces -
          one;
        
//#line 1748
final x10.
          lang.
          region countReg =
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
        
//#line 1749
final x10.
          lang.
          dist countDist =
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
        
//#line 1750
final int rSize =
          arraySize -
          one;
        
//#line 1751
final x10.
          lang.
          region arrayReg =
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
        
//#line 1752
final x10.
          lang.
          dist runSumDist =
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
                rSize)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1753
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(countDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1754
final x10.
          lang.
          IntReferenceArray tempRunSum =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1756
/* template:forloop { */
        for (java.util.Iterator p__ = (countReg).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1757
/* template:array_set { */(tempCounts).set((zero),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1760
/* template:forloop { */
        for (java.util.Iterator p__ = (arrayReg).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1761
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((vPlaceArray).get(p))/* } */))/* } */;
            
//#line 1762
final int index =
              pl.
                id;
            
//#line 1763
final int oldVal =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 1764
/* template:array_set { */(tempRunSum).set((oldVal),p)/* } */;
            
//#line 1765
final int oldValPlusOne =
              oldVal +
              one;
            
//#line 1766
/* template:array_set { */(tempCounts).set((oldValPlusOne),index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1769
placeArray =
          vPlaceArray;
        
//#line 1770
counts =
          Program.
            initDist(
            tempCounts,
            countReg);
        
//#line 1771
runningSum =
          Program.
            initDist(
            tempRunSum,
            arrayReg);
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
    
//#line 1777
final public Dist1
      distValue;
    
//#line 1778
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
    
//#line 1781
public doubleRefArray1(final Dist1 distValue_,
                                         final x10.
                                           lang.
                                           GenericReferenceArray contents_) {
        
//#line 1781
super();
        
//#line 1782
distValue =
          distValue_;
        
//#line 1783
contents =
          contents_;
    }
}

class booleanStub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 1789
final public x10.
      lang.
      BooleanReferenceArray
      localArray;
    
    
//#line 1792
public booleanStub(final x10.
                                       lang.
                                       BooleanReferenceArray localArray_) {
        
//#line 1792
super();
        
//#line 1793
localArray =
          localArray_;
    }
}

class Region1RefArray1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 1799
final public Dist1
      distValue;
    
//#line 1800
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
    
//#line 1803
public Region1RefArray1(final Dist1 distValue_,
                                          final x10.
                                            lang.
                                            GenericReferenceArray contents_) {
        
//#line 1803
super();
        
//#line 1804
distValue =
          distValue_;
        
//#line 1805
contents =
          contents_;
    }
}

class Region1Stub
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 1811
final public x10.
      lang.
      GenericReferenceArray
      localArray;
    
    
//#line 1814
public Region1Stub(final x10.
                                       lang.
                                       GenericReferenceArray localArray_) {
        
//#line 1814
super();
        
//#line 1815
localArray =
          localArray_;
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
    
//#line 1821
final public Dist1
      distValue;
    
//#line 1822
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
    
//#line 1825
public booleanRefArray1(final Dist1 distValue_,
                                          final x10.
                                            lang.
                                            GenericReferenceArray contents_) {
        
//#line 1825
super();
        
//#line 1826
distValue =
          distValue_;
        
//#line 1827
contents =
          contents_;
    }
}
