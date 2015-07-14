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
final public static long
      _Program__SparseMatmult_RANDOM_SEED =
      Program0.
        _Program__SparseMatmult_RANDOM_SEED_init();
    
//#line 13
final public static int
      _Program__SparseMatmult_SPARSE_NUM_ITER =
      Program0.
        _Program__SparseMatmult_SPARSE_NUM_ITER_init();
    
//#line 14
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
//#line 15
final public static Random
      _Program__SparseMatmult_R =
      Program0.
        _Program__SparseMatmult_R_init();
    
    
//#line 18
public static void
                  runMain(
                  ) {
        
//#line 19
Program0.
                      Program_runMain();
    }
    
    
//#line 21
public static long
                  _Program__Random_multiplier_init(
                  ) {
        
//#line 23
final long X10_TEMP355 =
          (Program0.
             Program__Random_multiplier_init());
        
//#line 24
return X10_TEMP355;
    }
    
    
//#line 26
public static long
                  _Program__Random_addend_init(
                  ) {
        
//#line 28
final long X10_TEMP355 =
          (Program0.
             Program__Random_addend_init());
        
//#line 29
return X10_TEMP355;
    }
    
    
//#line 31
public static long
                  _Program__Random_mask_init(
                  ) {
        
//#line 33
final long X10_TEMP355 =
          (Program0.
             Program__Random_mask_init());
        
//#line 34
return X10_TEMP355;
    }
    
    
//#line 36
public static long
                  _Program__SparseMatmult_RANDOM_SEED_init(
                  ) {
        
//#line 38
final long X10_TEMP355 =
          (Program0.
             Program__SparseMatmult_RANDOM_SEED_init());
        
//#line 39
return X10_TEMP355;
    }
    
    
//#line 41
public static int
                  _Program__SparseMatmult_SPARSE_NUM_ITER_init(
                  ) {
        
//#line 43
final int X10_TEMP355 =
          (Program0.
             Program__SparseMatmult_SPARSE_NUM_ITER_init());
        
//#line 44
return X10_TEMP355;
    }
    
    
//#line 46
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 48
final int X10_TEMP355 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 49
return X10_TEMP355;
    }
    
    
//#line 51
public static Random
                  _Program__SparseMatmult_R_init(
                  ) {
        
//#line 53
final Random X10_TEMP355 =
          (Program0.
             Program__SparseMatmult_R_init());
        
//#line 54
return X10_TEMP355;
    }
    
    
//#line 56
public static long
                  Program__Random_multiplier_init(
                  ) {
        
//#line 57
final long X10_TEMP355 =
          (25214903917L);
        
//#line 59
final long X10_TEMP2 =
          (X10_TEMP355);
        
//#line 60
return X10_TEMP2;
    }
    
    
//#line 62
public static long
                  Program__Random_addend_init(
                  ) {
        
//#line 63
final long X10_TEMP355 =
          (11L);
        
//#line 65
final long X10_TEMP2 =
          (X10_TEMP355);
        
//#line 66
return X10_TEMP2;
    }
    
    
//#line 68
public static long
                  Program__Random_mask_init(
                  ) {
        
//#line 69
final long X10_TEMP355 =
          (1L);
        
//#line 71
final long X10_TEMP1 =
          (X10_TEMP355);
        
//#line 72
final int X10_TEMP358 =
          (48);
        
//#line 74
final int X10_TEMP2 =
          (X10_TEMP358);
        
//#line 75
final long X10_TEMP361 =
          (X10_TEMP1 <<
             X10_TEMP2);
        
//#line 77
final long X10_TEMP4 =
          (X10_TEMP361);
        
//#line 78
final int X10_TEMP364 =
          (1);
        
//#line 80
final int X10_TEMP5 =
          (X10_TEMP364);
        
//#line 81
final long X10_TEMP367 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 83
final long X10_TEMP7 =
          (X10_TEMP367);
        
//#line 84
return X10_TEMP7;
    }
    
    
//#line 86
public static int
                  Program_Random_nextbits(
                  final Random X10_TEMP0,
                  final int bits) {
        
//#line 87
final long X10_TEMP355 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed);
        
//#line 89
long oldseed =
          (X10_TEMP355);
        
//#line 90
final long X10_TEMP358 =
          (oldseed *
             _Program__Random_multiplier);
        
//#line 92
final long X10_TEMP2 =
          (X10_TEMP358);
        
//#line 93
final long X10_TEMP361 =
          (X10_TEMP2 +
             _Program__Random_addend);
        
//#line 95
final long X10_TEMP4 =
          (X10_TEMP361);
        
//#line 96
final long X10_TEMP364 =
          (X10_TEMP4 &
             _Program__Random_mask);
        
//#line 98
long nextseed =
          (X10_TEMP364);
        
//#line 99
final long X10_TEMP367 =
          (nextseed);
        
//#line 101
final long X10_TEMP8 =
          (X10_TEMP367);
        
//#line 102
final long X10_TEMP370 =
          (X10_TEMP8);
        
//#line 104
final long X10_TEMP373 =
          (X10_TEMP370);
        
//#line 105
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.seed =
          ((X10_TEMP373));
        
//#line 106
final int X10_TEMP375 =
          (48);
        
//#line 108
final int X10_TEMP9 =
          (X10_TEMP375);
        
//#line 109
final int X10_TEMP378 =
          (X10_TEMP9 -
             bits);
        
//#line 111
final int X10_TEMP11 =
          (X10_TEMP378);
        
//#line 112
final long X10_TEMP381 =
          (nextseed >>>
             X10_TEMP11);
        
//#line 114
final long X10_TEMP13 =
          (X10_TEMP381);
        
//#line 115
final int X10_TEMP384 =
          ((int)
             X10_TEMP13);
        
//#line 117
final int X10_TEMP15 =
          (X10_TEMP384);
        
//#line 118
return X10_TEMP15;
    }
    
    
//#line 120
public static int
                   Program_Random_nextInt(
                   final Random X10_TEMP0) {
        
//#line 121
final int X10_TEMP355 =
          (32);
        
//#line 123
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 124
final int X10_TEMP360 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 126
final int X10_TEMP4 =
          (X10_TEMP360);
        
//#line 127
return X10_TEMP4;
    }
    
    
//#line 129
public static long
                   Program_Random_nextLong(
                   final Random X10_TEMP0) {
        
//#line 130
final int X10_TEMP355 =
          (32);
        
//#line 132
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 133
final int X10_TEMP360 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 135
final int X10_TEMP4 =
          (X10_TEMP360);
        
//#line 136
final long X10_TEMP363 =
          ((long)
             X10_TEMP4);
        
//#line 138
final long X10_TEMP5 =
          (X10_TEMP363);
        
//#line 139
final int X10_TEMP366 =
          (32);
        
//#line 141
final int X10_TEMP6 =
          (X10_TEMP366);
        
//#line 142
final long X10_TEMP369 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 144
final long X10_TEMP8 =
          (X10_TEMP369);
        
//#line 145
final int X10_TEMP372 =
          (32);
        
//#line 147
final int X10_TEMP10 =
          (X10_TEMP372);
        
//#line 148
final int X10_TEMP377 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 150
final int X10_TEMP11 =
          (X10_TEMP377);
        
//#line 151
final long X10_TEMP380 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 153
final long X10_TEMP13 =
          (X10_TEMP380);
        
//#line 154
return X10_TEMP13;
    }
    
    
//#line 156
public static boolean
                   Program_Random_nextBoolean(
                   final Random X10_TEMP0) {
        
//#line 157
final int X10_TEMP355 =
          (1);
        
//#line 159
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 160
final int X10_TEMP360 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 162
final int X10_TEMP3 =
          (X10_TEMP360);
        
//#line 163
final int X10_TEMP363 =
          (0);
        
//#line 165
final int X10_TEMP4 =
          (X10_TEMP363);
        
//#line 166
final boolean X10_TEMP366 =
          (X10_TEMP3 !=
             X10_TEMP4);
        
//#line 168
final boolean X10_TEMP6 =
          (X10_TEMP366);
        
//#line 169
return X10_TEMP6;
    }
    
    
//#line 171
public static double
                   Program_Random_nextDouble(
                   final Random X10_TEMP0) {
        
//#line 172
final int X10_TEMP355 =
          (26);
        
//#line 174
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 175
final int X10_TEMP360 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP2));
        
//#line 177
final int X10_TEMP4 =
          (X10_TEMP360);
        
//#line 178
final long X10_TEMP363 =
          ((long)
             X10_TEMP4);
        
//#line 180
final long X10_TEMP5 =
          (X10_TEMP363);
        
//#line 181
final int X10_TEMP366 =
          (27);
        
//#line 183
final int X10_TEMP6 =
          (X10_TEMP366);
        
//#line 184
final long X10_TEMP369 =
          (X10_TEMP5 <<
             X10_TEMP6);
        
//#line 186
final long X10_TEMP8 =
          (X10_TEMP369);
        
//#line 187
final int X10_TEMP372 =
          (27);
        
//#line 189
final int X10_TEMP10 =
          (X10_TEMP372);
        
//#line 190
final int X10_TEMP377 =
          (Program0.
             Program_Random_nextbits(
             X10_TEMP0,
             X10_TEMP10));
        
//#line 192
final int X10_TEMP11 =
          (X10_TEMP377);
        
//#line 193
final long X10_TEMP380 =
          (X10_TEMP8 +
             X10_TEMP11);
        
//#line 195
final long X10_TEMP13 =
          (X10_TEMP380);
        
//#line 196
final long X10_TEMP383 =
          (1L);
        
//#line 198
final long X10_TEMP14 =
          (X10_TEMP383);
        
//#line 199
final int X10_TEMP386 =
          (53);
        
//#line 201
final int X10_TEMP15 =
          (X10_TEMP386);
        
//#line 202
final long X10_TEMP389 =
          (X10_TEMP14 <<
             X10_TEMP15);
        
//#line 204
final long X10_TEMP17 =
          (X10_TEMP389);
        
//#line 205
final double X10_TEMP392 =
          ((double)
             X10_TEMP17);
        
//#line 207
final double X10_TEMP18 =
          (X10_TEMP392);
        
//#line 208
final double X10_TEMP395 =
          (X10_TEMP13 /
             X10_TEMP18);
        
//#line 210
final double X10_TEMP20 =
          (X10_TEMP395);
        
//#line 211
return X10_TEMP20;
    }
    
    
//#line 213
public static long
                   Program__SparseMatmult_RANDOM_SEED_init(
                   ) {
        
//#line 214
final int X10_TEMP355 =
          (10101010);
        
//#line 216
final long X10_TEMP2 =
          (X10_TEMP355);
        
//#line 217
return X10_TEMP2;
    }
    
    
//#line 219
public static int
                   Program__SparseMatmult_SPARSE_NUM_ITER_init(
                   ) {
        
//#line 220
final int X10_TEMP355 =
          (200);
        
//#line 222
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 223
return X10_TEMP2;
    }
    
    
//#line 225
public static void
                   Program_SparseMatmult_initDataSizes_M(
                   final SparseMatmult X10_TEMP0,
                   final x10.
                     lang.
                     IntReferenceArray datasizesM) {
        
//#line 226
final int X10_TEMP355 =
          (0);
        
//#line 228
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 229
final int X10_TEMP358 =
          (100);
        
//#line 231
final int X10_TEMP5 =
          (X10_TEMP358);
        
//#line 232
final int X10_TEMP361 =
          (X10_TEMP5);
        
//#line 234
final int X10_TEMP6 =
          (X10_TEMP361);
        
//#line 235
final int X10_TEMP365 =
          (X10_TEMP6);
        
//#line 237
final int X10_TEMP368 =
          (X10_TEMP365);
        
//#line 238
/* template:array_set { */(datasizesM).set((X10_TEMP368),X10_TEMP2)/* } */;
        
//#line 239
final int X10_TEMP370 =
          (1);
        
//#line 241
final int X10_TEMP8 =
          (X10_TEMP370);
        
//#line 242
final int X10_TEMP373 =
          (100000);
        
//#line 244
final int X10_TEMP11 =
          (X10_TEMP373);
        
//#line 245
final int X10_TEMP376 =
          (X10_TEMP11);
        
//#line 247
final int X10_TEMP12 =
          (X10_TEMP376);
        
//#line 248
final int X10_TEMP380 =
          (X10_TEMP12);
        
//#line 250
final int X10_TEMP383 =
          (X10_TEMP380);
        
//#line 251
/* template:array_set { */(datasizesM).set((X10_TEMP383),X10_TEMP8)/* } */;
        
//#line 252
final int X10_TEMP385 =
          (2);
        
//#line 254
final int X10_TEMP14 =
          (X10_TEMP385);
        
//#line 255
final int X10_TEMP388 =
          (500000);
        
//#line 257
final int X10_TEMP17 =
          (X10_TEMP388);
        
//#line 258
final int X10_TEMP391 =
          (X10_TEMP17);
        
//#line 260
final int X10_TEMP18 =
          (X10_TEMP391);
        
//#line 261
final int X10_TEMP395 =
          (X10_TEMP18);
        
//#line 263
final int X10_TEMP398 =
          (X10_TEMP395);
        
//#line 264
/* template:array_set { */(datasizesM).set((X10_TEMP398),X10_TEMP14)/* } */;
    }
    
    
//#line 266
public static void
                   Program_SparseMatmult_initDataSizes_N(
                   final SparseMatmult X10_TEMP0,
                   final x10.
                     lang.
                     IntReferenceArray datasizesN) {
        
//#line 267
final int X10_TEMP355 =
          (0);
        
//#line 269
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 270
final int X10_TEMP358 =
          (100);
        
//#line 272
final int X10_TEMP5 =
          (X10_TEMP358);
        
//#line 273
final int X10_TEMP361 =
          (X10_TEMP5);
        
//#line 275
final int X10_TEMP6 =
          (X10_TEMP361);
        
//#line 276
final int X10_TEMP365 =
          (X10_TEMP6);
        
//#line 278
final int X10_TEMP368 =
          (X10_TEMP365);
        
//#line 279
/* template:array_set { */(datasizesN).set((X10_TEMP368),X10_TEMP2)/* } */;
        
//#line 280
final int X10_TEMP370 =
          (1);
        
//#line 282
final int X10_TEMP8 =
          (X10_TEMP370);
        
//#line 283
final int X10_TEMP373 =
          (100000);
        
//#line 285
final int X10_TEMP11 =
          (X10_TEMP373);
        
//#line 286
final int X10_TEMP376 =
          (X10_TEMP11);
        
//#line 288
final int X10_TEMP12 =
          (X10_TEMP376);
        
//#line 289
final int X10_TEMP380 =
          (X10_TEMP12);
        
//#line 291
final int X10_TEMP383 =
          (X10_TEMP380);
        
//#line 292
/* template:array_set { */(datasizesN).set((X10_TEMP383),X10_TEMP8)/* } */;
        
//#line 293
final int X10_TEMP385 =
          (2);
        
//#line 295
final int X10_TEMP14 =
          (X10_TEMP385);
        
//#line 296
final int X10_TEMP388 =
          (500000);
        
//#line 298
final int X10_TEMP17 =
          (X10_TEMP388);
        
//#line 299
final int X10_TEMP391 =
          (X10_TEMP17);
        
//#line 301
final int X10_TEMP18 =
          (X10_TEMP391);
        
//#line 302
final int X10_TEMP395 =
          (X10_TEMP18);
        
//#line 304
final int X10_TEMP398 =
          (X10_TEMP395);
        
//#line 305
/* template:array_set { */(datasizesN).set((X10_TEMP398),X10_TEMP14)/* } */;
    }
    
    
