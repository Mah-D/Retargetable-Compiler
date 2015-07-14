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

public class MapReduce
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
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(new MR(
              )))/* } */.run();
            
//#line 50
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 51
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Wall-clock time for mapreduce: " +
                                                                                                                             /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                             " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 43
public MapReduce() {
        
//#line 43
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 57
final public static x10.
      lang.
      region
      r =
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
          300000));
    
//#line 58
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 59
public int
      total;
    
    
//#line 60
public MR() {
        
//#line 60
super();
        
//#line 61
final x10.
          lang.
          dist d =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 61
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 61
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
              r));
        
//#line 62
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public int apply(/* Join: { */x10.
             lang.
             point p/* } */, int dummy) { {
               
//#line 63
return /* template:array_get { */((p).get(0))/* } */;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 65
total =
          0;
    }
    
    
//#line 67
public void
                  run(
                  ) {
        
//#line 68
map();
        
//#line 69
reduce();
        
//#line 70
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(total);
    }
    
    
//#line 72
public void
                  map(
                  ) {
        
//#line 73
final x10.
          lang.
          IntReferenceArray b =
          a;
        
//#line 74
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 75
/* template:ateach { */
            {
            	x10.lang.dist p__distCopy = b.
                                           distribution; // make copy to avoid recomputation
            	for (java.util.Iterator p__ = p__distCopy.iterator();
            		 p__.hasNext(); )
            	{
            		final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) p__distCopy.get(p)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 76
/* template:array_set { */(b).set(f(
                                                                /* template:array_get { */((b).get(p))/* } */),p)/* } */;
            }/* } */
            				}
            			});
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
        
    }
    
    
//#line 79
public int
                  f(
                  final int x) {
        
//#line 80
return x *
          x;
    }
    
    
//#line 82
public void
                  reduce(
                  ) {
        
//#line 83
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 84
final x10.
          lang.
          region reg =
          a.
            region;
        
//#line 85
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            reg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 86
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 87
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
            
//#line 88
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 89
final x10.
                  lang.
                  IntReferenceArray c =
                  a;
                
//#line 90
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                              distribution.
                                                                              get(
                                                                              p))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 91
final int v =
                      /* template:array_get { */((c).get(p))/* } */;
                    
//#line 92
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 93
/* template:array_set { */(result).set(v,p)/* } */;
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
            
        }/* } */
        }
        /* } */
        
        
//#line 98
/* template:forloop { */
        for (java.util.Iterator p__ = (result.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 99
total =
              total +
                /* template:array_get { */((result).get(p))/* } */;
        }/* } */
        }
        /* } */
        
    }
}
