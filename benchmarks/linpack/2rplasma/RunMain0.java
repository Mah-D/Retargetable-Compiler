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
      _Program__Linpack_r =
      Program0.
        _Program__Linpack_r_init();
    
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
                  _Program__Linpack_r_init(
                  ) {
        
//#line 18
final x10.
          lang.
          region X10_TEMP210 =
          (x10.
            lang.
            region)
            ((Program0.
                Program__Linpack_r_init()));
        
//#line 19
return X10_TEMP210;
    }
    
    
//#line 21
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 23
final int X10_TEMP210 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 24
return X10_TEMP210;
    }
    
    
//#line 26
public static x10.
                  lang.
                  region
                  Program__Linpack_r_init(
                  ) {
        
//#line 27
final int X10_TEMP210 =
          (0);
        
//#line 29
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 30
final int X10_TEMP213 =
          (2);
        
//#line 32
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 33
final x10.
          lang.
          region X10_TEMP218 =
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
        
//#line 35
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP218));
        
//#line 36
return X10_TEMP6;
    }
    
    
//#line 38
public static void
                  Program_Linpack_initdataSizesArray(
                  final Linpack X10_TEMP0,
                  final x10.
                    lang.
                    IntReferenceArray datasizes) {
        
//#line 39
final int X10_TEMP210 =
          (0);
        
//#line 41
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 42
final int X10_TEMP213 =
          (150);
        
//#line 44
final int X10_TEMP5 =
          (X10_TEMP213);
        
//#line 45
final int X10_TEMP216 =
          (X10_TEMP5);
        
//#line 47
final int X10_TEMP6 =
          (X10_TEMP216);
        
//#line 48
final int X10_TEMP220 =
          (X10_TEMP6);
        
//#line 50
final int X10_TEMP223 =
          (X10_TEMP220);
        
//#line 51
/* template:array_set { */(datasizes).set((X10_TEMP223),X10_TEMP2)/* } */;
        
//#line 52
final int X10_TEMP225 =
          (1);
        
//#line 54
final int X10_TEMP8 =
          (X10_TEMP225);
        
//#line 55
final int X10_TEMP228 =
          (1000);
        
//#line 57
final int X10_TEMP11 =
          (X10_TEMP228);
        
//#line 58
final int X10_TEMP231 =
          (X10_TEMP11);
        
//#line 60
final int X10_TEMP12 =
          (X10_TEMP231);
        
//#line 61
final int X10_TEMP235 =
          (X10_TEMP12);
        
//#line 63
final int X10_TEMP238 =
          (X10_TEMP235);
        
//#line 64
/* template:array_set { */(datasizes).set((X10_TEMP238),X10_TEMP8)/* } */;
        
//#line 65
final int X10_TEMP240 =
          (2);
        
//#line 67
final int X10_TEMP14 =
          (X10_TEMP240);
        
//#line 68
final int X10_TEMP243 =
          (2000);
        
//#line 70
final int X10_TEMP17 =
          (X10_TEMP243);
        
//#line 71
final int X10_TEMP246 =
          (X10_TEMP17);
        
//#line 73
final int X10_TEMP18 =
          (X10_TEMP246);
        
//#line 74
final int X10_TEMP250 =
          (X10_TEMP18);
        
//#line 76
final int X10_TEMP253 =
          (X10_TEMP250);
        
//#line 77
/* template:array_set { */(datasizes).set((X10_TEMP253),X10_TEMP14)/* } */;
    }
    
    
//#line 79
public static void
                  Program_Linpack_JGFsetsize(
                  final Linpack X10_TEMP0,
                  final int setSize) {
        
//#line 80
final int X10_TEMP210 =
          (setSize);
        
//#line 82
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 83
final int X10_TEMP213 =
          (X10_TEMP3);
        
//#line 85
final int X10_TEMP216 =
          (X10_TEMP213);
        
//#line 86
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize =
          ((X10_TEMP216));
    }
    
    
//#line 88
public static void
                  Program_Linpack_JGFinitialise(
                  final Linpack X10_TEMP0,
                  final x10.
                    lang.
                    dist vd) {
        
//#line 89
final x10.
          lang.
          IntReferenceArray X10_TEMP214 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p0/* } */, int dummy) { {
                  
//#line 90
final int X10_TEMP210 =
                    (0);
                  
//#line 92
final int X10_TEMP2 =
                    (X10_TEMP210);
                  
//#line 93
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 98
final x10.
          lang.
          IntReferenceArray datasizes =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP214));
        
//#line 99
Program0.
                      Program_Linpack_initdataSizesArray(
                      X10_TEMP0,
                      datasizes);
        
//#line 100
final int X10_TEMP219 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 102
final int X10_TEMP6 =
          (X10_TEMP219);
        
//#line 103
final int X10_TEMP223 =
          (/* template:array_get { */((datasizes).get(X10_TEMP6))/* } */);
        
//#line 105
final int X10_TEMP9 =
          (X10_TEMP223);
        
//#line 106
final int X10_TEMP226 =
          (X10_TEMP9);
        
//#line 108
final int X10_TEMP10 =
          (X10_TEMP226);
        
//#line 109
final int X10_TEMP229 =
          (X10_TEMP10);
        
//#line 111
final int X10_TEMP232 =
          (X10_TEMP229);
        
//#line 112
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n =
          ((X10_TEMP232));
        
//#line 113
final java.
          lang.
          String X10_TEMP234 =
          ("ATTENTION: Running with smaller size (");
        
//#line 115
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP234);
        
//#line 116
final int X10_TEMP237 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 118
final int X10_TEMP12 =
          (X10_TEMP237);
        
//#line 119
final java.
          lang.
          String X10_TEMP240 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 121
final java.
          lang.
          String X10_TEMP13 =
          (X10_TEMP240);
        
//#line 122
final java.
          lang.
          String X10_TEMP243 =
          (" instead of 500)");
        
//#line 124
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP243);
        
//#line 125
final java.
          lang.
          String X10_TEMP246 =
          (X10_TEMP13 +
           X10_TEMP14);
        
//#line 127
final java.
          lang.
          String X10_TEMP16 =
          (X10_TEMP246);
        
//#line 128
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP16);
        
//#line 129
final int X10_TEMP250 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 131
final int X10_TEMP19 =
          (X10_TEMP250);
        
//#line 132
final int X10_TEMP253 =
          (X10_TEMP19);
        
//#line 134
final int X10_TEMP20 =
          (X10_TEMP253);
        
//#line 135
final int X10_TEMP256 =
          (X10_TEMP20);
        
//#line 137
final int X10_TEMP259 =
          (X10_TEMP256);
        
//#line 138
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa =
          ((X10_TEMP259));
        
//#line 139
final int X10_TEMP261 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 141
final int X10_TEMP21 =
          (X10_TEMP261);
        
//#line 142
final int X10_TEMP264 =
          (1);
        
//#line 144
final int X10_TEMP22 =
          (X10_TEMP264);
        
//#line 145
final int X10_TEMP267 =
          (X10_TEMP21 +
             X10_TEMP22);
        
//#line 147
final int X10_TEMP25 =
          (X10_TEMP267);
        
//#line 148
final int X10_TEMP270 =
          (X10_TEMP25);
        
//#line 150
final int X10_TEMP26 =
          (X10_TEMP270);
        
//#line 151
final int X10_TEMP273 =
          (X10_TEMP26);
        
//#line 153
final int X10_TEMP276 =
          (X10_TEMP273);
        
//#line 154
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda =
          ((X10_TEMP276));
        
//#line 155
final int X10_TEMP278 =
          (0);
        
//#line 157
final int X10_TEMP29 =
          (X10_TEMP278);
        
//#line 158
final int X10_TEMP281 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 160
final int X10_TEMP30 =
          (X10_TEMP281);
        
//#line 161
final x10.
          lang.
          region X10_TEMP286 =
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
                  X10_TEMP29,
                  X10_TEMP30))));
        
//#line 163
x10.
          lang.
          region vectorRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP286));
        
//#line 164
final int X10_TEMP289 =
          (0);
        
//#line 166
final int X10_TEMP36 =
          (X10_TEMP289);
        
//#line 167
final int X10_TEMP292 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 169
final int X10_TEMP33 =
          (X10_TEMP292);
        
//#line 170
final int X10_TEMP295 =
          (1);
        
//#line 172
final int X10_TEMP34 =
          (X10_TEMP295);
        
//#line 173
final int X10_TEMP298 =
          (X10_TEMP33 -
             X10_TEMP34);
        
//#line 175
final int X10_TEMP37 =
          (X10_TEMP298);
        
//#line 176
final x10.
          lang.
          region X10_TEMP303 =
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
                  X10_TEMP36,
                  X10_TEMP37))));
        
//#line 178
x10.
          lang.
          region vectorRegionMinus1 =
          (x10.
            lang.
            region)
            ((X10_TEMP303));
        
//#line 179
final x10.
          lang.
          place X10_TEMP306 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 181
final x10.
          lang.
          place X10_TEMP39 =
          (X10_TEMP306);
        
//#line 182
final x10.
          lang.
          dist X10_TEMP309 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                vectorRegionMinus1,
                X10_TEMP39)));
        
//#line 184
x10.
          lang.
          dist vectorRegionMinus1Dist =
          (x10.
            lang.
            dist)
            ((X10_TEMP309));
        
//#line 185
final int X10_TEMP312 =
          (0);
        
//#line 187
final int X10_TEMP43 =
          (X10_TEMP312);
        
//#line 188
final int X10_TEMP315 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 190
final int X10_TEMP44 =
          (X10_TEMP315);
        
//#line 191
final int X10_TEMP318 =
          (0);
        
//#line 193
final int X10_TEMP47 =
          (X10_TEMP318);
        
//#line 194
final int X10_TEMP321 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 196
final int X10_TEMP48 =
          (X10_TEMP321);
        
//#line 197
final x10.
          lang.
          region X10_TEMP328 =
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
                  X10_TEMP43,
                  X10_TEMP44),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP47,
                  X10_TEMP48))));
        
//#line 199
x10.
          lang.
          region rectangularRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP328));
        
//#line 200
final int X10_TEMP331 =
          (0);
        
//#line 202
final int X10_TEMP52 =
          (X10_TEMP331);
        
//#line 203
final int X10_TEMP334 =
          (0);
        
//#line 205
final int X10_TEMP53 =
          (X10_TEMP334);
        
//#line 206
final int X10_TEMP337 =
          (0);
        
//#line 208
final int X10_TEMP56 =
          (X10_TEMP337);
        
//#line 209
final int X10_TEMP340 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 211
final int X10_TEMP57 =
          (X10_TEMP340);
        
//#line 212
final x10.
          lang.
          region X10_TEMP347 =
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
                  X10_TEMP52,
                  X10_TEMP53),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP56,
                  X10_TEMP57))));
        
//#line 214
x10.
          lang.
          region slimRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP347));
        
//#line 215
final x10.
          lang.
          place X10_TEMP350 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 217
final x10.
          lang.
          place X10_TEMP59 =
          (X10_TEMP350);
        
//#line 218
final x10.
          lang.
          dist X10_TEMP353 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                slimRegion,
                X10_TEMP59)));
        
//#line 220
x10.
          lang.
          dist slimRegionDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP353));
        
//#line 221
final int X10_TEMP356 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 223
final int X10_TEMP62 =
          (X10_TEMP356);
        
//#line 224
final int X10_TEMP359 =
          (1);
        
//#line 226
final int X10_TEMP63 =
          (X10_TEMP359);
        
//#line 227
final int X10_TEMP362 =
          (X10_TEMP62 +
             X10_TEMP63);
        
//#line 229
final int X10_TEMP65 =
          (X10_TEMP362);
        
//#line 230
final x10.
          lang.
          dist X10_TEMP367 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 230
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 230
return (((((((x10.
                                              lang.
                                              dist)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            2)))
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
               blockCyclic(
               rectangularRegion,
               X10_TEMP65)));
        
//#line 232
final x10.
          lang.
          dist X10_TEMP66 =
          (x10.
            lang.
            dist)
            ((X10_TEMP367));
        
//#line 233
final x10.
          lang.
          dist X10_TEMP370 =
          (x10.
            lang.
            dist)
            ((X10_TEMP66));
        
//#line 235
x10.
          lang.
          dist rectangular_distribution =
          (x10.
            lang.
            dist)
            ((X10_TEMP370));
        
//#line 236
final x10.
          lang.
          DoubleReferenceArray X10_TEMP373 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rectangular_distribution,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 238
final x10.
          lang.
          DoubleReferenceArray X10_TEMP70 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP373));
        
//#line 239
final x10.
          lang.
          DoubleReferenceArray X10_TEMP376 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP70));
        
//#line 241
final x10.
          lang.
          DoubleReferenceArray X10_TEMP71 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP376));
        
//#line 242
final x10.
          lang.
          DoubleReferenceArray X10_TEMP379 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP71));
        
//#line 244
final x10.
          lang.
          DoubleReferenceArray X10_TEMP382 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP379));
        
//#line 245
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a =
          ((X10_TEMP382));
        
//#line 246
final x10.
          lang.
          DoubleReferenceArray X10_TEMP384 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 248
final x10.
          lang.
          DoubleReferenceArray X10_TEMP74 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP384));
        
//#line 249
final x10.
          lang.
          DoubleReferenceArray X10_TEMP387 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP74));
        
//#line 251
final x10.
          lang.
          DoubleReferenceArray X10_TEMP75 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP387));
        
//#line 252
final x10.
          lang.
          DoubleReferenceArray X10_TEMP390 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP75));
        
//#line 254
final x10.
          lang.
          DoubleReferenceArray X10_TEMP393 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP390));
        
//#line 255
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b =
          ((X10_TEMP393));
        
//#line 256
final x10.
          lang.
          DoubleReferenceArray X10_TEMP395 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 258
final x10.
          lang.
          DoubleReferenceArray X10_TEMP78 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP395));
        
//#line 259
final x10.
          lang.
          DoubleReferenceArray X10_TEMP398 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP78));
        
//#line 261
final x10.
          lang.
          DoubleReferenceArray X10_TEMP79 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP398));
        
//#line 262
final x10.
          lang.
          DoubleReferenceArray X10_TEMP401 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP79));
        
//#line 264
final x10.
          lang.
          DoubleReferenceArray X10_TEMP404 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP401));
        
//#line 265
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x =
          ((X10_TEMP404));
        
//#line 266
final x10.
          lang.
          IntReferenceArray X10_TEMP406 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vectorRegionMinus1Dist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 268
final x10.
          lang.
          IntReferenceArray X10_TEMP82 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP406));
        
//#line 269
final x10.
          lang.
          IntReferenceArray X10_TEMP409 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP82));
        
//#line 271
final x10.
          lang.
          IntReferenceArray X10_TEMP83 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP409));
        
//#line 272
final x10.
          lang.
          IntReferenceArray X10_TEMP412 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP83));
        
//#line 274
final x10.
          lang.
          IntReferenceArray X10_TEMP415 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP412));
        
//#line 275
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt =
          ((X10_TEMP415));
        
//#line 276
final int X10_TEMP417 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 278
final int X10_TEMP84 =
          (X10_TEMP417);
        
//#line 279
final long X10_TEMP420 =
          ((long)
             X10_TEMP84);
        
//#line 281
long nl =
          (X10_TEMP420);
        
//#line 282
final double X10_TEMP423 =
          (2.0);
        
//#line 284
final double X10_TEMP89 =
          (X10_TEMP423);
        
//#line 285
final long X10_TEMP426 =
          (nl *
             nl);
        
//#line 287
final long X10_TEMP86 =
          (X10_TEMP426);
        
//#line 288
final long X10_TEMP429 =
          (X10_TEMP86 *
             nl);
        
//#line 290
final long X10_TEMP88 =
          (X10_TEMP429);
        
//#line 291
final double X10_TEMP432 =
          (X10_TEMP89 *
             X10_TEMP88);
        
//#line 293
final double X10_TEMP91 =
          (X10_TEMP432);
        
//#line 294
final double X10_TEMP435 =
          (3.0);
        
//#line 296
final double X10_TEMP92 =
          (X10_TEMP435);
        
//#line 297
final double X10_TEMP438 =
          (X10_TEMP91 /
             X10_TEMP92);
        
//#line 299
final double X10_TEMP96 =
          (X10_TEMP438);
        
//#line 300
final double X10_TEMP441 =
          (2.0);
        
//#line 302
final double X10_TEMP95 =
          (X10_TEMP441);
        
//#line 303
final long X10_TEMP444 =
          (nl *
             nl);
        
//#line 305
final long X10_TEMP94 =
          (X10_TEMP444);
        
//#line 306
final double X10_TEMP447 =
          (X10_TEMP95 *
             X10_TEMP94);
        
//#line 308
final double X10_TEMP97 =
          (X10_TEMP447);
        
//#line 309
final double X10_TEMP450 =
          (X10_TEMP96 +
             X10_TEMP97);
        
//#line 311
final double X10_TEMP100 =
          (X10_TEMP450);
        
//#line 312
final double X10_TEMP453 =
          (X10_TEMP100);
        
//#line 314
final double X10_TEMP101 =
          (X10_TEMP453);
        
//#line 315
final double X10_TEMP456 =
          (X10_TEMP101);
        
//#line 317
final double X10_TEMP459 =
          (X10_TEMP456);
        
//#line 318
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ops =
          ((X10_TEMP459));
        
//#line 319
final x10.
          lang.
          DoubleReferenceArray X10_TEMP461 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 321
final x10.
          lang.
          DoubleReferenceArray X10_TEMP106 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP461));
        
//#line 322
final int X10_TEMP464 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 324
final int X10_TEMP107 =
          (X10_TEMP464);
        
//#line 325
final int X10_TEMP467 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 327
final int X10_TEMP108 =
          (X10_TEMP467);
        
//#line 328
final x10.
          lang.
          DoubleReferenceArray X10_TEMP470 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 330
final x10.
          lang.
          DoubleReferenceArray X10_TEMP109 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP470));
        
//#line 331
final double X10_TEMP478 =
          (Program0.
             Program_Linpack_matgen(
             X10_TEMP0,
             X10_TEMP106,
             X10_TEMP107,
             X10_TEMP108,
             X10_TEMP109));
        
//#line 333
final double X10_TEMP112 =
          (X10_TEMP478);
        
//#line 334
final double X10_TEMP481 =
          (X10_TEMP112);
        
//#line 336
final double X10_TEMP113 =
          (X10_TEMP481);
        
//#line 337
final double X10_TEMP484 =
          (X10_TEMP113);
        
//#line 339
final double X10_TEMP487 =
          (X10_TEMP484);
        
//#line 340
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma =
          ((X10_TEMP487));
    }
    
    
//#line 342
public static void
                   Program_Linpack_JGFkernel(
                   final Linpack X10_TEMP0) {
        
//#line 343
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 345
final x10.
          lang.
          DoubleReferenceArray X10_TEMP5 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 346
final int X10_TEMP213 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 348
final int X10_TEMP6 =
          (X10_TEMP213);
        
//#line 349
final int X10_TEMP216 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 351
final int X10_TEMP7 =
          (X10_TEMP216);
        
//#line 352
final x10.
          lang.
          IntReferenceArray X10_TEMP219 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt));
        
//#line 354
final x10.
          lang.
          IntReferenceArray X10_TEMP8 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP219));
        
//#line 355
final int X10_TEMP227 =
          (Program0.
             Program_Linpack_dgefa(
             X10_TEMP0,
             X10_TEMP5,
             X10_TEMP6,
             X10_TEMP7,
             X10_TEMP8));
        
//#line 357
final int X10_TEMP11 =
          (X10_TEMP227);
        
//#line 358
final int X10_TEMP230 =
          (X10_TEMP11);
        
//#line 360
final int X10_TEMP12 =
          (X10_TEMP230);
        
//#line 361
final int X10_TEMP233 =
          (X10_TEMP12);
        
//#line 363
final int X10_TEMP236 =
          (X10_TEMP233);
        
//#line 364
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.info =
          ((X10_TEMP236));
        
//#line 365
final x10.
          lang.
          DoubleReferenceArray X10_TEMP238 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 367
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP238));
        
//#line 368
final int X10_TEMP241 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 370
final int X10_TEMP20 =
          (X10_TEMP241);
        
//#line 371
final int X10_TEMP244 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 373
final int X10_TEMP21 =
          (X10_TEMP244);
        
//#line 374
final x10.
          lang.
          IntReferenceArray X10_TEMP247 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt));
        
//#line 376
final x10.
          lang.
          IntReferenceArray X10_TEMP22 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP247));
        
//#line 377
final x10.
          lang.
          DoubleReferenceArray X10_TEMP250 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 379
final x10.
          lang.
          DoubleReferenceArray X10_TEMP23 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP250));
        
//#line 380
final int X10_TEMP253 =
          (0);
        
//#line 382
final int X10_TEMP24 =
          (X10_TEMP253);
        
//#line 383
Program0.
                       Program_Linpack_dgesl(
                       X10_TEMP0,
                       X10_TEMP19,
                       X10_TEMP20,
                       X10_TEMP21,
                       X10_TEMP22,
                       X10_TEMP23,
                       X10_TEMP24);
    }
    
    
//#line 385
public static void
                   Program_Linpack_JGFvalidate(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     dist vd) {
        
//#line 386
final double X10_TEMP210 =
          (0.0);
        
//#line 388
double eps =
          (X10_TEMP210);
        
//#line 389
final double X10_TEMP213 =
          (0.0);
        
//#line 391
double residn =
          (X10_TEMP213);
        
//#line 392
final x10.
          lang.
          DoubleReferenceArray X10_TEMP220 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 393
final double X10_TEMP216 =
                    (0.0);
                  
//#line 395
final double X10_TEMP4 =
                    (X10_TEMP216);
                  
//#line 396
return X10_TEMP4;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 401
final x10.
          lang.
          DoubleReferenceArray ref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP220));
        
//#line 402
final int X10_TEMP223 =
          (0);
        
//#line 404
final int X10_TEMP7 =
          (X10_TEMP223);
        
//#line 405
final double X10_TEMP226 =
          (6.0);
        
//#line 407
final double X10_TEMP10 =
          (X10_TEMP226);
        
//#line 408
final double X10_TEMP229 =
          (X10_TEMP10);
        
//#line 410
final double X10_TEMP11 =
          (X10_TEMP229);
        
//#line 411
final double X10_TEMP233 =
          (X10_TEMP11);
        
//#line 413
final double X10_TEMP236 =
          (X10_TEMP233);
        
//#line 414
/* template:array_set { */(ref).set((X10_TEMP236),X10_TEMP7)/* } */;
        
//#line 415
final int X10_TEMP238 =
          (1);
        
//#line 417
final int X10_TEMP13 =
          (X10_TEMP238);
        
//#line 418
final double X10_TEMP241 =
          (12.0);
        
//#line 420
final double X10_TEMP16 =
          (X10_TEMP241);
        
//#line 421
final double X10_TEMP244 =
          (X10_TEMP16);
        
//#line 423
final double X10_TEMP17 =
          (X10_TEMP244);
        
//#line 424
final double X10_TEMP248 =
          (X10_TEMP17);
        
//#line 426
final double X10_TEMP251 =
          (X10_TEMP248);
        
//#line 427
/* template:array_set { */(ref).set((X10_TEMP251),X10_TEMP13)/* } */;
        
//#line 428
final int X10_TEMP253 =
          (2);
        
//#line 430
final int X10_TEMP19 =
          (X10_TEMP253);
        
//#line 431
final double X10_TEMP256 =
          (20.0);
        
