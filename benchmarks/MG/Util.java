import x10.lang.*;

public class Util
extends x10.
  lang.
  Object
{
    
//#line 17
final public static boolean
      PERF_OUTPUT =
      true;
    
//#line 18
final public static double
      CLOCK_SPEED =
      375;
    
//#line 19
final public static double
      FP_PERCLOCK =
      4;
    
//#line 20
final public static double
      COMM_LATENCY =
      1;
    
//#line 21
final public static double
      COMM_BANDWIDTH =
      2000;
    
//#line 22
final public static boolean
      IN_LOOP =
      false;
    
//#line 23
final public static boolean
      COMP_ONLY =
      false;
    
//#line 24
final public static boolean
      COMM_ONLY =
      false;
    
//#line 25
final public static int
      THREADS_PERFOREACH =
      1;
    
//#line 27
final public static boolean
      OVERLAP_COMMANDCOMP =
      false;
    
//#line 29
final public static boolean
      EXCHANGE_AFTER =
      false;
    
//#line 35
final public static int
      P2SLEVEL =
      1;
    
//#line 37
final public static int
      N_PLACES =
      x10.
        lang.
        place.
        MAX_PLACES;
    
    
//#line 45
public static double
                  sumDIFF1(
                  final x10.
                    lang.
                    point p,
                  final x10.
                    lang.
                    DoubleReferenceArray arg) {
        
//#line 46
double d1 =
          0;
        
//#line 47
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           0))))/* } */;
        
//#line 48
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           0))))/* } */;
        
//#line 49
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 50
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 51
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 52
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 53
return d1;
    }
    
    
//#line 56
public static double
                  sumDIFF2(
                  final x10.
                    lang.
                    point p,
                  final x10.
                    lang.
                    DoubleReferenceArray arg) {
        
//#line 57
double d1 =
          0;
        
//#line 58
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 59
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 60
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 61
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 62
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 63
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 64
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 65
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 66
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 67
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 68
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 69
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 70
return d1;
    }
    
    
//#line 73
public static double
                  sumDIFF3(
                  final x10.
                    lang.
                    point p,
                  final x10.
                    lang.
                    DoubleReferenceArray arg) {
        
//#line 74
double d1 =
          0;
        
//#line 75
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 76
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 77
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 78
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 79
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 80
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 81
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 82
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 83
return d1;
    }
    
    
//#line 86
final public static x10.
      lang.
      region
      UNIT_CUBE =
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
          1),
        x10.
          lang.
          region.
          factory.
          region(
          0,
          1),
        x10.
          lang.
          region.
          factory.
          region(
          0,
          1));
    
//#line 87
final public static x10.
      lang.
      GenericReferenceArray
      QREGIONS =
      (x10.
        lang.
        GenericReferenceArray)
        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(UNIT_CUBE.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
           lang.
           point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
             
//#line 87
final int a =
               /* template:array_get { */((p).get(0))/* } */;
             
//#line 87
final int b =
               /* template:array_get { */((p).get(1))/* } */;
             
//#line 87
final int c =
               /* template:array_get { */((p).get(2))/* } */;
             
//#line 87
return x10.
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
                                    a),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    0,
                                    b),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    0,
                                    c));
         } }
         }/* } */,true,false,true)/* } */);
    
//#line 89
final public static int
      LOW =
      0;
    
//#line 90
final public static int
      HIGH =
      1;
    
    
//#line 92
public static boolean
                  powerOf2(
                  final int a_int) {
        
//#line 93
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_int);
        
//#line 94
if (i ==
                          0) {
            
//#line 94
return false;
        } else {
            
//#line 96
if (i !=
                              ((pow2(
                                  log2(
                                    i))))) {
                
//#line 96
return false;
            }
        }
        
//#line 98
return true;
    }
    
    
//#line 100
public static int
                   log2(
                   final int a_int) {
        
//#line 101
return (int)
                              ((java.
                                  lang.
                                  Math.
                                  log(
                                  a_int) /
                                  java.
                                    lang.
                                    Math.
                                    log(
                                    2)));
    }
    
    
//#line 103
public static int
                   pow2(
                   final int a_int) {
        
//#line 104
return (int)
                              java.
                                lang.
                                Math.
                                pow(
                                2,
                                a_int);
    }
    
    
//#line 110
public static x10.
                   lang.
                   region
                   boundary(
                   final x10.
                     lang.
                     region a_R,
                   final int a_direction,
                   final int a_padSize0,
                   final int a_padSize1,
                   final int a_padSize2) {
        
//#line 112
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_direction);
        
