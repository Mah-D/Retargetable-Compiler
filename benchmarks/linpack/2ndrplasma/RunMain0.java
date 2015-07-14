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
final public static x10.
      lang.
      dist
      _Program__Linpack_vd =
      Program0.
        _Program__Linpack_vd_init();
    
//#line 11
final public static x10.
      lang.
      IntReferenceArray
      _Program__Linpack_datasizes =
      Program0.
        _Program__Linpack_datasizes_init();
    
    
//#line 14
public static void
                  runMain(
                  ) {
        
//#line 15
Program0.
                      Program_runMain();
    }
    
    
//#line 17
public static x10.
                  lang.
                  region
                  _Program__Linpack_r_init(
                  ) {
        
//#line 19
final x10.
          lang.
          region X10_TEMP210 =
          (x10.
            lang.
            region)
            ((Program0.
                Program__Linpack_r_init()));
        
//#line 20
return X10_TEMP210;
    }
    
    
//#line 22
public static x10.
                  lang.
                  dist
                  _Program__Linpack_vd_init(
                  ) {
        
//#line 24
final x10.
          lang.
          dist X10_TEMP210 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program__Linpack_vd_init()));
        
//#line 25
return X10_TEMP210;
    }
    
    
//#line 27
public static x10.
                  lang.
                  IntReferenceArray
                  _Program__Linpack_datasizes_init(
                  ) {
        
//#line 29
final x10.
          lang.
          IntReferenceArray X10_TEMP210 =
          (x10.
            lang.
            IntReferenceArray)
            ((Program0.
                Program__Linpack_datasizes_init()));
        
//#line 30
return X10_TEMP210;
    }
    
    
//#line 32
public static void
                  Program_runMain(
                  ) {
        
//#line 33
final Linpack X10_TEMP210 =
          (new Linpack(
             ));
        
//#line 35
final Linpack X10_TEMP1 =
          (X10_TEMP210);
        
//#line 36
Program0.
                      Program_Linpack_run(
                      X10_TEMP1);
    }
    
    
//#line 38
public static x10.
                  lang.
                  region
                  Program__Linpack_r_init(
                  ) {
        
//#line 39
final int X10_TEMP210 =
          (0);
        
//#line 41
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 42
final int X10_TEMP213 =
          (2);
        
//#line 44
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 45
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
        
//#line 47
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP218));
        
//#line 48
return X10_TEMP6;
    }
    
    
//#line 50
public static x10.
                  lang.
                  dist
                  Program__Linpack_vd_init(
                  ) {
        
//#line 51
final x10.
          lang.
          place X10_TEMP210 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 53
final x10.
          lang.
          place X10_TEMP1 =
          (X10_TEMP210);
        
//#line 54
final x10.
          lang.
          dist X10_TEMP213 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                _Program__Linpack_r,
                X10_TEMP1)));
        
//#line 56
final x10.
          lang.
          dist X10_TEMP3 =
          (x10.
            lang.
            dist)
            ((X10_TEMP213));
        
//#line 57
return X10_TEMP3;
    }
    
    
//#line 59
public static x10.
                  lang.
                  IntReferenceArray
                  Program__Linpack_datasizes_init(
                  ) {
        
//#line 60
final x10.
          lang.
          IntReferenceArray X10_TEMP214 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(_Program__Linpack_vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p0/* } */, int dummy) { {
                  
//#line 61
final int X10_TEMP210 =
                    (0);
                  
//#line 63
final int X10_TEMP2 =
                    (X10_TEMP210);
                  
//#line 64
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 69
final x10.
          lang.
          IntReferenceArray X10_TEMP4 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP214));
        
//#line 70
return X10_TEMP4;
    }
    
    
//#line 72
public static void
                  Program_Linpack_initdataSizesArray(
                  final Linpack X10_TEMP0) {
        
//#line 73
final int X10_TEMP210 =
          (0);
        
//#line 75
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 76
final int X10_TEMP213 =
          (150);
        
//#line 78
final int X10_TEMP5 =
          (X10_TEMP213);
        
//#line 79
final int X10_TEMP216 =
          (X10_TEMP5);
        
//#line 81
final int X10_TEMP6 =
          (X10_TEMP216);
        
//#line 82
final int X10_TEMP220 =
          (X10_TEMP6);
        
//#line 84
final int X10_TEMP223 =
          (X10_TEMP220);
        
//#line 85
/* template:array_set { */(_Program__Linpack_datasizes).set((X10_TEMP223),X10_TEMP2)/* } */;
        
//#line 86
final int X10_TEMP225 =
          (1);
        
//#line 88
final int X10_TEMP8 =
          (X10_TEMP225);
        
//#line 89
final int X10_TEMP228 =
          (1000);
        
//#line 91
final int X10_TEMP11 =
          (X10_TEMP228);
        
//#line 92
final int X10_TEMP231 =
          (X10_TEMP11);
        
//#line 94
final int X10_TEMP12 =
          (X10_TEMP231);
        
//#line 95
final int X10_TEMP235 =
          (X10_TEMP12);
        
//#line 97
final int X10_TEMP238 =
          (X10_TEMP235);
        
//#line 98
/* template:array_set { */(_Program__Linpack_datasizes).set((X10_TEMP238),X10_TEMP8)/* } */;
        
//#line 99
final int X10_TEMP240 =
          (2);
        
//#line 101
final int X10_TEMP14 =
          (X10_TEMP240);
        
//#line 102
final int X10_TEMP243 =
          (2000);
        
//#line 104
final int X10_TEMP17 =
          (X10_TEMP243);
        
//#line 105
final int X10_TEMP246 =
          (X10_TEMP17);
        
//#line 107
final int X10_TEMP18 =
          (X10_TEMP246);
        
//#line 108
final int X10_TEMP250 =
          (X10_TEMP18);
        
//#line 110
final int X10_TEMP253 =
          (X10_TEMP250);
        
//#line 111
/* template:array_set { */(_Program__Linpack_datasizes).set((X10_TEMP253),X10_TEMP14)/* } */;
    }
    
    
//#line 113
public static void
                   Program_Linpack_JGFsetsize(
                   final Linpack X10_TEMP0,
                   final int setSize) {
        
//#line 114
int X10_TEMP1 =
          (setSize);
        
//#line 115
final int X10_TEMP211 =
          (X10_TEMP1);
        
//#line 117
final int X10_TEMP4 =
          (X10_TEMP211);
        
//#line 118
final int X10_TEMP214 =
          (X10_TEMP4);
        
//#line 120
final int X10_TEMP217 =
          (X10_TEMP214);
        
//#line 121
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize =
          ((X10_TEMP217));
    }
    
    
//#line 123
public static void
                   Program_Linpack_JGFinitialise(
                   final Linpack X10_TEMP0) {
        
//#line 124
Program0.
                       Program_Linpack_initdataSizesArray(
                       X10_TEMP0);
        
//#line 125
final int X10_TEMP211 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 127
final int X10_TEMP2 =
          (X10_TEMP211);
        
//#line 128
final int X10_TEMP215 =
          (/* template:array_get { */((_Program__Linpack_datasizes).get(X10_TEMP2))/* } */);
        
//#line 130
final int X10_TEMP5 =
          (X10_TEMP215);
        
//#line 131
final int X10_TEMP218 =
          (X10_TEMP5);
        
//#line 133
final int X10_TEMP6 =
          (X10_TEMP218);
        
//#line 134
final int X10_TEMP221 =
          (X10_TEMP6);
        
//#line 136
final int X10_TEMP224 =
          (X10_TEMP221);
        
//#line 137
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n =
          ((X10_TEMP224));
        
//#line 138
final java.
          lang.
          String X10_TEMP226 =
          ("ATTENTION: Running with smaller size (");
        
//#line 140
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP226);
        
//#line 141
final int X10_TEMP229 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 143
final int X10_TEMP8 =
          (X10_TEMP229);
        
//#line 144
final java.
          lang.
          String X10_TEMP232 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 146
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP232);
        
//#line 147
final java.
          lang.
          String X10_TEMP235 =
          (" instead of 500)");
        
//#line 149
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP235);
        
//#line 150
final java.
          lang.
          String X10_TEMP238 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 152
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP238);
        
//#line 153
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP12);
        
//#line 154
final int X10_TEMP242 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 156
final int X10_TEMP15 =
          (X10_TEMP242);
        
//#line 157
final int X10_TEMP245 =
          (X10_TEMP15);
        
//#line 159
final int X10_TEMP16 =
          (X10_TEMP245);
        
//#line 160
final int X10_TEMP248 =
          (X10_TEMP16);
        
//#line 162
final int X10_TEMP251 =
          (X10_TEMP248);
        
//#line 163
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa =
          ((X10_TEMP251));
        
//#line 164
final int X10_TEMP253 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 166
final int X10_TEMP17 =
          (X10_TEMP253);
        
//#line 167
final int X10_TEMP256 =
          (1);
        
//#line 169
final int X10_TEMP18 =
          (X10_TEMP256);
        
//#line 170
final int X10_TEMP259 =
          (X10_TEMP17 +
             X10_TEMP18);
        
//#line 172
final int X10_TEMP21 =
          (X10_TEMP259);
        
//#line 173
final int X10_TEMP262 =
          (X10_TEMP21);
        
//#line 175
final int X10_TEMP22 =
          (X10_TEMP262);
        
//#line 176
final int X10_TEMP265 =
          (X10_TEMP22);
        
//#line 178
final int X10_TEMP268 =
          (X10_TEMP265);
        
//#line 179
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda =
          ((X10_TEMP268));
        
//#line 180
final int X10_TEMP270 =
          (0);
        
//#line 182
final int X10_TEMP25 =
          (X10_TEMP270);
        
//#line 183
final int X10_TEMP273 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 185
final int X10_TEMP26 =
          (X10_TEMP273);
        
//#line 186
final x10.
          lang.
          region X10_TEMP278 =
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
                  X10_TEMP25,
                  X10_TEMP26))));
        
//#line 188
x10.
          lang.
          region vectorRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP278));
        
//#line 189
final int X10_TEMP281 =
          (0);
        
//#line 191
final int X10_TEMP32 =
          (X10_TEMP281);
        
//#line 192
final int X10_TEMP284 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 194
final int X10_TEMP29 =
          (X10_TEMP284);
        
//#line 195
final int X10_TEMP287 =
          (1);
        
//#line 197
final int X10_TEMP30 =
          (X10_TEMP287);
        
//#line 198
final int X10_TEMP290 =
          (X10_TEMP29 -
             X10_TEMP30);
        
//#line 200
final int X10_TEMP33 =
          (X10_TEMP290);
        
//#line 201
final x10.
          lang.
          region X10_TEMP295 =
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
                  X10_TEMP33))));
        
//#line 203
x10.
          lang.
          region vectorRegionMinus1 =
          (x10.
            lang.
            region)
            ((X10_TEMP295));
        
//#line 204
final x10.
          lang.
          place X10_TEMP298 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 206
final x10.
          lang.
          place X10_TEMP35 =
          (X10_TEMP298);
        
//#line 207
final x10.
          lang.
          dist X10_TEMP301 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                vectorRegionMinus1,
                X10_TEMP35)));
        
//#line 209
x10.
          lang.
          dist vectorRegionMinus1Dist =
          (x10.
            lang.
            dist)
            ((X10_TEMP301));
        
//#line 210
final int X10_TEMP304 =
          (0);
        
//#line 212
final int X10_TEMP39 =
          (X10_TEMP304);
        
//#line 213
final int X10_TEMP307 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ldaa);
        
//#line 215
final int X10_TEMP40 =
          (X10_TEMP307);
        
//#line 216
final int X10_TEMP310 =
          (0);
        
//#line 218
final int X10_TEMP43 =
          (X10_TEMP310);
        
//#line 219
final int X10_TEMP313 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 221
final int X10_TEMP44 =
          (X10_TEMP313);
        
//#line 222
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
                  X10_TEMP39,
                  X10_TEMP40),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP43,
                  X10_TEMP44))));
        
//#line 224
x10.
          lang.
          region rectangularRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP320));
        
//#line 225
final int X10_TEMP323 =
          (0);
        
//#line 227
final int X10_TEMP48 =
          (X10_TEMP323);
        
//#line 228
final int X10_TEMP326 =
          (0);
        
//#line 230
final int X10_TEMP49 =
          (X10_TEMP326);
        
//#line 231
final int X10_TEMP329 =
          (0);
        
//#line 233
final int X10_TEMP52 =
          (X10_TEMP329);
        
//#line 234
final int X10_TEMP332 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 236
final int X10_TEMP53 =
          (X10_TEMP332);
        
//#line 237
final x10.
          lang.
          region X10_TEMP339 =
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
                  X10_TEMP48,
                  X10_TEMP49),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP52,
                  X10_TEMP53))));
        
//#line 239
x10.
          lang.
          region slimRegion =
          (x10.
            lang.
            region)
            ((X10_TEMP339));
        
//#line 240
final x10.
          lang.
          place X10_TEMP342 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 242
final x10.
          lang.
          place X10_TEMP55 =
          (X10_TEMP342);
        
//#line 243
final x10.
          lang.
          dist X10_TEMP345 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                slimRegion,
                X10_TEMP55)));
        
//#line 245
x10.
          lang.
          dist slimRegionDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP345));
        
//#line 246
final int X10_TEMP348 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 248
final int X10_TEMP58 =
          (X10_TEMP348);
        
//#line 249
final int X10_TEMP351 =
          (1);
        
//#line 251
final int X10_TEMP59 =
          (X10_TEMP351);
        
//#line 252
final int X10_TEMP354 =
          (X10_TEMP58 +
             X10_TEMP59);
        
//#line 254
final int X10_TEMP61 =
          (X10_TEMP354);
        
//#line 255
final x10.
          lang.
          dist X10_TEMP359 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 255
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 255
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
               X10_TEMP61)));
        
//#line 257
final x10.
          lang.
          dist X10_TEMP62 =
          (x10.
            lang.
            dist)
            ((X10_TEMP359));
        
//#line 258
final x10.
          lang.
          dist X10_TEMP362 =
          (x10.
            lang.
            dist)
            ((X10_TEMP62));
        
//#line 260
x10.
          lang.
          dist rectangular_distribution =
          (x10.
            lang.
            dist)
            ((X10_TEMP362));
        
//#line 261
final x10.
          lang.
          DoubleReferenceArray X10_TEMP365 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rectangular_distribution,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 263
final x10.
          lang.
          DoubleReferenceArray X10_TEMP66 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP365));
        
//#line 264
final x10.
          lang.
          DoubleReferenceArray X10_TEMP368 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP66));
        
//#line 266
final x10.
          lang.
          DoubleReferenceArray X10_TEMP67 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP368));
        
//#line 267
final x10.
          lang.
          DoubleReferenceArray X10_TEMP371 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP67));
        
//#line 269
final x10.
          lang.
          DoubleReferenceArray X10_TEMP374 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP371));
        
//#line 270
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a =
          ((X10_TEMP374));
        
//#line 271
final x10.
          lang.
          DoubleReferenceArray X10_TEMP376 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 273
final x10.
          lang.
          DoubleReferenceArray X10_TEMP70 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP376));
        
//#line 274
final x10.
          lang.
          DoubleReferenceArray X10_TEMP379 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP70));
        
//#line 276
final x10.
          lang.
          DoubleReferenceArray X10_TEMP71 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP379));
        
//#line 277
final x10.
          lang.
          DoubleReferenceArray X10_TEMP382 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP71));
        
//#line 279
final x10.
          lang.
          DoubleReferenceArray X10_TEMP385 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP382));
        
//#line 280
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b =
          ((X10_TEMP385));
        
//#line 281
final x10.
          lang.
          DoubleReferenceArray X10_TEMP387 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 283
final x10.
          lang.
          DoubleReferenceArray X10_TEMP74 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP387));
        
//#line 284
final x10.
          lang.
          DoubleReferenceArray X10_TEMP390 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP74));
        
//#line 286
final x10.
          lang.
          DoubleReferenceArray X10_TEMP75 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP390));
        
//#line 287
final x10.
          lang.
          DoubleReferenceArray X10_TEMP393 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP75));
        
//#line 289
final x10.
          lang.
          DoubleReferenceArray X10_TEMP396 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP393));
        
//#line 290
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x =
          ((X10_TEMP396));
        
//#line 291
final x10.
          lang.
          IntReferenceArray X10_TEMP398 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vectorRegionMinus1Dist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 293
final x10.
          lang.
          IntReferenceArray X10_TEMP78 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP398));
        
//#line 294
final x10.
          lang.
          IntReferenceArray X10_TEMP401 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP78));
        
//#line 296
final x10.
          lang.
          IntReferenceArray X10_TEMP79 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP401));
        
//#line 297
final x10.
          lang.
          IntReferenceArray X10_TEMP404 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP79));
        
//#line 299
final x10.
          lang.
          IntReferenceArray X10_TEMP407 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP404));
        
//#line 300
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt =
          ((X10_TEMP407));
        
//#line 301
final int X10_TEMP409 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 303
final int X10_TEMP80 =
          (X10_TEMP409);
        
//#line 304
final long X10_TEMP412 =
          ((long)
             X10_TEMP80);
        
//#line 306
long nl =
          (X10_TEMP412);
        
//#line 307
final double X10_TEMP415 =
          (2.0);
        
//#line 309
final double X10_TEMP85 =
          (X10_TEMP415);
        
//#line 310
final long X10_TEMP418 =
          (nl *
             nl);
        
//#line 312
final long X10_TEMP82 =
          (X10_TEMP418);
        
//#line 313
final long X10_TEMP421 =
          (X10_TEMP82 *
             nl);
        
//#line 315
final long X10_TEMP84 =
          (X10_TEMP421);
        
//#line 316
final double X10_TEMP424 =
          (X10_TEMP85 *
             X10_TEMP84);
        
//#line 318
final double X10_TEMP87 =
          (X10_TEMP424);
        
//#line 319
final double X10_TEMP427 =
          (3.0);
        
//#line 321
final double X10_TEMP88 =
          (X10_TEMP427);
        
//#line 322
final double X10_TEMP430 =
          (X10_TEMP87 /
             X10_TEMP88);
        
//#line 324
final double X10_TEMP92 =
          (X10_TEMP430);
        
//#line 325
final double X10_TEMP433 =
          (2.0);
        
//#line 327
final double X10_TEMP91 =
          (X10_TEMP433);
        
//#line 328
final long X10_TEMP436 =
          (nl *
             nl);
        
//#line 330
final long X10_TEMP90 =
          (X10_TEMP436);
        
//#line 331
final double X10_TEMP439 =
          (X10_TEMP91 *
             X10_TEMP90);
        
//#line 333
final double X10_TEMP93 =
          (X10_TEMP439);
        
//#line 334
final double X10_TEMP442 =
          (X10_TEMP92 +
             X10_TEMP93);
        
//#line 336
final double X10_TEMP96 =
          (X10_TEMP442);
        
//#line 337
final double X10_TEMP445 =
          (X10_TEMP96);
        
//#line 339
final double X10_TEMP97 =
          (X10_TEMP445);
        
//#line 340
final double X10_TEMP448 =
          (X10_TEMP97);
        
//#line 342
final double X10_TEMP451 =
          (X10_TEMP448);
        
//#line 343
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ops =
          ((X10_TEMP451));
        
//#line 344
final x10.
          lang.
          DoubleReferenceArray X10_TEMP453 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 346
final x10.
          lang.
          DoubleReferenceArray X10_TEMP102 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP453));
        
//#line 347
final int X10_TEMP456 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 349
final int X10_TEMP103 =
          (X10_TEMP456);
        
//#line 350
final int X10_TEMP459 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 352
final int X10_TEMP104 =
          (X10_TEMP459);
        
//#line 353
final x10.
          lang.
          DoubleReferenceArray X10_TEMP462 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 355
final x10.
          lang.
          DoubleReferenceArray X10_TEMP105 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP462));
        
//#line 356
final double X10_TEMP470 =
          (Program0.
             Program_Linpack_matgen(
             X10_TEMP0,
             X10_TEMP102,
             X10_TEMP103,
             X10_TEMP104,
             X10_TEMP105));
        
//#line 358
final double X10_TEMP108 =
          (X10_TEMP470);
        
//#line 359
final double X10_TEMP473 =
          (X10_TEMP108);
        
//#line 361
final double X10_TEMP109 =
          (X10_TEMP473);
        
//#line 362
final double X10_TEMP476 =
          (X10_TEMP109);
        
//#line 364
final double X10_TEMP479 =
          (X10_TEMP476);
        
//#line 365
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma =
          ((X10_TEMP479));
    }
    
    
//#line 367
public static void
                   Program_Linpack_JGFkernel(
                   final Linpack X10_TEMP0) {
        
//#line 368
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 370
final x10.
          lang.
          DoubleReferenceArray X10_TEMP5 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 371
final int X10_TEMP213 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 373
final int X10_TEMP6 =
          (X10_TEMP213);
        
//#line 374
final int X10_TEMP216 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 376
final int X10_TEMP7 =
          (X10_TEMP216);
        
//#line 377
final x10.
          lang.
          IntReferenceArray X10_TEMP219 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt));
        
//#line 379
final x10.
          lang.
          IntReferenceArray X10_TEMP8 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP219));
        
//#line 380
final int X10_TEMP227 =
          (Program0.
             Program_Linpack_dgefa(
             X10_TEMP0,
             X10_TEMP5,
             X10_TEMP6,
             X10_TEMP7,
             X10_TEMP8));
        
//#line 382
final int X10_TEMP11 =
          (X10_TEMP227);
        
//#line 383
final int X10_TEMP230 =
          (X10_TEMP11);
        
//#line 385
final int X10_TEMP12 =
          (X10_TEMP230);
        
//#line 386
final int X10_TEMP233 =
          (X10_TEMP12);
        
//#line 388
final int X10_TEMP236 =
          (X10_TEMP233);
        
//#line 389
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.info =
          ((X10_TEMP236));
        
//#line 390
final x10.
          lang.
          DoubleReferenceArray X10_TEMP238 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 392
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP238));
        
//#line 393
final int X10_TEMP241 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 395
final int X10_TEMP20 =
          (X10_TEMP241);
        
//#line 396
final int X10_TEMP244 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 398
final int X10_TEMP21 =
          (X10_TEMP244);
        
//#line 399
final x10.
          lang.
          IntReferenceArray X10_TEMP247 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ipvt));
        
//#line 401
final x10.
          lang.
          IntReferenceArray X10_TEMP22 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP247));
        
//#line 402
final x10.
          lang.
          DoubleReferenceArray X10_TEMP250 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 404
final x10.
          lang.
          DoubleReferenceArray X10_TEMP23 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP250));
        
//#line 405
final int X10_TEMP253 =
          (0);
        
//#line 407
final int X10_TEMP24 =
          (X10_TEMP253);
        
