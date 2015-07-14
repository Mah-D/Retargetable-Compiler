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
final public static long
      _Program__Random_multiplier =
      Program0.
        _Program__Random_multiplier_init();
    
//#line 10
final public static long
      _Program__Random_addend =
      Program0.
        _Program__Random_addend_init();
    
//#line 11
final public static long
      _Program__Random_mask =
      Program0.
        _Program__Random_mask_init();
    
//#line 12
final public static int
      _Program__SOR_JACOBI_NUM_ITER =
      Program0.
        _Program__SOR_JACOBI_NUM_ITER_init();
    
//#line 13
final public static long
      _Program__SOR_RANDOM_SEED =
      Program0.
        _Program__SOR_RANDOM_SEED_init();
    
//#line 14
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 17
public static void
                  runMain(
                  ) {
        
//#line 18
Program0.
                      Program_runMain();
    }
    
    
//#line 20
public static long
                  _Program__Random_multiplier_init(
                  ) {
        
//#line 22
final long X10_TEMP144 =
          (Program0.
             Program__Random_multiplier_init());
        
//#line 23
return X10_TEMP144;
    }
    
    
//#line 25
public static long
                  _Program__Random_addend_init(
                  ) {
        
//#line 27
final long X10_TEMP144 =
          (Program0.
             Program__Random_addend_init());
        
//#line 28
return X10_TEMP144;
    }
    
    
//#line 30
public static long
                  _Program__Random_mask_init(
                  ) {
        
//#line 32
final long X10_TEMP144 =
          (Program0.
             Program__Random_mask_init());
        
//#line 33
return X10_TEMP144;
    }
    
    
//#line 35
public static int
                  _Program__SOR_JACOBI_NUM_ITER_init(
                  ) {
        
//#line 37
final int X10_TEMP144 =
          (Program0.
             Program__SOR_JACOBI_NUM_ITER_init());
        
//#line 38
return X10_TEMP144;
    }
    
    
//#line 40
public static long
                  _Program__SOR_RANDOM_SEED_init(
                  ) {
        
//#line 42
final long X10_TEMP144 =
          (Program0.
             Program__SOR_RANDOM_SEED_init());
        
//#line 43
return X10_TEMP144;
    }
    
    
//#line 45
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 47
final int X10_TEMP144 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 48
return X10_TEMP144;
    }
    
    
//#line 50
public static long
                  Program__Random_multiplier_init(
                  ) {
        
//#line 51
final long X10_TEMP144 =
          (25214903917L);
        
//#line 53
final long X10_TEMP2 =
          (X10_TEMP144);
        
//#line 54
return X10_TEMP2;
    }
    
    
//#line 56
public static long
                  Program__Random_addend_init(
                  ) {
        
//#line 57
final long X10_TEMP144 =
          (11L);
        
//#line 59
final long X10_TEMP2 =
          (X10_TEMP144);
        
//#line 60
return X10_TEMP2;
    }
    
    
//#line 62
public static long
                  Program__Random_mask_init(
                  ) {
        
//#line 63
final long X10_TEMP144 =
          (1L);
        
//#line 65
final long X10_TEMP1 =
          (X10_TEMP144);
        
//#line 66
final int X10_TEMP147 =
          (48);
        
//#line 68
final int X10_TEMP2 =
          (X10_TEMP147);
        
//#line 69
final long X10_TEMP150 =
          (X10_TEMP1 <<
             X10_TEMP2);
        
//#line 71
final long X10_TEMP4 =
          (X10_TEMP150);
        
//#line 72
final int X10_TEMP153 =
          (1);
        
//#line 74
final int X10_TEMP5 =
          (X10_TEMP153);
        
//#line 75
final long X10_TEMP156 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 77
final long X10_TEMP7 =
          (X10_TEMP156);
        
//#line 78
return X10_TEMP7;
    }
    
    
//#line 80
public static int
                  Program_Random_nextbits(
                  final Random X10_TEMP0,
                  final int bits) {
        
//#line 81
final long X10_TEMP144 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed);
        
//#line 83
long oldseed =
          (X10_TEMP144);
        
//#line 84
final long X10_TEMP147 =
          (oldseed *
             _Program__Random_multiplier);
        
//#line 86
final long X10_TEMP2 =
          (X10_TEMP147);
        
//#line 87
final long X10_TEMP150 =
          (X10_TEMP2 +
             _Program__Random_addend);
        
//#line 89
final long X10_TEMP4 =
          (X10_TEMP150);
        
//#line 90
final long X10_TEMP153 =
          (X10_TEMP4 &
             _Program__Random_mask);
        
//#line 92
long nextseed =
          (X10_TEMP153);
        
//#line 93
final long X10_TEMP156 =
          (nextseed);
        
//#line 95
final long X10_TEMP8 =
          (X10_TEMP156);
        
//#line 96
final long X10_TEMP159 =
          (X10_TEMP8);
        
//#line 98
final long X10_TEMP162 =
          (X10_TEMP159);
        
//#line 99
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed =
          ((X10_TEMP162));
        
//#line 100
final int X10_TEMP164 =
          (48);
        
//#line 102
final int X10_TEMP9 =
          (X10_TEMP164);
        
//#line 103
final int X10_TEMP167 =
          (X10_TEMP9 -
             bits);
        
//#line 105
final int X10_TEMP11 =
          (X10_TEMP167);
        
//#line 106
final long X10_TEMP170 =
          (nextseed >>>
             X10_TEMP11);
        
//#line 108
final long X10_TEMP13 =
          (X10_TEMP170);
        
//#line 109
final int X10_TEMP173 =
          ((int)
             X10_TEMP13);
        
//#line 111
final int X10_TEMP15 =
          (X10_TEMP173);
        
//#line 112
return X10_TEMP15;
    }
    
    
//#line 114
public static int
                   Program_Random_nextInt(
                   final Random X10_TEMP0) {
        
//#line 115
final int X10_TEMP144 =
          (32);
        
//#line 117
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 118
final int X10_TEMP149 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 120
final int X10_TEMP4 =
          (X10_TEMP149);
        
//#line 121
return X10_TEMP4;
    }
    
    
//#line 123
public static long
                   Program_Random_nextLong(
                   final Random X10_TEMP0) {
        
//#line 124
final int X10_TEMP144 =
          (32);
        
//#line 126
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 127
final int X10_TEMP149 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 129
final int X10_TEMP4 =
          (X10_TEMP149);
        
//#line 130
final long X10_TEMP152 =
          ((long)
             X10_TEMP4);
        
//#line 132
final long X10_TEMP5 =
          (X10_TEMP152);
        
//#line 133
final int X10_TEMP155 =
          (32);
        
//#line 135
final int X10_TEMP6 =
          (X10_TEMP155);
        
//#line 136
final long X10_TEMP158 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 138
final long X10_TEMP8 =
          (X10_TEMP158);
        
//#line 139
final int X10_TEMP161 =
          (32);
        
//#line 141
final int X10_TEMP10 =
          (X10_TEMP161);
        
//#line 142
final int X10_TEMP166 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 144
final int X10_TEMP11 =
          (X10_TEMP166);
        
//#line 145
final long X10_TEMP169 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 147
final long X10_TEMP13 =
          (X10_TEMP169);
        
//#line 148
return X10_TEMP13;
    }
    
    
//#line 150
public static boolean
                   Program_Random_nextBoolean(
                   final Random X10_TEMP0) {
        
//#line 151
final int X10_TEMP144 =
          (1);
        
//#line 153
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 154
final int X10_TEMP149 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 156
final int X10_TEMP3 =
          (X10_TEMP149);
        
//#line 157
final int X10_TEMP152 =
          (0);
        
//#line 159
final int X10_TEMP4 =
          (X10_TEMP152);
        
//#line 160
final boolean X10_TEMP155 =
          (X10_TEMP3 !=
             X10_TEMP4);
        
//#line 162
final boolean X10_TEMP6 =
          (X10_TEMP155);
        
//#line 163
return X10_TEMP6;
    }
    
    
//#line 165
public static double
                   Program_Random_nextDouble(
                   final Random X10_TEMP0) {
        
//#line 166
final int X10_TEMP144 =
          (26);
        
//#line 168
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 169
final int X10_TEMP149 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 171
final int X10_TEMP4 =
          (X10_TEMP149);
        
//#line 172
final long X10_TEMP152 =
          ((long)
             X10_TEMP4);
        
//#line 174
final long X10_TEMP5 =
          (X10_TEMP152);
        
//#line 175
final int X10_TEMP155 =
          (27);
        
//#line 177
final int X10_TEMP6 =
          (X10_TEMP155);
        
//#line 178
final long X10_TEMP158 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 180
final long X10_TEMP8 =
          (X10_TEMP158);
        
//#line 181
final int X10_TEMP161 =
          (27);
        
//#line 183
final int X10_TEMP10 =
          (X10_TEMP161);
        
//#line 184
final int X10_TEMP166 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 186
final int X10_TEMP11 =
          (X10_TEMP166);
        
//#line 187
final long X10_TEMP169 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 189
final long X10_TEMP13 =
          (X10_TEMP169);
        
//#line 190
final long X10_TEMP172 =
          (1L);
        
//#line 192
final long X10_TEMP14 =
          (X10_TEMP172);
        
//#line 193
final int X10_TEMP175 =
          (53);
        
//#line 195
final int X10_TEMP15 =
          (X10_TEMP175);
        
//#line 196
final long X10_TEMP178 =
          (X10_TEMP14 <<
             X10_TEMP15);
        
//#line 198
final long X10_TEMP17 =
          (X10_TEMP178);
        
//#line 199
final double X10_TEMP181 =
          ((double)
             X10_TEMP17);
        
//#line 201
final double X10_TEMP18 =
          (X10_TEMP181);
        
//#line 202
final double X10_TEMP184 =
          (X10_TEMP13 /
             X10_TEMP18);
        
//#line 204
final double X10_TEMP20 =
          (X10_TEMP184);
        
//#line 205
return X10_TEMP20;
    }
    
    
//#line 207
public static int
                   Program__SOR_JACOBI_NUM_ITER_init(
                   ) {
        
//#line 208
final int X10_TEMP144 =
          (100);
        
//#line 210
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 211
return X10_TEMP2;
    }
    
    