//#line 433
final double X10_TEMP22 =
          (X10_TEMP256);
        
//#line 434
final double X10_TEMP259 =
          (X10_TEMP22);
        
//#line 436
final double X10_TEMP23 =
          (X10_TEMP259);
        
//#line 437
final double X10_TEMP263 =
          (X10_TEMP23);
        
//#line 439
final double X10_TEMP266 =
          (X10_TEMP263);
        
//#line 440
/* template:array_set { */(ref).set((X10_TEMP266),X10_TEMP19)/* } */;
        
//#line 441
final int X10_TEMP268 =
          (0);
        
//#line 443
final int X10_TEMP26 =
          (X10_TEMP268);
        
//#line 444
final int X10_TEMP271 =
          (0);
        
//#line 446
final int X10_TEMP27 =
          (X10_TEMP271);
        
//#line 447
final int X10_TEMP274 =
          (0);
        
//#line 449
final int X10_TEMP30 =
          (X10_TEMP274);
        
//#line 450
final int X10_TEMP277 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 452
final int X10_TEMP31 =
          (X10_TEMP277);
        
//#line 453
final x10.
          lang.
          region X10_TEMP284 =
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
                  X10_TEMP27),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP30,
                  X10_TEMP31))));
        
//#line 455
final x10.
          lang.
          region tempR =
          (x10.
            lang.
            region)
            ((X10_TEMP284));
        
//#line 456
final x10.
          lang.
          place X10_TEMP287 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 458
final x10.
          lang.
          place X10_TEMP33 =
          (X10_TEMP287);
        
//#line 459
final x10.
          lang.
          dist X10_TEMP290 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                tempR,
                X10_TEMP33)));
        
//#line 461
final x10.
          lang.
          dist tempdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP290));
        
//#line 462
/* template:forloop-mult { */{
        x10.lang.region __var16__ = (x10.lang.region) tempdist.
                                                        region;
        if (__var16__.size() > 0 && (__var16__ instanceof x10.array.MultiDimRegion || __var16__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var17__ = __var16__.rank(0).low(), __var18__ = __var16__.rank(0).high(); __var17__ <= __var18__; __var17__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var19__ = __var16__.rank(1).low(), __var20__ = __var16__.rank(1).high(); __var19__ <= __var20__; __var19__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var17__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var19__;
        /* } */
        /* } */
{
            
//#line 463
final x10.
              lang.
              DoubleReferenceArray X10_TEMP294 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 465
final x10.
              lang.
              DoubleReferenceArray X10_TEMP36 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP294));
            
//#line 466
final int X10_TEMP297 =
              (0);
            
//#line 468
final int X10_TEMP39 =
              (X10_TEMP297);
            
//#line 469
final x10.
              lang.
              DoubleReferenceArray X10_TEMP300 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 471
final x10.
              lang.
              DoubleReferenceArray X10_TEMP40 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP300));
            
//#line 472
final int X10_TEMP303 =
              (0);
            
//#line 474
final int X10_TEMP43 =
              (X10_TEMP303);
            
//#line 475
final double X10_TEMP308 =
              (/* template:array_get { */((X10_TEMP40).get(/* Join: { */X10_TEMP43,i/* } */))/* } */);
            
//#line 477
final double X10_TEMP46 =
              (X10_TEMP308);
            
//#line 478
final double X10_TEMP311 =
              (X10_TEMP46);
            
//#line 480
final double X10_TEMP47 =
              (X10_TEMP311);
            
//#line 481
final double X10_TEMP316 =
              (X10_TEMP47);
            
//#line 483
final double X10_TEMP319 =
              (X10_TEMP316);
            
//#line 484
/* template:array_set { */(X10_TEMP36).set((X10_TEMP319),/* Join: { */X10_TEMP39,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var16__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 463
final x10.
              lang.
              DoubleReferenceArray X10_TEMP294 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 465
final x10.
              lang.
              DoubleReferenceArray X10_TEMP36 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP294));
            
//#line 466
final int X10_TEMP297 =
              (0);
            
//#line 468
final int X10_TEMP39 =
              (X10_TEMP297);
            
//#line 469
final x10.
              lang.
              DoubleReferenceArray X10_TEMP300 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 471
final x10.
              lang.
              DoubleReferenceArray X10_TEMP40 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP300));
            
//#line 472
final int X10_TEMP303 =
              (0);
            
//#line 474
final int X10_TEMP43 =
              (X10_TEMP303);
            
//#line 475
final double X10_TEMP308 =
              (/* template:array_get { */((X10_TEMP40).get(/* Join: { */X10_TEMP43,i/* } */))/* } */);
            
//#line 477
final double X10_TEMP46 =
              (X10_TEMP308);
            
//#line 478
final double X10_TEMP311 =
              (X10_TEMP46);
            
//#line 480
final double X10_TEMP47 =
              (X10_TEMP311);
            
//#line 481
final double X10_TEMP316 =
              (X10_TEMP47);
            
//#line 483
final double X10_TEMP319 =
              (X10_TEMP316);
            
//#line 484
/* template:array_set { */(X10_TEMP36).set((X10_TEMP319),/* Join: { */X10_TEMP39,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 486
final x10.
          lang.
          DoubleReferenceArray X10_TEMP321 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 488
final x10.
          lang.
          DoubleReferenceArray X10_TEMP52 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP321));
        
//#line 489
final int X10_TEMP324 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 491
final int X10_TEMP53 =
          (X10_TEMP324);
        
//#line 492
final int X10_TEMP327 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 494
final int X10_TEMP54 =
          (X10_TEMP327);
        
//#line 495
final x10.
          lang.
          DoubleReferenceArray X10_TEMP330 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 497
final x10.
          lang.
          DoubleReferenceArray X10_TEMP55 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP330));
        
//#line 498
final double X10_TEMP338 =
          (Program0.
             Program_Linpack_matgen(
             X10_TEMP0,
             X10_TEMP52,
             X10_TEMP53,
             X10_TEMP54,
             X10_TEMP55));
        
//#line 500
final double X10_TEMP58 =
          (X10_TEMP338);
        
//#line 501
final double X10_TEMP341 =
          (X10_TEMP58);
        
//#line 503
final double X10_TEMP59 =
          (X10_TEMP341);
        
//#line 504
final double X10_TEMP344 =
          (X10_TEMP59);
        
//#line 506
final double X10_TEMP347 =
          (X10_TEMP344);
        
//#line 507
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma =
          ((X10_TEMP347));
        
//#line 508
/* template:forloop-mult { */{
        x10.lang.region __var21__ = (x10.lang.region) tempdist.
                                                        region;
        if (__var21__.size() > 0 && (__var21__ instanceof x10.array.MultiDimRegion || __var21__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var22__ = __var21__.rank(0).low(), __var23__ = __var21__.rank(0).high(); __var22__ <= __var23__; __var22__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var24__ = __var21__.rank(1).low(), __var25__ = __var21__.rank(1).high(); __var24__ <= __var25__; __var24__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var22__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var24__;
        /* } */
        /* } */
{
            
//#line 509
final x10.
              lang.
              DoubleReferenceArray X10_TEMP350 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 511
final x10.
              lang.
              DoubleReferenceArray X10_TEMP61 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP350));
            
//#line 512
final int X10_TEMP353 =
              (0);
            
//#line 514
final int X10_TEMP64 =
              (X10_TEMP353);
            
//#line 515
final x10.
              lang.
              DoubleReferenceArray X10_TEMP356 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 517
final x10.
              lang.
              DoubleReferenceArray X10_TEMP65 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP356));
            
//#line 518
final int X10_TEMP359 =
              (0);
            
//#line 520
final int X10_TEMP68 =
              (X10_TEMP359);
            
//#line 521
final double X10_TEMP364 =
              (/* template:array_get { */((X10_TEMP65).get(/* Join: { */X10_TEMP68,i/* } */))/* } */);
            
//#line 523
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 524
final int X10_TEMP70 =
              (0);
            
//#line 525
final double X10_TEMP368 =
              (X10_TEMP70 -
                 X10_TEMP69);
            
//#line 527
final double X10_TEMP73 =
              (X10_TEMP368);
            
//#line 528
final double X10_TEMP371 =
              (X10_TEMP73);
            
//#line 530
final double X10_TEMP74 =
              (X10_TEMP371);
            
//#line 531
final double X10_TEMP376 =
              (X10_TEMP74);
            
//#line 533
final double X10_TEMP379 =
              (X10_TEMP376);
            
//#line 534
/* template:array_set { */(X10_TEMP61).set((X10_TEMP379),/* Join: { */X10_TEMP64,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var21__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var1__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
            
//#line 509
final x10.
              lang.
              DoubleReferenceArray X10_TEMP350 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 511
final x10.
              lang.
              DoubleReferenceArray X10_TEMP61 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP350));
            
//#line 512
final int X10_TEMP353 =
              (0);
            
//#line 514
final int X10_TEMP64 =
              (X10_TEMP353);
            
//#line 515
final x10.
              lang.
              DoubleReferenceArray X10_TEMP356 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 517
final x10.
              lang.
              DoubleReferenceArray X10_TEMP65 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP356));
            
//#line 518
final int X10_TEMP359 =
              (0);
            
//#line 520
final int X10_TEMP68 =
              (X10_TEMP359);
            
//#line 521
final double X10_TEMP364 =
              (/* template:array_get { */((X10_TEMP65).get(/* Join: { */X10_TEMP68,i/* } */))/* } */);
            
//#line 523
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 524
final int X10_TEMP70 =
              (0);
            
//#line 525
final double X10_TEMP368 =
              (X10_TEMP70 -
                 X10_TEMP69);
            
//#line 527
final double X10_TEMP73 =
              (X10_TEMP368);
            
//#line 528
final double X10_TEMP371 =
              (X10_TEMP73);
            
//#line 530
final double X10_TEMP74 =
              (X10_TEMP371);
            
//#line 531
final double X10_TEMP376 =
              (X10_TEMP74);
            
//#line 533
final double X10_TEMP379 =
              (X10_TEMP376);
            
//#line 534
/* template:array_set { */(X10_TEMP61).set((X10_TEMP379),/* Join: { */X10_TEMP64,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 536
final int X10_TEMP381 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 538
final int X10_TEMP81 =
          (X10_TEMP381);
        
//#line 539
final x10.
          lang.
          DoubleReferenceArray X10_TEMP384 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 541
final x10.
          lang.
          DoubleReferenceArray X10_TEMP82 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP384));
        
//#line 542
final int X10_TEMP387 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 544
final int X10_TEMP83 =
          (X10_TEMP387);
        
//#line 545
final int X10_TEMP390 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 547
final int X10_TEMP84 =
          (X10_TEMP390);
        
//#line 548
final x10.
          lang.
          DoubleReferenceArray X10_TEMP393 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
        
//#line 550
final x10.
          lang.
          DoubleReferenceArray X10_TEMP85 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP393));
        
//#line 551
final x10.
          lang.
          DoubleReferenceArray X10_TEMP396 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 553
final x10.
          lang.
          DoubleReferenceArray X10_TEMP86 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP396));
        
//#line 554
Program0.
                       Program_Linpack_dmxpy(
                       X10_TEMP0,
                       X10_TEMP81,
                       X10_TEMP82,
                       X10_TEMP83,
                       X10_TEMP84,
                       X10_TEMP85,
                       X10_TEMP86);
        
//#line 555
final double X10_TEMP406 =
          (0.0);
        
//#line 557
final double X10_TEMP89 =
          (X10_TEMP406);
        
//#line 558
final double X10_TEMP409 =
          (X10_TEMP89);
        
//#line 560
final double X10_TEMP90 =
          (X10_TEMP409);
        
//#line 561
final double X10_TEMP412 =
          (X10_TEMP90);
        
//#line 563
final double X10_TEMP415 =
          (X10_TEMP412);
        
//#line 564
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
          ((X10_TEMP415));
        
//#line 565
final double X10_TEMP417 =
          (0.0);
        
//#line 567
final double X10_TEMP93 =
          (X10_TEMP417);
        
//#line 568
final double X10_TEMP420 =
          (X10_TEMP93);
        
//#line 570
final double X10_TEMP94 =
          (X10_TEMP420);
        
//#line 571
final double X10_TEMP423 =
          (X10_TEMP94);
        
//#line 573
final double X10_TEMP426 =
          (X10_TEMP423);
        
//#line 574
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
          ((X10_TEMP426));
        
//#line 575
/* template:forloop-mult { */{
        x10.lang.region __var26__ = (x10.lang.region) tempdist.
                                                        region;
        if (__var26__.size() > 0 && (__var26__ instanceof x10.array.MultiDimRegion || __var26__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var27__ = __var26__.rank(0).low(), __var28__ = __var26__.rank(0).high(); __var27__ <= __var28__; __var27__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var29__ = __var26__.rank(1).low(), __var30__ = __var26__.rank(1).high(); __var29__ <= __var30__; __var29__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var27__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var29__;
        /* } */
        /* } */
{
            
//#line 576
final double X10_TEMP429 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
            
//#line 578
final double X10_TEMP102 =
              (X10_TEMP429);
            
//#line 579
final x10.
              lang.
              DoubleReferenceArray X10_TEMP432 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 581
final x10.
              lang.
              DoubleReferenceArray X10_TEMP96 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP432));
            
//#line 582
final int X10_TEMP435 =
              (0);
            
//#line 584
final int X10_TEMP99 =
              (X10_TEMP435);
            
//#line 585
final double X10_TEMP440 =
              (/* template:array_get { */((X10_TEMP96).get(/* Join: { */X10_TEMP99,i/* } */))/* } */);
            
//#line 587
final double X10_TEMP101 =
              (X10_TEMP440);
            
//#line 588
final double X10_TEMP445 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP101));
            
//#line 590
final double X10_TEMP103 =
              (X10_TEMP445);
            
//#line 591
final boolean X10_TEMP448 =
              (X10_TEMP102 >
                 X10_TEMP103);
            
//#line 593
final boolean X10_TEMP105 =
              (X10_TEMP448);
            
//#line 594
final boolean X10_TEMP106 =
              (X10_TEMP105);
            
//#line 595
final x10.
              lang.
              DoubleReferenceArray X10_TEMP452 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 597
final x10.
              lang.
              DoubleReferenceArray X10_TEMP108 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP452));
            
//#line 598
final int X10_TEMP455 =
              (0);
            
//#line 600
final int X10_TEMP111 =
              (X10_TEMP455);
            
//#line 601
final double X10_TEMP460 =
              (/* template:array_get { */((X10_TEMP108).get(/* Join: { */X10_TEMP111,i/* } */))/* } */);
            
//#line 603
final double X10_TEMP113 =
              (X10_TEMP460);
            
//#line 604
double X10_TEMP115 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP113));
            
//#line 605
if (X10_TEMP106) {
                
//#line 606
final double X10_TEMP467 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
                
//#line 607
X10_TEMP115 =
                  ((X10_TEMP467));
            }
            
//#line 609
final double X10_TEMP116 =
              (X10_TEMP115);
            
//#line 610
final double X10_TEMP470 =
              (X10_TEMP116);
            
//#line 612
final double X10_TEMP118 =
              (X10_TEMP470);
            
//#line 613
final double X10_TEMP473 =
              (X10_TEMP118);
            
//#line 615
final double X10_TEMP476 =
              (X10_TEMP473);
            
//#line 616
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
              ((X10_TEMP476));
            
//#line 617
final double X10_TEMP478 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
            
//#line 619
final double X10_TEMP125 =
              (X10_TEMP478);
            
//#line 620
final x10.
              lang.
              DoubleReferenceArray X10_TEMP481 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 622
final x10.
              lang.
              DoubleReferenceArray X10_TEMP119 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP481));
            
//#line 623
final int X10_TEMP484 =
              (0);
            
//#line 625
final int X10_TEMP122 =
              (X10_TEMP484);
            
//#line 626
final double X10_TEMP489 =
              (/* template:array_get { */((X10_TEMP119).get(/* Join: { */X10_TEMP122,i/* } */))/* } */);
            
//#line 628
final double X10_TEMP124 =
              (X10_TEMP489);
            
//#line 629
final double X10_TEMP494 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP124));
            
//#line 631
final double X10_TEMP126 =
              (X10_TEMP494);
            
//#line 632
final boolean X10_TEMP497 =
              (X10_TEMP125 >
                 X10_TEMP126);
            
//#line 634
final boolean X10_TEMP128 =
              (X10_TEMP497);
            
//#line 635
final boolean X10_TEMP129 =
              (X10_TEMP128);
            
//#line 636
final x10.
              lang.
              DoubleReferenceArray X10_TEMP501 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 638
final x10.
              lang.
              DoubleReferenceArray X10_TEMP131 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP501));
            
//#line 639
final int X10_TEMP504 =
              (0);
            
//#line 641
final int X10_TEMP134 =
              (X10_TEMP504);
            
//#line 642
final double X10_TEMP509 =
              (/* template:array_get { */((X10_TEMP131).get(/* Join: { */X10_TEMP134,i/* } */))/* } */);
            
//#line 644
final double X10_TEMP136 =
              (X10_TEMP509);
            
//#line 645
double X10_TEMP138 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP136));
            
//#line 646
if (X10_TEMP129) {
                
//#line 647
final double X10_TEMP516 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
                
//#line 648
X10_TEMP138 =
                  ((X10_TEMP516));
            }
            
//#line 650
final double X10_TEMP139 =
              (X10_TEMP138);
            
//#line 651
final double X10_TEMP519 =
              (X10_TEMP139);
            
//#line 653
final double X10_TEMP141 =
              (X10_TEMP519);
            
//#line 654
final double X10_TEMP522 =
              (X10_TEMP141);
            
//#line 656
final double X10_TEMP525 =
              (X10_TEMP522);
            
//#line 657
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
              ((X10_TEMP525));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var2____ = (__var26__).iterator(); __var2____.hasNext(); ) {
        	final  x10.
          lang.
          point __var2__ = (x10.
          lang.
          point) __var2____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var2__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var2__).get(1))/* } */;/* } */
{
            
//#line 576
final double X10_TEMP429 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
            
//#line 578
final double X10_TEMP102 =
              (X10_TEMP429);
            
//#line 579
final x10.
              lang.
              DoubleReferenceArray X10_TEMP432 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 581
final x10.
              lang.
              DoubleReferenceArray X10_TEMP96 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP432));
            
//#line 582
final int X10_TEMP435 =
              (0);
            
//#line 584
final int X10_TEMP99 =
              (X10_TEMP435);
            
//#line 585
final double X10_TEMP440 =
              (/* template:array_get { */((X10_TEMP96).get(/* Join: { */X10_TEMP99,i/* } */))/* } */);
            
//#line 587
final double X10_TEMP101 =
              (X10_TEMP440);
            
//#line 588
final double X10_TEMP445 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP101));
            
//#line 590
final double X10_TEMP103 =
              (X10_TEMP445);
            
//#line 591
final boolean X10_TEMP448 =
              (X10_TEMP102 >
                 X10_TEMP103);
            
//#line 593
final boolean X10_TEMP105 =
              (X10_TEMP448);
            
//#line 594
final boolean X10_TEMP106 =
              (X10_TEMP105);
            
//#line 595
final x10.
              lang.
              DoubleReferenceArray X10_TEMP452 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 597
final x10.
              lang.
              DoubleReferenceArray X10_TEMP108 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP452));
            
//#line 598
final int X10_TEMP455 =
              (0);
            
//#line 600
final int X10_TEMP111 =
              (X10_TEMP455);
            
//#line 601
final double X10_TEMP460 =
              (/* template:array_get { */((X10_TEMP108).get(/* Join: { */X10_TEMP111,i/* } */))/* } */);
            
//#line 603
final double X10_TEMP113 =
              (X10_TEMP460);
            
//#line 604
double X10_TEMP115 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP113));
            
//#line 605
if (X10_TEMP106) {
                
//#line 606
final double X10_TEMP467 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
                
//#line 607
X10_TEMP115 =
                  ((X10_TEMP467));
            }
            
//#line 609
final double X10_TEMP116 =
              (X10_TEMP115);
            
//#line 610
final double X10_TEMP470 =
              (X10_TEMP116);
            
//#line 612
final double X10_TEMP118 =
              (X10_TEMP470);
            
//#line 613
final double X10_TEMP473 =
              (X10_TEMP118);
            
//#line 615
final double X10_TEMP476 =
              (X10_TEMP473);
            
//#line 616
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
              ((X10_TEMP476));
            
//#line 617
final double X10_TEMP478 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
            
//#line 619
final double X10_TEMP125 =
              (X10_TEMP478);
            
//#line 620
final x10.
              lang.
              DoubleReferenceArray X10_TEMP481 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 622
final x10.
              lang.
              DoubleReferenceArray X10_TEMP119 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP481));
            
//#line 623
final int X10_TEMP484 =
              (0);
            
//#line 625
final int X10_TEMP122 =
              (X10_TEMP484);
            
//#line 626
final double X10_TEMP489 =
              (/* template:array_get { */((X10_TEMP119).get(/* Join: { */X10_TEMP122,i/* } */))/* } */);
            
//#line 628
final double X10_TEMP124 =
              (X10_TEMP489);
            
//#line 629
final double X10_TEMP494 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP124));
            
//#line 631
final double X10_TEMP126 =
              (X10_TEMP494);
            
//#line 632
final boolean X10_TEMP497 =
              (X10_TEMP125 >
                 X10_TEMP126);
            
//#line 634
final boolean X10_TEMP128 =
              (X10_TEMP497);
            
//#line 635
final boolean X10_TEMP129 =
              (X10_TEMP128);
            
//#line 636
final x10.
              lang.
              DoubleReferenceArray X10_TEMP501 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 638
final x10.
              lang.
              DoubleReferenceArray X10_TEMP131 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP501));
            
//#line 639
final int X10_TEMP504 =
              (0);
            
//#line 641
final int X10_TEMP134 =
              (X10_TEMP504);
            
//#line 642
final double X10_TEMP509 =
              (/* template:array_get { */((X10_TEMP131).get(/* Join: { */X10_TEMP134,i/* } */))/* } */);
            
//#line 644
final double X10_TEMP136 =
              (X10_TEMP509);
            
//#line 645
double X10_TEMP138 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP136));
            
//#line 646
if (X10_TEMP129) {
                
//#line 647
final double X10_TEMP516 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
                
//#line 648
X10_TEMP138 =
                  ((X10_TEMP516));
            }
            
//#line 650
final double X10_TEMP139 =
              (X10_TEMP138);
            
//#line 651
final double X10_TEMP519 =
              (X10_TEMP139);
            
//#line 653
final double X10_TEMP141 =
              (X10_TEMP519);
            
//#line 654
final double X10_TEMP522 =
              (X10_TEMP141);
            
//#line 656
final double X10_TEMP525 =
              (X10_TEMP522);
            
//#line 657
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
              ((X10_TEMP525));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 659
final double X10_TEMP527 =
          (1.0);
        
//#line 661
final double X10_TEMP142 =
          (X10_TEMP527);
        
//#line 662
final double X10_TEMP530 =
          ((double)
             X10_TEMP142);
        
//#line 664
final double X10_TEMP144 =
          (X10_TEMP530);
        
//#line 665
final double X10_TEMP535 =
          (Program0.
             Program_Linpack_epslon(
             X10_TEMP0,
             X10_TEMP144));
        
//#line 667
final double X10_TEMP146 =
          (X10_TEMP535);
        
//#line 668
final double X10_TEMP538 =
          (X10_TEMP146);
        
//#line 670
eps =
          ((X10_TEMP538));
        
