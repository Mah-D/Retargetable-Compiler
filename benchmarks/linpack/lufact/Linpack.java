package lufact;

import jgfutil.*;
import x10.lang.*;

public class Linpack
extends x10.
  lang.
  Object
{
    
//#line 61
x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 62
x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 63
x10.
      lang.
      DoubleReferenceArray
      x;
    
//#line 64
double
      ops;
    
//#line 64
double
      total;
    
//#line 64
double
      norma;
    
//#line 64
double
      normx;
    
//#line 65
double
      resid;
    
//#line 65
double
      time;
    
//#line 66
double
      kf;
    
//#line 67
int
      n;
    
//#line 67
int
      i;
    
//#line 67
int
      ntimes;
    
//#line 67
int
      info;
    
//#line 67
int
      lda;
    
//#line 67
int
      ldaa;
    
//#line 67
int
      kflops;
    
//#line 68
int[]
      ipvt;
    
    
//#line 70
final double
                  read(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final int j) {
        
//#line 71
return (((x10.
                               compilergenerated.
                               BoxedDouble)
                               (/* template:Future { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                               distribution).get(/* Join: { */i,j/* } */))/* } */)).runFuture(new x10.runtime.Future_c.Activity() {
                                  private x10.lang.Object x10_result_;
                                  public void runSource() {
                                     
                                     this.x10_result_ = (new x10.
                                  compilergenerated.
                                  BoxedDouble(
                                  /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */));
                                  }
                                  public x10.lang.Object getResult() {
                                     return x10_result_;
                                  }
                                })/* } */).
                                 force())).
                             doubleValue();
    }
    
    
//#line 73
final void
                  write(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final int j,
                  final double val) {
        
//#line 74
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                  distribution).get(/* Join: { */i,j/* } */))/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 74
/* template:Atomic { */
            synchronized (x10.lang.Runtime.here()) {
            	try {
            		{
                
//#line 74
/* template:array_set { */(a).set(val,/* Join: { */i,j/* } */)/* } */;
            }
            	} finally {
            		x10.lang.Runtime.here().notifyAll();
            	}
            }/* } */
        }
        		}
        	});/* } */
    }
    
    
//#line 76
final void
                  plusWrite(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final int j,
                  final double val) {
        
//#line 77
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                  distribution).get(/* Join: { */i,j/* } */))/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 77
/* template:Atomic { */
            synchronized (x10.lang.Runtime.here()) {
            	try {
            		{
                
//#line 77
/* template:array_set { */(a).addSet(val,/* Join: { */i,j/* } */)/* } */;
            }
            	} finally {
            		x10.lang.Runtime.here().notifyAll();
            	}
            }/* } */
        }
        		}
        	});/* } */
    }
    
    
//#line 79
final void
                  plusWrite(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final double val) {
        
//#line 80
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                  distribution).get(i))/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 80
/* template:Atomic { */
            synchronized (x10.lang.Runtime.here()) {
            	try {
            		{
                
//#line 80
/* template:array_set { */(a).addSet(val,i)/* } */;
            }
            	} finally {
            		x10.lang.Runtime.here().notifyAll();
            	}
            }/* } */
        }
        		}
        	});/* } */
    }
    
    
//#line 82
final void
                  timesWrite(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final int j,
                  final double val) {
        
//#line 83
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                  distribution).get(/* Join: { */i,j/* } */))/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 83
/* template:Atomic { */
            synchronized (x10.lang.Runtime.here()) {
            	try {
            		{
                
//#line 83
/* template:array_set { */(a).mulSet(val,/* Join: { */i,j/* } */)/* } */;
            }
            	} finally {
            		x10.lang.Runtime.here().notifyAll();
            	}
            }/* } */
        }
        		}
        	});/* } */
    }
    
    
//#line 85
final void
                  timesWrite(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int i,
                  final double val) {
        
//#line 86
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                  distribution).get(i))/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 86
/* template:Atomic { */
            synchronized (x10.lang.Runtime.here()) {
            	try {
            		{
                
//#line 86
/* template:array_set { */(a).mulSet(val,i)/* } */;
            }
            	} finally {
            		x10.lang.Runtime.here().notifyAll();
            	}
            }/* } */
        }
        		}
        	});/* } */
    }
    
    
//#line 89
final double
                  abs(
                  double d) {
        
//#line 90
return ((d >=
                               0))
          ? d
          : -d;
    }
    
    
