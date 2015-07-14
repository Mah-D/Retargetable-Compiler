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
final public static int
      _Program__IDEATest_array_rows =
      Program0.
        _Program__IDEATest_array_rows_init();
    
//#line 10
final public static long
      _Program__Random_multiplier =
      Program0.
        _Program__Random_multiplier_init();
    
//#line 11
final public static long
      _Program__Random_addend =
      Program0.
        _Program__Random_addend_init();
    
//#line 12
final public static long
      _Program__Random_mask =
      Program0.
        _Program__Random_mask_init();
    
//#line 13
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 16
public static void
                  runMain(
                  ) {
        
//#line 17
Program0.
                      Program_runMain();
    }
    
    
//#line 19
public static int
                  _Program__IDEATest_array_rows_init(
                  ) {
        
//#line 21
final int X10_TEMP306 =
          (Program0.
             Program__IDEATest_array_rows_init());
        
//#line 22
return X10_TEMP306;
    }
    
    
//#line 24
public static long
                  _Program__Random_multiplier_init(
                  ) {
        
//#line 26
final long X10_TEMP306 =
          (Program0.
             Program__Random_multiplier_init());
        
//#line 27
return X10_TEMP306;
    }
    
    
//#line 29
public static long
                  _Program__Random_addend_init(
                  ) {
        
//#line 31
final long X10_TEMP306 =
          (Program0.
             Program__Random_addend_init());
        
//#line 32
return X10_TEMP306;
    }
    
    
//#line 34
public static long
                  _Program__Random_mask_init(
                  ) {
        
//#line 36
final long X10_TEMP306 =
          (Program0.
             Program__Random_mask_init());
        
//#line 37
return X10_TEMP306;
    }
    
    
//#line 39
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 41
final int X10_TEMP306 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 42
return X10_TEMP306;
    }
    
    
//#line 44
public static int
                  Program__IDEATest_array_rows_init(
                  ) {
        
//#line 45
final int X10_TEMP306 =
          (32000);
        
//#line 47
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 48
return X10_TEMP2;
    }
    
    
//#line 50
public static void
                  Program_IDEATest_run(
                  final IDEATest X10_TEMP0) {
        
//#line 51
Program0.
                      Program_IDEATest_kernel(
                      X10_TEMP0);
        
//#line 52
Program0.
                      Program_IDEATest_validate(
                      X10_TEMP0);
    }
    
    
//#line 54
public static void
                  Program_IDEATest_kernel(
                  final IDEATest X10_TEMP0) {
        
//#line 55
Program0.
                      Program_IDEATest_Do(
                      X10_TEMP0);
    }
    
    
//#line 57
public static void
                  Program_IDEATest_validate(
                  final IDEATest X10_TEMP0) {
        
//#line 58
final x10.
          lang.
          ByteReferenceArray X10_TEMP306 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1));
        
//#line 60
final x10.
          lang.
          ByteReferenceArray p1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP306));
        
//#line 61
final x10.
          lang.
          ByteReferenceArray X10_TEMP309 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.crypt1));
        
//#line 63
final x10.
          lang.
          ByteReferenceArray c1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP309));
        
//#line 64
final x10.
          lang.
          ByteReferenceArray X10_TEMP312 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain2));
        
//#line 66
final x10.
          lang.
          ByteReferenceArray p2 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP312));
        
//#line 67
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 68
final x10.
              lang.
              ByteReferenceArray X10_TEMP315 =
              (x10.
                lang.
                ByteReferenceArray)
                ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1));
            
//#line 70
final x10.
              lang.
              ByteReferenceArray X10_TEMP4 =
              (x10.
                lang.
                ByteReferenceArray)
                ((X10_TEMP315));
            
//#line 71
final x10.
              lang.
              dist X10_TEMP318 =
              (x10.
                lang.
                dist)
                ((X10_TEMP4.
                    distribution));
            
//#line 73
final x10.
              lang.
              dist X10_TEMP6 =
              (x10.
                lang.
                dist)
                ((X10_TEMP318));
            
//#line 74
/* template:forloop { */
            for (java.util.Iterator pt__ = (X10_TEMP6.
                                              region).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 75
final x10.
                  lang.
                  place X10_TEMP7 =
                  (X10_TEMP6.
                     get(
                     pt));
                
//#line 76
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP7)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 77
final byte X10_TEMP326 =
                      (byte)
                        ((/* template:array_get { */((p1).get(pt))/* } */));
                    
//#line 79
final byte X10_TEMP10 =
                      (byte)
                        (((byte)
                            X10_TEMP326));
                    
//#line 80
final byte X10_TEMP330 =
                      (byte)
                        ((/* template:array_get { */((p2).get(pt))/* } */));
                    
//#line 82
final byte X10_TEMP11 =
                      (byte)
                        (((byte)
                            X10_TEMP330));
                    
//#line 83
final boolean X10_TEMP13 =
                      (X10_TEMP10 !=
                         X10_TEMP11);
                    
//#line 84
if (X10_TEMP13) {
                        
//#line 85
final java.
                          lang.
                          String X10_TEMP335 =
                          ("Validation failed");
                        
//#line 87
final java.
                          lang.
                          String X10_TEMP15 =
                          (X10_TEMP335);
                        
//#line 88
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                    lang.
                                                                                                                    System.
                                                                                                                    out))/* } */.println(X10_TEMP15);
                        
//#line 89
final java.
                          lang.
                          String X10_TEMP339 =
                          ("Original Byte ");
                        
//#line 91
final java.
                          lang.
                          String X10_TEMP16 =
                          (X10_TEMP339);
                        
//#line 92
final java.
                          lang.
                          String X10_TEMP342 =
                          (X10_TEMP16 +
                           pt);
                        
//#line 94
final java.
                          lang.
                          String X10_TEMP17 =
                          (X10_TEMP342);
                        
//#line 95
final java.
                          lang.
                          String X10_TEMP345 =
                          (" = ");
                        
//#line 97
final java.
                          lang.
                          String X10_TEMP18 =
                          (X10_TEMP345);
                        
//#line 98
final java.
                          lang.
                          String X10_TEMP348 =
                          (X10_TEMP17 +
                           X10_TEMP18);
                        
//#line 100
final java.
                          lang.
                          String X10_TEMP20 =
                          (X10_TEMP348);
                        
//#line 101
final byte X10_TEMP352 =
                          (byte)
                            ((/* template:array_get { */((p1).get(pt))/* } */));
                        
//#line 103
final byte X10_TEMP21 =
                          (byte)
                            (((byte)
                                X10_TEMP352));
                        
//#line 104
final java.
                          lang.
                          String X10_TEMP355 =
                          (X10_TEMP20 +
                           X10_TEMP21);
                        
//#line 106
final java.
                          lang.
                          String X10_TEMP23 =
                          (X10_TEMP355);
                        
//#line 107
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP23);
                        
//#line 108
final java.
                          lang.
                          String X10_TEMP359 =
                          ("Encrypted Byte ");
                        
//#line 110
final java.
                          lang.
                          String X10_TEMP24 =
                          (X10_TEMP359);
                        
//#line 111
final java.
                          lang.
                          String X10_TEMP362 =
                          (X10_TEMP24 +
                           pt);
                        
//#line 113
final java.
                          lang.
                          String X10_TEMP25 =
                          (X10_TEMP362);
                        
//#line 114
final java.
                          lang.
                          String X10_TEMP365 =
                          (" = ");
                        
//#line 116
final java.
                          lang.
                          String X10_TEMP26 =
                          (X10_TEMP365);
                        
//#line 117
final java.
                          lang.
                          String X10_TEMP368 =
                          (X10_TEMP25 +
                           X10_TEMP26);
                        
//#line 119
final java.
                          lang.
                          String X10_TEMP28 =
                          (X10_TEMP368);
                        
//#line 120
final byte X10_TEMP372 =
                          (byte)
                            ((/* template:array_get { */((c1).get(pt))/* } */));
                        
//#line 122
final byte X10_TEMP29 =
                          (byte)
                            (((byte)
                                X10_TEMP372));
                        
//#line 123
final java.
                          lang.
                          String X10_TEMP375 =
                          (X10_TEMP28 +
                           X10_TEMP29);
                        
//#line 125
final java.
                          lang.
                          String X10_TEMP31 =
                          (X10_TEMP375);
                        
//#line 126
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP31);
                        
//#line 127
final java.
                          lang.
                          String X10_TEMP379 =
                          ("Decrypted Byte ");
                        
//#line 129
final java.
                          lang.
                          String X10_TEMP32 =
                          (X10_TEMP379);
                        
//#line 130
final java.
                          lang.
                          String X10_TEMP382 =
                          (X10_TEMP32 +
                           pt);
                        
//#line 132
final java.
                          lang.
                          String X10_TEMP33 =
                          (X10_TEMP382);
                        
//#line 133
final java.
                          lang.
                          String X10_TEMP385 =
                          (" = ");
                        
//#line 135
final java.
                          lang.
                          String X10_TEMP34 =
                          (X10_TEMP385);
                        
//#line 136
final java.
                          lang.
                          String X10_TEMP388 =
                          (X10_TEMP33 +
                           X10_TEMP34);
                        
//#line 138
final java.
                          lang.
                          String X10_TEMP36 =
                          (X10_TEMP388);
                        
//#line 139
final byte X10_TEMP392 =
                          (byte)
                            ((/* template:array_get { */((p2).get(pt))/* } */));
                        
//#line 141
final byte X10_TEMP37 =
                          (byte)
                            (((byte)
                                X10_TEMP392));
                        
//#line 142
final java.
                          lang.
                          String X10_TEMP395 =
                          (X10_TEMP36 +
                           X10_TEMP37);
                        
//#line 144
final java.
                          lang.
                          String X10_TEMP39 =
                          (X10_TEMP395);
                        
//#line 145
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP39);
                        
//#line 146
final java.
                          lang.
                          String X10_TEMP399 =
                          ("Validation failed");
                        
//#line 148
final java.
                          lang.
                          String X10_TEMP41 =
                          (X10_TEMP399);
                        
//#line 149
throw new java.
                          lang.
                          RuntimeException(
                          X10_TEMP41);
                    }
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
        
    }
    
    
//#line 155
public static void
                   Program_IDEATest_Do(
                   final IDEATest X10_TEMP0) {
        
//#line 156
final x10.
          lang.
          ByteReferenceArray X10_TEMP306 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain1));
        
//#line 158
final x10.
          lang.
          ByteReferenceArray p1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP306));
        
//#line 159
final x10.
          lang.
          ByteReferenceArray X10_TEMP309 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.crypt1));
        
//#line 161
final x10.
          lang.
          ByteReferenceArray c1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP309));
        
//#line 162
final x10.
          lang.
          ByteReferenceArray X10_TEMP312 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.plain2));
        
//#line 164
final x10.
          lang.
          ByteReferenceArray p2 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP312));
        
//#line 165
final x10.
          lang.
          intArray X10_TEMP315 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ZR));
        
//#line 167
final x10.
          lang.
          intArray fzr =
          (x10.
            lang.
            intArray)
            ((X10_TEMP315));
        
//#line 168
final x10.
          lang.
          intArray X10_TEMP318 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.DKR));
        
//#line 170
final x10.
          lang.
          intArray fdkr =
          (x10.
            lang.
            intArray)
            ((X10_TEMP318));
        
//#line 171
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 172
final x10.
              lang.
              dist X10_TEMP321 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    UNIQUE));
            
//#line 174
final x10.
              lang.
              dist X10_TEMP7 =
              (x10.
                lang.
                dist)
                ((X10_TEMP321));
            
//#line 175
/* template:forloop { */
            for (java.util.Iterator pt__ = (X10_TEMP7.
                                              region).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 176
final x10.
                  lang.
                  place X10_TEMP8 =
                  (X10_TEMP7.
                     get(
                     pt));
                
//#line 177
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP8)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 178
Program0.
                                   Program_IDEATest_cipher_idea(
                                   X10_TEMP0,
                                   p1,
                                   c1,
                                   fzr);
                    
//#line 179
Program0.
                                   Program_IDEATest_cipher_idea(
                                   X10_TEMP0,
                                   c1,
                                   p2,
                                   fdkr);
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
        
    }
    
    
//#line 184
public static void
                   Program_IDEATest_cipher_idea(
                   final IDEATest X10_TEMP0,
                   final x10.
                     lang.
                     ByteReferenceArray text1,
                   final x10.
                     lang.
                     ByteReferenceArray text2,
                   final x10.
                     lang.
                     intArray key) {
        
//#line 185
final x10.
          lang.
          region X10_TEMP306 =
          (x10.
            lang.
            region)
            ((text1.
                region));
        
//#line 187
final x10.
          lang.
          region X10_TEMP1 =
          (x10.
            lang.
            region)
            ((X10_TEMP306));
        
//#line 188
final int X10_TEMP309 =
          (X10_TEMP1.
             size());
        
//#line 190
final int X10_TEMP6 =
          (X10_TEMP309);
        
//#line 191
final int X10_TEMP312 =
          (8);
        
//#line 193
final int X10_TEMP2 =
          (X10_TEMP312);
        
//#line 194
final int X10_TEMP315 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 196
final int X10_TEMP3 =
          (X10_TEMP315);
        
//#line 197
final int X10_TEMP318 =
          (X10_TEMP2 *
             X10_TEMP3);
        
//#line 199
final int X10_TEMP5 =
          (X10_TEMP318);
        
//#line 200
final int X10_TEMP321 =
          (X10_TEMP6 %
             X10_TEMP5);
        
//#line 202
final int X10_TEMP7 =
          (X10_TEMP321);
        
//#line 203
final int X10_TEMP324 =
          (0);
        
//#line 205
final int X10_TEMP8 =
          (X10_TEMP324);
        
//#line 206
final boolean X10_TEMP10 =
          (X10_TEMP7 !=
             X10_TEMP8);
        
//#line 207
if (X10_TEMP10) {
            
//#line 208
final java.
              lang.
              String X10_TEMP329 =
              ("Invalid number of places for the distribution size");
            
//#line 210
final java.
              lang.
              String X10_TEMP12 =
              (X10_TEMP329);
            
//#line 211
throw new java.
              lang.
              RuntimeException(
              X10_TEMP12);
        }
        
//#line 213
final x10.
          lang.
          dist X10_TEMP333 =
          (x10.
            lang.
            dist)
            ((text1.
                distribution));
        
//#line 215
final x10.
          lang.
          dist X10_TEMP13 =
          (x10.
            lang.
            dist)
            ((X10_TEMP333));
        
//#line 216
final x10.
          lang.
          place X10_TEMP336 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 218
final x10.
          lang.
          place X10_TEMP14 =
          (X10_TEMP336);
        
//#line 219
final x10.
          lang.
          dist X10_TEMP339 =
          (x10.
            lang.
            dist)
            ((X10_TEMP13.
                restriction(
                X10_TEMP14)));
        
//#line 221
final x10.
          lang.
          dist X10_TEMP16 =
          (x10.
            lang.
            dist)
            ((X10_TEMP339));
        
//#line 222
/* template:forloop-mult { */{
        x10.lang.region __var4__ = (x10.lang.region) X10_TEMP16.
                                                       region;
        if (__var4__.size() > 0 && (__var4__ instanceof x10.array.MultiDimRegion || __var4__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var5__ = __var4__.rank(0).low(), __var6__ = __var4__.rank(0).high(); __var5__ <= __var6__; __var5__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var5__;
        /* } */
        /* } */
{
            
//#line 223
final int X10_TEMP343 =
              (8);
            
//#line 225
final int X10_TEMP17 =
              (X10_TEMP343);
            
//#line 226
final int X10_TEMP346 =
              (i %
                 X10_TEMP17);
            
//#line 228
final int X10_TEMP18 =
              (X10_TEMP346);
            
//#line 229
final int X10_TEMP349 =
              (0);
            
//#line 231
final int X10_TEMP19 =
              (X10_TEMP349);
            
//#line 232
final boolean X10_TEMP21 =
              (X10_TEMP18 ==
                 X10_TEMP19);
            
//#line 233
if (X10_TEMP21) {
                
//#line 234
final int X10_TEMP354 =
                  (i);
                
//#line 236
int i1 =
                  (X10_TEMP354);
                
//#line 237
final int X10_TEMP357 =
                  (i);
                
//#line 239
int i2 =
                  (X10_TEMP357);
                
//#line 240
final int X10_TEMP360 =
                  (0);
                
//#line 242
int ik =
                  (X10_TEMP360);
                
//#line 243
final int X10_TEMP363 =
                  (0);
                
//#line 245
int x1 =
                  (X10_TEMP363);
                
//#line 246
final int X10_TEMP366 =
                  (0);
                
//#line 248
int x2 =
                  (X10_TEMP366);
                
//#line 249
final int X10_TEMP369 =
                  (0);
                
//#line 251
int x3 =
                  (X10_TEMP369);
                
//#line 252
final int X10_TEMP372 =
                  (0);
                
//#line 254
int x4 =
                  (X10_TEMP372);
                
//#line 255
final int X10_TEMP375 =
                  (0);
                
//#line 257
int t1 =
                  (X10_TEMP375);
                
//#line 258
final int X10_TEMP378 =
                  (0);
                
//#line 260
int t2 =
                  (X10_TEMP378);
                
//#line 261
final int X10_TEMP381 =
                  (0);
                
//#line 263
int r =
                  (X10_TEMP381);
                
//#line 264
final int X10_TEMP384 =
                  (0);
                
//#line 266
final int X10_TEMP33 =
                  (X10_TEMP384);
                
//#line 267
final int X10_TEMP387 =
                  (X10_TEMP33);
                
//#line 269
ik =
                  ((X10_TEMP387));
                
//#line 270
final int X10_TEMP390 =
                  (8);
                
//#line 272
final int X10_TEMP35 =
                  (X10_TEMP390);
                
//#line 273
final int X10_TEMP393 =
                  (X10_TEMP35);
                
//#line 275
r =
                  ((X10_TEMP393));
                
//#line 276
final int X10_TEMP396 =
                  (i1);
                
//#line 278
final int X10_TEMP36 =
                  (X10_TEMP396);
                
//#line 279
final int X10_TEMP37 =
                  (1);
                
//#line 280
final int X10_TEMP400 =
                  (i1 +
                     X10_TEMP37);
                
//#line 281
i1 =
                  ((X10_TEMP400));
                
//#line 282
final byte X10_TEMP403 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP36))/* } */));
                
//#line 284
final byte X10_TEMP39 =
                  (byte)
                    (((byte)
                        X10_TEMP403));
                
//#line 285
final int X10_TEMP406 =
                  (255);
                
//#line 287
final int X10_TEMP40 =
                  (X10_TEMP406);
                
//#line 288
final int X10_TEMP409 =
                  (X10_TEMP39 &
                     X10_TEMP40);
                
//#line 290
final int X10_TEMP42 =
                  (X10_TEMP409);
                
//#line 291
final int X10_TEMP412 =
                  (X10_TEMP42);
                
//#line 293
x1 =
                  ((X10_TEMP412));
                
//#line 294
final int X10_TEMP415 =
                  (i1);
                
//#line 296
final int X10_TEMP43 =
                  (X10_TEMP415);
                
//#line 297
final int X10_TEMP44 =
                  (1);
                
//#line 298
final int X10_TEMP419 =
                  (i1 +
                     X10_TEMP44);
                
//#line 299
i1 =
                  ((X10_TEMP419));
                
//#line 300
final byte X10_TEMP422 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP43))/* } */));
                
//#line 302
final byte X10_TEMP46 =
                  (byte)
                    (((byte)
                        X10_TEMP422));
                
//#line 303
final int X10_TEMP425 =
                  (255);
                
//#line 305
final int X10_TEMP47 =
                  (X10_TEMP425);
                
//#line 306
final int X10_TEMP428 =
                  (X10_TEMP46 &
                     X10_TEMP47);
                
//#line 308
final int X10_TEMP49 =
                  (X10_TEMP428);
                
//#line 309
final int X10_TEMP431 =
                  (8);
                
//#line 311
final int X10_TEMP50 =
                  (X10_TEMP431);
                
//#line 312
final int X10_TEMP434 =
                  (X10_TEMP49 <<
                     X10_TEMP50);
                
//#line 314
final int X10_TEMP52 =
                  (X10_TEMP434);
                
//#line 315
final int X10_TEMP437 =
                  (x1 |
                     X10_TEMP52);
                
//#line 317
x1 =
                  ((X10_TEMP437));
                
//#line 318
final int X10_TEMP440 =
                  (i1);
                
//#line 320
final int X10_TEMP53 =
                  (X10_TEMP440);
                
//#line 321
final int X10_TEMP54 =
                  (1);
                
//#line 322
final int X10_TEMP444 =
                  (i1 +
                     X10_TEMP54);
                
//#line 323
i1 =
                  ((X10_TEMP444));
                
//#line 324
final byte X10_TEMP447 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP53))/* } */));
                
//#line 326
final byte X10_TEMP56 =
                  (byte)
                    (((byte)
                        X10_TEMP447));
                
//#line 327
final int X10_TEMP450 =
                  (255);
                
//#line 329
final int X10_TEMP57 =
                  (X10_TEMP450);
                
//#line 330
final int X10_TEMP453 =
                  (X10_TEMP56 &
                     X10_TEMP57);
                
//#line 332
final int X10_TEMP59 =
                  (X10_TEMP453);
                
//#line 333
final int X10_TEMP456 =
                  (X10_TEMP59);
                
//#line 335
x2 =
                  ((X10_TEMP456));
                
//#line 336
final int X10_TEMP459 =
                  (i1);
                
//#line 338
final int X10_TEMP60 =
                  (X10_TEMP459);
                
//#line 339
final int X10_TEMP61 =
                  (1);
                
//#line 340
final int X10_TEMP463 =
                  (i1 +
                     X10_TEMP61);
                
//#line 341
i1 =
                  ((X10_TEMP463));
                
//#line 342
final byte X10_TEMP466 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP60))/* } */));
                
//#line 344
final byte X10_TEMP63 =
                  (byte)
                    (((byte)
                        X10_TEMP466));
                
//#line 345
final int X10_TEMP469 =
                  (255);
                
//#line 347
final int X10_TEMP64 =
                  (X10_TEMP469);
                
//#line 348
final int X10_TEMP472 =
                  (X10_TEMP63 &
                     X10_TEMP64);
                
//#line 350
final int X10_TEMP66 =
                  (X10_TEMP472);
                
//#line 351
final int X10_TEMP475 =
                  (8);
                
//#line 353
final int X10_TEMP67 =
                  (X10_TEMP475);
                
//#line 354
final int X10_TEMP478 =
                  (X10_TEMP66 <<
                     X10_TEMP67);
                
//#line 356
final int X10_TEMP69 =
                  (X10_TEMP478);
                
//#line 357
final int X10_TEMP481 =
                  (x2 |
                     X10_TEMP69);
                
//#line 359
x2 =
                  ((X10_TEMP481));
                
//#line 360
final int X10_TEMP484 =
                  (i1);
                
//#line 362
final int X10_TEMP70 =
                  (X10_TEMP484);
                
//#line 363
final int X10_TEMP71 =
                  (1);
                
//#line 364
final int X10_TEMP488 =
                  (i1 +
                     X10_TEMP71);
                
//#line 365
i1 =
                  ((X10_TEMP488));
                
//#line 366
final byte X10_TEMP491 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP70))/* } */));
                
//#line 368
final byte X10_TEMP73 =
                  (byte)
                    (((byte)
                        X10_TEMP491));
                
//#line 369
final int X10_TEMP494 =
                  (255);
                
//#line 371
final int X10_TEMP74 =
                  (X10_TEMP494);
                
//#line 372
final int X10_TEMP497 =
                  (X10_TEMP73 &
                     X10_TEMP74);
                
//#line 374
final int X10_TEMP76 =
                  (X10_TEMP497);
                
//#line 375
final int X10_TEMP500 =
                  (X10_TEMP76);
                
//#line 377
x3 =
                  ((X10_TEMP500));
                
//#line 378
final int X10_TEMP503 =
                  (i1);
                
//#line 380
final int X10_TEMP77 =
                  (X10_TEMP503);
                
//#line 381
final int X10_TEMP78 =
                  (1);
                
//#line 382
final int X10_TEMP507 =
                  (i1 +
                     X10_TEMP78);
                
//#line 383
i1 =
                  ((X10_TEMP507));
                
//#line 384
final byte X10_TEMP510 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP77))/* } */));
                
//#line 386
final byte X10_TEMP80 =
                  (byte)
                    (((byte)
                        X10_TEMP510));
                
//#line 387
final int X10_TEMP513 =
                  (255);
                
//#line 389
final int X10_TEMP81 =
                  (X10_TEMP513);
                
//#line 390
final int X10_TEMP516 =
                  (X10_TEMP80 &
                     X10_TEMP81);
                
//#line 392
final int X10_TEMP83 =
                  (X10_TEMP516);
                
//#line 393
final int X10_TEMP519 =
                  (8);
                
//#line 395
final int X10_TEMP84 =
                  (X10_TEMP519);
                
//#line 396
final int X10_TEMP522 =
                  (X10_TEMP83 <<
                     X10_TEMP84);
                
//#line 398
final int X10_TEMP86 =
                  (X10_TEMP522);
                
//#line 399
final int X10_TEMP525 =
                  (x3 |
                     X10_TEMP86);
                