//#line 671
final double X10_TEMP541 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
        
//#line 673
final double X10_TEMP154 =
          (X10_TEMP541);
        
//#line 674
final int X10_TEMP544 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 676
final double X10_TEMP147 =
          (X10_TEMP544);
        
//#line 677
final double X10_TEMP547 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma);
        
//#line 679
final double X10_TEMP148 =
          (X10_TEMP547);
        
//#line 680
final double X10_TEMP550 =
          (X10_TEMP147 *
             X10_TEMP148);
        
//#line 682
final double X10_TEMP149 =
          (X10_TEMP550);
        
//#line 683
final double X10_TEMP553 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
        
//#line 685
final double X10_TEMP150 =
          (X10_TEMP553);
        
//#line 686
final double X10_TEMP556 =
          (X10_TEMP149 *
             X10_TEMP150);
        
//#line 688
final double X10_TEMP151 =
          (X10_TEMP556);
        
//#line 689
final double X10_TEMP559 =
          (X10_TEMP151 *
             eps);
        
//#line 691
final double X10_TEMP153 =
          (X10_TEMP559);
        
//#line 692
final double X10_TEMP562 =
          (X10_TEMP154 /
             X10_TEMP153);
        
//#line 694
final double X10_TEMP156 =
          (X10_TEMP562);
        
//#line 695
final double X10_TEMP565 =
          (X10_TEMP156);
        
//#line 697
residn =
          ((X10_TEMP565));
        
//#line 698
final int X10_TEMP568 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 700
final int X10_TEMP158 =
          (X10_TEMP568);
        
//#line 701
final double X10_TEMP572 =
          (/* template:array_get { */((ref).get(X10_TEMP158))/* } */);
        
//#line 703
final double X10_TEMP159 =
          (X10_TEMP572);
        
//#line 704
final boolean X10_TEMP161 =
          (residn >
             X10_TEMP159);
        
//#line 705
if (X10_TEMP161) {
            
//#line 706
final java.
              lang.
              String X10_TEMP577 =
              ("Validation failed");
            
//#line 708
final java.
              lang.
              String X10_TEMP163 =
              (X10_TEMP577);
            
//#line 709
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP163);
            
//#line 710
final java.
              lang.
              String X10_TEMP581 =
              ("Computed Norm Res = ");
            
//#line 712
final java.
              lang.
              String X10_TEMP164 =
              (X10_TEMP581);
            
//#line 713
final java.
              lang.
              String X10_TEMP584 =
              (X10_TEMP164 +
               residn);
            
//#line 715
final java.
              lang.
              String X10_TEMP166 =
              (X10_TEMP584);
            
//#line 716
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP166);
            
//#line 717
final java.
              lang.
              String X10_TEMP588 =
              ("Reference Norm Res = ");
            
//#line 719
final java.
              lang.
              String X10_TEMP169 =
              (X10_TEMP588);
            
//#line 720
final int X10_TEMP591 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
            
//#line 722
final int X10_TEMP168 =
              (X10_TEMP591);
            
//#line 723
final double X10_TEMP595 =
              (/* template:array_get { */((ref).get(X10_TEMP168))/* } */);
            
//#line 725
final double X10_TEMP170 =
              (X10_TEMP595);
            
//#line 726
final java.
              lang.
              String X10_TEMP598 =
              (X10_TEMP169 +
               X10_TEMP170);
            
//#line 728
final java.
              lang.
              String X10_TEMP172 =
              (X10_TEMP598);
            
//#line 729
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP172);
            
//#line 730
final java.
              lang.
              String X10_TEMP602 =
              ("Validation failed");
            
//#line 732
final java.
              lang.
              String X10_TEMP174 =
              (X10_TEMP602);
            
//#line 733
throw new java.
              lang.
              RuntimeException(
              X10_TEMP174);
        }
    }
    
    
//#line 736
public static void
                   Program_Linpack_JGFtidyup(
                   final Linpack X10_TEMP0) {
        
    }
    
    
//#line 738
public static void
                   Program_Linpack_run(
                   final Linpack X10_TEMP0) {
        
//#line 739
final int X10_TEMP210 =
          (0);
        
//#line 741
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 742
Program0.
                       Program_Linpack_JGFsetsize(
                       X10_TEMP0,
                       X10_TEMP2);
        
//#line 743
final x10.
          lang.
          place X10_TEMP215 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 745
final x10.
          lang.
          place X10_TEMP3 =
          (X10_TEMP215);
        
//#line 746
final x10.
          lang.
          dist X10_TEMP218 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                _Program__Linpack_r,
                X10_TEMP3)));
        
//#line 748
final x10.
          lang.
          dist vd =
          (x10.
            lang.
            dist)
            ((X10_TEMP218));
        
//#line 749
Program0.
                       Program_Linpack_JGFinitialise(
                       X10_TEMP0,
                       vd);
        
//#line 750
Program0.
                       Program_Linpack_JGFkernel(
                       X10_TEMP0);
        
//#line 751
Program0.
                       Program_Linpack_JGFvalidate(
                       X10_TEMP0,
                       vd);
        
//#line 752
Program0.
                       Program_Linpack_JGFtidyup(
                       X10_TEMP0);
    }
    
    
//#line 754
public static double
                   Program_Linpack_read(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j) {
        
//#line 755
final x10.
          lang.
          place X10_TEMP210 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 757
final x10.
          lang.
          place curr_place =
          (X10_TEMP210);
        
//#line 758
final int X10_TEMP213 =
          (0);
        
//#line 760
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 761
final int X10_TEMP216 =
          (0);
        
//#line 763
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 764
final x10.
          lang.
          region X10_TEMP221 =
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
        
//#line 766
final x10.
          lang.
          region tempr =
          (x10.
            lang.
            region)
            ((X10_TEMP221));
        
//#line 767
final x10.
          lang.
          place X10_TEMP224 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 769
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP224);
        
//#line 770
final x10.
          lang.
          dist X10_TEMP227 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                X10_TEMP7)));
        
//#line 772
final x10.
          lang.
          dist tempvd =
          (x10.
            lang.
            dist)
            ((X10_TEMP227));
        
//#line 773
final x10.
          lang.
          DoubleReferenceArray X10_TEMP234 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 774
final double X10_TEMP230 =
                    (0.0);
                  
//#line 776
final double X10_TEMP10 =
                    (X10_TEMP230);
                  
//#line 777
return X10_TEMP10;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 782
final x10.
          lang.
          DoubleReferenceArray tempref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP234));
        
//#line 783
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 784
final x10.
              lang.
              dist X10_TEMP237 =
              (x10.
                lang.
                dist)
                ((a.
                    distribution));
            
//#line 786
final x10.
              lang.
              dist X10_TEMP12 =
              (x10.
                lang.
                dist)
                ((X10_TEMP237));
            
//#line 787
final x10.
              lang.
              place X10_TEMP16 =
              (X10_TEMP12.
                 get(
                 i,
                 j));
            
//#line 788
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP16)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 789
final double X10_TEMP246 =
                  (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 791
final double temp =
                  (X10_TEMP246);
                
//#line 792
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 793
final int X10_TEMP250 =
                      (0);
                    
//#line 795
final int X10_TEMP22 =
                      (X10_TEMP250);
                    
//#line 796
final double X10_TEMP253 =
                      (temp);
                    
//#line 798
final double X10_TEMP25 =
                      (X10_TEMP253);
                    
//#line 799
final double X10_TEMP257 =
                      (X10_TEMP25);
                    
//#line 801
final double X10_TEMP260 =
                      (X10_TEMP257);
                    
//#line 802
/* template:array_set { */(tempref).set((X10_TEMP260),X10_TEMP22)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp31) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp31);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 806
final int X10_TEMP262 =
          (0);
        
//#line 808
final int X10_TEMP27 =
          (X10_TEMP262);
        
//#line 809
final double X10_TEMP266 =
          (/* template:array_get { */((tempref).get(X10_TEMP27))/* } */);
        
//#line 811
final double X10_TEMP29 =
          (X10_TEMP266);
        
//#line 812
return X10_TEMP29;
    }
    
    
//#line 814
public static void
                   Program_Linpack_write(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final x10.
                     lang.
                     point p,
                   final double val) {
        
//#line 815
final x10.
          lang.
          dist X10_TEMP210 =
          (x10.
            lang.
            dist)
            ((a.
                distribution));
        
//#line 817
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP210));
        
//#line 818
final x10.
          lang.
          place X10_TEMP4 =
          (X10_TEMP1.
             get(
             p));
        
//#line 819
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 820
final double X10_TEMP216 =
              (val);
            
//#line 822
final double X10_TEMP8 =
              (X10_TEMP216);
            
//#line 823
final double X10_TEMP220 =
              (X10_TEMP8);
            
//#line 825
final double X10_TEMP223 =
              (X10_TEMP220);
            
//#line 826
/* template:array_set { */(a).set((X10_TEMP223),p)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 829
public static void
                   Program_Linpack_plusWrite(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j,
                   final double val) {
        
//#line 830
final x10.
          lang.
          dist X10_TEMP210 =
          (x10.
            lang.
            dist)
            ((a.
                distribution));
        
//#line 832
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP210));
        
//#line 833
final x10.
          lang.
          place X10_TEMP5 =
          (X10_TEMP1.
             get(
             i,
             j));
        
//#line 834
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP5)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 835
final double X10_TEMP219 =
              (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 837
final double X10_TEMP9 =
              (X10_TEMP219);
            
//#line 838
final double X10_TEMP222 =
              (X10_TEMP9 +
                 val);
            
//#line 840
final double X10_TEMP10 =
              (X10_TEMP222);
            
//#line 841
final double X10_TEMP227 =
              (X10_TEMP10);
            
//#line 843
final double X10_TEMP230 =
              (X10_TEMP227);
            
//#line 844
/* template:array_set { */(a).set((X10_TEMP230),/* Join: { */i,j/* } */)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 847
public static double
                   Program_Linpack_myabs(
                   final Linpack X10_TEMP0,
                   final double d) {
        
//#line 848
final int X10_TEMP210 =
          (0);
        
//#line 850
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 851
final boolean X10_TEMP213 =
          (d >=
             X10_TEMP1);
        
//#line 853
final boolean X10_TEMP3 =
          (X10_TEMP213);
        
//#line 854
final boolean X10_TEMP4 =
          (X10_TEMP3);
        
//#line 855
final int X10_TEMP6 =
          (0);
        
//#line 856
double X10_TEMP8 =
          (X10_TEMP6 -
             d);
        
//#line 857
if (X10_TEMP4) {
            
//#line 858
X10_TEMP8 =
              ((d));
        }
        
//#line 860
final double X10_TEMP9 =
          (X10_TEMP8);
        
//#line 861
return X10_TEMP9;
    }
    
    
//#line 863
public static double
                   Program_Linpack_matgen(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray b) {
        
//#line 864
final int X10_TEMP210 =
          (1325);
        
//#line 866
int init =
          (X10_TEMP210);
        
//#line 867
final double X10_TEMP213 =
          (0.0);
        
//#line 869
double norma =
          (X10_TEMP213);
        
//#line 870
/* template:forloop { */
        for (java.util.Iterator p__ = (a.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 871
final int X10_TEMP217 =
              (3125);
            
//#line 873
final int X10_TEMP4 =
              (X10_TEMP217);
            
//#line 874
final int X10_TEMP220 =
              (X10_TEMP4 *
                 init);
            
//#line 876
final int X10_TEMP5 =
              (X10_TEMP220);
            
//#line 877
final int X10_TEMP223 =
              (65536);
            
//#line 879
final int X10_TEMP6 =
              (X10_TEMP223);
            
//#line 880
final int X10_TEMP226 =
              (X10_TEMP5 %
                 X10_TEMP6);
            
//#line 882
final int X10_TEMP8 =
              (X10_TEMP226);
            
//#line 883
final int X10_TEMP229 =
              (X10_TEMP8);
            
//#line 885
init =
              ((X10_TEMP229));
            
//#line 886
final double X10_TEMP232 =
              (32768.0);
            
//#line 888
final double X10_TEMP9 =
              (X10_TEMP232);
            
//#line 889
final double X10_TEMP235 =
              (init -
                 X10_TEMP9);
            
//#line 891
final double X10_TEMP11 =
              (X10_TEMP235);
            
//#line 892
final double X10_TEMP238 =
              (16384.0);
            
//#line 894
final double X10_TEMP12 =
              (X10_TEMP238);
            
//#line 895
final double X10_TEMP241 =
              (X10_TEMP11 /
                 X10_TEMP12);
            
//#line 897
double val =
              (X10_TEMP241);
            
//#line 898
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 899
Program0.
                               Program_Linpack_write(
                               X10_TEMP0,
                               a,
                               p,
                               val);
            }
            	} catch (Throwable tmp32) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp32);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 901
final boolean X10_TEMP17 =
              (val >
                 norma);
            
//#line 902
double X10_TEMP20 =
              (norma);
            
//#line 903
if (X10_TEMP17) {
                
//#line 904
X10_TEMP20 =
                  ((val));
            }
            
//#line 906
final double X10_TEMP21 =
              (X10_TEMP20);
            
//#line 907
final double X10_TEMP253 =
              (X10_TEMP21);
            
//#line 909
norma =
              ((X10_TEMP253));
        }/* } */
        }
        /* } */
        
        
//#line 911
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 912
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
                
//#line 913
final x10.
                  lang.
                  dist X10_TEMP257 =
                  (x10.
                    lang.
                    dist)
                    ((b.
                        distribution));
                
//#line 915
final x10.
                  lang.
                  dist X10_TEMP23 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP257));
                
//#line 916
final x10.
                  lang.
                  place X10_TEMP24 =
                  (X10_TEMP23.
                     get(
                     p));
                
//#line 917
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP24)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 918
final double X10_TEMP263 =
                      (0.0);
                    
//#line 920
final double X10_TEMP28 =
                      (X10_TEMP263);
                    
//#line 921
final double X10_TEMP266 =
                      (X10_TEMP28);
                    
//#line 923
final double X10_TEMP29 =
                      (X10_TEMP266);
                    
//#line 924
final double X10_TEMP270 =
                      (X10_TEMP29);
                    
//#line 926
final double X10_TEMP273 =
                      (X10_TEMP270);
                    
//#line 927
/* template:array_set { */(b).set((X10_TEMP273),p)/* } */;
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp33) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp33);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 931
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 932
final int X10_TEMP275 =
              (0);
            
//#line 934
final int X10_TEMP33 =
              (X10_TEMP275);
            
//#line 935
final int X10_TEMP278 =
              (1);
            
//#line 937
final int X10_TEMP31 =
              (X10_TEMP278);
            
//#line 938
final int X10_TEMP281 =
              (n -
                 X10_TEMP31);
            
//#line 940
final int X10_TEMP34 =
              (X10_TEMP281);
            
//#line 941
final int X10_TEMP284 =
              (0);
            
//#line 943
final int X10_TEMP38 =
              (X10_TEMP284);
            
//#line 944
final int X10_TEMP287 =
              (1);
            
//#line 946
final int X10_TEMP36 =
              (X10_TEMP287);
            
//#line 947
final int X10_TEMP290 =
              (n -
                 X10_TEMP36);
            
//#line 949
final int X10_TEMP39 =
              (X10_TEMP290);
            
//#line 950
final x10.
              lang.
              region X10_TEMP297 =
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
                      X10_TEMP33,
                      X10_TEMP34),
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP38,
                      X10_TEMP39))));
            
//#line 952
final x10.
              lang.
              region X10_TEMP41 =
              (x10.
                lang.
                region)
                ((X10_TEMP297));
            
//#line 953
/* template:forloop-mult { */{
            x10.lang.region __var35__ = (x10.lang.region) X10_TEMP41;
            if (__var35__.size() > 0 && (__var35__ instanceof x10.array.MultiDimRegion || __var35__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var36__ = __var35__.rank(0).low(), __var37__ = __var35__.rank(0).high(); __var36__ <= __var37__; __var36__++)
            /* } */
            /* template:forloop-mult-each { */
            for (int __var38__ = __var35__.rank(1).low(), __var39__ = __var35__.rank(1).high(); __var38__ <= __var39__; __var38__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var36__;
            /* } */
            /* template:final-var-assign { */
            final int j = __var38__;
            /* } */
            /* } */
{
                
//#line 954
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 955
final x10.
                      lang.
                      dist X10_TEMP301 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 957
final x10.
                      lang.
                      dist X10_TEMP42 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP301));
                    
//#line 958
final x10.
                      lang.
                      place X10_TEMP46 =
                      (X10_TEMP42.
                         get(
                         i,
                         j));
                    
//#line 959
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP46)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 960
final int X10_TEMP308 =
                          (0);
                        
//#line 962
final int X10_TEMP53 =
                          (X10_TEMP308);
                        
//#line 963
final double X10_TEMP313 =
                          (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                        
//#line 965
final double X10_TEMP54 =
                          (X10_TEMP313);
                        
//#line 966
Program0.
                                       Program_Linpack_plusWrite(
                                       X10_TEMP0,
                                       b,
                                       X10_TEMP53,
                                       j,
                                       X10_TEMP54);
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
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var35__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var3__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var3__).get(1))/* } */;/* } */
{
                
//#line 954
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 955
final x10.
                      lang.
                      dist X10_TEMP301 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 957
final x10.
                      lang.
                      dist X10_TEMP42 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP301));
                    
//#line 958
final x10.
                      lang.
                      place X10_TEMP46 =
                      (X10_TEMP42.
                         get(
                         i,
                         j));
                    
//#line 959
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP46)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 960
final int X10_TEMP308 =
                          (0);
                        
//#line 962
final int X10_TEMP53 =
                          (X10_TEMP308);
                        
//#line 963
final double X10_TEMP313 =
                          (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                        
//#line 965
final double X10_TEMP54 =
                          (X10_TEMP313);
                        
//#line 966
Program0.
                                       Program_Linpack_plusWrite(
                                       X10_TEMP0,
                                       b,
                                       X10_TEMP53,
                                       j,
                                       X10_TEMP54);
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp41) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp41);
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
            
        }
        	} catch (Throwable tmp34) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp34);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 971
return norma;
    }
    
    
//#line 973
public static int
                   Program_Linpack_dgefa(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final x10.
                     lang.
                     IntReferenceArray ipvt) {
        
//#line 974
final int X10_TEMP210 =
          (0);
        
//#line 976
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 977
final int X10_TEMP213 =
          (X10_TEMP3);
        
//#line 979
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 980
final int X10_TEMP216 =
          (X10_TEMP4);
        
//#line 982
final int X10_TEMP219 =
          (X10_TEMP216);
        
//#line 983
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
          ((X10_TEMP219));
        
//#line 984
final int X10_TEMP221 =
          (1);
        
//#line 986
final int X10_TEMP5 =
          (X10_TEMP221);
        
//#line 987
final int X10_TEMP224 =
          (n -
             X10_TEMP5);
        
//#line 989
final int nm1 =
          (X10_TEMP224);
        
//#line 990
final int X10_TEMP227 =
          (0);
        
//#line 992
final int X10_TEMP7 =
          (X10_TEMP227);
        
//#line 993
final boolean X10_TEMP9 =
          (nm1 >=
             X10_TEMP7);
        
//#line 994
if (X10_TEMP9) {
            
//#line 995
final int X10_TEMP232 =
              (0);
            
//#line 997
final int X10_TEMP13 =
              (X10_TEMP232);
            
//#line 998
final int X10_TEMP235 =
              (1);
            
//#line 1000
final int X10_TEMP11 =
              (X10_TEMP235);
            
//#line 1001
final int X10_TEMP238 =
              (nm1 -
                 X10_TEMP11);
            
//#line 1003
final int X10_TEMP14 =
              (X10_TEMP238);
            
//#line 1004
final x10.
              lang.
              region X10_TEMP243 =
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
                      X10_TEMP13,
                      X10_TEMP14))));
            
//#line 1006
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP243));
            
//#line 1007
final x10.
              lang.
              place X10_TEMP246 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1009
final x10.
              lang.
              place X10_TEMP16 =
              (X10_TEMP246);
            
//#line 1010
final x10.
              lang.
              dist X10_TEMP249 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP16)));
            
//#line 1012
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP249));
            
