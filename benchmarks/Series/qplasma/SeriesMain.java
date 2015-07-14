import x10.lang.*;

public class SeriesMain
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
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(new Series(
              )))/* } */.run();
            
//#line 8
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 9
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                       lang.
                                                                                                       System.
                                                                                                       out))/* } */.println("Wall-clock time for series: " +
                                                                                                                            /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                            " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public SeriesMain() {
        
//#line 1
super();
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 15
final public static int
      max_counters =
      64;
    
//#line 16
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 17
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 18
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 19
public Timer() {
        
//#line 19
super();
        
//#line 20
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
        
//#line 21
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 22
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 24
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 25
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 27
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 28
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 31
public void
                  start(
                  final int n) {
        
//#line 32
/* template:array_set { */(start_time).set(java.
                                                                 lang.
                                                                 System.
                                                                 currentTimeMillis(),n)/* } */;
    }
    
    
//#line 34
public void
                  stop(
                  final int n) {
        
//#line 35
/* template:array_set { */(elapsed_time).set(java.
                                                                   lang.
                                                                   System.
                                                                   currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 36
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 37
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 39
public double
                  readTimer(
                  final int n) {
        
//#line 40
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 42
public void
                  resetTimer(
                  final int n) {
        
//#line 43
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 44
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 45
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 47
public void
                  resetAllTimers(
                  ) {
        
//#line 48
int i =
          0;
        
//#line 49
while (i <
                             max_counters) {
            
//#line 50
resetTimer(
                          i);
            
//#line 51
i++;
        }
    }
}

class Series
extends x10.
  lang.
  Object
{
    
//#line 57
private int
      setsize;
    
//#line 58
public int
      array_rows;
    
//#line 59
public x10.
      lang.
      DoubleReferenceArray
      testArray;
    
    
//#line 60
public void
                  setSize(
                  final int setsize) {
        
//#line 61
this.
                      setsize =
          setsize;
    }
    
    
//#line 63
public void
                  initialise(
                  final int n) {
        
//#line 64
array_rows =
          n;
        
//#line 65
buildTestData();
    }
    
    
//#line 67
public void
                  kernel(
                  ) {
        
//#line 68
Do();
    }
    
    
//#line 70
public void
                  initRefArray(
                  final x10.
                    lang.
                    DoubleReferenceArray ref) {
        
//#line 71
/* template:array_set { */(ref).set(2.8729524964837996,/* Join: { */0,0/* } */)/* } */;
        
//#line 72
/* template:array_set { */(ref).set(0.0,/* Join: { */0,1/* } */)/* } */;
        
//#line 73
/* template:array_set { */(ref).set(1.1161046676147888,/* Join: { */1,0/* } */)/* } */;
        
//#line 74
/* template:array_set { */(ref).set(-1.8819691893398025,/* Join: { */1,1/* } */)/* } */;
        
//#line 75
/* template:array_set { */(ref).set(0.34429060398168704,/* Join: { */2,0/* } */)/* } */;
        
//#line 76
/* template:array_set { */(ref).set(-1.1645642623320958,/* Join: { */2,1/* } */)/* } */;
        
//#line 77
/* template:array_set { */(ref).set(0.15238898702519288,/* Join: { */3,0/* } */)/* } */;
        
//#line 78
/* template:array_set { */(ref).set(-0.8143461113044298,/* Join: { */3,1/* } */)/* } */;
    }
    
    
//#line 80
public void
                  validate(
                  ) {
        
//#line 81
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
              3),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              1));
        
//#line 82
final x10.
          lang.
          dist vd =
          x10.
            lang.
            dist.
            factory.
            constant(
            r,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 83
final x10.
          lang.
          DoubleReferenceArray ref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 84
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 86
initRefArray(
                      ref);
        
//#line 87
/* template:forloop-mult { */{
        x10.lang.region __var1__ = (x10.lang.region) vd.
                                                       region;
        if (__var1__.size() > 0 && (__var1__ instanceof x10.array.MultiDimRegion || __var1__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var2__ = __var1__.rank(0).low(), __var3__ = __var1__.rank(0).high(); __var2__ <= __var3__; __var2__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var4__ = __var1__.rank(1).low(), __var5__ = __var1__.rank(1).high(); __var4__ <= __var5__; __var4__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var2__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var4__;
        /* } */
        /* } */
{
            
//#line 88
final int ii =
              i;
            
//#line 89
final int jj =
              j;
            
//#line 90
double cval =
              0;
            
//#line 91
final x10.
              lang.
              place curr_place =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 92
final x10.
              lang.
              region tempr =
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
            
//#line 93
final x10.
              lang.
              dist tempvd =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 94
final x10.
              lang.
              DoubleReferenceArray tempref =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public double apply(/* Join: { */x10.
              lang.
              point p0/* } */, double dummy) { {
                
//#line 95
return 0.0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 97
final x10.
              lang.
              DoubleReferenceArray tA =
              testArray;
            
//#line 98
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 99
/* template:Async { */(x10.lang.Runtime.asPlace(testArray.
                                                                              distribution.
                                                                              get(
                                                                              j,
                                                                              i))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 100
final double temp =
                      /* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */;
                    
//#line 101
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 102
/* template:array_set { */(tempref).set(temp,0)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp6) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 105
cval =
              /* template:array_get { */((tempref).get(0))/* } */;
            
//#line 106
double error =
              java.
                lang.
                Math.
                abs(
                cval -
                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 107
if (error >
                               1.0E-12) {
                
//#line 108
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Validation failed for coefficient " +
                                                                                                                                  j +
                                                                                                                                  "," +
                                                                                                                                  i);
                
//#line 109
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Computed value = " +
                                                                                                                                  cval);
                
//#line 110
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Reference value = " +
                                                                                                                                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 111
throw new java.
                  lang.
                  RuntimeException(
                  "Validation failed");
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var1__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int j =
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 88
final int ii =
              i;
            
//#line 89
final int jj =
              j;
            
//#line 90
double cval =
              0;
            
//#line 91
final x10.
              lang.
              place curr_place =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 92
final x10.
              lang.
              region tempr =
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
            
//#line 93
final x10.
              lang.
              dist tempvd =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 94
final x10.
              lang.
              DoubleReferenceArray tempref =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public double apply(/* Join: { */x10.
              lang.
              point p0/* } */, double dummy) { {
                
//#line 95
return 0.0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 97
final x10.
              lang.
              DoubleReferenceArray tA =
              testArray;
            
//#line 98
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 99
/* template:Async { */(x10.lang.Runtime.asPlace(testArray.
                                                                              distribution.
                                                                              get(
                                                                              j,
                                                                              i))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 100
final double temp =
                      /* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */;
                    
//#line 101
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 102
/* template:array_set { */(tempref).set(temp,0)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp7) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 105
cval =
              /* template:array_get { */((tempref).get(0))/* } */;
            
//#line 106
double error =
              java.
                lang.
                Math.
                abs(
                cval -
                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 107
if (error >
                               1.0E-12) {
                
//#line 108
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Validation failed for coefficient " +
                                                                                                                                  j +
                                                                                                                                  "," +
                                                                                                                                  i);
                
//#line 109
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Computed value = " +
                                                                                                                                  cval);
                
//#line 110
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Reference value = " +
                                                                                                                                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 111
throw new java.
                  lang.
                  RuntimeException(
                  "Validation failed");
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 115
public void
                   tidyup(
                   ) {
        
//#line 116
freeTestData();
    }
    
    
//#line 118
public void
                   run(
                   ) {
        
//#line 119
final x10.
          lang.
          region tempregion =
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
        
//#line 120
final x10.
          lang.
          dist tempdist =
          x10.
            lang.
            dist.
            factory.
            constant(
            tempregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 121
int j =
          10000;
        
//#line 122
/* template:forloop { */
        for (java.util.Iterator i__ = (tempdist.
                                         region).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 123
setSize(
                           0);
            
//#line 124
initialise(
                           (int)
                             ((j *
                                 java.
                                   lang.
                                   Math.
                                   pow(
                                   100,
                                   0))));
            
//#line 125
kernel();
            
//#line 126
validate();
        }/* } */
        }
        /* } */
        
        
//#line 128
tidyup();
    }
    
    
//#line 130
public Series() {
        
//#line 130
super();
    }
    
    
//#line 132
public void
                   buildTestData(
                   ) {
        
//#line 133
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
              1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              array_rows -
                1));
        
//#line 134
final x10.
          lang.
          dist d =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 134
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 134
return (((((((x10.
                                              lang.
                                              dist)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            2)))
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
        
//#line 135
testArray =
          (x10.
            lang.
            DoubleReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
    }
    
    
//#line 137
public void
                   Do(
                   ) {
        
//#line 138
/* template:array_set { */(testArray).set(TrapezoidIntegrate(
                                                                 (double)
                                                                   0.0,
                                                                 (double)
                                                                   2.0,
                                                                 1000,
                                                                 (double)
                                                                   0.0,
                                                                 0) /
          (double)
            2.0,/* Join: { */0,0/* } */)/* } */;
        
//#line 139
final double omega =
          (double)
            3.141592653589793;
        
//#line 140
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 141
final x10.
          lang.
          DoubleReferenceArray tA =
          testArray;
        
//#line 142
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 143
/* template:ateach { */
            {
            	x10.lang.dist p__distCopy = U; // make copy to avoid recomputation
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
                
//#line 144
int ilow =
                  0;
                
//#line 145
if (U.
                                   get(
                                   p).
                                   isFirst()) {
                    
//#line 146
ilow =
                      1;
                } else {
                    
//#line 149
ilow =
                      0;
                }
                
//#line 151
/* template:forloop { */
                for (java.util.Iterator pp__ = (tA.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 152
if (/* template:array_get { */((pp).get(1))/* } */ >=
                                       ilow) {
                        
//#line 153
if (/* template:array_get { */((pp).get(0))/* } */ ==
                                           0) {
                            
//#line 154
/* template:array_set { */(tA).set(TrapezoidIntegrate(
                                                                              (double)
                                                                                0.0,
                                                                              (double)
                                                                                2.0,
                                                                              1000,
                                                                              omega *
                                                                                (double)
                                                                                  /* template:array_get { */((pp).get(1))/* } */,
                                                                              1),pp)/* } */;
                        } else {
                            
//#line 157
/* template:array_set { */(tA).set(TrapezoidIntegrate(
                                                                              (double)
                                                                                0.0,
                                                                              (double)
                                                                                2.0,
                                                                              1000,
                                                                              omega *
                                                                                (double)
                                                                                  /* template:array_get { */((pp).get(1))/* } */,
                                                                              2),pp)/* } */;
                        }
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
        	} catch (Throwable tmp8) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp8);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 164
private double
                   TrapezoidIntegrate(
                   final double x0,
                   final double x1,
                   final int a_nsteps,
                   final double omegan,
                   final int select) {
        
//#line 165
double x =
          0.0;
        
//#line 166
double dx =
          0.0;
        
//#line 167
double rvalue =
          0.0;
        
//#line 168
int nsteps =
          a_nsteps;
        
//#line 169
x =
          x0;
        
//#line 170
dx =
          ((x1 -
              x0)) /
            (double)
              nsteps;
        
//#line 171
rvalue =
          thefunction(
            x0,
            omegan,
            select) /
            (double)
              2.0;
        
//#line 172
if (nsteps !=
                           1) {
            
//#line 173
nsteps--;
            
//#line 174
nsteps--;
            
//#line 175
while (nsteps >
                                  0) {
                
//#line 176
x =
                  x +
                    dx;
                
//#line 177
rvalue =
                  rvalue +
                    thefunction(
                      x,
                      omegan,
                      select);
                
//#line 178
nsteps--;
            }
        }
        
//#line 181
rvalue =
          ((rvalue +
              thefunction(
                x1,
                omegan,
                select) /
              (double)
                2.0)) *
            dx;
        
//#line 182
return (rvalue);
    }
    
    
//#line 184
private double
                   thefunction(
                   final double x,
                   final double omegan,
                   final int select) {
        
//#line 185
switch (select) {
            
//#line 186
case 0:
                
//#line 187
return (java.
                                       lang.
                                       Math.
                                       pow(
                                       x +
                                         (double)
                                           1.0,
                                       x));
            
//#line 189
case 1:
                
//#line 190
return (java.
                                       lang.
                                       Math.
                                       pow(
                                       x +
                                         (double)
                                           1.0,
                                       x) *
                                       java.
                                         lang.
                                         Math.
                                         cos(
                                         omegan *
                                           x));
            
//#line 192
case 2:
                
//#line 193
return (java.
                                       lang.
                                       Math.
                                       pow(
                                       x +
                                         (double)
                                           1.0,
                                       x) *
                                       java.
                                         lang.
                                         Math.
                                         sin(
                                         omegan *
                                           x));
        }
        
//#line 196
return (0.0);
    }
    
    
//#line 198
public void
                   freeTestData(
                   ) {
        
    }
}