//#line 307
public static void
                   Program_SparseMatmult_initDataSizes_NZ(
                   final SparseMatmult X10_TEMP0,
                   final x10.
                     lang.
                     IntReferenceArray datasizesNZ) {
        
//#line 308
final int X10_TEMP355 =
          (0);
        
//#line 310
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 311
final int X10_TEMP358 =
          (500);
        
//#line 313
final int X10_TEMP5 =
          (X10_TEMP358);
        
//#line 314
final int X10_TEMP361 =
          (X10_TEMP5);
        
//#line 316
final int X10_TEMP6 =
          (X10_TEMP361);
        
//#line 317
final int X10_TEMP365 =
          (X10_TEMP6);
        
//#line 319
final int X10_TEMP368 =
          (X10_TEMP365);
        
//#line 320
/* template:array_set { */(datasizesNZ).set((X10_TEMP368),X10_TEMP2)/* } */;
        
//#line 321
final int X10_TEMP370 =
          (1);
        
//#line 323
final int X10_TEMP8 =
          (X10_TEMP370);
        
//#line 324
final int X10_TEMP373 =
          (500000);
        
//#line 326
final int X10_TEMP11 =
          (X10_TEMP373);
        
//#line 327
final int X10_TEMP376 =
          (X10_TEMP11);
        
//#line 329
final int X10_TEMP12 =
          (X10_TEMP376);
        
//#line 330
final int X10_TEMP380 =
          (X10_TEMP12);
        
//#line 332
final int X10_TEMP383 =
          (X10_TEMP380);
        
//#line 333
/* template:array_set { */(datasizesNZ).set((X10_TEMP383),X10_TEMP8)/* } */;
        
//#line 334
final int X10_TEMP385 =
          (2);
        
//#line 336
final int X10_TEMP14 =
          (X10_TEMP385);
        
//#line 337
final int X10_TEMP388 =
          (2500000);
        
//#line 339
final int X10_TEMP17 =
          (X10_TEMP388);
        
//#line 340
final int X10_TEMP391 =
          (X10_TEMP17);
        
//#line 342
final int X10_TEMP18 =
          (X10_TEMP391);
        
//#line 343
final int X10_TEMP395 =
          (X10_TEMP18);
        
//#line 345
final int X10_TEMP398 =
          (X10_TEMP395);
        
//#line 346
/* template:array_set { */(datasizesNZ).set((X10_TEMP398),X10_TEMP14)/* } */;
    }
    
    
//#line 348
public static Random
                   Program__SparseMatmult_R_init(
                   ) {
        
//#line 349
final Random X10_TEMP356 =
          (new Random(
             _Program__SparseMatmult_RANDOM_SEED));
        
//#line 351
final Random X10_TEMP3 =
          (X10_TEMP356);
        
//#line 352
return X10_TEMP3;
    }
    
    
//#line 354
public static void
                   Program_SparseMatmult_JGFsetsize(
                   final SparseMatmult X10_TEMP0,
                   final int setSize) {
        
//#line 355
final int X10_TEMP355 =
          (setSize);
        
//#line 357
final int X10_TEMP3 =
          (X10_TEMP355);
        
//#line 358
final int X10_TEMP358 =
          (X10_TEMP3);
        
//#line 360
final int X10_TEMP361 =
          (X10_TEMP358);
        
//#line 361
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize =
          ((X10_TEMP361));
    }
    
    
//#line 363
public static void
                   Program_SparseMatmult_JGFinitialise(
                   final SparseMatmult X10_TEMP0) {
        
//#line 364
final int X10_TEMP355 =
          (0);
        
//#line 366
final int X10_TEMP3 =
          (X10_TEMP355);
        
//#line 367
final int X10_TEMP358 =
          (2);
        
//#line 369
final int X10_TEMP4 =
          (X10_TEMP358);
        
//#line 370
final x10.
          lang.
          region X10_TEMP363 =
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
        
//#line 372
final x10.
          lang.
          region ar =
          (x10.
            lang.
            region)
            ((X10_TEMP363));
        
//#line 373
final x10.
          lang.
          place X10_TEMP366 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 375
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP366);
        
//#line 376
final x10.
          lang.
          dist X10_TEMP369 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                ar,
                X10_TEMP6)));
        
//#line 378
final x10.
          lang.
          dist dr =
          (x10.
            lang.
            dist)
            ((X10_TEMP369));
        
//#line 379
final x10.
          lang.
          IntReferenceArray X10_TEMP376 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 380
final int X10_TEMP372 =
                    (0);
                  
//#line 382
final int X10_TEMP9 =
                    (X10_TEMP372);
                  
//#line 383
return X10_TEMP9;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 388
final x10.
          lang.
          IntReferenceArray datasizes_M =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP376));
        
//#line 389
final x10.
          lang.
          IntReferenceArray X10_TEMP383 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 390
final int X10_TEMP379 =
                    (0);
                  
//#line 392
final int X10_TEMP12 =
                    (X10_TEMP379);
                  
//#line 393
return X10_TEMP12;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 398
final x10.
          lang.
          IntReferenceArray datasizes_N =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP383));
        
//#line 399
final x10.
          lang.
          IntReferenceArray X10_TEMP390 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 400
final int X10_TEMP386 =
                    (0);
                  
//#line 402
final int X10_TEMP15 =
                    (X10_TEMP386);
                  
//#line 403
return X10_TEMP15;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 408
final x10.
          lang.
          IntReferenceArray datasizes_nz =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP390));
        
//#line 409
Program0.
                       Program_SparseMatmult_initDataSizes_M(
                       X10_TEMP0,
                       datasizes_M);
        
//#line 410
Program0.
                       Program_SparseMatmult_initDataSizes_N(
                       X10_TEMP0,
                       datasizes_N);
        
//#line 411
Program0.
                       Program_SparseMatmult_initDataSizes_NZ(
                       X10_TEMP0,
                       datasizes_nz);
        
//#line 412
final int X10_TEMP399 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 414
final int X10_TEMP21 =
          (X10_TEMP399);
        
//#line 415
final int X10_TEMP403 =
          (/* template:array_get { */((datasizes_N).get(X10_TEMP21))/* } */);
        
//#line 417
final int ds_N =
          (X10_TEMP403);
        
//#line 418
final int X10_TEMP406 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 420
final int X10_TEMP24 =
          (X10_TEMP406);
        
//#line 421
final int X10_TEMP410 =
          (/* template:array_get { */((datasizes_M).get(X10_TEMP24))/* } */);
        
//#line 423
final int ds_M =
          (X10_TEMP410);
        
//#line 424
final int X10_TEMP413 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 426
final int X10_TEMP27 =
          (X10_TEMP413);
        
//#line 427
final int X10_TEMP417 =
          (/* template:array_get { */((datasizes_nz).get(X10_TEMP27))/* } */);
        
//#line 429
final int ds_nz =
          (X10_TEMP417);
        
//#line 430
final int X10_TEMP420 =
          (0);
        
//#line 432
final int X10_TEMP32 =
          (X10_TEMP420);
        
//#line 433
final int X10_TEMP423 =
          (1);
        
//#line 435
final int X10_TEMP30 =
          (X10_TEMP423);
        
//#line 436
final int X10_TEMP426 =
          (ds_nz -
             X10_TEMP30);
        
//#line 438
final int X10_TEMP33 =
          (X10_TEMP426);
        
//#line 439
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
                  X10_TEMP32,
                  X10_TEMP33))));
        
//#line 441
final x10.
          lang.
          region r_nz =
          (x10.
            lang.
            region)
            ((X10_TEMP431));
        
//#line 442
final int X10_TEMP434 =
          (0);
        
//#line 444
final int X10_TEMP39 =
          (X10_TEMP434);
        
//#line 445
final int X10_TEMP437 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nthreads);
        
//#line 447
final int X10_TEMP36 =
          (X10_TEMP437);
        
//#line 448
final int X10_TEMP440 =
          (1);
        
//#line 450
final int X10_TEMP37 =
          (X10_TEMP440);
        
//#line 451
final int X10_TEMP443 =
          (X10_TEMP36 -
             X10_TEMP37);
        
//#line 453
final int X10_TEMP40 =
          (X10_TEMP443);
        
//#line 454
final x10.
          lang.
          region X10_TEMP448 =
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
                  X10_TEMP40))));
        
//#line 456
final x10.
          lang.
          region r_nthreads =
          (x10.
            lang.
            region)
            ((X10_TEMP448));
        
//#line 457
final int X10_TEMP451 =
          (0);
        
//#line 459
final int X10_TEMP45 =
          (X10_TEMP451);
        
//#line 460
final int X10_TEMP454 =
          (1);
        
//#line 462
final int X10_TEMP43 =
          (X10_TEMP454);
        
//#line 463
final int X10_TEMP457 =
          (ds_M -
             X10_TEMP43);
        
//#line 465
final int X10_TEMP46 =
          (X10_TEMP457);
        
//#line 466
final x10.
          lang.
          region X10_TEMP462 =
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
                  X10_TEMP45,
                  X10_TEMP46))));
        
//#line 468
final x10.
          lang.
          region X10_TEMP48 =
          (x10.
            lang.
            region)
            ((X10_TEMP462));
        
//#line 469
final x10.
          lang.
          dist X10_TEMP466 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 469
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 469
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
               X10_TEMP48)));
        
//#line 471
final x10.
          lang.
          dist X10_TEMP49 =
          (x10.
            lang.
            dist)
            ((X10_TEMP466));
        
//#line 472
final x10.
          lang.
          dist X10_TEMP469 =
          (x10.
            lang.
            dist)
            ((X10_TEMP49));
        
//#line 474
final x10.
          lang.
          dist d_M =
          (x10.
            lang.
            dist)
            ((X10_TEMP469));
        
//#line 475
final int X10_TEMP472 =
          (0);
        
//#line 477
final int X10_TEMP53 =
          (X10_TEMP472);
        
//#line 478
final int X10_TEMP475 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nthreads);
        
//#line 480
final int X10_TEMP54 =
          (X10_TEMP475);
        
//#line 481
final x10.
          lang.
          region X10_TEMP480 =
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
                  X10_TEMP53,
                  X10_TEMP54))));
        
//#line 483
final x10.
          lang.
          region r_nthreadsPlus1 =
          (x10.
            lang.
            region)
            ((X10_TEMP480));
        
//#line 484
final int X10_TEMP483 =
          (0);
        
//#line 486
final int X10_TEMP59 =
          (X10_TEMP483);
        
//#line 487
final int X10_TEMP486 =
          (1);
        
//#line 489
final int X10_TEMP57 =
          (X10_TEMP486);
        
//#line 490
final int X10_TEMP489 =
          (ds_N -
             X10_TEMP57);
        
//#line 492
final int X10_TEMP60 =
          (X10_TEMP489);
        
//#line 493
final x10.
          lang.
          region X10_TEMP494 =
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
        
//#line 495
final x10.
          lang.
          region ds_NReg =
          (x10.
            lang.
            region)
            ((X10_TEMP494));
        
//#line 496
final x10.
          lang.
          place X10_TEMP497 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 498
final x10.
          lang.
          place X10_TEMP62 =
          (X10_TEMP497);
        
//#line 499
final x10.
          lang.
          dist X10_TEMP500 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                ds_NReg,
                X10_TEMP62)));
        
//#line 501
final x10.
          lang.
          dist ds_NRegDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP500));
        
//#line 502
final x10.
          lang.
          DoubleReferenceArray X10_TEMP503 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(ds_NRegDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 504
final x10.
          lang.
          DoubleReferenceArray X10_TEMP64 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP503));
        
//#line 505
final x10.
          lang.
          DoubleReferenceArray X10_TEMP508 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program_SparseMatmult_init(
                X10_TEMP64,
                _Program__SparseMatmult_R)));
        
//#line 507
final x10.
          lang.
          DoubleReferenceArray X10_TEMP67 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP508));
        
//#line 508
final x10.
          lang.
          DoubleReferenceArray X10_TEMP511 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP67));
        
//#line 510
final x10.
          lang.
          DoubleReferenceArray xin =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP511));
        
//#line 511
final int X10_TEMP514 =
          (0);
        
//#line 513
final int X10_TEMP75 =
          (X10_TEMP514);
        
//#line 514
final x10.
          lang.
          dist X10_TEMP517 =
          (x10.
            lang.
            dist)
            ((xin.
                distribution));
        
//#line 516
final x10.
          lang.
          dist X10_TEMP70 =
          (x10.
            lang.
            dist)
            ((X10_TEMP517));
        
//#line 517
final x10.
          lang.
          region X10_TEMP520 =
          (x10.
            lang.
            region)
            ((X10_TEMP70.
                region));
        
//#line 519
final x10.
          lang.
          region X10_TEMP71 =
          (x10.
            lang.
            region)
            ((X10_TEMP520));
        
//#line 520
final int X10_TEMP523 =
          (X10_TEMP71.
             size());
        
//#line 522
final int X10_TEMP72 =
          (X10_TEMP523);
        
//#line 523
final int X10_TEMP526 =
          (1);
        
//#line 525
final int X10_TEMP73 =
          (X10_TEMP526);
        
//#line 526
final int X10_TEMP529 =
          (X10_TEMP72 -
             X10_TEMP73);
        
//#line 528
final int X10_TEMP76 =
          (X10_TEMP529);
        
//#line 529
final x10.
          lang.
          region X10_TEMP534 =
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
                  X10_TEMP75,
                  X10_TEMP76))));
        
//#line 531
final x10.
          lang.
          region xinreg =
          (x10.
            lang.
            region)
            ((X10_TEMP534));
        
//#line 532
final x10.
          lang.
          place X10_TEMP537 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 534
final x10.
          lang.
          place X10_TEMP78 =
          (X10_TEMP537);
        
//#line 535
final x10.
          lang.
          dist X10_TEMP540 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                xinreg,
                X10_TEMP78)));
        
//#line 537
final x10.
          lang.
          dist xinregDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP540));
        
//#line 538
final x10.
          lang.
          doubleArray X10_TEMP548 =
          (x10.
            lang.
            doubleArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(xinreg.
                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p/* } */, double dummy) { {
                  
//#line 539
final double X10_TEMP544 =
                    (/* template:array_get { */((xin).get(p))/* } */);
                  
//#line 541
final double X10_TEMP82 =
                    (X10_TEMP544);
                  
//#line 542
return X10_TEMP82;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 547
final x10.
          lang.
          doubleArray X10_TEMP83 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP548));
        
//#line 548
final x10.
          lang.
          doubleArray X10_TEMP551 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP83));
        
//#line 550
final x10.
          lang.
          doubleArray X10_TEMP86 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP551));
        
//#line 551
final x10.
          lang.
          doubleArray X10_TEMP554 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP86));
        
//#line 553
final x10.
          lang.
          doubleArray X10_TEMP557 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP554));
        
//#line 554
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x =
          ((X10_TEMP557));
        
//#line 555
final x10.
          lang.
          DoubleReferenceArray X10_TEMP559 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d_M,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 557
final x10.
          lang.
          DoubleReferenceArray X10_TEMP89 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP559));
        
//#line 558
final x10.
          lang.
          DoubleReferenceArray X10_TEMP562 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP89));
        
//#line 560
final x10.
          lang.
          DoubleReferenceArray X10_TEMP90 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP562));
        
