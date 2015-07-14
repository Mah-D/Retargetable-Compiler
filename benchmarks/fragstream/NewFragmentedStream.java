import x10.lang.*;

public class NewFragmentedStream
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
/* template:place-check { */((FragmentedStream) x10.lang.Runtime.hereCheck(new FragmentedStream(
              )))/* } */.run();
            
//#line 8
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 9
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                       lang.
                                                                                                       System.
                                                                                                       out))/* } */.println("Wall-clock time for stream: " +
                                                                                                                            /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                            " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public NewFragmentedStream() {
        
//#line 1
super();
    }
}

class FragmentedStreamData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 16
final public x10.
      lang.
      BooleanReferenceArray
      verified;
    
//#line 17
final public x10.
      lang.
      dist
      D;
    
//#line 18
final public x10.
      lang.
      DoubleReferenceArray
      times;
    
//#line 19
final public x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 20
final public x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 21
final public x10.
      lang.
      DoubleReferenceArray
      c;
    
    
//#line 23
public FragmentedStreamData(final long N,
                                            final int NUM_TIMES) {
        
//#line 24
super();
        
//#line 25
final x10.
          lang.
          dist dverified =
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
        
//#line 26
verified =
          initVerified(
            dverified);
        
//#line 27
final x10.
          lang.
          dist tempD =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 27
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 27
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
                        1))))));
        
//#line 28
D =
          tempD;
        
//#line 29
times =
          initArray(
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
                  (int)
                    ((NUM_TIMES -
                        1)))),
              /* template:here { */x10.lang.Runtime.here()/* } */));
        
//#line 30
a =
          initArray(
            tempD);
        
//#line 31
b =
          initArray(
            tempD);
        
//#line 32
c =
          initArray(
            tempD);
    }
    
    
//#line 35
public x10.
                  lang.
                  BooleanReferenceArray
                  initVerified(
                  final x10.
                    lang.
                    dist d) {
        
//#line 37
return (x10.
                             lang.
                             BooleanReferenceArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public boolean apply(/* Join: { */x10.
                                lang.
                                point p/* } */, boolean dummy) { {
                                  
//#line 37
return true;
                              } }
                              }/* } */,true,true,false)/* } */);
    }
    
    
//#line 40
public x10.
                  lang.
                  DoubleReferenceArray
                  initArray(
                  final x10.
                    lang.
                    dist d) {
        
//#line 42
return (x10.
                             lang.
                             DoubleReferenceArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public double apply(/* Join: { */x10.
                                lang.
                                point p/* } */, double dummy) { {
                                  
//#line 42
return 0.0;
                              } }
                              }/* } */,true,true,false)/* } */);
    }
}

class FragmentedStream
extends x10.
  lang.
  Object
{
    
//#line 48
final public static int
      MEG =
      50 *
      50;
    
//#line 49
final public static double
      alpha =
      3.0;
    
//#line 50
final public static int
      NUM_TIMES =
      10;
    
//#line 51
final public static long
      N0 =
      2 *
      MEG;
    
//#line 52
final public static long
      N =
      N0 *
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 53
final public static int
      LocalSize =
      (int)
        N0;
    
//#line 55
final public FragmentedStreamData
      sd;
    
    
//#line 57
public FragmentedStream() {
        
//#line 58
super();
        
//#line 59
sd =
          new FragmentedStreamData(
            N,
            NUM_TIMES);
    }
    
    
//#line 63
public void
                  run(
                  ) {
        
//#line 64
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("LocalSize=" +
                                                                                                                         LocalSize);
        
//#line 66
final FragmentedStreamData tempSd =
          this.
            sd;
        
//#line 67
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 68
x10.
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
                  (int)
                    ((NUM_TIMES -
                        1))));
            