//#line 401
x3 =
                  ((X10_TEMP525));
                
//#line 402
final int X10_TEMP528 =
                  (i1);
                
//#line 404
final int X10_TEMP87 =
                  (X10_TEMP528);
                
//#line 405
final int X10_TEMP88 =
                  (1);
                
//#line 406
final int X10_TEMP532 =
                  (i1 +
                     X10_TEMP88);
                
//#line 407
i1 =
                  ((X10_TEMP532));
                
//#line 408
final byte X10_TEMP535 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP87))/* } */));
                
//#line 410
final byte X10_TEMP90 =
                  (byte)
                    (((byte)
                        X10_TEMP535));
                
//#line 411
final int X10_TEMP538 =
                  (255);
                
//#line 413
final int X10_TEMP91 =
                  (X10_TEMP538);
                
//#line 414
final int X10_TEMP541 =
                  (X10_TEMP90 &
                     X10_TEMP91);
                
//#line 416
final int X10_TEMP93 =
                  (X10_TEMP541);
                
//#line 417
final int X10_TEMP544 =
                  (X10_TEMP93);
                
//#line 419
x4 =
                  ((X10_TEMP544));
                
//#line 420
final int X10_TEMP547 =
                  (i1);
                
//#line 422
final int X10_TEMP94 =
                  (X10_TEMP547);
                
//#line 423
final int X10_TEMP95 =
                  (1);
                
//#line 424
final int X10_TEMP551 =
                  (i1 +
                     X10_TEMP95);
                
//#line 425
i1 =
                  ((X10_TEMP551));
                
//#line 426
final byte X10_TEMP554 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP94))/* } */));
                
//#line 428
final byte X10_TEMP97 =
                  (byte)
                    (((byte)
                        X10_TEMP554));
                
//#line 429
final int X10_TEMP557 =
                  (255);
                
//#line 431
final int X10_TEMP98 =
                  (X10_TEMP557);
                
//#line 432
final int X10_TEMP560 =
                  (X10_TEMP97 &
                     X10_TEMP98);
                
//#line 434
final int X10_TEMP100 =
                  (X10_TEMP560);
                
//#line 435
final int X10_TEMP563 =
                  (8);
                
//#line 437
final int X10_TEMP101 =
                  (X10_TEMP563);
                
//#line 438
final int X10_TEMP566 =
                  (X10_TEMP100 <<
                     X10_TEMP101);
                
//#line 440
final int X10_TEMP103 =
                  (X10_TEMP566);
                
//#line 441
final int X10_TEMP569 =
                  (x4 |
                     X10_TEMP103);
                
//#line 443
x4 =
                  ((X10_TEMP569));
                
//#line 444
boolean X10_TEMP104 =
                  (false);
                
//#line 445
boolean X10_TEMP572 =
                  false;
                
//#line 446
do  {
                    
//#line 447
final long X10_TEMP574 =
                      ((long)
                         x1);
                    
//#line 449
final long X10_TEMP108 =
                      (X10_TEMP574);
                    
//#line 450
final int X10_TEMP577 =
                      (ik);
                    
//#line 452
final int X10_TEMP105 =
                      (X10_TEMP577);
                    
//#line 453
final int X10_TEMP106 =
                      (1);
                    
//#line 454
final int X10_TEMP581 =
                      (ik +
                         X10_TEMP106);
                    
//#line 455
ik =
                      ((X10_TEMP581));
                    
//#line 456
final int X10_TEMP584 =
                      (/* template:array_get { */((key).get(X10_TEMP105))/* } */);
                    
//#line 458
final int X10_TEMP109 =
                      (X10_TEMP584);
                    
//#line 459
final long X10_TEMP587 =
                      (X10_TEMP108 *
                         X10_TEMP109);
                    
//#line 461
final long X10_TEMP110 =
                      (X10_TEMP587);
                    
//#line 462
final long X10_TEMP590 =
                      (65537L);
                    
//#line 464
final long X10_TEMP111 =
                      (X10_TEMP590);
                    
//#line 465
final long X10_TEMP593 =
                      (X10_TEMP110 %
                         X10_TEMP111);
                    
//#line 467
final long X10_TEMP112 =
                      (X10_TEMP593);
                    
//#line 468
final int X10_TEMP596 =
                      (65535);
                    
//#line 470
final int X10_TEMP113 =
                      (X10_TEMP596);
                    
//#line 471
final long X10_TEMP599 =
                      (X10_TEMP112 &
                         X10_TEMP113);
                    
//#line 473
final long X10_TEMP115 =
                      (X10_TEMP599);
                    
//#line 474
final int X10_TEMP602 =
                      ((int)
                         X10_TEMP115);
                    
//#line 476
final int X10_TEMP117 =
                      (X10_TEMP602);
                    
//#line 477
final int X10_TEMP605 =
                      (X10_TEMP117);
                    
//#line 479
x1 =
                      ((X10_TEMP605));
                    
//#line 480
final int X10_TEMP608 =
                      (ik);
                    
//#line 482
final int X10_TEMP118 =
                      (X10_TEMP608);
                    
//#line 483
final int X10_TEMP119 =
                      (1);
                    
//#line 484
final int X10_TEMP612 =
                      (ik +
                         X10_TEMP119);
                    
//#line 485
ik =
                      ((X10_TEMP612));
                    
//#line 486
final int X10_TEMP615 =
                      (/* template:array_get { */((key).get(X10_TEMP118))/* } */);
                    
//#line 488
final int X10_TEMP121 =
                      (X10_TEMP615);
                    
//#line 489
final int X10_TEMP618 =
                      (x2 +
                         X10_TEMP121);
                    
//#line 491
final int X10_TEMP122 =
                      (X10_TEMP618);
                    
//#line 492
final int X10_TEMP621 =
                      (65535);
                    
//#line 494
final int X10_TEMP123 =
                      (X10_TEMP621);
                    
//#line 495
final int X10_TEMP624 =
                      (X10_TEMP122 &
                         X10_TEMP123);
                    
//#line 497
final int X10_TEMP125 =
                      (X10_TEMP624);
                    
//#line 498
final int X10_TEMP627 =
                      (X10_TEMP125);
                    
//#line 500
x2 =
                      ((X10_TEMP627));
                    
//#line 501
final int X10_TEMP630 =
                      (ik);
                    
//#line 503
final int X10_TEMP126 =
                      (X10_TEMP630);
                    
//#line 504
final int X10_TEMP127 =
                      (1);
                    
//#line 505
final int X10_TEMP634 =
                      (ik +
                         X10_TEMP127);
                    
//#line 506
ik =
                      ((X10_TEMP634));
                    
//#line 507
final int X10_TEMP637 =
                      (/* template:array_get { */((key).get(X10_TEMP126))/* } */);
                    
//#line 509
final int X10_TEMP129 =
                      (X10_TEMP637);
                    
//#line 510
final int X10_TEMP640 =
                      (x3 +
                         X10_TEMP129);
                    
//#line 512
final int X10_TEMP130 =
                      (X10_TEMP640);
                    
//#line 513
final int X10_TEMP643 =
                      (65535);
                    
//#line 515
final int X10_TEMP131 =
                      (X10_TEMP643);
                    
//#line 516
final int X10_TEMP646 =
                      (X10_TEMP130 &
                         X10_TEMP131);
                    
//#line 518
final int X10_TEMP133 =
                      (X10_TEMP646);
                    
//#line 519
final int X10_TEMP649 =
                      (X10_TEMP133);
                    
//#line 521
x3 =
                      ((X10_TEMP649));
                    
//#line 522
final long X10_TEMP652 =
                      ((long)
                         x4);
                    
//#line 524
final long X10_TEMP137 =
                      (X10_TEMP652);
                    
//#line 525
final int X10_TEMP655 =
                      (ik);
                    
//#line 527
final int X10_TEMP134 =
                      (X10_TEMP655);
                    
//#line 528
final int X10_TEMP135 =
                      (1);
                    
//#line 529
final int X10_TEMP659 =
                      (ik +
                         X10_TEMP135);
                    
//#line 530
ik =
                      ((X10_TEMP659));
                    
//#line 531
final int X10_TEMP662 =
                      (/* template:array_get { */((key).get(X10_TEMP134))/* } */);
                    
//#line 533
final int X10_TEMP138 =
                      (X10_TEMP662);
                    
//#line 534
final long X10_TEMP665 =
                      (X10_TEMP137 *
                         X10_TEMP138);
                    
//#line 536
final long X10_TEMP139 =
                      (X10_TEMP665);
                    
//#line 537
final long X10_TEMP668 =
                      (65537L);
                    
//#line 539
final long X10_TEMP140 =
                      (X10_TEMP668);
                    
//#line 540
final long X10_TEMP671 =
                      (X10_TEMP139 %
                         X10_TEMP140);
                    
//#line 542
final long X10_TEMP141 =
                      (X10_TEMP671);
                    
//#line 543
final int X10_TEMP674 =
                      (65535);
                    
//#line 545
final int X10_TEMP142 =
                      (X10_TEMP674);
                    
//#line 546
final long X10_TEMP677 =
                      (X10_TEMP141 &
                         X10_TEMP142);
                    
//#line 548
final long X10_TEMP144 =
                      (X10_TEMP677);
                    
//#line 549
final int X10_TEMP680 =
                      ((int)
                         X10_TEMP144);
                    
//#line 551
final int X10_TEMP146 =
                      (X10_TEMP680);
                    
//#line 552
final int X10_TEMP683 =
                      (X10_TEMP146);
                    
//#line 554
x4 =
                      ((X10_TEMP683));
                    
//#line 555
final int X10_TEMP686 =
                      (x1 ^
                         x3);
                    
//#line 557
final int X10_TEMP148 =
                      (X10_TEMP686);
                    
//#line 558
final int X10_TEMP689 =
                      (X10_TEMP148);
                    
//#line 560
t2 =
                      ((X10_TEMP689));
                    
//#line 561
final long X10_TEMP692 =
                      ((long)
                         t2);
                    
//#line 563
final long X10_TEMP152 =
                      (X10_TEMP692);
                    
//#line 564
final int X10_TEMP695 =
                      (ik);
                    
//#line 566
final int X10_TEMP149 =
                      (X10_TEMP695);
                    
//#line 567
final int X10_TEMP150 =
                      (1);
                    
//#line 568
final int X10_TEMP699 =
                      (ik +
                         X10_TEMP150);
                    
//#line 569
ik =
                      ((X10_TEMP699));
                    
//#line 570
final int X10_TEMP702 =
                      (/* template:array_get { */((key).get(X10_TEMP149))/* } */);
                    
//#line 572
final int X10_TEMP153 =
                      (X10_TEMP702);
                    
//#line 573
final long X10_TEMP705 =
                      (X10_TEMP152 *
                         X10_TEMP153);
                    
//#line 575
final long X10_TEMP154 =
                      (X10_TEMP705);
                    
//#line 576
final long X10_TEMP708 =
                      (65537L);
                    
//#line 578
final long X10_TEMP155 =
                      (X10_TEMP708);
                    
//#line 579
final long X10_TEMP711 =
                      (X10_TEMP154 %
                         X10_TEMP155);
                    
//#line 581
final long X10_TEMP156 =
                      (X10_TEMP711);
                    
//#line 582
final int X10_TEMP714 =
                      (65535);
                    
//#line 584
final int X10_TEMP157 =
                      (X10_TEMP714);
                    
//#line 585
final long X10_TEMP717 =
                      (X10_TEMP156 &
                         X10_TEMP157);
                    
//#line 587
final long X10_TEMP159 =
                      (X10_TEMP717);
                    
//#line 588
final int X10_TEMP720 =
                      ((int)
                         X10_TEMP159);
                    
//#line 590
final int X10_TEMP161 =
                      (X10_TEMP720);
                    
//#line 591
final int X10_TEMP723 =
                      (X10_TEMP161);
                    
//#line 593
t2 =
                      ((X10_TEMP723));
                    
//#line 594
final int X10_TEMP726 =
                      (x2 ^
                         x4);
                    
//#line 596
final int X10_TEMP163 =
                      (X10_TEMP726);
                    
//#line 597
final int X10_TEMP729 =
                      (t2 +
                         X10_TEMP163);
                    
//#line 599
final int X10_TEMP164 =
                      (X10_TEMP729);
                    
//#line 600
final int X10_TEMP732 =
                      (65535);
                    
//#line 602
final int X10_TEMP165 =
                      (X10_TEMP732);
                    
//#line 603
final int X10_TEMP735 =
                      (X10_TEMP164 &
                         X10_TEMP165);
                    
//#line 605
final int X10_TEMP167 =
                      (X10_TEMP735);
                    
//#line 606
final int X10_TEMP738 =
                      (X10_TEMP167);
                    
//#line 608
t1 =
                      ((X10_TEMP738));
                    
//#line 609
final long X10_TEMP741 =
                      ((long)
                         t1);
                    
//#line 611
final long X10_TEMP171 =
                      (X10_TEMP741);
                    
//#line 612
final int X10_TEMP744 =
                      (ik);
                    
//#line 614
final int X10_TEMP168 =
                      (X10_TEMP744);
                    
//#line 615
final int X10_TEMP169 =
                      (1);
                    
//#line 616
final int X10_TEMP748 =
                      (ik +
                         X10_TEMP169);
                    
//#line 617
ik =
                      ((X10_TEMP748));
                    
//#line 618
final int X10_TEMP751 =
                      (/* template:array_get { */((key).get(X10_TEMP168))/* } */);
                    
//#line 620
final int X10_TEMP172 =
                      (X10_TEMP751);
                    
//#line 621
final long X10_TEMP754 =
                      (X10_TEMP171 *
                         X10_TEMP172);
                    
//#line 623
final long X10_TEMP173 =
                      (X10_TEMP754);
                    
//#line 624
final long X10_TEMP757 =
                      (65537L);
                    
//#line 626
final long X10_TEMP174 =
                      (X10_TEMP757);
                    
//#line 627
final long X10_TEMP760 =
                      (X10_TEMP173 %
                         X10_TEMP174);
                    
//#line 629
final long X10_TEMP175 =
                      (X10_TEMP760);
                    
//#line 630
final int X10_TEMP763 =
                      (65535);
                    
//#line 632
final int X10_TEMP176 =
                      (X10_TEMP763);
                    
//#line 633
final long X10_TEMP766 =
                      (X10_TEMP175 &
                         X10_TEMP176);
                    
//#line 635
final long X10_TEMP178 =
                      (X10_TEMP766);
                    
//#line 636
final int X10_TEMP769 =
                      ((int)
                         X10_TEMP178);
                    
//#line 638
final int X10_TEMP180 =
                      (X10_TEMP769);
                    
//#line 639
final int X10_TEMP772 =
                      (X10_TEMP180);
                    
//#line 641
t1 =
                      ((X10_TEMP772));
                    
//#line 642
final int X10_TEMP775 =
                      (t1 +
                         t2);
                    
//#line 644
final int X10_TEMP181 =
                      (X10_TEMP775);
                    
//#line 645
final int X10_TEMP778 =
                      (65535);
                    
//#line 647
final int X10_TEMP182 =
                      (X10_TEMP778);
                    
//#line 648
final int X10_TEMP781 =
                      (X10_TEMP181 &
                         X10_TEMP182);
                    
//#line 650
final int X10_TEMP184 =
                      (X10_TEMP781);
                    
//#line 651
final int X10_TEMP784 =
                      (X10_TEMP184);
                    
//#line 653
t2 =
                      ((X10_TEMP784));
                    
//#line 654
final int X10_TEMP787 =
                      (x1 ^
                         t1);
                    
//#line 656
x1 =
                      ((X10_TEMP787));
                    
//#line 657
final int X10_TEMP790 =
                      (x4 ^
                         t2);
                    
//#line 659
x4 =
                      ((X10_TEMP790));
                    
//#line 660
final int X10_TEMP793 =
                      (t2 ^
                         x2);
                    
//#line 662
t2 =
                      ((X10_TEMP793));
                    
//#line 663
final int X10_TEMP796 =
                      (x3 ^
                         t1);
                    
//#line 665
final int X10_TEMP189 =
                      (X10_TEMP796);
                    
//#line 666
final int X10_TEMP799 =
                      (X10_TEMP189);
                    
//#line 668
x2 =
                      ((X10_TEMP799));
                    
//#line 669
final int X10_TEMP802 =
                      (t2);
                    
//#line 671
x3 =
                      ((X10_TEMP802));
                    
//#line 672
final int X10_TEMP191 =
                      (1);
                    
//#line 673
final int X10_TEMP806 =
                      (r -
                         X10_TEMP191);
                    
//#line 674
r =
                      ((X10_TEMP806));
                    
//#line 675
final int X10_TEMP808 =
                      (0);
                    
//#line 677
final int X10_TEMP192 =
                      (X10_TEMP808);
                    
//#line 678
final boolean X10_TEMP811 =
                      (r !=
                         X10_TEMP192);
                    
//#line 679
X10_TEMP104 =
                      ((X10_TEMP811));
                    
//#line 680
X10_TEMP572 =
                      X10_TEMP104;
                }while(X10_TEMP572); 
                
//#line 682
final long X10_TEMP814 =
                  ((long)
                     x1);
                
//#line 684
final long X10_TEMP197 =
                  (X10_TEMP814);
                
//#line 685
final int X10_TEMP817 =
                  (ik);
                
//#line 687
final int X10_TEMP194 =
                  (X10_TEMP817);
                
//#line 688
final int X10_TEMP195 =
                  (1);
                
//#line 689
final int X10_TEMP821 =
                  (ik +
                     X10_TEMP195);
                
//#line 690
ik =
                  ((X10_TEMP821));
                
//#line 691
final int X10_TEMP824 =
                  (/* template:array_get { */((key).get(X10_TEMP194))/* } */);
                
//#line 693
final int X10_TEMP198 =
                  (X10_TEMP824);
                
//#line 694
final long X10_TEMP827 =
                  (X10_TEMP197 *
                     X10_TEMP198);
                
//#line 696
final long X10_TEMP199 =
                  (X10_TEMP827);
                
//#line 697
final long X10_TEMP830 =
                  (65537L);
                
//#line 699
final long X10_TEMP200 =
                  (X10_TEMP830);
                
//#line 700
final long X10_TEMP833 =
                  (X10_TEMP199 %
                     X10_TEMP200);
                
//#line 702
final long X10_TEMP201 =
                  (X10_TEMP833);
                
//#line 703
final int X10_TEMP836 =
                  (65535);
                
//#line 705
final int X10_TEMP202 =
                  (X10_TEMP836);
                
//#line 706
final long X10_TEMP839 =
                  (X10_TEMP201 &
                     X10_TEMP202);
                
//#line 708
final long X10_TEMP204 =
                  (X10_TEMP839);
                
//#line 709
final int X10_TEMP842 =
                  ((int)
                     X10_TEMP204);
                
//#line 711
final int X10_TEMP206 =
                  (X10_TEMP842);
                
//#line 712
final int X10_TEMP845 =
                  (X10_TEMP206);
                
//#line 714
x1 =
                  ((X10_TEMP845));
                
//#line 715
final int X10_TEMP848 =
                  (ik);
                
//#line 717
final int X10_TEMP207 =
                  (X10_TEMP848);
                
//#line 718
final int X10_TEMP208 =
                  (1);
                
//#line 719
final int X10_TEMP852 =
                  (ik +
                     X10_TEMP208);
                
//#line 720
ik =
                  ((X10_TEMP852));
                
//#line 721
final int X10_TEMP855 =
                  (/* template:array_get { */((key).get(X10_TEMP207))/* } */);
                
//#line 723
final int X10_TEMP210 =
                  (X10_TEMP855);
                
//#line 724
final int X10_TEMP858 =
                  (x3 +
                     X10_TEMP210);
                
//#line 726
final int X10_TEMP211 =
                  (X10_TEMP858);
                
//#line 727
final int X10_TEMP861 =
                  (65535);
                
//#line 729
final int X10_TEMP212 =
                  (X10_TEMP861);
                
//#line 730
final int X10_TEMP864 =
                  (X10_TEMP211 &
                     X10_TEMP212);
                
//#line 732
final int X10_TEMP214 =
                  (X10_TEMP864);
                
//#line 733
final int X10_TEMP867 =
                  (X10_TEMP214);
                
//#line 735
x3 =
                  ((X10_TEMP867));
                
//#line 736
final int X10_TEMP870 =
                  (ik);
                
//#line 738
final int X10_TEMP215 =
                  (X10_TEMP870);
                
//#line 739
final int X10_TEMP216 =
                  (1);
                
//#line 740
final int X10_TEMP874 =
                  (ik +
                     X10_TEMP216);
                
//#line 741
ik =
                  ((X10_TEMP874));
                
//#line 742
final int X10_TEMP877 =
                  (/* template:array_get { */((key).get(X10_TEMP215))/* } */);
                
//#line 744
final int X10_TEMP218 =
                  (X10_TEMP877);
                
//#line 745
final int X10_TEMP880 =
                  (x2 +
                     X10_TEMP218);
                
//#line 747
final int X10_TEMP219 =
                  (X10_TEMP880);
                
//#line 748
final int X10_TEMP883 =
                  (65535);
                
//#line 750
final int X10_TEMP220 =
                  (X10_TEMP883);
                
//#line 751
final int X10_TEMP886 =
                  (X10_TEMP219 &
                     X10_TEMP220);
                
//#line 753
final int X10_TEMP222 =
                  (X10_TEMP886);
                
//#line 754
final int X10_TEMP889 =
                  (X10_TEMP222);
                
//#line 756
x2 =
                  ((X10_TEMP889));
                
//#line 757
final long X10_TEMP892 =
                  ((long)
                     x4);
                
//#line 759
final long X10_TEMP226 =
                  (X10_TEMP892);
                
//#line 760
final int X10_TEMP895 =
                  (ik);
                
//#line 762
final int X10_TEMP223 =
                  (X10_TEMP895);
                
//#line 763
final int X10_TEMP224 =
                  (1);
                
//#line 764
final int X10_TEMP899 =
                  (ik +
                     X10_TEMP224);
                
//#line 765
ik =
                  ((X10_TEMP899));
                
//#line 766
final int X10_TEMP902 =
                  (/* template:array_get { */((key).get(X10_TEMP223))/* } */);
                
//#line 768
final int X10_TEMP227 =
                  (X10_TEMP902);
                
//#line 769
final long X10_TEMP905 =
                  (X10_TEMP226 *
                     X10_TEMP227);
                
//#line 771
final long X10_TEMP228 =
                  (X10_TEMP905);
                
//#line 772
final long X10_TEMP908 =
                  (65537L);
                
//#line 774
final long X10_TEMP229 =
                  (X10_TEMP908);
                
//#line 775
final long X10_TEMP911 =
                  (X10_TEMP228 %
                     X10_TEMP229);
                
//#line 777
final long X10_TEMP230 =
                  (X10_TEMP911);
                
//#line 778
final int X10_TEMP914 =
                  (65535);
                
//#line 780
final int X10_TEMP231 =
                  (X10_TEMP914);
                
//#line 781
final long X10_TEMP917 =
                  (X10_TEMP230 &
                     X10_TEMP231);
                
//#line 783
final long X10_TEMP233 =
                  (X10_TEMP917);
                
//#line 784
final int X10_TEMP920 =
                  ((int)
                     X10_TEMP233);
                
//#line 786
final int X10_TEMP235 =
                  (X10_TEMP920);
                
//#line 787
final int X10_TEMP923 =
                  (X10_TEMP235);
                
//#line 789
x4 =
                  ((X10_TEMP923));
                
//#line 790
final int X10_TEMP926 =
                  (i2);
                
//#line 792
final int X10_TEMP236 =
                  (X10_TEMP926);
                
//#line 793
final int X10_TEMP237 =
                  (1);
                
//#line 794
final int X10_TEMP930 =
                  (i2 +
                     X10_TEMP237);
                
//#line 795
i2 =
                  ((X10_TEMP930));
                
//#line 796
final byte X10_TEMP932 =
                  (byte)
                    (((byte)
                        x1));
                
//#line 798
final byte X10_TEMP241 =
                  (byte)
                    (((byte)
                        X10_TEMP932));
                
//#line 799
final byte X10_TEMP935 =
                  (byte)
                    ((X10_TEMP241));
                
//#line 801
final byte X10_TEMP242 =
                  (byte)
                    (((byte)
                        X10_TEMP935));
                
//#line 802
final byte X10_TEMP939 =
                  (byte)
                    ((X10_TEMP242));
                
//#line 804
final byte X10_TEMP942 =
                  (byte)
                    ((X10_TEMP939));
                
//#line 805
/* template:array_set { */(text2).set((X10_TEMP942),X10_TEMP236)/* } */;
                
//#line 806
final int X10_TEMP944 =
                  (i2);
                
//#line 808
final int X10_TEMP243 =
                  (X10_TEMP944);
                
//#line 809
final int X10_TEMP244 =
                  (1);
                
//#line 810
final int X10_TEMP948 =
                  (i2 +
                     X10_TEMP244);
                
//#line 811
i2 =
                  ((X10_TEMP948));
                
//#line 812
final int X10_TEMP950 =
                  (8);
                
//#line 814
final int X10_TEMP246 =
                  (X10_TEMP950);
                
//#line 815
final int X10_TEMP953 =
                  (x1 >>>
                     X10_TEMP246);
                
