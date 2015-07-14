import x10.lang.*;

public class MGOP
extends x10.
  lang.
  Object
{
    
//#line 30
final public static boolean
      PERF_On =
      Util.
        PERF_OUTPUT;
    
//#line 31
final public static double
      PERF_Comp =
      1.0 /
      Util.
        FP_PERCLOCK;
    
//#line 32
final public static double
      PERF_CommL =
      Util.
        COMM_LATENCY *
      Util.
        CLOCK_SPEED;
    
//#line 33
final public static double
      PERF_CommB =
      (((double)
          Util.
            CLOCK_SPEED /
          (double)
            Util.
              COMM_BANDWIDTH)) *
      8.0;
    
//#line 34
final public static boolean
      PERF_InLoop =
      Util.
        IN_LOOP;
    
//#line 35
final public static boolean
      PERF_CompOnly =
      Util.
        COMP_ONLY;
    
//#line 36
final public static boolean
      PERF_CommOnly =
      Util.
        COMM_ONLY;
    
//#line 37
final public static boolean
      OVERLAPPED =
      Util.
        OVERLAP_COMMANDCOMP;
    
//#line 39
final public boolean
      EXCHANGE_After;
    
//#line 41
final private static x10.
      lang.
      region
      reg =
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
          3));
    
//#line 43
final public static double
      Ac0 =
      -8.0 /
      3.0;
    
//#line 44
final public static double
      Ac1 =
      0.0;
    
//#line 45
final public static double
      Ac2 =
      1.0 /
      6.0;
    
//#line 46
final public static double
      Ac3 =
      1.0 /
      12.0;
    
//#line 47
final public static double
      Sac0 =
      -3.0 /
      8.0;
    
//#line 48
final public static double
      Sac1 =
      1.0 /
      32.0;
    
//#line 49
final public static double
      Sac2 =
      -1.0 /
      64.0;
    
//#line 50
final public static double
      Sac3 =
      0.0;
    
//#line 51
final public static double
      Pc0 =
      1.0 /
      2.0;
    
//#line 52
final public static double
      Pc1 =
      1.0 /
      4.0;
    
//#line 53
final public static double
      Pc2 =
      1.0 /
      8.0;
    
//#line 54
final public static double
      Pc3 =
      1.0 /
      16.0;
    
//#line 58
final private static int
      P2SLEVEL =
      Util.
        P2SLEVEL -
      1;
    
//#line 60
final private int
      m_size;
    
//#line 61
final private x10.
      lang.
      region
      m_problemDomain;
    
//#line 62
final private int
      m_levels;
    
//#line 63
private x10.
      lang.
      GenericReferenceArray
      m_r;
    
//#line 64
private x10.
      lang.
      GenericReferenceArray
      m_z;
    
//#line 65
private LevelData
      m_tempLD;
    
    
//#line 68
public MGOP(final int a_size) {
        
//#line 68
super();
        
//#line 69
boolean temp_EXCHANGE_After =
          false;
        
//#line 70
if (Util.
                          OVERLAP_COMMANDCOMP) {
            
//#line 71
temp_EXCHANGE_After =
              false;
        } else {
            
//#line 73
temp_EXCHANGE_After =
              Util.
                EXCHANGE_AFTER;
        }
        
//#line 74
EXCHANGE_After =
          temp_EXCHANGE_After;
        
//#line 77
int i =
          0;
        
//#line 78
int j =
          0;
        
//#line 79
int k =
          0;
        
//#line 81
m_size =
          a_size;
        
//#line 82
m_problemDomain =
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
              a_size -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              a_size -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              a_size -
                1));
        
//#line 83
final int log_a_size =
          Util.
            log2(
            a_size);
        
//#line 84
m_levels =
          log_a_size;
        
//#line 86
if (P2SLEVEL >
                          0) {
            
//#line 87
i =
              Util.
                pow2(
                P2SLEVEL);
            
//#line 87
j =
              i *
                i *
                i;
        } else {
            
        }
        
//#line 94
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
                log_a_size)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 95
m_r =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
             lang.
             point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
               
//#line 96
return new LevelData(
                 Util.
                   pow2(
                   /* template:array_get { */((p).get(0))/* } */ +
                     1),
                 /* template:array_get { */((p).get(0))/* } */ >=
                   P2SLEVEL);
           } }
           }/* } */,true,true,true)/* } */);
        
//#line 97
m_z =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
             lang.
             point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
               
//#line 98
return new LevelData(
                 Util.
                   pow2(
                   /* template:array_get { */((p).get(0))/* } */ +
                     1),
                 /* template:array_get { */((p).get(0))/* } */ >=
                   P2SLEVEL);
           } }
           }/* } */,true,true,true)/* } */);
        
//#line 99
if (P2SLEVEL >
                          0) {
            
//#line 99
m_tempLD =
              new LevelData(
                Util.
                  pow2(
                  P2SLEVEL),
                true);
        }
        
//#line 100
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Overlapping communication and computation? " +
                                                                                                                          OVERLAPPED +
                                                                                                                          ". If not, doing exchange after computation? " +
                                                                                                                          temp_EXCHANGE_After);
    }
    
    
//#line 105
public void
                   computeResidual2(
                   final LevelData RES,
                   final LevelData a_arg) {
        
//#line 107
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 107
/* template:ateach { */
            {
            	x10.lang.dist __var16____distCopy = RES.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var16____ = __var16____distCopy.iterator();
            		 __var16____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var16__ = (x10.
              lang.
              point) __var16____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var16__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var16____distCopy.get(__var16__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var16__).get(0))/* } */;/* } */
{
                
//#line 108
final x10.
                  lang.
                  DoubleReferenceArray res =
                  RES.
                    getArray(
                    i);
                
//#line 109
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 111
x10.
                  lang.
                  region R =
                  RES.
                    getInnerRegion(
                    i);
                
//#line 113
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 114
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 115
double d1 =
                      0;
                    
//#line 117
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 118
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 119
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ -
                      ((Ac0 *
                          d0 +
                          Ac2 *
                          d2 +
                          Ac3 *
                          d3)),p)/* } */;
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
        	} catch (Throwable tmp95) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp95);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 122