//#line 69
/* template:forloop { */
            for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
            	final  x10.
              lang.
              point p1 = (x10.
              lang.
              point) p1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 70
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 70
/* template:ateach { */
                    {
                    	x10.lang.dist p6__distCopy = x10.
                                                    lang.
                                                    dist.
                                                    UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator p6__ = p6__distCopy.iterator();
                    		 p6__.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point p6 = (x10.
                      lang.
                      point) p6__.next();
                    		/* Join: { *//* } */
                    		((x10.runtime.Place) p6__distCopy.get(p6)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { *//* } */
{
                        
//#line 71
/* template:forloop { */
                        for (java.util.Iterator i__ = (((tempSd.
                                                           D)).
                                                         restriction(
                                                         /* template:here { */x10.lang.Runtime.here()/* } */).
                                                         region).iterator(); i__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point i = (x10.
                          lang.
                          point) i__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 72
/* template:array_set { */(tempSd.
                                                                     b).set(1.5 *
                              (((/* template:here { */x10.lang.Runtime.here()/* } */).
                                  id *
                                  LocalSize +
                                  /* template:array_get { */((i).get(0))/* } */)),i)/* } */;
                            
//#line 73
/* template:array_set { */(tempSd.
                                                                     c).set(2.5 *
                              (((/* template:here { */x10.lang.Runtime.here()/* } */).
                                  id *
                                  LocalSize +
                                  /* template:array_get { */((i).get(0))/* } */)),i)/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 75
if (/* template:equalsequals { */x10.lang.Runtime.equalsequals(x10.
                                                                                                     lang.
                                                                                                     dist.
                                                                                                     UNIQUE.
                                                                                                     get(
                                                                                                     p6),x10.
                                                                                                           lang.
                                                                                                           place.
                                                                                                           FIRST_PLACE)/* } */) {
                            
//#line 75
/* template:array_set { */(tempSd.
                                                                     times).set(-mySecond(),p1)/* } */;
                        }
                        
//#line 76
/* template:forloop { */
                        for (java.util.Iterator p4__ = (((tempSd.
                                                            D)).
                                                          restriction(
                                                          /* template:here { */x10.lang.Runtime.here()/* } */).
                                                          region).iterator(); p4__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point p4 = (x10.
                          lang.
                          point) p4__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 76
/* template:array_set { */(tempSd.
                                                                     a).set(/* template:array_get { */((tempSd.
                                                                                                          b).get(p4))/* } */ +
                              alpha *
                              /* template:array_get { */((tempSd.
                                                            c).get(p4))/* } */,p4)/* } */;
                        }/* } */
                        }
                        /* } */
                        
                    }/* } */
                    				}
                    			});
                    	}
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp1) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 78
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 78
/* template:ateach { */
                    {
                    	x10.lang.dist p5__distCopy = x10.
                                                    lang.
                                                    dist.
                                                    UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator p5__ = p5__distCopy.iterator();
                    		 p5__.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point p5 = (x10.
                      lang.
                      point) p5__.next();
                    		/* Join: { *//* } */
                    		((x10.runtime.Place) p5__distCopy.get(p5)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { *//* } */
{
                        
//#line 79
if (/* template:equalsequals { */x10.lang.Runtime.equalsequals(x10.
                                                                                                     lang.
                                                                                                     dist.
                                                                                                     UNIQUE.
                                                                                                     get(
                                                                                                     p5),x10.
                                                                                                           lang.
                                                                                                           place.
                                                                                                           FIRST_PLACE)/* } */) {
                            
//#line 79
/* template:array_set { */(tempSd.
                                                                     times).set(/* template:array_get { */((tempSd.
                                                                                                              times).get(p1))/* } */ +
                              mySecond(),p1)/* } */;
                        }
                    }/* } */
                    				}
                    			});
                    	}
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
            
            
//#line 82
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 82
/* template:ateach { */
                {
                	x10.lang.dist p2__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator p2__ = p2__distCopy.iterator();
                		 p2__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point p2 = (x10.
                  lang.
                  point) p2__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) p2__distCopy.get(p2)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 83
/* template:forloop { */
                    for (java.util.Iterator p3__ = (((tempSd.
                                                        D)).
                                                      restriction(
                                                      /* template:here { */x10.lang.Runtime.here()/* } */).
                                                      region).iterator(); p3__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p3 = (x10.
                      lang.
                      point) p3__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 84
if (/* template:array_get { */((tempSd.
                                                                      a).get(p3))/* } */ !=
                                          /* template:array_get { */((tempSd.
                                                                        b).get(p3))/* } */ +
                                          alpha *
                                          /* template:array_get { */((tempSd.
                                                                        c).get(p3))/* } */) {
                            
//#line 85
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                          lang.
                                                                                          place.
                                                                                          FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 85
/* template:array_set { */(tempSd.
                                                                         verified).set(false,0)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
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
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 89
double mini =
          10000000L;
        
//#line 90
x10.
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
              (int)
                ((NUM_TIMES -
                    1))));
        
//#line 91
/* template:forloop { */
        for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
        	final  x10.
          lang.
          point p1 = (x10.
          lang.
          point) p1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 92
if (/* template:array_get { */((tempSd.
                                                          times).get(p1))/* } */ <
                              mini) {
                
//#line 92
mini =
                  /* template:array_get { */((tempSd.
                                                times).get(p1))/* } */;
            }
        }/* } */
        }
        /* } */
        
        
//#line 93
printStats(
                      N,
                      mini,
                      /* template:array_get { */((tempSd.
                                                    verified).get(0))/* } */);
    }
    
    
//#line 96
public static double
                  mySecond(
                  ) {
        
//#line 97
return (double)
                             (((double)
                                 ((java.
                                     lang.
                                     System.
                                     currentTimeMillis() *
                                     1000000.0 /
                                     1000)) *
                                 1.0E-6));
    }
    
    
//#line 100
public static void
                   printStats(
                   final long N,
                   final double time,
                   final boolean verified) {
        
//#line 101
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Number of places=" +
                                                                                                                          x10.
                                                                                                                            lang.
                                                                                                                            place.
                                                                                                                            MAX_PLACES);
        
//#line 102
long size1 =
          (3 *
             8 *
             N /
             MEG);
        
//#line 103
double rate =
          ((3 *
              8 *
              N)) /
          ((1.0E9 *
              time));
        
//#line 104
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Size of arrays: " +
                                                                                                                          size1 +
                                                                                                                          " MB (total)" +
                                                                                                                          size1 /
                                                                                                                            x10.
                                                                                                                              lang.
                                                                                                                              place.
                                                                                                                              MAX_PLACES +
                                                                                                                          " MB (per place)");
        
//#line 105
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Min time: " +
                                                                                                                          time +
                                                                                                                          " rate=" +
                                                                                                                          rate +
                                                                                                                          " GB/s");
        
//#line 106
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Result is " +
                                                                                                                          ((verified
                                                                                                                              ? "verified."
                                                                                                                              : "NOT verified.")));
    }
}
