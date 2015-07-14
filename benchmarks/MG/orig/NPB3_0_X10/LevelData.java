package NPB3_0_X10;

import x10.lang.*;

public class LevelData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 44
class Wrapper
                extends x10.
                  lang.
                  Object
                  implements x10.
                               lang.
                               ValueType
                {
        
//#line 45
final x10.
          lang.
          DoubleReferenceArray
          m_array;
        
        
//#line 46
Wrapper(final x10.
                              lang.
                              DoubleReferenceArray a_array) {
            
//#line 46
super();
            
//#line 47
m_array =
              a_array;
        }
    }
    
    
//#line 53
final public static boolean
      PERF_On =
      NPB3_0_X10.
        Util.
        PERF_OUTPUT;
    
//#line 54
final public static double
      PERF_Comp =
      1.0 /
      NPB3_0_X10.
        Util.
        FP_PERCLOCK;
    
//#line 55
final public static double
      PERF_CommL =
      NPB3_0_X10.
        Util.
        COMM_LATENCY *
      NPB3_0_X10.
        Util.
        CLOCK_SPEED;
    
//#line 56
final public static double
      PERF_CommB =
      (((double)
          NPB3_0_X10.
            Util.
            CLOCK_SPEED /
          (double)
            NPB3_0_X10.
              Util.
              COMM_BANDWIDTH)) *
      8.0;
    
//#line 57
final public static boolean
      PERF_InLoop =
      NPB3_0_X10.
        Util.
        IN_LOOP;
    
//#line 58
final public static boolean
      PERF_CompOnly =
      NPB3_0_X10.
        Util.
        COMP_ONLY;
    
//#line 59
final public static boolean
      PERF_CommOnly =
      NPB3_0_X10.
        Util.
        COMM_ONLY;
    
//#line 61
final public boolean
      EXCHANGE_After;
    
//#line 63
final int
      N_PLACES =
      NPB3_0_X10.
        Util.
        N_PLACES;
    
//#line 64
final int
      HIGH =
      NPB3_0_X10.
        Util.
        HIGH;
    
//#line 64
final int
      LOW =
      NPB3_0_X10.
        Util.
        LOW;
    
//#line 65
final x10.
      lang.
      dist
      ALLPLACES =
      NPB3_0_X10.
        Util.
        ALLPLACES;
    
//#line 67
final int
      SIZE;
    
//#line 68
final x10.
      lang.
      region
      P_DOMAIN;
    
//#line 69
final boolean
      ISPARALLEL;
    
//#line 71
final x10.
      lang.
      region[]
      m_regions;
    
//#line 72
final x10.
      lang.
      region[]
      m_REGIONs;
    
//#line 74
final x10.
      lang.
      GenericReferenceArray
      m_boundaries;
    
//#line 76
final x10.
      lang.
      dist
      m_places;
    
//#line 77
final int
      m_numPlaces;
    
//#line 79
final x10.
      lang.
      region
      m_placeGrid;
    
//#line 80
final x10.
      lang.
      point
      m_low;
    
//#line 80
final x10.
      lang.
      point
      m_hi;
    
//#line 80
final x10.
      lang.
      point
      m_size;
    
//#line 80
final x10.
      lang.
      point
      m_cut;
    
//#line 80
final x10.
      lang.
      point
      m_block;
    
//#line 80
final x10.
      lang.
      point
      m_blockSize;
    
//#line 81
final x10.
      lang.
      dist[]
      m_dist;
    
//#line 81
final x10.
      lang.
      dist[]
      m_DIST;
    
//#line 82
final x10.
      lang.
      GenericReferenceArray
      m_u;
    
    
//#line 86
final x10.
                  lang.
                  dist
                  getPlaces(
                  ) {
        
//#line 86
return m_places;
    }
    
    
//#line 87
final x10.
                  lang.
                  DoubleReferenceArray
                  getArray(
                  final int a_idx) {
        
//#line 88
assert (a_idx >=
                              0 &&
                              a_idx <
                              m_numPlaces);
        
//#line 89
return /* template:parametric { */((NPB3_0_X10.
                             LevelData.
                             Wrapper)(/* template:array_get { */((m_u).get(a_idx))/* } */))/* } */.
                             m_array;
    }
    
    