if (EXCHANGE_After) {
            
//#line 122
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 122
RES.
                               exchange();
            }
            	} catch (Throwable tmp96) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp96);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 126
private void
                   computeResidual3(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 127
if (OVERLAPPED) {
            
//#line 128
ComputeResidual_Overlapped(
                           a_res,
                           a_arg1,
                           a_arg2);
        } else {
            
//#line 130
ComputeResidual(
                           a_res,
                           a_arg1,
                           a_arg2);
        }
    }
    
    
//#line 133
private void
                   ComputeResidual(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 134
if (!EXCHANGE_After) {
            
//#line 134
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 134
a_arg2.
                               exchange();
            }
            	} catch (Throwable tmp97) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp97);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 135
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 135
/* template:ateach { */
            {
            	x10.lang.dist __var17____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var17____ = __var17____distCopy.iterator();
            		 __var17____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var17__ = (x10.
              lang.
              point) __var17____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var17__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var17____distCopy.get(__var17__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var17__).get(0))/* } */;/* } */
{
                
//#line 136
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 137
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 138
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 140
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 142
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 143
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 146
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 147
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 148
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac0 *
                      d0 -
                      Ac2 *
                      d2 -
                      Ac3 *
                      d3,p)/* } */;
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
        	} catch (Throwable tmp98) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp98);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 151
if (EXCHANGE_After) {
            
//#line 151
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 151
a_res.
                               exchange();
            }
            	} catch (Throwable tmp99) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp99);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 154
private void
                   ComputeResidual_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 155
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 156
a_arg2.
                           exchange();
            
//#line 157
/* template:ateach { */
            {
            	x10.lang.dist __var18____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var18____ = __var18____distCopy.iterator();
            		 __var18____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var18__ = (x10.
              lang.
              point) __var18____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var18__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var18____distCopy.get(__var18__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var18__).get(0))/* } */;/* } */
{
                
//#line 158
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 159
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 160
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 162
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 164
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 165
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 167
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 168
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 169
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac0 *
                      d0 -
                      Ac2 *
                      d2 -
                      Ac3 *
                      d3,p)/* } */;
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
        	} catch (Throwable tmp100) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp100);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 173
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 173
/* template:ateach { */
            {
            	x10.lang.dist __var19____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var19____ = __var19____distCopy.iterator();
            		 __var19____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var19__ = (x10.
              lang.
              point) __var19____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var19__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var19____distCopy.get(__var19__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var19__).get(0))/* } */;/* } */
{
                
//#line 174
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 175
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 176
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 178
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i).
                    difference(
                    a_res.
                      getINNERRegion(
                      i));
                
//#line 180
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 181
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 182
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 183
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 184
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac0 *
                      d0 -
                      Ac2 *
                      d2 -
                      Ac3 *
                      d3,p)/* } */;
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
        	} catch (Throwable tmp101) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp101);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 189
private void
                   ComputeResidual_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 190
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 190
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 191
/* template:ateach { */
                {
                	x10.lang.dist __var20____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var20____ = __var20____distCopy.iterator();
                		 __var20____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var20__ = (x10.
                  lang.
                  point) __var20____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var20____distCopy.get(__var20__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
{
                    
//#line 192
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 193
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 194
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 196
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 198
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 199
double d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 201
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg2);
                        
//#line 202
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg2);
                        
//#line 203
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                          Ac0 *
                          d0 -
                          Ac2 *
                          d2 -
                          Ac3 *
                          d3,p)/* } */;
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 207
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 207
a_arg2.
                                   exchange();
                }
                	} catch (Throwable tmp103) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp103);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 209
/* template:ateach { */
                {
                	x10.lang.dist __var21____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var21____ = __var21____distCopy.iterator();
                		 __var21____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var21__ = (x10.
                  lang.
                  point) __var21____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var21__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var21____distCopy.get(__var21__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var21__).get(0))/* } */;/* } */
{
                    
//#line 210
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 211
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 212
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 214
x10.
                      lang.
                      region R =
                      a_res.
                        getInnerRegion(
                        i).
                        difference(
                        a_res.
                          getINNERRegion(
                          i));
                    
//#line 216
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 217
double d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 218
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg2);
                        
//#line 219
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg2);
                        
//#line 220
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                          Ac0 *
                          d0 -
                          Ac2 *
                          d2 -
                          Ac3 *
                          d3,p)/* } */;
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
            		}
            	});/* } */
        }
        	} catch (Throwable tmp102) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp102);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 227
private void
                   smooth(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 228
if (OVERLAPPED) {
            
//#line 229
Smooth_Overlapped(
                           a_res,
                           a_arg,
                           a_isBottom);
        } else {
            
//#line 231
Smooth(
                           a_res,
                           a_arg,
                           a_isBottom);
        }
    }
    
    
//#line 233
private void
                   Smooth(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 234
if (!EXCHANGE_After) {
            
//#line 234
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 234
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp104) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp104);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 236
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 236
/* template:ateach { */
            {
            	x10.lang.dist __var22____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var22____ = __var22____distCopy.iterator();
            		 __var22____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var22__ = (x10.
              lang.
              point) __var22____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var22____distCopy.get(__var22__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                
//#line 237
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 238
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 240
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 242
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 243
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 244
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 245
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 250
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ +
                      Sac0 *
                      d0 +
                      Sac1 *
                      d1 +
                      Sac2 *
                      d2,p)/* } */;
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
        	} catch (Throwable tmp105) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp105);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 253
