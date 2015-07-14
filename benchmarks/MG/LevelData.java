import x10.lang.*;

public class LevelData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
    
//#line 42
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 42
return "";
    }
    
    
//#line 46
final public static boolean
      PERF_On =
      Util.
        PERF_OUTPUT;
    
//#line 47
final public static double
      PERF_Comp =
      1.0 /
      Util.
        FP_PERCLOCK;
    
//#line 48
final public static double
      PERF_CommL =
      Util.
        COMM_LATENCY *
      Util.
        CLOCK_SPEED;
    
//#line 49
final public static double
      PERF_CommB =
      (((double)
          Util.
            CLOCK_SPEED /
          (double)
            Util.
              COMM_BANDWIDTH)) *
      8.0;
    
//#line 50
final public static boolean
      PERF_InLoop =
      Util.
        IN_LOOP;
    
//#line 51
final public static boolean
      PERF_CompOnly =
      Util.
        COMP_ONLY;
    
//#line 52
final public static boolean
      PERF_CommOnly =
      Util.
        COMM_ONLY;
    
//#line 57
final public boolean
      EXCHANGE_After;
    
//#line 59
final public static int
      N_PLACES =
      Util.
        N_PLACES;
    
//#line 60
final public static int
      HIGH =
      Util.
        HIGH;
    
//#line 61
final public static int
      LOW =
      Util.
        LOW;
    
//#line 63
final private int
      SIZE;
    
//#line 64
final private x10.
      lang.
      region
      P_DOMAIN;
    
//#line 65
final private boolean
      ISPARALLEL;
    
//#line 67
final private x10.
      lang.
      GenericReferenceArray
      m_regions;
    
//#line 68
final private x10.
      lang.
      GenericReferenceArray
      m_REGIONs;
    
//#line 70
final private x10.
      lang.
      GenericReferenceArray
      m_boundaries;
    
//#line 72
final private x10.
      lang.
      dist
      m_places;
    
//#line 73
final private int
      m_numPlaces;
    
//#line 75
final private x10.
      lang.
      region
      m_placeGrid;
    
//#line 77
final private int
      m_size0;
    
//#line 78
final private int
      m_size1;
    
//#line 79
final private int
      m_size2;
    
//#line 80
final private int
      m_block0;
    
//#line 81
final private int
      m_block1;
    
//#line 82
final private int
      m_block2;
    
//#line 83
final private x10.
      lang.
      GenericReferenceArray
      m_dist;
    
//#line 84
final private x10.
      lang.
      GenericReferenceArray
      m_DIST;
    
//#line 85
final private x10.
      lang.
      GenericReferenceArray
      m_u;
    
    
//#line 89
public x10.
                  lang.
                  dist
                  getPlaces(
                  ) {
        
//#line 89
return m_places;
    }
    
    
//#line 90
public x10.
                  lang.
                  DoubleReferenceArray
                  getArray(
                  final int a_idx) {
        
//#line 92
return (x10.
                             lang.
                             DoubleReferenceArray)
                             ((/* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(a_idx))/* } */))/* } */.
                                 m_array));
    }
    
    
//#line 94
public x10.
                  lang.
                  region
                  getInnerRegion(
                  final int a_idx) {
        
//#line 96
return (x10.
                             lang.
                             region)
                             get_m_regions(
                               a_idx);
    }
    
    
//#line 98
public x10.
                  lang.
                  region
                  getINNERRegion(
                  final int a_idx) {
        
//#line 100
x10.
          lang.
          region R =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 100
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 100
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            3)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            /* template:parametric { */((x10.
              lang.
              region)(/* template:array_get { */((m_regions).get(a_idx))/* } */))/* } */);
        
//#line 101
return (x10.
                              lang.
                              region)
                              ((x10.
                                  lang.
                                  region.
                                  factory.
                                  region(
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      0).
                                      low() +
                                      1,
                                    R.
                                      rank(
                                      0).
                                      high() -
                                      1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      1).
                                      low() +
                                      1,
                                    R.
                                      rank(
                                      1).
                                      high() -
                                      1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      2).
                                      low() +
                                      1,
                                    R.
                                      rank(
                                      2).
                                      high() -
                                      1))));
    }
    
    
//#line 103
public x10.
                   lang.
                   region
                   getShrinkedRegion(
                   final int a_idx) {
        
//#line 105
x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            get_m_REGIONs(
              a_idx);
        
//#line 106
return (x10.
                              lang.
                              region)
                              ((x10.
                                  lang.
                                  region.
                                  factory.
                                  region(
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      0).
                                      low(),
                                    R.
                                      rank(
                                      0).
                                      high() -
                                      1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      1).
                                      low(),
                                    R.
                                      rank(
                                      1).
                                      high() -
                                      1),
                                  x10.
                                    lang.
                                    region.
                                    factory.
                                    region(
                                    R.
                                      rank(
                                      2).
                                      low(),
                                    R.
                                      rank(
                                      2).
                                      high() -
                                      1))));
    }
    
    
//#line 109
public x10.
                   lang.
                   region
                   getRegion(
                   final int a_idx) {
        
//#line 111
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 111
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 111
return (((((((x10.
                                                                lang.
                                                                region)
                                                                x10_generated_objToCast)).
                                                              rank() ==
                                                              3)))
                                                           ? (x10.
                                                               lang.
                                                               region)
                                                               x10_generated_objToCast
                                                           : (x10.
                                                               lang.
                                                               region)
                                                               x10.
                                                                 runtime.
                                                                 RuntimeCastChecker.
                                                                 throwClassCastException(
                                                                 (x10.
                                                                   lang.
                                                                   region)
                                                                   x10_generated_objToCast,
                                                                 "Constraint is not meet"));
                                }
                            }.
                              checkCast(
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((m_REGIONs).get(a_idx))/* } */))/* } */);
    }
    
    