//#line 213
public static long
                   Program__SOR_RANDOM_SEED_init(
                   ) {
        
//#line 214
final int X10_TEMP144 =
          (10101010);
        
//#line 216
final long X10_TEMP2 =
          (X10_TEMP144);
        
//#line 217
return X10_TEMP2;
    }
    
    
//#line 219
public static void
                   Program_SOR_run(
                   final SOR X10_TEMP0) {
        
//#line 220
Program0.
                       Program_SOR_kernel(
                       X10_TEMP0);
        
//#line 221
Program0.
                       Program_SOR_validate(
                       X10_TEMP0);
    }
    
    
//#line 223
public static void
                   Program_SOR_kernel(
                   final SOR X10_TEMP0) {
        
//#line 224
final int X10_TEMP144 =
          (10);
        
//#line 226
final int X10_TEMP4 =
          (X10_TEMP144);
        
//#line 227
final int X10_TEMP147 =
          (10);
        
//#line 229
final int X10_TEMP5 =
          (X10_TEMP147);
        
//#line 230
final Random X10_TEMP150 =
          (/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.R);
        
//#line 232
final Random X10_TEMP6 =
          (X10_TEMP150);
        
//#line 233
final x10.
          lang.
          DoubleReferenceArray X10_TEMP157 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program_SOR_RandomMatrix(
                X10_TEMP0,
                X10_TEMP4,
                X10_TEMP5,
                X10_TEMP6)));
        
//#line 235
x10.
          lang.
          DoubleReferenceArray G =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP157));
        
//#line 236
final double X10_TEMP160 =
          (1.25);
        
//#line 238
final double X10_TEMP11 =
          (X10_TEMP160);
        
//#line 239
Program0.
                       Program_SOR_SORrun(
                       X10_TEMP0,
                       X10_TEMP11,
                       G,
                       _Program__SOR_JACOBI_NUM_ITER);
    }
    
    
//#line 241
public static x10.
                   lang.
                   DoubleReferenceArray
                   Program_SOR_RandomMatrix(
                   final SOR X10_TEMP0,
                   final int M,
                   final int N,
                   final Random R) {
        
//#line 242
final int X10_TEMP144 =
          (0);
        
//#line 244
final int X10_TEMP4 =
          (X10_TEMP144);
        
//#line 245
final int X10_TEMP147 =
          (1);
        
//#line 247
final int X10_TEMP2 =
          (X10_TEMP147);
        
//#line 248
final int X10_TEMP150 =
          (M -
             X10_TEMP2);
        
//#line 250
final int X10_TEMP5 =
          (X10_TEMP150);
        
//#line 251
final x10.
          lang.
          region X10_TEMP155 =
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
        
//#line 253
final x10.
          lang.
          region X10_TEMP13 =
          (x10.
            lang.
            region)
            ((X10_TEMP155));
        
//#line 254
final int X10_TEMP158 =
          (0);
        
//#line 256
final int X10_TEMP10 =
          (X10_TEMP158);
        
//#line 257
final int X10_TEMP161 =
          (1);
        
//#line 259
final int X10_TEMP8 =
          (X10_TEMP161);
        
//#line 260
final int X10_TEMP164 =
          (N -
             X10_TEMP8);
        
//#line 262
final int X10_TEMP11 =
          (X10_TEMP164);
        
//#line 263
final x10.
          lang.
          region X10_TEMP169 =
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
                  X10_TEMP10,
                  X10_TEMP11))));
        
//#line 265
final x10.
          lang.
          region X10_TEMP14 =
          (x10.
            lang.
            region)
            ((X10_TEMP169));
        
//#line 266
final x10.
          lang.
          dist X10_TEMP175 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program_SOR_blockStar(
                X10_TEMP0,
                X10_TEMP13,
                X10_TEMP14)));
        
//#line 268
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP175));
        
//#line 269
final x10.
          lang.
          DoubleReferenceArray X10_TEMP178 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 271
final x10.
          lang.
          DoubleReferenceArray t =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP178));
        
//#line 272
final x10.
          lang.
          region X10_TEMP181 =
          (x10.
            lang.
            region)
            ((t.
                region));
        
//#line 274
final x10.
          lang.
          region X10_TEMP18 =
          (x10.
            lang.
            region)
            ((X10_TEMP181));
        
//#line 275
/* template:forloop { */
        for (java.util.Iterator p__ = (X10_TEMP18).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 276
final double X10_TEMP186 =
              (Program0.
                 Program_Random_nextDouble(
                 R));
            
//#line 278
final double X10_TEMP21 =
              (X10_TEMP186);
            
//#line 279
final double X10_TEMP189 =
              (1.0E-6);
            
//#line 281
final double X10_TEMP22 =
              (X10_TEMP189);
            
//#line 282
final double X10_TEMP192 =
              (X10_TEMP21 *
                 X10_TEMP22);
            
//#line 284
final double X10_TEMP24 =
              (X10_TEMP192);
            
//#line 285
Program0.
                           Program_SOR_write(
                           X10_TEMP0,
                           t,
                           p,
                           X10_TEMP24);
        }/* } */
        }
        /* } */
        
        
//#line 287
return t;
    }
    
    
//#line 289
public static void
                   Program_SOR_write(
                   final SOR X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray t,
                   final x10.
                     lang.
                     point p,
                   final double v) {
        
//#line 290
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 291
final x10.
              lang.
              dist X10_TEMP144 =
              (x10.
                lang.
                dist)
                ((t.
                    distribution));
            
//#line 293
final x10.
              lang.
              dist X10_TEMP1 =
              (x10.
                lang.
                dist)
                ((X10_TEMP144));
            
//#line 294
final x10.
              lang.
              place X10_TEMP4 =
              (X10_TEMP1.
                 get(
                 p));
            
//#line 295
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 296
final double X10_TEMP150 =
                  (v);
                
//#line 298
final double X10_TEMP8 =
                  (X10_TEMP150);
                
//#line 299
final double X10_TEMP154 =
                  (X10_TEMP8);
                
//#line 301
final double X10_TEMP157 =
                  (X10_TEMP154);
                
//#line 302
/* template:array_set { */(t).set((X10_TEMP157),p)/* } */;
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp5) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp5);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 306
public static x10.
                   lang.
                   dist
                   Program_SOR_blockStar(
                   final SOR X10_TEMP0,
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 307
final x10.
          lang.
          dist X10_TEMP145 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 307
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 307
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
               r1)));
        
//#line 309
final x10.
          lang.
          dist X10_TEMP2 =
          (x10.
            lang.
            dist)
            ((X10_TEMP145));
        
//#line 310
final x10.
          lang.
          dist X10_TEMP148 =
          (x10.
            lang.
            dist)
            ((X10_TEMP2));
        
//#line 312
final x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP148));
        
//#line 313
final x10.
          lang.
          dist X10_TEMP154 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program_SOR_distTimesRegion(
                X10_TEMP0,
                d1,
                r2)));
        
//#line 315
final x10.
          lang.
          dist X10_TEMP7 =
          (x10.
            lang.
            dist)
            ((X10_TEMP154));
        
//#line 316
return X10_TEMP7;
    }
    
    
//#line 318
public static x10.
                   lang.
                   dist
                   Program_SOR_distTimesRegion(
                   final SOR X10_TEMP0,
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     region r) {
        
//#line 319
final int X10_TEMP1 =
          (0);
        
//#line 320
final int X10_TEMP2 =
          (1);
        
//#line 321
final int X10_TEMP3 =
          (X10_TEMP1 -
             X10_TEMP2);
        
//#line 322
final x10.
          lang.
          region X10_TEMP151 =
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
                  X10_TEMP1,
                  X10_TEMP3),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP1,
                  X10_TEMP3))));
        
//#line 324
final x10.
          lang.
          region X10_TEMP4 =
          (x10.
            lang.
            region)
            ((X10_TEMP151));
        
//#line 325
final x10.
          lang.
          region X10_TEMP154 =
          (x10.
            lang.
            region)
            ((X10_TEMP4));
        
//#line 327
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP154));
        
//#line 328
final x10.
          lang.
          place X10_TEMP157 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 330
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP157);
        
//#line 331
final x10.
          lang.
          dist X10_TEMP160 =
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
        
//#line 333
x10.
          lang.
          dist d0 =
          (x10.
            lang.
            dist)
            ((X10_TEMP160));
        
//#line 334
final x10.
          lang.
          dist X10_TEMP163 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 336
final x10.
          lang.
          dist X10_TEMP10 =
          (x10.
            lang.
            dist)
            ((X10_TEMP163));
        
//#line 337
/* template:forloop { */
        for (java.util.Iterator pl__ = (X10_TEMP10.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 338
final x10.
              lang.
              dist X10_TEMP167 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    UNIQUE));
            
//#line 340
final x10.
              lang.
              dist X10_TEMP11 =
              (x10.
                lang.
                dist)
                ((X10_TEMP167));
            
//#line 341
final x10.
              lang.
              place X10_TEMP171 =
              (X10_TEMP11.
                 get(
                 pl));
            
//#line 343
x10.
              lang.
              place p =
              (X10_TEMP171);
            
//#line 344
final x10.
              lang.
              dist X10_TEMP174 =
              (x10.
                lang.
                dist)
                ((d.
                    restriction(
                    p)));
            
//#line 346
final x10.
              lang.
              dist X10_TEMP15 =
              (x10.
                lang.
                dist)
                ((X10_TEMP174));
            
//#line 347
final x10.
              lang.
              region X10_TEMP177 =
              (x10.
                lang.
                region)
                ((X10_TEMP15.
                    region));
            
//#line 349
final x10.
              lang.
              region X10_TEMP16 =
              (x10.
                lang.
                region)
                ((X10_TEMP177));
            
//#line 350
final x10.
              lang.
              region X10_TEMP182 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    X10_TEMP16,
                    r)));
            
//#line 352
final x10.
              lang.
              region X10_TEMP19 =
              (x10.
                lang.
                region)
                ((X10_TEMP182));
            
//#line 353
final x10.
              lang.
              dist X10_TEMP185 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP19,
                    p)));
            
//#line 355
final x10.
              lang.
              dist X10_TEMP21 =
              (x10.
                lang.
                dist)
                ((X10_TEMP185));
            
//#line 356
final x10.
              lang.
              dist X10_TEMP188 =
              (x10.
                lang.
                dist)
                ((d0.
                    union(
                    X10_TEMP21)));
            
