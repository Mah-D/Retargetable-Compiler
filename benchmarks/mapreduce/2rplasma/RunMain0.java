import x10.lang.*;

public class RunMain0
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
Program0.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public RunMain0() {
        
//#line 1
super();
    }
}

class Program0
extends x10.
  lang.
  Object
{
    
//#line 9
final public static x10.
      lang.
      region
      _Program__MR_r =
      Program0.
        _Program__MR_r_init();
    
//#line 10
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 13
public static void
                  runMain(
                  ) {
        
//#line 14
Program0.
                      Program_runMain();
    }
    
    
//#line 16
public static x10.
                  lang.
                  region
                  _Program__MR_r_init(
                  ) {
        
//#line 18
final x10.
          lang.
          region X10_TEMP39 =
          (x10.
            lang.
            region)
            ((Program0.
                Program__MR_r_init()));
        
//#line 19
return X10_TEMP39;
    }
    
    
//#line 21
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 23
final int X10_TEMP39 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 24
return X10_TEMP39;
    }
    
    
//#line 26
public static void
                  Program_runMain(
                  ) {
        
//#line 27
final Timer X10_TEMP39 =
          (new Timer(
             ));
        
//#line 29
Timer tmr =
          (X10_TEMP39);
        
//#line 30
final int X10_TEMP42 =
          (0);
        
//#line 32
int count =
          (X10_TEMP42);
        
//#line 33
Program0.
                      Program_Timer_start(
                      tmr,
                      count);
        
//#line 34
final MR X10_TEMP47 =
          (new MR(
             ));
        
//#line 36
final MR X10_TEMP4 =
          (X10_TEMP47);
        
//#line 37
Program0.
                      Program_MR_run(
                      X10_TEMP4);
        
//#line 38
Program0.
                      Program_Timer_stop(
                      tmr,
                      count);
        
//#line 39
final java.
          lang.
          String X10_TEMP53 =
          ("Wall-clock time for mapreduce: ");
        
//#line 41
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP53);
        
//#line 42
final double X10_TEMP58 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 44
final double X10_TEMP8 =
          (X10_TEMP58);
        
//#line 45
final java.
          lang.
          String X10_TEMP61 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 47
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP61);
        
//#line 48
final java.
          lang.
          String X10_TEMP64 =
          (" secs");
        
//#line 50
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP64);
        
//#line 51
final java.
          lang.
          String X10_TEMP67 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 53
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP67);
        
//#line 54
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 56
public static x10.
                  lang.
                  region
                  Program__MR_r_init(
                  ) {
        
//#line 57
final int X10_TEMP39 =
          (0);
        
//#line 59
final int X10_TEMP3 =
          (X10_TEMP39);
        
//#line 60
final int X10_TEMP42 =
          (300);
        
//#line 62
final int X10_TEMP4 =
          (X10_TEMP42);
        
//#line 63
final x10.
          lang.
          region X10_TEMP47 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP3,
                  X10_TEMP4))));
        
//#line 65
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP47));
        
//#line 66
return X10_TEMP6;
    }
    
    
//#line 68
public static void
                  Program_MR_run(
                  final MR X10_TEMP0) {
        
//#line 69
Program0.
                      Program_MR_map(
                      X10_TEMP0);
        
//#line 70
Program0.
                      Program_MR_reduce(
                      X10_TEMP0);
        
//#line 71
final int X10_TEMP41 =
          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
        
//#line 73
final int X10_TEMP2 =
          (X10_TEMP41);
        
//#line 74
final java.
          lang.
          String X10_TEMP4 =
          ("");
        
//#line 75
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP4 +
           X10_TEMP2);
        
//#line 76
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP3);
    }
    
    
//#line 78
public static void
                  Program_MR_map(
                  final MR X10_TEMP0) {
        
//#line 79
final x10.
          lang.
          IntReferenceArray X10_TEMP39 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 81
final x10.
          lang.
          IntReferenceArray b =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP39));
        