//#line 114
private void
                   print(
                   ) {
        
//#line 115
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 115
/* template:ateach { */
            {
            	x10.lang.dist __var0____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var0____ = __var0____distCopy.iterator();
            		 __var0____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var0__ = (x10.
              lang.
              point) __var0____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var0____distCopy.get(__var0__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                
//#line 116
double res =
                  0;
                
//#line 117
x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 118
/* template:forloop { */
                for (java.util.Iterator p__ = (/* template:parametric { */((x10.
                  lang.
                  region)(/* template:array_get { */((m_REGIONs).get(i))/* } */))/* } */).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 118
res =
                      res +
                        java.
                          lang.
                          Math.
                          abs(
                          /* template:array_get { */((temp).get(p))/* } */);
                }/* } */
                }
                /* } */
                
                
//#line 119
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("block at place " +
                                                                                                                                  i +
                                                                                                                                  " : " +
                                                                                                                                  temp.
                                                                                                                                    region +
                                                                                                                                  " sum of m_u=" +
                                                                                                                                  res);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp44) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 123
private void
                   PRINT(
                   ) {
        
//#line 124
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 124
/* template:ateach { */
            {
            	x10.lang.dist __var1____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var1____ = __var1____distCopy.iterator();
            		 __var1____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var1____distCopy.get(__var1__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 125
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("block at place " +
                                                                                                                                  i +
                                                                                                                                  " : ");
                
//#line 126
x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 127
int counter =
                  0;
                
//#line 128
/* template:forloop { */
                for (java.util.Iterator p__ = (/* template:parametric { */((x10.
                  lang.
                  region)(/* template:array_get { */((m_regions).get(i))/* } */))/* } */).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 129
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.print(" [" +
                                                                                                                                    p +
                                                                                                                                    "]= " +
                                                                                                                                    /* template:array_get { */((temp).get(p))/* } */);
                    
//#line 129
counter++;
                    
//#line 130
if (counter ==
                                       4) {
                        
//#line 130
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.print("\n");
                        
//#line 130
counter =
                          0;
                    }
                }/* } */
                }
                /* } */
                
                
//#line 133
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("");
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
        
    }
    
    
//#line 136
public double
                   norm2(
                   ) {
        
//#line 137
final x10.
          lang.
          DoubleReferenceArray results =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(m_places,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 138
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 138
/* template:ateach { */
            {
            	x10.lang.dist __var2____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var2____ = __var2____distCopy.iterator();
            		 __var2____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var2____distCopy.get(__var2__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 139
double res =
                  0;
                
//#line 140
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 141
/* template:forloop { */
                for (java.util.Iterator p__ = (get_m_regions(
                                                 i)).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 143
final x10.
                      lang.
                      place h =
                      /* template:here { */x10.lang.Runtime.here()/* } */;
                    
//#line 144
final x10.
                      lang.
                      dist dRecv =
                      (x10.
                        lang.
                        dist)
                        ((x10.
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
                            /* template:here { */x10.lang.Runtime.here()/* } */)));
                    
//#line 145
final x10.
                      lang.
                      DoubleReferenceArray aRecv =
                      /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                    
//#line 146
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 146
/* template:Async { */(x10.lang.Runtime.asPlace(temp.
                                                                                       distribution.
                                                                                       get(
                                                                                       p))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 147
final double temp3 =
                              /* template:array_get { */((temp).get(p))/* } */ *
                              /* template:array_get { */((temp).get(p))/* } */;
                            
//#line 148
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 148
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp47) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp47);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 150
res =
                      res +
                        /* template:array_get { */((aRecv).get(0))/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 152
/* template:array_set { */(results).set(res,i)/* } */;
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
        
        
//#line 154
double temp =
          results.
            sum() /
          ((SIZE *
              SIZE *
              SIZE));
        
//#line 156
return java.
                              lang.
                              Math.
                              sqrt(
                              temp);
    }
    
    
//#line 159
public void
                   initialize(
                   final int a_CLASS) {
        
//#line 160
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 160
/* template:ateach { */
            {
            	x10.lang.dist __var3____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var3____ = __var3____distCopy.iterator();
            		 __var3____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var3____distCopy.get(__var3__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 161
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 174
final x10.
                  lang.
                  region R =
                  get_m_regions(
                    i);
                
//#line 177
/* template:foreach { */
                for (java.util.Iterator p__ = (temp.
                                                 distribution).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { */final int x =
                  /* template:array_get { */((p).get(0))/* } */;
final int y =
                  /* template:array_get { */((p).get(1))/* } */;
final int z =
                  /* template:array_get { */((p).get(2))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int x =
                  /* template:array_get { */((p).get(0))/* } */;
final int y =
                  /* template:array_get { */((p).get(1))/* } */;
final int z =
                  /* template:array_get { */((p).get(2))/* } */;/* } */
{
                    
//#line 178
switch (a_CLASS) {
                        
//#line 179
case 1:
                            
//#line 180
if (((((((x ==
                                                     0)) &&
                                                   ((y ==
                                                       11)) &&
                                                   ((z ==
                                                       2)))) ||
                                                 ((((x ==
                                                       13)) &&
                                                     ((y ==
                                                         8)) &&
                                                     ((z ==
                                                         17)))) ||
                                                 ((((x ==
                                                       5)) &&
                                                     ((y ==
                                                         14)) &&
                                                     ((z ==
                                                         0)))) ||
                                                 ((((x ==
                                                       4)) &&
                                                     ((y ==
                                                         28)) &&
                                                     ((z ==
                                                         15)))) ||
                                                 ((((x ==
                                                       12)) &&
                                                     ((y ==
                                                         2)) &&
                                                     ((z ==
                                                         1)))) ||
                                                 ((((x ==
                                                       5)) &&
                                                     ((y ==
                                                         17)) &&
                                                     ((z ==
                                                         8)))) ||
                                                 ((((x ==
                                                       20)) &&
                                                     ((y ==
                                                         19)) &&
                                                     ((z ==
                                                         11)))) ||
                                                 ((((x ==
                                                       26)) &&
                                                     ((y ==
                                                         15)) &&
                                                     ((z ==
                                                         31)))) ||
                                                 ((((x ==
                                                       8)) &&
                                                     ((y ==
                                                         25)) &&
                                                     ((z ==
                                                         22)))) ||
                                                 ((((x ==
                                                       7)) &&
                                                     ((y ==
                                                         14)) &&
                                                     ((z ==
                                                         26)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 192
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 195
if (((((((x ==
                                                     7)) &&
                                                   ((y ==
                                                       1)) &&
                                                   ((z ==
                                                       20)))) ||
                                                 ((((x ==
                                                       19)) &&
                                                     ((y ==
                                                         29)) &&
                                                     ((z ==
                                                         31)))) ||
                                                 ((((x ==
                                                       2)) &&
                                                     ((y ==
                                                         0)) &&
                                                     ((z ==
                                                         3)))) ||
                                                 ((((x ==
                                                       4)) &&
                                                     ((y ==
                                                         22)) &&
                                                     ((z ==
                                                         3)))) ||
                                                 ((((x ==
                                                       1)) &&
                                                     ((y ==
                                                         16)) &&
                                                     ((z ==
                                                         21)))) ||
                                                 ((((x ==
                                                       21)) &&
                                                     ((y ==
                                                         31)) &&
                                                     ((z ==
                                                         6)))) ||
                                                 ((((x ==
                                                       12)) &&
                                                     ((y ==
                                                         15)) &&
                                                     ((z ==
                                                         12)))) ||
                                                 ((((x ==
                                                       30)) &&
                                                     ((y ==
                                                         4)) &&
                                                     ((z ==
                                                         25)))) ||
                                                 ((((x ==
                                                       28)) &&
                                                     ((y ==
                                                         0)) &&
                                                     ((z ==
                                                         28)))) ||
                                                 ((((x ==
                                                       17)) &&
                                                     ((y ==
                                                         26)) &&
                                                     ((z ==
                                                         17)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 207
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 209
break;
                        
//#line 210
case 2:
                            
//#line 211
if (((((((x ==
                                                     38)) &&
                                                   ((y ==
                                                       60)) &&
                                                   ((z ==
                                                       51)))) ||
                                                 ((((x ==
                                                       50)) &&
                                                     ((y ==
                                                         15)) &&
                                                     ((z ==
                                                         23)))) ||
                                                 ((((x ==
                                                       18)) &&
                                                     ((y ==
                                                         45)) &&
                                                     ((z ==
                                                         36)))) ||
                                                 ((((x ==
                                                       25)) &&
                                                     ((y ==
                                                         14)) &&
                                                     ((z ==
                                                         36)))) ||
                                                 ((((x ==
                                                       26)) &&
                                                     ((y ==
                                                         25)) &&
                                                     ((z ==
                                                         25)))) ||
                                                 ((((x ==
                                                       32)) &&
                                                     ((y ==
                                                         37)) &&
                                                     ((z ==
                                                         0)))) ||
                                                 ((((x ==
                                                       29)) &&
                                                     ((y ==
                                                         62)) &&
                                                     ((z ==
                                                         54)))) ||
                                                 ((((x ==
                                                       39)) &&
                                                     ((y ==
                                                         49)) &&
                                                     ((z ==
                                                         57)))) ||
                                                 ((((x ==
                                                       12)) &&
                                                     ((y ==
                                                         29)) &&
                                                     ((z ==
                                                         28)))) ||
                                                 ((((x ==
                                                       63)) &&
                                                     ((y ==
                                                         46)) &&
                                                     ((z ==
                                                         25)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 223
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 226
if (((((((x ==
                                                     27)) &&
                                                   ((y ==
                                                       32)) &&
                                                   ((z ==
                                                       45)))) ||
                                                 ((((x ==
                                                       39)) &&
                                                     ((y ==
                                                         0)) &&
                                                     ((z ==
                                                         5)))) ||
                                                 ((((x ==
                                                       45)) &&
                                                     ((y ==
                                                         23)) &&
                                                     ((z ==
                                                         49)))) ||
                                                 ((((x ==
                                                       20)) &&
                                                     ((y ==
                                                         32)) &&
                                                     ((z ==
                                                         58)))) ||
                                                 ((((x ==
                                                       23)) &&
                                                     ((y ==
                                                         47)) &&
                                                     ((z ==
                                                         57)))) ||
                                                 ((((x ==
                                                       17)) &&
                                                     ((y ==
                                                         43)) &&
                                                     ((z ==
                                                         53)))) ||
                                                 ((((x ==
                                                       8)) &&
                                                     ((y ==
                                                         16)) &&
                                                     ((z ==
                                                         48)))) ||
                                                 ((((x ==
                                                       51)) &&
                                                     ((y ==
                                                         46)) &&
                                                     ((z ==
                                                         26)))) ||
                                                 ((((x ==
                                                       58)) &&
                                                     ((y ==
                                                         19)) &&
                                                     ((z ==
                                                         62)))) ||
                                                 ((((x ==
                                                       58)) &&
                                                     ((y ==
                                                         15)) &&
                                                     ((z ==
                                                         54)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 238
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 240
break;
                        
//#line 241
case 3:
                        
//#line 241
case 4:
                            
//#line 242
if (((((((x ==
                                                     221)) &&
                                                   ((y ==
                                                       40)) &&
                                                   ((z ==
                                                       238)))) ||
                                                 ((((x ==
                                                       152)) &&
                                                     ((y ==
                                                         160)) &&
                                                     ((z ==
                                                         34)))) ||
                                                 ((((x ==
                                                       80)) &&
                                                     ((y ==
                                                         182)) &&
                                                     ((z ==
                                                         253)))) ||
                                                 ((((x ==
                                                       248)) &&
                                                     ((y ==
                                                         168)) &&
                                                     ((z ==
                                                         155)))) ||
                                                 ((((x ==
                                                       197)) &&
                                                     ((y ==
                                                         5)) &&
                                                     ((z ==
                                                         201)))) ||
                                                 ((((x ==
                                                       90)) &&
                                                     ((y ==
                                                         61)) &&
                                                     ((z ==
                                                         203)))) ||
                                                 ((((x ==
                                                       15)) &&
                                                     ((y ==
                                                         203)) &&
                                                     ((z ==
                                                         30)))) ||
                                                 ((((x ==
                                                       99)) &&
                                                     ((y ==
                                                         154)) &&
                                                     ((z ==
                                                         57)))) ||
                                                 ((((x ==
                                                       100)) &&
                                                     ((y ==
                                                         136)) &&
                                                     ((z ==
                                                         110)))) ||
                                                 ((((x ==
                                                       209)) &&
                                                     ((y ==
                                                         152)) &&
                                                     ((z ==
                                                         96)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 254
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 257
if (((((((x ==
                                                     52)) &&
                                                   ((y ==
                                                       207)) &&
                                                   ((z ==
                                                       38)))) ||
                                                 ((((x ==
                                                       241)) &&
                                                     ((y ==
                                                         170)) &&
                                                     ((z ==
                                                         12)))) ||
                                                 ((((x ==
                                                       201)) &&
                                                     ((y ==
                                                         16)) &&
                                                     ((z ==
                                                         196)))) ||
                                                 ((((x ==
                                                       200)) &&
                                                     ((y ==
                                                         81)) &&
                                                     ((z ==
                                                         207)))) ||
                                                 ((((x ==
                                                       113)) &&
                                                     ((y ==
                                                         121)) &&
                                                     ((z ==
                                                         205)))) ||
                                                 ((((x ==
                                                       210)) &&
                                                     ((y ==
                                                         5)) &&
                                                     ((z ==
                                                         246)))) ||
                                                 ((((x ==
                                                       43)) &&
                                                     ((y ==
                                                         192)) &&
                                                     ((z ==
                                                         232)))) ||
                                                 ((((x ==
                                                       174)) &&
                                                     ((y ==
                                                         244)) &&
                                                     ((z ==
                                                         162)))) ||
                                                 ((((x ==
                                                       3)) &&
                                                     ((y ==
                                                         116)) &&
                                                     ((z ==
                                                         173)))) ||
                                                 ((((x ==
                                                       55)) &&
                                                     ((y ==
                                                         118)) &&
                                                     ((z ==
                                                         165)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 269
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 271
break;
                        
//#line 272
case 5:
                            
//#line 273
if (((((((x ==
                                                     397)) &&
                                                   ((y ==
                                                       310)) &&
                                                   ((z ==
                                                       198)))) ||
                                                 ((((x ==
                                                       94)) &&
                                                     ((y ==
                                                         399)) &&
                                                     ((z ==
                                                         236)))) ||
                                                 ((((x ==
                                                       221)) &&
                                                     ((y ==
                                                         276)) &&
                                                     ((z ==
                                                         59)))) ||
                                                 ((((x ==
                                                       342)) &&
                                                     ((y ==
                                                         137)) &&
                                                     ((z ==
                                                         166)))) ||
                                                 ((((x ==
                                                       381)) &&
                                                     ((y ==
                                                         72)) &&
                                                     ((z ==
                                                         281)))) ||
                                                 ((((x ==
                                                       350)) &&
                                                     ((y ==
                                                         192)) &&
                                                     ((z ==
                                                         416)))) ||
                                                 ((((x ==
                                                       16)) &&
                                                     ((y ==
                                                         19)) &&
                                                     ((z ==
                                                         455)))) ||
                                                 ((((x ==
                                                       152)) &&
                                                     ((y ==
                                                         336)) &&
                                                     ((z ==
                                                         8)))) ||
                                                 ((((x ==
                                                       400)) &&
                                                     ((y ==
                                                         502)) &&
                                                     ((z ==
                                                         447)))) ||
                                                 ((((x ==
                                                       72)) &&
                                                     ((y ==
                                                         0)) &&
                                                     ((z ==
                                                         105)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 285
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 288
if (((((((x ==
                                                     308)) &&
                                                   ((y ==
                                                       359)) &&
                                                   ((z ==
                                                       9)))) ||
                                                 ((((x ==
                                                       9)) &&
                                                     ((y ==
                                                         491)) &&
                                                     ((z ==
                                                         116)))) ||
                                                 ((((x ==
                                                       449)) &&
                                                     ((y ==
                                                         268)) &&
                                                     ((z ==
                                                         441)))) ||
                                                 ((((x ==
                                                       147)) &&
                                                     ((y ==
                                                         115)) &&
                                                     ((z ==
                                                         197)))) ||
                                                 ((((x ==
                                                       241)) &&
                                                     ((y ==
                                                         85)) &&
                                                     ((z ==
                                                         3)))) ||
                                                 ((((x ==
                                                       507)) &&
                                                     ((y ==
                                                         41)) &&
                                                     ((z ==
                                                         125)))) ||
                                                 ((((x ==
                                                       161)) &&
                                                     ((y ==
                                                         278)) &&
                                                     ((z ==
                                                         73)))) ||
                                                 ((((x ==
                                                       144)) &&
                                                     ((y ==
                                                         91)) &&
                                                     ((z ==
                                                         310)))) ||
                                                 ((((x ==
                                                       201)) &&
                                                     ((y ==
                                                         8)) &&
                                                     ((z ==
                                                         49)))) ||
                                                 ((((x ==
                                                       149)) &&
                                                     ((y ==
                                                         399)) &&
                                                     ((z ==
                                                         329)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 300
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 302
break;
                        
//#line 303
case 6:
                            
//#line 304
if (((((((x ==
                                                     186)) &&
                                                   ((y ==
                                                       374)) &&
                                                   ((z ==
                                                       694)))) ||
                                                 ((((x ==
                                                       773)) &&
                                                     ((y ==
                                                         345)) &&
                                                     ((z ==
                                                         474)))) ||
                                                 ((((x ==
                                                       478)) &&
                                                     ((y ==
                                                         874)) &&
                                                     ((z ==
                                                         804)))) ||
                                                 ((((x ==
                                                       306)) &&
                                                     ((y ==
                                                         75)) &&
                                                     ((z ==
                                                         624)))) ||
                                                 ((((x ==
                                                       397)) &&
                                                     ((y ==
                                                         667)) &&
                                                     ((z ==
                                                         49)))) ||
                                                 ((((x ==
                                                       606)) &&
                                                     ((y ==
                                                         199)) &&
                                                     ((z ==
                                                         59)))) ||
                                                 ((((x ==
                                                       892)) &&
                                                     ((y ==
                                                         70)) &&
                                                     ((z ==
                                                         361)))) ||
                                                 ((((x ==
                                                       844)) &&
                                                     ((y ==
                                                         261)) &&
                                                     ((z ==
                                                         252)))) ||
                                                 ((((x ==
                                                       221)) &&
                                                     ((y ==
                                                         906)) &&
                                                     ((z ==
                                                         14)))) ||
                                                 ((((x ==
                                                       85)) &&
                                                     ((y ==
                                                         327)) &&
                                                     ((z ==
                                                         232)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 316
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 319
if (((((((x ==
                                                     739)) &&
                                                   ((y ==
                                                       879)) &&
                                                   ((z ==
                                                       781)))) ||
                                                 ((((x ==
                                                       742)) &&
                                                     ((y ==
                                                         641)) &&
                                                     ((z ==
                                                         147)))) ||
                                                 ((((x ==
                                                       335)) &&
                                                     ((y ==
                                                         295)) &&
                                                     ((z ==
                                                         600)))) ||
                                                 ((((x ==
                                                       982)) &&
                                                     ((y ==
                                                         944)) &&
                                                     ((z ==
                                                         696)))) ||
                                                 ((((x ==
                                                       622)) &&
                                                     ((y ==
                                                         881)) &&
                                                     ((z ==
                                                         180)))) ||
                                                 ((((x ==
                                                       956)) &&
                                                     ((y ==
                                                         217)) &&
                                                     ((z ==
                                                         952)))) ||
                                                 ((((x ==
                                                       777)) &&
                                                     ((y ==
                                                         453)) &&
                                                     ((z ==
                                                         706)))) ||
                                                 ((((x ==
                                                       258)) &&
                                                     ((y ==
                                                         730)) &&
                                                     ((z ==
                                                         482)))) ||
                                                 ((((x ==
                                                       271)) &&
                                                     ((y ==
                                                         75)) &&
                                                     ((z ==
                                                         815)))) ||
                                                 ((((x ==
                                                       78)) &&
                                                     ((y ==
                                                         276)) &&
                                                     ((z ==
                                                         250)))))) &&
                                               R.
                                                 contains(
                                                 p)) {
                                
//#line 331
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 333
break;
                    }
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp48) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp48);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 339
if (EXCHANGE_After) {
            
//#line 339
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 339
exchange();
            }
            	} catch (Throwable tmp49) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp49);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 342
public void
                   set(
                   final double a_db) {
        
//#line 344
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 344
/* template:ateach { */
            {
            	x10.lang.dist __var4____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var4____ = __var4____distCopy.iterator();
            		 __var4____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var4__ = (x10.
              lang.
              point) __var4____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var4____distCopy.get(__var4__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                
//#line 345
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    get_m_u(
                      i).
                      m_array;
                
//#line 346
/* template:forloop { */
                for (java.util.Iterator p__ = (get_m_regions(
                                                 i)).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 346
/* template:array_set { */(temp).set(a_db,p)/* } */;
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
        	} catch (Throwable tmp50) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp50);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 348
if (EXCHANGE_After) {
            
//#line 348
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 348
exchange();
            }
            	} catch (Throwable tmp51) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp51);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 351
public void
                   setLevelData(
                   final LevelData a_LD) {
        
//#line 353
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 353
/* template:ateach { */
            {
            	x10.lang.dist __var5____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var5____ = __var5____distCopy.iterator();
            		 __var5____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var5__ = (x10.
              lang.
              point) __var5____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var5____distCopy.get(__var5__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                
//#line 354
final x10.
                  lang.
                  DoubleReferenceArray u =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 355
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 370
final x10.
                  lang.
                  region mri =
                  get_m_regions(
                    i);
                
//#line 371
/* template:forloop { */
                for (java.util.Iterator p__ = (mri).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 372
final double tp =
                      /* template:array_get { */((temp).get(p))/* } */;
                    
//#line 373
/* template:Async { */(x10.lang.Runtime.asPlace(u.
                                                                                   distribution.
                                                                                   get(
                                                                                   p))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 373
/* template:array_set { */(u).set(tp,p)/* } */;
                    }
                    		}
                    	});/* } */
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
        	} catch (Throwable tmp52) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp52);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 376
if (EXCHANGE_After) {
            
//#line 376
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 376
exchange();
            }
            	} catch (Throwable tmp53) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp53);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 379
public void
                   add(
                   final LevelData a_LD) {
        
//#line 381
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 381
/* template:ateach { */
            {
            	x10.lang.dist __var6____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var6____ = __var6____distCopy.iterator();
            		 __var6____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var6____distCopy.get(__var6__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 382
final x10.
                  lang.
                  DoubleReferenceArray u =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    get_m_u(
                      i).
                      m_array;
                
//#line 383
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 384
/* template:forloop { */
                for (java.util.Iterator p__ = (get_m_regions(
                                                 i)).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 385
/* template:array_set { */(u).set(/* template:array_get { */((u).get(p))/* } */ +
                      /* template:array_get { */((temp).get(p))/* } */,p)/* } */;
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
        	} catch (Throwable tmp54) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp54);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 388
if (EXCHANGE_After) {
            
//#line 388
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 388
exchange();
            }
            	} catch (Throwable tmp55) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp55);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 392
private void
                   Exchange(
                   ) {
        
//#line 393
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
                                                          2));
        if (__var56__.size() > 0 && (__var56__ instanceof x10.array.MultiDimRegion || __var56__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var57__ = __var56__.rank(0).low(), __var58__ = __var56__.rank(0).high(); __var57__ <= __var58__; __var57__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var57__;
        /* } */
        /* } */
{
            
//#line 395
final int jj =
              j;
            
//#line 396
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 396
/* template:ateach { */
                {
                	x10.lang.dist __var8____distCopy = m_places; // make copy to avoid recomputation
                	for (java.util.Iterator __var8____ = __var8____distCopy.iterator();
                		 __var8____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var8____distCopy.get(__var8__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 397
final int dest0 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(0))/* } */;
                    
//#line 398
final int dest1 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(1))/* } */;
                    
//#line 399
final int dest2 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(2))/* } */;
                    
//#line 400
final int ii =
                      i;
                    
//#line 402
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
                                                                      LOW,
                                                                      HIGH));
                    if (__var60__.size() > 0 && (__var60__ instanceof x10.array.MultiDimRegion || __var60__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var61__ = __var60__.rank(0).low(), __var62__ = __var60__.rank(0).high(); __var61__ <= __var62__; __var61__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var61__;
                    /* } */
                    /* } */
{
                        
//#line 403
int disp0 =
                          0;
                        
//#line 404
int disp1 =
                          0;
                        
//#line 405
int disp2 =
                          0;
                        
//#line 406
int source0 =
                          0;
                        
//#line 407
int source1 =
                          0;
                        
//#line 408
int source2 =
                          0;
                        
//#line 409
int trans0 =
                          0;
                        
//#line 410
int trans1 =
                          0;
                        
//#line 411
int trans2 =
                          0;
                        
//#line 412
int sourceID =
                          0;
                        
//#line 413
int k =
                          0;
                        
//#line 414
if (p ==
                                           LOW) {
                            
//#line 415
k =
                              jj *
                                2;
                            
//#line 416
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 417
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 418
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 421
k =
                              jj *
                                2 +
                                1;
                            
//#line 422
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 423
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 424
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 426
source0 =
                          dest0 -
                            disp0;
                        
//#line 427
source1 =
                          dest1 -
                            disp1;
                        
//#line 428
source2 =
                          dest2 -
                            disp2;
                        
//#line 430
if (m_placeGrid.
                                           contains(
                                           x10.
                                             lang.
                                             point.
                                             factory.
                                             point(
                                             source0,
                                             source1,
                                             source2))) {
                            
//#line 431
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 432
Util.
                                           arraycopy3(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           (x10.
                                             lang.
                                             region)
                                             get_m_boundaries(
                                               k,
                                               ii),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array);
                        } else {
                            
//#line 437
if (jj ==
                                               0) {
                                
//#line 438
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 439
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 440
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 442
if (jj ==
                                                   1) {
                                    
//#line 443
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 444
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 445
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 448
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 449
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 450
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 452
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 453
if (jj ==
                                               0) {
                                
//#line 454
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 455
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 456
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 458
if (jj ==
                                                   1) {
                                    
//#line 459
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 460
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 461
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 464
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 465
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 466
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 468
Util.
                                           arraycopy4(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           new x10.
                                             runtime.
                                             RuntimeCastChecker.
                                             DepTypeRuntimeChecking(
                                             ) {
                                               
                                               
//#line 469
public x10.
                                                              lang.
                                                              region
                                                              checkCast(
                                                              final x10.
                                                                lang.
                                                                region x10_generated_objToCast) {
                                                   
//#line 469
return (((((((x10.
                                                                               lang.
                                                                               region)
                                                                               x10_generated_objToCast)).
                                                                             rank() ==
                                                                             3)))
                                                                          ? (x10.
                                                                              lang.
                                                                              region)
                                                                              x10_generated_objToCast
                                                                          : (x10.
                                                                              lang.
                                                                              region)
                                                                              x10.
                                                                                runtime.
                                                                                RuntimeCastChecker.
                                                                                throwClassCastException(
                                                                                (x10.
                                                                                  lang.
                                                                                  region)
                                                                                  x10_generated_objToCast,
                                                                                "Constraint is not meet"));
                                               }
                                           }.
                                             checkCast(
                                             /* template:parametric { */((x10.
                                               lang.
                                               region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array,
                                           trans0,
                                           trans1,
                                           trans2);
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var9____ = (__var60__).iterator(); __var9____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var9__ = (x10.
                      lang.
                      point) __var9____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                        
//#line 403
int disp0 =
                          0;
                        
//#line 404
int disp1 =
                          0;
                        
//#line 405
int disp2 =
                          0;
                        
//#line 406
int source0 =
                          0;
                        
//#line 407
int source1 =
                          0;
                        
//#line 408
int source2 =
                          0;
                        
//#line 409
int trans0 =
                          0;
                        
//#line 410
int trans1 =
                          0;
                        
//#line 411
int trans2 =
                          0;
                        
//#line 412
int sourceID =
                          0;
                        
//#line 413
int k =
                          0;
                        
//#line 414
if (p ==
                                           LOW) {
                            
//#line 415
k =
                              jj *
                                2;
                            
//#line 416
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 417
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 418
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 421
k =
                              jj *
                                2 +
                                1;
                            
//#line 422
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 423
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 424
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 426
source0 =
                          dest0 -
                            disp0;
                        
//#line 427
source1 =
                          dest1 -
                            disp1;
                        
//#line 428
source2 =
                          dest2 -
                            disp2;
                        
//#line 430
if (m_placeGrid.
                                           contains(
                                           x10.
                                             lang.
                                             point.
                                             factory.
                                             point(
                                             source0,
                                             source1,
                                             source2))) {
                            
//#line 431
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 432
Util.
                                           arraycopy3(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           (x10.
                                             lang.
                                             region)
                                             get_m_boundaries(
                                               k,
                                               ii),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array);
                        } else {
                            
//#line 437
if (jj ==
                                               0) {
                                
//#line 438
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 439
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 440
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 442
if (jj ==
                                                   1) {
                                    
//#line 443
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 444
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 445
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 448
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 449
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 450
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 452
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 453
if (jj ==
                                               0) {
                                
//#line 454
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 455
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 456
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 458
if (jj ==
                                                   1) {
                                    
//#line 459
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 460
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 461
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 464
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 465
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 466
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 468
Util.
                                           arraycopy4(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           new x10.
                                             runtime.
                                             RuntimeCastChecker.
                                             DepTypeRuntimeChecking(
                                             ) {
                                               
                                               
//#line 469
public x10.
                                                              lang.
                                                              region
                                                              checkCast(
                                                              final x10.
                                                                lang.
                                                                region x10_generated_objToCast) {
                                                   
//#line 469
return (((((((x10.
                                                                               lang.
                                                                               region)
                                                                               x10_generated_objToCast)).
                                                                             rank() ==
                                                                             3)))
                                                                          ? (x10.
                                                                              lang.
                                                                              region)
                                                                              x10_generated_objToCast
                                                                          : (x10.
                                                                              lang.
                                                                              region)
                                                                              x10.
                                                                                runtime.
                                                                                RuntimeCastChecker.
                                                                                throwClassCastException(
                                                                                (x10.
                                                                                  lang.
                                                                                  region)
                                                                                  x10_generated_objToCast,
                                                                                "Constraint is not meet"));
                                               }
                                           }.
                                             checkCast(
                                             /* template:parametric { */((x10.
                                               lang.
                                               region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array,
                                           trans0,
                                           trans1,
                                           trans2);
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
            	} catch (Throwable tmp59) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp59);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var7____ = (__var56__).iterator(); __var7____.hasNext(); ) {
        	final  x10.
          lang.
          point __var7__ = (x10.
          lang.
          point) __var7____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
            
//#line 395
final int jj =
              j;
            
//#line 396
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 396
/* template:ateach { */
                {
                	x10.lang.dist __var8____distCopy = m_places; // make copy to avoid recomputation
                	for (java.util.Iterator __var8____ = __var8____distCopy.iterator();
                		 __var8____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var8____distCopy.get(__var8__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 397
final int dest0 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(0))/* } */;
                    
//#line 398
final int dest1 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(1))/* } */;
                    
//#line 399
final int dest2 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(2))/* } */;
                    
//#line 400
final int ii =
                      i;
                    
//#line 402
/* template:forloop-mult { */{
                    x10.lang.region __var64__ = (x10.lang.region) x10.
                                                                    lang.
                                                                    region.
                                                                    factory.
                                                                    region(
                                                                    x10.
                                                                      lang.
                                                                      region.
                                                                      factory.
                                                                      region(
                                                                      LOW,
                                                                      HIGH));
                    if (__var64__.size() > 0 && (__var64__ instanceof x10.array.MultiDimRegion || __var64__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var65__ = __var64__.rank(0).low(), __var66__ = __var64__.rank(0).high(); __var65__ <= __var66__; __var65__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var65__;
                    /* } */
                    /* } */
{
                        
//#line 403
int disp0 =
                          0;
                        
//#line 404
int disp1 =
                          0;
                        
//#line 405
int disp2 =
                          0;
                        
//#line 406
int source0 =
                          0;
                        
//#line 407
int source1 =
                          0;
                        
//#line 408
int source2 =
                          0;
                        
//#line 409
int trans0 =
                          0;
                        
//#line 410
int trans1 =
                          0;
                        
//#line 411
int trans2 =
                          0;
                        
//#line 412
int sourceID =
                          0;
                        
//#line 413
int k =
                          0;
                        
//#line 414
if (p ==
                                           LOW) {
                            
//#line 415
k =
                              jj *
                                2;
                            
//#line 416
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 417
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 418
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 421
k =
                              jj *
                                2 +
                                1;
                            
//#line 422
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 423
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 424
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 426
source0 =
                          dest0 -
                            disp0;
                        
//#line 427
source1 =
                          dest1 -
                            disp1;
                        
//#line 428
source2 =
                          dest2 -
                            disp2;
                        
//#line 430
if (m_placeGrid.
                                           contains(
                                           x10.
                                             lang.
                                             point.
                                             factory.
                                             point(
                                             source0,
                                             source1,
                                             source2))) {
                            
//#line 431
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 432
Util.
                                           arraycopy3(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           (x10.
                                             lang.
                                             region)
                                             get_m_boundaries(
                                               k,
                                               ii),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array);
                        } else {
                            
//#line 437
if (jj ==
                                               0) {
                                
//#line 438
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 439
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 440
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 442
if (jj ==
                                                   1) {
                                    
//#line 443
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 444
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 445
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 448
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 449
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 450
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 452
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 453
if (jj ==
                                               0) {
                                
//#line 454
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 455
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 456
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 458
if (jj ==
                                                   1) {
                                    
//#line 459
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 460
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 461
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 464
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 465
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 466
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 468
Util.
                                           arraycopy4(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           new x10.
                                             runtime.
                                             RuntimeCastChecker.
                                             DepTypeRuntimeChecking(
                                             ) {
                                               
                                               
//#line 469
public x10.
                                                              lang.
                                                              region
                                                              checkCast(
                                                              final x10.
                                                                lang.
                                                                region x10_generated_objToCast) {
                                                   
//#line 469
return (((((((x10.
                                                                               lang.
                                                                               region)
                                                                               x10_generated_objToCast)).
                                                                             rank() ==
                                                                             3)))
                                                                          ? (x10.
                                                                              lang.
                                                                              region)
                                                                              x10_generated_objToCast
                                                                          : (x10.
                                                                              lang.
                                                                              region)
                                                                              x10.
                                                                                runtime.
                                                                                RuntimeCastChecker.
                                                                                throwClassCastException(
                                                                                (x10.
                                                                                  lang.
                                                                                  region)
                                                                                  x10_generated_objToCast,
                                                                                "Constraint is not meet"));
                                               }
                                           }.
                                             checkCast(
                                             /* template:parametric { */((x10.
                                               lang.
                                               region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array,
                                           trans0,
                                           trans1,
                                           trans2);
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var9____ = (__var64__).iterator(); __var9____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var9__ = (x10.
                      lang.
                      point) __var9____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                        
//#line 403
int disp0 =
                          0;
                        
//#line 404
int disp1 =
                          0;
                        
//#line 405
int disp2 =
                          0;
                        
//#line 406
int source0 =
                          0;
                        
//#line 407
int source1 =
                          0;
                        
//#line 408
int source2 =
                          0;
                        
//#line 409
int trans0 =
                          0;
                        
//#line 410
int trans1 =
                          0;
                        
//#line 411
int trans2 =
                          0;
                        
//#line 412
int sourceID =
                          0;
                        
//#line 413
int k =
                          0;
                        
//#line 414
if (p ==
                                           LOW) {
                            
//#line 415
k =
                              jj *
                                2;
                            
//#line 416
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 417
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 418
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 421
k =
                              jj *
                                2 +
                                1;
                            
//#line 422
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 423
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 424
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 426
source0 =
                          dest0 -
                            disp0;
                        
//#line 427
source1 =
                          dest1 -
                            disp1;
                        
//#line 428
source2 =
                          dest2 -
                            disp2;
                        
//#line 430
if (m_placeGrid.
                                           contains(
                                           x10.
                                             lang.
                                             point.
                                             factory.
                                             point(
                                             source0,
                                             source1,
                                             source2))) {
                            
//#line 431
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 432
Util.
                                           arraycopy3(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           (x10.
                                             lang.
                                             region)
                                             get_m_boundaries(
                                               k,
                                               ii),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array);
                        } else {
                            
//#line 437
if (jj ==
                                               0) {
                                
//#line 438
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 439
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 440
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 442
if (jj ==
                                                   1) {
                                    
//#line 443
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 444
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 445
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 448
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 449
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 450
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 452
sourceID =
                              m_placeGrid.
                                ordinal(
                                x10.
                                  lang.
                                  point.
                                  factory.
                                  point(
                                  source0,
                                  source1,
                                  source2));
                            
//#line 453
if (jj ==
                                               0) {
                                
//#line 454
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 455
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 456
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 458
if (jj ==
                                                   1) {
                                    
//#line 459
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 460
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 461
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 464
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 465
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 466
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 468
Util.
                                           arraycopy4(
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                               m_array,
                                           new x10.
                                             runtime.
                                             RuntimeCastChecker.
                                             DepTypeRuntimeChecking(
                                             ) {
                                               
                                               
//#line 469
public x10.
                                                              lang.
                                                              region
                                                              checkCast(
                                                              final x10.
                                                                lang.
                                                                region x10_generated_objToCast) {
                                                   
//#line 469
return (((((((x10.
                                                                               lang.
                                                                               region)
                                                                               x10_generated_objToCast)).
                                                                             rank() ==
                                                                             3)))
                                                                          ? (x10.
                                                                              lang.
                                                                              region)
                                                                              x10_generated_objToCast
                                                                          : (x10.
                                                                              lang.
                                                                              region)
                                                                              x10.
                                                                                runtime.
                                                                                RuntimeCastChecker.
                                                                                throwClassCastException(
                                                                                (x10.
                                                                                  lang.
                                                                                  region)
                                                                                  x10_generated_objToCast,
                                                                                "Constraint is not meet"));
                                               }
                                           }.
                                             checkCast(
                                             /* template:parametric { */((x10.
                                               lang.
                                               region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */),
                                           (x10.
                                             lang.
                                             DoubleReferenceArray)
                                             /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                               m_array,
                                           trans0,
                                           trans1,
                                           trans2);
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
            	} catch (Throwable tmp63) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp63);
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
    
    
//#line 480
public void
                   exchange(
                   ) {
        
//#line 481
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 483
/* template:forloop-mult { */{
            x10.lang.region __var67__ = (x10.lang.region) x10.
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
            if (__var67__.size() > 0 && (__var67__ instanceof x10.array.MultiDimRegion || __var67__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var68__ = __var67__.rank(0).low(), __var69__ = __var67__.rank(0).high(); __var68__ <= __var69__; __var68__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var68__;
            /* } */
            /* } */
{
                
//#line 485
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 485
/* template:ateach { */
                    {
                    	x10.lang.dist __var11____distCopy = m_places; // make copy to avoid recomputation
                    	for (java.util.Iterator __var11____ = __var11____distCopy.iterator();
                    		 __var11____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var11__ = (x10.
                      lang.
                      point) __var11____.next();
                    		/* Join: { */final int i =
                      /* template:array_get { */((__var11__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var11____distCopy.get(__var11__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                        
//#line 487
final int jj =
                          j;
                        
//#line 488
final int dest0 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(0))/* } */;
                        
//#line 489
final int dest1 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(1))/* } */;
                        
//#line 490
final int dest2 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(2))/* } */;
                        
//#line 491
final int ii =
                          i;
                        
//#line 492
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 492
/* template:foreach { */
                            for (java.util.Iterator __var12____ = (x10.
                                                                     lang.
                                                                     region.
                                                                     factory.
                                                                     region(
                                                                     x10.
                                                                       lang.
                                                                       region.
                                                                       factory.
                                                                       region(
                                                                       LOW,
                                                                       HIGH))).iterator(); __var12____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var12__ = (x10.
                              lang.
                              point) __var12____.next();
                            	/* Join: { */final int p =
                              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int p =
                              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                                
//#line 495
int disp0 =
                                  0;
                                
//#line 496
int disp1 =
                                  0;
                                
//#line 497
int disp2 =
                                  0;
                                
//#line 498
int trans0 =
                                  0;
                                
//#line 499
int trans1 =
                                  0;
                                
//#line 500
int trans2 =
                                  0;
                                
//#line 501
int sourceID =
                                  0;
                                
//#line 502
int k =
                                  0;
                                
//#line 503
if (p ==
                                                   LOW) {
                                    
//#line 504
k =
                                      jj *
                                        2;
                                    
//#line 505
disp0 =
                                      ((jj ==
                                          0
                                          ? 1
                                          : 0));
                                    
//#line 506
disp1 =
                                      ((jj ==
                                          1
                                          ? 1
                                          : 0));
                                    
//#line 507
disp2 =
                                      ((jj ==
                                          2
                                          ? 1
                                          : 0));
                                } else {
                                    
//#line 510
k =
                                      jj *
                                        2 +
                                        1;
                                    
//#line 511
disp0 =
                                      ((jj ==
                                          0
                                          ? -1
                                          : 0));
                                    
//#line 512
disp1 =
                                      ((jj ==
                                          1
                                          ? -1
                                          : 0));
                                    
//#line 513
disp2 =
                                      ((jj ==
                                          2
                                          ? -1
                                          : 0));
                                }
                                
//#line 515
int source0 =
                                  dest0 -
                                  disp0;
                                
//#line 516
int source1 =
                                  dest1 -
                                  disp1;
                                
//#line 517
int source2 =
                                  dest2 -
                                  disp2;
                                
//#line 518
if (m_placeGrid.
                                                   contains(
                                                   x10.
                                                     lang.
                                                     point.
                                                     factory.
                                                     point(
                                                     source0,
                                                     source1,
                                                     source2))) {
                                    
//#line 519
sourceID =
                                      m_placeGrid.
                                        ordinal(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          source0,
                                          source1,
                                          source2));
                                    
//#line 520
x10.
                                      lang.
                                      DoubleReferenceArray ma =
                                      (x10.
                                        lang.
                                        DoubleReferenceArray)
                                        get_m_u(
                                          ii).
                                          m_array;
                                    
//#line 521
Util.
                                                   arraycopy3(
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       ii).
                                                       m_array,
                                                   (x10.
                                                     lang.
                                                     region)
                                                     get_m_boundaries(
                                                       k,
                                                       ii),
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       sourceID).
                                                       m_array);
                                } else {
                                    
//#line 526
if (jj ==
                                                       0) {
                                        
//#line 527
source0 =
                                          dest0 +
                                            disp0 *
                                            ((m_block0 -
                                                1));
                                        
//#line 528
source1 =
                                          dest1 +
                                            disp1 *
                                            ((m_block0 -
                                                1));
                                        
//#line 529
source2 =
                                          dest2 +
                                            disp2 *
                                            ((m_block0 -
                                                1));
                                    } else {
                                        
//#line 531
if (jj ==
                                                           1) {
                                            
//#line 532
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 533
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 534
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block1 -
                                                    1));
                                        } else {
                                            
//#line 537
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 538
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 539
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block2 -
                                                    1));
                                        }
                                    }
                                    
//#line 541
sourceID =
                                      m_placeGrid.
                                        ordinal(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          source0,
                                          source1,
                                          source2));
                                    
//#line 542
if (jj ==
                                                       0) {
                                        
//#line 543
trans0 =
                                          disp0 *
                                            m_size0;
                                        
//#line 544
trans1 =
                                          disp1 *
                                            m_size0;
                                        
//#line 545
trans2 =
                                          disp2 *
                                            m_size0;
                                    } else {
                                        
//#line 547
if (jj ==
                                                           1) {
                                            
//#line 548
trans0 =
                                              disp0 *
                                                m_size1;
                                            
//#line 549
trans1 =
                                              disp1 *
                                                m_size1;
                                            
//#line 550
trans2 =
                                              disp2 *
                                                m_size1;
                                        } else {
                                            
//#line 553
trans0 =
                                              disp0 *
                                                m_size2;
                                            
//#line 554
trans1 =
                                              disp1 *
                                                m_size2;
                                            
//#line 555
trans2 =
                                              disp2 *
                                                m_size2;
                                        }
                                    }
                                    
//#line 557
Util.
                                                   arraycopy4(
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       ii).
                                                       m_array,
                                                   (x10.
                                                     lang.
                                                     region)
                                                     get_m_boundaries(
                                                       k,
                                                       ii),
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       sourceID).
                                                       m_array,
                                                   trans0,
                                                   trans1,
                                                   trans2);
                                }
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp71) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp71);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
                	} catch (Throwable tmp70) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp70);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var10____ = (__var67__).iterator(); __var10____.hasNext(); ) {
            	final  x10.
              lang.
              point __var10__ = (x10.
              lang.
              point) __var10____.next();
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                
//#line 485
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 485
/* template:ateach { */
                    {
                    	x10.lang.dist __var11____distCopy = m_places; // make copy to avoid recomputation
                    	for (java.util.Iterator __var11____ = __var11____distCopy.iterator();
                    		 __var11____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var11__ = (x10.
                      lang.
                      point) __var11____.next();
                    		/* Join: { */final int i =
                      /* template:array_get { */((__var11__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var11____distCopy.get(__var11__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                        
//#line 487
final int jj =
                          j;
                        
//#line 488
final int dest0 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(0))/* } */;
                        
//#line 489
final int dest1 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(1))/* } */;
                        
//#line 490
final int dest2 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(2))/* } */;
                        
//#line 491
final int ii =
                          i;
                        
//#line 492
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 492
/* template:foreach { */
                            for (java.util.Iterator __var12____ = (x10.
                                                                     lang.
                                                                     region.
                                                                     factory.
                                                                     region(
                                                                     x10.
                                                                       lang.
                                                                       region.
                                                                       factory.
                                                                       region(
                                                                       LOW,
                                                                       HIGH))).iterator(); __var12____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var12__ = (x10.
                              lang.
                              point) __var12____.next();
                            	/* Join: { */final int p =
                              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int p =
                              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                                
//#line 495
int disp0 =
                                  0;
                                
//#line 496
int disp1 =
                                  0;
                                
//#line 497
int disp2 =
                                  0;
                                
//#line 498
int trans0 =
                                  0;
                                
//#line 499
int trans1 =
                                  0;
                                
//#line 500
int trans2 =
                                  0;
                                
//#line 501
int sourceID =
                                  0;
                                
//#line 502
int k =
                                  0;
                                
//#line 503
if (p ==
                                                   LOW) {
                                    
//#line 504
k =
                                      jj *
                                        2;
                                    
//#line 505
disp0 =
                                      ((jj ==
                                          0
                                          ? 1
                                          : 0));
                                    
//#line 506
disp1 =
                                      ((jj ==
                                          1
                                          ? 1
                                          : 0));
                                    
//#line 507
disp2 =
                                      ((jj ==
                                          2
                                          ? 1
                                          : 0));
                                } else {
                                    
//#line 510
k =
                                      jj *
                                        2 +
                                        1;
                                    
//#line 511
disp0 =
                                      ((jj ==
                                          0
                                          ? -1
                                          : 0));
                                    
//#line 512
disp1 =
                                      ((jj ==
                                          1
                                          ? -1
                                          : 0));
                                    
//#line 513
disp2 =
                                      ((jj ==
                                          2
                                          ? -1
                                          : 0));
                                }
                                
//#line 515
int source0 =
                                  dest0 -
                                  disp0;
                                
//#line 516
int source1 =
                                  dest1 -
                                  disp1;
                                
//#line 517
int source2 =
                                  dest2 -
                                  disp2;
                                
//#line 518
if (m_placeGrid.
                                                   contains(
                                                   x10.
                                                     lang.
                                                     point.
                                                     factory.
                                                     point(
                                                     source0,
                                                     source1,
                                                     source2))) {
                                    
//#line 519
sourceID =
                                      m_placeGrid.
                                        ordinal(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          source0,
                                          source1,
                                          source2));
                                    
//#line 520
x10.
                                      lang.
                                      DoubleReferenceArray ma =
                                      (x10.
                                        lang.
                                        DoubleReferenceArray)
                                        get_m_u(
                                          ii).
                                          m_array;
                                    
//#line 521
Util.
                                                   arraycopy3(
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       ii).
                                                       m_array,
                                                   (x10.
                                                     lang.
                                                     region)
                                                     get_m_boundaries(
                                                       k,
                                                       ii),
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       sourceID).
                                                       m_array);
                                } else {
                                    
//#line 526
if (jj ==
                                                       0) {
                                        
//#line 527
source0 =
                                          dest0 +
                                            disp0 *
                                            ((m_block0 -
                                                1));
                                        
//#line 528
source1 =
                                          dest1 +
                                            disp1 *
                                            ((m_block0 -
                                                1));
                                        
//#line 529
source2 =
                                          dest2 +
                                            disp2 *
                                            ((m_block0 -
                                                1));
                                    } else {
                                        
//#line 531
if (jj ==
                                                           1) {
                                            
//#line 532
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 533
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 534
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block1 -
                                                    1));
                                        } else {
                                            
//#line 537
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 538
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 539
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block2 -
                                                    1));
                                        }
                                    }
                                    
//#line 541
sourceID =
                                      m_placeGrid.
                                        ordinal(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          source0,
                                          source1,
                                          source2));
                                    
//#line 542
if (jj ==
                                                       0) {
                                        
//#line 543
trans0 =
                                          disp0 *
                                            m_size0;
                                        
//#line 544
trans1 =
                                          disp1 *
                                            m_size0;
                                        
//#line 545
trans2 =
                                          disp2 *
                                            m_size0;
                                    } else {
                                        
//#line 547
if (jj ==
                                                           1) {
                                            
//#line 548
trans0 =
                                              disp0 *
                                                m_size1;
                                            
//#line 549
trans1 =
                                              disp1 *
                                                m_size1;
                                            
//#line 550
trans2 =
                                              disp2 *
                                                m_size1;
                                        } else {
                                            
//#line 553
trans0 =
                                              disp0 *
                                                m_size2;
                                            
//#line 554
trans1 =
                                              disp1 *
                                                m_size2;
                                            
//#line 555
trans2 =
                                              disp2 *
                                                m_size2;
                                        }
                                    }
                                    
//#line 557
Util.
                                                   arraycopy4(
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       ii).
                                                       m_array,
                                                   (x10.
                                                     lang.
                                                     region)
                                                     get_m_boundaries(
                                                       k,
                                                       ii),
                                                   (x10.
                                                     lang.
                                                     DoubleReferenceArray)
                                                     get_m_u(
                                                       sourceID).
                                                       m_array,
                                                   trans0,
                                                   trans1,
                                                   trans2);
                                }
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp73) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp73);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
                	} catch (Throwable tmp72) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp72);
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
        		}
        	});/* } */
    }
    
    
//#line 569
public x10.
                   lang.
                   GenericReferenceArray
                   getDist3Array(
                   final x10.
                     lang.
                     dist d) {
        
//#line 570
return (x10.
                              lang.
                              GenericReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 573
public x10.
                   lang.
                   GenericReferenceArray
                   getRegion3Array1(
                   final x10.
                     lang.
                     dist d) {
        
//#line 574
return (x10.
                              lang.
                              GenericReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 577
public x10.
                   lang.
                   GenericReferenceArray
                   getRegion3Array2(
                   final x10.
                     lang.
                     dist d) {
        
//#line 578
return (x10.
                              lang.
                              GenericReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 582
public LevelData(final int a_problemDomainSize,
                                  final boolean a_isParallel) {
        
//#line 582
super();
        
//#line 583
final x10.
          lang.
          dist ALLPLACES =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 584
if (Util.
                           OVERLAP_COMMANDCOMP) {
            
//#line 585
EXCHANGE_After =
              false;
        } else {
            
//#line 588
EXCHANGE_After =
              Util.
                EXCHANGE_AFTER;
        }
        
//#line 591
SIZE =
          a_problemDomainSize;
        
//#line 592
ISPARALLEL =
          a_isParallel;
        
//#line 595
final x10.
          lang.
          region temp_P_DOMAIN =
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
              a_problemDomainSize -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              a_problemDomainSize -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              a_problemDomainSize -
                1));
        
//#line 596
P_DOMAIN =
          temp_P_DOMAIN;
        
//#line 599
int numCuts =
          0;
        
//#line 600
int temp_m_numPlaces =
          0;
        
//#line 601
if (a_isParallel) {
            
//#line 602
m_places =
              ALLPLACES;
            
//#line 603
temp_m_numPlaces =
              N_PLACES;
            
//#line 604
numCuts =
              Util.
                log2(
                N_PLACES);
        } else {
            
//#line 608
m_places =
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
                ALLPLACES.
                  get(
                  0));
            
//#line 609
temp_m_numPlaces =
              1;
            
//#line 610
numCuts =
              0;
        }
        
//#line 612
m_numPlaces =
          temp_m_numPlaces;
        
//#line 613
x10.
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
                temp_m_numPlaces)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 616
x10.
          lang.
          dist di =
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
                5),
              x10.
                lang.
                region.
                factory.
                region(
                0,
                temp_m_numPlaces -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 618
final x10.
          lang.
          GenericReferenceArray temp_m_dist =
          (x10.
            lang.
            GenericReferenceArray)
            getDist3Array(
              d);
        
//#line 619
m_dist =
          temp_m_dist;
        
//#line 620
final x10.
          lang.
          GenericReferenceArray temp_m_DIST =
          (x10.
            lang.
            GenericReferenceArray)
            getDist3Array(
              d);
        
//#line 621
m_DIST =
          temp_m_DIST;
        
//#line 623
final int m_low0 =
          temp_P_DOMAIN.
            rank(
            0).
            low();
        
//#line 624
final int m_low1 =
          temp_P_DOMAIN.
            rank(
            1).
            low();
        
//#line 625
final int m_low2 =
          temp_P_DOMAIN.
            rank(
            2).
            low();
        
//#line 626
final int m_hi0 =
          temp_P_DOMAIN.
            rank(
            0).
            high();
        
//#line 627
final int m_hi1 =
          temp_P_DOMAIN.
            rank(
            1).
            high();
        
//#line 628
final int m_hi2 =
          temp_P_DOMAIN.
            rank(
            2).
            high();
        
//#line 629
final int temp_m_size0 =
          m_hi0 -
          m_low0 +
          1;
        
//#line 630
final int temp_m_size1 =
          m_hi1 -
          m_low1 +
          1;
        
//#line 631
final int temp_m_size2 =
          m_hi2 -
          m_low2 +
          1;
        
//#line 632
m_size0 =
          temp_m_size0;
        
//#line 633
m_size1 =
          temp_m_size1;
        
//#line 634
m_size2 =
          temp_m_size2;
        
//#line 637
int a =
          numCuts /
          3;
        
//#line 638
int b =
          numCuts %
          3;
        
//#line 639
final int m_cut0 =
          a +
          ((b >
              0
              ? 1
              : 0));
        
//#line 640
final int m_cut1 =
          a +
          ((b >
              1
              ? 1
              : 0));
        
//#line 641
final int m_cut2 =
          a;
        
//#line 642
final int pow2_m_cut0 =
          Util.
            pow2(
            m_cut0);
        
//#line 643
final int pow2_m_cut1 =
          Util.
            pow2(
            m_cut1);
        
//#line 644
final int pow2_m_cut2 =
          Util.
            pow2(
            m_cut2);
        
//#line 645
m_block0 =
          pow2_m_cut0;
        
//#line 646
m_block1 =
          pow2_m_cut1;
        
//#line 647
m_block2 =
          pow2_m_cut2;
        
//#line 648
final int m_blockSize0 =
          temp_m_size0 /
          pow2_m_cut0;
        
//#line 649
final int m_blockSize1 =
          temp_m_size1 /
          pow2_m_cut1;
        
//#line 650
final int m_blockSize2 =
          temp_m_size2 /
          pow2_m_cut2;
        
//#line 651
final x10.
          lang.
          region temp_m_placeGrid =
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
              pow2_m_cut0 -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              pow2_m_cut1 -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              pow2_m_cut2 -
                1));
        
//#line 652
m_placeGrid =
          temp_m_placeGrid;
        
//#line 653
int i =
          0;
        
//#line 655
x10.
          lang.
          GenericReferenceArray m_reg =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array1(
              d);
        
//#line 656
x10.
          lang.
          GenericReferenceArray m_REG =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array1(
              d);
        
//#line 657
/* template:forloop-mult { */{
        x10.lang.region __var74__ = (x10.lang.region) temp_m_placeGrid;
        if (__var74__.size() > 0 && (__var74__ instanceof x10.array.MultiDimRegion || __var74__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var75__ = __var74__.rank(0).low(), __var76__ = __var74__.rank(0).high(); __var75__ <= __var76__; __var75__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var77__ = __var74__.rank(1).low(), __var78__ = __var74__.rank(1).high(); __var77__ <= __var78__; __var77__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var79__ = __var74__.rank(2).low(), __var80__ = __var74__.rank(2).high(); __var79__ <= __var80__; __var79__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int x = __var75__;
        /* } */
        /* template:final-var-assign { */
        final int y = __var77__;
        /* } */
        /* template:final-var-assign { */
        final int z = __var79__;
        /* } */
        /* } */
{
            
//#line 659
final int mrl0 =
              m_blockSize0 *
              x +
              m_low0;
            
//#line 660
final int mrl1 =
              m_blockSize1 *
              y +
              m_low1;
            
//#line 661
final int mrl2 =
              m_blockSize2 *
              z +
              m_low2;
            
//#line 662
final int mrh0 =
              m_blockSize0 *
              ((x +
                  1)) +
              m_low0;
            
//#line 663
final int mrh1 =
              m_blockSize1 *
              ((y +
                  1)) +
              m_low1;
            
//#line 664
final int mrh2 =
              m_blockSize2 *
              ((z +
                  1)) +
              m_low2;
            
//#line 671
/* template:array_set { */(m_reg).set(x10.
                                                                 lang.
                                                                 region.
                                                                 factory.
                                                                 region(
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl0,
                                                                   mrh0 -
                                                                     1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl1,
                                                                   mrh1 -
                                                                     1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl2,
                                                                   mrh2 -
                                                                     1)),i)/* } */;
            
//#line 672
/* template:array_set { */(m_REG).set(x10.
                                                                 lang.
                                                                 region.
                                                                 factory.
                                                                 region(
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl0 -
                                                                     1,
                                                                   mrh0),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl1 -
                                                                     1,
                                                                   mrh1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl2 -
                                                                     1,
                                                                   mrh2)),i)/* } */;
            
//#line 675
/* template:array_set { */(temp_m_dist).set(x10.
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
                                                                           mrl0,
                                                                           mrh0 -
                                                                             1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl1,
                                                                           mrh1 -
                                                                             1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl2,
                                                                           mrh2 -
                                                                             1)),
                                                                       x10.
                                                                         lang.
                                                                         place.
                                                                         places(
                                                                         i)),i)/* } */;
            
//#line 676
/* template:array_set { */(temp_m_DIST).set(x10.
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
                                                                           mrl0 -
                                                                             1,
                                                                           mrh0),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl1 -
                                                                             1,
                                                                           mrh1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl2 -
                                                                             1,
                                                                           mrh2)),
                                                                       x10.
                                                                         lang.
                                                                         place.
                                                                         places(
                                                                         i)),i)/* } */;
            
//#line 677
i++;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var13____ = (__var74__).iterator(); __var13____.hasNext(); ) {
        	final  x10.
          lang.
          point __var13__ = (x10.
          lang.
          point) __var13____.next();
        	/* Join: { *//* Join: { */final int x =
          /* template:array_get { */((__var13__).get(0))/* } */;
final int y =
          /* template:array_get { */((__var13__).get(1))/* } */;
final int z =
          /* template:array_get { */((__var13__).get(2))/* } */;/* } */
{
            
//#line 659
final int mrl0 =
              m_blockSize0 *
              x +
              m_low0;
            
//#line 660
final int mrl1 =
              m_blockSize1 *
              y +
              m_low1;
            
//#line 661
final int mrl2 =
              m_blockSize2 *
              z +
              m_low2;
            
//#line 662
final int mrh0 =
              m_blockSize0 *
              ((x +
                  1)) +
              m_low0;
            
//#line 663
final int mrh1 =
              m_blockSize1 *
              ((y +
                  1)) +
              m_low1;
            
//#line 664
final int mrh2 =
              m_blockSize2 *
              ((z +
                  1)) +
              m_low2;
            
//#line 671
/* template:array_set { */(m_reg).set(x10.
                                                                 lang.
                                                                 region.
                                                                 factory.
                                                                 region(
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl0,
                                                                   mrh0 -
                                                                     1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl1,
                                                                   mrh1 -
                                                                     1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl2,
                                                                   mrh2 -
                                                                     1)),i)/* } */;
            
//#line 672
/* template:array_set { */(m_REG).set(x10.
                                                                 lang.
                                                                 region.
                                                                 factory.
                                                                 region(
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl0 -
                                                                     1,
                                                                   mrh0),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl1 -
                                                                     1,
                                                                   mrh1),
                                                                 x10.
                                                                   lang.
                                                                   region.
                                                                   factory.
                                                                   region(
                                                                   mrl2 -
                                                                     1,
                                                                   mrh2)),i)/* } */;
            
//#line 675
/* template:array_set { */(temp_m_dist).set(x10.
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
                                                                           mrl0,
                                                                           mrh0 -
                                                                             1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl1,
                                                                           mrh1 -
                                                                             1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl2,
                                                                           mrh2 -
                                                                             1)),
                                                                       x10.
                                                                         lang.
                                                                         place.
                                                                         places(
                                                                         i)),i)/* } */;
            
//#line 676
/* template:array_set { */(temp_m_DIST).set(x10.
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
                                                                           mrl0 -
                                                                             1,
                                                                           mrh0),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl1 -
                                                                             1,
                                                                           mrh1),
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           mrl2 -
                                                                             1,
                                                                           mrh2)),
                                                                       x10.
                                                                         lang.
                                                                         place.
                                                                         places(
                                                                         i)),i)/* } */;
            
//#line 677
i++;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 679
m_regions =
          m_reg;
        
//#line 680
m_REGIONs =
          m_REG;
        
//#line 681
x10.
          lang.
          GenericReferenceArray temp_m_boundaries =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array2(
              di);
        
//#line 682
/* template:forloop-mult { */{
        x10.lang.region __var81__ = (x10.lang.region) di.
                                                        region;
        if (__var81__.size() > 0 && (__var81__ instanceof x10.array.MultiDimRegion || __var81__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var82__ = __var81__.rank(0).low(), __var83__ = __var81__.rank(0).high(); __var82__ <= __var83__; __var82__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var84__ = __var81__.rank(1).low(), __var85__ = __var81__.rank(1).high(); __var84__ <= __var85__; __var84__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var82__;
        /* } */
        /* template:final-var-assign { */
        final int ii = __var84__;
        /* } */
        /* } */
{
            
//#line 684
if (j ==
                               0) {
                
//#line 685
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 685
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 685
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((0 +
                                                                                      1)),
                                                                                 (0 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (0 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 687
if (j ==
                               2) {
                
//#line 688
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 688
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 688
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((1 +
                                                                                      1)),
                                                                                 (1 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (1 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 690
if (j ==
                               4) {
                
//#line 691
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 691
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 691
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((2 +
                                                                                      1)),
                                                                                 (2 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (2 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 693
if (j ==
                               1) {
                
//#line 694
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 694
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 694
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (0 +
                                                                                    1),
                                                                                 (0 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (0 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 696
if (j ==
                               3) {
                
//#line 697
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 697
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 697
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (1 +
                                                                                    1),
                                                                                 (1 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (1 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 699
if (j ==
                               5) {
                
//#line 700
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 700
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 700
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (2 +
                                                                                    1),
                                                                                 (2 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (2 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var14____ = (__var81__).iterator(); __var14____.hasNext(); ) {
        	final  x10.
          lang.
          point __var14__ = (x10.
          lang.
          point) __var14____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var14__).get(0))/* } */;
final int ii =
          /* template:array_get { */((__var14__).get(1))/* } */;/* } */
{
            
//#line 684
if (j ==
                               0) {
                
//#line 685
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 685
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 685
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((0 +
                                                                                      1)),
                                                                                 (0 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (0 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 687
if (j ==
                               2) {
                
//#line 688
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 688
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 688
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((1 +
                                                                                      1)),
                                                                                 (1 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (1 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 690
if (j ==
                               4) {
                
//#line 691
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 691
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 691
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 -((2 +
                                                                                      1)),
                                                                                 (2 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (2 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 693
if (j ==
                               1) {
                
//#line 694
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 694
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 694
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (0 +
                                                                                    1),
                                                                                 (0 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (0 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 696
if (j ==
                               3) {
                
//#line 697
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 697
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 697
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (1 +
                                                                                    1),
                                                                                 (1 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (1 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
            
//#line 699
if (j ==
                               5) {
                
//#line 700
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                 boundary(
                                                                                 new x10.
                                                                                   runtime.
                                                                                   RuntimeCastChecker.
                                                                                   DepTypeRuntimeChecking(
                                                                                   ) {
                                                                                     
                                                                                     
//#line 700
public x10.
                                                                                                    lang.
                                                                                                    region
                                                                                                    checkCast(
                                                                                                    final x10.
                                                                                                      lang.
                                                                                                      region x10_generated_objToCast) {
                                                                                         
//#line 700
return (((((((x10.
                                                                                                                     lang.
                                                                                                                     region)
                                                                                                                     x10_generated_objToCast)).
                                                                                                                   rank() ==
                                                                                                                   3)))
                                                                                                                ? (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10_generated_objToCast
                                                                                                                : (x10.
                                                                                                                    lang.
                                                                                                                    region)
                                                                                                                    x10.
                                                                                                                      runtime.
                                                                                                                      RuntimeCastChecker.
                                                                                                                      throwClassCastException(
                                                                                                                      (x10.
                                                                                                                        lang.
                                                                                                                        region)
                                                                                                                        x10_generated_objToCast,
                                                                                                                      "Constraint is not meet"));
                                                                                     }
                                                                                 }.
                                                                                   checkCast(
                                                                                   /* template:parametric { */((x10.
                                                                                     lang.
                                                                                     region)(/* template:array_get { */((m_reg).get(ii))/* } */))/* } */),
                                                                                 (2 +
                                                                                    1),
                                                                                 (2 >
                                                                                    0
                                                                                    ? 1
                                                                                    : 0),
                                                                                 (2 >
                                                                                    1
                                                                                    ? 1
                                                                                    : 0),
                                                                                 0),/* Join: { */j,ii/* } */)/* } */;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 703
m_boundaries =
          temp_m_boundaries;
        
//#line 705
final x10.
          lang.
          GenericReferenceArray temp_m_u =
          getWrapperArray(
            ALLPLACES);
        
//#line 706
m_u =
          temp_m_u;
        
//#line 707
/* template:forloop-mult { */{
        x10.lang.region __var86__ = (x10.lang.region) x10.
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
                                                          N_PLACES -
                                                            1));
        if (__var86__.size() > 0 && (__var86__ instanceof x10.array.MultiDimRegion || __var86__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var87__ = __var86__.rank(0).low(), __var88__ = __var86__.rank(0).high(); __var87__ <= __var88__; __var87__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int k = __var87__;
        /* } */
        /* } */
{
            
//#line 708
final x10.
              lang.
              dist disi =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 708
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 708
return (((((((x10.
                                                  lang.
                                                  dist)
                                                  x10_generated_objToCast)).
                                                rank() ==
                                                3)))
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
                /* template:parametric { */((x10.
                  lang.
                  dist)(/* template:array_get { */((temp_m_DIST).get(k))/* } */))/* } */);
            
//#line 709
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 709
/* template:Async { */(x10.lang.Runtime.asPlace(temp_m_u.
                                                                               distribution.
                                                                               get(
                                                                               k))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 710
/* template:array_set { */(temp_m_u).set(new Wrapper(
                      getDoubleArray(
                        disi)),k)/* } */;
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp89) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp89);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var15____ = (__var86__).iterator(); __var15____.hasNext(); ) {
        	final  x10.
          lang.
          point __var15__ = (x10.
          lang.
          point) __var15____.next();
        	/* Join: { *//* Join: { */final int k =
          /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
            
//#line 708
final x10.
              lang.
              dist disi =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 708
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 708
return (((((((x10.
                                                  lang.
                                                  dist)
                                                  x10_generated_objToCast)).
                                                rank() ==
                                                3)))
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
                /* template:parametric { */((x10.
                  lang.
                  dist)(/* template:array_get { */((temp_m_DIST).get(k))/* } */))/* } */);
            
//#line 709
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 709
/* template:Async { */(x10.lang.Runtime.asPlace(temp_m_u.
                                                                               distribution.
                                                                               get(
                                                                               k))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 710
/* template:array_set { */(temp_m_u).set(new Wrapper(
                      getDoubleArray(
                        disi)),k)/* } */;
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp90) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp90);
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
    
    
//#line 727
private x10.
                   lang.
                   GenericReferenceArray
                   getWrapperArray(
                   final x10.
                     lang.
                     dist d) {
        
//#line 728
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 731
private x10.
                   lang.
                   DoubleReferenceArray
                   getDoubleArray(
                   final x10.
                     lang.
                     dist d) {
        
//#line 732
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pp/* } */, double dummy) { {
            
//#line 732
return 0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 735
private x10.
                   lang.
                   region
                   get_m_regions(
                   final int i) {
        
//#line 736
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 737
final x10.
          lang.
          dist dRecv =
          (x10.
            lang.
            dist)
            ((x10.
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
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 738
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 740
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 740
/* template:Async { */(x10.lang.Runtime.asPlace(m_regions.
                                                                           distribution.
                                                                           get(
                                                                           i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 741
final x10.
                  lang.
                  region temp3 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 741
public x10.
                                     lang.
                                     region
                                     checkCast(
                                     final x10.
                                       lang.
                                       region x10_generated_objToCast) {
                          
//#line 741
return (((((((x10.
                                                      lang.
                                                      region)
                                                      x10_generated_objToCast)).
                                                    rank() ==
                                                    3)))
                                                 ? (x10.
                                                     lang.
                                                     region)
                                                     x10_generated_objToCast
                                                 : (x10.
                                                     lang.
                                                     region)
                                                     x10.
                                                       runtime.
                                                       RuntimeCastChecker.
                                                       throwClassCastException(
                                                       (x10.
                                                         lang.
                                                         region)
                                                         x10_generated_objToCast,
                                                       "Constraint is not meet"));
                      }
                  }.
                    checkCast(
                    /* template:parametric { */((x10.
                      lang.
                      region)(/* template:array_get { */((m_regions).get(i))/* } */))/* } */);
                
//#line 742
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 742
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp91) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp91);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 744
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 744
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 744
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            3)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            /* template:parametric { */((x10.
              lang.
              region)(/* template:array_get { */((aRecv).get(0))/* } */))/* } */);
        
//#line 745
return mri;
    }
    
    
//#line 748
private x10.
                   lang.
                   region
                   get_m_REGIONs(
                   final int i) {
        
//#line 749
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 750
final x10.
          lang.
          dist dRecv =
          (x10.
            lang.
            dist)
            ((x10.
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
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 751
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 753
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 753
/* template:Async { */(x10.lang.Runtime.asPlace(m_REGIONs.
                                                                           distribution.
                                                                           get(
                                                                           i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 754
final x10.
                  lang.
                  region temp3 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 754
public x10.
                                     lang.
                                     region
                                     checkCast(
                                     final x10.
                                       lang.
                                       region x10_generated_objToCast) {
                          
//#line 754
return (((((((x10.
                                                      lang.
                                                      region)
                                                      x10_generated_objToCast)).
                                                    rank() ==
                                                    3)))
                                                 ? (x10.
                                                     lang.
                                                     region)
                                                     x10_generated_objToCast
                                                 : (x10.
                                                     lang.
                                                     region)
                                                     x10.
                                                       runtime.
                                                       RuntimeCastChecker.
                                                       throwClassCastException(
                                                       (x10.
                                                         lang.
                                                         region)
                                                         x10_generated_objToCast,
                                                       "Constraint is not meet"));
                      }
                  }.
                    checkCast(
                    /* template:parametric { */((x10.
                      lang.
                      region)(/* template:array_get { */((m_REGIONs).get(i))/* } */))/* } */);
                
//#line 755
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 755
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp92) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp92);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 757
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 757
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 757
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            3)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            /* template:parametric { */((x10.
              lang.
              region)(/* template:array_get { */((aRecv).get(0))/* } */))/* } */);
        
//#line 758
return mri;
    }
    
    
//#line 761
private x10.
                   lang.
                   region
                   get_m_boundaries(
                   final int i,
                   final int j) {
        
//#line 762
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 763
final x10.
          lang.
          dist dRecv =
          (x10.
            lang.
            dist)
            ((x10.
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
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 764
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 766
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 766
/* template:Async { */(x10.lang.Runtime.asPlace(m_boundaries.
                                                                           distribution.
                                                                           get(
                                                                           i,
                                                                           j))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 767
final x10.
                  lang.
                  region temp4 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 767
public x10.
                                     lang.
                                     region
                                     checkCast(
                                     final x10.
                                       lang.
                                       region x10_generated_objToCast) {
                          
//#line 767
return (((((((x10.
                                                      lang.
                                                      region)
                                                      x10_generated_objToCast)).
                                                    rank() ==
                                                    3)))
                                                 ? (x10.
                                                     lang.
                                                     region)
                                                     x10_generated_objToCast
                                                 : (x10.
                                                     lang.
                                                     region)
                                                     x10.
                                                       runtime.
                                                       RuntimeCastChecker.
                                                       throwClassCastException(
                                                       (x10.
                                                         lang.
                                                         region)
                                                         x10_generated_objToCast,
                                                       "Constraint is not meet"));
                      }
                  }.
                    checkCast(
                    /* template:parametric { */((x10.
                      lang.
                      region)(/* template:array_get { */((m_boundaries).get(/* Join: { */i,j/* } */))/* } */))/* } */);
                
//#line 768
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 768
/* template:array_set { */(aRecv).set(temp4,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp93) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp93);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 770
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 770
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 770
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            3)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            /* template:parametric { */((x10.
              lang.
              region)(/* template:array_get { */((aRecv).get(0))/* } */))/* } */);
        
//#line 771
return mri;
    }
    
    
//#line 774
private Wrapper
                   get_m_u(
                   final int i) {
        
//#line 775
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 776
final x10.
          lang.
          dist dRecv =
          (x10.
            lang.
            dist)
            ((x10.
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
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 777
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 779
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 779
/* template:Async { */(x10.lang.Runtime.asPlace(m_u.
                                                                           distribution.
                                                                           get(
                                                                           i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 780
final Wrapper temp4 =
                  /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */;
                
//#line 781
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 781
/* template:array_set { */(aRecv).set(temp4,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp94) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp94);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 783
final Wrapper mri =
          /* template:parametric { */((Wrapper)(/* template:array_get { */((aRecv).get(0))/* } */))/* } */;
        
//#line 784
return mri;
    }
}