//#line 358
final x10.
              lang.
              dist X10_TEMP23 =
              (x10.
                lang.
                dist)
                ((X10_TEMP188));
            
//#line 359
final x10.
              lang.
              dist X10_TEMP191 =
              (x10.
                lang.
                dist)
                ((X10_TEMP23));
            
//#line 361
d0 =
              (x10.
                lang.
                dist)
                ((X10_TEMP191));
        }/* } */
        }
        /* } */
        
        
//#line 363
return d0;
    }
    
    
//#line 365
public static void
                   Program_SOR_validate(
                   final SOR X10_TEMP0) {
        
//#line 366
final double X10_TEMP144 =
          (/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.gtotal);
        
//#line 368
final double X10_TEMP1 =
          (X10_TEMP144);
        
//#line 369
final double X10_TEMP147 =
          (4.5185971433257635E-5);
        
//#line 371
final double X10_TEMP2 =
          (X10_TEMP147);
        
//#line 372
final double X10_TEMP150 =
          (X10_TEMP1 -
             X10_TEMP2);
        
//#line 374
final double X10_TEMP4 =
          (X10_TEMP150);
        
//#line 375
final double X10_TEMP154 =
          (java.
             lang.
             Math.
             abs(
             X10_TEMP4));
        
//#line 377
double dev =
          (X10_TEMP154);
        
//#line 378
final double X10_TEMP157 =
          (1.0E-12);
        
//#line 380
final double X10_TEMP6 =
          (X10_TEMP157);
        
//#line 381
final boolean X10_TEMP8 =
          (dev >
             X10_TEMP6);
        
//#line 382
if (X10_TEMP8) {
            
//#line 383
final java.
              lang.
              String X10_TEMP162 =
              ("Validation failed");
            
//#line 385
final java.
              lang.
              String X10_TEMP10 =
              (X10_TEMP162);
            
//#line 386
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP10);
            
//#line 387
final java.
              lang.
              String X10_TEMP166 =
              ("gtotal = ");
            
//#line 389
final java.
              lang.
              String X10_TEMP11 =
              (X10_TEMP166);
            
//#line 390
final double X10_TEMP169 =
              (/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.gtotal);
            
//#line 392
final double X10_TEMP12 =
              (X10_TEMP169);
            
//#line 393
final java.
              lang.
              String X10_TEMP172 =
              (X10_TEMP11 +
               X10_TEMP12);
            
//#line 395
final java.
              lang.
              String X10_TEMP13 =
              (X10_TEMP172);
            
//#line 396
final java.
              lang.
              String X10_TEMP175 =
              ("  ");
            
//#line 398
final java.
              lang.
              String X10_TEMP14 =
              (X10_TEMP175);
            
//#line 399
final java.
              lang.
              String X10_TEMP178 =
              (X10_TEMP13 +
               X10_TEMP14);
            
//#line 401
final java.
              lang.
              String X10_TEMP15 =
              (X10_TEMP178);
            
//#line 402
final java.
              lang.
              String X10_TEMP181 =
              (X10_TEMP15 +
               dev);
            
//#line 404
final java.
              lang.
              String X10_TEMP17 =
              (X10_TEMP181);
            
//#line 405
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP17);
            
//#line 406
final java.
              lang.
              String X10_TEMP185 =
              ("Validation failed");
            
//#line 408
final java.
              lang.
              String X10_TEMP19 =
              (X10_TEMP185);
            
//#line 409
throw new java.
              lang.
              RuntimeException(
              X10_TEMP19);
        }
    }
    
    
//#line 412
public static double
                   Program_SOR_read(
                   final SOR X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray G,
                   final int i,
                   final int j) {
        
//#line 413
final int X10_TEMP144 =
          (0);
        
//#line 415
final int X10_TEMP3 =
          (X10_TEMP144);
        
//#line 416
final int X10_TEMP147 =
          (0);
        
//#line 418
final int X10_TEMP4 =
          (X10_TEMP147);
        
//#line 419
final x10.
          lang.
          region X10_TEMP152 =
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
        
//#line 421
final x10.
          lang.
          region r =
          (x10.
            lang.
            region)
            ((X10_TEMP152));
        
//#line 422
final x10.
          lang.
          place X10_TEMP155 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 424
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP155);
        
//#line 425
final x10.
          lang.
          dist X10_TEMP158 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                r,
                X10_TEMP6)));
        
//#line 427
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP158));
        
//#line 428
final x10.
          lang.
          DoubleReferenceArray X10_TEMP161 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 430
final x10.
          lang.
          DoubleReferenceArray result =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP161));
        
//#line 431
final x10.
          lang.
          place X10_TEMP164 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 433
final x10.
          lang.
          place phere =
          (X10_TEMP164);
        
//#line 434
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 435
final x10.
              lang.
              dist X10_TEMP167 =
              (x10.
                lang.
                dist)
                ((G.
                    distribution));
            
//#line 437
final x10.
              lang.
              dist X10_TEMP10 =
              (x10.
                lang.
                dist)
                ((X10_TEMP167));
            
//#line 438
final x10.
              lang.
              place X10_TEMP14 =
              (X10_TEMP10.
                 get(
                 i,
                 j));
            
//#line 439
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP14)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 440
final double X10_TEMP176 =
                  (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 442
final double val =
                  (X10_TEMP176);
                
//#line 443
/* template:Async { */(x10.lang.Runtime.asPlace(phere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 444
final int X10_TEMP180 =
                      (0);
                    
//#line 446
final int X10_TEMP20 =
                      (X10_TEMP180);
                    
//#line 447
final double X10_TEMP183 =
                      (val);
                    
//#line 449
final double X10_TEMP23 =
                      (X10_TEMP183);
                    
//#line 450
final double X10_TEMP187 =
                      (X10_TEMP23);
                    
//#line 452
final double X10_TEMP190 =
                      (X10_TEMP187);
                    
//#line 453
/* template:array_set { */(result).set((X10_TEMP190),X10_TEMP20)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp6) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 457
final int X10_TEMP192 =
          (0);
        
//#line 459
final int X10_TEMP25 =
          (X10_TEMP192);
        
//#line 460
final double X10_TEMP196 =
          (/* template:array_get { */((result).get(X10_TEMP25))/* } */);
        
//#line 462
final double X10_TEMP27 =
          (X10_TEMP196);
        
//#line 463
return X10_TEMP27;
    }
    
    
//#line 465
public static void
                   Program_SOR_SORrun(
                   final SOR X10_TEMP0,
                   final double omega,
                   final x10.
                     lang.
                     DoubleReferenceArray G,
                   final int num_iterations) {
        
//#line 466
final x10.
          lang.
          dist X10_TEMP144 =
          (x10.
            lang.
            dist)
            ((G.
                distribution));
        
//#line 468
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP144));
        
//#line 469
final x10.
          lang.
          region X10_TEMP147 =
          (x10.
            lang.
            region)
            ((X10_TEMP1.
                region));
        
//#line 471
final x10.
          lang.
          region X10_TEMP2 =
          (x10.
            lang.
            region)
            ((X10_TEMP147));
        
//#line 472
final int X10_TEMP150 =
          (0);
        
//#line 474
final int X10_TEMP4 =
          (X10_TEMP150);
        
//#line 475
final int X10_TEMP6 =
          (2);
        
//#line 476
final boolean X10_TEMP5 =
          (X10_TEMP4 >=
             X10_TEMP6);
        
//#line 477
if (X10_TEMP5) {
            
//#line 478
final java.
              lang.
              String X10_TEMP7 =
              ("Invalid dimension for rank projection. Got ");
            
//#line 479
final java.
              lang.
              String X10_TEMP8 =
              (", expected 2");
            
//#line 480
java.
              lang.
              String X10_TEMP9 =
              (X10_TEMP7 +
               X10_TEMP4);
            
//#line 481
final java.
              lang.
              String X10_TEMP159 =
              (X10_TEMP9 +
               X10_TEMP8);
            
//#line 482
X10_TEMP9 =
              ((X10_TEMP159));
            
//#line 483
throw new java.
              lang.
              RuntimeException(
              X10_TEMP9);
        }
        
//#line 485
final int X10_TEMP10 =
          (0);
        
//#line 486
final int X10_TEMP11 =
          (1);
        
//#line 487
final int X10_TEMP13 =
          (X10_TEMP10 -
             X10_TEMP11);
        
//#line 488
final x10.
          lang.
          region X10_TEMP167 =
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
                  X10_TEMP10,
                  X10_TEMP13))));
        
//#line 490
x10.
          lang.
          region X10_TEMP12 =
          (x10.
            lang.
            region)
            ((X10_TEMP167));
        
//#line 491
final int X10_TEMP14 =
          (0);
        
//#line 492
final boolean X10_TEMP16 =
          (X10_TEMP4 ==
             X10_TEMP14);
        
//#line 493
final int X10_TEMP15 =
          (1);
        
//#line 494
final boolean X10_TEMP17 =
          (X10_TEMP4 ==
             X10_TEMP15);
        
//#line 495
/* template:forloop-mult { */{
        x10.lang.region __var7__ = (x10.lang.region) X10_TEMP2;
        if (__var7__.size() > 0 && (__var7__ instanceof x10.array.MultiDimRegion || __var7__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var8__ = __var7__.rank(0).low(), __var9__ = __var7__.rank(0).high(); __var8__ <= __var9__; __var8__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var10__ = __var7__.rank(1).low(), __var11__ = __var7__.rank(1).high(); __var10__ <= __var11__; __var10__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int X10_TEMP18 = __var8__;
        /* } */
        /* template:final-var-assign { */
        final int X10_TEMP19 = __var10__;
        /* } */
        /* } */
{
            
//#line 496
if (X10_TEMP16) {
                
//#line 497
final x10.
                  lang.
                  region X10_TEMP20 =
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
                          X10_TEMP18,
                          X10_TEMP18))));
                
//#line 498
final x10.
                  lang.
                  region X10_TEMP179 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP12.
                        union(
                        X10_TEMP20)));
                
//#line 499
X10_TEMP12 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP179));
            } else {
                
//#line 502
if (X10_TEMP17) {
                    
//#line 503
final x10.
                      lang.
                      region X10_TEMP20 =
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
                              X10_TEMP19,
                              X10_TEMP19))));
                    
//#line 504
final x10.
                      lang.
                      region X10_TEMP185 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP12.
                            union(
                            X10_TEMP20)));
                    