//#line 82
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 83
/* template:forloop { */
            for (java.util.Iterator p__ = (b.
                                             distribution.
                                             region).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 84
final x10.
                  lang.
                  dist X10_TEMP43 =
                  (x10.
                    lang.
                    dist)
                    ((b.
                        distribution));
                
//#line 86
final x10.
                  lang.
                  dist X10_TEMP3 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP43));
                
//#line 87
final x10.
                  lang.
                  place X10_TEMP4 =
                  (X10_TEMP3.
                     get(
                     p));
                
//#line 88
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 89
final int X10_TEMP50 =
                      (/* template:array_get { */((b).get(p))/* } */);
                    
//#line 91
final int X10_TEMP8 =
                      (X10_TEMP50);
                    
//#line 92
final int X10_TEMP55 =
                      (Program0.
                         Program_MR_f(
                         X10_TEMP0,
                         X10_TEMP8));
                    
//#line 94
final int X10_TEMP11 =
                      (X10_TEMP55);
                    
//#line 95
final int X10_TEMP58 =
                      (X10_TEMP11);
                    
//#line 97
final int X10_TEMP12 =
                      (X10_TEMP58);
                    
//#line 98
final int X10_TEMP62 =
                      (X10_TEMP12);
                    
//#line 100
final int X10_TEMP65 =
                      (X10_TEMP62);
                    
//#line 101
/* template:array_set { */(b).set((X10_TEMP65),p)/* } */;
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
        
    }
    
    
//#line 106
public static int
                   Program_MR_f(
                   final MR X10_TEMP0,
                   final int x) {
        
//#line 107
final int X10_TEMP39 =
          (x *
             x);
        
//#line 109
final int X10_TEMP2 =
          (X10_TEMP39);
        
//#line 110
return X10_TEMP2;
    }
    
    
//#line 112
public static void
                   Program_MR_reduce(
                   final MR X10_TEMP0) {
        
//#line 113
final x10.
          lang.
          place X10_TEMP39 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 115
final x10.
          lang.
          place h =
          (X10_TEMP39);
        
//#line 116
final x10.
          lang.
          IntReferenceArray X10_TEMP42 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 118
final x10.
          lang.
          IntReferenceArray X10_TEMP2 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP42));
        
//#line 119
final x10.
          lang.
          region X10_TEMP45 =
          (x10.
            lang.
            region)
            ((X10_TEMP2.
                region));
        
//#line 121
final x10.
          lang.
          region reg =
          (x10.
            lang.
            region)
            ((X10_TEMP45));
        
//#line 122
final x10.
          lang.
          place X10_TEMP48 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 124
final x10.
          lang.
          place X10_TEMP4 =
          (X10_TEMP48);
        
//#line 125
final x10.
          lang.
          dist X10_TEMP51 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                reg,
                X10_TEMP4)));
        
//#line 127
final x10.
          lang.
          dist dis =
          (x10.
            lang.
            dist)
            ((X10_TEMP51));
        
//#line 128
final x10.
          lang.
          IntReferenceArray X10_TEMP54 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 130
final x10.
          lang.
          IntReferenceArray result =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP54));
        
//#line 131
final x10.
          lang.
          IntReferenceArray X10_TEMP57 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 133
final x10.
          lang.
          IntReferenceArray X10_TEMP8 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP57));
        
//#line 134
/* template:forloop { */
        for (java.util.Iterator p__ = (X10_TEMP8.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 135
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 136
final x10.
                  lang.
                  IntReferenceArray X10_TEMP61 =
                  (x10.
                    lang.
                    IntReferenceArray)
                    ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
                
//#line 138
final x10.
                  lang.
                  IntReferenceArray c =
                  (x10.
                    lang.
                    IntReferenceArray)
                    ((X10_TEMP61));
                
//#line 139
final x10.
                  lang.
                  IntReferenceArray X10_TEMP64 =
                  (x10.
                    lang.
                    IntReferenceArray)
                    ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
                
//#line 141
final x10.
                  lang.
                  IntReferenceArray X10_TEMP10 =
                  (x10.
                    lang.
                    IntReferenceArray)
                    ((X10_TEMP64));
                
//#line 142
final x10.
                  lang.
                  dist X10_TEMP67 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP10.
                        distribution));
                