//#line 817
final int X10_TEMP248 =
                  (X10_TEMP953);
                
//#line 818
final byte X10_TEMP956 =
                  (byte)
                    (((byte)
                        X10_TEMP248));
                
//#line 820
final byte X10_TEMP251 =
                  (byte)
                    (((byte)
                        X10_TEMP956));
                
//#line 821
final byte X10_TEMP959 =
                  (byte)
                    ((X10_TEMP251));
                
//#line 823
final byte X10_TEMP252 =
                  (byte)
                    (((byte)
                        X10_TEMP959));
                
//#line 824
final byte X10_TEMP963 =
                  (byte)
                    ((X10_TEMP252));
                
//#line 826
final byte X10_TEMP966 =
                  (byte)
                    ((X10_TEMP963));
                
//#line 827
/* template:array_set { */(text2).set((X10_TEMP966),X10_TEMP243)/* } */;
                
//#line 828
final int X10_TEMP968 =
                  (i2);
                
//#line 830
final int X10_TEMP253 =
                  (X10_TEMP968);
                
//#line 831
final int X10_TEMP254 =
                  (1);
                
//#line 832
final int X10_TEMP972 =
                  (i2 +
                     X10_TEMP254);
                
//#line 833
i2 =
                  ((X10_TEMP972));
                
//#line 834
final byte X10_TEMP974 =
                  (byte)
                    (((byte)
                        x3));
                
//#line 836
final byte X10_TEMP258 =
                  (byte)
                    (((byte)
                        X10_TEMP974));
                
//#line 837
final byte X10_TEMP977 =
                  (byte)
                    ((X10_TEMP258));
                
//#line 839
final byte X10_TEMP259 =
                  (byte)
                    (((byte)
                        X10_TEMP977));
                
//#line 840
final byte X10_TEMP981 =
                  (byte)
                    ((X10_TEMP259));
                
//#line 842
final byte X10_TEMP984 =
                  (byte)
                    ((X10_TEMP981));
                
//#line 843
/* template:array_set { */(text2).set((X10_TEMP984),X10_TEMP253)/* } */;
                
//#line 844
final int X10_TEMP986 =
                  (i2);
                
//#line 846
final int X10_TEMP260 =
                  (X10_TEMP986);
                
//#line 847
final int X10_TEMP261 =
                  (1);
                
//#line 848
final int X10_TEMP990 =
                  (i2 +
                     X10_TEMP261);
                
//#line 849
i2 =
                  ((X10_TEMP990));
                
//#line 850
final int X10_TEMP992 =
                  (8);
                
//#line 852
final int X10_TEMP263 =
                  (X10_TEMP992);
                
//#line 853
final int X10_TEMP995 =
                  (x3 >>>
                     X10_TEMP263);
                
//#line 855
final int X10_TEMP265 =
                  (X10_TEMP995);
                
//#line 856
final byte X10_TEMP998 =
                  (byte)
                    (((byte)
                        X10_TEMP265));
                
//#line 858
final byte X10_TEMP268 =
                  (byte)
                    (((byte)
                        X10_TEMP998));
                
//#line 859
final byte X10_TEMP1001 =
                  (byte)
                    ((X10_TEMP268));
                
//#line 861
final byte X10_TEMP269 =
                  (byte)
                    (((byte)
                        X10_TEMP1001));
                
//#line 862
final byte X10_TEMP1005 =
                  (byte)
                    ((X10_TEMP269));
                
//#line 864
final byte X10_TEMP1008 =
                  (byte)
                    ((X10_TEMP1005));
                
//#line 865
/* template:array_set { */(text2).set((X10_TEMP1008),X10_TEMP260)/* } */;
                
//#line 866
final int X10_TEMP1010 =
                  (i2);
                
//#line 868
final int X10_TEMP270 =
                  (X10_TEMP1010);
                
//#line 869
final int X10_TEMP271 =
                  (1);
                
//#line 870
final int X10_TEMP1014 =
                  (i2 +
                     X10_TEMP271);
                
//#line 871
i2 =
                  ((X10_TEMP1014));
                
//#line 872
final byte X10_TEMP1016 =
                  (byte)
                    (((byte)
                        x2));
                
//#line 874
final byte X10_TEMP275 =
                  (byte)
                    (((byte)
                        X10_TEMP1016));
                
//#line 875
final byte X10_TEMP1019 =
                  (byte)
                    ((X10_TEMP275));
                
//#line 877
final byte X10_TEMP276 =
                  (byte)
                    (((byte)
                        X10_TEMP1019));
                
//#line 878
final byte X10_TEMP1023 =
                  (byte)
                    ((X10_TEMP276));
                
//#line 880
final byte X10_TEMP1026 =
                  (byte)
                    ((X10_TEMP1023));
                
//#line 881
/* template:array_set { */(text2).set((X10_TEMP1026),X10_TEMP270)/* } */;
                
//#line 882
final int X10_TEMP1028 =
                  (i2);
                
//#line 884
final int X10_TEMP277 =
                  (X10_TEMP1028);
                
//#line 885
final int X10_TEMP278 =
                  (1);
                
//#line 886
final int X10_TEMP1032 =
                  (i2 +
                     X10_TEMP278);
                
//#line 887
i2 =
                  ((X10_TEMP1032));
                
//#line 888
final int X10_TEMP1034 =
                  (8);
                
//#line 890
final int X10_TEMP280 =
                  (X10_TEMP1034);
                
//#line 891
final int X10_TEMP1037 =
                  (x2 >>>
                     X10_TEMP280);
                
//#line 893
final int X10_TEMP282 =
                  (X10_TEMP1037);
                
//#line 894
final byte X10_TEMP1040 =
                  (byte)
                    (((byte)
                        X10_TEMP282));
                
//#line 896
final byte X10_TEMP285 =
                  (byte)
                    (((byte)
                        X10_TEMP1040));
                
//#line 897
final byte X10_TEMP1043 =
                  (byte)
                    ((X10_TEMP285));
                
//#line 899
final byte X10_TEMP286 =
                  (byte)
                    (((byte)
                        X10_TEMP1043));
                
//#line 900
final byte X10_TEMP1047 =
                  (byte)
                    ((X10_TEMP286));
                
//#line 902
final byte X10_TEMP1050 =
                  (byte)
                    ((X10_TEMP1047));
                
//#line 903
/* template:array_set { */(text2).set((X10_TEMP1050),X10_TEMP277)/* } */;
                
//#line 904
final int X10_TEMP1052 =
                  (i2);
                
//#line 906
final int X10_TEMP287 =
                  (X10_TEMP1052);
                
//#line 907
final int X10_TEMP288 =
                  (1);
                
//#line 908
final int X10_TEMP1056 =
                  (i2 +
                     X10_TEMP288);
                
//#line 909
i2 =
                  ((X10_TEMP1056));
                
//#line 910
final byte X10_TEMP1058 =
                  (byte)
                    (((byte)
                        x4));
                
//#line 912
final byte X10_TEMP292 =
                  (byte)
                    (((byte)
                        X10_TEMP1058));
                
//#line 913
final byte X10_TEMP1061 =
                  (byte)
                    ((X10_TEMP292));
                
//#line 915
final byte X10_TEMP293 =
                  (byte)
                    (((byte)
                        X10_TEMP1061));
                
//#line 916
final byte X10_TEMP1065 =
                  (byte)
                    ((X10_TEMP293));
                
//#line 918
final byte X10_TEMP1068 =
                  (byte)
                    ((X10_TEMP1065));
                
//#line 919
/* template:array_set { */(text2).set((X10_TEMP1068),X10_TEMP287)/* } */;
                
//#line 920
final int X10_TEMP1070 =
                  (i2);
                
//#line 922
final int X10_TEMP294 =
                  (X10_TEMP1070);
                
//#line 923
final int X10_TEMP295 =
                  (1);
                
//#line 924
final int X10_TEMP1074 =
                  (i2 +
                     X10_TEMP295);
                
//#line 925
i2 =
                  ((X10_TEMP1074));
                
//#line 926
final int X10_TEMP1076 =
                  (8);
                
//#line 928
final int X10_TEMP297 =
                  (X10_TEMP1076);
                
//#line 929
final int X10_TEMP1079 =
                  (x4 >>>
                     X10_TEMP297);
                
//#line 931
final int X10_TEMP299 =
                  (X10_TEMP1079);
                
//#line 932
final byte X10_TEMP1082 =
                  (byte)
                    (((byte)
                        X10_TEMP299));
                
//#line 934
final byte X10_TEMP302 =
                  (byte)
                    (((byte)
                        X10_TEMP1082));
                
//#line 935
final byte X10_TEMP1085 =
                  (byte)
                    ((X10_TEMP302));
                
//#line 937
final byte X10_TEMP303 =
                  (byte)
                    (((byte)
                        X10_TEMP1085));
                
//#line 938
final byte X10_TEMP1089 =
                  (byte)
                    ((X10_TEMP303));
                
//#line 940
final byte X10_TEMP1092 =
                  (byte)
                    ((X10_TEMP1089));
                
//#line 941
/* template:array_set { */(text2).set((X10_TEMP1092),X10_TEMP294)/* } */;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var4__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
            
//#line 223
final int X10_TEMP343 =
              (8);
            
//#line 225
final int X10_TEMP17 =
              (X10_TEMP343);
            
//#line 226
final int X10_TEMP346 =
              (i %
                 X10_TEMP17);
            
//#line 228
final int X10_TEMP18 =
              (X10_TEMP346);
            
//#line 229
final int X10_TEMP349 =
              (0);
            
//#line 231
final int X10_TEMP19 =
              (X10_TEMP349);
            
//#line 232
final boolean X10_TEMP21 =
              (X10_TEMP18 ==
                 X10_TEMP19);
            
//#line 233
if (X10_TEMP21) {
                
//#line 234
final int X10_TEMP354 =
                  (i);
                
//#line 236
int i1 =
                  (X10_TEMP354);
                
//#line 237
final int X10_TEMP357 =
                  (i);
                
//#line 239
int i2 =
                  (X10_TEMP357);
                
//#line 240
final int X10_TEMP360 =
                  (0);
                
//#line 242
int ik =
                  (X10_TEMP360);
                
//#line 243
final int X10_TEMP363 =
                  (0);
                
//#line 245
int x1 =
                  (X10_TEMP363);
                
//#line 246
final int X10_TEMP366 =
                  (0);
                
//#line 248
int x2 =
                  (X10_TEMP366);
                
//#line 249
final int X10_TEMP369 =
                  (0);
                
//#line 251
int x3 =
                  (X10_TEMP369);
                
//#line 252
final int X10_TEMP372 =
                  (0);
                
//#line 254
int x4 =
                  (X10_TEMP372);
                
//#line 255
final int X10_TEMP375 =
                  (0);
                
//#line 257
int t1 =
                  (X10_TEMP375);
                
//#line 258
final int X10_TEMP378 =
                  (0);
                
//#line 260
int t2 =
                  (X10_TEMP378);
                
//#line 261
final int X10_TEMP381 =
                  (0);
                
//#line 263
int r =
                  (X10_TEMP381);
                
//#line 264
final int X10_TEMP384 =
                  (0);
                
//#line 266
final int X10_TEMP33 =
                  (X10_TEMP384);
                
//#line 267
final int X10_TEMP387 =
                  (X10_TEMP33);
                
//#line 269
ik =
                  ((X10_TEMP387));
                
//#line 270
final int X10_TEMP390 =
                  (8);
                
//#line 272
final int X10_TEMP35 =
                  (X10_TEMP390);
                
//#line 273
final int X10_TEMP393 =
                  (X10_TEMP35);
                
//#line 275
r =
                  ((X10_TEMP393));
                
//#line 276
final int X10_TEMP396 =
                  (i1);
                
//#line 278
final int X10_TEMP36 =
                  (X10_TEMP396);
                
//#line 279
final int X10_TEMP37 =
                  (1);
                
//#line 280
final int X10_TEMP400 =
                  (i1 +
                     X10_TEMP37);
                
//#line 281
i1 =
                  ((X10_TEMP400));
                
//#line 282
final byte X10_TEMP403 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP36))/* } */));
                
//#line 284
final byte X10_TEMP39 =
                  (byte)
                    (((byte)
                        X10_TEMP403));
                
//#line 285
final int X10_TEMP406 =
                  (255);
                
//#line 287
final int X10_TEMP40 =
                  (X10_TEMP406);
                
//#line 288
final int X10_TEMP409 =
                  (X10_TEMP39 &
                     X10_TEMP40);
                
//#line 290
final int X10_TEMP42 =
                  (X10_TEMP409);
                
//#line 291
final int X10_TEMP412 =
                  (X10_TEMP42);
                
//#line 293
x1 =
                  ((X10_TEMP412));
                
//#line 294
final int X10_TEMP415 =
                  (i1);
                
//#line 296
final int X10_TEMP43 =
                  (X10_TEMP415);
                
//#line 297
final int X10_TEMP44 =
                  (1);
                
//#line 298
final int X10_TEMP419 =
                  (i1 +
                     X10_TEMP44);
                
//#line 299
i1 =
                  ((X10_TEMP419));
                
//#line 300
final byte X10_TEMP422 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP43))/* } */));
                
//#line 302
final byte X10_TEMP46 =
                  (byte)
                    (((byte)
                        X10_TEMP422));
                
//#line 303
final int X10_TEMP425 =
                  (255);
                
//#line 305
final int X10_TEMP47 =
                  (X10_TEMP425);
                
//#line 306
final int X10_TEMP428 =
                  (X10_TEMP46 &
                     X10_TEMP47);
                
//#line 308
final int X10_TEMP49 =
                  (X10_TEMP428);
                
//#line 309
final int X10_TEMP431 =
                  (8);
                
//#line 311
final int X10_TEMP50 =
                  (X10_TEMP431);
                
//#line 312
final int X10_TEMP434 =
                  (X10_TEMP49 <<
                     X10_TEMP50);
                
//#line 314
final int X10_TEMP52 =
                  (X10_TEMP434);
                
//#line 315
final int X10_TEMP437 =
                  (x1 |
                     X10_TEMP52);
                
//#line 317
x1 =
                  ((X10_TEMP437));
                
//#line 318
final int X10_TEMP440 =
                  (i1);
                
//#line 320
final int X10_TEMP53 =
                  (X10_TEMP440);
                
//#line 321
final int X10_TEMP54 =
                  (1);
                
//#line 322
final int X10_TEMP444 =
                  (i1 +
                     X10_TEMP54);
                
//#line 323
i1 =
                  ((X10_TEMP444));
                
//#line 324
final byte X10_TEMP447 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP53))/* } */));
                
//#line 326
final byte X10_TEMP56 =
                  (byte)
                    (((byte)
                        X10_TEMP447));
                
//#line 327
final int X10_TEMP450 =
                  (255);
                
//#line 329
final int X10_TEMP57 =
                  (X10_TEMP450);
                
//#line 330
final int X10_TEMP453 =
                  (X10_TEMP56 &
                     X10_TEMP57);
                
//#line 332
final int X10_TEMP59 =
                  (X10_TEMP453);
                
//#line 333
final int X10_TEMP456 =
                  (X10_TEMP59);
                
//#line 335
x2 =
                  ((X10_TEMP456));
                
//#line 336
final int X10_TEMP459 =
                  (i1);
                
//#line 338
final int X10_TEMP60 =
                  (X10_TEMP459);
                
//#line 339
final int X10_TEMP61 =
                  (1);
                
//#line 340
final int X10_TEMP463 =
                  (i1 +
                     X10_TEMP61);
                
//#line 341
i1 =
                  ((X10_TEMP463));
                
//#line 342
final byte X10_TEMP466 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP60))/* } */));
                
//#line 344
final byte X10_TEMP63 =
                  (byte)
                    (((byte)
                        X10_TEMP466));
                
//#line 345
final int X10_TEMP469 =
                  (255);
                
//#line 347
final int X10_TEMP64 =
                  (X10_TEMP469);
                
//#line 348
final int X10_TEMP472 =
                  (X10_TEMP63 &
                     X10_TEMP64);
                
//#line 350
final int X10_TEMP66 =
                  (X10_TEMP472);
                
//#line 351
final int X10_TEMP475 =
                  (8);
                
//#line 353
final int X10_TEMP67 =
                  (X10_TEMP475);
                
//#line 354
final int X10_TEMP478 =
                  (X10_TEMP66 <<
                     X10_TEMP67);
                
//#line 356
final int X10_TEMP69 =
                  (X10_TEMP478);
                
//#line 357
final int X10_TEMP481 =
                  (x2 |
                     X10_TEMP69);
                
//#line 359
x2 =
                  ((X10_TEMP481));
                
//#line 360
final int X10_TEMP484 =
                  (i1);
                
//#line 362
final int X10_TEMP70 =
                  (X10_TEMP484);
                
//#line 363
final int X10_TEMP71 =
                  (1);
                
//#line 364
final int X10_TEMP488 =
                  (i1 +
                     X10_TEMP71);
                
//#line 365
i1 =
                  ((X10_TEMP488));
                
//#line 366
final byte X10_TEMP491 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP70))/* } */));
                
//#line 368
final byte X10_TEMP73 =
                  (byte)
                    (((byte)
                        X10_TEMP491));
                
//#line 369
final int X10_TEMP494 =
                  (255);
                
//#line 371
final int X10_TEMP74 =
                  (X10_TEMP494);
                
//#line 372
final int X10_TEMP497 =
                  (X10_TEMP73 &
                     X10_TEMP74);
                
//#line 374
final int X10_TEMP76 =
                  (X10_TEMP497);
                
//#line 375
final int X10_TEMP500 =
                  (X10_TEMP76);
                
//#line 377
x3 =
                  ((X10_TEMP500));
                
//#line 378
final int X10_TEMP503 =
                  (i1);
                
//#line 380
final int X10_TEMP77 =
                  (X10_TEMP503);
                
//#line 381
final int X10_TEMP78 =
                  (1);
                
//#line 382
final int X10_TEMP507 =
                  (i1 +
                     X10_TEMP78);
                
//#line 383
i1 =
                  ((X10_TEMP507));
                
//#line 384
final byte X10_TEMP510 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP77))/* } */));
                
//#line 386
final byte X10_TEMP80 =
                  (byte)
                    (((byte)
                        X10_TEMP510));
                
//#line 387
final int X10_TEMP513 =
                  (255);
                
//#line 389
final int X10_TEMP81 =
                  (X10_TEMP513);
                
//#line 390
final int X10_TEMP516 =
                  (X10_TEMP80 &
                     X10_TEMP81);
                
//#line 392
final int X10_TEMP83 =
                  (X10_TEMP516);
                
//#line 393
final int X10_TEMP519 =
                  (8);
                
//#line 395
final int X10_TEMP84 =
                  (X10_TEMP519);
                
//#line 396
final int X10_TEMP522 =
                  (X10_TEMP83 <<
                     X10_TEMP84);
                
//#line 398
final int X10_TEMP86 =
                  (X10_TEMP522);
                
//#line 399
final int X10_TEMP525 =
                  (x3 |
                     X10_TEMP86);
                
//#line 401
x3 =
                  ((X10_TEMP525));
                
//#line 402
final int X10_TEMP528 =
                  (i1);
                
//#line 404
final int X10_TEMP87 =
                  (X10_TEMP528);
                
//#line 405
final int X10_TEMP88 =
                  (1);
                
//#line 406
final int X10_TEMP532 =
                  (i1 +
                     X10_TEMP88);
                
//#line 407
i1 =
                  ((X10_TEMP532));
                
//#line 408
final byte X10_TEMP535 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP87))/* } */));
                
//#line 410
final byte X10_TEMP90 =
                  (byte)
                    (((byte)
                        X10_TEMP535));
                
//#line 411
final int X10_TEMP538 =
                  (255);
                
//#line 413
final int X10_TEMP91 =
                  (X10_TEMP538);
                
//#line 414
final int X10_TEMP541 =
                  (X10_TEMP90 &
                     X10_TEMP91);
                
//#line 416
final int X10_TEMP93 =
                  (X10_TEMP541);
                
//#line 417
final int X10_TEMP544 =
                  (X10_TEMP93);
                
//#line 419
x4 =
                  ((X10_TEMP544));
                
//#line 420
final int X10_TEMP547 =
                  (i1);
                
//#line 422
final int X10_TEMP94 =
                  (X10_TEMP547);
                
//#line 423
final int X10_TEMP95 =
                  (1);
                
//#line 424
final int X10_TEMP551 =
                  (i1 +
                     X10_TEMP95);
                
//#line 425
i1 =
                  ((X10_TEMP551));
                
//#line 426
final byte X10_TEMP554 =
                  (byte)
                    ((/* template:array_get { */((text1).get(X10_TEMP94))/* } */));
                
//#line 428
final byte X10_TEMP97 =
                  (byte)
                    (((byte)
                        X10_TEMP554));
                
//#line 429
final int X10_TEMP557 =
                  (255);
                
//#line 431
final int X10_TEMP98 =
                  (X10_TEMP557);
                
//#line 432
final int X10_TEMP560 =
                  (X10_TEMP97 &
                     X10_TEMP98);
                
//#line 434
final int X10_TEMP100 =
                  (X10_TEMP560);
                
//#line 435
final int X10_TEMP563 =
                  (8);
                
//#line 437
final int X10_TEMP101 =
                  (X10_TEMP563);
                
//#line 438
final int X10_TEMP566 =
                  (X10_TEMP100 <<
                     X10_TEMP101);
                
//#line 440
final int X10_TEMP103 =
                  (X10_TEMP566);
                
//#line 441
final int X10_TEMP569 =
                  (x4 |
                     X10_TEMP103);
                
//#line 443
x4 =
                  ((X10_TEMP569));
                
//#line 444
boolean X10_TEMP104 =
                  (false);
                
//#line 445
boolean X10_TEMP572 =
                  false;
                
