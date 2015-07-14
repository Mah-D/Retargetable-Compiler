import x10.lang.*;

public class X10Util
extends x10.
  lang.
  Object
{
    
//#line 15
final public static boolean
      DEBUG =
      true;
    
//#line 20
final public static boolean
      ENABLE_CHECKS =
      true;
    
//#line 26
final public static double
      ERROR =
      1.0E-13;
    
    
//#line 31
public static double
                  maxDouble(
                  final double d1,
                  final double d2) {
        
//#line 32
return ((d1 >=
                               d2))
          ? d1
          : d2;
    }
    
    
//#line 35
public static double
                  minDouble(
                  final double d1,
                  final double d2) {
        
//#line 36
return ((d1 >=
                               d2))
          ? d2
          : d1;
    }
    
    
//#line 39
public static int
                  maxInt(
                  final int i1,
                  final int i2) {
        
//#line 40
return ((i1 >=
                               i2))
          ? i1
          : i2;
    }
    
    
//#line 43
public static int
                  minInt(
                  final int i1,
                  final int i2) {
        
//#line 44
return ((i1 >=
                               i2))
          ? i2
          : i1;
    }
    
    
//#line 52
public static x10.
                  lang.
                  region
                  prependRegionRank2D(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 55
return extendRegionRank2D(
                             r1,
                             r2);
    }
    
    
//#line 58
public static x10.
                  lang.
                  region
                  prependRegionRank3D(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 61
return x10.
                             lang.
                             region.
                             factory.
                             region(
                             r1,
                             getRank2D(
                               r2,
                               0),
                             getRank2D(
                               r2,
                               1));
    }
    
    
//#line 75
public static x10.
                  lang.
                  region
                  extendRegionRank2D(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 78
return x10.
                             lang.
                             region.
                             factory.
                             region(
                             r1,
                             r2);
    }
    
    
//#line 81
public static x10.
                  lang.
                  region
                  extendRegionRank3D(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 84
return x10.
                             lang.
                             region.
                             factory.
                             region(
                             getRank2D(
                               r1,
                               0),
                             getRank2D(
                               r1,
                               1),
                             r2);
    }
    
    
//#line 101
public static x10.
                   lang.
                   dist
                   prependDistRank2D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     dist d2) {
        
//#line 104
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 106
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 107
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 108
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d2.
                    restriction(
                    p))).
                  region;
            
//#line 110
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   prependRegionRank2D(
                     r1,
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 112
return dResult;
    }
    
    
//#line 115
public static x10.
                   lang.
                   dist
                   prependDistRank3D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     dist d2) {
        
//#line 118
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  3),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 120
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 121
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 122
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d2.
                    restriction(
                    p))).
                  region;
            
//#line 124
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   prependRegionRank3D(
                     r1,
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 126
return dResult;
    }
    
    
//#line 152
public static x10.
                   lang.
                   dist
                   extendDistRank2D(
                   final x10.
                     lang.
                     dist d1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 155
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 157
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 158
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 159
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d1.
                    restriction(
                    p))).
                  region;
            
//#line 161
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   extendRegionRank2D(
                     rLocal,
                     r2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 163
return dResult;
    }
    
    
//#line 166
public static x10.
                   lang.
                   dist
                   extendDistRank3D(
                   final x10.
                     lang.
                     dist d1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 169
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  3),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 171
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 172
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 173
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d1.
                    restriction(
                    p))).
                  region;
            
//#line 175
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   extendRegionRank3D(
                     rLocal,
                     r2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 177
return dResult;
    }
    
    
//#line 200
public static x10.
                   lang.
                   dist
                   distBlock(
                   final x10.
                     lang.
                     region r) {
        
//#line 201
if (r.
                           low() !=
                           0) {
            
//#line 202
throw new java.
              lang.
              RuntimeException(
              "distBlock only applies to rails");
        }
        
//#line 204
if (r.
                           high() !=
                           r.
                             size() -
                           1) {
            
//#line 205
throw new java.
              lang.
              RuntimeException(
              "distblock only applies to rails");
        }
        
//#line 208
int blockSize =
          r.
            size() /
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 210
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 212
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 213
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 214
x10.
              lang.
              dist ext =
              (x10.
                lang.
                dist)
                ((x10.
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
                        /* template:array_get { */((pl).get(0))/* } */ *
                          blockSize,
                        ((((/* template:array_get { */((pl).get(0))/* } */ +
                              1)) *
                            blockSize)) -
                          1)),
                    p)));
            
//#line 216
dResult =
              dResult.
                union(
                ext);
        }/* } */
        }
        /* } */
        
        