if (EXCHANGE_After) {
            
//#line 253
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 253
a_res.
                               exchange();
            }
            	} catch (Throwable tmp106) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp106);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 256
private void
                   Smooth_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 257
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 258
a_arg.
                           exchange();
            
//#line 259
/* template:ateach { */
            {
            	x10.lang.dist __var23____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var23____ = __var23____distCopy.iterator();
            		 __var23____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var23__ = (x10.
              lang.
              point) __var23____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var23__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var23____distCopy.get(__var23__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var23__).get(0))/* } */;/* } */
{
                
//#line 260
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 261
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 263
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 265
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 266
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 267
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 268
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 269
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ +
                      Sac0 *
                      d0 +
                      Sac1 *
                      d1 +
                      Sac2 *
                      d2,p)/* } */;
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
        	} catch (Throwable tmp107) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp107);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 273
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 273
/* template:ateach { */
            {
            	x10.lang.dist __var24____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var24____ = __var24____distCopy.iterator();
            		 __var24____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var24__ = (x10.
              lang.
              point) __var24____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var24__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var24____distCopy.get(__var24__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var24__).get(0))/* } */;/* } */
{
                
//#line 274
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 275
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 277
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i).
                    difference(
                    a_res.
                      getINNERRegion(
                      i));
                
//#line 279
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 280
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 281
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 282
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 283
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ +
                      Sac0 *
                      d0 +
                      Sac1 *
                      d1 +
                      Sac2 *
                      d2,p)/* } */;
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
        	} catch (Throwable tmp108) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp108);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 288
private void
                   Smooth_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 289
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 289
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 290
/* template:ateach { */
                {
                	x10.lang.dist __var25____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var25____ = __var25____distCopy.iterator();
                		 __var25____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var25__ = (x10.
                  lang.
                  point) __var25____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var25__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var25____distCopy.get(__var25__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var25__).get(0))/* } */;/* } */
{
                    
//#line 291
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 292
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 294
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 296
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 297
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 298
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 299
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 300
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ +
                          Sac0 *
                          d0 +
                          Sac1 *
                          d1 +
                          Sac2 *
                          d2,p)/* } */;
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 304
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 304
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp110) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp110);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 305
/* template:ateach { */
                {
                	x10.lang.dist __var26____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var26____ = __var26____distCopy.iterator();
                		 __var26____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var26__ = (x10.
                  lang.
                  point) __var26____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var26__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var26____distCopy.get(__var26__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var26__).get(0))/* } */;/* } */
{
                    
//#line 306
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 307
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 309
x10.
                      lang.
                      region R =
                      a_res.
                        getInnerRegion(
                        i).
                        difference(
                        a_res.
                          getINNERRegion(
                          i));
                    
//#line 311
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 312
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 313
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 314
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 315
/* template:array_set { */(res).set(/* template:array_get { */((res).get(p))/* } */ +
                          Sac0 *
                          d0 +
                          Sac1 *
                          d1 +
                          Sac2 *
                          d2,p)/* } */;
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
            		}
            	});/* } */
        }
        	} catch (Throwable tmp109) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp109);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 322
private void
                   applyOpP3(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final int a_level) {
        
//#line 323
if (a_level ==
                           P2SLEVEL) {
            
//#line 324
applyOpP2(
                           m_tempLD,
                           a_arg);
            
//#line 326
final x10.
              lang.
              DoubleReferenceArray res =
              a_res.
                getArray(
                0);
            
//#line 329
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 329
/* template:ateach { */
                {
                	x10.lang.dist __var27____distCopy = m_tempLD.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var27____ = __var27____distCopy.iterator();
                		 __var27____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var27__ = (x10.
                  lang.
                  point) __var27____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var27__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var27____distCopy.get(__var27__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var27__).get(0))/* } */;/* } */
{
                    
//#line 330
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 331
Util.
                                   arraycopy3(
                                   res,
                                   (x10.
                                     lang.
                                     region)
                                     m_tempLD.
                                       getInnerRegion(
                                       i),
                                   temp);
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp111) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp111);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        } else {
            
//#line 335
applyOpP2(
                           a_res,
                           a_arg);
        }
        
//#line 336
if (EXCHANGE_After) {
            
//#line 336
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 336
a_res.
                               exchange();
            }
            	} catch (Throwable tmp112) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp112);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 338
private void
                   applyOpP2(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 339
if (OVERLAPPED) {
            
//#line 340
ApplyOpP_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 342
ApplyOpP(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 344
private void
                   ApplyOpP(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 345
if (!EXCHANGE_After) {
            
//#line 345
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 345
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp113) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp113);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 346
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 346
/* template:ateach { */
            {
            	x10.lang.dist __var28____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var28____ = __var28____distCopy.iterator();
            		 __var28____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var28__ = (x10.
              lang.
              point) __var28____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var28__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var28____distCopy.get(__var28__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var28__).get(0))/* } */;/* } */
{
                
//#line 347
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 348
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 351
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 353
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 354
x10.
                      lang.
                      point p =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                          lang.
                                                                                                                                                                                                          point.
                                                                                                                                                                                                          factory.
                                                                                                                                                                                                          point(
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1));
                    
//#line 355
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 356
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 357
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 358
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 359
/* template:array_set { */(res).set(Pc0 *
                      d0 +
                      Pc1 *
                      d1 +
                      Pc2 *
                      d2 +
                      Pc3 *
                      d3,pp)/* } */;
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
        	} catch (Throwable tmp114) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp114);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 364
private void
                   ApplyOpP_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 365
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 366
a_arg.
                           exchange();
            
//#line 367
/* template:ateach { */
            {
            	x10.lang.dist __var29____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var29____ = __var29____distCopy.iterator();
            		 __var29____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var29__ = (x10.
              lang.
              point) __var29____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var29__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var29____distCopy.get(__var29__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var29__).get(0))/* } */;/* } */
{
                
//#line 368
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 369
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 371
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 373
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 374
x10.
                      lang.
                      point p =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                          lang.
                                                                                                                                                                                                          point.
                                                                                                                                                                                                          factory.
                                                                                                                                                                                                          point(
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1));
                    
//#line 375
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 376
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 377
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 378
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 379
/* template:array_set { */(res).set(Pc0 *
                      d0 +
                      Pc1 *
                      d1 +
                      Pc2 *
                      d2 +
                      Pc3 *
                      d3,pp)/* } */;
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
        	} catch (Throwable tmp115) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp115);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 383
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 383
/* template:ateach { */
            {
            	x10.lang.dist __var30____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var30____ = __var30____distCopy.iterator();
            		 __var30____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var30__ = (x10.
              lang.
              point) __var30____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var30__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var30____distCopy.get(__var30__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var30__).get(0))/* } */;/* } */
{
                
//#line 384
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 385
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 387
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i).
                    difference(
                    a_res.
                      getINNERRegion(
                      i));
                