//#line 408
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
    
    
//#line 410
public static void
                   Program_Linpack_JGFvalidate(
                   final Linpack X10_TEMP0) {
        
//#line 411
final double X10_TEMP210 =
          (0.0);
        
//#line 413
double eps =
          (X10_TEMP210);
        
//#line 414
final double X10_TEMP213 =
          (0.0);
        
//#line 416
double residn =
          (X10_TEMP213);
        
//#line 417
final x10.
          lang.
          DoubleReferenceArray X10_TEMP220 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(_Program__Linpack_vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 418
final double X10_TEMP216 =
                    (0.0);
                  
//#line 420
final double X10_TEMP4 =
                    (X10_TEMP216);
                  
//#line 421
return X10_TEMP4;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 426
final x10.
          lang.
          DoubleReferenceArray ref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP220));
        
//#line 427
final int X10_TEMP223 =
          (0);
        
//#line 429
final int X10_TEMP7 =
          (X10_TEMP223);
        
//#line 430
final double X10_TEMP226 =
          (6.0);
        
//#line 432
final double X10_TEMP10 =
          (X10_TEMP226);
        
//#line 433
final double X10_TEMP229 =
          (X10_TEMP10);
        
//#line 435
final double X10_TEMP11 =
          (X10_TEMP229);
        
//#line 436
final double X10_TEMP233 =
          (X10_TEMP11);
        
//#line 438
final double X10_TEMP236 =
          (X10_TEMP233);
        
//#line 439
/* template:array_set { */(ref).set((X10_TEMP236),X10_TEMP7)/* } */;
        
//#line 440
final int X10_TEMP238 =
          (1);
        
//#line 442
final int X10_TEMP13 =
          (X10_TEMP238);
        
//#line 443
final double X10_TEMP241 =
          (12.0);
        
//#line 445
final double X10_TEMP16 =
          (X10_TEMP241);
        
//#line 446
final double X10_TEMP244 =
          (X10_TEMP16);
        
//#line 448
final double X10_TEMP17 =
          (X10_TEMP244);
        
//#line 449
final double X10_TEMP248 =
          (X10_TEMP17);
        
//#line 451
final double X10_TEMP251 =
          (X10_TEMP248);
        
//#line 452
/* template:array_set { */(ref).set((X10_TEMP251),X10_TEMP13)/* } */;
        
//#line 453
final int X10_TEMP253 =
          (2);
        
//#line 455
final int X10_TEMP19 =
          (X10_TEMP253);
        
//#line 456
final double X10_TEMP256 =
          (20.0);
        
//#line 458
final double X10_TEMP22 =
          (X10_TEMP256);
        
//#line 459
final double X10_TEMP259 =
          (X10_TEMP22);
        
//#line 461
final double X10_TEMP23 =
          (X10_TEMP259);
        
//#line 462
final double X10_TEMP263 =
          (X10_TEMP23);
        
//#line 464
final double X10_TEMP266 =
          (X10_TEMP263);
        
//#line 465
/* template:array_set { */(ref).set((X10_TEMP266),X10_TEMP19)/* } */;
        
//#line 466
final int X10_TEMP268 =
          (0);
        
//#line 468
final int X10_TEMP26 =
          (X10_TEMP268);
        
//#line 469
final int X10_TEMP271 =
          (0);
        
//#line 471
final int X10_TEMP27 =
          (X10_TEMP271);
        
//#line 472
final int X10_TEMP274 =
          (0);
        
//#line 474
final int X10_TEMP30 =
          (X10_TEMP274);
        
//#line 475
final int X10_TEMP277 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 477
final int X10_TEMP31 =
          (X10_TEMP277);
        
//#line 478
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
        
//#line 480
final x10.
          lang.
          region tempR =
          (x10.
            lang.
            region)
            ((X10_TEMP284));
        
//#line 481
final x10.
          lang.
          place X10_TEMP287 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 483
final x10.
          lang.
          place X10_TEMP33 =
          (X10_TEMP287);
        
//#line 484
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
        
//#line 486
final x10.
          lang.
          dist tempdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP290));
        
//#line 487
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
/* Join: { *//* template:point-create { */
        final  x10.
          lang.
          point p = point.factory.point(/* Join: { */__var17__,__var19__/* } */);/* } */
{
            
//#line 488
final x10.
              lang.
              DoubleReferenceArray X10_TEMP294 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 490
final x10.
              lang.
              DoubleReferenceArray X10_TEMP36 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP294));
            
//#line 491
final int X10_TEMP297 =
              (0);
            
//#line 493
final int X10_TEMP39 =
              (X10_TEMP297);
            
//#line 494
final x10.
              lang.
              DoubleReferenceArray X10_TEMP300 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 496
final x10.
              lang.
              DoubleReferenceArray X10_TEMP40 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP300));
            
//#line 497
final int X10_TEMP303 =
              (0);
            
//#line 499
final int X10_TEMP43 =
              (X10_TEMP303);
            
//#line 500
final double X10_TEMP308 =
              (/* template:array_get { */((X10_TEMP40).get(/* Join: { */X10_TEMP43,i/* } */))/* } */);
            
//#line 502
final double X10_TEMP46 =
              (X10_TEMP308);
            
//#line 503
final double X10_TEMP311 =
              (X10_TEMP46);
            
//#line 505
final double X10_TEMP47 =
              (X10_TEMP311);
            
//#line 506
final double X10_TEMP316 =
              (X10_TEMP47);
            
//#line 508
final double X10_TEMP319 =
              (X10_TEMP316);
            
//#line 509
/* template:array_set { */(X10_TEMP36).set((X10_TEMP319),/* Join: { */X10_TEMP39,i/* } */)/* } */;
        }/* } *//* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator p__ = (__var16__).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((p).get(0))/* } */;
final int i =
          /* template:array_get { */((p).get(1))/* } */;/* } */
{
            
//#line 488
final x10.
              lang.
              DoubleReferenceArray X10_TEMP294 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 490
final x10.
              lang.
              DoubleReferenceArray X10_TEMP36 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP294));
            
//#line 491
final int X10_TEMP297 =
              (0);
            
//#line 493
final int X10_TEMP39 =
              (X10_TEMP297);
            
//#line 494
final x10.
              lang.
              DoubleReferenceArray X10_TEMP300 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 496
final x10.
              lang.
              DoubleReferenceArray X10_TEMP40 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP300));
            
//#line 497
final int X10_TEMP303 =
              (0);
            
//#line 499
final int X10_TEMP43 =
              (X10_TEMP303);
            
//#line 500
final double X10_TEMP308 =
              (/* template:array_get { */((X10_TEMP40).get(/* Join: { */X10_TEMP43,i/* } */))/* } */);
            
//#line 502
final double X10_TEMP46 =
              (X10_TEMP308);
            
//#line 503
final double X10_TEMP311 =
              (X10_TEMP46);
            
//#line 505
final double X10_TEMP47 =
              (X10_TEMP311);
            
//#line 506
final double X10_TEMP316 =
              (X10_TEMP47);
            
//#line 508
final double X10_TEMP319 =
              (X10_TEMP316);
            
//#line 509
/* template:array_set { */(X10_TEMP36).set((X10_TEMP319),/* Join: { */X10_TEMP39,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 511
final x10.
          lang.
          DoubleReferenceArray X10_TEMP321 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 513
final x10.
          lang.
          DoubleReferenceArray X10_TEMP52 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP321));
        
//#line 514
final int X10_TEMP324 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 516
final int X10_TEMP53 =
          (X10_TEMP324);
        
//#line 517
final int X10_TEMP327 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 519
final int X10_TEMP54 =
          (X10_TEMP327);
        
//#line 520
final x10.
          lang.
          DoubleReferenceArray X10_TEMP330 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 522
final x10.
          lang.
          DoubleReferenceArray X10_TEMP55 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP330));
        
//#line 523
final double X10_TEMP338 =
          (Program0.
             Program_Linpack_matgen(
             X10_TEMP0,
             X10_TEMP52,
             X10_TEMP53,
             X10_TEMP54,
             X10_TEMP55));
        
//#line 525
final double X10_TEMP58 =
          (X10_TEMP338);
        
//#line 526
final double X10_TEMP341 =
          (X10_TEMP58);
        
//#line 528
final double X10_TEMP59 =
          (X10_TEMP341);
        
//#line 529
final double X10_TEMP344 =
          (X10_TEMP59);
        
//#line 531
final double X10_TEMP347 =
          (X10_TEMP344);
        
//#line 532
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma =
          ((X10_TEMP347));
        
//#line 533
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
/* Join: { *//* template:point-create { */
        final  x10.
          lang.
          point p = point.factory.point(/* Join: { */__var22__,__var24__/* } */);/* } */
{
            
//#line 534
final x10.
              lang.
              DoubleReferenceArray X10_TEMP350 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 536
final x10.
              lang.
              DoubleReferenceArray X10_TEMP61 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP350));
            
//#line 537
final int X10_TEMP353 =
              (0);
            
//#line 539
final int X10_TEMP64 =
              (X10_TEMP353);
            
//#line 540
final x10.
              lang.
              DoubleReferenceArray X10_TEMP356 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 542
final x10.
              lang.
              DoubleReferenceArray X10_TEMP65 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP356));
            
//#line 543
final int X10_TEMP359 =
              (0);
            
//#line 545
final int X10_TEMP68 =
              (X10_TEMP359);
            
//#line 546
final double X10_TEMP364 =
              (/* template:array_get { */((X10_TEMP65).get(/* Join: { */X10_TEMP68,i/* } */))/* } */);
            
//#line 548
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 549
final int X10_TEMP70 =
              (0);
            
//#line 550
final double X10_TEMP368 =
              (X10_TEMP70 -
                 X10_TEMP69);
            
//#line 552
final double X10_TEMP73 =
              (X10_TEMP368);
            
//#line 553
final double X10_TEMP371 =
              (X10_TEMP73);
            
//#line 555
final double X10_TEMP74 =
              (X10_TEMP371);
            
//#line 556
final double X10_TEMP376 =
              (X10_TEMP74);
            
//#line 558
final double X10_TEMP379 =
              (X10_TEMP376);
            
//#line 559
/* template:array_set { */(X10_TEMP61).set((X10_TEMP379),/* Join: { */X10_TEMP64,i/* } */)/* } */;
        }/* } *//* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator p__ = (__var21__).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((p).get(0))/* } */;
final int i =
          /* template:array_get { */((p).get(1))/* } */;/* } */
{
            
//#line 534
final x10.
              lang.
              DoubleReferenceArray X10_TEMP350 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 536
final x10.
              lang.
              DoubleReferenceArray X10_TEMP61 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP350));
            
//#line 537
final int X10_TEMP353 =
              (0);
            
//#line 539
final int X10_TEMP64 =
              (X10_TEMP353);
            
//#line 540
final x10.
              lang.
              DoubleReferenceArray X10_TEMP356 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 542
final x10.
              lang.
              DoubleReferenceArray X10_TEMP65 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP356));
            
//#line 543
final int X10_TEMP359 =
              (0);
            
//#line 545
final int X10_TEMP68 =
              (X10_TEMP359);
            
//#line 546
final double X10_TEMP364 =
              (/* template:array_get { */((X10_TEMP65).get(/* Join: { */X10_TEMP68,i/* } */))/* } */);
            
//#line 548
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 549
final int X10_TEMP70 =
              (0);
            
//#line 550
final double X10_TEMP368 =
              (X10_TEMP70 -
                 X10_TEMP69);
            
//#line 552
final double X10_TEMP73 =
              (X10_TEMP368);
            
//#line 553
final double X10_TEMP371 =
              (X10_TEMP73);
            
//#line 555
final double X10_TEMP74 =
              (X10_TEMP371);
            
//#line 556
final double X10_TEMP376 =
              (X10_TEMP74);
            
//#line 558
final double X10_TEMP379 =
              (X10_TEMP376);
            
//#line 559
/* template:array_set { */(X10_TEMP61).set((X10_TEMP379),/* Join: { */X10_TEMP64,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 561
final int X10_TEMP381 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 563
final int X10_TEMP81 =
          (X10_TEMP381);
        
//#line 564
final x10.
          lang.
          DoubleReferenceArray X10_TEMP384 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
        
//#line 566
final x10.
          lang.
          DoubleReferenceArray X10_TEMP82 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP384));
        
//#line 567
final int X10_TEMP387 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 569
final int X10_TEMP83 =
          (X10_TEMP387);
        
//#line 570
final int X10_TEMP390 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lda);
        
//#line 572
final int X10_TEMP84 =
          (X10_TEMP390);
        
//#line 573
final x10.
          lang.
          DoubleReferenceArray X10_TEMP393 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
        
//#line 575
final x10.
          lang.
          DoubleReferenceArray X10_TEMP85 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP393));
        
//#line 576
final x10.
          lang.
          DoubleReferenceArray X10_TEMP396 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 578
final x10.
          lang.
          DoubleReferenceArray X10_TEMP86 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP396));
        
//#line 579
Program0.
                       Program_Linpack_dmxpy(
                       X10_TEMP0,
                       X10_TEMP81,
                       X10_TEMP82,
                       X10_TEMP83,
                       X10_TEMP84,
                       X10_TEMP85,
                       X10_TEMP86);
        
//#line 580
final double X10_TEMP406 =
          (0.0);
        
//#line 582
final double X10_TEMP89 =
          (X10_TEMP406);
        
//#line 583
final double X10_TEMP409 =
          (X10_TEMP89);
        
//#line 585
final double X10_TEMP90 =
          (X10_TEMP409);
        
//#line 586
final double X10_TEMP412 =
          (X10_TEMP90);
        
//#line 588
final double X10_TEMP415 =
          (X10_TEMP412);
        
//#line 589
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
          ((X10_TEMP415));
        
//#line 590
final double X10_TEMP417 =
          (0.0);
        
//#line 592
final double X10_TEMP93 =
          (X10_TEMP417);
        
//#line 593
final double X10_TEMP420 =
          (X10_TEMP93);
        
//#line 595
final double X10_TEMP94 =
          (X10_TEMP420);
        
//#line 596
final double X10_TEMP423 =
          (X10_TEMP94);
        
//#line 598
final double X10_TEMP426 =
          (X10_TEMP423);
        
//#line 599
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
          ((X10_TEMP426));
        
//#line 600
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
/* Join: { *//* template:point-create { */
        final  x10.
          lang.
          point p = point.factory.point(/* Join: { */__var27__,__var29__/* } */);/* } */
{
            
//#line 601
final double X10_TEMP429 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
            
//#line 603
final double X10_TEMP102 =
              (X10_TEMP429);
            
//#line 604
final x10.
              lang.
              DoubleReferenceArray X10_TEMP432 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 606
final x10.
              lang.
              DoubleReferenceArray X10_TEMP96 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP432));
            
//#line 607
final int X10_TEMP435 =
              (0);
            
//#line 609
final int X10_TEMP99 =
              (X10_TEMP435);
            
//#line 610
final double X10_TEMP440 =
              (/* template:array_get { */((X10_TEMP96).get(/* Join: { */X10_TEMP99,i/* } */))/* } */);
            
//#line 612
final double X10_TEMP101 =
              (X10_TEMP440);
            
//#line 613
final double X10_TEMP445 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP101));
            
//#line 615
final double X10_TEMP103 =
              (X10_TEMP445);
            
//#line 616
final boolean X10_TEMP448 =
              (X10_TEMP102 >
                 X10_TEMP103);
            
//#line 618
final boolean X10_TEMP105 =
              (X10_TEMP448);
            
//#line 619
final boolean X10_TEMP106 =
              (X10_TEMP105);
            
//#line 620
final x10.
              lang.
              DoubleReferenceArray X10_TEMP452 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 622
final x10.
              lang.
              DoubleReferenceArray X10_TEMP108 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP452));
            
//#line 623
final int X10_TEMP455 =
              (0);
            
//#line 625
final int X10_TEMP111 =
              (X10_TEMP455);
            
//#line 626
final double X10_TEMP460 =
              (/* template:array_get { */((X10_TEMP108).get(/* Join: { */X10_TEMP111,i/* } */))/* } */);
            
//#line 628
final double X10_TEMP113 =
              (X10_TEMP460);
            
//#line 629
double X10_TEMP115 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP113));
            
//#line 630
if (X10_TEMP106) {
                
//#line 631
final double X10_TEMP467 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
                
//#line 632
X10_TEMP115 =
                  ((X10_TEMP467));
            }
            
//#line 634
final double X10_TEMP116 =
              (X10_TEMP115);
            
//#line 635
final double X10_TEMP470 =
              (X10_TEMP116);
            
//#line 637
final double X10_TEMP118 =
              (X10_TEMP470);
            
//#line 638
final double X10_TEMP473 =
              (X10_TEMP118);
            
//#line 640
final double X10_TEMP476 =
              (X10_TEMP473);
            
//#line 641
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
              ((X10_TEMP476));
            
//#line 642
final double X10_TEMP478 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
            
//#line 644
final double X10_TEMP125 =
              (X10_TEMP478);
            
//#line 645
final x10.
              lang.
              DoubleReferenceArray X10_TEMP481 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 647
final x10.
              lang.
              DoubleReferenceArray X10_TEMP119 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP481));
            
//#line 648
final int X10_TEMP484 =
              (0);
            
//#line 650
final int X10_TEMP122 =
              (X10_TEMP484);
            
//#line 651
final double X10_TEMP489 =
              (/* template:array_get { */((X10_TEMP119).get(/* Join: { */X10_TEMP122,i/* } */))/* } */);
            
//#line 653
final double X10_TEMP124 =
              (X10_TEMP489);
            
//#line 654
final double X10_TEMP494 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP124));
            
//#line 656
final double X10_TEMP126 =
              (X10_TEMP494);
            
//#line 657
final boolean X10_TEMP497 =
              (X10_TEMP125 >
                 X10_TEMP126);
            
//#line 659
final boolean X10_TEMP128 =
              (X10_TEMP497);
            
//#line 660
final boolean X10_TEMP129 =
              (X10_TEMP128);
            
//#line 661
final x10.
              lang.
              DoubleReferenceArray X10_TEMP501 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 663
final x10.
              lang.
              DoubleReferenceArray X10_TEMP131 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP501));
            
//#line 664
final int X10_TEMP504 =
              (0);
            
//#line 666
final int X10_TEMP134 =
              (X10_TEMP504);
            
//#line 667
final double X10_TEMP509 =
              (/* template:array_get { */((X10_TEMP131).get(/* Join: { */X10_TEMP134,i/* } */))/* } */);
            
//#line 669
final double X10_TEMP136 =
              (X10_TEMP509);
            
//#line 670
double X10_TEMP138 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP136));
            
//#line 671
if (X10_TEMP129) {
                
//#line 672
final double X10_TEMP516 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
                
//#line 673
X10_TEMP138 =
                  ((X10_TEMP516));
            }
            
//#line 675
final double X10_TEMP139 =
              (X10_TEMP138);
            
//#line 676
final double X10_TEMP519 =
              (X10_TEMP139);
            
//#line 678
final double X10_TEMP141 =
              (X10_TEMP519);
            
//#line 679
final double X10_TEMP522 =
              (X10_TEMP141);
            
//#line 681
final double X10_TEMP525 =
              (X10_TEMP522);
            
//#line 682
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
              ((X10_TEMP525));
        }/* } *//* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator p__ = (__var26__).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((p).get(0))/* } */;
final int i =
          /* template:array_get { */((p).get(1))/* } */;/* } */
{
            
//#line 601
final double X10_TEMP429 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
            
//#line 603
final double X10_TEMP102 =
              (X10_TEMP429);
            
//#line 604
final x10.
              lang.
              DoubleReferenceArray X10_TEMP432 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 606
final x10.
              lang.
              DoubleReferenceArray X10_TEMP96 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP432));
            
//#line 607
final int X10_TEMP435 =
              (0);
            
//#line 609
final int X10_TEMP99 =
              (X10_TEMP435);
            
//#line 610
final double X10_TEMP440 =
              (/* template:array_get { */((X10_TEMP96).get(/* Join: { */X10_TEMP99,i/* } */))/* } */);
            
//#line 612
final double X10_TEMP101 =
              (X10_TEMP440);
            
//#line 613
final double X10_TEMP445 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP101));
            
//#line 615
final double X10_TEMP103 =
              (X10_TEMP445);
            
//#line 616
final boolean X10_TEMP448 =
              (X10_TEMP102 >
                 X10_TEMP103);
            
//#line 618
final boolean X10_TEMP105 =
              (X10_TEMP448);
            
//#line 619
final boolean X10_TEMP106 =
              (X10_TEMP105);
            
//#line 620
final x10.
              lang.
              DoubleReferenceArray X10_TEMP452 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.b));
            
//#line 622
final x10.
              lang.
              DoubleReferenceArray X10_TEMP108 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP452));
            
//#line 623
final int X10_TEMP455 =
              (0);
            
//#line 625
final int X10_TEMP111 =
              (X10_TEMP455);
            
//#line 626
final double X10_TEMP460 =
              (/* template:array_get { */((X10_TEMP108).get(/* Join: { */X10_TEMP111,i/* } */))/* } */);
            
//#line 628
final double X10_TEMP113 =
              (X10_TEMP460);
            
//#line 629
double X10_TEMP115 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP113));
            
//#line 630
if (X10_TEMP106) {
                
//#line 631
final double X10_TEMP467 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
                
//#line 632
X10_TEMP115 =
                  ((X10_TEMP467));
            }
            
//#line 634
final double X10_TEMP116 =
              (X10_TEMP115);
            
//#line 635
final double X10_TEMP470 =
              (X10_TEMP116);
            
//#line 637
final double X10_TEMP118 =
              (X10_TEMP470);
            
//#line 638
final double X10_TEMP473 =
              (X10_TEMP118);
            
//#line 640
final double X10_TEMP476 =
              (X10_TEMP473);
            
//#line 641
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid =
              ((X10_TEMP476));
            
//#line 642
final double X10_TEMP478 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
            
//#line 644
final double X10_TEMP125 =
              (X10_TEMP478);
            
//#line 645
final x10.
              lang.
              DoubleReferenceArray X10_TEMP481 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 647
final x10.
              lang.
              DoubleReferenceArray X10_TEMP119 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP481));
            
//#line 648
final int X10_TEMP484 =
              (0);
            
//#line 650
final int X10_TEMP122 =
              (X10_TEMP484);
            
//#line 651
final double X10_TEMP489 =
              (/* template:array_get { */((X10_TEMP119).get(/* Join: { */X10_TEMP122,i/* } */))/* } */);
            
//#line 653
final double X10_TEMP124 =
              (X10_TEMP489);
            
//#line 654
final double X10_TEMP494 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP124));
            
//#line 656
final double X10_TEMP126 =
              (X10_TEMP494);
            