//#line 219
int diff =
          r.
            size() -
          blockSize *
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 220
if (blockSize *
                           x10.
                             lang.
                             place.
                             MAX_PLACES !=
                           r.
                             size()) {
            
//#line 222
x10.
              lang.
              place l =
              x10.
                lang.
                place.
                places(
                x10.
                  lang.
                  place.
                  MAX_PLACES -
                  1);
            
//#line 223
x10.
              lang.
              dist ext =
              (x10.
                lang.
                dist)
                ((x10.
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
                        r.
                          size() -
                          diff,
                        r.
                          size() -
                          1)),
                    l)));
            
//#line 225
dResult =
              dResult.
                union(
                ext);
        }
        
//#line 230
return dResult;
    }
    
    
//#line 239
public static x10.
                   lang.
                   dist
                   distBlockStar1(
                   final x10.
                     lang.
                     region r) {
        
//#line 240
final x10.
          lang.
          region r1 =
          getRank2D(
            r,
            0);
        
//#line 242
final x10.
          lang.
          dist d1 =
          distBlock(
            r1);
        
//#line 243
return extendDistRank2D(
                              d1,
                              getRank2D(
                                r,
                                1));
    }
    
    
//#line 246
public static x10.
                   lang.
                   dist
                   distBlockStar2(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 249
return distBlockStar1(
                              x10.
                                lang.
                                region.
                                factory.
                                region(
                                r1,
                                r2));
    }
    
    
//#line 257
public static x10.
                   lang.
                   dist
                   distStarBlock1(
                   final x10.
                     lang.
                     region r) {
        
//#line 258
final x10.
          lang.
          region r2 =
          getRank2D(
            r,
            1);
        
//#line 261
final x10.
          lang.
          dist d2 =
          distBlock(
            r2);
        
//#line 262
return prependDistRank2D(
                              getRank2D(
                                r,
                                0),
                              d2);
    }
    
    
//#line 265
public static x10.
                   lang.
                   dist
                   distStarBlock2(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 268
return distStarBlock1(
                              x10.
                                lang.
                                region.
                                factory.
                                region(
                                r1,
                                r2));
    }
    
    
//#line 275
public static boolean
                   isDistBlockStar(
                   final x10.
                     lang.
                     dist d) {
        
//#line 276
if (ENABLE_CHECKS) {
            
//#line 277
final x10.
              lang.
              region rd =
              d.
                region;
            
//#line 278
final x10.
              lang.
              region r1 =
              getRank2D(
                rd,
                0);
            
//#line 279
final x10.
              lang.
              region r2 =
              getRank2D(
                rd,
                1);
            
//#line 280
final x10.
              lang.
              dist dRef =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 281
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 281
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
                x10.
                  lang.
                  dist.
                  factory.
                  block(
                  r1));
            
//#line 283
/* template:forloop { */
            for (java.util.Iterator pl__ = (x10.
                                              lang.
                                              dist.
                                              UNIQUE.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 284
final x10.
                  lang.
                  place p =
                  x10.
                    lang.
                    dist.
                    UNIQUE.
                    get(
                    pl);
                
//#line 285
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((d.
                        restriction(
                        p))).
                      region;
                
//#line 287
final x10.
                  lang.
                  region rRefLocal =
                  (x10.
                    lang.
                    region)
                    ((dRef.
                        restriction(
                        p))).
                      region;
                
//#line 290
if (!((getRank2D(
                                      rLocal,
                                      0).
                                      equals(
                                      rRefLocal)))) {
                    
//#line 291
return false;
                } else {
                    
//#line 292
if (!((getRank2D(
                                          rLocal,
                                          1).
                                          equals(
                                          r2)))) {
                        
//#line 293
if (rRefLocal.
                                           size() >
                                           0) {
                            
//#line 294
return false;
                        }
                    }
                }
            }/* } */
            }
            /* } */
            
        }
        
//#line 299
return true;
    }
    
    
//#line 306
public static boolean
                   isDistStarBlock(
                   final x10.
                     lang.
                     dist d) {
        
//#line 307
if (ENABLE_CHECKS) {
            
//#line 308
final x10.
              lang.
              region rd =
              d.
                region;
            
//#line 309
final x10.
              lang.
              region r1 =
              getRank2D(
                rd,
                0);
            
//#line 310
final x10.
              lang.
              region r2 =
              getRank2D(
                rd,
                1);
            
//#line 311
final x10.
              lang.
              dist dRef =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 312
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 312
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
                x10.
                  lang.
                  dist.
                  factory.
                  block(
                  r2));
            
//#line 314
/* template:forloop { */
            for (java.util.Iterator pl__ = (x10.
                                              lang.
                                              dist.
                                              UNIQUE.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 315
final x10.
                  lang.
                  place p =
                  x10.
                    lang.
                    dist.
                    UNIQUE.
                    get(
                    pl);
                
//#line 316
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((d.
                        restriction(
                        p))).
                      region;
                
//#line 318
final x10.
                  lang.
                  region rRefLocal =
                  (x10.
                    lang.
                    region)
                    ((dRef.
                        restriction(
                        p))).
                      region;
                
//#line 321
if (!((getRank2D(
                                      rLocal,
                                      0).
                                      equals(
                                      r1) &&
                                      getRank2D(
                                        rLocal,
                                        1).
                                        equals(
                                        rRefLocal)))) {
                    
//#line 323
return false;
                }
            }/* } */
            }
            /* } */
            
        }
        