//#line 446
do  {
                    
//#line 447
final long X10_TEMP574 =
                      ((long)
                         x1);
                    
//#line 449
final long X10_TEMP108 =
                      (X10_TEMP574);
                    
//#line 450
final int X10_TEMP577 =
                      (ik);
                    
//#line 452
final int X10_TEMP105 =
                      (X10_TEMP577);
                    
//#line 453
final int X10_TEMP106 =
                      (1);
                    
//#line 454
final int X10_TEMP581 =
                      (ik +
                         X10_TEMP106);
                    
//#line 455
ik =
                      ((X10_TEMP581));
                    
//#line 456
final int X10_TEMP584 =
                      (/* template:array_get { */((key).get(X10_TEMP105))/* } */);
                    
//#line 458
final int X10_TEMP109 =
                      (X10_TEMP584);
                    
//#line 459
final long X10_TEMP587 =
                      (X10_TEMP108 *
                         X10_TEMP109);
                    
//#line 461
final long X10_TEMP110 =
                      (X10_TEMP587);
                    
//#line 462
final long X10_TEMP590 =
                      (65537L);
                    
//#line 464
final long X10_TEMP111 =
                      (X10_TEMP590);
                    
//#line 465
final long X10_TEMP593 =
                      (X10_TEMP110 %
                         X10_TEMP111);
                    
//#line 467
final long X10_TEMP112 =
                      (X10_TEMP593);
                    
//#line 468
final int X10_TEMP596 =
                      (65535);
                    
//#line 470
final int X10_TEMP113 =
                      (X10_TEMP596);
                    
//#line 471
final long X10_TEMP599 =
                      (X10_TEMP112 &
                         X10_TEMP113);
                    
//#line 473
final long X10_TEMP115 =
                      (X10_TEMP599);
                    
//#line 474
final int X10_TEMP602 =
                      ((int)
                         X10_TEMP115);
                    
//#line 476
final int X10_TEMP117 =
                      (X10_TEMP602);
                    
//#line 477
final int X10_TEMP605 =
                      (X10_TEMP117);
                    
//#line 479
x1 =
                      ((X10_TEMP605));
                    
//#line 480
final int X10_TEMP608 =
                      (ik);
                    
//#line 482
final int X10_TEMP118 =
                      (X10_TEMP608);
                    
//#line 483
final int X10_TEMP119 =
                      (1);
                    
//#line 484
final int X10_TEMP612 =
                      (ik +
                         X10_TEMP119);
                    
//#line 485
ik =
                      ((X10_TEMP612));
                    
//#line 486
final int X10_TEMP615 =
                      (/* template:array_get { */((key).get(X10_TEMP118))/* } */);
                    
//#line 488
final int X10_TEMP121 =
                      (X10_TEMP615);
                    
//#line 489
final int X10_TEMP618 =
                      (x2 +
                         X10_TEMP121);
                    
//#line 491
final int X10_TEMP122 =
                      (X10_TEMP618);
                    
//#line 492
final int X10_TEMP621 =
                      (65535);
                    
//#line 494
final int X10_TEMP123 =
                      (X10_TEMP621);
                    
//#line 495
final int X10_TEMP624 =
                      (X10_TEMP122 &
                         X10_TEMP123);
                    
//#line 497
final int X10_TEMP125 =
                      (X10_TEMP624);
                    
//#line 498
final int X10_TEMP627 =
                      (X10_TEMP125);
                    
//#line 500
x2 =
                      ((X10_TEMP627));
                    
//#line 501
final int X10_TEMP630 =
                      (ik);
                    
//#line 503
final int X10_TEMP126 =
                      (X10_TEMP630);
                    
//#line 504
final int X10_TEMP127 =
                      (1);
                    
//#line 505
final int X10_TEMP634 =
                      (ik +
                         X10_TEMP127);
                    
//#line 506
ik =
                      ((X10_TEMP634));
                    
//#line 507
final int X10_TEMP637 =
                      (/* template:array_get { */((key).get(X10_TEMP126))/* } */);
                    
//#line 509
final int X10_TEMP129 =
                      (X10_TEMP637);
                    
//#line 510
final int X10_TEMP640 =
                      (x3 +
                         X10_TEMP129);
                    
//#line 512
final int X10_TEMP130 =
                      (X10_TEMP640);
                    
//#line 513
final int X10_TEMP643 =
                      (65535);
                    
//#line 515
final int X10_TEMP131 =
                      (X10_TEMP643);
                    
//#line 516
final int X10_TEMP646 =
                      (X10_TEMP130 &
                         X10_TEMP131);
                    
//#line 518
final int X10_TEMP133 =
                      (X10_TEMP646);
                    
//#line 519
final int X10_TEMP649 =
                      (X10_TEMP133);
                    
//#line 521
x3 =
                      ((X10_TEMP649));
                    
//#line 522
final long X10_TEMP652 =
                      ((long)
                         x4);
                    
//#line 524
final long X10_TEMP137 =
                      (X10_TEMP652);
                    
//#line 525
final int X10_TEMP655 =
                      (ik);
                    
//#line 527
final int X10_TEMP134 =
                      (X10_TEMP655);
                    
//#line 528
final int X10_TEMP135 =
                      (1);
                    
//#line 529
final int X10_TEMP659 =
                      (ik +
                         X10_TEMP135);
                    
//#line 530
ik =
                      ((X10_TEMP659));
                    
//#line 531
final int X10_TEMP662 =
                      (/* template:array_get { */((key).get(X10_TEMP134))/* } */);
                    
//#line 533
final int X10_TEMP138 =
                      (X10_TEMP662);
                    
//#line 534
final long X10_TEMP665 =
                      (X10_TEMP137 *
                         X10_TEMP138);
                    
//#line 536
final long X10_TEMP139 =
                      (X10_TEMP665);
                    
//#line 537
final long X10_TEMP668 =
                      (65537L);
                    
//#line 539
final long X10_TEMP140 =
                      (X10_TEMP668);
                    
//#line 540
final long X10_TEMP671 =
                      (X10_TEMP139 %
                         X10_TEMP140);
                    
//#line 542
final long X10_TEMP141 =
                      (X10_TEMP671);
                    
//#line 543
final int X10_TEMP674 =
                      (65535);
                    
//#line 545
final int X10_TEMP142 =
                      (X10_TEMP674);
                    
//#line 546
final long X10_TEMP677 =
                      (X10_TEMP141 &
                         X10_TEMP142);
                    
//#line 548
final long X10_TEMP144 =
                      (X10_TEMP677);
                    
//#line 549
final int X10_TEMP680 =
                      ((int)
                         X10_TEMP144);
                    
//#line 551
final int X10_TEMP146 =
                      (X10_TEMP680);
                    
//#line 552
final int X10_TEMP683 =
                      (X10_TEMP146);
                    
//#line 554
x4 =
                      ((X10_TEMP683));
                    
//#line 555
final int X10_TEMP686 =
                      (x1 ^
                         x3);
                    
//#line 557
final int X10_TEMP148 =
                      (X10_TEMP686);
                    
//#line 558
final int X10_TEMP689 =
                      (X10_TEMP148);
                    
//#line 560
t2 =
                      ((X10_TEMP689));
                    
//#line 561
final long X10_TEMP692 =
                      ((long)
                         t2);
                    
//#line 563
final long X10_TEMP152 =
                      (X10_TEMP692);
                    
//#line 564
final int X10_TEMP695 =
                      (ik);
                    
//#line 566
final int X10_TEMP149 =
                      (X10_TEMP695);
                    
//#line 567
final int X10_TEMP150 =
                      (1);
                    
//#line 568
final int X10_TEMP699 =
                      (ik +
                         X10_TEMP150);
                    
//#line 569
ik =
                      ((X10_TEMP699));
                    
//#line 570
final int X10_TEMP702 =
                      (/* template:array_get { */((key).get(X10_TEMP149))/* } */);
                    
//#line 572
final int X10_TEMP153 =
                      (X10_TEMP702);
                    
//#line 573
final long X10_TEMP705 =
                      (X10_TEMP152 *
                         X10_TEMP153);
                    
//#line 575
final long X10_TEMP154 =
                      (X10_TEMP705);
                    
//#line 576
final long X10_TEMP708 =
                      (65537L);
                    
//#line 578
final long X10_TEMP155 =
                      (X10_TEMP708);
                    
//#line 579
final long X10_TEMP711 =
                      (X10_TEMP154 %
                         X10_TEMP155);
                    
//#line 581
final long X10_TEMP156 =
                      (X10_TEMP711);
                    
//#line 582
final int X10_TEMP714 =
                      (65535);
                    
//#line 584
final int X10_TEMP157 =
                      (X10_TEMP714);
                    
//#line 585
final long X10_TEMP717 =
                      (X10_TEMP156 &
                         X10_TEMP157);
                    
//#line 587
final long X10_TEMP159 =
                      (X10_TEMP717);
                    
//#line 588
final int X10_TEMP720 =
                      ((int)
                         X10_TEMP159);
                    
//#line 590
final int X10_TEMP161 =
                      (X10_TEMP720);
                    
//#line 591
final int X10_TEMP723 =
                      (X10_TEMP161);
                    
//#line 593
t2 =
                      ((X10_TEMP723));
                    
//#line 594
final int X10_TEMP726 =
                      (x2 ^
                         x4);
                    
//#line 596
final int X10_TEMP163 =
                      (X10_TEMP726);
                    
//#line 597
final int X10_TEMP729 =
                      (t2 +
                         X10_TEMP163);
                    
//#line 599
final int X10_TEMP164 =
                      (X10_TEMP729);
                    
//#line 600
final int X10_TEMP732 =
                      (65535);
                    
//#line 602
final int X10_TEMP165 =
                      (X10_TEMP732);
                    
//#line 603
final int X10_TEMP735 =
                      (X10_TEMP164 &
                         X10_TEMP165);
                    
//#line 605
final int X10_TEMP167 =
                      (X10_TEMP735);
                    
//#line 606
final int X10_TEMP738 =
                      (X10_TEMP167);
                    
//#line 608
t1 =
                      ((X10_TEMP738));
                    
//#line 609
final long X10_TEMP741 =
                      ((long)
                         t1);
                    
//#line 611
final long X10_TEMP171 =
                      (X10_TEMP741);
                    
//#line 612
final int X10_TEMP744 =
                      (ik);
                    
//#line 614
final int X10_TEMP168 =
                      (X10_TEMP744);
                    
//#line 615
final int X10_TEMP169 =
                      (1);
                    
//#line 616
final int X10_TEMP748 =
                      (ik +
                         X10_TEMP169);
                    
//#line 617
ik =
                      ((X10_TEMP748));
                    
//#line 618
final int X10_TEMP751 =
                      (/* template:array_get { */((key).get(X10_TEMP168))/* } */);
                    
//#line 620
final int X10_TEMP172 =
                      (X10_TEMP751);
                    
//#line 621
final long X10_TEMP754 =
                      (X10_TEMP171 *
                         X10_TEMP172);
                    
//#line 623
final long X10_TEMP173 =
                      (X10_TEMP754);
                    
//#line 624
final long X10_TEMP757 =
                      (65537L);
                    
//#line 626
final long X10_TEMP174 =
                      (X10_TEMP757);
                    
//#line 627
final long X10_TEMP760 =
                      (X10_TEMP173 %
                         X10_TEMP174);
                    
//#line 629
final long X10_TEMP175 =
                      (X10_TEMP760);
                    
//#line 630
final int X10_TEMP763 =
                      (65535);
                    
//#line 632
final int X10_TEMP176 =
                      (X10_TEMP763);
                    
//#line 633
final long X10_TEMP766 =
                      (X10_TEMP175 &
                         X10_TEMP176);
                    
//#line 635
final long X10_TEMP178 =
                      (X10_TEMP766);
                    
//#line 636
final int X10_TEMP769 =
                      ((int)
                         X10_TEMP178);
                    
//#line 638
final int X10_TEMP180 =
                      (X10_TEMP769);
                    
//#line 639
final int X10_TEMP772 =
                      (X10_TEMP180);
                    
//#line 641
t1 =
                      ((X10_TEMP772));
                    
//#line 642
final int X10_TEMP775 =
                      (t1 +
                         t2);
                    
//#line 644
final int X10_TEMP181 =
                      (X10_TEMP775);
                    
//#line 645
final int X10_TEMP778 =
                      (65535);
                    
//#line 647
final int X10_TEMP182 =
                      (X10_TEMP778);
                    
//#line 648
final int X10_TEMP781 =
                      (X10_TEMP181 &
                         X10_TEMP182);
                    
//#line 650
final int X10_TEMP184 =
                      (X10_TEMP781);
                    
//#line 651
final int X10_TEMP784 =
                      (X10_TEMP184);
                    
//#line 653
t2 =
                      ((X10_TEMP784));
                    
//#line 654
final int X10_TEMP787 =
                      (x1 ^
                         t1);
                    
//#line 656
x1 =
                      ((X10_TEMP787));
                    
//#line 657
final int X10_TEMP790 =
                      (x4 ^
                         t2);
                    
//#line 659
x4 =
                      ((X10_TEMP790));
                    
//#line 660
final int X10_TEMP793 =
                      (t2 ^
                         x2);
                    
//#line 662
t2 =
                      ((X10_TEMP793));
                    
//#line 663
final int X10_TEMP796 =
                      (x3 ^
                         t1);
                    
//#line 665
final int X10_TEMP189 =
                      (X10_TEMP796);
                    
//#line 666
final int X10_TEMP799 =
                      (X10_TEMP189);
                    
//#line 668
x2 =
                      ((X10_TEMP799));
                    
//#line 669
final int X10_TEMP802 =
                      (t2);
                    
//#line 671
x3 =
                      ((X10_TEMP802));
                    
//#line 672
final int X10_TEMP191 =
                      (1);
                    
//#line 673
final int X10_TEMP806 =
                      (r -
                         X10_TEMP191);
                    
//#line 674
r =
                      ((X10_TEMP806));
                    
//#line 675
final int X10_TEMP808 =
                      (0);
                    
//#line 677
final int X10_TEMP192 =
                      (X10_TEMP808);
                    
//#line 678
final boolean X10_TEMP811 =
                      (r !=
                         X10_TEMP192);
                    
//#line 679
X10_TEMP104 =
                      ((X10_TEMP811));
                    
//#line 680
X10_TEMP572 =
                      X10_TEMP104;
                }while(X10_TEMP572); 
                
//#line 682
final long X10_TEMP814 =
                  ((long)
                     x1);
                
//#line 684
final long X10_TEMP197 =
                  (X10_TEMP814);
                
//#line 685
final int X10_TEMP817 =
                  (ik);
                
//#line 687
final int X10_TEMP194 =
                  (X10_TEMP817);
                
//#line 688
final int X10_TEMP195 =
                  (1);
                
//#line 689
final int X10_TEMP821 =
                  (ik +
                     X10_TEMP195);
                
//#line 690
ik =
                  ((X10_TEMP821));
                
//#line 691
final int X10_TEMP824 =
                  (/* template:array_get { */((key).get(X10_TEMP194))/* } */);
                
//#line 693
final int X10_TEMP198 =
                  (X10_TEMP824);
                
//#line 694
final long X10_TEMP827 =
                  (X10_TEMP197 *
                     X10_TEMP198);
                
//#line 696
final long X10_TEMP199 =
                  (X10_TEMP827);
                
//#line 697
final long X10_TEMP830 =
                  (65537L);
                
//#line 699
final long X10_TEMP200 =
                  (X10_TEMP830);
                
//#line 700
final long X10_TEMP833 =
                  (X10_TEMP199 %
                     X10_TEMP200);
                
//#line 702
final long X10_TEMP201 =
                  (X10_TEMP833);
                
//#line 703
final int X10_TEMP836 =
                  (65535);
                
//#line 705
final int X10_TEMP202 =
                  (X10_TEMP836);
                
//#line 706
final long X10_TEMP839 =
                  (X10_TEMP201 &
                     X10_TEMP202);
                
//#line 708
final long X10_TEMP204 =
                  (X10_TEMP839);
                
//#line 709
final int X10_TEMP842 =
                  ((int)
                     X10_TEMP204);
                
//#line 711
final int X10_TEMP206 =
                  (X10_TEMP842);
                
//#line 712
final int X10_TEMP845 =
                  (X10_TEMP206);
                
//#line 714
x1 =
                  ((X10_TEMP845));
                
//#line 715
final int X10_TEMP848 =
                  (ik);
                
//#line 717
final int X10_TEMP207 =
                  (X10_TEMP848);
                
//#line 718
final int X10_TEMP208 =
                  (1);
                
//#line 719
final int X10_TEMP852 =
                  (ik +
                     X10_TEMP208);
                
//#line 720
ik =
                  ((X10_TEMP852));
                
//#line 721
final int X10_TEMP855 =
                  (/* template:array_get { */((key).get(X10_TEMP207))/* } */);
                
//#line 723
final int X10_TEMP210 =
                  (X10_TEMP855);
                
//#line 724
final int X10_TEMP858 =
                  (x3 +
                     X10_TEMP210);
                
//#line 726
final int X10_TEMP211 =
                  (X10_TEMP858);
                
//#line 727
final int X10_TEMP861 =
                  (65535);
                
//#line 729
final int X10_TEMP212 =
                  (X10_TEMP861);
                
//#line 730
final int X10_TEMP864 =
                  (X10_TEMP211 &
                     X10_TEMP212);
                
//#line 732
final int X10_TEMP214 =
                  (X10_TEMP864);
                
//#line 733
final int X10_TEMP867 =
                  (X10_TEMP214);
                
//#line 735
x3 =
                  ((X10_TEMP867));
                
//#line 736
final int X10_TEMP870 =
                  (ik);
                
//#line 738
final int X10_TEMP215 =
                  (X10_TEMP870);
                
//#line 739
final int X10_TEMP216 =
                  (1);
                
//#line 740
final int X10_TEMP874 =
                  (ik +
                     X10_TEMP216);
                
//#line 741
ik =
                  ((X10_TEMP874));
                
//#line 742
final int X10_TEMP877 =
                  (/* template:array_get { */((key).get(X10_TEMP215))/* } */);
                
//#line 744
final int X10_TEMP218 =
                  (X10_TEMP877);
                
//#line 745
final int X10_TEMP880 =
                  (x2 +
                     X10_TEMP218);
                
//#line 747
final int X10_TEMP219 =
                  (X10_TEMP880);
                
//#line 748
final int X10_TEMP883 =
                  (65535);
                
//#line 750
final int X10_TEMP220 =
                  (X10_TEMP883);
                
//#line 751
final int X10_TEMP886 =
                  (X10_TEMP219 &
                     X10_TEMP220);
                
//#line 753
final int X10_TEMP222 =
                  (X10_TEMP886);
                
//#line 754
final int X10_TEMP889 =
                  (X10_TEMP222);
                
//#line 756
x2 =
                  ((X10_TEMP889));
                
//#line 757
final long X10_TEMP892 =
                  ((long)
                     x4);
                
//#line 759
final long X10_TEMP226 =
                  (X10_TEMP892);
                
//#line 760
final int X10_TEMP895 =
                  (ik);
                
//#line 762
final int X10_TEMP223 =
                  (X10_TEMP895);
                
//#line 763
final int X10_TEMP224 =
                  (1);
                
//#line 764
final int X10_TEMP899 =
                  (ik +
                     X10_TEMP224);
                
//#line 765
ik =
                  ((X10_TEMP899));
                
//#line 766
final int X10_TEMP902 =
                  (/* template:array_get { */((key).get(X10_TEMP223))/* } */);
                
//#line 768
final int X10_TEMP227 =
                  (X10_TEMP902);
                
//#line 769
final long X10_TEMP905 =
                  (X10_TEMP226 *
                     X10_TEMP227);
                
//#line 771
final long X10_TEMP228 =
                  (X10_TEMP905);
                
//#line 772
final long X10_TEMP908 =
                  (65537L);
                
//#line 774
final long X10_TEMP229 =
                  (X10_TEMP908);
                
//#line 775
final long X10_TEMP911 =
                  (X10_TEMP228 %
                     X10_TEMP229);
                
//#line 777
final long X10_TEMP230 =
                  (X10_TEMP911);
                
//#line 778
final int X10_TEMP914 =
                  (65535);
                
//#line 780
final int X10_TEMP231 =
                  (X10_TEMP914);
                
//#line 781
final long X10_TEMP917 =
                  (X10_TEMP230 &
                     X10_TEMP231);
                
//#line 783
final long X10_TEMP233 =
                  (X10_TEMP917);
                
//#line 784
final int X10_TEMP920 =
                  ((int)
                     X10_TEMP233);
                
//#line 786
final int X10_TEMP235 =
                  (X10_TEMP920);
                
//#line 787
final int X10_TEMP923 =
                  (X10_TEMP235);
                
//#line 789
x4 =
                  ((X10_TEMP923));
                
//#line 790
final int X10_TEMP926 =
                  (i2);
                
//#line 792
final int X10_TEMP236 =
                  (X10_TEMP926);
                
//#line 793
final int X10_TEMP237 =
                  (1);
                
//#line 794
final int X10_TEMP930 =
                  (i2 +
                     X10_TEMP237);
                
//#line 795
i2 =
                  ((X10_TEMP930));
                
//#line 796
final byte X10_TEMP932 =
                  (byte)
                    (((byte)
                        x1));
                
//#line 798
final byte X10_TEMP241 =
                  (byte)
                    (((byte)
                        X10_TEMP932));
                
//#line 799
final byte X10_TEMP935 =
                  (byte)
                    ((X10_TEMP241));
                
//#line 801
final byte X10_TEMP242 =
                  (byte)
                    (((byte)
                        X10_TEMP935));
                
//#line 802
final byte X10_TEMP939 =
                  (byte)
                    ((X10_TEMP242));
                
//#line 804
final byte X10_TEMP942 =
                  (byte)
                    ((X10_TEMP939));
                
//#line 805
/* template:array_set { */(text2).set((X10_TEMP942),X10_TEMP236)/* } */;
                
//#line 806
final int X10_TEMP944 =
                  (i2);
                
//#line 808
final int X10_TEMP243 =
                  (X10_TEMP944);
                
//#line 809
final int X10_TEMP244 =
                  (1);
                
//#line 810
final int X10_TEMP948 =
                  (i2 +
                     X10_TEMP244);
                
//#line 811
i2 =
                  ((X10_TEMP948));
                
//#line 812
final int X10_TEMP950 =
                  (8);
                
//#line 814
final int X10_TEMP246 =
                  (X10_TEMP950);
                
//#line 815
final int X10_TEMP953 =
                  (x1 >>>
                     X10_TEMP246);
                
//#line 817
final int X10_TEMP248 =
                  (X10_TEMP953);
                
//#line 818
final byte X10_TEMP956 =
                  (byte)
                    (((byte)
                        X10_TEMP248));
                
//#line 820
final byte X10_TEMP251 =
                  (byte)
                    (((byte)
                        X10_TEMP956));
                
//#line 821
final byte X10_TEMP959 =
                  (byte)
                    ((X10_TEMP251));
                
//#line 823
final byte X10_TEMP252 =
                  (byte)
                    (((byte)
                        X10_TEMP959));
                
//#line 824
final byte X10_TEMP963 =
                  (byte)
                    ((X10_TEMP252));
                
//#line 826
final byte X10_TEMP966 =
                  (byte)
                    ((X10_TEMP963));
                
//#line 827
/* template:array_set { */(text2).set((X10_TEMP966),X10_TEMP243)/* } */;
                
//#line 828
final int X10_TEMP968 =
                  (i2);
                
//#line 830
final int X10_TEMP253 =
                  (X10_TEMP968);
                
//#line 831
final int X10_TEMP254 =
                  (1);
                
//#line 832
final int X10_TEMP972 =
                  (i2 +
                     X10_TEMP254);
                
//#line 833
i2 =
                  ((X10_TEMP972));
                
//#line 834
final byte X10_TEMP974 =
                  (byte)
                    (((byte)
                        x3));
                
//#line 836
final byte X10_TEMP258 =
                  (byte)
                    (((byte)
                        X10_TEMP974));
                
//#line 837
final byte X10_TEMP977 =
                  (byte)
                    ((X10_TEMP258));
                
//#line 839
final byte X10_TEMP259 =
                  (byte)
                    (((byte)
                        X10_TEMP977));
                
//#line 840
final byte X10_TEMP981 =
                  (byte)
                    ((X10_TEMP259));
                
//#line 842
final byte X10_TEMP984 =
                  (byte)
                    ((X10_TEMP981));
                
//#line 843
/* template:array_set { */(text2).set((X10_TEMP984),X10_TEMP253)/* } */;
                
//#line 844
final int X10_TEMP986 =
                  (i2);
                
//#line 846
final int X10_TEMP260 =
                  (X10_TEMP986);
                
//#line 847
final int X10_TEMP261 =
                  (1);
                
//#line 848
final int X10_TEMP990 =
                  (i2 +
                     X10_TEMP261);
                
//#line 849
i2 =
                  ((X10_TEMP990));
                
//#line 850
final int X10_TEMP992 =
                  (8);
                
//#line 852
final int X10_TEMP263 =
                  (X10_TEMP992);
                
//#line 853
final int X10_TEMP995 =
                  (x3 >>>
                     X10_TEMP263);
                
//#line 855
final int X10_TEMP265 =
                  (X10_TEMP995);
                
//#line 856
final byte X10_TEMP998 =
                  (byte)
                    (((byte)
                        X10_TEMP265));
                
//#line 858
final byte X10_TEMP268 =
                  (byte)
                    (((byte)
                        X10_TEMP998));
                
//#line 859
final byte X10_TEMP1001 =
                  (byte)
                    ((X10_TEMP268));
                
//#line 861
final byte X10_TEMP269 =
                  (byte)
                    (((byte)
                        X10_TEMP1001));
                
//#line 862
final byte X10_TEMP1005 =
                  (byte)
                    ((X10_TEMP269));
                
//#line 864
final byte X10_TEMP1008 =
                  (byte)
                    ((X10_TEMP1005));
                
//#line 865
/* template:array_set { */(text2).set((X10_TEMP1008),X10_TEMP260)/* } */;
                
//#line 866
final int X10_TEMP1010 =
                  (i2);
                
//#line 868
final int X10_TEMP270 =
                  (X10_TEMP1010);
                
//#line 869
final int X10_TEMP271 =
                  (1);
                
//#line 870
final int X10_TEMP1014 =
                  (i2 +
                     X10_TEMP271);
                
//#line 871
i2 =
                  ((X10_TEMP1014));
                
//#line 872
final byte X10_TEMP1016 =
                  (byte)
                    (((byte)
                        x2));
                
//#line 874
final byte X10_TEMP275 =
                  (byte)
                    (((byte)
                        X10_TEMP1016));
                
//#line 875
final byte X10_TEMP1019 =
                  (byte)
                    ((X10_TEMP275));
                
//#line 877
final byte X10_TEMP276 =
                  (byte)
                    (((byte)
                        X10_TEMP1019));
                
//#line 878
final byte X10_TEMP1023 =
                  (byte)
                    ((X10_TEMP276));
                
//#line 880
final byte X10_TEMP1026 =
                  (byte)
                    ((X10_TEMP1023));
                
//#line 881
/* template:array_set { */(text2).set((X10_TEMP1026),X10_TEMP270)/* } */;
                
//#line 882
final int X10_TEMP1028 =
                  (i2);
                
//#line 884
final int X10_TEMP277 =
                  (X10_TEMP1028);
                
//#line 885
final int X10_TEMP278 =
                  (1);
                
//#line 886
final int X10_TEMP1032 =
                  (i2 +
                     X10_TEMP278);
                
//#line 887
i2 =
                  ((X10_TEMP1032));
                
//#line 888
final int X10_TEMP1034 =
                  (8);
                
//#line 890
final int X10_TEMP280 =
                  (X10_TEMP1034);
                
//#line 891
final int X10_TEMP1037 =
                  (x2 >>>
                     X10_TEMP280);
                
//#line 893
final int X10_TEMP282 =
                  (X10_TEMP1037);
                
//#line 894
final byte X10_TEMP1040 =
                  (byte)
                    (((byte)
                        X10_TEMP282));
                
//#line 896
final byte X10_TEMP285 =
                  (byte)
                    (((byte)
                        X10_TEMP1040));
                
//#line 897
final byte X10_TEMP1043 =
                  (byte)
                    ((X10_TEMP285));
                
//#line 899
final byte X10_TEMP286 =
                  (byte)
                    (((byte)
                        X10_TEMP1043));
                
//#line 900
final byte X10_TEMP1047 =
                  (byte)
                    ((X10_TEMP286));
                
//#line 902
final byte X10_TEMP1050 =
                  (byte)
                    ((X10_TEMP1047));
                
