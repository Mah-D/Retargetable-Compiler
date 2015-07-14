import x10.lang.*;

public class Linpack
extends x10.
  lang.
  Object
{
    
//#line 61
private int
      setSize;
    
//#line 64
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
    
    
//#line 67
public void
                  initdataSizesArray(
                  final x10.
                    lang.
                    IntReferenceArray datasizes) {
        
//#line 69
/* template:array_set { */(datasizes).set(150,0)/* } */;
        
//#line 70
/* template:array_set { */(datasizes).set(1000,1)/* } */;
        
//#line 71
/* template:array_set { */(datasizes).set(2000,2)/* } */;
    }
    
    
//#line 75
public void
                  JGFsetsize(
                  final int setSize) {
        
//#line 76
this.
                      setSize =
          setSize;
    }
    
    
//#line 79
public void
                  JGFinitialise(
                  final x10.
                    lang.
                    dist vd) {
        
//#line 80
final x10.
          lang.
          IntReferenceArray datasizes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point p0/* } */, int dummy) { {
            
//#line 81
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 83
initdataSizesArray(
                      datasizes);
        
//#line 84
n =
          /* template:array_get { */((datasizes).get(setSize))/* } */;
        
//#line 86
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("ATTENTION: Running with smaller size (" +
                                                                                                                         n +
                                                                                                                         " instead of 500)");
        
//#line 87
ldaa =
          n;
        
//#line 88
lda =
          ldaa +
            1;
        
//#line 90
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
        
//#line 91
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
        
//#line 92
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
        
//#line 94
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
        
//#line 95
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
        
//#line 96
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
        
//#line 97
x10.
          lang.
          dist rectangular_distribution =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 97
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 97
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
        
//#line 104
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rectangular_distribution,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 105
b =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 106
x =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(slimRegionDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 107
ipvt =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(vectorRegionMinus1Dist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 110
long nl =
          (long)
            n;
        
//#line 111
ops =
          ((2.0 *
              ((nl *
                  nl *
                  nl)))) /
            3.0 +
            2.0 *
            ((nl *
                nl));
        
//#line 113
norma =
          matgen(
            a,
            lda,
            n,
            b);
    }
    
    
//#line 116
public void
                   JGFkernel(
                   ) {
        
//#line 118
info =
          dgefa(
            a,
            lda,
            n,
            ipvt);
        
//#line 119
dgesl(
                       a,
                       lda,
                       n,
                       ipvt,
                       b,
                       0);
    }
    
    
//#line 124
public void
                   JGFvalidate(
                   final x10.
                     lang.
                     dist vd) {
        
//#line 125
double eps =
          0.0;
        
//#line 126
double residn =
          0.0;
        
//#line 128
final x10.
          lang.
          DoubleReferenceArray ref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 129
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 133
/* template:array_set { */(ref).set(6.0,0)/* } */;
        
//#line 134
/* template:array_set { */(ref).set(12.0,1)/* } */;
        
//#line 135
/* template:array_set { */(ref).set(20.0,2)/* } */;
        
//#line 139
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
        
//#line 140
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
        
//#line 142
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
            
//#line 143
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
            
//#line 144
/* template:array_set { */(x).set(/* template:array_get { */((b).get(pt0))/* } */,pt0)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 147
norma =
          matgen(
            a,
            lda,
            n,
            b);
        
//#line 149
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
            
//#line 150
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
            
//#line 151
/* template:array_set { */(b).set(-/* template:array_get { */((b).get(pt0))/* } */,pt0)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 154
dmxpy(
                       n,
                       b,
                       n,
                       lda,
                       x,
                       a);
        
//#line 155
resid =
          0.0;
        
//#line 156
normx =
          0.0;
        
//#line 157
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
            
//#line 158
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
            
//#line 159
resid =
              (((resid >
                   myabs(
                     /* template:array_get { */((b).get(pt0))/* } */)))
                 ? resid
                 : myabs(
                     /* template:array_get { */((b).get(pt0))/* } */));
            
//#line 160
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
        
        
//#line 163
eps =
          epslon(
            (double)
              1.0);
        
//#line 164
residn =
          resid /
            ((n *
                norma *
                normx *
                eps));
        
//#line 166
if (residn >
                           /* template:array_get { */((ref).get(setSize))/* } */) {
            
//#line 167
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 168
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Computed Norm Res = " +
                                                                                                                              residn);
            
//#line 169
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Reference Norm Res = " +
                                                                                                                              /* template:array_get { */((ref).get(setSize))/* } */);
            
//#line 170
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 174
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 189
public void
                   run(
                   ) {
        
//#line 193
JGFsetsize(
                       0);
        
//#line 195
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
        
//#line 196
JGFinitialise(
                       vd);
        
//#line 197
JGFkernel();
        
//#line 198
JGFvalidate(
                       vd);
        
//#line 199
JGFtidyup();
    }
    
    
//#line 206
private x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 207
private x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 208
private x10.
      lang.
      DoubleReferenceArray
      x;
    
//#line 209
private double
      ops;
    
//#line 210
private double
      total;
    
//#line 211
private double
      norma;
    
//#line 212
private double
      normx;
    
//#line 213
private double
      resid;
    
//#line 214
private double
      time;
    
//#line 215
private double
      kf;
    
//#line 216
private int
      n;
    
//#line 217
private int
      i;
    
//#line 218
private int
      ntimes;
    
//#line 219
private int
      info;
    
//#line 220
private int
      lda;
    
//#line 221
private int
      ldaa;
    
//#line 222
private int
      kflops;
    
//#line 223
private x10.
      lang.
      IntReferenceArray
      ipvt;
    
    
//#line 225
private double
                   read(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j) {
        
//#line 230
final x10.
          lang.
          place curr_place =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 231
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
        
//#line 232
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
        
//#line 233
final x10.
          lang.
          DoubleReferenceArray tempref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 234
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 238
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 238
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                           distribution.
                                                                           get(
                                                                           i,
                                                                           j))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 240
final double temp =
                  /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */;
                
//#line 241
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 243
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
        
        
//#line 246
return /* template:array_get { */((tempref).get(0))/* } */;
    }
    
    
//#line 248
private void
                   write(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final x10.
                     lang.
                     point p,
                   final double val) {
        
//#line 252
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                       distribution.
                                                                       get(
                                                                       p))).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 253
/* template:array_set { */(a).set(val,p)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 257
private void
                   plusWrite(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int i,
                   final int j,
                   final double val) {
        
//#line 262
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                       distribution.
                                                                       get(
                                                                       i,
                                                                       j))).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 263
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */ +
              val,/* Join: { */i,j/* } */)/* } */;
        }
        		}
        	});/* } */
    }
    
    
