import x10.lang.*;

public class Series
extends x10.
  lang.
  Object
{
    
//#line 4
private int
      setsize;
    
//#line 8
public int
      array_rows;
    
//#line 9
public x10.
      lang.
      DoubleReferenceArray
      testArray;
    
    
//#line 16
public void
                  setSize(
                  final int setsize) {
        
//#line 17
this.
                      setsize =
          setsize;
    }
    
    
//#line 20
public void
                  initialise(
                  final int n) {
        
//#line 21
array_rows =
          n;
        
//#line 22
buildTestData();
    }
    
    
//#line 25
public void
                  kernel(
                  ) {
        
//#line 26
Do();
    }
    
    
//#line 29
public void
                  initRefArray(
                  final x10.
                    lang.
                    DoubleReferenceArray ref) {
        
//#line 31
/* template:array_set { */(ref).set(2.8729524964837996,/* Join: { */0,0/* } */)/* } */;
        
//#line 32
/* template:array_set { */(ref).set(0.0,/* Join: { */0,1/* } */)/* } */;
        
//#line 33
/* template:array_set { */(ref).set(1.1161046676147888,/* Join: { */1,0/* } */)/* } */;
        
//#line 34
/* template:array_set { */(ref).set(-1.8819691893398025,/* Join: { */1,1/* } */)/* } */;
        
//#line 35
/* template:array_set { */(ref).set(0.34429060398168704,/* Join: { */2,0/* } */)/* } */;
        
//#line 36
/* template:array_set { */(ref).set(-1.1645642623320958,/* Join: { */2,1/* } */)/* } */;
        
//#line 37
/* template:array_set { */(ref).set(0.15238898702519288,/* Join: { */3,0/* } */)/* } */;
        
//#line 38
/* template:array_set { */(ref).set(-0.8143461113044298,/* Join: { */3,1/* } */)/* } */;
    }
    
    
//#line 41
public void
                  validate(
                  ) {
        
//#line 43
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
        
//#line 44
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
        
//#line 45
final x10.
          lang.
          DoubleReferenceArray ref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 46
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 49
initRefArray(
                      ref);
        
//#line 51
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
            
//#line 53
final int ii =
              i;
            
//#line 54
final int jj =
              j;
            
//#line 55
double cval =
              0;
            
//#line 57
final x10.
              lang.
              place curr_place =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 59
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
            
//#line 60
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
            
//#line 61
final x10.
              lang.
              DoubleReferenceArray tempref =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public double apply(/* Join: { */x10.
              lang.
              point p0/* } */, double dummy) { {
                
//#line 62
return 0.0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 65
final x10.
              lang.
              DoubleReferenceArray tA =
              testArray;
            
//#line 66
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 66
/* template:Async { */(x10.lang.Runtime.asPlace(testArray.
                                                                              distribution.
                                                                              get(
                                                                              j,
                                                                              i))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 68
final double temp =
                      /* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */;
                    
//#line 69
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 71
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
            
            
//#line 75
cval =
              /* template:array_get { */((tempref).get(0))/* } */;
            
//#line 77
double error =
              java.
                lang.
                Math.
                abs(
                cval -
                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 78
if (error >
                              1.0E-12) {
                
//#line 79
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Validation failed for coefficient " +
                                                                                                                                 j +
                                                                                                                                 "," +
                                                                                                                                 i);
                
//#line 80
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Computed value = " +
                                                                                                                                 cval);
                
//#line 81
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Reference value = " +
                                                                                                                                 /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 82
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
            
//#line 53
final int ii =
              i;
            
//#line 54
final int jj =
              j;
            
//#line 55
double cval =
              0;
            
//#line 57
final x10.
              lang.
              place curr_place =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 59
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
            
//#line 60
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
            
//#line 61
final x10.
              lang.
              DoubleReferenceArray tempref =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public double apply(/* Join: { */x10.
              lang.
              point p0/* } */, double dummy) { {
                
//#line 62
return 0.0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 65
final x10.
              lang.
              DoubleReferenceArray tA =
              testArray;
            
//#line 66
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 66
/* template:Async { */(x10.lang.Runtime.asPlace(testArray.
                                                                              distribution.
                                                                              get(
                                                                              j,
                                                                              i))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 68
final double temp =
                      /* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */;
                    
//#line 69
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 71
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
            
            
//#line 75
cval =
              /* template:array_get { */((tempref).get(0))/* } */;
            
//#line 77
double error =
              java.
                lang.
                Math.
                abs(
                cval -
                  /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 78
if (error >
                              1.0E-12) {
                
//#line 79
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Validation failed for coefficient " +
                                                                                                                                 j +
                                                                                                                                 "," +
                                                                                                                                 i);
                
//#line 80
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Computed value = " +
                                                                                                                                 cval);
                
//#line 81
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("Reference value = " +
                                                                                                                                 /* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 82
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
    
    
//#line 87
public void
                  tidyup(
                  ) {
        
//#line 88
freeTestData();
    }
    
    
//#line 91
public void
                  run(
                  ) {
        
//#line 93
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
        
//#line 94
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
        
//#line 95
int j =
          10000;
        
//#line 96
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
            
//#line 99
setSize(
                          0);
            
//#line 100
initialise(
                           (int)
                             ((j *
                                 java.
                                   lang.
                                   Math.
                                   pow(
                                   100,
                                   0))));
            
//#line 101
kernel();
            
//#line 102
validate();
        }/* } */
        }
        /* } */
        
        
//#line 104
tidyup();
    }
    
    
//#line 110
public Series() {
        
//#line 111
super();
    }
    
    
//#line 115
public void
                   buildTestData(
                   ) {
        
//#line 118
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
        
//#line 119
final x10.
          lang.
          dist d =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 119
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 119
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
        
//#line 120
testArray =
          (x10.
            lang.
            DoubleReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
    }
    
    
//#line 131
public void
                   Do(
                   ) {
        
//#line 137
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
        
//#line 147
final double omega =
          (double)
            3.141592653589793;
        
//#line 148
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
        
//#line 149
final x10.
          lang.
          DoubleReferenceArray tA =
          testArray;
        
//#line 150
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 151
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
                
//#line 152
int ilow =
                  0;
                
//#line 154
if (U.
                                   get(
                                   p).
                                   isFirst()) {
                    
//#line 155
ilow =
                      1;
                } else {
                    
//#line 157
ilow =
                      0;
                }
                
//#line 159
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
                    
//#line 160
if (/* template:array_get { */((pp).get(1))/* } */ >=
                                       ilow) {
                        
//#line 166
if (/* template:array_get { */((pp).get(0))/* } */ ==
                                           0) {
                            
//#line 167
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
                            
//#line 175
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
    
    
//#line 199
private double
                   TrapezoidIntegrate(
                   final double x0,
                   final double x1,
                   final int a_nsteps,
                   final double omegan,
                   final int select) {
        
//#line 205
double x =
          0.0;
        
//#line 206
double dx =
          0.0;
        
//#line 207
double rvalue =
          0.0;
        
//#line 209
int nsteps =
          a_nsteps;
        
//#line 213
x =
          x0;
        
//#line 217
dx =
          ((x1 -
              x0)) /
            (double)
              nsteps;
        
//#line 221
rvalue =
          thefunction(
            x0,
            omegan,
            select) /
            (double)
              2.0;
        
//#line 225
if (nsteps !=
                           1) {
            
//#line 227
nsteps--;
            
//#line 228
nsteps--;
            
//#line 229
while (nsteps >
                                  0) {
                
//#line 231
x =
                  x +
                    dx;
                
//#line 232
rvalue =
                  rvalue +
                    thefunction(
                      x,
                      omegan,
                      select);
                
//#line 233
nsteps--;
            }
        }
        
//#line 239
rvalue =
          ((rvalue +
              thefunction(
                x1,
                omegan,
                select) /
              (double)
                2.0)) *
            dx;
        
//#line 240
return (rvalue);
    }
    
    
//#line 251
private double
                   thefunction(
                   final double x,
                   final double omegan,
                   final int select) {
        
//#line 257
switch (select) {
            
//#line 259
case 0:
                
//#line 259
return (java.
                                       lang.
                                       Math.
                                       pow(
                                       x +
                                         (double)
                                           1.0,
                                       x));
            
//#line 260
case 1:
                
//#line 260
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
            
//#line 261
case 2:
                
//#line 261
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
        
//#line 267
return (0.0);
    }
    
    
//#line 276
public void
                   freeTestData(
                   ) {
        
    }
}
