import x10.lang.*;

public class FragmentedStream
extends x10.
  lang.
  Object
{
    
//#line 8
final public static int
      MEG =
      1024 *
      1024;
    
//#line 9
final public static double
      alpha =
      3.0;
    
//#line 10
final public static int
      NUM_TIMES =
      10;
    
    
//#line 11
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
        
//#line 12
final boolean[] verified =
          new boolean[] { true };
        
//#line 13
final double[] times =
          new double[NUM_TIMES];
        
//#line 14
long N0 =
          2 *
          MEG;
        
//#line 15
if (args.
                          length >
                          0) {
            
//#line 15
N0 =
              java.
                lang.
                Long.
                parseLong(
                args[0]);
        }
        
//#line 16
final long N =
          N0 *
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 17
final int LocalSize =
          (int)
            N0;
        
//#line 18
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("LocalSize=" +
                                                                                                                         LocalSize);
        
//#line 19
final x10.
          lang.
          region RLocal =
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
              LocalSize -
                1));
        
//#line 20
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 20
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 21
final x10.
                  lang.
                  clock clk =
                  x10.
                    lang.
                    clock.
                    factory.
                    clock();
                
//#line 23
/* template:ateach { */
                {
                	x10.lang.dist __var0____distCopy = x10.
                                                      lang.
                                                      dist.
                                                      UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var0____ = __var0____distCopy.iterator();
                		 __var0____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var0__ = (x10.
                  lang.
                  point) __var0____.next();
                		/* Join: { */final int p =
                  /* template:array_get { */((__var0__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var0____distCopy.get(__var0__)).runAsync
                			(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int p =
                  /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                    
//#line 24
double[] a =
                      new double[LocalSize];
                    
//#line 24
double[] b =
                      new double[LocalSize];
                    
//#line 24
double[] c =
                      new double[LocalSize];
                    
//#line 25
/* template:forloop-mult { */{
                    x10.lang.region __var5__ = (x10.lang.region) RLocal;
                    if (__var5__.size() > 0 && (__var5__ instanceof x10.array.MultiDimRegion || __var5__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var6__ = __var5__.rank(0).low(), __var7__ = __var5__.rank(0).high(); __var6__ <= __var7__; __var6__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i = __var6__;
                    /* } */
                    /* } */
{
                        
//#line 26
b[i] =
                          1.5 *
                            ((p *
                                LocalSize +
                                i));
                        
//#line 27
c[i] =
                          2.5 *
                            ((p *
                                LocalSize +
                                i));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var1____ = (__var5__).iterator(); __var1____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var1__ = (x10.
                      lang.
                      point) __var1____.next();
                    	/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                        
//#line 26
b[i] =
                          1.5 *
                            ((p *
                                LocalSize +
                                i));
                        
//#line 27
c[i] =
                          2.5 *
                            ((p *
                                LocalSize +
                                i));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 29
for (
//#line 29
int j =
                                       0;
                                     j <
                                       NUM_TIMES;
                                     
//#line 29
j++) {
                        
//#line 30
if (p ==
                                          0) {
                            
//#line 30
times[j] =
                              -mySecond();
                        }
                        
//#line 31
/* template:forloop-mult { */{
                        x10.lang.region __var8__ = (x10.lang.region) RLocal;
                        if (__var8__.size() > 0 && (__var8__ instanceof x10.array.MultiDimRegion || __var8__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var9__ = __var8__.rank(0).low(), __var10__ = __var8__.rank(0).high(); __var9__ <= __var10__; __var9__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var9__;
                        /* } */
                        /* } */
{
                            
//#line 31
a[i] =
                              b[i] +
                                alpha *
                                c[i];
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var2____ = (__var8__).iterator(); __var2____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var2__ = (x10.
                          lang.
                          point) __var2____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                            
//#line 31
a[i] =
                              b[i] +
                                alpha *
                                c[i];
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 32
/* template:next { */
                        x10.lang.Runtime.getCurrentActivity().doNext();
                        /* } */
                        
                        
//#line 33
if (p ==
                                          0) {
                            
//#line 33
times[j] +=
                              mySecond();
                        }
                    }
                    
//#line 35
/* template:forloop-mult { */{
                    x10.lang.region __var11__ = (x10.lang.region) RLocal;
                    if (__var11__.size() > 0 && (__var11__ instanceof x10.array.MultiDimRegion || __var11__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var12__ = __var11__.rank(0).low(), __var13__ = __var11__.rank(0).high(); __var12__ <= __var13__; __var12__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i = __var12__;
                    /* } */
                    /* } */
{
                        
//#line 36
if (a[i] !=
                                          b[i] +
                                          alpha *
                                          c[i]) {
                            
//#line 37
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                          lang.
                                                                                          place.
                                                                                          FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                            		public void runX10Task() {
                            			{
                                
//#line 37
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
                    for (java.util.Iterator __var3____ = (__var11__).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 36
if (a[i] !=
                                          b[i] +
                                          alpha *
                                          c[i]) {
                            
//#line 37
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                          lang.
                                                                                          place.
                                                                                          FIRST_PLACE)).runAsync
                            	(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
                            		public void runX10Task() {
                            			{
                                
//#line 37
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
        	} catch (Throwable tmp4) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp4);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 40
double min =
          10000000L;
        
//#line 41
for (
//#line 41
int j =
                           0;
                         j <
                           NUM_TIMES;
                         
//#line 41
j++) {
            
//#line 41
if (times[j] <
                              min) {
                
//#line 41
min =
                  times[j];
            }
        }
        
//#line 42
printStats(
                      N,
                      min,
                      verified[0]);
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 44
public static double
                  mySecond(
                  ) {
        
//#line 45
return (double)
                             (((double)
                                 ((java.
                                     lang.
                                     System.
                                     nanoTime() /
                                     1000)) *
                                 1.0E-6));
    }
    
    
//#line 47
public static void
                  printStats(
                  long N,
                  double time,
                  boolean verified) {
        
//#line 48
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Number of places=" +
                                                                                                                         x10.
                                                                                                                           lang.
                                                                                                                           place.
                                                                                                                           MAX_PLACES);
        
//#line 49
long size =
          (3 *
             8 *
             N /
             MEG);
        
//#line 50
double rate =
          ((3 *
              8 *
              N)) /
          ((1.0E9 *
              time));
        
//#line 51
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
        
//#line 52
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Min time: " +
                                                                                                                         time +
                                                                                                                         " rate=" +
                                                                                                                         rate +
                                                                                                                         " GB/s");
        
//#line 53
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Result is " +
                                                                                                                         ((verified
                                                                                                                             ? "verified."
                                                                                                                             : "NOT verified.")));
    }
    
    
//#line 7
public FragmentedStream() {
        
//#line 7
super();
    }
}
