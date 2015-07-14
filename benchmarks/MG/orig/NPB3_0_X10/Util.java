package NPB3_0_X10;

import x10.lang.*;

final public class Util
extends x10.
  lang.
  Object
{
    
//#line 19
final public static boolean
      PERF_OUTPUT =
      true;
    
//#line 20
final public static double
      CLOCK_SPEED =
      375;
    
//#line 21
final public static double
      FP_PERCLOCK =
      4;
    
//#line 22
final public static double
      COMM_LATENCY =
      1;
    
//#line 23
final public static double
      COMM_BANDWIDTH =
      2000;
    
//#line 24
final public static boolean
      IN_LOOP =
      false;
    
//#line 25
final public static boolean
      COMP_ONLY =
      false;
    
//#line 26
final public static boolean
      COMM_ONLY =
      false;
    
//#line 27
final public static int
      THREADS_PERFOREACH =
      1;
    
//#line 29
final public static boolean
      OVERLAP_COMMANDCOMP =
      false;
    
//#line 31
final public static boolean
      EXCHANGE_AFTER =
      false;
    
//#line 37
final public static int
      P2SLEVEL =
      1;
    
//#line 39
final public static int
      N_PLACES =
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 40
final public static x10.
      lang.
      dist
      ALLPLACES =
      x10.
        lang.
        dist.
        factory.
        unique();
    
//#line 42
final public static x10.
      lang.
      point[]
      DIFF1 =
      { x10.
          lang.
          point.
          factory.
          point(
          1,
          0,
          0),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      0,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      1,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      -1,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      0,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      0,
      -1) };
    
//#line 43
final public static x10.
      lang.
      point[]
      DIFF2 =
      { x10.
          lang.
          point.
          factory.
          point(
          1,
          1,
          0),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      -1,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      1,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      -1,
      0),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      0,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      0,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      0,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      0,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      1,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      1,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      -1,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      0,
      -1,
      -1) };
    
//#line 45
final public static x10.
      lang.
      point[]
      DIFF3 =
      { x10.
          lang.
          point.
          factory.
          point(
          1,
          1,
          1),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      1,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      -1,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      1,
      -1,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      1,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      1,
      -1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      -1,
      1),
    x10.
      lang.
      point.
      factory.
      point(
      -1,
      -1,
      -1) };
    
//#line 46
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
    
//#line 47
final public static x10.
      lang.
      GenericReferenceArray
      QREGIONS =
      /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(UNIT_CUBE.
                                                                                                                   toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
    	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
      lang.
      point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
        
//#line 47
final int a =
          /* template:array_get { */((p).get(0))/* } */;
        
//#line 47
final int b =
          /* template:array_get { */((p).get(1))/* } */;
        
//#line 47
final int c =
          /* template:array_get { */((p).get(2))/* } */;
        
//#line 47
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
    }/* } */,true,false,true)/* } */;
    
//#line 49
final public static int
      LOW =
      0;
    
//#line 49
final public static int
      HIGH =
      1;
    
    
//#line 51
public static boolean
                  powerOf2(
                  int a_int) {
        
//#line 52
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_int);
        
//#line 53
if (i ==
                          0) {
            
//#line 53
return false;
        } else {
            
//#line 55
if (i !=
                              ((pow2(
                                  log2(
                                    i))))) {
                
//#line 55
return false;
            }
        }
        
//#line 57
return true;
    }
    
    