//#line 144
final x10.
                  lang.
                  dist X10_TEMP11 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP67));
                
//#line 145
final x10.
                  lang.
                  place X10_TEMP14 =
                  (X10_TEMP11.
                     get(
                     p));
                
//#line 146
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP14)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 147
final int X10_TEMP74 =
                      (/* template:array_get { */((c).get(p))/* } */);
                    
//#line 149
final int v =
                      (X10_TEMP74);
                    
//#line 150
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 151
final int X10_TEMP78 =
                          (v);
                        
//#line 153
final int X10_TEMP21 =
                          (X10_TEMP78);
                        
//#line 154
final int X10_TEMP82 =
                          (X10_TEMP21);
                        
//#line 156
final int X10_TEMP85 =
                          (X10_TEMP82);
                        
//#line 157
/* template:array_set { */(result).set((X10_TEMP85),p)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp1) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 162
/* template:forloop { */
        for (java.util.Iterator p__ = (result.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 163
final int X10_TEMP88 =
              (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
            
//#line 165
final int X10_TEMP25 =
              (X10_TEMP88);
            
//#line 166
final int X10_TEMP92 =
              (/* template:array_get { */((result).get(p))/* } */);
            
//#line 168
final int X10_TEMP26 =
              (X10_TEMP92);
            
//#line 169
final int X10_TEMP95 =
              (X10_TEMP25 +
                 X10_TEMP26);
            
//#line 171
final int X10_TEMP27 =
              (X10_TEMP95);
            
//#line 172
final int X10_TEMP98 =
              (X10_TEMP27);
            
//#line 174
final int X10_TEMP101 =
              (X10_TEMP98);
            
//#line 175
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total =
              ((X10_TEMP101));
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 178
public static int
                   Program__Timer_max_counters_init(
                   ) {
        
//#line 179
final int X10_TEMP39 =
          (64);
        
//#line 181
final int X10_TEMP2 =
          (X10_TEMP39);
        
//#line 182
return X10_TEMP2;
    }
    
    
//#line 184
public static void
                   Program_Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 185
final x10.
          lang.
          DoubleReferenceArray X10_TEMP39 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 187
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP39));
        
//#line 188
final long X10_TEMP42 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 190
final double X10_TEMP5 =
          (X10_TEMP42);
        
//#line 191
final double X10_TEMP45 =
          (X10_TEMP5);
        
//#line 193
final double X10_TEMP6 =
          (X10_TEMP45);
        
//#line 194
final double X10_TEMP49 =
          (X10_TEMP6);
        
//#line 196
final double X10_TEMP52 =
          (X10_TEMP49);
        
//#line 197
/* template:array_set { */(X10_TEMP1).set((X10_TEMP52),n)/* } */;
    }
    
    
//#line 199
public static void
                   Program_Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 200
final x10.
          lang.
          DoubleReferenceArray X10_TEMP39 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 202
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP39));
        
//#line 203
final long X10_TEMP42 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 205
final double X10_TEMP5 =
          (X10_TEMP42);
        
//#line 206
final x10.
          lang.
          DoubleReferenceArray X10_TEMP45 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 208
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP45));
        
//#line 209
final double X10_TEMP49 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 211
final double X10_TEMP6 =
          (X10_TEMP49);
        
//#line 212
final double X10_TEMP52 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 214
final double X10_TEMP9 =
          (X10_TEMP52);
        
//#line 215
final double X10_TEMP55 =
          (X10_TEMP9);
        
//#line 217
final double X10_TEMP10 =
          (X10_TEMP55);
        
//#line 218
final double X10_TEMP59 =
          (X10_TEMP10);
        
//#line 220
final double X10_TEMP62 =
          (X10_TEMP59);
        
//#line 221
/* template:array_set { */(X10_TEMP1).set((X10_TEMP62),n)/* } */;
        