//#line 903
/* template:array_set { */(text2).set((X10_TEMP1050),X10_TEMP277)/* } */;
                
//#line 904
final int X10_TEMP1052 =
                  (i2);
                
//#line 906
final int X10_TEMP287 =
                  (X10_TEMP1052);
                
//#line 907
final int X10_TEMP288 =
                  (1);
                
//#line 908
final int X10_TEMP1056 =
                  (i2 +
                     X10_TEMP288);
                
//#line 909
i2 =
                  ((X10_TEMP1056));
                
//#line 910
final byte X10_TEMP1058 =
                  (byte)
                    (((byte)
                        x4));
                
//#line 912
final byte X10_TEMP292 =
                  (byte)
                    (((byte)
                        X10_TEMP1058));
                
//#line 913
final byte X10_TEMP1061 =
                  (byte)
                    ((X10_TEMP292));
                
//#line 915
final byte X10_TEMP293 =
                  (byte)
                    (((byte)
                        X10_TEMP1061));
                
//#line 916
final byte X10_TEMP1065 =
                  (byte)
                    ((X10_TEMP293));
                
//#line 918
final byte X10_TEMP1068 =
                  (byte)
                    ((X10_TEMP1065));
                
//#line 919
/* template:array_set { */(text2).set((X10_TEMP1068),X10_TEMP287)/* } */;
                
//#line 920
final int X10_TEMP1070 =
                  (i2);
                
//#line 922
final int X10_TEMP294 =
                  (X10_TEMP1070);
                
//#line 923
final int X10_TEMP295 =
                  (1);
                
//#line 924
final int X10_TEMP1074 =
                  (i2 +
                     X10_TEMP295);
                
//#line 925
i2 =
                  ((X10_TEMP1074));
                
//#line 926
final int X10_TEMP1076 =
                  (8);
                
//#line 928
final int X10_TEMP297 =
                  (X10_TEMP1076);
                
//#line 929
final int X10_TEMP1079 =
                  (x4 >>>
                     X10_TEMP297);
                
//#line 931
final int X10_TEMP299 =
                  (X10_TEMP1079);
                
//#line 932
final byte X10_TEMP1082 =
                  (byte)
                    (((byte)
                        X10_TEMP299));
                
//#line 934
final byte X10_TEMP302 =
                  (byte)
                    (((byte)
                        X10_TEMP1082));
                
//#line 935
final byte X10_TEMP1085 =
                  (byte)
                    ((X10_TEMP302));
                
//#line 937
final byte X10_TEMP303 =
                  (byte)
                    (((byte)
                        X10_TEMP1085));
                
//#line 938
final byte X10_TEMP1089 =
                  (byte)
                    ((X10_TEMP303));
                
//#line 940
final byte X10_TEMP1092 =
                  (byte)
                    ((X10_TEMP1089));
                
//#line 941
/* template:array_set { */(text2).set((X10_TEMP1092),X10_TEMP294)/* } */;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 945
public static int
                   Program_IDEATest_mul(
                   final IDEATest X10_TEMP0,
                   final int aa,
                   final int ab) {
        
//#line 946
final int X10_TEMP306 =
          (aa);
        
//#line 948
int a =
          (X10_TEMP306);
        
//#line 949
final int X10_TEMP309 =
          (ab);
        
//#line 951
int b =
          (X10_TEMP309);
        
//#line 952
final long X10_TEMP312 =
          (0L);
        
//#line 954
long p =
          (X10_TEMP312);
        
//#line 955
final int X10_TEMP315 =
          (0);
        
//#line 957
final int X10_TEMP4 =
          (X10_TEMP315);
        
//#line 958
final boolean X10_TEMP6 =
          (a !=
             X10_TEMP4);
        
//#line 959
if (X10_TEMP6) {
            
//#line 960
final int X10_TEMP320 =
              (0);
            
//#line 962
final int X10_TEMP7 =
              (X10_TEMP320);
            
//#line 963
final boolean X10_TEMP9 =
              (b !=
                 X10_TEMP7);
            
//#line 964
if (X10_TEMP9) {
                
//#line 965
final long X10_TEMP325 =
                  ((long)
                     a);
                
//#line 967
final long X10_TEMP10 =
                  (X10_TEMP325);
                
//#line 968
final long X10_TEMP328 =
                  (X10_TEMP10 *
                     b);
                
//#line 970
final long X10_TEMP12 =
                  (X10_TEMP328);
                
//#line 971
final long X10_TEMP331 =
                  (X10_TEMP12);
                
//#line 973
p =
                  ((X10_TEMP331));
                
//#line 974
final int X10_TEMP334 =
                  ((int)
                     p);
                
//#line 976
final int X10_TEMP13 =
                  (X10_TEMP334);
                
//#line 977
final int X10_TEMP337 =
                  (65535);
                
//#line 979
final int X10_TEMP14 =
                  (X10_TEMP337);
                
//#line 980
final int X10_TEMP340 =
                  (X10_TEMP13 &
                     X10_TEMP14);
                
//#line 982
final int X10_TEMP16 =
                  (X10_TEMP340);
                
//#line 983
final int X10_TEMP343 =
                  (X10_TEMP16);
                
//#line 985
b =
                  ((X10_TEMP343));
                
//#line 986
final int X10_TEMP346 =
                  ((int)
                     p);
                
//#line 988
final int X10_TEMP17 =
                  (X10_TEMP346);
                
//#line 989
final int X10_TEMP349 =
                  (16);
                
//#line 991
final int X10_TEMP18 =
                  (X10_TEMP349);
                
//#line 992
final int X10_TEMP352 =
                  (X10_TEMP17 >>>
                     X10_TEMP18);
                
//#line 994
final int X10_TEMP20 =
                  (X10_TEMP352);
                
//#line 995
final int X10_TEMP355 =
                  (X10_TEMP20);
                
//#line 997
a =
                  ((X10_TEMP355));
                
//#line 998
final int X10_TEMP358 =
                  (b -
                     a);
                
//#line 1000
final int X10_TEMP27 =
                  (X10_TEMP358);
                
//#line 1001
final boolean X10_TEMP21 =
                  (b <
                     a);
                
//#line 1002
int X10_TEMP24 =
                  (0);
                
//#line 1003
if (X10_TEMP21) {
                    
//#line 1004
final int X10_TEMP364 =
                      (1);
                    
//#line 1005
X10_TEMP24 =
                      ((X10_TEMP364));
                }
                
//#line 1007
final int X10_TEMP25 =
                  (X10_TEMP24);
                
//#line 1008
final int X10_TEMP367 =
                  (X10_TEMP25);
                
//#line 1010
final int X10_TEMP26 =
                  (X10_TEMP367);
                
//#line 1011
final int X10_TEMP370 =
                  (X10_TEMP27 +
                     X10_TEMP26);
                
//#line 1013
final int X10_TEMP28 =
                  (X10_TEMP370);
                
//#line 1014
final int X10_TEMP373 =
                  (65535);
                
//#line 1016
final int X10_TEMP29 =
                  (X10_TEMP373);
                
//#line 1017
final int X10_TEMP376 =
                  (X10_TEMP28 &
                     X10_TEMP29);
                
//#line 1019
final int X10_TEMP31 =
                  (X10_TEMP376);
                
//#line 1020
return X10_TEMP31;
            } else {
                
//#line 1023
final int X10_TEMP380 =
                  (1);
                
//#line 1025
final int X10_TEMP33 =
                  (X10_TEMP380);
                
//#line 1026
final int X10_TEMP383 =
                  (X10_TEMP33 -
                     a);
                
//#line 1028
final int X10_TEMP35 =
                  (X10_TEMP383);
                
//#line 1029
final int X10_TEMP386 =
                  (65535);
                
//#line 1031
final int X10_TEMP36 =
                  (X10_TEMP386);
                
//#line 1032
final int X10_TEMP389 =
                  (X10_TEMP35 &
                     X10_TEMP36);
                
//#line 1034
final int X10_TEMP38 =
                  (X10_TEMP389);
                
//#line 1035
return X10_TEMP38;
            }
        } else {
            
//#line 1039
final int X10_TEMP393 =
              (1);
            
//#line 1041
final int X10_TEMP40 =
              (X10_TEMP393);
            
//#line 1042
final int X10_TEMP396 =
              (X10_TEMP40 -
                 b);
            
//#line 1044
final int X10_TEMP42 =
              (X10_TEMP396);
            
//#line 1045
final int X10_TEMP399 =
              (65535);
            
//#line 1047
final int X10_TEMP43 =
              (X10_TEMP399);
            
//#line 1048
final int X10_TEMP402 =
              (X10_TEMP42 &
                 X10_TEMP43);
            
//#line 1050
final int X10_TEMP45 =
              (X10_TEMP402);
            
//#line 1051
return X10_TEMP45;
        }
    }
    
    
//#line 1054
public static void
                    Program_runMain(
                    ) {
        
//#line 1055
final Timer X10_TEMP306 =
          (new Timer(
             ));
        
//#line 1057
Timer tmr =
          (X10_TEMP306);
        
//#line 1058
final int X10_TEMP309 =
          (0);
        
//#line 1060
int count =
          (X10_TEMP309);
        
//#line 1061
Program0.
                        Program_Timer_start(
                        tmr,
                        count);
        
//#line 1062
final IDEATest X10_TEMP314 =
          (new IDEATest(
             ));
        
//#line 1064
final IDEATest X10_TEMP4 =
          (X10_TEMP314);
        
//#line 1065
Program0.
                        Program_IDEATest_run(
                        X10_TEMP4);
        
//#line 1066
Program0.
                        Program_Timer_stop(
                        tmr,
                        count);
        
//#line 1067
final java.
          lang.
          String X10_TEMP320 =
          ("Wall-clock time for crypt: ");
        
//#line 1069
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP320);
        
//#line 1070
final double X10_TEMP325 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 1072
final double X10_TEMP8 =
          (X10_TEMP325);
        
//#line 1073
final java.
          lang.
          String X10_TEMP328 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 1075
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP328);
        
//#line 1076
final java.
          lang.
          String X10_TEMP331 =
          (" secs");
        
//#line 1078
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP331);
        
//#line 1079
final java.
          lang.
          String X10_TEMP334 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 1081
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP334);
        
//#line 1082
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 1084
public static long
                    Program__Random_multiplier_init(
                    ) {
        
//#line 1085
final long X10_TEMP306 =
          (25214903917L);
        
//#line 1087
final long X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1088
return X10_TEMP2;
    }
    
    
//#line 1090
public static long
                    Program__Random_addend_init(
                    ) {
        
//#line 1091
final long X10_TEMP306 =
          (11L);
        
//#line 1093
final long X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1094
return X10_TEMP2;
    }
    
    
//#line 1096
public static long
                    Program__Random_mask_init(
                    ) {
        
//#line 1097
final long X10_TEMP306 =
          (1L);
        
//#line 1099
final long X10_TEMP1 =
          (X10_TEMP306);
        
//#line 1100
final int X10_TEMP309 =
          (48);
        
//#line 1102
final int X10_TEMP2 =
          (X10_TEMP309);
        
//#line 1103
final long X10_TEMP312 =
          (X10_TEMP1 <<
             X10_TEMP2);
        
//#line 1105
final long X10_TEMP4 =
          (X10_TEMP312);
        
//#line 1106
final int X10_TEMP315 =
          (1);
        
//#line 1108
final int X10_TEMP5 =
          (X10_TEMP315);
        
//#line 1109
final long X10_TEMP318 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 1111
final long X10_TEMP7 =
          (X10_TEMP318);
        
//#line 1112
return X10_TEMP7;
    }
    
    
//#line 1114
public static int
                    Program_Random_nextbits(
                    final Random X10_TEMP0,
                    final int bits) {
        
//#line 1115
final long X10_TEMP306 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed);
        
//#line 1117
long oldseed =
          (X10_TEMP306);
        
//#line 1118
final long X10_TEMP309 =
          (oldseed *
             _Program__Random_multiplier);
        
//#line 1120
final long X10_TEMP2 =
          (X10_TEMP309);
        
//#line 1121
final long X10_TEMP312 =
          (X10_TEMP2 +
             _Program__Random_addend);
        
//#line 1123
final long X10_TEMP4 =
          (X10_TEMP312);
        
//#line 1124
final long X10_TEMP315 =
          (X10_TEMP4 &
             _Program__Random_mask);
        
//#line 1126
long nextseed =
          (X10_TEMP315);
        
//#line 1127
final long X10_TEMP318 =
          (nextseed);
        
//#line 1129
final long X10_TEMP8 =
          (X10_TEMP318);
        
//#line 1130
final long X10_TEMP321 =
          (X10_TEMP8);
        
//#line 1132
final long X10_TEMP324 =
          (X10_TEMP321);
        
//#line 1133
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed =
          ((X10_TEMP324));
        
//#line 1134
final int X10_TEMP326 =
          (48);
        
//#line 1136
final int X10_TEMP9 =
          (X10_TEMP326);
        
//#line 1137
final int X10_TEMP329 =
          (X10_TEMP9 -
             bits);
        
//#line 1139
final int X10_TEMP11 =
          (X10_TEMP329);
        
//#line 1140
final long X10_TEMP332 =
          (nextseed >>>
             X10_TEMP11);
        
//#line 1142
final long X10_TEMP13 =
          (X10_TEMP332);
        
//#line 1143
final int X10_TEMP335 =
          ((int)
             X10_TEMP13);
        
//#line 1145
final int X10_TEMP15 =
          (X10_TEMP335);
        
//#line 1146
return X10_TEMP15;
    }
    
    
//#line 1148
public static int
                    Program_Random_nextInt(
                    final Random X10_TEMP0) {
        
//#line 1149
final int X10_TEMP306 =
          (32);
        
//#line 1151
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1152
final int X10_TEMP311 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 1154
final int X10_TEMP4 =
          (X10_TEMP311);
        
//#line 1155
return X10_TEMP4;
    }
    
    
//#line 1157
public static long
                    Program_Random_nextLong(
                    final Random X10_TEMP0) {
        
//#line 1158
final int X10_TEMP306 =
          (32);
        
//#line 1160
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1161
final int X10_TEMP311 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 1163
final int X10_TEMP4 =
          (X10_TEMP311);
        
//#line 1164
final long X10_TEMP314 =
          ((long)
             X10_TEMP4);
        
//#line 1166
final long X10_TEMP5 =
          (X10_TEMP314);
        
//#line 1167
final int X10_TEMP317 =
          (32);
        
//#line 1169
final int X10_TEMP6 =
          (X10_TEMP317);
        
//#line 1170
final long X10_TEMP320 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 1172
final long X10_TEMP8 =
          (X10_TEMP320);
        
//#line 1173
final int X10_TEMP323 =
          (32);
        
//#line 1175
final int X10_TEMP10 =
          (X10_TEMP323);
        
//#line 1176
final int X10_TEMP328 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 1178
final int X10_TEMP11 =
          (X10_TEMP328);
        
//#line 1179
final long X10_TEMP331 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 1181
final long X10_TEMP13 =
          (X10_TEMP331);
        
//#line 1182
return X10_TEMP13;
    }
    
    
//#line 1184
public static boolean
                    Program_Random_nextBoolean(
                    final Random X10_TEMP0) {
        
//#line 1185
final int X10_TEMP306 =
          (1);
        
//#line 1187
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1188
final int X10_TEMP311 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 1190
final int X10_TEMP3 =
          (X10_TEMP311);
        
//#line 1191
final int X10_TEMP314 =
          (0);
        
//#line 1193
final int X10_TEMP4 =
          (X10_TEMP314);
        
//#line 1194
final boolean X10_TEMP317 =
          (X10_TEMP3 !=
             X10_TEMP4);
        
//#line 1196
final boolean X10_TEMP6 =
          (X10_TEMP317);
        
//#line 1197
return X10_TEMP6;
    }
    
    
//#line 1199
public static double
                    Program_Random_nextDouble(
                    final Random X10_TEMP0) {
        
//#line 1200
final int X10_TEMP306 =
          (26);
        
//#line 1202
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1203
final int X10_TEMP311 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 1205
final int X10_TEMP4 =
          (X10_TEMP311);
        
//#line 1206
final long X10_TEMP314 =
          ((long)
             X10_TEMP4);
        
//#line 1208
final long X10_TEMP5 =
          (X10_TEMP314);
        
//#line 1209
final int X10_TEMP317 =
          (27);
        
//#line 1211
final int X10_TEMP6 =
          (X10_TEMP317);
        
//#line 1212
final long X10_TEMP320 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 1214
final long X10_TEMP8 =
          (X10_TEMP320);
        
//#line 1215
final int X10_TEMP323 =
          (27);
        
//#line 1217
final int X10_TEMP10 =
          (X10_TEMP323);
        
//#line 1218
final int X10_TEMP328 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 1220
final int X10_TEMP11 =
          (X10_TEMP328);
        
//#line 1221
final long X10_TEMP331 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 1223
final long X10_TEMP13 =
          (X10_TEMP331);
        
//#line 1224
final long X10_TEMP334 =
          (1L);
        
//#line 1226
final long X10_TEMP14 =
          (X10_TEMP334);
        
//#line 1227
final int X10_TEMP337 =
          (53);
        
//#line 1229
final int X10_TEMP15 =
          (X10_TEMP337);
        
//#line 1230
final long X10_TEMP340 =
          (X10_TEMP14 <<
             X10_TEMP15);
        
//#line 1232
final long X10_TEMP17 =
          (X10_TEMP340);
        
//#line 1233
final double X10_TEMP343 =
          ((double)
             X10_TEMP17);
        
//#line 1235
final double X10_TEMP18 =
          (X10_TEMP343);
        
//#line 1236
final double X10_TEMP346 =
          (X10_TEMP13 /
             X10_TEMP18);
        
//#line 1238
final double X10_TEMP20 =
          (X10_TEMP346);
        
//#line 1239
return X10_TEMP20;
    }
    
    
//#line 1241
public static int
                    Program__Timer_max_counters_init(
                    ) {
        
//#line 1242
final int X10_TEMP306 =
          (64);
        
//#line 1244
final int X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1245
return X10_TEMP2;
    }
    
    
//#line 1247
public static void
                    Program_Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1248
final x10.
          lang.
          DoubleReferenceArray X10_TEMP306 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1250
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP306));
        
//#line 1251
final long X10_TEMP309 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1253
final double X10_TEMP5 =
          (X10_TEMP309);
        
//#line 1254
final double X10_TEMP312 =
          (X10_TEMP5);
        
//#line 1256
final double X10_TEMP6 =
          (X10_TEMP312);
        
//#line 1257
final double X10_TEMP316 =
          (X10_TEMP6);
        
//#line 1259
final double X10_TEMP319 =
          (X10_TEMP316);
        
//#line 1260
/* template:array_set { */(X10_TEMP1).set((X10_TEMP319),n)/* } */;
    }
    
    
//#line 1262
public static void
                    Program_Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1263
final x10.
          lang.
          DoubleReferenceArray X10_TEMP306 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1265
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP306));
        
//#line 1266
final long X10_TEMP309 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1268
final double X10_TEMP5 =
          (X10_TEMP309);
        
//#line 1269
final x10.
          lang.
          DoubleReferenceArray X10_TEMP312 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1271
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP312));
        
//#line 1272
final double X10_TEMP316 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 1274
final double X10_TEMP6 =
          (X10_TEMP316);
        
//#line 1275
final double X10_TEMP319 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 1277
final double X10_TEMP9 =
          (X10_TEMP319);
        
//#line 1278
final double X10_TEMP322 =
          (X10_TEMP9);
        
//#line 1280
final double X10_TEMP10 =
          (X10_TEMP322);
        
//#line 1281
final double X10_TEMP326 =
          (X10_TEMP10);
        
//#line 1283
final double X10_TEMP329 =
          (X10_TEMP326);
        
//#line 1284
/* template:array_set { */(X10_TEMP1).set((X10_TEMP329),n)/* } */;
        
//#line 1285
final x10.
          lang.
          DoubleReferenceArray X10_TEMP331 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1287
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP331));
        
//#line 1288
final double X10_TEMP335 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 1290
final double X10_TEMP14 =
          (X10_TEMP335);
        
//#line 1291
final int X10_TEMP338 =
          (1000);
        
//#line 1293
final double X10_TEMP15 =
          (X10_TEMP338);
        
//#line 1294
final double X10_TEMP341 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 1296
final double X10_TEMP16 =
          (X10_TEMP341);
        
//#line 1297
final double X10_TEMP345 =
          (X10_TEMP16);
        
//#line 1299
final double X10_TEMP348 =
          (X10_TEMP345);
        
//#line 1300
/* template:array_set { */(X10_TEMP11).set((X10_TEMP348),n)/* } */;
        
//#line 1301
final x10.
          lang.
          DoubleReferenceArray X10_TEMP350 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1303
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP350));
        
//#line 1304
final x10.
          lang.
          DoubleReferenceArray X10_TEMP353 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1306
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP353));
        
//#line 1307
final double X10_TEMP357 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 1309
final double X10_TEMP22 =
          (X10_TEMP357);
        
//#line 1310
final double X10_TEMP361 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 1312
final double X10_TEMP23 =
          (X10_TEMP361);
        
//#line 1313
final double X10_TEMP364 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 1315
final double X10_TEMP24 =
          (X10_TEMP364);
        
//#line 1316
final double X10_TEMP368 =
          (X10_TEMP24);
        
//#line 1318
final double X10_TEMP371 =
          (X10_TEMP368);
        
//#line 1319
/* template:array_set { */(X10_TEMP17).set((X10_TEMP371),n)/* } */;
    }
    
    
//#line 1321
public static double
                    Program_Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1322
final x10.
          lang.
          DoubleReferenceArray X10_TEMP306 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1324
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP306));
        
//#line 1325
final double X10_TEMP310 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 1327
final double X10_TEMP4 =
          (X10_TEMP310);
        
//#line 1328
return X10_TEMP4;
    }
    
    
//#line 1330
public static void
                    Program_Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1331
final x10.
          lang.
          DoubleReferenceArray X10_TEMP306 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1333
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP306));
        
//#line 1334
final int X10_TEMP309 =
          (0);
        
//#line 1336
final double X10_TEMP5 =
          (X10_TEMP309);
        
//#line 1337
final double X10_TEMP312 =
          (X10_TEMP5);
        
//#line 1339
final double X10_TEMP6 =
          (X10_TEMP312);
        
//#line 1340
final double X10_TEMP316 =
          (X10_TEMP6);
        
//#line 1342
final double X10_TEMP319 =
          (X10_TEMP316);
        
//#line 1343
/* template:array_set { */(X10_TEMP1).set((X10_TEMP319),n)/* } */;
        
//#line 1344
final x10.
          lang.
          DoubleReferenceArray X10_TEMP321 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1346
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP321));
        
//#line 1347
final int X10_TEMP324 =
          (0);
        
//#line 1349
final double X10_TEMP11 =
          (X10_TEMP324);
        
//#line 1350
final double X10_TEMP327 =
          (X10_TEMP11);
        
//#line 1352
final double X10_TEMP12 =
          (X10_TEMP327);
        
//#line 1353
final double X10_TEMP331 =
          (X10_TEMP12);
        
//#line 1355
final double X10_TEMP334 =
          (X10_TEMP331);
        
//#line 1356
/* template:array_set { */(X10_TEMP7).set((X10_TEMP334),n)/* } */;
        
//#line 1357
final x10.
          lang.
          DoubleReferenceArray X10_TEMP336 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1359
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP336));
        
//#line 1360
final int X10_TEMP339 =
          (0);
        
//#line 1362
final double X10_TEMP17 =
          (X10_TEMP339);
        
//#line 1363
final double X10_TEMP342 =
          (X10_TEMP17);
        
//#line 1365
final double X10_TEMP18 =
          (X10_TEMP342);
        
//#line 1366
final double X10_TEMP346 =
          (X10_TEMP18);
        
//#line 1368
final double X10_TEMP349 =
          (X10_TEMP346);
        
//#line 1369
/* template:array_set { */(X10_TEMP13).set((X10_TEMP349),n)/* } */;
    }
    
    
//#line 1371
public static void
                    Program_Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 1372
final int X10_TEMP306 =
          (0);
        
//#line 1374
int i =
          (X10_TEMP306);
        
//#line 1375
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 1376
boolean X10_TEMP311 =
          X10_TEMP4;
        
//#line 1377
while (X10_TEMP311) {
            
//#line 1378
Program0.
                            Program_Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 1379
final int X10_TEMP315 =
              (i);
            
//#line 1381
final int X10_TEMP6 =
              (X10_TEMP315);
            
//#line 1382
final int X10_TEMP7 =
              (1);
            
//#line 1383
final int X10_TEMP319 =
              (i +
                 X10_TEMP7);
            
//#line 1384
i =
              ((X10_TEMP319));
            
//#line 1385
final boolean X10_TEMP321 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 1386
X10_TEMP4 =
              ((X10_TEMP321));
            
//#line 1387
X10_TEMP311 =
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
    
    
//#line 1393
public Program() {
        
//#line 1393
super();
    }
}