//#line 1013
/* template:forloop-mult { */{
            x10.lang.region __var42__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var42__.size() > 0 && (__var42__ instanceof x10.array.MultiDimRegion || __var42__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var43__ = __var42__.rank(0).low(), __var44__ = __var42__.rank(0).high(); __var43__ <= __var44__; __var43__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var43__;
            /* } */
            /* } */
{
                
//#line 1014
final int X10_TEMP253 =
                  (n -
                     k);
                
//#line 1016
final int X10_TEMP24 =
                  (X10_TEMP253);
                
//#line 1017
final int X10_TEMP256 =
                  (1);
                
//#line 1019
final int X10_TEMP25 =
                  (X10_TEMP256);
                
//#line 1020
final int X10_TEMP265 =
                  (Program0.
                     Program_Linpack_idamax(
                     X10_TEMP0,
                     X10_TEMP24,
                     a,
                     k,
                     k,
                     X10_TEMP25));
                
//#line 1022
final int X10_TEMP26 =
                  (X10_TEMP265);
                
//#line 1023
final int X10_TEMP268 =
                  (X10_TEMP26 +
                     k);
                
//#line 1025
final int l =
                  (X10_TEMP268);
                
//#line 1026
final int X10_TEMP271 =
                  (l);
                
//#line 1028
final int X10_TEMP31 =
                  (X10_TEMP271);
                
//#line 1029
final int X10_TEMP275 =
                  (X10_TEMP31);
                
//#line 1031
final int X10_TEMP278 =
                  (X10_TEMP275);
                
//#line 1032
/* template:array_set { */(ipvt).set((X10_TEMP278),k)/* } */;
                
//#line 1033
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1034
final x10.
                      lang.
                      dist X10_TEMP280 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 1036
final x10.
                      lang.
                      dist X10_TEMP32 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP280));
                    
//#line 1037
final int X10_TEMP283 =
                      (1);
                    
//#line 1039
int X10_TEMP35 =
                      (X10_TEMP283);
                    
//#line 1040
final x10.
                      lang.
                      place X10_TEMP37 =
                      (X10_TEMP32.
                         get(
                         k,
                         X10_TEMP35));
                    
//#line 1041
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1042
final int X10_TEMP290 =
                          (1);
                        
//#line 1044
final int X10_TEMP38 =
                          (X10_TEMP290);
                        
//#line 1045
final int X10_TEMP293 =
                          (k +
                             X10_TEMP38);
                        
//#line 1047
final int kp1 =
                          (X10_TEMP293);
                        
//#line 1048
final double X10_TEMP298 =
                          (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                        
//#line 1050
final double X10_TEMP42 =
                          (X10_TEMP298);
                        
//#line 1051
final int X10_TEMP301 =
                          (0);
                        
//#line 1053
final int X10_TEMP43 =
                          (X10_TEMP301);
                        
//#line 1054
final boolean X10_TEMP45 =
                          (X10_TEMP42 !=
                             X10_TEMP43);
                        
//#line 1055
if (X10_TEMP45) {
                            
//#line 1056
final boolean X10_TEMP47 =
                              (l !=
                                 k);
                            
//#line 1057
if (X10_TEMP47) {
                                
//#line 1058
final boolean X10_TEMP49 =
                                  (l !=
                                     k);
                                
//#line 1059
if (X10_TEMP49) {
                                    
//#line 1060
final double X10_TEMP312 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                                    
//#line 1062
double t =
                                      (X10_TEMP312);
                                    
//#line 1063
final double X10_TEMP317 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                                    
//#line 1065
final double X10_TEMP59 =
                                      (X10_TEMP317);
                                    
//#line 1066
final double X10_TEMP320 =
                                      (X10_TEMP59);
                                    
//#line 1068
final double X10_TEMP60 =
                                      (X10_TEMP320);
                                    
//#line 1069
final double X10_TEMP325 =
                                      (X10_TEMP60);
                                    
//#line 1071
final double X10_TEMP328 =
                                      (X10_TEMP325);
                                    
//#line 1072
/* template:array_set { */(a).set((X10_TEMP328),/* Join: { */k,l/* } */)/* } */;
                                    
//#line 1073
final double X10_TEMP330 =
                                      (t);
                                    
//#line 1075
final double X10_TEMP65 =
                                      (X10_TEMP330);
                                    
//#line 1076
final double X10_TEMP335 =
                                      (X10_TEMP65);
                                    
//#line 1078
final double X10_TEMP338 =
                                      (X10_TEMP335);
                                    
//#line 1079
/* template:array_set { */(a).set((X10_TEMP338),/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 1082
final double X10_TEMP340 =
                              (1.0);
                            
//#line 1084
final double X10_TEMP66 =
                              (X10_TEMP340);
                            
//#line 1085
final int X10_TEMP67 =
                              (0);
                            
//#line 1086
final double X10_TEMP344 =
                              (X10_TEMP67 -
                                 X10_TEMP66);
                            
//#line 1088
final double X10_TEMP70 =
                              (X10_TEMP344);
                            
//#line 1089
final double X10_TEMP349 =
                              (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                            
//#line 1091
final double X10_TEMP71 =
                              (X10_TEMP349);
                            
//#line 1092
final double X10_TEMP352 =
                              (X10_TEMP70 /
                                 X10_TEMP71);
                            
//#line 1094
final double tx =
                              (X10_TEMP352);
                            
//#line 1095
final int X10_TEMP355 =
                              (kp1);
                            
//#line 1097
final int X10_TEMP74 =
                              (X10_TEMP355);
                            
//#line 1098
final int X10_TEMP358 =
                              (n -
                                 X10_TEMP74);
                            
//#line 1100
final int X10_TEMP81 =
                              (X10_TEMP358);
                            
//#line 1101
final int X10_TEMP361 =
                              (1);
                            
//#line 1103
final int X10_TEMP82 =
                              (X10_TEMP361);
                            
//#line 1104
Program0.
                                            Program_Linpack_dscal(
                                            X10_TEMP0,
                                            X10_TEMP81,
                                            tx,
                                            a,
                                            k,
                                            kp1,
                                            X10_TEMP82);
                            
//#line 1105
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1106
final int X10_TEMP371 =
                                  (1);
                                
//#line 1108
final int X10_TEMP84 =
                                  (X10_TEMP371);
                                
//#line 1109
final int X10_TEMP374 =
                                  (n -
                                     X10_TEMP84);
                                
//#line 1111
final int X10_TEMP86 =
                                  (X10_TEMP374);
                                
//#line 1112
final x10.
                                  lang.
                                  region X10_TEMP379 =
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
                                          kp1,
                                          X10_TEMP86))));
                                
//#line 1114
x10.
                                  lang.
                                  region temprkp1 =
                                  (x10.
                                    lang.
                                    region)
                                    ((X10_TEMP379));
                                
//#line 1115
final x10.
                                  lang.
                                  place X10_TEMP382 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 1117
final x10.
                                  lang.
                                  place X10_TEMP88 =
                                  (X10_TEMP382);
                                
//#line 1118
final x10.
                                  lang.
                                  dist X10_TEMP385 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((x10.
                                        lang.
                                        dist.
                                        factory.
                                        constant(
                                        temprkp1,
                                        X10_TEMP88)));
                                
//#line 1120
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP385));
                                
//#line 1121
/* template:forloop-mult { */{
                                x10.lang.region __var47__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var47__.size() > 0 && (__var47__ instanceof x10.array.MultiDimRegion || __var47__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var48__ = __var47__.rank(0).low(), __var49__ = __var47__.rank(0).high(); __var48__ <= __var49__; __var48__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var48__;
                                /* } */
                                /* } */
{
                                    
//#line 1122
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1124
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1125
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1126
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1127
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1129
double t =
                                          (X10_TEMP398);
                                        
//#line 1130
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1131
if (X10_TEMP100) {
                                            
//#line 1132
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1134
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1135
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1137
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1138
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1140
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1141
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1142
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1144
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1145
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1147
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1148
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1150
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1152
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1153
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1155
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1156
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1158
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1159
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1161
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1162
Program0.
                                                        Program_Linpack_daxpy(
                                                        X10_TEMP0,
                                                        X10_TEMP126,
                                                        t,
                                                        a,
                                                        k,
                                                        kp1,
                                                        X10_TEMP127,
                                                        a,
                                                        j,
                                                        kp1,
                                                        X10_TEMP128);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var5____ = (__var47__).iterator(); __var5____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var5__ = (x10.
                                  lang.
                                  point) __var5____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                                    
//#line 1122
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1124
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1125
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1126
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1127
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1129
double t =
                                          (X10_TEMP398);
                                        
//#line 1130
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1131
if (X10_TEMP100) {
                                            
//#line 1132
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1134
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1135
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1137
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1138
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1140
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1141
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1142
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1144
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1145
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1147
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1148
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1150
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1152
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1153
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1155
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1156
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1158
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1159
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1161
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1162
Program0.
                                                        Program_Linpack_daxpy(
                                                        X10_TEMP0,
                                                        X10_TEMP126,
                                                        t,
                                                        a,
                                                        k,
                                                        kp1,
                                                        X10_TEMP127,
                                                        a,
                                                        j,
                                                        kp1,
                                                        X10_TEMP128);
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
                            	} catch (Throwable tmp46) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp46);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 1168
final int X10_TEMP451 =
                              (k);
                            
//#line 1170
final int X10_TEMP131 =
                              (X10_TEMP451);
                            
//#line 1171
final int X10_TEMP454 =
                              (X10_TEMP131);
                            
//#line 1173
final int X10_TEMP457 =
                              (X10_TEMP454);
                            
//#line 1174
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
                              ((X10_TEMP457));
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp45) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp45);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var4____ = (__var42__).iterator(); __var4____.hasNext(); ) {
            	final  x10.
              lang.
              point __var4__ = (x10.
              lang.
              point) __var4____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                
//#line 1014
final int X10_TEMP253 =
                  (n -
                     k);
                
//#line 1016
final int X10_TEMP24 =
                  (X10_TEMP253);
                
//#line 1017
final int X10_TEMP256 =
                  (1);
                
//#line 1019
final int X10_TEMP25 =
                  (X10_TEMP256);
                
//#line 1020
final int X10_TEMP265 =
                  (Program0.
                     Program_Linpack_idamax(
                     X10_TEMP0,
                     X10_TEMP24,
                     a,
                     k,
                     k,
                     X10_TEMP25));
                
//#line 1022
final int X10_TEMP26 =
                  (X10_TEMP265);
                
//#line 1023
final int X10_TEMP268 =
                  (X10_TEMP26 +
                     k);
                
//#line 1025
final int l =
                  (X10_TEMP268);
                
//#line 1026
final int X10_TEMP271 =
                  (l);
                
//#line 1028
final int X10_TEMP31 =
                  (X10_TEMP271);
                
//#line 1029
final int X10_TEMP275 =
                  (X10_TEMP31);
                
//#line 1031
final int X10_TEMP278 =
                  (X10_TEMP275);
                
//#line 1032
/* template:array_set { */(ipvt).set((X10_TEMP278),k)/* } */;
                
//#line 1033
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1034
final x10.
                      lang.
                      dist X10_TEMP280 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 1036
final x10.
                      lang.
                      dist X10_TEMP32 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP280));
                    
//#line 1037
final int X10_TEMP283 =
                      (1);
                    
//#line 1039
int X10_TEMP35 =
                      (X10_TEMP283);
                    
//#line 1040
final x10.
                      lang.
                      place X10_TEMP37 =
                      (X10_TEMP32.
                         get(
                         k,
                         X10_TEMP35));
                    
//#line 1041
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1042
final int X10_TEMP290 =
                          (1);
                        
//#line 1044
final int X10_TEMP38 =
                          (X10_TEMP290);
                        
//#line 1045
final int X10_TEMP293 =
                          (k +
                             X10_TEMP38);
                        
//#line 1047
final int kp1 =
                          (X10_TEMP293);
                        
//#line 1048
final double X10_TEMP298 =
                          (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                        
//#line 1050
final double X10_TEMP42 =
                          (X10_TEMP298);
                        
//#line 1051
final int X10_TEMP301 =
                          (0);
                        
//#line 1053
final int X10_TEMP43 =
                          (X10_TEMP301);
                        
//#line 1054
final boolean X10_TEMP45 =
                          (X10_TEMP42 !=
                             X10_TEMP43);
                        
//#line 1055
if (X10_TEMP45) {
                            
//#line 1056
final boolean X10_TEMP47 =
                              (l !=
                                 k);
                            
//#line 1057
if (X10_TEMP47) {
                                
//#line 1058
final boolean X10_TEMP49 =
                                  (l !=
                                     k);
                                
//#line 1059
if (X10_TEMP49) {
                                    
//#line 1060
final double X10_TEMP312 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                                    
//#line 1062
double t =
                                      (X10_TEMP312);
                                    
//#line 1063
final double X10_TEMP317 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                                    
//#line 1065
final double X10_TEMP59 =
                                      (X10_TEMP317);
                                    
//#line 1066
final double X10_TEMP320 =
                                      (X10_TEMP59);
                                    
//#line 1068
final double X10_TEMP60 =
                                      (X10_TEMP320);
                                    
//#line 1069
final double X10_TEMP325 =
                                      (X10_TEMP60);
                                    
//#line 1071
final double X10_TEMP328 =
                                      (X10_TEMP325);
                                    
//#line 1072
/* template:array_set { */(a).set((X10_TEMP328),/* Join: { */k,l/* } */)/* } */;
                                    
//#line 1073
final double X10_TEMP330 =
                                      (t);
                                    
//#line 1075
final double X10_TEMP65 =
                                      (X10_TEMP330);
                                    
//#line 1076
final double X10_TEMP335 =
                                      (X10_TEMP65);
                                    
//#line 1078
final double X10_TEMP338 =
                                      (X10_TEMP335);
                                    
//#line 1079
/* template:array_set { */(a).set((X10_TEMP338),/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 1082
final double X10_TEMP340 =
                              (1.0);
                            
//#line 1084
final double X10_TEMP66 =
                              (X10_TEMP340);
                            
//#line 1085
final int X10_TEMP67 =
                              (0);
                            
//#line 1086
final double X10_TEMP344 =
                              (X10_TEMP67 -
                                 X10_TEMP66);
                            
//#line 1088
final double X10_TEMP70 =
                              (X10_TEMP344);
                            
//#line 1089
final double X10_TEMP349 =
                              (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                            
//#line 1091
final double X10_TEMP71 =
                              (X10_TEMP349);
                            
//#line 1092
final double X10_TEMP352 =
                              (X10_TEMP70 /
                                 X10_TEMP71);
                            
//#line 1094
final double tx =
                              (X10_TEMP352);
                            
//#line 1095
final int X10_TEMP355 =
                              (kp1);
                            
//#line 1097
final int X10_TEMP74 =
                              (X10_TEMP355);
                            
//#line 1098
final int X10_TEMP358 =
                              (n -
                                 X10_TEMP74);
                            
//#line 1100
final int X10_TEMP81 =
                              (X10_TEMP358);
                            
//#line 1101
final int X10_TEMP361 =
                              (1);
                            
//#line 1103
final int X10_TEMP82 =
                              (X10_TEMP361);
                            
//#line 1104
Program0.
                                            Program_Linpack_dscal(
                                            X10_TEMP0,
                                            X10_TEMP81,
                                            tx,
                                            a,
                                            k,
                                            kp1,
                                            X10_TEMP82);
                            
//#line 1105
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1106
final int X10_TEMP371 =
                                  (1);
                                
//#line 1108
final int X10_TEMP84 =
                                  (X10_TEMP371);
                                
//#line 1109
final int X10_TEMP374 =
                                  (n -
                                     X10_TEMP84);
                                
//#line 1111
final int X10_TEMP86 =
                                  (X10_TEMP374);
                                
//#line 1112
final x10.
                                  lang.
                                  region X10_TEMP379 =
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
                                          kp1,
                                          X10_TEMP86))));
                                
//#line 1114
x10.
                                  lang.
                                  region temprkp1 =
                                  (x10.
                                    lang.
                                    region)
                                    ((X10_TEMP379));
                                
//#line 1115
final x10.
                                  lang.
                                  place X10_TEMP382 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 1117
final x10.
                                  lang.
                                  place X10_TEMP88 =
                                  (X10_TEMP382);
                                
//#line 1118
final x10.
                                  lang.
                                  dist X10_TEMP385 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((x10.
                                        lang.
                                        dist.
                                        factory.
                                        constant(
                                        temprkp1,
                                        X10_TEMP88)));
                                
//#line 1120
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP385));
                                
//#line 1121
/* template:forloop-mult { */{
                                x10.lang.region __var52__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var52__.size() > 0 && (__var52__ instanceof x10.array.MultiDimRegion || __var52__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var53__ = __var52__.rank(0).low(), __var54__ = __var52__.rank(0).high(); __var53__ <= __var54__; __var53__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var53__;
                                /* } */
                                /* } */
{
                                    
//#line 1122
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1124
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1125
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1126
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1127
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1129
double t =
                                          (X10_TEMP398);
                                        
//#line 1130
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1131
if (X10_TEMP100) {
                                            
//#line 1132
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1134
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1135
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1137
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1138
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1140
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1141
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1142
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1144
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1145
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1147
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1148
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1150
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1152
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1153
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1155
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1156
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1158
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1159
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1161
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1162
Program0.
                                                        Program_Linpack_daxpy(
                                                        X10_TEMP0,
                                                        X10_TEMP126,
                                                        t,
                                                        a,
                                                        k,
                                                        kp1,
                                                        X10_TEMP127,
                                                        a,
                                                        j,
                                                        kp1,
                                                        X10_TEMP128);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var5____ = (__var52__).iterator(); __var5____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var5__ = (x10.
                                  lang.
                                  point) __var5____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                                    
//#line 1122
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1124
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1125
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1126
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1127
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1129
double t =
                                          (X10_TEMP398);
                                        
//#line 1130
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1131
if (X10_TEMP100) {
                                            
//#line 1132
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1134
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1135
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1137
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1138
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1140
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1141
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1142
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1144
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1145
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1147
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1148
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1150
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1152
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1153
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1155
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1156
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1158
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1159
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1161
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1162
Program0.
                                                        Program_Linpack_daxpy(
                                                        X10_TEMP0,
                                                        X10_TEMP126,
                                                        t,
                                                        a,
                                                        k,
                                                        kp1,
                                                        X10_TEMP127,
                                                        a,
                                                        j,
                                                        kp1,
                                                        X10_TEMP128);
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
                            	} catch (Throwable tmp51) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp51);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 1168
final int X10_TEMP451 =
                              (k);
                            
//#line 1170
final int X10_TEMP131 =
                              (X10_TEMP451);
                            
//#line 1171
final int X10_TEMP454 =
                              (X10_TEMP131);
                            
//#line 1173
final int X10_TEMP457 =
                              (X10_TEMP454);
                            
//#line 1174
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
                              ((X10_TEMP457));
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp50) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp50);
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
            
        }
        
//#line 1180
final int X10_TEMP459 =
          (1);
        
//#line 1182
final int X10_TEMP132 =
          (X10_TEMP459);
        
//#line 1183
final int X10_TEMP462 =
          (n -
             X10_TEMP132);
        
//#line 1185
final int X10_TEMP134 =
          (X10_TEMP462);
        
//#line 1186
final int X10_TEMP465 =
          (1);
        
//#line 1188
final int X10_TEMP135 =
          (X10_TEMP465);
        
//#line 1189
final int X10_TEMP468 =
          (n -
             X10_TEMP135);
        
//#line 1191
final int X10_TEMP138 =
          (X10_TEMP468);
        
//#line 1192
final int X10_TEMP471 =
          (X10_TEMP138);
        
//#line 1194
final int X10_TEMP139 =
          (X10_TEMP471);
        
//#line 1195
final int X10_TEMP475 =
          (X10_TEMP139);
        
//#line 1197
final int X10_TEMP478 =
          (X10_TEMP475);
        
//#line 1198
/* template:array_set { */(ipvt).set((X10_TEMP478),X10_TEMP134)/* } */;
        
//#line 1199
final int X10_TEMP480 =
          (1);
        
//#line 1201
final int X10_TEMP141 =
          (X10_TEMP480);
        
//#line 1202
final int X10_TEMP483 =
          (n -
             X10_TEMP141);
        
//#line 1204
final int X10_TEMP145 =
          (X10_TEMP483);
        
//#line 1205
final int X10_TEMP486 =
          (1);
        
//#line 1207
final int X10_TEMP143 =
          (X10_TEMP486);
        
//#line 1208
final int X10_TEMP489 =
          (n -
             X10_TEMP143);
        
//#line 1210
final int X10_TEMP146 =
          (X10_TEMP489);
        
//#line 1211
final double X10_TEMP496 =
          (Program0.
             Program_Linpack_read(
             X10_TEMP0,
             a,
             X10_TEMP145,
             X10_TEMP146));
        
//#line 1213
double val =
          (X10_TEMP496);
        
//#line 1214
final int X10_TEMP499 =
          (0);
        
//#line 1216
final int X10_TEMP148 =
          (X10_TEMP499);
        
//#line 1217
final boolean X10_TEMP150 =
          (val ==
             X10_TEMP148);
        
//#line 1218
if (X10_TEMP150) {
            
//#line 1219
final int X10_TEMP504 =
              (1);
            
//#line 1221
final int X10_TEMP151 =
              (X10_TEMP504);
            
//#line 1222
final int X10_TEMP507 =
              (n -
                 X10_TEMP151);
            
//#line 1224
final int X10_TEMP154 =
              (X10_TEMP507);
            
//#line 1225
final int X10_TEMP510 =
              (X10_TEMP154);
            
//#line 1227
final int X10_TEMP155 =
              (X10_TEMP510);
            
//#line 1228
final int X10_TEMP513 =
              (X10_TEMP155);
            
//#line 1230
final int X10_TEMP516 =
              (X10_TEMP513);
            
//#line 1231
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.info =
              ((X10_TEMP516));
        }
        
//#line 1233
final int X10_TEMP518 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa);
        
//#line 1235
final int X10_TEMP157 =
          (X10_TEMP518);
        
//#line 1236
return X10_TEMP157;
    }
    
    
//#line 1238
public static void
                    Program_Linpack_dgesl(
                    final Linpack X10_TEMP0,
                    final x10.
                      lang.
                      DoubleReferenceArray a,
                    final int lda,
                    final int n,
                    final x10.
                      lang.
                      IntReferenceArray ipvt,
                    final x10.
                      lang.
                      DoubleReferenceArray b,
                    final int job) {
        
//#line 1239
final int X10_TEMP210 =
          (1);
        
//#line 1241
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 1242
final int X10_TEMP213 =
          (n -
             X10_TEMP1);
        
//#line 1244
final int nm1 =
          (X10_TEMP213);
        
//#line 1245
final int X10_TEMP216 =
          (0);
        
//#line 1247
final int X10_TEMP3 =
          (X10_TEMP216);
        
//#line 1248
final boolean X10_TEMP5 =
          (job ==
             X10_TEMP3);
        
//#line 1249
if (X10_TEMP5) {
            
//#line 1250
final int X10_TEMP221 =
              (1);
            
//#line 1252
final int X10_TEMP6 =
              (X10_TEMP221);
            
//#line 1253
final boolean X10_TEMP8 =
              (nm1 >=
                 X10_TEMP6);
            
//#line 1254
if (X10_TEMP8) {
                
//#line 1255
final int X10_TEMP226 =
                  (0);
                
//#line 1257
final int X10_TEMP12 =
                  (X10_TEMP226);
                
//#line 1258
final int X10_TEMP229 =
                  (1);
                
//#line 1260
final int X10_TEMP10 =
                  (X10_TEMP229);
                
//#line 1261
final int X10_TEMP232 =
                  (nm1 -
                     X10_TEMP10);
                
//#line 1263
final int X10_TEMP13 =
                  (X10_TEMP232);
                
//#line 1264
final x10.
                  lang.
                  region X10_TEMP237 =
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
                
//#line 1266
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP237));
                
//#line 1267
final x10.
                  lang.
                  place X10_TEMP240 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1269
final x10.
                  lang.
                  place X10_TEMP15 =
                  (X10_TEMP240);
                
//#line 1270
final x10.
                  lang.
                  dist X10_TEMP243 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP15)));
                
//#line 1272
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP243));
                
//#line 1273
/* template:forloop-mult { */{
                x10.lang.region __var55__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var55__.size() > 0 && (__var55__ instanceof x10.array.MultiDimRegion || __var55__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var56__ = __var55__.rank(0).low(), __var57__ = __var55__.rank(0).high(); __var56__ <= __var57__; __var56__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int k = __var56__;
                /* } */
                /* } */
{
                    
//#line 1274
final int X10_TEMP248 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1276
final int l =
                      (X10_TEMP248);
                    
//#line 1277
final int X10_TEMP251 =
                      (0);
                    
//#line 1279
final int X10_TEMP22 =
                      (X10_TEMP251);
                    
//#line 1280
final double X10_TEMP256 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP22,l/* } */))/* } */);
                    
//#line 1282
double t =
                      (X10_TEMP256);
                    
//#line 1283
final boolean X10_TEMP25 =
                      (l !=
                         k);
                    
//#line 1284
if (X10_TEMP25) {
                        
//#line 1285
final int X10_TEMP261 =
                          (0);
                        
//#line 1287
final int X10_TEMP28 =
                          (X10_TEMP261);
                        
//#line 1288
final int X10_TEMP264 =
                          (0);
                        
//#line 1290
final int X10_TEMP31 =
                          (X10_TEMP264);
                        
//#line 1291
final double X10_TEMP269 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP31,k/* } */))/* } */);
                        
//#line 1293
final double X10_TEMP34 =
                          (X10_TEMP269);
                        
//#line 1294
final double X10_TEMP272 =
                          (X10_TEMP34);
                        
//#line 1296
final double X10_TEMP35 =
                          (X10_TEMP272);
                        
//#line 1297
final double X10_TEMP277 =
                          (X10_TEMP35);
                        
//#line 1299
final double X10_TEMP280 =
                          (X10_TEMP277);
                        
//#line 1300
/* template:array_set { */(b).set((X10_TEMP280),/* Join: { */X10_TEMP28,l/* } */)/* } */;
                        
//#line 1301
final int X10_TEMP282 =
                          (0);
                        
//#line 1303
final int X10_TEMP38 =
                          (X10_TEMP282);
                        
//#line 1304
final double X10_TEMP285 =
                          (t);
                        
//#line 1306
final double X10_TEMP41 =
                          (X10_TEMP285);
                        
//#line 1307
final double X10_TEMP290 =
                          (X10_TEMP41);
                        
//#line 1309
final double X10_TEMP293 =
                          (X10_TEMP290);
                        
//#line 1310
/* template:array_set { */(b).set((X10_TEMP293),/* Join: { */X10_TEMP38,k/* } */)/* } */;
                    }
                    