//#line 222
final x10.
          lang.
          DoubleReferenceArray X10_TEMP64 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 224
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP64));
        
//#line 225
final double X10_TEMP68 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 227
final double X10_TEMP14 =
          (X10_TEMP68);
        
//#line 228
final int X10_TEMP71 =
          (1000);
        
//#line 230
final double X10_TEMP15 =
          (X10_TEMP71);
        
//#line 231
final double X10_TEMP74 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 233
final double X10_TEMP16 =
          (X10_TEMP74);
        
//#line 234
final double X10_TEMP78 =
          (X10_TEMP16);
        
//#line 236
final double X10_TEMP81 =
          (X10_TEMP78);
        
//#line 237
/* template:array_set { */(X10_TEMP11).set((X10_TEMP81),n)/* } */;
        
//#line 238
final x10.
          lang.
          DoubleReferenceArray X10_TEMP83 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 240
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP83));
        
//#line 241
final x10.
          lang.
          DoubleReferenceArray X10_TEMP86 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 243
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP86));
        
//#line 244
final double X10_TEMP90 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 246
final double X10_TEMP22 =
          (X10_TEMP90);
        
//#line 247
final double X10_TEMP94 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 249
final double X10_TEMP23 =
          (X10_TEMP94);
        
//#line 250
final double X10_TEMP97 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 252
final double X10_TEMP24 =
          (X10_TEMP97);
        
//#line 253
final double X10_TEMP101 =
          (X10_TEMP24);
        
//#line 255
final double X10_TEMP104 =
          (X10_TEMP101);
        
//#line 256
/* template:array_set { */(X10_TEMP17).set((X10_TEMP104),n)/* } */;
    }
    
    
//#line 258
public static double
                   Program_Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 259
final x10.
          lang.
          DoubleReferenceArray X10_TEMP39 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 261
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP39));
        
//#line 262
final double X10_TEMP43 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 264
final double X10_TEMP4 =
          (X10_TEMP43);
        
//#line 265
return X10_TEMP4;
    }
    
    
//#line 267
public static void
                   Program_Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 268
final x10.
          lang.
          DoubleReferenceArray X10_TEMP39 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 270
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP39));
        
//#line 271
final int X10_TEMP42 =
          (0);
        
//#line 273
final double X10_TEMP5 =
          (X10_TEMP42);
        
//#line 274
final double X10_TEMP45 =
          (X10_TEMP5);
        
//#line 276
final double X10_TEMP6 =
          (X10_TEMP45);
        
//#line 277
final double X10_TEMP49 =
          (X10_TEMP6);
        
//#line 279
final double X10_TEMP52 =
          (X10_TEMP49);
        
//#line 280
/* template:array_set { */(X10_TEMP1).set((X10_TEMP52),n)/* } */;
        
//#line 281
final x10.
          lang.
          DoubleReferenceArray X10_TEMP54 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 283
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP54));
        
//#line 284
final int X10_TEMP57 =
          (0);
        
//#line 286
final double X10_TEMP11 =
          (X10_TEMP57);
        
//#line 287
final double X10_TEMP60 =
          (X10_TEMP11);
        
//#line 289
final double X10_TEMP12 =
          (X10_TEMP60);
        
//#line 290
final double X10_TEMP64 =
          (X10_TEMP12);
        
//#line 292
final double X10_TEMP67 =
          (X10_TEMP64);
        
//#line 293
/* template:array_set { */(X10_TEMP7).set((X10_TEMP67),n)/* } */;
        
//#line 294
final x10.
          lang.
          DoubleReferenceArray X10_TEMP69 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 296
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP69));
        
//#line 297
final int X10_TEMP72 =
          (0);
        
//#line 299
final double X10_TEMP17 =
          (X10_TEMP72);
        
//#line 300
final double X10_TEMP75 =
          (X10_TEMP17);
        
//#line 302
final double X10_TEMP18 =
          (X10_TEMP75);
        
//#line 303
final double X10_TEMP79 =
          (X10_TEMP18);
        