//#line 389
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 390
x10.
                      lang.
                      point p =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                          lang.
                                                                                                                                                                                                          point.
                                                                                                                                                                                                          factory.
                                                                                                                                                                                                          point(
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1,
                                                                                                                                                                                                          1));
                    
//#line 391
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 392
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 393
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 394
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 395
/* template:array_set { */(res).set(Pc0 *
                      d0 +
                      Pc1 *
                      d1 +
                      Pc2 *
                      d2 +
                      Pc3 *
                      d3,pp)/* } */;
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
        	} catch (Throwable tmp116) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp116);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 400
private void
                   ApplyOpP_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 401
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 401
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 402
/* template:ateach { */
                {
                	x10.lang.dist __var31____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var31____ = __var31____distCopy.iterator();
                		 __var31____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var31__ = (x10.
                  lang.
                  point) __var31____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var31__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var31____distCopy.get(__var31__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var31__).get(0))/* } */;/* } */
{
                    
//#line 403
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 404
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 406
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 408
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 409
x10.
                          lang.
                          point p =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                              lang.
                                                                                                                                                                                                              point.
                                                                                                                                                                                                              factory.
                                                                                                                                                                                                              point(
                                                                                                                                                                                                              1,
                                                                                                                                                                                                              1,
                                                                                                                                                                                                              1));
                        
//#line 410
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 411
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 412
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 413
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg);
                        
//#line 414
/* template:array_set { */(res).set(Pc0 *
                          d0 +
                          Pc1 *
                          d1 +
                          Pc2 *
                          d2 +
                          Pc3 *
                          d3,pp)/* } */;
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 418
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 418
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp118) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp118);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 420
/* template:ateach { */
                {
                	x10.lang.dist __var32____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var32____ = __var32____distCopy.iterator();
                		 __var32____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var32__ = (x10.
                  lang.
                  point) __var32____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var32__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var32____distCopy.get(__var32__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var32__).get(0))/* } */;/* } */
{
                    
//#line 421
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 422
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 424
x10.
                      lang.
                      region R =
                      a_res.
                        getInnerRegion(
                        i).
                        difference(
                        a_res.
                          getINNERRegion(
                          i));
                    
//#line 426
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 427
x10.
                          lang.
                          point p =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                              lang.
                                                                                                                                                                                                              point.
                                                                                                                                                                                                              factory.
                                                                                                                                                                                                              point(
                                                                                                                                                                                                              1,
                                                                                                                                                                                                              1,
                                                                                                                                                                                                              1));
                        
//#line 428
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 429
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 430
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 431
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg);
                        
//#line 432
/* template:array_set { */(res).set(Pc0 *
                          d0 +
                          Pc1 *
                          d1 +
                          Pc2 *
                          d2 +
                          Pc3 *
                          d3,pp)/* } */;
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
            		}
            	});/* } */
        }
        	} catch (Throwable tmp117) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp117);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 440
