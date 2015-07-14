import x10.lang.*;

class Timer
extends x10.
  lang.
  Object
{
    
//#line 2
final public static int
      max_counters =
      64;
    
//#line 3
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 4
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 5
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 6
public Timer() {
        
//#line 6
super();
        
//#line 7
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
        
//#line 8
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 9
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 11
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 12
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 14
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 15
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 18
public void
                  start(
                  final int n) {
        
//#line 19
/* template:array_set { */(start_time).set(java.
                                                                 lang.
                                                                 System.
                                                                 currentTimeMillis(),n)/* } */;
    }
    
    
//#line 21
public void
                  stop(
                  final int n) {
        
//#line 22
/* template:array_set { */(elapsed_time).set(java.
                                                                   lang.
                                                                   System.
                                                                   currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 23
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 24
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 26
public double
                  readTimer(
                  final int n) {
        
//#line 27
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 29
public void
                  resetTimer(
                  final int n) {
        
//#line 30
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 31
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 32
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 34
public void
                  resetAllTimers(
                  ) {
        
//#line 35
int i =
          0;
        
//#line 36
while (i <
                             max_counters) {
            
//#line 37
resetTimer(
                          i);
            
//#line 38
i++;
        }
    }
}

public class NewStream
extends x10.
  lang.
  Object
{
    
    
//#line 44
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
            
//#line 46
Timer tmr =
              new Timer(
              );
            
//#line 47
int count =
              0;
            
//#line 48
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 49
/* template:place-check { */((Stream) x10.lang.Runtime.hereCheck(new Stream(
              )))/* } */.run();
            
//#line 50
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 51
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
    
    
    
//#line 43
public NewStream() {
        
//#line 43
super();
    }
}

class StreamData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 57
final public x10.
      lang.
      BooleanReferenceArray
      verified;
    
//#line 58
final public x10.
      lang.
      dist
      D;
    
//#line 59
final public x10.
      lang.
      DoubleReferenceArray
      times;
    
//#line 60
final public x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 61
final public x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 62
final public x10.
      lang.
      DoubleReferenceArray
      c;
    
    
//#line 63
public StreamData(final long N,
                                  final int NUM_TIMES) {
        
//#line 63
super();
        
//#line 64
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
        
//#line 65
verified =
          initVerified(
            dverified);
        
//#line 66
final x10.
          lang.
          dist temp_D =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 66
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 66
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
        
//#line 67
D =
          temp_D;
        
//#line 68
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
        
//#line 69
a =
          initArray(
            temp_D);
        
//#line 70
b =
          initArray(
            temp_D);
        
//#line 71
c =
          initArray(
            temp_D);
    }
    
    
//#line 73
public x10.
                  lang.
                  BooleanReferenceArray
                  initVerified(
                  final x10.
                    lang.
                    dist d) {
        
//#line 74
return (x10.
                             lang.
                             BooleanReferenceArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public boolean apply(/* Join: { */x10.
                                lang.
                                point p/* } */, boolean dummy) { {
                                  
//#line 75
return true;
                              } }
                              }/* } */,true,true,false)/* } */);
    }
    
    
//#line 78
public x10.
                  lang.
                  DoubleReferenceArray
                  initArray(
                  final x10.
                    lang.
                    dist d) {
        
//#line 79
return (x10.
                             lang.
                             DoubleReferenceArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public double apply(/* Join: { */x10.
                                lang.
                                point p/* } */, double dummy) { {
                                  
//#line 80
return 0.0;
                              } }
                              }/* } */,true,true,false)/* } */);
    }
}