//#line 93
final double
                  matgen(
                  final x10.
                    lang.
                    DoubleReferenceArray a,
                  final int lda,
                  final int n,
                  final x10.
                    lang.
                    DoubleReferenceArray b) {
        
//#line 95
int init =
          1325;
        
//#line 96
double norma =
          0.0;
        
//#line 100
/* template:forloop-mult { */{
        x10.lang.region __var38__ = (x10.lang.region) a.
                                                        distribution.
                                                        region;
        if (__var38__.size() > 0 && (__var38__ instanceof x10.array.MultiDimRegion || __var38__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var39__ = __var38__.rank(0).low(), __var40__ = __var38__.rank(0).high(); __var39__ <= __var40__; __var39__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var41__ = __var38__.rank(1).low(), __var42__ = __var38__.rank(1).high(); __var41__ <= __var42__; __var41__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var39__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var41__;
        /* } */
        /* } */
{
            
//#line 101
init =
              3125 *
                init %
                65536;
            
//#line 102
double value =
              ((init -
                  32768.0)) /
              16384.0;
            
//#line 103
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 103
write(
                               a,
                               i,
                               j,
                               value);
            }
            	} catch (Throwable tmp43) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp43);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 104
norma =
              (value >
                 norma
                 ? value
                 : norma);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var38__).iterator(); __var0____.hasNext(); ) {
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
            
//#line 101
init =
              3125 *
                init %
                65536;
            
//#line 102
double value =
              ((init -
                  32768.0)) /
              16384.0;
            
//#line 103
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 103
write(
                               a,
                               i,
                               j,
                               value);
            }
            	} catch (Throwable tmp44) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 104
norma =
              (value >
                 norma
                 ? value
                 : norma);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 106
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 106
/* template:ateach { */
            {
            	x10.lang.dist __var1____distCopy = b.
                                                  distribution; // make copy to avoid recomputation
            	for (java.util.Iterator __var1____ = __var1____distCopy.iterator();
            		 __var1____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var1__).get(1))/* } */;/* } */
            		((x10.runtime.Place) __var1____distCopy.get(__var1__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
                
//#line 106
/* template:array_set { */(b).set(0.0,/* Join: { */i,j/* } */)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp45) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp45);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 107
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 107
/* template:ateach { */
            {
            	x10.lang.dist __var2____distCopy = a.
                                                  distribution.
                                                  restriction(
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
                                                        1),
                                                    x10.
                                                      lang.
                                                      region.
                                                      factory.
                                                      region(
                                                      0,
                                                      n -
                                                        1))); // make copy to avoid recomputation
            	for (java.util.Iterator __var2____ = __var2____distCopy.iterator();
            		 __var2____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var2__).get(1))/* } */;/* } */
            		((x10.runtime.Place) __var2____distCopy.get(__var2__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;
final int j =
              /* template:array_get { */((__var2__).get(1))/* } */;/* } */
{
                
//#line 107
plusWrite(
                               b,
                               0,
                               j,
                               /* template:array_get { */((a).get(/* Join: { */i,j/* } */))/* } */);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp46) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp46);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 108
return norma;
    }
    
    
//#line 111
int
      infodgefa =
      0;
    
    