//#line 561
final x10.
          lang.
          DoubleReferenceArray X10_TEMP565 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP90));
        
//#line 563
final x10.
          lang.
          DoubleReferenceArray X10_TEMP568 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP565));
        
//#line 564
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.y =
          ((X10_TEMP568));
        
//#line 565
final x10.
          lang.
          place X10_TEMP570 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 567
final x10.
          lang.
          place X10_TEMP91 =
          (X10_TEMP570);
        
//#line 568
final x10.
          lang.
          dist X10_TEMP573 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                r_nthreads,
                X10_TEMP91)));
        
//#line 570
final x10.
          lang.
          dist r_nthreadsregDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP573));
        
//#line 571
final x10.
          lang.
          IntReferenceArray X10_TEMP576 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 573
final x10.
          lang.
          IntReferenceArray X10_TEMP93 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP576));
        
//#line 574
final x10.
          lang.
          IntReferenceArray X10_TEMP579 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP93));
        
//#line 576
x10.
          lang.
          IntReferenceArray ilow =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP579));
        
//#line 577
final x10.
          lang.
          IntReferenceArray X10_TEMP582 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 579
final x10.
          lang.
          IntReferenceArray X10_TEMP95 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP582));
        
//#line 580
final x10.
          lang.
          IntReferenceArray X10_TEMP585 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP95));
        
//#line 582
x10.
          lang.
          IntReferenceArray iup =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP585));
        
//#line 583
final x10.
          lang.
          place X10_TEMP588 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 585
final x10.
          lang.
          place X10_TEMP97 =
          (X10_TEMP588);
        
//#line 586
final x10.
          lang.
          dist X10_TEMP591 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                r_nthreadsPlus1,
                X10_TEMP97)));
        
//#line 588
final x10.
          lang.
          dist r_nthreadsplus1regDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP591));
        
//#line 589
final x10.
          lang.
          place X10_TEMP594 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 591
final x10.
          lang.
          place X10_TEMP99 =
          (X10_TEMP594);
        
//#line 592
final x10.
          lang.
          dist X10_TEMP597 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                r_nz,
                X10_TEMP99)));
        
//#line 594
final x10.
          lang.
          dist dsnzDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP597));
        
//#line 595
final x10.
          lang.
          IntReferenceArray X10_TEMP600 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 597
final x10.
          lang.
          IntReferenceArray rowt =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP600));
        
//#line 598
final x10.
          lang.
          IntReferenceArray X10_TEMP603 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 600
final x10.
          lang.
          IntReferenceArray colt =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP603));
        
//#line 601
final x10.
          lang.
          DoubleReferenceArray X10_TEMP606 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 603
final x10.
          lang.
          DoubleReferenceArray valt =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP606));
        
//#line 604
final x10.
          lang.
          IntReferenceArray X10_TEMP609 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsplus1regDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 606
x10.
          lang.
          IntReferenceArray sumT =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP609));
        
//#line 607
final int X10_TEMP612 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nthreads);
        
//#line 609
final int X10_TEMP105 =
          (X10_TEMP612);
        
//#line 610
final int X10_TEMP615 =
          (ds_M +
             X10_TEMP105);
        
//#line 612
final int X10_TEMP106 =
          (X10_TEMP615);
        
//#line 613
final int X10_TEMP618 =
          (1);
        
//#line 615
final int X10_TEMP107 =
          (X10_TEMP618);
        
//#line 616
final int X10_TEMP621 =
          (X10_TEMP106 -
             X10_TEMP107);
        
//#line 618
final int X10_TEMP109 =
          (X10_TEMP621);
        
//#line 619
final int X10_TEMP624 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nthreads);
        
//#line 621
final int X10_TEMP110 =
          (X10_TEMP624);
        
//#line 622
final int X10_TEMP627 =
          (X10_TEMP109 /
             X10_TEMP110);
        
//#line 624
int sect =
          (X10_TEMP627);
        
//#line 625
final x10.
          lang.
          IntReferenceArray X10_TEMP630 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 627
x10.
          lang.
          IntReferenceArray rowin =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP630));
        
//#line 628
final x10.
          lang.
          IntReferenceArray X10_TEMP633 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 630
x10.
          lang.
          IntReferenceArray colin =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP633));
        
//#line 631
final x10.
          lang.
          DoubleReferenceArray X10_TEMP636 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 633
x10.
          lang.
          DoubleReferenceArray valin =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP636));
        
//#line 634
final x10.
          lang.
          IntReferenceArray X10_TEMP639 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 636
final x10.
          lang.
          IntReferenceArray X10_TEMP115 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP639));
        
//#line 637
final x10.
          lang.
          IntReferenceArray X10_TEMP642 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP115));
        
//#line 639
final x10.
          lang.
          IntReferenceArray lowsumin =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP642));
        
//#line 640
final x10.
          lang.
          IntReferenceArray X10_TEMP645 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 642
final x10.
          lang.
          IntReferenceArray X10_TEMP117 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP645));
        
//#line 643
final x10.
          lang.
          IntReferenceArray X10_TEMP648 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP117));
        
//#line 645
final x10.
          lang.
          IntReferenceArray highsumin =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP648));
        
//#line 646
final int X10_TEMP651 =
          (0);
        
//#line 648
final int X10_TEMP122 =
          (X10_TEMP651);
        
//#line 649
final int X10_TEMP654 =
          (1);
        
//#line 651
final int X10_TEMP120 =
          (X10_TEMP654);
        
//#line 652
final int X10_TEMP657 =
          (ds_nz -
             X10_TEMP120);
        
//#line 654
final int X10_TEMP123 =
          (X10_TEMP657);
        
//#line 655
final x10.
          lang.
          region X10_TEMP662 =
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
                  X10_TEMP122,
                  X10_TEMP123))));
        
//#line 657
final x10.
          lang.
          region X10_TEMP125 =
          (x10.
            lang.
            region)
            ((X10_TEMP662));
        
//#line 658
/* template:forloop { */
        for (java.util.Iterator p__ = (X10_TEMP125).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 659
final int X10_TEMP667 =
              (Program0.
                 Program_Random_nextInt(
                 _Program__SparseMatmult_R));
            
//#line 661
final int X10_TEMP128 =
              (X10_TEMP667);
            
//#line 662
final int X10_TEMP671 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP128));
            
//#line 664
final int X10_TEMP129 =
              (X10_TEMP671);
            
//#line 665
final int X10_TEMP674 =
              (X10_TEMP129 %
                 ds_M);
            
//#line 667
final int X10_TEMP132 =
              (X10_TEMP674);
            
//#line 668
final int X10_TEMP677 =
              (X10_TEMP132);
            
//#line 670
final int X10_TEMP133 =
              (X10_TEMP677);
            
//#line 671
final int X10_TEMP681 =
              (X10_TEMP133);
            
//#line 673
final int X10_TEMP684 =
              (X10_TEMP681);
            
//#line 674
/* template:array_set { */(rowin).set((X10_TEMP684),p)/* } */;
            
//#line 675
final int X10_TEMP687 =
              (Program0.
                 Program_Random_nextInt(
                 _Program__SparseMatmult_R));
            
//#line 677
final int X10_TEMP136 =
              (X10_TEMP687);
            
//#line 678
final int X10_TEMP691 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP136));
            
//#line 680
final int X10_TEMP137 =
              (X10_TEMP691);
            
//#line 681
final int X10_TEMP694 =
              (X10_TEMP137 %
                 ds_N);
            
//#line 683
final int X10_TEMP140 =
              (X10_TEMP694);
            
//#line 684
final int X10_TEMP697 =
              (X10_TEMP140);
            
//#line 686
final int X10_TEMP141 =
              (X10_TEMP697);
            
//#line 687
final int X10_TEMP701 =
              (X10_TEMP141);
            
//#line 689
final int X10_TEMP704 =
              (X10_TEMP701);
            
//#line 690
/* template:array_set { */(colin).set((X10_TEMP704),p)/* } */;
            
//#line 691
final double X10_TEMP707 =
              (Program0.
                 Program_Random_nextDouble(
                 _Program__SparseMatmult_R));
            
//#line 693
final double X10_TEMP145 =
              (X10_TEMP707);
            
//#line 694
final double X10_TEMP710 =
              (X10_TEMP145);
            
//#line 696
final double X10_TEMP146 =
              (X10_TEMP710);
            
//#line 697
final double X10_TEMP714 =
              (X10_TEMP146);
            
//#line 699
final double X10_TEMP717 =
              (X10_TEMP714);
            