//#line 113
boolean IsHigh =
          (a_direction >
             0);
        
//#line 114
int low0 =
          a_R.
            rank(
            0).
            low();
        
//#line 115
int low1 =
          a_R.
            rank(
            1).
            low();
        
//#line 116
int low2 =
          a_R.
            rank(
            2).
            low();
        
//#line 117
int high0 =
          a_R.
            rank(
            0).
            high();
        
//#line 118
int high1 =
          a_R.
            rank(
            1).
            high();
        
//#line 119
int high2 =
          a_R.
            rank(
            2).
            high();
        
//#line 120
int r =
          3;
        
//#line 121
if (i <=
                           r &&
                           r ==
                           3) {
            
//#line 122
if (IsHigh) {
                
//#line 123
return x10.
                                      lang.
                                      region.
                                      factory.
                                      region(
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            1
                                            ? high0 +
                                            1
                                            : low0)) -
                                          a_padSize0,
                                        ((i ==
                                            1
                                            ? high0 +
                                            1
                                            : high0)) +
                                          a_padSize0),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            2
                                            ? high1 +
                                            1
                                            : low1)) -
                                          a_padSize1,
                                        ((i ==
                                            2
                                            ? high1 +
                                            1
                                            : high1)) +
                                          a_padSize1),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            3
                                            ? high2 +
                                            1
                                            : low2)) -
                                          a_padSize2,
                                        ((i ==
                                            3
                                            ? high2 +
                                            1
                                            : high2)) +
                                          a_padSize2));
            } else {
                
//#line 128
return x10.
                                      lang.
                                      region.
                                      factory.
                                      region(
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            1
                                            ? low0 -
                                            1
                                            : low0)) -
                                          a_padSize0,
                                        ((i ==
                                            1
                                            ? low0 -
                                            1
                                            : high0)) +
                                          a_padSize0),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            2
                                            ? low1 -
                                            1
                                            : low1)) -
                                          a_padSize1,
                                        ((i ==
                                            2
                                            ? low1 -
                                            1
                                            : high1)) +
                                          a_padSize1),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            3
                                            ? low2 -
                                            1
                                            : low2)) -
                                          a_padSize2,
                                        ((i ==
                                            3
                                            ? low2 -
                                            1
                                            : high2)) +
                                          a_padSize2));
            }
        } else {
            
//#line 134
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("MG3TongValue1.boundary():Warning! invalid inputs!");
            
//#line 135
return x10.
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
                                    -1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    0,
                                    -1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    0,
                                    -1));
        }
    }
    
    
//#line 150
public static void
                   arraycopy3(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src) {
        
//#line 153
/* template:forloop { */
        for (java.util.Iterator p__ = (a_destR).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 155
final x10.
              lang.
              place h =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 156
/* template:Async { */(x10.lang.Runtime.asPlace(a_src.
                                                                           distribution.
                                                                           get(
                                                                           p))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 157
final double d =
                  /* template:array_get { */((a_src).get(p))/* } */;
                
//#line 158
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 158
/* template:array_set { */(a_dest).set(d,p)/* } */;
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
    
    
//#line 163
public static void
                   arraycopy4(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src,
                   final int a_trans0,
                   final int a_trans1,
                   final int a_trans2) {
        
//#line 169
/* template:forloop { */
        for (java.util.Iterator p__ = (a_destR).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 171
final x10.
              lang.
              place h =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 172
/* template:Async { */(x10.lang.Runtime.asPlace(a_src.
                                                                           distribution.
                                                                           get(
                                                                           /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                                                     lang.
                                                                                                                                                                     point.
                                                                                                                                                                     factory.
                                                                                                                                                                     point(
                                                                                                                                                                     a_trans0,
                                                                                                                                                                     a_trans1,
                                                                                                                                                                     a_trans2))))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 173
final double d =
                  /* template:array_get { */((a_src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                                   lang.
                                                                                                                                                   point.
                                                                                                                                                   factory.
                                                                                                                                                   point(
                                                                                                                                                   a_trans0,
                                                                                                                                                   a_trans1,
                                                                                                                                                   a_trans2))))/* } */;
                
//#line 174
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 174
/* template:array_set { */(a_dest).set(d,p)/* } */;
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
    
    
//#line 179
public Util() {
        
//#line 179
super();
    }
}
