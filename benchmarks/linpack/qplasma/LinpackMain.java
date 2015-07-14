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

class Linpack
extends x10.
  lang.
  Object
{
    
//#line 44
private int
      setSize;
    
//#line 45
final private static x10.
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
          2));
    
    
//#line 46
public void
                  initdataSizesArray(
                  final x10.
                    lang.
                    IntReferenceArray datasizes) {
        
//#line 47
/* template:array_set { */(datasizes).set(150,0)/* } */;
        
//#line 48
/* template:array_set { */(datasizes).set(1000,1)/* } */;
        
//#line 49
/* template:array_set { */(datasizes).set(2000,2)/* } */;
    }
    
    
//#line 51
public void
                  JGFsetsize(
                  final int setSize) {
        
//#line 52
this.
                      setSize =
          setSize;
    }
    
    
//#line 54
public void
                  JGFinitialise(
                  final x10.
                    lang.
                    dist vd) {
        
//#line 55
final x10.
          lang.
          IntReferenceArray datasizes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point p0/* } */, int dummy) { {
            
//#line 56
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 58
initdataSizesArray(
                      datasizes);
        
//#line 59
n =
          /* template:array_get { */((datasizes).get(setSize))/* } */;
        
//#line 60
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("ATTENTION: Running with smaller size (" +
                                                                                                                         n +
                                                                                                                         " instead of 500)");
        
//#line 61
ldaa =
          n;
        
//#line 62
lda =
          ldaa +
            1;
        
//#line 63
x10.
          lang.
          region vectorRegion =
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
              ldaa));
        
//#line 64
x10.
          lang.
          region vectorRegionMinus1 =
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
              ldaa -
                1));
        
//#line 65
x10.
          lang.
          dist vectorRegionMinus1Dist =
          x10.
            lang.
            dist.
            factory.
            constant(
            vectorRegionMinus1,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 66
x10.
          lang.
          region rectangularRegion =
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
              ldaa),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              lda));
        
//#line 67
x10.
          lang.
          region slimRegion =
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
              0),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              lda));
        
//#line 68
x10.
          lang.
          dist slimRegionDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            slimRegion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 69
x10.
          lang.
          dist rectangular_distribution =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 69
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 69
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
              blockCyclic(
              rectangularRegion,
              lda +
                1));
        
//#line 70
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rectangular_distribution,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 71
b =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 72
x =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 73
ipvt =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vectorRegionMinus1Dist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 74
long nl =
          (long)
            n;
        
//#line 75
ops =
          ((2.0 *
              ((nl *
                  nl *
                  nl)))) /
            3.0 +
            2.0 *
            ((nl *
                nl));
        
//#line 76
norma =
          matgen(
            a,
            lda,
            n,
            b);
    }
    
    
//#line 78
public void
                  JGFkernel(
                  ) {
        
//#line 79
info =
          dgefa(
            a,
            lda,
            n,
            ipvt);
        
//#line 80
dgesl(
                      a,
                      lda,
                      n,
                      ipvt,
                      b,
                      0);
    }
    
    
//#line 82
public void
                  JGFvalidate(
                  final x10.
                    lang.
                    dist vd) {
        
//#line 83
double eps =
          0.0;
        
//#line 84
double residn =
          0.0;
        
//#line 85
final x10.
          lang.
          DoubleReferenceArray ref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 86
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 88
/* template:array_set { */(ref).set(6.0,0)/* } */;
        
//#line 89
/* template:array_set { */(ref).set(12.0,1)/* } */;
        
//#line 90
/* template:array_set { */(ref).set(20.0,2)/* } */;
        
//#line 91
final x10.
          lang.
          region tempR =
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
              0),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              n));
        