//#line 657
final boolean X10_TEMP497 =
              (X10_TEMP125 >
                 X10_TEMP126);
            
//#line 659
final boolean X10_TEMP128 =
              (X10_TEMP497);
            
//#line 660
final boolean X10_TEMP129 =
              (X10_TEMP128);
            
//#line 661
final x10.
              lang.
              DoubleReferenceArray X10_TEMP501 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
            
//#line 663
final x10.
              lang.
              DoubleReferenceArray X10_TEMP131 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP501));
            
//#line 664
final int X10_TEMP504 =
              (0);
            
//#line 666
final int X10_TEMP134 =
              (X10_TEMP504);
            
//#line 667
final double X10_TEMP509 =
              (/* template:array_get { */((X10_TEMP131).get(/* Join: { */X10_TEMP134,i/* } */))/* } */);
            
//#line 669
final double X10_TEMP136 =
              (X10_TEMP509);
            
//#line 670
double X10_TEMP138 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP136));
            
//#line 671
if (X10_TEMP129) {
                
//#line 672
final double X10_TEMP516 =
                  (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
                
//#line 673
X10_TEMP138 =
                  ((X10_TEMP516));
            }
            
//#line 675
final double X10_TEMP139 =
              (X10_TEMP138);
            
//#line 676
final double X10_TEMP519 =
              (X10_TEMP139);
            
//#line 678
final double X10_TEMP141 =
              (X10_TEMP519);
            
//#line 679
final double X10_TEMP522 =
              (X10_TEMP141);
            
//#line 681
final double X10_TEMP525 =
              (X10_TEMP522);
            
//#line 682
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx =
              ((X10_TEMP525));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 684
final double X10_TEMP527 =
          (1.0);
        
//#line 686
final double X10_TEMP142 =
          (X10_TEMP527);
        
//#line 687
final double X10_TEMP530 =
          ((double)
             X10_TEMP142);
        
//#line 689
final double X10_TEMP144 =
          (X10_TEMP530);
        
//#line 690
final double X10_TEMP535 =
          (Program0.
             Program_Linpack_epslon(
             X10_TEMP0,
             X10_TEMP144));
        
//#line 692
final double X10_TEMP146 =
          (X10_TEMP535);
        
//#line 693
final double X10_TEMP538 =
          (X10_TEMP146);
        
//#line 695
eps =
          ((X10_TEMP538));
        
//#line 696
final double X10_TEMP541 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.resid);
        
//#line 698
final double X10_TEMP154 =
          (X10_TEMP541);
        
//#line 699
final int X10_TEMP544 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.n);
        
//#line 701
final double X10_TEMP147 =
          (X10_TEMP544);
        
//#line 702
final double X10_TEMP547 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.norma);
        
//#line 704
final double X10_TEMP148 =
          (X10_TEMP547);
        
//#line 705
final double X10_TEMP550 =
          (X10_TEMP147 *
             X10_TEMP148);
        
//#line 707
final double X10_TEMP149 =
          (X10_TEMP550);
        
//#line 708
final double X10_TEMP553 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.normx);
        
//#line 710
final double X10_TEMP150 =
          (X10_TEMP553);
        
//#line 711
final double X10_TEMP556 =
          (X10_TEMP149 *
             X10_TEMP150);
        
//#line 713
final double X10_TEMP151 =
          (X10_TEMP556);
        
//#line 714
final double X10_TEMP559 =
          (X10_TEMP151 *
             eps);
        
//#line 716
final double X10_TEMP153 =
          (X10_TEMP559);
        
//#line 717
final double X10_TEMP562 =
          (X10_TEMP154 /
             X10_TEMP153);
        
//#line 719
final double X10_TEMP156 =
          (X10_TEMP562);
        
//#line 720
final double X10_TEMP565 =
          (X10_TEMP156);
        
//#line 722
residn =
          ((X10_TEMP565));
        
//#line 723
final int X10_TEMP568 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 725
final int X10_TEMP158 =
          (X10_TEMP568);
        
//#line 726
final double X10_TEMP572 =
          (/* template:array_get { */((ref).get(X10_TEMP158))/* } */);
        
//#line 728
final double X10_TEMP159 =
          (X10_TEMP572);
        
//#line 729
final boolean X10_TEMP161 =
          (residn >
             X10_TEMP159);
        
//#line 730
if (X10_TEMP161) {
            
//#line 731
final java.
              lang.
              String X10_TEMP577 =
              ("Validation failed");
            
//#line 733
final java.
              lang.
              String X10_TEMP163 =
              (X10_TEMP577);
            
//#line 734
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP163);
            
//#line 735
final java.
              lang.
              String X10_TEMP581 =
              ("Computed Norm Res = ");
            
//#line 737
final java.
              lang.
              String X10_TEMP164 =
              (X10_TEMP581);
            
//#line 738
final java.
              lang.
              String X10_TEMP584 =
              (X10_TEMP164 +
               residn);
            
//#line 740
final java.
              lang.
              String X10_TEMP166 =
              (X10_TEMP584);
            
//#line 741
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP166);
            
//#line 742
final java.
              lang.
              String X10_TEMP588 =
              ("Reference Norm Res = ");
            
//#line 744
final java.
              lang.
              String X10_TEMP169 =
              (X10_TEMP588);
            
//#line 745
final int X10_TEMP591 =
              (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
            
//#line 747
final int X10_TEMP168 =
              (X10_TEMP591);
            
//#line 748
final double X10_TEMP595 =
              (/* template:array_get { */((ref).get(X10_TEMP168))/* } */);
            
//#line 750
final double X10_TEMP170 =
              (X10_TEMP595);
            
//#line 751
final java.
              lang.
              String X10_TEMP598 =
              (X10_TEMP169 +
               X10_TEMP170);
            
//#line 753
final java.
              lang.
              String X10_TEMP172 =
              (X10_TEMP598);
            
//#line 754
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP172);
            
//#line 755
final java.
              lang.
              String X10_TEMP602 =
              ("Validation failed");
            
//#line 757
final java.
              lang.
              String X10_TEMP174 =
              (X10_TEMP602);
            
//#line 758
throw new java.
              lang.
              RuntimeException(
              X10_TEMP174);
        }
    }
    
    
//#line 761
public static void
                   Program_Linpack_JGFtidyup(
                   final Linpack X10_TEMP0) {
        
    }
    
    
//#line 763
public static void
                   Program_Linpack_run(
                   final Linpack X10_TEMP0) {
        
//#line 764
final int X10_TEMP210 =
          (0);
        
//#line 766
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 767
Program0.
                       Program_Linpack_JGFsetsize(
                       X10_TEMP0,
                       X10_TEMP2);
        
//#line 768
Program0.
                       Program_Linpack_JGFinitialise(
                       X10_TEMP0);
        
//#line 769
Program0.
                       Program_Linpack_JGFkernel(
                       X10_TEMP0);
        
//#line 770
Program0.
                       Program_Linpack_JGFvalidate(
                       X10_TEMP0);
        
//#line 771
Program0.
                       Program_Linpack_JGFtidyup(
                       X10_TEMP0);
    }
    
    
//#line 773
public static double
                   Program_Linpack_read(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j) {
        
//#line 774
final x10.
          lang.
          place X10_TEMP210 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 776
final x10.
          lang.
          place curr_place =
          (X10_TEMP210);
        
//#line 777
final int X10_TEMP213 =
          (0);
        
//#line 779
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 780
final int X10_TEMP216 =
          (0);
        
//#line 782
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 783
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
        
//#line 785
final x10.
          lang.
          region tempr =
          (x10.
            lang.
            region)
            ((X10_TEMP221));
        
//#line 786
final x10.
          lang.
          place X10_TEMP224 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 788
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP224);
        
//#line 789
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
        
//#line 791
final x10.
          lang.
          dist tempvd =
          (x10.
            lang.
            dist)
            ((X10_TEMP227));
        
//#line 792
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
                  
//#line 793
final double X10_TEMP230 =
                    (0.0);
                  
//#line 795
final double X10_TEMP10 =
                    (X10_TEMP230);
                  
//#line 796
return X10_TEMP10;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 801
final x10.
          lang.
          DoubleReferenceArray tempref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP234));
        
//#line 802
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 803
final x10.
              lang.
              dist X10_TEMP237 =
              (x10.
                lang.
                dist)
                ((a.
                    distribution));
            
//#line 805
final x10.
              lang.
              dist X10_TEMP12 =
              (x10.
                lang.
                dist)
                ((X10_TEMP237));
            
//#line 806
final x10.
              lang.
              place X10_TEMP16 =
              (X10_TEMP12.
                 get(
                 i,
                 j));
            
//#line 807
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP16)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 808
final double X10_TEMP246 =
                  (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 810
final double temp =
                  (X10_TEMP246);
                
//#line 811
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 812
final int X10_TEMP250 =
                      (0);
                    
//#line 814
final int X10_TEMP22 =
                      (X10_TEMP250);
                    
//#line 815
final double X10_TEMP253 =
                      (temp);
                    
//#line 817
final double X10_TEMP25 =
                      (X10_TEMP253);
                    
//#line 818
final double X10_TEMP257 =
                      (X10_TEMP25);
                    
//#line 820
final double X10_TEMP260 =
                      (X10_TEMP257);
                    
//#line 821
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
        
        
//#line 825
final int X10_TEMP262 =
          (0);
        
//#line 827
final int X10_TEMP27 =
          (X10_TEMP262);
        
//#line 828
final double X10_TEMP266 =
          (/* template:array_get { */((tempref).get(X10_TEMP27))/* } */);
        
//#line 830
final double X10_TEMP29 =
          (X10_TEMP266);
        
//#line 831
return X10_TEMP29;
    }
    
    
//#line 833
public static void
                   Program_Linpack_write(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j,
                   final double val) {
        
//#line 834
final x10.
          lang.
          dist X10_TEMP210 =
          (x10.
            lang.
            dist)
            ((a.
                distribution));
        
//#line 836
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP210));
        
//#line 837
final x10.
          lang.
          place X10_TEMP5 =
          (X10_TEMP1.
             get(
             i,
             j));
        
//#line 838
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP5)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 839
final double X10_TEMP217 =
              (val);
            
//#line 841
final double X10_TEMP10 =
              (X10_TEMP217);
            
//#line 842
final double X10_TEMP222 =
              (X10_TEMP10);
            
//#line 844
final double X10_TEMP225 =
              (X10_TEMP222);
            
//#line 845
/* template:array_set { */(a).set((X10_TEMP225),/* Join: { */i,j/* } */)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 848
public static void
                   Program_Linpack_plusWrite(
                   final Linpack X10_TEMP0,
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j,
                   final double val) {
        
//#line 849
final x10.
          lang.
          dist X10_TEMP210 =
          (x10.
            lang.
            dist)
            ((a.
                distribution));
        
//#line 851
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP210));
        
//#line 852
final x10.
          lang.
          place X10_TEMP5 =
          (X10_TEMP1.
             get(
             i,
             j));
        
//#line 853
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP5)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 854
final double X10_TEMP219 =
              (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 856
final double X10_TEMP9 =
              (X10_TEMP219);
            
//#line 857
final double X10_TEMP222 =
              (X10_TEMP9 +
                 val);
            
//#line 859
final double X10_TEMP10 =
              (X10_TEMP222);
            
//#line 860
final double X10_TEMP227 =
              (X10_TEMP10);
            
//#line 862
final double X10_TEMP230 =
              (X10_TEMP227);
            
//#line 863
/* template:array_set { */(a).set((X10_TEMP230),/* Join: { */i,j/* } */)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 866
public static double
                   Program_Linpack_myabs(
                   final Linpack X10_TEMP0,
                   final double d) {
        
//#line 867
double X10_TEMP1 =
          (d);
        
//#line 868
final int X10_TEMP211 =
          (0);
        
//#line 870
final int X10_TEMP2 =
          (X10_TEMP211);
        
//#line 871
final boolean X10_TEMP214 =
          (X10_TEMP1 >=
             X10_TEMP2);
        
//#line 873
final boolean X10_TEMP4 =
          (X10_TEMP214);
        
//#line 874
final boolean X10_TEMP5 =
          (X10_TEMP4);
        
//#line 875
final int X10_TEMP7 =
          (0);
        
//#line 876
double X10_TEMP9 =
          (X10_TEMP7 -
             X10_TEMP1);
        
//#line 877
if (X10_TEMP5) {
            
//#line 878
X10_TEMP9 =
              ((X10_TEMP1));
        }
        
//#line 880
final double X10_TEMP10 =
          (X10_TEMP9);
        
//#line 881
return X10_TEMP10;
    }
    
    
//#line 883
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
        
//#line 884
final int X10_TEMP210 =
          (1325);
        
//#line 886
int init =
          (X10_TEMP210);
        
//#line 887
final double X10_TEMP213 =
          (0.0);
        
//#line 889
double norma =
          (X10_TEMP213);
        
//#line 890
/* template:forloop-mult { */{
        x10.lang.region __var32__ = (x10.lang.region) a.
                                                        distribution.
                                                        region;
        if (__var32__.size() > 0 && (__var32__ instanceof x10.array.MultiDimRegion || __var32__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var33__ = __var32__.rank(0).low(), __var34__ = __var32__.rank(0).high(); __var33__ <= __var34__; __var33__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var35__ = __var32__.rank(1).low(), __var36__ = __var32__.rank(1).high(); __var35__ <= __var36__; __var35__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var33__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var35__;
        /* } */
        /* } */
{
            
//#line 891
final int X10_TEMP217 =
              (3125);
            
//#line 893
final int X10_TEMP4 =
              (X10_TEMP217);
            
//#line 894
final int X10_TEMP220 =
              (X10_TEMP4 *
                 init);
            
//#line 896
final int X10_TEMP5 =
              (X10_TEMP220);
            
//#line 897
final int X10_TEMP223 =
              (65536);
            
//#line 899
final int X10_TEMP6 =
              (X10_TEMP223);
            
//#line 900
final int X10_TEMP226 =
              (X10_TEMP5 %
                 X10_TEMP6);
            
//#line 902
final int X10_TEMP8 =
              (X10_TEMP226);
            
//#line 903
final int X10_TEMP229 =
              (X10_TEMP8);
            
//#line 905
init =
              ((X10_TEMP229));
            
//#line 906
final double X10_TEMP232 =
              (32768.0);
            
//#line 908
final double X10_TEMP9 =
              (X10_TEMP232);
            
//#line 909
final double X10_TEMP235 =
              (init -
                 X10_TEMP9);
            
//#line 911
final double X10_TEMP11 =
              (X10_TEMP235);
            
//#line 912
final double X10_TEMP238 =
              (16384.0);
            
//#line 914
final double X10_TEMP12 =
              (X10_TEMP238);
            
//#line 915
final double X10_TEMP241 =
              (X10_TEMP11 /
                 X10_TEMP12);
            
//#line 917
double val =
              (X10_TEMP241);
            
//#line 918
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 919
Program0.
                               Program_Linpack_write(
                               X10_TEMP0,
                               a,
                               i,
                               j,
                               val);
            }
            	} catch (Throwable tmp37) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp37);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 921
final boolean X10_TEMP18 =
              (val >
                 norma);
            
//#line 922
double X10_TEMP21 =
              (norma);
            
//#line 923
if (X10_TEMP18) {
                
//#line 924
X10_TEMP21 =
                  ((val));
            }
            
//#line 926
final double X10_TEMP22 =
              (X10_TEMP21);
            
//#line 927
final double X10_TEMP254 =
              (X10_TEMP22);
            
//#line 929
norma =
              ((X10_TEMP254));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var32__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int j =
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 891
final int X10_TEMP217 =
              (3125);
            
//#line 893
final int X10_TEMP4 =
              (X10_TEMP217);
            
//#line 894
final int X10_TEMP220 =
              (X10_TEMP4 *
                 init);
            
//#line 896
final int X10_TEMP5 =
              (X10_TEMP220);
            
//#line 897
final int X10_TEMP223 =
              (65536);
            
//#line 899
final int X10_TEMP6 =
              (X10_TEMP223);
            
//#line 900
final int X10_TEMP226 =
              (X10_TEMP5 %
                 X10_TEMP6);
            
//#line 902
final int X10_TEMP8 =
              (X10_TEMP226);
            
//#line 903
final int X10_TEMP229 =
              (X10_TEMP8);
            
//#line 905
init =
              ((X10_TEMP229));
            
//#line 906
final double X10_TEMP232 =
              (32768.0);
            
//#line 908
final double X10_TEMP9 =
              (X10_TEMP232);
            
//#line 909
final double X10_TEMP235 =
              (init -
                 X10_TEMP9);
            
//#line 911
final double X10_TEMP11 =
              (X10_TEMP235);
            
//#line 912
final double X10_TEMP238 =
              (16384.0);
            
//#line 914
final double X10_TEMP12 =
              (X10_TEMP238);
            
//#line 915
final double X10_TEMP241 =
              (X10_TEMP11 /
                 X10_TEMP12);
            
//#line 917
double val =
              (X10_TEMP241);
            
//#line 918
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 919
Program0.
                               Program_Linpack_write(
                               X10_TEMP0,
                               a,
                               i,
                               j,
                               val);
            }
            	} catch (Throwable tmp38) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp38);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 921
final boolean X10_TEMP18 =
              (val >
                 norma);
            
//#line 922
double X10_TEMP21 =
              (norma);
            
//#line 923
if (X10_TEMP18) {
                
//#line 924
X10_TEMP21 =
                  ((val));
            }
            
//#line 926
final double X10_TEMP22 =
              (X10_TEMP21);
            
//#line 927
final double X10_TEMP254 =
              (X10_TEMP22);
            
//#line 929
norma =
              ((X10_TEMP254));
        }/* } */
        }
        /* } */
        
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
/* template:forloop-mult { */{
            x10.lang.region __var40__ = (x10.lang.region) b.
                                                            distribution.
                                                            region;
            if (__var40__.size() > 0 && (__var40__ instanceof x10.array.MultiDimRegion || __var40__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var41__ = __var40__.rank(0).low(), __var42__ = __var40__.rank(0).high(); __var41__ <= __var42__; __var41__++)
            /* } */
            /* template:forloop-mult-each { */
            for (int __var43__ = __var40__.rank(1).low(), __var44__ = __var40__.rank(1).high(); __var43__ <= __var44__; __var43__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var41__;
            /* } */
            /* template:final-var-assign { */
            final int j = __var43__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP25 = point.factory.point(/* Join: { */__var41__,__var43__/* } */);/* } */
{
                
//#line 933
final x10.
                  lang.
                  dist X10_TEMP258 =
                  (x10.
                    lang.
                    dist)
                    ((b.
                        distribution));
                
//#line 935
final x10.
                  lang.
                  dist X10_TEMP24 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP258));
                
//#line 936
final x10.
                  lang.
                  place X10_TEMP26 =
                  (X10_TEMP24.
                     get(
                     X10_TEMP25));
                
//#line 937
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP26)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 938
final double X10_TEMP264 =
                      (0.0);
                    
//#line 940
final double X10_TEMP31 =
                      (X10_TEMP264);
                    
//#line 941
final double X10_TEMP267 =
                      (X10_TEMP31);
                    
//#line 943
final double X10_TEMP32 =
                      (X10_TEMP267);
                    
//#line 944
final double X10_TEMP272 =
                      (X10_TEMP32);
                    
//#line 946
final double X10_TEMP275 =
                      (X10_TEMP272);
                    
//#line 947
/* template:array_set { */(b).set((X10_TEMP275),/* Join: { */i,j/* } */)/* } */;
                }
                		}
                	});/* } */
            }/* } *//* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator X10_TEMP25__ = (__var40__).iterator(); X10_TEMP25__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP25 = (x10.
              lang.
              point) X10_TEMP25__.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((X10_TEMP25).get(0))/* } */;
final int j =
              /* template:array_get { */((X10_TEMP25).get(1))/* } */;/* } */
{
                
//#line 933
final x10.
                  lang.
                  dist X10_TEMP258 =
                  (x10.
                    lang.
                    dist)
                    ((b.
                        distribution));
                
//#line 935
final x10.
                  lang.
                  dist X10_TEMP24 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP258));
                
//#line 936
final x10.
                  lang.
                  place X10_TEMP26 =
                  (X10_TEMP24.
                     get(
                     X10_TEMP25));
                
//#line 937
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP26)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 938
final double X10_TEMP264 =
                      (0.0);
                    
//#line 940
final double X10_TEMP31 =
                      (X10_TEMP264);
                    
//#line 941
final double X10_TEMP267 =
                      (X10_TEMP31);
                    
//#line 943
final double X10_TEMP32 =
                      (X10_TEMP267);
                    
//#line 944
final double X10_TEMP272 =
                      (X10_TEMP32);
                    
//#line 946
final double X10_TEMP275 =
                      (X10_TEMP272);
                    
//#line 947
/* template:array_set { */(b).set((X10_TEMP275),/* Join: { */i,j/* } */)/* } */;
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
        	} catch (Throwable tmp39) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp39);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 951
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 952
final int X10_TEMP277 =
              (0);
            
//#line 954
final int X10_TEMP36 =
              (X10_TEMP277);
            
//#line 955
final int X10_TEMP280 =
              (1);
            
//#line 957
final int X10_TEMP34 =
              (X10_TEMP280);
            
//#line 958
final int X10_TEMP283 =
              (n -
                 X10_TEMP34);
            
//#line 960
final int X10_TEMP37 =
              (X10_TEMP283);
            
//#line 961
final int X10_TEMP286 =
              (0);
            
//#line 963
final int X10_TEMP41 =
              (X10_TEMP286);
            
//#line 964
final int X10_TEMP289 =
              (1);
            
//#line 966
final int X10_TEMP39 =
              (X10_TEMP289);
            
//#line 967
final int X10_TEMP292 =
              (n -
                 X10_TEMP39);
            
//#line 969
final int X10_TEMP42 =
              (X10_TEMP292);
            
//#line 970
final x10.
              lang.
              region X10_TEMP299 =
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
                      X10_TEMP37),
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP41,
                      X10_TEMP42))));
            
//#line 972
final x10.
              lang.
              region X10_TEMP44 =
              (x10.
                lang.
                region)
                ((X10_TEMP299));
            