//#line 505
X10_TEMP12 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP185));
                }
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var7__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int X10_TEMP18 =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int X10_TEMP19 =
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 496
if (X10_TEMP16) {
                
//#line 497
final x10.
                  lang.
                  region X10_TEMP20 =
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
                          X10_TEMP18,
                          X10_TEMP18))));
                
//#line 498
final x10.
                  lang.
                  region X10_TEMP179 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP12.
                        union(
                        X10_TEMP20)));
                
//#line 499
X10_TEMP12 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP179));
            } else {
                
//#line 502
if (X10_TEMP17) {
                    
//#line 503
final x10.
                      lang.
                      region X10_TEMP20 =
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
                              X10_TEMP19,
                              X10_TEMP19))));
                    
//#line 504
final x10.
                      lang.
                      region X10_TEMP185 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP12.
                            union(
                            X10_TEMP20)));
                    
//#line 505
X10_TEMP12 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP185));
                }
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 509
final x10.
          lang.
          region X10_TEMP21 =
          (x10.
            lang.
            region)
            ((X10_TEMP12));
        
//#line 510
final int X10_TEMP188 =
          (X10_TEMP21.
             size());
        
//#line 512
final int M =
          (X10_TEMP188);
        
//#line 513
final x10.
          lang.
          dist X10_TEMP191 =
          (x10.
            lang.
            dist)
            ((G.
                distribution));
        
//#line 515
final x10.
          lang.
          dist X10_TEMP23 =
          (x10.
            lang.
            dist)
            ((X10_TEMP191));
        
//#line 516
final x10.
          lang.
          region X10_TEMP194 =
          (x10.
            lang.
            region)
            ((X10_TEMP23.
                region));
        
//#line 518
final x10.
          lang.
          region X10_TEMP24 =
          (x10.
            lang.
            region)
            ((X10_TEMP194));
        
//#line 519
final int X10_TEMP197 =
          (1);
        
//#line 521
final int X10_TEMP26 =
          (X10_TEMP197);
        
//#line 522
final int X10_TEMP28 =
          (2);
        
//#line 523
final boolean X10_TEMP27 =
          (X10_TEMP26 >=
             X10_TEMP28);
        
//#line 524
if (X10_TEMP27) {
            
//#line 525
final java.
              lang.
              String X10_TEMP29 =
              ("Invalid dimension for rank projection. Got ");
            
//#line 526
final java.
              lang.
              String X10_TEMP30 =
              (", expected 2");
            
//#line 527
java.
              lang.
              String X10_TEMP31 =
              (X10_TEMP29 +
               X10_TEMP26);
            
//#line 528
final java.
              lang.
              String X10_TEMP206 =
              (X10_TEMP31 +
               X10_TEMP30);
            
//#line 529
X10_TEMP31 =
              ((X10_TEMP206));
            
//#line 530
throw new java.
              lang.
              RuntimeException(
              X10_TEMP31);
        }
        
//#line 532
final int X10_TEMP32 =
          (0);
        
//#line 533
final int X10_TEMP33 =
          (1);
        
//#line 534
final int X10_TEMP35 =
          (X10_TEMP32 -
             X10_TEMP33);
        
//#line 535
final x10.
          lang.
          region X10_TEMP214 =
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
                  X10_TEMP32,
                  X10_TEMP35))));
        
//#line 537
x10.
          lang.
          region X10_TEMP34 =
          (x10.
            lang.
            region)
            ((X10_TEMP214));
        
//#line 538
final int X10_TEMP36 =
          (0);
        
//#line 539
final boolean X10_TEMP38 =
          (X10_TEMP26 ==
             X10_TEMP36);
        
//#line 540
final int X10_TEMP37 =
          (1);
        
//#line 541
final boolean X10_TEMP39 =
          (X10_TEMP26 ==
             X10_TEMP37);
        
//#line 542
/* template:forloop-mult { */{
        x10.lang.region __var12__ = (x10.lang.region) X10_TEMP24;
        if (__var12__.size() > 0 && (__var12__ instanceof x10.array.MultiDimRegion || __var12__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var13__ = __var12__.rank(0).low(), __var14__ = __var12__.rank(0).high(); __var13__ <= __var14__; __var13__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var15__ = __var12__.rank(1).low(), __var16__ = __var12__.rank(1).high(); __var15__ <= __var16__; __var15__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int X10_TEMP40 = __var13__;
        /* } */
        /* template:final-var-assign { */
        final int X10_TEMP41 = __var15__;
        /* } */
        /* } */
{
            
//#line 543
if (X10_TEMP38) {
                
//#line 544
final x10.
                  lang.
                  region X10_TEMP42 =
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
                          X10_TEMP40,
                          X10_TEMP40))));
                
//#line 545
final x10.
                  lang.
                  region X10_TEMP226 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP34.
                        union(
                        X10_TEMP42)));
                
//#line 546
X10_TEMP34 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP226));
            } else {
                
//#line 549
if (X10_TEMP39) {
                    
//#line 550
final x10.
                      lang.
                      region X10_TEMP42 =
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
                              X10_TEMP41,
                              X10_TEMP41))));
                    
//#line 551
final x10.
                      lang.
                      region X10_TEMP232 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP34.
                            union(
                            X10_TEMP42)));
                    
//#line 552
X10_TEMP34 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP232));
                }
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var12__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int X10_TEMP40 =
          /* template:array_get { */((__var1__).get(0))/* } */;
final int X10_TEMP41 =
          /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
            
//#line 543
if (X10_TEMP38) {
                
//#line 544
final x10.
                  lang.
                  region X10_TEMP42 =
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
                          X10_TEMP40,
                          X10_TEMP40))));
                
//#line 545
final x10.
                  lang.
                  region X10_TEMP226 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP34.
                        union(
                        X10_TEMP42)));
                
//#line 546
X10_TEMP34 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP226));
            } else {
                
//#line 549
if (X10_TEMP39) {
                    
//#line 550
final x10.
                      lang.
                      region X10_TEMP42 =
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
                              X10_TEMP41,
                              X10_TEMP41))));
                    
//#line 551
final x10.
                      lang.
                      region X10_TEMP232 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP34.
                            union(
                            X10_TEMP42)));
                    
//#line 552
X10_TEMP34 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP232));
                }
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 556
final x10.
          lang.
          region X10_TEMP43 =
          (x10.
            lang.
            region)
            ((X10_TEMP34));
        
//#line 557
final int X10_TEMP235 =
          (X10_TEMP43.
             size());
        
//#line 559
final int N =
          (X10_TEMP235);
        
//#line 560
final double X10_TEMP238 =
          (0.25);
        
//#line 562
final double X10_TEMP45 =
          (X10_TEMP238);
        
//#line 563
final double X10_TEMP241 =
          (omega *
             X10_TEMP45);
        
//#line 565
final double omega_over_four =
          (X10_TEMP241);
        
//#line 566
final double X10_TEMP244 =
          (1.0);
        
//#line 568
final double X10_TEMP47 =
          (X10_TEMP244);
        
//#line 569
final double X10_TEMP247 =
          (X10_TEMP47 -
             omega);
        
//#line 571
final double one_minus_omega =
          (X10_TEMP247);
        
//#line 572
final int X10_TEMP250 =
          (1);
        
//#line 574
final int X10_TEMP49 =
          (X10_TEMP250);
        
//#line 575
final int X10_TEMP253 =
          (M -
             X10_TEMP49);
        
//#line 577
final int Mm1 =
          (X10_TEMP253);
        
//#line 578
final int X10_TEMP256 =
          (1);
        
//#line 580
final int X10_TEMP51 =
          (X10_TEMP256);
        
//#line 581
final int X10_TEMP259 =
          (N -
             X10_TEMP51);
        
//#line 583
final int Nm1 =
          (X10_TEMP259);
        
//#line 584
final int X10_TEMP262 =
          (0);
        
//#line 586
final int X10_TEMP56 =
          (X10_TEMP262);
        
//#line 587
final int X10_TEMP265 =
          (1);
        
//#line 589
final int X10_TEMP54 =
          (X10_TEMP265);
        
//#line 590
final int X10_TEMP268 =
          (num_iterations -
             X10_TEMP54);
        
//#line 592
final int X10_TEMP57 =
          (X10_TEMP268);
        
//#line 593
final x10.
          lang.
          region X10_TEMP273 =
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
                  X10_TEMP56,
                  X10_TEMP57))));
        
//#line 595
final x10.
          lang.
          region X10_TEMP59 =
          (x10.
            lang.
            region)
            ((X10_TEMP273));
        
//#line 596
/* template:forloop { */
        for (java.util.Iterator p__ = (X10_TEMP59).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 597
final int X10_TEMP277 =
              (0);
            
//#line 599
final int X10_TEMP62 =
              (X10_TEMP277);
            
//#line 600
final int X10_TEMP280 =
              (1);
            
//#line 602
final int X10_TEMP63 =
              (X10_TEMP280);
            
//#line 603
final x10.
              lang.
              region X10_TEMP285 =
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
                      X10_TEMP62,
                      X10_TEMP63))));
            
//#line 605
final x10.
              lang.
              region X10_TEMP65 =
              (x10.
                lang.
                region)
                ((X10_TEMP285));
            
//#line 606
/* template:forloop-mult { */{
            x10.lang.region __var17__ = (x10.lang.region) X10_TEMP65;
            if (__var17__.size() > 0 && (__var17__ instanceof x10.array.MultiDimRegion || __var17__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var18__ = __var17__.rank(0).low(), __var19__ = __var17__.rank(0).high(); __var18__ <= __var19__; __var18__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int o = __var18__;
            /* } */
            /* } */
{
                
//#line 607
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 608
final int X10_TEMP289 =
                      (0);
                    
//#line 610
final int X10_TEMP79 =
                      (X10_TEMP289);
                    
//#line 611
final int X10_TEMP292 =
                      (1);
                    
//#line 613
final int X10_TEMP67 =
                      (X10_TEMP292);
                    
//#line 614
final int X10_TEMP295 =
                      (Mm1 -
                         X10_TEMP67);
                    
//#line 616
final int X10_TEMP69 =
                      (X10_TEMP295);
                    
//#line 617
final int X10_TEMP298 =
                      (1);
                    
//#line 619
final int X10_TEMP70 =
                      (X10_TEMP298);
                    
//#line 620
final int X10_TEMP301 =
                      (X10_TEMP70 +
                         o);
                    
//#line 622
final int X10_TEMP72 =
                      (X10_TEMP301);
                    
//#line 623
final int X10_TEMP304 =
                      (X10_TEMP69 -
                         X10_TEMP72);
                    
//#line 625
final int X10_TEMP74 =
                      (X10_TEMP304);
                    
//#line 626
final int X10_TEMP307 =
                      (2);
                    
//#line 628
final int X10_TEMP75 =
                      (X10_TEMP307);
                    
//#line 629
final int X10_TEMP310 =
                      (X10_TEMP74 /
                         X10_TEMP75);
                    
//#line 631
final int X10_TEMP77 =
                      (X10_TEMP310);
                    
//#line 632
final x10.
                      lang.
                      region X10_TEMP315 =
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
                              X10_TEMP79,
                              X10_TEMP77))));
                    
