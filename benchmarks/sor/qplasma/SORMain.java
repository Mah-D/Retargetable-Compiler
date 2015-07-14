import x10.lang.*;

public class SORMain
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
        {
            
//#line 4
Timer tmr =
              new Timer(
              );
            
//#line 5
int count =
              0;
            
//#line 6
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 7
/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(new SOR(
              )))/* } */.run();
            
//#line 8
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 9
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                       lang.
                                                                                                       System.
                                                                                                       out))/* } */.println("Wall-clock time for sor: " +
                                                                                                                            /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                            " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public SORMain() {
        
//#line 1
super();
    }
}

class SOR
extends x10.
  lang.
  Object
{
    
//#line 15
final private static int
      JACOBI_NUM_ITER =
      100;
    
//#line 16
final private static long
      RANDOM_SEED =
      10101010;
    
//#line 17
public Random
      R;
    
    
//#line 18
public SOR() {
        
//#line 18
super();
        
//#line 19
R =
          new Random(
            RANDOM_SEED);
    }
    
    
//#line 21
public void
                  run(
                  ) {
        
//#line 22
validate(
                      kernel());
    }
    
    
//#line 24
public double
                  kernel(
                  ) {
        
//#line 25
x10.
          lang.
          DoubleReferenceArray G =
          RandomMatrix(
            10,
            10,
            R);
        
//#line 26
return SORrun(
                             1.25,
                             G,
                             JACOBI_NUM_ITER);
    }
    
    
//#line 28
private x10.
                  lang.
                  DoubleReferenceArray
                  RandomMatrix(
                  final int M,
                  final int N,
                  final Random R) {
        
//#line 29
final x10.
          lang.
          dist d =
          blockStar(
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
                M -
                  1)),
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
                N -
                  1)));
        
//#line 30
final x10.
          lang.
          DoubleReferenceArray t =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 31
/* template:forloop { */
        for (java.util.Iterator p__ = (t.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 32
write(
                          t,
                          p,
                          /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextDouble() *
                            1.0E-6);
        }/* } */
        }
        /* } */
        
        
//#line 34
return t;
    }
    
    