//#line 700
/* template:array_set { */(valin).set((X10_TEMP717),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 702
/* template:forloop-mult { */{
        x10.lang.region __var4__ = (x10.lang.region) r_nthreads;
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
            
//#line 703
final int X10_TEMP720 =
              (i *
                 sect);
            
//#line 705
final int X10_TEMP151 =
              (X10_TEMP720);
            
//#line 706
final int X10_TEMP723 =
              (X10_TEMP151);
            
//#line 708
final int X10_TEMP152 =
              (X10_TEMP723);
            
//#line 709
final int X10_TEMP727 =
              (X10_TEMP152);
            
//#line 711
final int X10_TEMP730 =
              (X10_TEMP727);
            
//#line 712
/* template:array_set { */(ilow).set((X10_TEMP730),i)/* } */;
            
//#line 713
final int X10_TEMP732 =
              (1);
            
//#line 715
final int X10_TEMP154 =
              (X10_TEMP732);
            
//#line 716
final int X10_TEMP735 =
              (i +
                 X10_TEMP154);
            
//#line 718
final int X10_TEMP156 =
              (X10_TEMP735);
            
//#line 719
final int X10_TEMP738 =
              (X10_TEMP156 *
                 sect);
            
//#line 721
final int X10_TEMP158 =
              (X10_TEMP738);
            
//#line 722
final int X10_TEMP741 =
              (1);
            
//#line 724
final int X10_TEMP159 =
              (X10_TEMP741);
            
//#line 725
final int X10_TEMP744 =
              (X10_TEMP158 -
                 X10_TEMP159);
            
//#line 727
final int X10_TEMP162 =
              (X10_TEMP744);
            
//#line 728
final int X10_TEMP747 =
              (X10_TEMP162);
            
//#line 730
final int X10_TEMP163 =
              (X10_TEMP747);
            
//#line 731
final int X10_TEMP751 =
              (X10_TEMP163);
            
//#line 733
final int X10_TEMP754 =
              (X10_TEMP751);
            
//#line 734
/* template:array_set { */(iup).set((X10_TEMP754),i)/* } */;
            
//#line 735
final int X10_TEMP757 =
              (/* template:array_get { */((iup).get(i))/* } */);
            
//#line 737
final int X10_TEMP165 =
              (X10_TEMP757);
            
//#line 738
final boolean X10_TEMP167 =
              (X10_TEMP165 >
                 ds_M);
            
//#line 739
if (X10_TEMP167) {
                
//#line 740
final int X10_TEMP762 =
                  (ds_M);
                
//#line 742
final int X10_TEMP171 =
                  (X10_TEMP762);
                
//#line 743
final int X10_TEMP766 =
                  (X10_TEMP171);
                
//#line 745
final int X10_TEMP769 =
                  (X10_TEMP766);
                
//#line 746
/* template:array_set { */(iup).set((X10_TEMP769),i)/* } */;
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
            
//#line 703
final int X10_TEMP720 =
              (i *
                 sect);
            
//#line 705
final int X10_TEMP151 =
              (X10_TEMP720);
            
//#line 706
final int X10_TEMP723 =
              (X10_TEMP151);
            
//#line 708
final int X10_TEMP152 =
              (X10_TEMP723);
            
//#line 709
final int X10_TEMP727 =
              (X10_TEMP152);
            
//#line 711
final int X10_TEMP730 =
              (X10_TEMP727);
            
//#line 712
/* template:array_set { */(ilow).set((X10_TEMP730),i)/* } */;
            
//#line 713
final int X10_TEMP732 =
              (1);
            
//#line 715
final int X10_TEMP154 =
              (X10_TEMP732);
            
//#line 716
final int X10_TEMP735 =
              (i +
                 X10_TEMP154);
            
//#line 718
final int X10_TEMP156 =
              (X10_TEMP735);
            
//#line 719
final int X10_TEMP738 =
              (X10_TEMP156 *
                 sect);
            
//#line 721
final int X10_TEMP158 =
              (X10_TEMP738);
            
//#line 722
final int X10_TEMP741 =
              (1);
            
//#line 724
final int X10_TEMP159 =
              (X10_TEMP741);
            
//#line 725
final int X10_TEMP744 =
              (X10_TEMP158 -
                 X10_TEMP159);
            
//#line 727
final int X10_TEMP162 =
              (X10_TEMP744);
            
//#line 728
final int X10_TEMP747 =
              (X10_TEMP162);
            
//#line 730
final int X10_TEMP163 =
              (X10_TEMP747);
            
//#line 731
final int X10_TEMP751 =
              (X10_TEMP163);
            
//#line 733
final int X10_TEMP754 =
              (X10_TEMP751);
            
//#line 734
/* template:array_set { */(iup).set((X10_TEMP754),i)/* } */;
            
//#line 735
final int X10_TEMP757 =
              (/* template:array_get { */((iup).get(i))/* } */);
            
//#line 737
final int X10_TEMP165 =
              (X10_TEMP757);
            
//#line 738
final boolean X10_TEMP167 =
              (X10_TEMP165 >
                 ds_M);
            
//#line 739
if (X10_TEMP167) {
                
//#line 740
final int X10_TEMP762 =
                  (ds_M);
                
//#line 742
final int X10_TEMP171 =
                  (X10_TEMP762);
                
//#line 743
final int X10_TEMP766 =
                  (X10_TEMP171);
                
//#line 745
final int X10_TEMP769 =
                  (X10_TEMP766);
                
//#line 746
/* template:array_set { */(iup).set((X10_TEMP769),i)/* } */;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 749
/* template:forloop { */
        for (java.util.Iterator i__ = (r_nz).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 750
/* template:forloop-mult { */{
            x10.lang.region __var7__ = (x10.lang.region) r_nthreads;
            if (__var7__.size() > 0 && (__var7__ instanceof x10.array.MultiDimRegion || __var7__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var8__ = __var7__.rank(0).low(), __var9__ = __var7__.rank(0).high(); __var8__ <= __var9__; __var8__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var8__;
            /* } */
            /* } */
{
                
//#line 751
final int X10_TEMP774 =
                  (/* template:array_get { */((rowin).get(i))/* } */);
                
//#line 753
final int X10_TEMP176 =
                  (X10_TEMP774);
                
//#line 754
final int X10_TEMP778 =
                  (/* template:array_get { */((ilow).get(j))/* } */);
                
//#line 756
final int X10_TEMP177 =
                  (X10_TEMP778);
                
//#line 757
final boolean X10_TEMP781 =
                  (X10_TEMP176 >=
                     X10_TEMP177);
                
//#line 759
final boolean X10_TEMP179 =
                  (X10_TEMP781);
                
//#line 760
final int X10_TEMP785 =
                  (/* template:array_get { */((rowin).get(i))/* } */);
                
//#line 762
final int X10_TEMP182 =
                  (X10_TEMP785);
                
//#line 763
final int X10_TEMP789 =
                  (/* template:array_get { */((iup).get(j))/* } */);
                
//#line 765
final int X10_TEMP183 =
                  (X10_TEMP789);
                
//#line 766
final boolean X10_TEMP792 =
                  (X10_TEMP182 <=
                     X10_TEMP183);
                
//#line 768
final boolean X10_TEMP185 =
                  (X10_TEMP792);
                
//#line 769
final boolean X10_TEMP187 =
                  (X10_TEMP179 &&
                     X10_TEMP185);
                
//#line 770
if (X10_TEMP187) {
                    
//#line 771
final int X10_TEMP797 =
                      (1);
                    
//#line 773
final int X10_TEMP188 =
                      (X10_TEMP797);
                    
//#line 774
final int X10_TEMP800 =
                      (j +
                         X10_TEMP188);
                    
//#line 776
final int X10_TEMP190 =
                      (X10_TEMP800);
                    
//#line 777
final int X10_TEMP804 =
                      (/* template:array_get { */((sumT).get(X10_TEMP190))/* } */);
                    
//#line 779
final int X10_TEMP191 =
                      (X10_TEMP804);
                    
//#line 780
final int X10_TEMP192 =
                      (1);
                    
//#line 781
final int X10_TEMP809 =
                      (/* template:array_get { */((sumT).get(X10_TEMP190))/* } */);
                    
//#line 783
final int X10_TEMP193 =
                      (X10_TEMP809);
                    
//#line 784
final int X10_TEMP812 =
                      (X10_TEMP193 +
                         X10_TEMP192);
                    
//#line 786
final int X10_TEMP194 =
                      (X10_TEMP812);
                    
//#line 787
final int X10_TEMP816 =
                      (X10_TEMP194);
                    
//#line 789
final int X10_TEMP819 =
                      (X10_TEMP816);
                    
//#line 790
/* template:array_set { */(sumT).set((X10_TEMP819),X10_TEMP190)/* } */;
                }
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
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 751
final int X10_TEMP774 =
                  (/* template:array_get { */((rowin).get(i))/* } */);
                
//#line 753
final int X10_TEMP176 =
                  (X10_TEMP774);
                
//#line 754
final int X10_TEMP778 =
                  (/* template:array_get { */((ilow).get(j))/* } */);
                
//#line 756
final int X10_TEMP177 =
                  (X10_TEMP778);
                
//#line 757
final boolean X10_TEMP781 =
                  (X10_TEMP176 >=
                     X10_TEMP177);
                
//#line 759
final boolean X10_TEMP179 =
                  (X10_TEMP781);
                
//#line 760
final int X10_TEMP785 =
                  (/* template:array_get { */((rowin).get(i))/* } */);
                
//#line 762
final int X10_TEMP182 =
                  (X10_TEMP785);
                
//#line 763
final int X10_TEMP789 =
                  (/* template:array_get { */((iup).get(j))/* } */);
                
//#line 765
final int X10_TEMP183 =
                  (X10_TEMP789);
                
//#line 766
final boolean X10_TEMP792 =
                  (X10_TEMP182 <=
                     X10_TEMP183);
                
//#line 768
final boolean X10_TEMP185 =
                  (X10_TEMP792);
                
//#line 769
final boolean X10_TEMP187 =
                  (X10_TEMP179 &&
                     X10_TEMP185);
                
//#line 770
if (X10_TEMP187) {
                    
//#line 771
final int X10_TEMP797 =
                      (1);
                    
//#line 773
final int X10_TEMP188 =
                      (X10_TEMP797);
                    
//#line 774
final int X10_TEMP800 =
                      (j +
                         X10_TEMP188);
                    
//#line 776
final int X10_TEMP190 =
                      (X10_TEMP800);
                    
//#line 777
final int X10_TEMP804 =
                      (/* template:array_get { */((sumT).get(X10_TEMP190))/* } */);
                    
//#line 779
final int X10_TEMP191 =
                      (X10_TEMP804);
                    
//#line 780
final int X10_TEMP192 =
                      (1);
                    
//#line 781
final int X10_TEMP809 =
                      (/* template:array_get { */((sumT).get(X10_TEMP190))/* } */);
                    
//#line 783
final int X10_TEMP193 =
                      (X10_TEMP809);
                    
//#line 784
final int X10_TEMP812 =
                      (X10_TEMP193 +
                         X10_TEMP192);
                    
//#line 786
final int X10_TEMP194 =
                      (X10_TEMP812);
                    
//#line 787
final int X10_TEMP816 =
                      (X10_TEMP194);
                    
//#line 789
final int X10_TEMP819 =
                      (X10_TEMP816);
                    
//#line 790
/* template:array_set { */(sumT).set((X10_TEMP819),X10_TEMP190)/* } */;
                }
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 794
/* template:forloop-mult { */{
        x10.lang.region __var10__ = (x10.lang.region) r_nthreads;
        if (__var10__.size() > 0 && (__var10__ instanceof x10.array.MultiDimRegion || __var10__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var11__ = __var10__.rank(0).low(), __var12__ = __var10__.rank(0).high(); __var11__ <= __var12__; __var11__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var11__;
        /* } */
        /* } */
{
            
//#line 795
final int X10_TEMP822 =
              (0);
            
//#line 797
final int X10_TEMP198 =
              (X10_TEMP822);
            
//#line 798
final x10.
              lang.
              region X10_TEMP827 =
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
                      X10_TEMP198,
                      j))));
            
//#line 800
final x10.
              lang.
              region X10_TEMP200 =
              (x10.
                lang.
                region)
                ((X10_TEMP827));
            
//#line 801
/* template:forloop-mult { */{
            x10.lang.region __var13__ = (x10.lang.region) X10_TEMP200;
            if (__var13__.size() > 0 && (__var13__ instanceof x10.array.MultiDimRegion || __var13__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var14__ = __var13__.rank(0).low(), __var15__ = __var13__.rank(0).high(); __var14__ <= __var15__; __var14__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var14__;
            /* } */
            /* } */
{
                
//#line 802
final int X10_TEMP831 =
                  (j -
                     i);
                
//#line 804
final int X10_TEMP203 =
                  (X10_TEMP831);
                
//#line 805
final int X10_TEMP835 =
                  (/* template:array_get { */((lowsumin).get(j))/* } */);
                
//#line 807
final int X10_TEMP205 =
                  (X10_TEMP835);
                
//#line 808
final int X10_TEMP839 =
                  (/* template:array_get { */((sumT).get(X10_TEMP203))/* } */);
                
//#line 810
final int X10_TEMP206 =
                  (X10_TEMP839);
                
//#line 811
final int X10_TEMP842 =
                  (X10_TEMP205 +
                     X10_TEMP206);
                
//#line 813
final int X10_TEMP207 =
                  (X10_TEMP842);
                
//#line 814
final int X10_TEMP846 =
                  (X10_TEMP207);
                
//#line 816
final int X10_TEMP849 =
                  (X10_TEMP846);
                
//#line 817
/* template:array_set { */(lowsumin).set((X10_TEMP849),j)/* } */;
                
//#line 818
final int X10_TEMP851 =
                  (j -
                     i);
                
//#line 820
final int X10_TEMP210 =
                  (X10_TEMP851);
                
//#line 821
final int X10_TEMP855 =
                  (/* template:array_get { */((highsumin).get(j))/* } */);
                
//#line 823
final int X10_TEMP212 =
                  (X10_TEMP855);
                
//#line 824
final int X10_TEMP859 =
                  (/* template:array_get { */((sumT).get(X10_TEMP210))/* } */);
                
//#line 826
final int X10_TEMP213 =
                  (X10_TEMP859);
                
//#line 827
final int X10_TEMP862 =
                  (X10_TEMP212 +
                     X10_TEMP213);
                
//#line 829
final int X10_TEMP214 =
                  (X10_TEMP862);
                
//#line 830
final int X10_TEMP866 =
                  (X10_TEMP214);
                
//#line 832
final int X10_TEMP869 =
                  (X10_TEMP866);
                
//#line 833
/* template:array_set { */(highsumin).set((X10_TEMP869),j)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var13__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 802
final int X10_TEMP831 =
                  (j -
                     i);
                
//#line 804
final int X10_TEMP203 =
                  (X10_TEMP831);
                
//#line 805
final int X10_TEMP835 =
                  (/* template:array_get { */((lowsumin).get(j))/* } */);
                
//#line 807
final int X10_TEMP205 =
                  (X10_TEMP835);
                
//#line 808
final int X10_TEMP839 =
                  (/* template:array_get { */((sumT).get(X10_TEMP203))/* } */);
                
//#line 810
final int X10_TEMP206 =
                  (X10_TEMP839);
                
//#line 811
final int X10_TEMP842 =
                  (X10_TEMP205 +
                     X10_TEMP206);
                
//#line 813
final int X10_TEMP207 =
                  (X10_TEMP842);
                
//#line 814
final int X10_TEMP846 =
                  (X10_TEMP207);
                
//#line 816
final int X10_TEMP849 =
                  (X10_TEMP846);
                
//#line 817
/* template:array_set { */(lowsumin).set((X10_TEMP849),j)/* } */;
                
//#line 818
final int X10_TEMP851 =
                  (j -
                     i);
                
//#line 820
final int X10_TEMP210 =
                  (X10_TEMP851);
                
//#line 821
final int X10_TEMP855 =
                  (/* template:array_get { */((highsumin).get(j))/* } */);
                
//#line 823
final int X10_TEMP212 =
                  (X10_TEMP855);
                
//#line 824
final int X10_TEMP859 =
                  (/* template:array_get { */((sumT).get(X10_TEMP210))/* } */);
                
//#line 826
final int X10_TEMP213 =
                  (X10_TEMP859);
                
//#line 827
final int X10_TEMP862 =
                  (X10_TEMP212 +
                     X10_TEMP213);
                
//#line 829
final int X10_TEMP214 =
                  (X10_TEMP862);
                
//#line 830
final int X10_TEMP866 =
                  (X10_TEMP214);
                
//#line 832
final int X10_TEMP869 =
                  (X10_TEMP866);
                
//#line 833
/* template:array_set { */(highsumin).set((X10_TEMP869),j)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var2____ = (__var10__).iterator(); __var2____.hasNext(); ) {
        	final  x10.
          lang.
          point __var2__ = (x10.
          lang.
          point) __var2____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
            
//#line 795
final int X10_TEMP822 =
              (0);
            
//#line 797
final int X10_TEMP198 =
              (X10_TEMP822);
            
//#line 798
final x10.
              lang.
              region X10_TEMP827 =
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
                      X10_TEMP198,
                      j))));
            
//#line 800
final x10.
              lang.
              region X10_TEMP200 =
              (x10.
                lang.
                region)
                ((X10_TEMP827));
            
//#line 801
/* template:forloop-mult { */{
            x10.lang.region __var16__ = (x10.lang.region) X10_TEMP200;
            if (__var16__.size() > 0 && (__var16__ instanceof x10.array.MultiDimRegion || __var16__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var17__ = __var16__.rank(0).low(), __var18__ = __var16__.rank(0).high(); __var17__ <= __var18__; __var17__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var17__;
            /* } */
            /* } */
{
                
//#line 802
final int X10_TEMP831 =
                  (j -
                     i);
                
//#line 804
final int X10_TEMP203 =
                  (X10_TEMP831);
                
//#line 805
final int X10_TEMP835 =
                  (/* template:array_get { */((lowsumin).get(j))/* } */);
                
//#line 807
final int X10_TEMP205 =
                  (X10_TEMP835);
                
//#line 808
final int X10_TEMP839 =
                  (/* template:array_get { */((sumT).get(X10_TEMP203))/* } */);
                
//#line 810
final int X10_TEMP206 =
                  (X10_TEMP839);
                
//#line 811
final int X10_TEMP842 =
                  (X10_TEMP205 +
                     X10_TEMP206);
                
//#line 813
final int X10_TEMP207 =
                  (X10_TEMP842);
                
//#line 814
final int X10_TEMP846 =
                  (X10_TEMP207);
                
//#line 816
final int X10_TEMP849 =
                  (X10_TEMP846);
                
//#line 817
/* template:array_set { */(lowsumin).set((X10_TEMP849),j)/* } */;
                
//#line 818
final int X10_TEMP851 =
                  (j -
                     i);
                
//#line 820
final int X10_TEMP210 =
                  (X10_TEMP851);
                
//#line 821
final int X10_TEMP855 =
                  (/* template:array_get { */((highsumin).get(j))/* } */);
                
//#line 823
final int X10_TEMP212 =
                  (X10_TEMP855);
                
//#line 824
final int X10_TEMP859 =
                  (/* template:array_get { */((sumT).get(X10_TEMP210))/* } */);
                
//#line 826
final int X10_TEMP213 =
                  (X10_TEMP859);
                
//#line 827
final int X10_TEMP862 =
                  (X10_TEMP212 +
                     X10_TEMP213);
                
//#line 829
final int X10_TEMP214 =
                  (X10_TEMP862);
                
//#line 830
final int X10_TEMP866 =
                  (X10_TEMP214);
                
//#line 832
final int X10_TEMP869 =
                  (X10_TEMP866);
                
//#line 833
/* template:array_set { */(highsumin).set((X10_TEMP869),j)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var16__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 802
final int X10_TEMP831 =
                  (j -
                     i);
                
//#line 804
final int X10_TEMP203 =
                  (X10_TEMP831);
                
//#line 805
final int X10_TEMP835 =
                  (/* template:array_get { */((lowsumin).get(j))/* } */);
                
//#line 807
final int X10_TEMP205 =
                  (X10_TEMP835);
                
//#line 808
final int X10_TEMP839 =
                  (/* template:array_get { */((sumT).get(X10_TEMP203))/* } */);
                
//#line 810
final int X10_TEMP206 =
                  (X10_TEMP839);
                
//#line 811
final int X10_TEMP842 =
                  (X10_TEMP205 +
                     X10_TEMP206);
                
//#line 813
final int X10_TEMP207 =
                  (X10_TEMP842);
                
//#line 814
final int X10_TEMP846 =
                  (X10_TEMP207);
                
//#line 816
final int X10_TEMP849 =
                  (X10_TEMP846);
                
//#line 817
/* template:array_set { */(lowsumin).set((X10_TEMP849),j)/* } */;
                
//#line 818
final int X10_TEMP851 =
                  (j -
                     i);
                
//#line 820
final int X10_TEMP210 =
                  (X10_TEMP851);
                
//#line 821
final int X10_TEMP855 =
                  (/* template:array_get { */((highsumin).get(j))/* } */);
                
//#line 823
final int X10_TEMP212 =
                  (X10_TEMP855);
                
//#line 824
final int X10_TEMP859 =
                  (/* template:array_get { */((sumT).get(X10_TEMP210))/* } */);
                
//#line 826
final int X10_TEMP213 =
                  (X10_TEMP859);
                
//#line 827
final int X10_TEMP862 =
                  (X10_TEMP212 +
                     X10_TEMP213);
                
//#line 829
final int X10_TEMP214 =
                  (X10_TEMP862);
                
//#line 830
final int X10_TEMP866 =
                  (X10_TEMP214);
                
//#line 832
final int X10_TEMP869 =
                  (X10_TEMP866);
                
//#line 833
/* template:array_set { */(highsumin).set((X10_TEMP869),j)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 836
/* template:forloop { */
        for (java.util.Iterator i1__ = (r_nz).iterator(); i1__.hasNext(); ) {
        	final  x10.
          lang.
          point i1 = (x10.
          lang.
          point) i1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 837
/* template:forloop { */
            for (java.util.Iterator j1__ = (r_nthreads).iterator(); j1__.hasNext(); ) {
            	final  x10.
              lang.
              point j1 = (x10.
              lang.
              point) j1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 838
final int X10_TEMP874 =
                  (/* template:array_get { */((rowin).get(i1))/* } */);
                
//#line 840
final int X10_TEMP219 =
                  (X10_TEMP874);
                
//#line 841
final int X10_TEMP878 =
                  (/* template:array_get { */((ilow).get(j1))/* } */);
                
//#line 843
final int X10_TEMP220 =
                  (X10_TEMP878);
                
//#line 844
final boolean X10_TEMP881 =
                  (X10_TEMP219 >=
                     X10_TEMP220);
                
//#line 846
final boolean X10_TEMP222 =
                  (X10_TEMP881);
                
//#line 847
final int X10_TEMP885 =
                  (/* template:array_get { */((rowin).get(i1))/* } */);
                
//#line 849
final int X10_TEMP225 =
                  (X10_TEMP885);
                
//#line 850
final int X10_TEMP889 =
                  (/* template:array_get { */((iup).get(j1))/* } */);
                
//#line 852
final int X10_TEMP226 =
                  (X10_TEMP889);
                
//#line 853
final boolean X10_TEMP892 =
                  (X10_TEMP225 <=
                     X10_TEMP226);
                
//#line 855
final boolean X10_TEMP228 =
                  (X10_TEMP892);
                
//#line 856
final boolean X10_TEMP230 =
                  (X10_TEMP222 &&
                     X10_TEMP228);
                
//#line 857
if (X10_TEMP230) {
                    
//#line 858
final int X10_TEMP898 =
                      (/* template:array_get { */((highsumin).get(j1))/* } */);
                    
//#line 860
final int X10_TEMP233 =
                      (X10_TEMP898);
                    
//#line 861
final int X10_TEMP902 =
                      (/* template:array_get { */((rowin).get(i1))/* } */);
                    
//#line 863
final int X10_TEMP237 =
                      (X10_TEMP902);
                    
//#line 864
final int X10_TEMP905 =
                      (X10_TEMP237);
                    
//#line 866
final int X10_TEMP238 =
                      (X10_TEMP905);
                    
//#line 867
final int X10_TEMP909 =
                      (X10_TEMP238);
                    
//#line 869
final int X10_TEMP912 =
                      (X10_TEMP909);
                    
//#line 870
/* template:array_set { */(rowt).set((X10_TEMP912),X10_TEMP233)/* } */;
                    
//#line 871
final int X10_TEMP915 =
                      (/* template:array_get { */((highsumin).get(j1))/* } */);
                    
//#line 873
final int X10_TEMP241 =
                      (X10_TEMP915);
                    
//#line 874
final int X10_TEMP919 =
                      (/* template:array_get { */((colin).get(i1))/* } */);
                    
//#line 876
final int X10_TEMP245 =
                      (X10_TEMP919);
                    
//#line 877
final int X10_TEMP922 =
                      (X10_TEMP245);
                    
//#line 879
final int X10_TEMP246 =
                      (X10_TEMP922);
                    
//#line 880
final int X10_TEMP926 =
                      (X10_TEMP246);
                    
//#line 882
final int X10_TEMP929 =
                      (X10_TEMP926);
                    
//#line 883
/* template:array_set { */(colt).set((X10_TEMP929),X10_TEMP241)/* } */;
                    
//#line 884
final int X10_TEMP932 =
                      (/* template:array_get { */((highsumin).get(j1))/* } */);
                    
//#line 886
final int X10_TEMP249 =
                      (X10_TEMP932);
                    
//#line 887
final double X10_TEMP936 =
                      (/* template:array_get { */((valin).get(i1))/* } */);
                    
//#line 889
final double X10_TEMP253 =
                      (X10_TEMP936);
                    
//#line 890
final double X10_TEMP939 =
                      (X10_TEMP253);
                    
//#line 892
final double X10_TEMP254 =
                      (X10_TEMP939);
                    
//#line 893
final double X10_TEMP943 =
                      (X10_TEMP254);
                    
//#line 895
final double X10_TEMP946 =
                      (X10_TEMP943);
                    
//#line 896
/* template:array_set { */(valt).set((X10_TEMP946),X10_TEMP249)/* } */;
                    
//#line 897
final int X10_TEMP949 =
                      (/* template:array_get { */((highsumin).get(j1))/* } */);
                    
//#line 899
final int X10_TEMP257 =
                      (X10_TEMP949);
                    
//#line 900
final int X10_TEMP952 =
                      (1);
                    
//#line 902
final int X10_TEMP258 =
                      (X10_TEMP952);
                    
//#line 903
final int X10_TEMP955 =
                      (X10_TEMP257 +
                         X10_TEMP258);
                    
//#line 905
final int X10_TEMP261 =
                      (X10_TEMP955);
                    
//#line 906
final int X10_TEMP958 =
                      (X10_TEMP261);
                    
//#line 908
final int X10_TEMP262 =
                      (X10_TEMP958);
                    
//#line 909
final int X10_TEMP962 =
                      (X10_TEMP262);
                    
//#line 911
final int X10_TEMP965 =
                      (X10_TEMP962);
                    
//#line 912
/* template:array_set { */(highsumin).set((X10_TEMP965),j1)/* } */;
                }
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 916
final int X10_TEMP967 =
          (0);
        
//#line 918
final int X10_TEMP269 =
          (X10_TEMP967);
        
//#line 919
final x10.
          lang.
          dist X10_TEMP970 =
          (x10.
            lang.
            dist)
            ((rowt.
                distribution));
        
//#line 921
final x10.
          lang.
          dist X10_TEMP264 =
          (x10.
            lang.
            dist)
            ((X10_TEMP970));
        
//#line 922
final x10.
          lang.
          region X10_TEMP973 =
          (x10.
            lang.
            region)
            ((X10_TEMP264.
                region));
        
//#line 924
final x10.
          lang.
          region X10_TEMP265 =
          (x10.
            lang.
            region)
            ((X10_TEMP973));
        
//#line 925
final int X10_TEMP976 =
          (X10_TEMP265.
             size());
        
//#line 927
final int X10_TEMP266 =
          (X10_TEMP976);
        
//#line 928
final int X10_TEMP979 =
          (1);
        
//#line 930
final int X10_TEMP267 =
          (X10_TEMP979);
        
//#line 931
final int X10_TEMP982 =
          (X10_TEMP266 -
             X10_TEMP267);
        
//#line 933
final int X10_TEMP270 =
          (X10_TEMP982);
        
//#line 934
final x10.
          lang.
          region X10_TEMP987 =
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
                  X10_TEMP269,
                  X10_TEMP270))));
        
//#line 936
final x10.
          lang.
          region rowtregion =
          (x10.
            lang.
            region)
            ((X10_TEMP987));
        
//#line 937
final x10.
          lang.
          place X10_TEMP990 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 939
final x10.
          lang.
          place X10_TEMP272 =
          (X10_TEMP990);
        
//#line 940
final x10.
          lang.
          dist X10_TEMP993 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                rowtregion,
                X10_TEMP272)));
        
//#line 942
final x10.
          lang.
          dist rowtdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP993));
        
//#line 943
final x10.
          lang.
          intArray X10_TEMP1001 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rowtregion.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point i/* } */, int dummy) { {
                  
//#line 944
final int X10_TEMP997 =
                    (/* template:array_get { */((rowt).get(i))/* } */);
                  
//#line 946
final int X10_TEMP276 =
                    (X10_TEMP997);
                  
//#line 947
return X10_TEMP276;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 952
final x10.
          lang.
          intArray X10_TEMP277 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1001));
        
//#line 953
final x10.
          lang.
          intArray X10_TEMP1004 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP277));
        
//#line 955
final x10.
          lang.
          intArray X10_TEMP280 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1004));
        
//#line 956
final x10.
          lang.
          intArray X10_TEMP1007 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP280));
        