//#line 1312
final int X10_TEMP295 =
                      (1);
                    
//#line 1314
final int X10_TEMP42 =
                      (X10_TEMP295);
                    
//#line 1315
final int X10_TEMP298 =
                      (k +
                         X10_TEMP42);
                    
//#line 1317
final int kp1 =
                      (X10_TEMP298);
                    
//#line 1318
final int X10_TEMP301 =
                      (kp1);
                    
//#line 1320
final int X10_TEMP45 =
                      (X10_TEMP301);
                    
//#line 1321
final int X10_TEMP304 =
                      (n -
                         X10_TEMP45);
                    
//#line 1323
final int X10_TEMP56 =
                      (X10_TEMP304);
                    
//#line 1324
final int X10_TEMP307 =
                      (1);
                    
//#line 1326
final int X10_TEMP57 =
                      (X10_TEMP307);
                    
//#line 1327
final int X10_TEMP310 =
                      (0);
                    
//#line 1329
final int X10_TEMP58 =
                      (X10_TEMP310);
                    
//#line 1330
final int X10_TEMP313 =
                      (1);
                    
//#line 1332
final int X10_TEMP59 =
                      (X10_TEMP313);
                    
//#line 1333
Program0.
                                    Program_Linpack_daxpy(
                                    X10_TEMP0,
                                    X10_TEMP56,
                                    t,
                                    a,
                                    k,
                                    kp1,
                                    X10_TEMP57,
                                    b,
                                    X10_TEMP58,
                                    kp1,
                                    X10_TEMP59);
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var6____ = (__var55__).iterator(); __var6____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var6__ = (x10.
                  lang.
                  point) __var6____.next();
                	/* Join: { *//* Join: { */final int k =
                  /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                    
//#line 1274
final int X10_TEMP248 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1276
final int l =
                      (X10_TEMP248);
                    
//#line 1277
final int X10_TEMP251 =
                      (0);
                    
//#line 1279
final int X10_TEMP22 =
                      (X10_TEMP251);
                    
//#line 1280
final double X10_TEMP256 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP22,l/* } */))/* } */);
                    
//#line 1282
double t =
                      (X10_TEMP256);
                    
//#line 1283
final boolean X10_TEMP25 =
                      (l !=
                         k);
                    
//#line 1284
if (X10_TEMP25) {
                        
//#line 1285
final int X10_TEMP261 =
                          (0);
                        
//#line 1287
final int X10_TEMP28 =
                          (X10_TEMP261);
                        
//#line 1288
final int X10_TEMP264 =
                          (0);
                        
//#line 1290
final int X10_TEMP31 =
                          (X10_TEMP264);
                        
//#line 1291
final double X10_TEMP269 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP31,k/* } */))/* } */);
                        
//#line 1293
final double X10_TEMP34 =
                          (X10_TEMP269);
                        
//#line 1294
final double X10_TEMP272 =
                          (X10_TEMP34);
                        
//#line 1296
final double X10_TEMP35 =
                          (X10_TEMP272);
                        
//#line 1297
final double X10_TEMP277 =
                          (X10_TEMP35);
                        
//#line 1299
final double X10_TEMP280 =
                          (X10_TEMP277);
                        
//#line 1300
/* template:array_set { */(b).set((X10_TEMP280),/* Join: { */X10_TEMP28,l/* } */)/* } */;
                        
//#line 1301
final int X10_TEMP282 =
                          (0);
                        
//#line 1303
final int X10_TEMP38 =
                          (X10_TEMP282);
                        
//#line 1304
final double X10_TEMP285 =
                          (t);
                        
//#line 1306
final double X10_TEMP41 =
                          (X10_TEMP285);
                        
//#line 1307
final double X10_TEMP290 =
                          (X10_TEMP41);
                        
//#line 1309
final double X10_TEMP293 =
                          (X10_TEMP290);
                        
//#line 1310
/* template:array_set { */(b).set((X10_TEMP293),/* Join: { */X10_TEMP38,k/* } */)/* } */;
                    }
                    
//#line 1312
final int X10_TEMP295 =
                      (1);
                    
//#line 1314
final int X10_TEMP42 =
                      (X10_TEMP295);
                    
//#line 1315
final int X10_TEMP298 =
                      (k +
                         X10_TEMP42);
                    
//#line 1317
final int kp1 =
                      (X10_TEMP298);
                    
//#line 1318
final int X10_TEMP301 =
                      (kp1);
                    
//#line 1320
final int X10_TEMP45 =
                      (X10_TEMP301);
                    
//#line 1321
final int X10_TEMP304 =
                      (n -
                         X10_TEMP45);
                    
//#line 1323
final int X10_TEMP56 =
                      (X10_TEMP304);
                    
//#line 1324
final int X10_TEMP307 =
                      (1);
                    
//#line 1326
final int X10_TEMP57 =
                      (X10_TEMP307);
                    
//#line 1327
final int X10_TEMP310 =
                      (0);
                    
//#line 1329
final int X10_TEMP58 =
                      (X10_TEMP310);
                    
//#line 1330
final int X10_TEMP313 =
                      (1);
                    
//#line 1332
final int X10_TEMP59 =
                      (X10_TEMP313);
                    
//#line 1333
Program0.
                                    Program_Linpack_daxpy(
                                    X10_TEMP0,
                                    X10_TEMP56,
                                    t,
                                    a,
                                    k,
                                    kp1,
                                    X10_TEMP57,
                                    b,
                                    X10_TEMP58,
                                    kp1,
                                    X10_TEMP59);
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
            
//#line 1336
final int X10_TEMP327 =
              (0);
            
//#line 1338
final int X10_TEMP63 =
              (X10_TEMP327);
            
//#line 1339
final int X10_TEMP330 =
              (1);
            
//#line 1341
final int X10_TEMP61 =
              (X10_TEMP330);
            
//#line 1342
final int X10_TEMP333 =
              (n -
                 X10_TEMP61);
            
//#line 1344
final int X10_TEMP64 =
              (X10_TEMP333);
            
//#line 1345
final x10.
              lang.
              region X10_TEMP338 =
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
                      X10_TEMP63,
                      X10_TEMP64))));
            
//#line 1347
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP338));
            
//#line 1348
final x10.
              lang.
              place X10_TEMP341 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1350
final x10.
              lang.
              place X10_TEMP66 =
              (X10_TEMP341);
            
//#line 1351
final x10.
              lang.
              dist X10_TEMP344 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP66)));
            
//#line 1353
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP344));
            
//#line 1354
/* template:forloop-mult { */{
            x10.lang.region __var58__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var58__.size() > 0 && (__var58__ instanceof x10.array.MultiDimRegion || __var58__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var59__ = __var58__.rank(0).low(), __var60__ = __var58__.rank(0).high(); __var59__ <= __var60__; __var59__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int kb = __var59__;
            /* } */
            /* } */
{
                
//#line 1355
final int X10_TEMP348 =
                  (1);
                
//#line 1357
final int X10_TEMP69 =
                  (X10_TEMP348);
                
//#line 1358
final int X10_TEMP351 =
                  (kb +
                     X10_TEMP69);
                
//#line 1360
final int X10_TEMP71 =
                  (X10_TEMP351);
                
//#line 1361
final int X10_TEMP354 =
                  (n -
                     X10_TEMP71);
                
//#line 1363
final int k =
                  (X10_TEMP354);
                
//#line 1364
final int X10_TEMP357 =
                  (0);
                
//#line 1366
final int X10_TEMP75 =
                  (X10_TEMP357);
                
//#line 1367
final double X10_TEMP362 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP75,k/* } */))/* } */);
                
//#line 1369
final double X10_TEMP80 =
                  (X10_TEMP362);
                
//#line 1370
final double X10_TEMP369 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     a,
                     k,
                     k));
                
//#line 1372
final double X10_TEMP81 =
                  (X10_TEMP369);
                
//#line 1373
final double X10_TEMP372 =
                  (X10_TEMP80 /
                     X10_TEMP81);
                
//#line 1375
final double X10_TEMP82 =
                  (X10_TEMP372);
                
//#line 1376
final double X10_TEMP377 =
                  (X10_TEMP82);
                
//#line 1378
final double X10_TEMP380 =
                  (X10_TEMP377);
                
//#line 1379
/* template:array_set { */(b).set((X10_TEMP380),/* Join: { */X10_TEMP75,k/* } */)/* } */;
                
//#line 1380
final int X10_TEMP382 =
                  (0);
                
//#line 1382
final int X10_TEMP85 =
                  (X10_TEMP382);
                
//#line 1383
final double X10_TEMP387 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP85,k/* } */))/* } */);
                
//#line 1385
final double X10_TEMP86 =
                  (X10_TEMP387);
                
//#line 1386
final int X10_TEMP87 =
                  (0);
                
//#line 1387
final double X10_TEMP391 =
                  (X10_TEMP87 -
                     X10_TEMP86);
                
//#line 1389
double t =
                  (X10_TEMP391);
                
//#line 1390
final int X10_TEMP394 =
                  (0);
                
//#line 1392
final int X10_TEMP99 =
                  (X10_TEMP394);
                
//#line 1393
final int X10_TEMP397 =
                  (1);
                
//#line 1395
final int X10_TEMP100 =
                  (X10_TEMP397);
                
//#line 1396
final int X10_TEMP400 =
                  (0);
                
//#line 1398
final int X10_TEMP101 =
                  (X10_TEMP400);
                
//#line 1399
final int X10_TEMP403 =
                  (0);
                
//#line 1401
final int X10_TEMP102 =
                  (X10_TEMP403);
                
//#line 1402
final int X10_TEMP406 =
                  (1);
                
//#line 1404
final int X10_TEMP103 =
                  (X10_TEMP406);
                
//#line 1405
Program0.
                                Program_Linpack_daxpy(
                                X10_TEMP0,
                                k,
                                t,
                                a,
                                k,
                                X10_TEMP99,
                                X10_TEMP100,
                                b,
                                X10_TEMP101,
                                X10_TEMP102,
                                X10_TEMP103);
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var7____ = (__var58__).iterator(); __var7____.hasNext(); ) {
            	final  x10.
              lang.
              point __var7__ = (x10.
              lang.
              point) __var7____.next();
            	/* Join: { *//* Join: { */final int kb =
              /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                
//#line 1355
final int X10_TEMP348 =
                  (1);
                
//#line 1357
final int X10_TEMP69 =
                  (X10_TEMP348);
                
//#line 1358
final int X10_TEMP351 =
                  (kb +
                     X10_TEMP69);
                
//#line 1360
final int X10_TEMP71 =
                  (X10_TEMP351);
                
//#line 1361
final int X10_TEMP354 =
                  (n -
                     X10_TEMP71);
                
//#line 1363
final int k =
                  (X10_TEMP354);
                
//#line 1364
final int X10_TEMP357 =
                  (0);
                
//#line 1366
final int X10_TEMP75 =
                  (X10_TEMP357);
                
//#line 1367
final double X10_TEMP362 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP75,k/* } */))/* } */);
                
//#line 1369
final double X10_TEMP80 =
                  (X10_TEMP362);
                
//#line 1370
final double X10_TEMP369 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     a,
                     k,
                     k));
                
//#line 1372
final double X10_TEMP81 =
                  (X10_TEMP369);
                
//#line 1373
final double X10_TEMP372 =
                  (X10_TEMP80 /
                     X10_TEMP81);
                
//#line 1375
final double X10_TEMP82 =
                  (X10_TEMP372);
                
//#line 1376
final double X10_TEMP377 =
                  (X10_TEMP82);
                
//#line 1378
final double X10_TEMP380 =
                  (X10_TEMP377);
                
//#line 1379
/* template:array_set { */(b).set((X10_TEMP380),/* Join: { */X10_TEMP75,k/* } */)/* } */;
                
//#line 1380
final int X10_TEMP382 =
                  (0);
                
//#line 1382
final int X10_TEMP85 =
                  (X10_TEMP382);
                
//#line 1383
final double X10_TEMP387 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP85,k/* } */))/* } */);
                
//#line 1385
final double X10_TEMP86 =
                  (X10_TEMP387);
                
//#line 1386
final int X10_TEMP87 =
                  (0);
                
//#line 1387
final double X10_TEMP391 =
                  (X10_TEMP87 -
                     X10_TEMP86);
                
//#line 1389
double t =
                  (X10_TEMP391);
                
//#line 1390
final int X10_TEMP394 =
                  (0);
                
//#line 1392
final int X10_TEMP99 =
                  (X10_TEMP394);
                
//#line 1393
final int X10_TEMP397 =
                  (1);
                
//#line 1395
final int X10_TEMP100 =
                  (X10_TEMP397);
                
//#line 1396
final int X10_TEMP400 =
                  (0);
                
//#line 1398
final int X10_TEMP101 =
                  (X10_TEMP400);
                
//#line 1399
final int X10_TEMP403 =
                  (0);
                
//#line 1401
final int X10_TEMP102 =
                  (X10_TEMP403);
                
//#line 1402
final int X10_TEMP406 =
                  (1);
                
//#line 1404
final int X10_TEMP103 =
                  (X10_TEMP406);
                
//#line 1405
Program0.
                                Program_Linpack_daxpy(
                                X10_TEMP0,
                                k,
                                t,
                                a,
                                k,
                                X10_TEMP99,
                                X10_TEMP100,
                                b,
                                X10_TEMP101,
                                X10_TEMP102,
                                X10_TEMP103);
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        } else {
            
//#line 1409
final int X10_TEMP420 =
              (0);
            
//#line 1411
final int X10_TEMP107 =
              (X10_TEMP420);
            
//#line 1412
final int X10_TEMP423 =
              (1);
            
//#line 1414
final int X10_TEMP105 =
              (X10_TEMP423);
            
//#line 1415
final int X10_TEMP426 =
              (n -
                 X10_TEMP105);
            
//#line 1417
final int X10_TEMP108 =
              (X10_TEMP426);
            
//#line 1418
final x10.
              lang.
              region X10_TEMP431 =
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
                      X10_TEMP107,
                      X10_TEMP108))));
            
//#line 1420
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP431));
            
//#line 1421
final x10.
              lang.
              place X10_TEMP434 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1423
final x10.
              lang.
              place X10_TEMP110 =
              (X10_TEMP434);
            
//#line 1424
final x10.
              lang.
              dist X10_TEMP437 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP110)));
            
//#line 1426
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP437));
            
//#line 1427
/* template:forloop-mult { */{
            x10.lang.region __var61__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var61__.size() > 0 && (__var61__ instanceof x10.array.MultiDimRegion || __var61__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var62__ = __var61__.rank(0).low(), __var63__ = __var61__.rank(0).high(); __var62__ <= __var63__; __var62__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var62__;
            /* } */
            /* } */
{
                
//#line 1428
final int X10_TEMP441 =
                  (0);
                
//#line 1430
final int X10_TEMP122 =
                  (X10_TEMP441);
                
//#line 1431
final int X10_TEMP444 =
                  (1);
                
//#line 1433
final int X10_TEMP123 =
                  (X10_TEMP444);
                
//#line 1434
final int X10_TEMP447 =
                  (0);
                
//#line 1436
final int X10_TEMP124 =
                  (X10_TEMP447);
                
//#line 1437
final int X10_TEMP450 =
                  (0);
                
//#line 1439
final int X10_TEMP125 =
                  (X10_TEMP450);
                
//#line 1440
final int X10_TEMP453 =
                  (1);
                
//#line 1442
final int X10_TEMP126 =
                  (X10_TEMP453);
                
//#line 1443
final double X10_TEMP466 =
                  (Program0.
                     Program_Linpack_ddot(
                     X10_TEMP0,
                     k,
                     a,
                     k,
                     X10_TEMP122,
                     X10_TEMP123,
                     b,
                     X10_TEMP124,
                     X10_TEMP125,
                     X10_TEMP126));
                
//#line 1445
double t =
                  (X10_TEMP466);
                
//#line 1446
final int X10_TEMP469 =
                  (0);
                
//#line 1448
final int X10_TEMP130 =
                  (X10_TEMP469);
                
//#line 1449
final int X10_TEMP472 =
                  (0);
                
//#line 1451
final int X10_TEMP133 =
                  (X10_TEMP472);
                
//#line 1452
final double X10_TEMP477 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP133,k/* } */))/* } */);
                
//#line 1454
final double X10_TEMP134 =
                  (X10_TEMP477);
                
//#line 1455
final double X10_TEMP480 =
                  (X10_TEMP134 -
                     t);
                
//#line 1457
final double X10_TEMP136 =
                  (X10_TEMP480);
                
//#line 1458
final double X10_TEMP485 =
                  (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                
//#line 1460
final double X10_TEMP139 =
                  (X10_TEMP485);
                
//#line 1461
final double X10_TEMP488 =
                  (X10_TEMP136 /
                     X10_TEMP139);
                
//#line 1463
final double X10_TEMP142 =
                  (X10_TEMP488);
                
//#line 1464
final double X10_TEMP491 =
                  (X10_TEMP142);
                
//#line 1466
final double X10_TEMP143 =
                  (X10_TEMP491);
                
//#line 1467
final double X10_TEMP496 =
                  (X10_TEMP143);
                
//#line 1469
final double X10_TEMP499 =
                  (X10_TEMP496);
                
//#line 1470
/* template:array_set { */(b).set((X10_TEMP499),/* Join: { */X10_TEMP130,k/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var8____ = (__var61__).iterator(); __var8____.hasNext(); ) {
            	final  x10.
              lang.
              point __var8__ = (x10.
              lang.
              point) __var8____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                
//#line 1428
final int X10_TEMP441 =
                  (0);
                
//#line 1430
final int X10_TEMP122 =
                  (X10_TEMP441);
                
//#line 1431
final int X10_TEMP444 =
                  (1);
                
//#line 1433
final int X10_TEMP123 =
                  (X10_TEMP444);
                
//#line 1434
final int X10_TEMP447 =
                  (0);
                
//#line 1436
final int X10_TEMP124 =
                  (X10_TEMP447);
                
//#line 1437
final int X10_TEMP450 =
                  (0);
                
//#line 1439
final int X10_TEMP125 =
                  (X10_TEMP450);
                
//#line 1440
final int X10_TEMP453 =
                  (1);
                
//#line 1442
final int X10_TEMP126 =
                  (X10_TEMP453);
                
//#line 1443
final double X10_TEMP466 =
                  (Program0.
                     Program_Linpack_ddot(
                     X10_TEMP0,
                     k,
                     a,
                     k,
                     X10_TEMP122,
                     X10_TEMP123,
                     b,
                     X10_TEMP124,
                     X10_TEMP125,
                     X10_TEMP126));
                
//#line 1445
double t =
                  (X10_TEMP466);
                
//#line 1446
final int X10_TEMP469 =
                  (0);
                
//#line 1448
final int X10_TEMP130 =
                  (X10_TEMP469);
                
//#line 1449
final int X10_TEMP472 =
                  (0);
                
//#line 1451
final int X10_TEMP133 =
                  (X10_TEMP472);
                
//#line 1452
final double X10_TEMP477 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP133,k/* } */))/* } */);
                
//#line 1454
final double X10_TEMP134 =
                  (X10_TEMP477);
                
//#line 1455
final double X10_TEMP480 =
                  (X10_TEMP134 -
                     t);
                
//#line 1457
final double X10_TEMP136 =
                  (X10_TEMP480);
                
//#line 1458
final double X10_TEMP485 =
                  (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                
//#line 1460
final double X10_TEMP139 =
                  (X10_TEMP485);
                
//#line 1461
final double X10_TEMP488 =
                  (X10_TEMP136 /
                     X10_TEMP139);
                
//#line 1463
final double X10_TEMP142 =
                  (X10_TEMP488);
                
//#line 1464
final double X10_TEMP491 =
                  (X10_TEMP142);
                
//#line 1466
final double X10_TEMP143 =
                  (X10_TEMP491);
                
//#line 1467
final double X10_TEMP496 =
                  (X10_TEMP143);
                
//#line 1469
final double X10_TEMP499 =
                  (X10_TEMP496);
                
//#line 1470
/* template:array_set { */(b).set((X10_TEMP499),/* Join: { */X10_TEMP130,k/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 1472
final int X10_TEMP501 =
              (1);
            
//#line 1474
final int X10_TEMP144 =
              (X10_TEMP501);
            
//#line 1475
final boolean X10_TEMP146 =
              (nm1 >=
                 X10_TEMP144);
            
//#line 1476
if (X10_TEMP146) {
                
//#line 1477
final int X10_TEMP506 =
                  (1);
                
//#line 1479
final int X10_TEMP150 =
                  (X10_TEMP506);
                
//#line 1480
final int X10_TEMP509 =
                  (1);
                
//#line 1482
final int X10_TEMP148 =
                  (X10_TEMP509);
                
//#line 1483
final int X10_TEMP512 =
                  (nm1 -
                     X10_TEMP148);
                
//#line 1485
final int X10_TEMP151 =
                  (X10_TEMP512);
                
//#line 1486
final x10.
                  lang.
                  region X10_TEMP517 =
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
                          X10_TEMP150,
                          X10_TEMP151))));
                
//#line 1488
x10.
                  lang.
                  region temprnm1 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP517));
                
//#line 1489
final x10.
                  lang.
                  place X10_TEMP520 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1491
final x10.
                  lang.
                  place X10_TEMP153 =
                  (X10_TEMP520);
                
//#line 1492
final x10.
                  lang.
                  dist X10_TEMP523 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        temprnm1,
                        X10_TEMP153)));
                
//#line 1494
x10.
                  lang.
                  dist temprnm1Dist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP523));
                
//#line 1495
/* template:forloop-mult { */{
                x10.lang.region __var64__ = (x10.lang.region) temprnm1Dist.
                                                                region;
                if (__var64__.size() > 0 && (__var64__ instanceof x10.array.MultiDimRegion || __var64__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var65__ = __var64__.rank(0).low(), __var66__ = __var64__.rank(0).high(); __var65__ <= __var66__; __var65__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int kb = __var65__;
                /* } */
                /* } */
{
                    
//#line 1496
final int X10_TEMP527 =
                      (1);
                    
//#line 1498
final int X10_TEMP156 =
                      (X10_TEMP527);
                    
//#line 1499
final int X10_TEMP530 =
                      (kb +
                         X10_TEMP156);
                    
//#line 1501
final int X10_TEMP158 =
                      (X10_TEMP530);
                    
//#line 1502
final int X10_TEMP533 =
                      (n -
                         X10_TEMP158);
                    
//#line 1504
final int k =
                      (X10_TEMP533);
                    
//#line 1505
final int X10_TEMP536 =
                      (1);
                    
//#line 1507
final int X10_TEMP160 =
                      (X10_TEMP536);
                    
//#line 1508
final int X10_TEMP539 =
                      (k +
                         X10_TEMP160);
                    
//#line 1510
final int kp1 =
                      (X10_TEMP539);
                    
//#line 1511
final int X10_TEMP542 =
                      (0);
                    
//#line 1513
final int X10_TEMP164 =
                      (X10_TEMP542);
                    
//#line 1514
final int X10_TEMP545 =
                      (kp1);
                    
//#line 1516
final int X10_TEMP166 =
                      (X10_TEMP545);
                    
//#line 1517
final int X10_TEMP548 =
                      (n -
                         X10_TEMP166);
                    
//#line 1519
final int X10_TEMP176 =
                      (X10_TEMP548);
                    
//#line 1520
final int X10_TEMP551 =
                      (1);
                    
//#line 1522
final int X10_TEMP177 =
                      (X10_TEMP551);
                    
//#line 1523
final int X10_TEMP554 =
                      (0);
                    
//#line 1525
final int X10_TEMP178 =
                      (X10_TEMP554);
                    
//#line 1526
final int X10_TEMP557 =
                      (1);
                    
//#line 1528
final int X10_TEMP179 =
                      (X10_TEMP557);
                    
//#line 1529
final double X10_TEMP562 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP164,k/* } */))/* } */);
                    
//#line 1531
final double X10_TEMP181 =
                      (X10_TEMP562);
                    
//#line 1532
final double X10_TEMP575 =
                      (Program0.
                         Program_Linpack_ddot(
                         X10_TEMP0,
                         X10_TEMP176,
                         a,
                         k,
                         kp1,
                         X10_TEMP177,
                         b,
                         X10_TEMP178,
                         kp1,
                         X10_TEMP179));
                    
//#line 1534
final double X10_TEMP182 =
                      (X10_TEMP575);
                    
//#line 1535
final double X10_TEMP578 =
                      (X10_TEMP181 +
                         X10_TEMP182);
                    
//#line 1537
final double X10_TEMP183 =
                      (X10_TEMP578);
                    
//#line 1538
final double X10_TEMP583 =
                      (X10_TEMP183);
                    
//#line 1540
final double X10_TEMP586 =
                      (X10_TEMP583);
                    
//#line 1541
/* template:array_set { */(b).set((X10_TEMP586),/* Join: { */X10_TEMP164,k/* } */)/* } */;
                    
//#line 1542
final int X10_TEMP589 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1544
final int l =
                      (X10_TEMP589);
                    
//#line 1545
final boolean X10_TEMP187 =
                      (l !=
                         k);
                    
//#line 1546
if (X10_TEMP187) {
                        
//#line 1547
final int X10_TEMP594 =
                          (0);
                        
//#line 1549
final int X10_TEMP190 =
                          (X10_TEMP594);
                        
//#line 1550
final double X10_TEMP599 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP190,l/* } */))/* } */);
                        