//#line 973
/* template:forloop-mult { */{
            x10.lang.region __var46__ = (x10.lang.region) X10_TEMP44;
            if (__var46__.size() > 0 && (__var46__ instanceof x10.array.MultiDimRegion || __var46__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var47__ = __var46__.rank(0).low(), __var48__ = __var46__.rank(0).high(); __var47__ <= __var48__; __var47__++)
            /* } */
            /* template:forloop-mult-each { */
            for (int __var49__ = __var46__.rank(1).low(), __var50__ = __var46__.rank(1).high(); __var49__ <= __var50__; __var49__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var47__;
            /* } */
            /* template:final-var-assign { */
            final int j = __var49__;
            /* } */
            /* } */
{
                
//#line 974
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 975
final x10.
                      lang.
                      dist X10_TEMP303 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 977
final x10.
                      lang.
                      dist X10_TEMP45 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP303));
                    
//#line 978
final x10.
                      lang.
                      place X10_TEMP49 =
                      (X10_TEMP45.
                         get(
                         i,
                         j));
                    
//#line 979
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP49)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 980
final int X10_TEMP310 =
                          (0);
                        
//#line 982
final int X10_TEMP56 =
                          (X10_TEMP310);
                        
//#line 983
final double X10_TEMP315 =
                          (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                        
//#line 985
final double X10_TEMP57 =
                          (X10_TEMP315);
                        
//#line 986
Program0.
                                       Program_Linpack_plusWrite(
                                       X10_TEMP0,
                                       b,
                                       X10_TEMP56,
                                       j,
                                       X10_TEMP57);
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp51) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp51);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var1____ = (__var46__).iterator(); __var1____.hasNext(); ) {
            	final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
                
//#line 974
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 975
final x10.
                      lang.
                      dist X10_TEMP303 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 977
final x10.
                      lang.
                      dist X10_TEMP45 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP303));
                    
//#line 978
final x10.
                      lang.
                      place X10_TEMP49 =
                      (X10_TEMP45.
                         get(
                         i,
                         j));
                    
//#line 979
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP49)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 980
final int X10_TEMP310 =
                          (0);
                        
//#line 982
final int X10_TEMP56 =
                          (X10_TEMP310);
                        
//#line 983
final double X10_TEMP315 =
                          (/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                        
//#line 985
final double X10_TEMP57 =
                          (X10_TEMP315);
                        
//#line 986
Program0.
                                       Program_Linpack_plusWrite(
                                       X10_TEMP0,
                                       b,
                                       X10_TEMP56,
                                       j,
                                       X10_TEMP57);
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp52) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp52);
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
        	} catch (Throwable tmp45) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp45);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 991
return norma;
    }
    
    
//#line 993
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
        
//#line 994
final int X10_TEMP210 =
          (0);
        
//#line 996
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 997
final int X10_TEMP213 =
          (X10_TEMP3);
        
//#line 999
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 1000
final int X10_TEMP216 =
          (X10_TEMP4);
        
//#line 1002
final int X10_TEMP219 =
          (X10_TEMP216);
        
//#line 1003
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
          ((X10_TEMP219));
        
//#line 1004
final int X10_TEMP221 =
          (1);
        
//#line 1006
final int X10_TEMP5 =
          (X10_TEMP221);
        
//#line 1007
final int X10_TEMP224 =
          (n -
             X10_TEMP5);
        
//#line 1009
final int nm1 =
          (X10_TEMP224);
        
//#line 1010
final int X10_TEMP227 =
          (0);
        
//#line 1012
final int X10_TEMP7 =
          (X10_TEMP227);
        
//#line 1013
final boolean X10_TEMP9 =
          (nm1 >=
             X10_TEMP7);
        
//#line 1014
if (X10_TEMP9) {
            
//#line 1015
final int X10_TEMP232 =
              (0);
            
//#line 1017
final int X10_TEMP13 =
              (X10_TEMP232);
            
//#line 1018
final int X10_TEMP235 =
              (1);
            
//#line 1020
final int X10_TEMP11 =
              (X10_TEMP235);
            
//#line 1021
final int X10_TEMP238 =
              (nm1 -
                 X10_TEMP11);
            
//#line 1023
final int X10_TEMP14 =
              (X10_TEMP238);
            
//#line 1024
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
            
//#line 1026
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP243));
            
//#line 1027
final x10.
              lang.
              place X10_TEMP246 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1029
final x10.
              lang.
              place X10_TEMP16 =
              (X10_TEMP246);
            
//#line 1030
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
            
//#line 1032
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP249));
            
//#line 1033
/* template:forloop-mult { */{
            x10.lang.region __var53__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var53__.size() > 0 && (__var53__ instanceof x10.array.MultiDimRegion || __var53__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var54__ = __var53__.rank(0).low(), __var55__ = __var53__.rank(0).high(); __var54__ <= __var55__; __var54__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var54__;
            /* } */
            /* } */
{
                
//#line 1034
final int X10_TEMP253 =
                  (n -
                     k);
                
//#line 1036
final int X10_TEMP24 =
                  (X10_TEMP253);
                
//#line 1037
final int X10_TEMP256 =
                  (1);
                
//#line 1039
final int X10_TEMP25 =
                  (X10_TEMP256);
                
//#line 1040
final int X10_TEMP265 =
                  (Program0.
                     Program_Linpack_idamax(
                     X10_TEMP0,
                     X10_TEMP24,
                     a,
                     k,
                     k,
                     X10_TEMP25));
                
//#line 1042
final int X10_TEMP26 =
                  (X10_TEMP265);
                
//#line 1043
final int X10_TEMP268 =
                  (X10_TEMP26 +
                     k);
                
//#line 1045
final int l =
                  (X10_TEMP268);
                
//#line 1046
final int X10_TEMP271 =
                  (l);
                
//#line 1048
final int X10_TEMP31 =
                  (X10_TEMP271);
                
//#line 1049
final int X10_TEMP275 =
                  (X10_TEMP31);
                
//#line 1051
final int X10_TEMP278 =
                  (X10_TEMP275);
                
//#line 1052
/* template:array_set { */(ipvt).set((X10_TEMP278),k)/* } */;
                
//#line 1053
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1054
final x10.
                      lang.
                      dist X10_TEMP280 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 1056
final x10.
                      lang.
                      dist X10_TEMP32 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP280));
                    
//#line 1057
final int X10_TEMP283 =
                      (1);
                    
//#line 1059
int X10_TEMP35 =
                      (X10_TEMP283);
                    
//#line 1060
final x10.
                      lang.
                      place X10_TEMP37 =
                      (X10_TEMP32.
                         get(
                         k,
                         X10_TEMP35));
                    
//#line 1061
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1062
final int X10_TEMP290 =
                          (1);
                        
//#line 1064
final int X10_TEMP38 =
                          (X10_TEMP290);
                        
//#line 1065
final int X10_TEMP293 =
                          (k +
                             X10_TEMP38);
                        
//#line 1067
final int kp1 =
                          (X10_TEMP293);
                        
//#line 1068
final double X10_TEMP298 =
                          (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                        
//#line 1070
final double X10_TEMP42 =
                          (X10_TEMP298);
                        
//#line 1071
final int X10_TEMP301 =
                          (0);
                        
//#line 1073
final int X10_TEMP43 =
                          (X10_TEMP301);
                        
//#line 1074
final boolean X10_TEMP45 =
                          (X10_TEMP42 !=
                             X10_TEMP43);
                        
//#line 1075
if (X10_TEMP45) {
                            
//#line 1076
final boolean X10_TEMP47 =
                              (l !=
                                 k);
                            
//#line 1077
if (X10_TEMP47) {
                                
//#line 1078
final boolean X10_TEMP49 =
                                  (l !=
                                     k);
                                
//#line 1079
if (X10_TEMP49) {
                                    
//#line 1080
final double X10_TEMP312 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                                    
//#line 1082
double t =
                                      (X10_TEMP312);
                                    
//#line 1083
final double X10_TEMP317 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                                    
//#line 1085
final double X10_TEMP59 =
                                      (X10_TEMP317);
                                    
//#line 1086
final double X10_TEMP320 =
                                      (X10_TEMP59);
                                    
//#line 1088
final double X10_TEMP60 =
                                      (X10_TEMP320);
                                    
//#line 1089
final double X10_TEMP325 =
                                      (X10_TEMP60);
                                    
//#line 1091
final double X10_TEMP328 =
                                      (X10_TEMP325);
                                    
//#line 1092
/* template:array_set { */(a).set((X10_TEMP328),/* Join: { */k,l/* } */)/* } */;
                                    
//#line 1093
final double X10_TEMP330 =
                                      (t);
                                    
//#line 1095
final double X10_TEMP65 =
                                      (X10_TEMP330);
                                    
//#line 1096
final double X10_TEMP335 =
                                      (X10_TEMP65);
                                    
//#line 1098
final double X10_TEMP338 =
                                      (X10_TEMP335);
                                    
//#line 1099
/* template:array_set { */(a).set((X10_TEMP338),/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 1102
final double X10_TEMP340 =
                              (1.0);
                            
//#line 1104
final double X10_TEMP66 =
                              (X10_TEMP340);
                            
//#line 1105
final int X10_TEMP67 =
                              (0);
                            
//#line 1106
final double X10_TEMP344 =
                              (X10_TEMP67 -
                                 X10_TEMP66);
                            
//#line 1108
final double X10_TEMP70 =
                              (X10_TEMP344);
                            
//#line 1109
final double X10_TEMP349 =
                              (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                            
//#line 1111
final double X10_TEMP71 =
                              (X10_TEMP349);
                            
//#line 1112
final double X10_TEMP352 =
                              (X10_TEMP70 /
                                 X10_TEMP71);
                            
//#line 1114
final double tx =
                              (X10_TEMP352);
                            
//#line 1115
final int X10_TEMP355 =
                              (kp1);
                            
//#line 1117
final int X10_TEMP74 =
                              (X10_TEMP355);
                            
//#line 1118
final int X10_TEMP358 =
                              (n -
                                 X10_TEMP74);
                            
//#line 1120
final int X10_TEMP81 =
                              (X10_TEMP358);
                            
//#line 1121
final int X10_TEMP361 =
                              (1);
                            
//#line 1123
final int X10_TEMP82 =
                              (X10_TEMP361);
                            
//#line 1124
Program0.
                                            Program_Linpack_dscal(
                                            X10_TEMP0,
                                            X10_TEMP81,
                                            tx,
                                            a,
                                            k,
                                            kp1,
                                            X10_TEMP82);
                            
//#line 1125
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1126
final int X10_TEMP371 =
                                  (1);
                                
//#line 1128
final int X10_TEMP84 =
                                  (X10_TEMP371);
                                
//#line 1129
final int X10_TEMP374 =
                                  (n -
                                     X10_TEMP84);
                                
//#line 1131
final int X10_TEMP86 =
                                  (X10_TEMP374);
                                
//#line 1132
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
                                
//#line 1134
x10.
                                  lang.
                                  region temprkp1 =
                                  (x10.
                                    lang.
                                    region)
                                    ((X10_TEMP379));
                                
//#line 1135
final x10.
                                  lang.
                                  place X10_TEMP382 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 1137
final x10.
                                  lang.
                                  place X10_TEMP88 =
                                  (X10_TEMP382);
                                
//#line 1138
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
                                
//#line 1140
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP385));
                                
//#line 1141
/* template:forloop-mult { */{
                                x10.lang.region __var58__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var58__.size() > 0 && (__var58__ instanceof x10.array.MultiDimRegion || __var58__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var59__ = __var58__.rank(0).low(), __var60__ = __var58__.rank(0).high(); __var59__ <= __var60__; __var59__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var59__;
                                /* } */
                                /* } */
{
                                    
//#line 1142
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1144
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1145
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1146
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1147
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1149
double t =
                                          (X10_TEMP398);
                                        
//#line 1150
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1151
if (X10_TEMP100) {
                                            
//#line 1152
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1154
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1155
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1157
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1158
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1160
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1161
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1162
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1164
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1165
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1167
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1168
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1170
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1172
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1173
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1175
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1176
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1178
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1179
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1181
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1182
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
                                for (java.util.Iterator __var3____ = (__var58__).iterator(); __var3____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var3__ = (x10.
                                  lang.
                                  point) __var3____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                                    
//#line 1142
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1144
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1145
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1146
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1147
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1149
double t =
                                          (X10_TEMP398);
                                        
//#line 1150
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1151
if (X10_TEMP100) {
                                            
//#line 1152
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1154
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1155
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1157
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1158
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1160
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1161
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1162
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1164
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1165
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1167
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1168
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1170
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1172
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1173
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1175
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1176
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1178
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1179
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1181
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1182
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
                            	} catch (Throwable tmp57) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp57);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 1188
final int X10_TEMP451 =
                              (k);
                            
//#line 1190
final int X10_TEMP131 =
                              (X10_TEMP451);
                            
//#line 1191
final int X10_TEMP454 =
                              (X10_TEMP131);
                            
//#line 1193
final int X10_TEMP457 =
                              (X10_TEMP454);
                            
//#line 1194
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
                              ((X10_TEMP457));
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp56) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp56);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var53__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 1034
final int X10_TEMP253 =
                  (n -
                     k);
                
//#line 1036
final int X10_TEMP24 =
                  (X10_TEMP253);
                
//#line 1037
final int X10_TEMP256 =
                  (1);
                
//#line 1039
final int X10_TEMP25 =
                  (X10_TEMP256);
                
//#line 1040
final int X10_TEMP265 =
                  (Program0.
                     Program_Linpack_idamax(
                     X10_TEMP0,
                     X10_TEMP24,
                     a,
                     k,
                     k,
                     X10_TEMP25));
                
//#line 1042
final int X10_TEMP26 =
                  (X10_TEMP265);
                
//#line 1043
final int X10_TEMP268 =
                  (X10_TEMP26 +
                     k);
                
//#line 1045
final int l =
                  (X10_TEMP268);
                
//#line 1046
final int X10_TEMP271 =
                  (l);
                
//#line 1048
final int X10_TEMP31 =
                  (X10_TEMP271);
                
//#line 1049
final int X10_TEMP275 =
                  (X10_TEMP31);
                
//#line 1051
final int X10_TEMP278 =
                  (X10_TEMP275);
                
//#line 1052
/* template:array_set { */(ipvt).set((X10_TEMP278),k)/* } */;
                
//#line 1053
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1054
final x10.
                      lang.
                      dist X10_TEMP280 =
                      (x10.
                        lang.
                        dist)
                        ((a.
                            distribution));
                    
//#line 1056
final x10.
                      lang.
                      dist X10_TEMP32 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP280));
                    
//#line 1057
final int X10_TEMP283 =
                      (1);
                    
//#line 1059
int X10_TEMP35 =
                      (X10_TEMP283);
                    
//#line 1060
final x10.
                      lang.
                      place X10_TEMP37 =
                      (X10_TEMP32.
                         get(
                         k,
                         X10_TEMP35));
                    
//#line 1061
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1062
final int X10_TEMP290 =
                          (1);
                        
//#line 1064
final int X10_TEMP38 =
                          (X10_TEMP290);
                        
//#line 1065
final int X10_TEMP293 =
                          (k +
                             X10_TEMP38);
                        
//#line 1067
final int kp1 =
                          (X10_TEMP293);
                        
//#line 1068
final double X10_TEMP298 =
                          (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                        
//#line 1070
final double X10_TEMP42 =
                          (X10_TEMP298);
                        
//#line 1071
final int X10_TEMP301 =
                          (0);
                        
//#line 1073
final int X10_TEMP43 =
                          (X10_TEMP301);
                        
//#line 1074
final boolean X10_TEMP45 =
                          (X10_TEMP42 !=
                             X10_TEMP43);
                        
//#line 1075
if (X10_TEMP45) {
                            
//#line 1076
final boolean X10_TEMP47 =
                              (l !=
                                 k);
                            
//#line 1077
if (X10_TEMP47) {
                                
//#line 1078
final boolean X10_TEMP49 =
                                  (l !=
                                     k);
                                
//#line 1079
if (X10_TEMP49) {
                                    
//#line 1080
final double X10_TEMP312 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */);
                                    
//#line 1082
double t =
                                      (X10_TEMP312);
                                    
//#line 1083
final double X10_TEMP317 =
                                      (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                                    
//#line 1085
final double X10_TEMP59 =
                                      (X10_TEMP317);
                                    
//#line 1086
final double X10_TEMP320 =
                                      (X10_TEMP59);
                                    
//#line 1088
final double X10_TEMP60 =
                                      (X10_TEMP320);
                                    
//#line 1089
final double X10_TEMP325 =
                                      (X10_TEMP60);
                                    
//#line 1091
final double X10_TEMP328 =
                                      (X10_TEMP325);
                                    
//#line 1092
/* template:array_set { */(a).set((X10_TEMP328),/* Join: { */k,l/* } */)/* } */;
                                    
//#line 1093
final double X10_TEMP330 =
                                      (t);
                                    
//#line 1095
final double X10_TEMP65 =
                                      (X10_TEMP330);
                                    
//#line 1096
final double X10_TEMP335 =
                                      (X10_TEMP65);
                                    
//#line 1098
final double X10_TEMP338 =
                                      (X10_TEMP335);
                                    
//#line 1099
/* template:array_set { */(a).set((X10_TEMP338),/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 1102
final double X10_TEMP340 =
                              (1.0);
                            
//#line 1104
final double X10_TEMP66 =
                              (X10_TEMP340);
                            
//#line 1105
final int X10_TEMP67 =
                              (0);
                            
//#line 1106
final double X10_TEMP344 =
                              (X10_TEMP67 -
                                 X10_TEMP66);
                            
//#line 1108
final double X10_TEMP70 =
                              (X10_TEMP344);
                            
//#line 1109
final double X10_TEMP349 =
                              (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                            
//#line 1111
final double X10_TEMP71 =
                              (X10_TEMP349);
                            
//#line 1112
final double X10_TEMP352 =
                              (X10_TEMP70 /
                                 X10_TEMP71);
                            
//#line 1114
final double tx =
                              (X10_TEMP352);
                            
//#line 1115
final int X10_TEMP355 =
                              (kp1);
                            
//#line 1117
final int X10_TEMP74 =
                              (X10_TEMP355);
                            
//#line 1118
final int X10_TEMP358 =
                              (n -
                                 X10_TEMP74);
                            
//#line 1120
final int X10_TEMP81 =
                              (X10_TEMP358);
                            
//#line 1121
final int X10_TEMP361 =
                              (1);
                            
//#line 1123
final int X10_TEMP82 =
                              (X10_TEMP361);
                            
//#line 1124
Program0.
                                            Program_Linpack_dscal(
                                            X10_TEMP0,
                                            X10_TEMP81,
                                            tx,
                                            a,
                                            k,
                                            kp1,
                                            X10_TEMP82);
                            
//#line 1125
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1126
final int X10_TEMP371 =
                                  (1);
                                
//#line 1128
final int X10_TEMP84 =
                                  (X10_TEMP371);
                                
//#line 1129
final int X10_TEMP374 =
                                  (n -
                                     X10_TEMP84);
                                
//#line 1131
final int X10_TEMP86 =
                                  (X10_TEMP374);
                                
//#line 1132
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
                                
//#line 1134
x10.
                                  lang.
                                  region temprkp1 =
                                  (x10.
                                    lang.
                                    region)
                                    ((X10_TEMP379));
                                
//#line 1135
final x10.
                                  lang.
                                  place X10_TEMP382 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 1137
final x10.
                                  lang.
                                  place X10_TEMP88 =
                                  (X10_TEMP382);
                                
//#line 1138
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
                                
//#line 1140
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP385));
                                
//#line 1141
/* template:forloop-mult { */{
                                x10.lang.region __var63__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var63__.size() > 0 && (__var63__ instanceof x10.array.MultiDimRegion || __var63__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var64__ = __var63__.rank(0).low(), __var65__ = __var63__.rank(0).high(); __var64__ <= __var65__; __var64__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var64__;
                                /* } */
                                /* } */
{
                                    
//#line 1142
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1144
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1145
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1146
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1147
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1149
double t =
                                          (X10_TEMP398);
                                        
//#line 1150
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1151
if (X10_TEMP100) {
                                            
//#line 1152
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1154
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1155
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1157
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1158
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1160
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1161
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1162
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1164
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1165
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1167
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1168
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1170
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1172
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1173
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1175
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1176
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1178
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1179
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1181
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1182
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
                                for (java.util.Iterator __var3____ = (__var63__).iterator(); __var3____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var3__ = (x10.
                                  lang.
                                  point) __var3____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                                    
//#line 1142
final x10.
                                      lang.
                                      dist X10_TEMP389 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((a.
                                            distribution));
                                    
//#line 1144
final x10.
                                      lang.
                                      dist X10_TEMP91 =
                                      (x10.
                                        lang.
                                        dist)
                                        ((X10_TEMP389));
                                    
//#line 1145
final x10.
                                      lang.
                                      place X10_TEMP95 =
                                      (X10_TEMP91.
                                         get(
                                         j,
                                         l));
                                    
//#line 1146
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 1147
final double X10_TEMP398 =
                                          (/* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */);
                                        
//#line 1149
double t =
                                          (X10_TEMP398);
                                        
//#line 1150
final boolean X10_TEMP100 =
                                          (l !=
                                             k);
                                        
//#line 1151
if (X10_TEMP100) {
                                            
//#line 1152
final double X10_TEMP405 =
                                              (/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */);
                                            
//#line 1154
final double X10_TEMP107 =
                                              (X10_TEMP405);
                                            
//#line 1155
final double X10_TEMP408 =
                                              (X10_TEMP107);
                                            
//#line 1157
final double X10_TEMP108 =
                                              (X10_TEMP408);
                                            
//#line 1158
final double X10_TEMP413 =
                                              (X10_TEMP108);
                                            
//#line 1160
final double X10_TEMP416 =
                                              (X10_TEMP413);
                                            
//#line 1161
/* template:array_set { */(a).set((X10_TEMP416),/* Join: { */j,l/* } */)/* } */;
                                            
//#line 1162
final double X10_TEMP418 =
                                              (t);
                                            
//#line 1164
final double X10_TEMP113 =
                                              (X10_TEMP418);
                                            
//#line 1165
final double X10_TEMP423 =
                                              (X10_TEMP113);
                                            
//#line 1167
final double X10_TEMP426 =
                                              (X10_TEMP423);
                                            
//#line 1168
/* template:array_set { */(a).set((X10_TEMP426),/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 1170
final int X10_TEMP428 =
                                          (kp1);
                                        
//#line 1172
final int X10_TEMP115 =
                                          (X10_TEMP428);
                                        
//#line 1173
final int X10_TEMP431 =
                                          (n -
                                             X10_TEMP115);
                                        
//#line 1175
final int X10_TEMP126 =
                                          (X10_TEMP431);
                                        
//#line 1176
final int X10_TEMP434 =
                                          (1);
                                        
//#line 1178
final int X10_TEMP127 =
                                          (X10_TEMP434);
                                        
//#line 1179
final int X10_TEMP437 =
                                          (1);
                                        
//#line 1181
final int X10_TEMP128 =
                                          (X10_TEMP437);
                                        
//#line 1182
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
                            	} catch (Throwable tmp62) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp62);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 1188
final int X10_TEMP451 =
                              (k);
                            
//#line 1190
final int X10_TEMP131 =
                              (X10_TEMP451);
                            
//#line 1191
final int X10_TEMP454 =
                              (X10_TEMP131);
                            
//#line 1193
final int X10_TEMP457 =
                              (X10_TEMP454);
                            
//#line 1194
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa =
                              ((X10_TEMP457));
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp61) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp61);
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
        
//#line 1200
final int X10_TEMP459 =
          (1);
        
//#line 1202
final int X10_TEMP132 =
          (X10_TEMP459);
        
//#line 1203
final int X10_TEMP462 =
          (n -
             X10_TEMP132);
        
//#line 1205
final int X10_TEMP134 =
          (X10_TEMP462);
        
//#line 1206
final int X10_TEMP465 =
          (1);
        
//#line 1208
final int X10_TEMP135 =
          (X10_TEMP465);
        
//#line 1209
final int X10_TEMP468 =
          (n -
             X10_TEMP135);
        
//#line 1211
final int X10_TEMP138 =
          (X10_TEMP468);
        
//#line 1212
final int X10_TEMP471 =
          (X10_TEMP138);
        
//#line 1214
final int X10_TEMP139 =
          (X10_TEMP471);
        
//#line 1215
final int X10_TEMP475 =
          (X10_TEMP139);
        
//#line 1217
final int X10_TEMP478 =
          (X10_TEMP475);
        
//#line 1218
/* template:array_set { */(ipvt).set((X10_TEMP478),X10_TEMP134)/* } */;
        
//#line 1219
final int X10_TEMP480 =
          (1);
        
//#line 1221
final int X10_TEMP141 =
          (X10_TEMP480);
        
//#line 1222
final int X10_TEMP483 =
          (n -
             X10_TEMP141);
        
//#line 1224
final int X10_TEMP145 =
          (X10_TEMP483);
        
//#line 1225
final int X10_TEMP486 =
          (1);
        
//#line 1227
final int X10_TEMP143 =
          (X10_TEMP486);
        
//#line 1228
final int X10_TEMP489 =
          (n -
             X10_TEMP143);
        
//#line 1230
final int X10_TEMP146 =
          (X10_TEMP489);
        
//#line 1231
final double X10_TEMP496 =
          (Program0.
             Program_Linpack_read(
             X10_TEMP0,
             a,
             X10_TEMP145,
             X10_TEMP146));
        
//#line 1233
double val =
          (X10_TEMP496);
        
//#line 1234
final int X10_TEMP499 =
          (0);
        
//#line 1236
final int X10_TEMP148 =
          (X10_TEMP499);
        
//#line 1237
final boolean X10_TEMP150 =
          (val ==
             X10_TEMP148);
        
//#line 1238
if (X10_TEMP150) {
            
//#line 1239
final int X10_TEMP504 =
              (1);
            
//#line 1241
final int X10_TEMP151 =
              (X10_TEMP504);
            
//#line 1242
final int X10_TEMP507 =
              (n -
                 X10_TEMP151);
            
//#line 1244
final int X10_TEMP154 =
              (X10_TEMP507);
            
//#line 1245
final int X10_TEMP510 =
              (X10_TEMP154);
            
//#line 1247
final int X10_TEMP155 =
              (X10_TEMP510);
            
//#line 1248
final int X10_TEMP513 =
              (X10_TEMP155);
            
//#line 1250
final int X10_TEMP516 =
              (X10_TEMP513);
            
//#line 1251
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.info =
              ((X10_TEMP516));
        }
        
//#line 1253
final int X10_TEMP518 =
          (/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.infodgefa);
        
//#line 1255
final int X10_TEMP157 =
          (X10_TEMP518);
        
//#line 1256
return X10_TEMP157;
    }
    
    
//#line 1258
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
        
//#line 1259
final int X10_TEMP210 =
          (1);
        
//#line 1261
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 1262
final int X10_TEMP213 =
          (n -
             X10_TEMP1);
        
//#line 1264
final int nm1 =
          (X10_TEMP213);
        
//#line 1265
final int X10_TEMP216 =
          (0);
        
//#line 1267
final int X10_TEMP3 =
          (X10_TEMP216);
        
//#line 1268
final boolean X10_TEMP5 =
          (job ==
             X10_TEMP3);
        
//#line 1269
if (X10_TEMP5) {
            
//#line 1270
final int X10_TEMP221 =
              (1);
            
//#line 1272
final int X10_TEMP6 =
              (X10_TEMP221);
            
//#line 1273
final boolean X10_TEMP8 =
              (nm1 >=
                 X10_TEMP6);
            
//#line 1274
if (X10_TEMP8) {
                
//#line 1275
final int X10_TEMP226 =
                  (0);
                
//#line 1277
final int X10_TEMP12 =
                  (X10_TEMP226);
                
//#line 1278
final int X10_TEMP229 =
                  (1);
                
//#line 1280
final int X10_TEMP10 =
                  (X10_TEMP229);
                
//#line 1281
final int X10_TEMP232 =
                  (nm1 -
                     X10_TEMP10);
                
//#line 1283
final int X10_TEMP13 =
                  (X10_TEMP232);
                
//#line 1284
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
                
//#line 1286
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP237));
                
//#line 1287
final x10.
                  lang.
                  place X10_TEMP240 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1289
final x10.
                  lang.
                  place X10_TEMP15 =
                  (X10_TEMP240);
                
//#line 1290
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
                
//#line 1292
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP243));
                
//#line 1293
/* template:forloop-mult { */{
                x10.lang.region __var66__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var66__.size() > 0 && (__var66__ instanceof x10.array.MultiDimRegion || __var66__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var67__ = __var66__.rank(0).low(), __var68__ = __var66__.rank(0).high(); __var67__ <= __var68__; __var67__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int k = __var67__;
                /* } */
                /* } */
{
                    
//#line 1294
final int X10_TEMP248 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1296
final int l =
                      (X10_TEMP248);
                    
//#line 1297
final int X10_TEMP251 =
                      (0);
                    
//#line 1299
final int X10_TEMP22 =
                      (X10_TEMP251);
                    
//#line 1300
final double X10_TEMP256 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP22,l/* } */))/* } */);
                    
//#line 1302
double t =
                      (X10_TEMP256);
                    
//#line 1303
final boolean X10_TEMP25 =
                      (l !=
                         k);
                    
//#line 1304
if (X10_TEMP25) {
                        
//#line 1305
final int X10_TEMP261 =
                          (0);
                        
//#line 1307
final int X10_TEMP28 =
                          (X10_TEMP261);
                        
//#line 1308
final int X10_TEMP264 =
                          (0);
                        
//#line 1310
final int X10_TEMP31 =
                          (X10_TEMP264);
                        
//#line 1311
final double X10_TEMP269 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP31,k/* } */))/* } */);
                        
//#line 1313
final double X10_TEMP34 =
                          (X10_TEMP269);
                        
//#line 1314
final double X10_TEMP272 =
                          (X10_TEMP34);
                        
//#line 1316
final double X10_TEMP35 =
                          (X10_TEMP272);
                        
//#line 1317
final double X10_TEMP277 =
                          (X10_TEMP35);
                        
//#line 1319
final double X10_TEMP280 =
                          (X10_TEMP277);
                        
//#line 1320
/* template:array_set { */(b).set((X10_TEMP280),/* Join: { */X10_TEMP28,l/* } */)/* } */;
                        
//#line 1321
final int X10_TEMP282 =
                          (0);
                        
//#line 1323
final int X10_TEMP38 =
                          (X10_TEMP282);
                        
//#line 1324
final double X10_TEMP285 =
                          (t);
                        
//#line 1326
final double X10_TEMP41 =
                          (X10_TEMP285);
                        
//#line 1327
final double X10_TEMP290 =
                          (X10_TEMP41);
                        
//#line 1329
final double X10_TEMP293 =
                          (X10_TEMP290);
                        
//#line 1330
/* template:array_set { */(b).set((X10_TEMP293),/* Join: { */X10_TEMP38,k/* } */)/* } */;
                    }
                    
//#line 1332
final int X10_TEMP295 =
                      (1);
                    
//#line 1334
final int X10_TEMP42 =
                      (X10_TEMP295);
                    
//#line 1335
final int X10_TEMP298 =
                      (k +
                         X10_TEMP42);
                    
//#line 1337
final int kp1 =
                      (X10_TEMP298);
                    
//#line 1338
final int X10_TEMP301 =
                      (kp1);
                    
//#line 1340
final int X10_TEMP45 =
                      (X10_TEMP301);
                    
//#line 1341
final int X10_TEMP304 =
                      (n -
                         X10_TEMP45);
                    
//#line 1343
final int X10_TEMP56 =
                      (X10_TEMP304);
                    
//#line 1344
final int X10_TEMP307 =
                      (1);
                    
//#line 1346
final int X10_TEMP57 =
                      (X10_TEMP307);
                    
//#line 1347
final int X10_TEMP310 =
                      (0);
                    
//#line 1349
final int X10_TEMP58 =
                      (X10_TEMP310);
                    
//#line 1350
final int X10_TEMP313 =
                      (1);
                    
//#line 1352
final int X10_TEMP59 =
                      (X10_TEMP313);
                    
//#line 1353
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
                for (java.util.Iterator __var4____ = (__var66__).iterator(); __var4____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var4__ = (x10.
                  lang.
                  point) __var4____.next();
                	/* Join: { *//* Join: { */final int k =
                  /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                    
//#line 1294
final int X10_TEMP248 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1296
final int l =
                      (X10_TEMP248);
                    
//#line 1297
final int X10_TEMP251 =
                      (0);
                    
//#line 1299
final int X10_TEMP22 =
                      (X10_TEMP251);
                    
//#line 1300
final double X10_TEMP256 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP22,l/* } */))/* } */);
                    
//#line 1302
double t =
                      (X10_TEMP256);
                    
//#line 1303
final boolean X10_TEMP25 =
                      (l !=
                         k);
                    
//#line 1304
if (X10_TEMP25) {
                        
//#line 1305
final int X10_TEMP261 =
                          (0);
                        
//#line 1307
final int X10_TEMP28 =
                          (X10_TEMP261);
                        
//#line 1308
final int X10_TEMP264 =
                          (0);
                        
//#line 1310
final int X10_TEMP31 =
                          (X10_TEMP264);
                        
//#line 1311
final double X10_TEMP269 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP31,k/* } */))/* } */);
                        
//#line 1313
final double X10_TEMP34 =
                          (X10_TEMP269);
                        
//#line 1314
final double X10_TEMP272 =
                          (X10_TEMP34);
                        
//#line 1316
final double X10_TEMP35 =
                          (X10_TEMP272);
                        
//#line 1317
final double X10_TEMP277 =
                          (X10_TEMP35);
                        
//#line 1319
final double X10_TEMP280 =
                          (X10_TEMP277);
                        
//#line 1320
/* template:array_set { */(b).set((X10_TEMP280),/* Join: { */X10_TEMP28,l/* } */)/* } */;
                        
//#line 1321
final int X10_TEMP282 =
                          (0);
                        
//#line 1323
final int X10_TEMP38 =
                          (X10_TEMP282);
                        
//#line 1324
final double X10_TEMP285 =
                          (t);
                        
//#line 1326
final double X10_TEMP41 =
                          (X10_TEMP285);
                        
//#line 1327
final double X10_TEMP290 =
                          (X10_TEMP41);
                        
//#line 1329
final double X10_TEMP293 =
                          (X10_TEMP290);
                        
//#line 1330
/* template:array_set { */(b).set((X10_TEMP293),/* Join: { */X10_TEMP38,k/* } */)/* } */;
                    }
                    
//#line 1332
final int X10_TEMP295 =
                      (1);
                    
//#line 1334
final int X10_TEMP42 =
                      (X10_TEMP295);
                    
//#line 1335
final int X10_TEMP298 =
                      (k +
                         X10_TEMP42);
                    
//#line 1337
final int kp1 =
                      (X10_TEMP298);
                    
//#line 1338
final int X10_TEMP301 =
                      (kp1);
                    
//#line 1340
final int X10_TEMP45 =
                      (X10_TEMP301);
                    
//#line 1341
final int X10_TEMP304 =
                      (n -
                         X10_TEMP45);
                    
//#line 1343
final int X10_TEMP56 =
                      (X10_TEMP304);
                    
//#line 1344
final int X10_TEMP307 =
                      (1);
                    
//#line 1346
final int X10_TEMP57 =
                      (X10_TEMP307);
                    
//#line 1347
final int X10_TEMP310 =
                      (0);
                    
//#line 1349
final int X10_TEMP58 =
                      (X10_TEMP310);
                    
//#line 1350
final int X10_TEMP313 =
                      (1);
                    
//#line 1352
final int X10_TEMP59 =
                      (X10_TEMP313);
                    
//#line 1353
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
            
//#line 1356
final int X10_TEMP327 =
              (0);
            
//#line 1358
final int X10_TEMP63 =
              (X10_TEMP327);
            
//#line 1359
final int X10_TEMP330 =
              (1);
            
//#line 1361
final int X10_TEMP61 =
              (X10_TEMP330);
            
//#line 1362
final int X10_TEMP333 =
              (n -
                 X10_TEMP61);
            
//#line 1364
final int X10_TEMP64 =
              (X10_TEMP333);
            
//#line 1365
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
            
//#line 1367
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP338));
            