//#line 156
final int
                   dgefa(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final int[] ipvt) {
        
//#line 159
infodgefa =
          0;
        
//#line 160
final int nm1 =
          n -
          1;
        
//#line 162
if (nm1 >=
                           0) {
            
//#line 165
/* template:forloop-mult { */{
            x10.lang.region __var47__ = (x10.lang.region) x10.
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
            if (__var47__.size() > 0 && (__var47__ instanceof x10.array.MultiDimRegion || __var47__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var48__ = __var47__.rank(0).low(), __var49__ = __var47__.rank(0).high(); __var48__ <= __var49__; __var48__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var48__;
            /* } */
            /* } */
{
                
//#line 166
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 166
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                               distribution).get(/* Join: { */k,1/* } */))/* } */)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 167
final int kp1 =
                          k +
                          1;
                        
//#line 169
final int l =
                          idamax(
                            n -
                              k,
                            a,
                            k,
                            k,
                            1) +
                          k;
                        
//#line 170
ipvt[k] =
                          l;
                        
//#line 172
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 173
if (l !=
                                               k) {
                                
//#line 175
if (l !=
                                                   k) {
                                    
//#line 176
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 177
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 178
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 182
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 184
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 188
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 189
/* template:forloop-mult { */{
                                x10.lang.region __var52__ = (x10.lang.region) x10.
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
                                if (__var52__.size() > 0 && (__var52__ instanceof x10.array.MultiDimRegion || __var52__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var53__ = __var52__.rank(0).low(), __var54__ = __var52__.rank(0).high(); __var53__ <= __var54__; __var53__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var53__;
                                /* } */
                                /* } */
{
                                    
//#line 190
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                                               distribution).get(/* Join: { */j,l/* } */))/* } */)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 191
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 192
if (l !=
                                                           k) {
                                            
//#line 193
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 194
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 196
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
                                for (java.util.Iterator __var4____ = (__var52__).iterator(); __var4____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var4__ = (x10.
                                  lang.
                                  point) __var4____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                    
//#line 190
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                                               distribution).get(/* Join: { */j,l/* } */))/* } */)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 191
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 192
if (l !=
                                                           k) {
                                            
//#line 193
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 194
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 196
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
                            	} catch (Throwable tmp51) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp51);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 201
infodgefa =
                              k;
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp50) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp50);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var47__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 166
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 166
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                               distribution).get(/* Join: { */k,1/* } */))/* } */)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 167
final int kp1 =
                          k +
                          1;
                        
//#line 169
final int l =
                          idamax(
                            n -
                              k,
                            a,
                            k,
                            k,
                            1) +
                          k;
                        
//#line 170
ipvt[k] =
                          l;
                        
//#line 172
if (/* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */ !=
                                           0) {
                            
//#line 173
if (l !=
                                               k) {
                                
//#line 175
if (l !=
                                                   k) {
                                    
//#line 176
double t =
                                      /* template:array_get { */((a).get(/* Join: { */k,l/* } */))/* } */;
                                    
//#line 177
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */k,l/* } */)/* } */;
                                    
//#line 178
/* template:array_set { */(a).set(t,/* Join: { */k,k/* } */)/* } */;
                                }
                            }
                            
//#line 182
final double tx =
                              -1.0 /
                              /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */;
                            
//#line 184
dscal(
                                           n -
                                             ((kp1)),
                                           tx,
                                           a,
                                           k,
                                           kp1,
                                           1);
                            
//#line 188
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 189
/* template:forloop-mult { */{
                                x10.lang.region __var57__ = (x10.lang.region) x10.
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
                                if (__var57__.size() > 0 && (__var57__ instanceof x10.array.MultiDimRegion || __var57__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var58__ = __var57__.rank(0).low(), __var59__ = __var57__.rank(0).high(); __var58__ <= __var59__; __var58__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j = __var58__;
                                /* } */
                                /* } */
{
                                    
//#line 190
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                                               distribution).get(/* Join: { */j,l/* } */))/* } */)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 191
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 192
if (l !=
                                                           k) {
                                            
//#line 193
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 194
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 196
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
                                for (java.util.Iterator __var4____ = (__var57__).iterator(); __var4____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var4__ = (x10.
                                  lang.
                                  point) __var4____.next();
                                	/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                    
//#line 190
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:array_get { */((a.
                                                                                                                               distribution).get(/* Join: { */j,l/* } */))/* } */)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 191
double t =
                                          /* template:array_get { */((a).get(/* Join: { */j,l/* } */))/* } */;
                                        
//#line 192
if (l !=
                                                           k) {
                                            
//#line 193
/* template:array_set { */(a).set(/* template:array_get { */((a).get(/* Join: { */j,k/* } */))/* } */,/* Join: { */j,l/* } */)/* } */;
                                            
//#line 194
/* template:array_set { */(a).set(t,/* Join: { */j,k/* } */)/* } */;
                                        }
                                        
//#line 196
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
                            	} catch (Throwable tmp56) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp56);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        } else {
                            
//#line 201
infodgefa =
                              k;
                        }
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp55) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp55);
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
        
//#line 206
ipvt[n -
                            1] =
          n -
            1;
        
//#line 207
double val =
          read(
            a,
            n -
              1,
            n -
              1);
        
//#line 208
if (val ==
                           0) {
            
//#line 208
info =
              n -
                1;
        }
        
//#line 210
return infodgefa;
    }
    
    