//#line 305
final double X10_TEMP82 =
          (X10_TEMP79);
        
//#line 306
/* template:array_set { */(X10_TEMP13).set((X10_TEMP82),n)/* } */;
    }
    
    
//#line 308
public static void
                   Program_Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 309
final int X10_TEMP39 =
          (0);
        
//#line 311
int i =
          (X10_TEMP39);
        
//#line 312
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 313
boolean X10_TEMP44 =
          X10_TEMP4;
        
//#line 314
while (X10_TEMP44) {
            
//#line 315
Program0.
                           Program_Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 316
final int X10_TEMP48 =
              (i);
            
//#line 318
final int X10_TEMP6 =
              (X10_TEMP48);
            
//#line 319
final int X10_TEMP7 =
              (1);
            
//#line 320
final int X10_TEMP52 =
              (i +
                 X10_TEMP7);
            
//#line 321
i =
              ((X10_TEMP52));
            
//#line 322
final boolean X10_TEMP54 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 323
X10_TEMP4 =
              ((X10_TEMP54));
            
//#line 324
X10_TEMP44 =
              X10_TEMP4;
        }
    }
    
    
//#line 8
public Program0() {
        
//#line 8
super();
    }
}

class Program
extends x10.
  lang.
  Object
{
    
    
//#line 330
public Program() {
        
//#line 330
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 334
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 335
public int
      total;
    
    
//#line 338
public MR() {
        
//#line 338
super();
        
//#line 339
final x10.
          lang.
          region X10_TEMP39 =
          (x10.
            lang.
            region)
            ((Program0.
                _Program__MR_r));
        
//#line 341
final x10.
          lang.
          region X10_TEMP2 =
          (x10.
            lang.
            region)
            ((X10_TEMP39));
        
//#line 342
final x10.
          lang.
          dist X10_TEMP43 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 342
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 342
return (((((((x10.
                                              lang.
                                              dist)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            1)))
                                         ? (x10.
                                             lang.
                                             dist)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             dist)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 dist)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            (x10.
               lang.
               dist.
               factory.
               block(
               X10_TEMP2)));
        
//#line 344
final x10.
          lang.
          dist X10_TEMP3 =
          (x10.
            lang.
            dist)
            ((X10_TEMP43));
        
//#line 345
final x10.
          lang.
          dist X10_TEMP46 =
          (x10.
            lang.
            dist)
            ((X10_TEMP3));
        
//#line 347
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP46));
        
//#line 348
final x10.
          lang.
          IntReferenceArray X10_TEMP57 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 349
final x10.
                    lang.
                    region X10_TEMP49 =
                    (x10.
                      lang.
                      region)
                      ((d.
                          region));
                  
//#line 351
final x10.
                    lang.
                    region X10_TEMP5 =
                    (x10.
                      lang.
                      region)
                      ((X10_TEMP49));
                  
//#line 352
final int X10_TEMP53 =
                    (X10_TEMP5.
                       ordinal(
                       p));
                  
//#line 354
final int X10_TEMP8 =
                    (X10_TEMP53);
                  
//#line 355
return X10_TEMP8;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 360
final x10.
          lang.
          IntReferenceArray X10_TEMP10 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP57));
        
//#line 361
final x10.
          lang.
          IntReferenceArray X10_TEMP60 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP10));
        
//#line 363
a =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP60));
        
//#line 364
final int X10_TEMP63 =
          (0);
        
//#line 366
final int X10_TEMP12 =
          (X10_TEMP63);
        
//#line 367
final int X10_TEMP66 =
          (X10_TEMP12);
        
//#line 369
total =
          ((X10_TEMP66));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 376
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 377
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 378
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 381
public Timer() {
        
//#line 381
super();
        
//#line 382
final int X10_TEMP39 =
          (0);
        
//#line 384
int i =
          (X10_TEMP39);
        
//#line 385
final int X10_TEMP42 =
          (0);
        
//#line 387
final int X10_TEMP4 =
          (X10_TEMP42);
        
//#line 388
final int X10_TEMP45 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 390
final int X10_TEMP5 =
          (X10_TEMP45);
        
//#line 391
final x10.
          lang.
          region X10_TEMP50 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP4,
                  X10_TEMP5))));
        