//#line 92
final x10.
          lang.
          dist tempdist =
          x10.
            lang.
            dist.
            factory.
            constant(
            tempR,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 93
/* template:forloop { */
        for (java.util.Iterator pt__ = (tempdist.
                                          region).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 94
final x10.
              lang.
              point pt0 =
              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                         lang.
                                                                                                         point.
                                                                                                         factory.
                                                                                                         point(
                                                                                                         0,
                                                                                                         1));
            
//#line 95
/* template:array_set { */(x).set(/* template:array_get { */((b).get(pt0))/* } */,pt0)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 97
norma =
          matgen(
            a,
            lda,
            n,
            b);
        
//#line 98
/* template:forloop { */
        for (java.util.Iterator pt__ = (tempdist.
                                          region).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 99
final x10.
              lang.
              point pt0 =
              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                         lang.
                                                                                                         point.
                                                                                                         factory.
                                                                                                         point(
                                                                                                         0,
                                                                                                         1));
            
//#line 100
/* template:array_set { */(b).set(-/* template:array_get { */((b).get(pt0))/* } */,pt0)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 102
dmxpy(
                       n,
                       b,
                       n,
                       lda,
                       x,
                       a);
        
//#line 103
resid =
          0.0;
        
//#line 104
normx =
          0.0;
        
//#line 105
/* template:forloop { */
        for (java.util.Iterator pt__ = (tempdist.
                                          region).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 106
final x10.
              lang.
              point pt0 =
              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                         lang.
                                                                                                         point.
                                                                                                         factory.
                                                                                                         point(
                                                                                                         0,
                                                                                                         1));
            
//#line 107
resid =
              (((resid >
                   myabs(
                     /* template:array_get { */((b).get(pt0))/* } */)))
                 ? resid
                 : myabs(
                     /* template:array_get { */((b).get(pt0))/* } */));
            
//#line 108
normx =
              (((normx >
                   myabs(
                     /* template:array_get { */((x).get(pt0))/* } */)))
                 ? normx
                 : myabs(
                     /* template:array_get { */((x).get(pt0))/* } */));
        }/* } */
        }
        /* } */
        
        
//#line 110
eps =
          epslon(
            (double)
              1.0);
        
//#line 111
residn =
          resid /
            ((n *
                norma *
                normx *
                eps));
        
//#line 112
if (residn >
                           /* template:array_get { */((ref).get(setSize))/* } */) {
            
//#line 113
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 114
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Computed Norm Res = " +
                                                                                                                              residn);
            
//#line 115
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Reference Norm Res = " +
                                                                                                                              /* template:array_get { */((ref).get(setSize))/* } */);
            
//#line 116
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 119
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 121
public void
                   run(
                   ) {
        
//#line 122
JGFsetsize(
                       0);
        
//#line 123
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
        
//#line 124
JGFinitialise(
                       vd);
        
//#line 125
JGFkernel();
        
//#line 126
JGFvalidate(
                       vd);
        
//#line 127
JGFtidyup();
    }
    
    
//#line 129
private x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 130
private x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 131
private x10.
      lang.
      DoubleReferenceArray
      x;
    
//#line 132
private double
      ops;
    
//#line 133
private double
      total;
    
//#line 134
private double
      norma;
    
//#line 135
private double
      normx;
    
//#line 136
private double
      resid;
    
//#line 137
private double
      time;
    
//#line 138
private double
      kf;
    
//#line 139
private int
      n;
    
//#line 140
private int
      i;
    
//#line 141
private int
      ntimes;
    
//#line 142
private int
      info;
    
//#line 143
private int
      lda;
    
//#line 144
private int
      ldaa;
    
//#line 145
private int
      kflops;
    
//#line 146
private x10.
      lang.
      IntReferenceArray
      ipvt;
    
    
//#line 147
private double
                   read(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j) {
        
//#line 148
final x10.
          lang.
          place curr_place =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 149
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
        
//#line 150
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
        
//#line 151
final x10.
          lang.
          DoubleReferenceArray tempref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 152
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 154
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 155
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                           distribution.
                                                                           get(
                                                                           i,
                                                                           j))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 156
final double temp =
                  /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */;
                
//#line 157
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 158
/* template:array_set { */(tempref).set(temp,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp11) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp11);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 161
return /* template:array_get { */((tempref).get(0))/* } */;
    }
    
    
//#line 163
private void
                   write(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final x10.
                     lang.
                     point p,
                   final double val) {
        
//#line 164
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                       distribution.
                                                                       get(
                                                                       p))).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 165
/* template:array_set { */(a).set(val,p)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 168
private void
                   plusWrite(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j,
                   final double val) {
        
//#line 169
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                       distribution.
                                                                       get(
                                                                       i,
                                                                       j))).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 170
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */ +
              val,/* Join: { */i,j/* } */)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 173
private double
                   myabs(
                   final double d) {
        
//#line 174
return ((d >=
                                0))
          ? d
          : -d;
    }
    
    