private void
                   applyOpQ3(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final int a_level) {
        
//#line 441
if (a_level ==
                           P2SLEVEL -
                           1) {
            
//#line 443
final x10.
              lang.
              DoubleReferenceArray arg =
              a_arg.
                getArray(
                0);
            
//#line 444
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 444
/* template:ateach { */
                {
                	x10.lang.dist __var33____distCopy = m_tempLD.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var33____ = __var33____distCopy.iterator();
                		 __var33____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var33__ = (x10.
                  lang.
                  point) __var33____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var33__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var33____distCopy.get(__var33__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var33__).get(0))/* } */;/* } */
{
                    
//#line 445
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 446
Util.
                                   arraycopy3(
                                   temp,
                                   (x10.
                                     lang.
                                     region)
                                     temp.
                                       region,
                                   arg);
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp119) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp119);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 448
applyOpQ2(
                           a_res,
                           m_tempLD);
        } else {
            
//#line 451
applyOpQ2(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 454
private void
                   applyOpQ2(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 455
if (OVERLAPPED) {
            
//#line 456
ApplyOpQ_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 458
ApplyOpQ(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 461
private void
                   ApplyOpQ(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 462
if (!EXCHANGE_After) {
            
//#line 462
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 462
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp120) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp120);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 463
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 463
/* template:ateach { */
            {
            	x10.lang.dist __var34____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
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
                
//#line 464
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 465
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 468
x10.
                  lang.
                  region R =
                  a_arg.
                    getShrinkedRegion(
                    i);
                
//#line 470
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 471
double d =
                      0;
                    
//#line 472
x10.
                      lang.
                      point pp =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                         lang.
                                                                                                                                                                                                         point.
                                                                                                                                                                                                         factory.
                                                                                                                                                                                                         point(
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1));
                    
//#line 473
/* template:forloop-mult { */{
                    x10.lang.region __var122__ = (x10.lang.region) Util.
                                                                     UNIT_CUBE;
                    if (__var122__.size() > 0 && (__var122__ instanceof x10.array.MultiDimRegion || __var122__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var123__ = __var122__.rank(0).low(), __var124__ = __var122__.rank(0).high(); __var123__ <= __var124__; __var123__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var125__ = __var122__.rank(1).low(), __var126__ = __var122__.rank(1).high(); __var125__ <= __var126__; __var125__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var127__ = __var122__.rank(2).low(), __var128__ = __var122__.rank(2).high(); __var127__ <= __var128__; __var127__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var123__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var125__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var127__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var123__,__var125__,__var127__/* } */);/* } */
{
                        
//#line 474
d =
                          0;
                        
//#line 476
/* template:forloop-mult { */{
                        x10.lang.region __var129__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var129__.size() > 0 && (__var129__ instanceof x10.array.MultiDimRegion || __var129__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var130__ = __var129__.rank(0).low(), __var131__ = __var129__.rank(0).high(); __var130__ <= __var131__; __var130__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var132__ = __var129__.rank(1).low(), __var133__ = __var129__.rank(1).high(); __var132__ <= __var133__; __var132__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var134__ = __var129__.rank(2).low(), __var135__ = __var129__.rank(2).high(); __var134__ <= __var135__; __var134__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var130__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var132__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var134__;
                        /* } */
                        /* } */
{
                            
//#line 477
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 478
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var35____ = (__var129__).iterator(); __var35____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var35__ = (x10.
                          lang.
                          point) __var35____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var35__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var35__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var35__).get(2))/* } */;/* } */
{
                            
//#line 477
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 478
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 480
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator o__ = (__var122__).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { */final int i2 =
                      /* template:array_get { */((o).get(0))/* } */;
final int j2 =
                      /* template:array_get { */((o).get(1))/* } */;
final int k2 =
                      /* template:array_get { */((o).get(2))/* } */;/* } */
{
                        
//#line 474
d =
                          0;
                        
//#line 476
/* template:forloop-mult { */{
                        x10.lang.region __var136__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var136__.size() > 0 && (__var136__ instanceof x10.array.MultiDimRegion || __var136__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var137__ = __var136__.rank(0).low(), __var138__ = __var136__.rank(0).high(); __var137__ <= __var138__; __var137__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var139__ = __var136__.rank(1).low(), __var140__ = __var136__.rank(1).high(); __var139__ <= __var140__; __var139__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var141__ = __var136__.rank(2).low(), __var142__ = __var136__.rank(2).high(); __var141__ <= __var142__; __var141__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var137__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var139__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var141__;
                        /* } */
                        /* } */
{
                            
//#line 477
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 478
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var35____ = (__var136__).iterator(); __var35____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var35__ = (x10.
                          lang.
                          point) __var35____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var35__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var35__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var35__).get(2))/* } */;/* } */
{
                            
//#line 477
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 478
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 480
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
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
        	} catch (Throwable tmp121) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp121);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 486
private void
                   ApplyOpQ_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 487
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 488
a_arg.
                           exchange();
            
//#line 489
/* template:ateach { */
            {
            	x10.lang.dist __var36____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var36____ = __var36____distCopy.iterator();
            		 __var36____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var36__ = (x10.
              lang.
              point) __var36____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var36__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var36____distCopy.get(__var36__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var36__).get(0))/* } */;/* } */
{
                
//#line 490
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 491
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 493
x10.
                  lang.
                  region R =
                  a_arg.
                    getINNERRegion(
                    i);
                
//#line 495
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 496
double d =
                      0;
                    
//#line 497
x10.
                      lang.
                      point pp =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                         lang.
                                                                                                                                                                                                         point.
                                                                                                                                                                                                         factory.
                                                                                                                                                                                                         point(
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1));
                    
//#line 498
/* template:forloop-mult { */{
                    x10.lang.region __var144__ = (x10.lang.region) Util.
                                                                     UNIT_CUBE;
                    if (__var144__.size() > 0 && (__var144__ instanceof x10.array.MultiDimRegion || __var144__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var145__ = __var144__.rank(0).low(), __var146__ = __var144__.rank(0).high(); __var145__ <= __var146__; __var145__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var147__ = __var144__.rank(1).low(), __var148__ = __var144__.rank(1).high(); __var147__ <= __var148__; __var147__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var149__ = __var144__.rank(2).low(), __var150__ = __var144__.rank(2).high(); __var149__ <= __var150__; __var149__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var145__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var147__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var149__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var145__,__var147__,__var149__/* } */);/* } */
{
                        
//#line 499
d =
                          0;
                        
//#line 501
/* template:forloop-mult { */{
                        x10.lang.region __var151__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var151__.size() > 0 && (__var151__ instanceof x10.array.MultiDimRegion || __var151__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var152__ = __var151__.rank(0).low(), __var153__ = __var151__.rank(0).high(); __var152__ <= __var153__; __var152__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var154__ = __var151__.rank(1).low(), __var155__ = __var151__.rank(1).high(); __var154__ <= __var155__; __var154__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var156__ = __var151__.rank(2).low(), __var157__ = __var151__.rank(2).high(); __var156__ <= __var157__; __var156__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var152__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var154__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var156__;
                        /* } */
                        /* } */
{
                            
//#line 502
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 503
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var37____ = (__var151__).iterator(); __var37____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var37__ = (x10.
                          lang.
                          point) __var37____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var37__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var37__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var37__).get(2))/* } */;/* } */
{
                            
//#line 502
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 503
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 505
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator o__ = (__var144__).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { */final int i2 =
                      /* template:array_get { */((o).get(0))/* } */;
final int j2 =
                      /* template:array_get { */((o).get(1))/* } */;
final int k2 =
                      /* template:array_get { */((o).get(2))/* } */;/* } */
{
                        
//#line 499
d =
                          0;
                        
//#line 501
/* template:forloop-mult { */{
                        x10.lang.region __var158__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var158__.size() > 0 && (__var158__ instanceof x10.array.MultiDimRegion || __var158__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var159__ = __var158__.rank(0).low(), __var160__ = __var158__.rank(0).high(); __var159__ <= __var160__; __var159__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var161__ = __var158__.rank(1).low(), __var162__ = __var158__.rank(1).high(); __var161__ <= __var162__; __var161__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var163__ = __var158__.rank(2).low(), __var164__ = __var158__.rank(2).high(); __var163__ <= __var164__; __var163__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var159__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var161__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var163__;
                        /* } */
                        /* } */
{
                            
//#line 502
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 503
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var37____ = (__var158__).iterator(); __var37____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var37__ = (x10.
                          lang.
                          point) __var37____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var37__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var37__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var37__).get(2))/* } */;/* } */
{
                            
//#line 502
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 503
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 505
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
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
        	} catch (Throwable tmp143) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp143);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 510
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 510
/* template:ateach { */
            {
            	x10.lang.dist __var38____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var38____ = __var38____distCopy.iterator();
            		 __var38____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var38__ = (x10.
              lang.
              point) __var38____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var38__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var38____distCopy.get(__var38__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var38__).get(0))/* } */;/* } */
{
                
//#line 511
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 512
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 514
x10.
                  lang.
                  region R =
                  a_arg.
                    getShrinkedRegion(
                    i).
                    difference(
                    a_arg.
                      getINNERRegion(
                      i));
                
//#line 516
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 517
double d =
                      0;
                    
//#line 518
x10.
                      lang.
                      point pp =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                         lang.
                                                                                                                                                                                                         point.
                                                                                                                                                                                                         factory.
                                                                                                                                                                                                         point(
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1,
                                                                                                                                                                                                         1));
                    
//#line 519
/* template:forloop-mult { */{
                    x10.lang.region __var166__ = (x10.lang.region) Util.
                                                                     UNIT_CUBE;
                    if (__var166__.size() > 0 && (__var166__ instanceof x10.array.MultiDimRegion || __var166__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var167__ = __var166__.rank(0).low(), __var168__ = __var166__.rank(0).high(); __var167__ <= __var168__; __var167__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var169__ = __var166__.rank(1).low(), __var170__ = __var166__.rank(1).high(); __var169__ <= __var170__; __var169__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var171__ = __var166__.rank(2).low(), __var172__ = __var166__.rank(2).high(); __var171__ <= __var172__; __var171__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var167__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var169__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var171__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var167__,__var169__,__var171__/* } */);/* } */
{
                        
//#line 520
d =
                          0;
                        
//#line 522
/* template:forloop-mult { */{
                        x10.lang.region __var173__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var173__.size() > 0 && (__var173__ instanceof x10.array.MultiDimRegion || __var173__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var174__ = __var173__.rank(0).low(), __var175__ = __var173__.rank(0).high(); __var174__ <= __var175__; __var174__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var176__ = __var173__.rank(1).low(), __var177__ = __var173__.rank(1).high(); __var176__ <= __var177__; __var176__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var178__ = __var173__.rank(2).low(), __var179__ = __var173__.rank(2).high(); __var178__ <= __var179__; __var178__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var174__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var176__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var178__;
                        /* } */
                        /* } */
{
                            
//#line 522
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 523
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var39____ = (__var173__).iterator(); __var39____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var39__ = (x10.
                          lang.
                          point) __var39____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var39__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var39__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var39__).get(2))/* } */;/* } */
{
                            
//#line 522
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 523
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 525
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator o__ = (__var166__).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { */final int i2 =
                      /* template:array_get { */((o).get(0))/* } */;
final int j2 =
                      /* template:array_get { */((o).get(1))/* } */;
final int k2 =
                      /* template:array_get { */((o).get(2))/* } */;/* } */
{
                        
//#line 520
d =
                          0;
                        
//#line 522
/* template:forloop-mult { */{
                        x10.lang.region __var180__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var180__.size() > 0 && (__var180__ instanceof x10.array.MultiDimRegion || __var180__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var181__ = __var180__.rank(0).low(), __var182__ = __var180__.rank(0).high(); __var181__ <= __var182__; __var181__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var183__ = __var180__.rank(1).low(), __var184__ = __var180__.rank(1).high(); __var183__ <= __var184__; __var183__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var185__ = __var180__.rank(2).low(), __var186__ = __var180__.rank(2).high(); __var185__ <= __var186__; __var185__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var181__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var183__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var185__;
                        /* } */
                        /* } */
{
                            
//#line 522
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 523
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var39____ = (__var180__).iterator(); __var39____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var39__ = (x10.
                          lang.
                          point) __var39____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var39__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var39__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var39__).get(2))/* } */;/* } */
{
                            
//#line 522
final x10.
                              lang.
                              point temp =
                              /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                        lang.
                                                                                                                        point.
                                                                                                                        factory.
                                                                                                                        point(
                                                                                                                        i1,
                                                                                                                        j1,
                                                                                                                        k1));
                            
//#line 523
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 525
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                              lang.
                                                                                                                              point.
                                                                                                                              factory.
                                                                                                                              point(
                                                                                                                              i2,
                                                                                                                              j2,
                                                                                                                              k2)))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
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
        	} catch (Throwable tmp165) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp165);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 531
private void
                   ApplyOpQ_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 532
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 532
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 533
/* template:ateach { */
                {
                	x10.lang.dist __var40____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var40____ = __var40____distCopy.iterator();
                		 __var40____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var40__ = (x10.
                  lang.
                  point) __var40____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var40__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var40____distCopy.get(__var40__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var40__).get(0))/* } */;/* } */
{
                    
//#line 534
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 535
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 537
x10.
                      lang.
                      region R =
                      a_arg.
                        getINNERRegion(
                        i);
                    
//#line 539
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 540
double d =
                          0;
                        
//#line 541
x10.
                          lang.
                          point pp =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                             lang.
                                                                                                                                                                                                             point.
                                                                                                                                                                                                             factory.
                                                                                                                                                                                                             point(
                                                                                                                                                                                                             1,
                                                                                                                                                                                                             1,
                                                                                                                                                                                                             1));
                        
//#line 542
/* template:forloop-mult { */{
                        x10.lang.region __var188__ = (x10.lang.region) Util.
                                                                         UNIT_CUBE;
                        if (__var188__.size() > 0 && (__var188__ instanceof x10.array.MultiDimRegion || __var188__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var189__ = __var188__.rank(0).low(), __var190__ = __var188__.rank(0).high(); __var189__ <= __var190__; __var189__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var191__ = __var188__.rank(1).low(), __var192__ = __var188__.rank(1).high(); __var191__ <= __var192__; __var191__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var193__ = __var188__.rank(2).low(), __var194__ = __var188__.rank(2).high(); __var193__ <= __var194__; __var193__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i2 = __var189__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j2 = __var191__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k2 = __var193__;
                        /* } */
                        /* } */
/* Join: { *//* template:point-create { */
                        final  x10.
                          lang.
                          point o = point.factory.point(/* Join: { */__var189__,__var191__,__var193__/* } */);/* } */
{
                            
//#line 543
d =
                              0;
                            
//#line 545
/* template:forloop-mult { */{
                            x10.lang.region __var195__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
                            if (__var195__.size() > 0 && (__var195__ instanceof x10.array.MultiDimRegion || __var195__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var196__ = __var195__.rank(0).low(), __var197__ = __var195__.rank(0).high(); __var196__ <= __var197__; __var196__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var198__ = __var195__.rank(1).low(), __var199__ = __var195__.rank(1).high(); __var198__ <= __var199__; __var198__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var200__ = __var195__.rank(2).low(), __var201__ = __var195__.rank(2).high(); __var200__ <= __var201__; __var200__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i1 = __var196__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var198__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var200__;
                            /* } */
                            /* } */
{
                                
//#line 545
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 546
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var41____ = (__var195__).iterator(); __var41____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var41__ = (x10.
                              lang.
                              point) __var41____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var41__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var41__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var41__).get(2))/* } */;/* } */
{
                                
//#line 545
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 546
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 548
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                                  lang.
                                                                                                                                  point.
                                                                                                                                  factory.
                                                                                                                                  point(
                                                                                                                                  i2,
                                                                                                                                  j2,
                                                                                                                                  k2)))/* } */;
                        }/* } *//* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator o__ = (__var188__).iterator(); o__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point o = (x10.
                          lang.
                          point) o__.next();
                        	/* Join: { *//* Join: { */final int i2 =
                          /* template:array_get { */((o).get(0))/* } */;
final int j2 =
                          /* template:array_get { */((o).get(1))/* } */;
final int k2 =
                          /* template:array_get { */((o).get(2))/* } */;/* } */
{
                            
//#line 543
d =
                              0;
                            
//#line 545
/* template:forloop-mult { */{
                            x10.lang.region __var202__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
                            if (__var202__.size() > 0 && (__var202__ instanceof x10.array.MultiDimRegion || __var202__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var203__ = __var202__.rank(0).low(), __var204__ = __var202__.rank(0).high(); __var203__ <= __var204__; __var203__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var205__ = __var202__.rank(1).low(), __var206__ = __var202__.rank(1).high(); __var205__ <= __var206__; __var205__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var207__ = __var202__.rank(2).low(), __var208__ = __var202__.rank(2).high(); __var207__ <= __var208__; __var207__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i1 = __var203__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var205__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var207__;
                            /* } */
                            /* } */
{
                                
//#line 545
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 546
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var41____ = (__var202__).iterator(); __var41____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var41__ = (x10.
                              lang.
                              point) __var41____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var41__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var41__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var41__).get(2))/* } */;/* } */
{
                                
//#line 545
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 546
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 548
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                                  lang.
                                                                                                                                  point.
                                                                                                                                  factory.
                                                                                                                                  point(
                                                                                                                                  i2,
                                                                                                                                  j2,
                                                                                                                                  k2)))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 554
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 554
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp209) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp209);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 556
/* template:ateach { */
                {
                	x10.lang.dist __var42____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var42____ = __var42____distCopy.iterator();
                		 __var42____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var42__ = (x10.
                  lang.
                  point) __var42____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var42__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var42____distCopy.get(__var42__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var42__).get(0))/* } */;/* } */
{
                    
//#line 557
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 558
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 560
x10.
                      lang.
                      region R =
                      a_arg.
                        getShrinkedRegion(
                        i).
                        difference(
                        a_arg.
                          getINNERRegion(
                          i));
                    
//#line 562
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 563
double d =
                          0;
                        
//#line 564
x10.
                          lang.
                          point pp =
                          /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.mul(2)))/* } */.add(x10.
                                                                                                                                                                                                             lang.
                                                                                                                                                                                                             point.
                                                                                                                                                                                                             factory.
                                                                                                                                                                                                             point(
                                                                                                                                                                                                             1,
                                                                                                                                                                                                             1,
                                                                                                                                                                                                             1));
                        
//#line 565
/* template:forloop-mult { */{
                        x10.lang.region __var210__ = (x10.lang.region) Util.
                                                                         UNIT_CUBE;
                        if (__var210__.size() > 0 && (__var210__ instanceof x10.array.MultiDimRegion || __var210__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var211__ = __var210__.rank(0).low(), __var212__ = __var210__.rank(0).high(); __var211__ <= __var212__; __var211__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var213__ = __var210__.rank(1).low(), __var214__ = __var210__.rank(1).high(); __var213__ <= __var214__; __var213__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var215__ = __var210__.rank(2).low(), __var216__ = __var210__.rank(2).high(); __var215__ <= __var216__; __var215__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i2 = __var211__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j2 = __var213__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k2 = __var215__;
                        /* } */
                        /* } */
/* Join: { *//* template:point-create { */
                        final  x10.
                          lang.
                          point o = point.factory.point(/* Join: { */__var211__,__var213__,__var215__/* } */);/* } */
{
                            
//#line 566
d =
                              0;
                            
//#line 568
/* template:forloop-mult { */{
                            x10.lang.region __var217__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
                            if (__var217__.size() > 0 && (__var217__ instanceof x10.array.MultiDimRegion || __var217__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var218__ = __var217__.rank(0).low(), __var219__ = __var217__.rank(0).high(); __var218__ <= __var219__; __var218__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var220__ = __var217__.rank(1).low(), __var221__ = __var217__.rank(1).high(); __var220__ <= __var221__; __var220__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var222__ = __var217__.rank(2).low(), __var223__ = __var217__.rank(2).high(); __var222__ <= __var223__; __var222__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i1 = __var218__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var220__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var222__;
                            /* } */
                            /* } */
{
                                
//#line 568
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 569
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var43____ = (__var217__).iterator(); __var43____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var43__ = (x10.
                              lang.
                              point) __var43____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var43__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var43__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var43__).get(2))/* } */;/* } */
{
                                
//#line 568
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 569
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 571
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                                  lang.
                                                                                                                                  point.
                                                                                                                                  factory.
                                                                                                                                  point(
                                                                                                                                  i2,
                                                                                                                                  j2,
                                                                                                                                  k2)))/* } */;
                        }/* } *//* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator o__ = (__var210__).iterator(); o__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point o = (x10.
                          lang.
                          point) o__.next();
                        	/* Join: { *//* Join: { */final int i2 =
                          /* template:array_get { */((o).get(0))/* } */;
final int j2 =
                          /* template:array_get { */((o).get(1))/* } */;
final int k2 =
                          /* template:array_get { */((o).get(2))/* } */;/* } */
{
                            
//#line 566
d =
                              0;
                            
//#line 568
/* template:forloop-mult { */{
                            x10.lang.region __var224__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
                            if (__var224__.size() > 0 && (__var224__ instanceof x10.array.MultiDimRegion || __var224__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var225__ = __var224__.rank(0).low(), __var226__ = __var224__.rank(0).high(); __var225__ <= __var226__; __var225__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var227__ = __var224__.rank(1).low(), __var228__ = __var224__.rank(1).high(); __var227__ <= __var228__; __var227__++)
                            /* } */
                            /* template:forloop-mult-each { */
                            for (int __var229__ = __var224__.rank(2).low(), __var230__ = __var224__.rank(2).high(); __var229__ <= __var230__; __var229__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i1 = __var225__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var227__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var229__;
                            /* } */
                            /* } */
{
                                
//#line 568
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 569
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var43____ = (__var224__).iterator(); __var43____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var43__ = (x10.
                              lang.
                              point) __var43____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var43__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var43__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var43__).get(2))/* } */;/* } */
{
                                
//#line 568
final x10.
                                  lang.
                                  point temp =
                                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                            lang.
                                                                                                                            point.
                                                                                                                            factory.
                                                                                                                            point(
                                                                                                                            i1,
                                                                                                                            j1,
                                                                                                                            k1));
                                
//#line 569
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 571
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(x10.
                                                                                                                                  lang.
                                                                                                                                  point.
                                                                                                                                  factory.
                                                                                                                                  point(
                                                                                                                                  i2,
                                                                                                                                  j2,
                                                                                                                                  k2)))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
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
            		}
            	});/* } */
        }
        	} catch (Throwable tmp187) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp187);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 578
public double
                   MGSolve(
                   final LevelData a_u,
                   final LevelData a_v,
                   final int a_its) {
        
//#line 579
int l =
          m_levels -
          1;
        
//#line 580
/* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                       setLevelData(
                       a_v);
        
//#line 581
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("The init residual norm is " +
                                                                                                                          /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                                                                                                                            norm2());
        
//#line 582
double res =
          0.0;
        
//#line 583
int i =
          0;
        
//#line 584
while (i <
                              a_its) {
            
//#line 585
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Iteration " +
                                                                                                                              i);
            
//#line 586
MG();
            
//#line 587
a_u.
                           add(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(l))/* } */))/* } */);
            
//#line 588
computeResidual3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */,
                           a_v,
                           a_u);
            
//#line 589
res =
              /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                norm2();
            
//#line 590
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("The residual norm is " +
                                                                                                                              res);
            
//#line 591
i++;
        }
        
//#line 593
return res;
    }
    
    
//#line 597
private void
                   MG(
                   ) {
        
//#line 598
int i2 =
          m_levels -
          1;
        
//#line 599
while (i2 >
                              0) {
            
//#line 600
applyOpP3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i2 -
                             1))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i2))/* } */))/* } */,
                           i2);
            
//#line 601
i2--;
        }
        
//#line 603
/* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(0))/* } */))/* } */.
                       set(
                       0);
        
//#line 603
smooth(
                       /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(0))/* } */))/* } */,
                       /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(0))/* } */))/* } */,
                       true);
        
//#line 605
int i3 =
          1;
        
//#line 606
while (i3 <
                              m_levels) {
            
//#line 607
applyOpQ3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3 -
                             1))/* } */))/* } */,
                           i3 -
                             1);
            
//#line 608
computeResidual2(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */);
            
//#line 609
smooth(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i3))/* } */))/* } */,
                           false);
            
//#line 610
i3++;
        }
    }
    
    
//#line 614
private double
                   residualNorm(
                   ) {
        
//#line 615
int l =
          m_levels -
          1;
        
//#line 616
return /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                              norm2();
    }
}