//#line 634
final x10.
                      lang.
                      region X10_TEMP81 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP315));
                    
//#line 635
final x10.
                      lang.
                      place X10_TEMP82 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 636
/* template:forloop-mult { */{
                    x10.lang.region __var21__ = (x10.lang.region) X10_TEMP81;
                    if (__var21__.size() > 0 && (__var21__ instanceof x10.array.MultiDimRegion || __var21__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var22__ = __var21__.rank(0).low(), __var23__ = __var21__.rank(0).high(); __var22__ <= __var23__; __var22__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var22__;
                    /* } */
                    /* } */
{
                        
//#line 637
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP82)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 638
final int X10_TEMP321 =
                              (2);
                            
//#line 640
final int X10_TEMP83 =
                              (X10_TEMP321);
                            
//#line 641
final int X10_TEMP324 =
                              (X10_TEMP83 *
                                 ii);
                            
//#line 643
final int X10_TEMP84 =
                              (X10_TEMP324);
                            
//#line 644
final int X10_TEMP327 =
                              (1);
                            
//#line 646
final int X10_TEMP85 =
                              (X10_TEMP327);
                            
//#line 647
final int X10_TEMP330 =
                              (X10_TEMP84 +
                                 X10_TEMP85);
                            
//#line 649
final int X10_TEMP86 =
                              (X10_TEMP330);
                            
//#line 650
final int X10_TEMP333 =
                              (X10_TEMP86 +
                                 o);
                            
//#line 652
final int i =
                              (X10_TEMP333);
                            
//#line 653
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 654
final x10.
                                  lang.
                                  dist X10_TEMP336 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((G.
                                        distribution));
                                
//#line 656
final x10.
                                  lang.
                                  dist X10_TEMP88 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP336));
                                
//#line 657
final int X10_TEMP339 =
                                  (1);
                                
//#line 659
int X10_TEMP91 =
                                  (X10_TEMP339);
                                
//#line 660
final x10.
                                  lang.
                                  place X10_TEMP93 =
                                  (X10_TEMP88.
                                     get(
                                     i,
                                     X10_TEMP91));
                                
//#line 661
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP93)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 662
final int X10_TEMP346 =
                                      (1);
                                    
//#line 664
final int X10_TEMP97 =
                                      (X10_TEMP346);
                                    
//#line 665
final int X10_TEMP349 =
                                      (1);
                                    
//#line 667
final int X10_TEMP95 =
                                      (X10_TEMP349);
                                    
//#line 668
final int X10_TEMP352 =
                                      (Nm1 -
                                         X10_TEMP95);
                                    
//#line 670
final int X10_TEMP98 =
                                      (X10_TEMP352);
                                    
//#line 671
final x10.
                                      lang.
                                      region X10_TEMP357 =
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
                                              X10_TEMP97,
                                              X10_TEMP98))));
                                    
//#line 673
final x10.
                                      lang.
                                      region X10_TEMP100 =
                                      (x10.
                                        lang.
                                        region)
                                        ((X10_TEMP357));
                                    
//#line 674
/* template:forloop-mult { */{
                                    x10.lang.region __var25__ = (x10.lang.region) X10_TEMP100;
                                    if (__var25__.size() > 0 && (__var25__ instanceof x10.array.MultiDimRegion || __var25__ instanceof x10.array.ContiguousRange)) {
                                    	/* Loop: { *//* template:forloop-mult-each { */
                                    for (int __var26__ = __var25__.rank(0).low(), __var27__ = __var25__.rank(0).high(); __var26__ <= __var27__; __var26__++)
                                    /* } */
                                    /* } */ {
                                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                    final int j = __var26__;
                                    /* } */
                                    /* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    	}
                                    } else {
                                    	/* template:forloop { */
                                    for (java.util.Iterator __var4____ = (__var25__).iterator(); __var4____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var4__ = (x10.
                                      lang.
                                      point) __var4____.next();
                                    	/* Join: { *//* Join: { */final int j =
                                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    }
                                    /* } */
                                    
                                    }
                                    }
                                    /* } */
                                    
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp24) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp24);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var3____ = (__var21__).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 637
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP82)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 638
final int X10_TEMP321 =
                              (2);
                            
//#line 640
final int X10_TEMP83 =
                              (X10_TEMP321);
                            
//#line 641
final int X10_TEMP324 =
                              (X10_TEMP83 *
                                 ii);
                            
//#line 643
final int X10_TEMP84 =
                              (X10_TEMP324);
                            
//#line 644
final int X10_TEMP327 =
                              (1);
                            
//#line 646
final int X10_TEMP85 =
                              (X10_TEMP327);
                            
//#line 647
final int X10_TEMP330 =
                              (X10_TEMP84 +
                                 X10_TEMP85);
                            
//#line 649
final int X10_TEMP86 =
                              (X10_TEMP330);
                            
//#line 650
final int X10_TEMP333 =
                              (X10_TEMP86 +
                                 o);
                            
//#line 652
final int i =
                              (X10_TEMP333);
                            
//#line 653
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 654
final x10.
                                  lang.
                                  dist X10_TEMP336 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((G.
                                        distribution));
                                
//#line 656
final x10.
                                  lang.
                                  dist X10_TEMP88 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP336));
                                
//#line 657
final int X10_TEMP339 =
                                  (1);
                                
//#line 659
int X10_TEMP91 =
                                  (X10_TEMP339);
                                
//#line 660
final x10.
                                  lang.
                                  place X10_TEMP93 =
                                  (X10_TEMP88.
                                     get(
                                     i,
                                     X10_TEMP91));
                                
//#line 661
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP93)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 662
final int X10_TEMP346 =
                                      (1);
                                    
//#line 664
final int X10_TEMP97 =
                                      (X10_TEMP346);
                                    
//#line 665
final int X10_TEMP349 =
                                      (1);
                                    
//#line 667
final int X10_TEMP95 =
                                      (X10_TEMP349);
                                    
//#line 668
final int X10_TEMP352 =
                                      (Nm1 -
                                         X10_TEMP95);
                                    
//#line 670
final int X10_TEMP98 =
                                      (X10_TEMP352);
                                    
//#line 671
final x10.
                                      lang.
                                      region X10_TEMP357 =
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
                                              X10_TEMP97,
                                              X10_TEMP98))));
                                    
//#line 673
final x10.
                                      lang.
                                      region X10_TEMP100 =
                                      (x10.
                                        lang.
                                        region)
                                        ((X10_TEMP357));
                                    
//#line 674
/* template:forloop-mult { */{
                                    x10.lang.region __var29__ = (x10.lang.region) X10_TEMP100;
                                    if (__var29__.size() > 0 && (__var29__ instanceof x10.array.MultiDimRegion || __var29__ instanceof x10.array.ContiguousRange)) {
                                    	/* Loop: { *//* template:forloop-mult-each { */
                                    for (int __var30__ = __var29__.rank(0).low(), __var31__ = __var29__.rank(0).high(); __var30__ <= __var31__; __var30__++)
                                    /* } */
                                    /* } */ {
                                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                    final int j = __var30__;
                                    /* } */
                                    /* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    	}
                                    } else {
                                    	/* template:forloop { */
                                    for (java.util.Iterator __var4____ = (__var29__).iterator(); __var4____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var4__ = (x10.
                                      lang.
                                      point) __var4____.next();
                                    	/* Join: { *//* Join: { */final int j =
                                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    }
                                    /* } */
                                    
                                    }
                                    }
                                    /* } */
                                    
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
                	} catch (Throwable tmp20) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp20);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var17__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int o =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 607
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 608
final int X10_TEMP289 =
                      (0);
                    
//#line 610
final int X10_TEMP79 =
                      (X10_TEMP289);
                    
//#line 611
final int X10_TEMP292 =
                      (1);
                    
//#line 613
final int X10_TEMP67 =
                      (X10_TEMP292);
                    
//#line 614
final int X10_TEMP295 =
                      (Mm1 -
                         X10_TEMP67);
                    
//#line 616
final int X10_TEMP69 =
                      (X10_TEMP295);
                    
//#line 617
final int X10_TEMP298 =
                      (1);
                    
//#line 619
final int X10_TEMP70 =
                      (X10_TEMP298);
                    
//#line 620
final int X10_TEMP301 =
                      (X10_TEMP70 +
                         o);
                    
//#line 622
final int X10_TEMP72 =
                      (X10_TEMP301);
                    
//#line 623
final int X10_TEMP304 =
                      (X10_TEMP69 -
                         X10_TEMP72);
                    
//#line 625
final int X10_TEMP74 =
                      (X10_TEMP304);
                    
//#line 626
final int X10_TEMP307 =
                      (2);
                    
//#line 628
final int X10_TEMP75 =
                      (X10_TEMP307);
                    
//#line 629
final int X10_TEMP310 =
                      (X10_TEMP74 /
                         X10_TEMP75);
                    
//#line 631
final int X10_TEMP77 =
                      (X10_TEMP310);
                    
//#line 632
final x10.
                      lang.
                      region X10_TEMP315 =
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
                              X10_TEMP79,
                              X10_TEMP77))));
                    
//#line 634
final x10.
                      lang.
                      region X10_TEMP81 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP315));
                    
//#line 635
final x10.
                      lang.
                      place X10_TEMP82 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 636