//#line 91
final x10.
                  lang.
                  region
                  getInnerRegion(
                  final int a_idx) {
        
//#line 92
assert (a_idx >=
                              0 &&
                              a_idx <
                              m_numPlaces);
        
//#line 93
return new x10.
                             runtime.
                             RuntimeCastChecker.
                             DepTypeRuntimeChecking(
                             ) {
                               
                               
//#line 93
public x10.
                                             lang.
                                             region
                                             checkCast(
                                             final x10.
                                               lang.
                                               region x10_generated_objToCast) {
                                   
//#line 93
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
                             m_regions[a_idx]);
    }
    
    
//#line 95
final x10.
                  lang.
                  region
                  getINNERRegion(
                  final int a_idx) {
        
//#line 96
assert (a_idx >=
                              0 &&
                              a_idx <
                              m_numPlaces);
        
//#line 97
x10.
          lang.
          region R =
          m_regions[a_idx];
        
//#line 98
return (x10.
                             lang.
                             region)
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
                                   1));
    }
    
    
//#line 100
final x10.
                   lang.
                   region
                   getShrinkedRegion(
                   final int a_idx) {
        
//#line 101
assert (a_idx >=
                               0 &&
                               a_idx <
                               m_numPlaces);
        
//#line 102
x10.
          lang.
          region R =
          m_REGIONs[a_idx];
        
//#line 103
return (x10.
                              lang.
                              region)
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
                                    1));
    }
    
    
//#line 106
final x10.
                   lang.
                   region
                   getRegion(
                   final int a_idx) {
        
//#line 107
assert (a_idx >=
                               0 &&
                               a_idx <
                               m_numPlaces);
        
//#line 108
return m_REGIONs[a_idx];
    }
    
    
//#line 111
final void
                   print(
                   ) {
        
//#line 112
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 112
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
                
//#line 113
double res =
                  0;
                
//#line 114
x10.
                  lang.
                  DoubleReferenceArray temp =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 115
/* template:forloop { */
                for (java.util.Iterator p__ = (m_REGIONs[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 115
res +=
                      java.
                        lang.
                        Math.
                        abs(
                        /* template:array_get { */((temp).get(p))/* } */);
                }/* } */
                }
                /* } */
                
                
//#line 116
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
        	} catch (Throwable tmp36) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp36);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 120
final void
                   PRINT(
                   ) {
        
//#line 121
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 121
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
                
//#line 122
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("block at place " +
                                                                                                                                  i +
                                                                                                                                  " : ");
                
//#line 123
x10.
                  lang.
                  DoubleReferenceArray temp =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 124
int counter =
                  0;
                
//#line 125
/* template:forloop { */
                for (java.util.Iterator p__ = (m_regions[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 126
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.print(" [" +
                                                                                                                                    p +
                                                                                                                                    "]= " +
                                                                                                                                    /* template:array_get { */((temp).get(p))/* } */);
                    
//#line 126
counter++;
                    
//#line 127
if (counter ==
                                       4) {
                        
//#line 127
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.print("\n");
                        
//#line 127
counter =
                          0;
                    }
                }/* } */
                }
                /* } */
                
                
//#line 129
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.flush();
                
//#line 129
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println();
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp37) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp37);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 132
final double
                   norm2(
                   ) {
        
//#line 133
final x10.
          lang.
          DoubleReferenceArray results =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(m_places,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 134
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 134
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
                
//#line 135
double res =
                  0;
                
//#line 136
x10.
                  lang.
                  DoubleReferenceArray temp =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 137
/* template:forloop { */
                for (java.util.Iterator p__ = (m_regions[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 137
res +=
                      /* template:array_get { */((temp).get(p))/* } */ *
                        /* template:array_get { */((temp).get(p))/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 138
/* template:array_set { */(results).set(res,i)/* } */;
                
//#line 139
if (PERF_On &&
                                   ((!PERF_CommOnly))) {
                    
//#line 139
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((m_regions[i].
                                         size() *
                                         PERF_Comp)));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp38) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp38);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 141
double temp =
          results.
            reduce(
            results.
              add,
            0) /
          ((SIZE *
              SIZE *
              SIZE));
        
//#line 143
return java.
                              lang.
                              Math.
                              sqrt(
                              temp);
    }
    
    
//#line 145
final void
                   initialize(
                   final x10.
                     lang.
                     point[] a_minusOnePoints,
                   final x10.
                     lang.
                     point[] a_plusOnePoints) {
        
//#line 147
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 147
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
                
//#line 148
x10.
                  lang.
                  DoubleReferenceArray temp =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 149
x10.
                  lang.
                  region R =
                  m_regions[i];
                
//#line 151
for (
//#line 151
int j =
                                    0;
                                  j <
                                    a_minusOnePoints.
                                      length;
                                  
//#line 151
j++) {
                    
//#line 152
if (R.
                                       contains(
                                       a_minusOnePoints[j])) {
                        
//#line 152
/* template:array_set { */(temp).set(-1,a_minusOnePoints[j])/* } */;
                    }
                }
                
//#line 154
for (
//#line 154
int j =
                                    0;
                                  j <
                                    a_plusOnePoints.
                                      length;
                                  
//#line 154
j++) {
                    
//#line 155
if (R.
                                       contains(
                                       a_plusOnePoints[j])) {
                        
//#line 155
/* template:array_set { */(temp).set(1,a_plusOnePoints[j])/* } */;
                    }
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp39) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp39);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 158
if (EXCHANGE_After) {
            
//#line 158
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 158
exchange();
            }
            	} catch (Throwable tmp40) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp40);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 160