class IDEATest
extends x10.
  lang.
  Object
{
    
//#line 1397
public x10.
      lang.
      ByteReferenceArray
      plain1;
    
//#line 1398
public x10.
      lang.
      ByteReferenceArray
      crypt1;
    
//#line 1399
public x10.
      lang.
      ByteReferenceArray
      plain2;
    
//#line 1400
public x10.
      lang.
      intArray
      userkey;
    
//#line 1401
public x10.
      lang.
      intArray
      ZR;
    
//#line 1402
public x10.
      lang.
      intArray
      DKR;
    
    
//#line 1405
public IDEATest() {
        
//#line 1405
super();
        
//#line 1406
this.
                        IDEATest_IDEATest_buildTestData();
        
//#line 1407
final int X10_TEMP306 =
          (0);
        
//#line 1409
final int X10_TEMP6 =
          (X10_TEMP306);
        
//#line 1410
final int X10_TEMP309 =
          (Program0.
             _Program__IDEATest_array_rows);
        
//#line 1412
final int X10_TEMP3 =
          (X10_TEMP309);
        
//#line 1413
final int X10_TEMP312 =
          (1);
        
//#line 1415
final int X10_TEMP4 =
          (X10_TEMP312);
        
//#line 1416
final int X10_TEMP315 =
          (X10_TEMP3 -
             X10_TEMP4);
        
//#line 1418
final int X10_TEMP7 =
          (X10_TEMP315);
        
//#line 1419
final x10.
          lang.
          region X10_TEMP320 =
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
                  X10_TEMP6,
                  X10_TEMP7))));
        
//#line 1421
final x10.
          lang.
          region X10_TEMP9 =
          (x10.
            lang.
            region)
            ((X10_TEMP320));
        
//#line 1422
final x10.
          lang.
          dist X10_TEMP324 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1422
public x10.
                              lang.
                              dist
                              checkCast(
                              final x10.
                                lang.
                                dist x10_generated_objToCast) {
                  
//#line 1422
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
               X10_TEMP9)));
        
//#line 1424
final x10.
          lang.
          dist X10_TEMP10 =
          (x10.
            lang.
            dist)
            ((X10_TEMP324));
        
//#line 1425
final x10.
          lang.
          dist X10_TEMP327 =
          (x10.
            lang.
            dist)
            ((X10_TEMP10));
        
//#line 1427
final x10.
          lang.
          dist D =
          (x10.
            lang.
            dist)
            ((X10_TEMP327));
        
//#line 1428
final x10.
          lang.
          ByteReferenceArray X10_TEMP341 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public byte apply(/* Join: { */x10.
                lang.
                point p/* } */, byte dummy) { {
                  
//#line 1429
final x10.
                    lang.
                    region X10_TEMP330 =
                    (x10.
                      lang.
                      region)
                      ((D.
                          region));
                  
//#line 1431
final x10.
                    lang.
                    region X10_TEMP12 =
                    (x10.
                      lang.
                      region)
                      ((X10_TEMP330));
                  
//#line 1432
final int X10_TEMP334 =
                    (X10_TEMP12.
                       ordinal(
                       p));
                  
//#line 1434
final int X10_TEMP14 =
                    (X10_TEMP334);
                  
//#line 1435
final byte X10_TEMP337 =
                    (byte)
                      (((byte)
                          X10_TEMP14));
                  
//#line 1437
final byte X10_TEMP16 =
                    (byte)
                      (((byte)
                          X10_TEMP337));
                  
//#line 1438
return X10_TEMP16;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 1443
final x10.
          lang.
          ByteReferenceArray X10_TEMP18 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP341));
        
//#line 1444
final x10.
          lang.
          ByteReferenceArray X10_TEMP344 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP18));
        
//#line 1446
plain1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP344));
        
//#line 1447
final x10.
          lang.
          ByteReferenceArray X10_TEMP347 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1449
final x10.
          lang.
          ByteReferenceArray X10_TEMP20 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP347));
        
//#line 1450
final x10.
          lang.
          ByteReferenceArray X10_TEMP350 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP20));
        
//#line 1452
crypt1 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP350));
        
//#line 1453
final x10.
          lang.
          ByteReferenceArray X10_TEMP353 =
          (x10.
            lang.
            ByteReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1455
final x10.
          lang.
          ByteReferenceArray X10_TEMP22 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP353));
        
//#line 1456
final x10.
          lang.
          ByteReferenceArray X10_TEMP356 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP22));
        
//#line 1458
plain2 =
          (x10.
            lang.
            ByteReferenceArray)
            ((X10_TEMP356));
    }
    
    
//#line 1462
public void
                    IDEATest_IDEATest_buildTestData(
                    ) {
        
//#line 1463
final long X10_TEMP306 =
          (136506717L);
        
//#line 1465
long X10_TEMP2 =
          (X10_TEMP306);
        
//#line 1466
final Random X10_TEMP310 =
          (new Random(
             X10_TEMP2));
        
//#line 1468
final Random rndnum =
          (X10_TEMP310);
        
//#line 1469
final int X10_TEMP313 =
          (0);
        
//#line 1471
final int X10_TEMP6 =
          (X10_TEMP313);
        
//#line 1472
final int X10_TEMP316 =
          (7);
        
//#line 1474
final int X10_TEMP7 =
          (X10_TEMP316);
        
//#line 1475
final x10.
          lang.
          region X10_TEMP321 =
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
                  X10_TEMP6,
                  X10_TEMP7))));
        
//#line 1477
final x10.
          lang.
          region rUserKey =
          (x10.
            lang.
            region)
            ((X10_TEMP321));
        
//#line 1478
final x10.
          lang.
          place X10_TEMP324 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1480
final x10.
          lang.
          place X10_TEMP9 =
          (X10_TEMP324);
        
//#line 1481
final x10.
          lang.
          dist X10_TEMP327 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                rUserKey,
                X10_TEMP9)));
        
//#line 1483
final x10.
          lang.
          dist dUserKey =
          (x10.
            lang.
            dist)
            ((X10_TEMP327));
        
//#line 1484
final x10.
          lang.
          IntReferenceArray X10_TEMP330 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUserKey,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1486
final x10.
          lang.
          IntReferenceArray tUserKey =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP330));
        
//#line 1487
/* template:forloop { */
        for (java.util.Iterator pt__ = (rUserKey).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1488
final int X10_TEMP335 =
              (Program0.
                 Program_Random_nextInt(
                 rndnum));
            
//#line 1490
final int X10_TEMP14 =
              (X10_TEMP335);
            
//#line 1491
final short X10_TEMP338 =
              (short)
                (((short)
                    X10_TEMP14));
            
//#line 1493
final int X10_TEMP17 =
              (X10_TEMP338);
            
//#line 1494
final int X10_TEMP341 =
              (X10_TEMP17);
            
//#line 1496
final int X10_TEMP18 =
              (X10_TEMP341);
            
//#line 1497
final int X10_TEMP345 =
              (X10_TEMP18);
            
//#line 1499
final int X10_TEMP348 =
              (X10_TEMP345);
            
//#line 1500
/* template:array_set { */(tUserKey).set((X10_TEMP348),pt)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1502
final x10.
          lang.
          intArray X10_TEMP355 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rUserKey.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point pt/* } */, int dummy) { {
                  
//#line 1503
final int X10_TEMP351 =
                    (/* template:array_get { */((tUserKey).get(pt))/* } */);
                  
//#line 1505
final int X10_TEMP21 =
                    (X10_TEMP351);
                  
//#line 1506
return X10_TEMP21;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1511
final x10.
          lang.
          intArray X10_TEMP22 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP355));
        
//#line 1512
final x10.
          lang.
          intArray X10_TEMP358 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP22));
        
//#line 1514
final x10.
          lang.
          intArray tempuserkey =
          (x10.
            lang.
            intArray)
            ((X10_TEMP358));
        
//#line 1515
final x10.
          lang.
          intArray X10_TEMP361 =
          (x10.
            lang.
            intArray)
            ((tempuserkey));
        
//#line 1517
userkey =
          (x10.
            lang.
            intArray)
            ((X10_TEMP361));
        
//#line 1518
final x10.
          lang.
          intArray X10_TEMP365 =
          (x10.
            lang.
            intArray)
            ((this.
                IDEATest_IDEATest_calcEncryptKey(
                tempuserkey)));
        
//#line 1520
final x10.
          lang.
          intArray tempZR =
          (x10.
            lang.
            intArray)
            ((X10_TEMP365));
        
//#line 1521
final x10.
          lang.
          intArray X10_TEMP368 =
          (x10.
            lang.
            intArray)
            ((tempZR));
        
//#line 1523
ZR =
          (x10.
            lang.
            intArray)
            ((X10_TEMP368));
        
//#line 1524
this.
                        IDEATest_IDEATest_calcDecryptKey(
                        tempZR);
    }
    
    
//#line 1526
public x10.
                    lang.
                    intArray
                    IDEATest_IDEATest_calcEncryptKey(
                    final x10.
                      lang.
                      intArray auserkey) {
        
//#line 1527
final int X10_TEMP306 =
          (0);
        
//#line 1529
int j =
          (X10_TEMP306);
        
//#line 1530
final int X10_TEMP309 =
          (0);
        
//#line 1532
final int X10_TEMP4 =
          (X10_TEMP309);
        
//#line 1533
final int X10_TEMP312 =
          (51);
        
//#line 1535
final int X10_TEMP5 =
          (X10_TEMP312);
        
//#line 1536
final x10.
          lang.
          region X10_TEMP317 =
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
        
//#line 1538
final x10.
          lang.
          region rZ =
          (x10.
            lang.
            region)
            ((X10_TEMP317));
        
//#line 1539
final x10.
          lang.
          place X10_TEMP320 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1541
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP320);
        
//#line 1542
final x10.
          lang.
          dist X10_TEMP323 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                rZ,
                X10_TEMP7)));
        
//#line 1544
final x10.
          lang.
          dist dZ =
          (x10.
            lang.
            dist)
            ((X10_TEMP323));
        
//#line 1545
final x10.
          lang.
          IntReferenceArray X10_TEMP326 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dZ,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1547
final x10.
          lang.
          IntReferenceArray Z =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP326));
        
//#line 1548
final int X10_TEMP329 =
          (0);
        
//#line 1550
final int X10_TEMP12 =
          (X10_TEMP329);
        
//#line 1551
final int X10_TEMP332 =
          (7);
        
//#line 1553
final int X10_TEMP13 =
          (X10_TEMP332);
        
//#line 1554
final x10.
          lang.
          region X10_TEMP337 =
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
                  X10_TEMP12,
                  X10_TEMP13))));
        
//#line 1556
final x10.
          lang.
          region X10_TEMP15 =
          (x10.
            lang.
            region)
            ((X10_TEMP337));
        
//#line 1557
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP15).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1558
final int X10_TEMP342 =
              (/* template:array_get { */((auserkey).get(i))/* } */);
            
//#line 1560
final int X10_TEMP18 =
              (X10_TEMP342);
            
//#line 1561
final int X10_TEMP345 =
              (65535);
            
//#line 1563
final int X10_TEMP19 =
              (X10_TEMP345);
            
//#line 1564
final int X10_TEMP348 =
              (X10_TEMP18 &
                 X10_TEMP19);
            
//#line 1566
final int X10_TEMP22 =
              (X10_TEMP348);
            
//#line 1567
final int X10_TEMP351 =
              (X10_TEMP22);
            
//#line 1569
final int X10_TEMP23 =
              (X10_TEMP351);
            
//#line 1570
final int X10_TEMP355 =
              (X10_TEMP23);
            
//#line 1572
final int X10_TEMP358 =
              (X10_TEMP355);
            
//#line 1573
/* template:array_set { */(Z).set((X10_TEMP358),i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1575
final int X10_TEMP360 =
          (8);
        
//#line 1577
final int X10_TEMP26 =
          (X10_TEMP360);
        
//#line 1578
final int X10_TEMP363 =
          (51);
        
//#line 1580
final int X10_TEMP27 =
          (X10_TEMP363);
        
//#line 1581
final x10.
          lang.
          region X10_TEMP368 =
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
                  X10_TEMP26,
                  X10_TEMP27))));
        
//#line 1583
final x10.
          lang.
          region X10_TEMP29 =
          (x10.
            lang.
            region)
            ((X10_TEMP368));
        
//#line 1584
/* template:forloop-mult { */{
        x10.lang.region __var7__ = (x10.lang.region) X10_TEMP29;
        if (__var7__.size() > 0 && (__var7__ instanceof x10.array.MultiDimRegion || __var7__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var8__ = __var7__.rank(0).low(), __var9__ = __var7__.rank(0).high(); __var8__ <= __var9__; __var8__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var8__;
        /* } */
        /* } */
{
            
//#line 1585
final int X10_TEMP372 =
              (8);
            
//#line 1587
final int X10_TEMP30 =
              (X10_TEMP372);
            
//#line 1588
final int X10_TEMP375 =
              (i %
                 X10_TEMP30);
            
//#line 1590
final int X10_TEMP32 =
              (X10_TEMP375);
            
//#line 1591
final int X10_TEMP378 =
              (X10_TEMP32);
            
//#line 1593
j =
              ((X10_TEMP378));
            
//#line 1594
final int X10_TEMP381 =
              (6);
            
//#line 1596
final int X10_TEMP33 =
              (X10_TEMP381);
            
//#line 1597
final boolean X10_TEMP35 =
              (j <
                 X10_TEMP33);
            
//#line 1598
if (X10_TEMP35) {
                
//#line 1599
final int X10_TEMP386 =
                  (7);
                
//#line 1601
final int X10_TEMP37 =
                  (X10_TEMP386);
                
//#line 1602
final int X10_TEMP389 =
                  (i -
                     X10_TEMP37);
                
//#line 1604
final int X10_TEMP39 =
                  (X10_TEMP389);
                
//#line 1605
final int X10_TEMP393 =
                  (/* template:array_get { */((Z).get(X10_TEMP39))/* } */);
                
//#line 1607
final int X10_TEMP40 =
                  (X10_TEMP393);
                
//#line 1608
final int X10_TEMP396 =
                  (9);
                
//#line 1610
final int X10_TEMP41 =
                  (X10_TEMP396);
                
//#line 1611
final int X10_TEMP399 =
                  (X10_TEMP40 >>>
                     X10_TEMP41);
                
//#line 1613
final int X10_TEMP43 =
                  (X10_TEMP399);
                
//#line 1614
final int X10_TEMP402 =
                  (6);
                
//#line 1616
final int X10_TEMP44 =
                  (X10_TEMP402);
                
//#line 1617
final int X10_TEMP405 =
                  (i -
                     X10_TEMP44);
                
//#line 1619
final int X10_TEMP46 =
                  (X10_TEMP405);
                
//#line 1620
final int X10_TEMP409 =
                  (/* template:array_get { */((Z).get(X10_TEMP46))/* } */);
                
//#line 1622
final int X10_TEMP47 =
                  (X10_TEMP409);
                
//#line 1623
final int X10_TEMP412 =
                  (7);
                
//#line 1625
final int X10_TEMP48 =
                  (X10_TEMP412);
                
//#line 1626
final int X10_TEMP415 =
                  (X10_TEMP47 <<
                     X10_TEMP48);
                
//#line 1628
final int X10_TEMP50 =
                  (X10_TEMP415);
                
//#line 1629
final int X10_TEMP418 =
                  (X10_TEMP43 |
                     X10_TEMP50);
                
//#line 1631
final int X10_TEMP52 =
                  (X10_TEMP418);
                
//#line 1632
final int X10_TEMP421 =
                  (65535);
                
//#line 1634
final int X10_TEMP53 =
                  (X10_TEMP421);
                
//#line 1635
final int X10_TEMP424 =
                  (X10_TEMP52 &
                     X10_TEMP53);
                
//#line 1637
final int X10_TEMP56 =
                  (X10_TEMP424);
                
//#line 1638
final int X10_TEMP427 =
                  (X10_TEMP56);
                
//#line 1640
final int X10_TEMP57 =
                  (X10_TEMP427);
                
//#line 1641
final int X10_TEMP431 =
                  (X10_TEMP57);
                
//#line 1643
final int X10_TEMP434 =
                  (X10_TEMP431);
                
//#line 1644
/* template:array_set { */(Z).set((X10_TEMP434),i)/* } */;
                
//#line 1645
continue;
            }
            
//#line 1647
final int X10_TEMP436 =
              (6);
            
//#line 1649
final int X10_TEMP58 =
              (X10_TEMP436);
            
//#line 1650
final boolean X10_TEMP60 =
              (j ==
                 X10_TEMP58);
            
//#line 1651
if (X10_TEMP60) {
                
//#line 1652
final int X10_TEMP441 =
                  (7);
                
//#line 1654
final int X10_TEMP62 =
                  (X10_TEMP441);
                
//#line 1655
final int X10_TEMP444 =
                  (i -
                     X10_TEMP62);
                
//#line 1657
final int X10_TEMP64 =
                  (X10_TEMP444);
                
//#line 1658
final int X10_TEMP448 =
                  (/* template:array_get { */((Z).get(X10_TEMP64))/* } */);
                
//#line 1660
final int X10_TEMP65 =
                  (X10_TEMP448);
                
//#line 1661
final int X10_TEMP451 =
                  (9);
                
//#line 1663
final int X10_TEMP66 =
                  (X10_TEMP451);
                
//#line 1664
final int X10_TEMP454 =
                  (X10_TEMP65 >>>
                     X10_TEMP66);
                
//#line 1666
final int X10_TEMP68 =
                  (X10_TEMP454);
                
//#line 1667
final int X10_TEMP457 =
                  (14);
                
//#line 1669
final int X10_TEMP69 =
                  (X10_TEMP457);
                
//#line 1670
final int X10_TEMP460 =
                  (i -
                     X10_TEMP69);
                
//#line 1672
final int X10_TEMP71 =
                  (X10_TEMP460);
                
//#line 1673
final int X10_TEMP464 =
                  (/* template:array_get { */((Z).get(X10_TEMP71))/* } */);
                
//#line 1675
final int X10_TEMP72 =
                  (X10_TEMP464);
                
//#line 1676
final int X10_TEMP467 =
                  (7);
                
//#line 1678
final int X10_TEMP73 =
                  (X10_TEMP467);
                
//#line 1679
final int X10_TEMP470 =
                  (X10_TEMP72 <<
                     X10_TEMP73);
                
//#line 1681
final int X10_TEMP75 =
                  (X10_TEMP470);
                
//#line 1682
final int X10_TEMP473 =
                  (X10_TEMP68 |
                     X10_TEMP75);
                
//#line 1684
final int X10_TEMP77 =
                  (X10_TEMP473);
                
//#line 1685
final int X10_TEMP476 =
                  (65535);
                
//#line 1687
final int X10_TEMP78 =
                  (X10_TEMP476);
                
//#line 1688
final int X10_TEMP479 =
                  (X10_TEMP77 &
                     X10_TEMP78);
                
//#line 1690
final int X10_TEMP81 =
                  (X10_TEMP479);
                
//#line 1691
final int X10_TEMP482 =
                  (X10_TEMP81);
                
//#line 1693
final int X10_TEMP82 =
                  (X10_TEMP482);
                
//#line 1694
final int X10_TEMP486 =
                  (X10_TEMP82);
                
//#line 1696
final int X10_TEMP489 =
                  (X10_TEMP486);
                
//#line 1697
/* template:array_set { */(Z).set((X10_TEMP489),i)/* } */;
                
//#line 1698
continue;
            }
            
//#line 1700
final int X10_TEMP491 =
              (15);
            
//#line 1702
final int X10_TEMP84 =
              (X10_TEMP491);
            
//#line 1703
final int X10_TEMP494 =
              (i -
                 X10_TEMP84);
            
//#line 1705
final int X10_TEMP86 =
              (X10_TEMP494);
            
//#line 1706
final int X10_TEMP498 =
              (/* template:array_get { */((Z).get(X10_TEMP86))/* } */);
            
//#line 1708
final int X10_TEMP87 =
              (X10_TEMP498);
            
//#line 1709
final int X10_TEMP501 =
              (9);
            
//#line 1711
final int X10_TEMP88 =
              (X10_TEMP501);
            
//#line 1712
final int X10_TEMP504 =
              (X10_TEMP87 >>>
                 X10_TEMP88);
            
//#line 1714
final int X10_TEMP90 =
              (X10_TEMP504);
            
//#line 1715
final int X10_TEMP507 =
              (14);
            
//#line 1717
final int X10_TEMP91 =
              (X10_TEMP507);
            
//#line 1718
final int X10_TEMP510 =
              (i -
                 X10_TEMP91);
            
//#line 1720
final int X10_TEMP93 =
              (X10_TEMP510);
            
//#line 1721
final int X10_TEMP514 =
              (/* template:array_get { */((Z).get(X10_TEMP93))/* } */);
            
//#line 1723
final int X10_TEMP94 =
              (X10_TEMP514);
            
//#line 1724
final int X10_TEMP517 =
              (7);
            
//#line 1726
final int X10_TEMP95 =
              (X10_TEMP517);
            
//#line 1727
final int X10_TEMP520 =
              (X10_TEMP94 <<
                 X10_TEMP95);
            
//#line 1729
final int X10_TEMP97 =
              (X10_TEMP520);
            
//#line 1730
final int X10_TEMP523 =
              (X10_TEMP90 |
                 X10_TEMP97);
            
//#line 1732
final int X10_TEMP99 =
              (X10_TEMP523);
            
//#line 1733
final int X10_TEMP526 =
              (65535);
            
//#line 1735
final int X10_TEMP100 =
              (X10_TEMP526);
            
//#line 1736
final int X10_TEMP529 =
              (X10_TEMP99 &
                 X10_TEMP100);
            
//#line 1738
final int X10_TEMP103 =
              (X10_TEMP529);
            
//#line 1739
final int X10_TEMP532 =
              (X10_TEMP103);
            
//#line 1741
final int X10_TEMP104 =
              (X10_TEMP532);
            
//#line 1742
final int X10_TEMP536 =
              (X10_TEMP104);
            
//#line 1744
final int X10_TEMP539 =
              (X10_TEMP536);
            
//#line 1745
/* template:array_set { */(Z).set((X10_TEMP539),i)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var7__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 1585
final int X10_TEMP372 =
              (8);
            
//#line 1587
final int X10_TEMP30 =
              (X10_TEMP372);
            
//#line 1588
final int X10_TEMP375 =
              (i %
                 X10_TEMP30);
            
//#line 1590
final int X10_TEMP32 =
              (X10_TEMP375);
            
//#line 1591
final int X10_TEMP378 =
              (X10_TEMP32);
            
//#line 1593
j =
              ((X10_TEMP378));
            
//#line 1594
final int X10_TEMP381 =
              (6);
            
//#line 1596
final int X10_TEMP33 =
              (X10_TEMP381);
            
//#line 1597
final boolean X10_TEMP35 =
              (j <
                 X10_TEMP33);
            
//#line 1598
if (X10_TEMP35) {
                
//#line 1599
final int X10_TEMP386 =
                  (7);
                
//#line 1601
final int X10_TEMP37 =
                  (X10_TEMP386);
                
//#line 1602
final int X10_TEMP389 =
                  (i -
                     X10_TEMP37);
                
//#line 1604
final int X10_TEMP39 =
                  (X10_TEMP389);
                
//#line 1605
final int X10_TEMP393 =
                  (/* template:array_get { */((Z).get(X10_TEMP39))/* } */);
                
//#line 1607
final int X10_TEMP40 =
                  (X10_TEMP393);
                
//#line 1608
final int X10_TEMP396 =
                  (9);
                
//#line 1610
final int X10_TEMP41 =
                  (X10_TEMP396);
                
//#line 1611
final int X10_TEMP399 =
                  (X10_TEMP40 >>>
                     X10_TEMP41);
                
//#line 1613
final int X10_TEMP43 =
                  (X10_TEMP399);
                
//#line 1614
final int X10_TEMP402 =
                  (6);
                
//#line 1616
final int X10_TEMP44 =
                  (X10_TEMP402);
                
//#line 1617
final int X10_TEMP405 =
                  (i -
                     X10_TEMP44);
                
//#line 1619
final int X10_TEMP46 =
                  (X10_TEMP405);
                
//#line 1620
final int X10_TEMP409 =
                  (/* template:array_get { */((Z).get(X10_TEMP46))/* } */);
                
//#line 1622
final int X10_TEMP47 =
                  (X10_TEMP409);
                
//#line 1623
final int X10_TEMP412 =
                  (7);
                
//#line 1625
final int X10_TEMP48 =
                  (X10_TEMP412);
                
//#line 1626
final int X10_TEMP415 =
                  (X10_TEMP47 <<
                     X10_TEMP48);
                
//#line 1628
final int X10_TEMP50 =
                  (X10_TEMP415);
                
//#line 1629
final int X10_TEMP418 =
                  (X10_TEMP43 |
                     X10_TEMP50);
                
//#line 1631
final int X10_TEMP52 =
                  (X10_TEMP418);
                
//#line 1632
final int X10_TEMP421 =
                  (65535);
                
//#line 1634
final int X10_TEMP53 =
                  (X10_TEMP421);
                
//#line 1635
final int X10_TEMP424 =
                  (X10_TEMP52 &
                     X10_TEMP53);
                
//#line 1637
final int X10_TEMP56 =
                  (X10_TEMP424);
                
//#line 1638
final int X10_TEMP427 =
                  (X10_TEMP56);
                
//#line 1640
final int X10_TEMP57 =
                  (X10_TEMP427);
                
//#line 1641
final int X10_TEMP431 =
                  (X10_TEMP57);
                
//#line 1643
final int X10_TEMP434 =
                  (X10_TEMP431);
                
//#line 1644
/* template:array_set { */(Z).set((X10_TEMP434),i)/* } */;
                
//#line 1645
continue;
            }
            
//#line 1647
final int X10_TEMP436 =
              (6);
            
//#line 1649
final int X10_TEMP58 =
              (X10_TEMP436);
            
//#line 1650
final boolean X10_TEMP60 =
              (j ==
                 X10_TEMP58);
            
//#line 1651
if (X10_TEMP60) {
                
//#line 1652
final int X10_TEMP441 =
                  (7);
                
//#line 1654
final int X10_TEMP62 =
                  (X10_TEMP441);
                
//#line 1655
final int X10_TEMP444 =
                  (i -
                     X10_TEMP62);
                
//#line 1657
final int X10_TEMP64 =
                  (X10_TEMP444);
                
//#line 1658
final int X10_TEMP448 =
                  (/* template:array_get { */((Z).get(X10_TEMP64))/* } */);
                
//#line 1660
final int X10_TEMP65 =
                  (X10_TEMP448);
                
//#line 1661
final int X10_TEMP451 =
                  (9);
                
//#line 1663
final int X10_TEMP66 =
                  (X10_TEMP451);
                
//#line 1664
final int X10_TEMP454 =
                  (X10_TEMP65 >>>
                     X10_TEMP66);
                
//#line 1666
final int X10_TEMP68 =
                  (X10_TEMP454);
                
//#line 1667
final int X10_TEMP457 =
                  (14);
                
//#line 1669
final int X10_TEMP69 =
                  (X10_TEMP457);
                
//#line 1670
final int X10_TEMP460 =
                  (i -
                     X10_TEMP69);
                
//#line 1672
final int X10_TEMP71 =
                  (X10_TEMP460);
                
//#line 1673
final int X10_TEMP464 =
                  (/* template:array_get { */((Z).get(X10_TEMP71))/* } */);
                
//#line 1675
final int X10_TEMP72 =
                  (X10_TEMP464);
                
//#line 1676
final int X10_TEMP467 =
                  (7);
                
//#line 1678
final int X10_TEMP73 =
                  (X10_TEMP467);
                
//#line 1679
final int X10_TEMP470 =
                  (X10_TEMP72 <<
                     X10_TEMP73);
                
//#line 1681
final int X10_TEMP75 =
                  (X10_TEMP470);
                
//#line 1682
final int X10_TEMP473 =
                  (X10_TEMP68 |
                     X10_TEMP75);
                
//#line 1684
final int X10_TEMP77 =
                  (X10_TEMP473);
                
//#line 1685
final int X10_TEMP476 =
                  (65535);
                
//#line 1687
final int X10_TEMP78 =
                  (X10_TEMP476);
                
//#line 1688
final int X10_TEMP479 =
                  (X10_TEMP77 &
                     X10_TEMP78);
                
//#line 1690
final int X10_TEMP81 =
                  (X10_TEMP479);
                
//#line 1691
final int X10_TEMP482 =
                  (X10_TEMP81);
                
//#line 1693
final int X10_TEMP82 =
                  (X10_TEMP482);
                
//#line 1694
final int X10_TEMP486 =
                  (X10_TEMP82);
                
//#line 1696
final int X10_TEMP489 =
                  (X10_TEMP486);
                
//#line 1697
/* template:array_set { */(Z).set((X10_TEMP489),i)/* } */;
                
//#line 1698
continue;
            }
            
//#line 1700
final int X10_TEMP491 =
              (15);
            
//#line 1702
final int X10_TEMP84 =
              (X10_TEMP491);
            
//#line 1703
final int X10_TEMP494 =
              (i -
                 X10_TEMP84);
            
//#line 1705
final int X10_TEMP86 =
              (X10_TEMP494);
            
//#line 1706
final int X10_TEMP498 =
              (/* template:array_get { */((Z).get(X10_TEMP86))/* } */);
            
//#line 1708
final int X10_TEMP87 =
              (X10_TEMP498);
            
//#line 1709
final int X10_TEMP501 =
              (9);
            
//#line 1711
final int X10_TEMP88 =
              (X10_TEMP501);
            
//#line 1712
final int X10_TEMP504 =
              (X10_TEMP87 >>>
                 X10_TEMP88);
            
//#line 1714
final int X10_TEMP90 =
              (X10_TEMP504);
            
//#line 1715
final int X10_TEMP507 =
              (14);
            
//#line 1717
final int X10_TEMP91 =
              (X10_TEMP507);
            
//#line 1718
final int X10_TEMP510 =
              (i -
                 X10_TEMP91);
            
//#line 1720
final int X10_TEMP93 =
              (X10_TEMP510);
            
//#line 1721
final int X10_TEMP514 =
              (/* template:array_get { */((Z).get(X10_TEMP93))/* } */);
            
//#line 1723
final int X10_TEMP94 =
              (X10_TEMP514);
            
//#line 1724
final int X10_TEMP517 =
              (7);
            
//#line 1726
final int X10_TEMP95 =
              (X10_TEMP517);
            
//#line 1727
final int X10_TEMP520 =
              (X10_TEMP94 <<
                 X10_TEMP95);
            
//#line 1729
final int X10_TEMP97 =
              (X10_TEMP520);
            
//#line 1730
final int X10_TEMP523 =
              (X10_TEMP90 |
                 X10_TEMP97);
            
//#line 1732
final int X10_TEMP99 =
              (X10_TEMP523);
            
//#line 1733
final int X10_TEMP526 =
              (65535);
            
//#line 1735
final int X10_TEMP100 =
              (X10_TEMP526);
            
//#line 1736
final int X10_TEMP529 =
              (X10_TEMP99 &
                 X10_TEMP100);
            
//#line 1738
final int X10_TEMP103 =
              (X10_TEMP529);
            
//#line 1739
final int X10_TEMP532 =
              (X10_TEMP103);
            
//#line 1741
final int X10_TEMP104 =
              (X10_TEMP532);
            
//#line 1742
final int X10_TEMP536 =
              (X10_TEMP104);
            
//#line 1744
final int X10_TEMP539 =
              (X10_TEMP536);
            
//#line 1745
/* template:array_set { */(Z).set((X10_TEMP539),i)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1747
final x10.
          lang.
          intArray X10_TEMP546 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rZ.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point pt/* } */, int dummy) { {
                  
//#line 1748
final int X10_TEMP542 =
                    (/* template:array_get { */((Z).get(pt))/* } */);
                  
//#line 1750
final int X10_TEMP107 =
                    (X10_TEMP542);
                  
//#line 1751
return X10_TEMP107;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1756
final x10.
          lang.
          intArray X10_TEMP108 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP546));
        
//#line 1757
return X10_TEMP108;
    }
    
    
//#line 1759
public void
                    IDEATest_IDEATest_calcDecryptKey(
                    final x10.
                      lang.
                      intArray aZR) {
        
//#line 1760
final int X10_TEMP306 =
          (0);
        
//#line 1762
int j =
          (X10_TEMP306);
        
//#line 1763
final int X10_TEMP309 =
          (0);
        
//#line 1765
int k =
          (X10_TEMP309);
        
//#line 1766
final int X10_TEMP312 =
          (0);
        
//#line 1768
int t1 =
          (X10_TEMP312);
        
//#line 1769
final int X10_TEMP315 =
          (0);
        
//#line 1771
int t2 =
          (X10_TEMP315);
        
//#line 1772
final int X10_TEMP318 =
          (0);
        
//#line 1774
int t3 =
          (X10_TEMP318);
        
//#line 1775
final int X10_TEMP321 =
          (0);
        
//#line 1777
final int X10_TEMP8 =
          (X10_TEMP321);
        
//#line 1778
final int X10_TEMP324 =
          (51);
        
//#line 1780
final int X10_TEMP9 =
          (X10_TEMP324);
        
//#line 1781
final x10.
          lang.
          region X10_TEMP329 =
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
                  X10_TEMP8,
                  X10_TEMP9))));
        