//#line 958
final x10.
          lang.
          intArray X10_TEMP1010 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1007));
        
//#line 959
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.row =
          ((X10_TEMP1010));
        
//#line 960
final int X10_TEMP1012 =
          (0);
        
//#line 962
final int X10_TEMP287 =
          (X10_TEMP1012);
        
//#line 963
final x10.
          lang.
          dist X10_TEMP1015 =
          (x10.
            lang.
            dist)
            ((colt.
                distribution));
        
//#line 965
final x10.
          lang.
          dist X10_TEMP282 =
          (x10.
            lang.
            dist)
            ((X10_TEMP1015));
        
//#line 966
final x10.
          lang.
          region X10_TEMP1018 =
          (x10.
            lang.
            region)
            ((X10_TEMP282.
                region));
        
//#line 968
final x10.
          lang.
          region X10_TEMP283 =
          (x10.
            lang.
            region)
            ((X10_TEMP1018));
        
//#line 969
final int X10_TEMP1021 =
          (X10_TEMP283.
             size());
        
//#line 971
final int X10_TEMP284 =
          (X10_TEMP1021);
        
//#line 972
final int X10_TEMP1024 =
          (1);
        
//#line 974
final int X10_TEMP285 =
          (X10_TEMP1024);
        
//#line 975
final int X10_TEMP1027 =
          (X10_TEMP284 -
             X10_TEMP285);
        
//#line 977
final int X10_TEMP288 =
          (X10_TEMP1027);
        
//#line 978
final x10.
          lang.
          region X10_TEMP1032 =
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
                  X10_TEMP287,
                  X10_TEMP288))));
        
//#line 980
final x10.
          lang.
          region coltregion =
          (x10.
            lang.
            region)
            ((X10_TEMP1032));
        
//#line 981
final x10.
          lang.
          place X10_TEMP1035 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 983
final x10.
          lang.
          place X10_TEMP290 =
          (X10_TEMP1035);
        
//#line 984
final x10.
          lang.
          dist X10_TEMP1038 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                coltregion,
                X10_TEMP290)));
        
//#line 986
final x10.
          lang.
          dist coltdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP1038));
        
//#line 987
final x10.
          lang.
          intArray X10_TEMP1046 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(coltregion.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point i/* } */, int dummy) { {
                  
//#line 988
final int X10_TEMP1042 =
                    (/* template:array_get { */((colt).get(i))/* } */);
                  
//#line 990
final int X10_TEMP294 =
                    (X10_TEMP1042);
                  
//#line 991
return X10_TEMP294;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 996
final x10.
          lang.
          intArray X10_TEMP295 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1046));
        
//#line 997
final x10.
          lang.
          intArray X10_TEMP1049 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP295));
        
//#line 999
final x10.
          lang.
          intArray X10_TEMP298 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1049));
        
//#line 1000
final x10.
          lang.
          intArray X10_TEMP1052 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP298));
        
//#line 1002
final x10.
          lang.
          intArray X10_TEMP1055 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1052));
        
//#line 1003
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.col =
          ((X10_TEMP1055));
        
//#line 1004
final int X10_TEMP1057 =
          (0);
        
//#line 1006
final int X10_TEMP305 =
          (X10_TEMP1057);
        
//#line 1007
final x10.
          lang.
          dist X10_TEMP1060 =
          (x10.
            lang.
            dist)
            ((valt.
                distribution));
        
//#line 1009
final x10.
          lang.
          dist X10_TEMP300 =
          (x10.
            lang.
            dist)
            ((X10_TEMP1060));
        
//#line 1010
final x10.
          lang.
          region X10_TEMP1063 =
          (x10.
            lang.
            region)
            ((X10_TEMP300.
                region));
        
//#line 1012
final x10.
          lang.
          region X10_TEMP301 =
          (x10.
            lang.
            region)
            ((X10_TEMP1063));
        
//#line 1013
final int X10_TEMP1066 =
          (X10_TEMP301.
             size());
        
//#line 1015
final int X10_TEMP302 =
          (X10_TEMP1066);
        
//#line 1016
final int X10_TEMP1069 =
          (1);
        
//#line 1018
final int X10_TEMP303 =
          (X10_TEMP1069);
        
//#line 1019
final int X10_TEMP1072 =
          (X10_TEMP302 -
             X10_TEMP303);
        
//#line 1021
final int X10_TEMP306 =
          (X10_TEMP1072);
        
//#line 1022
final x10.
          lang.
          region X10_TEMP1077 =
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
                  X10_TEMP305,
                  X10_TEMP306))));
        
//#line 1024
final x10.
          lang.
          region valtregion =
          (x10.
            lang.
            region)
            ((X10_TEMP1077));
        
//#line 1025
final x10.
          lang.
          place X10_TEMP1080 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1027
final x10.
          lang.
          place X10_TEMP308 =
          (X10_TEMP1080);
        
//#line 1028
final x10.
          lang.
          dist X10_TEMP1083 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                valtregion,
                X10_TEMP308)));
        
//#line 1030
final x10.
          lang.
          dist valtdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP1083));
        
//#line 1031
final x10.
          lang.
          doubleArray X10_TEMP1091 =
          (x10.
            lang.
            doubleArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(valtregion.
                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point i/* } */, double dummy) { {
                  
//#line 1032
final double X10_TEMP1087 =
                    (/* template:array_get { */((valt).get(i))/* } */);
                  
//#line 1034
final double X10_TEMP312 =
                    (X10_TEMP1087);
                  
//#line 1035
return X10_TEMP312;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1040
final x10.
          lang.
          doubleArray X10_TEMP313 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP1091));
        
//#line 1041
final x10.
          lang.
          doubleArray X10_TEMP1094 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP313));
        
//#line 1043
final x10.
          lang.
          doubleArray X10_TEMP316 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP1094));
        
//#line 1044
final x10.
          lang.
          doubleArray X10_TEMP1097 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP316));
        
//#line 1046
final x10.
          lang.
          doubleArray X10_TEMP1100 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP1097));
        
//#line 1047
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.val =
          ((X10_TEMP1100));
        
//#line 1048
final int X10_TEMP1102 =
          (0);
        
//#line 1050
final int X10_TEMP323 =
          (X10_TEMP1102);
        
//#line 1051
final x10.
          lang.
          dist X10_TEMP1105 =
          (x10.
            lang.
            dist)
            ((lowsumin.
                distribution));
        
//#line 1053
final x10.
          lang.
          dist X10_TEMP318 =
          (x10.
            lang.
            dist)
            ((X10_TEMP1105));
        
//#line 1054
final x10.
          lang.
          region X10_TEMP1108 =
          (x10.
            lang.
            region)
            ((X10_TEMP318.
                region));
        
//#line 1056
final x10.
          lang.
          region X10_TEMP319 =
          (x10.
            lang.
            region)
            ((X10_TEMP1108));
        
//#line 1057
final int X10_TEMP1111 =
          (X10_TEMP319.
             size());
        
//#line 1059
final int X10_TEMP320 =
          (X10_TEMP1111);
        
//#line 1060
final int X10_TEMP1114 =
          (1);
        
//#line 1062
final int X10_TEMP321 =
          (X10_TEMP1114);
        
//#line 1063
final int X10_TEMP1117 =
          (X10_TEMP320 -
             X10_TEMP321);
        
//#line 1065
final int X10_TEMP324 =
          (X10_TEMP1117);
        
//#line 1066
final x10.
          lang.
          region X10_TEMP1122 =
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
                  X10_TEMP323,
                  X10_TEMP324))));
        
//#line 1068
final x10.
          lang.
          region lowsuminregion =
          (x10.
            lang.
            region)
            ((X10_TEMP1122));
        
//#line 1069
final x10.
          lang.
          place X10_TEMP1125 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1071
final x10.
          lang.
          place X10_TEMP326 =
          (X10_TEMP1125);
        