//#line 298
private double
                   myabs(
                   final double d) {
        
//#line 299
return ((d >=
                                0))
          ? d
          : -d;
    }
    
    
//#line 302
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
        
//#line 307
int init =
          1325;
        
//#line 308
double norma =
          0.0;
        
//#line 312
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
            
//#line 313
init =
              3125 *
                init %
                65536;
            
//#line 314
double val =
              ((init -
                  32768.0)) /
              16384.0;
            
//#line 315
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 316
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
            
            
//#line 318
norma =
              (val >
                 norma
                 ? val
                 : norma);
        }/* } */
        }
        /* } */
        
        
//#line 320
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 320
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
                
//#line 321
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
        
        
//#line 326
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 326
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
                
//#line 327
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 327
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   i,
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 328
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
                
//#line 327
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 327
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   i,
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 328
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
        
        
//#line 331
return norma;
    }
    
    
//#line 334
private int
      infodgefa;
    
    
//#line 379
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
        
//#line 384
infodgefa =
          0;
        
//#line 385
final int nm1 =
          n -
          1;
        
//#line 386
if (nm1 >=
                           0) {
            
//#line 389
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
            
//#line 390
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
            
//#line 392
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
                
//#line 394
final int l =
                  idamax(
                    n -
                      k,
                    a,
                    k,
                    k,
                    1) +
                  k;
                
//#line 395
/* template:array_set { */(ipvt).set(l,k)/* } */;
                
//#line 396
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 396
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   k,
                                                                                   1))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 397
final int kp1 =
                          k +
                          1;
                        
