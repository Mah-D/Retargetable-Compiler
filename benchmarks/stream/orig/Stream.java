import x10.lang.*;

public class Stream
extends x10.
  lang.
  Object
{
    
//#line 3
final public static int
      MEG =
      1024 *
      1024;
    
//#line 3
final public static int
      NUM_TIMES =
      10;
    
//#line 4
final public static double
      alpha =
      3.0;
    
    
//#line 5
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
        
//#line 6
final boolean[] verified =
          new boolean[] { true };
        
//#line 7
long N0 =
          2 *
          MEG;
        
//#line 8
if (args.
                         length >
                         0) {
            
//#line 8
N0 =
              java.
                lang.
                Long.
                parseLong(
                args[0]);
        }
        
//#line 9
final long N =
          N0 *
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 10
final x10.
          lang.
          region R =
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
              (int)
                ((N -
                    1))));
        
//#line 11
final x10.
          lang.
          dist D =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 11
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 11
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
              R));
        
//#line 12
final double[] times =
          new double[NUM_TIMES];
        
//#line 14
final x10.
          lang.
          DoubleReferenceArray a =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 15
final x10.
          lang.
          DoubleReferenceArray b =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point __var0__/* } */, double dummy) { {
            
//#line 15
final int i =
              /* template:array_get { */((__var0__).get(0))/* } */;
            
//#line 15
return 1.5 *
              i;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 16
final x10.
          lang.
          DoubleReferenceArray c =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point __var1__/* } */, double dummy) { {
            
//#line 16
final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;
            
//#line 16
return 2.5 *
              i;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 17
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 17
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 18
final x10.
                  lang.
                  clock clk =
                  x10.
                    lang.
                    clock.
                    factory.
                    clock();
                
//#line 19
/* template:ateach { */
                {
                	x10.lang.dist __var2____distCopy = x10.
                                                      lang.
                                                      dist.
                                                      UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var2____ = __var2____distCopy.iterator();
                		 __var2____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var2__ = (x10.
                  lang.
                  point) __var2____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var2__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var2____distCopy.get(__var2__)).runAsync
                			(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                    
//#line 20
for (
//#line 20
int j =
                                       0;
                                     j <
                                       NUM_TIMES;
                                     
//#line 20
j++) {
                        
//#line 21
if (i ==
                                          0) {
                            
//#line 21
times[j] =
                              -mySecond();
                        }
                        
//#line 22
/* template:forloop-mult { */{
                        x10.lang.region __var6__ = (x10.lang.region) D.
                                                                       restriction(
                                                                       /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                       region;
                        if (__var6__.size() > 0 && (__var6__ instanceof x10.array.MultiDimRegion || __var6__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var7__ = __var6__.rank(0).low(), __var8__ = __var6__.rank(0).high(); __var7__ <= __var8__; __var7__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int p = __var7__;
                        /* } */
                        /* } */
{
                            
//#line 22
/* template:array_set { */(a).set(/* template:array_get { */((b).get(p))/* } */ +
                              alpha *
                              /* template:array_get { */((c).get(p))/* } */,p)/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var3____ = (__var6__).iterator(); __var3____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var3__ = (x10.
                          lang.
                          point) __var3____.next();
                        	/* Join: { *//* Join: { */final int p =
                          /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                            
//#line 22
/* template:array_set { */(a).set(/* template:array_get { */((b).get(p))/* } */ +
                              alpha *
                              /* template:array_get { */((c).get(p))/* } */,p)/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 23
/* template:next { */
                        x10.lang.Runtime.getCurrentActivity().doNext();
                        /* } */
                        
                        
//#line 24
if (i ==
                                          0) {
                            
//#line 24
times[j] +=
                              mySecond();
                        }
                    }
                    
//#line 26
/* template:forloop-mult { */{
                    x10.lang.region __var9__ = (x10.lang.region) D.
                                                                   restriction(
                                                                   /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                   region;
                    if (__var9__.size() > 0 && (__var9__ instanceof x10.array.MultiDimRegion || __var9__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var10__ = __var9__.rank(0).low(), __var11__ = __var9__.rank(0).high(); __var10__ <= __var11__; __var10__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var10__;
                    /* } */
                    /* } */
{
                        
//#line 27
if (/* template:array_get { */((a).get(p))/* } */ !=
                                          /* template:array_get { */((b).get(p))/* } */ +
                                          alpha *
                                          /* template:array_get { */((c).get(p))/* } */) {
                            
//#line 28
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                          lang.
                                                                                          place.
                                                                                          FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                            		public void runX10Task() {
                            			{
                                
//#line 28
verified[0] =
                                  false;
                            }
                            		}
                            	});/* } */
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var9__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 27
if (/* template:array_get { */((a).get(p))/* } */ !=
                                          /* template:array_get { */((b).get(p))/* } */ +
                                          alpha *
                                          /* template:array_get { */((c).get(p))/* } */) {
                            
//#line 28
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                          lang.
                                                                                          place.
                                                                                          FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                            		public void runX10Task() {
                            			{
                                
//#line 28
verified[0] =
                                  false;
                            }
                            		}
                            	});/* } */
                        }
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
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
        
        
//#line 31
double min =
          10000000L;
        
//#line 32
for (
//#line 32
int j =
                           0;
                         j <
                           NUM_TIMES;
                         
//#line 32
j++) {
            
//#line 32
if (times[j] <
                              min) {
                
//#line 32
min =
                  times[j];
            }
        }
        
//#line 33
printStats(
                      N,
                      min,
                      verified[0]);
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 35
public static double
                  mySecond(
                  ) {
        
//#line 36
return (double)
                             (((double)
                                 ((java.
                                     lang.
                                     System.
                                     nanoTime() /
                                     1000)) *
                                 1.0E-6));
    }
    
    
//#line 38
public static void
                  printStats(
                  long N,
                  double time,
                  boolean verified) {
        
//#line 39
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Number of places=" +
                                                                                                                         x10.
                                                                                                                           lang.
                                                                                                                           place.
                                                                                                                           MAX_PLACES);
        
//#line 40
long size =
          (3 *
             8 *
             N /
             MEG);
        
//#line 41
double rate =
          ((3 *
              8 *
              N)) /
          ((1.0E9 *
              time));
        
//#line 42
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Size of arrays: " +
                                                                                                                         size +
                                                                                                                         " MB (total)" +
                                                                                                                         size /
                                                                                                                           x10.
                                                                                                                             lang.
                                                                                                                             place.
                                                                                                                             MAX_PLACES +
                                                                                                                         " MB (per place)");
        
//#line 43
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Min time: " +
                                                                                                                         time +
                                                                                                                         " rate=" +
                                                                                                                         rate +
                                                                                                                         " GB/s");
        
//#line 44
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Result is " +
                                                                                                                         ((verified
                                                                                                                             ? "verified."
                                                                                                                             : "NOT verified.")));
    }
    
    
//#line 2
public Stream() {
        
//#line 2
super();
    }
}