//#line 1368
final x10.
              lang.
              place X10_TEMP341 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1370
final x10.
              lang.
              place X10_TEMP66 =
              (X10_TEMP341);
            
//#line 1371
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
            
//#line 1373
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP344));
            
//#line 1374
/* template:forloop-mult { */{
            x10.lang.region __var69__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var69__.size() > 0 && (__var69__ instanceof x10.array.MultiDimRegion || __var69__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var70__ = __var69__.rank(0).low(), __var71__ = __var69__.rank(0).high(); __var70__ <= __var71__; __var70__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int kb = __var70__;
            /* } */
            /* } */
{
                
//#line 1375
final int X10_TEMP348 =
                  (1);
                
//#line 1377
final int X10_TEMP69 =
                  (X10_TEMP348);
                
//#line 1378
final int X10_TEMP351 =
                  (kb +
                     X10_TEMP69);
                
//#line 1380
final int X10_TEMP71 =
                  (X10_TEMP351);
                
//#line 1381
final int X10_TEMP354 =
                  (n -
                     X10_TEMP71);
                
//#line 1383
final int k =
                  (X10_TEMP354);
                
//#line 1384
final int X10_TEMP357 =
                  (0);
                
//#line 1386
final int X10_TEMP75 =
                  (X10_TEMP357);
                
//#line 1387
final double X10_TEMP362 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP75,k/* } */))/* } */);
                
//#line 1389
final double X10_TEMP80 =
                  (X10_TEMP362);
                
//#line 1390
final double X10_TEMP369 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     a,
                     k,
                     k));
                
//#line 1392
final double X10_TEMP81 =
                  (X10_TEMP369);
                
//#line 1393
final double X10_TEMP372 =
                  (X10_TEMP80 /
                     X10_TEMP81);
                
//#line 1395
final double X10_TEMP82 =
                  (X10_TEMP372);
                
//#line 1396
final double X10_TEMP377 =
                  (X10_TEMP82);
                
//#line 1398
final double X10_TEMP380 =
                  (X10_TEMP377);
                
//#line 1399
/* template:array_set { */(b).set((X10_TEMP380),/* Join: { */X10_TEMP75,k/* } */)/* } */;
                
//#line 1400
final int X10_TEMP382 =
                  (0);
                
//#line 1402
final int X10_TEMP85 =
                  (X10_TEMP382);
                
//#line 1403
final double X10_TEMP387 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP85,k/* } */))/* } */);
                
//#line 1405
final double X10_TEMP86 =
                  (X10_TEMP387);
                
//#line 1406
final int X10_TEMP87 =
                  (0);
                
//#line 1407
final double X10_TEMP391 =
                  (X10_TEMP87 -
                     X10_TEMP86);
                
//#line 1409
double t =
                  (X10_TEMP391);
                
//#line 1410
final int X10_TEMP394 =
                  (0);
                
//#line 1412
final int X10_TEMP99 =
                  (X10_TEMP394);
                
//#line 1413
final int X10_TEMP397 =
                  (1);
                
//#line 1415
final int X10_TEMP100 =
                  (X10_TEMP397);
                
//#line 1416
final int X10_TEMP400 =
                  (0);
                
//#line 1418
final int X10_TEMP101 =
                  (X10_TEMP400);
                
//#line 1419
final int X10_TEMP403 =
                  (0);
                
//#line 1421
final int X10_TEMP102 =
                  (X10_TEMP403);
                
//#line 1422
final int X10_TEMP406 =
                  (1);
                
//#line 1424
final int X10_TEMP103 =
                  (X10_TEMP406);
                
//#line 1425
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
            for (java.util.Iterator __var5____ = (__var69__).iterator(); __var5____.hasNext(); ) {
            	final  x10.
              lang.
              point __var5__ = (x10.
              lang.
              point) __var5____.next();
            	/* Join: { *//* Join: { */final int kb =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                
//#line 1375
final int X10_TEMP348 =
                  (1);
                
//#line 1377
final int X10_TEMP69 =
                  (X10_TEMP348);
                
//#line 1378
final int X10_TEMP351 =
                  (kb +
                     X10_TEMP69);
                
//#line 1380
final int X10_TEMP71 =
                  (X10_TEMP351);
                
//#line 1381
final int X10_TEMP354 =
                  (n -
                     X10_TEMP71);
                
//#line 1383
final int k =
                  (X10_TEMP354);
                
//#line 1384
final int X10_TEMP357 =
                  (0);
                
//#line 1386
final int X10_TEMP75 =
                  (X10_TEMP357);
                
//#line 1387
final double X10_TEMP362 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP75,k/* } */))/* } */);
                
//#line 1389
final double X10_TEMP80 =
                  (X10_TEMP362);
                
//#line 1390
final double X10_TEMP369 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     a,
                     k,
                     k));
                
//#line 1392
final double X10_TEMP81 =
                  (X10_TEMP369);
                
//#line 1393
final double X10_TEMP372 =
                  (X10_TEMP80 /
                     X10_TEMP81);
                
//#line 1395
final double X10_TEMP82 =
                  (X10_TEMP372);
                
//#line 1396
final double X10_TEMP377 =
                  (X10_TEMP82);
                
//#line 1398
final double X10_TEMP380 =
                  (X10_TEMP377);
                
//#line 1399
/* template:array_set { */(b).set((X10_TEMP380),/* Join: { */X10_TEMP75,k/* } */)/* } */;
                
//#line 1400
final int X10_TEMP382 =
                  (0);
                
//#line 1402
final int X10_TEMP85 =
                  (X10_TEMP382);
                
//#line 1403
final double X10_TEMP387 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP85,k/* } */))/* } */);
                
//#line 1405
final double X10_TEMP86 =
                  (X10_TEMP387);
                
//#line 1406
final int X10_TEMP87 =
                  (0);
                
//#line 1407
final double X10_TEMP391 =
                  (X10_TEMP87 -
                     X10_TEMP86);
                
//#line 1409
double t =
                  (X10_TEMP391);
                
//#line 1410
final int X10_TEMP394 =
                  (0);
                
//#line 1412
final int X10_TEMP99 =
                  (X10_TEMP394);
                
//#line 1413
final int X10_TEMP397 =
                  (1);
                
//#line 1415
final int X10_TEMP100 =
                  (X10_TEMP397);
                
//#line 1416
final int X10_TEMP400 =
                  (0);
                
//#line 1418
final int X10_TEMP101 =
                  (X10_TEMP400);
                
//#line 1419
final int X10_TEMP403 =
                  (0);
                
//#line 1421
final int X10_TEMP102 =
                  (X10_TEMP403);
                
//#line 1422
final int X10_TEMP406 =
                  (1);
                
//#line 1424
final int X10_TEMP103 =
                  (X10_TEMP406);
                
//#line 1425
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
            
//#line 1429
final int X10_TEMP420 =
              (0);
            
//#line 1431
final int X10_TEMP107 =
              (X10_TEMP420);
            
//#line 1432
final int X10_TEMP423 =
              (1);
            
//#line 1434
final int X10_TEMP105 =
              (X10_TEMP423);
            
//#line 1435
final int X10_TEMP426 =
              (n -
                 X10_TEMP105);
            
//#line 1437
final int X10_TEMP108 =
              (X10_TEMP426);
            
//#line 1438
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
            
//#line 1440
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP431));
            
//#line 1441
final x10.
              lang.
              place X10_TEMP434 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1443
final x10.
              lang.
              place X10_TEMP110 =
              (X10_TEMP434);
            
//#line 1444
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
            
//#line 1446
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP437));
            
//#line 1447
/* template:forloop-mult { */{
            x10.lang.region __var72__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var72__.size() > 0 && (__var72__ instanceof x10.array.MultiDimRegion || __var72__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var73__ = __var72__.rank(0).low(), __var74__ = __var72__.rank(0).high(); __var73__ <= __var74__; __var73__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var73__;
            /* } */
            /* } */
{
                
//#line 1448
final int X10_TEMP441 =
                  (0);
                
//#line 1450
final int X10_TEMP122 =
                  (X10_TEMP441);
                
//#line 1451
final int X10_TEMP444 =
                  (1);
                
//#line 1453
final int X10_TEMP123 =
                  (X10_TEMP444);
                
//#line 1454
final int X10_TEMP447 =
                  (0);
                
//#line 1456
final int X10_TEMP124 =
                  (X10_TEMP447);
                
//#line 1457
final int X10_TEMP450 =
                  (0);
                
//#line 1459
final int X10_TEMP125 =
                  (X10_TEMP450);
                
//#line 1460
final int X10_TEMP453 =
                  (1);
                
//#line 1462
final int X10_TEMP126 =
                  (X10_TEMP453);
                
//#line 1463
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
                
//#line 1465
double t =
                  (X10_TEMP466);
                
//#line 1466
final int X10_TEMP469 =
                  (0);
                
//#line 1468
final int X10_TEMP130 =
                  (X10_TEMP469);
                
//#line 1469
final int X10_TEMP472 =
                  (0);
                
//#line 1471
final int X10_TEMP133 =
                  (X10_TEMP472);
                
//#line 1472
final double X10_TEMP477 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP133,k/* } */))/* } */);
                
//#line 1474
final double X10_TEMP134 =
                  (X10_TEMP477);
                
//#line 1475
final double X10_TEMP480 =
                  (X10_TEMP134 -
                     t);
                
//#line 1477
final double X10_TEMP136 =
                  (X10_TEMP480);
                