/* template:forloop-mult { */{
                    x10.lang.region __var33__ = (x10.lang.region) X10_TEMP81;
                    if (__var33__.size() > 0 && (__var33__ instanceof x10.array.MultiDimRegion || __var33__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var34__ = __var33__.rank(0).low(), __var35__ = __var33__.rank(0).high(); __var34__ <= __var35__; __var34__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var34__;
                    /* } */
                    /* } */
{
                        
//#line 637
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP82)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 638
final int X10_TEMP321 =
                              (2);
                            
//#line 640
final int X10_TEMP83 =
                              (X10_TEMP321);
                            
//#line 641
final int X10_TEMP324 =
                              (X10_TEMP83 *
                                 ii);
                            
//#line 643
final int X10_TEMP84 =
                              (X10_TEMP324);
                            
//#line 644
final int X10_TEMP327 =
                              (1);
                            
//#line 646
final int X10_TEMP85 =
                              (X10_TEMP327);
                            
//#line 647
final int X10_TEMP330 =
                              (X10_TEMP84 +
                                 X10_TEMP85);
                            
//#line 649
final int X10_TEMP86 =
                              (X10_TEMP330);
                            
//#line 650
final int X10_TEMP333 =
                              (X10_TEMP86 +
                                 o);
                            
//#line 652
final int i =
                              (X10_TEMP333);
                            
//#line 653
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 654
final x10.
                                  lang.
                                  dist X10_TEMP336 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((G.
                                        distribution));
                                
//#line 656
final x10.
                                  lang.
                                  dist X10_TEMP88 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP336));
                                
//#line 657
final int X10_TEMP339 =
                                  (1);
                                
//#line 659
int X10_TEMP91 =
                                  (X10_TEMP339);
                                
//#line 660
final x10.
                                  lang.
                                  place X10_TEMP93 =
                                  (X10_TEMP88.
                                     get(
                                     i,
                                     X10_TEMP91));
                                
//#line 661
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP93)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 662
final int X10_TEMP346 =
                                      (1);
                                    
//#line 664
final int X10_TEMP97 =
                                      (X10_TEMP346);
                                    
//#line 665
final int X10_TEMP349 =
                                      (1);
                                    
//#line 667
final int X10_TEMP95 =
                                      (X10_TEMP349);
                                    
//#line 668
final int X10_TEMP352 =
                                      (Nm1 -
                                         X10_TEMP95);
                                    
//#line 670
final int X10_TEMP98 =
                                      (X10_TEMP352);
                                    
//#line 671
final x10.
                                      lang.
                                      region X10_TEMP357 =
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
                                              X10_TEMP97,
                                              X10_TEMP98))));
                                    
//#line 673
final x10.
                                      lang.
                                      region X10_TEMP100 =
                                      (x10.
                                        lang.
                                        region)
                                        ((X10_TEMP357));
                                    
//#line 674
/* template:forloop-mult { */{
                                    x10.lang.region __var37__ = (x10.lang.region) X10_TEMP100;
                                    if (__var37__.size() > 0 && (__var37__ instanceof x10.array.MultiDimRegion || __var37__ instanceof x10.array.ContiguousRange)) {
                                    	/* Loop: { *//* template:forloop-mult-each { */
                                    for (int __var38__ = __var37__.rank(0).low(), __var39__ = __var37__.rank(0).high(); __var38__ <= __var39__; __var38__++)
                                    /* } */
                                    /* } */ {
                                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                    final int j = __var38__;
                                    /* } */
                                    /* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    	}
                                    } else {
                                    	/* template:forloop { */
                                    for (java.util.Iterator __var4____ = (__var37__).iterator(); __var4____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var4__ = (x10.
                                      lang.
                                      point) __var4____.next();
                                    	/* Join: { *//* Join: { */final int j =
                                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    }
                                    /* } */
                                    
                                    }
                                    }
                                    /* } */
                                    
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp36) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp36);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var3____ = (__var33__).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 637
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP82)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 638
final int X10_TEMP321 =
                              (2);
                            
//#line 640
final int X10_TEMP83 =
                              (X10_TEMP321);
                            
//#line 641
final int X10_TEMP324 =
                              (X10_TEMP83 *
                                 ii);
                            
//#line 643
final int X10_TEMP84 =
                              (X10_TEMP324);
                            
//#line 644
final int X10_TEMP327 =
                              (1);
                            
//#line 646
final int X10_TEMP85 =
                              (X10_TEMP327);
                            
//#line 647
final int X10_TEMP330 =
                              (X10_TEMP84 +
                                 X10_TEMP85);
                            
//#line 649
final int X10_TEMP86 =
                              (X10_TEMP330);
                            
//#line 650
final int X10_TEMP333 =
                              (X10_TEMP86 +
                                 o);
                            
//#line 652
final int i =
                              (X10_TEMP333);
                            
//#line 653
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 654
final x10.
                                  lang.
                                  dist X10_TEMP336 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((G.
                                        distribution));
                                
//#line 656
final x10.
                                  lang.
                                  dist X10_TEMP88 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP336));
                                
//#line 657
final int X10_TEMP339 =
                                  (1);
                                
//#line 659
int X10_TEMP91 =
                                  (X10_TEMP339);
                                
//#line 660
final x10.
                                  lang.
                                  place X10_TEMP93 =
                                  (X10_TEMP88.
                                     get(
                                     i,
                                     X10_TEMP91));
                                
//#line 661
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP93)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 662
final int X10_TEMP346 =
                                      (1);
                                    
//#line 664
final int X10_TEMP97 =
                                      (X10_TEMP346);
                                    
//#line 665
final int X10_TEMP349 =
                                      (1);
                                    
//#line 667
final int X10_TEMP95 =
                                      (X10_TEMP349);
                                    
//#line 668
final int X10_TEMP352 =
                                      (Nm1 -
                                         X10_TEMP95);
                                    
//#line 670
final int X10_TEMP98 =
                                      (X10_TEMP352);
                                    
//#line 671
final x10.
                                      lang.
                                      region X10_TEMP357 =
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
                                              X10_TEMP97,
                                              X10_TEMP98))));
                                    
//#line 673
final x10.
                                      lang.
                                      region X10_TEMP100 =
                                      (x10.
                                        lang.
                                        region)
                                        ((X10_TEMP357));
                                    
//#line 674
/* template:forloop-mult { */{
                                    x10.lang.region __var41__ = (x10.lang.region) X10_TEMP100;
                                    if (__var41__.size() > 0 && (__var41__ instanceof x10.array.MultiDimRegion || __var41__ instanceof x10.array.ContiguousRange)) {
                                    	/* Loop: { *//* template:forloop-mult-each { */
                                    for (int __var42__ = __var41__.rank(0).low(), __var43__ = __var41__.rank(0).high(); __var42__ <= __var43__; __var42__++)
                                    /* } */
                                    /* } */ {
                                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                    final int j = __var42__;
                                    /* } */
                                    /* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    	}
                                    } else {
                                    	/* template:forloop { */
                                    for (java.util.Iterator __var4____ = (__var41__).iterator(); __var4____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var4__ = (x10.
                                      lang.
                                      point) __var4____.next();
                                    	/* Join: { *//* Join: { */final int j =
                                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                        
//#line 675
final int X10_TEMP361 =
                                          (1);
                                        
//#line 677
final int X10_TEMP104 =
                                          (X10_TEMP361);
                                        
//#line 678
final int X10_TEMP364 =
                                          (i -
                                             X10_TEMP104);
                                        
//#line 680
final int X10_TEMP107 =
                                          (X10_TEMP364);
                                        
//#line 681
final double X10_TEMP371 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP107,
                                             j));
                                        
//#line 683
final double X10_TEMP113 =
                                          (X10_TEMP371);
                                        
//#line 684
final int X10_TEMP374 =
                                          (1);
                                        
//#line 686
final int X10_TEMP109 =
                                          (X10_TEMP374);
                                        
//#line 687
final int X10_TEMP377 =
                                          (i +
                                             X10_TEMP109);
                                        
//#line 689
final int X10_TEMP112 =
                                          (X10_TEMP377);
                                        
//#line 690
final double X10_TEMP384 =
                                          (Program0.
                                             Program_SOR_read(
                                             X10_TEMP0,
                                             G,
                                             X10_TEMP112,
                                             j));
                                        
//#line 692
final double X10_TEMP114 =
                                          (X10_TEMP384);
                                        
//#line 693
final double X10_TEMP387 =
                                          (X10_TEMP113 +
                                             X10_TEMP114);
                                        
//#line 695
final double X10_TEMP119 =
                                          (X10_TEMP387);
                                        
//#line 696
final int X10_TEMP390 =
                                          (1);
                                        
//#line 698
final int X10_TEMP116 =
                                          (X10_TEMP390);
                                        
//#line 699
final int X10_TEMP393 =
                                          (j -
                                             X10_TEMP116);
                                        
//#line 701
final int X10_TEMP118 =
                                          (X10_TEMP393);
                                        
//#line 702
final double X10_TEMP398 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP118/* } */))/* } */);
                                        
//#line 704
final double X10_TEMP120 =
                                          (X10_TEMP398);
                                        
//#line 705
final double X10_TEMP401 =
                                          (X10_TEMP119 +
                                             X10_TEMP120);
                                        
//#line 707
final double X10_TEMP125 =
                                          (X10_TEMP401);
                                        
//#line 708
final int X10_TEMP404 =
                                          (1);
                                        
//#line 710
final int X10_TEMP122 =
                                          (X10_TEMP404);
                                        
//#line 711
final int X10_TEMP407 =
                                          (j +
                                             X10_TEMP122);
                                        
//#line 713
final int X10_TEMP124 =
                                          (X10_TEMP407);
                                        
//#line 714
final double X10_TEMP412 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,X10_TEMP124/* } */))/* } */);
                                        
//#line 716
final double X10_TEMP126 =
                                          (X10_TEMP412);
                                        
//#line 717
final double X10_TEMP415 =
                                          (X10_TEMP125 +
                                             X10_TEMP126);
                                        
//#line 719
final double X10_TEMP128 =
                                          (X10_TEMP415);
                                        
//#line 720
final double X10_TEMP418 =
                                          (omega_over_four *
                                             X10_TEMP128);
                                        
//#line 722
final double X10_TEMP132 =
                                          (X10_TEMP418);
                                        
//#line 723
final double X10_TEMP423 =
                                          (/* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */);
                                        
//#line 725
final double X10_TEMP131 =
                                          (X10_TEMP423);
                                        
//#line 726
final double X10_TEMP426 =
                                          (one_minus_omega *
                                             X10_TEMP131);
                                        