//#line 176
private double
                   matgen(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray b) {
        
//#line 177
int init =
          1325;
        
//#line 178
double norma =
          0.0;
        
//#line 179
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
            
//#line 180
init =
              3125 *
                init %
                65536;
            
//#line 181
double val =
              ((init -
                  32768.0)) /
              16384.0;
            
//#line 182
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 183
write(
                               a,
                               p,
                               val);
            }
            	} catch (Throwable tmp12) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 185
norma =
              (val >
                 norma
                 ? val
                 : norma);
        }/* } */
        }
        /* } */
        
        
//#line 187
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 188
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
                
//#line 189
/* template:array_set { */(b).set(0.0,p)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp13) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp13);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 191
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 192
/* template:forloop-mult { */{
            x10.lang.region __var15__ = (x10.lang.region) x10.
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
                                                              n -
                                                                1),
                                                            x10.
                                                              lang.
                                                              region.
                                                              factory.
                                                              region(
                                                              0,
                                                              n -
                                                                1));
            if (__var15__.size() > 0 && (__var15__ instanceof x10.array.MultiDimRegion || __var15__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var16__ = __var15__.rank(0).low(), __var17__ = __var15__.rank(0).high(); __var16__ <= __var17__; __var16__++)
            /* } */
            /* template:forloop-mult-each { */
            for (int __var18__ = __var15__.rank(1).low(), __var19__ = __var15__.rank(1).high(); __var18__ <= __var19__; __var18__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var16__;
            /* } */
            /* template:final-var-assign { */
            final int j = __var18__;
            /* } */
            /* } */
{
                
//#line 193
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 194
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   i,
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 195
plusWrite(
                                       b,
                                       0,
                                       j,
                                       /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp20) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp20);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var0____ = (__var15__).iterator(); __var0____.hasNext(); ) {
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
                
//#line 193
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 194
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   i,
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 195
plusWrite(
                                       b,
                                       0,
                                       j,
                                       /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp21) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp21);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
        	} catch (Throwable tmp14) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp14);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 198
return norma;
    }
    
    
//#line 200
private int
      infodgefa;
    
    
//#line 201
private int
                   dgefa(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final x10.
                     lang.
                     IntReferenceArray ipvt) {
        
//#line 202
infodgefa =
          0;
        
//#line 203
final int nm1 =
          n -
          1;
        
//#line 204
if (nm1 >=
                           0) {
            
//#line 205
x10.
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
                  nm1 -
                    1));
            
//#line 206
x10.
              lang.
              dist temprDist =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 207
/* template:forloop-mult { */{
            x10.lang.region __var22__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var22__.size() > 0 && (__var22__ instanceof x10.array.MultiDimRegion || __var22__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var23__ = __var22__.rank(0).low(), __var24__ = __var22__.rank(0).high(); __var23__ <= __var24__; __var23__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var23__;
            /* } */
            /* } */
{
                
//#line 208
final int l =
                  idamax(
                    n -
                      k,
                    a,
                    k,
                    k,
                    1) +
                  k;
                
//#line 209
/* template:array_set { */(ipvt).set(l,k)/* } */;
                
//#line 210
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 211
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   k,
                                                                                   1))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 212
final int kp1 =
                          k +
                          1;
                        
//#line 213
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 214
if (l !=
                                               k) {
                                
//#line 215
if (l !=
                                                   k) {
                                    
//#line 216
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 217
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 218
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 221
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 222
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 223
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 224
x10.
                                  lang.
                                  region temprkp1 =
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
                                      kp1,
                                      n -
                                        1));
                                
//#line 225
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  x10.
                                    lang.
                                    dist.
                                    factory.
                                    constant(
                                    temprkp1,
                                    /* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 226
/* template:forloop-mult { */{
                                x10.lang.region __var27__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var27__.size() > 0 && (__var27__ instanceof x10.array.MultiDimRegion || __var27__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var28__ = __var27__.rank(0).low(), __var29__ = __var27__.rank(0).high(); __var28__ <= __var29__; __var28__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var28__;
                                /* } */
                                /* } */
{
                                    
//#line 227
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 228
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 229
if (l !=
                                                           k) {
                                            
//#line 230
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 231
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 233
daxpy(
                                                       n -
                                                         ((kp1)),
                                                       t,
                                                       a,
                                                       k,
                                                       kp1,
                                                       1,
                                                       a,
                                                       j,
                                                       kp1,
                                                       1);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var2____ = (__var27__).iterator(); __var2____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var2__ = (x10.
                                  lang.
                                  point) __var2____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                                    
//#line 227
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 228
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 229
if (l !=
                                                           k) {
                                            
//#line 230
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 231
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 233
daxpy(
                                                       n -
                                                         ((kp1)),
                                                       t,
                                                       a,
                                                       k,
                                                       kp1,
                                                       1,
                                                       a,
                                                       j,
                                                       kp1,
                                                       1);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                }
                                /* } */
                                
                                }
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp26) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp26);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 239
infodgefa =
                              k;
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp25) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp25);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var1____ = (__var22__).iterator(); __var1____.hasNext(); ) {
            	final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 208
final int l =
                  idamax(
                    n -
                      k,
                    a,
                    k,
                    k,
                    1) +
                  k;
                
//#line 209
/* template:array_set { */(ipvt).set(l,k)/* } */;
                
//#line 210
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 211
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   k,
                                                                                   1))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 212