//#line 1552
double t =
                          (X10_TEMP599);
                        
//#line 1553
final int X10_TEMP602 =
                          (0);
                        
//#line 1555
final int X10_TEMP194 =
                          (X10_TEMP602);
                        
//#line 1556
final int X10_TEMP605 =
                          (0);
                        
//#line 1558
final int X10_TEMP197 =
                          (X10_TEMP605);
                        
//#line 1559
final double X10_TEMP610 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP197,k/* } */))/* } */);
                        
//#line 1561
final double X10_TEMP200 =
                          (X10_TEMP610);
                        
//#line 1562
final double X10_TEMP613 =
                          (X10_TEMP200);
                        
//#line 1564
final double X10_TEMP201 =
                          (X10_TEMP613);
                        
//#line 1565
final double X10_TEMP618 =
                          (X10_TEMP201);
                        
//#line 1567
final double X10_TEMP621 =
                          (X10_TEMP618);
                        
//#line 1568
/* template:array_set { */(b).set((X10_TEMP621),/* Join: { */X10_TEMP194,l/* } */)/* } */;
                        
//#line 1569
final int X10_TEMP623 =
                          (0);
                        
//#line 1571
final int X10_TEMP204 =
                          (X10_TEMP623);
                        
//#line 1572
final double X10_TEMP626 =
                          (t);
                        
//#line 1574
final double X10_TEMP207 =
                          (X10_TEMP626);
                        
//#line 1575
final double X10_TEMP631 =
                          (X10_TEMP207);
                        
//#line 1577
final double X10_TEMP634 =
                          (X10_TEMP631);
                        
//#line 1578
/* template:array_set { */(b).set((X10_TEMP634),/* Join: { */X10_TEMP204,k/* } */)/* } */;
                    }
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var9____ = (__var64__).iterator(); __var9____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var9__ = (x10.
                  lang.
                  point) __var9____.next();
                	/* Join: { *//* Join: { */final int kb =
                  /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                    
//#line 1496
final int X10_TEMP527 =
                      (1);
                    
//#line 1498
final int X10_TEMP156 =
                      (X10_TEMP527);
                    
//#line 1499
final int X10_TEMP530 =
                      (kb +
                         X10_TEMP156);
                    
//#line 1501
final int X10_TEMP158 =
                      (X10_TEMP530);
                    
//#line 1502
final int X10_TEMP533 =
                      (n -
                         X10_TEMP158);
                    
//#line 1504
final int k =
                      (X10_TEMP533);
                    
//#line 1505
final int X10_TEMP536 =
                      (1);
                    
//#line 1507
final int X10_TEMP160 =
                      (X10_TEMP536);
                    
//#line 1508
final int X10_TEMP539 =
                      (k +
                         X10_TEMP160);
                    
//#line 1510
final int kp1 =
                      (X10_TEMP539);
                    
//#line 1511
final int X10_TEMP542 =
                      (0);
                    
//#line 1513
final int X10_TEMP164 =
                      (X10_TEMP542);
                    
//#line 1514
final int X10_TEMP545 =
                      (kp1);
                    
//#line 1516
final int X10_TEMP166 =
                      (X10_TEMP545);
                    
//#line 1517
final int X10_TEMP548 =
                      (n -
                         X10_TEMP166);
                    
//#line 1519
final int X10_TEMP176 =
                      (X10_TEMP548);
                    
//#line 1520
final int X10_TEMP551 =
                      (1);
                    
//#line 1522
final int X10_TEMP177 =
                      (X10_TEMP551);
                    
//#line 1523
final int X10_TEMP554 =
                      (0);
                    
//#line 1525
final int X10_TEMP178 =
                      (X10_TEMP554);
                    
//#line 1526
final int X10_TEMP557 =
                      (1);
                    
//#line 1528
final int X10_TEMP179 =
                      (X10_TEMP557);
                    
//#line 1529
final double X10_TEMP562 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP164,k/* } */))/* } */);
                    
//#line 1531
final double X10_TEMP181 =
                      (X10_TEMP562);
                    
//#line 1532
final double X10_TEMP575 =
                      (Program0.
                         Program_Linpack_ddot(
                         X10_TEMP0,
                         X10_TEMP176,
                         a,
                         k,
                         kp1,
                         X10_TEMP177,
                         b,
                         X10_TEMP178,
                         kp1,
                         X10_TEMP179));
                    
//#line 1534
final double X10_TEMP182 =
                      (X10_TEMP575);
                    
//#line 1535
final double X10_TEMP578 =
                      (X10_TEMP181 +
                         X10_TEMP182);
                    
//#line 1537
final double X10_TEMP183 =
                      (X10_TEMP578);
                    
//#line 1538
final double X10_TEMP583 =
                      (X10_TEMP183);
                    
//#line 1540
final double X10_TEMP586 =
                      (X10_TEMP583);
                    
//#line 1541
/* template:array_set { */(b).set((X10_TEMP586),/* Join: { */X10_TEMP164,k/* } */)/* } */;
                    
//#line 1542
final int X10_TEMP589 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1544
final int l =
                      (X10_TEMP589);
                    
//#line 1545
final boolean X10_TEMP187 =
                      (l !=
                         k);
                    
//#line 1546
if (X10_TEMP187) {
                        
//#line 1547
final int X10_TEMP594 =
                          (0);
                        
//#line 1549
final int X10_TEMP190 =
                          (X10_TEMP594);
                        
//#line 1550
final double X10_TEMP599 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP190,l/* } */))/* } */);
                        
//#line 1552
double t =
                          (X10_TEMP599);
                        
//#line 1553
final int X10_TEMP602 =
                          (0);
                        
//#line 1555
final int X10_TEMP194 =
                          (X10_TEMP602);
                        
//#line 1556
final int X10_TEMP605 =
                          (0);
                        
//#line 1558
final int X10_TEMP197 =
                          (X10_TEMP605);
                        
//#line 1559
final double X10_TEMP610 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP197,k/* } */))/* } */);
                        
//#line 1561
final double X10_TEMP200 =
                          (X10_TEMP610);
                        
//#line 1562
final double X10_TEMP613 =
                          (X10_TEMP200);
                        
//#line 1564
final double X10_TEMP201 =
                          (X10_TEMP613);
                        
//#line 1565
final double X10_TEMP618 =
                          (X10_TEMP201);
                        
//#line 1567
final double X10_TEMP621 =
                          (X10_TEMP618);
                        
//#line 1568
/* template:array_set { */(b).set((X10_TEMP621),/* Join: { */X10_TEMP194,l/* } */)/* } */;
                        
//#line 1569
final int X10_TEMP623 =
                          (0);
                        
//#line 1571
final int X10_TEMP204 =
                          (X10_TEMP623);
                        
//#line 1572
final double X10_TEMP626 =
                          (t);
                        
//#line 1574
final double X10_TEMP207 =
                          (X10_TEMP626);
                        
//#line 1575
final double X10_TEMP631 =
                          (X10_TEMP207);
                        
//#line 1577
final double X10_TEMP634 =
                          (X10_TEMP631);
                        
//#line 1578
/* template:array_set { */(b).set((X10_TEMP634),/* Join: { */X10_TEMP204,k/* } */)/* } */;
                    }
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
    }
    
    
//#line 1584
public static void
                    Program_Linpack_daxpy(
                    final Linpack X10_TEMP0,
                    final int n,
                    final double da,
                    final x10.
                      lang.
                      DoubleReferenceArray dx,
                    final int dxCol,
                    final int dx_off,
                    final int incx,
                    final x10.
                      lang.
                      DoubleReferenceArray dy,
                    final int dyCol,
                    final int dy_off,
                    final int incy) {
        
//#line 1585
final int X10_TEMP210 =
          (0);
        
//#line 1587
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 1588
final boolean X10_TEMP213 =
          (n >
             X10_TEMP1);
        
//#line 1590
final boolean X10_TEMP3 =
          (X10_TEMP213);
        
//#line 1591
final int X10_TEMP216 =
          (0);
        
//#line 1593
final int X10_TEMP4 =
          (X10_TEMP216);
        
//#line 1594
final boolean X10_TEMP219 =
          (da !=
             X10_TEMP4);
        
//#line 1596
final boolean X10_TEMP6 =
          (X10_TEMP219);
        
//#line 1597
final boolean X10_TEMP8 =
          (X10_TEMP3 &&
             X10_TEMP6);
        
//#line 1598
if (X10_TEMP8) {
            
//#line 1599
final int X10_TEMP224 =
              (1);
            
//#line 1601
final int X10_TEMP9 =
              (X10_TEMP224);
            
//#line 1602
final boolean X10_TEMP227 =
              (incx !=
                 X10_TEMP9);
            
//#line 1604
final boolean X10_TEMP11 =
              (X10_TEMP227);
            
//#line 1605
final int X10_TEMP230 =
              (1);
            
//#line 1607
final int X10_TEMP10 =
              (X10_TEMP230);
            
//#line 1608
final boolean X10_TEMP233 =
              (incy !=
                 X10_TEMP10);
            
//#line 1610
final boolean X10_TEMP12 =
              (X10_TEMP233);
            
//#line 1611
final boolean X10_TEMP14 =
              (X10_TEMP11 ||
                 X10_TEMP12);
            
//#line 1612
if (X10_TEMP14) {
                
//#line 1613
final int X10_TEMP238 =
                  (0);
                
//#line 1615
int ix =
                  (X10_TEMP238);
                
//#line 1616
final int X10_TEMP241 =
                  (0);
                
//#line 1618
int iy =
                  (X10_TEMP241);
                
//#line 1619
final int X10_TEMP244 =
                  (0);
                
//#line 1621
final int X10_TEMP17 =
                  (X10_TEMP244);
                
//#line 1622
final boolean X10_TEMP19 =
                  (incx <
                     X10_TEMP17);
                
//#line 1623
if (X10_TEMP19) {
                    
//#line 1624
final int X10_TEMP20 =
                      (0);
                    
//#line 1625
final int X10_TEMP250 =
                      (X10_TEMP20 -
                         n);
                    
//#line 1627
final int X10_TEMP21 =
                      (X10_TEMP250);
                    
//#line 1628
final int X10_TEMP253 =
                      (1);
                    
//#line 1630
final int X10_TEMP22 =
                      (X10_TEMP253);
                    
//#line 1631
final int X10_TEMP256 =
                      (X10_TEMP21 +
                         X10_TEMP22);
                    
//#line 1633
final int X10_TEMP24 =
                      (X10_TEMP256);
                    
//#line 1634
final int X10_TEMP259 =
                      (X10_TEMP24 *
                         incx);
                    
//#line 1636
final int X10_TEMP26 =
                      (X10_TEMP259);
                    
//#line 1637
final int X10_TEMP262 =
                      (X10_TEMP26);
                    
//#line 1639
ix =
                      ((X10_TEMP262));
                }
                
//#line 1641
final int X10_TEMP265 =
                  (0);
                
//#line 1643
final int X10_TEMP27 =
                  (X10_TEMP265);
                
//#line 1644
final boolean X10_TEMP29 =
                  (incy <
                     X10_TEMP27);
                
//#line 1645
if (X10_TEMP29) {
                    
//#line 1646
final int X10_TEMP30 =
                      (0);
                    
//#line 1647
final int X10_TEMP271 =
                      (X10_TEMP30 -
                         n);
                    
//#line 1649
final int X10_TEMP31 =
                      (X10_TEMP271);
                    
//#line 1650
final int X10_TEMP274 =
                      (1);
                    
//#line 1652
final int X10_TEMP32 =
                      (X10_TEMP274);
                    
//#line 1653
final int X10_TEMP277 =
                      (X10_TEMP31 +
                         X10_TEMP32);
                    
//#line 1655
final int X10_TEMP34 =
                      (X10_TEMP277);
                    
//#line 1656
final int X10_TEMP280 =
                      (X10_TEMP34 *
                         incy);
                    
//#line 1658
final int X10_TEMP36 =
                      (X10_TEMP280);
                    
//#line 1659
final int X10_TEMP283 =
                      (X10_TEMP36);
                    
//#line 1661
iy =
                      ((X10_TEMP283));
                }
                
//#line 1663
final int X10_TEMP286 =
                  (0);
                
//#line 1665
final int X10_TEMP40 =
                  (X10_TEMP286);
                
//#line 1666
final int X10_TEMP289 =
                  (1);
                
//#line 1668
final int X10_TEMP38 =
                  (X10_TEMP289);
                
//#line 1669
final int X10_TEMP292 =
                  (n -
                     X10_TEMP38);
                
//#line 1671
final int X10_TEMP41 =
                  (X10_TEMP292);
                
//#line 1672
final x10.
                  lang.
                  region X10_TEMP297 =
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
                          X10_TEMP41))));
                
//#line 1674
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP297));
                
//#line 1675
final x10.
                  lang.
                  place X10_TEMP300 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1677
final x10.
                  lang.
                  place X10_TEMP43 =
                  (X10_TEMP300);
                
//#line 1678
final x10.
                  lang.
                  dist X10_TEMP303 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP43)));
                
//#line 1680
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP303));
                
//#line 1681
/* template:forloop { */
                for (java.util.Iterator i__ = (temprDist.
                                                 region).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1682
final int X10_TEMP307 =
                      (iy +
                         dy_off);
                    
//#line 1684
final int X10_TEMP48 =
                      (X10_TEMP307);
                    
//#line 1685
final int X10_TEMP310 =
                      (ix +
                         dx_off);
                    
//#line 1687
final int X10_TEMP52 =
                      (X10_TEMP310);
                    
//#line 1688
final double X10_TEMP317 =
                      (Program0.
                         Program_Linpack_read(
                         X10_TEMP0,
                         dx,
                         dxCol,
                         X10_TEMP52));
                    
//#line 1690
final double X10_TEMP53 =
                      (X10_TEMP317);
                    
//#line 1691
final double X10_TEMP322 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP48/* } */))/* } */);
                    
//#line 1693
final double X10_TEMP55 =
                      (X10_TEMP322);
                    
//#line 1694
final double X10_TEMP325 =
                      (da *
                         X10_TEMP53);
                    
//#line 1696
final double X10_TEMP56 =
                      (X10_TEMP325);
                    
//#line 1697
final double X10_TEMP328 =
                      (X10_TEMP55 +
                         X10_TEMP56);
                    
//#line 1699
final double X10_TEMP57 =
                      (X10_TEMP328);
                    
//#line 1700
final double X10_TEMP333 =
                      (X10_TEMP57);
                    
//#line 1702
final double X10_TEMP336 =
                      (X10_TEMP333);
                    
//#line 1703
/* template:array_set { */(dy).set((X10_TEMP336),/* Join: { */dyCol,X10_TEMP48/* } */)/* } */;
                    
//#line 1704
final int X10_TEMP338 =
                      (ix +
                         incx);
                    
//#line 1706
ix =
                      ((X10_TEMP338));
                    
//#line 1707
final int X10_TEMP341 =
                      (iy +
                         incy);
                    
//#line 1709
iy =
                      ((X10_TEMP341));
                }/* } */
                }
                /* } */
                
                
//#line 1711
return;
            }
            
//#line 1713
final int X10_TEMP344 =
              (0);
            
//#line 1715
final int X10_TEMP63 =
              (X10_TEMP344);
            
//#line 1716
final int X10_TEMP347 =
              (1);
            
//#line 1718
final int X10_TEMP61 =
              (X10_TEMP347);
            
//#line 1719
final int X10_TEMP350 =
              (n -
                 X10_TEMP61);
            
//#line 1721
final int X10_TEMP64 =
              (X10_TEMP350);
            
//#line 1722
final x10.
              lang.
              region X10_TEMP355 =
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
                      X10_TEMP63,
                      X10_TEMP64))));
            
//#line 1724
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP355));
            
//#line 1725
final x10.
              lang.
              place X10_TEMP358 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1727
final x10.
              lang.
              place X10_TEMP66 =
              (X10_TEMP358);
            
//#line 1728
final x10.
              lang.
              dist X10_TEMP361 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP66)));
            
//#line 1730
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP361));
            
//#line 1731
/* template:forloop-mult { */{
            x10.lang.region __var67__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var67__.size() > 0 && (__var67__ instanceof x10.array.MultiDimRegion || __var67__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var68__ = __var67__.rank(0).low(), __var69__ = __var67__.rank(0).high(); __var68__ <= __var69__; __var68__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var68__;
            /* } */
            /* } */
{
                
//#line 1732
final int X10_TEMP365 =
                  (i +
                     dy_off);
                
//#line 1734
final int X10_TEMP71 =
                  (X10_TEMP365);
                
//#line 1735
final int X10_TEMP368 =
                  (i +
                     dx_off);
                
//#line 1737
final int X10_TEMP75 =
                  (X10_TEMP368);
                
//#line 1738
final double X10_TEMP375 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxCol,
                     X10_TEMP75));
                
//#line 1740
final double X10_TEMP76 =
                  (X10_TEMP375);
                
//#line 1741
final double X10_TEMP380 =
                  (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP71/* } */))/* } */);
                
//#line 1743
final double X10_TEMP78 =
                  (X10_TEMP380);
                
//#line 1744
final double X10_TEMP383 =
                  (da *
                     X10_TEMP76);
                
//#line 1746
final double X10_TEMP79 =
                  (X10_TEMP383);
                
//#line 1747
final double X10_TEMP386 =
                  (X10_TEMP78 +
                     X10_TEMP79);
                
//#line 1749
final double X10_TEMP80 =
                  (X10_TEMP386);
                
//#line 1750
final double X10_TEMP391 =
                  (X10_TEMP80);
                
//#line 1752
final double X10_TEMP394 =
                  (X10_TEMP391);
                
//#line 1753
/* template:array_set { */(dy).set((X10_TEMP394),/* Join: { */dyCol,X10_TEMP71/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var10____ = (__var67__).iterator(); __var10____.hasNext(); ) {
            	final  x10.
              lang.
              point __var10__ = (x10.
              lang.
              point) __var10____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                
//#line 1732
final int X10_TEMP365 =
                  (i +
                     dy_off);
                
//#line 1734
final int X10_TEMP71 =
                  (X10_TEMP365);
                
//#line 1735
final int X10_TEMP368 =
                  (i +
                     dx_off);
                
//#line 1737
final int X10_TEMP75 =
                  (X10_TEMP368);
                
//#line 1738
final double X10_TEMP375 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxCol,
                     X10_TEMP75));
                
//#line 1740
final double X10_TEMP76 =
                  (X10_TEMP375);
                
//#line 1741
final double X10_TEMP380 =
                  (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP71/* } */))/* } */);
                
//#line 1743
final double X10_TEMP78 =
                  (X10_TEMP380);
                
//#line 1744
final double X10_TEMP383 =
                  (da *
                     X10_TEMP76);
                
//#line 1746
final double X10_TEMP79 =
                  (X10_TEMP383);
                
//#line 1747
final double X10_TEMP386 =
                  (X10_TEMP78 +
                     X10_TEMP79);
                
//#line 1749
final double X10_TEMP80 =
                  (X10_TEMP386);
                
//#line 1750
final double X10_TEMP391 =
                  (X10_TEMP80);
                
//#line 1752
final double X10_TEMP394 =
                  (X10_TEMP391);
                
//#line 1753
/* template:array_set { */(dy).set((X10_TEMP394),/* Join: { */dyCol,X10_TEMP71/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
    }
    
    