//#line 728
final double X10_TEMP133 =
                                          (X10_TEMP426);
                                        
//#line 729
final double X10_TEMP429 =
                                          (X10_TEMP132 +
                                             X10_TEMP133);
                                        
//#line 731
final double X10_TEMP136 =
                                          (X10_TEMP429);
                                        
//#line 732
final double X10_TEMP432 =
                                          (X10_TEMP136);
                                        
//#line 734
final double X10_TEMP137 =
                                          (X10_TEMP432);
                                        
//#line 735
final double X10_TEMP437 =
                                          (X10_TEMP137);
                                        
//#line 737
final double X10_TEMP440 =
                                          (X10_TEMP437);
                                        
//#line 738
/* template:array_set { */(G).set((X10_TEMP440),/* Join: { */i,j/* } */)/* } */;
                                    }/* } */
                                    }
                                    /* } */
                                    
                                    }
                                    }
                                    /* } */
                                    
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp40) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp40);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
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
                	} catch (Throwable tmp32) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp32);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 747
final double X10_TEMP443 =
          (Program0.
             Program_doublerefArraySum2(
             G));
        
//#line 749
final double X10_TEMP140 =
          (X10_TEMP443);
        
//#line 750
final double X10_TEMP446 =
          (X10_TEMP140);
        
//#line 752
final double X10_TEMP141 =
          (X10_TEMP446);
        
//#line 753
final double X10_TEMP449 =
          (X10_TEMP141);
        
//#line 755
final double X10_TEMP452 =
          (X10_TEMP449);
        
//#line 756
/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.gtotal =
          ((X10_TEMP452));
    }
    
    
//#line 758
public static void
                   Program_runMain(
                   ) {
        
//#line 759
final Timer X10_TEMP144 =
          (new Timer(
             ));
        
//#line 761
Timer tmr =
          (X10_TEMP144);
        
//#line 762
final int X10_TEMP147 =
          (0);
        
//#line 764
int count =
          (X10_TEMP147);
        
//#line 765
Program0.
                       Program_Timer_start(
                       tmr,
                       count);
        
//#line 766
final SOR X10_TEMP152 =
          (new SOR(
             ));
        
//#line 768
final SOR X10_TEMP4 =
          (X10_TEMP152);
        
//#line 769
Program0.
                       Program_SOR_run(
                       X10_TEMP4);
        
//#line 770
Program0.
                       Program_Timer_stop(
                       tmr,
                       count);
        
//#line 771
final java.
          lang.
          String X10_TEMP158 =
          ("Wall-clock time for sor: ");
        
//#line 773
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP158);
        
//#line 774
final double X10_TEMP163 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 776
final double X10_TEMP8 =
          (X10_TEMP163);
        
//#line 777
final java.
          lang.
          String X10_TEMP166 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 779
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP166);
        
//#line 780
final java.
          lang.
          String X10_TEMP169 =
          (" secs");
        
//#line 782
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP169);
        
//#line 783
final java.
          lang.
          String X10_TEMP172 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 785
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP172);
        
//#line 786
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 788
public static int
                   Program__Timer_max_counters_init(
                   ) {
        
//#line 789
final int X10_TEMP144 =
          (64);
        
//#line 791
final int X10_TEMP2 =
          (X10_TEMP144);
        
//#line 792
return X10_TEMP2;
    }
    
    
//#line 794
public static void
                   Program_Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 795
final x10.
          lang.
          DoubleReferenceArray X10_TEMP144 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 797
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP144));
        
//#line 798
final long X10_TEMP147 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 800
final double X10_TEMP5 =
          (X10_TEMP147);
        
//#line 801
final double X10_TEMP150 =
          (X10_TEMP5);
        
//#line 803
final double X10_TEMP6 =
          (X10_TEMP150);
        
//#line 804
final double X10_TEMP154 =
          (X10_TEMP6);
        
//#line 806
final double X10_TEMP157 =
          (X10_TEMP154);
        
//#line 807
/* template:array_set { */(X10_TEMP1).set((X10_TEMP157),n)/* } */;
    }
    
    
//#line 809
public static void
                   Program_Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 810
final x10.
          lang.
          DoubleReferenceArray X10_TEMP144 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 812
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP144));
        
//#line 813
final long X10_TEMP147 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 815
final double X10_TEMP5 =
          (X10_TEMP147);
        
//#line 816
final x10.
          lang.
          DoubleReferenceArray X10_TEMP150 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 818
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP150));
        
//#line 819
final double X10_TEMP154 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 821
final double X10_TEMP6 =
          (X10_TEMP154);
        
//#line 822
final double X10_TEMP157 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 824
final double X10_TEMP9 =
          (X10_TEMP157);
        
//#line 825
final double X10_TEMP160 =
          (X10_TEMP9);
        
//#line 827
final double X10_TEMP10 =
          (X10_TEMP160);
        
//#line 828
final double X10_TEMP164 =
          (X10_TEMP10);
        
//#line 830
final double X10_TEMP167 =
          (X10_TEMP164);
        
//#line 831
/* template:array_set { */(X10_TEMP1).set((X10_TEMP167),n)/* } */;
        
//#line 832
final x10.
          lang.
          DoubleReferenceArray X10_TEMP169 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 834
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP169));
        
//#line 835
final double X10_TEMP173 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 837
final double X10_TEMP14 =
          (X10_TEMP173);
        
//#line 838
final int X10_TEMP176 =
          (1000);
        
//#line 840
final double X10_TEMP15 =
          (X10_TEMP176);
        
//#line 841
final double X10_TEMP179 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 843
final double X10_TEMP16 =
          (X10_TEMP179);
        
//#line 844
final double X10_TEMP183 =
          (X10_TEMP16);
        
//#line 846
final double X10_TEMP186 =
          (X10_TEMP183);
        
//#line 847
/* template:array_set { */(X10_TEMP11).set((X10_TEMP186),n)/* } */;
        
//#line 848
final x10.
          lang.
          DoubleReferenceArray X10_TEMP188 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 850
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP188));
        
//#line 851
final x10.
          lang.
          DoubleReferenceArray X10_TEMP191 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 853
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP191));
        
//#line 854
final double X10_TEMP195 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 856
final double X10_TEMP22 =
          (X10_TEMP195);
        
//#line 857
final double X10_TEMP199 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 859
final double X10_TEMP23 =
          (X10_TEMP199);
        
//#line 860
final double X10_TEMP202 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 862
final double X10_TEMP24 =
          (X10_TEMP202);
        
//#line 863
final double X10_TEMP206 =
          (X10_TEMP24);
        
//#line 865
final double X10_TEMP209 =
          (X10_TEMP206);
        
//#line 866
/* template:array_set { */(X10_TEMP17).set((X10_TEMP209),n)/* } */;
    }
    
    
//#line 868
public static double
                   Program_Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 869
final x10.
          lang.
          DoubleReferenceArray X10_TEMP144 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 871
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP144));
        
//#line 872
final double X10_TEMP148 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 874
final double X10_TEMP4 =
          (X10_TEMP148);
        
//#line 875
return X10_TEMP4;
    }
    
    
//#line 877
public static void
                   Program_Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 878
final x10.
          lang.
          DoubleReferenceArray X10_TEMP144 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 880
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP144));
        
//#line 881
final int X10_TEMP147 =
          (0);
        
//#line 883
final double X10_TEMP5 =
          (X10_TEMP147);
        
//#line 884
final double X10_TEMP150 =
          (X10_TEMP5);
        
//#line 886
final double X10_TEMP6 =
          (X10_TEMP150);
        
//#line 887
final double X10_TEMP154 =
          (X10_TEMP6);
        
//#line 889
final double X10_TEMP157 =
          (X10_TEMP154);
        
//#line 890
/* template:array_set { */(X10_TEMP1).set((X10_TEMP157),n)/* } */;
        
//#line 891
final x10.
          lang.
          DoubleReferenceArray X10_TEMP159 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 893
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP159));
        
//#line 894
final int X10_TEMP162 =
          (0);
        
//#line 896
final double X10_TEMP11 =
          (X10_TEMP162);
        
//#line 897
final double X10_TEMP165 =
          (X10_TEMP11);
        
//#line 899
final double X10_TEMP12 =
          (X10_TEMP165);
        
//#line 900
final double X10_TEMP169 =
          (X10_TEMP12);
        
//#line 902
final double X10_TEMP172 =
          (X10_TEMP169);
        
//#line 903
/* template:array_set { */(X10_TEMP7).set((X10_TEMP172),n)/* } */;
        
//#line 904
final x10.
          lang.
          DoubleReferenceArray X10_TEMP174 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 906
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP174));
        
//#line 907
final int X10_TEMP177 =
          (0);
        
//#line 909
final double X10_TEMP17 =
          (X10_TEMP177);
        
//#line 910
final double X10_TEMP180 =
          (X10_TEMP17);
        
//#line 912
final double X10_TEMP18 =
          (X10_TEMP180);
        
//#line 913
final double X10_TEMP184 =
          (X10_TEMP18);
        
//#line 915
final double X10_TEMP187 =
          (X10_TEMP184);
        
//#line 916
/* template:array_set { */(X10_TEMP13).set((X10_TEMP187),n)/* } */;
    }
    
    
//#line 918
public static void
                   Program_Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 919
final int X10_TEMP144 =
          (0);
        
//#line 921
int i =
          (X10_TEMP144);
        
//#line 922
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 923
boolean X10_TEMP149 =
          X10_TEMP4;
        
//#line 924
while (X10_TEMP149) {
            
//#line 925
Program0.
                           Program_Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 926
final int X10_TEMP153 =
              (i);
            
//#line 928
final int X10_TEMP6 =
              (X10_TEMP153);
            
//#line 929
final int X10_TEMP7 =
              (1);
            
//#line 930
final int X10_TEMP157 =
              (i +
                 X10_TEMP7);
            
//#line 931
i =
              ((X10_TEMP157));
            
//#line 932
final boolean X10_TEMP159 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 933
X10_TEMP4 =
              ((X10_TEMP159));
            
//#line 934
X10_TEMP149 =
              X10_TEMP4;
        }
    }
    
    
//#line 937
public static double
                   Program_doublerefArraySum2(
                   final x10.
                     lang.
                     DoubleReferenceArray sumArray) {
        
//#line 938
final int maxPlaces =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 939
final int one =
          (1);
        
//#line 940
final int zero =
          (0);
        
//#line 941
final int maxPlacesMinusOne =
          (maxPlaces -
             one);
        
//#line 942
final x10.
          lang.
          region X10_TEMP150 =
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
                  zero,
                  maxPlacesMinusOne))));
        