//#line 1478
final double X10_TEMP485 =
                  (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                
//#line 1480
final double X10_TEMP139 =
                  (X10_TEMP485);
                
//#line 1481
final double X10_TEMP488 =
                  (X10_TEMP136 /
                     X10_TEMP139);
                
//#line 1483
final double X10_TEMP142 =
                  (X10_TEMP488);
                
//#line 1484
final double X10_TEMP491 =
                  (X10_TEMP142);
                
//#line 1486
final double X10_TEMP143 =
                  (X10_TEMP491);
                
//#line 1487
final double X10_TEMP496 =
                  (X10_TEMP143);
                
//#line 1489
final double X10_TEMP499 =
                  (X10_TEMP496);
                
//#line 1490
/* template:array_set { */(b).set((X10_TEMP499),/* Join: { */X10_TEMP130,k/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var6____ = (__var72__).iterator(); __var6____.hasNext(); ) {
            	final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 1448
final int X10_TEMP441 =
                  (0);
                
//#line 1450
final int X10_TEMP122 =
                  (X10_TEMP441);
                
//#line 1451
final int X10_TEMP444 =
                  (1);
                
//#line 1453
final int X10_TEMP123 =
                  (X10_TEMP444);
                
//#line 1454
final int X10_TEMP447 =
                  (0);
                
//#line 1456
final int X10_TEMP124 =
                  (X10_TEMP447);
                
//#line 1457
final int X10_TEMP450 =
                  (0);
                
//#line 1459
final int X10_TEMP125 =
                  (X10_TEMP450);
                
//#line 1460
final int X10_TEMP453 =
                  (1);
                
//#line 1462
final int X10_TEMP126 =
                  (X10_TEMP453);
                
//#line 1463
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
                
//#line 1465
double t =
                  (X10_TEMP466);
                
//#line 1466
final int X10_TEMP469 =
                  (0);
                
//#line 1468
final int X10_TEMP130 =
                  (X10_TEMP469);
                
//#line 1469
final int X10_TEMP472 =
                  (0);
                
//#line 1471
final int X10_TEMP133 =
                  (X10_TEMP472);
                
//#line 1472
final double X10_TEMP477 =
                  (/* template:array_get { */((b).get(/* Join: { */X10_TEMP133,k/* } */))/* } */);
                
//#line 1474
final double X10_TEMP134 =
                  (X10_TEMP477);
                
//#line 1475
final double X10_TEMP480 =
                  (X10_TEMP134 -
                     t);
                
//#line 1477
final double X10_TEMP136 =
                  (X10_TEMP480);
                
//#line 1478
final double X10_TEMP485 =
                  (/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */);
                
//#line 1480
final double X10_TEMP139 =
                  (X10_TEMP485);
                
//#line 1481
final double X10_TEMP488 =
                  (X10_TEMP136 /
                     X10_TEMP139);
                
//#line 1483
final double X10_TEMP142 =
                  (X10_TEMP488);
                
//#line 1484
final double X10_TEMP491 =
                  (X10_TEMP142);
                
//#line 1486
final double X10_TEMP143 =
                  (X10_TEMP491);
                
//#line 1487
final double X10_TEMP496 =
                  (X10_TEMP143);
                
//#line 1489
final double X10_TEMP499 =
                  (X10_TEMP496);
                
//#line 1490
/* template:array_set { */(b).set((X10_TEMP499),/* Join: { */X10_TEMP130,k/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 1492
final int X10_TEMP501 =
              (1);
            
//#line 1494
final int X10_TEMP144 =
              (X10_TEMP501);
            
//#line 1495
final boolean X10_TEMP146 =
              (nm1 >=
                 X10_TEMP144);
            
//#line 1496
if (X10_TEMP146) {
                
//#line 1497
final int X10_TEMP506 =
                  (1);
                
//#line 1499
final int X10_TEMP150 =
                  (X10_TEMP506);
                
//#line 1500
final int X10_TEMP509 =
                  (1);
                
//#line 1502
final int X10_TEMP148 =
                  (X10_TEMP509);
                
//#line 1503
final int X10_TEMP512 =
                  (nm1 -
                     X10_TEMP148);
                
//#line 1505
final int X10_TEMP151 =
                  (X10_TEMP512);
                
//#line 1506
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
                
//#line 1508
x10.
                  lang.
                  region temprnm1 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP517));
                
//#line 1509
final x10.
                  lang.
                  place X10_TEMP520 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1511
final x10.
                  lang.
                  place X10_TEMP153 =
                  (X10_TEMP520);
                
//#line 1512
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
                
//#line 1514
x10.
                  lang.
                  dist temprnm1Dist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP523));
                
//#line 1515
/* template:forloop-mult { */{
                x10.lang.region __var75__ = (x10.lang.region) temprnm1Dist.
                                                                region;
                if (__var75__.size() > 0 && (__var75__ instanceof x10.array.MultiDimRegion || __var75__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var76__ = __var75__.rank(0).low(), __var77__ = __var75__.rank(0).high(); __var76__ <= __var77__; __var76__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int kb = __var76__;
                /* } */
                /* } */
{
                    
//#line 1516
final int X10_TEMP527 =
                      (1);
                    
//#line 1518
final int X10_TEMP156 =
                      (X10_TEMP527);
                    
//#line 1519
final int X10_TEMP530 =
                      (kb +
                         X10_TEMP156);
                    
//#line 1521
final int X10_TEMP158 =
                      (X10_TEMP530);
                    
//#line 1522
final int X10_TEMP533 =
                      (n -
                         X10_TEMP158);
                    
//#line 1524
final int k =
                      (X10_TEMP533);
                    
//#line 1525
final int X10_TEMP536 =
                      (1);
                    
//#line 1527
final int X10_TEMP160 =
                      (X10_TEMP536);
                    
//#line 1528
final int X10_TEMP539 =
                      (k +
                         X10_TEMP160);
                    
//#line 1530
final int kp1 =
                      (X10_TEMP539);
                    
//#line 1531
final int X10_TEMP542 =
                      (0);
                    
//#line 1533
final int X10_TEMP164 =
                      (X10_TEMP542);
                    
//#line 1534
final int X10_TEMP545 =
                      (kp1);
                    
//#line 1536
final int X10_TEMP166 =
                      (X10_TEMP545);
                    
//#line 1537
final int X10_TEMP548 =
                      (n -
                         X10_TEMP166);
                    
//#line 1539
final int X10_TEMP176 =
                      (X10_TEMP548);
                    
//#line 1540
final int X10_TEMP551 =
                      (1);
                    
//#line 1542
final int X10_TEMP177 =
                      (X10_TEMP551);
                    
//#line 1543
final int X10_TEMP554 =
                      (0);
                    
//#line 1545
final int X10_TEMP178 =
                      (X10_TEMP554);
                    
//#line 1546
final int X10_TEMP557 =
                      (1);
                    
//#line 1548
final int X10_TEMP179 =
                      (X10_TEMP557);
                    
//#line 1549
final double X10_TEMP562 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP164,k/* } */))/* } */);
                    
//#line 1551
final double X10_TEMP181 =
                      (X10_TEMP562);
                    
//#line 1552
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
                    
//#line 1554
final double X10_TEMP182 =
                      (X10_TEMP575);
                    
//#line 1555
final double X10_TEMP578 =
                      (X10_TEMP181 +
                         X10_TEMP182);
                    
//#line 1557
final double X10_TEMP183 =
                      (X10_TEMP578);
                    
//#line 1558
final double X10_TEMP583 =
                      (X10_TEMP183);
                    
//#line 1560
final double X10_TEMP586 =
                      (X10_TEMP583);
                    
//#line 1561
/* template:array_set { */(b).set((X10_TEMP586),/* Join: { */X10_TEMP164,k/* } */)/* } */;
                    
//#line 1562
final int X10_TEMP589 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1564
final int l =
                      (X10_TEMP589);
                    
//#line 1565
final boolean X10_TEMP187 =
                      (l !=
                         k);
                    
//#line 1566
if (X10_TEMP187) {
                        
//#line 1567
final int X10_TEMP594 =
                          (0);
                        
//#line 1569
final int X10_TEMP190 =
                          (X10_TEMP594);
                        
//#line 1570
final double X10_TEMP599 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP190,l/* } */))/* } */);
                        
//#line 1572
double t =
                          (X10_TEMP599);
                        
//#line 1573
final int X10_TEMP602 =
                          (0);
                        
//#line 1575
final int X10_TEMP194 =
                          (X10_TEMP602);
                        
//#line 1576
final int X10_TEMP605 =
                          (0);
                        
//#line 1578
final int X10_TEMP197 =
                          (X10_TEMP605);
                        
//#line 1579
final double X10_TEMP610 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP197,k/* } */))/* } */);
                        
//#line 1581
final double X10_TEMP200 =
                          (X10_TEMP610);
                        
//#line 1582
final double X10_TEMP613 =
                          (X10_TEMP200);
                        
//#line 1584
final double X10_TEMP201 =
                          (X10_TEMP613);
                        
//#line 1585
final double X10_TEMP618 =
                          (X10_TEMP201);
                        
//#line 1587
final double X10_TEMP621 =
                          (X10_TEMP618);
                        
//#line 1588
/* template:array_set { */(b).set((X10_TEMP621),/* Join: { */X10_TEMP194,l/* } */)/* } */;
                        
//#line 1589
final int X10_TEMP623 =
                          (0);
                        
//#line 1591
final int X10_TEMP204 =
                          (X10_TEMP623);
                        
//#line 1592
final double X10_TEMP626 =
                          (t);
                        
//#line 1594
final double X10_TEMP207 =
                          (X10_TEMP626);
                        
//#line 1595
final double X10_TEMP631 =
                          (X10_TEMP207);
                        
//#line 1597
final double X10_TEMP634 =
                          (X10_TEMP631);
                        
//#line 1598
/* template:array_set { */(b).set((X10_TEMP634),/* Join: { */X10_TEMP204,k/* } */)/* } */;
                    }
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var75__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int kb =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 1516
final int X10_TEMP527 =
                      (1);
                    
//#line 1518
final int X10_TEMP156 =
                      (X10_TEMP527);
                    
//#line 1519
final int X10_TEMP530 =
                      (kb +
                         X10_TEMP156);
                    
//#line 1521
final int X10_TEMP158 =
                      (X10_TEMP530);
                    
//#line 1522
final int X10_TEMP533 =
                      (n -
                         X10_TEMP158);
                    
//#line 1524
final int k =
                      (X10_TEMP533);
                    
//#line 1525
final int X10_TEMP536 =
                      (1);
                    
//#line 1527
final int X10_TEMP160 =
                      (X10_TEMP536);
                    
//#line 1528
final int X10_TEMP539 =
                      (k +
                         X10_TEMP160);
                    
//#line 1530
final int kp1 =
                      (X10_TEMP539);
                    
//#line 1531
final int X10_TEMP542 =
                      (0);
                    
//#line 1533
final int X10_TEMP164 =
                      (X10_TEMP542);
                    
//#line 1534
final int X10_TEMP545 =
                      (kp1);
                    
//#line 1536
final int X10_TEMP166 =
                      (X10_TEMP545);
                    
//#line 1537
final int X10_TEMP548 =
                      (n -
                         X10_TEMP166);
                    
//#line 1539
final int X10_TEMP176 =
                      (X10_TEMP548);
                    
//#line 1540
final int X10_TEMP551 =
                      (1);
                    
//#line 1542
final int X10_TEMP177 =
                      (X10_TEMP551);
                    
//#line 1543
final int X10_TEMP554 =
                      (0);
                    
//#line 1545
final int X10_TEMP178 =
                      (X10_TEMP554);
                    
//#line 1546
final int X10_TEMP557 =
                      (1);
                    
//#line 1548
final int X10_TEMP179 =
                      (X10_TEMP557);
                    
//#line 1549
final double X10_TEMP562 =
                      (/* template:array_get { */((b).get(/* Join: { */X10_TEMP164,k/* } */))/* } */);
                    
//#line 1551
final double X10_TEMP181 =
                      (X10_TEMP562);
                    
//#line 1552
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
                    
//#line 1554
final double X10_TEMP182 =
                      (X10_TEMP575);
                    
//#line 1555
final double X10_TEMP578 =
                      (X10_TEMP181 +
                         X10_TEMP182);
                    
//#line 1557
final double X10_TEMP183 =
                      (X10_TEMP578);
                    
//#line 1558
final double X10_TEMP583 =
                      (X10_TEMP183);
                    
//#line 1560
final double X10_TEMP586 =
                      (X10_TEMP583);
                    
//#line 1561
/* template:array_set { */(b).set((X10_TEMP586),/* Join: { */X10_TEMP164,k/* } */)/* } */;
                    
//#line 1562
final int X10_TEMP589 =
                      (/* template:array_get { */((ipvt).get(k))/* } */);
                    
//#line 1564
final int l =
                      (X10_TEMP589);
                    
//#line 1565
final boolean X10_TEMP187 =
                      (l !=
                         k);
                    
//#line 1566
if (X10_TEMP187) {
                        
//#line 1567
final int X10_TEMP594 =
                          (0);
                        
//#line 1569
final int X10_TEMP190 =
                          (X10_TEMP594);
                        
//#line 1570
final double X10_TEMP599 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP190,l/* } */))/* } */);
                        
//#line 1572
double t =
                          (X10_TEMP599);
                        
//#line 1573
final int X10_TEMP602 =
                          (0);
                        
//#line 1575
final int X10_TEMP194 =
                          (X10_TEMP602);
                        
//#line 1576
final int X10_TEMP605 =
                          (0);
                        
//#line 1578
final int X10_TEMP197 =
                          (X10_TEMP605);
                        
//#line 1579
final double X10_TEMP610 =
                          (/* template:array_get { */((b).get(/* Join: { */X10_TEMP197,k/* } */))/* } */);
                        
//#line 1581
final double X10_TEMP200 =
                          (X10_TEMP610);
                        
//#line 1582
final double X10_TEMP613 =
                          (X10_TEMP200);
                        
//#line 1584
final double X10_TEMP201 =
                          (X10_TEMP613);
                        
//#line 1585
final double X10_TEMP618 =
                          (X10_TEMP201);
                        
//#line 1587
final double X10_TEMP621 =
                          (X10_TEMP618);
                        
//#line 1588
/* template:array_set { */(b).set((X10_TEMP621),/* Join: { */X10_TEMP194,l/* } */)/* } */;
                        
//#line 1589
final int X10_TEMP623 =
                          (0);
                        
//#line 1591
final int X10_TEMP204 =
                          (X10_TEMP623);
                        
//#line 1592
final double X10_TEMP626 =
                          (t);
                        
//#line 1594
final double X10_TEMP207 =
                          (X10_TEMP626);
                        
//#line 1595
final double X10_TEMP631 =
                          (X10_TEMP207);
                        
//#line 1597
final double X10_TEMP634 =
                          (X10_TEMP631);
                        
//#line 1598
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
    
    
//#line 1604
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
        
//#line 1605
int X10_TEMP1 =
          (n);
        
//#line 1606
double X10_TEMP2 =
          (da);
        
//#line 1607
int X10_TEMP3 =
          (incx);
        
//#line 1608
x10.
          lang.
          DoubleReferenceArray X10_TEMP4 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((dy));
        
//#line 1609
int X10_TEMP5 =
          (dyCol);
        
//#line 1610
int X10_TEMP6 =
          (dy_off);
        
//#line 1611
int X10_TEMP7 =
          (incy);
        
//#line 1612
final int X10_TEMP217 =
          (0);
        
//#line 1614
final int X10_TEMP8 =
          (X10_TEMP217);
        
//#line 1615
final boolean X10_TEMP220 =
          (X10_TEMP1 >
             X10_TEMP8);
        
//#line 1617
final boolean X10_TEMP10 =
          (X10_TEMP220);
        
//#line 1618
final int X10_TEMP223 =
          (0);
        
//#line 1620
final int X10_TEMP11 =
          (X10_TEMP223);
        
//#line 1621
final boolean X10_TEMP226 =
          (X10_TEMP2 !=
             X10_TEMP11);
        
//#line 1623
final boolean X10_TEMP13 =
          (X10_TEMP226);
        
//#line 1624
final boolean X10_TEMP15 =
          (X10_TEMP10 &&
             X10_TEMP13);
        
//#line 1625
if (X10_TEMP15) {
            
//#line 1626
final int X10_TEMP231 =
              (1);
            
//#line 1628
final int X10_TEMP16 =
              (X10_TEMP231);
            
//#line 1629
final boolean X10_TEMP234 =
              (X10_TEMP3 !=
                 X10_TEMP16);
            
//#line 1631
final boolean X10_TEMP18 =
              (X10_TEMP234);
            
//#line 1632
final int X10_TEMP237 =
              (1);
            
//#line 1634
final int X10_TEMP17 =
              (X10_TEMP237);
            
//#line 1635
final boolean X10_TEMP240 =
              (X10_TEMP7 !=
                 X10_TEMP17);
            
//#line 1637
final boolean X10_TEMP19 =
              (X10_TEMP240);
            
//#line 1638
final boolean X10_TEMP21 =
              (X10_TEMP18 ||
                 X10_TEMP19);
            
//#line 1639
if (X10_TEMP21) {
                
//#line 1640
final int X10_TEMP245 =
                  (0);
                
//#line 1642
int ix =
                  (X10_TEMP245);
                
//#line 1643
final int X10_TEMP248 =
                  (0);
                
//#line 1645
int iy =
                  (X10_TEMP248);
                
//#line 1646
final int X10_TEMP251 =
                  (0);
                
//#line 1648
final int X10_TEMP24 =
                  (X10_TEMP251);
                
//#line 1649
final boolean X10_TEMP26 =
                  (X10_TEMP3 <
                     X10_TEMP24);
                
//#line 1650
if (X10_TEMP26) {
                    
//#line 1651
final int X10_TEMP27 =
                      (0);
                    
//#line 1652
final int X10_TEMP257 =
                      (X10_TEMP27 -
                         X10_TEMP1);
                    
//#line 1654
final int X10_TEMP28 =
                      (X10_TEMP257);
                    
//#line 1655
final int X10_TEMP260 =
                      (1);
                    
//#line 1657
final int X10_TEMP29 =
                      (X10_TEMP260);
                    
//#line 1658
final int X10_TEMP263 =
                      (X10_TEMP28 +
                         X10_TEMP29);
                    
//#line 1660
final int X10_TEMP31 =
                      (X10_TEMP263);
                    
//#line 1661
final int X10_TEMP266 =
                      (X10_TEMP31 *
                         X10_TEMP3);
                    
//#line 1663
final int X10_TEMP33 =
                      (X10_TEMP266);
                    
//#line 1664
final int X10_TEMP269 =
                      (X10_TEMP33);
                    
//#line 1666
ix =
                      ((X10_TEMP269));
                }
                
//#line 1668
final int X10_TEMP272 =
                  (0);
                
//#line 1670
final int X10_TEMP34 =
                  (X10_TEMP272);
                
//#line 1671
final boolean X10_TEMP36 =
                  (X10_TEMP7 <
                     X10_TEMP34);
                
//#line 1672
if (X10_TEMP36) {
                    
//#line 1673
final int X10_TEMP37 =
                      (0);
                    
//#line 1674
final int X10_TEMP278 =
                      (X10_TEMP37 -
                         X10_TEMP1);
                    
//#line 1676
final int X10_TEMP38 =
                      (X10_TEMP278);
                    
//#line 1677
final int X10_TEMP281 =
                      (1);
                    
//#line 1679
final int X10_TEMP39 =
                      (X10_TEMP281);
                    
//#line 1680
final int X10_TEMP284 =
                      (X10_TEMP38 +
                         X10_TEMP39);
                    
//#line 1682
final int X10_TEMP41 =
                      (X10_TEMP284);
                    
//#line 1683
final int X10_TEMP287 =
                      (X10_TEMP41 *
                         X10_TEMP7);
                    
//#line 1685
final int X10_TEMP43 =
                      (X10_TEMP287);
                    
//#line 1686
final int X10_TEMP290 =
                      (X10_TEMP43);
                    
//#line 1688
iy =
                      ((X10_TEMP290));
                }
                
//#line 1690
final int X10_TEMP293 =
                  (0);
                
//#line 1692
final int X10_TEMP47 =
                  (X10_TEMP293);
                
//#line 1693
final int X10_TEMP296 =
                  (1);
                
//#line 1695
final int X10_TEMP45 =
                  (X10_TEMP296);
                
//#line 1696
final int X10_TEMP299 =
                  (X10_TEMP1 -
                     X10_TEMP45);
                
//#line 1698
final int X10_TEMP48 =
                  (X10_TEMP299);
                
//#line 1699
final x10.
                  lang.
                  region X10_TEMP304 =
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
                          X10_TEMP47,
                          X10_TEMP48))));
                
//#line 1701
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP304));
                
//#line 1702
final x10.
                  lang.
                  place X10_TEMP307 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1704
final x10.
                  lang.
                  place X10_TEMP50 =
                  (X10_TEMP307);
                
//#line 1705
final x10.
                  lang.
                  dist X10_TEMP310 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP50)));
                
//#line 1707
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP310));
                