//#line 1072
final x10.
          lang.
          dist X10_TEMP1128 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                lowsuminregion,
                X10_TEMP326)));
        
//#line 1074
final x10.
          lang.
          dist lowsumindist =
          (x10.
            lang.
            dist)
            ((X10_TEMP1128));
        
//#line 1075
final x10.
          lang.
          intArray X10_TEMP1136 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(lowsuminregion.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point i/* } */, int dummy) { {
                  
//#line 1076
final int X10_TEMP1132 =
                    (/* template:array_get { */((lowsumin).get(i))/* } */);
                  
//#line 1078
final int X10_TEMP330 =
                    (X10_TEMP1132);
                  
//#line 1079
return X10_TEMP330;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1084
final x10.
          lang.
          intArray X10_TEMP331 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1136));
        
//#line 1085
final x10.
          lang.
          intArray X10_TEMP1139 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP331));
        
//#line 1087
final x10.
          lang.
          intArray X10_TEMP334 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1139));
        
//#line 1088
final x10.
          lang.
          intArray X10_TEMP1142 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP334));
        
//#line 1090
final x10.
          lang.
          intArray X10_TEMP1145 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1142));
        
//#line 1091
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lowsum =
          ((X10_TEMP1145));
        
//#line 1092
final int X10_TEMP1147 =
          (0);
        
//#line 1094
final int X10_TEMP341 =
          (X10_TEMP1147);
        
//#line 1095
final x10.
          lang.
          dist X10_TEMP1150 =
          (x10.
            lang.
            dist)
            ((highsumin.
                distribution));
        
//#line 1097
final x10.
          lang.
          dist X10_TEMP336 =
          (x10.
            lang.
            dist)
            ((X10_TEMP1150));
        
//#line 1098
final x10.
          lang.
          region X10_TEMP1153 =
          (x10.
            lang.
            region)
            ((X10_TEMP336.
                region));
        
//#line 1100
final x10.
          lang.
          region X10_TEMP337 =
          (x10.
            lang.
            region)
            ((X10_TEMP1153));
        
//#line 1101
final int X10_TEMP1156 =
          (X10_TEMP337.
             size());
        
//#line 1103
final int X10_TEMP338 =
          (X10_TEMP1156);
        
//#line 1104
final int X10_TEMP1159 =
          (1);
        
//#line 1106
final int X10_TEMP339 =
          (X10_TEMP1159);
        
//#line 1107
final int X10_TEMP1162 =
          (X10_TEMP338 -
             X10_TEMP339);
        
//#line 1109
final int X10_TEMP342 =
          (X10_TEMP1162);
        
//#line 1110
final x10.
          lang.
          region X10_TEMP1167 =
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
                  X10_TEMP341,
                  X10_TEMP342))));
        
//#line 1112
final x10.
          lang.
          region highsuminregion =
          (x10.
            lang.
            region)
            ((X10_TEMP1167));
        
//#line 1113
final x10.
          lang.
          place X10_TEMP1170 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1115
final x10.
          lang.
          place X10_TEMP344 =
          (X10_TEMP1170);
        
//#line 1116
final x10.
          lang.
          dist X10_TEMP1173 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                highsuminregion,
                X10_TEMP344)));
        
//#line 1118
final x10.
          lang.
          dist highsumindist =
          (x10.
            lang.
            dist)
            ((X10_TEMP1173));
        
//#line 1119
final x10.
          lang.
          intArray X10_TEMP1181 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(highsuminregion.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point i/* } */, int dummy) { {
                  
//#line 1120
final int X10_TEMP1177 =
                    (/* template:array_get { */((highsumin).get(i))/* } */);
                  
//#line 1122
final int X10_TEMP348 =
                    (X10_TEMP1177);
                  
//#line 1123
return X10_TEMP348;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 1128
final x10.
          lang.
          intArray X10_TEMP349 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1181));
        
//#line 1129
final x10.
          lang.
          intArray X10_TEMP1184 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP349));
        
//#line 1131
final x10.
          lang.
          intArray X10_TEMP352 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1184));
        
//#line 1132
final x10.
          lang.
          intArray X10_TEMP1187 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP352));
        
//#line 1134
final x10.
          lang.
          intArray X10_TEMP1190 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP1187));
        
//#line 1135
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.highsum =
          ((X10_TEMP1190));
    }
    
    
//#line 1137
public static void
                    Program_SparseMatmult_JGFkernel(
                    final SparseMatmult X10_TEMP0) {
        
//#line 1138
final x10.
          lang.
          DoubleReferenceArray X10_TEMP355 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.y));
        
//#line 1140
final x10.
          lang.
          DoubleReferenceArray X10_TEMP9 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP355));
        
//#line 1141
final x10.
          lang.
          doubleArray X10_TEMP358 =
          (x10.
            lang.
            doubleArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.val));
        
//#line 1143
final x10.
          lang.
          doubleArray X10_TEMP10 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP358));
        
//#line 1144
final x10.
          lang.
          intArray X10_TEMP361 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.row));
        
//#line 1146
final x10.
          lang.
          intArray X10_TEMP11 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP361));
        
//#line 1147
final x10.
          lang.
          intArray X10_TEMP364 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.col));
        
//#line 1149
final x10.
          lang.
          intArray X10_TEMP12 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP364));
        
//#line 1150
final x10.
          lang.
          doubleArray X10_TEMP367 =
          (x10.
            lang.
            doubleArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.x));
        
//#line 1152
final x10.
          lang.
          doubleArray X10_TEMP13 =
          (x10.
            lang.
            doubleArray)
            ((X10_TEMP367));
        
//#line 1153
final x10.
          lang.
          intArray X10_TEMP370 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lowsum));
        
//#line 1155
final x10.
          lang.
          intArray X10_TEMP14 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP370));
        
//#line 1156
final x10.
          lang.
          intArray X10_TEMP373 =
          (x10.
            lang.
            intArray)
            ((/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.highsum));
        
//#line 1158
final x10.
          lang.
          intArray X10_TEMP15 =
          (x10.
            lang.
            intArray)
            ((X10_TEMP373));
        
//#line 1159
Program0.
                        Program_SparseMatmult_test(
                        X10_TEMP0,
                        X10_TEMP9,
                        X10_TEMP10,
                        X10_TEMP11,
                        X10_TEMP12,
                        X10_TEMP13,
                        _Program__SparseMatmult_SPARSE_NUM_ITER,
                        X10_TEMP14,
                        X10_TEMP15);
    }
    
    
//#line 1161
public static void
                    Program_SparseMatmult_initRefVal(
                    final SparseMatmult X10_TEMP0,
                    final x10.
                      lang.
                      DoubleReferenceArray refval) {
        
//#line 1162
final int X10_TEMP355 =
          (0);
        
//#line 1164
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 1165
final double X10_TEMP358 =
          (0.1436496372119012);
        
//#line 1167
final double X10_TEMP5 =
          (X10_TEMP358);
        
//#line 1168
final double X10_TEMP361 =
          (X10_TEMP5);
        
//#line 1170
final double X10_TEMP6 =
          (X10_TEMP361);
        
//#line 1171
final double X10_TEMP365 =
          (X10_TEMP6);
        
//#line 1173
final double X10_TEMP368 =
          (X10_TEMP365);
        
//#line 1174
/* template:array_set { */(refval).set((X10_TEMP368),X10_TEMP2)/* } */;
        
//#line 1175
final int X10_TEMP370 =
          (1);
        
//#line 1177
final int X10_TEMP8 =
          (X10_TEMP370);
        
//#line 1178
final double X10_TEMP373 =
          (150.0130719633895);
        
//#line 1180
final double X10_TEMP11 =
          (X10_TEMP373);
        
//#line 1181
final double X10_TEMP376 =
          (X10_TEMP11);
        
//#line 1183
final double X10_TEMP12 =
          (X10_TEMP376);
        
//#line 1184
final double X10_TEMP380 =
          (X10_TEMP12);
        
//#line 1186
final double X10_TEMP383 =
          (X10_TEMP380);
        
//#line 1187
/* template:array_set { */(refval).set((X10_TEMP383),X10_TEMP8)/* } */;
        
//#line 1188
final int X10_TEMP385 =
          (2);
        
//#line 1190
final int X10_TEMP14 =
          (X10_TEMP385);
        
//#line 1191
final double X10_TEMP388 =
          (749.5245870753752);
        
//#line 1193
final double X10_TEMP17 =
          (X10_TEMP388);
        
//#line 1194
final double X10_TEMP391 =
          (X10_TEMP17);
        
//#line 1196
final double X10_TEMP18 =
          (X10_TEMP391);
        
//#line 1197
final double X10_TEMP395 =
          (X10_TEMP18);
        
//#line 1199
final double X10_TEMP398 =
          (X10_TEMP395);
        
//#line 1200
/* template:array_set { */(refval).set((X10_TEMP398),X10_TEMP14)/* } */;
    }
    
    
//#line 1202
public static void
                    Program_SparseMatmult_JGFvalidate(
                    final SparseMatmult X10_TEMP0) {
        
//#line 1203
final int X10_TEMP355 =
          (0);
        
//#line 1205
final int X10_TEMP3 =
          (X10_TEMP355);
        
//#line 1206
final int X10_TEMP358 =
          (2);
        
//#line 1208
final int X10_TEMP4 =
          (X10_TEMP358);
        
//#line 1209
final x10.
          lang.
          region X10_TEMP363 =
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
        
//#line 1211
x10.
          lang.
          region rtemp =
          (x10.
            lang.
            region)
            ((X10_TEMP363));
        
//#line 1212
final x10.
          lang.
          place X10_TEMP366 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1214
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP366);
        
//#line 1215
final x10.
          lang.
          dist X10_TEMP369 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                rtemp,
                X10_TEMP6)));
        
//#line 1217
x10.
          lang.
          dist dtemp =
          (x10.
            lang.
            dist)
            ((X10_TEMP369));
        
//#line 1218
final x10.
          lang.
          DoubleReferenceArray X10_TEMP372 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dtemp,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1220
x10.
          lang.
          DoubleReferenceArray refval =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP372));
        
//#line 1221
Program0.
                        Program_SparseMatmult_initRefVal(
                        X10_TEMP0,
                        refval);
        
//#line 1222
final double X10_TEMP377 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ytotal);
        
//#line 1224
final double X10_TEMP12 =
          (X10_TEMP377);
        
//#line 1225
final int X10_TEMP380 =
          (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
        
//#line 1227
final int X10_TEMP11 =
          (X10_TEMP380);
        
//#line 1228
final double X10_TEMP384 =
          (/* template:array_get { */((refval).get(X10_TEMP11))/* } */);
        
//#line 1230
final double X10_TEMP13 =
          (X10_TEMP384);
        
//#line 1231
final double X10_TEMP387 =
          (X10_TEMP12 -
             X10_TEMP13);
        
//#line 1233
final double X10_TEMP15 =
          (X10_TEMP387);
        
//#line 1234
final double X10_TEMP391 =
          (java.
             lang.
             Math.
             abs(
             X10_TEMP15));
        
//#line 1236
double dev =
          (X10_TEMP391);
        
//#line 1237
final double X10_TEMP394 =
          (1.0E-10);
        
//#line 1239
final double X10_TEMP17 =
          (X10_TEMP394);
        
//#line 1240
final boolean X10_TEMP19 =
          (dev >
             X10_TEMP17);
        
//#line 1241
if (X10_TEMP19) {
            
//#line 1242
final java.
              lang.
              String X10_TEMP399 =
              ("Validation failed");
            
//#line 1244
final java.
              lang.
              String X10_TEMP21 =
              (X10_TEMP399);
            
//#line 1245
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println(X10_TEMP21);
            
//#line 1246
final java.
              lang.
              String X10_TEMP403 =
              ("ytotal = ");
            
//#line 1248
final java.
              lang.
              String X10_TEMP22 =
              (X10_TEMP403);
            
//#line 1249
final double X10_TEMP406 =
              (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ytotal);
            
//#line 1251
final double X10_TEMP23 =
              (X10_TEMP406);
            
//#line 1252
final java.
              lang.
              String X10_TEMP409 =
              (X10_TEMP22 +
               X10_TEMP23);
            
//#line 1254
final java.
              lang.
              String X10_TEMP24 =
              (X10_TEMP409);
            
//#line 1255
final java.
              lang.
              String X10_TEMP412 =
              ("  ");
            
//#line 1257
final java.
              lang.
              String X10_TEMP25 =
              (X10_TEMP412);
            
//#line 1258
final java.
              lang.
              String X10_TEMP415 =
              (X10_TEMP24 +
               X10_TEMP25);
            
//#line 1260
final java.
              lang.
              String X10_TEMP26 =
              (X10_TEMP415);
            
//#line 1261
final java.
              lang.
              String X10_TEMP418 =
              (X10_TEMP26 +
               dev);
            
//#line 1263
final java.
              lang.
              String X10_TEMP27 =
              (X10_TEMP418);
            
//#line 1264
final java.
              lang.
              String X10_TEMP421 =
              ("  ");
            
//#line 1266
final java.
              lang.
              String X10_TEMP28 =
              (X10_TEMP421);
            
//#line 1267
final java.
              lang.
              String X10_TEMP424 =
              (X10_TEMP27 +
               X10_TEMP28);
            
//#line 1269
final java.
              lang.
              String X10_TEMP29 =
              (X10_TEMP424);
            
//#line 1270
final int X10_TEMP427 =
              (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setSize);
            
//#line 1272
final int X10_TEMP30 =
              (X10_TEMP427);
            
//#line 1273
final java.
              lang.
              String X10_TEMP430 =
              (X10_TEMP29 +
               X10_TEMP30);
            
//#line 1275
final java.
              lang.
              String X10_TEMP32 =
              (X10_TEMP430);
            
//#line 1276
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println(X10_TEMP32);
            
//#line 1277
final java.
              lang.
              String X10_TEMP434 =
              ("Validation failed");
            
//#line 1279
final java.
              lang.
              String X10_TEMP34 =
              (X10_TEMP434);
            
//#line 1280
throw new java.
              lang.
              RuntimeException(
              X10_TEMP34);
        }
    }
    
    
//#line 1283
public static void
                    Program_SparseMatmult_JGFtidyup(
                    final SparseMatmult X10_TEMP0) {
        
    }
    
    
//#line 1285
public static void
                    Program_SparseMatmult_run(
                    final SparseMatmult X10_TEMP0,
                    final int setSize) {
        
//#line 1286
Program0.
                        Program_SparseMatmult_JGFsetsize(
                        X10_TEMP0,
                        setSize);
        
//#line 1287
Program0.
                        Program_SparseMatmult_JGFinitialise(
                        X10_TEMP0);
        
//#line 1288
Program0.
                        Program_SparseMatmult_JGFkernel(
                        X10_TEMP0);
        
//#line 1289
Program0.
                        Program_SparseMatmult_JGFvalidate(
                        X10_TEMP0);
        
//#line 1290
Program0.
                        Program_SparseMatmult_JGFtidyup(
                        X10_TEMP0);
    }
    
    