final int kp1 =
                          k +
                          1;
                        
//#line 213
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 214
if (l !=
                                               k) {
                                
//#line 215
if (l !=
                                                   k) {
                                    
//#line 216
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 217
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 218
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 221
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 222
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 223
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 224
x10.
                                  lang.
                                  region temprkp1 =
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
                                      kp1,
                                      n -
                                        1));
                                
//#line 225
x10.
                                  lang.
                                  dist temprkp1Dist =
                                  x10.
                                    lang.
                                    dist.
                                    factory.
                                    constant(
                                    temprkp1,
                                    /* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 226
/* template:forloop-mult { */{
                                x10.lang.region __var32__ = (x10.lang.region) temprkp1Dist.
                                                                                region;
                                if (__var32__.size() > 0 && (__var32__ instanceof x10.array.MultiDimRegion || __var32__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var33__ = __var32__.rank(0).low(), __var34__ = __var32__.rank(0).high(); __var33__ <= __var34__; __var33__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var33__;
                                /* } */
                                /* } */
{
                                    
//#line 227
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 228
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 229
if (l !=
                                                           k) {
                                            
//#line 230
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 231
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 233
daxpy(
                                                       n -
                                                         ((kp1)),
                                                       t,
                                                       a,
                                                       k,
                                                       kp1,
                                                       1,
                                                       a,
                                                       j,
                                                       kp1,
                                                       1);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var2____ = (__var32__).iterator(); __var2____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var2__ = (x10.
                                  lang.
                                  point) __var2____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                                    
//#line 227
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 228
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 229
if (l !=
                                                           k) {
                                            
//#line 230
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 231
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 233
daxpy(
                                                       n -
                                                         ((kp1)),
                                                       t,
                                                       a,
                                                       k,
                                                       kp1,
                                                       1,
                                                       a,
                                                       j,
                                                       kp1,
                                                       1);
                                    }
                                    		}
                                    	});/* } */
                                }/* } */
                                }
                                /* } */
                                
                                }
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp31) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp31);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 239
infodgefa =
                              k;
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp30) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp30);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
        
//#line 244
/* template:array_set { */(ipvt).set(n -
          1,n -
          1)/* } */;
        
//#line 245
double val =
          read(
            a,
            n -
              1,
            n -
              1);
        
//#line 246
if (val ==
                           0) {
            
//#line 247
info =
              n -
                1;
        }
        
//#line 249
return infodgefa;
    }
    
    