//#line 1783
final x10.
          lang.
          region rDK =
          (x10.
            lang.
            region)
            ((X10_TEMP329));
        
//#line 1784
final x10.
          lang.
          place X10_TEMP332 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1786
final x10.
          lang.
          place X10_TEMP11 =
          (X10_TEMP332);
        
//#line 1787
final x10.
          lang.
          dist X10_TEMP335 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                rDK,
                X10_TEMP11)));
        
//#line 1789
final x10.
          lang.
          dist dDK =
          (x10.
            lang.
            dist)
            ((X10_TEMP335));
        
//#line 1790
final x10.
          lang.
          IntReferenceArray X10_TEMP338 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dDK,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1792
final x10.
          lang.
          IntReferenceArray DK =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP338));
        
//#line 1793
final x10.
          lang.
          intArray X10_TEMP341 =
          (x10.
            lang.
            intArray)
            ((aZR));
        
//#line 1795
final x10.
          lang.
          intArray Z =
          (x10.
            lang.
            intArray)
            ((X10_TEMP341));
        
//#line 1796
final int X10_TEMP344 =
          (0);
        
//#line 1798
final int X10_TEMP17 =
          (X10_TEMP344);
        
//#line 1799
final int X10_TEMP348 =
          (/* template:array_get { */((Z).get(X10_TEMP17))/* } */);
        
//#line 1801
final int X10_TEMP19 =
          (X10_TEMP348);
        
//#line 1802
final int X10_TEMP352 =
          (this.
             IDEATest_IDEATest_inv(
             X10_TEMP19));
        
//#line 1804
final int X10_TEMP21 =
          (X10_TEMP352);
        
//#line 1805
final int X10_TEMP355 =
          (X10_TEMP21);
        
//#line 1807
t1 =
          ((X10_TEMP355));
        
//#line 1808
final int X10_TEMP358 =
          (1);
        
//#line 1810
final int X10_TEMP23 =
          (X10_TEMP358);
        
//#line 1811
final int X10_TEMP362 =
          (/* template:array_get { */((Z).get(X10_TEMP23))/* } */);
        
//#line 1813
final int X10_TEMP24 =
          (X10_TEMP362);
        
//#line 1814
final int X10_TEMP25 =
          (0);
        
//#line 1815
final int X10_TEMP366 =
          (X10_TEMP25 -
             X10_TEMP24);
        
//#line 1817
final int X10_TEMP26 =
          (X10_TEMP366);
        
//#line 1818
final int X10_TEMP369 =
          (65535);
        
//#line 1820
final int X10_TEMP27 =
          (X10_TEMP369);
        
//#line 1821
final int X10_TEMP372 =
          (X10_TEMP26 &
             X10_TEMP27);
        
//#line 1823
final int X10_TEMP29 =
          (X10_TEMP372);
        
//#line 1824
final int X10_TEMP375 =
          (X10_TEMP29);
        
//#line 1826
t2 =
          ((X10_TEMP375));
        
//#line 1827
final int X10_TEMP378 =
          (2);
        
//#line 1829
final int X10_TEMP31 =
          (X10_TEMP378);
        
//#line 1830
final int X10_TEMP382 =
          (/* template:array_get { */((Z).get(X10_TEMP31))/* } */);
        
//#line 1832
final int X10_TEMP32 =
          (X10_TEMP382);
        
//#line 1833
final int X10_TEMP33 =
          (0);
        
//#line 1834
final int X10_TEMP386 =
          (X10_TEMP33 -
             X10_TEMP32);
        
//#line 1836
final int X10_TEMP34 =
          (X10_TEMP386);
        
//#line 1837
final int X10_TEMP389 =
          (65535);
        
//#line 1839
final int X10_TEMP35 =
          (X10_TEMP389);
        
//#line 1840
final int X10_TEMP392 =
          (X10_TEMP34 &
             X10_TEMP35);
        
//#line 1842
final int X10_TEMP37 =
          (X10_TEMP392);
        
//#line 1843
final int X10_TEMP395 =
          (X10_TEMP37);
        
//#line 1845
t3 =
          ((X10_TEMP395));
        
//#line 1846
final int X10_TEMP398 =
          (51);
        
//#line 1848
final int X10_TEMP39 =
          (X10_TEMP398);
        
//#line 1849
final int X10_TEMP401 =
          (3);
        
//#line 1851
final int X10_TEMP42 =
          (X10_TEMP401);
        
//#line 1852
final int X10_TEMP405 =
          (/* template:array_get { */((Z).get(X10_TEMP42))/* } */);
        
//#line 1854
final int X10_TEMP44 =
          (X10_TEMP405);
        
//#line 1855
final int X10_TEMP409 =
          (this.
             IDEATest_IDEATest_inv(
             X10_TEMP44));
        
//#line 1857
final int X10_TEMP47 =
          (X10_TEMP409);
        
//#line 1858
final int X10_TEMP412 =
          (X10_TEMP47);
        
//#line 1860
final int X10_TEMP48 =
          (X10_TEMP412);
        
//#line 1861
final int X10_TEMP416 =
          (X10_TEMP48);
        
//#line 1863
final int X10_TEMP419 =
          (X10_TEMP416);
        
//#line 1864
/* template:array_set { */(DK).set((X10_TEMP419),X10_TEMP39)/* } */;
        
//#line 1865
final int X10_TEMP421 =
          (50);
        
//#line 1867
final int X10_TEMP50 =
          (X10_TEMP421);
        
//#line 1868
final int X10_TEMP424 =
          (t3);
        
//#line 1870
final int X10_TEMP53 =
          (X10_TEMP424);
        
//#line 1871
final int X10_TEMP428 =
          (X10_TEMP53);
        
//#line 1873
final int X10_TEMP431 =
          (X10_TEMP428);
        
//#line 1874
/* template:array_set { */(DK).set((X10_TEMP431),X10_TEMP50)/* } */;
        
//#line 1875
final int X10_TEMP433 =
          (49);
        
//#line 1877
final int X10_TEMP55 =
          (X10_TEMP433);
        
//#line 1878
final int X10_TEMP436 =
          (t2);
        
//#line 1880
final int X10_TEMP58 =
          (X10_TEMP436);
        
//#line 1881
final int X10_TEMP440 =
          (X10_TEMP58);
        
//#line 1883
final int X10_TEMP443 =
          (X10_TEMP440);
        
//#line 1884
/* template:array_set { */(DK).set((X10_TEMP443),X10_TEMP55)/* } */;
        
//#line 1885
final int X10_TEMP445 =
          (48);
        
//#line 1887
final int X10_TEMP60 =
          (X10_TEMP445);
        
//#line 1888
final int X10_TEMP448 =
          (t1);
        
//#line 1890
final int X10_TEMP63 =
          (X10_TEMP448);
        
//#line 1891
final int X10_TEMP452 =
          (X10_TEMP63);
        
//#line 1893
final int X10_TEMP455 =
          (X10_TEMP452);
        
//#line 1894
/* template:array_set { */(DK).set((X10_TEMP455),X10_TEMP60)/* } */;
        
//#line 1895
final int X10_TEMP457 =
          (47);
        
//#line 1897
final int X10_TEMP65 =
          (X10_TEMP457);
        
//#line 1898
final int X10_TEMP460 =
          (X10_TEMP65);
        
//#line 1900
j =
          ((X10_TEMP460));
        
//#line 1901
final int X10_TEMP463 =
          (4);
        
//#line 1903
final int X10_TEMP67 =
          (X10_TEMP463);
        
//#line 1904
final int X10_TEMP466 =
          (X10_TEMP67);
        
//#line 1906
k =
          ((X10_TEMP466));
        
//#line 1907
final int X10_TEMP469 =
          (0);
        
//#line 1909
final int X10_TEMP70 =
          (X10_TEMP469);
        
//#line 1910
final int X10_TEMP472 =
          (6);
        
//#line 1912
final int X10_TEMP71 =
          (X10_TEMP472);
        
//#line 1913
final x10.
          lang.
          region X10_TEMP477 =
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
                  X10_TEMP70,
                  X10_TEMP71))));
        
//#line 1915
final x10.
          lang.
          region X10_TEMP73 =
          (x10.
            lang.
            region)
            ((X10_TEMP477));
        
//#line 1916
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP73).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1917
final int X10_TEMP481 =
              (k);
            
//#line 1919
final int X10_TEMP74 =
              (X10_TEMP481);
            
//#line 1920
final int X10_TEMP75 =
              (1);
            
//#line 1921
final int X10_TEMP485 =
              (k +
                 X10_TEMP75);
            
//#line 1922
k =
              ((X10_TEMP485));
            
//#line 1923
final int X10_TEMP488 =
              (/* template:array_get { */((Z).get(X10_TEMP74))/* } */);
            
//#line 1925
final int X10_TEMP78 =
              (X10_TEMP488);
            
//#line 1926
final int X10_TEMP491 =
              (X10_TEMP78);
            
//#line 1928
t1 =
              ((X10_TEMP491));
            
//#line 1929
final int X10_TEMP494 =
              (j);
            
//#line 1931
final int X10_TEMP79 =
              (X10_TEMP494);
            
//#line 1932
final int X10_TEMP80 =
              (1);
            
//#line 1933
final int X10_TEMP498 =
              (j -
                 X10_TEMP80);
            
//#line 1934
j =
              ((X10_TEMP498));
            
//#line 1935
final int X10_TEMP500 =
              (k);
            
//#line 1937
final int X10_TEMP82 =
              (X10_TEMP500);
            
//#line 1938
final int X10_TEMP83 =
              (1);
            
//#line 1939
final int X10_TEMP504 =
              (k +
                 X10_TEMP83);
            
//#line 1940
k =
              ((X10_TEMP504));
            
//#line 1941
final int X10_TEMP507 =
              (/* template:array_get { */((Z).get(X10_TEMP82))/* } */);
            
//#line 1943
final int X10_TEMP87 =
              (X10_TEMP507);
            
//#line 1944
final int X10_TEMP510 =
              (X10_TEMP87);
            
//#line 1946
final int X10_TEMP88 =
              (X10_TEMP510);
            
//#line 1947
final int X10_TEMP514 =
              (X10_TEMP88);
            
//#line 1949
final int X10_TEMP517 =
              (X10_TEMP514);
            
//#line 1950
/* template:array_set { */(DK).set((X10_TEMP517),X10_TEMP79)/* } */;
            
//#line 1951
final int X10_TEMP519 =
              (j);
            
//#line 1953
final int X10_TEMP89 =
              (X10_TEMP519);
            
//#line 1954
final int X10_TEMP90 =
              (1);
            
//#line 1955
final int X10_TEMP523 =
              (j -
                 X10_TEMP90);
            
//#line 1956
j =
              ((X10_TEMP523));
            
//#line 1957
final int X10_TEMP525 =
              (t1);
            
//#line 1959
final int X10_TEMP94 =
              (X10_TEMP525);
            
//#line 1960
final int X10_TEMP529 =
              (X10_TEMP94);
            
//#line 1962
final int X10_TEMP532 =
              (X10_TEMP529);
            
//#line 1963
/* template:array_set { */(DK).set((X10_TEMP532),X10_TEMP89)/* } */;
            
//#line 1964
final int X10_TEMP534 =
              (k);
            
//#line 1966
final int X10_TEMP96 =
              (X10_TEMP534);
            
//#line 1967
final int X10_TEMP97 =
              (1);
            
//#line 1968
final int X10_TEMP538 =
              (k +
                 X10_TEMP97);
            
//#line 1969
k =
              ((X10_TEMP538));
            
//#line 1970
final int X10_TEMP541 =
              (/* template:array_get { */((Z).get(X10_TEMP96))/* } */);
            
//#line 1972
final int X10_TEMP100 =
              (X10_TEMP541);
            
//#line 1973
final int X10_TEMP545 =
              (this.
                 IDEATest_IDEATest_inv(
                 X10_TEMP100));
            
//#line 1975
final int X10_TEMP102 =
              (X10_TEMP545);
            
//#line 1976
final int X10_TEMP548 =
              (X10_TEMP102);
            
//#line 1978
t1 =
              ((X10_TEMP548));
            
//#line 1979
final int X10_TEMP551 =
              (k);
            
//#line 1981
final int X10_TEMP103 =
              (X10_TEMP551);
            
//#line 1982
final int X10_TEMP104 =
              (1);
            
//#line 1983
final int X10_TEMP555 =
              (k +
                 X10_TEMP104);
            
//#line 1984
k =
              ((X10_TEMP555));
            
//#line 1985
final int X10_TEMP558 =
              (/* template:array_get { */((Z).get(X10_TEMP103))/* } */);
            
//#line 1987
final int X10_TEMP106 =
              (X10_TEMP558);
            
//#line 1988
final int X10_TEMP107 =
              (0);
            
//#line 1989
final int X10_TEMP562 =
              (X10_TEMP107 -
                 X10_TEMP106);
            
//#line 1991
final int X10_TEMP108 =
              (X10_TEMP562);
            
//#line 1992
final int X10_TEMP565 =
              (65535);
            
//#line 1994
final int X10_TEMP109 =
              (X10_TEMP565);
            
//#line 1995
final int X10_TEMP568 =
              (X10_TEMP108 &
                 X10_TEMP109);
            
//#line 1997
final int X10_TEMP111 =
              (X10_TEMP568);
            
//#line 1998
final int X10_TEMP571 =
              (X10_TEMP111);
            
//#line 2000
t2 =
              ((X10_TEMP571));
            
//#line 2001
final int X10_TEMP574 =
              (k);
            
//#line 2003
final int X10_TEMP112 =
              (X10_TEMP574);
            
//#line 2004
final int X10_TEMP113 =
              (1);
            
//#line 2005
final int X10_TEMP578 =
              (k +
                 X10_TEMP113);
            
//#line 2006
k =
              ((X10_TEMP578));
            
//#line 2007
final int X10_TEMP581 =
              (/* template:array_get { */((Z).get(X10_TEMP112))/* } */);
            
//#line 2009
final int X10_TEMP115 =
              (X10_TEMP581);
            
//#line 2010
final int X10_TEMP116 =
              (0);
            
//#line 2011
final int X10_TEMP585 =
              (X10_TEMP116 -
                 X10_TEMP115);
            
//#line 2013
final int X10_TEMP117 =
              (X10_TEMP585);
            
//#line 2014
final int X10_TEMP588 =
              (65535);
            
//#line 2016
final int X10_TEMP118 =
              (X10_TEMP588);
            
//#line 2017
final int X10_TEMP591 =
              (X10_TEMP117 &
                 X10_TEMP118);
            
//#line 2019
final int X10_TEMP120 =
              (X10_TEMP591);
            
//#line 2020
final int X10_TEMP594 =
              (X10_TEMP120);
            
//#line 2022
t3 =
              ((X10_TEMP594));
            
//#line 2023
final int X10_TEMP597 =
              (j);
            
//#line 2025
final int X10_TEMP121 =
              (X10_TEMP597);
            
//#line 2026
final int X10_TEMP122 =
              (1);
            
//#line 2027
final int X10_TEMP601 =
              (j -
                 X10_TEMP122);
            
//#line 2028
j =
              ((X10_TEMP601));
            
//#line 2029
final int X10_TEMP603 =
              (k);
            
//#line 2031
final int X10_TEMP125 =
              (X10_TEMP603);
            
//#line 2032
final int X10_TEMP126 =
              (1);
            
//#line 2033
final int X10_TEMP607 =
              (k +
                 X10_TEMP126);
            
//#line 2034
k =
              ((X10_TEMP607));
            
//#line 2035
final int X10_TEMP610 =
              (/* template:array_get { */((Z).get(X10_TEMP125))/* } */);
            
//#line 2037
final int X10_TEMP129 =
              (X10_TEMP610);
            
//#line 2038
final int X10_TEMP614 =
              (this.
                 IDEATest_IDEATest_inv(
                 X10_TEMP129));
            
//#line 2040
final int X10_TEMP132 =
              (X10_TEMP614);
            
//#line 2041
final int X10_TEMP617 =
              (X10_TEMP132);
            
//#line 2043
final int X10_TEMP133 =
              (X10_TEMP617);
            
//#line 2044
final int X10_TEMP621 =
              (X10_TEMP133);
            
//#line 2046
final int X10_TEMP624 =
              (X10_TEMP621);
            
//#line 2047
/* template:array_set { */(DK).set((X10_TEMP624),X10_TEMP121)/* } */;
            
//#line 2048
final int X10_TEMP626 =
              (j);
            
//#line 2050
final int X10_TEMP134 =
              (X10_TEMP626);
            
//#line 2051
final int X10_TEMP135 =
              (1);
            
//#line 2052
final int X10_TEMP630 =
              (j -
                 X10_TEMP135);
            
//#line 2053
j =
              ((X10_TEMP630));
            
//#line 2054
final int X10_TEMP632 =
              (t2);
            
//#line 2056
final int X10_TEMP139 =
              (X10_TEMP632);
            
//#line 2057
final int X10_TEMP636 =
              (X10_TEMP139);
            
//#line 2059
final int X10_TEMP639 =
              (X10_TEMP636);
            
//#line 2060
/* template:array_set { */(DK).set((X10_TEMP639),X10_TEMP134)/* } */;
            
//#line 2061
final int X10_TEMP641 =
              (j);
            
//#line 2063
final int X10_TEMP140 =
              (X10_TEMP641);
            
//#line 2064
final int X10_TEMP141 =
              (1);
            
//#line 2065
final int X10_TEMP645 =
              (j -
                 X10_TEMP141);
            