//#line 400
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 401
if (l !=
                                               k) {
                                
//#line 403
if (l !=
                                                   k) {
                                    
//#line 404
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 405
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 406
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 410
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 412
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 416
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 417
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
                                
//#line 418
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
                                
//#line 419
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
                                    
//#line 420
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 421
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 422
if (l !=
                                                           k) {
                                            
//#line 423
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 424
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 426
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
                                    
//#line 420
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 421
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 422
if (l !=
                                                           k) {
                                            
//#line 423
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 424
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 426
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
                            
//#line 432
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
                
//#line 394
final int l =
                  idamax(
                    n -
                      k,
                    a,
                    k,
                    k,
                    1) +
                  k;
                
//#line 395
/* template:array_set { */(ipvt).set(l,k)/* } */;
                
//#line 396
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 396
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                   distribution.
                                                                                   get(
                                                                                   k,
                                                                                   1))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 397
final int kp1 =
                          k +
                          1;
                        
//#line 400
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 401
if (l !=
                                               k) {
                                
//#line 403
if (l !=
                                                   k) {
                                    
//#line 404
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 405
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 406
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 410
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 412
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 416
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 417
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
                                
//#line 418
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
                                
//#line 419
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
                                    
//#line 420
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 421
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 422
if (l !=
                                                           k) {
                                            
//#line 423
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 424
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 426
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
                                    
//#line 420
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                                                   distribution.
                                                                                                   get(
                                                                                                   j,
                                                                                                   l))).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 421
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 422
if (l !=
                                                           k) {
                                            
//#line 423
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 424
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 426
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
                            
//#line 432
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
        
//#line 438
/* template:array_set { */(ipvt).set(n -
          1,n -
          1)/* } */;
        
//#line 439
double val =
          read(
            a,
            n -
              1,
            n -
              1);
        
//#line 440
if (val ==
                           0) {
            
//#line 441
info =
              n -
                1;
        }
        
//#line 443
return infodgefa;
    }
    
    
//#line 501
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
        
//#line 507
final int nm1 =
          n -
          1;
        
//#line 508
if (job ==
                           0) {
            
//#line 510
if (nm1 >=
                               1) {
                
//#line 511
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
                
//#line 512
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
                
//#line 513
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
                    
//#line 514
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 515
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 516
if (l !=
                                       k) {
                        
//#line 517
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 518
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 520
final int kp1 =
                      k +
                      1;
                    
//#line 521
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
                    
//#line 514
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 515
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 516
if (l !=
                                       k) {
                        
//#line 517
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 518
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 520
final int kp1 =
                      k +
                      1;
                    
//#line 521
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
            
//#line 526
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
            
//#line 527
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
            
//#line 528
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
                
//#line 529
final int k =
                  n -
                  ((kb +
                      1));
                
//#line 530
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ /
                  read(
                    a,
                    k,
                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 531
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 532
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
                
//#line 529
final int k =
                  n -
                  ((kb +
                      1));
                
//#line 530
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ /
                  read(
                    a,
                    k,
                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 531
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 532
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
            
//#line 536
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
            
//#line 537
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
            
//#line 538
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
                
//#line 539
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
                
//#line 540
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
                
//#line 539
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
                
//#line 540
/* template:array_set { */(b).set(((/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ -
                                                                   t)) /
                  /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */0,k/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 544
if (nm1 >=
                               1) {
                
//#line 545
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
                
//#line 546
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
                
//#line 547
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
                    
//#line 548
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 549
final int kp1 =
                      k +
                      1;
                    
//#line 550
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
                    
//#line 551
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 552
if (l !=
                                       k) {
                        
//#line 553
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 554
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 555
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
                    
//#line 548
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 549
final int kp1 =
                      k +
                      1;
                    
//#line 550
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
                    
//#line 551
final int l =
                      /* template:array_get { */((ipvt).get(k))/* } */;
                    
//#line 552
if (l !=
                                       k) {
                        
//#line 553
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 554
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 555
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
    
    
//#line 566
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
        
//#line 576
if (((n >
                             0)) &&
                           ((da !=
                               0))) {
            
//#line 577
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 579
int ix =
                  0;
                
//#line 580
int iy =
                  0;
                
//#line 581
if (incx <
                                   0) {
                    
//#line 581
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 582
if (incy <
                                   0) {
                    
//#line 582
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 583
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
                
//#line 584
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
                
//#line 585
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
                    
//#line 587
/* template:array_set { */(dy).set(/* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                      dy_off/* } */))/* } */ +
                      ((da *
                          read(
                            dx,
                            dxCol,
                            ix +
                              dx_off))),/* Join: { */dyCol,iy +
                      dy_off/* } */)/* } */;
                    
//#line 588
ix =
                      ix +
                        incx;
                    
//#line 589
iy =
                      iy +
                        incy;
                }/* } */
                }
                /* } */
                
                
//#line 591
return;
            }
            
//#line 594
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
            
//#line 595
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
            
//#line 596
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
                
//#line 597
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
                
//#line 597
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
    
    
//#line 605
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
        
//#line 614
double dtemp =
          0;
        
//#line 615
if (n >
                           0) {
            
//#line 616
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 618
int ix =
                  0;
                
//#line 619
int iy =
                  0;
                
//#line 620
if (incx <
                                   0) {
                    
//#line 620
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 621
if (incy <
                                   0) {
                    
//#line 621
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 622
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
                
//#line 623
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
                
//#line 624
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
                    
//#line 625
dtemp =
                      dtemp +
                        ((/* template:array_get { */((dx).get(/* Join: { */dxCol,ix +
                            dx_off/* } */))/* } */ *
                            /* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                            dy_off/* } */))/* } */));
                    
//#line 626
ix =
                      ix +
                        incx;
                    
//#line 627
iy =
                      iy +
                        incy;
                }/* } */
                }
                /* } */
                
            } else {
                
//#line 631
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
                
//#line 632
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
                
//#line 633
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
                    
//#line 634
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
                    
//#line 634
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
        
//#line 637
return dtemp;
    }
    
    
//#line 644
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
        
//#line 646
if (n >
                           0) {
            
//#line 647
if (incx !=
                               1) {
                
//#line 649
final int nincx =
                  n *
                  incx;
                
//#line 652
int i =
                  0;
                
//#line 653
while (i <
                                      nincx) {
                    
//#line 655
/* template:array_set { */(dx).set(/* template:array_get { */((dx).get(/* Join: { */currentCol,i +
                      dx_off/* } */))/* } */ *
                      da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                    
//#line 656
i =
                      i +
                        incx;
                }
            } else {
                
//#line 660
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
                
//#line 661
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
                
//#line 662
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
                    
//#line 663
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
                    
//#line 663
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
    
    
//#line 675
private int
                   idamax(
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxk,
                   final int dx_off,
                   final int incx) {
        
//#line 681
if (n <
                           1) {
            
//#line 681
return -1;
        }
        
//#line 682
if (n ==
                           1) {
            
//#line 682
return 0;
        }
        
//#line 683
if (incx !=
                           1) {
            
//#line 685
int itemp =
              0;
            
//#line 686
double dmax =
              myabs(
                read(
                  dx,
                  dxk,
                  0 +
                    dx_off));
            
//#line 687
int ix =
              1 +
              incx;
            
//#line 688
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
                
//#line 689
double dtemp =
                  myabs(
                    read(
                      dx,
                      dxk,
                      ix +
                        dx_off));
                
//#line 690
if (dtemp >
                                   dmax) {
                    
//#line 691
itemp =
                      /* template:array_get { */((i).get(0))/* } */;
                    
//#line 692
dmax =
                      dtemp;
                }
                
//#line 694
ix =
                  /* template:array_get { */((i).get(0))/* } */ +
                    incx;
            }/* } */
            }
            /* } */
            
            
//#line 696
return itemp;
        }
        
//#line 699
int itemp =
          0;
        
//#line 700
double dmax =
          myabs(
            read(
              dx,
              dxk,
              0 +
                dx_off));
        
//#line 701
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
            
//#line 702
double dtemp =
              myabs(
                read(
                  dx,
                  dxk,
                  /* template:array_get { */((i).get(0))/* } */ +
                    dx_off));
            
//#line 703
if (dtemp >
                               dmax) {
                
//#line 704
itemp =
                  /* template:array_get { */((i).get(0))/* } */;
                
//#line 705
dmax =
                  dtemp;
            }
        }/* } */
        }
        /* } */
        
        
//#line 708
return itemp;
    }
    
    
//#line 740
private double
                   epslon(
                   final double x) {
        
//#line 741
final double a =
          4.0 /
          3.0;
        
//#line 742
double eps =
          0;
        
//#line 743
while (eps ==
                              0) {
            
//#line 744
double b =
              a -
              1.0;
            
//#line 745
double c =
              b +
              b +
              b;
            
//#line 746
eps =
              myabs(
                c -
                  1.0);
        }
        
//#line 748
return (eps *
                               myabs(
                                 x));
    }
    
    
//#line 772
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
        
//#line 779
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
            
//#line 780
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
            
//#line 780
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
    
    
//#line 59
public Linpack() {
        
//#line 59
super();
    }
}