final void
                   set(
                   final double a_db) {
        
//#line 162
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 162
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
                
//#line 163
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 164
/* template:forloop { */
                for (java.util.Iterator p__ = (m_regions[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 164
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
        	} catch (Throwable tmp41) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp41);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 166
if (EXCHANGE_After) {
            
//#line 166
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 166
exchange();
            }
            	} catch (Throwable tmp42) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp42);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 168
final void
                   set(
                   final NPB3_0_X10.
                     LevelData a_LD) {
        
//#line 170
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 170
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
                
//#line 171
final x10.
                  lang.
                  DoubleReferenceArray u =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 172
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 173
/* template:forloop { */
                for (java.util.Iterator p__ = (m_regions[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 173
/* template:array_set { */(u).set(/* template:array_get { */((temp).get(p))/* } */,p)/* } */;
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
        	} catch (Throwable tmp43) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp43);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 175
if (EXCHANGE_After) {
            
//#line 175
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 175
exchange();
            }
            	} catch (Throwable tmp44) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 178
final void
                   add(
                   final NPB3_0_X10.
                     LevelData a_LD) {
        
//#line 180
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 180
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
                
//#line 181
final x10.
                  lang.
                  DoubleReferenceArray u =
                  /* template:parametric { */((NPB3_0_X10.
                    LevelData.
                    Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                    m_array;
                
//#line 182
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 183
/* template:forloop { */
                for (java.util.Iterator p__ = (m_regions[i]).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 184
/* template:array_set { */(u).addSet(/* template:array_get { */((temp).get(p))/* } */,p)/* } */;
                    
//#line 185
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 185
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((1.0 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 187
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 187
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((m_regions[i].
                                         size() *
                                         PERF_Comp)));
                }
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
        
        
//#line 189
if (EXCHANGE_After) {
            
//#line 189
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 189
exchange();
            }
            	} catch (Throwable tmp46) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp46);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 193
final void
                   Exchange(
                   ) {
        
//#line 194
for (
//#line 194
int j =
                            0;
                          j <
                            3;
                          
//#line 194
j++) {
            
//#line 195
final int jj =
              j;
            
//#line 196
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 196
/* template:ateach { */
                {
                	x10.lang.dist __var7____distCopy = m_places; // make copy to avoid recomputation
                	for (java.util.Iterator __var7____ = __var7____distCopy.iterator();
                		 __var7____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var7____distCopy.get(__var7__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 197
final x10.
                      lang.
                      point dest =
                      m_placeGrid.
                        coord(
                        i);
                    
//#line 198
final int ii =
                      i;
                    
//#line 200
/* template:forloop-mult { */{
                    x10.lang.region __var48__ = (x10.lang.region) x10.
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
                    if (__var48__.size() > 0 && (__var48__ instanceof x10.array.MultiDimRegion || __var48__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var49__ = __var48__.rank(0).low(), __var50__ = __var48__.rank(0).high(); __var49__ <= __var50__; __var49__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var49__;
                    /* } */
                    /* } */
{
                        
//#line 201
x10.
                          lang.
                          point disp;
                        
//#line 201
x10.
                          lang.
                          point source;
                        
//#line 201
x10.
                          lang.
                          point trans;
                        
//#line 202
int sourceID;
                        
//#line 203
int k;
                        
//#line 204
if (p ==
                                           LOW) {
                            
//#line 205
k =
                              jj *
                                2;
                            
//#line 206
disp =
                              x10.
                                lang.
                                point.
                                factory.
                                point(
                                (jj ==
                                   0
                                   ? 1
                                   : 0),
                                (jj ==
                                   1
                                   ? 1
                                   : 0),
                                (jj ==
                                   2
                                   ? 1
                                   : 0));
                        } else {
                            
//#line 209
k =
                              jj *
                                2 +
                                1;
                            
//#line 210
disp =
                              x10.
                                lang.
                                point.
                                factory.
                                point(
                                (jj ==
                                   0
                                   ? -1
                                   : 0),
                                (jj ==
                                   1
                                   ? -1
                                   : 0),
                                (jj ==
                                   2
                                   ? -1
                                   : 0));
                        }
                        
//#line 212
source =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.sub(disp);
                        
//#line 214
if (((m_numPlaces >
                                             1)) &&
                                           PERF_On &&
                                           ((!PERF_CompOnly))) {
                            
//#line 214
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((PERF_CommL +
                                                 PERF_CommB *
                                                 /* template:parametric { */((x10.
                                                   lang.
                                                   region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */.
                                                   size())));
                        }
                        
//#line 215
if (m_placeGrid.
                                           contains(
                                           source)) {
                            
//#line 216
sourceID =
                              m_placeGrid.
                                ordinal(
                                source);
                            
//#line 217
NPB3_0_X10.
                                           Util.
                                           arraycopy(
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                             m_array,
                                           /* template:parametric { */((x10.
                                             lang.
                                             region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                             m_array);
                        } else {
                            
//#line 220
source =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.add(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul((/* template:array_get { */((m_block).get(jj))/* } */ -
                                                                                                                                                                                                                       1)));
                            
//#line 221
sourceID =
                              m_placeGrid.
                                ordinal(
                                source);
                            
//#line 222
trans =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul(/* template:array_get { */((m_size).get(jj))/* } */);
                            
//#line 223
NPB3_0_X10.
                                           Util.
                                           arraycopy(
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                             m_array,
                                           /* template:parametric { */((x10.
                                             lang.
                                             region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                             m_array,
                                           trans);
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var48__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 201
x10.
                          lang.
                          point disp;
                        
//#line 201
x10.
                          lang.
                          point source;
                        
//#line 201
x10.
                          lang.
                          point trans;
                        
//#line 202
int sourceID;
                        
//#line 203
int k;
                        
//#line 204
if (p ==
                                           LOW) {
                            
//#line 205
k =
                              jj *
                                2;
                            
//#line 206
disp =
                              x10.
                                lang.
                                point.
                                factory.
                                point(
                                (jj ==
                                   0
                                   ? 1
                                   : 0),
                                (jj ==
                                   1
                                   ? 1
                                   : 0),
                                (jj ==
                                   2
                                   ? 1
                                   : 0));
                        } else {
                            
//#line 209
k =
                              jj *
                                2 +
                                1;
                            
//#line 210
disp =
                              x10.
                                lang.
                                point.
                                factory.
                                point(
                                (jj ==
                                   0
                                   ? -1
                                   : 0),
                                (jj ==
                                   1
                                   ? -1
                                   : 0),
                                (jj ==
                                   2
                                   ? -1
                                   : 0));
                        }
                        
//#line 212
source =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.sub(disp);
                        
//#line 214
if (((m_numPlaces >
                                             1)) &&
                                           PERF_On &&
                                           ((!PERF_CompOnly))) {
                            
//#line 214
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((PERF_CommL +
                                                 PERF_CommB *
                                                 /* template:parametric { */((x10.
                                                   lang.
                                                   region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */.
                                                   size())));
                        }
                        
//#line 215
if (m_placeGrid.
                                           contains(
                                           source)) {
                            
//#line 216
sourceID =
                              m_placeGrid.
                                ordinal(
                                source);
                            
//#line 217
NPB3_0_X10.
                                           Util.
                                           arraycopy(
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                             m_array,
                                           /* template:parametric { */((x10.
                                             lang.
                                             region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                             m_array);
                        } else {
                            
//#line 220
source =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.add(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul((/* template:array_get { */((m_block).get(jj))/* } */ -
                                                                                                                                                                                                                       1)));
                            
//#line 221
sourceID =
                              m_placeGrid.
                                ordinal(
                                source);
                            
//#line 222
trans =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul(/* template:array_get { */((m_size).get(jj))/* } */);
                            
//#line 223
NPB3_0_X10.
                                           Util.
                                           arraycopy(
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                             m_array,
                                           /* template:parametric { */((x10.
                                             lang.
                                             region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                           /* template:parametric { */((NPB3_0_X10.
                                             LevelData.
                                             Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                             m_array,
                                           trans);
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
            	} catch (Throwable tmp47) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp47);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 231
final void
                   exchange(
                   ) {
        
//#line 232
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 233
final x10.
              lang.
              clock clk =
              x10.
                lang.
                clock.
                factory.
                clock();
            
//#line 234
/* template:ateach { */
            {
            	x10.lang.dist __var9____distCopy = m_places; // make copy to avoid recomputation
            	for (java.util.Iterator __var9____ = __var9____distCopy.iterator();
            		 __var9____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var9__ = (x10.
              lang.
              point) __var9____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var9__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var9____distCopy.get(__var9__)).runAsync
            			(new x10.runtime.Activity(/* template:clock { */x10.lang.Runtime.getCurrentActivity().checkClockUse((x10.runtime.Clock) clk)/* } */) {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                
//#line 235
for (
//#line 235
int j =
                                    0;
                                  j <
                                    3;
                                  
//#line 235
j++) {
                    
//#line 236
final int jj =
                      j;
                    
//#line 237
final x10.
                      lang.
                      point dest =
                      m_placeGrid.
                        coord(
                        i);
                    
//#line 238
final int ii =
                      i;
                    
//#line 239
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 239
/* template:foreach { */
                        for (java.util.Iterator __var10____ = (x10.
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
                                                                   HIGH))).iterator(); __var10____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var10__ = (x10.
                          lang.
                          point) __var10____.next();
                        	/* Join: { */final int p =
                          /* template:array_get { */((__var10__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int p =
                          /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                            
//#line 241
x10.
                              lang.
                              point disp;
                            
//#line 241
x10.
                              lang.
                              point source;
                            
//#line 241
x10.
                              lang.
                              point trans;
                            
//#line 242
int sourceID;
                            
//#line 243
int k;
                            
//#line 244
if (p ==
                                               LOW) {
                                
//#line 245
k =
                                  jj *
                                    2;
                                
//#line 246
disp =
                                  x10.
                                    lang.
                                    point.
                                    factory.
                                    point(
                                    (jj ==
                                       0
                                       ? 1
                                       : 0),
                                    (jj ==
                                       1
                                       ? 1
                                       : 0),
                                    (jj ==
                                       2
                                       ? 1
                                       : 0));
                            } else {
                                
//#line 249
k =
                                  jj *
                                    2 +
                                    1;
                                
//#line 250
disp =
                                  x10.
                                    lang.
                                    point.
                                    factory.
                                    point(
                                    (jj ==
                                       0
                                       ? -1
                                       : 0),
                                    (jj ==
                                       1
                                       ? -1
                                       : 0),
                                    (jj ==
                                       2
                                       ? -1
                                       : 0));
                            }
                            
//#line 252
source =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.sub(disp);
                            
//#line 253
if (((m_numPlaces >
                                                 1)) &&
                                               PERF_On &&
                                               ((!PERF_CompOnly))) {
                                
//#line 254
x10.
                                               lang.
                                               perf.
                                               addLocalOps(
                                               (long)
                                                 ((PERF_CommL +
                                                     PERF_CommB *
                                                     /* template:parametric { */((x10.
                                                       lang.
                                                       region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */.
                                                       size())));
                            }
                            
//#line 255
if (m_placeGrid.
                                               contains(
                                               source)) {
                                
//#line 256
sourceID =
                                  m_placeGrid.
                                    ordinal(
                                    source);
                                
//#line 257
NPB3_0_X10.
                                               Util.
                                               arraycopy(
                                               /* template:parametric { */((NPB3_0_X10.
                                                 LevelData.
                                                 Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                                 m_array,
                                               /* template:parametric { */((x10.
                                                 lang.
                                                 region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                               /* template:parametric { */((NPB3_0_X10.
                                                 LevelData.
                                                 Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                                 m_array);
                            } else {
                                
//#line 260
source =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(dest))/* } */.add(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul((/* template:array_get { */((m_block).get(jj))/* } */ -
                                                                                                                                                                                                                           1)));
                                
//#line 261
sourceID =
                                  m_placeGrid.
                                    ordinal(
                                    source);
                                
//#line 262
trans =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(disp))/* } */.mul(/* template:array_get { */((m_size).get(jj))/* } */);
                                
//#line 263
NPB3_0_X10.
                                               Util.
                                               arraycopy(
                                               /* template:parametric { */((NPB3_0_X10.
                                                 LevelData.
                                                 Wrapper)(/* template:array_get { */((m_u).get(ii))/* } */))/* } */.
                                                 m_array,
                                               /* template:parametric { */((x10.
                                                 lang.
                                                 region)(/* template:array_get { */((m_boundaries).get(/* Join: { */k,ii/* } */))/* } */))/* } */,
                                               /* template:parametric { */((NPB3_0_X10.
                                                 LevelData.
                                                 Wrapper)(/* template:array_get { */((m_u).get(sourceID))/* } */))/* } */.
                                                 m_array,
                                               trans);
                            }
                        }/* } */
                        			}
                        		});
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
                    
                    
//#line 267
/* template:next { */
                    x10.lang.Runtime.getCurrentActivity().doNext();
                    /* } */
                    
                }
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
    
    
//#line 272
public LevelData(final int a_problemDomainSize,
                                  final boolean a_isParallel) {
        
//#line 272
super();
        
//#line 273
if (NPB3_0_X10.
                           Util.
                           OVERLAP_COMMANDCOMP) {
            
//#line 274
EXCHANGE_After =
              false;
        } else {
            
//#line 276
EXCHANGE_After =
              NPB3_0_X10.
                Util.
                EXCHANGE_AFTER;
        }
        
//#line 278
SIZE =
          a_problemDomainSize;
        
//#line 279
ISPARALLEL =
          a_isParallel;
        
//#line 280
assert NPB3_0_X10.
                              Util.
                              powerOf2(
                              SIZE);
        
//#line 281
assert NPB3_0_X10.
                              Util.
                              powerOf2(
                              N_PLACES);
        
//#line 282
P_DOMAIN =
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
              SIZE -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              SIZE -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              SIZE -
                1));
        
//#line 285
final int numCuts;
        
//#line 286
if (ISPARALLEL) {
            
//#line 287
m_places =
              ALLPLACES;
            
//#line 287
m_numPlaces =
              N_PLACES;
            
//#line 288
numCuts =
              NPB3_0_X10.
                Util.
                log2(
                N_PLACES);
        } else {
            
//#line 291
m_places =
              ALLPLACES.
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
                    0)));
            
//#line 291
m_numPlaces =
              1;
            
//#line 292
numCuts =
              0;
        }
        
//#line 295
m_regions =
          (new x10.
             lang.
             region[m_numPlaces]);
        
//#line 296
m_REGIONs =
          (new x10.
             lang.
             region[m_numPlaces]);
        
//#line 298
m_boundaries =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(x10.
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
                                                                                                                          m_numPlaces -
                                                                                                                            1)).
                                                                                                                        toDistribution(),(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 299
m_dist =
          (new x10.
             lang.
             dist[m_numPlaces]);
        
//#line 300
m_DIST =
          (new x10.
             lang.
             dist[m_numPlaces]);
        
//#line 301
m_u =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(ALLPLACES,(x10.array.Operator.Pointwise)null,true,false,true)/* } */);
        
//#line 304
m_low =
          x10.
            lang.
            point.
            factory.
            point(
            P_DOMAIN.
              rank(
              0).
              low(),
            P_DOMAIN.
              rank(
              1).
              low(),
            P_DOMAIN.
              rank(
              2).
              low());
        
//#line 305
m_hi =
          x10.
            lang.
            point.
            factory.
            point(
            P_DOMAIN.
              rank(
              0).
              high(),
            P_DOMAIN.
              rank(
              1).
              high(),
            P_DOMAIN.
              rank(
              2).
              high());
        
//#line 306
m_size =
          x10.
            lang.
            point.
            factory.
            point(
            /* template:array_get { */((m_hi).get(0))/* } */ -
              /* template:array_get { */((m_low).get(0))/* } */ +
              1,
            /* template:array_get { */((m_hi).get(1))/* } */ -
              /* template:array_get { */((m_low).get(1))/* } */ +
              1,
            /* template:array_get { */((m_hi).get(2))/* } */ -
              /* template:array_get { */((m_low).get(2))/* } */ +
              1);
        
//#line 309
int a =
          numCuts /
          3;
        
//#line 310
int b =
          numCuts %
          3;
        
//#line 311
m_cut =
          x10.
            lang.
            point.
            factory.
            point(
            a +
              ((b >
                  0
                  ? 1
                  : 0)),
            a +
              ((b >
                  1
                  ? 1
                  : 0)),
            a);
        
//#line 312
m_block =
          x10.
            lang.
            point.
            factory.
            point(
            NPB3_0_X10.
              Util.
              pow2(
              /* template:array_get { */((m_cut).get(0))/* } */),
            NPB3_0_X10.
              Util.
              pow2(
              /* template:array_get { */((m_cut).get(1))/* } */),
            NPB3_0_X10.
              Util.
              pow2(
              /* template:array_get { */((m_cut).get(2))/* } */));
        
//#line 313
m_blockSize =
          x10.
            lang.
            point.
            factory.
            point(
            /* template:array_get { */((m_size).get(0))/* } */ /
              /* template:array_get { */((m_block).get(0))/* } */,
            /* template:array_get { */((m_size).get(1))/* } */ /
              /* template:array_get { */((m_block).get(1))/* } */,
            /* template:array_get { */((m_size).get(2))/* } */ /
              /* template:array_get { */((m_block).get(2))/* } */);
        
//#line 314
m_placeGrid =
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
              /* template:array_get { */((m_block).get(0))/* } */ -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              /* template:array_get { */((m_block).get(1))/* } */ -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              /* template:array_get { */((m_block).get(2))/* } */ -
                1));
        
//#line 315
int i;
        
//#line 315
int j;
        
//#line 315
int k;
        
//#line 315
int l;
        
//#line 316
i =
          0;
        
//#line 318
/* template:forloop { */
        for (java.util.Iterator p__ = (m_placeGrid).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 320
m_regions[i] =
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
                  /* template:array_get { */((m_blockSize).get(0))/* } */ *
                    /* template:array_get { */((p).get(0))/* } */ +
                    /* template:array_get { */((m_low).get(0))/* } */,
                  /* template:array_get { */((m_blockSize).get(0))/* } */ *
                    ((/* template:array_get { */((p).get(0))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(0))/* } */ -
                    1),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  /* template:array_get { */((m_blockSize).get(1))/* } */ *
                    /* template:array_get { */((p).get(1))/* } */ +
                    /* template:array_get { */((m_low).get(1))/* } */,
                  /* template:array_get { */((m_blockSize).get(1))/* } */ *
                    ((/* template:array_get { */((p).get(1))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(1))/* } */ -
                    1),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  /* template:array_get { */((m_blockSize).get(2))/* } */ *
                    /* template:array_get { */((p).get(2))/* } */ +
                    /* template:array_get { */((m_low).get(2))/* } */,
                  /* template:array_get { */((m_blockSize).get(2))/* } */ *
                    ((/* template:array_get { */((p).get(2))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(2))/* } */ -
                    1));
            
//#line 323
m_REGIONs[i] =
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
                  /* template:array_get { */((m_blockSize).get(0))/* } */ *
                    /* template:array_get { */((p).get(0))/* } */ +
                    /* template:array_get { */((m_low).get(0))/* } */ -
                    1,
                  /* template:array_get { */((m_blockSize).get(0))/* } */ *
                    ((/* template:array_get { */((p).get(0))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(0))/* } */),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  /* template:array_get { */((m_blockSize).get(1))/* } */ *
                    /* template:array_get { */((p).get(1))/* } */ +
                    /* template:array_get { */((m_low).get(1))/* } */ -
                    1,
                  /* template:array_get { */((m_blockSize).get(1))/* } */ *
                    ((/* template:array_get { */((p).get(1))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(1))/* } */),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  /* template:array_get { */((m_blockSize).get(2))/* } */ *
                    /* template:array_get { */((p).get(2))/* } */ +
                    /* template:array_get { */((m_low).get(2))/* } */ -
                    1,
                  /* template:array_get { */((m_blockSize).get(2))/* } */ *
                    ((/* template:array_get { */((p).get(2))/* } */ +
                        1)) +
                    /* template:array_get { */((m_low).get(2))/* } */));
            
//#line 326
m_dist[i] =
              x10.
                lang.
                dist.
                factory.
                constant(
                m_regions[i],
                x10.
                  lang.
                  place.
                  factory.
                  place(
                  i));
            
//#line 327
m_DIST[i] =
              x10.
                lang.
                dist.
                factory.
                constant(
                m_REGIONs[i],
                x10.
                  lang.
                  place.
                  factory.
                  place(
                  i));
            
//#line 328
/* template:array_set { */(m_u).set(this.new Wrapper(
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(m_DIST[i],(x10.array.Operator.Pointwise)null,true,true,false)/* } */),i)/* } */;
            
//#line 331
for (
//#line 331
l =
                                0;
                              l <
                                3;
                              
//#line 331
l++) {
                
//#line 332
j =
                  l *
                    2;
                
//#line 333
/* template:array_set { */(m_boundaries).set(NPB3_0_X10.
                                                                            Util.
                                                                            boundary(
                                                                            m_regions[i],
                                                                            -((l +
                                                                                 1)),
                                                                            x10.
                                                                              lang.
                                                                              point.
                                                                              factory.
                                                                              point(
                                                                              (l >
                                                                                 0
                                                                                 ? 1
                                                                                 : 0),
                                                                              (l >
                                                                                 1
                                                                                 ? 1
                                                                                 : 0),
                                                                              0)),/* Join: { */j,i/* } */)/* } */;
                
//#line 334
/* template:array_set { */(m_boundaries).set(NPB3_0_X10.
                                                                            Util.
                                                                            boundary(
                                                                            m_regions[i],
                                                                            (l +
                                                                               1),
                                                                            x10.
                                                                              lang.
                                                                              point.
                                                                              factory.
                                                                              point(
                                                                              (l >
                                                                                 0
                                                                                 ? 1
                                                                                 : 0),
                                                                              (l >
                                                                                 1
                                                                                 ? 1
                                                                                 : 0),
                                                                              0)),/* Join: { */j +
                  1,i/* } */)/* } */;
            }
            
//#line 337
i++;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 343
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
        
//#line 346
final NPB3_0_X10.
          LevelData MG =
          new NPB3_0_X10.
          LevelData(
          32,
          true);
        
//#line 347
MG.
                       set(
                       1);
        
//#line 348
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("MG.initialize() finished");
        
//#line 349
MG.
                       print();
        
//#line 350
MG.
                       Exchange();
        
//#line 351
MG.
                       print();
        
//#line 352
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("The 2norm is " +
                                                                                                                          MG.
                                                                                                                            norm2());
        
//#line 354
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("This is LevelData, finished!");
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
}