//#line 36
private void
                  write(
                  final x10.
                    lang.
                    DoubleReferenceArray t,
                  final x10.
                    lang.
                    point p,
                  final double v) {
        
//#line 37
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 38
/* template:Async { */(x10.lang.Runtime.asPlace(t.
                                                                          distribution.
                                                                          get(
                                                                          p))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 39
/* template:array_set { */(t).set(v,p)/* } */;
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 42
private x10.
                  lang.
                  dist
                  blockStar(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 43
final x10.
          lang.
          dist d1 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 43
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 43
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
        
//#line 44
return distTimesRegion(
                             d1,
                             r2);
    }
    
    
//#line 46
private x10.
                  lang.
                  dist
                  distTimesRegion(
                  final x10.
                    lang.
                    dist d,
                  final x10.
                    lang.
                    region r) {
        
//#line 47
x10.
          lang.
          dist d0 =
          x10.
            lang.
            dist.
            factory.
            constant(
            (new x10.
               runtime.
               RuntimeCastChecker.
               DepTypeRuntimeChecking(
               ) {
                 
                 
//#line 47
public x10.
                               lang.
                               region
                               checkCast(
                               final x10.
                                 lang.
                                 region x10_generated_objToCast) {
                     
//#line 47
return (((((((x10.
                                                lang.
                                                region)
                                                x10_generated_objToCast)).
                                              rank() ==
                                              2)))
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
               x10.
                 lang.
                 region.
                 factory.
                 emptyRegion(
                 2))),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 48
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
            
//#line 49
x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 50
d0 =
              d0.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   x10.
                     lang.
                     region.
                     factory.
                     region(
                     (x10.
                       lang.
                       region)
                       ((d.
                           restriction(
                           p))).
                         region,
                     r),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 52
return d0;
    }
    
    
//#line 54
public void
                  validate(
                  final double gtotal) {
        
//#line 55
double dev =
          java.
            lang.
            Math.
            abs(
            gtotal -
              4.5185971433257635E-5);
        
//#line 56
if (dev >
                          1.0E-12) {
            
//#line 57
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Validation failed");
            
//#line 58
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("gtotal = " +
                                                                                                                             gtotal +
                                                                                                                             "  " +
                                                                                                                             dev);
            
//#line 59
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 62
public double
                  read(
                  final x10.
                    lang.
                    DoubleReferenceArray G,
                  final x10.
                    lang.
                    point pt) {
        
//#line 63
final x10.
          lang.
          region r =
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
              0));
        
//#line 64
final x10.
          lang.
          dist d =
          x10.
            lang.
            dist.
            factory.
            constant(
            r,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 65
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 66
final x10.
          lang.
          place phere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 67
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 68
/* template:Async { */(x10.lang.Runtime.asPlace(G.
                                                                          distribution.
                                                                          get(
                                                                          pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 69
final double val =
                  /* template:array_get { */((G).get(pt))/* } */;
                
//#line 70
/* template:Async { */(x10.lang.Runtime.asPlace(phere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 71
/* template:array_set { */(result).set(val,0)/* } */;
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
        
        
//#line 74
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 76
public double
                  SORrun(
                  final double omega,
                  final x10.
                    lang.
                    DoubleReferenceArray G,
                  final int num_iterations) {
        
//#line 77
final int M =
          G.
            distribution.
            region.
            rank(
            0).
            size();
        
//#line 78
final int N =
          G.
            distribution.
            region.
            rank(
            1).
            size();
        
//#line 79
final double omega_over_four =
          omega *
          0.25;
        
//#line 80
final double one_minus_omega =
          1.0 -
          omega;
        
//#line 81
final int Mm1 =
          M -
          1;
        
//#line 82
final int Nm1 =
          N -
          1;
        
//#line 83
/* template:forloop { */
        for (java.util.Iterator po__ = (x10.
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
                                            num_iterations -
                                              1),
                                          x10.
                                            lang.
                                            region.
                                            factory.
                                            region(
                                            0,
                                            1))).iterator(); po__.hasNext(); ) {
        	final  x10.
          lang.
          point po = (x10.
          lang.
          point) po__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 84
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 85
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
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
                                                    (((((Mm1 -
                                                           1)) -
                                                         ((1 +
                                                             /* template:array_get { */((po).get(1))/* } */)))) /
                                                       2)),
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    1,
                                                    Nm1 -
                                                      1))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 86
final x10.
                      lang.
                      point ij =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                                                                                          lang.
                                                                                                                                                                                          point.
                                                                                                                                                                                          factory.
                                                                                                                                                                                          point(
                                                                                                                                                                                          2,
                                                                                                                                                                                          1))))/* } */.add(x10.
                                                                                                                                                                                                             lang.
                                                                                                                                                                                                             point.
                                                                                                                                                                                                             factory.
                                                                                                                                                                                                             point(
                                                                                                                                                                                                             1 +
                                                                                                                                                                                                               /* template:array_get { */((po).get(1))/* } */,
                                                                                                                                                                                                             0));
                    
//#line 87
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 88
/* template:Async { */(x10.lang.Runtime.asPlace(G.
                                                                                      distribution.
                                                                                      get(
                                                                                      ij))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 89
/* template:array_set { */(G).set(omega_over_four *
                              ((read(
                                  G,
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ij))/* } */.add(x10.
                                                                                                                             lang.
                                                                                                                             point.
                                                                                                                             factory.
                                                                                                                             point(
                                                                                                                             -1,
                                                                                                                             0))) +
                                  read(
                                    G,
                                    /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ij))/* } */.add(x10.
                                                                                                                               lang.
                                                                                                                               point.
                                                                                                                               factory.
                                                                                                                               point(
                                                                                                                               1,
                                                                                                                               0))) +
                                  /* template:array_get { */((G).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ij))/* } */.add(x10.
                                                                                                                                                                lang.
                                                                                                                                                                point.
                                                                                                                                                                factory.
                                                                                                                                                                point(
                                                                                                                                                                0,
                                                                                                                                                                -1))))/* } */ +
                                  /* template:array_get { */((G).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ij))/* } */.add(x10.
                                                                                                                                                                lang.
                                                                                                                                                                point.
                                                                                                                                                                factory.
                                                                                                                                                                point(
                                                                                                                                                                0,
                                                                                                                                                                1))))/* } */)) +
                              one_minus_omega *
                              /* template:array_get { */((G).get(ij))/* } */,ij)/* } */;
                        }
                        		}
                        	});/* } */
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
                		});
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
            
        }/* } */
        }
        /* } */
        
        