//#line 1757
public static double
                    Program_Linpack_ddot(
                    final Linpack X10_TEMP0,
                    final int n,
                    final x10.
                      lang.
                      DoubleReferenceArray dx,
                    final int dxCol,
                    final int dx_off,
                    final int incx,
                    final x10.
                      lang.
                      DoubleReferenceArray dy,
                    final int dyCol,
                    final int dy_off,
                    final int incy) {
        
//#line 1758
final int X10_TEMP210 =
          (0);
        
//#line 1760
double dtemp =
          (X10_TEMP210);
        
//#line 1761
final int X10_TEMP213 =
          (0);
        
//#line 1763
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 1764
final boolean X10_TEMP4 =
          (n >
             X10_TEMP2);
        
//#line 1765
if (X10_TEMP4) {
            
//#line 1766
final int X10_TEMP218 =
              (1);
            
//#line 1768
final int X10_TEMP5 =
              (X10_TEMP218);
            
//#line 1769
final boolean X10_TEMP221 =
              (incx !=
                 X10_TEMP5);
            
//#line 1771
final boolean X10_TEMP7 =
              (X10_TEMP221);
            
//#line 1772
final int X10_TEMP224 =
              (1);
            
//#line 1774
final int X10_TEMP6 =
              (X10_TEMP224);
            
//#line 1775
final boolean X10_TEMP227 =
              (incy !=
                 X10_TEMP6);
            
//#line 1777
final boolean X10_TEMP8 =
              (X10_TEMP227);
            
//#line 1778
final boolean X10_TEMP10 =
              (X10_TEMP7 ||
                 X10_TEMP8);
            
//#line 1779
if (X10_TEMP10) {
                
//#line 1780
final int X10_TEMP232 =
                  (0);
                
//#line 1782
int ix =
                  (X10_TEMP232);
                
//#line 1783
final int X10_TEMP235 =
                  (0);
                
//#line 1785
int iy =
                  (X10_TEMP235);
                
//#line 1786
final int X10_TEMP238 =
                  (0);
                
//#line 1788
final int X10_TEMP13 =
                  (X10_TEMP238);
                
//#line 1789
final boolean X10_TEMP15 =
                  (incx <
                     X10_TEMP13);
                
//#line 1790
if (X10_TEMP15) {
                    
//#line 1791
final int X10_TEMP16 =
                      (0);
                    
//#line 1792
final int X10_TEMP244 =
                      (X10_TEMP16 -
                         n);
                    
//#line 1794
final int X10_TEMP17 =
                      (X10_TEMP244);
                    
//#line 1795
final int X10_TEMP247 =
                      (1);
                    
//#line 1797
final int X10_TEMP18 =
                      (X10_TEMP247);
                    
//#line 1798
final int X10_TEMP250 =
                      (X10_TEMP17 +
                         X10_TEMP18);
                    
//#line 1800
final int X10_TEMP20 =
                      (X10_TEMP250);
                    
//#line 1801
final int X10_TEMP253 =
                      (X10_TEMP20 *
                         incx);
                    
//#line 1803
final int X10_TEMP22 =
                      (X10_TEMP253);
                    
//#line 1804
final int X10_TEMP256 =
                      (X10_TEMP22);
                    
//#line 1806
ix =
                      ((X10_TEMP256));
                }
                
//#line 1808
final int X10_TEMP259 =
                  (0);
                
//#line 1810
final int X10_TEMP23 =
                  (X10_TEMP259);
                
//#line 1811
final boolean X10_TEMP25 =
                  (incy <
                     X10_TEMP23);
                
//#line 1812
if (X10_TEMP25) {
                    
//#line 1813
final int X10_TEMP26 =
                      (0);
                    
//#line 1814
final int X10_TEMP265 =
                      (X10_TEMP26 -
                         n);
                    
//#line 1816
final int X10_TEMP27 =
                      (X10_TEMP265);
                    
//#line 1817
final int X10_TEMP268 =
                      (1);
                    
//#line 1819
final int X10_TEMP28 =
                      (X10_TEMP268);
                    
//#line 1820
final int X10_TEMP271 =
                      (X10_TEMP27 +
                         X10_TEMP28);
                    
//#line 1822
final int X10_TEMP30 =
                      (X10_TEMP271);
                    
//#line 1823
final int X10_TEMP274 =
                      (X10_TEMP30 *
                         incy);
                    
//#line 1825
final int X10_TEMP32 =
                      (X10_TEMP274);
                    
//#line 1826
final int X10_TEMP277 =
                      (X10_TEMP32);
                    
//#line 1828
iy =
                      ((X10_TEMP277));
                }
                
//#line 1830
final int X10_TEMP280 =
                  (0);
                
//#line 1832
final int X10_TEMP36 =
                  (X10_TEMP280);
                
//#line 1833
final int X10_TEMP283 =
                  (1);
                
//#line 1835
final int X10_TEMP34 =
                  (X10_TEMP283);
                
//#line 1836
final int X10_TEMP286 =
                  (n -
                     X10_TEMP34);
                
//#line 1838
final int X10_TEMP37 =
                  (X10_TEMP286);
                
//#line 1839
final x10.
                  lang.
                  region X10_TEMP291 =
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
                          X10_TEMP36,
                          X10_TEMP37))));
                
//#line 1841
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP291));
                
//#line 1842
final x10.
                  lang.
                  place X10_TEMP294 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1844
final x10.
                  lang.
                  place X10_TEMP39 =
                  (X10_TEMP294);
                
//#line 1845
final x10.
                  lang.
                  dist X10_TEMP297 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP39)));
                
//#line 1847
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP297));
                
//#line 1848
/* template:forloop { */
                for (java.util.Iterator i__ = (temprDist.
                                                 region).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1849
final int X10_TEMP301 =
                      (ix +
                         dx_off);
                    
//#line 1851
final int X10_TEMP44 =
                      (X10_TEMP301);
                    
//#line 1852
final double X10_TEMP306 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP44/* } */))/* } */);
                    
//#line 1854
final double X10_TEMP48 =
                      (X10_TEMP306);
                    
//#line 1855
final int X10_TEMP309 =
                      (iy +
                         dy_off);
                    
//#line 1857
final int X10_TEMP47 =
                      (X10_TEMP309);
                    
//#line 1858
final double X10_TEMP314 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP47/* } */))/* } */);
                    
//#line 1860
final double X10_TEMP49 =
                      (X10_TEMP314);
                    
//#line 1861
final double X10_TEMP317 =
                      (X10_TEMP48 *
                         X10_TEMP49);
                    
//#line 1863
final double X10_TEMP51 =
                      (X10_TEMP317);
                    
//#line 1864
final double X10_TEMP320 =
                      (dtemp +
                         X10_TEMP51);
                    
//#line 1866
dtemp =
                      ((X10_TEMP320));
                    
//#line 1867
final int X10_TEMP323 =
                      (ix +
                         incx);
                    
//#line 1869
ix =
                      ((X10_TEMP323));
                    
//#line 1870
final int X10_TEMP326 =
                      (iy +
                         incy);
                    
//#line 1872
iy =
                      ((X10_TEMP326));
                }/* } */
                }
                /* } */
                
            } else {
                
//#line 1876
final int X10_TEMP329 =
                  (0);
                
//#line 1878
final int X10_TEMP57 =
                  (X10_TEMP329);
                
//#line 1879
final int X10_TEMP332 =
                  (1);
                
//#line 1881
final int X10_TEMP55 =
                  (X10_TEMP332);
                
//#line 1882
final int X10_TEMP335 =
                  (n -
                     X10_TEMP55);
                
//#line 1884
final int X10_TEMP58 =
                  (X10_TEMP335);
                
//#line 1885
final x10.
                  lang.
                  region X10_TEMP340 =
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
                          X10_TEMP57,
                          X10_TEMP58))));
                
//#line 1887
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP340));
                
//#line 1888
final x10.
                  lang.
                  place X10_TEMP343 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1890
final x10.
                  lang.
                  place X10_TEMP60 =
                  (X10_TEMP343);
                
//#line 1891
final x10.
                  lang.
                  dist X10_TEMP346 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP60)));
                
//#line 1893
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP346));
                
//#line 1894
/* template:forloop-mult { */{
                x10.lang.region __var70__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var70__.size() > 0 && (__var70__ instanceof x10.array.MultiDimRegion || __var70__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var71__ = __var70__.rank(0).low(), __var72__ = __var70__.rank(0).high(); __var71__ <= __var72__; __var71__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var71__;
                /* } */
                /* } */
{
                    
//#line 1895
final int X10_TEMP350 =
                      (i +
                         dx_off);
                    
//#line 1897
final int X10_TEMP65 =
                      (X10_TEMP350);
                    
//#line 1898
final double X10_TEMP355 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP65/* } */))/* } */);
                    
//#line 1900
final double X10_TEMP69 =
                      (X10_TEMP355);
                    
//#line 1901
final int X10_TEMP358 =
                      (i +
                         dy_off);
                    
//#line 1903
final int X10_TEMP68 =
                      (X10_TEMP358);
                    
//#line 1904
final double X10_TEMP363 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP68/* } */))/* } */);
                    
//#line 1906
final double X10_TEMP70 =
                      (X10_TEMP363);
                    
//#line 1907
final double X10_TEMP366 =
                      (X10_TEMP69 *
                         X10_TEMP70);
                    
//#line 1909
final double X10_TEMP72 =
                      (X10_TEMP366);
                    
//#line 1910
final double X10_TEMP369 =
                      (dtemp +
                         X10_TEMP72);
                    
//#line 1912
dtemp =
                      ((X10_TEMP369));
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var11____ = (__var70__).iterator(); __var11____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var11__ = (x10.
                  lang.
                  point) __var11____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                    
//#line 1895
final int X10_TEMP350 =
                      (i +
                         dx_off);
                    
//#line 1897
final int X10_TEMP65 =
                      (X10_TEMP350);
                    
//#line 1898
final double X10_TEMP355 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP65/* } */))/* } */);
                    
//#line 1900
final double X10_TEMP69 =
                      (X10_TEMP355);
                    
//#line 1901
final int X10_TEMP358 =
                      (i +
                         dy_off);
                    
//#line 1903
final int X10_TEMP68 =
                      (X10_TEMP358);
                    
//#line 1904
final double X10_TEMP363 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP68/* } */))/* } */);
                    
//#line 1906
final double X10_TEMP70 =
                      (X10_TEMP363);
                    
//#line 1907
final double X10_TEMP366 =
                      (X10_TEMP69 *
                         X10_TEMP70);
                    
//#line 1909
final double X10_TEMP72 =
                      (X10_TEMP366);
                    
//#line 1910
final double X10_TEMP369 =
                      (dtemp +
                         X10_TEMP72);
                    
//#line 1912
dtemp =
                      ((X10_TEMP369));
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
        
//#line 1916
return dtemp;
    }
    
    
//#line 1918
public static void
                    Program_Linpack_dscal(
                    final Linpack X10_TEMP0,
                    final int n,
                    final double da,
                    final x10.
                      lang.
                      DoubleReferenceArray dx,
                    final int currentCol,
                    final int dx_off,
                    final int incx) {
        
//#line 1919
final int X10_TEMP210 =
          (0);
        
//#line 1921
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 1922
final boolean X10_TEMP3 =
          (n >
             X10_TEMP1);
        
//#line 1923
if (X10_TEMP3) {
            
//#line 1924
final int X10_TEMP215 =
              (1);
            
//#line 1926
final int X10_TEMP4 =
              (X10_TEMP215);
            
//#line 1927
final boolean X10_TEMP6 =
              (incx !=
                 X10_TEMP4);
            
//#line 1928
if (X10_TEMP6) {
                
//#line 1929
final int X10_TEMP220 =
                  (n *
                     incx);
                
//#line 1931
final int nincx =
                  (X10_TEMP220);
                
//#line 1932
final int X10_TEMP223 =
                  (0);
                
//#line 1934
int i =
                  (X10_TEMP223);
                
//#line 1935
boolean X10_TEMP11 =
                  (i <
                     nincx);
                
//#line 1936
boolean X10_TEMP228 =
                  X10_TEMP11;
                
//#line 1937
while (X10_TEMP228) {
                    
//#line 1938
final int X10_TEMP230 =
                      (i +
                         dx_off);
                    
//#line 1940
final int X10_TEMP14 =
                      (X10_TEMP230);
                    
//#line 1941
final double X10_TEMP235 =
                      (/* template:array_get { */((dx).get(/* Join: { */currentCol,X10_TEMP14/* } */))/* } */);
                    
//#line 1943
final double X10_TEMP16 =
                      (X10_TEMP235);
                    
//#line 1944
final double X10_TEMP238 =
                      (X10_TEMP16 *
                         da);
                    
//#line 1946
final double X10_TEMP17 =
                      (X10_TEMP238);
                    
//#line 1947
final double X10_TEMP243 =
                      (X10_TEMP17);
                    
//#line 1949
final double X10_TEMP246 =
                      (X10_TEMP243);
                    
//#line 1950
/* template:array_set { */(dx).set((X10_TEMP246),/* Join: { */currentCol,X10_TEMP14/* } */)/* } */;
                    
//#line 1951
final int X10_TEMP248 =
                      (i +
                         incx);
                    
//#line 1953
i =
                      ((X10_TEMP248));
                    
//#line 1954
final boolean X10_TEMP251 =
                      (i <
                         nincx);
                    
//#line 1955
X10_TEMP11 =
                      ((X10_TEMP251));
                    
//#line 1956
X10_TEMP228 =
                      X10_TEMP11;
                }
            } else {
                
//#line 1960
final int X10_TEMP253 =
                  (0);
                
//#line 1962
final int X10_TEMP22 =
                  (X10_TEMP253);
                
//#line 1963
final int X10_TEMP256 =
                  (1);
                
//#line 1965
final int X10_TEMP20 =
                  (X10_TEMP256);
                
//#line 1966
final int X10_TEMP259 =
                  (n -
                     X10_TEMP20);
                
//#line 1968
final int X10_TEMP23 =
                  (X10_TEMP259);
                
//#line 1969
final x10.
                  lang.
                  region X10_TEMP264 =
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
                          X10_TEMP22,
                          X10_TEMP23))));
                
//#line 1971
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP264));
                
//#line 1972
final x10.
                  lang.
                  place X10_TEMP267 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1974
final x10.
                  lang.
                  place X10_TEMP25 =
                  (X10_TEMP267);
                
//#line 1975
final x10.
                  lang.
                  dist X10_TEMP270 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP25)));
                
//#line 1977
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP270));
                
//#line 1978
/* template:forloop-mult { */{
                x10.lang.region __var73__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var73__.size() > 0 && (__var73__ instanceof x10.array.MultiDimRegion || __var73__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var74__ = __var73__.rank(0).low(), __var75__ = __var73__.rank(0).high(); __var74__ <= __var75__; __var74__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var74__;
                /* } */
                /* } */
{
                    
//#line 1979
final int X10_TEMP274 =
                      (i +
                         dx_off);
                    
//#line 1981
final int X10_TEMP30 =
                      (X10_TEMP274);
                    
//#line 1982
final double X10_TEMP279 =
                      (/* template:array_get { */((dx).get(/* Join: { */currentCol,X10_TEMP30/* } */))/* } */);
                    
//#line 1984
final double X10_TEMP32 =
                      (X10_TEMP279);
                    
//#line 1985
final double X10_TEMP282 =
                      (X10_TEMP32 *
                         da);
                    
//#line 1987
final double X10_TEMP33 =
                      (X10_TEMP282);
                    
//#line 1988
final double X10_TEMP287 =
                      (X10_TEMP33);
                    
//#line 1990
final double X10_TEMP290 =
                      (X10_TEMP287);
                    
//#line 1991
/* template:array_set { */(dx).set((X10_TEMP290),/* Join: { */currentCol,X10_TEMP30/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var12____ = (__var73__).iterator(); __var12____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var12__ = (x10.
                  lang.
                  point) __var12____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                    
//#line 1979
final int X10_TEMP274 =
                      (i +
                         dx_off);
                    
//#line 1981
final int X10_TEMP30 =
                      (X10_TEMP274);
                    
//#line 1982
final double X10_TEMP279 =
                      (/* template:array_get { */((dx).get(/* Join: { */currentCol,X10_TEMP30/* } */))/* } */);
                    
//#line 1984
final double X10_TEMP32 =
                      (X10_TEMP279);
                    
//#line 1985
final double X10_TEMP282 =
                      (X10_TEMP32 *
                         da);
                    
//#line 1987
final double X10_TEMP33 =
                      (X10_TEMP282);
                    
//#line 1988
final double X10_TEMP287 =
                      (X10_TEMP33);
                    
//#line 1990
final double X10_TEMP290 =
                      (X10_TEMP287);
                    
//#line 1991
/* template:array_set { */(dx).set((X10_TEMP290),/* Join: { */currentCol,X10_TEMP30/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
    }
    
    
//#line 1996
public static int
                    Program_Linpack_idamax(
                    final Linpack X10_TEMP0,
                    final int n,
                    final x10.
                      lang.
                      DoubleReferenceArray dx,
                    final int dxk,
                    final int dx_off,
                    final int incx) {
        
//#line 1997
final int X10_TEMP210 =
          (1);
        
//#line 1999
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 2000
final boolean X10_TEMP3 =
          (n <
             X10_TEMP1);
        
//#line 2001
if (X10_TEMP3) {
            
//#line 2002
final int X10_TEMP215 =
              (1);
            
//#line 2004
final int X10_TEMP4 =
              (X10_TEMP215);
            
//#line 2005
final int X10_TEMP5 =
              (0);
            
//#line 2006
final int X10_TEMP219 =
              (X10_TEMP5 -
                 X10_TEMP4);
            
//#line 2008
final int X10_TEMP7 =
              (X10_TEMP219);
            
//#line 2009
return X10_TEMP7;
        }
        
//#line 2011
final int X10_TEMP223 =
          (1);
        
//#line 2013
final int X10_TEMP8 =
          (X10_TEMP223);
        
//#line 2014
final boolean X10_TEMP10 =
          (n ==
             X10_TEMP8);
        
//#line 2015
if (X10_TEMP10) {
            
//#line 2016
final int X10_TEMP228 =
              (0);
            
//#line 2018
final int X10_TEMP12 =
              (X10_TEMP228);
            
//#line 2019
return X10_TEMP12;
        }
        
//#line 2021
final int X10_TEMP232 =
          (1);
        
//#line 2023
final int X10_TEMP13 =
          (X10_TEMP232);
        
//#line 2024
final boolean X10_TEMP15 =
          (incx !=
             X10_TEMP13);
        
//#line 2025
if (X10_TEMP15) {
            
//#line 2026
final int X10_TEMP237 =
              (0);
            
//#line 2028
int itemp =
              (X10_TEMP237);
            
//#line 2029
final int X10_TEMP240 =
              (0);
            
//#line 2031
final int X10_TEMP19 =
              (X10_TEMP240);
            
//#line 2032
final int X10_TEMP243 =
              (X10_TEMP19 +
                 dx_off);
            
//#line 2034
final int X10_TEMP21 =
              (X10_TEMP243);
            
//#line 2035
final double X10_TEMP250 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP21));
            
//#line 2037
final double X10_TEMP23 =
              (X10_TEMP250);
            
//#line 2038
final double X10_TEMP255 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP23));
            
//#line 2040
double dmax =
              (X10_TEMP255);
            
//#line 2041
final int X10_TEMP258 =
              (1);
            
//#line 2043
final int X10_TEMP25 =
              (X10_TEMP258);
            
//#line 2044
final int X10_TEMP261 =
              (X10_TEMP25 +
                 incx);
            
//#line 2046
int ix =
              (X10_TEMP261);
            
//#line 2047
final int X10_TEMP264 =
              (1);
            
//#line 2049
final int X10_TEMP30 =
              (X10_TEMP264);
            
//#line 2050
final int X10_TEMP267 =
              (1);
            
//#line 2052
final int X10_TEMP28 =
              (X10_TEMP267);
            
//#line 2053
final int X10_TEMP270 =
              (n -
                 X10_TEMP28);
            
//#line 2055
final int X10_TEMP31 =
              (X10_TEMP270);
            
//#line 2056
final x10.
              lang.
              region X10_TEMP275 =
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
                      X10_TEMP30,
                      X10_TEMP31))));
            
//#line 2058
final x10.
              lang.
              region X10_TEMP33 =
              (x10.
                lang.
                region)
                ((X10_TEMP275));
            
//#line 2059
/* template:forloop-mult { */{
            x10.lang.region __var76__ = (x10.lang.region) X10_TEMP33;
            if (__var76__.size() > 0 && (__var76__ instanceof x10.array.MultiDimRegion || __var76__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var77__ = __var76__.rank(0).low(), __var78__ = __var76__.rank(0).high(); __var77__ <= __var78__; __var77__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var77__;
            /* } */
            /* } */
{
                
//#line 2060
final int X10_TEMP279 =
                  (ix +
                     dx_off);
                
//#line 2062
final int X10_TEMP37 =
                  (X10_TEMP279);
                
//#line 2063
final double X10_TEMP286 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxk,
                     X10_TEMP37));
                
//#line 2065
final double X10_TEMP39 =
                  (X10_TEMP286);
                
//#line 2066
final double X10_TEMP291 =
                  (Program0.
                     Program_Linpack_myabs(
                     X10_TEMP0,
                     X10_TEMP39));
                
//#line 2068
double dtemp =
                  (X10_TEMP291);
                
//#line 2069
final boolean X10_TEMP42 =
                  (dtemp >
                     dmax);
                
//#line 2070
if (X10_TEMP42) {
                    
//#line 2071
final int X10_TEMP296 =
                      (i);
                    
//#line 2073
itemp =
                      ((X10_TEMP296));
                    
//#line 2074
final double X10_TEMP299 =
                      (dtemp);
                    
//#line 2076
dmax =
                      ((X10_TEMP299));
                }
                
//#line 2078
final int X10_TEMP302 =
                  (ix +
                     incx);
                
//#line 2080
ix =
                  ((X10_TEMP302));
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var13____ = (__var76__).iterator(); __var13____.hasNext(); ) {
            	final  x10.
              lang.
              point __var13__ = (x10.
              lang.
              point) __var13____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                
//#line 2060
final int X10_TEMP279 =
                  (ix +
                     dx_off);
                
//#line 2062
final int X10_TEMP37 =
                  (X10_TEMP279);
                
//#line 2063
final double X10_TEMP286 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxk,
                     X10_TEMP37));
                
//#line 2065
final double X10_TEMP39 =
                  (X10_TEMP286);
                
//#line 2066
final double X10_TEMP291 =
                  (Program0.
                     Program_Linpack_myabs(
                     X10_TEMP0,
                     X10_TEMP39));
                
//#line 2068
double dtemp =
                  (X10_TEMP291);
                
//#line 2069
final boolean X10_TEMP42 =
                  (dtemp >
                     dmax);
                
//#line 2070
if (X10_TEMP42) {
                    
//#line 2071
final int X10_TEMP296 =
                      (i);
                    
//#line 2073
itemp =
                      ((X10_TEMP296));
                    
//#line 2074
final double X10_TEMP299 =
                      (dtemp);
                    
//#line 2076
dmax =
                      ((X10_TEMP299));
                }
                
//#line 2078
final int X10_TEMP302 =
                  (ix +
                     incx);
                
//#line 2080
ix =
                  ((X10_TEMP302));
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 2082
return itemp;
        }
        
//#line 2084
final int X10_TEMP306 =
          (0);
        
//#line 2086
int itemp =
          (X10_TEMP306);
        
//#line 2087
final int X10_TEMP309 =
          (0);
        
//#line 2089
final int X10_TEMP50 =
          (X10_TEMP309);
        
//#line 2090
final int X10_TEMP312 =
          (X10_TEMP50 +
             dx_off);
        
//#line 2092
final int X10_TEMP52 =
          (X10_TEMP312);
        
//#line 2093
final double X10_TEMP319 =
          (Program0.
             Program_Linpack_read(
             X10_TEMP0,
             dx,
             dxk,
             X10_TEMP52));
        
//#line 2095
final double X10_TEMP54 =
          (X10_TEMP319);
        
//#line 2096
final double X10_TEMP324 =
          (Program0.
             Program_Linpack_myabs(
             X10_TEMP0,
             X10_TEMP54));
        
//#line 2098
double dmax =
          (X10_TEMP324);
        
//#line 2099
final int X10_TEMP327 =
          (1);
        
//#line 2101
final int X10_TEMP59 =
          (X10_TEMP327);
        
//#line 2102
final int X10_TEMP330 =
          (1);
        
//#line 2104
final int X10_TEMP57 =
          (X10_TEMP330);
        
//#line 2105
final int X10_TEMP333 =
          (n -
             X10_TEMP57);
        
//#line 2107
final int X10_TEMP60 =
          (X10_TEMP333);
        
//#line 2108
final x10.
          lang.
          region X10_TEMP338 =
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
                  X10_TEMP59,
                  X10_TEMP60))));
        
//#line 2110
final x10.
          lang.
          region X10_TEMP62 =
          (x10.
            lang.
            region)
            ((X10_TEMP338));
        
//#line 2111
/* template:forloop-mult { */{
        x10.lang.region __var79__ = (x10.lang.region) X10_TEMP62;
        if (__var79__.size() > 0 && (__var79__ instanceof x10.array.MultiDimRegion || __var79__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var80__ = __var79__.rank(0).low(), __var81__ = __var79__.rank(0).high(); __var80__ <= __var81__; __var80__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var80__;
        /* } */
        /* } */
{
            
//#line 2112
final int X10_TEMP342 =
              (i +
                 dx_off);
            
//#line 2114
final int X10_TEMP66 =
              (X10_TEMP342);
            
//#line 2115
final double X10_TEMP349 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP66));
            
//#line 2117
final double X10_TEMP68 =
              (X10_TEMP349);
            
//#line 2118
final double X10_TEMP354 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP68));
            