//#line 268
final void
                   dgesl(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final int lda,
                   final int n,
                   final int[] ipvt,
                   final x10.
                     lang.
                     DoubleReferenceArray b,
                   final int job) {
        
//#line 270
final int nm1 =
          n -
          1;
        
//#line 271
if (job ==
                           0) {
            
//#line 273
if (nm1 >=
                               1) {
                
//#line 274
/* template:forloop-mult { */{
                x10.lang.region __var60__ = (x10.lang.region) x10.
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
                if (__var60__.size() > 0 && (__var60__ instanceof x10.array.MultiDimRegion || __var60__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var61__ = __var60__.rank(0).low(), __var62__ = __var60__.rank(0).high(); __var61__ <= __var62__; __var61__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int k = __var61__;
                /* } */
                /* } */
{
                    
//#line 275
final int l =
                      ipvt[k];
                    
//#line 276
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 277
if (l !=
                                       k) {
                        
//#line 278
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 279
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 281
final int kp1 =
                      k +
                      1;
                    
//#line 282
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
                for (java.util.Iterator __var5____ = (__var60__).iterator(); __var5____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var5__ = (x10.
                  lang.
                  point) __var5____.next();
                	/* Join: { *//* Join: { */final int k =
                  /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                    
//#line 275
final int l =
                      ipvt[k];
                    
//#line 276
double t =
                      /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                    
//#line 277
if (l !=
                                       k) {
                        
//#line 278
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 279
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                    
//#line 281
final int kp1 =
                      k +
                      1;
                    
//#line 282
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
            
//#line 287
/* template:forloop-mult { */{
            x10.lang.region __var63__ = (x10.lang.region) x10.
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
            if (__var63__.size() > 0 && (__var63__ instanceof x10.array.MultiDimRegion || __var63__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var64__ = __var63__.rank(0).low(), __var65__ = __var63__.rank(0).high(); __var64__ <= __var65__; __var64__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int kb = __var64__;
            /* } */
            /* } */
{
                
//#line 288
final int k =
                  n -
                  ((kb +
                      1));
                
//#line 289
/* template:array_set { */(b).divSet(read(
                                                                    a,
                                                                    k,
                                                                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 290
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 291
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
            for (java.util.Iterator __var6____ = (__var63__).iterator(); __var6____.hasNext(); ) {
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
/* template:array_set { */(b).divSet(read(
                                                                    a,
                                                                    k,
                                                                    k),/* Join: { */0,k/* } */)/* } */;
                
//#line 290
double t =
                  -/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */;
                
//#line 291
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
            
//#line 296
/* template:forloop-mult { */{
            x10.lang.region __var66__ = (x10.lang.region) x10.
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
            if (__var66__.size() > 0 && (__var66__ instanceof x10.array.MultiDimRegion || __var66__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var67__ = __var66__.rank(0).low(), __var68__ = __var66__.rank(0).high(); __var67__ <= __var68__; __var67__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var67__;
            /* } */
            /* } */
{
                
//#line 297
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
                
//#line 298
/* template:array_set { */(b).set(((/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ -
                                                                   t)) /
                  /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */0,k/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var7____ = (__var66__).iterator(); __var7____.hasNext(); ) {
            	final  x10.
              lang.
              point __var7__ = (x10.
              lang.
              point) __var7____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                
//#line 297
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
                
//#line 298
/* template:array_set { */(b).set(((/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */ -
                                                                   t)) /
                  /* template:array_get { */((a).get(/* Join: { */k,k/* } */))/* } */,/* Join: { */0,k/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 302
if (nm1 >=
                               1) {
                
//#line 303
/* template:forloop-mult { */{
                x10.lang.region __var69__ = (x10.lang.region) x10.
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
                if (__var69__.size() > 0 && (__var69__ instanceof x10.array.MultiDimRegion || __var69__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var70__ = __var69__.rank(0).low(), __var71__ = __var69__.rank(0).high(); __var70__ <= __var71__; __var70__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int kb = __var70__;
                /* } */
                /* } */
{
                    
//#line 304
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 305
final int kp1 =
                      k +
                      1;
                    
//#line 306
/* template:array_set { */(b).addSet(ddot(
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
                    
//#line 307
final int l =
                      ipvt[k];
                    
//#line 308
if (l !=
                                       k) {
                        
//#line 309
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 310
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 311
/* template:array_set { */(b).set(t,/* Join: { */0,k/* } */)/* } */;
                    }
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var8____ = (__var69__).iterator(); __var8____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                	/* Join: { *//* Join: { */final int kb =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 304
final int k =
                      n -
                      ((kb +
                          1));
                    
//#line 305
final int kp1 =
                      k +
                      1;
                    
//#line 306
/* template:array_set { */(b).addSet(ddot(
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
                    
//#line 307
final int l =
                      ipvt[k];
                    
//#line 308
if (l !=
                                       k) {
                        
//#line 309
double t =
                          /* template:array_get { */((b).get(/* Join: { */0,l/* } */))/* } */;
                        
//#line 310
/* template:array_set { */(b).set(/* template:array_get { */((b).get(/* Join: { */0,k/* } */))/* } */,/* Join: { */0,l/* } */)/* } */;
                        
//#line 311
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
    
    
//#line 322
final void
                   daxpy(
                   int n,
                   double da,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxCol,
                   final int dx_off,
                   int incx,
                   x10.
                     lang.
                     DoubleReferenceArray dy,
                   int dyCol,
                   int dy_off,
                   int incy) {
        
//#line 325
if (((n >
                             0)) &&
                           ((da !=
                               0))) {
            
//#line 326
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 328
int ix =
                  0;
                
//#line 329
int iy =
                  0;
                
//#line 330
if (incx <
                                   0) {
                    
//#line 330
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 331
if (incy <
                                   0) {
                    
//#line 331
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 332
/* template:forloop-mult { */{
                x10.lang.region __var72__ = (x10.lang.region) x10.
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
                if (__var72__.size() > 0 && (__var72__ instanceof x10.array.MultiDimRegion || __var72__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var73__ = __var72__.rank(0).low(), __var74__ = __var72__.rank(0).high(); __var73__ <= __var74__; __var73__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var73__;
                /* } */
                /* } */
{
                    
//#line 334
/* template:array_set { */(dy).addSet(da *
                      read(
                        dx,
                        dxCol,
                        ix +
                          dx_off),/* Join: { */dyCol,iy +
                      dy_off/* } */)/* } */;
                    
//#line 335
ix +=
                      incx;
                    
//#line 336
iy +=
                      incy;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var9____ = (__var72__).iterator(); __var9____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var9__ = (x10.
                  lang.
                  point) __var9____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                    
//#line 334
/* template:array_set { */(dy).addSet(da *
                      read(
                        dx,
                        dxCol,
                        ix +
                          dx_off),/* Join: { */dyCol,iy +
                      dy_off/* } */)/* } */;
                    
//#line 335
ix +=
                      incx;
                    
//#line 336
iy +=
                      incy;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 338
return;
            }
            
//#line 341
/* template:forloop-mult { */{
            x10.lang.region __var75__ = (x10.lang.region) x10.
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
            if (__var75__.size() > 0 && (__var75__ instanceof x10.array.MultiDimRegion || __var75__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var76__ = __var75__.rank(0).low(), __var77__ = __var75__.rank(0).high(); __var76__ <= __var77__; __var76__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var76__;
            /* } */
            /* } */
{
                
//#line 342
/* template:array_set { */(dy).addSet(da *
                  read(
                    dx,
                    dxCol,
                    i +
                      dx_off),/* Join: { */dyCol,i +
                  dy_off/* } */)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var10____ = (__var75__).iterator(); __var10____.hasNext(); ) {
            	final  x10.
              lang.
              point __var10__ = (x10.
              lang.
              point) __var10____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                
//#line 342
/* template:array_set { */(dy).addSet(da *
                  read(
                    dx,
                    dxCol,
                    i +
                      dx_off),/* Join: { */dyCol,i +
                  dy_off/* } */)/* } */;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }
    }
    
    
//#line 350
final double
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
        
//#line 353
double dtemp =
          0;
        
//#line 354
if (n >
                           0) {
            
//#line 355
if (incx !=
                               1 ||
                               incy !=
                               1) {
                
//#line 357
int ix =
                  0;
                
//#line 358
int iy =
                  0;
                
//#line 359
if (incx <
                                   0) {
                    
//#line 359
ix =
                      ((-n +
                          1)) *
                        incx;
                }
                
//#line 360
if (incy <
                                   0) {
                    
//#line 360
iy =
                      ((-n +
                          1)) *
                        incy;
                }
                
//#line 361
/* template:forloop-mult { */{
                x10.lang.region __var78__ = (x10.lang.region) x10.
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
                if (__var78__.size() > 0 && (__var78__ instanceof x10.array.MultiDimRegion || __var78__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var79__ = __var78__.rank(0).low(), __var80__ = __var78__.rank(0).high(); __var79__ <= __var80__; __var79__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var79__;
                /* } */
                /* } */
{
                    
//#line 362
dtemp +=
                      /* template:array_get { */((dx).get(/* Join: { */dxCol,ix +
                        dx_off/* } */))/* } */ *
                        /* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                        dy_off/* } */))/* } */;
                    
//#line 363
ix +=
                      incx;
                    
//#line 364
iy +=
                      incy;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var11____ = (__var78__).iterator(); __var11____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var11__ = (x10.
                  lang.
                  point) __var11____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                    
//#line 362
dtemp +=
                      /* template:array_get { */((dx).get(/* Join: { */dxCol,ix +
                        dx_off/* } */))/* } */ *
                        /* template:array_get { */((dy).get(/* Join: { */dyCol,iy +
                        dy_off/* } */))/* } */;
                    
//#line 363
ix +=
                      incx;
                    
//#line 364
iy +=
                      incy;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            } else {
                
//#line 368
/* template:forloop-mult { */{
                x10.lang.region __var81__ = (x10.lang.region) x10.
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
                if (__var81__.size() > 0 && (__var81__ instanceof x10.array.MultiDimRegion || __var81__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var82__ = __var81__.rank(0).low(), __var83__ = __var81__.rank(0).high(); __var82__ <= __var83__; __var82__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var82__;
                /* } */
                /* } */
{
                    
//#line 369
dtemp +=
                      /* template:array_get { */((dx).get(/* Join: { */dxCol,i +
                        dx_off/* } */))/* } */ *
                        /* template:array_get { */((dy).get(/* Join: { */dyCol,i +
                        dy_off/* } */))/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var12____ = (__var81__).iterator(); __var12____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var12__ = (x10.
                  lang.
                  point) __var12____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                    
//#line 369
dtemp +=
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
        
//#line 372
return dtemp;
    }
    
    
//#line 379
final void
                   dscal(
                   int n,
                   double da,
                   x10.
                     lang.
                     DoubleReferenceArray dx,
                   int currentCol,
                   int dx_off,
                   int incx) {
        
//#line 381
if (n >
                           0) {
            
//#line 382
if (incx !=
                               1) {
                
//#line 384
final int nincx =
                  n *
                  incx;
                
//#line 385
for (
//#line 385
int i =
                                    0;
                                  i <
                                    nincx;
                                  
//#line 385
i +=
                                    incx) {
                    
//#line 386
/* template:array_set { */(dx).mulSet(da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                }
            } else {
                
//#line 389
/* template:forloop-mult { */{
                x10.lang.region __var84__ = (x10.lang.region) x10.
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
                if (__var84__.size() > 0 && (__var84__ instanceof x10.array.MultiDimRegion || __var84__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var85__ = __var84__.rank(0).low(), __var86__ = __var84__.rank(0).high(); __var85__ <= __var86__; __var85__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var85__;
                /* } */
                /* } */
{
                    
//#line 390
/* template:array_set { */(dx).mulSet(da,/* Join: { */currentCol,i +
                      dx_off/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var13____ = (__var84__).iterator(); __var13____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var13__ = (x10.
                  lang.
                  point) __var13____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                    
//#line 390
/* template:array_set { */(dx).mulSet(da,/* Join: { */currentCol,i +
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
    
    
//#line 402
final int
                   idamax(
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray dx,
                   final int dxk,
                   final int dx_off,
                   final int incx) {
        
//#line 404
if (n <
                           1) {
            
//#line 404
return -1;
        }
        
//#line 405
if (n ==
                           1) {
            
//#line 405
return 0;
        }
        
//#line 406
if (incx !=
                           1) {
            
//#line 408
int itemp =
              0;
            
//#line 409
double dmax =
              abs(
                read(
                  dx,
                  dxk,
                  0 +
                    dx_off));
            
//#line 410
int ix =
              1 +
              incx;
            
//#line 411
/* template:forloop-mult { */{
            x10.lang.region __var87__ = (x10.lang.region) x10.
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
                                                                1));
            if (__var87__.size() > 0 && (__var87__ instanceof x10.array.MultiDimRegion || __var87__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var88__ = __var87__.rank(0).low(), __var89__ = __var87__.rank(0).high(); __var88__ <= __var89__; __var88__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var88__;
            /* } */
            /* } */
{
                
//#line 412
double dtemp =
                  abs(
                    read(
                      dx,
                      dxk,
                      ix +
                        dx_off));
                
//#line 413
if (dtemp >
                                   dmax) {
                    
//#line 414
itemp =
                      i;
                    
//#line 415
dmax =
                      dtemp;
                }
                
//#line 417
ix +=
                  incx;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var14____ = (__var87__).iterator(); __var14____.hasNext(); ) {
            	final  x10.
              lang.
              point __var14__ = (x10.
              lang.
              point) __var14____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
                
//#line 412
double dtemp =
                  abs(
                    read(
                      dx,
                      dxk,
                      ix +
                        dx_off));
                
//#line 413
if (dtemp >
                                   dmax) {
                    
//#line 414
itemp =
                      i;
                    
//#line 415
dmax =
                      dtemp;
                }
                
//#line 417
ix +=
                  incx;
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 419
return itemp;
        }
        
//#line 422
int itemp =
          0;
        
//#line 423
double dmax =
          abs(
            read(
              dx,
              dxk,
              0 +
                dx_off));
        
//#line 424
/* template:forloop-mult { */{
        x10.lang.region __var90__ = (x10.lang.region) x10.
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
                                                            1));
        if (__var90__.size() > 0 && (__var90__ instanceof x10.array.MultiDimRegion || __var90__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var91__ = __var90__.rank(0).low(), __var92__ = __var90__.rank(0).high(); __var91__ <= __var92__; __var91__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var91__;
        /* } */
        /* } */
{
            
//#line 425
double dtemp =
              abs(
                read(
                  dx,
                  dxk,
                  i +
                    dx_off));
            
//#line 426
if (dtemp >
                               dmax) {
                
//#line 427
itemp =
                  i;
                
//#line 428
dmax =
                  dtemp;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var15____ = (__var90__).iterator(); __var15____.hasNext(); ) {
        	final  x10.
          lang.
          point __var15__ = (x10.
          lang.
          point) __var15____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
            
//#line 425
double dtemp =
              abs(
                read(
                  dx,
                  dxk,
                  i +
                    dx_off));
            
//#line 426
if (dtemp >
                               dmax) {
                
//#line 427
itemp =
                  i;
                
//#line 428
dmax =
                  dtemp;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 431
return itemp;
    }
    
    
//#line 463
final double
                   epslon(
                   final double x) {
        
//#line 465
final double a =
          4.0 /
          3.0;
        
//#line 466
double eps =
          0;
        
//#line 467
while (eps ==
                              0) {
            
//#line 468
double b =
              a -
              1.0;
            
//#line 469
double c =
              b +
              b +
              b;
            
//#line 470
eps =
              abs(
                c -
                  1.0);
        }
        
//#line 472
return (eps *
                               abs(
                                 x));
    }
    
    
//#line 496
final void
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
        
//#line 499
/* template:forloop-mult { */{
        x10.lang.region __var93__ = (x10.lang.region) x10.
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
        if (__var93__.size() > 0 && (__var93__ instanceof x10.array.MultiDimRegion || __var93__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var94__ = __var93__.rank(0).low(), __var95__ = __var93__.rank(0).high(); __var94__ <= __var95__; __var94__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var96__ = __var93__.rank(1).low(), __var97__ = __var93__.rank(1).high(); __var96__ <= __var97__; __var96__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var94__;
        /* } */
        /* template:final-var-assign { */
        final int i = __var96__;
        /* } */
        /* } */
{
            
//#line 500
/* template:array_set { */(y).addSet(/* template:array_get { */((x).get(/* Join: { */0,j/* } */))/* } */ *
              read(
                m,
                j,
                i),/* Join: { */0,i/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var16____ = (__var93__).iterator(); __var16____.hasNext(); ) {
        	final  x10.
          lang.
          point __var16__ = (x10.
          lang.
          point) __var16____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var16__).get(0))/* } */;
final int i =
          /* template:array_get { */((__var16__).get(1))/* } */;/* } */
{
            
//#line 500
/* template:array_set { */(y).addSet(/* template:array_get { */((x).get(/* Join: { */0,j/* } */))/* } */ *
              read(
                m,
                j,
                i),/* Join: { */0,i/* } */)/* } */;
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