//#line 1708
/* template:forloop-mult { */{
                x10.lang.region __var78__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var78__.size() > 0 && (__var78__ instanceof x10.array.MultiDimRegion || __var78__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var79__ = __var78__.rank(0).low(), __var80__ = __var78__.rank(0).high(); __var79__ <= __var80__; __var79__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var79__;
                /* } */
                /* } */
{
                    
//#line 1709
final int X10_TEMP314 =
                      (iy +
                         X10_TEMP6);
                    
//#line 1711
final int X10_TEMP55 =
                      (X10_TEMP314);
                    
//#line 1712
final int X10_TEMP317 =
                      (ix +
                         dx_off);
                    
//#line 1714
final int X10_TEMP59 =
                      (X10_TEMP317);
                    
//#line 1715
final double X10_TEMP324 =
                      (Program0.
                         Program_Linpack_read(
                         X10_TEMP0,
                         dx,
                         dxCol,
                         X10_TEMP59));
                    
//#line 1717
final double X10_TEMP60 =
                      (X10_TEMP324);
                    
//#line 1718
final double X10_TEMP329 =
                      (/* template:array_get { */((X10_TEMP4).get(/* Join: { */X10_TEMP5,X10_TEMP55/* } */))/* } */);
                    
//#line 1720
final double X10_TEMP62 =
                      (X10_TEMP329);
                    
//#line 1721
final double X10_TEMP332 =
                      (X10_TEMP2 *
                         X10_TEMP60);
                    
//#line 1723
final double X10_TEMP63 =
                      (X10_TEMP332);
                    
//#line 1724
final double X10_TEMP335 =
                      (X10_TEMP62 +
                         X10_TEMP63);
                    
//#line 1726
final double X10_TEMP64 =
                      (X10_TEMP335);
                    
//#line 1727
final double X10_TEMP340 =
                      (X10_TEMP64);
                    
//#line 1729
final double X10_TEMP343 =
                      (X10_TEMP340);
                    
//#line 1730
/* template:array_set { */(X10_TEMP4).set((X10_TEMP343),/* Join: { */X10_TEMP5,X10_TEMP55/* } */)/* } */;
                    
//#line 1731
final int X10_TEMP345 =
                      (ix +
                         X10_TEMP3);
                    
//#line 1733
ix =
                      ((X10_TEMP345));
                    
//#line 1734
final int X10_TEMP348 =
                      (iy +
                         X10_TEMP7);
                    
//#line 1736
iy =
                      ((X10_TEMP348));
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var8____ = (__var78__).iterator(); __var8____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 1709
final int X10_TEMP314 =
                      (iy +
                         X10_TEMP6);
                    
//#line 1711
final int X10_TEMP55 =
                      (X10_TEMP314);
                    
//#line 1712
final int X10_TEMP317 =
                      (ix +
                         dx_off);
                    
//#line 1714
final int X10_TEMP59 =
                      (X10_TEMP317);
                    
//#line 1715
final double X10_TEMP324 =
                      (Program0.
                         Program_Linpack_read(
                         X10_TEMP0,
                         dx,
                         dxCol,
                         X10_TEMP59));
                    
//#line 1717
final double X10_TEMP60 =
                      (X10_TEMP324);
                    
//#line 1718
final double X10_TEMP329 =
                      (/* template:array_get { */((X10_TEMP4).get(/* Join: { */X10_TEMP5,X10_TEMP55/* } */))/* } */);
                    
//#line 1720
final double X10_TEMP62 =
                      (X10_TEMP329);
                    
//#line 1721
final double X10_TEMP332 =
                      (X10_TEMP2 *
                         X10_TEMP60);
                    
//#line 1723
final double X10_TEMP63 =
                      (X10_TEMP332);
                    
//#line 1724
final double X10_TEMP335 =
                      (X10_TEMP62 +
                         X10_TEMP63);
                    
//#line 1726
final double X10_TEMP64 =
                      (X10_TEMP335);
                    
//#line 1727
final double X10_TEMP340 =
                      (X10_TEMP64);
                    
//#line 1729
final double X10_TEMP343 =
                      (X10_TEMP340);
                    
//#line 1730
/* template:array_set { */(X10_TEMP4).set((X10_TEMP343),/* Join: { */X10_TEMP5,X10_TEMP55/* } */)/* } */;
                    
//#line 1731
final int X10_TEMP345 =
                      (ix +
                         X10_TEMP3);
                    
//#line 1733
ix =
                      ((X10_TEMP345));
                    
//#line 1734
final int X10_TEMP348 =
                      (iy +
                         X10_TEMP7);
                    
//#line 1736
iy =
                      ((X10_TEMP348));
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 1738
return;
            }
            
//#line 1740
final int X10_TEMP351 =
              (0);
            
//#line 1742
final int X10_TEMP70 =
              (X10_TEMP351);
            
//#line 1743
final int X10_TEMP354 =
              (1);
            
//#line 1745
final int X10_TEMP68 =
              (X10_TEMP354);
            
//#line 1746
final int X10_TEMP357 =
              (X10_TEMP1 -
                 X10_TEMP68);
            
//#line 1748
final int X10_TEMP71 =
              (X10_TEMP357);
            
//#line 1749
final x10.
              lang.
              region X10_TEMP362 =
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
            
//#line 1751
x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP362));
            
//#line 1752
final x10.
              lang.
              place X10_TEMP365 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1754
final x10.
              lang.
              place X10_TEMP73 =
              (X10_TEMP365);
            
//#line 1755
final x10.
              lang.
              dist X10_TEMP368 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP73)));
            
//#line 1757
x10.
              lang.
              dist temprDist =
              (x10.
                lang.
                dist)
                ((X10_TEMP368));
            
//#line 1758
/* template:forloop-mult { */{
            x10.lang.region __var81__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var81__.size() > 0 && (__var81__ instanceof x10.array.MultiDimRegion || __var81__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var82__ = __var81__.rank(0).low(), __var83__ = __var81__.rank(0).high(); __var82__ <= __var83__; __var82__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var82__;
            /* } */
            /* } */
{
                
//#line 1759
final int X10_TEMP372 =
                  (i +
                     X10_TEMP6);
                
//#line 1761
final int X10_TEMP78 =
                  (X10_TEMP372);
                
//#line 1762
final int X10_TEMP375 =
                  (i +
                     dx_off);
                
//#line 1764
final int X10_TEMP82 =
                  (X10_TEMP375);
                
//#line 1765
final double X10_TEMP382 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxCol,
                     X10_TEMP82));
                
//#line 1767
final double X10_TEMP83 =
                  (X10_TEMP382);
                
//#line 1768
final double X10_TEMP387 =
                  (/* template:array_get { */((X10_TEMP4).get(/* Join: { */X10_TEMP5,X10_TEMP78/* } */))/* } */);
                
//#line 1770
final double X10_TEMP85 =
                  (X10_TEMP387);
                
//#line 1771
final double X10_TEMP390 =
                  (X10_TEMP2 *
                     X10_TEMP83);
                
//#line 1773
final double X10_TEMP86 =
                  (X10_TEMP390);
                
//#line 1774
final double X10_TEMP393 =
                  (X10_TEMP85 +
                     X10_TEMP86);
                
//#line 1776
final double X10_TEMP87 =
                  (X10_TEMP393);
                
//#line 1777
final double X10_TEMP398 =
                  (X10_TEMP87);
                
//#line 1779
final double X10_TEMP401 =
                  (X10_TEMP398);
                
//#line 1780
/* template:array_set { */(X10_TEMP4).set((X10_TEMP401),/* Join: { */X10_TEMP5,X10_TEMP78/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var9____ = (__var81__).iterator(); __var9____.hasNext(); ) {
            	final  x10.
              lang.
              point __var9__ = (x10.
              lang.
              point) __var9____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                
//#line 1759
final int X10_TEMP372 =
                  (i +
                     X10_TEMP6);
                
//#line 1761
final int X10_TEMP78 =
                  (X10_TEMP372);
                
//#line 1762
final int X10_TEMP375 =
                  (i +
                     dx_off);
                
//#line 1764
final int X10_TEMP82 =
                  (X10_TEMP375);
                
//#line 1765
final double X10_TEMP382 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxCol,
                     X10_TEMP82));
                
//#line 1767
final double X10_TEMP83 =
                  (X10_TEMP382);
                
//#line 1768
final double X10_TEMP387 =
                  (/* template:array_get { */((X10_TEMP4).get(/* Join: { */X10_TEMP5,X10_TEMP78/* } */))/* } */);
                
//#line 1770
final double X10_TEMP85 =
                  (X10_TEMP387);
                
//#line 1771
final double X10_TEMP390 =
                  (X10_TEMP2 *
                     X10_TEMP83);
                
//#line 1773
final double X10_TEMP86 =
                  (X10_TEMP390);
                
//#line 1774
final double X10_TEMP393 =
                  (X10_TEMP85 +
                     X10_TEMP86);
                
//#line 1776
final double X10_TEMP87 =
                  (X10_TEMP393);
                
//#line 1777
final double X10_TEMP398 =
                  (X10_TEMP87);
                
//#line 1779
final double X10_TEMP401 =
                  (X10_TEMP398);
                
//#line 1780
/* template:array_set { */(X10_TEMP4).set((X10_TEMP401),/* Join: { */X10_TEMP5,X10_TEMP78/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
    }
    
    
//#line 1784
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
        
//#line 1785
final int X10_TEMP210 =
          (0);
        
//#line 1787
double dtemp =
          (X10_TEMP210);
        
//#line 1788
final int X10_TEMP213 =
          (0);
        
//#line 1790
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 1791
final boolean X10_TEMP4 =
          (n >
             X10_TEMP2);
        
//#line 1792
if (X10_TEMP4) {
            
//#line 1793
final int X10_TEMP218 =
              (1);
            
//#line 1795
final int X10_TEMP5 =
              (X10_TEMP218);
            
//#line 1796
final boolean X10_TEMP221 =
              (incx !=
                 X10_TEMP5);
            
//#line 1798
final boolean X10_TEMP7 =
              (X10_TEMP221);
            
//#line 1799
final int X10_TEMP224 =
              (1);
            
//#line 1801
final int X10_TEMP6 =
              (X10_TEMP224);
            
//#line 1802
final boolean X10_TEMP227 =
              (incy !=
                 X10_TEMP6);
            
//#line 1804
final boolean X10_TEMP8 =
              (X10_TEMP227);
            
//#line 1805
final boolean X10_TEMP10 =
              (X10_TEMP7 ||
                 X10_TEMP8);
            
//#line 1806
if (X10_TEMP10) {
                
//#line 1807
final int X10_TEMP232 =
                  (0);
                
//#line 1809
int ix =
                  (X10_TEMP232);
                
//#line 1810
final int X10_TEMP235 =
                  (0);
                
//#line 1812
int iy =
                  (X10_TEMP235);
                
//#line 1813
final int X10_TEMP238 =
                  (0);
                
//#line 1815
final int X10_TEMP13 =
                  (X10_TEMP238);
                
//#line 1816
final boolean X10_TEMP15 =
                  (incx <
                     X10_TEMP13);
                
//#line 1817
if (X10_TEMP15) {
                    
//#line 1818
final int X10_TEMP16 =
                      (0);
                    
//#line 1819
final int X10_TEMP244 =
                      (X10_TEMP16 -
                         n);
                    
//#line 1821
final int X10_TEMP17 =
                      (X10_TEMP244);
                    
//#line 1822
final int X10_TEMP247 =
                      (1);
                    
//#line 1824
final int X10_TEMP18 =
                      (X10_TEMP247);
                    
//#line 1825
final int X10_TEMP250 =
                      (X10_TEMP17 +
                         X10_TEMP18);
                    
//#line 1827
final int X10_TEMP20 =
                      (X10_TEMP250);
                    
//#line 1828
final int X10_TEMP253 =
                      (X10_TEMP20 *
                         incx);
                    
//#line 1830
final int X10_TEMP22 =
                      (X10_TEMP253);
                    
//#line 1831
final int X10_TEMP256 =
                      (X10_TEMP22);
                    
//#line 1833
ix =
                      ((X10_TEMP256));
                }
                
//#line 1835
final int X10_TEMP259 =
                  (0);
                
//#line 1837
final int X10_TEMP23 =
                  (X10_TEMP259);
                
//#line 1838
final boolean X10_TEMP25 =
                  (incy <
                     X10_TEMP23);
                
//#line 1839
if (X10_TEMP25) {
                    
//#line 1840
final int X10_TEMP26 =
                      (0);
                    
//#line 1841
final int X10_TEMP265 =
                      (X10_TEMP26 -
                         n);
                    
//#line 1843
final int X10_TEMP27 =
                      (X10_TEMP265);
                    
//#line 1844
final int X10_TEMP268 =
                      (1);
                    
//#line 1846
final int X10_TEMP28 =
                      (X10_TEMP268);
                    
//#line 1847
final int X10_TEMP271 =
                      (X10_TEMP27 +
                         X10_TEMP28);
                    
//#line 1849
final int X10_TEMP30 =
                      (X10_TEMP271);
                    
//#line 1850
final int X10_TEMP274 =
                      (X10_TEMP30 *
                         incy);
                    
//#line 1852
final int X10_TEMP32 =
                      (X10_TEMP274);
                    
//#line 1853
final int X10_TEMP277 =
                      (X10_TEMP32);
                    
//#line 1855
iy =
                      ((X10_TEMP277));
                }
                
//#line 1857
final int X10_TEMP280 =
                  (0);
                
//#line 1859
final int X10_TEMP36 =
                  (X10_TEMP280);
                
//#line 1860
final int X10_TEMP283 =
                  (1);
                
//#line 1862
final int X10_TEMP34 =
                  (X10_TEMP283);
                
//#line 1863
final int X10_TEMP286 =
                  (n -
                     X10_TEMP34);
                
//#line 1865
final int X10_TEMP37 =
                  (X10_TEMP286);
                
//#line 1866
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
                
//#line 1868
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP291));
                
//#line 1869
final x10.
                  lang.
                  place X10_TEMP294 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1871
final x10.
                  lang.
                  place X10_TEMP39 =
                  (X10_TEMP294);
                
//#line 1872
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
                
//#line 1874
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP297));
                
//#line 1875
/* template:forloop-mult { */{
                x10.lang.region __var84__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var84__.size() > 0 && (__var84__ instanceof x10.array.MultiDimRegion || __var84__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var85__ = __var84__.rank(0).low(), __var86__ = __var84__.rank(0).high(); __var85__ <= __var86__; __var85__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var85__;
                /* } */
                /* } */
{
                    
//#line 1876
final int X10_TEMP301 =
                      (ix +
                         dx_off);
                    
//#line 1878
final int X10_TEMP44 =
                      (X10_TEMP301);
                    
//#line 1879
final double X10_TEMP306 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP44/* } */))/* } */);
                    
//#line 1881
final double X10_TEMP48 =
                      (X10_TEMP306);
                    
//#line 1882
final int X10_TEMP309 =
                      (iy +
                         dy_off);
                    
//#line 1884
final int X10_TEMP47 =
                      (X10_TEMP309);
                    
//#line 1885
final double X10_TEMP314 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP47/* } */))/* } */);
                    
//#line 1887
final double X10_TEMP49 =
                      (X10_TEMP314);
                    
//#line 1888
final double X10_TEMP317 =
                      (X10_TEMP48 *
                         X10_TEMP49);
                    
//#line 1890
final double X10_TEMP51 =
                      (X10_TEMP317);
                    
//#line 1891
final double X10_TEMP320 =
                      (dtemp +
                         X10_TEMP51);
                    
//#line 1893
dtemp =
                      ((X10_TEMP320));
                    
//#line 1894
final int X10_TEMP323 =
                      (ix +
                         incx);
                    
//#line 1896
ix =
                      ((X10_TEMP323));
                    
//#line 1897
final int X10_TEMP326 =
                      (iy +
                         incy);
                    
//#line 1899
iy =
                      ((X10_TEMP326));
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var10____ = (__var84__).iterator(); __var10____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var10__ = (x10.
                  lang.
                  point) __var10____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                    
//#line 1876
final int X10_TEMP301 =
                      (ix +
                         dx_off);
                    
//#line 1878
final int X10_TEMP44 =
                      (X10_TEMP301);
                    
//#line 1879
final double X10_TEMP306 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP44/* } */))/* } */);
                    
//#line 1881
final double X10_TEMP48 =
                      (X10_TEMP306);
                    
//#line 1882
final int X10_TEMP309 =
                      (iy +
                         dy_off);
                    
//#line 1884
final int X10_TEMP47 =
                      (X10_TEMP309);
                    
//#line 1885
final double X10_TEMP314 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP47/* } */))/* } */);
                    
//#line 1887
final double X10_TEMP49 =
                      (X10_TEMP314);
                    
//#line 1888
final double X10_TEMP317 =
                      (X10_TEMP48 *
                         X10_TEMP49);
                    
//#line 1890
final double X10_TEMP51 =
                      (X10_TEMP317);
                    
//#line 1891
final double X10_TEMP320 =
                      (dtemp +
                         X10_TEMP51);
                    
//#line 1893
dtemp =
                      ((X10_TEMP320));
                    
//#line 1894
final int X10_TEMP323 =
                      (ix +
                         incx);
                    
//#line 1896
ix =
                      ((X10_TEMP323));
                    
//#line 1897
final int X10_TEMP326 =
                      (iy +
                         incy);
                    
//#line 1899
iy =
                      ((X10_TEMP326));
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            } else {
                
//#line 1903
final int X10_TEMP329 =
                  (0);
                
//#line 1905
final int X10_TEMP57 =
                  (X10_TEMP329);
                
//#line 1906
final int X10_TEMP332 =
                  (1);
                
//#line 1908
final int X10_TEMP55 =
                  (X10_TEMP332);
                
//#line 1909
final int X10_TEMP335 =
                  (n -
                     X10_TEMP55);
                
//#line 1911
final int X10_TEMP58 =
                  (X10_TEMP335);
                
//#line 1912
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
                
//#line 1914
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP340));
                
//#line 1915
final x10.
                  lang.
                  place X10_TEMP343 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1917
final x10.
                  lang.
                  place X10_TEMP60 =
                  (X10_TEMP343);
                
//#line 1918
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
                
//#line 1920
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP346));
                
//#line 1921
/* template:forloop-mult { */{
                x10.lang.region __var87__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var87__.size() > 0 && (__var87__ instanceof x10.array.MultiDimRegion || __var87__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var88__ = __var87__.rank(0).low(), __var89__ = __var87__.rank(0).high(); __var88__ <= __var89__; __var88__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var88__;
                /* } */
                /* } */
{
                    
//#line 1922
final int X10_TEMP350 =
                      (i +
                         dx_off);
                    
//#line 1924
final int X10_TEMP65 =
                      (X10_TEMP350);
                    
//#line 1925
final double X10_TEMP355 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP65/* } */))/* } */);
                    
//#line 1927
final double X10_TEMP69 =
                      (X10_TEMP355);
                    
//#line 1928
final int X10_TEMP358 =
                      (i +
                         dy_off);
                    
//#line 1930
final int X10_TEMP68 =
                      (X10_TEMP358);
                    
//#line 1931
final double X10_TEMP363 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP68/* } */))/* } */);
                    
//#line 1933
final double X10_TEMP70 =
                      (X10_TEMP363);
                    
//#line 1934
final double X10_TEMP366 =
                      (X10_TEMP69 *
                         X10_TEMP70);
                    
//#line 1936
final double X10_TEMP72 =
                      (X10_TEMP366);
                    
//#line 1937
final double X10_TEMP369 =
                      (dtemp +
                         X10_TEMP72);
                    
//#line 1939
dtemp =
                      ((X10_TEMP369));
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var11____ = (__var87__).iterator(); __var11____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var11__ = (x10.
                  lang.
                  point) __var11____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                    
//#line 1922
final int X10_TEMP350 =
                      (i +
                         dx_off);
                    
//#line 1924
final int X10_TEMP65 =
                      (X10_TEMP350);
                    
//#line 1925
final double X10_TEMP355 =
                      (/* template:array_get { */((dx).get(/* Join: { */dxCol,X10_TEMP65/* } */))/* } */);
                    
//#line 1927
final double X10_TEMP69 =
                      (X10_TEMP355);
                    
//#line 1928
final int X10_TEMP358 =
                      (i +
                         dy_off);
                    
//#line 1930
final int X10_TEMP68 =
                      (X10_TEMP358);
                    
//#line 1931
final double X10_TEMP363 =
                      (/* template:array_get { */((dy).get(/* Join: { */dyCol,X10_TEMP68/* } */))/* } */);
                    
//#line 1933
final double X10_TEMP70 =
                      (X10_TEMP363);
                    
//#line 1934
final double X10_TEMP366 =
                      (X10_TEMP69 *
                         X10_TEMP70);
                    
//#line 1936
final double X10_TEMP72 =
                      (X10_TEMP366);
                    
//#line 1937
final double X10_TEMP369 =
                      (dtemp +
                         X10_TEMP72);
                    
//#line 1939
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
        
//#line 1943
return dtemp;
    }
    
    
//#line 1945
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
        
//#line 1946
int X10_TEMP1 =
          (n);
        
//#line 1947
double X10_TEMP2 =
          (da);
        
//#line 1948
x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((dx));
        
//#line 1949
int X10_TEMP4 =
          (currentCol);
        
//#line 1950
int X10_TEMP5 =
          (dx_off);
        
//#line 1951
int X10_TEMP6 =
          (incx);
        
//#line 1952
final int X10_TEMP216 =
          (0);
        
//#line 1954
final int X10_TEMP7 =
          (X10_TEMP216);
        
//#line 1955
final boolean X10_TEMP9 =
          (X10_TEMP1 >
             X10_TEMP7);
        
//#line 1956
if (X10_TEMP9) {
            
//#line 1957
final int X10_TEMP221 =
              (1);
            
//#line 1959
final int X10_TEMP10 =
              (X10_TEMP221);
            
//#line 1960
final boolean X10_TEMP12 =
              (X10_TEMP6 !=
                 X10_TEMP10);
            
//#line 1961
if (X10_TEMP12) {
                
//#line 1962
final int X10_TEMP226 =
                  (X10_TEMP1 *
                     X10_TEMP6);
                
//#line 1964
final int nincx =
                  (X10_TEMP226);
                
//#line 1965
final int X10_TEMP229 =
                  (0);
                
//#line 1967
int i =
                  (X10_TEMP229);
                
//#line 1968
boolean X10_TEMP17 =
                  (i <
                     nincx);
                
//#line 1969
boolean X10_TEMP234 =
                  X10_TEMP17;
                
//#line 1970
while (X10_TEMP234) {
                    
//#line 1971
final int X10_TEMP236 =
                      (i +
                         X10_TEMP5);
                    
//#line 1973
final int X10_TEMP20 =
                      (X10_TEMP236);
                    
//#line 1974
final double X10_TEMP241 =
                      (/* template:array_get { */((X10_TEMP3).get(/* Join: { */X10_TEMP4,X10_TEMP20/* } */))/* } */);
                    
//#line 1976
final double X10_TEMP22 =
                      (X10_TEMP241);
                    
//#line 1977
final double X10_TEMP244 =
                      (X10_TEMP22 *
                         X10_TEMP2);
                    
//#line 1979
final double X10_TEMP23 =
                      (X10_TEMP244);
                    
//#line 1980
final double X10_TEMP249 =
                      (X10_TEMP23);
                    
//#line 1982
final double X10_TEMP252 =
                      (X10_TEMP249);
                    
//#line 1983
/* template:array_set { */(X10_TEMP3).set((X10_TEMP252),/* Join: { */X10_TEMP4,X10_TEMP20/* } */)/* } */;
                    
//#line 1984
final int X10_TEMP254 =
                      (i +
                         X10_TEMP6);
                    
//#line 1986
i =
                      ((X10_TEMP254));
                    
//#line 1987
final boolean X10_TEMP257 =
                      (i <
                         nincx);
                    
//#line 1988
X10_TEMP17 =
                      ((X10_TEMP257));
                    
//#line 1989
X10_TEMP234 =
                      X10_TEMP17;
                }
            } else {
                
//#line 1993
final int X10_TEMP259 =
                  (0);
                
//#line 1995
final int X10_TEMP28 =
                  (X10_TEMP259);
                
//#line 1996
final int X10_TEMP262 =
                  (1);
                
//#line 1998
final int X10_TEMP26 =
                  (X10_TEMP262);
                
//#line 1999
final int X10_TEMP265 =
                  (X10_TEMP1 -
                     X10_TEMP26);
                
//#line 2001
final int X10_TEMP29 =
                  (X10_TEMP265);
                
//#line 2002
final x10.
                  lang.
                  region X10_TEMP270 =
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
                          X10_TEMP28,
                          X10_TEMP29))));
                