//#line 1292
public static x10.
                    lang.
                    DoubleReferenceArray
                    Program_SparseMatmult_init(
                    final x10.
                      lang.
                      DoubleReferenceArray a,
                    final Random R) {
        
//#line 1293
final int X10_TEMP355 =
          (0);
        
//#line 1295
final int X10_TEMP7 =
          (X10_TEMP355);
        
//#line 1296
final x10.
          lang.
          dist X10_TEMP358 =
          (x10.
            lang.
            dist)
            ((a.
                distribution));
        
//#line 1298
final x10.
          lang.
          dist X10_TEMP2 =
          (x10.
            lang.
            dist)
            ((X10_TEMP358));
        
//#line 1299
final x10.
          lang.
          region X10_TEMP361 =
          (x10.
            lang.
            region)
            ((X10_TEMP2.
                region));
        
//#line 1301
final x10.
          lang.
          region X10_TEMP3 =
          (x10.
            lang.
            region)
            ((X10_TEMP361));
        
//#line 1302
final int X10_TEMP364 =
          (X10_TEMP3.
             size());
        
//#line 1304
final int X10_TEMP4 =
          (X10_TEMP364);
        
//#line 1305
final int X10_TEMP367 =
          (1);
        
//#line 1307
final int X10_TEMP5 =
          (X10_TEMP367);
        
//#line 1308
final int X10_TEMP370 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 1310
final int X10_TEMP8 =
          (X10_TEMP370);
        
//#line 1311
final x10.
          lang.
          region X10_TEMP375 =
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
                  X10_TEMP7,
                  X10_TEMP8))));
        
//#line 1313
final x10.
          lang.
          region areg =
          (x10.
            lang.
            region)
            ((X10_TEMP375));
        
//#line 1314
final x10.
          lang.
          place X10_TEMP378 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1316
final x10.
          lang.
          place X10_TEMP10 =
          (X10_TEMP378);
        
//#line 1317
final x10.
          lang.
          dist X10_TEMP381 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                areg,
                X10_TEMP10)));
        
//#line 1319
final x10.
          lang.
          dist adist =
          (x10.
            lang.
            dist)
            ((X10_TEMP381));
        
//#line 1320
/* template:forloop { */
        for (java.util.Iterator i__ = (areg).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1321
final double X10_TEMP386 =
              (Program0.
                 Program_Random_nextDouble(
                 R));
            
//#line 1323
final double X10_TEMP14 =
              (X10_TEMP386);
            
//#line 1324
final double X10_TEMP389 =
              (1.0E-6);
            
//#line 1326
final double X10_TEMP15 =
              (X10_TEMP389);
            
//#line 1327
final double X10_TEMP392 =
              (X10_TEMP14 *
                 X10_TEMP15);
            
//#line 1329
final double X10_TEMP18 =
              (X10_TEMP392);
            
//#line 1330
final double X10_TEMP395 =
              (X10_TEMP18);
            
//#line 1332
final double X10_TEMP19 =
              (X10_TEMP395);
            
//#line 1333
final double X10_TEMP399 =
              (X10_TEMP19);
            
//#line 1335
final double X10_TEMP402 =
              (X10_TEMP399);
            
//#line 1336
/* template:array_set { */(a).set((X10_TEMP402),i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 1338
return a;
    }
    
    
//#line 1340
public static void
                    Program_SparseMatmult_test(
                    final SparseMatmult X10_TEMP0,
                    final x10.
                      lang.
                      DoubleReferenceArray y,
                    final x10.
                      lang.
                      doubleArray val,
                    final x10.
                      lang.
                      intArray row,
                    final x10.
                      lang.
                      intArray col,
                    final x10.
                      lang.
                      doubleArray x,
                    final int NUM_ITERATIONS,
                    final x10.
                      lang.
                      intArray lowsum,
                    final x10.
                      lang.
                      intArray highsum) {
        
//#line 1341
final x10.
          lang.
          region X10_TEMP355 =
          (x10.
            lang.
            region)
            ((val.
                region));
        
//#line 1343
final x10.
          lang.
          region X10_TEMP1 =
          (x10.
            lang.
            region)
            ((X10_TEMP355));
        
//#line 1344
final int X10_TEMP358 =
          (X10_TEMP1.
             size());
        
//#line 1346
final int nz =
          (X10_TEMP358);
        
//#line 1347
final x10.
          lang.
          dist X10_TEMP361 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 1349
final x10.
          lang.
          dist X10_TEMP3 =
          (x10.
            lang.
            dist)
            ((X10_TEMP361));
        
//#line 1350
final x10.
          lang.
          dist X10_TEMP364 =
          (x10.
            lang.
            dist)
            ((X10_TEMP3));
        
//#line 1352
final x10.
          lang.
          dist dDistU =
          (x10.
            lang.
            dist)
            ((X10_TEMP364));
        
//#line 1353
final double X10_TEMP367 =
          (0.0);
        
//#line 1355
final double X10_TEMP7 =
          (X10_TEMP367);
        
//#line 1356
final double X10_TEMP370 =
          (X10_TEMP7);
        
//#line 1358
final double X10_TEMP8 =
          (X10_TEMP370);
        
//#line 1359
final double X10_TEMP373 =
          (X10_TEMP8);
        
//#line 1361
final double X10_TEMP376 =
          (X10_TEMP373);
        
//#line 1362
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ytotal =
          ((X10_TEMP376));
        
//#line 1363
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1364
final x10.
              lang.
              place X10_TEMP10 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1365
/* template:forloop { */
            for (java.util.Iterator id1__ = (dDistU.
                                               region).iterator(); id1__.hasNext(); ) {
            	final  x10.
              lang.
              point id1 = (x10.
              lang.
              point) id1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1366
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP10)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1367
final int X10_TEMP381 =
                      (0);
                    
//#line 1369
final int X10_TEMP14 =
                      (X10_TEMP381);
                    
//#line 1370
final int X10_TEMP384 =
                      (1);
                    
//#line 1372
final int X10_TEMP12 =
                      (X10_TEMP384);
                    
//#line 1373
final int X10_TEMP387 =
                      (NUM_ITERATIONS -
                         X10_TEMP12);
                    
//#line 1375
final int X10_TEMP15 =
                      (X10_TEMP387);
                    
//#line 1376
final x10.
                      lang.
                      region X10_TEMP392 =
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
                              X10_TEMP14,
                              X10_TEMP15))));
                    
//#line 1378
final x10.
                      lang.
                      region X10_TEMP17 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP392));
                    
//#line 1379
/* template:forloop { */
                    for (java.util.Iterator reps__ = (X10_TEMP17).iterator(); reps__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point reps = (x10.
                      lang.
                      point) reps__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 1380
final int X10_TEMP397 =
                          (/* template:array_get { */((lowsum).get(id1))/* } */);
                        
//#line 1382
final int X10_TEMP24 =
                          (X10_TEMP397);
                        
//#line 1383
final int X10_TEMP401 =
                          (/* template:array_get { */((highsum).get(id1))/* } */);
                        
//#line 1385
final int X10_TEMP21 =
                          (X10_TEMP401);
                        
//#line 1386
final int X10_TEMP404 =
                          (1);
                        
//#line 1388
final int X10_TEMP22 =
                          (X10_TEMP404);
                        
//#line 1389
final int X10_TEMP407 =
                          (X10_TEMP21 -
                             X10_TEMP22);
                        
//#line 1391
final int X10_TEMP25 =
                          (X10_TEMP407);
                        
//#line 1392
final x10.
                          lang.
                          region X10_TEMP412 =
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
                                  X10_TEMP24,
                                  X10_TEMP25))));
                        
//#line 1394
final x10.
                          lang.
                          region X10_TEMP27 =
                          (x10.
                            lang.
                            region)
                            ((X10_TEMP412));
                        
//#line 1395
/* template:forloop { */
                        for (java.util.Iterator i__ = (X10_TEMP27).iterator(); i__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point i = (x10.
                          lang.
                          point) i__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 1396
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1397
final x10.
                                  lang.
                                  dist X10_TEMP416 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((y.
                                        distribution));
                                
//#line 1399
final x10.
                                  lang.
                                  dist X10_TEMP28 =
                                  (x10.
                                    lang.
                                    dist)
                                    ((X10_TEMP416));
                                
//#line 1400
final int X10_TEMP420 =
                                  (/* template:array_get { */((row).get(i))/* } */);
                                
//#line 1402
int X10_TEMP31 =
                                  (X10_TEMP420);
                                
//#line 1403
final x10.
                                  lang.
                                  place X10_TEMP33 =
                                  (X10_TEMP28.
                                     get(
                                     X10_TEMP31));
                                
//#line 1404
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP33)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 1405
final int X10_TEMP427 =
                                      (/* template:array_get { */((row).get(i))/* } */);
                                    
//#line 1407
final int X10_TEMP36 =
                                      (X10_TEMP427);
                                    
//#line 1408
final int X10_TEMP431 =
                                      (/* template:array_get { */((col).get(i))/* } */);
                                    
//#line 1410
final int X10_TEMP39 =
                                      (X10_TEMP431);
                                    
//#line 1411
final double X10_TEMP435 =
                                      (/* template:array_get { */((x).get(X10_TEMP39))/* } */);
                                    
//#line 1413
final double X10_TEMP41 =
                                      (X10_TEMP435);
                                    
//#line 1414
final double X10_TEMP439 =
                                      (/* template:array_get { */((val).get(i))/* } */);
                                    
//#line 1416
final double X10_TEMP42 =
                                      (X10_TEMP439);
                                    
//#line 1417
final double X10_TEMP443 =
                                      (/* template:array_get { */((y).get(X10_TEMP36))/* } */);
                                    
//#line 1419
final double X10_TEMP44 =
                                      (X10_TEMP443);
                                    
//#line 1420
final double X10_TEMP446 =
                                      (X10_TEMP41 *
                                         X10_TEMP42);
                                    
//#line 1422
final double X10_TEMP45 =
                                      (X10_TEMP446);
                                    
//#line 1423
final double X10_TEMP449 =
                                      (X10_TEMP44 +
                                         X10_TEMP45);
                                    
//#line 1425
final double X10_TEMP46 =
                                      (X10_TEMP449);
                                    
//#line 1426
final double X10_TEMP453 =
                                      (X10_TEMP46);
                                    
//#line 1428
final double X10_TEMP456 =
                                      (X10_TEMP453);
                                    
//#line 1429
/* template:array_set { */(y).set((X10_TEMP456),X10_TEMP36)/* } */;
                                }
                                		}
                                	});/* } */
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
                        /* } */
                        
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
        	} catch (Throwable tmp19) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp19);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1437
final x10.
          lang.
          place X10_TEMP458 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1439
final x10.
          lang.
          place curr_place =
          (X10_TEMP458);
        
//#line 1440
final int X10_TEMP461 =
          (0);
        
//#line 1442
final int X10_TEMP50 =
          (X10_TEMP461);
        
//#line 1443
final int X10_TEMP464 =
          (0);
        
//#line 1445
final int X10_TEMP51 =
          (X10_TEMP464);
        
//#line 1446
final x10.
          lang.
          region X10_TEMP469 =
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
                  X10_TEMP50,
                  X10_TEMP51))));
        
//#line 1448
final x10.
          lang.
          region tempr =
          (x10.
            lang.
            region)
            ((X10_TEMP469));
        
//#line 1449
final x10.
          lang.
          place X10_TEMP472 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1451
final x10.
          lang.
          place X10_TEMP53 =
          (X10_TEMP472);
        
//#line 1452
final x10.
          lang.
          dist X10_TEMP475 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                X10_TEMP53)));
        
//#line 1454
final x10.
          lang.
          dist tempvd =
          (x10.
            lang.
            dist)
            ((X10_TEMP475));
        
//#line 1455
final x10.
          lang.
          DoubleReferenceArray X10_TEMP482 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 1456
final double X10_TEMP478 =
                    (0.0);
                  
//#line 1458
final double X10_TEMP56 =
                    (X10_TEMP478);
                  
//#line 1459
return X10_TEMP56;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 1464
final x10.
          lang.
          DoubleReferenceArray tempref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP482));
        
//#line 1465
final int X10_TEMP485 =
          (0);
        
//#line 1467
final int X10_TEMP61 =
          (X10_TEMP485);
        
//#line 1468
final int X10_TEMP488 =
          (1);
        
//#line 1470
final int X10_TEMP59 =
          (X10_TEMP488);
        
//#line 1471
final int X10_TEMP491 =
          (nz -
             X10_TEMP59);
        
//#line 1473
final int X10_TEMP62 =
          (X10_TEMP491);
        
//#line 1474
final x10.
          lang.
          region X10_TEMP496 =
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
                  X10_TEMP61,
                  X10_TEMP62))));
        
//#line 1476
final x10.
          lang.
          region X10_TEMP64 =
          (x10.
            lang.
            region)
            ((X10_TEMP496));
        
//#line 1477
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP64).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1478
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1479
final x10.
                  lang.
                  dist X10_TEMP500 =
                  (x10.
                    lang.
                    dist)
                    ((y.
                        distribution));
                
//#line 1481
final x10.
                  lang.
                  dist X10_TEMP65 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP500));
                
//#line 1482
final int X10_TEMP504 =
                  (/* template:array_get { */((row).get(i))/* } */);
                
//#line 1484
int X10_TEMP68 =
                  (X10_TEMP504);
                
//#line 1485
final x10.
                  lang.
                  place X10_TEMP70 =
                  (X10_TEMP65.
                     get(
                     X10_TEMP68));
                
//#line 1486
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP70)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1487
final int X10_TEMP511 =
                      (/* template:array_get { */((row).get(i))/* } */);
                    
//#line 1489
final int X10_TEMP73 =
                      (X10_TEMP511);
                    
//#line 1490
final double X10_TEMP515 =
                      (/* template:array_get { */((y).get(X10_TEMP73))/* } */);
                    
//#line 1492
final double temp =
                      (X10_TEMP515);
                    
//#line 1493
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1494
final int X10_TEMP519 =
                          (0);
                        
//#line 1496
final int X10_TEMP77 =
                          (X10_TEMP519);
                        
//#line 1497
final double X10_TEMP522 =
                          (temp);
                        
//#line 1499
final double X10_TEMP80 =
                          (X10_TEMP522);
                        
//#line 1500
final double X10_TEMP526 =
                          (X10_TEMP80);
                        
//#line 1502
final double X10_TEMP529 =
                          (X10_TEMP526);
                        
//#line 1503
/* template:array_set { */(tempref).set((X10_TEMP529),X10_TEMP77)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp21) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp21);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1507
final int X10_TEMP531 =
              (0);
            
//#line 1509
final int X10_TEMP82 =
              (X10_TEMP531);
            
//#line 1510
final double X10_TEMP534 =
              (/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ytotal);
            
//#line 1512
final double X10_TEMP84 =
              (X10_TEMP534);
            
//#line 1513
final double X10_TEMP538 =
              (/* template:array_get { */((tempref).get(X10_TEMP82))/* } */);
            
//#line 1515
final double X10_TEMP85 =
              (X10_TEMP538);
            
//#line 1516
final double X10_TEMP541 =
              (X10_TEMP84 +
                 X10_TEMP85);
            
//#line 1518
final double X10_TEMP86 =
              (X10_TEMP541);
            
//#line 1519
final double X10_TEMP544 =
              (X10_TEMP86);
            
//#line 1521
final double X10_TEMP547 =
              (X10_TEMP544);
            
