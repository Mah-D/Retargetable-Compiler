import x10.lang.*;

public class SOR
extends x10.
  lang.
  Object
{
    
//#line 22
final private static int
      JACOBI_NUM_ITER =
      100;
    
//#line 23
final private static long
      RANDOM_SEED =
      10101010;
    
//#line 25
public Random
      R;
    
    
//#line 27
public SOR() {
        
//#line 27
super();
        
//#line 28
R =
          new Random(
            RANDOM_SEED);
    }
    
    
//#line 31
public void
                  run(
                  ) {
        
//#line 32
validate(
                      kernel());
    }
    
    
//#line 35
public double
                  kernel(
                  ) {
        
//#line 36
x10.
          lang.
          DoubleReferenceArray G =
          RandomMatrix(
            10,
            10,
            R);
        
//#line 37
return SORrun(
                             1.25,
                             G,
                             JACOBI_NUM_ITER);
    }
    
    
//#line 40
private x10.
                  lang.
                  DoubleReferenceArray
                  RandomMatrix(
                  final int M,
                  final int N,
                  final Random R) {
        
//#line 43
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
        
//#line 44
final x10.
          lang.
          DoubleReferenceArray t =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 45
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
            
//#line 46
write(
                          t,
                          p,
                          /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextDouble() *
                            1.0E-6);
        }/* } */
        }
        /* } */
        
        
//#line 48
return t;
    }
    
    
//#line 51
private void
                  write(
                  final x10.
                    lang.
                    DoubleReferenceArray t,
                  final x10.
                    lang.
                    point p,
                  final double v) {
        
//#line 52
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 52
/* template:Async { */(x10.lang.Runtime.asPlace(t.
                                                                          distribution.
                                                                          get(
                                                                          p))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 53
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
    
    
//#line 57
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
        
//#line 58
final x10.
          lang.
          dist d1 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 58
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 58
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
        
//#line 59
return distTimesRegion(
                             d1,
                             r2);
    }
    
    
//#line 62
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
        
//#line 63
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
                 
                 
//#line 63
public x10.
                               lang.
                               region
                               checkCast(
                               final x10.
                                 lang.
                                 region x10_generated_objToCast) {
                     
//#line 63
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
        
//#line 64
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
            
//#line 65
x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 66
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
        
        
//#line 68
return d0;
    }
    
    
//#line 71
public void
                  validate(
                  final double gtotal) {
        
//#line 72
double dev =
          java.
            lang.
            Math.
            abs(
            gtotal -
              4.5185971433257635E-5);
        
//#line 73
if (dev >
                          1.0E-12) {
            
//#line 74
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Validation failed");
            
//#line 75
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("gtotal = " +
                                                                                                                             gtotal +
                                                                                                                             "  " +
                                                                                                                             dev);
            
//#line 76
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 80
public double
                  read(
                  final x10.
                    lang.
                    DoubleReferenceArray G,
                  final x10.
                    lang.
                    point pt) {
        
//#line 82
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
        
//#line 83
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
        
//#line 84
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 85
final x10.
          lang.
          place phere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 86
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 86
/* template:Async { */(x10.lang.Runtime.asPlace(G.
                                                                          distribution.
                                                                          get(
                                                                          pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 87
final double val =
                  /* template:array_get { */((G).get(pt))/* } */;
                
//#line 88
/* template:Async { */(x10.lang.Runtime.asPlace(phere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 89
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
        
        
//#line 92
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 95
public double
                  SORrun(
                  final double omega,
                  final x10.
                    lang.
                    DoubleReferenceArray G,
                  final int num_iterations) {
        
//#line 98
final int M =
          G.
            distribution.
            region.
            rank(
            0).
            size();
        
//#line 99
final int N =
          G.
            distribution.
            region.
            rank(
            1).
            size();
        
//#line 101
final double omega_over_four =
          omega *
          0.25;
        
//#line 102
final double one_minus_omega =
          1.0 -
          omega;
        
//#line 106
final int Mm1 =
          M -
          1;
        
//#line 107
final int Nm1 =
          N -
          1;
        
//#line 109
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
            
//#line 110
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 110
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
                    
//#line 111
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
                    
//#line 112
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 112
/* template:Async { */(x10.lang.Runtime.asPlace(G.
                                                                                       distribution.
                                                                                       get(
                                                                                       ij))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 113
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
        
        
//#line 119
return G.
                              sum();
    }
}