class Stream
extends x10.
  lang.
  Object
{
    
//#line 86
final public static int
      MEG =
      50 *
      50;
    
//#line 87
final public static double
      alpha =
      3.0;
    
//#line 88
final public static int
      NUM_TIMES =
      10;
    
//#line 89
final public static long
      N0 =
      2 *
      MEG;
    
//#line 90
final public static long
      N =
      N0 *
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 91
final public static int
      LocalSize =
      (int)
        N0;
    
//#line 92
final public StreamData
      sd;
    
    
//#line 93
public Stream() {
        
//#line 93
super();
        
//#line 94
sd =
          new StreamData(
            N,
            NUM_TIMES);
    }
    
    
//#line 96
public void
                  run(
                  ) {
        
//#line 97
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("LocalSize=" +
                                                                                                                         LocalSize);
        
//#line 98
final StreamData tempSd =
          this.
            sd;
        
//#line 99
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 100
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
            
//#line 101
/* template:forloop { */
            for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
            	final  x10.
              lang.
              point p1 = (x10.
              lang.
              point) p1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 102
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 103
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
                        
//#line 104
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
                            
//#line 105
/* template:array_set { */(tempSd.
                                                                      b).set(1.5 *
                              (((/* template:here { */x10.lang.Runtime.here()/* } */).
                                  id *
                                  LocalSize +
                                  /* template:array_get { */((i).get(0))/* } */)),i)/* } */;
                            
//#line 106
/* template:array_set { */(tempSd.
                                                                      c).set(2.5 *
                              (((/* template:here { */x10.lang.Runtime.here()/* } */).
                                  id *
                                  LocalSize +
                                  /* template:array_get { */((i).get(0))/* } */)),i)/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 108
if (/* template:equalsequals { */x10.lang.Runtime.equalsequals(x10.
                                                                                                      lang.
                                                                                                      dist.
                                                                                                      UNIQUE.
                                                                                                      get(
                                                                                                      p6),x10.
                                                                                                            lang.
                                                                                                            place.
                                                                                                            FIRST_PLACE)/* } */) {
                            
//#line 109
/* template:array_set { */(tempSd.
                                                                      times).set(-mySecond(),p1)/* } */;
                        }
                        
//#line 110
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
                            
//#line 111
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
                
                
//#line 113
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 114
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
                        
//#line 115
if (/* template:equalsequals { */x10.lang.Runtime.equalsequals(x10.
                                                                                                      lang.
                                                                                                      dist.
                                                                                                      UNIQUE.
                                                                                                      get(
                                                                                                      p5),x10.
                                                                                                            lang.
                                                                                                            place.
                                                                                                            FIRST_PLACE)/* } */) {
                            
//#line 116
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
            
            
//#line 119
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 120
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
                    
//#line 121
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
                        
//#line 122
if (/* template:array_get { */((tempSd.
                                                                       a).get(p3))/* } */ !=
                                           /* template:array_get { */((tempSd.
                                                                         b).get(p3))/* } */ +
                                           alpha *
                                           /* template:array_get { */((tempSd.
                                                                         c).get(p3))/* } */) {
                            
//#line 123
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                           lang.
                                                                                           place.
                                                                                           FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 124
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
        
        
//#line 128
double mini =
          10000000L;
        
//#line 129
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
        
//#line 130
/* template:forloop { */
        for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
        	final  x10.
          lang.
          point p1 = (x10.
          lang.
          point) p1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 131
if (/* template:array_get { */((tempSd.
                                                           times).get(p1))/* } */ <
                               mini) {
                
//#line 132
mini =
                  /* template:array_get { */((tempSd.
                                                times).get(p1))/* } */;
            }
        }/* } */
        }
        /* } */
        
        
//#line 133
printStats(
                       N,
                       mini,
                       /* template:array_get { */((tempSd.
                                                     verified).get(0))/* } */);
    }
    
    
//#line 135
public static double
                   mySecond(
                   ) {
        
//#line 136
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
    
    
//#line 138
public static void
                   printStats(
                   final long N,
                   final double time,
                   final boolean verified) {
        
//#line 139
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Number of places=" +
                                                                                                                          x10.
                                                                                                                            lang.
                                                                                                                            place.
                                                                                                                            MAX_PLACES);
        
//#line 140
long size1 =
          (3 *
             8 *
             N /
             MEG);
        
//#line 141
double rate =
          ((3 *
              8 *
              N)) /
          ((1.0E9 *
              time));
        
//#line 142
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
        
//#line 143
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Min time: " +
                                                                                                                          time +
                                                                                                                          " rate=" +
                                                                                                                          rate +
                                                                                                                          " GB/s");
        
//#line 144
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Result is " +
                                                                                                                          ((verified
                                                                                                                              ? "verified."
                                                                                                                              : "NOT verified.")));
    }
}