//#line 327
return true;
    }
    
    
//#line 337
public static x10.
                   lang.
                   dist
                   get2DDistRank(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 339
if (n >
                           2 ||
                           n <
                           0) {
            
//#line 340
throw new java.
              lang.
              RuntimeException(
              "Rank must within bounds");
        }
        
//#line 342
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 344
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 345
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 346
final x10.
              lang.
              region rLocal =
              ((d.
                  restriction(
                  p))).
                region;
            
//#line 347
final x10.
              lang.
              region rLocalN =
              getRank2D(
                rLocal,
                n);
            
//#line 349
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   (rLocalN.
                      difference(
                      dResult.
                        region)),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 351
return dResult;
    }
    
    
//#line 357
public static x10.
                   lang.
                   region
                   transposeRegion(
                   final x10.
                     lang.
                     region r) {
        
//#line 358
return x10.
                              lang.
                              region.
                              factory.
                              region(
                              getRank2D(
                                r,
                                1),
                              getRank2D(
                                r,
                                0));
    }
    
    
//#line 365
public static x10.
                   lang.
                   dist
                   transposeDist(
                   final x10.
                     lang.
                     dist d) {
        
//#line 367
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 369
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 370
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 371
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d.
                    restriction(
                    p))).
                  region;
            
//#line 373
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   transposeRegion(
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 375
return dResult;
    }
    
    
//#line 384
public static x10.
                   lang.
                   dist
                   transposeBlockStar(
                   final x10.
                     lang.
                     dist d) {
        
//#line 385
final x10.
          lang.
          region rd =
          d.
            region;
        
//#line 386
final x10.
          lang.
          region r1 =
          getRank2D(
            rd,
            0);
        
//#line 387
final x10.
          lang.
          region r2 =
          getRank2D(
            rd,
            1);
        
//#line 390
return extendDistRank2D(
                              distBlock(
                                r2),
                              r1);
    }
    
    