//#line 944
final x10.
          lang.
          region dReg =
          (x10.
            lang.
            region)
            ((X10_TEMP150));
        
//#line 945
final x10.
          lang.
          place source =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 946
final x10.
          lang.
          dist X10_TEMP154 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                dReg,
                source)));
        
//#line 948
final x10.
          lang.
          dist dSum =
          (x10.
            lang.
            dist)
            ((X10_TEMP154));
        
//#line 949
final double initVal =
          (0);
        
//#line 950
final x10.
          lang.
          DoubleReferenceArray X10_TEMP159 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dSum,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p/* } */, double dummy) { {
                  
//#line 951
return initVal;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 956
final x10.
          lang.
          DoubleReferenceArray localSumArray =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP159));
        
//#line 957
final x10.
          lang.
          dist X10_TEMP162 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 959
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            ((X10_TEMP162));
        
//#line 960
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 961
/* template:forloop { */
            for (java.util.Iterator p__ = (dUnique.
                                             region).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 962
final x10.
                  lang.
                  place nthPlace =
                  (dUnique.
                     get(
                     p));
                
//#line 963
/* template:Async { */(x10.lang.Runtime.asPlace(nthPlace)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 964
double localSumTemp =
                      (0);
                    
//#line 965
final x10.
                      lang.
                      place thisPlace =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 966
final x10.
                      lang.
                      dist X10_TEMP171 =
                      (x10.
                        lang.
                        dist)
                        ((sumArray.
                            distribution));
                    
//#line 968
final x10.
                      lang.
                      dist sumArrayDist =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP171));
                    
//#line 969
final x10.
                      lang.
                      dist X10_TEMP174 =
                      (x10.
                        lang.
                        dist)
                        ((sumArrayDist.
                            restriction(
                            thisPlace)));
                    
//#line 971
final x10.
                      lang.
                      dist sumArrayDistHere =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP174));
                    
//#line 972
/* template:forloop { */
                    for (java.util.Iterator pt__ = (sumArrayDistHere.
                                                      region).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 973
final double localSumCurr =
                          (/* template:array_get { */((sumArray).get(pt))/* } */);
                        
//#line 974
final double X10_TEMP180 =
                          (localSumTemp +
                             localSumCurr);
                        
//#line 975
localSumTemp =
                          ((X10_TEMP180));
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 977
final boolean isNotEqual =
                      (localSumTemp !=
                         zero);
                    
//#line 978
if (isNotEqual) {
                        
//#line 979
final int index =
                          (thisPlace.
                             id);
                        
//#line 980
final double localSum =
                          (localSumTemp);
                        
//#line 981
/* template:Async { */(x10.lang.Runtime.asPlace(source)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 982
final double X10_TEMP188 =
                              (localSum);
                            
//#line 984
final double X10_TEMP191 =
                              (X10_TEMP188);
                            
//#line 985
/* template:array_set { */(localSumArray).set((X10_TEMP191),index)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp44) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 991
double globalSum =
          (0);
        
//#line 992
/* template:forloop { */
        for (java.util.Iterator p__ = (localSumArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 993
final double localSumCurr =
              (/* template:array_get { */((localSumArray).get(p))/* } */);
            
//#line 994
final double X10_TEMP197 =
              (globalSum +
                 localSumCurr);
            
//#line 995
globalSum =
              ((X10_TEMP197));
        }/* } */
        }
        /* } */
        
        
//#line 997
return globalSum;
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
    
    
//#line 1002
public Program() {
        
//#line 1002
super();
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 1006
public long
      seed;
    
    
//#line 1009
public Random(final long rseed) {
        
//#line 1009
super();
        
//#line 1010
this.
                        Random_Random_setSeed(
                        rseed);
    }
    
    
//#line 1014
public void
                    Random_Random_setSeed(
                    final long rseed) {
        
//#line 1015
final long X10_TEMP144 =
          (Program0.
             _Program__Random_multiplier);
        
//#line 1017
final long X10_TEMP1 =
          (X10_TEMP144);
        
//#line 1018
final long X10_TEMP147 =
          (rseed ^
             X10_TEMP1);
        
//#line 1020
final long X10_TEMP3 =
          (X10_TEMP147);
        
//#line 1021
final long X10_TEMP150 =
          (Program0.
             _Program__Random_mask);
        
//#line 1023
final long X10_TEMP4 =
          (X10_TEMP150);
        
//#line 1024
final long X10_TEMP153 =
          (X10_TEMP3 &
             X10_TEMP4);
        
//#line 1026
final long X10_TEMP6 =
          (X10_TEMP153);
        
//#line 1027
final long X10_TEMP156 =
          (X10_TEMP6);
        
//#line 1029
seed =
          ((X10_TEMP156));
    }
}

class SOR
extends x10.
  lang.
  Object
{
    
//#line 1035
public Random
      R;
    
//#line 1036
public double
      gtotal;
    
    
//#line 1039
public SOR() {
        
//#line 1039
super();
        
//#line 1040
final double X10_TEMP144 =
          (0.0);
        
//#line 1042
final double X10_TEMP2 =
          (X10_TEMP144);
        
//#line 1043
final double X10_TEMP147 =
          (X10_TEMP2);
        
//#line 1045
gtotal =
          ((X10_TEMP147));
        
//#line 1046
final long X10_TEMP150 =
          (Program0.
             _Program__SOR_RANDOM_SEED);
        
//#line 1048
long X10_TEMP4 =
          (X10_TEMP150);
        
//#line 1049
final Random X10_TEMP154 =
          (new Random(
             X10_TEMP4));
        
//#line 1051
final Random X10_TEMP6 =
          (X10_TEMP154);
        
//#line 1052
final Random X10_TEMP157 =
          (X10_TEMP6);
        
//#line 1054
R =
          ((X10_TEMP157));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1061
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 1062
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 1063
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 1066
public Timer() {
        
//#line 1066
super();
        
//#line 1067
final int X10_TEMP144 =
          (0);
        
//#line 1069
int i =
          (X10_TEMP144);
        
//#line 1070
final int X10_TEMP147 =
          (0);
        
//#line 1072
final int X10_TEMP4 =
          (X10_TEMP147);
        
//#line 1073
final int X10_TEMP150 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1075
final int X10_TEMP5 =
          (X10_TEMP150);
        
//#line 1076
final x10.
          lang.
          region X10_TEMP155 =
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
        
//#line 1078
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP155));
        
//#line 1079
final x10.
          lang.
          place X10_TEMP158 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1081
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP158);
        
//#line 1082
final x10.
          lang.
          dist X10_TEMP161 =
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
        
//#line 1084
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP161));
        
//#line 1085
final x10.
          lang.
          DoubleReferenceArray X10_TEMP164 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1087
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP164));
        
//#line 1088
final x10.
          lang.
          DoubleReferenceArray X10_TEMP167 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 1090
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP167));
        
//#line 1091
final x10.
          lang.
          DoubleReferenceArray X10_TEMP170 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1093
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP170));
        
//#line 1094
final x10.
          lang.
          DoubleReferenceArray X10_TEMP173 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 1096
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP173));
        
//#line 1097
final x10.
          lang.
          DoubleReferenceArray X10_TEMP176 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1099
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP176));
        
//#line 1100
final x10.
          lang.
          DoubleReferenceArray X10_TEMP179 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 1102
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP179));
        
//#line 1103
final int X10_TEMP182 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1105
final int X10_TEMP15 =
          (X10_TEMP182);
        
//#line 1106
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 1107
boolean X10_TEMP187 =
          X10_TEMP19;
        
//#line 1108
while (X10_TEMP187) {
            
//#line 1109
final int X10_TEMP189 =
              (0);
            
//#line 1111
final double X10_TEMP23 =
              (X10_TEMP189);
            
//#line 1112
final double X10_TEMP192 =
              (X10_TEMP23);
            
//#line 1114
final double X10_TEMP24 =
              (X10_TEMP192);
            
//#line 1115
final double X10_TEMP196 =
              (X10_TEMP24);
            
//#line 1117
final double X10_TEMP199 =
              (X10_TEMP196);
            
//#line 1118
/* template:array_set { */(start_time).set((X10_TEMP199),i)/* } */;
            
//#line 1119
final int X10_TEMP201 =
              (0);
            
//#line 1121
final double X10_TEMP28 =
              (X10_TEMP201);
            
//#line 1122
final double X10_TEMP204 =
              (X10_TEMP28);
            
//#line 1124
final double X10_TEMP29 =
              (X10_TEMP204);
            
//#line 1125
final double X10_TEMP208 =
              (X10_TEMP29);
            
//#line 1127
final double X10_TEMP211 =
              (X10_TEMP208);
            
//#line 1128
/* template:array_set { */(elapsed_time).set((X10_TEMP211),i)/* } */;
            
//#line 1129
final int X10_TEMP213 =
              (0);
            
//#line 1131
final double X10_TEMP33 =
              (X10_TEMP213);
            
//#line 1132
final double X10_TEMP216 =
              (X10_TEMP33);
            
//#line 1134
final double X10_TEMP34 =
              (X10_TEMP216);
            
//#line 1135
final double X10_TEMP220 =
              (X10_TEMP34);
            
//#line 1137
final double X10_TEMP223 =
              (X10_TEMP220);
            
//#line 1138
/* template:array_set { */(total_time).set((X10_TEMP223),i)/* } */;
            
//#line 1139
final int X10_TEMP225 =
              (i);
            
//#line 1141
final int X10_TEMP35 =
              (X10_TEMP225);
            
//#line 1142
final int X10_TEMP36 =
              (1);
            
//#line 1143
final int X10_TEMP229 =
              (i +
                 X10_TEMP36);
            
//#line 1144
i =
              ((X10_TEMP229));
            
//#line 1145
final int X10_TEMP231 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 1147
final int X10_TEMP17 =
              (X10_TEMP231);
            
//#line 1148
final boolean X10_TEMP234 =
              (i <
                 X10_TEMP17);
            
//#line 1149
X10_TEMP19 =
              ((X10_TEMP234));
            
//#line 1150
X10_TEMP187 =
              X10_TEMP19;
        }
    }
}