//#line 2066
j =
              ((X10_TEMP645));
            
//#line 2067
final int X10_TEMP647 =
              (t3);
            
//#line 2069
final int X10_TEMP145 =
              (X10_TEMP647);
            
//#line 2070
final int X10_TEMP651 =
              (X10_TEMP145);
            
//#line 2072
final int X10_TEMP654 =
              (X10_TEMP651);
            
//#line 2073
/* template:array_set { */(DK).set((X10_TEMP654),X10_TEMP140)/* } */;
            
//#line 2074
final int X10_TEMP656 =
              (j);
            
//#line 2076
final int X10_TEMP146 =
              (X10_TEMP656);
            
//#line 2077
final int X10_TEMP147 =
              (1);
            
//#line 2078
final int X10_TEMP660 =
              (j -
                 X10_TEMP147);
            
//#line 2079
j =
              ((X10_TEMP660));
            
//#line 2080
final int X10_TEMP662 =
              (t1);
            
//#line 2082
final int X10_TEMP151 =
              (X10_TEMP662);
            
//#line 2083
final int X10_TEMP666 =
              (X10_TEMP151);
            
//#line 2085
final int X10_TEMP669 =
              (X10_TEMP666);
            
//#line 2086
/* template:array_set { */(DK).set((X10_TEMP669),X10_TEMP146)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2088
final int X10_TEMP671 =
          (k);
        
//#line 2090
final int X10_TEMP152 =
          (X10_TEMP671);
        
//#line 2091
final int X10_TEMP153 =
          (1);
        
//#line 2092
final int X10_TEMP675 =
          (k +
             X10_TEMP153);
        
//#line 2093
k =
          ((X10_TEMP675));
        
//#line 2094
final int X10_TEMP678 =
          (/* template:array_get { */((Z).get(X10_TEMP152))/* } */);
        
//#line 2096
final int X10_TEMP156 =
          (X10_TEMP678);
        
//#line 2097
final int X10_TEMP681 =
          (X10_TEMP156);
        
//#line 2099
t1 =
          ((X10_TEMP681));
        
//#line 2100
final int X10_TEMP684 =
          (j);
        
//#line 2102
final int X10_TEMP157 =
          (X10_TEMP684);
        
//#line 2103
final int X10_TEMP158 =
          (1);
        
//#line 2104
final int X10_TEMP688 =
          (j -
             X10_TEMP158);
        
//#line 2105
j =
          ((X10_TEMP688));
        
//#line 2106
final int X10_TEMP690 =
          (k);
        
//#line 2108
final int X10_TEMP160 =
          (X10_TEMP690);
        
//#line 2109
final int X10_TEMP161 =
          (1);
        
//#line 2110
final int X10_TEMP694 =
          (k +
             X10_TEMP161);
        
//#line 2111
k =
          ((X10_TEMP694));
        
//#line 2112
final int X10_TEMP697 =
          (/* template:array_get { */((Z).get(X10_TEMP160))/* } */);
        
//#line 2114
final int X10_TEMP165 =
          (X10_TEMP697);
        
//#line 2115
final int X10_TEMP700 =
          (X10_TEMP165);
        
//#line 2117
final int X10_TEMP166 =
          (X10_TEMP700);
        
//#line 2118
final int X10_TEMP704 =
          (X10_TEMP166);
        
//#line 2120
final int X10_TEMP707 =
          (X10_TEMP704);
        
//#line 2121
/* template:array_set { */(DK).set((X10_TEMP707),X10_TEMP157)/* } */;
        
//#line 2122
final int X10_TEMP709 =
          (j);
        
//#line 2124
final int X10_TEMP167 =
          (X10_TEMP709);
        
//#line 2125
final int X10_TEMP168 =
          (1);
        
//#line 2126
final int X10_TEMP713 =
          (j -
             X10_TEMP168);
        
//#line 2127
j =
          ((X10_TEMP713));
        
//#line 2128
final int X10_TEMP715 =
          (t1);
        
//#line 2130
final int X10_TEMP172 =
          (X10_TEMP715);
        
//#line 2131
final int X10_TEMP719 =
          (X10_TEMP172);
        
//#line 2133
final int X10_TEMP722 =
          (X10_TEMP719);
        
//#line 2134
/* template:array_set { */(DK).set((X10_TEMP722),X10_TEMP167)/* } */;
        
//#line 2135
final int X10_TEMP724 =
          (k);
        
//#line 2137
final int X10_TEMP174 =
          (X10_TEMP724);
        
//#line 2138
final int X10_TEMP175 =
          (1);
        
//#line 2139
final int X10_TEMP728 =
          (k +
             X10_TEMP175);
        
//#line 2140
k =
          ((X10_TEMP728));
        
//#line 2141
final int X10_TEMP731 =
          (/* template:array_get { */((Z).get(X10_TEMP174))/* } */);
        
//#line 2143
final int X10_TEMP178 =
          (X10_TEMP731);
        
//#line 2144
final int X10_TEMP735 =
          (this.
             IDEATest_IDEATest_inv(
             X10_TEMP178));
        
//#line 2146
final int X10_TEMP180 =
          (X10_TEMP735);
        
//#line 2147
final int X10_TEMP738 =
          (X10_TEMP180);
        
//#line 2149
t1 =
          ((X10_TEMP738));
        
//#line 2150
final int X10_TEMP741 =
          (k);
        
//#line 2152
final int X10_TEMP181 =
          (X10_TEMP741);
        
//#line 2153
final int X10_TEMP182 =
          (1);
        
//#line 2154
final int X10_TEMP745 =
          (k +
             X10_TEMP182);
        
//#line 2155
k =
          ((X10_TEMP745));
        
//#line 2156
final int X10_TEMP748 =
          (/* template:array_get { */((Z).get(X10_TEMP181))/* } */);
        
//#line 2158
final int X10_TEMP184 =
          (X10_TEMP748);
        
//#line 2159
final int X10_TEMP185 =
          (0);
        
//#line 2160
final int X10_TEMP752 =
          (X10_TEMP185 -
             X10_TEMP184);
        
//#line 2162
final int X10_TEMP186 =
          (X10_TEMP752);
        
//#line 2163
final int X10_TEMP755 =
          (65535);
        
//#line 2165
final int X10_TEMP187 =
          (X10_TEMP755);
        
//#line 2166
final int X10_TEMP758 =
          (X10_TEMP186 &
             X10_TEMP187);
        
//#line 2168
final int X10_TEMP189 =
          (X10_TEMP758);
        
//#line 2169
final int X10_TEMP761 =
          (X10_TEMP189);
        
//#line 2171
t2 =
          ((X10_TEMP761));
        
//#line 2172
final int X10_TEMP764 =
          (k);
        
//#line 2174
final int X10_TEMP190 =
          (X10_TEMP764);
        
//#line 2175
final int X10_TEMP191 =
          (1);
        
//#line 2176
final int X10_TEMP768 =
          (k +
             X10_TEMP191);
        
//#line 2177
k =
          ((X10_TEMP768));
        
//#line 2178
final int X10_TEMP771 =
          (/* template:array_get { */((Z).get(X10_TEMP190))/* } */);
        
//#line 2180
final int X10_TEMP193 =
          (X10_TEMP771);
        
//#line 2181
final int X10_TEMP194 =
          (0);
        
//#line 2182
final int X10_TEMP775 =
          (X10_TEMP194 -
             X10_TEMP193);
        
//#line 2184
final int X10_TEMP195 =
          (X10_TEMP775);
        
//#line 2185
final int X10_TEMP778 =
          (65535);
        
//#line 2187
final int X10_TEMP196 =
          (X10_TEMP778);
        
//#line 2188
final int X10_TEMP781 =
          (X10_TEMP195 &
             X10_TEMP196);
        
//#line 2190
final int X10_TEMP198 =
          (X10_TEMP781);
        
//#line 2191
final int X10_TEMP784 =
          (X10_TEMP198);
        
//#line 2193
t3 =
          ((X10_TEMP784));
        
//#line 2194
final int X10_TEMP787 =
          (j);
        
//#line 2196
final int X10_TEMP199 =
          (X10_TEMP787);
        
//#line 2197
final int X10_TEMP200 =
          (1);
        
//#line 2198
final int X10_TEMP791 =
          (j -
             X10_TEMP200);
        
//#line 2199
j =
          ((X10_TEMP791));
        
//#line 2200
final int X10_TEMP793 =
          (k);
        
//#line 2202
final int X10_TEMP203 =
          (X10_TEMP793);
        
//#line 2203
final int X10_TEMP204 =
          (1);
        
//#line 2204
final int X10_TEMP797 =
          (k +
             X10_TEMP204);
        
//#line 2205
k =
          ((X10_TEMP797));
        
//#line 2206
final int X10_TEMP800 =
          (/* template:array_get { */((Z).get(X10_TEMP203))/* } */);
        
//#line 2208
final int X10_TEMP207 =
          (X10_TEMP800);
        
//#line 2209
final int X10_TEMP804 =
          (this.
             IDEATest_IDEATest_inv(
             X10_TEMP207));
        
//#line 2211
final int X10_TEMP210 =
          (X10_TEMP804);
        
//#line 2212
final int X10_TEMP807 =
          (X10_TEMP210);
        
//#line 2214
final int X10_TEMP211 =
          (X10_TEMP807);
        
//#line 2215
final int X10_TEMP811 =
          (X10_TEMP211);
        
//#line 2217
final int X10_TEMP814 =
          (X10_TEMP811);
        
//#line 2218
/* template:array_set { */(DK).set((X10_TEMP814),X10_TEMP199)/* } */;
        
//#line 2219
final int X10_TEMP816 =
          (j);
        
//#line 2221
final int X10_TEMP212 =
          (X10_TEMP816);
        
//#line 2222
final int X10_TEMP213 =
          (1);
        
//#line 2223
final int X10_TEMP820 =
          (j -
             X10_TEMP213);
        
//#line 2224
j =
          ((X10_TEMP820));
        
//#line 2225
final int X10_TEMP822 =
          (t3);
        
//#line 2227
final int X10_TEMP217 =
          (X10_TEMP822);
        
//#line 2228
final int X10_TEMP826 =
          (X10_TEMP217);
        
//#line 2230
final int X10_TEMP829 =
          (X10_TEMP826);
        
//#line 2231
/* template:array_set { */(DK).set((X10_TEMP829),X10_TEMP212)/* } */;
        
//#line 2232
final int X10_TEMP831 =
          (j);
        
//#line 2234
final int X10_TEMP218 =
          (X10_TEMP831);
        
//#line 2235
final int X10_TEMP219 =
          (1);
        
//#line 2236
final int X10_TEMP835 =
          (j -
             X10_TEMP219);
        
//#line 2237
j =
          ((X10_TEMP835));
        
//#line 2238
final int X10_TEMP837 =
          (t2);
        
//#line 2240
final int X10_TEMP223 =
          (X10_TEMP837);
        
//#line 2241
final int X10_TEMP841 =
          (X10_TEMP223);
        
//#line 2243
final int X10_TEMP844 =
          (X10_TEMP841);
        
//#line 2244
/* template:array_set { */(DK).set((X10_TEMP844),X10_TEMP218)/* } */;
        
//#line 2245
final int X10_TEMP846 =
          (j);
        
//#line 2247
final int X10_TEMP224 =
          (X10_TEMP846);
        
//#line 2248
final int X10_TEMP225 =
          (1);
        
//#line 2249
final int X10_TEMP850 =
          (j -
             X10_TEMP225);
        
//#line 2250
j =
          ((X10_TEMP850));
        
//#line 2251
final int X10_TEMP852 =
          (t1);
        
//#line 2253
final int X10_TEMP229 =
          (X10_TEMP852);
        
//#line 2254
final int X10_TEMP856 =
          (X10_TEMP229);
        
//#line 2256
final int X10_TEMP859 =
          (X10_TEMP856);
        
//#line 2257
/* template:array_set { */(DK).set((X10_TEMP859),X10_TEMP224)/* } */;
        
//#line 2258
final x10.
          lang.
          intArray X10_TEMP866 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rDK.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point i/* } */, int dummy) { {
                  
//#line 2259
final int X10_TEMP862 =
                    (/* template:array_get { */((DK).get(i))/* } */);
                  
//#line 2261
final int X10_TEMP232 =
                    (X10_TEMP862);
                  
//#line 2262
return X10_TEMP232;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 2267
final x10.
          lang.
          intArray X10_TEMP233 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP866));
        
//#line 2268
final x10.
          lang.
          intArray X10_TEMP869 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP233));
        
//#line 2270
DKR =
          (x10.
            lang.
            intArray)
            ((X10_TEMP869));
    }
    
    
//#line 2272
public int
                    IDEATest_IDEATest_inv(
                    final int ax) {
        
//#line 2273
final int X10_TEMP306 =
          (0);
        
//#line 2275
int t0 =
          (X10_TEMP306);
        
//#line 2276
final int X10_TEMP309 =
          (0);
        
//#line 2278
int t1 =
          (X10_TEMP309);
        
//#line 2279
final int X10_TEMP312 =
          (0);
        
//#line 2281
int q =
          (X10_TEMP312);
        
//#line 2282
final int X10_TEMP315 =
          (0);
        
//#line 2284
int y =
          (X10_TEMP315);
        
//#line 2285
final int X10_TEMP318 =
          (ax);
        
//#line 2287
int x =
          (X10_TEMP318);
        
//#line 2288
final int X10_TEMP321 =
          (1);
        
//#line 2290
final int X10_TEMP6 =
          (X10_TEMP321);
        
//#line 2291
final boolean X10_TEMP8 =
          (x <=
             X10_TEMP6);
        
//#line 2292
if (X10_TEMP8) {
            
//#line 2293
final int X10_TEMP326 =
              (x);
            
//#line 2295
final int X10_TEMP10 =
              (X10_TEMP326);
            
//#line 2296
return X10_TEMP10;
        }
        
//#line 2298
final int X10_TEMP330 =
          (65537);
        
//#line 2300
final int X10_TEMP12 =
          (X10_TEMP330);
        
//#line 2301
final int X10_TEMP333 =
          (X10_TEMP12 /
             x);
        
//#line 2303
final int X10_TEMP14 =
          (X10_TEMP333);
        
//#line 2304
final int X10_TEMP336 =
          (X10_TEMP14);
        
//#line 2306
t1 =
          ((X10_TEMP336));
        
//#line 2307
final int X10_TEMP339 =
          (65537);
        
//#line 2309
final int X10_TEMP15 =
          (X10_TEMP339);
        
//#line 2310
final int X10_TEMP342 =
          (X10_TEMP15 %
             x);
        
//#line 2312
final int X10_TEMP17 =
          (X10_TEMP342);
        
//#line 2313
final int X10_TEMP345 =
          (X10_TEMP17);
        
//#line 2315
y =
          ((X10_TEMP345));
        
//#line 2316
final int X10_TEMP348 =
          (1);
        
//#line 2318
final int X10_TEMP18 =
          (X10_TEMP348);
        
//#line 2319
final boolean X10_TEMP20 =
          (y ==
             X10_TEMP18);
        
//#line 2320
if (X10_TEMP20) {
            
//#line 2321
final int X10_TEMP353 =
              (1);
            
//#line 2323
final int X10_TEMP21 =
              (X10_TEMP353);
            
//#line 2324
final int X10_TEMP356 =
              (X10_TEMP21 -
                 t1);
            
//#line 2326
final int X10_TEMP23 =
              (X10_TEMP356);
            
//#line 2327
final int X10_TEMP359 =
              (65535);
            
//#line 2329
final int X10_TEMP24 =
              (X10_TEMP359);
            
//#line 2330
final int X10_TEMP362 =
              (X10_TEMP23 &
                 X10_TEMP24);
            
//#line 2332
final int X10_TEMP26 =
              (X10_TEMP362);
            
//#line 2333
return X10_TEMP26;
        }
        
//#line 2335
final int X10_TEMP366 =
          (1);
        
//#line 2337
final int X10_TEMP29 =
          (X10_TEMP366);
        
//#line 2338
final int X10_TEMP369 =
          (X10_TEMP29);
        
//#line 2340
t0 =
          ((X10_TEMP369));
        
//#line 2341
boolean X10_TEMP30 =
          (false);
        
//#line 2342
boolean X10_TEMP372 =
          false;
        
//#line 2343
do  {
            
//#line 2344
final int X10_TEMP374 =
              (x /
                 y);
            
//#line 2346
final int X10_TEMP32 =
              (X10_TEMP374);
            
//#line 2347
final int X10_TEMP377 =
              (X10_TEMP32);
            
//#line 2349
q =
              ((X10_TEMP377));
            
//#line 2350
final int X10_TEMP380 =
              (x %
                 y);
            
//#line 2352
final int X10_TEMP34 =
              (X10_TEMP380);
            
//#line 2353
final int X10_TEMP383 =
              (X10_TEMP34);
            
//#line 2355
x =
              ((X10_TEMP383));
            
//#line 2356
final int X10_TEMP386 =
              (q *
                 t1);
            
//#line 2358
final int X10_TEMP36 =
              (X10_TEMP386);
            
//#line 2359
final int X10_TEMP389 =
              (t0 +
                 X10_TEMP36);
            
//#line 2361
t0 =
              ((X10_TEMP389));
            
//#line 2362
final int X10_TEMP392 =
              (1);
            
//#line 2364
final int X10_TEMP37 =
              (X10_TEMP392);
            
//#line 2365
final boolean X10_TEMP39 =
              (x ==
                 X10_TEMP37);
            
//#line 2366
if (X10_TEMP39) {
                
//#line 2367
final int X10_TEMP397 =
                  (t0);
                
//#line 2369
final int X10_TEMP41 =
                  (X10_TEMP397);
                
//#line 2370
return X10_TEMP41;
            }
            
//#line 2372
final int X10_TEMP401 =
              (y /
                 x);
            
//#line 2374
final int X10_TEMP44 =
              (X10_TEMP401);
            
//#line 2375
final int X10_TEMP404 =
              (X10_TEMP44);
            
//#line 2377
q =
              ((X10_TEMP404));
            
//#line 2378
final int X10_TEMP407 =
              (y %
                 x);
            
//#line 2380
final int X10_TEMP46 =
              (X10_TEMP407);
            
//#line 2381
final int X10_TEMP410 =
              (X10_TEMP46);
            
//#line 2383
y =
              ((X10_TEMP410));
            
//#line 2384
final int X10_TEMP413 =
              (q *
                 t0);
            
//#line 2386
final int X10_TEMP48 =
              (X10_TEMP413);
            
//#line 2387
final int X10_TEMP416 =
              (t1 +
                 X10_TEMP48);
            
//#line 2389
t1 =
              ((X10_TEMP416));
            
//#line 2390
final int X10_TEMP419 =
              (1);
            
//#line 2392
final int X10_TEMP49 =
              (X10_TEMP419);
            
//#line 2393
final boolean X10_TEMP422 =
              (y !=
                 X10_TEMP49);
            
//#line 2394
X10_TEMP30 =
              ((X10_TEMP422));
            
//#line 2395
X10_TEMP372 =
              X10_TEMP30;
        }while(X10_TEMP372); 
        
//#line 2397
final int X10_TEMP425 =
          (1);
        
//#line 2399
final int X10_TEMP51 =
          (X10_TEMP425);
        
//#line 2400
final int X10_TEMP428 =
          (X10_TEMP51 -
             t1);
        
//#line 2402
final int X10_TEMP53 =
          (X10_TEMP428);
        
//#line 2403
final int X10_TEMP431 =
          (65535);
        
//#line 2405
final int X10_TEMP54 =
          (X10_TEMP431);
        
//#line 2406
final int X10_TEMP434 =
          (X10_TEMP53 &
             X10_TEMP54);
        
//#line 2408
final int X10_TEMP56 =
          (X10_TEMP434);
        
//#line 2409
return X10_TEMP56;
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 2415
public long
      seed;
    
    
//#line 2418
public Random(final long rseed) {
        
//#line 2418
super();
        
//#line 2419
this.
                        Random_Random_setSeed(
                        rseed);
    }
    
    
//#line 2423
public void
                    Random_Random_setSeed(
                    final long rseed) {
        
//#line 2424
final long X10_TEMP306 =
          (Program0.
             _Program__Random_multiplier);
        
//#line 2426
final long X10_TEMP1 =
          (X10_TEMP306);
        
//#line 2427
final long X10_TEMP309 =
          (rseed ^
             X10_TEMP1);
        
//#line 2429
final long X10_TEMP3 =
          (X10_TEMP309);
        
//#line 2430
final long X10_TEMP312 =
          (Program0.
             _Program__Random_mask);
        
//#line 2432
final long X10_TEMP4 =
          (X10_TEMP312);
        
//#line 2433
final long X10_TEMP315 =
          (X10_TEMP3 &
             X10_TEMP4);
        
//#line 2435
final long X10_TEMP6 =
          (X10_TEMP315);
        
//#line 2436
final long X10_TEMP318 =
          (X10_TEMP6);
        
//#line 2438
seed =
          ((X10_TEMP318));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 2444
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 2445
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 2446
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 2449
public Timer() {
        
//#line 2449
super();
        
//#line 2450
final int X10_TEMP306 =
          (0);
        
//#line 2452
int i =
          (X10_TEMP306);
        
//#line 2453
final int X10_TEMP309 =
          (0);
        
//#line 2455
final int X10_TEMP4 =
          (X10_TEMP309);
        
//#line 2456
final int X10_TEMP312 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 2458
final int X10_TEMP5 =
          (X10_TEMP312);
        
//#line 2459
final x10.
          lang.
          region X10_TEMP317 =
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
        
//#line 2461
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP317));
        
//#line 2462
final x10.
          lang.
          place X10_TEMP320 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 2464
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP320);
        
//#line 2465
final x10.
          lang.
          dist X10_TEMP323 =
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
        
//#line 2467
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP323));
        
//#line 2468
final x10.
          lang.
          DoubleReferenceArray X10_TEMP326 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2470
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP326));
        
//#line 2471
final x10.
          lang.
          DoubleReferenceArray X10_TEMP329 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 2473
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP329));
        
//#line 2474
final x10.
          lang.
          DoubleReferenceArray X10_TEMP332 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2476
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP332));
        
//#line 2477
final x10.
          lang.
          DoubleReferenceArray X10_TEMP335 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 2479
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP335));
        
//#line 2480
final x10.
          lang.
          DoubleReferenceArray X10_TEMP338 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2482
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP338));
        
//#line 2483
final x10.
          lang.
          DoubleReferenceArray X10_TEMP341 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 2485
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP341));
        
//#line 2486
final int X10_TEMP344 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 2488
final int X10_TEMP15 =
          (X10_TEMP344);
        
//#line 2489
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 2490
boolean X10_TEMP349 =
          X10_TEMP19;
        
//#line 2491
while (X10_TEMP349) {
            
//#line 2492
final int X10_TEMP351 =
              (0);
            
//#line 2494
final double X10_TEMP23 =
              (X10_TEMP351);
            
//#line 2495
final double X10_TEMP354 =
              (X10_TEMP23);
            
//#line 2497
final double X10_TEMP24 =
              (X10_TEMP354);
            
//#line 2498
final double X10_TEMP358 =
              (X10_TEMP24);
            
//#line 2500
final double X10_TEMP361 =
              (X10_TEMP358);
            
//#line 2501
/* template:array_set { */(start_time).set((X10_TEMP361),i)/* } */;
            
//#line 2502
final int X10_TEMP363 =
              (0);
            
//#line 2504
final double X10_TEMP28 =
              (X10_TEMP363);
            
//#line 2505
final double X10_TEMP366 =
              (X10_TEMP28);
            
//#line 2507
final double X10_TEMP29 =
              (X10_TEMP366);
            
//#line 2508
final double X10_TEMP370 =
              (X10_TEMP29);
            
//#line 2510
final double X10_TEMP373 =
              (X10_TEMP370);
            
//#line 2511
/* template:array_set { */(elapsed_time).set((X10_TEMP373),i)/* } */;
            
//#line 2512
final int X10_TEMP375 =
              (0);
            
//#line 2514
final double X10_TEMP33 =
              (X10_TEMP375);
            
//#line 2515
final double X10_TEMP378 =
              (X10_TEMP33);
            
//#line 2517
final double X10_TEMP34 =
              (X10_TEMP378);
            
//#line 2518
final double X10_TEMP382 =
              (X10_TEMP34);
            
//#line 2520
final double X10_TEMP385 =
              (X10_TEMP382);
            
//#line 2521
/* template:array_set { */(total_time).set((X10_TEMP385),i)/* } */;
            
//#line 2522
final int X10_TEMP387 =
              (i);
            
//#line 2524
final int X10_TEMP35 =
              (X10_TEMP387);
            
//#line 2525
final int X10_TEMP36 =
              (1);
            
//#line 2526
final int X10_TEMP391 =
              (i +
                 X10_TEMP36);
            
//#line 2527
i =
              ((X10_TEMP391));
            
//#line 2528
final int X10_TEMP393 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 2530
final int X10_TEMP17 =
              (X10_TEMP393);
            
//#line 2531
final boolean X10_TEMP396 =
              (i <
                 X10_TEMP17);
            
//#line 2532
X10_TEMP19 =
              ((X10_TEMP396));
            
//#line 2533
X10_TEMP349 =
              X10_TEMP19;
        }
    }
}