//#line 393
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP50));
        
//#line 394
final x10.
          lang.
          place X10_TEMP53 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 396
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP53);
        
//#line 397
final x10.
          lang.
          dist X10_TEMP56 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP6,
                X10_TEMP7)));
        
//#line 399
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP56));
        
//#line 400
final x10.
          lang.
          DoubleReferenceArray X10_TEMP59 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 402
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP59));
        
//#line 403
final x10.
          lang.
          DoubleReferenceArray X10_TEMP62 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 405
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP62));
        
//#line 406
final x10.
          lang.
          DoubleReferenceArray X10_TEMP65 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 408
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP65));
        
//#line 409
final x10.
          lang.
          DoubleReferenceArray X10_TEMP68 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 411
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP68));
        
//#line 412
final x10.
          lang.
          DoubleReferenceArray X10_TEMP71 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 414
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP71));
        
//#line 415
final x10.
          lang.
          DoubleReferenceArray X10_TEMP74 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 417
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP74));
        
//#line 418
final int X10_TEMP77 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 420
final int X10_TEMP15 =
          (X10_TEMP77);
        
//#line 421
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 422
boolean X10_TEMP82 =
          X10_TEMP19;
        
//#line 423
while (X10_TEMP82) {
            
//#line 424
final int X10_TEMP84 =
              (0);
            
//#line 426
final double X10_TEMP23 =
              (X10_TEMP84);
            
//#line 427
final double X10_TEMP87 =
              (X10_TEMP23);
            
//#line 429
final double X10_TEMP24 =
              (X10_TEMP87);
            
//#line 430
final double X10_TEMP91 =
              (X10_TEMP24);
            
//#line 432
final double X10_TEMP94 =
              (X10_TEMP91);
            
//#line 433
/* template:array_set { */(start_time).set((X10_TEMP94),i)/* } */;
            
//#line 434
final int X10_TEMP96 =
              (0);
            
//#line 436
final double X10_TEMP28 =
              (X10_TEMP96);
            
//#line 437
final double X10_TEMP99 =
              (X10_TEMP28);
            
//#line 439
final double X10_TEMP29 =
              (X10_TEMP99);
            
//#line 440
final double X10_TEMP103 =
              (X10_TEMP29);
            
//#line 442
final double X10_TEMP106 =
              (X10_TEMP103);
            
//#line 443
/* template:array_set { */(elapsed_time).set((X10_TEMP106),i)/* } */;
            
//#line 444
final int X10_TEMP108 =
              (0);
            
//#line 446
final double X10_TEMP33 =
              (X10_TEMP108);
            
//#line 447
final double X10_TEMP111 =
              (X10_TEMP33);
            
//#line 449
final double X10_TEMP34 =
              (X10_TEMP111);
            
//#line 450
final double X10_TEMP115 =
              (X10_TEMP34);
            
//#line 452
final double X10_TEMP118 =
              (X10_TEMP115);
            
//#line 453
/* template:array_set { */(total_time).set((X10_TEMP118),i)/* } */;
            
//#line 454
final int X10_TEMP120 =
              (i);
            
//#line 456
final int X10_TEMP35 =
              (X10_TEMP120);
            
//#line 457
final int X10_TEMP36 =
              (1);
            
//#line 458
final int X10_TEMP124 =
              (i +
                 X10_TEMP36);
            
//#line 459
i =
              ((X10_TEMP124));
            
//#line 460
final int X10_TEMP126 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 462
final int X10_TEMP17 =
              (X10_TEMP126);
            
//#line 463
final boolean X10_TEMP129 =
              (i <
                 X10_TEMP17);
            
//#line 464
X10_TEMP19 =
              ((X10_TEMP129));
            
//#line 465
X10_TEMP82 =
              X10_TEMP19;
        }
    }
}