//#line 2004
x10.
                  lang.
                  region tempr =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP270));
                
//#line 2005
final x10.
                  lang.
                  place X10_TEMP273 =
                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 2007
final x10.
                  lang.
                  place X10_TEMP31 =
                  (X10_TEMP273);
                
//#line 2008
final x10.
                  lang.
                  dist X10_TEMP276 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        tempr,
                        X10_TEMP31)));
                
//#line 2010
x10.
                  lang.
                  dist temprDist =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP276));
                
//#line 2011
/* template:forloop-mult { */{
                x10.lang.region __var90__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var90__.size() > 0 && (__var90__ instanceof x10.array.MultiDimRegion || __var90__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var91__ = __var90__.rank(0).low(), __var92__ = __var90__.rank(0).high(); __var91__ <= __var92__; __var91__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var91__;
                /* } */
                /* } */
{
                    
//#line 2012
final int X10_TEMP280 =
                      (i +
                         X10_TEMP5);
                    
//#line 2014
final int X10_TEMP36 =
                      (X10_TEMP280);
                    
//#line 2015
final double X10_TEMP285 =
                      (/* template:array_get { */((X10_TEMP3).get(/* Join: { */X10_TEMP4,X10_TEMP36/* } */))/* } */);
                    
//#line 2017
final double X10_TEMP38 =
                      (X10_TEMP285);
                    
//#line 2018
final double X10_TEMP288 =
                      (X10_TEMP38 *
                         X10_TEMP2);
                    
//#line 2020
final double X10_TEMP39 =
                      (X10_TEMP288);
                    
//#line 2021
final double X10_TEMP293 =
                      (X10_TEMP39);
                    
//#line 2023
final double X10_TEMP296 =
                      (X10_TEMP293);
                    
//#line 2024
/* template:array_set { */(X10_TEMP3).set((X10_TEMP296),/* Join: { */X10_TEMP4,X10_TEMP36/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var12____ = (__var90__).iterator(); __var12____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var12__ = (x10.
                  lang.
                  point) __var12____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                    
//#line 2012
final int X10_TEMP280 =
                      (i +
                         X10_TEMP5);
                    
//#line 2014
final int X10_TEMP36 =
                      (X10_TEMP280);
                    
//#line 2015
final double X10_TEMP285 =
                      (/* template:array_get { */((X10_TEMP3).get(/* Join: { */X10_TEMP4,X10_TEMP36/* } */))/* } */);
                    
//#line 2017
final double X10_TEMP38 =
                      (X10_TEMP285);
                    
//#line 2018
final double X10_TEMP288 =
                      (X10_TEMP38 *
                         X10_TEMP2);
                    
//#line 2020
final double X10_TEMP39 =
                      (X10_TEMP288);
                    
//#line 2021
final double X10_TEMP293 =
                      (X10_TEMP39);
                    
//#line 2023
final double X10_TEMP296 =
                      (X10_TEMP293);
                    
//#line 2024
/* template:array_set { */(X10_TEMP3).set((X10_TEMP296),/* Join: { */X10_TEMP4,X10_TEMP36/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
    }
    
    
//#line 2029
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
        
//#line 2030
final int X10_TEMP210 =
          (1);
        
//#line 2032
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 2033
final boolean X10_TEMP3 =
          (n <
             X10_TEMP1);
        
//#line 2034
if (X10_TEMP3) {
            
//#line 2035
final int X10_TEMP215 =
              (1);
            
//#line 2037
final int X10_TEMP4 =
              (X10_TEMP215);
            
//#line 2038
final int X10_TEMP5 =
              (0);
            
//#line 2039
final int X10_TEMP219 =
              (X10_TEMP5 -
                 X10_TEMP4);
            
//#line 2041
final int X10_TEMP7 =
              (X10_TEMP219);
            
//#line 2042
return X10_TEMP7;
        }
        
//#line 2044
final int X10_TEMP223 =
          (1);
        
//#line 2046
final int X10_TEMP8 =
          (X10_TEMP223);
        
//#line 2047
final boolean X10_TEMP10 =
          (n ==
             X10_TEMP8);
        
//#line 2048
if (X10_TEMP10) {
            
//#line 2049
final int X10_TEMP228 =
              (0);
            
//#line 2051
final int X10_TEMP12 =
              (X10_TEMP228);
            
//#line 2052
return X10_TEMP12;
        }
        
//#line 2054
final int X10_TEMP232 =
          (1);
        
//#line 2056
final int X10_TEMP13 =
          (X10_TEMP232);
        
//#line 2057
final boolean X10_TEMP15 =
          (incx !=
             X10_TEMP13);
        
//#line 2058
if (X10_TEMP15) {
            
//#line 2059
final int X10_TEMP237 =
              (0);
            
//#line 2061
int itemp =
              (X10_TEMP237);
            
//#line 2062
final int X10_TEMP240 =
              (0);
            
//#line 2064
final int X10_TEMP19 =
              (X10_TEMP240);
            
//#line 2065
final int X10_TEMP243 =
              (X10_TEMP19 +
                 dx_off);
            
//#line 2067
final int X10_TEMP21 =
              (X10_TEMP243);
            
//#line 2068
final double X10_TEMP250 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP21));
            
//#line 2070
final double X10_TEMP23 =
              (X10_TEMP250);
            
//#line 2071
final double X10_TEMP255 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP23));
            
//#line 2073
double dmax =
              (X10_TEMP255);
            
//#line 2074
final int X10_TEMP258 =
              (1);
            
//#line 2076
final int X10_TEMP25 =
              (X10_TEMP258);
            
//#line 2077
final int X10_TEMP261 =
              (X10_TEMP25 +
                 incx);
            
//#line 2079
int ix =
              (X10_TEMP261);
            
//#line 2080
final int X10_TEMP264 =
              (1);
            
//#line 2082
final int X10_TEMP30 =
              (X10_TEMP264);
            
//#line 2083
final int X10_TEMP267 =
              (1);
            
//#line 2085
final int X10_TEMP28 =
              (X10_TEMP267);
            
//#line 2086
final int X10_TEMP270 =
              (n -
                 X10_TEMP28);
            
//#line 2088
final int X10_TEMP31 =
              (X10_TEMP270);
            
//#line 2089
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
            
//#line 2091
final x10.
              lang.
              region X10_TEMP33 =
              (x10.
                lang.
                region)
                ((X10_TEMP275));
            
//#line 2092
/* template:forloop-mult { */{
            x10.lang.region __var93__ = (x10.lang.region) X10_TEMP33;
            if (__var93__.size() > 0 && (__var93__ instanceof x10.array.MultiDimRegion || __var93__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var94__ = __var93__.rank(0).low(), __var95__ = __var93__.rank(0).high(); __var94__ <= __var95__; __var94__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var94__;
            /* } */
            /* } */
{
                
//#line 2093
final int X10_TEMP279 =
                  (ix +
                     dx_off);
                
//#line 2095
final int X10_TEMP37 =
                  (X10_TEMP279);
                
//#line 2096
final double X10_TEMP286 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxk,
                     X10_TEMP37));
                
//#line 2098
final double X10_TEMP39 =
                  (X10_TEMP286);
                
//#line 2099
final double X10_TEMP291 =
                  (Program0.
                     Program_Linpack_myabs(
                     X10_TEMP0,
                     X10_TEMP39));
                
//#line 2101
double dtemp =
                  (X10_TEMP291);
                
//#line 2102
final boolean X10_TEMP42 =
                  (dtemp >
                     dmax);
                
//#line 2103
if (X10_TEMP42) {
                    
//#line 2104
final int X10_TEMP296 =
                      (i);
                    
//#line 2106
itemp =
                      ((X10_TEMP296));
                    
//#line 2107
final double X10_TEMP299 =
                      (dtemp);
                    
//#line 2109
dmax =
                      ((X10_TEMP299));
                }
                
//#line 2111
final int X10_TEMP302 =
                  (ix +
                     incx);
                
//#line 2113
ix =
                  ((X10_TEMP302));
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var13____ = (__var93__).iterator(); __var13____.hasNext(); ) {
            	final  x10.
              lang.
              point __var13__ = (x10.
              lang.
              point) __var13____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                
//#line 2093
final int X10_TEMP279 =
                  (ix +
                     dx_off);
                
//#line 2095
final int X10_TEMP37 =
                  (X10_TEMP279);
                
//#line 2096
final double X10_TEMP286 =
                  (Program0.
                     Program_Linpack_read(
                     X10_TEMP0,
                     dx,
                     dxk,
                     X10_TEMP37));
                
//#line 2098
final double X10_TEMP39 =
                  (X10_TEMP286);
                
//#line 2099
final double X10_TEMP291 =
                  (Program0.
                     Program_Linpack_myabs(
                     X10_TEMP0,
                     X10_TEMP39));
                
//#line 2101
double dtemp =
                  (X10_TEMP291);
                
//#line 2102
final boolean X10_TEMP42 =
                  (dtemp >
                     dmax);
                
//#line 2103
if (X10_TEMP42) {
                    
//#line 2104
final int X10_TEMP296 =
                      (i);
                    
//#line 2106
itemp =
                      ((X10_TEMP296));
                    
//#line 2107
final double X10_TEMP299 =
                      (dtemp);
                    
//#line 2109
dmax =
                      ((X10_TEMP299));
                }
                
//#line 2111
final int X10_TEMP302 =
                  (ix +
                     incx);
                
//#line 2113
ix =
                  ((X10_TEMP302));
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 2115
return itemp;
        }
        
//#line 2117
final int X10_TEMP306 =
          (0);
        
//#line 2119
int itemp =
          (X10_TEMP306);
        
//#line 2120
final int X10_TEMP309 =
          (0);
        
//#line 2122
final int X10_TEMP50 =
          (X10_TEMP309);
        
//#line 2123
final int X10_TEMP312 =
          (X10_TEMP50 +
             dx_off);
        
//#line 2125
final int X10_TEMP52 =
          (X10_TEMP312);
        
//#line 2126
final double X10_TEMP319 =
          (Program0.
             Program_Linpack_read(
             X10_TEMP0,
             dx,
             dxk,
             X10_TEMP52));
        
//#line 2128
final double X10_TEMP54 =
          (X10_TEMP319);
        
//#line 2129
final double X10_TEMP324 =
          (Program0.
             Program_Linpack_myabs(
             X10_TEMP0,
             X10_TEMP54));
        
//#line 2131
double dmax =
          (X10_TEMP324);
        
//#line 2132
final int X10_TEMP327 =
          (1);
        
//#line 2134
final int X10_TEMP59 =
          (X10_TEMP327);
        
//#line 2135
final int X10_TEMP330 =
          (1);
        
//#line 2137
final int X10_TEMP57 =
          (X10_TEMP330);
        
//#line 2138
final int X10_TEMP333 =
          (n -
             X10_TEMP57);
        
//#line 2140
final int X10_TEMP60 =
          (X10_TEMP333);
        
//#line 2141
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
        
//#line 2143
final x10.
          lang.
          region X10_TEMP62 =
          (x10.
            lang.
            region)
            ((X10_TEMP338));
        
//#line 2144
/* template:forloop-mult { */{
        x10.lang.region __var96__ = (x10.lang.region) X10_TEMP62;
        if (__var96__.size() > 0 && (__var96__ instanceof x10.array.MultiDimRegion || __var96__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var97__ = __var96__.rank(0).low(), __var98__ = __var96__.rank(0).high(); __var97__ <= __var98__; __var97__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var97__;
        /* } */
        /* } */
{
            
//#line 2145
final int X10_TEMP342 =
              (i +
                 dx_off);
            
//#line 2147
final int X10_TEMP66 =
              (X10_TEMP342);
            
//#line 2148
final double X10_TEMP349 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP66));
            
//#line 2150
final double X10_TEMP68 =
              (X10_TEMP349);
            
//#line 2151
final double X10_TEMP354 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP68));
            
//#line 2153
double dtemp =
              (X10_TEMP354);
            
//#line 2154
final boolean X10_TEMP71 =
              (dtemp >
                 dmax);
            
//#line 2155
if (X10_TEMP71) {
                
//#line 2156
final int X10_TEMP359 =
                  (i);
                
//#line 2158
itemp =
                  ((X10_TEMP359));
                
//#line 2159
final double X10_TEMP362 =
                  (dtemp);
                
//#line 2161
dmax =
                  ((X10_TEMP362));
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var14____ = (__var96__).iterator(); __var14____.hasNext(); ) {
        	final  x10.
          lang.
          point __var14__ = (x10.
          lang.
          point) __var14____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
            
//#line 2145
final int X10_TEMP342 =
              (i +
                 dx_off);
            
//#line 2147
final int X10_TEMP66 =
              (X10_TEMP342);
            
//#line 2148
final double X10_TEMP349 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 dx,
                 dxk,
                 X10_TEMP66));
            
//#line 2150
final double X10_TEMP68 =
              (X10_TEMP349);
            
//#line 2151
final double X10_TEMP354 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP68));
            
//#line 2153
double dtemp =
              (X10_TEMP354);
            
//#line 2154
final boolean X10_TEMP71 =
              (dtemp >
                 dmax);
            
//#line 2155
if (X10_TEMP71) {
                
//#line 2156
final int X10_TEMP359 =
                  (i);
                
//#line 2158
itemp =
                  ((X10_TEMP359));
                
//#line 2159
final double X10_TEMP362 =
                  (dtemp);
                
//#line 2161
dmax =
                  ((X10_TEMP362));
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2164
return itemp;
    }
    
    
//#line 2166
public static double
                    Program_Linpack_epslon(
                    final Linpack X10_TEMP0,
                    final double x) {
        
//#line 2167
final double X10_TEMP210 =
          (4.0);
        
//#line 2169
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 2170
final double X10_TEMP213 =
          (3.0);
        
//#line 2172
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 2173
final double X10_TEMP216 =
          (X10_TEMP1 /
             X10_TEMP2);
        
//#line 2175
final double a =
          (X10_TEMP216);
        
//#line 2176
final int X10_TEMP219 =
          (0);
        
//#line 2178
double eps =
          (X10_TEMP219);
        
//#line 2179
final int X10_TEMP222 =
          (0);
        
//#line 2181
final int X10_TEMP5 =
          (X10_TEMP222);
        
//#line 2182
boolean X10_TEMP9 =
          (eps ==
             X10_TEMP5);
        
//#line 2183
boolean X10_TEMP227 =
          X10_TEMP9;
        
//#line 2184
while (X10_TEMP227) {
            
//#line 2185
final double X10_TEMP229 =
              (1.0);
            
//#line 2187
final double X10_TEMP10 =
              (X10_TEMP229);
            
//#line 2188
final double X10_TEMP232 =
              (a -
                 X10_TEMP10);
            
//#line 2190
double b =
              (X10_TEMP232);
            
//#line 2191
final double X10_TEMP235 =
              (b +
                 b);
            
//#line 2193
final double X10_TEMP12 =
              (X10_TEMP235);
            
//#line 2194
final double X10_TEMP238 =
              (X10_TEMP12 +
                 b);
            
//#line 2196
double c =
              (X10_TEMP238);
            
//#line 2197
final double X10_TEMP241 =
              (1.0);
            
//#line 2199
final double X10_TEMP14 =
              (X10_TEMP241);
            
//#line 2200
final double X10_TEMP244 =
              (c -
                 X10_TEMP14);
            
//#line 2202
final double X10_TEMP16 =
              (X10_TEMP244);
            
//#line 2203
final double X10_TEMP249 =
              (Program0.
                 Program_Linpack_myabs(
                 X10_TEMP0,
                 X10_TEMP16));
            
//#line 2205
final double X10_TEMP18 =
              (X10_TEMP249);
            
//#line 2206
final double X10_TEMP252 =
              (X10_TEMP18);
            
//#line 2208
eps =
              ((X10_TEMP252));
            
//#line 2209
final int X10_TEMP255 =
              (0);
            
//#line 2211
final int X10_TEMP7 =
              (X10_TEMP255);
            
//#line 2212
final boolean X10_TEMP258 =
              (eps ==
                 X10_TEMP7);
            
//#line 2213
X10_TEMP9 =
              ((X10_TEMP258));
            
//#line 2214
X10_TEMP227 =
              X10_TEMP9;
        }
        
//#line 2216
final double X10_TEMP262 =
          (Program0.
             Program_Linpack_myabs(
             X10_TEMP0,
             x));
        
//#line 2218
final double X10_TEMP20 =
          (X10_TEMP262);
        
//#line 2219
final double X10_TEMP265 =
          (eps *
             X10_TEMP20);
        
//#line 2221
final double X10_TEMP22 =
          (X10_TEMP265);
        
//#line 2222
return X10_TEMP22;
    }
    
    
//#line 2224
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
        
//#line 2225
final int X10_TEMP210 =
          (0);
        
//#line 2227
final int X10_TEMP4 =
          (X10_TEMP210);
        
//#line 2228
final int X10_TEMP213 =
          (1);
        
//#line 2230
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 2231
final int X10_TEMP216 =
          (n2 -
             X10_TEMP2);
        
//#line 2233
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 2234
final int X10_TEMP219 =
          (0);
        
//#line 2236
final int X10_TEMP9 =
          (X10_TEMP219);
        
//#line 2237
final int X10_TEMP222 =
          (1);
        
//#line 2239
final int X10_TEMP7 =
          (X10_TEMP222);
        
//#line 2240
final int X10_TEMP225 =
          (n1 -
             X10_TEMP7);
        
//#line 2242
final int X10_TEMP10 =
          (X10_TEMP225);
        
//#line 2243
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
        
//#line 2245
final x10.
          lang.
          region X10_TEMP12 =
          (x10.
            lang.
            region)
            ((X10_TEMP232));
        
//#line 2246
/* template:forloop-mult { */{
        x10.lang.region __var99__ = (x10.lang.region) X10_TEMP12;
        if (__var99__.size() > 0 && (__var99__ instanceof x10.array.MultiDimRegion || __var99__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var100__ = __var99__.rank(0).low(), __var101__ = __var99__.rank(0).high(); __var100__ <= __var101__; __var100__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var102__ = __var99__.rank(1).low(), __var103__ = __var99__.rank(1).high(); __var102__ <= __var103__; __var102__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var100__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var102__;
        /* } */
        /* } */
{
            
//#line 2247
final int X10_TEMP236 =
              (0);
            
//#line 2249
final int X10_TEMP15 =
              (X10_TEMP236);
            
//#line 2250
final int X10_TEMP239 =
              (0);
            
//#line 2252
final int X10_TEMP18 =
              (X10_TEMP239);
            
//#line 2253
final double X10_TEMP244 =
              (/* template:array_get { */((x).get(/* Join: { */X10_TEMP18,j/* } */))/* } */);
            
//#line 2255
final double X10_TEMP22 =
              (X10_TEMP244);
            
//#line 2256
final double X10_TEMP251 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 m,
                 j,
                 i));
            
//#line 2258
final double X10_TEMP23 =
              (X10_TEMP251);
            
//#line 2259
final double X10_TEMP256 =
              (/* template:array_get { */((y).get(/* Join: { */X10_TEMP15,i/* } */))/* } */);
            
//#line 2261
final double X10_TEMP25 =
              (X10_TEMP256);
            
//#line 2262
final double X10_TEMP259 =
              (X10_TEMP22 *
                 X10_TEMP23);
            
//#line 2264
final double X10_TEMP26 =
              (X10_TEMP259);
            
//#line 2265
final double X10_TEMP262 =
              (X10_TEMP25 +
                 X10_TEMP26);
            
//#line 2267
final double X10_TEMP27 =
              (X10_TEMP262);
            
//#line 2268
final double X10_TEMP267 =
              (X10_TEMP27);
            
//#line 2270
final double X10_TEMP270 =
              (X10_TEMP267);
            
//#line 2271
/* template:array_set { */(y).set((X10_TEMP270),/* Join: { */X10_TEMP15,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var15____ = (__var99__).iterator(); __var15____.hasNext(); ) {
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
            
//#line 2247
final int X10_TEMP236 =
              (0);
            
//#line 2249
final int X10_TEMP15 =
              (X10_TEMP236);
            
//#line 2250
final int X10_TEMP239 =
              (0);
            
//#line 2252
final int X10_TEMP18 =
              (X10_TEMP239);
            
//#line 2253
final double X10_TEMP244 =
              (/* template:array_get { */((x).get(/* Join: { */X10_TEMP18,j/* } */))/* } */);
            
//#line 2255
final double X10_TEMP22 =
              (X10_TEMP244);
            
//#line 2256
final double X10_TEMP251 =
              (Program0.
                 Program_Linpack_read(
                 X10_TEMP0,
                 m,
                 j,
                 i));
            
//#line 2258
final double X10_TEMP23 =
              (X10_TEMP251);
            
//#line 2259
final double X10_TEMP256 =
              (/* template:array_get { */((y).get(/* Join: { */X10_TEMP15,i/* } */))/* } */);
            
//#line 2261
final double X10_TEMP25 =
              (X10_TEMP256);
            
//#line 2262
final double X10_TEMP259 =
              (X10_TEMP22 *
                 X10_TEMP23);
            
//#line 2264
final double X10_TEMP26 =
              (X10_TEMP259);
            
//#line 2265
final double X10_TEMP262 =
              (X10_TEMP25 +
                 X10_TEMP26);
            
//#line 2267
final double X10_TEMP27 =
              (X10_TEMP262);
            
//#line 2268
final double X10_TEMP267 =
              (X10_TEMP27);
            
//#line 2270
final double X10_TEMP270 =
              (X10_TEMP267);
            
//#line 2271
/* template:array_set { */(y).set((X10_TEMP270),/* Join: { */X10_TEMP15,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
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
    
    
//#line 2277
public Program() {
        
//#line 2277
super();
    }
}

class Linpack
extends x10.
  lang.
  Object
{
    
//#line 2281
public int
      setSize;
    
//#line 2282
public x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 2283
public x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 2284
public x10.
      lang.
      DoubleReferenceArray
      x;
    
//#line 2285
public double
      ops;
    
//#line 2286
public double
      total;
    
//#line 2287
public double
      norma;
    
//#line 2288
public double
      normx;
    
//#line 2289
public double
      resid;
    
//#line 2290
public double
      time;
    
//#line 2291
public double
      kf;
    
//#line 2292
public int
      n;
    
//#line 2293
public int
      i;
    
//#line 2294
public int
      ntimes;
    
//#line 2295
public int
      info;
    
//#line 2296
public int
      lda;
    
//#line 2297
public int
      ldaa;
    
//#line 2298
public int
      kflops;
    
//#line 2299
public x10.
      lang.
      IntReferenceArray
      ipvt;
    
//#line 2300
public int
      infodgefa;
    
    
//#line 2280
public Linpack() {
        
//#line 2280
super();
    }
}