//#line 1522
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ytotal =
              ((X10_TEMP547));
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 1525
public static void
                    Program_runMain(
                    ) {
        
//#line 1526
final Timer X10_TEMP355 =
          (new Timer(
             ));
        
//#line 1528
Timer tmr =
          (X10_TEMP355);
        
//#line 1529
final int X10_TEMP358 =
          (0);
        
//#line 1531
int count =
          (X10_TEMP358);
        
//#line 1532
Program0.
                        Program_Timer_start(
                        tmr,
                        count);
        
//#line 1533
final SparseMatmult X10_TEMP363 =
          (new SparseMatmult(
             ));
        
//#line 1535
final SparseMatmult X10_TEMP4 =
          (X10_TEMP363);
        
//#line 1536
final int X10_TEMP366 =
          (0);
        
//#line 1538
final int X10_TEMP6 =
          (X10_TEMP366);
        
//#line 1539
Program0.
                        Program_SparseMatmult_run(
                        X10_TEMP4,
                        X10_TEMP6);
        
//#line 1540
Program0.
                        Program_Timer_stop(
                        tmr,
                        count);
        
//#line 1541
final java.
          lang.
          String X10_TEMP373 =
          ("Wall-clock time for sparsemm: ");
        
//#line 1543
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP373);
        
//#line 1544
final double X10_TEMP378 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 1546
final double X10_TEMP10 =
          (X10_TEMP378);
        
//#line 1547
final java.
          lang.
          String X10_TEMP381 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 1549
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP381);
        
//#line 1550
final java.
          lang.
          String X10_TEMP384 =
          (" secs");
        
//#line 1552
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP384);
        
//#line 1553
final java.
          lang.
          String X10_TEMP387 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 1555
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP387);
        
//#line 1556
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP14);
    }
    
    
//#line 1558
public static int
                    Program__Timer_max_counters_init(
                    ) {
        
//#line 1559
final int X10_TEMP355 =
          (64);
        
//#line 1561
final int X10_TEMP2 =
          (X10_TEMP355);
        
//#line 1562
return X10_TEMP2;
    }
    
    
//#line 1564
public static void
                    Program_Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1565
final x10.
          lang.
          DoubleReferenceArray X10_TEMP355 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1567
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP355));
        
//#line 1568
final long X10_TEMP358 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1570
final double X10_TEMP5 =
          (X10_TEMP358);
        
//#line 1571
final double X10_TEMP361 =
          (X10_TEMP5);
        
//#line 1573
final double X10_TEMP6 =
          (X10_TEMP361);
        
//#line 1574
final double X10_TEMP365 =
          (X10_TEMP6);
        
//#line 1576
final double X10_TEMP368 =
          (X10_TEMP365);
        
//#line 1577
/* template:array_set { */(X10_TEMP1).set((X10_TEMP368),n)/* } */;
    }
    
    
//#line 1579
public static void
                    Program_Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1580
final x10.
          lang.
          DoubleReferenceArray X10_TEMP355 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1582
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP355));
        
//#line 1583
final long X10_TEMP358 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 1585
final double X10_TEMP5 =
          (X10_TEMP358);
        
//#line 1586
final x10.
          lang.
          DoubleReferenceArray X10_TEMP361 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1588
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP361));
        
//#line 1589
final double X10_TEMP365 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 1591
final double X10_TEMP6 =
          (X10_TEMP365);
        
//#line 1592
final double X10_TEMP368 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 1594
final double X10_TEMP9 =
          (X10_TEMP368);
        
//#line 1595
final double X10_TEMP371 =
          (X10_TEMP9);
        
//#line 1597
final double X10_TEMP10 =
          (X10_TEMP371);
        
//#line 1598
final double X10_TEMP375 =
          (X10_TEMP10);
        
//#line 1600
final double X10_TEMP378 =
          (X10_TEMP375);
        
//#line 1601
/* template:array_set { */(X10_TEMP1).set((X10_TEMP378),n)/* } */;
        
//#line 1602
final x10.
          lang.
          DoubleReferenceArray X10_TEMP380 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1604
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP380));
        
//#line 1605
final double X10_TEMP384 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 1607
final double X10_TEMP14 =
          (X10_TEMP384);
        
//#line 1608
final int X10_TEMP387 =
          (1000);
        
//#line 1610
final double X10_TEMP15 =
          (X10_TEMP387);
        
//#line 1611
final double X10_TEMP390 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 1613
final double X10_TEMP16 =
          (X10_TEMP390);
        
//#line 1614
final double X10_TEMP394 =
          (X10_TEMP16);
        
//#line 1616
final double X10_TEMP397 =
          (X10_TEMP394);
        
//#line 1617
/* template:array_set { */(X10_TEMP11).set((X10_TEMP397),n)/* } */;
        
//#line 1618
final x10.
          lang.
          DoubleReferenceArray X10_TEMP399 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1620
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP399));
        
//#line 1621
final x10.
          lang.
          DoubleReferenceArray X10_TEMP402 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1623
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP402));
        
//#line 1624
final double X10_TEMP406 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 1626
final double X10_TEMP22 =
          (X10_TEMP406);
        
//#line 1627
final double X10_TEMP410 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 1629
final double X10_TEMP23 =
          (X10_TEMP410);
        
//#line 1630
final double X10_TEMP413 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 1632
final double X10_TEMP24 =
          (X10_TEMP413);
        
//#line 1633
final double X10_TEMP417 =
          (X10_TEMP24);
        
//#line 1635
final double X10_TEMP420 =
          (X10_TEMP417);
        
//#line 1636
/* template:array_set { */(X10_TEMP17).set((X10_TEMP420),n)/* } */;
    }
    
    
//#line 1638
public static double
                    Program_Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1639
final x10.
          lang.
          DoubleReferenceArray X10_TEMP355 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1641
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP355));
        
//#line 1642
final double X10_TEMP359 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 1644
final double X10_TEMP4 =
          (X10_TEMP359);
        
//#line 1645
return X10_TEMP4;
    }
    
    
//#line 1647
public static void
                    Program_Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 1648
final x10.
          lang.
          DoubleReferenceArray X10_TEMP355 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 1650
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP355));
        
//#line 1651
final int X10_TEMP358 =
          (0);
        
//#line 1653
final double X10_TEMP5 =
          (X10_TEMP358);
        
//#line 1654
final double X10_TEMP361 =
          (X10_TEMP5);
        
//#line 1656
final double X10_TEMP6 =
          (X10_TEMP361);
        
//#line 1657
final double X10_TEMP365 =
          (X10_TEMP6);
        
//#line 1659
final double X10_TEMP368 =
          (X10_TEMP365);
        
//#line 1660
/* template:array_set { */(X10_TEMP1).set((X10_TEMP368),n)/* } */;
        
//#line 1661
final x10.
          lang.
          DoubleReferenceArray X10_TEMP370 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 1663
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP370));
        
//#line 1664
final int X10_TEMP373 =
          (0);
        
//#line 1666
final double X10_TEMP11 =
          (X10_TEMP373);
        
//#line 1667
final double X10_TEMP376 =
          (X10_TEMP11);
        
//#line 1669
final double X10_TEMP12 =
          (X10_TEMP376);
        
//#line 1670
final double X10_TEMP380 =
          (X10_TEMP12);
        
//#line 1672
final double X10_TEMP383 =
          (X10_TEMP380);
        
//#line 1673
/* template:array_set { */(X10_TEMP7).set((X10_TEMP383),n)/* } */;
        
//#line 1674
final x10.
          lang.
          DoubleReferenceArray X10_TEMP385 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 1676
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP385));
        
//#line 1677
final int X10_TEMP388 =
          (0);
        
//#line 1679
final double X10_TEMP17 =
          (X10_TEMP388);
        
//#line 1680
final double X10_TEMP391 =
          (X10_TEMP17);
        
//#line 1682
final double X10_TEMP18 =
          (X10_TEMP391);
        
//#line 1683
final double X10_TEMP395 =
          (X10_TEMP18);
        
//#line 1685
final double X10_TEMP398 =
          (X10_TEMP395);
        
//#line 1686
/* template:array_set { */(X10_TEMP13).set((X10_TEMP398),n)/* } */;
    }
    
    
//#line 1688
public static void
                    Program_Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 1689
final int X10_TEMP355 =
          (0);
        
//#line 1691
int i =
          (X10_TEMP355);
        
//#line 1692
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 1693
boolean X10_TEMP360 =
          X10_TEMP4;
        
//#line 1694
while (X10_TEMP360) {
            
//#line 1695
Program0.
                            Program_Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 1696
final int X10_TEMP364 =
              (i);
            
//#line 1698
final int X10_TEMP6 =
              (X10_TEMP364);
            
//#line 1699
final int X10_TEMP7 =
              (1);
            
//#line 1700
final int X10_TEMP368 =
              (i +
                 X10_TEMP7);
            
//#line 1701
i =
              ((X10_TEMP368));
            
//#line 1702
final boolean X10_TEMP370 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 1703
X10_TEMP4 =
              ((X10_TEMP370));
            
//#line 1704
X10_TEMP360 =
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
    
    
//#line 1710
public Program() {
        
//#line 1710
super();
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 1714
public long
      seed;
    
    
//#line 1717
public Random(final long rseed) {
        
//#line 1717
super();
        
//#line 1718
this.
                        Random_Random_setSeed(
                        rseed);
    }
    
    
//#line 1722
public void
                    Random_Random_setSeed(
                    final long rseed) {
        
//#line 1723
final long X10_TEMP355 =
          (Program0.
             _Program__Random_multiplier);
        
//#line 1725
final long X10_TEMP1 =
          (X10_TEMP355);
        
//#line 1726
final long X10_TEMP358 =
          (rseed ^
             X10_TEMP1);
        
//#line 1728
final long X10_TEMP3 =
          (X10_TEMP358);
        
//#line 1729
final long X10_TEMP361 =
          (Program0.
             _Program__Random_mask);
        
//#line 1731
final long X10_TEMP4 =
          (X10_TEMP361);
        
//#line 1732
final long X10_TEMP364 =
          (X10_TEMP3 &
             X10_TEMP4);
        
//#line 1734
final long X10_TEMP6 =
          (X10_TEMP364);
        
//#line 1735
final long X10_TEMP367 =
          (X10_TEMP6);
        
//#line 1737
seed =
          ((X10_TEMP367));
    }
}

class SparseMatmult
extends x10.
  lang.
  Object
{
    
//#line 1743
public int
      nthreads;
    
//#line 1744
public int
      setSize;
    
//#line 1745
public x10.
      lang.
      doubleArray
      x;
    
//#line 1746
public x10.
      lang.
      doubleArray
      val;
    
//#line 1747
public x10.
      lang.
      intArray
      col;
    
//#line 1748
public x10.
      lang.
      intArray
      row;
    
//#line 1749
public x10.
      lang.
      intArray
      lowsum;
    
//#line 1750
public x10.
      lang.
      intArray
      highsum;
    
//#line 1751
public x10.
      lang.
      DoubleReferenceArray
      y;
    
//#line 1752
public double
      ytotal;
    
    
//#line 1755
public SparseMatmult() {
        
//#line 1755
super();
        
//#line 1756
final int X10_TEMP355 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 1758
final int X10_TEMP3 =
          (X10_TEMP355);
        
//#line 1759
final int X10_TEMP358 =
          (X10_TEMP3);
        
//#line 1761
final int X10_TEMP4 =
          (X10_TEMP358);
        
//#line 1762
final int X10_TEMP361 =
          (X10_TEMP4);
        
//#line 1764
final int X10_TEMP364 =
          (X10_TEMP361);
        
//#line 1765
this.
                        nthreads =
          ((X10_TEMP364));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1772
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 1773
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 1774
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 1777
public Timer() {
        
//#line 1777
super();
        
//#line 1778
final int X10_TEMP355 =
          (0);
        
//#line 1780
int i =
          (X10_TEMP355);
        
//#line 1781
final int X10_TEMP358 =
          (0);
        
//#line 1783
final int X10_TEMP4 =
          (X10_TEMP358);
        
//#line 1784
final int X10_TEMP361 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1786
final int X10_TEMP5 =
          (X10_TEMP361);
        
//#line 1787
final x10.
          lang.
          region X10_TEMP366 =
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
        
//#line 1789
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP366));
        
//#line 1790
final x10.
          lang.
          place X10_TEMP369 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1792
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP369);
        
//#line 1793
final x10.
          lang.
          dist X10_TEMP372 =
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
        
//#line 1795
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP372));
        
//#line 1796
final x10.
          lang.
          DoubleReferenceArray X10_TEMP375 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1798
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP375));
        
//#line 1799
final x10.
          lang.
          DoubleReferenceArray X10_TEMP378 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 1801
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP378));
        
//#line 1802
final x10.
          lang.
          DoubleReferenceArray X10_TEMP381 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1804
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP381));
        
//#line 1805
final x10.
          lang.
          DoubleReferenceArray X10_TEMP384 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 1807
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP384));
        
//#line 1808
final x10.
          lang.
          DoubleReferenceArray X10_TEMP387 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1810
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP387));
        
//#line 1811
final x10.
          lang.
          DoubleReferenceArray X10_TEMP390 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 1813
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP390));
        
//#line 1814
final int X10_TEMP393 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1816
final int X10_TEMP15 =
          (X10_TEMP393);
        
//#line 1817
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 1818
boolean X10_TEMP398 =
          X10_TEMP19;
        
//#line 1819
while (X10_TEMP398) {
            
//#line 1820
final int X10_TEMP400 =
              (0);
            
//#line 1822
final double X10_TEMP23 =
              (X10_TEMP400);
            
//#line 1823
final double X10_TEMP403 =
              (X10_TEMP23);
            
//#line 1825
final double X10_TEMP24 =
              (X10_TEMP403);
            
//#line 1826
final double X10_TEMP407 =
              (X10_TEMP24);
            
//#line 1828
final double X10_TEMP410 =
              (X10_TEMP407);
            
//#line 1829
/* template:array_set { */(start_time).set((X10_TEMP410),i)/* } */;
            
//#line 1830
final int X10_TEMP412 =
              (0);
            
//#line 1832
final double X10_TEMP28 =
              (X10_TEMP412);
            
//#line 1833
final double X10_TEMP415 =
              (X10_TEMP28);
            
//#line 1835
final double X10_TEMP29 =
              (X10_TEMP415);
            
//#line 1836
final double X10_TEMP419 =
              (X10_TEMP29);
            
//#line 1838
final double X10_TEMP422 =
              (X10_TEMP419);
            
//#line 1839
/* template:array_set { */(elapsed_time).set((X10_TEMP422),i)/* } */;
            
//#line 1840
final int X10_TEMP424 =
              (0);
            
//#line 1842
final double X10_TEMP33 =
              (X10_TEMP424);
            
//#line 1843
final double X10_TEMP427 =
              (X10_TEMP33);
            
//#line 1845
final double X10_TEMP34 =
              (X10_TEMP427);
            
//#line 1846
final double X10_TEMP431 =
              (X10_TEMP34);
            
//#line 1848
final double X10_TEMP434 =
              (X10_TEMP431);
            
//#line 1849
/* template:array_set { */(total_time).set((X10_TEMP434),i)/* } */;
            
//#line 1850
final int X10_TEMP436 =
              (i);
            
//#line 1852
final int X10_TEMP35 =
              (X10_TEMP436);
            
//#line 1853
final int X10_TEMP36 =
              (1);
            
//#line 1854
final int X10_TEMP440 =
              (i +
                 X10_TEMP36);
            
//#line 1855
i =
              ((X10_TEMP440));
            
//#line 1856
final int X10_TEMP442 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 1858
final int X10_TEMP17 =
              (X10_TEMP442);
            
//#line 1859
final boolean X10_TEMP445 =
              (i <
                 X10_TEMP17);
            
//#line 1860
X10_TEMP19 =
              ((X10_TEMP445));
            
//#line 1861
X10_TEMP398 =
              X10_TEMP19;
        }
    }
}