//#line 398
public static boolean
                   pullBoolean(
                   final x10.
                     lang.
                     BooleanReferenceArray b,
                   final x10.
                     lang.
                     point pt) {
        
//#line 400
if (!b.
                            region.
                            contains(
                            pt)) {
            
//#line 401
println(
                           "pt must be contained in b.region: " +
                           b.
                             region +
                           " " +
                           pt);
            
//#line 402
throw new java.
              lang.
              RuntimeException(
              "pullBoolean Exception: " +
              pt);
        }
        
//#line 405
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 406
final x10.
          lang.
          dist dDst =
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 407
final x10.
          lang.
          BooleanReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 408
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 408
/* template:Async { */(x10.lang.Runtime.asPlace(b.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 409
final boolean val =
                  /* template:array_get { */((b).get(pt))/* } */;
                
//#line 410
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 411
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp220) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp220);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 414
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 417
public static Complex
                   pullComplex(
                   final x10.
                     lang.
                     GenericReferenceArray c,
                   final x10.
                     lang.
                     point pt) {
        
//#line 419
if (!c.
                            region.
                            contains(
                            pt)) {
            
//#line 420
println(
                           "pt must be contained in c.region: " +
                           c.
                             region +
                           " " +
                           pt);
            
//#line 421
throw new java.
              lang.
              RuntimeException(
              "Complex Exception: " +
              pt);
        }
        
//#line 424
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 425
final x10.
          lang.
          dist dDst =
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 426
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dDst,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 427
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 427
/* template:Async { */(x10.lang.Runtime.asPlace(c.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 428
final Complex val =
                  /* template:parametric { */((Complex)(/* template:array_get { */((c).get(pt))/* } */))/* } */;
                
//#line 429
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 430
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp221) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp221);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 433
return /* template:parametric { */((Complex)(/* template:array_get { */((result).get(0))/* } */))/* } */;
    }
    
    
//#line 436
public static int
                   pullInt(
                   final x10.
                     lang.
                     IntReferenceArray i,
                   final x10.
                     lang.
                     point pt) {
        
//#line 437
if (!i.
                            region.
                            contains(
                            pt)) {
            
//#line 438
println(
                           "pt must be contained in i.region: " +
                           i.
                             region +
                           " " +
                           pt);
            
//#line 439
throw new java.
              lang.
              RuntimeException(
              "pullDouble Exception: " +
              pt);
        }
        
//#line 442
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 443
final x10.
          lang.
          dist dDst =
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 444
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 445
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 445
/* template:Async { */(x10.lang.Runtime.asPlace(i.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 446
final int val =
                  /* template:array_get { */((i).get(pt))/* } */;
                
//#line 447
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 448
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp222) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp222);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 451
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 454
public static double
                   pullDouble(
                   final x10.
                     lang.
                     DoubleReferenceArray d,
                   final x10.
                     lang.
                     point pt) {
        
//#line 456
if (!d.
                            region.
                            contains(
                            pt)) {
            
//#line 457
println(
                           "pt must be contained in d.region: " +
                           d.
                             region +
                           " " +
                           pt);
            
//#line 458
throw new java.
              lang.
              RuntimeException(
              "pullDouble Exception: " +
              pt);
        }
        
//#line 461
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 462
final x10.
          lang.
          dist dDst =
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 463
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 464
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 464
/* template:Async { */(x10.lang.Runtime.asPlace(d.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 465
final double val =
                  /* template:array_get { */((d).get(pt))/* } */;
                
//#line 466
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 467
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp223) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp223);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 470
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 479
public static x10.
                   lang.
                   region
                   getRank2D(
                   final x10.
                     lang.
                     region r,
                   final int n) {
        
//#line 481
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 481
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 481
return (((((((x10.
                                                                lang.
                                                                region)
                                                                x10_generated_objToCast)).
                                                              rank() ==
                                                              1)))
                                                           ? (x10.
                                                               lang.
                                                               region)
                                                               x10_generated_objToCast
                                                           : (x10.
                                                               lang.
                                                               region)
                                                               x10.
                                                                 runtime.
                                                                 RuntimeCastChecker.
                                                                 throwClassCastException(
                                                                 (x10.
                                                                   lang.
                                                                   region)
                                                                   x10_generated_objToCast,
                                                                 "Constraint is not meet"));
                                }
                            }.
                              checkCast(
                              r.
                                rank(
                                n));
    }
    
    
//#line 484
public static x10.
                   lang.
                   region
                   getRank3D(
                   final x10.
                     lang.
                     region r,
                   final int n) {
        
//#line 486
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 486
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 486
return (((((((x10.
                                                                lang.
                                                                region)
                                                                x10_generated_objToCast)).
                                                              rank() ==
                                                              1)))
                                                           ? (x10.
                                                               lang.
                                                               region)
                                                               x10_generated_objToCast
                                                           : (x10.
                                                               lang.
                                                               region)
                                                               x10.
                                                                 runtime.
                                                                 RuntimeCastChecker.
                                                                 throwClassCastException(
                                                                 (x10.
                                                                   lang.
                                                                   region)
                                                                   x10_generated_objToCast,
                                                                 "Constraint is not meet"));
                                }
                            }.
                              checkCast(
                              r.
                                rank(
                                n));
    }
    
    
//#line 492
public static x10.
                   lang.
                   region
                   getLRank2D(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 494
return getPRank2D(
                              d,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              n);
    }
    
    
//#line 497
public static x10.
                   lang.
                   region
                   getLRank3D(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 499
return getPRank3D(
                              d,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              n);
    }
    
    
//#line 505
public static x10.
                   lang.
                   region
                   getPRank2D(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p,
                   final int n) {
        
//#line 508
return getRank2D(
                              ((d.
                                  restriction(
                                  p))).
                                region,
                              n);
    }
    
    
//#line 511
public static x10.
                   lang.
                   region
                   getPRank3D(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p,
                   final int n) {
        
//#line 514
return getRank3D(
                              ((d.
                                  restriction(
                                  p))).
                                region,
                              n);
    }
    
    
//#line 520
public static x10.
                   lang.
                   region
                   get1DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 521
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 524
public static x10.
                   lang.
                   region
                   get1DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 526
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 529
public static x10.
                   lang.
                   region
                   get2DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 530
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 533
public static x10.
                   lang.
                   region
                   get2DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 535
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 538
public static x10.
                   lang.
                   region
                   get3DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 539
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 542
public static x10.
                   lang.
                   region
                   get3DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 544
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 591
public static void
                   print(
                   final java.
                     lang.
                     String s) {
        
//#line 592
if (DEBUG) {
            
//#line 593
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.print(s);
        }
    }
    
    
//#line 597
public static void
                   println(
                   final java.
                     lang.
                     String s) {
        
//#line 598
print(
                       s);
        
//#line 599
newline();
    }
    
    
//#line 602
public static void
                   newline(
                   ) {
        
//#line 603
print(
                       "\n");
    }
    
    
//#line 11
public X10Util() {
        
//#line 11
super();
    }
}