//#line 93
return G.
                             sum();
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 98
private long
      seed;
    
//#line 99
final private static long
      multiplier =
      25214903917L;
    
//#line 100
final private static long
      addend =
      11L;
    
//#line 101
final private static long
      mask =
      ((1L <<
          48)) -
      1;
    
    
//#line 102
public Random(final long rseed) {
        
//#line 102
super();
        
//#line 103
setSeed(
                       rseed);
    }
    
    
//#line 105
public void
                   setSeed(
                   final long rseed) {
        
//#line 106
seed =
          ((rseed ^
              multiplier)) &
            mask;
    }
    
    
//#line 108
private int
                   nextbits(
                   final int bits) {
        
//#line 109
long oldseed =
          seed;
        
//#line 110
long nextseed =
          ((oldseed *
              multiplier +
              addend)) &
          mask;
        
//#line 111
seed =
          nextseed;
        
//#line 112
return (int)
                              ((nextseed >>>
                                  ((48 -
                                      bits))));
    }
    
    
//#line 114
public int
                   nextInt(
                   ) {
        
//#line 115
return nextbits(
                              32);
    }
    
    
//#line 117
public long
                   nextLong(
                   ) {
        
//#line 118
return (((long)
                                ((nextbits(
                                    32))) <<
                                32)) +
          nextbits(
            32);
    }
    
    
//#line 120
public boolean
                   nextBoolean(
                   ) {
        
//#line 121
return nextbits(
                              1) !=
          0;
    }
    
    
//#line 123
public double
                   nextDouble(
                   ) {
        
//#line 124
return (((((long)
                                  ((nextbits(
                                      26))) <<
                                  27)) +
                                nextbits(
                                  27))) /
          (double)
            ((1L <<
                53));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 129
final public static int
      max_counters =
      64;
    
//#line 130
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 131
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 132
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 133
public Timer() {
        
//#line 133
super();
        
//#line 134
final x10.
          lang.
          dist d =
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
                max_counters)),
            x10.
              lang.
              place.
              FIRST_PLACE);
        
//#line 135
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 136
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 138
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 139
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 141
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 142
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 145
public void
                   start(
                   final int n) {
        
//#line 146
/* template:array_set { */(start_time).set(java.
                                                                  lang.
                                                                  System.
                                                                  currentTimeMillis(),n)/* } */;
    }
    
    
//#line 148
public void
                   stop(
                   final int n) {
        
//#line 149
/* template:array_set { */(elapsed_time).set(java.
                                                                    lang.
                                                                    System.
                                                                    currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 150
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 151
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 153
public double
                   readTimer(
                   final int n) {
        
//#line 154
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 156
public void
                   resetTimer(
                   final int n) {
        
//#line 157
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 158
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 159
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 161
public void
                   resetAllTimers(
                   ) {
        
//#line 162
int i =
          0;
        
//#line 163
while (i <
                              max_counters) {
            
//#line 164
resetTimer(
                           i);
            
//#line 165
i++;
        }
    }
}