//#line 59
public static int
                  log2(
                  int a_int) {
        
//#line 60
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
    
    
//#line 62
public static int
                  pow2(
                  int a_int) {
        
//#line 63
return (int)
                             java.
                               lang.
                               Math.
                               pow(
                               2,
                               a_int);
    }
    
    
//#line 65
public static x10.
                  lang.
                  region
                  boundary(
                  x10.
                    lang.
                    region a_R,
                  int a_direction) {
        
//#line 66
return boundary(
                             a_R,
                             a_direction,
                             x10.
                               lang.
                               point.
                               factory.
                               point(
                               0,
                               0,
                               0));
    }
    
    
//#line 69
public static x10.
                  lang.
                  region
                  boundary(
                  x10.
                    lang.
                    region a_R,
                  int a_direction,
                  x10.
                    lang.
                    point a_padSize) {
        
//#line 71
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_direction);
        
//#line 72
boolean IsHigh =
          (a_direction >
             0);
        
//#line 73
x10.
          lang.
          point low;
        
//#line 73
x10.
          lang.
          point high;
        
//#line 74
low =
          x10.
            lang.
            point.
            factory.
            point(
            a_R.
              rank(
              0).
              low(),
            a_R.
              rank(
              1).
              low(),
            a_R.
              rank(
              2).
              low());
        
//#line 75
high =
          x10.
            lang.
            point.
            factory.
            point(
            a_R.
              rank(
              0).
              high(),
            a_R.
              rank(
              1).
              high(),
            a_R.
              rank(
              2).
              high());
        
//#line 76
int r =
          a_R.
            rank;
        
//#line 77
if (i <=
                          r &&
                          r ==
                          3) {
            
//#line 78
if (IsHigh) {
                
//#line 79
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
                                           ? /* template:array_get { */((high).get(0))/* } */ +
                                           1
                                           : /* template:array_get { */((low).get(0))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(0))/* } */,
                                       ((i ==
                                           1
                                           ? /* template:array_get { */((high).get(0))/* } */ +
                                           1
                                           : /* template:array_get { */((high).get(0))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(0))/* } */),
                                     x10.
                                       lang.
                                       region.
                                       factory.
                                       region(
                                       ((i ==
                                           2
                                           ? /* template:array_get { */((high).get(1))/* } */ +
                                           1
                                           : /* template:array_get { */((low).get(1))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(1))/* } */,
                                       ((i ==
                                           2
                                           ? /* template:array_get { */((high).get(1))/* } */ +
                                           1
                                           : /* template:array_get { */((high).get(1))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(1))/* } */),
                                     x10.
                                       lang.
                                       region.
                                       factory.
                                       region(
                                       ((i ==
                                           3
                                           ? /* template:array_get { */((high).get(2))/* } */ +
                                           1
                                           : /* template:array_get { */((low).get(2))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(2))/* } */,
                                       ((i ==
                                           3
                                           ? /* template:array_get { */((high).get(2))/* } */ +
                                           1
                                           : /* template:array_get { */((high).get(2))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(2))/* } */));
            } else {
                
//#line 84
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
                                           ? /* template:array_get { */((low).get(0))/* } */ -
                                           1
                                           : /* template:array_get { */((low).get(0))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(0))/* } */,
                                       ((i ==
                                           1
                                           ? /* template:array_get { */((low).get(0))/* } */ -
                                           1
                                           : /* template:array_get { */((high).get(0))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(0))/* } */),
                                     x10.
                                       lang.
                                       region.
                                       factory.
                                       region(
                                       ((i ==
                                           2
                                           ? /* template:array_get { */((low).get(1))/* } */ -
                                           1
                                           : /* template:array_get { */((low).get(1))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(1))/* } */,
                                       ((i ==
                                           2
                                           ? /* template:array_get { */((low).get(1))/* } */ -
                                           1
                                           : /* template:array_get { */((high).get(1))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(1))/* } */),
                                     x10.
                                       lang.
                                       region.
                                       factory.
                                       region(
                                       ((i ==
                                           3
                                           ? /* template:array_get { */((low).get(2))/* } */ -
                                           1
                                           : /* template:array_get { */((low).get(2))/* } */)) -
                                         /* template:array_get { */((a_padSize).get(2))/* } */,
                                       ((i ==
                                           3
                                           ? /* template:array_get { */((low).get(2))/* } */ -
                                           1
                                           : /* template:array_get { */((high).get(2))/* } */)) +
                                         /* template:array_get { */((a_padSize).get(2))/* } */));
            }
        } else {
            
//#line 90
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("MG3TongValue1.boundary():Warning! invalid inputs!");
            
//#line 91
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
    
    
//#line 97
public static void
                  arraycopy(
                  final x10.
                    lang.
                    DoubleReferenceArray a_dest,
                  final x10.
                    lang.
                    DoubleReferenceArray a_src) {
        
//#line 98
final x10.
          lang.
          region R =
          (((x10.
              lang.
              region)
              a_src.
                region)).
            intersection(
            ((x10.
               lang.
               region)
               a_dest.
                 region));
        
//#line 100
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 100
/* template:forloop { */
            for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 101
/* template:array_set { */(a_dest).set((((x10.
                                                                        compilergenerated.
                                                                        BoxedDouble)
                                                                        (/* template:Future { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a_src.
                                                                                                                                                        distribution).get(p))/* } */)).runFuture(new x10.runtime.Future_c.Activity() {
                                                                           private x10.lang.Object x10_result_;
                                                                           public void runSource() {
                                                                              
                                                                              this.x10_result_ = (new x10.
                                                                           compilergenerated.
                                                                           BoxedDouble(
                                                                           /* template:array_get { */((a_src).get(p))/* } */));
                                                                           }
                                                                           public x10.lang.Object getResult() {
                                                                              return x10_result_;
                                                                           }
                                                                         })/* } */).
                                                                          force())).
                                                                      doubleValue(),p)/* } */;
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp83) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp83);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 105
public static void
                   arraycopy(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src) {
        
//#line 107
final x10.
          lang.
          region R =
          a_destR;
        
//#line 112
/* template:forloop { */
        for (java.util.Iterator p__ = (a_destR).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 112
/* template:array_set { */(a_dest).set(/* template:array_get { */((a_src).get(p))/* } */,p)/* } */;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 114
public static void
                   arraycopy(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src,
                   final x10.
                     lang.
                     point a_trans) {
        
//#line 116
final x10.
          lang.
          region R =
          a_destR;
        
//#line 125
/* template:forloop { */
        for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 125
/* template:array_set { */(a_dest).set(/* template:array_get { */((a_src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(a_trans)))/* } */,p)/* } */;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 129
public static void
                   ArrayCopy(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src) {
        
//#line 131
final x10.
          lang.
          region R =
          a_destR;
        
//#line 138
/* template:forloop { */
        for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 138
/* template:array_set { */(a_dest).set(/* template:array_get { */((a_src).get(p))/* } */,p)/* } */;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 141
public Util() {
        
//#line 141
super();
    }
    
    
//#line 143
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
      String[] a) {
    	if (x10.lang.Runtime.runtime == null) {
    		System.err.println("Please use the 'x10' script to invoke X10 programs, or see the generated");
    		System.err.println("Java code for alternate invocation instructions.");
    		System.exit(128);
    	}
    {
        
//#line 152
x10.
          lang.
          dist D =
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
            x10.
              lang.
              place.
              factory.
              place(
              0));
        
//#line 153
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 153
/* template:ateach { */
            {
            	x10.lang.dist __var34____distCopy = D; // make copy to avoid recomputation
            	for (java.util.Iterator __var34____ = __var34____distCopy.iterator();
            		 __var34____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var34__ = (x10.
              lang.
              point) __var34____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var34__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var34____distCopy.get(__var34__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var34__).get(0))/* } */;/* } */
{
                
//#line 154
x10.
                               lang.
                               perf.
                               addLocalOps(
                               1);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp84) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp84);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 156
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 156
/* template:ateach { */
            {
            	x10.lang.dist __var35____distCopy = D; // make copy to avoid recomputation
            	for (java.util.Iterator __var35____ = __var35____distCopy.iterator();
            		 __var35____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var35__ = (x10.
              lang.
              point) __var35____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var35__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var35____distCopy.get(__var35__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var35__).get(0))/* } */;/* } */
{
                
//#line 157
x10.
                               lang.
                               perf.
                               addLocalOps(
                               1);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp85) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp85);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 159
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("This is Util");
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
}