//#line 2120
double dtemp =
              (X10_TEMP354);
            
//#line 2121
final boolean X10_TEMP71 =
              (dtemp >
                 dmax);
            
//#line 2122
if (X10_TEMP71) {
                
//#line 2123
final int X10_TEMP359 =
                  (i);
                
//#line 2125
itemp =
                  ((X10_TEMP359));
                
//#line 2126
final double X10_TEMP362 =
                  (dtemp);
                
//#line 2128
dmax =
                  ((X10_TEMP362));
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var14____ = (__var79__).iterator(); __var14____.hasNext(); ) {
        	final  x10.
          lang.
          point __var14__ = (x10.
          lang.
          point) __var14____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
            
//#line 2112
final int X10_TEMP342 =
              (i +
                 dx_off);
            
//#line 2114
final int X10_TEMP66 =
              (X10_TEMP342);
            
//#line 2115
final double X10_TEMP349 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP66));
            
//#line 2117
final double X10_TEMP68 =
              (X10_TEMP349);
            
//#line 2118
final double X10_TEMP354 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP68));
            
//#line 2120
double dtemp =
              (X10_TEMP354);
            
//#line 2121
final boolean X10_TEMP71 =
              (dtemp >
                 dmax);
            
//#line 2122
if (X10_TEMP71) {
                
//#line 2123
final int X10_TEMP359 =
                  (i);
                
//#line 2125
itemp =
                  ((X10_TEMP359));
                
//#line 2126
final double X10_TEMP362 =
                  (dtemp);
                
//#line 2128
dmax =
                  ((X10_TEMP362));
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2131
return itemp;
    }
    
    
//#line 2133
public static double
                    Program_Linpack_epslon(
                    final Linpack X10_TEMP0,
                    final double x) {
        
//#line 2134
final double X10_TEMP210 =
          (4.0);
        
//#line 2136
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 2137
final double X10_TEMP213 =
          (3.0);
        
//#line 2139
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 2140
final double X10_TEMP216 =
          (X10_TEMP1 /
             X10_TEMP2);
        
//#line 2142
final double a =
          (X10_TEMP216);
        
//#line 2143
final int X10_TEMP219 =
          (0);
        
//#line 2145
double eps =
          (X10_TEMP219);
        
//#line 2146
final int X10_TEMP222 =
          (0);
        
//#line 2148
final int X10_TEMP5 =
          (X10_TEMP222);
        
//#line 2149
boolean X10_TEMP9 =
          (eps ==
             X10_TEMP5);
        
//#line 2150
boolean X10_TEMP227 =
          X10_TEMP9;
        
//#line 2151
while (X10_TEMP227) {
            
//#line 2152
final double X10_TEMP229 =
              (1.0);
            
//#line 2154
final double X10_TEMP10 =
              (X10_TEMP229);
            
//#line 2155
final double X10_TEMP232 =
              (a -
                 X10_TEMP10);
            
//#line 2157
double b =
              (X10_TEMP232);
            
//#line 2158
final double X10_TEMP235 =
              (b +
                 b);
            
//#line 2160
final double X10_TEMP12 =
              (X10_TEMP235);
            
//#line 2161
final double X10_TEMP238 =
              (X10_TEMP12 +
                 b);
            
//#line 2163
double c =
              (X10_TEMP238);
            
//#line 2164
final double X10_TEMP241 =
              (1.0);
            
//#line 2166
final double X10_TEMP14 =
              (X10_TEMP241);
            
//#line 2167
final double X10_TEMP244 =
              (c -
                 X10_TEMP14);
            
//#line 2169
final double X10_TEMP16 =
              (X10_TEMP244);
            
//#line 2170
final double X10_TEMP249 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP16));
            
//#line 2172
final double X10_TEMP18 =
              (X10_TEMP249);
            
//#line 2173
final double X10_TEMP252 =
              (X10_TEMP18);
            
//#line 2175
eps =
              ((X10_TEMP252));
            
//#line 2176
final int X10_TEMP255 =
              (0);
            
//#line 2178
final int X10_TEMP7 =
              (X10_TEMP255);
            
//#line 2179
final boolean X10_TEMP258 =
              (eps ==
                 X10_TEMP7);
            
//#line 2180
X10_TEMP9 =
              ((X10_TEMP258));
            
//#line 2181
X10_TEMP227 =
              X10_TEMP9;
        }
        
//#line 2183
final double X10_TEMP262 =
          (Program0.
             Program_Linpack_myabs(
             X10_TEMP0,
             x));
        
//#line 2185
final double X10_TEMP20 =
          (X10_TEMP262);
        
//#line 2186
final double X10_TEMP265 =
          (eps *
             X10_TEMP20);
        
//#line 2188
final double X10_TEMP22 =
          (X10_TEMP265);
        
//#line 2189
return X10_TEMP22;
    }
    
    
//#line 2191
public static void
                    Program_Linpack_dmxpy(
                    final Linpack X10_TEMP0,
                    final int n1,
                    final x10.
                      lang.
                      DoubleReferenceArray y,
                    final int n2,
                    final int ldm,
                    final x10.
                      lang.
                      DoubleReferenceArray x,
                    final x10.
                      lang.
                      DoubleReferenceArray m) {
        
//#line 2192
final int X10_TEMP210 =
          (0);
        
//#line 2194
final int X10_TEMP4 =
          (X10_TEMP210);
        
//#line 2195
final int X10_TEMP213 =
          (1);
        
//#line 2197
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 2198
final int X10_TEMP216 =
          (n2 -
             X10_TEMP2);
        
//#line 2200
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 2201
final int X10_TEMP219 =
          (0);
        
//#line 2203
final int X10_TEMP9 =
          (X10_TEMP219);
        
//#line 2204
final int X10_TEMP222 =
          (1);
        
//#line 2206
final int X10_TEMP7 =
          (X10_TEMP222);
        
//#line 2207
final int X10_TEMP225 =
          (n1 -
             X10_TEMP7);
        
//#line 2209
final int X10_TEMP10 =
          (X10_TEMP225);
        
//#line 2210
final x10.
          lang.
          region X10_TEMP232 =
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
                  X10_TEMP5),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP9,
                  X10_TEMP10))));
        
//#line 2212
final x10.
          lang.
          region X10_TEMP12 =
          (x10.
            lang.
            region)
            ((X10_TEMP232));
        
//#line 2213
/* template:forloop-mult { */{
        x10.lang.region __var82__ = (x10.lang.region) X10_TEMP12;
        if (__var82__.size() > 0 && (__var82__ instanceof x10.array.MultiDimRegion || __var82__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var83__ = __var82__.rank(0).low(), __var84__ = __var82__.rank(0).high(); __var83__ <= __var84__; __var83__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var85__ = __var82__.rank(1).low(), __var86__ = __var82__.rank(1).high(); __var85__ <= __var86__; __var85__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var83__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var85__;
        /* } */
        /* } */
{
            
//#line 2214
final int X10_TEMP236 =
              (0);
            
//#line 2216
final int X10_TEMP15 =
              (X10_TEMP236);
            
//#line 2217
final int X10_TEMP239 =
              (0);
            
//#line 2219
final int X10_TEMP18 =
              (X10_TEMP239);
            
//#line 2220
final double X10_TEMP244 =
              (/* template:array_get { */((x).get(/* Join: { */X10_TEMP18,j/* } */))/* } */);
            
//#line 2222
final double X10_TEMP22 =
              (X10_TEMP244);
            
//#line 2223
final double X10_TEMP251 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 m,
                 j,
                 i));
            
//#line 2225
final double X10_TEMP23 =
              (X10_TEMP251);
            
//#line 2226
final double X10_TEMP256 =
              (/* template:array_get { */((y).get(/* Join: { */X10_TEMP15,i/* } */))/* } */);
            
//#line 2228
final double X10_TEMP25 =
              (X10_TEMP256);
            
//#line 2229
final double X10_TEMP259 =
              (X10_TEMP22 *
                 X10_TEMP23);
            
//#line 2231
final double X10_TEMP26 =
              (X10_TEMP259);
            
//#line 2232
final double X10_TEMP262 =
              (X10_TEMP25 +
                 X10_TEMP26);
            
//#line 2234
final double X10_TEMP27 =
              (X10_TEMP262);
            
//#line 2235
final double X10_TEMP267 =
              (X10_TEMP27);
            
//#line 2237
final double X10_TEMP270 =
              (X10_TEMP267);
            
//#line 2238
/* template:array_set { */(y).set((X10_TEMP270),/* Join: { */X10_TEMP15,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var15____ = (__var82__).iterator(); __var15____.hasNext(); ) {
        	final  x10.
          lang.
          point __var15__ = (x10.
          lang.
          point) __var15____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var15__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var15__).get(1))/* } */;/* } */
{
            
//#line 2214
final int X10_TEMP236 =
              (0);
            
//#line 2216
final int X10_TEMP15 =
              (X10_TEMP236);
            
//#line 2217
final int X10_TEMP239 =
              (0);
            
//#line 2219
final int X10_TEMP18 =
              (X10_TEMP239);
            
//#line 2220
final double X10_TEMP244 =
              (/* template:array_get { */((x).get(/* Join: { */X10_TEMP18,j/* } */))/* } */);
            
//#line 2222
final double X10_TEMP22 =
              (X10_TEMP244);
            
//#line 2223
final double X10_TEMP251 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 m,
                 j,
                 i));
            
//#line 2225
final double X10_TEMP23 =
              (X10_TEMP251);
            
//#line 2226
final double X10_TEMP256 =
              (/* template:array_get { */((y).get(/* Join: { */X10_TEMP15,i/* } */))/* } */);
            
//#line 2228
final double X10_TEMP25 =
              (X10_TEMP256);
            
//#line 2229
final double X10_TEMP259 =
              (X10_TEMP22 *
                 X10_TEMP23);
            
//#line 2231
final double X10_TEMP26 =
              (X10_TEMP259);
            
//#line 2232
final double X10_TEMP262 =
              (X10_TEMP25 +
                 X10_TEMP26);
            
//#line 2234
final double X10_TEMP27 =
              (X10_TEMP262);
            
//#line 2235
final double X10_TEMP267 =
              (X10_TEMP27);
            
//#line 2237
final double X10_TEMP270 =
              (X10_TEMP267);
            
//#line 2238
/* template:array_set { */(y).set((X10_TEMP270),/* Join: { */X10_TEMP15,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 2241
public static void
                    Program_runMain(
                    ) {
        
//#line 2242
final Timer X10_TEMP210 =
          (new Timer(
             ));
        
//#line 2244
Timer tmr =
          (X10_TEMP210);
        
//#line 2245
final int X10_TEMP213 =
          (0);
        
//#line 2247
int count =
          (X10_TEMP213);
        
//#line 2248
Program0.
                        Program_Timer_start(
                        tmr,
                        count);
        
//#line 2249
final Linpack X10_TEMP218 =
          (new Linpack(
             ));
        
//#line 2251
final Linpack X10_TEMP4 =
          (X10_TEMP218);
        
//#line 2252
Program0.
                        Program_Linpack_run(
                        X10_TEMP4);
        
//#line 2253
Program0.
                        Program_Timer_stop(
                        tmr,
                        count);
        
//#line 2254
final java.
          lang.
          String X10_TEMP224 =
          ("Wall-clock time for linpack: ");
        
//#line 2256
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP224);
        
//#line 2257
final double X10_TEMP229 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 2259
final double X10_TEMP8 =
          (X10_TEMP229);
        
//#line 2260
final java.
          lang.
          String X10_TEMP232 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 2262
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP232);
        
//#line 2263
final java.
          lang.
          String X10_TEMP235 =
          (" secs");
        
//#line 2265
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP235);
        
//#line 2266
final java.
          lang.
          String X10_TEMP238 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 2268
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP238);
        
//#line 2269
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 2271
public static int
                    Program__Timer_max_counters_init(
                    ) {
        
//#line 2272
final int X10_TEMP210 =
          (64);
        
//#line 2274
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 2275
return X10_TEMP2;
    }
    
    
//#line 2277
public static void
                    Program_Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2278
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 2280
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 2281
final long X10_TEMP213 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 2283
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 2284
final double X10_TEMP216 =
          (X10_TEMP5);
        
//#line 2286
final double X10_TEMP6 =
          (X10_TEMP216);
        
//#line 2287
final double X10_TEMP220 =
          (X10_TEMP6);
        
//#line 2289
final double X10_TEMP223 =
          (X10_TEMP220);
        
//#line 2290
/* template:array_set { */(X10_TEMP1).set((X10_TEMP223),n)/* } */;
    }
    
    
//#line 2292
public static void
                    Program_Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2293
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 2295
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 2296
final long X10_TEMP213 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 2298
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 2299
final x10.
          lang.
          DoubleReferenceArray X10_TEMP216 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 2301
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP216));
        
//#line 2302
final double X10_TEMP220 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 2304
final double X10_TEMP6 =
          (X10_TEMP220);
        
//#line 2305
final double X10_TEMP223 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 2307
final double X10_TEMP9 =
          (X10_TEMP223);
        
//#line 2308
final double X10_TEMP226 =
          (X10_TEMP9);
        
//#line 2310
final double X10_TEMP10 =
          (X10_TEMP226);
        
//#line 2311
final double X10_TEMP230 =
          (X10_TEMP10);
        
//#line 2313
final double X10_TEMP233 =
          (X10_TEMP230);
        
//#line 2314
/* template:array_set { */(X10_TEMP1).set((X10_TEMP233),n)/* } */;
        
//#line 2315
final x10.
          lang.
          DoubleReferenceArray X10_TEMP235 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 2317
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP235));
        
//#line 2318
final double X10_TEMP239 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 2320
final double X10_TEMP14 =
          (X10_TEMP239);
        
//#line 2321
final int X10_TEMP242 =
          (1000);
        
//#line 2323
final double X10_TEMP15 =
          (X10_TEMP242);
        
//#line 2324
final double X10_TEMP245 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 2326
final double X10_TEMP16 =
          (X10_TEMP245);
        
//#line 2327
final double X10_TEMP249 =
          (X10_TEMP16);
        
//#line 2329
final double X10_TEMP252 =
          (X10_TEMP249);
        
//#line 2330
/* template:array_set { */(X10_TEMP11).set((X10_TEMP252),n)/* } */;
        
//#line 2331
final x10.
          lang.
          DoubleReferenceArray X10_TEMP254 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 2333
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP254));
        
//#line 2334
final x10.
          lang.
          DoubleReferenceArray X10_TEMP257 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 2336
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP257));
        
//#line 2337
final double X10_TEMP261 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 2339
final double X10_TEMP22 =
          (X10_TEMP261);
        
//#line 2340
final double X10_TEMP265 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 2342
final double X10_TEMP23 =
          (X10_TEMP265);
        
//#line 2343
final double X10_TEMP268 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 2345
final double X10_TEMP24 =
          (X10_TEMP268);
        
//#line 2346
final double X10_TEMP272 =
          (X10_TEMP24);
        
//#line 2348
final double X10_TEMP275 =
          (X10_TEMP272);
        
//#line 2349
/* template:array_set { */(X10_TEMP17).set((X10_TEMP275),n)/* } */;
    }
    
    
//#line 2351
public static double
                    Program_Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2352
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 2354
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 2355
final double X10_TEMP214 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 2357
final double X10_TEMP4 =
          (X10_TEMP214);
        
//#line 2358
return X10_TEMP4;
    }
    
    
//#line 2360
public static void
                    Program_Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 2361
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 2363
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 2364
final int X10_TEMP213 =
          (0);
        
//#line 2366
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 2367
final double X10_TEMP216 =
          (X10_TEMP5);
        
//#line 2369
final double X10_TEMP6 =
          (X10_TEMP216);
        
//#line 2370
final double X10_TEMP220 =
          (X10_TEMP6);
        
//#line 2372
final double X10_TEMP223 =
          (X10_TEMP220);
        
//#line 2373
/* template:array_set { */(X10_TEMP1).set((X10_TEMP223),n)/* } */;
        
//#line 2374
final x10.
          lang.
          DoubleReferenceArray X10_TEMP225 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 2376
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP225));
        
//#line 2377
final int X10_TEMP228 =
          (0);
        
//#line 2379
final double X10_TEMP11 =
          (X10_TEMP228);
        
//#line 2380
final double X10_TEMP231 =
          (X10_TEMP11);
        
//#line 2382
final double X10_TEMP12 =
          (X10_TEMP231);
        
//#line 2383
final double X10_TEMP235 =
          (X10_TEMP12);
        
//#line 2385
final double X10_TEMP238 =
          (X10_TEMP235);
        
//#line 2386
/* template:array_set { */(X10_TEMP7).set((X10_TEMP238),n)/* } */;
        
//#line 2387
final x10.
          lang.
          DoubleReferenceArray X10_TEMP240 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 2389
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP240));
        
//#line 2390
final int X10_TEMP243 =
          (0);
        
//#line 2392
final double X10_TEMP17 =
          (X10_TEMP243);
        
//#line 2393
final double X10_TEMP246 =
          (X10_TEMP17);
        
//#line 2395
final double X10_TEMP18 =
          (X10_TEMP246);
        
//#line 2396
final double X10_TEMP250 =
          (X10_TEMP18);
        
//#line 2398
final double X10_TEMP253 =
          (X10_TEMP250);
        
//#line 2399
/* template:array_set { */(X10_TEMP13).set((X10_TEMP253),n)/* } */;
    }
    
    
//#line 2401
public static void
                    Program_Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 2402
final int X10_TEMP210 =
          (0);
        
//#line 2404
int i =
          (X10_TEMP210);
        
//#line 2405
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 2406
boolean X10_TEMP215 =
          X10_TEMP4;
        
//#line 2407
while (X10_TEMP215) {
            
//#line 2408
Program0.
                            Program_Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 2409
final int X10_TEMP219 =
              (i);
            
//#line 2411
final int X10_TEMP6 =
              (X10_TEMP219);
            
//#line 2412
final int X10_TEMP7 =
              (1);
            
//#line 2413
final int X10_TEMP223 =
              (i +
                 X10_TEMP7);
            
//#line 2414
i =
              ((X10_TEMP223));
            
//#line 2415
final boolean X10_TEMP225 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 2416
X10_TEMP4 =
              ((X10_TEMP225));
            
//#line 2417
X10_TEMP215 =
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
    
    
//#line 2423
public Program() {
        
//#line 2423
super();
    }
}

class Linpack
extends x10.
  lang.
  Object
{
    
//#line 2427
public int
      setSize;
    
//#line 2428
public x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 2429
public x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 2430
public x10.
      lang.
      DoubleReferenceArray
      x;
    
//#line 2431
public double
      ops;
    
//#line 2432
public double
      total;
    
//#line 2433
public double
      norma;
    
//#line 2434
public double
      normx;
    
//#line 2435
public double
      resid;
    
//#line 2436
public double
      time;
    
//#line 2437
public double
      kf;
    
//#line 2438
public int
      n;
    
//#line 2439
public int
      i;
    
//#line 2440
public int
      ntimes;
    
//#line 2441
public int
      info;
    
//#line 2442
public int
      lda;
    
//#line 2443
public int
      ldaa;
    
//#line 2444
public int
      kflops;
    
//#line 2445
public x10.
      lang.
      IntReferenceArray
      ipvt;
    
//#line 2446
public int
      infodgefa;
    
    
//#line 2426
public Linpack() {
        
//#line 2426
super();
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 2452
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 2453
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 2454
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 2457
public Timer() {
        
//#line 2457
super();
        
//#line 2458
final int X10_TEMP210 =
          (0);
        
//#line 2460
int i =
          (X10_TEMP210);
        
//#line 2461
final int X10_TEMP213 =
          (0);
        
//#line 2463
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 2464
final int X10_TEMP216 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 2466
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 2467
final x10.
          lang.
          region X10_TEMP221 =
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
        
//#line 2469
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP221));
        
//#line 2470
final x10.
          lang.
          place X10_TEMP224 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 2472
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP224);
        
//#line 2473
final x10.
          lang.
          dist X10_TEMP227 =
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
        
//#line 2475
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP227));
        
//#line 2476
final x10.
          lang.
          DoubleReferenceArray X10_TEMP230 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2478
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP230));
        
//#line 2479
final x10.
          lang.
          DoubleReferenceArray X10_TEMP233 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 2481
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP233));
        
//#line 2482
final x10.
          lang.
          DoubleReferenceArray X10_TEMP236 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2484
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP236));
        
//#line 2485
final x10.
          lang.
          DoubleReferenceArray X10_TEMP239 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 2487
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP239));
        
//#line 2488
final x10.
          lang.
          DoubleReferenceArray X10_TEMP242 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2490
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP242));
        
//#line 2491
final x10.
          lang.
          DoubleReferenceArray X10_TEMP245 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 2493
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP245));
        
//#line 2494
final int X10_TEMP248 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 2496
final int X10_TEMP15 =
          (X10_TEMP248);
        
//#line 2497
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 2498
boolean X10_TEMP253 =
          X10_TEMP19;
        
//#line 2499
while (X10_TEMP253) {
            
//#line 2500
final int X10_TEMP255 =
              (0);
            
//#line 2502
final double X10_TEMP23 =
              (X10_TEMP255);
            
//#line 2503
final double X10_TEMP258 =
              (X10_TEMP23);
            
//#line 2505
final double X10_TEMP24 =
              (X10_TEMP258);
            
//#line 2506
final double X10_TEMP262 =
              (X10_TEMP24);
            
//#line 2508
final double X10_TEMP265 =
              (X10_TEMP262);
            
//#line 2509
/* template:array_set { */(start_time).set((X10_TEMP265),i)/* } */;
            
//#line 2510
final int X10_TEMP267 =
              (0);
            
//#line 2512
final double X10_TEMP28 =
              (X10_TEMP267);
            
//#line 2513
final double X10_TEMP270 =
              (X10_TEMP28);
            
//#line 2515
final double X10_TEMP29 =
              (X10_TEMP270);
            
//#line 2516
final double X10_TEMP274 =
              (X10_TEMP29);
            
//#line 2518
final double X10_TEMP277 =
              (X10_TEMP274);
            
//#line 2519
/* template:array_set { */(elapsed_time).set((X10_TEMP277),i)/* } */;
            
//#line 2520
final int X10_TEMP279 =
              (0);
            
//#line 2522
final double X10_TEMP33 =
              (X10_TEMP279);
            
//#line 2523
final double X10_TEMP282 =
              (X10_TEMP33);
            
//#line 2525
final double X10_TEMP34 =
              (X10_TEMP282);
            
//#line 2526
final double X10_TEMP286 =
              (X10_TEMP34);
            
//#line 2528
final double X10_TEMP289 =
              (X10_TEMP286);
            
//#line 2529
/* template:array_set { */(total_time).set((X10_TEMP289),i)/* } */;
            
//#line 2530
final int X10_TEMP291 =
              (i);
            
//#line 2532
final int X10_TEMP35 =
              (X10_TEMP291);
            
//#line 2533
final int X10_TEMP36 =
              (1);
            
//#line 2534
final int X10_TEMP295 =
              (i +
                 X10_TEMP36);
            
//#line 2535
i =
              ((X10_TEMP295));
            
//#line 2536
final int X10_TEMP297 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 2538
final int X10_TEMP17 =
              (X10_TEMP297);
            
//#line 2539
final boolean X10_TEMP300 =
              (i <
                 X10_TEMP17);
            
//#line 2540
X10_TEMP19 =
              ((X10_TEMP300));
            
//#line 2541
X10_TEMP253 =
              X10_TEMP19;
        }
    }
}