//#line 251
private void
                   dgesl(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final x10.
                     lang.
                     IntReferenceArray ipvt,
                   final x10.
                     lang.
                     DoubleReferenceArray b,
                   final int job) {
        
//#line 252
final int nm1 =
          n -
          1;
        
//#line 253
if (job ==
                           0) {
            
//#line 254
if (nm1 >=
                               1) {
                
//#line 255
x10.
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
                      nm1 -
                        1));
                
//#line 256
x10.
                  lang.
                  dist temprDist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 257
/* template:forloop-mult { */{
                x10.lang.region __var35__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var35__.size() > 0 && (__var35__ instanceof x10.array.MultiDimRegion || __var35__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var36__ = __var35__.rank(0).low(), __var37__ = __var35__.rank(0).high(); __var36__ <= __var37__; __var36__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int k = __var36__;
                /* } */
                /* } */
{
                    
//#line 258
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 259
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 260
if (l !=
                                       k) {
                        
//#line 261
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 262
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 264
final int kp1 =
                      k +
                      1;
                    
//#line 265
daxpy(
                                   n -
                                     ((kp1)),
                                   t,
                                   a,
                                   k,
                                   kp1,
                                   1,
                                   b,
                                   0,
                                   kp1,
                                   1);
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var35__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int k =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 258
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 259
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 260
if (l !=
                                       k) {
                        
//#line 261
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 262
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 264
final int kp1 =
                      k +
                      1;
                    
//#line 265
daxpy(
                                   n -
                                     ((kp1)),
                                   t,
                                   a,
                                   k,
                                   kp1,
                                   1,
                                   b,
                                   0,
                                   kp1,
                                   1);
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
            
//#line 268
x10.
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
                  n -
                    1));
            
//#line 269
x10.
              lang.
              dist temprDist =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 270
/* template:forloop-mult { */{
            x10.lang.region __var38__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var38__.size() > 0 && (__var38__ instanceof x10.array.MultiDimRegion || __var38__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var39__ = __var38__.rank(0).low(), __var40__ = __var38__.rank(0).high(); __var39__ <= __var40__; __var39__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int kb = __var39__;
            /* } */
            /* } */
{
                
//#line 271
final int k =
                  n -
                  ((kb +
                      1));
                
//#line 272
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ /
                  read(
                    a,
                    k,
                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 273
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 274
daxpy(
                               k,
                               t,
                               a,
                               k,
                               0,
                               1,
                               b,
                               0,
                               0,
                               1);
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var4____ = (__var38__).iterator(); __var4____.hasNext(); ) {
            	final  x10.
              lang.
              point __var4__ = (x10.
              lang.
              point) __var4____.next();
            	/* Join: { *//* Join: { */final int kb =
              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                
//#line 271
final int k =
                  n -
                  ((kb +
                      1));
                
//#line 272
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ /
                  read(
                    a,
                    k,
                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 273
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 274
daxpy(
                               k,
                               t,
                               a,
                               k,
                               0,
                               1,
                               b,
                               0,
                               0,
                               1);
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        } else {
            
//#line 278
x10.
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
                  n -
                    1));
            
//#line 279
x10.
              lang.
              dist temprDist =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 280
/* template:forloop-mult { */{
            x10.lang.region __var41__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var41__.size() > 0 && (__var41__ instanceof x10.array.MultiDimRegion || __var41__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var42__ = __var41__.rank(0).low(), __var43__ = __var41__.rank(0).high(); __var42__ <= __var43__; __var42__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var42__;
            /* } */
            /* } */
{
                
//#line 281
double t =
                  ddot(
                    k,
                    a,
                    k,
                    0,
                    1,
                    b,
                    0,
                    0,
                    1);
                
//#line 282
/* template:array_set { */(b).set(((/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ -
                                                                   t)) /
                  /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */0,k/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var5____ = (__var41__).iterator(); __var5____.hasNext(); ) {
            	final  x10.
              lang.
              point __var5__ = (x10.
              lang.
              point) __var5____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                
//#line 281
double t =
                  ddot(
                    k,
                    a,
                    k,
                    0,
                    1,
                    b,
                    0,
                    0,
                    1);
                
//#line 282
/* template:array_set { */(b).set(((/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ -
                                                                   t)) /
                  /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */0,k/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 284
if (nm1 >=
                               1) {
                
//#line 285
x10.
                  lang.
                  region temprnm1 =
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
                      1,
                      nm1 -
                        1));
                
//#line 286
x10.
                  lang.
                  dist temprnm1Dist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    temprnm1,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 287
/* template:forloop-mult { */{
                x10.lang.region __var44__ = (x10.lang.region) temprnm1Dist.
                                                                region;
                if (__var44__.size() > 0 && (__var44__ instanceof x10.array.MultiDimRegion || __var44__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var45__ = __var44__.rank(0).low(), __var46__ = __var44__.rank(0).high(); __var45__ <= __var46__; __var45__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int kb = __var45__;
                /* } */
                /* } */
{
                    
//#line 288
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 289
final int kp1 =
                      k +
                      1;
                    
//#line 290
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ +
                      ddot(
                        n -
                          ((kp1)),
                        a,
                        k,
                        kp1,
                        1,
                        b,
                        0,
                        kp1,
                        1),/* Join: { */0,k/* } */)/* } */;
                    
//#line 291
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 292
if (l !=
                                       k) {
                        
//#line 293
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 294
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 295
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var6____ = (__var44__).iterator(); __var6____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var6__ = (x10.
                  lang.
                  point) __var6____.next();
                	/* Join: { *//* Join: { */final int kb =
                  /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                    
//#line 288
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 289
final int kp1 =
                      k +
                      1;
                    
//#line 290
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ +
                      ddot(
                        n -
                          ((kp1)),
                        a,
                        k,
                        kp1,
                        1,
                        b,
                        0,
                        kp1,
                        1),/* Join: { */0,k/* } */)/* } */;
                    
//#line 291
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 292
if (l !=
                                       k) {
                        
//#line 293
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 294
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 295
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
    }
    
    
//#line 301
private void
                   daxpy(
                   final int n,
                   final double da,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxCol,
                   final int dx_off,
                   final int incx,
                   final x10.
                     lang.
                     DoubleReferenceArray dy,
                   final int dyCol,
                   final int dy_off,
                   final int incy) {
        
//#line 302
if (((n >
                             0)) &&
                           ((da !=
                               0))) {
            
//#line 303
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 304
int ix =
                  0;
                
//#line 305
int iy =
                  0;
                
//#line 306
if (incx <
                                   0) {
                    
//#line 307
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 308
if (incy <
                                   0) {
                    
//#line 309
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 310
x10.
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
                      n -
                        1));
                
//#line 311
x10.
                  lang.
                  dist temprDist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 312
/* template:forloop { */
                for (java.util.Iterator i__ = (temprDist.
                                                 region).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 313
/* template:array_set { */(dy).set(/* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                      dy_off/* } */))/* } */ +
                      ((da *
                          read(
                            dx,
                            dxCol,
                            ix +
                              dx_off))),/* Join: { */dyCol,iy +
                      dy_off/* } */)/* } */;
                    
//#line 314
ix =
                      ix +
                        incx;
                    
//#line 315
iy =
                      iy +
                        incy;
                }/* } */
                }
                /* } */
                
                
//#line 317
return;
            }
            
//#line 319
x10.
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
                  n -
                    1));
            
//#line 320
x10.
              lang.
              dist temprDist =
              x10.
                lang.
                dist.
                factory.
                constant(
                tempr,
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 321
/* template:forloop-mult { */{
            x10.lang.region __var47__ = (x10.lang.region) temprDist.
                                                            region;
            if (__var47__.size() > 0 && (__var47__ instanceof x10.array.MultiDimRegion || __var47__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var48__ = __var47__.rank(0).low(), __var49__ = __var47__.rank(0).high(); __var48__ <= __var49__; __var48__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var48__;
            /* } */
            /* } */
{
                
//#line 322
/* template:array_set { */(dy).set(/* template:array_get { */((dy).get(/* Join: { */dyCol,i +
                  dy_off/* } */))/* } */ +
                  ((da *
                      read(
                        dx,
                        dxCol,
                        i +
                          dx_off))),/* Join: { */dyCol,i +
                  dy_off/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var7____ = (__var47__).iterator(); __var7____.hasNext(); ) {
            	final  x10.
              lang.
              point __var7__ = (x10.
              lang.
              point) __var7____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                
//#line 322
/* template:array_set { */(dy).set(/* template:array_get { */((dy).get(/* Join: { */dyCol,i +
                  dy_off/* } */))/* } */ +
                  ((da *
                      read(
                        dx,
                        dxCol,
                        i +
                          dx_off))),/* Join: { */dyCol,i +
                  dy_off/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
    }
    
    
//#line 325
private double
                   ddot(
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxCol,
                   final int dx_off,
                   final int incx,
                   final x10.
                     lang.
                     DoubleReferenceArray dy,
                   final int dyCol,
                   final int dy_off,
                   final int incy) {
        
//#line 326
double dtemp =
          0;
        
//#line 327
if (n >
                           0) {
            
//#line 328
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 329
int ix =
                  0;
                
//#line 330
int iy =
                  0;
                
//#line 331
if (incx <
                                   0) {
                    
//#line 332
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 333
if (incy <
                                   0) {
                    
//#line 334
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 335
x10.
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
                      n -
                        1));
                
//#line 336
x10.
                  lang.
                  dist temprDist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 337
/* template:forloop { */
                for (java.util.Iterator i__ = (temprDist.
                                                 region).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 338
dtemp =
                      dtemp +
                        ((/* template:array_get { */((dx).get(/* Join: { */dxCol,ix +
                            dx_off/* } */))/* } */ *
                            /* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                            dy_off/* } */))/* } */));
                    
//#line 339
ix =
                      ix +
                        incx;
                    
//#line 340
iy =
                      iy +
                        incy;
                }/* } */
                }
                /* } */
                
            } else {
                
//#line 344
x10.
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
                      n -
                        1));
                
//#line 345
x10.
                  lang.
                  dist temprDist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 346
/* template:forloop-mult { */{
                x10.lang.region __var50__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var50__.size() > 0 && (__var50__ instanceof x10.array.MultiDimRegion || __var50__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var51__ = __var50__.rank(0).low(), __var52__ = __var50__.rank(0).high(); __var51__ <= __var52__; __var51__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var51__;
                /* } */
                /* } */
{
                    
//#line 347
dtemp =
                      dtemp +
                        /* template:array_get { */((dx).get(/* Join: { */dxCol,i +
                        dx_off/* } */))/* } */ *
                        /* template:array_get { */((dy).get(/* Join: { */dyCol,i +
                        dy_off/* } */))/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var8____ = (__var50__).iterator(); __var8____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 347
dtemp =
                      dtemp +
                        /* template:array_get { */((dx).get(/* Join: { */dxCol,i +
                        dx_off/* } */))/* } */ *
                        /* template:array_get { */((dy).get(/* Join: { */dyCol,i +
                        dy_off/* } */))/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
        
//#line 350
return dtemp;
    }
    
    
//#line 352
private void
                   dscal(
                   final int n,
                   final double da,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int currentCol,
                   final int dx_off,
                   final int incx) {
        
//#line 353
if (n >
                           0) {
            
//#line 354
if (incx !=
                               1) {
                
//#line 355
final int nincx =
                  n *
                  incx;
                
//#line 356
int i =
                  0;
                
//#line 357
while (i <
                                      nincx) {
                    
//#line 358
/* template:array_set { */(dx).set(/* template:array_get { */((dx).get(/* Join: { */currentCol,i +
                      dx_off/* } */))/* } */ *
                      da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                    
//#line 359
i =
                      i +
                        incx;
                }
            } else {
                
//#line 363
x10.
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
                      n -
                        1));
                
//#line 364
x10.
                  lang.
                  dist temprDist =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 365
/* template:forloop-mult { */{
                x10.lang.region __var53__ = (x10.lang.region) temprDist.
                                                                region;
                if (__var53__.size() > 0 && (__var53__ instanceof x10.array.MultiDimRegion || __var53__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var54__ = __var53__.rank(0).low(), __var55__ = __var53__.rank(0).high(); __var54__ <= __var55__; __var54__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var54__;
                /* } */
                /* } */
{
                    
//#line 366
/* template:array_set { */(dx).set(/* template:array_get { */((dx).get(/* Join: { */currentCol,i +
                      dx_off/* } */))/* } */ *
                      da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var9____ = (__var53__).iterator(); __var9____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var9__ = (x10.
                  lang.
                  point) __var9____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                    
//#line 366
/* template:array_set { */(dx).set(/* template:array_get { */((dx).get(/* Join: { */currentCol,i +
                      dx_off/* } */))/* } */ *
                      da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
        }
    }
    
    
//#line 370
private int
                   idamax(
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxk,
                   final int dx_off,
                   final int incx) {
        
//#line 371
if (n <
                           1) {
            
//#line 372
return -1;
        }
        
//#line 373
if (n ==
                           1) {
            
//#line 374
return 0;
        }
        
//#line 375
if (incx !=
                           1) {
            
//#line 376
int itemp =
              0;
            
//#line 377
double dmax =
              myabs(
                read(
                  dx,
                  dxk,
                  0 +
                    dx_off));
            
//#line 378
int ix =
              1 +
              incx;
            
//#line 379
/* template:forloop { */
            for (java.util.Iterator i__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               1,
                                               n -
                                                 1))).iterator(); i__.hasNext(); ) {
            	final  x10.
              lang.
              point i = (x10.
              lang.
              point) i__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 380
double dtemp =
                  myabs(
                    read(
                      dx,
                      dxk,
                      ix +
                        dx_off));
                
//#line 381
if (dtemp >
                                   dmax) {
                    
//#line 382
itemp =
                      /* template:array_get { */((i).get(0))/* } */;
                    
//#line 383
dmax =
                      dtemp;
                }
                
//#line 385
ix =
                  /* template:array_get { */((i).get(0))/* } */ +
                    incx;
            }/* } */
            }
            /* } */
            
            
//#line 387
return itemp;
        }
        
//#line 389
int itemp =
          0;
        
//#line 390
double dmax =
          myabs(
            read(
              dx,
              dxk,
              0 +
                dx_off));
        
//#line 391
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           1,
                                           n -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 392
double dtemp =
              myabs(
                read(
                  dx,
                  dxk,
                  /* template:array_get { */((i).get(0))/* } */ +
                    dx_off));
            
//#line 393
if (dtemp >
                               dmax) {
                
//#line 394
itemp =
                  /* template:array_get { */((i).get(0))/* } */;
                
//#line 395
dmax =
                  dtemp;
            }
        }/* } */
        }
        /* } */
        
        
//#line 398
return itemp;
    }
    
    
//#line 400
private double
                   epslon(
                   final double x) {
        
//#line 401
final double a =
          4.0 /
          3.0;
        
//#line 402
double eps =
          0;
        
//#line 403
while (eps ==
                              0) {
            
//#line 404
double b =
              a -
              1.0;
            
//#line 405
double c =
              b +
              b +
              b;
            
//#line 406
eps =
              myabs(
                c -
                  1.0);
        }
        
//#line 408
return (eps *
                               myabs(
                                 x));
    }
    
    
//#line 410
private void
                   dmxpy(
                   final int n1,
                   final x10.
                     lang.
                     DoubleReferenceArray y,
                   final int n2,
                   final int ldm,
                   final x10.
                     lang.
                     DoubleReferenceArray x,
                   final x10.
                     lang.
                     DoubleReferenceArray m) {
        
//#line 411
/* template:forloop-mult { */{
        x10.lang.region __var56__ = (x10.lang.region) x10.
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
                                                          n2 -
                                                            1),
                                                        x10.
                                                          lang.
                                                          region.
                                                          factory.
                                                          region(
                                                          0,
                                                          n1 -
                                                            1));
        if (__var56__.size() > 0 && (__var56__ instanceof x10.array.MultiDimRegion || __var56__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var57__ = __var56__.rank(0).low(), __var58__ = __var56__.rank(0).high(); __var57__ <= __var58__; __var57__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var59__ = __var56__.rank(1).low(), __var60__ = __var56__.rank(1).high(); __var59__ <= __var60__; __var59__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var57__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var59__;
        /* } */
        /* } */
{
            
//#line 412
/* template:array_set { */(y).set(/* template:array_get { */((y).get(/* Join: { */0,i/* } */))/* } */ +
              ((/* template:array_get { */((x).get(/* Join: { */0,j/* } */))/* } */ *
                  read(
                    m,
                    j,
                    i))),/* Join: { */0,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var10____ = (__var56__).iterator(); __var10____.hasNext(); ) {
        	final  x10.
          lang.
          point __var10__ = (x10.
          lang.
          point) __var10____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var10__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var10__).get(1))/* } */;/* } */
{
            
//#line 412
/* template:array_set { */(y).set(/* template:array_get { */((y).get(/* Join: { */0,i/* } */))/* } */ +
              ((/* template:array_get { */((x).get(/* Join: { */0,j/* } */))/* } */ *
                  read(
                    m,
                    j,
                    i))),/* Join: { */0,i/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 43
public Linpack() {
        
//#line 43
super();
    }
}

public class LinpackMain
extends x10.
  lang.
  Object
{
    
    
//#line 417
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
            
//#line 419
Timer tmr =
              new Timer(
              );
            
//#line 420
int count =
              0;
            
//#line 421
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 422
/* template:place-check { */((Linpack) x10.lang.Runtime.hereCheck(new Linpack(
              )))/* } */.run();
            
//#line 423
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 424
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Wall-clock time for linpack: " +
                                                                                                                              /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                              " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 416
public LinpackMain() {
        
//#line 416
super();
    }
}
